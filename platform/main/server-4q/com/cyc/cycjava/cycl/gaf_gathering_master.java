/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.inference_iterators;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.quirk.search_engine;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      GAF-GATHERING-MASTER
 *  source file: /cyc/top/cycl/gaf-gathering-master.lisp
 *  created:     2019/07/03 17:38:58
 */
public final class gaf_gathering_master extends SubLTranslatedFile implements V02 {
    // // Constructor
    private gaf_gathering_master() {
    }

    public static final SubLFile me = new gaf_gathering_master();


    // // Definitions
    /**
     * Facts are to be gathered for this instance/collection/list of instances.
     */
    // defparameter
    private static final SubLSymbol $gg_focus$ = makeSymbol("*GG-FOCUS*");

    /**
     * The type (a keyword) of *GG-FOCUS*.  It can be one of the following:
     * - :instance -> find facts for the term itself
     * - :col -> find facts for the instances of this collection
     * - :list -> find facts for the members of this list
     */
    // defparameter
    private static final SubLSymbol $gg_focus_type$ = makeSymbol("*GG-FOCUS-TYPE*");

    /**
     * The list of the methods (KBQ collections) that should be used to generate the
     * partial sentences within KAGs.  Allowed methods are:
     * :fet -> using FET templates
     * :fact-sheet -> using Fact Sheets
     * :wsd-rules -> using word-sense disambiguation rules
     * :ner -> using predicates marked to be used in NER experiments
     * If NIL, then the SubL method developed by Steve Reed will be used
     */
    // defparameter
    private static final SubLSymbol $gg_psg_methods$ = makeSymbol("*GG-PSG-METHODS*");

    /**
     * Returns the value of *GG-PSG-METHODS*
     */
    public static final SubLObject get_gg_psg_methods() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $gg_psg_methods$.getDynamicValue(thread);
        }
    }

    /**
     * Checks if METHOD is a partial sentence generation method.
     */
    public static final SubLObject gg_psg_method_p(SubLObject method) {
        return subl_promotions.memberP(method, $list_alt0, symbol_function(EQ), UNPROVIDED);
    }

    /**
     * Sets the value of *GG-PSG-METHODS* to METHODS.  The current *KAG-ITERATOR*
     * also gets finalized.  The *FACT-GATHERING-PROCESS* is set to NIL.
     */
    public static final SubLObject set_gg_psg_methods(SubLObject v_methods) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = v_methods;
                SubLObject method = NIL;
                for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(method, GG_PSG_METHOD_P);
                }
            }
            $gg_psg_methods$.setDynamicValue(v_methods, thread);
            finalize_kag_iterator();
            $fact_gathering_process$.setDynamicValue(NIL, thread);
            return $gg_psg_methods$.getDynamicValue(thread);
        }
    }

    /**
     * Returns a string that would represent *GG-PSG-METHODS*
     */
    public static final SubLObject gg_psg_methods_string() {
        {
            SubLObject psg_methods = get_gg_psg_methods();
            SubLObject psg_methods_string = NIL;
            SubLObject psg_method_strings = NIL;
            if (NIL == psg_methods) {
                return $str_alt2$SubL_procedure_that_heuristically;
            }
            {
                SubLObject cdolist_list_var = get_gg_psg_methods();
                SubLObject psg_method = NIL;
                for (psg_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , psg_method = cdolist_list_var.first()) {
                    {
                        SubLObject pcase_var = psg_method;
                        if (pcase_var.eql($FET)) {
                            psg_method_strings = cons($str_alt4$KB_Queries_that_compute_the_KAGs_, psg_method_strings);
                        } else
                            if (pcase_var.eql($FACT_SHEET)) {
                                psg_method_strings = cons($str_alt6$KB_Queries_that_compute_the_KAGs_, psg_method_strings);
                            } else
                                if (pcase_var.eql($WSD_RULES)) {
                                    psg_method_strings = cons($str_alt8$KB_Queries_that_compute_the_KAGs_, psg_method_strings);
                                } else
                                    if (pcase_var.eql($WSD_RULES)) {
                                        psg_method_strings = cons($str_alt9$KB_Queries_that_compute_the_KAGs_, psg_method_strings);
                                    }



                    }
                }
            }
            if (NIL != psg_method_strings) {
                psg_methods_string = psg_method_strings.first();
            }
            {
                SubLObject cdolist_list_var = psg_method_strings.rest();
                SubLObject psg_method_string = NIL;
                for (psg_method_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , psg_method_string = cdolist_list_var.first()) {
                    psg_methods_string = cconcatenate(format_nil.format_nil_a_no_copy(psg_methods_string), new SubLObject[]{ $str_alt10$__and_, format_nil.format_nil_a_no_copy(psg_method_string) });
                }
            }
            return psg_methods_string;
        }
    }

    /**
     * The name of the current instance of #$CycBasedFactGatheringProcess.
     */
    // defparameter
    private static final SubLSymbol $fact_gathering_process_name$ = makeSymbol("*FACT-GATHERING-PROCESS-NAME*");

    public static final SubLObject get_fact_gathering_process_name() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $fact_gathering_process_name$.getDynamicValue(thread);
        }
    }

    public static final SubLObject set_fact_gathering_process_name(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(name, STRINGP);
            $fact_gathering_process_name$.setDynamicValue(name, thread);
            return $fact_gathering_process_name$.getDynamicValue(thread);
        }
    }

    /**
     * The current instance of #$CycBasedFactGatheringProcess.
     */
    // defparameter
    private static final SubLSymbol $fact_gathering_process$ = makeSymbol("*FACT-GATHERING-PROCESS*");

    /**
     * The string that would be asserted as the #$comment for
     * FACT-GATHERING-PROCESS*.
     */
    // defparameter
    public static final SubLSymbol $fact_gathering_process_comment$ = makeSymbol("*FACT-GATHERING-PROCESS-COMMENT*");

    /**
     * Lazily creates a unique #$CycBasedFactGatheringProcess-NNN constant.
     * Asserts
     * - (#$isa #$CycBasedFactGatheringProcess-NNN #$CycBasedFactGatheringProcess)
     * - (#$dateOfEvent #$CycBasedFactGatheringProcess-NNN DATE) where DATE is the
     * current date and time.
     * - (#$comment #$CycBasedFactGatheringProcess-NNN COMMENT) where COMMENT is
     * created using *FACT-GATHERING-PROCESS-COMMENT* and other info like
     * GG-PSG-METHODS*, KB number and System number.
     * and makes *FACT-GATHERING-PROCESS* point to
     * #$CycBasedFactGatheringProcess-NNN.
     */
    public static final SubLObject gg_assert_fact_gathering_process() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $fact_gathering_process_name$.getDynamicValue(thread)) {
                $fact_gathering_process$.setDynamicValue(list($const12$CycBasedFactGatheringProcessNamed, $fact_gathering_process_name$.getDynamicValue(thread)), thread);
            } else {
                $fact_gathering_process$.setDynamicValue(generate_gafs.gg_create_unique($$$CycBasedFactGatheringProcess, UNPROVIDED, UNPROVIDED), thread);
                SubLTrampolineFile.checkType($fact_gathering_process$.getDynamicValue(thread), FORT_P);
            }
            generate_gafs.gg_assert(listS($$isa, $fact_gathering_process$.getDynamicValue(thread), $list_alt16), UNPROVIDED, UNPROVIDED);
            generate_gafs.gg_assert(list($$startingDate, $fact_gathering_process$.getDynamicValue(thread), date_utilities.extended_universal_date_to_cycl_date(numeric_date_utilities.get_extended_universal_date(UNPROVIDED))), UNPROVIDED, UNPROVIDED);
            {
                SubLObject comment = cconcatenate($str_alt18$An_instance_of___CycBasedFactGath, new SubLObject[]{ format_nil.format_nil_a_no_copy(gg_psg_methods_string()), $str_alt19$___This_fact_gathering_process_wa, format_nil.format_nil_a_no_copy(control_vars.kb_loaded()), $str_alt20$_and_System_, format_nil.format_nil_a_no_copy(system_info.cyc_revision_string()), $str_alt21$__, format_nil.format_nil_a_no_copy(NIL != $fact_gathering_process_comment$.getDynamicValue(thread) ? ((SubLObject) ($fact_gathering_process_comment$.getDynamicValue(thread))) : $str_alt22$) });
                generate_gafs.gg_assert(list($$comment, $fact_gathering_process$.getDynamicValue(thread), comment), UNPROVIDED, UNPROVIDED);
            }
            return $DONE;
        }
    }

    /**
     * the KAG iterator maintained by the master Cyc server
     */
    // deflexical
    private static final SubLSymbol $kag_iterator$ = makeSymbol("*KAG-ITERATOR*");

    /**
     * Initializes the KAG iterator.
     */
    public static final SubLObject initialize_kag_iterator() {
        $kag_iterator$.setGlobalValue(new_kag_iterator());
        return $kag_iterator$.getGlobalValue();
    }

    /**
     * Finalizes the KAG iterator.
     */
    public static final SubLObject finalize_kag_iterator() {
        if (NIL != $kag_iterator$.getGlobalValue()) {
            iteration.iteration_finalize($kag_iterator$.getGlobalValue());
            $kag_iterator$.setGlobalValue(NIL);
        }
        return $kag_iterator$.getGlobalValue();
    }

    /**
     * the KAG iterator lock object
     */
    // deflexical
    private static final SubLSymbol $gg_kag_iterator_lock$ = makeSymbol("*GG-KAG-ITERATOR-LOCK*");

    // deflexical
    private static final SubLSymbol $gg_callers_count$ = makeSymbol("*GG-CALLERS-COUNT*");

    /**
     * Returns the next KAG or NIL if the workflow is exhausted.
     */
    public static final SubLObject get_next_kag_for_gathering(SubLObject worker_host, SubLObject worker_port) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(worker_host, STRINGP);
            SubLTrampolineFile.checkType(worker_port, INTEGERP);
            {
                SubLObject kag = NIL;
                SubLObject iterator_result = NIL;
                {
                    SubLObject _prev_bind_0 = generate_gafs.$gg_status_message_stream$.currentBinding(thread);
                    try {
                        generate_gafs.$gg_status_message_stream$.bind(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread), thread);
                        {
                            SubLObject lock = $gg_kag_iterator_lock$.getGlobalValue();
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock);
                                $gg_callers_count$.setGlobalValue(add($gg_callers_count$.getGlobalValue(), ONE_INTEGER));
                                if (NIL == $fact_gathering_process$.getDynamicValue(thread)) {
                                    gg_assert_fact_gathering_process();
                                }
                                if ($gg_focus_type$.getDynamicValue(thread) == $INSTANCE) {
                                    kag = generate_gafs.new_kag($gg_focus$.getDynamicValue(thread), NIL, $fact_gathering_process$.getDynamicValue(thread), get_gg_psg_methods());
                                } else {
                                    if (NIL == $kag_iterator$.getGlobalValue()) {
                                        initialize_kag_iterator();
                                    }
                                    iterator_result = (NIL != iteration.iteration_done($kag_iterator$.getGlobalValue())) ? ((SubLObject) (NIL)) : iteration.iteration_next($kag_iterator$.getGlobalValue());
                                    if (NIL != iterator_result) {
                                        if ($gg_focus_type$.getDynamicValue(thread) == $COL) {
                                            kag = generate_gafs.new_kag(bindings.variable_lookup($sym29$_X, iterator_result), NIL, $fact_gathering_process$.getDynamicValue(thread), get_gg_psg_methods());
                                        } else
                                            if ($gg_focus_type$.getDynamicValue(thread) == $LIST) {
                                                kag = generate_gafs.new_kag(iterator_result, NIL, $fact_gathering_process$.getDynamicValue(thread), get_gg_psg_methods());
                                            } else
                                                if (NIL == get_gg_psg_methods()) {
                                                    kag = generate_gafs.new_kag(iterator_result, NIL, $fact_gathering_process$.getDynamicValue(thread), UNPROVIDED);
                                                } else {
                                                    {
                                                        SubLObject pred = bindings.variable_lookup($sym31$_OPER, iterator_result);
                                                        SubLObject value = bindings.variable_lookup($sym32$_VAL, iterator_result);
                                                        SubLObject var_pos = bindings.variable_lookup($sym33$_VAR_POS, iterator_result);
                                                        SubLObject constraining_collection = bindings.variable_lookup($sym34$_TYPE, iterator_result);
                                                        SubLObject partial_gaf = NIL;
                                                        SubLObject pcase_var = var_pos;
                                                        if (pcase_var.eql(ONE_INTEGER)) {
                                                            partial_gaf = list(pred, $sym29$_X, value);
                                                        } else
                                                            if (pcase_var.eql(TWO_INTEGER)) {
                                                                partial_gaf = list(pred, value, $sym29$_X);
                                                            } else {
                                                                write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                                write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                                format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt36$Invalid_variable_position___S_for, var_pos);
                                                                force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                                                            }

                                                        kag = generate_gafs.new_kag(partial_gaf, constraining_collection, $fact_gathering_process$.getDynamicValue(thread), UNPROVIDED);
                                                    }
                                                }


                                    }
                                }
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock);
                                }
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!$gg_callers_count$.getGlobalValue().eql(ONE_INTEGER)) {
                                    Errors.error($str_alt37$gaf_gathering_lock_problem);
                                }
                            }
                            $gg_callers_count$.setGlobalValue(subtract($gg_callers_count$.getGlobalValue(), ONE_INTEGER));
                            if (!worker_host.equal($$$localhost)) {
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt39$Dispatched__A_to__A__A__, new SubLObject[]{ kag, worker_host, worker_port });
                                force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                            }
                        }
                    } finally {
                        generate_gafs.$gg_status_message_stream$.rebind(_prev_bind_0, thread);
                    }
                }
                return kag;
            }
        }
    }

    /**
     * Returns a list of inference iterators that were created using the instances
     * of the input collection of KBQs.
     *
     * @param KBQ-COL
     * 		collection-p
     * @return listp; of inference-iterators
     */
    public static final SubLObject gg_inference_iterators_from_kbq_col(SubLObject kbq_col) {
        {
            SubLObject iterators = NIL;
            SubLObject cdolist_list_var = isa.all_fort_instances(kbq_col, UNPROVIDED, UNPROVIDED);
            SubLObject kbq = NIL;
            for (kbq = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kbq = cdolist_list_var.first()) {
                {
		    SubLObject inference = kb_query.new_continuable_inference_from_kbq(kbq, UNPROVIDED, UNPROVIDED);
                    SubLObject kbq_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(kb_query.kbq_query_properties(kbq));
                    SubLObject iterator = inference_iterators.new_inference_iterator(inference, kbq_dynamic_properties, DESTROY_INFERENCE_AND_PROBLEM_STORE);
                    iterators = cons(iterator, iterators);
                }
            }
            return iterators;
        }
    }

    /**
     * Returns an iterator over KAGs.
     */
    public static final SubLObject new_kag_iterator() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iterator = NIL;
                if ($gg_focus_type$.getDynamicValue(thread) == $COL) {
                    iterator = inference_iterators.new_inference_iterator(inference_kernel.new_continuable_inference(list($$isa, $sym29$_X, $gg_focus$.getDynamicValue(thread)), $$InferencePSC, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                } else
                    if ($gg_focus_type$.getDynamicValue(thread) == $LIST) {
                        iterator = iteration.new_list_iterator($gg_focus$.getDynamicValue(thread));
                    } else
                        if (NIL == get_gg_psg_methods()) {
                            {
                                SubLObject predicates = get_predicates_for_nl_gathering(UNPROVIDED);
                                write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt42$Iterating_over_predicates___A__, predicates);
                                force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                                iterator = iteration.new_rotating_iterator_iterator(Mapping.mapcar(symbol_function(NEW_PARTIAL_GAF_ARG_ITERATOR), predicates));
                            }
                        } else {
                            {
                                SubLObject iterators = NIL;
                                SubLObject cdolist_list_var = get_gg_psg_methods();
                                SubLObject psg_method = NIL;
                                for (psg_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , psg_method = cdolist_list_var.first()) {
                                    {
                                        SubLObject tmp_iterators = NIL;
                                        SubLObject pcase_var = psg_method;
                                        if (pcase_var.eql($FET)) {
                                            tmp_iterators = gg_inference_iterators_from_kbq_col($$FactGatheringPSQ_FETTemplateBased);
                                        } else
                                            if (pcase_var.eql($WSD_RULES)) {
                                                tmp_iterators = gg_inference_iterators_from_kbq_col($const45$FactGatheringPSQ_WordSenseDisambi);
                                            } else
                                                if (pcase_var.eql($NER)) {
                                                    tmp_iterators = gg_inference_iterators_from_kbq_col($$FactGatheringPSQ_ForNERExperiment);
                                                } else
                                                    if (pcase_var.eql($FACT_SHEET)) {
                                                        tmp_iterators = gg_inference_iterators_from_kbq_col($$FactGatheringPSQ_FactSheetBased);
                                                    } else {
                                                        write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                        write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                        format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt49$Invalid_PSG_method___A__, psg_method);
                                                        force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                                                    }



                                        iterators = union(iterators, tmp_iterators, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                iterator = iteration.new_rotating_iterator_iterator(iterators);
                            }
                        }


                if (NIL != iterator) {
                    SubLTrampolineFile.checkType(iterator, ITERATOR_P);
                }
                return iterator;
            }
        }
    }

    /**
     *
     *
     * @unknown LIST: a list of predicates suitable for forming partially-bound GAFS
    for search.
     */
    public static final SubLObject get_predicates_for_nl_gathering(SubLObject paraphrase_mt) {
        if (paraphrase_mt == UNPROVIDED) {
            paraphrase_mt = generate_gafs.gaf_gathering_paraphrase_mt();
        }
        if (NIL != generate_gafs.$specified_predicates_for_nl_gathering$.getGlobalValue()) {
            return generate_gafs.$specified_predicates_for_nl_gathering$.getGlobalValue();
        }
        {
            SubLObject designated_gaf_gathering_preds = isa.all_fort_instances($const51$FactFactoryGatheredGAFVerificatio, $$InferencePSC, UNPROVIDED);
            SubLObject return_preds = NIL;
            SubLObject cdolist_list_var = designated_gaf_gathering_preds;
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                if (((arity.arity(pred) == TWO_INTEGER) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(pred, $$genTemplate, paraphrase_mt, UNPROVIDED, UNPROVIDED))) && min_generated_phrase_words_for_pred(pred, paraphrase_mt).numLE(TEN_INTEGER)) {
                    {
                        SubLObject item_var = pred;
                        if (NIL == member(item_var, return_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                            return_preds = cons(item_var, return_preds);
                        }
                    }
                }
            }
            return list_utilities.randomize_list(return_preds);
        }
    }

    /**
     * Returns the minimum number of generated phrase words for the given binary predicate PRED,
     * in the given PARAPHRASE-MT.
     */
    public static final SubLObject min_generated_phrase_words_for_pred(SubLObject pred, SubLObject paraphrase_mt) {
        SubLTrampolineFile.checkType(pred, FORT_P);
        {
            SubLObject min_number_of_phrase_words = $most_positive_fixnum$.getGlobalValue();
            SubLObject sentence = list(pred, $sym53$_ARG1, $sym54$_ARG);
	    SubLObject phrases = pph_methods_lexicon.all_phrases_for_formula(sentence, paraphrase_mt, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = phrases;
            SubLObject phrase = NIL;
            for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                {
                    SubLObject number_of_words_in_phrase = string_utilities.number_of_words(phrase);
                    if (number_of_words_in_phrase.numL(min_number_of_phrase_words)) {
                        min_number_of_phrase_words = number_of_words_in_phrase;
                    }
                }
            }
            return min_number_of_phrase_words;
        }
    }

    /**
     * Returns an iterator over partial gafs with the given PREDICATE.
     */
    public static final SubLObject new_partial_gaf_arg_iterator(SubLObject predicate) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        {
            SubLObject iterator = iteration.new_lazy_iterator(symbol_function(NEW_ROTATING_ITERATOR_ITERATOR), list(list(LIST, listS(NEW_PARTIAL_GAF_ARG_BINDING_ITERATOR, predicate, $list_alt58), listS(NEW_PARTIAL_GAF_ARG_BINDING_ITERATOR, predicate, $list_alt59))));
            SubLTrampolineFile.checkType(iterator, ITERATOR_P);
            return iterator;
        }
    }

    /**
     * Returns an iterator over partial gafs with the given PREDICATE and ARGPOS.
     */
    public static final SubLObject new_partial_gaf_arg_binding_iterator(SubLObject predicate, SubLObject argpos) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(argpos, INTEGERP);
        {
            SubLObject iterator = iteration.new_lazy_iterator(symbol_function(NEW_ITERATOR_ITERATOR), list(list(MAKE_PARTIAL_GAF_ARG_BINDING_ITERATORS, predicate, argpos)));
            SubLTrampolineFile.checkType(iterator, ITERATOR_P);
            return iterator;
        }
    }

    /**
     * Returns the list of iterators for constraining collections over partial gafs with the given PREDICATE and ARGPOS.
     */
    public static final SubLObject make_partial_gaf_arg_binding_iterators(SubLObject predicate, SubLObject argpos) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(argpos, INTEGERP);
        {
            SubLObject appropriate_arg_constraints = get_appropriate_arg_constraints_for_pred(predicate, argpos, $$MachineLearningSpindleHeadMt);
            SubLObject iterators = NIL;
            SubLObject iterator = NIL;
            SubLObject cdolist_list_var = appropriate_arg_constraints;
            SubLObject appropriate_arg_constraint = NIL;
            for (appropriate_arg_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , appropriate_arg_constraint = cdolist_list_var.first()) {
                {
                    SubLObject datum = appropriate_arg_constraint;
                    SubLObject current = datum;
                    SubLObject type = NIL;
                    SubLObject constraining_collection = NIL;
                    SubLObject asserted_count = NIL;
                    SubLObject total_count = NIL;
                    SubLObject ratio = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt63);
                    type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt63);
                    constraining_collection = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt63);
                    asserted_count = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt63);
                    total_count = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt63);
                    ratio = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        iterator = new_partial_gaf_arg_binding_constraint_iterator(predicate, argpos, constraining_collection, type);
                        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
                        iterators = cons(iterator, iterators);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt63);
                    }
                }
            }
            return nreverse(iterators);
        }
    }

    /**
     * Computes an ordered list of collections from which likely arg bindings for PRED
     * at argument position POS can be selected.  The keyword :SPECS indicates that
     * specs of the collection are candidate arg bindings, and the keyword :INSTANCES
     * indicates that instances of the collection are candidate arg bindings.
     *
     * @param pred:
     * 		the predicate we want a constraint for
     * 		param pos: the position we want constrained (1 or 2, because these
     * 		are binary predicates
     * @unknown an ordered list with each element of the form:
    [:SPEC | :INSTANCE] <collection> <total> <ratio>.
     */
    public static final SubLObject get_appropriate_arg_constraints_for_pred(SubLObject pred, SubLObject pos, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pred, FORT_P);
            SubLTrampolineFile.checkType(pos, INTEGERP);
            SubLTrampolineFile.checkType(mt, HLMT_P);
            {
                SubLObject results_list = NIL;
                SubLObject genls_onlyP = gg_reln_type_level_in_argP(pred, pos, mt);
                SubLObject assertions = NIL;
                SubLObject gathered_term = NIL;
                SubLObject gathered_individual_terms = NIL;
                SubLObject gathered_collection_terms = NIL;
                SubLObject arg_isa = generate_gafs.noun_learner_arg_isa_for_pred(pred, pos, mt);
                SubLObject arg_genls = (NIL != genls_onlyP) ? ((SubLObject) (generate_gafs.noun_learner_arg_genls_for_pred(pred, pos, mt))) : NIL;
                SubLObject candidate_isas = NIL;
                SubLObject candidate_genls = NIL;
                SubLObject results_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        assertions = kb_mapping.gather_predicate_extent_index(pred, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        gathered_term = assertions_high.gaf_arg(assertion, pos);
                        if (NIL != fort_types_interface.collectionP(gathered_term)) {
                            {
                                SubLObject item_var = gathered_term;
                                if (NIL == member(item_var, gathered_collection_terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    gathered_collection_terms = cons(item_var, gathered_collection_terms);
                                }
                            }
                        } else {
                            if (NIL == genls_onlyP) {
                                {
                                    SubLObject item_var = gathered_term;
                                    if (NIL == member(item_var, gathered_individual_terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        gathered_individual_terms = cons(item_var, gathered_individual_terms);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = gathered_individual_terms;
                    SubLObject gathered_individual_term = NIL;
                    for (gathered_individual_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gathered_individual_term = cdolist_list_var.first()) {
                        {
                            SubLObject all_isas = isa.all_isa_in_any_mt(gathered_individual_term);
                            SubLObject cdolist_list_var_1 = all_isas;
                            SubLObject v_isa = NIL;
                            for (v_isa = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , v_isa = cdolist_list_var_1.first()) {
                                if (NIL != genls.specP(arg_isa, v_isa, mt, UNPROVIDED)) {
                                    {
                                        SubLObject item_var = v_isa;
                                        if (NIL == member(item_var, candidate_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            candidate_isas = cons(item_var, candidate_isas);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = gathered_collection_terms;
                    SubLObject gathered_collection_term = NIL;
                    for (gathered_collection_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gathered_collection_term = cdolist_list_var.first()) {
                        {
                            SubLObject all_isas = isa.all_isa_in_any_mt(gathered_collection_term);
                            SubLObject cdolist_list_var_2 = all_isas;
                            SubLObject v_isa = NIL;
                            for (v_isa = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , v_isa = cdolist_list_var_2.first()) {
                                if ((NIL != genls.specP(arg_isa, v_isa, mt, UNPROVIDED)) && ((NIL == arg_genls) || (NIL != genls.specP(arg_genls, v_isa, mt, UNPROVIDED)))) {
                                    {
                                        SubLObject item_var = v_isa;
                                        if (NIL == member(item_var, candidate_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            candidate_isas = cons(item_var, candidate_isas);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = gathered_collection_terms;
                    SubLObject gathered_collection_term = NIL;
                    for (gathered_collection_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gathered_collection_term = cdolist_list_var.first()) {
                        {
                            SubLObject all_genls = genls.all_genls_in_any_mt(gathered_collection_term);
                            SubLObject cdolist_list_var_3 = all_genls;
                            SubLObject genl = NIL;
                            for (genl = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , genl = cdolist_list_var_3.first()) {
                                if (NIL != genls.specP(arg_genls, genl, mt, UNPROVIDED)) {
                                    {
                                        SubLObject item_var = genl;
                                        if (NIL == member(item_var, candidate_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            candidate_genls = cons(item_var, candidate_genls);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = candidate_isas;
                    SubLObject candidate_isa = NIL;
                    for (candidate_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_isa = cdolist_list_var.first()) {
                        {
                            SubLObject total_instances_count = cardinality_estimates.instance_cardinality(candidate_isa);
                            SubLObject asserted_instances_count = NIL;
                            SubLObject key = list($INSTANCES, candidate_isa);
                            if (!((NIL != dictionary.dictionary_lookup(results_dictionary, key, UNPROVIDED)) || (total_instances_count == ZERO_INTEGER))) {
                                {
                                    SubLObject ignore_errors_tag = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                            asserted_instances_count = length(isa.all_instances_among(candidate_isa, gathered_individual_terms, UNPROVIDED, UNPROVIDED));
                                                        } finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                    if (asserted_instances_count != total_instances_count) {
                                                        dictionary.dictionary_enter(results_dictionary, key, list(asserted_instances_count, total_instances_count, divide(asserted_instances_count, total_instances_count)));
                                                    }
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
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = candidate_genls;
                    SubLObject candidate_genl = NIL;
                    for (candidate_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_genl = cdolist_list_var.first()) {
                        {
                            SubLObject total_specs_count = genls.count_all_specs(candidate_genl, UNPROVIDED, UNPROVIDED);
                            SubLObject asserted_specs_count = NIL;
                            SubLObject key = list($SPECS, candidate_genl);
                            if (NIL == dictionary.dictionary_lookup(results_dictionary, key, UNPROVIDED)) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (!total_specs_count.numG(ZERO_INTEGER)) {
                                        Errors.error($str_alt71$total_specs_count_of__A_must_be_g, candidate_genl);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        asserted_specs_count = length(genls.all_specs_among(candidate_genl, gathered_collection_terms, UNPROVIDED, UNPROVIDED));
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (asserted_specs_count != total_specs_count) {
                                    dictionary.dictionary_enter(results_dictionary, key, list(asserted_specs_count, total_specs_count, divide(asserted_specs_count, total_specs_count)));
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(results_dictionary));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject type = key.first();
                                SubLObject constraining_collection = second(key);
                                SubLObject asserted_count = value.first();
                                SubLObject total_count = second(value);
                                SubLObject ratio = third(value);
                                results_list = cons(list(type, constraining_collection, asserted_count, total_count, ratio), results_list);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                results_list = Sort.sort(results_list, symbol_function($sym72$_), symbol_function(FIFTH));
                return results_list;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is RELN type-level in ARGNUM?
     */
    public static final SubLObject gg_reln_type_level_in_argP(SubLObject reln, SubLObject argnum, SubLObject mt) {
        return list_utilities.sublisp_boolean(find($$SetOrCollection, kb_accessors.argn_isa(reln, argnum, mt), $sym75$SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Returns an iterator over partial gafs with the given PREDICATE, ARGPOS,
     * CONSTRAINING-COLLECTION and TYPE.
     */
    public static final SubLObject new_partial_gaf_arg_binding_constraint_iterator(SubLObject predicate, SubLObject argpos, SubLObject constraining_collection, SubLObject type) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(argpos, INTEGERP);
        SubLTrampolineFile.checkType(constraining_collection, FORT_P);
        SubLTrampolineFile.checkType(type, SYMBOLP);
        {
            SubLObject iterator = iteration.new_lazy_iterator(symbol_function(NEW_LIST_ITERATOR), list(list(GG_GET_PARTIAL_GAF_ARG_BINDINGS, predicate, argpos, constraining_collection, type)));
            SubLTrampolineFile.checkType(iterator, ITERATOR_P);
            return iterator;
        }
    }

    /**
     * Returns untried ARGPOS arg-bindings for the partial gaf having the given PREDICATE, returns nil if no
     * more can be returned.
     */
    public static final SubLObject gg_get_partial_gaf_arg_bindings(SubLObject predicate, SubLObject argpos, SubLObject constraining_collection, SubLObject type) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(argpos, INTEGERP);
        SubLTrampolineFile.checkType(constraining_collection, FORT_P);
        SubLTrampolineFile.checkType(type, SYMBOLP);
        {
            SubLObject unfiltered_arg_bindings = proposed_arg_bindings_of_type_for_collection(predicate, argpos, constraining_collection, type);
            SubLObject partial_gafs = NIL;
            SubLObject partial_gaf = NIL;
            SubLObject cdolist_list_var = unfiltered_arg_bindings;
            SubLObject unfiltered_arg_binding = NIL;
            for (unfiltered_arg_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unfiltered_arg_binding = cdolist_list_var.first()) {
                partial_gaf = (argpos == ONE_INTEGER) ? ((SubLObject) (listS(predicate, unfiltered_arg_binding, $list_alt79))) : list(predicate, $sym29$_X, unfiltered_arg_binding);
                if (NIL == tried_partial_gafP_internal(partial_gaf)) {
                    partial_gafs = cons(partial_gaf, partial_gafs);
                }
            }
            return nreverse(partial_gafs);
        }
    }

    /**
     * When TYPE is :instances return the list of CONSTRAINING-COLLECTION instantiations,
     * else return the list of specializations.
     */
    public static final SubLObject proposed_arg_bindings_of_type_for_collection(SubLObject predicate, SubLObject argpos, SubLObject constraining_collection, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            SubLTrampolineFile.checkType(argpos, INTEGERP);
            SubLTrampolineFile.checkType(constraining_collection, FORT_P);
            SubLTrampolineFile.checkType(type, SYMBOLP);
            if (type == $INSTANCES) {
                {
                    SubLObject v_instances = rkf_ontology_utilities.rkf_all_instantiations(constraining_collection, $$EverythingPSC);
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt80$Gathered__A_instance_arg_bindings, new SubLObject[]{ length(v_instances), constraining_collection, type, predicate, argpos });
                    force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                    return v_instances;
                }
            } else {
                {
                    SubLObject specializations = rkf_ontology_utilities.rkf_max_specs(constraining_collection, $$EverythingPSC);
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt81$Gathered__A_specialization_arg_bi, new SubLObject[]{ length(specializations), constraining_collection, type, predicate, argpos });
                    force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                    return specializations;
                }
            }
        }
    }

    /**
     * Find and assert GAFs that have members of PREDS as the arg0.
     */
    public static final SubLObject add_gafs_for_preds(SubLObject preds, SubLObject arg_positions, SubLObject arg_bindings, SubLObject num_arg_bindings, SubLObject paraphrase_mt) {
        if (arg_positions == UNPROVIDED) {
            arg_positions = $list_alt82;
        }
        if (arg_bindings == UNPROVIDED) {
            arg_bindings = NIL;
        }
        if (num_arg_bindings == UNPROVIDED) {
            num_arg_bindings = TWENTY_INTEGER;
        }
        if (paraphrase_mt == UNPROVIDED) {
            paraphrase_mt = generate_gafs.gaf_gathering_paraphrase_mt();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject current_wait_time = generate_gafs.floor_on_waiting_for_help();
                SubLObject partial_gafs = gg_partial_gafs(preds, arg_positions, arg_bindings, num_arg_bindings);
                SubLObject logfilename = cconcatenate($str_alt83$_cyc_projects_butler_GatheringFro, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str_alt84$_log });
                SubLObject google_server_timed_outP = NIL;
                SubLObject cdolist_list_var = partial_gafs;
                SubLObject partial_gaf = NIL;
                for (partial_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , partial_gaf = cdolist_list_var.first()) {
                    if (NIL == generate_gafs.google_server_upP()) {
                        current_wait_time = gg_handle_google_server_issue($SERVER_DOWN, current_wait_time);
                    } else {
                        if (NIL != google_server_timed_outP) {
                            current_wait_time = gg_handle_google_server_issue($TIME_OUT, current_wait_time);
                            google_server_timed_outP = NIL;
                        } else {
                            if (NIL == partial_gaf_previously_triedP(partial_gaf, logfilename, UNPROVIDED)) {
                                {
                                    SubLObject _prev_bind_0 = generate_gafs.$gaf_gathering_log_file$.currentBinding(thread);
                                    try {
                                        generate_gafs.$gaf_gathering_log_file$.bind(logfilename, thread);
                                        google_server_timed_outP = NIL;
                                        {
                                            SubLObject error = NIL;
                                            SubLObject error_message = NIL;
                                            try {
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_5 = Errors.$error_handler$.currentBinding(thread);
                                                        try {
                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                            try {
                                                                generate_gafs.add_gafs_using_text_corpus(partial_gaf, NIL, paraphrase_mt, T);
                                                            } catch (Throwable catch_var) {
                                                                Errors.handleThrowable(catch_var, NIL);
                                                            }
                                                        } finally {
                                                            Errors.$error_handler$.rebind(_prev_bind_0_5, thread);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                error = Errors.handleThrowable(ccatch_env_var, $GOOGLE_PROBLEM);
                                            }
                                            if (NIL != list_utilities.sublisp_boolean(error)) {
                                                {
                                                    SubLObject pcase_var = error;
                                                    if (pcase_var.eql($SERVER_ERROR)) {
                                                        write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                        write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                        format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt90$The_Google_server_timed_out___);
                                                        force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                                                        google_server_timed_outP = T;
                                                    } else {
                                                        write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                        write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                        format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt91$_We_received_Google_error__A_whil, error, partial_gaf);
                                                        force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                                                    }
                                                }
                                                current_wait_time = generate_gafs.floor_on_waiting_for_help();
                                            }
                                            if (error_message.isString()) {
                                                write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt92$Analyzing_the_partial_GAF__A_caus, partial_gaf, error_message);
                                                force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                                            }
                                        }
                                    } finally {
                                        generate_gafs.$gaf_gathering_log_file$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return logfilename;
            }
        }
    }

    /**
     * Display error message and wait for WAIT-TIME before resetting its value.
     */
    public static final SubLObject gg_handle_google_server_issue(SubLObject issue, SubLObject wait_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = NIL;
                SubLObject pcase_var = issue;
                if (pcase_var.eql($SERVER_DOWN)) {
                    message = $str_alt93$______HELP__Google_server_is_down;
                } else
                    if (pcase_var.eql($TIME_OUT)) {
                        message = $str_alt94$____Waiting__A_seconds_for_Google;
                    }

                write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), message, wait_time, search_engine.google_status());
                force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                sleep(wait_time);
                wait_time = generate_gafs.escalate_wait_time_between_searches(wait_time);
            }
            return wait_time;
        }
    }

    /**
     * Returns a list of incomplete/partial GAFs
     */
    public static final SubLObject gg_partial_gafs(SubLObject preds, SubLObject arg_positions, SubLObject arg_bindings, SubLObject num_arg_bindings) {
        if (arg_positions == UNPROVIDED) {
            arg_positions = $list_alt82;
        }
        if (arg_bindings == UNPROVIDED) {
            arg_bindings = NIL;
        }
        if (num_arg_bindings == UNPROVIDED) {
            num_arg_bindings = TWENTY_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt95$Working_with__A_predicate_and_arg, NIL != arg_bindings ? ((SubLObject) ($$$prepared)) : $str_alt97$code_determined);
            force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
            {
                SubLObject partial_gafs = NIL;
                SubLObject cdolist_list_var = preds;
                SubLObject pred = NIL;
                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_6 = arg_positions;
                        SubLObject arg_pos = NIL;
                        for (arg_pos = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , arg_pos = cdolist_list_var_6.first()) {
                            {
                                SubLObject arg_binds = (NIL != arg_bindings) ? ((SubLObject) (arg_bindings)) : proposed_arg_bindings_for_pred(pred, arg_pos, num_arg_bindings, UNPROVIDED, UNPROVIDED);
                                SubLObject cdolist_list_var_7 = arg_binds;
                                SubLObject arg_bind = NIL;
                                for (arg_bind = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , arg_bind = cdolist_list_var_7.first()) {
                                    {
                                        SubLObject partial_gaf = (arg_pos == ONE_INTEGER) ? ((SubLObject) (listS(pred, arg_bind, $list_alt79))) : list(pred, $sym29$_X, arg_bind);
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                if (NIL != wff.el_wffP(partial_gaf, UNPROVIDED, UNPROVIDED)) {
                                                    {
                                                        SubLObject item_var = partial_gaf;
                                                        if (NIL == member(item_var, partial_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            partial_gafs = cons(item_var, partial_gafs);
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
                            }
                        }
                    }
                }
                return partial_gafs;
            }
        }
    }

    // defparameter
    private static final SubLSymbol $gg_bad_arg_colls$ = makeSymbol("*GG-BAD-ARG-COLLS*");

    /**
     * the indicator that candidate arg bindings should be ranked according to the
     * number of existing assertions containing the term - too expensive for large sets.
     */
    // defparameter
    public static final SubLSymbol $gg_should_rank_arg_bindingsP$ = makeSymbol("*GG-SHOULD-RANK-ARG-BINDINGS?*");

    /**
     * Returns up to the NUM most likely arg bindings for PRED at argument position POS.
     */
    public static final SubLObject proposed_arg_bindings_for_pred(SubLObject pred, SubLObject pos, SubLObject num, SubLObject mt, SubLObject show_resultsP) {
        if (num == UNPROVIDED) {
            num = number_utilities.positive_infinity();
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        if (show_resultsP == UNPROVIDED) {
            show_resultsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                SubLObject doneP = NIL;
                if (NIL == subl_promotions.memberP(generate_gafs.noun_learner_arg_isa_for_pred(pred, pos, mt), $gg_bad_arg_colls$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    if (NIL != show_resultsP) {
                        write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt99$__Determining_appropriate_arg_A_c, pos, pred);
                        force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                    }
                    {
                        SubLObject appropriate_arg_constraints = get_appropriate_arg_constraints_for_pred(pred, pos, mt);
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = appropriate_arg_constraints;
                                SubLObject appropriate_arg_constraint = NIL;
                                for (appropriate_arg_constraint = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , appropriate_arg_constraint = csome_list_var.first()) {
                                    if (NIL == doneP) {
                                        {
                                            SubLObject csome_list_var_8 = proposed_arg_bindings_for_arg_constraint(appropriate_arg_constraint, num, mt);
                                            SubLObject partial_result = NIL;
                                            for (partial_result = csome_list_var_8.first(); !((NIL != doneP) || (NIL == csome_list_var_8)); csome_list_var_8 = csome_list_var_8.rest() , partial_result = csome_list_var_8.first()) {
                                                {
                                                    SubLObject item_var = partial_result;
                                                    if (NIL == member(item_var, results, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        results = cons(item_var, results);
                                                    }
                                                }
                                                doneP = number_utilities.potentially_infinite_integer_GE(length(results), num);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(results);
            }
        }
    }

    /**
     * Returns up to NUM possible candidates from APPROPRIATE-ARG-CONSTRAINT.
     */
    public static final SubLObject proposed_arg_bindings_for_arg_constraint(SubLObject appropriate_arg_constraint, SubLObject num, SubLObject mt) {
        if (num == UNPROVIDED) {
            num = number_utilities.positive_infinity();
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = appropriate_arg_constraint.first();
                SubLObject constraining_collection = second(appropriate_arg_constraint);
                SubLObject total_count = fourth(appropriate_arg_constraint);
                SubLObject results = NIL;
                SubLObject pcase_var = type;
                if (pcase_var.eql($INSTANCES)) {
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt100$__Gathering_instance_level_propos, constraining_collection, total_count);
                    force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                    if (NIL != $gg_should_rank_arg_bindingsP$.getDynamicValue(thread)) {
                        {
                            SubLObject max_count = (NIL != number_utilities.positive_infinity_p(num)) ? ((SubLObject) ($most_positive_fixnum$.getGlobalValue())) : num;
                            SubLObject max_instances_to_sort = (NIL != number_utilities.positive_infinity_p(num)) ? ((SubLObject) ($most_positive_fixnum$.getGlobalValue())) : multiply($int$100, num);
                            results = rkf_ontology_utilities.rkf_salient_instantiation_exemplars(constraining_collection, mt, max_count, max_instances_to_sort);
                        }
                    } else {
                        results = rkf_ontology_utilities.rkf_all_instantiations(constraining_collection, mt);
                    }
                } else {
                    write_string(numeric_date_utilities.timestring(UNPROVIDED), generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt35$_, generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    format(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread), $str_alt102$__Gathering_type_level_proposed_a, constraining_collection, total_count);
                    force_output(generate_gafs.$gg_status_message_stream$.getDynamicValue(thread));
                    if (NIL != $gg_should_rank_arg_bindingsP$.getDynamicValue(thread)) {
                        {
                            SubLObject max_count = (NIL != number_utilities.positive_infinity_p(num)) ? ((SubLObject) ($most_positive_fixnum$.getGlobalValue())) : num;
                            results = rkf_ontology_utilities.rkf_salient_specialization_exemplars(constraining_collection, mt, max_count);
                        }
                    } else {
                        results = rkf_ontology_utilities.rkf_max_specs(constraining_collection, mt);
                    }
                }
                return NIL != $gg_should_rank_arg_bindingsP$.getDynamicValue(thread) ? ((SubLObject) (results)) : list_utilities.randomize_list(results);
            }
        }
    }

    /**
     * Access the shared file hash table of previously tried gafs to determine if the given PARTIAL-GAF
     * is present as a key in the table, if not present then set it.  Because multiple Cyc servers could be
     * gaf-gathering, one of them is designated the master (at MASTER-CYC-HOST : MASTER-CYC-PORT) and it alone
     * accesses the file hash table.
     */
    public static final SubLObject partial_gaf_previously_triedP(SubLObject partial_gaf, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        SubLTrampolineFile.checkType(partial_gaf, CONSP);
        if (NIL != master_cyc_host) {
            return generate_gafs.gg_remote_eval(list($sym104$PARTIAL_GAF_PREVIOUSLY_TRIED__INTERNAL, partial_gaf), master_cyc_host, master_cyc_port);
        } else {
            return partial_gaf_previously_triedP_internal(partial_gaf);
        }
    }

    public static final SubLObject partial_gaf_previously_triedP_internal(SubLObject partial_gaf) {
        if (NIL != file_hash_table.get_file_hash_table(partial_gaf, tried_partial_gafs_fht(), UNPROVIDED)) {
            return T;
        }
        file_hash_table.put_file_hash_table(partial_gaf, tried_partial_gafs_fht(), T);
        return NIL;
    }

    /**
     * Returns the indicator that the given PARTIAL-GAF was tried in the gaf-gathering process.
     */
    public static final SubLObject tried_partial_gafP(SubLObject partial_gaf, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        SubLTrampolineFile.checkType(partial_gaf, CONSP);
        if (NIL != master_cyc_host) {
            return generate_gafs.gg_remote_eval(list($sym105$TRIED_PARTIAL_GAF__INTERNAL, partial_gaf), master_cyc_host, master_cyc_port);
        } else {
            return tried_partial_gafP_internal(partial_gaf);
        }
    }

    /**
     * Returns the indicator that the given PARTIAL-GAF was tried in the gaf-gathering process.
     */
    public static final SubLObject tried_partial_gafP_internal(SubLObject partial_gaf) {
        return file_hash_table.get_file_hash_table(partial_gaf, tried_partial_gafs_fht(), UNPROVIDED);
    }

    /**
     * Sets the indicator that the given PARTIAL-GAF was tried in the gaf-gathering process.
     */
    public static final SubLObject set_tried_partial_gaf(SubLObject partial_gaf, SubLObject master_cyc_host, SubLObject master_cyc_port) {
        if (master_cyc_host == UNPROVIDED) {
            master_cyc_host = NIL;
        }
        if (master_cyc_port == UNPROVIDED) {
            master_cyc_port = NIL;
        }
        SubLTrampolineFile.checkType(partial_gaf, CONSP);
        if (NIL != master_cyc_host) {
            return generate_gafs.gg_remote_eval(list(SET_TRIED_PARTIAL_GAF, list(QUOTE, partial_gaf)), master_cyc_host, master_cyc_port);
        }
        file_hash_table.put_file_hash_table(partial_gaf, tried_partial_gafs_fht(), T);
        return NIL;
    }

    /**
     * the location of gaf-gathering data, relative to the cyc home
     */
    // defparameter
    private static final SubLSymbol $tried_partial_gafs_path$ = makeSymbol("*TRIED-PARTIAL-GAFS-PATH*");

    public static final SubLObject tried_partial_gafs_kb_filename() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return file_utilities.cyc_home_filename($tried_partial_gafs_path$.getDynamicValue(thread), $str_alt110$tried_partial_gafs_kb, $$$cfasl);
        }
    }

    public static final SubLObject tried_partial_gafs_kb() {
        return NIL != file_utilities.file_existsP(tried_partial_gafs_kb_filename()) ? ((SubLObject) (cfasl_utilities.cfasl_load(tried_partial_gafs_kb_filename()))) : NIL;
    }

    public static final SubLObject set_tried_partial_gafs_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        {
            SubLObject filename = tried_partial_gafs_kb_filename();
            if (NIL != file_utilities.file_existsP(filename)) {
                Filesys.delete_file(filename);
            }
            cfasl_utilities.cfasl_save(kb, filename);
        }
        return kb;
    }

    /**
     * Returns the name of the tried partial gafs file hash table.
     */
    public static final SubLObject tried_partial_gafs_fht_filename() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return file_utilities.cyc_home_filename($tried_partial_gafs_path$.getDynamicValue(thread), $str_alt112$tried_partial_gafs_table, $$$fht);
        }
    }

    /**
     * Creates the tried partial gafs file hash table.
     */
    public static final SubLObject create_tried_partial_gafs_fht() {
        {
            SubLObject filename = tried_partial_gafs_fht_filename();
            return file_hash_table.create_file_hash_table(filename, $int$10000, SIXTEEN_INTEGER, EQUALP, $IMAGE_INDEPENDENT_CFASL);
        }
    }

    /**
     * the tried partial gafs file hash table
     */
    // deflexical
    private static final SubLSymbol $tried_partial_gafs_fht$ = makeSymbol("*TRIED-PARTIAL-GAFS-FHT*");

    /**
     * Returns the tried partial gafs file hash table, creating it if not present.
     */
    public static final SubLObject tried_partial_gafs_fht() {
        if (NIL != file_hash_table.file_hash_table_p($tried_partial_gafs_fht$.getGlobalValue())) {
        } else
            if (NIL == file_utilities.file_existsP(tried_partial_gafs_fht_filename())) {
                $tried_partial_gafs_fht$.setGlobalValue(create_tried_partial_gafs_fht());
                set_tried_partial_gafs_kb(control_vars.kb_loaded());
            } else
                if (tried_partial_gafs_kb().isInteger() && control_vars.kb_loaded().numG(tried_partial_gafs_kb())) {
                    Filesys.delete_file(tried_partial_gafs_fht_filename());
                    $tried_partial_gafs_fht$.setGlobalValue(create_tried_partial_gafs_fht());
                    set_tried_partial_gafs_kb(control_vars.kb_loaded());
                } else {
                    $tried_partial_gafs_fht$.setGlobalValue(file_hash_table.open_file_hash_table(tried_partial_gafs_fht_filename(), EQUALP, $IMAGE_INDEPENDENT_CFASL));
                }


        return $tried_partial_gafs_fht$.getGlobalValue();
    }

    /**
     * This function provides a diagnostic display of the gaf-gathering iterator
     * structure on the master Cyc server.
     */
    public static final SubLObject gg_display_iterators() {
        {
            SubLObject psg_methods = get_gg_psg_methods();
            if (NIL != psg_methods) {
                format(T, $str_alt116$No_display_available_for_current_);
                format(T, $str_alt117$Current_partial_sentence_generati, psg_methods);
                return NIL;
            }
        }
        format(T, $str_alt118$gaf_gathering_itreators__);
        if (NIL == $kag_iterator$.getGlobalValue()) {
            format(T, $str_alt119$not_initialized__);
            return NIL;
        }
        if (NIL == iteration.iterator_p($kag_iterator$.getGlobalValue())) {
            format(T, $str_alt120$_A_is_not_a_predicates_iterator__, $kag_iterator$.getGlobalValue());
            return NIL;
        }
        format(T, $str_alt121$predicates_iterator___A__, iteration.iterator_type_name($kag_iterator$.getGlobalValue()));
        {
            SubLObject argpos_lazy_iterators = iteration.get_rotating_iterator_iterator_iterators($kag_iterator$.getGlobalValue());
            if (!argpos_lazy_iterators.isList()) {
                format(T, $str_alt122$___done__);
                return NIL;
            }
            {
                SubLObject cdolist_list_var = argpos_lazy_iterators;
                SubLObject argpos_lazy_iterator = NIL;
                for (argpos_lazy_iterator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argpos_lazy_iterator = cdolist_list_var.first()) {
                    if (NIL != iteration.iterator_p(argpos_lazy_iterator)) {
                        {
                            SubLObject constraining_collection_lazy_iterators = iteration.get_rotating_iterator_iterator_iterators(argpos_lazy_iterator);
                            if (NIL != iteration.lazy_iterator_uninitializedP(argpos_lazy_iterator)) {
                                if (NIL != iteration.lazy_iterator_valid_uninitializedP(argpos_lazy_iterator)) {
                                    format(T, $str_alt123$__arg_pos_iterator__uninitialized);
                                } else {
                                    format(T, $str_alt124$__arg_pos_iterator______invalid__);
                                }
                            } else {
                                format(T, $str_alt125$__arg_pos_iterator___A__, iteration.iterator_type_name(argpos_lazy_iterator));
                                {
                                    SubLObject cdolist_list_var_9 = constraining_collection_lazy_iterators;
                                    SubLObject constraining_collection_lazy_iterator = NIL;
                                    for (constraining_collection_lazy_iterator = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , constraining_collection_lazy_iterator = cdolist_list_var_9.first()) {
                                        if (NIL != iteration.iterator_p(constraining_collection_lazy_iterator)) {
                                            if (NIL != iteration.lazy_iterator_uninitializedP(constraining_collection_lazy_iterator)) {
                                                if (NIL != iteration.lazy_iterator_valid_uninitializedP(constraining_collection_lazy_iterator)) {
                                                    format(T, $str_alt126$____constraining_collection_itera);
                                                } else {
                                                    format(T, $str_alt127$____constraining_collection_itera);
                                                }
                                            } else {
                                                {
                                                    SubLObject arg_binding_lazy_iterators = iteration.get_iterator_iterator_iterators(constraining_collection_lazy_iterator);
                                                    format(T, $str_alt128$____constraining_collection_itera, iteration.iterator_type_name(constraining_collection_lazy_iterator));
                                                    {
                                                        SubLObject cdolist_list_var_10 = arg_binding_lazy_iterators;
                                                        SubLObject arg_binding_lazy_iterator = NIL;
                                                        for (arg_binding_lazy_iterator = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , arg_binding_lazy_iterator = cdolist_list_var_10.first()) {
                                                            if (NIL != iteration.iterator_p(arg_binding_lazy_iterator)) {
                                                                if (NIL != iteration.lazy_iterator_uninitializedP(arg_binding_lazy_iterator)) {
                                                                    {
                                                                        SubLObject datum = iteration.iteration_state_peek(arg_binding_lazy_iterator);
                                                                        SubLObject current = datum;
                                                                        SubLObject iterator = NIL;
                                                                        SubLObject constructor = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt129);
                                                                        iterator = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt129);
                                                                        constructor = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt129);
                                                                        {
                                                                            SubLObject temp = current.rest();
                                                                            current = current.first();
                                                                            destructuring_bind_must_consp(current, datum, $list_alt129);
                                                                            {
                                                                                SubLObject temp_11 = current.rest();
                                                                                current = current.first();
                                                                                {
                                                                                    SubLObject function = NIL;
                                                                                    SubLObject predicate = NIL;
                                                                                    SubLObject argpos = NIL;
                                                                                    SubLObject constraining_collection = NIL;
                                                                                    SubLObject type = NIL;
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt129);
                                                                                    function = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt129);
                                                                                    predicate = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt129);
                                                                                    argpos = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt129);
                                                                                    constraining_collection = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt129);
                                                                                    type = current.first();
                                                                                    current = current.rest();
                                                                                    if (NIL == current) {
                                                                                        current = temp_11;
                                                                                        if (NIL == current) {
                                                                                            current = temp;
                                                                                            if (NIL == current) {
                                                                                                format(T, $str_alt130$______arg_binding_iterator__unini, constraining_collection);
                                                                                            } else {
                                                                                                cdestructuring_bind_error(datum, $list_alt129);
                                                                                            }
                                                                                        } else {
                                                                                            cdestructuring_bind_error(datum, $list_alt129);
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum, $list_alt129);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    format(T, $str_alt131$______arg_binding_iterator___A___, iteration.iterator_type_name(arg_binding_lazy_iterator), string_utilities.first_n_list_items_to_string(iteration.get_list_iterator_list(arg_binding_lazy_iterator), ONE_INTEGER));
                                                                }
                                                            } else {
                                                                format(T, $str_alt132$_______A_is_not_an_arg_binding_it, arg_binding_lazy_iterator);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            format(T, $str_alt133$_____A_is_not_an_constraining_col, constraining_collection_lazy_iterator);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        format(T, $str_alt134$___A_is_not_an_argpos_iterator__, argpos_lazy_iterator);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_gaf_gathering_master_file() {
        declareFunction("get_gg_psg_methods", "GET-GG-PSG-METHODS", 0, 0, false);
        declareFunction("gg_psg_method_p", "GG-PSG-METHOD-P", 1, 0, false);
        declareFunction("set_gg_psg_methods", "SET-GG-PSG-METHODS", 1, 0, false);
        declareFunction("gg_psg_methods_string", "GG-PSG-METHODS-STRING", 0, 0, false);
        declareFunction("get_fact_gathering_process_name", "GET-FACT-GATHERING-PROCESS-NAME", 0, 0, false);
        declareFunction("set_fact_gathering_process_name", "SET-FACT-GATHERING-PROCESS-NAME", 1, 0, false);
        declareFunction("gg_assert_fact_gathering_process", "GG-ASSERT-FACT-GATHERING-PROCESS", 0, 0, false);
        declareFunction("initialize_kag_iterator", "INITIALIZE-KAG-ITERATOR", 0, 0, false);
        declareFunction("finalize_kag_iterator", "FINALIZE-KAG-ITERATOR", 0, 0, false);
        declareFunction("get_next_kag_for_gathering", "GET-NEXT-KAG-FOR-GATHERING", 2, 0, false);
        declareFunction("gg_inference_iterators_from_kbq_col", "GG-INFERENCE-ITERATORS-FROM-KBQ-COL", 1, 0, false);
        declareFunction("new_kag_iterator", "NEW-KAG-ITERATOR", 0, 0, false);
        declareFunction("get_predicates_for_nl_gathering", "GET-PREDICATES-FOR-NL-GATHERING", 0, 1, false);
        declareFunction("min_generated_phrase_words_for_pred", "MIN-GENERATED-PHRASE-WORDS-FOR-PRED", 2, 0, false);
        declareFunction("new_partial_gaf_arg_iterator", "NEW-PARTIAL-GAF-ARG-ITERATOR", 1, 0, false);
        declareFunction("new_partial_gaf_arg_binding_iterator", "NEW-PARTIAL-GAF-ARG-BINDING-ITERATOR", 2, 0, false);
        declareFunction("make_partial_gaf_arg_binding_iterators", "MAKE-PARTIAL-GAF-ARG-BINDING-ITERATORS", 2, 0, false);
        declareFunction("get_appropriate_arg_constraints_for_pred", "GET-APPROPRIATE-ARG-CONSTRAINTS-FOR-PRED", 3, 0, false);
        declareFunction("gg_reln_type_level_in_argP", "GG-RELN-TYPE-LEVEL-IN-ARG?", 3, 0, false);
        declareFunction("new_partial_gaf_arg_binding_constraint_iterator", "NEW-PARTIAL-GAF-ARG-BINDING-CONSTRAINT-ITERATOR", 4, 0, false);
        declareFunction("gg_get_partial_gaf_arg_bindings", "GG-GET-PARTIAL-GAF-ARG-BINDINGS", 4, 0, false);
        declareFunction("proposed_arg_bindings_of_type_for_collection", "PROPOSED-ARG-BINDINGS-OF-TYPE-FOR-COLLECTION", 4, 0, false);
        declareFunction("add_gafs_for_preds", "ADD-GAFS-FOR-PREDS", 1, 4, false);
        declareFunction("gg_handle_google_server_issue", "GG-HANDLE-GOOGLE-SERVER-ISSUE", 2, 0, false);
        declareFunction("gg_partial_gafs", "GG-PARTIAL-GAFS", 1, 3, false);
        declareFunction("proposed_arg_bindings_for_pred", "PROPOSED-ARG-BINDINGS-FOR-PRED", 2, 3, false);
        declareFunction("proposed_arg_bindings_for_arg_constraint", "PROPOSED-ARG-BINDINGS-FOR-ARG-CONSTRAINT", 1, 2, false);
        declareFunction("partial_gaf_previously_triedP", "PARTIAL-GAF-PREVIOUSLY-TRIED?", 1, 2, false);
        declareFunction("partial_gaf_previously_triedP_internal", "PARTIAL-GAF-PREVIOUSLY-TRIED?-INTERNAL", 1, 0, false);
        declareFunction("tried_partial_gafP", "TRIED-PARTIAL-GAF?", 1, 2, false);
        declareFunction("tried_partial_gafP_internal", "TRIED-PARTIAL-GAF?-INTERNAL", 1, 0, false);
        declareFunction("set_tried_partial_gaf", "SET-TRIED-PARTIAL-GAF", 1, 2, false);
        declareFunction("tried_partial_gafs_kb_filename", "TRIED-PARTIAL-GAFS-KB-FILENAME", 0, 0, false);
        declareFunction("tried_partial_gafs_kb", "TRIED-PARTIAL-GAFS-KB", 0, 0, false);
        declareFunction("set_tried_partial_gafs_kb", "SET-TRIED-PARTIAL-GAFS-KB", 0, 1, false);
        declareFunction("tried_partial_gafs_fht_filename", "TRIED-PARTIAL-GAFS-FHT-FILENAME", 0, 0, false);
        declareFunction("create_tried_partial_gafs_fht", "CREATE-TRIED-PARTIAL-GAFS-FHT", 0, 0, false);
        declareFunction("tried_partial_gafs_fht", "TRIED-PARTIAL-GAFS-FHT", 0, 0, false);
        declareFunction("gg_display_iterators", "GG-DISPLAY-ITERATORS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_gaf_gathering_master_file() {
        defparameter("*GG-FOCUS*", NIL);
        defparameter("*GG-FOCUS-TYPE*", NIL);
        defparameter("*GG-PSG-METHODS*", NIL);
        defparameter("*FACT-GATHERING-PROCESS-NAME*", NIL);
        defparameter("*FACT-GATHERING-PROCESS*", NIL);
        defparameter("*FACT-GATHERING-PROCESS-COMMENT*", NIL);
        deflexical("*KAG-ITERATOR*", NIL);
        deflexical("*GG-KAG-ITERATOR-LOCK*", make_lock($str_alt25$gg_kag_iterator_lock));
        deflexical("*GG-CALLERS-COUNT*", ZERO_INTEGER);
        defparameter("*GG-BAD-ARG-COLLS*", $list_alt98);
        defparameter("*GG-SHOULD-RANK-ARG-BINDINGS?*", NIL);
        defparameter("*TRIED-PARTIAL-GAFS-PATH*", list($$$data, $str_alt109$gaf_gathering));
        deflexical("*TRIED-PARTIAL-GAFS-FHT*", NIL);
        return NIL;
    }

    public static final SubLObject setup_gaf_gathering_master_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("FET"), makeKeyword("FACT-SHEET"), makeKeyword("WSD-RULES"), makeKeyword("NER"));

    private static final SubLSymbol GG_PSG_METHOD_P = makeSymbol("GG-PSG-METHOD-P");

    static private final SubLString $str_alt2$SubL_procedure_that_heuristically = makeString("SubL procedure that heuristically computes partial GAFs for a specified set of predicates");

    private static final SubLSymbol $FET = makeKeyword("FET");

    static private final SubLString $str_alt4$KB_Queries_that_compute_the_KAGs_ = makeString("KB Queries that compute the KAGs using FET templates");



    static private final SubLString $str_alt6$KB_Queries_that_compute_the_KAGs_ = makeString("KB Queries that compute the KAGs using instances of #$FactSheetBuilderQuery");

    private static final SubLSymbol $WSD_RULES = makeKeyword("WSD-RULES");

    static private final SubLString $str_alt8$KB_Queries_that_compute_the_KAGs_ = makeString("KB Queries that compute the KAGs using word-sense disambiguation rules");

    static private final SubLString $str_alt9$KB_Queries_that_compute_the_KAGs_ = makeString("KB Queries that compute the KAGs using predicates good for NER experimentation");

    static private final SubLString $str_alt10$__and_ = makeString(", and ");



    public static final SubLObject $const12$CycBasedFactGatheringProcessNamed = constant_handles.reader_make_constant_shell(makeString("CycBasedFactGatheringProcessNamedFn"));

    static private final SubLString $$$CycBasedFactGatheringProcess = makeString("CycBasedFactGatheringProcess");



    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt16 = list(constant_handles.reader_make_constant_shell(makeString("CycBasedFactGatheringProcess")));

    public static final SubLObject $$startingDate = constant_handles.reader_make_constant_shell(makeString("startingDate"));

    static private final SubLString $str_alt18$An_instance_of___CycBasedFactGath = makeString("An instance of #$CycBasedFactGatheringProcess.  The KAGs for this process were generated using ");

    static private final SubLString $str_alt19$___This_fact_gathering_process_wa = makeString(".  This fact-gathering process was run on a Cyc image with KB ");

    static private final SubLString $str_alt20$_and_System_ = makeString(" and System ");

    static private final SubLString $str_alt21$__ = makeString(". ");

    static private final SubLString $str_alt22$ = makeString("");

    public static final SubLObject $$comment = constant_handles.reader_make_constant_shell(makeString("comment"));



    static private final SubLString $str_alt25$gg_kag_iterator_lock = makeString("gg-kag-iterator-lock");







    static private final SubLSymbol $sym29$_X = makeSymbol("?X");



    static private final SubLSymbol $sym31$_OPER = makeSymbol("?OPER");

    static private final SubLSymbol $sym32$_VAL = makeSymbol("?VAL");

    static private final SubLSymbol $sym33$_VAR_POS = makeSymbol("?VAR-POS");

    static private final SubLSymbol $sym34$_TYPE = makeSymbol("?TYPE");

    static private final SubLString $str_alt35$_ = makeString(" ");

    static private final SubLString $str_alt36$Invalid_variable_position___S_for = makeString("Invalid variable position: ~S for KAG partial sentence.");

    static private final SubLString $str_alt37$gaf_gathering_lock_problem = makeString("gaf-gathering lock problem");

    static private final SubLString $$$localhost = makeString("localhost");

    static private final SubLString $str_alt39$Dispatched__A_to__A__A__ = makeString("Dispatched ~A to ~A:~A~%");

    private static final SubLSymbol DESTROY_INFERENCE_AND_PROBLEM_STORE = makeSymbol("DESTROY-INFERENCE-AND-PROBLEM-STORE");

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    static private final SubLString $str_alt42$Iterating_over_predicates___A__ = makeString("Iterating over predicates: ~A~%");

    private static final SubLSymbol NEW_PARTIAL_GAF_ARG_ITERATOR = makeSymbol("NEW-PARTIAL-GAF-ARG-ITERATOR");

    public static final SubLObject $$FactGatheringPSQ_FETTemplateBased = constant_handles.reader_make_constant_shell(makeString("FactGatheringPSQ-FETTemplateBased"));

    public static final SubLObject $const45$FactGatheringPSQ_WordSenseDisambi = constant_handles.reader_make_constant_shell(makeString("FactGatheringPSQ-WordSenseDisambiguationBased"));

    private static final SubLSymbol $NER = makeKeyword("NER");

    public static final SubLObject $$FactGatheringPSQ_ForNERExperiment = constant_handles.reader_make_constant_shell(makeString("FactGatheringPSQ-ForNERExperiment"));

    public static final SubLObject $$FactGatheringPSQ_FactSheetBased = constant_handles.reader_make_constant_shell(makeString("FactGatheringPSQ-FactSheetBased"));

    static private final SubLString $str_alt49$Invalid_PSG_method___A__ = makeString("Invalid PSG method: ~A~%");

    private static final SubLSymbol ITERATOR_P = makeSymbol("ITERATOR-P");

    public static final SubLObject $const51$FactFactoryGatheredGAFVerificatio = constant_handles.reader_make_constant_shell(makeString("FactFactoryGatheredGAFVerificationPredicate"));

    public static final SubLObject $$genTemplate = constant_handles.reader_make_constant_shell(makeString("genTemplate"));

    static private final SubLSymbol $sym53$_ARG1 = makeSymbol("?ARG1");

    static private final SubLSymbol $sym54$_ARG = makeSymbol("?ARG");

    private static final SubLSymbol NEW_ROTATING_ITERATOR_ITERATOR = makeSymbol("NEW-ROTATING-ITERATOR-ITERATOR");



    private static final SubLSymbol NEW_PARTIAL_GAF_ARG_BINDING_ITERATOR = makeSymbol("NEW-PARTIAL-GAF-ARG-BINDING-ITERATOR");

    static private final SubLList $list_alt58 = list(TWO_INTEGER);

    static private final SubLList $list_alt59 = list(ONE_INTEGER);

    private static final SubLSymbol NEW_ITERATOR_ITERATOR = makeSymbol("NEW-ITERATOR-ITERATOR");

    private static final SubLSymbol MAKE_PARTIAL_GAF_ARG_BINDING_ITERATORS = makeSymbol("MAKE-PARTIAL-GAF-ARG-BINDING-ITERATORS");

    public static final SubLObject $$MachineLearningSpindleHeadMt = constant_handles.reader_make_constant_shell(makeString("MachineLearningSpindleHeadMt"));

    static private final SubLList $list_alt63 = list(makeSymbol("TYPE"), makeSymbol("CONSTRAINING-COLLECTION"), makeSymbol("ASSERTED-COUNT"), makeSymbol("TOTAL-COUNT"), makeSymbol("RATIO"));



    private static final SubLSymbol $INSTANCES = makeKeyword("INSTANCES");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));



    static private final SubLString $str_alt71$total_specs_count_of__A_must_be_g = makeString("total-specs-count of ~A must be greater than 0");

    static private final SubLSymbol $sym72$_ = makeSymbol(">");



    public static final SubLObject $$SetOrCollection = constant_handles.reader_make_constant_shell(makeString("SetOrCollection"));

    static private final SubLSymbol $sym75$SPEC_ = makeSymbol("SPEC?");



    private static final SubLSymbol NEW_LIST_ITERATOR = makeSymbol("NEW-LIST-ITERATOR");

    private static final SubLSymbol GG_GET_PARTIAL_GAF_ARG_BINDINGS = makeSymbol("GG-GET-PARTIAL-GAF-ARG-BINDINGS");

    static private final SubLList $list_alt79 = list(makeSymbol("?X"));

    static private final SubLString $str_alt80$Gathered__A_instance_arg_bindings = makeString("Gathered ~A instance arg bindings constrained by ~A ~A for ~A arg ~A~%");

    static private final SubLString $str_alt81$Gathered__A_specialization_arg_bi = makeString("Gathered ~A specialization arg bindings constrained by ~A ~A for ~A arg ~A~%");

    static private final SubLList $list_alt82 = list(ONE_INTEGER, TWO_INTEGER);

    static private final SubLString $str_alt83$_cyc_projects_butler_GatheringFro = makeString("/cyc/projects/butler/GatheringFromNL/GAFsFromWebSearches/gg-logs/gg-");

    static private final SubLString $str_alt84$_log = makeString(".log");

    private static final SubLSymbol $SERVER_DOWN = makeKeyword("SERVER-DOWN");

    private static final SubLSymbol $TIME_OUT = makeKeyword("TIME-OUT");

    private static final SubLSymbol $GOOGLE_PROBLEM = makeKeyword("GOOGLE-PROBLEM");





    static private final SubLString $str_alt90$The_Google_server_timed_out___ = makeString("The Google server timed out.~%");

    static private final SubLString $str_alt91$_We_received_Google_error__A_whil = makeString("~We received Google error ~A while working on partial gaf ~A.~%");

    static private final SubLString $str_alt92$Analyzing_the_partial_GAF__A_caus = makeString("Analyzing the partial GAF ~A caused the following problem: ~A.~%");

    static private final SubLString $str_alt93$______HELP__Google_server_is_down = makeString("~%*** HELP! Google server is down ... wait for ~A seconds!");

    static private final SubLString $str_alt94$____Waiting__A_seconds_for_Google = makeString("*** Waiting ~A seconds for Google server to reset due to status ~A~%");

    static private final SubLString $str_alt95$Working_with__A_predicate_and_arg = makeString("Working with ~A predicate and argument set.~%");

    static private final SubLString $$$prepared = makeString("prepared");

    static private final SubLString $str_alt97$code_determined = makeString("code-determined");

    static private final SubLList $list_alt98 = list(constant_handles.reader_make_constant_shell(makeString("Date")), constant_handles.reader_make_constant_shell(makeString("Time-Quantity")), constant_handles.reader_make_constant_shell(makeString("ResearchCycConstant")));

    static private final SubLString $str_alt99$__Determining_appropriate_arg_A_c = makeString("  Determining appropriate arg~A constraints for ~A~%");

    static private final SubLString $str_alt100$__Gathering_instance_level_propos = makeString("  Gathering instance-level proposed arg bindings constrained by ~A from a total of ~A~%");



    static private final SubLString $str_alt102$__Gathering_type_level_proposed_a = makeString("  Gathering type-level proposed arg bindings constrained by ~A from a total of ~A~%");



    static private final SubLSymbol $sym104$PARTIAL_GAF_PREVIOUSLY_TRIED__INTERNAL = makeSymbol("PARTIAL-GAF-PREVIOUSLY-TRIED?-INTERNAL");

    static private final SubLSymbol $sym105$TRIED_PARTIAL_GAF__INTERNAL = makeSymbol("TRIED-PARTIAL-GAF?-INTERNAL");

    private static final SubLSymbol SET_TRIED_PARTIAL_GAF = makeSymbol("SET-TRIED-PARTIAL-GAF");



    static private final SubLString $$$data = makeString("data");

    static private final SubLString $str_alt109$gaf_gathering = makeString("gaf-gathering");

    static private final SubLString $str_alt110$tried_partial_gafs_kb = makeString("tried-partial-gafs-kb");

    static private final SubLString $$$cfasl = makeString("cfasl");

    static private final SubLString $str_alt112$tried_partial_gafs_table = makeString("tried-partial-gafs-table");

    static private final SubLString $$$fht = makeString("fht");

    public static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    static private final SubLString $str_alt116$No_display_available_for_current_ = makeString("No display available for current KAG iterator.~%");

    static private final SubLString $str_alt117$Current_partial_sentence_generati = makeString("Current partial-sentence generation methods are ~S~%");

    static private final SubLString $str_alt118$gaf_gathering_itreators__ = makeString("gaf-gathering itreators~%");

    static private final SubLString $str_alt119$not_initialized__ = makeString("not-initialized~%");

    static private final SubLString $str_alt120$_A_is_not_a_predicates_iterator__ = makeString("~A is not a predicates iterator~%");

    static private final SubLString $str_alt121$predicates_iterator___A__ = makeString("predicates iterator: ~A~%");

    static private final SubLString $str_alt122$___done__ = makeString("...done~%");

    static private final SubLString $str_alt123$__arg_pos_iterator__uninitialized = makeString("  arg-pos iterator: uninitialized~%");

    static private final SubLString $str_alt124$__arg_pos_iterator______invalid__ = makeString("  arg-pos iterator: *** invalid ***~%");

    static private final SubLString $str_alt125$__arg_pos_iterator___A__ = makeString("  arg-pos iterator: ~A~%");

    static private final SubLString $str_alt126$____constraining_collection_itera = makeString("    constraining collection iterator: uninitialized~%");

    static private final SubLString $str_alt127$____constraining_collection_itera = makeString("    constraining collection iterator: *** invalid ***~%");

    static private final SubLString $str_alt128$____constraining_collection_itera = makeString("    constraining collection iterator: ~A~%");

    static private final SubLList $list_alt129 = list(makeSymbol("ITERATOR"), makeSymbol("CONSTRUCTOR"), list(list(makeSymbol("FUNCTION"), makeSymbol("PREDICATE"), makeSymbol("ARGPOS"), makeSymbol("CONSTRAINING-COLLECTION"), makeSymbol("TYPE"))));

    static private final SubLString $str_alt130$______arg_binding_iterator__unini = makeString("      arg binding iterator: uninitialized with ~A~%");

    static private final SubLString $str_alt131$______arg_binding_iterator___A___ = makeString("      arg binding iterator: ~A  ~A~%");

    static private final SubLString $str_alt132$_______A_is_not_an_arg_binding_it = makeString("      ~A is not an arg binding iterator~%");

    static private final SubLString $str_alt133$_____A_is_not_an_constraining_col = makeString("    ~A is not an constraining collection iterator~%");

    static private final SubLString $str_alt134$___A_is_not_an_argpos_iterator__ = makeString("  ~A is not an argpos iterator~%");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_gaf_gathering_master_file();
    }

    @Override
    public void initializeVariables() {
        init_gaf_gathering_master_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_gaf_gathering_master_file();
    }
}

