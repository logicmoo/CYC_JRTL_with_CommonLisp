/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.clone_intermediate_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.convert_final_simple_index_to_sharded_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.do_intermediate_index_valid_index_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.final_index_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.final_sharded_index_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.final_sharded_index_to_fvector_backed_sharded_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.final_topn_index_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.final_unified_index_is_shardableP;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.final_unified_index_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_unrepresented_term_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.intermediate_index_dictionary;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.intermediate_index_lookup;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.intermediate_index_map;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.intermediate_index_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.intermediate_index_replace_map;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.intermediate_index_set;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.reorganize_modified_final_sharded_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.reshard_final_sharded_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.segregate_index_changes_and_pristines;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.simple_index_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.term_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.update_fvector_backed_final_sharded_index;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_elapsed_time_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_elapsed_time_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INDEXING-UTILITIES
 * source file: /cyc/top/cycl/indexing-utilities.lisp
 * created:     2019/07/03 17:37:25
 */
public final class indexing_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject visit_final_index_sets_int(SubLObject index, SubLObject visit_fn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == simple_index_p(index)) {
                if (NIL != final_index_p(index)) {
                    funcall(visit_fn, index);
                } else {
                    {
                        SubLObject index_1 = index;
                        if (NIL != do_intermediate_index_valid_index_p(index_1)) {
                            {
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(intermediate_index_dictionary(index_1)));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        SubLObject sub_index = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        com.cyc.cycjava.cycl.indexing_utilities.visit_final_index_sets_int(sub_index, visit_fn);
                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                }
            }
            return index;
        }
    }

    // Definitions
    /**
     * Invoke VISIT-FN on every final index set of term.
     *
     * @unknown rewrite with path as hierarchical visitor
     */
    @LispMethod(comment = "Invoke VISIT-FN on every final index set of term.\r\n\r\n@unknown rewrite with path as hierarchical visitor")
    public static final SubLObject visit_final_index_sets(SubLObject v_term, SubLObject visit_fn) {
        SubLTrampolineFile.checkType(v_term, INDEXED_TERM_P);
        return com.cyc.cycjava.cycl.indexing_utilities.visit_final_index_sets_int(term_index(v_term), visit_fn);
    }

    public static final SubLObject final_index_metrics_compilation_fn(SubLObject v_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject map = $curr_visited_index_metrics$.getDynamicValue(thread);
                map_utilities.map_increment(map, set.set_size(v_set), UNPROVIDED);
            }
            return v_set;
        }
    }

    /**
     * Compile final index metrics about the term, and record them in map.
     * If map is not provided, allocate a new DICTIONARY-P with EQL.
     *
     * @return map
     */
    @LispMethod(comment = "Compile final index metrics about the term, and record them in map.\r\nIf map is not provided, allocate a new DICTIONARY-P with EQL.\r\n\r\n@return map\nCompile final index metrics about the term, and record them in map.\nIf map is not provided, allocate a new DICTIONARY-P with EQL.")
    public static final SubLObject compile_final_index_metrics(SubLObject v_term, SubLObject map) {
        if (map == UNPROVIDED) {
            map = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == map_utilities.map_p(map)) {
                map = dictionary.new_dictionary(EQL, UNPROVIDED);
            }
            {
                SubLObject _prev_bind_0 = $curr_visited_index_metrics$.currentBinding(thread);
                try {
                    $curr_visited_index_metrics$.bind(map, thread);
                    com.cyc.cycjava.cycl.indexing_utilities.visit_final_index_sets(v_term, FINAL_INDEX_METRICS_COMPILATION_FN);
                } finally {
                    $curr_visited_index_metrics$.rebind(_prev_bind_0, thread);
                }
            }
            return map;
        }
    }

    /**
     * Helper method for the summation of index set information.
     */
    // defparameter
    @LispMethod(comment = "Helper method for the summation of index set information.\ndefparameter")
    private static final SubLSymbol $curr_visited_index_metrics$ = makeSymbol("*CURR-VISITED-INDEX-METRICS*");

    public static final SubLFile me = new indexing_utilities();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $term_being_removed$ = makeSymbol("*TERM-BEING-REMOVED*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_complex_index_visitor$ = makeSymbol("*DTP-COMPLEX-INDEX-VISITOR*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $swap_out_intermediate_index_levelsP$ = makeSymbol("*SWAP-OUT-INTERMEDIATE-INDEX-LEVELS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $precache_term_set$ = makeSymbol("*PRECACHE-TERM-SET*");



    private static final SubLList $list3 = list(reader_make_constant_shell("forwardNonTriggerLiteral"), reader_make_constant_shell("forwardTriggerLiteral"));

    private static final SubLSymbol $sym9$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $sym10$GAF_REMOVE_BEFORE_ = makeSymbol("GAF-REMOVE-BEFORE?");







    private static final SubLSymbol COMPLEX_INDEX_VISITOR = makeSymbol("COMPLEX-INDEX-VISITOR");

    private static final SubLSymbol COMPLEX_INDEX_VISITOR_P = makeSymbol("COMPLEX-INDEX-VISITOR-P");

    private static final SubLList $list16 = list(makeSymbol("BEGIN-SUBINDEX-FN"), makeSymbol("END-SUBINDEX-FN"), makeSymbol("NOTE-FINAL-INDEX-FN"), makeSymbol("BEGIN-VISIT-FN"), makeSymbol("END-VISIT-FN"), makeSymbol("PARAM"));

    private static final SubLList $list17 = list(makeKeyword("BEGIN-SUBINDEX-FN"), makeKeyword("END-SUBINDEX-FN"), makeKeyword("NOTE-FINAL-INDEX-FN"), makeKeyword("BEGIN-VISIT-FN"), makeKeyword("END-VISIT-FN"), makeKeyword("PARAM"));

    private static final SubLList $list18 = list(makeSymbol("COMPINX-VISIT-BEGIN-SUBINDEX-FN"), makeSymbol("COMPINX-VISIT-END-SUBINDEX-FN"), makeSymbol("COMPINX-VISIT-NOTE-FINAL-INDEX-FN"), makeSymbol("COMPINX-VISIT-BEGIN-VISIT-FN"), makeSymbol("COMPINX-VISIT-END-VISIT-FN"), makeSymbol("COMPINX-VISIT-PARAM"));

    private static final SubLList $list19 = list(makeSymbol("_CSETF-COMPINX-VISIT-BEGIN-SUBINDEX-FN"), makeSymbol("_CSETF-COMPINX-VISIT-END-SUBINDEX-FN"), makeSymbol("_CSETF-COMPINX-VISIT-NOTE-FINAL-INDEX-FN"), makeSymbol("_CSETF-COMPINX-VISIT-BEGIN-VISIT-FN"), makeSymbol("_CSETF-COMPINX-VISIT-END-VISIT-FN"), makeSymbol("_CSETF-COMPINX-VISIT-PARAM"));

    private static final SubLSymbol PRINT_COMPLEX_INDEX_VISITOR = makeSymbol("PRINT-COMPLEX-INDEX-VISITOR");

    private static final SubLSymbol COMPLEX_INDEX_VISITOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("COMPLEX-INDEX-VISITOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list22 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("COMPLEX-INDEX-VISITOR-P"));

    private static final SubLSymbol COMPINX_VISIT_BEGIN_SUBINDEX_FN = makeSymbol("COMPINX-VISIT-BEGIN-SUBINDEX-FN");

    private static final SubLSymbol _CSETF_COMPINX_VISIT_BEGIN_SUBINDEX_FN = makeSymbol("_CSETF-COMPINX-VISIT-BEGIN-SUBINDEX-FN");

    private static final SubLSymbol COMPINX_VISIT_END_SUBINDEX_FN = makeSymbol("COMPINX-VISIT-END-SUBINDEX-FN");

    private static final SubLSymbol _CSETF_COMPINX_VISIT_END_SUBINDEX_FN = makeSymbol("_CSETF-COMPINX-VISIT-END-SUBINDEX-FN");

    private static final SubLSymbol COMPINX_VISIT_NOTE_FINAL_INDEX_FN = makeSymbol("COMPINX-VISIT-NOTE-FINAL-INDEX-FN");

    private static final SubLSymbol FINAL_INDEX_METRICS_COMPILATION_FN = makeSymbol("FINAL-INDEX-METRICS-COMPILATION-FN");

    private static final SubLSymbol _CSETF_COMPINX_VISIT_NOTE_FINAL_INDEX_FN = makeSymbol("_CSETF-COMPINX-VISIT-NOTE-FINAL-INDEX-FN");

    private static final SubLSymbol COMPINX_VISIT_BEGIN_VISIT_FN = makeSymbol("COMPINX-VISIT-BEGIN-VISIT-FN");

    private static final SubLSymbol _CSETF_COMPINX_VISIT_BEGIN_VISIT_FN = makeSymbol("_CSETF-COMPINX-VISIT-BEGIN-VISIT-FN");

    private static final SubLSymbol COMPINX_VISIT_END_VISIT_FN = makeSymbol("COMPINX-VISIT-END-VISIT-FN");

    private static final SubLSymbol _CSETF_COMPINX_VISIT_END_VISIT_FN = makeSymbol("_CSETF-COMPINX-VISIT-END-VISIT-FN");

    private static final SubLSymbol COMPINX_VISIT_PARAM = makeSymbol("COMPINX-VISIT-PARAM");

    private static final SubLSymbol _CSETF_COMPINX_VISIT_PARAM = makeSymbol("_CSETF-COMPINX-VISIT-PARAM");

    private static final SubLSymbol $BEGIN_SUBINDEX_FN = makeKeyword("BEGIN-SUBINDEX-FN");

    private static final SubLSymbol $END_SUBINDEX_FN = makeKeyword("END-SUBINDEX-FN");

    private static final SubLSymbol $NOTE_FINAL_INDEX_FN = makeKeyword("NOTE-FINAL-INDEX-FN");

    private static final SubLSymbol $BEGIN_VISIT_FN = makeKeyword("BEGIN-VISIT-FN");

    private static final SubLSymbol $END_VISIT_FN = makeKeyword("END-VISIT-FN");

    private static final SubLString $str41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_COMPLEX_INDEX_VISITOR = makeSymbol("MAKE-COMPLEX-INDEX-VISITOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_COMPLEX_INDEX_VISITOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-COMPLEX-INDEX-VISITOR-METHOD");

    private static final SubLString $str47$__CompInxVisit__ = makeString(" (CompInxVisit: ");

    private static final SubLString $str48$__SubIndex__ = makeString(" (SubIndex: ");

    private static final SubLString $str49$_FinalIndex__ = makeString(" FinalIndex: ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str51$__ = makeString(") ");

    private static final SubLString $str52$__Param__ = makeString(") Param: ");

    private static final SubLList $list54 = list(makeSymbol("I-KEY"), makeSymbol("I-INDEX"));

    private static final SubLString $str55$Illegal_state_exception__Index_co = makeString("Illegal state exception: Index contains object ~A under ~A, which is neither a FINAL nor an INTERMEDIATE index.");

    private static final SubLSymbol DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_VISIT = makeSymbol("DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-VISIT");

    private static final SubLSymbol DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_SUBINDEX = makeSymbol("DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-SUBINDEX");

    private static final SubLSymbol DUMP_SWAPPABLE_KB_INDEX_VISITOR_NOTE_FINAL_INDEX = makeSymbol("DUMP-SWAPPABLE-KB-INDEX-VISITOR-NOTE-FINAL-INDEX");

    private static final SubLSymbol DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_SUBINDEX = makeSymbol("DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-SUBINDEX");

    private static final SubLSymbol DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_VISIT = makeSymbol("DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-VISIT");

    private static final SubLString $str63$The_swappable_KB_index_visitor_is = makeString("The swappable KB index visitor is not properly setup; initial context ~S is bogus.");

    private static final SubLString $str71$The_swappable_KB_index_visitor_di = makeString("The swappable KB index visitor did not complete properly; final context ~S is bogus.");

    private static final SubLString $str72$Invalid_state_transition__the_ind = makeString("Invalid state transition--the index dump style is neither changed nor entire???");

    private static final SubLString $str74$Failed_to_sanity_check_key__A_s_s = makeString("Failed to sanity check key ~A's sub-index ~A against recreated ~A.~%");

    private static final SubLString $str75$Conversion_error__newly_created_m = makeString("Conversion error--newly created maps should not be backed already.");

    private static final SubLString $str78$Invalid_state_transition__index_d = makeString("Invalid state transition--index dump style is neither changed nor entire???");

    private static final SubLString $str79$Dumpable_index_construction_faile = makeString("Dumpable index-construction failed:");

    private static final SubLString $str80$____Key__A_was_not_copied_over_to = makeString("~&  Key ~A was not copied over to write-out map.~%");

    private static final SubLString $str81$_A__Key__A_is_in_write_out_map_bu = makeString("~A  Key ~A is in write-out map but not in sub-index.~%");

    private static final SubLString $str82$Path_mis_alignment__trying_to_pop = makeString("Path mis-alignment; trying to pop ~A but top of stack is ~A.~%");

    private static final SubLSymbol NOTE_PRECACHE_TERM = makeSymbol("NOTE-PRECACHE-TERM");

    private static final SubLString $$$Gathering_assertions = makeString("Gathering assertions");

    private static final SubLString $str85$Precaching_assertions_and_gatheri = makeString("Precaching assertions and gathering terms");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $sym87$_ = makeSymbol("<");

    private static final SubLSymbol CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");

    private static final SubLSymbol NART_ID = makeSymbol("NART-ID");

    private static final SubLSymbol UNREPRESENTED_TERM_SUID = makeSymbol("UNREPRESENTED-TERM-SUID");

    private static final SubLString $$$Precaching_constant_indexes = makeString("Precaching constant indexes");

    private static final SubLString $str92$Precaching_NART_indexes_and_formu = makeString("Precaching NART indexes and formulas");

    private static final SubLString $str93$Precaching_unrepresented_term_ind = makeString("Precaching unrepresented term indexes");

    private static final SubLSymbol $UNREPRESENTED_TERM_COUNT = makeKeyword("UNREPRESENTED-TERM-COUNT");

    public static SubLObject rule_with_some_pragmatic_somewhereP(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(indexing_utilities.$$EverythingPSC, thread);
            result = indexing_utilities.rule_with_some_pragmaticP(rule, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rule_with_some_pragmaticP(final SubLObject rule, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pragmas_foundP = NIL;
        if (NIL != assertions_high.rule_assertionP(rule)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, NIL);
                    SubLObject done_var = pragmas_foundP;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$1 = pragmas_foundP;
                                final SubLObject token_var_$2 = NIL;
                                while (NIL == done_var_$1) {
                                    final SubLObject pragma = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(pragma));
                                    if (NIL != valid_$3) {
                                        final SubLObject pragma_pred = cycl_utilities.atomic_sentence_predicate(clauses.neg_lits(assertions_high.assertion_cnf(pragma)).first());
                                        if (NIL == list_utilities.member_kbeqP(pragma_pred, indexing_utilities.$list3)) {
                                            pragmas_foundP = T;
                                        }
                                    }
                                    done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != pragmas_foundP));
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
                        done_var = makeBoolean((NIL == valid) || (NIL != pragmas_foundP));
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return pragmas_foundP;
    }

    public static SubLObject rule_with_some_asserted_more_specifically_pragmaticP(final SubLObject rule, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pragmas_foundP = NIL;
        if (NIL != assertions_high.rule_assertionP(rule)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, NIL);
                    SubLObject done_var = pragmas_foundP;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$5 = pragmas_foundP;
                                final SubLObject token_var_$6 = NIL;
                                while (NIL == done_var_$5) {
                                    final SubLObject pragma = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                    final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(pragma));
                                    if (NIL != valid_$7) {
                                        pragmas_foundP = assertion_utilities.assertion_mentions_asserted_more_specificallyP(pragma);
                                    }
                                    done_var_$5 = makeBoolean((NIL == valid_$7) || (NIL != pragmas_foundP));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != pragmas_foundP));
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return pragmas_foundP;
    }

    public static SubLObject find_all_assertions_genl_mts(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_indexing.find_all_assertions(cnf);
        SubLObject visible_assertions = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = all_assertions;
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
                    visible_assertions = cons(ass, visible_assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(visible_assertions);
    }

    public static SubLObject dependent_narts(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$tou_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(fort, NIL, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(fort, NIL, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$9 = NIL;
                            final SubLObject token_var_$10 = NIL;
                            while (NIL == done_var_$9) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(assertion));
                                if (NIL != valid_$11) {
                                    v_answer = cons(assertions_high.gaf_arg1(assertion), v_answer);
                                }
                                done_var_$9 = makeBoolean(NIL == valid_$11);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(fort)) {
                final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(fort);
                SubLObject final_index_iterator2 = NIL;
                try {
                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                    SubLObject done_var2 = NIL;
                    final SubLObject token_var2 = NIL;
                    while (NIL == done_var2) {
                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                        final SubLObject valid2 = makeBoolean(!token_var2.eql(assertion2));
                        if (NIL != valid2) {
                            v_answer = cons(assertions_high.gaf_arg1(assertion2), v_answer);
                        }
                        done_var2 = makeBoolean(NIL == valid2);
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL != final_index_iterator2) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            }
            if (NIL != kb_mapping_macros.do_other_index_key_validator(fort, NIL)) {
                final SubLObject final_index_spec2 = kb_mapping_macros.other_final_index_spec(fort);
                SubLObject final_index_iterator2 = NIL;
                try {
                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, NIL, NIL, NIL);
                    SubLObject done_var2 = NIL;
                    final SubLObject token_var2 = NIL;
                    while (NIL == done_var2) {
                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                        final SubLObject valid2 = makeBoolean(!token_var2.eql(assertion2));
                        if (((NIL != valid2) && (NIL != kb_mapping_macros.do_other_index_assertion_match_p(assertion2))) && (NIL != indexing_utilities.term_of_unit_assertion_mentioning_fortP(assertion2, fort))) {
                            v_answer = cons(assertions_high.gaf_arg1(assertion2), v_answer);
                        }
                        done_var2 = makeBoolean(NIL == valid2);
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        if (NIL != final_index_iterator2) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                        }
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_of_unit_assertion_mentioning_fortP(final SubLObject assertion, final SubLObject fort) {
        return makeBoolean((NIL != function_terms.tou_assertionP(assertion)) && (NIL != cycl_utilities.expression_find(fort, assertions_high.gaf_arg2(assertion), T, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject nested_non_atomic_terms(final SubLObject v_object, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = $int$_2;
        }
        SubLObject result = NIL;
        if (NIL != assertions_high.rule_assertionP(v_object)) {
            if (depth.numGE(ZERO_INTEGER) && (NIL == member(v_object, result, EQUAL, symbol_function(IDENTITY)))) {
                result = cons(v_object, result);
            }
            SubLObject cdolist_list_var = clauses.neg_lits(assertions_high.assertion_cnf(v_object));
            SubLObject lit = NIL;
            lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (depth.numGE(MINUS_ONE_INTEGER)) {
                    final SubLObject item_var = lit;
                    if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                }
                SubLObject cdolist_list_var_$15 = indexing_utilities.nested_non_atomic_terms(lit, depth);
                SubLObject nested_object = NIL;
                nested_object = cdolist_list_var_$15.first();
                while (NIL != cdolist_list_var_$15) {
                    final SubLObject item_var2 = nested_object;
                    if (NIL == member(item_var2, result, EQUAL, symbol_function(IDENTITY))) {
                        result = cons(item_var2, result);
                    }
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    nested_object = cdolist_list_var_$15.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            } 
            cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(v_object));
            lit = NIL;
            lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (depth.numGE(MINUS_ONE_INTEGER)) {
                    final SubLObject item_var = lit;
                    if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                }
                SubLObject cdolist_list_var_$16 = indexing_utilities.nested_non_atomic_terms(lit, depth);
                SubLObject nested_object = NIL;
                nested_object = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    final SubLObject item_var2 = nested_object;
                    if (NIL == member(item_var2, result, EQUAL, symbol_function(IDENTITY))) {
                        result = cons(item_var2, result);
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    nested_object = cdolist_list_var_$16.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            } 
        } else
            if (NIL != assertions_high.gaf_assertionP(v_object)) {
                if (depth.numGE(ZERO_INTEGER) && (NIL == member(v_object, result, EQUAL, symbol_function(IDENTITY)))) {
                    result = cons(v_object, result);
                }
                SubLObject cdolist_list_var2;
                final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args(assertions_high.gaf_hl_formula(v_object), $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$17 = indexing_utilities.nested_non_atomic_terms(arg, add(depth, ONE_INTEGER));
                    SubLObject nested_object2 = NIL;
                    nested_object2 = cdolist_list_var_$17.first();
                    while (NIL != cdolist_list_var_$17) {
                        final SubLObject item_var3 = nested_object2;
                        if (NIL == member(item_var3, result, EQUAL, symbol_function(IDENTITY))) {
                            result = cons(item_var3, result);
                        }
                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                        nested_object2 = cdolist_list_var_$17.first();
                    } 
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    arg = cdolist_list_var2.first();
                } 
            } else
                if (NIL != nart_handles.nart_p(v_object)) {
                    if (depth.numGE(ZERO_INTEGER) && (NIL == member(v_object, result, EQUAL, symbol_function(IDENTITY)))) {
                        result = cons(v_object, result);
                    }
                    SubLObject cdolist_list_var2;
                    final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args(narts_high.nart_hl_formula(v_object), $IGNORE);
                    SubLObject nart_arg = NIL;
                    nart_arg = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        SubLObject cdolist_list_var_$18 = indexing_utilities.nested_non_atomic_terms(nart_arg, add(depth, ONE_INTEGER));
                        SubLObject nested_object2 = NIL;
                        nested_object2 = cdolist_list_var_$18.first();
                        while (NIL != cdolist_list_var_$18) {
                            final SubLObject item_var3 = nested_object2;
                            if (NIL == member(item_var3, result, EQUAL, symbol_function(IDENTITY))) {
                                result = cons(item_var3, result);
                            }
                            cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                            nested_object2 = cdolist_list_var_$18.first();
                        } 
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        nart_arg = cdolist_list_var2.first();
                    } 
                } else
                    if (v_object.isCons()) {
                        if (depth.numGE(ZERO_INTEGER) && (NIL == member(v_object, result, EQUAL, symbol_function(IDENTITY)))) {
                            result = cons(v_object, result);
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args(v_object, $IGNORE);
                        SubLObject arg = NIL;
                        arg = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$19 = indexing_utilities.nested_non_atomic_terms(arg, add(depth, ONE_INTEGER));
                            SubLObject nested_object2 = NIL;
                            nested_object2 = cdolist_list_var_$19.first();
                            while (NIL != cdolist_list_var_$19) {
                                final SubLObject item_var3 = nested_object2;
                                if (NIL == member(item_var3, result, EQUAL, symbol_function(IDENTITY))) {
                                    result = cons(item_var3, result);
                                }
                                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                nested_object2 = cdolist_list_var_$19.first();
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            arg = cdolist_list_var2.first();
                        } 
                    }



        return result;
    }

    public static SubLObject sort_gafs_for_removal(final SubLObject gafs, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = indexing_utilities.$term_being_removed$.currentBinding(thread);
        try {
            indexing_utilities.$term_being_removed$.bind(v_term, thread);
            return Sort.sort(gafs, indexing_utilities.$sym10$GAF_REMOVE_BEFORE_, UNPROVIDED);
        } finally {
            indexing_utilities.$term_being_removed$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject gaf_remove_beforeP(final SubLObject gaf1, final SubLObject gaf2) {
        return numL(indexing_utilities.gaf_removal_order(gaf1), indexing_utilities.gaf_removal_order(gaf2));
    }

    public static SubLObject gaf_removal_order(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = assertions_high.gaf_arg1(gaf);
        if (NIL == kb_utilities.kbeq(arg1, indexing_utilities.$term_being_removed$.getDynamicValue(thread))) {
            return ONE_INTEGER;
        }
        final SubLObject pcase_var;
        final SubLObject pred = pcase_var = assertions_high.gaf_predicate(gaf);
        if (pcase_var.eql(indexing_utilities.$$termOfUnit)) {
            return FIVE_INTEGER;
        }
        if (pcase_var.eql(indexing_utilities.$$isa)) {
            return FOUR_INTEGER;
        }
        if (pcase_var.eql(indexing_utilities.$$genls)) {
            return THREE_INTEGER;
        }
        return TWO_INTEGER;
    }

    public static SubLObject complex_index_visitor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        indexing_utilities.print_complex_index_visitor(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject complex_index_visitor_p(final SubLObject v_object) {
        return v_object.getClass() == indexing_utilities.$complex_index_visitor_native.class ? T : NIL;
    }

    public static SubLObject compinx_visit_begin_subindex_fn(final SubLObject v_object) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject compinx_visit_end_subindex_fn(final SubLObject v_object) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject compinx_visit_note_final_index_fn(final SubLObject v_object) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject compinx_visit_begin_visit_fn(final SubLObject v_object) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject compinx_visit_end_visit_fn(final SubLObject v_object) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject compinx_visit_param(final SubLObject v_object) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_compinx_visit_begin_subindex_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_compinx_visit_end_subindex_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_compinx_visit_note_final_index_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_compinx_visit_begin_visit_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_compinx_visit_end_visit_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_compinx_visit_param(final SubLObject v_object, final SubLObject value) {
        assert NIL != indexing_utilities.complex_index_visitor_p(v_object) : "! indexing_utilities.complex_index_visitor_p(v_object) " + "indexing_utilities.complex_index_visitor_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_complex_index_visitor(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new indexing_utilities.$complex_index_visitor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql(indexing_utilities.$BEGIN_SUBINDEX_FN)) {
                indexing_utilities._csetf_compinx_visit_begin_subindex_fn(v_new, current_value);
            } else
                if (pcase_var.eql(indexing_utilities.$END_SUBINDEX_FN)) {
                    indexing_utilities._csetf_compinx_visit_end_subindex_fn(v_new, current_value);
                } else
                    if (pcase_var.eql(indexing_utilities.$NOTE_FINAL_INDEX_FN)) {
                        indexing_utilities._csetf_compinx_visit_note_final_index_fn(v_new, current_value);
                    } else
                        if (pcase_var.eql(indexing_utilities.$BEGIN_VISIT_FN)) {
                            indexing_utilities._csetf_compinx_visit_begin_visit_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql(indexing_utilities.$END_VISIT_FN)) {
                                indexing_utilities._csetf_compinx_visit_end_visit_fn(v_new, current_value);
                            } else
                                if (pcase_var.eql($PARAM)) {
                                    indexing_utilities._csetf_compinx_visit_param(v_new, current_value);
                                } else {
                                    Errors.error(indexing_utilities.$str41$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_complex_index_visitor(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, indexing_utilities.MAKE_COMPLEX_INDEX_VISITOR, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, indexing_utilities.$BEGIN_SUBINDEX_FN, indexing_utilities.compinx_visit_begin_subindex_fn(obj));
        funcall(visitor_fn, obj, $SLOT, indexing_utilities.$END_SUBINDEX_FN, indexing_utilities.compinx_visit_end_subindex_fn(obj));
        funcall(visitor_fn, obj, $SLOT, indexing_utilities.$NOTE_FINAL_INDEX_FN, indexing_utilities.compinx_visit_note_final_index_fn(obj));
        funcall(visitor_fn, obj, $SLOT, indexing_utilities.$BEGIN_VISIT_FN, indexing_utilities.compinx_visit_begin_visit_fn(obj));
        funcall(visitor_fn, obj, $SLOT, indexing_utilities.$END_VISIT_FN, indexing_utilities.compinx_visit_end_visit_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $PARAM, indexing_utilities.compinx_visit_param(obj));
        funcall(visitor_fn, obj, $END, indexing_utilities.MAKE_COMPLEX_INDEX_VISITOR, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_complex_index_visitor_method(final SubLObject obj, final SubLObject visitor_fn) {
        return indexing_utilities.visit_defstruct_complex_index_visitor(obj, visitor_fn);
    }

    public static SubLObject print_complex_index_visitor(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string(indexing_utilities.$str47$__CompInxVisit__, stream, UNPROVIDED, UNPROVIDED);
            princ(indexing_utilities.compinx_visit_begin_visit_fn(v_object), stream);
            write_string(indexing_utilities.$str48$__SubIndex__, stream, UNPROVIDED, UNPROVIDED);
            princ(indexing_utilities.compinx_visit_begin_subindex_fn(v_object), stream);
            write_string(indexing_utilities.$str49$_FinalIndex__, stream, UNPROVIDED, UNPROVIDED);
            princ(indexing_utilities.compinx_visit_note_final_index_fn(v_object), stream);
            write_string(indexing_utilities.$$$_, stream, UNPROVIDED, UNPROVIDED);
            princ(indexing_utilities.compinx_visit_end_subindex_fn(v_object), stream);
            write_string(indexing_utilities.$str51$__, stream, UNPROVIDED, UNPROVIDED);
            princ(indexing_utilities.compinx_visit_end_visit_fn(v_object), stream);
            write_string(indexing_utilities.$str52$__Param__, stream, UNPROVIDED, UNPROVIDED);
            princ(indexing_utilities.compinx_visit_param(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject new_complex_index_visitor(final SubLObject begin_visit_fn, final SubLObject begin_subindex_fn, final SubLObject note_final_index_fn, final SubLObject end_subindex_fn, final SubLObject end_visit_fn, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        final SubLObject compinx_visit = indexing_utilities.make_complex_index_visitor(UNPROVIDED);
        indexing_utilities._csetf_compinx_visit_begin_visit_fn(compinx_visit, begin_visit_fn);
        indexing_utilities._csetf_compinx_visit_begin_subindex_fn(compinx_visit, begin_subindex_fn);
        indexing_utilities._csetf_compinx_visit_note_final_index_fn(compinx_visit, note_final_index_fn);
        indexing_utilities._csetf_compinx_visit_end_subindex_fn(compinx_visit, end_subindex_fn);
        indexing_utilities._csetf_compinx_visit_end_visit_fn(compinx_visit, end_visit_fn);
        indexing_utilities._csetf_compinx_visit_param(compinx_visit, param);
        return compinx_visit;
    }

    public static SubLObject complex_index_visitor_begin_visit(final SubLObject compinx_visitor, final SubLObject complex_index) {
        return funcall(indexing_utilities.compinx_visit_begin_visit_fn(compinx_visitor), compinx_visitor, complex_index);
    }

    public static SubLObject complex_index_visitor_end_visit(final SubLObject compinx_visitor, final SubLObject complex_index) {
        return funcall(indexing_utilities.compinx_visit_end_visit_fn(compinx_visitor), compinx_visitor, complex_index);
    }

    public static SubLObject show_complex_index_visitor_final_index(final SubLObject compinx_visitor, final SubLObject final_key, final SubLObject final_index) {
        return funcall(indexing_utilities.compinx_visit_note_final_index_fn(compinx_visitor), compinx_visitor, final_key, final_index);
    }

    public static SubLObject show_complex_index_visitor_subindex_begin(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index) {
        return funcall(indexing_utilities.compinx_visit_begin_subindex_fn(compinx_visitor), compinx_visitor, sub_key, sub_index);
    }

    public static SubLObject show_complex_index_visitor_subindex_end(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index) {
        return funcall(indexing_utilities.compinx_visit_end_subindex_fn(compinx_visitor), compinx_visitor, sub_key, sub_index);
    }

    public static SubLObject set_complex_index_visitor_parameter(final SubLObject compinx_visitor, final SubLObject new_param) {
        final SubLObject old_param = indexing_utilities.get_complex_index_visitor_parameter(compinx_visitor);
        indexing_utilities._csetf_compinx_visit_param(compinx_visitor, new_param);
        return old_param;
    }

    public static SubLObject get_complex_index_visitor_parameter(final SubLObject compinx_visitor) {
        return indexing_utilities.compinx_visit_param(compinx_visitor);
    }

    public static SubLObject visit_complex_index(final SubLObject complex_index, final SubLObject compinx_visitor) {
        indexing_utilities.complex_index_visitor_begin_visit(compinx_visitor, complex_index);
        indexing_utilities.visit_complex_subindex(compinx_visitor, $INDEX_ROOT, complex_index);
        indexing_utilities.complex_index_visitor_end_visit(compinx_visitor, complex_index);
        return compinx_visitor;
    }

    public static SubLObject visit_complex_subindex(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        indexing_utilities.show_complex_index_visitor_subindex_begin(compinx_visitor, sub_key, sub_index);
        if (NIL != do_intermediate_index_valid_index_p(sub_index)) {
            final SubLObject iterator = map_utilities.new_map_iterator(intermediate_index_map(sub_index));
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject i_key = NIL;
                    SubLObject i_index = NIL;
                    destructuring_bind_must_consp(current, datum, indexing_utilities.$list54);
                    i_key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, indexing_utilities.$list54);
                    i_index = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != final_index_p(i_index)) {
                            indexing_utilities.show_complex_index_visitor_final_index(compinx_visitor, i_key, i_index);
                        } else
                            if (NIL != intermediate_index_p(i_index)) {
                                indexing_utilities.visit_complex_subindex(compinx_visitor, i_key, i_index);
                            } else {
                                Errors.error(indexing_utilities.$str55$Illegal_state_exception__Index_co, i_index, i_key);
                            }

                    } else {
                        cdestructuring_bind_error(datum, indexing_utilities.$list54);
                    }
                }
            }
        }
        indexing_utilities.show_complex_index_visitor_subindex_end(compinx_visitor, sub_key, sub_index);
        return compinx_visitor;
    }

    public static SubLObject visit_changed_complex_index(final SubLObject complex_index, final SubLObject compinx_visitor) {
        indexing_utilities.complex_index_visitor_begin_visit(compinx_visitor, complex_index);
        indexing_utilities.visit_changed_complex_subindex(compinx_visitor, $INDEX_ROOT, complex_index);
        indexing_utilities.complex_index_visitor_end_visit(compinx_visitor, complex_index);
        return compinx_visitor;
    }

    public static SubLObject visit_changed_complex_subindex(final SubLObject compinx_visitor, final SubLObject sub_key, final SubLObject sub_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject changed_keys = ZERO_INTEGER;
        SubLObject unchanged_sub_index = NIL;
        if (NIL != do_intermediate_index_valid_index_p(sub_index)) {
            SubLObject key_set = NIL;
            thread.resetMultipleValues();
            final SubLObject key_set_$20 = segregate_index_changes_and_pristines(sub_index);
            final SubLObject unchanged_sub_index_$21 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            key_set = key_set_$20;
            unchanged_sub_index = unchanged_sub_index_$21;
            SubLObject csome_list_var = key_set;
            SubLObject i_key = NIL;
            i_key = csome_list_var.first();
            while (NIL != csome_list_var) {
                final SubLObject i_index = intermediate_index_lookup(sub_index, i_key);
                if (changed_keys.isZero()) {
                    indexing_utilities.show_complex_index_visitor_subindex_begin(compinx_visitor, sub_key, unchanged_sub_index);
                }
                changed_keys = add(changed_keys, ONE_INTEGER);
                if (NIL != final_index_p(i_index)) {
                    indexing_utilities.show_complex_index_visitor_final_index(compinx_visitor, i_key, i_index);
                } else
                    if (NIL != intermediate_index_p(i_index)) {
                        indexing_utilities.visit_changed_complex_subindex(compinx_visitor, i_key, i_index);
                    } else {
                        Errors.error(indexing_utilities.$str55$Illegal_state_exception__Index_co, i_index, i_key);
                    }

                csome_list_var = csome_list_var.rest();
                i_key = csome_list_var.first();
            } 
        }
        if (changed_keys.isZero()) {
            indexing_utilities.show_complex_index_visitor_subindex_begin(compinx_visitor, sub_key, unchanged_sub_index);
        }
        indexing_utilities.show_complex_index_visitor_subindex_end(compinx_visitor, sub_key, sub_index);
        return compinx_visitor;
    }

    public static SubLObject dump_entire_swappable_complex_index(final SubLObject complex_index, final SubLObject fvector, final SubLObject indexical) {
        final SubLObject v_context = indexing_utilities.dump_swappable_kb_index_new_context(fvector, indexical, $ENTIRE);
        final SubLObject visitor = indexing_utilities.new_swappable_kb_index_dump_visitor(v_context);
        indexing_utilities.visit_complex_index(complex_index, visitor);
        return indexing_utilities.dump_swappable_kb_index_get_final_result(v_context);
    }

    public static SubLObject dump_changed_swappable_complex_index(final SubLObject complex_index, final SubLObject fvector, final SubLObject indexical) {
        final SubLObject v_context = indexing_utilities.dump_swappable_kb_index_new_context(fvector, indexical, $CHANGED);
        final SubLObject visitor = indexing_utilities.new_swappable_kb_index_dump_visitor(v_context);
        indexing_utilities.visit_changed_complex_index(complex_index, visitor);
        return indexing_utilities.dump_swappable_kb_index_get_final_result(v_context);
    }

    public static SubLObject new_swappable_kb_index_dump_visitor(final SubLObject v_context) {
        return indexing_utilities.new_complex_index_visitor(indexing_utilities.DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_VISIT, indexing_utilities.DUMP_SWAPPABLE_KB_INDEX_VISITOR_BEGIN_SUBINDEX, indexing_utilities.DUMP_SWAPPABLE_KB_INDEX_VISITOR_NOTE_FINAL_INDEX, indexing_utilities.DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_SUBINDEX, indexing_utilities.DUMP_SWAPPABLE_KB_INDEX_VISITOR_END_VISIT, v_context);
    }

    public static SubLObject dump_swappable_kb_index_visitor_begin_visit(final SubLObject visitor, final SubLObject complex_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == indexing_utilities.dump_swappable_kb_index_valid_initial_context(v_context))) {
            Errors.error(indexing_utilities.$str63$The_swappable_KB_index_visitor_is, v_context);
        }
        indexing_utilities.dump_swappable_kb_index_push_current_index(v_context, clone_intermediate_index(complex_index));
        return visitor;
    }

    public static SubLObject dump_swappable_kb_index_new_context(final SubLObject fvector, final SubLObject indexical, final SubLObject style) {
        return list_utilities.make_plist(list($FILE_VECTOR, $INDEX_STACK, $NEW_INDEX, $FVECTOR_INDEXICAL, $STYLE, $KEY_STACK), list(fvector, stacks.create_stack(), $NONE, indexical, style, stacks.create_stack()));
    }

    public static SubLObject dump_swappable_kb_index_valid_initial_context(final SubLObject v_context) {
        return makeBoolean(((((((NIL != list_utilities.property_list_p(v_context)) && (NIL != file_vector.file_vector_p(getf(v_context, $FILE_VECTOR, UNPROVIDED)))) && (NIL != stacks.stack_empty_p(getf(v_context, $INDEX_STACK, UNPROVIDED)))) && ($NONE == getf(v_context, $NEW_INDEX, UNPROVIDED))) && (NIL != file_vector_utilities.file_vector_indexical_p(getf(v_context, $FVECTOR_INDEXICAL, UNPROVIDED)))) && ((NIL != indexing_utilities.dumping_swappable_changed_kb_indexP(v_context)) || (NIL != indexing_utilities.dumping_swappable_entire_kb_indexP(v_context)))) && (NIL != stacks.stack_empty_p(getf(v_context, $KEY_STACK, UNPROVIDED))));
    }

    public static SubLObject dumping_swappable_changed_kb_indexP(final SubLObject v_context) {
        return eq($CHANGED, getf(v_context, $STYLE, UNPROVIDED));
    }

    public static SubLObject dumping_swappable_entire_kb_indexP(final SubLObject v_context) {
        return eq($ENTIRE, getf(v_context, $STYLE, UNPROVIDED));
    }

    public static SubLObject dump_swappable_kb_index_visitor_end_visit(final SubLObject visitor, final SubLObject complex_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == indexing_utilities.dump_swappable_kb_index_valid_final_context(v_context))) {
            Errors.error(indexing_utilities.$str71$The_swappable_KB_index_visitor_di, v_context);
        }
        indexing_utilities.dump_swappable_kb_index_set_final_result(v_context);
        return visitor;
    }

    public static SubLObject dump_swappable_kb_index_valid_final_context(final SubLObject v_context) {
        return makeBoolean(((NIL != list_utilities.property_list_p(v_context)) && (NIL != file_vector.file_vector_p(getf(v_context, $FILE_VECTOR, UNPROVIDED)))) && ONE_INTEGER.numE(stacks.stack_size(getf(v_context, $INDEX_STACK, UNPROVIDED))));
    }

    public static SubLObject dump_swappable_kb_index_visitor_begin_subindex(final SubLObject visitor, final SubLObject sub_key, final SubLObject sub_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        indexing_utilities.dump_swappable_kb_index_push_current_key(v_context, sub_key);
        if (NIL != indexing_utilities.dumping_swappable_entire_kb_indexP(v_context)) {
            indexing_utilities.dump_swappable_kb_index_push_current_index(v_context, clone_intermediate_index(sub_index));
        } else
            if (NIL != indexing_utilities.dumping_swappable_changed_kb_indexP(v_context)) {
                indexing_utilities.dump_swappable_kb_index_push_current_index(v_context, sub_index);
            } else {
                Errors.error(indexing_utilities.$str72$Invalid_state_transition__the_ind);
            }

        return visitor;
    }

    public static SubLObject dump_swappable_kb_index_visitor_note_final_index(final SubLObject visitor, final SubLObject final_key, SubLObject final_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject curr_index = indexing_utilities.dump_swappable_kb_index_get_current_index(v_context);
        if (NIL == final_topn_index_p(final_index)) {
            if (NIL != final_sharded_index_p(final_index)) {
                final SubLObject sharded_index = indexing_utilities.dump_swappable_kb_index_possibly_reshard_final_sharded_index(visitor, final_index);
                final_index = indexing_utilities.dump_swappable_kb_index_serialize_sharded_index(visitor, sharded_index);
            } else
                if ((NIL != final_unified_index_p(final_index)) && (NIL != final_unified_index_is_shardableP(final_index))) {
                    final SubLObject sharded_index = convert_final_simple_index_to_sharded_index(final_index);
                    final_index = indexing_utilities.dump_swappable_kb_index_serialize_sharded_index(visitor, sharded_index);
                }

        }
        intermediate_index_set(curr_index, final_key, final_index);
        return visitor;
    }

    public static SubLObject dump_swappable_kb_index_visitor_end_subindex(final SubLObject visitor, final SubLObject sub_key, final SubLObject sub_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject curr_index = indexing_utilities.dump_swappable_kb_index_pop_current_index(v_context);
        final SubLObject fvector = indexing_utilities.dump_swappable_kb_index_get_file_vector(v_context);
        final SubLObject indexical = indexing_utilities.dump_swappable_kb_index_get_file_vector_indexical(v_context);
        indexing_utilities.dump_swappable_kb_index_pop_current_key(v_context, sub_key);
        SubLObject msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    indexing_utilities.sanity_check_constructed_index_equivalence(sub_index, curr_index);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (msg.isString()) {
            Errors.error(indexing_utilities.$str74$Failed_to_sanity_check_key__A_s_s, sub_key, sub_index, curr_index);
        }
        if (NIL != indexing_utilities.$swap_out_intermediate_index_levelsP$.getDynamicValue(thread)) {
            final SubLObject curr_map = intermediate_index_map(curr_index);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != file_vector_utilities.backed_map_p(curr_map))) {
                Errors.error(indexing_utilities.$str75$Conversion_error__newly_created_m);
            }
            if (NIL != indexing_utilities.dumping_swappable_changed_kb_indexP(v_context)) {
                file_vector_utilities.upgrade_map_to_file_vector_backed_map(curr_map, fvector, $SWAPPED_OUT);
            } else
                if (NIL != indexing_utilities.dumping_swappable_entire_kb_indexP(v_context)) {
                    file_vector_utilities.convert_map_to_file_vector_backed_map(curr_map, fvector, $SWAPPED_OUT, $COMPACT);
                } else {
                    Errors.error(indexing_utilities.$str78$Invalid_state_transition__index_d);
                }

            final SubLObject backed_map = file_vector_utilities.new_indexical_backed_map(curr_map, indexical);
            intermediate_index_replace_map(curr_index, backed_map);
        }
        final SubLObject parent_index = indexing_utilities.dump_swappable_kb_index_get_current_index(v_context);
        intermediate_index_set(parent_index, sub_key, curr_index);
        return visitor;
    }

    public static SubLObject dump_swappable_kb_index_serialize_sharded_index(final SubLObject visitor, final SubLObject sharded_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject fvector = indexing_utilities.dump_swappable_kb_index_get_file_vector(v_context);
        final SubLObject indexical = indexing_utilities.dump_swappable_kb_index_get_file_vector_indexical(v_context);
        if (NIL != indexing_utilities.dumping_swappable_entire_kb_indexP(v_context)) {
            return final_sharded_index_to_fvector_backed_sharded_index(sharded_index, fvector, indexical);
        }
        if (NIL != indexing_utilities.dumping_swappable_changed_kb_indexP(v_context)) {
            return update_fvector_backed_final_sharded_index(sharded_index, fvector, indexical);
        }
        Errors.error(indexing_utilities.$str78$Invalid_state_transition__index_d);
        return sharded_index;
    }

    public static SubLObject dump_swappable_kb_index_possibly_reshard_final_sharded_index(final SubLObject visitor, final SubLObject final_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        if (NIL != indexing_utilities.dumping_swappable_entire_kb_indexP(v_context)) {
            return reshard_final_sharded_index(final_index);
        }
        if (NIL != indexing_utilities.dumping_swappable_changed_kb_indexP(v_context)) {
            return reorganize_modified_final_sharded_index(final_index);
        }
        Errors.error(indexing_utilities.$str78$Invalid_state_transition__index_d);
        return final_index;
    }

    public static SubLObject sanity_check_constructed_index_equivalence(final SubLObject sub_index, final SubLObject curr_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject in_sub = map_utilities.maps_differ_in_keys(intermediate_index_map(sub_index), intermediate_index_map(curr_index), T);
        final SubLObject in_curr = thread.secondMultipleValue();
        final SubLObject shared = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == set.empty_set_p(in_sub)) || (NIL == set.empty_set_p(in_curr))) {
            SubLObject msg = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                write_string(indexing_utilities.$str79$Dumpable_index_construction_faile, stream, UNPROVIDED, UNPROVIDED);
                SubLObject set_contents_var = set.do_set_internal(in_sub);
                SubLObject basis_object;
                SubLObject state;
                SubLObject sub_key;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    sub_key = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, sub_key)) {
                        format(stream, indexing_utilities.$str80$____Key__A_was_not_copied_over_to, sub_key);
                    }
                }
                set_contents_var = set.do_set_internal(in_curr);
                SubLObject curr_key;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    curr_key = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, curr_key)) {
                        format(stream, indexing_utilities.$str81$_A__Key__A_is_in_write_out_map_bu, curr_key);
                    }
                }
                msg = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            Errors.error(msg);
        }
        return T;
    }

    public static SubLObject dump_swappable_kb_index_get_file_vector(final SubLObject v_context) {
        return getf(v_context, $FILE_VECTOR, UNPROVIDED);
    }

    public static SubLObject dump_swappable_kb_index_get_file_vector_indexical(final SubLObject v_context) {
        return getf(v_context, $FVECTOR_INDEXICAL, UNPROVIDED);
    }

    public static SubLObject dump_swappable_kb_index_pop_current_index(final SubLObject v_context) {
        final SubLObject index_stack = getf(v_context, $INDEX_STACK, UNPROVIDED);
        return stacks.stack_pop(index_stack);
    }

    public static SubLObject dump_swappable_kb_index_push_current_index(final SubLObject v_context, final SubLObject sub_index_copy) {
        final SubLObject index_stack = getf(v_context, $INDEX_STACK, UNPROVIDED);
        stacks.stack_push(sub_index_copy, index_stack);
        return v_context;
    }

    public static SubLObject dump_swappable_kb_index_get_current_index(final SubLObject v_context) {
        final SubLObject index_stack = getf(v_context, $INDEX_STACK, UNPROVIDED);
        return stacks.stack_peek(index_stack);
    }

    public static SubLObject dump_swappable_kb_index_push_current_key(final SubLObject v_context, final SubLObject sub_key) {
        final SubLObject key_stack = getf(v_context, $KEY_STACK, UNPROVIDED);
        stacks.stack_push(sub_key, key_stack);
        return v_context;
    }

    public static SubLObject dump_swappable_kb_index_pop_current_key(final SubLObject v_context, final SubLObject sub_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_stack = getf(v_context, $KEY_STACK, UNPROVIDED);
        final SubLObject curr_top = stacks.stack_peek(key_stack);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!sub_key.eql(curr_top))) {
            Errors.error(indexing_utilities.$str82$Path_mis_alignment__trying_to_pop, sub_key, curr_top);
        }
        stacks.stack_pop(key_stack);
        return v_context;
    }

    public static SubLObject dump_swappable_kb_index_get_current_key_path(final SubLObject v_context) {
        final SubLObject key_stack = getf(v_context, $KEY_STACK, UNPROVIDED);
        final SubLObject contents = stacks.stack_elements(key_stack);
        return nreverse(contents);
    }

    public static SubLObject dump_swappable_kb_index_get_final_result(final SubLObject v_context) {
        return getf(v_context, $NEW_INDEX, UNPROVIDED);
    }

    public static SubLObject dump_swappable_kb_index_set_final_result(final SubLObject v_context) {
        final SubLObject index_stack = getf(v_context, $INDEX_STACK, UNPROVIDED);
        final SubLObject top_index = stacks.stack_peek(index_stack);
        putf(v_context, $NEW_INDEX, intermediate_index_lookup(top_index, $INDEX_ROOT));
        return indexing_utilities.dump_swappable_kb_index_get_final_result(v_context);
    }

    public static SubLObject note_precache_term(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != forts.fort_p(v_object)) || (NIL != indexed_unrepresented_term_p(v_object))) {
            return set.set_add(v_object, indexing_utilities.$precache_term_set$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject precache_predicate_extent(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(indexing_utilities.$$EverythingPSC, thread);
            final SubLObject message_var = indexing_utilities.$$$Gathering_assertions;
            final SubLObject start_time = noting_elapsed_time_preamble(message_var);
            assertions = kb_mapping.gather_predicate_extent_index(predicate, UNPROVIDED, UNPROVIDED);
            assertions = assertion_utilities.sort_assertions(assertions);
            noting_elapsed_time_postamble(message_var, start_time);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject term_set = set.new_set(symbol_function(EQUAL), number_utilities.f_2X(length(assertions)));
        final SubLObject _prev_bind_3 = indexing_utilities.$precache_term_set$.currentBinding(thread);
        try {
            indexing_utilities.$precache_term_set$.bind(term_set, thread);
            final SubLObject list_var = assertions;
            final SubLObject _prev_bind_0_$22 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(indexing_utilities.$str85$Precaching_assertions_and_gatheri, thread);
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
                    SubLObject ass = NIL;
                    ass = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        cycl_utilities.assertion_map(symbol_function(indexing_utilities.NOTE_PRECACHE_TERM), ass, UNPROVIDED, UNPROVIDED);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ass = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_10, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_9, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_8, thread);
                $last_percent_progress_index$.rebind(_prev_bind_7, thread);
                $progress_sofar$.rebind(_prev_bind_6, thread);
                $progress_total$.rebind(_prev_bind_5, thread);
                $progress_start_time$.rebind(_prev_bind_4, thread);
                $progress_note$.rebind(_prev_bind_0_$22, thread);
            }
        } finally {
            indexing_utilities.$precache_term_set$.rebind(_prev_bind_3, thread);
        }
        SubLObject constants = NIL;
        SubLObject narts = NIL;
        SubLObject v_unrepresented_terms = NIL;
        final SubLObject set_contents_var = set.do_set_internal(term_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject v_term;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            v_term = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                if (NIL != constant_p(v_term)) {
                    constants = cons(v_term, constants);
                } else
                    if (NIL != nart_handles.nart_p(v_term)) {
                        narts = cons(v_term, narts);
                    } else
                        if (NIL != indexed_unrepresented_term_p(v_term)) {
                            v_unrepresented_terms = cons(v_term, v_unrepresented_terms);
                        }


            }
        }
        constants = Sort.sort(constants, symbol_function(indexing_utilities.$sym87$_), symbol_function(indexing_utilities.CONSTANT_INTERNAL_ID));
        narts = Sort.sort(narts, symbol_function(indexing_utilities.$sym87$_), symbol_function(indexing_utilities.NART_ID));
        v_unrepresented_terms = Sort.sort(v_unrepresented_terms, symbol_function(indexing_utilities.$sym87$_), symbol_function(indexing_utilities.UNREPRESENTED_TERM_SUID));
        if (NIL != constants) {
            final SubLObject list_var2 = constants;
            final SubLObject _prev_bind_11 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_13 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_15 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_16 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_17 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_18 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(indexing_utilities.$$$Precaching_constant_indexes, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var2), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var2 = list_var2;
                    SubLObject constant = NIL;
                    constant = csome_list_var2.first();
                    while (NIL != csome_list_var2) {
                        term_index(constant);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var2 = csome_list_var2.rest();
                        constant = csome_list_var2.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_18, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_17, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_16, thread);
                $last_percent_progress_index$.rebind(_prev_bind_15, thread);
                $progress_sofar$.rebind(_prev_bind_14, thread);
                $progress_total$.rebind(_prev_bind_13, thread);
                $progress_start_time$.rebind(_prev_bind_12, thread);
                $progress_note$.rebind(_prev_bind_11, thread);
            }
        }
        if (NIL != narts) {
            final SubLObject list_var2 = narts;
            final SubLObject _prev_bind_11 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_13 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_15 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_16 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_17 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_18 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(indexing_utilities.$str92$Precaching_NART_indexes_and_formu, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var2), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var2 = list_var2;
                    SubLObject nart = NIL;
                    nart = csome_list_var2.first();
                    while (NIL != csome_list_var2) {
                        term_index(nart);
                        narts_high.nart_hl_formula(nart);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var2 = csome_list_var2.rest();
                        nart = csome_list_var2.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_18, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_17, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_16, thread);
                $last_percent_progress_index$.rebind(_prev_bind_15, thread);
                $progress_sofar$.rebind(_prev_bind_14, thread);
                $progress_total$.rebind(_prev_bind_13, thread);
                $progress_start_time$.rebind(_prev_bind_12, thread);
                $progress_note$.rebind(_prev_bind_11, thread);
            }
        }
        if (NIL != v_unrepresented_terms) {
            final SubLObject list_var2 = v_unrepresented_terms;
            final SubLObject _prev_bind_11 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_13 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_15 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_16 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_17 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_18 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(indexing_utilities.$str93$Precaching_unrepresented_term_ind, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var2), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var2 = list_var2;
                    SubLObject urt = NIL;
                    urt = csome_list_var2.first();
                    while (NIL != csome_list_var2) {
                        term_index(urt);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var2 = csome_list_var2.rest();
                        urt = csome_list_var2.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_18, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_17, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_16, thread);
                $last_percent_progress_index$.rebind(_prev_bind_15, thread);
                $progress_sofar$.rebind(_prev_bind_14, thread);
                $progress_total$.rebind(_prev_bind_13, thread);
                $progress_start_time$.rebind(_prev_bind_12, thread);
                $progress_note$.rebind(_prev_bind_11, thread);
            }
        }
        return list($ASSERTION_COUNT, length(assertions), $CONSTANT_COUNT, length(constants), $NART_COUNT, length(narts), indexing_utilities.$UNREPRESENTED_TERM_COUNT, length(v_unrepresented_terms));
    }

    public static final SubLObject declare_indexing_utilities_file_alt() {
        declareFunction("visit_final_index_sets", "VISIT-FINAL-INDEX-SETS", 2, 0, false);
        declareFunction("visit_final_index_sets_int", "VISIT-FINAL-INDEX-SETS-INT", 2, 0, false);
        declareFunction("compile_final_index_metrics", "COMPILE-FINAL-INDEX-METRICS", 1, 1, false);
        declareFunction("final_index_metrics_compilation_fn", "FINAL-INDEX-METRICS-COMPILATION-FN", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_indexing_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("rule_with_some_pragmatic_somewhereP", "RULE-WITH-SOME-PRAGMATIC-SOMEWHERE?", 1, 0, false);
            declareFunction("rule_with_some_pragmaticP", "RULE-WITH-SOME-PRAGMATIC?", 1, 1, false);
            declareFunction("rule_with_some_asserted_more_specifically_pragmaticP", "RULE-WITH-SOME-ASSERTED-MORE-SPECIFICALLY-PRAGMATIC?", 1, 1, false);
            declareFunction("find_all_assertions_genl_mts", "FIND-ALL-ASSERTIONS-GENL-MTS", 2, 0, false);
            declareFunction("dependent_narts", "DEPENDENT-NARTS", 1, 0, false);
            declareFunction("term_of_unit_assertion_mentioning_fortP", "TERM-OF-UNIT-ASSERTION-MENTIONING-FORT?", 2, 0, false);
            declareFunction("nested_non_atomic_terms", "NESTED-NON-ATOMIC-TERMS", 1, 1, false);
            declareFunction("sort_gafs_for_removal", "SORT-GAFS-FOR-REMOVAL", 2, 0, false);
            declareFunction("gaf_remove_beforeP", "GAF-REMOVE-BEFORE?", 2, 0, false);
            declareFunction("gaf_removal_order", "GAF-REMOVAL-ORDER", 1, 0, false);
            declareFunction("complex_index_visitor_print_function_trampoline", "COMPLEX-INDEX-VISITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("complex_index_visitor_p", "COMPLEX-INDEX-VISITOR-P", 1, 0, false);
            new indexing_utilities.$complex_index_visitor_p$UnaryFunction();
            declareFunction("compinx_visit_begin_subindex_fn", "COMPINX-VISIT-BEGIN-SUBINDEX-FN", 1, 0, false);
            declareFunction("compinx_visit_end_subindex_fn", "COMPINX-VISIT-END-SUBINDEX-FN", 1, 0, false);
            declareFunction("compinx_visit_note_final_index_fn", "COMPINX-VISIT-NOTE-FINAL-INDEX-FN", 1, 0, false);
            declareFunction("compinx_visit_begin_visit_fn", "COMPINX-VISIT-BEGIN-VISIT-FN", 1, 0, false);
            declareFunction("compinx_visit_end_visit_fn", "COMPINX-VISIT-END-VISIT-FN", 1, 0, false);
            declareFunction("compinx_visit_param", "COMPINX-VISIT-PARAM", 1, 0, false);
            declareFunction("_csetf_compinx_visit_begin_subindex_fn", "_CSETF-COMPINX-VISIT-BEGIN-SUBINDEX-FN", 2, 0, false);
            declareFunction("_csetf_compinx_visit_end_subindex_fn", "_CSETF-COMPINX-VISIT-END-SUBINDEX-FN", 2, 0, false);
            declareFunction("_csetf_compinx_visit_note_final_index_fn", "_CSETF-COMPINX-VISIT-NOTE-FINAL-INDEX-FN", 2, 0, false);
            declareFunction("_csetf_compinx_visit_begin_visit_fn", "_CSETF-COMPINX-VISIT-BEGIN-VISIT-FN", 2, 0, false);
            declareFunction("_csetf_compinx_visit_end_visit_fn", "_CSETF-COMPINX-VISIT-END-VISIT-FN", 2, 0, false);
            declareFunction("_csetf_compinx_visit_param", "_CSETF-COMPINX-VISIT-PARAM", 2, 0, false);
            declareFunction("make_complex_index_visitor", "MAKE-COMPLEX-INDEX-VISITOR", 0, 1, false);
            declareFunction("visit_defstruct_complex_index_visitor", "VISIT-DEFSTRUCT-COMPLEX-INDEX-VISITOR", 2, 0, false);
            declareFunction("visit_defstruct_object_complex_index_visitor_method", "VISIT-DEFSTRUCT-OBJECT-COMPLEX-INDEX-VISITOR-METHOD", 2, 0, false);
            declareFunction("print_complex_index_visitor", "PRINT-COMPLEX-INDEX-VISITOR", 3, 0, false);
            declareFunction("new_complex_index_visitor", "NEW-COMPLEX-INDEX-VISITOR", 5, 1, false);
            declareFunction("complex_index_visitor_begin_visit", "COMPLEX-INDEX-VISITOR-BEGIN-VISIT", 2, 0, false);
            declareFunction("complex_index_visitor_end_visit", "COMPLEX-INDEX-VISITOR-END-VISIT", 2, 0, false);
            declareFunction("show_complex_index_visitor_final_index", "SHOW-COMPLEX-INDEX-VISITOR-FINAL-INDEX", 3, 0, false);
            declareFunction("show_complex_index_visitor_subindex_begin", "SHOW-COMPLEX-INDEX-VISITOR-SUBINDEX-BEGIN", 3, 0, false);
            declareFunction("show_complex_index_visitor_subindex_end", "SHOW-COMPLEX-INDEX-VISITOR-SUBINDEX-END", 3, 0, false);
            declareFunction("set_complex_index_visitor_parameter", "SET-COMPLEX-INDEX-VISITOR-PARAMETER", 2, 0, false);
            declareFunction("get_complex_index_visitor_parameter", "GET-COMPLEX-INDEX-VISITOR-PARAMETER", 1, 0, false);
            declareFunction("visit_complex_index", "VISIT-COMPLEX-INDEX", 2, 0, false);
            declareFunction("visit_complex_subindex", "VISIT-COMPLEX-SUBINDEX", 3, 0, false);
            declareFunction("visit_changed_complex_index", "VISIT-CHANGED-COMPLEX-INDEX", 2, 0, false);
            declareFunction("visit_changed_complex_subindex", "VISIT-CHANGED-COMPLEX-SUBINDEX", 3, 0, false);
            declareFunction("dump_entire_swappable_complex_index", "DUMP-ENTIRE-SWAPPABLE-COMPLEX-INDEX", 3, 0, false);
            declareFunction("dump_changed_swappable_complex_index", "DUMP-CHANGED-SWAPPABLE-COMPLEX-INDEX", 3, 0, false);
            declareFunction("new_swappable_kb_index_dump_visitor", "NEW-SWAPPABLE-KB-INDEX-DUMP-VISITOR", 1, 0, false);
            declareFunction("dump_swappable_kb_index_visitor_begin_visit", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-VISIT", 2, 0, false);
            declareFunction("dump_swappable_kb_index_new_context", "DUMP-SWAPPABLE-KB-INDEX-NEW-CONTEXT", 3, 0, false);
            declareFunction("dump_swappable_kb_index_valid_initial_context", "DUMP-SWAPPABLE-KB-INDEX-VALID-INITIAL-CONTEXT", 1, 0, false);
            declareFunction("dumping_swappable_changed_kb_indexP", "DUMPING-SWAPPABLE-CHANGED-KB-INDEX?", 1, 0, false);
            declareFunction("dumping_swappable_entire_kb_indexP", "DUMPING-SWAPPABLE-ENTIRE-KB-INDEX?", 1, 0, false);
            declareFunction("dump_swappable_kb_index_visitor_end_visit", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-VISIT", 2, 0, false);
            declareFunction("dump_swappable_kb_index_valid_final_context", "DUMP-SWAPPABLE-KB-INDEX-VALID-FINAL-CONTEXT", 1, 0, false);
            declareFunction("dump_swappable_kb_index_visitor_begin_subindex", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-SUBINDEX", 3, 0, false);
            declareFunction("dump_swappable_kb_index_visitor_note_final_index", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-NOTE-FINAL-INDEX", 3, 0, false);
            declareFunction("dump_swappable_kb_index_visitor_end_subindex", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-SUBINDEX", 3, 0, false);
            declareFunction("dump_swappable_kb_index_serialize_sharded_index", "DUMP-SWAPPABLE-KB-INDEX-SERIALIZE-SHARDED-INDEX", 2, 0, false);
            declareFunction("dump_swappable_kb_index_possibly_reshard_final_sharded_index", "DUMP-SWAPPABLE-KB-INDEX-POSSIBLY-RESHARD-FINAL-SHARDED-INDEX", 2, 0, false);
            declareFunction("sanity_check_constructed_index_equivalence", "SANITY-CHECK-CONSTRUCTED-INDEX-EQUIVALENCE", 2, 0, false);
            declareFunction("dump_swappable_kb_index_get_file_vector", "DUMP-SWAPPABLE-KB-INDEX-GET-FILE-VECTOR", 1, 0, false);
            declareFunction("dump_swappable_kb_index_get_file_vector_indexical", "DUMP-SWAPPABLE-KB-INDEX-GET-FILE-VECTOR-INDEXICAL", 1, 0, false);
            declareFunction("dump_swappable_kb_index_pop_current_index", "DUMP-SWAPPABLE-KB-INDEX-POP-CURRENT-INDEX", 1, 0, false);
            declareFunction("dump_swappable_kb_index_push_current_index", "DUMP-SWAPPABLE-KB-INDEX-PUSH-CURRENT-INDEX", 2, 0, false);
            declareFunction("dump_swappable_kb_index_get_current_index", "DUMP-SWAPPABLE-KB-INDEX-GET-CURRENT-INDEX", 1, 0, false);
            declareFunction("dump_swappable_kb_index_push_current_key", "DUMP-SWAPPABLE-KB-INDEX-PUSH-CURRENT-KEY", 2, 0, false);
            declareFunction("dump_swappable_kb_index_pop_current_key", "DUMP-SWAPPABLE-KB-INDEX-POP-CURRENT-KEY", 2, 0, false);
            declareFunction("dump_swappable_kb_index_get_current_key_path", "DUMP-SWAPPABLE-KB-INDEX-GET-CURRENT-KEY-PATH", 1, 0, false);
            declareFunction("dump_swappable_kb_index_get_final_result", "DUMP-SWAPPABLE-KB-INDEX-GET-FINAL-RESULT", 1, 0, false);
            declareFunction("dump_swappable_kb_index_set_final_result", "DUMP-SWAPPABLE-KB-INDEX-SET-FINAL-RESULT", 1, 0, false);
            declareFunction("note_precache_term", "NOTE-PRECACHE-TERM", 1, 0, false);
            declareFunction("precache_predicate_extent", "PRECACHE-PREDICATE-EXTENT", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("visit_final_index_sets", "VISIT-FINAL-INDEX-SETS", 2, 0, false);
            declareFunction("visit_final_index_sets_int", "VISIT-FINAL-INDEX-SETS-INT", 2, 0, false);
            declareFunction("compile_final_index_metrics", "COMPILE-FINAL-INDEX-METRICS", 1, 1, false);
            declareFunction("final_index_metrics_compilation_fn", "FINAL-INDEX-METRICS-COMPILATION-FN", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_indexing_utilities_file_Previous() {
        declareFunction("rule_with_some_pragmatic_somewhereP", "RULE-WITH-SOME-PRAGMATIC-SOMEWHERE?", 1, 0, false);
        declareFunction("rule_with_some_pragmaticP", "RULE-WITH-SOME-PRAGMATIC?", 1, 1, false);
        declareFunction("rule_with_some_asserted_more_specifically_pragmaticP", "RULE-WITH-SOME-ASSERTED-MORE-SPECIFICALLY-PRAGMATIC?", 1, 1, false);
        declareFunction("find_all_assertions_genl_mts", "FIND-ALL-ASSERTIONS-GENL-MTS", 2, 0, false);
        declareFunction("dependent_narts", "DEPENDENT-NARTS", 1, 0, false);
        declareFunction("term_of_unit_assertion_mentioning_fortP", "TERM-OF-UNIT-ASSERTION-MENTIONING-FORT?", 2, 0, false);
        declareFunction("nested_non_atomic_terms", "NESTED-NON-ATOMIC-TERMS", 1, 1, false);
        declareFunction("sort_gafs_for_removal", "SORT-GAFS-FOR-REMOVAL", 2, 0, false);
        declareFunction("gaf_remove_beforeP", "GAF-REMOVE-BEFORE?", 2, 0, false);
        declareFunction("gaf_removal_order", "GAF-REMOVAL-ORDER", 1, 0, false);
        declareFunction("complex_index_visitor_print_function_trampoline", "COMPLEX-INDEX-VISITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("complex_index_visitor_p", "COMPLEX-INDEX-VISITOR-P", 1, 0, false);
        new indexing_utilities.$complex_index_visitor_p$UnaryFunction();
        declareFunction("compinx_visit_begin_subindex_fn", "COMPINX-VISIT-BEGIN-SUBINDEX-FN", 1, 0, false);
        declareFunction("compinx_visit_end_subindex_fn", "COMPINX-VISIT-END-SUBINDEX-FN", 1, 0, false);
        declareFunction("compinx_visit_note_final_index_fn", "COMPINX-VISIT-NOTE-FINAL-INDEX-FN", 1, 0, false);
        declareFunction("compinx_visit_begin_visit_fn", "COMPINX-VISIT-BEGIN-VISIT-FN", 1, 0, false);
        declareFunction("compinx_visit_end_visit_fn", "COMPINX-VISIT-END-VISIT-FN", 1, 0, false);
        declareFunction("compinx_visit_param", "COMPINX-VISIT-PARAM", 1, 0, false);
        declareFunction("_csetf_compinx_visit_begin_subindex_fn", "_CSETF-COMPINX-VISIT-BEGIN-SUBINDEX-FN", 2, 0, false);
        declareFunction("_csetf_compinx_visit_end_subindex_fn", "_CSETF-COMPINX-VISIT-END-SUBINDEX-FN", 2, 0, false);
        declareFunction("_csetf_compinx_visit_note_final_index_fn", "_CSETF-COMPINX-VISIT-NOTE-FINAL-INDEX-FN", 2, 0, false);
        declareFunction("_csetf_compinx_visit_begin_visit_fn", "_CSETF-COMPINX-VISIT-BEGIN-VISIT-FN", 2, 0, false);
        declareFunction("_csetf_compinx_visit_end_visit_fn", "_CSETF-COMPINX-VISIT-END-VISIT-FN", 2, 0, false);
        declareFunction("_csetf_compinx_visit_param", "_CSETF-COMPINX-VISIT-PARAM", 2, 0, false);
        declareFunction("make_complex_index_visitor", "MAKE-COMPLEX-INDEX-VISITOR", 0, 1, false);
        declareFunction("visit_defstruct_complex_index_visitor", "VISIT-DEFSTRUCT-COMPLEX-INDEX-VISITOR", 2, 0, false);
        declareFunction("visit_defstruct_object_complex_index_visitor_method", "VISIT-DEFSTRUCT-OBJECT-COMPLEX-INDEX-VISITOR-METHOD", 2, 0, false);
        declareFunction("print_complex_index_visitor", "PRINT-COMPLEX-INDEX-VISITOR", 3, 0, false);
        declareFunction("new_complex_index_visitor", "NEW-COMPLEX-INDEX-VISITOR", 5, 1, false);
        declareFunction("complex_index_visitor_begin_visit", "COMPLEX-INDEX-VISITOR-BEGIN-VISIT", 2, 0, false);
        declareFunction("complex_index_visitor_end_visit", "COMPLEX-INDEX-VISITOR-END-VISIT", 2, 0, false);
        declareFunction("show_complex_index_visitor_final_index", "SHOW-COMPLEX-INDEX-VISITOR-FINAL-INDEX", 3, 0, false);
        declareFunction("show_complex_index_visitor_subindex_begin", "SHOW-COMPLEX-INDEX-VISITOR-SUBINDEX-BEGIN", 3, 0, false);
        declareFunction("show_complex_index_visitor_subindex_end", "SHOW-COMPLEX-INDEX-VISITOR-SUBINDEX-END", 3, 0, false);
        declareFunction("set_complex_index_visitor_parameter", "SET-COMPLEX-INDEX-VISITOR-PARAMETER", 2, 0, false);
        declareFunction("get_complex_index_visitor_parameter", "GET-COMPLEX-INDEX-VISITOR-PARAMETER", 1, 0, false);
        declareFunction("visit_complex_index", "VISIT-COMPLEX-INDEX", 2, 0, false);
        declareFunction("visit_complex_subindex", "VISIT-COMPLEX-SUBINDEX", 3, 0, false);
        declareFunction("visit_changed_complex_index", "VISIT-CHANGED-COMPLEX-INDEX", 2, 0, false);
        declareFunction("visit_changed_complex_subindex", "VISIT-CHANGED-COMPLEX-SUBINDEX", 3, 0, false);
        declareFunction("dump_entire_swappable_complex_index", "DUMP-ENTIRE-SWAPPABLE-COMPLEX-INDEX", 3, 0, false);
        declareFunction("dump_changed_swappable_complex_index", "DUMP-CHANGED-SWAPPABLE-COMPLEX-INDEX", 3, 0, false);
        declareFunction("new_swappable_kb_index_dump_visitor", "NEW-SWAPPABLE-KB-INDEX-DUMP-VISITOR", 1, 0, false);
        declareFunction("dump_swappable_kb_index_visitor_begin_visit", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-VISIT", 2, 0, false);
        declareFunction("dump_swappable_kb_index_new_context", "DUMP-SWAPPABLE-KB-INDEX-NEW-CONTEXT", 3, 0, false);
        declareFunction("dump_swappable_kb_index_valid_initial_context", "DUMP-SWAPPABLE-KB-INDEX-VALID-INITIAL-CONTEXT", 1, 0, false);
        declareFunction("dumping_swappable_changed_kb_indexP", "DUMPING-SWAPPABLE-CHANGED-KB-INDEX?", 1, 0, false);
        declareFunction("dumping_swappable_entire_kb_indexP", "DUMPING-SWAPPABLE-ENTIRE-KB-INDEX?", 1, 0, false);
        declareFunction("dump_swappable_kb_index_visitor_end_visit", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-VISIT", 2, 0, false);
        declareFunction("dump_swappable_kb_index_valid_final_context", "DUMP-SWAPPABLE-KB-INDEX-VALID-FINAL-CONTEXT", 1, 0, false);
        declareFunction("dump_swappable_kb_index_visitor_begin_subindex", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-BEGIN-SUBINDEX", 3, 0, false);
        declareFunction("dump_swappable_kb_index_visitor_note_final_index", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-NOTE-FINAL-INDEX", 3, 0, false);
        declareFunction("dump_swappable_kb_index_visitor_end_subindex", "DUMP-SWAPPABLE-KB-INDEX-VISITOR-END-SUBINDEX", 3, 0, false);
        declareFunction("dump_swappable_kb_index_serialize_sharded_index", "DUMP-SWAPPABLE-KB-INDEX-SERIALIZE-SHARDED-INDEX", 2, 0, false);
        declareFunction("dump_swappable_kb_index_possibly_reshard_final_sharded_index", "DUMP-SWAPPABLE-KB-INDEX-POSSIBLY-RESHARD-FINAL-SHARDED-INDEX", 2, 0, false);
        declareFunction("sanity_check_constructed_index_equivalence", "SANITY-CHECK-CONSTRUCTED-INDEX-EQUIVALENCE", 2, 0, false);
        declareFunction("dump_swappable_kb_index_get_file_vector", "DUMP-SWAPPABLE-KB-INDEX-GET-FILE-VECTOR", 1, 0, false);
        declareFunction("dump_swappable_kb_index_get_file_vector_indexical", "DUMP-SWAPPABLE-KB-INDEX-GET-FILE-VECTOR-INDEXICAL", 1, 0, false);
        declareFunction("dump_swappable_kb_index_pop_current_index", "DUMP-SWAPPABLE-KB-INDEX-POP-CURRENT-INDEX", 1, 0, false);
        declareFunction("dump_swappable_kb_index_push_current_index", "DUMP-SWAPPABLE-KB-INDEX-PUSH-CURRENT-INDEX", 2, 0, false);
        declareFunction("dump_swappable_kb_index_get_current_index", "DUMP-SWAPPABLE-KB-INDEX-GET-CURRENT-INDEX", 1, 0, false);
        declareFunction("dump_swappable_kb_index_push_current_key", "DUMP-SWAPPABLE-KB-INDEX-PUSH-CURRENT-KEY", 2, 0, false);
        declareFunction("dump_swappable_kb_index_pop_current_key", "DUMP-SWAPPABLE-KB-INDEX-POP-CURRENT-KEY", 2, 0, false);
        declareFunction("dump_swappable_kb_index_get_current_key_path", "DUMP-SWAPPABLE-KB-INDEX-GET-CURRENT-KEY-PATH", 1, 0, false);
        declareFunction("dump_swappable_kb_index_get_final_result", "DUMP-SWAPPABLE-KB-INDEX-GET-FINAL-RESULT", 1, 0, false);
        declareFunction("dump_swappable_kb_index_set_final_result", "DUMP-SWAPPABLE-KB-INDEX-SET-FINAL-RESULT", 1, 0, false);
        declareFunction("note_precache_term", "NOTE-PRECACHE-TERM", 1, 0, false);
        declareFunction("precache_predicate_extent", "PRECACHE-PREDICATE-EXTENT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_indexing_utilities_file_alt() {
        defparameter("*CURR-VISITED-INDEX-METRICS*", NIL);
        return NIL;
    }

    public static SubLObject init_indexing_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*TERM-BEING-REMOVED*", $UNINITIALIZED);
            defconstant("*DTP-COMPLEX-INDEX-VISITOR*", indexing_utilities.COMPLEX_INDEX_VISITOR);
            defparameter("*SWAP-OUT-INTERMEDIATE-INDEX-LEVELS?*", T);
            defparameter("*PRECACHE-TERM-SET*", $UNINITIALIZED);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*CURR-VISITED-INDEX-METRICS*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_indexing_utilities_file_Previous() {
        defparameter("*TERM-BEING-REMOVED*", $UNINITIALIZED);
        defconstant("*DTP-COMPLEX-INDEX-VISITOR*", indexing_utilities.COMPLEX_INDEX_VISITOR);
        defparameter("*SWAP-OUT-INTERMEDIATE-INDEX-LEVELS?*", T);
        defparameter("*PRECACHE-TERM-SET*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_indexing_utilities_file() {
        register_method($print_object_method_table$.getGlobalValue(), indexing_utilities.$dtp_complex_index_visitor$.getGlobalValue(), symbol_function(indexing_utilities.COMPLEX_INDEX_VISITOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(indexing_utilities.$list22);
        def_csetf(indexing_utilities.COMPINX_VISIT_BEGIN_SUBINDEX_FN, indexing_utilities._CSETF_COMPINX_VISIT_BEGIN_SUBINDEX_FN);
        def_csetf(indexing_utilities.COMPINX_VISIT_END_SUBINDEX_FN, indexing_utilities._CSETF_COMPINX_VISIT_END_SUBINDEX_FN);
        def_csetf(indexing_utilities.COMPINX_VISIT_NOTE_FINAL_INDEX_FN, indexing_utilities._CSETF_COMPINX_VISIT_NOTE_FINAL_INDEX_FN);
        def_csetf(indexing_utilities.COMPINX_VISIT_BEGIN_VISIT_FN, indexing_utilities._CSETF_COMPINX_VISIT_BEGIN_VISIT_FN);
        def_csetf(indexing_utilities.COMPINX_VISIT_END_VISIT_FN, indexing_utilities._CSETF_COMPINX_VISIT_END_VISIT_FN);
        def_csetf(indexing_utilities.COMPINX_VISIT_PARAM, indexing_utilities._CSETF_COMPINX_VISIT_PARAM);
        identity(indexing_utilities.COMPLEX_INDEX_VISITOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), indexing_utilities.$dtp_complex_index_visitor$.getGlobalValue(), symbol_function(indexing_utilities.VISIT_DEFSTRUCT_OBJECT_COMPLEX_INDEX_VISITOR_METHOD));
        note_funcall_helper_function(indexing_utilities.NOTE_PRECACHE_TERM);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        indexing_utilities.declare_indexing_utilities_file();
    }

    @Override
    public void initializeVariables() {
        indexing_utilities.init_indexing_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        indexing_utilities.setup_indexing_utilities_file();
    }

    static {
    }

    public static final class $complex_index_visitor_native extends SubLStructNative {
        public SubLObject $begin_subindex_fn;

        public SubLObject $end_subindex_fn;

        public SubLObject $note_final_index_fn;

        public SubLObject $begin_visit_fn;

        public SubLObject $end_visit_fn;

        public SubLObject $param;

        private static final SubLStructDeclNative structDecl;

        public $complex_index_visitor_native() {
            this.$begin_subindex_fn = Lisp.NIL;
            this.$end_subindex_fn = Lisp.NIL;
            this.$note_final_index_fn = Lisp.NIL;
            this.$begin_visit_fn = Lisp.NIL;
            this.$end_visit_fn = Lisp.NIL;
            this.$param = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$begin_subindex_fn;
        }

        @Override
        public SubLObject getField3() {
            return this.$end_subindex_fn;
        }

        @Override
        public SubLObject getField4() {
            return this.$note_final_index_fn;
        }

        @Override
        public SubLObject getField5() {
            return this.$begin_visit_fn;
        }

        @Override
        public SubLObject getField6() {
            return this.$end_visit_fn;
        }

        @Override
        public SubLObject getField7() {
            return this.$param;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$begin_subindex_fn = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$end_subindex_fn = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$note_final_index_fn = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$begin_visit_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$end_visit_fn = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$param = value;
        }

        static {
            structDecl = makeStructDeclNative(indexing_utilities.$complex_index_visitor_native.class, indexing_utilities.COMPLEX_INDEX_VISITOR, indexing_utilities.COMPLEX_INDEX_VISITOR_P, indexing_utilities.$list16, indexing_utilities.$list17, new String[]{ "$begin_subindex_fn", "$end_subindex_fn", "$note_final_index_fn", "$begin_visit_fn", "$end_visit_fn", "$param" }, indexing_utilities.$list18, indexing_utilities.$list19, indexing_utilities.PRINT_COMPLEX_INDEX_VISITOR);
        }
    }

    public static final class $complex_index_visitor_p$UnaryFunction extends UnaryFunction {
        public $complex_index_visitor_p$UnaryFunction() {
            super(extractFunctionNamed("COMPLEX-INDEX-VISITOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return indexing_utilities.complex_index_visitor_p(arg1);
        }
    }
}

/**
 * Total time: 696 ms
 */
