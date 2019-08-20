/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.invert;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      WORKFLOW-QUEUE
 *  source file: /cyc/top/cycl/workflow-queue.lisp
 *  created:     2019/07/03 17:38:02
 */
public final class workflow_queue extends SubLTranslatedFile implements V02 {
    // // Constructor
    private workflow_queue() {
    }

    public static final SubLFile me = new workflow_queue();


    // // Definitions
    public static final SubLObject get_workflow_queue_queue_filler_task(SubLObject v_workflow_queue) {
        return classes.subloop_get_access_protected_instance_slot(v_workflow_queue, FOUR_INTEGER, QUEUE_FILLER_TASK);
    }

    public static final SubLObject set_workflow_queue_queue_filler_task(SubLObject v_workflow_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_workflow_queue, value, FOUR_INTEGER, QUEUE_FILLER_TASK);
    }

    public static final SubLObject get_workflow_queue_watermark_low(SubLObject v_workflow_queue) {
        {
            SubLObject v_class = (v_workflow_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_workflow_queue))) : NIL != subloop_structures.class_p(v_workflow_queue) ? ((SubLObject) (v_workflow_queue)) : NIL != subloop_structures.instance_p(v_workflow_queue) ? ((SubLObject) (subloop_structures.instance_class(v_workflow_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(WATERMARK_LOW, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_workflow_queue_watermark_low(SubLObject v_workflow_queue, SubLObject value) {
        {
            SubLObject v_class = (v_workflow_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_workflow_queue))) : NIL != subloop_structures.class_p(v_workflow_queue) ? ((SubLObject) (v_workflow_queue)) : NIL != subloop_structures.instance_p(v_workflow_queue) ? ((SubLObject) (subloop_structures.instance_class(v_workflow_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(WATERMARK_LOW, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject get_workflow_queue_watermark_high(SubLObject v_workflow_queue) {
        {
            SubLObject v_class = (v_workflow_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_workflow_queue))) : NIL != subloop_structures.class_p(v_workflow_queue) ? ((SubLObject) (v_workflow_queue)) : NIL != subloop_structures.instance_p(v_workflow_queue) ? ((SubLObject) (subloop_structures.instance_class(v_workflow_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(WATERMARK_HIGH, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_workflow_queue_watermark_high(SubLObject v_workflow_queue, SubLObject value) {
        {
            SubLObject v_class = (v_workflow_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_workflow_queue))) : NIL != subloop_structures.class_p(v_workflow_queue) ? ((SubLObject) (v_workflow_queue)) : NIL != subloop_structures.instance_p(v_workflow_queue) ? ((SubLObject) (subloop_structures.instance_class(v_workflow_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(WATERMARK_HIGH, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_workflow_queue_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, WATERMARK_HIGH, $int$25);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, WATERMARK_LOW, FIFTEEN_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_workflow_queue_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, FIRST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, LAST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, QUEUE_FILLER_TASK, NIL);
        return NIL;
    }

    public static final SubLObject workflow_queue_p(SubLObject v_workflow_queue) {
        return classes.subloop_instanceof_class(v_workflow_queue, WORKFLOW_QUEUE);
    }

    public static final SubLObject workflow_queue_enqueue_processed_method(SubLObject self, SubLObject item) {
        methods.funcall_instance_method_with_1_args(self, ENQUEUE, item);
        return self;
    }

    public static final SubLObject workflow_queue_kill_filler_thread_method(SubLObject self) {
        {
            SubLObject catch_var_for_workflow_queue_method = NIL;
            SubLObject queue_filler_task = get_workflow_queue_queue_filler_task(self);
            try {
                try {
                    if (NIL != queue_filler_task) {
                        {
                            SubLObject error_message = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                    try {
                                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                        try {
                                            kill_process(process_utilities.task_process(queue_filler_task));
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        rebind(Errors.$error_handler$, _prev_bind_0);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            if (NIL != error_message) {
                                format(T, $str_alt28$__Filler_thread_was_already_dead_);
                            }
                            queue_filler_task = NIL;
                        }
                    }
                    sublisp_throw($sym26$OUTER_CATCH_FOR_WORKFLOW_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_workflow_queue_queue_filler_task(self, queue_filler_task);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_workflow_queue_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_WORKFLOW_QUEUE_METHOD);
            }
            return catch_var_for_workflow_queue_method;
        }
    }

    public static final SubLObject get_bnc_frequency_queue_verbose(SubLObject bnc_frequency_queue) {
        return classes.subloop_get_access_protected_instance_slot(bnc_frequency_queue, SIX_INTEGER, VERBOSE);
    }

    public static final SubLObject set_bnc_frequency_queue_verbose(SubLObject bnc_frequency_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bnc_frequency_queue, value, SIX_INTEGER, VERBOSE);
    }

    public static final SubLObject get_bnc_frequency_queue_bnc_file(SubLObject bnc_frequency_queue) {
        return classes.subloop_get_access_protected_instance_slot(bnc_frequency_queue, FIVE_INTEGER, BNC_FILE);
    }

    public static final SubLObject set_bnc_frequency_queue_bnc_file(SubLObject bnc_frequency_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bnc_frequency_queue, value, FIVE_INTEGER, BNC_FILE);
    }

    public static final SubLObject subloop_reserved_initialize_bnc_frequency_queue_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, WATERMARK_HIGH, $int$25);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, WATERMARK_LOW, FIFTEEN_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_bnc_frequency_queue_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, FIRST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, LAST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, QUEUE_FILLER_TASK, NIL);
        classes.subloop_initialize_slot(new_instance, BNC_FREQUENCY_QUEUE, BNC_FILE, NIL);
        classes.subloop_initialize_slot(new_instance, BNC_FREQUENCY_QUEUE, VERBOSE, NIL);
        return NIL;
    }

    public static final SubLObject bnc_frequency_queue_p(SubLObject bnc_frequency_queue) {
        return classes.subloop_instanceof_class(bnc_frequency_queue, BNC_FREQUENCY_QUEUE);
    }

    /**
     *
     *
     * @return bnc-frequency-queue-p. Starts the thread to refill this queue
    object from the BNC data file.
     */
    public static final SubLObject bnc_frequency_queue_start_filler_thread_method(SubLObject self) {
        {
            SubLObject catch_var_for_bnc_frequency_queue_method = NIL;
            SubLObject bnc_file = get_bnc_frequency_queue_bnc_file(self);
            SubLObject queue_filler_task = get_workflow_queue_queue_filler_task(self);
            try {
                try {
                    if (NIL != bnc_file) {
                        queue_filler_task = process_utilities.new_task($str_alt39$bnc_filler_thread, BNC_FREQUENCY_QUEUE_ENQUEUE_FILE_METHOD, list(self, bnc_file), UNPROVIDED);
                    } else {
                        Errors.warn($str_alt41$The_location_of_the_BNC_files_cou);
                    }
                    sublisp_throw($sym38$OUTER_CATCH_FOR_BNC_FREQUENCY_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bnc_frequency_queue_bnc_file(self, bnc_file);
                            set_workflow_queue_queue_filler_task(self, queue_filler_task);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bnc_frequency_queue_method = Errors.handleThrowable(ccatch_env_var, $sym38$OUTER_CATCH_FOR_BNC_FREQUENCY_QUEUE_METHOD);
            }
            return catch_var_for_bnc_frequency_queue_method;
        }
    }

    public static final SubLObject bnc_frequency_queue_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_bnc_frequency_queue_method = NIL;
            SubLObject bnc_file = get_bnc_frequency_queue_bnc_file(self);
            try {
                try {
                    subloop_queues.basic_queue_initialize_method(self);
                    bnc_file = kb_mapping_utilities.fpred_value_in_mt($const47$BritishNationalCorpusFrequencyFil, $$nameString, $$ComputereseLexicalMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym46$OUTER_CATCH_FOR_BNC_FREQUENCY_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bnc_frequency_queue_bnc_file(self, bnc_file);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bnc_frequency_queue_method = Errors.handleThrowable(ccatch_env_var, $sym46$OUTER_CATCH_FOR_BNC_FREQUENCY_QUEUE_METHOD);
            }
            return catch_var_for_bnc_frequency_queue_method;
        }
    }

    public static final SubLObject bnc_frequency_queue_enqueue_file_method(SubLObject self, SubLObject filename) {
        {
            SubLObject catch_var_for_bnc_frequency_queue_method = NIL;
            SubLObject watermark_low = get_workflow_queue_watermark_low(self);
            SubLObject watermark_high = get_workflow_queue_watermark_high(self);
            try {
                try {
                    SubLTrampolineFile.checkType(filename, STRINGP);
                    {
                        SubLObject go = T;
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(filename, $INPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt57$Unable_to_open__S, filename);
                            }
                            {
                                SubLObject infile = stream;
                                if (infile.isStream()) {
                                    {
                                        SubLObject line = NIL;
                                        for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                            if (methods.funcall_instance_method_with_0_args(self, GET_ELEMENT_COUNT).numG(watermark_high)) {
                                                go = NIL;
                                            }
                                            while (NIL == go) {
                                                if (methods.funcall_instance_method_with_0_args(self, GET_ELEMENT_COUNT).numL(watermark_low)) {
                                                    go = T;
                                                }
                                            } 
                                            methods.funcall_instance_method_with_1_args(self, ENQUEUE_PROCESSED, line);
                                        }
                                    }
                                }
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
                    sublisp_throw($sym54$OUTER_CATCH_FOR_BNC_FREQUENCY_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_workflow_queue_watermark_low(self, watermark_low);
                            set_workflow_queue_watermark_high(self, watermark_high);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bnc_frequency_queue_method = Errors.handleThrowable(ccatch_env_var, $sym54$OUTER_CATCH_FOR_BNC_FREQUENCY_QUEUE_METHOD);
            }
            return catch_var_for_bnc_frequency_queue_method;
        }
    }

    // defvar
    private static final SubLSymbol $bnc_semtrans_queue$ = makeSymbol("*BNC-SEMTRANS-QUEUE*");

    public static final SubLObject get_bnc_semtrans_queue() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $bnc_semtrans_queue$.getDynamicValue(thread)) {
                $bnc_semtrans_queue$.setDynamicValue(object.new_class_instance(BNC_SEMTRANS_QUEUE), thread);
                methods.funcall_instance_method_with_0_args($bnc_semtrans_queue$.getDynamicValue(thread), START_FILLER_THREAD);
            }
            return $bnc_semtrans_queue$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return stringp, the most frequent word which can denote a verb for which
    the Cyc lexicon doesn't have a semtrans.
     */
    public static final SubLObject get_next_semtransless_verb() {
        return methods.funcall_instance_method_with_0_args(get_bnc_semtrans_queue(), DEQUEUE);
    }

    public static final SubLObject get_bnc_semtrans_queue_processed_items(SubLObject bnc_semtrans_queue) {
        return classes.subloop_get_access_protected_instance_slot(bnc_semtrans_queue, EIGHT_INTEGER, PROCESSED_ITEMS);
    }

    public static final SubLObject set_bnc_semtrans_queue_processed_items(SubLObject bnc_semtrans_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bnc_semtrans_queue, value, EIGHT_INTEGER, PROCESSED_ITEMS);
    }

    public static final SubLObject get_bnc_semtrans_queue_semtrans_lexicon(SubLObject bnc_semtrans_queue) {
        return classes.subloop_get_access_protected_instance_slot(bnc_semtrans_queue, SEVEN_INTEGER, SEMTRANS_LEXICON);
    }

    public static final SubLObject set_bnc_semtrans_queue_semtrans_lexicon(SubLObject bnc_semtrans_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bnc_semtrans_queue, value, SEVEN_INTEGER, SEMTRANS_LEXICON);
    }

    public static final SubLObject get_bnc_semtrans_queue_admissible_pos(SubLObject bnc_semtrans_queue) {
        {
            SubLObject v_class = (bnc_semtrans_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(bnc_semtrans_queue))) : NIL != subloop_structures.class_p(bnc_semtrans_queue) ? ((SubLObject) (bnc_semtrans_queue)) : NIL != subloop_structures.instance_p(bnc_semtrans_queue) ? ((SubLObject) (subloop_structures.instance_class(bnc_semtrans_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(ADMISSIBLE_POS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_bnc_semtrans_queue_admissible_pos(SubLObject bnc_semtrans_queue, SubLObject value) {
        {
            SubLObject v_class = (bnc_semtrans_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(bnc_semtrans_queue))) : NIL != subloop_structures.class_p(bnc_semtrans_queue) ? ((SubLObject) (bnc_semtrans_queue)) : NIL != subloop_structures.instance_p(bnc_semtrans_queue) ? ((SubLObject) (subloop_structures.instance_class(bnc_semtrans_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(ADMISSIBLE_POS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_bnc_semtrans_queue_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, WATERMARK_HIGH, $int$25);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, WATERMARK_LOW, FIFTEEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, BNC_SEMTRANS_QUEUE, ADMISSIBLE_POS, $list_alt65);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_bnc_semtrans_queue_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, FIRST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, LAST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, QUEUE_FILLER_TASK, NIL);
        classes.subloop_initialize_slot(new_instance, BNC_FREQUENCY_QUEUE, BNC_FILE, NIL);
        classes.subloop_initialize_slot(new_instance, BNC_FREQUENCY_QUEUE, VERBOSE, NIL);
        classes.subloop_initialize_slot(new_instance, BNC_SEMTRANS_QUEUE, SEMTRANS_LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, BNC_SEMTRANS_QUEUE, PROCESSED_ITEMS, NIL);
        return NIL;
    }

    public static final SubLObject bnc_semtrans_queue_p(SubLObject bnc_semtrans_queue) {
        return classes.subloop_instanceof_class(bnc_semtrans_queue, BNC_SEMTRANS_QUEUE);
    }

    public static final SubLObject bnc_semtrans_queue_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_bnc_semtrans_queue_method = NIL;
            SubLObject processed_items = get_bnc_semtrans_queue_processed_items(self);
            SubLObject v_semtrans_lexicon = get_bnc_semtrans_queue_semtrans_lexicon(self);
            try {
                try {
                    bnc_frequency_queue_initialize_method(self);
                    processed_items = make_hash_table($int$32, symbol_function(EQUALP), UNPROVIDED);
                    v_semtrans_lexicon = object.new_class_instance(SEMTRANS_LEXICON);
                    sublisp_throw($sym69$OUTER_CATCH_FOR_BNC_SEMTRANS_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bnc_semtrans_queue_processed_items(self, processed_items);
                            set_bnc_semtrans_queue_semtrans_lexicon(self, v_semtrans_lexicon);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bnc_semtrans_queue_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_BNC_SEMTRANS_QUEUE_METHOD);
            }
            return catch_var_for_bnc_semtrans_queue_method;
        }
    }

    public static final SubLObject bnc_semtrans_queue_enqueue_processed_method(SubLObject self, SubLObject line) {
        {
            SubLObject catch_var_for_bnc_semtrans_queue_method = NIL;
            SubLObject admissible_pos = get_bnc_semtrans_queue_admissible_pos(self);
            SubLObject processed_items = get_bnc_semtrans_queue_processed_items(self);
            SubLObject v_semtrans_lexicon = get_bnc_semtrans_queue_semtrans_lexicon(self);
            SubLObject verbose = get_bnc_frequency_queue_verbose(self);
            try {
                try {
                    SubLTrampolineFile.checkType(line, STRINGP);
                    if (NIL != verbose) {
                        format(T, $str_alt75$___S, line);
                    }
                    {
                        SubLObject tokens = string_utilities.string_tokenize(line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject word = second(tokens);
                        SubLObject pos = third(tokens);
                        if (NIL != subl_promotions.memberP(pos, admissible_pos, symbol_function(EQUAL), UNPROVIDED)) {
                            {
                                SubLObject lexes = methods.funcall_instance_method_with_1_args(v_semtrans_lexicon, GET, word);
                                if (!((NIL != lexes) || (NIL != gethash(word, processed_items, UNPROVIDED)))) {
                                    methods.funcall_instance_method_with_1_args(self, ENQUEUE, word);
                                    sethash(word, processed_items, T);
                                }
                            }
                        }
                    }
                    sublisp_throw($sym74$OUTER_CATCH_FOR_BNC_SEMTRANS_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bnc_semtrans_queue_admissible_pos(self, admissible_pos);
                            set_bnc_semtrans_queue_processed_items(self, processed_items);
                            set_bnc_semtrans_queue_semtrans_lexicon(self, v_semtrans_lexicon);
                            set_bnc_frequency_queue_verbose(self, verbose);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bnc_semtrans_queue_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_BNC_SEMTRANS_QUEUE_METHOD);
            }
            return catch_var_for_bnc_semtrans_queue_method;
        }
    }

    public static final SubLObject bnc_semtrans_queue_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt81$BNCSemTransQueue__S_, methods.funcall_instance_method_with_0_args(self, GET_ELEMENT_COUNT));
        return self;
    }

    // defvar
    private static final SubLSymbol $scalar_predicates_anchors$ = makeSymbol("*SCALAR-PREDICATES-ANCHORS*");

    // defvar
    private static final SubLSymbol $typical_size_queue_object$ = makeSymbol("*TYPICAL-SIZE-QUEUE-OBJECT*");

    // defvar
    private static final SubLSymbol $current_typical_size_queue_object_user$ = makeSymbol("*CURRENT-TYPICAL-SIZE-QUEUE-OBJECT-USER*");

    public static final SubLObject set_typical_size_queue_object_user(SubLObject cyclist) {
        if (NIL == isa.isa_in_any_mtP(cyclist, $$CurrentCycorpEmployee)) {
            Errors.warn($str_alt85$___S_is_not_a___CurrentCycorpEmpl);
            return NIL;
        }
        $current_typical_size_queue_object_user$.setDynamicValue(cyclist);
        return T;
    }

    public static final SubLObject reset_typical_size_queue_object() {
        $typical_size_queue_object$.setDynamicValue(NIL);
        $current_typical_size_queue_object_user$.setDynamicValue(NIL);
        return T;
    }

    public static final SubLObject get_typical_size_queue_processed_items(SubLObject typical_size_queue) {
        return classes.subloop_get_access_protected_instance_slot(typical_size_queue, EIGHT_INTEGER, PROCESSED_ITEMS);
    }

    public static final SubLObject set_typical_size_queue_processed_items(SubLObject typical_size_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(typical_size_queue, value, EIGHT_INTEGER, PROCESSED_ITEMS);
    }

    public static final SubLObject get_typical_size_queue_predicate_dossiers(SubLObject typical_size_queue) {
        return classes.subloop_get_access_protected_instance_slot(typical_size_queue, SEVEN_INTEGER, PREDICATE_DOSSIERS);
    }

    public static final SubLObject set_typical_size_queue_predicate_dossiers(SubLObject typical_size_queue, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(typical_size_queue, value, SEVEN_INTEGER, PREDICATE_DOSSIERS);
    }

    public static final SubLObject get_typical_size_queue_admissible_pos(SubLObject typical_size_queue) {
        {
            SubLObject v_class = (typical_size_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(typical_size_queue))) : NIL != subloop_structures.class_p(typical_size_queue) ? ((SubLObject) (typical_size_queue)) : NIL != subloop_structures.instance_p(typical_size_queue) ? ((SubLObject) (subloop_structures.instance_class(typical_size_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(ADMISSIBLE_POS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_typical_size_queue_admissible_pos(SubLObject typical_size_queue, SubLObject value) {
        {
            SubLObject v_class = (typical_size_queue.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(typical_size_queue))) : NIL != subloop_structures.class_p(typical_size_queue) ? ((SubLObject) (typical_size_queue)) : NIL != subloop_structures.instance_p(typical_size_queue) ? ((SubLObject) (subloop_structures.instance_class(typical_size_queue))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(ADMISSIBLE_POS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_typical_size_queue_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, WATERMARK_HIGH, $int$25);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, WATERMARK_LOW, FIFTEEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, TYPICAL_SIZE_QUEUE, ADMISSIBLE_POS, $list_alt89);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_typical_size_queue_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, FIRST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, LAST_CONS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE, PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, WORKFLOW_QUEUE, QUEUE_FILLER_TASK, NIL);
        classes.subloop_initialize_slot(new_instance, BNC_FREQUENCY_QUEUE, BNC_FILE, NIL);
        classes.subloop_initialize_slot(new_instance, BNC_FREQUENCY_QUEUE, VERBOSE, NIL);
        classes.subloop_initialize_slot(new_instance, TYPICAL_SIZE_QUEUE, PREDICATE_DOSSIERS, NIL);
        classes.subloop_initialize_slot(new_instance, TYPICAL_SIZE_QUEUE, PROCESSED_ITEMS, NIL);
        return NIL;
    }

    public static final SubLObject typical_size_queue_p(SubLObject typical_size_queue) {
        return classes.subloop_instanceof_class(typical_size_queue, TYPICAL_SIZE_QUEUE);
    }

    public static final SubLObject typical_size_queue_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_typical_size_queue_method = NIL;
            SubLObject processed_items = get_typical_size_queue_processed_items(self);
            try {
                try {
                    bnc_frequency_queue_initialize_method(self);
                    processed_items = make_hash_table($int$32, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym93$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_typical_size_queue_processed_items(self, processed_items);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_typical_size_queue_method = Errors.handleThrowable(ccatch_env_var, $sym93$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD);
            }
            return catch_var_for_typical_size_queue_method;
        }
    }

    public static final SubLObject typical_size_queue_compute_predicate_dossiers_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_typical_size_queue_method = NIL;
                SubLObject predicate_dossiers = get_typical_size_queue_predicate_dossiers(self);
                try {
                    try {
                        {
                            SubLObject cdolist_list_var = $scalar_predicates_anchors$.getDynamicValue(thread);
                            SubLObject predicate = NIL;
                            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                                predicate_dossiers = cons(apply(symbol_function(NEW_SIZE_PREDICATE_DOSSIER), predicate), predicate_dossiers);
                            }
                            sublisp_throw($sym97$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD, self);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_typical_size_queue_predicate_dossiers(self, predicate_dossiers);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_typical_size_queue_method = Errors.handleThrowable(ccatch_env_var, $sym97$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD);
                }
                return catch_var_for_typical_size_queue_method;
            }
        }
    }

    public static final SubLObject typical_size_queue_get_decorated_units_method(SubLObject self, SubLObject predicate, SubLObject type) {
        {
            SubLObject catch_var_for_typical_size_queue_method = NIL;
            SubLObject predicate_dossiers = get_typical_size_queue_predicate_dossiers(self);
            try {
                try {
                    {
                        SubLObject decorated_units = NIL;
                        if (NIL == decorated_units) {
                            {
                                SubLObject csome_list_var = predicate_dossiers;
                                SubLObject dossier = NIL;
                                for (dossier = csome_list_var.first(); !((NIL != decorated_units) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , dossier = csome_list_var.first()) {
                                    if (instances.get_slot(dossier, PREDICATE).eql(predicate)) {
                                        {
                                            SubLObject d_units_for_type = NIL;
                                            SubLObject pcase_var = type;
                                            if (pcase_var.eql($METRIC)) {
                                                d_units_for_type = instances.get_slot(dossier, METRIC_UNITS);
                                            } else
                                                if (pcase_var.eql($FPS)) {
                                                    d_units_for_type = instances.get_slot(dossier, FPS_UNITS);
                                                }

                                            {
                                                SubLObject cdolist_list_var = d_units_for_type;
                                                SubLObject unit = NIL;
                                                for (unit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unit = cdolist_list_var.first()) {
                                                    decorated_units = cons(methods.funcall_instance_method_with_0_args(unit, TO_LIST), decorated_units);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym103$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD, decorated_units);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_typical_size_queue_predicate_dossiers(self, predicate_dossiers);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_typical_size_queue_method = Errors.handleThrowable(ccatch_env_var, $sym103$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD);
            }
            return catch_var_for_typical_size_queue_method;
        }
    }

    public static final SubLObject typical_size_queue_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt112$TypicalSizeQueue__S_, methods.funcall_instance_method_with_0_args(self, GET_ELEMENT_COUNT));
        return self;
    }

    public static final SubLObject typical_size_queue_enqueue_processed_method(SubLObject self, SubLObject line) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_typical_size_queue_method = NIL;
                SubLObject admissible_pos = get_typical_size_queue_admissible_pos(self);
                SubLObject processed_items = get_typical_size_queue_processed_items(self);
                try {
                    try {
                        SubLTrampolineFile.checkType(line, STRINGP);
                        format(T, $str_alt75$___S, line);
                        {
                            SubLObject tokens = string_utilities.string_tokenize(line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject word = second(tokens);
                            SubLObject pos = third(tokens);
                            if (NIL != subl_promotions.memberP(pos, admissible_pos, symbol_function(EQUAL), UNPROVIDED)) {
                                {
                                    SubLObject denots = list_utilities.remove_if_not(EL_FORT_P, nl_trie_accessors.nl_trie_all_denots_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                            {
                                                SubLObject cdolist_list_var = denots;
                                                SubLObject denot = NIL;
                                                for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                                    if (!(((((NIL != gethash(denot, processed_items, UNPROVIDED)) || (NIL != genls.genlP(denot, $$Event, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(denot, $$Group, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(denot, $$Organization, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(denot, $$HomoSapiens, UNPROVIDED, UNPROVIDED)))) {
                                                        if (((((NIL != term.el_fort_p(denot)) && (NIL != kb_indexing_datastructures.indexed_term_p(denot))) && (NIL != isa.isaP(denot, $$ObjectType, UNPROVIDED, UNPROVIDED))) && (NIL != genls.genlP(denot, $$PartiallyTangible, UNPROVIDED, UNPROVIDED))) && (NIL != find_size_predicates_for_term(denot))) {
                                                            sethash(denot, processed_items, T);
                                                            methods.funcall_instance_method_with_1_args(self, ENQUEUE, new_typical_size_harvestable_item(denot));
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
                        }
                        sublisp_throw($sym115$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_typical_size_queue_admissible_pos(self, admissible_pos);
                                set_typical_size_queue_processed_items(self, processed_items);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_typical_size_queue_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD);
                }
                return catch_var_for_typical_size_queue_method;
            }
        }
    }

    public static final SubLObject type_appropriate_unit(SubLObject unit) {
        {
            SubLObject template = $list_alt126;
            SubLObject query = listS($$and, listS($$isa, unit, $list_alt129), $list_alt130);
            SubLObject standard = second(ask_utilities.ask_template(template, query, $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first());
            if ((NIL != standard) && (NIL != quantities.unit_multiplication_factor(unit, standard, $$EverythingPSC))) {
                if (NIL != isa.isa_in_any_mtP(unit, $$FPSUnitOfMeasure)) {
                    return $FPS;
                } else
                    if (NIL != isa.isa_in_any_mtP(unit, $$MKSUnitOfMeasure)) {
                        return $METRIC;
                    } else
                        if (NIL != isa.isa_in_any_mtP(unit, $$CGSUnitOfMeasure)) {
                            return $METRIC;
                        } else {
                            return $OTHER;
                        }


            }
        }
        return NIL;
    }

    public static final SubLObject compute_size_harvesting_personnel() {
        return $list_alt135;
    }

    /**
     *
     *
     * @return T
    As a side effect it computes which Cyclists are available
    to work on the task of describing the size of objects, and
    sends to each of them an e-mail message with an indication
    of which concepts in the ontology need that kind of work.
     * @unknown bertolo
     */
    public static final SubLObject assign_daily_size_harvesting_tasks() {
        {
            SubLObject name_address_pairs = NIL;
            {
                SubLObject cdolist_list_var = compute_size_harvesting_personnel();
                SubLObject worker = NIL;
                for (worker = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , worker = cdolist_list_var.first()) {
                    {
                        SubLObject name = kb_mapping_utilities.fpred_value_in_mt(worker, $$givenNames, $$EnglishMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject address = kb_accessors.email_address_text(worker);
                        if (name.isString() && address.isString()) {
                            name_address_pairs = cons(list(name, address), name_address_pairs);
                        }
                    }
                }
            }
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(TWENTY_INTEGER); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject cdolist_list_var = name_address_pairs;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            apply(symbol_function(MAIL_SIZE_HARVESTING_REQUEST), pair);
                        }
                    }
                }
            }
            return T;
        }
    }

    // defconstant
    private static final SubLSymbol $typical_size_harvest_scheduler_form$ = makeSymbol("*TYPICAL-SIZE-HARVEST-SCHEDULER-FORM*");

    public static final SubLObject mail_size_harvesting_request(SubLObject worker_name, SubLObject address) {
        SubLTrampolineFile.checkType(address, STRINGP);
        {
            SubLObject item = methods.funcall_instance_method_with_0_args(get_typical_size_queue_object(), DEQUEUE);
            if (NIL != typical_size_harvestable_item_p(item)) {
                {
                    SubLObject datum = methods.funcall_instance_method_with_0_args(item, TO_LIST);
                    SubLObject current = datum;
                    SubLObject target = NIL;
                    SubLObject paraphrase = NIL;
                    SubLObject target_mt = NIL;
                    SubLObject long_explanation = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    target = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    paraphrase = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    target_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    long_explanation = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject message = format(NIL, $typical_size_harvest_scheduler_form$.getGlobalValue(), worker_name, target);
                            SubLObject subject = format(NIL, $str_alt141$Size_Harvesting___S, target);
                            SubLObject sender = $str_alt142$cyc_cyc_com;
                            mail_utilities.mail_message(sender, address, message, subject, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt140);
                    }
                }
            }
            return T;
        }
    }

    public static final SubLObject get_typical_size_queue_object() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $typical_size_queue_object$.getDynamicValue(thread)) {
                $typical_size_queue_object$.setDynamicValue(object.new_class_instance(TYPICAL_SIZE_QUEUE), thread);
                methods.funcall_instance_method_with_0_args($typical_size_queue_object$.getDynamicValue(thread), COMPUTE_PREDICATE_DOSSIERS);
                methods.funcall_instance_method_with_0_args($typical_size_queue_object$.getDynamicValue(thread), START_FILLER_THREAD);
            }
            return $typical_size_queue_object$.getDynamicValue(thread);
        }
    }

    public static final SubLObject get_size_predicates() {
        {
            SubLObject predicate_dossiers = instances.get_slot(get_typical_size_queue_object(), PREDICATE_DOSSIERS);
            SubLObject pairs = NIL;
            SubLObject cdolist_list_var = predicate_dossiers;
            SubLObject dossier = NIL;
            for (dossier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dossier = cdolist_list_var.first()) {
                pairs = cons(list(instances.get_slot(dossier, PREDICATE), instances.get_slot(dossier, PARAPHRASE)), pairs);
            }
            return pairs;
        }
    }

    public static final SubLObject get_decorated_metric_units_for_predicate(SubLObject predicate) {
        return methods.funcall_instance_method_with_2_args(get_typical_size_queue_object(), GET_DECORATED_UNITS, predicate, $METRIC);
    }

    public static final SubLObject get_decorated_fps_units_for_predicate(SubLObject predicate) {
        return methods.funcall_instance_method_with_2_args(get_typical_size_queue_object(), GET_DECORATED_UNITS, predicate, $FPS);
    }

    /**
     *
     *
     * @param TERM,
     * 		fort-p
     * @return list-p
     * @unknown bertolo
    Returns a list of pairs <PRED STRING> such that PRED is a size predicate
    that can be applied to TERM but for which the KB doesn't yet have a value
    and STRING is its English paraphrase.
     */
    public static final SubLObject find_size_predicates_for_term(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == kb_indexing_datastructures.indexed_term_p(v_term)) {
                return NIL;
            }
            {
                SubLObject predicates_covered = NIL;
                SubLObject pairs = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        predicates_covered = kb_mapping_utilities.pred_values(v_term, $$relationAllInstance, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = instances.get_slot(get_typical_size_queue_object(), PREDICATE_DOSSIERS);
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        {
                            SubLObject args = instances.get_slot(pred, ARGUMENT_TYPES);
                            SubLObject predicate = instances.get_slot(pred, PREDICATE);
                            SubLObject fail = NIL;
                            if (NIL == subl_promotions.memberP(predicate, predicates_covered, UNPROVIDED, UNPROVIDED)) {
                                if (NIL == fail) {
                                    {
                                        SubLObject csome_list_var = args;
                                        SubLObject arg = NIL;
                                        for (arg = csome_list_var.first(); !((NIL != fail) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                            if (NIL == genls.genl_in_any_mtP(v_term, arg)) {
                                                fail = T;
                                            }
                                        }
                                    }
                                }
                                if (NIL == fail) {
                                    pairs = cons(list(predicate, instances.get_slot(pred, PARAPHRASE)), pairs);
                                }
                            }
                        }
                    }
                }
                return pairs;
            }
        }
    }

    public static final SubLObject typical_size_queue_is_emptyP() {
        return makeBoolean(NIL == methods.funcall_instance_method_with_0_args(get_typical_size_queue_object(), PEEK));
    }

    public static final SubLObject finalize_typical_size_queue() {
        methods.funcall_instance_method_with_0_args(get_typical_size_queue_object(), KILL_FILLER_THREAD);
        $typical_size_queue_object$.setDynamicValue(NIL);
        return T;
    }

    public static final SubLObject next_item_from_typical_size_queue() {
        return methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(get_typical_size_queue_object(), DEQUEUE), TO_LIST);
    }

    public static final SubLObject mail_typical_size_bug(SubLObject fort, SubLObject predicate) {
        return methods.funcall_instance_method_with_2_args(get_typical_size_queue_object(), MAIL_BUG, fort, predicate);
    }

    public static final SubLObject larger_decorated_unit_p(SubLObject unit1, SubLObject unit2) {
        {
            SubLObject u1 = instances.get_slot(unit1, UNIT);
            SubLObject u2 = instances.get_slot(unit2, UNIT);
            return numL(quantities.unit_multiplication_factor(u1, u2, $$EverythingPSC), ONE_INTEGER);
        }
    }

    public static final SubLObject get_decorated_unit_order_of_magnitude(SubLObject decorated_unit) {
        return classes.subloop_get_access_protected_instance_slot(decorated_unit, THREE_INTEGER, ORDER_OF_MAGNITUDE);
    }

    public static final SubLObject set_decorated_unit_order_of_magnitude(SubLObject decorated_unit, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(decorated_unit, value, THREE_INTEGER, ORDER_OF_MAGNITUDE);
    }

    public static final SubLObject get_decorated_unit_paraphrase(SubLObject decorated_unit) {
        return classes.subloop_get_access_protected_instance_slot(decorated_unit, TWO_INTEGER, PARAPHRASE);
    }

    public static final SubLObject set_decorated_unit_paraphrase(SubLObject decorated_unit, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(decorated_unit, value, TWO_INTEGER, PARAPHRASE);
    }

    public static final SubLObject get_decorated_unit_unit(SubLObject decorated_unit) {
        return classes.subloop_get_access_protected_instance_slot(decorated_unit, ONE_INTEGER, UNIT);
    }

    public static final SubLObject set_decorated_unit_unit(SubLObject decorated_unit, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(decorated_unit, value, ONE_INTEGER, UNIT);
    }

    public static final SubLObject subloop_reserved_initialize_decorated_unit_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_decorated_unit_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, DECORATED_UNIT, UNIT, NIL);
        classes.subloop_initialize_slot(new_instance, DECORATED_UNIT, PARAPHRASE, NIL);
        classes.subloop_initialize_slot(new_instance, DECORATED_UNIT, ORDER_OF_MAGNITUDE, NIL);
        return NIL;
    }

    public static final SubLObject decorated_unit_p(SubLObject decorated_unit) {
        return classes.subloop_instanceof_class(decorated_unit, DECORATED_UNIT);
    }

    public static final SubLObject decorated_unit_to_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_decorated_unit_method = NIL;
            SubLObject order_of_magnitude = get_decorated_unit_order_of_magnitude(self);
            SubLObject paraphrase = get_decorated_unit_paraphrase(self);
            SubLObject unit = get_decorated_unit_unit(self);
            try {
                try {
                    sublisp_throw($sym155$OUTER_CATCH_FOR_DECORATED_UNIT_METHOD, list(unit, paraphrase, order_of_magnitude));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_decorated_unit_order_of_magnitude(self, order_of_magnitude);
                            set_decorated_unit_paraphrase(self, paraphrase);
                            set_decorated_unit_unit(self, unit);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_decorated_unit_method = Errors.handleThrowable(ccatch_env_var, $sym155$OUTER_CATCH_FOR_DECORATED_UNIT_METHOD);
            }
            return catch_var_for_decorated_unit_method;
        }
    }

    public static final SubLObject get_size_predicate_dossier_fps_units(SubLObject size_predicate_dossier) {
        return classes.subloop_get_access_protected_instance_slot(size_predicate_dossier, SEVEN_INTEGER, FPS_UNITS);
    }

    public static final SubLObject set_size_predicate_dossier_fps_units(SubLObject size_predicate_dossier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(size_predicate_dossier, value, SEVEN_INTEGER, FPS_UNITS);
    }

    public static final SubLObject get_size_predicate_dossier_fps_anchor(SubLObject size_predicate_dossier) {
        return classes.subloop_get_access_protected_instance_slot(size_predicate_dossier, SIX_INTEGER, FPS_ANCHOR);
    }

    public static final SubLObject set_size_predicate_dossier_fps_anchor(SubLObject size_predicate_dossier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(size_predicate_dossier, value, SIX_INTEGER, FPS_ANCHOR);
    }

    public static final SubLObject get_size_predicate_dossier_metric_anchor(SubLObject size_predicate_dossier) {
        return classes.subloop_get_access_protected_instance_slot(size_predicate_dossier, FIVE_INTEGER, METRIC_ANCHOR);
    }

    public static final SubLObject set_size_predicate_dossier_metric_anchor(SubLObject size_predicate_dossier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(size_predicate_dossier, value, FIVE_INTEGER, METRIC_ANCHOR);
    }

    public static final SubLObject get_size_predicate_dossier_metric_units(SubLObject size_predicate_dossier) {
        return classes.subloop_get_access_protected_instance_slot(size_predicate_dossier, FOUR_INTEGER, METRIC_UNITS);
    }

    public static final SubLObject set_size_predicate_dossier_metric_units(SubLObject size_predicate_dossier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(size_predicate_dossier, value, FOUR_INTEGER, METRIC_UNITS);
    }

    public static final SubLObject get_size_predicate_dossier_argument_types(SubLObject size_predicate_dossier) {
        return classes.subloop_get_access_protected_instance_slot(size_predicate_dossier, THREE_INTEGER, ARGUMENT_TYPES);
    }

    public static final SubLObject set_size_predicate_dossier_argument_types(SubLObject size_predicate_dossier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(size_predicate_dossier, value, THREE_INTEGER, ARGUMENT_TYPES);
    }

    public static final SubLObject get_size_predicate_dossier_paraphrase(SubLObject size_predicate_dossier) {
        return classes.subloop_get_access_protected_instance_slot(size_predicate_dossier, TWO_INTEGER, PARAPHRASE);
    }

    public static final SubLObject set_size_predicate_dossier_paraphrase(SubLObject size_predicate_dossier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(size_predicate_dossier, value, TWO_INTEGER, PARAPHRASE);
    }

    public static final SubLObject get_size_predicate_dossier_predicate(SubLObject size_predicate_dossier) {
        return classes.subloop_get_access_protected_instance_slot(size_predicate_dossier, ONE_INTEGER, PREDICATE);
    }

    public static final SubLObject set_size_predicate_dossier_predicate(SubLObject size_predicate_dossier, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(size_predicate_dossier, value, ONE_INTEGER, PREDICATE);
    }

    public static final SubLObject get_size_predicate_dossier_order_of_magnitude_map(SubLObject size_predicate_dossier) {
        {
            SubLObject v_class = (size_predicate_dossier.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(size_predicate_dossier))) : NIL != subloop_structures.class_p(size_predicate_dossier) ? ((SubLObject) (size_predicate_dossier)) : NIL != subloop_structures.instance_p(size_predicate_dossier) ? ((SubLObject) (subloop_structures.instance_class(size_predicate_dossier))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(ORDER_OF_MAGNITUDE_MAP, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_size_predicate_dossier_order_of_magnitude_map(SubLObject size_predicate_dossier, SubLObject value) {
        {
            SubLObject v_class = (size_predicate_dossier.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(size_predicate_dossier))) : NIL != subloop_structures.class_p(size_predicate_dossier) ? ((SubLObject) (size_predicate_dossier)) : NIL != subloop_structures.instance_p(size_predicate_dossier) ? ((SubLObject) (subloop_structures.instance_class(size_predicate_dossier))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(ORDER_OF_MAGNITUDE_MAP, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_size_predicate_dossier_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SIZE_PREDICATE_DOSSIER, ORDER_OF_MAGNITUDE_MAP, listS(list($$$micro, invert($int$1000000000)), list($$$tiny, invert($int$1000)), list($$$small, invert(TEN_INTEGER)), $list_alt167));
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_size_predicate_dossier_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SIZE_PREDICATE_DOSSIER, PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, SIZE_PREDICATE_DOSSIER, PARAPHRASE, NIL);
        classes.subloop_initialize_slot(new_instance, SIZE_PREDICATE_DOSSIER, ARGUMENT_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, SIZE_PREDICATE_DOSSIER, METRIC_UNITS, NIL);
        classes.subloop_initialize_slot(new_instance, SIZE_PREDICATE_DOSSIER, METRIC_ANCHOR, NIL);
        classes.subloop_initialize_slot(new_instance, SIZE_PREDICATE_DOSSIER, FPS_ANCHOR, NIL);
        classes.subloop_initialize_slot(new_instance, SIZE_PREDICATE_DOSSIER, FPS_UNITS, NIL);
        return NIL;
    }

    public static final SubLObject size_predicate_dossier_p(SubLObject size_predicate_dossier) {
        return classes.subloop_instanceof_class(size_predicate_dossier, SIZE_PREDICATE_DOSSIER);
    }

    public static final SubLObject size_predicate_dossier_order_of_magnitude_assignment_method(SubLObject self, SubLObject anchor, SubLObject unit) {
        {
            SubLObject catch_var_for_size_predicate_dossier_method = NIL;
            SubLObject order_of_magnitude_map = get_size_predicate_dossier_order_of_magnitude_map(self);
            try {
                try {
                    {
                        SubLObject factor = quantities.unit_multiplication_factor(unit, anchor, $$EverythingPSC);
                        if (factor.isNumber()) {
                            {
                                SubLObject unit_1 = order_of_magnitude_map.first();
                                SubLObject assignment = unit_1.first();
                                SubLObject oom_num = second(unit_1);
                                SubLObject best_score = (factor.numG(oom_num)) ? ((SubLObject) (divide(oom_num, factor))) : divide(factor, oom_num);
                                SubLObject cdolist_list_var = order_of_magnitude_map.rest();
                                SubLObject oom = NIL;
                                for (oom = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , oom = cdolist_list_var.first()) {
                                    {
                                        SubLObject new_assignment = oom.first();
                                        SubLObject compare = second(oom);
                                        SubLObject new_score = (factor.numG(compare)) ? ((SubLObject) (divide(compare, factor))) : divide(factor, compare);
                                        if (new_score.numG(best_score)) {
                                            best_score = new_score;
                                            assignment = new_assignment;
                                        }
                                    }
                                }
                                sublisp_throw($sym173$OUTER_CATCH_FOR_SIZE_PREDICATE_DOSSIER_METHOD, assignment);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_size_predicate_dossier_order_of_magnitude_map(self, order_of_magnitude_map);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_size_predicate_dossier_method = Errors.handleThrowable(ccatch_env_var, $sym173$OUTER_CATCH_FOR_SIZE_PREDICATE_DOSSIER_METHOD);
            }
            return catch_var_for_size_predicate_dossier_method;
        }
    }

    public static final SubLObject new_size_predicate_dossier(SubLObject predicate, SubLObject metric_anchor, SubLObject fps_anchor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_new = object.new_class_instance(SIZE_PREDICATE_DOSSIER);
                SubLObject metric_units = NIL;
                SubLObject fps_units = NIL;
                SubLObject units_handled = NIL;
                instances.set_slot(v_new, PREDICATE, predicate);
                instances.set_slot(v_new, METRIC_ANCHOR, metric_anchor);
                instances.set_slot(v_new, FPS_ANCHOR, fps_anchor);
                instances.set_slot(v_new, PARAPHRASE, pph_main.generate_phrase(predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                instances.set_slot(v_new, ARGUMENT_TYPES, kb_mapping_utilities.pred_values_in_any_mt(predicate, $$arg1Isa, ONE_INTEGER, TWO_INTEGER, UNPROVIDED));
                {
                    SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(predicate, $$arg2Isa, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                    SubLObject type = NIL;
                    for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                        {
                            SubLObject type_specs = NIL;
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    type_specs = genls.all_specs(type, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                            {
                                SubLObject cdolist_list_var_2 = type_specs;
                                SubLObject type_spec = NIL;
                                for (type_spec = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , type_spec = cdolist_list_var_2.first()) {
                                    {
                                        SubLObject cdolist_list_var_3 = kb_mapping_utilities.pred_values_in_any_mt(type_spec, $$resultIsa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                        SubLObject unit = NIL;
                                        for (unit = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , unit = cdolist_list_var_3.first()) {
                                            if (NIL == subl_promotions.memberP(unit, units_handled, UNPROVIDED, UNPROVIDED)) {
                                                units_handled = cons(unit, units_handled);
                                                {
                                                    SubLObject order_of_magnitude = methods.funcall_instance_method_with_2_args(v_new, ORDER_OF_MAGNITUDE_ASSIGNMENT, third(assoc(predicate, $scalar_predicates_anchors$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)), unit);
                                                    if (NIL != order_of_magnitude) {
                                                        {
                                                            SubLObject decorated_unit = object.new_class_instance(DECORATED_UNIT);
                                                            instances.set_slot(decorated_unit, UNIT, unit);
                                                            instances.set_slot(decorated_unit, PARAPHRASE, pph_main.generate_phrase(unit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                            instances.set_slot(decorated_unit, ORDER_OF_MAGNITUDE, order_of_magnitude);
                                                            {
                                                                SubLObject pcase_var = type_appropriate_unit(unit);
                                                                if (pcase_var.eql($METRIC)) {
                                                                    metric_units = cons(decorated_unit, metric_units);
                                                                } else
                                                                    if (pcase_var.eql($FPS)) {
                                                                        fps_units = cons(decorated_unit, fps_units);
                                                                    } else
                                                                        if (pcase_var.eql($OTHER)) {
                                                                            metric_units = cons(decorated_unit, metric_units);
                                                                            fps_units = cons(decorated_unit, fps_units);
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
                instances.set_slot(v_new, METRIC_UNITS, Sort.sort(metric_units, symbol_function(LARGER_DECORATED_UNIT_P), UNPROVIDED));
                instances.set_slot(v_new, FPS_UNITS, Sort.sort(fps_units, symbol_function(LARGER_DECORATED_UNIT_P), UNPROVIDED));
                return v_new;
            }
        }
    }

    public static final SubLObject get_typical_size_harvestable_item_target_mt(SubLObject typical_size_harvestable_item) {
        return classes.subloop_get_access_protected_instance_slot(typical_size_harvestable_item, FOUR_INTEGER, TARGET_MT);
    }

    public static final SubLObject set_typical_size_harvestable_item_target_mt(SubLObject typical_size_harvestable_item, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(typical_size_harvestable_item, value, FOUR_INTEGER, TARGET_MT);
    }

    public static final SubLObject get_typical_size_harvestable_item_clarification(SubLObject typical_size_harvestable_item) {
        return classes.subloop_get_access_protected_instance_slot(typical_size_harvestable_item, THREE_INTEGER, CLARIFICATION);
    }

    public static final SubLObject set_typical_size_harvestable_item_clarification(SubLObject typical_size_harvestable_item, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(typical_size_harvestable_item, value, THREE_INTEGER, CLARIFICATION);
    }

    public static final SubLObject get_typical_size_harvestable_item_paraphrase(SubLObject typical_size_harvestable_item) {
        return classes.subloop_get_access_protected_instance_slot(typical_size_harvestable_item, TWO_INTEGER, PARAPHRASE);
    }

    public static final SubLObject set_typical_size_harvestable_item_paraphrase(SubLObject typical_size_harvestable_item, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(typical_size_harvestable_item, value, TWO_INTEGER, PARAPHRASE);
    }

    public static final SubLObject get_typical_size_harvestable_item_cyc_fort(SubLObject typical_size_harvestable_item) {
        return classes.subloop_get_access_protected_instance_slot(typical_size_harvestable_item, ONE_INTEGER, CYC_FORT);
    }

    public static final SubLObject set_typical_size_harvestable_item_cyc_fort(SubLObject typical_size_harvestable_item, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(typical_size_harvestable_item, value, ONE_INTEGER, CYC_FORT);
    }

    public static final SubLObject subloop_reserved_initialize_typical_size_harvestable_item_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_typical_size_harvestable_item_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TYPICAL_SIZE_HARVESTABLE_ITEM, CYC_FORT, NIL);
        classes.subloop_initialize_slot(new_instance, TYPICAL_SIZE_HARVESTABLE_ITEM, PARAPHRASE, NIL);
        classes.subloop_initialize_slot(new_instance, TYPICAL_SIZE_HARVESTABLE_ITEM, CLARIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, TYPICAL_SIZE_HARVESTABLE_ITEM, TARGET_MT, NIL);
        return NIL;
    }

    public static final SubLObject typical_size_harvestable_item_p(SubLObject typical_size_harvestable_item) {
        return classes.subloop_instanceof_class(typical_size_harvestable_item, TYPICAL_SIZE_HARVESTABLE_ITEM);
    }

    public static final SubLObject typical_size_harvestable_item_to_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_typical_size_harvestable_item_method = NIL;
            SubLObject target_mt = get_typical_size_harvestable_item_target_mt(self);
            SubLObject clarification = get_typical_size_harvestable_item_clarification(self);
            SubLObject paraphrase = get_typical_size_harvestable_item_paraphrase(self);
            SubLObject cyc_fort = get_typical_size_harvestable_item_cyc_fort(self);
            try {
                try {
                    sublisp_throw($sym187$OUTER_CATCH_FOR_TYPICAL_SIZE_HARVESTABLE_ITEM_METHOD, list(cyc_fort, paraphrase, target_mt, clarification));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_typical_size_harvestable_item_target_mt(self, target_mt);
                            set_typical_size_harvestable_item_clarification(self, clarification);
                            set_typical_size_harvestable_item_paraphrase(self, paraphrase);
                            set_typical_size_harvestable_item_cyc_fort(self, cyc_fort);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_typical_size_harvestable_item_method = Errors.handleThrowable(ccatch_env_var, $sym187$OUTER_CATCH_FOR_TYPICAL_SIZE_HARVESTABLE_ITEM_METHOD);
            }
            return catch_var_for_typical_size_harvestable_item_method;
        }
    }

    public static final SubLObject typical_size_harvestable_item_self_complete_method(SubLObject self) {
        {
            SubLObject catch_var_for_typical_size_harvestable_item_method = NIL;
            SubLObject clarification = get_typical_size_harvestable_item_clarification(self);
            SubLObject paraphrase = get_typical_size_harvestable_item_paraphrase(self);
            SubLObject cyc_fort = get_typical_size_harvestable_item_cyc_fort(self);
            try {
                try {
                    if (NIL != cyc_fort) {
                        {
                            SubLObject salient_gens = pph_utilities.pph_salient_generalizations(cyc_fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject string = pph_main.generate_phrase(salient_gens.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = salient_gens.rest();
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                {
                                    SubLObject item_phrase = pph_main.generate_phrase(item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    string = cconcatenate(item_phrase, new SubLObject[]{ $str_alt192$__, string });
                                }
                            }
                            clarification = string;
                        }
                        paraphrase = pph_main.generate_phrase(cyc_fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        methods.funcall_instance_method_with_0_args(self, SET_TARGET_MT);
                    }
                    sublisp_throw($sym191$OUTER_CATCH_FOR_TYPICAL_SIZE_HARVESTABLE_ITEM_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_typical_size_harvestable_item_clarification(self, clarification);
                            set_typical_size_harvestable_item_paraphrase(self, paraphrase);
                            set_typical_size_harvestable_item_cyc_fort(self, cyc_fort);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_typical_size_harvestable_item_method = Errors.handleThrowable(ccatch_env_var, $sym191$OUTER_CATCH_FOR_TYPICAL_SIZE_HARVESTABLE_ITEM_METHOD);
            }
            return catch_var_for_typical_size_harvestable_item_method;
        }
    }

    public static final SubLObject typical_size_harvestable_item_set_target_mt_method(SubLObject self) {
        {
            SubLObject catch_var_for_typical_size_harvestable_item_method = NIL;
            SubLObject target_mt = get_typical_size_harvestable_item_target_mt(self);
            SubLObject cyc_fort = get_typical_size_harvestable_item_cyc_fort(self);
            try {
                try {
                    if (NIL != cyc_fort) {
                        {
                            SubLObject defining_mt = backward.removal_ask_variable($MT, listS($$definingMt, cyc_fort, $list_alt199), $$EverythingPSC, $TRUE, UNPROVIDED).first();
                            SubLObject candidate_mt = NIL;
                            if (NIL != defining_mt) {
                                if (NIL != isa.isa_in_any_mtP(defining_mt, $$VocabularyMicrotheory)) {
                                    {
                                        SubLObject candidates = backward.removal_ask_variable($MT, list($$genlMt_Vocabulary, $MT, defining_mt), $$EverythingPSC, $TRUE, UNPROVIDED);
                                        if (NIL == candidate_mt) {
                                            {
                                                SubLObject csome_list_var = candidates;
                                                SubLObject candidate = NIL;
                                                for (candidate = csome_list_var.first(); !((NIL != candidate_mt) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , candidate = csome_list_var.first()) {
                                                    if (NIL != forts.fort_p(candidate)) {
                                                        candidate_mt = candidate;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != forts.fort_p(candidate_mt)) {
                                target_mt = candidate_mt;
                                sublisp_throw($sym196$OUTER_CATCH_FOR_TYPICAL_SIZE_HARVESTABLE_ITEM_METHOD, self);
                            }
                            if (NIL != genls.genl_in_any_mtP(cyc_fort, $$GeopoliticalEntity)) {
                                target_mt = $$DualistGeopoliticalMt;
                            } else
                                if (NIL != genls.genl_in_any_mtP(cyc_fort, $$BiologicalLivingObject)) {
                                    target_mt = $$BiologyMt;
                                } else
                                    if (NIL != genls.genl_in_any_mtP(cyc_fort, $$PlantPart)) {
                                        target_mt = $$BotanyMt;
                                    } else
                                        if (NIL != genls.genl_in_any_mtP(cyc_fort, $$TopographicalFeature)) {
                                            target_mt = $$NaturalGeographyMt;
                                        } else
                                            if (NIL != isa.isa_in_any_mtP(cyc_fort, $$ProductTypeByBrand)) {
                                                target_mt = $const212$BrandNameProductPhysicalCharacter;
                                            } else
                                                if (NIL != isa.isa_in_any_mtP(cyc_fort, $$ProductType)) {
                                                    target_mt = $$ProductPhysicalCharacteristicsMt;
                                                } else {
                                                    target_mt = $$BaseKB;
                                                }





                            sublisp_throw($sym196$OUTER_CATCH_FOR_TYPICAL_SIZE_HARVESTABLE_ITEM_METHOD, self);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_typical_size_harvestable_item_target_mt(self, target_mt);
                            set_typical_size_harvestable_item_cyc_fort(self, cyc_fort);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_typical_size_harvestable_item_method = Errors.handleThrowable(ccatch_env_var, $sym196$OUTER_CATCH_FOR_TYPICAL_SIZE_HARVESTABLE_ITEM_METHOD);
            }
            return catch_var_for_typical_size_harvestable_item_method;
        }
    }

    public static final SubLObject new_typical_size_harvestable_item(SubLObject item) {
        SubLTrampolineFile.checkType(item, FORT_P);
        {
            SubLObject v_new = object.new_class_instance(TYPICAL_SIZE_HARVESTABLE_ITEM);
            instances.set_slot(v_new, CYC_FORT, item);
            methods.funcall_instance_method_with_0_args(v_new, SELF_COMPLETE);
            return v_new;
        }
    }

    public static final SubLObject subloop_reserved_initialize_silly_size_question_bug_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_silly_size_question_bug_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SERVER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, CGI_SCRIPT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, REPORTER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MESSAGE_TO, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MESSAGE_FROM, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, COMMENT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, AUTO_BUG_REPORT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, PRODUCT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, COMPONENT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, CYC_GUID, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, VERSION, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SYSTEM_VERSION, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, KB_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, IMAGE_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MACHINE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SHORT_DESC, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, REP_PLATFORM, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, BUG_SEVERITY, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, OP_SYS, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, ASSIGNED_TO, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, BUG_FILE_LOC, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, STATUS_WHITEBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, TARGET_MILESTONE, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, GROUPSET, NIL);
        classes.subloop_initialize_slot(new_instance, ODD_QUESTION_BUG, QUESTION, NIL);
        return NIL;
    }

    public static final SubLObject silly_size_question_bug_p(SubLObject silly_size_question_bug) {
        return classes.subloop_instanceof_class(silly_size_question_bug, SILLY_SIZE_QUESTION_BUG);
    }

    public static final SubLObject silly_size_question_bug_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_silly_size_question_bug_method = NIL;
            SubLObject short_desc = bugzilla.get_bugzilla_bug_short_desc(self);
            SubLObject component = bugzilla.get_bugzilla_bug_component(self);
            SubLObject product = bugzilla.get_bugzilla_bug_product(self);
            try {
                try {
                    bugzilla.odd_question_bug_initialize_method(self);
                    product = $$$RKF;
                    component = $$$Typical_Size_Harvester;
                    short_desc = $str_alt254$Cyc_asked_an_odd_dimension_questi;
                    sublisp_throw($sym251$OUTER_CATCH_FOR_SILLY_SIZE_QUESTION_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            bugzilla.set_bugzilla_bug_short_desc(self, short_desc);
                            bugzilla.set_bugzilla_bug_component(self, component);
                            bugzilla.set_bugzilla_bug_product(self, product);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_silly_size_question_bug_method = Errors.handleThrowable(ccatch_env_var, $sym251$OUTER_CATCH_FOR_SILLY_SIZE_QUESTION_BUG_METHOD);
            }
            return catch_var_for_silly_size_question_bug_method;
        }
    }

    public static final SubLObject mail_silly_size_question_bug(SubLObject fort, SubLObject predicate, SubLObject user) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        SubLTrampolineFile.checkType(predicate, FORT_P);
        {
            SubLObject bug = object.new_class_instance(SILLY_SIZE_QUESTION_BUG);
            SubLObject v_question = listS($$relationAllInstance, predicate, fort, $list_alt256);
            methods.funcall_instance_method_with_1_args(bug, SET_REPORTER, user);
            instances.set_slot(bug, QUESTION, v_question);
            methods.funcall_instance_method_with_0_args(bug, COMPUTE_COMMENT);
            return methods.funcall_instance_method_with_0_args(bug, MAIL);
        }
    }

    public static final SubLObject declare_workflow_queue_file() {
        declareFunction("get_workflow_queue_queue_filler_task", "GET-WORKFLOW-QUEUE-QUEUE-FILLER-TASK", 1, 0, false);
        declareFunction("set_workflow_queue_queue_filler_task", "SET-WORKFLOW-QUEUE-QUEUE-FILLER-TASK", 2, 0, false);
        declareFunction("get_workflow_queue_watermark_low", "GET-WORKFLOW-QUEUE-WATERMARK-LOW", 1, 0, false);
        declareFunction("set_workflow_queue_watermark_low", "SET-WORKFLOW-QUEUE-WATERMARK-LOW", 2, 0, false);
        declareFunction("get_workflow_queue_watermark_high", "GET-WORKFLOW-QUEUE-WATERMARK-HIGH", 1, 0, false);
        declareFunction("set_workflow_queue_watermark_high", "SET-WORKFLOW-QUEUE-WATERMARK-HIGH", 2, 0, false);
        declareFunction("subloop_reserved_initialize_workflow_queue_class", "SUBLOOP-RESERVED-INITIALIZE-WORKFLOW-QUEUE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_workflow_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-WORKFLOW-QUEUE-INSTANCE", 1, 0, false);
        declareFunction("workflow_queue_p", "WORKFLOW-QUEUE-P", 1, 0, false);
        declareFunction("workflow_queue_enqueue_processed_method", "WORKFLOW-QUEUE-ENQUEUE-PROCESSED-METHOD", 2, 0, false);
        declareFunction("workflow_queue_kill_filler_thread_method", "WORKFLOW-QUEUE-KILL-FILLER-THREAD-METHOD", 1, 0, false);
        declareFunction("get_bnc_frequency_queue_verbose", "GET-BNC-FREQUENCY-QUEUE-VERBOSE", 1, 0, false);
        declareFunction("set_bnc_frequency_queue_verbose", "SET-BNC-FREQUENCY-QUEUE-VERBOSE", 2, 0, false);
        declareFunction("get_bnc_frequency_queue_bnc_file", "GET-BNC-FREQUENCY-QUEUE-BNC-FILE", 1, 0, false);
        declareFunction("set_bnc_frequency_queue_bnc_file", "SET-BNC-FREQUENCY-QUEUE-BNC-FILE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_bnc_frequency_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BNC-FREQUENCY-QUEUE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_bnc_frequency_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BNC-FREQUENCY-QUEUE-INSTANCE", 1, 0, false);
        declareFunction("bnc_frequency_queue_p", "BNC-FREQUENCY-QUEUE-P", 1, 0, false);
        declareFunction("bnc_frequency_queue_start_filler_thread_method", "BNC-FREQUENCY-QUEUE-START-FILLER-THREAD-METHOD", 1, 0, false);
        declareFunction("bnc_frequency_queue_initialize_method", "BNC-FREQUENCY-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("bnc_frequency_queue_enqueue_file_method", "BNC-FREQUENCY-QUEUE-ENQUEUE-FILE-METHOD", 2, 0, false);
        declareFunction("get_bnc_semtrans_queue", "GET-BNC-SEMTRANS-QUEUE", 0, 0, false);
        declareFunction("get_next_semtransless_verb", "GET-NEXT-SEMTRANSLESS-VERB", 0, 0, false);
        declareFunction("get_bnc_semtrans_queue_processed_items", "GET-BNC-SEMTRANS-QUEUE-PROCESSED-ITEMS", 1, 0, false);
        declareFunction("set_bnc_semtrans_queue_processed_items", "SET-BNC-SEMTRANS-QUEUE-PROCESSED-ITEMS", 2, 0, false);
        declareFunction("get_bnc_semtrans_queue_semtrans_lexicon", "GET-BNC-SEMTRANS-QUEUE-SEMTRANS-LEXICON", 1, 0, false);
        declareFunction("set_bnc_semtrans_queue_semtrans_lexicon", "SET-BNC-SEMTRANS-QUEUE-SEMTRANS-LEXICON", 2, 0, false);
        declareFunction("get_bnc_semtrans_queue_admissible_pos", "GET-BNC-SEMTRANS-QUEUE-ADMISSIBLE-POS", 1, 0, false);
        declareFunction("set_bnc_semtrans_queue_admissible_pos", "SET-BNC-SEMTRANS-QUEUE-ADMISSIBLE-POS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_bnc_semtrans_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BNC-SEMTRANS-QUEUE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_bnc_semtrans_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BNC-SEMTRANS-QUEUE-INSTANCE", 1, 0, false);
        declareFunction("bnc_semtrans_queue_p", "BNC-SEMTRANS-QUEUE-P", 1, 0, false);
        declareFunction("bnc_semtrans_queue_initialize_method", "BNC-SEMTRANS-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("bnc_semtrans_queue_enqueue_processed_method", "BNC-SEMTRANS-QUEUE-ENQUEUE-PROCESSED-METHOD", 2, 0, false);
        declareFunction("bnc_semtrans_queue_print_method", "BNC-SEMTRANS-QUEUE-PRINT-METHOD", 3, 0, false);
        declareFunction("set_typical_size_queue_object_user", "SET-TYPICAL-SIZE-QUEUE-OBJECT-USER", 1, 0, false);
        declareFunction("reset_typical_size_queue_object", "RESET-TYPICAL-SIZE-QUEUE-OBJECT", 0, 0, false);
        declareFunction("get_typical_size_queue_processed_items", "GET-TYPICAL-SIZE-QUEUE-PROCESSED-ITEMS", 1, 0, false);
        declareFunction("set_typical_size_queue_processed_items", "SET-TYPICAL-SIZE-QUEUE-PROCESSED-ITEMS", 2, 0, false);
        declareFunction("get_typical_size_queue_predicate_dossiers", "GET-TYPICAL-SIZE-QUEUE-PREDICATE-DOSSIERS", 1, 0, false);
        declareFunction("set_typical_size_queue_predicate_dossiers", "SET-TYPICAL-SIZE-QUEUE-PREDICATE-DOSSIERS", 2, 0, false);
        declareFunction("get_typical_size_queue_admissible_pos", "GET-TYPICAL-SIZE-QUEUE-ADMISSIBLE-POS", 1, 0, false);
        declareFunction("set_typical_size_queue_admissible_pos", "SET-TYPICAL-SIZE-QUEUE-ADMISSIBLE-POS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_typical_size_queue_class", "SUBLOOP-RESERVED-INITIALIZE-TYPICAL-SIZE-QUEUE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_typical_size_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-TYPICAL-SIZE-QUEUE-INSTANCE", 1, 0, false);
        declareFunction("typical_size_queue_p", "TYPICAL-SIZE-QUEUE-P", 1, 0, false);
        declareFunction("typical_size_queue_initialize_method", "TYPICAL-SIZE-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("typical_size_queue_compute_predicate_dossiers_method", "TYPICAL-SIZE-QUEUE-COMPUTE-PREDICATE-DOSSIERS-METHOD", 1, 0, false);
        declareFunction("typical_size_queue_get_decorated_units_method", "TYPICAL-SIZE-QUEUE-GET-DECORATED-UNITS-METHOD", 3, 0, false);
        declareFunction("typical_size_queue_print_method", "TYPICAL-SIZE-QUEUE-PRINT-METHOD", 3, 0, false);
        declareFunction("typical_size_queue_enqueue_processed_method", "TYPICAL-SIZE-QUEUE-ENQUEUE-PROCESSED-METHOD", 2, 0, false);
        declareFunction("type_appropriate_unit", "TYPE-APPROPRIATE-UNIT", 1, 0, false);
        declareFunction("compute_size_harvesting_personnel", "COMPUTE-SIZE-HARVESTING-PERSONNEL", 0, 0, false);
        declareFunction("assign_daily_size_harvesting_tasks", "ASSIGN-DAILY-SIZE-HARVESTING-TASKS", 0, 0, false);
        declareFunction("mail_size_harvesting_request", "MAIL-SIZE-HARVESTING-REQUEST", 2, 0, false);
        declareFunction("get_typical_size_queue_object", "GET-TYPICAL-SIZE-QUEUE-OBJECT", 0, 0, false);
        declareFunction("get_size_predicates", "GET-SIZE-PREDICATES", 0, 0, false);
        declareFunction("get_decorated_metric_units_for_predicate", "GET-DECORATED-METRIC-UNITS-FOR-PREDICATE", 1, 0, false);
        declareFunction("get_decorated_fps_units_for_predicate", "GET-DECORATED-FPS-UNITS-FOR-PREDICATE", 1, 0, false);
        declareFunction("find_size_predicates_for_term", "FIND-SIZE-PREDICATES-FOR-TERM", 1, 0, false);
        declareFunction("typical_size_queue_is_emptyP", "TYPICAL-SIZE-QUEUE-IS-EMPTY?", 0, 0, false);
        declareFunction("finalize_typical_size_queue", "FINALIZE-TYPICAL-SIZE-QUEUE", 0, 0, false);
        declareFunction("next_item_from_typical_size_queue", "NEXT-ITEM-FROM-TYPICAL-SIZE-QUEUE", 0, 0, false);
        declareFunction("mail_typical_size_bug", "MAIL-TYPICAL-SIZE-BUG", 2, 0, false);
        declareFunction("larger_decorated_unit_p", "LARGER-DECORATED-UNIT-P", 2, 0, false);
        declareFunction("get_decorated_unit_order_of_magnitude", "GET-DECORATED-UNIT-ORDER-OF-MAGNITUDE", 1, 0, false);
        declareFunction("set_decorated_unit_order_of_magnitude", "SET-DECORATED-UNIT-ORDER-OF-MAGNITUDE", 2, 0, false);
        declareFunction("get_decorated_unit_paraphrase", "GET-DECORATED-UNIT-PARAPHRASE", 1, 0, false);
        declareFunction("set_decorated_unit_paraphrase", "SET-DECORATED-UNIT-PARAPHRASE", 2, 0, false);
        declareFunction("get_decorated_unit_unit", "GET-DECORATED-UNIT-UNIT", 1, 0, false);
        declareFunction("set_decorated_unit_unit", "SET-DECORATED-UNIT-UNIT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_decorated_unit_class", "SUBLOOP-RESERVED-INITIALIZE-DECORATED-UNIT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_decorated_unit_instance", "SUBLOOP-RESERVED-INITIALIZE-DECORATED-UNIT-INSTANCE", 1, 0, false);
        declareFunction("decorated_unit_p", "DECORATED-UNIT-P", 1, 0, false);
        declareFunction("decorated_unit_to_list_method", "DECORATED-UNIT-TO-LIST-METHOD", 1, 0, false);
        declareFunction("get_size_predicate_dossier_fps_units", "GET-SIZE-PREDICATE-DOSSIER-FPS-UNITS", 1, 0, false);
        declareFunction("set_size_predicate_dossier_fps_units", "SET-SIZE-PREDICATE-DOSSIER-FPS-UNITS", 2, 0, false);
        declareFunction("get_size_predicate_dossier_fps_anchor", "GET-SIZE-PREDICATE-DOSSIER-FPS-ANCHOR", 1, 0, false);
        declareFunction("set_size_predicate_dossier_fps_anchor", "SET-SIZE-PREDICATE-DOSSIER-FPS-ANCHOR", 2, 0, false);
        declareFunction("get_size_predicate_dossier_metric_anchor", "GET-SIZE-PREDICATE-DOSSIER-METRIC-ANCHOR", 1, 0, false);
        declareFunction("set_size_predicate_dossier_metric_anchor", "SET-SIZE-PREDICATE-DOSSIER-METRIC-ANCHOR", 2, 0, false);
        declareFunction("get_size_predicate_dossier_metric_units", "GET-SIZE-PREDICATE-DOSSIER-METRIC-UNITS", 1, 0, false);
        declareFunction("set_size_predicate_dossier_metric_units", "SET-SIZE-PREDICATE-DOSSIER-METRIC-UNITS", 2, 0, false);
        declareFunction("get_size_predicate_dossier_argument_types", "GET-SIZE-PREDICATE-DOSSIER-ARGUMENT-TYPES", 1, 0, false);
        declareFunction("set_size_predicate_dossier_argument_types", "SET-SIZE-PREDICATE-DOSSIER-ARGUMENT-TYPES", 2, 0, false);
        declareFunction("get_size_predicate_dossier_paraphrase", "GET-SIZE-PREDICATE-DOSSIER-PARAPHRASE", 1, 0, false);
        declareFunction("set_size_predicate_dossier_paraphrase", "SET-SIZE-PREDICATE-DOSSIER-PARAPHRASE", 2, 0, false);
        declareFunction("get_size_predicate_dossier_predicate", "GET-SIZE-PREDICATE-DOSSIER-PREDICATE", 1, 0, false);
        declareFunction("set_size_predicate_dossier_predicate", "SET-SIZE-PREDICATE-DOSSIER-PREDICATE", 2, 0, false);
        declareFunction("get_size_predicate_dossier_order_of_magnitude_map", "GET-SIZE-PREDICATE-DOSSIER-ORDER-OF-MAGNITUDE-MAP", 1, 0, false);
        declareFunction("set_size_predicate_dossier_order_of_magnitude_map", "SET-SIZE-PREDICATE-DOSSIER-ORDER-OF-MAGNITUDE-MAP", 2, 0, false);
        declareFunction("subloop_reserved_initialize_size_predicate_dossier_class", "SUBLOOP-RESERVED-INITIALIZE-SIZE-PREDICATE-DOSSIER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_size_predicate_dossier_instance", "SUBLOOP-RESERVED-INITIALIZE-SIZE-PREDICATE-DOSSIER-INSTANCE", 1, 0, false);
        declareFunction("size_predicate_dossier_p", "SIZE-PREDICATE-DOSSIER-P", 1, 0, false);
        declareFunction("size_predicate_dossier_order_of_magnitude_assignment_method", "SIZE-PREDICATE-DOSSIER-ORDER-OF-MAGNITUDE-ASSIGNMENT-METHOD", 3, 0, false);
        declareFunction("new_size_predicate_dossier", "NEW-SIZE-PREDICATE-DOSSIER", 3, 0, false);
        declareFunction("get_typical_size_harvestable_item_target_mt", "GET-TYPICAL-SIZE-HARVESTABLE-ITEM-TARGET-MT", 1, 0, false);
        declareFunction("set_typical_size_harvestable_item_target_mt", "SET-TYPICAL-SIZE-HARVESTABLE-ITEM-TARGET-MT", 2, 0, false);
        declareFunction("get_typical_size_harvestable_item_clarification", "GET-TYPICAL-SIZE-HARVESTABLE-ITEM-CLARIFICATION", 1, 0, false);
        declareFunction("set_typical_size_harvestable_item_clarification", "SET-TYPICAL-SIZE-HARVESTABLE-ITEM-CLARIFICATION", 2, 0, false);
        declareFunction("get_typical_size_harvestable_item_paraphrase", "GET-TYPICAL-SIZE-HARVESTABLE-ITEM-PARAPHRASE", 1, 0, false);
        declareFunction("set_typical_size_harvestable_item_paraphrase", "SET-TYPICAL-SIZE-HARVESTABLE-ITEM-PARAPHRASE", 2, 0, false);
        declareFunction("get_typical_size_harvestable_item_cyc_fort", "GET-TYPICAL-SIZE-HARVESTABLE-ITEM-CYC-FORT", 1, 0, false);
        declareFunction("set_typical_size_harvestable_item_cyc_fort", "SET-TYPICAL-SIZE-HARVESTABLE-ITEM-CYC-FORT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_typical_size_harvestable_item_class", "SUBLOOP-RESERVED-INITIALIZE-TYPICAL-SIZE-HARVESTABLE-ITEM-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_typical_size_harvestable_item_instance", "SUBLOOP-RESERVED-INITIALIZE-TYPICAL-SIZE-HARVESTABLE-ITEM-INSTANCE", 1, 0, false);
        declareFunction("typical_size_harvestable_item_p", "TYPICAL-SIZE-HARVESTABLE-ITEM-P", 1, 0, false);
        declareFunction("typical_size_harvestable_item_to_list_method", "TYPICAL-SIZE-HARVESTABLE-ITEM-TO-LIST-METHOD", 1, 0, false);
        declareFunction("typical_size_harvestable_item_self_complete_method", "TYPICAL-SIZE-HARVESTABLE-ITEM-SELF-COMPLETE-METHOD", 1, 0, false);
        declareFunction("typical_size_harvestable_item_set_target_mt_method", "TYPICAL-SIZE-HARVESTABLE-ITEM-SET-TARGET-MT-METHOD", 1, 0, false);
        declareFunction("new_typical_size_harvestable_item", "NEW-TYPICAL-SIZE-HARVESTABLE-ITEM", 1, 0, false);
        declareFunction("subloop_reserved_initialize_silly_size_question_bug_class", "SUBLOOP-RESERVED-INITIALIZE-SILLY-SIZE-QUESTION-BUG-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_silly_size_question_bug_instance", "SUBLOOP-RESERVED-INITIALIZE-SILLY-SIZE-QUESTION-BUG-INSTANCE", 1, 0, false);
        declareFunction("silly_size_question_bug_p", "SILLY-SIZE-QUESTION-BUG-P", 1, 0, false);
        declareFunction("silly_size_question_bug_initialize_method", "SILLY-SIZE-QUESTION-BUG-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("mail_silly_size_question_bug", "MAIL-SILLY-SIZE-QUESTION-BUG", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_workflow_queue_file() {
        defvar("*BNC-SEMTRANS-QUEUE*", NIL);
        defvar("*SCALAR-PREDICATES-ANCHORS*", $list_alt83);
        defvar("*TYPICAL-SIZE-QUEUE-OBJECT*", NIL);
        defvar("*CURRENT-TYPICAL-SIZE-QUEUE-OBJECT-USER*", NIL);
        defconstant("*TYPICAL-SIZE-HARVEST-SCHEDULER-FORM*", $str_alt139$Dear__A________it_seems_I_don_t_k);
        return NIL;
    }

    public static final SubLObject setup_workflow_queue_file() {
                classes.subloop_new_class(WORKFLOW_QUEUE, BASIC_QUEUE, NIL, T, $list_alt2);
        classes.class_set_implements_slot_listeners(WORKFLOW_QUEUE, NIL);
        classes.subloop_note_class_initialization_function(WORKFLOW_QUEUE, SUBLOOP_RESERVED_INITIALIZE_WORKFLOW_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(WORKFLOW_QUEUE, SUBLOOP_RESERVED_INITIALIZE_WORKFLOW_QUEUE_INSTANCE);
        subloop_reserved_initialize_workflow_queue_class(WORKFLOW_QUEUE);
        methods.methods_incorporate_instance_method(ENQUEUE_PROCESSED, WORKFLOW_QUEUE, $list_alt18, $list_alt19, $list_alt20);
        methods.subloop_register_instance_method(WORKFLOW_QUEUE, ENQUEUE_PROCESSED, WORKFLOW_QUEUE_ENQUEUE_PROCESSED_METHOD);
        methods.methods_incorporate_instance_method(KILL_FILLER_THREAD, WORKFLOW_QUEUE, $list_alt24, NIL, $list_alt25);
        methods.subloop_register_instance_method(WORKFLOW_QUEUE, KILL_FILLER_THREAD, WORKFLOW_QUEUE_KILL_FILLER_THREAD_METHOD);
        classes.subloop_new_class(BNC_FREQUENCY_QUEUE, WORKFLOW_QUEUE, NIL, NIL, $list_alt31);
        classes.class_set_implements_slot_listeners(BNC_FREQUENCY_QUEUE, NIL);
        classes.subloop_note_class_initialization_function(BNC_FREQUENCY_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BNC_FREQUENCY_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(BNC_FREQUENCY_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BNC_FREQUENCY_QUEUE_INSTANCE);
        subloop_reserved_initialize_bnc_frequency_queue_class(BNC_FREQUENCY_QUEUE);
        methods.methods_incorporate_instance_method(START_FILLER_THREAD, BNC_FREQUENCY_QUEUE, $list_alt24, NIL, $list_alt37);
        methods.subloop_register_instance_method(BNC_FREQUENCY_QUEUE, START_FILLER_THREAD, BNC_FREQUENCY_QUEUE_START_FILLER_THREAD_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, BNC_FREQUENCY_QUEUE, $list_alt44, NIL, $list_alt45);
        methods.subloop_register_instance_method(BNC_FREQUENCY_QUEUE, INITIALIZE, BNC_FREQUENCY_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE_FILE, BNC_FREQUENCY_QUEUE, $list_alt18, $list_alt52, $list_alt53);
        methods.subloop_register_instance_method(BNC_FREQUENCY_QUEUE, ENQUEUE_FILE, BNC_FREQUENCY_QUEUE_ENQUEUE_FILE_METHOD);
        classes.subloop_new_class(BNC_SEMTRANS_QUEUE, BNC_FREQUENCY_QUEUE, NIL, NIL, $list_alt61);
        classes.class_set_implements_slot_listeners(BNC_SEMTRANS_QUEUE, NIL);
        classes.subloop_note_class_initialization_function(BNC_SEMTRANS_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BNC_SEMTRANS_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(BNC_SEMTRANS_QUEUE, SUBLOOP_RESERVED_INITIALIZE_BNC_SEMTRANS_QUEUE_INSTANCE);
        subloop_reserved_initialize_bnc_semtrans_queue_class(BNC_SEMTRANS_QUEUE);
        methods.methods_incorporate_instance_method(INITIALIZE, BNC_SEMTRANS_QUEUE, $list_alt44, NIL, $list_alt68);
        methods.subloop_register_instance_method(BNC_SEMTRANS_QUEUE, INITIALIZE, BNC_SEMTRANS_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE_PROCESSED, BNC_SEMTRANS_QUEUE, $list_alt18, $list_alt72, $list_alt73);
        methods.subloop_register_instance_method(BNC_SEMTRANS_QUEUE, ENQUEUE_PROCESSED, BNC_SEMTRANS_QUEUE_ENQUEUE_PROCESSED_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BNC_SEMTRANS_QUEUE, $list_alt44, $list_alt79, $list_alt80);
        methods.subloop_register_instance_method(BNC_SEMTRANS_QUEUE, PRINT, BNC_SEMTRANS_QUEUE_PRINT_METHOD);
        classes.subloop_new_class(TYPICAL_SIZE_QUEUE, BNC_FREQUENCY_QUEUE, NIL, NIL, $list_alt87);
        classes.class_set_implements_slot_listeners(TYPICAL_SIZE_QUEUE, NIL);
        classes.subloop_note_class_initialization_function(TYPICAL_SIZE_QUEUE, SUBLOOP_RESERVED_INITIALIZE_TYPICAL_SIZE_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function(TYPICAL_SIZE_QUEUE, SUBLOOP_RESERVED_INITIALIZE_TYPICAL_SIZE_QUEUE_INSTANCE);
        subloop_reserved_initialize_typical_size_queue_class(TYPICAL_SIZE_QUEUE);
        methods.methods_incorporate_instance_method(INITIALIZE, TYPICAL_SIZE_QUEUE, $list_alt44, NIL, $list_alt92);
        methods.subloop_register_instance_method(TYPICAL_SIZE_QUEUE, INITIALIZE, TYPICAL_SIZE_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(COMPUTE_PREDICATE_DOSSIERS, TYPICAL_SIZE_QUEUE, $list_alt18, NIL, $list_alt96);
        methods.subloop_register_instance_method(TYPICAL_SIZE_QUEUE, COMPUTE_PREDICATE_DOSSIERS, TYPICAL_SIZE_QUEUE_COMPUTE_PREDICATE_DOSSIERS_METHOD);
        methods.methods_incorporate_instance_method(GET_DECORATED_UNITS, TYPICAL_SIZE_QUEUE, $list_alt24, $list_alt101, $list_alt102);
        methods.subloop_register_instance_method(TYPICAL_SIZE_QUEUE, GET_DECORATED_UNITS, TYPICAL_SIZE_QUEUE_GET_DECORATED_UNITS_METHOD);
        methods.methods_incorporate_instance_method(PRINT, TYPICAL_SIZE_QUEUE, $list_alt44, $list_alt79, $list_alt111);
        methods.subloop_register_instance_method(TYPICAL_SIZE_QUEUE, PRINT, TYPICAL_SIZE_QUEUE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE_PROCESSED, TYPICAL_SIZE_QUEUE, $list_alt18, $list_alt72, $list_alt114);
        methods.subloop_register_instance_method(TYPICAL_SIZE_QUEUE, ENQUEUE_PROCESSED, TYPICAL_SIZE_QUEUE_ENQUEUE_PROCESSED_METHOD);
        classes.subloop_new_class(DECORATED_UNIT, OBJECT, NIL, NIL, $list_alt150);
        classes.class_set_implements_slot_listeners(DECORATED_UNIT, NIL);
        classes.subloop_note_class_initialization_function(DECORATED_UNIT, SUBLOOP_RESERVED_INITIALIZE_DECORATED_UNIT_CLASS);
        classes.subloop_note_instance_initialization_function(DECORATED_UNIT, SUBLOOP_RESERVED_INITIALIZE_DECORATED_UNIT_INSTANCE);
        subloop_reserved_initialize_decorated_unit_class(DECORATED_UNIT);
        methods.methods_incorporate_instance_method(TO_LIST, DECORATED_UNIT, $list_alt24, NIL, $list_alt154);
        methods.subloop_register_instance_method(DECORATED_UNIT, TO_LIST, DECORATED_UNIT_TO_LIST_METHOD);
        classes.subloop_new_class(SIZE_PREDICATE_DOSSIER, OBJECT, NIL, NIL, $list_alt158);
        classes.class_set_implements_slot_listeners(SIZE_PREDICATE_DOSSIER, NIL);
        classes.subloop_note_class_initialization_function(SIZE_PREDICATE_DOSSIER, SUBLOOP_RESERVED_INITIALIZE_SIZE_PREDICATE_DOSSIER_CLASS);
        classes.subloop_note_instance_initialization_function(SIZE_PREDICATE_DOSSIER, SUBLOOP_RESERVED_INITIALIZE_SIZE_PREDICATE_DOSSIER_INSTANCE);
        subloop_reserved_initialize_size_predicate_dossier_class(SIZE_PREDICATE_DOSSIER);
        methods.methods_incorporate_instance_method(ORDER_OF_MAGNITUDE_ASSIGNMENT, SIZE_PREDICATE_DOSSIER, $list_alt18, $list_alt171, $list_alt172);
        methods.subloop_register_instance_method(SIZE_PREDICATE_DOSSIER, ORDER_OF_MAGNITUDE_ASSIGNMENT, SIZE_PREDICATE_DOSSIER_ORDER_OF_MAGNITUDE_ASSIGNMENT_METHOD);
        classes.subloop_new_class(TYPICAL_SIZE_HARVESTABLE_ITEM, OBJECT, NIL, NIL, $list_alt180);
        classes.class_set_implements_slot_listeners(TYPICAL_SIZE_HARVESTABLE_ITEM, NIL);
        classes.subloop_note_class_initialization_function(TYPICAL_SIZE_HARVESTABLE_ITEM, SUBLOOP_RESERVED_INITIALIZE_TYPICAL_SIZE_HARVESTABLE_ITEM_CLASS);
        classes.subloop_note_instance_initialization_function(TYPICAL_SIZE_HARVESTABLE_ITEM, $sym185$SUBLOOP_RESERVED_INITIALIZE_TYPICAL_SIZE_HARVESTABLE_ITEM_INSTANC);
        subloop_reserved_initialize_typical_size_harvestable_item_class(TYPICAL_SIZE_HARVESTABLE_ITEM);
        methods.methods_incorporate_instance_method(TO_LIST, TYPICAL_SIZE_HARVESTABLE_ITEM, $list_alt24, NIL, $list_alt186);
        methods.subloop_register_instance_method(TYPICAL_SIZE_HARVESTABLE_ITEM, TO_LIST, TYPICAL_SIZE_HARVESTABLE_ITEM_TO_LIST_METHOD);
        methods.methods_incorporate_instance_method(SELF_COMPLETE, TYPICAL_SIZE_HARVESTABLE_ITEM, $list_alt18, NIL, $list_alt190);
        methods.subloop_register_instance_method(TYPICAL_SIZE_HARVESTABLE_ITEM, SELF_COMPLETE, TYPICAL_SIZE_HARVESTABLE_ITEM_SELF_COMPLETE_METHOD);
        methods.methods_incorporate_instance_method(SET_TARGET_MT, TYPICAL_SIZE_HARVESTABLE_ITEM, $list_alt18, NIL, $list_alt195);
        methods.subloop_register_instance_method(TYPICAL_SIZE_HARVESTABLE_ITEM, SET_TARGET_MT, TYPICAL_SIZE_HARVESTABLE_ITEM_SET_TARGET_MT_METHOD);
        classes.subloop_new_class(SILLY_SIZE_QUESTION_BUG, ODD_QUESTION_BUG, NIL, NIL, $list_alt220);
        classes.class_set_implements_slot_listeners(SILLY_SIZE_QUESTION_BUG, NIL);
        classes.subloop_note_class_initialization_function(SILLY_SIZE_QUESTION_BUG, SUBLOOP_RESERVED_INITIALIZE_SILLY_SIZE_QUESTION_BUG_CLASS);
        classes.subloop_note_instance_initialization_function(SILLY_SIZE_QUESTION_BUG, SUBLOOP_RESERVED_INITIALIZE_SILLY_SIZE_QUESTION_BUG_INSTANCE);
        subloop_reserved_initialize_silly_size_question_bug_class(SILLY_SIZE_QUESTION_BUG);
        methods.methods_incorporate_instance_method(INITIALIZE, SILLY_SIZE_QUESTION_BUG, $list_alt44, NIL, $list_alt250);
        methods.subloop_register_instance_method(SILLY_SIZE_QUESTION_BUG, INITIALIZE, SILLY_SIZE_QUESTION_BUG_INITIALIZE_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol WORKFLOW_QUEUE = makeSymbol("WORKFLOW-QUEUE");

    private static final SubLSymbol BASIC_QUEUE = makeSymbol("BASIC-QUEUE");

    static private final SubLList $list_alt2 = list(list(makeSymbol("QUEUE-FILLER-TASK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WATERMARK-HIGH"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeInteger(25)), list(makeSymbol("WATERMARK-LOW"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), FIFTEEN_INTEGER), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-PROCESSED"), list(makeSymbol("ITEM")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("START-FILLER-THREAD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-FILLER-THREAD"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol QUEUE_FILLER_TASK = makeSymbol("QUEUE-FILLER-TASK");

    private static final SubLSymbol WATERMARK_LOW = makeSymbol("WATERMARK-LOW");

    private static final SubLSymbol WATERMARK_HIGH = makeSymbol("WATERMARK-HIGH");





    public static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORKFLOW_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORKFLOW-QUEUE-CLASS");







    private static final SubLSymbol FIRST_CONS = makeSymbol("FIRST-CONS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORKFLOW_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORKFLOW-QUEUE-INSTANCE");

    private static final SubLSymbol ENQUEUE_PROCESSED = makeSymbol("ENQUEUE-PROCESSED");

    static private final SubLList $list_alt18 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list_alt19 = list(makeSymbol("ITEM"));

    static private final SubLList $list_alt20 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ENQUEUE")), makeSymbol("ITEM")), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol WORKFLOW_QUEUE_ENQUEUE_PROCESSED_METHOD = makeSymbol("WORKFLOW-QUEUE-ENQUEUE-PROCESSED-METHOD");

    private static final SubLSymbol KILL_FILLER_THREAD = makeSymbol("KILL-FILLER-THREAD");

    static private final SubLList $list_alt24 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt25 = list(list(makeSymbol("PWHEN"), makeSymbol("QUEUE-FILLER-TASK"), list(makeSymbol("CLET"), list(makeSymbol("ERROR-MESSAGE")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR-MESSAGE")), list(makeSymbol("KILL-PROCESS"), list(makeSymbol("TASK-PROCESS"), makeSymbol("QUEUE-FILLER-TASK")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR-MESSAGE"), list(makeSymbol("FORMAT"), T, makeString("~%Filler thread was already dead..."))), list(makeSymbol("CSETQ"), makeSymbol("QUEUE-FILLER-TASK"), NIL))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym26$OUTER_CATCH_FOR_WORKFLOW_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORKFLOW-QUEUE-METHOD");



    static private final SubLString $str_alt28$__Filler_thread_was_already_dead_ = makeString("~%Filler thread was already dead...");

    private static final SubLSymbol WORKFLOW_QUEUE_KILL_FILLER_THREAD_METHOD = makeSymbol("WORKFLOW-QUEUE-KILL-FILLER-THREAD-METHOD");

    private static final SubLSymbol BNC_FREQUENCY_QUEUE = makeSymbol("BNC-FREQUENCY-QUEUE");

    static private final SubLList $list_alt31 = list(list(makeSymbol("BNC-FILE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VERBOSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("START-FILLER-THREAD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));



    private static final SubLSymbol BNC_FILE = makeSymbol("BNC-FILE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BNC_FREQUENCY_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BNC-FREQUENCY-QUEUE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BNC_FREQUENCY_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BNC-FREQUENCY-QUEUE-INSTANCE");

    private static final SubLSymbol START_FILLER_THREAD = makeSymbol("START-FILLER-THREAD");

    static private final SubLList $list_alt37 = list(makeString("@return bnc-frequency-queue-p. Starts the thread to refill this queue\n  object from the BNC data file."), list(makeSymbol("PIF"), makeSymbol("BNC-FILE"), list(makeSymbol("CSETQ"), makeSymbol("QUEUE-FILLER-TASK"), list(makeSymbol("NEW-TASK"), makeString("bnc-filler-thread"), list(QUOTE, makeSymbol("BNC-FREQUENCY-QUEUE-ENQUEUE-FILE-METHOD")), list(makeSymbol("BQ-LIST"), makeSymbol("SELF"), makeSymbol("BNC-FILE")))), list(makeSymbol("WARN"), makeString("The location of the BNC files could not be found"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym38$OUTER_CATCH_FOR_BNC_FREQUENCY_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BNC-FREQUENCY-QUEUE-METHOD");

    static private final SubLString $str_alt39$bnc_filler_thread = makeString("bnc-filler-thread");

    private static final SubLSymbol BNC_FREQUENCY_QUEUE_ENQUEUE_FILE_METHOD = makeSymbol("BNC-FREQUENCY-QUEUE-ENQUEUE-FILE-METHOD");

    static private final SubLString $str_alt41$The_location_of_the_BNC_files_cou = makeString("The location of the BNC files could not be found");

    private static final SubLSymbol BNC_FREQUENCY_QUEUE_START_FILLER_THREAD_METHOD = makeSymbol("BNC-FREQUENCY-QUEUE-START-FILLER-THREAD-METHOD");



    static private final SubLList $list_alt44 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt45 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("BNC-FILE"), list(makeSymbol("FPRED-VALUE-IN-MT"), constant_handles.reader_make_constant_shell(makeString("BritishNationalCorpusFrequencyFile")), constant_handles.reader_make_constant_shell(makeString("nameString")), constant_handles.reader_make_constant_shell(makeString("ComputereseLexicalMt")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym46$OUTER_CATCH_FOR_BNC_FREQUENCY_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BNC-FREQUENCY-QUEUE-METHOD");

    public static final SubLObject $const47$BritishNationalCorpusFrequencyFil = constant_handles.reader_make_constant_shell(makeString("BritishNationalCorpusFrequencyFile"));

    public static final SubLObject $$nameString = constant_handles.reader_make_constant_shell(makeString("nameString"));

    public static final SubLObject $$ComputereseLexicalMt = constant_handles.reader_make_constant_shell(makeString("ComputereseLexicalMt"));

    private static final SubLSymbol BNC_FREQUENCY_QUEUE_INITIALIZE_METHOD = makeSymbol("BNC-FREQUENCY-QUEUE-INITIALIZE-METHOD");

    private static final SubLSymbol ENQUEUE_FILE = makeSymbol("ENQUEUE-FILE");

    static private final SubLList $list_alt52 = list(makeSymbol("FILENAME"));

    static private final SubLList $list_alt53 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("FILENAME"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("GO"), T)), list(makeSymbol("CDOLINES"), list(makeSymbol("LINE"), makeSymbol("FILENAME")), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ELEMENT-COUNT"))), makeSymbol("WATERMARK-HIGH")), list(makeSymbol("CSETQ"), makeSymbol("GO"), NIL)), list(makeSymbol("UNTIL"), makeSymbol("GO"), list(makeSymbol("PWHEN"), list(makeSymbol("<"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ELEMENT-COUNT"))), makeSymbol("WATERMARK-LOW")), list(makeSymbol("CSETQ"), makeSymbol("GO"), T))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ENQUEUE-PROCESSED")), makeSymbol("LINE")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym54$OUTER_CATCH_FOR_BNC_FREQUENCY_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BNC-FREQUENCY-QUEUE-METHOD");





    static private final SubLString $str_alt57$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLSymbol BNC_SEMTRANS_QUEUE = makeSymbol("BNC-SEMTRANS-QUEUE");



    static private final SubLList $list_alt61 = list(list(makeSymbol("ADMISSIBLE-POS"), makeKeyword("CLASS"), makeKeyword("PRIVATE"), makeKeyword("VALUE"), list(QUOTE, list(new SubLObject[]{ makeString("vvb"), makeString("vvi"), makeString("vvd"), makeString("vvg"), makeString("vvn"), makeString("vvz"), makeString("vdb"), makeString("vdd"), makeString("vdg"), makeString("vdn"), makeString("vdz"), makeString("vhb"), makeString("vhi"), makeString("vhd"), makeString("vhg"), makeString("vhn"), makeString("vhz"), makeString("vbb"), makeString("vbi"), makeString("vbd"), makeString("vbg"), makeString("vbn"), makeString("vbz"), makeString("vm0") }))), list(makeSymbol("SEMTRANS-LEXICON"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PROCESSED-ITEMS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-PROCESSED"), list(makeSymbol("LINE")), makeKeyword("PRIVATE")));





    private static final SubLSymbol ADMISSIBLE_POS = makeSymbol("ADMISSIBLE-POS");

    static private final SubLList $list_alt65 = list(new SubLObject[]{ makeString("vvb"), makeString("vvi"), makeString("vvd"), makeString("vvg"), makeString("vvn"), makeString("vvz"), makeString("vdb"), makeString("vdd"), makeString("vdg"), makeString("vdn"), makeString("vdz"), makeString("vhb"), makeString("vhi"), makeString("vhd"), makeString("vhg"), makeString("vhn"), makeString("vhz"), makeString("vbb"), makeString("vbi"), makeString("vbd"), makeString("vbg"), makeString("vbn"), makeString("vbz"), makeString("vm0") });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BNC_SEMTRANS_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BNC-SEMTRANS-QUEUE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BNC_SEMTRANS_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BNC-SEMTRANS-QUEUE-INSTANCE");

    static private final SubLList $list_alt68 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSED-ITEMS"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(32), list(makeSymbol("FUNCTION"), EQUALP))), list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS-LEXICON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("SEMTRANS-LEXICON")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym69$OUTER_CATCH_FOR_BNC_SEMTRANS_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BNC-SEMTRANS-QUEUE-METHOD");



    private static final SubLSymbol BNC_SEMTRANS_QUEUE_INITIALIZE_METHOD = makeSymbol("BNC-SEMTRANS-QUEUE-INITIALIZE-METHOD");

    static private final SubLList $list_alt72 = list(makeSymbol("LINE"));

    static private final SubLList $list_alt73 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("LINE"), makeSymbol("STRINGP")), list(makeSymbol("PWHEN"), makeSymbol("VERBOSE"), list(makeSymbol("FORMAT"), T, makeString("~%~S"), makeSymbol("LINE"))), list(makeSymbol("CLET"), list(list(makeSymbol("TOKENS"), list(makeSymbol("STRING-TOKENIZE"), makeSymbol("LINE"))), list(makeSymbol("WORD"), list(makeSymbol("SECOND"), makeSymbol("TOKENS"))), list(makeSymbol("POS"), list(makeSymbol("THIRD"), makeSymbol("TOKENS")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("POS"), makeSymbol("ADMISSIBLE-POS"), list(makeSymbol("FUNCTION"), EQUAL)), list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), list(makeSymbol("FIM"), makeSymbol("SEMTRANS-LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("WORD")))), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), makeSymbol("LEXES"), list(makeSymbol("GETHASH"), makeSymbol("WORD"), makeSymbol("PROCESSED-ITEMS"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ENQUEUE")), makeSymbol("WORD")), list(makeSymbol("SETHASH"), makeSymbol("WORD"), makeSymbol("PROCESSED-ITEMS"), T))))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym74$OUTER_CATCH_FOR_BNC_SEMTRANS_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BNC-SEMTRANS-QUEUE-METHOD");

    static private final SubLString $str_alt75$___S = makeString("~%~S");



    private static final SubLSymbol BNC_SEMTRANS_QUEUE_ENQUEUE_PROCESSED_METHOD = makeSymbol("BNC-SEMTRANS-QUEUE-ENQUEUE-PROCESSED-METHOD");



    static private final SubLList $list_alt79 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt80 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("BNCSemTransQueue[~S]"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ELEMENT-COUNT")))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt81$BNCSemTransQueue__S_ = makeString("BNCSemTransQueue[~S]");

    private static final SubLSymbol BNC_SEMTRANS_QUEUE_PRINT_METHOD = makeSymbol("BNC-SEMTRANS-QUEUE-PRINT-METHOD");

    static private final SubLList $list_alt83 = list(list(constant_handles.reader_make_constant_shell(makeString("massOfObject")), constant_handles.reader_make_constant_shell(makeString("Pound-UnitOfMass")), constant_handles.reader_make_constant_shell(makeString("Kilogram"))), list(constant_handles.reader_make_constant_shell(makeString("lengthOfObject")), constant_handles.reader_make_constant_shell(makeString("Foot-UnitOfMeasure")), constant_handles.reader_make_constant_shell(makeString("Meter"))), list(constant_handles.reader_make_constant_shell(makeString("heightOfObject")), constant_handles.reader_make_constant_shell(makeString("Foot-UnitOfMeasure")), constant_handles.reader_make_constant_shell(makeString("Meter"))), list(constant_handles.reader_make_constant_shell(makeString("widthOfObject")), constant_handles.reader_make_constant_shell(makeString("Foot-UnitOfMeasure")), constant_handles.reader_make_constant_shell(makeString("Meter"))), list(constant_handles.reader_make_constant_shell(makeString("areaOfObject")), constant_handles.reader_make_constant_shell(makeString("SquareFoot")), constant_handles.reader_make_constant_shell(makeString("SquareMeter"))), list(constant_handles.reader_make_constant_shell(makeString("volumeOfObject")), constant_handles.reader_make_constant_shell(makeString("CubicFoot")), constant_handles.reader_make_constant_shell(makeString("CubicMeter"))), list(constant_handles.reader_make_constant_shell(makeString("age")), constant_handles.reader_make_constant_shell(makeString("YearsDuration")), constant_handles.reader_make_constant_shell(makeString("YearsDuration"))));

    public static final SubLObject $$CurrentCycorpEmployee = constant_handles.reader_make_constant_shell(makeString("CurrentCycorpEmployee"));

    static private final SubLString $str_alt85$___S_is_not_a___CurrentCycorpEmpl = makeString("~%~S is not a #$CurrentCycorpEmployee");

    private static final SubLSymbol TYPICAL_SIZE_QUEUE = makeSymbol("TYPICAL-SIZE-QUEUE");

    static private final SubLList $list_alt87 = list(list(makeSymbol("ADMISSIBLE-POS"), makeKeyword("CLASS"), makeKeyword("PRIVATE"), makeKeyword("VALUE"), list(QUOTE, list(makeString("nn0"), makeString("nn1"), makeString("nn2")))), list(makeSymbol("PREDICATE-DOSSIERS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PROCESSED-ITEMS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-PREDICATE-DOSSIERS"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DECORATED-UNITS"), list(makeSymbol("PREDICATE"), makeSymbol("TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-PROCESSED"), list(makeSymbol("LINE")), makeKeyword("PRIVATE")));

    private static final SubLSymbol PREDICATE_DOSSIERS = makeSymbol("PREDICATE-DOSSIERS");

    static private final SubLList $list_alt89 = list(makeString("nn0"), makeString("nn1"), makeString("nn2"));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TYPICAL_SIZE_QUEUE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TYPICAL-SIZE-QUEUE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TYPICAL_SIZE_QUEUE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TYPICAL-SIZE-QUEUE-INSTANCE");

    static private final SubLList $list_alt92 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSED-ITEMS"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(32))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym93$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TYPICAL-SIZE-QUEUE-METHOD");

    private static final SubLSymbol TYPICAL_SIZE_QUEUE_INITIALIZE_METHOD = makeSymbol("TYPICAL-SIZE-QUEUE-INITIALIZE-METHOD");

    private static final SubLSymbol COMPUTE_PREDICATE_DOSSIERS = makeSymbol("COMPUTE-PREDICATE-DOSSIERS");

    static private final SubLList $list_alt96 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("PREDICATE"), makeSymbol("*SCALAR-PREDICATES-ANCHORS*")), list(makeSymbol("CPUSH"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("NEW-SIZE-PREDICATE-DOSSIER")), makeSymbol("PREDICATE")), makeSymbol("PREDICATE-DOSSIERS"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym97$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TYPICAL-SIZE-QUEUE-METHOD");

    private static final SubLSymbol NEW_SIZE_PREDICATE_DOSSIER = makeSymbol("NEW-SIZE-PREDICATE-DOSSIER");

    private static final SubLSymbol TYPICAL_SIZE_QUEUE_COMPUTE_PREDICATE_DOSSIERS_METHOD = makeSymbol("TYPICAL-SIZE-QUEUE-COMPUTE-PREDICATE-DOSSIERS-METHOD");

    private static final SubLSymbol GET_DECORATED_UNITS = makeSymbol("GET-DECORATED-UNITS");

    static private final SubLList $list_alt101 = list(makeSymbol("PREDICATE"), makeSymbol("TYPE"));

    static private final SubLList $list_alt102 = list(list(makeSymbol("CLET"), list(makeSymbol("DECORATED-UNITS")), list(makeSymbol("CSOME"), list(makeSymbol("DOSSIER"), makeSymbol("PREDICATE-DOSSIERS"), makeSymbol("DECORATED-UNITS")), list(makeSymbol("PWHEN"), list(EQL, list(makeSymbol("GET-SLOT"), makeSymbol("DOSSIER"), list(QUOTE, makeSymbol("PREDICATE"))), makeSymbol("PREDICATE")), list(makeSymbol("CLET"), list(makeSymbol("D-UNITS-FOR-TYPE")), list(makeSymbol("PCASE"), makeSymbol("TYPE"), list(makeKeyword("METRIC"), list(makeSymbol("CSETQ"), makeSymbol("D-UNITS-FOR-TYPE"), list(makeSymbol("GET-SLOT"), makeSymbol("DOSSIER"), list(QUOTE, makeSymbol("METRIC-UNITS"))))), list(makeKeyword("FPS"), list(makeSymbol("CSETQ"), makeSymbol("D-UNITS-FOR-TYPE"), list(makeSymbol("GET-SLOT"), makeSymbol("DOSSIER"), list(QUOTE, makeSymbol("FPS-UNITS")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("UNIT"), makeSymbol("D-UNITS-FOR-TYPE")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("UNIT"), list(QUOTE, makeSymbol("TO-LIST"))), makeSymbol("DECORATED-UNITS")))))), list(RET, makeSymbol("DECORATED-UNITS"))));

    static private final SubLSymbol $sym103$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TYPICAL-SIZE-QUEUE-METHOD");



    private static final SubLSymbol $METRIC = makeKeyword("METRIC");

    private static final SubLSymbol METRIC_UNITS = makeSymbol("METRIC-UNITS");

    private static final SubLSymbol $FPS = makeKeyword("FPS");

    private static final SubLSymbol FPS_UNITS = makeSymbol("FPS-UNITS");



    private static final SubLSymbol TYPICAL_SIZE_QUEUE_GET_DECORATED_UNITS_METHOD = makeSymbol("TYPICAL-SIZE-QUEUE-GET-DECORATED-UNITS-METHOD");

    static private final SubLList $list_alt111 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("TypicalSizeQueue[~S]"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ELEMENT-COUNT")))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt112$TypicalSizeQueue__S_ = makeString("TypicalSizeQueue[~S]");

    private static final SubLSymbol TYPICAL_SIZE_QUEUE_PRINT_METHOD = makeSymbol("TYPICAL-SIZE-QUEUE-PRINT-METHOD");

    static private final SubLList $list_alt114 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("LINE"), makeSymbol("STRINGP")), list(makeSymbol("FORMAT"), T, makeString("~%~S"), makeSymbol("LINE")), list(makeSymbol("CLET"), list(list(makeSymbol("TOKENS"), list(makeSymbol("STRING-TOKENIZE"), makeSymbol("LINE"))), list(makeSymbol("WORD"), list(makeSymbol("SECOND"), makeSymbol("TOKENS"))), list(makeSymbol("POS"), list(makeSymbol("THIRD"), makeSymbol("TOKENS")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("POS"), makeSymbol("ADMISSIBLE-POS"), list(makeSymbol("FUNCTION"), EQUAL)), list(makeSymbol("CLET"), list(list(makeSymbol("DENOTS"), list(makeSymbol("REMOVE-IF-NOT"), list(QUOTE, makeSymbol("EL-FORT-P")), list(makeSymbol("NL-TRIE-ALL-DENOTS-OF-STRING"), makeSymbol("WORD"))))), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), makeSymbol("DENOTS")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("GETHASH"), makeSymbol("DENOT"), makeSymbol("PROCESSED-ITEMS")), list(makeSymbol("GENL?"), makeSymbol("DENOT"), constant_handles.reader_make_constant_shell(makeString("Event"))), list(makeSymbol("GENL?"), makeSymbol("DENOT"), constant_handles.reader_make_constant_shell(makeString("Group"))), list(makeSymbol("GENL?"), makeSymbol("DENOT"), constant_handles.reader_make_constant_shell(makeString("Organization"))), list(makeSymbol("GENL?"), makeSymbol("DENOT"), constant_handles.reader_make_constant_shell(makeString("HomoSapiens")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("EL-FORT-P"), makeSymbol("DENOT")), list(makeSymbol("INDEXED-TERM-P"), makeSymbol("DENOT")), list(makeSymbol("ISA?"), makeSymbol("DENOT"), constant_handles.reader_make_constant_shell(makeString("ObjectType"))), list(makeSymbol("GENL?"), makeSymbol("DENOT"), constant_handles.reader_make_constant_shell(makeString("PartiallyTangible"))), list(makeSymbol("FIND-SIZE-PREDICATES-FOR-TERM"), makeSymbol("DENOT"))), list(makeSymbol("SETHASH"), makeSymbol("DENOT"), makeSymbol("PROCESSED-ITEMS"), T), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ENQUEUE")), list(makeSymbol("NEW-TYPICAL-SIZE-HARVESTABLE-ITEM"), makeSymbol("DENOT")))))))))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym115$OUTER_CATCH_FOR_TYPICAL_SIZE_QUEUE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TYPICAL-SIZE-QUEUE-METHOD");





    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$Event = constant_handles.reader_make_constant_shell(makeString("Event"));

    public static final SubLObject $$Group = constant_handles.reader_make_constant_shell(makeString("Group"));

    public static final SubLObject $$Organization = constant_handles.reader_make_constant_shell(makeString("Organization"));

    public static final SubLObject $$HomoSapiens = constant_handles.reader_make_constant_shell(makeString("HomoSapiens"));

    public static final SubLObject $$ObjectType = constant_handles.reader_make_constant_shell(makeString("ObjectType"));

    public static final SubLObject $$PartiallyTangible = constant_handles.reader_make_constant_shell(makeString("PartiallyTangible"));

    private static final SubLSymbol TYPICAL_SIZE_QUEUE_ENQUEUE_PROCESSED_METHOD = makeSymbol("TYPICAL-SIZE-QUEUE-ENQUEUE-PROCESSED-METHOD");

    static private final SubLList $list_alt126 = list(makeSymbol("?ICT"), makeSymbol("?STANDARD"));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt129 = list(makeSymbol("?ICT"));

    static private final SubLList $list_alt130 = list(list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?ICT"), constant_handles.reader_make_constant_shell(makeString("InterconvertibleUnitType"))), list(constant_handles.reader_make_constant_shell(makeString("standardUnit")), makeSymbol("?ICT"), makeSymbol("?STANDARD")));

    public static final SubLObject $$FPSUnitOfMeasure = constant_handles.reader_make_constant_shell(makeString("FPSUnitOfMeasure"));

    public static final SubLObject $$MKSUnitOfMeasure = constant_handles.reader_make_constant_shell(makeString("MKSUnitOfMeasure"));

    public static final SubLObject $$CGSUnitOfMeasure = constant_handles.reader_make_constant_shell(makeString("CGSUnitOfMeasure"));



    static private final SubLList $list_alt135 = list(constant_handles.reader_make_constant_shell(makeString("Bertolo")));

    public static final SubLObject $$givenNames = constant_handles.reader_make_constant_shell(makeString("givenNames"));

    public static final SubLObject $$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));

    private static final SubLSymbol MAIL_SIZE_HARVESTING_REQUEST = makeSymbol("MAIL-SIZE-HARVESTING-REQUEST");

    static private final SubLString $str_alt139$Dear__A________it_seems_I_don_t_k = makeString("Dear ~A,\n\n     it seems I don\'t know all I should know concerning the \ntypical size of members of the collection\n\n     ~S\n\n     Could you please use the Fact Entry Tool to fill in the \nrequired knowledge?\n\n     Thank you in advance,\n\n     Cyc");

    static private final SubLList $list_alt140 = list(makeSymbol("TARGET"), makeSymbol("PARAPHRASE"), makeSymbol("TARGET-MT"), makeSymbol("LONG-EXPLANATION"));

    static private final SubLString $str_alt141$Size_Harvesting___S = makeString("Size Harvesting: ~S");

    static private final SubLString $str_alt142$cyc_cyc_com = makeString("cyc@cyc.com");



    public static final SubLObject $$relationAllInstance = constant_handles.reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLSymbol ARGUMENT_TYPES = makeSymbol("ARGUMENT-TYPES");



    private static final SubLSymbol MAIL_BUG = makeSymbol("MAIL-BUG");



    private static final SubLSymbol DECORATED_UNIT = makeSymbol("DECORATED-UNIT");

    static private final SubLList $list_alt150 = list(list(makeSymbol("UNIT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PARAPHRASE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("ORDER-OF-MAGNITUDE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-LIST"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol ORDER_OF_MAGNITUDE = makeSymbol("ORDER-OF-MAGNITUDE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DECORATED_UNIT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DECORATED-UNIT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DECORATED_UNIT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DECORATED-UNIT-INSTANCE");

    static private final SubLList $list_alt154 = list(list(RET, list(makeSymbol("LIST"), makeSymbol("UNIT"), makeSymbol("PARAPHRASE"), makeSymbol("ORDER-OF-MAGNITUDE"))));

    static private final SubLSymbol $sym155$OUTER_CATCH_FOR_DECORATED_UNIT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DECORATED-UNIT-METHOD");

    private static final SubLSymbol DECORATED_UNIT_TO_LIST_METHOD = makeSymbol("DECORATED-UNIT-TO-LIST-METHOD");

    private static final SubLSymbol SIZE_PREDICATE_DOSSIER = makeSymbol("SIZE-PREDICATE-DOSSIER");

    static private final SubLList $list_alt158 = list(new SubLObject[]{ list(makeSymbol("ORDER-OF-MAGNITUDE-MAP"), makeKeyword("CLASS"), makeKeyword("PRIVATE"), makeKeyword("VALUE"), list(makeSymbol("BQ-LIST*"), list(makeSymbol("BQ-LIST"), makeString("micro"), list(makeSymbol("/"), makeInteger("1000000000"))), list(makeSymbol("BQ-LIST"), makeString("tiny"), list(makeSymbol("/"), makeInteger(1000))), list(makeSymbol("BQ-LIST"), makeString("small"), list(makeSymbol("/"), TEN_INTEGER)), list(QUOTE, list(list(makeString("human-sized"), ONE_INTEGER), list(makeString("large"), TEN_INTEGER), list(makeString("huge"), makeInteger(1000)), list(makeString("astronomic"), makeInteger("1000000000")))))), list(makeSymbol("PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PARAPHRASE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("ARGUMENT-TYPES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("METRIC-UNITS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("METRIC-ANCHOR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("FPS-ANCHOR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("FPS-UNITS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ORDER-OF-MAGNITUDE-ASSIGNMENT"), list(makeSymbol("ANCHOR"), makeSymbol("UNIT")), makeKeyword("PRIVATE")) });

    private static final SubLSymbol FPS_ANCHOR = makeSymbol("FPS-ANCHOR");

    private static final SubLSymbol METRIC_ANCHOR = makeSymbol("METRIC-ANCHOR");

    private static final SubLSymbol ORDER_OF_MAGNITUDE_MAP = makeSymbol("ORDER-OF-MAGNITUDE-MAP");

    static private final SubLString $$$micro = makeString("micro");

    public static final SubLInteger $int$1000000000 = makeInteger("1000000000");

    static private final SubLString $$$tiny = makeString("tiny");



    static private final SubLString $$$small = makeString("small");

    static private final SubLList $list_alt167 = list(list(makeString("human-sized"), ONE_INTEGER), list(makeString("large"), TEN_INTEGER), list(makeString("huge"), makeInteger(1000)), list(makeString("astronomic"), makeInteger("1000000000")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SIZE_PREDICATE_DOSSIER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIZE-PREDICATE-DOSSIER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SIZE_PREDICATE_DOSSIER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIZE-PREDICATE-DOSSIER-INSTANCE");

    private static final SubLSymbol ORDER_OF_MAGNITUDE_ASSIGNMENT = makeSymbol("ORDER-OF-MAGNITUDE-ASSIGNMENT");

    static private final SubLList $list_alt171 = list(makeSymbol("ANCHOR"), makeSymbol("UNIT"));

    static private final SubLList $list_alt172 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FACTOR"), list(makeSymbol("UNIT-MULTIPLICATION-FACTOR"), makeSymbol("UNIT"), makeSymbol("ANCHOR"), constant_handles.reader_make_constant_shell(makeString("EverythingPSC"))))), list(makeSymbol("PWHEN"), list(makeSymbol("NUMBERP"), makeSymbol("FACTOR")), list(makeSymbol("CLET"), list(list(makeSymbol("UNIT"), list(makeSymbol("CAR"), makeSymbol("ORDER-OF-MAGNITUDE-MAP"))), list(makeSymbol("ASSIGNMENT"), list(makeSymbol("CAR"), makeSymbol("UNIT"))), list(makeSymbol("OOM-NUM"), list(makeSymbol("SECOND"), makeSymbol("UNIT"))), list(makeSymbol("BEST-SCORE"), list(makeSymbol("FIF"), list(makeSymbol(">"), makeSymbol("FACTOR"), makeSymbol("OOM-NUM")), list(makeSymbol("/"), makeSymbol("OOM-NUM"), makeSymbol("FACTOR")), list(makeSymbol("/"), makeSymbol("FACTOR"), makeSymbol("OOM-NUM"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("OOM"), list(makeSymbol("CDR"), makeSymbol("ORDER-OF-MAGNITUDE-MAP"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-ASSIGNMENT"), list(makeSymbol("CAR"), makeSymbol("OOM"))), list(makeSymbol("COMPARE"), list(makeSymbol("SECOND"), makeSymbol("OOM"))), list(makeSymbol("NEW-SCORE"), list(makeSymbol("FIF"), list(makeSymbol(">"), makeSymbol("FACTOR"), makeSymbol("COMPARE")), list(makeSymbol("/"), makeSymbol("COMPARE"), makeSymbol("FACTOR")), list(makeSymbol("/"), makeSymbol("FACTOR"), makeSymbol("COMPARE"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("NEW-SCORE"), makeSymbol("BEST-SCORE")), list(makeSymbol("CSETQ"), makeSymbol("BEST-SCORE"), makeSymbol("NEW-SCORE")), list(makeSymbol("CSETQ"), makeSymbol("ASSIGNMENT"), makeSymbol("NEW-ASSIGNMENT"))))), list(RET, makeSymbol("ASSIGNMENT"))))));

    static private final SubLSymbol $sym173$OUTER_CATCH_FOR_SIZE_PREDICATE_DOSSIER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIZE-PREDICATE-DOSSIER-METHOD");

    private static final SubLSymbol SIZE_PREDICATE_DOSSIER_ORDER_OF_MAGNITUDE_ASSIGNMENT_METHOD = makeSymbol("SIZE-PREDICATE-DOSSIER-ORDER-OF-MAGNITUDE-ASSIGNMENT-METHOD");

    public static final SubLObject $$arg1Isa = constant_handles.reader_make_constant_shell(makeString("arg1Isa"));

    public static final SubLObject $$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));

    public static final SubLObject $$arg2Isa = constant_handles.reader_make_constant_shell(makeString("arg2Isa"));

    private static final SubLSymbol LARGER_DECORATED_UNIT_P = makeSymbol("LARGER-DECORATED-UNIT-P");

    private static final SubLSymbol TYPICAL_SIZE_HARVESTABLE_ITEM = makeSymbol("TYPICAL-SIZE-HARVESTABLE-ITEM");

    static private final SubLList $list_alt180 = list(list(makeSymbol("CYC-FORT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PARAPHRASE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("CLARIFICATION"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("TARGET-MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SELF-COMPLETE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TO-LIST"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol CLARIFICATION = makeSymbol("CLARIFICATION");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TYPICAL_SIZE_HARVESTABLE_ITEM_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TYPICAL-SIZE-HARVESTABLE-ITEM-CLASS");

    static private final SubLSymbol $sym185$SUBLOOP_RESERVED_INITIALIZE_TYPICAL_SIZE_HARVESTABLE_ITEM_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TYPICAL-SIZE-HARVESTABLE-ITEM-INSTANCE");

    static private final SubLList $list_alt186 = list(list(RET, list(makeSymbol("BQ-LIST"), makeSymbol("CYC-FORT"), makeSymbol("PARAPHRASE"), makeSymbol("TARGET-MT"), makeSymbol("CLARIFICATION"))));

    static private final SubLSymbol $sym187$OUTER_CATCH_FOR_TYPICAL_SIZE_HARVESTABLE_ITEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TYPICAL-SIZE-HARVESTABLE-ITEM-METHOD");

    private static final SubLSymbol TYPICAL_SIZE_HARVESTABLE_ITEM_TO_LIST_METHOD = makeSymbol("TYPICAL-SIZE-HARVESTABLE-ITEM-TO-LIST-METHOD");

    private static final SubLSymbol SELF_COMPLETE = makeSymbol("SELF-COMPLETE");

    static private final SubLList $list_alt190 = list(list(makeSymbol("PWHEN"), makeSymbol("CYC-FORT"), list(makeSymbol("CLET"), list(list(makeSymbol("SALIENT-GENS"), list(makeSymbol("PPH-SALIENT-GENERALIZATIONS"), makeSymbol("CYC-FORT"))), list(makeSymbol("STRING"), list(makeSymbol("GENERATE-PHRASE"), list(makeSymbol("CAR"), makeSymbol("SALIENT-GENS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), list(makeSymbol("CDR"), makeSymbol("SALIENT-GENS"))), list(makeSymbol("CLET"), list(list(makeSymbol("ITEM-PHRASE"), list(makeSymbol("GENERATE-PHRASE"), makeSymbol("ITEM")))), list(makeSymbol("CSETQ"), makeSymbol("STRING"), list(makeSymbol("CCONCATENATE"), makeSymbol("ITEM-PHRASE"), makeString(", "), makeSymbol("STRING"))))), list(makeSymbol("CSETQ"), makeSymbol("CLARIFICATION"), makeSymbol("STRING"))), list(makeSymbol("CSETQ"), makeSymbol("PARAPHRASE"), list(makeSymbol("GENERATE-PHRASE"), makeSymbol("CYC-FORT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SET-TARGET-MT")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym191$OUTER_CATCH_FOR_TYPICAL_SIZE_HARVESTABLE_ITEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TYPICAL-SIZE-HARVESTABLE-ITEM-METHOD");

    static private final SubLString $str_alt192$__ = makeString(", ");

    private static final SubLSymbol SET_TARGET_MT = makeSymbol("SET-TARGET-MT");

    private static final SubLSymbol TYPICAL_SIZE_HARVESTABLE_ITEM_SELF_COMPLETE_METHOD = makeSymbol("TYPICAL-SIZE-HARVESTABLE-ITEM-SELF-COMPLETE-METHOD");

    static private final SubLList $list_alt195 = list(list(makeSymbol("PWHEN"), makeSymbol("CYC-FORT"), list(makeSymbol("CLET"), list(list(makeSymbol("DEFINING-MT"), list(makeSymbol("CAR"), list(makeSymbol("REMOVAL-ASK-VARIABLE"), makeKeyword("MT"), list(makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell(makeString("definingMt")), makeSymbol("CYC-FORT"), list(QUOTE, list(makeKeyword("MT")))), constant_handles.reader_make_constant_shell(makeString("EverythingPSC")), $TRUE))), makeSymbol("CANDIDATE-MT")), list(makeSymbol("PWHEN"), makeSymbol("DEFINING-MT"), list(makeSymbol("PWHEN"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("DEFINING-MT"), constant_handles.reader_make_constant_shell(makeString("VocabularyMicrotheory"))), list(makeSymbol("CLET"), list(list(makeSymbol("CANDIDATES"), list(makeSymbol("REMOVAL-ASK-VARIABLE"), makeKeyword("MT"), list(makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell(makeString("genlMt-Vocabulary")), makeKeyword("MT"), makeSymbol("DEFINING-MT")), constant_handles.reader_make_constant_shell(makeString("EverythingPSC")), $TRUE))), list(makeSymbol("CSOME"), list(makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES"), makeSymbol("CANDIDATE-MT")), list(makeSymbol("PWHEN"), list(makeSymbol("FORT-P"), makeSymbol("CANDIDATE")), list(makeSymbol("CSETQ"), makeSymbol("CANDIDATE-MT"), makeSymbol("CANDIDATE"))))))), list(makeSymbol("PWHEN"), list(makeSymbol("FORT-P"), makeSymbol("CANDIDATE-MT")), list(makeSymbol("CSETQ"), makeSymbol("TARGET-MT"), makeSymbol("CANDIDATE-MT")), list(RET, makeSymbol("SELF"))), list(makeSymbol("PCOND"), list(list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("CYC-FORT"), constant_handles.reader_make_constant_shell(makeString("GeopoliticalEntity"))), list(makeSymbol("CSETQ"), makeSymbol("TARGET-MT"), constant_handles.reader_make_constant_shell(makeString("DualistGeopoliticalMt")))), list(list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("CYC-FORT"), constant_handles.reader_make_constant_shell(makeString("BiologicalLivingObject"))), list(makeSymbol("CSETQ"), makeSymbol("TARGET-MT"), constant_handles.reader_make_constant_shell(makeString("BiologyMt")))), list(list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("CYC-FORT"), constant_handles.reader_make_constant_shell(makeString("PlantPart"))), list(makeSymbol("CSETQ"), makeSymbol("TARGET-MT"), constant_handles.reader_make_constant_shell(makeString("BotanyMt")))), list(list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("CYC-FORT"), constant_handles.reader_make_constant_shell(makeString("TopographicalFeature"))), list(makeSymbol("CSETQ"), makeSymbol("TARGET-MT"), constant_handles.reader_make_constant_shell(makeString("NaturalGeographyMt")))), list(list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("CYC-FORT"), constant_handles.reader_make_constant_shell(makeString("ProductTypeByBrand"))), list(makeSymbol("CSETQ"), makeSymbol("TARGET-MT"), constant_handles.reader_make_constant_shell(makeString("BrandNameProductPhysicalCharacteristicsMt")))), list(list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("CYC-FORT"), constant_handles.reader_make_constant_shell(makeString("ProductType"))), list(makeSymbol("CSETQ"), makeSymbol("TARGET-MT"), constant_handles.reader_make_constant_shell(makeString("ProductPhysicalCharacteristicsMt")))), list(T, list(makeSymbol("CSETQ"), makeSymbol("TARGET-MT"), constant_handles.reader_make_constant_shell(makeString("BaseKB"))))), list(RET, makeSymbol("SELF")))));

    static private final SubLSymbol $sym196$OUTER_CATCH_FOR_TYPICAL_SIZE_HARVESTABLE_ITEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TYPICAL-SIZE-HARVESTABLE-ITEM-METHOD");



    public static final SubLObject $$definingMt = constant_handles.reader_make_constant_shell(makeString("definingMt"));

    static private final SubLList $list_alt199 = list(makeKeyword("MT"));



    public static final SubLObject $$VocabularyMicrotheory = constant_handles.reader_make_constant_shell(makeString("VocabularyMicrotheory"));

    public static final SubLObject $$genlMt_Vocabulary = constant_handles.reader_make_constant_shell(makeString("genlMt-Vocabulary"));

    public static final SubLObject $$GeopoliticalEntity = constant_handles.reader_make_constant_shell(makeString("GeopoliticalEntity"));

    public static final SubLObject $$DualistGeopoliticalMt = constant_handles.reader_make_constant_shell(makeString("DualistGeopoliticalMt"));

    public static final SubLObject $$BiologicalLivingObject = constant_handles.reader_make_constant_shell(makeString("BiologicalLivingObject"));

    public static final SubLObject $$BiologyMt = constant_handles.reader_make_constant_shell(makeString("BiologyMt"));

    public static final SubLObject $$PlantPart = constant_handles.reader_make_constant_shell(makeString("PlantPart"));

    public static final SubLObject $$BotanyMt = constant_handles.reader_make_constant_shell(makeString("BotanyMt"));

    public static final SubLObject $$TopographicalFeature = constant_handles.reader_make_constant_shell(makeString("TopographicalFeature"));

    public static final SubLObject $$NaturalGeographyMt = constant_handles.reader_make_constant_shell(makeString("NaturalGeographyMt"));

    public static final SubLObject $$ProductTypeByBrand = constant_handles.reader_make_constant_shell(makeString("ProductTypeByBrand"));

    public static final SubLObject $const212$BrandNameProductPhysicalCharacter = constant_handles.reader_make_constant_shell(makeString("BrandNameProductPhysicalCharacteristicsMt"));

    public static final SubLObject $$ProductType = constant_handles.reader_make_constant_shell(makeString("ProductType"));

    public static final SubLObject $$ProductPhysicalCharacteristicsMt = constant_handles.reader_make_constant_shell(makeString("ProductPhysicalCharacteristicsMt"));

    public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol TYPICAL_SIZE_HARVESTABLE_ITEM_SET_TARGET_MT_METHOD = makeSymbol("TYPICAL-SIZE-HARVESTABLE-ITEM-SET-TARGET-MT-METHOD");



    private static final SubLSymbol SILLY_SIZE_QUESTION_BUG = makeSymbol("SILLY-SIZE-QUESTION-BUG");

    private static final SubLSymbol ODD_QUESTION_BUG = makeSymbol("ODD-QUESTION-BUG");

    static private final SubLList $list_alt220 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SILLY_SIZE_QUESTION_BUG_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SILLY-SIZE-QUESTION-BUG-CLASS");

    private static final SubLSymbol BUGZILLA_BUG = makeSymbol("BUGZILLA-BUG");



    private static final SubLSymbol CGI_SCRIPT = makeSymbol("CGI-SCRIPT");

    private static final SubLSymbol REPORTER = makeSymbol("REPORTER");







    private static final SubLSymbol AUTO_BUG_REPORT = makeSymbol("AUTO-BUG-REPORT");





    private static final SubLSymbol CYC_GUID = makeSymbol("CYC-GUID");



    private static final SubLSymbol SYSTEM_VERSION = makeSymbol("SYSTEM-VERSION");

    private static final SubLSymbol KB_NUMBER = makeSymbol("KB-NUMBER");

    private static final SubLSymbol IMAGE_TYPE = makeSymbol("IMAGE-TYPE");

    private static final SubLSymbol MACHINE_NAME = makeSymbol("MACHINE-NAME");



    private static final SubLSymbol REP_PLATFORM = makeSymbol("REP-PLATFORM");

    private static final SubLSymbol BUG_SEVERITY = makeSymbol("BUG-SEVERITY");



    private static final SubLSymbol OP_SYS = makeSymbol("OP-SYS");

    private static final SubLSymbol ASSIGNED_TO = makeSymbol("ASSIGNED-TO");

    private static final SubLSymbol BUG_FILE_LOC = makeSymbol("BUG-FILE-LOC");

    private static final SubLSymbol STATUS_WHITEBOARD = makeSymbol("STATUS-WHITEBOARD");

    private static final SubLSymbol TARGET_MILESTONE = makeSymbol("TARGET-MILESTONE");

    private static final SubLSymbol GROUPSET = makeSymbol("GROUPSET");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SILLY_SIZE_QUESTION_BUG_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SILLY-SIZE-QUESTION-BUG-INSTANCE");

    static private final SubLList $list_alt250 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRODUCT"), makeString("RKF")), list(makeSymbol("CSETQ"), makeSymbol("COMPONENT"), makeString("Typical Size Harvester")), list(makeSymbol("CSETQ"), makeSymbol("SHORT-DESC"), makeString("Cyc asked an odd dimension question")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym251$OUTER_CATCH_FOR_SILLY_SIZE_QUESTION_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SILLY-SIZE-QUESTION-BUG-METHOD");

    static private final SubLString $$$RKF = makeString("RKF");

    static private final SubLString $$$Typical_Size_Harvester = makeString("Typical Size Harvester");

    static private final SubLString $str_alt254$Cyc_asked_an_odd_dimension_questi = makeString("Cyc asked an odd dimension question");

    private static final SubLSymbol SILLY_SIZE_QUESTION_BUG_INITIALIZE_METHOD = makeSymbol("SILLY-SIZE-QUESTION-BUG-INITIALIZE-METHOD");

    static private final SubLList $list_alt256 = list(makeSymbol("?X"));

    private static final SubLSymbol SET_REPORTER = makeSymbol("SET-REPORTER");

    private static final SubLSymbol COMPUTE_COMMENT = makeSymbol("COMPUTE-COMMENT");

    private static final SubLSymbol MAIL = makeSymbol("MAIL");

    // // Initializers
    public void declareFunctions() {
        declare_workflow_queue_file();
    }

    public void initializeVariables() {
        init_workflow_queue_file();
    }

    public void runTopLevelForms() {
        setup_workflow_queue_file();
    }
}

