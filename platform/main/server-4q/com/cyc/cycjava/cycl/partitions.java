/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.assertions_high.asserted_assertionP;
import static com.cyc.cycjava.cycl.assertions_high.asserted_by;
import static com.cyc.cycjava.cycl.assertions_high.asserted_why;
import static com.cyc.cycjava.cycl.assertions_high.assertion_arguments;
import static com.cyc.cycjava.cycl.assertions_high.assertion_cnf;
import static com.cyc.cycjava.cycl.assertions_high.assertion_direction;
import static com.cyc.cycjava.cycl.assertions_high.assertion_mt;
import static com.cyc.cycjava.cycl.assertions_high.assertion_strength;
import static com.cyc.cycjava.cycl.assertions_high.assertion_variable_names;
import static com.cyc.cycjava.cycl.assertions_high.create_assertion;
import static com.cyc.cycjava.cycl.assertions_high.gaf_predicate;
import static com.cyc.cycjava.cycl.assertions_high.timestamp_asserted_assertion;
import static com.cyc.cycjava.cycl.assertions_high.valid_assertion;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_encodable_stream_p;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.cycjava.cycl.constant_handles.$dtp_constant$;
import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.partition_create_invalid_constant;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$bootstrapping_kbP$;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.enumeration_types.tv_truth;
import static com.cyc.cycjava.cycl.hash_table_utilities.hash_table_values;
import static com.cyc.cycjava.cycl.hl_storage_modules.hl_assert;
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
import static com.cyc.cycjava.cycl.kb_control_vars.$forward_inference_enabledP$;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_cons$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.atom;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.cycjava.cycl.inference.harness.argumentation;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PARTITIONS
 * source file: /cyc/top/cycl/partitions.lisp
 * created:     2019/07/03 17:37:49
 */
public final class partitions extends SubLTranslatedFile implements V12 {
    public static final SubLObject every_possible_spec(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = genls.all_specs(v_term, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject every_possible_instance(SubLObject v_term) {
        return isa.all_instances_in_all_mts(v_term);
    }

    public static final SubLFile me = new partitions();

 public static final String myName = "com.cyc.cycjava.cycl.partitions";


    // defparameter
    // Definitions
    /**
     * A parameter to state that the partition scope is completely specified.  In other words, all the constants, narts, assertions, and deductions will be scoped.
     */
    @LispMethod(comment = "A parameter to state that the partition scope is completely specified.  In other words, all the constants, narts, assertions, and deductions will be scoped.\ndefparameter")
    private static final SubLSymbol $partition_scope_completely_specifiedP$ = makeSymbol("*PARTITION-SCOPE-COMPLETELY-SPECIFIED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reset_sbhl_links$ = makeSymbol("*RESET-SBHL-LINKS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_scope_hash$ = makeSymbol("*PARTITION-SCOPE-HASH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $scope_partition_assertion_selective_test$ = makeSymbol("*SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $assertion_partition_fort_filter_function$ = makeSymbol("*ASSERTION-PARTITION-FORT-FILTER-FUNCTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_constant_hash$ = makeSymbol("*PARTITION-CONSTANT-HASH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_nart_hash$ = makeSymbol("*PARTITION-NART-HASH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_assertion_hash$ = makeSymbol("*PARTITION-ASSERTION-HASH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_meta_assertion_hash$ = makeSymbol("*PARTITION-META-ASSERTION-HASH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_kb_hl_support_hash$ = makeSymbol("*PARTITION-KB-HL-SUPPORT-HASH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_argument_hash$ = makeSymbol("*PARTITION-ARGUMENT-HASH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_max_nart_complexity$ = makeSymbol("*PARTITION-MAX-NART-COMPLEXITY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_max_term_order$ = makeSymbol("*PARTITION-MAX-TERM-ORDER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_kb_hl_support_orders$ = makeSymbol("*PARTITION-KB-HL-SUPPORT-ORDERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_max_kb_hl_support_order$ = makeSymbol("*PARTITION-MAX-KB-HL-SUPPORT-ORDER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $mark_partition_object_method_table$ = makeSymbol("*MARK-PARTITION-OBJECT-METHOD-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $current_archive_stream$ = makeSymbol("*CURRENT-ARCHIVE-STREAM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $dump_partition_format$ = makeSymbol("*DUMP-PARTITION-FORMAT*");

    // defparameter
    /**
     * A list of pairs of the form (<old version> <new version>) for which
     * <new-version> can read partitions produced by <old-version>
     */
    @LispMethod(comment = "A list of pairs of the form (<old version> <new version>) for which\r\n<new-version> can read partitions produced by <old-version>\ndefparameter\nA list of pairs of the form (<old version> <new version>) for which\n<new-version> can read partitions produced by <old-version>")
    private static final SubLSymbol $backwards_compatibility_pairs$ = makeSymbol("*BACKWARDS-COMPATIBILITY-PAIRS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_section_marker$ = makeSymbol("*PARTITION-SECTION-MARKER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_asserted_argument_type_flag$ = makeSymbol("*PARTITION-ASSERTED-ARGUMENT-TYPE-FLAG*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_special_objects$ = makeSymbol("*PARTITION-SPECIAL-OBJECTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partition_entire_kb_loadP$ = makeSymbol("*PARTITION-ENTIRE-KB-LOAD?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_invalid_missing_terms$ = makeSymbol("*LOAD-PARTITION-INVALID-MISSING-TERMS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_max_nart_complexity$ = makeSymbol("*LOAD-PARTITION-MAX-NART-COMPLEXITY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_max_term_order$ = makeSymbol("*LOAD-PARTITION-MAX-TERM-ORDER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_max_kb_hl_support_order$ = makeSymbol("*LOAD-PARTITION-MAX-KB-HL-SUPPORT-ORDER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $trace_partition_link_errors$ = makeSymbol("*TRACE-PARTITION-LINK-ERRORS*");

    // defparameter
    /**
     * An a-list of (MODULE . WEAKER-MODULE) tuples indicating a TMS support MODULE
     * to weaken to WEAKER-MODULE.
     */
    @LispMethod(comment = "An a-list of (MODULE . WEAKER-MODULE) tuples indicating a TMS support MODULE\r\nto weaken to WEAKER-MODULE.\ndefparameter\nAn a-list of (MODULE . WEAKER-MODULE) tuples indicating a TMS support MODULE\nto weaken to WEAKER-MODULE.")
    public static final SubLSymbol $load_partition_weaken_hl_supports$ = makeSymbol("*LOAD-PARTITION-WEAKEN-HL-SUPPORTS*");

    // defparameter
    /**
     * If the partition constants have been prepared already for use, then set this
     * to T to prevent it being slashed by CLEAR-LOAD-PARTITION-ASSERTIONS.
     */
    @LispMethod(comment = "If the partition constants have been prepared already for use, then set this\r\nto T to prevent it being slashed by CLEAR-LOAD-PARTITION-ASSERTIONS.\ndefparameter\nIf the partition constants have been prepared already for use, then set this\nto T to prevent it being slashed by CLEAR-LOAD-PARTITION-ASSERTIONS.")
    private static final SubLSymbol $preseeded_partition_constants$ = makeSymbol("*PRESEEDED-PARTITION-CONSTANTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_missing_constants$ = makeSymbol("*LOAD-PARTITION-MISSING-CONSTANTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_narts$ = makeSymbol("*LOAD-PARTITION-NARTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_scope_narts$ = makeSymbol("*LOAD-PARTITION-SCOPE-NARTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_missing_narts$ = makeSymbol("*LOAD-PARTITION-MISSING-NARTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_assertions$ = makeSymbol("*LOAD-PARTITION-ASSERTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_missing_assertions$ = makeSymbol("*LOAD-PARTITION-MISSING-ASSERTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_kb_hl_supports$ = makeSymbol("*LOAD-PARTITION-KB-HL-SUPPORTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_scope_kb_hl_supports$ = makeSymbol("*LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $load_partition_missing_kb_hl_supports$ = makeSymbol("*LOAD-PARTITION-MISSING-KB-HL-SUPPORTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = cons(makeSymbol("METHOD"), makeSymbol("TERM-SPEC"));

    private static final SubLList $list7 = cons(makeSymbol("FUNCTION"), makeSymbol("ARGS"));

    private static final SubLString $str8$Unknown_scope_partition_function_ = makeString("Unknown scope partition function ~S");

    private static final SubLSymbol $ESTIMATED_ASSERTION_COUNT = makeKeyword("ESTIMATED-ASSERTION-COUNT");

    private static final SubLSymbol $kw10$SCOPE_COMPLETELY_SPECIFIED_ = makeKeyword("SCOPE-COMPLETELY-SPECIFIED?");

    private static final SubLString $str11$Unable_to_scope_partition_via__S_ = makeString("Unable to scope partition via ~S partition spec");

    private static final SubLString $str13$Non_scope_object__A_not_allowed_ = makeString("Non-scope object ~A not allowed.");





    private static final SubLSymbol SCOPE_PARTITION_ASSERTION = makeSymbol("SCOPE-PARTITION-ASSERTION");

    private static final SubLSymbol SCOPE_PARTITION_TERM = makeSymbol("SCOPE-PARTITION-TERM");

    private static final SubLString $$$marking_partition_content = makeString("marking partition content");

    private static final SubLSymbol MARK_PARTITION_OBJECT_CONS_METHOD = makeSymbol("MARK-PARTITION-OBJECT-CONS-METHOD");

    private static final SubLSymbol MARK_PARTITION_OBJECT_CONSTANT_METHOD = makeSymbol("MARK-PARTITION-OBJECT-CONSTANT-METHOD");

    private static final SubLSymbol MARK_PARTITION_OBJECT_NART_METHOD = makeSymbol("MARK-PARTITION-OBJECT-NART-METHOD");

    private static final SubLSymbol MARK_PARTITION_OBJECT_ASSERTION_METHOD = makeSymbol("MARK-PARTITION-OBJECT-ASSERTION-METHOD");

    private static final SubLSymbol MARK_PARTITION_OBJECT_DEDUCTION_METHOD = makeSymbol("MARK-PARTITION-OBJECT-DEDUCTION-METHOD");

    private static final SubLSymbol MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD = makeSymbol("MARK-PARTITION-OBJECT-KB-HL-SUPPORT-METHOD");

    private static final SubLSymbol BELIEF_P = makeSymbol("BELIEF-P");

    private static final SubLString $str31$_______S_constants = makeString("~%;;; ~S constants");

    private static final SubLString $str32$___A_S = makeString("~%~A~S");

    private static final SubLString $str33$___ = makeString("(*)");

    private static final SubLString $$$___ = makeString("   ");

    private static final SubLString $str35$______Max_NART_level____S = makeString("~%;;; Max NART level : ~S");

    private static final SubLString $str36$______level__S_NARTs = makeString("~%;;; level ~S NARTs");

    private static final SubLString $str37$______Max_term_order___S = makeString("~%;;; Max term order: ~S");

    private static final SubLString $str38$_______S_assertions = makeString("~%;;; ~S assertions");

    private static final SubLString $str39$_______S_meta_assertions = makeString("~%;;; ~S meta-assertions");

    private static final SubLString $str40$______order__S_meta_assertions = makeString("~%;;; order ~S meta-assertions");

    private static final SubLString $str41$_______S_arguments = makeString("~%;;; ~S arguments");

    private static final SubLString $str42$Deduction______S = makeString("Deduction   : ~S");

    private static final SubLString $str43$Beliefs_for____S = makeString("Beliefs for : ~S");

    private static final SubLString $str44$Unknown________S = makeString("Unknown (?) : ~S");

    private static final SubLString $str45$______Max_KB_HL_support_level____ = makeString("~%;;; Max KB HL support level : ~S");

    private static final SubLString $str46$_______S_KB_HL_supports = makeString("~%;;; ~S KB HL supports");

    private static final SubLString $str47$______level__S_KB_HL_supports = makeString("~%;;; level ~S KB HL supports");

    private static final SubLString $$$removing_partition_assertions = makeString("removing partition assertions");

    private static final SubLString $$$removing_partition_NARTs = makeString("removing partition NARTs");

    private static final SubLString $$$removing_partition_constants = makeString("removing partition constants");

    private static final SubLList $list51 = list(makeString("units"), makeString("archive"));

    private static final SubLString $$$lisp = makeString("lisp");

    private static final SubLString $str54$_____FI_ASSERT___S__S__S__S_ = makeString("~%~%(FI-ASSERT '~S ~S ~S ~S)");

    private static final SubLString $str55$_____FI_CREATE__a_ = makeString("~%~%(FI-CREATE ~a)");

    private static final SubLSymbol ARCHIVE_ASSERTION_IF_LOCAL = makeSymbol("ARCHIVE-ASSERTION-IF-LOCAL");

    private static final SubLString $str58$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str59$______Archive_saved_at__s____ = makeString("~%;;; Archive saved at ~s~%~%");

    private static final SubLSymbol CFASL_ENCODABLE_STREAM_P = makeSymbol("CFASL-ENCODABLE-STREAM-P");

    private static final SubLSymbol $sym65$_ = makeSymbol("<");

    private static final SubLSymbol CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");

    private static final SubLSymbol NART_ID = makeSymbol("NART-ID");

    private static final SubLSymbol TERM_FUNCTIONAL_COMPLEXITY = makeSymbol("TERM-FUNCTIONAL-COMPLEXITY");

    private static final SubLSymbol TERM_ORDER = makeSymbol("TERM-ORDER");

    private static final SubLSymbol DEDUCTION_ID = makeSymbol("DEDUCTION-ID");

    private static final SubLSymbol KB_HL_SUPPORT_ID = makeSymbol("KB-HL-SUPPORT-ID");

    private static final SubLString $str76$2_2 = makeString("2.2");

    private static final SubLList $list77 = list(list(makeString("2.1"), makeString("2.1.2")), list(makeString("2.1"), makeString("2.2")), list(makeString("2.1.2"), makeString("2.2")));

    private static final SubLList $list80 = list(makeSymbol("SYSTEM-NUMBER"), makeSymbol("PATCH-NUMBER"), makeSymbol("&REST"), makeSymbol("BRANCH-SPECIFICS"));

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLString $str82$_large__partition_constant_shells = makeString("(large) partition constant shells");

    private static final SubLString $$$partition_constant_shells = makeString("partition constant shells");

    private static final SubLString $$$partition_level_ = makeString("partition level ");

    private static final SubLString $$$_NART_shells = makeString(" NART shells");

    private static final SubLString $str87$_large__ = makeString("(large) ");

    private static final SubLString $str88$_large__partition_assertions = makeString("(large) partition assertions");

    private static final SubLString $$$partition_assertions = makeString("partition assertions");

    private static final SubLString $$$partition_order_ = makeString("partition order ");

    private static final SubLString $$$_meta_assertions = makeString(" meta assertions");

    private static final SubLString $$$_KB_HL_supports = makeString(" KB HL supports");

    private static final SubLString $str93$_large__partition_beliefs = makeString("(large) partition beliefs");

    private static final SubLString $str94$_large__partition_deductions = makeString("(large) partition deductions");

    private static final SubLString $str95$_large__partition_bookkeeping_inf = makeString("(large) partition bookkeeping info");

    private static final SubLString $$$partition_arguments = makeString("partition arguments");

    private static final SubLString $str97$Unknown_argument_object__S = makeString("Unknown argument object ~S");

    private static final SubLString $str98$Unable_to_dump_belief__S = makeString("Unable to dump belief ~S");

    private static final SubLList $list99 = list(makeSymbol("CNF"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"), makeSymbol("VARIABLE-MAP"));

    private static final SubLString $str100$cleaning_up_after_partition_load_ = makeString("cleaning up after partition load...~%");



    private static final SubLSymbol $sym102$LOAD_PARTITION_INVALID_MISSING_TERM_ = makeSymbol("LOAD-PARTITION-INVALID-MISSING-TERM?");

    private static final SubLString $str103$partition_load_KB_cleanup_removed = makeString("partition load KB cleanup removed:~%");

    private static final SubLString $str104$__A_constants__ = makeString(" ~A constants~%");

    private static final SubLString $str105$__A_NARTs__ = makeString(" ~A NARTs~%");

    private static final SubLString $str106$__A_assertions__ = makeString(" ~A assertions~%");

    private static final SubLSymbol PARTITION_FIND_CONSTANT_BY_ID = makeSymbol("PARTITION-FIND-CONSTANT-BY-ID");

    private static final SubLSymbol PARTITION_FIND_NART_BY_ID = makeSymbol("PARTITION-FIND-NART-BY-ID");

    private static final SubLSymbol PARTITION_FIND_ASSERTION_BY_ID = makeSymbol("PARTITION-FIND-ASSERTION-BY-ID");

    private static final SubLSymbol PARTITION_FIND_KB_HL_SUPPORT_BY_ID = makeSymbol("PARTITION-FIND-KB-HL-SUPPORT-BY-ID");

    private static final SubLString $str114$partition_format_is__A__not__A__a = makeString("partition format is ~A, not ~A, and these versions are incompatible");

    private static final SubLString $$$malformed_partition_file = makeString("malformed partition file");

    private static final SubLString $$$loading_partition_constant_shells = makeString("loading partition constant shells");

    private static final SubLString $$$loading_partition_level_ = makeString("loading partition level ");

    private static final SubLString $$$_narts = makeString(" narts");

    private static final SubLSymbol POSSIBLY_NAUT_P = makeSymbol("POSSIBLY-NAUT-P");

    private static final SubLString $$$loading_partition_assertions = makeString("loading partition assertions");

    private static final SubLString $$$loading_partition_order_ = makeString("loading partition order ");

    private static final SubLString $str124$_meta_assertions = makeString(" meta-assertions");

    private static final SubLString $str125$Skipping_assertion_with_bad_id__A = makeString("Skipping assertion with bad id=~A (scope-term?=~S cnf=~S mt=~S direction=~A vnames=~S).");

    private static final SubLString $str126$Skipping_assertion_with_bad_cnf__ = makeString("Skipping assertion with bad cnf=~S (id=~A scope-term?=~S mt=~S direction=~A vnames=~S).");

    private static final SubLString $str127$Skipping_assertion_with_bad_mt__S = makeString("Skipping assertion with bad mt=~S (id=~A scope-term?=~S cnf=~S direction=~A vnames=~S).");

    private static final SubLString $str128$Skipping_assertion_with_bad_direc = makeString("Skipping assertion with bad direction=~A (id=~A scope-term?=~S cnf=~S mt=~S vnames=~S).");

    private static final SubLString $str129$Skipping_assertion_with_bad_vname = makeString("Skipping assertion with bad vnames=~S (id=~A scope-term?=~S cnf=~S mt=~S direction=~A).");

    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list131 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLString $str134$_A = makeString("~A");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $$$loading_partition_arguments = makeString("loading partition arguments");

    private static final SubLString $str140$Skipping_asserted_argument_for_ba = makeString("Skipping asserted argument for bad assertion = ~S");

    private static final SubLString $str141$Skipping_asserted_argument_for_as = makeString("Skipping asserted argument for assertion (id=~A) with bad tv = ~S (assertion=~S).");

    private static final SubLString $str142$Skipping_asserted_argument_for_as = makeString("Skipping asserted argument for assertion (id=~A) with bad assert info = ~S (assertion=~S).");

    private static final SubLString $str143$Skipping_deduction__id__A__with_b = makeString("Skipping deduction (id=~A) with bad tv = ~S (assertion=~S supports=~S).");

    private static final SubLString $str144$Skipping_deduction__id__A__with_b = makeString("Skipping deduction (id=~A) with bad assertion = ~S (tv=~S supports=~S).");

    private static final SubLString $str145$Skipping_deduction__id__A__with_b = makeString("Skipping deduction (id=~A) with bad supports = ~S (tv=~S assertion=~S).");

    private static final SubLString $str151$Did_not_find_constant__D_ = makeString("Did not find constant ~D.");

    private static final SubLSymbol $sym153$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list154 = list(list(makeSymbol("PRE-SEEDING"), makeSymbol("&KEY"), list(makeSymbol("EXPECTED-TOTAL"), makeInteger(100)), makeSymbol("SCOPED-MAP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list155 = list(makeKeyword("EXPECTED-TOTAL"), makeKeyword("SCOPED-MAP"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLList $list160 = list(makeSymbol("*PRESEEDED-PARTITION-CONSTANTS*"), T);

    private static final SubLSymbol $load_partition_constants$ = makeSymbol("*LOAD-PARTITION-CONSTANTS*");

    private static final SubLSymbol NEW_LOAD_PARTITION_CONSTANTS_STORE = makeSymbol("NEW-LOAD-PARTITION-CONSTANTS-STORE");

    private static final SubLSymbol $load_partition_scope_constants$ = makeSymbol("*LOAD-PARTITION-SCOPE-CONSTANTS*");

    private static final SubLSymbol NEW_LOAD_PARTITION_SCOPE_CONSTANTS_STORE = makeSymbol("NEW-LOAD-PARTITION-SCOPE-CONSTANTS-STORE");

    private static final SubLSymbol PRESEED_LOAD_PARTITION_CONSTANTS_STORE = makeSymbol("PRESEED-LOAD-PARTITION-CONSTANTS-STORE");

    private static final SubLString $str168$NAME_change_for__S___new_name_is_ = makeString("NAME change for ~S ; new name is ~S");

    private static final SubLString $str169$installing_ID__S_for__S = makeString("installing ID ~S for ~S");

    private static final SubLString $str170$NAME_clash_for__S___renaming_to__ = makeString("NAME clash for ~S ; renaming to ~S");

    private static final SubLString $str171$Constant_with_NAME__S_and_ID__S_m = makeString("Constant with NAME ~S and ID ~S missing");

    private static final SubLString $str172$Non_scope_NART__S_not_found_ = makeString("Non-scope NART ~S not found.");

    private static final SubLString $str173$Did_not_find_NART__D_ = makeString("Did not find NART ~D.");

    private static final SubLString $str174$Non_scope_assertion__S___S__not_f = makeString("Non-scope assertion ~S (~S) not found.");

    private static final SubLString $str175$Did_not_find_assertion__D_ = makeString("Did not find assertion ~D.");

    private static final SubLString $str176$Non_scope_KB_HL_support__S_not_fo = makeString("Non-scope KB HL support ~S not found.");

    private static final SubLString $str177$Did_not_find_KB_HL_support__D = makeString("Did not find KB HL support ~D");

    private static final SubLList $list178 = list(makeSymbol("&OPTIONAL"), makeSymbol("WHO"), makeSymbol("WHEN"), makeSymbol("WHY"), makeSymbol("SECOND"));

    private static final SubLString $str179$Could_not_assert__a_in__a_with_st = makeString("Could not assert ~a in ~a with strength ~s and direction ~s and variable-map ~s");

    public static final SubLObject partition_scope_completely_specifiedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $partition_scope_completely_specifiedP$.getDynamicValue(thread);
        }
    }

    public static SubLObject partition_scope_completely_specifiedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $partition_scope_completely_specifiedP$.getDynamicValue(thread);
    }

    public static final SubLObject scope_partition_alt(SubLObject partition) {
        com.cyc.cycjava.cycl.partitions.clear_partition_scope();
        {
            SubLObject cdolist_list_var = partition;
            SubLObject partition_item = NIL;
            for (partition_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , partition_item = cdolist_list_var.first()) {
                {
                    SubLObject datum = partition_item;
                    SubLObject current = datum;
                    SubLObject method = NIL;
                    SubLObject term_spec = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    method = current.first();
                    current = current.rest();
                    term_spec = current;
                    SubLTrampolineFile.checkType(method, KEYWORDP);
                    {
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($ONTOLOGY)) {
                            com.cyc.cycjava.cycl.partitions.scope_partition_ontology(com.cyc.cycjava.cycl.partitions.partition_term_spec_to_term(term_spec));
                        } else {
                            if (pcase_var.eql($TERM)) {
                                com.cyc.cycjava.cycl.partitions.scope_partition_term(com.cyc.cycjava.cycl.partitions.partition_term_spec_to_term(term_spec));
                            } else {
                                if (pcase_var.eql($DEFINITION)) {
                                    com.cyc.cycjava.cycl.partitions.scope_partition_definition(com.cyc.cycjava.cycl.partitions.partition_term_spec_to_term(term_spec));
                                } else {
                                    if (pcase_var.eql($FUNCTION)) {
                                        {
                                            SubLObject datum_1 = term_spec;
                                            SubLObject current_2 = datum_1;
                                            SubLObject function = NIL;
                                            SubLObject args = NIL;
                                            destructuring_bind_must_consp(current_2, datum_1, $list_alt6);
                                            function = current_2.first();
                                            current_2 = current_2.rest();
                                            args = current_2;
                                            if (function.isFunctionSpec()) {
                                                apply(function, args);
                                            } else {
                                                Errors.warn($str_alt7$Unknown_scope_partition_function_, function);
                                            }
                                        }
                                    } else {
                                        if (pcase_var.eql($ESTIMATED_ASSERTION_COUNT)) {
                                        } else {
                                            if (pcase_var.eql($kw9$SCOPE_COMPLETELY_SPECIFIED_)) {
                                            } else {
                                                Errors.warn($str_alt10$Unable_to_scope_partition_via__S_, partition_item);
                                            }
                                        }
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

    public static SubLObject scope_partition(final SubLObject partition) {
        clear_partition_scope();
        SubLObject cdolist_list_var = partition;
        SubLObject partition_item = NIL;
        partition_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = partition_item;
            SubLObject method = NIL;
            SubLObject term_spec = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            method = current.first();
            current = term_spec = current.rest();
            assert NIL != keywordp(method) : "! keywordp(method) " + ("Types.keywordp(method) " + "CommonSymbols.NIL != Types.keywordp(method) ") + method;
            final SubLObject pcase_var = method;
            if (pcase_var.eql($ONTOLOGY)) {
                scope_partition_ontology(partition_term_spec_to_term(term_spec));
            } else
                if (pcase_var.eql($QUOTED_ONTOLOGY)) {
                    scope_partition_quoted_ontology(partition_term_spec_to_term(term_spec));
                } else
                    if (pcase_var.eql($TERM)) {
                        scope_partition_term(partition_term_spec_to_term(term_spec));
                    } else
                        if (pcase_var.eql($DEFINITION)) {
                            scope_partition_definition(partition_term_spec_to_term(term_spec));
                        } else
                            if (pcase_var.eql($FUNCTION)) {
                                SubLObject current_$2;
                                final SubLObject datum_$1 = current_$2 = term_spec;
                                SubLObject function = NIL;
                                SubLObject args = NIL;
                                destructuring_bind_must_consp(current_$2, datum_$1, $list7);
                                function = current_$2.first();
                                current_$2 = args = current_$2.rest();
                                if (function.isFunctionSpec()) {
                                    apply(function, args);
                                } else {
                                    Errors.warn($str8$Unknown_scope_partition_function_, function);
                                }
                            } else
                                if (!pcase_var.eql($ESTIMATED_ASSERTION_COUNT)) {
                                    if (!pcase_var.eql($kw10$SCOPE_COMPLETELY_SPECIFIED_)) {
                                        Errors.warn($str11$Unable_to_scope_partition_via__S_, partition_item);
                                    }
                                }





            cdolist_list_var = cdolist_list_var.rest();
            partition_item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject partition_scope_term_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean(gethash_without_values(v_object, $partition_scope_hash$.getDynamicValue(thread), UNPROVIDED));
        }
    }

    public static SubLObject partition_scope_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(gethash_without_values(v_object, $partition_scope_hash$.getDynamicValue(thread), UNPROVIDED));
    }

    public static final SubLObject clear_partition_scope_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$partition_scope_hash$.getDynamicValue(thread).isHashtable()) {
                {
                    SubLObject size = integerDivide(add(assertion_handles.assertion_count(), forts.fort_count()), $int$100);
                    $partition_scope_hash$.setDynamicValue(make_hash_table(size, UNPROVIDED, UNPROVIDED), thread);
                }
            }
            clrhash($partition_scope_hash$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject clear_partition_scope() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$partition_scope_hash$.getDynamicValue(thread).isHashtable()) {
            final SubLObject size = integerDivide(add(assertion_handles.assertion_count(), forts.fort_count()), $int$100);
            $partition_scope_hash$.setDynamicValue(make_hash_table(size, UNPROVIDED, UNPROVIDED), thread);
        }
        clrhash($partition_scope_hash$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject partition_term_spec_to_term_alt(SubLObject term_spec) {
        if (term_spec.isAtom()) {
            return com.cyc.cycjava.cycl.partitions.partition_term_spec_to_term_internal(term_spec);
        } else {
            return com.cyc.cycjava.cycl.partitions.partition_term_spec_to_term_internal(term_spec.first());
        }
    }

    public static SubLObject partition_term_spec_to_term(final SubLObject term_spec) {
        if (term_spec.isAtom()) {
            return partition_term_spec_to_term_internal(term_spec);
        }
        return partition_term_spec_to_term_internal(term_spec.first());
    }

    public static final SubLObject partition_term_spec_to_term_internal_alt(SubLObject term_spec) {
        {
            SubLObject v_term = NIL;
            if (NIL != forts.fort_p(term_spec)) {
                if (NIL != forts.valid_fortP(term_spec)) {
                    v_term = term_spec;
                }
            } else {
                if (term_spec.isString()) {
                    {
                        SubLObject constant = constants_high.find_constant(term_spec);
                        if (NIL != valid_constantP(constant, UNPROVIDED)) {
                            v_term = constant;
                        }
                    }
                } else {
                    if (NIL != constants_high.constant_external_id_p(term_spec)) {
                        {
                            SubLObject constant = constants_high.find_constant_by_external_id(term_spec);
                            if (NIL != valid_constantP(constant, UNPROVIDED)) {
                                v_term = constant;
                            }
                        }
                    } else {
                        if (term_spec.isFixnum()) {
                            {
                                SubLObject constant = constants_high.find_constant_by_internal_id(term_spec);
                                if (NIL != valid_constantP(constant, UNPROVIDED)) {
                                    v_term = constant;
                                }
                            }
                        }
                    }
                }
            }
            return v_term;
        }
    }

    public static SubLObject partition_term_spec_to_term_internal(final SubLObject term_spec) {
        SubLObject v_term = NIL;
        if (NIL != forts.fort_p(term_spec)) {
            if (NIL != forts.valid_fortP(term_spec)) {
                v_term = term_spec;
            }
        } else
            if (term_spec.isString()) {
                final SubLObject constant = constants_high.find_constant(term_spec);
                if (NIL != valid_constantP(constant, UNPROVIDED)) {
                    v_term = constant;
                }
            } else
                if (NIL != constants_high.constant_external_id_p(term_spec)) {
                    final SubLObject constant = constants_high.find_constant_by_external_id(term_spec);
                    if (NIL != valid_constantP(constant, UNPROVIDED)) {
                        v_term = constant;
                    }
                } else
                    if (term_spec.isFixnum()) {
                        final SubLObject constant = constants_high.find_constant_by_internal_id(term_spec);
                        if (NIL != valid_constantP(constant, UNPROVIDED)) {
                            v_term = constant;
                        }
                    }



        return v_term;
    }

    /**
     * Add OBJECT and only OBJECT to the partition scope.  Currently only supports forts, assertions, and deductions.
     */
    @LispMethod(comment = "Add OBJECT and only OBJECT to the partition scope.  Currently only supports forts, assertions, and deductions.")
    public static final SubLObject scope_partition_object_only_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash_without_values(v_object, $partition_scope_hash$.getDynamicValue(thread), UNPROVIDED)) {
                if ((((NIL != forts.fort_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object))) || (NIL != deduction_handles.deduction_p(v_object))) || (NIL != kb_hl_supports.kb_hl_support_p(v_object))) {
                    sethash(v_object, $partition_scope_hash$.getDynamicValue(thread), v_object);
                } else {
                    Errors.warn($str_alt12$Non_scope_object__A_not_allowed_);
                }
            }
            return NIL;
        }
    }

    /**
     * Add OBJECT and only OBJECT to the partition scope.  Currently only supports forts, assertions, and deductions.
     */
    @LispMethod(comment = "Add OBJECT and only OBJECT to the partition scope.  Currently only supports forts, assertions, and deductions.")
    public static SubLObject scope_partition_object_only(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == gethash_without_values(v_object, $partition_scope_hash$.getDynamicValue(thread), UNPROVIDED)) {
            if ((((NIL != forts.fort_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object))) || (NIL != deduction_handles.deduction_p(v_object))) || (NIL != kb_hl_support_handles.kb_hl_support_p(v_object))) {
                sethash(v_object, $partition_scope_hash$.getDynamicValue(thread), v_object);
            } else {
                Errors.warn($str13$Non_scope_object__A_not_allowed_);
            }
        }
        return NIL;
    }

    /**
     * Add ASSERTION to the scope, but don't recurse to meta-assertions.
     */
    @LispMethod(comment = "Add ASSERTION to the scope, but don\'t recurse to meta-assertions.")
    public static final SubLObject scope_partition_assertion_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_handles.assertion_p(assertion)) {
                sethash(assertion, $partition_scope_hash$.getDynamicValue(thread), assertion);
            }
            return NIL;
        }
    }

    /**
     * Add ASSERTION to the scope, but don't recurse to meta-assertions.
     */
    @LispMethod(comment = "Add ASSERTION to the scope, but don\'t recurse to meta-assertions.")
    public static SubLObject scope_partition_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(assertion)) {
            sethash(assertion, $partition_scope_hash$.getDynamicValue(thread), assertion);
        }
        return NIL;
    }

    /**
     * Add ASSERTION and all of its meta-assertions to the scope
     */
    @LispMethod(comment = "Add ASSERTION and all of its meta-assertions to the scope")
    public static final SubLObject scope_partition_assertion_and_meta_assertions_alt(SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            com.cyc.cycjava.cycl.partitions.scope_partition_assertion(assertion);
            if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                {
                    SubLObject meta_assertions = assertion_utilities.all_meta_assertions(assertion);
                    SubLObject cdolist_list_var = meta_assertions;
                    SubLObject meta_assertion = NIL;
                    for (meta_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_assertion = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.partitions.scope_partition_assertion(meta_assertion);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Add ASSERTION and all of its meta-assertions to the scope
     */
    @LispMethod(comment = "Add ASSERTION and all of its meta-assertions to the scope")
    public static SubLObject scope_partition_assertion_and_meta_assertions(final SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            scope_partition_assertion(assertion);
            if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                SubLObject cdolist_list_var;
                final SubLObject meta_assertions = cdolist_list_var = assertion_utilities.all_meta_assertions(assertion);
                SubLObject meta_assertion = NIL;
                meta_assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    scope_partition_assertion(meta_assertion);
                    cdolist_list_var = cdolist_list_var.rest();
                    meta_assertion = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    /**
     * If assertions passes *SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*, add it to the scope
     * without recursing to meta-assertions.
     */
    @LispMethod(comment = "If assertions passes *SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*, add it to the scope\r\nwithout recursing to meta-assertions.\nIf assertions passes *SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*, add it to the scope\nwithout recursing to meta-assertions.")
    public static final SubLObject scope_partition_assertion_selective_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL != apply($scope_partition_assertion_selective_test$.getDynamicValue(thread), list(assertion)))) {
                sethash(assertion, $partition_scope_hash$.getDynamicValue(thread), assertion);
            }
            return NIL;
        }
    }

    /**
     * If assertions passes *SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*, add it to the scope
     * without recursing to meta-assertions.
     */
    @LispMethod(comment = "If assertions passes *SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*, add it to the scope\r\nwithout recursing to meta-assertions.\nIf assertions passes *SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*, add it to the scope\nwithout recursing to meta-assertions.")
    public static SubLObject scope_partition_assertion_selective(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL != apply($scope_partition_assertion_selective_test$.getDynamicValue(thread), list(assertion)))) {
            sethash(assertion, $partition_scope_hash$.getDynamicValue(thread), assertion);
        }
        return NIL;
    }

    public static SubLObject scope_partition_assertion_and_constituents(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(assertion)) {
            scope_partition_assertion(assertion);
            SubLObject cdolist_list_var = assertions_high.assertion_forts(assertion, T, T, T, UNPROVIDED);
            SubLObject fort = NIL;
            fort = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == $assertion_partition_fort_filter_function$.getDynamicValue(thread)) || (NIL != funcall($assertion_partition_fort_filter_function$.getDynamicValue(thread), fort))) {
                    scope_partition_object_only(fort);
                }
                cdolist_list_var = cdolist_list_var.rest();
                fort = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Add TERM and every assertion about it to the scope
     */
    @LispMethod(comment = "Add TERM and every assertion about it to the scope")
    public static final SubLObject scope_partition_term_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != indexed_term_p(v_term)) {
                if (NIL == gethash_without_values(v_term, $partition_scope_hash$.getDynamicValue(thread), UNPROVIDED)) {
                    sethash(v_term, $partition_scope_hash$.getDynamicValue(thread), v_term);
                    if (NIL != forts.fort_p(v_term)) {
                        com.cyc.cycjava.cycl.partitions.scope_partition_term_internal(v_term);
                    } else {
                        com.cyc.cycjava.cycl.partitions.scope_partition_term_internal(v_term);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Add TERM and every assertion about it to the scope
     */
    @LispMethod(comment = "Add TERM and every assertion about it to the scope")
    public static SubLObject scope_partition_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != indexed_term_p(v_term)) && (NIL == gethash_without_values(v_term, $partition_scope_hash$.getDynamicValue(thread), UNPROVIDED))) {
            sethash(v_term, $partition_scope_hash$.getDynamicValue(thread), v_term);
            if (NIL != forts.fort_p(v_term)) {
                scope_partition_term_internal(v_term);
            } else {
                scope_partition_term_internal(v_term);
            }
        }
        return NIL;
    }

    /**
     * Add the definitional assertions about TERM to the scope.
     */
    @LispMethod(comment = "Add the definitional assertions about TERM to the scope.")
    public static final SubLObject scope_partition_definition_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != indexed_term_p(v_term)) {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_3 = NIL;
                                                            SubLObject token_var_4 = NIL;
                                                            while (NIL == done_var_3) {
                                                                {
                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                                    SubLObject valid_5 = makeBoolean(token_var_4 != gaf);
                                                                    if (NIL != valid_5) {
                                                                        {
                                                                            SubLObject predicate = gaf_predicate(gaf);
                                                                            if (NIL != isa.quoted_isa_in_any_mtP(predicate, $$ResearchCycDefinitionalPredicate)) {
                                                                                com.cyc.cycjava.cycl.partitions.scope_partition_term(gaf);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_3 = makeBoolean(NIL == valid_5);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Add the definitional assertions about TERM to the scope.
     */
    @LispMethod(comment = "Add the definitional assertions about TERM to the scope.")
    public static SubLObject scope_partition_definition(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != indexed_term_p(v_term)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$3 = NIL;
                                final SubLObject token_var_$4 = NIL;
                                while (NIL == done_var_$3) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(gaf));
                                    if (NIL != valid_$5) {
                                        final SubLObject predicate = assertions_high.gaf_predicate(gaf);
                                        if (NIL != isa.quoted_isa_in_any_mtP(predicate, $$ResearchCycDefinitionalPredicate)) {
                                            scope_partition_term(gaf);
                                        }
                                    }
                                    done_var_$3 = makeBoolean(NIL == valid_$5);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Add TERM and all of its dependent NARTs to the scope
     */
    @LispMethod(comment = "Add TERM and all of its dependent NARTs to the scope")
    public static final SubLObject scope_partition_term_and_narts_alt(SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            com.cyc.cycjava.cycl.partitions.scope_partition_term(v_term);
            {
                SubLObject cdolist_list_var = kb_indexing.dependent_narts(v_term);
                SubLObject dependent_nart = NIL;
                for (dependent_nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent_nart = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.partitions.scope_partition_term(dependent_nart);
                }
            }
        }
        return NIL;
    }

    /**
     * Add TERM and all of its dependent NARTs to the scope
     */
    @LispMethod(comment = "Add TERM and all of its dependent NARTs to the scope")
    public static SubLObject scope_partition_term_and_narts(final SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            scope_partition_term(v_term);
            SubLObject cdolist_list_var = indexing_utilities.dependent_narts(v_term);
            SubLObject dependent_nart = NIL;
            dependent_nart = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                scope_partition_term(dependent_nart);
                cdolist_list_var = cdolist_list_var.rest();
                dependent_nart = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Add all assertions about TERM from MT to the scope
     */
    @LispMethod(comment = "Add all assertions about TERM from MT to the scope")
    public static final SubLObject scope_partition_term_in_mt_alt(SubLObject v_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != indexed_term_p(v_term)) && (NIL != fort_types_interface.mtP(mt))) {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kb_mapping.map_term(symbol_function(SCOPE_PARTITION_ASSERTION), v_term);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Add all assertions about TERM from MT to the scope
     */
    @LispMethod(comment = "Add all assertions about TERM from MT to the scope")
    public static SubLObject scope_partition_term_in_mt(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != indexed_term_p(v_term)) && (NIL != fort_types_interface.mtP(mt))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                kb_mapping.map_term(symbol_function(SCOPE_PARTITION_ASSERTION), v_term);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject scope_partition_rf(final SubLObject rf) {
        if (NIL != assertion_handles.assertion_p(rf)) {
            return scope_partition_assertion(rf);
        }
        return scope_partition_term(rf);
    }

    public static SubLObject scope_partition_rf_and_super_rfs(final SubLObject rf) {
        if (NIL != assertion_handles.assertion_p(rf)) {
            return scope_partition_assertion_and_meta_assertions(rf);
        }
        return scope_partition_term_and_narts(rf);
    }

    /**
     * Add TERM and every assertion about it to the scope.
     */
    @LispMethod(comment = "Add TERM and every assertion about it to the scope.")
    public static final SubLObject selected_scope_partition_term_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != indexed_term_p(v_term)) {
                if (NIL == gethash_without_values(v_term, $partition_scope_hash$.getDynamicValue(thread), UNPROVIDED)) {
                    sethash(v_term, $partition_scope_hash$.getDynamicValue(thread), v_term);
                    if (NIL != forts.fort_p(v_term)) {
                        com.cyc.cycjava.cycl.partitions.selected_scope_partition_term_internal(v_term);
                    } else {
                        com.cyc.cycjava.cycl.partitions.selected_scope_partition_term_internal(v_term);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Add TERM and every assertion about it to the scope.
     */
    @LispMethod(comment = "Add TERM and every assertion about it to the scope.")
    public static SubLObject selected_scope_partition_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != indexed_term_p(v_term)) && (NIL == gethash_without_values(v_term, $partition_scope_hash$.getDynamicValue(thread), UNPROVIDED))) {
            sethash(v_term, $partition_scope_hash$.getDynamicValue(thread), v_term);
            if (NIL != forts.fort_p(v_term)) {
                selected_scope_partition_term_internal(v_term);
            } else {
                selected_scope_partition_term_internal(v_term);
            }
        }
        return NIL;
    }

    /**
     * mark all the assertions of ONTOLOGY-START and all its instances and specs
     */
    @LispMethod(comment = "mark all the assertions of ONTOLOGY-START and all its instances and specs")
    public static final SubLObject scope_partition_ontology_alt(SubLObject ontology_start) {
        if (NIL != forts.fort_p(ontology_start)) {
            com.cyc.cycjava.cycl.partitions.scope_partition_term(ontology_start);
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.partitions.every_possible_instance(ontology_start);
                SubLObject instance = NIL;
                for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.partitions.scope_partition_term(instance);
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.partitions.every_possible_spec(ontology_start);
                SubLObject spec = NIL;
                for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.partitions.scope_partition_term(spec);
                }
            }
        }
        return NIL;
    }

    /**
     * mark all the assertions of ONTOLOGY-START and all its instances and specs
     */
    @LispMethod(comment = "mark all the assertions of ONTOLOGY-START and all its instances and specs")
    public static SubLObject scope_partition_ontology(final SubLObject ontology_start) {
        if (NIL != forts.fort_p(ontology_start)) {
            scope_partition_term(ontology_start);
            SubLObject cdolist_list_var = isa.all_instances_in_all_mts(ontology_start);
            SubLObject instance = NIL;
            instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                scope_partition_term(instance);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            } 
            cdolist_list_var = genls.all_specs_in_all_mts(ontology_start, UNPROVIDED, UNPROVIDED);
            SubLObject spec = NIL;
            spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                scope_partition_term(spec);
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject scope_partition_quoted_ontology(final SubLObject quoted_ontology_start) {
        if (NIL != forts.fort_p(quoted_ontology_start)) {
            scope_partition_term(quoted_ontology_start);
            SubLObject cdolist_list_var = isa.all_quoted_instances_in_all_mts(quoted_ontology_start);
            SubLObject quoted_instance = NIL;
            quoted_instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                scope_partition_term(quoted_instance);
                cdolist_list_var = cdolist_list_var.rest();
                quoted_instance = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * mark all the assertions of ONTOLOGY-START and all its instances and specs.
     */
    @LispMethod(comment = "mark all the assertions of ONTOLOGY-START and all its instances and specs.")
    public static final SubLObject selected_scope_partition_ontology_alt(SubLObject ontology_start) {
        if (NIL != forts.fort_p(ontology_start)) {
            com.cyc.cycjava.cycl.partitions.selected_scope_partition_term(ontology_start);
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.partitions.every_possible_instance(ontology_start);
                SubLObject instance = NIL;
                for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.partitions.selected_scope_partition_term(instance);
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.partitions.every_possible_spec(ontology_start);
                SubLObject spec = NIL;
                for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.partitions.selected_scope_partition_term(spec);
                }
            }
        }
        return NIL;
    }

    /**
     * mark all the assertions of ONTOLOGY-START and all its instances and specs.
     */
    @LispMethod(comment = "mark all the assertions of ONTOLOGY-START and all its instances and specs.")
    public static SubLObject selected_scope_partition_ontology(final SubLObject ontology_start) {
        if (NIL != forts.fort_p(ontology_start)) {
            selected_scope_partition_term(ontology_start);
            SubLObject cdolist_list_var = isa.all_instances_in_all_mts(ontology_start);
            SubLObject instance = NIL;
            instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                selected_scope_partition_term(instance);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            } 
            cdolist_list_var = genls.all_specs_in_all_mts(ontology_start, UNPROVIDED, UNPROVIDED);
            SubLObject spec = NIL;
            spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                selected_scope_partition_term(spec);
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject scope_partition_arg_index_alt(SubLObject v_term, SubLObject arg, SubLObject pred, SubLObject mt, SubLObject truth) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    kb_mapping.map_gaf_arg_index(symbol_function(SCOPE_PARTITION_TERM), v_term, arg, pred, truth, mt);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject scope_partition_arg_index(final SubLObject v_term, final SubLObject arg, SubLObject pred, SubLObject mt, SubLObject truth) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            kb_mapping.map_gaf_arg_index(symbol_function(SCOPE_PARTITION_TERM), v_term, arg, pred, truth, mt);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject scope_partition_predicate_rule_index_alt(SubLObject v_term, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    kb_mapping.map_predicate_rule_index(symbol_function(SCOPE_PARTITION_TERM), v_term, sense, direction, mt);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject scope_partition_predicate_rule_index(final SubLObject v_term, final SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            kb_mapping.map_predicate_rule_index(symbol_function(SCOPE_PARTITION_TERM), v_term, sense, direction, mt);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject scope_partition_mt_index_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    kb_mapping.map_mt_index(symbol_function(SCOPE_PARTITION_TERM), v_term, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject scope_partition_mt_index(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            kb_mapping.map_mt_index(symbol_function(SCOPE_PARTITION_TERM), v_term, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject scope_partition_other_index_alt(SubLObject v_term) {
        kb_mapping.map_other_index(symbol_function(SCOPE_PARTITION_TERM), v_term, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject scope_partition_other_index(final SubLObject v_term) {
        kb_mapping.map_other_index(symbol_function(SCOPE_PARTITION_TERM), v_term, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject scope_partition_deduction_alt(SubLObject deduction) {
        if (NIL != deduction_handles.deduction_p(deduction)) {
            {
                SubLObject assertion = deductions_high.deduction_assertion(deduction);
                com.cyc.cycjava.cycl.partitions.scope_partition_assertion(assertion);
            }
        }
        return NIL;
    }

    public static SubLObject scope_partition_deduction(final SubLObject deduction) {
        if (NIL != deduction_handles.deduction_p(deduction)) {
            final SubLObject assertion = deductions_high.deduction_assertion(deduction);
            scope_partition_assertion(assertion);
        }
        return NIL;
    }

    public static SubLObject partition_scope() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.hash_table_values($partition_scope_hash$.getDynamicValue(thread));
    }

    public static SubLObject partition_forts() {
        return list_utilities.remove_if_not(FORT_P, partition_scope(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject scope_partition_term_internal_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    kb_mapping.map_term(SCOPE_PARTITION_TERM, v_term);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject scope_partition_term_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            kb_mapping.map_term(SCOPE_PARTITION_TERM, v_term);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject selected_scope_partition_term_internal_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    kb_mapping.selected_map_term(SCOPE_PARTITION_TERM, v_term, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject selected_scope_partition_term_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            kb_mapping.selected_map_term(SCOPE_PARTITION_TERM, v_term, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     *
     *
     * @param ESTIMATED-ASSERTION-COUNT;
     * 		if provided, the estimated number of assertions in
     * 		the forthcoming partition.  It will make the hashtable initial sizes
     * 		based on this number and on the estimated proportions of constants and narts to assertions.
     * 		If NIL, it will use the value of 1/10 of (assertion-count).
     */
    @LispMethod(comment = "@param ESTIMATED-ASSERTION-COUNT;\r\n\t\tif provided, the estimated number of assertions in\r\n\t\tthe forthcoming partition.  It will make the hashtable initial sizes\r\n\t\tbased on this number and on the estimated proportions of constants and narts to assertions.\r\n\t\tIf NIL, it will use the value of 1/10 of (assertion-count).")
    public static final SubLObject clear_partition_content_alt(SubLObject estimated_assertion_count) {
        if (estimated_assertion_count == UNPROVIDED) {
            estimated_assertion_count = NIL;
        }
        if (NIL == estimated_assertion_count) {
            estimated_assertion_count = integerDivide(assertion_handles.assertion_count(), TEN_INTEGER);
        }
        {
            SubLObject constant_table_size = round(divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_constant()), UNPROVIDED);
            $partition_constant_hash$.setDynamicValue(make_hash_table(constant_table_size, UNPROVIDED, UNPROVIDED));
            {
                SubLObject nart_table_size = round(divide(divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_constant()), kb_utilities.estimated_constants_per_nart()), UNPROVIDED);
                $partition_nart_hash$.setDynamicValue(make_hash_table(nart_table_size, UNPROVIDED, UNPROVIDED));
            }
        }
        {
            SubLObject assertion_table_size = estimated_assertion_count;
            $partition_assertion_hash$.setDynamicValue(make_hash_table(assertion_table_size, UNPROVIDED, UNPROVIDED));
        }
        {
            SubLObject meta_assertion_table_size = round(divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_meta_assertion()), UNPROVIDED);
            $partition_meta_assertion_hash$.setDynamicValue(make_hash_table(meta_assertion_table_size, UNPROVIDED, UNPROVIDED));
        }
        {
            SubLObject kb_hl_support_table_size = round(divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_hl_support()), UNPROVIDED);
            $partition_kb_hl_support_hash$.setDynamicValue(make_hash_table(kb_hl_support_table_size, UNPROVIDED, UNPROVIDED));
        }
        {
            SubLObject argument_table_size = round(multiply(estimated_assertion_count, kb_utilities.estimated_arguments_per_assertion()), UNPROVIDED);
            $partition_argument_hash$.setDynamicValue(make_hash_table(argument_table_size, UNPROVIDED, UNPROVIDED));
        }
        $partition_max_nart_complexity$.setDynamicValue(ZERO_INTEGER);
        $partition_max_term_order$.setDynamicValue(ZERO_INTEGER);
        $partition_kb_hl_support_orders$.setDynamicValue(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        $partition_max_kb_hl_support_order$.setDynamicValue(ZERO_INTEGER);
        return NIL;
    }

    /**
     *
     *
     * @param ESTIMATED-ASSERTION-COUNT;
     * 		if provided, the estimated number of assertions in
     * 		the forthcoming partition.  It will make the hashtable initial sizes
     * 		based on this number and on the estimated proportions of constants and narts to assertions.
     * 		If NIL, it will use the value of 1/10 of (assertion-count).
     */
    @LispMethod(comment = "@param ESTIMATED-ASSERTION-COUNT;\r\n\t\tif provided, the estimated number of assertions in\r\n\t\tthe forthcoming partition.  It will make the hashtable initial sizes\r\n\t\tbased on this number and on the estimated proportions of constants and narts to assertions.\r\n\t\tIf NIL, it will use the value of 1/10 of (assertion-count).")
    public static SubLObject clear_partition_content(SubLObject estimated_assertion_count) {
        if (estimated_assertion_count == UNPROVIDED) {
            estimated_assertion_count = NIL;
        }
        if (NIL == estimated_assertion_count) {
            estimated_assertion_count = integerDivide(assertion_handles.assertion_count(), TEN_INTEGER);
        }
        final SubLObject constant_table_size = round(divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_constant()), UNPROVIDED);
        $partition_constant_hash$.setDynamicValue(make_hash_table(constant_table_size, UNPROVIDED, UNPROVIDED));
        final SubLObject nart_table_size = round(divide(divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_constant()), kb_utilities.estimated_constants_per_nart()), UNPROVIDED);
        $partition_nart_hash$.setDynamicValue(make_hash_table(nart_table_size, UNPROVIDED, UNPROVIDED));
        final SubLObject assertion_table_size = estimated_assertion_count;
        $partition_assertion_hash$.setDynamicValue(make_hash_table(assertion_table_size, UNPROVIDED, UNPROVIDED));
        final SubLObject meta_assertion_table_size = round(divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_meta_assertion()), UNPROVIDED);
        $partition_meta_assertion_hash$.setDynamicValue(make_hash_table(meta_assertion_table_size, UNPROVIDED, UNPROVIDED));
        final SubLObject kb_hl_support_table_size = round(divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_hl_support()), UNPROVIDED);
        $partition_kb_hl_support_hash$.setDynamicValue(make_hash_table(kb_hl_support_table_size, UNPROVIDED, UNPROVIDED));
        final SubLObject argument_table_size = round(multiply(estimated_assertion_count, kb_utilities.estimated_arguments_per_assertion()), UNPROVIDED);
        $partition_argument_hash$.setDynamicValue(make_hash_table(argument_table_size, UNPROVIDED, UNPROVIDED));
        $partition_max_nart_complexity$.setDynamicValue(ZERO_INTEGER);
        $partition_max_term_order$.setDynamicValue(ZERO_INTEGER);
        $partition_kb_hl_support_orders$.setDynamicValue(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        $partition_max_kb_hl_support_order$.setDynamicValue(ZERO_INTEGER);
        return NIL;
    }

    /**
     * defaults to nil
     */
    @LispMethod(comment = "defaults to nil")
    public static final SubLObject partition_estimated_assertion_count_alt(SubLObject partition) {
        {
            SubLObject cons = list_utilities.alist_lookup_without_values(partition, $ESTIMATED_ASSERTION_COUNT, symbol_function(EQ), NIL);
            if (cons.isCons()) {
                return cons.first();
            }
        }
        return NIL;
    }

    /**
     * defaults to nil
     */
    @LispMethod(comment = "defaults to nil")
    public static SubLObject partition_estimated_assertion_count(final SubLObject partition) {
        final SubLObject cons = list_utilities.alist_lookup_without_values(partition, $ESTIMATED_ASSERTION_COUNT, symbol_function(EQL), NIL);
        if (cons.isCons()) {
            return cons.first();
        }
        return NIL;
    }

    /**
     * The partition pragma stating whether the scope specified completely specified, i.e. we require no additional marking.  note that complete specification should include constants, NARTs, assertions, and deductions.
     * defaults to nil
     */
    @LispMethod(comment = "The partition pragma stating whether the scope specified completely specified, i.e. we require no additional marking.  note that complete specification should include constants, NARTs, assertions, and deductions.\r\ndefaults to nil\nThe partition pragma stating whether the scope specified completely specified, i.e. we require no additional marking.  note that complete specification should include constants, NARTs, assertions, and deductions.\ndefaults to nil")
    public static final SubLObject partition_scope_completely_specified_by_partitionP_alt(SubLObject partition) {
        {
            SubLObject cons = list_utilities.alist_lookup_without_values(partition, $kw9$SCOPE_COMPLETELY_SPECIFIED_, symbol_function(EQ), NIL);
            if (cons.isCons()) {
                return cons.first();
            }
        }
        return NIL;
    }

    /**
     * The partition pragma stating whether the scope specified completely specified, i.e. we require no additional marking.  note that complete specification should include constants, NARTs, assertions, and deductions.
     * defaults to nil
     */
    @LispMethod(comment = "The partition pragma stating whether the scope specified completely specified, i.e. we require no additional marking.  note that complete specification should include constants, NARTs, assertions, and deductions.\r\ndefaults to nil\nThe partition pragma stating whether the scope specified completely specified, i.e. we require no additional marking.  note that complete specification should include constants, NARTs, assertions, and deductions.\ndefaults to nil")
    public static SubLObject partition_scope_completely_specified_by_partitionP(final SubLObject partition) {
        final SubLObject cons = list_utilities.alist_lookup_without_values(partition, $kw10$SCOPE_COMPLETELY_SPECIFIED_, symbol_function(EQL), NIL);
        if (cons.isCons()) {
            return cons.first();
        }
        return NIL;
    }

    public static final SubLObject mark_partition_content_alt(SubLObject partition) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.scope_partition(partition);
            {
                SubLObject estimated_assertion_count = com.cyc.cycjava.cycl.partitions.partition_estimated_assertion_count(partition);
                com.cyc.cycjava.cycl.partitions.clear_partition_content(estimated_assertion_count);
            }
            {
                SubLObject _prev_bind_0 = $partition_scope_completely_specifiedP$.currentBinding(thread);
                try {
                    $partition_scope_completely_specifiedP$.bind(com.cyc.cycjava.cycl.partitions.partition_scope_completely_specified_by_partitionP(partition), thread);
                    {
                        SubLObject table_var = $partition_scope_hash$.getDynamicValue(thread);
                        $progress_note$.setDynamicValue($$$marking_partition_content, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0_7 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject v_term = NIL;
                                    SubLObject value = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                v_term = getEntryKey(cdohash_entry);
                                                value = getEntryValue(cdohash_entry);
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                com.cyc.cycjava.cycl.partitions.mark_partition_object(v_term);
                                                if (NIL != constant_p(v_term)) {
                                                    com.cyc.cycjava.cycl.partitions.mark_partition_bookkeeping_terms(v_term);
                                                }
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
                                        }
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_7, thread);
                            }
                        }
                    }
                } finally {
                    $partition_scope_completely_specifiedP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_partition_content(final SubLObject partition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        scope_partition(partition);
        final SubLObject estimated_assertion_count = partition_estimated_assertion_count(partition);
        clear_partition_content(estimated_assertion_count);
        final SubLObject _prev_bind_0 = $partition_scope_completely_specifiedP$.currentBinding(thread);
        try {
            $partition_scope_completely_specifiedP$.bind(partition_scope_completely_specified_by_partitionP(partition), thread);
            final SubLObject table_var = $partition_scope_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$7 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$marking_partition_content, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject v_term = NIL;
                    SubLObject value = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            v_term = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            mark_partition_object(v_term);
                            if (NIL != constant_p(v_term)) {
                                mark_partition_bookkeeping_terms(v_term);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
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
                $progress_note$.rebind(_prev_bind_0_$7, thread);
            }
        } finally {
            $partition_scope_completely_specifiedP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject mark_partition_bookkeeping_terms_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(constant, $partition_argument_hash$.getDynamicValue(thread), constant);
            com.cyc.cycjava.cycl.partitions.mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant(constant);
            return NIL;
        }
    }

    public static SubLObject mark_partition_bookkeeping_terms(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(constant, $partition_argument_hash$.getDynamicValue(thread), constant);
        mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant(constant);
        return NIL;
    }

    public static final SubLObject mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant_alt(SubLObject constant) {
        {
            SubLObject terms_to_mark = bookkeeping_store.indexed_terms_mentioned_in_bookkeeping_assertions_of_term(constant);
            SubLObject cdolist_list_var = terms_to_mark;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.partitions.mark_partition_object(v_term);
            }
        }
        return NIL;
    }

    public static SubLObject mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant(final SubLObject constant) {
        SubLObject cdolist_list_var;
        final SubLObject terms_to_mark = cdolist_list_var = bookkeeping_store.indexed_terms_mentioned_in_bookkeeping_assertions_of_term(constant);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mark_partition_object(v_term);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject mark_partition_object_alt(SubLObject v_object) {
        {
            SubLObject method_function = method_func(v_object, $mark_partition_object_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, v_object);
            }
            return NIL;
        }
    }

    public static SubLObject mark_partition_object(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $mark_partition_object_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return NIL;
    }

    public static final SubLObject mark_partition_object_cons_method_alt(SubLObject v_object) {
        com.cyc.cycjava.cycl.partitions.mark_partition_object(v_object.first());
        com.cyc.cycjava.cycl.partitions.mark_partition_object(v_object.rest());
        return NIL;
    }

    public static SubLObject mark_partition_object_cons_method(final SubLObject v_object) {
        mark_partition_object(v_object.first());
        mark_partition_object(v_object.rest());
        return NIL;
    }

    public static final SubLObject mark_partition_object_constant_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.partitions.mark_partition_object_constant(v_object);
    }

    public static SubLObject mark_partition_object_constant_method(final SubLObject v_object) {
        return mark_partition_object_constant(v_object);
    }

    public static final SubLObject mark_partition_object_constant_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != valid_constantP(constant, UNPROVIDED)) {
                if (NIL == gethash_without_values(constant, $partition_constant_hash$.getDynamicValue(thread), UNPROVIDED)) {
                    sethash(constant, $partition_constant_hash$.getDynamicValue(thread), constant);
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_partition_object_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != valid_constantP(constant, UNPROVIDED)) && (NIL == gethash_without_values(constant, $partition_constant_hash$.getDynamicValue(thread), UNPROVIDED))) {
            sethash(constant, $partition_constant_hash$.getDynamicValue(thread), constant);
        }
        return NIL;
    }

    public static final SubLObject mark_partition_object_nart_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.partitions.mark_partition_object_nart(v_object);
    }

    public static SubLObject mark_partition_object_nart_method(final SubLObject v_object) {
        return mark_partition_object_nart(v_object);
    }

    public static final SubLObject mark_partition_object_nart_alt(SubLObject nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != nart_handles.valid_nartP(nart, UNPROVIDED)) {
                if (NIL == gethash_without_values(nart, $partition_nart_hash$.getDynamicValue(thread), UNPROVIDED)) {
                    sethash(nart, $partition_nart_hash$.getDynamicValue(thread), nart);
                    {
                        SubLObject level = function_terms.term_functional_complexity(nart);
                        if (level.numG($partition_max_nart_complexity$.getDynamicValue(thread))) {
                            $partition_max_nart_complexity$.setDynamicValue(level, thread);
                        }
                    }
                    {
                        SubLObject assertion = function_terms.term_of_unit_assertion(nart);
                        if (NIL != assertion_handles.assertion_p(assertion)) {
                            com.cyc.cycjava.cycl.partitions.mark_partition_object(assertion);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_partition_object_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != nart_handles.valid_nartP(nart, UNPROVIDED)) && (NIL == gethash_without_values(nart, $partition_nart_hash$.getDynamicValue(thread), UNPROVIDED))) {
            sethash(nart, $partition_nart_hash$.getDynamicValue(thread), nart);
            final SubLObject level = function_terms.term_functional_complexity(nart);
            if (level.numG($partition_max_nart_complexity$.getDynamicValue(thread))) {
                $partition_max_nart_complexity$.setDynamicValue(level, thread);
            }
            final SubLObject assertion = function_terms.term_of_unit_assertion(nart);
            if (NIL != assertion_handles.assertion_p(assertion)) {
                mark_partition_object(assertion);
            }
        }
        return NIL;
    }

    public static final SubLObject mark_partition_object_assertion_method_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_handles.valid_assertionP(v_object, UNPROVIDED)) {
                if (!((NIL != gethash_without_values(v_object, $partition_assertion_hash$.getDynamicValue(thread), UNPROVIDED)) || (NIL != gethash_without_values(v_object, $partition_meta_assertion_hash$.getDynamicValue(thread), UNPROVIDED)))) {
                    {
                        SubLObject order = kb_utilities.term_order(v_object);
                        if (order.numG($partition_max_term_order$.getDynamicValue(thread))) {
                            $partition_max_term_order$.setDynamicValue(order, thread);
                        }
                        if (order.numE(ONE_INTEGER)) {
                            sethash(v_object, $partition_assertion_hash$.getDynamicValue(thread), v_object);
                        } else {
                            sethash(v_object, $partition_meta_assertion_hash$.getDynamicValue(thread), v_object);
                        }
                    }
                    if (NIL == com.cyc.cycjava.cycl.partitions.partition_scope_completely_specifiedP()) {
                        com.cyc.cycjava.cycl.partitions.mark_partition_object(assertion_cnf(v_object));
                        com.cyc.cycjava.cycl.partitions.mark_partition_object(assertion_mt(v_object));
                    }
                    com.cyc.cycjava.cycl.partitions.mark_partition_assertion_beliefs(v_object);
                    if (NIL == com.cyc.cycjava.cycl.partitions.partition_scope_completely_specifiedP()) {
                        {
                            SubLObject cdolist_list_var = assertion_arguments(v_object);
                            SubLObject argument = NIL;
                            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                if (NIL != deduction_handles.deduction_p(argument)) {
                                    com.cyc.cycjava.cycl.partitions.mark_partition_assertion_deduction(argument);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_partition_object_assertion_method(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != assertion_handles.valid_assertionP(v_object, UNPROVIDED)) && (NIL == gethash_without_values(v_object, $partition_assertion_hash$.getDynamicValue(thread), UNPROVIDED))) && (NIL == gethash_without_values(v_object, $partition_meta_assertion_hash$.getDynamicValue(thread), UNPROVIDED))) {
            final SubLObject order = kb_utilities.term_order(v_object);
            if (order.numG($partition_max_term_order$.getDynamicValue(thread))) {
                $partition_max_term_order$.setDynamicValue(order, thread);
            }
            if (order.numE(ONE_INTEGER)) {
                sethash(v_object, $partition_assertion_hash$.getDynamicValue(thread), v_object);
            } else {
                sethash(v_object, $partition_meta_assertion_hash$.getDynamicValue(thread), v_object);
            }
            if (NIL == partition_scope_completely_specifiedP()) {
                mark_partition_object(assertions_high.assertion_cnf(v_object));
                mark_partition_object(assertions_high.assertion_mt(v_object));
            }
            mark_partition_assertion_beliefs(v_object);
            if (NIL == partition_scope_completely_specifiedP()) {
                SubLObject cdolist_list_var = assertions_high.assertion_arguments(v_object);
                SubLObject argument = NIL;
                argument = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != deduction_handles.deduction_p(argument)) {
                        mark_partition_assertion_deduction(argument);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    argument = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject mark_partition_object_deduction_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.partitions.mark_partition_object_deduction(v_object);
    }

    public static SubLObject mark_partition_object_deduction_method(final SubLObject v_object) {
        return mark_partition_object_deduction(v_object);
    }

    public static final SubLObject mark_partition_object_deduction_alt(SubLObject deduction) {
        return com.cyc.cycjava.cycl.partitions.mark_partition_assertion_deduction(deduction);
    }

    public static SubLObject mark_partition_object_deduction(final SubLObject deduction) {
        return mark_partition_assertion_deduction(deduction);
    }

    public static final SubLObject mark_partition_object_kb_hl_support_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.partitions.mark_partition_object_kb_hl_support(v_object);
    }

    public static SubLObject mark_partition_object_kb_hl_support_method(final SubLObject v_object) {
        return mark_partition_object_kb_hl_support(v_object);
    }

    public static final SubLObject mark_partition_object_kb_hl_support_alt(SubLObject kb_hl_support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kb_hl_supports.valid_kb_hl_supportP(kb_hl_support, UNPROVIDED)) {
                if (NIL == gethash_without_values(kb_hl_support, $partition_kb_hl_support_hash$.getDynamicValue(thread), UNPROVIDED)) {
                    sethash(kb_hl_support, $partition_kb_hl_support_hash$.getDynamicValue(thread), kb_hl_support);
                    com.cyc.cycjava.cycl.partitions.note_partition_kb_hl_support_order(kb_hl_support);
                    if (NIL == com.cyc.cycjava.cycl.partitions.partition_scope_completely_specifiedP()) {
                        com.cyc.cycjava.cycl.partitions.mark_partition_object(kb_hl_supports.kb_hl_support_sentence(kb_hl_support));
                        com.cyc.cycjava.cycl.partitions.mark_partition_object(kb_hl_supports.kb_hl_support_mt(kb_hl_support));
                        {
                            SubLObject cdolist_list_var = kb_hl_supports.kb_hl_support_justification(kb_hl_support);
                            SubLObject support = NIL;
                            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.partitions.mark_partition_object(support);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_partition_object_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != kb_hl_support_handles.valid_kb_hl_supportP(kb_hl_support, UNPROVIDED)) && (NIL == gethash_without_values(kb_hl_support, $partition_kb_hl_support_hash$.getDynamicValue(thread), UNPROVIDED))) {
            sethash(kb_hl_support, $partition_kb_hl_support_hash$.getDynamicValue(thread), kb_hl_support);
            note_partition_kb_hl_support_order(kb_hl_support);
            if (NIL == partition_scope_completely_specifiedP()) {
                mark_partition_object(kb_hl_supports_high.kb_hl_support_sentence(kb_hl_support));
                mark_partition_object(kb_hl_supports_high.kb_hl_support_mt(kb_hl_support));
                SubLObject cdolist_list_var = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    mark_partition_object(support);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject mark_partition_assertion_beliefs_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash_without_values(assertion, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                if (NIL != find_if(symbol_function(BELIEF_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    sethash(assertion, $partition_argument_hash$.getDynamicValue(thread), assertion);
                    if (NIL == com.cyc.cycjava.cycl.partitions.partition_scope_completely_specifiedP()) {
                        com.cyc.cycjava.cycl.partitions.mark_partition_object(asserted_by(assertion));
                        com.cyc.cycjava.cycl.partitions.mark_partition_object(asserted_why(assertion));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_partition_assertion_beliefs(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == gethash_without_values(assertion, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) && (NIL != find_if(symbol_function(BELIEF_P), assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            sethash(assertion, $partition_argument_hash$.getDynamicValue(thread), assertion);
            if (NIL == partition_scope_completely_specifiedP()) {
                mark_partition_object(assertions_high.asserted_by(assertion));
                mark_partition_object(assertions_high.asserted_why(assertion));
            }
        }
        return NIL;
    }

    public static final SubLObject mark_partition_assertion_deduction_alt(SubLObject deduction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != deduction_handles.valid_deduction(deduction, UNPROVIDED)) {
                if (NIL == gethash_without_values(deduction, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                    sethash(deduction, $partition_argument_hash$.getDynamicValue(thread), deduction);
                    if (NIL == com.cyc.cycjava.cycl.partitions.partition_scope_completely_specifiedP()) {
                        com.cyc.cycjava.cycl.partitions.mark_partition_object(deductions_high.deduction_assertion(deduction));
                        {
                            SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
                            SubLObject support = NIL;
                            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.partitions.mark_partition_object(support);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_partition_assertion_deduction(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != deduction_handles.valid_deduction(deduction, UNPROVIDED)) && (NIL == gethash_without_values(deduction, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED))) {
            sethash(deduction, $partition_argument_hash$.getDynamicValue(thread), deduction);
            if (NIL == partition_scope_completely_specifiedP()) {
                mark_partition_object(deductions_high.deduction_supported_object(deduction));
                SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    mark_partition_object(support);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject note_partition_kb_hl_support_order_alt(SubLObject kb_hl_support) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.partitions.partition_kb_hl_support_order(kb_hl_support));
    }

    public static SubLObject note_partition_kb_hl_support_order(final SubLObject kb_hl_support) {
        return list_utilities.sublisp_boolean(partition_kb_hl_support_order(kb_hl_support));
    }

    public static final SubLObject partition_kb_hl_support_order_alt(SubLObject kb_hl_support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject order = dictionary.dictionary_lookup($partition_kb_hl_support_orders$.getDynamicValue(thread), kb_hl_support, UNPROVIDED);
                if (NIL == order) {
                    order = ONE_INTEGER;
                    {
                        SubLObject justification = kb_hl_supports.kb_hl_support_justification(kb_hl_support);
                        SubLObject cdolist_list_var = justification;
                        SubLObject support = NIL;
                        for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                                {
                                    SubLObject sub_order = com.cyc.cycjava.cycl.partitions.partition_kb_hl_support_order(support);
                                    if (order.numLE(sub_order)) {
                                        order = add(ONE_INTEGER, sub_order);
                                    }
                                }
                            }
                        }
                    }
                    dictionary.dictionary_enter($partition_kb_hl_support_orders$.getDynamicValue(thread), kb_hl_support, order);
                    if (order.numG($partition_max_kb_hl_support_order$.getDynamicValue(thread))) {
                        $partition_max_kb_hl_support_order$.setDynamicValue(order, thread);
                    }
                }
                return order;
            }
        }
    }

    public static SubLObject partition_kb_hl_support_order(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject order = dictionary.dictionary_lookup($partition_kb_hl_support_orders$.getDynamicValue(thread), kb_hl_support, UNPROVIDED);
        if (NIL == order) {
            order = ONE_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject justification = cdolist_list_var = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
                    final SubLObject sub_order = partition_kb_hl_support_order(support);
                    if (order.numLE(sub_order)) {
                        order = add(ONE_INTEGER, sub_order);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
            dictionary.dictionary_enter($partition_kb_hl_support_orders$.getDynamicValue(thread), kb_hl_support, order);
            if (order.numG($partition_max_kb_hl_support_order$.getDynamicValue(thread))) {
                $partition_max_kb_hl_support_order$.setDynamicValue(order, thread);
            }
        }
        return order;
    }

    public static final SubLObject display_partition_content_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(T, $str_alt29$_______S_constants, hash_table_count($partition_constant_hash$.getDynamicValue(thread)));
            {
                SubLObject cdohash_table = $partition_constant_hash$.getDynamicValue(thread);
                SubLObject key = NIL;
                SubLObject value = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            format(T, $str_alt30$___A_S, NIL != com.cyc.cycjava.cycl.partitions.partition_scope_term_p(key) ? ((SubLObject) ($str_alt31$___)) : $str_alt32$___, key);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            format(T, $str_alt33$______Max_NART_level____S, $partition_max_nart_complexity$.getDynamicValue(thread));
            if ($partition_max_nart_complexity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
                {
                    SubLObject index = NIL;
                    for (index = ZERO_INTEGER; index.numL($partition_max_nart_complexity$.getDynamicValue(thread)); index = add(index, ONE_INTEGER)) {
                        {
                            SubLObject nart_level = add(index, ONE_INTEGER);
                            format(T, $str_alt34$______level__S_NARTs, nart_level);
                            {
                                SubLObject cdohash_table = $partition_nart_hash$.getDynamicValue(thread);
                                SubLObject key = NIL;
                                SubLObject value = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            key = getEntryKey(cdohash_entry);
                                            value = getEntryValue(cdohash_entry);
                                            if (function_terms.term_functional_complexity(key).numE(nart_level)) {
                                                format(T, $str_alt30$___A_S, NIL != com.cyc.cycjava.cycl.partitions.partition_scope_term_p(key) ? ((SubLObject) ($str_alt31$___)) : $str_alt32$___, key);
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            format(T, $str_alt35$______Max_term_order___S, $partition_max_term_order$.getDynamicValue(thread));
            if ($partition_max_term_order$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
                format(T, $str_alt36$_______S_assertions, hash_table_count($partition_assertion_hash$.getDynamicValue(thread)));
                {
                    SubLObject cdohash_table = $partition_assertion_hash$.getDynamicValue(thread);
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                value = getEntryValue(cdohash_entry);
                                format(T, $str_alt30$___A_S, NIL != com.cyc.cycjava.cycl.partitions.partition_scope_term_p(key) ? ((SubLObject) ($str_alt31$___)) : $str_alt32$___, key);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                if ($partition_max_term_order$.getDynamicValue(thread).numG(ONE_INTEGER)) {
                    format(T, $str_alt37$_______S_meta_assertions, hash_table_count($partition_meta_assertion_hash$.getDynamicValue(thread)));
                    {
                        SubLObject cdotimes_end_var = subtract($partition_max_term_order$.getDynamicValue(thread), ONE_INTEGER);
                        SubLObject order = NIL;
                        for (order = ZERO_INTEGER; order.numL(cdotimes_end_var); order = add(order, ONE_INTEGER)) {
                            {
                                SubLObject meta_order = add(order, TWO_INTEGER);
                                format(T, $str_alt38$______order__S_meta_assertions, meta_order);
                                {
                                    SubLObject cdohash_table = $partition_meta_assertion_hash$.getDynamicValue(thread);
                                    SubLObject key = NIL;
                                    SubLObject value = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                key = getEntryKey(cdohash_entry);
                                                value = getEntryValue(cdohash_entry);
                                                if (kb_utilities.term_order(key).numE(meta_order)) {
                                                    format(T, $str_alt30$___A_S, NIL != com.cyc.cycjava.cycl.partitions.partition_scope_term_p(key) ? ((SubLObject) ($str_alt31$___)) : $str_alt32$___, key);
                                                }
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            format(T, $str_alt39$_______S_arguments, hash_table_count($partition_argument_hash$.getDynamicValue(thread)));
            {
                SubLObject cdohash_table = $partition_argument_hash$.getDynamicValue(thread);
                SubLObject key = NIL;
                SubLObject v_object = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            v_object = getEntryValue(cdohash_entry);
                            terpri(UNPROVIDED);
                            if (NIL != deduction_handles.deduction_p(v_object)) {
                                format(T, $str_alt40$Deduction______S, deductions_high.deduction_assertion(v_object));
                            } else {
                                if (NIL != assertion_handles.assertion_p(v_object)) {
                                    format(T, $str_alt41$Beliefs_for____S, v_object);
                                } else {
                                    format(T, $str_alt42$Unknown________S, v_object);
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            format(T, $str_alt43$______Max_KB_HL_support_level____, $partition_max_kb_hl_support_order$.getDynamicValue(thread));
            if ($partition_max_kb_hl_support_order$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
                format(T, $str_alt44$_______S_KB_HL_supports, hash_table_count($partition_kb_hl_support_hash$.getDynamicValue(thread)));
                {
                    SubLObject index = NIL;
                    for (index = ZERO_INTEGER; index.numL($partition_max_kb_hl_support_order$.getDynamicValue(thread)); index = add(index, ONE_INTEGER)) {
                        {
                            SubLObject kb_hl_support_order = add(ONE_INTEGER, index);
                            format(T, $str_alt45$______level__S_KB_HL_supports, kb_hl_support_order);
                            {
                                SubLObject cdohash_table = $partition_kb_hl_support_hash$.getDynamicValue(thread);
                                SubLObject key = NIL;
                                SubLObject value = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            key = getEntryKey(cdohash_entry);
                                            value = getEntryValue(cdohash_entry);
                                            if (com.cyc.cycjava.cycl.partitions.partition_kb_hl_support_order(key).numE(kb_hl_support_order)) {
                                                format(T, $str_alt30$___A_S, NIL != com.cyc.cycjava.cycl.partitions.partition_scope_term_p(key) ? ((SubLObject) ($str_alt31$___)) : $str_alt32$___, key);
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
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

    public static SubLObject display_partition_content() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str31$_______S_constants, hash_table_count($partition_constant_hash$.getDynamicValue(thread)));
        SubLObject cdohash_table = $partition_constant_hash$.getDynamicValue(thread);
        SubLObject key = NIL;
        SubLObject value = NIL;
        Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                format(T, $str32$___A_S, NIL != partition_scope_term_p(key) ? $str33$___ : $$$___, key);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        format(T, $str35$______Max_NART_level____S, $partition_max_nart_complexity$.getDynamicValue(thread));
        if ($partition_max_nart_complexity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            SubLObject index;
            SubLObject nart_level;
            SubLObject cdohash_table2;
            SubLObject key2;
            SubLObject value2;
            Iterator cdohash_iterator2;
            Map.Entry cdohash_entry2;
            for (index = NIL, index = ZERO_INTEGER; index.numL($partition_max_nart_complexity$.getDynamicValue(thread)); index = add(index, ONE_INTEGER)) {
                nart_level = add(index, ONE_INTEGER);
                format(T, $str36$______level__S_NARTs, nart_level);
                cdohash_table2 = $partition_nart_hash$.getDynamicValue(thread);
                key2 = NIL;
                value2 = NIL;
                cdohash_iterator2 = getEntrySetIterator(cdohash_table2);
                try {
                    while (iteratorHasNext(cdohash_iterator2)) {
                        cdohash_entry2 = iteratorNextEntry(cdohash_iterator2);
                        key2 = getEntryKey(cdohash_entry2);
                        value2 = getEntryValue(cdohash_entry2);
                        if (function_terms.term_functional_complexity(key2).numE(nart_level)) {
                            format(T, $str32$___A_S, NIL != partition_scope_term_p(key2) ? $str33$___ : $$$___, key2);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator2);
                }
            }
        }
        format(T, $str37$______Max_term_order___S, $partition_max_term_order$.getDynamicValue(thread));
        if ($partition_max_term_order$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            format(T, $str38$_______S_assertions, hash_table_count($partition_assertion_hash$.getDynamicValue(thread)));
            cdohash_table = $partition_assertion_hash$.getDynamicValue(thread);
            key = NIL;
            value = NIL;
            cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    value = getEntryValue(cdohash_entry);
                    format(T, $str32$___A_S, NIL != partition_scope_term_p(key) ? $str33$___ : $$$___, key);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            if ($partition_max_term_order$.getDynamicValue(thread).numG(ONE_INTEGER)) {
                format(T, $str39$_______S_meta_assertions, hash_table_count($partition_meta_assertion_hash$.getDynamicValue(thread)));
                SubLObject cdotimes_end_var;
                SubLObject order;
                SubLObject meta_order;
                SubLObject cdohash_table3;
                SubLObject key3;
                SubLObject value3;
                Iterator cdohash_iterator3;
                Map.Entry cdohash_entry3;
                for (cdotimes_end_var = subtract($partition_max_term_order$.getDynamicValue(thread), ONE_INTEGER), order = NIL, order = ZERO_INTEGER; order.numL(cdotimes_end_var); order = add(order, ONE_INTEGER)) {
                    meta_order = add(order, TWO_INTEGER);
                    format(T, $str40$______order__S_meta_assertions, meta_order);
                    cdohash_table3 = $partition_meta_assertion_hash$.getDynamicValue(thread);
                    key3 = NIL;
                    value3 = NIL;
                    cdohash_iterator3 = getEntrySetIterator(cdohash_table3);
                    try {
                        while (iteratorHasNext(cdohash_iterator3)) {
                            cdohash_entry3 = iteratorNextEntry(cdohash_iterator3);
                            key3 = getEntryKey(cdohash_entry3);
                            value3 = getEntryValue(cdohash_entry3);
                            if (kb_utilities.term_order(key3).numE(meta_order)) {
                                format(T, $str32$___A_S, NIL != partition_scope_term_p(key3) ? $str33$___ : $$$___, key3);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator3);
                    }
                }
            }
        }
        format(T, $str41$_______S_arguments, hash_table_count($partition_argument_hash$.getDynamicValue(thread)));
        cdohash_table = $partition_argument_hash$.getDynamicValue(thread);
        key = NIL;
        SubLObject v_object = NIL;
        cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                v_object = getEntryValue(cdohash_entry);
                terpri(UNPROVIDED);
                if (NIL != deduction_handles.deduction_p(v_object)) {
                    format(T, $str42$Deduction______S, deductions_high.deduction_supported_object(v_object));
                } else
                    if (NIL != assertion_handles.assertion_p(v_object)) {
                        format(T, $str43$Beliefs_for____S, v_object);
                    } else {
                        format(T, $str44$Unknown________S, v_object);
                    }

            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        format(T, $str45$______Max_KB_HL_support_level____, $partition_max_kb_hl_support_order$.getDynamicValue(thread));
        if ($partition_max_kb_hl_support_order$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            format(T, $str46$_______S_KB_HL_supports, hash_table_count($partition_kb_hl_support_hash$.getDynamicValue(thread)));
            SubLObject index;
            SubLObject cdohash_table2;
            SubLObject key2;
            SubLObject value2;
            Iterator cdohash_iterator2;
            Map.Entry cdohash_entry2;
            SubLObject kb_hl_support_order;
            for (index = NIL, index = ZERO_INTEGER; index.numL($partition_max_kb_hl_support_order$.getDynamicValue(thread)); index = add(index, ONE_INTEGER)) {
                kb_hl_support_order = add(ONE_INTEGER, index);
                format(T, $str47$______level__S_KB_HL_supports, kb_hl_support_order);
                cdohash_table2 = $partition_kb_hl_support_hash$.getDynamicValue(thread);
                key2 = NIL;
                value2 = NIL;
                cdohash_iterator2 = getEntrySetIterator(cdohash_table2);
                try {
                    while (iteratorHasNext(cdohash_iterator2)) {
                        cdohash_entry2 = iteratorNextEntry(cdohash_iterator2);
                        key2 = getEntryKey(cdohash_entry2);
                        value2 = getEntryValue(cdohash_entry2);
                        if (partition_kb_hl_support_order(key2).numE(kb_hl_support_order)) {
                            format(T, $str32$___A_S, NIL != partition_scope_term_p(key2) ? $str33$___ : $$$___, key2);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator2);
                }
            }
        }
        return NIL;
    }

    /**
     * Remove PARTITION from the KB
     */
    @LispMethod(comment = "Remove PARTITION from the KB")
    public static final SubLObject remove_partition_alt(SubLObject partition) {
        if (NIL != partition) {
            com.cyc.cycjava.cycl.partitions.scope_partition(partition);
            return com.cyc.cycjava.cycl.partitions.remove_scoped_partition();
        }
        return NIL;
    }

    /**
     * Remove PARTITION from the KB
     */
    @LispMethod(comment = "Remove PARTITION from the KB")
    public static SubLObject remove_partition(final SubLObject partition) {
        if (NIL != partition) {
            scope_partition(partition);
            return remove_scoped_partition();
        }
        return NIL;
    }

    public static final SubLObject remove_scoped_partition_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                SubLObject _prev_bind_11 = Errors.$continue_cerrorP$.currentBinding(thread);
                SubLObject _prev_bind_12 = Errors.$ignore_warnsP$.currentBinding(thread);
                try {
                    $within_assert$.bind(NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                    Errors.$continue_cerrorP$.bind(T, thread);
                    Errors.$ignore_warnsP$.bind(T, thread);
                    {
                        SubLObject table_var = $partition_scope_hash$.getDynamicValue(thread);
                        $progress_note$.setDynamicValue($$$removing_partition_assertions, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0_8 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1_9 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2_10 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3_11 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject key = NIL;
                                    SubLObject v_term = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                key = getEntryKey(cdohash_entry);
                                                v_term = getEntryValue(cdohash_entry);
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                if (NIL != valid_assertion(v_term, UNPROVIDED)) {
                                                    tms.tms_remove_assertion(v_term);
                                                }
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
                                        }
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3_11, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2_10, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1_9, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_8, thread);
                            }
                        }
                    }
                    {
                        SubLObject table_var = $partition_scope_hash$.getDynamicValue(thread);
                        $progress_note$.setDynamicValue($$$removing_partition_NARTs, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0_12 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1_13 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2_14 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3_15 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject key = NIL;
                                    SubLObject v_term = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                key = getEntryKey(cdohash_entry);
                                                v_term = getEntryValue(cdohash_entry);
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                if (NIL != nart_handles.valid_nartP(v_term, UNPROVIDED)) {
                                                    cyc_kernel.cyc_kill(v_term);
                                                }
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
                                        }
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3_15, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2_14, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1_13, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_12, thread);
                            }
                        }
                    }
                    {
                        SubLObject table_var = $partition_scope_hash$.getDynamicValue(thread);
                        $progress_note$.setDynamicValue($$$removing_partition_constants, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0_16 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1_17 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2_18 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3_19 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject key = NIL;
                                    SubLObject v_term = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                key = getEntryKey(cdohash_entry);
                                                v_term = getEntryValue(cdohash_entry);
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                if (NIL != valid_constantP(v_term, UNPROVIDED)) {
                                                    cyc_kernel.cyc_kill(v_term);
                                                }
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
                                        }
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3_19, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2_18, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1_17, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_16, thread);
                            }
                        }
                    }
                } finally {
                    Errors.$ignore_warnsP$.rebind(_prev_bind_12, thread);
                    Errors.$continue_cerrorP$.rebind(_prev_bind_11, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                    $within_assert$.rebind(_prev_bind_0, thread);
                }
            }
            return T;
        }
    }

    public static SubLObject remove_scoped_partition() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = Errors.$ignore_warnsP$.currentBinding(thread);
        try {
            $within_assert$.bind(NIL, thread);
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            wff_vars.$validate_constantsP$.bind(NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            Errors.$ignore_warnsP$.bind(T, thread);
            SubLObject table_var = $partition_scope_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$9 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$10 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$11 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_3_$12 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_4_$13 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_5_$14 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_6_$15 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_7_$16 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$removing_partition_assertions, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject key = NIL;
                    SubLObject v_term = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            v_term = getEntryValue(cdohash_entry);
                            if (NIL != assertions_high.valid_assertion(v_term, UNPROVIDED)) {
                                tms.tms_remove_assertion(v_term);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_7_$16, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_6_$15, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_5_$14, thread);
                $last_percent_progress_index$.rebind(_prev_bind_4_$13, thread);
                $progress_sofar$.rebind(_prev_bind_3_$12, thread);
                $progress_total$.rebind(_prev_bind_2_$11, thread);
                $progress_start_time$.rebind(_prev_bind_1_$10, thread);
                $progress_note$.rebind(_prev_bind_0_$9, thread);
            }
            table_var = $partition_scope_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$11 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$11 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$12 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_3_$13 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_4_$14 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_5_$15 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_6_$16 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_7_$17 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$removing_partition_NARTs, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject key = NIL;
                    SubLObject v_term = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            v_term = getEntryValue(cdohash_entry);
                            if (NIL != nart_handles.valid_nartP(v_term, UNPROVIDED)) {
                                cyc_kernel.cyc_kill(v_term);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_7_$17, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_6_$16, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_5_$15, thread);
                $last_percent_progress_index$.rebind(_prev_bind_4_$14, thread);
                $progress_sofar$.rebind(_prev_bind_3_$13, thread);
                $progress_total$.rebind(_prev_bind_2_$12, thread);
                $progress_start_time$.rebind(_prev_bind_1_$11, thread);
                $progress_note$.rebind(_prev_bind_0_$11, thread);
            }
            table_var = $partition_scope_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$13 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$12 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$13 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_3_$14 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_4_$15 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_5_$16 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_6_$17 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_7_$18 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$removing_partition_constants, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject key = NIL;
                    SubLObject v_term = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            v_term = getEntryValue(cdohash_entry);
                            if (NIL != valid_constantP(v_term, UNPROVIDED)) {
                                cyc_kernel.cyc_kill(v_term);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_7_$18, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_6_$17, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_5_$16, thread);
                $last_percent_progress_index$.rebind(_prev_bind_4_$15, thread);
                $progress_sofar$.rebind(_prev_bind_3_$14, thread);
                $progress_total$.rebind(_prev_bind_2_$13, thread);
                $progress_start_time$.rebind(_prev_bind_1_$12, thread);
                $progress_note$.rebind(_prev_bind_0_$13, thread);
            }
        } finally {
            Errors.$ignore_warnsP$.rebind(_prev_bind_13, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_12, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static final SubLObject make_archive_filename_alt(SubLObject archive_name) {
        return file_utilities.cyc_home_filename($list_alt49, archive_name, $$$lisp);
    }

    public static SubLObject make_archive_filename(final SubLObject archive_name) {
        return file_utilities.cyc_home_filename($list51, archive_name, $$$lisp);
    }

    /**
     * If ASSERTION is asserted, write out an FI-ASSERT expression to *CURRENT-ARCHIVE-STREAM*
     */
    @LispMethod(comment = "If ASSERTION is asserted, write out an FI-ASSERT expression to *CURRENT-ARCHIVE-STREAM*")
    public static final SubLObject archive_assertion_if_local_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            if (NIL != asserted_assertionP(assertion)) {
                {
                    SubLObject formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
                    SubLObject mt = assertion_mt(assertion);
                    SubLObject strength = assertion_strength(assertion);
                    SubLObject dir = assertion_direction(assertion);
                    format($current_archive_stream$.getDynamicValue(thread), $str_alt52$_____FI_ASSERT___S__S__S__S_, new SubLObject[]{ formula, mt, strength, dir });
                }
            }
            return T;
        }
    }

    /**
     * If ASSERTION is asserted, write out an FI-ASSERT expression to *CURRENT-ARCHIVE-STREAM*
     */
    @LispMethod(comment = "If ASSERTION is asserted, write out an FI-ASSERT expression to *CURRENT-ARCHIVE-STREAM*")
    public static SubLObject archive_assertion_if_local(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            final SubLObject dir = assertions_high.assertion_direction(assertion);
            format($current_archive_stream$.getDynamicValue(thread), $str54$_____FI_ASSERT___S__S__S__S_, new SubLObject[]{ formula, mt, strength, dir });
        }
        return T;
    }

    public static final SubLObject archive_term_alt(SubLObject v_term, SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_P);
            if (NIL != forts.valid_fortP(v_term)) {
                if (NIL == nart_handles.nart_p(v_term)) {
                    format($current_archive_stream$.getDynamicValue(thread), $str_alt54$_____FI_CREATE__a_, constants_high.constant_name(v_term));
                }
                kb_mapping.map_term(symbol_function(ARCHIVE_ASSERTION_IF_LOCAL), v_term);
                if (NIL != removeP) {
                    com.cyc.cycjava.cycl.partitions.remove_partition_term(v_term);
                }
            }
            return T;
        }
    }

    public static SubLObject archive_term(final SubLObject v_term, SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        if (NIL != forts.valid_fortP(v_term)) {
            if (NIL == nart_handles.nart_p(v_term)) {
                format($current_archive_stream$.getDynamicValue(thread), $str55$_____FI_CREATE__a_, constants_high.constant_name(v_term));
            }
            kb_mapping.map_term(symbol_function(ARCHIVE_ASSERTION_IF_LOCAL), v_term);
            if (NIL != removeP) {
                remove_partition_term(v_term);
            }
        }
        return T;
    }

    /**
     * Write out FI-ASSERT expressions to *CURRENT-ARCHIVE-STREAM* preserving assertions of ONTOLOGY-START and all its instances and specs.
     */
    @LispMethod(comment = "Write out FI-ASSERT expressions to *CURRENT-ARCHIVE-STREAM* preserving assertions of ONTOLOGY-START and all its instances and specs.")
    public static final SubLObject archive_ontology_alt(SubLObject ontology_start, SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        SubLTrampolineFile.checkType(ontology_start, FORT_P);
        {
            SubLObject v_instances = com.cyc.cycjava.cycl.partitions.every_possible_instance(ontology_start);
            SubLObject specs = com.cyc.cycjava.cycl.partitions.every_possible_spec(ontology_start);
            {
                SubLObject cdolist_list_var = v_instances;
                SubLObject instance = NIL;
                for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.partitions.archive_term(instance, removeP);
                }
            }
            {
                SubLObject cdolist_list_var = specs;
                SubLObject spec = NIL;
                for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                    if (!spec.equal(ontology_start)) {
                        com.cyc.cycjava.cycl.partitions.archive_term(spec, removeP);
                    }
                }
            }
        }
        return com.cyc.cycjava.cycl.partitions.archive_term(ontology_start, removeP);
    }

    /**
     * Write out FI-ASSERT expressions to *CURRENT-ARCHIVE-STREAM* preserving assertions of ONTOLOGY-START and all its instances and specs.
     */
    @LispMethod(comment = "Write out FI-ASSERT expressions to *CURRENT-ARCHIVE-STREAM* preserving assertions of ONTOLOGY-START and all its instances and specs.")
    public static SubLObject archive_ontology(final SubLObject ontology_start, SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        assert NIL != forts.fort_p(ontology_start) : "! forts.fort_p(ontology_start) " + ("forts.fort_p(ontology_start) " + "CommonSymbols.NIL != forts.fort_p(ontology_start) ") + ontology_start;
        final SubLObject v_instances = isa.all_instances_in_all_mts(ontology_start);
        final SubLObject specs = genls.all_specs_in_all_mts(ontology_start, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = v_instances;
        SubLObject instance = NIL;
        instance = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            archive_term(instance, removeP);
            cdolist_list_var = cdolist_list_var.rest();
            instance = cdolist_list_var.first();
        } 
        cdolist_list_var = specs;
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!spec.equal(ontology_start)) {
                archive_term(spec, removeP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return archive_term(ontology_start, removeP);
    }

    /**
     * Adds FI-ASSERT expressions to a file in the *DEFAULT-ARCHIVE-DIRECTORY* with name ARCHIVE-NAME, creating the file if it does not yet exist.  These expressions preserve the assertions the terms in PARTITION are involved in.  If REMOVE? is non-nil, will then kill all terms in PARTITION.
     */
    @LispMethod(comment = "Adds FI-ASSERT expressions to a file in the *DEFAULT-ARCHIVE-DIRECTORY* with name ARCHIVE-NAME, creating the file if it does not yet exist.  These expressions preserve the assertions the terms in PARTITION are involved in.  If REMOVE? is non-nil, will then kill all terms in PARTITION.")
    public static final SubLObject archive_partition_alt(SubLObject partition, SubLObject archive_name, SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject archive_file = com.cyc.cycjava.cycl.partitions.make_archive_filename(archive_name);
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $use_transcriptP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        $use_transcriptP$.bind(NIL, thread);
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(archive_file, $APPEND, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt57$Unable_to_open__S, archive_file);
                                }
                                {
                                    SubLObject _prev_bind_0_20 = $current_archive_stream$.currentBinding(thread);
                                    try {
                                        $current_archive_stream$.bind(stream, thread);
                                        format($current_archive_stream$.getDynamicValue(thread), $str_alt58$______Archive_saved_at__s____, numeric_date_utilities.timestring(UNPROVIDED));
                                        {
                                            SubLObject cdolist_list_var = partition;
                                            SubLObject partition_item = NIL;
                                            for (partition_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , partition_item = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = partition_item;
                                                    SubLObject current = datum;
                                                    SubLObject method = NIL;
                                                    SubLObject term_spec = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt0);
                                                    method = current.first();
                                                    current = current.rest();
                                                    term_spec = current;
                                                    SubLTrampolineFile.checkType(method, KEYWORDP);
                                                    SubLTrampolineFile.checkType(term_spec, STRINGP);
                                                    {
                                                        SubLObject item = fi.fi_find(term_spec);
                                                        if (NIL != valid_constantP(item, UNPROVIDED)) {
                                                            {
                                                                SubLObject pcase_var = method;
                                                                if (pcase_var.eql($ONTOLOGY)) {
                                                                    com.cyc.cycjava.cycl.partitions.archive_ontology(item, removeP);
                                                                } else {
                                                                    com.cyc.cycjava.cycl.partitions.archive_term(item, removeP);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        $current_archive_stream$.rebind(_prev_bind_0_20, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $use_transcriptP$.rebind(_prev_bind_1, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                return archive_file;
            }
        }
    }

    /**
     * Adds FI-ASSERT expressions to a file in the *DEFAULT-ARCHIVE-DIRECTORY* with name ARCHIVE-NAME, creating the file if it does not yet exist.  These expressions preserve the assertions the terms in PARTITION are involved in.  If REMOVE? is non-nil, will then kill all terms in PARTITION.
     */
    @LispMethod(comment = "Adds FI-ASSERT expressions to a file in the *DEFAULT-ARCHIVE-DIRECTORY* with name ARCHIVE-NAME, creating the file if it does not yet exist.  These expressions preserve the assertions the terms in PARTITION are involved in.  If REMOVE? is non-nil, will then kill all terms in PARTITION.")
    public static SubLObject archive_partition(final SubLObject partition, final SubLObject archive_name, SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject archive_file = make_archive_filename(archive_name);
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $use_transcriptP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            $use_transcriptP$.bind(NIL, thread);
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(archive_file, $APPEND);
                if (!stream.isStream()) {
                    Errors.error($str58$Unable_to_open__S, archive_file);
                }
                final SubLObject _prev_bind_0_$36 = $current_archive_stream$.currentBinding(thread);
                try {
                    $current_archive_stream$.bind(stream, thread);
                    format($current_archive_stream$.getDynamicValue(thread), $str59$______Archive_saved_at__s____, numeric_date_utilities.timestring(UNPROVIDED));
                    SubLObject cdolist_list_var = partition;
                    SubLObject partition_item = NIL;
                    partition_item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = partition_item;
                        SubLObject method = NIL;
                        SubLObject term_spec = NIL;
                        destructuring_bind_must_consp(current, datum, $list0);
                        method = current.first();
                        current = term_spec = current.rest();
                        assert NIL != keywordp(method) : "! keywordp(method) " + ("Types.keywordp(method) " + "CommonSymbols.NIL != Types.keywordp(method) ") + method;
                        assert NIL != stringp(term_spec) : "! stringp(term_spec) " + ("Types.stringp(term_spec) " + "CommonSymbols.NIL != Types.stringp(term_spec) ") + term_spec;
                        final SubLObject item = fi.fi_find(term_spec);
                        if (NIL != valid_constantP(item, UNPROVIDED)) {
                            final SubLObject pcase_var = method;
                            if (pcase_var.eql($ONTOLOGY)) {
                                archive_ontology(item, removeP);
                            } else {
                                archive_term(item, removeP);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        partition_item = cdolist_list_var.first();
                    } 
                } finally {
                    $current_archive_stream$.rebind(_prev_bind_0_$36, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        } finally {
            $use_transcriptP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return archive_file;
    }

    public static final SubLObject remove_partition_term_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        if (NIL != forts.valid_fortP(v_term)) {
            fi.fi_kill(v_term);
            return T;
        }
        return NIL;
    }

    public static SubLObject remove_partition_term(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        if (NIL != forts.valid_fortP(v_term)) {
            fi.fi_kill(v_term);
            return T;
        }
        return NIL;
    }

    /**
     * Save PARTITION to FILENAME.  Return the FILENAME.
     *
     * @param PARTITION
     * 		listp, a list of key-value pairs, where the keys can be:
     * 		:ontology, :term, :definition, and :function.
     * 		:term means that TERM will be included
     * 		:ontology means that TERM, all its instances, and all its specs will be included
     * 		:definition gets the definitional assertions from the term following (see #$ResearchCycDefinitionalPredicate), and
     * 		:function takes a SubL function that calls partition-scoping functions explicitly.
     * 		It's important to realize that there are two layers of a partition, scope and non-scope.
     * 		Terms mentioned specifically will be added to the scope.  Assertions using those terms will be added to the non-scope
     * 		part of the partition.  Assertions using those terms (non-scope objects) may not make it into
     * 		the system after the partition is loaded.  Crucially, non-scope terms are only used by reference, and if
     * 		the non-scope terms are not present in the KB the partition is loaded into, the assertions will not make it in.
     * 		For example, if #$isa, #$DaveS, and #$PunkRocker are all in the scope, then an assertion of the form
     * 		(#$isa #$DaveS #$PunkRocker) will be added to the scope of the saved partition, and will be guaranteed to
     * 		make it into the target KB when the partition is loaded.  However, if #$DaveS is in the scope of the saved
     * 		partition but #$PunkRocker is not, then the assertion will only make it into the KB upon partition load
     * 		if #$PunkRocker is in the target KB.
     * @unknown (save-partition "/home/daves/daves.cpart" '((:term #$DaveS) (:term #$Pace) ))
    will save out a partition containing all the assertions that mention either #$Pace or #$DaveS.
     */
    @LispMethod(comment = "Save PARTITION to FILENAME.  Return the FILENAME.\r\n\r\n@param PARTITION\r\n\t\tlistp, a list of key-value pairs, where the keys can be:\r\n\t\t:ontology, :term, :definition, and :function.\r\n\t\t:term means that TERM will be included\r\n\t\t:ontology means that TERM, all its instances, and all its specs will be included\r\n\t\t:definition gets the definitional assertions from the term following (see #$ResearchCycDefinitionalPredicate), and\r\n\t\t:function takes a SubL function that calls partition-scoping functions explicitly.\r\n\t\tIt\'s important to realize that there are two layers of a partition, scope and non-scope.\r\n\t\tTerms mentioned specifically will be added to the scope.  Assertions using those terms will be added to the non-scope\r\n\t\tpart of the partition.  Assertions using those terms (non-scope objects) may not make it into\r\n\t\tthe system after the partition is loaded.  Crucially, non-scope terms are only used by reference, and if\r\n\t\tthe non-scope terms are not present in the KB the partition is loaded into, the assertions will not make it in.\r\n\t\tFor example, if #$isa, #$DaveS, and #$PunkRocker are all in the scope, then an assertion of the form\r\n\t\t(#$isa #$DaveS #$PunkRocker) will be added to the scope of the saved partition, and will be guaranteed to\r\n\t\tmake it into the target KB when the partition is loaded.  However, if #$DaveS is in the scope of the saved\r\n\t\tpartition but #$PunkRocker is not, then the assertion will only make it into the KB upon partition load\r\n\t\tif #$PunkRocker is in the target KB.\r\n@unknown (save-partition \"/home/daves/daves.cpart\" \'((:term #$DaveS) (:term #$Pace) ))\r\nwill save out a partition containing all the assertions that mention either #$Pace or #$DaveS.")
    public static final SubLObject save_partition_alt(SubLObject filename, SubLObject partition) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject result = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_22 = stream;
                        if (NIL == partition) {
                        } else {
                            com.cyc.cycjava.cycl.partitions.save_partition_to_stream(stream_22, partition);
                        }
                        result = filename;
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
                return result;
            }
        }
    }

    /**
     * Save PARTITION to FILENAME.  Return the FILENAME.
     *
     * @param PARTITION
     * 		listp, a list of key-value pairs, where the keys can be:
     * 		:ontology, :term, :definition, and :function.
     * 		:term means that TERM will be included
     * 		:ontology means that TERM, all its instances, and all its specs will be included
     * 		:definition gets the definitional assertions from the term following (see #$ResearchCycDefinitionalPredicate), and
     * 		:function takes a SubL function that calls partition-scoping functions explicitly.
     * 		It's important to realize that there are two layers of a partition, scope and non-scope.
     * 		Terms mentioned specifically will be added to the scope.  Assertions using those terms will be added to the non-scope
     * 		part of the partition.  Assertions using those terms (non-scope objects) may not make it into
     * 		the system after the partition is loaded.  Crucially, non-scope terms are only used by reference, and if
     * 		the non-scope terms are not present in the KB the partition is loaded into, the assertions will not make it in.
     * 		For example, if #$isa, #$DaveS, and #$PunkRocker are all in the scope, then an assertion of the form
     * 		(#$isa #$DaveS #$PunkRocker) will be added to the scope of the saved partition, and will be guaranteed to
     * 		make it into the target KB when the partition is loaded.  However, if #$DaveS is in the scope of the saved
     * 		partition but #$PunkRocker is not, then the assertion will only make it into the KB upon partition load
     * 		if #$PunkRocker is in the target KB.
     * @unknown (save-partition "/home/daves/daves.cpart" '((:term #$DaveS) (:term #$Pace) ))
    will save out a partition containing all the assertions that mention either #$Pace or #$DaveS.
     */
    @LispMethod(comment = "Save PARTITION to FILENAME.  Return the FILENAME.\r\n\r\n@param PARTITION\r\n\t\tlistp, a list of key-value pairs, where the keys can be:\r\n\t\t:ontology, :term, :definition, and :function.\r\n\t\t:term means that TERM will be included\r\n\t\t:ontology means that TERM, all its instances, and all its specs will be included\r\n\t\t:definition gets the definitional assertions from the term following (see #$ResearchCycDefinitionalPredicate), and\r\n\t\t:function takes a SubL function that calls partition-scoping functions explicitly.\r\n\t\tIt\'s important to realize that there are two layers of a partition, scope and non-scope.\r\n\t\tTerms mentioned specifically will be added to the scope.  Assertions using those terms will be added to the non-scope\r\n\t\tpart of the partition.  Assertions using those terms (non-scope objects) may not make it into\r\n\t\tthe system after the partition is loaded.  Crucially, non-scope terms are only used by reference, and if\r\n\t\tthe non-scope terms are not present in the KB the partition is loaded into, the assertions will not make it in.\r\n\t\tFor example, if #$isa, #$DaveS, and #$PunkRocker are all in the scope, then an assertion of the form\r\n\t\t(#$isa #$DaveS #$PunkRocker) will be added to the scope of the saved partition, and will be guaranteed to\r\n\t\tmake it into the target KB when the partition is loaded.  However, if #$DaveS is in the scope of the saved\r\n\t\tpartition but #$PunkRocker is not, then the assertion will only make it into the KB upon partition load\r\n\t\tif #$PunkRocker is in the target KB.\r\n@unknown (save-partition \"/home/daves/daves.cpart\" \'((:term #$DaveS) (:term #$Pace) ))\r\nwill save out a partition containing all the assertions that mention either #$Pace or #$DaveS.")
    public static SubLObject save_partition(final SubLObject filename, final SubLObject partition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str58$Unable_to_open__S, filename);
            }
            final SubLObject stream_$38 = stream;
            if (NIL != partition) {
                save_partition_to_stream(stream_$38, partition);
            }
            result = filename;
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
        return result;
    }

    public static final SubLObject save_partition_to_stream_alt(SubLObject stream, SubLObject partition) {
        SubLTrampolineFile.checkType(stream, CFASL_ENCODABLE_STREAM_P);
        com.cyc.cycjava.cycl.partitions.mark_partition_content(partition);
        com.cyc.cycjava.cycl.partitions.dump_partition_to_stream(stream);
        return stream;
    }

    public static SubLObject save_partition_to_stream(final SubLObject stream, final SubLObject partition) {
        assert NIL != cfasl_encodable_stream_p(stream) : "! cfasl.cfasl_encodable_stream_p(stream) " + ("cfasl.cfasl_encodable_stream_p(stream) " + "CommonSymbols.NIL != cfasl.cfasl_encodable_stream_p(stream) ") + stream;
        mark_partition_content(partition);
        dump_partition_to_stream(stream);
        return stream;
    }

    public static final SubLObject excise_partition_to_stream_alt(SubLObject stream, SubLObject partition) {
        SubLTrampolineFile.checkType(stream, CFASL_ENCODABLE_STREAM_P);
        {
            SubLObject ret_val = com.cyc.cycjava.cycl.partitions.save_partition_to_stream(stream, partition);
            com.cyc.cycjava.cycl.partitions.remove_scoped_partition();
            return ret_val;
        }
    }

    public static SubLObject excise_partition_to_stream(final SubLObject stream, final SubLObject partition) {
        assert NIL != cfasl_encodable_stream_p(stream) : "! cfasl.cfasl_encodable_stream_p(stream) " + ("cfasl.cfasl_encodable_stream_p(stream) " + "CommonSymbols.NIL != cfasl.cfasl_encodable_stream_p(stream) ") + stream;
        final SubLObject ret_val = save_partition_to_stream(stream, partition);
        remove_scoped_partition();
        return ret_val;
    }

    public static SubLObject save_partition_as_hl_transcript(final SubLObject filename, final SubLObject partition) {
        final SubLObject modification_spec = partition_spec_to_modification_spec(partition);
        final SubLObject content_summary = hl_transcripts.save_hl_transcript_from_modification_spec(filename, modification_spec);
        return values(filename, content_summary);
    }

    public static SubLObject partition_spec_to_modification_spec(final SubLObject partition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mark_partition_content(partition);
        SubLObject partition_constants = hash_table_utilities.hash_table_keys($partition_constant_hash$.getDynamicValue(thread));
        SubLObject partition_narts = hash_table_utilities.hash_table_keys($partition_nart_hash$.getDynamicValue(thread));
        SubLObject simple_assertions = hash_table_utilities.hash_table_keys($partition_assertion_hash$.getDynamicValue(thread));
        SubLObject meta_assertions = hash_table_utilities.hash_table_keys($partition_meta_assertion_hash$.getDynamicValue(thread));
        SubLObject partition_assertions = $UNINITIALIZED;
        SubLObject partition_deductions = list_utilities.remove_if_not(symbol_function(DEDUCTION_P), hash_table_utilities.hash_table_keys($partition_argument_hash$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject partition_kb_hl_supports = hash_table_utilities.hash_table_keys($partition_kb_hl_support_hash$.getDynamicValue(thread));
        partition_constants = Sort.sort(partition_constants, symbol_function($sym65$_), symbol_function(CONSTANT_INTERNAL_ID));
        partition_narts = Sort.sort(partition_narts, symbol_function($sym65$_), symbol_function(NART_ID));
        partition_narts = Sort.stable_sort(partition_narts, symbol_function($sym65$_), symbol_function(TERM_FUNCTIONAL_COMPLEXITY));
        simple_assertions = assertion_utilities.sort_assertions(simple_assertions);
        meta_assertions = assertion_utilities.sort_assertions(meta_assertions);
        meta_assertions = Sort.stable_sort(meta_assertions, symbol_function($sym65$_), symbol_function(TERM_ORDER));
        partition_assertions = append(simple_assertions, meta_assertions);
        partition_deductions = Sort.sort(partition_deductions, symbol_function($sym65$_), symbol_function(DEDUCTION_ID));
        partition_kb_hl_supports = Sort.sort(partition_kb_hl_supports, symbol_function($sym65$_), symbol_function(KB_HL_SUPPORT_ID));
        final SubLObject modification_spec = list($NEW_CONSTANTS, partition_constants, $NEW_NARTS, partition_narts, $NEW_ASSERTIONS, partition_assertions, $NEW_DEDUCTIONS, partition_deductions);
        return modification_spec;
    }

    public static final SubLObject partition_common_symbols_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return append(dumper.kb_dump_common_symbols(), $partition_special_objects$.getDynamicValue(thread));
        }
    }

    public static SubLObject partition_common_symbols() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return append(dumper.kb_dump_common_symbols(), $partition_special_objects$.getDynamicValue(thread));
    }

    public static final SubLObject dump_partition_to_stream_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.dump_partition_info(stream);
            {
                SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                try {
                    $cfasl_common_symbols$.bind(NIL, thread);
                    cfasl_set_common_symbols(com.cyc.cycjava.cycl.partitions.partition_common_symbols());
                    com.cyc.cycjava.cycl.partitions.dump_partition_constant_shells(stream);
                    com.cyc.cycjava.cycl.partitions.dump_partition_nart_shells(stream);
                    com.cyc.cycjava.cycl.partitions.dump_partition_assertions(stream);
                    com.cyc.cycjava.cycl.partitions.dump_partition_kb_hl_supports(stream);
                    com.cyc.cycjava.cycl.partitions.dump_partition_arguments(stream);
                } finally {
                    $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                }
            }
            return T;
        }
    }

    public static SubLObject dump_partition_to_stream(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_info(stream);
        final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols(partition_common_symbols());
            dump_partition_constant_shells(stream);
            dump_partition_nart_shells(stream);
            dump_partition_assertions(stream);
            dump_partition_kb_hl_supports(stream);
            dump_partition_arguments(stream);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static final SubLObject dump_partition_section_marker_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cfasl_output($partition_section_marker$.getDynamicValue(thread), stream);
            return NIL;
        }
    }

    public static SubLObject dump_partition_section_marker(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_output($partition_section_marker$.getDynamicValue(thread), stream);
        return NIL;
    }

    public static final SubLObject dump_partition_info_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = system_info.cyc_revision_numbers();
                SubLObject current = datum;
                SubLObject system_number = NIL;
                SubLObject patch_number = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt66);
                system_number = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt66);
                patch_number = current.first();
                current = current.rest();
                {
                    SubLObject branch_specifics = current;
                    cfasl_output(misc_utilities.copyright_notice(), stream);
                    cfasl_output($dump_partition_format$.getDynamicValue(thread), stream);
                    cfasl_output(system_number, stream);
                    cfasl_output(patch_number, stream);
                    cfasl_output(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), stream);
                    dumper.dump_special_objects_internal(com.cyc.cycjava.cycl.partitions.partition_common_symbols(), stream);
                }
            }
            return NIL;
        }
    }

    public static SubLObject dump_partition_info(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = system_info.cyc_revision_numbers();
        SubLObject system_number = NIL;
        SubLObject patch_number = NIL;
        destructuring_bind_must_consp(current, datum, $list80);
        system_number = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        patch_number = current.first();
        final SubLObject branch_specifics;
        current = branch_specifics = current.rest();
        cfasl_output(misc_utilities.copyright_notice(), stream);
        cfasl_output($dump_partition_format$.getDynamicValue(thread), stream);
        cfasl_output(system_number, stream);
        cfasl_output(patch_number, stream);
        cfasl_output(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), stream);
        dumper.dump_special_objects_internal(partition_common_symbols(), stream);
        return NIL;
    }

    /**
     * Return T iff the partition contains a large fraction of the KB.
     */
    @LispMethod(comment = "Return T iff the partition contains a large fraction of the KB.")
    public static final SubLObject large_partitionP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return numGE(divide(hash_table_count($partition_constant_hash$.getDynamicValue(thread)), constant_count()), $float$0_1);
        }
    }

    /**
     * Return T iff the partition contains a large fraction of the KB.
     */
    @LispMethod(comment = "Return T iff the partition contains a large fraction of the KB.")
    public static SubLObject large_partitionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numGE(divide(hash_table_count($partition_constant_hash$.getDynamicValue(thread)), constant_count()), $float$0_1);
    }

    public static final SubLObject dump_partition_constant_shells_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.dump_partition_section_marker(stream);
            {
                SubLObject total = hash_table_count($partition_constant_hash$.getDynamicValue(thread));
                cfasl_output(total, stream);
                if (NIL != com.cyc.cycjava.cycl.partitions.large_partitionP()) {
                    {
                        SubLObject idx = do_constants_table();
                        SubLObject total_23 = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType($str_alt68$_large__partition_constant_shells, STRINGP);
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
                                noting_percent_progress_preamble($str_alt68$_large__partition_constant_shells);
                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject constant = NIL;
                                        while (NIL != id) {
                                            constant = do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
                                                note_percent_progress(sofar, total_23);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if (NIL != gethash_without_values(constant, $partition_constant_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                                    com.cyc.cycjava.cycl.partitions.dump_partition_constant_shell(constant, stream);
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
                    }
                } else {
                    {
                        SubLObject table_var = $partition_constant_hash$.getDynamicValue(thread);
                        $progress_note$.setDynamicValue($$$partition_constant_shells, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject constant = NIL;
                                    SubLObject value = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                constant = getEntryKey(cdohash_entry);
                                                value = getEntryValue(cdohash_entry);
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                com.cyc.cycjava.cycl.partitions.dump_partition_constant_shell(constant, stream);
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
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
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject dump_partition_constant_shells(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = hash_table_count($partition_constant_hash$.getDynamicValue(thread));
        cfasl_output(total, stream);
        if (NIL != large_partitionP()) {
            final SubLObject idx = do_constants_table();
            final SubLObject mess = $str82$_large__partition_constant_shells;
            final SubLObject total_$39 = id_index_count(idx);
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
                    final SubLObject idx_$40 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$40, $SKIP)) {
                        final SubLObject idx_$41 = idx_$40;
                        if (NIL == id_index_dense_objects_empty_p(idx_$41, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$41);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                constant = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(constant)) {
                                        constant = $SKIP;
                                    }
                                    if (NIL != gethash_without_values(constant, $partition_constant_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                        dump_partition_constant_shell(constant, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$39);
                                }
                            }
                        }
                        final SubLObject idx_$42 = idx_$40;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$42)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$42);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$42);
                            final SubLObject end_id = id_index_next_id(idx_$42);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                    if (NIL != gethash_without_values(constant2, $partition_constant_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                        dump_partition_constant_shell(constant2, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$39);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject table_var = $partition_constant_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_5 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$partition_constant_shells, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject constant3 = NIL;
                    SubLObject value = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            constant3 = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            dump_partition_constant_shell(constant3, stream);
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                $progress_sofar$.rebind(_prev_bind_8, thread);
                $progress_total$.rebind(_prev_bind_7, thread);
                $progress_start_time$.rebind(_prev_bind_6, thread);
                $progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject dump_partition_constant_shell_alt(SubLObject constant, SubLObject stream) {
        cfasl_output(constants_high.constant_internal_id(constant), stream);
        cfasl_output(constants_high.constant_name(constant), stream);
        cfasl_output(constants_high.constant_guid(constant), stream);
        cfasl_output(com.cyc.cycjava.cycl.partitions.partition_scope_term_p(constant), stream);
        return NIL;
    }

    public static SubLObject dump_partition_constant_shell(final SubLObject constant, final SubLObject stream) {
        cfasl_output(constants_high.constant_internal_id(constant), stream);
        cfasl_output(constants_high.constant_name(constant), stream);
        cfasl_output(constants_high.constant_guid(constant), stream);
        cfasl_output(partition_scope_term_p(constant), stream);
        return NIL;
    }

    public static final SubLObject dump_partition_nart_shells_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cfasl_output($partition_max_nart_complexity$.getDynamicValue(thread), stream);
            {
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; index.numL($partition_max_nart_complexity$.getDynamicValue(thread)); index = add(index, ONE_INTEGER)) {
                    {
                        SubLObject nart_level = add(index, ONE_INTEGER);
                        com.cyc.cycjava.cycl.partitions.dump_partition_nart_shells_at_level(nart_level, stream);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject dump_partition_nart_shells(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_output($partition_max_nart_complexity$.getDynamicValue(thread), stream);
        SubLObject index;
        SubLObject nart_level;
        for (index = NIL, index = ZERO_INTEGER; index.numL($partition_max_nart_complexity$.getDynamicValue(thread)); index = add(index, ONE_INTEGER)) {
            nart_level = add(index, ONE_INTEGER);
            dump_partition_nart_shells_at_level(nart_level, stream);
        }
        return NIL;
    }

    public static final SubLObject dump_partition_nart_shells_at_level_alt(SubLObject nart_level, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.dump_partition_section_marker(stream);
            {
                SubLObject total = com.cyc.cycjava.cycl.partitions.partition_nart_level_count(nart_level);
                cfasl_output(total, stream);
                {
                    SubLObject message = cconcatenate($str_alt71$partition_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(nart_level), $str_alt72$_NART_shells });
                    if (NIL != com.cyc.cycjava.cycl.partitions.large_partitionP()) {
                        {
                            SubLObject idx = nart_handles.do_narts_table();
                            SubLObject mess = cconcatenate($str_alt73$_large__, format_nil.format_nil_a_no_copy(message));
                            SubLObject total_24 = id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            SubLTrampolineFile.checkType(mess, STRINGP);
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
                                    noting_percent_progress_preamble(mess);
                                    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                        {
                                            SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                            SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                            SubLObject nart = NIL;
                                            while (NIL != id) {
                                                nart = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                if (NIL != do_id_index_id_and_object_validP(id, nart, $SKIP)) {
                                                    note_percent_progress(sofar, total_24);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    if (NIL != gethash_without_values(nart, $partition_nart_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                                        if (function_terms.term_functional_complexity(nart).numE(nart_level)) {
                                                            com.cyc.cycjava.cycl.partitions.dump_partition_nart_shell(nart, stream);
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
                        }
                    } else {
                        {
                            SubLObject table_var = $partition_nart_hash$.getDynamicValue(thread);
                            $progress_note$.setDynamicValue(message, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject nart = NIL;
                                        SubLObject value = NIL;
                                        {
                                            final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                            try {
                                                while (iteratorHasNext(cdohash_iterator)) {
                                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                    nart = getEntryKey(cdohash_entry);
                                                    value = getEntryValue(cdohash_entry);
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (function_terms.term_functional_complexity(nart).numE(nart_level)) {
                                                        com.cyc.cycjava.cycl.partitions.dump_partition_nart_shell(nart, stream);
                                                    }
                                                } 
                                            } finally {
                                                releaseEntrySetIterator(cdohash_iterator);
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
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject dump_partition_nart_shells_at_level(final SubLObject nart_level, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = partition_nart_level_count(nart_level);
        cfasl_output(total, stream);
        final SubLObject message = cconcatenate($$$partition_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(nart_level), $$$_NART_shells });
        if (NIL != large_partitionP()) {
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = cconcatenate($str87$_large__, format_nil.format_nil_a_no_copy(message));
            final SubLObject total_$45 = id_index_count(idx);
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
                    final SubLObject idx_$46 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$46, $SKIP)) {
                        final SubLObject idx_$47 = idx_$46;
                        if (NIL == id_index_dense_objects_empty_p(idx_$47, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$47);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                nart = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(nart)) {
                                        nart = $SKIP;
                                    }
                                    if ((NIL != gethash_without_values(nart, $partition_nart_hash$.getDynamicValue(thread), UNPROVIDED)) && function_terms.term_functional_complexity(nart).numE(nart_level)) {
                                        dump_partition_nart_shell(nart, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$45);
                                }
                            }
                        }
                        final SubLObject idx_$48 = idx_$46;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$48)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$48);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$48);
                            final SubLObject end_id = id_index_next_id(idx_$48);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                    if ((NIL != gethash_without_values(nart2, $partition_nart_hash$.getDynamicValue(thread), UNPROVIDED)) && function_terms.term_functional_complexity(nart2).numE(nart_level)) {
                                        dump_partition_nart_shell(nart2, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$45);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject table_var = $partition_nart_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_5 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(message, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject nart3 = NIL;
                    SubLObject value = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            nart3 = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            if (function_terms.term_functional_complexity(nart3).numE(nart_level)) {
                                dump_partition_nart_shell(nart3, stream);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                $progress_sofar$.rebind(_prev_bind_8, thread);
                $progress_total$.rebind(_prev_bind_7, thread);
                $progress_start_time$.rebind(_prev_bind_6, thread);
                $progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject partition_nart_level_count_alt(SubLObject nart_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject cdohash_table = $partition_nart_hash$.getDynamicValue(thread);
                SubLObject key = NIL;
                SubLObject nart = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            nart = getEntryValue(cdohash_entry);
                            if (function_terms.term_functional_complexity(nart).numE(nart_level)) {
                                total = add(total, ONE_INTEGER);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return total;
            }
        }
    }

    public static SubLObject partition_nart_level_count(final SubLObject nart_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject cdohash_table = $partition_nart_hash$.getDynamicValue(thread);
        SubLObject key = NIL;
        SubLObject nart = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                nart = getEntryValue(cdohash_entry);
                if (function_terms.term_functional_complexity(nart).numE(nart_level)) {
                    total = add(total, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    public static final SubLObject dump_partition_nart_shell_alt(SubLObject nart, SubLObject stream) {
        cfasl_output(nart_handles.nart_id(nart), stream);
        cfasl_output(narts_high.nart_hl_formula(nart), stream);
        cfasl_output(com.cyc.cycjava.cycl.partitions.partition_scope_term_p(nart), stream);
        return NIL;
    }

    public static SubLObject dump_partition_nart_shell(final SubLObject nart, final SubLObject stream) {
        cfasl_output(nart_handles.nart_id(nart), stream);
        cfasl_output(narts_high.nart_hl_formula(nart), stream);
        cfasl_output(partition_scope_term_p(nart), stream);
        return NIL;
    }

    public static final SubLObject dump_partition_assertions_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cfasl_output($partition_max_term_order$.getDynamicValue(thread), stream);
            {
                SubLObject term_order = NIL;
                for (term_order = ZERO_INTEGER; term_order.numL($partition_max_term_order$.getDynamicValue(thread)); term_order = add(term_order, ONE_INTEGER)) {
                    {
                        SubLObject meta_order = add(term_order, ONE_INTEGER);
                        if (meta_order.numE(ONE_INTEGER)) {
                            com.cyc.cycjava.cycl.partitions.dump_partition_simple_assertions(stream);
                        } else {
                            com.cyc.cycjava.cycl.partitions.dump_partition_meta_assertions(meta_order, stream);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject dump_partition_assertions(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_output($partition_max_term_order$.getDynamicValue(thread), stream);
        SubLObject term_order;
        SubLObject meta_order;
        for (term_order = NIL, term_order = ZERO_INTEGER; term_order.numL($partition_max_term_order$.getDynamicValue(thread)); term_order = add(term_order, ONE_INTEGER)) {
            meta_order = add(term_order, ONE_INTEGER);
            if (meta_order.numE(ONE_INTEGER)) {
                dump_partition_simple_assertions(stream);
            } else {
                dump_partition_meta_assertions(meta_order, stream);
            }
        }
        return NIL;
    }

    public static final SubLObject dump_partition_simple_assertions_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.dump_partition_section_marker(stream);
            {
                SubLObject total = hash_table_count($partition_assertion_hash$.getDynamicValue(thread));
                cfasl_output(total, stream);
                if (NIL != com.cyc.cycjava.cycl.partitions.large_partitionP()) {
                    {
                        SubLObject idx = assertion_handles.do_assertions_table();
                        SubLObject total_25 = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType($str_alt74$_large__partition_assertions, STRINGP);
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
                                noting_percent_progress_preamble($str_alt74$_large__partition_assertions);
                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject assertion = NIL;
                                        while (NIL != id) {
                                            assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                note_percent_progress(sofar, total_25);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if (NIL != gethash_without_values(assertion, $partition_assertion_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                                    com.cyc.cycjava.cycl.partitions.dump_partition_assertion(assertion, stream);
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
                    }
                } else {
                    {
                        SubLObject table_var = $partition_assertion_hash$.getDynamicValue(thread);
                        $progress_note$.setDynamicValue($$$partition_assertions, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject assertion = NIL;
                                    SubLObject value = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                assertion = getEntryKey(cdohash_entry);
                                                value = getEntryValue(cdohash_entry);
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                com.cyc.cycjava.cycl.partitions.dump_partition_assertion(assertion, stream);
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
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
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject dump_partition_simple_assertions(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = hash_table_count($partition_assertion_hash$.getDynamicValue(thread));
        cfasl_output(total, stream);
        if (NIL != large_partitionP()) {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = $str88$_large__partition_assertions;
            final SubLObject total_$51 = id_index_count(idx);
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
                    final SubLObject idx_$52 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$52, $SKIP)) {
                        final SubLObject idx_$53 = idx_$52;
                        if (NIL == id_index_dense_objects_empty_p(idx_$53, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$53);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                a_handle = aref(vector_var, a_id);
                                if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(a_handle)) {
                                        a_handle = $SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (NIL != gethash_without_values(assertion, $partition_assertion_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                        dump_partition_assertion(assertion, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$51);
                                }
                            }
                        }
                        final SubLObject idx_$54 = idx_$52;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$54)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$54);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$54);
                            final SubLObject end_id = id_index_next_id(idx_$54);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (NIL != gethash_without_values(assertion2, $partition_assertion_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                        dump_partition_assertion(assertion2, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$51);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject table_var = $partition_assertion_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_5 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$partition_assertions, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject assertion3 = NIL;
                    SubLObject value = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            assertion3 = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            dump_partition_assertion(assertion3, stream);
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                $progress_sofar$.rebind(_prev_bind_8, thread);
                $progress_total$.rebind(_prev_bind_7, thread);
                $progress_start_time$.rebind(_prev_bind_6, thread);
                $progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject dump_partition_meta_assertions_alt(SubLObject meta_order, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.dump_partition_section_marker(stream);
            {
                SubLObject total = com.cyc.cycjava.cycl.partitions.partition_meta_assertion_order_count(meta_order);
                cfasl_output(total, stream);
                {
                    SubLObject message = cconcatenate($str_alt76$partition_order_, new SubLObject[]{ format_nil.format_nil_s_no_copy(meta_order), $str_alt77$_meta_assertions });
                    SubLObject table_var = $partition_meta_assertion_hash$.getDynamicValue(thread);
                    $progress_note$.setDynamicValue(message, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject key = NIL;
                                SubLObject assertion = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            key = getEntryKey(cdohash_entry);
                                            assertion = getEntryValue(cdohash_entry);
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if (kb_utilities.term_order(assertion).numE(meta_order)) {
                                                com.cyc.cycjava.cycl.partitions.dump_partition_assertion(assertion, stream);
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
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
                }
            }
            return NIL;
        }
    }

    public static SubLObject dump_partition_meta_assertions(final SubLObject meta_order, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = partition_meta_assertion_order_count(meta_order);
        cfasl_output(total, stream);
        final SubLObject message = cconcatenate($$$partition_order_, new SubLObject[]{ format_nil.format_nil_s_no_copy(meta_order), $$$_meta_assertions });
        final SubLObject table_var = $partition_meta_assertion_hash$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(message, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(hash_table_count(table_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject key = NIL;
                SubLObject assertion = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        assertion = getEntryValue(cdohash_entry);
                        if (kb_utilities.term_order(assertion).numE(meta_order)) {
                            dump_partition_assertion(assertion, stream);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
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

    public static final SubLObject partition_meta_assertion_order_count_alt(SubLObject meta_order) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject cdohash_table = $partition_meta_assertion_hash$.getDynamicValue(thread);
                SubLObject key = NIL;
                SubLObject assertion = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            assertion = getEntryValue(cdohash_entry);
                            if (kb_utilities.term_order(assertion).numE(meta_order)) {
                                total = add(total, ONE_INTEGER);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return total;
            }
        }
    }

    public static SubLObject partition_meta_assertion_order_count(final SubLObject meta_order) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject cdohash_table = $partition_meta_assertion_hash$.getDynamicValue(thread);
        SubLObject key = NIL;
        SubLObject assertion = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                assertion = getEntryValue(cdohash_entry);
                if (kb_utilities.term_order(assertion).numE(meta_order)) {
                    total = add(total, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    public static final SubLObject dump_partition_assertion_alt(SubLObject assertion, SubLObject stream) {
        cfasl_output(assertion_handles.assertion_id(assertion), stream);
        cfasl_output(com.cyc.cycjava.cycl.partitions.partition_scope_term_p(assertion), stream);
        cfasl_output(assertion_cnf(assertion), stream);
        cfasl_output(assertion_mt(assertion), stream);
        cfasl_output(assertion_direction(assertion), stream);
        cfasl_output(assertion_variable_names(assertion), stream);
        return NIL;
    }

    public static SubLObject dump_partition_assertion(final SubLObject assertion, final SubLObject stream) {
        cfasl_output(assertion_handles.assertion_id(assertion), stream);
        cfasl_output(partition_scope_term_p(assertion), stream);
        cfasl_output(assertions_high.assertion_cnf(assertion), stream);
        cfasl_output(assertions_high.assertion_mt(assertion), stream);
        cfasl_output(assertions_high.assertion_direction(assertion), stream);
        cfasl_output(assertions_high.assertion_variable_names(assertion), stream);
        return NIL;
    }

    public static final SubLObject dump_partition_kb_hl_supports_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cfasl_output($partition_max_kb_hl_support_order$.getDynamicValue(thread), stream);
            {
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; index.numL($partition_max_kb_hl_support_order$.getDynamicValue(thread)); index = add(index, ONE_INTEGER)) {
                    {
                        SubLObject kb_hl_support_level = add(ONE_INTEGER, index);
                        com.cyc.cycjava.cycl.partitions.dump_partition_kb_hl_supports_at_level(kb_hl_support_level, stream);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject dump_partition_kb_hl_supports(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_output($partition_max_kb_hl_support_order$.getDynamicValue(thread), stream);
        SubLObject index;
        SubLObject kb_hl_support_level;
        for (index = NIL, index = ZERO_INTEGER; index.numL($partition_max_kb_hl_support_order$.getDynamicValue(thread)); index = add(index, ONE_INTEGER)) {
            kb_hl_support_level = add(ONE_INTEGER, index);
            dump_partition_kb_hl_supports_at_level(kb_hl_support_level, stream);
        }
        return NIL;
    }

    public static final SubLObject dump_partition_kb_hl_supports_at_level_alt(SubLObject level, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.dump_partition_section_marker(stream);
            {
                SubLObject total = com.cyc.cycjava.cycl.partitions.partition_kb_hl_support_level_count(level);
                cfasl_output(total, stream);
                {
                    SubLObject message = cconcatenate($str_alt71$partition_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(level), $str_alt78$_KB_HL_supports });
                    if (NIL != com.cyc.cycjava.cycl.partitions.large_partitionP()) {
                        {
                            SubLObject idx = kb_hl_supports.do_kb_hl_supports_table();
                            SubLObject mess = cconcatenate($str_alt73$_large__, format_nil.format_nil_a_no_copy(message));
                            SubLObject total_26 = id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            SubLTrampolineFile.checkType(mess, STRINGP);
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
                                    noting_percent_progress_preamble(mess);
                                    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                        {
                                            SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                            SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                            SubLObject kb_hl_support = NIL;
                                            while (NIL != id) {
                                                kb_hl_support = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                if (NIL != do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                                    note_percent_progress(sofar, total_26);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    if (NIL != gethash_without_values(kb_hl_support, $partition_kb_hl_support_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                                        if (com.cyc.cycjava.cycl.partitions.partition_kb_hl_support_order(kb_hl_support).numE(level)) {
                                                            com.cyc.cycjava.cycl.partitions.dump_partition_kb_hl_support(kb_hl_support, stream);
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
                        }
                    } else {
                        {
                            SubLObject table_var = $partition_kb_hl_support_hash$.getDynamicValue(thread);
                            $progress_note$.setDynamicValue(message, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject kb_hl_support = NIL;
                                        SubLObject value = NIL;
                                        {
                                            final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                            try {
                                                while (iteratorHasNext(cdohash_iterator)) {
                                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                    kb_hl_support = getEntryKey(cdohash_entry);
                                                    value = getEntryValue(cdohash_entry);
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (com.cyc.cycjava.cycl.partitions.partition_kb_hl_support_order(kb_hl_support).numE(level)) {
                                                        com.cyc.cycjava.cycl.partitions.dump_partition_kb_hl_support(kb_hl_support, stream);
                                                    }
                                                } 
                                            } finally {
                                                releaseEntrySetIterator(cdohash_iterator);
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
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject dump_partition_kb_hl_supports_at_level(final SubLObject level, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = partition_kb_hl_support_level_count(level);
        cfasl_output(total, stream);
        final SubLObject message = cconcatenate($$$partition_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(level), $$$_KB_HL_supports });
        if (NIL != large_partitionP()) {
            final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
            final SubLObject mess = cconcatenate($str87$_large__, format_nil.format_nil_a_no_copy(message));
            final SubLObject total_$58 = id_index_count(idx);
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
                    final SubLObject idx_$59 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$59, $SKIP)) {
                        final SubLObject idx_$60 = idx_$59;
                        if (NIL == id_index_dense_objects_empty_p(idx_$60, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$60);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject s_id;
                            SubLObject s_handle;
                            SubLObject kb_hl_support;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                s_handle = aref(vector_var, s_id);
                                if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(s_handle)) {
                                        s_handle = $SKIP;
                                    }
                                    kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                    if ((NIL != gethash_without_values(kb_hl_support, $partition_kb_hl_support_hash$.getDynamicValue(thread), UNPROVIDED)) && partition_kb_hl_support_order(kb_hl_support).numE(level)) {
                                        dump_partition_kb_hl_support(kb_hl_support, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$58);
                                }
                            }
                        }
                        final SubLObject idx_$61 = idx_$59;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$61)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$61);
                            SubLObject s_id2 = id_index_sparse_id_threshold(idx_$61);
                            final SubLObject end_id = id_index_next_id(idx_$61);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (s_id2.numL(end_id)) {
                                final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
                                    final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                    if ((NIL != gethash_without_values(kb_hl_support2, $partition_kb_hl_support_hash$.getDynamicValue(thread), UNPROVIDED)) && partition_kb_hl_support_order(kb_hl_support2).numE(level)) {
                                        dump_partition_kb_hl_support(kb_hl_support2, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$58);
                                }
                                s_id2 = add(s_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject table_var = $partition_kb_hl_support_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_5 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(message, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject kb_hl_support3 = NIL;
                    SubLObject value = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            kb_hl_support3 = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            if (partition_kb_hl_support_order(kb_hl_support3).numE(level)) {
                                dump_partition_kb_hl_support(kb_hl_support3, stream);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                $progress_sofar$.rebind(_prev_bind_8, thread);
                $progress_total$.rebind(_prev_bind_7, thread);
                $progress_start_time$.rebind(_prev_bind_6, thread);
                $progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject partition_kb_hl_support_level_count_alt(SubLObject level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject cdohash_table = $partition_kb_hl_support_hash$.getDynamicValue(thread);
                SubLObject key = NIL;
                SubLObject kb_hl_support = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            kb_hl_support = getEntryValue(cdohash_entry);
                            if (com.cyc.cycjava.cycl.partitions.partition_kb_hl_support_order(kb_hl_support).numE(level)) {
                                total = add(total, ONE_INTEGER);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return total;
            }
        }
    }

    public static SubLObject partition_kb_hl_support_level_count(final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject cdohash_table = $partition_kb_hl_support_hash$.getDynamicValue(thread);
        SubLObject key = NIL;
        SubLObject kb_hl_support = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                kb_hl_support = getEntryValue(cdohash_entry);
                if (partition_kb_hl_support_order(kb_hl_support).numE(level)) {
                    total = add(total, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    public static final SubLObject dump_partition_kb_hl_support_alt(SubLObject kb_hl_support, SubLObject stream) {
        {
            SubLObject id = kb_hl_supports.kb_hl_support_id(kb_hl_support);
            SubLObject scopeP = com.cyc.cycjava.cycl.partitions.partition_scope_term_p(kb_hl_support);
            SubLObject hl_support = kb_hl_supports.kb_hl_support_hl_support(kb_hl_support);
            SubLObject justification = kb_hl_supports.kb_hl_support_justification(kb_hl_support);
            cfasl_output(id, stream);
            cfasl_output(scopeP, stream);
            cfasl_output(hl_support, stream);
            cfasl_output(justification, stream);
        }
        return NIL;
    }

    public static SubLObject dump_partition_kb_hl_support(final SubLObject kb_hl_support, final SubLObject stream) {
        final SubLObject id = kb_hl_support_handles.kb_hl_support_id(kb_hl_support);
        final SubLObject scopeP = partition_scope_term_p(kb_hl_support);
        final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
        final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
        cfasl_output(id, stream);
        cfasl_output(scopeP, stream);
        cfasl_output(hl_support, stream);
        cfasl_output(justification, stream);
        return NIL;
    }

    public static final SubLObject dump_partition_arguments_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.dump_partition_section_marker(stream);
            {
                SubLObject total = hash_table_count($partition_argument_hash$.getDynamicValue(thread));
                cfasl_output(total, stream);
                if (NIL != com.cyc.cycjava.cycl.partitions.large_partitionP()) {
                    {
                        SubLObject idx = assertion_handles.do_assertions_table();
                        SubLObject total_27 = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType($str_alt79$_large__partition_beliefs, STRINGP);
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
                                noting_percent_progress_preamble($str_alt79$_large__partition_beliefs);
                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject assertion = NIL;
                                        while (NIL != id) {
                                            assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                note_percent_progress(sofar, total_27);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if (NIL != gethash_without_values(assertion, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                                    com.cyc.cycjava.cycl.partitions.dump_partition_argument(assertion, stream);
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
                    }
                    {
                        SubLObject idx = deduction_handles.do_deductions_table();
                        SubLObject total_28 = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType($str_alt80$_large__partition_deductions, STRINGP);
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
                                noting_percent_progress_preamble($str_alt80$_large__partition_deductions);
                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject deduction = NIL;
                                        while (NIL != id) {
                                            deduction = do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, deduction, $SKIP)) {
                                                note_percent_progress(sofar, total_28);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if (NIL != gethash_without_values(deduction, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                                    com.cyc.cycjava.cycl.partitions.dump_partition_argument(deduction, stream);
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
                    }
                    {
                        SubLObject idx = do_constants_table();
                        SubLObject total_29 = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType($str_alt81$_large__partition_bookkeeping_inf, STRINGP);
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
                                noting_percent_progress_preamble($str_alt81$_large__partition_bookkeeping_inf);
                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject constant = NIL;
                                        while (NIL != id) {
                                            constant = do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
                                                note_percent_progress(sofar, total_29);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if (NIL != gethash_without_values(constant, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                                    com.cyc.cycjava.cycl.partitions.dump_partition_argument(constant, stream);
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
                    }
                } else {
                    {
                        SubLObject table_var = $partition_argument_hash$.getDynamicValue(thread);
                        $progress_note$.setDynamicValue($$$partition_arguments, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject v_object = NIL;
                                    SubLObject value = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                v_object = getEntryKey(cdohash_entry);
                                                value = getEntryValue(cdohash_entry);
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                com.cyc.cycjava.cycl.partitions.dump_partition_argument(v_object, stream);
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
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
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject dump_partition_arguments(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = hash_table_count($partition_argument_hash$.getDynamicValue(thread));
        cfasl_output(total, stream);
        if (NIL != large_partitionP()) {
            SubLObject idx = assertion_handles.do_assertions_table();
            SubLObject mess = $str93$_large__partition_beliefs;
            final SubLObject total_$64 = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$65 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$65, $SKIP)) {
                        final SubLObject idx_$66 = idx_$65;
                        if (NIL == id_index_dense_objects_empty_p(idx_$66, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$66);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                a_handle = aref(vector_var, a_id);
                                if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(a_handle)) {
                                        a_handle = $SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (NIL != gethash_without_values(assertion, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                        dump_partition_argument(assertion, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$64);
                                }
                            }
                        }
                        final SubLObject idx_$67 = idx_$65;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$67)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$67);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$67);
                            final SubLObject end_id = id_index_next_id(idx_$67);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (NIL != gethash_without_values(assertion2, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                        dump_partition_argument(assertion2, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$64);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            idx = deduction_handles.do_deductions_table();
            mess = $str94$_large__partition_deductions;
            final SubLObject total_$65 = id_index_count(idx);
            sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$68 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$68, $SKIP)) {
                        final SubLObject idx_$69 = idx_$68;
                        if (NIL == id_index_dense_objects_empty_p(idx_$69, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$69);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject d_id;
                            SubLObject d_handle;
                            SubLObject deduction;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                d_handle = aref(vector_var, d_id);
                                if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(d_handle)) {
                                        d_handle = $SKIP;
                                    }
                                    deduction = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                    if (NIL != gethash_without_values(deduction, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                        dump_partition_argument(deduction, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$65);
                                }
                            }
                        }
                        final SubLObject idx_$70 = idx_$68;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$70)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$70);
                            SubLObject d_id2 = id_index_sparse_id_threshold(idx_$70);
                            final SubLObject end_id = id_index_next_id(idx_$70);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (d_id2.numL(end_id)) {
                                final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                    final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                    if (NIL != gethash_without_values(deduction2, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                        dump_partition_argument(deduction2, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$65);
                                }
                                d_id2 = add(d_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            idx = do_constants_table();
            mess = $str95$_large__partition_bookkeeping_inf;
            final SubLObject total_$66 = id_index_count(idx);
            sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$71 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$71, $SKIP)) {
                        final SubLObject idx_$72 = idx_$71;
                        if (NIL == id_index_dense_objects_empty_p(idx_$72, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$72);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                constant = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(constant)) {
                                        constant = $SKIP;
                                    }
                                    if (NIL != gethash_without_values(constant, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                        dump_partition_argument(constant, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$66);
                                }
                            }
                        }
                        final SubLObject idx_$73 = idx_$71;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$73)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$73);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$73);
                            final SubLObject end_id = id_index_next_id(idx_$73);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                    if (NIL != gethash_without_values(constant2, $partition_argument_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                        dump_partition_argument(constant2, stream);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$66);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject table_var = $partition_argument_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_5 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$partition_arguments, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject v_object = NIL;
                    SubLObject value = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            v_object = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            dump_partition_argument(v_object, stream);
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                $progress_sofar$.rebind(_prev_bind_8, thread);
                $progress_total$.rebind(_prev_bind_7, thread);
                $progress_start_time$.rebind(_prev_bind_6, thread);
                $progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject dump_partition_argument_alt(SubLObject v_object, SubLObject stream) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
            com.cyc.cycjava.cycl.partitions.dump_partition_beliefs(v_object, stream);
        } else {
            if (NIL != deduction_handles.deduction_p(v_object)) {
                com.cyc.cycjava.cycl.partitions.dump_partition_deduction(v_object, stream);
            } else {
                if (NIL != constant_p(v_object)) {
                    com.cyc.cycjava.cycl.partitions.dump_partition_bookkeeping_assertions_for_term(v_object, stream);
                } else {
                    Errors.error($str_alt83$Unknown_argument_object__S, v_object);
                }
            }
        }
        return NIL;
    }

    public static SubLObject dump_partition_argument(final SubLObject v_object, final SubLObject stream) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
            dump_partition_beliefs(v_object, stream);
        } else
            if (NIL != deduction_handles.deduction_p(v_object)) {
                dump_partition_deduction(v_object, stream);
            } else
                if (NIL != constant_p(v_object)) {
                    dump_partition_bookkeeping_assertions_for_term(v_object, stream);
                } else {
                    Errors.error($str97$Unknown_argument_object__S, v_object);
                }


        return NIL;
    }

    public static final SubLObject dump_partition_deduction_alt(SubLObject deduction, SubLObject stream) {
        cfasl_output(deduction_handles.deduction_id(deduction), stream);
        cfasl_output(arguments.argument_tv(deduction), stream);
        cfasl_output(deductions_high.deduction_assertion(deduction), stream);
        cfasl_output(deductions_high.deduction_supports(deduction), stream);
        return NIL;
    }

    public static SubLObject dump_partition_deduction(final SubLObject deduction, final SubLObject stream) {
        cfasl_output(deduction_handles.deduction_id(deduction), stream);
        cfasl_output(arguments.argument_tv(deduction), stream);
        cfasl_output(deductions_high.deduction_supported_object(deduction), stream);
        cfasl_output(deductions_high.deduction_supports(deduction), stream);
        return NIL;
    }

    public static final SubLObject dump_partition_beliefs_alt(SubLObject assertion, SubLObject stream) {
        cfasl_output(NIL, stream);
        cfasl_output(assertion, stream);
        {
            SubLObject v_arguments = assertion_arguments(assertion);
            SubLObject total_beliefs = count_if(symbol_function(BELIEF_P), v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cfasl_output(total_beliefs, stream);
            {
                SubLObject cdolist_list_var = v_arguments;
                SubLObject argument = NIL;
                for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                    if (NIL != arguments.belief_p(argument)) {
                        com.cyc.cycjava.cycl.partitions.dump_partition_belief(argument, assertion, stream);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject dump_partition_beliefs(final SubLObject assertion, final SubLObject stream) {
        cfasl_output(NIL, stream);
        cfasl_output(assertion, stream);
        final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        final SubLObject total_beliefs = count_if(symbol_function(BELIEF_P), v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cfasl_output(total_beliefs, stream);
        SubLObject cdolist_list_var = v_arguments;
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != arguments.belief_p(argument)) {
                dump_partition_belief(argument, assertion, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject dump_partition_belief_alt(SubLObject argument, SubLObject assertion, SubLObject stream) {
        if (NIL != arguments.asserted_argument_p(argument)) {
            com.cyc.cycjava.cycl.partitions.dump_partition_asserted_argument(argument, assertion, stream);
        } else {
            Errors.error($str_alt84$Unable_to_dump_belief__S, argument);
        }
        return NIL;
    }

    public static SubLObject dump_partition_belief(final SubLObject argument, final SubLObject assertion, final SubLObject stream) {
        if (NIL != arguments.asserted_argument_p(argument)) {
            dump_partition_asserted_argument(argument, assertion, stream);
        } else {
            Errors.error($str98$Unable_to_dump_belief__S, argument);
        }
        return NIL;
    }

    public static final SubLObject dump_partition_asserted_argument_alt(SubLObject argument, SubLObject assertion, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cfasl_output($partition_asserted_argument_type_flag$.getDynamicValue(thread), stream);
            cfasl_output(arguments.argument_tv(argument), stream);
            cfasl_output(assertions_low.assertion_assert_info(assertion), stream);
            return NIL;
        }
    }

    public static SubLObject dump_partition_asserted_argument(final SubLObject argument, final SubLObject assertion, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_output($partition_asserted_argument_type_flag$.getDynamicValue(thread), stream);
        cfasl_output(arguments.argument_tv(argument), stream);
        cfasl_output(assertions_low.assertion_assert_info(assertion), stream);
        return NIL;
    }

    /**
     * Format:
     * # of bookkeeping assertions on TERM
     * 1st bookkeeping assertion, in 'assertible' form: (cnf mt strength direction variable-map)
     * 2nd bookkeeping assertion, in 'assertible' form
     * etc.
     */
    @LispMethod(comment = "Format:\r\n# of bookkeeping assertions on TERM\r\n1st bookkeeping assertion, in \'assertible\' form: (cnf mt strength direction variable-map)\r\n2nd bookkeeping assertion, in \'assertible\' form\r\netc.\nFormat:\n# of bookkeeping assertions on TERM\n1st bookkeeping assertion, in \'assertible\' form: (cnf mt strength direction variable-map)\n2nd bookkeeping assertion, in \'assertible\' form\netc.")
    public static final SubLObject dump_partition_bookkeeping_assertions_for_term_alt(SubLObject v_term, SubLObject stream) {
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        {
            SubLObject assertibles = bookkeeping_store.bookkeeping_assertibles_on_term(v_term);
            SubLObject how_many = length(assertibles);
            cfasl_output(how_many, stream);
            {
                SubLObject cdolist_list_var = assertibles;
                SubLObject assertible = NIL;
                for (assertible = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertible = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.partitions.dump_partition_assertible(assertible, stream);
                }
            }
        }
        return NIL;
    }

    /**
     * Format:
     * # of bookkeeping assertions on TERM
     * 1st bookkeeping assertion, in 'assertible' form: (cnf mt strength direction variable-map)
     * 2nd bookkeeping assertion, in 'assertible' form
     * etc.
     */
    @LispMethod(comment = "Format:\r\n# of bookkeeping assertions on TERM\r\n1st bookkeeping assertion, in \'assertible\' form: (cnf mt strength direction variable-map)\r\n2nd bookkeeping assertion, in \'assertible\' form\r\netc.\nFormat:\n# of bookkeeping assertions on TERM\n1st bookkeeping assertion, in \'assertible\' form: (cnf mt strength direction variable-map)\n2nd bookkeeping assertion, in \'assertible\' form\netc.")
    public static SubLObject dump_partition_bookkeeping_assertions_for_term(final SubLObject v_term, final SubLObject stream) {
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        final SubLObject assertibles = bookkeeping_store.bookkeeping_assertibles_on_term(v_term);
        final SubLObject how_many = length(assertibles);
        cfasl_output(how_many, stream);
        SubLObject cdolist_list_var = assertibles;
        SubLObject assertible = NIL;
        assertible = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dump_partition_assertible(assertible, stream);
            cdolist_list_var = cdolist_list_var.rest();
            assertible = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject dump_partition_assertible_alt(SubLObject assertible, SubLObject stream) {
        {
            SubLObject datum = assertible;
            SubLObject current = datum;
            SubLObject cnf = NIL;
            SubLObject mt = NIL;
            SubLObject strength = NIL;
            SubLObject direction = NIL;
            SubLObject variable_map = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt85);
            cnf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt85);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt85);
            strength = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt85);
            direction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt85);
            variable_map = current.first();
            current = current.rest();
            if (NIL == current) {
                cfasl_output(cnf, stream);
                cfasl_output(mt, stream);
                cfasl_output(strength, stream);
                cfasl_output(direction, stream);
                cfasl_output(variable_map, stream);
            } else {
                cdestructuring_bind_error(datum, $list_alt85);
            }
        }
        return NIL;
    }

    public static SubLObject dump_partition_assertible(final SubLObject assertible, final SubLObject stream) {
        SubLObject cnf = NIL;
        SubLObject mt = NIL;
        SubLObject strength = NIL;
        SubLObject direction = NIL;
        SubLObject variable_map = NIL;
        destructuring_bind_must_consp(assertible, assertible, $list99);
        cnf = assertible.first();
        SubLObject current = assertible.rest();
        destructuring_bind_must_consp(current, assertible, $list99);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, assertible, $list99);
        strength = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, assertible, $list99);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, assertible, $list99);
        variable_map = current.first();
        current = current.rest();
        if (NIL == current) {
            cfasl_output(cnf, stream);
            cfasl_output(mt, stream);
            cfasl_output(strength, stream);
            cfasl_output(direction, stream);
            cfasl_output(variable_map, stream);
        } else {
            cdestructuring_bind_error(assertible, $list99);
        }
        return NIL;
    }

    public static SubLObject load_entire_kb_partition(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $partition_entire_kb_loadP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = after_adding.$after_addings_disabledP$.currentBinding(thread);
        try {
            $partition_entire_kb_loadP$.bind(T, thread);
            after_adding.$after_addings_disabledP$.bind(T, thread);
            result = load_partition_clean(filename, UNPROVIDED);
        } finally {
            after_adding.$after_addings_disabledP$.rebind(_prev_bind_2, thread);
            $partition_entire_kb_loadP$.rebind(_prev_bind_0, thread);
        }
        clear_partition_loader_state();
        return result;
    }

    /**
     * Load a single partition, then clean up non-scoped constants and the assertions using them.
     */
    @LispMethod(comment = "Load a single partition, then clean up non-scoped constants and the assertions using them.")
    public static final SubLObject load_partition_clean(SubLObject partition_filename) {
        com.cyc.cycjava.cycl.partitions.load_partition(partition_filename, UNPROVIDED);
        return com.cyc.cycjava.cycl.partitions.partition_load_kb_cleanup();
    }

    public static SubLObject load_partition_clean(final SubLObject partition_filename, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
        }
        load_partition(partition_filename, reset_sbhl_linksP);
        return partition_load_kb_cleanup();
    }

    /**
     * Load a single partition, then clean up non-scoped constants and the assertions using them.
     */
    @LispMethod(comment = "Load a single partition, then clean up non-scoped constants and the assertions using them.")
    public static final SubLObject load_partitions_clean_alt(SubLObject partition_filename_list) {
        {
            SubLObject cdolist_list_var = partition_filename_list;
            SubLObject partition_filename = NIL;
            for (partition_filename = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , partition_filename = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.partitions.load_partition(partition_filename, UNPROVIDED);
            }
        }
        return com.cyc.cycjava.cycl.partitions.partition_load_kb_cleanup();
    }

    /**
     * Load a single partition, then clean up non-scoped constants and the assertions using them.
     */
    @LispMethod(comment = "Load a single partition, then clean up non-scoped constants and the assertions using them.")
    public static SubLObject load_partitions_clean(final SubLObject partition_filename_list) {
        SubLObject cdolist_list_var = partition_filename_list;
        SubLObject partition_filename = NIL;
        partition_filename = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            load_partition(partition_filename, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            partition_filename = cdolist_list_var.first();
        } 
        return partition_load_kb_cleanup();
    }

    public static final SubLObject partition_load_kb_cleanup_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $load_partition_invalid_missing_terms$.currentBinding(thread);
                try {
                    $load_partition_invalid_missing_terms$.bind(keyhash.new_keyhash(com.cyc.cycjava.cycl.partitions.partition_invalid_missing_terms_count(), UNPROVIDED), thread);
                    {
                        SubLObject removed_constant_count = ZERO_INTEGER;
                        SubLObject removed_nart_count = ZERO_INTEGER;
                        SubLObject removed_assertion_count = ZERO_INTEGER;
                        format(T, $str_alt86$cleaning_up_after_partition_load_);
                        {
                            SubLObject _prev_bind_0_30 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                {
                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.partitions.gather_load_partition_missing_constants();
                                    SubLObject constant = NIL;
                                    for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                                        if (!kb_indexing.num_gaf_arg_index(constant, ONE_INTEGER, $$isa, UNPROVIDED).isPositive()) {
                                            com.cyc.cycjava.cycl.partitions.add_load_partition_invalid_missing_term(constant);
                                        }
                                    }
                                }
                                if ($load_partition_max_nart_complexity$.getDynamicValue(thread).isNumber()) {
                                    {
                                        SubLObject end_var = add($load_partition_max_nart_complexity$.getDynamicValue(thread), ONE_INTEGER);
                                        SubLObject complexity = NIL;
                                        for (complexity = ONE_INTEGER; !complexity.numGE(end_var); complexity = number_utilities.f_1X(complexity)) {
                                            {
                                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.partitions.gather_load_partition_missing_narts();
                                                SubLObject nart = NIL;
                                                for (nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nart = cdolist_list_var.first()) {
                                                    if ((complexity == function_terms.term_functional_complexity(nart)) && ((!kb_indexing.num_gaf_arg_index(nart, ONE_INTEGER, $$isa, UNPROVIDED).isPositive()) || (NIL != list_utilities.tree_find_if($sym88$LOAD_PARTITION_INVALID_MISSING_TERM_, narts_high.nart_hl_formula(nart), UNPROVIDED)))) {
                                                        com.cyc.cycjava.cycl.partitions.add_load_partition_invalid_missing_term(nart);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_30, thread);
                            }
                        }
                        {
                            SubLObject end_var = add($load_partition_max_term_order$.getDynamicValue(thread), TWO_INTEGER);
                            SubLObject term_order = NIL;
                            for (term_order = ONE_INTEGER; !term_order.numGE(end_var); term_order = number_utilities.f_1X(term_order)) {
                                {
                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.partitions.gather_load_partition_missing_assertions();
                                    SubLObject assertion = NIL;
                                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                        if ((term_order == kb_utilities.term_order(assertion)) && ((NIL != com.cyc.cycjava.cycl.partitions.load_partition_invalid_missing_termP(hlmt.hlmt_monad_mt(assertion_mt(assertion)))) || (NIL != list_utilities.tree_find_if($sym88$LOAD_PARTITION_INVALID_MISSING_TERM_, assertion_cnf(assertion), UNPROVIDED)))) {
                                            com.cyc.cycjava.cycl.partitions.add_load_partition_invalid_missing_term(assertion);
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.partitions.gather_load_partition_missing_assertions();
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                if (NIL != com.cyc.cycjava.cycl.partitions.load_partition_invalid_missing_termP(assertion)) {
                                    removed_assertion_count = add(removed_assertion_count, ONE_INTEGER);
                                    tms.tms_remove_assertion(assertion);
                                }
                            }
                        }
                        if ($load_partition_max_nart_complexity$.getDynamicValue(thread).isNumber()) {
                            {
                                SubLObject end_var = ZERO_INTEGER;
                                SubLObject complexity = NIL;
                                for (complexity = $load_partition_max_nart_complexity$.getDynamicValue(thread); !complexity.numLE(end_var); complexity = add(complexity, MINUS_ONE_INTEGER)) {
                                    {
                                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.partitions.gather_load_partition_missing_narts();
                                        SubLObject nart = NIL;
                                        for (nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nart = cdolist_list_var.first()) {
                                            if ((complexity == function_terms.term_functional_complexity(nart)) && (NIL != com.cyc.cycjava.cycl.partitions.load_partition_invalid_missing_termP(nart))) {
                                                removed_nart_count = add(removed_nart_count, ONE_INTEGER);
                                                narts_high.remove_nart(nart);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.partitions.gather_load_partition_missing_constants();
                            SubLObject constant = NIL;
                            for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                                if (NIL != com.cyc.cycjava.cycl.partitions.load_partition_invalid_missing_termP(constant)) {
                                    removed_constant_count = add(removed_constant_count, ONE_INTEGER);
                                    constants_high.remove_constant(constant);
                                }
                            }
                        }
                        format(T, $str_alt89$partition_load_KB_cleanup_removed);
                        format(T, $str_alt90$__A_constants__, removed_constant_count);
                        format(T, $str_alt91$__A_NARTs__, removed_nart_count);
                        format(T, $str_alt92$__A_assertions__, removed_assertion_count);
                    }
                } finally {
                    $load_partition_invalid_missing_terms$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject partition_load_kb_cleanup() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $load_partition_invalid_missing_terms$.currentBinding(thread);
        try {
            $load_partition_invalid_missing_terms$.bind(keyhash.new_keyhash(partition_invalid_missing_terms_count(), UNPROVIDED), thread);
            SubLObject removed_constant_count = ZERO_INTEGER;
            SubLObject removed_nart_count = ZERO_INTEGER;
            SubLObject removed_assertion_count = ZERO_INTEGER;
            format(T, $str100$cleaning_up_after_partition_load_);
            final SubLObject _prev_bind_0_$80 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject cdolist_list_var = gather_load_partition_missing_constants();
                SubLObject constant = NIL;
                constant = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (!kb_indexing.num_gaf_arg_index(constant, ONE_INTEGER, $$isa, UNPROVIDED).isPositive()) {
                        add_load_partition_invalid_missing_term(constant);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    constant = cdolist_list_var.first();
                } 
                if ($load_partition_max_nart_complexity$.getDynamicValue(thread).isNumber()) {
                    SubLObject end_var;
                    SubLObject complexity;
                    SubLObject cdolist_list_var2;
                    SubLObject nart;
                    for (end_var = add($load_partition_max_nart_complexity$.getDynamicValue(thread), ONE_INTEGER), complexity = NIL, complexity = ONE_INTEGER; !complexity.numGE(end_var); complexity = number_utilities.f_1X(complexity)) {
                        cdolist_list_var2 = gather_load_partition_missing_narts();
                        nart = NIL;
                        nart = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (complexity.eql(function_terms.term_functional_complexity(nart)) && ((!kb_indexing.num_gaf_arg_index(nart, ONE_INTEGER, $$isa, UNPROVIDED).isPositive()) || (NIL != list_utilities.tree_find_if($sym102$LOAD_PARTITION_INVALID_MISSING_TERM_, narts_high.nart_hl_formula(nart), UNPROVIDED)))) {
                                add_load_partition_invalid_missing_term(nart);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            nart = cdolist_list_var2.first();
                        } 
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$80, thread);
            }
            SubLObject cdolist_list_var;
            SubLObject end_var2;
            SubLObject term_order;
            SubLObject assertion;
            for (end_var2 = add($load_partition_max_term_order$.getDynamicValue(thread), TWO_INTEGER), term_order = NIL, term_order = ONE_INTEGER; !term_order.numGE(end_var2); term_order = number_utilities.f_1X(term_order)) {
                cdolist_list_var = gather_load_partition_missing_assertions();
                assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (term_order.eql(kb_utilities.term_order(assertion)) && ((NIL != load_partition_invalid_missing_termP(hlmt.hlmt_monad_mt(assertions_high.assertion_mt(assertion)))) || (NIL != list_utilities.tree_find_if($sym102$LOAD_PARTITION_INVALID_MISSING_TERM_, assertions_high.assertion_cnf(assertion), UNPROVIDED)))) {
                        add_load_partition_invalid_missing_term(assertion);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            }
            SubLObject cdolist_list_var3 = gather_load_partition_missing_assertions();
            SubLObject assertion2 = NIL;
            assertion2 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                if (NIL != load_partition_invalid_missing_termP(assertion2)) {
                    removed_assertion_count = add(removed_assertion_count, ONE_INTEGER);
                    tms.tms_remove_assertion(assertion2);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion2 = cdolist_list_var3.first();
            } 
            if ($load_partition_max_nart_complexity$.getDynamicValue(thread).isNumber()) {
                SubLObject complexity2;
                SubLObject nart2;
                for (end_var2 = ZERO_INTEGER, complexity2 = NIL, complexity2 = $load_partition_max_nart_complexity$.getDynamicValue(thread); !complexity2.numLE(end_var2); complexity2 = add(complexity2, MINUS_ONE_INTEGER)) {
                    cdolist_list_var = gather_load_partition_missing_narts();
                    nart2 = NIL;
                    nart2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (complexity2.eql(function_terms.term_functional_complexity(nart2)) && (NIL != load_partition_invalid_missing_termP(nart2))) {
                            removed_nart_count = add(removed_nart_count, ONE_INTEGER);
                            narts_high.remove_nart(nart2);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        nart2 = cdolist_list_var.first();
                    } 
                }
            }
            cdolist_list_var3 = gather_load_partition_missing_constants();
            SubLObject constant2 = NIL;
            constant2 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                if (NIL != load_partition_invalid_missing_termP(constant2)) {
                    removed_constant_count = add(removed_constant_count, ONE_INTEGER);
                    constants_high.remove_constant(constant2);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                constant2 = cdolist_list_var3.first();
            } 
            format(T, $str103$partition_load_KB_cleanup_removed);
            format(T, $str104$__A_constants__, removed_constant_count);
            format(T, $str105$__A_NARTs__, removed_nart_count);
            format(T, $str106$__A_assertions__, removed_assertion_count);
        } finally {
            $load_partition_invalid_missing_terms$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject partition_invalid_missing_terms_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return add(new SubLObject[]{ $load_partition_constants$.getDynamicValue(thread).isHashtable() ? ((SubLObject) (hash_table_count($load_partition_constants$.getDynamicValue(thread)))) : ZERO_INTEGER, $load_partition_narts$.getDynamicValue(thread).isHashtable() ? ((SubLObject) (hash_table_count($load_partition_narts$.getDynamicValue(thread)))) : ZERO_INTEGER, $load_partition_assertions$.getDynamicValue(thread).isHashtable() ? ((SubLObject) (hash_table_count($load_partition_assertions$.getDynamicValue(thread)))) : ZERO_INTEGER, $load_partition_kb_hl_supports$.getDynamicValue(thread).isHashtable() ? ((SubLObject) (hash_table_count($load_partition_kb_hl_supports$.getDynamicValue(thread)))) : ZERO_INTEGER });
        }
    }

    public static SubLObject partition_invalid_missing_terms_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return add(new SubLObject[]{ $load_partition_constants$.getDynamicValue(thread).isHashtable() ? hash_table_count($load_partition_constants$.getDynamicValue(thread)) : ZERO_INTEGER, $load_partition_narts$.getDynamicValue(thread).isHashtable() ? hash_table_count($load_partition_narts$.getDynamicValue(thread)) : ZERO_INTEGER, $load_partition_assertions$.getDynamicValue(thread).isHashtable() ? hash_table_count($load_partition_assertions$.getDynamicValue(thread)) : ZERO_INTEGER, $load_partition_kb_hl_supports$.getDynamicValue(thread).isHashtable() ? hash_table_count($load_partition_kb_hl_supports$.getDynamicValue(thread)) : ZERO_INTEGER });
    }

    public static final SubLObject load_partition_invalid_missing_termP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return keyhash.getkeyhash(v_term, $load_partition_invalid_missing_terms$.getDynamicValue(thread));
        }
    }

    public static SubLObject load_partition_invalid_missing_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.getkeyhash(v_term, $load_partition_invalid_missing_terms$.getDynamicValue(thread));
    }

    public static final SubLObject add_load_partition_invalid_missing_term_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            keyhash.setkeyhash(v_term, $load_partition_invalid_missing_terms$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject add_load_partition_invalid_missing_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        keyhash.setkeyhash(v_term, $load_partition_invalid_missing_terms$.getDynamicValue(thread));
        return NIL;
    }

    /**
     * Load a KB partition from FILENAME.
     * If RESET-SBHL-LINKS? is non-nil, the HL datastructures for the loaded
     * objects are reinitialized.  Return T.
     */
    @LispMethod(comment = "Load a KB partition from FILENAME.\r\nIf RESET-SBHL-LINKS? is non-nil, the HL datastructures for the loaded\r\nobjects are reinitialized.  Return T.\nLoad a KB partition from FILENAME.\nIf RESET-SBHL-LINKS? is non-nil, the HL datastructures for the loaded\nobjects are reinitialized.  Return T.")
    public static final SubLObject load_partition_alt(SubLObject filename, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject success = NIL;
                if (NIL != Filesys.probe_file(filename)) {
                    {
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_binary(filename, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt57$Unable_to_open__S, filename);
                            }
                            {
                                SubLObject stream_31 = stream;
                                if (ZERO_INTEGER.numE(file_length(stream_31))) {
                                    success = T;
                                } else {
                                    success = com.cyc.cycjava.cycl.partitions.load_partition_from_stream(stream_31, reset_sbhl_linksP);
                                }
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
                return success;
            }
        }
    }

    /**
     * Load a KB partition from FILENAME.
     * If RESET-SBHL-LINKS? is non-nil, the HL datastructures for the loaded
     * objects are reinitialized.  Return T.
     */
    @LispMethod(comment = "Load a KB partition from FILENAME.\r\nIf RESET-SBHL-LINKS? is non-nil, the HL datastructures for the loaded\r\nobjects are reinitialized.  Return T.\nLoad a KB partition from FILENAME.\nIf RESET-SBHL-LINKS? is non-nil, the HL datastructures for the loaded\nobjects are reinitialized.  Return T.")
    public static SubLObject load_partition(final SubLObject filename, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject success = NIL;
        if (NIL != Filesys.probe_file(filename)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str58$Unable_to_open__S, filename);
                }
                final SubLObject stream_$81 = stream;
                if (ZERO_INTEGER.numE(file_length(stream_$81))) {
                    success = T;
                } else {
                    success = load_partition_from_stream(stream_$81, reset_sbhl_linksP);
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
        }
        return success;
    }

    public static final SubLObject load_partition_from_stream_alt(SubLObject stream, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject success = NIL;
                SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(SIX_INTEGER);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                        {
                            SubLObject _prev_bind_0_32 = $bootstrapping_kbP$.currentBinding(thread);
                            SubLObject _prev_bind_1_33 = $within_assert$.currentBinding(thread);
                            SubLObject _prev_bind_2_34 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                            SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                            SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                            SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                            SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                            SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                            SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                            SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                            SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                            SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                            SubLObject _prev_bind_12 = wff_utilities.$check_arityP$.currentBinding(thread);
                            SubLObject _prev_bind_13 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
                            try {
                                $bootstrapping_kbP$.bind(T, thread);
                                $within_assert$.bind(NIL, thread);
                                wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                                at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                                wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                                czer_vars.$simplify_literalP$.bind(NIL, thread);
                                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                wff_vars.$validate_constantsP$.bind(NIL, thread);
                                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                wff_utilities.$check_arityP$.bind(NIL, thread);
                                cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
                                {
                                    SubLObject format = com.cyc.cycjava.cycl.partitions.load_partition_info(stream);
                                    {
                                        SubLObject _prev_bind_0_35 = $cfasl_common_symbols$.currentBinding(thread);
                                        try {
                                            $cfasl_common_symbols$.bind(NIL, thread);
                                            cfasl_set_common_symbols(com.cyc.cycjava.cycl.partitions.load_partition_special_objects(stream));
                                            {
                                                SubLObject _prev_bind_0_36 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
                                                SubLObject _prev_bind_1_37 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
                                                SubLObject _prev_bind_2_38 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
                                                SubLObject _prev_bind_3_39 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
                                                try {
                                                    api_control_vars.$cfasl_constant_handle_lookup_func$.bind(PARTITION_FIND_CONSTANT_BY_ID, thread);
                                                    api_control_vars.$cfasl_nart_handle_lookup_func$.bind(PARTITION_FIND_NART_BY_ID, thread);
                                                    api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(PARTITION_FIND_ASSERTION_BY_ID, thread);
                                                    api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(PARTITION_FIND_KB_HL_SUPPORT_BY_ID, thread);
                                                    com.cyc.cycjava.cycl.partitions.load_partition_constant_shells(stream);
                                                    com.cyc.cycjava.cycl.partitions.load_partition_nart_shells(stream);
                                                    com.cyc.cycjava.cycl.partitions.load_partition_assertions(stream);
                                                    if (NIL != com.cyc.cycjava.cycl.partitions.partition_formats_compatibleP($str_alt62$2_2, format)) {
                                                        com.cyc.cycjava.cycl.partitions.load_partition_kb_hl_supports(stream);
                                                    }
                                                    com.cyc.cycjava.cycl.partitions.load_partition_arguments(stream);
                                                    if (NIL != reset_sbhl_linksP) {
                                                        {
                                                            SubLObject constants = com.cyc.cycjava.cycl.partitions.gather_load_partition_scope_constants();
                                                            SubLObject narts = com.cyc.cycjava.cycl.partitions.gather_load_partition_scope_narts();
                                                            SubLObject v_forts = nconc(constants, narts);
                                                            sbhl_link_methods.sbhl_recompute_links_of_nodes(v_forts);
                                                        }
                                                    }
                                                    success = T;
                                                } finally {
                                                    api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_3_39, thread);
                                                    api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_2_38, thread);
                                                    api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_1_37, thread);
                                                    api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0_36, thread);
                                                }
                                            }
                                        } finally {
                                            $cfasl_common_symbols$.rebind(_prev_bind_0_35, thread);
                                        }
                                    }
                                }
                            } finally {
                                cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_13, thread);
                                wff_utilities.$check_arityP$.rebind(_prev_bind_12, thread);
                                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2_34, thread);
                                $within_assert$.rebind(_prev_bind_1_33, thread);
                                $bootstrapping_kbP$.rebind(_prev_bind_0_32, thread);
                            }
                        }
                        sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    } finally {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
                    }
                }
                return success;
            }
        }
    }

    public static SubLObject load_partition_from_stream(final SubLObject stream, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = NIL;
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(SIX_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                final SubLObject _prev_bind_0_$82 = $bootstrapping_kbP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$83 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                final SubLObject _prev_bind_2_$84 = $within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_13 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                final SubLObject _prev_bind_14 = wff_utilities.$check_arityP$.currentBinding(thread);
                final SubLObject _prev_bind_15 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
                try {
                    $bootstrapping_kbP$.bind(T, thread);
                    kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                    $within_assert$.bind(NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                    wff_utilities.$check_arityP$.bind(NIL, thread);
                    cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
                    final SubLObject format = load_partition_info(stream);
                    final SubLObject _prev_bind_0_$83 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(load_partition_special_objects(stream));
                        final SubLObject _prev_bind_0_$84 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$84 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$85 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$89 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
                        try {
                            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(PARTITION_FIND_CONSTANT_BY_ID, thread);
                            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(PARTITION_FIND_NART_BY_ID, thread);
                            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(PARTITION_FIND_ASSERTION_BY_ID, thread);
                            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(PARTITION_FIND_KB_HL_SUPPORT_BY_ID, thread);
                            load_partition_constant_shells(stream);
                            load_partition_nart_shells(stream);
                            if (NIL != $partition_entire_kb_loadP$.getDynamicValue(thread)) {
                                hl_storage_modules.reclassify_hl_storage_modules();
                            }
                            load_partition_assertions(stream);
                            if (NIL != partition_formats_compatibleP($str76$2_2, format)) {
                                load_partition_kb_hl_supports(stream);
                            }
                            load_partition_arguments(stream);
                            if (NIL != reset_sbhl_linksP) {
                                reset_sbhl_links_for_partition_forts();
                            }
                            success = T;
                        } finally {
                            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_3_$89, thread);
                            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_2_$85, thread);
                            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_1_$84, thread);
                            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0_$84, thread);
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0_$83, thread);
                    }
                } finally {
                    cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_15, thread);
                    wff_utilities.$check_arityP$.rebind(_prev_bind_14, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_13, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_12, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_11, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_10, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_9, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_8, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_6, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_4, thread);
                    $within_assert$.rebind(_prev_bind_2_$84, thread);
                    kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_1_$83, thread);
                    $bootstrapping_kbP$.rebind(_prev_bind_0_$82, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$85 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return success;
    }

    public static final SubLObject load_partition_info_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject copyright_notice = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject format = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject system = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject patch_level = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject date = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(copyright_notice, STRINGP);
                SubLTrampolineFile.checkType(format, ATOM);
                SubLTrampolineFile.checkType(system, INTEGERP);
                SubLTrampolineFile.checkType(patch_level, INTEGERP);
                SubLTrampolineFile.checkType(date, INTEGERP);
                if (NIL == com.cyc.cycjava.cycl.partitions.partition_formats_compatibleP(format, $dump_partition_format$.getDynamicValue(thread))) {
                    Errors.error($str_alt100$partition_format_is__A__not__A__a, format, $dump_partition_format$.getDynamicValue(thread));
                }
                return format;
            }
        }
    }

    public static SubLObject load_partition_info(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject copyright_notice = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject format = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject system = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject patch_level = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject date = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != stringp(copyright_notice) : "! stringp(copyright_notice) " + ("Types.stringp(copyright_notice) " + "CommonSymbols.NIL != Types.stringp(copyright_notice) ") + copyright_notice;
        assert NIL != atom(format) : "! atom(format) " + ("Types.atom(format) " + "CommonSymbols.NIL != Types.atom(format) ") + format;
        assert NIL != integerp(system) : "! integerp(system) " + ("Types.integerp(system) " + "CommonSymbols.NIL != Types.integerp(system) ") + system;
        assert NIL != integerp(patch_level) : "! integerp(patch_level) " + ("Types.integerp(patch_level) " + "CommonSymbols.NIL != Types.integerp(patch_level) ") + patch_level;
        assert NIL != integerp(date) : "! integerp(date) " + ("Types.integerp(date) " + "CommonSymbols.NIL != Types.integerp(date) ") + date;
        if (NIL == partition_formats_compatibleP(format, $dump_partition_format$.getDynamicValue(thread))) {
            Errors.error($str114$partition_format_is__A__not__A__a, format, $dump_partition_format$.getDynamicValue(thread));
        }
        return format;
    }

    public static final SubLObject partition_formats_compatibleP_alt(SubLObject file_format, SubLObject code_format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(file_format.equal(code_format) || (NIL != member(list(file_format, code_format), $backwards_compatibility_pairs$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)));
        }
    }

    public static SubLObject partition_formats_compatibleP(final SubLObject file_format, final SubLObject code_format) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(file_format.equal(code_format) || (NIL != member(list(file_format, code_format), $backwards_compatibility_pairs$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)));
    }

    public static final SubLObject load_partition_section_marker_alt(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marker = cfasl_input(stream, eof_error_p, eof_value);
                if (marker == eof_value) {
                    return eof_value;
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (marker != $partition_section_marker$.getDynamicValue(thread)) {
                        Errors.error($$$malformed_partition_file);
                    }
                }
                return NIL;
            }
        }
    }

    public static SubLObject load_partition_section_marker(final SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject marker = cfasl_input(stream, eof_error_p, eof_value);
        if (marker.eql(eof_value)) {
            return eof_value;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!marker.eql($partition_section_marker$.getDynamicValue(thread)))) {
            Errors.error($$$malformed_partition_file);
        }
        return NIL;
    }

    public static final SubLObject load_partition_special_objects_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(NIL);
                        ans = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject load_partition_special_objects(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols(NIL);
            ans = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject reset_sbhl_links_for_partition_forts() {
        final SubLObject constants = gather_load_partition_scope_constants();
        final SubLObject narts = gather_load_partition_scope_narts();
        final SubLObject v_forts = nconc(constants, narts);
        sbhl_link_methods.sbhl_recompute_links_of_nodes(v_forts);
        return length(v_forts);
    }

    public static final SubLObject load_partition_constant_shells_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.load_partition_section_marker(stream, UNPROVIDED, UNPROVIDED);
            {
                SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(total, INTEGERP);
                com.cyc.cycjava.cycl.partitions.clear_load_partition_constants(total);
                $progress_note$.setDynamicValue($$$loading_partition_constant_shells, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(total, thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                com.cyc.cycjava.cycl.partitions.load_partition_constant_shell(stream);
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
            }
            return NIL;
        }
    }

    public static SubLObject load_partition_constant_shells(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_partition_section_marker(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(total) : "! integerp(total) " + ("Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) ") + total;
        clear_load_partition_constants(total);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$loading_partition_constant_shells, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(total, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    load_partition_constant_shell(stream);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
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

    public static final SubLObject load_partition_constant_shell_alt(SubLObject stream) {
        {
            SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject guid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject scopeP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLTrampolineFile.checkType(id, INTEGERP);
            SubLTrampolineFile.checkType(name, STRINGP);
            SubLTrampolineFile.checkType(scopeP, ATOM);
            SubLTrampolineFile.checkType(guid, GUID_P);
            com.cyc.cycjava.cycl.partitions.link_partition_constant_shell(id, name, guid, scopeP);
            return NIL;
        }
    }

    public static SubLObject load_partition_constant_shell(final SubLObject stream) {
        final SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject guid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject scopeP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(id) : "! integerp(id) " + ("Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) ") + id;
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != atom(scopeP) : "! atom(scopeP) " + ("Types.atom(scopeP) " + "CommonSymbols.NIL != Types.atom(scopeP) ") + scopeP;
        assert NIL != Guids.guid_p(guid) : "! Guids.guid_p(guid) " + ("Guids.guid_p(guid) " + "CommonSymbols.NIL != Guids.guid_p(guid) ") + guid;
        link_partition_constant_shell(id, name, guid, scopeP);
        return NIL;
    }

    public static final SubLObject load_partition_nart_shells_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max_nart_level = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(max_nart_level, INTEGERP);
                if (max_nart_level.numG($load_partition_max_nart_complexity$.getDynamicValue(thread))) {
                    $load_partition_max_nart_complexity$.setDynamicValue(max_nart_level, thread);
                }
                if (ZERO_INTEGER.numE(max_nart_level)) {
                    com.cyc.cycjava.cycl.partitions.clear_load_partition_narts($int$100);
                } else {
                    {
                        SubLObject index = NIL;
                        for (index = ZERO_INTEGER; index.numL(max_nart_level); index = add(index, ONE_INTEGER)) {
                            {
                                SubLObject nart_level = add(index, ONE_INTEGER);
                                com.cyc.cycjava.cycl.partitions.load_partition_nart_order_set(nart_level, stream);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject load_partition_nart_shells(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_nart_level = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(max_nart_level) : "! integerp(max_nart_level) " + ("Types.integerp(max_nart_level) " + "CommonSymbols.NIL != Types.integerp(max_nart_level) ") + max_nart_level;
        if (max_nart_level.numG($load_partition_max_nart_complexity$.getDynamicValue(thread))) {
            $load_partition_max_nart_complexity$.setDynamicValue(max_nart_level, thread);
        }
        if (ZERO_INTEGER.numE(max_nart_level)) {
            clear_load_partition_narts($int$100);
        } else {
            SubLObject index;
            SubLObject nart_level;
            for (index = NIL, index = ZERO_INTEGER; index.numL(max_nart_level); index = add(index, ONE_INTEGER)) {
                nart_level = add(index, ONE_INTEGER);
                load_partition_nart_order_set(nart_level, stream);
            }
        }
        return NIL;
    }

    public static final SubLObject load_partition_nart_order_set_alt(SubLObject nart_level, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.load_partition_section_marker(stream, UNPROVIDED, UNPROVIDED);
            {
                SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(total, INTEGERP);
                if (nart_level.numE(ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.partitions.clear_load_partition_narts(total);
                }
                {
                    SubLObject message = cconcatenate($str_alt105$loading_partition_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(nart_level), $str_alt106$_narts });
                    $progress_note$.setDynamicValue(message, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(total, thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    com.cyc.cycjava.cycl.partitions.load_partition_nart_shell(stream);
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
                }
            }
            return NIL;
        }
    }

    public static SubLObject load_partition_nart_order_set(final SubLObject nart_level, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_partition_section_marker(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(total) : "! integerp(total) " + ("Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) ") + total;
        if (nart_level.numE(ONE_INTEGER)) {
            clear_load_partition_narts(total);
        }
        final SubLObject message = cconcatenate($$$loading_partition_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(nart_level), $$$_narts });
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(message, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(total, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    load_partition_nart_shell(stream);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
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

    public static final SubLObject load_partition_nart_shell_alt(SubLObject stream) {
        {
            SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject hl_formula = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject scopeP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLTrampolineFile.checkType(id, INTEGERP);
            SubLTrampolineFile.checkType(hl_formula, POSSIBLY_NAUT_P);
            SubLTrampolineFile.checkType(scopeP, ATOM);
            com.cyc.cycjava.cycl.partitions.link_partition_nart_shell(id, hl_formula, scopeP);
            return NIL;
        }
    }

    public static SubLObject load_partition_nart_shell(final SubLObject stream) {
        final SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject hl_formula = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject scopeP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(id) : "! integerp(id) " + ("Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) ") + id;
        assert NIL != possibly_naut_p(hl_formula) : "! el_utilities.possibly_naut_p(hl_formula) " + ("el_utilities.possibly_naut_p(hl_formula) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(hl_formula) ") + hl_formula;
        assert NIL != atom(scopeP) : "! atom(scopeP) " + ("Types.atom(scopeP) " + "CommonSymbols.NIL != Types.atom(scopeP) ") + scopeP;
        link_partition_nart_shell(id, hl_formula, scopeP);
        return NIL;
    }

    public static final SubLObject load_partition_assertions_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max_term_order = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(max_term_order, INTEGERP);
                if (max_term_order.numG($load_partition_max_term_order$.getDynamicValue(thread))) {
                    $load_partition_max_term_order$.setDynamicValue(max_term_order, thread);
                }
                {
                    SubLObject term_order = NIL;
                    for (term_order = ZERO_INTEGER; term_order.numL(max_term_order); term_order = add(term_order, ONE_INTEGER)) {
                        {
                            SubLObject meta_order = add(term_order, ONE_INTEGER);
                            if (meta_order.numE(ONE_INTEGER)) {
                                com.cyc.cycjava.cycl.partitions.load_partition_simple_assertions(meta_order, stream);
                            } else {
                                com.cyc.cycjava.cycl.partitions.load_partition_meta_assertions(meta_order, stream);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject load_partition_assertions(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_term_order = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(max_term_order) : "! integerp(max_term_order) " + ("Types.integerp(max_term_order) " + "CommonSymbols.NIL != Types.integerp(max_term_order) ") + max_term_order;
        if (max_term_order.numG($load_partition_max_term_order$.getDynamicValue(thread))) {
            $load_partition_max_term_order$.setDynamicValue(max_term_order, thread);
        }
        SubLObject term_order;
        SubLObject meta_order;
        for (term_order = NIL, term_order = ZERO_INTEGER; term_order.numL(max_term_order); term_order = add(term_order, ONE_INTEGER)) {
            meta_order = add(term_order, ONE_INTEGER);
            if (meta_order.numE(ONE_INTEGER)) {
                load_partition_simple_assertions(meta_order, stream);
            } else {
                load_partition_meta_assertions(meta_order, stream);
            }
        }
        return NIL;
    }

    public static final SubLObject load_partition_simple_assertions_alt(SubLObject meta_order, SubLObject stream) {
        return com.cyc.cycjava.cycl.partitions.load_partition_assertion_order_set(meta_order, $$$loading_partition_assertions, stream);
    }

    public static SubLObject load_partition_simple_assertions(final SubLObject meta_order, final SubLObject stream) {
        return load_partition_assertion_order_set(meta_order, $$$loading_partition_assertions, stream);
    }

    public static final SubLObject load_partition_meta_assertions_alt(SubLObject meta_order, SubLObject stream) {
        {
            SubLObject message = cconcatenate($str_alt109$loading_partition_order_, new SubLObject[]{ format_nil.format_nil_s_no_copy(meta_order), $str_alt110$_meta_assertions });
            return com.cyc.cycjava.cycl.partitions.load_partition_assertion_order_set(meta_order, message, stream);
        }
    }

    public static SubLObject load_partition_meta_assertions(final SubLObject meta_order, final SubLObject stream) {
        final SubLObject message = cconcatenate($$$loading_partition_order_, new SubLObject[]{ format_nil.format_nil_s_no_copy(meta_order), $str124$_meta_assertions });
        return load_partition_assertion_order_set(meta_order, message, stream);
    }

    public static final SubLObject load_partition_assertion_order_set_alt(SubLObject meta_order, SubLObject message, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.load_partition_section_marker(stream, UNPROVIDED, UNPROVIDED);
            {
                SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(total, INTEGERP);
                if (meta_order.numE(ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.partitions.clear_load_partition_assertions(total);
                }
                $progress_note$.setDynamicValue(message, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(total, thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                com.cyc.cycjava.cycl.partitions.load_partition_assertion(stream);
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
            }
            return NIL;
        }
    }

    public static SubLObject load_partition_assertion_order_set(final SubLObject meta_order, final SubLObject message, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_partition_section_marker(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(total) : "! integerp(total) " + ("Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) ") + total;
        if (meta_order.numE(ONE_INTEGER)) {
            clear_load_partition_assertions(total);
        }
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(message, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(total, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    load_partition_assertion(stream);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$93 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
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

    public static final SubLObject load_partition_assertion_alt(SubLObject stream) {
        {
            SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject scope_termP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject cnf = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject mt = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject direction = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject vnames = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLTrampolineFile.checkType(id, INTEGERP);
            SubLTrampolineFile.checkType(cnf, CNF_P);
            SubLTrampolineFile.checkType(mt, HLMT_P);
            SubLTrampolineFile.checkType(direction, DIRECTION_P);
            SubLTrampolineFile.checkType(vnames, LISTP);
            com.cyc.cycjava.cycl.partitions.link_partition_assertion(id, cnf, mt, scope_termP, direction, vnames);
        }
        return NIL;
    }

    public static SubLObject load_partition_assertion(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject scope_termP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject cnf = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject mt = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject direction = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject vnames = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (!id.isInteger()) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str125$Skipping_assertion_with_bad_id__A, new SubLObject[]{ id, scope_termP, cnf, mt, direction, vnames });
            }
            return NIL;
        }
        if (NIL == clauses.cnf_p(cnf)) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str126$Skipping_assertion_with_bad_cnf__, new SubLObject[]{ cnf, id, scope_termP, mt, direction, vnames });
            }
            return NIL;
        }
        if (NIL == hlmt.possibly_hlmt_p(mt)) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str127$Skipping_assertion_with_bad_mt__S, new SubLObject[]{ mt, id, scope_termP, cnf, direction, vnames });
            }
            return NIL;
        }
        if (NIL == enumeration_types.direction_p(direction)) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str128$Skipping_assertion_with_bad_direc, new SubLObject[]{ direction, id, scope_termP, cnf, mt, vnames });
            }
            return NIL;
        }
        if (!vnames.isList()) {
            Errors.warn($str129$Skipping_assertion_with_bad_vname, new SubLObject[]{ vnames, id, scope_termP, cnf, mt, direction });
            return NIL;
        }
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list131);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            link_partition_assertion(id, cnf, mt, scope_termP, direction, vnames);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str134$_A, message_var);
            }
        } else {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        link_partition_assertion(id, cnf, mt, scope_termP, direction, vnames);
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_3, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return NIL;
    }

    public static final SubLObject load_partition_kb_hl_supports_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max_kb_hl_support_level = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(max_kb_hl_support_level, INTEGERP);
                if (max_kb_hl_support_level.numG($load_partition_max_kb_hl_support_order$.getDynamicValue(thread))) {
                    $load_partition_max_kb_hl_support_order$.setDynamicValue(max_kb_hl_support_level, thread);
                }
                if (ZERO_INTEGER.numE(max_kb_hl_support_level)) {
                    com.cyc.cycjava.cycl.partitions.clear_load_partition_kb_hl_supports($int$100);
                } else {
                    {
                        SubLObject index = NIL;
                        for (index = ZERO_INTEGER; index.numL(max_kb_hl_support_level); index = add(index, ONE_INTEGER)) {
                            {
                                SubLObject kb_hl_support_level = add(ONE_INTEGER, index);
                                com.cyc.cycjava.cycl.partitions.load_partition_kb_hl_support_order_set(kb_hl_support_level, stream);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject load_partition_kb_hl_supports(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_kb_hl_support_level = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(max_kb_hl_support_level) : "! integerp(max_kb_hl_support_level) " + ("Types.integerp(max_kb_hl_support_level) " + "CommonSymbols.NIL != Types.integerp(max_kb_hl_support_level) ") + max_kb_hl_support_level;
        if (max_kb_hl_support_level.numG($load_partition_max_kb_hl_support_order$.getDynamicValue(thread))) {
            $load_partition_max_kb_hl_support_order$.setDynamicValue(max_kb_hl_support_level, thread);
        }
        if (ZERO_INTEGER.numE(max_kb_hl_support_level)) {
            clear_load_partition_kb_hl_supports($int$100);
        } else {
            SubLObject index;
            SubLObject kb_hl_support_level;
            for (index = NIL, index = ZERO_INTEGER; index.numL(max_kb_hl_support_level); index = add(index, ONE_INTEGER)) {
                kb_hl_support_level = add(ONE_INTEGER, index);
                load_partition_kb_hl_support_order_set(kb_hl_support_level, stream);
            }
        }
        return NIL;
    }

    public static final SubLObject load_partition_kb_hl_support_order_set_alt(SubLObject level, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.load_partition_section_marker(stream, UNPROVIDED, UNPROVIDED);
            {
                SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(total, INTEGERP);
                if (level.numE(ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.partitions.clear_load_partition_kb_hl_supports(total);
                }
                {
                    SubLObject message = cconcatenate($str_alt105$loading_partition_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(level), $str_alt78$_KB_HL_supports });
                    $progress_note$.setDynamicValue(message, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(total, thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    com.cyc.cycjava.cycl.partitions.load_partition_kb_hl_support(stream);
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
                }
            }
            return NIL;
        }
    }

    public static SubLObject load_partition_kb_hl_support_order_set(final SubLObject level, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_partition_section_marker(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(total) : "! integerp(total) " + ("Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) ") + total;
        if (level.numE(ONE_INTEGER)) {
            clear_load_partition_kb_hl_supports(total);
        }
        final SubLObject message = cconcatenate($$$loading_partition_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(level), $$$_KB_HL_supports });
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(message, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(total, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    load_partition_kb_hl_support(stream);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
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

    public static final SubLObject load_partition_kb_hl_support_alt(SubLObject stream) {
        {
            SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject scopeP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject hl_support = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject justification = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLTrampolineFile.checkType(id, INTEGERP);
            SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
            SubLTrampolineFile.checkType(justification, HL_JUSTIFICATION_P);
            com.cyc.cycjava.cycl.partitions.link_partition_kb_hl_support(id, hl_support, justification, scopeP);
        }
        return NIL;
    }

    public static SubLObject load_partition_kb_hl_support(final SubLObject stream) {
        final SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject scopeP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject hl_support = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject justification = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(id) : "! integerp(id) " + ("Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) ") + id;
        assert NIL != arguments.hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        assert NIL != arguments.hl_justification_p(justification) : "! arguments.hl_justification_p(justification) " + ("arguments.hl_justification_p(justification) " + "CommonSymbols.NIL != arguments.hl_justification_p(justification) ") + justification;
        link_partition_kb_hl_support(id, hl_support, justification, scopeP);
        return NIL;
    }

    public static final SubLObject load_partition_arguments_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.partitions.load_partition_section_marker(stream, UNPROVIDED, UNPROVIDED);
            {
                SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(total, INTEGERP);
                $progress_note$.setDynamicValue($$$loading_partition_arguments, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(total, thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                com.cyc.cycjava.cycl.partitions.load_partition_argument(stream);
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
            }
            return NIL;
        }
    }

    public static SubLObject load_partition_arguments(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_partition_section_marker(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(total) : "! integerp(total) " + ("Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) ") + total;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$loading_partition_arguments, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(total, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    load_partition_argument(stream);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
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

    public static final SubLObject load_partition_argument_alt(SubLObject stream) {
        {
            SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            if (NIL == id) {
                com.cyc.cycjava.cycl.partitions.load_partition_beliefs(stream);
            } else {
                com.cyc.cycjava.cycl.partitions.load_partition_deduction(stream);
            }
        }
        return NIL;
    }

    public static SubLObject load_partition_argument(final SubLObject stream) {
        final SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL == id) {
            load_partition_beliefs(stream);
        } else {
            load_partition_deduction(stream, id);
        }
        return NIL;
    }

    public static final SubLObject load_partition_beliefs_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                if (NIL == assertion) {
                    com.cyc.cycjava.cycl.partitions.load_some_partition_bookkeeping_assertions(stream);
                } else {
                    {
                        SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
                        SubLTrampolineFile.checkType(total, INTEGERP);
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
                                {
                                    SubLObject type = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                                    SubLTrampolineFile.checkType(type, KEYWORDP);
                                    if (type == $partition_asserted_argument_type_flag$.getDynamicValue(thread)) {
                                        com.cyc.cycjava.cycl.partitions.load_partition_asserted_argument(assertion, stream);
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

    public static SubLObject load_partition_beliefs(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL == assertion) {
            load_some_partition_bookkeeping_assertions(stream);
        } else {
            final SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
            assert NIL != integerp(total) : "! integerp(total) " + ("Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) ") + total;
            SubLObject i;
            SubLObject type;
            for (i = NIL, i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
                type = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                assert NIL != keywordp(type) : "! keywordp(type) " + ("Types.keywordp(type) " + "CommonSymbols.NIL != Types.keywordp(type) ") + type;
                if (type.eql($partition_asserted_argument_type_flag$.getDynamicValue(thread))) {
                    load_partition_asserted_argument(assertion, stream);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject load_partition_asserted_argument_alt(SubLObject assertion, SubLObject stream) {
        {
            SubLObject tv = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject assert_info = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLTrampolineFile.checkType(tv, TV_P);
            SubLTrampolineFile.checkType(assert_info, LISTP);
            return com.cyc.cycjava.cycl.partitions.link_partition_asserted_argument(assertion, tv, assert_info);
        }
    }

    public static SubLObject load_partition_asserted_argument(final SubLObject assertion, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tv = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject assert_info = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str140$Skipping_asserted_argument_for_ba, assertion);
            }
            return NIL;
        }
        if (NIL == enumeration_types.tv_p(tv)) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str141$Skipping_asserted_argument_for_as, assertion_handles.assertion_id(assertion), tv, assertion);
            }
            return NIL;
        }
        if (!assert_info.isList()) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str142$Skipping_asserted_argument_for_as, assertion_handles.assertion_id(assertion), assert_info, assertion);
            }
            return NIL;
        }
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list131);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            link_partition_asserted_argument(assertion, tv, assert_info);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str134$_A, message_var);
            }
        } else {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        link_partition_asserted_argument(assertion, tv, assert_info);
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_3, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return NIL;
    }

    public static final SubLObject load_partition_deduction(SubLObject stream) {
        {
            SubLObject tv = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject assertion = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject supports = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLTrampolineFile.checkType(tv, TV_P);
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            SubLTrampolineFile.checkType(supports, CONSP);
            supports = com.cyc.cycjava.cycl.partitions.load_partition_possibly_weaken_hl_supports(supports);
            return com.cyc.cycjava.cycl.partitions.link_partition_deduction(assertion, supports, tv);
        }
    }

    public static SubLObject load_partition_deduction(final SubLObject stream, SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tv = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject assertion = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject supports = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL == enumeration_types.tv_p(tv)) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str143$Skipping_deduction__id__A__with_b, new SubLObject[]{ id, tv, assertion, supports });
            }
            return NIL;
        }
        if (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str144$Skipping_deduction__id__A__with_b, new SubLObject[]{ id, assertion, tv, supports });
            }
            return NIL;
        }
        if (!supports.isCons()) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str145$Skipping_deduction__id__A__with_b, new SubLObject[]{ id, supports, tv, assertion });
            }
            return NIL;
        }
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list131);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            supports = load_partition_possibly_weaken_hl_supports(supports);
                            link_partition_deduction(assertion, supports, tv);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str134$_A, message_var);
            }
        } else {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        supports = load_partition_possibly_weaken_hl_supports(supports);
                        link_partition_deduction(assertion, supports, tv);
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_3, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return NIL;
    }

    public static final SubLObject load_some_partition_bookkeeping_assertions_alt(SubLObject stream) {
        {
            SubLObject how_many = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(how_many); i = add(i, ONE_INTEGER)) {
                com.cyc.cycjava.cycl.partitions.load_partition_assertible(stream);
            }
        }
        return NIL;
    }

    public static SubLObject load_some_partition_bookkeeping_assertions(final SubLObject stream) {
        SubLObject how_many;
        SubLObject i;
        for (how_many = cfasl_input(stream, UNPROVIDED, UNPROVIDED), i = NIL, i = ZERO_INTEGER; i.numL(how_many); i = add(i, ONE_INTEGER)) {
            load_partition_assertible(stream);
        }
        return NIL;
    }

    public static final SubLObject load_partition_assertible_alt(SubLObject stream) {
        {
            SubLObject cnf = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject mt = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject strength = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject direction = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject variable_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLTrampolineFile.checkType(cnf, CNF_P);
            SubLTrampolineFile.checkType(mt, HLMT_P);
            SubLTrampolineFile.checkType(strength, EL_STRENGTH_P);
            SubLTrampolineFile.checkType(direction, DIRECTION_P);
            SubLTrampolineFile.checkType(variable_map, LISTP);
            return com.cyc.cycjava.cycl.partitions.link_partition_assertible(cnf, mt, strength, direction, variable_map);
        }
    }

    public static SubLObject load_partition_assertible(final SubLObject stream) {
        final SubLObject cnf = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject mt = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject strength = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject direction = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject variable_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != clauses.cnf_p(cnf) : "! clauses.cnf_p(cnf) " + ("clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) ") + cnf;
        assert NIL != hlmt.possibly_hlmt_p(mt) : "! hlmt.possibly_hlmt_p(mt) " + ("hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) ") + mt;
        assert NIL != enumeration_types.el_strength_p(strength) : "! enumeration_types.el_strength_p(strength) " + ("enumeration_types.el_strength_p(strength) " + "CommonSymbols.NIL != enumeration_types.el_strength_p(strength) ") + strength;
        assert NIL != enumeration_types.direction_p(direction) : "! enumeration_types.direction_p(direction) " + ("enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) ") + direction;
        assert NIL != listp(variable_map) : "! listp(variable_map) " + ("Types.listp(variable_map) " + "CommonSymbols.NIL != Types.listp(variable_map) ") + variable_map;
        return link_partition_assertible(cnf, mt, strength, direction, variable_map);
    }

    public static final SubLObject load_partition_possibly_weaken_hl_supports_alt(SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $load_partition_weaken_hl_supports$.getDynamicValue(thread)) {
                {
                    SubLObject cdolist_list_var = supports;
                    SubLObject support = NIL;
                    for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                        if (NIL != arguments.hl_support_p(support)) {
                            {
                                SubLObject module = arguments.hl_support_module(support);
                                SubLObject weaker_module = list_utilities.alist_lookup_without_values($load_partition_weaken_hl_supports$.getDynamicValue(thread), module, symbol_function(EQ), UNPROVIDED);
                                if (NIL != weaker_module) {
                                    com.cyc.cycjava.cycl.partitions.replace_hl_support_module(support, weaker_module);
                                }
                            }
                        }
                    }
                }
            }
            return supports;
        }
    }

    public static SubLObject load_partition_possibly_weaken_hl_supports(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $load_partition_weaken_hl_supports$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = supports;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != arguments.hl_support_p(support)) {
                    final SubLObject module = arguments.hl_support_module(support);
                    final SubLObject weaker_module = list_utilities.alist_lookup_without_values($load_partition_weaken_hl_supports$.getDynamicValue(thread), module, symbol_function(EQL), UNPROVIDED);
                    if (NIL != weaker_module) {
                        replace_hl_support_module(support, weaker_module);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        }
        return supports;
    }

    /**
     * Destructively change the module for HL-SUPPORT to NEW-MODULE
     */
    @LispMethod(comment = "Destructively change the module for HL-SUPPORT to NEW-MODULE")
    public static final SubLObject replace_hl_support_module_alt(SubLObject hl_support, SubLObject new_module) {
        SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
        rplaca(hl_support, new_module);
        SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
        return hl_support;
    }

    /**
     * Destructively change the module for HL-SUPPORT to NEW-MODULE
     */
    @LispMethod(comment = "Destructively change the module for HL-SUPPORT to NEW-MODULE")
    public static SubLObject replace_hl_support_module(final SubLObject hl_support, final SubLObject new_module) {
        assert NIL != arguments.hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        rplaca(hl_support, new_module);
        assert NIL != arguments.hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        return hl_support;
    }

    public static final SubLObject clear_load_partition_constants_alt(SubLObject total) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$load_partition_constants$.getDynamicValue(thread).isHashtable()) {
                $load_partition_constants$.setDynamicValue(com.cyc.cycjava.cycl.partitions.new_load_partition_constants_store(total), thread);
            }
            if (NIL == $preseeded_partition_constants$.getDynamicValue(thread)) {
                clrhash($load_partition_constants$.getDynamicValue(thread));
            }
            if (!$load_partition_scope_constants$.getDynamicValue(thread).isHashtable()) {
                $load_partition_scope_constants$.setDynamicValue(com.cyc.cycjava.cycl.partitions.new_load_partition_scope_constants_store(total), thread);
            }
            clrhash($load_partition_scope_constants$.getDynamicValue(thread));
            if (!$load_partition_missing_constants$.getDynamicValue(thread).isHashtable()) {
                $load_partition_missing_constants$.setDynamicValue(com.cyc.cycjava.cycl.partitions.new_load_paritition_missing_constants_store(total), thread);
            }
            clrhash($load_partition_missing_constants$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject clear_load_partition_constants(final SubLObject total) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$load_partition_constants$.getDynamicValue(thread).isHashtable()) {
            $load_partition_constants$.setDynamicValue(new_load_partition_constants_store(total), thread);
        }
        if (NIL == $preseeded_partition_constants$.getDynamicValue(thread)) {
            clrhash($load_partition_constants$.getDynamicValue(thread));
        }
        if (!$load_partition_scope_constants$.getDynamicValue(thread).isHashtable()) {
            $load_partition_scope_constants$.setDynamicValue(new_load_partition_scope_constants_store(total), thread);
        }
        clrhash($load_partition_scope_constants$.getDynamicValue(thread));
        if (!$load_partition_missing_constants$.getDynamicValue(thread).isHashtable()) {
            $load_partition_missing_constants$.setDynamicValue(new_load_paritition_missing_constants_store(total), thread);
        }
        clrhash($load_partition_missing_constants$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject new_load_partition_constants_store_alt(SubLObject total) {
        return make_hash_table(total, symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject new_load_partition_constants_store(final SubLObject total) {
        return make_hash_table(total, symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject new_load_partition_scope_constants_store_alt(SubLObject total) {
        return make_hash_table(integerDivide(total, TEN_INTEGER), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject new_load_partition_scope_constants_store(final SubLObject total) {
        return make_hash_table(integerDivide(total, TEN_INTEGER), symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject new_load_paritition_missing_constants_store_alt(SubLObject total) {
        return make_hash_table(integerDivide(total, TEN_INTEGER), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_load_paritition_missing_constants_store(final SubLObject total) {
        return make_hash_table(integerDivide(total, TEN_INTEGER), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gather_load_partition_scope_constants_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return hash_table_values($load_partition_scope_constants$.getDynamicValue(thread));
        }
    }

    public static SubLObject gather_load_partition_scope_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.hash_table_values($load_partition_scope_constants$.getDynamicValue(thread));
    }

    public static final SubLObject gather_load_partition_missing_constants_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($load_partition_scope_constants$.getDynamicValue(thread).isHashtable()) {
                return hash_table_values($load_partition_missing_constants$.getDynamicValue(thread));
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject gather_load_partition_missing_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($load_partition_scope_constants$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values($load_partition_missing_constants$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject note_load_partition_constant_alt(SubLObject id, SubLObject constant, SubLObject scopeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == $preseeded_partition_constants$.getDynamicValue(thread)) || (NIL == gethash_without_values(id, $load_partition_constants$.getDynamicValue(thread), UNPROVIDED))) {
                sethash(id, $load_partition_constants$.getDynamicValue(thread), constant);
            }
            if (NIL != scopeP) {
                sethash(id, $load_partition_scope_constants$.getDynamicValue(thread), constant);
            }
            return NIL;
        }
    }

    public static SubLObject note_load_partition_constant(final SubLObject id, final SubLObject constant, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $preseeded_partition_constants$.getDynamicValue(thread)) || (NIL == gethash_without_values(id, $load_partition_constants$.getDynamicValue(thread), UNPROVIDED))) {
            sethash(id, $load_partition_constants$.getDynamicValue(thread), constant);
        }
        if (NIL != scopeP) {
            sethash(id, $load_partition_scope_constants$.getDynamicValue(thread), constant);
        }
        return NIL;
    }

    public static final SubLObject note_load_partition_missing_constant_alt(SubLObject id, SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(id, $load_partition_missing_constants$.getDynamicValue(thread), constant);
            return NIL;
        }
    }

    public static SubLObject note_load_partition_missing_constant(final SubLObject id, final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(id, $load_partition_missing_constants$.getDynamicValue(thread), constant);
        return NIL;
    }

    public static final SubLObject partition_find_constant_by_id_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constant = gethash_without_values(id, $load_partition_constants$.getDynamicValue(thread), UNPROVIDED);
                if (NIL == constant) {
                    constant = com.cyc.cycjava.cycl.partitions.partition_missing_constant_link_error(id);
                }
                return constant;
            }
        }
    }

    public static SubLObject partition_find_constant_by_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = gethash_without_values(id, $load_partition_constants$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == constant) {
            constant = partition_missing_constant_link_error(id);
        }
        return constant;
    }

    public static final SubLObject partition_missing_constant_link_error_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str_alt121$Did_not_find_constant__D_, id);
            }
            {
                SubLObject invalid_constant = partition_create_invalid_constant();
                com.cyc.cycjava.cycl.partitions.note_load_partition_constant(id, invalid_constant, NIL);
                com.cyc.cycjava.cycl.partitions.note_load_partition_missing_constant(id, invalid_constant);
                return invalid_constant;
            }
        }
    }

    public static SubLObject partition_missing_constant_link_error(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str151$Did_not_find_constant__D_, id);
        }
        final SubLObject invalid_constant = partition_create_invalid_constant();
        note_load_partition_constant(id, invalid_constant, NIL);
        note_load_partition_missing_constant(id, invalid_constant);
        return invalid_constant;
    }

    public static final SubLObject link_partition_constant_shell_alt(SubLObject id, SubLObject name, SubLObject external_id, SubLObject scopeP) {
        {
            SubLObject constant = NIL;
            if (NIL != scopeP) {
                {
                    SubLObject existing_by_id = constants_high.find_constant_by_external_id(external_id);
                    SubLObject existing_by_name = constants_high.find_constant(name);
                    if (NIL != constant_p(existing_by_id)) {
                        if (NIL != constant_p(existing_by_name)) {
                            if (existing_by_id == existing_by_name) {
                                constant = existing_by_id;
                            } else {
                                constant = com.cyc.cycjava.cycl.partitions.link_partition_constant_error_1(name, external_id);
                            }
                        } else {
                            constant = com.cyc.cycjava.cycl.partitions.link_partition_constant_error_2(name, external_id);
                        }
                    } else {
                        if (NIL != constant_p(existing_by_name)) {
                            constant = com.cyc.cycjava.cycl.partitions.link_partition_constant_error_3(name, external_id);
                        } else {
                            constant = com.cyc.cycjava.cycl.partitions.link_partition_create_constant(name, external_id);
                        }
                    }
                }
            } else {
                {
                    SubLObject existing_by_id = constants_high.find_constant_by_external_id(external_id);
                    SubLObject existing_by_name = constants_high.find_constant(name);
                    if (NIL != constant_p(existing_by_id)) {
                        if (NIL != constant_p(existing_by_name)) {
                            if (existing_by_id == existing_by_name) {
                                constant = existing_by_id;
                            } else {
                                constant = com.cyc.cycjava.cycl.partitions.link_partition_constant_error_4(name, external_id);
                            }
                        } else {
                            constant = com.cyc.cycjava.cycl.partitions.link_partition_constant_error_5(name, external_id);
                        }
                    } else {
                        if (NIL != constant_p(existing_by_name)) {
                            constant = com.cyc.cycjava.cycl.partitions.link_partition_constant_error_6(name, external_id);
                            com.cyc.cycjava.cycl.partitions.note_load_partition_missing_constant(id, constant);
                        } else {
                            constant = com.cyc.cycjava.cycl.partitions.link_partition_constant_error_7(name, external_id);
                            com.cyc.cycjava.cycl.partitions.note_load_partition_missing_constant(id, constant);
                        }
                    }
                }
            }
            SubLTrampolineFile.checkType(constant, CONSTANT_P);
            com.cyc.cycjava.cycl.partitions.note_load_partition_constant(id, constant, scopeP);
        }
        return NIL;
    }

    public static SubLObject link_partition_constant_shell(final SubLObject id, final SubLObject name, final SubLObject external_id, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
            SubLObject constant = NIL;
            if (NIL != scopeP) {
                final SubLObject existing_by_id = constants_high.find_constant_by_external_id(external_id);
                final SubLObject existing_by_name = constants_high.find_constant(name);
                if (NIL != constant_p(existing_by_id)) {
                    if (NIL != constant_p(existing_by_name)) {
                        if (existing_by_id.eql(existing_by_name)) {
                            constant = existing_by_id;
                        } else {
                            constant = link_partition_constant_error_1(name, external_id);
                        }
                    } else {
                        constant = link_partition_constant_error_2(name, external_id);
                    }
                } else
                    if (NIL != constant_p(existing_by_name)) {
                        constant = link_partition_constant_error_3(name, external_id);
                    } else {
                        constant = link_partition_create_constant(name, external_id);
                    }

            } else {
                final SubLObject existing_by_id = constants_high.find_constant_by_external_id(external_id);
                final SubLObject existing_by_name = constants_high.find_constant(name);
                if (NIL != constant_p(existing_by_id)) {
                    if (NIL != constant_p(existing_by_name)) {
                        if (existing_by_id.eql(existing_by_name)) {
                            constant = existing_by_id;
                        } else {
                            constant = link_partition_constant_error_4(name, external_id);
                        }
                    } else {
                        constant = link_partition_constant_error_5(name, external_id);
                    }
                } else
                    if (NIL != constant_p(existing_by_name)) {
                        constant = link_partition_constant_error_6(name, external_id);
                        note_load_partition_missing_constant(id, constant);
                    } else {
                        constant = link_partition_constant_error_7(name, external_id);
                        note_load_partition_missing_constant(id, constant);
                    }

            }
            assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
            note_load_partition_constant(id, constant, scopeP);
        } finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * create constant with NAME and EXTERNAL-ID
     */
    @LispMethod(comment = "create constant with NAME and EXTERNAL-ID")
    public static final SubLObject link_partition_create_constant_alt(SubLObject name, SubLObject external_id) {
        return constants_high.find_or_create_constant(name, external_id);
    }

    /**
     * create constant with NAME and EXTERNAL-ID
     */
    @LispMethod(comment = "create constant with NAME and EXTERNAL-ID")
    public static SubLObject link_partition_create_constant(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
            return constants_high.find_or_create_constant(name, external_id);
        } finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * install EXTERNAL-ID for constant shell with NAME
     */
    @LispMethod(comment = "install EXTERNAL-ID for constant shell with NAME")
    public static final SubLObject link_partition_install_constant_id_alt(SubLObject name, SubLObject external_id) {
        return constants_high.find_or_create_constant(name, external_id);
    }

    /**
     * install EXTERNAL-ID for constant shell with NAME
     */
    @LispMethod(comment = "install EXTERNAL-ID for constant shell with NAME")
    public static SubLObject link_partition_install_constant_id(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
            return constants_high.find_or_create_constant(name, external_id);
        } finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject preseed_load_partition_constants_store_alt(SubLObject pre_seeding, SubLObject scoped_map) {
        if (scoped_map == UNPROVIDED) {
            scoped_map = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = NIL;
                SubLObject constant = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(pre_seeding);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id = getEntryKey(cdohash_entry);
                            constant = getEntryValue(cdohash_entry);
                            {
                                SubLObject scopedP = (scoped_map.isHashtable()) ? ((SubLObject) (gethash_without_values(id, scoped_map, UNPROVIDED))) : NIL;
                                {
                                    SubLObject _prev_bind_0 = $preseeded_partition_constants$.currentBinding(thread);
                                    try {
                                        $preseeded_partition_constants$.bind(NIL, thread);
                                        com.cyc.cycjava.cycl.partitions.note_load_partition_constant(id, constant, scopedP);
                                    } finally {
                                        $preseeded_partition_constants$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject preseed_load_partition_constants_store(final SubLObject pre_seeding, SubLObject scoped_map) {
        if (scoped_map == UNPROVIDED) {
            scoped_map = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = NIL;
        SubLObject constant = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(pre_seeding);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                id = getEntryKey(cdohash_entry);
                constant = getEntryValue(cdohash_entry);
                final SubLObject scopedP = (scoped_map.isHashtable()) ? gethash_without_values(id, scoped_map, UNPROVIDED) : NIL;
                final SubLObject _prev_bind_0 = $preseeded_partition_constants$.currentBinding(thread);
                try {
                    $preseeded_partition_constants$.bind(NIL, thread);
                    note_load_partition_constant(id, constant, scopedP);
                } finally {
                    $preseeded_partition_constants$.rebind(_prev_bind_0, thread);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static final SubLObject with_preseeded_partition_constants_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt123);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject pre_seeding = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt123);
                    pre_seeding = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_40 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt123);
                            current_40 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt123);
                            if (NIL == member(current_40, $list_alt124, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_40 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt123);
                        }
                        {
                            SubLObject expected_total_tail = property_list_member($EXPECTED_TOTAL, current);
                            SubLObject expected_total = (NIL != expected_total_tail) ? ((SubLObject) (cadr(expected_total_tail))) : $int$100;
                            SubLObject scoped_map_tail = property_list_member($SCOPED_MAP, current);
                            SubLObject scoped_map = (NIL != scoped_map_tail) ? ((SubLObject) (cadr(scoped_map_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(CLET, list($list_alt129, list($load_partition_constants$, list(NEW_LOAD_PARTITION_CONSTANTS_STORE, expected_total)), list($load_partition_scope_constants$, list(FWHEN, list(HASH_TABLE_P, scoped_map), list(NEW_LOAD_PARTITION_SCOPE_CONSTANTS_STORE, expected_total)))), list(PRESEED_LOAD_PARTITION_CONSTANTS_STORE, pre_seeding, scoped_map), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject with_preseeded_partition_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pre_seeding = NIL;
        destructuring_bind_must_consp(current, datum, $list154);
        pre_seeding = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$96 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list154);
            current_$96 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list154);
            if (NIL == member(current_$96, $list155, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$96 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list154);
        }
        final SubLObject expected_total_tail = property_list_member($EXPECTED_TOTAL, current);
        final SubLObject expected_total = (NIL != expected_total_tail) ? cadr(expected_total_tail) : $int$100;
        final SubLObject scoped_map_tail = property_list_member($SCOPED_MAP, current);
        final SubLObject scoped_map = (NIL != scoped_map_tail) ? cadr(scoped_map_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CLET, list($list160, list($load_partition_constants$, list(NEW_LOAD_PARTITION_CONSTANTS_STORE, expected_total)), list($load_partition_scope_constants$, list(FWHEN, list(HASH_TABLE_P, scoped_map), list(NEW_LOAD_PARTITION_SCOPE_CONSTANTS_STORE, expected_total)))), list(PRESEED_LOAD_PARTITION_CONSTANTS_STORE, pre_seeding, scoped_map), append(body, NIL));
    }

    /**
     * A wrapper function that allows us to keep the macrology private.
     */
    @LispMethod(comment = "A wrapper function that allows us to keep the macrology private.")
    public static final SubLObject load_partition_from_stream_with_preseeding_alt(SubLObject stream, SubLObject preseeding, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $preseeded_partition_constants$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $load_partition_constants$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $load_partition_scope_constants$.currentBinding(thread);
                    try {
                        $preseeded_partition_constants$.bind(T, thread);
                        $load_partition_constants$.bind(com.cyc.cycjava.cycl.partitions.new_load_partition_constants_store($int$100), thread);
                        $load_partition_scope_constants$.bind(NIL.isHashtable() ? ((SubLObject) (com.cyc.cycjava.cycl.partitions.new_load_partition_scope_constants_store($int$100))) : NIL, thread);
                        com.cyc.cycjava.cycl.partitions.preseed_load_partition_constants_store(preseeding, NIL);
                        result = com.cyc.cycjava.cycl.partitions.load_partition_from_stream(stream, reset_sbhl_linksP);
                    } finally {
                        $load_partition_scope_constants$.rebind(_prev_bind_2, thread);
                        $load_partition_constants$.rebind(_prev_bind_1, thread);
                        $preseeded_partition_constants$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * A wrapper function that allows us to keep the macrology private.
     */
    @LispMethod(comment = "A wrapper function that allows us to keep the macrology private.")
    public static SubLObject load_partition_from_stream_with_preseeding(final SubLObject stream, final SubLObject preseeding, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = $reset_sbhl_links$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $preseeded_partition_constants$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $load_partition_constants$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $load_partition_scope_constants$.currentBinding(thread);
        try {
            $preseeded_partition_constants$.bind(T, thread);
            $load_partition_constants$.bind(new_load_partition_constants_store($int$100), thread);
            $load_partition_scope_constants$.bind(NIL.isHashtable() ? new_load_partition_scope_constants_store($int$100) : NIL, thread);
            preseed_load_partition_constants_store(preseeding, NIL);
            result = load_partition_from_stream(stream, reset_sbhl_linksP);
        } finally {
            $load_partition_scope_constants$.rebind(_prev_bind_3, thread);
            $load_partition_constants$.rebind(_prev_bind_2, thread);
            $preseeded_partition_constants$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject link_partition_constant_error_1_alt(SubLObject name, SubLObject external_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing = constants_high.find_constant_by_external_id(external_id);
                SubLObject new_name = constants_high.constant_name(existing);
                if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn($str_alt137$NAME_change_for__S___new_name_is_, name, new_name);
                }
                return existing;
            }
        }
    }

    public static SubLObject link_partition_constant_error_1(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = constants_high.find_constant_by_external_id(external_id);
        final SubLObject new_name = constants_high.constant_name(existing);
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str168$NAME_change_for__S___new_name_is_, name, new_name);
        }
        return existing;
    }

    public static final SubLObject link_partition_constant_error_2_alt(SubLObject name, SubLObject external_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing = constants_high.find_constant_by_external_id(external_id);
                SubLObject new_name = constants_high.constant_name(existing);
                if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn($str_alt137$NAME_change_for__S___new_name_is_, name, new_name);
                }
                return existing;
            }
        }
    }

    public static SubLObject link_partition_constant_error_2(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = constants_high.find_constant_by_external_id(external_id);
        final SubLObject new_name = constants_high.constant_name(existing);
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str168$NAME_change_for__S___new_name_is_, name, new_name);
        }
        return existing;
    }

    public static final SubLObject link_partition_constant_error_3_alt(SubLObject name, SubLObject external_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != constants_high.uninstalled_constant_p(constants_high.find_constant(name))) {
                if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn($str_alt138$installing_ID__S_for__S, external_id, name);
                }
                return com.cyc.cycjava.cycl.partitions.link_partition_install_constant_id(name, external_id);
            }
            {
                SubLObject new_name = constant_completion_high.uniquify_constant_name(name);
                if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn($str_alt139$NAME_clash_for__S___renaming_to__, name, new_name);
                }
                return com.cyc.cycjava.cycl.partitions.link_partition_create_constant(new_name, external_id);
            }
        }
    }

    public static SubLObject link_partition_constant_error_3(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constants_high.uninstalled_constant_p(constants_high.find_constant(name))) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str169$installing_ID__S_for__S, external_id, name);
            }
            return link_partition_install_constant_id(name, external_id);
        }
        final SubLObject new_name = constant_completion_high.uniquify_constant_name(name, UNPROVIDED);
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str170$NAME_clash_for__S___renaming_to__, name, new_name);
        }
        return link_partition_create_constant(new_name, external_id);
    }

    public static final SubLObject link_partition_constant_error_4_alt(SubLObject name, SubLObject external_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing = constants_high.find_constant_by_external_id(external_id);
                SubLObject new_name = constants_high.constant_name(existing);
                if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn($str_alt137$NAME_change_for__S___new_name_is_, name, new_name);
                }
                return existing;
            }
        }
    }

    public static SubLObject link_partition_constant_error_4(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = constants_high.find_constant_by_external_id(external_id);
        final SubLObject new_name = constants_high.constant_name(existing);
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str168$NAME_change_for__S___new_name_is_, name, new_name);
        }
        return existing;
    }

    public static final SubLObject link_partition_constant_error_5_alt(SubLObject name, SubLObject external_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing = constants_high.find_constant_by_external_id(external_id);
                SubLObject new_name = constants_high.constant_name(existing);
                if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn($str_alt137$NAME_change_for__S___new_name_is_, name, new_name);
                }
                return existing;
            }
        }
    }

    public static SubLObject link_partition_constant_error_5(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = constants_high.find_constant_by_external_id(external_id);
        final SubLObject new_name = constants_high.constant_name(existing);
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str168$NAME_change_for__S___new_name_is_, name, new_name);
        }
        return existing;
    }

    public static final SubLObject link_partition_constant_error_6_alt(SubLObject name, SubLObject external_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != constants_high.uninstalled_constant_p(constants_high.find_constant(name))) {
                if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn($str_alt138$installing_ID__S_for__S, external_id, name);
                }
                return com.cyc.cycjava.cycl.partitions.link_partition_install_constant_id(name, external_id);
            }
            {
                SubLObject new_name = constant_completion_high.uniquify_constant_name(name);
                if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn($str_alt139$NAME_clash_for__S___renaming_to__, name, new_name);
                }
                return com.cyc.cycjava.cycl.partitions.link_partition_create_constant(new_name, external_id);
            }
        }
    }

    public static SubLObject link_partition_constant_error_6(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constants_high.uninstalled_constant_p(constants_high.find_constant(name))) {
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str169$installing_ID__S_for__S, external_id, name);
            }
            return link_partition_install_constant_id(name, external_id);
        }
        final SubLObject new_name = constant_completion_high.uniquify_constant_name(name, UNPROVIDED);
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str170$NAME_clash_for__S___renaming_to__, name, new_name);
        }
        return link_partition_create_constant(new_name, external_id);
    }

    public static final SubLObject link_partition_constant_error_7_alt(SubLObject name, SubLObject external_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str_alt140$Constant_with_NAME__S_and_ID__S_m, name, external_id);
            }
            return com.cyc.cycjava.cycl.partitions.link_partition_create_constant(name, external_id);
        }
    }

    public static SubLObject link_partition_constant_error_7(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str171$Constant_with_NAME__S_and_ID__S_m, name, external_id);
        }
        return link_partition_create_constant(name, external_id);
    }

    public static final SubLObject clear_load_partition_narts_alt(SubLObject total) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$load_partition_narts$.getDynamicValue(thread).isHashtable()) {
                $load_partition_narts$.setDynamicValue(make_hash_table(total, symbol_function(EQL), UNPROVIDED), thread);
            }
            clrhash($load_partition_narts$.getDynamicValue(thread));
            if (!$load_partition_scope_narts$.getDynamicValue(thread).isHashtable()) {
                $load_partition_scope_narts$.setDynamicValue(make_hash_table(integerDivide(total, TEN_INTEGER), symbol_function(EQL), UNPROVIDED), thread);
            }
            clrhash($load_partition_scope_narts$.getDynamicValue(thread));
            if (!$load_partition_missing_narts$.getDynamicValue(thread).isHashtable()) {
                $load_partition_missing_narts$.setDynamicValue(make_hash_table(integerDivide(total, TEN_INTEGER), UNPROVIDED, UNPROVIDED), thread);
            }
            clrhash($load_partition_missing_narts$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject clear_load_partition_narts(final SubLObject total) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$load_partition_narts$.getDynamicValue(thread).isHashtable()) {
            $load_partition_narts$.setDynamicValue(make_hash_table(total, symbol_function(EQL), UNPROVIDED), thread);
        }
        clrhash($load_partition_narts$.getDynamicValue(thread));
        if (!$load_partition_scope_narts$.getDynamicValue(thread).isHashtable()) {
            $load_partition_scope_narts$.setDynamicValue(make_hash_table(integerDivide(total, TEN_INTEGER), symbol_function(EQL), UNPROVIDED), thread);
        }
        clrhash($load_partition_scope_narts$.getDynamicValue(thread));
        if (!$load_partition_missing_narts$.getDynamicValue(thread).isHashtable()) {
            $load_partition_missing_narts$.setDynamicValue(make_hash_table(integerDivide(total, TEN_INTEGER), UNPROVIDED, UNPROVIDED), thread);
        }
        clrhash($load_partition_missing_narts$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject gather_load_partition_scope_narts_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return hash_table_values($load_partition_scope_narts$.getDynamicValue(thread));
        }
    }

    public static SubLObject gather_load_partition_scope_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.hash_table_values($load_partition_scope_narts$.getDynamicValue(thread));
    }

    public static final SubLObject gather_load_partition_missing_narts_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($load_partition_missing_narts$.getDynamicValue(thread).isHashtable()) {
                return hash_table_values($load_partition_missing_narts$.getDynamicValue(thread));
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject gather_load_partition_missing_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($load_partition_missing_narts$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values($load_partition_missing_narts$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject note_load_partition_nart_alt(SubLObject id, SubLObject nart, SubLObject scopeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(id, $load_partition_narts$.getDynamicValue(thread), nart);
            if (NIL != scopeP) {
                sethash(id, $load_partition_scope_narts$.getDynamicValue(thread), nart);
            }
            return NIL;
        }
    }

    public static SubLObject note_load_partition_nart(final SubLObject id, final SubLObject nart, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(id, $load_partition_narts$.getDynamicValue(thread), nart);
        if (NIL != scopeP) {
            sethash(id, $load_partition_scope_narts$.getDynamicValue(thread), nart);
        }
        return NIL;
    }

    public static final SubLObject note_load_partition_missing_nart_alt(SubLObject id, SubLObject nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(id, $load_partition_missing_narts$.getDynamicValue(thread), nart);
            return NIL;
        }
    }

    public static SubLObject note_load_partition_missing_nart(final SubLObject id, final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(id, $load_partition_missing_narts$.getDynamicValue(thread), nart);
        return NIL;
    }

    public static final SubLObject partition_find_nart_by_id_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nart = gethash_without_values(id, $load_partition_narts$.getDynamicValue(thread), UNPROVIDED);
                if (NIL == nart) {
                    nart = com.cyc.cycjava.cycl.partitions.partition_missing_nart_link_error(id);
                }
                return nart;
            }
        }
    }

    public static SubLObject partition_find_nart_by_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nart = gethash_without_values(id, $load_partition_narts$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == nart) {
            nart = partition_missing_nart_link_error(id);
        }
        return nart;
    }

    public static final SubLObject link_partition_nart_shell_alt(SubLObject id, SubLObject nart_hl_formula, SubLObject scopeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nart = narts_high.find_nart(nart_hl_formula);
                if (NIL == nart) {
                    if (NIL == scopeP) {
                        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                            Errors.warn($str_alt141$Non_scope_NART__S_not_found_, nart_hl_formula);
                        }
                    }
                    nart = com.cyc.cycjava.cycl.partitions.link_partition_create_nart_shell(nart_hl_formula);
                    com.cyc.cycjava.cycl.partitions.note_load_partition_missing_nart(id, nart);
                }
                com.cyc.cycjava.cycl.partitions.note_load_partition_nart(id, nart, scopeP);
                return nart;
            }
        }
    }

    public static SubLObject link_partition_nart_shell(final SubLObject id, final SubLObject nart_hl_formula, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
            SubLObject nart = narts_high.find_nart(nart_hl_formula);
            if (NIL == nart_handles.nart_p(nart)) {
                if ((NIL == scopeP) && (NIL != $trace_partition_link_errors$.getDynamicValue(thread))) {
                    Errors.warn($str172$Non_scope_NART__S_not_found_, nart_hl_formula);
                }
                nart = link_partition_create_nart_shell(nart_hl_formula);
                note_load_partition_missing_nart(id, nart);
            }
            note_load_partition_nart(id, nart, scopeP);
            return nart;
        } finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject link_partition_create_nart_shell_alt(SubLObject nart_hl_formula) {
        return narts_interface.kb_create_nart(nart_hl_formula);
    }

    public static SubLObject link_partition_create_nart_shell(final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
            return narts_interface.kb_create_nart(nart_hl_formula);
        } finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject partition_missing_nart_link_error_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str_alt142$Did_not_find_NART__D_, id);
            }
            {
                SubLObject invalid_nart = nart_handles.partition_create_invalid_nart();
                com.cyc.cycjava.cycl.partitions.note_load_partition_nart(id, invalid_nart, NIL);
                com.cyc.cycjava.cycl.partitions.note_load_partition_missing_nart(id, invalid_nart);
                return invalid_nart;
            }
        }
    }

    public static SubLObject partition_missing_nart_link_error(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str173$Did_not_find_NART__D_, id);
        }
        final SubLObject invalid_nart = nart_handles.partition_create_invalid_nart();
        note_load_partition_nart(id, invalid_nart, NIL);
        note_load_partition_missing_nart(id, invalid_nart);
        return invalid_nart;
    }

    public static final SubLObject clear_load_partition_assertions_alt(SubLObject total) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$load_partition_assertions$.getDynamicValue(thread).isHashtable()) {
                $load_partition_assertions$.setDynamicValue(make_hash_table(total, symbol_function(EQL), UNPROVIDED), thread);
            }
            clrhash($load_partition_assertions$.getDynamicValue(thread));
            if (!$load_partition_missing_assertions$.getDynamicValue(thread).isHashtable()) {
                $load_partition_missing_assertions$.setDynamicValue(make_hash_table(integerDivide(total, TEN_INTEGER), UNPROVIDED, UNPROVIDED), thread);
            }
            clrhash($load_partition_missing_assertions$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject clear_load_partition_assertions(final SubLObject total) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$load_partition_assertions$.getDynamicValue(thread).isHashtable()) {
            $load_partition_assertions$.setDynamicValue(make_hash_table(total, symbol_function(EQL), UNPROVIDED), thread);
        }
        clrhash($load_partition_assertions$.getDynamicValue(thread));
        if (!$load_partition_missing_assertions$.getDynamicValue(thread).isHashtable()) {
            $load_partition_missing_assertions$.setDynamicValue(make_hash_table(integerDivide(total, TEN_INTEGER), UNPROVIDED, UNPROVIDED), thread);
        }
        clrhash($load_partition_missing_assertions$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject gather_load_partition_assertions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return hash_table_values($load_partition_assertions$.getDynamicValue(thread));
        }
    }

    public static SubLObject gather_load_partition_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.hash_table_values($load_partition_assertions$.getDynamicValue(thread));
    }

    public static final SubLObject gather_load_partition_missing_assertions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($load_partition_missing_assertions$.getDynamicValue(thread).isHashtable()) {
                return hash_table_values($load_partition_missing_assertions$.getDynamicValue(thread));
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject gather_load_partition_missing_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($load_partition_missing_assertions$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values($load_partition_missing_assertions$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject note_load_partition_assertion_alt(SubLObject id, SubLObject assertion, SubLObject scopeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(id, $load_partition_assertions$.getDynamicValue(thread), assertion);
            return NIL;
        }
    }

    public static SubLObject note_load_partition_assertion(final SubLObject id, final SubLObject assertion, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(id, $load_partition_assertions$.getDynamicValue(thread), assertion);
        return NIL;
    }

    public static final SubLObject note_load_partition_missing_assertion_alt(SubLObject id, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(id, $load_partition_missing_assertions$.getDynamicValue(thread), assertion);
            return NIL;
        }
    }

    public static SubLObject note_load_partition_missing_assertion(final SubLObject id, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(id, $load_partition_missing_assertions$.getDynamicValue(thread), assertion);
        return NIL;
    }

    public static final SubLObject partition_find_assertion_by_id_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion = gethash_without_values(id, $load_partition_assertions$.getDynamicValue(thread), UNPROVIDED);
                if (NIL == assertion) {
                    assertion = com.cyc.cycjava.cycl.partitions.partition_missing_assertion_link_error(id);
                }
                return assertion;
            }
        }
    }

    public static SubLObject partition_find_assertion_by_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = gethash_without_values(id, $load_partition_assertions$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == assertion) {
            assertion = partition_missing_assertion_link_error(id);
        }
        return assertion;
    }

    public static final SubLObject link_partition_assertion_alt(SubLObject id, SubLObject cnf, SubLObject mt, SubLObject scopeP, SubLObject direction, SubLObject vnames) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
                if (NIL == assertion) {
                    if (NIL == scopeP) {
                        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                            Errors.warn($str_alt143$Non_scope_assertion__S___S__not_f, cnf, mt);
                        }
                    }
                    assertion = com.cyc.cycjava.cycl.partitions.link_partition_create_assertion_shell(cnf, mt, vnames, direction);
                    com.cyc.cycjava.cycl.partitions.note_load_partition_missing_assertion(id, assertion);
                }
                com.cyc.cycjava.cycl.partitions.note_load_partition_assertion(id, assertion, scopeP);
                return assertion;
            }
        }
    }

    public static SubLObject link_partition_assertion(final SubLObject id, final SubLObject cnf, final SubLObject mt, final SubLObject scopeP, final SubLObject direction, final SubLObject vnames) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
            SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
            if (NIL == assertion) {
                if ((NIL == scopeP) && (NIL != $trace_partition_link_errors$.getDynamicValue(thread))) {
                    Errors.warn($str174$Non_scope_assertion__S___S__not_f, cnf, mt);
                }
                assertion = link_partition_create_assertion_shell(cnf, mt, vnames, direction);
                note_load_partition_missing_assertion(id, assertion);
            }
            note_load_partition_assertion(id, assertion, scopeP);
            return assertion;
        } finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject link_partition_create_assertion_shell_alt(SubLObject cnf, SubLObject mt, SubLObject vnames, SubLObject direction) {
        return create_assertion(cnf, mt, vnames, direction);
    }

    public static SubLObject link_partition_create_assertion_shell(final SubLObject cnf, final SubLObject mt, final SubLObject vnames, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
            return assertions_high.create_assertion(cnf, mt, vnames, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject partition_missing_assertion_link_error_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str_alt144$Did_not_find_assertion__D_, id);
            }
            {
                SubLObject invalid_assertion = assertion_handles.partition_create_invalid_assertion();
                com.cyc.cycjava.cycl.partitions.note_load_partition_assertion(id, invalid_assertion, NIL);
                com.cyc.cycjava.cycl.partitions.note_load_partition_missing_assertion(id, invalid_assertion);
                return invalid_assertion;
            }
        }
    }

    public static SubLObject partition_missing_assertion_link_error(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str175$Did_not_find_assertion__D_, id);
        }
        final SubLObject invalid_assertion = assertion_handles.partition_create_invalid_assertion();
        note_load_partition_assertion(id, invalid_assertion, NIL);
        note_load_partition_missing_assertion(id, invalid_assertion);
        return invalid_assertion;
    }

    public static final SubLObject clear_load_partition_kb_hl_supports_alt(SubLObject total) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$load_partition_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
                $load_partition_kb_hl_supports$.setDynamicValue(make_hash_table(total, symbol_function(EQL), UNPROVIDED), thread);
            }
            clrhash($load_partition_kb_hl_supports$.getDynamicValue(thread));
            if (!$load_partition_scope_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
                $load_partition_scope_kb_hl_supports$.setDynamicValue(make_hash_table(integerDivide(total, TEN_INTEGER), symbol_function(EQL), UNPROVIDED), thread);
            }
            if (!$load_partition_missing_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
                $load_partition_missing_kb_hl_supports$.setDynamicValue(make_hash_table(integerDivide(total, TEN_INTEGER), symbol_function(EQL), UNPROVIDED), thread);
            }
            clrhash($load_partition_missing_kb_hl_supports$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject clear_load_partition_kb_hl_supports(final SubLObject total) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$load_partition_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            $load_partition_kb_hl_supports$.setDynamicValue(make_hash_table(total, symbol_function(EQL), UNPROVIDED), thread);
        }
        clrhash($load_partition_kb_hl_supports$.getDynamicValue(thread));
        if (!$load_partition_scope_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            $load_partition_scope_kb_hl_supports$.setDynamicValue(make_hash_table(integerDivide(total, TEN_INTEGER), symbol_function(EQL), UNPROVIDED), thread);
        }
        if (!$load_partition_missing_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            $load_partition_missing_kb_hl_supports$.setDynamicValue(make_hash_table(integerDivide(total, TEN_INTEGER), symbol_function(EQL), UNPROVIDED), thread);
        }
        clrhash($load_partition_missing_kb_hl_supports$.getDynamicValue(thread));
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = cons(makeSymbol("METHOD"), makeSymbol("TERM-SPEC"));

    static private final SubLList $list_alt6 = cons(makeSymbol("FUNCTION"), makeSymbol("ARGS"));

    static private final SubLString $str_alt7$Unknown_scope_partition_function_ = makeString("Unknown scope partition function ~S");

    public static final SubLObject gather_load_partition_kb_hl_supports_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($load_partition_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
                return hash_table_values($load_partition_kb_hl_supports$.getDynamicValue(thread));
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject gather_load_partition_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($load_partition_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values($load_partition_kb_hl_supports$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLSymbol $kw9$SCOPE_COMPLETELY_SPECIFIED_ = makeKeyword("SCOPE-COMPLETELY-SPECIFIED?");

    static private final SubLString $str_alt10$Unable_to_scope_partition_via__S_ = makeString("Unable to scope partition via ~S partition spec");

    static private final SubLString $str_alt12$Non_scope_object__A_not_allowed_ = makeString("Non-scope object ~A not allowed.");

    public static final SubLObject gather_load_partition_scope_kb_hl_supports_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($load_partition_scope_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
                return hash_table_values($load_partition_scope_kb_hl_supports$.getDynamicValue(thread));
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject gather_load_partition_scope_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($load_partition_scope_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values($load_partition_scope_kb_hl_supports$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject gather_load_partition_missing_kb_hl_supports_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($load_partition_missing_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
                return hash_table_values($load_partition_missing_kb_hl_supports$.getDynamicValue(thread));
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject gather_load_partition_missing_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($load_partition_missing_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values($load_partition_missing_kb_hl_supports$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject note_load_partition_kb_hl_support_alt(SubLObject id, SubLObject kb_hl_support, SubLObject scopeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(id, $load_partition_kb_hl_supports$.getDynamicValue(thread), kb_hl_support);
            if (NIL != scopeP) {
                sethash(id, $load_partition_scope_kb_hl_supports$.getDynamicValue(thread), kb_hl_support);
            }
            return NIL;
        }
    }

    public static SubLObject note_load_partition_kb_hl_support(final SubLObject id, final SubLObject kb_hl_support, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(id, $load_partition_kb_hl_supports$.getDynamicValue(thread), kb_hl_support);
        if (NIL != scopeP) {
            sethash(id, $load_partition_scope_kb_hl_supports$.getDynamicValue(thread), kb_hl_support);
        }
        return NIL;
    }

    public static final SubLObject note_load_partition_missing_kb_hl_support_alt(SubLObject id, SubLObject kb_hl_support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(id, $load_partition_missing_kb_hl_supports$.getDynamicValue(thread), kb_hl_support);
            return NIL;
        }
    }

    public static SubLObject note_load_partition_missing_kb_hl_support(final SubLObject id, final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(id, $load_partition_missing_kb_hl_supports$.getDynamicValue(thread), kb_hl_support);
        return NIL;
    }

    static private final SubLString $str_alt29$_______S_constants = makeString("~%;;; ~S constants");

    public static final SubLObject partition_find_kb_hl_support_by_id_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kb_hl_support = gethash_without_values(id, $load_partition_kb_hl_supports$.getDynamicValue(thread), UNPROVIDED);
                if (NIL == kb_hl_support) {
                    kb_hl_support = com.cyc.cycjava.cycl.partitions.partition_missing_kb_hl_support_link_error(id);
                }
                return kb_hl_support;
            }
        }
    }

    public static SubLObject partition_find_kb_hl_support_by_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kb_hl_support = gethash_without_values(id, $load_partition_kb_hl_supports$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == kb_hl_support) {
            kb_hl_support = partition_missing_kb_hl_support_link_error(id);
        }
        return kb_hl_support;
    }

    static private final SubLString $str_alt30$___A_S = makeString("~%~A~S");

    static private final SubLString $str_alt31$___ = makeString("(*)");

    static private final SubLString $str_alt32$___ = makeString("   ");

    static private final SubLString $str_alt33$______Max_NART_level____S = makeString("~%;;; Max NART level : ~S");

    static private final SubLString $str_alt34$______level__S_NARTs = makeString("~%;;; level ~S NARTs");

    public static final SubLObject link_partition_kb_hl_support_alt(SubLObject id, SubLObject hl_support, SubLObject justification, SubLObject scopeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kb_hl_support = kb_hl_supports.find_kb_hl_support(hl_support);
                if (NIL == kb_hl_support) {
                    if (NIL == scopeP) {
                        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                            Errors.warn($str_alt145$Non_scope_KB_HL_support__S_not_fo, hl_support);
                        }
                    }
                    kb_hl_support = com.cyc.cycjava.cycl.partitions.link_partition_create_kb_hl_support(hl_support, justification);
                    com.cyc.cycjava.cycl.partitions.note_load_partition_missing_kb_hl_support(id, kb_hl_support);
                }
                com.cyc.cycjava.cycl.partitions.note_load_partition_kb_hl_support(id, kb_hl_support, scopeP);
                return kb_hl_support;
            }
        }
    }

    public static SubLObject link_partition_kb_hl_support(final SubLObject id, final SubLObject hl_support, final SubLObject justification, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
            SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
            if (NIL == kb_hl_support) {
                if ((NIL == scopeP) && (NIL != $trace_partition_link_errors$.getDynamicValue(thread))) {
                    Errors.warn($str176$Non_scope_KB_HL_support__S_not_fo, hl_support);
                }
                kb_hl_support = link_partition_create_kb_hl_support(hl_support, justification);
                note_load_partition_missing_kb_hl_support(id, kb_hl_support);
            }
            note_load_partition_kb_hl_support(id, kb_hl_support, scopeP);
            return kb_hl_support;
        } finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }

    static private final SubLString $str_alt35$______Max_term_order___S = makeString("~%;;; Max term order: ~S");

    static private final SubLString $str_alt36$_______S_assertions = makeString("~%;;; ~S assertions");

    static private final SubLString $str_alt37$_______S_meta_assertions = makeString("~%;;; ~S meta-assertions");

    static private final SubLString $str_alt38$______order__S_meta_assertions = makeString("~%;;; order ~S meta-assertions");

    static private final SubLString $str_alt39$_______S_arguments = makeString("~%;;; ~S arguments");

    static private final SubLString $str_alt40$Deduction______S = makeString("Deduction   : ~S");

    static private final SubLString $str_alt41$Beliefs_for____S = makeString("Beliefs for : ~S");

    static private final SubLString $str_alt42$Unknown________S = makeString("Unknown (?) : ~S");

    static private final SubLString $str_alt43$______Max_KB_HL_support_level____ = makeString("~%;;; Max KB HL support level : ~S");

    static private final SubLString $str_alt44$_______S_KB_HL_supports = makeString("~%;;; ~S KB HL supports");

    static private final SubLString $str_alt45$______level__S_KB_HL_supports = makeString("~%;;; level ~S KB HL supports");

    static private final SubLList $list_alt49 = list(makeString("units"), makeString("archive"));

    static private final SubLString $str_alt52$_____FI_ASSERT___S__S__S__S_ = makeString("~%~%(FI-ASSERT '~S ~S ~S ~S)");

    static private final SubLString $str_alt54$_____FI_CREATE__a_ = makeString("~%~%(FI-CREATE ~a)");

    static private final SubLString $str_alt57$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt58$______Archive_saved_at__s____ = makeString("~%;;; Archive saved at ~s~%~%");

    static private final SubLString $str_alt62$2_2 = makeString("2.2");

    static private final SubLList $list_alt63 = list(list(makeString("2.1"), makeString("2.1.2")), list(makeString("2.1"), makeString("2.2")), list(makeString("2.1.2"), makeString("2.2")));

    public static final SubLObject link_partition_create_kb_hl_support_alt(SubLObject hl_support, SubLObject justification) {
        return kb_hl_supports.find_or_create_kb_hl_support(hl_support, justification);
    }

    public static SubLObject link_partition_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification) {
        return kb_hl_supports_high.find_or_create_kb_hl_support(hl_support, justification);
    }

    static private final SubLList $list_alt66 = list(makeSymbol("SYSTEM-NUMBER"), makeSymbol("PATCH-NUMBER"), makeSymbol("&REST"), makeSymbol("BRANCH-SPECIFICS"));

    public static final SubLObject partition_missing_kb_hl_support_link_error_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn($str_alt146$Did_not_find_KB_HL_support__D, id);
            }
            {
                SubLObject invalid_kb_hl_support = kb_hl_supports.partition_create_invalid_kb_hl_support();
                com.cyc.cycjava.cycl.partitions.note_load_partition_kb_hl_support(id, invalid_kb_hl_support, NIL);
                com.cyc.cycjava.cycl.partitions.note_load_partition_missing_kb_hl_support(id, invalid_kb_hl_support);
                return invalid_kb_hl_support;
            }
        }
    }

    public static SubLObject partition_missing_kb_hl_support_link_error(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn($str177$Did_not_find_KB_HL_support__D, id);
        }
        final SubLObject invalid_kb_hl_support = kb_hl_support_handles.partition_create_invalid_kb_hl_support();
        note_load_partition_kb_hl_support(id, invalid_kb_hl_support, NIL);
        note_load_partition_missing_kb_hl_support(id, invalid_kb_hl_support);
        return invalid_kb_hl_support;
    }

    static private final SubLString $str_alt68$_large__partition_constant_shells = makeString("(large) partition constant shells");

    static private final SubLString $str_alt71$partition_level_ = makeString("partition level ");

    static private final SubLString $str_alt72$_NART_shells = makeString(" NART shells");

    static private final SubLString $str_alt73$_large__ = makeString("(large) ");

    static private final SubLString $str_alt74$_large__partition_assertions = makeString("(large) partition assertions");

    public static final SubLObject link_partition_asserted_argument_alt(SubLObject assertion, SubLObject tv, SubLObject assert_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $forward_inference_enabledP$.currentBinding(thread);
                    try {
                        $forward_inference_enabledP$.bind(NIL, thread);
                        ans = tms.tms_possibly_replace_asserted_argument_with_tv(assertion, tv);
                    } finally {
                        $forward_inference_enabledP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != assert_info) {
                    if (NIL == assertions_low.asserted_assertion_timestampedP(assertion)) {
                        {
                            SubLObject datum = assert_info;
                            SubLObject current = datum;
                            SubLObject who = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt147);
                            current = current.rest();
                            {
                                SubLObject when = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt147);
                                current = current.rest();
                                {
                                    SubLObject why = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum, $list_alt147);
                                    current = current.rest();
                                    {
                                        SubLObject second = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                        destructuring_bind_must_listp(current, datum, $list_alt147);
                                        current = current.rest();
                                        if (NIL == current) {
                                            timestamp_asserted_assertion(assertion, who, when, why, second);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt147);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject link_partition_asserted_argument(final SubLObject assertion, final SubLObject tv, final SubLObject assert_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
            SubLObject ans = NIL;
            final SubLObject _prev_bind_0_$97 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                ans = tms.tms_possibly_replace_asserted_argument_with_tv(assertion, tv);
            } finally {
                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$97, thread);
            }
            if ((NIL != assert_info) && (NIL == assertions_low.asserted_assertion_timestampedP(assertion))) {
                final SubLObject who = (assert_info.isCons()) ? assert_info.first() : NIL;
                destructuring_bind_must_listp(assert_info, assert_info, $list178);
                SubLObject current = assert_info.rest();
                final SubLObject when = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, assert_info, $list178);
                current = current.rest();
                final SubLObject why = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, assert_info, $list178);
                current = current.rest();
                final SubLObject second = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, assert_info, $list178);
                current = current.rest();
                if (NIL == current) {
                    assertions_high.timestamp_asserted_assertion(assertion, who, when, why, second);
                } else {
                    cdestructuring_bind_error(assert_info, $list178);
                }
            }
            return ans;
        } finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }

    static private final SubLString $str_alt76$partition_order_ = makeString("partition order ");

    static private final SubLString $str_alt77$_meta_assertions = makeString(" meta assertions");

    static private final SubLString $str_alt78$_KB_HL_supports = makeString(" KB HL supports");

    static private final SubLString $str_alt79$_large__partition_beliefs = makeString("(large) partition beliefs");

    static private final SubLString $str_alt80$_large__partition_deductions = makeString("(large) partition deductions");

    static private final SubLString $str_alt81$_large__partition_bookkeeping_inf = makeString("(large) partition bookkeeping info");

    static private final SubLString $str_alt83$Unknown_argument_object__S = makeString("Unknown argument object ~S");

    static private final SubLString $str_alt84$Unable_to_dump_belief__S = makeString("Unable to dump belief ~S");

    static private final SubLList $list_alt85 = list(makeSymbol("CNF"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"), makeSymbol("VARIABLE-MAP"));

    static private final SubLString $str_alt86$cleaning_up_after_partition_load_ = makeString("cleaning up after partition load...~%");

    static private final SubLSymbol $sym88$LOAD_PARTITION_INVALID_MISSING_TERM_ = makeSymbol("LOAD-PARTITION-INVALID-MISSING-TERM?");

    static private final SubLString $str_alt89$partition_load_KB_cleanup_removed = makeString("partition load KB cleanup removed:~%");

    static private final SubLString $str_alt90$__A_constants__ = makeString(" ~A constants~%");

    static private final SubLString $str_alt91$__A_NARTs__ = makeString(" ~A NARTs~%");

    static private final SubLString $str_alt92$__A_assertions__ = makeString(" ~A assertions~%");

    static private final SubLString $str_alt100$partition_format_is__A__not__A__a = makeString("partition format is ~A, not ~A, and these versions are incompatible");

    static private final SubLString $str_alt105$loading_partition_level_ = makeString("loading partition level ");

    static private final SubLString $str_alt106$_narts = makeString(" narts");

    static private final SubLString $str_alt109$loading_partition_order_ = makeString("loading partition order ");

    static private final SubLString $str_alt110$_meta_assertions = makeString(" meta-assertions");

    private static final SubLSymbol TV_P = makeSymbol("TV-P");

    static private final SubLString $str_alt121$Did_not_find_constant__D_ = makeString("Did not find constant ~D.");

    public static final SubLObject link_partition_deduction_alt(SubLObject assertion, SubLObject supports, SubLObject tv) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $forward_inference_enabledP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.currentBinding(thread);
                    try {
                        $forward_inference_enabledP$.bind(NIL, thread);
                        argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.bind(T, thread);
                        ans = tms.tms_add_deduction_for_assertion(assertion, supports, tv_truth(tv));
                    } finally {
                        argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.rebind(_prev_bind_1, thread);
                        $forward_inference_enabledP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject link_partition_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
            SubLObject ans = NIL;
            final SubLObject _prev_bind_0_$98 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
            final SubLObject _prev_bind_1_$99 = argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.bind(T, thread);
                ans = tms.tms_add_deduction_for_assertion(assertion, supports, enumeration_types.tv_truth(tv), UNPROVIDED, UNPROVIDED);
            } finally {
                argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.rebind(_prev_bind_1_$99, thread);
                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$98, thread);
            }
            return ans;
        } finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }

    static private final SubLList $list_alt123 = list(list(makeSymbol("PRE-SEEDING"), makeSymbol("&KEY"), list(makeSymbol("EXPECTED-TOTAL"), makeInteger(100)), makeSymbol("SCOPED-MAP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt124 = list(makeKeyword("EXPECTED-TOTAL"), makeKeyword("SCOPED-MAP"));

    static private final SubLList $list_alt129 = list(makeSymbol("*PRESEEDED-PARTITION-CONSTANTS*"), T);

    static private final SubLString $str_alt137$NAME_change_for__S___new_name_is_ = makeString("NAME change for ~S ; new name is ~S");

    static private final SubLString $str_alt138$installing_ID__S_for__S = makeString("installing ID ~S for ~S");

    static private final SubLString $str_alt139$NAME_clash_for__S___renaming_to__ = makeString("NAME clash for ~S ; renaming to ~S");

    static private final SubLString $str_alt140$Constant_with_NAME__S_and_ID__S_m = makeString("Constant with NAME ~S and ID ~S missing");

    static private final SubLString $str_alt141$Non_scope_NART__S_not_found_ = makeString("Non-scope NART ~S not found.");

    static private final SubLString $str_alt142$Did_not_find_NART__D_ = makeString("Did not find NART ~D.");

    static private final SubLString $str_alt143$Non_scope_assertion__S___S__not_f = makeString("Non-scope assertion ~S (~S) not found.");

    static private final SubLString $str_alt144$Did_not_find_assertion__D_ = makeString("Did not find assertion ~D.");

    static private final SubLString $str_alt145$Non_scope_KB_HL_support__S_not_fo = makeString("Non-scope KB HL support ~S not found.");

    static private final SubLString $str_alt146$Did_not_find_KB_HL_support__D = makeString("Did not find KB HL support ~D");

    static private final SubLList $list_alt147 = list(makeSymbol("&OPTIONAL"), makeSymbol("WHO"), makeSymbol("WHEN"), makeSymbol("WHY"), makeSymbol("SECOND"));

    static private final SubLString $str_alt148$Could_not_assert__a_in__a_with_st = makeString("Could not assert ~a in ~a with strength ~s and direction ~s and variable-map ~s");

    public static final SubLObject link_partition_assertible_alt(SubLObject cnf, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject variable_map) {
        {
            SubLObject successP = hl_assert(cnf, mt, strength, direction, variable_map);
            if (NIL == successP) {
                Errors.warn($str_alt148$Could_not_assert__a_in__a_with_st, new SubLObject[]{ cnf, mt, strength, direction, variable_map });
            }
            return successP;
        }
    }

    public static SubLObject link_partition_assertible(final SubLObject cnf, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject successP = hl_storage_modules.hl_assert(cnf, mt, strength, direction, variable_map);
        if (NIL == successP) {
            Errors.warn($str179$Could_not_assert__a_in__a_with_st, new SubLObject[]{ cnf, mt, strength, direction, variable_map });
        }
        return successP;
    }

    public static final SubLObject clear_partition_loader_state_alt() {
        $load_partition_constants$.setDynamicValue(NIL);
        $load_partition_scope_constants$.setDynamicValue(NIL);
        $load_partition_missing_constants$.setDynamicValue(NIL);
        $load_partition_narts$.setDynamicValue(NIL);
        $load_partition_scope_narts$.setDynamicValue(NIL);
        $load_partition_missing_narts$.setDynamicValue(NIL);
        $load_partition_assertions$.setDynamicValue(NIL);
        $load_partition_missing_assertions$.setDynamicValue(NIL);
        $load_partition_kb_hl_supports$.setDynamicValue(NIL);
        $load_partition_scope_kb_hl_supports$.setDynamicValue(NIL);
        $load_partition_missing_kb_hl_supports$.setDynamicValue(NIL);
        $load_partition_max_nart_complexity$.setDynamicValue(ZERO_INTEGER);
        $load_partition_max_term_order$.setDynamicValue(ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject clear_partition_loader_state() {
        $load_partition_constants$.setDynamicValue(NIL);
        $load_partition_scope_constants$.setDynamicValue(NIL);
        $load_partition_missing_constants$.setDynamicValue(NIL);
        $load_partition_narts$.setDynamicValue(NIL);
        $load_partition_scope_narts$.setDynamicValue(NIL);
        $load_partition_missing_narts$.setDynamicValue(NIL);
        $load_partition_assertions$.setDynamicValue(NIL);
        $load_partition_missing_assertions$.setDynamicValue(NIL);
        $load_partition_kb_hl_supports$.setDynamicValue(NIL);
        $load_partition_scope_kb_hl_supports$.setDynamicValue(NIL);
        $load_partition_missing_kb_hl_supports$.setDynamicValue(NIL);
        $load_partition_max_nart_complexity$.setDynamicValue(ZERO_INTEGER);
        $load_partition_max_term_order$.setDynamicValue(ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject declare_partitions_file_alt() {
        declareFunction("partition_scope_completely_specifiedP", "PARTITION-SCOPE-COMPLETELY-SPECIFIED?", 0, 0, false);
        declareFunction("scope_partition", "SCOPE-PARTITION", 1, 0, false);
        declareFunction("partition_scope_term_p", "PARTITION-SCOPE-TERM-P", 1, 0, false);
        declareFunction("clear_partition_scope", "CLEAR-PARTITION-SCOPE", 0, 0, false);
        declareFunction("partition_term_spec_to_term", "PARTITION-TERM-SPEC-TO-TERM", 1, 0, false);
        declareFunction("partition_term_spec_to_term_internal", "PARTITION-TERM-SPEC-TO-TERM-INTERNAL", 1, 0, false);
        declareFunction("scope_partition_object_only", "SCOPE-PARTITION-OBJECT-ONLY", 1, 0, false);
        declareFunction("scope_partition_assertion", "SCOPE-PARTITION-ASSERTION", 1, 0, false);
        declareFunction("scope_partition_assertion_and_meta_assertions", "SCOPE-PARTITION-ASSERTION-AND-META-ASSERTIONS", 1, 0, false);
        declareFunction("scope_partition_assertion_selective", "SCOPE-PARTITION-ASSERTION-SELECTIVE", 1, 0, false);
        declareFunction("scope_partition_term", "SCOPE-PARTITION-TERM", 1, 0, false);
        declareFunction("scope_partition_definition", "SCOPE-PARTITION-DEFINITION", 1, 0, false);
        declareFunction("scope_partition_term_and_narts", "SCOPE-PARTITION-TERM-AND-NARTS", 1, 0, false);
        declareFunction("scope_partition_term_in_mt", "SCOPE-PARTITION-TERM-IN-MT", 2, 0, false);
        declareFunction("selected_scope_partition_term", "SELECTED-SCOPE-PARTITION-TERM", 1, 0, false);
        declareFunction("scope_partition_ontology", "SCOPE-PARTITION-ONTOLOGY", 1, 0, false);
        declareFunction("selected_scope_partition_ontology", "SELECTED-SCOPE-PARTITION-ONTOLOGY", 1, 0, false);
        declareFunction("scope_partition_arg_index", "SCOPE-PARTITION-ARG-INDEX", 2, 3, false);
        declareFunction("scope_partition_predicate_rule_index", "SCOPE-PARTITION-PREDICATE-RULE-INDEX", 2, 2, false);
        declareFunction("scope_partition_mt_index", "SCOPE-PARTITION-MT-INDEX", 1, 0, false);
        declareFunction("scope_partition_other_index", "SCOPE-PARTITION-OTHER-INDEX", 1, 0, false);
        declareFunction("scope_partition_deduction", "SCOPE-PARTITION-DEDUCTION", 1, 0, false);
        declareFunction("every_possible_instance", "EVERY-POSSIBLE-INSTANCE", 1, 0, false);
        declareFunction("every_possible_spec", "EVERY-POSSIBLE-SPEC", 1, 0, false);
        declareFunction("scope_partition_term_internal", "SCOPE-PARTITION-TERM-INTERNAL", 1, 0, false);
        declareFunction("selected_scope_partition_term_internal", "SELECTED-SCOPE-PARTITION-TERM-INTERNAL", 1, 0, false);
        declareFunction("clear_partition_content", "CLEAR-PARTITION-CONTENT", 0, 1, false);
        declareFunction("partition_estimated_assertion_count", "PARTITION-ESTIMATED-ASSERTION-COUNT", 1, 0, false);
        declareFunction("partition_scope_completely_specified_by_partitionP", "PARTITION-SCOPE-COMPLETELY-SPECIFIED-BY-PARTITION?", 1, 0, false);
        declareFunction("mark_partition_content", "MARK-PARTITION-CONTENT", 1, 0, false);
        declareFunction("mark_partition_bookkeeping_terms", "MARK-PARTITION-BOOKKEEPING-TERMS", 1, 0, false);
        declareFunction("mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant", "MARK-PARTITION-TERMS-MENTIONED-IN-BOOKKEEPING-ASSERTIONS-OF-CONSTANT", 1, 0, false);
        declareFunction("mark_partition_object", "MARK-PARTITION-OBJECT", 1, 0, false);
        declareFunction("mark_partition_object_cons_method", "MARK-PARTITION-OBJECT-CONS-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_constant_method", "MARK-PARTITION-OBJECT-CONSTANT-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_constant", "MARK-PARTITION-OBJECT-CONSTANT", 1, 0, false);
        declareFunction("mark_partition_object_nart_method", "MARK-PARTITION-OBJECT-NART-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_nart", "MARK-PARTITION-OBJECT-NART", 1, 0, false);
        declareFunction("mark_partition_object_assertion_method", "MARK-PARTITION-OBJECT-ASSERTION-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_deduction_method", "MARK-PARTITION-OBJECT-DEDUCTION-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_deduction", "MARK-PARTITION-OBJECT-DEDUCTION", 1, 0, false);
        declareFunction("mark_partition_object_kb_hl_support_method", "MARK-PARTITION-OBJECT-KB-HL-SUPPORT-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_kb_hl_support", "MARK-PARTITION-OBJECT-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("mark_partition_assertion_beliefs", "MARK-PARTITION-ASSERTION-BELIEFS", 1, 0, false);
        declareFunction("mark_partition_assertion_deduction", "MARK-PARTITION-ASSERTION-DEDUCTION", 1, 0, false);
        declareFunction("note_partition_kb_hl_support_order", "NOTE-PARTITION-KB-HL-SUPPORT-ORDER", 1, 0, false);
        declareFunction("partition_kb_hl_support_order", "PARTITION-KB-HL-SUPPORT-ORDER", 1, 0, false);
        declareFunction("display_partition_content", "DISPLAY-PARTITION-CONTENT", 0, 0, false);
        declareFunction("remove_partition", "REMOVE-PARTITION", 1, 0, false);
        declareFunction("remove_scoped_partition", "REMOVE-SCOPED-PARTITION", 0, 0, false);
        declareFunction("make_archive_filename", "MAKE-ARCHIVE-FILENAME", 1, 0, false);
        declareFunction("archive_assertion_if_local", "ARCHIVE-ASSERTION-IF-LOCAL", 1, 0, false);
        declareFunction("archive_term", "ARCHIVE-TERM", 1, 1, false);
        declareFunction("archive_ontology", "ARCHIVE-ONTOLOGY", 1, 1, false);
        declareFunction("archive_partition", "ARCHIVE-PARTITION", 2, 1, false);
        declareFunction("remove_partition_term", "REMOVE-PARTITION-TERM", 1, 0, false);
        declareFunction("save_partition", "SAVE-PARTITION", 2, 0, false);
        declareFunction("save_partition_to_stream", "SAVE-PARTITION-TO-STREAM", 2, 0, false);
        declareFunction("excise_partition_to_stream", "EXCISE-PARTITION-TO-STREAM", 2, 0, false);
        declareFunction("partition_common_symbols", "PARTITION-COMMON-SYMBOLS", 0, 0, false);
        declareFunction("dump_partition_to_stream", "DUMP-PARTITION-TO-STREAM", 1, 0, false);
        declareFunction("dump_partition_section_marker", "DUMP-PARTITION-SECTION-MARKER", 1, 0, false);
        declareFunction("dump_partition_info", "DUMP-PARTITION-INFO", 1, 0, false);
        declareFunction("large_partitionP", "LARGE-PARTITION?", 0, 0, false);
        declareFunction("dump_partition_constant_shells", "DUMP-PARTITION-CONSTANT-SHELLS", 1, 0, false);
        declareFunction("dump_partition_constant_shell", "DUMP-PARTITION-CONSTANT-SHELL", 2, 0, false);
        declareFunction("dump_partition_nart_shells", "DUMP-PARTITION-NART-SHELLS", 1, 0, false);
        declareFunction("dump_partition_nart_shells_at_level", "DUMP-PARTITION-NART-SHELLS-AT-LEVEL", 2, 0, false);
        declareFunction("partition_nart_level_count", "PARTITION-NART-LEVEL-COUNT", 1, 0, false);
        declareFunction("dump_partition_nart_shell", "DUMP-PARTITION-NART-SHELL", 2, 0, false);
        declareFunction("dump_partition_assertions", "DUMP-PARTITION-ASSERTIONS", 1, 0, false);
        declareFunction("dump_partition_simple_assertions", "DUMP-PARTITION-SIMPLE-ASSERTIONS", 1, 0, false);
        declareFunction("dump_partition_meta_assertions", "DUMP-PARTITION-META-ASSERTIONS", 2, 0, false);
        declareFunction("partition_meta_assertion_order_count", "PARTITION-META-ASSERTION-ORDER-COUNT", 1, 0, false);
        declareFunction("dump_partition_assertion", "DUMP-PARTITION-ASSERTION", 2, 0, false);
        declareFunction("dump_partition_kb_hl_supports", "DUMP-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction("dump_partition_kb_hl_supports_at_level", "DUMP-PARTITION-KB-HL-SUPPORTS-AT-LEVEL", 2, 0, false);
        declareFunction("partition_kb_hl_support_level_count", "PARTITION-KB-HL-SUPPORT-LEVEL-COUNT", 1, 0, false);
        declareFunction("dump_partition_kb_hl_support", "DUMP-PARTITION-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("dump_partition_arguments", "DUMP-PARTITION-ARGUMENTS", 1, 0, false);
        declareFunction("dump_partition_argument", "DUMP-PARTITION-ARGUMENT", 2, 0, false);
        declareFunction("dump_partition_deduction", "DUMP-PARTITION-DEDUCTION", 2, 0, false);
        declareFunction("dump_partition_beliefs", "DUMP-PARTITION-BELIEFS", 2, 0, false);
        declareFunction("dump_partition_belief", "DUMP-PARTITION-BELIEF", 3, 0, false);
        declareFunction("dump_partition_asserted_argument", "DUMP-PARTITION-ASSERTED-ARGUMENT", 3, 0, false);
        declareFunction("dump_partition_bookkeeping_assertions_for_term", "DUMP-PARTITION-BOOKKEEPING-ASSERTIONS-FOR-TERM", 2, 0, false);
        declareFunction("dump_partition_assertible", "DUMP-PARTITION-ASSERTIBLE", 2, 0, false);
        declareFunction("load_partition_clean", "LOAD-PARTITION-CLEAN", 1, 0, false);
        declareFunction("load_partitions_clean", "LOAD-PARTITIONS-CLEAN", 1, 0, false);
        declareFunction("partition_load_kb_cleanup", "PARTITION-LOAD-KB-CLEANUP", 0, 0, false);
        declareFunction("partition_invalid_missing_terms_count", "PARTITION-INVALID-MISSING-TERMS-COUNT", 0, 0, false);
        declareFunction("load_partition_invalid_missing_termP", "LOAD-PARTITION-INVALID-MISSING-TERM?", 1, 0, false);
        declareFunction("add_load_partition_invalid_missing_term", "ADD-LOAD-PARTITION-INVALID-MISSING-TERM", 1, 0, false);
        declareFunction("load_partition", "LOAD-PARTITION", 1, 1, false);
        declareFunction("load_partition_from_stream", "LOAD-PARTITION-FROM-STREAM", 1, 1, false);
        declareFunction("load_partition_info", "LOAD-PARTITION-INFO", 1, 0, false);
        declareFunction("partition_formats_compatibleP", "PARTITION-FORMATS-COMPATIBLE?", 2, 0, false);
        declareFunction("load_partition_section_marker", "LOAD-PARTITION-SECTION-MARKER", 1, 2, false);
        declareFunction("load_partition_special_objects", "LOAD-PARTITION-SPECIAL-OBJECTS", 1, 0, false);
        declareFunction("load_partition_constant_shells", "LOAD-PARTITION-CONSTANT-SHELLS", 1, 0, false);
        declareFunction("load_partition_constant_shell", "LOAD-PARTITION-CONSTANT-SHELL", 1, 0, false);
        declareFunction("load_partition_nart_shells", "LOAD-PARTITION-NART-SHELLS", 1, 0, false);
        declareFunction("load_partition_nart_order_set", "LOAD-PARTITION-NART-ORDER-SET", 2, 0, false);
        declareFunction("load_partition_nart_shell", "LOAD-PARTITION-NART-SHELL", 1, 0, false);
        declareFunction("load_partition_assertions", "LOAD-PARTITION-ASSERTIONS", 1, 0, false);
        declareFunction("load_partition_simple_assertions", "LOAD-PARTITION-SIMPLE-ASSERTIONS", 2, 0, false);
        declareFunction("load_partition_meta_assertions", "LOAD-PARTITION-META-ASSERTIONS", 2, 0, false);
        declareFunction("load_partition_assertion_order_set", "LOAD-PARTITION-ASSERTION-ORDER-SET", 3, 0, false);
        declareFunction("load_partition_assertion", "LOAD-PARTITION-ASSERTION", 1, 0, false);
        declareFunction("load_partition_kb_hl_supports", "LOAD-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction("load_partition_kb_hl_support_order_set", "LOAD-PARTITION-KB-HL-SUPPORT-ORDER-SET", 2, 0, false);
        declareFunction("load_partition_kb_hl_support", "LOAD-PARTITION-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("load_partition_arguments", "LOAD-PARTITION-ARGUMENTS", 1, 0, false);
        declareFunction("load_partition_argument", "LOAD-PARTITION-ARGUMENT", 1, 0, false);
        declareFunction("load_partition_beliefs", "LOAD-PARTITION-BELIEFS", 1, 0, false);
        declareFunction("load_partition_asserted_argument", "LOAD-PARTITION-ASSERTED-ARGUMENT", 2, 0, false);
        declareFunction("load_partition_deduction", "LOAD-PARTITION-DEDUCTION", 1, 0, false);
        declareFunction("load_some_partition_bookkeeping_assertions", "LOAD-SOME-PARTITION-BOOKKEEPING-ASSERTIONS", 1, 0, false);
        declareFunction("load_partition_assertible", "LOAD-PARTITION-ASSERTIBLE", 1, 0, false);
        declareFunction("load_partition_possibly_weaken_hl_supports", "LOAD-PARTITION-POSSIBLY-WEAKEN-HL-SUPPORTS", 1, 0, false);
        declareFunction("replace_hl_support_module", "REPLACE-HL-SUPPORT-MODULE", 2, 0, false);
        declareFunction("clear_load_partition_constants", "CLEAR-LOAD-PARTITION-CONSTANTS", 1, 0, false);
        declareFunction("new_load_partition_constants_store", "NEW-LOAD-PARTITION-CONSTANTS-STORE", 1, 0, false);
        declareFunction("new_load_partition_scope_constants_store", "NEW-LOAD-PARTITION-SCOPE-CONSTANTS-STORE", 1, 0, false);
        declareFunction("new_load_paritition_missing_constants_store", "NEW-LOAD-PARITITION-MISSING-CONSTANTS-STORE", 1, 0, false);
        declareFunction("gather_load_partition_scope_constants", "GATHER-LOAD-PARTITION-SCOPE-CONSTANTS", 0, 0, false);
        declareFunction("gather_load_partition_missing_constants", "GATHER-LOAD-PARTITION-MISSING-CONSTANTS", 0, 0, false);
        declareFunction("note_load_partition_constant", "NOTE-LOAD-PARTITION-CONSTANT", 3, 0, false);
        declareFunction("note_load_partition_missing_constant", "NOTE-LOAD-PARTITION-MISSING-CONSTANT", 2, 0, false);
        declareFunction("partition_find_constant_by_id", "PARTITION-FIND-CONSTANT-BY-ID", 1, 0, false);
        declareFunction("partition_missing_constant_link_error", "PARTITION-MISSING-CONSTANT-LINK-ERROR", 1, 0, false);
        declareFunction("link_partition_constant_shell", "LINK-PARTITION-CONSTANT-SHELL", 4, 0, false);
        declareFunction("link_partition_create_constant", "LINK-PARTITION-CREATE-CONSTANT", 2, 0, false);
        declareFunction("link_partition_install_constant_id", "LINK-PARTITION-INSTALL-CONSTANT-ID", 2, 0, false);
        declareFunction("preseed_load_partition_constants_store", "PRESEED-LOAD-PARTITION-CONSTANTS-STORE", 1, 1, false);
        declareMacro("with_preseeded_partition_constants", "WITH-PRESEEDED-PARTITION-CONSTANTS");
        declareFunction("load_partition_from_stream_with_preseeding", "LOAD-PARTITION-FROM-STREAM-WITH-PRESEEDING", 2, 1, false);
        declareFunction("link_partition_constant_error_1", "LINK-PARTITION-CONSTANT-ERROR-1", 2, 0, false);
        declareFunction("link_partition_constant_error_2", "LINK-PARTITION-CONSTANT-ERROR-2", 2, 0, false);
        declareFunction("link_partition_constant_error_3", "LINK-PARTITION-CONSTANT-ERROR-3", 2, 0, false);
        declareFunction("link_partition_constant_error_4", "LINK-PARTITION-CONSTANT-ERROR-4", 2, 0, false);
        declareFunction("link_partition_constant_error_5", "LINK-PARTITION-CONSTANT-ERROR-5", 2, 0, false);
        declareFunction("link_partition_constant_error_6", "LINK-PARTITION-CONSTANT-ERROR-6", 2, 0, false);
        declareFunction("link_partition_constant_error_7", "LINK-PARTITION-CONSTANT-ERROR-7", 2, 0, false);
        declareFunction("clear_load_partition_narts", "CLEAR-LOAD-PARTITION-NARTS", 1, 0, false);
        declareFunction("gather_load_partition_scope_narts", "GATHER-LOAD-PARTITION-SCOPE-NARTS", 0, 0, false);
        declareFunction("gather_load_partition_missing_narts", "GATHER-LOAD-PARTITION-MISSING-NARTS", 0, 0, false);
        declareFunction("note_load_partition_nart", "NOTE-LOAD-PARTITION-NART", 3, 0, false);
        declareFunction("note_load_partition_missing_nart", "NOTE-LOAD-PARTITION-MISSING-NART", 2, 0, false);
        declareFunction("partition_find_nart_by_id", "PARTITION-FIND-NART-BY-ID", 1, 0, false);
        declareFunction("link_partition_nart_shell", "LINK-PARTITION-NART-SHELL", 3, 0, false);
        declareFunction("link_partition_create_nart_shell", "LINK-PARTITION-CREATE-NART-SHELL", 1, 0, false);
        declareFunction("partition_missing_nart_link_error", "PARTITION-MISSING-NART-LINK-ERROR", 1, 0, false);
        declareFunction("clear_load_partition_assertions", "CLEAR-LOAD-PARTITION-ASSERTIONS", 1, 0, false);
        declareFunction("gather_load_partition_assertions", "GATHER-LOAD-PARTITION-ASSERTIONS", 0, 0, false);
        declareFunction("gather_load_partition_missing_assertions", "GATHER-LOAD-PARTITION-MISSING-ASSERTIONS", 0, 0, false);
        declareFunction("note_load_partition_assertion", "NOTE-LOAD-PARTITION-ASSERTION", 3, 0, false);
        declareFunction("note_load_partition_missing_assertion", "NOTE-LOAD-PARTITION-MISSING-ASSERTION", 2, 0, false);
        declareFunction("partition_find_assertion_by_id", "PARTITION-FIND-ASSERTION-BY-ID", 1, 0, false);
        declareFunction("link_partition_assertion", "LINK-PARTITION-ASSERTION", 6, 0, false);
        declareFunction("link_partition_create_assertion_shell", "LINK-PARTITION-CREATE-ASSERTION-SHELL", 4, 0, false);
        declareFunction("partition_missing_assertion_link_error", "PARTITION-MISSING-ASSERTION-LINK-ERROR", 1, 0, false);
        declareFunction("clear_load_partition_kb_hl_supports", "CLEAR-LOAD-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction("gather_load_partition_kb_hl_supports", "GATHER-LOAD-PARTITION-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("gather_load_partition_scope_kb_hl_supports", "GATHER-LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("gather_load_partition_missing_kb_hl_supports", "GATHER-LOAD-PARTITION-MISSING-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("note_load_partition_kb_hl_support", "NOTE-LOAD-PARTITION-KB-HL-SUPPORT", 3, 0, false);
        declareFunction("note_load_partition_missing_kb_hl_support", "NOTE-LOAD-PARTITION-MISSING-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("partition_find_kb_hl_support_by_id", "PARTITION-FIND-KB-HL-SUPPORT-BY-ID", 1, 0, false);
        declareFunction("link_partition_kb_hl_support", "LINK-PARTITION-KB-HL-SUPPORT", 4, 0, false);
        declareFunction("link_partition_create_kb_hl_support", "LINK-PARTITION-CREATE-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("partition_missing_kb_hl_support_link_error", "PARTITION-MISSING-KB-HL-SUPPORT-LINK-ERROR", 1, 0, false);
        declareFunction("link_partition_asserted_argument", "LINK-PARTITION-ASSERTED-ARGUMENT", 3, 0, false);
        declareFunction("link_partition_deduction", "LINK-PARTITION-DEDUCTION", 3, 0, false);
        declareFunction("link_partition_assertible", "LINK-PARTITION-ASSERTIBLE", 5, 0, false);
        declareFunction("clear_partition_loader_state", "CLEAR-PARTITION-LOADER-STATE", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_partitions_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("partition_scope_completely_specifiedP", "PARTITION-SCOPE-COMPLETELY-SPECIFIED?", 0, 0, false);
            declareFunction("scope_partition", "SCOPE-PARTITION", 1, 0, false);
            declareFunction("partition_scope_term_p", "PARTITION-SCOPE-TERM-P", 1, 0, false);
            declareFunction("clear_partition_scope", "CLEAR-PARTITION-SCOPE", 0, 0, false);
            declareFunction("partition_term_spec_to_term", "PARTITION-TERM-SPEC-TO-TERM", 1, 0, false);
            declareFunction("partition_term_spec_to_term_internal", "PARTITION-TERM-SPEC-TO-TERM-INTERNAL", 1, 0, false);
            declareFunction("scope_partition_object_only", "SCOPE-PARTITION-OBJECT-ONLY", 1, 0, false);
            declareFunction("scope_partition_assertion", "SCOPE-PARTITION-ASSERTION", 1, 0, false);
            declareFunction("scope_partition_assertion_and_meta_assertions", "SCOPE-PARTITION-ASSERTION-AND-META-ASSERTIONS", 1, 0, false);
            declareFunction("scope_partition_assertion_selective", "SCOPE-PARTITION-ASSERTION-SELECTIVE", 1, 0, false);
            declareFunction("scope_partition_assertion_and_constituents", "SCOPE-PARTITION-ASSERTION-AND-CONSTITUENTS", 1, 0, false);
            declareFunction("scope_partition_term", "SCOPE-PARTITION-TERM", 1, 0, false);
            declareFunction("scope_partition_definition", "SCOPE-PARTITION-DEFINITION", 1, 0, false);
            declareFunction("scope_partition_term_and_narts", "SCOPE-PARTITION-TERM-AND-NARTS", 1, 0, false);
            declareFunction("scope_partition_term_in_mt", "SCOPE-PARTITION-TERM-IN-MT", 2, 0, false);
            declareFunction("scope_partition_rf", "SCOPE-PARTITION-RF", 1, 0, false);
            declareFunction("scope_partition_rf_and_super_rfs", "SCOPE-PARTITION-RF-AND-SUPER-RFS", 1, 0, false);
            declareFunction("selected_scope_partition_term", "SELECTED-SCOPE-PARTITION-TERM", 1, 0, false);
            declareFunction("scope_partition_ontology", "SCOPE-PARTITION-ONTOLOGY", 1, 0, false);
            declareFunction("scope_partition_quoted_ontology", "SCOPE-PARTITION-QUOTED-ONTOLOGY", 1, 0, false);
            declareFunction("selected_scope_partition_ontology", "SELECTED-SCOPE-PARTITION-ONTOLOGY", 1, 0, false);
            declareFunction("scope_partition_arg_index", "SCOPE-PARTITION-ARG-INDEX", 2, 3, false);
            declareFunction("scope_partition_predicate_rule_index", "SCOPE-PARTITION-PREDICATE-RULE-INDEX", 2, 2, false);
            declareFunction("scope_partition_mt_index", "SCOPE-PARTITION-MT-INDEX", 1, 0, false);
            declareFunction("scope_partition_other_index", "SCOPE-PARTITION-OTHER-INDEX", 1, 0, false);
            declareFunction("scope_partition_deduction", "SCOPE-PARTITION-DEDUCTION", 1, 0, false);
            declareFunction("partition_scope", "PARTITION-SCOPE", 0, 0, false);
            declareFunction("partition_forts", "PARTITION-FORTS", 0, 0, false);
            declareFunction("scope_partition_term_internal", "SCOPE-PARTITION-TERM-INTERNAL", 1, 0, false);
            declareFunction("selected_scope_partition_term_internal", "SELECTED-SCOPE-PARTITION-TERM-INTERNAL", 1, 0, false);
            declareFunction("clear_partition_content", "CLEAR-PARTITION-CONTENT", 0, 1, false);
            declareFunction("partition_estimated_assertion_count", "PARTITION-ESTIMATED-ASSERTION-COUNT", 1, 0, false);
            declareFunction("partition_scope_completely_specified_by_partitionP", "PARTITION-SCOPE-COMPLETELY-SPECIFIED-BY-PARTITION?", 1, 0, false);
            declareFunction("mark_partition_content", "MARK-PARTITION-CONTENT", 1, 0, false);
            declareFunction("mark_partition_bookkeeping_terms", "MARK-PARTITION-BOOKKEEPING-TERMS", 1, 0, false);
            declareFunction("mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant", "MARK-PARTITION-TERMS-MENTIONED-IN-BOOKKEEPING-ASSERTIONS-OF-CONSTANT", 1, 0, false);
            declareFunction("mark_partition_object", "MARK-PARTITION-OBJECT", 1, 0, false);
            declareFunction("mark_partition_object_cons_method", "MARK-PARTITION-OBJECT-CONS-METHOD", 1, 0, false);
            declareFunction("mark_partition_object_constant_method", "MARK-PARTITION-OBJECT-CONSTANT-METHOD", 1, 0, false);
            declareFunction("mark_partition_object_constant", "MARK-PARTITION-OBJECT-CONSTANT", 1, 0, false);
            declareFunction("mark_partition_object_nart_method", "MARK-PARTITION-OBJECT-NART-METHOD", 1, 0, false);
            declareFunction("mark_partition_object_nart", "MARK-PARTITION-OBJECT-NART", 1, 0, false);
            declareFunction("mark_partition_object_assertion_method", "MARK-PARTITION-OBJECT-ASSERTION-METHOD", 1, 0, false);
            declareFunction("mark_partition_object_deduction_method", "MARK-PARTITION-OBJECT-DEDUCTION-METHOD", 1, 0, false);
            declareFunction("mark_partition_object_deduction", "MARK-PARTITION-OBJECT-DEDUCTION", 1, 0, false);
            declareFunction("mark_partition_object_kb_hl_support_method", "MARK-PARTITION-OBJECT-KB-HL-SUPPORT-METHOD", 1, 0, false);
            declareFunction("mark_partition_object_kb_hl_support", "MARK-PARTITION-OBJECT-KB-HL-SUPPORT", 1, 0, false);
            declareFunction("mark_partition_assertion_beliefs", "MARK-PARTITION-ASSERTION-BELIEFS", 1, 0, false);
            declareFunction("mark_partition_assertion_deduction", "MARK-PARTITION-ASSERTION-DEDUCTION", 1, 0, false);
            declareFunction("note_partition_kb_hl_support_order", "NOTE-PARTITION-KB-HL-SUPPORT-ORDER", 1, 0, false);
            declareFunction("partition_kb_hl_support_order", "PARTITION-KB-HL-SUPPORT-ORDER", 1, 0, false);
            declareFunction("display_partition_content", "DISPLAY-PARTITION-CONTENT", 0, 0, false);
            declareFunction("remove_partition", "REMOVE-PARTITION", 1, 0, false);
            declareFunction("remove_scoped_partition", "REMOVE-SCOPED-PARTITION", 0, 0, false);
            declareFunction("make_archive_filename", "MAKE-ARCHIVE-FILENAME", 1, 0, false);
            declareFunction("archive_assertion_if_local", "ARCHIVE-ASSERTION-IF-LOCAL", 1, 0, false);
            declareFunction("archive_term", "ARCHIVE-TERM", 1, 1, false);
            declareFunction("archive_ontology", "ARCHIVE-ONTOLOGY", 1, 1, false);
            declareFunction("archive_partition", "ARCHIVE-PARTITION", 2, 1, false);
            declareFunction("remove_partition_term", "REMOVE-PARTITION-TERM", 1, 0, false);
            declareFunction("save_partition", "SAVE-PARTITION", 2, 0, false);
            declareFunction("save_partition_to_stream", "SAVE-PARTITION-TO-STREAM", 2, 0, false);
            declareFunction("excise_partition_to_stream", "EXCISE-PARTITION-TO-STREAM", 2, 0, false);
            declareFunction("save_partition_as_hl_transcript", "SAVE-PARTITION-AS-HL-TRANSCRIPT", 2, 0, false);
            declareFunction("partition_spec_to_modification_spec", "PARTITION-SPEC-TO-MODIFICATION-SPEC", 1, 0, false);
            declareFunction("partition_common_symbols", "PARTITION-COMMON-SYMBOLS", 0, 0, false);
            declareFunction("dump_partition_to_stream", "DUMP-PARTITION-TO-STREAM", 1, 0, false);
            declareFunction("dump_partition_section_marker", "DUMP-PARTITION-SECTION-MARKER", 1, 0, false);
            declareFunction("dump_partition_info", "DUMP-PARTITION-INFO", 1, 0, false);
            declareFunction("large_partitionP", "LARGE-PARTITION?", 0, 0, false);
            declareFunction("dump_partition_constant_shells", "DUMP-PARTITION-CONSTANT-SHELLS", 1, 0, false);
            declareFunction("dump_partition_constant_shell", "DUMP-PARTITION-CONSTANT-SHELL", 2, 0, false);
            declareFunction("dump_partition_nart_shells", "DUMP-PARTITION-NART-SHELLS", 1, 0, false);
            declareFunction("dump_partition_nart_shells_at_level", "DUMP-PARTITION-NART-SHELLS-AT-LEVEL", 2, 0, false);
            declareFunction("partition_nart_level_count", "PARTITION-NART-LEVEL-COUNT", 1, 0, false);
            declareFunction("dump_partition_nart_shell", "DUMP-PARTITION-NART-SHELL", 2, 0, false);
            declareFunction("dump_partition_assertions", "DUMP-PARTITION-ASSERTIONS", 1, 0, false);
            declareFunction("dump_partition_simple_assertions", "DUMP-PARTITION-SIMPLE-ASSERTIONS", 1, 0, false);
            declareFunction("dump_partition_meta_assertions", "DUMP-PARTITION-META-ASSERTIONS", 2, 0, false);
            declareFunction("partition_meta_assertion_order_count", "PARTITION-META-ASSERTION-ORDER-COUNT", 1, 0, false);
            declareFunction("dump_partition_assertion", "DUMP-PARTITION-ASSERTION", 2, 0, false);
            declareFunction("dump_partition_kb_hl_supports", "DUMP-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
            declareFunction("dump_partition_kb_hl_supports_at_level", "DUMP-PARTITION-KB-HL-SUPPORTS-AT-LEVEL", 2, 0, false);
            declareFunction("partition_kb_hl_support_level_count", "PARTITION-KB-HL-SUPPORT-LEVEL-COUNT", 1, 0, false);
            declareFunction("dump_partition_kb_hl_support", "DUMP-PARTITION-KB-HL-SUPPORT", 2, 0, false);
            declareFunction("dump_partition_arguments", "DUMP-PARTITION-ARGUMENTS", 1, 0, false);
            declareFunction("dump_partition_argument", "DUMP-PARTITION-ARGUMENT", 2, 0, false);
            declareFunction("dump_partition_deduction", "DUMP-PARTITION-DEDUCTION", 2, 0, false);
            declareFunction("dump_partition_beliefs", "DUMP-PARTITION-BELIEFS", 2, 0, false);
            declareFunction("dump_partition_belief", "DUMP-PARTITION-BELIEF", 3, 0, false);
            declareFunction("dump_partition_asserted_argument", "DUMP-PARTITION-ASSERTED-ARGUMENT", 3, 0, false);
            declareFunction("dump_partition_bookkeeping_assertions_for_term", "DUMP-PARTITION-BOOKKEEPING-ASSERTIONS-FOR-TERM", 2, 0, false);
            declareFunction("dump_partition_assertible", "DUMP-PARTITION-ASSERTIBLE", 2, 0, false);
            declareFunction("load_entire_kb_partition", "LOAD-ENTIRE-KB-PARTITION", 1, 0, false);
            declareFunction("load_partition_clean", "LOAD-PARTITION-CLEAN", 1, 1, false);
            declareFunction("load_partitions_clean", "LOAD-PARTITIONS-CLEAN", 1, 0, false);
            declareFunction("partition_load_kb_cleanup", "PARTITION-LOAD-KB-CLEANUP", 0, 0, false);
            declareFunction("partition_invalid_missing_terms_count", "PARTITION-INVALID-MISSING-TERMS-COUNT", 0, 0, false);
            declareFunction("load_partition_invalid_missing_termP", "LOAD-PARTITION-INVALID-MISSING-TERM?", 1, 0, false);
            declareFunction("add_load_partition_invalid_missing_term", "ADD-LOAD-PARTITION-INVALID-MISSING-TERM", 1, 0, false);
            declareFunction("load_partition", "LOAD-PARTITION", 1, 1, false);
            declareFunction("load_partition_from_stream", "LOAD-PARTITION-FROM-STREAM", 1, 1, false);
            declareFunction("load_partition_info", "LOAD-PARTITION-INFO", 1, 0, false);
            declareFunction("partition_formats_compatibleP", "PARTITION-FORMATS-COMPATIBLE?", 2, 0, false);
            declareFunction("load_partition_section_marker", "LOAD-PARTITION-SECTION-MARKER", 1, 2, false);
            declareFunction("load_partition_special_objects", "LOAD-PARTITION-SPECIAL-OBJECTS", 1, 0, false);
            declareFunction("reset_sbhl_links_for_partition_forts", "RESET-SBHL-LINKS-FOR-PARTITION-FORTS", 0, 0, false);
            declareFunction("load_partition_constant_shells", "LOAD-PARTITION-CONSTANT-SHELLS", 1, 0, false);
            declareFunction("load_partition_constant_shell", "LOAD-PARTITION-CONSTANT-SHELL", 1, 0, false);
            declareFunction("load_partition_nart_shells", "LOAD-PARTITION-NART-SHELLS", 1, 0, false);
            declareFunction("load_partition_nart_order_set", "LOAD-PARTITION-NART-ORDER-SET", 2, 0, false);
            declareFunction("load_partition_nart_shell", "LOAD-PARTITION-NART-SHELL", 1, 0, false);
            declareFunction("load_partition_assertions", "LOAD-PARTITION-ASSERTIONS", 1, 0, false);
            declareFunction("load_partition_simple_assertions", "LOAD-PARTITION-SIMPLE-ASSERTIONS", 2, 0, false);
            declareFunction("load_partition_meta_assertions", "LOAD-PARTITION-META-ASSERTIONS", 2, 0, false);
            declareFunction("load_partition_assertion_order_set", "LOAD-PARTITION-ASSERTION-ORDER-SET", 3, 0, false);
            declareFunction("load_partition_assertion", "LOAD-PARTITION-ASSERTION", 1, 0, false);
            declareFunction("load_partition_kb_hl_supports", "LOAD-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
            declareFunction("load_partition_kb_hl_support_order_set", "LOAD-PARTITION-KB-HL-SUPPORT-ORDER-SET", 2, 0, false);
            declareFunction("load_partition_kb_hl_support", "LOAD-PARTITION-KB-HL-SUPPORT", 1, 0, false);
            declareFunction("load_partition_arguments", "LOAD-PARTITION-ARGUMENTS", 1, 0, false);
            declareFunction("load_partition_argument", "LOAD-PARTITION-ARGUMENT", 1, 0, false);
            declareFunction("load_partition_beliefs", "LOAD-PARTITION-BELIEFS", 1, 0, false);
            declareFunction("load_partition_asserted_argument", "LOAD-PARTITION-ASSERTED-ARGUMENT", 2, 0, false);
            declareFunction("load_partition_deduction", "LOAD-PARTITION-DEDUCTION", 1, 1, false);
            declareFunction("load_some_partition_bookkeeping_assertions", "LOAD-SOME-PARTITION-BOOKKEEPING-ASSERTIONS", 1, 0, false);
            declareFunction("load_partition_assertible", "LOAD-PARTITION-ASSERTIBLE", 1, 0, false);
            declareFunction("load_partition_possibly_weaken_hl_supports", "LOAD-PARTITION-POSSIBLY-WEAKEN-HL-SUPPORTS", 1, 0, false);
            declareFunction("replace_hl_support_module", "REPLACE-HL-SUPPORT-MODULE", 2, 0, false);
            declareFunction("clear_load_partition_constants", "CLEAR-LOAD-PARTITION-CONSTANTS", 1, 0, false);
            declareFunction("new_load_partition_constants_store", "NEW-LOAD-PARTITION-CONSTANTS-STORE", 1, 0, false);
            declareFunction("new_load_partition_scope_constants_store", "NEW-LOAD-PARTITION-SCOPE-CONSTANTS-STORE", 1, 0, false);
            declareFunction("new_load_paritition_missing_constants_store", "NEW-LOAD-PARITITION-MISSING-CONSTANTS-STORE", 1, 0, false);
            declareFunction("gather_load_partition_scope_constants", "GATHER-LOAD-PARTITION-SCOPE-CONSTANTS", 0, 0, false);
            declareFunction("gather_load_partition_missing_constants", "GATHER-LOAD-PARTITION-MISSING-CONSTANTS", 0, 0, false);
            declareFunction("note_load_partition_constant", "NOTE-LOAD-PARTITION-CONSTANT", 3, 0, false);
            declareFunction("note_load_partition_missing_constant", "NOTE-LOAD-PARTITION-MISSING-CONSTANT", 2, 0, false);
            declareFunction("partition_find_constant_by_id", "PARTITION-FIND-CONSTANT-BY-ID", 1, 0, false);
            declareFunction("partition_missing_constant_link_error", "PARTITION-MISSING-CONSTANT-LINK-ERROR", 1, 0, false);
            declareFunction("link_partition_constant_shell", "LINK-PARTITION-CONSTANT-SHELL", 4, 0, false);
            declareFunction("link_partition_create_constant", "LINK-PARTITION-CREATE-CONSTANT", 2, 0, false);
            declareFunction("link_partition_install_constant_id", "LINK-PARTITION-INSTALL-CONSTANT-ID", 2, 0, false);
            declareFunction("preseed_load_partition_constants_store", "PRESEED-LOAD-PARTITION-CONSTANTS-STORE", 1, 1, false);
            declareMacro("with_preseeded_partition_constants", "WITH-PRESEEDED-PARTITION-CONSTANTS");
            declareFunction("load_partition_from_stream_with_preseeding", "LOAD-PARTITION-FROM-STREAM-WITH-PRESEEDING", 2, 1, false);
            declareFunction("link_partition_constant_error_1", "LINK-PARTITION-CONSTANT-ERROR-1", 2, 0, false);
            declareFunction("link_partition_constant_error_2", "LINK-PARTITION-CONSTANT-ERROR-2", 2, 0, false);
            declareFunction("link_partition_constant_error_3", "LINK-PARTITION-CONSTANT-ERROR-3", 2, 0, false);
            declareFunction("link_partition_constant_error_4", "LINK-PARTITION-CONSTANT-ERROR-4", 2, 0, false);
            declareFunction("link_partition_constant_error_5", "LINK-PARTITION-CONSTANT-ERROR-5", 2, 0, false);
            declareFunction("link_partition_constant_error_6", "LINK-PARTITION-CONSTANT-ERROR-6", 2, 0, false);
            declareFunction("link_partition_constant_error_7", "LINK-PARTITION-CONSTANT-ERROR-7", 2, 0, false);
            declareFunction("clear_load_partition_narts", "CLEAR-LOAD-PARTITION-NARTS", 1, 0, false);
            declareFunction("gather_load_partition_scope_narts", "GATHER-LOAD-PARTITION-SCOPE-NARTS", 0, 0, false);
            declareFunction("gather_load_partition_missing_narts", "GATHER-LOAD-PARTITION-MISSING-NARTS", 0, 0, false);
            declareFunction("note_load_partition_nart", "NOTE-LOAD-PARTITION-NART", 3, 0, false);
            declareFunction("note_load_partition_missing_nart", "NOTE-LOAD-PARTITION-MISSING-NART", 2, 0, false);
            declareFunction("partition_find_nart_by_id", "PARTITION-FIND-NART-BY-ID", 1, 0, false);
            declareFunction("link_partition_nart_shell", "LINK-PARTITION-NART-SHELL", 3, 0, false);
            declareFunction("link_partition_create_nart_shell", "LINK-PARTITION-CREATE-NART-SHELL", 1, 0, false);
            declareFunction("partition_missing_nart_link_error", "PARTITION-MISSING-NART-LINK-ERROR", 1, 0, false);
            declareFunction("clear_load_partition_assertions", "CLEAR-LOAD-PARTITION-ASSERTIONS", 1, 0, false);
            declareFunction("gather_load_partition_assertions", "GATHER-LOAD-PARTITION-ASSERTIONS", 0, 0, false);
            declareFunction("gather_load_partition_missing_assertions", "GATHER-LOAD-PARTITION-MISSING-ASSERTIONS", 0, 0, false);
            declareFunction("note_load_partition_assertion", "NOTE-LOAD-PARTITION-ASSERTION", 3, 0, false);
            declareFunction("note_load_partition_missing_assertion", "NOTE-LOAD-PARTITION-MISSING-ASSERTION", 2, 0, false);
            declareFunction("partition_find_assertion_by_id", "PARTITION-FIND-ASSERTION-BY-ID", 1, 0, false);
            declareFunction("link_partition_assertion", "LINK-PARTITION-ASSERTION", 6, 0, false);
            declareFunction("link_partition_create_assertion_shell", "LINK-PARTITION-CREATE-ASSERTION-SHELL", 4, 0, false);
            declareFunction("partition_missing_assertion_link_error", "PARTITION-MISSING-ASSERTION-LINK-ERROR", 1, 0, false);
            declareFunction("clear_load_partition_kb_hl_supports", "CLEAR-LOAD-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
            declareFunction("gather_load_partition_kb_hl_supports", "GATHER-LOAD-PARTITION-KB-HL-SUPPORTS", 0, 0, false);
            declareFunction("gather_load_partition_scope_kb_hl_supports", "GATHER-LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS", 0, 0, false);
            declareFunction("gather_load_partition_missing_kb_hl_supports", "GATHER-LOAD-PARTITION-MISSING-KB-HL-SUPPORTS", 0, 0, false);
            declareFunction("note_load_partition_kb_hl_support", "NOTE-LOAD-PARTITION-KB-HL-SUPPORT", 3, 0, false);
            declareFunction("note_load_partition_missing_kb_hl_support", "NOTE-LOAD-PARTITION-MISSING-KB-HL-SUPPORT", 2, 0, false);
            declareFunction("partition_find_kb_hl_support_by_id", "PARTITION-FIND-KB-HL-SUPPORT-BY-ID", 1, 0, false);
            declareFunction("link_partition_kb_hl_support", "LINK-PARTITION-KB-HL-SUPPORT", 4, 0, false);
            declareFunction("link_partition_create_kb_hl_support", "LINK-PARTITION-CREATE-KB-HL-SUPPORT", 2, 0, false);
            declareFunction("partition_missing_kb_hl_support_link_error", "PARTITION-MISSING-KB-HL-SUPPORT-LINK-ERROR", 1, 0, false);
            declareFunction("link_partition_asserted_argument", "LINK-PARTITION-ASSERTED-ARGUMENT", 3, 0, false);
            declareFunction("link_partition_deduction", "LINK-PARTITION-DEDUCTION", 3, 0, false);
            declareFunction("link_partition_assertible", "LINK-PARTITION-ASSERTIBLE", 5, 0, false);
            declareFunction("clear_partition_loader_state", "CLEAR-PARTITION-LOADER-STATE", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("every_possible_instance", "EVERY-POSSIBLE-INSTANCE", 1, 0, false);
            declareFunction("every_possible_spec", "EVERY-POSSIBLE-SPEC", 1, 0, false);
            declareFunction("load_partition_clean", "LOAD-PARTITION-CLEAN", 1, 0, false);
            declareFunction("load_partition_deduction", "LOAD-PARTITION-DEDUCTION", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_partitions_file_Previous() {
        declareFunction("partition_scope_completely_specifiedP", "PARTITION-SCOPE-COMPLETELY-SPECIFIED?", 0, 0, false);
        declareFunction("scope_partition", "SCOPE-PARTITION", 1, 0, false);
        declareFunction("partition_scope_term_p", "PARTITION-SCOPE-TERM-P", 1, 0, false);
        declareFunction("clear_partition_scope", "CLEAR-PARTITION-SCOPE", 0, 0, false);
        declareFunction("partition_term_spec_to_term", "PARTITION-TERM-SPEC-TO-TERM", 1, 0, false);
        declareFunction("partition_term_spec_to_term_internal", "PARTITION-TERM-SPEC-TO-TERM-INTERNAL", 1, 0, false);
        declareFunction("scope_partition_object_only", "SCOPE-PARTITION-OBJECT-ONLY", 1, 0, false);
        declareFunction("scope_partition_assertion", "SCOPE-PARTITION-ASSERTION", 1, 0, false);
        declareFunction("scope_partition_assertion_and_meta_assertions", "SCOPE-PARTITION-ASSERTION-AND-META-ASSERTIONS", 1, 0, false);
        declareFunction("scope_partition_assertion_selective", "SCOPE-PARTITION-ASSERTION-SELECTIVE", 1, 0, false);
        declareFunction("scope_partition_assertion_and_constituents", "SCOPE-PARTITION-ASSERTION-AND-CONSTITUENTS", 1, 0, false);
        declareFunction("scope_partition_term", "SCOPE-PARTITION-TERM", 1, 0, false);
        declareFunction("scope_partition_definition", "SCOPE-PARTITION-DEFINITION", 1, 0, false);
        declareFunction("scope_partition_term_and_narts", "SCOPE-PARTITION-TERM-AND-NARTS", 1, 0, false);
        declareFunction("scope_partition_term_in_mt", "SCOPE-PARTITION-TERM-IN-MT", 2, 0, false);
        declareFunction("scope_partition_rf", "SCOPE-PARTITION-RF", 1, 0, false);
        declareFunction("scope_partition_rf_and_super_rfs", "SCOPE-PARTITION-RF-AND-SUPER-RFS", 1, 0, false);
        declareFunction("selected_scope_partition_term", "SELECTED-SCOPE-PARTITION-TERM", 1, 0, false);
        declareFunction("scope_partition_ontology", "SCOPE-PARTITION-ONTOLOGY", 1, 0, false);
        declareFunction("scope_partition_quoted_ontology", "SCOPE-PARTITION-QUOTED-ONTOLOGY", 1, 0, false);
        declareFunction("selected_scope_partition_ontology", "SELECTED-SCOPE-PARTITION-ONTOLOGY", 1, 0, false);
        declareFunction("scope_partition_arg_index", "SCOPE-PARTITION-ARG-INDEX", 2, 3, false);
        declareFunction("scope_partition_predicate_rule_index", "SCOPE-PARTITION-PREDICATE-RULE-INDEX", 2, 2, false);
        declareFunction("scope_partition_mt_index", "SCOPE-PARTITION-MT-INDEX", 1, 0, false);
        declareFunction("scope_partition_other_index", "SCOPE-PARTITION-OTHER-INDEX", 1, 0, false);
        declareFunction("scope_partition_deduction", "SCOPE-PARTITION-DEDUCTION", 1, 0, false);
        declareFunction("partition_scope", "PARTITION-SCOPE", 0, 0, false);
        declareFunction("partition_forts", "PARTITION-FORTS", 0, 0, false);
        declareFunction("scope_partition_term_internal", "SCOPE-PARTITION-TERM-INTERNAL", 1, 0, false);
        declareFunction("selected_scope_partition_term_internal", "SELECTED-SCOPE-PARTITION-TERM-INTERNAL", 1, 0, false);
        declareFunction("clear_partition_content", "CLEAR-PARTITION-CONTENT", 0, 1, false);
        declareFunction("partition_estimated_assertion_count", "PARTITION-ESTIMATED-ASSERTION-COUNT", 1, 0, false);
        declareFunction("partition_scope_completely_specified_by_partitionP", "PARTITION-SCOPE-COMPLETELY-SPECIFIED-BY-PARTITION?", 1, 0, false);
        declareFunction("mark_partition_content", "MARK-PARTITION-CONTENT", 1, 0, false);
        declareFunction("mark_partition_bookkeeping_terms", "MARK-PARTITION-BOOKKEEPING-TERMS", 1, 0, false);
        declareFunction("mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant", "MARK-PARTITION-TERMS-MENTIONED-IN-BOOKKEEPING-ASSERTIONS-OF-CONSTANT", 1, 0, false);
        declareFunction("mark_partition_object", "MARK-PARTITION-OBJECT", 1, 0, false);
        declareFunction("mark_partition_object_cons_method", "MARK-PARTITION-OBJECT-CONS-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_constant_method", "MARK-PARTITION-OBJECT-CONSTANT-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_constant", "MARK-PARTITION-OBJECT-CONSTANT", 1, 0, false);
        declareFunction("mark_partition_object_nart_method", "MARK-PARTITION-OBJECT-NART-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_nart", "MARK-PARTITION-OBJECT-NART", 1, 0, false);
        declareFunction("mark_partition_object_assertion_method", "MARK-PARTITION-OBJECT-ASSERTION-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_deduction_method", "MARK-PARTITION-OBJECT-DEDUCTION-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_deduction", "MARK-PARTITION-OBJECT-DEDUCTION", 1, 0, false);
        declareFunction("mark_partition_object_kb_hl_support_method", "MARK-PARTITION-OBJECT-KB-HL-SUPPORT-METHOD", 1, 0, false);
        declareFunction("mark_partition_object_kb_hl_support", "MARK-PARTITION-OBJECT-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("mark_partition_assertion_beliefs", "MARK-PARTITION-ASSERTION-BELIEFS", 1, 0, false);
        declareFunction("mark_partition_assertion_deduction", "MARK-PARTITION-ASSERTION-DEDUCTION", 1, 0, false);
        declareFunction("note_partition_kb_hl_support_order", "NOTE-PARTITION-KB-HL-SUPPORT-ORDER", 1, 0, false);
        declareFunction("partition_kb_hl_support_order", "PARTITION-KB-HL-SUPPORT-ORDER", 1, 0, false);
        declareFunction("display_partition_content", "DISPLAY-PARTITION-CONTENT", 0, 0, false);
        declareFunction("remove_partition", "REMOVE-PARTITION", 1, 0, false);
        declareFunction("remove_scoped_partition", "REMOVE-SCOPED-PARTITION", 0, 0, false);
        declareFunction("make_archive_filename", "MAKE-ARCHIVE-FILENAME", 1, 0, false);
        declareFunction("archive_assertion_if_local", "ARCHIVE-ASSERTION-IF-LOCAL", 1, 0, false);
        declareFunction("archive_term", "ARCHIVE-TERM", 1, 1, false);
        declareFunction("archive_ontology", "ARCHIVE-ONTOLOGY", 1, 1, false);
        declareFunction("archive_partition", "ARCHIVE-PARTITION", 2, 1, false);
        declareFunction("remove_partition_term", "REMOVE-PARTITION-TERM", 1, 0, false);
        declareFunction("save_partition", "SAVE-PARTITION", 2, 0, false);
        declareFunction("save_partition_to_stream", "SAVE-PARTITION-TO-STREAM", 2, 0, false);
        declareFunction("excise_partition_to_stream", "EXCISE-PARTITION-TO-STREAM", 2, 0, false);
        declareFunction("save_partition_as_hl_transcript", "SAVE-PARTITION-AS-HL-TRANSCRIPT", 2, 0, false);
        declareFunction("partition_spec_to_modification_spec", "PARTITION-SPEC-TO-MODIFICATION-SPEC", 1, 0, false);
        declareFunction("partition_common_symbols", "PARTITION-COMMON-SYMBOLS", 0, 0, false);
        declareFunction("dump_partition_to_stream", "DUMP-PARTITION-TO-STREAM", 1, 0, false);
        declareFunction("dump_partition_section_marker", "DUMP-PARTITION-SECTION-MARKER", 1, 0, false);
        declareFunction("dump_partition_info", "DUMP-PARTITION-INFO", 1, 0, false);
        declareFunction("large_partitionP", "LARGE-PARTITION?", 0, 0, false);
        declareFunction("dump_partition_constant_shells", "DUMP-PARTITION-CONSTANT-SHELLS", 1, 0, false);
        declareFunction("dump_partition_constant_shell", "DUMP-PARTITION-CONSTANT-SHELL", 2, 0, false);
        declareFunction("dump_partition_nart_shells", "DUMP-PARTITION-NART-SHELLS", 1, 0, false);
        declareFunction("dump_partition_nart_shells_at_level", "DUMP-PARTITION-NART-SHELLS-AT-LEVEL", 2, 0, false);
        declareFunction("partition_nart_level_count", "PARTITION-NART-LEVEL-COUNT", 1, 0, false);
        declareFunction("dump_partition_nart_shell", "DUMP-PARTITION-NART-SHELL", 2, 0, false);
        declareFunction("dump_partition_assertions", "DUMP-PARTITION-ASSERTIONS", 1, 0, false);
        declareFunction("dump_partition_simple_assertions", "DUMP-PARTITION-SIMPLE-ASSERTIONS", 1, 0, false);
        declareFunction("dump_partition_meta_assertions", "DUMP-PARTITION-META-ASSERTIONS", 2, 0, false);
        declareFunction("partition_meta_assertion_order_count", "PARTITION-META-ASSERTION-ORDER-COUNT", 1, 0, false);
        declareFunction("dump_partition_assertion", "DUMP-PARTITION-ASSERTION", 2, 0, false);
        declareFunction("dump_partition_kb_hl_supports", "DUMP-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction("dump_partition_kb_hl_supports_at_level", "DUMP-PARTITION-KB-HL-SUPPORTS-AT-LEVEL", 2, 0, false);
        declareFunction("partition_kb_hl_support_level_count", "PARTITION-KB-HL-SUPPORT-LEVEL-COUNT", 1, 0, false);
        declareFunction("dump_partition_kb_hl_support", "DUMP-PARTITION-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("dump_partition_arguments", "DUMP-PARTITION-ARGUMENTS", 1, 0, false);
        declareFunction("dump_partition_argument", "DUMP-PARTITION-ARGUMENT", 2, 0, false);
        declareFunction("dump_partition_deduction", "DUMP-PARTITION-DEDUCTION", 2, 0, false);
        declareFunction("dump_partition_beliefs", "DUMP-PARTITION-BELIEFS", 2, 0, false);
        declareFunction("dump_partition_belief", "DUMP-PARTITION-BELIEF", 3, 0, false);
        declareFunction("dump_partition_asserted_argument", "DUMP-PARTITION-ASSERTED-ARGUMENT", 3, 0, false);
        declareFunction("dump_partition_bookkeeping_assertions_for_term", "DUMP-PARTITION-BOOKKEEPING-ASSERTIONS-FOR-TERM", 2, 0, false);
        declareFunction("dump_partition_assertible", "DUMP-PARTITION-ASSERTIBLE", 2, 0, false);
        declareFunction("load_entire_kb_partition", "LOAD-ENTIRE-KB-PARTITION", 1, 0, false);
        declareFunction("load_partition_clean", "LOAD-PARTITION-CLEAN", 1, 1, false);
        declareFunction("load_partitions_clean", "LOAD-PARTITIONS-CLEAN", 1, 0, false);
        declareFunction("partition_load_kb_cleanup", "PARTITION-LOAD-KB-CLEANUP", 0, 0, false);
        declareFunction("partition_invalid_missing_terms_count", "PARTITION-INVALID-MISSING-TERMS-COUNT", 0, 0, false);
        declareFunction("load_partition_invalid_missing_termP", "LOAD-PARTITION-INVALID-MISSING-TERM?", 1, 0, false);
        declareFunction("add_load_partition_invalid_missing_term", "ADD-LOAD-PARTITION-INVALID-MISSING-TERM", 1, 0, false);
        declareFunction("load_partition", "LOAD-PARTITION", 1, 1, false);
        declareFunction("load_partition_from_stream", "LOAD-PARTITION-FROM-STREAM", 1, 1, false);
        declareFunction("load_partition_info", "LOAD-PARTITION-INFO", 1, 0, false);
        declareFunction("partition_formats_compatibleP", "PARTITION-FORMATS-COMPATIBLE?", 2, 0, false);
        declareFunction("load_partition_section_marker", "LOAD-PARTITION-SECTION-MARKER", 1, 2, false);
        declareFunction("load_partition_special_objects", "LOAD-PARTITION-SPECIAL-OBJECTS", 1, 0, false);
        declareFunction("reset_sbhl_links_for_partition_forts", "RESET-SBHL-LINKS-FOR-PARTITION-FORTS", 0, 0, false);
        declareFunction("load_partition_constant_shells", "LOAD-PARTITION-CONSTANT-SHELLS", 1, 0, false);
        declareFunction("load_partition_constant_shell", "LOAD-PARTITION-CONSTANT-SHELL", 1, 0, false);
        declareFunction("load_partition_nart_shells", "LOAD-PARTITION-NART-SHELLS", 1, 0, false);
        declareFunction("load_partition_nart_order_set", "LOAD-PARTITION-NART-ORDER-SET", 2, 0, false);
        declareFunction("load_partition_nart_shell", "LOAD-PARTITION-NART-SHELL", 1, 0, false);
        declareFunction("load_partition_assertions", "LOAD-PARTITION-ASSERTIONS", 1, 0, false);
        declareFunction("load_partition_simple_assertions", "LOAD-PARTITION-SIMPLE-ASSERTIONS", 2, 0, false);
        declareFunction("load_partition_meta_assertions", "LOAD-PARTITION-META-ASSERTIONS", 2, 0, false);
        declareFunction("load_partition_assertion_order_set", "LOAD-PARTITION-ASSERTION-ORDER-SET", 3, 0, false);
        declareFunction("load_partition_assertion", "LOAD-PARTITION-ASSERTION", 1, 0, false);
        declareFunction("load_partition_kb_hl_supports", "LOAD-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction("load_partition_kb_hl_support_order_set", "LOAD-PARTITION-KB-HL-SUPPORT-ORDER-SET", 2, 0, false);
        declareFunction("load_partition_kb_hl_support", "LOAD-PARTITION-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("load_partition_arguments", "LOAD-PARTITION-ARGUMENTS", 1, 0, false);
        declareFunction("load_partition_argument", "LOAD-PARTITION-ARGUMENT", 1, 0, false);
        declareFunction("load_partition_beliefs", "LOAD-PARTITION-BELIEFS", 1, 0, false);
        declareFunction("load_partition_asserted_argument", "LOAD-PARTITION-ASSERTED-ARGUMENT", 2, 0, false);
        declareFunction("load_partition_deduction", "LOAD-PARTITION-DEDUCTION", 1, 1, false);
        declareFunction("load_some_partition_bookkeeping_assertions", "LOAD-SOME-PARTITION-BOOKKEEPING-ASSERTIONS", 1, 0, false);
        declareFunction("load_partition_assertible", "LOAD-PARTITION-ASSERTIBLE", 1, 0, false);
        declareFunction("load_partition_possibly_weaken_hl_supports", "LOAD-PARTITION-POSSIBLY-WEAKEN-HL-SUPPORTS", 1, 0, false);
        declareFunction("replace_hl_support_module", "REPLACE-HL-SUPPORT-MODULE", 2, 0, false);
        declareFunction("clear_load_partition_constants", "CLEAR-LOAD-PARTITION-CONSTANTS", 1, 0, false);
        declareFunction("new_load_partition_constants_store", "NEW-LOAD-PARTITION-CONSTANTS-STORE", 1, 0, false);
        declareFunction("new_load_partition_scope_constants_store", "NEW-LOAD-PARTITION-SCOPE-CONSTANTS-STORE", 1, 0, false);
        declareFunction("new_load_paritition_missing_constants_store", "NEW-LOAD-PARITITION-MISSING-CONSTANTS-STORE", 1, 0, false);
        declareFunction("gather_load_partition_scope_constants", "GATHER-LOAD-PARTITION-SCOPE-CONSTANTS", 0, 0, false);
        declareFunction("gather_load_partition_missing_constants", "GATHER-LOAD-PARTITION-MISSING-CONSTANTS", 0, 0, false);
        declareFunction("note_load_partition_constant", "NOTE-LOAD-PARTITION-CONSTANT", 3, 0, false);
        declareFunction("note_load_partition_missing_constant", "NOTE-LOAD-PARTITION-MISSING-CONSTANT", 2, 0, false);
        declareFunction("partition_find_constant_by_id", "PARTITION-FIND-CONSTANT-BY-ID", 1, 0, false);
        declareFunction("partition_missing_constant_link_error", "PARTITION-MISSING-CONSTANT-LINK-ERROR", 1, 0, false);
        declareFunction("link_partition_constant_shell", "LINK-PARTITION-CONSTANT-SHELL", 4, 0, false);
        declareFunction("link_partition_create_constant", "LINK-PARTITION-CREATE-CONSTANT", 2, 0, false);
        declareFunction("link_partition_install_constant_id", "LINK-PARTITION-INSTALL-CONSTANT-ID", 2, 0, false);
        declareFunction("preseed_load_partition_constants_store", "PRESEED-LOAD-PARTITION-CONSTANTS-STORE", 1, 1, false);
        declareMacro("with_preseeded_partition_constants", "WITH-PRESEEDED-PARTITION-CONSTANTS");
        declareFunction("load_partition_from_stream_with_preseeding", "LOAD-PARTITION-FROM-STREAM-WITH-PRESEEDING", 2, 1, false);
        declareFunction("link_partition_constant_error_1", "LINK-PARTITION-CONSTANT-ERROR-1", 2, 0, false);
        declareFunction("link_partition_constant_error_2", "LINK-PARTITION-CONSTANT-ERROR-2", 2, 0, false);
        declareFunction("link_partition_constant_error_3", "LINK-PARTITION-CONSTANT-ERROR-3", 2, 0, false);
        declareFunction("link_partition_constant_error_4", "LINK-PARTITION-CONSTANT-ERROR-4", 2, 0, false);
        declareFunction("link_partition_constant_error_5", "LINK-PARTITION-CONSTANT-ERROR-5", 2, 0, false);
        declareFunction("link_partition_constant_error_6", "LINK-PARTITION-CONSTANT-ERROR-6", 2, 0, false);
        declareFunction("link_partition_constant_error_7", "LINK-PARTITION-CONSTANT-ERROR-7", 2, 0, false);
        declareFunction("clear_load_partition_narts", "CLEAR-LOAD-PARTITION-NARTS", 1, 0, false);
        declareFunction("gather_load_partition_scope_narts", "GATHER-LOAD-PARTITION-SCOPE-NARTS", 0, 0, false);
        declareFunction("gather_load_partition_missing_narts", "GATHER-LOAD-PARTITION-MISSING-NARTS", 0, 0, false);
        declareFunction("note_load_partition_nart", "NOTE-LOAD-PARTITION-NART", 3, 0, false);
        declareFunction("note_load_partition_missing_nart", "NOTE-LOAD-PARTITION-MISSING-NART", 2, 0, false);
        declareFunction("partition_find_nart_by_id", "PARTITION-FIND-NART-BY-ID", 1, 0, false);
        declareFunction("link_partition_nart_shell", "LINK-PARTITION-NART-SHELL", 3, 0, false);
        declareFunction("link_partition_create_nart_shell", "LINK-PARTITION-CREATE-NART-SHELL", 1, 0, false);
        declareFunction("partition_missing_nart_link_error", "PARTITION-MISSING-NART-LINK-ERROR", 1, 0, false);
        declareFunction("clear_load_partition_assertions", "CLEAR-LOAD-PARTITION-ASSERTIONS", 1, 0, false);
        declareFunction("gather_load_partition_assertions", "GATHER-LOAD-PARTITION-ASSERTIONS", 0, 0, false);
        declareFunction("gather_load_partition_missing_assertions", "GATHER-LOAD-PARTITION-MISSING-ASSERTIONS", 0, 0, false);
        declareFunction("note_load_partition_assertion", "NOTE-LOAD-PARTITION-ASSERTION", 3, 0, false);
        declareFunction("note_load_partition_missing_assertion", "NOTE-LOAD-PARTITION-MISSING-ASSERTION", 2, 0, false);
        declareFunction("partition_find_assertion_by_id", "PARTITION-FIND-ASSERTION-BY-ID", 1, 0, false);
        declareFunction("link_partition_assertion", "LINK-PARTITION-ASSERTION", 6, 0, false);
        declareFunction("link_partition_create_assertion_shell", "LINK-PARTITION-CREATE-ASSERTION-SHELL", 4, 0, false);
        declareFunction("partition_missing_assertion_link_error", "PARTITION-MISSING-ASSERTION-LINK-ERROR", 1, 0, false);
        declareFunction("clear_load_partition_kb_hl_supports", "CLEAR-LOAD-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction("gather_load_partition_kb_hl_supports", "GATHER-LOAD-PARTITION-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("gather_load_partition_scope_kb_hl_supports", "GATHER-LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("gather_load_partition_missing_kb_hl_supports", "GATHER-LOAD-PARTITION-MISSING-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("note_load_partition_kb_hl_support", "NOTE-LOAD-PARTITION-KB-HL-SUPPORT", 3, 0, false);
        declareFunction("note_load_partition_missing_kb_hl_support", "NOTE-LOAD-PARTITION-MISSING-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("partition_find_kb_hl_support_by_id", "PARTITION-FIND-KB-HL-SUPPORT-BY-ID", 1, 0, false);
        declareFunction("link_partition_kb_hl_support", "LINK-PARTITION-KB-HL-SUPPORT", 4, 0, false);
        declareFunction("link_partition_create_kb_hl_support", "LINK-PARTITION-CREATE-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("partition_missing_kb_hl_support_link_error", "PARTITION-MISSING-KB-HL-SUPPORT-LINK-ERROR", 1, 0, false);
        declareFunction("link_partition_asserted_argument", "LINK-PARTITION-ASSERTED-ARGUMENT", 3, 0, false);
        declareFunction("link_partition_deduction", "LINK-PARTITION-DEDUCTION", 3, 0, false);
        declareFunction("link_partition_assertible", "LINK-PARTITION-ASSERTIBLE", 5, 0, false);
        declareFunction("clear_partition_loader_state", "CLEAR-PARTITION-LOADER-STATE", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_partitions_file_alt() {
        defparameter("*PARTITION-SCOPE-COMPLETELY-SPECIFIED?*", NIL);
        defparameter("*RESET-SBHL-LINKS*", NIL);
        defparameter("*PARTITION-SCOPE-HASH*", NIL);
        defparameter("*SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*", NIL);
        defparameter("*PARTITION-CONSTANT-HASH*", NIL);
        defparameter("*PARTITION-NART-HASH*", NIL);
        defparameter("*PARTITION-ASSERTION-HASH*", NIL);
        defparameter("*PARTITION-META-ASSERTION-HASH*", NIL);
        defparameter("*PARTITION-KB-HL-SUPPORT-HASH*", NIL);
        defparameter("*PARTITION-ARGUMENT-HASH*", NIL);
        defparameter("*PARTITION-MAX-NART-COMPLEXITY*", NIL);
        defparameter("*PARTITION-MAX-TERM-ORDER*", NIL);
        defparameter("*PARTITION-KB-HL-SUPPORT-ORDERS*", NIL);
        defparameter("*PARTITION-MAX-KB-HL-SUPPORT-ORDER*", NIL);
        deflexical("*MARK-PARTITION-OBJECT-METHOD-TABLE*", make_vector($int$256, NIL));
        defparameter("*CURRENT-ARCHIVE-STREAM*", T);
        defparameter("*DUMP-PARTITION-FORMAT*", $str_alt62$2_2);
        defparameter("*BACKWARDS-COMPATIBILITY-PAIRS*", $list_alt63);
        defparameter("*PARTITION-SECTION-MARKER*", $SECTION);
        defparameter("*PARTITION-ASSERTED-ARGUMENT-TYPE-FLAG*", $ASSERTED);
        defparameter("*PARTITION-SPECIAL-OBJECTS*", list($partition_section_marker$.getDynamicValue(), $partition_asserted_argument_type_flag$.getDynamicValue()));
        defparameter("*LOAD-PARTITION-INVALID-MISSING-TERMS*", NIL);
        defparameter("*LOAD-PARTITION-MAX-NART-COMPLEXITY*", ZERO_INTEGER);
        defparameter("*LOAD-PARTITION-MAX-TERM-ORDER*", ZERO_INTEGER);
        defparameter("*LOAD-PARTITION-MAX-KB-HL-SUPPORT-ORDER*", ZERO_INTEGER);
        defparameter("*TRACE-PARTITION-LINK-ERRORS*", T);
        defparameter("*LOAD-PARTITION-WEAKEN-HL-SUPPORTS*", NIL);
        defparameter("*PRESEEDED-PARTITION-CONSTANTS*", NIL);
        defparameter("*LOAD-PARTITION-CONSTANTS*", NIL);
        defparameter("*LOAD-PARTITION-SCOPE-CONSTANTS*", NIL);
        defparameter("*LOAD-PARTITION-MISSING-CONSTANTS*", NIL);
        defparameter("*LOAD-PARTITION-NARTS*", NIL);
        defparameter("*LOAD-PARTITION-SCOPE-NARTS*", NIL);
        defparameter("*LOAD-PARTITION-MISSING-NARTS*", NIL);
        defparameter("*LOAD-PARTITION-ASSERTIONS*", NIL);
        defparameter("*LOAD-PARTITION-MISSING-ASSERTIONS*", NIL);
        defparameter("*LOAD-PARTITION-KB-HL-SUPPORTS*", NIL);
        defparameter("*LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS*", NIL);
        defparameter("*LOAD-PARTITION-MISSING-KB-HL-SUPPORTS*", NIL);
        return NIL;
    }

    public static SubLObject init_partitions_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*PARTITION-SCOPE-COMPLETELY-SPECIFIED?*", NIL);
            defparameter("*RESET-SBHL-LINKS*", NIL);
            defparameter("*PARTITION-SCOPE-HASH*", NIL);
            defparameter("*SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*", NIL);
            defparameter("*ASSERTION-PARTITION-FORT-FILTER-FUNCTION*", NIL);
            defparameter("*PARTITION-CONSTANT-HASH*", NIL);
            defparameter("*PARTITION-NART-HASH*", NIL);
            defparameter("*PARTITION-ASSERTION-HASH*", NIL);
            defparameter("*PARTITION-META-ASSERTION-HASH*", NIL);
            defparameter("*PARTITION-KB-HL-SUPPORT-HASH*", NIL);
            defparameter("*PARTITION-ARGUMENT-HASH*", NIL);
            defparameter("*PARTITION-MAX-NART-COMPLEXITY*", NIL);
            defparameter("*PARTITION-MAX-TERM-ORDER*", NIL);
            defparameter("*PARTITION-KB-HL-SUPPORT-ORDERS*", NIL);
            defparameter("*PARTITION-MAX-KB-HL-SUPPORT-ORDER*", NIL);
            deflexical("*MARK-PARTITION-OBJECT-METHOD-TABLE*", make_vector($int$256, NIL));
            defparameter("*CURRENT-ARCHIVE-STREAM*", T);
            defparameter("*DUMP-PARTITION-FORMAT*", $str76$2_2);
            defparameter("*BACKWARDS-COMPATIBILITY-PAIRS*", $list77);
            defparameter("*PARTITION-SECTION-MARKER*", $SECTION);
            defparameter("*PARTITION-ASSERTED-ARGUMENT-TYPE-FLAG*", $ASSERTED);
            defparameter("*PARTITION-SPECIAL-OBJECTS*", list($partition_section_marker$.getDynamicValue(), $partition_asserted_argument_type_flag$.getDynamicValue()));
            defparameter("*PARTITION-ENTIRE-KB-LOAD?*", NIL);
            defparameter("*LOAD-PARTITION-INVALID-MISSING-TERMS*", NIL);
            defparameter("*LOAD-PARTITION-MAX-NART-COMPLEXITY*", ZERO_INTEGER);
            defparameter("*LOAD-PARTITION-MAX-TERM-ORDER*", ZERO_INTEGER);
            defparameter("*LOAD-PARTITION-MAX-KB-HL-SUPPORT-ORDER*", ZERO_INTEGER);
            defparameter("*TRACE-PARTITION-LINK-ERRORS*", T);
            defparameter("*LOAD-PARTITION-WEAKEN-HL-SUPPORTS*", NIL);
            defparameter("*PRESEEDED-PARTITION-CONSTANTS*", NIL);
            defparameter("*LOAD-PARTITION-CONSTANTS*", NIL);
            defparameter("*LOAD-PARTITION-SCOPE-CONSTANTS*", NIL);
            defparameter("*LOAD-PARTITION-MISSING-CONSTANTS*", NIL);
            defparameter("*LOAD-PARTITION-NARTS*", NIL);
            defparameter("*LOAD-PARTITION-SCOPE-NARTS*", NIL);
            defparameter("*LOAD-PARTITION-MISSING-NARTS*", NIL);
            defparameter("*LOAD-PARTITION-ASSERTIONS*", NIL);
            defparameter("*LOAD-PARTITION-MISSING-ASSERTIONS*", NIL);
            defparameter("*LOAD-PARTITION-KB-HL-SUPPORTS*", NIL);
            defparameter("*LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS*", NIL);
            defparameter("*LOAD-PARTITION-MISSING-KB-HL-SUPPORTS*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*DUMP-PARTITION-FORMAT*", $str_alt62$2_2);
            defparameter("*BACKWARDS-COMPATIBILITY-PAIRS*", $list_alt63);
        }
        return NIL;
    }

    public static SubLObject init_partitions_file_Previous() {
        defparameter("*PARTITION-SCOPE-COMPLETELY-SPECIFIED?*", NIL);
        defparameter("*RESET-SBHL-LINKS*", NIL);
        defparameter("*PARTITION-SCOPE-HASH*", NIL);
        defparameter("*SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*", NIL);
        defparameter("*ASSERTION-PARTITION-FORT-FILTER-FUNCTION*", NIL);
        defparameter("*PARTITION-CONSTANT-HASH*", NIL);
        defparameter("*PARTITION-NART-HASH*", NIL);
        defparameter("*PARTITION-ASSERTION-HASH*", NIL);
        defparameter("*PARTITION-META-ASSERTION-HASH*", NIL);
        defparameter("*PARTITION-KB-HL-SUPPORT-HASH*", NIL);
        defparameter("*PARTITION-ARGUMENT-HASH*", NIL);
        defparameter("*PARTITION-MAX-NART-COMPLEXITY*", NIL);
        defparameter("*PARTITION-MAX-TERM-ORDER*", NIL);
        defparameter("*PARTITION-KB-HL-SUPPORT-ORDERS*", NIL);
        defparameter("*PARTITION-MAX-KB-HL-SUPPORT-ORDER*", NIL);
        deflexical("*MARK-PARTITION-OBJECT-METHOD-TABLE*", make_vector($int$256, NIL));
        defparameter("*CURRENT-ARCHIVE-STREAM*", T);
        defparameter("*DUMP-PARTITION-FORMAT*", $str76$2_2);
        defparameter("*BACKWARDS-COMPATIBILITY-PAIRS*", $list77);
        defparameter("*PARTITION-SECTION-MARKER*", $SECTION);
        defparameter("*PARTITION-ASSERTED-ARGUMENT-TYPE-FLAG*", $ASSERTED);
        defparameter("*PARTITION-SPECIAL-OBJECTS*", list($partition_section_marker$.getDynamicValue(), $partition_asserted_argument_type_flag$.getDynamicValue()));
        defparameter("*PARTITION-ENTIRE-KB-LOAD?*", NIL);
        defparameter("*LOAD-PARTITION-INVALID-MISSING-TERMS*", NIL);
        defparameter("*LOAD-PARTITION-MAX-NART-COMPLEXITY*", ZERO_INTEGER);
        defparameter("*LOAD-PARTITION-MAX-TERM-ORDER*", ZERO_INTEGER);
        defparameter("*LOAD-PARTITION-MAX-KB-HL-SUPPORT-ORDER*", ZERO_INTEGER);
        defparameter("*TRACE-PARTITION-LINK-ERRORS*", T);
        defparameter("*LOAD-PARTITION-WEAKEN-HL-SUPPORTS*", NIL);
        defparameter("*PRESEEDED-PARTITION-CONSTANTS*", NIL);
        defparameter("*LOAD-PARTITION-CONSTANTS*", NIL);
        defparameter("*LOAD-PARTITION-SCOPE-CONSTANTS*", NIL);
        defparameter("*LOAD-PARTITION-MISSING-CONSTANTS*", NIL);
        defparameter("*LOAD-PARTITION-NARTS*", NIL);
        defparameter("*LOAD-PARTITION-SCOPE-NARTS*", NIL);
        defparameter("*LOAD-PARTITION-MISSING-NARTS*", NIL);
        defparameter("*LOAD-PARTITION-ASSERTIONS*", NIL);
        defparameter("*LOAD-PARTITION-MISSING-ASSERTIONS*", NIL);
        defparameter("*LOAD-PARTITION-KB-HL-SUPPORTS*", NIL);
        defparameter("*LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS*", NIL);
        defparameter("*LOAD-PARTITION-MISSING-KB-HL-SUPPORTS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_partitions_file_alt() {
        register_method($mark_partition_object_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_CONS_METHOD));
        register_method($mark_partition_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_CONSTANT_METHOD));
        register_method($mark_partition_object_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_NART_METHOD));
        register_method($mark_partition_object_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_ASSERTION_METHOD));
        register_method($mark_partition_object_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_DEDUCTION_METHOD));
        register_method($mark_partition_object_method_table$.getGlobalValue(), kb_hl_supports.$dtp_kb_hl_support$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD));
        return NIL;
    }

    public static SubLObject setup_partitions_file() {
        if (SubLFiles.USE_V1) {
            register_method($mark_partition_object_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_CONS_METHOD));
            register_method($mark_partition_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_CONSTANT_METHOD));
            register_method($mark_partition_object_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_NART_METHOD));
            register_method($mark_partition_object_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_ASSERTION_METHOD));
            register_method($mark_partition_object_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_DEDUCTION_METHOD));
            register_method($mark_partition_object_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD));
        }
        if (SubLFiles.USE_V2) {
            register_method($mark_partition_object_method_table$.getGlobalValue(), kb_hl_supports.$dtp_kb_hl_support$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD));
        }
        return NIL;
    }

    public static SubLObject setup_partitions_file_Previous() {
        register_method($mark_partition_object_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_CONS_METHOD));
        register_method($mark_partition_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_CONSTANT_METHOD));
        register_method($mark_partition_object_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_NART_METHOD));
        register_method($mark_partition_object_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_ASSERTION_METHOD));
        register_method($mark_partition_object_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_DEDUCTION_METHOD));
        register_method($mark_partition_object_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), symbol_function(MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_partitions_file();
    }

    @Override
    public void initializeVariables() {
        init_partitions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_partitions_file();
    }

    static {
    }
}

/**
 * Total time: 2114 ms
 */
