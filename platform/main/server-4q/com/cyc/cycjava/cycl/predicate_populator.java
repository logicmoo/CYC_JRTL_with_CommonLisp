/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.quirk.search_engine;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      PREDICATE-POPULATOR
 *  source file: /cyc/top/cycl/predicate-populator.lisp
 *  created:     2019/07/03 17:39:01
 */
public final class predicate_populator extends SubLTranslatedFile implements V02 {
    // // Constructor
    private predicate_populator() {
    }

    public static final SubLFile me = new predicate_populator();


    // // Definitions
    public static final class $sapp_task_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return predicate_populator.$sapp_task_native.structDecl;
        }

        public SubLObject getField2() {
            return $task_assertion;
        }

        public SubLObject getField3() {
            return $find_col_elements;
        }

        public SubLObject getField4() {
            return $find_col_phrases;
        }

        public SubLObject getField5() {
            return $lookup_col_elements;
        }

        public SubLObject getField6() {
            return $search_strings;
        }

        public SubLObject getField7() {
            return $must_include_forts;
        }

        public SubLObject getField8() {
            return $must_exclude_forts;
        }

        public SubLObject setField2(SubLObject value) {
            return $task_assertion = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $find_col_elements = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $find_col_phrases = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $lookup_col_elements = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $search_strings = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $must_include_forts = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $must_exclude_forts = value;
        }

        public SubLObject $task_assertion = Lisp.NIL;

        public SubLObject $find_col_elements = Lisp.NIL;

        public SubLObject $find_col_phrases = Lisp.NIL;

        public SubLObject $lookup_col_elements = Lisp.NIL;

        public SubLObject $search_strings = Lisp.NIL;

        public SubLObject $must_include_forts = Lisp.NIL;

        public SubLObject $must_exclude_forts = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(predicate_populator.$sapp_task_native.class, SAPP_TASK, SAPP_TASK_P, $list_alt2, $list_alt3, new String[]{ "$task_assertion", "$find_col_elements", "$find_col_phrases", "$lookup_col_elements", "$search_strings", "$must_include_forts", "$must_exclude_forts" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_sapp_task$ = makeSymbol("*DTP-SAPP-TASK*");

    public static final SubLObject sapp_task_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sapp_task_p(SubLObject v_object) {
        return v_object.getJavaClass() ==predicate_populator.$sapp_task_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $sapp_task_p$UnaryFunction extends UnaryFunction {
        public $sapp_task_p$UnaryFunction() {
            super(extractFunctionNamed("SAPP-TASK-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return sapp_task_p(arg1);
        }
    }

    public static final SubLObject sapp_task_task_assertion(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.getField2();
    }

    public static final SubLObject sapp_task_find_col_elements(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.getField3();
    }

    public static final SubLObject sapp_task_find_col_phrases(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.getField4();
    }

    public static final SubLObject sapp_task_lookup_col_elements(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.getField5();
    }

    public static final SubLObject sapp_task_search_strings(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.getField6();
    }

    public static final SubLObject sapp_task_must_include_forts(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.getField7();
    }

    public static final SubLObject sapp_task_must_exclude_forts(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.getField8();
    }

    public static final SubLObject _csetf_sapp_task_task_assertion(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sapp_task_find_col_elements(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sapp_task_find_col_phrases(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sapp_task_lookup_col_elements(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sapp_task_search_strings(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sapp_task_must_include_forts(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sapp_task_must_exclude_forts(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SAPP_TASK_P);
        return v_object.setField8(value);
    }

    public static final SubLObject make_sapp_task(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new predicate_populator.$sapp_task_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TASK_ASSERTION)) {
                        _csetf_sapp_task_task_assertion(v_new, current_value);
                    } else
                        if (pcase_var.eql($FIND_COL_ELEMENTS)) {
                            _csetf_sapp_task_find_col_elements(v_new, current_value);
                        } else
                            if (pcase_var.eql($FIND_COL_PHRASES)) {
                                _csetf_sapp_task_find_col_phrases(v_new, current_value);
                            } else
                                if (pcase_var.eql($LOOKUP_COL_ELEMENTS)) {
                                    _csetf_sapp_task_lookup_col_elements(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SEARCH_STRINGS)) {
                                        _csetf_sapp_task_search_strings(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($MUST_INCLUDE_FORTS)) {
                                            _csetf_sapp_task_must_include_forts(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($MUST_EXCLUDE_FORTS)) {
                                                _csetf_sapp_task_must_exclude_forts(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                                            }






                }
            }
            return v_new;
        }
    }

    // defparameter
    public static final SubLSymbol $sapp_task_mt$ = makeSymbol("*SAPP-TASK-MT*");

    // defparameter
    public static final SubLSymbol $num_articles_for_predicate_populator$ = makeSymbol("*NUM-ARTICLES-FOR-PREDICATE-POPULATOR*");

    // defparameter
    public static final SubLSymbol $ppt_run_time_error$ = makeSymbol("*PPT-RUN-TIME-ERROR*");

    // defparameter
    public static final SubLSymbol $ppt_proximity_distance$ = makeSymbol("*PPT-PROXIMITY-DISTANCE*");

    /**
     * A utility function for populating more than one ppt at a time, as in a batch run.
     * The primary benefit to this function is that each ppt trial is wrapped in a error-catching block,
     * so that if there is some problem with one ppt, the whole batch run won't be compromised.  However,
     * a keyboard interrupt still halts the whole process.
     *
     * @param ppts
     * 		a list of PredicatePopulationTasks, i.e., valid arguments to populate-ppt.
     * @return nil if interrupted, t otherwise
     */
    public static final SubLObject populate_ppt_list(SubLObject ppts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = ppts;
                SubLObject ppt = NIL;
                for (ppt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ppt = cdolist_list_var.first()) {
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    populate_ppt(ppt);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        $ppt_run_time_error$.setDynamicValue(Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue()), thread);
                    }
                    if (NIL != $ppt_run_time_error$.getDynamicValue(thread)) {
                        terpri(UNPROVIDED);
                        princ($str_alt32$Experienced_error__, UNPROVIDED);
                        princ($ppt_run_time_error$.getDynamicValue(thread), UNPROVIDED);
                        if (NIL != Strings.string_equal($ppt_run_time_error$.getDynamicValue(thread), $str_alt33$Received_signal_number_2__Keyboar, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            terpri(UNPROVIDED);
                            princ($str_alt34$Keyboard_interrupt___Aborting_pop, UNPROVIDED);
                            return NIL;
                        }
                        $ppt_run_time_error$.setDynamicValue(NIL, thread);
                    }
                }
            }
            return T;
        }
    }

    /**
     * The main public interface to the PredicatePopulator code.
     *
     * @param ppt
     * 		can be either some specializtion of #$PredicatePopulationTask, or the list whose corresponding
     * 		nart is such a specialization - both argument types are handled for ease of use.
     * 		Creates a new sapp-task object to hold the information in the ppt, and then populates that sapp-task,
     * 		making suggested assertions in the microtheory defined by *sapp-task-mt*.
     * @return nil in case of known failure, t for probable success.
     */
    public static final SubLObject populate_ppt(SubLObject v_object) {
        {
            SubLObject ppt = NIL;
            if (NIL != forts.fort_p(v_object)) {
                ppt = v_object;
            } else {
                if (NIL != el_utilities.possibly_naut_p(v_object)) {
                    ppt = narts_high.find_nart(v_object);
                }
            }
            if (NIL == ppt) {
                Errors.error($str_alt35$Argument_to_populate_ppt_was_in_a);
            } else {
                if (NIL != genls.genlsP(v_object, $$PredicatePopulationTask, UNPROVIDED, UNPROVIDED)) {
                    princ($str_alt37$Running_populate_ppt_command_on_p, UNPROVIDED);
                    princ(ppt, UNPROVIDED);
                    terpri(UNPROVIDED);
                    return populate_task(new_sapp_task(ppt));
                } else {
                    Errors.error($str_alt38$Argument_was_not_found_to_be_a_sp);
                }
            }
        }
        return NIL;
    }

    /**
     * This is a convenience function intended to solve the problem of populating a task and only then realizing
     * that the filter settings were not optimal for that population.  Since re-populating is a time-consuming
     * process, this function was created to allow quick re-application of filter settings to an
     * already-populated task.
     *
     * @param object,
     * 		any legal argument to populate-ppt, with the added condition that the corresponding
     * 		population task must already have been populated.
     */
    public static final SubLObject filter_after_populating(SubLObject v_object) {
        {
            SubLObject ppt = NIL;
            if (NIL != forts.fort_p(v_object)) {
                ppt = v_object;
            } else {
                if (NIL != el_utilities.possibly_naut_p(v_object)) {
                    ppt = narts_high.find_nart(v_object);
                }
            }
            if (NIL == ppt) {
                Errors.error($str_alt39$Argument_to_filter_after_the_fact);
            } else {
                if (NIL != genls.genlsP(v_object, $$PredicatePopulationTask, UNPROVIDED, UNPROVIDED)) {
                    terpri(UNPROVIDED);
                    princ($str_alt40$Running_filter_after_populating_c, UNPROVIDED);
                    princ(ppt, UNPROVIDED);
                    terpri(UNPROVIDED);
                    {
                        SubLObject task = new_sapp_task(ppt);
                        initialize_filters(task);
                        terpri(UNPROVIDED);
                        princ($str_alt41$Including_terms__, UNPROVIDED);
                        princ(sapp_task_must_include_forts(task), UNPROVIDED);
                        terpri(UNPROVIDED);
                        princ($str_alt42$Excluding_terms__, UNPROVIDED);
                        princ(sapp_task_must_exclude_forts(task), UNPROVIDED);
                        terpri(UNPROVIDED);
                        {
                            SubLObject old_ppts = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(ppt, $$choicesForInPredPopTask, $$PredicatePopulationMt, TWO_INTEGER, UNPROVIDED);
                            SubLObject new_ppt = NIL;
                            SubLObject new_choices = NIL;
                            SubLObject old_choices = NIL;
                            SubLObject old_formula = NIL;
                            SubLObject cdolist_list_var = old_ppts;
                            SubLObject old_ppt = NIL;
                            for (old_ppt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , old_ppt = cdolist_list_var.first()) {
                                old_formula = copy_tree(assertions_high.assertion_formula(old_ppt));
                                old_choices = remove($$TheList, nth(THREE_INTEGER, old_formula), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                new_choices = cons($$TheList, append(set_difference(old_choices, sapp_task_must_exclude_forts(task), UNPROVIDED, UNPROVIDED), set_difference(sapp_task_must_include_forts(task), old_choices, UNPROVIDED, UNPROVIDED)));
                                new_choices = list_utilities.remove_if_not(CONSTANT_P, new_choices, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                set_nth(THREE_INTEGER, old_formula, new_choices);
                                new_ppt = old_formula;
                                ke.ke_unassert_now(assertions_high.assertion_formula(old_ppt), $$PredicatePopulationMt);
                                if (NIL != constant_handles.constant_p(second(old_formula))) {
                                    ke.ke_assert_now(new_ppt, $$PredicatePopulationMt, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                } else {
                    Errors.error($str_alt38$Argument_was_not_found_to_be_a_sp);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param PPT
     * 		some #$PredicatePopulationTask
     * @return a new sapp-task object corresponding to PPT, setting the assertion of the task,
    but not initializing the lookup and find collections.
     */
    public static final SubLObject new_sapp_task(SubLObject ppt) {
        {
            SubLObject task = make_sapp_task(UNPROVIDED);
            _csetf_sapp_task_task_assertion(task, ppt);
            return task;
        }
    }

    /**
     *
     *
     * @param TASK,
     * 		the sapp-task object
     * 		Essentially runs the sapp-task, initializing the find and lookup collections and making assertions
     * 		of hypothesized facts awaiting user confirmation.
     * @return nil for known failure, t for probable success.
     */
    public static final SubLObject populate_task(SubLObject task) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            princ($str_alt47$Finding_filters_____, UNPROVIDED);
            initialize_filters(task);
            terpri(UNPROVIDED);
            princ($str_alt41$Including_terms__, UNPROVIDED);
            princ(sapp_task_must_include_forts(task), UNPROVIDED);
            terpri(UNPROVIDED);
            princ($str_alt42$Excluding_terms__, UNPROVIDED);
            princ(sapp_task_must_exclude_forts(task), UNPROVIDED);
            terpri(UNPROVIDED);
            princ($str_alt48$Finding_lookup_collection_____, UNPROVIDED);
            initialize_lookup_col(task);
            princ($str_alt49$Found_, UNPROVIDED);
            princ(length(sapp_task_lookup_col_elements(task)), UNPROVIDED);
            princ($str_alt50$_elements_, UNPROVIDED);
            terpri(UNPROVIDED);
            princ($str_alt51$Finding_find_collection_and_gener, UNPROVIDED);
            initialize_find_col(task);
            princ($str_alt49$Found_, UNPROVIDED);
            princ(length(sapp_task_find_col_elements(task)), UNPROVIDED);
            princ($str_alt50$_elements_, UNPROVIDED);
            terpri(UNPROVIDED);
            princ($str_alt52$Finding_search_strings_____, UNPROVIDED);
            princ($str_alt53$Search_string_feature_currently_d, UNPROVIDED);
            terpri(UNPROVIDED);
            if ((NIL == sapp_task_find_col_elements(task)) || (NIL == sapp_task_lookup_col_elements(task))) {
                Errors.error($str_alt54$Couldn_t_find_find_collection_ele);
                return NIL;
            } else {
                {
                    SubLObject lookup_col_size = length(sapp_task_lookup_col_elements(task));
                    SubLObject current_number = ONE_INTEGER;
                    SubLObject cdolist_list_var = sapp_task_lookup_col_elements(task);
                    SubLObject lookup_instance = NIL;
                    for (lookup_instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lookup_instance = cdolist_list_var.first()) {
                        princ($str_alt55$Now_poulating_instance__, UNPROVIDED);
                        princ(lookup_instance, UNPROVIDED);
                        princ($str_alt56$___Item_, UNPROVIDED);
                        princ(current_number, UNPROVIDED);
                        princ($str_alt57$_of_, UNPROVIDED);
                        princ(lookup_col_size, UNPROVIDED);
                        princ($str_alt58$____, UNPROVIDED);
                        terpri(UNPROVIDED);
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        make_choices_assertion(task, lookup_instance, filter_choices(task, get_constants_all_levels(task, lookup_instance)));
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            $ppt_run_time_error$.setDynamicValue(Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue()), thread);
                        }
                        if (NIL != $ppt_run_time_error$.getDynamicValue(thread)) {
                            terpri(UNPROVIDED);
                            princ($str_alt32$Experienced_error__, UNPROVIDED);
                            princ($ppt_run_time_error$.getDynamicValue(thread), UNPROVIDED);
                            if (NIL != Strings.string_equal($ppt_run_time_error$.getDynamicValue(thread), $str_alt33$Received_signal_number_2__Keyboar, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                terpri(UNPROVIDED);
                                princ($str_alt34$Keyboard_interrupt___Aborting_pop, UNPROVIDED);
                                return NIL;
                            }
                            $ppt_run_time_error$.setDynamicValue(NIL, thread);
                        }
                        terpri(UNPROVIDED);
                        current_number = number_utilities.f_1X(current_number);
                    }
                    return T;
                }
            }
        }
    }

    /**
     *
     *
     * @param STR
     * 		any string
     * @param SEARCH-TYPE
     * 		an integer in [0 ,  *number-of-search-options* ).
     * @return a new string based on STR but changed to a query with SEARCH-TYPE level of precision.
    This function is helpful because we like to try to search for strings with a high level of precision
    - for example, a whole phrase like 'catering company'.  But if the whole phrase cannot be found, the
    constraints can be relaxed and the phrase can be broken into its constituent elements.

    Currently, 0 is the most precise, searching for the exact phrase, 1 is intermediate, using a proximity search,
    and 2 uses Lucene's default behavior for multiple separate search terms.
     */
    public static final SubLObject make_query_string(SubLObject str, SubLObject search_type) {
        {
            SubLObject pcase_var = search_type;
            if (pcase_var.eql(ZERO_INTEGER)) {
                return enclose_in_quotes(str);
            } else
                if (pcase_var.eql(ONE_INTEGER)) {
                    return make_proximity_search(str);
                } else
                    if (pcase_var.eql(TWO_INTEGER)) {
                        return str;
                    } else {
                        princ($str_alt59$make_query_string_called_with_inv, UNPROVIDED);
                        princ(search_type, UNPROVIDED);
                        terpri(UNPROVIDED);
                        return str;
                    }


        }
    }

    /**
     *
     *
     * @param OBJ,
     * 		some cyc object that can have a phrase generated from it.
     * @param TASK,
     * 		some sapp-task, possibly containing search-strings to add to the query.
     * @param SEARCH-TYPE
     * 		an integer in [0, *number-of-search-options* ).  See make-query-string for description.
     * @return listp, a concatenation of text in articles in wikipedia expected to be relevant to obj,
    formatted as a list of strings, each string corresponding to one word or to punctuation.
     */
    public static final SubLObject get_text(SubLObject obj, SubLObject task, SubLObject search_type) {
        if (task == UNPROVIDED) {
            task = NIL;
        }
        if (search_type == UNPROVIDED) {
            search_type = TWO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject generated_string = pph_main.generate_phrase(obj, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject query_string = make_query_string(generated_string, search_type);
                if ((NIL != task) && (NIL != sapp_task_search_strings(task))) {
                    {
                        SubLObject cdolist_list_var = sapp_task_search_strings(task);
                        SubLObject str = NIL;
                        for (str = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , str = cdolist_list_var.first()) {
                            query_string = cconcatenate(query_string, cconcatenate($str_alt60$_, str));
                        }
                    }
                }
                princ($str_alt61$Searching_with_string__, UNPROVIDED);
                princ(query_string, UNPROVIDED);
                terpri(UNPROVIDED);
                {
                    SubLObject lquery = search_engine.new_lucene_query(query_string, $num_articles_for_predicate_populator$.getDynamicValue(thread), UNPROVIDED);
                    SubLObject answers = methods.funcall_instance_method_with_0_args(lquery, GET);
                    SubLObject word_list = NIL;
                    SubLObject cdolist_list_var = answers;
                    SubLObject luc_passage = NIL;
                    for (luc_passage = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , luc_passage = cdolist_list_var.first()) {
                        {
                            SubLObject v_document = document.new_document(methods.funcall_instance_method_with_0_args(luc_passage, GET_CONTENT), UNPROVIDED, UNPROVIDED_SYM);
                            SubLObject vector_var = document.document_paragraphs(v_document);
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject paragraph = aref(vector_var, element_num);
                                    SubLObject vector_var_1 = document.paragraph_sentences(paragraph);
                                    SubLObject backwardP_var_2 = NIL;
                                    SubLObject length_3 = length(vector_var_1);
                                    SubLObject v_iteration_4 = NIL;
                                    for (v_iteration_4 = ZERO_INTEGER; v_iteration_4.numL(length_3); v_iteration_4 = add(v_iteration_4, ONE_INTEGER)) {
                                        {
                                            SubLObject element_num_5 = (NIL != backwardP_var_2) ? ((SubLObject) (subtract(length_3, v_iteration_4, ONE_INTEGER))) : v_iteration_4;
                                            SubLObject sentence = aref(vector_var_1, element_num_5);
                                            SubLObject vector_var_6 = document.sentence_yield(sentence);
                                            SubLObject backwardP_var_7 = NIL;
                                            SubLObject length_8 = length(vector_var_6);
                                            SubLObject v_iteration_9 = NIL;
                                            for (v_iteration_9 = ZERO_INTEGER; v_iteration_9.numL(length_8); v_iteration_9 = add(v_iteration_9, ONE_INTEGER)) {
                                                {
                                                    SubLObject element_num_10 = (NIL != backwardP_var_7) ? ((SubLObject) (subtract(length_8, v_iteration_9, ONE_INTEGER))) : v_iteration_9;
                                                    SubLObject word = aref(vector_var_6, element_num_10);
                                                    word_list = cons(document.word_string(word), word_list);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return nreverse(word_list);
                }
            }
        }
    }

    /**
     *
     *
     * @param STR
     * 		any string
     * @return a new string containing STR surrounded by quotes.
     */
    public static final SubLObject enclose_in_quotes(SubLObject str) {
        return cconcatenate(Strings.string(CHAR_quotation), cconcatenate(str, Strings.string(CHAR_quotation)));
    }

    /**
     *
     *
     * @param STR
     * 		any string
     * @return a new string making STR into a proximity search with syntax defined by lucene and a distance of
    ppt-proximity-distance*.  (A proximity search means that all the terms in STR must be found within a
    phrase containing no more than *ppt-proximity-distance* words.)
     */
    public static final SubLObject make_proximity_search(SubLObject str) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cconcatenate(enclose_in_quotes(str), cconcatenate($str_alt64$_, string_utilities.to_string($ppt_proximity_distance$.getDynamicValue(thread))));
        }
    }

    /**
     *
     *
     * @param STR,
     * 		the query string to send to lucene
     * @param NUM-ARTICLES
     * 		the number of articles to retrieve.
     * 		Retrieves the top NUM-ARTICLES articles in wikipedia relevant to STR, as indexed by lucene.
     * @return a concatenation of these articles, formatted as a list of strings, each string corresponding
    to one word or punctuation.
     */
    public static final SubLObject get_text_from_string(SubLObject str, SubLObject num_articles) {
        if (num_articles == UNPROVIDED) {
            num_articles = $num_articles_for_predicate_populator$.getDynamicValue();
        }
        {
            SubLObject query = search_engine.new_lucene_query(str, num_articles, UNPROVIDED);
            SubLObject answers = methods.funcall_instance_method_with_0_args(query, GET);
            SubLObject word_list = NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject luc_passage = NIL;
            for (luc_passage = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , luc_passage = cdolist_list_var.first()) {
                {
                    SubLObject v_document = document.new_document(methods.funcall_instance_method_with_0_args(luc_passage, GET_CONTENT), UNPROVIDED, UNPROVIDED_SYM);
                    SubLObject vector_var = document.document_paragraphs(v_document);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject paragraph = aref(vector_var, element_num);
                            SubLObject vector_var_11 = document.paragraph_sentences(paragraph);
                            SubLObject backwardP_var_12 = NIL;
                            SubLObject length_13 = length(vector_var_11);
                            SubLObject v_iteration_14 = NIL;
                            for (v_iteration_14 = ZERO_INTEGER; v_iteration_14.numL(length_13); v_iteration_14 = add(v_iteration_14, ONE_INTEGER)) {
                                {
                                    SubLObject element_num_15 = (NIL != backwardP_var_12) ? ((SubLObject) (subtract(length_13, v_iteration_14, ONE_INTEGER))) : v_iteration_14;
                                    SubLObject sentence = aref(vector_var_11, element_num_15);
                                    SubLObject vector_var_16 = document.sentence_yield(sentence);
                                    SubLObject backwardP_var_17 = NIL;
                                    SubLObject length_18 = length(vector_var_16);
                                    SubLObject v_iteration_19 = NIL;
                                    for (v_iteration_19 = ZERO_INTEGER; v_iteration_19.numL(length_18); v_iteration_19 = add(v_iteration_19, ONE_INTEGER)) {
                                        {
                                            SubLObject element_num_20 = (NIL != backwardP_var_17) ? ((SubLObject) (subtract(length_18, v_iteration_19, ONE_INTEGER))) : v_iteration_19;
                                            SubLObject word = aref(vector_var_16, element_num_20);
                                            word_list = cons(document.word_string(word), word_list);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(word_list);
        }
    }

    /**
     *
     *
     * @param TASK,
     * 		some sapp-task
     * 		Initializes the must-include and must-exclude collections of the task.  If some constant appears
     * 		in both lists, then by default the include assertion will override the exclude assertion.
     */
    public static final SubLObject initialize_filters(SubLObject task) {
        _csetf_sapp_task_must_exclude_forts(task, kb_mapping_utilities.fpred_value_in_any_mt(sapp_task_task_assertion(task), $$excludeFromChoicesForPredPopTask, ONE_INTEGER, TWO_INTEGER, UNPROVIDED).rest());
        _csetf_sapp_task_must_include_forts(task, kb_mapping_utilities.fpred_value_in_any_mt(sapp_task_task_assertion(task), $$includeInChoicesForPredPopTask, ONE_INTEGER, TWO_INTEGER, UNPROVIDED).rest());
        {
            SubLObject v_int = intersection(sapp_task_must_include_forts(task), sapp_task_must_exclude_forts(task), UNPROVIDED, UNPROVIDED);
            if (NIL != v_int) {
                terpri(UNPROVIDED);
                princ($str_alt67$The_following_terms_were_found_in, UNPROVIDED);
                princ(v_int, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TASK,
     * 		some sapp-task
     * @return listp, a list of strings, each of which should be included in queries for this task.
    sets the member variable of task, search-strings to this list.
     */
    public static final SubLObject initialize_search_strings(SubLObject task) {
        {
            SubLObject search_string_predicate = constants_high.find_constant($$$predicateSearchStrings);
            _csetf_sapp_task_search_strings(task, kb_mapping_utilities.pred_values_in_any_mt(sapp_task_task_assertion(task), search_string_predicate, ONE_INTEGER, TWO_INTEGER, UNPROVIDED));
        }
        return sapp_task_search_strings(task);
    }

    /**
     *
     *
     * @param SEQ1
     * 		the potential subsequence
     * @param SEQ2
     * 		the larger sequence
     * @return the number of times that SEQ1 is a subsequence of SEQ2, using
    string-equal as an element comparison test.
     */
    public static final SubLObject count_subsequence_matches(SubLObject seq1, SubLObject seq2) {
        {
            SubLObject v_instances = ZERO_INTEGER;
            SubLObject subseq2 = NIL;
            for (subseq2 = seq2; NIL != subseq2; subseq2 = subseq2.rest()) {
                if (NIL != Strings.string_equal(seq1.first(), subseq2.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    if (NIL != beginning_matches(seq1, subseq2)) {
                        v_instances = number_utilities.f_1X(v_instances);
                    }
                }
            }
            return v_instances;
        }
    }

    public static final SubLObject beginning_matches(SubLObject seq1, SubLObject seq2) {
        {
            SubLObject subseq1 = NIL;
            SubLObject subseq2 = NIL;
            for (subseq1 = seq1, subseq2 = seq2; true; subseq1 = subseq1.rest() , subseq2 = subseq2.rest()) {
                if (NIL == subseq1) {
                    return T;
                }
                if (NIL == subseq2) {
                    return NIL;
                }
                if (NIL == Strings.string_equal(subseq1.first(), subseq2.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return NIL;
                }
            }
        }
    }

    // defconstant
    private static final SubLSymbol $number_of_search_options$ = makeSymbol("*NUMBER-OF-SEARCH-OPTIONS*");

    /**
     * A wrapper for get-constants that tries multiple levels of precision hoping to optimize the search.
     *
     * @param TASK
     * 		the relevant sapp-task.
     * @param OBJ
     * 		the lookup-instance currently being populated.
     * @return listp a list of constants hopefully relevant to the lookup instance.
     */
    public static final SubLObject get_constants_all_levels(SubLObject task, SubLObject obj) {
        {
            SubLObject final_result = NIL;
            SubLObject temp_result = NIL;
            try {
                {
                    SubLObject current_level = NIL;
                    for (current_level = ZERO_INTEGER; current_level.numL($number_of_search_options$.getGlobalValue()); current_level = add(current_level, ONE_INTEGER)) {
                        princ($str_alt70$Trying_level_, UNPROVIDED);
                        princ(current_level, UNPROVIDED);
                        princ($str_alt71$___, UNPROVIDED);
                        temp_result = get_constants(task, obj, current_level);
                        if (NIL != temp_result) {
                            sublisp_throw(DONE, temp_result);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                final_result = Errors.handleThrowable(ccatch_env_var, DONE);
            }
            return final_result;
        }
    }

    /**
     *
     *
     * @param TASK,
     * 		some sapp-task
     * @param OBJ
     * 		some cyc object that can have a phrase generated from it
     * @param SEARCH-TYPE
     * 		allows the function make-query-string to modify the search string to different levels
     * 		of precision.  For more information, see the documentation on that function.  SEARCH-TYPE must be an integer
     * 		in [0, *number-of-search-options* ).
     * @return listp a list of cyc constants instances or specs of find-col that are possibly related to obj.
    Requires that (initialize-find-col TASK) has been run.
     */
    public static final SubLObject get_constants(SubLObject task, SubLObject obj, SubLObject search_type) {
        if (search_type == UNPROVIDED) {
            search_type = TWO_INTEGER;
        }
        {
            SubLObject passage_text = get_text(obj, task, search_type);
            SubLObject matches = NIL;
            SubLObject matches_count_list = NIL;
            SubLObject find_col_elements_iter = NIL;
            SubLObject find_col_phrases_iter = NIL;
            for (find_col_elements_iter = sapp_task_find_col_elements(task), find_col_phrases_iter = sapp_task_find_col_phrases(task); NIL != find_col_elements_iter; find_col_elements_iter = find_col_elements_iter.rest() , find_col_phrases_iter = find_col_phrases_iter.rest()) {
                {
                    SubLObject total_matches = ZERO_INTEGER;
                    SubLObject cdolist_list_var = find_col_phrases_iter.first();
                    SubLObject word_list = NIL;
                    for (word_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word_list = cdolist_list_var.first()) {
                        total_matches = add(total_matches, count_subsequence_matches(word_list, passage_text));
                    }
                    if (total_matches.numG(ZERO_INTEGER)) {
                        matches_count_list = cons(cons(find_col_elements_iter.first(), total_matches), matches_count_list);
                    }
                }
            }
            matches = Mapping.mapcar(symbol_function(CAR), Sort.sort(matches_count_list, symbol_function($sym73$_), symbol_function(CDR)));
            matches = remove(obj, matches, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            princ($str_alt75$Found_matches__, UNPROVIDED);
            princ(matches, UNPROVIDED);
            terpri(UNPROVIDED);
            return subseq(matches, ZERO_INTEGER, $int$30);
        }
    }

    /**
     *
     *
     * @param TASK,
     * 		the relevant sapp-task object
     * @param SPEC-PREDICATE
     * 		any binary predicate, but probably #$findSpecs or #$lookupSpecs
     * @param INSTANCE-PREDICATE
     * 		any binary predicate, but probably #$findInstances or #$loookupInstances
     * 		First finds the lookup or find constraining collection for task-assertion, COL-QUERY-RESULTS,
     * 		depending on which predicates were passed to it.
     * 		Then returns either the instances or the specs of this collection, depending on KB assertions.
     * @return a list of those instances or specs.
     */
    public static final SubLObject get_col_elements(SubLObject task, SubLObject spec_predicate, SubLObject instance_predicate) {
        {
            SubLObject col_specs_query_results = kb_mapping_utilities.fpred_value_in_any_mt(sapp_task_task_assertion(task), spec_predicate, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            SubLObject col_insts_query_results = kb_mapping_utilities.fpred_value_in_any_mt(sapp_task_task_assertion(task), instance_predicate, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            SubLObject col_query_results = NIL;
            SubLObject query_predicate = NIL;
            if (NIL == col_insts_query_results) {
                if (NIL == col_specs_query_results) {
                    Errors.warn($str_alt77$Couldn_t_retrieve_find_or_lookup_);
                    return NIL;
                } else {
                    col_query_results = col_specs_query_results;
                    query_predicate = constants_high.find_constant($$$genls);
                }
            } else {
                if (NIL == col_specs_query_results) {
                    col_query_results = col_insts_query_results;
                    query_predicate = constants_high.find_constant($$$isa);
                } else {
                    Errors.warn($str_alt80$Error_retrieving_find_or_lookup_c);
                    return NIL;
                }
            }
            {
                SubLObject col_instances_query = inference_kernel.new_cyc_query(list(query_predicate, $sym81$_X, col_query_results), constants_high.find_constant($$$EverythingPSC), $list_alt83);
                SubLObject col_elements = NIL;
                SubLObject cdolist_list_var = col_instances_query;
                SubLObject elt = NIL;
                for (elt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elt = cdolist_list_var.first()) {
                    col_elements = cons(bindings.bindings_values(elt).first(), col_elements);
                }
                return col_elements;
            }
        }
    }

    /**
     *
     *
     * @param TASK,
     * 		the relevant sapp-task
     * 		Initializes the member variable find-col-elements with either specs or instances of the find collection.
     * 		Also initializes the member variable find-col-phrases with generated phrases for the elements.
     * @return find-col-elements
     */
    public static final SubLObject initialize_find_col(SubLObject task) {
        {
            SubLObject asserted_find_col_elements = list_utilities.remove_if_not(CONSTANT_P, get_col_elements(task, $$findSpecs, $$findInstances), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject temp_find_col_elements = union(set_difference(asserted_find_col_elements, sapp_task_must_exclude_forts(task), UNPROVIDED, UNPROVIDED), sapp_task_must_include_forts(task), UNPROVIDED, UNPROVIDED);
            SubLObject temp_find_col_phrases = NIL;
            SubLObject cdolist_list_var = temp_find_col_elements;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject phrase_list_reversed = NIL;
                    SubLObject cdolist_list_var_21 = pph_methods_lexicon.all_phrases_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM);
                    SubLObject phrase = NIL;
                    for (phrase = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , phrase = cdolist_list_var_21.first()) {
                        {
                            SubLObject sentence_object = document.new_sentence(phrase, UNPROVIDED);
                            SubLObject word_list_reversed = NIL;
                            SubLObject vector_var = document.sentence_yield(sentence_object);
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject word = aref(vector_var, element_num);
                                    word_list_reversed = cons(document.word_string(word), word_list_reversed);
                                }
                            }
                            phrase_list_reversed = cons(reverse(word_list_reversed), phrase_list_reversed);
                        }
                    }
                    temp_find_col_phrases = cons(reverse(phrase_list_reversed), temp_find_col_phrases);
                }
            }
            _csetf_sapp_task_find_col_elements(task, temp_find_col_elements);
            _csetf_sapp_task_find_col_phrases(task, reverse(temp_find_col_phrases));
        }
        return sapp_task_find_col_elements(task);
    }

    /**
     *
     *
     * @param TASK,
     * 		the relevant sapp-task
     * 		Initializes the member variable lookup-col-elements with either the specs or the instances of lookup collection.
     * @return lookup-col-elements
     */
    public static final SubLObject initialize_lookup_col(SubLObject task) {
        _csetf_sapp_task_lookup_col_elements(task, list_utilities.remove_if_not(CONSTANT_P, get_col_elements(task, $$lookupSpecs, $$lookupInstances), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return sapp_task_lookup_col_elements(task);
    }

    /**
     *
     *
     * @param TASK
     * 		the relevant sapp-task
     * @param LOOKUP-INSTANCE
     * 		some cyc-object in the lookup collection
     * @param CONSTANTS-LIST
     * 		a list of cyc objects found that might satisfy the target predicate
     * 		Makes the relevant choicesForInPredPopTask assertion.
     * @return that assertion.
     */
    public static final SubLObject make_choices_assertion(SubLObject task, SubLObject lookup_instance, SubLObject constants_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == constants_list) {
                return NIL;
            }
            {
                SubLObject list_part = bq_cons($$TheList, append(constants_list, NIL));
                SubLObject assertion = list($$choicesForInPredPopTask, lookup_instance, sapp_task_task_assertion(task), list_part);
                ke.ke_assert_now(assertion, $sapp_task_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                return assertion;
            }
        }
    }

    public static final SubLObject filter_choices(SubLObject task, SubLObject choices) {
        {
            SubLObject add_to_end = set_difference(sapp_task_must_include_forts(task), choices, UNPROVIDED, UNPROVIDED);
            SubLObject filtered = append(choices, add_to_end);
            return filtered;
        }
    }

    public static final SubLObject declare_predicate_populator_file() {
        declareFunction("sapp_task_print_function_trampoline", "SAPP-TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sapp_task_p", "SAPP-TASK-P", 1, 0, false);
        new predicate_populator.$sapp_task_p$UnaryFunction();
        declareFunction("sapp_task_task_assertion", "SAPP-TASK-TASK-ASSERTION", 1, 0, false);
        declareFunction("sapp_task_find_col_elements", "SAPP-TASK-FIND-COL-ELEMENTS", 1, 0, false);
        declareFunction("sapp_task_find_col_phrases", "SAPP-TASK-FIND-COL-PHRASES", 1, 0, false);
        declareFunction("sapp_task_lookup_col_elements", "SAPP-TASK-LOOKUP-COL-ELEMENTS", 1, 0, false);
        declareFunction("sapp_task_search_strings", "SAPP-TASK-SEARCH-STRINGS", 1, 0, false);
        declareFunction("sapp_task_must_include_forts", "SAPP-TASK-MUST-INCLUDE-FORTS", 1, 0, false);
        declareFunction("sapp_task_must_exclude_forts", "SAPP-TASK-MUST-EXCLUDE-FORTS", 1, 0, false);
        declareFunction("_csetf_sapp_task_task_assertion", "_CSETF-SAPP-TASK-TASK-ASSERTION", 2, 0, false);
        declareFunction("_csetf_sapp_task_find_col_elements", "_CSETF-SAPP-TASK-FIND-COL-ELEMENTS", 2, 0, false);
        declareFunction("_csetf_sapp_task_find_col_phrases", "_CSETF-SAPP-TASK-FIND-COL-PHRASES", 2, 0, false);
        declareFunction("_csetf_sapp_task_lookup_col_elements", "_CSETF-SAPP-TASK-LOOKUP-COL-ELEMENTS", 2, 0, false);
        declareFunction("_csetf_sapp_task_search_strings", "_CSETF-SAPP-TASK-SEARCH-STRINGS", 2, 0, false);
        declareFunction("_csetf_sapp_task_must_include_forts", "_CSETF-SAPP-TASK-MUST-INCLUDE-FORTS", 2, 0, false);
        declareFunction("_csetf_sapp_task_must_exclude_forts", "_CSETF-SAPP-TASK-MUST-EXCLUDE-FORTS", 2, 0, false);
        declareFunction("make_sapp_task", "MAKE-SAPP-TASK", 0, 1, false);
        declareFunction("populate_ppt_list", "POPULATE-PPT-LIST", 1, 0, false);
        declareFunction("populate_ppt", "POPULATE-PPT", 1, 0, false);
        declareFunction("filter_after_populating", "FILTER-AFTER-POPULATING", 1, 0, false);
        declareFunction("new_sapp_task", "NEW-SAPP-TASK", 1, 0, false);
        declareFunction("populate_task", "POPULATE-TASK", 1, 0, false);
        declareFunction("make_query_string", "MAKE-QUERY-STRING", 2, 0, false);
        declareFunction("get_text", "GET-TEXT", 1, 2, false);
        declareFunction("enclose_in_quotes", "ENCLOSE-IN-QUOTES", 1, 0, false);
        declareFunction("make_proximity_search", "MAKE-PROXIMITY-SEARCH", 1, 0, false);
        declareFunction("get_text_from_string", "GET-TEXT-FROM-STRING", 1, 1, false);
        declareFunction("initialize_filters", "INITIALIZE-FILTERS", 1, 0, false);
        declareFunction("initialize_search_strings", "INITIALIZE-SEARCH-STRINGS", 1, 0, false);
        declareFunction("count_subsequence_matches", "COUNT-SUBSEQUENCE-MATCHES", 2, 0, false);
        declareFunction("beginning_matches", "BEGINNING-MATCHES", 2, 0, false);
        declareFunction("get_constants_all_levels", "GET-CONSTANTS-ALL-LEVELS", 2, 0, false);
        declareFunction("get_constants", "GET-CONSTANTS", 2, 1, false);
        declareFunction("get_col_elements", "GET-COL-ELEMENTS", 3, 0, false);
        declareFunction("initialize_find_col", "INITIALIZE-FIND-COL", 1, 0, false);
        declareFunction("initialize_lookup_col", "INITIALIZE-LOOKUP-COL", 1, 0, false);
        declareFunction("make_choices_assertion", "MAKE-CHOICES-ASSERTION", 3, 0, false);
        declareFunction("filter_choices", "FILTER-CHOICES", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_predicate_populator_file() {
        defconstant("*DTP-SAPP-TASK*", SAPP_TASK);
        defparameter("*SAPP-TASK-MT*", constants_high.find_constant($$$PredicatePopulationMt));
        defparameter("*NUM-ARTICLES-FOR-PREDICATE-POPULATOR*", TEN_INTEGER);
        defparameter("*PPT-RUN-TIME-ERROR*", NIL);
        defparameter("*PPT-PROXIMITY-DISTANCE*", TWENTY_INTEGER);
        defconstant("*NUMBER-OF-SEARCH-OPTIONS*", THREE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_predicate_populator_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_sapp_task$.getGlobalValue(), symbol_function(SAPP_TASK_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SAPP_TASK_TASK_ASSERTION, _CSETF_SAPP_TASK_TASK_ASSERTION);
        def_csetf(SAPP_TASK_FIND_COL_ELEMENTS, _CSETF_SAPP_TASK_FIND_COL_ELEMENTS);
        def_csetf(SAPP_TASK_FIND_COL_PHRASES, _CSETF_SAPP_TASK_FIND_COL_PHRASES);
        def_csetf(SAPP_TASK_LOOKUP_COL_ELEMENTS, _CSETF_SAPP_TASK_LOOKUP_COL_ELEMENTS);
        def_csetf(SAPP_TASK_SEARCH_STRINGS, _CSETF_SAPP_TASK_SEARCH_STRINGS);
        def_csetf(SAPP_TASK_MUST_INCLUDE_FORTS, _CSETF_SAPP_TASK_MUST_INCLUDE_FORTS);
        def_csetf(SAPP_TASK_MUST_EXCLUDE_FORTS, _CSETF_SAPP_TASK_MUST_EXCLUDE_FORTS);
        identity(SAPP_TASK);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol SAPP_TASK = makeSymbol("SAPP-TASK");

    private static final SubLSymbol SAPP_TASK_P = makeSymbol("SAPP-TASK-P");

    static private final SubLList $list_alt2 = list(makeSymbol("TASK-ASSERTION"), makeSymbol("FIND-COL-ELEMENTS"), makeSymbol("FIND-COL-PHRASES"), makeSymbol("LOOKUP-COL-ELEMENTS"), makeSymbol("SEARCH-STRINGS"), makeSymbol("MUST-INCLUDE-FORTS"), makeSymbol("MUST-EXCLUDE-FORTS"));

    static private final SubLList $list_alt3 = list(makeKeyword("TASK-ASSERTION"), makeKeyword("FIND-COL-ELEMENTS"), makeKeyword("FIND-COL-PHRASES"), makeKeyword("LOOKUP-COL-ELEMENTS"), makeKeyword("SEARCH-STRINGS"), makeKeyword("MUST-INCLUDE-FORTS"), makeKeyword("MUST-EXCLUDE-FORTS"));

    static private final SubLList $list_alt4 = list(makeSymbol("SAPP-TASK-TASK-ASSERTION"), makeSymbol("SAPP-TASK-FIND-COL-ELEMENTS"), makeSymbol("SAPP-TASK-FIND-COL-PHRASES"), makeSymbol("SAPP-TASK-LOOKUP-COL-ELEMENTS"), makeSymbol("SAPP-TASK-SEARCH-STRINGS"), makeSymbol("SAPP-TASK-MUST-INCLUDE-FORTS"), makeSymbol("SAPP-TASK-MUST-EXCLUDE-FORTS"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-SAPP-TASK-TASK-ASSERTION"), makeSymbol("_CSETF-SAPP-TASK-FIND-COL-ELEMENTS"), makeSymbol("_CSETF-SAPP-TASK-FIND-COL-PHRASES"), makeSymbol("_CSETF-SAPP-TASK-LOOKUP-COL-ELEMENTS"), makeSymbol("_CSETF-SAPP-TASK-SEARCH-STRINGS"), makeSymbol("_CSETF-SAPP-TASK-MUST-INCLUDE-FORTS"), makeSymbol("_CSETF-SAPP-TASK-MUST-EXCLUDE-FORTS"));



    private static final SubLSymbol SAPP_TASK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SAPP-TASK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol SAPP_TASK_TASK_ASSERTION = makeSymbol("SAPP-TASK-TASK-ASSERTION");

    public static final SubLSymbol _CSETF_SAPP_TASK_TASK_ASSERTION = makeSymbol("_CSETF-SAPP-TASK-TASK-ASSERTION");

    private static final SubLSymbol SAPP_TASK_FIND_COL_ELEMENTS = makeSymbol("SAPP-TASK-FIND-COL-ELEMENTS");

    public static final SubLSymbol _CSETF_SAPP_TASK_FIND_COL_ELEMENTS = makeSymbol("_CSETF-SAPP-TASK-FIND-COL-ELEMENTS");

    private static final SubLSymbol SAPP_TASK_FIND_COL_PHRASES = makeSymbol("SAPP-TASK-FIND-COL-PHRASES");

    public static final SubLSymbol _CSETF_SAPP_TASK_FIND_COL_PHRASES = makeSymbol("_CSETF-SAPP-TASK-FIND-COL-PHRASES");

    private static final SubLSymbol SAPP_TASK_LOOKUP_COL_ELEMENTS = makeSymbol("SAPP-TASK-LOOKUP-COL-ELEMENTS");

    public static final SubLSymbol _CSETF_SAPP_TASK_LOOKUP_COL_ELEMENTS = makeSymbol("_CSETF-SAPP-TASK-LOOKUP-COL-ELEMENTS");

    private static final SubLSymbol SAPP_TASK_SEARCH_STRINGS = makeSymbol("SAPP-TASK-SEARCH-STRINGS");

    public static final SubLSymbol _CSETF_SAPP_TASK_SEARCH_STRINGS = makeSymbol("_CSETF-SAPP-TASK-SEARCH-STRINGS");

    private static final SubLSymbol SAPP_TASK_MUST_INCLUDE_FORTS = makeSymbol("SAPP-TASK-MUST-INCLUDE-FORTS");

    public static final SubLSymbol _CSETF_SAPP_TASK_MUST_INCLUDE_FORTS = makeSymbol("_CSETF-SAPP-TASK-MUST-INCLUDE-FORTS");

    private static final SubLSymbol SAPP_TASK_MUST_EXCLUDE_FORTS = makeSymbol("SAPP-TASK-MUST-EXCLUDE-FORTS");

    public static final SubLSymbol _CSETF_SAPP_TASK_MUST_EXCLUDE_FORTS = makeSymbol("_CSETF-SAPP-TASK-MUST-EXCLUDE-FORTS");

    private static final SubLSymbol $TASK_ASSERTION = makeKeyword("TASK-ASSERTION");

    private static final SubLSymbol $FIND_COL_ELEMENTS = makeKeyword("FIND-COL-ELEMENTS");

    private static final SubLSymbol $FIND_COL_PHRASES = makeKeyword("FIND-COL-PHRASES");

    private static final SubLSymbol $LOOKUP_COL_ELEMENTS = makeKeyword("LOOKUP-COL-ELEMENTS");

    private static final SubLSymbol $SEARCH_STRINGS = makeKeyword("SEARCH-STRINGS");

    private static final SubLSymbol $MUST_INCLUDE_FORTS = makeKeyword("MUST-INCLUDE-FORTS");

    private static final SubLSymbol $MUST_EXCLUDE_FORTS = makeKeyword("MUST-EXCLUDE-FORTS");

    static private final SubLString $str_alt29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $$$PredicatePopulationMt = makeString("PredicatePopulationMt");



    static private final SubLString $str_alt32$Experienced_error__ = makeString("Experienced error: ");

    static private final SubLString $str_alt33$Received_signal_number_2__Keyboar = makeString("Received signal number 2 (Keyboard interrupt)");

    static private final SubLString $str_alt34$Keyboard_interrupt___Aborting_pop = makeString("Keyboard interrupt.  Aborting population task.");

    static private final SubLString $str_alt35$Argument_to_populate_ppt_was_in_a = makeString("Argument to populate-ppt was in an unrecognized format - should be either a fort or a list corresponding to some nart.");

    public static final SubLObject $$PredicatePopulationTask = constant_handles.reader_make_constant_shell(makeString("PredicatePopulationTask"));

    static private final SubLString $str_alt37$Running_populate_ppt_command_on_p = makeString("Running populate-ppt command on ppt: ");

    static private final SubLString $str_alt38$Argument_was_not_found_to_be_a_sp = makeString("Argument was not found to be a spec of #$PredicatePopulationTask");

    static private final SubLString $str_alt39$Argument_to_filter_after_the_fact = makeString("Argument to filter-after-the-fact was in an unrecognized format - should be either a fort or a list corresponding to some nart.");

    static private final SubLString $str_alt40$Running_filter_after_populating_c = makeString("Running filter-after-populating command on ppt: ");

    static private final SubLString $str_alt41$Including_terms__ = makeString("Including terms: ");

    static private final SubLString $str_alt42$Excluding_terms__ = makeString("Excluding terms: ");

    public static final SubLObject $$choicesForInPredPopTask = constant_handles.reader_make_constant_shell(makeString("choicesForInPredPopTask"));

    public static final SubLObject $$PredicatePopulationMt = constant_handles.reader_make_constant_shell(makeString("PredicatePopulationMt"));

    public static final SubLObject $$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));



    static private final SubLString $str_alt47$Finding_filters_____ = makeString("Finding filters ... ");

    static private final SubLString $str_alt48$Finding_lookup_collection_____ = makeString("Finding lookup collection ....");

    static private final SubLString $str_alt49$Found_ = makeString("Found ");

    static private final SubLString $str_alt50$_elements_ = makeString(" elements.");

    static private final SubLString $str_alt51$Finding_find_collection_and_gener = makeString("Finding find collection and generating English translations ....");

    static private final SubLString $str_alt52$Finding_search_strings_____ = makeString("Finding search strings ....");

    static private final SubLString $str_alt53$Search_string_feature_currently_d = makeString("Search string feature currently disabled.");

    static private final SubLString $str_alt54$Couldn_t_find_find_collection_ele = makeString("Couldn't find find-collection elements or lookup-collection elements.  Aborting.");

    static private final SubLString $str_alt55$Now_poulating_instance__ = makeString("Now poulating instance: ");

    static private final SubLString $str_alt56$___Item_ = makeString("  (Item ");

    static private final SubLString $str_alt57$_of_ = makeString(" of ");

    static private final SubLString $str_alt58$____ = makeString(")...");

    static private final SubLString $str_alt59$make_query_string_called_with_inv = makeString("make-query-string called with invalid argument ");

    static private final SubLString $str_alt60$_ = makeString(" ");

    static private final SubLString $str_alt61$Searching_with_string__ = makeString("Searching with string: ");





    static private final SubLString $str_alt64$_ = makeString("~");

    public static final SubLObject $$excludeFromChoicesForPredPopTask = constant_handles.reader_make_constant_shell(makeString("excludeFromChoicesForPredPopTask"));

    public static final SubLObject $$includeInChoicesForPredPopTask = constant_handles.reader_make_constant_shell(makeString("includeInChoicesForPredPopTask"));

    static private final SubLString $str_alt67$The_following_terms_were_found_in = makeString("The following terms were found in both include and exclude collections and will be included:  ");

    static private final SubLString $$$predicateSearchStrings = makeString("predicateSearchStrings");



    static private final SubLString $str_alt70$Trying_level_ = makeString("Trying level ");

    static private final SubLString $str_alt71$___ = makeString(".  ");



    static private final SubLSymbol $sym73$_ = makeSymbol(">");



    static private final SubLString $str_alt75$Found_matches__ = makeString("Found matches: ");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt77$Couldn_t_retrieve_find_or_lookup_ = makeString("Couldn't retrieve find or lookup constraint of task.");

    static private final SubLString $$$genls = makeString("genls");

    static private final SubLString $$$isa = makeString("isa");

    static private final SubLString $str_alt80$Error_retrieving_find_or_lookup_c = makeString("Error retrieving find or lookup constraint - found both specs and insts");

    static private final SubLSymbol $sym81$_X = makeSymbol("?X");

    static private final SubLString $$$EverythingPSC = makeString("EverythingPSC");

    static private final SubLList $list_alt83 = list(makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TIME"), makeInteger(60), makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER);

    public static final SubLObject $$findSpecs = constant_handles.reader_make_constant_shell(makeString("findSpecs"));

    public static final SubLObject $$findInstances = constant_handles.reader_make_constant_shell(makeString("findInstances"));

    public static final SubLObject $$lookupSpecs = constant_handles.reader_make_constant_shell(makeString("lookupSpecs"));

    public static final SubLObject $$lookupInstances = constant_handles.reader_make_constant_shell(makeString("lookupInstances"));

    // // Initializers
    public void declareFunctions() {
        declare_predicate_populator_file();
    }

    public void initializeVariables() {
        init_predicate_populator_file();
    }

    public void runTopLevelForms() {
        setup_predicate_populator_file();
    }
}

