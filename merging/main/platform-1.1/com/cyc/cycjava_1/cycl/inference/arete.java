/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.cycjava_1.cycl.inference;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_low;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.inference.kbq_query_run;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class arete extends SubLTranslatedFile {

  //// Constructor

  private arete() {}
  public static final SubLFile me = new arete();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.arete";

  //// Definitions

  /** When non-nil, logs every KB access in one of three dictionaries */
  @SubL(source = "cycl/inference/arete.lisp", position = 856) 
  public static SubLSymbol $arete_log_kb_touchesP$ = null;

  @SubL(source = "cycl/inference/arete.lisp", position = 978) 
  private static SubLSymbol $arete_experiment_directory$ = null;

  @SubL(source = "cycl/inference/arete.lisp", position = 1346) 
  private static SubLSymbol $arete_analysis_directory$ = null;

  @SubL(source = "cycl/inference/arete.lisp", position = 2227) 
  private static SubLSymbol $kbq_control_query_set_run$ = null;

  @SubL(source = "cycl/inference/arete.lisp", position = 2799) 
  public static SubLSymbol $arete_outlier_timeout$ = null;

  public static final SubLObject declare_arete_file() {
    //declareFunction(myName, "arete_experiment_full_filename", "ARETE-EXPERIMENT-FULL-FILENAME", 1, 1, false);
    //declareFunction(myName, "arete_analysis_full_filename", "ARETE-ANALYSIS-FULL-FILENAME", 1, 0, false);
    //declareFunction(myName, "load_arete_experiment", "LOAD-ARETE-EXPERIMENT", 1, 0, false);
    //declareFunction(myName, "suggest_filename_for_query_set_run", "SUGGEST-FILENAME-FOR-QUERY-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kbq_load_control_query_set_run", "KBQ-LOAD-CONTROL-QUERY-SET-RUN", 0, 1, false);
    //declareFunction(myName, "kbq_compare_query_set_run_answers_to_control", "KBQ-COMPARE-QUERY-SET-RUN-ANSWERS-TO-CONTROL", 1, 0, false);
    //declareMacro(myName, "run_arete_experiment", "RUN-ARETE-EXPERIMENT");
    //declareFunction(myName, "kbq_query_set_run_scaling_factors", "KBQ-QUERY-SET-RUN-SCALING-FACTORS", 2, 1, false);
    //declareFunction(myName, "kbq_compute_scaling_factors_from_analysis", "KBQ-COMPUTE-SCALING-FACTORS-FROM-ANALYSIS", 1, 0, false);
    //declareFunction(myName, "kbq_scale_analysis", "KBQ-SCALE-ANALYSIS", 3, 0, false);
    //declareFunction(myName, "multiply_scaling_factors", "MULTIPLY-SCALING-FACTORS", 2, 0, false);
    //declareFunction(myName, "invert_scaling_factors", "INVERT-SCALING-FACTORS", 1, 0, false);
    //declareFunction(myName, "kbq_save_report", "KBQ-SAVE-REPORT", 2, 1, false);
    //declareFunction(myName, "kbq_print_report", "KBQ-PRINT-REPORT", 1, 1, false);
    //declareFunction(myName, "kbq_print_histogram", "KBQ-PRINT-HISTOGRAM", 3, 0, false);
    //declareFunction(myName, "kbq_print_data", "KBQ-PRINT-DATA", 3, 0, false);
    //declareFunction(myName, "kbq_print_tuples", "KBQ-PRINT-TUPLES", 3, 0, false);
    //declareFunction(myName, "kbq_print_func_of_tuples", "KBQ-PRINT-FUNC-OF-TUPLES", 4, 0, false);
    //declareFunction(myName, "kbq_compute_tuples", "KBQ-COMPUTE-TUPLES", 2, 0, false);
    //declareFunction(myName, "kbq_print_error_queries", "KBQ-PRINT-ERROR-QUERIES", 1, 0, false);
    //declareFunction(myName, "arete_generate_property_correlation_plot", "ARETE-GENERATE-PROPERTY-CORRELATION-PLOT", 3, 2, false);
    //declareFunction(myName, "arete_generate_sorted_property_comparison", "ARETE-GENERATE-SORTED-PROPERTY-COMPARISON", 3, 3, false);
    //declareFunction(myName, "arete_generate_sorted_properties_comparison", "ARETE-GENERATE-SORTED-PROPERTIES-COMPARISON", 2, 3, false);
    //declareFunction(myName, "arete_generate_sorted_property_display", "ARETE-GENERATE-SORTED-PROPERTY-DISPLAY", 2, 3, false);
    //declareFunction(myName, "assertion_cons_sharing_dictionary", "ASSERTION-CONS-SHARING-DICTIONARY", 0, 0, false);
    //declareFunction(myName, "conses_saved_and_total_conses", "CONSES-SAVED-AND-TOTAL-CONSES", 1, 0, false);
    //declareFunction(myName, "nauts_shared_and_unshared", "NAUTS-SHARED-AND-UNSHARED", 1, 0, false);
    //declareFunction(myName, "kbq_hybridize_query_set_runs", "KBQ-HYBRIDIZE-QUERY-SET-RUNS", 1, 4, false);
    //declareFunction(myName, "kbq_tag_query_set_runs", "KBQ-TAG-QUERY-SET-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_hybridize_two_query_set_runs", "KBQ-HYBRIDIZE-TWO-QUERY-SET-RUNS", 2, 3, false);
    //declareFunction(myName, "kbq_better_query_run", "KBQ-BETTER-QUERY-RUN", 2, 2, false);
    //declareFunction(myName, "kbq_query_run_betterP", "KBQ-QUERY-RUN-BETTER?", 2, 1, false);
    //declareFunction(myName, "kbq_query_run_better_per_answerP", "KBQ-QUERY-RUN-BETTER-PER-ANSWER?", 2, 1, false);
    //declareFunction(myName, "kbq_query_run_better_wrt_timeP", "KBQ-QUERY-RUN-BETTER-WRT-TIME?", 2, 1, false);
    //declareFunction(myName, "kbq_may_have_harmful_side_effectsP", "KBQ-MAY-HAVE-HARMFUL-SIDE-EFFECTS?", 1, 0, false);
    //declareFunction(myName, "query_may_have_harmful_side_effectsP", "QUERY-MAY-HAVE-HARMFUL-SIDE-EFFECTS?", 1, 2, false);
    //declareFunction(myName, "sentence_contains_subl_performativeP", "SENTENCE-CONTAINS-SUBL-PERFORMATIVE?", 1, 0, false);
    //declareFunction(myName, "subl_performative_p", "SUBL-PERFORMATIVE-P", 1, 0, false);
    //declareFunction(myName, "conditional_sentence_with_closed_decontextualized_antecedent_literalP", "CONDITIONAL-SENTENCE-WITH-CLOSED-DECONTEXTUALIZED-ANTECEDENT-LITERAL?", 2, 0, false);
    //declareFunction(myName, "kbq_numeric_quantification_queryP", "KBQ-NUMERIC-QUANTIFICATION-QUERY?", 1, 0, false);
    //declareFunction(myName, "kbq_not_numeric_quantification_queryP", "KBQ-NOT-NUMERIC-QUANTIFICATION-QUERY?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_arete_file() {
    $arete_log_kb_touchesP$ = defparameter("*ARETE-LOG-KB-TOUCHES?*", NIL);
    $arete_experiment_directory$ = deflexical("*ARETE-EXPERIMENT-DIRECTORY*", $str0$_cyc_projects_inference_arete_exp);
    $arete_analysis_directory$ = deflexical("*ARETE-ANALYSIS-DIRECTORY*", $str3$_cyc_projects_inference_arete_ana);
    $kbq_control_query_set_run$ = deflexical("*KBQ-CONTROL-QUERY-SET-RUN*", maybeDefault( $sym8$_KBQ_CONTROL_QUERY_SET_RUN_, $kbq_control_query_set_run$, ()-> ($kw9$UNINITIALIZED)));
    $arete_outlier_timeout$ = deflexical("*ARETE-OUTLIER-TIMEOUT*", kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue());
    return NIL;
  }

  public static final SubLObject setup_arete_file() {
        subl_macro_promotions.declare_defglobal($sym8$_KBQ_CONTROL_QUERY_SET_RUN_);
    access_macros.define_obsolete_register($sym69$ARETE_GENERATE_PROPERTY_CORRELATION_PLOT, $list70);
    access_macros.define_obsolete_register($sym71$ARETE_GENERATE_SORTED_PROPERTY_COMPARISON, $list72);
    access_macros.define_obsolete_register($sym74$ARETE_GENERATE_SORTED_PROPERTIES_COMPARISON, $list75);
    access_macros.define_obsolete_register($sym77$ARETE_GENERATE_SORTED_PROPERTY_DISPLAY, $list78);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$_cyc_projects_inference_arete_exp = makeString("/cyc/projects/inference/arete/experiments/");
  public static final SubLString $str1$_ = makeString(".");
  public static final SubLString $str2$cfasl = makeString("cfasl");
  public static final SubLString $str3$_cyc_projects_inference_arete_ana = makeString("/cyc/projects/inference/arete/analysis/");
  public static final SubLString $str4$txt = makeString("txt");
  public static final SubLSymbol $kw5$MACHINE = makeKeyword("MACHINE");
  public static final SubLSymbol $kw6$DATE = makeKeyword("DATE");
  public static final SubLString $str7$kbq__8D__6D__A = makeString("kbq-~8D-~6D-~A");
  public static final SubLSymbol $sym8$_KBQ_CONTROL_QUERY_SET_RUN_ = makeSymbol("*KBQ-CONTROL-QUERY-SET-RUN*");
  public static final SubLSymbol $kw9$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str10$tkb_training_with_auto_destroy_re = makeString("tkb-training-with-auto-destroy-real-time");
  public static final SubLList $list11 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-ARETE-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*ARETE-OUTLIER-TIMEOUT*"))), makeSymbol("INCREMENTAL"), list(makeSymbol("INCLUDE-RESULTS"), T), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT"), list(makeSymbol("DIRECTORY"), makeSymbol("*ARETE-EXPERIMENT-DIRECTORY*"))});
  public static final SubLList $list12 = list(new SubLObject[] {makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("SKIP"), makeKeyword("COUNT"), makeKeyword("DIRECTORY")});
  public static final SubLSymbol $kw13$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw14$QUERY_SPEC_SET = makeKeyword("QUERY-SPEC-SET");
  public static final SubLSymbol $kw15$FILENAME = makeKeyword("FILENAME");
  public static final SubLSymbol $kw16$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw17$OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");
  public static final SubLSymbol $kw18$METRICS = makeKeyword("METRICS");
  public static final SubLList $list19 = list(makeSymbol("ALL-ARETE-QUERY-METRICS"));
  public static final SubLSymbol $kw20$OUTLIER_TIMEOUT = makeKeyword("OUTLIER-TIMEOUT");
  public static final SubLSymbol $sym21$_ARETE_OUTLIER_TIMEOUT_ = makeSymbol("*ARETE-OUTLIER-TIMEOUT*");
  public static final SubLSymbol $kw22$INCREMENTAL = makeKeyword("INCREMENTAL");
  public static final SubLSymbol $kw23$INCLUDE_RESULTS = makeKeyword("INCLUDE-RESULTS");
  public static final SubLSymbol $kw24$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw25$COUNT = makeKeyword("COUNT");
  public static final SubLSymbol $kw26$DIRECTORY = makeKeyword("DIRECTORY");
  public static final SubLSymbol $sym27$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");
  public static final SubLSymbol $sym28$FULL_FILENAME = makeUninternedSymbol("FULL-FILENAME");
  public static final SubLSymbol $sym29$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym30$FWHEN = makeSymbol("FWHEN");
  public static final SubLSymbol $sym31$ARETE_EXPERIMENT_FULL_FILENAME = makeSymbol("ARETE-EXPERIMENT-FULL-FILENAME");
  public static final SubLSymbol $sym32$RUN_KBQ_EXPERIMENT = makeSymbol("RUN-KBQ-EXPERIMENT");
  public static final SubLSymbol $kw33$UNDEFINED = makeKeyword("UNDEFINED");
  public static final SubLSymbol $kw34$BASELINE = makeKeyword("BASELINE");
  public static final SubLSymbol $kw35$EXPERIMENT = makeKeyword("EXPERIMENT");
  public static final SubLString $str36$_s_already_exists__specify_OVERWR = makeString("~s already exists, specify OVERWRITE? T if you want to overwrite it");
  public static final SubLSymbol $kw37$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str38$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str39$_________________________________ = makeString("=========================================~%");
  public static final SubLString $str40$_a__ = makeString("~a~%");
  public static final SubLList $list41 = list(makeKeyword("COMMENT"), makeKeyword("DATE"), makeKeyword("QUERY-RUNS"));
  public static final SubLString $str42$Summary_Statistics___ = makeString("Summary Statistics:~%");
  public static final SubLList $list43 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TOTAL-TIME"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"));
  public static final SubLString $str44$_________________________________ = makeString("-----------------------------------------~%");
  public static final SubLSymbol $kw45$HALT_REASON = makeKeyword("HALT-REASON");
  public static final SubLSymbol $kw46$ANSWER_COUNT = makeKeyword("ANSWER-COUNT");
  public static final SubLSymbol $kw47$TOTAL_TIME = makeKeyword("TOTAL-TIME");
  public static final SubLSymbol $kw48$TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw49$TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");
  public static final SubLSymbol $kw50$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw51$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $kw52$CONTINUABLE_ = makeKeyword("CONTINUABLE?");
  public static final SubLList $list53 = list(makeKeyword("TOTAL-TIME"), makeKeyword("MAX-TRANSFORMATION-DEPTH"));
  public static final SubLList $list54 = list(makeKeyword("TOTAL-TIME"), makeKeyword("MAX-TIME"));
  public static final SubLList $list55 = list(makeKeyword("MAX-TIME"), makeKeyword("TOTAL-TIME"));
  public static final SubLSymbol $sym56$SAFE_DIFFERENCE = makeSymbol("SAFE-DIFFERENCE");
  public static final SubLList $list57 = list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-SENTENCE-CLOSED?"));
  public static final SubLList $list58 = list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-CANONICAL-MT"));
  public static final SubLList $list59 = list(makeKeyword("TOTAL-TIME"), list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-CANONICAL-MT")));
  public static final SubLString $str60$_s_Histogram___ = makeString("~s Histogram:~%");
  public static final SubLSymbol $sym61$SAFE__ = makeSymbol("SAFE-<");
  public static final SubLString $str62$_s_Data___ = makeString("~s Data:~%");
  public static final SubLString $str63$_s_Tuples___ = makeString("~s Tuples:~%");
  public static final SubLSymbol $sym64$FIRST = makeSymbol("FIRST");
  public static final SubLString $str65$_s_applied_to__s___ = makeString("~s applied to ~s:~%");
  public static final SubLSymbol $sym66$MAPCAR = makeSymbol("MAPCAR");
  public static final SubLSymbol $sym67$LIST = makeSymbol("LIST");
  public static final SubLString $str68$_s_____s__ = makeString("~s -> ~s~%");
  public static final SubLSymbol $sym69$ARETE_GENERATE_PROPERTY_CORRELATION_PLOT = makeSymbol("ARETE-GENERATE-PROPERTY-CORRELATION-PLOT");
  public static final SubLList $list70 = list(makeSymbol("KBQ-GENERATE-PROPERTY-CORRELATION-PLOT"));
  public static final SubLSymbol $sym71$ARETE_GENERATE_SORTED_PROPERTY_COMPARISON = makeSymbol("ARETE-GENERATE-SORTED-PROPERTY-COMPARISON");
  public static final SubLList $list72 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTY-COMPARISON"));
  public static final SubLSymbol $kw73$BOTH = makeKeyword("BOTH");
  public static final SubLSymbol $sym74$ARETE_GENERATE_SORTED_PROPERTIES_COMPARISON = makeSymbol("ARETE-GENERATE-SORTED-PROPERTIES-COMPARISON");
  public static final SubLList $list75 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTIES-COMPARISON"));
  public static final SubLSymbol $kw76$ALL = makeKeyword("ALL");
  public static final SubLSymbol $sym77$ARETE_GENERATE_SORTED_PROPERTY_DISPLAY = makeSymbol("ARETE-GENERATE-SORTED-PROPERTY-DISPLAY");
  public static final SubLList $list78 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTY-DISPLAY"));
  public static final SubLString $str79$Interning_all_assertion_conses = makeString("Interning all assertion conses");
  public static final SubLSymbol $sym80$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str81$Looking_for_shared_nauts = makeString("Looking for shared nauts");
  public static final SubLSymbol $sym82$KBQ_QUERY_RUN_BETTER_ = makeSymbol("KBQ-QUERY-RUN-BETTER?");
  public static final SubLSymbol $kw83$ORIGIN = makeKeyword("ORIGIN");
  public static final SubLSymbol $kw84$QUERY_RUNS = makeKeyword("QUERY-RUNS");
  public static final SubLString $str85$ = makeString("");
  public static final SubLString $str86$__Hybridized_with___ = makeString("~%Hybridized with:~%");
  public static final SubLSymbol $sym87$SUBL_PERFORMATIVE_P = makeSymbol("SUBL-PERFORMATIVE-P");
  public static final SubLObject $const88$performSubL = constant_handles.reader_make_constant_shell(makeString("performSubL"));
  public static final SubLObject $const89$trueSubL = constant_handles.reader_make_constant_shell(makeString("trueSubL"));
  public static final SubLSymbol $kw90$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLObject $const91$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLSymbol $kw92$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $sym93$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLList $list94 = list(constant_handles.reader_make_constant_shell(makeString("nthLargestElement")), constant_handles.reader_make_constant_shell(makeString("extentCardinality")), constant_handles.reader_make_constant_shell(makeString("PlusAll")), constant_handles.reader_make_constant_shell(makeString("Average")), constant_handles.reader_make_constant_shell(makeString("ratioOfCollectionToDifferentiatedCollection")), constant_handles.reader_make_constant_shell(makeString("performsActsOfType-Percentage")));

  //// Initializers

  public void declareFunctions() {
    declare_arete_file();
  }

  public void initializeVariables() {
    init_arete_file();
  }

  public void runTopLevelForms() {
    setup_arete_file();
  }

}
