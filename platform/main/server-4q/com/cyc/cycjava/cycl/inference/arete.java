package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class arete extends SubLTranslatedFile {
    public static final SubLFile me = new arete();

    public static final String myName = "com.cyc.cycjava.cycl.inference.arete";

    public static final String myFingerPrint = "4603bf74af0a23a8fe40584f19192c2c08027b002b3f5d8becabdf75976f18f0";

    // deflexical
    private static final SubLSymbol $arete_experiment_directory$ = makeSymbol("*ARETE-EXPERIMENT-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $arete_analysis_directory$ = makeSymbol("*ARETE-ANALYSIS-DIRECTORY*");





    // Internal Constants
    public static final SubLString $str0$_cyc_projects_inference_arete_exp = makeString("/cyc/projects/inference/arete/experiments/");

    public static final SubLString $str1$_ = makeString(".");

    public static final SubLString $$$cfasl = makeString("cfasl");

    public static final SubLString $str3$_cyc_projects_inference_arete_ana = makeString("/cyc/projects/inference/arete/analysis/");

    public static final SubLString $$$txt = makeString("txt");





    public static final SubLString $str7$kbq__8D__6D__A = makeString("kbq-~8D-~6D-~A");

    public static final SubLSymbol $kbq_control_query_set_run$ = makeSymbol("*KBQ-CONTROL-QUERY-SET-RUN*");



    public static final SubLString $str10$tkb_training_with_auto_destroy_re = makeString("tkb-training-with-auto-destroy-real-time");

    public static final SubLList $list11 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-ARETE-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*ARETE-OUTLIER-TIMEOUT*"))), makeSymbol("INCREMENTAL"), list(makeSymbol("INCLUDE-RESULTS"), T), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT"), list(makeSymbol("DIRECTORY"), makeSymbol("*ARETE-EXPERIMENT-DIRECTORY*")) });

    public static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("SKIP"), makeKeyword("COUNT"), makeKeyword("DIRECTORY") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $QUERY_SPEC_SET = makeKeyword("QUERY-SPEC-SET");





    private static final SubLSymbol $OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");



    public static final SubLList $list19 = list(makeSymbol("ALL-ARETE-QUERY-METRICS"));



    public static final SubLSymbol $arete_outlier_timeout$ = makeSymbol("*ARETE-OUTLIER-TIMEOUT*");











    public static final SubLSymbol $sym27$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    public static final SubLSymbol $sym28$FULL_FILENAME = makeUninternedSymbol("FULL-FILENAME");





    public static final SubLSymbol ARETE_EXPERIMENT_FULL_FILENAME = makeSymbol("ARETE-EXPERIMENT-FULL-FILENAME");

    public static final SubLSymbol RUN_KBQ_EXPERIMENT = makeSymbol("RUN-KBQ-EXPERIMENT");







    public static final SubLString $str36$_s_already_exists__specify_OVERWR = makeString("~s already exists, specify OVERWRITE? T if you want to overwrite it");



    public static final SubLString $str38$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLString $str39$_________________________________ = makeString("=========================================~%");

    public static final SubLString $str40$_a__ = makeString("~a~%");

    public static final SubLList $list41 = list(makeKeyword("COMMENT"), makeKeyword("DATE"), makeKeyword("QUERY-RUNS"));

    public static final SubLString $str42$Summary_Statistics___ = makeString("Summary Statistics:~%");

    public static final SubLList $list43 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TOTAL-TIME"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"));

    public static final SubLString $str44$_________________________________ = makeString("-----------------------------------------~%");







    private static final SubLSymbol $TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");

    private static final SubLSymbol $TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");





    public static final SubLList $list53 = list(makeKeyword("TOTAL-TIME"), makeKeyword("MAX-TRANSFORMATION-DEPTH"));

    public static final SubLList $list54 = list(makeKeyword("TOTAL-TIME"), makeKeyword("MAX-TIME"));

    public static final SubLList $list55 = list(makeKeyword("MAX-TIME"), makeKeyword("TOTAL-TIME"));

    public static final SubLSymbol SAFE_DIFFERENCE = makeSymbol("SAFE-DIFFERENCE");

    public static final SubLList $list57 = list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-SENTENCE-CLOSED?"));

    public static final SubLList $list58 = list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-CANONICAL-MT"));

    public static final SubLList $list59 = list(makeKeyword("TOTAL-TIME"), list(makeKeyword("QUERY-FUNCALL"), makeSymbol("KBQ-CANONICAL-MT")));

    public static final SubLString $str60$_s_Histogram___ = makeString("~s Histogram:~%");

    public static final SubLSymbol $sym61$SAFE__ = makeSymbol("SAFE-<");

    public static final SubLString $str62$_s_Data___ = makeString("~s Data:~%");

    public static final SubLString $str63$_s_Tuples___ = makeString("~s Tuples:~%");



    public static final SubLString $str65$_s_applied_to__s___ = makeString("~s applied to ~s:~%");





    public static final SubLString $str68$_s_____s__ = makeString("~s -> ~s~%");

    public static final SubLSymbol ARETE_GENERATE_PROPERTY_CORRELATION_PLOT = makeSymbol("ARETE-GENERATE-PROPERTY-CORRELATION-PLOT");

    public static final SubLList $list70 = list(makeSymbol("KBQ-GENERATE-PROPERTY-CORRELATION-PLOT"));

    public static final SubLSymbol ARETE_GENERATE_SORTED_PROPERTY_COMPARISON = makeSymbol("ARETE-GENERATE-SORTED-PROPERTY-COMPARISON");

    public static final SubLList $list72 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTY-COMPARISON"));



    public static final SubLSymbol ARETE_GENERATE_SORTED_PROPERTIES_COMPARISON = makeSymbol("ARETE-GENERATE-SORTED-PROPERTIES-COMPARISON");

    public static final SubLList $list75 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTIES-COMPARISON"));



    public static final SubLSymbol ARETE_GENERATE_SORTED_PROPERTY_DISPLAY = makeSymbol("ARETE-GENERATE-SORTED-PROPERTY-DISPLAY");

    public static final SubLList $list78 = list(makeSymbol("KBQ-GENERATE-SORTED-PROPERTY-DISPLAY"));

    public static final SubLString $$$Interning_all_assertion_conses = makeString("Interning all assertion conses");



    public static final SubLString $$$Looking_for_shared_nauts = makeString("Looking for shared nauts");

    public static final SubLSymbol $sym82$KBQ_QUERY_RUN_BETTER_ = makeSymbol("KBQ-QUERY-RUN-BETTER?");





    public static final SubLString $str85$ = makeString("");

    public static final SubLString $str86$__Hybridized_with___ = makeString("~%Hybridized with:~%");

    public static final SubLSymbol SUBL_PERFORMATIVE_P = makeSymbol("SUBL-PERFORMATIVE-P");

    private static final SubLObject $$performSubL = reader_make_constant_shell(makeString("performSubL"));

    private static final SubLObject $$trueSubL = reader_make_constant_shell(makeString("trueSubL"));

    private static final SubLSymbol $kw90$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));





    public static final SubLList $list94 = list(reader_make_constant_shell(makeString("nthLargestElement")), reader_make_constant_shell(makeString("extentCardinality")), reader_make_constant_shell(makeString("PlusAll")), reader_make_constant_shell(makeString("Average")), reader_make_constant_shell(makeString("ratioOfCollectionToDifferentiatedCollection")), reader_make_constant_shell(makeString("performsActsOfType-Percentage")));

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

    public static SubLObject arete_experiment_full_filename(final SubLObject filename, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $arete_experiment_directory$.getGlobalValue();
        }
        return cconcatenate(directory, new SubLObject[]{ filename, $str1$_, $$$cfasl });
    }

    public static SubLObject arete_analysis_full_filename(final SubLObject filename) {
        return cconcatenate($arete_analysis_directory$.getGlobalValue(), new SubLObject[]{ filename, $str1$_, $$$txt });
    }

    public static SubLObject load_arete_experiment(final SubLObject filename) {
        final SubLObject full_filename = arete_experiment_full_filename(filename, UNPROVIDED);
        return kbq_query_run.kbq_load_query_set_run(full_filename);
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

    public static SubLObject kbq_compare_query_set_run_answers_to_control(final SubLObject query_set_run) {
        return kbq_query_run.kbq_compare_query_set_run_answers($kbq_control_query_set_run$.getGlobalValue(), query_set_run);
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

    public static SubLObject kbq_query_set_run_scaling_factors(final SubLObject query_set_run_1, final SubLObject query_set_run_2, SubLObject metrics) {
        if (metrics == UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        final SubLObject analysis = kbq_query_run.kbq_analyze_query_set_runs(query_set_run_1, query_set_run_2, metrics);
        return kbq_compute_scaling_factors_from_analysis(analysis);
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

    public static SubLObject kbq_print_histogram(final SubLObject query_set_run, final SubLObject stream, final SubLObject property) {
        format(stream, $str60$_s_Histogram___, property);
        final SubLObject values = kbq_query_run.kbq_extract_property_values(query_set_run, property, UNPROVIDED);
        final SubLObject histogram_plist = list_utilities.histogram_as_plist(values, symbol_function($sym61$SAFE__), symbol_function(EQUAL), UNPROVIDED);
        list_utilities.pretty_print_plist(histogram_plist, stream);
        format(stream, $str44$_________________________________);
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

    public static SubLObject kbq_print_tuples(final SubLObject query_set_run, final SubLObject stream, final SubLObject v_properties) {
        format(stream, $str63$_s_Tuples___, v_properties);
        final SubLObject tuples = kbq_compute_tuples(query_set_run, v_properties);
        final SubLObject sorted_tuples = Sort.sort(copy_list(tuples), symbol_function($sym61$SAFE__), symbol_function(FIRST));
        format_nil.print_one_per_line(sorted_tuples, stream);
        terpri(stream);
        format(stream, $str44$_________________________________);
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

    public static SubLObject arete_generate_property_correlation_plot(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        return plot_generation.kbq_generate_property_correlation_plot(baseline_run, experiment_run, property, plot_properties, display);
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

    public static SubLObject assertion_cons_sharing_dictionary() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), assertion_handles.assertion_count());
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Interning_all_assertion_conses;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
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

    public static SubLObject kbq_may_have_harmful_side_effectsP(final SubLObject query_spec) {
        return query_may_have_harmful_side_effectsP(kb_query.kbq_sentence(query_spec), kb_query.kbq_mt(query_spec), kb_query.kbq_query_properties(query_spec));
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

    public static SubLObject sentence_contains_subl_performativeP(final SubLObject sentence) {
        return cycl_utilities.expression_find_if(SUBL_PERFORMATIVE_P, sentence, T, UNPROVIDED);
    }

    public static SubLObject subl_performative_p(final SubLObject v_object) {
        return makeBoolean(v_object.eql($$performSubL) || v_object.eql($$trueSubL));
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

    public static SubLObject kbq_not_numeric_quantification_queryP(final SubLObject query) {
        return makeBoolean(NIL == kbq_numeric_quantification_queryP(query));
    }

    public static SubLObject declare_arete_file() {
        declareFunction(me, "arete_enable_global_logging", "ARETE-ENABLE-GLOBAL-LOGGING", 0, 0, false);
        declareFunction(me, "arete_disable_global_logging", "ARETE-DISABLE-GLOBAL-LOGGING", 0, 0, false);
        declareFunction(me, "arete_clear_global_logging", "ARETE-CLEAR-GLOBAL-LOGGING", 0, 0, false);
        declareFunction(me, "arete_note_assertion_touched", "ARETE-NOTE-ASSERTION-TOUCHED", 1, 0, false);
        declareFunction(me, "arete_note_constant_touched", "ARETE-NOTE-CONSTANT-TOUCHED", 1, 0, false);
        declareFunction(me, "arete_note_nart_touched", "ARETE-NOTE-NART-TOUCHED", 1, 0, false);
        declareFunction(me, "arete_note_object_touched", "ARETE-NOTE-OBJECT-TOUCHED", 1, 0, false);
        declareFunction(me, "arete_last_assertion_touched", "ARETE-LAST-ASSERTION-TOUCHED", 0, 0, false);
        declareFunction(me, "arete_last_constant_touched", "ARETE-LAST-CONSTANT-TOUCHED", 0, 0, false);
        declareFunction(me, "arete_last_nart_touched", "ARETE-LAST-NART-TOUCHED", 0, 0, false);
        declareFunction(me, "arete_last_term_touched", "ARETE-LAST-TERM-TOUCHED", 0, 0, false);
        declareFunction(me, "arete_assertions_touched_count", "ARETE-ASSERTIONS-TOUCHED-COUNT", 0, 0, false);
        declareFunction(me, "arete_constants_touched_count", "ARETE-CONSTANTS-TOUCHED-COUNT", 0, 0, false);
        declareFunction(me, "arete_narts_touched_count", "ARETE-NARTS-TOUCHED-COUNT", 0, 0, false);
        declareFunction(me, "arete_terms_touched_count", "ARETE-TERMS-TOUCHED-COUNT", 0, 0, false);
        declareFunction(me, "arete_experiment_full_filename", "ARETE-EXPERIMENT-FULL-FILENAME", 1, 1, false);
        declareFunction(me, "arete_analysis_full_filename", "ARETE-ANALYSIS-FULL-FILENAME", 1, 0, false);
        declareFunction(me, "load_arete_experiment", "LOAD-ARETE-EXPERIMENT", 1, 0, false);
        declareFunction(me, "suggest_filename_for_query_set_run", "SUGGEST-FILENAME-FOR-QUERY-SET-RUN", 1, 0, false);
        declareFunction(me, "kbq_load_control_query_set_run", "KBQ-LOAD-CONTROL-QUERY-SET-RUN", 0, 1, false);
        declareFunction(me, "kbq_compare_query_set_run_answers_to_control", "KBQ-COMPARE-QUERY-SET-RUN-ANSWERS-TO-CONTROL", 1, 0, false);
        declareMacro(me, "run_arete_experiment", "RUN-ARETE-EXPERIMENT");
        declareFunction(me, "kbq_query_set_run_scaling_factors", "KBQ-QUERY-SET-RUN-SCALING-FACTORS", 2, 1, false);
        declareFunction(me, "kbq_compute_scaling_factors_from_analysis", "KBQ-COMPUTE-SCALING-FACTORS-FROM-ANALYSIS", 1, 0, false);
        declareFunction(me, "kbq_scale_analysis", "KBQ-SCALE-ANALYSIS", 3, 0, false);
        declareFunction(me, "multiply_scaling_factors", "MULTIPLY-SCALING-FACTORS", 2, 0, false);
        declareFunction(me, "invert_scaling_factors", "INVERT-SCALING-FACTORS", 1, 0, false);
        declareFunction(me, "kbq_save_report", "KBQ-SAVE-REPORT", 2, 1, false);
        declareFunction(me, "kbq_print_report", "KBQ-PRINT-REPORT", 1, 1, false);
        declareFunction(me, "kbq_print_histogram", "KBQ-PRINT-HISTOGRAM", 3, 0, false);
        declareFunction(me, "kbq_print_data", "KBQ-PRINT-DATA", 3, 0, false);
        declareFunction(me, "kbq_print_tuples", "KBQ-PRINT-TUPLES", 3, 0, false);
        declareFunction(me, "kbq_print_func_of_tuples", "KBQ-PRINT-FUNC-OF-TUPLES", 4, 0, false);
        declareFunction(me, "kbq_compute_tuples", "KBQ-COMPUTE-TUPLES", 2, 0, false);
        declareFunction(me, "kbq_print_error_queries", "KBQ-PRINT-ERROR-QUERIES", 1, 0, false);
        declareFunction(me, "arete_generate_property_correlation_plot", "ARETE-GENERATE-PROPERTY-CORRELATION-PLOT", 3, 2, false);
        declareFunction(me, "arete_generate_sorted_property_comparison", "ARETE-GENERATE-SORTED-PROPERTY-COMPARISON", 3, 3, false);
        declareFunction(me, "arete_generate_sorted_properties_comparison", "ARETE-GENERATE-SORTED-PROPERTIES-COMPARISON", 2, 3, false);
        declareFunction(me, "arete_generate_sorted_property_display", "ARETE-GENERATE-SORTED-PROPERTY-DISPLAY", 2, 3, false);
        declareFunction(me, "assertion_cons_sharing_dictionary", "ASSERTION-CONS-SHARING-DICTIONARY", 0, 0, false);
        declareFunction(me, "conses_saved_and_total_conses", "CONSES-SAVED-AND-TOTAL-CONSES", 1, 0, false);
        declareFunction(me, "nauts_shared_and_unshared", "NAUTS-SHARED-AND-UNSHARED", 1, 0, false);
        declareFunction(me, "kbq_hybridize_query_set_runs", "KBQ-HYBRIDIZE-QUERY-SET-RUNS", 1, 4, false);
        declareFunction(me, "kbq_tag_query_set_runs", "KBQ-TAG-QUERY-SET-RUNS", 2, 0, false);
        declareFunction(me, "kbq_hybridize_two_query_set_runs", "KBQ-HYBRIDIZE-TWO-QUERY-SET-RUNS", 2, 3, false);
        declareFunction(me, "kbq_better_query_run", "KBQ-BETTER-QUERY-RUN", 2, 2, false);
        declareFunction(me, "kbq_query_run_betterP", "KBQ-QUERY-RUN-BETTER?", 2, 1, false);
        declareFunction(me, "kbq_query_run_better_per_answerP", "KBQ-QUERY-RUN-BETTER-PER-ANSWER?", 2, 1, false);
        declareFunction(me, "kbq_query_run_better_wrt_timeP", "KBQ-QUERY-RUN-BETTER-WRT-TIME?", 2, 1, false);
        declareFunction(me, "kbq_may_have_harmful_side_effectsP", "KBQ-MAY-HAVE-HARMFUL-SIDE-EFFECTS?", 1, 0, false);
        declareFunction(me, "query_may_have_harmful_side_effectsP", "QUERY-MAY-HAVE-HARMFUL-SIDE-EFFECTS?", 1, 2, false);
        declareFunction(me, "sentence_contains_subl_performativeP", "SENTENCE-CONTAINS-SUBL-PERFORMATIVE?", 1, 0, false);
        declareFunction(me, "subl_performative_p", "SUBL-PERFORMATIVE-P", 1, 0, false);
        declareFunction(me, "conditional_sentence_with_closed_decontextualized_antecedent_literalP", "CONDITIONAL-SENTENCE-WITH-CLOSED-DECONTEXTUALIZED-ANTECEDENT-LITERAL?", 2, 0, false);
        declareFunction(me, "kbq_numeric_quantification_queryP", "KBQ-NUMERIC-QUANTIFICATION-QUERY?", 1, 0, false);
        declareFunction(me, "kbq_not_numeric_quantification_queryP", "KBQ-NOT-NUMERIC-QUANTIFICATION-QUERY?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_arete_file() {
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
