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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class lilliput
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.lilliput";
  public static final String myFingerPrint = "a609d33d8885933696020b1df3f3fb070da5e9c6a59cb4467f81c3a75386757c";
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 875L)
  public static SubLSymbol $lilliput_master_query_collection$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 980L)
  public static SubLSymbol $lilliput_default_query_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1129L)
  public static SubLSymbol $lilliput_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1197L)
  public static SubLSymbol $lilliput_corpus_generation_query_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1359L)
  private static SubLSymbol $lilliput_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1438L)
  private static SubLSymbol $lilliput_experiment_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1542L)
  private static SubLSymbol $basic_lilliput_query_metrics$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1943L)
  private static SubLSymbol $standard_lilliput_query_metrics$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 2374L)
  private static SubLSymbol $lilliput_query_metrics$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3233L)
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1843L)
  public static SubLObject basic_lilliput_query_metrics()
  {
    return conses_high.copy_list( $basic_lilliput_query_metrics$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 2268L)
  public static SubLObject standard_lilliput_query_metrics()
  {
    return conses_high.copy_list( $standard_lilliput_query_metrics$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 2974L)
  public static SubLObject all_lilliput_query_metrics()
  {
    return $lilliput_query_metrics$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3054L)
  public static SubLObject lilliput_experiment_full_filename(final SubLObject filename, SubLObject directory)
  {
    if( directory == UNPROVIDED )
    {
      directory = $lilliput_experiment_directory$.getGlobalValue();
    }
    return arete.arete_experiment_full_filename( filename, directory );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3450L)
  public static SubLObject run_lilliput_experiment(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      if( NIL == conses_high.member( current_$1, $list10, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw11$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    }
    final SubLObject query_spec_set_tail = cdestructuring_bind.property_list_member( $kw12$QUERY_SPEC_SET, current );
    final SubLObject query_spec_set = ( NIL != query_spec_set_tail ) ? conses_high.cadr( query_spec_set_tail ) : NIL;
    final SubLObject filename_tail = cdestructuring_bind.property_list_member( $kw13$FILENAME, current );
    final SubLObject filename = ( NIL != filename_tail ) ? conses_high.cadr( filename_tail ) : NIL;
    final SubLObject comment_tail = cdestructuring_bind.property_list_member( $kw14$COMMENT, current );
    final SubLObject comment = ( NIL != comment_tail ) ? conses_high.cadr( comment_tail ) : NIL;
    final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member( $kw15$OVERRIDING_QUERY_PROPERTIES, current );
    final SubLObject overriding_query_properties = ( NIL != overriding_query_properties_tail ) ? conses_high.cadr( overriding_query_properties_tail ) : NIL;
    final SubLObject metrics_tail = cdestructuring_bind.property_list_member( $kw16$METRICS, current );
    final SubLObject metrics = ( NIL != metrics_tail ) ? conses_high.cadr( metrics_tail ) : $list17;
    final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member( $kw18$OUTLIER_TIMEOUT, current );
    final SubLObject outlier_timeout = ( NIL != outlier_timeout_tail ) ? conses_high.cadr( outlier_timeout_tail ) : $sym19$_LILLIPUT_OUTLIER_TIMEOUT_;
    final SubLObject incremental_tail = cdestructuring_bind.property_list_member( $kw20$INCREMENTAL, current );
    final SubLObject incremental = ( NIL != incremental_tail ) ? conses_high.cadr( incremental_tail ) : T;
    final SubLObject include_results_tail = cdestructuring_bind.property_list_member( $kw21$INCLUDE_RESULTS, current );
    final SubLObject include_results = ( NIL != include_results_tail ) ? conses_high.cadr( include_results_tail ) : NIL;
    final SubLObject randomize_tail = cdestructuring_bind.property_list_member( $kw22$RANDOMIZE, current );
    final SubLObject randomize = ( NIL != randomize_tail ) ? conses_high.cadr( randomize_tail ) : NIL;
    final SubLObject skip_tail = cdestructuring_bind.property_list_member( $kw23$SKIP, current );
    final SubLObject skip = ( NIL != skip_tail ) ? conses_high.cadr( skip_tail ) : ZERO_INTEGER;
    final SubLObject count_tail = cdestructuring_bind.property_list_member( $kw24$COUNT, current );
    final SubLObject count = ( NIL != count_tail ) ? conses_high.cadr( count_tail ) : NIL;
    final SubLObject directory_tail = cdestructuring_bind.property_list_member( $kw25$DIRECTORY, current );
    final SubLObject directory = ( NIL != directory_tail ) ? conses_high.cadr( directory_tail ) : $lilliput_experiment_directory$.getGlobalValue();
    final SubLObject filename_var = $sym26$FILENAME_VAR;
    final SubLObject full_filename = $sym27$FULL_FILENAME;
    return ConsesLow.list( $sym28$CLET, ConsesLow.list( ConsesLow.list( filename_var, filename ), ConsesLow.list( full_filename, ConsesLow.list( $sym29$FWHEN, filename_var, ConsesLow.list(
        $sym30$LILLIPUT_EXPERIMENT_FULL_FILENAME, filename_var, directory ) ) ) ), ConsesLow.list( new SubLObject[]
        { $sym31$RUN_KBQ_EXPERIMENT, $kw12$QUERY_SPEC_SET, query_spec_set, $kw13$FILENAME, full_filename, $kw14$COMMENT, comment, $kw15$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $kw16$METRICS, metrics,
          $kw18$OUTLIER_TIMEOUT, outlier_timeout, $kw20$INCREMENTAL, incremental, $kw21$INCLUDE_RESULTS, include_results, $kw22$RANDOMIZE, randomize, $kw23$SKIP, skip, $kw24$COUNT, count
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4420L)
  public static SubLObject load_lilliput_experiment(final SubLObject filename)
  {
    final SubLObject full_filename = lilliput_experiment_full_filename( filename, UNPROVIDED );
    return kbq_query_run.kbq_load_query_set_run( full_filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4614L)
  public static SubLObject save_lilliput_experiment(final SubLObject experiment, final SubLObject filename)
  {
    final SubLObject full_filename = lilliput_experiment_full_filename( filename, UNPROVIDED );
    return kbq_query_run.kbq_save_query_set_run( experiment, full_filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4810L)
  public static SubLObject lilliput_open_good_query_set_run(final SubLObject query_set_run)
  {
    return kbq_query_run.kbq_filter_query_set_run_to_query_collection( query_set_run, $const32$LilliputQuery_OpenGood, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5013L)
  public static SubLObject lilliput_open_no_good_query_set_run(final SubLObject query_set_run)
  {
    return kbq_query_run.kbq_filter_query_set_run_to_query_collection( query_set_run, $const33$LilliputQuery_OpenNoGood, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5178L)
  public static SubLObject lilliput_closed_good_query_set_run(final SubLObject query_set_run)
  {
    return kbq_query_run.kbq_filter_query_set_run_to_query_collection( query_set_run, $const34$LilliputQuery_ClosedGood, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5342L)
  public static SubLObject lilliput_closed_no_good_query_set_run(final SubLObject query_set_run)
  {
    return kbq_query_run.kbq_filter_query_set_run_to_query_collection( query_set_run, $const35$LilliputQuery_ClosedNoGood, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5511L)
  public static SubLObject lilliput_open_good_queryP(final SubLObject query)
  {
    return isa.isaP( query, $const32$LilliputQuery_OpenGood, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5608L)
  public static SubLObject lilliput_open_no_good_queryP(final SubLObject query)
  {
    return isa.isaP( query, $const33$LilliputQuery_OpenNoGood, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5710L)
  public static SubLObject lilliput_closed_good_queryP(final SubLObject query)
  {
    return isa.isaP( query, $const34$LilliputQuery_ClosedGood, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5811L)
  public static SubLObject lilliput_closed_no_good_queryP(final SubLObject query)
  {
    return isa.isaP( query, $const35$LilliputQuery_ClosedNoGood, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5917L)
  public static SubLObject analyze_lilliput_experiment(final SubLObject experiment_denoting_symbol, SubLObject corpus, SubLObject display, SubLObject stream)
  {
    if( corpus == UNPROVIDED )
    {
      corpus = $str36$Lilliput_Training;
    }
    if( display == UNPROVIDED )
    {
      display = $str37$_0;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    assert NIL != special_variable_state.bound_symbol_p( experiment_denoting_symbol ) : experiment_denoting_symbol;
    final SubLObject query_set_run = Symbols.symbol_value( experiment_denoting_symbol );
    final SubLObject name = Symbols.symbol_name( experiment_denoting_symbol );
    PrintLow.format( stream, $str39$____Basic_analysis____ );
    list_utilities.pretty_print_plist( kbq_query_run.kbq_analyze_query_set_run( query_set_run, basic_lilliput_query_metrics() ), UNPROVIDED );
    PrintLow.format( stream, $str40$____Answerable____ );
    list_utilities.pretty_print_plist( kbq_query_run.kbq_analyze_query_set_run( kbq_query_run.kbq_answerable_query_set_run( query_set_run ), basic_lilliput_query_metrics() ), UNPROVIDED );
    PrintLow.format( stream, $str41$____Unanswerable____ );
    list_utilities.pretty_print_plist( kbq_query_run.kbq_analyze_query_set_run( kbq_query_run.kbq_unanswerable_query_set_run( query_set_run ), basic_lilliput_query_metrics() ), UNPROVIDED );
    PrintLow.format( stream, $str42$____Open_Good___ );
    list_utilities.pretty_print_plist( kbq_query_run.kbq_analyze_query_set_run( lilliput_open_good_query_set_run( query_set_run ), basic_lilliput_query_metrics() ), UNPROVIDED );
    PrintLow.format( stream, $str43$____Open_No_Good___ );
    list_utilities.pretty_print_plist( kbq_query_run.kbq_analyze_query_set_run( lilliput_open_no_good_query_set_run( query_set_run ), basic_lilliput_query_metrics() ), UNPROVIDED );
    PrintLow.format( stream, $str44$____Closed_Good___ );
    list_utilities.pretty_print_plist( kbq_query_run.kbq_analyze_query_set_run( lilliput_closed_good_query_set_run( query_set_run ), basic_lilliput_query_metrics() ), UNPROVIDED );
    PrintLow.format( stream, $str45$____Closed_No_Good___ );
    list_utilities.pretty_print_plist( kbq_query_run.kbq_analyze_query_set_run( lilliput_closed_no_good_query_set_run( query_set_run ), basic_lilliput_query_metrics() ), UNPROVIDED );
    SubLObject cdolist_list_var = standard_lilliput_query_metrics();
    SubLObject metric = NIL;
    metric = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lilliput_generate_sorted_property_display( query_set_run, name, metric, corpus, display );
      cdolist_list_var = cdolist_list_var.rest();
      metric = cdolist_list_var.first();
    }
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 7973L)
  public static SubLObject lilliput_generate_sorted_property_display(final SubLObject experiment, final SubLObject name, final SubLObject property, SubLObject corpus, SubLObject display)
  {
    if( corpus == UNPROVIDED )
    {
      corpus = $str36$Lilliput_Training;
    }
    if( display == UNPROVIDED )
    {
      display = $str37$_0;
    }
    return plot_generation.kbq_generate_sorted_property_display( experiment, property, $list46, ConsesLow.listS( $kw47$PLOT_TITLE, new SubLObject[] { Sequences.cconcatenate( format_nil.format_nil_a_no_copy( corpus ),
        new SubLObject[]
        { $str48$_, format_nil.format_nil_a_no_copy( name ), $str49$_n, format_nil.format_nil_a_no_copy( property )
        } ), $kw50$XLABEL, $str51$Sorted_Queries, $kw52$YLABEL, leviathan.ylabel_for_property( property ), $list53
    } ), display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 8583L)
  public static SubLObject analyze_lilliput_experiments(final SubLObject baseline_denoting_symbol, final SubLObject experiment_denoting_symbol, SubLObject display_graphsP, SubLObject metrics, SubLObject corpus,
      SubLObject display, SubLObject stream)
  {
    if( display_graphsP == UNPROVIDED )
    {
      display_graphsP = T;
    }
    if( metrics == UNPROVIDED )
    {
      metrics = basic_lilliput_query_metrics();
    }
    if( corpus == UNPROVIDED )
    {
      corpus = $str36$Lilliput_Training;
    }
    if( display == UNPROVIDED )
    {
      display = $str37$_0;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != special_variable_state.bound_symbol_p( baseline_denoting_symbol ) : baseline_denoting_symbol;
    assert NIL != special_variable_state.bound_symbol_p( experiment_denoting_symbol ) : experiment_denoting_symbol;
    final SubLObject baseline = Symbols.symbol_value( baseline_denoting_symbol );
    final SubLObject baseline_name = Symbols.symbol_name( baseline_denoting_symbol );
    final SubLObject experiment = Symbols.symbol_value( experiment_denoting_symbol );
    final SubLObject experiment_name = Symbols.symbol_name( experiment_denoting_symbol );
    final SubLObject open_good_baseline = lilliput_open_good_query_set_run( baseline );
    final SubLObject open_good_experiment = lilliput_open_good_query_set_run( experiment );
    final SubLObject open_no_good_baseline = lilliput_open_no_good_query_set_run( baseline );
    final SubLObject open_no_good_experiment = lilliput_open_no_good_query_set_run( experiment );
    final SubLObject closed_good_baseline = lilliput_closed_good_query_set_run( baseline );
    final SubLObject closed_good_experiment = lilliput_closed_good_query_set_run( experiment );
    final SubLObject closed_no_good_baseline = lilliput_closed_no_good_query_set_run( baseline );
    final SubLObject closed_no_good_experiment = lilliput_closed_no_good_query_set_run( experiment );
    thread.resetMultipleValues();
    final SubLObject mutual_baseline = kbq_query_run.kbq_mutually_answerable_query_set_runs( baseline, experiment );
    final SubLObject mutual_experiment = thread.secondMultipleValue();
    thread.resetMultipleValues();
    PrintLow.format( stream, $str54$____Answerability_analysis____ );
    thread.resetMultipleValues();
    SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts( baseline, experiment );
    SubLObject mutual = thread.secondMultipleValue();
    SubLObject only_2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    PrintLow.format( T, $str55$Total_____________s__s__s__, new SubLObject[] { only_1, mutual, only_2
    } );
    thread.resetMultipleValues();
    only_1 = kbq_query_run.kbq_query_set_run_answerable_counts( open_good_baseline, open_good_experiment );
    mutual = thread.secondMultipleValue();
    only_2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    PrintLow.format( T, $str56$Open_Good_________s__s__s__, new SubLObject[] { only_1, mutual, only_2
    } );
    thread.resetMultipleValues();
    only_1 = kbq_query_run.kbq_query_set_run_answerable_counts( open_no_good_baseline, open_no_good_experiment );
    mutual = thread.secondMultipleValue();
    only_2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    PrintLow.format( T, $str57$Open_No_Good______s__s__s__, new SubLObject[] { only_1, mutual, only_2
    } );
    thread.resetMultipleValues();
    only_1 = kbq_query_run.kbq_query_set_run_answerable_counts( closed_good_baseline, closed_good_experiment );
    mutual = thread.secondMultipleValue();
    only_2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    PrintLow.format( T, $str58$Closed_Good_______s__s__s__, new SubLObject[] { only_1, mutual, only_2
    } );
    thread.resetMultipleValues();
    only_1 = kbq_query_run.kbq_query_set_run_answerable_counts( closed_no_good_baseline, closed_no_good_experiment );
    mutual = thread.secondMultipleValue();
    only_2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    PrintLow.format( T, $str59$Closed_No_Good____s__s__s__, new SubLObject[] { only_1, mutual, only_2
    } );
    PrintLow.format( stream, $str39$____Basic_analysis____ );
    kbq_query_run.kbq_print_analysis( kbq_query_run.kbq_analyze_query_set_runs( baseline, experiment, metrics ) );
    PrintLow.format( stream, $str60$____Mutually_Answerable____ );
    kbq_query_run.kbq_print_analysis( kbq_query_run.kbq_analyze_query_set_runs( mutual_baseline, mutual_experiment, metrics ) );
    PrintLow.format( stream, $str61$____Mutually_Answerable_Open_Good );
    kbq_query_run.kbq_print_analysis( kbq_query_run.kbq_analyze_query_set_runs( lilliput_open_good_query_set_run( mutual_baseline ), lilliput_open_good_query_set_run( mutual_experiment ), metrics ) );
    PrintLow.format( stream, $str62$____Mutually_Answerable_Closed_Go );
    kbq_query_run.kbq_print_analysis( kbq_query_run.kbq_analyze_query_set_runs( lilliput_closed_good_query_set_run( mutual_baseline ), lilliput_closed_good_query_set_run( mutual_experiment ), metrics ) );
    PrintLow.format( stream, $str40$____Answerable____ );
    kbq_query_run.kbq_print_analysis( kbq_query_run.kbq_analyze_query_set_runs( kbq_query_run.kbq_answerable_query_set_run( baseline ), kbq_query_run.kbq_answerable_query_set_run( experiment ), metrics ) );
    PrintLow.format( stream, $str41$____Unanswerable____ );
    kbq_query_run.kbq_print_analysis( kbq_query_run.kbq_analyze_query_set_runs( kbq_query_run.kbq_unanswerable_query_set_run( baseline ), kbq_query_run.kbq_unanswerable_query_set_run( experiment ), metrics ) );
    PrintLow.format( stream, $str63$____Open_Good____ );
    kbq_query_run.kbq_print_analysis( kbq_query_run.kbq_analyze_query_set_runs( open_good_baseline, open_good_experiment, metrics ) );
    PrintLow.format( stream, $str64$____Open_No_Good____ );
    kbq_query_run.kbq_print_analysis( kbq_query_run.kbq_analyze_query_set_runs( open_no_good_baseline, open_no_good_experiment, metrics ) );
    PrintLow.format( stream, $str65$____Closed_Good____ );
    kbq_query_run.kbq_print_analysis( kbq_query_run.kbq_analyze_query_set_runs( closed_good_baseline, closed_good_experiment, metrics ) );
    PrintLow.format( stream, $str66$____Closed_No_Good____ );
    kbq_query_run.kbq_print_analysis( kbq_query_run.kbq_analyze_query_set_runs( closed_no_good_baseline, closed_no_good_experiment, metrics ) );
    if( NIL != display_graphsP )
    {
      SubLObject cdolist_list_var = $list68;
      SubLObject metric = NIL;
      metric = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$2 = $list67;
        SubLObject sort_by = NIL;
        sort_by = cdolist_list_var_$2.first();
        while ( NIL != cdolist_list_var_$2)
        {
          lilliput_generate_sorted_property_comparison( baseline, experiment, baseline_name, experiment_name, metric, sort_by, corpus, display );
          cdolist_list_var_$2 = cdolist_list_var_$2.rest();
          sort_by = cdolist_list_var_$2.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        metric = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 13468L)
  public static SubLObject lilliput_generate_sorted_property_comparison(final SubLObject baseline, final SubLObject experiment, final SubLObject baseline_name, final SubLObject experiment_name, final SubLObject property,
      SubLObject sort_by, SubLObject corpus, SubLObject display)
  {
    if( sort_by == UNPROVIDED )
    {
      sort_by = $kw69$BOTH;
    }
    if( corpus == UNPROVIDED )
    {
      corpus = $str36$Lilliput_Training;
    }
    if( display == UNPROVIDED )
    {
      display = $str37$_0;
    }
    return plot_generation.kbq_generate_sorted_property_comparison( baseline, experiment, property, ConsesLow.listS( $kw47$PLOT_TITLE, new SubLObject[] { Sequences.cconcatenate( format_nil.format_nil_a_no_copy( corpus ),
        new SubLObject[]
        { $str70$__, format_nil.format_nil_a_no_copy( baseline_name ), $str71$_vs__, format_nil.format_nil_a_no_copy( experiment_name ), $str49$_n, format_nil.format_nil_a_no_copy( property )
        } ), $kw50$XLABEL, $str51$Sorted_Queries, $kw52$YLABEL, leviathan.ylabel_for_property( property ), $kw72$BASELINE_KEY_LABEL, baseline_name, $kw73$EXPERIMENT_KEY_LABEL, experiment_name, $list74
    } ), sort_by, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 14059L)
  public static SubLObject kbq_hybridize_n_query_set_runs(final SubLObject query_set_runs, SubLObject compare_func, SubLObject comment, SubLObject tag)
  {
    if( compare_func == UNPROVIDED )
    {
      compare_func = $sym75$KBQ_MEDIAN_QUERY_RUN;
    }
    if( comment == UNPROVIDED )
    {
      comment = $str76$;
    }
    if( tag == UNPROVIDED )
    {
      tag = $kw77$ORIGIN;
    }
    final SubLObject tagged_query_set_runs = arete.kbq_tag_query_set_runs( query_set_runs, tag );
    SubLObject hybrid_query_runs = NIL;
    SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_queries( tagged_query_set_runs.first() );
    SubLObject query = NIL;
    query = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject query_runs = kbq_query_run.kbq_lookup_query_runs( tagged_query_set_runs, query );
      final SubLObject best_query_run = Functions.funcall( compare_func, query_runs );
      hybrid_query_runs = ConsesLow.cons( best_query_run, hybrid_query_runs );
      cdolist_list_var = cdolist_list_var.rest();
      query = cdolist_list_var.first();
    }
    SubLObject hybrid_query_set_run = conses_high.copy_list( tagged_query_set_runs.first() );
    hybrid_query_runs = Sequences.nreverse( hybrid_query_runs );
    hybrid_query_set_run = conses_high.putf( hybrid_query_set_run, $kw78$QUERY_RUNS, hybrid_query_runs );
    hybrid_query_set_run = conses_high.putf( hybrid_query_set_run, $kw14$COMMENT, comment );
    return hybrid_query_set_run;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 15059L)
  public static SubLObject kbq_median_query_run(final SubLObject query_runs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Numbers.oddp( Sequences.length( query_runs ) ) )
    {
      Errors.error( $str79$Cannot_handle_even_numbers_of_que );
    }
    return number_utilities.median( query_runs, $sym80$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME, $kw81$ITEM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 15259L)
  public static SubLObject generate_lilliput_corpus(final SubLObject n, final SubLObject trainingP, SubLObject start)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject open_good = lilliput_generate_query_sentences( n, UNPROVIDED );
    final SubLObject open_no_good = thread.secondMultipleValue();
    final SubLObject closed_good = thread.thirdMultipleValue();
    final SubLObject closed_no_good = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return Numbers.add( new SubLObject[] { lilliput_reify_queries( open_good, $const32$LilliputQuery_OpenGood, trainingP, start ), lilliput_reify_queries( open_no_good, $const33$LilliputQuery_OpenNoGood, trainingP,
        start ), lilliput_reify_queries( closed_good, $const34$LilliputQuery_ClosedGood, trainingP, start ), lilliput_reify_queries( closed_no_good, $const35$LilliputQuery_ClosedNoGood, trainingP, start )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 16244L)
  public static SubLObject lilliput_valid_terms_for_all_test_queries()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject cdolist_list_var = lilliput_caches.all_valid_lilliput_queries();
    SubLObject query = NIL;
    query = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject argnum;
      SubLObject mt_var;
      SubLObject _prev_bind_0;
      SubLObject _prev_bind_2;
      SubLObject _prev_bind_3;
      SubLObject terms;
      for( argnum = NIL, argnum = ZERO_INTEGER; argnum.numL( FOUR_INTEGER ); argnum = Numbers.add( argnum, ONE_INTEGER ) )
      {
        mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $lilliput_mt$.getGlobalValue() );
        _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          terms = lilliput_valid_terms_for_query_argnum( query, argnum );
          result = ConsesLow.nconc( terms, result );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      query = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 16649L)
  public static SubLObject lilliput_instantiate_all_queries_once()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject cdolist_list_var = lilliput_caches.all_valid_lilliput_queries();
    SubLObject query = NIL;
    query = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $lilliput_mt$.getGlobalValue() );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject open_query = lilliput_partially_instantiate_query( query );
        result = ConsesLow.cons( open_query, result );
        final SubLObject var;
        final SubLObject closed_query = var = lilliput_fully_instantiate_query( query );
        if( NIL != var )
        {
          result = ConsesLow.cons( var, result );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      query = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 17068L)
  public static SubLObject lilliput_generate_query_sentences(final SubLObject n, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    SubLObject open_good = NIL;
    SubLObject open_no_good = NIL;
    SubLObject closed_good = NIL;
    SubLObject closed_no_good = NIL;
    while ( NIL != list_utilities.lengthL( open_good, n, UNPROVIDED ) || NIL != list_utilities.lengthL( open_no_good, n, UNPROVIDED ) || NIL != list_utilities.lengthL( closed_good, n, UNPROVIDED )
        || NIL != list_utilities.lengthL( closed_no_good, n, UNPROVIDED ))
    {
      final SubLObject sentence = ( NIL != number_utilities.true_with_probability( $float82$0_5 ) ) ? lilliput_partially_instantiate_random_query() : lilliput_fully_instantiate_random_query();
      if( NIL != sentence )
      {
        final SubLObject openP = makeBoolean( NIL == el_utilities.closedP( sentence, UNPROVIDED ) );
        final SubLObject goodP = list_utilities.sublisp_boolean( lilliput_cyc_query( sentence ) );
        if( NIL != openP )
        {
          if( NIL != goodP )
          {
            if( NIL != verboseP )
            {
              PrintLow.format( T, $str83$o );
              streams_high.force_output( UNPROVIDED );
            }
            open_good = ConsesLow.cons( sentence, open_good );
          }
          else
          {
            if( NIL != verboseP )
            {
              PrintLow.format( T, $str84$_ );
              streams_high.force_output( UNPROVIDED );
            }
            open_no_good = ConsesLow.cons( sentence, open_no_good );
          }
        }
        else if( NIL != goodP )
        {
          if( NIL != verboseP )
          {
            PrintLow.format( T, $str85$_ );
            streams_high.force_output( UNPROVIDED );
          }
          closed_good = ConsesLow.cons( sentence, closed_good );
        }
        else
        {
          if( NIL != verboseP )
          {
            PrintLow.format( T, $str86$x );
            streams_high.force_output( UNPROVIDED );
          }
          closed_no_good = ConsesLow.cons( sentence, closed_no_good );
        }
      }
    }
    open_good = list_utilities.first_n( n, open_good );
    open_no_good = list_utilities.first_n( n, open_no_good );
    closed_good = list_utilities.first_n( n, closed_good );
    closed_no_good = list_utilities.first_n( n, closed_no_good );
    return Values.values( open_good, open_no_good, closed_good, closed_no_good );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 18421L)
  public static SubLObject lilliput_partially_instantiate_random_query()
  {
    return lilliput_partially_instantiate_query( lilliput_random_query() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 18559L)
  public static SubLObject lilliput_partially_instantiate_query(final SubLObject query)
  {
    final SubLObject instantiable_argnums = lilliput_instantiable_argnums( query );
    final SubLObject chosen_argnum = list_utilities.random_element( instantiable_argnums );
    return lilliput_wff_instantiate_query_argnums( query, ConsesLow.list( chosen_argnum ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 18828L)
  public static SubLObject lilliput_fully_instantiate_random_query()
  {
    return lilliput_fully_instantiate_query( lilliput_random_query() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 18958L)
  public static SubLObject lilliput_fully_instantiate_query(final SubLObject query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject instantiable_argnums = lilliput_instantiable_argnums( query );
    final SubLObject some_arg_left_openP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == some_arg_left_openP )
    {
      return lilliput_wff_instantiate_query_argnums( query, instantiable_argnums );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 19243L)
  public static SubLObject lilliput_instantiable_argnums(final SubLObject query)
  {
    SubLObject argnums = NIL;
    SubLObject some_arg_left_openP = NIL;
    final SubLObject sentence = kb_query.kbq_sentence( query );
    final SubLObject query_type = lilliput_query_type( query );
    SubLObject cdolist_list_var = cycl_utilities.variable_argnums( sentence, Symbols.symbol_function( $sym87$EL_VAR_ ) );
    SubLObject argnum = NIL;
    argnum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != lilliput_leave_arg_place_openP( query_type, argnum ) )
      {
        some_arg_left_openP = T;
      }
      else
      {
        argnums = ConsesLow.cons( argnum, argnums );
      }
      cdolist_list_var = cdolist_list_var.rest();
      argnum = cdolist_list_var.first();
    }
    return Values.values( argnums, some_arg_left_openP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 19829L)
  public static SubLObject lilliput_wff_instantiate_query_argnums(final SubLObject query, final SubLObject argnums)
  {
    SubLObject sentence;
    for( sentence = NIL; NIL == sentence || NIL == wff.el_wffP( sentence, $lilliput_mt$.getGlobalValue(), UNPROVIDED ); sentence = lilliput_instantiate_query_argnums( query, argnums ) )
    {
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 20079L)
  public static SubLObject lilliput_instantiate_query_argnums(final SubLObject query, final SubLObject argnums)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sentence = kb_query.kbq_sentence( query );
    SubLObject cdolist_list_var = argnums;
    SubLObject argnum = NIL;
    argnum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject valid_terms = lilliput_valid_terms_for_query_argnum( query, argnum );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == valid_terms )
      {
        Errors.error( $str88$could_not_find_any_valid_terms_fo, argnum, query );
      }
      final SubLObject chosen_term = num_index_weighted_instantiation( valid_terms );
      sentence = el_utilities.replace_formula_arg( argnum, chosen_term, sentence );
      cdolist_list_var = cdolist_list_var.rest();
      argnum = cdolist_list_var.first();
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 20694L)
  public static SubLObject lilliput_valid_terms_for_query_argnum(final SubLObject query, final SubLObject argnum)
  {
    final SubLObject query_type = lilliput_query_type( query );
    if( NIL != list_utilities.member_eqP( query_type, $lilliput_default_query_collections$.getGlobalValue() ) )
    {
      return lilliput_valid_terms_for_default_query( query, argnum );
    }
    if( query_type.eql( $lilliput_master_query_collection$.getGlobalValue() ) )
    {
      return Errors.error( $str89$got_an_unsorted_query__s, query );
    }
    return lilliput_valid_terms_for_argnum( query_type, argnum );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 21137L)
  public static SubLObject lilliput_valid_terms_for_default_query(final SubLObject query, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sentence = kb_query.kbq_sentence( query );
    assert NIL != cycl_grammar.cycl_atomic_sentence_p( sentence ) : sentence;
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( sentence );
    final SubLObject arg_isas = genls.min_cols( kb_accessors.argn_isa( pred, argnum, $lilliput_mt$.getGlobalValue() ), $lilliput_mt$.getGlobalValue(), UNPROVIDED );
    if( NIL != arg_isas )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( arg_isas ) )
      {
        Errors.error( $str91$Expected_only_one_arg_constraint_, arg_isas );
      }
      final SubLObject col = arg_isas.first();
      return lilliput_caches.lilliput_all_instances( col );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 21623L)
  public static SubLObject lilliput_valid_terms_for_argnum(final SubLObject query_type, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $lilliput_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject domain = kb_mapping_utilities.pred_arg_values( query_type, $const92$correspondingDomainInArg, argnum, ONE_INTEGER, THREE_INTEGER, TWO_INTEGER, UNPROVIDED, UNPROVIDED ).first();
      if( NIL != domain )
      {
        if( NIL != nart_handles.nart_p( domain ) && $const93$CollectionSubsetFn.eql( cycl_utilities.nat_functor( domain ) ) )
        {
          thread.resetMultipleValues();
          final SubLObject v_bindings = unification.unify( cycl_utilities.nat_arg2( domain, UNPROVIDED ), $list94, UNPROVIDED, UNPROVIDED );
          final SubLObject justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_bindings )
          {
            Errors.error( $str95$unhandled___CollectionSubsetFn_do );
          }
          final SubLObject collection = cycl_utilities.nat_arg1( domain, UNPROVIDED );
          result = conses_high.copy_list( lilliput_caches.lilliput_all_instances_if_tkb_fort( collection ) );
        }
        else if( NIL != fort_types_interface.collection_p( domain ) )
        {
          result = conses_high.copy_list( lilliput_caches.lilliput_all_instances( domain ) );
        }
        else
        {
          Errors.error( $str96$unexpected_domain_type__s, domain );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 22493L)
  public static SubLObject num_index_weighted_instantiation(final SubLObject fort_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject vector = num_index_weighted_vector( fort_list );
    final SubLObject max_weight = conses_high.second( Vectors.aref( vector, number_utilities.f_1_( Sequences.length( vector ) ) ) );
    final SubLObject random_weight = random.random( max_weight );
    thread.resetMultipleValues();
    final SubLObject lower_bound = vector_utilities.binary_search_vector_range( random_weight, vector, Symbols.symbol_function( $sym97$_ ), Symbols.symbol_function( $sym98$_ ), Symbols.symbol_function( $sym99$SECOND ),
        UNPROVIDED );
    final SubLObject upper_bound = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject chosen_fort = Vectors.aref( vector, lower_bound ).first();
    return chosen_fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 22962L)
  public static SubLObject num_index_weighted_vector(final SubLObject fort_list)
  {
    final SubLObject vector = Vectors.make_vector( Sequences.length( fort_list ), UNPROVIDED );
    SubLObject count = ZERO_INTEGER;
    SubLObject list_var = NIL;
    SubLObject fort = NIL;
    SubLObject i = NIL;
    list_var = fort_list;
    fort = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), fort = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      count = Numbers.add( count, kb_indexing.num_index( fort ) );
      Vectors.set_aref( vector, i, ConsesLow.list( fort, count ) );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 23244L)
  public static SubLObject lilliput_reify_queries(final SubLObject sentences, final SubLObject col, final SubLObject trainingP, final SubLObject start)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject list_var = NIL;
    SubLObject sentence = NIL;
    SubLObject i = NIL;
    list_var = sentences;
    sentence = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), sentence = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( NIL != lilliput_reify_query( sentence, col, trainingP, Numbers.add( start, i ) ) )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 23592L)
  public static SubLObject lilliput_reify_query(final SubLObject sentence, final SubLObject col, final SubLObject trainingP, final SubLObject n)
  {
    final SubLObject const_name = Sequences.cconcatenate( constants_high.constant_name( col ), new SubLObject[] { $str100$_, string_utilities.str( n )
    } );
    final SubLObject query_const = ke.ke_create_now( const_name, UNPROVIDED );
    return makeBoolean( NIL != ke.ke_assert_now( ConsesLow.list( $const101$isa, query_const, col ), $const102$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED ) && NIL != ke.ke_assert_now( kb_query
        .kbq_assertible_query_spec_sentence( sentence, query_const ), $const103$TestVocabularyMt, UNPROVIDED, UNPROVIDED ) && NIL != ( ( NIL != trainingP ) ? ke.ke_assert_now( ConsesLow.listS( $const101$isa, query_const,
            $list104 ), $const102$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED )
            : ke.ke_assert_now( ConsesLow.listS( $const101$isa, query_const, $list105 ), $const102$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 24302L)
  public static SubLObject lilliput_query_type(final SubLObject query)
  {
    return ask_utilities.query_variable( $sym106$_COL, ConsesLow.list( $const107$and, ConsesLow.listS( $const108$nearestIsa, query, $list109 ), ConsesLow.list( $const110$genls, $sym106$_COL,
        $lilliput_master_query_collection$.getGlobalValue() ) ), $lilliput_mt$.getGlobalValue(), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 25394L)
  public static SubLObject lilliput_random_query()
  {
    return list_utilities.random_element( lilliput_caches.all_valid_lilliput_queries() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 25491L)
  public static SubLObject lilliput_leave_arg_place_openP(final SubLObject query_type, final SubLObject argnum)
  {
    return kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const111$leaveArgPlaceOpenInTestQueries, query_type, argnum, $lilliput_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 25666L)
  public static SubLObject tkb_fortP(final SubLObject v_object)
  {
    if( NIL == forts.fort_p( v_object ) )
    {
      return NIL;
    }
    if( NIL != constant_handles.constant_p( v_object ) )
    {
      return isa.quoted_isaP( v_object, $const112$TKBConstant, $const113$BookkeepingMt, UNPROVIDED );
    }
    return makeBoolean( NIL == list_utilities.tree_find_if( $sym114$NON_TKB_FORT_, narts_high.nart_el_formula( v_object ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 25888L)
  public static SubLObject non_tkb_fortP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL == tkb_fortP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 25992L)
  public static SubLObject lilliput_cyc_query(final SubLObject sentence)
  {
    return inference_kernel.new_cyc_query( sentence, $lilliput_mt$.getGlobalValue(), $lilliput_corpus_generation_query_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 26133L)
  public static SubLObject lilliput_generate_query_sentence_of_type(final SubLObject type)
  {
    SubLObject generate_goodP = NIL;
    SubLObject generate_openP = NIL;
    if( type.eql( $const32$LilliputQuery_OpenGood ) )
    {
      generate_openP = T;
      generate_goodP = T;
    }
    else if( type.eql( $const33$LilliputQuery_OpenNoGood ) )
    {
      generate_openP = T;
      generate_goodP = NIL;
    }
    else if( type.eql( $const34$LilliputQuery_ClosedGood ) )
    {
      generate_openP = NIL;
      generate_goodP = T;
    }
    else if( type.eql( $const35$LilliputQuery_ClosedNoGood ) )
    {
      generate_openP = NIL;
      generate_goodP = NIL;
    }
    return lilliput_generate_query_sentence_with_properties( generate_openP, generate_goodP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 26755L)
  public static SubLObject lilliput_generate_query_sentence_with_properties(final SubLObject generate_openP, final SubLObject generate_goodP)
  {
    SubLObject sentence = NIL;
    SubLObject goodP = NIL;
    while ( NIL == sentence || !generate_goodP.eql( goodP ))
    {
      if( NIL != generate_openP )
      {
        sentence = lilliput_generate_open_sentence( UNPROVIDED );
      }
      else
      {
        sentence = lilliput_generate_closed_sentence( UNPROVIDED );
      }
      goodP = list_utilities.sublisp_boolean( lilliput_cyc_query( sentence ) );
      if( NIL != goodP )
      {
        PrintLow.format( T, $str115$g__ );
        streams_high.force_output( UNPROVIDED );
      }
      else
      {
        PrintLow.format( T, $str116$n__ );
        streams_high.force_output( UNPROVIDED );
      }
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 27276L)
  public static SubLObject lilliput_generate_closed_sentence(SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    SubLObject sentence = NIL;
    SubLObject closedP = NIL;
    while ( NIL == sentence || NIL == closedP)
    {
      sentence = lilliput_fully_instantiate_random_query();
      closedP = el_utilities.closedP( sentence, UNPROVIDED );
      if( NIL != verboseP )
      {
        if( NIL != closedP )
        {
          format_nil.force_format( T, $str117$c, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          format_nil.force_format( T, $str83$o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 27652L)
  public static SubLObject lilliput_generate_open_sentence(SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    SubLObject sentence = NIL;
    SubLObject closedP = NIL;
    while ( NIL == sentence || NIL != closedP)
    {
      sentence = lilliput_partially_instantiate_random_query();
      closedP = el_utilities.closedP( sentence, UNPROVIDED );
      if( NIL != verboseP )
      {
        if( NIL != closedP )
        {
          format_nil.force_format( T, $str117$c, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          format_nil.force_format( T, $str83$o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 28023L)
  public static SubLObject correct_training_query(final SubLObject query)
  {
    final SubLObject sentence = ask_utilities.query_variable( $sym118$_ASS, ConsesLow.list( $const119$assertionSentence, $sym118$_ASS, ConsesLow.list( $const120$softwareParameterValueInSpecifica,
        $const121$InferenceSentenceParameter, $sym122$_QUERY, query ) ), $const103$TestVocabularyMt, UNPROVIDED ).first();
    final SubLObject query_type = ask_utilities.query_variable( $sym123$_TYPE, ConsesLow.listS( $const107$and, ConsesLow.listS( $const108$nearestIsa, query, $list124 ), $list125 ), UNPROVIDED, UNPROVIDED ).first();
    SubLObject correct_sentence = NIL;
    if( NIL != sentence )
    {
      ke.ke_unassert_now( sentence, $const103$TestVocabularyMt );
    }
    correct_sentence = lilliput_generate_query_sentence_of_type( query_type );
    ke.ke_assert_now( kb_query.kbq_assertible_query_spec_sentence( correct_sentence, query ), $const103$TestVocabularyMt, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  public static SubLObject declare_lilliput_file()
  {
    SubLFiles.declareFunction( me, "basic_lilliput_query_metrics", "BASIC-LILLIPUT-QUERY-METRICS", 0, 0, false );
    SubLFiles.declareFunction( me, "standard_lilliput_query_metrics", "STANDARD-LILLIPUT-QUERY-METRICS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_lilliput_query_metrics", "ALL-LILLIPUT-QUERY-METRICS", 0, 0, false );
    SubLFiles.declareFunction( me, "lilliput_experiment_full_filename", "LILLIPUT-EXPERIMENT-FULL-FILENAME", 1, 1, false );
    SubLFiles.declareMacro( me, "run_lilliput_experiment", "RUN-LILLIPUT-EXPERIMENT" );
    SubLFiles.declareFunction( me, "load_lilliput_experiment", "LOAD-LILLIPUT-EXPERIMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "save_lilliput_experiment", "SAVE-LILLIPUT-EXPERIMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "lilliput_open_good_query_set_run", "LILLIPUT-OPEN-GOOD-QUERY-SET-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_open_no_good_query_set_run", "LILLIPUT-OPEN-NO-GOOD-QUERY-SET-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_closed_good_query_set_run", "LILLIPUT-CLOSED-GOOD-QUERY-SET-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_closed_no_good_query_set_run", "LILLIPUT-CLOSED-NO-GOOD-QUERY-SET-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_open_good_queryP", "LILLIPUT-OPEN-GOOD-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_open_no_good_queryP", "LILLIPUT-OPEN-NO-GOOD-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_closed_good_queryP", "LILLIPUT-CLOSED-GOOD-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_closed_no_good_queryP", "LILLIPUT-CLOSED-NO-GOOD-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "analyze_lilliput_experiment", "ANALYZE-LILLIPUT-EXPERIMENT", 1, 3, false );
    SubLFiles.declareFunction( me, "lilliput_generate_sorted_property_display", "LILLIPUT-GENERATE-SORTED-PROPERTY-DISPLAY", 3, 2, false );
    SubLFiles.declareFunction( me, "analyze_lilliput_experiments", "ANALYZE-LILLIPUT-EXPERIMENTS", 2, 5, false );
    SubLFiles.declareFunction( me, "lilliput_generate_sorted_property_comparison", "LILLIPUT-GENERATE-SORTED-PROPERTY-COMPARISON", 5, 3, false );
    SubLFiles.declareFunction( me, "kbq_hybridize_n_query_set_runs", "KBQ-HYBRIDIZE-N-QUERY-SET-RUNS", 1, 3, false );
    SubLFiles.declareFunction( me, "kbq_median_query_run", "KBQ-MEDIAN-QUERY-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_lilliput_corpus", "GENERATE-LILLIPUT-CORPUS", 2, 1, false );
    SubLFiles.declareFunction( me, "lilliput_valid_terms_for_all_test_queries", "LILLIPUT-VALID-TERMS-FOR-ALL-TEST-QUERIES", 0, 0, false );
    SubLFiles.declareFunction( me, "lilliput_instantiate_all_queries_once", "LILLIPUT-INSTANTIATE-ALL-QUERIES-ONCE", 0, 0, false );
    SubLFiles.declareFunction( me, "lilliput_generate_query_sentences", "LILLIPUT-GENERATE-QUERY-SENTENCES", 1, 1, false );
    SubLFiles.declareFunction( me, "lilliput_partially_instantiate_random_query", "LILLIPUT-PARTIALLY-INSTANTIATE-RANDOM-QUERY", 0, 0, false );
    SubLFiles.declareFunction( me, "lilliput_partially_instantiate_query", "LILLIPUT-PARTIALLY-INSTANTIATE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_fully_instantiate_random_query", "LILLIPUT-FULLY-INSTANTIATE-RANDOM-QUERY", 0, 0, false );
    SubLFiles.declareFunction( me, "lilliput_fully_instantiate_query", "LILLIPUT-FULLY-INSTANTIATE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_instantiable_argnums", "LILLIPUT-INSTANTIABLE-ARGNUMS", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_wff_instantiate_query_argnums", "LILLIPUT-WFF-INSTANTIATE-QUERY-ARGNUMS", 2, 0, false );
    SubLFiles.declareFunction( me, "lilliput_instantiate_query_argnums", "LILLIPUT-INSTANTIATE-QUERY-ARGNUMS", 2, 0, false );
    SubLFiles.declareFunction( me, "lilliput_valid_terms_for_query_argnum", "LILLIPUT-VALID-TERMS-FOR-QUERY-ARGNUM", 2, 0, false );
    SubLFiles.declareFunction( me, "lilliput_valid_terms_for_default_query", "LILLIPUT-VALID-TERMS-FOR-DEFAULT-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "lilliput_valid_terms_for_argnum", "LILLIPUT-VALID-TERMS-FOR-ARGNUM", 2, 0, false );
    SubLFiles.declareFunction( me, "num_index_weighted_instantiation", "NUM-INDEX-WEIGHTED-INSTANTIATION", 1, 0, false );
    SubLFiles.declareFunction( me, "num_index_weighted_vector", "NUM-INDEX-WEIGHTED-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_reify_queries", "LILLIPUT-REIFY-QUERIES", 4, 0, false );
    SubLFiles.declareFunction( me, "lilliput_reify_query", "LILLIPUT-REIFY-QUERY", 4, 0, false );
    SubLFiles.declareFunction( me, "lilliput_query_type", "LILLIPUT-QUERY-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_random_query", "LILLIPUT-RANDOM-QUERY", 0, 0, false );
    SubLFiles.declareFunction( me, "lilliput_leave_arg_place_openP", "LILLIPUT-LEAVE-ARG-PLACE-OPEN?", 2, 0, false );
    SubLFiles.declareFunction( me, "tkb_fortP", "TKB-FORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_tkb_fortP", "NON-TKB-FORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_cyc_query", "LILLIPUT-CYC-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_generate_query_sentence_of_type", "LILLIPUT-GENERATE-QUERY-SENTENCE-OF-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "lilliput_generate_query_sentence_with_properties", "LILLIPUT-GENERATE-QUERY-SENTENCE-WITH-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "lilliput_generate_closed_sentence", "LILLIPUT-GENERATE-CLOSED-SENTENCE", 0, 1, false );
    SubLFiles.declareFunction( me, "lilliput_generate_open_sentence", "LILLIPUT-GENERATE-OPEN-SENTENCE", 0, 1, false );
    SubLFiles.declareFunction( me, "correct_training_query", "CORRECT-TRAINING-QUERY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_lilliput_file()
  {
    $lilliput_master_query_collection$ = SubLFiles.deflexical( "*LILLIPUT-MASTER-QUERY-COLLECTION*", $const0$AKBBuilderQuery_InferenceTest );
    $lilliput_default_query_collections$ = SubLFiles.deflexical( "*LILLIPUT-DEFAULT-QUERY-COLLECTIONS*", $list1 );
    $lilliput_mt$ = SubLFiles.deflexical( "*LILLIPUT-MT*", $const2$TKBSourceSpindleCollectorMt );
    $lilliput_corpus_generation_query_properties$ = SubLFiles.deflexical( "*LILLIPUT-CORPUS-GENERATION-QUERY-PROPERTIES*", $list3 );
    $lilliput_directory$ = SubLFiles.deflexical( "*LILLIPUT-DIRECTORY*", $str4$_cyc_projects_inference_lilliput_ );
    $lilliput_experiment_directory$ = SubLFiles.deflexical( "*LILLIPUT-EXPERIMENT-DIRECTORY*", Sequences.cconcatenate( $lilliput_directory$.getGlobalValue(), $str5$experiments_ ) );
    $basic_lilliput_query_metrics$ = SubLFiles.deflexical( "*BASIC-LILLIPUT-QUERY-METRICS*", $list6 );
    $standard_lilliput_query_metrics$ = SubLFiles.deflexical( "*STANDARD-LILLIPUT-QUERY-METRICS*", $list6 );
    $lilliput_query_metrics$ = SubLFiles.deflexical( "*LILLIPUT-QUERY-METRICS*", $list7 );
    $lilliput_outlier_timeout$ = SubLFiles.deflexical( "*LILLIPUT-OUTLIER-TIMEOUT*", $int8$60 );
    return NIL;
  }

  public static SubLObject setup_lilliput_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lilliput_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lilliput_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lilliput_file();
  }
  static
  {
    me = new lilliput();
    $lilliput_master_query_collection$ = null;
    $lilliput_default_query_collections$ = null;
    $lilliput_mt$ = null;
    $lilliput_corpus_generation_query_properties$ = null;
    $lilliput_directory$ = null;
    $lilliput_experiment_directory$ = null;
    $basic_lilliput_query_metrics$ = null;
    $standard_lilliput_query_metrics$ = null;
    $lilliput_query_metrics$ = null;
    $lilliput_outlier_timeout$ = null;
    $const0$AKBBuilderQuery_InferenceTest = constant_handles.reader_make_constant_shell( makeString( "AKBBuilderQuery-InferenceTest" ) );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AKBBuilderQuery-InferenceTest-Default" ) ), constant_handles.reader_make_constant_shell( makeString(
        "AKBBuilderQuery-InferenceTest-LeaveOpenArg2" ) ) );
    $const2$TKBSourceSpindleCollectorMt = constant_handles.reader_make_constant_shell( makeString( "TKBSourceSpindleCollectorMt" ) );
    $list3 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "TRANSFORMATION-ALLOWED?" ), NIL, makeKeyword( "CONTINUABLE?" ), NIL, makeKeyword( "NEW-TERMS-ALLOWED?" ), NIL );
    $str4$_cyc_projects_inference_lilliput_ = makeString( "/cyc/projects/inference/lilliput/" );
    $str5$experiments_ = makeString( "experiments/" );
    $list6 = ConsesLow.list( makeKeyword( "ANSWER-COUNT" ), makeKeyword( "COMPLETE-TIME-TO-FIRST-ANSWER" ), makeKeyword( "COMPLETE-TIME-PER-ANSWER" ), makeKeyword( "ANSWERABILITY-TIME" ), makeKeyword(
        "COMPLETE-TOTAL-TIME" ) );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "ANSWER-COUNT" ), makeKeyword( "TIME-TO-FIRST-ANSWER" ), makeKeyword( "COMPLETE-TIME-TO-FIRST-ANSWER" ), makeKeyword( "TOTAL-TIME" ), makeKeyword(
        "COMPLETE-TOTAL-TIME" ), makeKeyword( "TIME-PER-ANSWER" ), makeKeyword( "COMPLETE-TIME-PER-ANSWER" ), makeKeyword( "WASTED-TIME-AFTER-LAST-ANSWER" ), makeKeyword( "LATENCY-IMPROVEMENT-FROM-ITERATIVITY" ),
      makeKeyword( "ANSWER-TIMES" ), makeKeyword( "TACTIC-COUNT" ), makeKeyword( "POSSIBLE-TACTIC-COUNT" ), makeKeyword( "EXECUTED-TACTIC-COUNT" ), makeKeyword( "DISCARDED-TACTIC-COUNT" )
    } );
    $int8$60 = makeInteger( 60 );
    $list9 = ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "QUERY-SPEC-SET" ), makeSymbol( "FILENAME" ), makeSymbol( "COMMENT" ), makeSymbol( "OVERRIDING-QUERY-PROPERTIES" ), ConsesLow.list(
        makeSymbol( "METRICS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "ALL-LILLIPUT-QUERY-METRICS" ) ) ) ), ConsesLow.list( makeSymbol( "OUTLIER-TIMEOUT" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "*LILLIPUT-OUTLIER-TIMEOUT*" ) ) ), ConsesLow.list( makeSymbol( "INCREMENTAL" ), T ), ConsesLow.list( makeSymbol( "INCLUDE-RESULTS" ), NIL ), ConsesLow.list( makeSymbol( "RANDOMIZE" ),
                NIL ), ConsesLow.list( makeSymbol( "SKIP" ), ZERO_INTEGER ), makeSymbol( "COUNT" ), ConsesLow.list( makeSymbol( "DIRECTORY" ), makeSymbol( "*LILLIPUT-EXPERIMENT-DIRECTORY*" ) )
    } );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "QUERY-SPEC-SET" ), makeKeyword( "FILENAME" ), makeKeyword( "COMMENT" ), makeKeyword( "OVERRIDING-QUERY-PROPERTIES" ), makeKeyword( "METRICS" ), makeKeyword(
        "OUTLIER-TIMEOUT" ), makeKeyword( "INCREMENTAL" ), makeKeyword( "INCLUDE-RESULTS" ), makeKeyword( "RANDOMIZE" ), makeKeyword( "SKIP" ), makeKeyword( "COUNT" ), makeKeyword( "DIRECTORY" )
    } );
    $kw11$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw12$QUERY_SPEC_SET = makeKeyword( "QUERY-SPEC-SET" );
    $kw13$FILENAME = makeKeyword( "FILENAME" );
    $kw14$COMMENT = makeKeyword( "COMMENT" );
    $kw15$OVERRIDING_QUERY_PROPERTIES = makeKeyword( "OVERRIDING-QUERY-PROPERTIES" );
    $kw16$METRICS = makeKeyword( "METRICS" );
    $list17 = ConsesLow.list( makeSymbol( "ALL-LILLIPUT-QUERY-METRICS" ) );
    $kw18$OUTLIER_TIMEOUT = makeKeyword( "OUTLIER-TIMEOUT" );
    $sym19$_LILLIPUT_OUTLIER_TIMEOUT_ = makeSymbol( "*LILLIPUT-OUTLIER-TIMEOUT*" );
    $kw20$INCREMENTAL = makeKeyword( "INCREMENTAL" );
    $kw21$INCLUDE_RESULTS = makeKeyword( "INCLUDE-RESULTS" );
    $kw22$RANDOMIZE = makeKeyword( "RANDOMIZE" );
    $kw23$SKIP = makeKeyword( "SKIP" );
    $kw24$COUNT = makeKeyword( "COUNT" );
    $kw25$DIRECTORY = makeKeyword( "DIRECTORY" );
    $sym26$FILENAME_VAR = makeUninternedSymbol( "FILENAME-VAR" );
    $sym27$FULL_FILENAME = makeUninternedSymbol( "FULL-FILENAME" );
    $sym28$CLET = makeSymbol( "CLET" );
    $sym29$FWHEN = makeSymbol( "FWHEN" );
    $sym30$LILLIPUT_EXPERIMENT_FULL_FILENAME = makeSymbol( "LILLIPUT-EXPERIMENT-FULL-FILENAME" );
    $sym31$RUN_KBQ_EXPERIMENT = makeSymbol( "RUN-KBQ-EXPERIMENT" );
    $const32$LilliputQuery_OpenGood = constant_handles.reader_make_constant_shell( makeString( "LilliputQuery-OpenGood" ) );
    $const33$LilliputQuery_OpenNoGood = constant_handles.reader_make_constant_shell( makeString( "LilliputQuery-OpenNoGood" ) );
    $const34$LilliputQuery_ClosedGood = constant_handles.reader_make_constant_shell( makeString( "LilliputQuery-ClosedGood" ) );
    $const35$LilliputQuery_ClosedNoGood = constant_handles.reader_make_constant_shell( makeString( "LilliputQuery-ClosedNoGood" ) );
    $str36$Lilliput_Training = makeString( "Lilliput Training" );
    $str37$_0 = makeString( ":0" );
    $sym38$BOUND_SYMBOL_P = makeSymbol( "BOUND-SYMBOL-P" );
    $str39$____Basic_analysis____ = makeString( "~%~%Basic analysis: ~%" );
    $str40$____Answerable____ = makeString( "~%~%Answerable: ~%" );
    $str41$____Unanswerable____ = makeString( "~%~%Unanswerable: ~%" );
    $str42$____Open_Good___ = makeString( "~%~%Open Good ~%" );
    $str43$____Open_No_Good___ = makeString( "~%~%Open No Good ~%" );
    $str44$____Closed_Good___ = makeString( "~%~%Closed Good ~%" );
    $str45$____Closed_No_Good___ = makeString( "~%~%Closed No Good ~%" );
    $list46 = ConsesLow.list( makeSymbol( "LILLIPUT-OPEN-GOOD-QUERY?" ), makeSymbol( "LILLIPUT-OPEN-NO-GOOD-QUERY?" ), makeSymbol( "LILLIPUT-CLOSED-GOOD-QUERY?" ), makeSymbol( "LILLIPUT-CLOSED-NO-GOOD-QUERY?" ) );
    $kw47$PLOT_TITLE = makeKeyword( "PLOT-TITLE" );
    $str48$_ = makeString( " " );
    $str49$_n = makeString( "\\n" );
    $kw50$XLABEL = makeKeyword( "XLABEL" );
    $str51$Sorted_Queries = makeString( "Sorted Queries" );
    $kw52$YLABEL = makeKeyword( "YLABEL" );
    $list53 = ConsesLow.list( makeKeyword( "CLASSIFICATION-LABELS" ), ConsesLow.list( makeString( "Open Good" ), makeString( "Open No Good" ), makeString( "Closed Good" ), makeString( "Closed No Good" ) ), makeKeyword(
        "KEY-LOCATION" ), ConsesLow.list( makeInteger( 212 ), ONE_INTEGER ) );
    $str54$____Answerability_analysis____ = makeString( "~%~%Answerability analysis: ~%" );
    $str55$Total_____________s__s__s__ = makeString( "Total:           ~s ~s ~s~%" );
    $str56$Open_Good_________s__s__s__ = makeString( "Open Good:       ~s ~s ~s~%" );
    $str57$Open_No_Good______s__s__s__ = makeString( "Open No Good:    ~s ~s ~s~%" );
    $str58$Closed_Good_______s__s__s__ = makeString( "Closed Good:     ~s ~s ~s~%" );
    $str59$Closed_No_Good____s__s__s__ = makeString( "Closed No Good:  ~s ~s ~s~%" );
    $str60$____Mutually_Answerable____ = makeString( "~%~%Mutually Answerable: ~%" );
    $str61$____Mutually_Answerable_Open_Good = makeString( "~%~%Mutually Answerable Open Good: ~%" );
    $str62$____Mutually_Answerable_Closed_Go = makeString( "~%~%Mutually Answerable Closed Good: ~%" );
    $str63$____Open_Good____ = makeString( "~%~%Open Good: ~%" );
    $str64$____Open_No_Good____ = makeString( "~%~%Open No Good: ~%" );
    $str65$____Closed_Good____ = makeString( "~%~%Closed Good: ~%" );
    $str66$____Closed_No_Good____ = makeString( "~%~%Closed No Good: ~%" );
    $list67 = ConsesLow.list( makeKeyword( "BOTH" ), makeKeyword( "BASELINE" ) );
    $list68 = ConsesLow.list( makeKeyword( "ANSWERABILITY-TIME" ), makeKeyword( "COMPLETE-TOTAL-TIME" ) );
    $kw69$BOTH = makeKeyword( "BOTH" );
    $str70$__ = makeString( ": " );
    $str71$_vs__ = makeString( " vs. " );
    $kw72$BASELINE_KEY_LABEL = makeKeyword( "BASELINE-KEY-LABEL" );
    $kw73$EXPERIMENT_KEY_LABEL = makeKeyword( "EXPERIMENT-KEY-LABEL" );
    $list74 = ConsesLow.list( makeKeyword( "KEY-LOCATION" ), ConsesLow.list( makeInteger( 212 ), ONE_INTEGER ) );
    $sym75$KBQ_MEDIAN_QUERY_RUN = makeSymbol( "KBQ-MEDIAN-QUERY-RUN" );
    $str76$ = makeString( "" );
    $kw77$ORIGIN = makeKeyword( "ORIGIN" );
    $kw78$QUERY_RUNS = makeKeyword( "QUERY-RUNS" );
    $str79$Cannot_handle_even_numbers_of_que = makeString( "Cannot handle even numbers of query runs" );
    $sym80$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME = makeSymbol( "KBQ-QUERY-RUN-COMPLETE-TOTAL-TIME" );
    $kw81$ITEM = makeKeyword( "ITEM" );
    $float82$0_5 = makeDouble( 0.5 );
    $str83$o = makeString( "o" );
    $str84$_ = makeString( "." );
    $str85$_ = makeString( "+" );
    $str86$x = makeString( "x" );
    $sym87$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $str88$could_not_find_any_valid_terms_fo = makeString( "could not find any valid terms for argnum ~s of ~s" );
    $str89$got_an_unsorted_query__s = makeString( "got an unsorted query ~s" );
    $sym90$CYCL_ATOMIC_SENTENCE_P = makeSymbol( "CYCL-ATOMIC-SENTENCE-P" );
    $str91$Expected_only_one_arg_constraint_ = makeString( "Expected only one arg constraint, got ~s" );
    $const92$correspondingDomainInArg = constant_handles.reader_make_constant_shell( makeString( "correspondingDomainInArg" ) );
    $const93$CollectionSubsetFn = constant_handles.reader_make_constant_shell( makeString( "CollectionSubsetFn" ) );
    $list94 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeSymbol( "?ARGS" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ),
        makeSymbol( "?ARGS" ), constant_handles.reader_make_constant_shell( makeString( "TKBConstant" ) ) ) );
    $str95$unhandled___CollectionSubsetFn_do = makeString( "unhandled #$CollectionSubsetFn domain specification" );
    $str96$unexpected_domain_type__s = makeString( "unexpected domain type ~s" );
    $sym97$_ = makeSymbol( "<" );
    $sym98$_ = makeSymbol( "=" );
    $sym99$SECOND = makeSymbol( "SECOND" );
    $str100$_ = makeString( "-" );
    $const101$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const102$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const103$TestVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "TestVocabularyMt" ) );
    $list104 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LilliputQuery-Training" ) ) );
    $list105 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LilliputQuery-Blind" ) ) );
    $sym106$_COL = makeSymbol( "?COL" );
    $const107$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const108$nearestIsa = constant_handles.reader_make_constant_shell( makeString( "nearestIsa" ) );
    $list109 = ConsesLow.list( makeSymbol( "?COL" ) );
    $const110$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const111$leaveArgPlaceOpenInTestQueries = constant_handles.reader_make_constant_shell( makeString( "leaveArgPlaceOpenInTestQueries" ) );
    $const112$TKBConstant = constant_handles.reader_make_constant_shell( makeString( "TKBConstant" ) );
    $const113$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $sym114$NON_TKB_FORT_ = makeSymbol( "NON-TKB-FORT?" );
    $str115$g__ = makeString( "g~%" );
    $str116$n__ = makeString( "n~%" );
    $str117$c = makeString( "c" );
    $sym118$_ASS = makeSymbol( "?ASS" );
    $const119$assertionSentence = constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) );
    $const120$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell( makeString( "softwareParameterValueInSpecification" ) );
    $const121$InferenceSentenceParameter = constant_handles.reader_make_constant_shell( makeString( "InferenceSentenceParameter" ) );
    $sym122$_QUERY = makeSymbol( "?QUERY" );
    $sym123$_TYPE = makeSymbol( "?TYPE" );
    $list124 = ConsesLow.list( makeSymbol( "?TYPE" ) );
    $list125 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "different" ) ), makeSymbol( "?TYPE" ), constant_handles.reader_make_constant_shell( makeString(
        "LilliputQuery-Training" ) ) ) );
  }
}
/*
 *
 * Total time: 421 ms
 *
 */