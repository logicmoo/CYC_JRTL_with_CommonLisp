/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.assertions_high.assertion_mentions_term;
import static com.cyc.cycjava.cycl.assertions_high.assertion_mt;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg;
import static com.cyc.cycjava.cycl.assertions_high.gaf_assertionP;
import static com.cyc.cycjava.cycl.assertions_high.gaf_predicate;
import static com.cyc.cycjava.cycl.assertions_high.valid_assertion;
import static com.cyc.cycjava.cycl.control_vars.$mapping_answer$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_any_answerP$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_assertion_selection_fn$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_equality_test$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_finished_fn$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_gather_arg$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_gather_key$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_gather_key_args$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_target$;
import static com.cyc.cycjava.cycl.el_utilities.gafP;
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
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.final_index_leaves;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.simple_indexed_term_p;
import static com.cyc.cycjava.cycl.list_utilities.fast_delete_duplicates;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.mapping_finished;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KB-MAPPING
 * source file: /cyc/top/cycl/kb-mapping.lisp
 * created:     2019/07/03 17:37:24
 */
public final class kb_mapping extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new kb_mapping();

 public static final String myName = "com.cyc.cycjava.cycl.kb_mapping";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $mapping_function$ = makeSymbol("*MAPPING-FUNCTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $mapping_truth$ = makeSymbol("*MAPPING-TRUTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $mapping_direction$ = makeSymbol("*MAPPING-DIRECTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $map_term_selective_test$ = makeSymbol("*MAP-TERM-SELECTIVE-TEST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $map_term_selective_action$ = makeSymbol("*MAP-TERM-SELECTIVE-ACTION*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("SUBINDEX"), makeSymbol("PRED-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym1$PRED = makeUninternedSymbol("PRED");

    private static final SubLSymbol DO_INTERMEDIATE_INDEX = makeSymbol("DO-INTERMEDIATE-INDEX");

    static private final SubLSymbol $sym4$RELEVANT_PRED_ = makeSymbol("RELEVANT-PRED?");

    static private final SubLList $list5 = list(list(makeSymbol("SUBINDEX"), makeSymbol("MT-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym6$MT = makeUninternedSymbol("MT");

    static private final SubLSymbol $sym7$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");

    static private final SubLList $list8 = list(list(makeSymbol("SUBINDEX"), makeSymbol("DIRECTION-INDEX"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym9$CANDIDATE_DIRECTION = makeUninternedSymbol("CANDIDATE-DIRECTION");

    static private final SubLList $list12 = list(list(makeSymbol("ASS"), makeSymbol("FINAL-INDEX"), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_FINAL_INDEX = makeSymbol("DO-FINAL-INDEX");

    static private final SubLSymbol $sym14$ASSERTION_MATCHES_TRUTH_ = makeSymbol("ASSERTION-MATCHES-TRUTH?");

    private static final SubLSymbol MAP_TERM = makeSymbol("MAP-TERM");

    static private final SubLList $list22 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"));

    static private final SubLString $str23$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion indexed from TERM.");

    static private final SubLList $list24 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")));

    static private final SubLList $list25 = list(makeSymbol("NULL"));

    private static final SubLSymbol MAP_TERM_SELECTIVE_INTERNAL = makeSymbol("MAP-TERM-SELECTIVE-INTERNAL");

    private static final SubLSymbol MAP_TERM_SELECTIVE = makeSymbol("MAP-TERM-SELECTIVE");

    static private final SubLList $list28 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("TEST"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"));

    static private final SubLString $str29$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.\n  If TRUTH is nil, all assertions are mapped.");

    static private final SubLList $list30 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("TEST"), makeSymbol("FUNCTION-SPEC-P")));

    private static final SubLSymbol MAP_TERM_GAFS = makeSymbol("MAP-TERM-GAFS");

    static private final SubLList $list32 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"));

    static private final SubLString $str33$Apply_FUNCTION_to_every_gaf_index = makeString("Apply FUNCTION to every gaf indexed from TERM.\n   If TRUTH is nil, all assertions are mapped.");

    static private final SubLString $$$mapping_broad_mt_index = makeString("mapping broad mt index");

    private static final SubLSymbol MAP_MT_CONTENTS = makeSymbol("MAP-MT-CONTENTS");

    static private final SubLList $list38 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"), makeSymbol("GAFS-ONLY"));

    static private final SubLString $str39$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion with TRUTH in MT TERM.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");

    private static final SubLSymbol MAP_MT_INDEX = makeSymbol("MAP-MT-INDEX");

    static private final SubLList $list41 = list(makeSymbol("FUNCTION"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"), makeSymbol("GAFS-ONLY"));

    static private final SubLString $str42$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion with TRUTH at mt index MT.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");

    private static final SubLSymbol MAP_HLMT_CONTENTS = makeSymbol("MAP-HLMT-CONTENTS");

    private static final SubLSymbol MAP_HLMT_INDEX = makeSymbol("MAP-HLMT-INDEX");

    private static final SubLSymbol MAP_OTHER_INDEX = makeSymbol("MAP-OTHER-INDEX");

    private static final SubLString $str46$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion with TRUTH at other index TERM.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");

    private static final SubLSymbol GATHER_INDEX = makeSymbol("GATHER-INDEX");

    static private final SubLList $list48 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("REMOVE-DUPLICATES?"));

    static private final SubLString $str49$Return_a_list_of_all_mt_relevant_ = makeString("Return a list of all mt-relevant assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.");

    static private final SubLList $list50 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));

    private static final SubLString $str51$So_don_t_ = makeString("So don't!");

    private static final SubLString $str52$Can_t_gather_unknown_auxiliary_in = makeString("Can't gather unknown auxiliary index ~s~%");



    private static final SubLSymbol GATHER_INDEX_IN_ANY_MT = makeSymbol("GATHER-INDEX-IN-ANY-MT");

    private static final SubLString $str56$Return_a_list_of_all_assertions_i = makeString("Return a list of all assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.");

    private static final SubLSymbol GATHER_GAF_ARG_INDEX = makeSymbol("GATHER-GAF-ARG-INDEX");

    static private final SubLList $list59 = list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("&OPTIONAL"), makeSymbol("PRED"), makeSymbol("MT"), list(makeSymbol("TRUTH"), $TRUE));

    private static final SubLString $str60$Return_a_list_of_all_gaf_assertio = makeString("Return a list of all gaf assertions such that:\na) TERM is its ARGNUMth argument\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if PRED is non-nil, then PRED must be its predicate\nd) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil).");

    static private final SubLList $list61 = list(list(makeSymbol("ARGNUM"), makeSymbol("POSITIVE-INTEGER-P")));

    private static final SubLSymbol GATHER_GAF_ARG_INDEX_WITH_PREDICATE = makeSymbol("GATHER-GAF-ARG-INDEX-WITH-PREDICATE");

    static private final SubLList $list63 = list(makeSymbol("GATHER-GAF-ARG-INDEX"));

    private static final SubLSymbol GATHER_NART_ARG_INDEX = makeSymbol("GATHER-NART-ARG-INDEX");

    private static final SubLList $list65 = list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("&OPTIONAL"), makeSymbol("FUNC"));

    private static final SubLString $str66$Return_a_list_of_all___termOfUnit = makeString("Return a list of all #$termOfUnit assertions with a naut arg2 such that:\na) TERM is its ARGNUMth argument\nb) if FUNC is non-nil, then FUNC must be its functor");

    private static final SubLSymbol GATHER_PREDICATE_EXTENT_INDEX = makeSymbol("GATHER-PREDICATE-EXTENT-INDEX");

    private static final SubLList $list68 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("TRUTH"), $TRUE));

    private static final SubLString $str69$Return_a_list_of_all_gaf_assertio = makeString("Return a list of all gaf assertions such that:\na) PRED is its predicate\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if MT is non-nil, then MT must be its microtheory.");

    private static final SubLSymbol GATHER_FUNCTION_EXTENT_INDEX = makeSymbol("GATHER-FUNCTION-EXTENT-INDEX");

    private static final SubLList $list71 = list(makeSymbol("FUNC"));

    private static final SubLString $str72$Return_a_list_of_all___termOfUnit = makeString("Return a list of all #$termOfUnit assertions such that:\nFUNC is the functor of the naut arg2.");

    private static final SubLSymbol GATHER_PREDICATE_RULE_INDEX = makeSymbol("GATHER-PREDICATE-RULE-INDEX");

    static private final SubLList $list74 = list(makeSymbol("PRED"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));

    private static final SubLString $str75$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    static private final SubLList $list76 = list(list(makeSymbol("SENSE"), makeSymbol("SENSE-P")));

    private static final SubLSymbol GATHER_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol("GATHER-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");

    private static final SubLList $list78 = list(makeSymbol("PRED"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"));

    private static final SubLString $str79$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    private static final SubLSymbol GATHER_ISA_RULE_INDEX = makeSymbol("GATHER-ISA-RULE-INDEX");

    private static final SubLList $list81 = list(makeSymbol("COLLECTION"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));

    static private final SubLString $str82$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    private static final SubLSymbol GATHER_QUOTED_ISA_RULE_INDEX = makeSymbol("GATHER-QUOTED-ISA-RULE-INDEX");

    static private final SubLString $str84$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    private static final SubLSymbol GATHER_GENLS_RULE_INDEX = makeSymbol("GATHER-GENLS-RULE-INDEX");

    private static final SubLString $str86$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    private static final SubLSymbol GATHER_GENL_MT_RULE_INDEX = makeSymbol("GATHER-GENL-MT-RULE-INDEX");

    private static final SubLList $list88 = list(makeSymbol("GENL-MT"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("RULE-MT"), makeSymbol("DIRECTION"));

    private static final SubLString $str89$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)\nb) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)\nc) if RULE-MT is non-nil, then RULE-MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    private static final SubLSymbol GATHER_FUNCTION_RULE_INDEX = makeSymbol("GATHER-FUNCTION-RULE-INDEX");

    private static final SubLList $list91 = list(makeSymbol("FUNC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));

    private static final SubLString $str92$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    private static final SubLSymbol GATHER_EXCEPTION_RULE_INDEX = makeSymbol("GATHER-EXCEPTION-RULE-INDEX");

    private static final SubLList $list94 = list(makeSymbol("RULE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));

    static private final SubLString $str95$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (abnormal <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    private static final SubLSymbol GATHER_PRAGMA_RULE_INDEX = makeSymbol("GATHER-PRAGMA-RULE-INDEX");

    private static final SubLString $str97$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    private static final SubLSymbol GATHER_ASSERTIONS = makeSymbol("GATHER-ASSERTIONS");

    private static final SubLSymbol GATHER_MT_INDEX = makeSymbol("GATHER-MT-INDEX");

    private static final SubLList $list101 = list(makeSymbol("TERM"));

    private static final SubLString $str102$Return_a_list_of_all_assertions_s = makeString("Return a list of all assertions such that TERM is its microtheory.");

    private static final SubLSymbol GATHER_OTHER_INDEX = makeSymbol("GATHER-OTHER-INDEX");

    private static final SubLString $str104$Return_a_list_of_other_assertions = makeString("Return a list of other assertions mentioning TERM but not indexed in any other more useful manner.");

    private static final SubLSymbol GATHER_TERM_ASSERTIONS = makeSymbol("GATHER-TERM-ASSERTIONS");

    private static final SubLList $list106 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str107$Return_a_list_of_all_mt_relevant_ = makeString("Return a list of all mt-relevant assertions of TERM.");

    private static final SubLSymbol GATHER_META_ASSERTIONS = makeSymbol("GATHER-META-ASSERTIONS");

    public static final SubLObject do_intermediate_index_relevant_preds_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject subindex = NIL;
                    SubLObject pred_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    subindex = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    pred_index = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject pred = $sym1$PRED;
                            return list(DO_INTERMEDIATE_INDEX, list(pred, subindex, pred_index), listS(PWHEN, list($sym4$RELEVANT_PRED_, pred), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_intermediate_index_relevant_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subindex = NIL;
        SubLObject pred_index = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        pred_index = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject pred = $sym1$PRED;
            return list(DO_INTERMEDIATE_INDEX, list(pred, subindex, pred_index), listS(PWHEN, list($sym4$RELEVANT_PRED_, pred), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static final SubLObject do_intermediate_index_relevant_mts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject subindex = NIL;
                    SubLObject mt_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    subindex = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    mt_index = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject mt = $sym6$MT;
                            return list(DO_INTERMEDIATE_INDEX, list(mt, subindex, mt_index), listS(PWHEN, list($sym7$RELEVANT_MT_, mt), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt5);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_intermediate_index_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subindex = NIL;
        SubLObject mt_index = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        mt_index = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject mt = $sym6$MT;
            return list(DO_INTERMEDIATE_INDEX, list(mt, subindex, mt_index), listS(PWHEN, list($sym7$RELEVANT_MT_, mt), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject do_intermediate_index_with_direction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject subindex = NIL;
                    SubLObject direction_index = NIL;
                    SubLObject direction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    subindex = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    direction_index = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    direction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject candidate_direction = $sym9$CANDIDATE_DIRECTION;
                            return list(DO_INTERMEDIATE_INDEX, list(candidate_direction, subindex, direction_index), listS(PWHEN, list(COR, list(NULL, direction), list(EQ, candidate_direction, direction)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt8);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_intermediate_index_with_direction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subindex = NIL;
        SubLObject direction_index = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        direction_index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject candidate_direction = $sym9$CANDIDATE_DIRECTION;
            return list(DO_INTERMEDIATE_INDEX, list(candidate_direction, subindex, direction_index), listS(PWHEN, list(COR, list(NULL, direction), list(EQ, candidate_direction, direction)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list8);
        return NIL;
    }

    public static final SubLObject do_final_index_assertions_with_truth_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject ass = NIL;
                    SubLObject final_index = NIL;
                    SubLObject truth = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    ass = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    final_index = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    truth = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(DO_FINAL_INDEX, list(ass, final_index), listS(PWHEN, list($sym14$ASSERTION_MATCHES_TRUTH_, ass, truth), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt12);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_final_index_assertions_with_truth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ass = NIL;
        SubLObject final_index = NIL;
        SubLObject truth = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        ass = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final_index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        truth = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_FINAL_INDEX, list(ass, final_index), listS(PWHEN, list($sym14$ASSERTION_MATCHES_TRUTH_, ass, truth), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list12);
        return NIL;
    }

    /**
     * Apply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM
     * with predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are
     * not filtered based on truth.  If PRED is NIL, predicate relevance is
     * established from outside (default is all predicates are relevant).
     */
    @LispMethod(comment = "Apply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM\r\nwith predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are\r\nnot filtered based on truth.  If PRED is NIL, predicate relevance is\r\nestablished from outside (default is all predicates are relevant).\nApply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM\nwith predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are\nnot filtered based on truth.  If PRED is NIL, predicate relevance is\nestablished from outside (default is all predicates are relevant).")
    public static final SubLObject map_gaf_arg_index_alt(SubLObject function, SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject truth, SubLObject mt) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(argnum, POSITIVE_INTEGER_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if ((NIL != pred) && (NIL != truth)) {
                                    {
                                        SubLObject pred_var = pred;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                                    {
                                                                        SubLObject done_var_1 = NIL;
                                                                        SubLObject token_var_2 = NIL;
                                                                        while (NIL == done_var_1) {
                                                                            {
                                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                                SubLObject valid_3 = makeBoolean(token_var_2 != ass);
                                                                                if (NIL != valid_3) {
                                                                                    funcall(function, ass);
                                                                                }
                                                                                done_var_1 = makeBoolean(NIL == valid_3);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
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
                                } else {
                                    if ((NIL != pred) && (NIL == truth)) {
                                        {
                                            SubLObject pred_var = pred;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                            SubLObject done_var_5 = NIL;
                                                                            SubLObject token_var_6 = NIL;
                                                                            while (NIL == done_var_5) {
                                                                                {
                                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                                    SubLObject valid_7 = makeBoolean(token_var_6 != ass);
                                                                                    if (NIL != valid_7) {
                                                                                        funcall(function, ass);
                                                                                    }
                                                                                    done_var_5 = makeBoolean(NIL == valid_7);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
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
                                    } else {
                                        if ((NIL == pred) && (NIL != truth)) {
                                            {
                                                SubLObject pred_var = NIL;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                                            {
                                                                                SubLObject done_var_9 = NIL;
                                                                                SubLObject token_var_10 = NIL;
                                                                                while (NIL == done_var_9) {
                                                                                    {
                                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                                                        SubLObject valid_11 = makeBoolean(token_var_10 != ass);
                                                                                        if (NIL != valid_11) {
                                                                                            funcall(function, ass);
                                                                                        }
                                                                                        done_var_9 = makeBoolean(NIL == valid_11);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
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
                                        } else {
                                            if ((NIL == pred) && (NIL == truth)) {
                                                {
                                                    SubLObject pred_var = NIL;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                        {
                                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                                    SubLObject done_var_13 = NIL;
                                                                                    SubLObject token_var_14 = NIL;
                                                                                    while (NIL == done_var_13) {
                                                                                        {
                                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                                                                            SubLObject valid_15 = makeBoolean(token_var_14 != ass);
                                                                                            if (NIL != valid_15) {
                                                                                                funcall(function, ass);
                                                                                            }
                                                                                            done_var_13 = makeBoolean(NIL == valid_15);
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if (NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
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
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    /**
     * Apply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM
     * with predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are
     * not filtered based on truth.  If PRED is NIL, predicate relevance is
     * established from outside (default is all predicates are relevant).
     */
    @LispMethod(comment = "Apply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM\r\nwith predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are\r\nnot filtered based on truth.  If PRED is NIL, predicate relevance is\r\nestablished from outside (default is all predicates are relevant).\nApply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM\nwith predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are\nnot filtered based on truth.  If PRED is NIL, predicate relevance is\nestablished from outside (default is all predicates are relevant).")
    public static SubLObject map_gaf_arg_index(final SubLObject function, final SubLObject v_term, final SubLObject argnum, SubLObject pred, SubLObject truth, SubLObject mt) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != subl_promotions.positive_integer_p(argnum) : "! subl_promotions.positive_integer_p(argnum) " + ("subl_promotions.positive_integer_p(argnum) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(argnum) ") + argnum;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if ((NIL != pred) && (NIL != truth)) {
                    final SubLObject pred_var = pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                    SubLObject done_var_$1 = NIL;
                                    final SubLObject token_var_$2 = NIL;
                                    while (NIL == done_var_$1) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(ass));
                                        if (NIL != valid_$3) {
                                            funcall(function, ass);
                                        }
                                        done_var_$1 = makeBoolean(NIL == valid_$3);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if ((NIL != pred) && (NIL == truth)) {
                        final SubLObject pred_var = pred;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$2 = NIL;
                                        final SubLObject token_var_$3 = NIL;
                                        while (NIL == done_var_$2) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                            final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(ass));
                                            if (NIL != valid_$4) {
                                                funcall(function, ass);
                                            }
                                            done_var_$2 = makeBoolean(NIL == valid_$4);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else
                        if ((NIL == pred) && (NIL != truth)) {
                            final SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                            SubLObject done_var_$3 = NIL;
                                            final SubLObject token_var_$4 = NIL;
                                            while (NIL == done_var_$3) {
                                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                                final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(ass));
                                                if (NIL != valid_$5) {
                                                    funcall(function, ass);
                                                }
                                                done_var_$3 = makeBoolean(NIL == valid_$5);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                            }
                        } else
                            if ((NIL == pred) && (NIL == truth)) {
                                final SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                SubLObject done_var_$4 = NIL;
                                                final SubLObject token_var_$5 = NIL;
                                                while (NIL == done_var_$4) {
                                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                    final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(ass));
                                                    if (NIL != valid_$6) {
                                                        funcall(function, ass);
                                                    }
                                                    done_var_$4 = makeBoolean(NIL == valid_$6);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values4 = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values4);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                            }



            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each gaf assertion with predicate PRED and truth TRUTH.
     * If TRUTH is NIL, assertions are not filtered based on truth.
     */
    @LispMethod(comment = "Apply FUNCTION to each gaf assertion with predicate PRED and truth TRUTH.\r\nIf TRUTH is NIL, assertions are not filtered based on truth.\nApply FUNCTION to each gaf assertion with predicate PRED and truth TRUTH.\nIf TRUTH is NIL, assertions are not filtered based on truth.")
    public static final SubLObject map_predicate_extent_index_alt(SubLObject function, SubLObject pred, SubLObject truth, SubLObject mt) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if (NIL != truth) {
                                    {
                                        SubLObject pred_var = pred;
                                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                                    {
                                                                        SubLObject done_var_17 = NIL;
                                                                        SubLObject token_var_18 = NIL;
                                                                        while (NIL == done_var_17) {
                                                                            {
                                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_18);
                                                                                SubLObject valid_19 = makeBoolean(token_var_18 != ass);
                                                                                if (NIL != valid_19) {
                                                                                    funcall(function, ass);
                                                                                }
                                                                                done_var_17 = makeBoolean(NIL == valid_19);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
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
                                } else {
                                    {
                                        SubLObject pred_var = pred;
                                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                                        SubLObject done_var_21 = NIL;
                                                                        SubLObject token_var_22 = NIL;
                                                                        while (NIL == done_var_21) {
                                                                            {
                                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_22);
                                                                                SubLObject valid_23 = makeBoolean(token_var_22 != ass);
                                                                                if (NIL != valid_23) {
                                                                                    funcall(function, ass);
                                                                                }
                                                                                done_var_21 = makeBoolean(NIL == valid_23);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
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
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    /**
     * Apply FUNCTION to each gaf assertion with predicate PRED and truth TRUTH.
     * If TRUTH is NIL, assertions are not filtered based on truth.
     */
    @LispMethod(comment = "Apply FUNCTION to each gaf assertion with predicate PRED and truth TRUTH.\r\nIf TRUTH is NIL, assertions are not filtered based on truth.\nApply FUNCTION to each gaf assertion with predicate PRED and truth TRUTH.\nIf TRUTH is NIL, assertions are not filtered based on truth.")
    public static SubLObject map_predicate_extent_index(final SubLObject function, final SubLObject pred, SubLObject truth, SubLObject mt) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if (NIL != truth) {
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$17 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$18 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                        SubLObject done_var_$19 = NIL;
                                        final SubLObject token_var_$20 = NIL;
                                        while (NIL == done_var_$19) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                            final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(ass));
                                            if (NIL != valid_$21) {
                                                funcall(function, ass);
                                            }
                                            done_var_$19 = makeBoolean(NIL == valid_$21);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$18, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                } else
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$19 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$19 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$20 = NIL;
                                        final SubLObject token_var_$21 = NIL;
                                        while (NIL == done_var_$20) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$21);
                                            final SubLObject valid_$22 = makeBoolean(!token_var_$21.eql(ass));
                                            if (NIL != valid_$22) {
                                                funcall(function, ass);
                                            }
                                            done_var_$20 = makeBoolean(NIL == valid_$22);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$19, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$19, thread);
                        }
                    }

            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each #$termOfUnit assertion whose arg2 is a naut
     * which mentions TERM in position ARGNUM.
     */
    @LispMethod(comment = "Apply FUNCTION to each #$termOfUnit assertion whose arg2 is a naut\r\nwhich mentions TERM in position ARGNUM.\nApply FUNCTION to each #$termOfUnit assertion whose arg2 is a naut\nwhich mentions TERM in position ARGNUM.")
    public static final SubLObject map_nart_arg_index_alt(SubLObject subl_function, SubLObject v_term, SubLObject argnum, SubLObject cycl_function) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (cycl_function == UNPROVIDED) {
            cycl_function = NIL;
        }
        SubLTrampolineFile.checkType(subl_function, FUNCTION_SPEC_P);
        {
            SubLObject catch_var = NIL;
            try {
                if ((NIL != argnum) && (NIL != cycl_function)) {
                    if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, cycl_function)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, cycl_function);
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
                                                    SubLObject done_var_25 = NIL;
                                                    SubLObject token_var_26 = NIL;
                                                    while (NIL == done_var_25) {
                                                        {
                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_26);
                                                            SubLObject valid_27 = makeBoolean(token_var_26 != ass);
                                                            if (NIL != valid_27) {
                                                                funcall(subl_function, ass);
                                                            }
                                                            done_var_25 = makeBoolean(NIL == valid_27);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
                } else {
                    if ((NIL != argnum) && (NIL == cycl_function)) {
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, NIL)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, NIL);
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
                                                        SubLObject done_var_28 = NIL;
                                                        SubLObject token_var_29 = NIL;
                                                        while (NIL == done_var_28) {
                                                            {
                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_29);
                                                                SubLObject valid_30 = makeBoolean(token_var_29 != ass);
                                                                if (NIL != valid_30) {
                                                                    funcall(subl_function, ass);
                                                                }
                                                                done_var_28 = makeBoolean(NIL == valid_30);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                        try {
                                                            bind($is_thread_performing_cleanupP$, T);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
                    } else {
                        if ((NIL == argnum) && (NIL != cycl_function)) {
                            if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, cycl_function)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, cycl_function);
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
                                                            SubLObject done_var_31 = NIL;
                                                            SubLObject token_var_32 = NIL;
                                                            while (NIL == done_var_31) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_32);
                                                                    SubLObject valid_33 = makeBoolean(token_var_32 != ass);
                                                                    if (NIL != valid_33) {
                                                                        funcall(subl_function, ass);
                                                                    }
                                                                    done_var_31 = makeBoolean(NIL == valid_33);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                            try {
                                                                bind($is_thread_performing_cleanupP$, T);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
                        } else {
                            if ((NIL == argnum) && (NIL == cycl_function)) {
                                if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, NIL)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, NIL);
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
                                                                SubLObject done_var_34 = NIL;
                                                                SubLObject token_var_35 = NIL;
                                                                while (NIL == done_var_34) {
                                                                    {
                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_35);
                                                                        SubLObject valid_36 = makeBoolean(token_var_35 != ass);
                                                                        if (NIL != valid_36) {
                                                                            funcall(subl_function, ass);
                                                                        }
                                                                        done_var_34 = makeBoolean(NIL == valid_36);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                                try {
                                                                    bind($is_thread_performing_cleanupP$, T);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each #$termOfUnit assertion whose arg2 is a naut
     * which mentions TERM in position ARGNUM.
     */
    @LispMethod(comment = "Apply FUNCTION to each #$termOfUnit assertion whose arg2 is a naut\r\nwhich mentions TERM in position ARGNUM.\nApply FUNCTION to each #$termOfUnit assertion whose arg2 is a naut\nwhich mentions TERM in position ARGNUM.")
    public static SubLObject map_nart_arg_index(final SubLObject subl_function, final SubLObject v_term, SubLObject argnum, SubLObject cycl_function) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (cycl_function == UNPROVIDED) {
            cycl_function = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(subl_function) : "! function_spec_p(subl_function) " + ("Types.function_spec_p(subl_function) " + "CommonSymbols.NIL != Types.function_spec_p(subl_function) ") + subl_function;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            if ((NIL != argnum) && (NIL != cycl_function)) {
                if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, cycl_function)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, cycl_function);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$29 = NIL;
                                final SubLObject token_var_$30 = NIL;
                                while (NIL == done_var_$29) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$30);
                                    final SubLObject valid_$31 = makeBoolean(!token_var_$30.eql(ass));
                                    if (NIL != valid_$31) {
                                        funcall(subl_function, ass);
                                    }
                                    done_var_$29 = makeBoolean(NIL == valid_$31);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if ((NIL != argnum) && (NIL == cycl_function)) {
                    if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$30 = NIL;
                                    final SubLObject token_var_$31 = NIL;
                                    while (NIL == done_var_$30) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                                        final SubLObject valid_$32 = makeBoolean(!token_var_$31.eql(ass));
                                        if (NIL != valid_$32) {
                                            funcall(subl_function, ass);
                                        }
                                        done_var_$30 = makeBoolean(NIL == valid_$32);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if ((NIL == argnum) && (NIL != cycl_function)) {
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, cycl_function)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, cycl_function);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$31 = NIL;
                                        final SubLObject token_var_$32 = NIL;
                                        while (NIL == done_var_$31) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                                            final SubLObject valid_$33 = makeBoolean(!token_var_$32.eql(ass));
                                            if (NIL != valid_$33) {
                                                funcall(subl_function, ass);
                                            }
                                            done_var_$31 = makeBoolean(NIL == valid_$33);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else
                        if (((NIL == argnum) && (NIL == cycl_function)) && (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, NIL))) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, NIL);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$32 = NIL;
                                        final SubLObject token_var_$33 = NIL;
                                        while (NIL == done_var_$32) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$33);
                                            final SubLObject valid_$34 = makeBoolean(!token_var_$33.eql(ass));
                                            if (NIL != valid_$34) {
                                                funcall(subl_function, ass);
                                            }
                                            done_var_$32 = makeBoolean(NIL == valid_$34);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }



        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Apply SUBL-FUNCTION to each #$termOfUnit assertion whose arg2 is a naut
     * whose functor is CYCL-FUNCTION.
     */
    @LispMethod(comment = "Apply SUBL-FUNCTION to each #$termOfUnit assertion whose arg2 is a naut\r\nwhose functor is CYCL-FUNCTION.\nApply SUBL-FUNCTION to each #$termOfUnit assertion whose arg2 is a naut\nwhose functor is CYCL-FUNCTION.")
    public static final SubLObject map_function_extent_index_alt(SubLObject subl_function, SubLObject cycl_function) {
        SubLTrampolineFile.checkType(subl_function, FUNCTION_SPEC_P);
        {
            SubLObject catch_var = NIL;
            try {
                if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(cycl_function)) {
                    {
                        SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(cycl_function);
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            {
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                        SubLObject valid = makeBoolean(token_var != ass);
                                        if (NIL != valid) {
                                            funcall(subl_function, ass);
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
        }
        return NIL;
    }

    /**
     * Apply SUBL-FUNCTION to each #$termOfUnit assertion whose arg2 is a naut
     * whose functor is CYCL-FUNCTION.
     */
    @LispMethod(comment = "Apply SUBL-FUNCTION to each #$termOfUnit assertion whose arg2 is a naut\r\nwhose functor is CYCL-FUNCTION.\nApply SUBL-FUNCTION to each #$termOfUnit assertion whose arg2 is a naut\nwhose functor is CYCL-FUNCTION.")
    public static SubLObject map_function_extent_index(final SubLObject subl_function, final SubLObject cycl_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(subl_function) : "! function_spec_p(subl_function) " + ("Types.function_spec_p(subl_function) " + "CommonSymbols.NIL != Types.function_spec_p(subl_function) ") + subl_function;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(cycl_function)) {
                final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(cycl_function);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(ass));
                        if (NIL != valid) {
                            funcall(subl_function, ass);
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit with
     * predicate PRED and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit with\r\npredicate PRED and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit with\npredicate PRED and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static final SubLObject map_predicate_rule_index_alt(SubLObject function, SubLObject pred, SubLObject sense, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if (NIL != direction) {
                                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, direction)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, direction);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                                {
                                                                    SubLObject done_var_37 = NIL;
                                                                    SubLObject token_var_38 = NIL;
                                                                    while (NIL == done_var_37) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_38);
                                                                            SubLObject valid_39 = makeBoolean(token_var_38 != ass);
                                                                            if (NIL != valid_39) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_37 = makeBoolean(NIL == valid_39);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
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
                                } else {
                                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_41 = NIL;
                                                                    SubLObject token_var_42 = NIL;
                                                                    while (NIL == done_var_41) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_42);
                                                                            SubLObject valid_43 = makeBoolean(token_var_42 != ass);
                                                                            if (NIL != valid_43) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_41 = makeBoolean(NIL == valid_43);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_44, thread);
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
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    /**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit with
     * predicate PRED and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit with\r\npredicate PRED and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit with\npredicate PRED and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static SubLObject map_predicate_rule_index(final SubLObject function, final SubLObject pred, final SubLObject sense, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != enumeration_types.sense_p(sense) : "! enumeration_types.sense_p(sense) " + ("enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) ") + sense;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if (NIL != direction) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$41 = NIL;
                                    final SubLObject token_var_$42 = NIL;
                                    while (NIL == done_var_$41) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                                        final SubLObject valid_$43 = makeBoolean(!token_var_$42.eql(ass));
                                        if (NIL != valid_$43) {
                                            funcall(function, ass);
                                        }
                                        done_var_$41 = makeBoolean(NIL == valid_$43);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                    SubLObject done_var_$42 = NIL;
                                    final SubLObject token_var_$43 = NIL;
                                    while (NIL == done_var_$42) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                        final SubLObject valid_$44 = makeBoolean(!token_var_$43.eql(ass));
                                        if (NIL != valid_$44) {
                                            funcall(function, ass);
                                        }
                                        done_var_$42 = makeBoolean(NIL == valid_$44);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
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
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit wrapped
     * in an #$ist with predicate PRED and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit wrapped\r\nin an #$ist with predicate PRED and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit wrapped\nin an #$ist with predicate PRED and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static final SubLObject map_decontextualized_ist_predicate_rule_index_alt(SubLObject function, SubLObject pred, SubLObject sense, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(sense, SENSE_P);
        {
            SubLObject catch_var = NIL;
            try {
                if (NIL != direction) {
                    if (NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, sense, direction)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, sense, direction);
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
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                {
                                                    SubLObject done_var_45 = NIL;
                                                    SubLObject token_var_46 = NIL;
                                                    while (NIL == done_var_45) {
                                                        {
                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_46);
                                                            SubLObject valid_47 = makeBoolean(token_var_46 != ass);
                                                            if (NIL != valid_47) {
                                                                funcall(function, ass);
                                                            }
                                                            done_var_45 = makeBoolean(NIL == valid_47);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
                } else {
                    if (NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, sense, NIL)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
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
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                {
                                                    SubLObject done_var_48 = NIL;
                                                    SubLObject token_var_49 = NIL;
                                                    while (NIL == done_var_48) {
                                                        {
                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_49);
                                                            SubLObject valid_50 = makeBoolean(token_var_49 != ass);
                                                            if (NIL != valid_50) {
                                                                funcall(function, ass);
                                                            }
                                                            done_var_48 = makeBoolean(NIL == valid_50);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit wrapped
     * in an #$ist with predicate PRED and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit wrapped\r\nin an #$ist with predicate PRED and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit wrapped\nin an #$ist with predicate PRED and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static SubLObject map_decontextualized_ist_predicate_rule_index(final SubLObject function, final SubLObject pred, final SubLObject sense, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != enumeration_types.sense_p(sense) : "! enumeration_types.sense_p(sense) " + ("enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) ") + sense;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, sense, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, sense, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$49 = NIL;
                                final SubLObject token_var_$50 = NIL;
                                while (NIL == done_var_$49) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$50);
                                    final SubLObject valid_$51 = makeBoolean(!token_var_$50.eql(ass));
                                    if ((NIL != valid_$51) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                                        funcall(function, ass);
                                    }
                                    done_var_$49 = makeBoolean(NIL == valid_$51);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, sense, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$50 = NIL;
                                final SubLObject token_var_$51 = NIL;
                                while (NIL == done_var_$50) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$51);
                                    final SubLObject valid_$52 = makeBoolean(!token_var_$51.eql(ass));
                                    if ((NIL != valid_$52) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                                        funcall(function, ass);
                                    }
                                    done_var_$50 = makeBoolean(NIL == valid_$52);
                                } 
                            } finally {
                                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }

        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit with
     * predicate #$isa and arg2 COLLECTION, and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit with\r\npredicate #$isa and arg2 COLLECTION, and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit with\npredicate #$isa and arg2 COLLECTION, and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static final SubLObject map_isa_rule_index_alt(SubLObject function, SubLObject collection, SubLObject sense, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if (NIL != direction) {
                                    if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(collection, sense, direction)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(collection, sense, direction);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                                {
                                                                    SubLObject done_var_51 = NIL;
                                                                    SubLObject token_var_52 = NIL;
                                                                    while (NIL == done_var_51) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_52);
                                                                            SubLObject valid_53 = makeBoolean(token_var_52 != ass);
                                                                            if (NIL != valid_53) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_51 = makeBoolean(NIL == valid_53);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_54, thread);
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
                                } else {
                                    if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(collection, sense, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(collection, sense, NIL);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_55 = NIL;
                                                                    SubLObject token_var_56 = NIL;
                                                                    while (NIL == done_var_55) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_56);
                                                                            SubLObject valid_57 = makeBoolean(token_var_56 != ass);
                                                                            if (NIL != valid_57) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_55 = makeBoolean(NIL == valid_57);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_58, thread);
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
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    /**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit with
     * predicate #$isa and arg2 COLLECTION, and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit with\r\npredicate #$isa and arg2 COLLECTION, and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit with\npredicate #$isa and arg2 COLLECTION, and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static SubLObject map_isa_rule_index(final SubLObject function, final SubLObject collection, final SubLObject sense, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != enumeration_types.sense_p(sense) : "! enumeration_types.sense_p(sense) " + ("enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) ") + sense;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if (NIL != direction) {
                    if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(collection, sense, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(collection, sense, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$55 = NIL;
                                    final SubLObject token_var_$56 = NIL;
                                    while (NIL == done_var_$55) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$56);
                                        final SubLObject valid_$57 = makeBoolean(!token_var_$56.eql(ass));
                                        if (NIL != valid_$57) {
                                            funcall(function, ass);
                                        }
                                        done_var_$55 = makeBoolean(NIL == valid_$57);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(collection, sense, NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(collection, sense, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                    SubLObject done_var_$56 = NIL;
                                    final SubLObject token_var_$57 = NIL;
                                    while (NIL == done_var_$56) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$57);
                                        final SubLObject valid_$58 = makeBoolean(!token_var_$57.eql(ass));
                                        if (NIL != valid_$58) {
                                            funcall(function, ass);
                                        }
                                        done_var_$56 = makeBoolean(NIL == valid_$58);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
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
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit with
     * predicate #$quotedIsa and arg2 COLLECTION, and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit with\r\npredicate #$quotedIsa and arg2 COLLECTION, and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit with\npredicate #$quotedIsa and arg2 COLLECTION, and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static final SubLObject map_quoted_isa_rule_index_alt(SubLObject function, SubLObject collection, SubLObject sense, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if (NIL != direction) {
                                    if (NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(collection, sense, direction)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(collection, sense, direction);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                                {
                                                                    SubLObject done_var_59 = NIL;
                                                                    SubLObject token_var_60 = NIL;
                                                                    while (NIL == done_var_59) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_60);
                                                                            SubLObject valid_61 = makeBoolean(token_var_60 != ass);
                                                                            if (NIL != valid_61) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_59 = makeBoolean(NIL == valid_61);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_62, thread);
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
                                } else {
                                    if (NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(collection, sense, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(collection, sense, NIL);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_63 = NIL;
                                                                    SubLObject token_var_64 = NIL;
                                                                    while (NIL == done_var_63) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_64);
                                                                            SubLObject valid_65 = makeBoolean(token_var_64 != ass);
                                                                            if (NIL != valid_65) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_63 = makeBoolean(NIL == valid_65);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_66, thread);
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
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    /**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit with
     * predicate #$quotedIsa and arg2 COLLECTION, and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit with\r\npredicate #$quotedIsa and arg2 COLLECTION, and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit with\npredicate #$quotedIsa and arg2 COLLECTION, and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static SubLObject map_quoted_isa_rule_index(final SubLObject function, final SubLObject collection, final SubLObject sense, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != enumeration_types.sense_p(sense) : "! enumeration_types.sense_p(sense) " + ("enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) ") + sense;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if (NIL != direction) {
                    if (NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(collection, sense, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(collection, sense, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$63 = NIL;
                                    final SubLObject token_var_$64 = NIL;
                                    while (NIL == done_var_$63) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$64);
                                        final SubLObject valid_$65 = makeBoolean(!token_var_$64.eql(ass));
                                        if (NIL != valid_$65) {
                                            funcall(function, ass);
                                        }
                                        done_var_$63 = makeBoolean(NIL == valid_$65);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if (NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(collection, sense, NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(collection, sense, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                    SubLObject done_var_$64 = NIL;
                                    final SubLObject token_var_$65 = NIL;
                                    while (NIL == done_var_$64) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$65);
                                        final SubLObject valid_$66 = makeBoolean(!token_var_$65.eql(ass));
                                        if (NIL != valid_$66) {
                                            funcall(function, ass);
                                        }
                                        done_var_$64 = makeBoolean(NIL == valid_$66);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
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
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit with
     * predicate #$genls and arg2 COLLECTION, and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit with\r\npredicate #$genls and arg2 COLLECTION, and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit with\npredicate #$genls and arg2 COLLECTION, and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static final SubLObject map_genls_rule_index_alt(SubLObject function, SubLObject collection, SubLObject sense, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if (NIL != direction) {
                                    if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(collection, sense, direction)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(collection, sense, direction);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                                {
                                                                    SubLObject done_var_67 = NIL;
                                                                    SubLObject token_var_68 = NIL;
                                                                    while (NIL == done_var_67) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_68);
                                                                            SubLObject valid_69 = makeBoolean(token_var_68 != ass);
                                                                            if (NIL != valid_69) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_67 = makeBoolean(NIL == valid_69);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_70, thread);
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
                                } else {
                                    if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(collection, sense, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(collection, sense, NIL);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_71 = NIL;
                                                                    SubLObject token_var_72 = NIL;
                                                                    while (NIL == done_var_71) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_72);
                                                                            SubLObject valid_73 = makeBoolean(token_var_72 != ass);
                                                                            if (NIL != valid_73) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_71 = makeBoolean(NIL == valid_73);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_74, thread);
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
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit with\r\npredicate #$genls and arg2 COLLECTION, and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit with\npredicate #$genls and arg2 COLLECTION, and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static SubLObject map_genls_rule_index(final SubLObject function, final SubLObject collection, final SubLObject sense, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != enumeration_types.sense_p(sense) : "! enumeration_types.sense_p(sense) " + ("enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) ") + sense;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if (NIL != direction) {
                    if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(collection, sense, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(collection, sense, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$71 = NIL;
                                    final SubLObject token_var_$72 = NIL;
                                    while (NIL == done_var_$71) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$72);
                                        final SubLObject valid_$73 = makeBoolean(!token_var_$72.eql(ass));
                                        if (NIL != valid_$73) {
                                            funcall(function, ass);
                                        }
                                        done_var_$71 = makeBoolean(NIL == valid_$73);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$74, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(collection, sense, NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(collection, sense, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                    SubLObject done_var_$72 = NIL;
                                    final SubLObject token_var_$73 = NIL;
                                    while (NIL == done_var_$72) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$73);
                                        final SubLObject valid_$74 = makeBoolean(!token_var_$73.eql(ass));
                                        if (NIL != valid_$74) {
                                            funcall(function, ass);
                                        }
                                        done_var_$72 = makeBoolean(NIL == valid_$74);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
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
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }/**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit with
     * predicate #$genls and arg2 COLLECTION, and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */


    /**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit with
     * predicate #$genlMt and arg2 GENL-MT, and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit with\r\npredicate #$genlMt and arg2 GENL-MT, and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit with\npredicate #$genlMt and arg2 GENL-MT, and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static final SubLObject map_genl_mt_rule_index_alt(SubLObject function, SubLObject genl_mt, SubLObject sense, SubLObject direction, SubLObject rule_mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (rule_mt == UNPROVIDED) {
            rule_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = rule_mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if (NIL != direction) {
                                    if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, sense, direction)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, sense, direction);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                                {
                                                                    SubLObject done_var_75 = NIL;
                                                                    SubLObject token_var_76 = NIL;
                                                                    while (NIL == done_var_75) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_76);
                                                                            SubLObject valid_77 = makeBoolean(token_var_76 != ass);
                                                                            if (NIL != valid_77) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_75 = makeBoolean(NIL == valid_77);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_78, thread);
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
                                } else {
                                    if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, sense, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, sense, NIL);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_79 = NIL;
                                                                    SubLObject token_var_80 = NIL;
                                                                    while (NIL == done_var_79) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_80);
                                                                            SubLObject valid_81 = makeBoolean(token_var_80 != ass);
                                                                            if (NIL != valid_81) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_79 = makeBoolean(NIL == valid_81);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_82, thread);
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
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Apply FUNCTION to each rule assertion which contains a SENSE-lit with\r\npredicate #$genlMt and arg2 GENL-MT, and has direction DIRECTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion which contains a SENSE-lit with\npredicate #$genlMt and arg2 GENL-MT, and has direction DIRECTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static SubLObject map_genl_mt_rule_index(final SubLObject function, final SubLObject genl_mt, final SubLObject sense, SubLObject direction, SubLObject rule_mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (rule_mt == UNPROVIDED) {
            rule_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != enumeration_types.sense_p(sense) : "! enumeration_types.sense_p(sense) " + ("enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) ") + sense;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = rule_mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if (NIL != direction) {
                    if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, sense, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, sense, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$79 = NIL;
                                    final SubLObject token_var_$80 = NIL;
                                    while (NIL == done_var_$79) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$80);
                                        final SubLObject valid_$81 = makeBoolean(!token_var_$80.eql(ass));
                                        if (NIL != valid_$81) {
                                            funcall(function, ass);
                                        }
                                        done_var_$79 = makeBoolean(NIL == valid_$81);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, sense, NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, sense, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                    SubLObject done_var_$80 = NIL;
                                    final SubLObject token_var_$81 = NIL;
                                    while (NIL == done_var_$80) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$81);
                                        final SubLObject valid_$82 = makeBoolean(!token_var_$81.eql(ass));
                                        if (NIL != valid_$82) {
                                            funcall(function, ass);
                                        }
                                        done_var_$80 = makeBoolean(NIL == valid_$82);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
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
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }/**
     * Apply FUNCTION to each rule assertion which contains a SENSE-lit with
     * predicate #$genlMt and arg2 GENL-MT, and has direction DIRECTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */


    /**
     * Apply FUNCTION to each rule assertion with direction DIRECTION which contains
     * a neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor CYCL-FUNCTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion with direction DIRECTION which contains\r\na neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor CYCL-FUNCTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion with direction DIRECTION which contains\na neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor CYCL-FUNCTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static final SubLObject map_function_rule_index_alt(SubLObject subl_function, SubLObject cycl_function, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(subl_function, FUNCTION_SPEC_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if (NIL != direction) {
                                    if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(cycl_function, direction)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(cycl_function, direction);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                                {
                                                                    SubLObject done_var_83 = NIL;
                                                                    SubLObject token_var_84 = NIL;
                                                                    while (NIL == done_var_83) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_84);
                                                                            SubLObject valid_85 = makeBoolean(token_var_84 != ass);
                                                                            if (NIL != valid_85) {
                                                                                funcall(subl_function, ass);
                                                                            }
                                                                            done_var_83 = makeBoolean(NIL == valid_85);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_86, thread);
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
                                } else {
                                    if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(cycl_function, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(cycl_function, NIL);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_87 = NIL;
                                                                    SubLObject token_var_88 = NIL;
                                                                    while (NIL == done_var_87) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_88);
                                                                            SubLObject valid_89 = makeBoolean(token_var_88 != ass);
                                                                            if (NIL != valid_89) {
                                                                                funcall(subl_function, ass);
                                                                            }
                                                                            done_var_87 = makeBoolean(NIL == valid_89);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_90 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_90, thread);
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
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Apply FUNCTION to each rule assertion with direction DIRECTION which contains\r\na neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor CYCL-FUNCTION.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion with direction DIRECTION which contains\na neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor CYCL-FUNCTION.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static SubLObject map_function_rule_index(final SubLObject subl_function, final SubLObject cycl_function, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(subl_function) : "! function_spec_p(subl_function) " + ("Types.function_spec_p(subl_function) " + "CommonSymbols.NIL != Types.function_spec_p(subl_function) ") + subl_function;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if (NIL != direction) {
                    if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(cycl_function, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(cycl_function, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$87 = NIL;
                                    final SubLObject token_var_$88 = NIL;
                                    while (NIL == done_var_$87) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$88);
                                        final SubLObject valid_$89 = makeBoolean(!token_var_$88.eql(ass));
                                        if (NIL != valid_$89) {
                                            funcall(subl_function, ass);
                                        }
                                        done_var_$87 = makeBoolean(NIL == valid_$89);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$90 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(cycl_function, NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(cycl_function, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                    SubLObject done_var_$88 = NIL;
                                    final SubLObject token_var_$89 = NIL;
                                    while (NIL == done_var_$88) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$89);
                                        final SubLObject valid_$90 = makeBoolean(!token_var_$89.eql(ass));
                                        if (NIL != valid_$90) {
                                            funcall(subl_function, ass);
                                        }
                                        done_var_$88 = makeBoolean(NIL == valid_$90);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
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
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }/**
     * Apply FUNCTION to each rule assertion with direction DIRECTION which contains
     * a neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor CYCL-FUNCTION.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */


    /**
     * Apply FUNCTION to each rule assertion with direction DIRECTION which contains
     * a pos-lit whose predicate is #$abnormal and whose arg2 is RULE.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion with direction DIRECTION which contains\r\na pos-lit whose predicate is #$abnormal and whose arg2 is RULE.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion with direction DIRECTION which contains\na pos-lit whose predicate is #$abnormal and whose arg2 is RULE.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static final SubLObject map_exception_rule_index_alt(SubLObject function, SubLObject rule, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if (NIL != direction) {
                                    if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, direction)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, direction);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                                {
                                                                    SubLObject done_var_91 = NIL;
                                                                    SubLObject token_var_92 = NIL;
                                                                    while (NIL == done_var_91) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_92);
                                                                            SubLObject valid_93 = makeBoolean(token_var_92 != ass);
                                                                            if (NIL != valid_93) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_91 = makeBoolean(NIL == valid_93);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_94, thread);
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
                                } else {
                                    if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, NIL);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_95 = NIL;
                                                                    SubLObject token_var_96 = NIL;
                                                                    while (NIL == done_var_95) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_96);
                                                                            SubLObject valid_97 = makeBoolean(token_var_96 != ass);
                                                                            if (NIL != valid_97) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_95 = makeBoolean(NIL == valid_97);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_98 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_98, thread);
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
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Apply FUNCTION to each rule assertion with direction DIRECTION which contains\r\na pos-lit whose predicate is #$abnormal and whose arg2 is RULE.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion with direction DIRECTION which contains\na pos-lit whose predicate is #$abnormal and whose arg2 is RULE.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static SubLObject map_exception_rule_index(final SubLObject function, final SubLObject rule, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if (NIL != direction) {
                    if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$95 = NIL;
                                    final SubLObject token_var_$96 = NIL;
                                    while (NIL == done_var_$95) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$96);
                                        final SubLObject valid_$97 = makeBoolean(!token_var_$96.eql(ass));
                                        if (NIL != valid_$97) {
                                            funcall(function, ass);
                                        }
                                        done_var_$95 = makeBoolean(NIL == valid_$97);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$98 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$98, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                    SubLObject done_var_$96 = NIL;
                                    final SubLObject token_var_$97 = NIL;
                                    while (NIL == done_var_$96) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$97);
                                        final SubLObject valid_$98 = makeBoolean(!token_var_$97.eql(ass));
                                        if (NIL != valid_$98) {
                                            funcall(function, ass);
                                        }
                                        done_var_$96 = makeBoolean(NIL == valid_$98);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$99 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
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
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }/**
     * Apply FUNCTION to each rule assertion with direction DIRECTION which contains
     * a pos-lit whose predicate is #$abnormal and whose arg2 is RULE.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */


    /**
     * Apply FUNCTION to each rule assertion with direction DIRECTION which contains
     * a pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion with direction DIRECTION which contains\r\na pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion with direction DIRECTION which contains\na pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static final SubLObject map_pragma_rule_index_alt(SubLObject function, SubLObject rule, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if (NIL != direction) {
                                    if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, direction)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, direction);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                                {
                                                                    SubLObject done_var_99 = NIL;
                                                                    SubLObject token_var_100 = NIL;
                                                                    while (NIL == done_var_99) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_100);
                                                                            SubLObject valid_101 = makeBoolean(token_var_100 != ass);
                                                                            if (NIL != valid_101) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_99 = makeBoolean(NIL == valid_101);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_102 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_102, thread);
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
                                } else {
                                    if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, NIL)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, NIL);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_103 = NIL;
                                                                    SubLObject token_var_104 = NIL;
                                                                    while (NIL == done_var_103) {
                                                                        {
                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_104);
                                                                            SubLObject valid_105 = makeBoolean(token_var_104 != ass);
                                                                            if (NIL != valid_105) {
                                                                                funcall(function, ass);
                                                                            }
                                                                            done_var_103 = makeBoolean(NIL == valid_105);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_106, thread);
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
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Apply FUNCTION to each rule assertion with direction DIRECTION which contains\r\na pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE.\r\nIf DIRECTION is NIL, assertions are not filtered based on direction.\nApply FUNCTION to each rule assertion with direction DIRECTION which contains\na pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE.\nIf DIRECTION is NIL, assertions are not filtered based on direction.")
    public static SubLObject map_pragma_rule_index(final SubLObject function, final SubLObject rule, SubLObject direction, SubLObject mt) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if (NIL != direction) {
                    if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$103 = NIL;
                                    final SubLObject token_var_$104 = NIL;
                                    while (NIL == done_var_$103) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$104);
                                        final SubLObject valid_$105 = makeBoolean(!token_var_$104.eql(ass));
                                        if (NIL != valid_$105) {
                                            funcall(function, ass);
                                        }
                                        done_var_$103 = makeBoolean(NIL == valid_$105);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                    SubLObject done_var_$104 = NIL;
                                    final SubLObject token_var_$105 = NIL;
                                    while (NIL == done_var_$104) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$105);
                                        final SubLObject valid_$106 = makeBoolean(!token_var_$105.eql(ass));
                                        if (NIL != valid_$106) {
                                            funcall(function, ass);
                                        }
                                        done_var_$104 = makeBoolean(NIL == valid_$106);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$107 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
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
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }/**
     * Apply FUNCTION to each rule assertion with direction DIRECTION which contains
     * a pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE.
     * If DIRECTION is NIL, assertions are not filtered based on direction.
     */


    /**
     * Apply FUNCTION to each rule assertion with a SENSE-lit whose predicate is
     * not fully bound.
     */
    @LispMethod(comment = "Apply FUNCTION to each rule assertion with a SENSE-lit whose predicate is\r\nnot fully bound.\nApply FUNCTION to each rule assertion with a SENSE-lit whose predicate is\nnot fully bound.")
    public static final SubLObject map_unbound_predicate_rule_index_alt(SubLObject function, SubLObject sense, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        {
            SubLObject catch_var = NIL;
            try {
                if (NIL != direction) {
                    if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, direction)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, direction);
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
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                {
                                                    SubLObject done_var_107 = NIL;
                                                    SubLObject token_var_108 = NIL;
                                                    while (NIL == done_var_107) {
                                                        {
                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_108);
                                                            SubLObject valid_109 = makeBoolean(token_var_108 != ass);
                                                            if (NIL != valid_109) {
                                                                funcall(function, ass);
                                                            }
                                                            done_var_107 = makeBoolean(NIL == valid_109);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
                } else {
                    if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, NIL)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, NIL);
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
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                {
                                                    SubLObject done_var_110 = NIL;
                                                    SubLObject token_var_111 = NIL;
                                                    while (NIL == done_var_110) {
                                                        {
                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_111);
                                                            SubLObject valid_112 = makeBoolean(token_var_111 != ass);
                                                            if (NIL != valid_112) {
                                                                funcall(function, ass);
                                                            }
                                                            done_var_110 = makeBoolean(NIL == valid_112);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Apply FUNCTION to each rule assertion with a SENSE-lit whose predicate is\r\nnot fully bound.\nApply FUNCTION to each rule assertion with a SENSE-lit whose predicate is\nnot fully bound.")
    public static SubLObject map_unbound_predicate_rule_index(final SubLObject function, final SubLObject sense, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$111 = NIL;
                                final SubLObject token_var_$112 = NIL;
                                while (NIL == done_var_$111) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$112);
                                    final SubLObject valid_$113 = makeBoolean(!token_var_$112.eql(ass));
                                    if (NIL != valid_$113) {
                                        funcall(function, ass);
                                    }
                                    done_var_$111 = makeBoolean(NIL == valid_$113);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$112 = NIL;
                                final SubLObject token_var_$113 = NIL;
                                while (NIL == done_var_$112) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$113);
                                    final SubLObject valid_$114 = makeBoolean(!token_var_$113.eql(ass));
                                    if (NIL != valid_$114) {
                                        funcall(function, ass);
                                    }
                                    done_var_$112 = makeBoolean(NIL == valid_$114);
                                } 
                            } finally {
                                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }

        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }/**
     * Apply FUNCTION to each rule assertion with a SENSE-lit whose predicate is
     * not fully bound.
     */


    /**
     * Apply FUNCTION to each assertion indexed from TERM.
     */
    @LispMethod(comment = "Apply FUNCTION to each assertion indexed from TERM.")
    public static final SubLObject map_term_alt(SubLObject function, SubLObject v_term) {
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        {
            SubLObject catch_var = NIL;
            try {
                if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                            {
                                                SubLObject done_var_113 = NIL;
                                                SubLObject token_var_114 = NIL;
                                                while (NIL == done_var_113) {
                                                    {
                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_114);
                                                        SubLObject valid_115 = makeBoolean(token_var_114 != ass);
                                                        if (NIL != valid_115) {
                                                            if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                                                funcall(function, ass);
                                                            }
                                                        }
                                                        done_var_113 = makeBoolean(NIL == valid_115);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Apply FUNCTION to each assertion indexed from TERM.")
    public static SubLObject map_term(final SubLObject function, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var_$117 = NIL;
                            final SubLObject token_var_$118 = NIL;
                            while (NIL == done_var_$117) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$118);
                                final SubLObject valid_$119 = makeBoolean(!token_var_$118.eql(ass));
                                if ((NIL != valid_$119) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec))) {
                                    funcall(function, ass);
                                }
                                done_var_$117 = makeBoolean(NIL == valid_$119);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }/**
     * Apply FUNCTION to each assertion indexed from TERM.
     */


    /**
     * apply FUNCTION to each assertion indexed from TERM by any SELECTED-ARGS.
     * if TRUTH is nil, all assertions are mapped.
     * if GAFS-ONLY? nil all :ist and :other assertions are mapped.
     */
    @LispMethod(comment = "apply FUNCTION to each assertion indexed from TERM by any SELECTED-ARGS.\r\nif TRUTH is nil, all assertions are mapped.\r\nif GAFS-ONLY? nil all :ist and :other assertions are mapped.\napply FUNCTION to each assertion indexed from TERM by any SELECTED-ARGS.\nif TRUTH is nil, all assertions are mapped.\nif GAFS-ONLY? nil all :ist and :other assertions are mapped.")
    public static final SubLObject selected_map_term_alt(SubLObject function, SubLObject v_term, SubLObject truth, SubLObject gafs_onlyP) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (gafs_onlyP == UNPROVIDED) {
            gafs_onlyP = NIL;
        }
        {
            SubLObject type = (NIL != gafs_onlyP) ? ((SubLObject) ($GAF)) : NIL;
            SubLObject catch_var = NIL;
            try {
                if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, type)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, type);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, truth, NIL);
                                            {
                                                SubLObject done_var_116 = NIL;
                                                SubLObject token_var_117 = NIL;
                                                while (NIL == done_var_116) {
                                                    {
                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_117);
                                                        SubLObject valid_118 = makeBoolean(token_var_117 != ass);
                                                        if (NIL != valid_118) {
                                                            if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                                                funcall(function, ass);
                                                            }
                                                        }
                                                        done_var_116 = makeBoolean(NIL == valid_118);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "apply FUNCTION to each assertion indexed from TERM by any SELECTED-ARGS.\r\nif TRUTH is nil, all assertions are mapped.\r\nif GAFS-ONLY? nil all :ist and :other assertions are mapped.\napply FUNCTION to each assertion indexed from TERM by any SELECTED-ARGS.\nif TRUTH is nil, all assertions are mapped.\nif GAFS-ONLY? nil all :ist and :other assertions are mapped.")
    public static SubLObject selected_map_term(final SubLObject function, final SubLObject v_term, SubLObject truth, SubLObject gafs_onlyP) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (gafs_onlyP == UNPROVIDED) {
            gafs_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type = (NIL != gafs_onlyP) ? $GAF : NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, type)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, type);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, truth, NIL);
                            SubLObject done_var_$120 = NIL;
                            final SubLObject token_var_$121 = NIL;
                            while (NIL == done_var_$120) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$121);
                                final SubLObject valid_$122 = makeBoolean(!token_var_$121.eql(ass));
                                if ((NIL != valid_$122) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec))) {
                                    funcall(function, ass);
                                }
                                done_var_$120 = makeBoolean(NIL == valid_$122);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }/**
     * apply FUNCTION to each assertion indexed from TERM by any SELECTED-ARGS.
     * if TRUTH is nil, all assertions are mapped.
     * if GAFS-ONLY? nil all :ist and :other assertions are mapped.
     */


    /**
     * Apply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.
     * If TRUTH is nil, all assertions are mapped.
     */
    @LispMethod(comment = "Apply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.\r\nIf TRUTH is nil, all assertions are mapped.\nApply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.\nIf TRUTH is nil, all assertions are mapped.")
    public static final SubLObject map_term_selective_alt(SubLObject function, SubLObject v_term, SubLObject test, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(test, FUNCTION_SPEC_P);
            {
                SubLObject _prev_bind_0 = $map_term_selective_action$.currentBinding(thread);
                SubLObject _prev_bind_1 = $map_term_selective_test$.currentBinding(thread);
                SubLObject _prev_bind_2 = $mapping_truth$.currentBinding(thread);
                try {
                    $map_term_selective_action$.bind(function, thread);
                    $map_term_selective_test$.bind(test, thread);
                    $mapping_truth$.bind(truth, thread);
                    {
                        SubLObject catch_var = NIL;
                        try {
                            com.cyc.cycjava.cycl.kb_mapping.map_term(MAP_TERM_SELECTIVE_INTERNAL, v_term);
                        } catch (Throwable ccatch_env_var) {
                            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                        }
                    }
                } finally {
                    $mapping_truth$.rebind(_prev_bind_2, thread);
                    $map_term_selective_test$.rebind(_prev_bind_1, thread);
                    $map_term_selective_action$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Apply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.\r\nIf TRUTH is nil, all assertions are mapped.\nApply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.\nIf TRUTH is nil, all assertions are mapped.")
    public static SubLObject map_term_selective(final SubLObject function, final SubLObject v_term, final SubLObject test, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(test, FUNCTION_SPEC_P);
        final SubLObject _prev_bind_0 = $map_term_selective_action$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $map_term_selective_test$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $mapping_truth$.currentBinding(thread);
        try {
            $map_term_selective_action$.bind(function, thread);
            $map_term_selective_test$.bind(test, thread);
            $mapping_truth$.bind(truth, thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($MAPPING_DONE);
                map_term(MAP_TERM_SELECTIVE_INTERNAL, v_term);
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            $mapping_truth$.rebind(_prev_bind_3, thread);
            $map_term_selective_test$.rebind(_prev_bind_2, thread);
            $map_term_selective_action$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Apply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.
     * If TRUTH is nil, all assertions are mapped.
     */


    public static final SubLObject map_term_selective_internal_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != funcall($map_term_selective_test$.getDynamicValue(thread), assertion)) {
                funcall($map_term_selective_action$.getDynamicValue(thread), assertion);
            }
            return NIL;
        }
    }

    public static SubLObject map_term_selective_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != funcall($map_term_selective_test$.getDynamicValue(thread), assertion)) {
            funcall($map_term_selective_action$.getDynamicValue(thread), assertion);
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to every gaf indexed from TERM.
     * If TRUTH is nil, all assertions are mapped.
     */
    @LispMethod(comment = "Apply FUNCTION to every gaf indexed from TERM.\r\nIf TRUTH is nil, all assertions are mapped.\nApply FUNCTION to every gaf indexed from TERM.\nIf TRUTH is nil, all assertions are mapped.")
    public static final SubLObject map_term_gafs_alt(SubLObject function, SubLObject v_term, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        com.cyc.cycjava.cycl.kb_mapping.selected_map_term(function, v_term, truth, T);
        return NIL;
    }

    @LispMethod(comment = "Apply FUNCTION to every gaf indexed from TERM.\r\nIf TRUTH is nil, all assertions are mapped.\nApply FUNCTION to every gaf indexed from TERM.\nIf TRUTH is nil, all assertions are mapped.")
    public static SubLObject map_term_gafs(final SubLObject function, final SubLObject v_term, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        selected_map_term(function, v_term, truth, T);
        return NIL;
    }/**
     * Apply FUNCTION to every gaf indexed from TERM.
     * If TRUTH is nil, all assertions are mapped.
     */


    /**
     * Apply FUNCTION to each assertion with TRUTH in MT TERM.
     * If TRUTH is nil, all assertions are mapped.
     * If GAFS-ONLY, then only gafs are mapped.
     */
    @LispMethod(comment = "Apply FUNCTION to each assertion with TRUTH in MT TERM.\r\nIf TRUTH is nil, all assertions are mapped.\r\nIf GAFS-ONLY, then only gafs are mapped.\nApply FUNCTION to each assertion with TRUTH in MT TERM.\nIf TRUTH is nil, all assertions are mapped.\nIf GAFS-ONLY, then only gafs are mapped.")
    public static final SubLObject map_mt_contents_alt(SubLObject function, SubLObject v_term, SubLObject truth, SubLObject gafs_only) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (gafs_only == UNPROVIDED) {
            gafs_only = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            if (NIL != forts.fort_p(v_term)) {
                if (NIL != kb_indexing.broad_mtP(v_term)) {
                    if (NIL != mt_relevance_macros.relevant_mtP(v_term)) {
                        {
                            SubLObject _prev_bind_0 = $mapping_truth$.currentBinding(thread);
                            try {
                                $mapping_truth$.bind(truth, thread);
                                {
                                    SubLObject catch_var = NIL;
                                    try {
                                        {
                                            SubLObject idx = assertion_handles.do_assertions_table();
                                            SubLObject total = id_index_count(idx);
                                            SubLObject sofar = ZERO_INTEGER;
                                            SubLTrampolineFile.checkType($$$mapping_broad_mt_index, STRINGP);
                                            {
                                                SubLObject _prev_bind_0_119 = $last_percent_progress_index$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                try {
                                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                                    $within_noting_percent_progress$.bind(T, thread);
                                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                    noting_percent_progress_preamble($$$mapping_broad_mt_index);
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
                                                                    com.cyc.cycjava.cycl.kb_mapping.map_mt_index_internal(function, assertion, v_term, gafs_only);
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
                                                    $last_percent_progress_index$.rebind(_prev_bind_0_119, thread);
                                                }
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                                    }
                                }
                            } finally {
                                $mapping_truth$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    com.cyc.cycjava.cycl.kb_mapping.map_mt_index(function, v_term, truth, gafs_only);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Apply FUNCTION to each assertion with TRUTH in MT TERM.\r\nIf TRUTH is nil, all assertions are mapped.\r\nIf GAFS-ONLY, then only gafs are mapped.\nApply FUNCTION to each assertion with TRUTH in MT TERM.\nIf TRUTH is nil, all assertions are mapped.\nIf GAFS-ONLY, then only gafs are mapped.")
    public static SubLObject map_mt_contents(final SubLObject function, final SubLObject v_term, SubLObject truth, SubLObject gafs_only) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (gafs_only == UNPROVIDED) {
            gafs_only = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        if (NIL != forts.fort_p(v_term)) {
            if (NIL != kb_indexing.broad_mtP(v_term)) {
                if (NIL != mt_relevance_macros.relevant_mtP(v_term)) {
                    final SubLObject _prev_bind_0 = $mapping_truth$.currentBinding(thread);
                    try {
                        $mapping_truth$.bind(truth, thread);
                        SubLObject catch_var = NIL;
                        try {
                            thread.throwStack.push($MAPPING_DONE);
                            final SubLObject idx = assertion_handles.do_assertions_table();
                            final SubLObject mess = $$$mapping_broad_mt_index;
                            final SubLObject total = id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                            final SubLObject _prev_bind_0_$123 = $last_percent_progress_index$.currentBinding(thread);
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
                                    final SubLObject idx_$124 = idx;
                                    if (NIL == id_index_objects_empty_p(idx_$124, $SKIP)) {
                                        final SubLObject idx_$125 = idx_$124;
                                        if (NIL == id_index_dense_objects_empty_p(idx_$125, $SKIP)) {
                                            final SubLObject vector_var = id_index_dense_objects(idx_$125);
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
                                                    map_mt_index_internal(function, assertion, v_term, gafs_only);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                }
                                            }
                                        }
                                        final SubLObject idx_$126 = idx_$124;
                                        if ((NIL == id_index_sparse_objects_empty_p(idx_$126)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            final SubLObject sparse = id_index_sparse_objects(idx_$126);
                                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$126);
                                            final SubLObject end_id = id_index_next_id(idx_$126);
                                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                            while (a_id2.numL(end_id)) {
                                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                    map_mt_index_internal(function, assertion2, v_term, gafs_only);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                }
                                                a_id2 = add(a_id2, ONE_INTEGER);
                                            } 
                                        }
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$124 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        noting_percent_progress_postamble();
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$124, thread);
                                    }
                                }
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_$123, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                        } finally {
                            thread.throwStack.pop();
                        }
                    } finally {
                        $mapping_truth$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                map_mt_index(function, v_term, truth, gafs_only);
            }
        }
        return NIL;
    }/**
     * Apply FUNCTION to each assertion with TRUTH in MT TERM.
     * If TRUTH is nil, all assertions are mapped.
     * If GAFS-ONLY, then only gafs are mapped.
     */


    public static final SubLObject map_mt_index_internal_alt(SubLObject function, SubLObject assertion, SubLObject mt, SubLObject gafs_only) {
        if (NIL != valid_assertion(assertion, UNPROVIDED)) {
            if (NIL != hlmt.hlmt_equalP(assertion_mt(assertion), mt)) {
                if ((NIL != com.cyc.cycjava.cycl.kb_mapping.assertion_matching_truthP(assertion)) && ((NIL == gafs_only) || ((NIL != gaf_assertionP(assertion)) && (NIL != pred_relevance_macros.relevant_predP(gaf_predicate(assertion)))))) {
                    funcall(function, assertion);
                }
            }
        }
        return NIL;
    }

    public static SubLObject map_mt_index_internal(final SubLObject function, final SubLObject assertion, final SubLObject mt, final SubLObject gafs_only) {
        if ((((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) && (NIL != hlmt.hlmt_equalP(assertions_high.assertion_mt(assertion), mt))) && (NIL != assertion_matching_truthP(assertion))) && ((NIL == gafs_only) || ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != pred_relevance_macros.relevant_predP(assertions_high.gaf_predicate(assertion)))))) {
            funcall(function, assertion);
        }
        return NIL;
    }

    public static final SubLObject assertion_matching_truthP_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return assertion_utilities.assertion_matches_truthP(assertion, $mapping_truth$.getDynamicValue(thread));
        }
    }

    public static SubLObject assertion_matching_truthP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return assertion_utilities.assertion_matches_truthP(assertion, $mapping_truth$.getDynamicValue(thread));
    }

    /**
     * Apply FUNCTION to each assertion with TRUTH at mt index MT.
     * If TRUTH is nil, all assertions are mapped.
     * If GAFS-ONLY, then only gafs are mapped.
     */
    @LispMethod(comment = "Apply FUNCTION to each assertion with TRUTH at mt index MT.\r\nIf TRUTH is nil, all assertions are mapped.\r\nIf GAFS-ONLY, then only gafs are mapped.\nApply FUNCTION to each assertion with TRUTH at mt index MT.\nIf TRUTH is nil, all assertions are mapped.\nIf GAFS-ONLY, then only gafs are mapped.")
    public static final SubLObject map_mt_index_alt(SubLObject function, SubLObject mt, SubLObject truth, SubLObject gafs_only) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (gafs_only == UNPROVIDED) {
            gafs_only = NIL;
        }
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        if (NIL != forts.fort_p(mt)) {
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject type = (NIL != gafs_only) ? ((SubLObject) ($GAF)) : NIL;
                        if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, type)) {
                            {
                                SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, truth, NIL);
                                    {
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                                SubLObject valid = makeBoolean(token_var != ass);
                                                if (NIL != valid) {
                                                    funcall(function, ass);
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Apply FUNCTION to each assertion with TRUTH at mt index MT.\r\nIf TRUTH is nil, all assertions are mapped.\r\nIf GAFS-ONLY, then only gafs are mapped.\nApply FUNCTION to each assertion with TRUTH at mt index MT.\nIf TRUTH is nil, all assertions are mapped.\nIf GAFS-ONLY, then only gafs are mapped.")
    public static SubLObject map_mt_index(final SubLObject function, final SubLObject mt, SubLObject truth, SubLObject gafs_only) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (gafs_only == UNPROVIDED) {
            gafs_only = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        if (NIL != forts.fort_p(mt)) {
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($MAPPING_DONE);
                final SubLObject type = (NIL != gafs_only) ? $GAF : NIL;
                if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, type)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, truth, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(ass));
                            if (NIL != valid) {
                                funcall(function, ass);
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            } finally {
                thread.throwStack.pop();
            }
        }
        return NIL;
    }/**
     * Apply FUNCTION to each assertion with TRUTH at mt index MT.
     * If TRUTH is nil, all assertions are mapped.
     * If GAFS-ONLY, then only gafs are mapped.
     */


    public static SubLObject map_hlmt_contents(final SubLObject function, final SubLObject v_term, SubLObject truth, SubLObject gafs_only) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (gafs_only == UNPROVIDED) {
            gafs_only = NIL;
        }
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        if (NIL != hlmt.hlmt_p(v_term)) {
            map_hlmt_index(function, v_term, truth, gafs_only);
        }
        return NIL;
    }

    public static SubLObject map_hlmt_index(final SubLObject function, final SubLObject mt, SubLObject truth, SubLObject gafs_only) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (gafs_only == UNPROVIDED) {
            gafs_only = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        if (NIL != hlmt.hlmtP(mt)) {
            final SubLObject _prev_bind_0 = $mapping_truth$.currentBinding(thread);
            try {
                $mapping_truth$.bind(truth, thread);
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($MAPPING_DONE);
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(list_utilities.flatten(mt), UNPROVIDED);
                    SubLObject ass = NIL;
                    ass = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((((NIL == gafs_only) || (NIL != gafP(ass))) && (NIL != assertion_matching_truthP(ass))) && (NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(ass), mt))) {
                            funcall(function, ass);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        ass = cdolist_list_var.first();
                    } 
                } catch (final Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                $mapping_truth$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each assertion with TRUTH at other index TERM.
     * If TRUTH is nil, all assertions are mapped.
     * If GAFS-ONLY, then only gafs are mapped.
     */
    @LispMethod(comment = "Apply FUNCTION to each assertion with TRUTH at other index TERM.\r\nIf TRUTH is nil, all assertions are mapped.\r\nIf GAFS-ONLY, then only gafs are mapped.\nApply FUNCTION to each assertion with TRUTH at other index TERM.\nIf TRUTH is nil, all assertions are mapped.\nIf GAFS-ONLY, then only gafs are mapped.")
    public static final SubLObject map_other_index_alt(SubLObject function, SubLObject v_term, SubLObject truth, SubLObject gafs_only) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (gafs_only == UNPROVIDED) {
            gafs_only = NIL;
        }
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        {
            SubLObject type = (NIL != gafs_only) ? ((SubLObject) ($GAF)) : NIL;
            SubLObject catch_var = NIL;
            try {
                if (NIL != kb_mapping_macros.do_other_index_key_validator(v_term, type)) {
                    {
                        SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec(v_term);
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, truth, NIL);
                            {
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                        SubLObject valid = makeBoolean(token_var != ass);
                                        if (NIL != valid) {
                                            if (NIL != kb_mapping_macros.do_other_index_assertion_match_p(ass)) {
                                                funcall(function, ass);
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Apply FUNCTION to each assertion with TRUTH at other index TERM.\r\nIf TRUTH is nil, all assertions are mapped.\r\nIf GAFS-ONLY, then only gafs are mapped.\nApply FUNCTION to each assertion with TRUTH at other index TERM.\nIf TRUTH is nil, all assertions are mapped.\nIf GAFS-ONLY, then only gafs are mapped.")
    public static SubLObject map_other_index(final SubLObject function, final SubLObject v_term, SubLObject truth, SubLObject gafs_only) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (gafs_only == UNPROVIDED) {
            gafs_only = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        final SubLObject type = (NIL != gafs_only) ? $GAF : NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            if (NIL != kb_mapping_macros.do_other_index_key_validator(v_term, type)) {
                final SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec(v_term);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, truth, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(ass));
                        if ((NIL != valid) && (NIL != kb_mapping_macros.do_other_index_assertion_match_p(ass))) {
                            funcall(function, ass);
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }/**
     * Apply FUNCTION to each assertion with TRUTH at other index TERM.
     * If TRUTH is nil, all assertions are mapped.
     * If GAFS-ONLY, then only gafs are mapped.
     */


    /**
     * Return a list of all mt-relevant assertions indexed via TERM.
     * If REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.
     */
    @LispMethod(comment = "Return a list of all mt-relevant assertions indexed via TERM.\r\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.\nReturn a list of all mt-relevant assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.")
    public static final SubLObject gather_index_alt(SubLObject v_term, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = NIL;
        }
        {
            SubLObject result = NIL;
            if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                if (v_term == auxiliary_indexing.unbound_rule_index()) {
                    if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(NIL, NIL)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(NIL, NIL);
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
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                {
                                                    SubLObject done_var_120 = NIL;
                                                    SubLObject token_var_121 = NIL;
                                                    while (NIL == done_var_120) {
                                                        {
                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_121);
                                                            SubLObject valid_122 = makeBoolean(token_var_121 != ass);
                                                            if (NIL != valid_122) {
                                                                result = cons(ass, result);
                                                            }
                                                            done_var_120 = makeBoolean(NIL == valid_122);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
                } else {
                    Errors.cerror($str_alt45$So_don_t_, $str_alt46$Can_t_gather_unknown_auxiliary_in, v_term);
                }
            } else {
                if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                            {
                                                SubLObject done_var_123 = NIL;
                                                SubLObject token_var_124 = NIL;
                                                while (NIL == done_var_123) {
                                                    {
                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_124);
                                                        SubLObject valid_125 = makeBoolean(token_var_124 != ass);
                                                        if (NIL != valid_125) {
                                                            if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                                                result = cons(ass, result);
                                                            }
                                                        }
                                                        done_var_123 = makeBoolean(NIL == valid_125);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            if (NIL != remove_duplicatesP) {
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return result;
        }
    }

    @LispMethod(comment = "Return a list of all mt-relevant assertions indexed via TERM.\r\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.\nReturn a list of all mt-relevant assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.")
    public static SubLObject gather_index(final SubLObject v_term, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = NIL;
        }
        return assertions_mentioning_term_int(v_term, remove_duplicatesP, NIL);
    }/**
     * Return a list of all mt-relevant assertions indexed via TERM.
     * If REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.
     */


    public static SubLObject assertions_mentioning_term(final SubLObject v_term, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = NIL;
        }
        return assertions_mentioning_term_int(v_term, remove_duplicatesP, NIL);
    }

    public static SubLObject gafs_mentioning_term(final SubLObject v_term, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = NIL;
        }
        return assertions_mentioning_term_int(v_term, remove_duplicatesP, $GAF);
    }

    public static SubLObject rules_mentioning_term(final SubLObject v_term, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = NIL;
        }
        return assertions_mentioning_term_int(v_term, remove_duplicatesP, $RULE);
    }

    public static SubLObject assertions_mentioning_term_int(final SubLObject v_term, final SubLObject remove_duplicatesP, final SubLObject type) {
        SubLObject result = NIL;
        if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
            if (v_term.eql(auxiliary_indexing.unbound_rule_index())) {
                if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(NIL, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$128 = NIL;
                                final SubLObject token_var_$129 = NIL;
                                while (NIL == done_var_$128) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$129);
                                    final SubLObject valid_$130 = makeBoolean(!token_var_$129.eql(ass));
                                    if (NIL != valid_$130) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$128 = makeBoolean(NIL == valid_$130);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else {
                Errors.cerror($str51$So_don_t_, $str52$Can_t_gather_unknown_auxiliary_in, v_term);
            }
        } else
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, type)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, type);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, NIL, NIL);
                            SubLObject done_var_$129 = NIL;
                            final SubLObject token_var_$130 = NIL;
                            while (NIL == done_var_$129) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$130);
                                final SubLObject valid_$131 = makeBoolean(!token_var_$130.eql(ass));
                                if ((NIL != valid_$131) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec))) {
                                    result = cons(ass, result);
                                }
                                done_var_$129 = makeBoolean(NIL == valid_$131);
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }

        if (NIL != remove_duplicatesP) {
            result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    /**
     * Return a list of all assertions indexed via TERM.
     * If REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.
     */
    @LispMethod(comment = "Return a list of all assertions indexed via TERM.\r\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.\nReturn a list of all assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.")
    public static final SubLObject gather_index_in_any_mt_alt(SubLObject v_term, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.kb_mapping.gather_index(v_term, remove_duplicatesP);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all assertions indexed via TERM.\r\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.\nReturn a list of all assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.")
    public static SubLObject gather_index_in_any_mt(final SubLObject v_term, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = gather_index(v_term, remove_duplicatesP);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Return a list of all assertions indexed via TERM.
     * If REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.
     */


    /**
     * Return a list of all gaf assertions such that:
     * a) TERM is its ARGNUMth argument
     * b) if TRUTH is non-nil, then TRUTH is its truth value
     * c) if PRED is non-nil, then PRED must be its predicate
     * d) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil).
     */
    @LispMethod(comment = "Return a list of all gaf assertions such that:\r\na) TERM is its ARGNUMth argument\r\nb) if TRUTH is non-nil, then TRUTH is its truth value\r\nc) if PRED is non-nil, then PRED must be its predicate\r\nd) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil).\nReturn a list of all gaf assertions such that:\na) TERM is its ARGNUMth argument\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if PRED is non-nil, then PRED must be its predicate\nd) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil).")
    public static final SubLObject gather_gaf_arg_index_alt(SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt, SubLObject truth) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(argnum, POSITIVE_INTEGER_P);
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        if (NIL != pred) {
                            {
                                SubLObject pred_var = pred;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                            {
                                                                SubLObject done_var_126 = NIL;
                                                                SubLObject token_var_127 = NIL;
                                                                while (NIL == done_var_126) {
                                                                    {
                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_127);
                                                                        SubLObject valid_128 = makeBoolean(token_var_127 != ass);
                                                                        if (NIL != valid_128) {
                                                                            result = cons(ass, result);
                                                                        }
                                                                        done_var_126 = makeBoolean(NIL == valid_128);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_129 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_129, thread);
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
                        } else {
                            {
                                SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                            {
                                                                SubLObject done_var_130 = NIL;
                                                                SubLObject token_var_131 = NIL;
                                                                while (NIL == done_var_130) {
                                                                    {
                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_131);
                                                                        SubLObject valid_132 = makeBoolean(token_var_131 != ass);
                                                                        if (NIL != valid_132) {
                                                                            result = cons(ass, result);
                                                                        }
                                                                        done_var_130 = makeBoolean(NIL == valid_132);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_133 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_133, thread);
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
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all gaf assertions such that:\r\na) TERM is its ARGNUMth argument\r\nb) if TRUTH is non-nil, then TRUTH is its truth value\r\nc) if PRED is non-nil, then PRED must be its predicate\r\nd) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil).\nReturn a list of all gaf assertions such that:\na) TERM is its ARGNUMth argument\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if PRED is non-nil, then PRED must be its predicate\nd) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil).")
    public static SubLObject gather_gaf_arg_index(final SubLObject v_term, final SubLObject argnum, SubLObject pred, SubLObject mt, SubLObject truth) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(argnum, POSITIVE_INTEGER_P);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if (NIL != pred) {
                final SubLObject pred_var = pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                SubLObject done_var_$134 = NIL;
                                final SubLObject token_var_$135 = NIL;
                                while (NIL == done_var_$134) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$135);
                                    final SubLObject valid_$136 = makeBoolean(!token_var_$135.eql(ass));
                                    if (NIL != valid_$136) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$134 = makeBoolean(NIL == valid_$136);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$137 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else {
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                SubLObject done_var_$135 = NIL;
                                final SubLObject token_var_$136 = NIL;
                                while (NIL == done_var_$135) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$136);
                                    final SubLObject valid_$137 = makeBoolean(!token_var_$136.eql(ass));
                                    if (NIL != valid_$137) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$135 = makeBoolean(NIL == valid_$137);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$138 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$138, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all gaf assertions such that:
     * a) TERM is its ARGNUMth argument
     * b) if TRUTH is non-nil, then TRUTH is its truth value
     * c) if PRED is non-nil, then PRED must be its predicate
     * d) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil).
     */


    public static final SubLObject gather_gaf_arg_index_with_predicate_alt(SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        return com.cyc.cycjava.cycl.kb_mapping.gather_gaf_arg_index(v_term, argnum, pred, mt, truth);
    }

    public static SubLObject gather_gaf_arg_index_with_predicate(final SubLObject v_term, final SubLObject argnum, final SubLObject pred, SubLObject mt, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        return gather_gaf_arg_index(v_term, argnum, pred, mt, truth);
    }

    /**
     * Return a list of all #$termOfUnit assertions with a naut arg2 such that:
     * a) TERM is its ARGNUMth argument
     * b) if FUNC is non-nil, then FUNC must be its functor
     */
    @LispMethod(comment = "Return a list of all #$termOfUnit assertions with a naut arg2 such that:\r\na) TERM is its ARGNUMth argument\r\nb) if FUNC is non-nil, then FUNC must be its functor\nReturn a list of all #$termOfUnit assertions with a naut arg2 such that:\na) TERM is its ARGNUMth argument\nb) if FUNC is non-nil, then FUNC must be its functor")
    public static final SubLObject gather_nart_arg_index_alt(SubLObject v_term, SubLObject argnum, SubLObject func) {
        if (func == UNPROVIDED) {
            func = NIL;
        }
        SubLTrampolineFile.checkType(argnum, POSITIVE_INTEGER_P);
        {
            SubLObject result = NIL;
            if (NIL != func) {
                if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, func)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, func);
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
                                                SubLObject done_var_134 = NIL;
                                                SubLObject token_var_135 = NIL;
                                                while (NIL == done_var_134) {
                                                    {
                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_135);
                                                        SubLObject valid_136 = makeBoolean(token_var_135 != ass);
                                                        if (NIL != valid_136) {
                                                            result = cons(ass, result);
                                                        }
                                                        done_var_134 = makeBoolean(NIL == valid_136);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            } else {
                if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, NIL)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, NIL);
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
                                                SubLObject done_var_137 = NIL;
                                                SubLObject token_var_138 = NIL;
                                                while (NIL == done_var_137) {
                                                    {
                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_138);
                                                        SubLObject valid_139 = makeBoolean(token_var_138 != ass);
                                                        if (NIL != valid_139) {
                                                            result = cons(ass, result);
                                                        }
                                                        done_var_137 = makeBoolean(NIL == valid_139);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    @LispMethod(comment = "Return a list of all #$termOfUnit assertions with a naut arg2 such that:\r\na) TERM is its ARGNUMth argument\r\nb) if FUNC is non-nil, then FUNC must be its functor\nReturn a list of all #$termOfUnit assertions with a naut arg2 such that:\na) TERM is its ARGNUMth argument\nb) if FUNC is non-nil, then FUNC must be its functor")
    public static SubLObject gather_nart_arg_index(final SubLObject v_term, final SubLObject argnum, SubLObject func) {
        if (func == UNPROVIDED) {
            func = NIL;
        }
        SubLTrampolineFile.enforceType(argnum, POSITIVE_INTEGER_P);
        SubLObject result = NIL;
        if (NIL != func) {
            if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, func)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, func);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$142 = NIL;
                            final SubLObject token_var_$143 = NIL;
                            while (NIL == done_var_$142) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$143);
                                final SubLObject valid_$144 = makeBoolean(!token_var_$143.eql(ass));
                                if (NIL != valid_$144) {
                                    result = cons(ass, result);
                                }
                                done_var_$142 = makeBoolean(NIL == valid_$144);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } else
            if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$143 = NIL;
                            final SubLObject token_var_$144 = NIL;
                            while (NIL == done_var_$143) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$144);
                                final SubLObject valid_$145 = makeBoolean(!token_var_$144.eql(ass));
                                if (NIL != valid_$145) {
                                    result = cons(ass, result);
                                }
                                done_var_$143 = makeBoolean(NIL == valid_$145);
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }

        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all #$termOfUnit assertions with a naut arg2 such that:
     * a) TERM is its ARGNUMth argument
     * b) if FUNC is non-nil, then FUNC must be its functor
     */


    /**
     * Return a list of all gaf assertions such that:
     * a) PRED is its predicate
     * b) if TRUTH is non-nil, then TRUTH is its truth value
     * c) if MT is non-nil, then MT must be its microtheory.
     */
    @LispMethod(comment = "Return a list of all gaf assertions such that:\r\na) PRED is its predicate\r\nb) if TRUTH is non-nil, then TRUTH is its truth value\r\nc) if MT is non-nil, then MT must be its microtheory.\nReturn a list of all gaf assertions such that:\na) PRED is its predicate\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if MT is non-nil, then MT must be its microtheory.")
    public static final SubLObject gather_predicate_extent_index_alt(SubLObject pred, SubLObject mt, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject pred_var = pred;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                        {
                                                            SubLObject done_var_140 = NIL;
                                                            SubLObject token_var_141 = NIL;
                                                            while (NIL == done_var_140) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_141);
                                                                    SubLObject valid_142 = makeBoolean(token_var_141 != ass);
                                                                    if (NIL != valid_142) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_140 = makeBoolean(NIL == valid_142);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_143 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_143, thread);
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
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all gaf assertions such that:\r\na) PRED is its predicate\r\nb) if TRUTH is non-nil, then TRUTH is its truth value\r\nc) if MT is non-nil, then MT must be its microtheory.\nReturn a list of all gaf assertions such that:\na) PRED is its predicate\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if MT is non-nil, then MT must be its microtheory.")
    public static SubLObject gather_predicate_extent_index(final SubLObject pred, SubLObject mt, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$148 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$149 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                SubLObject done_var_$150 = NIL;
                                final SubLObject token_var_$151 = NIL;
                                while (NIL == done_var_$150) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$151);
                                    final SubLObject valid_$152 = makeBoolean(!token_var_$151.eql(ass));
                                    if (NIL != valid_$152) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$150 = makeBoolean(NIL == valid_$152);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$149 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$149, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$149, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$148, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all gaf assertions such that:
     * a) PRED is its predicate
     * b) if TRUTH is non-nil, then TRUTH is its truth value
     * c) if MT is non-nil, then MT must be its microtheory.
     */


    /**
     * Return a list of all #$termOfUnit assertions such that:
     * FUNC is the functor of the naut arg2.
     */
    @LispMethod(comment = "Return a list of all #$termOfUnit assertions such that:\r\nFUNC is the functor of the naut arg2.\nReturn a list of all #$termOfUnit assertions such that:\nFUNC is the functor of the naut arg2.")
    public static final SubLObject gather_function_extent_index_alt(SubLObject func) {
        {
            SubLObject result = NIL;
            if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(func)) {
                {
                    SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(func);
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        {
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                {
                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                    SubLObject valid = makeBoolean(token_var != ass);
                                    if (NIL != valid) {
                                        result = cons(ass, result);
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            } 
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    @LispMethod(comment = "Return a list of all #$termOfUnit assertions such that:\r\nFUNC is the functor of the naut arg2.\nReturn a list of all #$termOfUnit assertions such that:\nFUNC is the functor of the naut arg2.")
    public static SubLObject gather_function_extent_index(final SubLObject func) {
        SubLObject result = NIL;
        if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(func)) {
            final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(func);
            SubLObject final_index_iterator = NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(ass));
                    if (NIL != valid) {
                        result = cons(ass, result);
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != final_index_iterator) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all #$termOfUnit assertions such that:
     * FUNC is the functor of the naut arg2.
     */


    /**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has PRED as a predicate in a positive literal
     * b) if SENSE is :neg, it has PRED as a predicate in a negative literal
     * c) if MT is non-nil, then MT must be its microtheory
     * d) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */
    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has PRED as a predicate in a positive literal\r\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal\r\nc) if MT is non-nil, then MT must be its microtheory\r\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static final SubLObject gather_predicate_rule_index_alt(SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        if (NIL != direction) {
                            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, direction)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, direction);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                        {
                                                            SubLObject done_var_144 = NIL;
                                                            SubLObject token_var_145 = NIL;
                                                            while (NIL == done_var_144) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_145);
                                                                    SubLObject valid_146 = makeBoolean(token_var_145 != ass);
                                                                    if (NIL != valid_146) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_144 = makeBoolean(NIL == valid_146);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_147 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_147, thread);
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
                        } else {
                            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                        {
                                                            SubLObject done_var_148 = NIL;
                                                            SubLObject token_var_149 = NIL;
                                                            while (NIL == done_var_148) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_149);
                                                                    SubLObject valid_150 = makeBoolean(token_var_149 != ass);
                                                                    if (NIL != valid_150) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_148 = makeBoolean(NIL == valid_150);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_151 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_151, thread);
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
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has PRED as a predicate in a positive literal\r\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal\r\nc) if MT is non-nil, then MT must be its microtheory\r\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static SubLObject gather_predicate_rule_index(final SubLObject pred, final SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sense, SENSE_P);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$154 = NIL;
                                final SubLObject token_var_$155 = NIL;
                                while (NIL == done_var_$154) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$155);
                                    final SubLObject valid_$156 = makeBoolean(!token_var_$155.eql(ass));
                                    if (NIL != valid_$156) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$154 = makeBoolean(NIL == valid_$156);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$157 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$157, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$155 = NIL;
                                final SubLObject token_var_$156 = NIL;
                                while (NIL == done_var_$155) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$156);
                                    final SubLObject valid_$157 = makeBoolean(!token_var_$156.eql(ass));
                                    if (NIL != valid_$157) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$155 = makeBoolean(NIL == valid_$157);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$158 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$158, thread);
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
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has PRED as a predicate in a positive literal
     * b) if SENSE is :neg, it has PRED as a predicate in a negative literal
     * c) if MT is non-nil, then MT must be its microtheory
     * d) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */


    public static final SubLObject gather_predicate_rule_index_in_all_mts_alt(SubLObject pred, SubLObject sense, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.kb_mapping.gather_predicate_rule_index(pred, sense, NIL, direction);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gather_predicate_rule_index_in_all_mts(final SubLObject pred, final SubLObject sense, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = gather_predicate_rule_index(pred, sense, NIL, direction);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist
     * b) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist
     * c) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */
    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist\r\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist\r\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static final SubLObject gather_decontextualized_ist_predicate_rule_index_alt(SubLObject pred, SubLObject sense, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        SubLTrampolineFile.checkType(sense, SENSE_P);
        {
            SubLObject result = NIL;
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, sense, direction)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, sense, direction);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                            {
                                                SubLObject done_var_152 = NIL;
                                                SubLObject token_var_153 = NIL;
                                                while (NIL == done_var_152) {
                                                    {
                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_153);
                                                        SubLObject valid_154 = makeBoolean(token_var_153 != ass);
                                                        if (NIL != valid_154) {
                                                            result = cons(ass, result);
                                                        }
                                                        done_var_152 = makeBoolean(NIL == valid_154);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            } else {
                if (NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, sense, NIL)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                            {
                                                SubLObject done_var_155 = NIL;
                                                SubLObject token_var_156 = NIL;
                                                while (NIL == done_var_155) {
                                                    {
                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_156);
                                                        SubLObject valid_157 = makeBoolean(token_var_156 != ass);
                                                        if (NIL != valid_157) {
                                                            result = cons(ass, result);
                                                        }
                                                        done_var_155 = makeBoolean(NIL == valid_157);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist\r\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist\r\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static SubLObject gather_decontextualized_ist_predicate_rule_index(final SubLObject pred, final SubLObject sense, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        SubLTrampolineFile.enforceType(sense, SENSE_P);
        SubLObject result = NIL;
        if (NIL != direction) {
            if (NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, sense, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$162 = NIL;
                            final SubLObject token_var_$163 = NIL;
                            while (NIL == done_var_$162) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$163);
                                final SubLObject valid_$164 = makeBoolean(!token_var_$163.eql(ass));
                                if ((NIL != valid_$164) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                                    result = cons(ass, result);
                                }
                                done_var_$162 = makeBoolean(NIL == valid_$164);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } else
            if (NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, sense, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                            SubLObject done_var_$163 = NIL;
                            final SubLObject token_var_$164 = NIL;
                            while (NIL == done_var_$163) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$164);
                                final SubLObject valid_$165 = makeBoolean(!token_var_$164.eql(ass));
                                if ((NIL != valid_$165) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                                    result = cons(ass, result);
                                }
                                done_var_$163 = makeBoolean(NIL == valid_$165);
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }

        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist
     * b) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist
     * c) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */


    /**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)
     * b) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)
     * c) if MT is non-nil, then MT must be its microtheory
     * d) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */
    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)\r\nb) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)\r\nc) if MT is non-nil, then MT must be its microtheory\r\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static final SubLObject gather_isa_rule_index_alt(SubLObject collection, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        if (NIL != direction) {
                            if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(collection, sense, direction)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(collection, sense, direction);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                        {
                                                            SubLObject done_var_158 = NIL;
                                                            SubLObject token_var_159 = NIL;
                                                            while (NIL == done_var_158) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_159);
                                                                    SubLObject valid_160 = makeBoolean(token_var_159 != ass);
                                                                    if (NIL != valid_160) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_158 = makeBoolean(NIL == valid_160);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_161 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_161, thread);
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
                        } else {
                            if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(collection, sense, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(collection, sense, NIL);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                        {
                                                            SubLObject done_var_162 = NIL;
                                                            SubLObject token_var_163 = NIL;
                                                            while (NIL == done_var_162) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_163);
                                                                    SubLObject valid_164 = makeBoolean(token_var_163 != ass);
                                                                    if (NIL != valid_164) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_162 = makeBoolean(NIL == valid_164);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_165 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_165, thread);
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
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)\r\nb) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)\r\nc) if MT is non-nil, then MT must be its microtheory\r\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static SubLObject gather_isa_rule_index(final SubLObject collection, final SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sense, SENSE_P);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(collection, sense, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(collection, sense, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$168 = NIL;
                                final SubLObject token_var_$169 = NIL;
                                while (NIL == done_var_$168) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$169);
                                    final SubLObject valid_$170 = makeBoolean(!token_var_$169.eql(ass));
                                    if (NIL != valid_$170) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$168 = makeBoolean(NIL == valid_$170);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$171 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$171, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(collection, sense, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(collection, sense, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$169 = NIL;
                                final SubLObject token_var_$170 = NIL;
                                while (NIL == done_var_$169) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$170);
                                    final SubLObject valid_$171 = makeBoolean(!token_var_$170.eql(ass));
                                    if (NIL != valid_$171) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$169 = makeBoolean(NIL == valid_$171);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$172 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$172, thread);
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
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)
     * b) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)
     * c) if MT is non-nil, then MT must be its microtheory
     * d) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */


    /**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)
     * b) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)
     * c) if MT is non-nil, then MT must be its microtheory
     * d) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */
    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)\r\nb) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)\r\nc) if MT is non-nil, then MT must be its microtheory\r\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static final SubLObject gather_quoted_isa_rule_index_alt(SubLObject collection, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        if (NIL != direction) {
                            if (NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(collection, sense, direction)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(collection, sense, direction);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                        {
                                                            SubLObject done_var_166 = NIL;
                                                            SubLObject token_var_167 = NIL;
                                                            while (NIL == done_var_166) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_167);
                                                                    SubLObject valid_168 = makeBoolean(token_var_167 != ass);
                                                                    if (NIL != valid_168) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_166 = makeBoolean(NIL == valid_168);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_169 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_169, thread);
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
                        } else {
                            if (NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(collection, sense, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(collection, sense, NIL);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                        {
                                                            SubLObject done_var_170 = NIL;
                                                            SubLObject token_var_171 = NIL;
                                                            while (NIL == done_var_170) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_171);
                                                                    SubLObject valid_172 = makeBoolean(token_var_171 != ass);
                                                                    if (NIL != valid_172) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_170 = makeBoolean(NIL == valid_172);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_173 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_173, thread);
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
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)\r\nb) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)\r\nc) if MT is non-nil, then MT must be its microtheory\r\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static SubLObject gather_quoted_isa_rule_index(final SubLObject collection, final SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sense, SENSE_P);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(collection, sense, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(collection, sense, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$176 = NIL;
                                final SubLObject token_var_$177 = NIL;
                                while (NIL == done_var_$176) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$177);
                                    final SubLObject valid_$178 = makeBoolean(!token_var_$177.eql(ass));
                                    if (NIL != valid_$178) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$176 = makeBoolean(NIL == valid_$178);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$179 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(collection, sense, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(collection, sense, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$177 = NIL;
                                final SubLObject token_var_$178 = NIL;
                                while (NIL == done_var_$177) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$178);
                                    final SubLObject valid_$179 = makeBoolean(!token_var_$178.eql(ass));
                                    if (NIL != valid_$179) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$177 = makeBoolean(NIL == valid_$179);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$180 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$180, thread);
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
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)
     * b) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)
     * c) if MT is non-nil, then MT must be its microtheory
     * d) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */


    /**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)
     * b) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)
     * c) if MT is non-nil, then MT must be its microtheory
     * d) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */
    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)\r\nb) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)\r\nc) if MT is non-nil, then MT must be its microtheory\r\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static final SubLObject gather_genls_rule_index_alt(SubLObject collection, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        if (NIL != direction) {
                            if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(collection, sense, direction)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(collection, sense, direction);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                        {
                                                            SubLObject done_var_174 = NIL;
                                                            SubLObject token_var_175 = NIL;
                                                            while (NIL == done_var_174) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_175);
                                                                    SubLObject valid_176 = makeBoolean(token_var_175 != ass);
                                                                    if (NIL != valid_176) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_174 = makeBoolean(NIL == valid_176);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_177 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_177, thread);
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
                        } else {
                            if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(collection, sense, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(collection, sense, NIL);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                        {
                                                            SubLObject done_var_178 = NIL;
                                                            SubLObject token_var_179 = NIL;
                                                            while (NIL == done_var_178) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_179);
                                                                    SubLObject valid_180 = makeBoolean(token_var_179 != ass);
                                                                    if (NIL != valid_180) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_178 = makeBoolean(NIL == valid_180);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_181 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_181, thread);
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
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)\r\nb) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)\r\nc) if MT is non-nil, then MT must be its microtheory\r\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static SubLObject gather_genls_rule_index(final SubLObject collection, final SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sense, SENSE_P);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(collection, sense, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(collection, sense, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$184 = NIL;
                                final SubLObject token_var_$185 = NIL;
                                while (NIL == done_var_$184) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$185);
                                    final SubLObject valid_$186 = makeBoolean(!token_var_$185.eql(ass));
                                    if (NIL != valid_$186) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$184 = makeBoolean(NIL == valid_$186);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$187 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$187, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(collection, sense, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(collection, sense, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$185 = NIL;
                                final SubLObject token_var_$186 = NIL;
                                while (NIL == done_var_$185) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$186);
                                    final SubLObject valid_$187 = makeBoolean(!token_var_$186.eql(ass));
                                    if (NIL != valid_$187) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$185 = makeBoolean(NIL == valid_$187);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$188 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$188, thread);
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
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)
     * b) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)
     * c) if MT is non-nil, then MT must be its microtheory
     * d) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */


    /**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)
     * b) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)
     * c) if RULE-MT is non-nil, then RULE-MT must be its microtheory
     * d) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */
    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)\r\nb) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)\r\nc) if RULE-MT is non-nil, then RULE-MT must be its microtheory\r\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)\nb) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)\nc) if RULE-MT is non-nil, then RULE-MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static final SubLObject gather_genl_mt_rule_index_alt(SubLObject genl_mt, SubLObject sense, SubLObject rule_mt, SubLObject direction) {
        if (rule_mt == UNPROVIDED) {
            rule_mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject result = NIL;
                SubLObject mt_var = rule_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        if (NIL != direction) {
                            if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, sense, direction)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, sense, direction);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                        {
                                                            SubLObject done_var_182 = NIL;
                                                            SubLObject token_var_183 = NIL;
                                                            while (NIL == done_var_182) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_183);
                                                                    SubLObject valid_184 = makeBoolean(token_var_183 != ass);
                                                                    if (NIL != valid_184) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_182 = makeBoolean(NIL == valid_184);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_185 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_185, thread);
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
                        } else {
                            if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, sense, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, sense, NIL);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                        {
                                                            SubLObject done_var_186 = NIL;
                                                            SubLObject token_var_187 = NIL;
                                                            while (NIL == done_var_186) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_187);
                                                                    SubLObject valid_188 = makeBoolean(token_var_187 != ass);
                                                                    if (NIL != valid_188) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_186 = makeBoolean(NIL == valid_188);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_189 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_189, thread);
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
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)\r\nb) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)\r\nc) if RULE-MT is non-nil, then RULE-MT must be its microtheory\r\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)\nb) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)\nc) if RULE-MT is non-nil, then RULE-MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static SubLObject gather_genl_mt_rule_index(final SubLObject genl_mt, final SubLObject sense, SubLObject rule_mt, SubLObject direction) {
        if (rule_mt == UNPROVIDED) {
            rule_mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sense, SENSE_P);
        SubLObject result = NIL;
        final SubLObject mt_var = rule_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, sense, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, sense, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$192 = NIL;
                                final SubLObject token_var_$193 = NIL;
                                while (NIL == done_var_$192) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$193);
                                    final SubLObject valid_$194 = makeBoolean(!token_var_$193.eql(ass));
                                    if (NIL != valid_$194) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$192 = makeBoolean(NIL == valid_$194);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$195 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$195, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, sense, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, sense, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$193 = NIL;
                                final SubLObject token_var_$194 = NIL;
                                while (NIL == done_var_$193) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$194);
                                    final SubLObject valid_$195 = makeBoolean(!token_var_$194.eql(ass));
                                    if (NIL != valid_$195) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$193 = makeBoolean(NIL == valid_$195);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$196 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$196, thread);
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
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)
     * b) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)
     * c) if RULE-MT is non-nil, then RULE-MT must be its microtheory
     * d) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */


    /**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))
     * b) if MT is non-nil, then MT must be its microtheory
     * c) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */
    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))\r\nb) if MT is non-nil, then MT must be its microtheory\r\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static final SubLObject gather_function_rule_index_alt(SubLObject func, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        if (NIL != direction) {
                            if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(func, direction)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(func, direction);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                        {
                                                            SubLObject done_var_190 = NIL;
                                                            SubLObject token_var_191 = NIL;
                                                            while (NIL == done_var_190) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_191);
                                                                    SubLObject valid_192 = makeBoolean(token_var_191 != ass);
                                                                    if (NIL != valid_192) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_190 = makeBoolean(NIL == valid_192);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_193 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_193, thread);
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
                        } else {
                            if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(func, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(func, NIL);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                        {
                                                            SubLObject done_var_194 = NIL;
                                                            SubLObject token_var_195 = NIL;
                                                            while (NIL == done_var_194) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_195);
                                                                    SubLObject valid_196 = makeBoolean(token_var_195 != ass);
                                                                    if (NIL != valid_196) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_194 = makeBoolean(NIL == valid_196);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_197 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_197, thread);
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
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))\r\nb) if MT is non-nil, then MT must be its microtheory\r\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static SubLObject gather_function_rule_index(final SubLObject func, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(func, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(func, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$200 = NIL;
                                final SubLObject token_var_$201 = NIL;
                                while (NIL == done_var_$200) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$201);
                                    final SubLObject valid_$202 = makeBoolean(!token_var_$201.eql(ass));
                                    if (NIL != valid_$202) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$200 = makeBoolean(NIL == valid_$202);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$203 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$203, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(func, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(func, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$201 = NIL;
                                final SubLObject token_var_$202 = NIL;
                                while (NIL == done_var_$201) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$202);
                                    final SubLObject valid_$203 = makeBoolean(!token_var_$202.eql(ass));
                                    if (NIL != valid_$203) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$201 = makeBoolean(NIL == valid_$203);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$204 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$204, thread);
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
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))
     * b) if MT is non-nil, then MT must be its microtheory
     * c) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */


    /**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) it has a positive literal of the form (abnormal <whatever> RULE)
     * b) if MT is non-nil, then MT must be its microtheory
     * c) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */
    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) it has a positive literal of the form (abnormal <whatever> RULE)\r\nb) if MT is non-nil, then MT must be its microtheory\r\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (abnormal <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static final SubLObject gather_exception_rule_index_alt(SubLObject rule, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        if (NIL != direction) {
                            if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, direction)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, direction);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                        {
                                                            SubLObject done_var_198 = NIL;
                                                            SubLObject token_var_199 = NIL;
                                                            while (NIL == done_var_198) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_199);
                                                                    SubLObject valid_200 = makeBoolean(token_var_199 != ass);
                                                                    if (NIL != valid_200) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_198 = makeBoolean(NIL == valid_200);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_201 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_201, thread);
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
                        } else {
                            if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, NIL);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                        {
                                                            SubLObject done_var_202 = NIL;
                                                            SubLObject token_var_203 = NIL;
                                                            while (NIL == done_var_202) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_203);
                                                                    SubLObject valid_204 = makeBoolean(token_var_203 != ass);
                                                                    if (NIL != valid_204) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_202 = makeBoolean(NIL == valid_204);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_205 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_205, thread);
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
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) it has a positive literal of the form (abnormal <whatever> RULE)\r\nb) if MT is non-nil, then MT must be its microtheory\r\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (abnormal <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static SubLObject gather_exception_rule_index(final SubLObject rule, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$208 = NIL;
                                final SubLObject token_var_$209 = NIL;
                                while (NIL == done_var_$208) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$209);
                                    final SubLObject valid_$210 = makeBoolean(!token_var_$209.eql(ass));
                                    if (NIL != valid_$210) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$208 = makeBoolean(NIL == valid_$210);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$211 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$211, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$209 = NIL;
                                final SubLObject token_var_$210 = NIL;
                                while (NIL == done_var_$209) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$210);
                                    final SubLObject valid_$211 = makeBoolean(!token_var_$210.eql(ass));
                                    if (NIL != valid_$211) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$209 = makeBoolean(NIL == valid_$211);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$212 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$212, thread);
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
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) it has a positive literal of the form (abnormal <whatever> RULE)
     * b) if MT is non-nil, then MT must be its microtheory
     * c) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */


    /**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)
     * b) if MT is non-nil, then MT must be its microtheory
     * c) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */
    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)\r\nb) if MT is non-nil, then MT must be its microtheory\r\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static final SubLObject gather_pragma_rule_index_alt(SubLObject rule, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        if (NIL != direction) {
                            if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, direction)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, direction);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                        {
                                                            SubLObject done_var_206 = NIL;
                                                            SubLObject token_var_207 = NIL;
                                                            while (NIL == done_var_206) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_207);
                                                                    SubLObject valid_208 = makeBoolean(token_var_207 != ass);
                                                                    if (NIL != valid_208) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_206 = makeBoolean(NIL == valid_208);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_209 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_209, thread);
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
                        } else {
                            if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, NIL);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                        {
                                                            SubLObject done_var_210 = NIL;
                                                            SubLObject token_var_211 = NIL;
                                                            while (NIL == done_var_210) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_211);
                                                                    SubLObject valid_212 = makeBoolean(token_var_211 != ass);
                                                                    if (NIL != valid_212) {
                                                                        result = cons(ass, result);
                                                                    }
                                                                    done_var_210 = makeBoolean(NIL == valid_212);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_213 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_213, thread);
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
                result = fast_delete_duplicates(result, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of all non-gaf assertions (rules) such that:\r\na) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)\r\nb) if MT is non-nil, then MT must be its microtheory\r\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.\nReturn a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.")
    public static SubLObject gather_pragma_rule_index(final SubLObject rule, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if (NIL != direction) {
                if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$216 = NIL;
                                final SubLObject token_var_$217 = NIL;
                                while (NIL == done_var_$216) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$217);
                                    final SubLObject valid_$218 = makeBoolean(!token_var_$217.eql(ass));
                                    if (NIL != valid_$218) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$216 = makeBoolean(NIL == valid_$218);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$219 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$219, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$217 = NIL;
                                final SubLObject token_var_$218 = NIL;
                                while (NIL == done_var_$217) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$218);
                                    final SubLObject valid_$219 = makeBoolean(!token_var_$218.eql(ass));
                                    if (NIL != valid_$219) {
                                        result = cons(ass, result);
                                    }
                                    done_var_$217 = makeBoolean(NIL == valid_$219);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$220 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$220, thread);
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
        result = list_utilities.fast_delete_duplicates(result, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }/**
     * Return a list of all non-gaf assertions (rules) such that:
     * a) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)
     * b) if MT is non-nil, then MT must be its microtheory
     * c) if DIRECTION is non-nil, then DIRECTION must be its direction.
     */


    /**
     * Return a list of all assertions such that TERM is its microtheory.
     */
    @LispMethod(comment = "Return a list of all assertions such that TERM is its microtheory.")
    public static final SubLObject gather_mt_index_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if ((NIL != simple_indexed_term_p(v_term)) || ((NIL != hlmt.hlmt_p(v_term)) && (NIL != kb_indexing.broad_mtP(hlmt.hlmt_monad_mt(v_term))))) {
                    {
                        SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
                        try {
                            $mapping_answer$.bind(NIL, thread);
                            {
                                SubLObject _prev_bind_0_214 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                    mt_relevance_macros.$mt$.bind(v_term, thread);
                                    com.cyc.cycjava.cycl.kb_mapping.map_mt_contents(symbol_function(GATHER_ASSERTIONS), hlmt.hlmt_monad_mt(v_term), UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_214, thread);
                                }
                            }
                            ans = $mapping_answer$.getDynamicValue(thread);
                        } finally {
                            $mapping_answer$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    {
                        SubLObject final_index = kb_indexing.get_mt_subindex(v_term);
                        if (NIL != final_index) {
                            ans = copy_list(final_index_leaves(final_index));
                        }
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "Return a list of all assertions such that TERM is its microtheory.")
    public static SubLObject gather_mt_index(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if ((NIL != simple_indexed_term_p(v_term)) || ((NIL != hlmt.hlmt_p(v_term)) && (NIL != kb_indexing.broad_mtP(hlmt.hlmt_monad_mt(v_term))))) {
            final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
            try {
                $mapping_answer$.bind(NIL, thread);
                final SubLObject _prev_bind_0_$224 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(v_term, thread);
                    map_mt_contents(symbol_function(GATHER_ASSERTIONS), hlmt.hlmt_monad_mt(v_term), UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$224, thread);
                }
                ans = $mapping_answer$.getDynamicValue(thread);
            } finally {
                $mapping_answer$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject final_index = kb_indexing.get_mt_subindex(v_term);
            if (NIL != final_index) {
                ans = copy_list(final_index_leaves(final_index));
            }
        }
        return ans;
    }/**
     * Return a list of all assertions such that TERM is its microtheory.
     */


    /**
     * Return a list of other assertions mentioning TERM but not indexed in any other more useful manner.
     */
    @LispMethod(comment = "Return a list of other assertions mentioning TERM but not indexed in any other more useful manner.")
    public static final SubLObject gather_other_index_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != simple_indexed_term_p(v_term)) {
                    {
                        SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
                        try {
                            $mapping_answer$.bind(NIL, thread);
                            com.cyc.cycjava.cycl.kb_mapping.map_other_index(symbol_function(GATHER_ASSERTIONS), v_term, UNPROVIDED, UNPROVIDED);
                            ans = $mapping_answer$.getDynamicValue(thread);
                        } finally {
                            $mapping_answer$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    {
                        SubLObject final_index = kb_indexing.get_other_subindex(v_term);
                        if (NIL != final_index) {
                            ans = copy_list(final_index_leaves(final_index));
                        }
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "Return a list of other assertions mentioning TERM but not indexed in any other more useful manner.")
    public static SubLObject gather_other_index(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != simple_indexed_term_p(v_term)) {
            final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
            try {
                $mapping_answer$.bind(NIL, thread);
                map_other_index(symbol_function(GATHER_ASSERTIONS), v_term, UNPROVIDED, UNPROVIDED);
                ans = $mapping_answer$.getDynamicValue(thread);
            } finally {
                $mapping_answer$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject final_index = kb_indexing.get_other_subindex(v_term);
            if (NIL != final_index) {
                ans = copy_list(final_index_leaves(final_index));
            }
        }
        return ans;
    }/**
     * Return a list of other assertions mentioning TERM but not indexed in any other more useful manner.
     */


    /**
     * Return a list of all mt-relevant assertions of TERM.
     */
    @LispMethod(comment = "Return a list of all mt-relevant assertions of TERM.")
    public static final SubLObject gather_term_assertions_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
                    try {
                        $mapping_answer$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_215 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    com.cyc.cycjava.cycl.kb_mapping.map_term(symbol_function(GATHER_ASSERTIONS), v_term);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_215, thread);
                                }
                            }
                            ans = $mapping_answer$.getDynamicValue(thread);
                        }
                    } finally {
                        $mapping_answer$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "Return a list of all mt-relevant assertions of TERM.")
    public static SubLObject gather_term_assertions(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_answer$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$225 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                map_term(symbol_function(GATHER_ASSERTIONS), v_term);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$225, thread);
            }
            ans = $mapping_answer$.getDynamicValue(thread);
        } finally {
            $mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }/**
     * Return a list of all mt-relevant assertions of TERM.
     */


    /**
     * Return all the meta assertions for all the assertions accessed via FORT.
     */
    @LispMethod(comment = "Return all the meta assertions for all the assertions accessed via FORT.")
    public static final SubLObject all_fort_meta_assertions_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fort, FORT_P);
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
                    try {
                        $mapping_answer$.bind(NIL, thread);
                        com.cyc.cycjava.cycl.kb_mapping.map_term(symbol_function(GATHER_META_ASSERTIONS), fort);
                        ans = $mapping_answer$.getDynamicValue(thread);
                    } finally {
                        $mapping_answer$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(remove_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
    }

    @LispMethod(comment = "Return all the meta assertions for all the assertions accessed via FORT.")
    public static SubLObject all_fort_meta_assertions(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_answer$.bind(NIL, thread);
            map_term(symbol_function(GATHER_META_ASSERTIONS), fort);
            ans = $mapping_answer$.getDynamicValue(thread);
        } finally {
            $mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return nreverse(remove_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }/**
     * Return all the meta assertions for all the assertions accessed via FORT.
     */


    public static final SubLObject mapping_answer_foundP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $mapping_answer$.getDynamicValue(thread)) && (NIL != $mapping_any_answerP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject mapping_answer_foundP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $mapping_answer$.getDynamicValue(thread)) && (NIL != $mapping_any_answerP$.getDynamicValue(thread)));
    }

    public static final SubLObject mapping_finishedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean($mapping_finished_fn$.getDynamicValue(thread).isFunctionSpec() && (NIL != funcall($mapping_finished_fn$.getDynamicValue(thread))));
        }
    }

    public static SubLObject mapping_finishedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean($mapping_finished_fn$.getDynamicValue(thread).isFunctionSpec() && (NIL != funcall($mapping_finished_fn$.getDynamicValue(thread))));
    }

    public static final SubLObject gather_object_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $mapping_answer$.setDynamicValue(cons(v_object, $mapping_answer$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static SubLObject gather_object(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $mapping_answer$.setDynamicValue(cons(v_object, $mapping_answer$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static final SubLObject count_object_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $mapping_answer$.setDynamicValue(add($mapping_answer$.getDynamicValue(thread), ONE_INTEGER), thread);
            return NIL;
        }
    }

    public static SubLObject count_object(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $mapping_answer$.setDynamicValue(add($mapping_answer$.getDynamicValue(thread), ONE_INTEGER), thread);
        return NIL;
    }

    public static final SubLObject assertion_with_search_term_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return assertion_mentions_term(assertion, $mapping_target$.getDynamicValue(thread));
        }
    }

    public static SubLObject assertion_with_search_term(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return assertions_high.assertion_mentions_term(assertion, $mapping_target$.getDynamicValue(thread));
    }

    public static final SubLObject assertion_without_search_term_alt(SubLObject assertion) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.kb_mapping.assertion_with_search_term(assertion));
    }

    public static SubLObject assertion_without_search_term(final SubLObject assertion) {
        return makeBoolean(NIL == assertion_with_search_term(assertion));
    }

    public static final SubLObject gather_formula_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == $mapping_assertion_selection_fn$.getDynamicValue(thread)) || (NIL != funcall($mapping_assertion_selection_fn$.getDynamicValue(thread), assertion))) {
                {
                    SubLObject item_var = fi.assertion_fi_formula(assertion, UNPROVIDED);
                    if (NIL == member(item_var, $mapping_answer$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        $mapping_answer$.setDynamicValue(cons(item_var, $mapping_answer$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gather_formula(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $mapping_assertion_selection_fn$.getDynamicValue(thread)) || (NIL != funcall($mapping_assertion_selection_fn$.getDynamicValue(thread), assertion))) {
            final SubLObject item_var = fi.assertion_fi_formula(assertion, UNPROVIDED);
            if (NIL == member(item_var, $mapping_answer$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                $mapping_answer$.setDynamicValue(cons(item_var, $mapping_answer$.getDynamicValue(thread)), thread);
            }
        }
        return NIL;
    }

    public static final SubLObject gather_assertions_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == $mapping_assertion_selection_fn$.getDynamicValue(thread)) || (NIL != funcall($mapping_assertion_selection_fn$.getDynamicValue(thread), assertion))) {
                $mapping_answer$.setDynamicValue(cons(assertion, $mapping_answer$.getDynamicValue(thread)), thread);
            }
            return NIL;
        }
    }

    public static SubLObject gather_assertions(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $mapping_assertion_selection_fn$.getDynamicValue(thread)) || (NIL != funcall($mapping_assertion_selection_fn$.getDynamicValue(thread), assertion))) {
            $mapping_answer$.setDynamicValue(cons(assertion, $mapping_answer$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject gather_some_assertions_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == $mapping_assertion_selection_fn$.getDynamicValue(thread)) || (NIL != funcall($mapping_assertion_selection_fn$.getDynamicValue(thread), assertion))) {
                $mapping_answer$.setDynamicValue(cons(assertion, $mapping_answer$.getDynamicValue(thread)), thread);
            }
            if (NIL != com.cyc.cycjava.cycl.kb_mapping.mapping_finishedP()) {
                mapping_finished();
            }
            return NIL;
        }
    }

    public static SubLObject gather_some_assertions(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $mapping_assertion_selection_fn$.getDynamicValue(thread)) || (NIL != funcall($mapping_assertion_selection_fn$.getDynamicValue(thread), assertion))) {
            $mapping_answer$.setDynamicValue(cons(assertion, $mapping_answer$.getDynamicValue(thread)), thread);
        }
        if (NIL != mapping_finishedP()) {
            mapping_finished();
        }
        return NIL;
    }

    public static final SubLObject gather_unique_assertions_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == $mapping_assertion_selection_fn$.getDynamicValue(thread)) || (NIL != funcall($mapping_assertion_selection_fn$.getDynamicValue(thread), assertion))) {
                {
                    SubLObject item_var = assertion;
                    if (NIL == member(item_var, $mapping_answer$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $mapping_answer$.setDynamicValue(cons(item_var, $mapping_answer$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gather_unique_assertions(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == $mapping_assertion_selection_fn$.getDynamicValue(thread)) || (NIL != funcall($mapping_assertion_selection_fn$.getDynamicValue(thread), assertion))) && (NIL == member(assertion, $mapping_answer$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY)))) {
            $mapping_answer$.setDynamicValue(cons(assertion, $mapping_answer$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject gather_meta_assertions_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject meta_assertions = assertion_utilities.all_meta_assertions(assertion);
                if (NIL != meta_assertions) {
                    $mapping_answer$.setDynamicValue(nconc(meta_assertions, $mapping_answer$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gather_meta_assertions(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_assertions = assertion_utilities.all_meta_assertions(assertion);
        if (NIL != meta_assertions) {
            $mapping_answer$.setDynamicValue(nconc(meta_assertions, $mapping_answer$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject gather_arg_alt(SubLObject assertion, SubLObject arg, SubLObject test) {
        if (arg == UNPROVIDED) {
            arg = $mapping_gather_arg$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = $mapping_equality_test$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != test) {
                {
                    SubLObject item_var = gaf_arg(assertion, arg);
                    if (NIL == member(item_var, $mapping_answer$.getDynamicValue(thread), test, symbol_function(IDENTITY))) {
                        $mapping_answer$.setDynamicValue(cons(item_var, $mapping_answer$.getDynamicValue(thread)), thread);
                    }
                }
            } else {
                $mapping_answer$.setDynamicValue(cons(gaf_arg(assertion, arg), $mapping_answer$.getDynamicValue(thread)), thread);
            }
            return NIL;
        }
    }

    public static SubLObject gather_arg(final SubLObject assertion, SubLObject arg, SubLObject test) {
        if (arg == UNPROVIDED) {
            arg = $mapping_gather_arg$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = $mapping_equality_test$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != test) {
            final SubLObject item_var = assertions_high.gaf_arg(assertion, arg);
            if (NIL == member(item_var, $mapping_answer$.getDynamicValue(thread), test, symbol_function(IDENTITY))) {
                $mapping_answer$.setDynamicValue(cons(item_var, $mapping_answer$.getDynamicValue(thread)), thread);
            }
        } else {
            $mapping_answer$.setDynamicValue(cons(assertions_high.gaf_arg(assertion, arg), $mapping_answer$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject gather_fn_of_arg_alt(SubLObject assertion, SubLObject arg, SubLObject key, SubLObject args) {
        if (arg == UNPROVIDED) {
            arg = $mapping_gather_arg$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = $mapping_gather_key$.getDynamicValue();
        }
        if (args == UNPROVIDED) {
            args = $mapping_gather_key_args$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fn_of_arg = apply(key, gaf_arg(assertion, arg), args);
                if (NIL != fn_of_arg) {
                    {
                        SubLObject item_var = fn_of_arg;
                        if (NIL == member(item_var, $mapping_answer$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            $mapping_answer$.setDynamicValue(cons(item_var, $mapping_answer$.getDynamicValue(thread)), thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gather_fn_of_arg(final SubLObject assertion, SubLObject arg, SubLObject key, SubLObject args) {
        if (arg == UNPROVIDED) {
            arg = $mapping_gather_arg$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = $mapping_gather_key$.getDynamicValue();
        }
        if (args == UNPROVIDED) {
            args = $mapping_gather_key_args$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fn_of_arg = apply(key, assertions_high.gaf_arg(assertion, arg), args);
        if (NIL != fn_of_arg) {
            final SubLObject item_var = fn_of_arg;
            if (NIL == member(item_var, $mapping_answer$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                $mapping_answer$.setDynamicValue(cons(item_var, $mapping_answer$.getDynamicValue(thread)), thread);
            }
        }
        return NIL;
    }

    public static SubLObject declare_kb_mapping_file() {
        declareMacro("do_intermediate_index_relevant_preds", "DO-INTERMEDIATE-INDEX-RELEVANT-PREDS");
        declareMacro("do_intermediate_index_relevant_mts", "DO-INTERMEDIATE-INDEX-RELEVANT-MTS");
        declareMacro("do_intermediate_index_with_direction", "DO-INTERMEDIATE-INDEX-WITH-DIRECTION");
        declareMacro("do_final_index_assertions_with_truth", "DO-FINAL-INDEX-ASSERTIONS-WITH-TRUTH");
        declareFunction("map_gaf_arg_index", "MAP-GAF-ARG-INDEX", 3, 3, false);
        declareFunction("map_predicate_extent_index", "MAP-PREDICATE-EXTENT-INDEX", 2, 2, false);
        declareFunction("map_nart_arg_index", "MAP-NART-ARG-INDEX", 2, 2, false);
        declareFunction("map_function_extent_index", "MAP-FUNCTION-EXTENT-INDEX", 2, 0, false);
        declareFunction("map_predicate_rule_index", "MAP-PREDICATE-RULE-INDEX", 3, 2, false);
        declareFunction("map_decontextualized_ist_predicate_rule_index", "MAP-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 3, 1, false);
        declareFunction("map_isa_rule_index", "MAP-ISA-RULE-INDEX", 3, 2, false);
        declareFunction("map_quoted_isa_rule_index", "MAP-QUOTED-ISA-RULE-INDEX", 3, 2, false);
        declareFunction("map_genls_rule_index", "MAP-GENLS-RULE-INDEX", 3, 2, false);
        declareFunction("map_genl_mt_rule_index", "MAP-GENL-MT-RULE-INDEX", 3, 2, false);
        declareFunction("map_function_rule_index", "MAP-FUNCTION-RULE-INDEX", 2, 2, false);
        declareFunction("map_exception_rule_index", "MAP-EXCEPTION-RULE-INDEX", 2, 2, false);
        declareFunction("map_pragma_rule_index", "MAP-PRAGMA-RULE-INDEX", 2, 2, false);
        declareFunction("map_unbound_predicate_rule_index", "MAP-UNBOUND-PREDICATE-RULE-INDEX", 2, 1, false);
        declareFunction("map_term", "MAP-TERM", 2, 0, false);
        declareFunction("selected_map_term", "SELECTED-MAP-TERM", 2, 2, false);
        declareFunction("map_term_selective", "MAP-TERM-SELECTIVE", 3, 1, false);
        declareFunction("map_term_selective_internal", "MAP-TERM-SELECTIVE-INTERNAL", 1, 0, false);
        declareFunction("map_term_gafs", "MAP-TERM-GAFS", 2, 1, false);
        declareFunction("map_mt_contents", "MAP-MT-CONTENTS", 2, 2, false);
        declareFunction("map_mt_index_internal", "MAP-MT-INDEX-INTERNAL", 4, 0, false);
        declareFunction("assertion_matching_truthP", "ASSERTION-MATCHING-TRUTH?", 1, 0, false);
        declareFunction("map_mt_index", "MAP-MT-INDEX", 2, 2, false);
        declareFunction("map_hlmt_contents", "MAP-HLMT-CONTENTS", 2, 2, false);
        declareFunction("map_hlmt_index", "MAP-HLMT-INDEX", 2, 2, false);
        declareFunction("map_other_index", "MAP-OTHER-INDEX", 2, 2, false);
        declareFunction("gather_index", "GATHER-INDEX", 1, 1, false);
        declareFunction("assertions_mentioning_term", "ASSERTIONS-MENTIONING-TERM", 1, 1, false);
        declareFunction("gafs_mentioning_term", "GAFS-MENTIONING-TERM", 1, 1, false);
        declareFunction("rules_mentioning_term", "RULES-MENTIONING-TERM", 1, 1, false);
        declareFunction("assertions_mentioning_term_int", "ASSERTIONS-MENTIONING-TERM-INT", 3, 0, false);
        declareFunction("gather_index_in_any_mt", "GATHER-INDEX-IN-ANY-MT", 1, 1, false);
        declareFunction("gather_gaf_arg_index", "GATHER-GAF-ARG-INDEX", 2, 3, false);
        declareFunction("gather_gaf_arg_index_with_predicate", "GATHER-GAF-ARG-INDEX-WITH-PREDICATE", 3, 2, false);
        declareFunction("gather_nart_arg_index", "GATHER-NART-ARG-INDEX", 2, 1, false);
        declareFunction("gather_predicate_extent_index", "GATHER-PREDICATE-EXTENT-INDEX", 1, 2, false);
        declareFunction("gather_function_extent_index", "GATHER-FUNCTION-EXTENT-INDEX", 1, 0, false);
        declareFunction("gather_predicate_rule_index", "GATHER-PREDICATE-RULE-INDEX", 2, 2, false);
        declareFunction("gather_predicate_rule_index_in_all_mts", "GATHER-PREDICATE-RULE-INDEX-IN-ALL-MTS", 2, 1, false);
        declareFunction("gather_decontextualized_ist_predicate_rule_index", "GATHER-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 2, 1, false);
        declareFunction("gather_isa_rule_index", "GATHER-ISA-RULE-INDEX", 2, 2, false);
        declareFunction("gather_quoted_isa_rule_index", "GATHER-QUOTED-ISA-RULE-INDEX", 2, 2, false);
        declareFunction("gather_genls_rule_index", "GATHER-GENLS-RULE-INDEX", 2, 2, false);
        declareFunction("gather_genl_mt_rule_index", "GATHER-GENL-MT-RULE-INDEX", 2, 2, false);
        declareFunction("gather_function_rule_index", "GATHER-FUNCTION-RULE-INDEX", 1, 2, false);
        declareFunction("gather_exception_rule_index", "GATHER-EXCEPTION-RULE-INDEX", 1, 2, false);
        declareFunction("gather_pragma_rule_index", "GATHER-PRAGMA-RULE-INDEX", 1, 2, false);
        declareFunction("gather_mt_index", "GATHER-MT-INDEX", 1, 0, false);
        declareFunction("gather_other_index", "GATHER-OTHER-INDEX", 1, 0, false);
        declareFunction("gather_term_assertions", "GATHER-TERM-ASSERTIONS", 1, 1, false);
        declareFunction("all_fort_meta_assertions", "ALL-FORT-META-ASSERTIONS", 1, 0, false);
        declareFunction("mapping_answer_foundP", "MAPPING-ANSWER-FOUND?", 0, 0, false);
        declareFunction("mapping_finishedP", "MAPPING-FINISHED?", 0, 0, false);
        declareFunction("gather_object", "GATHER-OBJECT", 1, 0, false);
        declareFunction("count_object", "COUNT-OBJECT", 1, 0, false);
        declareFunction("assertion_with_search_term", "ASSERTION-WITH-SEARCH-TERM", 1, 0, false);
        new kb_mapping.$assertion_with_search_term$UnaryFunction();
        declareFunction("assertion_without_search_term", "ASSERTION-WITHOUT-SEARCH-TERM", 1, 0, false);
        declareFunction("gather_formula", "GATHER-FORMULA", 1, 0, false);
        declareFunction("gather_assertions", "GATHER-ASSERTIONS", 1, 0, false);
        new kb_mapping.$gather_assertions$UnaryFunction();
        declareFunction("gather_some_assertions", "GATHER-SOME-ASSERTIONS", 1, 0, false);
        declareFunction("gather_unique_assertions", "GATHER-UNIQUE-ASSERTIONS", 1, 0, false);
        declareFunction("gather_meta_assertions", "GATHER-META-ASSERTIONS", 1, 0, false);
        declareFunction("gather_arg", "GATHER-ARG", 1, 2, false);
        declareFunction("gather_fn_of_arg", "GATHER-FN-OF-ARG", 1, 3, false);
        return NIL;
    }

    public static SubLObject init_kb_mapping_file() {
        defparameter("*MAPPING-FUNCTION*", NIL);
        defparameter("*MAPPING-TRUTH*", NIL);
        defparameter("*MAPPING-DIRECTION*", NIL);
        defparameter("*MAP-TERM-SELECTIVE-TEST*", NIL);
        defparameter("*MAP-TERM-SELECTIVE-ACTION*", NIL);
        return NIL;
    }

    public static final SubLObject setup_kb_mapping_file_alt() {
        register_cyc_api_function(MAP_TERM, $list_alt22, $str_alt23$Apply_FUNCTION_to_each_assertion_, $list_alt24, $list_alt25);
        register_cyc_api_function(MAP_TERM_SELECTIVE, $list_alt28, $str_alt29$Apply_FUNCTION_to_each_assertion_, $list_alt30, $list_alt25);
        register_cyc_api_function(MAP_TERM_GAFS, $list_alt32, $str_alt33$Apply_FUNCTION_to_every_gaf_index, $list_alt24, $list_alt25);
        register_cyc_api_function(MAP_MT_CONTENTS, $list_alt38, $str_alt39$Apply_FUNCTION_to_each_assertion_, $list_alt24, $list_alt25);
        register_cyc_api_function(MAP_MT_INDEX, $list_alt41, $str_alt42$Apply_FUNCTION_to_each_assertion_, $list_alt24, $list_alt25);
        register_cyc_api_function(MAP_OTHER_INDEX, $list_alt38, $str_alt44$Apply_FUNCTION_to_each_assertion_, $list_alt24, $list_alt25);
        register_cyc_api_function(GATHER_INDEX, $list_alt48, $str_alt49$Return_a_list_of_all_mt_relevant_, NIL, $list_alt50);
        register_cyc_api_function(GATHER_INDEX_IN_ANY_MT, $list_alt48, $str_alt54$Return_a_list_of_all_assertions_i, NIL, $list_alt50);
        register_cyc_api_function(GATHER_GAF_ARG_INDEX, $list_alt57, $str_alt58$Return_a_list_of_all_gaf_assertio, $list_alt59, $list_alt50);
        define_obsolete_register(GATHER_GAF_ARG_INDEX_WITH_PREDICATE, $list_alt61);
        register_cyc_api_function(GATHER_NART_ARG_INDEX, $list_alt63, $str_alt64$Return_a_list_of_all___termOfUnit, $list_alt59, $list_alt50);
        register_cyc_api_function(GATHER_PREDICATE_EXTENT_INDEX, $list_alt66, $str_alt67$Return_a_list_of_all_gaf_assertio, NIL, $list_alt50);
        register_cyc_api_function(GATHER_FUNCTION_EXTENT_INDEX, $list_alt69, $str_alt70$Return_a_list_of_all___termOfUnit, NIL, $list_alt50);
        register_cyc_api_function(GATHER_PREDICATE_RULE_INDEX, $list_alt72, $str_alt73$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
        register_cyc_api_function(GATHER_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, $list_alt76, $str_alt77$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
        register_cyc_api_function(GATHER_ISA_RULE_INDEX, $list_alt79, $str_alt80$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
        register_cyc_api_function(GATHER_QUOTED_ISA_RULE_INDEX, $list_alt79, $str_alt82$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
        register_cyc_api_function(GATHER_GENLS_RULE_INDEX, $list_alt79, $str_alt84$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
        register_cyc_api_function(GATHER_GENL_MT_RULE_INDEX, $list_alt86, $str_alt87$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
        register_cyc_api_function(GATHER_FUNCTION_RULE_INDEX, $list_alt89, $str_alt90$Return_a_list_of_all_non_gaf_asse, NIL, $list_alt50);
        register_cyc_api_function(GATHER_EXCEPTION_RULE_INDEX, $list_alt92, $str_alt93$Return_a_list_of_all_non_gaf_asse, NIL, $list_alt50);
        register_cyc_api_function(GATHER_PRAGMA_RULE_INDEX, $list_alt92, $str_alt95$Return_a_list_of_all_non_gaf_asse, NIL, $list_alt50);
        register_cyc_api_function(GATHER_MT_INDEX, $list_alt99, $str_alt100$Return_a_list_of_all_assertions_s, NIL, $list_alt50);
        register_cyc_api_function(GATHER_OTHER_INDEX, $list_alt99, $str_alt102$Return_a_list_of_other_assertions, NIL, $list_alt50);
        register_cyc_api_function(GATHER_TERM_ASSERTIONS, $list_alt104, $str_alt105$Return_a_list_of_all_mt_relevant_, NIL, $list_alt50);
        return NIL;
    }

    public static SubLObject setup_kb_mapping_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function(MAP_TERM, $list22, $str23$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
            register_cyc_api_function(MAP_TERM_SELECTIVE, $list28, $str29$Apply_FUNCTION_to_each_assertion_, $list30, $list25);
            register_cyc_api_function(MAP_TERM_GAFS, $list32, $str33$Apply_FUNCTION_to_every_gaf_index, $list24, $list25);
            register_cyc_api_function(MAP_MT_CONTENTS, $list38, $str39$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
            register_cyc_api_function(MAP_MT_INDEX, $list41, $str42$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
            register_cyc_api_function(MAP_HLMT_CONTENTS, $list38, $str39$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
            register_cyc_api_function(MAP_HLMT_INDEX, $list41, $str42$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
            register_cyc_api_function(MAP_OTHER_INDEX, $list38, $str46$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
            register_cyc_api_function(GATHER_INDEX, $list48, $str49$Return_a_list_of_all_mt_relevant_, NIL, $list50);
            register_cyc_api_function(GATHER_INDEX_IN_ANY_MT, $list48, $str56$Return_a_list_of_all_assertions_i, NIL, $list50);
            register_cyc_api_function(GATHER_GAF_ARG_INDEX, $list59, $str60$Return_a_list_of_all_gaf_assertio, $list61, $list50);
            define_obsolete_register(GATHER_GAF_ARG_INDEX_WITH_PREDICATE, $list63);
            register_cyc_api_function(GATHER_NART_ARG_INDEX, $list65, $str66$Return_a_list_of_all___termOfUnit, $list61, $list50);
            register_cyc_api_function(GATHER_PREDICATE_EXTENT_INDEX, $list68, $str69$Return_a_list_of_all_gaf_assertio, NIL, $list50);
            register_cyc_api_function(GATHER_FUNCTION_EXTENT_INDEX, $list71, $str72$Return_a_list_of_all___termOfUnit, NIL, $list50);
            register_cyc_api_function(GATHER_PREDICATE_RULE_INDEX, $list74, $str75$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
            register_cyc_api_function(GATHER_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, $list78, $str79$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
            register_cyc_api_function(GATHER_ISA_RULE_INDEX, $list81, $str82$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
            register_cyc_api_function(GATHER_QUOTED_ISA_RULE_INDEX, $list81, $str84$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
            register_cyc_api_function(GATHER_GENLS_RULE_INDEX, $list81, $str86$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
            register_cyc_api_function(GATHER_GENL_MT_RULE_INDEX, $list88, $str89$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
            register_cyc_api_function(GATHER_FUNCTION_RULE_INDEX, $list91, $str92$Return_a_list_of_all_non_gaf_asse, NIL, $list50);
            register_cyc_api_function(GATHER_EXCEPTION_RULE_INDEX, $list94, $str95$Return_a_list_of_all_non_gaf_asse, NIL, $list50);
            register_cyc_api_function(GATHER_PRAGMA_RULE_INDEX, $list94, $str97$Return_a_list_of_all_non_gaf_asse, NIL, $list50);
            register_cyc_api_function(GATHER_MT_INDEX, $list101, $str102$Return_a_list_of_all_assertions_s, NIL, $list50);
            register_cyc_api_function(GATHER_OTHER_INDEX, $list101, $str104$Return_a_list_of_other_assertions, NIL, $list50);
            register_cyc_api_function(GATHER_TERM_ASSERTIONS, $list106, $str107$Return_a_list_of_all_mt_relevant_, NIL, $list50);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(MAP_OTHER_INDEX, $list_alt38, $str_alt44$Apply_FUNCTION_to_each_assertion_, $list_alt24, $list_alt25);
            register_cyc_api_function(GATHER_INDEX_IN_ANY_MT, $list_alt48, $str_alt54$Return_a_list_of_all_assertions_i, NIL, $list_alt50);
            register_cyc_api_function(GATHER_GAF_ARG_INDEX, $list_alt57, $str_alt58$Return_a_list_of_all_gaf_assertio, $list_alt59, $list_alt50);
            define_obsolete_register(GATHER_GAF_ARG_INDEX_WITH_PREDICATE, $list_alt61);
            register_cyc_api_function(GATHER_NART_ARG_INDEX, $list_alt63, $str_alt64$Return_a_list_of_all___termOfUnit, $list_alt59, $list_alt50);
            register_cyc_api_function(GATHER_PREDICATE_EXTENT_INDEX, $list_alt66, $str_alt67$Return_a_list_of_all_gaf_assertio, NIL, $list_alt50);
            register_cyc_api_function(GATHER_FUNCTION_EXTENT_INDEX, $list_alt69, $str_alt70$Return_a_list_of_all___termOfUnit, NIL, $list_alt50);
            register_cyc_api_function(GATHER_PREDICATE_RULE_INDEX, $list_alt72, $str_alt73$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
            register_cyc_api_function(GATHER_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, $list_alt76, $str_alt77$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
            register_cyc_api_function(GATHER_ISA_RULE_INDEX, $list_alt79, $str_alt80$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
            register_cyc_api_function(GATHER_QUOTED_ISA_RULE_INDEX, $list_alt79, $str_alt82$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
            register_cyc_api_function(GATHER_GENLS_RULE_INDEX, $list_alt79, $str_alt84$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
            register_cyc_api_function(GATHER_GENL_MT_RULE_INDEX, $list_alt86, $str_alt87$Return_a_list_of_all_non_gaf_asse, $list_alt74, $list_alt50);
            register_cyc_api_function(GATHER_FUNCTION_RULE_INDEX, $list_alt89, $str_alt90$Return_a_list_of_all_non_gaf_asse, NIL, $list_alt50);
            register_cyc_api_function(GATHER_EXCEPTION_RULE_INDEX, $list_alt92, $str_alt93$Return_a_list_of_all_non_gaf_asse, NIL, $list_alt50);
            register_cyc_api_function(GATHER_PRAGMA_RULE_INDEX, $list_alt92, $str_alt95$Return_a_list_of_all_non_gaf_asse, NIL, $list_alt50);
            register_cyc_api_function(GATHER_MT_INDEX, $list_alt99, $str_alt100$Return_a_list_of_all_assertions_s, NIL, $list_alt50);
            register_cyc_api_function(GATHER_OTHER_INDEX, $list_alt99, $str_alt102$Return_a_list_of_other_assertions, NIL, $list_alt50);
            register_cyc_api_function(GATHER_TERM_ASSERTIONS, $list_alt104, $str_alt105$Return_a_list_of_all_mt_relevant_, NIL, $list_alt50);
        }
        return NIL;
    }

    public static SubLObject setup_kb_mapping_file_Previous() {
        register_cyc_api_function(MAP_TERM, $list22, $str23$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
        register_cyc_api_function(MAP_TERM_SELECTIVE, $list28, $str29$Apply_FUNCTION_to_each_assertion_, $list30, $list25);
        register_cyc_api_function(MAP_TERM_GAFS, $list32, $str33$Apply_FUNCTION_to_every_gaf_index, $list24, $list25);
        register_cyc_api_function(MAP_MT_CONTENTS, $list38, $str39$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
        register_cyc_api_function(MAP_MT_INDEX, $list41, $str42$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
        register_cyc_api_function(MAP_HLMT_CONTENTS, $list38, $str39$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
        register_cyc_api_function(MAP_HLMT_INDEX, $list41, $str42$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
        register_cyc_api_function(MAP_OTHER_INDEX, $list38, $str46$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
        register_cyc_api_function(GATHER_INDEX, $list48, $str49$Return_a_list_of_all_mt_relevant_, NIL, $list50);
        register_cyc_api_function(GATHER_INDEX_IN_ANY_MT, $list48, $str56$Return_a_list_of_all_assertions_i, NIL, $list50);
        register_cyc_api_function(GATHER_GAF_ARG_INDEX, $list59, $str60$Return_a_list_of_all_gaf_assertio, $list61, $list50);
        define_obsolete_register(GATHER_GAF_ARG_INDEX_WITH_PREDICATE, $list63);
        register_cyc_api_function(GATHER_NART_ARG_INDEX, $list65, $str66$Return_a_list_of_all___termOfUnit, $list61, $list50);
        register_cyc_api_function(GATHER_PREDICATE_EXTENT_INDEX, $list68, $str69$Return_a_list_of_all_gaf_assertio, NIL, $list50);
        register_cyc_api_function(GATHER_FUNCTION_EXTENT_INDEX, $list71, $str72$Return_a_list_of_all___termOfUnit, NIL, $list50);
        register_cyc_api_function(GATHER_PREDICATE_RULE_INDEX, $list74, $str75$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
        register_cyc_api_function(GATHER_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, $list78, $str79$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
        register_cyc_api_function(GATHER_ISA_RULE_INDEX, $list81, $str82$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
        register_cyc_api_function(GATHER_QUOTED_ISA_RULE_INDEX, $list81, $str84$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
        register_cyc_api_function(GATHER_GENLS_RULE_INDEX, $list81, $str86$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
        register_cyc_api_function(GATHER_GENL_MT_RULE_INDEX, $list88, $str89$Return_a_list_of_all_non_gaf_asse, $list76, $list50);
        register_cyc_api_function(GATHER_FUNCTION_RULE_INDEX, $list91, $str92$Return_a_list_of_all_non_gaf_asse, NIL, $list50);
        register_cyc_api_function(GATHER_EXCEPTION_RULE_INDEX, $list94, $str95$Return_a_list_of_all_non_gaf_asse, NIL, $list50);
        register_cyc_api_function(GATHER_PRAGMA_RULE_INDEX, $list94, $str97$Return_a_list_of_all_non_gaf_asse, NIL, $list50);
        register_cyc_api_function(GATHER_MT_INDEX, $list101, $str102$Return_a_list_of_all_assertions_s, NIL, $list50);
        register_cyc_api_function(GATHER_OTHER_INDEX, $list101, $str104$Return_a_list_of_other_assertions, NIL, $list50);
        register_cyc_api_function(GATHER_TERM_ASSERTIONS, $list106, $str107$Return_a_list_of_all_mt_relevant_, NIL, $list50);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_mapping_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_mapping_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_mapping_file();
    }

    static {
    }

    public static final class $assertion_with_search_term$UnaryFunction extends UnaryFunction {
        public $assertion_with_search_term$UnaryFunction() {
            super(extractFunctionNamed("ASSERTION-WITH-SEARCH-TERM"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return assertion_with_search_term(arg1);
        }
    }

    public static final class $gather_assertions$UnaryFunction extends UnaryFunction {
        public $gather_assertions$UnaryFunction() {
            super(extractFunctionNamed("GATHER-ASSERTIONS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return gather_assertions(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("SUBINDEX"), makeSymbol("PRED-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt5 = list(list(makeSymbol("SUBINDEX"), makeSymbol("MT-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt8 = list(list(makeSymbol("SUBINDEX"), makeSymbol("DIRECTION-INDEX"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt12 = list(list(makeSymbol("ASS"), makeSymbol("FINAL-INDEX"), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"));

    static private final SubLString $str_alt23$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion indexed from TERM.");

    static private final SubLList $list_alt24 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")));

    static private final SubLList $list_alt25 = list(makeSymbol("NULL"));

    static private final SubLList $list_alt28 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("TEST"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"));

    static private final SubLString $str_alt29$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.\n  If TRUTH is nil, all assertions are mapped.");

    static private final SubLList $list_alt30 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("TEST"), makeSymbol("FUNCTION-SPEC-P")));

    static private final SubLList $list_alt32 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"));

    static private final SubLString $str_alt33$Apply_FUNCTION_to_every_gaf_index = makeString("Apply FUNCTION to every gaf indexed from TERM.\n   If TRUTH is nil, all assertions are mapped.");

    static private final SubLList $list_alt38 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"), makeSymbol("GAFS-ONLY"));

    static private final SubLString $str_alt39$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion with TRUTH in MT TERM.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");

    static private final SubLList $list_alt41 = list(makeSymbol("FUNCTION"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"), makeSymbol("GAFS-ONLY"));

    static private final SubLString $str_alt42$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion with TRUTH at mt index MT.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");

    static private final SubLString $str_alt44$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion with TRUTH at other index TERM.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");

    static private final SubLString $str_alt45$So_don_t_ = makeString("So don't!");

    static private final SubLString $str_alt46$Can_t_gather_unknown_auxiliary_in = makeString("Can't gather unknown auxiliary index ~s~%");

    static private final SubLList $list_alt48 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("REMOVE-DUPLICATES?"));

    static private final SubLString $str_alt49$Return_a_list_of_all_mt_relevant_ = makeString("Return a list of all mt-relevant assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.");

    static private final SubLList $list_alt50 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));

    static private final SubLString $str_alt54$Return_a_list_of_all_assertions_i = makeString("Return a list of all assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.");

    static private final SubLList $list_alt57 = list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("&OPTIONAL"), makeSymbol("PRED"), makeSymbol("MT"), list(makeSymbol("TRUTH"), $TRUE));

    static private final SubLString $str_alt58$Return_a_list_of_all_gaf_assertio = makeString("Return a list of all gaf assertions such that:\na) TERM is its ARGNUMth argument\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if PRED is non-nil, then PRED must be its predicate\nd) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil).");

    static private final SubLList $list_alt59 = list(list(makeSymbol("ARGNUM"), makeSymbol("POSITIVE-INTEGER-P")));

    static private final SubLList $list_alt61 = list(makeSymbol("GATHER-GAF-ARG-INDEX"));

    static private final SubLList $list_alt63 = list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("&OPTIONAL"), makeSymbol("FUNC"));

    static private final SubLString $str_alt64$Return_a_list_of_all___termOfUnit = makeString("Return a list of all #$termOfUnit assertions with a naut arg2 such that:\na) TERM is its ARGNUMth argument\nb) if FUNC is non-nil, then FUNC must be its functor");

    static private final SubLList $list_alt66 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("TRUTH"), $TRUE));

    static private final SubLString $str_alt67$Return_a_list_of_all_gaf_assertio = makeString("Return a list of all gaf assertions such that:\na) PRED is its predicate\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if MT is non-nil, then MT must be its microtheory.");

    static private final SubLList $list_alt69 = list(makeSymbol("FUNC"));

    static private final SubLString $str_alt70$Return_a_list_of_all___termOfUnit = makeString("Return a list of all #$termOfUnit assertions such that:\nFUNC is the functor of the naut arg2.");

    static private final SubLList $list_alt72 = list(makeSymbol("PRED"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));

    static private final SubLString $str_alt73$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    static private final SubLList $list_alt74 = list(list(makeSymbol("SENSE"), makeSymbol("SENSE-P")));

    static private final SubLList $list_alt76 = list(makeSymbol("PRED"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"));

    static private final SubLString $str_alt77$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    static private final SubLList $list_alt79 = list(makeSymbol("COLLECTION"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));

    static private final SubLString $str_alt80$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    static private final SubLString $str_alt82$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    static private final SubLString $str_alt84$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    static private final SubLList $list_alt86 = list(makeSymbol("GENL-MT"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("RULE-MT"), makeSymbol("DIRECTION"));

    static private final SubLString $str_alt87$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)\nb) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)\nc) if RULE-MT is non-nil, then RULE-MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    static private final SubLList $list_alt89 = list(makeSymbol("FUNC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));

    static private final SubLString $str_alt90$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    static private final SubLList $list_alt92 = list(makeSymbol("RULE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));

    static private final SubLString $str_alt93$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (abnormal <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    static private final SubLString $str_alt95$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");

    static private final SubLList $list_alt99 = list(makeSymbol("TERM"));

    static private final SubLString $str_alt100$Return_a_list_of_all_assertions_s = makeString("Return a list of all assertions such that TERM is its microtheory.");

    static private final SubLString $str_alt102$Return_a_list_of_other_assertions = makeString("Return a list of other assertions mentioning TERM but not indexed in any other more useful manner.");

    static private final SubLList $list_alt104 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt105$Return_a_list_of_all_mt_relevant_ = makeString("Return a list of all mt-relevant assertions of TERM.");
}

/**
 * Total time: 2497 ms
 */
