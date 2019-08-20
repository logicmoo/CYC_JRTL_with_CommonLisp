/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.collection_defns.cycl_var_listP;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$mapping_answer$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_gather_arg$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_formulaP;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_denoting_collectionP;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.literal_variables;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.mt_designating_literalP;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.sentence_denoting_collectionP;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.valid_arity_p;
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
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.unindexed_syntax_constant_p;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_basis_object;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_doneP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_element_validP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_initial_state;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_next;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_update_state;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.rassoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      AT-UTILITIES
 * source file: /cyc/top/cycl/at-utilities.lisp
 * created:     2019/07/03 17:37:34
 */
public final class at_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_generic_arg_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_generic_arg_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject generic_arg_test_case_p(SubLObject generic_arg_test_case) {
        return classes.subloop_instanceof_class(generic_arg_test_case, GENERIC_ARG_TEST_CASE);
    }

    public static final SubLFile me = new at_utilities();



    // defparameter
    /**
     * max number of mts that will be considered while trying to suggest mts in
     * which non-wf formula might be wf
     */
    @LispMethod(comment = "max number of mts that will be considered while trying to suggest mts in\r\nwhich non-wf formula might be wf\ndefparameter\nmax number of mts that will be considered while trying to suggest mts in\nwhich non-wf formula might be wf")
    private static final SubLSymbol $mts_cutoff_for_mts_accommodating_formula_wrt_types$ = makeSymbol("*MTS-CUTOFF-FOR-MTS-ACCOMMODATING-FORMULA-WRT-TYPES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $max_floor_mts_of_nat_exceptions$ = makeSymbol("*MAX-FLOOR-MTS-OF-NAT-EXCEPTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $max_floor_mts_of_nat_recursionP$ = makeSymbol("*MAX-FLOOR-MTS-OF-NAT-RECURSION?*");











    public static final SubLSymbol $generic_arg_store$ = makeSymbol("*GENERIC-ARG-STORE*");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLString $$$ARG = makeString("ARG");

    private static final SubLString $str8$_S = makeString("~S");

    private static final SubLObject $$interArgIsa1_2 = reader_make_constant_shell("interArgIsa1-2");

    private static final SubLObject $$interArgIsa1_3 = reader_make_constant_shell("interArgIsa1-3");

    private static final SubLObject $$interArgIsa1_4 = reader_make_constant_shell("interArgIsa1-4");

    private static final SubLObject $$interArgIsa1_5 = reader_make_constant_shell("interArgIsa1-5");

    private static final SubLString $str13$invalid_arg_isa_pred_index___s__s = makeString("invalid arg-isa-pred index: ~s-~s");

    private static final SubLObject $$interArgIsa2_1 = reader_make_constant_shell("interArgIsa2-1");

    private static final SubLObject $$interArgIsa2_3 = reader_make_constant_shell("interArgIsa2-3");

    private static final SubLObject $$interArgIsa2_4 = reader_make_constant_shell("interArgIsa2-4");

    private static final SubLObject $$interArgIsa2_5 = reader_make_constant_shell("interArgIsa2-5");

    private static final SubLObject $$interArgIsa3_1 = reader_make_constant_shell("interArgIsa3-1");

    private static final SubLObject $$interArgIsa3_2 = reader_make_constant_shell("interArgIsa3-2");

    private static final SubLObject $$interArgIsa3_4 = reader_make_constant_shell("interArgIsa3-4");

    private static final SubLObject $$interArgIsa3_5 = reader_make_constant_shell("interArgIsa3-5");

    private static final SubLObject $$interArgIsa4_1 = reader_make_constant_shell("interArgIsa4-1");

    private static final SubLObject $$interArgIsa4_2 = reader_make_constant_shell("interArgIsa4-2");

    private static final SubLObject $$interArgIsa4_3 = reader_make_constant_shell("interArgIsa4-3");

    private static final SubLObject $$interArgIsa4_5 = reader_make_constant_shell("interArgIsa4-5");

    private static final SubLObject $$interArgIsa5_1 = reader_make_constant_shell("interArgIsa5-1");

    private static final SubLObject $$interArgIsa5_2 = reader_make_constant_shell("interArgIsa5-2");

    private static final SubLObject $$interArgIsa5_3 = reader_make_constant_shell("interArgIsa5-3");

    private static final SubLObject $$interArgIsa5_4 = reader_make_constant_shell("interArgIsa5-4");

    private static final SubLList $list30 = list(ONE_INTEGER, TWO_INTEGER);

    private static final SubLObject $$interArgNotIsa1_2 = reader_make_constant_shell("interArgNotIsa1-2");

    private static final SubLObject $$interArgNotIsa1_3 = reader_make_constant_shell("interArgNotIsa1-3");

    private static final SubLObject $$interArgNotIsa1_4 = reader_make_constant_shell("interArgNotIsa1-4");

    private static final SubLObject $$interArgNotIsa1_5 = reader_make_constant_shell("interArgNotIsa1-5");

    private static final SubLString $str35$invalid_arg_not_isa_pred_index___ = makeString("invalid arg-not-isa-pred index: ~s-~s");

    private static final SubLObject $$interArgNotIsa2_3 = reader_make_constant_shell("interArgNotIsa2-3");

    private static final SubLObject $$interArgNotIsa2_4 = reader_make_constant_shell("interArgNotIsa2-4");

    private static final SubLObject $$interArgNotIsa2_5 = reader_make_constant_shell("interArgNotIsa2-5");

    private static final SubLObject $$interArgNotIsa3_4 = reader_make_constant_shell("interArgNotIsa3-4");

    private static final SubLObject $$interArgNotIsa3_5 = reader_make_constant_shell("interArgNotIsa3-5");

    private static final SubLObject $$interArgNotIsa4_5 = reader_make_constant_shell("interArgNotIsa4-5");

    private static final SubLObject $$interArgGenl1_2 = reader_make_constant_shell("interArgGenl1-2");

    private static final SubLString $str43$invalid_arg_genl_pred_index___s__ = makeString("invalid arg-genl-pred index: ~s-~s");

    private static final SubLObject $$interArgGenl2_1 = reader_make_constant_shell("interArgGenl2-1");

    private static final SubLObject $$interArgGenl2_4 = reader_make_constant_shell("interArgGenl2-4");

    private static final SubLObject $$interArgNotGenl1_2 = reader_make_constant_shell("interArgNotGenl1-2");

    private static final SubLString $str47$invalid_arg_not_genl_pred_index__ = makeString("invalid arg-not-genl-pred index: ~s-~s");

    private static final SubLObject $$interArgIsaGenl1_2 = reader_make_constant_shell("interArgIsaGenl1-2");

    private static final SubLString $str49$invalid_arg_isa_genl_pred_index__ = makeString("invalid arg-isa-genl-pred index: ~s-~s");

    private static final SubLObject $$interArgIsaGenl2_1 = reader_make_constant_shell("interArgIsaGenl2-1");

    private static final SubLObject $$interArgIsaGenl2_3 = reader_make_constant_shell("interArgIsaGenl2-3");

    private static final SubLObject $$interArgIsaGenl3_2 = reader_make_constant_shell("interArgIsaGenl3-2");

    private static final SubLString $str53$invalid_arg_genl_isa_pred_index__ = makeString("invalid arg-genl-isa-pred index: ~s-~s");

    private static final SubLObject $$interArgGenlIsa2_1 = reader_make_constant_shell("interArgGenlIsa2-1");





















    private static final SubLSymbol TREE_POSITION_P = makeSymbol("TREE-POSITION-P");

    private static final SubLSymbol $sym70$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");

    private static final SubLSymbol RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");

    private static final SubLSymbol GATHER_VIA_MAP_PRED_INDEX = makeSymbol("GATHER-VIA-MAP-PRED-INDEX");

    private static final SubLSymbol GATHER_ASSERTIONS = makeSymbol("GATHER-ASSERTIONS");

    private static final SubLSymbol $some_inter_arg_isa_assertion_somewhere_cache$ = makeSymbol("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*");



    private static final SubLString $str79$Initializing___interArgIsa_cache = makeString("Initializing #$interArgIsa cache");

    private static final SubLString $$$cdolist = makeString("cdolist");



    private static final SubLString $str88$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str93$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str94$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str95$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str96$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol $some_inter_arg_format_assertion_somewhere_cache$ = makeSymbol("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*");

    private static final SubLString $str98$Initializing___interArgFormat_cac = makeString("Initializing #$interArgFormat cache");





    private static final SubLString $str101$got_an_arg_type_predicate___s__th = makeString("got an arg-type predicate (~s) that's neither binary nor ternary in ~s");

    private static final SubLSymbol $AT_MAPPING_DONE = makeKeyword("AT-MAPPING-DONE");

    private static final SubLSymbol AT_ERROR = makeSymbol("AT-ERROR");

    private static final SubLSymbol AT_NOTE = makeSymbol("AT-NOTE");

    private static final SubLString $str107$__at_test_fails___s_fails__s_cons = makeString("~%at test fails: ~s fails ~s constraint ~s");

    private static final SubLString $str108$__at_test_fails___s_fails__s_cons = makeString("~%at test fails: ~s fails ~s constraint ~s for arg ~s of reln ~s");

    private static final SubLSymbol $ANTI_SYMMETRIC_PREDICATE = makeKeyword("ANTI-SYMMETRIC-PREDICATE");

    private static final SubLSymbol $ANTI_TRANSITIVE_PREDICATE = makeKeyword("ANTI-TRANSITIVE-PREDICATE");

    private static final SubLString $str115$illegal_value_of__at_mode____s = makeString("illegal value of *at-mode*: ~s");

    private static final SubLSymbol $PREDICATE_ISA_VIOLATION = makeKeyword("PREDICATE-ISA-VIOLATION");

    private static final SubLSymbol $META_PREDICATE_VIOLATION = makeKeyword("META-PREDICATE-VIOLATION");

    private static final SubLSymbol $MAL_ARG_WRT_COL_DEFN = makeKeyword("MAL-ARG-WRT-COL-DEFN");

    private static final SubLObject $$CycLSentence_Assertible = reader_make_constant_shell("CycLSentence-Assertible");

    private static final SubLSymbol $MAL_ARG_WRT_NEC_DEFN = makeKeyword("MAL-ARG-WRT-NEC-DEFN");

    private static final SubLSymbol $sym122$ASSERTION_ARG_VIOLATION_ = makeSymbol("ASSERTION-ARG-VIOLATION?");

    private static final SubLSymbol $sym123$SEF_VIOLATION_ = makeSymbol("SEF-VIOLATION?");

    private static final SubLSymbol $sym124$PREDICATE_VIOLATION_ = makeSymbol("PREDICATE-VIOLATION?");

    private static final SubLSymbol $MAL_ARG_WRT_IFF_DEFN = makeKeyword("MAL-ARG-WRT-IFF-DEFN");

    private static final SubLList $list126 = listS(makeSymbol("ARG"), new SubLObject[]{ makeSymbol("RELN"), makeSymbol("ARGNUM"), makeSymbol("COL"), makeSymbol("DEFN"), makeSymbol("MT"), makeSymbol("DATA") });

    private static final SubLSymbol CYC_ASSERTION = makeSymbol("CYC-ASSERTION");



    private static final SubLSymbol $MAL_ARG_WRT_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-ARG-FORMAT");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");



    private static final SubLList $list133 = list(makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA"));



    private static final SubLList $list136 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("IND-ARG-ISA"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    private static final SubLList $list137 = list(makeSymbol("PREDICATE"), makeSymbol("ISA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIOLATIONS"));



    private static final SubLSymbol $sym141$_ = makeSymbol(">");

    private static final SubLSymbol SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");

    private static final SubLSymbol CACHED_MAX_FLOOR_MTS_OF_NAT = makeSymbol("CACHED-MAX-FLOOR-MTS-OF-NAT");

    private static final SubLSymbol $cached_max_floor_mts_of_nat_caching_state$ = makeSymbol("*CACHED-MAX-FLOOR-MTS-OF-NAT-CACHING-STATE*");







    private static final SubLString $str151$___S_____S_____s__ = makeString("~&~S~%  ~S~%  ~s~%");

    private static final SubLString $$$mapping_Cyc_arguments = makeString("mapping Cyc arguments");



    private static final SubLObject $$Function_Denotational = reader_make_constant_shell("Function-Denotational");



    private static final SubLObject $const159$AtemporalNecessarilyEssentialColl = reader_make_constant_shell("AtemporalNecessarilyEssentialCollectionType");





    private static final SubLSymbol VARIABLE_ARITY_RELATION_P = makeSymbol("VARIABLE-ARITY-RELATION-P");





    private static final SubLSymbol RELATION_P = makeSymbol("RELATION-P");



    private static final SubLList $list169 = list(reader_make_constant_shell("Relation"));

    private static final SubLSymbol $sym170$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLSymbol VARIABLE_BINDING_SET_ITEM_COMPARATOR = makeSymbol("VARIABLE-BINDING-SET-ITEM-COMPARATOR");

    private static final SubLFloat $float$0_01 = makeDouble(0.01);

    private static final SubLObject $$Number_General = reader_make_constant_shell("Number-General");

    private static final SubLSymbol ALL_RELATION_CONSTRAINT_SENTENCES = makeSymbol("ALL-RELATION-CONSTRAINT-SENTENCES");

    private static final SubLList $list182 = list(list(list(reader_make_constant_shell("isa")), list(list(reader_make_constant_shell("arity"), reader_make_constant_shell("isa"), TWO_INTEGER), list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("isa"), ONE_INTEGER, reader_make_constant_shell("Thing")), list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("isa"), TWO_INTEGER, reader_make_constant_shell("Collection")), list(reader_make_constant_shell("argGenl"), reader_make_constant_shell("isa"), TWO_INTEGER, reader_make_constant_shell("Thing")))), list(list(reader_make_constant_shell("PlusFn")), list(list(reader_make_constant_shell("arityMin"), reader_make_constant_shell("PlusFn"), ONE_INTEGER), list(reader_make_constant_shell("argsIsa"), reader_make_constant_shell("PlusFn"), reader_make_constant_shell("ScalarInterval")))), list(list(reader_make_constant_shell("GramsPerLiter")), list(list(reader_make_constant_shell("arityMin"), reader_make_constant_shell("GramsPerLiter"), ONE_INTEGER), list(reader_make_constant_shell("arityMax"), reader_make_constant_shell("GramsPerLiter"), TWO_INTEGER), list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("GramsPerLiter"), ONE_INTEGER, reader_make_constant_shell("NumericInterval")), list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("GramsPerLiter"), TWO_INTEGER, reader_make_constant_shell("NumericInterval")))));

    private static final SubLSymbol ALL_RELATION_ARG_CONSTRAINT_SENTENCES = makeSymbol("ALL-RELATION-ARG-CONSTRAINT-SENTENCES");

    private static final SubLList $list185 = list(list(list(reader_make_constant_shell("isa")), list(list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("isa"), ONE_INTEGER, reader_make_constant_shell("Thing")), list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("isa"), TWO_INTEGER, reader_make_constant_shell("Collection")), list(reader_make_constant_shell("argGenl"), reader_make_constant_shell("isa"), TWO_INTEGER, reader_make_constant_shell("Thing")))));

    private static final SubLSymbol FORMULA_ARG_CONSTRAINTS_CYCL = makeSymbol("FORMULA-ARG-CONSTRAINTS-CYCL");

    private static final SubLList $list187 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), makeSymbol("?X"))), list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("genls"), makeSymbol("?X"), reader_make_constant_shell("Thing")))));

    private static final SubLString $str188$Arg_Type_Utilities_Test_Suite = makeString("Arg-Type Utilities Test Suite");

    private static final SubLList $list189 = list(makeSymbol("GENERIC-ARG-TEST-CASE"));

    // Definitions
    /**
     *
     *
     * @return predicate-p. Returns the arg<N>Isa predicate for given N.
     */
    @LispMethod(comment = "@return predicate-p. Returns the arg<N>Isa predicate for given N.")
    public static final SubLObject arg_n_predicate_alt(SubLObject n) {
        {
            SubLObject pcase_var = n;
            if (pcase_var.eql(ONE_INTEGER)) {
                return $$arg1Isa;
            } else {
                if (pcase_var.eql(TWO_INTEGER)) {
                    return $$arg2Isa;
                } else {
                    if (pcase_var.eql(THREE_INTEGER)) {
                        return $$arg3Isa;
                    } else {
                        if (pcase_var.eql(FOUR_INTEGER)) {
                            return $$arg4Isa;
                        } else {
                            if (pcase_var.eql(FIVE_INTEGER)) {
                                return $$arg5Isa;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    /**
     *
     *
     * @return predicate-p. Returns the arg<N>Isa predicate for given N.
     */
    @LispMethod(comment = "@return predicate-p. Returns the arg<N>Isa predicate for given N.")
    public static SubLObject arg_n_predicate(final SubLObject n) {
        if (n.eql(ONE_INTEGER)) {
            return $$arg1Isa;
        }
        if (n.eql(TWO_INTEGER)) {
            return $$arg2Isa;
        }
        if (n.eql(THREE_INTEGER)) {
            return $$arg3Isa;
        }
        if (n.eql(FOUR_INTEGER)) {
            return $$arg4Isa;
        }
        if (n.eql(FIVE_INTEGER)) {
            return $$arg5Isa;
        }
        return NIL;
    }

    public static final SubLObject arg_type_mt_alt(SubLObject relation, SubLObject args, SubLObject argnum, SubLObject mt) {
        if ((argnum.numE(TWO_INTEGER) && (NIL != fort_types_interface.mtP(args.first()))) && (NIL != term.mt_designating_relationP(relation))) {
            return args.first();
        } else {
            return mt;
        }
    }

    public static SubLObject arg_type_mt(final SubLObject relation, final SubLObject args, final SubLObject argnum, final SubLObject mt) {
        if ((argnum.numE(TWO_INTEGER) && (NIL != fort_types_interface.mtP(args.first()))) && (NIL != term.mt_designating_relationP(relation))) {
            return args.first();
        }
        return mt;
    }

    public static final SubLObject find_generic_arg_by_id_alt(SubLObject number) {
        return list_utilities.alist_lookup_without_values($generic_arg_store$.getGlobalValue(), number, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject find_generic_arg_by_id(final SubLObject number) {
        return list_utilities.alist_lookup_without_values($generic_arg_store$.getGlobalValue(), number, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject find_generic_arg_id_alt(SubLObject generic_arg) {
        return rassoc(generic_arg, $generic_arg_store$.getGlobalValue(), symbol_function(EQ), UNPROVIDED).first();
    }

    public static SubLObject find_generic_arg_id(final SubLObject generic_arg) {
        return rassoc(generic_arg, $generic_arg_store$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED).first();
    }

    public static final SubLObject store_generic_arg_alt(SubLObject v_new, SubLObject number) {
        $generic_arg_store$.setGlobalValue(list_utilities.alist_enter($generic_arg_store$.getGlobalValue(), number, v_new, UNPROVIDED));
        return v_new;
    }

    public static SubLObject store_generic_arg(final SubLObject v_new, final SubLObject number) {
        $generic_arg_store$.setGlobalValue(list_utilities.alist_enter($generic_arg_store$.getGlobalValue(), number, v_new, UNPROVIDED));
        return v_new;
    }

    public static final SubLObject stored_generic_arg_p_alt(SubLObject v_object) {
        return list_utilities.sublisp_boolean(rassoc(v_object, $generic_arg_store$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
    }

    public static SubLObject stored_generic_arg_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(rassoc(v_object, $generic_arg_store$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED));
    }

    /**
     *
     *
     * @return keyword; a keyword of the form :argNUMBER
     */
    @LispMethod(comment = "@return keyword; a keyword of the form :argNUMBER")
    public static final SubLObject get_generic_arg_alt(SubLObject number) {
        {
            SubLObject generic_arg_from_lookup = com.cyc.cycjava.cycl.at_utilities.find_generic_arg_by_id(number);
            if (generic_arg_from_lookup.isKeyword()) {
                return generic_arg_from_lookup;
            } else {
                {
                    SubLObject v_new = make_keyword(cconcatenate($$$ARG, format(NIL, $str_alt7$_S, number)));
                    com.cyc.cycjava.cycl.at_utilities.store_generic_arg(v_new, number);
                    return v_new;
                }
            }
        }
    }

    /**
     *
     *
     * @return keyword; a keyword of the form :argNUMBER
     */
    @LispMethod(comment = "@return keyword; a keyword of the form :argNUMBER")
    public static SubLObject get_generic_arg(final SubLObject number) {
        final SubLObject generic_arg_from_lookup = find_generic_arg_by_id(number);
        if (generic_arg_from_lookup.isKeyword()) {
            return generic_arg_from_lookup;
        }
        final SubLObject v_new = make_keyword(cconcatenate($$$ARG, format(NIL, $str8$_S, number)));
        store_generic_arg(v_new, number);
        return v_new;
    }

    /**
     *
     *
     * @return object; an integer N if OBJECT is a keyword of the form :argN, where N is some sequence of digits, or NIL if OBJECT is not of that form.
     */
    @LispMethod(comment = "@return object; an integer N if OBJECT is a keyword of the form :argN, where N is some sequence of digits, or NIL if OBJECT is not of that form.")
    public static final SubLObject generic_arg_num_alt(SubLObject v_object) {
        if (NIL == com.cyc.cycjava.cycl.at_utilities.generic_argP(v_object)) {
            return NIL;
        } else {
            if (NIL != com.cyc.cycjava.cycl.at_utilities.stored_generic_arg_p(v_object)) {
                return com.cyc.cycjava.cycl.at_utilities.find_generic_arg_id(v_object);
            } else {
                {
                    SubLObject argnum = string_utilities.substring(symbol_name(v_object), THREE_INTEGER, UNPROVIDED);
                    SubLObject num = read_from_string(argnum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject generic_argP = integerp(num);
                    if (NIL != generic_argP) {
                        com.cyc.cycjava.cycl.at_utilities.store_generic_arg(v_object, num);
                    }
                    return generic_argP;
                }
            }
        }
    }

    /**
     *
     *
     * @return object; an integer N if OBJECT is a keyword of the form :argN, where N is some sequence of digits, or NIL if OBJECT is not of that form.
     */
    @LispMethod(comment = "@return object; an integer N if OBJECT is a keyword of the form :argN, where N is some sequence of digits, or NIL if OBJECT is not of that form.")
    public static SubLObject generic_arg_num(final SubLObject v_object) {
        if (NIL == generic_argP(v_object)) {
            return NIL;
        }
        if (NIL != stored_generic_arg_p(v_object)) {
            return find_generic_arg_id(v_object);
        }
        final SubLObject argnum = string_utilities.substring(symbol_name(v_object), THREE_INTEGER, UNPROVIDED);
        final SubLObject num = read_from_string(argnum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject generic_argP = integerp(num);
        if (NIL != generic_argP) {
            store_generic_arg(v_object, num);
        }
        return generic_argP;
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJECT a generic arg keyword?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJECT a generic arg keyword?")
    public static final SubLObject generic_argP_alt(SubLObject v_object) {
        if (!v_object.isKeyword()) {
            return NIL;
        } else {
            if (NIL != com.cyc.cycjava.cycl.at_utilities.stored_generic_arg_p(v_object)) {
                return T;
            } else {
                if (NIL != list_utilities.lengthLE(symbol_name(v_object), THREE_INTEGER, UNPROVIDED)) {
                    return NIL;
                }
            }
        }
        {
            SubLObject name = symbol_name(v_object);
            SubLObject arg = string_utilities.substring(name, ZERO_INTEGER, THREE_INTEGER);
            SubLObject argnum_string = string_utilities.substring(name, THREE_INTEGER, UNPROVIDED);
            SubLObject generic_argP = makeBoolean($$$ARG.equalp(arg) && (NIL != string_utilities.digit_stringP(argnum_string)));
            if (NIL != generic_argP) {
                com.cyc.cycjava.cycl.at_utilities.store_generic_arg(v_object, read_from_string(argnum_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
            return generic_argP;
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJECT a generic arg keyword?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJECT a generic arg keyword?")
    public static SubLObject generic_argP(final SubLObject v_object) {
        if (!v_object.isKeyword()) {
            return NIL;
        }
        if (NIL != stored_generic_arg_p(v_object)) {
            return T;
        }
        if (NIL != list_utilities.lengthLE(symbol_name(v_object), THREE_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject name = symbol_name(v_object);
        final SubLObject arg = string_utilities.substring(name, ZERO_INTEGER, THREE_INTEGER);
        final SubLObject argnum_string = string_utilities.substring(name, THREE_INTEGER, UNPROVIDED);
        final SubLObject generic_argP = makeBoolean($$$ARG.equalp(arg) && (NIL != string_utilities.digit_stringP(argnum_string)));
        if (NIL != generic_argP) {
            store_generic_arg(v_object, read_from_string(argnum_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return generic_argP;
    }

    public static final SubLObject inter_arg_isa_pred_alt(SubLObject ind_arg, SubLObject dep_arg) {
        {
            SubLObject pcase_var = ind_arg;
            if (pcase_var.eql(ONE_INTEGER)) {
                {
                    SubLObject pcase_var_1 = dep_arg;
                    if (pcase_var_1.eql(TWO_INTEGER)) {
                        return $$interArgIsa1_2;
                    } else {
                        if (pcase_var_1.eql(THREE_INTEGER)) {
                            return $$interArgIsa1_3;
                        } else {
                            if (pcase_var_1.eql(FOUR_INTEGER)) {
                                return $$interArgIsa1_4;
                            } else {
                                if (pcase_var_1.eql(FIVE_INTEGER)) {
                                    return $$interArgIsa1_5;
                                } else {
                                    el_error(THREE_INTEGER, $str_alt12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            } else {
                if (pcase_var.eql(TWO_INTEGER)) {
                    {
                        SubLObject pcase_var_2 = dep_arg;
                        if (pcase_var_2.eql(ONE_INTEGER)) {
                            return $$interArgIsa2_1;
                        } else {
                            if (pcase_var_2.eql(THREE_INTEGER)) {
                                return $$interArgIsa2_3;
                            } else {
                                if (pcase_var_2.eql(FOUR_INTEGER)) {
                                    return $$interArgIsa2_4;
                                } else {
                                    if (pcase_var_2.eql(FIVE_INTEGER)) {
                                        return $$interArgIsa2_5;
                                    } else {
                                        el_error(THREE_INTEGER, $str_alt12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql(THREE_INTEGER)) {
                        {
                            SubLObject pcase_var_3 = dep_arg;
                            if (pcase_var_3.eql(ONE_INTEGER)) {
                                return $$interArgIsa3_1;
                            } else {
                                if (pcase_var_3.eql(TWO_INTEGER)) {
                                    return $$interArgIsa3_2;
                                } else {
                                    if (pcase_var_3.eql(FOUR_INTEGER)) {
                                        return $$interArgIsa3_4;
                                    } else {
                                        if (pcase_var_3.eql(FIVE_INTEGER)) {
                                            return $$interArgIsa3_5;
                                        } else {
                                            el_error(THREE_INTEGER, $str_alt12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql(FOUR_INTEGER)) {
                            {
                                SubLObject pcase_var_4 = dep_arg;
                                if (pcase_var_4.eql(ONE_INTEGER)) {
                                    return $$interArgIsa4_1;
                                } else {
                                    if (pcase_var_4.eql(TWO_INTEGER)) {
                                        return $$interArgIsa4_2;
                                    } else {
                                        if (pcase_var_4.eql(THREE_INTEGER)) {
                                            return $$interArgIsa4_3;
                                        } else {
                                            if (pcase_var_4.eql(FIVE_INTEGER)) {
                                                return $$interArgIsa4_5;
                                            } else {
                                                el_error(THREE_INTEGER, $str_alt12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql(FIVE_INTEGER)) {
                                {
                                    SubLObject pcase_var_5 = dep_arg;
                                    if (pcase_var_5.eql(ONE_INTEGER)) {
                                        return $$interArgIsa5_1;
                                    } else {
                                        if (pcase_var_5.eql(TWO_INTEGER)) {
                                            return $$interArgIsa5_2;
                                        } else {
                                            if (pcase_var_5.eql(THREE_INTEGER)) {
                                                return $$interArgIsa5_3;
                                            } else {
                                                if (pcase_var_5.eql(FOUR_INTEGER)) {
                                                    return $$interArgIsa5_4;
                                                } else {
                                                    el_error(THREE_INTEGER, $str_alt12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                el_error(THREE_INTEGER, $str_alt12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject inter_arg_isa_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            if (dep_arg.eql(TWO_INTEGER)) {
                return $$interArgIsa1_2;
            }
            if (dep_arg.eql(THREE_INTEGER)) {
                return $$interArgIsa1_3;
            }
            if (dep_arg.eql(FOUR_INTEGER)) {
                return $$interArgIsa1_4;
            }
            if (dep_arg.eql(FIVE_INTEGER)) {
                return $$interArgIsa1_5;
            }
            el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                if (dep_arg.eql(ONE_INTEGER)) {
                    return $$interArgIsa2_1;
                }
                if (dep_arg.eql(THREE_INTEGER)) {
                    return $$interArgIsa2_3;
                }
                if (dep_arg.eql(FOUR_INTEGER)) {
                    return $$interArgIsa2_4;
                }
                if (dep_arg.eql(FIVE_INTEGER)) {
                    return $$interArgIsa2_5;
                }
                el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    if (dep_arg.eql(ONE_INTEGER)) {
                        return $$interArgIsa3_1;
                    }
                    if (dep_arg.eql(TWO_INTEGER)) {
                        return $$interArgIsa3_2;
                    }
                    if (dep_arg.eql(FOUR_INTEGER)) {
                        return $$interArgIsa3_4;
                    }
                    if (dep_arg.eql(FIVE_INTEGER)) {
                        return $$interArgIsa3_5;
                    }
                    el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        if (dep_arg.eql(ONE_INTEGER)) {
                            return $$interArgIsa4_1;
                        }
                        if (dep_arg.eql(TWO_INTEGER)) {
                            return $$interArgIsa4_2;
                        }
                        if (dep_arg.eql(THREE_INTEGER)) {
                            return $$interArgIsa4_3;
                        }
                        if (dep_arg.eql(FIVE_INTEGER)) {
                            return $$interArgIsa4_5;
                        }
                        el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            if (dep_arg.eql(ONE_INTEGER)) {
                                return $$interArgIsa5_1;
                            }
                            if (dep_arg.eql(TWO_INTEGER)) {
                                return $$interArgIsa5_2;
                            }
                            if (dep_arg.eql(THREE_INTEGER)) {
                                return $$interArgIsa5_3;
                            }
                            if (dep_arg.eql(FOUR_INTEGER)) {
                                return $$interArgIsa5_4;
                            }
                            el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    /**
     * Returns the appropriate inter-arg-isa predicate for constraining the inverse of IND-ARG and DEP-ARG .
     */
    @LispMethod(comment = "Returns the appropriate inter-arg-isa predicate for constraining the inverse of IND-ARG and DEP-ARG .")
    public static final SubLObject inter_arg_isa_inverse_alt(SubLObject ind_arg, SubLObject dep_arg) {
        if ((NIL != subl_promotions.memberP(ind_arg, $list_alt29, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(dep_arg, $list_alt29, UNPROVIDED, UNPROVIDED))) {
            return com.cyc.cycjava.cycl.at_utilities.inter_arg_isa_pred(dep_arg, ind_arg);
        }
        return NIL;
    }

    /**
     * Returns the appropriate inter-arg-isa predicate for constraining the inverse of IND-ARG and DEP-ARG .
     */
    @LispMethod(comment = "Returns the appropriate inter-arg-isa predicate for constraining the inverse of IND-ARG and DEP-ARG .")
    public static SubLObject inter_arg_isa_inverse(final SubLObject ind_arg, final SubLObject dep_arg) {
        if ((NIL != subl_promotions.memberP(ind_arg, $list30, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(dep_arg, $list30, UNPROVIDED, UNPROVIDED))) {
            return inter_arg_isa_pred(dep_arg, ind_arg);
        }
        return NIL;
    }

    public static final SubLObject inter_arg_not_isa_pred_alt(SubLObject ind_arg, SubLObject dep_arg) {
        {
            SubLObject pcase_var = ind_arg;
            if (pcase_var.eql(ONE_INTEGER)) {
                {
                    SubLObject pcase_var_6 = dep_arg;
                    if (pcase_var_6.eql(TWO_INTEGER)) {
                        return $$interArgNotIsa1_2;
                    } else {
                        el_error(THREE_INTEGER, $str_alt31$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                    }
                }
            } else {
                if (pcase_var.eql(TWO_INTEGER)) {
                    {
                        SubLObject pcase_var_7 = dep_arg;
                        if (pcase_var_7.eql(ONE_INTEGER)) {
                            return $$interArgNotIsa2_1;
                        } else {
                            el_error(THREE_INTEGER, $str_alt31$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                        }
                    }
                } else {
                    if (pcase_var.eql(THREE_INTEGER)) {
                        {
                            SubLObject pcase_var_8 = dep_arg;
                            el_error(THREE_INTEGER, $str_alt31$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                        }
                    } else {
                        if (pcase_var.eql(FOUR_INTEGER)) {
                            {
                                SubLObject pcase_var_9 = dep_arg;
                                el_error(THREE_INTEGER, $str_alt31$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                            }
                        } else {
                            if (pcase_var.eql(FIVE_INTEGER)) {
                                {
                                    SubLObject pcase_var_10 = dep_arg;
                                    el_error(THREE_INTEGER, $str_alt31$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                                }
                            } else {
                                el_error(THREE_INTEGER, $str_alt12$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject inter_arg_not_isa_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            if (dep_arg.eql(TWO_INTEGER)) {
                return $$interArgNotIsa1_2;
            }
            if (dep_arg.eql(THREE_INTEGER)) {
                return $$interArgNotIsa1_3;
            }
            if (dep_arg.eql(FOUR_INTEGER)) {
                return $$interArgNotIsa1_4;
            }
            if (dep_arg.eql(FIVE_INTEGER)) {
                return $$interArgNotIsa1_5;
            }
            el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                if (dep_arg.eql(THREE_INTEGER)) {
                    return $$interArgNotIsa2_3;
                }
                if (dep_arg.eql(FOUR_INTEGER)) {
                    return $$interArgNotIsa2_4;
                }
                if (dep_arg.eql(FIVE_INTEGER)) {
                    return $$interArgNotIsa2_5;
                }
                el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    if (dep_arg.eql(FOUR_INTEGER)) {
                        return $$interArgNotIsa3_4;
                    }
                    if (dep_arg.eql(FIVE_INTEGER)) {
                        return $$interArgNotIsa3_5;
                    }
                    el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        if (dep_arg.eql(FIVE_INTEGER)) {
                            return $$interArgNotIsa4_5;
                        }
                        el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    /**
     * Returns the appropriate inter-arg-not-isa predicate for constraining the inverse of IND-ARG and DEP-ARG .
     */
    @LispMethod(comment = "Returns the appropriate inter-arg-not-isa predicate for constraining the inverse of IND-ARG and DEP-ARG .")
    public static final SubLObject inter_arg_not_isa_inverse_alt(SubLObject ind_arg, SubLObject dep_arg) {
        if ((NIL != subl_promotions.memberP(ind_arg, $list_alt29, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(dep_arg, $list_alt29, UNPROVIDED, UNPROVIDED))) {
            return com.cyc.cycjava.cycl.at_utilities.inter_arg_not_isa_pred(dep_arg, ind_arg);
        }
        return NIL;
    }

    /**
     * Returns the appropriate inter-arg-not-isa predicate for constraining the inverse of IND-ARG and DEP-ARG .
     */
    @LispMethod(comment = "Returns the appropriate inter-arg-not-isa predicate for constraining the inverse of IND-ARG and DEP-ARG .")
    public static SubLObject inter_arg_not_isa_inverse(final SubLObject ind_arg, final SubLObject dep_arg) {
        if ((NIL != subl_promotions.memberP(ind_arg, $list30, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(dep_arg, $list30, UNPROVIDED, UNPROVIDED))) {
            return inter_arg_not_isa_pred(dep_arg, ind_arg);
        }
        return NIL;
    }

    public static final SubLObject inter_arg_genl_pred_alt(SubLObject ind_arg, SubLObject dep_arg) {
        {
            SubLObject pcase_var = ind_arg;
            if (pcase_var.eql(ONE_INTEGER)) {
                {
                    SubLObject pcase_var_11 = dep_arg;
                    if (pcase_var_11.eql(TWO_INTEGER)) {
                        return $$interArgGenl1_2;
                    } else {
                        el_error(THREE_INTEGER, $str_alt34$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                    }
                }
            } else {
                if (pcase_var.eql(TWO_INTEGER)) {
                    {
                        SubLObject pcase_var_12 = dep_arg;
                        if (pcase_var_12.eql(ONE_INTEGER)) {
                            return $$interArgGenl2_1;
                        } else {
                            el_error(THREE_INTEGER, $str_alt34$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                        }
                    }
                } else {
                    if (pcase_var.eql(THREE_INTEGER)) {
                        {
                            SubLObject pcase_var_13 = dep_arg;
                            el_error(THREE_INTEGER, $str_alt34$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                        }
                    } else {
                        if (pcase_var.eql(FOUR_INTEGER)) {
                            {
                                SubLObject pcase_var_14 = dep_arg;
                                el_error(THREE_INTEGER, $str_alt34$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                            }
                        } else {
                            if (pcase_var.eql(FIVE_INTEGER)) {
                                {
                                    SubLObject pcase_var_15 = dep_arg;
                                    el_error(THREE_INTEGER, $str_alt34$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                                }
                            } else {
                                el_error(THREE_INTEGER, $str_alt34$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject inter_arg_genl_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            if (dep_arg.eql(TWO_INTEGER)) {
                return $$interArgGenl1_2;
            }
            el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                if (dep_arg.eql(ONE_INTEGER)) {
                    return $$interArgGenl2_1;
                }
                if (dep_arg.eql(FOUR_INTEGER)) {
                    return $$interArgGenl2_4;
                }
                el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    public static SubLObject inter_arg_not_genl_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            if (dep_arg.eql(TWO_INTEGER)) {
                return $$interArgNotGenl1_2;
            }
            el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    public static SubLObject inter_arg_isa_genl_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            if (dep_arg.eql(TWO_INTEGER)) {
                return $$interArgIsaGenl1_2;
            }
            el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                if (dep_arg.eql(ONE_INTEGER)) {
                    return $$interArgIsaGenl2_1;
                }
                if (dep_arg.eql(THREE_INTEGER)) {
                    return $$interArgIsaGenl2_3;
                }
                el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    if (dep_arg.eql(TWO_INTEGER)) {
                        return $$interArgIsaGenl3_2;
                    }
                    el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    public static SubLObject inter_arg_genl_isa_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql(ONE_INTEGER)) {
            el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
        } else
            if (ind_arg.eql(TWO_INTEGER)) {
                if (dep_arg.eql(ONE_INTEGER)) {
                    return $$interArgGenlIsa2_1;
                }
                el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
            } else
                if (ind_arg.eql(THREE_INTEGER)) {
                    el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                } else
                    if (ind_arg.eql(FOUR_INTEGER)) {
                        el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                    } else
                        if (ind_arg.eql(FIVE_INTEGER)) {
                            el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        } else {
                            el_error(THREE_INTEGER, $str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, UNPROVIDED);
                        }




        return NIL;
    }

    /**
     * Returns the appropriate inter-arg-genl predicate for constraining the inverse of IND-ARG and DEP-ARG .
     */
    @LispMethod(comment = "Returns the appropriate inter-arg-genl predicate for constraining the inverse of IND-ARG and DEP-ARG .")
    public static final SubLObject inter_arg_genl_inverse_alt(SubLObject ind_arg, SubLObject dep_arg) {
        if ((NIL != subl_promotions.memberP(ind_arg, $list_alt29, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(dep_arg, $list_alt29, UNPROVIDED, UNPROVIDED))) {
            return com.cyc.cycjava.cycl.at_utilities.inter_arg_genl_pred(dep_arg, ind_arg);
        }
        return NIL;
    }

    /**
     * Returns the appropriate inter-arg-genl predicate for constraining the inverse of IND-ARG and DEP-ARG .
     */
    @LispMethod(comment = "Returns the appropriate inter-arg-genl predicate for constraining the inverse of IND-ARG and DEP-ARG .")
    public static SubLObject inter_arg_genl_inverse(final SubLObject ind_arg, final SubLObject dep_arg) {
        if ((NIL != subl_promotions.memberP(ind_arg, $list30, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(dep_arg, $list30, UNPROVIDED, UNPROVIDED))) {
            return inter_arg_genl_pred(dep_arg, ind_arg);
        }
        return NIL;
    }

    public static final SubLObject implication_opP_alt(SubLObject symbol) {
        return subl_promotions.memberP(symbol, czer_vars.$implication_operators$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject implication_opP(final SubLObject symbol) {
        return subl_promotions.memberP(symbol, czer_vars.$implication_operators$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED);
    }

    public static final SubLObject logical_opP_alt(SubLObject symbol) {
        return makeBoolean((NIL != fort_types_interface.isa_logical_connectiveP(symbol, mt_vars.$anect_mt$.getGlobalValue())) || (NIL != fort_types_interface.isa_quantifierP(symbol, mt_vars.$anect_mt$.getGlobalValue())));
    }

    public static SubLObject logical_opP(final SubLObject symbol) {
        return makeBoolean((NIL != fort_types_interface.isa_logical_connectiveP(symbol, mt_vars.$anect_mt$.getGlobalValue())) || (NIL != fort_types_interface.isa_quantifierP(symbol, mt_vars.$anect_mt$.getGlobalValue())));
    }

    public static final SubLObject truth_functionP_alt(SubLObject v_object) {
        return isa.isaP(v_object, $$TruthFunction, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject truth_functionP(final SubLObject v_object) {
        return isa.isaP(v_object, $$TruthFunction, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject initialize_all_arg_type_predicate_caches_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
                    try {
                        $noting_progress_start_time$.bind(get_universal_time(), thread);
                        noting_progress_preamble($str_alt37$Initializing_all_arg_type_predica);
                        count = add(count, com.cyc.cycjava.cycl.at_utilities.initialize_some_inter_arg_isa_assertion_somewhere_cache());
                        count = add(count, com.cyc.cycjava.cycl.at_utilities.initialize_some_inter_arg_format_assertion_somewhere_cache());
                        noting_progress_postamble();
                    } finally {
                        $noting_progress_start_time$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_all_arg_type_predicate_caches() {
        SubLObject count = ZERO_INTEGER;
        count = add(count, initialize_some_inter_arg_isa_assertion_somewhere_cache());
        count = add(count, initialize_some_inter_arg_format_assertion_somewhere_cache());
        return count;
    }

    public static final SubLObject clear_all_arg_type_predicate_caches_alt() {
        com.cyc.cycjava.cycl.at_utilities.clear_some_inter_arg_isa_assertion_somewhere_cache();
        com.cyc.cycjava.cycl.at_utilities.clear_some_inter_arg_format_assertion_somewhere_cache();
        return NIL;
    }

    public static SubLObject clear_all_arg_type_predicate_caches() {
        clear_some_inter_arg_isa_assertion_somewhere_cache();
        clear_some_inter_arg_format_assertion_somewhere_cache();
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a binary arg-isa predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a binary arg-isa predicate")
    public static final SubLObject arg_isa_binary_predP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgIsaBinaryPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a binary arg-isa predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a binary arg-isa predicate")
    public static SubLObject arg_isa_binary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgIsaBinaryPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a ternary arg-isa predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a ternary arg-isa predicate")
    public static final SubLObject arg_isa_ternary_predP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgIsaTernaryPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a ternary arg-isa predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a ternary arg-isa predicate")
    public static SubLObject arg_isa_ternary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgIsaTernaryPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is an arg-isa predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is an arg-isa predicate")
    public static final SubLObject arg_isa_predicateP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) || (NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), symbol_function(EQ), UNPROVIDED))) || (NIL != isa.isaP(v_object, $$ArgIsaPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is an arg-isa predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is an arg-isa predicate")
    public static SubLObject arg_isa_predicateP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED))) || (NIL != isa.isaP(v_object, $$ArgIsaPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a binary arg-genl predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a binary arg-genl predicate")
    public static final SubLObject arg_genl_binary_predP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgGenlBinaryPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a binary arg-genl predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a binary arg-genl predicate")
    public static SubLObject arg_genl_binary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgGenlBinaryPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a ternary arg-genl predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a ternary arg-genl predicate")
    public static final SubLObject arg_genl_ternary_predP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgGenlTernaryPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a ternary arg-genl predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a ternary arg-genl predicate")
    public static SubLObject arg_genl_ternary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != isa.isaP(v_object, $$ArgGenlTernaryPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is an arg-genl predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is an arg-genl predicate")
    public static final SubLObject arg_genl_predicateP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) || (NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), symbol_function(EQ), UNPROVIDED))) || (NIL != isa.isaP(v_object, $$ArgGenlPredicate, mt, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is an arg-genl predicate
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is an arg-genl predicate")
    public static SubLObject arg_genl_predicateP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED)) || (NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED))) || (NIL != isa.isaP(v_object, $$ArgGenlPredicate, mt, UNPROVIDED)));
    }

    /**
     * is OBJECT a formula-denoting functional expression?
     */
    @LispMethod(comment = "is OBJECT a formula-denoting functional expression?")
    public static final SubLObject formula_denoting_functionP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != relation_expressionP(v_object)) {
            return com.cyc.cycjava.cycl.at_utilities.formula_functorP(cycl_utilities.nat_functor(v_object), mt);
        }
        return NIL;
    }

    /**
     * is OBJECT a formula-denoting functional expression?
     */
    @LispMethod(comment = "is OBJECT a formula-denoting functional expression?")
    public static SubLObject formula_denoting_functionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != relation_expressionP(v_object)) {
            return formula_functorP(cycl_utilities.nat_functor(v_object), mt);
        }
        return NIL;
    }

    /**
     * does FUNCTOR a return a formula?
     */
    @LispMethod(comment = "does FUNCTOR a return a formula?")
    public static final SubLObject formula_functorP_alt(SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.nautP(functor, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.at_utilities.formula_functorP(narts_high.find_nart(functor), mt);
        } else {
            if (NIL != forts.fort_p(functor)) {
                {
                    SubLObject formula_functorP = NIL;
                    if (NIL == formula_functorP) {
                        {
                            SubLObject csome_list_var = kb_accessors.result_isa(functor, mt);
                            SubLObject result_isa = NIL;
                            for (result_isa = csome_list_var.first(); !((NIL != formula_functorP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , result_isa = csome_list_var.first()) {
                                formula_functorP = formula_denoting_collectionP(result_isa);
                            }
                        }
                    }
                    return formula_functorP;
                }
            }
        }
        return NIL;
    }

    /**
     * does FUNCTOR a return a formula?
     */
    @LispMethod(comment = "does FUNCTOR a return a formula?")
    public static SubLObject formula_functorP(final SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.nautP(functor, UNPROVIDED)) {
            return formula_functorP(narts_high.find_nart(functor), mt);
        }
        if (NIL != forts.fort_p(functor)) {
            SubLObject formula_functorP = NIL;
            if (NIL == formula_functorP) {
                SubLObject csome_list_var;
                SubLObject result_isa;
                for (csome_list_var = kb_accessors.result_isa(functor, mt), result_isa = NIL, result_isa = csome_list_var.first(); (NIL == formula_functorP) && (NIL != csome_list_var); formula_functorP = formula_denoting_collectionP(result_isa) , csome_list_var = csome_list_var.rest() , result_isa = csome_list_var.first()) {
                }
            }
            return formula_functorP;
        }
        return NIL;
    }

    /**
     * is OBJECT a sentence-denoting functional expression?
     */
    @LispMethod(comment = "is OBJECT a sentence-denoting functional expression?")
    public static final SubLObject sentence_denoting_functionP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != relation_expressionP(v_object)) {
            return com.cyc.cycjava.cycl.at_utilities.sentence_functorP(cycl_utilities.nat_functor(v_object), mt);
        }
        return NIL;
    }

    /**
     * is OBJECT a sentence-denoting functional expression?
     */
    @LispMethod(comment = "is OBJECT a sentence-denoting functional expression?")
    public static SubLObject sentence_denoting_functionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != relation_expressionP(v_object)) {
            return sentence_functorP(cycl_utilities.nat_functor(v_object), mt);
        }
        return NIL;
    }

    /**
     * does FUNCTOR a return a sentence?
     */
    @LispMethod(comment = "does FUNCTOR a return a sentence?")
    public static final SubLObject sentence_functorP_alt(SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.nautP(functor, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.at_utilities.sentence_functorP(narts_high.find_nart(functor), mt);
        } else {
            if (NIL != forts.fort_p(functor)) {
                {
                    SubLObject sentence_functorP = NIL;
                    if (NIL == sentence_functorP) {
                        {
                            SubLObject csome_list_var = kb_accessors.result_isa(functor, mt);
                            SubLObject result_isa = NIL;
                            for (result_isa = csome_list_var.first(); !((NIL != sentence_functorP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , result_isa = csome_list_var.first()) {
                                sentence_functorP = sentence_denoting_collectionP(result_isa);
                            }
                        }
                    }
                    return sentence_functorP;
                }
            }
        }
        return NIL;
    }

    /**
     * does FUNCTOR a return a sentence?
     */
    @LispMethod(comment = "does FUNCTOR a return a sentence?")
    public static SubLObject sentence_functorP(final SubLObject functor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.nautP(functor, UNPROVIDED)) {
            return sentence_functorP(narts_high.find_nart(functor), mt);
        }
        if (NIL != forts.fort_p(functor)) {
            SubLObject sentence_functorP = NIL;
            if (NIL == sentence_functorP) {
                SubLObject csome_list_var;
                SubLObject result_isa;
                for (csome_list_var = kb_accessors.result_isa(functor, mt), result_isa = NIL, result_isa = csome_list_var.first(); (NIL == sentence_functorP) && (NIL != csome_list_var); sentence_functorP = sentence_denoting_collectionP(result_isa) , csome_list_var = csome_list_var.rest() , result_isa = csome_list_var.first()) {
                }
            }
            return sentence_functorP;
        }
        return NIL;
    }

    public static final SubLObject argn_type_levelP_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(argnum, INTEGERP);
        {
            SubLObject types = kb_accessors.argn_isa(relation, argnum, mt);
            SubLObject foundP = NIL;
            if (NIL == foundP) {
                {
                    SubLObject csome_list_var = types;
                    SubLObject type = NIL;
                    for (type = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
                        foundP = genls.genlP(type, $$Collection, mt, UNPROVIDED);
                    }
                }
            }
            return foundP;
        }
    }

    public static SubLObject argn_type_levelP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != integerp(argnum) : "! integerp(argnum) " + ("Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) ") + argnum;
        final SubLObject types = kb_accessors.argn_isa(relation, argnum, mt);
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var;
            SubLObject type;
            for (csome_list_var = types, type = NIL, type = csome_list_var.first(); (NIL == foundP) && (NIL != csome_list_var); foundP = genls.genlP(type, $$Collection, mt, UNPROVIDED) , csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
            }
        }
        return foundP;
    }

    public static final SubLObject min_genl_preds_admitting_fort_as_arg_alt(SubLObject fort, SubLObject argnum, SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return at_admitted.relations_admitting_fort_as_arg(fort, argnum, genl_predicates.all_genl_preds(predicate, mt, UNPROVIDED), mt);
    }

    public static SubLObject min_genl_preds_admitting_fort_as_arg(final SubLObject fort, final SubLObject argnum, final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return at_admitted.relations_admitting_fort_as_arg(fort, argnum, genl_predicates.all_genl_preds(predicate, mt, UNPROVIDED), mt);
    }

    /**
     *
     *
     * @return list of those elements of FORTS that are admited as RELN argument number ARGNUM
     */
    @LispMethod(comment = "@return list of those elements of FORTS that are admited as RELN argument number ARGNUM")
    public static final SubLObject forts_admitted_as_arg_alt(SubLObject v_forts, SubLObject reln, SubLObject argnum, SubLObject mt, SubLObject ind_arg_fort, SubLObject ind_argnum) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (ind_arg_fort == UNPROVIDED) {
            ind_arg_fort = NIL;
        }
        if (ind_argnum == UNPROVIDED) {
            ind_argnum = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != v_forts) {
                {
                    SubLObject isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread));
                    SubLObject genls_okP = makeBoolean(NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread));
                    SubLObject result = NIL;
                    SubLObject isa_candidates = NIL;
                    if ((NIL != isa_okP) && (NIL != genls_okP)) {
                        result = v_forts;
                    } else {
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    {
                                        SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(reln)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(reln, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(reln, UNPROVIDED))))) : NIL;
                                        {
                                            SubLObject _prev_bind_0_16 = at_vars.$at_reln$.currentBinding(thread);
                                            SubLObject _prev_bind_1_17 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                            try {
                                                at_vars.$at_reln$.bind(reln, thread);
                                                at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                                at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                                SubLTrampolineFile.checkType(argnum, INTEGERP);
                                                {
                                                    SubLObject _prev_bind_0_18 = at_vars.$at_argnum$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_19 = at_vars.$at_arg_type$.currentBinding(thread);
                                                    try {
                                                        at_vars.$at_argnum$.bind(argnum, thread);
                                                        at_vars.$at_arg_type$.bind($STRONG_FORT, thread);
                                                        if (NIL != isa_okP) {
                                                            isa_candidates = v_forts;
                                                        } else {
                                                            {
                                                                SubLObject cdolist_list_var = v_forts;
                                                                SubLObject fort = NIL;
                                                                for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                                                                    if (NIL != forts.fort_p(fort)) {
                                                                        {
                                                                            SubLObject _prev_bind_0_20 = at_vars.$at_arg$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_21 = at_vars.$defn_fn_history$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_22 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
                                                                            SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
                                                                            SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
                                                                            try {
                                                                                at_vars.$at_arg$.bind(fort, thread);
                                                                                at_vars.$defn_fn_history$.bind(at_macros.make_defn_fn_history_table(), thread);
                                                                                at_vars.$quoted_defn_fn_history$.bind(at_macros.make_quoted_defn_fn_history_table(), thread);
                                                                                at_vars.$defn_col_history$.bind(at_macros.make_defn_col_history_table(), thread);
                                                                                at_vars.$quoted_defn_col_history$.bind(at_macros.make_quoted_defn_col_history_table(), thread);
                                                                                try {
                                                                                    {
                                                                                        SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                                                                        {
                                                                                            SubLObject _prev_bind_0_23 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_24 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                                                                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_25 = at_vars.$at_isa_space$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_26 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                                                    try {
                                                                                                        at_vars.$at_isa_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                                                                                        isa.sbhl_record_all_isa(fort, UNPROVIDED, UNPROVIDED);
                                                                                                        if ((NIL != arg_type.arg_test_okP(reln, fort, argnum, $ISA)) && ((!(((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) && (NIL != ind_arg_fort)) && (NIL != ind_argnum))) || (NIL == arg_type.mal_inter_argP(reln, ind_arg_fort, ind_argnum, fort, argnum, $ISA)))) {
                                                                                                            isa_candidates = cons(fort, isa_candidates);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_26, thread);
                                                                                                        at_vars.$at_isa_space$.rebind(_prev_bind_0_25, thread);
                                                                                                    }
                                                                                                }
                                                                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                                                            } finally {
                                                                                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_24, thread);
                                                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_23, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            at_defns.clear_defn_space();
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_27, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
                                                                                at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
                                                                                at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2_22, thread);
                                                                                at_vars.$defn_fn_history$.rebind(_prev_bind_1_21, thread);
                                                                                at_vars.$at_arg$.rebind(_prev_bind_0_20, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (NIL != genls_okP) {
                                                            result = isa_candidates;
                                                        } else {
                                                            {
                                                                SubLObject cdolist_list_var = isa_candidates;
                                                                SubLObject fort = NIL;
                                                                for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                                                                    {
                                                                        SubLObject _prev_bind_0_28 = at_vars.$at_arg$.currentBinding(thread);
                                                                        try {
                                                                            at_vars.$at_arg$.bind(fort, thread);
                                                                            {
                                                                                SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                                                                {
                                                                                    SubLObject _prev_bind_0_29 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_30 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                                                                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_31 = at_vars.$at_genls_space$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_32 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                                            try {
                                                                                                at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                                                                                {
                                                                                                    SubLObject collectionP = fort_types_interface.collectionP(fort);
                                                                                                    if (NIL != collectionP) {
                                                                                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort, UNPROVIDED, UNPROVIDED);
                                                                                                        sbhl_marking_methods.sbhl_record_node($$Thing, UNPROVIDED);
                                                                                                    }
                                                                                                    {
                                                                                                        SubLObject asserted_genl_somethingP_33 = (NIL != forts.fort_p(reln)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(reln, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(reln, UNPROVIDED))))) : NIL;
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_34 = at_vars.$at_reln$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1_35 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_2_36 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                at_vars.$at_reln$.bind(reln, thread);
                                                                                                                at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP_33)), thread);
                                                                                                                at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP_33)), thread);
                                                                                                                if (NIL != arg_type.arg_test_okP(reln, fort, argnum, $GENLS)) {
                                                                                                                    result = cons(fort, result);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_36, thread);
                                                                                                                at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_35, thread);
                                                                                                                at_vars.$at_reln$.rebind(_prev_bind_0_34, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_32, thread);
                                                                                                at_vars.$at_genls_space$.rebind(_prev_bind_0_31, thread);
                                                                                            }
                                                                                        }
                                                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                                                    } finally {
                                                                                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_30, thread);
                                                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_29, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            at_vars.$at_arg$.rebind(_prev_bind_0_28, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        at_vars.$at_arg_type$.rebind(_prev_bind_1_19, thread);
                                                        at_vars.$at_argnum$.rebind(_prev_bind_0_18, thread);
                                                    }
                                                }
                                            } finally {
                                                at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                                at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_17, thread);
                                                at_vars.$at_reln$.rebind(_prev_bind_0_16, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return list of those elements of FORTS that are admited as RELN argument number ARGNUM
     */
    @LispMethod(comment = "@return list of those elements of FORTS that are admited as RELN argument number ARGNUM")
    public static SubLObject forts_admitted_as_arg(final SubLObject v_forts, final SubLObject reln, final SubLObject argnum, SubLObject mt, SubLObject ind_arg_fort, SubLObject ind_argnum) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (ind_arg_fort == UNPROVIDED) {
            ind_arg_fort = NIL;
        }
        if (ind_argnum == UNPROVIDED) {
            ind_argnum = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != v_forts) {
            final SubLObject isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread));
            final SubLObject genls_okP = makeBoolean(NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread));
            SubLObject result = NIL;
            SubLObject isa_candidates = NIL;
            if ((NIL != isa_okP) && (NIL != genls_okP)) {
                result = v_forts;
            } else {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    final SubLObject genl_somethingP = (NIL != forts.fort_p(reln)) ? makeBoolean((NIL != genl_predicates.genl_predicates(reln, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(reln, UNPROVIDED, UNPROVIDED))) : NIL;
                    final SubLObject _prev_bind_0_$31 = at_vars.$at_reln$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$32 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                    try {
                        at_vars.$at_reln$.bind(reln, thread);
                        at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                        at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                        assert NIL != integerp(argnum) : "! integerp(argnum) " + ("Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) ") + argnum;
                        final SubLObject _prev_bind_0_$32 = at_vars.$at_argnum$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$33 = at_vars.$at_arg_type$.currentBinding(thread);
                        try {
                            at_vars.$at_argnum$.bind(argnum, thread);
                            at_vars.$at_arg_type$.bind($STRONG_FORT, thread);
                            if (NIL != isa_okP) {
                                isa_candidates = v_forts;
                            } else {
                                SubLObject cdolist_list_var = v_forts;
                                SubLObject fort = NIL;
                                fort = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != forts.fort_p(fort)) {
                                        final SubLObject _prev_bind_0_$33 = at_vars.$at_arg$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$34 = at_vars.$defn_fn_history$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$37 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = at_vars.$defn_col_history$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
                                        try {
                                            at_vars.$at_arg$.bind(fort, thread);
                                            at_vars.$defn_fn_history$.bind(at_macros.make_defn_fn_history_table(), thread);
                                            at_vars.$quoted_defn_fn_history$.bind(at_macros.make_quoted_defn_fn_history_table(), thread);
                                            at_vars.$defn_col_history$.bind(at_macros.make_defn_col_history_table(), thread);
                                            at_vars.$quoted_defn_col_history$.bind(at_macros.make_quoted_defn_col_history_table(), thread);
                                            try {
                                                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                                final SubLObject _prev_bind_0_$34 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$35 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    try {
                                                        final SubLObject _prev_bind_0_$35 = at_vars.$at_isa_space$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$36 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                        try {
                                                            at_vars.$at_isa_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                                            isa.sbhl_record_all_isa(fort, UNPROVIDED, UNPROVIDED);
                                                            if ((NIL != arg_type.arg_test_okP(reln, fort, argnum, $ISA)) && ((((NIL == at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) || (NIL == ind_arg_fort)) || (NIL == ind_argnum)) || (NIL == arg_type.mal_inter_argP(reln, ind_arg_fort, ind_argnum, fort, argnum, $ISA)))) {
                                                                isa_candidates = cons(fort, isa_candidates);
                                                            }
                                                        } finally {
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$36, thread);
                                                            at_vars.$at_isa_space$.rebind(_prev_bind_0_$35, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$35, thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$34, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    at_defns.clear_defn_space();
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                                }
                                            }
                                        } finally {
                                            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_5, thread);
                                            at_vars.$defn_col_history$.rebind(_prev_bind_4, thread);
                                            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2_$37, thread);
                                            at_vars.$defn_fn_history$.rebind(_prev_bind_1_$34, thread);
                                            at_vars.$at_arg$.rebind(_prev_bind_0_$33, thread);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    fort = cdolist_list_var.first();
                                } 
                            }
                            if (NIL != genls_okP) {
                                result = isa_candidates;
                            } else {
                                SubLObject cdolist_list_var = isa_candidates;
                                SubLObject fort = NIL;
                                fort = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject _prev_bind_0_$38 = at_vars.$at_arg$.currentBinding(thread);
                                    try {
                                        at_vars.$at_arg$.bind(fort, thread);
                                        final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                        final SubLObject _prev_bind_0_$39 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$37 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                final SubLObject _prev_bind_0_$40 = at_vars.$at_genls_space$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$38 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                try {
                                                    at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p2, thread);
                                                    final SubLObject collectionP = fort_types_interface.collectionP(fort);
                                                    if (NIL != collectionP) {
                                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort, UNPROVIDED, UNPROVIDED);
                                                        sbhl_marking_methods.sbhl_record_node($$Thing, UNPROVIDED);
                                                    }
                                                    final SubLObject genl_somethingP_$49 = (NIL != forts.fort_p(reln)) ? makeBoolean((NIL != genl_predicates.genl_predicates(reln, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(reln, UNPROVIDED, UNPROVIDED))) : NIL;
                                                    final SubLObject _prev_bind_0_$41 = at_vars.$at_reln$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$39 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$38 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                                    try {
                                                        at_vars.$at_reln$.bind(reln, thread);
                                                        at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP_$49)), thread);
                                                        at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP_$49)), thread);
                                                        if (NIL != arg_type.arg_test_okP(reln, fort, argnum, $GENLS)) {
                                                            result = cons(fort, result);
                                                        }
                                                    } finally {
                                                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_$38, thread);
                                                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$39, thread);
                                                        at_vars.$at_reln$.rebind(_prev_bind_0_$41, thread);
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$38, thread);
                                                    at_vars.$at_genls_space$.rebind(_prev_bind_0_$40, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values3 = getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                    restoreValuesFromVector(_values3);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$37, thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$39, thread);
                                        }
                                    } finally {
                                        at_vars.$at_arg$.rebind(_prev_bind_0_$38, thread);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    fort = cdolist_list_var.first();
                                } 
                            }
                        } finally {
                            at_vars.$at_arg_type$.rebind(_prev_bind_1_$33, thread);
                            at_vars.$at_argnum$.rebind(_prev_bind_0_$32, thread);
                        }
                    } finally {
                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$32, thread);
                        at_vars.$at_reln$.rebind(_prev_bind_0_$31, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject min_implicit_types_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject gafs = kb_accessors.constant_pos_gafs(fort, mt);
            return com.cyc.cycjava.cycl.at_utilities.term_requires_isa_in_relations(fort, gafs, mt, T);
        }
    }

    public static SubLObject min_implicit_types(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject gafs = kb_accessors.constant_pos_gafs(fort, mt);
        return term_requires_isa_in_relations(fort, gafs, mt, T);
    }

    public static final SubLObject term_requires_isa_in_relations_alt(SubLObject v_term, SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (minimizeP == UNPROVIDED) {
            minimizeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject result_isas = com.cyc.cycjava.cycl.at_utilities.term_requires_types_in_relations(v_term, relation_expressions, mt, minimizeP);
                SubLObject result_genls = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return result_isas;
            }
        }
    }

    public static SubLObject term_requires_isa_in_relations(final SubLObject v_term, final SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (minimizeP == UNPROVIDED) {
            minimizeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result_isas = term_requires_types_in_relations(v_term, relation_expressions, mt, minimizeP);
        final SubLObject result_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return result_isas;
    }

    public static final SubLObject term_requires_genl_in_relations_alt(SubLObject v_term, SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (minimizeP == UNPROVIDED) {
            minimizeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject result_isas = com.cyc.cycjava.cycl.at_utilities.term_requires_types_in_relations(v_term, relation_expressions, mt, minimizeP);
                SubLObject result_genls = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return result_genls;
            }
        }
    }

    public static SubLObject term_requires_genl_in_relations(final SubLObject v_term, final SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (minimizeP == UNPROVIDED) {
            minimizeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result_isas = term_requires_types_in_relations(v_term, relation_expressions, mt, minimizeP);
        final SubLObject result_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return result_genls;
    }

    public static final SubLObject term_requires_types_in_relations_alt(SubLObject v_term, SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (minimizeP == UNPROVIDED) {
            minimizeP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_isas = NIL;
                SubLObject result_genls = NIL;
                SubLObject cdolist_list_var = relation_expressions;
                SubLObject relation_expression = NIL;
                for (relation_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_expression = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject isas = com.cyc.cycjava.cycl.at_utilities.term_requires_types_in_relation(v_term, relation_expression, mt);
                        SubLObject v_genls = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != minimizeP) {
                            result_isas = genls.min_cols(nconc(result_isas, isas), mt, UNPROVIDED);
                            result_genls = genls.min_cols(nconc(result_genls, v_genls), mt, UNPROVIDED);
                        } else {
                            result_isas = nunion(result_isas, isas, UNPROVIDED, UNPROVIDED);
                            result_genls = nunion(result_genls, v_genls, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                return values(result_isas, result_genls);
            }
        }
    }

    public static SubLObject term_requires_types_in_relations(final SubLObject v_term, final SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (minimizeP == UNPROVIDED) {
            minimizeP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_isas = NIL;
        SubLObject result_genls = NIL;
        SubLObject cdolist_list_var = relation_expressions;
        SubLObject relation_expression = NIL;
        relation_expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject isas = term_requires_types_in_relation(v_term, relation_expression, mt);
            final SubLObject v_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != minimizeP) {
                result_isas = genls.min_cols(nconc(result_isas, isas), mt, UNPROVIDED);
                result_genls = genls.min_cols(nconc(result_genls, v_genls), mt, UNPROVIDED);
            } else {
                result_isas = nunion(result_isas, isas, UNPROVIDED, UNPROVIDED);
                result_genls = nunion(result_genls, v_genls, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            relation_expression = cdolist_list_var.first();
        } 
        return values(result_isas, result_genls);
    }

    public static final SubLObject term_requires_isa_in_clause_alt(SubLObject v_term, SubLObject clause, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
                    try {
                        at_vars.$appraising_disjunctP$.bind(arg_type.appraising_disjunct_cnfP(clause), thread);
                        {
                            SubLObject cdolist_list_var = clauses.neg_lits(clause);
                            SubLObject literal = NIL;
                            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                result = nunion(com.cyc.cycjava.cycl.at_utilities.term_requires_isa_in_relation(v_term, literal, mt), result, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = clauses.pos_lits(clause);
                            SubLObject literal = NIL;
                            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                result = nunion(com.cyc.cycjava.cycl.at_utilities.term_requires_isa_in_relation(v_term, literal, mt), result, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    } finally {
                        at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject term_requires_isa_in_clause(final SubLObject v_term, final SubLObject clause, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
        try {
            at_vars.$appraising_disjunctP$.bind(arg_type.appraising_disjunct_cnfP(clause), thread);
            SubLObject cdolist_list_var = clauses.neg_lits(clause);
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = nunion(term_requires_isa_in_relation(v_term, literal, mt), result, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
            cdolist_list_var = clauses.pos_lits(clause);
            literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = nunion(term_requires_isa_in_relation(v_term, literal, mt), result, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject term_requires_isa_in_relation_alt(SubLObject v_term, SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_defns_availableP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                    try {
                        wff_vars.$recognize_variablesP$.bind(NIL, thread);
                        at_vars.$at_defns_availableP$.bind(NIL, thread);
                        at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_37 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_38 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_2_39 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    at_vars.$gather_at_constraintsP$.bind(T, thread);
                                    {
                                        SubLObject _prev_bind_0_40 = at_vars.$at_argnum$.currentBinding(thread);
                                        SubLObject _prev_bind_1_41 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_2_42 = at_vars.$at_formula$.currentBinding(thread);
                                        try {
                                            at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                                            at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                                            at_vars.$at_formula$.bind(relation_expression, thread);
                                            if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                                                {
                                                    SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_43 = at_vars.$at_arg$.currentBinding(thread);
                                                        try {
                                                            at_vars.$at_arg$.bind(NIL, thread);
                                                            for (at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread)) {
                                                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                                                }
                                                            }
                                                        } finally {
                                                            at_vars.$at_arg$.rebind(_prev_bind_0_43, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            at_vars.$at_formula$.rebind(_prev_bind_2_42, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_1_41, thread);
                                            at_vars.$at_argnum$.rebind(_prev_bind_0_40, thread);
                                        }
                                    }
                                    result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                                    clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                                    clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
                                } finally {
                                    at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_39, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_38, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_37, thread);
                                }
                            }
                        }
                    } finally {
                        at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_2, thread);
                        at_vars.$at_defns_availableP$.rebind(_prev_bind_1, thread);
                        wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject term_requires_isa_in_relation(final SubLObject v_term, final SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(NIL, thread);
            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$54 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$55 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$56 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$55 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$56 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$57 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            } 
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$56, thread);
                        }
                    }
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$57, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$56, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$55, thread);
                }
                result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$56, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$55, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$54, thread);
            }
        } finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject term_requires_isa_in_formula_alt(SubLObject v_term, SubLObject formula, SubLObject mt, SubLObject subformulasP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (subformulasP == UNPROVIDED) {
            subformulasP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_defns_availableP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                    try {
                        wff_vars.$recognize_variablesP$.bind(NIL, thread);
                        at_vars.$at_defns_availableP$.bind(subformulasP, thread);
                        at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_44 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_45 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_2_46 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    at_vars.$gather_at_constraintsP$.bind(T, thread);
                                    {
                                        SubLObject _prev_bind_0_47 = at_vars.$at_profile_term$.currentBinding(thread);
                                        SubLObject _prev_bind_1_48 = at_vars.$at_argnum$.currentBinding(thread);
                                        SubLObject _prev_bind_2_49 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = at_vars.$at_formula$.currentBinding(thread);
                                        try {
                                            at_vars.$at_profile_term$.bind(v_term, thread);
                                            at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                                            at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(formula), thread);
                                            at_vars.$at_formula$.bind(formula, thread);
                                            if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                                                {
                                                    SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_50 = at_vars.$at_arg$.currentBinding(thread);
                                                        try {
                                                            at_vars.$at_arg$.bind(NIL, thread);
                                                            for (at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread)) {
                                                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                if (NIL != (NIL != subformulasP ? ((SubLObject) (cycl_utilities.expression_find(v_term, at_vars.$at_arg$.getDynamicValue(thread), NIL, symbol_function(EQUAL), UNPROVIDED))) : equal(v_term, at_vars.$at_arg$.getDynamicValue(thread)))) {
                                                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_arg$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                                                }
                                                            }
                                                        } finally {
                                                            at_vars.$at_arg$.rebind(_prev_bind_0_50, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            at_vars.$at_formula$.rebind(_prev_bind_3, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_2_49, thread);
                                            at_vars.$at_argnum$.rebind(_prev_bind_1_48, thread);
                                            at_vars.$at_profile_term$.rebind(_prev_bind_0_47, thread);
                                        }
                                    }
                                    result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                                    clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                                    clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
                                } finally {
                                    at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_46, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_45, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_44, thread);
                                }
                            }
                        }
                    } finally {
                        at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_2, thread);
                        at_vars.$at_defns_availableP$.rebind(_prev_bind_1, thread);
                        wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject term_requires_isa_in_formula(final SubLObject v_term, final SubLObject formula, SubLObject mt, SubLObject subformulasP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (subformulasP == UNPROVIDED) {
            subformulasP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(subformulasP, thread);
            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$61 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$63 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$62 = at_vars.$at_profile_term$.currentBinding(thread);
                final SubLObject _prev_bind_1_$63 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_2_$64 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_4 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_profile_term$.bind(v_term, thread);
                    at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(formula), thread);
                    at_vars.$at_formula$.bind(formula, thread);
                    if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL != (NIL != subformulasP ? cycl_utilities.expression_find(v_term, at_vars.$at_arg$.getDynamicValue(thread), NIL, symbol_function(EQUAL), UNPROVIDED) : equal(v_term, at_vars.$at_arg$.getDynamicValue(thread)))) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_arg$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            } 
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$63, thread);
                        }
                    }
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_4, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_2_$64, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_1_$63, thread);
                    at_vars.$at_profile_term$.rebind(_prev_bind_0_$62, thread);
                }
                result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$63, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$62, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$61, thread);
            }
        } finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject term_requires_genl_in_relation_alt(SubLObject v_term, SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_defns_availableP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
                    try {
                        wff_vars.$recognize_variablesP$.bind(NIL, thread);
                        at_vars.$at_defns_availableP$.bind(NIL, thread);
                        at_vars.$at_check_arg_isaP$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_51 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_52 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_2_53 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    at_vars.$gather_at_constraintsP$.bind(T, thread);
                                    {
                                        SubLObject _prev_bind_0_54 = at_vars.$at_argnum$.currentBinding(thread);
                                        SubLObject _prev_bind_1_55 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_2_56 = at_vars.$at_formula$.currentBinding(thread);
                                        try {
                                            at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                                            at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                                            at_vars.$at_formula$.bind(relation_expression, thread);
                                            if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                                                {
                                                    SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_57 = at_vars.$at_arg$.currentBinding(thread);
                                                        try {
                                                            at_vars.$at_arg$.bind(NIL, thread);
                                                            for (at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread)) {
                                                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                                                }
                                                            }
                                                        } finally {
                                                            at_vars.$at_arg$.rebind(_prev_bind_0_57, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            at_vars.$at_formula$.rebind(_prev_bind_2_56, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_1_55, thread);
                                            at_vars.$at_argnum$.rebind(_prev_bind_0_54, thread);
                                        }
                                    }
                                    result = gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), UNPROVIDED);
                                    clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                                    clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
                                } finally {
                                    at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_53, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_52, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_51, thread);
                                }
                            }
                        }
                    } finally {
                        at_vars.$at_check_arg_isaP$.rebind(_prev_bind_2, thread);
                        at_vars.$at_defns_availableP$.rebind(_prev_bind_1, thread);
                        wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject term_requires_genl_in_relation(final SubLObject v_term, final SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(NIL, thread);
            at_vars.$at_check_arg_isaP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$68 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$69 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$70 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$69 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$70 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$71 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, UNPROVIDED);
                        final SubLObject _prev_bind_0_$70 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            } 
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$70, thread);
                        }
                    }
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$71, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$70, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$69, thread);
                }
                result = gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), UNPROVIDED);
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$70, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$69, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$68, thread);
            }
        } finally {
            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_3, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject get_sub_expression_for_term_position_alt(SubLObject term_position, SubLObject expression) {
        SubLTrampolineFile.checkType(term_position, TREE_POSITION_P);
        SubLTrampolineFile.checkType(expression, $sym52$CYCL_FORMULA_);
        if (ONE_INTEGER.equal(length(term_position))) {
            return expression;
        }
        return list_utilities.get_nested_nth(expression, list_utilities.remove_last(copy_list(term_position)), UNPROVIDED);
    }

    public static SubLObject get_sub_expression_for_term_position(final SubLObject term_position, final SubLObject expression) {
        assert NIL != list_utilities.tree_position_p(term_position) : "! list_utilities.tree_position_p(term_position) " + ("list_utilities.tree_position_p(term_position) " + "CommonSymbols.NIL != list_utilities.tree_position_p(term_position) ") + term_position;
        assert NIL != collection_defns.cycl_formulaP(expression) : "! collection_defns.cycl_formulaP(expression) " + ("collection_defns.cycl_formulaP(expression) " + "CommonSymbols.NIL != collection_defns.cycl_formulaP(expression) ") + expression;
        if (ONE_INTEGER.equal(length(term_position))) {
            return expression;
        }
        return list_utilities.get_nested_nth(expression, list_utilities.remove_last(copy_list(term_position)), UNPROVIDED);
    }

    public static final SubLObject term_position_requires_types_in_relation_alt(SubLObject term_position, SubLObject expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(term_position, TREE_POSITION_P);
            SubLTrampolineFile.checkType(expression, $sym52$CYCL_FORMULA_);
            {
                SubLObject v_term = NIL;
                SubLObject isa_result = NIL;
                SubLObject genls_result = NIL;
                SubLObject relation_expression = com.cyc.cycjava.cycl.at_utilities.get_sub_expression_for_term_position(term_position, expression);
                {
                    SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_defns_availableP$.currentBinding(thread);
                    try {
                        wff_vars.$recognize_variablesP$.bind(NIL, thread);
                        at_vars.$at_defns_availableP$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_58 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_59 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_2 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    at_vars.$gather_at_constraintsP$.bind(T, thread);
                                    {
                                        SubLObject _prev_bind_0_60 = at_vars.$at_argnum$.currentBinding(thread);
                                        SubLObject _prev_bind_1_61 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_2_62 = at_vars.$at_formula$.currentBinding(thread);
                                        try {
                                            at_vars.$at_argnum$.bind(last(term_position, UNPROVIDED).first(), thread);
                                            at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                                            at_vars.$at_formula$.bind(relation_expression, thread);
                                            v_term = nth(at_vars.$at_argnum$.getDynamicValue(thread), relation_expression);
                                            if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                                                arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                            }
                                        } finally {
                                            at_vars.$at_formula$.rebind(_prev_bind_2_62, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_1_61, thread);
                                            at_vars.$at_argnum$.rebind(_prev_bind_0_60, thread);
                                        }
                                    }
                                    isa_result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                                    genls_result = gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), UNPROVIDED);
                                    clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                                    clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
                                } finally {
                                    at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_59, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_58, thread);
                                }
                            }
                        }
                    } finally {
                        at_vars.$at_defns_availableP$.rebind(_prev_bind_1, thread);
                        wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(genls.min_cols(isa_result, mt, UNPROVIDED), genls.min_cols(genls_result, mt, UNPROVIDED));
            }
        }
    }

    public static SubLObject term_position_requires_types_in_relation(final SubLObject term_position, final SubLObject expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.tree_position_p(term_position) : "! list_utilities.tree_position_p(term_position) " + ("list_utilities.tree_position_p(term_position) " + "CommonSymbols.NIL != list_utilities.tree_position_p(term_position) ") + term_position;
        assert NIL != collection_defns.cycl_formulaP(expression) : "! collection_defns.cycl_formulaP(expression) " + ("collection_defns.cycl_formulaP(expression) " + "CommonSymbols.NIL != collection_defns.cycl_formulaP(expression) ") + expression;
        SubLObject v_term = NIL;
        SubLObject isa_result = NIL;
        SubLObject genls_result = NIL;
        final SubLObject relation_expression = get_sub_expression_for_term_position(term_position, expression);
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$75 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$76 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$76 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$77 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$79 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(last(term_position, UNPROVIDED).first(), thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    v_term = nth(at_vars.$at_argnum$.getDynamicValue(thread), relation_expression);
                    if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                    }
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$79, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$77, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$76, thread);
                }
                isa_result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                genls_result = gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), UNPROVIDED);
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$76, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$75, thread);
            }
        } finally {
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return values(genls.min_cols(isa_result, mt, UNPROVIDED), genls.min_cols(genls_result, mt, UNPROVIDED));
    }

    public static final SubLObject term_requires_types_in_relation_alt(SubLObject v_term, SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isa_result = NIL;
                SubLObject genls_result = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_defns_availableP$.currentBinding(thread);
                    try {
                        wff_vars.$recognize_variablesP$.bind(NIL, thread);
                        at_vars.$at_defns_availableP$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_63 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_64 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_2 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    at_vars.$gather_at_constraintsP$.bind(T, thread);
                                    {
                                        SubLObject _prev_bind_0_65 = at_vars.$at_argnum$.currentBinding(thread);
                                        SubLObject _prev_bind_1_66 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_2_67 = at_vars.$at_formula$.currentBinding(thread);
                                        try {
                                            at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                                            at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                                            at_vars.$at_formula$.bind(relation_expression, thread);
                                            if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                                                {
                                                    SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_68 = at_vars.$at_arg$.currentBinding(thread);
                                                        try {
                                                            at_vars.$at_arg$.bind(NIL, thread);
                                                            for (at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread)) {
                                                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                                                }
                                                            }
                                                        } finally {
                                                            at_vars.$at_arg$.rebind(_prev_bind_0_68, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            at_vars.$at_formula$.rebind(_prev_bind_2_67, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_1_66, thread);
                                            at_vars.$at_argnum$.rebind(_prev_bind_0_65, thread);
                                        }
                                    }
                                    isa_result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                                    genls_result = gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), UNPROVIDED);
                                    clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                                    clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
                                } finally {
                                    at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_64, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_63, thread);
                                }
                            }
                        }
                    } finally {
                        at_vars.$at_defns_availableP$.rebind(_prev_bind_1, thread);
                        wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(isa_result, genls_result);
            }
        }
    }

    public static SubLObject term_requires_types_in_relation(final SubLObject v_term, final SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isa_result = NIL;
        SubLObject genls_result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$80 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$81 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$81 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$82 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$84 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, UNPROVIDED);
                        final SubLObject _prev_bind_0_$82 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            } 
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$82, thread);
                        }
                    }
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$84, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$82, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$81, thread);
                }
                isa_result = gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED);
                genls_result = gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), UNPROVIDED);
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$81, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$80, thread);
            }
        } finally {
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return values(isa_result, genls_result);
    }

    public static final SubLObject arg_requires_isa_in_relation_alt(SubLObject arg, SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject v_term = cycl_utilities.formula_arg(relation_expression, arg, UNPROVIDED);
            return com.cyc.cycjava.cycl.at_utilities.term_requires_isa_in_relation(v_term, relation_expression, mt);
        }
    }

    public static SubLObject arg_requires_isa_in_relation(final SubLObject arg, final SubLObject relation_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject v_term = cycl_utilities.formula_arg(relation_expression, arg, UNPROVIDED);
        return term_requires_isa_in_relation(v_term, relation_expression, mt);
    }

    public static final SubLObject pred_arg_isa_requires_other_arg_isa_alt(SubLObject pred, SubLObject arg_isa, SubLObject arg, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject literal = com.cyc.cycjava.cycl.at_utilities.make_el_query_literal(pred);
                {
                    SubLObject _prev_bind_0 = at_vars.$at_formula$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_arg$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$at_argnum$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$recognize_variablesP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = at_vars.$at_defns_availableP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                    try {
                        at_vars.$at_formula$.bind(list_utilities.replace_nth(arg, arg_isa, literal), thread);
                        at_vars.$at_arg$.bind(arg_isa, thread);
                        at_vars.$at_argnum$.bind(arg, thread);
                        wff_vars.$recognize_variablesP$.bind(NIL, thread);
                        at_vars.$at_defns_availableP$.bind(NIL, thread);
                        at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_69 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_70 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_2_71 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    at_vars.$gather_at_constraintsP$.bind(T, thread);
                                    {
                                        SubLObject _prev_bind_0_72 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_1_73 = at_vars.$at_formula$.currentBinding(thread);
                                        try {
                                            at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(at_vars.$at_formula$.getDynamicValue(thread)), thread);
                                            at_vars.$at_formula$.bind(at_vars.$at_formula$.getDynamicValue(thread), thread);
                                            {
                                                SubLObject n = ZERO_INTEGER;
                                                SubLObject cdolist_list_var = literal_args(at_vars.$at_formula$.getDynamicValue(thread), UNPROVIDED);
                                                SubLObject v_term = NIL;
                                                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                    n = add(n, ONE_INTEGER);
                                                    if (n.numE(arg)) {
                                                        arg_type.arg_isa_arg_types_okP(pred, v_term, arg, mt);
                                                    } else {
                                                        arg_type.relation_arg_okP(pred, v_term, n, UNPROVIDED);
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject n = ZERO_INTEGER;
                                                SubLObject cdolist_list_var = literal_args(at_vars.$at_formula$.getDynamicValue(thread), UNPROVIDED);
                                                SubLObject v_term = NIL;
                                                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                    n = add(n, ONE_INTEGER);
                                                    if (arg_isa != v_term) {
                                                        result = cons(list(n, genls.min_cols(list_utilities.remove_duplicate_forts(gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED)), mt, UNPROVIDED)), result);
                                                    }
                                                }
                                            }
                                        } finally {
                                            at_vars.$at_formula$.rebind(_prev_bind_1_73, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_0_72, thread);
                                        }
                                    }
                                    clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                                    clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
                                } finally {
                                    at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_71, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_70, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_69, thread);
                                }
                            }
                        }
                    } finally {
                        at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_5, thread);
                        at_vars.$at_defns_availableP$.rebind(_prev_bind_4, thread);
                        wff_vars.$recognize_variablesP$.rebind(_prev_bind_3, thread);
                        at_vars.$at_argnum$.rebind(_prev_bind_2, thread);
                        at_vars.$at_arg$.rebind(_prev_bind_1, thread);
                        at_vars.$at_formula$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static SubLObject pred_arg_isa_requires_other_arg_isa(final SubLObject pred, final SubLObject arg_isa, final SubLObject arg, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject literal = make_el_query_literal(pred);
        final SubLObject _prev_bind_0 = at_vars.$at_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_argnum$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            at_vars.$at_formula$.bind(list_utilities.replace_nth(arg, arg_isa, literal), thread);
            at_vars.$at_arg$.bind(arg_isa, thread);
            at_vars.$at_argnum$.bind(arg, thread);
            wff_vars.$recognize_variablesP$.bind(NIL, thread);
            at_vars.$at_defns_availableP$.bind(NIL, thread);
            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$86 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$87 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$88 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind(T, thread);
                final SubLObject _prev_bind_0_$87 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_1_$88 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(at_vars.$at_formula$.getDynamicValue(thread)), thread);
                    at_vars.$at_formula$.bind(at_vars.$at_formula$.getDynamicValue(thread), thread);
                    SubLObject n = ZERO_INTEGER;
                    SubLObject cdolist_list_var = literal_args(at_vars.$at_formula$.getDynamicValue(thread), UNPROVIDED);
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        n = add(n, ONE_INTEGER);
                        if (n.numE(arg)) {
                            arg_type.arg_isa_arg_types_okP(pred, v_term, arg, mt);
                        } else {
                            arg_type.relation_arg_okP(pred, v_term, n, UNPROVIDED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    } 
                    n = ZERO_INTEGER;
                    cdolist_list_var = literal_args(at_vars.$at_formula$.getDynamicValue(thread), UNPROVIDED);
                    v_term = NIL;
                    v_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        n = add(n, ONE_INTEGER);
                        if (!arg_isa.eql(v_term)) {
                            result = cons(list(n, genls.min_cols(list_utilities.remove_duplicate_forts(gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), UNPROVIDED)), mt, UNPROVIDED)), result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    } 
                } finally {
                    at_vars.$at_formula$.rebind(_prev_bind_1_$88, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_$87, thread);
                }
                clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            } finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$88, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$87, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$86, thread);
            }
        } finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_6, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_5, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_4, thread);
            at_vars.$at_argnum$.rebind(_prev_bind_3, thread);
            at_vars.$at_arg$.rebind(_prev_bind_2, thread);
            at_vars.$at_formula$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static final SubLObject make_el_query_literal_alt(SubLObject pred) {
        {
            SubLObject v_arity = arity.arity(pred);
            SubLObject literal = list(pred);
            if (NIL != valid_arity_p(v_arity)) {
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                        literal = cons(czer_utilities.get_nth_canonical_variable(i, $EL_VAR), literal);
                    }
                }
            }
            return nreverse(literal);
        }
    }

    public static SubLObject make_el_query_literal(final SubLObject pred) {
        final SubLObject v_arity = arity.arity(pred);
        SubLObject literal = list(pred);
        if (NIL != valid_arity_p(v_arity)) {
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                literal = cons(czer_utilities.get_nth_canonical_variable(i, $EL_VAR), literal);
            }
        }
        return nreverse(literal);
    }

    /**
     * returns list of gafs to which the argIsa ASSERTION is applicable
     */
    @LispMethod(comment = "returns list of gafs to which the argIsa ASSERTION is applicable")
    public static final SubLObject arg_isa_applicable_gafs_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject relation = assertions_high.gaf_arg1(assertion);
                SubLObject result = NIL;
                if (NIL != forts.fort_p(relation)) {
                    {
                        SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
                        try {
                            $mapping_answer$.bind(NIL, thread);
                            if (NIL != fort_types_interface.predicateP(relation)) {
                                {
                                    SubLObject _prev_bind_0_74 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        genl_predicates.map_spec_preds(relation, GATHER_VIA_MAP_PRED_INDEX, UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_74, thread);
                                    }
                                }
                            } else {
                                {
                                    SubLObject _prev_bind_0_75 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        kb_mapping.map_predicate_extent_index(GATHER_ASSERTIONS, relation, $TRUE, UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_75, thread);
                                    }
                                }
                            }
                            result = $mapping_answer$.getDynamicValue(thread);
                        } finally {
                            $mapping_answer$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * returns list of gafs to which the argIsa ASSERTION is applicable
     */
    @LispMethod(comment = "returns list of gafs to which the argIsa ASSERTION is applicable")
    public static SubLObject arg_isa_applicable_gafs(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject relation = assertions_high.gaf_arg1(assertion);
        SubLObject result = NIL;
        if (NIL != forts.fort_p(relation)) {
            final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
            try {
                $mapping_answer$.bind(NIL, thread);
                if (NIL != fort_types_interface.predicateP(relation)) {
                    final SubLObject _prev_bind_0_$91 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        genl_predicates.map_spec_preds(relation, GATHER_VIA_MAP_PRED_INDEX, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$91, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0_$92 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kb_mapping.map_predicate_extent_index(GATHER_ASSERTIONS, relation, $TRUE, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$92, thread);
                    }
                }
                result = $mapping_answer$.getDynamicValue(thread);
            } finally {
                $mapping_answer$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }/**
     * returns list of gafs to which the argIsa ASSERTION is applicable
     */


    public static final SubLObject gather_via_map_pred_index_alt(SubLObject predicate) {
        if (NIL != forts.fort_p(predicate)) {
            kb_mapping.map_predicate_extent_index(GATHER_ASSERTIONS, predicate, $TRUE, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject gather_via_map_pred_index(final SubLObject predicate) {
        if (NIL != forts.fort_p(predicate)) {
            kb_mapping.map_predicate_extent_index(GATHER_ASSERTIONS, predicate, $TRUE, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject inter_arg_isa_cache_initializedP_alt() {
        return set.set_p($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject inter_arg_isa_cache_initializedP() {
        return set.set_p($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static final SubLObject some_inter_arg_isa_assertion_somewhere_cache_add_int_alt(SubLObject reln) {
        return set.set_add(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_add_int(final SubLObject reln) {
        return set.set_add(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static final SubLObject some_inter_arg_isa_assertion_somewhere_cache_remove_int_alt(SubLObject reln) {
        return set.set_remove(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_remove_int(final SubLObject reln) {
        return set.set_remove(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static final SubLObject some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int_alt(SubLObject reln) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject ind_argnum = NIL;
            for (ind_argnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ind_argnum = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_76 = czer_vars.$arg_positions$.getGlobalValue();
                    SubLObject dep_argnum = NIL;
                    for (dep_argnum = cdolist_list_var_76.first(); NIL != cdolist_list_var_76; cdolist_list_var_76 = cdolist_list_var_76.rest() , dep_argnum = cdolist_list_var_76.first()) {
                        {
                            SubLObject inter_arg_isa_pred = com.cyc.cycjava.cycl.at_utilities.inter_arg_isa_pred(ind_argnum, dep_argnum);
                            if (NIL != inter_arg_isa_pred) {
                                count = add(count, kb_indexing.num_gaf_arg_index(reln, ONE_INTEGER, inter_arg_isa_pred, UNPROVIDED));
                            }
                        }
                    }
                }
            }
            if (count.numLE(ONE_INTEGER)) {
                return com.cyc.cycjava.cycl.at_utilities.some_inter_arg_isa_assertion_somewhere_cache_remove_int(reln);
            }
        }
        return NIL;
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int(final SubLObject reln) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
        SubLObject ind_argnum = NIL;
        ind_argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$93 = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject dep_argnum = NIL;
            dep_argnum = cdolist_list_var_$93.first();
            while (NIL != cdolist_list_var_$93) {
                final SubLObject inter_arg_isa_pred = inter_arg_isa_pred(ind_argnum, dep_argnum);
                if (NIL != inter_arg_isa_pred) {
                    count = add(count, kb_indexing.num_gaf_arg_index(reln, ONE_INTEGER, inter_arg_isa_pred, UNPROVIDED));
                }
                cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                dep_argnum = cdolist_list_var_$93.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            ind_argnum = cdolist_list_var.first();
        } 
        if (count.numLE(ONE_INTEGER)) {
            return some_inter_arg_isa_assertion_somewhere_cache_remove_int(reln);
        }
        return NIL;
    }

    public static final SubLObject some_inter_arg_isa_assertion_somewhere_cache_add_alt(SubLObject reln) {
        if (NIL != com.cyc.cycjava.cycl.at_utilities.inter_arg_isa_cache_initializedP()) {
            return com.cyc.cycjava.cycl.at_utilities.some_inter_arg_isa_assertion_somewhere_cache_add_int(reln);
        }
        return NIL;
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_add(final SubLObject reln) {
        if (NIL != inter_arg_isa_cache_initializedP()) {
            return some_inter_arg_isa_assertion_somewhere_cache_add_int(reln);
        }
        return NIL;
    }

    public static final SubLObject some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_alt(SubLObject reln) {
        if (NIL != com.cyc.cycjava.cycl.at_utilities.inter_arg_isa_cache_initializedP()) {
            return com.cyc.cycjava.cycl.at_utilities.some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int(reln);
        }
        return NIL;
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_maybe_remove(final SubLObject reln) {
        if (NIL != inter_arg_isa_cache_initializedP()) {
            return some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int(reln);
        }
        return NIL;
    }

    public static final SubLObject clear_some_inter_arg_isa_assertion_somewhere_cache_alt() {
        if (NIL != set.set_p($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue())) {
            set.clear_set($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
        } else {
            $some_inter_arg_isa_assertion_somewhere_cache$.setGlobalValue(set.new_set(EQ, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject clear_some_inter_arg_isa_assertion_somewhere_cache() {
        if (NIL != set.set_p($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue())) {
            set.clear_set($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
        } else {
            $some_inter_arg_isa_assertion_somewhere_cache$.setGlobalValue(set.new_set(EQL, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject initialize_some_inter_arg_isa_assertion_somewhere_cache_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.at_utilities.clear_some_inter_arg_isa_assertion_somewhere_cache();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject list_var = czer_vars.$arg_positions$.getGlobalValue();
                        $progress_note$.setDynamicValue($str_alt61$Initializing___interArgIsa_cache, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(length(list_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0_77 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1_78 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject ind_argnum = NIL;
                                    for (ind_argnum = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , ind_argnum = csome_list_var.first()) {
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                                            SubLObject dep_argnum = NIL;
                                            for (dep_argnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dep_argnum = cdolist_list_var.first()) {
                                                if (!ind_argnum.eql(dep_argnum)) {
                                                    {
                                                        SubLObject inter_arg_isa_pred = com.cyc.cycjava.cycl.at_utilities.inter_arg_isa_pred(ind_argnum, dep_argnum);
                                                        if (NIL != inter_arg_isa_pred) {
                                                            {
                                                                SubLObject pred_var = inter_arg_isa_pred;
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
                                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                            {
                                                                                                SubLObject done_var_79 = NIL;
                                                                                                SubLObject token_var_80 = NIL;
                                                                                                while (NIL == done_var_79) {
                                                                                                    {
                                                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_80);
                                                                                                        SubLObject valid_81 = makeBoolean(token_var_80 != ass);
                                                                                                        if (NIL != valid_81) {
                                                                                                            {
                                                                                                                SubLObject reln = assertions_high.gaf_arg1(ass);
                                                                                                                com.cyc.cycjava.cycl.at_utilities.some_inter_arg_isa_assertion_somewhere_cache_add_int(reln);
                                                                                                            }
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
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1_78, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_77, thread);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return set.set_size($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
        }
    }

    public static SubLObject initialize_some_inter_arg_isa_assertion_somewhere_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_some_inter_arg_isa_assertion_somewhere_cache();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject list_var = czer_vars.$arg_positions$.getGlobalValue();
            final SubLObject _prev_bind_0_$94 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$95 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str79$Initializing___interArgIsa_cache, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject ind_argnum = NIL;
                    ind_argnum = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                        SubLObject dep_argnum = NIL;
                        dep_argnum = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (!ind_argnum.eql(dep_argnum)) {
                                final SubLObject inter_arg_isa_pred = inter_arg_isa_pred(ind_argnum, dep_argnum);
                                if (NIL != inter_arg_isa_pred) {
                                    final SubLObject pred_var = inter_arg_isa_pred;
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        final SubLObject str = NIL;
                                        final SubLObject _prev_bind_0_$95 = $progress_start_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$96 = $progress_last_pacification_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$98 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                        final SubLObject _prev_bind_3_$99 = $progress_notification_count$.currentBinding(thread);
                                        final SubLObject _prev_bind_4_$100 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                                        final SubLObject _prev_bind_5_$101 = $progress_count$.currentBinding(thread);
                                        final SubLObject _prev_bind_6_$102 = $is_noting_progressP$.currentBinding(thread);
                                        final SubLObject _prev_bind_7_$103 = $silent_progressP$.currentBinding(thread);
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
                                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = NIL;
                                            final SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                if (NIL != valid) {
                                                    note_progress();
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        SubLObject done_var_$104 = NIL;
                                                        final SubLObject token_var_$105 = NIL;
                                                        while (NIL == done_var_$104) {
                                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$105);
                                                            final SubLObject valid_$106 = makeBoolean(!token_var_$105.eql(ass));
                                                            if (NIL != valid_$106) {
                                                                final SubLObject reln = assertions_high.gaf_arg1(ass);
                                                                some_inter_arg_isa_assertion_somewhere_cache_add_int(reln);
                                                            }
                                                            done_var_$104 = makeBoolean(NIL == valid_$106);
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$96 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            } 
                                            noting_progress_postamble();
                                        } finally {
                                            $silent_progressP$.rebind(_prev_bind_7_$103, thread);
                                            $is_noting_progressP$.rebind(_prev_bind_6_$102, thread);
                                            $progress_count$.rebind(_prev_bind_5_$101, thread);
                                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$100, thread);
                                            $progress_notification_count$.rebind(_prev_bind_3_$99, thread);
                                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$98, thread);
                                            $progress_last_pacification_time$.rebind(_prev_bind_1_$96, thread);
                                            $progress_start_time$.rebind(_prev_bind_0_$95, thread);
                                        }
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            dep_argnum = cdolist_list_var.first();
                        } 
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ind_argnum = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$97 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$95, thread);
                $progress_note$.rebind(_prev_bind_0_$94, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_size($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static final SubLObject some_inter_arg_isa_assertion_somewhereP_alt(SubLObject reln) {
        return set.set_memberP(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_isa_assertion_somewhereP(final SubLObject reln) {
        return set.set_memberP(reln, $some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }

    public static final SubLObject some_inter_arg_isa_constraint_somewhereP_alt(SubLObject reln) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject found_oneP = NIL;
                if (NIL != fort_types_interface.predicateP(reln)) {
                    if (NIL == found_oneP) {
                        {
                            SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                            SubLObject node_var = reln;
                            SubLObject deck_type = ($DEPTH == $DEPTH) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = NIL;
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_83 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt69$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt69$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt69$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt74$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt69$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_84 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_85 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_86 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_87 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_88 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while ((NIL != node_and_predicate_mode) && (NIL == found_oneP)) {
                                                                        {
                                                                            SubLObject node_var_89 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject genl_pred = node_var_89;
                                                                            {
                                                                                SubLObject _prev_bind_0_90 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    {
                                                                                        SubLObject inverse_mode = predicate_mode;
                                                                                        if (NIL != com.cyc.cycjava.cycl.at_utilities.some_inter_arg_isa_assertion_somewhereP(genl_pred)) {
                                                                                            found_oneP = T;
                                                                                        }
                                                                                        {
                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                                                            SubLObject rest = NIL;
                                                                                            for (rest = accessible_modules; !((NIL != found_oneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                {
                                                                                                    SubLObject module_var = rest.first();
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_91 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_92 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_89);
                                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                    {
                                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != d_link) {
                                                                                                                            {
                                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != mt_links) {
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                        while (!((NIL != found_oneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_93 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_94 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (!((NIL != found_oneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_94)))) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_94);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_95 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject rest_96 = NIL;
                                                                                                                                                                                        for (rest_96 = new_list; !((NIL != found_oneP) || (NIL == rest_96)); rest_96 = rest_96.rest()) {
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject node_vars_link_node = rest_96.first();
                                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_95, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_94 = dictionary_contents.do_dictionary_contents_next(iteration_state_94);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_94);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_93, thread);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                            }
                                                                                                                                        } 
                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt75$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject rest_97 = NIL;
                                                                                                                            for (rest_97 = new_list; !((NIL != found_oneP) || (NIL == rest_97)); rest_97 = rest_97.rest()) {
                                                                                                                                {
                                                                                                                                    SubLObject generating_fn = rest_97.first();
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_98 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                SubLObject new_list_99 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                SubLObject rest_100 = NIL;
                                                                                                                                                for (rest_100 = new_list_99; !((NIL != found_oneP) || (NIL == rest_100)); rest_100 = rest_100.rest()) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject node_vars_link_node = rest_100.first();
                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_98, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_92, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_91, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_90, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_88, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_87, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_86, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt76$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_85, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_84, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_83, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } else {
                    found_oneP = com.cyc.cycjava.cycl.at_utilities.some_inter_arg_isa_assertion_somewhereP(reln);
                }
                return found_oneP;
            }
        }
    }

    public static SubLObject some_inter_arg_isa_constraint_somewhereP(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_oneP = NIL;
        if (NIL != fort_types_interface.predicateP(reln)) {
            if (NIL == found_oneP) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                final SubLObject deck_type = ($DEPTH == $DEPTH) ? $STACK : $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str93$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$110 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$111 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$111 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$112 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$114 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln, UNPROVIDED);
                                        for (node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == found_oneP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$115 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$115;
                                            final SubLObject _prev_bind_0_$112 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_mode = predicate_mode;
                                                if (NIL != some_inter_arg_isa_assertion_somewhereP(genl_pred)) {
                                                    found_oneP = T;
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$113;
                                                SubLObject _prev_bind_1_$113;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$114;
                                                SubLObject iteration_state_$120;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$115;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$122;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$116;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == found_oneP) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$113 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$113 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$115);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$114 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$120 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$120)); iteration_state_$120 = dictionary_contents.do_dictionary_contents_next(iteration_state_$120)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$120);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$115 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == found_oneP) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while ((NIL == found_oneP) && (NIL != csome_list_var)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str94$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$115, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$120);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$114, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str95$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$122 = NIL, rest_$122 = new_list; (NIL == found_oneP) && (NIL != rest_$122); rest_$122 = rest_$122.rest()) {
                                                                    generating_fn = rest_$122.first();
                                                                    _prev_bind_0_$116 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == found_oneP) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while ((NIL == found_oneP) && (NIL != csome_list_var2)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str94$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$116, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$113, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$113, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$112, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$114, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$112, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$111, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str96$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$111, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$110, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$109, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$117 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            found_oneP = some_inter_arg_isa_assertion_somewhereP(reln);
        }
        return found_oneP;
    }

    public static final SubLObject inter_arg_format_cache_initializedP_alt() {
        return set.set_p($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject inter_arg_format_cache_initializedP() {
        return set.set_p($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static final SubLObject some_inter_arg_format_assertion_somewhere_cache_add_int_alt(SubLObject reln) {
        return set.set_add(reln, $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_add_int(final SubLObject reln) {
        return set.set_add(reln, $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static final SubLObject some_inter_arg_format_assertion_somewhere_cache_remove_int_alt(SubLObject reln) {
        return set.set_remove(reln, $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_remove_int(final SubLObject reln) {
        return set.set_remove(reln, $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static final SubLObject some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int_alt(SubLObject reln) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject ind_argnum = NIL;
            for (ind_argnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ind_argnum = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_101 = czer_vars.$arg_positions$.getGlobalValue();
                    SubLObject dep_argnum = NIL;
                    for (dep_argnum = cdolist_list_var_101.first(); NIL != cdolist_list_var_101; cdolist_list_var_101 = cdolist_list_var_101.rest() , dep_argnum = cdolist_list_var_101.first()) {
                        {
                            SubLObject inter_arg_format_pred = kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
                            if (NIL != inter_arg_format_pred) {
                                count = add(count, kb_indexing.num_gaf_arg_index(reln, ONE_INTEGER, inter_arg_format_pred, UNPROVIDED));
                            }
                        }
                    }
                }
            }
            if (count.numLE(ONE_INTEGER)) {
                return com.cyc.cycjava.cycl.at_utilities.some_inter_arg_format_assertion_somewhere_cache_remove_int(reln);
            }
        }
        return NIL;
    }

    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int(final SubLObject reln) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
        SubLObject ind_argnum = NIL;
        ind_argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$125 = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject dep_argnum = NIL;
            dep_argnum = cdolist_list_var_$125.first();
            while (NIL != cdolist_list_var_$125) {
                final SubLObject inter_arg_format_pred = kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
                if (NIL != inter_arg_format_pred) {
                    count = add(count, kb_indexing.num_gaf_arg_index(reln, ONE_INTEGER, inter_arg_format_pred, UNPROVIDED));
                }
                cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                dep_argnum = cdolist_list_var_$125.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            ind_argnum = cdolist_list_var.first();
        } 
        if (count.numLE(ONE_INTEGER)) {
            return some_inter_arg_format_assertion_somewhere_cache_remove_int(reln);
        }
        return NIL;
    }

    public static final SubLObject some_inter_arg_format_assertion_somewhere_cache_add_alt(SubLObject reln) {
        if (NIL != com.cyc.cycjava.cycl.at_utilities.inter_arg_format_cache_initializedP()) {
            return com.cyc.cycjava.cycl.at_utilities.some_inter_arg_format_assertion_somewhere_cache_add_int(reln);
        }
        return NIL;
    }

    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_add(final SubLObject reln) {
        if (NIL != inter_arg_format_cache_initializedP()) {
            return some_inter_arg_format_assertion_somewhere_cache_add_int(reln);
        }
        return NIL;
    }

    public static final SubLObject some_inter_arg_format_assertion_somewhere_cache_maybe_remove_alt(SubLObject reln) {
        if (NIL != com.cyc.cycjava.cycl.at_utilities.inter_arg_format_cache_initializedP()) {
            return com.cyc.cycjava.cycl.at_utilities.some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int(reln);
        }
        return NIL;
    }

    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_maybe_remove(final SubLObject reln) {
        if (NIL != inter_arg_format_cache_initializedP()) {
            return some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int(reln);
        }
        return NIL;
    }

    public static final SubLObject clear_some_inter_arg_format_assertion_somewhere_cache_alt() {
        if (NIL != set.set_p($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue())) {
            set.clear_set($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
        } else {
            $some_inter_arg_format_assertion_somewhere_cache$.setGlobalValue(set.new_set(EQ, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject clear_some_inter_arg_format_assertion_somewhere_cache() {
        if (NIL != set.set_p($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue())) {
            set.clear_set($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
        } else {
            $some_inter_arg_format_assertion_somewhere_cache$.setGlobalValue(set.new_set(EQL, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject initialize_some_inter_arg_format_assertion_somewhere_cache_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.at_utilities.clear_some_inter_arg_format_assertion_somewhere_cache();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject list_var = czer_vars.$arg_positions$.getGlobalValue();
                        $progress_note$.setDynamicValue($str_alt78$Initializing___interArgFormat_cac, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(length(list_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0_102 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1_103 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject ind_argnum = NIL;
                                    for (ind_argnum = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , ind_argnum = csome_list_var.first()) {
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                                            SubLObject dep_argnum = NIL;
                                            for (dep_argnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dep_argnum = cdolist_list_var.first()) {
                                                {
                                                    SubLObject inter_arg_format_pred = kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
                                                    if (NIL != inter_arg_format_pred) {
                                                        {
                                                            SubLObject pred_var = inter_arg_format_pred;
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
                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                        {
                                                                                            SubLObject done_var_104 = NIL;
                                                                                            SubLObject token_var_105 = NIL;
                                                                                            while (NIL == done_var_104) {
                                                                                                {
                                                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_105);
                                                                                                    SubLObject valid_106 = makeBoolean(token_var_105 != ass);
                                                                                                    if (NIL != valid_106) {
                                                                                                        {
                                                                                                            SubLObject reln = assertions_high.gaf_arg1(ass);
                                                                                                            com.cyc.cycjava.cycl.at_utilities.some_inter_arg_format_assertion_somewhere_cache_add_int(reln);
                                                                                                        }
                                                                                                    }
                                                                                                    done_var_104 = makeBoolean(NIL == valid_106);
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_107 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                if (NIL != final_index_iterator) {
                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                }
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_107, thread);
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
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1_103, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_102, thread);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return set.set_size($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
        }
    }

    public static SubLObject initialize_some_inter_arg_format_assertion_somewhere_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_some_inter_arg_format_assertion_somewhere_cache();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject list_var = czer_vars.$arg_positions$.getGlobalValue();
            final SubLObject _prev_bind_0_$126 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$127 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str98$Initializing___interArgFormat_cac, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject ind_argnum = NIL;
                    ind_argnum = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                        SubLObject dep_argnum = NIL;
                        dep_argnum = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject inter_arg_format_pred = kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
                            if (NIL != inter_arg_format_pred) {
                                final SubLObject pred_var = inter_arg_format_pred;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    final SubLObject str = NIL;
                                    final SubLObject _prev_bind_0_$127 = $progress_start_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$128 = $progress_last_pacification_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$130 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$131 = $progress_notification_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_4_$132 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                                    final SubLObject _prev_bind_5_$133 = $progress_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_6_$134 = $is_noting_progressP$.currentBinding(thread);
                                    final SubLObject _prev_bind_7_$135 = $silent_progressP$.currentBinding(thread);
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
                                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                note_progress();
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                    SubLObject done_var_$136 = NIL;
                                                    final SubLObject token_var_$137 = NIL;
                                                    while (NIL == done_var_$136) {
                                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$137);
                                                        final SubLObject valid_$138 = makeBoolean(!token_var_$137.eql(ass));
                                                        if (NIL != valid_$138) {
                                                            final SubLObject reln = assertions_high.gaf_arg1(ass);
                                                            some_inter_arg_format_assertion_somewhere_cache_add_int(reln);
                                                        }
                                                        done_var_$136 = makeBoolean(NIL == valid_$138);
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$128 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        } 
                                        noting_progress_postamble();
                                    } finally {
                                        $silent_progressP$.rebind(_prev_bind_7_$135, thread);
                                        $is_noting_progressP$.rebind(_prev_bind_6_$134, thread);
                                        $progress_count$.rebind(_prev_bind_5_$133, thread);
                                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$132, thread);
                                        $progress_notification_count$.rebind(_prev_bind_3_$131, thread);
                                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$130, thread);
                                        $progress_last_pacification_time$.rebind(_prev_bind_1_$128, thread);
                                        $progress_start_time$.rebind(_prev_bind_0_$127, thread);
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            dep_argnum = cdolist_list_var.first();
                        } 
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ind_argnum = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$129 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$127, thread);
                $progress_note$.rebind(_prev_bind_0_$126, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_size($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static final SubLObject some_inter_arg_format_assertion_somewhereP_alt(SubLObject reln) {
        return set.set_memberP(reln, $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static SubLObject some_inter_arg_format_assertion_somewhereP(final SubLObject reln) {
        return set.set_memberP(reln, $some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }

    public static final SubLObject some_inter_arg_format_constraint_somewhereP_alt(SubLObject reln) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject found_oneP = NIL;
                if (NIL != fort_types_interface.predicateP(reln)) {
                    if (NIL == found_oneP) {
                        {
                            SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                            SubLObject node_var = reln;
                            SubLObject deck_type = ($DEPTH == $DEPTH) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = NIL;
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_108 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt69$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt69$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt69$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt74$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt69$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_109 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_110 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_111 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_112 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_113 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while ((NIL != node_and_predicate_mode) && (NIL == found_oneP)) {
                                                                        {
                                                                            SubLObject node_var_114 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject genl_pred = node_var_114;
                                                                            {
                                                                                SubLObject _prev_bind_0_115 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    {
                                                                                        SubLObject inverse_mode = predicate_mode;
                                                                                        if (NIL != com.cyc.cycjava.cycl.at_utilities.some_inter_arg_format_assertion_somewhereP(genl_pred)) {
                                                                                            found_oneP = T;
                                                                                        }
                                                                                        {
                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                                                            SubLObject rest = NIL;
                                                                                            for (rest = accessible_modules; !((NIL != found_oneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                {
                                                                                                    SubLObject module_var = rest.first();
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_116 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_117 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_114);
                                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                    {
                                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != d_link) {
                                                                                                                            {
                                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != mt_links) {
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                        while (!((NIL != found_oneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_118 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_119 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (!((NIL != found_oneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_119)))) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_119);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_120 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject rest_121 = NIL;
                                                                                                                                                                                        for (rest_121 = new_list; !((NIL != found_oneP) || (NIL == rest_121)); rest_121 = rest_121.rest()) {
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject node_vars_link_node = rest_121.first();
                                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_120, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_119 = dictionary_contents.do_dictionary_contents_next(iteration_state_119);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_119);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_118, thread);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                            }
                                                                                                                                        } 
                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt75$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject rest_122 = NIL;
                                                                                                                            for (rest_122 = new_list; !((NIL != found_oneP) || (NIL == rest_122)); rest_122 = rest_122.rest()) {
                                                                                                                                {
                                                                                                                                    SubLObject generating_fn = rest_122.first();
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_123 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                SubLObject new_list_124 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                SubLObject rest_125 = NIL;
                                                                                                                                                for (rest_125 = new_list_124; !((NIL != found_oneP) || (NIL == rest_125)); rest_125 = rest_125.rest()) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject node_vars_link_node = rest_125.first();
                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_123, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_117, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_116, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_115, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_113, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_112, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_111, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt76$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_110, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_109, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_108, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } else {
                    found_oneP = com.cyc.cycjava.cycl.at_utilities.some_inter_arg_format_assertion_somewhereP(reln);
                }
                return found_oneP;
            }
        }
    }

    public static SubLObject some_inter_arg_format_constraint_somewhereP(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_oneP = NIL;
        if (NIL != fort_types_interface.predicateP(reln)) {
            if (NIL == found_oneP) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                final SubLObject deck_type = ($DEPTH == $DEPTH) ? $STACK : $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$141 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str93$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str88$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$142 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$143 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$143 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$144 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$146 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln, UNPROVIDED);
                                        for (node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == found_oneP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$147 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$147;
                                            final SubLObject _prev_bind_0_$144 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_mode = predicate_mode;
                                                if (NIL != some_inter_arg_format_assertion_somewhereP(genl_pred)) {
                                                    found_oneP = T;
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$145;
                                                SubLObject _prev_bind_1_$145;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$146;
                                                SubLObject iteration_state_$152;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$147;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$154;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$148;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == found_oneP) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$145 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$145 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$147);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$146 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$152 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == found_oneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$152)); iteration_state_$152 = dictionary_contents.do_dictionary_contents_next(iteration_state_$152)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$152);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$147 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == found_oneP) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while ((NIL == found_oneP) && (NIL != csome_list_var)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str94$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$147, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$152);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$146, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str95$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$154 = NIL, rest_$154 = new_list; (NIL == found_oneP) && (NIL != rest_$154); rest_$154 = rest_$154.rest()) {
                                                                    generating_fn = rest_$154.first();
                                                                    _prev_bind_0_$148 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == found_oneP) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while ((NIL == found_oneP) && (NIL != csome_list_var2)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str94$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$148, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$145, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$145, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$144, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$146, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$144, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$143, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str96$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$143, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$142, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$141, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$149 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$149, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            found_oneP = some_inter_arg_format_assertion_somewhereP(reln);
        }
        return found_oneP;
    }

    /**
     *
     *
     * @return boolean; t iff RELATION permits generic arg variables in the position constrained by ARG-ISA-PRED.
     */
    @LispMethod(comment = "@return boolean; t iff RELATION permits generic arg variables in the position constrained by ARG-ISA-PRED.")
    public static final SubLObject reln_permits_generic_arg_variablesP_alt(SubLObject relation, SubLObject arg_isa_pred) {
        return com.cyc.cycjava.cycl.at_utilities.reln_constrained_to_be_collectionP(relation, arg_isa_pred, $$GenericArgTemplate);
    }

    /**
     *
     *
     * @return boolean; t iff RELATION permits generic arg variables in the position constrained by ARG-ISA-PRED.
     */
    @LispMethod(comment = "@return boolean; t iff RELATION permits generic arg variables in the position constrained by ARG-ISA-PRED.")
    public static SubLObject reln_permits_generic_arg_variablesP(final SubLObject relation, final SubLObject arg_isa_pred) {
        return reln_constrained_to_be_collectionP(relation, arg_isa_pred, $$GenericArgTemplate);
    }

    /**
     *
     *
     * @return boolean; t iff RELATION permits keyword variables in the position constrained by ARG-ISA-PRED.
     */
    @LispMethod(comment = "@return boolean; t iff RELATION permits keyword variables in the position constrained by ARG-ISA-PRED.")
    public static final SubLObject reln_permits_keyword_variablesP_alt(SubLObject relation, SubLObject arg_isa_pred) {
        return com.cyc.cycjava.cycl.at_utilities.reln_constrained_to_be_collectionP(relation, arg_isa_pred, $$KeywordVariableTemplate);
    }

    /**
     *
     *
     * @return boolean; t iff RELATION permits keyword variables in the position constrained by ARG-ISA-PRED.
     */
    @LispMethod(comment = "@return boolean; t iff RELATION permits keyword variables in the position constrained by ARG-ISA-PRED.")
    public static SubLObject reln_permits_keyword_variablesP(final SubLObject relation, final SubLObject arg_isa_pred) {
        return reln_constrained_to_be_collectionP(relation, arg_isa_pred, $$KeywordVariableTemplate);
    }

    /**
     *
     *
     * @return boolean; t iff RELATION is constrained to take an instance of COLLECTION in the position constrained by ARG-ISA-PRED.
     */
    @LispMethod(comment = "@return boolean; t iff RELATION is constrained to take an instance of COLLECTION in the position constrained by ARG-ISA-PRED.")
    public static final SubLObject reln_constrained_to_be_collectionP_alt(SubLObject relation, SubLObject arg_isa_pred, SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(arg_isa_pred)) {
                {
                    SubLObject constrained_argnum = com.cyc.cycjava.cycl.at_utilities.constraint_pred_constraint_argnum(arg_isa_pred);
                    if (NIL == constrained_argnum) {
                        constrained_argnum = TWO_INTEGER;
                    }
                    return genls.genl_of_any_argP(collection, relation, arg_isa_pred, mt_relevance_macros.$mt$.getDynamicValue(thread), ONE_INTEGER, constrained_argnum, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return boolean; t iff RELATION is constrained to take an instance of COLLECTION in the position constrained by ARG-ISA-PRED.
     */
    @LispMethod(comment = "@return boolean; t iff RELATION is constrained to take an instance of COLLECTION in the position constrained by ARG-ISA-PRED.")
    public static SubLObject reln_constrained_to_be_collectionP(final SubLObject relation, final SubLObject arg_isa_pred, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(arg_isa_pred)) {
            SubLObject constrained_argnum = constraint_pred_constraint_argnum(arg_isa_pred);
            if (NIL == constrained_argnum) {
                constrained_argnum = TWO_INTEGER;
            }
            return genls.genl_of_any_argP(collection, relation, arg_isa_pred, mt_relevance_macros.$mt$.getDynamicValue(thread), ONE_INTEGER, constrained_argnum, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Returns the arg-type constraint argnum of the arg constraint predicate PRED.
     *
     * @unknown pace
     * @unknown assumes that #$ArgTypeBinaryPredicate and #$ArgTypeTernaryPredicate are ANECTs
     */
    @LispMethod(comment = "Returns the arg-type constraint argnum of the arg constraint predicate PRED.\r\n\r\n@unknown pace\r\n@unknown assumes that #$ArgTypeBinaryPredicate and #$ArgTypeTernaryPredicate are ANECTs")
    public static final SubLObject constraint_pred_constraint_argnum_alt(SubLObject pred) {
        if ((((NIL != subl_promotions.memberP(pred, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_quoted_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_format_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            return TWO_INTEGER;
        } else {
            if ((((NIL != subl_promotions.memberP(pred, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_quoted_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_format_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                return THREE_INTEGER;
            } else {
                if (((NIL != fort_types_interface.isa_arg_type_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue())) || (NIL != fort_types_interface.isa_arg_quoted_isa_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) || (NIL != fort_types_interface.isa_arg_format_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) {
                    return TWO_INTEGER;
                } else {
                    if (((NIL != fort_types_interface.isa_arg_type_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue())) || (NIL != fort_types_interface.isa_arg_quoted_isa_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) || (NIL != fort_types_interface.isa_arg_format_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) {
                        return THREE_INTEGER;
                    } else {
                        com.cyc.cycjava.cycl.at_utilities.at_error(THREE_INTEGER, $str_alt81$got_an_arg_type_predicate___s__th, pred, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Returns the arg-type constraint argnum of the arg constraint predicate PRED.
     *
     * @unknown pace
     * @unknown assumes that #$ArgTypeBinaryPredicate and #$ArgTypeTernaryPredicate are ANECTs
     */
    @LispMethod(comment = "Returns the arg-type constraint argnum of the arg constraint predicate PRED.\r\n\r\n@unknown pace\r\n@unknown assumes that #$ArgTypeBinaryPredicate and #$ArgTypeTernaryPredicate are ANECTs")
    public static SubLObject constraint_pred_constraint_argnum(final SubLObject pred) {
        if (((((NIL != subl_promotions.memberP(pred, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_not_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_quoted_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_format_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            return TWO_INTEGER;
        }
        if (((((NIL != subl_promotions.memberP(pred, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_not_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_quoted_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(pred, czer_vars.$arg_format_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            return THREE_INTEGER;
        }
        if (((NIL != fort_types_interface.isa_arg_type_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue())) || (NIL != fort_types_interface.isa_arg_quoted_isa_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) || (NIL != fort_types_interface.isa_arg_format_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) {
            return TWO_INTEGER;
        }
        if (((NIL != fort_types_interface.isa_arg_type_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue())) || (NIL != fort_types_interface.isa_arg_quoted_isa_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) || (NIL != fort_types_interface.isa_arg_format_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()))) {
            return THREE_INTEGER;
        }
        at_error(THREE_INTEGER, $str101$got_an_arg_type_predicate___s__th, pred, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }/**
     * Returns the arg-type constraint argnum of the arg constraint predicate PRED.
     *
     * @unknown pace
     * @unknown assumes that #$ArgTypeBinaryPredicate and #$ArgTypeTernaryPredicate are ANECTs
     */


    /**
     * Returns the arg-type constraint argument of the gaf assertion ASSERTION.
     * Assumes that its arg0 is an arg constraint predicate.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Returns the arg-type constraint argument of the gaf assertion ASSERTION.\r\nAssumes that its arg0 is an arg constraint predicate.\r\n\r\n@unknown pace\nReturns the arg-type constraint argument of the gaf assertion ASSERTION.\nAssumes that its arg0 is an arg constraint predicate.")
    public static final SubLObject gaf_arg_type_constraint_alt(SubLObject assertion) {
        {
            SubLObject argnum = com.cyc.cycjava.cycl.at_utilities.constraint_pred_constraint_argnum(assertions_high.gaf_arg(assertion, ZERO_INTEGER));
            if (argnum.isInteger()) {
                return assertions_high.gaf_arg(assertion, argnum);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Returns the arg-type constraint argument of the gaf assertion ASSERTION.
     * Assumes that its arg0 is an arg constraint predicate.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Returns the arg-type constraint argument of the gaf assertion ASSERTION.\r\nAssumes that its arg0 is an arg constraint predicate.\r\n\r\n@unknown pace\nReturns the arg-type constraint argument of the gaf assertion ASSERTION.\nAssumes that its arg0 is an arg constraint predicate.")
    public static SubLObject gaf_arg_type_constraint(final SubLObject assertion) {
        final SubLObject argnum = constraint_pred_constraint_argnum(assertions_high.gaf_arg(assertion, ZERO_INTEGER));
        if (argnum.isInteger()) {
            return assertions_high.gaf_arg(assertion, argnum);
        }
        return NIL;
    }/**
     * Returns the arg-type constraint argument of the gaf assertion ASSERTION.
     * Assumes that its arg0 is an arg constraint predicate.
     *
     * @unknown pace
     */


    public static final SubLObject gather_at_data_alt(SubLObject assertion, SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.at_utilities.gather_at_constraint(constraint, type, v_term);
                com.cyc.cycjava.cycl.at_utilities.gather_at_assertion(assertion, type, v_term);
            }
            return NIL;
        }
    }

    public static SubLObject gather_at_data(final SubLObject assertion, final SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
            gather_at_constraint(constraint, type, v_term);
            gather_at_assertion(assertion, type, v_term);
        }
        return NIL;
    }

    public static final SubLObject gather_at_data_assertion_alt(SubLObject assertion, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = at_vars.$at_constraint_type$.getDynamicValue();
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.at_utilities.gather_at_assertion(assertion, type, v_term);
                if ($mapping_gather_arg$.getDynamicValue(thread).isInteger()) {
                    {
                        SubLObject constraint = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
                        if (NIL != forts.fort_p(constraint)) {
                            com.cyc.cycjava.cycl.at_utilities.gather_at_constraint(constraint, type, v_term);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gather_at_data_assertion(final SubLObject assertion, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = at_vars.$at_constraint_type$.getDynamicValue();
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
            gather_at_assertion(assertion, type, v_term);
            if ($mapping_gather_arg$.getDynamicValue(thread).isInteger()) {
                final SubLObject constraint = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
                if (NIL != forts.fort_p(constraint)) {
                    gather_at_constraint(constraint, type, v_term);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject gather_at_constraint_alt(SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != at_vars.$gather_at_constraintsP$.getDynamicValue(thread)) && ((NIL == at_vars.$at_profile_term$.getDynamicValue(thread)) || v_term.equal(at_vars.$at_profile_term$.getDynamicValue(thread)))) {
                {
                    SubLObject pcase_var = type;
                    if (pcase_var.eql($ISA)) {
                        hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_isa_constraints$.getDynamicValue(thread));
                    } else {
                        if (pcase_var.eql($GENLS)) {
                            hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_genl_constraints$.getDynamicValue(thread));
                        } else {
                            if (pcase_var.eql($FORMAT)) {
                                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_format_constraints$.getDynamicValue(thread));
                            } else {
                                if (pcase_var.eql($DIFFERENT)) {
                                    hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_different_constraints$.getDynamicValue(thread));
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gather_at_constraint(final SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != at_vars.$gather_at_constraintsP$.getDynamicValue(thread)) && ((NIL == at_vars.$at_profile_term$.getDynamicValue(thread)) || v_term.equal(at_vars.$at_profile_term$.getDynamicValue(thread)))) {
            final SubLObject pcase_var = type;
            if (pcase_var.eql($ISA)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_isa_constraints$.getDynamicValue(thread));
            } else
                if (pcase_var.eql($GENLS)) {
                    hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_genl_constraints$.getDynamicValue(thread));
                } else
                    if (pcase_var.eql($FORMAT)) {
                        hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_format_constraints$.getDynamicValue(thread));
                    } else
                        if (pcase_var.eql($DIFFERENT)) {
                            hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_different_constraints$.getDynamicValue(thread));
                        }



        }
        return NIL;
    }

    public static final SubLObject gather_at_assertion_alt(SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != at_vars.$gather_at_assertionsP$.getDynamicValue(thread)) && ((NIL == at_vars.$at_profile_term$.getDynamicValue(thread)) || v_term.equal(at_vars.$at_profile_term$.getDynamicValue(thread)))) {
                {
                    SubLObject pcase_var = type;
                    if (pcase_var.eql($ISA)) {
                        hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_isa_assertions$.getDynamicValue(thread));
                    } else {
                        if (pcase_var.eql($GENLS)) {
                            hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_genl_assertions$.getDynamicValue(thread));
                        } else {
                            if (pcase_var.eql($FORMAT)) {
                                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_format_assertions$.getDynamicValue(thread));
                            } else {
                                if (pcase_var.eql($DIFFERENT)) {
                                    hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_different_constraints$.getDynamicValue(thread));
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gather_at_assertion(final SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (v_term == UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != at_vars.$gather_at_assertionsP$.getDynamicValue(thread)) && ((NIL == at_vars.$at_profile_term$.getDynamicValue(thread)) || v_term.equal(at_vars.$at_profile_term$.getDynamicValue(thread)))) {
            final SubLObject pcase_var = type;
            if (pcase_var.eql($ISA)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_isa_assertions$.getDynamicValue(thread));
            } else
                if (pcase_var.eql($GENLS)) {
                    hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_genl_assertions$.getDynamicValue(thread));
                } else
                    if (pcase_var.eql($FORMAT)) {
                        hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_format_assertions$.getDynamicValue(thread));
                    } else
                        if (pcase_var.eql($DIFFERENT)) {
                            hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_different_constraints$.getDynamicValue(thread));
                        }



        }
        return NIL;
    }

    public static final SubLObject at_finishedP_alt(SubLObject at_violationsP) {
        if (at_violationsP == UNPROVIDED) {
            at_violationsP = at_vars.$at_result$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != at_violationsP) && (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) && (NIL == at_vars.$gather_at_constraintsP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject at_finishedP(SubLObject at_violationsP) {
        if (at_violationsP == UNPROVIDED) {
            at_violationsP = at_vars.$at_result$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != at_violationsP) && (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) && (NIL == at_vars.$gather_at_constraintsP$.getDynamicValue(thread)));
    }

    public static final SubLObject at_finished_alt(SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        if (NIL != result) {
            at_vars.$at_result$.setDynamicValue(result);
        }
        com.cyc.cycjava.cycl.at_utilities.at_mapping_finished();
        return NIL;
    }

    public static SubLObject at_finished(SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        if (NIL != result) {
            at_vars.$at_result$.setDynamicValue(result);
        }
        at_mapping_finished();
        return NIL;
    }

    public static final SubLObject at_mapping_finished_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != at_vars.$within_at_mappingP$.getDynamicValue(thread)) {
                sublisp_throw($AT_MAPPING_DONE, NIL);
            }
            return NIL;
        }
    }

    public static SubLObject at_mapping_finished() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$within_at_mappingP$.getDynamicValue(thread)) {
            sublisp_throw($AT_MAPPING_DONE, NIL);
        }
        return NIL;
    }

    public static final SubLObject at_handle_mal_constraint_alt(SubLObject constraint) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            at_vars.$at_result$.setDynamicValue(T, thread);
            if (NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
                {
                    SubLObject at_trace_fn = (NIL != at_vars.$at_break_on_failureP$.getDynamicValue(thread)) ? ((SubLObject) (symbol_function(AT_ERROR))) : symbol_function(AT_NOTE);
                    SubLObject at_trace_level = (NIL != at_vars.$at_break_on_failureP$.getDynamicValue(thread)) ? ((SubLObject) (ONE_INTEGER)) : THREE_INTEGER;
                    if (ZERO_INTEGER.numE(at_vars.$at_argnum$.getDynamicValue(thread))) {
                        funcall(at_trace_fn, at_trace_level, $str_alt87$__at_test_fails___s_fails__s_cons, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), constraint);
                    } else {
                        funcall(at_trace_fn, new SubLObject[]{ at_trace_level, $str_alt88$__at_test_fails___s_fails__s_cons, at_vars.$at_arg$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), constraint, at_vars.$at_argnum$.getDynamicValue(thread), at_vars.$at_reln$.getDynamicValue(thread) });
                    }
                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                        com.cyc.cycjava.cycl.at_utilities.note_at_violation(com.cyc.cycjava.cycl.at_utilities.at_mal_arg_msg(constraint));
                    }
                }
            }
            if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.at_utilities.at_finished(UNPROVIDED);
            }
            return at_vars.$at_result$.getDynamicValue(thread);
        }
    }

    public static SubLObject at_handle_mal_constraint(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        at_vars.$at_result$.setDynamicValue(T, thread);
        if (NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
            final SubLObject at_trace_fn = (NIL != at_vars.$at_break_on_failureP$.getDynamicValue(thread)) ? symbol_function(AT_ERROR) : symbol_function(AT_NOTE);
            final SubLObject at_trace_level = (NIL != at_vars.$at_break_on_failureP$.getDynamicValue(thread)) ? ONE_INTEGER : THREE_INTEGER;
            if (ZERO_INTEGER.numE(at_vars.$at_argnum$.getDynamicValue(thread))) {
                funcall(at_trace_fn, at_trace_level, $str107$__at_test_fails___s_fails__s_cons, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), constraint);
            } else {
                funcall(at_trace_fn, new SubLObject[]{ at_trace_level, $str108$__at_test_fails___s_fails__s_cons, at_vars.$at_arg$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), constraint, at_vars.$at_argnum$.getDynamicValue(thread), at_vars.$at_reln$.getDynamicValue(thread) });
            }
            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                note_at_violation(at_mal_arg_msg(constraint));
            }
        }
        if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
            at_finished(UNPROVIDED);
        }
        return at_vars.$at_result$.getDynamicValue(thread);
    }

    public static final SubLObject at_mal_arg_msg_alt(SubLObject constraint) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = at_vars.$at_mode$.getDynamicValue(thread);
                if (pcase_var.eql($IRREFLEXIVE_PREDICATE)) {
                    return com.cyc.cycjava.cycl.at_utilities.predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
                } else {
                    if (pcase_var.eql($ASYMMETRIC_PREDICATE)) {
                        return com.cyc.cycjava.cycl.at_utilities.predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
                    } else {
                        if (pcase_var.eql($ANTI_SYMMETRIC_PREDICATE)) {
                            return com.cyc.cycjava.cycl.at_utilities.predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
                        } else {
                            if (pcase_var.eql($ANTI_TRANSITIVE_PREDICATE)) {
                                return com.cyc.cycjava.cycl.at_utilities.predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
                            } else {
                                if (pcase_var.eql($NEGATION_PREDS)) {
                                    return com.cyc.cycjava.cycl.at_utilities.meta_predicate_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                } else {
                                    if (pcase_var.eql($NEGATION_INVERSES)) {
                                        return com.cyc.cycjava.cycl.at_utilities.meta_predicate_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                    } else {
                                        com.cyc.cycjava.cycl.at_utilities.at_error(FIVE_INTEGER, $str_alt95$illegal_value_of__at_mode____s, at_vars.$at_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    public static SubLObject at_mal_arg_msg(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = at_vars.$at_mode$.getDynamicValue(thread);
        if (pcase_var.eql($IRREFLEXIVE_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($ASYMMETRIC_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($ANTI_SYMMETRIC_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($ANTI_TRANSITIVE_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($NEGATION_PREDS)) {
            return meta_predicate_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($NEGATION_INVERSES)) {
            return meta_predicate_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        at_error(FIVE_INTEGER, $str115$illegal_value_of__at_mode____s, at_vars.$at_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject predicate_isa_violation_data_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list($PREDICATE_ISA_VIOLATION, at_vars.$at_reln$.getDynamicValue(thread), col, mt, at_vars.$at_predicate_violations$.getDynamicValue(thread));
        }
    }

    public static SubLObject predicate_isa_violation_data(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list($PREDICATE_ISA_VIOLATION, at_vars.$at_reln$.getDynamicValue(thread), col, mt, at_vars.$at_predicate_violations$.getDynamicValue(thread));
    }

    public static final SubLObject meta_predicate_violation_data_alt(SubLObject meta_pred_value, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list($META_PREDICATE_VIOLATION, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), meta_pred_value, mt, at_vars.$at_predicate_violations$.getDynamicValue(thread));
        }
    }

    public static SubLObject meta_predicate_violation_data(final SubLObject meta_pred_value, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list($META_PREDICATE_VIOLATION, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), meta_pred_value, mt, at_vars.$at_predicate_violations$.getDynamicValue(thread));
    }

    public static final SubLObject semantic_violations_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return nreverse(cconcatenate(wff_vars.$arity_violations$.getDynamicValue(thread), new SubLObject[]{ at_vars.$at_violations$.getDynamicValue(thread), czer_vars.$semantic_violations$.getDynamicValue(thread) }));
        }
    }

    public static SubLObject semantic_violations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return nreverse(cconcatenate(wff_vars.$arity_violations$.getDynamicValue(thread), new SubLObject[]{ at_vars.$at_violations$.getDynamicValue(thread), czer_vars.$semantic_violations$.getDynamicValue(thread) }));
    }

    public static final SubLObject note_at_violationP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) && ((NIL == at_vars.$at_violations$.getDynamicValue(thread)) || (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))));
        }
    }

    public static SubLObject note_at_violationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) && ((NIL == at_vars.$at_violations$.getDynamicValue(thread)) || (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))));
    }

    public static final SubLObject note_at_violation_alt(SubLObject note) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != wff_vars.wff_debugP()) {
                print(note, UNPROVIDED);
            }
            if (NIL != com.cyc.cycjava.cycl.at_utilities.note_at_violationP()) {
                at_vars.$current_at_violation$.setDynamicValue(note, thread);
                if (NIL == com.cyc.cycjava.cycl.at_utilities.recursive_violationP(note)) {
                    {
                        SubLObject item_var = note;
                        if (NIL == member(item_var, at_vars.$at_violations$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            at_vars.$at_violations$.setDynamicValue(cons(item_var, at_vars.$at_violations$.getDynamicValue(thread)), thread);
                        }
                    }
                }
            }
            return at_vars.$at_violations$.getDynamicValue(thread);
        }
    }

    public static SubLObject note_at_violation(final SubLObject note) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != wff_vars.wff_debugP()) {
            print(note, UNPROVIDED);
        }
        if (NIL != note_at_violationP()) {
            at_vars.$current_at_violation$.setDynamicValue(note, thread);
            if ((NIL == recursive_violationP(note)) && (NIL == member(note, at_vars.$at_violations$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY)))) {
                at_vars.$at_violations$.setDynamicValue(cons(note, at_vars.$at_violations$.getDynamicValue(thread)), thread);
            }
        }
        return at_vars.$at_violations$.getDynamicValue(thread);
    }

    public static final SubLObject recursive_violationP_alt(SubLObject note) {
        {
            SubLObject pcase_var = note.first();
            if (pcase_var.eql($MAL_ARG_WRT_COL_DEFN)) {
                return eq(fifth(note), $$CycLSentence_Assertible);
            } else {
                if (pcase_var.eql($MAL_ARG_WRT_NEC_DEFN)) {
                    return eq(third(note), $$CycLSentence_Assertible);
                }
            }
        }
        return NIL;
    }

    public static SubLObject recursive_violationP(final SubLObject note) {
        final SubLObject pcase_var = note.first();
        if (pcase_var.eql($MAL_ARG_WRT_COL_DEFN)) {
            return eql(fifth(note), $$CycLSentence_Assertible);
        }
        if (pcase_var.eql($MAL_ARG_WRT_NEC_DEFN)) {
            return eql(third(note), $$CycLSentence_Assertible);
        }
        return NIL;
    }

    public static final SubLObject reset_at_violations_alt(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != do_itP) {
                at_vars.$at_violations$.setDynamicValue(NIL, thread);
            } else {
                if (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                } else {
                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                        at_vars.$at_violations$.setDynamicValue(NIL, thread);
                    }
                }
            }
            return at_vars.$at_violations$.getDynamicValue(thread);
        }
    }

    public static SubLObject reset_at_violations(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != do_itP) {
            at_vars.$at_violations$.setDynamicValue(NIL, thread);
        } else
            if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                    at_vars.$at_violations$.setDynamicValue(NIL, thread);
                }
            }

        return at_vars.$at_violations$.getDynamicValue(thread);
    }

    public static final SubLObject reset_arity_violations_alt(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != do_itP) {
                wff_vars.$arity_violations$.setDynamicValue(NIL, thread);
            } else {
                if (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                } else {
                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                        wff_vars.$arity_violations$.setDynamicValue(NIL, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject reset_arity_violations(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != do_itP) {
            wff_vars.$arity_violations$.setDynamicValue(NIL, thread);
        } else
            if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                    wff_vars.$arity_violations$.setDynamicValue(NIL, thread);
                }
            }

        return NIL;
    }

    public static final SubLObject reset_semantic_violations_alt(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        czer_vars.$semantic_violations$.setDynamicValue(NIL);
        com.cyc.cycjava.cycl.at_utilities.reset_at_violations(do_itP);
        com.cyc.cycjava.cycl.at_utilities.reset_arity_violations(do_itP);
        return NIL;
    }

    public static SubLObject reset_semantic_violations(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        czer_vars.$semantic_violations$.setDynamicValue(NIL);
        reset_at_violations(do_itP);
        reset_arity_violations(do_itP);
        return NIL;
    }

    public static final SubLObject reset_at_state_alt() {
        com.cyc.cycjava.cycl.at_utilities.reset_arity_violations(T);
        com.cyc.cycjava.cycl.at_utilities.reset_at_violations(T);
        return NIL;
    }

    public static SubLObject reset_at_state() {
        reset_arity_violations(T);
        reset_at_violations(T);
        return NIL;
    }

    public static final SubLObject suggest_formula_fix_for_at_violation_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = at_vars.$within_at_suggestionP$.currentBinding(thread);
                SubLObject _prev_bind_1 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
                SubLObject _prev_bind_2 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
                SubLObject _prev_bind_3 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                try {
                    at_vars.$within_at_suggestionP$.bind(T, thread);
                    wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
                    at_vars.$gather_at_constraintsP$.bind(NIL, thread);
                    at_vars.$noting_at_violationsP$.bind(NIL, thread);
                    {
                        SubLObject violations = at_vars.$at_violations$.getDynamicValue(thread);
                        {
                            SubLObject _prev_bind_0_126 = wff_vars.$wff_violations$.currentBinding(thread);
                            try {
                                wff_vars.$wff_violations$.bind(NIL, thread);
                                {
                                    SubLObject accommodating_mts = com.cyc.cycjava.cycl.at_utilities.mts_accommodating_formula_wrt_types(formula);
                                    if (NIL != accommodating_mts) {
                                        wff.note_wff_suggestion(list($CHANGE_MT, formula, mt, accommodating_mts));
                                    }
                                    {
                                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_utilities.assertion_arg_violations_among(violations);
                                        SubLObject assertion_arg_violation = NIL;
                                        for (assertion_arg_violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_arg_violation = cdolist_list_var.first()) {
                                            com.cyc.cycjava.cycl.at_utilities.assertion_arg_violation_fix(assertion_arg_violation);
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_utilities.sef_violations_among(violations);
                                        SubLObject sef_violation = NIL;
                                        for (sef_violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sef_violation = cdolist_list_var.first()) {
                                            com.cyc.cycjava.cycl.at_utilities.sef_violation_fix(sef_violation);
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_utilities.predicate_violations_among(violations);
                                        SubLObject pred_violation = NIL;
                                        for (pred_violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred_violation = cdolist_list_var.first()) {
                                            com.cyc.cycjava.cycl.at_utilities.predicate_violation_fix(pred_violation);
                                        }
                                    }
                                }
                            } finally {
                                wff_vars.$wff_violations$.rebind(_prev_bind_0_126, thread);
                            }
                        }
                    }
                } finally {
                    at_vars.$noting_at_violationsP$.rebind(_prev_bind_3, thread);
                    at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2, thread);
                    wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_1, thread);
                    at_vars.$within_at_suggestionP$.rebind(_prev_bind_0, thread);
                }
            }
            return wff.wff_suggestions();
        }
    }

    public static SubLObject suggest_formula_fix_for_at_violation(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$within_at_suggestionP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        try {
            at_vars.$within_at_suggestionP$.bind(T, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            at_vars.$gather_at_constraintsP$.bind(NIL, thread);
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            final SubLObject violations = at_vars.$at_violations$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$157 = wff_vars.$wff_violations$.currentBinding(thread);
            try {
                wff_vars.$wff_violations$.bind(NIL, thread);
                final SubLObject accommodating_mts = mts_accommodating_formula_wrt_types(formula);
                if (NIL != accommodating_mts) {
                    wff.note_wff_suggestion(list($CHANGE_MT, formula, mt, accommodating_mts));
                }
                SubLObject cdolist_list_var = assertion_arg_violations_among(violations);
                SubLObject assertion_arg_violation = NIL;
                assertion_arg_violation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    assertion_arg_violation_fix(assertion_arg_violation);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion_arg_violation = cdolist_list_var.first();
                } 
                cdolist_list_var = sef_violations_among(violations);
                SubLObject sef_violation = NIL;
                sef_violation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sef_violation_fix(sef_violation);
                    cdolist_list_var = cdolist_list_var.rest();
                    sef_violation = cdolist_list_var.first();
                } 
                cdolist_list_var = predicate_violations_among(violations);
                SubLObject pred_violation = NIL;
                pred_violation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    predicate_violation_fix(pred_violation);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred_violation = cdolist_list_var.first();
                } 
            } finally {
                wff_vars.$wff_violations$.rebind(_prev_bind_0_$157, thread);
            }
        } finally {
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_4, thread);
            at_vars.$gather_at_constraintsP$.rebind(_prev_bind_3, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_2, thread);
            at_vars.$within_at_suggestionP$.rebind(_prev_bind_0, thread);
        }
        return wff.wff_suggestions();
    }

    public static final SubLObject assertion_arg_violations_among_alt(SubLObject violations) {
        return list_utilities.remove_if_not(symbol_function($sym102$ASSERTION_ARG_VIOLATION_), violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertion_arg_violations_among(final SubLObject violations) {
        return list_utilities.remove_if_not(symbol_function($sym122$ASSERTION_ARG_VIOLATION_), violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sef_violations_among_alt(SubLObject violations) {
        return list_utilities.remove_if_not(symbol_function($sym103$SEF_VIOLATION_), violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sef_violations_among(final SubLObject violations) {
        return list_utilities.remove_if_not(symbol_function($sym123$SEF_VIOLATION_), violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject predicate_violations_among_alt(SubLObject violations) {
        return list_utilities.remove_if_not(symbol_function($sym104$PREDICATE_VIOLATION_), violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject predicate_violations_among(final SubLObject violations) {
        return list_utilities.remove_if_not(symbol_function($sym124$PREDICATE_VIOLATION_), violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject assertion_arg_violationP_alt(SubLObject violation) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.at_utilities.violation_type(violation);
            if (pcase_var.eql($MAL_ARG_WRT_IFF_DEFN)) {
                {
                    SubLObject datum = violation.rest();
                    SubLObject current = datum;
                    SubLObject arg = NIL;
                    SubLObject reln = NIL;
                    SubLObject argnum = NIL;
                    SubLObject col = NIL;
                    SubLObject defn = NIL;
                    SubLObject mt = NIL;
                    SubLObject data = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    reln = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    argnum = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    col = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    defn = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    mt = current.first();
                    current = current.rest();
                    data = current;
                    return makeBoolean((defn == CYC_ASSERTION) || (NIL != com.cyc.cycjava.cycl.at_utilities.assertion_collectionP(col, mt)));
                }
            }
        }
        return NIL;
    }

    public static SubLObject assertion_arg_violationP(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql($MAL_ARG_WRT_IFF_DEFN)) {
            SubLObject current;
            final SubLObject datum = current = violation.rest();
            SubLObject arg = NIL;
            SubLObject reln = NIL;
            SubLObject argnum = NIL;
            SubLObject col = NIL;
            SubLObject defn = NIL;
            SubLObject mt = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list126);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            reln = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            argnum = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            defn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            mt = current.first();
            current = data = current.rest();
            return makeBoolean((NIL != kb_utilities.kbeq(defn, CYC_ASSERTION)) || (NIL != assertion_collectionP(col, mt)));
        }
        return NIL;
    }

    public static final SubLObject assertion_collectionP_alt(SubLObject thing, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (thing == $$CycLAssertion) {
            return T;
        } else {
            {
                SubLObject v_boolean = NIL;
                v_boolean = genls.genlP(thing, $$CycLAssertion, mt, UNPROVIDED);
                return v_boolean;
            }
        }
    }

    public static SubLObject assertion_collectionP(final SubLObject thing, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (thing.eql($$CycLAssertion)) {
            return T;
        }
        SubLObject v_boolean = NIL;
        v_boolean = genls.genlP(thing, $$CycLAssertion, mt, UNPROVIDED);
        return v_boolean;
    }

    public static final SubLObject sef_violationP_alt(SubLObject violation) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.at_utilities.violation_type(violation);
            if (pcase_var.eql($MAL_ARG_WRT_ARG_FORMAT)) {
                return T;
            } else {
                if (pcase_var.eql($MAL_ARG_WRT_INTER_ARG_FORMAT)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject sef_violationP(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql($MAL_ARG_WRT_ARG_FORMAT)) {
            return T;
        }
        if (pcase_var.eql($MAL_ARG_WRT_INTER_ARG_FORMAT)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject predicate_violationP_alt(SubLObject violation) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.at_utilities.violation_type(violation);
            if (pcase_var.eql($PREDICATE_ISA_VIOLATION)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject predicate_violationP(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql($PREDICATE_ISA_VIOLATION)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject assertion_arg_violation_fix_alt(SubLObject violation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = violation.rest();
                SubLObject current = datum;
                SubLObject arg = NIL;
                SubLObject reln = NIL;
                SubLObject argnum = NIL;
                SubLObject col = NIL;
                SubLObject defn = NIL;
                SubLObject mt = NIL;
                SubLObject data = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt106);
                arg = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt106);
                reln = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt106);
                argnum = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt106);
                col = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt106);
                defn = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt106);
                mt = current.first();
                current = current.rest();
                data = current;
                {
                    SubLObject formula = com.cyc.cycjava.cycl.at_utilities.strip_mt_literals(arg, UNPROVIDED);
                    SubLObject assertions = NIL;
                    SubLObject candidate_mts = NIL;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            assertions = czer_meta.find_assertions_cycl(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = assertions;
                        SubLObject assertion = NIL;
                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                            candidate_mts = cons(assertions_high.assertion_mt(assertion), candidate_mts);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = candidate_mts;
                        SubLObject candidate_mt = NIL;
                        for (candidate_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_mt = cdolist_list_var.first()) {
                            wff.note_wff_suggestion(list($REPLACE_TERM, arg, make_binary_formula($$ist, candidate_mt, formula)));
                        }
                    }
                }
            }
            return wff.wff_suggestions();
        }
    }

    public static SubLObject assertion_arg_violation_fix(final SubLObject violation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = violation.rest();
        SubLObject arg = NIL;
        SubLObject reln = NIL;
        SubLObject argnum = NIL;
        SubLObject col = NIL;
        SubLObject defn = NIL;
        SubLObject mt = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list126);
        arg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        reln = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        defn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list126);
        mt = current.first();
        current = data = current.rest();
        final SubLObject formula = strip_mt_literals(arg, UNPROVIDED);
        SubLObject assertions = NIL;
        SubLObject candidate_mts = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            assertions = czer_meta.find_assertions_cycl(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            candidate_mts = cons(assertions_high.assertion_mt(assertion), candidate_mts);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        cdolist_list_var = candidate_mts;
        SubLObject candidate_mt = NIL;
        candidate_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            wff.note_wff_suggestion(list($REPLACE_TERM, arg, make_binary_formula($$ist, candidate_mt, formula)));
            cdolist_list_var = cdolist_list_var.rest();
            candidate_mt = cdolist_list_var.first();
        } 
        return wff.wff_suggestions();
    }

    public static final SubLObject strip_mt_literals_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
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
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if ((NIL != mt_designating_literalP(formula)) && (NIL != fort_types_interface.mtP(designated_mt(formula)))) {
                            result = com.cyc.cycjava.cycl.at_utilities.strip_mt_literals(designated_sentence(formula), designated_mt(formula));
                        } else {
                            result = formula;
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

    public static SubLObject strip_mt_literals(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if ((NIL != mt_designating_literalP(formula)) && (NIL != fort_types_interface.mtP(designated_mt(formula)))) {
                result = strip_mt_literals(designated_sentence(formula), designated_mt(formula));
            } else {
                result = formula;
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sef_violation_fix_alt(SubLObject violation) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.at_utilities.violation_type(violation);
            if (pcase_var.eql($MAL_ARG_WRT_ARG_FORMAT)) {
                {
                    SubLObject datum = violation.rest();
                    SubLObject current = datum;
                    SubLObject arg = NIL;
                    SubLObject rel = NIL;
                    SubLObject pos = NIL;
                    SubLObject format = NIL;
                    SubLObject mt = NIL;
                    SubLObject violations = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    rel = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    pos = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    format = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    violations = current.first();
                    current = current.rest();
                    {
                        SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt113);
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != forts.fort_p(arg)) {
                                {
                                    SubLObject cdolist_list_var = violations;
                                    SubLObject assertion = NIL;
                                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                        {
                                            SubLObject rival = assertions_high.gaf_arg(assertion, pos);
                                            wff.note_wff_suggestion(list($ASSERT, list($$equals, arg, rival), mt));
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt113);
                        }
                    }
                }
            } else {
                if (pcase_var.eql($MAL_ARG_WRT_INTER_ARG_FORMAT)) {
                    {
                        SubLObject datum = violation.rest();
                        SubLObject current = datum;
                        SubLObject arg = NIL;
                        SubLObject rel = NIL;
                        SubLObject pos = NIL;
                        SubLObject format = NIL;
                        SubLObject ind_arg_isa = NIL;
                        SubLObject ind_pos = NIL;
                        SubLObject ind_arg = NIL;
                        SubLObject mt = NIL;
                        SubLObject violations = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt116);
                        arg = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt116);
                        rel = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt116);
                        pos = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt116);
                        format = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt116);
                        ind_arg_isa = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt116);
                        ind_pos = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt116);
                        ind_arg = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt116);
                        mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt116);
                        violations = current.first();
                        current = current.rest();
                        {
                            SubLObject via = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt116);
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != forts.fort_p(arg)) {
                                    {
                                        SubLObject cdolist_list_var = violations;
                                        SubLObject assertion = NIL;
                                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                            {
                                                SubLObject rival = assertions_high.gaf_arg(assertion, pos);
                                                wff.note_wff_suggestion(list($ASSERT, list($$equals, arg, rival), mt));
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt116);
                            }
                        }
                    }
                }
            }
        }
        return wff.wff_suggestions();
    }

    public static SubLObject sef_violation_fix(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql($MAL_ARG_WRT_ARG_FORMAT)) {
            SubLObject current;
            final SubLObject datum = current = violation.rest();
            SubLObject arg = NIL;
            SubLObject rel = NIL;
            SubLObject pos = NIL;
            SubLObject format = NIL;
            SubLObject mt = NIL;
            SubLObject violations = NIL;
            destructuring_bind_must_consp(current, datum, $list133);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            rel = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            format = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            violations = current.first();
            current = current.rest();
            final SubLObject via = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list133);
            current = current.rest();
            if (NIL == current) {
                if (NIL != forts.fort_p(arg)) {
                    SubLObject cdolist_list_var = violations;
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject rival = assertions_high.gaf_arg(assertion, pos);
                        wff.note_wff_suggestion(list($ASSERT, list($$equals, arg, rival), mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list133);
            }
        } else
            if (pcase_var.eql($MAL_ARG_WRT_INTER_ARG_FORMAT)) {
                SubLObject current;
                final SubLObject datum = current = violation.rest();
                SubLObject arg = NIL;
                SubLObject rel = NIL;
                SubLObject pos = NIL;
                SubLObject format = NIL;
                SubLObject ind_arg_isa = NIL;
                SubLObject ind_pos = NIL;
                SubLObject ind_arg = NIL;
                SubLObject mt2 = NIL;
                SubLObject violations2 = NIL;
                destructuring_bind_must_consp(current, datum, $list136);
                arg = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                rel = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                pos = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                format = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                ind_arg_isa = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                ind_pos = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                ind_arg = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                mt2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                violations2 = current.first();
                current = current.rest();
                final SubLObject via2 = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list136);
                current = current.rest();
                if (NIL == current) {
                    if (NIL != forts.fort_p(arg)) {
                        SubLObject cdolist_list_var2 = violations2;
                        SubLObject assertion2 = NIL;
                        assertion2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject rival2 = assertions_high.gaf_arg(assertion2, pos);
                            wff.note_wff_suggestion(list($ASSERT, list($$equals, arg, rival2), mt2));
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            assertion2 = cdolist_list_var2.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum, $list136);
                }
            }

        return wff.wff_suggestions();
    }

    public static final SubLObject predicate_violation_fix_alt(SubLObject violation) {
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.at_utilities.violation_type(violation);
            if (pcase_var.eql($PREDICATE_ISA_VIOLATION)) {
                {
                    SubLObject datum = violation.rest();
                    SubLObject current = datum;
                    SubLObject predicate = NIL;
                    SubLObject v_isa = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    predicate = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    v_isa = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    mt = current.first();
                    current = current.rest();
                    {
                        SubLObject violations = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt117);
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject cdolist_list_var = violations;
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    wff.note_wff_suggestion(list($UNASSERT, fi.assertion_fi_ist_formula(assertion, UNPROVIDED)));
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt117);
                        }
                    }
                }
            }
        }
        return wff.wff_suggestions();
    }

    public static SubLObject predicate_violation_fix(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql($PREDICATE_ISA_VIOLATION)) {
            SubLObject current;
            final SubLObject datum = current = violation.rest();
            SubLObject predicate = NIL;
            SubLObject v_isa = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list137);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list137);
            v_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list137);
            mt = current.first();
            current = current.rest();
            final SubLObject violations = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list137);
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var = violations;
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    wff.note_wff_suggestion(list($UNASSERT, fi.assertion_fi_ist_formula(assertion, UNPROVIDED)));
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list137);
            }
        }
        return wff.wff_suggestions();
    }

    public static final SubLObject violation_type_alt(SubLObject violation) {
        if (violation.isCons()) {
            return violation.first();
        }
        return NIL;
    }

    public static SubLObject violation_type(final SubLObject violation) {
        if (violation.isCons()) {
            return violation.first();
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown literal-args is too constraining, but tree-gather is too lax.  We need a middle ground.
     */
    @LispMethod(comment = "@unknown literal-args is too constraining, but tree-gather is too lax.  We need a middle ground.")
    public static final SubLObject mts_accommodating_formula_wrt_types_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject valid_mts = NIL;
                SubLObject candidate_mts = NIL;
                {
                    SubLObject cdolist_list_var = list_utilities.tree_gather(formula, symbol_function(CONSTANT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject arg = NIL;
                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                        candidate_mts = nconc(candidate_mts, isa.isa_mts(arg), genls.genls_mts(arg));
                    }
                }
                candidate_mts = Sort.sort(list_utilities.remove_duplicate_forts(candidate_mts), $sym121$_, SPEC_CARDINALITY);
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(NIL, thread);
                        at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                        wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                        wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
                        if ($mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread).isInteger() && (NIL != list_utilities.lengthG(candidate_mts, $mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread), UNPROVIDED))) {
                            candidate_mts = list_utilities.first_n($mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread), candidate_mts);
                        }
                        {
                            SubLObject cdolist_list_var = candidate_mts;
                            SubLObject mt = NIL;
                            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                                if (NIL == genl_mts.any_genl_mtP(mt, valid_mts, UNPROVIDED, UNPROVIDED)) {
                                    if ((NIL != el_formulaP(formula)) && (NIL != wff.el_wffP(formula, mt, UNPROVIDED))) {
                                        valid_mts = cons(mt, valid_mts);
                                    }
                                }
                            }
                        }
                    } finally {
                        wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_4, thread);
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return genl_mts.max_mts(valid_mts, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @unknown literal-args is too constraining, but tree-gather is too lax.  We need a middle ground.
     */
    @LispMethod(comment = "@unknown literal-args is too constraining, but tree-gather is too lax.  We need a middle ground.")
    public static SubLObject mts_accommodating_formula_wrt_types(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid_mts = NIL;
        SubLObject candidate_mts = NIL;
        SubLObject cdolist_list_var = list_utilities.tree_gather(formula, symbol_function(CONSTANT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            candidate_mts = nconc(candidate_mts, isa.isa_mts(arg), genls.genls_mts(arg));
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        candidate_mts = Sort.sort(list_utilities.remove_duplicate_forts(candidate_mts), $sym141$_, SPEC_CARDINALITY);
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            if ($mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread).isInteger() && (NIL != list_utilities.lengthG(candidate_mts, $mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread), UNPROVIDED))) {
                candidate_mts = list_utilities.first_n($mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread), candidate_mts);
            }
            SubLObject cdolist_list_var2 = candidate_mts;
            SubLObject mt = NIL;
            mt = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (((NIL == genl_mts.any_genl_mtP(mt, valid_mts, UNPROVIDED, UNPROVIDED)) && (NIL != el_formulaP(formula))) && (NIL != wff.el_wffP(formula, mt, UNPROVIDED))) {
                    valid_mts = cons(mt, valid_mts);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt = cdolist_list_var2.first();
            } 
        } finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return genl_mts.max_mts(valid_mts, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff there is some mt in which NAT is deemed wff (wrt currently accessible constraints)
    If MTS is non-null then only MTS are candidates, else all mts are candidates.
     */
    @LispMethod(comment = "@return boolean; t iff there is some mt in which NAT is deemed wff (wrt currently accessible constraints)\r\nIf MTS is non-null then only MTS are candidates, else all mts are candidates.")
    public static final SubLObject nat_wf_in_some_mtP_alt(SubLObject cnat, SubLObject mts, SubLObject validate_expansionP) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.at_utilities.nat_wf_in_some_mt(cnat, mts, validate_expansionP));
    }

    /**
     *
     *
     * @return boolean; t iff there is some mt in which NAT is deemed wff (wrt currently accessible constraints)
    If MTS is non-null then only MTS are candidates, else all mts are candidates.
     */
    @LispMethod(comment = "@return boolean; t iff there is some mt in which NAT is deemed wff (wrt currently accessible constraints)\r\nIf MTS is non-null then only MTS are candidates, else all mts are candidates.")
    public static SubLObject nat_wf_in_some_mtP(final SubLObject cnat, SubLObject mts, SubLObject validate_expansionP) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        return list_utilities.sublisp_boolean(nat_wf_in_some_mt(cnat, mts, validate_expansionP));
    }

    /**
     *
     *
     * @return mt or nil, returns an mt (if one exists) in which NAT is deemed wff (wrt currently accessible constraints)
    If MTS is non-null then only MTS are candidates for the one returned, else all mts are candidates.
     */
    @LispMethod(comment = "@return mt or nil, returns an mt (if one exists) in which NAT is deemed wff (wrt currently accessible constraints)\r\nIf MTS is non-null then only MTS are candidates for the one returned, else all mts are candidates.")
    public static final SubLObject nat_wf_in_some_mt_alt(SubLObject cnat, SubLObject mts, SubLObject validate_expansionP) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != nart_handles.nart_p(cnat)) {
                return com.cyc.cycjava.cycl.at_utilities.nat_wf_in_some_mt(narts_high.nart_hl_formula(cnat), UNPROVIDED, UNPROVIDED);
            } else {
                if (NIL == el_formula_p(cnat)) {
                } else {
                    if (NIL != validate_expansionP) {
                        {
                            SubLObject nat_expansion = wff.wff_el_expansion(cnat, $$EverythingPSC);
                            SubLObject wft_mt = NIL;
                            {
                                SubLObject _prev_bind_0 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                                SubLObject _prev_bind_1 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                                SubLObject _prev_bind_2 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                                SubLObject _prev_bind_3 = wff_vars.$validating_expansionP$.currentBinding(thread);
                                try {
                                    at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                                    wff_vars.$unexpanded_formula$.bind(cnat, thread);
                                    wff_vars.$validate_expansionsP$.bind(NIL, thread);
                                    wff_vars.$validating_expansionP$.bind(T, thread);
                                    wft_mt = com.cyc.cycjava.cycl.at_utilities.nat_wf_in_some_mt(nat_expansion, mts, NIL);
                                } finally {
                                    wff_vars.$validating_expansionP$.rebind(_prev_bind_3, thread);
                                    wff_vars.$validate_expansionsP$.rebind(_prev_bind_2, thread);
                                    wff_vars.$unexpanded_formula$.rebind(_prev_bind_1, thread);
                                    at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return wft_mt;
                        }
                    } else {
                        if (NIL != mts) {
                            {
                                SubLObject wft_mt = NIL;
                                if (NIL == wft_mt) {
                                    {
                                        SubLObject csome_list_var = mts;
                                        SubLObject mt = NIL;
                                        for (mt = csome_list_var.first(); !((NIL != wft_mt) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                                            if ((NIL != wff.el_wft_fastP(cnat, mt)) && (((NIL == wff_vars.validating_expansionP()) || cnat.equal(wff_vars.unexpanded_formula())) || (NIL != wff.el_wft_fastP(wff_vars.unexpanded_formula(), mt)))) {
                                                wft_mt = mt;
                                            }
                                        }
                                    }
                                }
                                return wft_mt;
                            }
                        } else {
                            {
                                SubLObject mts_127 = com.cyc.cycjava.cycl.at_utilities.nat_wf_default_mts(cnat, UNPROVIDED, UNPROVIDED);
                                SubLObject wft_mt = NIL;
                                if (NIL == wft_mt) {
                                    {
                                        SubLObject csome_list_var = mts_127;
                                        SubLObject mt = NIL;
                                        for (mt = csome_list_var.first(); !((NIL != wft_mt) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                                            if ((NIL != wff.el_wft_fastP(cnat, mt)) && (((NIL == wff_vars.validating_expansionP()) || cnat.equal(wff_vars.unexpanded_formula())) || (NIL != wff.el_wft_fastP(wff_vars.unexpanded_formula(), mt)))) {
                                                wft_mt = mt;
                                            }
                                        }
                                    }
                                }
                                if (NIL == wft_mt) {
                                    {
                                        SubLObject _prev_bind_0 = $max_floor_mts_of_nat_exceptions$.currentBinding(thread);
                                        try {
                                            $max_floor_mts_of_nat_exceptions$.bind(mts_127, thread);
                                            wft_mt = com.cyc.cycjava.cycl.at_utilities.nat_wf_in_mts(cnat, NIL, NIL, ONE_INTEGER);
                                        } finally {
                                            $max_floor_mts_of_nat_exceptions$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                return wft_mt;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return mt or nil, returns an mt (if one exists) in which NAT is deemed wff (wrt currently accessible constraints)
    If MTS is non-null then only MTS are candidates for the one returned, else all mts are candidates.
     */
    @LispMethod(comment = "@return mt or nil, returns an mt (if one exists) in which NAT is deemed wff (wrt currently accessible constraints)\r\nIf MTS is non-null then only MTS are candidates for the one returned, else all mts are candidates.")
    public static SubLObject nat_wf_in_some_mt(final SubLObject cnat, SubLObject mts, SubLObject validate_expansionP) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nart_handles.nart_p(cnat)) {
            return nat_wf_in_some_mt(narts_high.nart_hl_formula(cnat), UNPROVIDED, UNPROVIDED);
        }
        if (NIL == el_formula_p(cnat)) {
            return NIL;
        }
        if (NIL != validate_expansionP) {
            final SubLObject nat_expansion = wff.wff_el_expansion(cnat, $$EverythingPSC);
            SubLObject wft_mt = NIL;
            final SubLObject _prev_bind_0 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_vars.$unexpanded_formula$.currentBinding(thread);
            final SubLObject _prev_bind_3 = wff_vars.$validate_expansionsP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_vars.$validating_expansionP$.currentBinding(thread);
            try {
                at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                wff_vars.$unexpanded_formula$.bind(cnat, thread);
                wff_vars.$validate_expansionsP$.bind(NIL, thread);
                wff_vars.$validating_expansionP$.bind(T, thread);
                wft_mt = nat_wf_in_some_mt(nat_expansion, mts, NIL);
            } finally {
                wff_vars.$validating_expansionP$.rebind(_prev_bind_4, thread);
                wff_vars.$validate_expansionsP$.rebind(_prev_bind_3, thread);
                wff_vars.$unexpanded_formula$.rebind(_prev_bind_2, thread);
                at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0, thread);
            }
            return wft_mt;
        }
        if (NIL != mts) {
            SubLObject wft_mt2 = NIL;
            if (NIL == wft_mt2) {
                SubLObject csome_list_var = mts;
                SubLObject mt = NIL;
                mt = csome_list_var.first();
                while ((NIL == wft_mt2) && (NIL != csome_list_var)) {
                    if ((NIL != wff.el_wft_fastP(cnat, mt)) && (((NIL == wff_vars.validating_expansionP()) || cnat.equal(wff_vars.unexpanded_formula())) || (NIL != wff.el_wft_fastP(wff_vars.unexpanded_formula(), mt)))) {
                        wft_mt2 = mt;
                    }
                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                } 
            }
            return wft_mt2;
        }
        final SubLObject mts_$158 = nat_wf_default_mts(cnat, UNPROVIDED, UNPROVIDED);
        SubLObject wft_mt = NIL;
        if (NIL == wft_mt) {
            SubLObject csome_list_var2 = mts_$158;
            SubLObject mt2 = NIL;
            mt2 = csome_list_var2.first();
            while ((NIL == wft_mt) && (NIL != csome_list_var2)) {
                if ((NIL != wff.el_wft_fastP(cnat, mt2)) && (((NIL == wff_vars.validating_expansionP()) || cnat.equal(wff_vars.unexpanded_formula())) || (NIL != wff.el_wft_fastP(wff_vars.unexpanded_formula(), mt2)))) {
                    wft_mt = mt2;
                }
                csome_list_var2 = csome_list_var2.rest();
                mt2 = csome_list_var2.first();
            } 
        }
        if (NIL == wft_mt) {
            final SubLObject _prev_bind_0 = $max_floor_mts_of_nat_exceptions$.currentBinding(thread);
            try {
                $max_floor_mts_of_nat_exceptions$.bind(mts_$158, thread);
                wft_mt = nat_wf_in_mts(cnat, NIL, NIL, ONE_INTEGER);
            } finally {
                $max_floor_mts_of_nat_exceptions$.rebind(_prev_bind_0, thread);
            }
        }
        return wft_mt;
    }

    public static final SubLObject nat_wf_default_mts_alt(SubLObject cnat, SubLObject independentP, SubLObject unindexedP) {
        if (independentP == UNPROVIDED) {
            independentP = NIL;
        }
        if (unindexedP == UNPROVIDED) {
            unindexedP = NIL;
        }
        if (NIL != independentP) {
            return genl_mts.min_mts(com.cyc.cycjava.cycl.at_utilities.formula_forts_isa_mts(cnat, UNPROVIDED), UNPROVIDED);
        } else {
            {
                SubLObject mt_sets = NIL;
                SubLObject mts = NIL;
                {
                    SubLObject cdolist_list_var = list_utilities.remove_duplicate_forts(cycl_utilities.formula_forts(cnat, T, UNPROVIDED, UNPROVIDED));
                    SubLObject fort = NIL;
                    for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                        if ((NIL == unindexed_syntax_constant_p(fort)) || (NIL != unindexedP)) {
                            {
                                SubLObject isa_mts = czer_main.fort_sort_by_type_and_id(isa.isa_mts(fort));
                                if (NIL != isa_mts) {
                                    {
                                        SubLObject item_var = isa_mts;
                                        if (NIL == member(item_var, mt_sets, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            mt_sets = cons(item_var, mt_sets);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = list_utilities.cross_products(mt_sets);
                    SubLObject mt_set = NIL;
                    for (mt_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_set = cdolist_list_var.first()) {
                        mts = nconc(mts, genl_mts.max_floor_mts(list_utilities.remove_duplicate_forts(mt_set), UNPROVIDED, UNPROVIDED));
                    }
                }
                return genl_mts.min_mts(list_utilities.remove_duplicate_forts(mts), UNPROVIDED);
            }
        }
    }

    public static SubLObject nat_wf_default_mts(final SubLObject cnat, SubLObject independentP, SubLObject unindexedP) {
        if (independentP == UNPROVIDED) {
            independentP = NIL;
        }
        if (unindexedP == UNPROVIDED) {
            unindexedP = NIL;
        }
        if (NIL != independentP) {
            return genl_mts.min_mts(formula_forts_isa_mts(cnat, UNPROVIDED), UNPROVIDED);
        }
        SubLObject mt_sets = NIL;
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = list_utilities.remove_duplicate_forts(cycl_utilities.formula_forts(cnat, T, UNPROVIDED, UNPROVIDED));
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == unindexed_syntax_constant_p(fort)) || (NIL != unindexedP)) {
                final SubLObject isa_mts = czer_main.fort_sort_by_type_and_id(isa.isa_mts(fort));
                if (NIL != isa_mts) {
                    final SubLObject item_var = isa_mts;
                    if (NIL == member(item_var, mt_sets, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        mt_sets = cons(item_var, mt_sets);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        } 
        cdolist_list_var = list_utilities.cross_products(mt_sets);
        SubLObject mt_set = NIL;
        mt_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mts = nconc(mts, genl_mts.max_floor_mts(list_utilities.remove_duplicate_forts(mt_set), UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            mt_set = cdolist_list_var.first();
        } 
        return genl_mts.min_mts(list_utilities.remove_duplicate_forts(mts), UNPROVIDED);
    }

    public static final SubLObject formula_forts_isa_mts_alt(SubLObject formula, SubLObject unindexedP) {
        if (unindexedP == UNPROVIDED) {
            unindexedP = NIL;
        }
        {
            SubLObject mts = NIL;
            SubLObject cdolist_list_var = list_utilities.remove_duplicate_forts(cycl_utilities.formula_forts(formula, T, UNPROVIDED, UNPROVIDED));
            SubLObject fort = NIL;
            for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                if ((NIL == unindexed_syntax_constant_p(fort)) || (NIL != unindexedP)) {
                    mts = nconc(mts, isa.isa_mts(fort));
                }
            }
            return list_utilities.remove_duplicate_forts(mts);
        }
    }

    public static SubLObject formula_forts_isa_mts(final SubLObject formula, SubLObject unindexedP) {
        if (unindexedP == UNPROVIDED) {
            unindexedP = NIL;
        }
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = list_utilities.remove_duplicate_forts(cycl_utilities.formula_forts(formula, T, UNPROVIDED, UNPROVIDED));
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == unindexed_syntax_constant_p(fort)) || (NIL != unindexedP)) {
                mts = nconc(mts, isa.isa_mts(fort));
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        } 
        return list_utilities.remove_duplicate_forts(mts);
    }

    public static final SubLObject at_mt_mt_relevantP_alt(SubLObject mt) {
        return mt_vars.mt_mt_relevantP(mt);
    }

    public static SubLObject at_mt_mt_relevantP(final SubLObject mt) {
        return mt_vars.mt_mt_relevantP(mt);
    }

    /**
     *
     *
     * @return list, mts in which NAT is deemed wff (wrt currently accessible constraints).
    If NUMBER is a positive integer then at most NUMBER mts are returned
    else the most-general among all mts admitting NAT are returned.
     */
    @LispMethod(comment = "@return list, mts in which NAT is deemed wff (wrt currently accessible constraints).\r\nIf NUMBER is a positive integer then at most NUMBER mts are returned\r\nelse the most-general among all mts admitting NAT are returned.")
    public static final SubLObject mts_accommodating_nat_alt(SubLObject cnat, SubLObject validate_expansionP, SubLObject number) {
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        return com.cyc.cycjava.cycl.at_utilities.nat_wf_in_mts(cnat, NIL, validate_expansionP, number);
    }

    /**
     *
     *
     * @return list, mts in which NAT is deemed wff (wrt currently accessible constraints).
    If NUMBER is a positive integer then at most NUMBER mts are returned
    else the most-general among all mts admitting NAT are returned.
     */
    @LispMethod(comment = "@return list, mts in which NAT is deemed wff (wrt currently accessible constraints).\r\nIf NUMBER is a positive integer then at most NUMBER mts are returned\r\nelse the most-general among all mts admitting NAT are returned.")
    public static SubLObject mts_accommodating_nat(final SubLObject cnat, SubLObject validate_expansionP, SubLObject number) {
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        return nat_wf_in_mts(cnat, NIL, validate_expansionP, number);
    }

    /**
     *
     *
     * @return list, mts in which NAT is deemed wff.
    If MT is non-null then constraints accessible in MT are considered,
    else currently accessible constraints are considered.
    If NUMBER is a positive integer then at most NUMBER mts are returned
    else the most-general among all mts admitting NAT are returned.
     */
    @LispMethod(comment = "@return list, mts in which NAT is deemed wff.\r\nIf MT is non-null then constraints accessible in MT are considered,\r\nelse currently accessible constraints are considered.\r\nIf NUMBER is a positive integer then at most NUMBER mts are returned\r\nelse the most-general among all mts admitting NAT are returned.")
    public static final SubLObject nat_wf_in_mts_alt(SubLObject cnat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        return com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_nat(cnat, mt, validate_expansionP, number);
    }

    /**
     *
     *
     * @return list, mts in which NAT is deemed wff.
    If MT is non-null then constraints accessible in MT are considered,
    else currently accessible constraints are considered.
    If NUMBER is a positive integer then at most NUMBER mts are returned
    else the most-general among all mts admitting NAT are returned.
     */
    @LispMethod(comment = "@return list, mts in which NAT is deemed wff.\r\nIf MT is non-null then constraints accessible in MT are considered,\r\nelse currently accessible constraints are considered.\r\nIf NUMBER is a positive integer then at most NUMBER mts are returned\r\nelse the most-general among all mts admitting NAT are returned.")
    public static SubLObject nat_wf_in_mts(final SubLObject cnat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        return max_floor_mts_of_nat(cnat, mt, validate_expansionP, number);
    }

    public static final SubLObject clear_cached_max_floor_mts_of_nat_alt() {
        {
            SubLObject cs = $cached_max_floor_mts_of_nat_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_max_floor_mts_of_nat() {
        final SubLObject cs = $cached_max_floor_mts_of_nat_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_max_floor_mts_of_nat_alt(SubLObject nat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_max_floor_mts_of_nat_caching_state$.getGlobalValue(), list(nat, mt, validate_expansionP, number), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_max_floor_mts_of_nat(final SubLObject nat, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_max_floor_mts_of_nat_caching_state$.getGlobalValue(), list(nat, mt, validate_expansionP, number), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_max_floor_mts_of_nat_internal_alt(SubLObject nat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        return com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_nat(nat, mt, validate_expansionP, number);
    }

    public static SubLObject cached_max_floor_mts_of_nat_internal(final SubLObject nat, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        return max_floor_mts_of_nat(nat, mt, validate_expansionP, number);
    }

    public static final SubLObject cached_max_floor_mts_of_nat_alt(SubLObject nat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        {
            SubLObject caching_state = $cached_max_floor_mts_of_nat_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_MAX_FLOOR_MTS_OF_NAT, $cached_max_floor_mts_of_nat_caching_state$, NIL, EQL, FOUR_INTEGER, $int$64);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_4(nat, mt, validate_expansionP, number);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw126$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (nat.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (mt.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (validate_expansionP.eql(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && number.eql(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.at_utilities.cached_max_floor_mts_of_nat_internal(nat, mt, validate_expansionP, number)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(nat, mt, validate_expansionP, number));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject cached_max_floor_mts_of_nat(final SubLObject nat, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        SubLObject caching_state = $cached_max_floor_mts_of_nat_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_MAX_FLOOR_MTS_OF_NAT, $cached_max_floor_mts_of_nat_caching_state$, NIL, EQL, FOUR_INTEGER, $int$64);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(nat, mt, validate_expansionP, number);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (nat.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (validate_expansionP.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && number.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_max_floor_mts_of_nat_internal(nat, mt, validate_expansionP, number)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(nat, mt, validate_expansionP, number));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject fast_max_floor_mts_of_nat_alt(SubLObject cnat, SubLObject validate_expansionP) {
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != nart_handles.nart_p(cnat)) {
                return com.cyc.cycjava.cycl.at_utilities.fast_max_floor_mts_of_nat(narts_high.nart_hl_formula(cnat), validate_expansionP);
            } else {
                {
                    SubLObject candidate_mts = com.cyc.cycjava.cycl.at_utilities.nat_wf_default_mts(cnat, UNPROVIDED, UNPROVIDED);
                    SubLObject mts = com.cyc.cycjava.cycl.at_utilities.result_of_max_floor_mts_of_nat(cnat, candidate_mts, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = $max_floor_mts_of_nat_exceptions$.currentBinding(thread);
                        try {
                            $max_floor_mts_of_nat_exceptions$.bind(candidate_mts, thread);
                            if (NIL == mts) {
                                mts = com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_nat(cnat, NIL, validate_expansionP, UNPROVIDED);
                            }
                        } finally {
                            $max_floor_mts_of_nat_exceptions$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return mts;
                }
            }
        }
    }

    public static SubLObject fast_max_floor_mts_of_nat(final SubLObject cnat, SubLObject validate_expansionP) {
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nart_handles.nart_p(cnat)) {
            return fast_max_floor_mts_of_nat(narts_high.nart_hl_formula(cnat), validate_expansionP);
        }
        final SubLObject candidate_mts = nat_wf_default_mts(cnat, UNPROVIDED, UNPROVIDED);
        SubLObject mts = result_of_max_floor_mts_of_nat(cnat, candidate_mts, UNPROVIDED);
        final SubLObject _prev_bind_0 = $max_floor_mts_of_nat_exceptions$.currentBinding(thread);
        try {
            $max_floor_mts_of_nat_exceptions$.bind(candidate_mts, thread);
            if (NIL == mts) {
                mts = max_floor_mts_of_nat(cnat, NIL, validate_expansionP, UNPROVIDED);
            }
        } finally {
            $max_floor_mts_of_nat_exceptions$.rebind(_prev_bind_0, thread);
        }
        return mts;
    }

    /**
     *
     *
     * @return list, mts in which NAT is deemed wff.
    If MT is non-null then arg constraints accessible in MT are considered,
    else all arg constraints are considered.
    If NUMBER is a positive integer then at most NUMBER mts are returned
    else the most-general among all mts admitting NAT are returned.
     */
    @LispMethod(comment = "@return list, mts in which NAT is deemed wff.\r\nIf MT is non-null then arg constraints accessible in MT are considered,\r\nelse all arg constraints are considered.\r\nIf NUMBER is a positive integer then at most NUMBER mts are returned\r\nelse the most-general among all mts admitting NAT are returned.")
    public static final SubLObject max_floor_mts_of_nat_alt(SubLObject nat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        return com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_naut(NIL != nart_handles.nart_p(nat) ? ((SubLObject) (narts_high.nart_hl_formula(nat))) : nat, mt, validate_expansionP, number);
    }

    /**
     *
     *
     * @return list, mts in which NAT is deemed wff.
    If MT is non-null then arg constraints accessible in MT are considered,
    else all arg constraints are considered.
    If NUMBER is a positive integer then at most NUMBER mts are returned
    else the most-general among all mts admitting NAT are returned.
     */
    @LispMethod(comment = "@return list, mts in which NAT is deemed wff.\r\nIf MT is non-null then arg constraints accessible in MT are considered,\r\nelse all arg constraints are considered.\r\nIf NUMBER is a positive integer then at most NUMBER mts are returned\r\nelse the most-general among all mts admitting NAT are returned.")
    public static SubLObject max_floor_mts_of_nat(final SubLObject nat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validate_expansionP == UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        return max_floor_mts_of_naut(NIL != nart_handles.nart_p(nat) ? narts_high.nart_hl_formula(nat) : nat, mt, validate_expansionP, number);
    }

    public static final SubLObject max_floor_mts_of_naut_alt(SubLObject naut, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == el_formula_p(naut)) {
            } else {
                if (NIL != validate_expansionP) {
                    {
                        SubLObject expansion_mt = (NIL != mt) ? ((SubLObject) (mt)) : $$EverythingPSC;
                        SubLObject naut_expansion = wff.wff_el_expansion(naut, expansion_mt);
                        if ((NIL == naut_expansion) || naut.equal(naut_expansion)) {
                            return com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_naut(naut, mt, NIL, number);
                        } else {
                            {
                                SubLObject candidate_mts = NIL;
                                {
                                    SubLObject _prev_bind_0 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = wff_vars.$validating_expansionP$.currentBinding(thread);
                                    try {
                                        at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                                        wff_vars.$unexpanded_formula$.bind(naut, thread);
                                        wff_vars.$validate_expansionsP$.bind(NIL, thread);
                                        wff_vars.$validating_expansionP$.bind(T, thread);
                                        candidate_mts = com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_nat(naut_expansion, mt, NIL, UNPROVIDED);
                                    } finally {
                                        wff_vars.$validating_expansionP$.rebind(_prev_bind_3, thread);
                                        wff_vars.$validate_expansionsP$.rebind(_prev_bind_2, thread);
                                        wff_vars.$unexpanded_formula$.rebind(_prev_bind_1, thread);
                                        at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                return com.cyc.cycjava.cycl.at_utilities.result_of_max_floor_mts_of_nat(naut, candidate_mts, number);
                            }
                        }
                    }
                } else {
                    if (!((NIL != term.closed_fn_termP(naut)) || ((NIL != wff_vars.validating_expansionP()) && (NIL != term.closed_fn_termP(wff_vars.unexpanded_formula()))))) {
                    } else {
                        if ((NIL != isa.result_isa_colP(cycl_utilities.nat_arg0(naut), $$Microtheory, mt)) && (NIL == com.cyc.cycjava.cycl.at_utilities.at_mt_mt_relevantP(mt))) {
                            return com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_naut(naut, mt_vars.$mt_mt$.getGlobalValue(), validate_expansionP, number);
                        } else {
                            return com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_naut_int(naut, mt, number);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject max_floor_mts_of_naut(final SubLObject naut, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_formula_p(naut)) {
            if (NIL != validate_expansionP) {
                final SubLObject expansion_mt = (NIL != mt) ? mt : $$EverythingPSC;
                final SubLObject naut_expansion = wff.wff_el_expansion(naut, expansion_mt);
                if ((NIL == naut_expansion) || naut.equal(naut_expansion)) {
                    return max_floor_mts_of_naut(naut, mt, NIL, number);
                }
                SubLObject candidate_mts = NIL;
                final SubLObject _prev_bind_0 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                final SubLObject _prev_bind_3 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_vars.$validating_expansionP$.currentBinding(thread);
                try {
                    at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(NIL, thread);
                    wff_vars.$unexpanded_formula$.bind(naut, thread);
                    wff_vars.$validate_expansionsP$.bind(NIL, thread);
                    wff_vars.$validating_expansionP$.bind(T, thread);
                    candidate_mts = max_floor_mts_of_nat(naut_expansion, mt, NIL, UNPROVIDED);
                } finally {
                    wff_vars.$validating_expansionP$.rebind(_prev_bind_4, thread);
                    wff_vars.$validate_expansionsP$.rebind(_prev_bind_3, thread);
                    wff_vars.$unexpanded_formula$.rebind(_prev_bind_2, thread);
                    at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0, thread);
                }
                return result_of_max_floor_mts_of_nat(naut, candidate_mts, number);
            } else {
                if (NIL == term.closed_fn_termP(naut)) {
                    if (NIL == wff_vars.validating_expansionP()) {
                        return NIL;
                    }
                    if (NIL == term.closed_fn_termP(wff_vars.unexpanded_formula())) {
                        return NIL;
                    }
                }
                if ((NIL != isa.result_isa_colP(cycl_utilities.nat_arg0(naut), $$Microtheory, mt)) && (NIL == at_mt_mt_relevantP(mt))) {
                    return max_floor_mts_of_naut(naut, mt_vars.$mt_mt$.getGlobalValue(), validate_expansionP, number);
                }
                return max_floor_mts_of_naut_int(naut, mt, number);
            }
        }
        return NIL;
    }

    public static final SubLObject max_floor_mts_of_naut_int_alt(SubLObject naut, SubLObject mt, SubLObject number) {
        {
            SubLObject fn = cycl_utilities.nat_functor(naut);
            SubLObject fn_mts = com.cyc.cycjava.cycl.at_utilities.nat_function_wff_mts(fn);
            SubLObject args_mts = list(fn_mts);
            SubLObject candidate_mts = (NIL != mt) ? ((SubLObject) (com.cyc.cycjava.cycl.at_utilities.candidate_mts_wrt(fn_mts, mt))) : fn_mts;
            if (NIL == fn_mts) {
                return NIL;
            }
            {
                SubLObject argnum = ZERO_INTEGER;
                SubLObject args = cycl_utilities.formula_args(naut, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    argnum = add(argnum, ONE_INTEGER);
                    if ((fn == $$Kappa) && argnum.eql(ONE_INTEGER)) {
                        if (NIL == cycl_var_listP(arg)) {
                            return NIL;
                        }
                    } else {
                        {
                            SubLObject arg_mts = com.cyc.cycjava.cycl.at_utilities.admitted_arg_candidate_mt_sets(arg, argnum, fn, mt);
                            if (NIL != arg_mts) {
                                args_mts = append(args_mts, arg_mts);
                            } else {
                                return NIL;
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = list_utilities.cross_products(list_utilities.fast_delete_duplicates(args_mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject mt_set = NIL;
                for (mt_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_set = cdolist_list_var.first()) {
                    candidate_mts = append(candidate_mts, genl_mts.max_floor_mts(mt_set, UNPROVIDED, UNPROVIDED));
                }
            }
            candidate_mts = com.cyc.cycjava.cycl.at_utilities.filter_excepted_nat_wff_mts(list_utilities.remove_duplicate_forts(candidate_mts));
            return com.cyc.cycjava.cycl.at_utilities.result_of_max_floor_mts_of_nat(naut, candidate_mts, number);
        }
    }

    public static SubLObject max_floor_mts_of_naut_int(final SubLObject naut, final SubLObject mt, final SubLObject number) {
        final SubLObject fn = cycl_utilities.nat_functor(naut);
        final SubLObject fn_mts = nat_function_wff_mts(fn);
        SubLObject args_mts = list(fn_mts);
        SubLObject candidate_mts = (NIL != mt) ? candidate_mts_wrt(fn_mts, mt) : fn_mts;
        if (NIL == fn_mts) {
            return NIL;
        }
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(naut, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            if (fn.eql($$Kappa) && argnum.eql(ONE_INTEGER)) {
                if (NIL == collection_defns.cycl_var_listP(arg)) {
                    return NIL;
                }
            } else {
                final SubLObject arg_mts = admitted_arg_candidate_mt_sets(arg, argnum, fn, mt);
                if (NIL == arg_mts) {
                    return NIL;
                }
                args_mts = append(args_mts, arg_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = list_utilities.cross_products(list_utilities.fast_delete_duplicates(args_mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject mt_set = NIL;
        mt_set = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            candidate_mts = append(candidate_mts, genl_mts.max_floor_mts(mt_set, UNPROVIDED, UNPROVIDED));
            cdolist_list_var2 = cdolist_list_var2.rest();
            mt_set = cdolist_list_var2.first();
        } 
        candidate_mts = filter_excepted_nat_wff_mts(list_utilities.remove_duplicate_forts(candidate_mts));
        return result_of_max_floor_mts_of_nat(naut, candidate_mts, number);
    }

    public static final SubLObject admitted_arg_candidate_mt_sets_alt(SubLObject arg, SubLObject argnum, SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg_mts = NIL;
                if ((NIL != nart_handles.nart_p(arg)) || (NIL != term.nautP(arg, UNPROVIDED))) {
                    {
                        SubLObject nat_wf_mts = NIL;
                        {
                            SubLObject _prev_bind_0 = $max_floor_mts_of_nat_recursionP$.currentBinding(thread);
                            try {
                                $max_floor_mts_of_nat_recursionP$.bind(T, thread);
                                nat_wf_mts = com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_nat(arg, mt, UNPROVIDED, UNPROVIDED);
                            } finally {
                                $max_floor_mts_of_nat_recursionP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL == nat_wf_mts) {
                            return NIL;
                        }
                        arg_mts = cons(nat_wf_mts, arg_mts);
                    }
                } else {
                    if (NIL != term.sentenceP(arg, UNPROVIDED)) {
                        {
                            SubLObject elf_mts = com.cyc.cycjava.cycl.at_utilities.nat_formula_arg_wff_mts(arg);
                            if (NIL == elf_mts) {
                                return NIL;
                            }
                            arg_mts = cons(elf_mts, arg_mts);
                        }
                    }
                }
                if (NIL != function_terms.nat_formula_p(arg)) {
                    {
                        SubLObject nart = narts_high.find_nart(arg);
                        if (NIL != nart) {
                            arg = nart;
                        }
                    }
                }
                {
                    SubLObject cols = NIL;
                    if (NIL != mt) {
                        cols = kb_accessors.argn_isa_implied(reln, argnum, mt);
                    } else {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                cols = kb_accessors.argn_isa_implied(reln, argnum, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = cols;
                        SubLObject col = NIL;
                        for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                            if (col.eql($$Thing)) {
                                arg_mts = cons(list(mt_vars.$thing_defining_mt$.getGlobalValue()), arg_mts);
                            } else {
                                {
                                    SubLObject mts = com.cyc.cycjava.cycl.at_utilities.nat_arg_wff_wrt_arg_isa_mts(arg, col);
                                    if (NIL != mts) {
                                        arg_mts = cons(mts, arg_mts);
                                    } else {
                                        if (NIL == $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread)) {
                                            return NIL;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if ((NIL != forts.fort_p(arg)) || (NIL != term.first_order_nautP(arg))) {
                    {
                        SubLObject cols = NIL;
                        if (NIL != mt) {
                            cols = kb_accessors.argn_genl(reln, argnum, mt);
                        } else {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    cols = kb_accessors.argn_genl(reln, argnum, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = cols;
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                {
                                    SubLObject mts = com.cyc.cycjava.cycl.at_utilities.nat_arg_wff_wrt_arg_genls_mts(arg, col);
                                    if (NIL != mts) {
                                        arg_mts = cons(mts, arg_mts);
                                    } else {
                                        if (NIL == $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread)) {
                                            return NIL;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return arg_mts;
            }
        }
    }

    public static SubLObject admitted_arg_candidate_mt_sets(SubLObject arg, final SubLObject argnum, final SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg_mts = NIL;
        if ((NIL != nart_handles.nart_p(arg)) || (NIL != term.nautP(arg, UNPROVIDED))) {
            SubLObject nat_wf_mts = NIL;
            final SubLObject _prev_bind_0 = $max_floor_mts_of_nat_recursionP$.currentBinding(thread);
            try {
                $max_floor_mts_of_nat_recursionP$.bind(T, thread);
                nat_wf_mts = max_floor_mts_of_nat(arg, mt, UNPROVIDED, UNPROVIDED);
            } finally {
                $max_floor_mts_of_nat_recursionP$.rebind(_prev_bind_0, thread);
            }
            if (NIL == nat_wf_mts) {
                return NIL;
            }
            arg_mts = cons(nat_wf_mts, arg_mts);
        } else
            if (NIL != term.sentenceP(arg, UNPROVIDED)) {
                final SubLObject elf_mts = nat_formula_arg_wff_mts(arg);
                if (NIL == elf_mts) {
                    return NIL;
                }
                arg_mts = cons(elf_mts, arg_mts);
            }

        if (NIL != function_terms.nat_formula_p(arg)) {
            final SubLObject nart = narts_high.find_nart(arg);
            if (NIL != nart) {
                arg = nart;
            }
        }
        SubLObject cols = NIL;
        if (NIL != mt) {
            cols = kb_accessors.argn_isa_implied(reln, argnum, mt);
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                cols = kb_accessors.argn_isa_implied(reln, argnum, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (col.eql($$Thing)) {
                arg_mts = cons(list(mt_vars.$thing_defining_mt$.getGlobalValue()), arg_mts);
            } else {
                final SubLObject mts = nat_arg_wff_wrt_arg_isa_mts(arg, col);
                if (NIL != mts) {
                    arg_mts = cons(mts, arg_mts);
                } else
                    if ((NIL == $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread)) && (NIL == at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread))) {
                        return NIL;
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        if ((NIL != forts.fort_p(arg)) || (NIL != term.first_order_nautP(arg))) {
            cols = NIL;
            if (NIL != mt) {
                cols = kb_accessors.argn_genl(reln, argnum, mt);
            } else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    cols = kb_accessors.argn_genl(reln, argnum, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cols;
            col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject mts = nat_arg_wff_wrt_arg_genls_mts(arg, col);
                if (NIL != mts) {
                    arg_mts = cons(mts, arg_mts);
                } else
                    if ((NIL == $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread)) && (NIL == at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread))) {
                        return NIL;
                    }

                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
        }
        if (((NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread)) && (NIL != kb_control_vars.within_forward_inferenceP())) && (NIL != wff.assertive_wff_ruleP(forward.current_forward_inference_rule()))) {
            return list(list($$UniversalVocabularyMt));
        }
        return arg_mts;
    }

    public static final SubLObject result_of_max_floor_mts_of_nat_alt(SubLObject nat, SubLObject candidate_mts, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mts = NIL;
                if (NIL != $max_floor_mts_of_nat_recursionP$.getDynamicValue(thread)) {
                    return mt_vars.maximize_mts_wrt_core(candidate_mts);
                } else {
                    {
                        SubLObject count = ZERO_INTEGER;
                        SubLObject doneP = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                                while ((NIL != candidate_mts) && (NIL == doneP)) {
                                    {
                                        SubLObject max_candidate_mts = genl_mts.max_mts(candidate_mts, UNPROVIDED);
                                        if (NIL == max_candidate_mts) {
                                            max_candidate_mts = candidate_mts;
                                        }
                                        if (NIL == doneP) {
                                            {
                                                SubLObject csome_list_var = max_candidate_mts;
                                                SubLObject mt = NIL;
                                                for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                                                    candidate_mts = delete(mt, candidate_mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    if (NIL == genl_mts.any_genl_mtP(mt, mts, UNPROVIDED, UNPROVIDED)) {
                                                        if (NIL != wff.el_wft_fastP(nat, mt)) {
                                                            mts = cons(mt, mts);
                                                            if (NIL != subl_promotions.positive_integer_p(number)) {
                                                                count = add(count, ONE_INTEGER);
                                                                doneP = numGE(count, number);
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
                }
                return genl_mts.max_mts(mts, UNPROVIDED);
            }
        }
    }

    public static SubLObject result_of_max_floor_mts_of_nat(final SubLObject nat, final SubLObject candidate_mts, SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = NIL;
        if (NIL != $max_floor_mts_of_nat_recursionP$.getDynamicValue(thread)) {
            return mt_vars.maximize_mts_wrt_core(candidate_mts);
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            if ((NIL == at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread)) && (NIL == doneP)) {
                SubLObject csome_list_var = candidate_mts;
                SubLObject mt = NIL;
                mt = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if ((NIL == genl_mts.any_genl_mtP(mt, mts, UNPROVIDED, UNPROVIDED)) && (NIL != wff.el_strictly_wft_fastP(nat, mt))) {
                        mts = cons(mt, mts);
                        if (NIL != subl_promotions.positive_integer_p(number)) {
                            count = add(count, ONE_INTEGER);
                            doneP = numGE(count, number);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                } 
            }
            if (((NIL == mts) && (NIL == wff_vars.wff_strictP())) && (NIL == doneP)) {
                SubLObject csome_list_var = candidate_mts;
                SubLObject mt = NIL;
                mt = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if ((NIL == genl_mts.any_genl_mtP(mt, mts, UNPROVIDED, UNPROVIDED)) && (NIL != wff.el_wft_fastP(nat, mt))) {
                        mts = cons(mt, mts);
                        if (NIL != subl_promotions.positive_integer_p(number)) {
                            count = add(count, ONE_INTEGER);
                            doneP = numGE(count, number);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genl_mts.max_mts(mts, UNPROVIDED);
    }

    /**
     *
     *
     * @return list, mts in which ARG satisfies arg constraints applicable
    to the ARGNUMth of RELATION
     */
    @LispMethod(comment = "@return list, mts in which ARG satisfies arg constraints applicable\r\nto the ARGNUMth of RELATION")
    public static final SubLObject max_floor_mts_of_admitted_arg_alt(SubLObject arg, SubLObject argnum, SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject reln_mts = com.cyc.cycjava.cycl.at_utilities.relation_wff_mts(reln);
            if (NIL != reln_mts) {
                {
                    SubLObject arg_mt_sets = com.cyc.cycjava.cycl.at_utilities.admitted_arg_candidate_mt_sets(arg, argnum, reln, mt);
                    if (NIL != arg_mt_sets) {
                        {
                            SubLObject mt_sets = cons(reln_mts, arg_mt_sets);
                            SubLObject candidate_mts = NIL;
                            SubLObject cdolist_list_var = list_utilities.cross_products(delete_duplicates(mt_sets, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            SubLObject mt_set = NIL;
                            for (mt_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_set = cdolist_list_var.first()) {
                                candidate_mts = append(candidate_mts, genl_mts.max_floor_mts(mt_set, UNPROVIDED, UNPROVIDED));
                            }
                            candidate_mts = list_utilities.remove_duplicate_forts(candidate_mts);
                            if ((NIL != nart_handles.nart_p(arg)) || (NIL != possibly_naut_p(arg))) {
                                return com.cyc.cycjava.cycl.at_utilities.result_of_max_floor_mts_of_nat(arg, candidate_mts, UNPROVIDED);
                            } else {
                                return genl_mts.max_mts(candidate_mts, UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return list, mts in which ARG satisfies arg constraints applicable
    to the ARGNUMth of RELATION
     */
    @LispMethod(comment = "@return list, mts in which ARG satisfies arg constraints applicable\r\nto the ARGNUMth of RELATION")
    public static SubLObject max_floor_mts_of_admitted_arg(final SubLObject arg, final SubLObject argnum, final SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject reln_mts = relation_wff_mts(reln);
        if (NIL != reln_mts) {
            final SubLObject arg_mt_sets = admitted_arg_candidate_mt_sets(arg, argnum, reln, mt);
            if (NIL != arg_mt_sets) {
                final SubLObject mt_sets = cons(reln_mts, arg_mt_sets);
                SubLObject candidate_mts = NIL;
                SubLObject cdolist_list_var = list_utilities.cross_products(delete_duplicates(mt_sets, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject mt_set = NIL;
                mt_set = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    candidate_mts = append(candidate_mts, genl_mts.max_floor_mts(mt_set, UNPROVIDED, UNPROVIDED));
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_set = cdolist_list_var.first();
                } 
                candidate_mts = list_utilities.remove_duplicate_forts(candidate_mts);
                if ((NIL != nart_handles.nart_p(arg)) || (NIL != possibly_naut_p(arg))) {
                    return result_of_max_floor_mts_of_nat(arg, candidate_mts, UNPROVIDED);
                }
                return genl_mts.max_mts(candidate_mts, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject max_floor_mts_of_nat_benchmark_alt(SubLObject n) {
        {
            SubLObject narts = com.cyc.cycjava.cycl.at_utilities.get_random_nart_set(n);
            SubLObject time = NIL;
            SubLObject time_var = get_internal_real_time();
            {
                SubLObject set_contents_var = set.do_set_internal(narts);
                SubLObject basis_object = do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                    {
                        SubLObject nart = do_set_contents_next(basis_object, state);
                        if (NIL != do_set_contents_element_validP(state, nart)) {
                            com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_nat(nart, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            return number_utilities.float_n(divide(time, n), TWO_INTEGER);
        }
    }

    public static SubLObject max_floor_mts_of_nat_benchmark(final SubLObject n) {
        final SubLObject narts = get_random_nart_set(n);
        SubLObject time = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject set_contents_var = set.do_set_internal(narts);
        SubLObject basis_object;
        SubLObject state;
        SubLObject nart;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            nart = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, nart)) {
                max_floor_mts_of_nat(nart, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return number_utilities.float_n(divide(time, n), TWO_INTEGER);
    }

    public static final SubLObject get_random_nart_set_alt(SubLObject n) {
        {
            SubLObject narts = set.new_set(EQL, n);
            while (n.numG(set.set_size(narts))) {
                {
                    SubLObject nart = narts_high.random_nart(UNPROVIDED);
                    if (NIL == set.set_memberP(nart, narts)) {
                        set.set_add(nart, narts);
                    }
                }
            } 
            return narts;
        }
    }

    public static SubLObject get_random_nart_set(final SubLObject n) {
        final SubLObject narts = set.new_set(EQL, n);
        while (n.numG(set.set_size(narts))) {
            final SubLObject nart = narts_high.random_nart(UNPROVIDED);
            if (NIL == set.set_memberP(nart, narts)) {
                set.set_add(nart, narts);
            }
        } 
        return narts;
    }

    public static final SubLObject max_floor_mts_of_admitted_arg_benchmark_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        {
            SubLObject support_data = com.cyc.cycjava.cycl.at_utilities.get_admitted_by_supports();
            SubLObject count = length(support_data);
            SubLObject time = NIL;
            SubLObject result = NIL;
            SubLObject time_var = get_internal_real_time();
            {
                SubLObject cdolist_list_var = (n.isInteger()) ? ((SubLObject) (list_utilities.first_n(n, support_data))) : support_data;
                SubLObject support_datum = NIL;
                for (support_datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support_datum = cdolist_list_var.first()) {
                    {
                        SubLObject assertion = support_datum.first();
                        SubLObject admitted_argument_gaf = third(support_datum);
                        SubLObject arg = cycl_utilities.sentence_arg1(admitted_argument_gaf, UNPROVIDED);
                        SubLObject argnum = cycl_utilities.sentence_arg2(admitted_argument_gaf, UNPROVIDED);
                        SubLObject reln = cycl_utilities.sentence_arg3(admitted_argument_gaf, UNPROVIDED);
                        SubLObject mts = com.cyc.cycjava.cycl.at_utilities.max_floor_mts_of_admitted_arg(arg, argnum, reln, UNPROVIDED);
                        if (!((NIL != list_utilities.singletonP(mts)) && (NIL != genl_mts.genl_mtP(assertions_high.assertion_mt(assertion), mts.first(), UNPROVIDED, UNPROVIDED)))) {
                            result = cons(list(assertion, admitted_argument_gaf, mts), result);
                        }
                    }
                }
            }
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            {
                SubLObject cdolist_list_var = result;
                SubLObject data = NIL;
                for (data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , data = cdolist_list_var.first()) {
                    format(T, $str_alt131$___S_____S_____s__, new SubLObject[]{ data.first(), second(data), third(data) });
                }
            }
            print(length(support_data), UNPROVIDED);
            return number_utilities.float_n(divide(time, count), TWO_INTEGER);
        }
    }

    public static SubLObject max_floor_mts_of_admitted_arg_benchmark(SubLObject n) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        final SubLObject support_data = get_admitted_by_supports();
        final SubLObject count = length(support_data);
        SubLObject time = NIL;
        SubLObject result = NIL;
        final SubLObject time_var = get_internal_real_time();
        SubLObject cdolist_list_var = (n.isInteger()) ? list_utilities.first_n(n, support_data) : support_data;
        SubLObject support_datum = NIL;
        support_datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assertion = support_datum.first();
            final SubLObject admitted_argument_gaf = third(support_datum);
            final SubLObject arg = cycl_utilities.sentence_arg1(admitted_argument_gaf, UNPROVIDED);
            final SubLObject argnum = cycl_utilities.sentence_arg2(admitted_argument_gaf, UNPROVIDED);
            final SubLObject reln = cycl_utilities.sentence_arg3(admitted_argument_gaf, UNPROVIDED);
            final SubLObject mts = max_floor_mts_of_admitted_arg(arg, argnum, reln, UNPROVIDED);
            if ((NIL == list_utilities.singletonP(mts)) || (NIL == genl_mts.genl_mtP(assertions_high.assertion_mt(assertion), mts.first(), UNPROVIDED, UNPROVIDED))) {
                result = cons(list(assertion, admitted_argument_gaf, mts), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support_datum = cdolist_list_var.first();
        } 
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        cdolist_list_var = result;
        SubLObject data = NIL;
        data = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str151$___S_____S_____s__, new SubLObject[]{ data.first(), second(data), third(data) });
            cdolist_list_var = cdolist_list_var.rest();
            data = cdolist_list_var.first();
        } 
        print(length(support_data), UNPROVIDED);
        return number_utilities.float_n(divide(time, count), TWO_INTEGER);
    }

    public static final SubLObject get_admitted_by_supports_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject admitted_by_supports = NIL;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_arguments, STRINGP);
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
                        noting_percent_progress_preamble($$$mapping_Cyc_arguments);
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
                                        {
                                            SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                            SubLObject argument = NIL;
                                            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                                if (NIL != deduction_handles.deduction_p(argument)) {
                                                    {
                                                        SubLObject cdolist_list_var_128 = deductions_high.deduction_supports(argument);
                                                        SubLObject support = NIL;
                                                        for (support = cdolist_list_var_128.first(); NIL != cdolist_list_var_128; cdolist_list_var_128 = cdolist_list_var_128.rest() , support = cdolist_list_var_128.first()) {
                                                            if (NIL == assertion_handles.assertion_p(support)) {
                                                                if (NIL != arguments.hl_support_p(support)) {
                                                                    {
                                                                        SubLObject sentence = arguments.support_sentence(support);
                                                                        SubLObject mt = arguments.support_mt(support);
                                                                        if ($$admittedArgument.eql(cycl_utilities.sentence_arg0(sentence))) {
                                                                            admitted_by_supports = cons(list(assertion, mt, sentence), admitted_by_supports);
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
                return delete_duplicates(admitted_by_supports, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject get_admitted_by_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admitted_by_supports = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$mapping_Cyc_arguments;
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
                final SubLObject idx_$159 = idx;
                if (NIL == id_index_objects_empty_p(idx_$159, $SKIP)) {
                    final SubLObject idx_$160 = idx_$159;
                    if (NIL == id_index_dense_objects_empty_p(idx_$160, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$160);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        SubLObject cdolist_list_var;
                        SubLObject argument;
                        SubLObject cdolist_list_var_$161;
                        SubLObject support;
                        SubLObject sentence;
                        SubLObject mt;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                argument = NIL;
                                argument = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != deduction_handles.deduction_p(argument)) {
                                        cdolist_list_var_$161 = deductions_high.deduction_supports(argument);
                                        support = NIL;
                                        support = cdolist_list_var_$161.first();
                                        while (NIL != cdolist_list_var_$161) {
                                            if ((NIL == assertion_handles.assertion_p(support)) && (NIL != arguments.hl_support_p(support))) {
                                                sentence = arguments.support_sentence(support);
                                                mt = arguments.support_mt(support);
                                                if ($$admittedArgument.eql(cycl_utilities.sentence_arg0(sentence))) {
                                                    admitted_by_supports = cons(list(assertion, mt, sentence), admitted_by_supports);
                                                }
                                            }
                                            cdolist_list_var_$161 = cdolist_list_var_$161.rest();
                                            support = cdolist_list_var_$161.first();
                                        } 
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    argument = cdolist_list_var.first();
                                } 
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$161 = idx_$159;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$161)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$161);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$161);
                        final SubLObject end_id = id_index_next_id(idx_$161);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(assertion2);
                                SubLObject argument2 = NIL;
                                argument2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    if (NIL != deduction_handles.deduction_p(argument2)) {
                                        SubLObject cdolist_list_var_$162 = deductions_high.deduction_supports(argument2);
                                        SubLObject support2 = NIL;
                                        support2 = cdolist_list_var_$162.first();
                                        while (NIL != cdolist_list_var_$162) {
                                            if ((NIL == assertion_handles.assertion_p(support2)) && (NIL != arguments.hl_support_p(support2))) {
                                                final SubLObject sentence2 = arguments.support_sentence(support2);
                                                final SubLObject mt2 = arguments.support_mt(support2);
                                                if ($$admittedArgument.eql(cycl_utilities.sentence_arg0(sentence2))) {
                                                    admitted_by_supports = cons(list(assertion2, mt2, sentence2), admitted_by_supports);
                                                }
                                            }
                                            cdolist_list_var_$162 = cdolist_list_var_$162.rest();
                                            support2 = cdolist_list_var_$162.first();
                                        } 
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    argument2 = cdolist_list_var2.first();
                                } 
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$164 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$164, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return delete_duplicates(admitted_by_supports, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject nat_formula_arg_wff_mts_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mts = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(NIL, thread);
                        at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                        wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                        wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
                        mts = com.cyc.cycjava.cycl.at_utilities.filter_excepted_nat_wff_mts(com.cyc.cycjava.cycl.at_utilities.mts_accommodating_formula_wrt_types(formula));
                    } finally {
                        wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_4, thread);
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return mts;
            }
        }
    }

    public static SubLObject nat_formula_arg_wff_mts(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            mts = filter_excepted_nat_wff_mts(mts_accommodating_formula_wrt_types(formula));
        } finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return mts;
    }

    public static final SubLObject nat_function_wff_mts_alt(SubLObject fn) {
        return isa.max_floor_mts_of_isa_paths(fn, $$Function_Denotational, UNPROVIDED);
    }

    public static SubLObject nat_function_wff_mts(final SubLObject fn) {
        return isa.max_floor_mts_of_isa_paths(fn, $$Function_Denotational, UNPROVIDED);
    }

    /**
     * in what mts is RELN a Relation
     */
    @LispMethod(comment = "in what mts is RELN a Relation")
    public static final SubLObject relation_wff_mts_alt(SubLObject reln) {
        return isa.max_floor_mts_of_isa_paths(reln, $$Relation, UNPROVIDED);
    }

    @LispMethod(comment = "in what mts is RELN a Relation")
    public static SubLObject relation_wff_mts(final SubLObject reln) {
        return isa.max_floor_mts_of_isa_paths(reln, $$Relation, UNPROVIDED);
    }/**
     * in what mts is RELN a Relation
     */


    public static final SubLObject candidate_mts_wrt_alt(SubLObject candidates, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = candidates;
            SubLObject candidate = NIL;
            for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                result = append(result, genl_mts.max_floor_mts(list(mt, candidate), UNPROVIDED, UNPROVIDED));
            }
            result = list_utilities.remove_duplicate_forts(result);
            return result;
        }
    }

    public static SubLObject candidate_mts_wrt(final SubLObject candidates, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = candidates;
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = append(result, genl_mts.max_floor_mts(list(mt, candidate), UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        result = list_utilities.remove_duplicate_forts(result);
        return result;
    }

    public static final SubLObject nat_arg_wff_wrt_arg_isa_mts_alt(SubLObject arg, SubLObject col) {
        return isa.max_floor_mts_of_isa_paths(arg, col, UNPROVIDED);
    }

    public static SubLObject nat_arg_wff_wrt_arg_isa_mts(final SubLObject arg, final SubLObject col) {
        return isa.max_floor_mts_of_isa_paths(arg, col, UNPROVIDED);
    }

    public static final SubLObject nat_arg_wff_wrt_arg_genls_mts_alt(SubLObject arg, SubLObject col) {
        return genls.max_floor_mts_of_genls_paths(arg, col, UNPROVIDED);
    }

    public static SubLObject nat_arg_wff_wrt_arg_genls_mts(final SubLObject arg, final SubLObject col) {
        return genls.max_floor_mts_of_genls_paths(arg, col, UNPROVIDED);
    }

    public static final SubLObject filter_excepted_nat_wff_mts_alt(SubLObject mts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject cdolist_list_var = mts;
                    SubLObject mt = NIL;
                    for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                        if (NIL == subl_promotions.memberP(mt, $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            result = cons(mt, result);
                        }
                    }
                    return result;
                }
            } else {
                return mts;
            }
        }
    }

    public static SubLObject filter_excepted_nat_wff_mts(final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == subl_promotions.memberP(mt, $max_floor_mts_of_nat_exceptions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    result = cons(mt, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
            return result;
        }
        return mts;
    }

    public static final SubLObject at_note_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
                format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                return NIL;
            }
            return NIL;
        }
    }

    public static SubLObject at_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject at_error_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else {
                if (add(TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }
            }
            return NIL;
        }
    }

    public static SubLObject at_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static final SubLObject at_cerror_alt(SubLObject level, SubLObject continue_str, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else {
                if (add(TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }
            }
            return NIL;
        }
    }

    public static SubLObject at_cerror(final SubLObject level, final SubLObject continue_str, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static final SubLObject at_warn_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
                apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                return NIL;
            }
            return NIL;
        }
    }

    public static SubLObject at_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; the minimal (i.e. most specific) collections which
    are both instances of #$AtemporalNecessarilyEssentialCollectionType
    and genls of COL.
     */
    @LispMethod(comment = "@return listp; the minimal (i.e. most specific) collections which\r\nare both instances of #$AtemporalNecessarilyEssentialCollectionType\r\nand genls of COL.")
    public static final SubLObject min_anects_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.min_genls_of_type(col, $const139$AtemporalNecessarilyEssentialColl, mt, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the minimal (i.e. most specific) collections which
    are both instances of #$AtemporalNecessarilyEssentialCollectionType
    and genls of COL.
     */
    @LispMethod(comment = "@return listp; the minimal (i.e. most specific) collections which\r\nare both instances of #$AtemporalNecessarilyEssentialCollectionType\r\nand genls of COL.")
    public static SubLObject min_anects(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.min_genls_of_type(col, $const159$AtemporalNecessarilyEssentialColl, mt, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the minimal (i.e. most specific) collections which
    are both instances of #$AtemporalNecessarilyEssentialCollectionType
    and genls of all collections in COLS.
     */
    @LispMethod(comment = "@return listp; the minimal (i.e. most specific) collections which\r\nare both instances of #$AtemporalNecessarilyEssentialCollectionType\r\nand genls of all collections in COLS.")
    public static final SubLObject union_min_anects_alt(SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.union_min_genls_of_type(cols, $const139$AtemporalNecessarilyEssentialColl, mt, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the minimal (i.e. most specific) collections which
    are both instances of #$AtemporalNecessarilyEssentialCollectionType
    and genls of all collections in COLS.
     */
    @LispMethod(comment = "@return listp; the minimal (i.e. most specific) collections which\r\nare both instances of #$AtemporalNecessarilyEssentialCollectionType\r\nand genls of all collections in COLS.")
    public static SubLObject union_min_anects(final SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.union_min_genls_of_type(cols, $const159$AtemporalNecessarilyEssentialColl, mt, UNPROVIDED);
    }

    /**
     * Returns a list of CycL sentences expressing the constraints that RELATION
     * imposes on its ARGNUMth argument.
     */
    @LispMethod(comment = "Returns a list of CycL sentences expressing the constraints that RELATION\r\nimposes on its ARGNUMth argument.\nReturns a list of CycL sentences expressing the constraints that RELATION\nimposes on its ARGNUMth argument.")
    public static final SubLObject relation_arg_constraint_sentences_alt(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject constraints = NIL;
            {
                SubLObject cols = kb_accessors.argn_isa_implied(relation, argnum, mt);
                SubLObject cdolist_list_var = cols;
                SubLObject col = NIL;
                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                    constraints = cons(make_ternary_formula($$argIsa, relation, argnum, col), constraints);
                }
            }
            {
                SubLObject cols = kb_accessors.argn_genl(relation, argnum, mt);
                SubLObject cdolist_list_var = cols;
                SubLObject col = NIL;
                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                    constraints = cons(make_ternary_formula($$argGenl, relation, argnum, col), constraints);
                }
            }
            return nreverse(constraints);
        }
    }

    @LispMethod(comment = "Returns a list of CycL sentences expressing the constraints that RELATION\r\nimposes on its ARGNUMth argument.\nReturns a list of CycL sentences expressing the constraints that RELATION\nimposes on its ARGNUMth argument.")
    public static SubLObject relation_arg_constraint_sentences(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        SubLObject cols = cdolist_list_var = kb_accessors.argn_isa_implied(relation, argnum, mt);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(make_ternary_formula($$argIsa, relation, argnum, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        cols = cdolist_list_var = kb_accessors.argn_genl(relation, argnum, mt);
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(make_ternary_formula($$argGenl, relation, argnum, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return nreverse(constraints);
    }/**
     * Returns a list of CycL sentences expressing the constraints that RELATION
     * imposes on its ARGNUMth argument.
     */


    public static final SubLObject variable_arity_relation_arg_constraint_sentences_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(relation, VARIABLE_ARITY_RELATION_P);
        {
            SubLObject constraints = NIL;
            {
                SubLObject args_isa = kb_accessors.args_isa(relation, mt);
                SubLObject cdolist_list_var = args_isa;
                SubLObject col = NIL;
                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                    constraints = cons(list($$argsIsa, relation, col), constraints);
                }
            }
            {
                SubLObject args_genl = kb_accessors.args_genl(relation, mt);
                SubLObject cdolist_list_var = args_genl;
                SubLObject col = NIL;
                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                    constraints = cons(list($$argsGenl, relation, col), constraints);
                }
            }
            return nreverse(constraints);
        }
    }

    public static SubLObject variable_arity_relation_arg_constraint_sentences(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != fort_types_interface.variable_arity_relation_p(relation) : "! fort_types_interface.variable_arity_relation_p(relation) " + ("fort_types_interface.variable_arity_relation_p(relation) " + "CommonSymbols.NIL != fort_types_interface.variable_arity_relation_p(relation) ") + relation;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args_isa = cdolist_list_var = kb_accessors.args_isa(relation, mt);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(list($$argsIsa, relation, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        final SubLObject args_genl = cdolist_list_var = kb_accessors.args_genl(relation, mt);
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(list($$argsGenl, relation, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return nreverse(constraints);
    }

    /**
     * Returns a list of CycL sentences expressing the constraints that RELATION
     * imposes on each of its top-level arguments.
     */
    @LispMethod(comment = "Returns a list of CycL sentences expressing the constraints that RELATION\r\nimposes on each of its top-level arguments.\nReturns a list of CycL sentences expressing the constraints that RELATION\nimposes on each of its top-level arguments.")
    public static final SubLObject all_relation_arg_constraint_sentences_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(relation, RELATION_P);
        {
            SubLObject constraints = NIL;
            SubLObject max_arity = arity.max_arity(relation);
            if (NIL != max_arity) {
                {
                    SubLObject end_var = number_utilities.f_1X(max_arity);
                    SubLObject argnum = NIL;
                    for (argnum = ONE_INTEGER; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                        {
                            SubLObject arg_constraints = com.cyc.cycjava.cycl.at_utilities.relation_arg_constraint_sentences(relation, argnum, mt);
                            constraints = nconc(nreverse(arg_constraints), constraints);
                        }
                    }
                }
            } else {
                constraints = com.cyc.cycjava.cycl.at_utilities.variable_arity_relation_arg_constraint_sentences(relation, mt);
            }
            return nreverse(constraints);
        }
    }

    @LispMethod(comment = "Returns a list of CycL sentences expressing the constraints that RELATION\r\nimposes on each of its top-level arguments.\nReturns a list of CycL sentences expressing the constraints that RELATION\nimposes on each of its top-level arguments.")
    public static SubLObject all_relation_arg_constraint_sentences(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != fort_types_interface.relation_p(relation) : "! fort_types_interface.relation_p(relation) " + ("fort_types_interface.relation_p(relation) " + "CommonSymbols.NIL != fort_types_interface.relation_p(relation) ") + relation;
        SubLObject constraints = NIL;
        final SubLObject max_arity = arity.max_arity(relation);
        if (NIL != max_arity) {
            SubLObject end_var;
            SubLObject argnum;
            SubLObject arg_constraints;
            for (end_var = number_utilities.f_1X(max_arity), argnum = NIL, argnum = ONE_INTEGER; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                arg_constraints = relation_arg_constraint_sentences(relation, argnum, mt);
                constraints = nconc(nreverse(arg_constraints), constraints);
            }
        } else {
            constraints = variable_arity_relation_arg_constraint_sentences(relation, mt);
        }
        return nreverse(constraints);
    }/**
     * Returns a list of CycL sentences expressing the constraints that RELATION
     * imposes on each of its top-level arguments.
     */


    public static final SubLObject all_relation_constraint_sentences_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == fort_types_interface.relation_p(relation)) {
            return NIL;
        }
        return nconc(arity.relation_arity_constraint_sentences(relation), com.cyc.cycjava.cycl.at_utilities.all_relation_arg_constraint_sentences(relation, mt));
    }

    public static SubLObject all_relation_constraint_sentences(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == fort_types_interface.relation_p(relation)) {
            return NIL;
        }
        return nconc(arity.relation_arity_constraint_sentences(relation), all_relation_arg_constraint_sentences(relation, mt));
    }

    /**
     * Given that TERM is the ARGNUMth argument to RELATION, what constraint(s) must it satisfy?
     */
    @LispMethod(comment = "Given that TERM is the ARGNUMth argument to RELATION, what constraint(s) must it satisfy?")
    public static final SubLObject relation_term_arg_constraints_alt(SubLObject relation, SubLObject v_term, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(relation, FORT_P);
        SubLTrampolineFile.checkType(argnum, POSITIVE_INTEGER_P);
        {
            SubLObject constraints = NIL;
            {
                SubLObject cols = kb_accessors.argn_isa(relation, argnum, mt);
                SubLObject cdolist_list_var = cols;
                SubLObject col = NIL;
                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                    constraints = cons(make_binary_formula($$isa, v_term, col), constraints);
                }
            }
            {
                SubLObject cols = kb_accessors.argn_genl(relation, argnum, mt);
                SubLObject cdolist_list_var = cols;
                SubLObject col = NIL;
                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                    constraints = cons(make_binary_formula($$genls, v_term, col), constraints);
                }
            }
            return nreverse(constraints);
        }
    }

    @LispMethod(comment = "Given that TERM is the ARGNUMth argument to RELATION, what constraint(s) must it satisfy?")
    public static SubLObject relation_term_arg_constraints(final SubLObject relation, final SubLObject v_term, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(relation) : "! forts.fort_p(relation) " + ("forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) ") + relation;
        assert NIL != subl_promotions.positive_integer_p(argnum) : "! subl_promotions.positive_integer_p(argnum) " + ("subl_promotions.positive_integer_p(argnum) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(argnum) ") + argnum;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        SubLObject cols = cdolist_list_var = kb_accessors.argn_isa(relation, argnum, mt);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(make_binary_formula($$isa, v_term, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        cols = cdolist_list_var = kb_accessors.argn_genl(relation, argnum, mt);
        col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constraints = cons(make_binary_formula($$genls, v_term, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return nreverse(constraints);
    }/**
     * Given that TERM is the ARGNUMth argument to RELATION, what constraint(s) must it satisfy?
     */


    /**
     * Returns a list of sentences expressing constraints on the constituents of FORMULA.
     * Currently only handles #$argIsa and #$argGenl constraints for top-level arguments,
     * but could be extended to handle inter-arg constraints and more.
     */
    @LispMethod(comment = "Returns a list of sentences expressing constraints on the constituents of FORMULA.\r\nCurrently only handles #$argIsa and #$argGenl constraints for top-level arguments,\r\nbut could be extended to handle inter-arg constraints and more.\nReturns a list of sentences expressing constraints on the constituents of FORMULA.\nCurrently only handles #$argIsa and #$argGenl constraints for top-level arguments,\nbut could be extended to handle inter-arg constraints and more.")
    public static final SubLObject formula_arg_constraints_cycl_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject constraints = NIL;
            SubLObject relation = cycl_utilities.formula_operator(formula);
            if (NIL == forts.fort_p(relation)) {
                return list(listS($$isa, relation, $list_alt149));
            } else {
                {
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject arg = NIL;
                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                        argnum = add(argnum, ONE_INTEGER);
                        {
                            SubLObject arg_constraints = com.cyc.cycjava.cycl.at_utilities.relation_term_arg_constraints(relation, arg, argnum, mt);
                            constraints = nconc(nreverse(arg_constraints), constraints);
                        }
                    }
                }
            }
            return nreverse(constraints);
        }
    }

    @LispMethod(comment = "Returns a list of sentences expressing constraints on the constituents of FORMULA.\r\nCurrently only handles #$argIsa and #$argGenl constraints for top-level arguments,\r\nbut could be extended to handle inter-arg constraints and more.\nReturns a list of sentences expressing constraints on the constituents of FORMULA.\nCurrently only handles #$argIsa and #$argGenl constraints for top-level arguments,\nbut could be extended to handle inter-arg constraints and more.")
    public static SubLObject formula_arg_constraints_cycl(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject constraints = NIL;
        final SubLObject relation = cycl_utilities.formula_operator(formula);
        if (NIL == forts.fort_p(relation)) {
            return list(listS($$isa, relation, $list169));
        }
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            final SubLObject arg_constraints = relation_term_arg_constraints(relation, arg, argnum, mt);
            constraints = nconc(nreverse(arg_constraints), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(constraints);
    }/**
     * Returns a list of sentences expressing constraints on the constituents of FORMULA.
     * Currently only handles #$argIsa and #$argGenl constraints for top-level arguments,
     * but could be extended to handle inter-arg constraints and more.
     */


    /**
     * Like @xref formula-variables-arg-constraints except returns an alist mapping variables to just #$isa constraints.
     *
     * @return alist-p; an alist mapping variables to collections that those variables are constrained to be instances of.
     */
    @LispMethod(comment = "Like @xref formula-variables-arg-constraints except returns an alist mapping variables to just #$isa constraints.\r\n\r\n@return alist-p; an alist mapping variables to collections that those variables are constrained to be instances of.")
    public static final SubLObject formula_variable_isa_constraint_alist_alt(SubLObject formula, SubLObject mt) {
        {
            SubLObject constraint_sentence = at_var_types.formula_variables_arg_constraints(formula, mt, UNPROVIDED);
            SubLObject isa_constraint_alist = com.cyc.cycjava.cycl.at_utilities.constraint_sentence_isa_constraints(constraint_sentence, mt);
            return isa_constraint_alist;
        }
    }

    @LispMethod(comment = "Like @xref formula-variables-arg-constraints except returns an alist mapping variables to just #$isa constraints.\r\n\r\n@return alist-p; an alist mapping variables to collections that those variables are constrained to be instances of.")
    public static SubLObject formula_variable_isa_constraint_alist(final SubLObject formula, final SubLObject mt) {
        final SubLObject constraint_sentence = at_var_types.formula_variables_arg_constraints(formula, mt, UNPROVIDED);
        final SubLObject isa_constraint_alist = constraint_sentence_isa_constraints(constraint_sentence, mt);
        return isa_constraint_alist;
    }/**
     * Like @xref formula-variables-arg-constraints except returns an alist mapping variables to just #$isa constraints.
     *
     * @return alist-p; an alist mapping variables to collections that those variables are constrained to be instances of.
     */


    /**
     *
     *
     * @return alist-p; an alist mapping variables to collections that those variables are constrained to be instances of.
     * @param CONSTRAINT-SENTENCE
     * 		el-sentence-p; for example from the result of @xref formula-variables-arg-constraints
     */
    @LispMethod(comment = "@return alist-p; an alist mapping variables to collections that those variables are constrained to be instances of.\r\n@param CONSTRAINT-SENTENCE\r\n\t\tel-sentence-p; for example from the result of @xref formula-variables-arg-constraints")
    public static final SubLObject constraint_sentence_isa_constraints_alt(SubLObject constraint_sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject conjunction = (NIL != el_conjunction_p(constraint_sentence)) ? ((SubLObject) (constraint_sentence)) : simplifier.conjoin(list(constraint_sentence), UNPROVIDED);
                SubLObject args = cycl_utilities.formula_args(conjunction, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject conjunct = NIL;
                for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                    if (NIL != el_formula_with_operator_p(conjunct, $$isa)) {
                        {
                            SubLObject var = cycl_utilities.atomic_sentence_arg1(conjunct, UNPROVIDED);
                            SubLObject col = cycl_utilities.atomic_sentence_arg2(conjunct, UNPROVIDED);
                            SubLTrampolineFile.checkType(var, $sym150$CYC_VAR_);
                            dictionary_utilities.dictionary_push(dict, var, col);
                        }
                    }
                }
                {
                    SubLObject alist = NIL;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject cols = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            alist = list_utilities.alist_enter(alist, var, genls.min_cols(cols, mt, UNPROVIDED), UNPROVIDED);
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    return alist;
                }
            }
        }
    }

    /**
     *
     *
     * @return alist-p; an alist mapping variables to collections that those variables are constrained to be instances of.
     * @param CONSTRAINT-SENTENCE
     * 		el-sentence-p; for example from the result of @xref formula-variables-arg-constraints
     */
    @LispMethod(comment = "@return alist-p; an alist mapping variables to collections that those variables are constrained to be instances of.\r\n@param CONSTRAINT-SENTENCE\r\n\t\tel-sentence-p; for example from the result of @xref formula-variables-arg-constraints")
    public static SubLObject constraint_sentence_isa_constraints(final SubLObject constraint_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        final SubLObject conjunction = (NIL != el_conjunction_p(constraint_sentence)) ? constraint_sentence : simplifier.conjoin(list(constraint_sentence), UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(conjunction, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_formula_with_operator_p(conjunct, $$isa)) {
                final SubLObject var = cycl_utilities.atomic_sentence_arg1(conjunct, UNPROVIDED);
                final SubLObject col = cycl_utilities.atomic_sentence_arg2(conjunct, UNPROVIDED);
                assert NIL != cycl_variables.cyc_varP(var) : "! cycl_variables.cyc_varP(var) " + ("cycl_variables.cyc_varP(var) " + "CommonSymbols.NIL != cycl_variables.cyc_varP(var) ") + var;
                dictionary_utilities.dictionary_push(dict, var, col);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        SubLObject alist = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject cols = thread.secondMultipleValue();
            thread.resetMultipleValues();
            alist = list_utilities.alist_enter(alist, var2, genls.min_cols(cols, mt, UNPROVIDED), UNPROVIDED);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return alist;
    }

    /**
     *
     *
     * @return list of possible variable binding sets for variables in 'formula' to variables in 'followup-formula'; The list of binding sets is ordered from most prefered to least prefered (algorithm is currently very simplistic and needs a bit of work). A variable bind set is a list. The first item in a variable binding set is a real number score for how good this binding set is: 0 = 'bad' through 100 = 'excellent'.  The second item is a list of variable name pairs. The first variable name is pulled from 'formula' the second variable name is pulled from 'followup-formula'.
     */
    @LispMethod(comment = "@return list of possible variable binding sets for variables in \'formula\' to variables in \'followup-formula\'; The list of binding sets is ordered from most prefered to least prefered (algorithm is currently very simplistic and needs a bit of work). A variable bind set is a list. The first item in a variable binding set is a real number score for how good this binding set is: 0 = \'bad\' through 100 = \'excellent\'.  The second item is a list of variable name pairs. The first variable name is pulled from \'formula\' the second variable name is pulled from \'followup-formula\'.")
    public static final SubLObject possible_followup_variable_binding_sets_alt(SubLObject formula, SubLObject followup_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject formula_constraints_dictionary = at_var_types.formula_variables_arg_constraints_dict(formula, mt, UNPROVIDED, UNPROVIDED);
            SubLObject followup_constraints_dictionary = at_var_types.formula_variables_arg_constraints_dict(followup_formula, mt, UNPROVIDED, UNPROVIDED);
            SubLObject cur_isa_constraints = NIL;
            SubLObject cur_genls_constraints = NIL;
            SubLObject var_score = NIL;
            SubLObject bindings_list = NIL;
            SubLObject cur_followup_isa_constraints = NIL;
            SubLObject cur_followup_genls_constraints = NIL;
            SubLObject cur_followup_quoted_isa_constraints = NIL;
            SubLObject sentence_variables = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject followup_variables = sentence_free_variables(followup_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject possible_bindings = dictionary.new_dictionary(EQL, length(sentence_variables));
            {
                SubLObject cdolist_list_var = sentence_variables;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    {
                        SubLObject datum_evaluated_var = dictionary.dictionary_lookup(formula_constraints_dictionary, var, UNPROVIDED);
                        cur_isa_constraints = datum_evaluated_var.first();
                        cur_genls_constraints = cadr(datum_evaluated_var);
                    }
                    {
                        SubLObject cdolist_list_var_129 = followup_variables;
                        SubLObject followup_var = NIL;
                        for (followup_var = cdolist_list_var_129.first(); NIL != cdolist_list_var_129; cdolist_list_var_129 = cdolist_list_var_129.rest() , followup_var = cdolist_list_var_129.first()) {
                            {
                                SubLObject datum_evaluated_var = dictionary.dictionary_lookup(followup_constraints_dictionary, followup_var, UNPROVIDED);
                                cur_followup_isa_constraints = datum_evaluated_var.first();
                                cur_followup_genls_constraints = cadr(datum_evaluated_var);
                                cur_followup_quoted_isa_constraints = cddr(datum_evaluated_var).first();
                            }
                            if (!((NIL != disjoint_with.any_disjoint_with_anyP(cur_isa_constraints, cur_followup_isa_constraints, mt, UNPROVIDED)) || (NIL != disjoint_with.any_disjoint_with_anyP(cur_genls_constraints, cur_followup_genls_constraints, mt, UNPROVIDED)))) {
                                var_score = com.cyc.cycjava.cycl.at_utilities.isas_and_genls_similarity(cur_isa_constraints, cur_followup_isa_constraints, cur_genls_constraints, cur_followup_genls_constraints, mt);
                                dictionary_utilities.dictionary_push(possible_bindings, var, list(followup_var, var_score));
                            }
                        }
                    }
                }
            }
            bindings_list = com.cyc.cycjava.cycl.at_utilities.calc_possible_followup_binding_sets(possible_bindings, NIL, NIL);
            {
                SubLObject cdolist_list_var = bindings_list;
                SubLObject binding_set = NIL;
                for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                    result = cons(list(com.cyc.cycjava.cycl.at_utilities.similarity_for_variable_binding_set(binding_set, formula, followup_formula, mt), binding_set), result);
                }
            }
            return Sort.sort(result, symbol_function(VARIABLE_BINDING_SET_ITEM_COMPARATOR), UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return list of possible variable binding sets for variables in 'formula' to variables in 'followup-formula'; The list of binding sets is ordered from most prefered to least prefered (algorithm is currently very simplistic and needs a bit of work). A variable bind set is a list. The first item in a variable binding set is a real number score for how good this binding set is: 0 = 'bad' through 100 = 'excellent'.  The second item is a list of variable name pairs. The first variable name is pulled from 'formula' the second variable name is pulled from 'followup-formula'.
     */
    @LispMethod(comment = "@return list of possible variable binding sets for variables in \'formula\' to variables in \'followup-formula\'; The list of binding sets is ordered from most prefered to least prefered (algorithm is currently very simplistic and needs a bit of work). A variable bind set is a list. The first item in a variable binding set is a real number score for how good this binding set is: 0 = \'bad\' through 100 = \'excellent\'.  The second item is a list of variable name pairs. The first variable name is pulled from \'formula\' the second variable name is pulled from \'followup-formula\'.")
    public static SubLObject possible_followup_variable_binding_sets(final SubLObject formula, final SubLObject followup_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        final SubLObject formula_constraints_dictionary = at_var_types.formula_variables_arg_constraints_dict(formula, mt, UNPROVIDED, UNPROVIDED);
        final SubLObject followup_constraints_dictionary = at_var_types.formula_variables_arg_constraints_dict(followup_formula, mt, UNPROVIDED, UNPROVIDED);
        SubLObject cur_isa_constraints = NIL;
        SubLObject cur_genls_constraints = NIL;
        SubLObject var_score = NIL;
        SubLObject bindings_list = NIL;
        SubLObject cur_followup_isa_constraints = NIL;
        SubLObject cur_followup_genls_constraints = NIL;
        SubLObject cur_followup_quoted_isa_constraints = NIL;
        final SubLObject sentence_variables = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject followup_variables = sentence_free_variables(followup_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject possible_bindings = dictionary.new_dictionary(EQL, length(sentence_variables));
        SubLObject cdolist_list_var = sentence_variables;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject datum_evaluated_var = dictionary.dictionary_lookup(formula_constraints_dictionary, var, UNPROVIDED);
            cur_isa_constraints = datum_evaluated_var.first();
            cur_genls_constraints = cadr(datum_evaluated_var);
            SubLObject cdolist_list_var_$165 = followup_variables;
            SubLObject followup_var = NIL;
            followup_var = cdolist_list_var_$165.first();
            while (NIL != cdolist_list_var_$165) {
                final SubLObject datum_evaluated_var2 = dictionary.dictionary_lookup(followup_constraints_dictionary, followup_var, UNPROVIDED);
                cur_followup_isa_constraints = datum_evaluated_var2.first();
                cur_followup_genls_constraints = cadr(datum_evaluated_var2);
                cur_followup_quoted_isa_constraints = cddr(datum_evaluated_var2).first();
                if ((NIL == disjoint_with.any_disjoint_with_anyP(cur_isa_constraints, cur_followup_isa_constraints, mt, UNPROVIDED, UNPROVIDED)) && (NIL == disjoint_with.any_disjoint_with_anyP(cur_genls_constraints, cur_followup_genls_constraints, mt, UNPROVIDED, UNPROVIDED))) {
                    var_score = isas_and_genls_similarity(cur_isa_constraints, cur_followup_isa_constraints, cur_genls_constraints, cur_followup_genls_constraints, mt);
                    dictionary_utilities.dictionary_push(possible_bindings, var, list(followup_var, var_score));
                }
                cdolist_list_var_$165 = cdolist_list_var_$165.rest();
                followup_var = cdolist_list_var_$165.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        bindings_list = cdolist_list_var = calc_possible_followup_binding_sets(possible_bindings, NIL, NIL);
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list(similarity_for_variable_binding_set(binding_set, formula, followup_formula, mt), binding_set), result);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        } 
        return Sort.sort(result, symbol_function(VARIABLE_BINDING_SET_ITEM_COMPARATOR), UNPROVIDED);
    }

    public static final SubLObject variable_binding_set_item_comparator_alt(SubLObject item_a, SubLObject item_b) {
        return funcall(symbol_function($sym121$_), item_a.first(), item_b.first());
    }

    public static SubLObject variable_binding_set_item_comparator(final SubLObject item_a, final SubLObject item_b) {
        return funcall(symbol_function($sym141$_), item_a.first(), item_b.first());
    }

    /**
     *
     *
     * @return all feasible bindings sets.
     */
    @LispMethod(comment = "@return all feasible bindings sets.")
    public static final SubLObject calc_possible_followup_binding_sets_alt(SubLObject bindings_dict, SubLObject bindings_list, SubLObject working_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            bindings_dict = dictionary_utilities.copy_dictionary(bindings_dict);
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(bindings_dict));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject cur_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        dictionary.dictionary_remove(bindings_dict, var);
                        {
                            SubLObject cdolist_list_var = cur_bindings;
                            SubLObject cur_binding = NIL;
                            for (cur_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_binding = cdolist_list_var.first()) {
                                cur_binding = cons(var, cur_binding);
                                working_bindings = cons(cur_binding, working_bindings);
                                bindings_list = com.cyc.cycjava.cycl.at_utilities.calc_possible_followup_binding_sets(dictionary_utilities.copy_dictionary(bindings_dict), bindings_list, working_bindings);
                                bindings_list = cons(working_bindings, bindings_list);
                                working_bindings = working_bindings.rest();
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return bindings_list;
        }
    }

    /**
     *
     *
     * @return all feasible bindings sets.
     */
    @LispMethod(comment = "@return all feasible bindings sets.")
    public static SubLObject calc_possible_followup_binding_sets(SubLObject bindings_dict, SubLObject bindings_list, SubLObject working_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        bindings_dict = dictionary_utilities.copy_dictionary(bindings_dict);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(bindings_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject cur_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_remove(bindings_dict, var);
            SubLObject cdolist_list_var = cur_bindings;
            SubLObject cur_binding = NIL;
            cur_binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cur_binding = cons(var, cur_binding);
                working_bindings = cons(cur_binding, working_bindings);
                bindings_list = calc_possible_followup_binding_sets(dictionary_utilities.copy_dictionary(bindings_dict), bindings_list, working_bindings);
                bindings_list = cons(working_bindings, bindings_list);
                working_bindings = working_bindings.rest();
                cdolist_list_var = cdolist_list_var.rest();
                cur_binding = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return bindings_list;
    }

    public static final SubLObject count_followup_bindings_alt(SubLObject variable_binding_set) {
        {
            SubLObject bindings_list = NIL;
            SubLObject cdolist_list_var = variable_binding_set;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                bindings_list = cons(second(binding), bindings_list);
            }
            return length(remove_duplicates(bindings_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject count_followup_bindings(final SubLObject variable_binding_set) {
        SubLObject bindings_list = NIL;
        SubLObject cdolist_list_var = variable_binding_set;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            bindings_list = cons(second(binding), bindings_list);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return length(remove_duplicates(bindings_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject similarity_for_variable_binding_set_alt(SubLObject variable_binding_set, SubLObject formula, SubLObject followup_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == variable_binding_set) {
            return ZERO_INTEGER;
        }
        {
            SubLObject formula_var_count = length(literal_variables(formula, UNPROVIDED, UNPROVIDED));
            SubLObject followup_var_count = length(literal_variables(followup_formula, UNPROVIDED, UNPROVIDED));
            SubLObject bindings_count_for_formula = length(variable_binding_set);
            SubLObject bindings_count_for_followup = com.cyc.cycjava.cycl.at_utilities.count_followup_bindings(variable_binding_set);
            SubLObject variable_bindings_score = ZERO_INTEGER;
            SubLObject formula_variable_usage_score = ZERO_INTEGER;
            SubLObject followup_variable_usage_score = ZERO_INTEGER;
            if (formula_var_count == ZERO_INTEGER) {
                formula_variable_usage_score = $int$100;
            } else {
                formula_variable_usage_score = multiply($int$100, divide(bindings_count_for_formula, formula_var_count));
            }
            if (followup_var_count == ZERO_INTEGER) {
                followup_variable_usage_score = $int$100;
            } else {
                followup_variable_usage_score = multiply($int$100, divide(bindings_count_for_followup, formula_var_count));
            }
            {
                SubLObject cdolist_list_var = variable_binding_set;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    variable_bindings_score = add(variable_bindings_score, third(binding));
                }
            }
            variable_bindings_score = divide(variable_bindings_score, bindings_count_for_formula);
            return divide(add(variable_bindings_score, divide(add(formula_variable_usage_score, followup_variable_usage_score), TWO_INTEGER)), TWO_INTEGER);
        }
    }

    public static SubLObject similarity_for_variable_binding_set(final SubLObject variable_binding_set, final SubLObject formula, final SubLObject followup_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == variable_binding_set) {
            return ZERO_INTEGER;
        }
        final SubLObject formula_var_count = length(literal_variables(formula, UNPROVIDED, UNPROVIDED));
        final SubLObject followup_var_count = length(literal_variables(followup_formula, UNPROVIDED, UNPROVIDED));
        final SubLObject bindings_count_for_formula = length(variable_binding_set);
        final SubLObject bindings_count_for_followup = count_followup_bindings(variable_binding_set);
        SubLObject variable_bindings_score = ZERO_INTEGER;
        SubLObject formula_variable_usage_score = ZERO_INTEGER;
        SubLObject followup_variable_usage_score = ZERO_INTEGER;
        if (formula_var_count.eql(ZERO_INTEGER)) {
            formula_variable_usage_score = $int$100;
        } else {
            formula_variable_usage_score = multiply($int$100, divide(bindings_count_for_formula, formula_var_count));
        }
        if (followup_var_count.eql(ZERO_INTEGER)) {
            followup_variable_usage_score = $int$100;
        } else {
            followup_variable_usage_score = multiply($int$100, divide(bindings_count_for_followup, formula_var_count));
        }
        SubLObject cdolist_list_var = variable_binding_set;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            variable_bindings_score = add(variable_bindings_score, third(binding));
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        variable_bindings_score = divide(variable_bindings_score, bindings_count_for_formula);
        return divide(add(variable_bindings_score, divide(add(formula_variable_usage_score, followup_variable_usage_score), TWO_INTEGER)), TWO_INTEGER);
    }

    /**
     *
     *
     * @return real number score for how closely the list of constraints1 is to the list of constraints2. 0='bad' through 100= 'excellent'. Algorithm needs a bit of work.
     */
    @LispMethod(comment = "@return real number score for how closely the list of constraints1 is to the list of constraints2. 0=\'bad\' through 100= \'excellent\'. Algorithm needs a bit of work.")
    public static final SubLObject constraint_similarity_alt(SubLObject constraints1, SubLObject constraints2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL == constraints1) || (NIL == constraints2)) {
            return ONE_INTEGER;
        }
        {
            SubLObject max_generality = log(cardinality_estimates.generality_estimate($$Thing), UNPROVIDED);
            SubLObject min_gen_constraints1 = max(ONE_INTEGER, cardinality_estimates.generality_estimate(constraints1.first()));
            SubLObject min_gen_constraints2 = max(ONE_INTEGER, cardinality_estimates.generality_estimate(constraints2.first()));
            if (min_gen_constraints1.numL(min_gen_constraints2)) {
                return ONE_INTEGER;
            }
            {
                SubLObject constraint_diff = abs(subtract(log(min_gen_constraints1, UNPROVIDED), log(min_gen_constraints2, UNPROVIDED)));
                SubLObject score = subtract($int$100, multiply(divide(constraint_diff, max_generality), $int$100));
                if (constraint_diff.numL($float$0_01)) {
                    score = $int$100;
                }
                return score;
            }
        }
    }

    /**
     *
     *
     * @return real number score for how closely the list of constraints1 is to the list of constraints2. 0='bad' through 100= 'excellent'. Algorithm needs a bit of work.
     */
    @LispMethod(comment = "@return real number score for how closely the list of constraints1 is to the list of constraints2. 0=\'bad\' through 100= \'excellent\'. Algorithm needs a bit of work.")
    public static SubLObject constraint_similarity(final SubLObject constraints1, final SubLObject constraints2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL == constraints1) || (NIL == constraints2)) {
            return ONE_INTEGER;
        }
        final SubLObject max_generality = log(cardinality_estimates.generality_estimate($$Thing), UNPROVIDED);
        final SubLObject min_gen_constraints1 = max(ONE_INTEGER, cardinality_estimates.generality_estimate(constraints1.first()));
        final SubLObject min_gen_constraints2 = max(ONE_INTEGER, cardinality_estimates.generality_estimate(constraints2.first()));
        if (min_gen_constraints1.numL(min_gen_constraints2)) {
            return ONE_INTEGER;
        }
        final SubLObject constraint_diff = abs(subtract(log(min_gen_constraints1, UNPROVIDED), log(min_gen_constraints2, UNPROVIDED)));
        SubLObject score = subtract($int$100, multiply(divide(constraint_diff, max_generality), $int$100));
        if (constraint_diff.numL($float$0_01)) {
            score = $int$100;
        }
        return score;
    }

    /**
     *
     *
     * @return real number score for how closely the list of isas1 constraints is to the list of isas2 constraints. 0='bad' through 100= 'excellent'. Algorithm needs a bit of work.
     */
    @LispMethod(comment = "@return real number score for how closely the list of isas1 constraints is to the list of isas2 constraints. 0=\'bad\' through 100= \'excellent\'. Algorithm needs a bit of work.")
    public static final SubLObject isa_constraint_similarity_alt(SubLObject isas1, SubLObject isas2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.at_utilities.constraint_similarity(isas1, isas2, mt);
    }

    /**
     *
     *
     * @return real number score for how closely the list of isas1 constraints is to the list of isas2 constraints. 0='bad' through 100= 'excellent'. Algorithm needs a bit of work.
     */
    @LispMethod(comment = "@return real number score for how closely the list of isas1 constraints is to the list of isas2 constraints. 0=\'bad\' through 100= \'excellent\'. Algorithm needs a bit of work.")
    public static SubLObject isa_constraint_similarity(final SubLObject isas1, final SubLObject isas2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return constraint_similarity(isas1, isas2, mt);
    }

    /**
     *
     *
     * @return real number score for how closely the list of genls1 constraints is to the list of genls2 constraints. 0='bad' through 100= 'excellent'. Algorithm needs a bit of work.
     */
    @LispMethod(comment = "@return real number score for how closely the list of genls1 constraints is to the list of genls2 constraints. 0=\'bad\' through 100= \'excellent\'. Algorithm needs a bit of work.")
    public static final SubLObject genls_constraint_similarity_alt(SubLObject genls1, SubLObject genls2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.at_utilities.constraint_similarity(genls1, genls2, mt);
    }

    /**
     *
     *
     * @return real number score for how closely the list of genls1 constraints is to the list of genls2 constraints. 0='bad' through 100= 'excellent'. Algorithm needs a bit of work.
     */
    @LispMethod(comment = "@return real number score for how closely the list of genls1 constraints is to the list of genls2 constraints. 0=\'bad\' through 100= \'excellent\'. Algorithm needs a bit of work.")
    public static SubLObject genls_constraint_similarity(final SubLObject genls1, final SubLObject genls2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return constraint_similarity(genls1, genls2, mt);
    }

    /**
     *
     *
     * @return real number score for how closely the list of constraints1 is to the list of constraints2. 0='bad' through 100= 'excellent'. Algorithm needs a bit of work.
     */
    @LispMethod(comment = "@return real number score for how closely the list of constraints1 is to the list of constraints2. 0=\'bad\' through 100= \'excellent\'. Algorithm needs a bit of work.")
    public static final SubLObject isas_and_genls_similarity_alt(SubLObject isas1, SubLObject isas2, SubLObject genls1, SubLObject genls2, SubLObject mt) {
        if ((((NIL == isas1) && (NIL == isas2)) && (NIL == genls1)) && (NIL == genls2)) {
            return ONE_INTEGER;
        } else {
            if ((NIL == isas1) && (NIL == isas2)) {
                return com.cyc.cycjava.cycl.at_utilities.genls_constraint_similarity(genls1, genls2, mt);
            } else {
                if ((NIL == genls1) && (NIL == genls2)) {
                    return com.cyc.cycjava.cycl.at_utilities.isa_constraint_similarity(isas1, isas2, mt);
                } else {
                    {
                        SubLObject isa_score = com.cyc.cycjava.cycl.at_utilities.isa_constraint_similarity(isas1, isas2, mt);
                        SubLObject genls_score = com.cyc.cycjava.cycl.at_utilities.genls_constraint_similarity(genls1, genls2, mt);
                        return divide(add(isa_score, genls_score), TWO_INTEGER);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return real number score for how closely the list of constraints1 is to the list of constraints2. 0='bad' through 100= 'excellent'. Algorithm needs a bit of work.
     */
    @LispMethod(comment = "@return real number score for how closely the list of constraints1 is to the list of constraints2. 0=\'bad\' through 100= \'excellent\'. Algorithm needs a bit of work.")
    public static SubLObject isas_and_genls_similarity(final SubLObject isas1, final SubLObject isas2, final SubLObject genls1, final SubLObject genls2, final SubLObject mt) {
        if ((((NIL == isas1) && (NIL == isas2)) && (NIL == genls1)) && (NIL == genls2)) {
            return ONE_INTEGER;
        }
        if ((NIL == isas1) && (NIL == isas2)) {
            return genls_constraint_similarity(genls1, genls2, mt);
        }
        if ((NIL == genls1) && (NIL == genls2)) {
            return isa_constraint_similarity(isas1, isas2, mt);
        }
        final SubLObject isa_score = isa_constraint_similarity(isas1, isas2, mt);
        final SubLObject genls_score = genls_constraint_similarity(genls1, genls2, mt);
        return divide(add(isa_score, genls_score), TWO_INTEGER);
    }

    /**
     *
     *
     * @param SPECIFIC;
     * 		a CycL term
     * @param COLLECTION;
     * 		
     * @return booleanp; t if TERM is more specific than COLLECTION, nil otherwise
     * @unknown bertolo
     */
    @LispMethod(comment = "@param SPECIFIC;\r\n\t\ta CycL term\r\n@param COLLECTION;\r\n\t\t\r\n@return booleanp; t if TERM is more specific than COLLECTION, nil otherwise\r\n@unknown bertolo")
    public static final SubLObject more_specific_p_alt(SubLObject specific, SubLObject general, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL != mt) && (NIL != isa.isaP(specific, general, mt, UNPROVIDED))) {
            return T;
        } else {
            if ((NIL != mt) && (NIL != genls.genlsP(specific, general, mt, UNPROVIDED))) {
                return T;
            } else {
                if (((NIL != mt) && (NIL != forts.fort_p(specific))) && (NIL != genl_predicates.genl_predicateP(specific, general, UNPROVIDED, UNPROVIDED))) {
                    return T;
                } else {
                    if (NIL != isa.isa_in_any_mtP(specific, general)) {
                        return T;
                    } else {
                        if (NIL != genls.genl_in_any_mtP(specific, general)) {
                            return T;
                        } else {
                            if ((NIL != forts.fort_p(specific)) && (NIL != genl_predicates.genl_predicate_in_any_mtP(specific, general))) {
                                return T;
                            } else {
                                if ((NIL != genls.genl_in_any_mtP(general, $$Number_General)) && specific.isNumber()) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param SPECIFIC;
     * 		a CycL term
     * @param COLLECTION;
     * 		
     * @return booleanp; t if TERM is more specific than COLLECTION, nil otherwise
     * @unknown bertolo
     */
    @LispMethod(comment = "@param SPECIFIC;\r\n\t\ta CycL term\r\n@param COLLECTION;\r\n\t\t\r\n@return booleanp; t if TERM is more specific than COLLECTION, nil otherwise\r\n@unknown bertolo")
    public static SubLObject more_specific_p(final SubLObject specific, final SubLObject general, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL != mt) && (NIL != isa.isaP(specific, general, mt, UNPROVIDED))) {
            return T;
        }
        if ((NIL != mt) && (NIL != genls.genlsP(specific, general, mt, UNPROVIDED))) {
            return T;
        }
        if (((NIL != mt) && (NIL != forts.fort_p(specific))) && (NIL != genl_predicates.genl_predicateP(specific, general, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if (NIL != isa.isa_in_any_mtP(specific, general)) {
            return T;
        }
        if (NIL != genls.genl_in_any_mtP(specific, general)) {
            return T;
        }
        if ((NIL != forts.fort_p(specific)) && (NIL != genl_predicates.genl_predicate_in_any_mtP(specific, general))) {
            return T;
        }
        if ((NIL != genls.genl_in_any_mtP(general, $$Number_General)) && specific.isNumber()) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject declare_at_utilities_file_alt() {
        declareFunction("arg_n_predicate", "ARG-N-PREDICATE", 1, 0, false);
        declareFunction("arg_type_mt", "ARG-TYPE-MT", 4, 0, false);
        declareFunction("find_generic_arg_by_id", "FIND-GENERIC-ARG-BY-ID", 1, 0, false);
        declareFunction("find_generic_arg_id", "FIND-GENERIC-ARG-ID", 1, 0, false);
        declareFunction("store_generic_arg", "STORE-GENERIC-ARG", 2, 0, false);
        declareFunction("stored_generic_arg_p", "STORED-GENERIC-ARG-P", 1, 0, false);
        declareFunction("get_generic_arg", "GET-GENERIC-ARG", 1, 0, false);
        declareFunction("generic_arg_num", "GENERIC-ARG-NUM", 1, 0, false);
        declareFunction("generic_argP", "GENERIC-ARG?", 1, 0, false);
        declareFunction("inter_arg_isa_pred", "INTER-ARG-ISA-PRED", 2, 0, false);
        declareFunction("inter_arg_isa_inverse", "INTER-ARG-ISA-INVERSE", 2, 0, false);
        declareFunction("inter_arg_not_isa_pred", "INTER-ARG-NOT-ISA-PRED", 2, 0, false);
        declareFunction("inter_arg_not_isa_inverse", "INTER-ARG-NOT-ISA-INVERSE", 2, 0, false);
        declareFunction("inter_arg_genl_pred", "INTER-ARG-GENL-PRED", 2, 0, false);
        declareFunction("inter_arg_genl_inverse", "INTER-ARG-GENL-INVERSE", 2, 0, false);
        declareFunction("implication_opP", "IMPLICATION-OP?", 1, 0, false);
        declareFunction("logical_opP", "LOGICAL-OP?", 1, 0, false);
        declareFunction("truth_functionP", "TRUTH-FUNCTION?", 1, 0, false);
        declareFunction("initialize_all_arg_type_predicate_caches", "INITIALIZE-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
        declareFunction("clear_all_arg_type_predicate_caches", "CLEAR-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
        declareFunction("arg_isa_binary_predP", "ARG-ISA-BINARY-PRED?", 1, 1, false);
        declareFunction("arg_isa_ternary_predP", "ARG-ISA-TERNARY-PRED?", 1, 1, false);
        declareFunction("arg_isa_predicateP", "ARG-ISA-PREDICATE?", 1, 1, false);
        declareFunction("arg_genl_binary_predP", "ARG-GENL-BINARY-PRED?", 1, 1, false);
        declareFunction("arg_genl_ternary_predP", "ARG-GENL-TERNARY-PRED?", 1, 1, false);
        declareFunction("arg_genl_predicateP", "ARG-GENL-PREDICATE?", 1, 1, false);
        declareFunction("formula_denoting_functionP", "FORMULA-DENOTING-FUNCTION?", 1, 1, false);
        declareFunction("formula_functorP", "FORMULA-FUNCTOR?", 1, 1, false);
        declareFunction("sentence_denoting_functionP", "SENTENCE-DENOTING-FUNCTION?", 1, 1, false);
        declareFunction("sentence_functorP", "SENTENCE-FUNCTOR?", 1, 1, false);
        declareFunction("argn_type_levelP", "ARGN-TYPE-LEVEL?", 2, 1, false);
        declareFunction("min_genl_preds_admitting_fort_as_arg", "MIN-GENL-PREDS-ADMITTING-FORT-AS-ARG", 3, 1, false);
        declareFunction("forts_admitted_as_arg", "FORTS-ADMITTED-AS-ARG", 3, 3, false);
        declareFunction("min_implicit_types", "MIN-IMPLICIT-TYPES", 1, 1, false);
        declareFunction("term_requires_isa_in_relations", "TERM-REQUIRES-ISA-IN-RELATIONS", 2, 2, false);
        declareFunction("term_requires_genl_in_relations", "TERM-REQUIRES-GENL-IN-RELATIONS", 2, 2, false);
        declareFunction("term_requires_types_in_relations", "TERM-REQUIRES-TYPES-IN-RELATIONS", 2, 2, false);
        declareFunction("term_requires_isa_in_clause", "TERM-REQUIRES-ISA-IN-CLAUSE", 2, 1, false);
        declareFunction("term_requires_isa_in_relation", "TERM-REQUIRES-ISA-IN-RELATION", 2, 1, false);
        declareFunction("term_requires_isa_in_formula", "TERM-REQUIRES-ISA-IN-FORMULA", 2, 2, false);
        declareFunction("term_requires_genl_in_relation", "TERM-REQUIRES-GENL-IN-RELATION", 2, 1, false);
        declareFunction("get_sub_expression_for_term_position", "GET-SUB-EXPRESSION-FOR-TERM-POSITION", 2, 0, false);
        declareFunction("term_position_requires_types_in_relation", "TERM-POSITION-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
        declareFunction("term_requires_types_in_relation", "TERM-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
        declareFunction("arg_requires_isa_in_relation", "ARG-REQUIRES-ISA-IN-RELATION", 2, 1, false);
        declareFunction("pred_arg_isa_requires_other_arg_isa", "PRED-ARG-ISA-REQUIRES-OTHER-ARG-ISA", 3, 1, false);
        declareFunction("make_el_query_literal", "MAKE-EL-QUERY-LITERAL", 1, 0, false);
        declareFunction("arg_isa_applicable_gafs", "ARG-ISA-APPLICABLE-GAFS", 1, 0, false);
        declareFunction("gather_via_map_pred_index", "GATHER-VIA-MAP-PRED-INDEX", 1, 0, false);
        declareFunction("inter_arg_isa_cache_initializedP", "INTER-ARG-ISA-CACHE-INITIALIZED?", 0, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhere_cache_add", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
        declareFunction("clear_some_inter_arg_isa_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction("initialize_some_inter_arg_isa_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhereP", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
        declareFunction("some_inter_arg_isa_constraint_somewhereP", "SOME-INTER-ARG-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction("inter_arg_format_cache_initializedP", "INTER-ARG-FORMAT-CACHE-INITIALIZED?", 0, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhere_cache_add", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
        declareFunction("clear_some_inter_arg_format_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction("initialize_some_inter_arg_format_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhereP", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE?", 1, 0, false);
        declareFunction("some_inter_arg_format_constraint_somewhereP", "SOME-INTER-ARG-FORMAT-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction("reln_permits_generic_arg_variablesP", "RELN-PERMITS-GENERIC-ARG-VARIABLES?", 2, 0, false);
        declareFunction("reln_permits_keyword_variablesP", "RELN-PERMITS-KEYWORD-VARIABLES?", 2, 0, false);
        declareFunction("reln_constrained_to_be_collectionP", "RELN-CONSTRAINED-TO-BE-COLLECTION?", 3, 0, false);
        declareFunction("constraint_pred_constraint_argnum", "CONSTRAINT-PRED-CONSTRAINT-ARGNUM", 1, 0, false);
        declareFunction("gaf_arg_type_constraint", "GAF-ARG-TYPE-CONSTRAINT", 1, 0, false);
        declareFunction("gather_at_data", "GATHER-AT-DATA", 2, 2, false);
        declareFunction("gather_at_data_assertion", "GATHER-AT-DATA-ASSERTION", 1, 2, false);
        declareFunction("gather_at_constraint", "GATHER-AT-CONSTRAINT", 1, 2, false);
        declareFunction("gather_at_assertion", "GATHER-AT-ASSERTION", 1, 2, false);
        declareFunction("at_finishedP", "AT-FINISHED?", 0, 1, false);
        declareFunction("at_finished", "AT-FINISHED", 0, 1, false);
        declareFunction("at_mapping_finished", "AT-MAPPING-FINISHED", 0, 0, false);
        declareFunction("at_handle_mal_constraint", "AT-HANDLE-MAL-CONSTRAINT", 1, 0, false);
        declareFunction("at_mal_arg_msg", "AT-MAL-ARG-MSG", 1, 0, false);
        declareFunction("predicate_isa_violation_data", "PREDICATE-ISA-VIOLATION-DATA", 1, 1, false);
        declareFunction("meta_predicate_violation_data", "META-PREDICATE-VIOLATION-DATA", 1, 1, false);
        declareFunction("semantic_violations", "SEMANTIC-VIOLATIONS", 0, 0, false);
        declareFunction("note_at_violationP", "NOTE-AT-VIOLATION?", 0, 0, false);
        declareFunction("note_at_violation", "NOTE-AT-VIOLATION", 1, 0, false);
        declareFunction("recursive_violationP", "RECURSIVE-VIOLATION?", 1, 0, false);
        declareFunction("reset_at_violations", "RESET-AT-VIOLATIONS", 0, 1, false);
        declareFunction("reset_arity_violations", "RESET-ARITY-VIOLATIONS", 0, 1, false);
        declareFunction("reset_semantic_violations", "RESET-SEMANTIC-VIOLATIONS", 0, 1, false);
        declareFunction("reset_at_state", "RESET-AT-STATE", 0, 0, false);
        declareFunction("suggest_formula_fix_for_at_violation", "SUGGEST-FORMULA-FIX-FOR-AT-VIOLATION", 2, 0, false);
        declareFunction("assertion_arg_violations_among", "ASSERTION-ARG-VIOLATIONS-AMONG", 1, 0, false);
        declareFunction("sef_violations_among", "SEF-VIOLATIONS-AMONG", 1, 0, false);
        declareFunction("predicate_violations_among", "PREDICATE-VIOLATIONS-AMONG", 1, 0, false);
        declareFunction("assertion_arg_violationP", "ASSERTION-ARG-VIOLATION?", 1, 0, false);
        declareFunction("assertion_collectionP", "ASSERTION-COLLECTION?", 1, 1, false);
        declareFunction("sef_violationP", "SEF-VIOLATION?", 1, 0, false);
        declareFunction("predicate_violationP", "PREDICATE-VIOLATION?", 1, 0, false);
        declareFunction("assertion_arg_violation_fix", "ASSERTION-ARG-VIOLATION-FIX", 1, 0, false);
        declareFunction("strip_mt_literals", "STRIP-MT-LITERALS", 1, 1, false);
        declareFunction("sef_violation_fix", "SEF-VIOLATION-FIX", 1, 0, false);
        declareFunction("predicate_violation_fix", "PREDICATE-VIOLATION-FIX", 1, 0, false);
        declareFunction("violation_type", "VIOLATION-TYPE", 1, 0, false);
        declareFunction("mts_accommodating_formula_wrt_types", "MTS-ACCOMMODATING-FORMULA-WRT-TYPES", 1, 0, false);
        declareFunction("nat_wf_in_some_mtP", "NAT-WF-IN-SOME-MT?", 1, 2, false);
        declareFunction("nat_wf_in_some_mt", "NAT-WF-IN-SOME-MT", 1, 2, false);
        declareFunction("nat_wf_default_mts", "NAT-WF-DEFAULT-MTS", 1, 2, false);
        declareFunction("formula_forts_isa_mts", "FORMULA-FORTS-ISA-MTS", 1, 1, false);
        declareFunction("at_mt_mt_relevantP", "AT-MT-MT-RELEVANT?", 1, 0, false);
        declareFunction("mts_accommodating_nat", "MTS-ACCOMMODATING-NAT", 1, 2, false);
        declareFunction("nat_wf_in_mts", "NAT-WF-IN-MTS", 1, 3, false);
        declareFunction("clear_cached_max_floor_mts_of_nat", "CLEAR-CACHED-MAX-FLOOR-MTS-OF-NAT", 0, 0, false);
        declareFunction("remove_cached_max_floor_mts_of_nat", "REMOVE-CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
        declareFunction("cached_max_floor_mts_of_nat_internal", "CACHED-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 4, 0, false);
        declareFunction("cached_max_floor_mts_of_nat", "CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
        declareFunction("fast_max_floor_mts_of_nat", "FAST-MAX-FLOOR-MTS-OF-NAT", 1, 1, false);
        declareFunction("max_floor_mts_of_nat", "MAX-FLOOR-MTS-OF-NAT", 1, 3, false);
        declareFunction("max_floor_mts_of_naut", "MAX-FLOOR-MTS-OF-NAUT", 4, 0, false);
        declareFunction("max_floor_mts_of_naut_int", "MAX-FLOOR-MTS-OF-NAUT-INT", 3, 0, false);
        declareFunction("admitted_arg_candidate_mt_sets", "ADMITTED-ARG-CANDIDATE-MT-SETS", 3, 1, false);
        declareFunction("result_of_max_floor_mts_of_nat", "RESULT-OF-MAX-FLOOR-MTS-OF-NAT", 2, 1, false);
        declareFunction("max_floor_mts_of_admitted_arg", "MAX-FLOOR-MTS-OF-ADMITTED-ARG", 3, 1, false);
        declareFunction("max_floor_mts_of_nat_benchmark", "MAX-FLOOR-MTS-OF-NAT-BENCHMARK", 1, 0, false);
        declareFunction("get_random_nart_set", "GET-RANDOM-NART-SET", 1, 0, false);
        declareFunction("max_floor_mts_of_admitted_arg_benchmark", "MAX-FLOOR-MTS-OF-ADMITTED-ARG-BENCHMARK", 0, 1, false);
        declareFunction("get_admitted_by_supports", "GET-ADMITTED-BY-SUPPORTS", 0, 0, false);
        declareFunction("nat_formula_arg_wff_mts", "NAT-FORMULA-ARG-WFF-MTS", 1, 0, false);
        declareFunction("nat_function_wff_mts", "NAT-FUNCTION-WFF-MTS", 1, 0, false);
        declareFunction("relation_wff_mts", "RELATION-WFF-MTS", 1, 0, false);
        declareFunction("candidate_mts_wrt", "CANDIDATE-MTS-WRT", 2, 0, false);
        declareFunction("nat_arg_wff_wrt_arg_isa_mts", "NAT-ARG-WFF-WRT-ARG-ISA-MTS", 2, 0, false);
        declareFunction("nat_arg_wff_wrt_arg_genls_mts", "NAT-ARG-WFF-WRT-ARG-GENLS-MTS", 2, 0, false);
        declareFunction("filter_excepted_nat_wff_mts", "FILTER-EXCEPTED-NAT-WFF-MTS", 1, 0, false);
        declareFunction("at_note", "AT-NOTE", 2, 5, false);
        declareFunction("at_error", "AT-ERROR", 2, 5, false);
        declareFunction("at_cerror", "AT-CERROR", 3, 5, false);
        declareFunction("at_warn", "AT-WARN", 2, 5, false);
        declareFunction("min_anects", "MIN-ANECTS", 1, 1, false);
        declareFunction("union_min_anects", "UNION-MIN-ANECTS", 1, 1, false);
        declareFunction("relation_arg_constraint_sentences", "RELATION-ARG-CONSTRAINT-SENTENCES", 2, 1, false);
        declareFunction("variable_arity_relation_arg_constraint_sentences", "VARIABLE-ARITY-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
        declareFunction("all_relation_arg_constraint_sentences", "ALL-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
        declareFunction("all_relation_constraint_sentences", "ALL-RELATION-CONSTRAINT-SENTENCES", 1, 1, false);
        declareFunction("relation_term_arg_constraints", "RELATION-TERM-ARG-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_arg_constraints_cycl", "FORMULA-ARG-CONSTRAINTS-CYCL", 1, 1, false);
        declareFunction("formula_variable_isa_constraint_alist", "FORMULA-VARIABLE-ISA-CONSTRAINT-ALIST", 2, 0, false);
        declareFunction("constraint_sentence_isa_constraints", "CONSTRAINT-SENTENCE-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("possible_followup_variable_binding_sets", "POSSIBLE-FOLLOWUP-VARIABLE-BINDING-SETS", 2, 1, false);
        declareFunction("variable_binding_set_item_comparator", "VARIABLE-BINDING-SET-ITEM-COMPARATOR", 2, 0, false);
        declareFunction("calc_possible_followup_binding_sets", "CALC-POSSIBLE-FOLLOWUP-BINDING-SETS", 3, 0, false);
        declareFunction("count_followup_bindings", "COUNT-FOLLOWUP-BINDINGS", 1, 0, false);
        declareFunction("similarity_for_variable_binding_set", "SIMILARITY-FOR-VARIABLE-BINDING-SET", 3, 1, false);
        declareFunction("constraint_similarity", "CONSTRAINT-SIMILARITY", 2, 1, false);
        declareFunction("isa_constraint_similarity", "ISA-CONSTRAINT-SIMILARITY", 2, 1, false);
        declareFunction("genls_constraint_similarity", "GENLS-CONSTRAINT-SIMILARITY", 2, 1, false);
        declareFunction("isas_and_genls_similarity", "ISAS-AND-GENLS-SIMILARITY", 5, 0, false);
        declareFunction("more_specific_p", "MORE-SPECIFIC-P", 2, 1, false);
        declareFunction("subloop_reserved_initialize_generic_arg_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-GENERIC-ARG-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_generic_arg_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-GENERIC-ARG-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("generic_arg_test_case_p", "GENERIC-ARG-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_at_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("arg_n_predicate", "ARG-N-PREDICATE", 1, 0, false);
            declareFunction("arg_type_mt", "ARG-TYPE-MT", 4, 0, false);
            declareFunction("find_generic_arg_by_id", "FIND-GENERIC-ARG-BY-ID", 1, 0, false);
            declareFunction("find_generic_arg_id", "FIND-GENERIC-ARG-ID", 1, 0, false);
            declareFunction("store_generic_arg", "STORE-GENERIC-ARG", 2, 0, false);
            declareFunction("stored_generic_arg_p", "STORED-GENERIC-ARG-P", 1, 0, false);
            declareFunction("get_generic_arg", "GET-GENERIC-ARG", 1, 0, false);
            declareFunction("generic_arg_num", "GENERIC-ARG-NUM", 1, 0, false);
            declareFunction("generic_argP", "GENERIC-ARG?", 1, 0, false);
            declareFunction("inter_arg_isa_pred", "INTER-ARG-ISA-PRED", 2, 0, false);
            declareFunction("inter_arg_isa_inverse", "INTER-ARG-ISA-INVERSE", 2, 0, false);
            declareFunction("inter_arg_not_isa_pred", "INTER-ARG-NOT-ISA-PRED", 2, 0, false);
            declareFunction("inter_arg_not_isa_inverse", "INTER-ARG-NOT-ISA-INVERSE", 2, 0, false);
            declareFunction("inter_arg_genl_pred", "INTER-ARG-GENL-PRED", 2, 0, false);
            declareFunction("inter_arg_not_genl_pred", "INTER-ARG-NOT-GENL-PRED", 2, 0, false);
            declareFunction("inter_arg_isa_genl_pred", "INTER-ARG-ISA-GENL-PRED", 2, 0, false);
            declareFunction("inter_arg_genl_isa_pred", "INTER-ARG-GENL-ISA-PRED", 2, 0, false);
            declareFunction("inter_arg_genl_inverse", "INTER-ARG-GENL-INVERSE", 2, 0, false);
            declareFunction("implication_opP", "IMPLICATION-OP?", 1, 0, false);
            declareFunction("logical_opP", "LOGICAL-OP?", 1, 0, false);
            declareFunction("truth_functionP", "TRUTH-FUNCTION?", 1, 0, false);
            declareFunction("initialize_all_arg_type_predicate_caches", "INITIALIZE-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
            declareFunction("clear_all_arg_type_predicate_caches", "CLEAR-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
            declareFunction("arg_isa_binary_predP", "ARG-ISA-BINARY-PRED?", 1, 1, false);
            declareFunction("arg_isa_ternary_predP", "ARG-ISA-TERNARY-PRED?", 1, 1, false);
            declareFunction("arg_isa_predicateP", "ARG-ISA-PREDICATE?", 1, 1, false);
            declareFunction("arg_genl_binary_predP", "ARG-GENL-BINARY-PRED?", 1, 1, false);
            declareFunction("arg_genl_ternary_predP", "ARG-GENL-TERNARY-PRED?", 1, 1, false);
            declareFunction("arg_genl_predicateP", "ARG-GENL-PREDICATE?", 1, 1, false);
            declareFunction("formula_denoting_functionP", "FORMULA-DENOTING-FUNCTION?", 1, 1, false);
            declareFunction("formula_functorP", "FORMULA-FUNCTOR?", 1, 1, false);
            declareFunction("sentence_denoting_functionP", "SENTENCE-DENOTING-FUNCTION?", 1, 1, false);
            declareFunction("sentence_functorP", "SENTENCE-FUNCTOR?", 1, 1, false);
            declareFunction("argn_type_levelP", "ARGN-TYPE-LEVEL?", 2, 1, false);
            declareFunction("min_genl_preds_admitting_fort_as_arg", "MIN-GENL-PREDS-ADMITTING-FORT-AS-ARG", 3, 1, false);
            declareFunction("forts_admitted_as_arg", "FORTS-ADMITTED-AS-ARG", 3, 3, false);
            declareFunction("min_implicit_types", "MIN-IMPLICIT-TYPES", 1, 1, false);
            declareFunction("term_requires_isa_in_relations", "TERM-REQUIRES-ISA-IN-RELATIONS", 2, 2, false);
            declareFunction("term_requires_genl_in_relations", "TERM-REQUIRES-GENL-IN-RELATIONS", 2, 2, false);
            declareFunction("term_requires_types_in_relations", "TERM-REQUIRES-TYPES-IN-RELATIONS", 2, 2, false);
            declareFunction("term_requires_isa_in_clause", "TERM-REQUIRES-ISA-IN-CLAUSE", 2, 1, false);
            declareFunction("term_requires_isa_in_relation", "TERM-REQUIRES-ISA-IN-RELATION", 2, 1, false);
            declareFunction("term_requires_isa_in_formula", "TERM-REQUIRES-ISA-IN-FORMULA", 2, 2, false);
            declareFunction("term_requires_genl_in_relation", "TERM-REQUIRES-GENL-IN-RELATION", 2, 1, false);
            declareFunction("get_sub_expression_for_term_position", "GET-SUB-EXPRESSION-FOR-TERM-POSITION", 2, 0, false);
            declareFunction("term_position_requires_types_in_relation", "TERM-POSITION-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
            declareFunction("term_requires_types_in_relation", "TERM-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
            declareFunction("arg_requires_isa_in_relation", "ARG-REQUIRES-ISA-IN-RELATION", 2, 1, false);
            declareFunction("pred_arg_isa_requires_other_arg_isa", "PRED-ARG-ISA-REQUIRES-OTHER-ARG-ISA", 3, 1, false);
            declareFunction("make_el_query_literal", "MAKE-EL-QUERY-LITERAL", 1, 0, false);
            declareFunction("arg_isa_applicable_gafs", "ARG-ISA-APPLICABLE-GAFS", 1, 0, false);
            declareFunction("gather_via_map_pred_index", "GATHER-VIA-MAP-PRED-INDEX", 1, 0, false);
            declareFunction("inter_arg_isa_cache_initializedP", "INTER-ARG-ISA-CACHE-INITIALIZED?", 0, 0, false);
            declareFunction("some_inter_arg_isa_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
            declareFunction("some_inter_arg_isa_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
            declareFunction("some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
            declareFunction("some_inter_arg_isa_assertion_somewhere_cache_add", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
            declareFunction("some_inter_arg_isa_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
            declareFunction("clear_some_inter_arg_isa_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
            declareFunction("initialize_some_inter_arg_isa_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
            declareFunction("some_inter_arg_isa_assertion_somewhereP", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
            declareFunction("some_inter_arg_isa_constraint_somewhereP", "SOME-INTER-ARG-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false);
            declareFunction("inter_arg_format_cache_initializedP", "INTER-ARG-FORMAT-CACHE-INITIALIZED?", 0, 0, false);
            declareFunction("some_inter_arg_format_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
            declareFunction("some_inter_arg_format_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
            declareFunction("some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
            declareFunction("some_inter_arg_format_assertion_somewhere_cache_add", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
            declareFunction("some_inter_arg_format_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
            declareFunction("clear_some_inter_arg_format_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
            declareFunction("initialize_some_inter_arg_format_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
            declareFunction("some_inter_arg_format_assertion_somewhereP", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE?", 1, 0, false);
            declareFunction("some_inter_arg_format_constraint_somewhereP", "SOME-INTER-ARG-FORMAT-CONSTRAINT-SOMEWHERE?", 1, 0, false);
            declareFunction("reln_permits_generic_arg_variablesP", "RELN-PERMITS-GENERIC-ARG-VARIABLES?", 2, 0, false);
            declareFunction("reln_permits_keyword_variablesP", "RELN-PERMITS-KEYWORD-VARIABLES?", 2, 0, false);
            declareFunction("reln_constrained_to_be_collectionP", "RELN-CONSTRAINED-TO-BE-COLLECTION?", 3, 0, false);
            declareFunction("constraint_pred_constraint_argnum", "CONSTRAINT-PRED-CONSTRAINT-ARGNUM", 1, 0, false);
            declareFunction("gaf_arg_type_constraint", "GAF-ARG-TYPE-CONSTRAINT", 1, 0, false);
            declareFunction("gather_at_data", "GATHER-AT-DATA", 2, 2, false);
            declareFunction("gather_at_data_assertion", "GATHER-AT-DATA-ASSERTION", 1, 2, false);
            declareFunction("gather_at_constraint", "GATHER-AT-CONSTRAINT", 1, 2, false);
            declareFunction("gather_at_assertion", "GATHER-AT-ASSERTION", 1, 2, false);
            declareFunction("at_finishedP", "AT-FINISHED?", 0, 1, false);
            declareFunction("at_finished", "AT-FINISHED", 0, 1, false);
            declareFunction("at_mapping_finished", "AT-MAPPING-FINISHED", 0, 0, false);
            declareFunction("at_handle_mal_constraint", "AT-HANDLE-MAL-CONSTRAINT", 1, 0, false);
            declareFunction("at_mal_arg_msg", "AT-MAL-ARG-MSG", 1, 0, false);
            declareFunction("predicate_isa_violation_data", "PREDICATE-ISA-VIOLATION-DATA", 1, 1, false);
            declareFunction("meta_predicate_violation_data", "META-PREDICATE-VIOLATION-DATA", 1, 1, false);
            declareFunction("semantic_violations", "SEMANTIC-VIOLATIONS", 0, 0, false);
            declareFunction("note_at_violationP", "NOTE-AT-VIOLATION?", 0, 0, false);
            declareFunction("note_at_violation", "NOTE-AT-VIOLATION", 1, 0, false);
            declareFunction("recursive_violationP", "RECURSIVE-VIOLATION?", 1, 0, false);
            declareFunction("reset_at_violations", "RESET-AT-VIOLATIONS", 0, 1, false);
            declareFunction("reset_arity_violations", "RESET-ARITY-VIOLATIONS", 0, 1, false);
            declareFunction("reset_semantic_violations", "RESET-SEMANTIC-VIOLATIONS", 0, 1, false);
            declareFunction("reset_at_state", "RESET-AT-STATE", 0, 0, false);
            declareFunction("suggest_formula_fix_for_at_violation", "SUGGEST-FORMULA-FIX-FOR-AT-VIOLATION", 2, 0, false);
            declareFunction("assertion_arg_violations_among", "ASSERTION-ARG-VIOLATIONS-AMONG", 1, 0, false);
            declareFunction("sef_violations_among", "SEF-VIOLATIONS-AMONG", 1, 0, false);
            declareFunction("predicate_violations_among", "PREDICATE-VIOLATIONS-AMONG", 1, 0, false);
            declareFunction("assertion_arg_violationP", "ASSERTION-ARG-VIOLATION?", 1, 0, false);
            declareFunction("assertion_collectionP", "ASSERTION-COLLECTION?", 1, 1, false);
            declareFunction("sef_violationP", "SEF-VIOLATION?", 1, 0, false);
            declareFunction("predicate_violationP", "PREDICATE-VIOLATION?", 1, 0, false);
            declareFunction("assertion_arg_violation_fix", "ASSERTION-ARG-VIOLATION-FIX", 1, 0, false);
            declareFunction("strip_mt_literals", "STRIP-MT-LITERALS", 1, 1, false);
            declareFunction("sef_violation_fix", "SEF-VIOLATION-FIX", 1, 0, false);
            declareFunction("predicate_violation_fix", "PREDICATE-VIOLATION-FIX", 1, 0, false);
            declareFunction("violation_type", "VIOLATION-TYPE", 1, 0, false);
            declareFunction("mts_accommodating_formula_wrt_types", "MTS-ACCOMMODATING-FORMULA-WRT-TYPES", 1, 0, false);
            declareFunction("nat_wf_in_some_mtP", "NAT-WF-IN-SOME-MT?", 1, 2, false);
            declareFunction("nat_wf_in_some_mt", "NAT-WF-IN-SOME-MT", 1, 2, false);
            declareFunction("nat_wf_default_mts", "NAT-WF-DEFAULT-MTS", 1, 2, false);
            declareFunction("formula_forts_isa_mts", "FORMULA-FORTS-ISA-MTS", 1, 1, false);
            declareFunction("at_mt_mt_relevantP", "AT-MT-MT-RELEVANT?", 1, 0, false);
            declareFunction("mts_accommodating_nat", "MTS-ACCOMMODATING-NAT", 1, 2, false);
            declareFunction("nat_wf_in_mts", "NAT-WF-IN-MTS", 1, 3, false);
            declareFunction("clear_cached_max_floor_mts_of_nat", "CLEAR-CACHED-MAX-FLOOR-MTS-OF-NAT", 0, 0, false);
            declareFunction("remove_cached_max_floor_mts_of_nat", "REMOVE-CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
            declareFunction("cached_max_floor_mts_of_nat_internal", "CACHED-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 4, 0, false);
            declareFunction("cached_max_floor_mts_of_nat", "CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
            declareFunction("fast_max_floor_mts_of_nat", "FAST-MAX-FLOOR-MTS-OF-NAT", 1, 1, false);
            declareFunction("max_floor_mts_of_nat", "MAX-FLOOR-MTS-OF-NAT", 1, 3, false);
            declareFunction("max_floor_mts_of_naut", "MAX-FLOOR-MTS-OF-NAUT", 4, 0, false);
            declareFunction("max_floor_mts_of_naut_int", "MAX-FLOOR-MTS-OF-NAUT-INT", 3, 0, false);
            declareFunction("admitted_arg_candidate_mt_sets", "ADMITTED-ARG-CANDIDATE-MT-SETS", 3, 1, false);
            declareFunction("result_of_max_floor_mts_of_nat", "RESULT-OF-MAX-FLOOR-MTS-OF-NAT", 2, 1, false);
            declareFunction("max_floor_mts_of_admitted_arg", "MAX-FLOOR-MTS-OF-ADMITTED-ARG", 3, 1, false);
            declareFunction("max_floor_mts_of_nat_benchmark", "MAX-FLOOR-MTS-OF-NAT-BENCHMARK", 1, 0, false);
            declareFunction("get_random_nart_set", "GET-RANDOM-NART-SET", 1, 0, false);
            declareFunction("max_floor_mts_of_admitted_arg_benchmark", "MAX-FLOOR-MTS-OF-ADMITTED-ARG-BENCHMARK", 0, 1, false);
            declareFunction("get_admitted_by_supports", "GET-ADMITTED-BY-SUPPORTS", 0, 0, false);
            declareFunction("nat_formula_arg_wff_mts", "NAT-FORMULA-ARG-WFF-MTS", 1, 0, false);
            declareFunction("nat_function_wff_mts", "NAT-FUNCTION-WFF-MTS", 1, 0, false);
            declareFunction("relation_wff_mts", "RELATION-WFF-MTS", 1, 0, false);
            declareFunction("candidate_mts_wrt", "CANDIDATE-MTS-WRT", 2, 0, false);
            declareFunction("nat_arg_wff_wrt_arg_isa_mts", "NAT-ARG-WFF-WRT-ARG-ISA-MTS", 2, 0, false);
            declareFunction("nat_arg_wff_wrt_arg_genls_mts", "NAT-ARG-WFF-WRT-ARG-GENLS-MTS", 2, 0, false);
            declareFunction("filter_excepted_nat_wff_mts", "FILTER-EXCEPTED-NAT-WFF-MTS", 1, 0, false);
            declareFunction("at_note", "AT-NOTE", 2, 5, false);
            declareFunction("at_error", "AT-ERROR", 2, 5, false);
            declareFunction("at_cerror", "AT-CERROR", 3, 5, false);
            declareFunction("at_warn", "AT-WARN", 2, 5, false);
            declareFunction("min_anects", "MIN-ANECTS", 1, 1, false);
            declareFunction("union_min_anects", "UNION-MIN-ANECTS", 1, 1, false);
            declareFunction("relation_arg_constraint_sentences", "RELATION-ARG-CONSTRAINT-SENTENCES", 2, 1, false);
            declareFunction("variable_arity_relation_arg_constraint_sentences", "VARIABLE-ARITY-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
            declareFunction("all_relation_arg_constraint_sentences", "ALL-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
            declareFunction("all_relation_constraint_sentences", "ALL-RELATION-CONSTRAINT-SENTENCES", 1, 1, false);
            declareFunction("relation_term_arg_constraints", "RELATION-TERM-ARG-CONSTRAINTS", 3, 1, false);
            declareFunction("formula_arg_constraints_cycl", "FORMULA-ARG-CONSTRAINTS-CYCL", 1, 1, false);
            declareFunction("formula_variable_isa_constraint_alist", "FORMULA-VARIABLE-ISA-CONSTRAINT-ALIST", 2, 0, false);
            declareFunction("constraint_sentence_isa_constraints", "CONSTRAINT-SENTENCE-ISA-CONSTRAINTS", 2, 0, false);
            declareFunction("possible_followup_variable_binding_sets", "POSSIBLE-FOLLOWUP-VARIABLE-BINDING-SETS", 2, 1, false);
            declareFunction("variable_binding_set_item_comparator", "VARIABLE-BINDING-SET-ITEM-COMPARATOR", 2, 0, false);
            declareFunction("calc_possible_followup_binding_sets", "CALC-POSSIBLE-FOLLOWUP-BINDING-SETS", 3, 0, false);
            declareFunction("count_followup_bindings", "COUNT-FOLLOWUP-BINDINGS", 1, 0, false);
            declareFunction("similarity_for_variable_binding_set", "SIMILARITY-FOR-VARIABLE-BINDING-SET", 3, 1, false);
            declareFunction("constraint_similarity", "CONSTRAINT-SIMILARITY", 2, 1, false);
            declareFunction("isa_constraint_similarity", "ISA-CONSTRAINT-SIMILARITY", 2, 1, false);
            declareFunction("genls_constraint_similarity", "GENLS-CONSTRAINT-SIMILARITY", 2, 1, false);
            declareFunction("isas_and_genls_similarity", "ISAS-AND-GENLS-SIMILARITY", 5, 0, false);
            declareFunction("more_specific_p", "MORE-SPECIFIC-P", 2, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("subloop_reserved_initialize_generic_arg_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-GENERIC-ARG-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_generic_arg_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-GENERIC-ARG-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("generic_arg_test_case_p", "GENERIC-ARG-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_at_utilities_file_Previous() {
        declareFunction("arg_n_predicate", "ARG-N-PREDICATE", 1, 0, false);
        declareFunction("arg_type_mt", "ARG-TYPE-MT", 4, 0, false);
        declareFunction("find_generic_arg_by_id", "FIND-GENERIC-ARG-BY-ID", 1, 0, false);
        declareFunction("find_generic_arg_id", "FIND-GENERIC-ARG-ID", 1, 0, false);
        declareFunction("store_generic_arg", "STORE-GENERIC-ARG", 2, 0, false);
        declareFunction("stored_generic_arg_p", "STORED-GENERIC-ARG-P", 1, 0, false);
        declareFunction("get_generic_arg", "GET-GENERIC-ARG", 1, 0, false);
        declareFunction("generic_arg_num", "GENERIC-ARG-NUM", 1, 0, false);
        declareFunction("generic_argP", "GENERIC-ARG?", 1, 0, false);
        declareFunction("inter_arg_isa_pred", "INTER-ARG-ISA-PRED", 2, 0, false);
        declareFunction("inter_arg_isa_inverse", "INTER-ARG-ISA-INVERSE", 2, 0, false);
        declareFunction("inter_arg_not_isa_pred", "INTER-ARG-NOT-ISA-PRED", 2, 0, false);
        declareFunction("inter_arg_not_isa_inverse", "INTER-ARG-NOT-ISA-INVERSE", 2, 0, false);
        declareFunction("inter_arg_genl_pred", "INTER-ARG-GENL-PRED", 2, 0, false);
        declareFunction("inter_arg_not_genl_pred", "INTER-ARG-NOT-GENL-PRED", 2, 0, false);
        declareFunction("inter_arg_isa_genl_pred", "INTER-ARG-ISA-GENL-PRED", 2, 0, false);
        declareFunction("inter_arg_genl_isa_pred", "INTER-ARG-GENL-ISA-PRED", 2, 0, false);
        declareFunction("inter_arg_genl_inverse", "INTER-ARG-GENL-INVERSE", 2, 0, false);
        declareFunction("implication_opP", "IMPLICATION-OP?", 1, 0, false);
        declareFunction("logical_opP", "LOGICAL-OP?", 1, 0, false);
        declareFunction("truth_functionP", "TRUTH-FUNCTION?", 1, 0, false);
        declareFunction("initialize_all_arg_type_predicate_caches", "INITIALIZE-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
        declareFunction("clear_all_arg_type_predicate_caches", "CLEAR-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
        declareFunction("arg_isa_binary_predP", "ARG-ISA-BINARY-PRED?", 1, 1, false);
        declareFunction("arg_isa_ternary_predP", "ARG-ISA-TERNARY-PRED?", 1, 1, false);
        declareFunction("arg_isa_predicateP", "ARG-ISA-PREDICATE?", 1, 1, false);
        declareFunction("arg_genl_binary_predP", "ARG-GENL-BINARY-PRED?", 1, 1, false);
        declareFunction("arg_genl_ternary_predP", "ARG-GENL-TERNARY-PRED?", 1, 1, false);
        declareFunction("arg_genl_predicateP", "ARG-GENL-PREDICATE?", 1, 1, false);
        declareFunction("formula_denoting_functionP", "FORMULA-DENOTING-FUNCTION?", 1, 1, false);
        declareFunction("formula_functorP", "FORMULA-FUNCTOR?", 1, 1, false);
        declareFunction("sentence_denoting_functionP", "SENTENCE-DENOTING-FUNCTION?", 1, 1, false);
        declareFunction("sentence_functorP", "SENTENCE-FUNCTOR?", 1, 1, false);
        declareFunction("argn_type_levelP", "ARGN-TYPE-LEVEL?", 2, 1, false);
        declareFunction("min_genl_preds_admitting_fort_as_arg", "MIN-GENL-PREDS-ADMITTING-FORT-AS-ARG", 3, 1, false);
        declareFunction("forts_admitted_as_arg", "FORTS-ADMITTED-AS-ARG", 3, 3, false);
        declareFunction("min_implicit_types", "MIN-IMPLICIT-TYPES", 1, 1, false);
        declareFunction("term_requires_isa_in_relations", "TERM-REQUIRES-ISA-IN-RELATIONS", 2, 2, false);
        declareFunction("term_requires_genl_in_relations", "TERM-REQUIRES-GENL-IN-RELATIONS", 2, 2, false);
        declareFunction("term_requires_types_in_relations", "TERM-REQUIRES-TYPES-IN-RELATIONS", 2, 2, false);
        declareFunction("term_requires_isa_in_clause", "TERM-REQUIRES-ISA-IN-CLAUSE", 2, 1, false);
        declareFunction("term_requires_isa_in_relation", "TERM-REQUIRES-ISA-IN-RELATION", 2, 1, false);
        declareFunction("term_requires_isa_in_formula", "TERM-REQUIRES-ISA-IN-FORMULA", 2, 2, false);
        declareFunction("term_requires_genl_in_relation", "TERM-REQUIRES-GENL-IN-RELATION", 2, 1, false);
        declareFunction("get_sub_expression_for_term_position", "GET-SUB-EXPRESSION-FOR-TERM-POSITION", 2, 0, false);
        declareFunction("term_position_requires_types_in_relation", "TERM-POSITION-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
        declareFunction("term_requires_types_in_relation", "TERM-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
        declareFunction("arg_requires_isa_in_relation", "ARG-REQUIRES-ISA-IN-RELATION", 2, 1, false);
        declareFunction("pred_arg_isa_requires_other_arg_isa", "PRED-ARG-ISA-REQUIRES-OTHER-ARG-ISA", 3, 1, false);
        declareFunction("make_el_query_literal", "MAKE-EL-QUERY-LITERAL", 1, 0, false);
        declareFunction("arg_isa_applicable_gafs", "ARG-ISA-APPLICABLE-GAFS", 1, 0, false);
        declareFunction("gather_via_map_pred_index", "GATHER-VIA-MAP-PRED-INDEX", 1, 0, false);
        declareFunction("inter_arg_isa_cache_initializedP", "INTER-ARG-ISA-CACHE-INITIALIZED?", 0, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhere_cache_add", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
        declareFunction("clear_some_inter_arg_isa_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction("initialize_some_inter_arg_isa_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction("some_inter_arg_isa_assertion_somewhereP", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
        declareFunction("some_inter_arg_isa_constraint_somewhereP", "SOME-INTER-ARG-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction("inter_arg_format_cache_initializedP", "INTER-ARG-FORMAT-CACHE-INITIALIZED?", 0, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhere_cache_add", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
        declareFunction("clear_some_inter_arg_format_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction("initialize_some_inter_arg_format_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction("some_inter_arg_format_assertion_somewhereP", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE?", 1, 0, false);
        declareFunction("some_inter_arg_format_constraint_somewhereP", "SOME-INTER-ARG-FORMAT-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        declareFunction("reln_permits_generic_arg_variablesP", "RELN-PERMITS-GENERIC-ARG-VARIABLES?", 2, 0, false);
        declareFunction("reln_permits_keyword_variablesP", "RELN-PERMITS-KEYWORD-VARIABLES?", 2, 0, false);
        declareFunction("reln_constrained_to_be_collectionP", "RELN-CONSTRAINED-TO-BE-COLLECTION?", 3, 0, false);
        declareFunction("constraint_pred_constraint_argnum", "CONSTRAINT-PRED-CONSTRAINT-ARGNUM", 1, 0, false);
        declareFunction("gaf_arg_type_constraint", "GAF-ARG-TYPE-CONSTRAINT", 1, 0, false);
        declareFunction("gather_at_data", "GATHER-AT-DATA", 2, 2, false);
        declareFunction("gather_at_data_assertion", "GATHER-AT-DATA-ASSERTION", 1, 2, false);
        declareFunction("gather_at_constraint", "GATHER-AT-CONSTRAINT", 1, 2, false);
        declareFunction("gather_at_assertion", "GATHER-AT-ASSERTION", 1, 2, false);
        declareFunction("at_finishedP", "AT-FINISHED?", 0, 1, false);
        declareFunction("at_finished", "AT-FINISHED", 0, 1, false);
        declareFunction("at_mapping_finished", "AT-MAPPING-FINISHED", 0, 0, false);
        declareFunction("at_handle_mal_constraint", "AT-HANDLE-MAL-CONSTRAINT", 1, 0, false);
        declareFunction("at_mal_arg_msg", "AT-MAL-ARG-MSG", 1, 0, false);
        declareFunction("predicate_isa_violation_data", "PREDICATE-ISA-VIOLATION-DATA", 1, 1, false);
        declareFunction("meta_predicate_violation_data", "META-PREDICATE-VIOLATION-DATA", 1, 1, false);
        declareFunction("semantic_violations", "SEMANTIC-VIOLATIONS", 0, 0, false);
        declareFunction("note_at_violationP", "NOTE-AT-VIOLATION?", 0, 0, false);
        declareFunction("note_at_violation", "NOTE-AT-VIOLATION", 1, 0, false);
        declareFunction("recursive_violationP", "RECURSIVE-VIOLATION?", 1, 0, false);
        declareFunction("reset_at_violations", "RESET-AT-VIOLATIONS", 0, 1, false);
        declareFunction("reset_arity_violations", "RESET-ARITY-VIOLATIONS", 0, 1, false);
        declareFunction("reset_semantic_violations", "RESET-SEMANTIC-VIOLATIONS", 0, 1, false);
        declareFunction("reset_at_state", "RESET-AT-STATE", 0, 0, false);
        declareFunction("suggest_formula_fix_for_at_violation", "SUGGEST-FORMULA-FIX-FOR-AT-VIOLATION", 2, 0, false);
        declareFunction("assertion_arg_violations_among", "ASSERTION-ARG-VIOLATIONS-AMONG", 1, 0, false);
        declareFunction("sef_violations_among", "SEF-VIOLATIONS-AMONG", 1, 0, false);
        declareFunction("predicate_violations_among", "PREDICATE-VIOLATIONS-AMONG", 1, 0, false);
        declareFunction("assertion_arg_violationP", "ASSERTION-ARG-VIOLATION?", 1, 0, false);
        declareFunction("assertion_collectionP", "ASSERTION-COLLECTION?", 1, 1, false);
        declareFunction("sef_violationP", "SEF-VIOLATION?", 1, 0, false);
        declareFunction("predicate_violationP", "PREDICATE-VIOLATION?", 1, 0, false);
        declareFunction("assertion_arg_violation_fix", "ASSERTION-ARG-VIOLATION-FIX", 1, 0, false);
        declareFunction("strip_mt_literals", "STRIP-MT-LITERALS", 1, 1, false);
        declareFunction("sef_violation_fix", "SEF-VIOLATION-FIX", 1, 0, false);
        declareFunction("predicate_violation_fix", "PREDICATE-VIOLATION-FIX", 1, 0, false);
        declareFunction("violation_type", "VIOLATION-TYPE", 1, 0, false);
        declareFunction("mts_accommodating_formula_wrt_types", "MTS-ACCOMMODATING-FORMULA-WRT-TYPES", 1, 0, false);
        declareFunction("nat_wf_in_some_mtP", "NAT-WF-IN-SOME-MT?", 1, 2, false);
        declareFunction("nat_wf_in_some_mt", "NAT-WF-IN-SOME-MT", 1, 2, false);
        declareFunction("nat_wf_default_mts", "NAT-WF-DEFAULT-MTS", 1, 2, false);
        declareFunction("formula_forts_isa_mts", "FORMULA-FORTS-ISA-MTS", 1, 1, false);
        declareFunction("at_mt_mt_relevantP", "AT-MT-MT-RELEVANT?", 1, 0, false);
        declareFunction("mts_accommodating_nat", "MTS-ACCOMMODATING-NAT", 1, 2, false);
        declareFunction("nat_wf_in_mts", "NAT-WF-IN-MTS", 1, 3, false);
        declareFunction("clear_cached_max_floor_mts_of_nat", "CLEAR-CACHED-MAX-FLOOR-MTS-OF-NAT", 0, 0, false);
        declareFunction("remove_cached_max_floor_mts_of_nat", "REMOVE-CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
        declareFunction("cached_max_floor_mts_of_nat_internal", "CACHED-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 4, 0, false);
        declareFunction("cached_max_floor_mts_of_nat", "CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
        declareFunction("fast_max_floor_mts_of_nat", "FAST-MAX-FLOOR-MTS-OF-NAT", 1, 1, false);
        declareFunction("max_floor_mts_of_nat", "MAX-FLOOR-MTS-OF-NAT", 1, 3, false);
        declareFunction("max_floor_mts_of_naut", "MAX-FLOOR-MTS-OF-NAUT", 4, 0, false);
        declareFunction("max_floor_mts_of_naut_int", "MAX-FLOOR-MTS-OF-NAUT-INT", 3, 0, false);
        declareFunction("admitted_arg_candidate_mt_sets", "ADMITTED-ARG-CANDIDATE-MT-SETS", 3, 1, false);
        declareFunction("result_of_max_floor_mts_of_nat", "RESULT-OF-MAX-FLOOR-MTS-OF-NAT", 2, 1, false);
        declareFunction("max_floor_mts_of_admitted_arg", "MAX-FLOOR-MTS-OF-ADMITTED-ARG", 3, 1, false);
        declareFunction("max_floor_mts_of_nat_benchmark", "MAX-FLOOR-MTS-OF-NAT-BENCHMARK", 1, 0, false);
        declareFunction("get_random_nart_set", "GET-RANDOM-NART-SET", 1, 0, false);
        declareFunction("max_floor_mts_of_admitted_arg_benchmark", "MAX-FLOOR-MTS-OF-ADMITTED-ARG-BENCHMARK", 0, 1, false);
        declareFunction("get_admitted_by_supports", "GET-ADMITTED-BY-SUPPORTS", 0, 0, false);
        declareFunction("nat_formula_arg_wff_mts", "NAT-FORMULA-ARG-WFF-MTS", 1, 0, false);
        declareFunction("nat_function_wff_mts", "NAT-FUNCTION-WFF-MTS", 1, 0, false);
        declareFunction("relation_wff_mts", "RELATION-WFF-MTS", 1, 0, false);
        declareFunction("candidate_mts_wrt", "CANDIDATE-MTS-WRT", 2, 0, false);
        declareFunction("nat_arg_wff_wrt_arg_isa_mts", "NAT-ARG-WFF-WRT-ARG-ISA-MTS", 2, 0, false);
        declareFunction("nat_arg_wff_wrt_arg_genls_mts", "NAT-ARG-WFF-WRT-ARG-GENLS-MTS", 2, 0, false);
        declareFunction("filter_excepted_nat_wff_mts", "FILTER-EXCEPTED-NAT-WFF-MTS", 1, 0, false);
        declareFunction("at_note", "AT-NOTE", 2, 5, false);
        declareFunction("at_error", "AT-ERROR", 2, 5, false);
        declareFunction("at_cerror", "AT-CERROR", 3, 5, false);
        declareFunction("at_warn", "AT-WARN", 2, 5, false);
        declareFunction("min_anects", "MIN-ANECTS", 1, 1, false);
        declareFunction("union_min_anects", "UNION-MIN-ANECTS", 1, 1, false);
        declareFunction("relation_arg_constraint_sentences", "RELATION-ARG-CONSTRAINT-SENTENCES", 2, 1, false);
        declareFunction("variable_arity_relation_arg_constraint_sentences", "VARIABLE-ARITY-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
        declareFunction("all_relation_arg_constraint_sentences", "ALL-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
        declareFunction("all_relation_constraint_sentences", "ALL-RELATION-CONSTRAINT-SENTENCES", 1, 1, false);
        declareFunction("relation_term_arg_constraints", "RELATION-TERM-ARG-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_arg_constraints_cycl", "FORMULA-ARG-CONSTRAINTS-CYCL", 1, 1, false);
        declareFunction("formula_variable_isa_constraint_alist", "FORMULA-VARIABLE-ISA-CONSTRAINT-ALIST", 2, 0, false);
        declareFunction("constraint_sentence_isa_constraints", "CONSTRAINT-SENTENCE-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("possible_followup_variable_binding_sets", "POSSIBLE-FOLLOWUP-VARIABLE-BINDING-SETS", 2, 1, false);
        declareFunction("variable_binding_set_item_comparator", "VARIABLE-BINDING-SET-ITEM-COMPARATOR", 2, 0, false);
        declareFunction("calc_possible_followup_binding_sets", "CALC-POSSIBLE-FOLLOWUP-BINDING-SETS", 3, 0, false);
        declareFunction("count_followup_bindings", "COUNT-FOLLOWUP-BINDINGS", 1, 0, false);
        declareFunction("similarity_for_variable_binding_set", "SIMILARITY-FOR-VARIABLE-BINDING-SET", 3, 1, false);
        declareFunction("constraint_similarity", "CONSTRAINT-SIMILARITY", 2, 1, false);
        declareFunction("isa_constraint_similarity", "ISA-CONSTRAINT-SIMILARITY", 2, 1, false);
        declareFunction("genls_constraint_similarity", "GENLS-CONSTRAINT-SIMILARITY", 2, 1, false);
        declareFunction("isas_and_genls_similarity", "ISAS-AND-GENLS-SIMILARITY", 5, 0, false);
        declareFunction("more_specific_p", "MORE-SPECIFIC-P", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_at_utilities_file_alt() {
        deflexical("*GENERIC-ARG-STORE*", NIL != boundp($generic_arg_store$) ? ((SubLObject) ($generic_arg_store$.getGlobalValue())) : NIL);
        deflexical("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*", NIL != boundp($some_inter_arg_isa_assertion_somewhere_cache$) ? ((SubLObject) ($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue())) : NIL);
        deflexical("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*", NIL != boundp($some_inter_arg_format_assertion_somewhere_cache$) ? ((SubLObject) ($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue())) : NIL);
        defparameter("*MTS-CUTOFF-FOR-MTS-ACCOMMODATING-FORMULA-WRT-TYPES*", $int$40);
        defparameter("*MAX-FLOOR-MTS-OF-NAT-EXCEPTIONS*", NIL);
        deflexical("*CACHED-MAX-FLOOR-MTS-OF-NAT-CACHING-STATE*", NIL);
        defparameter("*MAX-FLOOR-MTS-OF-NAT-RECURSION?*", NIL);
        return NIL;
    }

    public static SubLObject init_at_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*GENERIC-ARG-STORE*", SubLTrampolineFile.maybeDefault($generic_arg_store$, $generic_arg_store$, NIL));
            deflexical("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*", SubLTrampolineFile.maybeDefault($some_inter_arg_isa_assertion_somewhere_cache$, $some_inter_arg_isa_assertion_somewhere_cache$, NIL));
            deflexical("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*", SubLTrampolineFile.maybeDefault($some_inter_arg_format_assertion_somewhere_cache$, $some_inter_arg_format_assertion_somewhere_cache$, NIL));
            defparameter("*MTS-CUTOFF-FOR-MTS-ACCOMMODATING-FORMULA-WRT-TYPES*", $int$40);
            defparameter("*MAX-FLOOR-MTS-OF-NAT-EXCEPTIONS*", NIL);
            deflexical("*CACHED-MAX-FLOOR-MTS-OF-NAT-CACHING-STATE*", NIL);
            defparameter("*MAX-FLOOR-MTS-OF-NAT-RECURSION?*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*GENERIC-ARG-STORE*", NIL != boundp($generic_arg_store$) ? ((SubLObject) ($generic_arg_store$.getGlobalValue())) : NIL);
            deflexical("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*", NIL != boundp($some_inter_arg_isa_assertion_somewhere_cache$) ? ((SubLObject) ($some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue())) : NIL);
            deflexical("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*", NIL != boundp($some_inter_arg_format_assertion_somewhere_cache$) ? ((SubLObject) ($some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_at_utilities_file_Previous() {
        deflexical("*GENERIC-ARG-STORE*", SubLTrampolineFile.maybeDefault($generic_arg_store$, $generic_arg_store$, NIL));
        deflexical("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*", SubLTrampolineFile.maybeDefault($some_inter_arg_isa_assertion_somewhere_cache$, $some_inter_arg_isa_assertion_somewhere_cache$, NIL));
        deflexical("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*", SubLTrampolineFile.maybeDefault($some_inter_arg_format_assertion_somewhere_cache$, $some_inter_arg_format_assertion_somewhere_cache$, NIL));
        defparameter("*MTS-CUTOFF-FOR-MTS-ACCOMMODATING-FORMULA-WRT-TYPES*", $int$40);
        defparameter("*MAX-FLOOR-MTS-OF-NAT-EXCEPTIONS*", NIL);
        deflexical("*CACHED-MAX-FLOOR-MTS-OF-NAT-CACHING-STATE*", NIL);
        defparameter("*MAX-FLOOR-MTS-OF-NAT-RECURSION?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_at_utilities_file_alt() {
        declare_defglobal($generic_arg_store$);
        declare_defglobal($some_inter_arg_isa_assertion_somewhere_cache$);
        declare_defglobal($some_inter_arg_format_assertion_somewhere_cache$);
        memoization_state.note_globally_cached_function(CACHED_MAX_FLOOR_MTS_OF_NAT);
        define_test_case_table_int(ALL_RELATION_CONSTRAINT_SENTENCES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt163);
        define_test_case_table_int(ALL_RELATION_ARG_CONSTRAINT_SENTENCES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt166);
        define_test_case_table_int(FORMULA_ARG_CONSTRAINTS_CYCL, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt168);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(GENERIC_ARG_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(GENERIC_ARG_TEST_CASE);
        classes.subloop_new_class(GENERIC_ARG_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt171);
        classes.class_set_implements_slot_listeners(GENERIC_ARG_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(GENERIC_ARG_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_GENERIC_ARG_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(GENERIC_ARG_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_GENERIC_ARG_TEST_CASE_INSTANCE);
        com.cyc.cycjava.cycl.at_utilities.subloop_reserved_initialize_generic_arg_test_case_class(GENERIC_ARG_TEST_CASE);
        sunit_macros.define_test_case_postamble(GENERIC_ARG_TEST_CASE, $str_alt186$at_utilities, $$$cycl, NIL);
        sunit_macros.def_test_method_register(GENERIC_ARG_TEST_CASE, TEST_GENERIC_ARG_NUM);
        sunit_macros.def_test_method_register(GENERIC_ARG_TEST_CASE, TEST_GENERIC_ARG_RECOGNITION);
        sunit_macros.def_test_method_register(GENERIC_ARG_TEST_CASE, TEST_GENERIC_ARG_CREATION);
        sunit_external.define_test_suite($str_alt191$Arg_Type_Utilities_Test_Suite, NIL, NIL, $list_alt192);
        return NIL;
    }

    public static SubLObject setup_at_utilities_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($generic_arg_store$);
            declare_defglobal($some_inter_arg_isa_assertion_somewhere_cache$);
            declare_defglobal($some_inter_arg_format_assertion_somewhere_cache$);
            memoization_state.note_globally_cached_function(CACHED_MAX_FLOOR_MTS_OF_NAT);
            define_test_case_table_int(ALL_RELATION_CONSTRAINT_SENTENCES, list($TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T), $list182);
            define_test_case_table_int(ALL_RELATION_ARG_CONSTRAINT_SENTENCES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list185);
            define_test_case_table_int(FORMULA_ARG_CONSTRAINTS_CYCL, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list187);
            sunit_external.define_test_suite($str188$Arg_Type_Utilities_Test_Suite, NIL, NIL, $list189);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(ALL_RELATION_CONSTRAINT_SENTENCES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt163);
            define_test_case_table_int(ALL_RELATION_ARG_CONSTRAINT_SENTENCES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt166);
            define_test_case_table_int(FORMULA_ARG_CONSTRAINTS_CYCL, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt168);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(GENERIC_ARG_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(GENERIC_ARG_TEST_CASE);
            classes.subloop_new_class(GENERIC_ARG_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt171);
            classes.class_set_implements_slot_listeners(GENERIC_ARG_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(GENERIC_ARG_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_GENERIC_ARG_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(GENERIC_ARG_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_GENERIC_ARG_TEST_CASE_INSTANCE);
            com.cyc.cycjava.cycl.at_utilities.subloop_reserved_initialize_generic_arg_test_case_class(GENERIC_ARG_TEST_CASE);
            sunit_macros.define_test_case_postamble(GENERIC_ARG_TEST_CASE, $str_alt186$at_utilities, $$$cycl, NIL);
            sunit_macros.def_test_method_register(GENERIC_ARG_TEST_CASE, TEST_GENERIC_ARG_NUM);
            sunit_macros.def_test_method_register(GENERIC_ARG_TEST_CASE, TEST_GENERIC_ARG_RECOGNITION);
            sunit_macros.def_test_method_register(GENERIC_ARG_TEST_CASE, TEST_GENERIC_ARG_CREATION);
            sunit_external.define_test_suite($str_alt191$Arg_Type_Utilities_Test_Suite, NIL, NIL, $list_alt192);
        }
        return NIL;
    }

    public static SubLObject setup_at_utilities_file_Previous() {
        declare_defglobal($generic_arg_store$);
        declare_defglobal($some_inter_arg_isa_assertion_somewhere_cache$);
        declare_defglobal($some_inter_arg_format_assertion_somewhere_cache$);
        memoization_state.note_globally_cached_function(CACHED_MAX_FLOOR_MTS_OF_NAT);
        define_test_case_table_int(ALL_RELATION_CONSTRAINT_SENTENCES, list($TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T), $list182);
        define_test_case_table_int(ALL_RELATION_ARG_CONSTRAINT_SENTENCES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list185);
        define_test_case_table_int(FORMULA_ARG_CONSTRAINTS_CYCL, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list187);
        sunit_external.define_test_suite($str188$Arg_Type_Utilities_Test_Suite, NIL, NIL, $list189);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_at_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_at_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_at_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt7$_S = makeString("~S");

    static private final SubLString $str_alt12$invalid_arg_isa_pred_index___s__s = makeString("invalid arg-isa-pred index: ~s-~s");

    static private final SubLList $list_alt29 = list(ONE_INTEGER, TWO_INTEGER);

    static private final SubLString $str_alt31$invalid_arg_not_isa_pred_index___ = makeString("invalid arg-not-isa-pred index: ~s-~s");

    public static final SubLObject $$interArgNotIsa2_1 = reader_make_constant_shell("interArgNotIsa2-1");

    static private final SubLString $str_alt34$invalid_arg_genl_pred_index___s__ = makeString("invalid arg-genl-pred index: ~s-~s");

    static private final SubLString $str_alt37$Initializing_all_arg_type_predica = makeString("Initializing all arg type predicate caches...");

    static private final SubLSymbol $sym52$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");

    static private final SubLString $str_alt61$Initializing___interArgIsa_cache = makeString("Initializing #$interArgIsa cache");

    static private final SubLString $str_alt69$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt74$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt75$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt76$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $str_alt78$Initializing___interArgFormat_cac = makeString("Initializing #$interArgFormat cache");

    static private final SubLString $str_alt81$got_an_arg_type_predicate___s__th = makeString("got an arg-type predicate (~s) that's neither binary nor ternary in ~s");

    static private final SubLString $str_alt87$__at_test_fails___s_fails__s_cons = makeString("~%at test fails: ~s fails ~s constraint ~s");

    static private final SubLString $str_alt88$__at_test_fails___s_fails__s_cons = makeString("~%at test fails: ~s fails ~s constraint ~s for arg ~s of reln ~s");

    static private final SubLString $str_alt95$illegal_value_of__at_mode____s = makeString("illegal value of *at-mode*: ~s");

    static private final SubLSymbol $sym102$ASSERTION_ARG_VIOLATION_ = makeSymbol("ASSERTION-ARG-VIOLATION?");

    static private final SubLSymbol $sym103$SEF_VIOLATION_ = makeSymbol("SEF-VIOLATION?");

    static private final SubLSymbol $sym104$PREDICATE_VIOLATION_ = makeSymbol("PREDICATE-VIOLATION?");

    static private final SubLList $list_alt106 = listS(makeSymbol("ARG"), new SubLObject[]{ makeSymbol("RELN"), makeSymbol("ARGNUM"), makeSymbol("COL"), makeSymbol("DEFN"), makeSymbol("MT"), makeSymbol("DATA") });

    static private final SubLList $list_alt113 = list(makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA"));

    static private final SubLList $list_alt116 = list(new SubLObject[]{ makeSymbol("ARG"), makeSymbol("REL"), makeSymbol("POS"), makeSymbol("FORMAT"), makeSymbol("IND-ARG-ISA"), makeSymbol("IND-POS"), makeSymbol("IND-ARG"), makeSymbol("MT"), makeSymbol("VIOLATIONS"), makeSymbol("&OPTIONAL"), makeSymbol("VIA") });

    static private final SubLList $list_alt117 = list(makeSymbol("PREDICATE"), makeSymbol("ISA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("VIOLATIONS"));

    static private final SubLSymbol $sym121$_ = makeSymbol(">");

    public static final SubLSymbol $kw126$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt131$___S_____S_____s__ = makeString("~&~S~%  ~S~%  ~s~%");

    public static final SubLObject $const139$AtemporalNecessarilyEssentialColl = reader_make_constant_shell("AtemporalNecessarilyEssentialCollectionType");

    static private final SubLList $list_alt149 = list(reader_make_constant_shell("Relation"));

    static private final SubLSymbol $sym150$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt163 = list(list(list(reader_make_constant_shell("isa")), list(list(reader_make_constant_shell("arity"), reader_make_constant_shell("isa"), TWO_INTEGER), list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("isa"), ONE_INTEGER, reader_make_constant_shell("Thing")), list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("isa"), TWO_INTEGER, reader_make_constant_shell("Collection")), list(reader_make_constant_shell("argGenl"), reader_make_constant_shell("isa"), TWO_INTEGER, reader_make_constant_shell("Thing")))), list(list(reader_make_constant_shell("PlusFn")), list(list(reader_make_constant_shell("arityMin"), reader_make_constant_shell("PlusFn"), ONE_INTEGER), list(reader_make_constant_shell("argsIsa"), reader_make_constant_shell("PlusFn"), reader_make_constant_shell("ScalarInterval")))), list(list(reader_make_constant_shell("GramsPerLiter")), list(list(reader_make_constant_shell("arityMin"), reader_make_constant_shell("GramsPerLiter"), ONE_INTEGER), list(reader_make_constant_shell("arityMax"), reader_make_constant_shell("GramsPerLiter"), TWO_INTEGER), list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("GramsPerLiter"), ONE_INTEGER, reader_make_constant_shell("NumericInterval")), list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("GramsPerLiter"), TWO_INTEGER, reader_make_constant_shell("NumericInterval")))));

    static private final SubLList $list_alt166 = list(list(list(reader_make_constant_shell("isa")), list(list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("isa"), ONE_INTEGER, reader_make_constant_shell("Thing")), list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("isa"), TWO_INTEGER, reader_make_constant_shell("Collection")), list(reader_make_constant_shell("argGenl"), reader_make_constant_shell("isa"), TWO_INTEGER, reader_make_constant_shell("Thing")))));

    static private final SubLList $list_alt168 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), makeSymbol("?X"))), list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("genls"), makeSymbol("?X"), reader_make_constant_shell("Thing")))));

    private static final SubLSymbol GENERIC_ARG_TEST_CASE = makeSymbol("GENERIC-ARG-TEST-CASE");

    static private final SubLList $list_alt171 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-GENERIC-ARG-CREATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-GENERIC-ARG-RECOGNITION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-GENERIC-ARG-NUM"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GENERIC_ARG_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GENERIC-ARG-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GENERIC_ARG_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GENERIC-ARG-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt186$at_utilities = makeString("at-utilities");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol TEST_GENERIC_ARG_NUM = makeSymbol("TEST-GENERIC-ARG-NUM");

    private static final SubLSymbol TEST_GENERIC_ARG_RECOGNITION = makeSymbol("TEST-GENERIC-ARG-RECOGNITION");

    private static final SubLSymbol TEST_GENERIC_ARG_CREATION = makeSymbol("TEST-GENERIC-ARG-CREATION");

    static private final SubLString $str_alt191$Arg_Type_Utilities_Test_Suite = makeString("Arg-Type Utilities Test Suite");

    static private final SubLList $list_alt192 = list(makeSymbol("GENERIC-ARG-TEST-CASE"));
}

/**
 * Total time: 2381 ms
 */
