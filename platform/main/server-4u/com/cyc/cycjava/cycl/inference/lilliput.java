/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.cycjava.cycl.special_variable_state;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LILLIPUT
 * source file: /cyc/top/cycl/inference/lilliput.lisp
 * created:     2019/07/03 17:37:43
 */
public final class lilliput extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt76$ = makeString("");

    public static final SubLFile me = new lilliput();



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $lilliput_master_query_collection$ = makeSymbol("*LILLIPUT-MASTER-QUERY-COLLECTION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $lilliput_default_query_collections$ = makeSymbol("*LILLIPUT-DEFAULT-QUERY-COLLECTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $lilliput_mt$ = makeSymbol("*LILLIPUT-MT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $lilliput_corpus_generation_query_properties$ = makeSymbol("*LILLIPUT-CORPUS-GENERATION-QUERY-PROPERTIES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $lilliput_directory$ = makeSymbol("*LILLIPUT-DIRECTORY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $lilliput_experiment_directory$ = makeSymbol("*LILLIPUT-EXPERIMENT-DIRECTORY*");

    // deflexical
    // These are the metrics used in most analysis and graphing.
    /**
     * These are the metrics used in most analysis and graphing.
     */
    @LispMethod(comment = "These are the metrics used in most analysis and graphing.\ndeflexical")
    private static final SubLSymbol $basic_lilliput_query_metrics$ = makeSymbol("*BASIC-LILLIPUT-QUERY-METRICS*");

    // deflexical
    /**
     * These are the metrics that will be graphed when analyzing a single
     * experiment.
     */
    @LispMethod(comment = "These are the metrics that will be graphed when analyzing a single\r\nexperiment.\ndeflexical\nThese are the metrics that will be graphed when analyzing a single\nexperiment.")
    private static final SubLSymbol $standard_lilliput_query_metrics$ = makeSymbol("*STANDARD-LILLIPUT-QUERY-METRICS*");

    // deflexical
    // These are the metrics that will be gathered during the experiment.
    /**
     * These are the metrics that will be gathered during the experiment.
     */
    @LispMethod(comment = "These are the metrics that will be gathered during the experiment.\ndeflexical")
    private static final SubLSymbol $lilliput_query_metrics$ = makeSymbol("*LILLIPUT-QUERY-METRICS*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLObject $$AKBBuilderQuery_InferenceTest = reader_make_constant_shell("AKBBuilderQuery-InferenceTest");

    static private final SubLList $list1 = list(reader_make_constant_shell("AKBBuilderQuery-InferenceTest-Default"), reader_make_constant_shell("AKBBuilderQuery-InferenceTest-LeaveOpenArg2"));



    static private final SubLList $list3 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("CONTINUABLE?"), NIL, makeKeyword("NEW-TERMS-ALLOWED?"), NIL);

    static private final SubLString $str4$_cyc_projects_inference_lilliput_ = makeString("/cyc/projects/inference/lilliput/");

    static private final SubLString $str5$experiments_ = makeString("experiments/");

    static private final SubLList $list6 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("COMPLETE-TIME-PER-ANSWER"), makeKeyword("ANSWERABILITY-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"));

    static private final SubLList $list7 = list(new SubLObject[]{ makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"), makeKeyword("TIME-PER-ANSWER"), makeKeyword("COMPLETE-TIME-PER-ANSWER"), makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER"), makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), makeKeyword("ANSWER-TIMES"), makeKeyword("TACTIC-COUNT"), makeKeyword("POSSIBLE-TACTIC-COUNT"), makeKeyword("EXECUTED-TACTIC-COUNT"), makeKeyword("DISCARDED-TACTIC-COUNT") });

    private static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLList $list9 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(QUOTE, list(makeSymbol("ALL-LILLIPUT-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(QUOTE, makeSymbol("*LILLIPUT-OUTLIER-TIMEOUT*"))), list(makeSymbol("INCREMENTAL"), T), list(makeSymbol("INCLUDE-RESULTS"), NIL), list(makeSymbol("RANDOMIZE"), NIL), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT"), list(makeSymbol("DIRECTORY"), makeSymbol("*LILLIPUT-EXPERIMENT-DIRECTORY*")) });

    static private final SubLList $list10 = list(new SubLObject[]{ makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("RANDOMIZE"), $SKIP, makeKeyword("COUNT"), makeKeyword("DIRECTORY") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $QUERY_SPEC_SET = makeKeyword("QUERY-SPEC-SET");

    private static final SubLSymbol $OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");

    static private final SubLList $list17 = list(makeSymbol("ALL-LILLIPUT-QUERY-METRICS"));

    public static final SubLSymbol $lilliput_outlier_timeout$ = makeSymbol("*LILLIPUT-OUTLIER-TIMEOUT*");

    static private final SubLSymbol $sym26$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    static private final SubLSymbol $sym27$FULL_FILENAME = makeUninternedSymbol("FULL-FILENAME");

    private static final SubLSymbol LILLIPUT_EXPERIMENT_FULL_FILENAME = makeSymbol("LILLIPUT-EXPERIMENT-FULL-FILENAME");

    private static final SubLSymbol RUN_KBQ_EXPERIMENT = makeSymbol("RUN-KBQ-EXPERIMENT");

    private static final SubLObject $$LilliputQuery_OpenGood = reader_make_constant_shell("LilliputQuery-OpenGood");

    private static final SubLObject $$LilliputQuery_OpenNoGood = reader_make_constant_shell("LilliputQuery-OpenNoGood");

    private static final SubLObject $$LilliputQuery_ClosedGood = reader_make_constant_shell("LilliputQuery-ClosedGood");

    private static final SubLObject $$LilliputQuery_ClosedNoGood = reader_make_constant_shell("LilliputQuery-ClosedNoGood");

    static private final SubLString $$$Lilliput_Training = makeString("Lilliput Training");

    static private final SubLString $str37$_0 = makeString(":0");

    private static final SubLSymbol BOUND_SYMBOL_P = makeSymbol("BOUND-SYMBOL-P");

    static private final SubLString $str39$____Basic_analysis____ = makeString("~%~%Basic analysis: ~%");

    static private final SubLString $str40$____Answerable____ = makeString("~%~%Answerable: ~%");

    static private final SubLString $str41$____Unanswerable____ = makeString("~%~%Unanswerable: ~%");

    static private final SubLString $str42$____Open_Good___ = makeString("~%~%Open Good ~%");

    static private final SubLString $str43$____Open_No_Good___ = makeString("~%~%Open No Good ~%");

    static private final SubLString $str44$____Closed_Good___ = makeString("~%~%Closed Good ~%");

    static private final SubLString $str45$____Closed_No_Good___ = makeString("~%~%Closed No Good ~%");

    static private final SubLList $list46 = list(makeSymbol("LILLIPUT-OPEN-GOOD-QUERY?"), makeSymbol("LILLIPUT-OPEN-NO-GOOD-QUERY?"), makeSymbol("LILLIPUT-CLOSED-GOOD-QUERY?"), makeSymbol("LILLIPUT-CLOSED-NO-GOOD-QUERY?"));

    static private final SubLString $$$_ = makeString(" ");

    static private final SubLString $str49$_n = makeString("\\n");

    static private final SubLString $$$Sorted_Queries = makeString("Sorted Queries");

    static private final SubLList $list53 = list(makeKeyword("CLASSIFICATION-LABELS"), list(makeString("Open Good"), makeString("Open No Good"), makeString("Closed Good"), makeString("Closed No Good")), makeKeyword("KEY-LOCATION"), list(makeInteger(212), ONE_INTEGER));

    static private final SubLString $str54$____Answerability_analysis____ = makeString("~%~%Answerability analysis: ~%");

    static private final SubLString $str55$Total_____________s__s__s__ = makeString("Total:           ~s ~s ~s~%");

    static private final SubLString $str56$Open_Good_________s__s__s__ = makeString("Open Good:       ~s ~s ~s~%");

    static private final SubLString $str57$Open_No_Good______s__s__s__ = makeString("Open No Good:    ~s ~s ~s~%");

    static private final SubLString $str58$Closed_Good_______s__s__s__ = makeString("Closed Good:     ~s ~s ~s~%");

    static private final SubLString $str59$Closed_No_Good____s__s__s__ = makeString("Closed No Good:  ~s ~s ~s~%");

    static private final SubLString $str60$____Mutually_Answerable____ = makeString("~%~%Mutually Answerable: ~%");

    static private final SubLString $str61$____Mutually_Answerable_Open_Good = makeString("~%~%Mutually Answerable Open Good: ~%");

    static private final SubLString $str62$____Mutually_Answerable_Closed_Go = makeString("~%~%Mutually Answerable Closed Good: ~%");

    static private final SubLString $str63$____Open_Good____ = makeString("~%~%Open Good: ~%");

    static private final SubLString $str64$____Open_No_Good____ = makeString("~%~%Open No Good: ~%");

    static private final SubLString $str65$____Closed_Good____ = makeString("~%~%Closed Good: ~%");

    static private final SubLString $str66$____Closed_No_Good____ = makeString("~%~%Closed No Good: ~%");

    static private final SubLList $list67 = list($BOTH, makeKeyword("BASELINE"));

    static private final SubLList $list68 = list(makeKeyword("ANSWERABILITY-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"));

    static private final SubLString $str70$__ = makeString(": ");

    static private final SubLString $str71$_vs__ = makeString(" vs. ");

    private static final SubLSymbol $BASELINE_KEY_LABEL = makeKeyword("BASELINE-KEY-LABEL");

    private static final SubLSymbol $EXPERIMENT_KEY_LABEL = makeKeyword("EXPERIMENT-KEY-LABEL");

    static private final SubLList $list74 = list(makeKeyword("KEY-LOCATION"), list(makeInteger(212), ONE_INTEGER));

    private static final SubLSymbol KBQ_MEDIAN_QUERY_RUN = makeSymbol("KBQ-MEDIAN-QUERY-RUN");

    static private final SubLString $str76$ = makeString("");

    static private final SubLString $str79$Cannot_handle_even_numbers_of_que = makeString("Cannot handle even numbers of query runs");

    private static final SubLSymbol KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME = makeSymbol("KBQ-QUERY-RUN-COMPLETE-TOTAL-TIME");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLString $$$o = makeString("o");

    static private final SubLString $str84$_ = makeString(".");

    private static final SubLString $str85$_ = makeString("+");

    private static final SubLString $$$x = makeString("x");

    private static final SubLSymbol $sym87$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLString $str88$could_not_find_any_valid_terms_fo = makeString("could not find any valid terms for argnum ~s of ~s");

    private static final SubLString $str89$got_an_unsorted_query__s = makeString("got an unsorted query ~s");

    private static final SubLSymbol CYCL_ATOMIC_SENTENCE_P = makeSymbol("CYCL-ATOMIC-SENTENCE-P");

    private static final SubLString $str91$Expected_only_one_arg_constraint_ = makeString("Expected only one arg constraint, got ~s");





    private static final SubLList $list94 = list(reader_make_constant_shell("TheSetOf"), makeSymbol("?ARGS"), list(reader_make_constant_shell("quotedIsa"), makeSymbol("?ARGS"), reader_make_constant_shell("TKBConstant")));

    private static final SubLString $str95$unhandled___CollectionSubsetFn_do = makeString("unhandled #$CollectionSubsetFn domain specification");

    private static final SubLString $str96$unexpected_domain_type__s = makeString("unexpected domain type ~s");

    static private final SubLSymbol $sym97$_ = makeSymbol("<");

    private static final SubLSymbol $sym98$_ = makeSymbol("=");

    private static final SubLString $str100$_ = makeString("-");







    static private final SubLList $list104 = list(reader_make_constant_shell("LilliputQuery-Training"));

    private static final SubLList $list105 = list(reader_make_constant_shell("LilliputQuery-Blind"));

    private static final SubLSymbol $sym106$_COL = makeSymbol("?COL");





    private static final SubLList $list109 = list(makeSymbol("?COL"));









    private static final SubLSymbol $sym114$NON_TKB_FORT_ = makeSymbol("NON-TKB-FORT?");

    private static final SubLString $str115$g__ = makeString("g~%");

    private static final SubLString $str116$n__ = makeString("n~%");

    private static final SubLString $$$c = makeString("c");

    private static final SubLSymbol $sym118$_ASS = makeSymbol("?ASS");



    private static final SubLObject $const120$softwareParameterValueInSpecifica = reader_make_constant_shell("softwareParameterValueInSpecification");



    private static final SubLSymbol $sym122$_QUERY = makeSymbol("?QUERY");

    private static final SubLSymbol $sym123$_TYPE = makeSymbol("?TYPE");

    static private final SubLList $list124 = list(makeSymbol("?TYPE"));

    private static final SubLList $list125 = list(list(reader_make_constant_shell("different"), makeSymbol("?TYPE"), reader_make_constant_shell("LilliputQuery-Training")));

    public static final SubLObject basic_lilliput_query_metrics_alt() {
        return copy_list($basic_lilliput_query_metrics$.getGlobalValue());
    }

    public static SubLObject basic_lilliput_query_metrics() {
        return copy_list($basic_lilliput_query_metrics$.getGlobalValue());
    }

    public static final SubLObject standard_lilliput_query_metrics_alt() {
        return copy_list($standard_lilliput_query_metrics$.getGlobalValue());
    }

    public static SubLObject standard_lilliput_query_metrics() {
        return copy_list($standard_lilliput_query_metrics$.getGlobalValue());
    }

    public static final SubLObject all_lilliput_query_metrics_alt() {
        return $lilliput_query_metrics$.getGlobalValue();
    }

    public static SubLObject all_lilliput_query_metrics() {
        return $lilliput_query_metrics$.getGlobalValue();
    }

    public static final SubLObject lilliput_experiment_full_filename_alt(SubLObject filename, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $lilliput_experiment_directory$.getGlobalValue();
        }
        return arete.arete_experiment_full_filename(filename, directory);
    }

    public static SubLObject lilliput_experiment_full_filename(final SubLObject filename, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $lilliput_experiment_directory$.getGlobalValue();
        }
        return arete.arete_experiment_full_filename(filename, directory);
    }

    /**
     *
     *
     * @see run-leviathan-experiment
     */
    @LispMethod(comment = "@see run-leviathan-experiment")
    public static final SubLObject run_lilliput_experiment_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_1 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt9);
                current_1 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt9);
                if (NIL == member(current_1, $list_alt10, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_1 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt9);
            }
            {
                SubLObject query_spec_set_tail = property_list_member($QUERY_SPEC_SET, current);
                SubLObject query_spec_set = (NIL != query_spec_set_tail) ? ((SubLObject) (cadr(query_spec_set_tail))) : NIL;
                SubLObject filename_tail = property_list_member($FILENAME, current);
                SubLObject filename = (NIL != filename_tail) ? ((SubLObject) (cadr(filename_tail))) : NIL;
                SubLObject comment_tail = property_list_member($COMMENT, current);
                SubLObject comment = (NIL != comment_tail) ? ((SubLObject) (cadr(comment_tail))) : NIL;
                SubLObject overriding_query_properties_tail = property_list_member($OVERRIDING_QUERY_PROPERTIES, current);
                SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? ((SubLObject) (cadr(overriding_query_properties_tail))) : NIL;
                SubLObject metrics_tail = property_list_member($METRICS, current);
                SubLObject metrics = (NIL != metrics_tail) ? ((SubLObject) (cadr(metrics_tail))) : $list_alt17;
                SubLObject outlier_timeout_tail = property_list_member($OUTLIER_TIMEOUT, current);
                SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? ((SubLObject) (cadr(outlier_timeout_tail))) : $lilliput_outlier_timeout$;
                SubLObject incremental_tail = property_list_member($INCREMENTAL, current);
                SubLObject incremental = (NIL != incremental_tail) ? ((SubLObject) (cadr(incremental_tail))) : T;
                SubLObject include_results_tail = property_list_member($INCLUDE_RESULTS, current);
                SubLObject include_results = (NIL != include_results_tail) ? ((SubLObject) (cadr(include_results_tail))) : NIL;
                SubLObject randomize_tail = property_list_member($RANDOMIZE, current);
                SubLObject randomize = (NIL != randomize_tail) ? ((SubLObject) (cadr(randomize_tail))) : NIL;
                SubLObject skip_tail = property_list_member($SKIP, current);
                SubLObject skip = (NIL != skip_tail) ? ((SubLObject) (cadr(skip_tail))) : ZERO_INTEGER;
                SubLObject count_tail = property_list_member($COUNT, current);
                SubLObject count = (NIL != count_tail) ? ((SubLObject) (cadr(count_tail))) : NIL;
                SubLObject directory_tail = property_list_member($DIRECTORY, current);
                SubLObject directory = (NIL != directory_tail) ? ((SubLObject) (cadr(directory_tail))) : $lilliput_experiment_directory$.getGlobalValue();
                SubLObject filename_var = $sym26$FILENAME_VAR;
                SubLObject full_filename = $sym27$FULL_FILENAME;
                return list(CLET, list(list(filename_var, filename), list(full_filename, list(FWHEN, filename_var, list(LILLIPUT_EXPERIMENT_FULL_FILENAME, filename_var, directory)))), list(new SubLObject[]{ RUN_KBQ_EXPERIMENT, $QUERY_SPEC_SET, query_spec_set, $FILENAME, full_filename, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $METRICS, metrics, $OUTLIER_TIMEOUT, outlier_timeout, $INCREMENTAL, incremental, $INCLUDE_RESULTS, include_results, $RANDOMIZE, randomize, $SKIP, skip, $COUNT, count }));
            }
        }
    }

    /**
     *
     *
     * @see run-leviathan-experiment
     */
    @LispMethod(comment = "@see run-leviathan-experiment")
    public static SubLObject run_lilliput_experiment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list9);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list9);
            if (NIL == member(current_$1, $list10, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list9);
        }
        final SubLObject query_spec_set_tail = property_list_member($QUERY_SPEC_SET, current);
        final SubLObject query_spec_set = (NIL != query_spec_set_tail) ? cadr(query_spec_set_tail) : NIL;
        final SubLObject filename_tail = property_list_member($FILENAME, current);
        final SubLObject filename = (NIL != filename_tail) ? cadr(filename_tail) : NIL;
        final SubLObject comment_tail = property_list_member($COMMENT, current);
        final SubLObject comment = (NIL != comment_tail) ? cadr(comment_tail) : NIL;
        final SubLObject overriding_query_properties_tail = property_list_member($OVERRIDING_QUERY_PROPERTIES, current);
        final SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? cadr(overriding_query_properties_tail) : NIL;
        final SubLObject metrics_tail = property_list_member($METRICS, current);
        final SubLObject metrics = (NIL != metrics_tail) ? cadr(metrics_tail) : $list17;
        final SubLObject outlier_timeout_tail = property_list_member($OUTLIER_TIMEOUT, current);
        final SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? cadr(outlier_timeout_tail) : $lilliput_outlier_timeout$;
        final SubLObject incremental_tail = property_list_member($INCREMENTAL, current);
        final SubLObject incremental = (NIL != incremental_tail) ? cadr(incremental_tail) : T;
        final SubLObject include_results_tail = property_list_member($INCLUDE_RESULTS, current);
        final SubLObject include_results = (NIL != include_results_tail) ? cadr(include_results_tail) : NIL;
        final SubLObject randomize_tail = property_list_member($RANDOMIZE, current);
        final SubLObject randomize = (NIL != randomize_tail) ? cadr(randomize_tail) : NIL;
        final SubLObject skip_tail = property_list_member($SKIP, current);
        final SubLObject skip = (NIL != skip_tail) ? cadr(skip_tail) : ZERO_INTEGER;
        final SubLObject count_tail = property_list_member($COUNT, current);
        final SubLObject count = (NIL != count_tail) ? cadr(count_tail) : NIL;
        final SubLObject directory_tail = property_list_member($DIRECTORY, current);
        final SubLObject directory = (NIL != directory_tail) ? cadr(directory_tail) : $lilliput_experiment_directory$.getGlobalValue();
        final SubLObject filename_var = $sym26$FILENAME_VAR;
        final SubLObject full_filename = $sym27$FULL_FILENAME;
        return list(CLET, list(list(filename_var, filename), list(full_filename, list(FWHEN, filename_var, list(LILLIPUT_EXPERIMENT_FULL_FILENAME, filename_var, directory)))), list(new SubLObject[]{ RUN_KBQ_EXPERIMENT, $QUERY_SPEC_SET, query_spec_set, $FILENAME, full_filename, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $METRICS, metrics, $OUTLIER_TIMEOUT, outlier_timeout, $INCREMENTAL, incremental, $INCLUDE_RESULTS, include_results, $RANDOMIZE, randomize, $SKIP, skip, $COUNT, count }));
    }

    public static final SubLObject load_lilliput_experiment_alt(SubLObject filename) {
        {
            SubLObject full_filename = com.cyc.cycjava.cycl.inference.lilliput.lilliput_experiment_full_filename(filename, UNPROVIDED);
            return kbq_query_run.kbq_load_query_set_run(full_filename);
        }
    }

    public static SubLObject load_lilliput_experiment(final SubLObject filename) {
        final SubLObject full_filename = lilliput_experiment_full_filename(filename, UNPROVIDED);
        return kbq_query_run.kbq_load_query_set_run(full_filename);
    }

    public static final SubLObject save_lilliput_experiment_alt(SubLObject experiment, SubLObject filename) {
        {
            SubLObject full_filename = com.cyc.cycjava.cycl.inference.lilliput.lilliput_experiment_full_filename(filename, UNPROVIDED);
            return kbq_query_run.kbq_save_query_set_run(experiment, full_filename);
        }
    }

    public static SubLObject save_lilliput_experiment(final SubLObject experiment, final SubLObject filename) {
        final SubLObject full_filename = lilliput_experiment_full_filename(filename, UNPROVIDED);
        return kbq_query_run.kbq_save_query_set_run(experiment, full_filename);
    }

    public static final SubLObject lilliput_open_good_query_set_run_alt(SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$LilliputQuery_OpenGood, UNPROVIDED);
    }

    public static SubLObject lilliput_open_good_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$LilliputQuery_OpenGood, UNPROVIDED);
    }

    public static final SubLObject lilliput_open_no_good_query_set_run_alt(SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$LilliputQuery_OpenNoGood, UNPROVIDED);
    }

    public static SubLObject lilliput_open_no_good_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$LilliputQuery_OpenNoGood, UNPROVIDED);
    }

    public static final SubLObject lilliput_closed_good_query_set_run_alt(SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$LilliputQuery_ClosedGood, UNPROVIDED);
    }

    public static SubLObject lilliput_closed_good_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$LilliputQuery_ClosedGood, UNPROVIDED);
    }

    public static final SubLObject lilliput_closed_no_good_query_set_run_alt(SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$LilliputQuery_ClosedNoGood, UNPROVIDED);
    }

    public static SubLObject lilliput_closed_no_good_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$LilliputQuery_ClosedNoGood, UNPROVIDED);
    }

    public static final SubLObject lilliput_open_good_queryP_alt(SubLObject query) {
        return isa.isaP(query, $$LilliputQuery_OpenGood, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lilliput_open_good_queryP(final SubLObject query) {
        return isa.isaP(query, $$LilliputQuery_OpenGood, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject lilliput_open_no_good_queryP_alt(SubLObject query) {
        return isa.isaP(query, $$LilliputQuery_OpenNoGood, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lilliput_open_no_good_queryP(final SubLObject query) {
        return isa.isaP(query, $$LilliputQuery_OpenNoGood, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject lilliput_closed_good_queryP_alt(SubLObject query) {
        return isa.isaP(query, $$LilliputQuery_ClosedGood, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lilliput_closed_good_queryP(final SubLObject query) {
        return isa.isaP(query, $$LilliputQuery_ClosedGood, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject lilliput_closed_no_good_queryP_alt(SubLObject query) {
        return isa.isaP(query, $$LilliputQuery_ClosedNoGood, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lilliput_closed_no_good_queryP(final SubLObject query) {
        return isa.isaP(query, $$LilliputQuery_ClosedNoGood, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject analyze_lilliput_experiment_alt(SubLObject experiment_denoting_symbol, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (corpus == UNPROVIDED) {
            corpus = $$$Lilliput_Training;
        }
        if (display == UNPROVIDED) {
            display = $str_alt37$_0;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(experiment_denoting_symbol, BOUND_SYMBOL_P);
        {
            SubLObject query_set_run = symbol_value(experiment_denoting_symbol);
            SubLObject name = symbol_name(experiment_denoting_symbol);
            format(stream, $str_alt39$____Basic_analysis____);
            list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(query_set_run, com.cyc.cycjava.cycl.inference.lilliput.basic_lilliput_query_metrics()), UNPROVIDED);
            format(stream, $str_alt40$____Answerable____);
            list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(query_set_run), com.cyc.cycjava.cycl.inference.lilliput.basic_lilliput_query_metrics()), UNPROVIDED);
            format(stream, $str_alt41$____Unanswerable____);
            list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(query_set_run), com.cyc.cycjava.cycl.inference.lilliput.basic_lilliput_query_metrics()), UNPROVIDED);
            format(stream, $str_alt42$____Open_Good___);
            list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(com.cyc.cycjava.cycl.inference.lilliput.lilliput_open_good_query_set_run(query_set_run), com.cyc.cycjava.cycl.inference.lilliput.basic_lilliput_query_metrics()), UNPROVIDED);
            format(stream, $str_alt43$____Open_No_Good___);
            list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(com.cyc.cycjava.cycl.inference.lilliput.lilliput_open_no_good_query_set_run(query_set_run), com.cyc.cycjava.cycl.inference.lilliput.basic_lilliput_query_metrics()), UNPROVIDED);
            format(stream, $str_alt44$____Closed_Good___);
            list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(com.cyc.cycjava.cycl.inference.lilliput.lilliput_closed_good_query_set_run(query_set_run), com.cyc.cycjava.cycl.inference.lilliput.basic_lilliput_query_metrics()), UNPROVIDED);
            format(stream, $str_alt45$____Closed_No_Good___);
            list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(com.cyc.cycjava.cycl.inference.lilliput.lilliput_closed_no_good_query_set_run(query_set_run), com.cyc.cycjava.cycl.inference.lilliput.basic_lilliput_query_metrics()), UNPROVIDED);
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.lilliput.standard_lilliput_query_metrics();
                SubLObject metric = NIL;
                for (metric = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , metric = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.inference.lilliput.lilliput_generate_sorted_property_display(query_set_run, name, metric, corpus, display);
                }
            }
            return name;
        }
    }

    public static SubLObject analyze_lilliput_experiment(final SubLObject experiment_denoting_symbol, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (corpus == UNPROVIDED) {
            corpus = $$$Lilliput_Training;
        }
        if (display == UNPROVIDED) {
            display = $str37$_0;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) : "! special_variable_state.bound_symbol_p(experiment_denoting_symbol) " + ("special_variable_state.bound_symbol_p(experiment_denoting_symbol) " + "CommonSymbols.NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) ") + experiment_denoting_symbol;
        final SubLObject query_set_run = symbol_value(experiment_denoting_symbol);
        final SubLObject name = symbol_name(experiment_denoting_symbol);
        format(stream, $str39$____Basic_analysis____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(query_set_run, basic_lilliput_query_metrics()), UNPROVIDED);
        format(stream, $str40$____Answerable____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(query_set_run), basic_lilliput_query_metrics()), UNPROVIDED);
        format(stream, $str41$____Unanswerable____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(query_set_run), basic_lilliput_query_metrics()), UNPROVIDED);
        format(stream, $str42$____Open_Good___);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(lilliput_open_good_query_set_run(query_set_run), basic_lilliput_query_metrics()), UNPROVIDED);
        format(stream, $str43$____Open_No_Good___);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(lilliput_open_no_good_query_set_run(query_set_run), basic_lilliput_query_metrics()), UNPROVIDED);
        format(stream, $str44$____Closed_Good___);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(lilliput_closed_good_query_set_run(query_set_run), basic_lilliput_query_metrics()), UNPROVIDED);
        format(stream, $str45$____Closed_No_Good___);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(lilliput_closed_no_good_query_set_run(query_set_run), basic_lilliput_query_metrics()), UNPROVIDED);
        SubLObject cdolist_list_var = standard_lilliput_query_metrics();
        SubLObject metric = NIL;
        metric = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lilliput_generate_sorted_property_display(query_set_run, name, metric, corpus, display);
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        } 
        return name;
    }

    public static final SubLObject lilliput_generate_sorted_property_display_alt(SubLObject experiment, SubLObject name, SubLObject property, SubLObject corpus, SubLObject display) {
        if (corpus == UNPROVIDED) {
            corpus = $$$Lilliput_Training;
        }
        if (display == UNPROVIDED) {
            display = $str_alt37$_0;
        }
        return plot_generation.kbq_generate_sorted_property_display(experiment, property, $list_alt46, listS($PLOT_TITLE, new SubLObject[]{ cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[]{ $str_alt48$_, format_nil.format_nil_a_no_copy(name), $str_alt49$_n, format_nil.format_nil_a_no_copy(property) }), $XLABEL, $$$Sorted_Queries, $YLABEL, leviathan.ylabel_for_property(property), $list_alt53 }), display);
    }

    public static SubLObject lilliput_generate_sorted_property_display(final SubLObject experiment, final SubLObject name, final SubLObject property, SubLObject corpus, SubLObject display) {
        if (corpus == UNPROVIDED) {
            corpus = $$$Lilliput_Training;
        }
        if (display == UNPROVIDED) {
            display = $str37$_0;
        }
        return plot_generation.kbq_generate_sorted_property_display(experiment, property, $list46, listS($PLOT_TITLE, new SubLObject[]{ cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[]{ $$$_, format_nil.format_nil_a_no_copy(name), $str49$_n, format_nil.format_nil_a_no_copy(property) }), $XLABEL, $$$Sorted_Queries, $YLABEL, leviathan.ylabel_for_property(property), $list53 }), display);
    }

    public static final SubLObject analyze_lilliput_experiments_alt(SubLObject baseline_denoting_symbol, SubLObject experiment_denoting_symbol, SubLObject display_graphsP, SubLObject metrics, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (display_graphsP == UNPROVIDED) {
            display_graphsP = T;
        }
        if (metrics == UNPROVIDED) {
            metrics = com.cyc.cycjava.cycl.inference.lilliput.basic_lilliput_query_metrics();
        }
        if (corpus == UNPROVIDED) {
            corpus = $$$Lilliput_Training;
        }
        if (display == UNPROVIDED) {
            display = $str_alt37$_0;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(baseline_denoting_symbol, BOUND_SYMBOL_P);
            SubLTrampolineFile.checkType(experiment_denoting_symbol, BOUND_SYMBOL_P);
            {
                SubLObject baseline = symbol_value(baseline_denoting_symbol);
                SubLObject baseline_name = symbol_name(baseline_denoting_symbol);
                SubLObject experiment = symbol_value(experiment_denoting_symbol);
                SubLObject experiment_name = symbol_name(experiment_denoting_symbol);
                SubLObject open_good_baseline = com.cyc.cycjava.cycl.inference.lilliput.lilliput_open_good_query_set_run(baseline);
                SubLObject open_good_experiment = com.cyc.cycjava.cycl.inference.lilliput.lilliput_open_good_query_set_run(experiment);
                SubLObject open_no_good_baseline = com.cyc.cycjava.cycl.inference.lilliput.lilliput_open_no_good_query_set_run(baseline);
                SubLObject open_no_good_experiment = com.cyc.cycjava.cycl.inference.lilliput.lilliput_open_no_good_query_set_run(experiment);
                SubLObject closed_good_baseline = com.cyc.cycjava.cycl.inference.lilliput.lilliput_closed_good_query_set_run(baseline);
                SubLObject closed_good_experiment = com.cyc.cycjava.cycl.inference.lilliput.lilliput_closed_good_query_set_run(experiment);
                SubLObject closed_no_good_baseline = com.cyc.cycjava.cycl.inference.lilliput.lilliput_closed_no_good_query_set_run(baseline);
                SubLObject closed_no_good_experiment = com.cyc.cycjava.cycl.inference.lilliput.lilliput_closed_no_good_query_set_run(experiment);
                thread.resetMultipleValues();
                {
                    SubLObject mutual_baseline = kbq_query_run.kbq_mutually_answerable_query_set_runs(baseline, experiment);
                    SubLObject mutual_experiment = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    format(stream, $str_alt54$____Answerability_analysis____);
                    thread.resetMultipleValues();
                    {
                        SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(baseline, experiment);
                        SubLObject mutual = thread.secondMultipleValue();
                        SubLObject only_2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        format(T, $str_alt55$Total_____________s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(open_good_baseline, open_good_experiment);
                        SubLObject mutual = thread.secondMultipleValue();
                        SubLObject only_2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        format(T, $str_alt56$Open_Good_________s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(open_no_good_baseline, open_no_good_experiment);
                        SubLObject mutual = thread.secondMultipleValue();
                        SubLObject only_2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        format(T, $str_alt57$Open_No_Good______s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(closed_good_baseline, closed_good_experiment);
                        SubLObject mutual = thread.secondMultipleValue();
                        SubLObject only_2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        format(T, $str_alt58$Closed_Good_______s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(closed_no_good_baseline, closed_no_good_experiment);
                        SubLObject mutual = thread.secondMultipleValue();
                        SubLObject only_2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        format(T, $str_alt59$Closed_No_Good____s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
                    }
                    format(stream, $str_alt39$____Basic_analysis____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(baseline, experiment, metrics));
                    format(stream, $str_alt60$____Mutually_Answerable____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(mutual_baseline, mutual_experiment, metrics));
                    format(stream, $str_alt61$____Mutually_Answerable_Open_Good);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(com.cyc.cycjava.cycl.inference.lilliput.lilliput_open_good_query_set_run(mutual_baseline), com.cyc.cycjava.cycl.inference.lilliput.lilliput_open_good_query_set_run(mutual_experiment), metrics));
                    format(stream, $str_alt62$____Mutually_Answerable_Closed_Go);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(com.cyc.cycjava.cycl.inference.lilliput.lilliput_closed_good_query_set_run(mutual_baseline), com.cyc.cycjava.cycl.inference.lilliput.lilliput_closed_good_query_set_run(mutual_experiment), metrics));
                    format(stream, $str_alt40$____Answerable____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(baseline), kbq_query_run.kbq_answerable_query_set_run(experiment), metrics));
                    format(stream, $str_alt41$____Unanswerable____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(baseline), kbq_query_run.kbq_unanswerable_query_set_run(experiment), metrics));
                    format(stream, $str_alt63$____Open_Good____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(open_good_baseline, open_good_experiment, metrics));
                    format(stream, $str_alt64$____Open_No_Good____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(open_no_good_baseline, open_no_good_experiment, metrics));
                    format(stream, $str_alt65$____Closed_Good____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(closed_good_baseline, closed_good_experiment, metrics));
                    format(stream, $str_alt66$____Closed_No_Good____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(closed_no_good_baseline, closed_no_good_experiment, metrics));
                    if (NIL != display_graphsP) {
                        {
                            SubLObject cdolist_list_var = $list_alt68;
                            SubLObject metric = NIL;
                            for (metric = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , metric = cdolist_list_var.first()) {
                                {
                                    SubLObject cdolist_list_var_2 = $list_alt67;
                                    SubLObject sort_by = NIL;
                                    for (sort_by = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , sort_by = cdolist_list_var_2.first()) {
                                        com.cyc.cycjava.cycl.inference.lilliput.lilliput_generate_sorted_property_comparison(baseline, experiment, baseline_name, experiment_name, metric, sort_by, corpus, display);
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

    public static SubLObject analyze_lilliput_experiments(final SubLObject baseline_denoting_symbol, final SubLObject experiment_denoting_symbol, SubLObject display_graphsP, SubLObject metrics, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (display_graphsP == UNPROVIDED) {
            display_graphsP = T;
        }
        if (metrics == UNPROVIDED) {
            metrics = basic_lilliput_query_metrics();
        }
        if (corpus == UNPROVIDED) {
            corpus = $$$Lilliput_Training;
        }
        if (display == UNPROVIDED) {
            display = $str37$_0;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != special_variable_state.bound_symbol_p(baseline_denoting_symbol) : "! special_variable_state.bound_symbol_p(baseline_denoting_symbol) " + ("special_variable_state.bound_symbol_p(baseline_denoting_symbol) " + "CommonSymbols.NIL != special_variable_state.bound_symbol_p(baseline_denoting_symbol) ") + baseline_denoting_symbol;
        assert NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) : "! special_variable_state.bound_symbol_p(experiment_denoting_symbol) " + ("special_variable_state.bound_symbol_p(experiment_denoting_symbol) " + "CommonSymbols.NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) ") + experiment_denoting_symbol;
        final SubLObject baseline = symbol_value(baseline_denoting_symbol);
        final SubLObject baseline_name = symbol_name(baseline_denoting_symbol);
        final SubLObject experiment = symbol_value(experiment_denoting_symbol);
        final SubLObject experiment_name = symbol_name(experiment_denoting_symbol);
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
        format(stream, $str54$____Answerability_analysis____);
        thread.resetMultipleValues();
        SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(baseline, experiment);
        SubLObject mutual = thread.secondMultipleValue();
        SubLObject only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        format(T, $str55$Total_____________s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(open_good_baseline, open_good_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        format(T, $str56$Open_Good_________s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(open_no_good_baseline, open_no_good_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        format(T, $str57$Open_No_Good______s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(closed_good_baseline, closed_good_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        format(T, $str58$Closed_Good_______s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(closed_no_good_baseline, closed_no_good_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        format(T, $str59$Closed_No_Good____s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
        format(stream, $str39$____Basic_analysis____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(baseline, experiment, metrics));
        format(stream, $str60$____Mutually_Answerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(mutual_baseline, mutual_experiment, metrics));
        format(stream, $str61$____Mutually_Answerable_Open_Good);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(lilliput_open_good_query_set_run(mutual_baseline), lilliput_open_good_query_set_run(mutual_experiment), metrics));
        format(stream, $str62$____Mutually_Answerable_Closed_Go);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(lilliput_closed_good_query_set_run(mutual_baseline), lilliput_closed_good_query_set_run(mutual_experiment), metrics));
        format(stream, $str40$____Answerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(baseline), kbq_query_run.kbq_answerable_query_set_run(experiment), metrics));
        format(stream, $str41$____Unanswerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(baseline), kbq_query_run.kbq_unanswerable_query_set_run(experiment), metrics));
        format(stream, $str63$____Open_Good____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(open_good_baseline, open_good_experiment, metrics));
        format(stream, $str64$____Open_No_Good____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(open_no_good_baseline, open_no_good_experiment, metrics));
        format(stream, $str65$____Closed_Good____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(closed_good_baseline, closed_good_experiment, metrics));
        format(stream, $str66$____Closed_No_Good____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(closed_no_good_baseline, closed_no_good_experiment, metrics));
        if (NIL != display_graphsP) {
            SubLObject cdolist_list_var = $list68;
            SubLObject metric = NIL;
            metric = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$2 = $list67;
                SubLObject sort_by = NIL;
                sort_by = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    lilliput_generate_sorted_property_comparison(baseline, experiment, baseline_name, experiment_name, metric, sort_by, corpus, display);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    sort_by = cdolist_list_var_$2.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                metric = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject lilliput_generate_sorted_property_comparison_alt(SubLObject baseline, SubLObject experiment, SubLObject baseline_name, SubLObject experiment_name, SubLObject property, SubLObject sort_by, SubLObject corpus, SubLObject display) {
        if (sort_by == UNPROVIDED) {
            sort_by = $BOTH;
        }
        if (corpus == UNPROVIDED) {
            corpus = $$$Lilliput_Training;
        }
        if (display == UNPROVIDED) {
            display = $str_alt37$_0;
        }
        return plot_generation.kbq_generate_sorted_property_comparison(baseline, experiment, property, listS($PLOT_TITLE, new SubLObject[]{ cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[]{ $str_alt70$__, format_nil.format_nil_a_no_copy(baseline_name), $str_alt71$_vs__, format_nil.format_nil_a_no_copy(experiment_name), $str_alt49$_n, format_nil.format_nil_a_no_copy(property) }), $XLABEL, $$$Sorted_Queries, $YLABEL, leviathan.ylabel_for_property(property), $BASELINE_KEY_LABEL, baseline_name, $EXPERIMENT_KEY_LABEL, experiment_name, $list_alt74 }), sort_by, display);
    }

    public static SubLObject lilliput_generate_sorted_property_comparison(final SubLObject baseline, final SubLObject experiment, final SubLObject baseline_name, final SubLObject experiment_name, final SubLObject property, SubLObject sort_by, SubLObject corpus, SubLObject display) {
        if (sort_by == UNPROVIDED) {
            sort_by = $BOTH;
        }
        if (corpus == UNPROVIDED) {
            corpus = $$$Lilliput_Training;
        }
        if (display == UNPROVIDED) {
            display = $str37$_0;
        }
        return plot_generation.kbq_generate_sorted_property_comparison(baseline, experiment, property, listS($PLOT_TITLE, new SubLObject[]{ cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[]{ $str70$__, format_nil.format_nil_a_no_copy(baseline_name), $str71$_vs__, format_nil.format_nil_a_no_copy(experiment_name), $str49$_n, format_nil.format_nil_a_no_copy(property) }), $XLABEL, $$$Sorted_Queries, $YLABEL, leviathan.ylabel_for_property(property), $BASELINE_KEY_LABEL, baseline_name, $EXPERIMENT_KEY_LABEL, experiment_name, $list74 }), sort_by, display);
    }

    /**
     * Like @xref kbq-hybridize-query-set-runs except takes a compare-func that takes all the query runs instead of just two at a time.
     */
    @LispMethod(comment = "Like @xref kbq-hybridize-query-set-runs except takes a compare-func that takes all the query runs instead of just two at a time.")
    public static final SubLObject kbq_hybridize_n_query_set_runs_alt(SubLObject query_set_runs, SubLObject compare_func, SubLObject comment, SubLObject tag) {
        if (compare_func == UNPROVIDED) {
            compare_func = KBQ_MEDIAN_QUERY_RUN;
        }
        if (comment == UNPROVIDED) {
            comment = $str_alt76$;
        }
        if (tag == UNPROVIDED) {
            tag = $ORIGIN;
        }
        {
            SubLObject tagged_query_set_runs = arete.kbq_tag_query_set_runs(query_set_runs, tag);
            SubLObject hybrid_query_runs = NIL;
            SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_queries(tagged_query_set_runs.first());
            SubLObject query = NIL;
            for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                {
                    SubLObject query_runs = kbq_query_run.kbq_lookup_query_runs(tagged_query_set_runs, query);
                    SubLObject best_query_run = funcall(compare_func, query_runs);
                    hybrid_query_runs = cons(best_query_run, hybrid_query_runs);
                }
            }
            {
                SubLObject hybrid_query_set_run = copy_list(tagged_query_set_runs.first());
                hybrid_query_runs = nreverse(hybrid_query_runs);
                hybrid_query_set_run = putf(hybrid_query_set_run, $QUERY_RUNS, hybrid_query_runs);
                hybrid_query_set_run = putf(hybrid_query_set_run, $COMMENT, comment);
                return hybrid_query_set_run;
            }
        }
    }

    /**
     * Like @xref kbq-hybridize-query-set-runs except takes a compare-func that takes all the query runs instead of just two at a time.
     */
    @LispMethod(comment = "Like @xref kbq-hybridize-query-set-runs except takes a compare-func that takes all the query runs instead of just two at a time.")
    public static SubLObject kbq_hybridize_n_query_set_runs(final SubLObject query_set_runs, SubLObject compare_func, SubLObject comment, SubLObject tag) {
        if (compare_func == UNPROVIDED) {
            compare_func = KBQ_MEDIAN_QUERY_RUN;
        }
        if (comment == UNPROVIDED) {
            comment = $str76$;
        }
        if (tag == UNPROVIDED) {
            tag = $ORIGIN;
        }
        final SubLObject tagged_query_set_runs = arete.kbq_tag_query_set_runs(query_set_runs, tag);
        SubLObject hybrid_query_runs = NIL;
        SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_queries(tagged_query_set_runs.first());
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject query_runs = kbq_query_run.kbq_lookup_query_runs(tagged_query_set_runs, query);
            final SubLObject best_query_run = funcall(compare_func, query_runs);
            hybrid_query_runs = cons(best_query_run, hybrid_query_runs);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        SubLObject hybrid_query_set_run = copy_list(tagged_query_set_runs.first());
        hybrid_query_runs = nreverse(hybrid_query_runs);
        hybrid_query_set_run = putf(hybrid_query_set_run, $QUERY_RUNS, hybrid_query_runs);
        hybrid_query_set_run = putf(hybrid_query_set_run, $COMMENT, comment);
        return hybrid_query_set_run;
    }

    public static final SubLObject kbq_median_query_run_alt(SubLObject query_runs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == oddp(length(query_runs))) {
                    Errors.error($str_alt79$Cannot_handle_even_numbers_of_que);
                }
            }
            return number_utilities.median(query_runs, KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME);
        }
    }

    public static SubLObject kbq_median_query_run(final SubLObject query_runs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == oddp(length(query_runs)))) {
            Errors.error($str79$Cannot_handle_even_numbers_of_que);
        }
        return number_utilities.median(query_runs, KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME, $ITEM);
    }

    /**
     * Generates and reifies N of each of the following categories of Lilliput trivial queries:
     * Open Good
     * Open No-Good
     * Closed Good
     * Closed No-good
     *
     * @param TRAINING?;
     * 		if T, this is a training corpus, if NIL, it's a blind corpus.
     * @param START;
     * 		start numbering the constants from START.
     */
    @LispMethod(comment = "Generates and reifies N of each of the following categories of Lilliput trivial queries:\r\nOpen Good\r\nOpen No-Good\r\nClosed Good\r\nClosed No-good\r\n\r\n@param TRAINING?;\r\n\t\tif T, this is a training corpus, if NIL, it\'s a blind corpus.\r\n@param START;\r\n\t\tstart numbering the constants from START.\nGenerates and reifies N of each of the following categories of Lilliput trivial queries:\nOpen Good\nOpen No-Good\nClosed Good\nClosed No-good")
    public static final SubLObject generate_lilliput_corpus_alt(SubLObject n, SubLObject trainingP, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject open_good = com.cyc.cycjava.cycl.inference.lilliput.lilliput_generate_query_sentences(n, UNPROVIDED);
                SubLObject open_no_good = thread.secondMultipleValue();
                SubLObject closed_good = thread.thirdMultipleValue();
                SubLObject closed_no_good = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return add(new SubLObject[]{ com.cyc.cycjava.cycl.inference.lilliput.lilliput_reify_queries(open_good, $$LilliputQuery_OpenGood, trainingP, start), com.cyc.cycjava.cycl.inference.lilliput.lilliput_reify_queries(open_no_good, $$LilliputQuery_OpenNoGood, trainingP, start), com.cyc.cycjava.cycl.inference.lilliput.lilliput_reify_queries(closed_good, $$LilliputQuery_ClosedGood, trainingP, start), com.cyc.cycjava.cycl.inference.lilliput.lilliput_reify_queries(closed_no_good, $$LilliputQuery_ClosedNoGood, trainingP, start) });
            }
        }
    }

    /**
     * Generates and reifies N of each of the following categories of Lilliput trivial queries:
     * Open Good
     * Open No-Good
     * Closed Good
     * Closed No-good
     *
     * @param TRAINING?;
     * 		if T, this is a training corpus, if NIL, it's a blind corpus.
     * @param START;
     * 		start numbering the constants from START.
     */
    @LispMethod(comment = "Generates and reifies N of each of the following categories of Lilliput trivial queries:\r\nOpen Good\r\nOpen No-Good\r\nClosed Good\r\nClosed No-good\r\n\r\n@param TRAINING?;\r\n\t\tif T, this is a training corpus, if NIL, it\'s a blind corpus.\r\n@param START;\r\n\t\tstart numbering the constants from START.\nGenerates and reifies N of each of the following categories of Lilliput trivial queries:\nOpen Good\nOpen No-Good\nClosed Good\nClosed No-good")
    public static SubLObject generate_lilliput_corpus(final SubLObject n, final SubLObject trainingP, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject open_good = lilliput_generate_query_sentences(n, UNPROVIDED);
        final SubLObject open_no_good = thread.secondMultipleValue();
        final SubLObject closed_good = thread.thirdMultipleValue();
        final SubLObject closed_no_good = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return add(new SubLObject[]{ lilliput_reify_queries(open_good, $$LilliputQuery_OpenGood, trainingP, start), lilliput_reify_queries(open_no_good, $$LilliputQuery_OpenNoGood, trainingP, start), lilliput_reify_queries(closed_good, $$LilliputQuery_ClosedGood, trainingP, start), lilliput_reify_queries(closed_no_good, $$LilliputQuery_ClosedNoGood, trainingP, start) });
    }

    /**
     * for testing
     */
    @LispMethod(comment = "for testing")
    public static final SubLObject lilliput_valid_terms_for_all_test_queries_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = lilliput_caches.all_valid_lilliput_queries();
                SubLObject query = NIL;
                for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                    {
                        SubLObject argnum = NIL;
                        for (argnum = ZERO_INTEGER; argnum.numL(FOUR_INTEGER); argnum = add(argnum, ONE_INTEGER)) {
                            {
                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($lilliput_mt$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        {
                                            SubLObject terms = com.cyc.cycjava.cycl.inference.lilliput.lilliput_valid_terms_for_query_argnum(query, argnum);
                                            result = nconc(terms, result);
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * for testing
     */
    @LispMethod(comment = "for testing")
    public static SubLObject lilliput_valid_terms_for_all_test_queries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = lilliput_caches.all_valid_lilliput_queries();
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject argnum;
            SubLObject mt_var;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject _prev_bind_3;
            SubLObject terms;
            for (argnum = NIL, argnum = ZERO_INTEGER; argnum.numL(FOUR_INTEGER); argnum = add(argnum, ONE_INTEGER)) {
                mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($lilliput_mt$.getGlobalValue());
                _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    terms = lilliput_valid_terms_for_query_argnum(query, argnum);
                    result = nconc(terms, result);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * for testing
     */
    @LispMethod(comment = "for testing")
    public static final SubLObject lilliput_instantiate_all_queries_once_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = lilliput_caches.all_valid_lilliput_queries();
                SubLObject query = NIL;
                for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($lilliput_mt$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject open_query = com.cyc.cycjava.cycl.inference.lilliput.lilliput_partially_instantiate_query(query);
                                    result = cons(open_query, result);
                                    {
                                        SubLObject closed_query = com.cyc.cycjava.cycl.inference.lilliput.lilliput_fully_instantiate_query(query);
                                        SubLObject var = closed_query;
                                        if (NIL != var) {
                                            result = cons(var, result);
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
                return nreverse(result);
            }
        }
    }

    /**
     * for testing
     */
    @LispMethod(comment = "for testing")
    public static SubLObject lilliput_instantiate_all_queries_once() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = lilliput_caches.all_valid_lilliput_queries();
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($lilliput_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject open_query = lilliput_partially_instantiate_query(query);
                result = cons(open_query, result);
                final SubLObject var;
                final SubLObject closed_query = var = lilliput_fully_instantiate_query(query);
                if (NIL != var) {
                    result = cons(var, result);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject lilliput_generate_query_sentences_alt(SubLObject n, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        {
            SubLObject open_good = NIL;
            SubLObject open_no_good = NIL;
            SubLObject closed_good = NIL;
            SubLObject closed_no_good = NIL;
            while ((((NIL != list_utilities.lengthL(open_good, n, UNPROVIDED)) || (NIL != list_utilities.lengthL(open_no_good, n, UNPROVIDED))) || (NIL != list_utilities.lengthL(closed_good, n, UNPROVIDED))) || (NIL != list_utilities.lengthL(closed_no_good, n, UNPROVIDED))) {
                {
                    SubLObject sentence = (NIL != number_utilities.true_with_probability($float$0_5)) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.lilliput.lilliput_partially_instantiate_random_query())) : com.cyc.cycjava.cycl.inference.lilliput.lilliput_fully_instantiate_random_query();
                    if (NIL != sentence) {
                        {
                            SubLObject openP = makeBoolean(NIL == closedP(sentence, UNPROVIDED));
                            SubLObject goodP = list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.lilliput.lilliput_cyc_query(sentence));
                            if (NIL != openP) {
                                if (NIL != goodP) {
                                    if (NIL != verboseP) {
                                        format(T, $$$o);
                                        force_output(UNPROVIDED);
                                    }
                                    open_good = cons(sentence, open_good);
                                } else {
                                    if (NIL != verboseP) {
                                        format(T, $str_alt83$_);
                                        force_output(UNPROVIDED);
                                    }
                                    open_no_good = cons(sentence, open_no_good);
                                }
                            } else {
                                if (NIL != goodP) {
                                    if (NIL != verboseP) {
                                        format(T, $str_alt84$_);
                                        force_output(UNPROVIDED);
                                    }
                                    closed_good = cons(sentence, closed_good);
                                } else {
                                    if (NIL != verboseP) {
                                        format(T, $$$x);
                                        force_output(UNPROVIDED);
                                    }
                                    closed_no_good = cons(sentence, closed_no_good);
                                }
                            }
                        }
                    }
                }
            } 
            open_good = list_utilities.first_n(n, open_good);
            open_no_good = list_utilities.first_n(n, open_no_good);
            closed_good = list_utilities.first_n(n, closed_good);
            closed_no_good = list_utilities.first_n(n, closed_no_good);
            return values(open_good, open_no_good, closed_good, closed_no_good);
        }
    }

    public static SubLObject lilliput_generate_query_sentences(final SubLObject n, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        SubLObject open_good = NIL;
        SubLObject open_no_good = NIL;
        SubLObject closed_good = NIL;
        SubLObject closed_no_good = NIL;
        while ((((NIL != list_utilities.lengthL(open_good, n, UNPROVIDED)) || (NIL != list_utilities.lengthL(open_no_good, n, UNPROVIDED))) || (NIL != list_utilities.lengthL(closed_good, n, UNPROVIDED))) || (NIL != list_utilities.lengthL(closed_no_good, n, UNPROVIDED))) {
            final SubLObject sentence = (NIL != number_utilities.true_with_probability($float$0_5)) ? lilliput_partially_instantiate_random_query() : lilliput_fully_instantiate_random_query();
            if (NIL != sentence) {
                final SubLObject openP = makeBoolean(NIL == closedP(sentence, UNPROVIDED));
                final SubLObject goodP = list_utilities.sublisp_boolean(lilliput_cyc_query(sentence));
                if (NIL != openP) {
                    if (NIL != goodP) {
                        if (NIL != verboseP) {
                            format(T, $$$o);
                            force_output(UNPROVIDED);
                        }
                        open_good = cons(sentence, open_good);
                    } else {
                        if (NIL != verboseP) {
                            format(T, $str84$_);
                            force_output(UNPROVIDED);
                        }
                        open_no_good = cons(sentence, open_no_good);
                    }
                } else
                    if (NIL != goodP) {
                        if (NIL != verboseP) {
                            format(T, $str85$_);
                            force_output(UNPROVIDED);
                        }
                        closed_good = cons(sentence, closed_good);
                    } else {
                        if (NIL != verboseP) {
                            format(T, $$$x);
                            force_output(UNPROVIDED);
                        }
                        closed_no_good = cons(sentence, closed_no_good);
                    }

            }
        } 
        open_good = list_utilities.first_n(n, open_good);
        open_no_good = list_utilities.first_n(n, open_no_good);
        closed_good = list_utilities.first_n(n, closed_good);
        closed_no_good = list_utilities.first_n(n, closed_no_good);
        return values(open_good, open_no_good, closed_good, closed_no_good);
    }

    public static final SubLObject lilliput_partially_instantiate_random_query_alt() {
        return com.cyc.cycjava.cycl.inference.lilliput.lilliput_partially_instantiate_query(com.cyc.cycjava.cycl.inference.lilliput.lilliput_random_query());
    }

    public static SubLObject lilliput_partially_instantiate_random_query() {
        return lilliput_partially_instantiate_query(lilliput_random_query());
    }

    public static final SubLObject lilliput_partially_instantiate_query_alt(SubLObject query) {
        {
            SubLObject instantiable_argnums = com.cyc.cycjava.cycl.inference.lilliput.lilliput_instantiable_argnums(query);
            SubLObject chosen_argnum = list_utilities.random_element(instantiable_argnums);
            return com.cyc.cycjava.cycl.inference.lilliput.lilliput_wff_instantiate_query_argnums(query, list(chosen_argnum));
        }
    }

    public static SubLObject lilliput_partially_instantiate_query(final SubLObject query) {
        final SubLObject instantiable_argnums = lilliput_instantiable_argnums(query);
        final SubLObject chosen_argnum = list_utilities.random_element(instantiable_argnums);
        return lilliput_wff_instantiate_query_argnums(query, list(chosen_argnum));
    }

    public static final SubLObject lilliput_fully_instantiate_random_query_alt() {
        return com.cyc.cycjava.cycl.inference.lilliput.lilliput_fully_instantiate_query(com.cyc.cycjava.cycl.inference.lilliput.lilliput_random_query());
    }

    public static SubLObject lilliput_fully_instantiate_random_query() {
        return lilliput_fully_instantiate_query(lilliput_random_query());
    }

    public static final SubLObject lilliput_fully_instantiate_query_alt(SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject instantiable_argnums = com.cyc.cycjava.cycl.inference.lilliput.lilliput_instantiable_argnums(query);
                SubLObject some_arg_left_openP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == some_arg_left_openP) {
                    return com.cyc.cycjava.cycl.inference.lilliput.lilliput_wff_instantiate_query_argnums(query, instantiable_argnums);
                }
            }
            return NIL;
        }
    }

    public static SubLObject lilliput_fully_instantiate_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject instantiable_argnums = lilliput_instantiable_argnums(query);
        final SubLObject some_arg_left_openP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == some_arg_left_openP) {
            return lilliput_wff_instantiate_query_argnums(query, instantiable_argnums);
        }
        return NIL;
    }

    /**
     *
     *
     * @return 0 listp; the list of instantiable argnums of QUERY.
     * @return 1 booleanp; whether there were any argnums that were open but not instantiable.
     */
    @LispMethod(comment = "@return 0 listp; the list of instantiable argnums of QUERY.\r\n@return 1 booleanp; whether there were any argnums that were open but not instantiable.")
    public static final SubLObject lilliput_instantiable_argnums_alt(SubLObject query) {
        {
            SubLObject argnums = NIL;
            SubLObject some_arg_left_openP = NIL;
            SubLObject sentence = kb_query.kbq_sentence(query);
            SubLObject query_type = com.cyc.cycjava.cycl.inference.lilliput.lilliput_query_type(query);
            SubLObject cdolist_list_var = cycl_utilities.variable_argnums(sentence, symbol_function($sym86$EL_VAR_));
            SubLObject argnum = NIL;
            for (argnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argnum = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.inference.lilliput.lilliput_leave_arg_place_openP(query_type, argnum)) {
                    some_arg_left_openP = T;
                } else {
                    argnums = cons(argnum, argnums);
                }
            }
            return values(argnums, some_arg_left_openP);
        }
    }

    /**
     *
     *
     * @return 0 listp; the list of instantiable argnums of QUERY.
     * @return 1 booleanp; whether there were any argnums that were open but not instantiable.
     */
    @LispMethod(comment = "@return 0 listp; the list of instantiable argnums of QUERY.\r\n@return 1 booleanp; whether there were any argnums that were open but not instantiable.")
    public static SubLObject lilliput_instantiable_argnums(final SubLObject query) {
        SubLObject argnums = NIL;
        SubLObject some_arg_left_openP = NIL;
        final SubLObject sentence = kb_query.kbq_sentence(query);
        final SubLObject query_type = lilliput_query_type(query);
        SubLObject cdolist_list_var = cycl_utilities.variable_argnums(sentence, symbol_function($sym87$EL_VAR_));
        SubLObject argnum = NIL;
        argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != lilliput_leave_arg_place_openP(query_type, argnum)) {
                some_arg_left_openP = T;
            } else {
                argnums = cons(argnum, argnums);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        } 
        return values(argnums, some_arg_left_openP);
    }

    public static final SubLObject lilliput_wff_instantiate_query_argnums_alt(SubLObject query, SubLObject argnums) {
        {
            SubLObject sentence = NIL;
            while (!((NIL != sentence) && (NIL != wff.el_wffP(sentence, $lilliput_mt$.getGlobalValue(), UNPROVIDED)))) {
                sentence = com.cyc.cycjava.cycl.inference.lilliput.lilliput_instantiate_query_argnums(query, argnums);
            } 
            return sentence;
        }
    }

    public static SubLObject lilliput_wff_instantiate_query_argnums(final SubLObject query, final SubLObject argnums) {
        SubLObject sentence;
        for (sentence = NIL; (NIL == sentence) || (NIL == wff.el_wffP(sentence, $lilliput_mt$.getGlobalValue(), UNPROVIDED)); sentence = lilliput_instantiate_query_argnums(query, argnums)) {
        }
        return sentence;
    }

    /**
     * Instantiates ARGNUMS of QUERY's sentence (which is assumed to be a variable) with some
     * term from the domain, via weighted random selection.
     */
    @LispMethod(comment = "Instantiates ARGNUMS of QUERY\'s sentence (which is assumed to be a variable) with some\r\nterm from the domain, via weighted random selection.\nInstantiates ARGNUMS of QUERY\'s sentence (which is assumed to be a variable) with some\nterm from the domain, via weighted random selection.")
    public static final SubLObject lilliput_instantiate_query_argnums_alt(SubLObject query, SubLObject argnums) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence = kb_query.kbq_sentence(query);
                SubLObject cdolist_list_var = argnums;
                SubLObject argnum = NIL;
                for (argnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argnum = cdolist_list_var.first()) {
                    {
                        SubLObject valid_terms = com.cyc.cycjava.cycl.inference.lilliput.lilliput_valid_terms_for_query_argnum(query, argnum);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == valid_terms) {
                                Errors.error($str_alt87$could_not_find_any_valid_terms_fo, argnum, query);
                            }
                        }
                        {
                            SubLObject chosen_term = com.cyc.cycjava.cycl.inference.lilliput.num_index_weighted_instantiation(valid_terms);
                            sentence = replace_formula_arg(argnum, chosen_term, sentence);
                        }
                    }
                }
                return sentence;
            }
        }
    }

    /**
     * Instantiates ARGNUMS of QUERY's sentence (which is assumed to be a variable) with some
     * term from the domain, via weighted random selection.
     */
    @LispMethod(comment = "Instantiates ARGNUMS of QUERY\'s sentence (which is assumed to be a variable) with some\r\nterm from the domain, via weighted random selection.\nInstantiates ARGNUMS of QUERY\'s sentence (which is assumed to be a variable) with some\nterm from the domain, via weighted random selection.")
    public static SubLObject lilliput_instantiate_query_argnums(final SubLObject query, final SubLObject argnums) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = kb_query.kbq_sentence(query);
        SubLObject cdolist_list_var = argnums;
        SubLObject argnum = NIL;
        argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject valid_terms = lilliput_valid_terms_for_query_argnum(query, argnum);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == valid_terms)) {
                Errors.error($str88$could_not_find_any_valid_terms_fo, argnum, query);
            }
            final SubLObject chosen_term = num_index_weighted_instantiation(valid_terms);
            sentence = replace_formula_arg(argnum, chosen_term, sentence);
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        } 
        return sentence;
    }

    public static final SubLObject lilliput_valid_terms_for_query_argnum_alt(SubLObject query, SubLObject argnum) {
        {
            SubLObject query_type = com.cyc.cycjava.cycl.inference.lilliput.lilliput_query_type(query);
            if (NIL != list_utilities.member_eqP(query_type, $lilliput_default_query_collections$.getGlobalValue())) {
                return com.cyc.cycjava.cycl.inference.lilliput.lilliput_valid_terms_for_default_query(query, argnum);
            } else {
                if (query_type == $lilliput_master_query_collection$.getGlobalValue()) {
                    return Errors.error($str_alt88$got_an_unsorted_query__s, query);
                } else {
                    return com.cyc.cycjava.cycl.inference.lilliput.lilliput_valid_terms_for_argnum(query_type, argnum);
                }
            }
        }
    }

    public static SubLObject lilliput_valid_terms_for_query_argnum(final SubLObject query, final SubLObject argnum) {
        final SubLObject query_type = lilliput_query_type(query);
        if (NIL != list_utilities.member_eqP(query_type, $lilliput_default_query_collections$.getGlobalValue())) {
            return lilliput_valid_terms_for_default_query(query, argnum);
        }
        if (query_type.eql($lilliput_master_query_collection$.getGlobalValue())) {
            return Errors.error($str89$got_an_unsorted_query__s, query);
        }
        return lilliput_valid_terms_for_argnum(query_type, argnum);
    }

    public static final SubLObject lilliput_valid_terms_for_default_query_alt(SubLObject query, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence = kb_query.kbq_sentence(query);
                SubLTrampolineFile.checkType(sentence, CYCL_ATOMIC_SENTENCE_P);
                {
                    SubLObject pred = cycl_utilities.atomic_sentence_predicate(sentence);
                    SubLObject arg_isas = genls.min_cols(kb_accessors.argn_isa(pred, argnum, $lilliput_mt$.getGlobalValue()), $lilliput_mt$.getGlobalValue(), UNPROVIDED);
                    if (NIL != arg_isas) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == list_utilities.singletonP(arg_isas)) {
                                Errors.error($str_alt90$Expected_only_one_arg_constraint_, arg_isas);
                            }
                        }
                        {
                            SubLObject col = arg_isas.first();
                            return lilliput_caches.lilliput_all_instances(col);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject lilliput_valid_terms_for_default_query(final SubLObject query, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = kb_query.kbq_sentence(query);
        assert NIL != cycl_grammar.cycl_atomic_sentence_p(sentence) : "! cycl_grammar.cycl_atomic_sentence_p(sentence) " + ("cycl_grammar.cycl_atomic_sentence_p(sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_atomic_sentence_p(sentence) ") + sentence;
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(sentence);
        final SubLObject arg_isas = genls.min_cols(kb_accessors.argn_isa(pred, argnum, $lilliput_mt$.getGlobalValue()), $lilliput_mt$.getGlobalValue(), UNPROVIDED);
        if (NIL != arg_isas) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(arg_isas))) {
                Errors.error($str91$Expected_only_one_arg_constraint_, arg_isas);
            }
            final SubLObject col = arg_isas.first();
            return lilliput_caches.lilliput_all_instances(col);
        }
        return NIL;
    }

    public static final SubLObject lilliput_valid_terms_for_argnum_alt(SubLObject query_type, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($lilliput_mt$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject domain = kb_mapping_utilities.pred_arg_values(query_type, $$correspondingDomainInArg, argnum, ONE_INTEGER, THREE_INTEGER, TWO_INTEGER, UNPROVIDED).first();
                            if (NIL != domain) {
                                if ((NIL != nart_handles.nart_p(domain)) && ($$CollectionSubsetFn == cycl_utilities.nat_functor(domain))) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject v_bindings = unification.unify(cycl_utilities.nat_arg2(domain, UNPROVIDED), $list_alt93, UNPROVIDED, UNPROVIDED);
                                        SubLObject justification = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL == v_bindings) {
                                                Errors.error($str_alt94$unhandled___CollectionSubsetFn_do);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject collection = cycl_utilities.nat_arg1(domain, UNPROVIDED);
                                        result = copy_list(lilliput_caches.lilliput_all_instances_if_tkb_fort(collection));
                                    }
                                } else {
                                    if (NIL != fort_types_interface.collection_p(domain)) {
                                        result = copy_list(lilliput_caches.lilliput_all_instances(domain));
                                    } else {
                                        Errors.error($str_alt95$unexpected_domain_type__s, domain);
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
                return result;
            }
        }
    }

    public static SubLObject lilliput_valid_terms_for_argnum(final SubLObject query_type, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($lilliput_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject domain = kb_mapping_utilities.pred_arg_values(query_type, $$correspondingDomainInArg, argnum, ONE_INTEGER, THREE_INTEGER, TWO_INTEGER, UNPROVIDED, UNPROVIDED).first();
            if (NIL != domain) {
                if ((NIL != nart_handles.nart_p(domain)) && $$CollectionSubsetFn.eql(cycl_utilities.nat_functor(domain))) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification.unify(cycl_utilities.nat_arg2(domain, UNPROVIDED), $list94, UNPROVIDED, UNPROVIDED);
                    final SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == v_bindings)) {
                        Errors.error($str95$unhandled___CollectionSubsetFn_do);
                    }
                    final SubLObject collection = cycl_utilities.nat_arg1(domain, UNPROVIDED);
                    result = copy_list(lilliput_caches.lilliput_all_instances_if_tkb_fort(collection));
                } else
                    if (NIL != fort_types_interface.collection_p(domain)) {
                        result = copy_list(lilliput_caches.lilliput_all_instances(domain));
                    } else {
                        Errors.error($str96$unexpected_domain_type__s, domain);
                    }

            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject num_index_weighted_instantiation_alt(SubLObject fort_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vector = com.cyc.cycjava.cycl.inference.lilliput.num_index_weighted_vector(fort_list);
                SubLObject max_weight = second(aref(vector, number_utilities.f_1_(length(vector))));
                SubLObject random_weight = random.random(max_weight);
                thread.resetMultipleValues();
                {
                    SubLObject lower_bound = vector_utilities.binary_search_vector_range(random_weight, vector, symbol_function($sym96$_), symbol_function($sym97$_), symbol_function(SECOND), UNPROVIDED);
                    SubLObject upper_bound = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject chosen_fort = aref(vector, lower_bound).first();
                        return chosen_fort;
                    }
                }
            }
        }
    }

    public static SubLObject num_index_weighted_instantiation(final SubLObject fort_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vector = num_index_weighted_vector(fort_list);
        final SubLObject max_weight = second(aref(vector, number_utilities.f_1_(length(vector))));
        final SubLObject random_weight = random.random(max_weight);
        thread.resetMultipleValues();
        final SubLObject lower_bound = vector_utilities.binary_search_vector_range(random_weight, vector, symbol_function($sym97$_), symbol_function($sym98$_), symbol_function(SECOND), UNPROVIDED);
        final SubLObject upper_bound = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject chosen_fort = aref(vector, lower_bound).first();
        return chosen_fort;
    }

    public static final SubLObject num_index_weighted_vector_alt(SubLObject fort_list) {
        {
            SubLObject vector = make_vector(length(fort_list), UNPROVIDED);
            SubLObject count = ZERO_INTEGER;
            SubLObject list_var = NIL;
            SubLObject fort = NIL;
            SubLObject i = NIL;
            for (list_var = fort_list, fort = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , fort = list_var.first() , i = add(ONE_INTEGER, i)) {
                count = add(count, kb_indexing.num_index(fort));
                set_aref(vector, i, list(fort, count));
            }
            return vector;
        }
    }

    public static SubLObject num_index_weighted_vector(final SubLObject fort_list) {
        final SubLObject vector = make_vector(length(fort_list), UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        SubLObject list_var = NIL;
        SubLObject fort = NIL;
        SubLObject i = NIL;
        list_var = fort_list;
        fort = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , fort = list_var.first() , i = add(ONE_INTEGER, i)) {
            count = add(count, kb_indexing.num_index(fort));
            set_aref(vector, i, list(fort, count));
        }
        return vector;
    }

    /**
     * Reifies each of SENTENCES as a KB query, making each one an instance of COL.
     */
    @LispMethod(comment = "Reifies each of SENTENCES as a KB query, making each one an instance of COL.")
    public static final SubLObject lilliput_reify_queries_alt(SubLObject sentences, SubLObject col, SubLObject trainingP, SubLObject start) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject list_var = NIL;
            SubLObject sentence = NIL;
            SubLObject i = NIL;
            for (list_var = sentences, sentence = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (NIL != com.cyc.cycjava.cycl.inference.lilliput.lilliput_reify_query(sentence, col, trainingP, add(start, i))) {
                    count = add(count, ONE_INTEGER);
                }
            }
            return count;
        }
    }

    /**
     * Reifies each of SENTENCES as a KB query, making each one an instance of COL.
     */
    @LispMethod(comment = "Reifies each of SENTENCES as a KB query, making each one an instance of COL.")
    public static SubLObject lilliput_reify_queries(final SubLObject sentences, final SubLObject col, final SubLObject trainingP, final SubLObject start) {
        SubLObject count = ZERO_INTEGER;
        SubLObject list_var = NIL;
        SubLObject sentence = NIL;
        SubLObject i = NIL;
        list_var = sentences;
        sentence = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (NIL != lilliput_reify_query(sentence, col, trainingP, add(start, i))) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    /**
     * Reifies SENTENCE as a KB query, making it an instance of COL.
     * Uses N and COL as identifiers to construct the name of the constant.
     */
    @LispMethod(comment = "Reifies SENTENCE as a KB query, making it an instance of COL.\r\nUses N and COL as identifiers to construct the name of the constant.\nReifies SENTENCE as a KB query, making it an instance of COL.\nUses N and COL as identifiers to construct the name of the constant.")
    public static final SubLObject lilliput_reify_query_alt(SubLObject sentence, SubLObject col, SubLObject trainingP, SubLObject n) {
        {
            SubLObject const_name = cconcatenate(constants_high.constant_name(col), new SubLObject[]{ $str_alt99$_, string_utilities.str(n) });
            SubLObject query_const = ke.ke_create_now(const_name, UNPROVIDED);
            return makeBoolean(((NIL != ke.ke_assert_now(list($$isa, query_const, col), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED)) && (NIL != ke.ke_assert_now(kb_query.kbq_assertible_query_spec_sentence(sentence, query_const), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED))) && (NIL != (NIL != trainingP ? ((SubLObject) (ke.ke_assert_now(listS($$isa, query_const, $list_alt103), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED))) : ke.ke_assert_now(listS($$isa, query_const, $list_alt104), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED))));
        }
    }

    /**
     * Reifies SENTENCE as a KB query, making it an instance of COL.
     * Uses N and COL as identifiers to construct the name of the constant.
     */
    @LispMethod(comment = "Reifies SENTENCE as a KB query, making it an instance of COL.\r\nUses N and COL as identifiers to construct the name of the constant.\nReifies SENTENCE as a KB query, making it an instance of COL.\nUses N and COL as identifiers to construct the name of the constant.")
    public static SubLObject lilliput_reify_query(final SubLObject sentence, final SubLObject col, final SubLObject trainingP, final SubLObject n) {
        final SubLObject const_name = cconcatenate(constants_high.constant_name(col), new SubLObject[]{ $str100$_, string_utilities.str(n) });
        final SubLObject query_const = ke.ke_create_now(const_name, UNPROVIDED);
        return makeBoolean(((NIL != ke.ke_assert_now(list($$isa, query_const, col), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED)) && (NIL != ke.ke_assert_now(kb_query.kbq_assertible_query_spec_sentence(sentence, query_const), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED))) && (NIL != (NIL != trainingP ? ke.ke_assert_now(listS($$isa, query_const, $list104), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED) : ke.ke_assert_now(listS($$isa, query_const, $list105), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject lilliput_query_type_alt(SubLObject query) {
        return ask_utilities.query_variable($sym105$_COL, list($$and, listS($$nearestIsa, query, $list_alt108), list($$genls, $sym105$_COL, $lilliput_master_query_collection$.getGlobalValue())), $lilliput_mt$.getGlobalValue(), UNPROVIDED).first();
    }

    public static SubLObject lilliput_query_type(final SubLObject query) {
        return ask_utilities.query_variable($sym106$_COL, list($$and, listS($$nearestIsa, query, $list109), list($$genls, $sym106$_COL, $lilliput_master_query_collection$.getGlobalValue())), $lilliput_mt$.getGlobalValue(), UNPROVIDED).first();
    }

    public static final SubLObject lilliput_random_query_alt() {
        return list_utilities.random_element(lilliput_caches.all_valid_lilliput_queries());
    }

    public static SubLObject lilliput_random_query() {
        return list_utilities.random_element(lilliput_caches.all_valid_lilliput_queries());
    }

    public static final SubLObject lilliput_leave_arg_place_openP_alt(SubLObject query_type, SubLObject argnum) {
        return kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$leaveArgPlaceOpenInTestQueries, query_type, argnum, $lilliput_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lilliput_leave_arg_place_openP(final SubLObject query_type, final SubLObject argnum) {
        return kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$leaveArgPlaceOpenInTestQueries, query_type, argnum, $lilliput_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject tkb_fortP_alt(SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            if (NIL != constant_p(v_object)) {
                return isa.quoted_isaP(v_object, $$TKBConstant, $$BookkeepingMt, UNPROVIDED);
            } else {
                return makeBoolean(NIL == list_utilities.tree_find_if($sym113$NON_TKB_FORT_, narts_high.nart_el_formula(v_object), UNPROVIDED));
            }
        }
        return NIL;
    }

    public static SubLObject tkb_fortP(final SubLObject v_object) {
        if (NIL == forts.fort_p(v_object)) {
            return NIL;
        }
        if (NIL != constant_p(v_object)) {
            return isa.quoted_isaP(v_object, $$TKBConstant, $$BookkeepingMt, UNPROVIDED);
        }
        return makeBoolean(NIL == list_utilities.tree_find_if($sym114$NON_TKB_FORT_, narts_high.nart_el_formula(v_object), UNPROVIDED));
    }

    public static final SubLObject non_tkb_fortP_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL == com.cyc.cycjava.cycl.inference.lilliput.tkb_fortP(v_object)));
    }

    public static SubLObject non_tkb_fortP(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL == tkb_fortP(v_object)));
    }

    public static final SubLObject lilliput_cyc_query_alt(SubLObject sentence) {
        return inference_kernel.new_cyc_query(sentence, $lilliput_mt$.getGlobalValue(), $lilliput_corpus_generation_query_properties$.getGlobalValue());
    }

    public static SubLObject lilliput_cyc_query(final SubLObject sentence) {
        return inference_kernel.new_cyc_query(sentence, $lilliput_mt$.getGlobalValue(), $lilliput_corpus_generation_query_properties$.getGlobalValue());
    }

    public static final SubLObject lilliput_generate_query_sentence_of_type_alt(SubLObject type) {
        {
            SubLObject generate_goodP = NIL;
            SubLObject generate_openP = NIL;
            SubLObject pcase_var = type;
            if (pcase_var.eql($$LilliputQuery_OpenGood)) {
                generate_openP = T;
                generate_goodP = T;
            } else {
                if (pcase_var.eql($$LilliputQuery_OpenNoGood)) {
                    generate_openP = T;
                    generate_goodP = NIL;
                } else {
                    if (pcase_var.eql($$LilliputQuery_ClosedGood)) {
                        generate_openP = NIL;
                        generate_goodP = T;
                    } else {
                        if (pcase_var.eql($$LilliputQuery_ClosedNoGood)) {
                            generate_openP = NIL;
                            generate_goodP = NIL;
                        }
                    }
                }
            }
            return com.cyc.cycjava.cycl.inference.lilliput.lilliput_generate_query_sentence_with_properties(generate_openP, generate_goodP);
        }
    }

    public static SubLObject lilliput_generate_query_sentence_of_type(final SubLObject type) {
        SubLObject generate_goodP = NIL;
        SubLObject generate_openP = NIL;
        if (type.eql($$LilliputQuery_OpenGood)) {
            generate_openP = T;
            generate_goodP = T;
        } else
            if (type.eql($$LilliputQuery_OpenNoGood)) {
                generate_openP = T;
                generate_goodP = NIL;
            } else
                if (type.eql($$LilliputQuery_ClosedGood)) {
                    generate_openP = NIL;
                    generate_goodP = T;
                } else
                    if (type.eql($$LilliputQuery_ClosedNoGood)) {
                        generate_openP = NIL;
                        generate_goodP = NIL;
                    }



        return lilliput_generate_query_sentence_with_properties(generate_openP, generate_goodP);
    }

    public static final SubLObject lilliput_generate_query_sentence_with_properties_alt(SubLObject generate_openP, SubLObject generate_goodP) {
        {
            SubLObject sentence = NIL;
            SubLObject goodP = NIL;
            while ((NIL == sentence) || (generate_goodP != goodP)) {
                if (NIL != generate_openP) {
                    sentence = com.cyc.cycjava.cycl.inference.lilliput.lilliput_generate_open_sentence(UNPROVIDED);
                } else {
                    sentence = com.cyc.cycjava.cycl.inference.lilliput.lilliput_generate_closed_sentence(UNPROVIDED);
                }
                goodP = list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.lilliput.lilliput_cyc_query(sentence));
                if (NIL != goodP) {
                    format(T, $str_alt114$g__);
                    force_output(UNPROVIDED);
                } else {
                    format(T, $str_alt115$n__);
                    force_output(UNPROVIDED);
                }
            } 
            return sentence;
        }
    }

    public static SubLObject lilliput_generate_query_sentence_with_properties(final SubLObject generate_openP, final SubLObject generate_goodP) {
        SubLObject sentence = NIL;
        SubLObject goodP = NIL;
        while ((NIL == sentence) || (!generate_goodP.eql(goodP))) {
            if (NIL != generate_openP) {
                sentence = lilliput_generate_open_sentence(UNPROVIDED);
            } else {
                sentence = lilliput_generate_closed_sentence(UNPROVIDED);
            }
            goodP = list_utilities.sublisp_boolean(lilliput_cyc_query(sentence));
            if (NIL != goodP) {
                format(T, $str115$g__);
                force_output(UNPROVIDED);
            } else {
                format(T, $str116$n__);
                force_output(UNPROVIDED);
            }
        } 
        return sentence;
    }

    public static final SubLObject lilliput_generate_closed_sentence_alt(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        {
            SubLObject sentence = NIL;
            SubLObject closedP = NIL;
            while ((NIL == sentence) || (NIL == closedP)) {
                sentence = com.cyc.cycjava.cycl.inference.lilliput.lilliput_fully_instantiate_random_query();
                closedP = closedP(sentence, UNPROVIDED);
                if (NIL != verboseP) {
                    if (NIL != closedP) {
                        format_nil.force_format(T, $$$c, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        format_nil.force_format(T, $$$o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            } 
            return sentence;
        }
    }

    public static SubLObject lilliput_generate_closed_sentence(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        SubLObject sentence = NIL;
        SubLObject closedP = NIL;
        while ((NIL == sentence) || (NIL == closedP)) {
            sentence = lilliput_fully_instantiate_random_query();
            closedP = closedP(sentence, UNPROVIDED);
            if (NIL != verboseP) {
                if (NIL != closedP) {
                    format_nil.force_format(T, $$$c, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    format_nil.force_format(T, $$$o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        } 
        return sentence;
    }

    public static final SubLObject lilliput_generate_open_sentence_alt(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        {
            SubLObject sentence = NIL;
            SubLObject closedP = NIL;
            while ((NIL == sentence) || (NIL != closedP)) {
                sentence = com.cyc.cycjava.cycl.inference.lilliput.lilliput_partially_instantiate_random_query();
                closedP = closedP(sentence, UNPROVIDED);
                if (NIL != verboseP) {
                    if (NIL != closedP) {
                        format_nil.force_format(T, $$$c, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        format_nil.force_format(T, $$$o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            } 
            return sentence;
        }
    }

    public static SubLObject lilliput_generate_open_sentence(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        SubLObject sentence = NIL;
        SubLObject closedP = NIL;
        while ((NIL == sentence) || (NIL != closedP)) {
            sentence = lilliput_partially_instantiate_random_query();
            closedP = closedP(sentence, UNPROVIDED);
            if (NIL != verboseP) {
                if (NIL != closedP) {
                    format_nil.force_format(T, $$$c, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    format_nil.force_format(T, $$$o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        } 
        return sentence;
    }

    public static final SubLObject correct_training_query_alt(SubLObject query) {
        {
            SubLObject sentence = ask_utilities.query_variable($sym117$_ASS, list($$assertionSentence, $sym117$_ASS, list($const119$softwareParameterValueInSpecifica, $$InferenceSentenceParameter, $sym121$_QUERY, query)), $$TestVocabularyMt, UNPROVIDED).first();
            SubLObject query_type = ask_utilities.query_variable($sym122$_TYPE, listS($$and, listS($$nearestIsa, query, $list_alt123), $list_alt124), UNPROVIDED, UNPROVIDED).first();
            SubLObject correct_sentence = NIL;
            if (NIL != sentence) {
                ke.ke_unassert_now(sentence, $$TestVocabularyMt);
            }
            correct_sentence = com.cyc.cycjava.cycl.inference.lilliput.lilliput_generate_query_sentence_of_type(query_type);
            ke.ke_assert_now(kb_query.kbq_assertible_query_spec_sentence(correct_sentence, query), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject correct_training_query(final SubLObject query) {
        final SubLObject sentence = ask_utilities.query_variable($sym118$_ASS, list($$assertionSentence, $sym118$_ASS, list($const120$softwareParameterValueInSpecifica, $$InferenceSentenceParameter, $sym122$_QUERY, query)), $$TestVocabularyMt, UNPROVIDED).first();
        final SubLObject query_type = ask_utilities.query_variable($sym123$_TYPE, listS($$and, listS($$nearestIsa, query, $list124), $list125), UNPROVIDED, UNPROVIDED).first();
        SubLObject correct_sentence = NIL;
        if (NIL != sentence) {
            ke.ke_unassert_now(sentence, $$TestVocabularyMt);
        }
        correct_sentence = lilliput_generate_query_sentence_of_type(query_type);
        ke.ke_assert_now(kb_query.kbq_assertible_query_spec_sentence(correct_sentence, query), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_lilliput_file() {
        declareFunction("basic_lilliput_query_metrics", "BASIC-LILLIPUT-QUERY-METRICS", 0, 0, false);
        declareFunction("standard_lilliput_query_metrics", "STANDARD-LILLIPUT-QUERY-METRICS", 0, 0, false);
        declareFunction("all_lilliput_query_metrics", "ALL-LILLIPUT-QUERY-METRICS", 0, 0, false);
        declareFunction("lilliput_experiment_full_filename", "LILLIPUT-EXPERIMENT-FULL-FILENAME", 1, 1, false);
        declareMacro("run_lilliput_experiment", "RUN-LILLIPUT-EXPERIMENT");
        declareFunction("load_lilliput_experiment", "LOAD-LILLIPUT-EXPERIMENT", 1, 0, false);
        declareFunction("save_lilliput_experiment", "SAVE-LILLIPUT-EXPERIMENT", 2, 0, false);
        declareFunction("lilliput_open_good_query_set_run", "LILLIPUT-OPEN-GOOD-QUERY-SET-RUN", 1, 0, false);
        declareFunction("lilliput_open_no_good_query_set_run", "LILLIPUT-OPEN-NO-GOOD-QUERY-SET-RUN", 1, 0, false);
        declareFunction("lilliput_closed_good_query_set_run", "LILLIPUT-CLOSED-GOOD-QUERY-SET-RUN", 1, 0, false);
        declareFunction("lilliput_closed_no_good_query_set_run", "LILLIPUT-CLOSED-NO-GOOD-QUERY-SET-RUN", 1, 0, false);
        declareFunction("lilliput_open_good_queryP", "LILLIPUT-OPEN-GOOD-QUERY?", 1, 0, false);
        declareFunction("lilliput_open_no_good_queryP", "LILLIPUT-OPEN-NO-GOOD-QUERY?", 1, 0, false);
        declareFunction("lilliput_closed_good_queryP", "LILLIPUT-CLOSED-GOOD-QUERY?", 1, 0, false);
        declareFunction("lilliput_closed_no_good_queryP", "LILLIPUT-CLOSED-NO-GOOD-QUERY?", 1, 0, false);
        declareFunction("analyze_lilliput_experiment", "ANALYZE-LILLIPUT-EXPERIMENT", 1, 3, false);
        declareFunction("lilliput_generate_sorted_property_display", "LILLIPUT-GENERATE-SORTED-PROPERTY-DISPLAY", 3, 2, false);
        declareFunction("analyze_lilliput_experiments", "ANALYZE-LILLIPUT-EXPERIMENTS", 2, 5, false);
        declareFunction("lilliput_generate_sorted_property_comparison", "LILLIPUT-GENERATE-SORTED-PROPERTY-COMPARISON", 5, 3, false);
        declareFunction("kbq_hybridize_n_query_set_runs", "KBQ-HYBRIDIZE-N-QUERY-SET-RUNS", 1, 3, false);
        declareFunction("kbq_median_query_run", "KBQ-MEDIAN-QUERY-RUN", 1, 0, false);
        declareFunction("generate_lilliput_corpus", "GENERATE-LILLIPUT-CORPUS", 2, 1, false);
        declareFunction("lilliput_valid_terms_for_all_test_queries", "LILLIPUT-VALID-TERMS-FOR-ALL-TEST-QUERIES", 0, 0, false);
        declareFunction("lilliput_instantiate_all_queries_once", "LILLIPUT-INSTANTIATE-ALL-QUERIES-ONCE", 0, 0, false);
        declareFunction("lilliput_generate_query_sentences", "LILLIPUT-GENERATE-QUERY-SENTENCES", 1, 1, false);
        declareFunction("lilliput_partially_instantiate_random_query", "LILLIPUT-PARTIALLY-INSTANTIATE-RANDOM-QUERY", 0, 0, false);
        declareFunction("lilliput_partially_instantiate_query", "LILLIPUT-PARTIALLY-INSTANTIATE-QUERY", 1, 0, false);
        declareFunction("lilliput_fully_instantiate_random_query", "LILLIPUT-FULLY-INSTANTIATE-RANDOM-QUERY", 0, 0, false);
        declareFunction("lilliput_fully_instantiate_query", "LILLIPUT-FULLY-INSTANTIATE-QUERY", 1, 0, false);
        declareFunction("lilliput_instantiable_argnums", "LILLIPUT-INSTANTIABLE-ARGNUMS", 1, 0, false);
        declareFunction("lilliput_wff_instantiate_query_argnums", "LILLIPUT-WFF-INSTANTIATE-QUERY-ARGNUMS", 2, 0, false);
        declareFunction("lilliput_instantiate_query_argnums", "LILLIPUT-INSTANTIATE-QUERY-ARGNUMS", 2, 0, false);
        declareFunction("lilliput_valid_terms_for_query_argnum", "LILLIPUT-VALID-TERMS-FOR-QUERY-ARGNUM", 2, 0, false);
        declareFunction("lilliput_valid_terms_for_default_query", "LILLIPUT-VALID-TERMS-FOR-DEFAULT-QUERY", 2, 0, false);
        declareFunction("lilliput_valid_terms_for_argnum", "LILLIPUT-VALID-TERMS-FOR-ARGNUM", 2, 0, false);
        declareFunction("num_index_weighted_instantiation", "NUM-INDEX-WEIGHTED-INSTANTIATION", 1, 0, false);
        declareFunction("num_index_weighted_vector", "NUM-INDEX-WEIGHTED-VECTOR", 1, 0, false);
        declareFunction("lilliput_reify_queries", "LILLIPUT-REIFY-QUERIES", 4, 0, false);
        declareFunction("lilliput_reify_query", "LILLIPUT-REIFY-QUERY", 4, 0, false);
        declareFunction("lilliput_query_type", "LILLIPUT-QUERY-TYPE", 1, 0, false);
        declareFunction("lilliput_random_query", "LILLIPUT-RANDOM-QUERY", 0, 0, false);
        declareFunction("lilliput_leave_arg_place_openP", "LILLIPUT-LEAVE-ARG-PLACE-OPEN?", 2, 0, false);
        declareFunction("tkb_fortP", "TKB-FORT?", 1, 0, false);
        declareFunction("non_tkb_fortP", "NON-TKB-FORT?", 1, 0, false);
        declareFunction("lilliput_cyc_query", "LILLIPUT-CYC-QUERY", 1, 0, false);
        declareFunction("lilliput_generate_query_sentence_of_type", "LILLIPUT-GENERATE-QUERY-SENTENCE-OF-TYPE", 1, 0, false);
        declareFunction("lilliput_generate_query_sentence_with_properties", "LILLIPUT-GENERATE-QUERY-SENTENCE-WITH-PROPERTIES", 2, 0, false);
        declareFunction("lilliput_generate_closed_sentence", "LILLIPUT-GENERATE-CLOSED-SENTENCE", 0, 1, false);
        declareFunction("lilliput_generate_open_sentence", "LILLIPUT-GENERATE-OPEN-SENTENCE", 0, 1, false);
        declareFunction("correct_training_query", "CORRECT-TRAINING-QUERY", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(reader_make_constant_shell("AKBBuilderQuery-InferenceTest-Default"), reader_make_constant_shell("AKBBuilderQuery-InferenceTest-LeaveOpenArg2"));

    static private final SubLList $list_alt3 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("CONTINUABLE?"), NIL, makeKeyword("NEW-TERMS-ALLOWED?"), NIL);

    static private final SubLString $str_alt4$_cyc_projects_inference_lilliput_ = makeString("/cyc/projects/inference/lilliput/");

    static private final SubLString $str_alt5$experiments_ = makeString("experiments/");

    static private final SubLList $list_alt6 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("COMPLETE-TIME-PER-ANSWER"), makeKeyword("ANSWERABILITY-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"));

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"), makeKeyword("TIME-PER-ANSWER"), makeKeyword("COMPLETE-TIME-PER-ANSWER"), makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER"), makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), makeKeyword("ANSWER-TIMES"), makeKeyword("TACTIC-COUNT"), makeKeyword("POSSIBLE-TACTIC-COUNT"), makeKeyword("EXECUTED-TACTIC-COUNT"), makeKeyword("DISCARDED-TACTIC-COUNT") });

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(QUOTE, list(makeSymbol("ALL-LILLIPUT-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(QUOTE, makeSymbol("*LILLIPUT-OUTLIER-TIMEOUT*"))), list(makeSymbol("INCREMENTAL"), T), list(makeSymbol("INCLUDE-RESULTS"), NIL), list(makeSymbol("RANDOMIZE"), NIL), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT"), list(makeSymbol("DIRECTORY"), makeSymbol("*LILLIPUT-EXPERIMENT-DIRECTORY*")) });

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("RANDOMIZE"), $SKIP, makeKeyword("COUNT"), makeKeyword("DIRECTORY") });

    static private final SubLList $list_alt17 = list(makeSymbol("ALL-LILLIPUT-QUERY-METRICS"));

    public static SubLObject init_lilliput_file() {
        deflexical("*LILLIPUT-MASTER-QUERY-COLLECTION*", $$AKBBuilderQuery_InferenceTest);
        deflexical("*LILLIPUT-DEFAULT-QUERY-COLLECTIONS*", $list1);
        deflexical("*LILLIPUT-MT*", $$TKBSourceSpindleCollectorMt);
        deflexical("*LILLIPUT-CORPUS-GENERATION-QUERY-PROPERTIES*", $list3);
        deflexical("*LILLIPUT-DIRECTORY*", $str4$_cyc_projects_inference_lilliput_);
        deflexical("*LILLIPUT-EXPERIMENT-DIRECTORY*", cconcatenate($lilliput_directory$.getGlobalValue(), $str5$experiments_));
        deflexical("*BASIC-LILLIPUT-QUERY-METRICS*", $list6);
        deflexical("*STANDARD-LILLIPUT-QUERY-METRICS*", $list6);
        deflexical("*LILLIPUT-QUERY-METRICS*", $list7);
        deflexical("*LILLIPUT-OUTLIER-TIMEOUT*", $int$60);
        return NIL;
    }

    static private final SubLString $str_alt37$_0 = makeString(":0");

    static private final SubLString $str_alt39$____Basic_analysis____ = makeString("~%~%Basic analysis: ~%");

    static private final SubLString $str_alt40$____Answerable____ = makeString("~%~%Answerable: ~%");

    static private final SubLString $str_alt41$____Unanswerable____ = makeString("~%~%Unanswerable: ~%");

    static private final SubLString $str_alt42$____Open_Good___ = makeString("~%~%Open Good ~%");

    public static SubLObject setup_lilliput_file() {
        return NIL;
    }

    static private final SubLString $str_alt43$____Open_No_Good___ = makeString("~%~%Open No Good ~%");

    @Override
    public void declareFunctions() {
        declare_lilliput_file();
    }

    static private final SubLString $str_alt44$____Closed_Good___ = makeString("~%~%Closed Good ~%");

    @Override
    public void initializeVariables() {
        init_lilliput_file();
    }

    static private final SubLString $str_alt45$____Closed_No_Good___ = makeString("~%~%Closed No Good ~%");

    @Override
    public void runTopLevelForms() {
        setup_lilliput_file();
    }

    static private final SubLList $list_alt46 = list(makeSymbol("LILLIPUT-OPEN-GOOD-QUERY?"), makeSymbol("LILLIPUT-OPEN-NO-GOOD-QUERY?"), makeSymbol("LILLIPUT-CLOSED-GOOD-QUERY?"), makeSymbol("LILLIPUT-CLOSED-NO-GOOD-QUERY?"));

    static {
    }

    static private final SubLString $str_alt48$_ = makeString(" ");

    static private final SubLString $str_alt49$_n = makeString("\\n");

    static private final SubLList $list_alt53 = list(makeKeyword("CLASSIFICATION-LABELS"), list(makeString("Open Good"), makeString("Open No Good"), makeString("Closed Good"), makeString("Closed No Good")), makeKeyword("KEY-LOCATION"), list(makeInteger(212), ONE_INTEGER));

    static private final SubLString $str_alt54$____Answerability_analysis____ = makeString("~%~%Answerability analysis: ~%");

    static private final SubLString $str_alt55$Total_____________s__s__s__ = makeString("Total:           ~s ~s ~s~%");

    static private final SubLString $str_alt56$Open_Good_________s__s__s__ = makeString("Open Good:       ~s ~s ~s~%");

    static private final SubLString $str_alt57$Open_No_Good______s__s__s__ = makeString("Open No Good:    ~s ~s ~s~%");

    static private final SubLString $str_alt58$Closed_Good_______s__s__s__ = makeString("Closed Good:     ~s ~s ~s~%");

    static private final SubLString $str_alt59$Closed_No_Good____s__s__s__ = makeString("Closed No Good:  ~s ~s ~s~%");

    static private final SubLString $str_alt60$____Mutually_Answerable____ = makeString("~%~%Mutually Answerable: ~%");

    static private final SubLString $str_alt61$____Mutually_Answerable_Open_Good = makeString("~%~%Mutually Answerable Open Good: ~%");

    static private final SubLString $str_alt62$____Mutually_Answerable_Closed_Go = makeString("~%~%Mutually Answerable Closed Good: ~%");

    static private final SubLString $str_alt63$____Open_Good____ = makeString("~%~%Open Good: ~%");

    static private final SubLString $str_alt64$____Open_No_Good____ = makeString("~%~%Open No Good: ~%");

    static private final SubLString $str_alt65$____Closed_Good____ = makeString("~%~%Closed Good: ~%");

    static private final SubLString $str_alt66$____Closed_No_Good____ = makeString("~%~%Closed No Good: ~%");

    static private final SubLList $list_alt67 = list($BOTH, makeKeyword("BASELINE"));

    static private final SubLList $list_alt68 = list(makeKeyword("ANSWERABILITY-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"));

    static private final SubLString $str_alt70$__ = makeString(": ");

    static private final SubLString $str_alt71$_vs__ = makeString(" vs. ");

    static private final SubLList $list_alt74 = list(makeKeyword("KEY-LOCATION"), list(makeInteger(212), ONE_INTEGER));

    static private final SubLString $str_alt79$Cannot_handle_even_numbers_of_que = makeString("Cannot handle even numbers of query runs");

    static private final SubLString $str_alt83$_ = makeString(".");

    static private final SubLString $str_alt84$_ = makeString("+");

    static private final SubLSymbol $sym86$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLString $str_alt87$could_not_find_any_valid_terms_fo = makeString("could not find any valid terms for argnum ~s of ~s");

    static private final SubLString $str_alt88$got_an_unsorted_query__s = makeString("got an unsorted query ~s");

    static private final SubLString $str_alt90$Expected_only_one_arg_constraint_ = makeString("Expected only one arg constraint, got ~s");

    static private final SubLList $list_alt93 = list(reader_make_constant_shell("TheSetOf"), makeSymbol("?ARGS"), list(reader_make_constant_shell("quotedIsa"), makeSymbol("?ARGS"), reader_make_constant_shell("TKBConstant")));

    static private final SubLString $str_alt94$unhandled___CollectionSubsetFn_do = makeString("unhandled #$CollectionSubsetFn domain specification");

    static private final SubLString $str_alt95$unexpected_domain_type__s = makeString("unexpected domain type ~s");

    static private final SubLSymbol $sym96$_ = makeSymbol("<");

    static private final SubLString $str_alt99$_ = makeString("-");

    static private final SubLList $list_alt103 = list(reader_make_constant_shell("LilliputQuery-Training"));

    static private final SubLList $list_alt104 = list(reader_make_constant_shell("LilliputQuery-Blind"));

    static private final SubLSymbol $sym105$_COL = makeSymbol("?COL");

    static private final SubLList $list_alt108 = list(makeSymbol("?COL"));

    static private final SubLSymbol $sym113$NON_TKB_FORT_ = makeSymbol("NON-TKB-FORT?");

    static private final SubLString $str_alt114$g__ = makeString("g~%");

    static private final SubLString $str_alt115$n__ = makeString("n~%");

    static private final SubLSymbol $sym117$_ASS = makeSymbol("?ASS");

    public static final SubLObject $const119$softwareParameterValueInSpecifica = reader_make_constant_shell("softwareParameterValueInSpecification");

    static private final SubLSymbol $sym121$_QUERY = makeSymbol("?QUERY");

    static private final SubLSymbol $sym122$_TYPE = makeSymbol("?TYPE");

    static private final SubLList $list_alt123 = list(makeSymbol("?TYPE"));

    static private final SubLList $list_alt124 = list(list(reader_make_constant_shell("different"), makeSymbol("?TYPE"), reader_make_constant_shell("LilliputQuery-Training")));
}

/**
 * Total time: 421 ms
 */
