/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.butler;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.gafP;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
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
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.lower_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nset_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.seventh;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sixth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.folification;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.verbosifier;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ALCHEMY-EXPORT
 * source file: /cyc/top/cycl/butler/alchemy-export.lisp
 * created:     2019/07/03 17:39:04
 */
public final class alchemy_export extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new alchemy_export();

 public static final String myName = "com.cyc.cycjava.cycl.butler.alchemy_export";


    // defparameter
    // Definitions
    /**
     * Are we in a context where we're exporting just FOL cafs (:CAFS) (@see
     * fol-caf?), just FOL non-cafs (:RULES), or both (:BOTH)? This is motivated by
     * the fact that Alchemy requires its rule input to be in a separate file from
     * its caf input.
     */
    @LispMethod(comment = "Are we in a context where we\'re exporting just FOL cafs (:CAFS) (@see\r\nfol-caf?), just FOL non-cafs (:RULES), or both (:BOTH)? This is motivated by\r\nthe fact that Alchemy requires its rule input to be in a separate file from\r\nits caf input.\ndefparameter\nAre we in a context where we\'re exporting just FOL cafs (:CAFS) (@see\nfol-caf?), just FOL non-cafs (:RULES), or both (:BOTH)? This is motivated by\nthe fact that Alchemy requires its rule input to be in a separate file from\nits caf input.")
    private static final SubLSymbol $alchemy_export_cafs_or_rulesP$ = makeSymbol("*ALCHEMY-EXPORT-CAFS-OR-RULES?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $atomic_assertion_selection_criteria$ = makeSymbol("*ATOMIC-ASSERTION-SELECTION-CRITERIA*");

    // deflexical
    /**
     * A plist mapping each assertion-selection criterion operator to its
     * arg-type(s). An operator that takes a specific number of arguments has a list
     * of arg-types specified, while one that take an arbitrary number has a single
     * type that applies to all its args. An arg-type is represented either as a
     * type predicate or the keyword :CRITERION.
     */
    @LispMethod(comment = "A plist mapping each assertion-selection criterion operator to its\r\narg-type(s). An operator that takes a specific number of arguments has a list\r\nof arg-types specified, while one that take an arbitrary number has a single\r\ntype that applies to all its args. An arg-type is represented either as a\r\ntype predicate or the keyword :CRITERION.\ndeflexical\nA plist mapping each assertion-selection criterion operator to its\narg-type(s). An operator that takes a specific number of arguments has a list\nof arg-types specified, while one that take an arbitrary number has a single\ntype that applies to all its args. An arg-type is represented either as a\ntype predicate or the keyword :CRITERION.")
    private static final SubLSymbol $assertion_selection_arg_types_by_operator$ = makeSymbol("*ASSERTION-SELECTION-ARG-TYPES-BY-OPERATOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $delayed_atomic_assertion_selection_criteria$ = makeSymbol("*DELAYED-ATOMIC-ASSERTION-SELECTION-CRITERIA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $delayed_assertion_selection_criterion_operators$ = makeSymbol("*DELAYED-ASSERTION-SELECTION-CRITERION-OPERATORS*");

    // defparameter
    // the number of exported sentences
    /**
     * the number of exported sentences
     */
    @LispMethod(comment = "the number of exported sentences\ndefparameter")
    private static final SubLSymbol $ae_number_of_sentences$ = makeSymbol("*AE-NUMBER-OF-SENTENCES*");

    // defparameter
    // the number of training predicates
    /**
     * the number of training predicates
     */
    @LispMethod(comment = "the number of training predicates\ndefparameter")
    private static final SubLSymbol $ae_number_of_training_predicates$ = makeSymbol("*AE-NUMBER-OF-TRAINING-PREDICATES*");

    // defparameter
    // the numbero of exported evidence terms
    /**
     * the numbero of exported evidence terms
     */
    @LispMethod(comment = "the numbero of exported evidence terms\ndefparameter")
    private static final SubLSymbol $ae_number_of_evidence_terms$ = makeSymbol("*AE-NUMBER-OF-EVIDENCE-TERMS*");

    // deflexical
    // indicates whether to export assertions containing numeric terms
    /**
     * indicates whether to export assertions containing numeric terms
     */
    @LispMethod(comment = "indicates whether to export assertions containing numeric terms\ndeflexical")
    private static final SubLSymbol $alchemy_export_numeric_terms$ = makeSymbol("*ALCHEMY-EXPORT-NUMERIC-TERMS*");

    // defparameter
    // the list of predicates to be dropped from an Alchemy export
    /**
     * the list of predicates to be dropped from an Alchemy export
     */
    @LispMethod(comment = "the list of predicates to be dropped from an Alchemy export\ndefparameter")
    private static final SubLSymbol $alchemy_export_dropped_predicates$ = makeSymbol("*ALCHEMY-EXPORT-DROPPED-PREDICATES*");

    // deflexical
    // The FOLification properties to use by default when exporting to Alchemy
    /**
     * The FOLification properties to use by default when exporting to Alchemy
     */
    @LispMethod(comment = "The FOLification properties to use by default when exporting to Alchemy\ndeflexical")
    private static final SubLSymbol $alchemy_folification_properties$ = makeSymbol("*ALCHEMY-FOLIFICATION-PROPERTIES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $alchemy_export_type_prefix$ = makeSymbol("*ALCHEMY-EXPORT-TYPE-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $alchemy_export_predicate_prefix$ = makeSymbol("*ALCHEMY-EXPORT-PREDICATE-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $alchemy_export_constant_prefix$ = makeSymbol("*ALCHEMY-EXPORT-CONSTANT-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $alchemy_export_hl_id_prefix$ = makeSymbol("*ALCHEMY-EXPORT-HL-ID-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $double_quote_string$ = makeSymbol("*DOUBLE-QUOTE-STRING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $central_regression_dir$ = makeSymbol("*CENTRAL-REGRESSION-DIR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regression_calls$ = makeSymbol("*REGRESSION-CALLS*");

    static private final SubLString $str2$____Inference_answers_in_Alchemy_ = makeString("/*~%Inference answers in Alchemy format~%Created on ~A~%");

    static private final SubLString $str3$Generated_from_KB__A_running_on_C = makeString("Generated from KB ~A running on CycL version ~A~%");

    static private final SubLString $str4$Query_sentence___S__Mt___S_______ = makeString("Query sentence: ~S~%Mt: ~S~%*/~%~%");

    static private final SubLString $str6$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str8$____Couldn_t_export_the_sentence_ = makeString("/*~%Couldn't export the sentence ~S:~%~A~%*/");

    private static final SubLSymbol ATOMIC_ASSERTION_SELECTION_CRITERION_P = makeSymbol("ATOMIC-ASSERTION-SELECTION-CRITERION-P");

    static private final SubLString $str11$Invalid_assertion_selection_crite = makeString("Invalid assertion-selection criterion ~S: neither a keyword nor a proper list");

    static private final SubLList $list14 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

    static private final SubLString $str16$Invalid_assertion_selection_crite = makeString("Invalid assertion-selection criterion ~S: unknown operator ~S");

    static private final SubLString $str17$The_assertion_selection_operator_ = makeString("The assertion-selection operator ~S requires exactly ~S arguments ~S.  ~S arguments were passed in ~S");

    static private final SubLString $str19$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLList $list20 = list(new SubLObject[]{ makeKeyword("UNION"), makeKeyword("CRITERION"), makeKeyword("INTERSECTION"), makeKeyword("CRITERION"), makeKeyword("EXCEPTION"), list(makeKeyword("CRITERION"), makeKeyword("CRITERION")), makeKeyword("IN-MT"), list(makeSymbol("HLMT-P")), makeKeyword("VISIBLE-FROM-MT"), list(makeSymbol("HLMT-P")), makeKeyword("COLLECTION-EXTENT"), list(makeSymbol("COLLECTION-P")), makeKeyword("COLLECTION-EXTENTS"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P")), makeKeyword("COLLECTION-EXTENTS-QUOTED"), list(makeSymbol("COLLECTION-P")), makeKeyword("PREDICATE-EXTENT"), list(makeSymbol("PREDICATE-P")), makeKeyword("PREDICATE-EXTENTS"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P")), makeKeyword("PREDICATE-EXTENTS-QUOTED"), list(makeSymbol("COLLECTION-P")), makeKeyword("ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-MENTIONED"), list(makeKeyword("CRITERION")), makeKeyword("ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-AND-COLLECTIONS-MENTIONED"), list(makeKeyword("CRITERION")), makeKeyword("MENTIONS-TERM"), list(makeSymbol("INDEXED-TERM-P")), makeKeyword("MENTIONS-TERM-AT-LEAST-N-TIMES"), list(makeSymbol("INDEXED-TERM-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-TERM-IN-ARGPOS"), list(makeSymbol("INDEXED-TERM-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-ANY-INSTANTIATION-OF"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P")), makeKeyword("MENTIONS-ANY-QUOTED-INSTANCE-OF"), list(makeSymbol("COLLECTION-P")), makeKeyword("MENTIONS-INSTANTIATIONS-OF-AT-LEAST-N-TIMES"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-QUOTED-INSTANCES-OF-AT-LEAST-N-TIMES"), list(makeSymbol("COLLECTION-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-ANY-INSTANTIATION-OF-IN-ARGPOS"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-ANY-QUOTED-INSTANCE-OF-IN-ARGPOS"), list(makeSymbol("COLLECTION-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-ALL-INSTANTIATIONS-OF"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P")), makeKeyword("MENTIONS-ALL-QUOTED-INSTANCES-OF"), list(makeSymbol("COLLECTION-P")), makeKeyword("MENTIONS-ONLY-INSTANTIATIONS-OF"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P")), makeKeyword("MENTIONS-ONLY-QUOTED-INSTANCES-OF"), list(makeSymbol("COLLECTION-P")) });

    static private final SubLString $str22$Unknown_atomic_assertion_selectio = makeString("Unknown atomic assertion-selection criterion: ~S");

    private static final SubLSymbol FIND_ASSERTIONS_BY_CRITERION_INT = makeSymbol("FIND-ASSERTIONS-BY-CRITERION-INT");

    static private final SubLList $list27 = list(makeSymbol("POSITIVE-CRITERION"), makeSymbol("NEGATIVE-CRITERION"));

    static private final SubLList $list29 = list(makeSymbol("MT"));

    private static final SubLSymbol $VISIBLE_FROM_MT = makeKeyword("VISIBLE-FROM-MT");

    static private final SubLList $list32 = list(makeSymbol("COLL"));

    static private final SubLList $list34 = list(makeSymbol("SET-OR-COLL"));

    private static final SubLSymbol $COLLECTION_EXTENTS_QUOTED = makeKeyword("COLLECTION-EXTENTS-QUOTED");

    static private final SubLList $list37 = list(makeSymbol("PRED"));

    private static final SubLSymbol $PREDICATE_EXTENTS_QUOTED = makeKeyword("PREDICATE-EXTENTS-QUOTED");

    private static final SubLSymbol $ASSERTIONS_MEETING_CRITERION_PLUS_EXTENTS_OF_PREDICATES_MENTIONED = makeKeyword("ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-MENTIONED");

    static private final SubLList $list41 = list(makeSymbol("CRITERION"));

    private static final SubLSymbol $kw42$ASSERTIONS_MEETING_CRITERION_PLUS_EXTENTS_OF_PREDICATES_AND_COLLE = makeKeyword("ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-AND-COLLECTIONS-MENTIONED");

    static private final SubLList $list44 = list(makeSymbol("TERM"));

    private static final SubLSymbol $MENTIONS_TERM_AT_LEAST_N_TIMES = makeKeyword("MENTIONS-TERM-AT-LEAST-N-TIMES");

    static private final SubLList $list46 = list(makeSymbol("TERM"), makeSymbol("N"));

    private static final SubLSymbol $MENTIONS_TERM_IN_ARGPOS = makeKeyword("MENTIONS-TERM-IN-ARGPOS");

    static private final SubLList $list48 = list(makeSymbol("TERM"), makeSymbol("ARGPOS"));

    private static final SubLSymbol $MENTIONS_ANY_INSTANTIATION_OF = makeKeyword("MENTIONS-ANY-INSTANTIATION-OF");

    private static final SubLSymbol $MENTIONS_ANY_QUOTED_INSTANCE_OF = makeKeyword("MENTIONS-ANY-QUOTED-INSTANCE-OF");

    private static final SubLSymbol $MENTIONS_INSTANTIATIONS_OF_AT_LEAST_N_TIMES = makeKeyword("MENTIONS-INSTANTIATIONS-OF-AT-LEAST-N-TIMES");

    static private final SubLList $list52 = list(makeSymbol("SET-OR-COLL"), makeSymbol("N"));

    private static final SubLSymbol $MENTIONS_QUOTED_INSTANCES_OF_AT_LEAST_N_TIMES = makeKeyword("MENTIONS-QUOTED-INSTANCES-OF-AT-LEAST-N-TIMES");

    static private final SubLList $list54 = list(makeSymbol("COLL"), makeSymbol("N"));

    private static final SubLSymbol $MENTIONS_ANY_INSTANTIATION_OF_IN_ARGPOS = makeKeyword("MENTIONS-ANY-INSTANTIATION-OF-IN-ARGPOS");

    static private final SubLList $list56 = list(makeSymbol("SET-OR-COLL"), makeSymbol("ARGPOS"));

    private static final SubLSymbol $MENTIONS_ANY_QUOTED_INSTANCE_OF_IN_ARGPOS = makeKeyword("MENTIONS-ANY-QUOTED-INSTANCE-OF-IN-ARGPOS");

    static private final SubLList $list58 = list(makeSymbol("COLL"), makeSymbol("ARGPOS"));

    private static final SubLSymbol $MENTIONS_ALL_INSTANTIATIONS_OF = makeKeyword("MENTIONS-ALL-INSTANTIATIONS-OF");

    private static final SubLSymbol $MENTIONS_ALL_QUOTED_INSTANCES_OF = makeKeyword("MENTIONS-ALL-QUOTED-INSTANCES-OF");

    private static final SubLSymbol $MENTIONS_ONLY_INSTANTIATIONS_OF = makeKeyword("MENTIONS-ONLY-INSTANTIATIONS-OF");

    private static final SubLSymbol $MENTIONS_ONLY_QUOTED_INSTANCES_OF = makeKeyword("MENTIONS-ONLY-QUOTED-INSTANCES-OF");

    static private final SubLString $str63$Invalid_assertion_selection_crite = makeString("Invalid assertion-selection criterion ~S: neither a keyword nor a list");

    static private final SubLSymbol $sym64$DELAYED_ASSERTION_SELECTION_CRITERION_ = makeSymbol("DELAYED-ASSERTION-SELECTION-CRITERION?");

    static private final SubLString $str65$Internal_error__Invalid_atomic_cr = makeString("Internal error: Invalid atomic criterion for find-assertions-meeting-criterion-among: ~S");

    static private final SubLString $str66$Internal_error__Invalid_criterion = makeString("Internal error: Invalid criterion operator for find-assertions-meeting-criterion-among: ~S");









    static private final SubLString $str71$Collecting_assertions_visible_fro = makeString("Collecting assertions visible from ");

    static private final SubLSymbol $sym73$RELEVANT_ASSERTION_ = makeSymbol("RELEVANT-ASSERTION?");



    private static final SubLSymbol ASSERTION_PREDICATES = makeSymbol("ASSERTION-PREDICATES");

    private static final SubLSymbol ASSERTION_PREDICATES_AND_COLLECTIONS = makeSymbol("ASSERTION-PREDICATES-AND-COLLECTIONS");

    static private final SubLString $str79$__finding_pred_or_coll_extent_for = makeString("  finding pred-or-coll-extent for: ~A~%");

    private static final SubLSymbol PREDICATE_OR_COLLECTION_P = makeSymbol("PREDICATE-OR-COLLECTION-P");

    static private final SubLString $str82$_5D_seconds_duration__ = makeString("~5D seconds duration~%");

    static private final SubLString $str84$_S_and__S_are_not_lists_of_the_sa = makeString("~S and ~S are not lists of the same length");

    static private final SubLString $str85$_____5D_training_gafs__ = makeString("~%~%~5D training gafs~%");

    static private final SubLString $str86$_5D_training_terms__ = makeString("~5D training terms~%");

    static private final SubLString $str87$_5D_training_rules__ = makeString("~5D training rules~%");

    static private final SubLString $str88$_5D_training_predicates__ = makeString("~5D training predicates~%");

    static private final SubLString $str89$_5D_evidence_gafs__ = makeString("~5D evidence gafs~%");

    static private final SubLString $str90$_5D_evidence_terms__ = makeString("~5D evidence terms~%");

    static private final SubLString $str91$_5D_types__ = makeString("~5D types~%");

    static private final SubLString $str94$Finding_Alchemy_export_assertions = makeString("Finding Alchemy export assertions for training~%");

    static private final SubLString $$$training_gafs = makeString("training gafs");

    static private final SubLString $str96$__Finding_Alchemy_export_assertio = makeString("~%Finding Alchemy export assertions for rules~%");

    static private final SubLString $$$training_rules = makeString("training rules");

    static private final SubLString $str99$__Finding_Alchemy_export_assertio = makeString("~%Finding Alchemy export assertions for evidence~%");

    static private final SubLString $$$evidence_gafs = makeString("evidence gafs");

    static private final SubLString $$$allowed_types = makeString("allowed types");

    static private final SubLString $str105$____dropped_gaf_from_export_becau = makeString("    dropped gaf from export because ~A is not an allowed type:~%      ~A~%");

    static private final SubLString $str106$Exporting_Alchemy_gaf_file__A__ = makeString("Exporting Alchemy gaf file ~A~%");

    static private final SubLString $str107$__considering_____A__ = makeString("~%considering :  ~A~%");

    static private final SubLString $str108$_____A_is_not_an_allowed_type__ = makeString("    ~A is not an allowed type~%");

    static private final SubLString $str109$_____A_is_not_a_reified_predicate = makeString("    ~A is not a reified predicate~%");

    static private final SubLString $str110$____dropped_rule_from_export____A = makeString("    dropped rule from export:  ~A~%");

    static private final SubLList $list111 = list(makeSymbol("TRAINING-FOL-PREDICATES"), makeSymbol("TRAINING-FOL-ARGUMENTS"));

    static private final SubLString $str112$Exporting_Alchemy_rules_file__A__ = makeString("Exporting Alchemy rules file ~A~%");

    static private final SubLList $list113 = list(makeSymbol("ALL-FOL-PREDICATES"), makeSymbol("ALL-FOL-ARGUMENTS"));

    static private final SubLList $list114 = list(makeSymbol("FOL-PREDICATE-FN"), makeSymbol("PREDICATE"), makeSymbol("ARITY"));

    static private final SubLString $str115$__dropping_predicate__A_having_ar = makeString("  dropping predicate ~A having arg constraint ~A which is not an allowed type~%");

    static private final SubLString $str116$_A_must_be_a_GAF = makeString("~A must be a GAF");





    static private final SubLString $str119$_A_is_not_a_valid_type__from_obj_ = makeString("~A is not a valid type, from obj: ~A");

    static private final SubLString $str120$__augmenting_type__A__ = makeString("  augmenting type ~A~%");

    static private final SubLString $str121$_A_is_not_a_valid_type = makeString("~A is not a valid type");

    static private final SubLString $str122$____with__A__ = makeString("    with ~A~%");

    static private final SubLString $str123$__Instantiated_types_in_the__A___ = makeString("~%Instantiated types in the ~A ~%");

    static private final SubLString $str124$___A___A__ = makeString("  ~A  ~A~%");

    private static final SubLObject $$FOL_UnhandledFn = reader_make_constant_shell("FOL-UnhandledFn");

    static private final SubLString $str126$_____A_cannot_be_folified__ = makeString("    ~A cannot be folified~%");

    static private final SubLString $str127$_____A_is_not_instantiated_in_ter = makeString("    ~A is not instantiated in term-set~%");

    static private final SubLString $str128$________adding_instance__A_of__A_ = makeString("        adding instance ~A of ~A~%");

    static private final SubLString $str129$____hl_variable__A_cannot_be_inst = makeString("    hl variable ~A cannot be instantiated with training terms~%");

    static private final SubLString $str130$____dropped_numeric_term_assertio = makeString("    dropped numeric-term assertion from export:  ~A~%");



    static private final SubLList $list132 = list(NIL);



    static private final SubLList $list134 = list(new SubLObject[]{ makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), T });

    private static final SubLSymbol $FOL_SENTENCES_DATA = makeKeyword("FOL-SENTENCES-DATA");

    static private final SubLList $list136 = list(makeSymbol("TERM"), makeSymbol("FOL-SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("UNHANDLED-FOL-SENTENCES"));

    static private final SubLString $str137$____dropped_unhandled_fol_asserti = makeString("    dropped unhandled-fol assertion from export: ~A~%~%");

    static private final SubLList $list138 = list(reader_make_constant_shell("comment"), reader_make_constant_shell("cyclistNotes"), reader_make_constant_shell("cycSecureDocString"), reader_make_constant_shell("examples-Negative"));

    static private final SubLString $str139$__predicate__A__types__A__ = makeString("  predicate ~A  types ~A~%");

    static private final SubLString $str140$____adding_instance__A_of__A__ = makeString("    adding instance ~A of ~A~%");

    static private final SubLString $str141$_____A_is_not_instantiated__ = makeString("    ~A is not instantiated~%");

    static private final SubLString $str142$____dropped_gaf_from_export____A_ = makeString("    dropped gaf from export:  ~A~%");

    static private final SubLString $str143$_____A_is_not_a_training_type__ = makeString("    ~A is not a training type~%");

    static private final SubLString $str144$_____A_is_not_a_training_type____ = makeString("    ~A is not a training type~%    dropped gaf from export:  ~A~%");

    static private final SubLString $str145$____dropped_evidence_gaf_from_exp = makeString("    dropped evidence gaf from export because ~A is not an allowed predicate:~%      ~A~%");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLString $str149$invalid_instances_for_arg_constra = makeString("invalid instances for arg-constraint ~A");

    static private final SubLString $str150$___groundings___10D_fol_predicate = makeString("   groundings: ~10D fol-predicate: ~A ");

    static private final SubLString $str151$_arg_types___A = makeString(" arg-types: ~A");

    static private final SubLString $str152$___total_groundings___12D__ = makeString("   total groundings: ~12D~%");

    static private final SubLString $str153$_ = makeString("(");

    static private final SubLString $str154$_ = makeString(",");

    static private final SubLString $str155$_ = makeString(")");



    static private final SubLString $str157$Can_t_convert_non_predicate_non_c = makeString("Can't convert non-predicate non-collection to FOL predicate: ~S");

    static private final SubLString $str158$_mln = makeString(".mln");

    static private final SubLString $str159$_db = makeString(".db");

    static private final SubLString $str160$__exporting_type___A___A__ = makeString("  exporting type: ~A  ~A~%");

    static private final SubLString $str161$____ = makeString(" = {");

    static private final SubLString $str162$__ = makeString(", ");

    static private final SubLString $str163$_ = makeString("}");

    static private final SubLList $list165 = list(makeSymbol("PREDICATES"), makeSymbol("ARGUMENTS"));

    static private final SubLString $str166$_S_is_not_a_valid_value_for__alch = makeString("~S is not a valid value for *alchemy-export-cafs-or-rules?*");

    static private final SubLList $list168 = list(makeKeyword("COLLAPSE"), reader_make_constant_shell("EverythingPSC"));

    private static final SubLSymbol $kw169$ALLOW_EQUIV_RELATION_ = makeKeyword("ALLOW-EQUIV-RELATION?");

    private static final SubLSymbol $kw170$RETURN_DATA_ = makeKeyword("RETURN-DATA?");

    private static final SubLSymbol $RULE_MACRO_PREDICATE_HANDLING = makeKeyword("RULE-MACRO-PREDICATE-HANDLING");

    private static final SubLSymbol $kw173$INCLUDE_COMMENTS_ = makeKeyword("INCLUDE-COMMENTS?");

    static private final SubLSymbol $sym174$SINGLETON_ = makeSymbol("SINGLETON?");





    static private final SubLList $list177 = list(makeSymbol("LEFT-SIDE"), makeSymbol("RIGHT-SIDE"));





    static private final SubLList $list180 = list(makeSymbol("VAR"), makeSymbol("SENT"));

    static private final SubLString $$$_ = makeString(" ");

    static private final SubLString $str182$_ = makeString(".");

    private static final SubLSymbol ALCHEMY_EXPORT_SENTENTIAL_RELATION = makeSymbol("ALCHEMY-EXPORT-SENTENTIAL-RELATION");

    static private final SubLString $str184$_ = makeString("!");

    static private final SubLString $str185$___ = makeString(" ^ ");

    static private final SubLString $$$_v_ = makeString(" v ");

    static private final SubLString $str187$____ = makeString(" => ");

    static private final SubLString $str188$_____ = makeString(" <=> ");

    static private final SubLString $$$forall_ = makeString("forall ");

    static private final SubLString $$$exist_ = makeString("exist ");

    static private final SubLString $str191$Don_t_know_how_to_export_the_sent = makeString("Don't know how to export the sentential relation ~S to alchemy.");

    public static final SubLSymbol $alchemy_export_sentential_relation_caching_state$ = makeSymbol("*ALCHEMY-EXPORT-SENTENTIAL-RELATION-CACHING-STATE*");

    private static final SubLString $$$type = makeString("type");

    private static final SubLString $$$pred = makeString("pred");

    private static final SubLString $str195$Don_t_know_how_to_export_the_type = makeString("Don't know how to export the type ~S to alchemy.");

    private static final SubLString $str196$Don_t_know_how_to_export_the_pred = makeString("Don't know how to export the predicate ~S to alchemy.");

    private static final SubLString $str197$Don_t_know_how_to_export_the_term = makeString("Don't know how to export the term ~S to alchemy.");

    private static final SubLString $str198$C_ = makeString("C_");

    private static final SubLString $str199$HLID_ = makeString("HLID_");

    private static final SubLList $list200 = list(makeSymbol("FOL-ATOMIC-TERM-FN"), makeSymbol("CONSTANT"));

    private static final SubLString $str201$Tried_to_convert_the_EL_variable_ = makeString("Tried to convert the EL variable ~S to Alchemy text and got ~S");

    private static final SubLString $str202$_ = makeString("\"");

    private static final SubLList $list203 = list(makeSymbol("FOL-STRING-FN"), makeSymbol("STRING"));

    static private final SubLList $list204 = list(makeSymbol("FOL-NUMBER-FN"), makeSymbol("NUMBER"));

    private static final SubLString $str205$_F = makeString("~F");

    private static final SubLString $str206$_D = makeString("~D");

    private static final SubLSymbol VALID_ALCHEMY_IDENTIFIER_CHAR_P = makeSymbol("VALID-ALCHEMY-IDENTIFIER-CHAR-P");

    private static final SubLString $str208$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/regression-tests/");

    private static final SubLString $$$A = makeString("A");

    private static final SubLList $list210 = list(makeSymbol("ALCHEMY-EXPORT"), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoRulesMt"))), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoTrainingGAFsMt"))), list(QUOTE, list(list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoEvidenceGAFsMt")))), makeString("A-rules.mln"), makeString("A-train.db"), list(QUOTE, list(makeString("A-evid.db"))));

    private static final SubLString $$$B = makeString("B");

    private static final SubLList $list212 = list(makeSymbol("ALCHEMY-EXPORT"), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistRulesMt"))), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistTrainingDataMt"))), list(QUOTE, list(list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistTestingDataMt")))), makeString("B-rules.mln"), makeString("B-train.db"), list(QUOTE, list(makeString("B-evid.db"))));

    private static final SubLString $$$C = makeString("C");

    private static final SubLList $list214 = list(makeSymbol("ALCHEMY-EXPORT"), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("TheSimpsonsMt"))), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("TheSimpsonsMt"))), list(QUOTE, list(list(makeKeyword("IN-MT"), reader_make_constant_shell("TheSimpsonsMt")))), makeString("C-rules.mln"), makeString("C-train.db"), list(QUOTE, list(makeString("C-evid.db"))));

    private static final SubLString $$$D = makeString("D");

    private static final SubLList $list216 = list(makeSymbol("ALCHEMY-EXPORT"), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AcademicOrganizationMt"))), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("UniversityDataMt"))), list(QUOTE, list(list(makeKeyword("IN-MT"), reader_make_constant_shell("UniversityDataMt")))), makeString("D-rules.mln"), makeString("D-train.db"), list(QUOTE, list(makeString("D-evid.db"))));

    private static final SubLString $$$E = makeString("E");

    private static final SubLList $list218 = list(makeSymbol("ALCHEMY-EXPORT"), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoIIRulesMt"))), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AustinAreaMt"))), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), makeKeyword("IN-MT"), list(makeSymbol("CANONICALIZE-TERM"), list(QUOTE, list(reader_make_constant_shell("ContentMtFn"), reader_make_constant_shell("WashingtonPostEntertainmentGuide-KS")))))), makeString("E-rules.mln"), makeString("E-train.db"), list(QUOTE, list(makeString("E-evid.db"))));

    private static final SubLString $str219$_scratch_alchemytemp_cyc_projects = makeString("/scratch/alchemytemp/cyc/projects/transfer-learning/Software/Alchemy/mods/regression-tests/");

    private static final SubLString $str220$Got_invalid_regression_test_name_ = makeString("Got invalid regression test name: ~S.");

    private static final SubLString $str222$_S__ = makeString("~S~%");

    private static final SubLList $list223 = list(makeKeyword("INTERSECTION"), $RULE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AcademicOrganizationMt")));

    static private final SubLList $list224 = list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("UniversityDataMt")));

    static private final SubLList $list225 = list(list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("UniversityDataMt"))));

    private static final SubLString $str226$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyc-univ-rules.mln");

    static private final SubLString $str227$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyc-univ-train.db");

    private static final SubLList $list228 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyc-univ-evid.db"));

    static private final SubLList $list229 = list(makeKeyword("INTERSECTION"), $RULE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistRulesMt")));

    static private final SubLList $list230 = list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistTrainingDataMt")));

    static private final SubLList $list231 = list(list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistTestingDataMt"))));

    private static final SubLString $str232$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyclist-rules.mln");

    static private final SubLString $str233$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyclist-train.db");

    private static final SubLList $list234 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyclist-evid.db"));

    static private final SubLList $list235 = list(makeKeyword("INTERSECTION"), $RULE, list(makeKeyword("IN-MT"), reader_make_constant_shell("UnitedStatesGeographyMt")));

    static private final SubLList $list236 = list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("AustinAreaMt")));

    static private final SubLList $list237 = list(list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("AustinAreaMt"))));

    private static final SubLString $str238$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin-rules.mln");

    static private final SubLString $str239$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin-train.db");

    private static final SubLList $list240 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin-evid.db"));

    static private final SubLList $list241 = list(makeKeyword("IN-MT"), reader_make_constant_shell("UnitedStatesGeographyMt"));

    static private final SubLList $list242 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AustinAreaMt"));

    static private final SubLList $list243 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("AustinAreaMt")));

    private static final SubLString $str244$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin2-rules.mln");

    static private final SubLString $str245$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin2-train.db");

    private static final SubLList $list246 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin2-evid.db"));

    static private final SubLList $list247 = list(makeKeyword("IN-MT"), reader_make_constant_shell("BuildingMt"));

    static private final SubLList $list248 = list(makeKeyword("IN-MT"), reader_make_constant_shell("UrbanCombatGame-UCTApartmentsMapMt"));

    static private final SubLList $list249 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("UrbanCombatGame-UCTApartmentsMapMt")));

    private static final SubLString $str250$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-buildingmt-rules.mln");

    static private final SubLString $str251$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-buildingmt-train.db");

    private static final SubLList $list252 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-buildingmt-evid.db"));

    static private final SubLList $list253 = list(makeKeyword("IN-MT"), reader_make_constant_shell("MassMediaMt"));

    static private final SubLList $list254 = list(makeKeyword("IN-MT"), reader_make_constant_shell("MassMediaDataMt"));

    static private final SubLList $list255 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("Starseeker-ActorsKSMt")));

    private static final SubLString $str256$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/movie-rules.mln");

    static private final SubLString $str257$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/movie-train.db");

    private static final SubLList $list258 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/movie-evid.db"));

    static private final SubLList $list259 = list(makeKeyword("MENTIONS-INSTANTIATIONS-OF-AT-LEAST-N-TIMES"), reader_make_constant_shell("PredicateOrCollection-UsedInUCTRepresentation"), TWO_INTEGER);

    private static final SubLString $str260$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-vocab-rules.mln");

    static private final SubLString $str261$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-vocab-train.db");

    private static final SubLList $list262 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-vocab-evid.db"));

    static private final SubLList $list263 = list(makeKeyword("IN-MT"), reader_make_constant_shell("NaiveSpatialMt"));

    private static final SubLString $str264$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-ns-rules.mln");

    static private final SubLString $str265$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-ns-train.db");

    private static final SubLList $list266 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-ns-evid.db"));

    static private final SubLList $list267 = list(makeKeyword("IN-MT"), reader_make_constant_shell("TheSimpsonsMt"));

    static private final SubLList $list268 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("TheSimpsonsMt")));

    private static final SubLString $str269$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/simp-rules.mln");

    static private final SubLString $str270$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/simp-train.db");

    private static final SubLList $list271 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/simp-evid.db"));

    private static final SubLString $str272$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/ucb-rules.mln");

    static private final SubLString $str273$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/ucb-train.db");

    private static final SubLList $list274 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/ucb-evid.db"));

    static private final SubLList $list275 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoRulesMt"));

    static private final SubLList $list276 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoTrainingGAFsMt"));

    static private final SubLList $list277 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoEvidenceGAFsMt")));

    private static final SubLString $str278$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo-rules.mln");

    static private final SubLString $str279$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo-train.db");

    private static final SubLList $list280 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo-evid.db"));

    static private final SubLList $list281 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoIIRulesMt"));

    static private final SubLList $list282 = list(reader_make_constant_shell("ContentMtFn"), reader_make_constant_shell("WashingtonPostEntertainmentGuide-KS"));

    private static final SubLString $str283$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo2-rules.mln");

    static private final SubLString $str284$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo2-train.db");

    private static final SubLList $list285 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo2-evid.db"));

    static private final SubLList $list286 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AmbientConditionsMt"));

    static private final SubLList $list287 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AmbientConditionsDataMt"));

    static private final SubLList $list288 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("CIAWorldFactbook1997Mt")));

    private static final SubLString $str289$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo4-rules.mln");

    static private final SubLString $str290$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo4-train.db");

    private static final SubLList $list291 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo4-evid.db"));

    private static final SubLSymbol CYCL_SENTENCE_TO_ALCHEMY_SENTENCES = makeSymbol("CYCL-SENTENCE-TO-ALCHEMY-SENTENCES");

    private static final SubLList $list299 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("likesAsFriend"), reader_make_constant_shell("RonaldReagan"), reader_make_constant_shell("Madonna"))), makeString("\npred2C_likesAsFriend(C_RonaldReagan,C_Madonna)\n(pred2C_likesAsFriend(arg1,ins)) => (pred1C_PerceptualAgent-Embodied(ins))\n(pred2C_likesAsFriend(ins,arg2)) => (pred1C_PerceptualAgent-Embodied(ins))")), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Emu"))), makeString("\npred1C_Emu(C_Cyc)\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).")), list(list(list(reader_make_constant_shell("eatsWillingly"), list(reader_make_constant_shell("MotherFn"), reader_make_constant_shell("Cyc")), reader_make_constant_shell("Emu"))), makeString("\npred2C_eatsWillingly(HLID_330D821E2BBF65A0729C2911B19DADC379636F72701E2BBD5880659C2911B19DADC379636F7270,C_Emu)\n(pred2C_eatsWillingly(arg1,ins)) => (pred1C_TemporalStuffType(ins))\n(pred2C_eatsWillingly(ins,arg2)) => (pred1C_Animal(ins))\n((pred2C_eatsWillingly(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_eatsWillingly(arg1,new))\npred2C_natFunction(HLID_330D821E2BBF65A0729C2911B19DADC379636F72700B0F853F41524731,C_MotherFn)\npred3C_natArgument(HLID_330D821E2BBF65A0729C2911B19DADC379636F72700B0F853F41524731,1,arg1)\npred1C_FemaleAnimal(HLID_330D821E2BBF65A0729C2911B19DADC379636F72700B0F853F41524731)\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).")), list(list(list(reader_make_constant_shell("dayTimeDecayRate"), reader_make_constant_shell("12-dimethylhydrazine"), ZERO_INTEGER)), makeString("\npred2C_dayTimeDecayRate(C_12-dimethylhydrazine,0)\n(pred2C_dayTimeDecayRate(arg1,ins)) => (pred1C_Number-General(ins))\n(pred2C_dayTimeDecayRate(ins,arg2)) => (pred1C_TemporalStuffType(ins))\n(pred2C_isa(x,C_12-dimethylhydrazine)) <=> (pred1C_12-dimethylhydrazine(x)).")), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Emu")))), makeString("\n!(pred1C_Emu(C_Cyc))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).")), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Emu")), list(reader_make_constant_shell("eatsWillingly"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Pizza")))), makeString("\npred2C_eatsWillingly(C_Cyc,C_Pizza)\npred1C_Emu(C_Cyc)\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).\n(pred2C_eatsWillingly(arg1,ins)) => (pred1C_TemporalStuffType(ins))\n(pred2C_eatsWillingly(ins,arg2)) => (pred1C_Animal(ins))\n((pred2C_eatsWillingly(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_eatsWillingly(arg1,new))\n(pred2C_isa(x,C_Pizza)) <=> (pred1C_Pizza(x)).")), list(list(list(reader_make_constant_shell("or"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Emu")), list(reader_make_constant_shell("eatsWillingly"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Pizza")))), makeString("\n(pred1C_Emu(C_Cyc)) v (pred2C_eatsWillingly(C_Cyc,C_Pizza))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).\n(pred2C_eatsWillingly(arg1,ins)) => (pred1C_TemporalStuffType(ins))\n(pred2C_eatsWillingly(ins,arg2)) => (pred1C_Animal(ins))\n((pred2C_eatsWillingly(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_eatsWillingly(arg1,new))\n(pred2C_isa(x,C_Pizza)) <=> (pred1C_Pizza(x)).")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Emu")), list(reader_make_constant_shell("likesAsFriend"), reader_make_constant_shell("Madonna"), makeSymbol("?X")))), makeString("\n(pred1C_Emu(x)) => (pred2C_likesAsFriend(C_Madonna,x))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).\n(pred2C_likesAsFriend(arg1,ins)) => (pred1C_PerceptualAgent-Embodied(ins))\n(pred2C_likesAsFriend(ins,arg2)) => (pred1C_PerceptualAgent-Embodied(ins))")), list(list(list(reader_make_constant_shell("forAll"), makeSymbol("?THING"), list(reader_make_constant_shell("isa"), makeSymbol("?THING"), reader_make_constant_shell("Thing")))), makeString("\npred1C_Thing(thing)\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Thing)) <=> (pred1C_Thing(x)).")) });

    private static final SubLSymbol ALCHEMY_EXPORT_PREDICATE_WITH_ARITY = makeSymbol("ALCHEMY-EXPORT-PREDICATE-WITH-ARITY");

    static private final SubLList $list301 = list(list(list(reader_make_constant_shell("likesAsFriend"), TWO_INTEGER), makeString("pred2C_likesAsFriend")));

    private static final SubLSymbol ALCHEMY_EXPORT_FOL_TERM = makeSymbol("ALCHEMY-EXPORT-FOL-TERM");

    private static final SubLList $list303 = list(list(list(list(reader_make_constant_shell("FOL-AtomicTermFn"), reader_make_constant_shell("Thing"))), makeString("C_Thing")), list(list(list(list(reader_make_constant_shell("FOL-FunctionFn"), reader_make_constant_shell("EnglishSuffixationFn")), list(reader_make_constant_shell("FOL-StringFn"), makeString("glory")), list(reader_make_constant_shell("FOL-StringFn"), makeString("ous")))), makeString("HLID_330D831E190FA462663436343161662D396332392D313162312D396461642D6333373936333666373237300F85676C6F72790F836F7573")), list(list(makeSymbol("?WHAT")), makeString("what")), list(list(makeSymbol("??WHAT")), makeString("what")), list(list(list(reader_make_constant_shell("FOL-StringFn"), makeString("blork"))), makeString("\"blork\"")), list(list(list(reader_make_constant_shell("FOL-NumberFn"), makeInteger(-4))), makeString("-4")));

    private static final SubLSymbol ALCHEMY_CONSTANT_P = makeSymbol("ALCHEMY-CONSTANT-P");

    static private final SubLList $list306 = list(list(list(makeString("This-is_100percent'valid")), T), list(list(makeString("must-begin-with-upper-case")), NIL), list(list(makeString("\"constants may be expressed as double-quoted strings\"")), T), list(list(makeString("\"\"")), NIL), list(list(makeString("17")), NIL));

    private static final SubLSymbol ALCHEMY_VARIABLE_P = makeSymbol("ALCHEMY-VARIABLE-P");

    private static final SubLList $list308 = list(list(list(makeString("this-is_100percent'valid")), T), list(list(makeString("Must-begin-with-lower-case")), NIL));

    private static final SubLSymbol ALCHEMY_IDENTIFIER_P = makeSymbol("ALCHEMY-IDENTIFIER-P");

    private static final SubLList $list310 = list(list(list(makeString("this-is_100percent'valid")), T), list(list(makeString("this is$not%valid")), NIL), list(list(makeString("'not-valid")), NIL), list(list(makeSymbol("NOT-A-STRING")), NIL));

    

    public static final SubLObject inference_output_answers_alchemy_alt(SubLObject inference, SubLObject stream) {
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_inference_answers_header(inference, stream);
        {
            SubLObject cdolist_list_var = inference_datastructures_inference.inference_free_el_vars(inference);
            SubLObject el_var = NIL;
            for (el_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , el_var = cdolist_list_var.first()) {
                {
                    SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                        {
                            SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                            SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                            SubLObject v_answer = NIL;
                            while (NIL != id) {
                                v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                                if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                                    {
                                        SubLObject el_bindings = inference_kernel.inference_answer_el_bindings(v_answer);
                                        SubLObject variable_binding = bindings.variable_lookup(el_var, el_bindings);
                                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentence_with_error_handling(variable_binding, stream);
                                    }
                                }
                                id = do_id_index_next_id(idx, NIL, id, state_var);
                                state_var = do_id_index_next_state(idx, NIL, id, state_var);
                            } 
                        }
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject inference_output_answers_alchemy(final SubLObject inference, final SubLObject stream) {
        alchemy_export_inference_answers_header(inference, stream);
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_free_el_vars(inference);
        SubLObject el_var = NIL;
        el_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$1 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$1);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject v_answer;
                    SubLObject el_bindings;
                    SubLObject variable_binding;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        v_answer = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(v_answer)) {
                                v_answer = $SKIP;
                            }
                            el_bindings = inference_kernel.inference_answer_el_bindings(v_answer);
                            variable_binding = bindings.variable_lookup(el_var, el_bindings);
                            alchemy_export_sentence_with_error_handling(variable_binding, stream);
                        }
                    }
                }
                final SubLObject idx_$2 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$2)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$2);
                    SubLObject id2 = NIL;
                    SubLObject v_answer2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            v_answer2 = getEntryValue(cdohash_entry);
                            final SubLObject el_bindings2 = inference_kernel.inference_answer_el_bindings(v_answer2);
                            final SubLObject variable_binding2 = bindings.variable_lookup(el_var, el_bindings2);
                            alchemy_export_sentence_with_error_handling(variable_binding2, stream);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject alchemy_export_inference_answers_header_alt(SubLObject inference, SubLObject stream) {
        {
            SubLObject sentence = inference_datastructures_inference.inference_el_query(inference);
            SubLObject mt = inference_datastructures_inference.inference_mt(inference);
            format(stream, $str_alt2$____Inference_answers_in_Alchemy_, numeric_date_utilities.timestring(UNPROVIDED));
            format(stream, $str_alt3$Generated_from_KB__A_running_on_C, operation_communication.kb_version_string(), system_info.cyc_revision_string());
            format(stream, $str_alt4$Query_sentence___S__Mt___S_______, sentence, mt);
        }
        return NIL;
    }

    public static SubLObject alchemy_export_inference_answers_header(final SubLObject inference, final SubLObject stream) {
        final SubLObject sentence = inference_datastructures_inference.inference_el_query(inference);
        final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
        format(stream, $str2$____Inference_answers_in_Alchemy_, numeric_date_utilities.timestring(UNPROVIDED));
        format(stream, $str3$Generated_from_KB__A_running_on_C, operation_communication.kb_version_string(), system_info.cyc_revision_string());
        format(stream, $str4$Query_sentence___S__Mt___S_______, sentence, mt);
        return NIL;
    }

    /**
     * The query should be such that each binding of VARIABLE-TOKEN is a CycL sentence.
     */
    @LispMethod(comment = "The query should be such that each binding of VARIABLE-TOKEN is a CycL sentence.")
    public static final SubLObject alchemy_export_query_variable_bindings_to_file_alt(SubLObject filename, SubLObject variable_token, SubLObject query_sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            SubLObject v_bindings = ask_utilities.query_variable(variable_token, query_sentence, mt, query_properties);
            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentences_to_file(v_bindings, filename);
        }
        return filename;
    }

    /**
     * The query should be such that each binding of VARIABLE-TOKEN is a CycL sentence.
     */
    @LispMethod(comment = "The query should be such that each binding of VARIABLE-TOKEN is a CycL sentence.")
    public static SubLObject alchemy_export_query_variable_bindings_to_file(final SubLObject filename, final SubLObject variable_token, final SubLObject query_sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject v_bindings = ask_utilities.query_variable(variable_token, query_sentence, mt, query_properties);
        alchemy_export_sentences_to_file(v_bindings, filename);
        return filename;
    }

    public static final SubLObject alchemy_export_sentences_to_file_alt(SubLObject cycl_sentences, SubLObject filename) {
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt6$Unable_to_open__S, filename);
                }
                {
                    SubLObject stream_1 = stream;
                    com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentences(cycl_sentences, stream_1);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return filename;
    }

    public static SubLObject alchemy_export_sentences_to_file(final SubLObject cycl_sentences, final SubLObject filename) {
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str6$Unable_to_open__S, filename);
            }
            final SubLObject stream_$3 = stream;
            alchemy_export_sentences(cycl_sentences, stream_$3);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return filename;
    }

    public static final SubLObject alchemy_export_sentences_alt(SubLObject cycl_sentences, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject cdolist_list_var = cycl_sentences;
            SubLObject cycl_sentence = NIL;
            for (cycl_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_sentence = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentence_with_error_handling(cycl_sentence, stream);
            }
        }
        return NIL;
    }

    public static SubLObject alchemy_export_sentences(final SubLObject cycl_sentences, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        SubLObject cdolist_list_var = cycl_sentences;
        SubLObject cycl_sentence = NIL;
        cycl_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            alchemy_export_sentence_with_error_handling(cycl_sentence, stream);
            cdolist_list_var = cdolist_list_var.rest();
            cycl_sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject alchemy_export_sentence_with_error_handling_alt(SubLObject cycl_sentence, SubLObject stream) {
        {
            SubLObject alchemy_sentence = NIL;
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            alchemy_sentence = com.cyc.cycjava.cycl.butler.alchemy_export.cycl_sentence_to_alchemy_sentences(cycl_sentence);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error) {
                Errors.warn(error);
                format(stream, $str_alt8$____Couldn_t_export_the_sentence_, cycl_sentence, error);
            } else {
                princ(alchemy_sentence, stream);
            }
        }
        terpri(stream);
        return NIL;
    }

    public static SubLObject alchemy_export_sentence_with_error_handling(final SubLObject cycl_sentence, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alchemy_sentence = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    alchemy_sentence = cycl_sentence_to_alchemy_sentences(cycl_sentence);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            Errors.warn(error);
            format(stream, $str8$____Couldn_t_export_the_sentence_, cycl_sentence, error);
        } else {
            princ(alchemy_sentence, stream);
        }
        terpri(stream);
        return NIL;
    }

    /**
     *
     *
     * @param CAFS-OR-RULES?
     * 		keywordp: :CAFS or :RULES or :BOTH; whether to export just FOL cafs (closed atomic formulas - @see fol-caf?), just FOL non-cafs (i.e. rules), or both
     */
    @LispMethod(comment = "@param CAFS-OR-RULES?\r\n\t\tkeywordp: :CAFS or :RULES or :BOTH; whether to export just FOL cafs (closed atomic formulas - @see fol-caf?), just FOL non-cafs (i.e. rules), or both")
    public static final SubLObject assertions_meeting_criterion_to_alchemy_file_alt(SubLObject criterion, SubLObject filename, SubLObject cafs_or_rulesP, SubLObject max_number) {
        if (cafs_or_rulesP == UNPROVIDED) {
            cafs_or_rulesP = $BOTH;
        }
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        {
            SubLObject assertions = com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_by_criterion(criterion, max_number);
            return com.cyc.cycjava.cycl.butler.alchemy_export.assertions_to_alchemy_file(assertions, filename, cafs_or_rulesP);
        }
    }

    /**
     *
     *
     * @param CAFS-OR-RULES?
     * 		keywordp: :CAFS or :RULES or :BOTH; whether to export just FOL cafs (closed atomic formulas - @see fol-caf?), just FOL non-cafs (i.e. rules), or both
     */
    @LispMethod(comment = "@param CAFS-OR-RULES?\r\n\t\tkeywordp: :CAFS or :RULES or :BOTH; whether to export just FOL cafs (closed atomic formulas - @see fol-caf?), just FOL non-cafs (i.e. rules), or both")
    public static SubLObject assertions_meeting_criterion_to_alchemy_file(final SubLObject criterion, final SubLObject filename, SubLObject cafs_or_rulesP, SubLObject max_number) {
        if (cafs_or_rulesP == UNPROVIDED) {
            cafs_or_rulesP = $BOTH;
        }
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        final SubLObject assertions = find_assertions_by_criterion(criterion, max_number);
        return assertions_to_alchemy_file(assertions, filename, cafs_or_rulesP);
    }

    public static final SubLObject assertions_to_alchemy_file_alt(SubLObject assertions, SubLObject filename, SubLObject cafs_or_rulesP) {
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt6$Unable_to_open__S, filename);
                }
                {
                    SubLObject stream_2 = stream;
                    com.cyc.cycjava.cycl.butler.alchemy_export.assertions_to_alchemy_stream(assertions, stream_2, cafs_or_rulesP);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return filename;
    }

    public static SubLObject assertions_to_alchemy_file(final SubLObject assertions, final SubLObject filename, final SubLObject cafs_or_rulesP) {
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str6$Unable_to_open__S, filename);
            }
            final SubLObject stream_$4 = stream;
            assertions_to_alchemy_stream(assertions, stream_$4, cafs_or_rulesP);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return filename;
    }

    public static final SubLObject assertions_to_alchemy_stream_alt(SubLObject assertions, SubLObject stream, SubLObject cafs_or_rulesP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject analysis = com.cyc.cycjava.cycl.butler.alchemy_export.cycl_assertions_to_alchemy_style_fol(assertions);
                {
                    SubLObject _prev_bind_0 = $alchemy_export_cafs_or_rulesP$.currentBinding(thread);
                    try {
                        $alchemy_export_cafs_or_rulesP$.bind(cafs_or_rulesP, thread);
                        folification.fol_sentences_to_stream(analysis, $ALCHEMY, stream);
                    } finally {
                        $alchemy_export_cafs_or_rulesP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject assertions_to_alchemy_stream(final SubLObject assertions, final SubLObject stream, final SubLObject cafs_or_rulesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject analysis = cycl_assertions_to_alchemy_style_fol(assertions);
        final SubLObject _prev_bind_0 = $alchemy_export_cafs_or_rulesP$.currentBinding(thread);
        try {
            $alchemy_export_cafs_or_rulesP$.bind(cafs_or_rulesP, thread);
            folification.fol_sentences_to_stream(analysis, $ALCHEMY, stream);
        } finally {
            $alchemy_export_cafs_or_rulesP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Error if CRITERION is not a valid assertion-selection criterion.  Otherwise, do nothing.
     */
    @LispMethod(comment = "Error if CRITERION is not a valid assertion-selection criterion.  Otherwise, do nothing.")
    public static final SubLObject check_assertion_selection_criterion_alt(SubLObject criterion) {
        if (criterion.isKeyword()) {
            SubLTrampolineFile.checkType(criterion, ATOMIC_ASSERTION_SELECTION_CRITERION_P);
        } else {
            if (NIL != list_utilities.proper_list_p(criterion)) {
                com.cyc.cycjava.cycl.butler.alchemy_export.check_non_atomic_assertion_selection_criterion(criterion);
            } else {
                Errors.error($str_alt11$Invalid_assertion_selection_crite, criterion);
            }
        }
        return NIL;
    }

    /**
     * Error if CRITERION is not a valid assertion-selection criterion.  Otherwise, do nothing.
     */
    @LispMethod(comment = "Error if CRITERION is not a valid assertion-selection criterion.  Otherwise, do nothing.")
    public static SubLObject check_assertion_selection_criterion(final SubLObject criterion) {
        if (criterion.isKeyword()) {
            assert NIL != atomic_assertion_selection_criterion_p(criterion) : "! alchemy_export.atomic_assertion_selection_criterion_p(criterion) " + ("alchemy_export.atomic_assertion_selection_criterion_p(criterion) " + "CommonSymbols.NIL != alchemy_export.atomic_assertion_selection_criterion_p(criterion) ") + criterion;
        } else
            if (NIL != list_utilities.proper_list_p(criterion)) {
                check_non_atomic_assertion_selection_criterion(criterion);
            } else {
                Errors.error($str11$Invalid_assertion_selection_crite, criterion);
            }

        return NIL;
    }

    public static final SubLObject atomic_assertion_selection_criterion_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $atomic_assertion_selection_criteria$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject atomic_assertion_selection_criterion_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $atomic_assertion_selection_criteria$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject check_non_atomic_assertion_selection_criterion_alt(SubLObject criterion) {
        {
            SubLObject datum = criterion;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            args = current;
            {
                SubLObject arg_types = com.cyc.cycjava.cycl.butler.alchemy_export.get_assertion_selection_operator_arg_types(operator, $NOT_FOUND);
                if (arg_types == $NOT_FOUND) {
                    Errors.error($str_alt16$Invalid_assertion_selection_crite, criterion, operator);
                } else {
                    com.cyc.cycjava.cycl.butler.alchemy_export.check_non_atomic_assertion_selection_criterion_arg_types(args, arg_types, operator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject check_non_atomic_assertion_selection_criterion(final SubLObject criterion) {
        SubLObject operator = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(criterion, criterion, $list14);
        operator = criterion.first();
        final SubLObject current = args = criterion.rest();
        final SubLObject arg_types = get_assertion_selection_operator_arg_types(operator, $NOT_FOUND);
        if (arg_types == $NOT_FOUND) {
            Errors.error($str16$Invalid_assertion_selection_crite, criterion, operator);
        } else {
            check_non_atomic_assertion_selection_criterion_arg_types(args, arg_types, operator);
        }
        return NIL;
    }

    public static final SubLObject check_non_atomic_assertion_selection_criterion_arg_types_alt(SubLObject args, SubLObject arg_types, SubLObject operator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (arg_types.isList()) {
                {
                    SubLObject number_of_arg_types = length(arg_types);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == list_utilities.lengthE(args, number_of_arg_types, UNPROVIDED)) {
                            Errors.error($str_alt17$The_assertion_selection_operator_, new SubLObject[]{ operator, number_of_arg_types, arg_types, length(args), args });
                        }
                    }
                    {
                        SubLObject arg = NIL;
                        SubLObject arg_3 = NIL;
                        SubLObject v_arg_type = NIL;
                        SubLObject v_arg_type_4 = NIL;
                        for (arg = args, arg_3 = arg.first(), v_arg_type = arg_types, v_arg_type_4 = v_arg_type.first(); !((NIL == v_arg_type) && (NIL == arg)); arg = arg.rest() , arg_3 = arg.first() , v_arg_type = v_arg_type.rest() , v_arg_type_4 = v_arg_type.first()) {
                            com.cyc.cycjava.cycl.butler.alchemy_export.check_non_atomic_assertion_selection_criterion_arg_type(arg_3, v_arg_type_4);
                        }
                    }
                }
            } else {
                {
                    SubLObject v_arg_type = arg_types;
                    SubLObject cdolist_list_var = args;
                    SubLObject arg = NIL;
                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.butler.alchemy_export.check_non_atomic_assertion_selection_criterion_arg_type(arg, v_arg_type);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject check_non_atomic_assertion_selection_criterion_arg_types(final SubLObject args, final SubLObject arg_types, final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (arg_types.isList()) {
            final SubLObject number_of_arg_types = length(arg_types);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthE(args, number_of_arg_types, UNPROVIDED))) {
                Errors.error($str17$The_assertion_selection_operator_, new SubLObject[]{ operator, number_of_arg_types, arg_types, length(args), args });
            }
            SubLObject arg = NIL;
            SubLObject arg_$5 = NIL;
            SubLObject v_arg_type = NIL;
            SubLObject v_arg_type_$6 = NIL;
            arg = args;
            arg_$5 = arg.first();
            v_arg_type = arg_types;
            v_arg_type_$6 = v_arg_type.first();
            while ((NIL != v_arg_type) || (NIL != arg)) {
                check_non_atomic_assertion_selection_criterion_arg_type(arg_$5, v_arg_type_$6);
                arg = arg.rest();
                arg_$5 = arg.first();
                v_arg_type = v_arg_type.rest();
                v_arg_type_$6 = v_arg_type.first();
            } 
        } else {
            SubLObject cdolist_list_var = args;
            SubLObject arg2 = NIL;
            arg2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                check_non_atomic_assertion_selection_criterion_arg_type(arg2, arg_types);
                cdolist_list_var = cdolist_list_var.rest();
                arg2 = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject check_non_atomic_assertion_selection_criterion_arg_type_alt(SubLObject arg, SubLObject v_arg_type) {
        if (v_arg_type == $CRITERION) {
            com.cyc.cycjava.cycl.butler.alchemy_export.check_assertion_selection_criterion(arg);
        } else {
            if (NIL == funcall(v_arg_type, arg)) {
                Errors.error($str_alt19$_A_is_not_a__A, arg, v_arg_type);
            }
        }
        return NIL;
    }

    public static SubLObject check_non_atomic_assertion_selection_criterion_arg_type(final SubLObject arg, final SubLObject v_arg_type) {
        if (v_arg_type == $CRITERION) {
            check_assertion_selection_criterion(arg);
        } else
            if (NIL == funcall(v_arg_type, arg)) {
                Errors.error($str19$_A_is_not_a__A, arg, v_arg_type);
            }

        return NIL;
    }

    public static final SubLObject get_assertion_selection_operator_arg_types_alt(SubLObject operator, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $NOT_FOUND;
        }
        return getf($assertion_selection_arg_types_by_operator$.getGlobalValue(), operator, v_default);
    }

    public static SubLObject get_assertion_selection_operator_arg_types(final SubLObject operator, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $NOT_FOUND;
        }
        return getf($assertion_selection_arg_types_by_operator$.getGlobalValue(), operator, v_default);
    }

    /**
     *
     *
     * @param MAX-NUMBER:
     * 		if non-NIL, the maximum number of assertions to return; if more than MAX-NUMBER assertions meet CRITERION, then we randomly select MAX-NUMBER of those assertions
     */
    @LispMethod(comment = "@param MAX-NUMBER:\r\n\t\tif non-NIL, the maximum number of assertions to return; if more than MAX-NUMBER assertions meet CRITERION, then we randomly select MAX-NUMBER of those assertions")
    public static final SubLObject find_assertions_by_criterion_alt(SubLObject criterion, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        com.cyc.cycjava.cycl.butler.alchemy_export.check_assertion_selection_criterion(criterion);
        if (NIL != max_number) {
            SubLTrampolineFile.checkType(max_number, POSITIVE_INTEGER_P);
        }
        return com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_by_criterion_no_checks(criterion, max_number);
    }

    /**
     *
     *
     * @param MAX-NUMBER:
     * 		if non-NIL, the maximum number of assertions to return; if more than MAX-NUMBER assertions meet CRITERION, then we randomly select MAX-NUMBER of those assertions
     */
    @LispMethod(comment = "@param MAX-NUMBER:\r\n\t\tif non-NIL, the maximum number of assertions to return; if more than MAX-NUMBER assertions meet CRITERION, then we randomly select MAX-NUMBER of those assertions")
    public static SubLObject find_assertions_by_criterion(final SubLObject criterion, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        check_assertion_selection_criterion(criterion);
        if (((NIL != max_number) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(max_number))) {
            throw new AssertionError(max_number);
        }
        return find_assertions_by_criterion_no_checks(criterion, max_number);
    }

    public static final SubLObject find_assertions_by_criterion_no_checks_alt(SubLObject criterion, SubLObject max_number) {
        {
            SubLObject assertions = com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_by_criterion_int(criterion);
            if ((NIL != max_number) && (NIL != list_utilities.lengthG(assertions, max_number, UNPROVIDED))) {
                assertions = list_utilities.random_n(max_number, assertions);
            }
            return assertions;
        }
    }

    public static SubLObject find_assertions_by_criterion_no_checks(final SubLObject criterion, final SubLObject max_number) {
        SubLObject assertions = find_assertions_by_criterion_int(criterion);
        if ((NIL != max_number) && (NIL != list_utilities.lengthG(assertions, max_number, UNPROVIDED))) {
            assertions = list_utilities.random_n(max_number, assertions);
        }
        return assertions;
    }

    public static final SubLObject find_assertions_by_criterion_int_alt(SubLObject criterion) {
        if (criterion.isKeyword()) {
            {
                SubLObject pcase_var = criterion;
                if (pcase_var.eql($RULE)) {
                    return kb_utilities.all_rules();
                } else {
                    if (pcase_var.eql($GAF)) {
                        return kb_utilities.all_gafs();
                    } else {
                        Errors.error($str_alt22$Unknown_atomic_assertion_selectio, criterion);
                    }
                }
            }
        } else {
            if (criterion.isList()) {
                {
                    SubLObject datum = criterion;
                    SubLObject current = datum;
                    SubLObject operator = NIL;
                    SubLObject args = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    operator = current.first();
                    current = current.rest();
                    args = current;
                    {
                        SubLObject pcase_var = operator;
                        if (pcase_var.eql($UNION)) {
                            return list_utilities.mapnunion(symbol_function(FIND_ASSERTIONS_BY_CRITERION_INT), args, symbol_function(EQ));
                        } else {
                            if (pcase_var.eql($INTERSECTION)) {
                                return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_meeting_all_criteria(args);
                            } else {
                                if (pcase_var.eql($EXCEPTION)) {
                                    {
                                        SubLObject datum_5 = args;
                                        SubLObject current_6 = datum_5;
                                        SubLObject positive_criterion = NIL;
                                        SubLObject negative_criterion = NIL;
                                        destructuring_bind_must_consp(current_6, datum_5, $list_alt27);
                                        positive_criterion = current_6.first();
                                        current_6 = current_6.rest();
                                        destructuring_bind_must_consp(current_6, datum_5, $list_alt27);
                                        negative_criterion = current_6.first();
                                        current_6 = current_6.rest();
                                        if (NIL == current_6) {
                                            {
                                                SubLObject candidate_assertions = com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_by_criterion_int(positive_criterion);
                                                return com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_not_meeting_criterion_among(negative_criterion, candidate_assertions);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_5, $list_alt27);
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($IN_MT)) {
                                        {
                                            SubLObject datum_7 = args;
                                            SubLObject current_8 = datum_7;
                                            SubLObject mt = NIL;
                                            destructuring_bind_must_consp(current_8, datum_7, $list_alt29);
                                            mt = current_8.first();
                                            current_8 = current_8.rest();
                                            if (NIL == current_8) {
                                                return kb_mapping.gather_mt_index(mt);
                                            } else {
                                                cdestructuring_bind_error(datum_7, $list_alt29);
                                            }
                                        }
                                    } else {
                                        if (pcase_var.eql($VISIBLE_FROM_MT)) {
                                            {
                                                SubLObject datum_9 = args;
                                                SubLObject current_10 = datum_9;
                                                SubLObject mt = NIL;
                                                destructuring_bind_must_consp(current_10, datum_9, $list_alt29);
                                                mt = current_10.first();
                                                current_10 = current_10.rest();
                                                if (NIL == current_10) {
                                                    return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_visible_from_mt(mt);
                                                } else {
                                                    cdestructuring_bind_error(datum_9, $list_alt29);
                                                }
                                            }
                                        } else {
                                            if (pcase_var.eql($COLLECTION_EXTENT)) {
                                                {
                                                    SubLObject datum_11 = args;
                                                    SubLObject current_12 = datum_11;
                                                    SubLObject coll = NIL;
                                                    destructuring_bind_must_consp(current_12, datum_11, $list_alt32);
                                                    coll = current_12.first();
                                                    current_12 = current_12.rest();
                                                    if (NIL == current_12) {
                                                        return com.cyc.cycjava.cycl.butler.alchemy_export.all_isa_assertions_of_collection(coll);
                                                    } else {
                                                        cdestructuring_bind_error(datum_11, $list_alt32);
                                                    }
                                                }
                                            } else {
                                                if (pcase_var.eql($COLLECTION_EXTENTS)) {
                                                    {
                                                        SubLObject datum_13 = args;
                                                        SubLObject current_14 = datum_13;
                                                        SubLObject set_or_coll = NIL;
                                                        destructuring_bind_must_consp(current_14, datum_13, $list_alt34);
                                                        set_or_coll = current_14.first();
                                                        current_14 = current_14.rest();
                                                        if (NIL == current_14) {
                                                            return com.cyc.cycjava.cycl.butler.alchemy_export.all_isa_assertions_of_all_collections_in_set_or_coll(set_or_coll);
                                                        } else {
                                                            cdestructuring_bind_error(datum_13, $list_alt34);
                                                        }
                                                    }
                                                } else {
                                                    if (pcase_var.eql($COLLECTION_EXTENTS_QUOTED)) {
                                                        {
                                                            SubLObject datum_15 = args;
                                                            SubLObject current_16 = datum_15;
                                                            SubLObject coll = NIL;
                                                            destructuring_bind_must_consp(current_16, datum_15, $list_alt32);
                                                            coll = current_16.first();
                                                            current_16 = current_16.rest();
                                                            if (NIL == current_16) {
                                                                return com.cyc.cycjava.cycl.butler.alchemy_export.all_isa_assertions_of_all_quoted_instances_of_coll(coll);
                                                            } else {
                                                                cdestructuring_bind_error(datum_15, $list_alt32);
                                                            }
                                                        }
                                                    } else {
                                                        if (pcase_var.eql($PREDICATE_EXTENT)) {
                                                            {
                                                                SubLObject datum_17 = args;
                                                                SubLObject current_18 = datum_17;
                                                                SubLObject pred = NIL;
                                                                destructuring_bind_must_consp(current_18, datum_17, $list_alt37);
                                                                pred = current_18.first();
                                                                current_18 = current_18.rest();
                                                                if (NIL == current_18) {
                                                                    return com.cyc.cycjava.cycl.butler.alchemy_export.predicate_extent(pred);
                                                                } else {
                                                                    cdestructuring_bind_error(datum_17, $list_alt37);
                                                                }
                                                            }
                                                        } else {
                                                            if (pcase_var.eql($PREDICATE_EXTENTS)) {
                                                                {
                                                                    SubLObject datum_19 = args;
                                                                    SubLObject current_20 = datum_19;
                                                                    SubLObject set_or_coll = NIL;
                                                                    destructuring_bind_must_consp(current_20, datum_19, $list_alt34);
                                                                    set_or_coll = current_20.first();
                                                                    current_20 = current_20.rest();
                                                                    if (NIL == current_20) {
                                                                        return com.cyc.cycjava.cycl.butler.alchemy_export.union_of_extents_of_predicate_set_or_coll(set_or_coll);
                                                                    } else {
                                                                        cdestructuring_bind_error(datum_19, $list_alt34);
                                                                    }
                                                                }
                                                            } else {
                                                                if (pcase_var.eql($PREDICATE_EXTENTS_QUOTED)) {
                                                                    {
                                                                        SubLObject datum_21 = args;
                                                                        SubLObject current_22 = datum_21;
                                                                        SubLObject coll = NIL;
                                                                        destructuring_bind_must_consp(current_22, datum_21, $list_alt32);
                                                                        coll = current_22.first();
                                                                        current_22 = current_22.rest();
                                                                        if (NIL == current_22) {
                                                                            return com.cyc.cycjava.cycl.butler.alchemy_export.union_of_extents_of_all_quoted_instances_of_coll(coll);
                                                                        } else {
                                                                            cdestructuring_bind_error(datum_21, $list_alt32);
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (pcase_var.eql($ASSERTIONS_MEETING_CRITERION_PLUS_EXTENTS_OF_PREDICATES_MENTIONED)) {
                                                                        {
                                                                            SubLObject datum_23 = args;
                                                                            SubLObject current_24 = datum_23;
                                                                            SubLObject criterion_25 = NIL;
                                                                            destructuring_bind_must_consp(current_24, datum_23, $list_alt41);
                                                                            criterion_25 = current_24.first();
                                                                            current_24 = current_24.rest();
                                                                            if (NIL == current_24) {
                                                                                return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_meeting_criterion_plus_extents_of_predicates_mentioned(criterion_25);
                                                                            } else {
                                                                                cdestructuring_bind_error(datum_23, $list_alt41);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (pcase_var.eql($kw42$ASSERTIONS_MEETING_CRITERION_PLUS_EXTENTS_OF_PREDICATES_AND_COLLE)) {
                                                                            {
                                                                                SubLObject datum_26 = args;
                                                                                SubLObject current_27 = datum_26;
                                                                                SubLObject criterion_28 = NIL;
                                                                                destructuring_bind_must_consp(current_27, datum_26, $list_alt41);
                                                                                criterion_28 = current_27.first();
                                                                                current_27 = current_27.rest();
                                                                                if (NIL == current_27) {
                                                                                    return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_meeting_criterion_plus_extents_of_predicates_and_collections_mentioned(criterion_28);
                                                                                } else {
                                                                                    cdestructuring_bind_error(datum_26, $list_alt41);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (pcase_var.eql($MENTIONS_TERM)) {
                                                                                {
                                                                                    SubLObject datum_29 = args;
                                                                                    SubLObject current_30 = datum_29;
                                                                                    SubLObject v_term = NIL;
                                                                                    destructuring_bind_must_consp(current_30, datum_29, $list_alt44);
                                                                                    v_term = current_30.first();
                                                                                    current_30 = current_30.rest();
                                                                                    if (NIL == current_30) {
                                                                                        return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_indexed_term(v_term);
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum_29, $list_alt44);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (pcase_var.eql($MENTIONS_TERM_AT_LEAST_N_TIMES)) {
                                                                                    {
                                                                                        SubLObject datum_31 = args;
                                                                                        SubLObject current_32 = datum_31;
                                                                                        SubLObject v_term = NIL;
                                                                                        SubLObject n = NIL;
                                                                                        destructuring_bind_must_consp(current_32, datum_31, $list_alt46);
                                                                                        v_term = current_32.first();
                                                                                        current_32 = current_32.rest();
                                                                                        destructuring_bind_must_consp(current_32, datum_31, $list_alt46);
                                                                                        n = current_32.first();
                                                                                        current_32 = current_32.rest();
                                                                                        if (NIL == current_32) {
                                                                                            return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_indexed_term_at_least_n_times(v_term, n);
                                                                                        } else {
                                                                                            cdestructuring_bind_error(datum_31, $list_alt46);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (pcase_var.eql($MENTIONS_TERM_IN_ARGPOS)) {
                                                                                        {
                                                                                            SubLObject datum_33 = args;
                                                                                            SubLObject current_34 = datum_33;
                                                                                            SubLObject v_term = NIL;
                                                                                            SubLObject argpos = NIL;
                                                                                            destructuring_bind_must_consp(current_34, datum_33, $list_alt48);
                                                                                            v_term = current_34.first();
                                                                                            current_34 = current_34.rest();
                                                                                            destructuring_bind_must_consp(current_34, datum_33, $list_alt48);
                                                                                            argpos = current_34.first();
                                                                                            current_34 = current_34.rest();
                                                                                            if (NIL == current_34) {
                                                                                                return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_indexed_term_in_argpos(v_term, argpos, UNPROVIDED);
                                                                                            } else {
                                                                                                cdestructuring_bind_error(datum_33, $list_alt48);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (pcase_var.eql($MENTIONS_ANY_INSTANTIATION_OF)) {
                                                                                            {
                                                                                                SubLObject datum_35 = args;
                                                                                                SubLObject current_36 = datum_35;
                                                                                                SubLObject set_or_coll = NIL;
                                                                                                destructuring_bind_must_consp(current_36, datum_35, $list_alt34);
                                                                                                set_or_coll = current_36.first();
                                                                                                current_36 = current_36.rest();
                                                                                                if (NIL == current_36) {
                                                                                                    return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_any_indexed_term_in_set_or_coll(set_or_coll);
                                                                                                } else {
                                                                                                    cdestructuring_bind_error(datum_35, $list_alt34);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (pcase_var.eql($MENTIONS_ANY_QUOTED_INSTANCE_OF)) {
                                                                                                {
                                                                                                    SubLObject datum_37 = args;
                                                                                                    SubLObject current_38 = datum_37;
                                                                                                    SubLObject coll = NIL;
                                                                                                    destructuring_bind_must_consp(current_38, datum_37, $list_alt32);
                                                                                                    coll = current_38.first();
                                                                                                    current_38 = current_38.rest();
                                                                                                    if (NIL == current_38) {
                                                                                                        return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_any_quoted_instance_of(coll);
                                                                                                    } else {
                                                                                                        cdestructuring_bind_error(datum_37, $list_alt32);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (pcase_var.eql($MENTIONS_INSTANTIATIONS_OF_AT_LEAST_N_TIMES)) {
                                                                                                    {
                                                                                                        SubLObject datum_39 = args;
                                                                                                        SubLObject current_40 = datum_39;
                                                                                                        SubLObject set_or_coll = NIL;
                                                                                                        SubLObject n = NIL;
                                                                                                        destructuring_bind_must_consp(current_40, datum_39, $list_alt52);
                                                                                                        set_or_coll = current_40.first();
                                                                                                        current_40 = current_40.rest();
                                                                                                        destructuring_bind_must_consp(current_40, datum_39, $list_alt52);
                                                                                                        n = current_40.first();
                                                                                                        current_40 = current_40.rest();
                                                                                                        if (NIL == current_40) {
                                                                                                            return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_indexed_terms_in_set_or_coll_at_least_n_times(set_or_coll, n);
                                                                                                        } else {
                                                                                                            cdestructuring_bind_error(datum_39, $list_alt52);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (pcase_var.eql($MENTIONS_QUOTED_INSTANCES_OF_AT_LEAST_N_TIMES)) {
                                                                                                        {
                                                                                                            SubLObject datum_41 = args;
                                                                                                            SubLObject current_42 = datum_41;
                                                                                                            SubLObject coll = NIL;
                                                                                                            SubLObject n = NIL;
                                                                                                            destructuring_bind_must_consp(current_42, datum_41, $list_alt54);
                                                                                                            coll = current_42.first();
                                                                                                            current_42 = current_42.rest();
                                                                                                            destructuring_bind_must_consp(current_42, datum_41, $list_alt54);
                                                                                                            n = current_42.first();
                                                                                                            current_42 = current_42.rest();
                                                                                                            if (NIL == current_42) {
                                                                                                                return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_quoted_instances_of_at_least_n_times(coll, n);
                                                                                                            } else {
                                                                                                                cdestructuring_bind_error(datum_41, $list_alt54);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (pcase_var.eql($MENTIONS_ANY_INSTANTIATION_OF_IN_ARGPOS)) {
                                                                                                            {
                                                                                                                SubLObject datum_43 = args;
                                                                                                                SubLObject current_44 = datum_43;
                                                                                                                SubLObject set_or_coll = NIL;
                                                                                                                SubLObject argpos = NIL;
                                                                                                                destructuring_bind_must_consp(current_44, datum_43, $list_alt56);
                                                                                                                set_or_coll = current_44.first();
                                                                                                                current_44 = current_44.rest();
                                                                                                                destructuring_bind_must_consp(current_44, datum_43, $list_alt56);
                                                                                                                argpos = current_44.first();
                                                                                                                current_44 = current_44.rest();
                                                                                                                if (NIL == current_44) {
                                                                                                                    return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_any_indexed_term_in_set_or_coll_in_argpos(set_or_coll, argpos, UNPROVIDED);
                                                                                                                } else {
                                                                                                                    cdestructuring_bind_error(datum_43, $list_alt56);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (pcase_var.eql($MENTIONS_ANY_QUOTED_INSTANCE_OF_IN_ARGPOS)) {
                                                                                                                {
                                                                                                                    SubLObject datum_45 = args;
                                                                                                                    SubLObject current_46 = datum_45;
                                                                                                                    SubLObject coll = NIL;
                                                                                                                    SubLObject argpos = NIL;
                                                                                                                    destructuring_bind_must_consp(current_46, datum_45, $list_alt58);
                                                                                                                    coll = current_46.first();
                                                                                                                    current_46 = current_46.rest();
                                                                                                                    destructuring_bind_must_consp(current_46, datum_45, $list_alt58);
                                                                                                                    argpos = current_46.first();
                                                                                                                    current_46 = current_46.rest();
                                                                                                                    if (NIL == current_46) {
                                                                                                                        return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_any_quoted_instance_of_in_argpos(coll, argpos, UNPROVIDED);
                                                                                                                    } else {
                                                                                                                        cdestructuring_bind_error(datum_45, $list_alt58);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (pcase_var.eql($MENTIONS_ALL_INSTANTIATIONS_OF)) {
                                                                                                                    {
                                                                                                                        SubLObject datum_47 = args;
                                                                                                                        SubLObject current_48 = datum_47;
                                                                                                                        SubLObject set_or_coll = NIL;
                                                                                                                        destructuring_bind_must_consp(current_48, datum_47, $list_alt34);
                                                                                                                        set_or_coll = current_48.first();
                                                                                                                        current_48 = current_48.rest();
                                                                                                                        if (NIL == current_48) {
                                                                                                                            return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_all_indexed_terms_in_set_or_coll(set_or_coll);
                                                                                                                        } else {
                                                                                                                            cdestructuring_bind_error(datum_47, $list_alt34);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (pcase_var.eql($MENTIONS_ALL_QUOTED_INSTANCES_OF)) {
                                                                                                                        {
                                                                                                                            SubLObject datum_49 = args;
                                                                                                                            SubLObject current_50 = datum_49;
                                                                                                                            SubLObject coll = NIL;
                                                                                                                            destructuring_bind_must_consp(current_50, datum_49, $list_alt32);
                                                                                                                            coll = current_50.first();
                                                                                                                            current_50 = current_50.rest();
                                                                                                                            if (NIL == current_50) {
                                                                                                                                return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_all_quoted_instances_of(coll);
                                                                                                                            } else {
                                                                                                                                cdestructuring_bind_error(datum_49, $list_alt32);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        if (pcase_var.eql($MENTIONS_ONLY_INSTANTIATIONS_OF)) {
                                                                                                                            {
                                                                                                                                SubLObject datum_51 = args;
                                                                                                                                SubLObject current_52 = datum_51;
                                                                                                                                SubLObject set_or_coll = NIL;
                                                                                                                                destructuring_bind_must_consp(current_52, datum_51, $list_alt34);
                                                                                                                                set_or_coll = current_52.first();
                                                                                                                                current_52 = current_52.rest();
                                                                                                                                if (NIL == current_52) {
                                                                                                                                    return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_only_indexed_terms_in_set_or_coll(set_or_coll);
                                                                                                                                } else {
                                                                                                                                    cdestructuring_bind_error(datum_51, $list_alt34);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            if (pcase_var.eql($MENTIONS_ONLY_QUOTED_INSTANCES_OF)) {
                                                                                                                                {
                                                                                                                                    SubLObject datum_53 = args;
                                                                                                                                    SubLObject current_54 = datum_53;
                                                                                                                                    SubLObject coll = NIL;
                                                                                                                                    destructuring_bind_must_consp(current_54, datum_53, $list_alt32);
                                                                                                                                    coll = current_54.first();
                                                                                                                                    current_54 = current_54.rest();
                                                                                                                                    if (NIL == current_54) {
                                                                                                                                        return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_only_quoted_instances_of(coll);
                                                                                                                                    } else {
                                                                                                                                        cdestructuring_bind_error(datum_53, $list_alt32);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                Errors.error($str_alt16$Invalid_assertion_selection_crite, criterion, operator);
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
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                Errors.error($str_alt63$Invalid_assertion_selection_crite, criterion);
            }
        }
        return NIL;
    }

    public static SubLObject find_assertions_by_criterion_int(final SubLObject criterion) {
        if (criterion.isKeyword()) {
            if (criterion.eql($RULE)) {
                return kb_utilities.all_rules();
            }
            if (criterion.eql($GAF)) {
                return kb_utilities.all_gafs();
            }
            Errors.error($str22$Unknown_atomic_assertion_selectio, criterion);
        } else
            if (criterion.isList()) {
                SubLObject operator = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(criterion, criterion, $list14);
                operator = criterion.first();
                final SubLObject current = args = criterion.rest();
                final SubLObject pcase_var = operator;
                if (pcase_var.eql($UNION)) {
                    return list_utilities.mapnunion(symbol_function(FIND_ASSERTIONS_BY_CRITERION_INT), args, symbol_function(EQ));
                }
                if (pcase_var.eql($INTERSECTION)) {
                    return all_assertions_meeting_all_criteria(args);
                }
                if (pcase_var.eql($EXCEPTION)) {
                    SubLObject current_$8;
                    final SubLObject datum_$7 = current_$8 = args;
                    SubLObject positive_criterion = NIL;
                    SubLObject negative_criterion = NIL;
                    destructuring_bind_must_consp(current_$8, datum_$7, $list27);
                    positive_criterion = current_$8.first();
                    current_$8 = current_$8.rest();
                    destructuring_bind_must_consp(current_$8, datum_$7, $list27);
                    negative_criterion = current_$8.first();
                    current_$8 = current_$8.rest();
                    if (NIL == current_$8) {
                        final SubLObject candidate_assertions = find_assertions_by_criterion_int(positive_criterion);
                        return find_assertions_not_meeting_criterion_among(negative_criterion, candidate_assertions);
                    }
                    cdestructuring_bind_error(datum_$7, $list27);
                } else
                    if (pcase_var.eql($IN_MT)) {
                        SubLObject current_$9;
                        final SubLObject datum_$8 = current_$9 = args;
                        SubLObject mt = NIL;
                        destructuring_bind_must_consp(current_$9, datum_$8, $list29);
                        mt = current_$9.first();
                        current_$9 = current_$9.rest();
                        if (NIL == current_$9) {
                            return kb_mapping.gather_mt_index(mt);
                        }
                        cdestructuring_bind_error(datum_$8, $list29);
                    } else
                        if (pcase_var.eql($VISIBLE_FROM_MT)) {
                            SubLObject current_$10;
                            final SubLObject datum_$9 = current_$10 = args;
                            SubLObject mt = NIL;
                            destructuring_bind_must_consp(current_$10, datum_$9, $list29);
                            mt = current_$10.first();
                            current_$10 = current_$10.rest();
                            if (NIL == current_$10) {
                                return all_assertions_visible_from_mt(mt);
                            }
                            cdestructuring_bind_error(datum_$9, $list29);
                        } else
                            if (pcase_var.eql($COLLECTION_EXTENT)) {
                                SubLObject current_$11;
                                final SubLObject datum_$10 = current_$11 = args;
                                SubLObject coll = NIL;
                                destructuring_bind_must_consp(current_$11, datum_$10, $list32);
                                coll = current_$11.first();
                                current_$11 = current_$11.rest();
                                if (NIL == current_$11) {
                                    return all_isa_assertions_of_collection(coll);
                                }
                                cdestructuring_bind_error(datum_$10, $list32);
                            } else
                                if (pcase_var.eql($COLLECTION_EXTENTS)) {
                                    SubLObject current_$12;
                                    final SubLObject datum_$11 = current_$12 = args;
                                    SubLObject set_or_coll = NIL;
                                    destructuring_bind_must_consp(current_$12, datum_$11, $list34);
                                    set_or_coll = current_$12.first();
                                    current_$12 = current_$12.rest();
                                    if (NIL == current_$12) {
                                        return all_isa_assertions_of_all_collections_in_set_or_coll(set_or_coll);
                                    }
                                    cdestructuring_bind_error(datum_$11, $list34);
                                } else
                                    if (pcase_var.eql($COLLECTION_EXTENTS_QUOTED)) {
                                        SubLObject current_$13;
                                        final SubLObject datum_$12 = current_$13 = args;
                                        SubLObject coll = NIL;
                                        destructuring_bind_must_consp(current_$13, datum_$12, $list32);
                                        coll = current_$13.first();
                                        current_$13 = current_$13.rest();
                                        if (NIL == current_$13) {
                                            return all_isa_assertions_of_all_quoted_instances_of_coll(coll);
                                        }
                                        cdestructuring_bind_error(datum_$12, $list32);
                                    } else
                                        if (pcase_var.eql($PREDICATE_EXTENT)) {
                                            SubLObject current_$14;
                                            final SubLObject datum_$13 = current_$14 = args;
                                            SubLObject pred = NIL;
                                            destructuring_bind_must_consp(current_$14, datum_$13, $list37);
                                            pred = current_$14.first();
                                            current_$14 = current_$14.rest();
                                            if (NIL == current_$14) {
                                                return predicate_extent(pred);
                                            }
                                            cdestructuring_bind_error(datum_$13, $list37);
                                        } else
                                            if (pcase_var.eql($PREDICATE_EXTENTS)) {
                                                SubLObject current_$15;
                                                final SubLObject datum_$14 = current_$15 = args;
                                                SubLObject set_or_coll = NIL;
                                                destructuring_bind_must_consp(current_$15, datum_$14, $list34);
                                                set_or_coll = current_$15.first();
                                                current_$15 = current_$15.rest();
                                                if (NIL == current_$15) {
                                                    return union_of_extents_of_predicate_set_or_coll(set_or_coll);
                                                }
                                                cdestructuring_bind_error(datum_$14, $list34);
                                            } else
                                                if (pcase_var.eql($PREDICATE_EXTENTS_QUOTED)) {
                                                    SubLObject current_$16;
                                                    final SubLObject datum_$15 = current_$16 = args;
                                                    SubLObject coll = NIL;
                                                    destructuring_bind_must_consp(current_$16, datum_$15, $list32);
                                                    coll = current_$16.first();
                                                    current_$16 = current_$16.rest();
                                                    if (NIL == current_$16) {
                                                        return union_of_extents_of_all_quoted_instances_of_coll(coll);
                                                    }
                                                    cdestructuring_bind_error(datum_$15, $list32);
                                                } else
                                                    if (pcase_var.eql($ASSERTIONS_MEETING_CRITERION_PLUS_EXTENTS_OF_PREDICATES_MENTIONED)) {
                                                        SubLObject current_$17;
                                                        final SubLObject datum_$16 = current_$17 = args;
                                                        SubLObject criterion_$27 = NIL;
                                                        destructuring_bind_must_consp(current_$17, datum_$16, $list41);
                                                        criterion_$27 = current_$17.first();
                                                        current_$17 = current_$17.rest();
                                                        if (NIL == current_$17) {
                                                            return all_assertions_meeting_criterion_plus_extents_of_predicates_mentioned(criterion_$27);
                                                        }
                                                        cdestructuring_bind_error(datum_$16, $list41);
                                                    } else
                                                        if (pcase_var.eql($kw42$ASSERTIONS_MEETING_CRITERION_PLUS_EXTENTS_OF_PREDICATES_AND_COLLE)) {
                                                            SubLObject current_$18;
                                                            final SubLObject datum_$17 = current_$18 = args;
                                                            SubLObject criterion_$28 = NIL;
                                                            destructuring_bind_must_consp(current_$18, datum_$17, $list41);
                                                            criterion_$28 = current_$18.first();
                                                            current_$18 = current_$18.rest();
                                                            if (NIL == current_$18) {
                                                                return all_assertions_meeting_criterion_plus_extents_of_predicates_and_collections_mentioned(criterion_$28);
                                                            }
                                                            cdestructuring_bind_error(datum_$17, $list41);
                                                        } else
                                                            if (pcase_var.eql($MENTIONS_TERM)) {
                                                                SubLObject current_$19;
                                                                final SubLObject datum_$18 = current_$19 = args;
                                                                SubLObject v_term = NIL;
                                                                destructuring_bind_must_consp(current_$19, datum_$18, $list44);
                                                                v_term = current_$19.first();
                                                                current_$19 = current_$19.rest();
                                                                if (NIL == current_$19) {
                                                                    return all_assertions_mentioning_indexed_term(v_term);
                                                                }
                                                                cdestructuring_bind_error(datum_$18, $list44);
                                                            } else
                                                                if (pcase_var.eql($MENTIONS_TERM_AT_LEAST_N_TIMES)) {
                                                                    SubLObject current_$20;
                                                                    final SubLObject datum_$19 = current_$20 = args;
                                                                    SubLObject v_term = NIL;
                                                                    SubLObject n = NIL;
                                                                    destructuring_bind_must_consp(current_$20, datum_$19, $list46);
                                                                    v_term = current_$20.first();
                                                                    current_$20 = current_$20.rest();
                                                                    destructuring_bind_must_consp(current_$20, datum_$19, $list46);
                                                                    n = current_$20.first();
                                                                    current_$20 = current_$20.rest();
                                                                    if (NIL == current_$20) {
                                                                        return all_assertions_mentioning_indexed_term_at_least_n_times(v_term, n);
                                                                    }
                                                                    cdestructuring_bind_error(datum_$19, $list46);
                                                                } else
                                                                    if (pcase_var.eql($MENTIONS_TERM_IN_ARGPOS)) {
                                                                        SubLObject current_$21;
                                                                        final SubLObject datum_$20 = current_$21 = args;
                                                                        SubLObject v_term = NIL;
                                                                        SubLObject argpos = NIL;
                                                                        destructuring_bind_must_consp(current_$21, datum_$20, $list48);
                                                                        v_term = current_$21.first();
                                                                        current_$21 = current_$21.rest();
                                                                        destructuring_bind_must_consp(current_$21, datum_$20, $list48);
                                                                        argpos = current_$21.first();
                                                                        current_$21 = current_$21.rest();
                                                                        if (NIL == current_$21) {
                                                                            return all_assertions_mentioning_indexed_term_in_argpos(v_term, argpos, UNPROVIDED);
                                                                        }
                                                                        cdestructuring_bind_error(datum_$20, $list48);
                                                                    } else
                                                                        if (pcase_var.eql($MENTIONS_ANY_INSTANTIATION_OF)) {
                                                                            SubLObject current_$22;
                                                                            final SubLObject datum_$21 = current_$22 = args;
                                                                            SubLObject set_or_coll = NIL;
                                                                            destructuring_bind_must_consp(current_$22, datum_$21, $list34);
                                                                            set_or_coll = current_$22.first();
                                                                            current_$22 = current_$22.rest();
                                                                            if (NIL == current_$22) {
                                                                                return all_assertions_mentioning_any_indexed_term_in_set_or_coll(set_or_coll);
                                                                            }
                                                                            cdestructuring_bind_error(datum_$21, $list34);
                                                                        } else
                                                                            if (pcase_var.eql($MENTIONS_ANY_QUOTED_INSTANCE_OF)) {
                                                                                SubLObject current_$23;
                                                                                final SubLObject datum_$22 = current_$23 = args;
                                                                                SubLObject coll = NIL;
                                                                                destructuring_bind_must_consp(current_$23, datum_$22, $list32);
                                                                                coll = current_$23.first();
                                                                                current_$23 = current_$23.rest();
                                                                                if (NIL == current_$23) {
                                                                                    return all_assertions_mentioning_any_quoted_instance_of(coll);
                                                                                }
                                                                                cdestructuring_bind_error(datum_$22, $list32);
                                                                            } else
                                                                                if (pcase_var.eql($MENTIONS_INSTANTIATIONS_OF_AT_LEAST_N_TIMES)) {
                                                                                    SubLObject current_$24;
                                                                                    final SubLObject datum_$23 = current_$24 = args;
                                                                                    SubLObject set_or_coll = NIL;
                                                                                    SubLObject n = NIL;
                                                                                    destructuring_bind_must_consp(current_$24, datum_$23, $list52);
                                                                                    set_or_coll = current_$24.first();
                                                                                    current_$24 = current_$24.rest();
                                                                                    destructuring_bind_must_consp(current_$24, datum_$23, $list52);
                                                                                    n = current_$24.first();
                                                                                    current_$24 = current_$24.rest();
                                                                                    if (NIL == current_$24) {
                                                                                        return all_assertions_mentioning_indexed_terms_in_set_or_coll_at_least_n_times(set_or_coll, n);
                                                                                    }
                                                                                    cdestructuring_bind_error(datum_$23, $list52);
                                                                                } else
                                                                                    if (pcase_var.eql($MENTIONS_QUOTED_INSTANCES_OF_AT_LEAST_N_TIMES)) {
                                                                                        SubLObject current_$25;
                                                                                        final SubLObject datum_$24 = current_$25 = args;
                                                                                        SubLObject coll = NIL;
                                                                                        SubLObject n = NIL;
                                                                                        destructuring_bind_must_consp(current_$25, datum_$24, $list54);
                                                                                        coll = current_$25.first();
                                                                                        current_$25 = current_$25.rest();
                                                                                        destructuring_bind_must_consp(current_$25, datum_$24, $list54);
                                                                                        n = current_$25.first();
                                                                                        current_$25 = current_$25.rest();
                                                                                        if (NIL == current_$25) {
                                                                                            return all_assertions_mentioning_quoted_instances_of_at_least_n_times(coll, n);
                                                                                        }
                                                                                        cdestructuring_bind_error(datum_$24, $list54);
                                                                                    } else
                                                                                        if (pcase_var.eql($MENTIONS_ANY_INSTANTIATION_OF_IN_ARGPOS)) {
                                                                                            SubLObject current_$26;
                                                                                            final SubLObject datum_$25 = current_$26 = args;
                                                                                            SubLObject set_or_coll = NIL;
                                                                                            SubLObject argpos = NIL;
                                                                                            destructuring_bind_must_consp(current_$26, datum_$25, $list56);
                                                                                            set_or_coll = current_$26.first();
                                                                                            current_$26 = current_$26.rest();
                                                                                            destructuring_bind_must_consp(current_$26, datum_$25, $list56);
                                                                                            argpos = current_$26.first();
                                                                                            current_$26 = current_$26.rest();
                                                                                            if (NIL == current_$26) {
                                                                                                return all_assertions_mentioning_any_indexed_term_in_set_or_coll_in_argpos(set_or_coll, argpos, UNPROVIDED);
                                                                                            }
                                                                                            cdestructuring_bind_error(datum_$25, $list56);
                                                                                        } else
                                                                                            if (pcase_var.eql($MENTIONS_ANY_QUOTED_INSTANCE_OF_IN_ARGPOS)) {
                                                                                                SubLObject current_$27;
                                                                                                final SubLObject datum_$26 = current_$27 = args;
                                                                                                SubLObject coll = NIL;
                                                                                                SubLObject argpos = NIL;
                                                                                                destructuring_bind_must_consp(current_$27, datum_$26, $list58);
                                                                                                coll = current_$27.first();
                                                                                                current_$27 = current_$27.rest();
                                                                                                destructuring_bind_must_consp(current_$27, datum_$26, $list58);
                                                                                                argpos = current_$27.first();
                                                                                                current_$27 = current_$27.rest();
                                                                                                if (NIL == current_$27) {
                                                                                                    return all_assertions_mentioning_any_quoted_instance_of_in_argpos(coll, argpos, UNPROVIDED);
                                                                                                }
                                                                                                cdestructuring_bind_error(datum_$26, $list58);
                                                                                            } else
                                                                                                if (pcase_var.eql($MENTIONS_ALL_INSTANTIATIONS_OF)) {
                                                                                                    SubLObject current_$28;
                                                                                                    final SubLObject datum_$27 = current_$28 = args;
                                                                                                    SubLObject set_or_coll = NIL;
                                                                                                    destructuring_bind_must_consp(current_$28, datum_$27, $list34);
                                                                                                    set_or_coll = current_$28.first();
                                                                                                    current_$28 = current_$28.rest();
                                                                                                    if (NIL == current_$28) {
                                                                                                        return all_assertions_mentioning_all_indexed_terms_in_set_or_coll(set_or_coll);
                                                                                                    }
                                                                                                    cdestructuring_bind_error(datum_$27, $list34);
                                                                                                } else
                                                                                                    if (pcase_var.eql($MENTIONS_ALL_QUOTED_INSTANCES_OF)) {
                                                                                                        SubLObject current_$29;
                                                                                                        final SubLObject datum_$28 = current_$29 = args;
                                                                                                        SubLObject coll = NIL;
                                                                                                        destructuring_bind_must_consp(current_$29, datum_$28, $list32);
                                                                                                        coll = current_$29.first();
                                                                                                        current_$29 = current_$29.rest();
                                                                                                        if (NIL == current_$29) {
                                                                                                            return all_assertions_mentioning_all_quoted_instances_of(coll);
                                                                                                        }
                                                                                                        cdestructuring_bind_error(datum_$28, $list32);
                                                                                                    } else
                                                                                                        if (pcase_var.eql($MENTIONS_ONLY_INSTANTIATIONS_OF)) {
                                                                                                            SubLObject current_$30;
                                                                                                            final SubLObject datum_$29 = current_$30 = args;
                                                                                                            SubLObject set_or_coll = NIL;
                                                                                                            destructuring_bind_must_consp(current_$30, datum_$29, $list34);
                                                                                                            set_or_coll = current_$30.first();
                                                                                                            current_$30 = current_$30.rest();
                                                                                                            if (NIL == current_$30) {
                                                                                                                return all_assertions_mentioning_only_indexed_terms_in_set_or_coll(set_or_coll);
                                                                                                            }
                                                                                                            cdestructuring_bind_error(datum_$29, $list34);
                                                                                                        } else
                                                                                                            if (pcase_var.eql($MENTIONS_ONLY_QUOTED_INSTANCES_OF)) {
                                                                                                                SubLObject current_$31;
                                                                                                                final SubLObject datum_$30 = current_$31 = args;
                                                                                                                SubLObject coll = NIL;
                                                                                                                destructuring_bind_must_consp(current_$31, datum_$30, $list32);
                                                                                                                coll = current_$31.first();
                                                                                                                current_$31 = current_$31.rest();
                                                                                                                if (NIL == current_$31) {
                                                                                                                    return all_assertions_mentioning_only_quoted_instances_of(coll);
                                                                                                                }
                                                                                                                cdestructuring_bind_error(datum_$30, $list32);
                                                                                                            } else {
                                                                                                                Errors.error($str16$Invalid_assertion_selection_crite, criterion, operator);
                                                                                                            }























            } else {
                Errors.error($str63$Invalid_assertion_selection_crite, criterion);
            }

        return NIL;
    }

    public static final SubLObject delayed_atomic_assertion_selection_criterion_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $delayed_atomic_assertion_selection_criteria$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject delayed_atomic_assertion_selection_criterion_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $delayed_atomic_assertion_selection_criteria$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject delayed_assertion_selection_criterion_operator_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $delayed_assertion_selection_criterion_operators$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject delayed_assertion_selection_criterion_operator_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $delayed_assertion_selection_criterion_operators$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject delayed_assertion_selection_criterionP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.butler.alchemy_export.delayed_atomic_assertion_selection_criterion_p(v_object)) || ((NIL != list_utilities.non_empty_list_p(v_object)) && (NIL != com.cyc.cycjava.cycl.butler.alchemy_export.delayed_assertion_selection_criterion_operator_p(v_object.first()))));
    }

    public static SubLObject delayed_assertion_selection_criterionP(final SubLObject v_object) {
        return makeBoolean((NIL != delayed_atomic_assertion_selection_criterion_p(v_object)) || ((NIL != list_utilities.non_empty_list_p(v_object)) && (NIL != delayed_assertion_selection_criterion_operator_p(v_object.first()))));
    }

    public static final SubLObject all_assertions_meeting_all_criteria_alt(SubLObject criteria) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject delayed_criteria = list_utilities.partition_list(criteria, symbol_function($sym64$DELAYED_ASSERTION_SELECTION_CRITERION_));
                SubLObject general_criteria = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != list_utilities.empty_list_p(general_criteria)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject general_criteria_55 = list_utilities.split_list(delayed_criteria, ONE_INTEGER);
                        SubLObject delayed_criteria_56 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        general_criteria = general_criteria_55;
                        delayed_criteria = delayed_criteria_56;
                    }
                }
                {
                    SubLObject assertions = list_utilities.fast_intersect_all(Mapping.mapcar(symbol_function(FIND_ASSERTIONS_BY_CRITERION_INT), general_criteria), symbol_function(EQ), UNPROVIDED);
                    SubLObject cdolist_list_var = delayed_criteria;
                    SubLObject delayed_criterion = NIL;
                    for (delayed_criterion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , delayed_criterion = cdolist_list_var.first()) {
                        assertions = com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_meeting_criterion_among(delayed_criterion, assertions);
                    }
                    return assertions;
                }
            }
        }
    }

    public static SubLObject all_assertions_meeting_all_criteria(final SubLObject criteria) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject delayed_criteria = list_utilities.partition_list(criteria, symbol_function($sym64$DELAYED_ASSERTION_SELECTION_CRITERION_));
        SubLObject general_criteria = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != list_utilities.empty_list_p(general_criteria)) {
            thread.resetMultipleValues();
            final SubLObject general_criteria_$57 = list_utilities.split_list(delayed_criteria, ONE_INTEGER);
            final SubLObject delayed_criteria_$58 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            general_criteria = general_criteria_$57;
            delayed_criteria = delayed_criteria_$58;
        }
        SubLObject assertions = list_utilities.fast_intersect_all(Mapping.mapcar(symbol_function(FIND_ASSERTIONS_BY_CRITERION_INT), general_criteria), symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = delayed_criteria;
        SubLObject delayed_criterion = NIL;
        delayed_criterion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assertions = find_assertions_meeting_criterion_among(delayed_criterion, assertions);
            cdolist_list_var = cdolist_list_var.rest();
            delayed_criterion = cdolist_list_var.first();
        } 
        return assertions;
    }

    public static final SubLObject find_assertions_meeting_criterion_among_alt(SubLObject criterion, SubLObject assertions) {
        if (criterion.isKeyword()) {
            {
                SubLObject pcase_var = criterion;
                if (pcase_var.eql($RULE)) {
                    return com.cyc.cycjava.cycl.butler.alchemy_export.all_rules_among(assertions);
                } else {
                    if (pcase_var.eql($GAF)) {
                        return com.cyc.cycjava.cycl.butler.alchemy_export.all_gafs_among(assertions);
                    } else {
                        Errors.error($str_alt65$Internal_error__Invalid_atomic_cr, criterion);
                    }
                }
            }
        } else {
            if (criterion.isList()) {
                {
                    SubLObject datum = criterion;
                    SubLObject current = datum;
                    SubLObject operator = NIL;
                    SubLObject args = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    operator = current.first();
                    current = current.rest();
                    args = current;
                    {
                        SubLObject pcase_var = operator;
                        if (pcase_var.eql($VISIBLE_FROM_MT)) {
                            {
                                SubLObject datum_57 = args;
                                SubLObject current_58 = datum_57;
                                SubLObject mt = NIL;
                                destructuring_bind_must_consp(current_58, datum_57, $list_alt29);
                                mt = current_58.first();
                                current_58 = current_58.rest();
                                if (NIL == current_58) {
                                    return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_visible_from_mt_among(mt, assertions);
                                } else {
                                    cdestructuring_bind_error(datum_57, $list_alt29);
                                }
                            }
                        } else {
                            Errors.error($str_alt66$Internal_error__Invalid_criterion, operator);
                        }
                    }
                }
            } else {
                Errors.error($str_alt63$Invalid_assertion_selection_crite, criterion);
            }
        }
        return NIL;
    }

    public static SubLObject find_assertions_meeting_criterion_among(final SubLObject criterion, final SubLObject assertions) {
        if (criterion.isKeyword()) {
            if (criterion.eql($RULE)) {
                return all_rules_among(assertions);
            }
            if (criterion.eql($GAF)) {
                return all_gafs_among(assertions);
            }
            Errors.error($str65$Internal_error__Invalid_atomic_cr, criterion);
        } else
            if (criterion.isList()) {
                SubLObject operator = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(criterion, criterion, $list14);
                operator = criterion.first();
                final SubLObject current = args = criterion.rest();
                final SubLObject pcase_var = operator;
                if (pcase_var.eql($VISIBLE_FROM_MT)) {
                    SubLObject current_$60;
                    final SubLObject datum_$59 = current_$60 = args;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current_$60, datum_$59, $list29);
                    mt = current_$60.first();
                    current_$60 = current_$60.rest();
                    if (NIL == current_$60) {
                        return all_assertions_visible_from_mt_among(mt, assertions);
                    }
                    cdestructuring_bind_error(datum_$59, $list29);
                } else {
                    Errors.error($str66$Internal_error__Invalid_criterion, operator);
                }
            } else {
                Errors.error($str63$Invalid_assertion_selection_crite, criterion);
            }

        return NIL;
    }

    public static final SubLObject find_assertions_not_meeting_criterion_among_alt(SubLObject criterion, SubLObject assertions) {
        if (criterion.isKeyword()) {
            {
                SubLObject pcase_var = criterion;
                if (pcase_var.eql($RULE)) {
                    return com.cyc.cycjava.cycl.butler.alchemy_export.all_gafs_among(assertions);
                } else {
                    if (pcase_var.eql($GAF)) {
                        return com.cyc.cycjava.cycl.butler.alchemy_export.all_rules_among(assertions);
                    }
                }
            }
        } else {
            if (criterion.isList()) {
                {
                    SubLObject datum = criterion;
                    SubLObject current = datum;
                    SubLObject operator = NIL;
                    SubLObject args = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    operator = current.first();
                    current = current.rest();
                    args = current;
                    {
                        SubLObject pcase_var = operator;
                        if (pcase_var.eql($VISIBLE_FROM_MT)) {
                            {
                                SubLObject datum_59 = args;
                                SubLObject current_60 = datum_59;
                                SubLObject mt = NIL;
                                destructuring_bind_must_consp(current_60, datum_59, $list_alt29);
                                mt = current_60.first();
                                current_60 = current_60.rest();
                                if (NIL == current_60) {
                                    return com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_not_visible_from_mt_among(mt, assertions);
                                } else {
                                    cdestructuring_bind_error(datum_59, $list_alt29);
                                }
                            }
                        }
                    }
                }
            } else {
                Errors.error($str_alt63$Invalid_assertion_selection_crite, criterion);
            }
        }
        {
            SubLObject assertions_meeting_criterion = com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_by_criterion_int(criterion);
            return nset_difference(assertions, assertions_meeting_criterion, symbol_function(EQ), UNPROVIDED);
        }
    }

    public static SubLObject find_assertions_not_meeting_criterion_among(final SubLObject criterion, final SubLObject assertions) {
        if (criterion.isKeyword()) {
            if (criterion.eql($RULE)) {
                return all_gafs_among(assertions);
            }
            if (criterion.eql($GAF)) {
                return all_rules_among(assertions);
            }
        } else
            if (criterion.isList()) {
                SubLObject operator = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(criterion, criterion, $list14);
                operator = criterion.first();
                final SubLObject current = args = criterion.rest();
                final SubLObject pcase_var = operator;
                if (pcase_var.eql($VISIBLE_FROM_MT)) {
                    SubLObject current_$62;
                    final SubLObject datum_$61 = current_$62 = args;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current_$62, datum_$61, $list29);
                    mt = current_$62.first();
                    current_$62 = current_$62.rest();
                    if (NIL == current_$62) {
                        return all_assertions_not_visible_from_mt_among(mt, assertions);
                    }
                    cdestructuring_bind_error(datum_$61, $list29);
                }
            } else {
                Errors.error($str63$Invalid_assertion_selection_crite, criterion);
            }

        final SubLObject assertions_meeting_criterion = find_assertions_by_criterion_int(criterion);
        return nset_difference(assertions, assertions_meeting_criterion, symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject all_rules_among_alt(SubLObject assertions) {
        {
            SubLObject filtered_assertions = NIL;
            SubLObject el_formula = NIL;
            SubLObject verbosified_el_formula = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                el_formula = uncanonicalizer.assertion_el_formula(assertion);
                verbosified_el_formula = verbosifier.verbosify_cycl(el_formula, $$InferencePSC, UNPROVIDED);
                if ((NIL == groundP(verbosified_el_formula, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.butler.alchemy_export.verbosified_el_ruleP(verbosified_el_formula))) {
                    filtered_assertions = cons(assertion, filtered_assertions);
                }
            }
            return filtered_assertions;
        }
    }

    public static SubLObject all_rules_among(final SubLObject assertions) {
        SubLObject filtered_assertions = NIL;
        SubLObject el_formula = NIL;
        SubLObject verbosified_el_formula = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            el_formula = uncanonicalizer.assertion_el_formula(assertion);
            verbosified_el_formula = verbosifier.verbosify_cycl(el_formula, $$InferencePSC, UNPROVIDED);
            if ((NIL == groundP(verbosified_el_formula, UNPROVIDED)) && (NIL != verbosified_el_ruleP(verbosified_el_formula))) {
                filtered_assertions = cons(assertion, filtered_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return filtered_assertions;
    }

    /**
     * Returns T IFF the given EL-FORMULA is a verbosified el rule.
     */
    @LispMethod(comment = "Returns T IFF the given EL-FORMULA is a verbosified el rule.")
    public static final SubLObject verbosified_el_ruleP_alt(SubLObject el_formula) {
        if (!el_formula.isCons()) {
            return NIL;
        }
        if (!length(el_formula).numG(ONE_INTEGER)) {
            return NIL;
        }
        if ((el_formula.first() == $$not) && (second(el_formula).first() == $$and)) {
            return T;
        }
        if (el_formula.first() != $$or) {
            return NIL;
        }
        {
            SubLObject args = el_formula.rest();
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (arg.isCons() && (arg.first() == $$not)) {
                    return T;
                }
            }
            return NIL;
        }
    }

    /**
     * Returns T IFF the given EL-FORMULA is a verbosified el rule.
     */
    @LispMethod(comment = "Returns T IFF the given EL-FORMULA is a verbosified el rule.")
    public static SubLObject verbosified_el_ruleP(final SubLObject el_formula) {
        if (!el_formula.isCons()) {
            return NIL;
        }
        if (!length(el_formula).numG(ONE_INTEGER)) {
            return NIL;
        }
        if (el_formula.first().eql($$not) && second(el_formula).first().eql($$and)) {
            return T;
        }
        if (!el_formula.first().eql($$or)) {
            return NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = el_formula.rest();
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons() && arg.first().eql($$not)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Returns the list of GAFs among the given list of ASSERTIONS, after filtering out
     * gafs having rule expansions.
     */
    @LispMethod(comment = "Returns the list of GAFs among the given list of ASSERTIONS, after filtering out\r\ngafs having rule expansions.\nReturns the list of GAFs among the given list of ASSERTIONS, after filtering out\ngafs having rule expansions.")
    public static final SubLObject all_gafs_among_alt(SubLObject assertions) {
        {
            SubLObject filtered_assertions = NIL;
            SubLObject el_formula = NIL;
            SubLObject verbosified_el_formula = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                el_formula = uncanonicalizer.assertion_el_formula(assertion);
                verbosified_el_formula = verbosifier.verbosify_cycl(el_formula, $$InferencePSC, UNPROVIDED);
                if (NIL != gafP(verbosified_el_formula)) {
                    filtered_assertions = cons(assertion, filtered_assertions);
                }
            }
            return filtered_assertions;
        }
    }

    /**
     * Returns the list of GAFs among the given list of ASSERTIONS, after filtering out
     * gafs having rule expansions.
     */
    @LispMethod(comment = "Returns the list of GAFs among the given list of ASSERTIONS, after filtering out\r\ngafs having rule expansions.\nReturns the list of GAFs among the given list of ASSERTIONS, after filtering out\ngafs having rule expansions.")
    public static SubLObject all_gafs_among(final SubLObject assertions) {
        SubLObject filtered_assertions = NIL;
        SubLObject el_formula = NIL;
        SubLObject verbosified_el_formula = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            el_formula = uncanonicalizer.assertion_el_formula(assertion);
            verbosified_el_formula = verbosifier.verbosify_cycl(el_formula, $$InferencePSC, UNPROVIDED);
            if (NIL != gafP(verbosified_el_formula)) {
                filtered_assertions = cons(assertion, filtered_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return filtered_assertions;
    }

    public static final SubLObject all_assertions_visible_from_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertions = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject idx = assertion_handles.do_assertions_table();
                            SubLObject mess = cconcatenate($str_alt71$Collecting_assertions_visible_fro, format_nil.format_nil_s_no_copy(mt));
                            SubLObject total = id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            SubLTrampolineFile.checkType(mess, STRINGP);
                            {
                                SubLObject _prev_bind_0_61 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_62 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_63 = $within_noting_percent_progress$.currentBinding(thread);
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
                                            SubLObject assertion = NIL;
                                            while (NIL != id) {
                                                assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                    note_percent_progress(sofar, total);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    if (NIL != mt_relevance_macros.relevant_assertionP(assertion)) {
                                                        assertions = cons(assertion, assertions);
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
                                    $within_noting_percent_progress$.rebind(_prev_bind_2_63, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_62, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_61, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertions;
            }
        }
    }

    public static SubLObject all_assertions_visible_from_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = cconcatenate($str71$Collecting_assertions_visible_fro, format_nil.format_nil_s_no_copy(mt));
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0_$63 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$64 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_2_$65 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$66 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$66, $SKIP)) {
                        final SubLObject idx_$67 = idx_$66;
                        if (NIL == id_index_dense_objects_empty_p(idx_$67, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$67);
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
                                    if (NIL != mt_relevance_macros.relevant_assertionP(assertion)) {
                                        assertions = cons(assertion, assertions);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$68 = idx_$66;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$68)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$68);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$68);
                            final SubLObject end_id = id_index_next_id(idx_$68);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (NIL != mt_relevance_macros.relevant_assertionP(assertion2)) {
                                        assertions = cons(assertion2, assertions);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_2_$65, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$64, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$63, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    /**
     *
     *
     * @return listp: all assertions in ASSERTIONS that are visible from MT
     */
    @LispMethod(comment = "@return listp: all assertions in ASSERTIONS that are visible from MT")
    public static final SubLObject all_assertions_visible_from_mt_among_alt(SubLObject mt, SubLObject assertions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = list_utilities.find_all_if(symbol_function($sym73$RELEVANT_ASSERTION_), assertions, UNPROVIDED);
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

    /**
     *
     *
     * @return listp: all assertions in ASSERTIONS that are visible from MT
     */
    @LispMethod(comment = "@return listp: all assertions in ASSERTIONS that are visible from MT")
    public static SubLObject all_assertions_visible_from_mt_among(final SubLObject mt, final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = list_utilities.find_all_if(symbol_function($sym73$RELEVANT_ASSERTION_), assertions, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp: all assertions in ASSERTIONS that are not visible from MT
     */
    @LispMethod(comment = "@return listp: all assertions in ASSERTIONS that are not visible from MT")
    public static final SubLObject all_assertions_not_visible_from_mt_among_alt(SubLObject mt, SubLObject assertions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = list_utilities.find_all_if_not(symbol_function($sym73$RELEVANT_ASSERTION_), assertions, UNPROVIDED);
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

    /**
     *
     *
     * @return listp: all assertions in ASSERTIONS that are not visible from MT
     */
    @LispMethod(comment = "@return listp: all assertions in ASSERTIONS that are not visible from MT")
    public static SubLObject all_assertions_not_visible_from_mt_among(final SubLObject mt, final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = list_utilities.find_all_if_not(symbol_function($sym73$RELEVANT_ASSERTION_), assertions, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp: all assertions, regardless of mt or truth, such that #$isa is the arg0 and COLL is the arg2
     */
    @LispMethod(comment = "@return listp: all assertions, regardless of mt or truth, such that #$isa is the arg0 and COLL is the arg2")
    public static final SubLObject all_isa_assertions_of_collection_alt(SubLObject coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        result = kb_mapping.gather_gaf_arg_index(coll, TWO_INTEGER, $$isa, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp: all assertions, regardless of mt or truth, such that #$isa is the arg0 and COLL is the arg2
     */
    @LispMethod(comment = "@return listp: all assertions, regardless of mt or truth, such that #$isa is the arg0 and COLL is the arg2")
    public static SubLObject all_isa_assertions_of_collection(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            result = kb_mapping.gather_gaf_arg_index(coll, TWO_INTEGER, $$isa, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection of #$Collections.  Any instantiation that isn't a collection is ignored
     */
    @LispMethod(comment = "@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection of #$Collections.  Any instantiation that isn\'t a collection is ignored")
    public static final SubLObject all_isa_assertions_of_all_collections_in_set_or_coll_alt(SubLObject set_or_coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, UNPROVIDED, UNPROVIDED);
                            SubLObject inst = NIL;
                            for (inst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inst = cdolist_list_var.first()) {
                                if (NIL != fort_types_interface.collection_p(inst)) {
                                    result = append(com.cyc.cycjava.cycl.butler.alchemy_export.all_isa_assertions_of_collection(inst), result);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection of #$Collections.  Any instantiation that isn't a collection is ignored
     */
    @LispMethod(comment = "@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection of #$Collections.  Any instantiation that isn\'t a collection is ignored")
    public static SubLObject all_isa_assertions_of_all_collections_in_set_or_coll(final SubLObject set_or_coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, UNPROVIDED, UNPROVIDED);
            SubLObject inst = NIL;
            inst = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.collection_p(inst)) {
                    result = append(all_isa_assertions_of_collection(inst), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param COLL
     * 		collection-p: a #$Collection of CycL terms that denote #$Collections.  Any instance of COLL that is not a collection-denoting term is ignored
     * @return listp: all assertions, regardless of mt or truth, such that #$isa is the arg0 and the arg2 is a (quoted) instance of COLL
     */
    @LispMethod(comment = "@param COLL\r\n\t\tcollection-p: a #$Collection of CycL terms that denote #$Collections.  Any instance of COLL that is not a collection-denoting term is ignored\r\n@return listp: all assertions, regardless of mt or truth, such that #$isa is the arg0 and the arg2 is a (quoted) instance of COLL")
    public static final SubLObject all_isa_assertions_of_all_quoted_instances_of_coll_alt(SubLObject coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, UNPROVIDED, UNPROVIDED);
                            SubLObject inst = NIL;
                            for (inst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inst = cdolist_list_var.first()) {
                                if (NIL != fort_types_interface.collection_p(inst)) {
                                    result = append(com.cyc.cycjava.cycl.butler.alchemy_export.all_isa_assertions_of_collection(inst), result);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param COLL
     * 		collection-p: a #$Collection of CycL terms that denote #$Collections.  Any instance of COLL that is not a collection-denoting term is ignored
     * @return listp: all assertions, regardless of mt or truth, such that #$isa is the arg0 and the arg2 is a (quoted) instance of COLL
     */
    @LispMethod(comment = "@param COLL\r\n\t\tcollection-p: a #$Collection of CycL terms that denote #$Collections.  Any instance of COLL that is not a collection-denoting term is ignored\r\n@return listp: all assertions, regardless of mt or truth, such that #$isa is the arg0 and the arg2 is a (quoted) instance of COLL")
    public static SubLObject all_isa_assertions_of_all_quoted_instances_of_coll(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, UNPROVIDED, UNPROVIDED);
            SubLObject inst = NIL;
            inst = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.collection_p(inst)) {
                    result = append(all_isa_assertions_of_collection(inst), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns the entire extent of the predicate-p PRED, regardless of microtheory or truth.
     */
    @LispMethod(comment = "Returns the entire extent of the predicate-p PRED, regardless of microtheory or truth.")
    public static final SubLObject predicate_extent_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject extent = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        extent = kb_mapping.gather_predicate_extent_index(pred, NIL, NIL);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return extent;
            }
        }
    }

    /**
     * Returns the entire extent of the predicate-p PRED, regardless of microtheory or truth.
     */
    @LispMethod(comment = "Returns the entire extent of the predicate-p PRED, regardless of microtheory or truth.")
    public static SubLObject predicate_extent(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject extent = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            extent = kb_mapping.gather_predicate_extent_index(pred, NIL, NIL);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return extent;
    }

    /**
     *
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection of #$Predicates.  Any instantiation that isn't a predicate is ignored
     */
    @LispMethod(comment = "@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection of #$Predicates.  Any instantiation that isn\'t a predicate is ignored")
    public static final SubLObject union_of_extents_of_predicate_set_or_coll_alt(SubLObject set_or_coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, UNPROVIDED, UNPROVIDED);
                            SubLObject inst = NIL;
                            for (inst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inst = cdolist_list_var.first()) {
                                if (NIL != fort_types_interface.predicate_p(inst)) {
                                    result = append(com.cyc.cycjava.cycl.butler.alchemy_export.predicate_extent(inst), result);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection of #$Predicates.  Any instantiation that isn't a predicate is ignored
     */
    @LispMethod(comment = "@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection of #$Predicates.  Any instantiation that isn\'t a predicate is ignored")
    public static SubLObject union_of_extents_of_predicate_set_or_coll(final SubLObject set_or_coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, UNPROVIDED, UNPROVIDED);
            SubLObject inst = NIL;
            inst = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.predicate_p(inst)) {
                    result = append(predicate_extent(inst), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param COLL
     * 		collection-p: a #$Collection of CycL terms that denote #$Predicates.  Any instance of COLL that is not a predicate-denoting term is ignored
     * @return listp: all assertions in the extent of any predicate that is denoted by an instance of COLL
     */
    @LispMethod(comment = "@param COLL\r\n\t\tcollection-p: a #$Collection of CycL terms that denote #$Predicates.  Any instance of COLL that is not a predicate-denoting term is ignored\r\n@return listp: all assertions in the extent of any predicate that is denoted by an instance of COLL")
    public static final SubLObject union_of_extents_of_all_quoted_instances_of_coll_alt(SubLObject coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, UNPROVIDED, UNPROVIDED);
                            SubLObject inst = NIL;
                            for (inst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inst = cdolist_list_var.first()) {
                                if (NIL != fort_types_interface.predicate_p(inst)) {
                                    result = append(com.cyc.cycjava.cycl.butler.alchemy_export.predicate_extent(inst), result);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param COLL
     * 		collection-p: a #$Collection of CycL terms that denote #$Predicates.  Any instance of COLL that is not a predicate-denoting term is ignored
     * @return listp: all assertions in the extent of any predicate that is denoted by an instance of COLL
     */
    @LispMethod(comment = "@param COLL\r\n\t\tcollection-p: a #$Collection of CycL terms that denote #$Predicates.  Any instance of COLL that is not a predicate-denoting term is ignored\r\n@return listp: all assertions in the extent of any predicate that is denoted by an instance of COLL")
    public static SubLObject union_of_extents_of_all_quoted_instances_of_coll(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, UNPROVIDED, UNPROVIDED);
            SubLObject inst = NIL;
            inst = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.predicate_p(inst)) {
                    result = append(predicate_extent(inst), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject all_assertions_meeting_criterion_plus_extents_of_predicates_mentioned_alt(SubLObject criterion) {
        {
            SubLObject assertions = com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_by_criterion_int(criterion);
            SubLObject predicates = list_utilities.mapnunion(symbol_function(ASSERTION_PREDICATES), assertions, symbol_function(EQ));
            SubLObject cdolist_list_var = predicates;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                assertions = append(com.cyc.cycjava.cycl.butler.alchemy_export.predicate_extent(predicate), assertions);
            }
            return list_utilities.fast_delete_duplicates(assertions, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject all_assertions_meeting_criterion_plus_extents_of_predicates_mentioned(final SubLObject criterion) {
        SubLObject assertions = find_assertions_by_criterion_int(criterion);
        SubLObject cdolist_list_var;
        final SubLObject predicates = cdolist_list_var = list_utilities.mapnunion(symbol_function(ASSERTION_PREDICATES), assertions, symbol_function(EQ));
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assertions = append(predicate_extent(predicate), assertions);
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(assertions, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp: all reified predicates mentioned in ASSERTION (not necessarily in the 0th arg-position)
     */
    @LispMethod(comment = "@return listp: all reified predicates mentioned in ASSERTION (not necessarily in the 0th arg-position)")
    public static final SubLObject assertion_predicates_alt(SubLObject assertion) {
        return list_utilities.find_all_if(symbol_function(PREDICATE_P), assertions_high.assertion_forts(assertion, T, T, NIL, T), UNPROVIDED);
    }

    /**
     *
     *
     * @return listp: all reified predicates mentioned in ASSERTION (not necessarily in the 0th arg-position)
     */
    @LispMethod(comment = "@return listp: all reified predicates mentioned in ASSERTION (not necessarily in the 0th arg-position)")
    public static SubLObject assertion_predicates(final SubLObject assertion) {
        return list_utilities.find_all_if(symbol_function(PREDICATE_P), assertions_high.assertion_forts(assertion, T, T, NIL, T), UNPROVIDED);
    }

    public static final SubLObject all_assertions_meeting_criterion_plus_extents_of_predicates_and_collections_mentioned_alt(SubLObject criterion) {
        {
            SubLObject assertions = com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_by_criterion_int(criterion);
            SubLObject preds_and_colls = list_utilities.mapnunion(symbol_function(ASSERTION_PREDICATES_AND_COLLECTIONS), assertions, symbol_function(EQ));
            SubLObject cdolist_list_var = preds_and_colls;
            SubLObject pred_or_coll = NIL;
            for (pred_or_coll = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred_or_coll = cdolist_list_var.first()) {
                format(T, $str_alt79$__finding_pred_or_coll_extent_for, pred_or_coll);
                force_output(UNPROVIDED);
                assertions = append(com.cyc.cycjava.cycl.butler.alchemy_export.pred_or_coll_extent(pred_or_coll), assertions);
            }
            return list_utilities.fast_delete_duplicates(assertions, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject all_assertions_meeting_criterion_plus_extents_of_predicates_and_collections_mentioned(final SubLObject criterion) {
        SubLObject assertions = find_assertions_by_criterion_int(criterion);
        SubLObject cdolist_list_var;
        final SubLObject preds_and_colls = cdolist_list_var = list_utilities.mapnunion(symbol_function(ASSERTION_PREDICATES_AND_COLLECTIONS), assertions, symbol_function(EQ));
        SubLObject pred_or_coll = NIL;
        pred_or_coll = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str79$__finding_pred_or_coll_extent_for, pred_or_coll);
            force_output(UNPROVIDED);
            assertions = append(pred_or_coll_extent(pred_or_coll), assertions);
            cdolist_list_var = cdolist_list_var.rest();
            pred_or_coll = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(assertions, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp: all reified predicates and collections mentioned in ASSERTION
     */
    @LispMethod(comment = "@return listp: all reified predicates and collections mentioned in ASSERTION")
    public static final SubLObject assertion_predicates_and_collections_alt(SubLObject assertion) {
        return list_utilities.find_all_if(symbol_function(PREDICATE_OR_COLLECTION_P), assertions_high.assertion_forts(assertion, T, T, NIL, T), UNPROVIDED);
    }

    /**
     *
     *
     * @return listp: all reified predicates and collections mentioned in ASSERTION
     */
    @LispMethod(comment = "@return listp: all reified predicates and collections mentioned in ASSERTION")
    public static SubLObject assertion_predicates_and_collections(final SubLObject assertion) {
        return list_utilities.find_all_if(symbol_function(PREDICATE_OR_COLLECTION_P), assertions_high.assertion_forts(assertion, T, T, NIL, T), UNPROVIDED);
    }

    public static final SubLObject predicate_or_collection_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != fort_types_interface.predicate_p(v_object)) || (NIL != fort_types_interface.collection_p(v_object)));
    }

    public static SubLObject predicate_or_collection_p(final SubLObject v_object) {
        return makeBoolean((NIL != fort_types_interface.predicate_p(v_object)) || (NIL != fort_types_interface.collection_p(v_object)));
    }

    public static final SubLObject pred_or_coll_extent_alt(SubLObject pred_or_coll) {
        return NIL != fort_types_interface.predicate_p(pred_or_coll) ? ((SubLObject) (com.cyc.cycjava.cycl.butler.alchemy_export.predicate_extent(pred_or_coll))) : com.cyc.cycjava.cycl.butler.alchemy_export.all_isa_assertions_of_collection(pred_or_coll);
    }

    public static SubLObject pred_or_coll_extent(final SubLObject pred_or_coll) {
        return NIL != fort_types_interface.predicate_p(pred_or_coll) ? predicate_extent(pred_or_coll) : all_isa_assertions_of_collection(pred_or_coll);
    }

    public static final SubLObject all_assertions_mentioning_indexed_term_alt(SubLObject v_term) {
        return kb_mapping.gather_index_in_any_mt(v_term, T);
    }

    public static SubLObject all_assertions_mentioning_indexed_term(final SubLObject v_term) {
        return kb_mapping.gather_index_in_any_mt(v_term, T);
    }

    public static final SubLObject all_assertions_mentioning_indexed_term_at_least_n_times_alt(SubLObject v_term, SubLObject n) {
        SubLTrampolineFile.checkType(n, POSITIVE_INTEGER_P);
        {
            SubLObject candidate_assertions = com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_indexed_term(v_term);
            SubLObject assertions = NIL;
            if (NIL != number_utilities.onep(n)) {
                assertions = candidate_assertions;
            } else {
                {
                    SubLObject cdolist_list_var = candidate_assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        {
                            SubLObject assertion_forts = assertions_high.assertion_forts(assertion, T, T, NIL, NIL);
                            SubLObject term_mentions = count(v_term, assertion_forts, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (term_mentions.numGE(n)) {
                                assertions = cons(assertion, assertions);
                            }
                        }
                    }
                }
            }
            return assertions;
        }
    }

    public static SubLObject all_assertions_mentioning_indexed_term_at_least_n_times(final SubLObject v_term, final SubLObject n) {
        assert NIL != subl_promotions.positive_integer_p(n) : "! subl_promotions.positive_integer_p(n) " + ("subl_promotions.positive_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(n) ") + n;
        final SubLObject candidate_assertions = all_assertions_mentioning_indexed_term(v_term);
        SubLObject assertions = NIL;
        if (NIL != number_utilities.onep(n)) {
            assertions = candidate_assertions;
        } else {
            SubLObject cdolist_list_var = candidate_assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, T, T, NIL, NIL);
                final SubLObject term_mentions = count(v_term, assertion_forts, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (term_mentions.numGE(n)) {
                    assertions = cons(assertion, assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        }
        return assertions;
    }

    public static final SubLObject all_assertions_mentioning_indexed_term_in_argpos_alt(SubLObject v_term, SubLObject argpos, SubLObject include_negative_assertionsP) {
        if (include_negative_assertionsP == UNPROVIDED) {
            include_negative_assertionsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject truth = (NIL != include_negative_assertionsP) ? ((SubLObject) (NIL)) : $TRUE;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        result = kb_mapping.gather_gaf_arg_index(v_term, argpos, NIL, NIL, truth);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject all_assertions_mentioning_indexed_term_in_argpos(final SubLObject v_term, final SubLObject argpos, SubLObject include_negative_assertionsP) {
        if (include_negative_assertionsP == UNPROVIDED) {
            include_negative_assertionsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject truth = (NIL != include_negative_assertionsP) ? NIL : $TRUE;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            result = kb_mapping.gather_gaf_arg_index(v_term, argpos, NIL, NIL, truth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection.  Any instantiation that isn't an indexed term is ignored
     */
    @LispMethod(comment = "@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection.  Any instantiation that isn\'t an indexed term is ignored")
    public static final SubLObject all_assertions_mentioning_any_indexed_term_in_set_or_coll_alt(SubLObject set_or_coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, UNPROVIDED, UNPROVIDED);
                            SubLObject inst = NIL;
                            for (inst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inst = cdolist_list_var.first()) {
                                if (NIL != indexed_term_p(inst)) {
                                    result = append(kb_mapping.gather_index(inst, UNPROVIDED), result);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection.  Any instantiation that isn't an indexed term is ignored
     */
    @LispMethod(comment = "@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection.  Any instantiation that isn\'t an indexed term is ignored")
    public static SubLObject all_assertions_mentioning_any_indexed_term_in_set_or_coll(final SubLObject set_or_coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, UNPROVIDED, UNPROVIDED);
            SubLObject inst = NIL;
            inst = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != indexed_term_p(inst)) {
                    result = append(kb_mapping.gather_index(inst, UNPROVIDED), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param COLL
     * 		collection-p: a #$Collection of CycL terms.  Any instance of COLL that isn't an indexed term is ignored
     */
    @LispMethod(comment = "@param COLL\r\n\t\tcollection-p: a #$Collection of CycL terms.  Any instance of COLL that isn\'t an indexed term is ignored")
    public static final SubLObject all_assertions_mentioning_any_quoted_instance_of_alt(SubLObject coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, UNPROVIDED, UNPROVIDED);
                            SubLObject inst = NIL;
                            for (inst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inst = cdolist_list_var.first()) {
                                if (NIL != indexed_term_p(inst)) {
                                    result = append(kb_mapping.gather_index(inst, UNPROVIDED), result);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @param COLL
     * 		collection-p: a #$Collection of CycL terms.  Any instance of COLL that isn't an indexed term is ignored
     */
    @LispMethod(comment = "@param COLL\r\n\t\tcollection-p: a #$Collection of CycL terms.  Any instance of COLL that isn\'t an indexed term is ignored")
    public static SubLObject all_assertions_mentioning_any_quoted_instance_of(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, UNPROVIDED, UNPROVIDED);
            SubLObject inst = NIL;
            inst = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != indexed_term_p(inst)) {
                    result = append(kb_mapping.gather_index(inst, UNPROVIDED), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject all_assertions_mentioning_indexed_terms_in_set_or_coll_at_least_n_times_alt(SubLObject set_or_coll, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(n, POSITIVE_INTEGER_P);
            {
                SubLObject candidate_assertions = com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_any_indexed_term_in_set_or_coll(set_or_coll);
                SubLObject assertions = NIL;
                if (NIL != number_utilities.onep(n)) {
                    assertions = candidate_assertions;
                } else {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                            {
                                SubLObject cdolist_list_var = candidate_assertions;
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    {
                                        SubLObject assertion_forts = assertions_high.assertion_forts(assertion, T, T, NIL, NIL);
                                        SubLObject inst_mentions = ZERO_INTEGER;
                                        SubLObject has_n_mentionsP = NIL;
                                        SubLObject rest = NIL;
                                        for (rest = assertion_forts; !((NIL != has_n_mentionsP) || (NIL == rest)); rest = rest.rest()) {
                                            {
                                                SubLObject assertion_fort = rest.first();
                                                if (NIL != isa.instantiationP(assertion_fort, set_or_coll, UNPROVIDED)) {
                                                    inst_mentions = add(inst_mentions, ONE_INTEGER);
                                                }
                                                has_n_mentionsP = numGE(inst_mentions, n);
                                            }
                                        }
                                        if (NIL != has_n_mentionsP) {
                                            assertions = cons(assertion, assertions);
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
                return assertions;
            }
        }
    }

    public static SubLObject all_assertions_mentioning_indexed_terms_in_set_or_coll_at_least_n_times(final SubLObject set_or_coll, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(n) : "! subl_promotions.positive_integer_p(n) " + ("subl_promotions.positive_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(n) ") + n;
        final SubLObject candidate_assertions = all_assertions_mentioning_any_indexed_term_in_set_or_coll(set_or_coll);
        SubLObject assertions = NIL;
        if (NIL != number_utilities.onep(n)) {
            assertions = candidate_assertions;
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                SubLObject cdolist_list_var = candidate_assertions;
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, T, T, NIL, NIL);
                    SubLObject inst_mentions;
                    SubLObject has_n_mentionsP;
                    SubLObject rest;
                    SubLObject assertion_fort;
                    for (inst_mentions = ZERO_INTEGER, has_n_mentionsP = NIL, rest = NIL, rest = assertion_forts; (NIL == has_n_mentionsP) && (NIL != rest); has_n_mentionsP = numGE(inst_mentions, n) , rest = rest.rest()) {
                        assertion_fort = rest.first();
                        if (NIL != isa.instantiationP(assertion_fort, set_or_coll, UNPROVIDED)) {
                            inst_mentions = add(inst_mentions, ONE_INTEGER);
                        }
                    }
                    if (NIL != has_n_mentionsP) {
                        assertions = cons(assertion, assertions);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return assertions;
    }

    public static final SubLObject all_assertions_mentioning_quoted_instances_of_at_least_n_times_alt(SubLObject coll, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(n, POSITIVE_INTEGER_P);
            {
                SubLObject candidate_assertions = com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_any_quoted_instance_of(coll);
                SubLObject assertions = NIL;
                if (NIL != number_utilities.onep(n)) {
                    assertions = candidate_assertions;
                } else {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                            {
                                SubLObject cdolist_list_var = candidate_assertions;
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    {
                                        SubLObject assertion_forts = assertions_high.assertion_forts(assertion, T, T, NIL, NIL);
                                        SubLObject inst_mentions = ZERO_INTEGER;
                                        SubLObject has_n_mentionsP = NIL;
                                        SubLObject rest = NIL;
                                        for (rest = assertion_forts; !((NIL != has_n_mentionsP) || (NIL == rest)); rest = rest.rest()) {
                                            {
                                                SubLObject assertion_fort = rest.first();
                                                if (NIL != isa.quoted_isaP(assertion_fort, coll, UNPROVIDED, UNPROVIDED)) {
                                                    inst_mentions = add(inst_mentions, ONE_INTEGER);
                                                }
                                                has_n_mentionsP = numGE(inst_mentions, n);
                                            }
                                        }
                                        if (NIL != has_n_mentionsP) {
                                            assertions = cons(assertion, assertions);
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
                return assertions;
            }
        }
    }

    public static SubLObject all_assertions_mentioning_quoted_instances_of_at_least_n_times(final SubLObject coll, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(n) : "! subl_promotions.positive_integer_p(n) " + ("subl_promotions.positive_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(n) ") + n;
        final SubLObject candidate_assertions = all_assertions_mentioning_any_quoted_instance_of(coll);
        SubLObject assertions = NIL;
        if (NIL != number_utilities.onep(n)) {
            assertions = candidate_assertions;
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                SubLObject cdolist_list_var = candidate_assertions;
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, T, T, NIL, NIL);
                    SubLObject inst_mentions;
                    SubLObject has_n_mentionsP;
                    SubLObject rest;
                    SubLObject assertion_fort;
                    for (inst_mentions = ZERO_INTEGER, has_n_mentionsP = NIL, rest = NIL, rest = assertion_forts; (NIL == has_n_mentionsP) && (NIL != rest); has_n_mentionsP = numGE(inst_mentions, n) , rest = rest.rest()) {
                        assertion_fort = rest.first();
                        if (NIL != isa.quoted_isaP(assertion_fort, coll, UNPROVIDED, UNPROVIDED)) {
                            inst_mentions = add(inst_mentions, ONE_INTEGER);
                        }
                    }
                    if (NIL != has_n_mentionsP) {
                        assertions = cons(assertion, assertions);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return assertions;
    }

    /**
     *
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection of indexed-term-p's.  Any instantiation that isn't an indexed term is ignored
     */
    @LispMethod(comment = "@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection of indexed-term-p\'s.  Any instantiation that isn\'t an indexed term is ignored")
    public static final SubLObject all_assertions_mentioning_any_indexed_term_in_set_or_coll_in_argpos_alt(SubLObject set_or_coll, SubLObject argpos, SubLObject include_negative_assertionsP) {
        if (include_negative_assertionsP == UNPROVIDED) {
            include_negative_assertionsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject truth = (NIL != include_negative_assertionsP) ? ((SubLObject) (NIL)) : $TRUE;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, UNPROVIDED, UNPROVIDED);
                            SubLObject inst = NIL;
                            for (inst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inst = cdolist_list_var.first()) {
                                if (NIL != indexed_term_p(inst)) {
                                    result = append(kb_mapping.gather_gaf_arg_index(inst, argpos, NIL, NIL, truth), result);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection of indexed-term-p's.  Any instantiation that isn't an indexed term is ignored
     */
    @LispMethod(comment = "@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection of indexed-term-p\'s.  Any instantiation that isn\'t an indexed term is ignored")
    public static SubLObject all_assertions_mentioning_any_indexed_term_in_set_or_coll_in_argpos(final SubLObject set_or_coll, final SubLObject argpos, SubLObject include_negative_assertionsP) {
        if (include_negative_assertionsP == UNPROVIDED) {
            include_negative_assertionsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject truth = (NIL != include_negative_assertionsP) ? NIL : $TRUE;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, UNPROVIDED, UNPROVIDED);
            SubLObject inst = NIL;
            inst = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != indexed_term_p(inst)) {
                    result = append(kb_mapping.gather_gaf_arg_index(inst, argpos, NIL, NIL, truth), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject all_assertions_mentioning_any_quoted_instance_of_in_argpos_alt(SubLObject coll, SubLObject argpos, SubLObject include_negative_assertionsP) {
        if (include_negative_assertionsP == UNPROVIDED) {
            include_negative_assertionsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject truth = (NIL != include_negative_assertionsP) ? ((SubLObject) (NIL)) : $TRUE;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, UNPROVIDED, UNPROVIDED);
                            SubLObject inst = NIL;
                            for (inst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inst = cdolist_list_var.first()) {
                                if (NIL != indexed_term_p(inst)) {
                                    result = append(kb_mapping.gather_gaf_arg_index(inst, argpos, NIL, NIL, truth), result);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject all_assertions_mentioning_any_quoted_instance_of_in_argpos(final SubLObject coll, final SubLObject argpos, SubLObject include_negative_assertionsP) {
        if (include_negative_assertionsP == UNPROVIDED) {
            include_negative_assertionsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject truth = (NIL != include_negative_assertionsP) ? NIL : $TRUE;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, UNPROVIDED, UNPROVIDED);
            SubLObject inst = NIL;
            inst = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != indexed_term_p(inst)) {
                    result = append(kb_mapping.gather_gaf_arg_index(inst, argpos, NIL, NIL, truth), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection of indexed-term-p's.  All instantiations must be indexed terms or this will error
     */
    @LispMethod(comment = "@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection of indexed-term-p\'s.  All instantiations must be indexed terms or this will error")
    public static final SubLObject all_assertions_mentioning_all_indexed_terms_in_set_or_coll_alt(SubLObject set_or_coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject terms = quantities.set_extent(set_or_coll, UNPROVIDED, UNPROVIDED);
                            result = virtual_indexing.assertions_mentioning_terms(terms, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection of indexed-term-p's.  All instantiations must be indexed terms or this will error
     */
    @LispMethod(comment = "@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection of indexed-term-p\'s.  All instantiations must be indexed terms or this will error")
    public static SubLObject all_assertions_mentioning_all_indexed_terms_in_set_or_coll(final SubLObject set_or_coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            final SubLObject terms = quantities.set_extent(set_or_coll, UNPROVIDED, UNPROVIDED);
            result = virtual_indexing.assertions_mentioning_terms(terms, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject all_assertions_mentioning_all_quoted_instances_of_alt(SubLObject coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject terms = isa.all_quoted_instances(coll, UNPROVIDED, UNPROVIDED);
                            result = virtual_indexing.assertions_mentioning_terms(terms, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject all_assertions_mentioning_all_quoted_instances_of(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            final SubLObject terms = isa.all_quoted_instances(coll, UNPROVIDED, UNPROVIDED);
            result = virtual_indexing.assertions_mentioning_terms(terms, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns a list of all assertions such that every indexed term mentioned in the assertion is an instantiation of SET-OR-COLL
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection of indexed-term-p's.  Any instantiation that isn't an indexed term is ignored
     */
    @LispMethod(comment = "Returns a list of all assertions such that every indexed term mentioned in the assertion is an instantiation of SET-OR-COLL\r\n\r\n@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection of indexed-term-p\'s.  Any instantiation that isn\'t an indexed term is ignored")
    public static final SubLObject all_assertions_mentioning_only_indexed_terms_in_set_or_coll_alt(SubLObject set_or_coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject candidate_assertions = com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_any_indexed_term_in_set_or_coll(set_or_coll);
                SubLObject assertions = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject cdolist_list_var = candidate_assertions;
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                {
                                    SubLObject assertion_forts = assertions_high.assertion_forts(assertion, T, T, NIL, UNPROVIDED);
                                    SubLObject failP = NIL;
                                    SubLObject rest = NIL;
                                    for (rest = assertion_forts; !((NIL != failP) || (NIL == rest)); rest = rest.rest()) {
                                        {
                                            SubLObject assertion_fort = rest.first();
                                            if (NIL == isa.instantiationP(assertion_fort, set_or_coll, UNPROVIDED)) {
                                                failP = T;
                                            }
                                        }
                                    }
                                    if (NIL == failP) {
                                        assertions = cons(assertion, assertions);
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertions;
            }
        }
    }

    /**
     * Returns a list of all assertions such that every indexed term mentioned in the assertion is an instantiation of SET-OR-COLL
     *
     * @param SET-OR-COLL
     * 		cycl-denotational-term-p: a #$SetOrCollection of indexed-term-p's.  Any instantiation that isn't an indexed term is ignored
     */
    @LispMethod(comment = "Returns a list of all assertions such that every indexed term mentioned in the assertion is an instantiation of SET-OR-COLL\r\n\r\n@param SET-OR-COLL\r\n\t\tcycl-denotational-term-p: a #$SetOrCollection of indexed-term-p\'s.  Any instantiation that isn\'t an indexed term is ignored")
    public static SubLObject all_assertions_mentioning_only_indexed_terms_in_set_or_coll(final SubLObject set_or_coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject candidate_assertions = all_assertions_mentioning_any_indexed_term_in_set_or_coll(set_or_coll);
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = candidate_assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, T, T, NIL, UNPROVIDED);
                SubLObject failP;
                SubLObject rest;
                SubLObject assertion_fort;
                for (failP = NIL, rest = NIL, rest = assertion_forts; (NIL == failP) && (NIL != rest); rest = rest.rest()) {
                    assertion_fort = rest.first();
                    if (NIL == isa.instantiationP(assertion_fort, set_or_coll, UNPROVIDED)) {
                        failP = T;
                    }
                }
                if (NIL == failP) {
                    assertions = cons(assertion, assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static final SubLObject all_assertions_mentioning_only_quoted_instances_of_alt(SubLObject coll) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject candidate_assertions = com.cyc.cycjava.cycl.butler.alchemy_export.all_assertions_mentioning_any_quoted_instance_of(coll);
                SubLObject assertions = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject cdolist_list_var = candidate_assertions;
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                {
                                    SubLObject assertion_forts = assertions_high.assertion_forts(assertion, T, T, NIL, UNPROVIDED);
                                    SubLObject failP = NIL;
                                    SubLObject rest = NIL;
                                    for (rest = assertion_forts; !((NIL != failP) || (NIL == rest)); rest = rest.rest()) {
                                        {
                                            SubLObject assertion_fort = rest.first();
                                            if (NIL == isa.quoted_isaP(assertion_fort, coll, UNPROVIDED, UNPROVIDED)) {
                                                failP = T;
                                            }
                                        }
                                    }
                                    if (NIL == failP) {
                                        assertions = cons(assertion, assertions);
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertions;
            }
        }
    }

    public static SubLObject all_assertions_mentioning_only_quoted_instances_of(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject candidate_assertions = all_assertions_mentioning_any_quoted_instance_of(coll);
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = candidate_assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, T, T, NIL, UNPROVIDED);
                SubLObject failP;
                SubLObject rest;
                SubLObject assertion_fort;
                for (failP = NIL, rest = NIL, rest = assertion_forts; (NIL == failP) && (NIL != rest); rest = rest.rest()) {
                    assertion_fort = rest.first();
                    if (NIL == isa.quoted_isaP(assertion_fort, coll, UNPROVIDED, UNPROVIDED)) {
                        failP = T;
                    }
                }
                if (NIL == failP) {
                    assertions = cons(assertion, assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    /**
     * Write out a full set of input files for an Alchemy exportation use case.  Type files are created for
     * each supplied training and evidence file, using the supplied file name with a .mln extension.
     *
     * @param RULES-CRITERION:
     * 		the criterion that an assertion must meet in order to be included in the exportation of rules
     * @param TRAINING-CRITERION:
     * 		the criterion that an assertion must meet in order to be included in the exportation
     * 		of training gafs
     * @param EVIDENCE-CRITERIA
     * 		listp: each is a criterion gating inclusion in the exportation of a set of evidence gafs
     * @param RULES-FILENAME:
     * 		the file to write the Alchemy rules and predicate declarations to
     * @param TRAINING-FILENAME:
     * 		the file to write the Alchemy training gafs to
     * @param EVIDENCE-FILENAMES:
     * 		the files to write the sets of Alchemy evidence gafs to
     * @param RULES-MAX-NUMBER:
     * 		if provided, a limit on the number of Cyc assertions to find that meet RULES-CRITERION
     * @param TRAINING-MAX-NUMBER:
     * 		if provided, a limit on the number of Cyc assertions to find that meet TRAINING-CRITERION
     * @param EVIDENCE-MAX-NUMBERS
     * 		listp: each element provided is a limit on the number of Cyc assertions to find that meet
     * 		the corresponding criterion in EVIDENCE-CRITERIA
     */
    @LispMethod(comment = "Write out a full set of input files for an Alchemy exportation use case.  Type files are created for\r\neach supplied training and evidence file, using the supplied file name with a .mln extension.\r\n\r\n@param RULES-CRITERION:\r\n\t\tthe criterion that an assertion must meet in order to be included in the exportation of rules\r\n@param TRAINING-CRITERION:\r\n\t\tthe criterion that an assertion must meet in order to be included in the exportation\r\n\t\tof training gafs\r\n@param EVIDENCE-CRITERIA\r\n\t\tlistp: each is a criterion gating inclusion in the exportation of a set of evidence gafs\r\n@param RULES-FILENAME:\r\n\t\tthe file to write the Alchemy rules and predicate declarations to\r\n@param TRAINING-FILENAME:\r\n\t\tthe file to write the Alchemy training gafs to\r\n@param EVIDENCE-FILENAMES:\r\n\t\tthe files to write the sets of Alchemy evidence gafs to\r\n@param RULES-MAX-NUMBER:\r\n\t\tif provided, a limit on the number of Cyc assertions to find that meet RULES-CRITERION\r\n@param TRAINING-MAX-NUMBER:\r\n\t\tif provided, a limit on the number of Cyc assertions to find that meet TRAINING-CRITERION\r\n@param EVIDENCE-MAX-NUMBERS\r\n\t\tlistp: each element provided is a limit on the number of Cyc assertions to find that meet\r\n\t\tthe corresponding criterion in EVIDENCE-CRITERIA\nWrite out a full set of input files for an Alchemy exportation use case.  Type files are created for\neach supplied training and evidence file, using the supplied file name with a .mln extension.")
    public static final SubLObject alchemy_export_alt(SubLObject rules_criterion, SubLObject training_criterion, SubLObject evidence_criteria, SubLObject rules_filename, SubLObject training_filename, SubLObject evidence_filenames, SubLObject rules_max_number, SubLObject training_max_number, SubLObject evidence_max_numbers) {
        if (rules_max_number == UNPROVIDED) {
            rules_max_number = NIL;
        }
        if (training_max_number == UNPROVIDED) {
            training_max_number = NIL;
        }
        if (evidence_max_numbers == UNPROVIDED) {
            evidence_max_numbers = NIL;
        }
        com.cyc.cycjava.cycl.butler.alchemy_export.check_assertion_selection_criterion(rules_criterion);
        com.cyc.cycjava.cycl.butler.alchemy_export.check_assertion_selection_criterion(training_criterion);
        {
            SubLObject cdolist_list_var = evidence_criteria;
            SubLObject evidence_criterion = NIL;
            for (evidence_criterion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , evidence_criterion = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.butler.alchemy_export.check_assertion_selection_criterion(evidence_criterion);
            }
        }
        {
            SubLObject augmented_rules_criterion = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_augment_rule_criterion(rules_criterion);
            SubLObject augmented_training_criterion = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_augment_gaf_criterion(training_criterion);
            SubLObject augmented_evidence_criteria = NIL;
            SubLObject time = NIL;
            SubLObject time_var = get_internal_real_time();
            {
                SubLObject cdolist_list_var = evidence_criteria;
                SubLObject evidence_criterion = NIL;
                for (evidence_criterion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , evidence_criterion = cdolist_list_var.first()) {
                    augmented_evidence_criteria = cons(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_augment_gaf_criterion(evidence_criterion), augmented_evidence_criteria);
                }
            }
            augmented_evidence_criteria = nreverse(augmented_evidence_criteria);
            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_int(augmented_rules_criterion, augmented_training_criterion, augmented_evidence_criteria, rules_filename, training_filename, evidence_filenames, rules_max_number, training_max_number, evidence_max_numbers);
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            format(T, $str_alt82$_5D_seconds_duration__, round(time, UNPROVIDED));
        }
        return NIL;
    }

    /**
     * Write out a full set of input files for an Alchemy exportation use case.  Type files are created for
     * each supplied training and evidence file, using the supplied file name with a .mln extension.
     *
     * @param RULES-CRITERION:
     * 		the criterion that an assertion must meet in order to be included in the exportation of rules
     * @param TRAINING-CRITERION:
     * 		the criterion that an assertion must meet in order to be included in the exportation
     * 		of training gafs
     * @param EVIDENCE-CRITERIA
     * 		listp: each is a criterion gating inclusion in the exportation of a set of evidence gafs
     * @param RULES-FILENAME:
     * 		the file to write the Alchemy rules and predicate declarations to
     * @param TRAINING-FILENAME:
     * 		the file to write the Alchemy training gafs to
     * @param EVIDENCE-FILENAMES:
     * 		the files to write the sets of Alchemy evidence gafs to
     * @param RULES-MAX-NUMBER:
     * 		if provided, a limit on the number of Cyc assertions to find that meet RULES-CRITERION
     * @param TRAINING-MAX-NUMBER:
     * 		if provided, a limit on the number of Cyc assertions to find that meet TRAINING-CRITERION
     * @param EVIDENCE-MAX-NUMBERS
     * 		listp: each element provided is a limit on the number of Cyc assertions to find that meet
     * 		the corresponding criterion in EVIDENCE-CRITERIA
     */
    @LispMethod(comment = "Write out a full set of input files for an Alchemy exportation use case.  Type files are created for\r\neach supplied training and evidence file, using the supplied file name with a .mln extension.\r\n\r\n@param RULES-CRITERION:\r\n\t\tthe criterion that an assertion must meet in order to be included in the exportation of rules\r\n@param TRAINING-CRITERION:\r\n\t\tthe criterion that an assertion must meet in order to be included in the exportation\r\n\t\tof training gafs\r\n@param EVIDENCE-CRITERIA\r\n\t\tlistp: each is a criterion gating inclusion in the exportation of a set of evidence gafs\r\n@param RULES-FILENAME:\r\n\t\tthe file to write the Alchemy rules and predicate declarations to\r\n@param TRAINING-FILENAME:\r\n\t\tthe file to write the Alchemy training gafs to\r\n@param EVIDENCE-FILENAMES:\r\n\t\tthe files to write the sets of Alchemy evidence gafs to\r\n@param RULES-MAX-NUMBER:\r\n\t\tif provided, a limit on the number of Cyc assertions to find that meet RULES-CRITERION\r\n@param TRAINING-MAX-NUMBER:\r\n\t\tif provided, a limit on the number of Cyc assertions to find that meet TRAINING-CRITERION\r\n@param EVIDENCE-MAX-NUMBERS\r\n\t\tlistp: each element provided is a limit on the number of Cyc assertions to find that meet\r\n\t\tthe corresponding criterion in EVIDENCE-CRITERIA\nWrite out a full set of input files for an Alchemy exportation use case.  Type files are created for\neach supplied training and evidence file, using the supplied file name with a .mln extension.")
    public static SubLObject alchemy_export(final SubLObject rules_criterion, final SubLObject training_criterion, final SubLObject evidence_criteria, final SubLObject rules_filename, final SubLObject training_filename, final SubLObject evidence_filenames, SubLObject rules_max_number, SubLObject training_max_number, SubLObject evidence_max_numbers) {
        if (rules_max_number == UNPROVIDED) {
            rules_max_number = NIL;
        }
        if (training_max_number == UNPROVIDED) {
            training_max_number = NIL;
        }
        if (evidence_max_numbers == UNPROVIDED) {
            evidence_max_numbers = NIL;
        }
        check_assertion_selection_criterion(rules_criterion);
        check_assertion_selection_criterion(training_criterion);
        SubLObject cdolist_list_var = evidence_criteria;
        SubLObject evidence_criterion = NIL;
        evidence_criterion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            check_assertion_selection_criterion(evidence_criterion);
            cdolist_list_var = cdolist_list_var.rest();
            evidence_criterion = cdolist_list_var.first();
        } 
        final SubLObject augmented_rules_criterion = alchemy_export_augment_rule_criterion(rules_criterion);
        final SubLObject augmented_training_criterion = alchemy_export_augment_gaf_criterion(training_criterion);
        SubLObject augmented_evidence_criteria = NIL;
        SubLObject time = NIL;
        final SubLObject time_var = get_internal_real_time();
        SubLObject cdolist_list_var2 = evidence_criteria;
        SubLObject evidence_criterion2 = NIL;
        evidence_criterion2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            augmented_evidence_criteria = cons(alchemy_export_augment_gaf_criterion(evidence_criterion2), augmented_evidence_criteria);
            cdolist_list_var2 = cdolist_list_var2.rest();
            evidence_criterion2 = cdolist_list_var2.first();
        } 
        augmented_evidence_criteria = nreverse(augmented_evidence_criteria);
        alchemy_export_int(augmented_rules_criterion, augmented_training_criterion, augmented_evidence_criteria, rules_filename, training_filename, evidence_filenames, rules_max_number, training_max_number, evidence_max_numbers);
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        format(T, $str82$_5D_seconds_duration__, round(time, UNPROVIDED));
        return NIL;
    }

    /**
     * Write out a full set of input files for an Alchemy exportation use case.  Type files are created for
     * each supplied training and evidence file, using the supplied file name with a .mln extension.
     *
     * @param RULES-CRITERION:
     * 		the criterion that an assertion must meet in order to be included in the exportation of rules
     * @param TRAINING-CRITERION:
     * 		the criterion that an assertion must meet in order to be included in the exportation
     * 		of training gafs
     * @param EVIDENCE-CRITERIA
     * 		listp: each is a criterion gating inclusion in the exportation of a set of evidence gafs
     * @param RULES-FILENAME:
     * 		the file to write the Alchemy rules and predicate declarations to
     * @param TRAINING-FILENAME:
     * 		the file to write the Alchemy training gafs to
     * @param EVIDENCE-FILENAMES:
     * 		the files to write the sets of Alchemy evidence gafs to
     * @param RULES-MAX-NUMBER:
     * 		if provided, a limit on the number of Cyc assertions to find that meet RULES-CRITERION
     * @param TRAINING-MAX-NUMBER:
     * 		if provided, a limit on the number of Cyc assertions to find that meet TRAINING-CRITERION
     * @param EVIDENCE-MAX-NUMBERS
     * 		listp: each element provided is a limit on the number of Cyc assertions to find that meet
     * 		the corresponding criterion in EVIDENCE-CRITERIA
     */
    @LispMethod(comment = "Write out a full set of input files for an Alchemy exportation use case.  Type files are created for\r\neach supplied training and evidence file, using the supplied file name with a .mln extension.\r\n\r\n@param RULES-CRITERION:\r\n\t\tthe criterion that an assertion must meet in order to be included in the exportation of rules\r\n@param TRAINING-CRITERION:\r\n\t\tthe criterion that an assertion must meet in order to be included in the exportation\r\n\t\tof training gafs\r\n@param EVIDENCE-CRITERIA\r\n\t\tlistp: each is a criterion gating inclusion in the exportation of a set of evidence gafs\r\n@param RULES-FILENAME:\r\n\t\tthe file to write the Alchemy rules and predicate declarations to\r\n@param TRAINING-FILENAME:\r\n\t\tthe file to write the Alchemy training gafs to\r\n@param EVIDENCE-FILENAMES:\r\n\t\tthe files to write the sets of Alchemy evidence gafs to\r\n@param RULES-MAX-NUMBER:\r\n\t\tif provided, a limit on the number of Cyc assertions to find that meet RULES-CRITERION\r\n@param TRAINING-MAX-NUMBER:\r\n\t\tif provided, a limit on the number of Cyc assertions to find that meet TRAINING-CRITERION\r\n@param EVIDENCE-MAX-NUMBERS\r\n\t\tlistp: each element provided is a limit on the number of Cyc assertions to find that meet\r\n\t\tthe corresponding criterion in EVIDENCE-CRITERIA\nWrite out a full set of input files for an Alchemy exportation use case.  Type files are created for\neach supplied training and evidence file, using the supplied file name with a .mln extension.")
    public static final SubLObject alchemy_export_int_alt(SubLObject rules_criterion, SubLObject training_criterion, SubLObject evidence_criteria, SubLObject rules_filename, SubLObject training_filename, SubLObject evidence_filenames, SubLObject rules_max_number, SubLObject training_max_number, SubLObject evidence_max_numbers) {
        if (rules_max_number == UNPROVIDED) {
            rules_max_number = NIL;
        }
        if (training_max_number == UNPROVIDED) {
            training_max_number = NIL;
        }
        if (evidence_max_numbers == UNPROVIDED) {
            evidence_max_numbers = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(rules_filename, STRINGP);
            SubLTrampolineFile.checkType(training_filename, STRINGP);
            {
                SubLObject list_var = evidence_filenames;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, STRINGP);
                    }
                }
            }
            if (NIL != rules_max_number) {
                SubLTrampolineFile.checkType(rules_max_number, POSITIVE_INTEGER_P);
            }
            if (NIL != training_max_number) {
                SubLTrampolineFile.checkType(training_max_number, POSITIVE_INTEGER_P);
            }
            {
                SubLObject list_var = evidence_max_numbers;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, POSITIVE_INTEGER_P);
                    }
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.lengthE(evidence_filenames, length(evidence_criteria), UNPROVIDED)) {
                    Errors.error($str_alt84$_S_and__S_are_not_lists_of_the_sa, evidence_criteria, evidence_filenames);
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject training_gafs = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_gather_training_rules_and_gafs(training_criterion, training_max_number, rules_criterion, rules_max_number);
                SubLObject training_rules = thread.secondMultipleValue();
                SubLObject training_type_dictionary = thread.thirdMultipleValue();
                SubLObject number_of_training_terms = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject evidence_gaf_lists = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_gather_evidence_gaf_lists(evidence_criteria, evidence_max_numbers);
                    SubLObject evidence_type_dictionaries = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject allowed_types = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_allowed_types(training_type_dictionary, evidence_type_dictionaries);
                        SubLObject training_gafs_analysis = NIL;
                        SubLObject training_fol_predicates = NIL;
                        SubLObject evidence_gafs_analyses = NIL;
                        {
                            SubLObject _prev_bind_0 = $ae_number_of_sentences$.currentBinding(thread);
                            try {
                                $ae_number_of_sentences$.bind(ZERO_INTEGER, thread);
                                {
                                    SubLObject number_of_training_gafs = NIL;
                                    SubLObject number_of_training_rules = NIL;
                                    {
                                        SubLObject _prev_bind_0_64 = $ae_number_of_training_predicates$.currentBinding(thread);
                                        try {
                                            $ae_number_of_training_predicates$.bind(ZERO_INTEGER, thread);
                                            {
                                                SubLObject number_of_evidence_gafs = NIL;
                                                {
                                                    SubLObject _prev_bind_0_65 = $ae_number_of_evidence_terms$.currentBinding(thread);
                                                    try {
                                                        $ae_number_of_evidence_terms$.bind(ZERO_INTEGER, thread);
                                                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_dictionary(training_type_dictionary, allowed_types);
                                                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_types_file(training_type_dictionary, training_filename);
                                                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_dictionaries(evidence_type_dictionaries, allowed_types);
                                                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_files(evidence_type_dictionaries, evidence_filenames);
                                                        training_gafs = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_gafs(training_gafs, allowed_types);
                                                        $ae_number_of_sentences$.setDynamicValue(ZERO_INTEGER, thread);
                                                        training_gafs_analysis = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_gaf_file(training_gafs, training_filename);
                                                        number_of_training_gafs = $ae_number_of_sentences$.getDynamicValue(thread);
                                                        training_rules = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_rules(training_rules, allowed_types);
                                                        training_fol_predicates = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_training_fol_predicates(training_rules, training_gafs_analysis);
                                                        evidence_gaf_lists = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_gaf_lists(evidence_gaf_lists, allowed_types, training_fol_predicates);
                                                        $ae_number_of_sentences$.setDynamicValue(ZERO_INTEGER, thread);
                                                        evidence_gafs_analyses = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_gaf_files(evidence_gaf_lists, evidence_filenames);
                                                        number_of_evidence_gafs = $ae_number_of_sentences$.getDynamicValue(thread);
                                                        $ae_number_of_sentences$.setDynamicValue(ZERO_INTEGER, thread);
                                                        com.cyc.cycjava.cycl.butler.alchemy_export.ae_filter_and_export_rule_file(training_rules, rules_filename, training_gafs_analysis, evidence_gafs_analyses, allowed_types, training_type_dictionary);
                                                        number_of_training_rules = $ae_number_of_sentences$.getDynamicValue(thread);
                                                        format(T, $str_alt85$_____5D_training_gafs__, number_of_training_gafs);
                                                        format(T, $str_alt86$_5D_training_terms__, number_of_training_terms);
                                                        format(T, $str_alt87$_5D_training_rules__, number_of_training_rules);
                                                        format(T, $str_alt88$_5D_training_predicates__, $ae_number_of_training_predicates$.getDynamicValue(thread));
                                                        format(T, $str_alt89$_5D_evidence_gafs__, number_of_evidence_gafs);
                                                        format(T, $str_alt90$_5D_evidence_terms__, $ae_number_of_evidence_terms$.getDynamicValue(thread));
                                                        format(T, $str_alt91$_5D_types__, set.set_size(allowed_types));
                                                    } finally {
                                                        $ae_number_of_evidence_terms$.rebind(_prev_bind_0_65, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            $ae_number_of_training_predicates$.rebind(_prev_bind_0_64, thread);
                                        }
                                    }
                                }
                            } finally {
                                $ae_number_of_sentences$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Write out a full set of input files for an Alchemy exportation use case.  Type files are created for
     * each supplied training and evidence file, using the supplied file name with a .mln extension.
     *
     * @param RULES-CRITERION:
     * 		the criterion that an assertion must meet in order to be included in the exportation of rules
     * @param TRAINING-CRITERION:
     * 		the criterion that an assertion must meet in order to be included in the exportation
     * 		of training gafs
     * @param EVIDENCE-CRITERIA
     * 		listp: each is a criterion gating inclusion in the exportation of a set of evidence gafs
     * @param RULES-FILENAME:
     * 		the file to write the Alchemy rules and predicate declarations to
     * @param TRAINING-FILENAME:
     * 		the file to write the Alchemy training gafs to
     * @param EVIDENCE-FILENAMES:
     * 		the files to write the sets of Alchemy evidence gafs to
     * @param RULES-MAX-NUMBER:
     * 		if provided, a limit on the number of Cyc assertions to find that meet RULES-CRITERION
     * @param TRAINING-MAX-NUMBER:
     * 		if provided, a limit on the number of Cyc assertions to find that meet TRAINING-CRITERION
     * @param EVIDENCE-MAX-NUMBERS
     * 		listp: each element provided is a limit on the number of Cyc assertions to find that meet
     * 		the corresponding criterion in EVIDENCE-CRITERIA
     */
    @LispMethod(comment = "Write out a full set of input files for an Alchemy exportation use case.  Type files are created for\r\neach supplied training and evidence file, using the supplied file name with a .mln extension.\r\n\r\n@param RULES-CRITERION:\r\n\t\tthe criterion that an assertion must meet in order to be included in the exportation of rules\r\n@param TRAINING-CRITERION:\r\n\t\tthe criterion that an assertion must meet in order to be included in the exportation\r\n\t\tof training gafs\r\n@param EVIDENCE-CRITERIA\r\n\t\tlistp: each is a criterion gating inclusion in the exportation of a set of evidence gafs\r\n@param RULES-FILENAME:\r\n\t\tthe file to write the Alchemy rules and predicate declarations to\r\n@param TRAINING-FILENAME:\r\n\t\tthe file to write the Alchemy training gafs to\r\n@param EVIDENCE-FILENAMES:\r\n\t\tthe files to write the sets of Alchemy evidence gafs to\r\n@param RULES-MAX-NUMBER:\r\n\t\tif provided, a limit on the number of Cyc assertions to find that meet RULES-CRITERION\r\n@param TRAINING-MAX-NUMBER:\r\n\t\tif provided, a limit on the number of Cyc assertions to find that meet TRAINING-CRITERION\r\n@param EVIDENCE-MAX-NUMBERS\r\n\t\tlistp: each element provided is a limit on the number of Cyc assertions to find that meet\r\n\t\tthe corresponding criterion in EVIDENCE-CRITERIA\nWrite out a full set of input files for an Alchemy exportation use case.  Type files are created for\neach supplied training and evidence file, using the supplied file name with a .mln extension.")
    public static SubLObject alchemy_export_int(final SubLObject rules_criterion, final SubLObject training_criterion, final SubLObject evidence_criteria, final SubLObject rules_filename, final SubLObject training_filename, final SubLObject evidence_filenames, SubLObject rules_max_number, SubLObject training_max_number, SubLObject evidence_max_numbers) {
        if (rules_max_number == UNPROVIDED) {
            rules_max_number = NIL;
        }
        if (training_max_number == UNPROVIDED) {
            training_max_number = NIL;
        }
        if (evidence_max_numbers == UNPROVIDED) {
            evidence_max_numbers = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(rules_filename) : "! stringp(rules_filename) " + ("Types.stringp(rules_filename) " + "CommonSymbols.NIL != Types.stringp(rules_filename) ") + rules_filename;
        assert NIL != stringp(training_filename) : "! stringp(training_filename) " + ("Types.stringp(training_filename) " + "CommonSymbols.NIL != Types.stringp(training_filename) ") + training_filename;
        assert NIL != list_utilities.non_dotted_list_p(evidence_filenames) : "! list_utilities.non_dotted_list_p(evidence_filenames) " + ("list_utilities.non_dotted_list_p(evidence_filenames) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(evidence_filenames) ") + evidence_filenames;
        SubLObject cdolist_list_var = evidence_filenames;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (((NIL != rules_max_number) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(rules_max_number))) {
            throw new AssertionError(rules_max_number);
        }
        if (((NIL != training_max_number) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(training_max_number))) {
            throw new AssertionError(training_max_number);
        }
        final SubLObject list_var = evidence_max_numbers;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        cdolist_list_var = list_var;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != subl_promotions.positive_integer_p(elem) : "! subl_promotions.positive_integer_p(elem) " + ("subl_promotions.positive_integer_p(elem) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthE(evidence_filenames, length(evidence_criteria), UNPROVIDED))) {
            Errors.error($str84$_S_and__S_are_not_lists_of_the_sa, evidence_criteria, evidence_filenames);
        }
        thread.resetMultipleValues();
        SubLObject training_gafs = alchemy_export_gather_training_rules_and_gafs(training_criterion, training_max_number, rules_criterion, rules_max_number);
        SubLObject training_rules = thread.secondMultipleValue();
        final SubLObject training_type_dictionary = thread.thirdMultipleValue();
        final SubLObject number_of_training_terms = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject evidence_gaf_lists = alchemy_export_gather_evidence_gaf_lists(evidence_criteria, evidence_max_numbers);
        final SubLObject evidence_type_dictionaries = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject allowed_types = alchemy_export_allowed_types(training_type_dictionary, evidence_type_dictionaries);
        SubLObject training_gafs_analysis = NIL;
        SubLObject training_fol_predicates = NIL;
        SubLObject evidence_gafs_analyses = NIL;
        final SubLObject _prev_bind_0 = $ae_number_of_sentences$.currentBinding(thread);
        try {
            $ae_number_of_sentences$.bind(ZERO_INTEGER, thread);
            SubLObject number_of_training_gafs = NIL;
            SubLObject number_of_training_rules = NIL;
            final SubLObject _prev_bind_0_$70 = $ae_number_of_training_predicates$.currentBinding(thread);
            try {
                $ae_number_of_training_predicates$.bind(ZERO_INTEGER, thread);
                SubLObject number_of_evidence_gafs = NIL;
                final SubLObject _prev_bind_0_$71 = $ae_number_of_evidence_terms$.currentBinding(thread);
                try {
                    $ae_number_of_evidence_terms$.bind(ZERO_INTEGER, thread);
                    alchemy_export_filter_dictionary(training_type_dictionary, allowed_types);
                    alchemy_export_types_file(training_type_dictionary, training_filename);
                    alchemy_export_filter_dictionaries(evidence_type_dictionaries, allowed_types);
                    alchemy_export_type_files(evidence_type_dictionaries, evidence_filenames);
                    training_gafs = alchemy_export_filter_gafs(training_gafs, allowed_types);
                    $ae_number_of_sentences$.setDynamicValue(ZERO_INTEGER, thread);
                    training_gafs_analysis = alchemy_export_gaf_file(training_gafs, training_filename);
                    number_of_training_gafs = $ae_number_of_sentences$.getDynamicValue(thread);
                    training_rules = alchemy_export_filter_rules(training_rules, allowed_types);
                    training_fol_predicates = alchemy_export_training_fol_predicates(training_rules, training_gafs_analysis);
                    evidence_gaf_lists = alchemy_export_filter_gaf_lists(evidence_gaf_lists, allowed_types, training_fol_predicates);
                    $ae_number_of_sentences$.setDynamicValue(ZERO_INTEGER, thread);
                    evidence_gafs_analyses = alchemy_export_gaf_files(evidence_gaf_lists, evidence_filenames);
                    number_of_evidence_gafs = $ae_number_of_sentences$.getDynamicValue(thread);
                    $ae_number_of_sentences$.setDynamicValue(ZERO_INTEGER, thread);
                    ae_filter_and_export_rule_file(training_rules, rules_filename, training_gafs_analysis, evidence_gafs_analyses, allowed_types, training_type_dictionary);
                    number_of_training_rules = $ae_number_of_sentences$.getDynamicValue(thread);
                    format(T, $str85$_____5D_training_gafs__, number_of_training_gafs);
                    format(T, $str86$_5D_training_terms__, number_of_training_terms);
                    format(T, $str87$_5D_training_rules__, number_of_training_rules);
                    format(T, $str88$_5D_training_predicates__, $ae_number_of_training_predicates$.getDynamicValue(thread));
                    format(T, $str89$_5D_evidence_gafs__, number_of_evidence_gafs);
                    format(T, $str90$_5D_evidence_terms__, $ae_number_of_evidence_terms$.getDynamicValue(thread));
                    format(T, $str91$_5D_types__, set.set_size(allowed_types));
                } finally {
                    $ae_number_of_evidence_terms$.rebind(_prev_bind_0_$71, thread);
                }
            } finally {
                $ae_number_of_training_predicates$.rebind(_prev_bind_0_$70, thread);
            }
        } finally {
            $ae_number_of_sentences$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Return the list of training gafs, the list of training rules, and the training type
     * dictionary after gathering them according to the given TRAINING-CRITERION, TRAINING-MAX-NUMBER,
     * RULES-CRITERION and RULES-MAX-NUMBER.
     */
    @LispMethod(comment = "Return the list of training gafs, the list of training rules, and the training type\r\ndictionary after gathering them according to the given TRAINING-CRITERION, TRAINING-MAX-NUMBER,\r\nRULES-CRITERION and RULES-MAX-NUMBER.\nReturn the list of training gafs, the list of training rules, and the training type\ndictionary after gathering them according to the given TRAINING-CRITERION, TRAINING-MAX-NUMBER,\nRULES-CRITERION and RULES-MAX-NUMBER.")
    public static final SubLObject alchemy_export_gather_training_rules_and_gafs_alt(SubLObject training_criterion, SubLObject training_max_number, SubLObject rules_criterion, SubLObject rules_max_number) {
        SubLTrampolineFile.checkType(training_criterion, CONSP);
        if (NIL != training_max_number) {
            SubLTrampolineFile.checkType(training_max_number, INTEGERP);
        }
        SubLTrampolineFile.checkType(rules_criterion, CONSP);
        if (NIL != rules_max_number) {
            SubLTrampolineFile.checkType(rules_max_number, INTEGERP);
        }
        {
            SubLObject training_gafs = NIL;
            SubLObject training_rules = NIL;
            SubLObject training_type_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject training_term_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            format(T, $str_alt94$Finding_Alchemy_export_assertions);
            force_output(UNPROVIDED);
            training_gafs = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_numeric_term_filter(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_assertions_acceptable_for_fol(com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_by_criterion_no_checks(training_criterion, training_max_number)));
            {
                SubLObject cdolist_list_var = training_gafs;
                SubLObject training_gaf = NIL;
                for (training_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , training_gaf = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_add_types(training_gaf, training_type_dictionary, training_term_set);
                    format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_formula(training_gaf), UNPROVIDED, UNPROVIDED);
                    terpri(UNPROVIDED);
                    force_output(UNPROVIDED);
                }
            }
            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_augment_instances_in_type_dictionary(training_type_dictionary, training_term_set);
            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_display_types(training_type_dictionary, $$$training_gafs);
            training_gafs = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_training_isa_gafs(training_gafs, training_type_dictionary, training_term_set);
            format(T, $str_alt96$__Finding_Alchemy_export_assertio);
            force_output(UNPROVIDED);
            training_rules = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_numeric_term_filter(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_rules_by_allowed_types(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_assertions_acceptable_for_fol(com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_by_criterion_no_checks(rules_criterion, rules_max_number)), training_type_dictionary, training_term_set));
            {
                SubLObject cdolist_list_var = training_rules;
                SubLObject training_rule = NIL;
                for (training_rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , training_rule = cdolist_list_var.first()) {
                    format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_formula(training_rule), UNPROVIDED, UNPROVIDED);
                    terpri(UNPROVIDED);
                    force_output(UNPROVIDED);
                }
            }
            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_display_types(training_type_dictionary, $$$training_rules);
            return values(training_gafs, training_rules, training_type_dictionary, set.set_size(training_term_set));
        }
    }

    /**
     * Return the list of training gafs, the list of training rules, and the training type
     * dictionary after gathering them according to the given TRAINING-CRITERION, TRAINING-MAX-NUMBER,
     * RULES-CRITERION and RULES-MAX-NUMBER.
     */
    @LispMethod(comment = "Return the list of training gafs, the list of training rules, and the training type\r\ndictionary after gathering them according to the given TRAINING-CRITERION, TRAINING-MAX-NUMBER,\r\nRULES-CRITERION and RULES-MAX-NUMBER.\nReturn the list of training gafs, the list of training rules, and the training type\ndictionary after gathering them according to the given TRAINING-CRITERION, TRAINING-MAX-NUMBER,\nRULES-CRITERION and RULES-MAX-NUMBER.")
    public static SubLObject alchemy_export_gather_training_rules_and_gafs(final SubLObject training_criterion, final SubLObject training_max_number, final SubLObject rules_criterion, final SubLObject rules_max_number) {
        assert NIL != consp(training_criterion) : "! consp(training_criterion) " + ("Types.consp(training_criterion) " + "CommonSymbols.NIL != Types.consp(training_criterion) ") + training_criterion;
        if (((NIL != training_max_number) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(training_max_number))) {
            throw new AssertionError(training_max_number);
        }
        assert NIL != consp(rules_criterion) : "! consp(rules_criterion) " + ("Types.consp(rules_criterion) " + "CommonSymbols.NIL != Types.consp(rules_criterion) ") + rules_criterion;
        if (((NIL != rules_max_number) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(rules_max_number))) {
            throw new AssertionError(rules_max_number);
        }
        SubLObject training_gafs = NIL;
        SubLObject training_rules = NIL;
        final SubLObject training_type_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject training_term_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        format(T, $str94$Finding_Alchemy_export_assertions);
        force_output(UNPROVIDED);
        SubLObject cdolist_list_var;
        training_gafs = cdolist_list_var = alchemy_export_numeric_term_filter(alchemy_export_filter_assertions_acceptable_for_fol(find_assertions_by_criterion_no_checks(training_criterion, training_max_number)));
        SubLObject training_gaf = NIL;
        training_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            alchemy_export_add_types(training_gaf, training_type_dictionary, training_term_set);
            format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_formula(training_gaf), UNPROVIDED, UNPROVIDED);
            terpri(UNPROVIDED);
            force_output(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            training_gaf = cdolist_list_var.first();
        } 
        alchemy_export_augment_instances_in_type_dictionary(training_type_dictionary, training_term_set);
        alchemy_export_display_types(training_type_dictionary, $$$training_gafs);
        training_gafs = alchemy_export_filter_training_isa_gafs(training_gafs, training_type_dictionary, training_term_set);
        format(T, $str96$__Finding_Alchemy_export_assertio);
        force_output(UNPROVIDED);
        training_rules = cdolist_list_var = alchemy_export_numeric_term_filter(alchemy_export_filter_rules_by_allowed_types(alchemy_export_filter_assertions_acceptable_for_fol(find_assertions_by_criterion_no_checks(rules_criterion, rules_max_number)), training_type_dictionary, training_term_set));
        SubLObject training_rule = NIL;
        training_rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_formula(training_rule), UNPROVIDED, UNPROVIDED);
            terpri(UNPROVIDED);
            force_output(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            training_rule = cdolist_list_var.first();
        } 
        alchemy_export_display_types(training_type_dictionary, $$$training_rules);
        return values(training_gafs, training_rules, training_type_dictionary, set.set_size(training_term_set));
    }

    /**
     * Return the EVIDENCE-GAF-LISTS and EVIDENCE-TYPE-DICTIONARIES after gathering them accoring to
     * the given EVIDENCE-CRITERIA and constrained by the list of corresponding EVIDENCE-MAX-NUMBERS.
     */
    @LispMethod(comment = "Return the EVIDENCE-GAF-LISTS and EVIDENCE-TYPE-DICTIONARIES after gathering them accoring to\r\nthe given EVIDENCE-CRITERIA and constrained by the list of corresponding EVIDENCE-MAX-NUMBERS.\nReturn the EVIDENCE-GAF-LISTS and EVIDENCE-TYPE-DICTIONARIES after gathering them accoring to\nthe given EVIDENCE-CRITERIA and constrained by the list of corresponding EVIDENCE-MAX-NUMBERS.")
    public static final SubLObject alchemy_export_gather_evidence_gaf_lists_alt(SubLObject evidence_criteria, SubLObject evidence_max_numbers) {
        SubLTrampolineFile.checkType(evidence_criteria, CONSP);
        SubLTrampolineFile.checkType(evidence_max_numbers, LISTP);
        {
            SubLObject evidence_gaf_lists = NIL;
            SubLObject evidence_type_dictionaries = NIL;
            format(T, $str_alt99$__Finding_Alchemy_export_assertio);
            force_output(UNPROVIDED);
            {
                SubLObject evidence_criterion = NIL;
                SubLObject evidence_criterion_66 = NIL;
                SubLObject evidence_max_number = NIL;
                SubLObject evidence_max_number_67 = NIL;
                for (evidence_criterion = evidence_criteria, evidence_criterion_66 = evidence_criterion.first(), evidence_max_number = evidence_max_numbers, evidence_max_number_67 = evidence_max_number.first(); !((NIL == evidence_max_number) && (NIL == evidence_criterion)); evidence_criterion = evidence_criterion.rest() , evidence_criterion_66 = evidence_criterion.first() , evidence_max_number = evidence_max_number.rest() , evidence_max_number_67 = evidence_max_number.first()) {
                    {
                        SubLObject evidence_gafs = NIL;
                        SubLObject evidence_type_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                        SubLObject evidence_term_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                        evidence_gafs = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_numeric_term_filter(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_assertions_acceptable_for_fol(com.cyc.cycjava.cycl.butler.alchemy_export.find_assertions_by_criterion_no_checks(evidence_criterion_66, evidence_max_number_67)));
                        {
                            SubLObject cdolist_list_var = evidence_gafs;
                            SubLObject evidence_gaf = NIL;
                            for (evidence_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , evidence_gaf = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_add_types(evidence_gaf, evidence_type_dictionary, evidence_term_set);
                                format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_formula(evidence_gaf), UNPROVIDED, UNPROVIDED);
                                terpri(UNPROVIDED);
                            }
                        }
                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_augment_instances_in_type_dictionary(evidence_type_dictionary, evidence_term_set);
                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_display_types(evidence_type_dictionary, $$$evidence_gafs);
                        evidence_gaf_lists = cons(evidence_gafs, evidence_gaf_lists);
                        evidence_type_dictionaries = cons(evidence_type_dictionary, evidence_type_dictionaries);
                    }
                }
            }
            evidence_gaf_lists = nreverse(evidence_gaf_lists);
            evidence_type_dictionaries = nreverse(evidence_type_dictionaries);
            return values(evidence_gaf_lists, evidence_type_dictionaries);
        }
    }

    /**
     * Return the EVIDENCE-GAF-LISTS and EVIDENCE-TYPE-DICTIONARIES after gathering them accoring to
     * the given EVIDENCE-CRITERIA and constrained by the list of corresponding EVIDENCE-MAX-NUMBERS.
     */
    @LispMethod(comment = "Return the EVIDENCE-GAF-LISTS and EVIDENCE-TYPE-DICTIONARIES after gathering them accoring to\r\nthe given EVIDENCE-CRITERIA and constrained by the list of corresponding EVIDENCE-MAX-NUMBERS.\nReturn the EVIDENCE-GAF-LISTS and EVIDENCE-TYPE-DICTIONARIES after gathering them accoring to\nthe given EVIDENCE-CRITERIA and constrained by the list of corresponding EVIDENCE-MAX-NUMBERS.")
    public static SubLObject alchemy_export_gather_evidence_gaf_lists(final SubLObject evidence_criteria, final SubLObject evidence_max_numbers) {
        assert NIL != consp(evidence_criteria) : "! consp(evidence_criteria) " + ("Types.consp(evidence_criteria) " + "CommonSymbols.NIL != Types.consp(evidence_criteria) ") + evidence_criteria;
        assert NIL != listp(evidence_max_numbers) : "! listp(evidence_max_numbers) " + ("Types.listp(evidence_max_numbers) " + "CommonSymbols.NIL != Types.listp(evidence_max_numbers) ") + evidence_max_numbers;
        SubLObject evidence_gaf_lists = NIL;
        SubLObject evidence_type_dictionaries = NIL;
        format(T, $str99$__Finding_Alchemy_export_assertio);
        force_output(UNPROVIDED);
        SubLObject evidence_criterion = NIL;
        SubLObject evidence_criterion_$72 = NIL;
        SubLObject evidence_max_number = NIL;
        SubLObject evidence_max_number_$73 = NIL;
        evidence_criterion = evidence_criteria;
        evidence_criterion_$72 = evidence_criterion.first();
        evidence_max_number = evidence_max_numbers;
        evidence_max_number_$73 = evidence_max_number.first();
        while ((NIL != evidence_max_number) || (NIL != evidence_criterion)) {
            SubLObject evidence_gafs = NIL;
            final SubLObject evidence_type_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            final SubLObject evidence_term_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var;
            evidence_gafs = cdolist_list_var = alchemy_export_numeric_term_filter(alchemy_export_filter_assertions_acceptable_for_fol(find_assertions_by_criterion_no_checks(evidence_criterion_$72, evidence_max_number_$73)));
            SubLObject evidence_gaf = NIL;
            evidence_gaf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                alchemy_export_add_types(evidence_gaf, evidence_type_dictionary, evidence_term_set);
                format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_formula(evidence_gaf), UNPROVIDED, UNPROVIDED);
                terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                evidence_gaf = cdolist_list_var.first();
            } 
            alchemy_export_augment_instances_in_type_dictionary(evidence_type_dictionary, evidence_term_set);
            alchemy_export_display_types(evidence_type_dictionary, $$$evidence_gafs);
            evidence_gaf_lists = cons(evidence_gafs, evidence_gaf_lists);
            evidence_type_dictionaries = cons(evidence_type_dictionary, evidence_type_dictionaries);
            evidence_criterion = evidence_criterion.rest();
            evidence_criterion_$72 = evidence_criterion.first();
            evidence_max_number = evidence_max_number.rest();
            evidence_max_number_$73 = evidence_max_number.first();
        } 
        evidence_gaf_lists = nreverse(evidence_gaf_lists);
        evidence_type_dictionaries = nreverse(evidence_type_dictionaries);
        return values(evidence_gaf_lists, evidence_type_dictionaries);
    }

    /**
     * Return a set of allowed types which is the intersection with respect to keys of the given
     * TRAINING-TYPE-DICTIONARY and the given list of EVIDENCE-TYPE-DICTIONARIES.
     */
    @LispMethod(comment = "Return a set of allowed types which is the intersection with respect to keys of the given\r\nTRAINING-TYPE-DICTIONARY and the given list of EVIDENCE-TYPE-DICTIONARIES.\nReturn a set of allowed types which is the intersection with respect to keys of the given\nTRAINING-TYPE-DICTIONARY and the given list of EVIDENCE-TYPE-DICTIONARIES.")
    public static final SubLObject alchemy_export_allowed_types_alt(SubLObject training_type_dictionary, SubLObject evidence_type_dictionaries) {
        SubLTrampolineFile.checkType(training_type_dictionary, DICTIONARY_P);
        {
            SubLObject list_var = evidence_type_dictionaries;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, DICTIONARY_P);
                }
            }
        }
        {
            SubLObject allowed_types = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            SubLObject allowed_typeP = NIL;
            SubLObject cdolist_list_var = dictionary.dictionary_keys(training_type_dictionary);
            SubLObject training_type = NIL;
            for (training_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , training_type = cdolist_list_var.first()) {
                allowed_typeP = T;
                {
                    SubLObject cdolist_list_var_68 = evidence_type_dictionaries;
                    SubLObject evidence_type_dictionary = NIL;
                    for (evidence_type_dictionary = cdolist_list_var_68.first(); NIL != cdolist_list_var_68; cdolist_list_var_68 = cdolist_list_var_68.rest() , evidence_type_dictionary = cdolist_list_var_68.first()) {
                        if (NIL != allowed_typeP) {
                            if (NIL == dictionary.dictionary_lookup(evidence_type_dictionary, training_type, UNPROVIDED)) {
                                allowed_typeP = NIL;
                            }
                        }
                    }
                }
                if (NIL != allowed_typeP) {
                    set.set_add(training_type, allowed_types);
                }
            }
            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_display_types(training_type_dictionary, $$$allowed_types);
            return allowed_types;
        }
    }

    /**
     * Return a set of allowed types which is the intersection with respect to keys of the given
     * TRAINING-TYPE-DICTIONARY and the given list of EVIDENCE-TYPE-DICTIONARIES.
     */
    @LispMethod(comment = "Return a set of allowed types which is the intersection with respect to keys of the given\r\nTRAINING-TYPE-DICTIONARY and the given list of EVIDENCE-TYPE-DICTIONARIES.\nReturn a set of allowed types which is the intersection with respect to keys of the given\nTRAINING-TYPE-DICTIONARY and the given list of EVIDENCE-TYPE-DICTIONARIES.")
    public static SubLObject alchemy_export_allowed_types(final SubLObject training_type_dictionary, final SubLObject evidence_type_dictionaries) {
        assert NIL != dictionary.dictionary_p(training_type_dictionary) : "! dictionary.dictionary_p(training_type_dictionary) " + ("dictionary.dictionary_p(training_type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(training_type_dictionary) ") + training_type_dictionary;
        assert NIL != list_utilities.non_dotted_list_p(evidence_type_dictionaries) : "! list_utilities.non_dotted_list_p(evidence_type_dictionaries) " + ("list_utilities.non_dotted_list_p(evidence_type_dictionaries) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(evidence_type_dictionaries) ") + evidence_type_dictionaries;
        SubLObject cdolist_list_var = evidence_type_dictionaries;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != dictionary.dictionary_p(elem) : "! dictionary.dictionary_p(elem) " + ("dictionary.dictionary_p(elem) " + "CommonSymbols.NIL != dictionary.dictionary_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject allowed_types = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        SubLObject allowed_typeP = NIL;
        SubLObject cdolist_list_var2 = dictionary.dictionary_keys(training_type_dictionary);
        SubLObject training_type = NIL;
        training_type = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            allowed_typeP = T;
            SubLObject cdolist_list_var_$74 = evidence_type_dictionaries;
            SubLObject evidence_type_dictionary = NIL;
            evidence_type_dictionary = cdolist_list_var_$74.first();
            while (NIL != cdolist_list_var_$74) {
                if ((NIL != allowed_typeP) && (NIL == dictionary.dictionary_lookup(evidence_type_dictionary, training_type, UNPROVIDED))) {
                    allowed_typeP = NIL;
                }
                cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                evidence_type_dictionary = cdolist_list_var_$74.first();
            } 
            if (NIL != allowed_typeP) {
                set.set_add(training_type, allowed_types);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            training_type = cdolist_list_var2.first();
        } 
        alchemy_export_display_types(training_type_dictionary, $$$allowed_types);
        return allowed_types;
    }

    /**
     * Process the list of TYPE-DICTIONARIES, filtering each one according to the set of ALLOWED-TYPES.
     */
    @LispMethod(comment = "Process the list of TYPE-DICTIONARIES, filtering each one according to the set of ALLOWED-TYPES.")
    public static final SubLObject alchemy_export_filter_dictionaries_alt(SubLObject type_dictionaries, SubLObject allowed_types) {
        {
            SubLObject list_var = type_dictionaries;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, DICTIONARY_P);
                }
            }
        }
        SubLTrampolineFile.checkType(allowed_types, SET_P);
        {
            SubLObject cdolist_list_var = type_dictionaries;
            SubLObject type_dictionary = NIL;
            for (type_dictionary = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type_dictionary = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_dictionary(type_dictionary, allowed_types);
            }
        }
        return NIL;
    }

    /**
     * Process the list of TYPE-DICTIONARIES, filtering each one according to the set of ALLOWED-TYPES.
     */
    @LispMethod(comment = "Process the list of TYPE-DICTIONARIES, filtering each one according to the set of ALLOWED-TYPES.")
    public static SubLObject alchemy_export_filter_dictionaries(final SubLObject type_dictionaries, final SubLObject allowed_types) {
        assert NIL != list_utilities.non_dotted_list_p(type_dictionaries) : "! list_utilities.non_dotted_list_p(type_dictionaries) " + ("list_utilities.non_dotted_list_p(type_dictionaries) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(type_dictionaries) ") + type_dictionaries;
        SubLObject cdolist_list_var = type_dictionaries;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != dictionary.dictionary_p(elem) : "! dictionary.dictionary_p(elem) " + ("dictionary.dictionary_p(elem) " + "CommonSymbols.NIL != dictionary.dictionary_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != set.set_p(allowed_types) : "! set.set_p(allowed_types) " + ("set.set_p(allowed_types) " + "CommonSymbols.NIL != set.set_p(allowed_types) ") + allowed_types;
        SubLObject cdolist_list_var2 = type_dictionaries;
        SubLObject type_dictionary = NIL;
        type_dictionary = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            alchemy_export_filter_dictionary(type_dictionary, allowed_types);
            cdolist_list_var2 = cdolist_list_var2.rest();
            type_dictionary = cdolist_list_var2.first();
        } 
        return NIL;
    }

    /**
     * Remove from the given TYPE-DICTIONARY any type that is not a member of the set of ALLOWED-TYPES.
     */
    @LispMethod(comment = "Remove from the given TYPE-DICTIONARY any type that is not a member of the set of ALLOWED-TYPES.")
    public static final SubLObject alchemy_export_filter_dictionary_alt(SubLObject type_dictionary, SubLObject allowed_types) {
        SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
        SubLTrampolineFile.checkType(allowed_types, SET_P);
        {
            SubLObject cdolist_list_var = dictionary.dictionary_keys(type_dictionary);
            SubLObject type = NIL;
            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                if (NIL == set.set_memberP(type, allowed_types)) {
                    dictionary.dictionary_remove(type_dictionary, type);
                }
            }
        }
        return NIL;
    }

    /**
     * Remove from the given TYPE-DICTIONARY any type that is not a member of the set of ALLOWED-TYPES.
     */
    @LispMethod(comment = "Remove from the given TYPE-DICTIONARY any type that is not a member of the set of ALLOWED-TYPES.")
    public static SubLObject alchemy_export_filter_dictionary(final SubLObject type_dictionary, final SubLObject allowed_types) {
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        assert NIL != set.set_p(allowed_types) : "! set.set_p(allowed_types) " + ("set.set_p(allowed_types) " + "CommonSymbols.NIL != set.set_p(allowed_types) ") + allowed_types;
        SubLObject cdolist_list_var = dictionary.dictionary_keys(type_dictionary);
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == set.set_memberP(type, allowed_types)) {
                dictionary.dictionary_remove(type_dictionary, type);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Export in Alchemy format the types contained in the given list of TYPE-DICTIONARIES using
     * corresponding FILENAMES.
     */
    @LispMethod(comment = "Export in Alchemy format the types contained in the given list of TYPE-DICTIONARIES using\r\ncorresponding FILENAMES.\nExport in Alchemy format the types contained in the given list of TYPE-DICTIONARIES using\ncorresponding FILENAMES.")
    public static final SubLObject alchemy_export_type_files_alt(SubLObject type_dictionaries, SubLObject filenames) {
        {
            SubLObject list_var = type_dictionaries;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, DICTIONARY_P);
                }
            }
        }
        {
            SubLObject list_var = filenames;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        {
            SubLObject type_dictionary = NIL;
            SubLObject type_dictionary_69 = NIL;
            SubLObject filename = NIL;
            SubLObject filename_70 = NIL;
            for (type_dictionary = type_dictionaries, type_dictionary_69 = type_dictionary.first(), filename = filenames, filename_70 = filename.first(); !((NIL == filename) && (NIL == type_dictionary)); type_dictionary = type_dictionary.rest() , type_dictionary_69 = type_dictionary.first() , filename = filename.rest() , filename_70 = filename.first()) {
                com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_types_file(type_dictionary_69, filename_70);
            }
        }
        return NIL;
    }

    /**
     * Export in Alchemy format the types contained in the given list of TYPE-DICTIONARIES using
     * corresponding FILENAMES.
     */
    @LispMethod(comment = "Export in Alchemy format the types contained in the given list of TYPE-DICTIONARIES using\r\ncorresponding FILENAMES.\nExport in Alchemy format the types contained in the given list of TYPE-DICTIONARIES using\ncorresponding FILENAMES.")
    public static SubLObject alchemy_export_type_files(final SubLObject type_dictionaries, final SubLObject filenames) {
        assert NIL != list_utilities.non_dotted_list_p(type_dictionaries) : "! list_utilities.non_dotted_list_p(type_dictionaries) " + ("list_utilities.non_dotted_list_p(type_dictionaries) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(type_dictionaries) ") + type_dictionaries;
        SubLObject cdolist_list_var = type_dictionaries;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != dictionary.dictionary_p(elem) : "! dictionary.dictionary_p(elem) " + ("dictionary.dictionary_p(elem) " + "CommonSymbols.NIL != dictionary.dictionary_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(filenames) : "! list_utilities.non_dotted_list_p(filenames) " + ("list_utilities.non_dotted_list_p(filenames) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(filenames) ") + filenames;
        cdolist_list_var = filenames;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject type_dictionary = NIL;
        SubLObject type_dictionary_$75 = NIL;
        SubLObject filename = NIL;
        SubLObject filename_$76 = NIL;
        type_dictionary = type_dictionaries;
        type_dictionary_$75 = type_dictionary.first();
        filename = filenames;
        filename_$76 = filename.first();
        while ((NIL != filename) || (NIL != type_dictionary)) {
            alchemy_export_types_file(type_dictionary_$75, filename_$76);
            type_dictionary = type_dictionary.rest();
            type_dictionary_$75 = type_dictionary.first();
            filename = filename.rest();
            filename_$76 = filename.first();
        } 
        return NIL;
    }

    /**
     * Return a list of gaf lists consisting of the given EVIDENCE-GAF-LISTS after filtering each
     * one according to the given set of ALLOWED-TYPES and list of FOL-PREDICATES.
     */
    @LispMethod(comment = "Return a list of gaf lists consisting of the given EVIDENCE-GAF-LISTS after filtering each\r\none according to the given set of ALLOWED-TYPES and list of FOL-PREDICATES.\nReturn a list of gaf lists consisting of the given EVIDENCE-GAF-LISTS after filtering each\none according to the given set of ALLOWED-TYPES and list of FOL-PREDICATES.")
    public static final SubLObject alchemy_export_filter_gaf_lists_alt(SubLObject evidence_gaf_lists, SubLObject allowed_types, SubLObject fol_predicates) {
        {
            SubLObject list_var = evidence_gaf_lists;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, LISTP);
                }
            }
        }
        SubLTrampolineFile.checkType(allowed_types, SET_P);
        {
            SubLObject filtered_gaf_lists = NIL;
            SubLObject cdolist_list_var = evidence_gaf_lists;
            SubLObject evidence_gafs = NIL;
            for (evidence_gafs = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , evidence_gafs = cdolist_list_var.first()) {
                filtered_gaf_lists = cons(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_evidence_gafs(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_filter_gafs(evidence_gafs, allowed_types), fol_predicates), filtered_gaf_lists);
            }
            filtered_gaf_lists = nreverse(filtered_gaf_lists);
            return filtered_gaf_lists;
        }
    }

    /**
     * Return a list of gaf lists consisting of the given EVIDENCE-GAF-LISTS after filtering each
     * one according to the given set of ALLOWED-TYPES and list of FOL-PREDICATES.
     */
    @LispMethod(comment = "Return a list of gaf lists consisting of the given EVIDENCE-GAF-LISTS after filtering each\r\none according to the given set of ALLOWED-TYPES and list of FOL-PREDICATES.\nReturn a list of gaf lists consisting of the given EVIDENCE-GAF-LISTS after filtering each\none according to the given set of ALLOWED-TYPES and list of FOL-PREDICATES.")
    public static SubLObject alchemy_export_filter_gaf_lists(final SubLObject evidence_gaf_lists, final SubLObject allowed_types, final SubLObject fol_predicates) {
        assert NIL != list_utilities.non_dotted_list_p(evidence_gaf_lists) : "! list_utilities.non_dotted_list_p(evidence_gaf_lists) " + ("list_utilities.non_dotted_list_p(evidence_gaf_lists) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(evidence_gaf_lists) ") + evidence_gaf_lists;
        SubLObject cdolist_list_var = evidence_gaf_lists;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != listp(elem) : "! listp(elem) " + ("Types.listp(elem) " + "CommonSymbols.NIL != Types.listp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != set.set_p(allowed_types) : "! set.set_p(allowed_types) " + ("set.set_p(allowed_types) " + "CommonSymbols.NIL != set.set_p(allowed_types) ") + allowed_types;
        SubLObject filtered_gaf_lists = NIL;
        cdolist_list_var = evidence_gaf_lists;
        SubLObject evidence_gafs = NIL;
        evidence_gafs = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            filtered_gaf_lists = cons(alchemy_export_filter_evidence_gafs(alchemy_export_filter_gafs(evidence_gafs, allowed_types), fol_predicates), filtered_gaf_lists);
            cdolist_list_var = cdolist_list_var.rest();
            evidence_gafs = cdolist_list_var.first();
        } 
        filtered_gaf_lists = nreverse(filtered_gaf_lists);
        return filtered_gaf_lists;
    }

    /**
     * Return a list consisting of the the given list of GAFS after filtering according to
     * the set of ALLOWED-TYPES.
     */
    @LispMethod(comment = "Return a list consisting of the the given list of GAFS after filtering according to\r\nthe set of ALLOWED-TYPES.\nReturn a list consisting of the the given list of GAFS after filtering according to\nthe set of ALLOWED-TYPES.")
    public static final SubLObject alchemy_export_filter_gafs_alt(SubLObject gafs, SubLObject allowed_types) {
        {
            SubLObject list_var = gafs;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, ASSERTION_P);
                }
            }
        }
        SubLTrampolineFile.checkType(allowed_types, SET_P);
        {
            SubLObject filtered_gafs = NIL;
            SubLObject evidence_term_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = gafs;
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                {
                    SubLObject expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(gaf), $$InferencePSC);
                    SubLObject predicate = cycl_utilities.formula_arg0(expanded_el_formula);
                    SubLObject args = cycl_utilities.formula_args(expanded_el_formula, UNPROVIDED);
                    SubLObject types = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_predicate_arg_constraints(predicate, number_utilities.f_1_(length(expanded_el_formula)));
                    SubLObject types_acceptableP = T;
                    {
                        SubLObject cdolist_list_var_71 = args;
                        SubLObject arg = NIL;
                        for (arg = cdolist_list_var_71.first(); NIL != cdolist_list_var_71; cdolist_list_var_71 = cdolist_list_var_71.rest() , arg = cdolist_list_var_71.first()) {
                            if (NIL != forts.fort_p(arg)) {
                                set.set_add(arg, evidence_term_set);
                            }
                        }
                    }
                    $ae_number_of_evidence_terms$.setDynamicValue(set.set_size(evidence_term_set));
                    if (cycl_utilities.formula_arg0(expanded_el_formula) == $$isa) {
                        if (NIL == set.set_memberP(cycl_utilities.formula_arg2(expanded_el_formula, UNPROVIDED), allowed_types)) {
                            types_acceptableP = NIL;
                            format(T, $str_alt105$____dropped_gaf_from_export_becau, cycl_utilities.formula_arg2(expanded_el_formula, UNPROVIDED), gaf);
                        }
                    }
                    {
                        SubLObject cdolist_list_var_72 = types;
                        SubLObject type = NIL;
                        for (type = cdolist_list_var_72.first(); NIL != cdolist_list_var_72; cdolist_list_var_72 = cdolist_list_var_72.rest() , type = cdolist_list_var_72.first()) {
                            if (NIL != types_acceptableP) {
                                if (NIL == set.set_memberP(type, allowed_types)) {
                                    types_acceptableP = NIL;
                                    format(T, $str_alt105$____dropped_gaf_from_export_becau, type, gaf);
                                }
                            }
                        }
                    }
                    if (NIL != types_acceptableP) {
                        filtered_gafs = cons(gaf, filtered_gafs);
                    }
                }
            }
            return filtered_gafs;
        }
    }

    /**
     * Return a list consisting of the the given list of GAFS after filtering according to
     * the set of ALLOWED-TYPES.
     */
    @LispMethod(comment = "Return a list consisting of the the given list of GAFS after filtering according to\r\nthe set of ALLOWED-TYPES.\nReturn a list consisting of the the given list of GAFS after filtering according to\nthe set of ALLOWED-TYPES.")
    public static SubLObject alchemy_export_filter_gafs(final SubLObject gafs, final SubLObject allowed_types) {
        assert NIL != list_utilities.non_dotted_list_p(gafs) : "! list_utilities.non_dotted_list_p(gafs) " + ("list_utilities.non_dotted_list_p(gafs) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(gafs) ") + gafs;
        SubLObject cdolist_list_var = gafs;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != set.set_p(allowed_types) : "! set.set_p(allowed_types) " + ("set.set_p(allowed_types) " + "CommonSymbols.NIL != set.set_p(allowed_types) ") + allowed_types;
        SubLObject filtered_gafs = NIL;
        final SubLObject evidence_term_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var2 = gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(gaf), $$InferencePSC);
            final SubLObject predicate = cycl_utilities.formula_arg0(expanded_el_formula);
            final SubLObject args = cycl_utilities.formula_args(expanded_el_formula, UNPROVIDED);
            final SubLObject types = alchemy_predicate_arg_constraints(predicate, number_utilities.f_1_(length(expanded_el_formula)));
            SubLObject types_acceptableP = T;
            SubLObject cdolist_list_var_$77 = args;
            SubLObject arg = NIL;
            arg = cdolist_list_var_$77.first();
            while (NIL != cdolist_list_var_$77) {
                if (NIL != forts.fort_p(arg)) {
                    set.set_add(arg, evidence_term_set);
                }
                cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                arg = cdolist_list_var_$77.first();
            } 
            $ae_number_of_evidence_terms$.setDynamicValue(set.set_size(evidence_term_set));
            if (cycl_utilities.formula_arg0(expanded_el_formula).eql($$isa) && (NIL == set.set_memberP(cycl_utilities.formula_arg2(expanded_el_formula, UNPROVIDED), allowed_types))) {
                types_acceptableP = NIL;
                format(T, $str105$____dropped_gaf_from_export_becau, cycl_utilities.formula_arg2(expanded_el_formula, UNPROVIDED), gaf);
            }
            SubLObject cdolist_list_var_$78 = types;
            SubLObject type = NIL;
            type = cdolist_list_var_$78.first();
            while (NIL != cdolist_list_var_$78) {
                if ((NIL != types_acceptableP) && (NIL == set.set_memberP(type, allowed_types))) {
                    types_acceptableP = NIL;
                    format(T, $str105$____dropped_gaf_from_export_becau, type, gaf);
                }
                cdolist_list_var_$78 = cdolist_list_var_$78.rest();
                type = cdolist_list_var_$78.first();
            } 
            if (NIL != types_acceptableP) {
                filtered_gafs = cons(gaf, filtered_gafs);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            gaf = cdolist_list_var2.first();
        } 
        return filtered_gafs;
    }

    /**
     * Export in Alchemy format the given EVIDENCE-GAF-LISTS using the corresponding EVIDENCE-FILENAMES.
     * Return a list of the fol analysis for each list of evidence gafs.
     */
    @LispMethod(comment = "Export in Alchemy format the given EVIDENCE-GAF-LISTS using the corresponding EVIDENCE-FILENAMES.\r\nReturn a list of the fol analysis for each list of evidence gafs.\nExport in Alchemy format the given EVIDENCE-GAF-LISTS using the corresponding EVIDENCE-FILENAMES.\nReturn a list of the fol analysis for each list of evidence gafs.")
    public static final SubLObject alchemy_export_gaf_files_alt(SubLObject evidence_gaf_lists, SubLObject evidence_filenames) {
        {
            SubLObject list_var = evidence_gaf_lists;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, LISTP);
                }
            }
        }
        {
            SubLObject list_var = evidence_filenames;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        {
            SubLObject evidence_gafs_analyses = NIL;
            SubLObject evidence_gafs = NIL;
            SubLObject evidence_gafs_73 = NIL;
            SubLObject evidence_filename = NIL;
            SubLObject evidence_filename_74 = NIL;
            for (evidence_gafs = evidence_gaf_lists, evidence_gafs_73 = evidence_gafs.first(), evidence_filename = evidence_filenames, evidence_filename_74 = evidence_filename.first(); !((NIL == evidence_filename) && (NIL == evidence_gafs)); evidence_gafs = evidence_gafs.rest() , evidence_gafs_73 = evidence_gafs.first() , evidence_filename = evidence_filename.rest() , evidence_filename_74 = evidence_filename.first()) {
                evidence_gafs_analyses = cons(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_gaf_file(evidence_gafs_73, evidence_filename_74), evidence_gafs_analyses);
            }
            return nreverse(evidence_gafs_analyses);
        }
    }

    /**
     * Export in Alchemy format the given EVIDENCE-GAF-LISTS using the corresponding EVIDENCE-FILENAMES.
     * Return a list of the fol analysis for each list of evidence gafs.
     */
    @LispMethod(comment = "Export in Alchemy format the given EVIDENCE-GAF-LISTS using the corresponding EVIDENCE-FILENAMES.\r\nReturn a list of the fol analysis for each list of evidence gafs.\nExport in Alchemy format the given EVIDENCE-GAF-LISTS using the corresponding EVIDENCE-FILENAMES.\nReturn a list of the fol analysis for each list of evidence gafs.")
    public static SubLObject alchemy_export_gaf_files(final SubLObject evidence_gaf_lists, final SubLObject evidence_filenames) {
        assert NIL != list_utilities.non_dotted_list_p(evidence_gaf_lists) : "! list_utilities.non_dotted_list_p(evidence_gaf_lists) " + ("list_utilities.non_dotted_list_p(evidence_gaf_lists) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(evidence_gaf_lists) ") + evidence_gaf_lists;
        SubLObject cdolist_list_var = evidence_gaf_lists;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != listp(elem) : "! listp(elem) " + ("Types.listp(elem) " + "CommonSymbols.NIL != Types.listp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(evidence_filenames) : "! list_utilities.non_dotted_list_p(evidence_filenames) " + ("list_utilities.non_dotted_list_p(evidence_filenames) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(evidence_filenames) ") + evidence_filenames;
        cdolist_list_var = evidence_filenames;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject evidence_gafs_analyses = NIL;
        SubLObject evidence_gafs = NIL;
        SubLObject evidence_gafs_$79 = NIL;
        SubLObject evidence_filename = NIL;
        SubLObject evidence_filename_$80 = NIL;
        evidence_gafs = evidence_gaf_lists;
        evidence_gafs_$79 = evidence_gafs.first();
        evidence_filename = evidence_filenames;
        evidence_filename_$80 = evidence_filename.first();
        while ((NIL != evidence_filename) || (NIL != evidence_gafs)) {
            evidence_gafs_analyses = cons(alchemy_export_gaf_file(evidence_gafs_$79, evidence_filename_$80), evidence_gafs_analyses);
            evidence_gafs = evidence_gafs.rest();
            evidence_gafs_$79 = evidence_gafs.first();
            evidence_filename = evidence_filename.rest();
            evidence_filename_$80 = evidence_filename.first();
        } 
        return nreverse(evidence_gafs_analyses);
    }

    /**
     * Export in Alchemy format the given list of GAFS using the given FILENAME and return the FOL analysis.
     */
    @LispMethod(comment = "Export in Alchemy format the given list of GAFS using the given FILENAME and return the FOL analysis.")
    public static final SubLObject alchemy_export_gaf_file_alt(SubLObject gafs, SubLObject filename) {
        {
            SubLObject list_var = gafs;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, ASSERTION_P);
                }
            }
        }
        SubLTrampolineFile.checkType(filename, STRINGP);
        {
            SubLObject analysis = NIL;
            analysis = com.cyc.cycjava.cycl.butler.alchemy_export.cycl_assertions_to_alchemy_style_fol(gafs);
            format(T, $str_alt106$Exporting_Alchemy_gaf_file__A__, filename);
            force_output(UNPROVIDED);
            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_data_file(analysis, filename);
            return analysis;
        }
    }

    /**
     * Export in Alchemy format the given list of GAFS using the given FILENAME and return the FOL analysis.
     */
    @LispMethod(comment = "Export in Alchemy format the given list of GAFS using the given FILENAME and return the FOL analysis.")
    public static SubLObject alchemy_export_gaf_file(final SubLObject gafs, final SubLObject filename) {
        assert NIL != list_utilities.non_dotted_list_p(gafs) : "! list_utilities.non_dotted_list_p(gafs) " + ("list_utilities.non_dotted_list_p(gafs) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(gafs) ") + gafs;
        SubLObject cdolist_list_var = gafs;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject analysis = NIL;
        analysis = cycl_assertions_to_alchemy_style_fol(gafs);
        format(T, $str106$Exporting_Alchemy_gaf_file__A__, filename);
        force_output(UNPROVIDED);
        alchemy_export_data_file(analysis, filename);
        return analysis;
    }

    /**
     * Return a list consisting of the given set of RULES after filtering according to
     * the given set of ALLOWED-TYPES.
     */
    @LispMethod(comment = "Return a list consisting of the given set of RULES after filtering according to\r\nthe given set of ALLOWED-TYPES.\nReturn a list consisting of the given set of RULES after filtering according to\nthe given set of ALLOWED-TYPES.")
    public static final SubLObject alchemy_export_filter_rules_alt(SubLObject rules, SubLObject allowed_types) {
        {
            SubLObject list_var = rules;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, ASSERTION_P);
                }
            }
        }
        SubLTrampolineFile.checkType(allowed_types, SET_P);
        {
            SubLObject filtered_rules = NIL;
            SubLObject expanded_el_formula = NIL;
            SubLObject cdolist_list_var = rules;
            SubLObject rule = NIL;
            for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(rule), $$InferencePSC);
                format(T, $str_alt107$__considering_____A__, rule);
                {
                    SubLObject lits = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_get_lits(expanded_el_formula);
                    SubLObject all_types_presentP = T;
                    SubLObject cdolist_list_var_75 = lits;
                    SubLObject lit = NIL;
                    for (lit = cdolist_list_var_75.first(); NIL != cdolist_list_var_75; cdolist_list_var_75 = cdolist_list_var_75.rest() , lit = cdolist_list_var_75.first()) {
                        if (NIL != all_types_presentP) {
                            {
                                SubLObject predicate = cycl_utilities.formula_arg0(lit);
                                SubLObject types = NIL;
                                if (NIL != forts.fort_p(predicate)) {
                                    if (predicate == $$isa) {
                                        if (NIL == set.set_memberP(cycl_utilities.formula_arg2(lit, UNPROVIDED), allowed_types)) {
                                            all_types_presentP = NIL;
                                            format(T, $str_alt108$_____A_is_not_an_allowed_type__, cycl_utilities.formula_arg2(lit, UNPROVIDED));
                                        }
                                    }
                                    types = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_predicate_arg_constraints(predicate, number_utilities.f_1_(length(lit)));
                                    {
                                        SubLObject cdolist_list_var_76 = types;
                                        SubLObject type = NIL;
                                        for (type = cdolist_list_var_76.first(); NIL != cdolist_list_var_76; cdolist_list_var_76 = cdolist_list_var_76.rest() , type = cdolist_list_var_76.first()) {
                                            if (NIL != all_types_presentP) {
                                                if (NIL == set.set_memberP(type, allowed_types)) {
                                                    all_types_presentP = NIL;
                                                    format(T, $str_alt108$_____A_is_not_an_allowed_type__, type);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    format(T, $str_alt109$_____A_is_not_a_reified_predicate, predicate);
                                    all_types_presentP = NIL;
                                }
                            }
                        }
                    }
                    if (NIL != all_types_presentP) {
                        filtered_rules = cons(rule, filtered_rules);
                    } else {
                        format(T, $str_alt110$____dropped_rule_from_export____A, rule);
                    }
                }
            }
            return filtered_rules;
        }
    }

    /**
     * Return a list consisting of the given set of RULES after filtering according to
     * the given set of ALLOWED-TYPES.
     */
    @LispMethod(comment = "Return a list consisting of the given set of RULES after filtering according to\r\nthe given set of ALLOWED-TYPES.\nReturn a list consisting of the given set of RULES after filtering according to\nthe given set of ALLOWED-TYPES.")
    public static SubLObject alchemy_export_filter_rules(final SubLObject rules, final SubLObject allowed_types) {
        assert NIL != list_utilities.non_dotted_list_p(rules) : "! list_utilities.non_dotted_list_p(rules) " + ("list_utilities.non_dotted_list_p(rules) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(rules) ") + rules;
        SubLObject cdolist_list_var = rules;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != set.set_p(allowed_types) : "! set.set_p(allowed_types) " + ("set.set_p(allowed_types) " + "CommonSymbols.NIL != set.set_p(allowed_types) ") + allowed_types;
        SubLObject filtered_rules = NIL;
        SubLObject expanded_el_formula = NIL;
        SubLObject cdolist_list_var2 = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(rule), $$InferencePSC);
            format(T, $str107$__considering_____A__, rule);
            final SubLObject lits = alchemy_export_get_lits(expanded_el_formula);
            SubLObject all_types_presentP = T;
            SubLObject cdolist_list_var_$81 = lits;
            SubLObject lit = NIL;
            lit = cdolist_list_var_$81.first();
            while (NIL != cdolist_list_var_$81) {
                if (NIL != all_types_presentP) {
                    final SubLObject predicate = cycl_utilities.formula_arg0(lit);
                    SubLObject types = NIL;
                    if (NIL != forts.fort_p(predicate)) {
                        if (predicate.eql($$isa) && (NIL == set.set_memberP(cycl_utilities.formula_arg2(lit, UNPROVIDED), allowed_types))) {
                            all_types_presentP = NIL;
                            format(T, $str108$_____A_is_not_an_allowed_type__, cycl_utilities.formula_arg2(lit, UNPROVIDED));
                        }
                        SubLObject cdolist_list_var_$82;
                        types = cdolist_list_var_$82 = alchemy_predicate_arg_constraints(predicate, number_utilities.f_1_(length(lit)));
                        SubLObject type = NIL;
                        type = cdolist_list_var_$82.first();
                        while (NIL != cdolist_list_var_$82) {
                            if ((NIL != all_types_presentP) && (NIL == set.set_memberP(type, allowed_types))) {
                                all_types_presentP = NIL;
                                format(T, $str108$_____A_is_not_an_allowed_type__, type);
                            }
                            cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                            type = cdolist_list_var_$82.first();
                        } 
                    } else {
                        format(T, $str109$_____A_is_not_a_reified_predicate, predicate);
                        all_types_presentP = NIL;
                    }
                }
                cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                lit = cdolist_list_var_$81.first();
            } 
            if (NIL != all_types_presentP) {
                filtered_rules = cons(rule, filtered_rules);
            } else {
                format(T, $str110$____dropped_rule_from_export____A, rule);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            rule = cdolist_list_var2.first();
        } 
        return filtered_rules;
    }

    /**
     * Return the list of fol-predicates present in the TRAINING-GAFS-ANALYSIS and training RULES.
     */
    @LispMethod(comment = "Return the list of fol-predicates present in the TRAINING-GAFS-ANALYSIS and training RULES.")
    public static final SubLObject alchemy_export_training_fol_predicates_alt(SubLObject rules, SubLObject training_gafs_analysis) {
        {
            SubLObject list_var = rules;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, ASSERTION_P);
                }
            }
        }
        SubLTrampolineFile.checkType(training_gafs_analysis, CONSP);
        {
            SubLObject rules_analysis = NIL;
            rules_analysis = com.cyc.cycjava.cycl.butler.alchemy_export.cycl_assertions_to_alchemy_style_fol(rules);
            {
                SubLObject datum = com.cyc.cycjava.cycl.butler.alchemy_export.all_fol_predicates_and_arguments_mentioned_in_analyses(list(rules_analysis, training_gafs_analysis));
                SubLObject current = datum;
                SubLObject training_fol_predicates = NIL;
                SubLObject training_fol_arguments = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt111);
                training_fol_predicates = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt111);
                training_fol_arguments = current.first();
                current = current.rest();
                if (NIL == current) {
                    return training_fol_predicates;
                } else {
                    cdestructuring_bind_error(datum, $list_alt111);
                }
            }
        }
        return NIL;
    }

    /**
     * Return the list of fol-predicates present in the TRAINING-GAFS-ANALYSIS and training RULES.
     */
    @LispMethod(comment = "Return the list of fol-predicates present in the TRAINING-GAFS-ANALYSIS and training RULES.")
    public static SubLObject alchemy_export_training_fol_predicates(final SubLObject rules, final SubLObject training_gafs_analysis) {
        assert NIL != list_utilities.non_dotted_list_p(rules) : "! list_utilities.non_dotted_list_p(rules) " + ("list_utilities.non_dotted_list_p(rules) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(rules) ") + rules;
        SubLObject cdolist_list_var = rules;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != consp(training_gafs_analysis) : "! consp(training_gafs_analysis) " + ("Types.consp(training_gafs_analysis) " + "CommonSymbols.NIL != Types.consp(training_gafs_analysis) ") + training_gafs_analysis;
        SubLObject rules_analysis = NIL;
        rules_analysis = cycl_assertions_to_alchemy_style_fol(rules);
        SubLObject current;
        final SubLObject datum = current = all_fol_predicates_and_arguments_mentioned_in_analyses(list(rules_analysis, training_gafs_analysis));
        SubLObject training_fol_predicates = NIL;
        SubLObject training_fol_arguments = NIL;
        destructuring_bind_must_consp(current, datum, $list111);
        training_fol_predicates = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        training_fol_arguments = current.first();
        current = current.rest();
        if (NIL == current) {
            return training_fol_predicates;
        }
        cdestructuring_bind_error(datum, $list111);
        return NIL;
    }

    /**
     * Export in Alchemy format the given list of RULES using the given FILENAME.  Export in Alchemy
     * format the predicates contained in TRAINING-GAFS-ANALYSIS and in the training RULES.
     */
    @LispMethod(comment = "Export in Alchemy format the given list of RULES using the given FILENAME.  Export in Alchemy\r\nformat the predicates contained in TRAINING-GAFS-ANALYSIS and in the training RULES.\nExport in Alchemy format the given list of RULES using the given FILENAME.  Export in Alchemy\nformat the predicates contained in TRAINING-GAFS-ANALYSIS and in the training RULES.")
    public static final SubLObject ae_filter_and_export_rule_file_alt(SubLObject rules, SubLObject filename, SubLObject training_gafs_analysis, SubLObject evidence_gafs_analyses, SubLObject allowed_types, SubLObject training_type_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = rules;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, ASSERTION_P);
                    }
                }
            }
            SubLTrampolineFile.checkType(filename, STRINGP);
            SubLTrampolineFile.checkType(training_gafs_analysis, CONSP);
            SubLTrampolineFile.checkType(allowed_types, SET_P);
            SubLTrampolineFile.checkType(training_type_dictionary, DICTIONARY_P);
            {
                SubLObject rules_analysis = com.cyc.cycjava.cycl.butler.alchemy_export.cycl_assertions_to_alchemy_style_fol(rules);
                SubLObject filtered_fol_predicates = NIL;
                SubLObject types_allowedP = NIL;
                format(T, $str_alt112$Exporting_Alchemy_rules_file__A__, filename);
                force_output(UNPROVIDED);
                {
                    SubLObject datum = com.cyc.cycjava.cycl.butler.alchemy_export.all_fol_predicates_and_arguments_mentioned_in_analyses(append(list(rules_analysis, training_gafs_analysis), evidence_gafs_analyses));
                    SubLObject current = datum;
                    SubLObject all_fol_predicates = NIL;
                    SubLObject all_fol_arguments = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    all_fol_predicates = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    all_fol_arguments = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject cdolist_list_var = all_fol_predicates;
                            SubLObject fol_predicate = NIL;
                            for (fol_predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fol_predicate = cdolist_list_var.first()) {
                                types_allowedP = T;
                                {
                                    SubLObject datum_77 = fol_predicate;
                                    SubLObject current_78 = datum_77;
                                    SubLObject fol_predicate_fn = NIL;
                                    SubLObject predicate = NIL;
                                    SubLObject v_arity = NIL;
                                    destructuring_bind_must_consp(current_78, datum_77, $list_alt114);
                                    fol_predicate_fn = current_78.first();
                                    current_78 = current_78.rest();
                                    destructuring_bind_must_consp(current_78, datum_77, $list_alt114);
                                    predicate = current_78.first();
                                    current_78 = current_78.rest();
                                    destructuring_bind_must_consp(current_78, datum_77, $list_alt114);
                                    v_arity = current_78.first();
                                    current_78 = current_78.rest();
                                    if (NIL == current_78) {
                                        {
                                            SubLObject types = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_predicate_arg_constraints(predicate, v_arity);
                                            SubLObject cdolist_list_var_79 = types;
                                            SubLObject type = NIL;
                                            for (type = cdolist_list_var_79.first(); NIL != cdolist_list_var_79; cdolist_list_var_79 = cdolist_list_var_79.rest() , type = cdolist_list_var_79.first()) {
                                                if (NIL != types_allowedP) {
                                                    if (NIL == set.set_memberP(type, allowed_types)) {
                                                        format(T, $str_alt115$__dropping_predicate__A_having_ar, predicate, type);
                                                        types_allowedP = NIL;
                                                    }
                                                }
                                            }
                                            if (NIL != types_allowedP) {
                                                filtered_fol_predicates = cons(fol_predicate, filtered_fol_predicates);
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_77, $list_alt114);
                                    }
                                }
                            }
                        }
                        $ae_number_of_training_predicates$.setDynamicValue(length(filtered_fol_predicates), thread);
                        {
                            SubLObject _prev_bind_0 = folification.$alchemy_output_monotonic_rule_indicator$.currentBinding(thread);
                            try {
                                folification.$alchemy_output_monotonic_rule_indicator$.bind(T, thread);
                                com.cyc.cycjava.cycl.butler.alchemy_export.ae_export_rules_file(rules_analysis, filtered_fol_predicates, training_type_dictionary, filename);
                            } finally {
                                folification.$alchemy_output_monotonic_rule_indicator$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return NIL;
                    } else {
                        cdestructuring_bind_error(datum, $list_alt113);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Export in Alchemy format the given list of RULES using the given FILENAME.  Export in Alchemy
     * format the predicates contained in TRAINING-GAFS-ANALYSIS and in the training RULES.
     */
    @LispMethod(comment = "Export in Alchemy format the given list of RULES using the given FILENAME.  Export in Alchemy\r\nformat the predicates contained in TRAINING-GAFS-ANALYSIS and in the training RULES.\nExport in Alchemy format the given list of RULES using the given FILENAME.  Export in Alchemy\nformat the predicates contained in TRAINING-GAFS-ANALYSIS and in the training RULES.")
    public static SubLObject ae_filter_and_export_rule_file(final SubLObject rules, final SubLObject filename, final SubLObject training_gafs_analysis, final SubLObject evidence_gafs_analyses, final SubLObject allowed_types, final SubLObject training_type_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(rules) : "! list_utilities.non_dotted_list_p(rules) " + ("list_utilities.non_dotted_list_p(rules) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(rules) ") + rules;
        SubLObject cdolist_list_var = rules;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        assert NIL != consp(training_gafs_analysis) : "! consp(training_gafs_analysis) " + ("Types.consp(training_gafs_analysis) " + "CommonSymbols.NIL != Types.consp(training_gafs_analysis) ") + training_gafs_analysis;
        assert NIL != set.set_p(allowed_types) : "! set.set_p(allowed_types) " + ("set.set_p(allowed_types) " + "CommonSymbols.NIL != set.set_p(allowed_types) ") + allowed_types;
        assert NIL != dictionary.dictionary_p(training_type_dictionary) : "! dictionary.dictionary_p(training_type_dictionary) " + ("dictionary.dictionary_p(training_type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(training_type_dictionary) ") + training_type_dictionary;
        final SubLObject rules_analysis = cycl_assertions_to_alchemy_style_fol(rules);
        SubLObject filtered_fol_predicates = NIL;
        SubLObject types_allowedP = NIL;
        format(T, $str112$Exporting_Alchemy_rules_file__A__, filename);
        force_output(UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = all_fol_predicates_and_arguments_mentioned_in_analyses(append(list(rules_analysis, training_gafs_analysis), evidence_gafs_analyses));
        SubLObject all_fol_predicates = NIL;
        SubLObject all_fol_arguments = NIL;
        destructuring_bind_must_consp(current, datum, $list113);
        all_fol_predicates = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list113);
        all_fol_arguments = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var2 = all_fol_predicates;
            SubLObject fol_predicate = NIL;
            fol_predicate = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                types_allowedP = T;
                SubLObject current_$84;
                final SubLObject datum_$83 = current_$84 = fol_predicate;
                SubLObject fol_predicate_fn = NIL;
                SubLObject predicate = NIL;
                SubLObject v_arity = NIL;
                destructuring_bind_must_consp(current_$84, datum_$83, $list114);
                fol_predicate_fn = current_$84.first();
                current_$84 = current_$84.rest();
                destructuring_bind_must_consp(current_$84, datum_$83, $list114);
                predicate = current_$84.first();
                current_$84 = current_$84.rest();
                destructuring_bind_must_consp(current_$84, datum_$83, $list114);
                v_arity = current_$84.first();
                current_$84 = current_$84.rest();
                if (NIL == current_$84) {
                    SubLObject cdolist_list_var_$85;
                    final SubLObject types = cdolist_list_var_$85 = alchemy_predicate_arg_constraints(predicate, v_arity);
                    SubLObject type = NIL;
                    type = cdolist_list_var_$85.first();
                    while (NIL != cdolist_list_var_$85) {
                        if ((NIL != types_allowedP) && (NIL == set.set_memberP(type, allowed_types))) {
                            format(T, $str115$__dropping_predicate__A_having_ar, predicate, type);
                            types_allowedP = NIL;
                        }
                        cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                        type = cdolist_list_var_$85.first();
                    } 
                    if (NIL != types_allowedP) {
                        filtered_fol_predicates = cons(fol_predicate, filtered_fol_predicates);
                    }
                } else {
                    cdestructuring_bind_error(datum_$83, $list114);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                fol_predicate = cdolist_list_var2.first();
            } 
            $ae_number_of_training_predicates$.setDynamicValue(length(filtered_fol_predicates), thread);
            final SubLObject _prev_bind_0 = folification.$alchemy_output_monotonic_rule_indicator$.currentBinding(thread);
            try {
                folification.$alchemy_output_monotonic_rule_indicator$.bind(T, thread);
                ae_export_rules_file(rules_analysis, filtered_fol_predicates, training_type_dictionary, filename);
            } finally {
                folification.$alchemy_output_monotonic_rule_indicator$.rebind(_prev_bind_0, thread);
            }
            return NIL;
        }
        cdestructuring_bind_error(datum, $list113);
        return NIL;
    }

    /**
     * Returns the given RULE-CRITERION ensuring that it contains a :rule specification.
     */
    @LispMethod(comment = "Returns the given RULE-CRITERION ensuring that it contains a :rule specification.")
    public static final SubLObject alchemy_export_augment_rule_criterion_alt(SubLObject rule_criterion) {
        if (((rule_criterion.isCons() && length(rule_criterion).eql(THREE_INTEGER)) && (rule_criterion.first() == $INTERSECTION)) && ((second(rule_criterion) == $RULE) || (third(rule_criterion) == $RULE))) {
            return rule_criterion;
        }
        return list($INTERSECTION, $RULE, rule_criterion);
    }

    /**
     * Returns the given RULE-CRITERION ensuring that it contains a :rule specification.
     */
    @LispMethod(comment = "Returns the given RULE-CRITERION ensuring that it contains a :rule specification.")
    public static SubLObject alchemy_export_augment_rule_criterion(final SubLObject rule_criterion) {
        if (((rule_criterion.isCons() && length(rule_criterion).eql(THREE_INTEGER)) && (rule_criterion.first() == $INTERSECTION)) && ((second(rule_criterion) == $RULE) || (third(rule_criterion) == $RULE))) {
            return rule_criterion;
        }
        return list($INTERSECTION, $RULE, rule_criterion);
    }

    /**
     * Returns the given GAF-CRITERION ensuring that it contains a :gaf specification.
     */
    @LispMethod(comment = "Returns the given GAF-CRITERION ensuring that it contains a :gaf specification.")
    public static final SubLObject alchemy_export_augment_gaf_criterion_alt(SubLObject gaf_criterion) {
        if (((gaf_criterion.isCons() && length(gaf_criterion).eql(THREE_INTEGER)) && (gaf_criterion.first() == $INTERSECTION)) && ((second(gaf_criterion) == $GAF) || (third(gaf_criterion) == $GAF))) {
            return gaf_criterion;
        }
        return list($INTERSECTION, $GAF, gaf_criterion);
    }

    /**
     * Returns the given GAF-CRITERION ensuring that it contains a :gaf specification.
     */
    @LispMethod(comment = "Returns the given GAF-CRITERION ensuring that it contains a :gaf specification.")
    public static SubLObject alchemy_export_augment_gaf_criterion(final SubLObject gaf_criterion) {
        if (((gaf_criterion.isCons() && length(gaf_criterion).eql(THREE_INTEGER)) && (gaf_criterion.first() == $INTERSECTION)) && ((second(gaf_criterion) == $GAF) || (third(gaf_criterion) == $GAF))) {
            return gaf_criterion;
        }
        return list($INTERSECTION, $GAF, gaf_criterion);
    }

    /**
     * Add each arg-constraint mentioned in the given ASSERTION to the dictionary
     * of Alchemy types and their instantiations.
     */
    @LispMethod(comment = "Add each arg-constraint mentioned in the given ASSERTION to the dictionary\r\nof Alchemy types and their instantiations.\nAdd each arg-constraint mentioned in the given ASSERTION to the dictionary\nof Alchemy types and their instantiations.")
    public static final SubLObject alchemy_export_add_types_alt(SubLObject assertion, SubLObject type_dictionary, SubLObject term_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
            SubLTrampolineFile.checkType(term_set, SET_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == assertions_high.gaf_assertionP(assertion)) {
                    Errors.error($str_alt116$_A_must_be_a_GAF, assertion);
                }
            }
            if (cycl_utilities.formula_arg0(assertion) == $$isa) {
                {
                    SubLObject v_term = cycl_utilities.formula_arg1(assertion, UNPROVIDED);
                    SubLObject type = cycl_utilities.formula_arg2(assertion, UNPROVIDED);
                    set.set_add(v_term, term_set);
                    com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_dictionary_pushnew(type_dictionary, type, v_term, assertion);
                    set.set_add(type, term_set);
                    com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_dictionary_pushnew(type_dictionary, $$Thing, v_term, assertion);
                    com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_dictionary_pushnew(type_dictionary, $$Collection, type, assertion);
                    return NIL;
                }
            }
            {
                SubLObject expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(assertion), $$InferencePSC);
                SubLObject lits = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_get_lits(expanded_el_formula);
                SubLObject cdolist_list_var = lits;
                SubLObject lit = NIL;
                for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                    {
                        SubLObject predicate = cycl_utilities.formula_arg0(lit);
                        SubLObject terms = cycl_utilities.formula_args(lit, UNPROVIDED);
                        SubLObject v_arity = number_utilities.f_1_(length(lit));
                        SubLObject types = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_predicate_arg_constraints(predicate, v_arity);
                        SubLObject type = NIL;
                        SubLObject type_80 = NIL;
                        SubLObject v_term = NIL;
                        SubLObject v_term_81 = NIL;
                        for (type = types, type_80 = type.first(), v_term = terms, v_term_81 = v_term.first(); !((NIL == v_term) && (NIL == type)); type = type.rest() , type_80 = type.first() , v_term = v_term.rest() , v_term_81 = v_term.first()) {
                            set.set_add(v_term_81, term_set);
                            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_dictionary_pushnew(type_dictionary, type_80, v_term_81, assertion);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    /**
     * Add each arg-constraint mentioned in the given ASSERTION to the dictionary
     * of Alchemy types and their instantiations.
     */
    @LispMethod(comment = "Add each arg-constraint mentioned in the given ASSERTION to the dictionary\r\nof Alchemy types and their instantiations.\nAdd each arg-constraint mentioned in the given ASSERTION to the dictionary\nof Alchemy types and their instantiations.")
    public static SubLObject alchemy_export_add_types(final SubLObject assertion, final SubLObject type_dictionary, final SubLObject term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        assert NIL != set.set_p(term_set) : "! set.set_p(term_set) " + ("set.set_p(term_set) " + "CommonSymbols.NIL != set.set_p(term_set) ") + term_set;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == assertions_high.gaf_assertionP(assertion))) {
            Errors.error($str116$_A_must_be_a_GAF, assertion);
        }
        if (cycl_utilities.formula_arg0(assertion).eql($$isa)) {
            final SubLObject v_term = cycl_utilities.formula_arg1(assertion, UNPROVIDED);
            final SubLObject type = cycl_utilities.formula_arg2(assertion, UNPROVIDED);
            set.set_add(v_term, term_set);
            alchemy_export_type_dictionary_pushnew(type_dictionary, type, v_term, assertion);
            set.set_add(type, term_set);
            alchemy_export_type_dictionary_pushnew(type_dictionary, $$Thing, v_term, assertion);
            alchemy_export_type_dictionary_pushnew(type_dictionary, $$Collection, type, assertion);
            return NIL;
        }
        final SubLObject expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(assertion), $$InferencePSC);
        SubLObject cdolist_list_var;
        final SubLObject lits = cdolist_list_var = alchemy_export_get_lits(expanded_el_formula);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject predicate = cycl_utilities.formula_arg0(lit);
            final SubLObject terms = cycl_utilities.formula_args(lit, UNPROVIDED);
            final SubLObject v_arity = number_utilities.f_1_(length(lit));
            final SubLObject types = alchemy_predicate_arg_constraints(predicate, v_arity);
            SubLObject type2 = NIL;
            SubLObject type_$86 = NIL;
            SubLObject v_term2 = NIL;
            SubLObject v_term_$87 = NIL;
            type2 = types;
            type_$86 = type2.first();
            v_term2 = terms;
            v_term_$87 = v_term2.first();
            while ((NIL != v_term2) || (NIL != type2)) {
                set.set_add(v_term_$87, term_set);
                alchemy_export_type_dictionary_pushnew(type_dictionary, type_$86, v_term_$87, assertion);
                type2 = type2.rest();
                type_$86 = type2.first();
                v_term2 = v_term2.rest();
                v_term_$87 = v_term2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Puts the given TYPE and TERM into the TYPE-DICTIONARY.  Validates the TYPE and reports
     * an error with OBJ if not valid.
     */
    @LispMethod(comment = "Puts the given TYPE and TERM into the TYPE-DICTIONARY.  Validates the TYPE and reports\r\nan error with OBJ if not valid.\nPuts the given TYPE and TERM into the TYPE-DICTIONARY.  Validates the TYPE and reports\nan error with OBJ if not valid.")
    public static final SubLObject alchemy_export_type_dictionary_enter_alt(SubLObject type_dictionary, SubLObject type, SubLObject v_term, SubLObject obj) {
        SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
        if (!((NIL != forts.fort_p(type)) || type.isCons())) {
            Errors.error($str_alt119$_A_is_not_a_valid_type__from_obj_, type, obj);
        }
        dictionary.dictionary_enter(type_dictionary, type, v_term);
        return NIL;
    }

    /**
     * Puts the given TYPE and TERM into the TYPE-DICTIONARY.  Validates the TYPE and reports
     * an error with OBJ if not valid.
     */
    @LispMethod(comment = "Puts the given TYPE and TERM into the TYPE-DICTIONARY.  Validates the TYPE and reports\r\nan error with OBJ if not valid.\nPuts the given TYPE and TERM into the TYPE-DICTIONARY.  Validates the TYPE and reports\nan error with OBJ if not valid.")
    public static SubLObject alchemy_export_type_dictionary_enter(final SubLObject type_dictionary, final SubLObject type, final SubLObject v_term, final SubLObject obj) {
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        if ((NIL == forts.fort_p(type)) && (!type.isCons())) {
            Errors.error($str119$_A_is_not_a_valid_type__from_obj_, type, obj);
        }
        dictionary.dictionary_enter(type_dictionary, type, v_term);
        return NIL;
    }

    /**
     * Pushes the given TERM into the value list associated with TERM in the
     * TYPE-DICTIONARY.  Validates the TYPE and reports an error with OBJ if not valid.
     */
    @LispMethod(comment = "Pushes the given TERM into the value list associated with TERM in the\r\nTYPE-DICTIONARY.  Validates the TYPE and reports an error with OBJ if not valid.\nPushes the given TERM into the value list associated with TERM in the\nTYPE-DICTIONARY.  Validates the TYPE and reports an error with OBJ if not valid.")
    public static final SubLObject alchemy_export_type_dictionary_pushnew_alt(SubLObject type_dictionary, SubLObject type, SubLObject v_term, SubLObject obj) {
        SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
        if (!((NIL != forts.fort_p(type)) || type.isCons())) {
            Errors.error($str_alt119$_A_is_not_a_valid_type__from_obj_, type, obj);
        }
        dictionary_utilities.dictionary_pushnew(type_dictionary, type, v_term, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Pushes the given TERM into the value list associated with TERM in the
     * TYPE-DICTIONARY.  Validates the TYPE and reports an error with OBJ if not valid.
     */
    @LispMethod(comment = "Pushes the given TERM into the value list associated with TERM in the\r\nTYPE-DICTIONARY.  Validates the TYPE and reports an error with OBJ if not valid.\nPushes the given TERM into the value list associated with TERM in the\nTYPE-DICTIONARY.  Validates the TYPE and reports an error with OBJ if not valid.")
    public static SubLObject alchemy_export_type_dictionary_pushnew(final SubLObject type_dictionary, final SubLObject type, final SubLObject v_term, final SubLObject obj) {
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        if ((NIL == forts.fort_p(type)) && (!type.isCons())) {
            Errors.error($str119$_A_is_not_a_valid_type__from_obj_, type, obj);
        }
        dictionary_utilities.dictionary_pushnew(type_dictionary, type, v_term, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Ensure that each type has all its instances.
     */
    @LispMethod(comment = "Ensure that each type has all its instances.")
    public static final SubLObject alchemy_export_augment_instances_in_type_dictionary_alt(SubLObject type_dictionary, SubLObject term_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
            SubLTrampolineFile.checkType(term_set, SET_P);
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(type_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject terms = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        format(T, $str_alt120$__augmenting_type__A__, type);
                        if (!((NIL != forts.fort_p(type)) || type.isCons())) {
                            Errors.error($str_alt121$_A_is_not_a_valid_type, type);
                        }
                        {
                            SubLObject set_contents_var = set.do_set_internal(term_set);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject v_term = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                                        if ((NIL == subl_promotions.memberP(v_term, terms, UNPROVIDED, UNPROVIDED)) && (NIL != isa.isa_in_any_mtP(v_term, type))) {
                                            format(T, $str_alt122$____with__A__, v_term);
                                            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_dictionary_pushnew(type_dictionary, type, v_term, NIL);
                                        }
                                    }
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    /**
     * Ensure that each type has all its instances.
     */
    @LispMethod(comment = "Ensure that each type has all its instances.")
    public static SubLObject alchemy_export_augment_instances_in_type_dictionary(final SubLObject type_dictionary, final SubLObject term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        assert NIL != set.set_p(term_set) : "! set.set_p(term_set) " + ("set.set_p(term_set) " + "CommonSymbols.NIL != set.set_p(term_set) ") + term_set;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(type_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject terms = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format(T, $str120$__augmenting_type__A__, type);
            if ((NIL == forts.fort_p(type)) && (!type.isCons())) {
                Errors.error($str121$_A_is_not_a_valid_type, type);
            }
            final SubLObject set_contents_var = set.do_set_internal(term_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject v_term;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                v_term = set_contents.do_set_contents_next(basis_object, state);
                if (((NIL != set_contents.do_set_contents_element_validP(state, v_term)) && (NIL == subl_promotions.memberP(v_term, terms, UNPROVIDED, UNPROVIDED))) && (NIL != isa.isa_in_any_mtP(v_term, type))) {
                    format(T, $str122$____with__A__, v_term);
                    alchemy_export_type_dictionary_pushnew(type_dictionary, type, v_term, NIL);
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    /**
     * Displays the types in the given TYPE-DICTIONARY.
     */
    @LispMethod(comment = "Displays the types in the given TYPE-DICTIONARY.")
    public static final SubLObject alchemy_export_display_types_alt(SubLObject type_dictionary, SubLObject comment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
            SubLTrampolineFile.checkType(comment, STRINGP);
            format(T, $str_alt123$__Instantiated_types_in_the__A___, comment);
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(type_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value_list = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        format(T, $str_alt124$___A___A__, type, value_list);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    /**
     * Displays the types in the given TYPE-DICTIONARY.
     */
    @LispMethod(comment = "Displays the types in the given TYPE-DICTIONARY.")
    public static SubLObject alchemy_export_display_types(final SubLObject type_dictionary, final SubLObject comment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        format(T, $str123$__Instantiated_types_in_the__A___, comment);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(type_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format(T, $str124$___A___A__, type, value_list);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    /**
     * Returns the given list of TRAINING-RULES, filtered by the TYPE-DICTIONARY and TERM-SET.
     * Adds new types to the TYPE-DICTIONARY.
     */
    @LispMethod(comment = "Returns the given list of TRAINING-RULES, filtered by the TYPE-DICTIONARY and TERM-SET.\r\nAdds new types to the TYPE-DICTIONARY.\nReturns the given list of TRAINING-RULES, filtered by the TYPE-DICTIONARY and TERM-SET.\nAdds new types to the TYPE-DICTIONARY.")
    public static final SubLObject alchemy_export_filter_rules_by_allowed_types_alt(SubLObject training_rules, SubLObject type_dictionary, SubLObject term_set) {
        {
            SubLObject list_var = training_rules;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, ASSERTION_P);
                }
            }
        }
        SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
        SubLTrampolineFile.checkType(term_set, SET_P);
        {
            SubLObject filtered_training_rules = NIL;
            SubLObject expanded_el_formula = NIL;
            SubLObject cdolist_list_var = training_rules;
            SubLObject training_rule = NIL;
            for (training_rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , training_rule = cdolist_list_var.first()) {
                expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(training_rule), $$InferencePSC);
                format(T, $str_alt107$__considering_____A__, training_rule);
                {
                    SubLObject lits = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_get_lits(expanded_el_formula);
                    SubLObject all_types_presentP = T;
                    SubLObject variable_type_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                    SubLObject rule_term_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                    SubLObject rule_type_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                    SubLObject cdolist_list_var_82 = lits;
                    SubLObject lit = NIL;
                    for (lit = cdolist_list_var_82.first(); NIL != cdolist_list_var_82; cdolist_list_var_82 = cdolist_list_var_82.rest() , lit = cdolist_list_var_82.first()) {
                        if (NIL != all_types_presentP) {
                            {
                                SubLObject predicate = cycl_utilities.formula_arg0(lit);
                                SubLObject args = cycl_utilities.formula_args(lit, UNPROVIDED);
                                SubLObject types = NIL;
                                if (NIL != forts.fort_p(predicate)) {
                                    types = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_predicate_arg_constraints(predicate, number_utilities.f_1_(length(lit)));
                                    {
                                        SubLObject type = NIL;
                                        SubLObject type_83 = NIL;
                                        SubLObject arg = NIL;
                                        SubLObject arg_84 = NIL;
                                        for (type = types, type_83 = type.first(), arg = args, arg_84 = arg.first(); !((NIL == arg) && (NIL == type)); type = type.rest() , type_83 = type.first() , arg = arg.rest() , arg_84 = arg.first()) {
                                            if ((NIL != forts.fort_p(arg_84)) || (NIL != term.ground_nautP(arg_84, UNPROVIDED))) {
                                                set.set_add(arg_84, rule_term_set);
                                                com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_dictionary_pushnew(rule_type_dictionary, type_83, arg_84, training_rule);
                                            }
                                            if (NIL != all_types_presentP) {
                                                all_types_presentP = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_check_type_dictionary_for_type(type_83, type_dictionary, term_set, rule_type_dictionary, rule_term_set, training_rule);
                                            }
                                            if ((NIL != all_types_presentP) && (NIL != cycl_variables.hl_varP(arg_84))) {
                                                dictionary_utilities.dictionary_pushnew(variable_type_dictionary, arg_84, type_83, symbol_function(EQUAL), UNPROVIDED);
                                            }
                                        }
                                    }
                                } else {
                                    format(T, $str_alt109$_____A_is_not_a_reified_predicate, predicate);
                                    all_types_presentP = NIL;
                                }
                            }
                        }
                    }
                    if ((NIL != all_types_presentP) && (NIL != com.cyc.cycjava.cycl.butler.alchemy_export.ae_all_variables_have_instances(variable_type_dictionary, term_set, rule_term_set))) {
                        filtered_training_rules = cons(training_rule, filtered_training_rules);
                        dictionary_utilities.dictionary_merge_list_values(type_dictionary, rule_type_dictionary, UNPROVIDED, UNPROVIDED);
                        set_utilities.set_nmerge(term_set, rule_term_set);
                    } else {
                        format(T, $str_alt110$____dropped_rule_from_export____A, training_rule);
                    }
                }
            }
            force_output(UNPROVIDED);
            return filtered_training_rules;
        }
    }

    /**
     * Returns the given list of TRAINING-RULES, filtered by the TYPE-DICTIONARY and TERM-SET.
     * Adds new types to the TYPE-DICTIONARY.
     */
    @LispMethod(comment = "Returns the given list of TRAINING-RULES, filtered by the TYPE-DICTIONARY and TERM-SET.\r\nAdds new types to the TYPE-DICTIONARY.\nReturns the given list of TRAINING-RULES, filtered by the TYPE-DICTIONARY and TERM-SET.\nAdds new types to the TYPE-DICTIONARY.")
    public static SubLObject alchemy_export_filter_rules_by_allowed_types(final SubLObject training_rules, final SubLObject type_dictionary, final SubLObject term_set) {
        assert NIL != list_utilities.non_dotted_list_p(training_rules) : "! list_utilities.non_dotted_list_p(training_rules) " + ("list_utilities.non_dotted_list_p(training_rules) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(training_rules) ") + training_rules;
        SubLObject cdolist_list_var = training_rules;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        assert NIL != set.set_p(term_set) : "! set.set_p(term_set) " + ("set.set_p(term_set) " + "CommonSymbols.NIL != set.set_p(term_set) ") + term_set;
        SubLObject filtered_training_rules = NIL;
        SubLObject expanded_el_formula = NIL;
        SubLObject cdolist_list_var2 = training_rules;
        SubLObject training_rule = NIL;
        training_rule = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(training_rule), $$InferencePSC);
            format(T, $str107$__considering_____A__, training_rule);
            final SubLObject lits = alchemy_export_get_lits(expanded_el_formula);
            SubLObject all_types_presentP = T;
            final SubLObject variable_type_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            final SubLObject rule_term_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            final SubLObject rule_type_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var_$88 = lits;
            SubLObject lit = NIL;
            lit = cdolist_list_var_$88.first();
            while (NIL != cdolist_list_var_$88) {
                if (NIL != all_types_presentP) {
                    final SubLObject predicate = cycl_utilities.formula_arg0(lit);
                    final SubLObject args = cycl_utilities.formula_args(lit, UNPROVIDED);
                    SubLObject types = NIL;
                    if (NIL != forts.fort_p(predicate)) {
                        types = alchemy_predicate_arg_constraints(predicate, number_utilities.f_1_(length(lit)));
                        SubLObject type = NIL;
                        SubLObject type_$89 = NIL;
                        SubLObject arg = NIL;
                        SubLObject arg_$90 = NIL;
                        type = types;
                        type_$89 = type.first();
                        arg = args;
                        arg_$90 = arg.first();
                        while ((NIL != arg) || (NIL != type)) {
                            if ((NIL != forts.fort_p(arg_$90)) || (NIL != term.ground_nautP(arg_$90, UNPROVIDED))) {
                                set.set_add(arg_$90, rule_term_set);
                                alchemy_export_type_dictionary_pushnew(rule_type_dictionary, type_$89, arg_$90, training_rule);
                            }
                            if (NIL != all_types_presentP) {
                                all_types_presentP = alchemy_export_check_type_dictionary_for_type(type_$89, type_dictionary, term_set, rule_type_dictionary, rule_term_set, training_rule);
                            }
                            if ((NIL != all_types_presentP) && (NIL != cycl_variables.hl_varP(arg_$90))) {
                                dictionary_utilities.dictionary_pushnew(variable_type_dictionary, arg_$90, type_$89, symbol_function(EQUAL), UNPROVIDED);
                            }
                            type = type.rest();
                            type_$89 = type.first();
                            arg = arg.rest();
                            arg_$90 = arg.first();
                        } 
                    } else {
                        format(T, $str109$_____A_is_not_a_reified_predicate, predicate);
                        all_types_presentP = NIL;
                    }
                }
                cdolist_list_var_$88 = cdolist_list_var_$88.rest();
                lit = cdolist_list_var_$88.first();
            } 
            if ((NIL != all_types_presentP) && (NIL != ae_all_variables_have_instances(variable_type_dictionary, term_set, rule_term_set))) {
                filtered_training_rules = cons(training_rule, filtered_training_rules);
                dictionary_utilities.dictionary_merge_list_values(type_dictionary, rule_type_dictionary, UNPROVIDED, UNPROVIDED);
                set_utilities.set_nmerge(term_set, rule_term_set);
            } else {
                format(T, $str110$____dropped_rule_from_export____A, training_rule);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            training_rule = cdolist_list_var2.first();
        } 
        force_output(UNPROVIDED);
        return filtered_training_rules;
    }

    /**
     * Returns T IFF the given TYPE is either (1) present in the given TYPE-DICTIONARY,
     * or (2) is instantiated by one or more terms in the given TERM-SET or RULE-TERM-SET.  In the latter
     * case (2) the type is added to the given RULE-TYPE-DICTIONARY.
     */
    @LispMethod(comment = "Returns T IFF the given TYPE is either (1) present in the given TYPE-DICTIONARY,\r\nor (2) is instantiated by one or more terms in the given TERM-SET or RULE-TERM-SET.  In the latter\r\ncase (2) the type is added to the given RULE-TYPE-DICTIONARY.\nReturns T IFF the given TYPE is either (1) present in the given TYPE-DICTIONARY,\nor (2) is instantiated by one or more terms in the given TERM-SET or RULE-TERM-SET.  In the latter\ncase (2) the type is added to the given RULE-TYPE-DICTIONARY.")
    public static final SubLObject alchemy_export_check_type_dictionary_for_type_alt(SubLObject type, SubLObject type_dictionary, SubLObject term_set, SubLObject rule_type_dictionary, SubLObject rule_term_set, SubLObject assertion) {
        SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
        SubLTrampolineFile.checkType(term_set, SET_P);
        SubLTrampolineFile.checkType(rule_type_dictionary, DICTIONARY_P);
        SubLTrampolineFile.checkType(rule_term_set, SET_P);
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != dictionary.dictionary_lookup(type_dictionary, type, UNPROVIDED)) {
            return T;
        }
        if (NIL != list_utilities.simple_tree_findP($$FOL_UnhandledFn, folification.fol_transform_arg(type))) {
            format(T, $str_alt126$_____A_cannot_be_folified__, type);
            return NIL;
        }
        {
            SubLObject instantion_present_in_term_setP = NIL;
            {
                SubLObject set_contents_var = set.do_set_internal(term_set);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject v_term = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                            if (NIL == instantion_present_in_term_setP) {
                                if (NIL != com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_isa_term_type(v_term, type)) {
                                    instantion_present_in_term_setP = T;
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == instantion_present_in_term_setP) {
                {
                    SubLObject set_contents_var = set.do_set_internal(rule_term_set);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject v_term = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                                if (NIL == instantion_present_in_term_setP) {
                                    if (NIL != com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_isa_term_type(v_term, type)) {
                                        instantion_present_in_term_setP = T;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == instantion_present_in_term_setP) {
                format(T, $str_alt127$_____A_is_not_instantiated_in_ter, type);
                return NIL;
            }
        }
        {
            SubLObject set_contents_var = set.do_set_internal(term_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject v_term = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                        if (NIL != com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_isa_term_type(v_term, type)) {
                            format(T, $str_alt128$________adding_instance__A_of__A_, v_term, type);
                            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_dictionary_pushnew(rule_type_dictionary, type, v_term, assertion);
                        }
                    }
                }
            }
        }
        return T;
    }

    /**
     * Returns T IFF the given TYPE is either (1) present in the given TYPE-DICTIONARY,
     * or (2) is instantiated by one or more terms in the given TERM-SET or RULE-TERM-SET.  In the latter
     * case (2) the type is added to the given RULE-TYPE-DICTIONARY.
     */
    @LispMethod(comment = "Returns T IFF the given TYPE is either (1) present in the given TYPE-DICTIONARY,\r\nor (2) is instantiated by one or more terms in the given TERM-SET or RULE-TERM-SET.  In the latter\r\ncase (2) the type is added to the given RULE-TYPE-DICTIONARY.\nReturns T IFF the given TYPE is either (1) present in the given TYPE-DICTIONARY,\nor (2) is instantiated by one or more terms in the given TERM-SET or RULE-TERM-SET.  In the latter\ncase (2) the type is added to the given RULE-TYPE-DICTIONARY.")
    public static SubLObject alchemy_export_check_type_dictionary_for_type(final SubLObject type, final SubLObject type_dictionary, final SubLObject term_set, final SubLObject rule_type_dictionary, final SubLObject rule_term_set, final SubLObject assertion) {
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        assert NIL != set.set_p(term_set) : "! set.set_p(term_set) " + ("set.set_p(term_set) " + "CommonSymbols.NIL != set.set_p(term_set) ") + term_set;
        assert NIL != dictionary.dictionary_p(rule_type_dictionary) : "! dictionary.dictionary_p(rule_type_dictionary) " + ("dictionary.dictionary_p(rule_type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(rule_type_dictionary) ") + rule_type_dictionary;
        assert NIL != set.set_p(rule_term_set) : "! set.set_p(rule_term_set) " + ("set.set_p(rule_term_set) " + "CommonSymbols.NIL != set.set_p(rule_term_set) ") + rule_term_set;
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != dictionary.dictionary_lookup(type_dictionary, type, UNPROVIDED)) {
            return T;
        }
        if (NIL != list_utilities.simple_tree_findP($$FOL_UnhandledFn, folification.fol_transform_arg(type))) {
            format(T, $str126$_____A_cannot_be_folified__, type);
            return NIL;
        }
        SubLObject instantion_present_in_term_setP = NIL;
        SubLObject set_contents_var = set.do_set_internal(term_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject v_term;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            v_term = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, v_term)) && (NIL == instantion_present_in_term_setP)) && (NIL != alchemy_export_isa_term_type(v_term, type))) {
                instantion_present_in_term_setP = T;
            }
        }
        if (NIL == instantion_present_in_term_setP) {
            set_contents_var = set.do_set_internal(rule_term_set);
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                v_term = set_contents.do_set_contents_next(basis_object, state);
                if (((NIL != set_contents.do_set_contents_element_validP(state, v_term)) && (NIL == instantion_present_in_term_setP)) && (NIL != alchemy_export_isa_term_type(v_term, type))) {
                    instantion_present_in_term_setP = T;
                }
            }
        }
        if (NIL == instantion_present_in_term_setP) {
            format(T, $str127$_____A_is_not_instantiated_in_ter, type);
            return NIL;
        }
        final SubLObject set_contents_var2 = set.do_set_internal(term_set);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject v_term2;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            v_term2 = set_contents.do_set_contents_next(basis_object2, state2);
            if ((NIL != set_contents.do_set_contents_element_validP(state2, v_term2)) && (NIL != alchemy_export_isa_term_type(v_term2, type))) {
                format(T, $str128$________adding_instance__A_of__A_, v_term2, type);
                alchemy_export_type_dictionary_pushnew(rule_type_dictionary, type, v_term2, assertion);
            }
        }
        return T;
    }

    static private final SubLString $str_alt2$____Inference_answers_in_Alchemy_ = makeString("/*~%Inference answers in Alchemy format~%Created on ~A~%");

    static private final SubLString $str_alt3$Generated_from_KB__A_running_on_C = makeString("Generated from KB ~A running on CycL version ~A~%");

    static private final SubLString $str_alt4$Query_sentence___S__Mt___S_______ = makeString("Query sentence: ~S~%Mt: ~S~%*/~%~%");

    static private final SubLString $str_alt6$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt8$____Couldn_t_export_the_sentence_ = makeString("/*~%Couldn't export the sentence ~S:~%~A~%*/");

    static private final SubLString $str_alt11$Invalid_assertion_selection_crite = makeString("Invalid assertion-selection criterion ~S: neither a keyword nor a proper list");

    static private final SubLList $list_alt14 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

    static private final SubLString $str_alt16$Invalid_assertion_selection_crite = makeString("Invalid assertion-selection criterion ~S: unknown operator ~S");

    /**
     * Return T IFF each variable in the VARIABLE-TYPE-DICTIONARY has a non-empty type intersection with
     * terms from TERM-SET or RULE-TERM-SET.
     */
    @LispMethod(comment = "Return T IFF each variable in the VARIABLE-TYPE-DICTIONARY has a non-empty type intersection with\r\nterms from TERM-SET or RULE-TERM-SET.\nReturn T IFF each variable in the VARIABLE-TYPE-DICTIONARY has a non-empty type intersection with\nterms from TERM-SET or RULE-TERM-SET.")
    public static final SubLObject ae_all_variables_have_instances_alt(SubLObject variable_type_dictionary, SubLObject term_set, SubLObject rule_term_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(variable_type_dictionary, DICTIONARY_P);
            SubLTrampolineFile.checkType(term_set, SET_P);
            SubLTrampolineFile.checkType(rule_term_set, SET_P);
            {
                SubLObject terms = set.set_element_list(set_utilities.set_union(list(term_set, rule_term_set), UNPROVIDED));
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(variable_type_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject variable = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject types = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject instantiations = NIL;
                            SubLObject current_instantiations = NIL;
                            SubLObject cdolist_list_var = types;
                            SubLObject type = NIL;
                            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                                current_instantiations = NIL;
                                {
                                    SubLObject cdolist_list_var_85 = terms;
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var_85.first(); NIL != cdolist_list_var_85; cdolist_list_var_85 = cdolist_list_var_85.rest() , v_term = cdolist_list_var_85.first()) {
                                        if (NIL != com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_isa_term_type(v_term, type)) {
                                            current_instantiations = cons(v_term, current_instantiations);
                                        }
                                    }
                                }
                                if (NIL == instantiations) {
                                    instantiations = current_instantiations;
                                }
                                instantiations = intersection(instantiations, current_instantiations, UNPROVIDED, UNPROVIDED);
                                if (NIL == instantiations) {
                                    format(T, $str_alt129$____hl_variable__A_cannot_be_inst, variable);
                                    return NIL;
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return T;
        }
    }

    /**
     * Return T IFF each variable in the VARIABLE-TYPE-DICTIONARY has a non-empty type intersection with
     * terms from TERM-SET or RULE-TERM-SET.
     */
    @LispMethod(comment = "Return T IFF each variable in the VARIABLE-TYPE-DICTIONARY has a non-empty type intersection with\r\nterms from TERM-SET or RULE-TERM-SET.\nReturn T IFF each variable in the VARIABLE-TYPE-DICTIONARY has a non-empty type intersection with\nterms from TERM-SET or RULE-TERM-SET.")
    public static SubLObject ae_all_variables_have_instances(final SubLObject variable_type_dictionary, final SubLObject term_set, final SubLObject rule_term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(variable_type_dictionary) : "! dictionary.dictionary_p(variable_type_dictionary) " + ("dictionary.dictionary_p(variable_type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(variable_type_dictionary) ") + variable_type_dictionary;
        assert NIL != set.set_p(term_set) : "! set.set_p(term_set) " + ("set.set_p(term_set) " + "CommonSymbols.NIL != set.set_p(term_set) ") + term_set;
        assert NIL != set.set_p(rule_term_set) : "! set.set_p(rule_term_set) " + ("set.set_p(rule_term_set) " + "CommonSymbols.NIL != set.set_p(rule_term_set) ") + rule_term_set;
        final SubLObject terms = set.set_element_list(set_utilities.set_union(list(term_set, rule_term_set), UNPROVIDED));
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(variable_type_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject variable = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject types = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject instantiations = NIL;
            SubLObject current_instantiations = NIL;
            SubLObject cdolist_list_var = types;
            SubLObject type = NIL;
            type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                current_instantiations = NIL;
                SubLObject cdolist_list_var_$91 = terms;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var_$91.first();
                while (NIL != cdolist_list_var_$91) {
                    if (NIL != alchemy_export_isa_term_type(v_term, type)) {
                        current_instantiations = cons(v_term, current_instantiations);
                    }
                    cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                    v_term = cdolist_list_var_$91.first();
                } 
                if (NIL == instantiations) {
                    instantiations = current_instantiations;
                }
                instantiations = intersection(instantiations, current_instantiations, UNPROVIDED, UNPROVIDED);
                if (NIL == instantiations) {
                    format(T, $str129$____hl_variable__A_cannot_be_inst, variable);
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                type = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return T;
    }

    static private final SubLString $str_alt17$The_assertion_selection_operator_ = makeString("The assertion-selection operator ~S requires exactly ~S arguments ~S.  ~S arguments were passed in ~S");

    static private final SubLString $str_alt19$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLList $list_alt20 = list(new SubLObject[]{ makeKeyword("UNION"), makeKeyword("CRITERION"), makeKeyword("INTERSECTION"), makeKeyword("CRITERION"), makeKeyword("EXCEPTION"), list(makeKeyword("CRITERION"), makeKeyword("CRITERION")), makeKeyword("IN-MT"), list(makeSymbol("HLMT-P")), makeKeyword("VISIBLE-FROM-MT"), list(makeSymbol("HLMT-P")), makeKeyword("COLLECTION-EXTENT"), list(makeSymbol("COLLECTION-P")), makeKeyword("COLLECTION-EXTENTS"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P")), makeKeyword("COLLECTION-EXTENTS-QUOTED"), list(makeSymbol("COLLECTION-P")), makeKeyword("PREDICATE-EXTENT"), list(makeSymbol("PREDICATE-P")), makeKeyword("PREDICATE-EXTENTS"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P")), makeKeyword("PREDICATE-EXTENTS-QUOTED"), list(makeSymbol("COLLECTION-P")), makeKeyword("ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-MENTIONED"), list(makeKeyword("CRITERION")), makeKeyword("ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-AND-COLLECTIONS-MENTIONED"), list(makeKeyword("CRITERION")), makeKeyword("MENTIONS-TERM"), list(makeSymbol("INDEXED-TERM-P")), makeKeyword("MENTIONS-TERM-AT-LEAST-N-TIMES"), list(makeSymbol("INDEXED-TERM-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-TERM-IN-ARGPOS"), list(makeSymbol("INDEXED-TERM-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-ANY-INSTANTIATION-OF"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P")), makeKeyword("MENTIONS-ANY-QUOTED-INSTANCE-OF"), list(makeSymbol("COLLECTION-P")), makeKeyword("MENTIONS-INSTANTIATIONS-OF-AT-LEAST-N-TIMES"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-QUOTED-INSTANCES-OF-AT-LEAST-N-TIMES"), list(makeSymbol("COLLECTION-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-ANY-INSTANTIATION-OF-IN-ARGPOS"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-ANY-QUOTED-INSTANCE-OF-IN-ARGPOS"), list(makeSymbol("COLLECTION-P"), makeSymbol("POSITIVE-INTEGER-P")), makeKeyword("MENTIONS-ALL-INSTANTIATIONS-OF"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P")), makeKeyword("MENTIONS-ALL-QUOTED-INSTANCES-OF"), list(makeSymbol("COLLECTION-P")), makeKeyword("MENTIONS-ONLY-INSTANTIATIONS-OF"), list(makeSymbol("CYCL-DENOTATIONAL-TERM-P")), makeKeyword("MENTIONS-ONLY-QUOTED-INSTANCES-OF"), list(makeSymbol("COLLECTION-P")) });

    static private final SubLString $str_alt22$Unknown_atomic_assertion_selectio = makeString("Unknown atomic assertion-selection criterion: ~S");

    /**
     * Returns the given list of ASSERTIONS, after removing any assertion with a numeric term.
     */
    @LispMethod(comment = "Returns the given list of ASSERTIONS, after removing any assertion with a numeric term.")
    public static final SubLObject alchemy_export_numeric_term_filter_alt(SubLObject assertions) {
        {
            SubLObject list_var = assertions;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, ASSERTION_P);
                }
            }
        }
        {
            SubLObject filtered_assertions = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                {
                    SubLObject cnf = assertions_high.assertion_cnf(assertion);
                    SubLObject lits = append(clauses.neg_lits(cnf), clauses.pos_lits(cnf));
                    SubLObject numeric_term_presentP = NIL;
                    SubLObject cdolist_list_var_86 = lits;
                    SubLObject lit = NIL;
                    for (lit = cdolist_list_var_86.first(); NIL != cdolist_list_var_86; cdolist_list_var_86 = cdolist_list_var_86.rest() , lit = cdolist_list_var_86.first()) {
                        if (NIL == numeric_term_presentP) {
                            {
                                SubLObject cdolist_list_var_87 = cycl_utilities.formula_args(lit, UNPROVIDED);
                                SubLObject arg = NIL;
                                for (arg = cdolist_list_var_87.first(); NIL != cdolist_list_var_87; cdolist_list_var_87 = cdolist_list_var_87.rest() , arg = cdolist_list_var_87.first()) {
                                    if (NIL == numeric_term_presentP) {
                                        if (arg.isNumber()) {
                                            numeric_term_presentP = T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != numeric_term_presentP) {
                        format(T, $str_alt130$____dropped_numeric_term_assertio, assertion);
                    } else {
                        filtered_assertions = cons(assertion, filtered_assertions);
                    }
                }
            }
            return filtered_assertions;
        }
    }

    /**
     * Returns the given list of ASSERTIONS, after removing any assertion with a numeric term.
     */
    @LispMethod(comment = "Returns the given list of ASSERTIONS, after removing any assertion with a numeric term.")
    public static SubLObject alchemy_export_numeric_term_filter(final SubLObject assertions) {
        assert NIL != list_utilities.non_dotted_list_p(assertions) : "! list_utilities.non_dotted_list_p(assertions) " + ("list_utilities.non_dotted_list_p(assertions) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(assertions) ") + assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject filtered_assertions = NIL;
        cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            final SubLObject lits = append(clauses.neg_lits(cnf), clauses.pos_lits(cnf));
            SubLObject numeric_term_presentP = NIL;
            SubLObject cdolist_list_var_$92 = lits;
            SubLObject lit = NIL;
            lit = cdolist_list_var_$92.first();
            while (NIL != cdolist_list_var_$92) {
                if (NIL == numeric_term_presentP) {
                    SubLObject cdolist_list_var_$93 = cycl_utilities.formula_args(lit, UNPROVIDED);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var_$93.first();
                    while (NIL != cdolist_list_var_$93) {
                        if ((NIL == numeric_term_presentP) && arg.isNumber()) {
                            numeric_term_presentP = T;
                        }
                        cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                        arg = cdolist_list_var_$93.first();
                    } 
                }
                cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                lit = cdolist_list_var_$92.first();
            } 
            if (NIL != numeric_term_presentP) {
                format(T, $str130$____dropped_numeric_term_assertio, assertion);
            } else {
                filtered_assertions = cons(assertion, filtered_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return filtered_assertions;
    }

    static private final SubLList $list_alt27 = list(makeSymbol("POSITIVE-CRITERION"), makeSymbol("NEGATIVE-CRITERION"));

    static private final SubLList $list_alt29 = list(makeSymbol("MT"));

    static private final SubLList $list_alt32 = list(makeSymbol("COLL"));

    static private final SubLList $list_alt34 = list(makeSymbol("SET-OR-COLL"));

    static private final SubLList $list_alt37 = list(makeSymbol("PRED"));

    static private final SubLList $list_alt41 = list(makeSymbol("CRITERION"));

    static private final SubLList $list_alt44 = list(makeSymbol("TERM"));

    static private final SubLList $list_alt46 = list(makeSymbol("TERM"), makeSymbol("N"));

    static private final SubLList $list_alt48 = list(makeSymbol("TERM"), makeSymbol("ARGPOS"));

    static private final SubLList $list_alt52 = list(makeSymbol("SET-OR-COLL"), makeSymbol("N"));

    static private final SubLList $list_alt54 = list(makeSymbol("COLL"), makeSymbol("N"));

    /**
     * Returns T IFF it can be proven that TERM isa TYPE.
     */
    @LispMethod(comment = "Returns T IFF it can be proven that TERM isa TYPE.")
    public static final SubLObject alchemy_export_isa_term_type_alt(SubLObject v_term, SubLObject type) {
        {
            SubLObject v_answer = NIL;
            if (NIL != constant_p(type)) {
                v_answer = isa.isa_in_any_mtP(v_term, type);
            } else {
                if (type.isCons() && (cycl_utilities.formula_arg0(type) == $$CollectionIntersectionFn)) {
                    v_answer = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_isa_term_coll_intersection_type(v_term, type);
                } else {
                    v_answer = equal($list_alt132, inference_kernel.new_cyc_query(list($$isa, v_term, type), $$EverythingPSC, $list_alt134));
                }
            }
            return v_answer;
        }
    }

    /**
     * Returns T IFF it can be proven that TERM isa TYPE.
     */
    @LispMethod(comment = "Returns T IFF it can be proven that TERM isa TYPE.")
    public static SubLObject alchemy_export_isa_term_type(final SubLObject v_term, final SubLObject type) {
        SubLObject v_answer = NIL;
        if (NIL != constant_p(type)) {
            v_answer = isa.isa_in_any_mtP(v_term, type);
        } else
            if (type.isCons() && cycl_utilities.formula_arg0(type).eql($$CollectionIntersectionFn)) {
                v_answer = alchemy_export_isa_term_coll_intersection_type(v_term, type);
            } else {
                v_answer = equal($list132, inference_kernel.new_cyc_query(list($$isa, v_term, type), $$EverythingPSC, $list134));
            }

        return v_answer;
    }

    static private final SubLList $list_alt56 = list(makeSymbol("SET-OR-COLL"), makeSymbol("ARGPOS"));

    static private final SubLList $list_alt58 = list(makeSymbol("COLL"), makeSymbol("ARGPOS"));

    /**
     * Returns T IFF it term isa TYPE, which has the form (#$CollectionIntersectionFn <set of types>).
     */
    @LispMethod(comment = "Returns T IFF it term isa TYPE, which has the form (#$CollectionIntersectionFn <set of types>).")
    public static final SubLObject alchemy_export_isa_term_coll_intersection_type_alt(SubLObject v_term, SubLObject coll_intersection_type) {
        {
            SubLObject cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg1(coll_intersection_type, UNPROVIDED), UNPROVIDED);
            SubLObject type = NIL;
            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_isa_term_type(v_term, type)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    /**
     * Returns T IFF it term isa TYPE, which has the form (#$CollectionIntersectionFn <set of types>).
     */
    @LispMethod(comment = "Returns T IFF it term isa TYPE, which has the form (#$CollectionIntersectionFn <set of types>).")
    public static SubLObject alchemy_export_isa_term_coll_intersection_type(final SubLObject v_term, final SubLObject coll_intersection_type) {
        SubLObject cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg1(coll_intersection_type, UNPROVIDED), UNPROVIDED);
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == alchemy_export_isa_term_type(v_term, type)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return T;
    }

    static private final SubLString $str_alt63$Invalid_assertion_selection_crite = makeString("Invalid assertion-selection criterion ~S: neither a keyword nor a list");

    static private final SubLString $str_alt65$Internal_error__Invalid_atomic_cr = makeString("Internal error: Invalid atomic criterion for find-assertions-meeting-criterion-among: ~S");

    /**
     * Returns the list of literals contained in the given EL-FORMULA.
     */
    @LispMethod(comment = "Returns the list of literals contained in the given EL-FORMULA.")
    public static final SubLObject alchemy_export_get_lits_alt(SubLObject el_formula) {
        SubLTrampolineFile.checkType(el_formula, CONSP);
        {
            SubLObject hl_items = czer_main.el_to_hl(el_formula, $$InferencePSC);
            SubLObject clause = NIL;
            SubLObject neg_lits = NIL;
            SubLObject pos_lits = NIL;
            SubLObject lits = NIL;
            SubLObject cdolist_list_var = hl_items;
            SubLObject hl_item = NIL;
            for (hl_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_item = cdolist_list_var.first()) {
                clause = hl_item.first();
                pos_lits = clause.first();
                lits = append(lits, pos_lits);
                neg_lits = second(clause);
                lits = append(lits, neg_lits);
            }
            return lits;
        }
    }

    /**
     * Returns the list of literals contained in the given EL-FORMULA.
     */
    @LispMethod(comment = "Returns the list of literals contained in the given EL-FORMULA.")
    public static SubLObject alchemy_export_get_lits(final SubLObject el_formula) {
        assert NIL != consp(el_formula) : "! consp(el_formula) " + ("Types.consp(el_formula) " + "CommonSymbols.NIL != Types.consp(el_formula) ") + el_formula;
        final SubLObject hl_items = czer_main.el_to_hl(el_formula, $$InferencePSC);
        SubLObject clause = NIL;
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        SubLObject lits = NIL;
        SubLObject cdolist_list_var = hl_items;
        SubLObject hl_item = NIL;
        hl_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            clause = hl_item.first();
            pos_lits = clause.first();
            lits = append(lits, pos_lits);
            neg_lits = second(clause);
            lits = append(lits, neg_lits);
            cdolist_list_var = cdolist_list_var.rest();
            hl_item = cdolist_list_var.first();
        } 
        return lits;
    }

    static private final SubLString $str_alt66$Internal_error__Invalid_criterion = makeString("Internal error: Invalid criterion operator for find-assertions-meeting-criterion-among: ~S");

    static private final SubLString $str_alt71$Collecting_assertions_visible_fro = makeString("Collecting assertions visible from ");

    /**
     * Returns the given list of ASSERTIONS after removing those that cannot be folified.
     */
    @LispMethod(comment = "Returns the given list of ASSERTIONS after removing those that cannot be folified.")
    public static final SubLObject alchemy_export_filter_assertions_acceptable_for_fol_alt(SubLObject assertions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject analysis = NIL;
                SubLObject fol_sentences_data = NIL;
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = Errors.$ignore_warnsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = Errors.$ignore_breaksP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $silent_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = Errors.$continue_cerrorP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = StreamsLow.$standard_output$.currentBinding(thread);
                    SubLObject _prev_bind_5 = StreamsLow.$error_output$.currentBinding(thread);
                    try {
                        Errors.$ignore_warnsP$.bind(T, thread);
                        Errors.$ignore_breaksP$.bind(T, thread);
                        $silent_progressP$.bind(T, thread);
                        Errors.$continue_cerrorP$.bind(T, thread);
                        StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
                        StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
                        analysis = folification.cycl_assertions_to_fol(assertions, $alchemy_folification_properties$.getGlobalValue(), UNPROVIDED);
                    } finally {
                        StreamsLow.$error_output$.rebind(_prev_bind_5, thread);
                        StreamsLow.$standard_output$.rebind(_prev_bind_4, thread);
                        Errors.$continue_cerrorP$.rebind(_prev_bind_3, thread);
                        $silent_progressP$.rebind(_prev_bind_2, thread);
                        Errors.$ignore_breaksP$.rebind(_prev_bind_1, thread);
                        Errors.$ignore_warnsP$.rebind(_prev_bind_0, thread);
                    }
                }
                fol_sentences_data = getf(analysis, $FOL_SENTENCES_DATA, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = fol_sentences_data;
                    SubLObject fol_sentences_datum = NIL;
                    for (fol_sentences_datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fol_sentences_datum = cdolist_list_var.first()) {
                        {
                            SubLObject datum = fol_sentences_datum;
                            SubLObject current = datum;
                            SubLObject v_term = NIL;
                            SubLObject fol_sentence = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt136);
                            v_term = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt136);
                            fol_sentence = current.first();
                            current = current.rest();
                            {
                                SubLObject unhandled_fol_sentences = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt136);
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != assertion_handles.assertion_p(v_term)) {
                                        if ((NIL != fol_sentence) && (NIL == unhandled_fol_sentences)) {
                                            results = cons(v_term, results);
                                        } else {
                                            format(T, $str_alt137$____dropped_unhandled_fol_asserti, v_term);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt136);
                                }
                            }
                        }
                    }
                }
                return results;
            }
        }
    }

    /**
     * Returns the given list of ASSERTIONS after removing those that cannot be folified.
     */
    @LispMethod(comment = "Returns the given list of ASSERTIONS after removing those that cannot be folified.")
    public static SubLObject alchemy_export_filter_assertions_acceptable_for_fol(final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject analysis = NIL;
        SubLObject fol_sentences_data = NIL;
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = Errors.$ignore_warnsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$ignore_breaksP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = StreamsLow.$standard_output$.currentBinding(thread);
        final SubLObject _prev_bind_6 = StreamsLow.$error_output$.currentBinding(thread);
        try {
            Errors.$ignore_warnsP$.bind(T, thread);
            Errors.$ignore_breaksP$.bind(T, thread);
            $silent_progressP$.bind(T, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            analysis = folification.cycl_assertions_to_fol(assertions, $alchemy_folification_properties$.getGlobalValue(), UNPROVIDED);
        } finally {
            StreamsLow.$error_output$.rebind(_prev_bind_6, thread);
            StreamsLow.$standard_output$.rebind(_prev_bind_5, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_4, thread);
            $silent_progressP$.rebind(_prev_bind_3, thread);
            Errors.$ignore_breaksP$.rebind(_prev_bind_2, thread);
            Errors.$ignore_warnsP$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var;
        fol_sentences_data = cdolist_list_var = getf(analysis, $FOL_SENTENCES_DATA, UNPROVIDED);
        SubLObject fol_sentences_datum = NIL;
        fol_sentences_datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = fol_sentences_datum;
            SubLObject v_term = NIL;
            SubLObject fol_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list136);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list136);
            fol_sentence = current.first();
            current = current.rest();
            final SubLObject unhandled_fol_sentences = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list136);
            current = current.rest();
            if (NIL == current) {
                if (NIL != assertion_handles.assertion_p(v_term)) {
                    if ((NIL != fol_sentence) && (NIL == unhandled_fol_sentences)) {
                        results = cons(v_term, results);
                    } else {
                        format(T, $str137$____dropped_unhandled_fol_asserti, v_term);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list136);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fol_sentences_datum = cdolist_list_var.first();
        } 
        return results;
    }

    static private final SubLString $str_alt79$__finding_pred_or_coll_extent_for = makeString("  finding pred-or-coll-extent for: ~A~%");

    static private final SubLString $str_alt82$_5D_seconds_duration__ = makeString("~5D seconds duration~%");

    static private final SubLString $str_alt84$_S_and__S_are_not_lists_of_the_sa = makeString("~S and ~S are not lists of the same length");

    static private final SubLString $str_alt85$_____5D_training_gafs__ = makeString("~%~%~5D training gafs~%");

    static private final SubLString $str_alt86$_5D_training_terms__ = makeString("~5D training terms~%");

    static private final SubLString $str_alt87$_5D_training_rules__ = makeString("~5D training rules~%");

    static private final SubLString $str_alt88$_5D_training_predicates__ = makeString("~5D training predicates~%");

    static private final SubLString $str_alt89$_5D_evidence_gafs__ = makeString("~5D evidence gafs~%");

    static private final SubLString $str_alt90$_5D_evidence_terms__ = makeString("~5D evidence terms~%");

    static private final SubLString $str_alt91$_5D_types__ = makeString("~5D types~%");

    static private final SubLString $str_alt94$Finding_Alchemy_export_assertions = makeString("Finding Alchemy export assertions for training~%");

    static private final SubLString $str_alt96$__Finding_Alchemy_export_assertio = makeString("~%Finding Alchemy export assertions for rules~%");

    static private final SubLString $str_alt99$__Finding_Alchemy_export_assertio = makeString("~%Finding Alchemy export assertions for evidence~%");

    static private final SubLString $str_alt105$____dropped_gaf_from_export_becau = makeString("    dropped gaf from export because ~A is not an allowed type:~%      ~A~%");

    static private final SubLString $str_alt106$Exporting_Alchemy_gaf_file__A__ = makeString("Exporting Alchemy gaf file ~A~%");

    static private final SubLString $str_alt107$__considering_____A__ = makeString("~%considering :  ~A~%");

    static private final SubLString $str_alt108$_____A_is_not_an_allowed_type__ = makeString("    ~A is not an allowed type~%");

    static private final SubLString $str_alt109$_____A_is_not_a_reified_predicate = makeString("    ~A is not a reified predicate~%");

    static private final SubLString $str_alt110$____dropped_rule_from_export____A = makeString("    dropped rule from export:  ~A~%");

    static private final SubLList $list_alt111 = list(makeSymbol("TRAINING-FOL-PREDICATES"), makeSymbol("TRAINING-FOL-ARGUMENTS"));

    static private final SubLString $str_alt112$Exporting_Alchemy_rules_file__A__ = makeString("Exporting Alchemy rules file ~A~%");

    static private final SubLList $list_alt113 = list(makeSymbol("ALL-FOL-PREDICATES"), makeSymbol("ALL-FOL-ARGUMENTS"));

    static private final SubLList $list_alt114 = list(makeSymbol("FOL-PREDICATE-FN"), makeSymbol("PREDICATE"), makeSymbol("ARITY"));

    /**
     * Returns the given list of training ASSERTIONS removing those (#$isa <predicate> <anything>)
     * sentences in which the predicate's types have no exported constants.  #$comment and
     * #$cyclistNotes assertions are also removed.
     */
    @LispMethod(comment = "Returns the given list of training ASSERTIONS removing those (#$isa <predicate> <anything>)\r\nsentences in which the predicate\'s types have no exported constants.  #$comment and\r\n#$cyclistNotes assertions are also removed.\nReturns the given list of training ASSERTIONS removing those (#$isa <predicate> <anything>)\nsentences in which the predicate\'s types have no exported constants.  #$comment and\n#$cyclistNotes assertions are also removed.")
    public static final SubLObject alchemy_export_filter_training_isa_gafs_alt(SubLObject assertions, SubLObject type_dictionary, SubLObject term_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = assertions;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, ASSERTION_P);
                    }
                }
            }
            SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
            SubLTrampolineFile.checkType(term_set, SET_P);
            {
                SubLObject filtered_assertions = NIL;
                SubLObject v_term = NIL;
                SubLObject predicate = NIL;
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                    if (cycl_utilities.formula_arg0(assertion) == $$isa) {
                        v_term = cycl_utilities.formula_arg1(assertion, UNPROVIDED);
                        if (NIL != fort_types_interface.predicate_p(v_term)) {
                            {
                                SubLObject all_types_presentP = NIL;
                                predicate = v_term;
                                all_types_presentP = T;
                                if (NIL != forts.fort_p(predicate)) {
                                    {
                                        SubLObject types = NIL;
                                        types = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_predicate_arg_constraints(predicate, arity.arity(predicate));
                                        format(T, $str_alt139$__predicate__A__types__A__, predicate, types);
                                        {
                                            SubLObject cdolist_list_var_88 = types;
                                            SubLObject type = NIL;
                                            for (type = cdolist_list_var_88.first(); NIL != cdolist_list_var_88; cdolist_list_var_88 = cdolist_list_var_88.rest() , type = cdolist_list_var_88.first()) {
                                                if (NIL == dictionary_utilities.dictionary_has_keyP(type_dictionary, type)) {
                                                    com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_dictionary_enter(type_dictionary, type, NIL, assertion);
                                                    if (NIL != list_utilities.simple_tree_findP($$FOL_UnhandledFn, folification.fol_transform_arg(type))) {
                                                        format(T, $str_alt126$_____A_cannot_be_folified__, type);
                                                        all_types_presentP = NIL;
                                                    } else {
                                                        {
                                                            SubLObject set_contents_var = set.do_set_internal(term_set);
                                                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                            SubLObject state = NIL;
                                                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                {
                                                                    SubLObject v_term_89 = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, v_term_89)) {
                                                                        if (NIL != com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_isa_term_type(v_term_89, type)) {
                                                                            format(T, $str_alt140$____adding_instance__A_of__A__, v_term_89, type);
                                                                            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_dictionary_pushnew(type_dictionary, type, v_term_89, assertion);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (NIL == dictionary.dictionary_lookup(type_dictionary, type, UNPROVIDED)) {
                                                    format(T, $str_alt141$_____A_is_not_instantiated__, type);
                                                    all_types_presentP = NIL;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    format(T, $str_alt109$_____A_is_not_a_reified_predicate, predicate);
                                    all_types_presentP = NIL;
                                }
                                if (NIL != all_types_presentP) {
                                    filtered_assertions = cons(assertion, filtered_assertions);
                                } else {
                                    format(T, $str_alt142$____dropped_gaf_from_export____A_, assertion);
                                }
                            }
                        } else {
                            filtered_assertions = cons(assertion, filtered_assertions);
                        }
                    } else {
                        if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(assertion), $alchemy_export_dropped_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            format(T, $str_alt142$____dropped_gaf_from_export____A_, assertion);
                        } else {
                            filtered_assertions = cons(assertion, filtered_assertions);
                        }
                    }
                }
                return filtered_assertions;
            }
        }
    }

    /**
     * Returns the given list of training ASSERTIONS removing those (#$isa <predicate> <anything>)
     * sentences in which the predicate's types have no exported constants.  #$comment and
     * #$cyclistNotes assertions are also removed.
     */
    @LispMethod(comment = "Returns the given list of training ASSERTIONS removing those (#$isa <predicate> <anything>)\r\nsentences in which the predicate\'s types have no exported constants.  #$comment and\r\n#$cyclistNotes assertions are also removed.\nReturns the given list of training ASSERTIONS removing those (#$isa <predicate> <anything>)\nsentences in which the predicate\'s types have no exported constants.  #$comment and\n#$cyclistNotes assertions are also removed.")
    public static SubLObject alchemy_export_filter_training_isa_gafs(final SubLObject assertions, final SubLObject type_dictionary, final SubLObject term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(assertions) : "! list_utilities.non_dotted_list_p(assertions) " + ("list_utilities.non_dotted_list_p(assertions) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(assertions) ") + assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        assert NIL != set.set_p(term_set) : "! set.set_p(term_set) " + ("set.set_p(term_set) " + "CommonSymbols.NIL != set.set_p(term_set) ") + term_set;
        SubLObject filtered_assertions = NIL;
        SubLObject v_term = NIL;
        SubLObject predicate = NIL;
        SubLObject cdolist_list_var2 = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (cycl_utilities.formula_arg0(assertion).eql($$isa)) {
                v_term = cycl_utilities.formula_arg1(assertion, UNPROVIDED);
                if (NIL != fort_types_interface.predicate_p(v_term)) {
                    SubLObject all_types_presentP = NIL;
                    predicate = v_term;
                    all_types_presentP = T;
                    if (NIL != forts.fort_p(predicate)) {
                        SubLObject types = NIL;
                        types = alchemy_predicate_arg_constraints(predicate, arity.arity(predicate));
                        format(T, $str139$__predicate__A__types__A__, predicate, types);
                        SubLObject cdolist_list_var_$94 = types;
                        SubLObject type = NIL;
                        type = cdolist_list_var_$94.first();
                        while (NIL != cdolist_list_var_$94) {
                            if (NIL == dictionary_utilities.dictionary_has_keyP(type_dictionary, type)) {
                                alchemy_export_type_dictionary_enter(type_dictionary, type, NIL, assertion);
                                if (NIL != list_utilities.simple_tree_findP($$FOL_UnhandledFn, folification.fol_transform_arg(type))) {
                                    format(T, $str126$_____A_cannot_be_folified__, type);
                                    all_types_presentP = NIL;
                                } else {
                                    final SubLObject set_contents_var = set.do_set_internal(term_set);
                                    SubLObject basis_object;
                                    SubLObject state;
                                    SubLObject v_term_$95;
                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        v_term_$95 = set_contents.do_set_contents_next(basis_object, state);
                                        if ((NIL != set_contents.do_set_contents_element_validP(state, v_term_$95)) && (NIL != alchemy_export_isa_term_type(v_term_$95, type))) {
                                            format(T, $str140$____adding_instance__A_of__A__, v_term_$95, type);
                                            alchemy_export_type_dictionary_pushnew(type_dictionary, type, v_term_$95, assertion);
                                        }
                                    }
                                }
                            }
                            if (NIL == dictionary.dictionary_lookup(type_dictionary, type, UNPROVIDED)) {
                                format(T, $str141$_____A_is_not_instantiated__, type);
                                all_types_presentP = NIL;
                            }
                            cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                            type = cdolist_list_var_$94.first();
                        } 
                    } else {
                        format(T, $str109$_____A_is_not_a_reified_predicate, predicate);
                        all_types_presentP = NIL;
                    }
                    if (NIL != all_types_presentP) {
                        filtered_assertions = cons(assertion, filtered_assertions);
                    } else {
                        format(T, $str142$____dropped_gaf_from_export____A_, assertion);
                    }
                } else {
                    filtered_assertions = cons(assertion, filtered_assertions);
                }
            } else
                if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(assertion), $alchemy_export_dropped_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    format(T, $str142$____dropped_gaf_from_export____A_, assertion);
                } else {
                    filtered_assertions = cons(assertion, filtered_assertions);
                }

            cdolist_list_var2 = cdolist_list_var2.rest();
            assertion = cdolist_list_var2.first();
        } 
        return filtered_assertions;
    }

    static private final SubLString $str_alt115$__dropping_predicate__A_having_ar = makeString("  dropping predicate ~A having arg constraint ~A which is not an allowed type~%");

    static private final SubLString $str_alt116$_A_must_be_a_GAF = makeString("~A must be a GAF");

    static private final SubLString $str_alt119$_A_is_not_a_valid_type__from_obj_ = makeString("~A is not a valid type, from obj: ~A");

    static private final SubLString $str_alt120$__augmenting_type__A__ = makeString("  augmenting type ~A~%");

    static private final SubLString $str_alt121$_A_is_not_a_valid_type = makeString("~A is not a valid type");

    static private final SubLString $str_alt122$____with__A__ = makeString("    with ~A~%");

    static private final SubLString $str_alt123$__Instantiated_types_in_the__A___ = makeString("~%Instantiated types in the ~A ~%");

    static private final SubLString $str_alt124$___A___A__ = makeString("  ~A  ~A~%");

    static private final SubLString $str_alt126$_____A_cannot_be_folified__ = makeString("    ~A cannot be folified~%");

    static private final SubLString $str_alt127$_____A_is_not_instantiated_in_ter = makeString("    ~A is not instantiated in term-set~%");

    static private final SubLString $str_alt128$________adding_instance__A_of__A_ = makeString("        adding instance ~A of ~A~%");

    static private final SubLString $str_alt129$____hl_variable__A_cannot_be_inst = makeString("    hl variable ~A cannot be instantiated with training terms~%");

    static private final SubLString $str_alt130$____dropped_numeric_term_assertio = makeString("    dropped numeric-term assertion from export:  ~A~%");

    static private final SubLList $list_alt132 = list(NIL);

    static private final SubLList $list_alt134 = list(new SubLObject[]{ makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), T });

    static private final SubLList $list_alt136 = list(makeSymbol("TERM"), makeSymbol("FOL-SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("UNHANDLED-FOL-SENTENCES"));

    static private final SubLString $str_alt137$____dropped_unhandled_fol_asserti = makeString("    dropped unhandled-fol assertion from export: ~A~%~%");

    static private final SubLList $list_alt138 = list(reader_make_constant_shell("comment"), reader_make_constant_shell("cyclistNotes"), reader_make_constant_shell("cycSecureDocString"), reader_make_constant_shell("examples-Negative"));

    static private final SubLString $str_alt139$__predicate__A__types__A__ = makeString("  predicate ~A  types ~A~%");

    static private final SubLString $str_alt140$____adding_instance__A_of__A__ = makeString("    adding instance ~A of ~A~%");

    static private final SubLString $str_alt141$_____A_is_not_instantiated__ = makeString("    ~A is not instantiated~%");

    static private final SubLString $str_alt142$____dropped_gaf_from_export____A_ = makeString("    dropped gaf from export:  ~A~%");

    static private final SubLString $str_alt143$_____A_is_not_a_training_type__ = makeString("    ~A is not a training type~%");

    static private final SubLString $str_alt144$_____A_is_not_a_training_type____ = makeString("    ~A is not a training type~%    dropped gaf from export:  ~A~%");

    static private final SubLString $str_alt145$____dropped_evidence_gaf_from_exp = makeString("    dropped evidence gaf from export because ~A is not an allowed predicate:~%      ~A~%");

    static private final SubLString $str_alt149$invalid_instances_for_arg_constra = makeString("invalid instances for arg-constraint ~A");

    static private final SubLString $str_alt150$___groundings___10D_fol_predicate = makeString("   groundings: ~10D fol-predicate: ~A ");

    static private final SubLString $str_alt151$_arg_types___A = makeString(" arg-types: ~A");

    static private final SubLString $str_alt152$___total_groundings___12D__ = makeString("   total groundings: ~12D~%");

    static private final SubLString $str_alt153$_ = makeString("(");

    static private final SubLString $str_alt154$_ = makeString(",");

    static private final SubLString $str_alt155$_ = makeString(")");

    static private final SubLString $str_alt157$Can_t_convert_non_predicate_non_c = makeString("Can't convert non-predicate non-collection to FOL predicate: ~S");

    static private final SubLString $str_alt158$_mln = makeString(".mln");

    /**
     * Returns the given list of evidence ASSERTIONS removing those (#$isa <predicate> <anything>)
     * sentences in which the predicate's types have no exported constants.  Removes (#$isa <term> <type>) assertions in which
     * <type> is not a training type.  Also removes certain dropped predicates.
     */
    @LispMethod(comment = "Returns the given list of evidence ASSERTIONS removing those (#$isa <predicate> <anything>)\r\nsentences in which the predicate\'s types have no exported constants.  Removes (#$isa <term> <type>) assertions in which\r\n<type> is not a training type.  Also removes certain dropped predicates.\nReturns the given list of evidence ASSERTIONS removing those (#$isa <predicate> <anything>)\nsentences in which the predicate\'s types have no exported constants.  Removes (#$isa <term> <type>) assertions in which\n<type> is not a training type.  Also removes certain dropped predicates.")
    public static final SubLObject alchemy_export_filter_evidence_isa_gafs_alt(SubLObject assertions, SubLObject type_dictionary, SubLObject term_set, SubLObject training_type_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = assertions;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, ASSERTION_P);
                    }
                }
            }
            SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
            SubLTrampolineFile.checkType(term_set, SET_P);
            {
                SubLObject filtered_assertions = NIL;
                SubLObject v_term = NIL;
                SubLObject predicate = NIL;
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                    if (cycl_utilities.formula_arg0(assertion) == $$isa) {
                        v_term = cycl_utilities.formula_arg1(assertion, UNPROVIDED);
                        if (NIL != fort_types_interface.predicate_p(v_term)) {
                            {
                                SubLObject all_types_presentP = NIL;
                                predicate = v_term;
                                all_types_presentP = T;
                                if (NIL != forts.fort_p(predicate)) {
                                    {
                                        SubLObject types = NIL;
                                        types = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_predicate_arg_constraints(predicate, arity.arity(predicate));
                                        format(T, $str_alt139$__predicate__A__types__A__, predicate, types);
                                        {
                                            SubLObject cdolist_list_var_90 = types;
                                            SubLObject type = NIL;
                                            for (type = cdolist_list_var_90.first(); NIL != cdolist_list_var_90; cdolist_list_var_90 = cdolist_list_var_90.rest() , type = cdolist_list_var_90.first()) {
                                                if (NIL != dictionary_utilities.dictionary_has_keyP(training_type_dictionary, type)) {
                                                    if (NIL == dictionary_utilities.dictionary_has_keyP(type_dictionary, type)) {
                                                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_dictionary_enter(type_dictionary, type, NIL, assertion);
                                                        if (NIL != list_utilities.simple_tree_findP($$FOL_UnhandledFn, folification.fol_transform_arg(type))) {
                                                            format(T, $str_alt126$_____A_cannot_be_folified__, type);
                                                            all_types_presentP = NIL;
                                                        }
                                                    }
                                                    if (NIL == dictionary.dictionary_lookup(type_dictionary, type, UNPROVIDED)) {
                                                        format(T, $str_alt141$_____A_is_not_instantiated__, type);
                                                        all_types_presentP = NIL;
                                                    }
                                                } else {
                                                    format(T, $str_alt143$_____A_is_not_a_training_type__, type);
                                                    all_types_presentP = NIL;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    format(T, $str_alt109$_____A_is_not_a_reified_predicate, predicate);
                                    all_types_presentP = NIL;
                                }
                                if (NIL != all_types_presentP) {
                                    filtered_assertions = cons(assertion, filtered_assertions);
                                } else {
                                    format(T, $str_alt142$____dropped_gaf_from_export____A_, assertion);
                                }
                            }
                        } else {
                            {
                                SubLObject type = cycl_utilities.formula_arg2(assertion, UNPROVIDED);
                                if (NIL != dictionary_utilities.dictionary_has_keyP(training_type_dictionary, type)) {
                                    filtered_assertions = cons(assertion, filtered_assertions);
                                } else {
                                    format(T, $str_alt144$_____A_is_not_a_training_type____, type, assertion);
                                }
                            }
                        }
                    } else {
                        if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(assertion), $alchemy_export_dropped_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            format(T, $str_alt142$____dropped_gaf_from_export____A_, assertion);
                        } else {
                            filtered_assertions = cons(assertion, filtered_assertions);
                        }
                    }
                }
                return filtered_assertions;
            }
        }
    }

    /**
     * Returns the given list of evidence ASSERTIONS removing those (#$isa <predicate> <anything>)
     * sentences in which the predicate's types have no exported constants.  Removes (#$isa <term> <type>) assertions in which
     * <type> is not a training type.  Also removes certain dropped predicates.
     */
    @LispMethod(comment = "Returns the given list of evidence ASSERTIONS removing those (#$isa <predicate> <anything>)\r\nsentences in which the predicate\'s types have no exported constants.  Removes (#$isa <term> <type>) assertions in which\r\n<type> is not a training type.  Also removes certain dropped predicates.\nReturns the given list of evidence ASSERTIONS removing those (#$isa <predicate> <anything>)\nsentences in which the predicate\'s types have no exported constants.  Removes (#$isa <term> <type>) assertions in which\n<type> is not a training type.  Also removes certain dropped predicates.")
    public static SubLObject alchemy_export_filter_evidence_isa_gafs(final SubLObject assertions, final SubLObject type_dictionary, final SubLObject term_set, final SubLObject training_type_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(assertions) : "! list_utilities.non_dotted_list_p(assertions) " + ("list_utilities.non_dotted_list_p(assertions) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(assertions) ") + assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        assert NIL != set.set_p(term_set) : "! set.set_p(term_set) " + ("set.set_p(term_set) " + "CommonSymbols.NIL != set.set_p(term_set) ") + term_set;
        SubLObject filtered_assertions = NIL;
        SubLObject v_term = NIL;
        SubLObject predicate = NIL;
        SubLObject cdolist_list_var2 = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (cycl_utilities.formula_arg0(assertion).eql($$isa)) {
                v_term = cycl_utilities.formula_arg1(assertion, UNPROVIDED);
                if (NIL != fort_types_interface.predicate_p(v_term)) {
                    SubLObject all_types_presentP = NIL;
                    predicate = v_term;
                    all_types_presentP = T;
                    if (NIL != forts.fort_p(predicate)) {
                        SubLObject types = NIL;
                        types = alchemy_predicate_arg_constraints(predicate, arity.arity(predicate));
                        format(T, $str139$__predicate__A__types__A__, predicate, types);
                        SubLObject cdolist_list_var_$96 = types;
                        SubLObject type = NIL;
                        type = cdolist_list_var_$96.first();
                        while (NIL != cdolist_list_var_$96) {
                            if (NIL != dictionary_utilities.dictionary_has_keyP(training_type_dictionary, type)) {
                                if (NIL == dictionary_utilities.dictionary_has_keyP(type_dictionary, type)) {
                                    alchemy_export_type_dictionary_enter(type_dictionary, type, NIL, assertion);
                                    if (NIL != list_utilities.simple_tree_findP($$FOL_UnhandledFn, folification.fol_transform_arg(type))) {
                                        format(T, $str126$_____A_cannot_be_folified__, type);
                                        all_types_presentP = NIL;
                                    }
                                }
                                if (NIL == dictionary.dictionary_lookup(type_dictionary, type, UNPROVIDED)) {
                                    format(T, $str141$_____A_is_not_instantiated__, type);
                                    all_types_presentP = NIL;
                                }
                            } else {
                                format(T, $str143$_____A_is_not_a_training_type__, type);
                                all_types_presentP = NIL;
                            }
                            cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                            type = cdolist_list_var_$96.first();
                        } 
                    } else {
                        format(T, $str109$_____A_is_not_a_reified_predicate, predicate);
                        all_types_presentP = NIL;
                    }
                    if (NIL != all_types_presentP) {
                        filtered_assertions = cons(assertion, filtered_assertions);
                    } else {
                        format(T, $str142$____dropped_gaf_from_export____A_, assertion);
                    }
                } else {
                    final SubLObject type2 = cycl_utilities.formula_arg2(assertion, UNPROVIDED);
                    if (NIL != dictionary_utilities.dictionary_has_keyP(training_type_dictionary, type2)) {
                        filtered_assertions = cons(assertion, filtered_assertions);
                    } else {
                        format(T, $str144$_____A_is_not_a_training_type____, type2, assertion);
                    }
                }
            } else
                if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(assertion), $alchemy_export_dropped_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    format(T, $str142$____dropped_gaf_from_export____A_, assertion);
                } else {
                    filtered_assertions = cons(assertion, filtered_assertions);
                }

            cdolist_list_var2 = cdolist_list_var2.rest();
            assertion = cdolist_list_var2.first();
        } 
        return filtered_assertions;
    }

    static private final SubLString $str_alt159$_db = makeString(".db");

    static private final SubLString $str_alt160$__exporting_type___A___A__ = makeString("  exporting type: ~A  ~A~%");

    static private final SubLString $str_alt161$____ = makeString(" = {");

    static private final SubLString $str_alt162$__ = makeString(", ");

    static private final SubLString $str_alt163$_ = makeString("}");

    static private final SubLList $list_alt165 = list(makeSymbol("PREDICATES"), makeSymbol("ARGUMENTS"));

    static private final SubLString $str_alt166$_S_is_not_a_valid_value_for__alch = makeString("~S is not a valid value for *alchemy-export-cafs-or-rules?*");

    static private final SubLList $list_alt168 = list(makeKeyword("COLLAPSE"), reader_make_constant_shell("EverythingPSC"));

    static private final SubLList $list_alt177 = list(makeSymbol("LEFT-SIDE"), makeSymbol("RIGHT-SIDE"));

    static private final SubLList $list_alt180 = list(makeSymbol("VAR"), makeSymbol("SENT"));

    static private final SubLString $str_alt181$_ = makeString(" ");

    static private final SubLString $str_alt182$_ = makeString(".");

    static private final SubLString $str_alt184$_ = makeString("!");

    static private final SubLString $str_alt185$___ = makeString(" ^ ");

    static private final SubLString $str_alt186$_v_ = makeString(" v ");

    static private final SubLString $str_alt187$____ = makeString(" => ");

    static private final SubLString $str_alt188$_____ = makeString(" <=> ");

    static private final SubLString $str_alt189$forall_ = makeString("forall ");

    static private final SubLString $str_alt190$exist_ = makeString("exist ");

    static private final SubLString $str_alt191$Don_t_know_how_to_export_the_sent = makeString("Don't know how to export the sentential relation ~S to alchemy.");

    public static final SubLSymbol $kw193$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt196$Don_t_know_how_to_export_the_type = makeString("Don't know how to export the type ~S to alchemy.");

    static private final SubLString $str_alt197$Don_t_know_how_to_export_the_pred = makeString("Don't know how to export the predicate ~S to alchemy.");

    static private final SubLString $str_alt198$Don_t_know_how_to_export_the_term = makeString("Don't know how to export the term ~S to alchemy.");

    static private final SubLString $str_alt199$C_ = makeString("C_");

    static private final SubLString $str_alt200$HLID_ = makeString("HLID_");

    static private final SubLList $list_alt201 = list(makeSymbol("FOL-ATOMIC-TERM-FN"), makeSymbol("CONSTANT"));

    static private final SubLString $str_alt202$Tried_to_convert_the_EL_variable_ = makeString("Tried to convert the EL variable ~S to Alchemy text and got ~S");

    static private final SubLString $str_alt203$_ = makeString("\"");

    static private final SubLList $list_alt204 = list(makeSymbol("FOL-STRING-FN"), makeSymbol("STRING"));

    static private final SubLList $list_alt205 = list(makeSymbol("FOL-NUMBER-FN"), makeSymbol("NUMBER"));

    static private final SubLString $str_alt206$_F = makeString("~F");

    static private final SubLString $str_alt207$_D = makeString("~D");

    static private final SubLString $str_alt209$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/regression-tests/");

    static private final SubLList $list_alt211 = list(makeSymbol("ALCHEMY-EXPORT"), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoRulesMt"))), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoTrainingGAFsMt"))), list(QUOTE, list(list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoEvidenceGAFsMt")))), makeString("A-rules.mln"), makeString("A-train.db"), list(QUOTE, list(makeString("A-evid.db"))));

    /**
     * Returns the list of GAFS after removing those whose arg0 is not a predicate
     * in the list of FOL-PREDICATES.
     */
    @LispMethod(comment = "Returns the list of GAFS after removing those whose arg0 is not a predicate\r\nin the list of FOL-PREDICATES.\nReturns the list of GAFS after removing those whose arg0 is not a predicate\nin the list of FOL-PREDICATES.")
    public static final SubLObject alchemy_export_filter_evidence_gafs_alt(SubLObject gafs, SubLObject fol_predicates) {
        {
            SubLObject list_var = gafs;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, ASSERTION_P);
                }
            }
        }
        {
            SubLObject list_var = fol_predicates;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, CONSP);
                }
            }
        }
        {
            SubLObject filtered_gafs = NIL;
            SubLObject allowed_predicates = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            {
                SubLObject cdolist_list_var = fol_predicates;
                SubLObject fol_predicate = NIL;
                for (fol_predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fol_predicate = cdolist_list_var.first()) {
                    {
                        SubLObject datum = fol_predicate;
                        SubLObject current = datum;
                        SubLObject fol_predicate_fn = NIL;
                        SubLObject predicate = NIL;
                        SubLObject v_arity = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt114);
                        fol_predicate_fn = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt114);
                        predicate = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt114);
                        v_arity = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            set.set_add(predicate, allowed_predicates);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt114);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                    {
                        SubLObject expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(gaf), $$InferencePSC);
                        if (NIL != set.set_memberP(cycl_utilities.formula_arg0(expanded_el_formula), allowed_predicates)) {
                            filtered_gafs = cons(gaf, filtered_gafs);
                        } else {
                            format(T, $str_alt145$____dropped_evidence_gaf_from_exp, cycl_utilities.formula_arg0(expanded_el_formula), gaf);
                        }
                    }
                }
            }
            return filtered_gafs;
        }
    }

    /**
     * Returns the list of GAFS after removing those whose arg0 is not a predicate
     * in the list of FOL-PREDICATES.
     */
    @LispMethod(comment = "Returns the list of GAFS after removing those whose arg0 is not a predicate\r\nin the list of FOL-PREDICATES.\nReturns the list of GAFS after removing those whose arg0 is not a predicate\nin the list of FOL-PREDICATES.")
    public static SubLObject alchemy_export_filter_evidence_gafs(final SubLObject gafs, final SubLObject fol_predicates) {
        assert NIL != list_utilities.non_dotted_list_p(gafs) : "! list_utilities.non_dotted_list_p(gafs) " + ("list_utilities.non_dotted_list_p(gafs) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(gafs) ") + gafs;
        SubLObject cdolist_list_var = gafs;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(fol_predicates) : "! list_utilities.non_dotted_list_p(fol_predicates) " + ("list_utilities.non_dotted_list_p(fol_predicates) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(fol_predicates) ") + fol_predicates;
        cdolist_list_var = fol_predicates;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != consp(elem) : "! consp(elem) " + ("Types.consp(elem) " + "CommonSymbols.NIL != Types.consp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject filtered_gafs = NIL;
        final SubLObject allowed_predicates = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var2 = fol_predicates;
        SubLObject fol_predicate = NIL;
        fol_predicate = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = fol_predicate;
            SubLObject fol_predicate_fn = NIL;
            SubLObject predicate = NIL;
            SubLObject v_arity = NIL;
            destructuring_bind_must_consp(current, datum, $list114);
            fol_predicate_fn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list114);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list114);
            v_arity = current.first();
            current = current.rest();
            if (NIL == current) {
                set.set_add(predicate, allowed_predicates);
            } else {
                cdestructuring_bind_error(datum, $list114);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            fol_predicate = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(gaf), $$InferencePSC);
            if (NIL != set.set_memberP(cycl_utilities.formula_arg0(expanded_el_formula), allowed_predicates)) {
                filtered_gafs = cons(gaf, filtered_gafs);
            } else {
                format(T, $str145$____dropped_evidence_gaf_from_exp, cycl_utilities.formula_arg0(expanded_el_formula), gaf);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            gaf = cdolist_list_var2.first();
        } 
        return filtered_gafs;
    }

    static private final SubLList $list_alt213 = list(makeSymbol("ALCHEMY-EXPORT"), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistRulesMt"))), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistTrainingDataMt"))), list(QUOTE, list(list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistTestingDataMt")))), makeString("B-rules.mln"), makeString("B-train.db"), list(QUOTE, list(makeString("B-evid.db"))));

    static private final SubLList $list_alt215 = list(makeSymbol("ALCHEMY-EXPORT"), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("TheSimpsonsMt"))), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("TheSimpsonsMt"))), list(QUOTE, list(list(makeKeyword("IN-MT"), reader_make_constant_shell("TheSimpsonsMt")))), makeString("C-rules.mln"), makeString("C-train.db"), list(QUOTE, list(makeString("C-evid.db"))));

    static private final SubLList $list_alt217 = list(makeSymbol("ALCHEMY-EXPORT"), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AcademicOrganizationMt"))), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("UniversityDataMt"))), list(QUOTE, list(list(makeKeyword("IN-MT"), reader_make_constant_shell("UniversityDataMt")))), makeString("D-rules.mln"), makeString("D-train.db"), list(QUOTE, list(makeString("D-evid.db"))));

    static private final SubLList $list_alt219 = list(makeSymbol("ALCHEMY-EXPORT"), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoIIRulesMt"))), list(QUOTE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AustinAreaMt"))), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), makeKeyword("IN-MT"), list(makeSymbol("CANONICALIZE-TERM"), list(QUOTE, list(reader_make_constant_shell("ContentMtFn"), reader_make_constant_shell("WashingtonPostEntertainmentGuide-KS")))))), makeString("E-rules.mln"), makeString("E-train.db"), list(QUOTE, list(makeString("E-evid.db"))));

    static private final SubLString $str_alt220$_scratch_alchemytemp_cyc_projects = makeString("/scratch/alchemytemp/cyc/projects/transfer-learning/Software/Alchemy/mods/regression-tests/");

    static private final SubLString $str_alt221$Got_invalid_regression_test_name_ = makeString("Got invalid regression test name: ~S.");

    static private final SubLString $str_alt223$_S__ = makeString("~S~%");

    static private final SubLList $list_alt224 = list(makeKeyword("INTERSECTION"), $RULE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AcademicOrganizationMt")));

    /**
     * Write out an Alchemy rules file, including predicate declarations and rules.
     *
     * @return listp; all of the types that were chosen as arg-constraints to the predicates
     */
    @LispMethod(comment = "Write out an Alchemy rules file, including predicate declarations and rules.\r\n\r\n@return listp; all of the types that were chosen as arg-constraints to the predicates")
    public static final SubLObject ae_export_rules_file_alt(SubLObject analysis, SubLObject fol_predicates, SubLObject training_type_dictionary, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject types = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt6$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_91 = stream;
                        types = com.cyc.cycjava.cycl.butler.alchemy_export.ae_predicate_declarations_to_stream(fol_predicates, training_type_dictionary, stream_91);
                        {
                            SubLObject _prev_bind_0 = $alchemy_export_cafs_or_rulesP$.currentBinding(thread);
                            try {
                                $alchemy_export_cafs_or_rulesP$.bind($RULES, thread);
                                folification.fol_sentences_to_stream(analysis, $ALCHEMY, stream_91);
                            } finally {
                                $alchemy_export_cafs_or_rulesP$.rebind(_prev_bind_0, thread);
                            }
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
                return types;
            }
        }
    }

    /**
     * Write out an Alchemy rules file, including predicate declarations and rules.
     *
     * @return listp; all of the types that were chosen as arg-constraints to the predicates
     */
    @LispMethod(comment = "Write out an Alchemy rules file, including predicate declarations and rules.\r\n\r\n@return listp; all of the types that were chosen as arg-constraints to the predicates")
    public static SubLObject ae_export_rules_file(final SubLObject analysis, final SubLObject fol_predicates, final SubLObject training_type_dictionary, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str6$Unable_to_open__S, filename);
            }
            final SubLObject stream_$97 = stream;
            types = ae_predicate_declarations_to_stream(fol_predicates, training_type_dictionary, stream_$97);
            final SubLObject _prev_bind_0 = $alchemy_export_cafs_or_rulesP$.currentBinding(thread);
            try {
                $alchemy_export_cafs_or_rulesP$.bind($RULES, thread);
                folification.fol_sentences_to_stream(analysis, $ALCHEMY, stream_$97);
            } finally {
                $alchemy_export_cafs_or_rulesP$.rebind(_prev_bind_0, thread);
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
        return types;
    }

    static private final SubLList $list_alt225 = list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("UniversityDataMt")));

    static private final SubLList $list_alt226 = list(list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("UniversityDataMt"))));

    static private final SubLString $str_alt227$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyc-univ-rules.mln");

    static private final SubLString $str_alt228$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyc-univ-train.db");

    static private final SubLList $list_alt229 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyc-univ-evid.db"));

    static private final SubLList $list_alt230 = list(makeKeyword("INTERSECTION"), $RULE, list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistRulesMt")));

    static private final SubLList $list_alt231 = list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistTrainingDataMt")));

    static private final SubLList $list_alt232 = list(list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyCyclistTestingDataMt"))));

    /**
     *
     *
     * @return listp; all of the types that were chosen as arg-constraints to the predicates
     */
    @LispMethod(comment = "@return listp; all of the types that were chosen as arg-constraints to the predicates")
    public static final SubLObject ae_predicate_declarations_to_stream_alt(SubLObject fol_predicates, SubLObject training_type_dictionary, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject types = NIL;
                SubLObject arg_constraints = NIL;
                SubLObject nbr_groundings = NIL;
                SubLObject total_groundings = ZERO_INTEGER;
                SubLObject v_instances = NIL;
                SubLObject cdolist_list_var = fol_predicates;
                SubLObject fol_predicate = NIL;
                for (fol_predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fol_predicate = cdolist_list_var.first()) {
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        arg_constraints = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_predicate_declaration_to_stream(fol_predicate, stream);
                                        nbr_groundings = ONE_INTEGER;
                                        {
                                            SubLObject cdolist_list_var_92 = arg_constraints;
                                            SubLObject arg_constraint = NIL;
                                            for (arg_constraint = cdolist_list_var_92.first(); NIL != cdolist_list_var_92; cdolist_list_var_92 = cdolist_list_var_92.rest() , arg_constraint = cdolist_list_var_92.first()) {
                                                v_instances = dictionary.dictionary_lookup(training_type_dictionary, arg_constraint, UNPROVIDED);
                                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                    if (!v_instances.isCons()) {
                                                        Errors.error($str_alt149$invalid_instances_for_arg_constra, arg_constraint);
                                                    }
                                                }
                                                nbr_groundings = multiply(nbr_groundings, length(v_instances));
                                            }
                                        }
                                        total_groundings = add(total_groundings, nbr_groundings);
                                        format(T, $str_alt150$___groundings___10D_fol_predicate, nbr_groundings, fol_predicate);
                                        format(T, $str_alt151$_arg_types___A, arg_constraints);
                                        types = nconc(arg_constraints, types);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                    }
                    terpri(UNPROVIDED);
                }
                format(T, $str_alt152$___total_groundings___12D__, total_groundings);
                return list_utilities.fast_delete_duplicates(types, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return listp; all of the types that were chosen as arg-constraints to the predicates
     */
    @LispMethod(comment = "@return listp; all of the types that were chosen as arg-constraints to the predicates")
    public static SubLObject ae_predicate_declarations_to_stream(final SubLObject fol_predicates, final SubLObject training_type_dictionary, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = NIL;
        SubLObject arg_constraints = NIL;
        SubLObject nbr_groundings = NIL;
        SubLObject total_groundings = ZERO_INTEGER;
        SubLObject v_instances = NIL;
        SubLObject cdolist_list_var = fol_predicates;
        SubLObject fol_predicate = NIL;
        fol_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        arg_constraints = alchemy_predicate_declaration_to_stream(fol_predicate, stream);
                        nbr_groundings = ONE_INTEGER;
                        SubLObject cdolist_list_var_$98 = arg_constraints;
                        SubLObject arg_constraint = NIL;
                        arg_constraint = cdolist_list_var_$98.first();
                        while (NIL != cdolist_list_var_$98) {
                            v_instances = dictionary.dictionary_lookup(training_type_dictionary, arg_constraint, UNPROVIDED);
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!v_instances.isCons())) {
                                Errors.error($str149$invalid_instances_for_arg_constra, arg_constraint);
                            }
                            nbr_groundings = multiply(nbr_groundings, length(v_instances));
                            cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                            arg_constraint = cdolist_list_var_$98.first();
                        } 
                        total_groundings = add(total_groundings, nbr_groundings);
                        format(T, $str150$___groundings___10D_fol_predicate, nbr_groundings, fol_predicate);
                        format(T, $str151$_arg_types___A, arg_constraints);
                        types = nconc(arg_constraints, types);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            terpri(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            fol_predicate = cdolist_list_var.first();
        } 
        format(T, $str152$___total_groundings___12D__, total_groundings);
        return list_utilities.fast_delete_duplicates(types, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    static private final SubLString $str_alt233$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyclist-rules.mln");

    static private final SubLString $str_alt234$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyclist-train.db");

    static private final SubLList $list_alt235 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyclist-evid.db"));

    static private final SubLList $list_alt236 = list(makeKeyword("INTERSECTION"), $RULE, list(makeKeyword("IN-MT"), reader_make_constant_shell("UnitedStatesGeographyMt")));

    static private final SubLList $list_alt237 = list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("AustinAreaMt")));

    static private final SubLList $list_alt238 = list(list(makeKeyword("INTERSECTION"), makeKeyword("GAF"), list(makeKeyword("IN-MT"), reader_make_constant_shell("AustinAreaMt"))));

    static private final SubLString $str_alt239$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin-rules.mln");

    static private final SubLString $str_alt240$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin-train.db");

    static private final SubLList $list_alt241 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin-evid.db"));

    static private final SubLList $list_alt242 = list(makeKeyword("IN-MT"), reader_make_constant_shell("UnitedStatesGeographyMt"));

    static private final SubLList $list_alt243 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AustinAreaMt"));

    static private final SubLList $list_alt244 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("AustinAreaMt")));

    static private final SubLString $str_alt245$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin2-rules.mln");

    static private final SubLString $str_alt246$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin2-train.db");

    static private final SubLList $list_alt247 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin2-evid.db"));

    static private final SubLList $list_alt248 = list(makeKeyword("IN-MT"), reader_make_constant_shell("BuildingMt"));

    static private final SubLList $list_alt249 = list(makeKeyword("IN-MT"), reader_make_constant_shell("UrbanCombatGame-UCTApartmentsMapMt"));

    static private final SubLList $list_alt250 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("UrbanCombatGame-UCTApartmentsMapMt")));

    static private final SubLString $str_alt251$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-buildingmt-rules.mln");

    /**
     *
     *
     * @return listp; all of the types that were chosen as arg-constraints to the predicate
     */
    @LispMethod(comment = "@return listp; all of the types that were chosen as arg-constraints to the predicate")
    public static final SubLObject alchemy_predicate_declaration_to_stream_alt(SubLObject fol_predicate, SubLObject stream) {
        {
            SubLObject datum = fol_predicate;
            SubLObject current = datum;
            SubLObject fol_predicate_fn = NIL;
            SubLObject predicate = NIL;
            SubLObject v_arity = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt114);
            fol_predicate_fn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt114);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt114);
            v_arity = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject constraints_by_argpos = com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_predicate_arg_constraints(predicate, v_arity);
                    terpri(stream);
                    if (NIL == constant_p(predicate)) {
                        terpri(stream);
                        folification.output_alchemy_term_comment(predicate, stream);
                        terpri(stream);
                    }
                    princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_predicate_with_arity(predicate, v_arity), stream);
                    princ($str_alt153$_, stream);
                    {
                        SubLObject first_constraintP = T;
                        SubLObject cdolist_list_var = constraints_by_argpos;
                        SubLObject constraint = NIL;
                        for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                            if (NIL == first_constraintP) {
                                princ($str_alt154$_, stream);
                            }
                            princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type(constraint), stream);
                            first_constraintP = NIL;
                        }
                    }
                    princ($str_alt155$_, stream);
                    return constraints_by_argpos;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt114);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; all of the types that were chosen as arg-constraints to the predicate
     */
    @LispMethod(comment = "@return listp; all of the types that were chosen as arg-constraints to the predicate")
    public static SubLObject alchemy_predicate_declaration_to_stream(final SubLObject fol_predicate, final SubLObject stream) {
        SubLObject fol_predicate_fn = NIL;
        SubLObject predicate = NIL;
        SubLObject v_arity = NIL;
        destructuring_bind_must_consp(fol_predicate, fol_predicate, $list114);
        fol_predicate_fn = fol_predicate.first();
        SubLObject current = fol_predicate.rest();
        destructuring_bind_must_consp(current, fol_predicate, $list114);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, fol_predicate, $list114);
        v_arity = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject constraints_by_argpos = alchemy_predicate_arg_constraints(predicate, v_arity);
            terpri(stream);
            if (NIL == constant_p(predicate)) {
                terpri(stream);
                folification.output_alchemy_term_comment(predicate, stream);
                terpri(stream);
            }
            princ(alchemy_export_predicate_with_arity(predicate, v_arity), stream);
            princ($str153$_, stream);
            SubLObject first_constraintP = T;
            SubLObject cdolist_list_var = constraints_by_argpos;
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == first_constraintP) {
                    princ($str154$_, stream);
                }
                princ(alchemy_export_type(constraint), stream);
                first_constraintP = NIL;
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            } 
            princ($str155$_, stream);
            return constraints_by_argpos;
        }
        cdestructuring_bind_error(fol_predicate, $list114);
        return NIL;
    }

    static private final SubLString $str_alt252$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-buildingmt-train.db");

    static private final SubLList $list_alt253 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-buildingmt-evid.db"));

    static private final SubLList $list_alt254 = list(makeKeyword("IN-MT"), reader_make_constant_shell("MassMediaMt"));

    static private final SubLList $list_alt255 = list(makeKeyword("IN-MT"), reader_make_constant_shell("MassMediaDataMt"));

    static private final SubLList $list_alt256 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("Starseeker-ActorsKSMt")));

    static private final SubLString $str_alt257$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/movie-rules.mln");

    static private final SubLString $str_alt258$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/movie-train.db");

    static private final SubLList $list_alt259 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/movie-evid.db"));

    static private final SubLList $list_alt260 = list(makeKeyword("MENTIONS-INSTANTIATIONS-OF-AT-LEAST-N-TIMES"), reader_make_constant_shell("PredicateOrCollection-UsedInUCTRepresentation"), TWO_INTEGER);

    static private final SubLString $str_alt261$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-vocab-rules.mln");

    static private final SubLString $str_alt262$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-vocab-train.db");

    static private final SubLList $list_alt263 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-vocab-evid.db"));

    /**
     *
     *
     * @return listp of length ARITY, where the first element of the list is the constraint chosen for the arg1 position, etc.
     */
    @LispMethod(comment = "@return listp of length ARITY, where the first element of the list is the constraint chosen for the arg1 position, etc.")
    public static final SubLObject alchemy_predicate_arg_constraints_alt(SubLObject predicate, SubLObject v_arity) {
        {
            SubLObject constraints_by_argpos = NIL;
            SubLObject argpos = NIL;
            for (argpos = v_arity; !argpos.isZero(); argpos = number_utilities.f_1_(argpos)) {
                constraints_by_argpos = cons(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_predicate_argpos_constraint(predicate, argpos), constraints_by_argpos);
            }
            return constraints_by_argpos;
        }
    }

    /**
     *
     *
     * @return listp of length ARITY, where the first element of the list is the constraint chosen for the arg1 position, etc.
     */
    @LispMethod(comment = "@return listp of length ARITY, where the first element of the list is the constraint chosen for the arg1 position, etc.")
    public static SubLObject alchemy_predicate_arg_constraints(final SubLObject predicate, final SubLObject v_arity) {
        SubLObject constraints_by_argpos = NIL;
        SubLObject argpos;
        for (argpos = NIL, argpos = v_arity; !argpos.isZero(); argpos = number_utilities.f_1_(argpos)) {
            constraints_by_argpos = cons(alchemy_predicate_argpos_constraint(predicate, argpos), constraints_by_argpos);
        }
        return constraints_by_argpos;
    }

    static private final SubLList $list_alt264 = list(makeKeyword("IN-MT"), reader_make_constant_shell("NaiveSpatialMt"));

    static private final SubLString $str_alt265$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-ns-rules.mln");

    static private final SubLString $str_alt266$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-ns-train.db");

    /**
     * Choose the argument constraint for the ARGPOSth arg-position of PREDICATE
     */
    @LispMethod(comment = "Choose the argument constraint for the ARGPOSth arg-position of PREDICATE")
    public static final SubLObject alchemy_predicate_argpos_constraint_alt(SubLObject predicate, SubLObject argpos) {
        {
            SubLObject constraint = NIL;
            if ((NIL != fort_types_interface.predicate_p(predicate)) || (predicate == $$thereExistRange)) {
                {
                    SubLObject constraints = (NIL != arity.variable_arityP(predicate)) ? ((SubLObject) (kb_accessors.args_isa(predicate, $$InferencePSC))) : kb_accessors.argn_isa(predicate, argpos, $$InferencePSC);
                    if (NIL != list_utilities.empty_list_p(constraints)) {
                        constraint = $$Thing;
                    } else {
                        constraint = cycl_utilities.collection_intersection(constraints);
                    }
                }
            } else {
                if (NIL != fort_types_interface.collection_p(predicate)) {
                    constraint = $$Thing;
                } else {
                    Errors.error($str_alt157$Can_t_convert_non_predicate_non_c, predicate);
                }
            }
            return constraint;
        }
    }

    /**
     * Choose the argument constraint for the ARGPOSth arg-position of PREDICATE
     */
    @LispMethod(comment = "Choose the argument constraint for the ARGPOSth arg-position of PREDICATE")
    public static SubLObject alchemy_predicate_argpos_constraint(final SubLObject predicate, final SubLObject argpos) {
        SubLObject constraint = NIL;
        if ((NIL != fort_types_interface.predicate_p(predicate)) || predicate.eql($$thereExistRange)) {
            final SubLObject constraints = (NIL != arity.variable_arityP(predicate)) ? kb_accessors.args_isa(predicate, $$InferencePSC) : kb_accessors.argn_isa(predicate, argpos, $$InferencePSC);
            if (NIL != list_utilities.empty_list_p(constraints)) {
                constraint = $$Thing;
            } else {
                constraint = cycl_utilities.collection_intersection(constraints);
            }
        } else
            if (NIL != fort_types_interface.collection_p(predicate)) {
                constraint = $$Thing;
            } else {
                Errors.error($str157$Can_t_convert_non_predicate_non_c, predicate);
            }

        return constraint;
    }

    static private final SubLList $list_alt267 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-ns-evid.db"));

    static private final SubLList $list_alt268 = list(makeKeyword("IN-MT"), reader_make_constant_shell("TheSimpsonsMt"));

    static private final SubLList $list_alt269 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("TheSimpsonsMt")));

    static private final SubLString $str_alt270$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/simp-rules.mln");

    static private final SubLString $str_alt271$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/simp-train.db");

    static private final SubLList $list_alt272 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/simp-evid.db"));

    static private final SubLString $str_alt273$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/ucb-rules.mln");

    /**
     * Write out an Alchemy type/constant declarations file.
     */
    @LispMethod(comment = "Write out an Alchemy type/constant declarations file.")
    public static final SubLObject alchemy_export_types_file_alt(SubLObject type_dictionary, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(type_dictionary, DICTIONARY_P);
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject fol_term_instances = NIL;
                SubLObject mln_filename = string_utilities.string_substitute($str_alt158$_mln, $str_alt159$_db, filename, UNPROVIDED);
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(mln_filename, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt6$Unable_to_open__S, mln_filename);
                    }
                    {
                        SubLObject stream_93 = stream;
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(type_dictionary));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject terms = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != terms) {
                                    format(T, $str_alt160$__exporting_type___A___A__, type, terms);
                                    force_output(UNPROVIDED);
                                    fol_term_instances = NIL;
                                    {
                                        SubLObject cdolist_list_var = terms;
                                        SubLObject v_term = NIL;
                                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                            fol_term_instances = cons(folification.fol_transform_arg(v_term), fol_term_instances);
                                        }
                                    }
                                    com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_type_declaration_to_stream(type, fol_term_instances, stream_93);
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
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
            return NIL;
        }
    }

    /**
     * Write out an Alchemy type/constant declarations file.
     */
    @LispMethod(comment = "Write out an Alchemy type/constant declarations file.")
    public static SubLObject alchemy_export_types_file(final SubLObject type_dictionary, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(type_dictionary) : "! dictionary.dictionary_p(type_dictionary) " + ("dictionary.dictionary_p(type_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(type_dictionary) ") + type_dictionary;
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject fol_term_instances = NIL;
        final SubLObject mln_filename = string_utilities.string_substitute($str158$_mln, $str159$_db, filename, UNPROVIDED);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(mln_filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str6$Unable_to_open__S, mln_filename);
            }
            final SubLObject stream_$99 = stream;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(type_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject terms = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != terms) {
                    format(T, $str160$__exporting_type___A___A__, type, terms);
                    force_output(UNPROVIDED);
                    fol_term_instances = NIL;
                    SubLObject cdolist_list_var = terms;
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        fol_term_instances = cons(folification.fol_transform_arg(v_term), fol_term_instances);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    } 
                    alchemy_type_declaration_to_stream(type, fol_term_instances, stream_$99);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
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

    static private final SubLString $str_alt274$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/ucb-train.db");

    static private final SubLList $list_alt275 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/ucb-evid.db"));

    static private final SubLList $list_alt276 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoRulesMt"));

    static private final SubLList $list_alt277 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoTrainingGAFsMt"));

    static private final SubLList $list_alt278 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoEvidenceGAFsMt")));

    static private final SubLString $str_alt279$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo-rules.mln");

    static private final SubLString $str_alt280$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo-train.db");

    static private final SubLList $list_alt281 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo-evid.db"));

    static private final SubLList $list_alt282 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AlchemyDemoIIRulesMt"));

    static private final SubLList $list_alt283 = list(reader_make_constant_shell("ContentMtFn"), reader_make_constant_shell("WashingtonPostEntertainmentGuide-KS"));

    static private final SubLString $str_alt284$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo2-rules.mln");

    static private final SubLString $str_alt285$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo2-train.db");

    static private final SubLList $list_alt286 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo2-evid.db"));

    static private final SubLList $list_alt287 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AmbientConditionsMt"));

    static private final SubLList $list_alt288 = list(makeKeyword("IN-MT"), reader_make_constant_shell("AmbientConditionsDataMt"));

    static private final SubLList $list_alt289 = list(list(makeKeyword("IN-MT"), reader_make_constant_shell("CIAWorldFactbook1997Mt")));

    static private final SubLString $str_alt290$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo4-rules.mln");

    static private final SubLString $str_alt291$_cyc_projects_transfer_learning_S = makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo4-train.db");

    public static final SubLObject alchemy_fol_denotational_term_not_requiring_declaration_p_alt(SubLObject fol_denotational_term) {
        return cycl_variables.el_varP(fol_denotational_term);
    }

    public static SubLObject alchemy_fol_denotational_term_not_requiring_declaration_p(final SubLObject fol_denotational_term) {
        return cycl_variables.el_varP(fol_denotational_term);
    }

    static private final SubLList $list_alt292 = list(makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo4-evid.db"));

    /**
     *
     *
     * @param TYPE
    collection-p
     * 		
     * @param INSTANCES
     * 		listp; FO-CycL denotational terms that denote instances of TYPE
     */
    @LispMethod(comment = "@param TYPE\ncollection-p\r\n\t\t\r\n@param INSTANCES\r\n\t\tlistp; FO-CycL denotational terms that denote instances of TYPE")
    public static final SubLObject alchemy_type_declaration_to_stream_alt(SubLObject type, SubLObject v_instances, SubLObject stream) {
        terpri(stream);
        princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type(type), stream);
        princ($str_alt161$____, stream);
        {
            SubLObject first_instanceP = T;
            SubLObject cdolist_list_var = v_instances;
            SubLObject instance = NIL;
            for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                if (NIL != first_instanceP) {
                    first_instanceP = NIL;
                } else {
                    princ($str_alt162$__, stream);
                }
                princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_fol_term(instance), stream);
            }
        }
        princ($str_alt163$_, stream);
        terpri(stream);
        return NIL;
    }

    /**
     *
     *
     * @param TYPE
    collection-p
     * 		
     * @param INSTANCES
     * 		listp; FO-CycL denotational terms that denote instances of TYPE
     */
    @LispMethod(comment = "@param TYPE\ncollection-p\r\n\t\t\r\n@param INSTANCES\r\n\t\tlistp; FO-CycL denotational terms that denote instances of TYPE")
    public static SubLObject alchemy_type_declaration_to_stream(final SubLObject type, final SubLObject v_instances, final SubLObject stream) {
        terpri(stream);
        princ(alchemy_export_type(type), stream);
        princ($str161$____, stream);
        SubLObject first_instanceP = T;
        SubLObject cdolist_list_var = v_instances;
        SubLObject instance = NIL;
        instance = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != first_instanceP) {
                first_instanceP = NIL;
            } else {
                princ($str162$__, stream);
            }
            princ(alchemy_export_fol_term(instance), stream);
            cdolist_list_var = cdolist_list_var.rest();
            instance = cdolist_list_var.first();
        } 
        princ($str163$_, stream);
        terpri(stream);
        return NIL;
    }

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt301 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("likesAsFriend"), reader_make_constant_shell("RonaldReagan"), reader_make_constant_shell("Madonna"))), makeString("\npred2C_likesAsFriend(C_RonaldReagan,C_Madonna)\n(pred2C_likesAsFriend(arg1,ins)) => (pred1C_PerceptualAgent-Embodied(ins))\n(pred2C_likesAsFriend(ins,arg2)) => (pred1C_PerceptualAgent-Embodied(ins))")), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Emu"))), makeString("\npred1C_Emu(C_Cyc)\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).")), list(list(list(reader_make_constant_shell("eatsWillingly"), list(reader_make_constant_shell("MotherFn"), reader_make_constant_shell("Cyc")), reader_make_constant_shell("Emu"))), makeString("\npred2C_eatsWillingly(HLID_330D821E2BBF65A0729C2911B19DADC379636F72701E2BBD5880659C2911B19DADC379636F7270,C_Emu)\n(pred2C_eatsWillingly(arg1,ins)) => (pred1C_TemporalStuffType(ins))\n(pred2C_eatsWillingly(ins,arg2)) => (pred1C_Animal(ins))\n((pred2C_eatsWillingly(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_eatsWillingly(arg1,new))\npred2C_natFunction(HLID_330D821E2BBF65A0729C2911B19DADC379636F72700B0F853F41524731,C_MotherFn)\npred3C_natArgument(HLID_330D821E2BBF65A0729C2911B19DADC379636F72700B0F853F41524731,1,arg1)\npred1C_FemaleAnimal(HLID_330D821E2BBF65A0729C2911B19DADC379636F72700B0F853F41524731)\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).")), list(list(list(reader_make_constant_shell("dayTimeDecayRate"), reader_make_constant_shell("12-dimethylhydrazine"), ZERO_INTEGER)), makeString("\npred2C_dayTimeDecayRate(C_12-dimethylhydrazine,0)\n(pred2C_dayTimeDecayRate(arg1,ins)) => (pred1C_Number-General(ins))\n(pred2C_dayTimeDecayRate(ins,arg2)) => (pred1C_TemporalStuffType(ins))\n(pred2C_isa(x,C_12-dimethylhydrazine)) <=> (pred1C_12-dimethylhydrazine(x)).")), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Emu")))), makeString("\n!(pred1C_Emu(C_Cyc))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).")), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Emu")), list(reader_make_constant_shell("eatsWillingly"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Pizza")))), makeString("\npred2C_eatsWillingly(C_Cyc,C_Pizza)\npred1C_Emu(C_Cyc)\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).\n(pred2C_eatsWillingly(arg1,ins)) => (pred1C_TemporalStuffType(ins))\n(pred2C_eatsWillingly(ins,arg2)) => (pred1C_Animal(ins))\n((pred2C_eatsWillingly(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_eatsWillingly(arg1,new))\n(pred2C_isa(x,C_Pizza)) <=> (pred1C_Pizza(x)).")), list(list(list(reader_make_constant_shell("or"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Emu")), list(reader_make_constant_shell("eatsWillingly"), reader_make_constant_shell("Cyc"), reader_make_constant_shell("Pizza")))), makeString("\n(pred1C_Emu(C_Cyc)) v (pred2C_eatsWillingly(C_Cyc,C_Pizza))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).\n(pred2C_eatsWillingly(arg1,ins)) => (pred1C_TemporalStuffType(ins))\n(pred2C_eatsWillingly(ins,arg2)) => (pred1C_Animal(ins))\n((pred2C_eatsWillingly(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_eatsWillingly(arg1,new))\n(pred2C_isa(x,C_Pizza)) <=> (pred1C_Pizza(x)).")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Emu")), list(reader_make_constant_shell("likesAsFriend"), reader_make_constant_shell("Madonna"), makeSymbol("?X")))), makeString("\n(pred1C_Emu(x)) => (pred2C_likesAsFriend(C_Madonna,x))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).\n(pred2C_likesAsFriend(arg1,ins)) => (pred1C_PerceptualAgent-Embodied(ins))\n(pred2C_likesAsFriend(ins,arg2)) => (pred1C_PerceptualAgent-Embodied(ins))")), list(list(list(reader_make_constant_shell("forAll"), makeSymbol("?THING"), list(reader_make_constant_shell("isa"), makeSymbol("?THING"), reader_make_constant_shell("Thing")))), makeString("\npred1C_Thing(thing)\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Thing)) <=> (pred1C_Thing(x)).")) });

    /**
     * Write out an Alchemy data (gafs) file.
     */
    @LispMethod(comment = "Write out an Alchemy data (gafs) file.")
    public static final SubLObject alchemy_export_data_file_alt(SubLObject analysis, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt6$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_94 = stream;
                        {
                            SubLObject _prev_bind_0 = $alchemy_export_cafs_or_rulesP$.currentBinding(thread);
                            try {
                                $alchemy_export_cafs_or_rulesP$.bind($CAFS, thread);
                                folification.fol_sentences_to_stream(analysis, $ALCHEMY, stream_94);
                            } finally {
                                $alchemy_export_cafs_or_rulesP$.rebind(_prev_bind_0, thread);
                            }
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
            return NIL;
        }
    }

    /**
     * Write out an Alchemy data (gafs) file.
     */
    @LispMethod(comment = "Write out an Alchemy data (gafs) file.")
    public static SubLObject alchemy_export_data_file(final SubLObject analysis, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str6$Unable_to_open__S, filename);
            }
            final SubLObject stream_$100 = stream;
            final SubLObject _prev_bind_0 = $alchemy_export_cafs_or_rulesP$.currentBinding(thread);
            try {
                $alchemy_export_cafs_or_rulesP$.bind($CAFS, thread);
                folification.fol_sentences_to_stream(analysis, $ALCHEMY, stream_$100);
            } finally {
                $alchemy_export_cafs_or_rulesP$.rebind(_prev_bind_0, thread);
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
        return NIL;
    }

    public static final SubLObject all_fol_predicates_and_arguments_mentioned_in_analyses_alt(SubLObject analyses) {
        {
            SubLObject all_predicates = NIL;
            SubLObject all_arguments = NIL;
            SubLObject cdolist_list_var = analyses;
            SubLObject analysis = NIL;
            for (analysis = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , analysis = cdolist_list_var.first()) {
                {
                    SubLObject datum = folification.all_fol_predicates_and_arguments_mentioned_in_analysis(analysis);
                    SubLObject current = datum;
                    SubLObject predicates = NIL;
                    SubLObject v_arguments = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt165);
                    predicates = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt165);
                    v_arguments = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        all_predicates = append(predicates, all_predicates);
                        all_arguments = append(v_arguments, all_arguments);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt165);
                    }
                }
            }
            return list(list_utilities.fast_delete_duplicates(all_predicates, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.fast_delete_duplicates(all_arguments, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_analyses(final SubLObject analyses) {
        SubLObject all_predicates = NIL;
        SubLObject all_arguments = NIL;
        SubLObject cdolist_list_var = analyses;
        SubLObject analysis = NIL;
        analysis = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = folification.all_fol_predicates_and_arguments_mentioned_in_analysis(analysis);
            SubLObject predicates = NIL;
            SubLObject v_arguments = NIL;
            destructuring_bind_must_consp(current, datum, $list165);
            predicates = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list165);
            v_arguments = current.first();
            current = current.rest();
            if (NIL == current) {
                all_predicates = append(predicates, all_predicates);
                all_arguments = append(v_arguments, all_arguments);
            } else {
                cdestructuring_bind_error(datum, $list165);
            }
            cdolist_list_var = cdolist_list_var.rest();
            analysis = cdolist_list_var.first();
        } 
        return list(list_utilities.fast_delete_duplicates(all_predicates, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.fast_delete_duplicates(all_arguments, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Get all the forts mentioned in ASSERTIONS (exluding mts and not penetrating hl structures)
     */
    @LispMethod(comment = "Get all the forts mentioned in ASSERTIONS (exluding mts and not penetrating hl structures)")
    public static final SubLObject alchemy_assertions_forts_alt(SubLObject assertions) {
        {
            SubLObject v_forts = NIL;
            SubLObject penetrate_hl_structuresP = NIL;
            SubLObject include_mtsP = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                {
                    SubLObject assertion_forts = assertions_high.assertion_forts(assertion, penetrate_hl_structuresP, NIL, include_mtsP, T);
                    v_forts = append(assertion_forts, v_forts);
                }
            }
            return list_utilities.fast_delete_duplicates(v_forts, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Get all the forts mentioned in ASSERTIONS (exluding mts and not penetrating hl structures)
     */
    @LispMethod(comment = "Get all the forts mentioned in ASSERTIONS (exluding mts and not penetrating hl structures)")
    public static SubLObject alchemy_assertions_forts(final SubLObject assertions) {
        SubLObject v_forts = NIL;
        final SubLObject penetrate_hl_structuresP = NIL;
        final SubLObject include_mtsP = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, penetrate_hl_structuresP, NIL, include_mtsP, T);
            v_forts = append(assertion_forts, v_forts);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(v_forts, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject alchemy_skip_fol_sentenceP_alt(SubLObject fol_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $alchemy_export_cafs_or_rulesP$.getDynamicValue(thread);
                if (pcase_var.eql($CAFS)) {
                    return makeBoolean(NIL == folification.fol_cafP(fol_sentence));
                } else {
                    if (pcase_var.eql($RULES)) {
                        return folification.fol_cafP(fol_sentence);
                    } else {
                        if (pcase_var.eql($BOTH)) {
                            return NIL;
                        } else {
                            Errors.error($str_alt166$_S_is_not_a_valid_value_for__alch, $alchemy_export_cafs_or_rulesP$.getDynamicValue(thread));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject alchemy_skip_fol_sentenceP(final SubLObject fol_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $alchemy_export_cafs_or_rulesP$.getDynamicValue(thread);
        if (pcase_var.eql($CAFS)) {
            return makeBoolean(NIL == folification.fol_cafP(fol_sentence));
        }
        if (pcase_var.eql($RULES)) {
            return folification.fol_cafP(fol_sentence);
        }
        if (pcase_var.eql($BOTH)) {
            return NIL;
        }
        Errors.error($str166$_S_is_not_a_valid_value_for__alch, $alchemy_export_cafs_or_rulesP$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject cycl_assertions_to_alchemy_style_fol_alt(SubLObject assertions) {
        return folification.cycl_assertions_to_fol(assertions, $alchemy_folification_properties$.getGlobalValue(), NIL);
    }

    public static SubLObject cycl_assertions_to_alchemy_style_fol(final SubLObject assertions) {
        return folification.cycl_assertions_to_fol(assertions, $alchemy_folification_properties$.getGlobalValue(), NIL);
    }

    public static final SubLObject cycl_sentence_to_alchemy_sentences_alt(SubLObject cycl_sentence) {
        return com.cyc.cycjava.cycl.butler.alchemy_export.cycl_sentence_to_external_fol(cycl_sentence, $ALCHEMY, $alchemy_folification_properties$.getGlobalValue());
    }

    public static SubLObject cycl_sentence_to_alchemy_sentences(final SubLObject cycl_sentence) {
        return cycl_sentence_to_external_fol(cycl_sentence, $ALCHEMY, $alchemy_folification_properties$.getGlobalValue());
    }

    public static final SubLObject cycl_sentence_to_external_fol_alt(SubLObject cycl_sentence, SubLObject output_format, SubLObject v_properties) {
        v_properties = putf(copy_list(v_properties), $kw173$INCLUDE_COMMENTS_, NIL);
        {
            SubLObject analysis = folification.cycl_sentences_to_fol(list(cycl_sentence), v_properties);
            SubLObject result = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                folification.fol_sentences_to_stream(analysis, output_format, stream);
                result = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject cycl_sentence_to_external_fol(final SubLObject cycl_sentence, final SubLObject output_format, SubLObject v_properties) {
        v_properties = putf(copy_list(v_properties), $kw173$INCLUDE_COMMENTS_, NIL);
        final SubLObject analysis = folification.cycl_sentences_to_fol(list(cycl_sentence), v_properties);
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            folification.fol_sentences_to_stream(analysis, output_format, stream);
            result = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static final SubLObject alchemy_export_sentence_alt(SubLObject focycl_sentence, SubLObject stream, SubLObject top_levelP, SubLObject hardP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (top_levelP == UNPROVIDED) {
            top_levelP = T;
        }
        if (hardP == UNPROVIDED) {
            hardP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != top_levelP) {
                $ae_number_of_sentences$.setDynamicValue(add($ae_number_of_sentences$.getDynamicValue(thread), ONE_INTEGER), thread);
                terpri(stream);
            }
            {
                SubLObject datum = focycl_sentence;
                SubLObject current = datum;
                SubLObject operator = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt14);
                operator = current.first();
                current = current.rest();
                args = current;
                {
                    SubLObject pcase_var = operator;
                    if (pcase_var.eql($$not)) {
                        princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentential_relation($$not), stream);
                        SubLTrampolineFile.checkType(args, $sym174$SINGLETON_);
                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentence_parenthesized(args.first(), stream);
                    } else {
                        if (pcase_var.eql($$and) || pcase_var.eql($$or)) {
                            {
                                SubLObject list_var = NIL;
                                SubLObject arg = NIL;
                                SubLObject number = NIL;
                                for (list_var = args, arg = list_var.first(), number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , number = add(ONE_INTEGER, number)) {
                                    if (!number.isZero()) {
                                        princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentential_relation(operator), stream);
                                    }
                                    com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentence_parenthesized(arg, stream);
                                }
                            }
                        } else {
                            if (pcase_var.eql($$implies) || pcase_var.eql($$equiv)) {
                                {
                                    SubLObject datum_95 = args;
                                    SubLObject current_96 = datum_95;
                                    SubLObject left_side = NIL;
                                    SubLObject right_side = NIL;
                                    destructuring_bind_must_consp(current_96, datum_95, $list_alt177);
                                    left_side = current_96.first();
                                    current_96 = current_96.rest();
                                    destructuring_bind_must_consp(current_96, datum_95, $list_alt177);
                                    right_side = current_96.first();
                                    current_96 = current_96.rest();
                                    if (NIL == current_96) {
                                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentence_parenthesized(left_side, stream);
                                        princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentential_relation(operator), stream);
                                        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentence_parenthesized(right_side, stream);
                                    } else {
                                        cdestructuring_bind_error(datum_95, $list_alt177);
                                    }
                                }
                            } else {
                                if (pcase_var.eql($$forAll) || pcase_var.eql($$thereExists)) {
                                    {
                                        SubLObject datum_97 = args;
                                        SubLObject current_98 = datum_97;
                                        SubLObject var = NIL;
                                        SubLObject sent = NIL;
                                        destructuring_bind_must_consp(current_98, datum_97, $list_alt180);
                                        var = current_98.first();
                                        current_98 = current_98.rest();
                                        destructuring_bind_must_consp(current_98, datum_97, $list_alt180);
                                        sent = current_98.first();
                                        current_98 = current_98.rest();
                                        if (NIL == current_98) {
                                            princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentential_relation(operator), stream);
                                            princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_variable(var), stream);
                                            princ($str_alt181$_, stream);
                                            com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentence_parenthesized(sent, stream);
                                        } else {
                                            cdestructuring_bind_error(datum_97, $list_alt180);
                                        }
                                    }
                                } else {
                                    princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_fol_predicate(operator), stream);
                                    princ($str_alt153$_, stream);
                                    {
                                        SubLObject list_var = NIL;
                                        SubLObject arg = NIL;
                                        SubLObject number = NIL;
                                        for (list_var = args, arg = list_var.first(), number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , number = add(ONE_INTEGER, number)) {
                                            if (!number.isZero()) {
                                                princ($str_alt154$_, stream);
                                            }
                                            princ(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_fol_term(arg), stream);
                                        }
                                    }
                                    princ($str_alt155$_, stream);
                                }
                            }
                        }
                    }
                }
            }
            if ((NIL != top_levelP) && (NIL != hardP)) {
                princ($str_alt182$_, stream);
            }
            return NIL;
        }
    }

    public static SubLObject alchemy_export_sentence(final SubLObject focycl_sentence, SubLObject stream, SubLObject top_levelP, SubLObject hardP) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (top_levelP == UNPROVIDED) {
            top_levelP = T;
        }
        if (hardP == UNPROVIDED) {
            hardP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != top_levelP) {
            $ae_number_of_sentences$.setDynamicValue(add($ae_number_of_sentences$.getDynamicValue(thread), ONE_INTEGER), thread);
            terpri(stream);
        }
        SubLObject operator = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(focycl_sentence, focycl_sentence, $list14);
        operator = focycl_sentence.first();
        final SubLObject current = args = focycl_sentence.rest();
        final SubLObject pcase_var = operator;
        if (pcase_var.eql($$not)) {
            princ(alchemy_export_sentential_relation($$not), stream);
            assert NIL != list_utilities.singletonP(args) : "! list_utilities.singletonP(args) " + ("list_utilities.singletonP(args) " + "CommonSymbols.NIL != list_utilities.singletonP(args) ") + args;
            alchemy_export_sentence_parenthesized(args.first(), stream);
        } else
            if (pcase_var.eql($$and) || pcase_var.eql($$or)) {
                SubLObject list_var = NIL;
                SubLObject arg = NIL;
                SubLObject number = NIL;
                list_var = args;
                arg = list_var.first();
                for (number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , number = add(ONE_INTEGER, number)) {
                    if (!number.isZero()) {
                        princ(alchemy_export_sentential_relation(operator), stream);
                    }
                    alchemy_export_sentence_parenthesized(arg, stream);
                }
            } else
                if (pcase_var.eql($$implies) || pcase_var.eql($$equiv)) {
                    SubLObject current_$102;
                    final SubLObject datum_$101 = current_$102 = args;
                    SubLObject left_side = NIL;
                    SubLObject right_side = NIL;
                    destructuring_bind_must_consp(current_$102, datum_$101, $list177);
                    left_side = current_$102.first();
                    current_$102 = current_$102.rest();
                    destructuring_bind_must_consp(current_$102, datum_$101, $list177);
                    right_side = current_$102.first();
                    current_$102 = current_$102.rest();
                    if (NIL == current_$102) {
                        alchemy_export_sentence_parenthesized(left_side, stream);
                        princ(alchemy_export_sentential_relation(operator), stream);
                        alchemy_export_sentence_parenthesized(right_side, stream);
                    } else {
                        cdestructuring_bind_error(datum_$101, $list177);
                    }
                } else
                    if (pcase_var.eql($$forAll) || pcase_var.eql($$thereExists)) {
                        SubLObject current_$103;
                        final SubLObject datum_$102 = current_$103 = args;
                        SubLObject var = NIL;
                        SubLObject sent = NIL;
                        destructuring_bind_must_consp(current_$103, datum_$102, $list180);
                        var = current_$103.first();
                        current_$103 = current_$103.rest();
                        destructuring_bind_must_consp(current_$103, datum_$102, $list180);
                        sent = current_$103.first();
                        current_$103 = current_$103.rest();
                        if (NIL == current_$103) {
                            princ(alchemy_export_sentential_relation(operator), stream);
                            princ(alchemy_export_variable(var), stream);
                            princ($$$_, stream);
                            alchemy_export_sentence_parenthesized(sent, stream);
                        } else {
                            cdestructuring_bind_error(datum_$102, $list180);
                        }
                    } else {
                        princ(alchemy_export_fol_predicate(operator), stream);
                        princ($str153$_, stream);
                        SubLObject list_var = NIL;
                        SubLObject arg = NIL;
                        SubLObject number = NIL;
                        list_var = args;
                        arg = list_var.first();
                        for (number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , number = add(ONE_INTEGER, number)) {
                            if (!number.isZero()) {
                                princ($str154$_, stream);
                            }
                            princ(alchemy_export_fol_term(arg), stream);
                        }
                        princ($str155$_, stream);
                    }



        if ((NIL != top_levelP) && (NIL != hardP)) {
            princ($str182$_, stream);
        }
        return NIL;
    }

    static private final SubLString $$$brusseau = makeString("brusseau");

    static private final SubLList $list_alt304 = list(list(list(reader_make_constant_shell("likesAsFriend"), TWO_INTEGER), makeString("pred2C_likesAsFriend")));

    static private final SubLList $list_alt306 = list(list(list(list(reader_make_constant_shell("FOL-AtomicTermFn"), reader_make_constant_shell("Thing"))), makeString("C_Thing")), list(list(list(list(reader_make_constant_shell("FOL-FunctionFn"), reader_make_constant_shell("EnglishSuffixationFn")), list(reader_make_constant_shell("FOL-StringFn"), makeString("glory")), list(reader_make_constant_shell("FOL-StringFn"), makeString("ous")))), makeString("HLID_330D831E190FA462663436343161662D396332392D313162312D396461642D6333373936333666373237300F85676C6F72790F836F7573")), list(list(list(list(reader_make_constant_shell("FOL-FunctionFn"), reader_make_constant_shell("TermParaphraseFn-PP")), list(list(reader_make_constant_shell("FOL-FunctionFn"), reader_make_constant_shell("WordWithSuffixFn")), list(reader_make_constant_shell("FOL-AtomicTermFn"), reader_make_constant_shell("Token-TheWord")), list(reader_make_constant_shell("FOL-AtomicTermFn"), reader_make_constant_shell("Ism_Doctrine-TheSuffix"))), list(reader_make_constant_shell("FOL-AtomicTermFn"), reader_make_constant_shell("Thing")))), makeString("HLID_330D831E190FA439363231643032362D326134342D343164372D396661342D6133613162633966323431300D831E190FA462663136333133332D396332392D313162312D396461642D6333373936333666373237301E190FA463306664663835342D396332392D313162312D396461642D6333373936333666373237301E190FA463306138633266342D396332392D313162312D396461642D6333373936333666373237301E190FA462643538383066342D396332392D313162312D396461642D633337393633366637323730")), list(list(makeSymbol("?WHAT")), makeString("what")), list(list(makeSymbol("??WHAT")), makeString("what")), list(list(list(reader_make_constant_shell("FOL-StringFn"), makeString("blork"))), makeString("\"blork\"")), list(list(list(reader_make_constant_shell("FOL-NumberFn"), makeInteger(-4))), makeString("-4")));

    static private final SubLList $list_alt309 = list(list(list(makeString("This-is_100percent'valid")), T), list(list(makeString("must-begin-with-upper-case")), NIL), list(list(makeString("\"constants may be expressed as double-quoted strings\"")), T), list(list(makeString("\"\"")), NIL), list(list(makeString("17")), NIL));

    static private final SubLList $list_alt311 = list(list(list(makeString("this-is_100percent'valid")), T), list(list(makeString("Must-begin-with-lower-case")), NIL));

    static private final SubLList $list_alt313 = list(list(list(makeString("this-is_100percent'valid")), T), list(list(makeString("this is$not%valid")), NIL), list(list(makeString("'not-valid")), NIL), list(list(makeSymbol("NOT-A-STRING")), NIL));

    public static final SubLObject alchemy_export_sentence_parenthesized_alt(SubLObject cycl_sentence, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        princ($str_alt153$_, stream);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentence(cycl_sentence, stream, NIL, UNPROVIDED);
        princ($str_alt155$_, stream);
        return NIL;
    }

    public static SubLObject alchemy_export_sentence_parenthesized(final SubLObject cycl_sentence, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        princ($str153$_, stream);
        alchemy_export_sentence(cycl_sentence, stream, NIL, UNPROVIDED);
        princ($str155$_, stream);
        return NIL;
    }

    public static final SubLObject clear_alchemy_export_sentential_relation_alt() {
        {
            SubLObject cs = $alchemy_export_sentential_relation_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_alchemy_export_sentential_relation() {
        final SubLObject cs = $alchemy_export_sentential_relation_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_alchemy_export_sentential_relation_alt(SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($alchemy_export_sentential_relation_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_alchemy_export_sentential_relation(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($alchemy_export_sentential_relation_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject alchemy_export_sentential_relation_internal_alt(SubLObject relation) {
        {
            SubLObject pcase_var = relation;
            if (pcase_var.eql($$not)) {
                return $str_alt184$_;
            } else {
                if (pcase_var.eql($$and)) {
                    return $str_alt185$___;
                } else {
                    if (pcase_var.eql($$or)) {
                        return $str_alt186$_v_;
                    } else {
                        if (pcase_var.eql($$implies)) {
                            return $str_alt187$____;
                        } else {
                            if (pcase_var.eql($$equiv)) {
                                return $str_alt188$_____;
                            } else {
                                if (pcase_var.eql($$forAll)) {
                                    return $str_alt189$forall_;
                                } else {
                                    if (pcase_var.eql($$thereExists)) {
                                        return $str_alt190$exist_;
                                    } else {
                                        Errors.error($str_alt191$Don_t_know_how_to_export_the_sent, relation);
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

    public static SubLObject alchemy_export_sentential_relation_internal(final SubLObject relation) {
        if (relation.eql($$not)) {
            return $str184$_;
        }
        if (relation.eql($$and)) {
            return $str185$___;
        }
        if (relation.eql($$or)) {
            return $$$_v_;
        }
        if (relation.eql($$implies)) {
            return $str187$____;
        }
        if (relation.eql($$equiv)) {
            return $str188$_____;
        }
        if (relation.eql($$forAll)) {
            return $$$forall_;
        }
        if (relation.eql($$thereExists)) {
            return $$$exist_;
        }
        Errors.error($str191$Don_t_know_how_to_export_the_sent, relation);
        return NIL;
    }

    public static final SubLObject alchemy_export_sentential_relation_alt(SubLObject relation) {
        {
            SubLObject caching_state = $alchemy_export_sentential_relation_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ALCHEMY_EXPORT_SENTENTIAL_RELATION, $alchemy_export_sentential_relation_caching_state$, NIL, EQ, ONE_INTEGER, SIX_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, $kw193$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw193$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_sentential_relation_internal(relation)));
                    memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject alchemy_export_sentential_relation(final SubLObject relation) {
        SubLObject caching_state = $alchemy_export_sentential_relation_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALCHEMY_EXPORT_SENTENTIAL_RELATION, $alchemy_export_sentential_relation_caching_state$, NIL, EQ, ONE_INTEGER, SIX_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(alchemy_export_sentential_relation_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject alchemy_export_type_alt(SubLObject collection) {
        if (NIL != constant_p(collection)) {
            return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_constant(collection);
        } else {
            if (NIL != cycl_grammar.cycl_nat_p(collection)) {
                return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_type_nat(collection);
            } else {
                Errors.error($str_alt196$Don_t_know_how_to_export_the_type, collection);
            }
        }
        return NIL;
    }

    public static SubLObject alchemy_export_type(final SubLObject collection) {
        if (NIL != constant_p(collection)) {
            return alchemy_export_type_constant(collection);
        }
        if (NIL != cycl_grammar.cycl_nat_p(collection)) {
            return alchemy_export_type_nat(collection);
        }
        Errors.error($str195$Don_t_know_how_to_export_the_type, collection);
        return NIL;
    }

    public static final SubLObject alchemy_export_type_constant_alt(SubLObject collection) {
        return cconcatenate($alchemy_export_type_prefix$.getGlobalValue(), com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_constant(collection));
    }

    public static SubLObject alchemy_export_type_constant(final SubLObject collection) {
        return cconcatenate($alchemy_export_type_prefix$.getGlobalValue(), alchemy_export_constant(collection));
    }

    public static final SubLObject alchemy_export_type_nat_alt(SubLObject collection) {
        return cconcatenate($alchemy_export_type_prefix$.getGlobalValue(), com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_nat(collection));
    }

    public static SubLObject alchemy_export_type_nat(final SubLObject collection) {
        return cconcatenate($alchemy_export_type_prefix$.getGlobalValue(), alchemy_export_nat(collection));
    }

    public static final SubLObject alchemy_export_fol_predicate_alt(SubLObject fol_predicate) {
        {
            SubLObject datum = fol_predicate;
            SubLObject current = datum;
            SubLObject fol_predicate_fn = NIL;
            SubLObject predicate = NIL;
            SubLObject v_arity = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt114);
            fol_predicate_fn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt114);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt114);
            v_arity = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject hl_predicate = (NIL != constant_p(predicate)) ? ((SubLObject) (predicate)) : czer_main.canonicalize_term(predicate, $$InferencePSC);
                    return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_predicate_with_arity(hl_predicate, v_arity);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt114);
            }
        }
        return NIL;
    }

    public static SubLObject alchemy_export_fol_predicate(final SubLObject fol_predicate) {
        SubLObject fol_predicate_fn = NIL;
        SubLObject predicate = NIL;
        SubLObject v_arity = NIL;
        destructuring_bind_must_consp(fol_predicate, fol_predicate, $list114);
        fol_predicate_fn = fol_predicate.first();
        SubLObject current = fol_predicate.rest();
        destructuring_bind_must_consp(current, fol_predicate, $list114);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, fol_predicate, $list114);
        v_arity = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject hl_predicate = (NIL != constant_p(predicate)) ? predicate : czer_main.canonicalize_term(predicate, $$InferencePSC);
            return alchemy_export_predicate_with_arity(hl_predicate, v_arity);
        }
        cdestructuring_bind_error(fol_predicate, $list114);
        return NIL;
    }

    public static final SubLObject alchemy_export_predicate_with_arity_alt(SubLObject predicate, SubLObject v_arity) {
        if (NIL != constant_p(predicate)) {
            return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_predicate_constant(predicate, v_arity);
        } else {
            if (NIL != cycl_grammar.cycl_nat_p(predicate)) {
                return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_predicate_nat(predicate, v_arity);
            } else {
                Errors.error($str_alt197$Don_t_know_how_to_export_the_pred, predicate);
            }
        }
        return NIL;
    }

    public static SubLObject alchemy_export_predicate_with_arity(final SubLObject predicate, final SubLObject v_arity) {
        if (NIL != constant_p(predicate)) {
            return alchemy_export_predicate_constant(predicate, v_arity);
        }
        if (NIL != cycl_grammar.cycl_nat_p(predicate)) {
            return alchemy_export_predicate_nat(predicate, v_arity);
        }
        Errors.error($str196$Don_t_know_how_to_export_the_pred, predicate);
        return NIL;
    }

    public static final SubLObject alchemy_export_predicate_constant_alt(SubLObject predicate, SubLObject v_arity) {
        return cconcatenate($alchemy_export_predicate_prefix$.getGlobalValue(), new SubLObject[]{ string_utilities.str(v_arity), com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_constant(predicate) });
    }

    public static SubLObject alchemy_export_predicate_constant(final SubLObject predicate, final SubLObject v_arity) {
        return cconcatenate($alchemy_export_predicate_prefix$.getGlobalValue(), new SubLObject[]{ string_utilities.str(v_arity), alchemy_export_constant(predicate) });
    }

    public static final SubLObject alchemy_export_predicate_nat_alt(SubLObject predicate, SubLObject v_arity) {
        return cconcatenate($alchemy_export_predicate_prefix$.getGlobalValue(), new SubLObject[]{ string_utilities.str(v_arity), com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_nat(predicate) });
    }

    public static SubLObject alchemy_export_predicate_nat(final SubLObject predicate, final SubLObject v_arity) {
        return cconcatenate($alchemy_export_predicate_prefix$.getGlobalValue(), new SubLObject[]{ string_utilities.str(v_arity), alchemy_export_nat(predicate) });
    }

    public static final SubLObject alchemy_export_fol_term_alt(SubLObject focycl_term) {
        if (NIL != folification.fol_atomic_term_p(focycl_term)) {
            return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_fol_constant(focycl_term);
        } else {
            if (NIL != cycl_variables.el_varP(focycl_term)) {
                return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_variable(focycl_term);
            } else {
                if (NIL != folification.fol_string_p(focycl_term)) {
                    return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_fol_string(focycl_term);
                } else {
                    if (NIL != folification.fol_number_p(focycl_term)) {
                        return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_fol_number(focycl_term);
                    } else {
                        if (NIL != possibly_naut_p(focycl_term)) {
                            return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_fol_nat(focycl_term);
                        } else {
                            Errors.error($str_alt198$Don_t_know_how_to_export_the_term, focycl_term);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject alchemy_export_fol_term(final SubLObject focycl_term) {
        if (NIL != folification.fol_atomic_term_p(focycl_term)) {
            return alchemy_export_fol_constant(focycl_term);
        }
        if (NIL != cycl_variables.el_varP(focycl_term)) {
            return alchemy_export_variable(focycl_term);
        }
        if (NIL != folification.fol_string_p(focycl_term)) {
            return alchemy_export_fol_string(focycl_term);
        }
        if (NIL != folification.fol_number_p(focycl_term)) {
            return alchemy_export_fol_number(focycl_term);
        }
        if (NIL != possibly_naut_p(focycl_term)) {
            return alchemy_export_fol_nat(focycl_term);
        }
        Errors.error($str197$Don_t_know_how_to_export_the_term, focycl_term);
        return NIL;
    }

    public static final SubLObject alchemy_export_fol_constant_alt(SubLObject fol_atomic_term) {
        {
            SubLObject datum = fol_atomic_term;
            SubLObject current = datum;
            SubLObject fol_atomic_term_fn = NIL;
            SubLObject constant = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt201);
            fol_atomic_term_fn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt201);
            constant = current.first();
            current = current.rest();
            if (NIL == current) {
                return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_constant(constant);
            } else {
                cdestructuring_bind_error(datum, $list_alt201);
            }
        }
        return NIL;
    }

    public static SubLObject alchemy_export_fol_constant(final SubLObject fol_atomic_term) {
        SubLObject fol_atomic_term_fn = NIL;
        SubLObject constant = NIL;
        destructuring_bind_must_consp(fol_atomic_term, fol_atomic_term, $list200);
        fol_atomic_term_fn = fol_atomic_term.first();
        SubLObject current = fol_atomic_term.rest();
        destructuring_bind_must_consp(current, fol_atomic_term, $list200);
        constant = current.first();
        current = current.rest();
        if (NIL == current) {
            return alchemy_export_constant(constant);
        }
        cdestructuring_bind_error(fol_atomic_term, $list200);
        return NIL;
    }

    public static final SubLObject alchemy_export_constant_alt(SubLObject constant) {
        return cconcatenate($alchemy_export_constant_prefix$.getGlobalValue(), com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_delete_forbidden_chars(string_utilities.copy_string(constants_high.constant_name(constant))));
    }

    public static SubLObject alchemy_export_constant(final SubLObject constant) {
        return cconcatenate($alchemy_export_constant_prefix$.getGlobalValue(), alchemy_export_delete_forbidden_chars(string_utilities.copy_string(constants_high.constant_name(constant))));
    }

    public static final SubLObject alchemy_export_variable_alt(SubLObject el_var) {
        {
            SubLObject result = cycl_variables.el_var_name(el_var);
            while ((NIL != string_utilities.non_empty_string_p(result)) && string_utilities.first_char(result).eql(cycl_variables.el_variable_prefix_char())) {
                result = string_utilities.substring(result, ONE_INTEGER, UNPROVIDED);
            } 
            if (NIL == string_utilities.non_empty_string_p(result)) {
                Errors.error($str_alt202$Tried_to_convert_the_EL_variable_, el_var, result);
            }
            return Strings.string_downcase(result, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject alchemy_export_variable(final SubLObject el_var) {
        SubLObject result;
        for (result = cycl_variables.el_var_name(el_var); (NIL != string_utilities.non_empty_string_p(result)) && string_utilities.first_char(result).eql(cycl_variables.el_variable_prefix_char()); result = string_utilities.substring(result, ONE_INTEGER, UNPROVIDED)) {
        }
        if (NIL == string_utilities.non_empty_string_p(result)) {
            Errors.error($str201$Tried_to_convert_the_EL_variable_, el_var, result);
        }
        return Strings.string_downcase(result, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject alchemy_export_fol_string_alt(SubLObject fol_string) {
        {
            SubLObject datum = fol_string;
            SubLObject current = datum;
            SubLObject fol_string_fn = NIL;
            SubLObject string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt204);
            fol_string_fn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt204);
            string = current.first();
            current = current.rest();
            if (NIL == current) {
                return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_string(string);
            } else {
                cdestructuring_bind_error(datum, $list_alt204);
            }
        }
        return NIL;
    }

    public static SubLObject alchemy_export_fol_string(final SubLObject fol_string) {
        SubLObject fol_string_fn = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(fol_string, fol_string, $list203);
        fol_string_fn = fol_string.first();
        SubLObject current = fol_string.rest();
        destructuring_bind_must_consp(current, fol_string, $list203);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            return alchemy_export_string(string);
        }
        cdestructuring_bind_error(fol_string, $list203);
        return NIL;
    }

    public static final SubLObject alchemy_export_string_alt(SubLObject string) {
        {
            SubLObject newline = Strings.make_string(ONE_INTEGER, CHAR_newline);
            SubLObject linefeed = Strings.make_string(ONE_INTEGER, CHAR_newline);
            SubLObject v_return = Strings.make_string(ONE_INTEGER, CHAR_return);
            SubLObject filtered_string = NIL;
            SubLObject delimited_string = NIL;
            filtered_string = string_utilities.string_substitute($str_alt181$_, newline, string, UNPROVIDED);
            filtered_string = string_utilities.string_substitute($str_alt181$_, linefeed, filtered_string, UNPROVIDED);
            filtered_string = string_utilities.string_substitute($str_alt181$_, v_return, filtered_string, UNPROVIDED);
            filtered_string = string_utilities.string_substitute($str_alt181$_, $str_alt203$_, filtered_string, UNPROVIDED);
            delimited_string = cconcatenate($double_quote_string$.getGlobalValue(), new SubLObject[]{ filtered_string, $double_quote_string$.getGlobalValue() });
            return delimited_string;
        }
    }

    public static SubLObject alchemy_export_string(final SubLObject string) {
        final SubLObject newline = Strings.make_string(ONE_INTEGER, CHAR_newline);
        final SubLObject linefeed = Strings.make_string(ONE_INTEGER, CHAR_newline);
        final SubLObject v_return = Strings.make_string(ONE_INTEGER, CHAR_return);
        SubLObject filtered_string = NIL;
        SubLObject delimited_string = NIL;
        filtered_string = string_utilities.string_substitute($$$_, newline, string, UNPROVIDED);
        filtered_string = string_utilities.string_substitute($$$_, linefeed, filtered_string, UNPROVIDED);
        filtered_string = string_utilities.string_substitute($$$_, v_return, filtered_string, UNPROVIDED);
        filtered_string = string_utilities.string_substitute($$$_, $str202$_, filtered_string, UNPROVIDED);
        delimited_string = cconcatenate($double_quote_string$.getGlobalValue(), new SubLObject[]{ filtered_string, $double_quote_string$.getGlobalValue() });
        return delimited_string;
    }

    public static final SubLObject alchemy_export_fol_number_alt(SubLObject fol_number) {
        {
            SubLObject datum = fol_number;
            SubLObject current = datum;
            SubLObject fol_number_fn = NIL;
            SubLObject number = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt205);
            fol_number_fn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt205);
            number = current.first();
            current = current.rest();
            if (NIL == current) {
                return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_number(number);
            } else {
                cdestructuring_bind_error(datum, $list_alt205);
            }
        }
        return NIL;
    }

    public static SubLObject alchemy_export_fol_number(final SubLObject fol_number) {
        SubLObject fol_number_fn = NIL;
        SubLObject number = NIL;
        destructuring_bind_must_consp(fol_number, fol_number, $list204);
        fol_number_fn = fol_number.first();
        SubLObject current = fol_number.rest();
        destructuring_bind_must_consp(current, fol_number, $list204);
        number = current.first();
        current = current.rest();
        if (NIL == current) {
            return alchemy_export_number(number);
        }
        cdestructuring_bind_error(fol_number, $list204);
        return NIL;
    }

    public static final SubLObject alchemy_export_number_alt(SubLObject number) {
        return format(NIL, number.isDouble() ? ((SubLObject) ($str_alt206$_F)) : $str_alt207$_D, number);
    }

    public static SubLObject alchemy_export_number(final SubLObject number) {
        return format(NIL, number.isDouble() ? $str205$_F : $str206$_D, number);
    }

    public static final SubLObject alchemy_export_fol_nat_alt(SubLObject fol_nat) {
        {
            SubLObject nat = folification.focycl_to_cycl(fol_nat);
            return com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export_nat(nat);
        }
    }

    public static SubLObject alchemy_export_fol_nat(final SubLObject fol_nat) {
        final SubLObject nat = folification.focycl_to_cycl(fol_nat);
        return alchemy_export_nat(nat);
    }

    public static final SubLObject alchemy_export_nat_alt(SubLObject nat) {
        return cconcatenate($alchemy_export_hl_id_prefix$.getGlobalValue(), kb_utilities.hl_external_id_string(nat));
    }

    public static SubLObject alchemy_export_nat(final SubLObject nat) {
        return cconcatenate($alchemy_export_hl_id_prefix$.getGlobalValue(), kb_utilities.hl_external_id_string(nat));
    }

    public static final SubLObject alchemy_export_delete_forbidden_chars_alt(SubLObject string) {
        return list_utilities.delete_if_not(symbol_function(VALID_ALCHEMY_IDENTIFIER_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject alchemy_export_delete_forbidden_chars(final SubLObject string) {
        return list_utilities.delete_if_not(symbol_function(VALID_ALCHEMY_IDENTIFIER_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Is OBJECT a string that represents a valid Alchemy constant?
     */
    @LispMethod(comment = "Is OBJECT a string that represents a valid Alchemy constant?")
    public static final SubLObject alchemy_constant_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_identifier_p(v_object)) && (NIL != upper_case_p(string_utilities.first_char(v_object)))) || (((v_object.isString() && (NIL != list_utilities.lengthGE(v_object, THREE_INTEGER, UNPROVIDED))) && string_utilities.first_char(v_object).eql(CHAR_quotation)) && string_utilities.last_char(v_object).eql(CHAR_quotation)));
    }

    @LispMethod(comment = "Is OBJECT a string that represents a valid Alchemy constant?")
    public static SubLObject alchemy_constant_p(final SubLObject v_object) {
        return makeBoolean(((NIL != alchemy_identifier_p(v_object)) && (NIL != upper_case_p(string_utilities.first_char(v_object)))) || (((v_object.isString() && (NIL != list_utilities.lengthGE(v_object, THREE_INTEGER, UNPROVIDED))) && string_utilities.first_char(v_object).eql(CHAR_quotation)) && string_utilities.last_char(v_object).eql(CHAR_quotation)));
    }

    /**
     * Is OBJECT a string that represents a valid Alchemy variable?
     */
    @LispMethod(comment = "Is OBJECT a string that represents a valid Alchemy variable?")
    public static final SubLObject alchemy_variable_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_identifier_p(v_object)) && (NIL != lower_case_p(string_utilities.first_char(v_object))));
    }

    @LispMethod(comment = "Is OBJECT a string that represents a valid Alchemy variable?")
    public static SubLObject alchemy_variable_p(final SubLObject v_object) {
        return makeBoolean((NIL != alchemy_identifier_p(v_object)) && (NIL != lower_case_p(string_utilities.first_char(v_object))));
    }

    /**
     * Is OBJECT a string that represents a valid Alchemy identifier?
     */
    @LispMethod(comment = "Is OBJECT a string that represents a valid Alchemy identifier?")
    public static final SubLObject alchemy_identifier_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != string_utilities.non_empty_string_p(v_object)) && (!string_utilities.first_char(v_object).eql(CHAR_quote))) && (NIL == list_utilities.find_if_not(symbol_function(VALID_ALCHEMY_IDENTIFIER_CHAR_P), v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    @LispMethod(comment = "Is OBJECT a string that represents a valid Alchemy identifier?")
    public static SubLObject alchemy_identifier_p(final SubLObject v_object) {
        return makeBoolean(((NIL != string_utilities.non_empty_string_p(v_object)) && (!string_utilities.first_char(v_object).eql(CHAR_quote))) && (NIL == list_utilities.find_if_not(symbol_function(VALID_ALCHEMY_IDENTIFIER_CHAR_P), v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Is OBJECT a character that is permitted in Alchemy identifiers?
     */
    @LispMethod(comment = "Is OBJECT a character that is permitted in Alchemy identifiers?")
    public static final SubLObject valid_alchemy_identifier_char_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isChar() && ((((NIL != alphanumericp(v_object)) || v_object.eql(CHAR_hyphen)) || v_object.eql(CHAR_underbar)) || v_object.eql(CHAR_quote)));
    }

    @LispMethod(comment = "Is OBJECT a character that is permitted in Alchemy identifiers?")
    public static SubLObject valid_alchemy_identifier_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && ((((NIL != alphanumericp(v_object)) || v_object.eql(CHAR_hyphen)) || v_object.eql(CHAR_underbar)) || v_object.eql(CHAR_quote)));
    }

    public static final SubLObject export_regressions_alt(SubLObject to_dir) {
        if (to_dir == UNPROVIDED) {
            to_dir = $str_alt220$_scratch_alchemytemp_cyc_projects;
        }
        {
            SubLObject cdolist_list_var = $regression_calls$.getGlobalValue();
            SubLObject regression_call = NIL;
            for (regression_call = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , regression_call = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.butler.alchemy_export.export_regression(regression_call.first(), to_dir);
            }
        }
        return NIL;
    }

    public static SubLObject export_regressions(SubLObject to_dir) {
        if (to_dir == UNPROVIDED) {
            to_dir = $str219$_scratch_alchemytemp_cyc_projects;
        }
        SubLObject cdolist_list_var = $regression_calls$.getGlobalValue();
        SubLObject regression_call = NIL;
        regression_call = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            export_regression(regression_call.first(), to_dir);
            cdolist_list_var = cdolist_list_var.rest();
            regression_call = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject export_regression_alt(SubLObject regression_name, SubLObject to_dir) {
        if (to_dir == UNPROVIDED) {
            to_dir = $str_alt220$_scratch_alchemytemp_cyc_projects;
        }
        SubLTrampolineFile.checkType(regression_name, STRINGP);
        SubLTrampolineFile.checkType(to_dir, STRINGP);
        file_utilities.make_directory_recursive(to_dir, UNPROVIDED, UNPROVIDED);
        {
            SubLObject test_form = copy_list(list_utilities.alist_lookup($regression_calls$.getGlobalValue(), regression_name, symbol_function(EQUALP), UNPROVIDED));
            if (NIL == test_form) {
                Errors.error($str_alt221$Got_invalid_regression_test_name_, regression_name);
            }
            {
                SubLObject mln_file = fifth(test_form);
                SubLObject training_file = sixth(test_form);
                SubLObject evidence_files = second(seventh(test_form));
                SubLObject new_evidence_files = NIL;
                mln_file = cconcatenate(to_dir, mln_file);
                training_file = cconcatenate(to_dir, training_file);
                {
                    SubLObject cdolist_list_var = evidence_files;
                    SubLObject evidence_file = NIL;
                    for (evidence_file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , evidence_file = cdolist_list_var.first()) {
                        new_evidence_files = cons(cconcatenate(to_dir, evidence_file), new_evidence_files);
                    }
                }
                evidence_files = nreverse(evidence_files);
                set_nth(FOUR_INTEGER, test_form, mln_file);
                set_nth(FIVE_INTEGER, test_form, training_file);
                set_nth(SIX_INTEGER, test_form, list(QUOTE, new_evidence_files));
            }
            format(T, $str_alt223$_S__, test_form);
            return eval(test_form);
        }
    }

    public static SubLObject export_regression(final SubLObject regression_name, SubLObject to_dir) {
        if (to_dir == UNPROVIDED) {
            to_dir = $str219$_scratch_alchemytemp_cyc_projects;
        }
        assert NIL != stringp(regression_name) : "! stringp(regression_name) " + ("Types.stringp(regression_name) " + "CommonSymbols.NIL != Types.stringp(regression_name) ") + regression_name;
        assert NIL != stringp(to_dir) : "! stringp(to_dir) " + ("Types.stringp(to_dir) " + "CommonSymbols.NIL != Types.stringp(to_dir) ") + to_dir;
        file_utilities.make_directory_recursive(to_dir, UNPROVIDED, UNPROVIDED);
        final SubLObject test_form = copy_list(list_utilities.alist_lookup($regression_calls$.getGlobalValue(), regression_name, symbol_function(EQUALP), UNPROVIDED));
        if (NIL == test_form) {
            Errors.error($str220$Got_invalid_regression_test_name_, regression_name);
        }
        SubLObject mln_file = fifth(test_form);
        SubLObject training_file = sixth(test_form);
        SubLObject evidence_files = second(seventh(test_form));
        SubLObject new_evidence_files = NIL;
        mln_file = cconcatenate(to_dir, mln_file);
        training_file = cconcatenate(to_dir, training_file);
        SubLObject cdolist_list_var = evidence_files;
        SubLObject evidence_file = NIL;
        evidence_file = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_evidence_files = cons(cconcatenate(to_dir, evidence_file), new_evidence_files);
            cdolist_list_var = cdolist_list_var.rest();
            evidence_file = cdolist_list_var.first();
        } 
        evidence_files = nreverse(evidence_files);
        set_nth(FOUR_INTEGER, test_form, mln_file);
        set_nth(FIVE_INTEGER, test_form, training_file);
        set_nth(SIX_INTEGER, test_form, list(QUOTE, new_evidence_files));
        format(T, $str222$_S__, test_form);
        return eval(test_form);
    }

    public static final SubLObject test_alchemy_export_alt() {
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt224, $list_alt225, $list_alt226, $str_alt227$_cyc_projects_transfer_learning_S, $str_alt228$_cyc_projects_transfer_learning_S, $list_alt229, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt230, $list_alt231, $list_alt232, $str_alt233$_cyc_projects_transfer_learning_S, $str_alt234$_cyc_projects_transfer_learning_S, $list_alt235, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt236, $list_alt237, $list_alt238, $str_alt239$_cyc_projects_transfer_learning_S, $str_alt240$_cyc_projects_transfer_learning_S, $list_alt241, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt242, $list_alt243, $list_alt244, $str_alt245$_cyc_projects_transfer_learning_S, $str_alt246$_cyc_projects_transfer_learning_S, $list_alt247, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt248, $list_alt249, $list_alt250, $str_alt251$_cyc_projects_transfer_learning_S, $str_alt252$_cyc_projects_transfer_learning_S, $list_alt253, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt254, $list_alt255, $list_alt256, $str_alt257$_cyc_projects_transfer_learning_S, $str_alt258$_cyc_projects_transfer_learning_S, $list_alt259, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt260, $list_alt249, $list_alt250, $str_alt261$_cyc_projects_transfer_learning_S, $str_alt262$_cyc_projects_transfer_learning_S, $list_alt263, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt264, $list_alt249, $list_alt250, $str_alt265$_cyc_projects_transfer_learning_S, $str_alt266$_cyc_projects_transfer_learning_S, $list_alt267, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt268, $list_alt268, $list_alt269, $str_alt270$_cyc_projects_transfer_learning_S, $str_alt271$_cyc_projects_transfer_learning_S, $list_alt272, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt248, $list_alt249, $list_alt250, $str_alt273$_cyc_projects_transfer_learning_S, $str_alt274$_cyc_projects_transfer_learning_S, $list_alt275, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt276, $list_alt277, $list_alt278, $str_alt279$_cyc_projects_transfer_learning_S, $str_alt280$_cyc_projects_transfer_learning_S, $list_alt281, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt282, $list_alt243, list(list($IN_MT, czer_main.canonicalize_term($list_alt283, UNPROVIDED))), $str_alt284$_cyc_projects_transfer_learning_S, $str_alt285$_cyc_projects_transfer_learning_S, $list_alt286, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.butler.alchemy_export.alchemy_export($list_alt287, $list_alt288, $list_alt289, $str_alt290$_cyc_projects_transfer_learning_S, $str_alt291$_cyc_projects_transfer_learning_S, $list_alt292, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject test_alchemy_export() {
        alchemy_export($list223, $list224, $list225, $str226$_cyc_projects_transfer_learning_S, $str227$_cyc_projects_transfer_learning_S, $list228, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list229, $list230, $list231, $str232$_cyc_projects_transfer_learning_S, $str233$_cyc_projects_transfer_learning_S, $list234, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list235, $list236, $list237, $str238$_cyc_projects_transfer_learning_S, $str239$_cyc_projects_transfer_learning_S, $list240, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list241, $list242, $list243, $str244$_cyc_projects_transfer_learning_S, $str245$_cyc_projects_transfer_learning_S, $list246, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list247, $list248, $list249, $str250$_cyc_projects_transfer_learning_S, $str251$_cyc_projects_transfer_learning_S, $list252, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list253, $list254, $list255, $str256$_cyc_projects_transfer_learning_S, $str257$_cyc_projects_transfer_learning_S, $list258, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list259, $list248, $list249, $str260$_cyc_projects_transfer_learning_S, $str261$_cyc_projects_transfer_learning_S, $list262, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list263, $list248, $list249, $str264$_cyc_projects_transfer_learning_S, $str265$_cyc_projects_transfer_learning_S, $list266, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list267, $list267, $list268, $str269$_cyc_projects_transfer_learning_S, $str270$_cyc_projects_transfer_learning_S, $list271, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list247, $list248, $list249, $str272$_cyc_projects_transfer_learning_S, $str273$_cyc_projects_transfer_learning_S, $list274, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list275, $list276, $list277, $str278$_cyc_projects_transfer_learning_S, $str279$_cyc_projects_transfer_learning_S, $list280, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list281, $list242, list(list($IN_MT, czer_main.canonicalize_term($list282, UNPROVIDED))), $str283$_cyc_projects_transfer_learning_S, $str284$_cyc_projects_transfer_learning_S, $list285, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        alchemy_export($list286, $list287, $list288, $str289$_cyc_projects_transfer_learning_S, $str290$_cyc_projects_transfer_learning_S, $list291, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_alchemy_export_file() {
        declareFunction("inference_output_answers_alchemy", "INFERENCE-OUTPUT-ANSWERS-ALCHEMY", 2, 0, false);
        declareFunction("alchemy_export_inference_answers_header", "ALCHEMY-EXPORT-INFERENCE-ANSWERS-HEADER", 2, 0, false);
        declareFunction("alchemy_export_query_variable_bindings_to_file", "ALCHEMY-EXPORT-QUERY-VARIABLE-BINDINGS-TO-FILE", 3, 2, false);
        declareFunction("alchemy_export_sentences_to_file", "ALCHEMY-EXPORT-SENTENCES-TO-FILE", 2, 0, false);
        declareFunction("alchemy_export_sentences", "ALCHEMY-EXPORT-SENTENCES", 1, 1, false);
        declareFunction("alchemy_export_sentence_with_error_handling", "ALCHEMY-EXPORT-SENTENCE-WITH-ERROR-HANDLING", 2, 0, false);
        declareFunction("assertions_meeting_criterion_to_alchemy_file", "ASSERTIONS-MEETING-CRITERION-TO-ALCHEMY-FILE", 2, 2, false);
        declareFunction("assertions_to_alchemy_file", "ASSERTIONS-TO-ALCHEMY-FILE", 3, 0, false);
        declareFunction("assertions_to_alchemy_stream", "ASSERTIONS-TO-ALCHEMY-STREAM", 3, 0, false);
        declareFunction("check_assertion_selection_criterion", "CHECK-ASSERTION-SELECTION-CRITERION", 1, 0, false);
        declareFunction("atomic_assertion_selection_criterion_p", "ATOMIC-ASSERTION-SELECTION-CRITERION-P", 1, 0, false);
        declareFunction("check_non_atomic_assertion_selection_criterion", "CHECK-NON-ATOMIC-ASSERTION-SELECTION-CRITERION", 1, 0, false);
        declareFunction("check_non_atomic_assertion_selection_criterion_arg_types", "CHECK-NON-ATOMIC-ASSERTION-SELECTION-CRITERION-ARG-TYPES", 3, 0, false);
        declareFunction("check_non_atomic_assertion_selection_criterion_arg_type", "CHECK-NON-ATOMIC-ASSERTION-SELECTION-CRITERION-ARG-TYPE", 2, 0, false);
        declareFunction("get_assertion_selection_operator_arg_types", "GET-ASSERTION-SELECTION-OPERATOR-ARG-TYPES", 1, 1, false);
        declareFunction("find_assertions_by_criterion", "FIND-ASSERTIONS-BY-CRITERION", 1, 1, false);
        declareFunction("find_assertions_by_criterion_no_checks", "FIND-ASSERTIONS-BY-CRITERION-NO-CHECKS", 2, 0, false);
        declareFunction("find_assertions_by_criterion_int", "FIND-ASSERTIONS-BY-CRITERION-INT", 1, 0, false);
        declareFunction("delayed_atomic_assertion_selection_criterion_p", "DELAYED-ATOMIC-ASSERTION-SELECTION-CRITERION-P", 1, 0, false);
        declareFunction("delayed_assertion_selection_criterion_operator_p", "DELAYED-ASSERTION-SELECTION-CRITERION-OPERATOR-P", 1, 0, false);
        declareFunction("delayed_assertion_selection_criterionP", "DELAYED-ASSERTION-SELECTION-CRITERION?", 1, 0, false);
        declareFunction("all_assertions_meeting_all_criteria", "ALL-ASSERTIONS-MEETING-ALL-CRITERIA", 1, 0, false);
        declareFunction("find_assertions_meeting_criterion_among", "FIND-ASSERTIONS-MEETING-CRITERION-AMONG", 2, 0, false);
        declareFunction("find_assertions_not_meeting_criterion_among", "FIND-ASSERTIONS-NOT-MEETING-CRITERION-AMONG", 2, 0, false);
        declareFunction("all_rules_among", "ALL-RULES-AMONG", 1, 0, false);
        declareFunction("verbosified_el_ruleP", "VERBOSIFIED-EL-RULE?", 1, 0, false);
        declareFunction("all_gafs_among", "ALL-GAFS-AMONG", 1, 0, false);
        declareFunction("all_assertions_visible_from_mt", "ALL-ASSERTIONS-VISIBLE-FROM-MT", 1, 0, false);
        declareFunction("all_assertions_visible_from_mt_among", "ALL-ASSERTIONS-VISIBLE-FROM-MT-AMONG", 2, 0, false);
        declareFunction("all_assertions_not_visible_from_mt_among", "ALL-ASSERTIONS-NOT-VISIBLE-FROM-MT-AMONG", 2, 0, false);
        declareFunction("all_isa_assertions_of_collection", "ALL-ISA-ASSERTIONS-OF-COLLECTION", 1, 0, false);
        declareFunction("all_isa_assertions_of_all_collections_in_set_or_coll", "ALL-ISA-ASSERTIONS-OF-ALL-COLLECTIONS-IN-SET-OR-COLL", 1, 0, false);
        declareFunction("all_isa_assertions_of_all_quoted_instances_of_coll", "ALL-ISA-ASSERTIONS-OF-ALL-QUOTED-INSTANCES-OF-COLL", 1, 0, false);
        declareFunction("predicate_extent", "PREDICATE-EXTENT", 1, 0, false);
        declareFunction("union_of_extents_of_predicate_set_or_coll", "UNION-OF-EXTENTS-OF-PREDICATE-SET-OR-COLL", 1, 0, false);
        declareFunction("union_of_extents_of_all_quoted_instances_of_coll", "UNION-OF-EXTENTS-OF-ALL-QUOTED-INSTANCES-OF-COLL", 1, 0, false);
        declareFunction("all_assertions_meeting_criterion_plus_extents_of_predicates_mentioned", "ALL-ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-MENTIONED", 1, 0, false);
        declareFunction("assertion_predicates", "ASSERTION-PREDICATES", 1, 0, false);
        declareFunction("all_assertions_meeting_criterion_plus_extents_of_predicates_and_collections_mentioned", "ALL-ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-AND-COLLECTIONS-MENTIONED", 1, 0, false);
        declareFunction("assertion_predicates_and_collections", "ASSERTION-PREDICATES-AND-COLLECTIONS", 1, 0, false);
        declareFunction("predicate_or_collection_p", "PREDICATE-OR-COLLECTION-P", 1, 0, false);
        declareFunction("pred_or_coll_extent", "PRED-OR-COLL-EXTENT", 1, 0, false);
        declareFunction("all_assertions_mentioning_indexed_term", "ALL-ASSERTIONS-MENTIONING-INDEXED-TERM", 1, 0, false);
        declareFunction("all_assertions_mentioning_indexed_term_at_least_n_times", "ALL-ASSERTIONS-MENTIONING-INDEXED-TERM-AT-LEAST-N-TIMES", 2, 0, false);
        declareFunction("all_assertions_mentioning_indexed_term_in_argpos", "ALL-ASSERTIONS-MENTIONING-INDEXED-TERM-IN-ARGPOS", 2, 1, false);
        declareFunction("all_assertions_mentioning_any_indexed_term_in_set_or_coll", "ALL-ASSERTIONS-MENTIONING-ANY-INDEXED-TERM-IN-SET-OR-COLL", 1, 0, false);
        declareFunction("all_assertions_mentioning_any_quoted_instance_of", "ALL-ASSERTIONS-MENTIONING-ANY-QUOTED-INSTANCE-OF", 1, 0, false);
        declareFunction("all_assertions_mentioning_indexed_terms_in_set_or_coll_at_least_n_times", "ALL-ASSERTIONS-MENTIONING-INDEXED-TERMS-IN-SET-OR-COLL-AT-LEAST-N-TIMES", 2, 0, false);
        declareFunction("all_assertions_mentioning_quoted_instances_of_at_least_n_times", "ALL-ASSERTIONS-MENTIONING-QUOTED-INSTANCES-OF-AT-LEAST-N-TIMES", 2, 0, false);
        declareFunction("all_assertions_mentioning_any_indexed_term_in_set_or_coll_in_argpos", "ALL-ASSERTIONS-MENTIONING-ANY-INDEXED-TERM-IN-SET-OR-COLL-IN-ARGPOS", 2, 1, false);
        declareFunction("all_assertions_mentioning_any_quoted_instance_of_in_argpos", "ALL-ASSERTIONS-MENTIONING-ANY-QUOTED-INSTANCE-OF-IN-ARGPOS", 2, 1, false);
        declareFunction("all_assertions_mentioning_all_indexed_terms_in_set_or_coll", "ALL-ASSERTIONS-MENTIONING-ALL-INDEXED-TERMS-IN-SET-OR-COLL", 1, 0, false);
        declareFunction("all_assertions_mentioning_all_quoted_instances_of", "ALL-ASSERTIONS-MENTIONING-ALL-QUOTED-INSTANCES-OF", 1, 0, false);
        declareFunction("all_assertions_mentioning_only_indexed_terms_in_set_or_coll", "ALL-ASSERTIONS-MENTIONING-ONLY-INDEXED-TERMS-IN-SET-OR-COLL", 1, 0, false);
        declareFunction("all_assertions_mentioning_only_quoted_instances_of", "ALL-ASSERTIONS-MENTIONING-ONLY-QUOTED-INSTANCES-OF", 1, 0, false);
        declareFunction("alchemy_export", "ALCHEMY-EXPORT", 6, 3, false);
        declareFunction("alchemy_export_int", "ALCHEMY-EXPORT-INT", 6, 3, false);
        declareFunction("alchemy_export_gather_training_rules_and_gafs", "ALCHEMY-EXPORT-GATHER-TRAINING-RULES-AND-GAFS", 4, 0, false);
        declareFunction("alchemy_export_gather_evidence_gaf_lists", "ALCHEMY-EXPORT-GATHER-EVIDENCE-GAF-LISTS", 2, 0, false);
        declareFunction("alchemy_export_allowed_types", "ALCHEMY-EXPORT-ALLOWED-TYPES", 2, 0, false);
        declareFunction("alchemy_export_filter_dictionaries", "ALCHEMY-EXPORT-FILTER-DICTIONARIES", 2, 0, false);
        declareFunction("alchemy_export_filter_dictionary", "ALCHEMY-EXPORT-FILTER-DICTIONARY", 2, 0, false);
        declareFunction("alchemy_export_type_files", "ALCHEMY-EXPORT-TYPE-FILES", 2, 0, false);
        declareFunction("alchemy_export_filter_gaf_lists", "ALCHEMY-EXPORT-FILTER-GAF-LISTS", 3, 0, false);
        declareFunction("alchemy_export_filter_gafs", "ALCHEMY-EXPORT-FILTER-GAFS", 2, 0, false);
        declareFunction("alchemy_export_gaf_files", "ALCHEMY-EXPORT-GAF-FILES", 2, 0, false);
        declareFunction("alchemy_export_gaf_file", "ALCHEMY-EXPORT-GAF-FILE", 2, 0, false);
        declareFunction("alchemy_export_filter_rules", "ALCHEMY-EXPORT-FILTER-RULES", 2, 0, false);
        declareFunction("alchemy_export_training_fol_predicates", "ALCHEMY-EXPORT-TRAINING-FOL-PREDICATES", 2, 0, false);
        declareFunction("ae_filter_and_export_rule_file", "AE-FILTER-AND-EXPORT-RULE-FILE", 6, 0, false);
        declareFunction("alchemy_export_augment_rule_criterion", "ALCHEMY-EXPORT-AUGMENT-RULE-CRITERION", 1, 0, false);
        declareFunction("alchemy_export_augment_gaf_criterion", "ALCHEMY-EXPORT-AUGMENT-GAF-CRITERION", 1, 0, false);
        declareFunction("alchemy_export_add_types", "ALCHEMY-EXPORT-ADD-TYPES", 3, 0, false);
        declareFunction("alchemy_export_type_dictionary_enter", "ALCHEMY-EXPORT-TYPE-DICTIONARY-ENTER", 4, 0, false);
        declareFunction("alchemy_export_type_dictionary_pushnew", "ALCHEMY-EXPORT-TYPE-DICTIONARY-PUSHNEW", 4, 0, false);
        declareFunction("alchemy_export_augment_instances_in_type_dictionary", "ALCHEMY-EXPORT-AUGMENT-INSTANCES-IN-TYPE-DICTIONARY", 2, 0, false);
        declareFunction("alchemy_export_display_types", "ALCHEMY-EXPORT-DISPLAY-TYPES", 2, 0, false);
        declareFunction("alchemy_export_filter_rules_by_allowed_types", "ALCHEMY-EXPORT-FILTER-RULES-BY-ALLOWED-TYPES", 3, 0, false);
        declareFunction("alchemy_export_check_type_dictionary_for_type", "ALCHEMY-EXPORT-CHECK-TYPE-DICTIONARY-FOR-TYPE", 6, 0, false);
        declareFunction("ae_all_variables_have_instances", "AE-ALL-VARIABLES-HAVE-INSTANCES", 3, 0, false);
        declareFunction("alchemy_export_numeric_term_filter", "ALCHEMY-EXPORT-NUMERIC-TERM-FILTER", 1, 0, false);
        declareFunction("alchemy_export_isa_term_type", "ALCHEMY-EXPORT-ISA-TERM-TYPE", 2, 0, false);
        declareFunction("alchemy_export_isa_term_coll_intersection_type", "ALCHEMY-EXPORT-ISA-TERM-COLL-INTERSECTION-TYPE", 2, 0, false);
        declareFunction("alchemy_export_get_lits", "ALCHEMY-EXPORT-GET-LITS", 1, 0, false);
        declareFunction("alchemy_export_filter_assertions_acceptable_for_fol", "ALCHEMY-EXPORT-FILTER-ASSERTIONS-ACCEPTABLE-FOR-FOL", 1, 0, false);
        declareFunction("alchemy_export_filter_training_isa_gafs", "ALCHEMY-EXPORT-FILTER-TRAINING-ISA-GAFS", 3, 0, false);
        declareFunction("alchemy_export_filter_evidence_isa_gafs", "ALCHEMY-EXPORT-FILTER-EVIDENCE-ISA-GAFS", 4, 0, false);
        declareFunction("alchemy_export_filter_evidence_gafs", "ALCHEMY-EXPORT-FILTER-EVIDENCE-GAFS", 2, 0, false);
        declareFunction("ae_export_rules_file", "AE-EXPORT-RULES-FILE", 4, 0, false);
        declareFunction("ae_predicate_declarations_to_stream", "AE-PREDICATE-DECLARATIONS-TO-STREAM", 3, 0, false);
        declareFunction("alchemy_predicate_declaration_to_stream", "ALCHEMY-PREDICATE-DECLARATION-TO-STREAM", 2, 0, false);
        declareFunction("alchemy_predicate_arg_constraints", "ALCHEMY-PREDICATE-ARG-CONSTRAINTS", 2, 0, false);
        declareFunction("alchemy_predicate_argpos_constraint", "ALCHEMY-PREDICATE-ARGPOS-CONSTRAINT", 2, 0, false);
        declareFunction("alchemy_export_types_file", "ALCHEMY-EXPORT-TYPES-FILE", 2, 0, false);
        declareFunction("alchemy_fol_denotational_term_not_requiring_declaration_p", "ALCHEMY-FOL-DENOTATIONAL-TERM-NOT-REQUIRING-DECLARATION-P", 1, 0, false);
        declareFunction("alchemy_type_declaration_to_stream", "ALCHEMY-TYPE-DECLARATION-TO-STREAM", 3, 0, false);
        declareFunction("alchemy_export_data_file", "ALCHEMY-EXPORT-DATA-FILE", 2, 0, false);
        declareFunction("all_fol_predicates_and_arguments_mentioned_in_analyses", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-ANALYSES", 1, 0, false);
        declareFunction("alchemy_assertions_forts", "ALCHEMY-ASSERTIONS-FORTS", 1, 0, false);
        declareFunction("alchemy_skip_fol_sentenceP", "ALCHEMY-SKIP-FOL-SENTENCE?", 1, 0, false);
        declareFunction("cycl_assertions_to_alchemy_style_fol", "CYCL-ASSERTIONS-TO-ALCHEMY-STYLE-FOL", 1, 0, false);
        declareFunction("cycl_sentence_to_alchemy_sentences", "CYCL-SENTENCE-TO-ALCHEMY-SENTENCES", 1, 0, false);
        declareFunction("cycl_sentence_to_external_fol", "CYCL-SENTENCE-TO-EXTERNAL-FOL", 3, 0, false);
        declareFunction("alchemy_export_sentence", "ALCHEMY-EXPORT-SENTENCE", 1, 3, false);
        declareFunction("alchemy_export_sentence_parenthesized", "ALCHEMY-EXPORT-SENTENCE-PARENTHESIZED", 1, 1, false);
        declareFunction("clear_alchemy_export_sentential_relation", "CLEAR-ALCHEMY-EXPORT-SENTENTIAL-RELATION", 0, 0, false);
        declareFunction("remove_alchemy_export_sentential_relation", "REMOVE-ALCHEMY-EXPORT-SENTENTIAL-RELATION", 1, 0, false);
        declareFunction("alchemy_export_sentential_relation_internal", "ALCHEMY-EXPORT-SENTENTIAL-RELATION-INTERNAL", 1, 0, false);
        declareFunction("alchemy_export_sentential_relation", "ALCHEMY-EXPORT-SENTENTIAL-RELATION", 1, 0, false);
        declareFunction("alchemy_export_type", "ALCHEMY-EXPORT-TYPE", 1, 0, false);
        declareFunction("alchemy_export_type_constant", "ALCHEMY-EXPORT-TYPE-CONSTANT", 1, 0, false);
        declareFunction("alchemy_export_type_nat", "ALCHEMY-EXPORT-TYPE-NAT", 1, 0, false);
        declareFunction("alchemy_export_fol_predicate", "ALCHEMY-EXPORT-FOL-PREDICATE", 1, 0, false);
        declareFunction("alchemy_export_predicate_with_arity", "ALCHEMY-EXPORT-PREDICATE-WITH-ARITY", 2, 0, false);
        declareFunction("alchemy_export_predicate_constant", "ALCHEMY-EXPORT-PREDICATE-CONSTANT", 2, 0, false);
        declareFunction("alchemy_export_predicate_nat", "ALCHEMY-EXPORT-PREDICATE-NAT", 2, 0, false);
        declareFunction("alchemy_export_fol_term", "ALCHEMY-EXPORT-FOL-TERM", 1, 0, false);
        declareFunction("alchemy_export_fol_constant", "ALCHEMY-EXPORT-FOL-CONSTANT", 1, 0, false);
        declareFunction("alchemy_export_constant", "ALCHEMY-EXPORT-CONSTANT", 1, 0, false);
        declareFunction("alchemy_export_variable", "ALCHEMY-EXPORT-VARIABLE", 1, 0, false);
        declareFunction("alchemy_export_fol_string", "ALCHEMY-EXPORT-FOL-STRING", 1, 0, false);
        declareFunction("alchemy_export_string", "ALCHEMY-EXPORT-STRING", 1, 0, false);
        declareFunction("alchemy_export_fol_number", "ALCHEMY-EXPORT-FOL-NUMBER", 1, 0, false);
        declareFunction("alchemy_export_number", "ALCHEMY-EXPORT-NUMBER", 1, 0, false);
        declareFunction("alchemy_export_fol_nat", "ALCHEMY-EXPORT-FOL-NAT", 1, 0, false);
        declareFunction("alchemy_export_nat", "ALCHEMY-EXPORT-NAT", 1, 0, false);
        declareFunction("alchemy_export_delete_forbidden_chars", "ALCHEMY-EXPORT-DELETE-FORBIDDEN-CHARS", 1, 0, false);
        declareFunction("alchemy_constant_p", "ALCHEMY-CONSTANT-P", 1, 0, false);
        declareFunction("alchemy_variable_p", "ALCHEMY-VARIABLE-P", 1, 0, false);
        declareFunction("alchemy_identifier_p", "ALCHEMY-IDENTIFIER-P", 1, 0, false);
        declareFunction("valid_alchemy_identifier_char_p", "VALID-ALCHEMY-IDENTIFIER-CHAR-P", 1, 0, false);
        declareFunction("export_regressions", "EXPORT-REGRESSIONS", 0, 1, false);
        declareFunction("export_regression", "EXPORT-REGRESSION", 1, 1, false);
        declareFunction("test_alchemy_export", "TEST-ALCHEMY-EXPORT", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_alchemy_export_file_alt() {
        defparameter("*ALCHEMY-EXPORT-CAFS-OR-RULES?*", $BOTH);
        deflexical("*ATOMIC-ASSERTION-SELECTION-CRITERIA*", list($RULE, $GAF));
        deflexical("*ASSERTION-SELECTION-ARG-TYPES-BY-OPERATOR*", $list_alt20);
        deflexical("*DELAYED-ATOMIC-ASSERTION-SELECTION-CRITERIA*", list($RULE, $GAF));
        deflexical("*DELAYED-ASSERTION-SELECTION-CRITERION-OPERATORS*", list($VISIBLE_FROM_MT));
        defparameter("*AE-NUMBER-OF-SENTENCES*", ZERO_INTEGER);
        defparameter("*AE-NUMBER-OF-TRAINING-PREDICATES*", ZERO_INTEGER);
        defparameter("*AE-NUMBER-OF-EVIDENCE-TERMS*", ZERO_INTEGER);
        deflexical("*ALCHEMY-EXPORT-NUMERIC-TERMS*", NIL);
        defparameter("*ALCHEMY-EXPORT-DROPPED-PREDICATES*", $list_alt138);
        deflexical("*ALCHEMY-FOLIFICATION-PROPERTIES*", list($MT_HANDLING, $list_alt168, $kw169$ALLOW_EQUIV_RELATION_, T, $kw170$RETURN_DATA_, T, $RULE_MACRO_PREDICATE_HANDLING, $EXPANSION));
        deflexical("*ALCHEMY-EXPORT-SENTENTIAL-RELATION-CACHING-STATE*", NIL);
        deflexical("*ALCHEMY-EXPORT-TYPE-PREFIX*", $$$type);
        deflexical("*ALCHEMY-EXPORT-PREDICATE-PREFIX*", $$$pred);
        deflexical("*ALCHEMY-EXPORT-CONSTANT-PREFIX*", $str_alt199$C_);
        deflexical("*ALCHEMY-EXPORT-HL-ID-PREFIX*", $str_alt200$HLID_);
        deflexical("*DOUBLE-QUOTE-STRING*", $str_alt203$_);
        deflexical("*CENTRAL-REGRESSION-DIR*", $str_alt209$_cyc_projects_transfer_learning_S);
        deflexical("*REGRESSION-CALLS*", list(cons($$$A, $list_alt211), cons($$$B, $list_alt213), cons($$$C, $list_alt215), cons($$$D, $list_alt217), cons($$$E, $list_alt219)));
        return NIL;
    }

    public static SubLObject init_alchemy_export_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*ALCHEMY-EXPORT-CAFS-OR-RULES?*", $BOTH);
            deflexical("*ATOMIC-ASSERTION-SELECTION-CRITERIA*", list($RULE, $GAF));
            deflexical("*ASSERTION-SELECTION-ARG-TYPES-BY-OPERATOR*", $list20);
            deflexical("*DELAYED-ATOMIC-ASSERTION-SELECTION-CRITERIA*", list($RULE, $GAF));
            deflexical("*DELAYED-ASSERTION-SELECTION-CRITERION-OPERATORS*", list($VISIBLE_FROM_MT));
            defparameter("*AE-NUMBER-OF-SENTENCES*", ZERO_INTEGER);
            defparameter("*AE-NUMBER-OF-TRAINING-PREDICATES*", ZERO_INTEGER);
            defparameter("*AE-NUMBER-OF-EVIDENCE-TERMS*", ZERO_INTEGER);
            deflexical("*ALCHEMY-EXPORT-NUMERIC-TERMS*", NIL);
            defparameter("*ALCHEMY-EXPORT-DROPPED-PREDICATES*", $list138);
            deflexical("*ALCHEMY-FOLIFICATION-PROPERTIES*", list($MT_HANDLING, $list168, $kw169$ALLOW_EQUIV_RELATION_, T, $kw170$RETURN_DATA_, T, $RULE_MACRO_PREDICATE_HANDLING, $EXPANSION));
            deflexical("*ALCHEMY-EXPORT-SENTENTIAL-RELATION-CACHING-STATE*", NIL);
            deflexical("*ALCHEMY-EXPORT-TYPE-PREFIX*", $$$type);
            deflexical("*ALCHEMY-EXPORT-PREDICATE-PREFIX*", $$$pred);
            deflexical("*ALCHEMY-EXPORT-CONSTANT-PREFIX*", $str198$C_);
            deflexical("*ALCHEMY-EXPORT-HL-ID-PREFIX*", $str199$HLID_);
            deflexical("*DOUBLE-QUOTE-STRING*", $str202$_);
            deflexical("*CENTRAL-REGRESSION-DIR*", $str208$_cyc_projects_transfer_learning_S);
            deflexical("*REGRESSION-CALLS*", list(cons($$$A, $list210), cons($$$B, $list212), cons($$$C, $list214), cons($$$D, $list216), cons($$$E, $list218)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ALCHEMY-EXPORT-CONSTANT-PREFIX*", $str_alt199$C_);
            deflexical("*ALCHEMY-EXPORT-HL-ID-PREFIX*", $str_alt200$HLID_);
            deflexical("*DOUBLE-QUOTE-STRING*", $str_alt203$_);
            deflexical("*CENTRAL-REGRESSION-DIR*", $str_alt209$_cyc_projects_transfer_learning_S);
            deflexical("*REGRESSION-CALLS*", list(cons($$$A, $list_alt211), cons($$$B, $list_alt213), cons($$$C, $list_alt215), cons($$$D, $list_alt217), cons($$$E, $list_alt219)));
        }
        return NIL;
    }

    public static SubLObject init_alchemy_export_file_Previous() {
        defparameter("*ALCHEMY-EXPORT-CAFS-OR-RULES?*", $BOTH);
        deflexical("*ATOMIC-ASSERTION-SELECTION-CRITERIA*", list($RULE, $GAF));
        deflexical("*ASSERTION-SELECTION-ARG-TYPES-BY-OPERATOR*", $list20);
        deflexical("*DELAYED-ATOMIC-ASSERTION-SELECTION-CRITERIA*", list($RULE, $GAF));
        deflexical("*DELAYED-ASSERTION-SELECTION-CRITERION-OPERATORS*", list($VISIBLE_FROM_MT));
        defparameter("*AE-NUMBER-OF-SENTENCES*", ZERO_INTEGER);
        defparameter("*AE-NUMBER-OF-TRAINING-PREDICATES*", ZERO_INTEGER);
        defparameter("*AE-NUMBER-OF-EVIDENCE-TERMS*", ZERO_INTEGER);
        deflexical("*ALCHEMY-EXPORT-NUMERIC-TERMS*", NIL);
        defparameter("*ALCHEMY-EXPORT-DROPPED-PREDICATES*", $list138);
        deflexical("*ALCHEMY-FOLIFICATION-PROPERTIES*", list($MT_HANDLING, $list168, $kw169$ALLOW_EQUIV_RELATION_, T, $kw170$RETURN_DATA_, T, $RULE_MACRO_PREDICATE_HANDLING, $EXPANSION));
        deflexical("*ALCHEMY-EXPORT-SENTENTIAL-RELATION-CACHING-STATE*", NIL);
        deflexical("*ALCHEMY-EXPORT-TYPE-PREFIX*", $$$type);
        deflexical("*ALCHEMY-EXPORT-PREDICATE-PREFIX*", $$$pred);
        deflexical("*ALCHEMY-EXPORT-CONSTANT-PREFIX*", $str198$C_);
        deflexical("*ALCHEMY-EXPORT-HL-ID-PREFIX*", $str199$HLID_);
        deflexical("*DOUBLE-QUOTE-STRING*", $str202$_);
        deflexical("*CENTRAL-REGRESSION-DIR*", $str208$_cyc_projects_transfer_learning_S);
        deflexical("*REGRESSION-CALLS*", list(cons($$$A, $list210), cons($$$B, $list212), cons($$$C, $list214), cons($$$D, $list216), cons($$$E, $list218)));
        return NIL;
    }

    public static final SubLObject setup_alchemy_export_file_alt() {
        memoization_state.note_globally_cached_function(ALCHEMY_EXPORT_SENTENTIAL_RELATION);
        define_test_case_table_int(CYCL_SENTENCE_TO_ALCHEMY_SENTENCES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt301);
        define_test_case_table_int(ALCHEMY_EXPORT_PREDICATE_WITH_ARITY, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$brusseau, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt304);
        define_test_case_table_int(ALCHEMY_EXPORT_FOL_TERM, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$brusseau, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt306);
        define_test_case_table_int(ALCHEMY_CONSTANT_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, $$$brusseau, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt309);
        define_test_case_table_int(ALCHEMY_VARIABLE_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, $$$brusseau, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt311);
        define_test_case_table_int(ALCHEMY_IDENTIFIER_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, $$$brusseau, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt313);
        return NIL;
    }

    public static SubLObject setup_alchemy_export_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(ALCHEMY_EXPORT_SENTENTIAL_RELATION);
            define_test_case_table_int(CYCL_SENTENCE_TO_ALCHEMY_SENTENCES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list299);
            define_test_case_table_int(ALCHEMY_EXPORT_PREDICATE_WITH_ARITY, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list301);
            define_test_case_table_int(ALCHEMY_EXPORT_FOL_TERM, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list303);
            define_test_case_table_int(ALCHEMY_CONSTANT_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list306);
            define_test_case_table_int(ALCHEMY_VARIABLE_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list308);
            define_test_case_table_int(ALCHEMY_IDENTIFIER_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list310);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(CYCL_SENTENCE_TO_ALCHEMY_SENTENCES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt301);
            define_test_case_table_int(ALCHEMY_EXPORT_PREDICATE_WITH_ARITY, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$brusseau, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt304);
            define_test_case_table_int(ALCHEMY_EXPORT_FOL_TERM, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$brusseau, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt306);
            define_test_case_table_int(ALCHEMY_CONSTANT_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, $$$brusseau, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt309);
            define_test_case_table_int(ALCHEMY_VARIABLE_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, $$$brusseau, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt311);
            define_test_case_table_int(ALCHEMY_IDENTIFIER_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, $$$brusseau, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt313);
        }
        return NIL;
    }

    public static SubLObject setup_alchemy_export_file_Previous() {
        memoization_state.note_globally_cached_function(ALCHEMY_EXPORT_SENTENTIAL_RELATION);
        define_test_case_table_int(CYCL_SENTENCE_TO_ALCHEMY_SENTENCES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list299);
        define_test_case_table_int(ALCHEMY_EXPORT_PREDICATE_WITH_ARITY, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list301);
        define_test_case_table_int(ALCHEMY_EXPORT_FOL_TERM, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list303);
        define_test_case_table_int(ALCHEMY_CONSTANT_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list306);
        define_test_case_table_int(ALCHEMY_VARIABLE_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list308);
        define_test_case_table_int(ALCHEMY_IDENTIFIER_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list310);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_alchemy_export_file();
    }

    @Override
    public void initializeVariables() {
        init_alchemy_export_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_alchemy_export_file();
    }
}

/**
 * Total time: 1458 ms synthetic ~%Inference answers in Alchemy format~%Created
 * on ~A~%"); $str3$Generated_from_KB__A_running_on_C =
 * makeString("Generated from KB ~A running on CycL version ~A~%");
 * $str4$Query_sentence___S__Mt___S_______ = makeString("Query sentence: ~S~%Mt:
 * ~S~% ~%Couldn't export the sentence ~S:~%~A~%
 */
