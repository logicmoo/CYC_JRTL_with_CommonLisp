/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.assertion_handles.assertion_count;
import static com.cyc.cycjava.cycl.assertion_handles.do_assertions_table;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.invert;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_access_metering;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ARETE
 * source file: /cyc/top/cycl/inference/arete.lisp
 * created:     2019/07/03 17:37:43
 */
public final class arete extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt85$ = makeString("");

    // Definitions
    /**
     * When non-nil, logs every KB access in one of three dictionaries
     */
    // defparameter
    @LispMethod(comment = "When non-nil, logs every KB access in one of three dictionaries\ndefparameter")
    public static final SubLSymbol $arete_log_kb_touchesP$ = makeSymbol("*ARETE-LOG-KB-TOUCHES?*");

    public static final SubLFile me = new arete();

 public static final String myName = "com.cyc.cycjava.cycl.inference.arete";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $arete_experiment_directory$ = makeSymbol("*ARETE-EXPERIMENT-DIRECTORY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $arete_analysis_directory$ = makeSymbol("*ARETE-ANALYSIS-DIRECTORY*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_cyc_projects_inference_arete_exp = makeString("/cyc/projects/inference/arete/experiments/");

    static private final SubLString $str1$_ = makeString(".");

    static private final SubLString $$$cfasl = makeString("cfasl");

    static private final SubLString $str3$_cyc_projects_inference_arete_ana = makeString("/cyc/projects/inference/arete/analysis/");

    static private final SubLString $$$txt = makeString("txt");

    static private final SubLString $str7$kbq__8D__6D__A = makeString("kbq-~8D-~6D-~A");

    public static final SubLSymbol $kbq_control_query_set_run$ = makeSymbol("*KBQ-CONTROL-QUERY-SET-RUN*");

    static private final SubLString $str10$tkb_training_with_auto_destroy_re = makeString("tkb-training-with-auto-destroy-real-time");

    static private final SubLList $list11 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(QUOTE, list(makeSymbol("ALL-ARETE-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(QUOTE, makeSymbol("*ARETE-OUTLIER-TIMEOUT*"))), makeSymbol("INCREMENTAL"), list(makeSymbol("INCLUDE-RESULTS"), T), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT"), list(makeSymbol("DIRECTORY"), makeSymbol("*ARETE-EXPERIMENT-DIRECTORY*")) });

    static private final SubLList $list12 = list(new SubLObject[]{ makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), $SKIP, makeKeyword("COUNT"), makeKeyword("DIRECTORY") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $QUERY_SPEC_SET = makeKeyword("QUERY-SPEC-SET");

    private static final SubLSymbol $OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");

    static private final SubLList $list19 = list(makeSymbol("ALL-ARETE-QUERY-METRICS"));

    public static final SubLSymbol $arete_outlier_timeout$ = makeSymbol("*ARETE-OUTLIER-TIMEOUT*");

    static private final SubLSymbol $sym27$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    static private final SubLSymbol $sym28$FULL_FILENAME = makeUninternedSymbol("FULL-FILENAME");

    private static final SubLSymbol ARETE_EXPERIMENT_FULL_FILENAME = makeSymbol("ARETE-EXPERIMENT-FULL-FILENAME");

    private static final SubLSymbol RUN_KBQ_EXPERIMENT = makeSymbol("RUN-KBQ-EXPERIMENT");

    static private final SubLString $str36$_s_already_exists__specify_OVERWR = makeString("~s already exists, specify OVERWRITE? T if you want to overwrite it");

    static private final SubLString $str38$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str39$_________________________________ = makeString("=========================================~%");

    static private final SubLString $str40$_a__ = makeString("~a~%");

    static private final SubLList $list41 = list(makeKeyword("COMMENT"), $DATE, makeKeyword("QUERY-RUNS"));

    static private final SubLString $str42$Summary_Statistics___ = makeString("Summary Statistics:~%");

    static private final SubLList $list43 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TOTAL-TIME"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"));

    static private final SubLString $str44$_________________________________ = makeString("-----------------------------------------~%");

    private static final SubLSymbol $TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");

    private static final SubLSymbol $TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    static private final SubLList $list53 = list(makeKeyword("TOTAL-TIME"), makeKeyword("MAX-TRANSFORMATION-DEPTH"));

    static private final SubLList $list54 = list(makeKeyword("TOTAL-TIME"), makeKeyword("MAX-TIME"));

    static private final SubLList $list55 = list(makeKeyword("MAX-TIME"), makeKeyword("TOTAL-TIME"));

    private static final SubLSymbol SAFE_DIFFERENCE = makeSymbol("SAFE-DIFFERENCE");

    static private final SubLList $list57 = list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-SENTENCE-CLOSED?"));

    static private final SubLList $list58 = list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-CANONICAL-MT"));

    static private final SubLList $list59 = list(makeKeyword("TOTAL-TIME"), list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-CANONICAL-MT")));

    static private final SubLString $str60$_s_Histogram___ = makeString("~s Histogram:~%");

    static private final SubLSymbol $sym61$SAFE__ = makeSymbol("SAFE-<");

    static private final SubLString $str62$_s_Data___ = makeString("~s Data:~%");

    static private final SubLString $str63$_s_Tuples___ = makeString("~s Tuples:~%");

    static private final SubLString $str65$_s_applied_to__s___ = makeString("~s applied to ~s:~%");

    static private final SubLString $str68$_s_____s__ = makeString("~s -> ~s~%");

    private static final SubLSymbol ARETE_GENERATE_PROPERTY_CORRELATION_PLOT = makeSymbol("ARETE-GENERATE-PROPERTY-CORRELATION-PLOT");

    static private final SubLList $list70 = list(makeSymbol("KBQ-GENERATE-PROPERTY-CORRELATION-PLOT"));

    private static final SubLSymbol ARETE_GENERATE_SORTED_PROPERTY_COMPARISON = makeSymbol("ARETE-GENERATE-SORTED-PROPERTY-COMPARISON");

    static private final SubLList $list72 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTY-COMPARISON"));

    private static final SubLSymbol ARETE_GENERATE_SORTED_PROPERTIES_COMPARISON = makeSymbol("ARETE-GENERATE-SORTED-PROPERTIES-COMPARISON");

    static private final SubLList $list75 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTIES-COMPARISON"));

    private static final SubLSymbol ARETE_GENERATE_SORTED_PROPERTY_DISPLAY = makeSymbol("ARETE-GENERATE-SORTED-PROPERTY-DISPLAY");

    static private final SubLList $list78 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTY-DISPLAY"));

    static private final SubLString $$$Interning_all_assertion_conses = makeString("Interning all assertion conses");

    static private final SubLString $$$Looking_for_shared_nauts = makeString("Looking for shared nauts");

    static private final SubLSymbol $sym82$KBQ_QUERY_RUN_BETTER_ = makeSymbol("KBQ-QUERY-RUN-BETTER?");

    static private final SubLString $str85$ = makeString("");

    static private final SubLString $str86$__Hybridized_with___ = makeString("~%Hybridized with:~%");

    private static final SubLSymbol SUBL_PERFORMATIVE_P = makeSymbol("SUBL-PERFORMATIVE-P");





    private static final SubLSymbol $kw90$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");



    static private final SubLList $list94 = list(reader_make_constant_shell("nthLargestElement"), reader_make_constant_shell("extentCardinality"), reader_make_constant_shell("PlusAll"), reader_make_constant_shell("Average"), reader_make_constant_shell("ratioOfCollectionToDifferentiatedCollection"), reader_make_constant_shell("performsActsOfType-Percentage"));

    public static SubLObject arete_enable_global_logging() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_access_metering.$arete_log_last_kb_touchP$.setDynamicValue(T, thread);
        kb_access_metering.$arete_log_kb_touchesP$.setDynamicValue(T, thread);
        kb_access_metering.$arete_assertions_touched$.setDynamicValue(NIL != set.set_p(kb_access_metering.$arete_assertions_touched$.getDynamicValue(thread)) ? kb_access_metering.$arete_assertions_touched$.getDynamicValue(thread) : set.new_set(UNPROVIDED, UNPROVIDED), thread);
        kb_access_metering.$arete_constants_touched$.setDynamicValue(NIL != set.set_p(kb_access_metering.$arete_constants_touched$.getDynamicValue(thread)) ? kb_access_metering.$arete_constants_touched$.getDynamicValue(thread) : set.new_set(UNPROVIDED, UNPROVIDED), thread);
        kb_access_metering.$arete_narts_touched$.setDynamicValue(NIL != set.set_p(kb_access_metering.$arete_narts_touched$.getDynamicValue(thread)) ? kb_access_metering.$arete_narts_touched$.getDynamicValue(thread) : set.new_set(UNPROVIDED, UNPROVIDED), thread);
        return NIL;
    }

    public static SubLObject arete_disable_global_logging() {
        kb_access_metering.$arete_log_last_kb_touchP$.setDynamicValue(NIL);
        kb_access_metering.$arete_log_kb_touchesP$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject arete_clear_global_logging() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_access_metering.$arete_assertions_touched$.setDynamicValue(NIL != set.set_p(kb_access_metering.$arete_assertions_touched$.getDynamicValue(thread)) ? set.new_set(UNPROVIDED, UNPROVIDED) : NIL, thread);
        kb_access_metering.$arete_constants_touched$.setDynamicValue(NIL != set.set_p(kb_access_metering.$arete_constants_touched$.getDynamicValue(thread)) ? set.new_set(UNPROVIDED, UNPROVIDED) : NIL, thread);
        kb_access_metering.$arete_narts_touched$.setDynamicValue(NIL != set.set_p(kb_access_metering.$arete_narts_touched$.getDynamicValue(thread)) ? set.new_set(UNPROVIDED, UNPROVIDED) : NIL, thread);
        return NIL;
    }

    public static SubLObject arete_note_assertion_touched(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            kb_access_metering.possibly_note_kb_access_assertion(assertion);
            if ((NIL != kb_access_metering.$arete_log_kb_touch_countsP$.getDynamicValue(thread)) && kb_access_metering.$arete_assertions_touched_count$.getDynamicValue(thread).isNumber()) {
                kb_access_metering.$arete_assertions_touched_count$.setDynamicValue(add(kb_access_metering.$arete_assertions_touched_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
            if (NIL != kb_access_metering.$arete_log_last_kb_touchP$.getDynamicValue(thread)) {
                kb_access_metering.$arete_last_assertion_touched$.setGlobalValue(assertion);
            }
            if ((NIL != kb_access_metering.$arete_log_kb_touchesP$.getDynamicValue(thread)) && (NIL != set.set_p(kb_access_metering.$arete_assertions_touched$.getDynamicValue(thread)))) {
                set.set_add(assertion, kb_access_metering.$arete_assertions_touched$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static SubLObject arete_note_constant_touched(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != kb_access_metering.$arete_log_kb_touch_countsP$.getDynamicValue(thread)) && kb_access_metering.$arete_terms_touched_count$.getDynamicValue(thread).isNumber()) {
            kb_access_metering.$arete_terms_touched_count$.setDynamicValue(add(kb_access_metering.$arete_terms_touched_count$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        if (NIL != kb_access_metering.$arete_log_last_kb_touchP$.getDynamicValue(thread)) {
            kb_access_metering.$arete_last_constant_touched$.setGlobalValue(constant);
            kb_access_metering.$arete_last_term_touched$.setGlobalValue(constant);
        }
        if ((NIL != kb_access_metering.$arete_log_kb_touchesP$.getDynamicValue(thread)) && (NIL != set.set_p(kb_access_metering.$arete_constants_touched$.getDynamicValue(thread)))) {
            set.set_add(constant, kb_access_metering.$arete_constants_touched$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject arete_note_nart_touched(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != kb_access_metering.$arete_log_kb_touch_countsP$.getDynamicValue(thread)) && kb_access_metering.$arete_terms_touched_count$.getDynamicValue(thread).isNumber()) {
            kb_access_metering.$arete_terms_touched_count$.setDynamicValue(add(kb_access_metering.$arete_terms_touched_count$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        if (NIL != kb_access_metering.$arete_log_last_kb_touchP$.getDynamicValue(thread)) {
            kb_access_metering.$arete_last_nart_touched$.setGlobalValue(nart);
            kb_access_metering.$arete_last_term_touched$.setGlobalValue(nart);
        }
        if ((NIL != kb_access_metering.$arete_log_kb_touchesP$.getDynamicValue(thread)) && (NIL != set.set_p(kb_access_metering.$arete_narts_touched$.getDynamicValue(thread)))) {
            set.set_add(nart, kb_access_metering.$arete_narts_touched$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject arete_note_object_touched(final SubLObject v_object) {
        if (NIL != constant_p(v_object)) {
            arete_note_constant_touched(v_object);
        } else
            if (NIL != nart_handles.nart_p(v_object)) {
                arete_note_nart_touched(v_object);
            } else
                if (NIL != assertion_handles.assertion_p(v_object)) {
                    arete_note_assertion_touched(v_object);
                }


        return NIL;
    }

    public static SubLObject arete_last_assertion_touched() {
        return kb_access_metering.$arete_last_assertion_touched$.getGlobalValue();
    }

    public static SubLObject arete_last_constant_touched() {
        return kb_access_metering.$arete_last_constant_touched$.getGlobalValue();
    }

    public static SubLObject arete_last_nart_touched() {
        return kb_access_metering.$arete_last_nart_touched$.getGlobalValue();
    }

    public static SubLObject arete_last_term_touched() {
        return kb_access_metering.$arete_last_term_touched$.getGlobalValue();
    }

    public static SubLObject arete_assertions_touched_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != set.set_p(kb_access_metering.$arete_assertions_touched$.getDynamicValue(thread)) ? set.set_size(kb_access_metering.$arete_assertions_touched$.getDynamicValue(thread)) : ZERO_INTEGER;
    }

    public static SubLObject arete_constants_touched_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != set.set_p(kb_access_metering.$arete_constants_touched$.getDynamicValue(thread)) ? set.set_size(kb_access_metering.$arete_constants_touched$.getDynamicValue(thread)) : ZERO_INTEGER;
    }

    public static SubLObject arete_narts_touched_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != set.set_p(kb_access_metering.$arete_narts_touched$.getDynamicValue(thread)) ? set.set_size(kb_access_metering.$arete_narts_touched$.getDynamicValue(thread)) : ZERO_INTEGER;
    }

    public static SubLObject arete_terms_touched_count() {
        return add(arete_constants_touched_count(), arete_narts_touched_count());
    }

    public static final SubLObject arete_experiment_full_filename_alt(SubLObject filename, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $arete_experiment_directory$.getGlobalValue();
        }
        return cconcatenate(directory, new SubLObject[]{ filename, $str_alt1$_, $$$cfasl });
    }

    public static SubLObject arete_experiment_full_filename(final SubLObject filename, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $arete_experiment_directory$.getGlobalValue();
        }
        return cconcatenate(directory, new SubLObject[]{ filename, $str1$_, $$$cfasl });
    }

    public static final SubLObject arete_analysis_full_filename_alt(SubLObject filename) {
        return cconcatenate($arete_analysis_directory$.getGlobalValue(), new SubLObject[]{ filename, $str_alt1$_, $$$txt });
    }

    public static SubLObject arete_analysis_full_filename(final SubLObject filename) {
        return cconcatenate($arete_analysis_directory$.getGlobalValue(), new SubLObject[]{ filename, $str1$_, $$$txt });
    }

    public static final SubLObject load_arete_experiment_alt(SubLObject filename) {
        {
            SubLObject full_filename = com.cyc.cycjava.cycl.inference.arete.arete_experiment_full_filename(filename, UNPROVIDED);
            return kbq_query_run.kbq_load_query_set_run(full_filename);
        }
    }

    public static SubLObject load_arete_experiment(final SubLObject filename) {
        final SubLObject full_filename = arete_experiment_full_filename(filename, UNPROVIDED);
        return kbq_query_run.kbq_load_query_set_run(full_filename);
    }

    public static final SubLObject suggest_filename_for_query_set_run_alt(SubLObject query_set_run) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = query_set_run;
                SubLObject current = datum;
                SubLObject machine_tail = property_list_member($MACHINE, current);
                SubLObject machine = (NIL != machine_tail) ? ((SubLObject) (cadr(machine_tail))) : NIL;
                SubLObject date_tail = property_list_member($DATE, current);
                SubLObject date = (NIL != date_tail) ? ((SubLObject) (cadr(date_tail))) : NIL;
                thread.resetMultipleValues();
                {
                    SubLObject universal_date = numeric_date_utilities.universal_date_and_second_from_time(date);
                    SubLObject universal_second = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject machine_string = substitute(CHAR_underbar, CHAR_period, machine, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return format(NIL, $str_alt7$kbq__8D__6D__A, new SubLObject[]{ universal_date, universal_second, machine_string });
                    }
                }
            }
        }
    }

    public static SubLObject suggest_filename_for_query_set_run(final SubLObject query_set_run) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject machine_tail = property_list_member($MACHINE, query_set_run);
        final SubLObject machine = (NIL != machine_tail) ? cadr(machine_tail) : NIL;
        final SubLObject date_tail = property_list_member($DATE, query_set_run);
        final SubLObject date = (NIL != date_tail) ? cadr(date_tail) : NIL;
        thread.resetMultipleValues();
        final SubLObject universal_date = numeric_date_utilities.universal_date_and_second_from_time(date);
        final SubLObject universal_second = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject machine_string = substitute(CHAR_underbar, CHAR_period, machine, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return format(NIL, $str7$kbq__8D__6D__A, new SubLObject[]{ universal_date, universal_second, machine_string });
    }

    public static final SubLObject kbq_load_control_query_set_run_alt(SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = NIL;
        }
        if (NIL == filename) {
            filename = com.cyc.cycjava.cycl.inference.arete.arete_experiment_full_filename($str_alt10$tkb_training_with_auto_destroy_re, UNPROVIDED);
        }
        $kbq_control_query_set_run$.setGlobalValue(kbq_query_run.kbq_load_query_set_run(filename));
        return $kbq_control_query_set_run$.getGlobalValue();
    }

    public static SubLObject kbq_load_control_query_set_run(SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = NIL;
        }
        if (NIL == filename) {
            filename = arete_experiment_full_filename($str10$tkb_training_with_auto_destroy_re, UNPROVIDED);
        }
        $kbq_control_query_set_run$.setGlobalValue(kbq_query_run.kbq_load_query_set_run(filename));
        return $kbq_control_query_set_run$.getGlobalValue();
    }

    public static final SubLObject kbq_compare_query_set_run_answers_to_control_alt(SubLObject query_set_run) {
        return kbq_query_run.kbq_compare_query_set_run_answers($kbq_control_query_set_run$.getGlobalValue(), query_set_run);
    }

    public static SubLObject kbq_compare_query_set_run_answers_to_control(final SubLObject query_set_run) {
        return kbq_query_run.kbq_compare_query_set_run_answers($kbq_control_query_set_run$.getGlobalValue(), query_set_run);
    }

    public static final SubLObject run_arete_experiment_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_1 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt11);
                current_1 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt11);
                if (NIL == member(current_1, $list_alt12, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_1 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt11);
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
                SubLObject metrics = (NIL != metrics_tail) ? ((SubLObject) (cadr(metrics_tail))) : $list_alt19;
                SubLObject outlier_timeout_tail = property_list_member($OUTLIER_TIMEOUT, current);
                SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? ((SubLObject) (cadr(outlier_timeout_tail))) : $arete_outlier_timeout$;
                SubLObject incremental_tail = property_list_member($INCREMENTAL, current);
                SubLObject incremental = (NIL != incremental_tail) ? ((SubLObject) (cadr(incremental_tail))) : NIL;
                SubLObject include_results_tail = property_list_member($INCLUDE_RESULTS, current);
                SubLObject include_results = (NIL != include_results_tail) ? ((SubLObject) (cadr(include_results_tail))) : T;
                SubLObject skip_tail = property_list_member($SKIP, current);
                SubLObject skip = (NIL != skip_tail) ? ((SubLObject) (cadr(skip_tail))) : ZERO_INTEGER;
                SubLObject count_tail = property_list_member($COUNT, current);
                SubLObject count = (NIL != count_tail) ? ((SubLObject) (cadr(count_tail))) : NIL;
                SubLObject directory_tail = property_list_member($DIRECTORY, current);
                SubLObject directory = (NIL != directory_tail) ? ((SubLObject) (cadr(directory_tail))) : $arete_experiment_directory$.getGlobalValue();
                SubLObject filename_var = $sym27$FILENAME_VAR;
                SubLObject full_filename = $sym28$FULL_FILENAME;
                return list(CLET, list(list(filename_var, filename), list(full_filename, list(FWHEN, filename_var, list(ARETE_EXPERIMENT_FULL_FILENAME, filename_var, directory)))), list(new SubLObject[]{ RUN_KBQ_EXPERIMENT, $QUERY_SPEC_SET, query_spec_set, $FILENAME, full_filename, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $METRICS, metrics, $OUTLIER_TIMEOUT, outlier_timeout, $INCREMENTAL, incremental, $INCLUDE_RESULTS, include_results, $SKIP, skip, $COUNT, count }));
            }
        }
    }

    public static SubLObject run_arete_experiment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list11);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list11);
            if (NIL == member(current_$1, $list12, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list11);
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
        final SubLObject metrics = (NIL != metrics_tail) ? cadr(metrics_tail) : $list19;
        final SubLObject outlier_timeout_tail = property_list_member($OUTLIER_TIMEOUT, current);
        final SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? cadr(outlier_timeout_tail) : $arete_outlier_timeout$;
        final SubLObject incremental_tail = property_list_member($INCREMENTAL, current);
        final SubLObject incremental = (NIL != incremental_tail) ? cadr(incremental_tail) : NIL;
        final SubLObject include_results_tail = property_list_member($INCLUDE_RESULTS, current);
        final SubLObject include_results = (NIL != include_results_tail) ? cadr(include_results_tail) : T;
        final SubLObject skip_tail = property_list_member($SKIP, current);
        final SubLObject skip = (NIL != skip_tail) ? cadr(skip_tail) : ZERO_INTEGER;
        final SubLObject count_tail = property_list_member($COUNT, current);
        final SubLObject count = (NIL != count_tail) ? cadr(count_tail) : NIL;
        final SubLObject directory_tail = property_list_member($DIRECTORY, current);
        final SubLObject directory = (NIL != directory_tail) ? cadr(directory_tail) : $arete_experiment_directory$.getGlobalValue();
        final SubLObject filename_var = $sym27$FILENAME_VAR;
        final SubLObject full_filename = $sym28$FULL_FILENAME;
        return list(CLET, list(list(filename_var, filename), list(full_filename, list(FWHEN, filename_var, list(ARETE_EXPERIMENT_FULL_FILENAME, filename_var, directory)))), list(new SubLObject[]{ RUN_KBQ_EXPERIMENT, $QUERY_SPEC_SET, query_spec_set, $FILENAME, full_filename, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $METRICS, metrics, $OUTLIER_TIMEOUT, outlier_timeout, $INCREMENTAL, incremental, $INCLUDE_RESULTS, include_results, $SKIP, skip, $COUNT, count }));
    }

    public static final SubLObject kbq_query_set_run_scaling_factors_alt(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject metrics) {
        if (metrics == UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        {
            SubLObject analysis = kbq_query_run.kbq_analyze_query_set_runs(query_set_run_1, query_set_run_2, metrics);
            return com.cyc.cycjava.cycl.inference.arete.kbq_compute_scaling_factors_from_analysis(analysis);
        }
    }

    public static SubLObject kbq_query_set_run_scaling_factors(final SubLObject query_set_run_1, final SubLObject query_set_run_2, SubLObject metrics) {
        if (metrics == UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        final SubLObject analysis = kbq_query_run.kbq_analyze_query_set_runs(query_set_run_1, query_set_run_2, metrics);
        return kbq_compute_scaling_factors_from_analysis(analysis);
    }

    public static final SubLObject kbq_compute_scaling_factors_from_analysis_alt(SubLObject analysis) {
        {
            SubLObject new_plist = NIL;
            SubLObject remainder = NIL;
            for (remainder = analysis; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject indicator = remainder.first();
                    SubLObject value = cadr(remainder);
                    SubLObject first = value.first();
                    SubLObject second = second(value);
                    SubLObject ratio = ((NIL == first) || first.isZero()) ? ((SubLObject) ($UNDEFINED)) : divide(second, first);
                    new_plist = putf(new_plist, indicator, ratio);
                }
            }
            return new_plist;
        }
    }

    public static SubLObject kbq_compute_scaling_factors_from_analysis(final SubLObject analysis) {
        SubLObject new_plist = NIL;
        SubLObject remainder;
        SubLObject indicator;
        SubLObject value;
        SubLObject first;
        SubLObject second;
        SubLObject ratio;
        for (remainder = NIL, remainder = analysis; NIL != remainder; remainder = cddr(remainder)) {
            indicator = remainder.first();
            value = cadr(remainder);
            first = value.first();
            second = second(value);
            ratio = ((NIL == first) || first.isZero()) ? $UNDEFINED : divide(second, first);
            new_plist = putf(new_plist, indicator, ratio);
        }
        return new_plist;
    }

    /**
     *
     *
     * @param SCALE-WHICH
     * 		keywordp; which set of values to scale, :baseline or :experiment.
     * 		Scales either the baseline or experiment values of ANALYSIS by SCALING-FACTORS (respectively), and eliminates any other values.
     */
    @LispMethod(comment = "@param SCALE-WHICH\r\n\t\tkeywordp; which set of values to scale, :baseline or :experiment.\r\n\t\tScales either the baseline or experiment values of ANALYSIS by SCALING-FACTORS (respectively), and eliminates any other values.")
    public static final SubLObject kbq_scale_analysis_alt(SubLObject analysis, SubLObject scaling_factors, SubLObject scale_which) {
        {
            SubLObject new_plist = NIL;
            SubLObject remainder = NIL;
            for (remainder = analysis; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject statistic_name = remainder.first();
                    SubLObject statistic_list = cadr(remainder);
                    SubLObject baseline_value = statistic_list.first();
                    SubLObject experiment_value = second(statistic_list);
                    SubLObject scaling_factor = getf(scaling_factors, statistic_name, UNPROVIDED);
                    if (scaling_factor.isNumber()) {
                        if ($BASELINE == scale_which) {
                            baseline_value = number_utilities.significant_digits(multiply(baseline_value, scaling_factor), FOUR_INTEGER);
                        }
                        if ($EXPERIMENT == scale_which) {
                            experiment_value = number_utilities.significant_digits(multiply(experiment_value, scaling_factor), FOUR_INTEGER);
                        }
                        new_plist = putf(new_plist, statistic_name, list(baseline_value, experiment_value));
                    }
                }
            }
            return new_plist;
        }
    }

    /**
     *
     *
     * @param SCALE-WHICH
     * 		keywordp; which set of values to scale, :baseline or :experiment.
     * 		Scales either the baseline or experiment values of ANALYSIS by SCALING-FACTORS (respectively), and eliminates any other values.
     */
    @LispMethod(comment = "@param SCALE-WHICH\r\n\t\tkeywordp; which set of values to scale, :baseline or :experiment.\r\n\t\tScales either the baseline or experiment values of ANALYSIS by SCALING-FACTORS (respectively), and eliminates any other values.")
    public static SubLObject kbq_scale_analysis(final SubLObject analysis, final SubLObject scaling_factors, final SubLObject scale_which) {
        SubLObject new_plist = NIL;
        SubLObject remainder;
        SubLObject statistic_name;
        SubLObject statistic_list;
        SubLObject baseline_value;
        SubLObject experiment_value;
        SubLObject scaling_factor;
        for (remainder = NIL, remainder = analysis; NIL != remainder; remainder = cddr(remainder)) {
            statistic_name = remainder.first();
            statistic_list = cadr(remainder);
            baseline_value = statistic_list.first();
            experiment_value = second(statistic_list);
            scaling_factor = getf(scaling_factors, statistic_name, UNPROVIDED);
            if (scaling_factor.isNumber()) {
                if ($BASELINE == scale_which) {
                    baseline_value = number_utilities.significant_digits(multiply(baseline_value, scaling_factor), FOUR_INTEGER);
                }
                if ($EXPERIMENT == scale_which) {
                    experiment_value = number_utilities.significant_digits(multiply(experiment_value, scaling_factor), FOUR_INTEGER);
                }
                new_plist = putf(new_plist, statistic_name, list(baseline_value, experiment_value));
            }
        }
        return new_plist;
    }

    /**
     * Multiplies the values of SCALING-FACTORS-1 by the corresponding values in SCALING-FACTORS-2.
     */
    @LispMethod(comment = "Multiplies the values of SCALING-FACTORS-1 by the corresponding values in SCALING-FACTORS-2.")
    public static final SubLObject multiply_scaling_factors_alt(SubLObject scaling_factors_1, SubLObject scaling_factors_2) {
        {
            SubLObject new_scaling_factors = NIL;
            SubLObject remainder = NIL;
            for (remainder = scaling_factors_1; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject indicator = remainder.first();
                    SubLObject value = cadr(remainder);
                    SubLObject scaling_factor = getf(scaling_factors_2, indicator, UNPROVIDED);
                    if (scaling_factor.isNumber() && value.isNumber()) {
                        value = multiply(value, scaling_factor);
                    }
                    new_scaling_factors = putf(new_scaling_factors, indicator, value);
                }
            }
            return new_scaling_factors;
        }
    }

    /**
     * Multiplies the values of SCALING-FACTORS-1 by the corresponding values in SCALING-FACTORS-2.
     */
    @LispMethod(comment = "Multiplies the values of SCALING-FACTORS-1 by the corresponding values in SCALING-FACTORS-2.")
    public static SubLObject multiply_scaling_factors(final SubLObject scaling_factors_1, final SubLObject scaling_factors_2) {
        SubLObject new_scaling_factors = NIL;
        SubLObject remainder;
        SubLObject indicator;
        SubLObject value;
        SubLObject scaling_factor;
        for (remainder = NIL, remainder = scaling_factors_1; NIL != remainder; remainder = cddr(remainder)) {
            indicator = remainder.first();
            value = cadr(remainder);
            scaling_factor = getf(scaling_factors_2, indicator, UNPROVIDED);
            if (scaling_factor.isNumber() && value.isNumber()) {
                value = multiply(value, scaling_factor);
            }
            new_scaling_factors = putf(new_scaling_factors, indicator, value);
        }
        return new_scaling_factors;
    }

    /**
     * Takes the reciprocal of each value of SCALING-FACTORS
     */
    @LispMethod(comment = "Takes the reciprocal of each value of SCALING-FACTORS")
    public static final SubLObject invert_scaling_factors_alt(SubLObject scaling_factors) {
        {
            SubLObject new_scaling_factors = NIL;
            SubLObject remainder = NIL;
            for (remainder = scaling_factors; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject indicator = remainder.first();
                    SubLObject value = cadr(remainder);
                    if (value.isNumber() && (!value.isZero())) {
                        value = invert(value);
                    }
                    new_scaling_factors = putf(new_scaling_factors, indicator, value);
                }
            }
            return new_scaling_factors;
        }
    }

    /**
     * Takes the reciprocal of each value of SCALING-FACTORS
     */
    @LispMethod(comment = "Takes the reciprocal of each value of SCALING-FACTORS")
    public static SubLObject invert_scaling_factors(final SubLObject scaling_factors) {
        SubLObject new_scaling_factors = NIL;
        SubLObject remainder;
        SubLObject indicator;
        SubLObject value;
        for (remainder = NIL, remainder = scaling_factors; NIL != remainder; remainder = cddr(remainder)) {
            indicator = remainder.first();
            value = cadr(remainder);
            if (value.isNumber() && (!value.isZero())) {
                value = invert(value);
            }
            new_scaling_factors = putf(new_scaling_factors, indicator, value);
        }
        return new_scaling_factors;
    }

    public static final SubLObject kbq_save_report_alt(SubLObject query_set_run, SubLObject filename, SubLObject overwriteP) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject full_filename = com.cyc.cycjava.cycl.inference.arete.arete_analysis_full_filename(filename);
                if (NIL == overwriteP) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL != Filesys.probe_file(full_filename)) {
                            Errors.error($str_alt36$_s_already_exists__specify_OVERWR, full_filename);
                        }
                    }
                }
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(full_filename, $OUTPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt38$Unable_to_open__S, full_filename);
                        }
                        {
                            SubLObject stream_2 = stream;
                            com.cyc.cycjava.cycl.inference.arete.kbq_print_report(query_set_run, stream_2);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject kbq_save_report(final SubLObject query_set_run, final SubLObject filename, SubLObject overwriteP) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject full_filename = arete_analysis_full_filename(filename);
        if (((NIL == overwriteP) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL != Filesys.probe_file(full_filename))) {
            Errors.error($str36$_s_already_exists__specify_OVERWR, full_filename);
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(full_filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str38$Unable_to_open__S, full_filename);
            }
            final SubLObject stream_$2 = stream;
            kbq_print_report(query_set_run, stream_$2);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject kbq_print_report_alt(SubLObject query_set_run, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format(stream, $str_alt39$_________________________________);
        {
            SubLObject comment = kbq_query_run.kbq_query_set_run_comment(query_set_run);
            format(stream, $str_alt40$_a__, comment);
        }
        {
            SubLObject date = getf(query_set_run, $DATE, UNPROVIDED);
            format(stream, $str_alt40$_a__, numeric_date_utilities.timestring(date));
        }
        {
            SubLObject rest_of_header_info = list_utilities.plist_except(query_set_run, $list_alt41);
            list_utilities.pretty_print_plist(rest_of_header_info, stream);
        }
        format(stream, $str_alt39$_________________________________);
        format(stream, $str_alt42$Summary_Statistics___);
        {
            SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
            SubLObject metrics = $list_alt43;
            SubLObject metrics_database = kbq_query_run.kbq_analyze_query_runs(query_runs, metrics);
            list_utilities.pretty_print_plist(metrics_database, stream);
        }
        format(stream, $str_alt44$_________________________________);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_histogram(query_set_run, stream, $HALT_REASON);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_data(query_set_run, stream, $ANSWER_COUNT);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_data(query_set_run, stream, $TOTAL_TIME);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_data(query_set_run, stream, $TIME_TO_FIRST_ANSWER);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_data(query_set_run, stream, $TIME_TO_LAST_ANSWER);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_histogram(query_set_run, stream, $MAX_TRANSFORMATION_DEPTH);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_histogram(query_set_run, stream, $BROWSABLE_);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_histogram(query_set_run, stream, $CONTINUABLE_);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_tuples(query_set_run, stream, $list_alt53);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_tuples(query_set_run, stream, $list_alt54);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_func_of_tuples(query_set_run, stream, $list_alt55, SAFE_DIFFERENCE);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_histogram(query_set_run, stream, $list_alt57);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_histogram(query_set_run, stream, $list_alt58);
        com.cyc.cycjava.cycl.inference.arete.kbq_print_tuples(query_set_run, stream, $list_alt59);
        return NIL;
    }

    public static SubLObject kbq_print_report(final SubLObject query_set_run, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format(stream, $str39$_________________________________);
        final SubLObject comment = kbq_query_run.kbq_query_set_run_comment(query_set_run);
        format(stream, $str40$_a__, comment);
        final SubLObject date = getf(query_set_run, $DATE, UNPROVIDED);
        format(stream, $str40$_a__, numeric_date_utilities.timestring(date));
        final SubLObject rest_of_header_info = list_utilities.plist_except(query_set_run, $list41);
        list_utilities.pretty_print_plist(rest_of_header_info, stream);
        format(stream, $str39$_________________________________);
        format(stream, $str42$Summary_Statistics___);
        final SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
        final SubLObject metrics = $list43;
        final SubLObject metrics_database = kbq_query_run.kbq_analyze_query_runs(query_runs, metrics);
        list_utilities.pretty_print_plist(metrics_database, stream);
        format(stream, $str44$_________________________________);
        kbq_print_histogram(query_set_run, stream, $HALT_REASON);
        kbq_print_data(query_set_run, stream, $ANSWER_COUNT);
        kbq_print_data(query_set_run, stream, $TOTAL_TIME);
        kbq_print_data(query_set_run, stream, $TIME_TO_FIRST_ANSWER);
        kbq_print_data(query_set_run, stream, $TIME_TO_LAST_ANSWER);
        kbq_print_histogram(query_set_run, stream, $MAX_TRANSFORMATION_DEPTH);
        kbq_print_histogram(query_set_run, stream, $BROWSABLE_);
        kbq_print_histogram(query_set_run, stream, $CONTINUABLE_);
        kbq_print_tuples(query_set_run, stream, $list53);
        kbq_print_tuples(query_set_run, stream, $list54);
        kbq_print_func_of_tuples(query_set_run, stream, $list55, SAFE_DIFFERENCE);
        kbq_print_histogram(query_set_run, stream, $list57);
        kbq_print_histogram(query_set_run, stream, $list58);
        kbq_print_tuples(query_set_run, stream, $list59);
        return NIL;
    }

    public static final SubLObject kbq_print_histogram_alt(SubLObject query_set_run, SubLObject stream, SubLObject property) {
        format(stream, $str_alt60$_s_Histogram___, property);
        {
            SubLObject values = kbq_query_run.kbq_extract_property_values(query_set_run, property, UNPROVIDED);
            SubLObject histogram_plist = list_utilities.histogram_as_plist(values, symbol_function($sym61$SAFE__), symbol_function(EQUAL), UNPROVIDED);
            list_utilities.pretty_print_plist(histogram_plist, stream);
        }
        format(stream, $str_alt44$_________________________________);
        return NIL;
    }

    public static SubLObject kbq_print_histogram(final SubLObject query_set_run, final SubLObject stream, final SubLObject property) {
        format(stream, $str60$_s_Histogram___, property);
        final SubLObject values = kbq_query_run.kbq_extract_property_values(query_set_run, property, UNPROVIDED);
        final SubLObject histogram_plist = list_utilities.histogram_as_plist(values, symbol_function($sym61$SAFE__), symbol_function(EQUAL), UNPROVIDED);
        list_utilities.pretty_print_plist(histogram_plist, stream);
        format(stream, $str44$_________________________________);
        return NIL;
    }

    public static final SubLObject kbq_print_data_alt(SubLObject query_set_run, SubLObject stream, SubLObject property) {
        format(stream, $str_alt62$_s_Data___, property);
        {
            SubLObject values = kbq_query_run.kbq_extract_property_values(query_set_run, property, UNPROVIDED);
            SubLObject sorted_values = Sort.sort(copy_list(values), symbol_function($sym61$SAFE__), UNPROVIDED);
            format_nil.print_one_per_line(sorted_values, stream);
        }
        terpri(stream);
        format(stream, $str_alt44$_________________________________);
        return NIL;
    }

    public static SubLObject kbq_print_data(final SubLObject query_set_run, final SubLObject stream, final SubLObject property) {
        format(stream, $str62$_s_Data___, property);
        final SubLObject values = kbq_query_run.kbq_extract_property_values(query_set_run, property, UNPROVIDED);
        final SubLObject sorted_values = Sort.sort(copy_list(values), symbol_function($sym61$SAFE__), UNPROVIDED);
        format_nil.print_one_per_line(sorted_values, stream);
        terpri(stream);
        format(stream, $str44$_________________________________);
        return NIL;
    }

    public static final SubLObject kbq_print_tuples_alt(SubLObject query_set_run, SubLObject stream, SubLObject v_properties) {
        format(stream, $str_alt63$_s_Tuples___, v_properties);
        {
            SubLObject tuples = com.cyc.cycjava.cycl.inference.arete.kbq_compute_tuples(query_set_run, v_properties);
            SubLObject sorted_tuples = Sort.sort(copy_list(tuples), symbol_function($sym61$SAFE__), symbol_function(FIRST));
            format_nil.print_one_per_line(sorted_tuples, stream);
            terpri(stream);
            format(stream, $str_alt44$_________________________________);
        }
        return NIL;
    }

    public static SubLObject kbq_print_tuples(final SubLObject query_set_run, final SubLObject stream, final SubLObject v_properties) {
        format(stream, $str63$_s_Tuples___, v_properties);
        final SubLObject tuples = kbq_compute_tuples(query_set_run, v_properties);
        final SubLObject sorted_tuples = Sort.sort(copy_list(tuples), symbol_function($sym61$SAFE__), symbol_function(FIRST));
        format_nil.print_one_per_line(sorted_tuples, stream);
        terpri(stream);
        format(stream, $str44$_________________________________);
        return NIL;
    }

    public static final SubLObject kbq_print_func_of_tuples_alt(SubLObject query_set_run, SubLObject stream, SubLObject v_properties, SubLObject func) {
        format(stream, $str_alt65$_s_applied_to__s___, func, v_properties);
        {
            SubLObject tuples = com.cyc.cycjava.cycl.inference.arete.kbq_compute_tuples(query_set_run, v_properties);
            SubLObject values = NIL;
            SubLObject cdolist_list_var = tuples;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject value = apply(func, tuple.first(), tuple.rest());
                    values = cons(value, values);
                }
            }
            values = nreverse(values);
            {
                SubLObject sorted_values = Sort.sort(copy_list(values), symbol_function($sym61$SAFE__), UNPROVIDED);
                format_nil.print_one_per_line(sorted_values, stream);
                terpri(stream);
                format(stream, $str_alt44$_________________________________);
            }
        }
        return NIL;
    }

    public static SubLObject kbq_print_func_of_tuples(final SubLObject query_set_run, final SubLObject stream, final SubLObject v_properties, final SubLObject func) {
        format(stream, $str65$_s_applied_to__s___, func, v_properties);
        final SubLObject tuples = kbq_compute_tuples(query_set_run, v_properties);
        SubLObject values = NIL;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = apply(func, tuple.first(), tuple.rest());
            values = cons(value, values);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        values = nreverse(values);
        final SubLObject sorted_values = Sort.sort(copy_list(values), symbol_function($sym61$SAFE__), UNPROVIDED);
        format_nil.print_one_per_line(sorted_values, stream);
        terpri(stream);
        format(stream, $str44$_________________________________);
        return NIL;
    }

    public static final SubLObject kbq_compute_tuples_alt(SubLObject query_set_run, SubLObject v_properties) {
        {
            SubLObject values_lists = NIL;
            SubLObject cdolist_list_var = v_properties;
            SubLObject property = NIL;
            for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                {
                    SubLObject values = kbq_query_run.kbq_extract_property_values(query_set_run, property, UNPROVIDED);
                    values_lists = cons(values, values_lists);
                }
            }
            values_lists = nreverse(values_lists);
            {
                SubLObject tuples = apply(symbol_function(MAPCAR), listS(symbol_function(LIST), values_lists));
                return tuples;
            }
        }
    }

    public static SubLObject kbq_compute_tuples(final SubLObject query_set_run, final SubLObject v_properties) {
        SubLObject values_lists = NIL;
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject values = kbq_query_run.kbq_extract_property_values(query_set_run, property, UNPROVIDED);
            values_lists = cons(values, values_lists);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        values_lists = nreverse(values_lists);
        final SubLObject tuples = apply(symbol_function(MAPCAR), listS(symbol_function(LIST), values_lists));
        return tuples;
    }

    public static final SubLObject kbq_print_error_queries_alt(SubLObject query_set_run) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
                SubLObject query_run = NIL;
                for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                    {
                        SubLObject halt_reason = kbq_query_run.kbq_extract_query_run_metric_value(query_run, $HALT_REASON, UNPROVIDED);
                        if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason)) {
                            {
                                SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                                {
                                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                                    try {
                                        $print_pretty$.bind(NIL, thread);
                                        format(T, $str_alt68$_s_____s__, query, halt_reason);
                                    } finally {
                                        $print_pretty$.rebind(_prev_bind_0, thread);
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

    public static SubLObject kbq_print_error_queries(final SubLObject query_set_run) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject halt_reason = kbq_query_run.kbq_extract_query_run_metric_value(query_run, $HALT_REASON, UNPROVIDED);
            if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason)) {
                final SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    format(T, $str68$_s_____s__, query, halt_reason);
                } finally {
                    $print_pretty$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject arete_generate_property_correlation_plot_alt(SubLObject baseline_run, SubLObject experiment_run, SubLObject property, SubLObject plot_properties, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        return plot_generation.kbq_generate_property_correlation_plot(baseline_run, experiment_run, property, plot_properties, display);
    }

    public static SubLObject arete_generate_property_correlation_plot(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        return plot_generation.kbq_generate_property_correlation_plot(baseline_run, experiment_run, property, plot_properties, display);
    }

    public static final SubLObject arete_generate_sorted_property_comparison_alt(SubLObject baseline_run, SubLObject experiment_run, SubLObject property, SubLObject plot_properties, SubLObject sort_by, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = $BOTH;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        return plot_generation.kbq_generate_sorted_property_comparison(baseline_run, experiment_run, property, plot_properties, sort_by, display);
    }

    public static SubLObject arete_generate_sorted_property_comparison(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_by, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = $BOTH;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        return plot_generation.kbq_generate_sorted_property_comparison(baseline_run, experiment_run, property, plot_properties, sort_by, display);
    }

    public static final SubLObject arete_generate_sorted_properties_comparison_alt(SubLObject query_set_run, SubLObject v_properties, SubLObject plot_properties, SubLObject sort_by, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = $ALL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        return plot_generation.kbq_generate_sorted_properties_comparison(query_set_run, v_properties, plot_properties, sort_by, display);
    }

    public static SubLObject arete_generate_sorted_properties_comparison(final SubLObject query_set_run, final SubLObject v_properties, SubLObject plot_properties, SubLObject sort_by, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = $ALL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        return plot_generation.kbq_generate_sorted_properties_comparison(query_set_run, v_properties, plot_properties, sort_by, display);
    }

    public static final SubLObject arete_generate_sorted_property_display_alt(SubLObject query_set_run, SubLObject property, SubLObject classifications, SubLObject plot_properties, SubLObject display) {
        if (classifications == UNPROVIDED) {
            classifications = NIL;
        }
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        return plot_generation.kbq_generate_sorted_property_display(query_set_run, property, classifications, plot_properties, display);
    }

    public static SubLObject arete_generate_sorted_property_display(final SubLObject query_set_run, final SubLObject property, SubLObject classifications, SubLObject plot_properties, SubLObject display) {
        if (classifications == UNPROVIDED) {
            classifications = NIL;
        }
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        return plot_generation.kbq_generate_sorted_property_display(query_set_run, property, classifications, plot_properties, display);
    }

    public static final SubLObject assertion_cons_sharing_dictionary_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), assertion_count());
                SubLObject idx = do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$Interning_all_assertion_conses, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$Interning_all_assertion_conses);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject ass = NIL;
                                while (NIL != id) {
                                    ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject cons = NIL;
                                            for (cons = assertions_low.assertion_formula_data(ass); !cons.isAtom(); cons = cons.rest()) {
                                                dictionary_utilities.dictionary_increment(v_dictionary, cons, UNPROVIDED);
                                            }
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_dictionary;
            }
        }
    }

    public static SubLObject assertion_cons_sharing_dictionary() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), assertion_handles.assertion_count());
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Interning_all_assertion_conses;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$3 = idx;
                if (NIL == id_index_objects_empty_p(idx_$3, $SKIP)) {
                    final SubLObject idx_$4 = idx_$3;
                    if (NIL == id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$4);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject cons;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                for (cons = NIL, cons = assertions_low.assertion_formula_data(ass); !cons.isAtom(); cons = cons.rest()) {
                                    dictionary_utilities.dictionary_increment(v_dictionary, cons, UNPROVIDED);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$5 = idx_$3;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$5)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$5);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$5);
                        final SubLObject end_id = id_index_next_id(idx_$5);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                SubLObject cons2;
                                for (cons2 = NIL, cons2 = assertions_low.assertion_formula_data(ass2); !cons2.isAtom(); cons2 = cons2.rest()) {
                                    dictionary_utilities.dictionary_increment(v_dictionary, cons2, UNPROVIDED);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }

    public static final SubLObject conses_saved_and_total_conses_alt(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject conses_saved = ZERO_INTEGER;
                SubLObject total_conses = ZERO_INTEGER;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject count = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        total_conses = add(total_conses, count);
                        if (count.numG(ONE_INTEGER)) {
                            conses_saved = add(conses_saved, subtract(count, ONE_INTEGER));
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return values(conses_saved, total_conses, divide(conses_saved, total_conses));
            }
        }
    }

    public static SubLObject conses_saved_and_total_conses(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject conses_saved = ZERO_INTEGER;
        SubLObject total_conses = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            total_conses = add(total_conses, count);
            if (count.numG(ONE_INTEGER)) {
                conses_saved = add(conses_saved, subtract(count, ONE_INTEGER));
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return values(conses_saved, total_conses, divide(conses_saved, total_conses));
    }

    public static final SubLObject nauts_shared_and_unshared_alt(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject naut_count = ZERO_INTEGER;
                SubLObject nauts_shared = ZERO_INTEGER;
                SubLObject naut_share_count = ZERO_INTEGER;
                SubLObject so_far = ZERO_INTEGER;
                SubLObject total = dictionary.dictionary_length(v_dictionary);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$Looking_for_shared_nauts);
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject naut = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject count = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject functor = cycl_utilities.formula_operator(naut);
                                        if ((NIL != forts.fort_p(functor)) && (NIL != fort_types_interface.functor_p(functor))) {
                                            naut_count = add(naut_count, ONE_INTEGER);
                                            if (count.numG(ONE_INTEGER)) {
                                                nauts_shared = add(nauts_shared, ONE_INTEGER);
                                            }
                                            naut_share_count = add(naut_share_count, subtract(count, ONE_INTEGER));
                                        }
                                    }
                                    so_far = add(so_far, ONE_INTEGER);
                                    note_percent_progress(so_far, total);
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(naut_count, nauts_shared, naut_share_count);
            }
        }
    }

    public static SubLObject nauts_shared_and_unshared(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject naut_count = ZERO_INTEGER;
        SubLObject nauts_shared = ZERO_INTEGER;
        SubLObject naut_share_count = ZERO_INTEGER;
        SubLObject so_far = ZERO_INTEGER;
        final SubLObject total = dictionary.dictionary_length(v_dictionary);
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$Looking_for_shared_nauts);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject naut = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject functor = cycl_utilities.formula_operator(naut);
                    if ((NIL != forts.fort_p(functor)) && (NIL != fort_types_interface.functor_p(functor))) {
                        naut_count = add(naut_count, ONE_INTEGER);
                        if (count.numG(ONE_INTEGER)) {
                            nauts_shared = add(nauts_shared, ONE_INTEGER);
                        }
                        naut_share_count = add(naut_share_count, subtract(count, ONE_INTEGER));
                    }
                    so_far = add(so_far, ONE_INTEGER);
                    note_percent_progress(so_far, total);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return values(naut_count, nauts_shared, naut_share_count);
    }

    /**
     *
     *
     * @see hybridize-n-query-set-runs
     */
    @LispMethod(comment = "@see hybridize-n-query-set-runs")
    public static final SubLObject kbq_hybridize_query_set_runs_alt(SubLObject query_set_runs, SubLObject metric, SubLObject compare_func, SubLObject comment, SubLObject tag) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        if (compare_func == UNPROVIDED) {
            compare_func = $sym82$KBQ_QUERY_RUN_BETTER_;
        }
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        if (tag == UNPROVIDED) {
            tag = $ORIGIN;
        }
        {
            SubLObject tagged_query_set_runs = com.cyc.cycjava.cycl.inference.arete.kbq_tag_query_set_runs(query_set_runs, tag);
            SubLObject hybrid_query_set_run = tagged_query_set_runs.first();
            while (NIL != tagged_query_set_runs) {
                tagged_query_set_runs = tagged_query_set_runs.rest();
                hybrid_query_set_run = com.cyc.cycjava.cycl.inference.arete.kbq_hybridize_two_query_set_runs(hybrid_query_set_run, tagged_query_set_runs.first(), metric, compare_func, comment);
            } 
            return hybrid_query_set_run;
        }
    }

    /**
     *
     *
     * @see hybridize-n-query-set-runs
     */
    @LispMethod(comment = "@see hybridize-n-query-set-runs")
    public static SubLObject kbq_hybridize_query_set_runs(final SubLObject query_set_runs, SubLObject metric, SubLObject compare_func, SubLObject comment, SubLObject tag) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        if (compare_func == UNPROVIDED) {
            compare_func = $sym82$KBQ_QUERY_RUN_BETTER_;
        }
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        if (tag == UNPROVIDED) {
            tag = $ORIGIN;
        }
        SubLObject tagged_query_set_runs;
        SubLObject hybrid_query_set_run;
        for (tagged_query_set_runs = kbq_tag_query_set_runs(query_set_runs, tag), hybrid_query_set_run = tagged_query_set_runs.first(); NIL != tagged_query_set_runs; tagged_query_set_runs = tagged_query_set_runs.rest() , hybrid_query_set_run = kbq_hybridize_two_query_set_runs(hybrid_query_set_run, tagged_query_set_runs.first(), metric, compare_func, comment)) {
        }
        return hybrid_query_set_run;
    }

    public static final SubLObject kbq_tag_query_set_runs_alt(SubLObject query_set_runs, SubLObject tag) {
        {
            SubLObject tagged_query_set_runs = NIL;
            SubLObject list_var = NIL;
            SubLObject query_set_run = NIL;
            SubLObject tag_value = NIL;
            for (list_var = query_set_runs, query_set_run = list_var.first(), tag_value = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , query_set_run = list_var.first() , tag_value = add(ONE_INTEGER, tag_value)) {
                tagged_query_set_runs = cons(kbq_query_run.kbq_query_set_run_put_query_run_property(query_set_run, tag, tag_value), tagged_query_set_runs);
            }
            tagged_query_set_runs = nreverse(tagged_query_set_runs);
            return tagged_query_set_runs;
        }
    }

    public static SubLObject kbq_tag_query_set_runs(final SubLObject query_set_runs, final SubLObject tag) {
        SubLObject tagged_query_set_runs = NIL;
        SubLObject list_var = NIL;
        SubLObject query_set_run = NIL;
        SubLObject tag_value = NIL;
        list_var = query_set_runs;
        query_set_run = list_var.first();
        for (tag_value = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , query_set_run = list_var.first() , tag_value = add(ONE_INTEGER, tag_value)) {
            tagged_query_set_runs = cons(kbq_query_run.kbq_query_set_run_put_query_run_property(query_set_run, tag, tag_value), tagged_query_set_runs);
        }
        tagged_query_set_runs = nreverse(tagged_query_set_runs);
        return tagged_query_set_runs;
    }

    /**
     * Takes QUERY-SET-RUN-1 and replaces some of its query runs with corresponding better query runs from QUERY-SET-RUN-2.
     */
    @LispMethod(comment = "Takes QUERY-SET-RUN-1 and replaces some of its query runs with corresponding better query runs from QUERY-SET-RUN-2.")
    public static final SubLObject kbq_hybridize_two_query_set_runs_alt(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject metric, SubLObject compare_func, SubLObject comment) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        if (compare_func == UNPROVIDED) {
            compare_func = $sym82$KBQ_QUERY_RUN_BETTER_;
        }
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        {
            SubLObject hybrid_query_set_run = copy_list(query_set_run_1);
            SubLObject query_runs_1 = kbq_query_run.kbq_query_set_run_query_runs(query_set_run_1);
            SubLObject query_runs_2 = kbq_query_run.kbq_query_set_run_query_runs(query_set_run_2);
            SubLObject hybrid_query_runs = NIL;
            SubLObject query_run_1 = NIL;
            SubLObject query_run_1_3 = NIL;
            SubLObject query_run_2 = NIL;
            SubLObject query_run_2_4 = NIL;
            for (query_run_1 = query_runs_1, query_run_1_3 = query_run_1.first(), query_run_2 = query_runs_2, query_run_2_4 = query_run_2.first(); !((NIL == query_run_2) && (NIL == query_run_1)); query_run_1 = query_run_1.rest() , query_run_1_3 = query_run_1.first() , query_run_2 = query_run_2.rest() , query_run_2_4 = query_run_2.first()) {
                {
                    SubLObject better_query_run = com.cyc.cycjava.cycl.inference.arete.kbq_better_query_run(query_run_1_3, query_run_2_4, metric, compare_func);
                    hybrid_query_runs = cons(better_query_run, hybrid_query_runs);
                }
            }
            hybrid_query_runs = nreverse(hybrid_query_runs);
            hybrid_query_set_run = putf(hybrid_query_set_run, $QUERY_RUNS, hybrid_query_runs);
            if (NIL == comment) {
                comment = cconcatenate(getf(query_set_run_1, $COMMENT, $str_alt85$), new SubLObject[]{ format(NIL, $str_alt86$__Hybridized_with___), getf(query_set_run_2, $COMMENT, $str_alt85$) });
            }
            hybrid_query_set_run = putf(hybrid_query_set_run, $COMMENT, comment);
            return hybrid_query_set_run;
        }
    }

    /**
     * Takes QUERY-SET-RUN-1 and replaces some of its query runs with corresponding better query runs from QUERY-SET-RUN-2.
     */
    @LispMethod(comment = "Takes QUERY-SET-RUN-1 and replaces some of its query runs with corresponding better query runs from QUERY-SET-RUN-2.")
    public static SubLObject kbq_hybridize_two_query_set_runs(final SubLObject query_set_run_1, final SubLObject query_set_run_2, SubLObject metric, SubLObject compare_func, SubLObject comment) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        if (compare_func == UNPROVIDED) {
            compare_func = $sym82$KBQ_QUERY_RUN_BETTER_;
        }
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        SubLObject hybrid_query_set_run = copy_list(query_set_run_1);
        final SubLObject query_runs_1 = kbq_query_run.kbq_query_set_run_query_runs(query_set_run_1);
        final SubLObject query_runs_2 = kbq_query_run.kbq_query_set_run_query_runs(query_set_run_2);
        SubLObject hybrid_query_runs = NIL;
        SubLObject query_run_1 = NIL;
        SubLObject query_run_1_$8 = NIL;
        SubLObject query_run_2 = NIL;
        SubLObject query_run_2_$9 = NIL;
        query_run_1 = query_runs_1;
        query_run_1_$8 = query_run_1.first();
        query_run_2 = query_runs_2;
        query_run_2_$9 = query_run_2.first();
        while ((NIL != query_run_2) || (NIL != query_run_1)) {
            final SubLObject better_query_run = kbq_better_query_run(query_run_1_$8, query_run_2_$9, metric, compare_func);
            hybrid_query_runs = cons(better_query_run, hybrid_query_runs);
            query_run_1 = query_run_1.rest();
            query_run_1_$8 = query_run_1.first();
            query_run_2 = query_run_2.rest();
            query_run_2_$9 = query_run_2.first();
        } 
        hybrid_query_runs = nreverse(hybrid_query_runs);
        hybrid_query_set_run = putf(hybrid_query_set_run, $QUERY_RUNS, hybrid_query_runs);
        if (NIL == comment) {
            comment = cconcatenate(getf(query_set_run_1, $COMMENT, $str85$), new SubLObject[]{ format(NIL, $str86$__Hybridized_with___), getf(query_set_run_2, $COMMENT, $str85$) });
        }
        hybrid_query_set_run = putf(hybrid_query_set_run, $COMMENT, comment);
        return hybrid_query_set_run;
    }

    public static final SubLObject kbq_better_query_run_alt(SubLObject query_run_1, SubLObject query_run_2, SubLObject metric, SubLObject compare_func) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        if (compare_func == UNPROVIDED) {
            compare_func = $sym82$KBQ_QUERY_RUN_BETTER_;
        }
        if (NIL != funcall(compare_func, query_run_2, query_run_1, metric)) {
            return query_run_2;
        } else {
            return query_run_1;
        }
    }

    public static SubLObject kbq_better_query_run(final SubLObject query_run_1, final SubLObject query_run_2, SubLObject metric, SubLObject compare_func) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        if (compare_func == UNPROVIDED) {
            compare_func = $sym82$KBQ_QUERY_RUN_BETTER_;
        }
        if (NIL != funcall(compare_func, query_run_2, query_run_1, metric)) {
            return query_run_2;
        }
        return query_run_1;
    }

    /**
     *
     *
     * @return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2.
    Optimizes for answer-count, and only uses METRIC to break ties.
     */
    @LispMethod(comment = "@return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2.\r\nOptimizes for answer-count, and only uses METRIC to break ties.")
    public static final SubLObject kbq_query_run_betterP_alt(SubLObject query_run_1, SubLObject query_run_2, SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        {
            SubLObject answer_count_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, $ANSWER_COUNT, ZERO_INTEGER);
            SubLObject answer_count_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, $ANSWER_COUNT, ZERO_INTEGER);
            if (answer_count_1.numG(answer_count_2)) {
                return T;
            } else {
                if (answer_count_1.numL(answer_count_2)) {
                    return NIL;
                } else {
                    {
                        SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, metric, UNPROVIDED);
                        SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, metric, UNPROVIDED);
                        return list_utilities.safe_L(time_1, time_2);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2.
    Optimizes for answer-count, and only uses METRIC to break ties.
     */
    @LispMethod(comment = "@return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2.\r\nOptimizes for answer-count, and only uses METRIC to break ties.")
    public static SubLObject kbq_query_run_betterP(final SubLObject query_run_1, final SubLObject query_run_2, SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        final SubLObject answer_count_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, $ANSWER_COUNT, ZERO_INTEGER);
        final SubLObject answer_count_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, $ANSWER_COUNT, ZERO_INTEGER);
        if (answer_count_1.numG(answer_count_2)) {
            return T;
        }
        if (answer_count_1.numL(answer_count_2)) {
            return NIL;
        }
        final SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, metric, UNPROVIDED);
        final SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, metric, UNPROVIDED);
        return list_utilities.safe_L(time_1, time_2);
    }

    /**
     *
     *
     * @return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2.
    Prefers answerable over unanswerable, and uses METRIC to break ties.
    Using this with :time-to-first-answer makes no sense.
     */
    @LispMethod(comment = "@return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2.\r\nPrefers answerable over unanswerable, and uses METRIC to break ties.\r\nUsing this with :time-to-first-answer makes no sense.")
    public static final SubLObject kbq_query_run_better_per_answerP_alt(SubLObject query_run_1, SubLObject query_run_2, SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        {
            SubLObject answer_count_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, $ANSWER_COUNT, ZERO_INTEGER);
            SubLObject answer_count_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, $ANSWER_COUNT, ZERO_INTEGER);
            if (answer_count_1.isZero() && answer_count_2.isZero()) {
                {
                    SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, metric, UNPROVIDED);
                    SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, metric, UNPROVIDED);
                    return list_utilities.safe_L(time_1, time_2);
                }
            } else {
                if (answer_count_1.isZero()) {
                    return NIL;
                } else {
                    if (answer_count_2.isZero()) {
                        return T;
                    } else {
                        {
                            SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, metric, UNPROVIDED);
                            SubLObject time_per_answer_1 = divide(time_1, answer_count_1);
                            SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, metric, UNPROVIDED);
                            SubLObject time_per_answer_2 = divide(time_2, answer_count_2);
                            return list_utilities.safe_L(time_per_answer_1, time_per_answer_2);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2.
    Prefers answerable over unanswerable, and uses METRIC to break ties.
    Using this with :time-to-first-answer makes no sense.
     */
    @LispMethod(comment = "@return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2.\r\nPrefers answerable over unanswerable, and uses METRIC to break ties.\r\nUsing this with :time-to-first-answer makes no sense.")
    public static SubLObject kbq_query_run_better_per_answerP(final SubLObject query_run_1, final SubLObject query_run_2, SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        final SubLObject answer_count_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, $ANSWER_COUNT, ZERO_INTEGER);
        final SubLObject answer_count_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, $ANSWER_COUNT, ZERO_INTEGER);
        if (answer_count_1.isZero() && answer_count_2.isZero()) {
            final SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, metric, UNPROVIDED);
            final SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, metric, UNPROVIDED);
            return list_utilities.safe_L(time_1, time_2);
        }
        if (answer_count_1.isZero()) {
            return NIL;
        }
        if (answer_count_2.isZero()) {
            return T;
        }
        final SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, metric, UNPROVIDED);
        final SubLObject time_per_answer_1 = divide(time_1, answer_count_1);
        final SubLObject time_3 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, metric, UNPROVIDED);
        final SubLObject time_per_answer_2 = divide(time_3, answer_count_2);
        return list_utilities.safe_L(time_per_answer_1, time_per_answer_2);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_cyc_projects_inference_arete_exp = makeString("/cyc/projects/inference/arete/experiments/");

    static private final SubLString $str_alt1$_ = makeString(".");

    static private final SubLString $str_alt3$_cyc_projects_inference_arete_ana = makeString("/cyc/projects/inference/arete/analysis/");

    static private final SubLString $str_alt7$kbq__8D__6D__A = makeString("kbq-~8D-~6D-~A");

    static private final SubLString $str_alt10$tkb_training_with_auto_destroy_re = makeString("tkb-training-with-auto-destroy-real-time");

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(QUOTE, list(makeSymbol("ALL-ARETE-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(QUOTE, makeSymbol("*ARETE-OUTLIER-TIMEOUT*"))), makeSymbol("INCREMENTAL"), list(makeSymbol("INCLUDE-RESULTS"), T), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT"), list(makeSymbol("DIRECTORY"), makeSymbol("*ARETE-EXPERIMENT-DIRECTORY*")) });

    /**
     *
     *
     * @return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2, caring if it's unanswerable but not caring if it gets fewer answers.
    Prefers answerable over unanswerable, but after that, it doesn't care about answer count, instead it optimizes only for time.
     */
    @LispMethod(comment = "@return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2, caring if it\'s unanswerable but not caring if it gets fewer answers.\r\nPrefers answerable over unanswerable, but after that, it doesn\'t care about answer count, instead it optimizes only for time.")
    public static final SubLObject kbq_query_run_better_wrt_timeP_alt(SubLObject query_run_1, SubLObject query_run_2, SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        {
            SubLObject answer_count_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, $ANSWER_COUNT, ZERO_INTEGER);
            SubLObject answer_count_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, $ANSWER_COUNT, ZERO_INTEGER);
            if (answer_count_1.isZero() && answer_count_2.isZero()) {
                {
                    SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, metric, UNPROVIDED);
                    SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, metric, UNPROVIDED);
                    return list_utilities.safe_L(time_1, time_2);
                }
            } else {
                if (answer_count_1.isZero()) {
                    return NIL;
                } else {
                    if (answer_count_2.isZero()) {
                        return T;
                    } else {
                        {
                            SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, metric, UNPROVIDED);
                            SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, metric, UNPROVIDED);
                            return list_utilities.safe_L(time_1, time_2);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2, caring if it's unanswerable but not caring if it gets fewer answers.
    Prefers answerable over unanswerable, but after that, it doesn't care about answer count, instead it optimizes only for time.
     */
    @LispMethod(comment = "@return booleanp; t iff QUERY-RUN-1 is better than QUERY-RUN-2, caring if it\'s unanswerable but not caring if it gets fewer answers.\r\nPrefers answerable over unanswerable, but after that, it doesn\'t care about answer count, instead it optimizes only for time.")
    public static SubLObject kbq_query_run_better_wrt_timeP(final SubLObject query_run_1, final SubLObject query_run_2, SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        final SubLObject answer_count_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, $ANSWER_COUNT, ZERO_INTEGER);
        final SubLObject answer_count_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, $ANSWER_COUNT, ZERO_INTEGER);
        if (answer_count_1.isZero() && answer_count_2.isZero()) {
            final SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, metric, UNPROVIDED);
            final SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, metric, UNPROVIDED);
            return list_utilities.safe_L(time_1, time_2);
        }
        if (answer_count_1.isZero()) {
            return NIL;
        }
        if (answer_count_2.isZero()) {
            return T;
        }
        final SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_1, metric, UNPROVIDED);
        final SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value(query_run_2, metric, UNPROVIDED);
        return list_utilities.safe_L(time_1, time_2);
    }

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), $SKIP, makeKeyword("COUNT"), makeKeyword("DIRECTORY") });

    static private final SubLList $list_alt19 = list(makeSymbol("ALL-ARETE-QUERY-METRICS"));

    public static final SubLObject kbq_may_have_harmful_side_effectsP_alt(SubLObject query_spec) {
        return com.cyc.cycjava.cycl.inference.arete.query_may_have_harmful_side_effectsP(kb_query.kbq_sentence(query_spec), kb_query.kbq_mt(query_spec), kb_query.kbq_query_properties(query_spec));
    }

    public static SubLObject kbq_may_have_harmful_side_effectsP(final SubLObject query_spec) {
        return query_may_have_harmful_side_effectsP(kb_query.kbq_sentence(query_spec), kb_query.kbq_mt(query_spec), kb_query.kbq_query_properties(query_spec));
    }

    static private final SubLString $str_alt36$_s_already_exists__specify_OVERWR = makeString("~s already exists, specify OVERWRITE? T if you want to overwrite it");

    public static final SubLObject query_may_have_harmful_side_effectsP_alt(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.inference.arete.sentence_contains_subl_performativeP(sentence)) {
            return T;
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.arete.conditional_sentence_with_closed_decontextualized_antecedent_literalP(sentence, query_properties)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject query_may_have_harmful_side_effectsP(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (NIL != sentence_contains_subl_performativeP(sentence)) {
            return T;
        }
        if (NIL != conditional_sentence_with_closed_decontextualized_antecedent_literalP(sentence, query_properties)) {
            return T;
        }
        return NIL;
    }

    static private final SubLString $str_alt38$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt39$_________________________________ = makeString("=========================================~%");

    static private final SubLString $str_alt40$_a__ = makeString("~a~%");

    static private final SubLList $list_alt41 = list(makeKeyword("COMMENT"), $DATE, makeKeyword("QUERY-RUNS"));

    static private final SubLString $str_alt42$Summary_Statistics___ = makeString("Summary Statistics:~%");

    public static final SubLObject sentence_contains_subl_performativeP_alt(SubLObject sentence) {
        return cycl_utilities.expression_find_if(SUBL_PERFORMATIVE_P, sentence, T, UNPROVIDED);
    }

    public static SubLObject sentence_contains_subl_performativeP(final SubLObject sentence) {
        return cycl_utilities.expression_find_if(SUBL_PERFORMATIVE_P, sentence, T, UNPROVIDED);
    }

    static private final SubLList $list_alt43 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TOTAL-TIME"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"));

    /**
     *
     *
     * @return booleanp; whether OBJECT is a predicate that could cause the execution of arbitrary SubL code as a side effect.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a predicate that could cause the execution of arbitrary SubL code as a side effect.")
    public static final SubLObject subl_performative_p_alt(SubLObject v_object) {
        return makeBoolean((v_object == $$performSubL) || (v_object == $$trueSubL));
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a predicate that could cause the execution of arbitrary SubL code as a side effect.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a predicate that could cause the execution of arbitrary SubL code as a side effect.")
    public static SubLObject subl_performative_p(final SubLObject v_object) {
        return makeBoolean(v_object.eql($$performSubL) || v_object.eql($$trueSubL));
    }

    static private final SubLString $str_alt44$_________________________________ = makeString("-----------------------------------------~%");

    public static final SubLObject conditional_sentence_with_closed_decontextualized_antecedent_literalP_alt(SubLObject sentence, SubLObject query_properties) {
        {
            SubLObject conditional_sentenceP = getf(query_properties, $kw90$CONDITIONAL_SENTENCE_, UNPROVIDED);
            if (NIL != conditional_sentenceP) {
                if (NIL != el_implication_p(sentence)) {
                    {
                        SubLObject antecedent = cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
                        if (NIL == el_conjunction_p(antecedent)) {
                            antecedent = list($$and, antecedent);
                        }
                        {
                            SubLObject args = cycl_utilities.formula_args(antecedent, $IGNORE);
                            SubLObject cdolist_list_var = args;
                            SubLObject literal = NIL;
                            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                if (NIL != closedP(literal, UNPROVIDED)) {
                                    if (NIL != kb_accessors.decontextualized_literalP(literal)) {
                                        return T;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject conditional_sentence_with_closed_decontextualized_antecedent_literalP(final SubLObject sentence, final SubLObject query_properties) {
        final SubLObject conditional_sentenceP = getf(query_properties, $kw90$CONDITIONAL_SENTENCE_, UNPROVIDED);
        if ((NIL != conditional_sentenceP) && (NIL != el_implication_p(sentence))) {
            SubLObject antecedent = cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
            if (NIL == el_conjunction_p(antecedent)) {
                antecedent = list($$and, antecedent);
            }
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(antecedent, $IGNORE);
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != closedP(literal, UNPROVIDED)) && (NIL != kb_accessors.decontextualized_literalP(literal))) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    static private final SubLList $list_alt53 = list(makeKeyword("TOTAL-TIME"), makeKeyword("MAX-TRANSFORMATION-DEPTH"));

    static private final SubLList $list_alt54 = list(makeKeyword("TOTAL-TIME"), makeKeyword("MAX-TIME"));

    static private final SubLList $list_alt55 = list(makeKeyword("MAX-TIME"), makeKeyword("TOTAL-TIME"));

    static private final SubLList $list_alt57 = list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-SENTENCE-CLOSED?"));

    static private final SubLList $list_alt58 = list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-CANONICAL-MT"));

    static private final SubLList $list_alt59 = list(makeKeyword("TOTAL-TIME"), list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-CANONICAL-MT")));

    static private final SubLString $str_alt60$_s_Histogram___ = makeString("~s Histogram:~%");

    /**
     * Return non-NIL iff QUERY represents a query involving numeric quantification.
     */
    @LispMethod(comment = "Return non-NIL iff QUERY represents a query involving numeric quantification.")
    public static final SubLObject kbq_numeric_quantification_queryP_alt(SubLObject query) {
        {
            SubLObject sentence = kb_query.kbq_sentence(query);
            SubLObject constants = cycl_utilities.expression_gather(sentence, symbol_function(CONSTANT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject witness = NIL;
            if (NIL == witness) {
                {
                    SubLObject csome_list_var = constants;
                    SubLObject constant = NIL;
                    for (constant = csome_list_var.first(); !((NIL != witness) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , constant = csome_list_var.first()) {
                        if (NIL != subl_promotions.memberP(constant, $list_alt94, symbol_function(EQ), UNPROVIDED)) {
                            witness = constant;
                        }
                    }
                }
            }
            return witness;
        }
    }

    /**
     * Return non-NIL iff QUERY represents a query involving numeric quantification.
     */
    @LispMethod(comment = "Return non-NIL iff QUERY represents a query involving numeric quantification.")
    public static SubLObject kbq_numeric_quantification_queryP(final SubLObject query) {
        final SubLObject sentence = kb_query.kbq_sentence(query);
        final SubLObject constants = cycl_utilities.expression_gather(sentence, symbol_function(CONSTANT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject witness = NIL;
        if (NIL == witness) {
            SubLObject csome_list_var = constants;
            SubLObject constant = NIL;
            constant = csome_list_var.first();
            while ((NIL == witness) && (NIL != csome_list_var)) {
                if (NIL != subl_promotions.memberP(constant, $list94, symbol_function(EQL), UNPROVIDED)) {
                    witness = constant;
                }
                csome_list_var = csome_list_var.rest();
                constant = csome_list_var.first();
            } 
        }
        return witness;
    }

    static private final SubLString $str_alt62$_s_Data___ = makeString("~s Data:~%");

    static private final SubLString $str_alt63$_s_Tuples___ = makeString("~s Tuples:~%");

    static private final SubLString $str_alt65$_s_applied_to__s___ = makeString("~s applied to ~s:~%");

    static private final SubLString $str_alt68$_s_____s__ = makeString("~s -> ~s~%");

    static private final SubLList $list_alt70 = list(makeSymbol("KBQ-GENERATE-PROPERTY-CORRELATION-PLOT"));

    static private final SubLList $list_alt72 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTY-COMPARISON"));

    /**
     * Return non-NIL iff QUERY does not represent a query involving numeric quantification.
     */
    @LispMethod(comment = "Return non-NIL iff QUERY does not represent a query involving numeric quantification.")
    public static final SubLObject kbq_not_numeric_quantification_queryP_alt(SubLObject query) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.arete.kbq_numeric_quantification_queryP(query));
    }

    /**
     * Return non-NIL iff QUERY does not represent a query involving numeric quantification.
     */
    @LispMethod(comment = "Return non-NIL iff QUERY does not represent a query involving numeric quantification.")
    public static SubLObject kbq_not_numeric_quantification_queryP(final SubLObject query) {
        return makeBoolean(NIL == kbq_numeric_quantification_queryP(query));
    }

    public static SubLObject declare_arete_file() {
        declareFunction("arete_enable_global_logging", "ARETE-ENABLE-GLOBAL-LOGGING", 0, 0, false);
        declareFunction("arete_disable_global_logging", "ARETE-DISABLE-GLOBAL-LOGGING", 0, 0, false);
        declareFunction("arete_clear_global_logging", "ARETE-CLEAR-GLOBAL-LOGGING", 0, 0, false);
        declareFunction("arete_note_assertion_touched", "ARETE-NOTE-ASSERTION-TOUCHED", 1, 0, false);
        declareFunction("arete_note_constant_touched", "ARETE-NOTE-CONSTANT-TOUCHED", 1, 0, false);
        declareFunction("arete_note_nart_touched", "ARETE-NOTE-NART-TOUCHED", 1, 0, false);
        declareFunction("arete_note_object_touched", "ARETE-NOTE-OBJECT-TOUCHED", 1, 0, false);
        declareFunction("arete_last_assertion_touched", "ARETE-LAST-ASSERTION-TOUCHED", 0, 0, false);
        declareFunction("arete_last_constant_touched", "ARETE-LAST-CONSTANT-TOUCHED", 0, 0, false);
        declareFunction("arete_last_nart_touched", "ARETE-LAST-NART-TOUCHED", 0, 0, false);
        declareFunction("arete_last_term_touched", "ARETE-LAST-TERM-TOUCHED", 0, 0, false);
        declareFunction("arete_assertions_touched_count", "ARETE-ASSERTIONS-TOUCHED-COUNT", 0, 0, false);
        declareFunction("arete_constants_touched_count", "ARETE-CONSTANTS-TOUCHED-COUNT", 0, 0, false);
        declareFunction("arete_narts_touched_count", "ARETE-NARTS-TOUCHED-COUNT", 0, 0, false);
        declareFunction("arete_terms_touched_count", "ARETE-TERMS-TOUCHED-COUNT", 0, 0, false);
        declareFunction("arete_experiment_full_filename", "ARETE-EXPERIMENT-FULL-FILENAME", 1, 1, false);
        declareFunction("arete_analysis_full_filename", "ARETE-ANALYSIS-FULL-FILENAME", 1, 0, false);
        declareFunction("load_arete_experiment", "LOAD-ARETE-EXPERIMENT", 1, 0, false);
        declareFunction("suggest_filename_for_query_set_run", "SUGGEST-FILENAME-FOR-QUERY-SET-RUN", 1, 0, false);
        declareFunction("kbq_load_control_query_set_run", "KBQ-LOAD-CONTROL-QUERY-SET-RUN", 0, 1, false);
        declareFunction("kbq_compare_query_set_run_answers_to_control", "KBQ-COMPARE-QUERY-SET-RUN-ANSWERS-TO-CONTROL", 1, 0, false);
        declareMacro("run_arete_experiment", "RUN-ARETE-EXPERIMENT");
        declareFunction("kbq_query_set_run_scaling_factors", "KBQ-QUERY-SET-RUN-SCALING-FACTORS", 2, 1, false);
        declareFunction("kbq_compute_scaling_factors_from_analysis", "KBQ-COMPUTE-SCALING-FACTORS-FROM-ANALYSIS", 1, 0, false);
        declareFunction("kbq_scale_analysis", "KBQ-SCALE-ANALYSIS", 3, 0, false);
        declareFunction("multiply_scaling_factors", "MULTIPLY-SCALING-FACTORS", 2, 0, false);
        declareFunction("invert_scaling_factors", "INVERT-SCALING-FACTORS", 1, 0, false);
        declareFunction("kbq_save_report", "KBQ-SAVE-REPORT", 2, 1, false);
        declareFunction("kbq_print_report", "KBQ-PRINT-REPORT", 1, 1, false);
        declareFunction("kbq_print_histogram", "KBQ-PRINT-HISTOGRAM", 3, 0, false);
        declareFunction("kbq_print_data", "KBQ-PRINT-DATA", 3, 0, false);
        declareFunction("kbq_print_tuples", "KBQ-PRINT-TUPLES", 3, 0, false);
        declareFunction("kbq_print_func_of_tuples", "KBQ-PRINT-FUNC-OF-TUPLES", 4, 0, false);
        declareFunction("kbq_compute_tuples", "KBQ-COMPUTE-TUPLES", 2, 0, false);
        declareFunction("kbq_print_error_queries", "KBQ-PRINT-ERROR-QUERIES", 1, 0, false);
        declareFunction("arete_generate_property_correlation_plot", "ARETE-GENERATE-PROPERTY-CORRELATION-PLOT", 3, 2, false);
        declareFunction("arete_generate_sorted_property_comparison", "ARETE-GENERATE-SORTED-PROPERTY-COMPARISON", 3, 3, false);
        declareFunction("arete_generate_sorted_properties_comparison", "ARETE-GENERATE-SORTED-PROPERTIES-COMPARISON", 2, 3, false);
        declareFunction("arete_generate_sorted_property_display", "ARETE-GENERATE-SORTED-PROPERTY-DISPLAY", 2, 3, false);
        declareFunction("assertion_cons_sharing_dictionary", "ASSERTION-CONS-SHARING-DICTIONARY", 0, 0, false);
        declareFunction("conses_saved_and_total_conses", "CONSES-SAVED-AND-TOTAL-CONSES", 1, 0, false);
        declareFunction("nauts_shared_and_unshared", "NAUTS-SHARED-AND-UNSHARED", 1, 0, false);
        declareFunction("kbq_hybridize_query_set_runs", "KBQ-HYBRIDIZE-QUERY-SET-RUNS", 1, 4, false);
        declareFunction("kbq_tag_query_set_runs", "KBQ-TAG-QUERY-SET-RUNS", 2, 0, false);
        declareFunction("kbq_hybridize_two_query_set_runs", "KBQ-HYBRIDIZE-TWO-QUERY-SET-RUNS", 2, 3, false);
        declareFunction("kbq_better_query_run", "KBQ-BETTER-QUERY-RUN", 2, 2, false);
        declareFunction("kbq_query_run_betterP", "KBQ-QUERY-RUN-BETTER?", 2, 1, false);
        declareFunction("kbq_query_run_better_per_answerP", "KBQ-QUERY-RUN-BETTER-PER-ANSWER?", 2, 1, false);
        declareFunction("kbq_query_run_better_wrt_timeP", "KBQ-QUERY-RUN-BETTER-WRT-TIME?", 2, 1, false);
        declareFunction("kbq_may_have_harmful_side_effectsP", "KBQ-MAY-HAVE-HARMFUL-SIDE-EFFECTS?", 1, 0, false);
        declareFunction("query_may_have_harmful_side_effectsP", "QUERY-MAY-HAVE-HARMFUL-SIDE-EFFECTS?", 1, 2, false);
        declareFunction("sentence_contains_subl_performativeP", "SENTENCE-CONTAINS-SUBL-PERFORMATIVE?", 1, 0, false);
        declareFunction("subl_performative_p", "SUBL-PERFORMATIVE-P", 1, 0, false);
        declareFunction("conditional_sentence_with_closed_decontextualized_antecedent_literalP", "CONDITIONAL-SENTENCE-WITH-CLOSED-DECONTEXTUALIZED-ANTECEDENT-LITERAL?", 2, 0, false);
        declareFunction("kbq_numeric_quantification_queryP", "KBQ-NUMERIC-QUANTIFICATION-QUERY?", 1, 0, false);
        declareFunction("kbq_not_numeric_quantification_queryP", "KBQ-NOT-NUMERIC-QUANTIFICATION-QUERY?", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt75 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTIES-COMPARISON"));

    static private final SubLList $list_alt78 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTY-DISPLAY"));

    static private final SubLString $str_alt86$__Hybridized_with___ = makeString("~%Hybridized with:~%");

    static private final SubLList $list_alt94 = list(reader_make_constant_shell("nthLargestElement"), reader_make_constant_shell("extentCardinality"), reader_make_constant_shell("PlusAll"), reader_make_constant_shell("Average"), reader_make_constant_shell("ratioOfCollectionToDifferentiatedCollection"), reader_make_constant_shell("performsActsOfType-Percentage"));

    public static final SubLObject init_arete_file_alt() {
        defparameter("*ARETE-LOG-KB-TOUCHES?*", NIL);
        deflexical("*ARETE-EXPERIMENT-DIRECTORY*", $str_alt0$_cyc_projects_inference_arete_exp);
        deflexical("*ARETE-ANALYSIS-DIRECTORY*", $str_alt3$_cyc_projects_inference_arete_ana);
        deflexical("*KBQ-CONTROL-QUERY-SET-RUN*", NIL != boundp($kbq_control_query_set_run$) ? ((SubLObject) ($kbq_control_query_set_run$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*ARETE-OUTLIER-TIMEOUT*", kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue());
        return NIL;
    }

    public static SubLObject init_arete_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*ARETE-EXPERIMENT-DIRECTORY*", $str0$_cyc_projects_inference_arete_exp);
            deflexical("*ARETE-ANALYSIS-DIRECTORY*", $str3$_cyc_projects_inference_arete_ana);
            deflexical("*KBQ-CONTROL-QUERY-SET-RUN*", SubLTrampolineFile.maybeDefault($kbq_control_query_set_run$, $kbq_control_query_set_run$, $UNINITIALIZED));
            deflexical("*ARETE-OUTLIER-TIMEOUT*", kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue());
        }
        if (SubLFiles.USE_V2) {
            defparameter("*ARETE-LOG-KB-TOUCHES?*", NIL);
            deflexical("*KBQ-CONTROL-QUERY-SET-RUN*", NIL != boundp($kbq_control_query_set_run$) ? ((SubLObject) ($kbq_control_query_set_run$.getGlobalValue())) : $UNINITIALIZED);
        }
        return NIL;
    }

    public static SubLObject init_arete_file_Previous() {
        deflexical("*ARETE-EXPERIMENT-DIRECTORY*", $str0$_cyc_projects_inference_arete_exp);
        deflexical("*ARETE-ANALYSIS-DIRECTORY*", $str3$_cyc_projects_inference_arete_ana);
        deflexical("*KBQ-CONTROL-QUERY-SET-RUN*", SubLTrampolineFile.maybeDefault($kbq_control_query_set_run$, $kbq_control_query_set_run$, $UNINITIALIZED));
        deflexical("*ARETE-OUTLIER-TIMEOUT*", kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_arete_file() {
        declare_defglobal($kbq_control_query_set_run$);
        define_obsolete_register(ARETE_GENERATE_PROPERTY_CORRELATION_PLOT, $list70);
        define_obsolete_register(ARETE_GENERATE_SORTED_PROPERTY_COMPARISON, $list72);
        define_obsolete_register(ARETE_GENERATE_SORTED_PROPERTIES_COMPARISON, $list75);
        define_obsolete_register(ARETE_GENERATE_SORTED_PROPERTY_DISPLAY, $list78);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_arete_file();
    }

    @Override
    public void initializeVariables() {
        init_arete_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_arete_file();
    }

    
}

/**
 * Total time: 386 ms
 */
