/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.assertion_handles.assertion_p;
import static com.cyc.cycjava.cycl.assertion_handles.valid_assertionP;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.el_utilities.el_conditional_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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
 * module:      KE
 * source file: /cyc/top/cycl/ke.lisp
 * created:     2019/07/03 17:37:48
 */
public final class ke extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new ke();



    // defparameter
    // Do we keep the merged constant name info in the KB?
    /**
     * Do we keep the merged constant name info in the KB?
     */
    @LispMethod(comment = "Do we keep the merged constant name info in the KB?\ndefparameter")
    public static final SubLSymbol $note_merged_constant_name$ = makeSymbol("*NOTE-MERGED-CONSTANT-NAME*");

    // defparameter
    // Do we keep previous constant name info in the KB?
    /**
     * Do we keep previous constant name info in the KB?
     */
    @LispMethod(comment = "Do we keep previous constant name info in the KB?\ndefparameter")
    public static final SubLSymbol $note_old_constant_name$ = makeSymbol("*NOTE-OLD-CONSTANT-NAME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $ke_assert_now_assume_wff_test$ = makeSymbol("*KE-ASSERT-NOW-ASSUME-WFF-TEST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $check_if_already_ke_unassertedP$ = makeSymbol("*CHECK-IF-ALREADY-KE-UNASSERTED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ke_add_assertion_original_textP$ = makeSymbol("*KE-ADD-ASSERTION-ORIGINAL-TEXT?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ke_assertion_edit_formula_find_func$ = makeSymbol("*KE-ASSERTION-EDIT-FORMULA-FIND-FUNC*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ke_assertion_edit_formula_display_func$ = makeSymbol("*KE-ASSERTION-EDIT-FORMULA-DISPLAY-FUNC*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol KE_CREATE = makeSymbol("KE-CREATE");

    private static final SubLSymbol FI_TIMESTAMP_CONSTANT = makeSymbol("FI-TIMESTAMP-CONSTANT");

    private static final SubLSymbol FI_CREATE = makeSymbol("FI-CREATE");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLList $list10 = list(makeKeyword("UNKNOWN-ERROR"), makeString("An unknown error has occurred"));

    private static final SubLSymbol KE_CREATE_NOW = makeSymbol("KE-CREATE-NOW");

    static private final SubLList $list12 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));

    static private final SubLString $str13$Create_new_constant_now_and_add_o = makeString("Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null \nit is used, otherwise a unique identifier is generated.\n@return 0 constant ;; new constant if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param NAME string\n@param EXTERNAL-ID guid-p\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    static private final SubLList $list14 = list(makeSymbol("CONSTANT-P"), makeSymbol("LISTP"));

    private static final SubLSymbol KE_MERGE = makeSymbol("KE-MERGE");

    private static final SubLString $$$Skip_this_operation = makeString("Skip this operation");

    private static final SubLString $str17$Constant__S_cannot_be_merged_beca = makeString("Constant ~S cannot be merged because it is mentioned in code");

    private static final SubLSymbol FI_MERGE = makeSymbol("FI-MERGE");







    static private final SubLList $list22 = list(makeKeyword("FATAL-ERROR"), list(makeSymbol("FORMAT"), NIL, makeString("~A is mentioned in code and cannot be merged."), makeSymbol("KILL-FORT")));

    private static final SubLSymbol KE_KILL = makeSymbol("KE-KILL");

    private static final SubLSymbol FI_KILL = makeSymbol("FI-KILL");

    static private final SubLString $str27$Constant__S_cannot_be_killed_beca = makeString("Constant ~S cannot be killed because it is mentioned in code");

    private static final SubLSymbol KE_KILL_NOW = makeSymbol("KE-KILL-NOW");

    static private final SubLList $list29 = list(makeSymbol("FORT"));

    static private final SubLString $str30$Kill_FORT_now_and_add_operation_t = makeString("Kill FORT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORT fort\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    static private final SubLList $list31 = list(makeSymbol("BOOLEANP"), makeSymbol("LISTP"));

    static private final SubLString $str33$Constant__S_cannot_be_renamed_bec = makeString("Constant ~S cannot be renamed because it is mentioned in code");

    static private final SubLString $str34$Use_KE_RENAME = makeString("Use KE-RENAME");

    static private final SubLString $str35$Constant__S_is_not_mentioned_in_c = makeString("Constant ~S is not mentioned in code");

    private static final SubLSymbol FI_RENAME = makeSymbol("FI-RENAME");



    private static final SubLSymbol KE_ASSERT = makeSymbol("KE-ASSERT");

    private static final SubLSymbol FI_TIMESTAMP_ASSERTION = makeSymbol("FI-TIMESTAMP-ASSERTION");

    private static final SubLSymbol FI_REASSERT = makeSymbol("FI-REASSERT");

    private static final SubLSymbol FI_REASSERT_INT = makeSymbol("FI-REASSERT-INT");

    private static final SubLSymbol KE_ASSERT_NOW = makeSymbol("KE-ASSERT-NOW");

    private static final SubLList $list51 = list(makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));

    private static final SubLString $str52$Assert_FORMULA_in_MT_now_and_add_ = makeString("Assert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    private static final SubLSymbol KE_ASSERT_WFF_NOW = makeSymbol("KE-ASSERT-WFF-NOW");

    private static final SubLString $str55$Assert_FORMULA_in_MT_now_and_add_ = makeString("Assert FORMULA in MT now and add operation to transcript.\nFORMULA is assumed to be WFF.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    private static final SubLSymbol KE_ASSERT_NOW_AND_PROPAGATE_LATER = makeSymbol("KE-ASSERT-NOW-AND-PROPAGATE-LATER");

    private static final SubLString $str57$Assert_FORMULA_in_MT_now_and_add_ = makeString("Assert FORMULA in MT now and add operation to transcript.  May return before forward-propagation is complete, but not\n   before FORMULA has been asserted in MT.\n   @return 0 boolean ;; t if success, o/w nil\n   @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n   @param FORMULA list\n   @param MT microtheory\n   @param STRENGTH keyword\n   @param DIRECTION keyword\n   @note Assumes cyclist is ok.\n   @note The salient property of this function is that it never throws an error.");

    private static final SubLSymbol KE_UNASSERT = makeSymbol("KE-UNASSERT");

    private static final SubLString $str64$Sentence__S_in_mt__S__is_not_in_t = makeString("Sentence ~S in mt ~S~%is not in the KB and you are trying to unassert it.");

    private static final SubLSymbol KE_UNASSERT_NOW = makeSymbol("KE-UNASSERT-NOW");

    static private final SubLList $list66 = list(makeSymbol("FORMULA"), makeSymbol("MT"));

    private static final SubLString $str67$Unassert_FORMULA_in_MT_now_and_ad = makeString("Unassert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    private static final SubLSymbol $ke_edit_use_fi_edit$ = makeSymbol("*KE-EDIT-USE-FI-EDIT*");

    private static final SubLSymbol FI_EDIT = makeSymbol("FI-EDIT");

    private static final SubLSymbol KE_EDIT = makeSymbol("KE-EDIT");

    private static final SubLList $list71 = list(makeSymbol("OLD-FORMULA"), makeSymbol("NEW-FORMULA"), makeSymbol("OLD-MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-MT"), makeSymbol("OLD-MT")), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));

    private static final SubLString $str72$Add_to_the_agenda_operations_that = makeString("Add to the agenda operations that will remove OLD-FORMULA and replace it with NEW-FORMULA\n   @param OLD-FORMULA cycl-sentence-p; the formula to remove\n   @param NEW-FORMULA cycl-sentence-p; the formula to add\n   @param OLD-MT mt?; the mt in which OLD-FORMULA is currently asserted\n   @param NEW-MT mt?; the mt in which NEW-FORMULA should be asserted\n   @param STRENGTH keywordp\n   @param DIRECTION keywordp");

    private static final SubLList $list73 = list(makeSymbol("KEYWORDP"));

    private static final SubLSymbol KE_EDIT_NOW = makeSymbol("KE-EDIT-NOW");

    private static final SubLString $str75$Immediately_remove_OLD_FORMULA_an = makeString("Immediately remove OLD-FORMULA and replace it with NEW-FORMULA.\n   If NEW-FORMULA can\'t be added, don\'t remove OLD-FORMULA.\n   @param OLD-FORMULA cycl-sentence-p; the formula to remove\n   @param NEW-FORMULA cycl-sentence-p; the formula to add\n   @param OLD-MT mt?; the mt in which OLD-FORMULA is currently asserted\n   @param NEW-MT mt?; the mt in which NEW-FORMULA should be asserted\n   @param STRENGTH keywordp\n   @param DIRECTION keywordp");

    private static final SubLList $list77 = list(makeSymbol("NEW-META-ASSERTION-EL-FORMULA"), makeSymbol("NEW-META-ASSERTION-MT"), makeSymbol("NEW-META-ASSERTION-STRENGTH"), makeSymbol("NEW-META-ASSERTION-DIRECTION"));

    private static final SubLSymbol KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS = makeSymbol("KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS");



    private static final SubLList $list80 = list(makeSymbol("OLD-META-ASSERTION"), makeSymbol("&OPTIONAL"), makeSymbol("NEW-META-ASSERTION-MT"));

    private static final SubLString $str81$_pre_ = makeString("<pre>");

    private static final SubLString $str82$__code_ = makeString("</code>");



    private static final SubLString $str84$Sentences_do_not_differ_only_in_s = makeString("Sentences do not differ only in strings");

    private static final SubLSymbol FI_RENAME_VARIABLES = makeSymbol("FI-RENAME-VARIABLES");

    private static final SubLSymbol FI_ADD_ARGUMENT = makeSymbol("FI-ADD-ARGUMENT");

    private static final SubLSymbol $kw90$CHECK_WFF_ = makeKeyword("CHECK-WFF?");

    private static final SubLSymbol FI_REMOVE_ARGUMENT = makeSymbol("FI-REMOVE-ARGUMENT");

    private static final SubLSymbol CONVERT_HL_SUPPORT_TO_TL_SUPPORT = makeSymbol("CONVERT-HL-SUPPORT-TO-TL-SUPPORT");

    private static final SubLSymbol FI_TMS_RECONSIDER_TERM = makeSymbol("FI-TMS-RECONSIDER-TERM");

    private static final SubLSymbol FI_TMS_RECONSIDER_FORMULA = makeSymbol("FI-TMS-RECONSIDER-FORMULA");

    private static final SubLSymbol $sym97$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");



    private static final SubLList $list99 = list(reader_make_constant_shell("different"), ONE_INTEGER, ONE_INTEGER);

    public static final SubLSymbol $old_constant_names_table$ = makeSymbol("*OLD-CONSTANT-NAMES-TABLE*");

    private static final SubLString $str102$Initializing_old_constant_name_ta = makeString("Initializing old constant name table");

    private static final SubLSymbol ASSERTION_TL_IST_FORMULA = makeSymbol("ASSERTION-TL-IST-FORMULA");

    private static final SubLSymbol ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");

    private static final SubLSymbol ASSERTION_TL_FORMULA = makeSymbol("ASSERTION-TL-FORMULA");

    private static final SubLString $str107$KB_editing_is_not_allowed_for_use = makeString("KB editing is not allowed for users logged in as ~S.");

    private static final SubLSymbol FI_EVAL = makeSymbol("FI-EVAL");

    // Definitions
    public static final SubLObject ke_create_alt(SubLObject name) {
        return com.cyc.cycjava.cycl.ke.ke_create_internal(name, NIL);
    }

    // Definitions
    public static SubLObject ke_create(final SubLObject name) {
        return ke_create_internal(name, NIL);
    }

    public static final SubLObject ke_create_from_serialization_alt(SubLObject name, SubLObject external_id) {
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            {
                SubLObject ans = fi.fi_create(name, external_id);
                SubLObject error = NIL;
                if (ans != $QUEUED) {
                    error = fi.fi_get_error_int();
                }
                com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED)), list(QUOTE, fi.ke_purpose()), list(QUOTE, numeric_date_utilities.get_universal_second(UNPROVIDED))));
                if (ans != $QUEUED) {
                    fi.signal_fi_error(error);
                }
                return ans;
            }
        }
        return NIL;
    }

    public static SubLObject ke_create_from_serialization(final SubLObject name, final SubLObject external_id) {
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject ans = fi.fi_create(name, external_id);
            SubLObject error = NIL;
            if (ans != $QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED)), list(QUOTE, fi.ke_purpose()), list(QUOTE, numeric_date_utilities.get_universal_second(UNPROVIDED))));
            if (ans != $QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return NIL;
    }

    public static final SubLObject ke_create_internal_alt(SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            {
                SubLObject ans = com.cyc.cycjava.cycl.ke.do_edit_op(listS(FI_CREATE, list(QUOTE, name), append(NIL != external_id ? ((SubLObject) (list(list(QUOTE, external_id)))) : NIL, NIL)));
                SubLObject error = NIL;
                if (ans != $QUEUED) {
                    error = fi.fi_get_error_int();
                }
                com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED)), list(QUOTE, fi.ke_purpose()), list(QUOTE, numeric_date_utilities.get_universal_second(UNPROVIDED))));
                if (ans != $QUEUED) {
                    fi.signal_fi_error(error);
                }
                return ans;
            }
        }
        return NIL;
    }

    public static SubLObject ke_create_internal(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject ans = do_edit_op(listS(FI_CREATE, list(QUOTE, name), append(NIL != external_id ? list(list(QUOTE, external_id)) : NIL, NIL)));
            SubLObject error = NIL;
            if (ans != $QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED)), list(QUOTE, fi.ke_purpose()), list(QUOTE, numeric_date_utilities.get_universal_second(UNPROVIDED))));
            if (ans != $QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return NIL;
    }

    /**
     * Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null
     * it is used, otherwise a unique identifier is generated.
     *
     * @return 0 constant ;; new constant if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param NAME
    string
     * 		
     * @param EXTERNAL-ID
    guid-p
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null\r\nit is used, otherwise a unique identifier is generated.\r\n\r\n@return 0 constant ;; new constant if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param NAME\nstring\r\n\t\t\r\n@param EXTERNAL-ID\nguid-p\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done\nCreate new constant now and add operation to transcript. If EXTERNAL-ID is non-null\nit is used, otherwise a unique identifier is generated.")
    public static final SubLObject ke_create_now_alt(SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject _prev_bind_0_1 = fi.$fi_last_constant$.currentBinding(thread);
                                    try {
                                        fi.$fi_last_constant$.bind(NIL, thread);
                                        result = fi.fi_create_int(name, external_id);
                                    } finally {
                                        fi.$fi_last_constant$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != result) {
                    operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_CREATE, list(QUOTE, constants_high.constant_name(result)), constants_high.constant_external_id(result))));
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        {
                                            SubLObject _prev_bind_0_2 = fi.$fi_last_constant$.currentBinding(thread);
                                            try {
                                                fi.$fi_last_constant$.bind(result, thread);
                                                if (NIL != fi.fi_timestamp_constant_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                                    operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second()))));
                                                }
                                            } finally {
                                                fi.$fi_last_constant$.rebind(_prev_bind_0_2, thread);
                                            }
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
                    return result;
                }
                if (NIL != error_message) {
                    return values(NIL, list($FATAL_ERROR, error_message));
                }
                if (NIL != fi.fi_error_signaledP()) {
                    return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
                }
                return values(NIL, $list_alt10);
            }
        }
    }

    /**
     * Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null
     * it is used, otherwise a unique identifier is generated.
     *
     * @return 0 constant ;; new constant if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param NAME
    		string
     * 		
     * @param EXTERNAL-ID
    		guid-p
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null\r\nit is used, otherwise a unique identifier is generated.\r\n\r\n@return 0 constant ;; new constant if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param NAME\n\t\tstring\r\n\t\t\r\n@param EXTERNAL-ID\n\t\tguid-p\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done\nCreate new constant now and add operation to transcript. If EXTERNAL-ID is non-null\nit is used, otherwise a unique identifier is generated.")
    public static SubLObject ke_create_now(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject _prev_bind_0_$1 = fi.$fi_last_constant$.currentBinding(thread);
                    try {
                        fi.$fi_last_constant$.bind(NIL, thread);
                        result = fi.fi_create_int(name, external_id);
                    } finally {
                        fi.$fi_last_constant$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_CREATE, list(QUOTE, constants_high.constant_name(result)), constants_high.constant_external_id(result))));
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = fi.$fi_last_constant$.currentBinding(thread);
                        try {
                            fi.$fi_last_constant$.bind(result, thread);
                            if (NIL != fi.fi_timestamp_constant_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second()))));
                            }
                        } finally {
                            fi.$fi_last_constant$.rebind(_prev_bind_0_$2, thread);
                        }
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    /**
     * Get the named constant if it exists.
     * Otherwise, Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null
     * it is used, otherwise a unique identifier is generated.
     *
     * @return 0 constant ;; relevant constant if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param NAME
    string
     * 		
     * @param EXTERNAL-ID
    guid-p
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Get the named constant if it exists.\r\nOtherwise, Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null\r\nit is used, otherwise a unique identifier is generated.\r\n\r\n@return 0 constant ;; relevant constant if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param NAME\nstring\r\n\t\t\r\n@param EXTERNAL-ID\nguid-p\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done\nGet the named constant if it exists.\nOtherwise, Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null\nit is used, otherwise a unique identifier is generated.")
    public static final SubLObject ke_find_or_create_now_alt(SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        {
            SubLObject constant = fi.fi_find_int(name);
            if (NIL != constant) {
                return values(constant, NIL);
            } else {
                return com.cyc.cycjava.cycl.ke.ke_create_now(name, external_id);
            }
        }
    }

    /**
     * Get the named constant if it exists.
     * Otherwise, Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null
     * it is used, otherwise a unique identifier is generated.
     *
     * @return 0 constant ;; relevant constant if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param NAME
    		string
     * 		
     * @param EXTERNAL-ID
    		guid-p
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Get the named constant if it exists.\r\nOtherwise, Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null\r\nit is used, otherwise a unique identifier is generated.\r\n\r\n@return 0 constant ;; relevant constant if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param NAME\n\t\tstring\r\n\t\t\r\n@param EXTERNAL-ID\n\t\tguid-p\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done\nGet the named constant if it exists.\nOtherwise, Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null\nit is used, otherwise a unique identifier is generated.")
    public static SubLObject ke_find_or_create_now(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        final SubLObject constant = fi.fi_find_int(name);
        if (NIL != constant) {
            return values(constant, NIL);
        }
        return ke_create_now(name, external_id);
    }

    public static final SubLObject ke_recreate_now_alt(SubLObject constant) {
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            {
                SubLObject external_id = constants_high.constant_external_id(constant);
                SubLObject name = constants_high.constant_name(constant);
                SubLObject creator = bookkeeping_store.creator(constant, UNPROVIDED);
                SubLObject creation_time = bookkeeping_store.creation_time(constant, UNPROVIDED);
                SubLObject purpose = bookkeeping_store.creation_purpose(constant, UNPROVIDED);
                SubLObject creation_second = bookkeeping_store.creation_second(constant, UNPROVIDED);
                com.cyc.cycjava.cycl.ke.ke_kill_now(constant);
                com.cyc.cycjava.cycl.ke.ke_create_now(name, external_id);
                if ((NIL != creator) && (NIL != creation_time)) {
                    fi.fi_timestamp_constant(creator, creation_time, purpose, creation_second);
                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject ke_recreate_now(final SubLObject constant) {
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject external_id = constants_high.constant_external_id(constant);
            final SubLObject name = constants_high.constant_name(constant);
            final SubLObject creator = bookkeeping_store.creator(constant, UNPROVIDED);
            final SubLObject creation_time = bookkeeping_store.creation_time(constant, UNPROVIDED);
            final SubLObject purpose = bookkeeping_store.creation_purpose(constant, UNPROVIDED);
            final SubLObject creation_second = bookkeeping_store.creation_second(constant, UNPROVIDED);
            ke_kill_now(constant);
            ke_create_now(name, external_id);
            if ((NIL != creator) && (NIL != creation_time)) {
                fi.fi_timestamp_constant(creator, creation_time, purpose, creation_second);
            }
            return T;
        }
        return NIL;
    }

    public static final SubLObject ke_merge_alt(SubLObject kill_fort, SubLObject keep_fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject merged_name = (NIL != constant_p(kill_fort)) ? ((SubLObject) (constants_high.constant_name(kill_fort))) : NIL != nart_handles.nart_p(kill_fort) ? ((SubLObject) (format_nil.format_nil_s(narts_high.nart_el_formula(kill_fort)))) : NIL;
                SubLObject merged_guid = (NIL != constant_p(kill_fort)) ? ((SubLObject) (Guids.guid_to_string(constants_high.constant_guid(kill_fort)))) : NIL;
                if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
                    if (NIL == constant_completion.constant_mentioned_in_codeP(kill_fort)) {
                        com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_MERGE, list(QUOTE, kill_fort), list(QUOTE, keep_fort)));
                    }
                    if (((NIL != $note_merged_constant_name$.getDynamicValue(thread)) && merged_name.isString()) && merged_guid.isString()) {
                        if ((NIL != constant_p(keep_fort)) && (NIL != merged_name)) {
                            com.cyc.cycjava.cycl.ke.ke_assert(list($$mergedConstantName, keep_fort, merged_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                        }
                        if ((NIL != constant_p(keep_fort)) && (NIL != merged_guid)) {
                            com.cyc.cycjava.cycl.ke.ke_assert(list($$mergedConstantGUID, keep_fort, merged_guid), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                        }
                        return keep_fort;
                    }
                }
            }
            Errors.cerror($$$Skip_this_operation, $str_alt21$Constant__S_cannot_be_merged_beca, kill_fort);
            return NIL;
        }
    }

    public static SubLObject ke_merge(final SubLObject kill_fort, final SubLObject keep_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_completion.constant_mentioned_in_codeP(kill_fort)) {
            Errors.cerror($$$Skip_this_operation, $str17$Constant__S_cannot_be_merged_beca, kill_fort);
            return NIL;
        }
        final SubLObject merged_name = (NIL != constant_p(kill_fort)) ? constants_high.constant_name(kill_fort) : NIL != nart_handles.nart_p(kill_fort) ? format_nil.format_nil_s(narts_high.nart_el_formula(kill_fort)) : NIL;
        final SubLObject merged_guid = (NIL != constant_p(kill_fort)) ? Guids.guid_to_string(constants_high.constant_guid(kill_fort)) : NIL;
        if (NIL != ensure_cyclist_ok()) {
            do_edit_op(list(FI_MERGE, list(QUOTE, kill_fort), list(QUOTE, keep_fort)));
            if (((NIL != $note_merged_constant_name$.getDynamicValue(thread)) && merged_name.isString()) && merged_guid.isString()) {
                if ((NIL != constant_p(keep_fort)) && (NIL != merged_name)) {
                    ke_assert(list($$mergedConstantName, keep_fort, merged_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != constant_p(keep_fort)) && (NIL != merged_guid)) {
                    ke_assert(list($$mergedConstantGUID, keep_fort, merged_guid), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                }
                return keep_fort;
            }
        }
        return NIL;
    }

    /**
     * Merge assertions of KILL-FORT onto KEEP-FORT and kill KILL-FORT.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param KILL-FORT
    fort
     * 		
     * @param KEEP-FORT
    fort
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Merge assertions of KILL-FORT onto KEEP-FORT and kill KILL-FORT.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param KILL-FORT\nfort\r\n\t\t\r\n@param KEEP-FORT\nfort\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject ke_merge_now_alt(SubLObject kill_fort, SubLObject keep_fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != constant_completion.constant_mentioned_in_codeP(kill_fort)) {
                return values(NIL, $list_alt22);
            }
            {
                SubLObject merged_name = (NIL != constant_p(kill_fort)) ? ((SubLObject) (constants_high.constant_name(kill_fort))) : NIL != nart_handles.nart_p(kill_fort) ? ((SubLObject) (format_nil.format_nil_s(narts_high.nart_el_formula(kill_fort)))) : NIL;
                SubLObject merged_guid = (NIL != constant_p(kill_fort)) ? ((SubLObject) (Guids.guid_to_string(constants_high.constant_guid(kill_fort)))) : NIL;
                SubLObject result = NIL;
                SubLObject transcript_op = NIL;
                SubLObject error_message = NIL;
                kill_fort = eval(kill_fort);
                keep_fort = eval(keep_fort);
                transcript_op = canon_tl.tl_encapsulate(list(FI_MERGE, list(QUOTE, kill_fort), list(QUOTE, keep_fort)));
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                result = fi.fi_merge_int(kill_fort, keep_fort);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != result) {
                    operation_queues.add_to_transcript_queue(transcript_op);
                    if (((NIL != $note_merged_constant_name$.getDynamicValue(thread)) && merged_name.isString()) && merged_guid.isString()) {
                        {
                            SubLObject ignore_errors_tag = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            {
                                                SubLObject _prev_bind_0_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                                    mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                                                    {
                                                        SubLObject pred_var = $$mergedConstantName;
                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(keep_fort, ONE_INTEGER, pred_var)) {
                                                            {
                                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(keep_fort, ONE_INTEGER, pred_var);
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
                                                                                        SubLObject done_var_4 = NIL;
                                                                                        SubLObject token_var_5 = NIL;
                                                                                        while (NIL == done_var_4) {
                                                                                            {
                                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                                                SubLObject valid_6 = makeBoolean(token_var_5 != assertion);
                                                                                                if (NIL != valid_6) {
                                                                                                    com.cyc.cycjava.cycl.ke.ke_unassert_assertion_now(assertion);
                                                                                                }
                                                                                                done_var_4 = makeBoolean(NIL == valid_6);
                                                                                            }
                                                                                        } 
                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            if (NIL != final_index_iterator) {
                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                            }
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
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
                                                    {
                                                        SubLObject pred_var = $$mergedConstantGUID;
                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(keep_fort, ONE_INTEGER, pred_var)) {
                                                            {
                                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(keep_fort, ONE_INTEGER, pred_var);
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
                                                                                        SubLObject done_var_8 = NIL;
                                                                                        SubLObject token_var_9 = NIL;
                                                                                        while (NIL == done_var_8) {
                                                                                            {
                                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_9);
                                                                                                SubLObject valid_10 = makeBoolean(token_var_9 != assertion);
                                                                                                if (NIL != valid_10) {
                                                                                                    com.cyc.cycjava.cycl.ke.ke_unassert_assertion_now(assertion);
                                                                                                }
                                                                                                done_var_8 = makeBoolean(NIL == valid_10);
                                                                                            }
                                                                                        } 
                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            if (NIL != final_index_iterator) {
                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                            }
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
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
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_3, thread);
                                                }
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
                    if (NIL != constant_p(keep_fort)) {
                        if ((NIL != merged_name) && (NIL != $note_merged_constant_name$.getDynamicValue(thread))) {
                            com.cyc.cycjava.cycl.ke.ke_assert_now(list($$mergedConstantName, keep_fort, merged_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != merged_guid) {
                            com.cyc.cycjava.cycl.ke.ke_assert_now(list($$mergedConstantGUID, keep_fort, merged_guid), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    return result;
                }
                if (NIL != error_message) {
                    return values(NIL, list($FATAL_ERROR, error_message));
                }
                if (NIL != fi.fi_error_signaledP()) {
                    return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
                }
                return values(NIL, $list_alt10);
            }
        }
    }

    /**
     * Merge assertions of KILL-FORT onto KEEP-FORT and kill KILL-FORT.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param KILL-FORT
    		fort
     * 		
     * @param KEEP-FORT
    		fort
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Merge assertions of KILL-FORT onto KEEP-FORT and kill KILL-FORT.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param KILL-FORT\n\t\tfort\r\n\t\t\r\n@param KEEP-FORT\n\t\tfort\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject ke_merge_now(SubLObject kill_fort, SubLObject keep_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_completion.constant_mentioned_in_codeP(kill_fort)) {
            return values(NIL, $list22);
        }
        final SubLObject merged_name = (NIL != constant_p(kill_fort)) ? constants_high.constant_name(kill_fort) : NIL != nart_handles.nart_p(kill_fort) ? format_nil.format_nil_s(narts_high.nart_el_formula(kill_fort)) : NIL;
        final SubLObject merged_guid = (NIL != constant_p(kill_fort)) ? Guids.guid_to_string(constants_high.constant_guid(kill_fort)) : NIL;
        SubLObject result = NIL;
        SubLObject transcript_op = NIL;
        SubLObject error_message = NIL;
        kill_fort = eval(kill_fort);
        keep_fort = eval(keep_fort);
        transcript_op = canon_tl.tl_encapsulate(list(FI_MERGE, list(QUOTE, kill_fort), list(QUOTE, keep_fort)));
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_merge_int(kill_fort, keep_fort);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(transcript_op);
            if (((NIL != $note_merged_constant_name$.getDynamicValue(thread)) && merged_name.isString()) && merged_guid.isString()) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                                SubLObject pred_var = $$mergedConstantName;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(keep_fort, ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(keep_fort, ONE_INTEGER, pred_var);
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
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                    final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                                    if (NIL != valid_$6) {
                                                        ke_unassert_assertion_now(assertion);
                                                    }
                                                    done_var_$4 = makeBoolean(NIL == valid_$6);
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
                                pred_var = $$mergedConstantGUID;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(keep_fort, ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(keep_fort, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                SubLObject done_var_$5 = NIL;
                                                final SubLObject token_var_$6 = NIL;
                                                while (NIL == done_var_$5) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                                    final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                                                    if (NIL != valid_$7) {
                                                        ke_unassert_assertion_now(assertion);
                                                    }
                                                    done_var_$5 = makeBoolean(NIL == valid_$7);
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
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$3, thread);
                            }
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
            }
            if (NIL != constant_p(keep_fort)) {
                if ((NIL != merged_name) && (NIL != $note_merged_constant_name$.getDynamicValue(thread))) {
                    ke_assert_now(list($$mergedConstantName, keep_fort, merged_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != merged_guid) {
                    ke_assert_now(list($$mergedConstantGUID, keep_fort, merged_guid), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                }
            }
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static final SubLObject ke_kill_alt(SubLObject fort) {
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            if (!((NIL != forts.fort_p(fort)) && (NIL != constant_completion.constant_mentioned_in_codeP(fort)))) {
                return com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_KILL, list(QUOTE, fort)));
            }
            Errors.cerror($$$Skip_this_operation, $str_alt27$Constant__S_cannot_be_killed_beca, fort);
            return NIL;
        }
        return NIL;
    }

    public static SubLObject ke_kill(final SubLObject fort) {
        if (NIL == ensure_cyclist_ok()) {
            return NIL;
        }
        if ((NIL == forts.fort_p(fort)) || (NIL == constant_completion.constant_mentioned_in_codeP(fort))) {
            return do_edit_op(list(FI_KILL, list(QUOTE, fort)));
        }
        Errors.cerror($$$Skip_this_operation, $str27$Constant__S_cannot_be_killed_beca, fort);
        return NIL;
    }

    /**
     * Kill FORT now and add operation to transcript.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param FORT
    fort
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Kill FORT now and add operation to transcript.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param FORT\nfort\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject ke_kill_now_alt(SubLObject fort) {
        {
            SubLObject result = NIL;
            SubLObject transcript_op = NIL;
            SubLObject error_message = NIL;
            fort = eval(fort);
            transcript_op = canon_tl.tl_encapsulate(list(FI_KILL, list(QUOTE, fort)));
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            result = fi.fi_kill_int(fort);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != result) {
                operation_queues.add_to_transcript_queue(transcript_op);
                return result;
            }
            if (NIL != error_message) {
                return values(NIL, list($FATAL_ERROR, error_message));
            }
            if (NIL != fi.fi_error_signaledP()) {
                return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
            }
            return values(NIL, $list_alt10);
        }
    }

    /**
     * Kill FORT now and add operation to transcript.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param FORT
    		fort
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Kill FORT now and add operation to transcript.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param FORT\n\t\tfort\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject ke_kill_now(SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject transcript_op = NIL;
        SubLObject error_message = NIL;
        fort = eval(fort);
        transcript_op = canon_tl.tl_encapsulate(list(FI_KILL, list(QUOTE, fort)));
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_kill_int(fort);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(transcript_op);
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static final SubLObject ke_recreate_alt(SubLObject constant) {
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            {
                SubLObject external_id = constants_high.constant_external_id(constant);
                SubLObject name = constants_high.constant_name(constant);
                SubLObject creator = bookkeeping_store.creator(constant, UNPROVIDED);
                SubLObject creation_time = bookkeeping_store.creation_time(constant, UNPROVIDED);
                SubLObject purpose = bookkeeping_store.creation_purpose(constant, UNPROVIDED);
                SubLObject creation_second = bookkeeping_store.creation_second(constant, UNPROVIDED);
                com.cyc.cycjava.cycl.ke.ke_kill(constant);
                fi.fi_create(name, external_id);
                if ((NIL != creator) && (NIL != creation_time)) {
                    fi.fi_timestamp_constant(creator, creation_time, purpose, creation_second);
                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject ke_recreate(final SubLObject constant) {
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject external_id = constants_high.constant_external_id(constant);
            final SubLObject name = constants_high.constant_name(constant);
            final SubLObject creator = bookkeeping_store.creator(constant, UNPROVIDED);
            final SubLObject creation_time = bookkeeping_store.creation_time(constant, UNPROVIDED);
            final SubLObject purpose = bookkeeping_store.creation_purpose(constant, UNPROVIDED);
            final SubLObject creation_second = bookkeeping_store.creation_second(constant, UNPROVIDED);
            ke_kill(constant);
            fi.fi_create(name, external_id);
            if ((NIL != creator) && (NIL != creation_time)) {
                fi.fi_timestamp_constant(creator, creation_time, purpose, creation_second);
            }
            return T;
        }
        return NIL;
    }

    /**
     * This is mostly for use in patches
     */
    @LispMethod(comment = "This is mostly for use in patches")
    public static final SubLObject rename_code_constant_alt(SubLObject old_name, SubLObject new_name) {
        SubLTrampolineFile.checkType(old_name, STRINGP);
        SubLTrampolineFile.checkType(new_name, STRINGP);
        {
            SubLObject constant = constants_high.find_constant(old_name);
            if (NIL != constant) {
                {
                    SubLObject existing = constants_high.find_constant(new_name);
                    if ((NIL == existing) || (NIL == valid_constantP(existing, UNPROVIDED))) {
                        fi.fi_rename_int(constant, new_name);
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * This is mostly for use in patches
     */
    @LispMethod(comment = "This is mostly for use in patches")
    public static SubLObject rename_code_constant(final SubLObject old_name, final SubLObject new_name) {
        assert NIL != stringp(old_name) : "! stringp(old_name) " + ("Types.stringp(old_name) " + "CommonSymbols.NIL != Types.stringp(old_name) ") + old_name;
        assert NIL != stringp(new_name) : "! stringp(new_name) " + ("Types.stringp(new_name) " + "CommonSymbols.NIL != Types.stringp(new_name) ") + new_name;
        final SubLObject constant = constants_high.find_constant(old_name);
        if (NIL != constant) {
            final SubLObject existing = constants_high.find_constant(new_name);
            if ((NIL == existing) || (NIL == valid_constantP(existing, UNPROVIDED))) {
                fi.fi_rename_int(constant, new_name);
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject ke_rename_alt(SubLObject constant, SubLObject name) {
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            if (NIL == constant_completion.constant_mentioned_in_codeP(constant)) {
                return com.cyc.cycjava.cycl.ke.ke_rename_internal(constant, name);
            }
            Errors.cerror($$$Skip_this_operation, $str_alt33$Constant__S_cannot_be_renamed_bec, constant);
        }
        return NIL;
    }

    public static SubLObject ke_rename(final SubLObject constant, final SubLObject name) {
        if (NIL != ensure_cyclist_ok()) {
            if (NIL == constant_completion.constant_mentioned_in_codeP(constant)) {
                return ke_rename_internal(constant, name);
            }
            Errors.cerror($$$Skip_this_operation, $str33$Constant__S_cannot_be_renamed_bec, constant);
        }
        return NIL;
    }

    /**
     * KE-RENAME for CONSTANT which is mentioned in code.
     */
    @LispMethod(comment = "KE-RENAME for CONSTANT which is mentioned in code.")
    public static final SubLObject ke_rename_code_constant_alt(SubLObject constant, SubLObject name) {
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            if (NIL != constant_completion.constant_mentioned_in_codeP(constant)) {
                return com.cyc.cycjava.cycl.ke.ke_rename_internal(constant, name);
            }
            Errors.cerror($str_alt34$Use_KE_RENAME, $str_alt35$Constant__S_is_not_mentioned_in_c, constant);
            return com.cyc.cycjava.cycl.ke.ke_rename(constant, name);
        }
        return NIL;
    }

    /**
     * KE-RENAME for CONSTANT which is mentioned in code.
     */
    @LispMethod(comment = "KE-RENAME for CONSTANT which is mentioned in code.")
    public static SubLObject ke_rename_code_constant(final SubLObject constant, final SubLObject name) {
        if (NIL == ensure_cyclist_ok()) {
            return NIL;
        }
        if (NIL != constant_completion.constant_mentioned_in_codeP(constant)) {
            return ke_rename_internal(constant, name);
        }
        Errors.cerror($str34$Use_KE_RENAME, $str35$Constant__S_is_not_mentioned_in_c, constant);
        return ke_rename(constant, name);
    }

    public static final SubLObject ke_rename_internal_alt(SubLObject constant, SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_name = constants_high.constant_name(constant);
                SubLObject ans = com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_RENAME, list(QUOTE, constant), list(QUOTE, name)));
                SubLObject error = NIL;
                if (ans != $QUEUED) {
                    error = fi.fi_get_error_int();
                }
                if ((NIL != $note_old_constant_name$.getDynamicValue(thread)) && old_name.isString()) {
                    com.cyc.cycjava.cycl.ke.note_old_constant_name(constant, old_name);
                }
                nl_generation_fort_cache.nl_generation_cache_clear(constant);
                if (ans != $QUEUED) {
                    fi.signal_fi_error(error);
                }
                return ans;
            }
        }
    }

    public static SubLObject ke_rename_internal(final SubLObject constant, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_name = constants_high.constant_name(constant);
        final SubLObject ans = do_edit_op(list(FI_RENAME, list(QUOTE, constant), list(QUOTE, name)));
        SubLObject error = NIL;
        if (ans != $QUEUED) {
            error = fi.fi_get_error_int();
        }
        if ((NIL != $note_old_constant_name$.getDynamicValue(thread)) && old_name.isString()) {
            note_old_constant_name(constant, old_name);
        }
        nl_generation_fort_cache.nl_generation_cache_clear(constant);
        if (ans != $QUEUED) {
            fi.signal_fi_error(error);
        }
        return ans;
    }

    public static final SubLObject note_old_constant_name_alt(SubLObject constant, SubLObject old_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(constant, CONSTANT_P);
            SubLTrampolineFile.checkType(old_name, STRINGP);
            if (NIL != kb_mapping_utilities.some_pred_value_in_mt(constant, $$oldConstantName, $$BookkeepingMt, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                        {
                            SubLObject pred_var = $$oldConstantName;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, ONE_INTEGER, pred_var);
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
                                                            SubLObject done_var_12 = NIL;
                                                            SubLObject token_var_13 = NIL;
                                                            while (NIL == done_var_12) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_13);
                                                                    SubLObject valid_14 = makeBoolean(token_var_13 != assertion);
                                                                    if (NIL != valid_14) {
                                                                        com.cyc.cycjava.cycl.ke.ke_unassert_assertion(assertion);
                                                                    }
                                                                    done_var_12 = makeBoolean(NIL == valid_14);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
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
            com.cyc.cycjava.cycl.ke.ke_assert(list($$oldConstantName, constant, old_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
            return constant;
        }
    }

    public static SubLObject note_old_constant_name(final SubLObject constant, final SubLObject old_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        assert NIL != stringp(old_name) : "! stringp(old_name) " + ("Types.stringp(old_name) " + "CommonSymbols.NIL != Types.stringp(old_name) ") + old_name;
        if (NIL != kb_mapping_utilities.some_pred_value_in_mt(constant, $$oldConstantName, $$BookkeepingMt, UNPROVIDED, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                final SubLObject pred_var = $$oldConstantName;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$12 = NIL;
                                final SubLObject token_var_$13 = NIL;
                                while (NIL == done_var_$12) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                    final SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(assertion));
                                    if (NIL != valid_$14) {
                                        ke_unassert_assertion(assertion);
                                    }
                                    done_var_$12 = makeBoolean(NIL == valid_$14);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
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
        ke_assert(list($$oldConstantName, constant, old_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
        return constant;
    }

    /**
     * Rename CONSTANT to NAME now and add operation to transcript.
     *
     * @return 0 constant ;; new constant name if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param CONSTANT
    constant
     * 		
     * @param NAME
    string
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Rename CONSTANT to NAME now and add operation to transcript.\r\n\r\n@return 0 constant ;; new constant name if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param CONSTANT\nconstant\r\n\t\t\r\n@param NAME\nstring\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject ke_rename_now_alt(SubLObject constant, SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_name = constants_high.constant_name(constant);
                SubLObject result = NIL;
                SubLObject transcript_op = NIL;
                SubLObject error_message = NIL;
                constant = eval(constant);
                transcript_op = canon_tl.tl_encapsulate(list(FI_RENAME, list(QUOTE, constant), list(QUOTE, name)));
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                result = fi.fi_rename_int(constant, name);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != result) {
                    operation_queues.add_to_transcript_queue(transcript_op);
                    if ((NIL != $note_old_constant_name$.getDynamicValue(thread)) && old_name.isString()) {
                        {
                            SubLObject ignore_errors_tag = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            {
                                                SubLObject _prev_bind_0_16 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                                    mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                                                    {
                                                        SubLObject pred_var = $$oldConstantName;
                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, ONE_INTEGER, pred_var)) {
                                                            {
                                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, ONE_INTEGER, pred_var);
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
                                                                                        SubLObject done_var_17 = NIL;
                                                                                        SubLObject token_var_18 = NIL;
                                                                                        while (NIL == done_var_17) {
                                                                                            {
                                                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_18);
                                                                                                SubLObject valid_19 = makeBoolean(token_var_18 != assertion);
                                                                                                if (NIL != valid_19) {
                                                                                                    com.cyc.cycjava.cycl.ke.ke_unassert_assertion_now(assertion);
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
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_16, thread);
                                                }
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
                        com.cyc.cycjava.cycl.ke.ke_assert_now(list($$oldConstantName, constant, old_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                        return result;
                    }
                }
                if (NIL != error_message) {
                    return values($FATAL_ERROR, error_message);
                }
                if (NIL != fi.fi_error_signaledP()) {
                    return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
                }
                return values(NIL, $list_alt10);
            }
        }
    }

    /**
     * Rename CONSTANT to NAME now and add operation to transcript.
     *
     * @return 0 constant ;; new constant name if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param CONSTANT
    		constant
     * 		
     * @param NAME
    		string
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Rename CONSTANT to NAME now and add operation to transcript.\r\n\r\n@return 0 constant ;; new constant name if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param CONSTANT\n\t\tconstant\r\n\t\t\r\n@param NAME\n\t\tstring\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject ke_rename_now(SubLObject constant, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_name = constants_high.constant_name(constant);
        SubLObject result = NIL;
        SubLObject transcript_op = NIL;
        SubLObject error_message = NIL;
        constant = eval(constant);
        transcript_op = canon_tl.tl_encapsulate(list(FI_RENAME, list(QUOTE, constant), list(QUOTE, name)));
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_rename_int(constant, name);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(transcript_op);
            if ((NIL != $note_old_constant_name$.getDynamicValue(thread)) && old_name.isString()) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject _prev_bind_0_$16 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                                final SubLObject pred_var = $$oldConstantName;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                SubLObject done_var_$17 = NIL;
                                                final SubLObject token_var_$18 = NIL;
                                                while (NIL == done_var_$17) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                                    final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion));
                                                    if (NIL != valid_$19) {
                                                        ke_unassert_assertion_now(assertion);
                                                    }
                                                    done_var_$17 = makeBoolean(NIL == valid_$19);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$16, thread);
                            }
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
                ke_assert_now(list($$oldConstantName, constant, old_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
        if (NIL != error_message) {
            return values($FATAL_ERROR, error_message);
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static final SubLObject ke_assert_alt(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL == strength) {
            strength = $DEFAULT;
        }
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            mt = hlmt_czer.canonicalize_hlmt(mt);
            {
                SubLObject ans = com.cyc.cycjava.cycl.ke.do_edit_op(listS(FI_ASSERT, list(QUOTE, formula), list(QUOTE, mt), list(QUOTE, strength), append(NIL != direction ? ((SubLObject) (list(list(QUOTE, direction)))) : NIL, NIL)));
                SubLObject error = NIL;
                if (ans != $QUEUED) {
                    error = fi.fi_get_error_int();
                }
                com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())));
                if (ans != $QUEUED) {
                    fi.signal_fi_error(error);
                }
                return ans;
            }
        }
        return NIL;
    }

    public static SubLObject ke_assert(final SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL == strength) {
            strength = $DEFAULT;
        }
        if (NIL != ensure_cyclist_ok()) {
            mt = hlmt_czer.canonicalize_hlmt(mt);
            final SubLObject ans = do_edit_op(listS(FI_ASSERT, list(QUOTE, formula), list(QUOTE, mt), list(QUOTE, strength), append(NIL != direction ? list(list(QUOTE, direction)) : NIL, NIL)));
            SubLObject error = NIL;
            if (ans != $QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())));
            if (ans != $QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return NIL;
    }

    public static final SubLObject ke_reassert_assertion_now_alt(SubLObject assertion, SubLObject strength, SubLObject direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            SubLTrampolineFile.checkType(strength, EL_STRENGTH_P);
            SubLTrampolineFile.checkType(direction, DIRECTION_P);
            if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
                thread.resetMultipleValues();
                {
                    SubLObject result = com.cyc.cycjava.cycl.ke.ke_reassert_assertion_now_int(assertion, strength, direction);
                    SubLObject error_message = thread.secondMultipleValue();
                    SubLObject sentence = thread.thirdMultipleValue();
                    SubLObject v_hlmt = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != result) {
                        {
                            SubLObject sentence_21 = com.cyc.cycjava.cycl.ke.ke_assertion_find_formula(assertion);
                            SubLObject v_hlmt_22 = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
                            operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_REASSERT, list(QUOTE, sentence_21), list(QUOTE, v_hlmt_22), list(QUOTE, strength), list(QUOTE, direction))));
                        }
                        return result;
                    }
                    if (NIL != error_message) {
                        return values(NIL, list($FATAL_ERROR, error_message));
                    }
                    if (NIL != fi.fi_error_signaledP()) {
                        return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
                    }
                    return values(NIL, $list_alt10);
                }
            }
            return NIL;
        }
    }

    public static SubLObject ke_reassert_assertion_now(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != enumeration_types.el_strength_p(strength) : "! enumeration_types.el_strength_p(strength) " + ("enumeration_types.el_strength_p(strength) " + "CommonSymbols.NIL != enumeration_types.el_strength_p(strength) ") + strength;
        assert NIL != enumeration_types.direction_p(direction) : "! enumeration_types.direction_p(direction) " + ("enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) ") + direction;
        if (NIL == ensure_cyclist_ok()) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject result = ke_reassert_assertion_now_int(assertion, strength, direction);
        final SubLObject error_message = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject v_hlmt = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            final SubLObject sentence_$21 = ke_assertion_find_formula(assertion);
            final SubLObject v_hlmt_$22 = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_REASSERT, list(QUOTE, sentence_$21), list(QUOTE, v_hlmt_$22), list(QUOTE, strength), list(QUOTE, direction))));
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static final SubLObject ke_reassert_assertion_now_int_alt(SubLObject assertion, SubLObject strength, SubLObject direction) {
        {
            SubLObject sentence = com.cyc.cycjava.cycl.ke.ke_assertion_find_formula(assertion);
            SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
            SubLObject result = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            result = fi.fi_reassert_int(sentence, v_hlmt, strength, direction);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            return values(result, error_message, sentence, v_hlmt);
        }
    }

    public static SubLObject ke_reassert_assertion_now_int(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = ke_assertion_find_formula(assertion);
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_reassert_int(sentence, v_hlmt, strength, direction);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return values(result, error_message, sentence, v_hlmt);
    }

    public static final SubLObject ke_reassert_assertion_alt(SubLObject assertion, SubLObject strength, SubLObject direction) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            {
                SubLObject formula = com.cyc.cycjava.cycl.ke.ke_assertion_find_formula(assertion);
                SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
                return com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_REASSERT, list(QUOTE, formula), list(QUOTE, v_hlmt), list(QUOTE, strength), list(QUOTE, direction)));
            }
        }
        return NIL;
    }

    public static SubLObject ke_reassert_assertion(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject formula = ke_assertion_find_formula(assertion);
            final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
            return do_edit_op(list(FI_REASSERT, list(QUOTE, formula), list(QUOTE, v_hlmt), list(QUOTE, strength), list(QUOTE, direction)));
        }
        return NIL;
    }

    public static SubLObject ke_reassert_assertion_int(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject formula = ke_assertion_find_formula(assertion);
            final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
            return do_edit_op(list(FI_REASSERT_INT, list(QUOTE, formula), list(QUOTE, v_hlmt), list(QUOTE, strength), list(QUOTE, direction)));
        }
        return NIL;
    }

    public static final SubLObject ke_repropagate_assertion_now_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != assertions_high.forward_assertionP(assertion)) {
            {
                SubLObject strength = assertions_high.assertion_strength(assertion);
                com.cyc.cycjava.cycl.ke.ke_reassert_assertion_now(assertion, strength, $BACKWARD);
                com.cyc.cycjava.cycl.ke.ke_reassert_assertion_now(assertion, strength, $FORWARD);
            }
            return assertion;
        }
        return NIL;
    }

    public static SubLObject ke_repropagate_assertion_now(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion_now(assertion, strength, $BACKWARD);
            ke_reassert_assertion_now(assertion, strength, $FORWARD);
            return assertion;
        }
        return NIL;
    }

    public static final SubLObject ke_repropagate_assertion_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != assertions_high.forward_assertionP(assertion)) {
            {
                SubLObject strength = assertions_high.assertion_strength(assertion);
                com.cyc.cycjava.cycl.ke.ke_reassert_assertion(assertion, strength, $BACKWARD);
                com.cyc.cycjava.cycl.ke.ke_reassert_assertion(assertion, strength, $FORWARD);
            }
            return assertion;
        }
        return NIL;
    }

    public static SubLObject ke_repropagate_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion(assertion, strength, $BACKWARD);
            ke_reassert_assertion(assertion, strength, $FORWARD);
            return assertion;
        }
        return NIL;
    }

    public static SubLObject ke_repropagate_assertion_now_int(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion_now_int(assertion, strength, $BACKWARD);
            ke_reassert_assertion_now_int(assertion, strength, $FORWARD);
            return assertion;
        }
        return NIL;
    }

    public static SubLObject ke_repropagate_assertion_int(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion_int(assertion, strength, $BACKWARD);
            ke_reassert_assertion_int(assertion, strength, $FORWARD);
            return assertion;
        }
        return NIL;
    }

    /**
     * Assert FORMULA in MT now and add operation to transcript.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param FORMULA
    list
     * 		
     * @param MT
    microtheory
     * 		
     * @param STRENGTH
    keyword
     * 		
     * @param DIRECTION
    keyword
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Assert FORMULA in MT now and add operation to transcript.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param FORMULA\nlist\r\n\t\t\r\n@param MT\nmicrotheory\r\n\t\t\r\n@param STRENGTH\nkeyword\r\n\t\t\r\n@param DIRECTION\nkeyword\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject ke_assert_now_alt(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return com.cyc.cycjava.cycl.ke.ke_assert_now_int(formula, mt, strength, direction, NIL);
    }

    /**
     * Assert FORMULA in MT now and add operation to transcript.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param FORMULA
    		list
     * 		
     * @param MT
    		microtheory
     * 		
     * @param STRENGTH
    		keyword
     * 		
     * @param DIRECTION
    		keyword
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Assert FORMULA in MT now and add operation to transcript.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param FORMULA\n\t\tlist\r\n\t\t\r\n@param MT\n\t\tmicrotheory\r\n\t\t\r\n@param STRENGTH\n\t\tkeyword\r\n\t\t\r\n@param DIRECTION\n\t\tkeyword\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject ke_assert_now(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_assert_now_int(formula, mt, strength, direction, UNPROVIDED);
    }

    /**
     * Assert FORMULA in MT now and add operation to transcript.
     * FORMULA is assumed to be WFF.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param FORMULA
    list
     * 		
     * @param MT
    microtheory
     * 		
     * @param STRENGTH
    keyword
     * 		
     * @param DIRECTION
    keyword
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Assert FORMULA in MT now and add operation to transcript.\r\nFORMULA is assumed to be WFF.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param FORMULA\nlist\r\n\t\t\r\n@param MT\nmicrotheory\r\n\t\t\r\n@param STRENGTH\nkeyword\r\n\t\t\r\n@param DIRECTION\nkeyword\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done\nAssert FORMULA in MT now and add operation to transcript.\nFORMULA is assumed to be WFF.")
    public static final SubLObject ke_assert_wff_now_alt(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return com.cyc.cycjava.cycl.ke.ke_assert_now_int(formula, mt, strength, direction, T);
    }

    /**
     * Assert FORMULA in MT now and add operation to transcript.
     * FORMULA is assumed to be WFF.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param FORMULA
    		list
     * 		
     * @param MT
    		microtheory
     * 		
     * @param STRENGTH
    		keyword
     * 		
     * @param DIRECTION
    		keyword
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Assert FORMULA in MT now and add operation to transcript.\r\nFORMULA is assumed to be WFF.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param FORMULA\n\t\tlist\r\n\t\t\r\n@param MT\n\t\tmicrotheory\r\n\t\t\r\n@param STRENGTH\n\t\tkeyword\r\n\t\t\r\n@param DIRECTION\n\t\tkeyword\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done\nAssert FORMULA in MT now and add operation to transcript.\nFORMULA is assumed to be WFF.")
    public static SubLObject ke_assert_wff_now(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_assert_now_int(formula, mt, strength, direction, TRUE);
    }

    public static SubLObject ke_assert_now_and_propagate_later(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ensure_cyclist_ok()) {
            SubLObject result = NIL;
            SubLObject error = NIL;
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
                thread.resetMultipleValues();
                final SubLObject result_$23 = ke_assert_now(formula, mt, strength, direction);
                final SubLObject error_$24 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$23;
                error = error_$24;
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
            }
            ke_repropagate_assertion_int(czer_meta.find_assertion_cycl(formula, mt));
            return values(result, error);
        }
        return NIL;
    }

    public static final SubLObject ke_assert_now_int_alt(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject wffP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject error_message = NIL;
                SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
                SubLObject assertions = NIL;
                if (NIL == $inference_debugP$.getDynamicValue(thread)) {
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject _prev_bind_0_23 = fi.$fi_last_assertions_asserted$.currentBinding(thread);
                                        try {
                                            fi.$fi_last_assertions_asserted$.bind(NIL, thread);
                                            {
                                                SubLObject v_properties = list($STRENGTH, strength, $DIRECTION, direction);
                                                if (NIL != wffP) {
                                                    result = cyc_kernel.cyc_assert_wff(formula, v_hlmt, v_properties);
                                                } else {
                                                    result = cyc_kernel.cyc_assert(formula, v_hlmt, v_properties);
                                                }
                                                assertions = fi.$fi_last_assertions_asserted$.getDynamicValue(thread);
                                            }
                                        } finally {
                                            fi.$fi_last_assertions_asserted$.rebind(_prev_bind_0_23, thread);
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = fi.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            fi.$fi_last_assertions_asserted$.bind(NIL, thread);
                            {
                                SubLObject v_properties = list($STRENGTH, strength, $DIRECTION, direction);
                                if (NIL != wffP) {
                                    result = cyc_kernel.cyc_assert_wff(formula, v_hlmt, v_properties);
                                } else {
                                    result = cyc_kernel.cyc_assert(formula, v_hlmt, v_properties);
                                }
                                assertions = fi.$fi_last_assertions_asserted$.getDynamicValue(thread);
                            }
                        } finally {
                            fi.$fi_last_assertions_asserted$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != result) {
                    operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_ASSERT, list(QUOTE, formula), list(QUOTE, v_hlmt), list(QUOTE, strength), list(QUOTE, direction))));
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        {
                                            SubLObject _prev_bind_0_24 = fi.$fi_last_assertions_asserted$.currentBinding(thread);
                                            try {
                                                fi.$fi_last_assertions_asserted$.bind(assertions, thread);
                                                if (NIL != fi.fi_timestamp_assertion_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                                    operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second()))));
                                                }
                                            } finally {
                                                fi.$fi_last_assertions_asserted$.rebind(_prev_bind_0_24, thread);
                                            }
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
                    return values(result, NIL);
                }
                if (NIL != error_message) {
                    return values(NIL, list($FATAL_ERROR, error_message));
                }
                if (NIL != fi.fi_error_signaledP()) {
                    return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
                }
                return values(NIL, $list_alt10);
            }
        }
    }

    public static SubLObject ke_assert_now_int(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject wff_test) {
        if (wff_test == UNPROVIDED) {
            wff_test = $ke_assert_now_assume_wff_test$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
        SubLObject assertions = NIL;
        if (NIL == $inference_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$25 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind(NIL, thread);
                            final SubLObject environment = forward.get_forward_inference_environment();
                            assert NIL != queues.queue_p(environment) : "! queues.queue_p(environment) " + ("queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) ") + environment;
                            final SubLObject _prev_bind_0_$26 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                final SubLObject v_properties = list($STRENGTH, strength, $DIRECTION, direction);
                                if (NIL != funcall(wff_test, formula, mt, strength, direction)) {
                                    result = cyc_kernel.cyc_assert_wff(formula, v_hlmt, v_properties);
                                } else {
                                    result = cyc_kernel.cyc_assert(formula, v_hlmt, v_properties);
                                }
                            } finally {
                                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$26, thread);
                            }
                            assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
                        } finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$25, thread);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            final SubLObject _prev_bind_0 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
            try {
                czer_vars.$fi_last_assertions_asserted$.bind(NIL, thread);
                final SubLObject environment2 = forward.get_forward_inference_environment();
                assert NIL != queues.queue_p(environment2) : "! queues.queue_p(environment2) " + ("queues.queue_p(environment2) " + "CommonSymbols.NIL != queues.queue_p(environment2) ") + environment2;
                final SubLObject _prev_bind_0_$27 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment2, thread);
                    final SubLObject v_properties2 = list($STRENGTH, strength, $DIRECTION, direction);
                    if (NIL != funcall(wff_test, formula, mt, strength, direction)) {
                        result = cyc_kernel.cyc_assert_wff(formula, v_hlmt, v_properties2);
                    } else {
                        result = cyc_kernel.cyc_assert(formula, v_hlmt, v_properties2);
                    }
                } finally {
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$27, thread);
                }
                assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
            } finally {
                czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue(FI_ASSERT, formula, v_hlmt, strength, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$28 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind(assertions, thread);
                            if (NIL != fi.fi_timestamp_assertion_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue(FI_TIMESTAMP_ASSERTION, operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                            }
                        } finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$28, thread);
                        }
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            return values(result, NIL);
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static final SubLObject ke_assert_with_implicature_alt(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return com.cyc.cycjava.cycl.ke.ke_assert_with_implicature_int(formula, mt, strength, direction, NIL);
    }

    public static SubLObject ke_assert_with_implicature(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_assert_with_implicature_int(formula, mt, strength, direction, NIL);
    }

    public static final SubLObject ke_assert_now_with_implicature_alt(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return com.cyc.cycjava.cycl.ke.ke_assert_with_implicature_int(formula, mt, strength, direction, T);
    }

    public static SubLObject ke_assert_now_with_implicature(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_assert_with_implicature_int(formula, mt, strength, direction, T);
    }

    public static final SubLObject ke_assert_with_implicature_int_alt(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject nowP) {
        {
            SubLObject result = NIL;
            if (NIL != wff.el_wffP(formula, mt, UNPROVIDED)) {
                result = com.cyc.cycjava.cycl.ke.ke_assert_with_implicature_int_assert(formula, mt, strength, direction, nowP);
            } else {
                {
                    SubLObject repairs = wff_suggest.non_wffness_repairs(formula, mt);
                    if (NIL != repairs) {
                        {
                            SubLObject cdolist_list_var = repairs;
                            SubLObject repair = NIL;
                            for (repair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , repair = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.ke.ke_assert_with_implicature_int_assert(repair, mt, strength, direction, nowP);
                            }
                        }
                        result = com.cyc.cycjava.cycl.ke.ke_assert_with_implicature_int_assert(formula, mt, strength, direction, nowP);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject ke_assert_with_implicature_int(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject nowP) {
        SubLObject result = NIL;
        if (NIL != wff.el_wffP(formula, mt, UNPROVIDED)) {
            result = ke_assert_with_implicature_int_assert(formula, mt, strength, direction, nowP);
        } else {
            final SubLObject repairs = wff_suggest.non_wffness_repairs(formula, mt);
            if (NIL != repairs) {
                SubLObject cdolist_list_var = repairs;
                SubLObject repair = NIL;
                repair = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ke_assert_with_implicature_int_assert(repair, mt, strength, direction, nowP);
                    cdolist_list_var = cdolist_list_var.rest();
                    repair = cdolist_list_var.first();
                } 
                result = ke_assert_with_implicature_int_assert(formula, mt, strength, direction, nowP);
            }
        }
        return result;
    }

    public static final SubLObject ke_assert_with_implicature_int_assert_alt(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject nowP) {
        return NIL != nowP ? ((SubLObject) (com.cyc.cycjava.cycl.ke.ke_assert_now(formula, mt, strength, direction))) : com.cyc.cycjava.cycl.ke.ke_assert(formula, mt, strength, direction);
    }

    public static SubLObject ke_assert_with_implicature_int_assert(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject nowP) {
        return NIL != nowP ? ke_assert_now(formula, mt, strength, direction) : ke_assert(formula, mt, strength, direction);
    }

    public static final SubLObject ke_unassert_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
                mt = hlmt_czer.canonicalize_hlmt(mt);
                if ((NIL == $check_if_already_ke_unassertedP$.getDynamicValue(thread)) || (NIL != fi.sentence_assertions(sentence, mt))) {
                    return com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_UNASSERT, list(QUOTE, sentence), list(QUOTE, mt)));
                }
                Errors.error($str_alt58$Sentence__S_in_mt__S__is_not_in_t, sentence, mt);
                return NIL;
            }
            return NIL;
        }
    }

    public static SubLObject ke_unassert(final SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == ensure_cyclist_ok()) {
            return NIL;
        }
        mt = hlmt_czer.canonicalize_hlmt(mt);
        if ((NIL == $check_if_already_ke_unassertedP$.getDynamicValue(thread)) || (NIL != fi.sentence_assertions(sentence, mt))) {
            return do_edit_op(list(FI_UNASSERT, list(QUOTE, sentence), list(QUOTE, mt)));
        }
        Errors.error($str64$Sentence__S_in_mt__S__is_not_in_t, sentence, mt);
        return NIL;
    }

    public static final SubLObject ke_unassert_assertion_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return com.cyc.cycjava.cycl.ke.ke_unassert(com.cyc.cycjava.cycl.ke.ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    public static SubLObject ke_unassert_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return ke_unassert(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    /**
     * Unassert FORMULA in MT now and add operation to transcript.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param FORMULA
    list
     * 		
     * @param MT
    microtheory
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Unassert FORMULA in MT now and add operation to transcript.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param FORMULA\nlist\r\n\t\t\r\n@param MT\nmicrotheory\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject ke_unassert_now_alt(SubLObject formula, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject error_message = NIL;
            SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
            SubLObject fi_formula = canon_tl.tl_encapsulate(list(FI_UNASSERT, list(QUOTE, formula), list(QUOTE, v_hlmt)));
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            result = fi.fi_unassert_int(formula, v_hlmt);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != result) {
                operation_queues.add_to_transcript_queue(fi_formula);
                return result;
            }
            if (NIL != error_message) {
                return values(NIL, list($FATAL_ERROR, error_message));
            }
            if (NIL != fi.fi_error_signaledP()) {
                return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
            }
            return values(NIL, $list_alt10);
        }
    }

    /**
     * Unassert FORMULA in MT now and add operation to transcript.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param FORMULA
    		list
     * 		
     * @param MT
    		microtheory
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Unassert FORMULA in MT now and add operation to transcript.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param FORMULA\n\t\tlist\r\n\t\t\r\n@param MT\n\t\tmicrotheory\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject ke_unassert_now(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
        final SubLObject fi_formula = canon_tl.tl_encapsulate(list(FI_UNASSERT, list(QUOTE, formula), list(QUOTE, v_hlmt)));
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_unassert_int(formula, v_hlmt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(fi_formula);
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    /**
     * Unassert ASSERTION now and add operation to transcript.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param ASSERTION
    assertion
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Unassert ASSERTION now and add operation to transcript.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param ASSERTION\nassertion\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static final SubLObject ke_unassert_assertion_now_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != valid_assertionP(assertion, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.ke.ke_unassert_now(com.cyc.cycjava.cycl.ke.ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
        }
        return NIL;
    }

    /**
     * Unassert ASSERTION now and add operation to transcript.
     *
     * @return 0 boolean ;; t if success, o/w nil
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
     * @param ASSERTION
    		assertion
     * 		
     * @unknown Assumes cyclist is ok.
     * @unknown The salient property of this function is that it never throws an error.
     * @unknown jantos
     * @unknown done
     */
    @LispMethod(comment = "Unassert ASSERTION now and add operation to transcript.\r\n\r\n@return 0 boolean ;; t if success, o/w nil\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\r\n@param ASSERTION\n\t\tassertion\r\n\t\t\r\n@unknown Assumes cyclist is ok.\r\n@unknown The salient property of this function is that it never throws an error.\r\n@unknown jantos\r\n@unknown done")
    public static SubLObject ke_unassert_assertion_now(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            return ke_unassert_now(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
        }
        return NIL;
    }

    public static final SubLObject ke_edit_alt(SubLObject old_formula, SubLObject new_formula, SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            SubLObject old_hlmt = hlmt_czer.canonicalize_hlmt(old_mt);
            SubLObject new_hlmt = hlmt_czer.canonicalize_hlmt(new_mt);
            if (NIL == $ke_edit_use_fi_edit$.getGlobalValue()) {
                com.cyc.cycjava.cycl.ke.ke_unassert(old_formula, old_hlmt);
                return com.cyc.cycjava.cycl.ke.ke_assert(new_formula, new_hlmt, strength, direction);
            }
            if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
                {
                    SubLObject ans = com.cyc.cycjava.cycl.ke.do_edit_op(listS(FI_EDIT, new SubLObject[]{ list(QUOTE, old_formula), list(QUOTE, new_formula), list(QUOTE, old_hlmt), list(QUOTE, new_hlmt), list(QUOTE, strength), append(NIL != direction ? ((SubLObject) (list(list(QUOTE, direction)))) : NIL, NIL) }));
                    SubLObject error = NIL;
                    if (ans != $QUEUED) {
                        error = fi.fi_get_error_int();
                    }
                    com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())));
                    if (ans != $QUEUED) {
                        fi.signal_fi_error(error);
                    }
                    return ans;
                }
            }
        }
        return NIL;
    }

    public static SubLObject ke_edit(final SubLObject old_formula, final SubLObject new_formula, final SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLObject old_hlmt = hlmt_czer.canonicalize_hlmt(old_mt);
        final SubLObject new_hlmt = hlmt_czer.canonicalize_hlmt(new_mt);
        if (NIL == $ke_edit_use_fi_edit$.getGlobalValue()) {
            ke_unassert(old_formula, old_hlmt);
            return ke_assert(new_formula, new_hlmt, strength, direction);
        }
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject ans = do_edit_op(listS(FI_EDIT, new SubLObject[]{ list(QUOTE, old_formula), list(QUOTE, new_formula), list(QUOTE, old_hlmt), list(QUOTE, new_hlmt), list(QUOTE, strength), append(NIL != direction ? list(list(QUOTE, direction)) : NIL, NIL) }));
            SubLObject error = NIL;
            if (ans != $QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())));
            if (ans != $QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return NIL;
    }

    public static final SubLObject ke_edit_now_alt(SubLObject old_formula, SubLObject new_formula, SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != $ke_edit_use_fi_edit$.getGlobalValue()) {
                    Errors.error($str_alt64$KE_EDIT_NOW_does_not_yet_use_FI_E);
                }
            }
            {
                SubLObject old_hlmt = hlmt_czer.canonicalize_hlmt(old_mt);
                SubLObject new_hlmt = hlmt_czer.canonicalize_hlmt(new_mt);
                com.cyc.cycjava.cycl.ke.ke_unassert_now(old_formula, old_hlmt);
                return com.cyc.cycjava.cycl.ke.ke_assert_now(new_formula, new_hlmt, strength, direction);
            }
        }
    }

    public static SubLObject ke_edit_now(final SubLObject old_formula, final SubLObject new_formula, final SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_hlmt = hlmt_czer.canonicalize_hlmt(old_mt);
        final SubLObject new_hlmt = hlmt_czer.canonicalize_hlmt(new_mt);
        SubLObject assertions = NIL;
        SubLObject error_message = NIL;
        SubLObject result = NIL;
        if (NIL == $ke_edit_use_fi_edit$.getGlobalValue()) {
            ke_unassert_now(old_formula, old_hlmt);
            return ke_assert_now(new_formula, new_hlmt, strength, direction);
        }
        if (NIL == $inference_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$29 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind(NIL, thread);
                            final SubLObject environment = forward.get_forward_inference_environment();
                            assert NIL != queues.queue_p(environment) : "! queues.queue_p(environment) " + ("queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) ") + environment;
                            final SubLObject _prev_bind_0_$30 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                result = fi.fi_edit_int(old_formula, new_formula, old_hlmt, new_hlmt, strength, direction);
                            } finally {
                                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$30, thread);
                            }
                            assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
                        } finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$29, thread);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            final SubLObject _prev_bind_0 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
            try {
                czer_vars.$fi_last_assertions_asserted$.bind(NIL, thread);
                final SubLObject environment2 = forward.get_forward_inference_environment();
                assert NIL != queues.queue_p(environment2) : "! queues.queue_p(environment2) " + ("queues.queue_p(environment2) " + "CommonSymbols.NIL != queues.queue_p(environment2) ") + environment2;
                final SubLObject _prev_bind_0_$31 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment2, thread);
                    result = fi.fi_edit_int(old_formula, new_formula, old_hlmt, new_hlmt, strength, direction);
                } finally {
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$31, thread);
                }
                assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
            } finally {
                czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue(FI_EDIT, old_formula, new_formula, old_mt, new_mt, strength, direction, UNPROVIDED, UNPROVIDED)));
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$32 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind(assertions, thread);
                            if (NIL != fi.fi_timestamp_assertion_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue(FI_TIMESTAMP_ASSERTION, operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                            }
                        } finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$32, thread);
                        }
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            return values(result, NIL);
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static final SubLObject ke_edit_assertion_alt(SubLObject assertion, SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            {
                SubLObject old_formula = com.cyc.cycjava.cycl.ke.ke_assertion_find_formula(assertion);
                SubLObject old_mt = assertions_high.assertion_mt(assertion);
                SubLObject old_strength = assertions_high.assertion_strength(assertion);
                SubLObject old_direction = assertions_high.assertion_direction(assertion);
                if (NIL == new_mt) {
                    new_mt = old_mt;
                }
                if (NIL == strength) {
                    strength = old_strength;
                }
                if (NIL == direction) {
                    direction = old_direction;
                }
                return com.cyc.cycjava.cycl.ke.ke_edit(old_formula, new_formula, old_mt, new_mt, strength, direction);
            }
        }
        return NIL;
    }

    public static SubLObject ke_edit_assertion(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_formula = ke_assertion_find_formula(assertion);
            final SubLObject old_mt = assertions_high.assertion_mt(assertion);
            final SubLObject old_strength = assertions_high.assertion_strength(assertion);
            final SubLObject old_direction = assertions_high.assertion_direction(assertion);
            if (NIL == new_mt) {
                new_mt = old_mt;
            }
            if (NIL == strength) {
                strength = old_strength;
            }
            if (NIL == direction) {
                direction = old_direction;
            }
            return ke_edit(old_formula, new_formula, old_mt, new_mt, strength, direction);
        }
        return NIL;
    }

    public static final SubLObject ke_edit_assertion_preserving_meta_assertions_alt(SubLObject assertion, SubLObject meta_assertions_to_preserve, SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return com.cyc.cycjava.cycl.ke.ke_edit_assertion_preserving_meta_assertions_int(assertion, meta_assertions_to_preserve, new_formula, new_mt, strength, direction, NIL);
    }

    public static SubLObject ke_edit_assertion_preserving_meta_assertions(final SubLObject assertion, final SubLObject meta_assertions_to_preserve, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_edit_assertion_preserving_meta_assertions_int(assertion, meta_assertions_to_preserve, new_formula, new_mt, strength, direction, NIL);
    }

    public static final SubLObject ke_edit_assertion_now_preserving_meta_assertions_alt(SubLObject assertion, SubLObject meta_assertions_to_preserve, SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return com.cyc.cycjava.cycl.ke.ke_edit_assertion_preserving_meta_assertions_int(assertion, meta_assertions_to_preserve, new_formula, new_mt, strength, direction, T);
    }

    public static SubLObject ke_edit_assertion_now_preserving_meta_assertions(final SubLObject assertion, final SubLObject meta_assertions_to_preserve, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_edit_assertion_preserving_meta_assertions_int(assertion, meta_assertions_to_preserve, new_formula, new_mt, strength, direction, T);
    }

    public static final SubLObject ke_edit_assertion_preserving_meta_assertions_int_alt(SubLObject assertion, SubLObject meta_assertions_to_preserve, SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction, SubLObject nowP) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            if (meta_assertions_to_preserve == $ALL) {
                meta_assertions_to_preserve = assertion_utilities.all_meta_assertions(assertion);
            }
            {
                SubLObject old_formula = com.cyc.cycjava.cycl.ke.ke_assertion_find_formula(assertion);
                SubLObject old_mt = assertions_high.assertion_mt(assertion);
                SubLObject old_strength = assertions_high.assertion_strength(assertion);
                SubLObject old_direction = assertions_high.assertion_direction(assertion);
                if (NIL == new_mt) {
                    new_mt = old_mt;
                }
                if (NIL == strength) {
                    strength = old_strength;
                }
                if (NIL == direction) {
                    direction = old_direction;
                }
                {
                    SubLObject new_meta_assertion_assertibles = com.cyc.cycjava.cycl.ke.ke_edit_compute_new_meta_assertion_assertibles(assertion, meta_assertions_to_preserve, new_formula, new_mt);
                    SubLObject v_answer = (NIL != nowP) ? ((SubLObject) (com.cyc.cycjava.cycl.ke.ke_edit_now(old_formula, new_formula, old_mt, new_mt, strength, direction))) : com.cyc.cycjava.cycl.ke.ke_edit(old_formula, new_formula, old_mt, new_mt, strength, direction);
                    SubLObject cdolist_list_var = new_meta_assertion_assertibles;
                    SubLObject new_meta_assertion_assertible = NIL;
                    for (new_meta_assertion_assertible = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_meta_assertion_assertible = cdolist_list_var.first()) {
                        {
                            SubLObject datum = new_meta_assertion_assertible;
                            SubLObject current = datum;
                            SubLObject new_meta_assertion_el_formula = NIL;
                            SubLObject new_meta_assertion_mt = NIL;
                            SubLObject new_meta_assertion_strength = NIL;
                            SubLObject new_meta_assertion_direction = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt66);
                            new_meta_assertion_el_formula = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt66);
                            new_meta_assertion_mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt66);
                            new_meta_assertion_strength = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt66);
                            new_meta_assertion_direction = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != nowP) {
                                    com.cyc.cycjava.cycl.ke.ke_assert_now(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction);
                                } else {
                                    com.cyc.cycjava.cycl.ke.ke_assert(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt66);
                            }
                        }
                    }
                    return v_answer;
                }
            }
        }
        return NIL;
    }

    public static SubLObject ke_edit_assertion_preserving_meta_assertions_int(final SubLObject assertion, SubLObject meta_assertions_to_preserve, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction, final SubLObject nowP) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            if (meta_assertions_to_preserve == $ALL) {
                meta_assertions_to_preserve = assertion_utilities.all_meta_assertions(assertion);
            }
            final SubLObject old_formula = ke_assertion_find_formula(assertion);
            final SubLObject old_mt = assertions_high.assertion_mt(assertion);
            final SubLObject old_strength = assertions_high.assertion_strength(assertion);
            final SubLObject old_direction = assertions_high.assertion_direction(assertion);
            if (NIL == new_mt) {
                new_mt = old_mt;
            }
            if (NIL == strength) {
                strength = old_strength;
            }
            if (NIL == direction) {
                direction = old_direction;
            }
            final SubLObject new_meta_assertion_assertibles = ke_edit_compute_new_meta_assertion_assertibles(assertion, meta_assertions_to_preserve, new_formula, new_mt);
            final SubLObject v_answer = (NIL != nowP) ? ke_edit_now(old_formula, new_formula, old_mt, new_mt, strength, direction) : ke_edit(old_formula, new_formula, old_mt, new_mt, strength, direction);
            SubLObject cdolist_list_var = new_meta_assertion_assertibles;
            SubLObject new_meta_assertion_assertible = NIL;
            new_meta_assertion_assertible = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = new_meta_assertion_assertible;
                SubLObject new_meta_assertion_el_formula = NIL;
                SubLObject new_meta_assertion_mt = NIL;
                SubLObject new_meta_assertion_strength = NIL;
                SubLObject new_meta_assertion_direction = NIL;
                destructuring_bind_must_consp(current, datum, $list77);
                new_meta_assertion_el_formula = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list77);
                new_meta_assertion_mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list77);
                new_meta_assertion_strength = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list77);
                new_meta_assertion_direction = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != nowP) {
                        ke_assert_now(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction);
                    } else {
                        ke_assert(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list77);
                }
                cdolist_list_var = cdolist_list_var.rest();
                new_meta_assertion_assertible = cdolist_list_var.first();
            } 
            return v_answer;
        }
        return NIL;
    }

    public static final SubLObject ke_edit_assertion_preserving_all_meta_assertions_alt(SubLObject assertion, SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return com.cyc.cycjava.cycl.ke.ke_edit_assertion_preserving_meta_assertions(assertion, $ALL, new_formula, new_mt, strength, direction);
    }

    public static SubLObject ke_edit_assertion_preserving_all_meta_assertions(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_edit_assertion_preserving_meta_assertions(assertion, $ALL, new_formula, new_mt, strength, direction);
    }

    public static final SubLObject ke_edit_assertion_now_preserving_all_meta_assertions_alt(SubLObject assertion, SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return com.cyc.cycjava.cycl.ke.ke_edit_assertion_now_preserving_meta_assertions(assertion, $ALL, new_formula, new_mt, strength, direction);
    }

    public static SubLObject ke_edit_assertion_now_preserving_all_meta_assertions(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_edit_assertion_now_preserving_meta_assertions(assertion, $ALL, new_formula, new_mt, strength, direction);
    }

    /**
     * Reassert ASSERTION by unasserting and reasserting it.
     * All meta-assertions are reasserted as well.
     */
    @LispMethod(comment = "Reassert ASSERTION by unasserting and reasserting it.\r\nAll meta-assertions are reasserted as well.\nReassert ASSERTION by unasserting and reasserting it.\nAll meta-assertions are reasserted as well.")
    public static final SubLObject ke_null_edit_assertion_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            {
                SubLObject meta_assertions_to_preserve = assertion_utilities.all_meta_assertions(assertion);
                SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
                return com.cyc.cycjava.cycl.ke.ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, assertion_el_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Reassert ASSERTION by unasserting and reasserting it.
     * All meta-assertions are reasserted as well.
     */
    @LispMethod(comment = "Reassert ASSERTION by unasserting and reasserting it.\r\nAll meta-assertions are reasserted as well.\nReassert ASSERTION by unasserting and reasserting it.\nAll meta-assertions are reasserted as well.")
    public static SubLObject ke_null_edit_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject meta_assertions_to_preserve = assertion_utilities.all_meta_assertions(assertion);
            final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
            return ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, assertion_el_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ke_edit_compute_new_meta_assertion_assertibles_alt(SubLObject assertion, SubLObject meta_assertions_to_preserve, SubLObject new_formula, SubLObject new_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_meta_assertion_assertibles = NIL;
                {
                    SubLObject _prev_bind_0 = uncanonicalizer.$cache_el_formulaP$.currentBinding(thread);
                    try {
                        uncanonicalizer.$cache_el_formulaP$.bind(T, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
                            SubLObject assertion_el_mt = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cdolist_list_var = meta_assertions_to_preserve;
                                SubLObject old_meta_assertion_info = NIL;
                                for (old_meta_assertion_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , old_meta_assertion_info = cdolist_list_var.first()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject old_meta_assertion = com.cyc.cycjava.cycl.ke.extract_old_meta_assertion_info(old_meta_assertion_info);
                                        SubLObject new_meta_assertion_mt = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject old_meta_assertion_el_formula = uncanonicalizer.assertion_el_formula(old_meta_assertion);
                                            SubLObject old_meta_assertion_el_mt = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject new_el_ist_formula = make_binary_formula($$ist, new_mt, new_formula);
                                                SubLObject new_meta_assertion_el_formula = cycl_utilities.expression_subst(new_el_ist_formula, assertion_el_formula, old_meta_assertion_el_formula, symbol_function(EQUAL), UNPROVIDED);
                                                SubLObject new_meta_assertion_strength = assertions_high.assertion_strength(old_meta_assertion);
                                                SubLObject new_meta_assertion_direction = assertions_high.assertion_direction(old_meta_assertion);
                                                new_meta_assertion_assertibles = cons(list(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction), new_meta_assertion_assertibles);
                                            }
                                        }
                                    }
                                }
                            }
                            new_meta_assertion_assertibles = nreverse(new_meta_assertion_assertibles);
                        }
                    } finally {
                        uncanonicalizer.$cache_el_formulaP$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_meta_assertion_assertibles;
            }
        }
    }

    public static SubLObject ke_edit_compute_new_meta_assertion_assertibles(final SubLObject assertion, final SubLObject meta_assertions_to_preserve, final SubLObject new_formula, final SubLObject new_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_meta_assertion_assertibles = NIL;
        final SubLObject _prev_bind_0 = uncanonicalizer.$cache_el_formulaP$.currentBinding(thread);
        try {
            uncanonicalizer.$cache_el_formulaP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
            final SubLObject assertion_el_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = meta_assertions_to_preserve;
            SubLObject old_meta_assertion_info = NIL;
            old_meta_assertion_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject old_meta_assertion = extract_old_meta_assertion_info(old_meta_assertion_info);
                final SubLObject new_meta_assertion_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject old_meta_assertion_el_formula = uncanonicalizer.assertion_el_formula(old_meta_assertion);
                final SubLObject old_meta_assertion_el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject new_el_ist_formula = make_binary_formula($$ist, new_mt, new_formula);
                final SubLObject new_meta_assertion_el_formula = cycl_utilities.expression_subst(new_el_ist_formula, assertion_el_formula, old_meta_assertion_el_formula, symbol_function(EQUAL), UNPROVIDED);
                final SubLObject new_meta_assertion_strength = assertions_high.assertion_strength(old_meta_assertion);
                final SubLObject new_meta_assertion_direction = assertions_high.assertion_direction(old_meta_assertion);
                new_meta_assertion_assertibles = cons(list(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction), new_meta_assertion_assertibles);
                cdolist_list_var = cdolist_list_var.rest();
                old_meta_assertion_info = cdolist_list_var.first();
            } 
            new_meta_assertion_assertibles = nreverse(new_meta_assertion_assertibles);
        } finally {
            uncanonicalizer.$cache_el_formulaP$.rebind(_prev_bind_0, thread);
        }
        return new_meta_assertion_assertibles;
    }

    public static final SubLObject extract_old_meta_assertion_info_alt(SubLObject old_meta_assertion_info) {
        if (NIL != assertion_p(old_meta_assertion_info)) {
            return values(old_meta_assertion_info, assertions_high.assertion_mt(old_meta_assertion_info));
        } else {
            {
                SubLObject datum = old_meta_assertion_info;
                SubLObject current = datum;
                SubLObject old_meta_assertion = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt69);
                old_meta_assertion = current.first();
                current = current.rest();
                {
                    SubLObject new_meta_assertion_mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt69);
                    current = current.rest();
                    if (NIL == current) {
                        return values(old_meta_assertion, NIL != new_meta_assertion_mt ? ((SubLObject) (new_meta_assertion_mt)) : assertions_high.assertion_mt(old_meta_assertion));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt69);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject extract_old_meta_assertion_info(final SubLObject old_meta_assertion_info) {
        if (NIL != assertion_handles.assertion_p(old_meta_assertion_info)) {
            return values(old_meta_assertion_info, assertions_high.assertion_mt(old_meta_assertion_info));
        }
        SubLObject old_meta_assertion = NIL;
        destructuring_bind_must_consp(old_meta_assertion_info, old_meta_assertion_info, $list80);
        old_meta_assertion = old_meta_assertion_info.first();
        SubLObject current = old_meta_assertion_info.rest();
        final SubLObject new_meta_assertion_mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, old_meta_assertion_info, $list80);
        current = current.rest();
        if (NIL == current) {
            return values(old_meta_assertion, NIL != new_meta_assertion_mt ? new_meta_assertion_mt : assertions_high.assertion_mt(old_meta_assertion));
        }
        cdestructuring_bind_error(old_meta_assertion_info, $list80);
        return NIL;
    }

    public static SubLObject ke_add_assertion_original_text(final SubLObject sentence, final SubLObject mt, SubLObject sentence_original_text, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != $ke_add_assertion_original_textP$.getDynamicValue(thread)) && (NIL != el_conditional_sentence_p(sentence))) && sentence_original_text.isString()) {
            sentence_original_text = cconcatenate($str81$_pre_, new SubLObject[]{ sentence_original_text, $str82$__code_ });
            final SubLObject assertion_ist_formula = (NIL != mt) ? make_ist_sentence(mt, sentence) : sentence;
            final SubLObject assertion_original_text_sentence = make_binary_formula($$assertionOriginalText, assertion_ist_formula, sentence_original_text);
            return NIL != nowP ? ke_assert_now(assertion_original_text_sentence, $$BookkeepingMt, UNPROVIDED, UNPROVIDED) : ke_assert(assertion_original_text_sentence, $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Edit OLD-ASSERTION to have NEW-SENTENCE, which must be the same as the sentence of OLD-ASSERTION except for strings.
     * Assert analogs of META-ASSERTIONS-TO-PRESERVE about the new assertion as well.
     */
    @LispMethod(comment = "Edit OLD-ASSERTION to have NEW-SENTENCE, which must be the same as the sentence of OLD-ASSERTION except for strings.\r\nAssert analogs of META-ASSERTIONS-TO-PRESERVE about the new assertion as well.\nEdit OLD-ASSERTION to have NEW-SENTENCE, which must be the same as the sentence of OLD-ASSERTION except for strings.\nAssert analogs of META-ASSERTIONS-TO-PRESERVE about the new assertion as well.")
    public static final SubLObject ke_edit_assertion_strings_alt(SubLObject old_assertion, SubLObject new_sentence, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        SubLTrampolineFile.checkType(old_assertion, ASSERTION_P);
        {
            SubLObject old_sentence = com.cyc.cycjava.cycl.ke.ke_assertion_edit_formula(old_assertion);
            if (NIL == com.cyc.cycjava.cycl.ke.formulas_differ_only_in_strings(old_sentence, new_sentence)) {
                Errors.error($str_alt70$Sentences_do_not_differ_only_in_s);
            }
        }
        return com.cyc.cycjava.cycl.ke.ke_edit_assertion_but_not_bookkeeping(old_assertion, new_sentence, NIL, NIL, NIL, meta_assertions_to_preserve);
    }

    /**
     * Edit OLD-ASSERTION to have NEW-SENTENCE, which must be the same as the sentence of OLD-ASSERTION except for strings.
     * Assert analogs of META-ASSERTIONS-TO-PRESERVE about the new assertion as well.
     */
    @LispMethod(comment = "Edit OLD-ASSERTION to have NEW-SENTENCE, which must be the same as the sentence of OLD-ASSERTION except for strings.\r\nAssert analogs of META-ASSERTIONS-TO-PRESERVE about the new assertion as well.\nEdit OLD-ASSERTION to have NEW-SENTENCE, which must be the same as the sentence of OLD-ASSERTION except for strings.\nAssert analogs of META-ASSERTIONS-TO-PRESERVE about the new assertion as well.")
    public static SubLObject ke_edit_assertion_strings(final SubLObject old_assertion, final SubLObject new_sentence, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        assert NIL != assertion_handles.assertion_p(old_assertion) : "! assertion_handles.assertion_p(old_assertion) " + ("assertion_handles.assertion_p(old_assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(old_assertion) ") + old_assertion;
        final SubLObject old_sentence = ke_assertion_edit_formula(old_assertion);
        if (NIL == formulas_differ_only_in_strings(old_sentence, new_sentence, UNPROVIDED)) {
            Errors.error($str84$Sentences_do_not_differ_only_in_s);
        }
        return ke_edit_assertion_but_not_bookkeeping(old_assertion, new_sentence, NIL, NIL, NIL, meta_assertions_to_preserve);
    }

    /**
     * Recanonicalize ASSERTION using the 'whack' method
     */
    @LispMethod(comment = "Recanonicalize ASSERTION using the \'whack\' method")
    public static final SubLObject ke_recanonicalize_assertion_alt(SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject sentence = com.cyc.cycjava.cycl.ke.ke_assertion_edit_formula(assertion);
            return com.cyc.cycjava.cycl.ke.ke_edit_assertion_but_not_bookkeeping(assertion, sentence, NIL, NIL, NIL, meta_assertions_to_preserve);
        }
    }

    /**
     * Recanonicalize ASSERTION using the 'whack' method
     */
    @LispMethod(comment = "Recanonicalize ASSERTION using the \'whack\' method")
    public static SubLObject ke_recanonicalize_assertion(final SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject sentence = ke_assertion_edit_formula(assertion);
        return ke_edit_assertion_but_not_bookkeeping(assertion, sentence, NIL, NIL, NIL, meta_assertions_to_preserve);
    }

    /**
     * Recanonicalize ASSERTION using the 'whack' method
     */
    @LispMethod(comment = "Recanonicalize ASSERTION using the \'whack\' method")
    public static final SubLObject ke_recanonicalize_assertion_now_alt(SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject sentence = com.cyc.cycjava.cycl.ke.ke_assertion_edit_formula(assertion);
            return com.cyc.cycjava.cycl.ke.ke_edit_assertion_now_but_not_bookkeeping(assertion, sentence, NIL, NIL, NIL, meta_assertions_to_preserve);
        }
    }

    /**
     * Recanonicalize ASSERTION using the 'whack' method
     */
    @LispMethod(comment = "Recanonicalize ASSERTION using the \'whack\' method")
    public static SubLObject ke_recanonicalize_assertion_now(final SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject sentence = ke_assertion_edit_formula(assertion);
        return ke_edit_assertion_now_but_not_bookkeeping(assertion, sentence, NIL, NIL, NIL, meta_assertions_to_preserve);
    }

    /**
     *
     *
     * @unknown old-assertion: an old assertion
     * @unknown new-sentence: a new sentence
     * @unknown new-mt: a new mt (optional)
     * @unknown strength: a new strength (optional)
     * @unknown direction: a new direction (optional)
     * @unknown meta-assertions-to-preserve: a list of meta-assertions about old-assertion (optional)
    Unasserts the old-assertion and asserts the new-sentence, using the mt, strength, and direction of the old-assertion
    if none are specified.  The new-sentence has the bookkeeping assertions of the old assertion.
     */
    @LispMethod(comment = "@unknown old-assertion: an old assertion\r\n@unknown new-sentence: a new sentence\r\n@unknown new-mt: a new mt (optional)\r\n@unknown strength: a new strength (optional)\r\n@unknown direction: a new direction (optional)\r\n@unknown meta-assertions-to-preserve: a list of meta-assertions about old-assertion (optional)\r\nUnasserts the old-assertion and asserts the new-sentence, using the mt, strength, and direction of the old-assertion\r\nif none are specified.  The new-sentence has the bookkeeping assertions of the old assertion.")
    public static final SubLObject ke_edit_assertion_but_not_bookkeeping_alt(SubLObject old_assertion, SubLObject new_sentence, SubLObject new_mt, SubLObject strength, SubLObject direction, SubLObject meta_assertions_to_preserve) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(old_assertion, ASSERTION_P);
            {
                SubLObject v_answer = NIL;
                SubLObject assertion_var = old_assertion;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_1 = fi.$the_date$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
                    SubLObject _prev_bind_3 = fi.$the_second$.currentBinding(thread);
                    SubLObject _prev_bind_4 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(assertions_high.asserted_by(assertion_var), thread);
                        fi.$the_date$.bind(assertions_high.asserted_when(assertion_var), thread);
                        api_control_vars.$ke_purpose$.bind(assertions_high.asserted_why(assertion_var), thread);
                        fi.$the_second$.bind(assertions_high.asserted_second(assertion_var), thread);
                        cyc_bookkeeping.$cyc_bookkeeping_info$.bind(cyc_bookkeeping.new_bookkeeping_info(api_control_vars.$the_cyclist$.getDynamicValue(thread), fi.$the_date$.getDynamicValue(thread), api_control_vars.$ke_purpose$.getDynamicValue(thread), fi.$the_second$.getDynamicValue(thread)), thread);
                        v_answer = com.cyc.cycjava.cycl.ke.ke_edit_assertion_preserving_meta_assertions(old_assertion, meta_assertions_to_preserve, new_sentence, new_mt, strength, direction);
                    } finally {
                        cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_4, thread);
                        fi.$the_second$.rebind(_prev_bind_3, thread);
                        api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
                        fi.$the_date$.rebind(_prev_bind_1, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     *
     *
     * @unknown old-assertion: an old assertion
     * @unknown new-sentence: a new sentence
     * @unknown new-mt: a new mt (optional)
     * @unknown strength: a new strength (optional)
     * @unknown direction: a new direction (optional)
     * @unknown meta-assertions-to-preserve: a list of meta-assertions about old-assertion (optional)
    Unasserts the old-assertion and asserts the new-sentence, using the mt, strength, and direction of the old-assertion
    if none are specified.  The new-sentence has the bookkeeping assertions of the old assertion.
     */
    @LispMethod(comment = "@unknown old-assertion: an old assertion\r\n@unknown new-sentence: a new sentence\r\n@unknown new-mt: a new mt (optional)\r\n@unknown strength: a new strength (optional)\r\n@unknown direction: a new direction (optional)\r\n@unknown meta-assertions-to-preserve: a list of meta-assertions about old-assertion (optional)\r\nUnasserts the old-assertion and asserts the new-sentence, using the mt, strength, and direction of the old-assertion\r\nif none are specified.  The new-sentence has the bookkeeping assertions of the old assertion.")
    public static SubLObject ke_edit_assertion_but_not_bookkeeping(final SubLObject old_assertion, final SubLObject new_sentence, SubLObject new_mt, SubLObject strength, SubLObject direction, SubLObject meta_assertions_to_preserve) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(old_assertion) : "! assertion_handles.assertion_p(old_assertion) " + ("assertion_handles.assertion_p(old_assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(old_assertion) ") + old_assertion;
        ensure_cyclist_ok();
        final SubLObject curr_cyclist = operation_communication.the_cyclist();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$the_date$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$ke_purpose$.currentBinding(thread);
        final SubLObject _prev_bind_4 = fi.$the_second$.currentBinding(thread);
        final SubLObject _prev_bind_5 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(assertions_high.asserted_by(old_assertion), thread);
            fi.$the_date$.bind(assertions_high.asserted_when(old_assertion), thread);
            api_control_vars.$ke_purpose$.bind(assertions_high.asserted_why(old_assertion), thread);
            fi.$the_second$.bind(assertions_high.asserted_second(old_assertion), thread);
            cyc_bookkeeping.$cyc_bookkeeping_info$.bind(cyc_bookkeeping.new_bookkeeping_info(api_control_vars.$the_cyclist$.getDynamicValue(thread), fi.$the_date$.getDynamicValue(thread), api_control_vars.$ke_purpose$.getDynamicValue(thread), fi.$the_second$.getDynamicValue(thread)), thread);
            if (NIL != cyclist_is_guest()) {
                operation_communication.set_the_cyclist(curr_cyclist);
                fi.$the_date$.setDynamicValue(get_universal_time(), thread);
                fi.$the_second$.setDynamicValue(numeric_date_utilities.get_universal_second(UNPROVIDED), thread);
            }
            v_answer = ke_edit_assertion_preserving_meta_assertions(old_assertion, meta_assertions_to_preserve, new_sentence, new_mt, strength, direction);
        } finally {
            cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_5, thread);
            fi.$the_second$.rebind(_prev_bind_4, thread);
            api_control_vars.$ke_purpose$.rebind(_prev_bind_3, thread);
            fi.$the_date$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    /**
     *
     *
     * @unknown old-assertion: an old assertion
     * @unknown new-sentence: a new sentence
     * @unknown new-mt: a new mt (optional)
     * @unknown strength: a new strength (optional)
     * @unknown direction: a new direction (optional)
     * @unknown meta-assertions-to-preserve: a list of meta-assertions about old-assertion (optional)
    Unasserts the old-assertion and asserts the new-sentence, using the mt, strength, and direction of the old-assertion
    if none are specified.  The new-sentence has the bookkeeping assertions of the old assertion.
     */
    @LispMethod(comment = "@unknown old-assertion: an old assertion\r\n@unknown new-sentence: a new sentence\r\n@unknown new-mt: a new mt (optional)\r\n@unknown strength: a new strength (optional)\r\n@unknown direction: a new direction (optional)\r\n@unknown meta-assertions-to-preserve: a list of meta-assertions about old-assertion (optional)\r\nUnasserts the old-assertion and asserts the new-sentence, using the mt, strength, and direction of the old-assertion\r\nif none are specified.  The new-sentence has the bookkeeping assertions of the old assertion.")
    public static final SubLObject ke_edit_assertion_now_but_not_bookkeeping_alt(SubLObject old_assertion, SubLObject new_sentence, SubLObject new_mt, SubLObject strength, SubLObject direction, SubLObject meta_assertions_to_preserve) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(old_assertion, ASSERTION_P);
            {
                SubLObject v_answer = NIL;
                SubLObject assertion_var = old_assertion;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_1 = fi.$the_date$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
                    SubLObject _prev_bind_3 = fi.$the_second$.currentBinding(thread);
                    SubLObject _prev_bind_4 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(assertions_high.asserted_by(assertion_var), thread);
                        fi.$the_date$.bind(assertions_high.asserted_when(assertion_var), thread);
                        api_control_vars.$ke_purpose$.bind(assertions_high.asserted_why(assertion_var), thread);
                        fi.$the_second$.bind(assertions_high.asserted_second(assertion_var), thread);
                        cyc_bookkeeping.$cyc_bookkeeping_info$.bind(cyc_bookkeeping.new_bookkeeping_info(api_control_vars.$the_cyclist$.getDynamicValue(thread), fi.$the_date$.getDynamicValue(thread), api_control_vars.$ke_purpose$.getDynamicValue(thread), fi.$the_second$.getDynamicValue(thread)), thread);
                        v_answer = com.cyc.cycjava.cycl.ke.ke_edit_assertion_now_preserving_meta_assertions(old_assertion, meta_assertions_to_preserve, new_sentence, new_mt, strength, direction);
                    } finally {
                        cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_4, thread);
                        fi.$the_second$.rebind(_prev_bind_3, thread);
                        api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
                        fi.$the_date$.rebind(_prev_bind_1, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     *
     *
     * @unknown old-assertion: an old assertion
     * @unknown new-sentence: a new sentence
     * @unknown new-mt: a new mt (optional)
     * @unknown strength: a new strength (optional)
     * @unknown direction: a new direction (optional)
     * @unknown meta-assertions-to-preserve: a list of meta-assertions about old-assertion (optional)
    Unasserts the old-assertion and asserts the new-sentence, using the mt, strength, and direction of the old-assertion
    if none are specified.  The new-sentence has the bookkeeping assertions of the old assertion.
     */
    @LispMethod(comment = "@unknown old-assertion: an old assertion\r\n@unknown new-sentence: a new sentence\r\n@unknown new-mt: a new mt (optional)\r\n@unknown strength: a new strength (optional)\r\n@unknown direction: a new direction (optional)\r\n@unknown meta-assertions-to-preserve: a list of meta-assertions about old-assertion (optional)\r\nUnasserts the old-assertion and asserts the new-sentence, using the mt, strength, and direction of the old-assertion\r\nif none are specified.  The new-sentence has the bookkeeping assertions of the old assertion.")
    public static SubLObject ke_edit_assertion_now_but_not_bookkeeping(final SubLObject old_assertion, final SubLObject new_sentence, SubLObject new_mt, SubLObject strength, SubLObject direction, SubLObject meta_assertions_to_preserve) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(old_assertion) : "! assertion_handles.assertion_p(old_assertion) " + ("assertion_handles.assertion_p(old_assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(old_assertion) ") + old_assertion;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$the_date$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$ke_purpose$.currentBinding(thread);
        final SubLObject _prev_bind_4 = fi.$the_second$.currentBinding(thread);
        final SubLObject _prev_bind_5 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(assertions_high.asserted_by(old_assertion), thread);
            fi.$the_date$.bind(assertions_high.asserted_when(old_assertion), thread);
            api_control_vars.$ke_purpose$.bind(assertions_high.asserted_why(old_assertion), thread);
            fi.$the_second$.bind(assertions_high.asserted_second(old_assertion), thread);
            cyc_bookkeeping.$cyc_bookkeeping_info$.bind(cyc_bookkeeping.new_bookkeeping_info(api_control_vars.$the_cyclist$.getDynamicValue(thread), fi.$the_date$.getDynamicValue(thread), api_control_vars.$ke_purpose$.getDynamicValue(thread), fi.$the_second$.getDynamicValue(thread)), thread);
            v_answer = ke_edit_assertion_now_preserving_meta_assertions(old_assertion, meta_assertions_to_preserve, new_sentence, new_mt, strength, direction);
        } finally {
            cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_5, thread);
            fi.$the_second$.rebind(_prev_bind_4, thread);
            api_control_vars.$ke_purpose$.rebind(_prev_bind_3, thread);
            fi.$the_date$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static final SubLObject formulas_differ_only_in_strings(SubLObject formula_1, SubLObject formula_2) {
        return com.cyc.cycjava.cycl.ke.tree_equal_ignoring_type(formula_1, formula_2, symbol_function(STRINGP), symbol_function(EQUAL));
    }

    public static SubLObject formulas_differ_only_in_strings(final SubLObject formula_1, final SubLObject formula_2, SubLObject string_pred) {
        if (string_pred == UNPROVIDED) {
            string_pred = symbol_function(STRINGP);
        }
        return tree_equal_ignoring_type(formula_1, formula_2, string_pred, symbol_function(EQUAL));
    }

    /**
     * Return T iff TREE-1 and TREE-2 are equal.
     * Comparison is not done between any two objects that both satisfy INGORE-TYPE.
     * TEST is the equality test used for atoms.
     */
    @LispMethod(comment = "Return T iff TREE-1 and TREE-2 are equal.\r\nComparison is not done between any two objects that both satisfy INGORE-TYPE.\r\nTEST is the equality test used for atoms.\nReturn T iff TREE-1 and TREE-2 are equal.\nComparison is not done between any two objects that both satisfy INGORE-TYPE.\nTEST is the equality test used for atoms.")
    public static final SubLObject tree_equal_ignoring_type_alt(SubLObject tree_1, SubLObject tree_2, SubLObject ignore_type, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if ((NIL != funcall(ignore_type, tree_1)) && (NIL != funcall(ignore_type, tree_2))) {
            return T;
        } else {
            if (tree_1.isAtom() && tree_2.isAtom()) {
                return funcall(test, tree_1, tree_2);
            } else {
                if (!(tree_1.isCons() && tree_2.isCons())) {
                    return NIL;
                } else {
                    if (NIL == com.cyc.cycjava.cycl.ke.tree_equal_ignoring_type(tree_1.first(), tree_2.first(), ignore_type, test)) {
                        return NIL;
                    } else {
                        return com.cyc.cycjava.cycl.ke.tree_equal_ignoring_type(tree_1.rest(), tree_2.rest(), ignore_type, test);
                    }
                }
            }
        }
    }

    /**
     * Return T iff TREE-1 and TREE-2 are equal.
     * Comparison is not done between any two objects that both satisfy INGORE-TYPE.
     * TEST is the equality test used for atoms.
     */
    @LispMethod(comment = "Return T iff TREE-1 and TREE-2 are equal.\r\nComparison is not done between any two objects that both satisfy INGORE-TYPE.\r\nTEST is the equality test used for atoms.\nReturn T iff TREE-1 and TREE-2 are equal.\nComparison is not done between any two objects that both satisfy INGORE-TYPE.\nTEST is the equality test used for atoms.")
    public static SubLObject tree_equal_ignoring_type(final SubLObject tree_1, final SubLObject tree_2, final SubLObject ignore_type, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if ((NIL != funcall(ignore_type, tree_1)) && (NIL != funcall(ignore_type, tree_2))) {
            return T;
        }
        if (tree_1.isAtom() && tree_2.isAtom()) {
            return funcall(test, tree_1, tree_2);
        }
        if ((!tree_1.isCons()) || (!tree_2.isCons())) {
            return NIL;
        }
        if (NIL == tree_equal_ignoring_type(tree_1.first(), tree_2.first(), ignore_type, test)) {
            return NIL;
        }
        return tree_equal_ignoring_type(tree_1.rest(), tree_2.rest(), ignore_type, test);
    }

    public static final SubLObject ke_blast_alt(SubLObject formula, SubLObject mt) {
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            return com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_BLAST, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
        }
        return NIL;
    }

    public static SubLObject ke_blast(final SubLObject formula, final SubLObject mt) {
        if (NIL != ensure_cyclist_ok()) {
            return do_edit_op(list(FI_BLAST, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
        }
        return NIL;
    }

    public static final SubLObject ke_blast_assertion_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return com.cyc.cycjava.cycl.ke.ke_blast(com.cyc.cycjava.cycl.ke.ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    public static SubLObject ke_blast_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return ke_blast(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    /**
     * Renames variables present in FORMULA in MT according to RENAME-ALIST.
     * Adds the rename variables operation to the transcript.
     *
     * @param RENAME-ALIST
     * 		alist-p;  contains the current variables as keys and the proposed variables as values.
     */
    @LispMethod(comment = "Renames variables present in FORMULA in MT according to RENAME-ALIST.\r\nAdds the rename variables operation to the transcript.\r\n\r\n@param RENAME-ALIST\r\n\t\talist-p;  contains the current variables as keys and the proposed variables as values.\nRenames variables present in FORMULA in MT according to RENAME-ALIST.\nAdds the rename variables operation to the transcript.")
    public static final SubLObject ke_rename_variables_alt(SubLObject formula, SubLObject rename_alist, SubLObject mt) {
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        SubLTrampolineFile.checkType(rename_alist, ALIST_P);
        return com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_RENAME_VARIABLES, list(QUOTE, formula), list(QUOTE, rename_alist), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
    }

    /**
     * Renames variables present in FORMULA in MT according to RENAME-ALIST.
     * Adds the rename variables operation to the transcript.
     *
     * @param RENAME-ALIST
     * 		alist-p;  contains the current variables as keys and the proposed variables as values.
     */
    @LispMethod(comment = "Renames variables present in FORMULA in MT according to RENAME-ALIST.\r\nAdds the rename variables operation to the transcript.\r\n\r\n@param RENAME-ALIST\r\n\t\talist-p;  contains the current variables as keys and the proposed variables as values.\nRenames variables present in FORMULA in MT according to RENAME-ALIST.\nAdds the rename variables operation to the transcript.")
    public static SubLObject ke_rename_variables(final SubLObject formula, final SubLObject rename_alist, final SubLObject mt) {
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        assert NIL != list_utilities.alist_p(rename_alist) : "! list_utilities.alist_p(rename_alist) " + ("list_utilities.alist_p(rename_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(rename_alist) ") + rename_alist;
        return do_edit_op(list(FI_RENAME_VARIABLES, list(QUOTE, formula), list(QUOTE, rename_alist), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
    }

    public static SubLObject ke_add_argument(final SubLObject formula, final SubLObject mt, final SubLObject el_supports, SubLObject direction, SubLObject verify_supportsP) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (verify_supportsP == UNPROVIDED) {
            verify_supportsP = NIL;
        }
        if (NIL != ensure_cyclist_ok()) {
            return do_edit_op(list(FI_ADD_ARGUMENT, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt)), list(QUOTE, el_supports), list(QUOTE, direction), list(QUOTE, verify_supportsP)));
        }
        return NIL;
    }

    public static SubLObject ke_add_argument_now(final SubLObject formula, final SubLObject mt, final SubLObject el_supports, SubLObject direction, SubLObject verify_supportsP, SubLObject check_wffP) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (verify_supportsP == UNPROVIDED) {
            verify_supportsP = NIL;
        }
        if (check_wffP == UNPROVIDED) {
            check_wffP = makeBoolean(NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue());
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
        if (NIL == $inference_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject environment = forward.get_forward_inference_environment();
                        assert NIL != queues.queue_p(environment) : "! queues.queue_p(environment) " + ("queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) ") + environment;
                        final SubLObject _prev_bind_0_$33 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                            final SubLObject v_properties = list($DIRECTION, direction, $kw90$CHECK_WFF_, check_wffP);
                            result = cyc_kernel.cyc_add_argument(formula, el_supports, v_hlmt, v_properties, verify_supportsP);
                        } finally {
                            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$33, thread);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            final SubLObject environment2 = forward.get_forward_inference_environment();
            assert NIL != queues.queue_p(environment2) : "! queues.queue_p(environment2) " + ("queues.queue_p(environment2) " + "CommonSymbols.NIL != queues.queue_p(environment2) ") + environment2;
            final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment2, thread);
                final SubLObject v_properties2 = list($DIRECTION, direction, $kw90$CHECK_WFF_, check_wffP);
                result = cyc_kernel.cyc_add_argument(formula, el_supports, v_hlmt, v_properties2, verify_supportsP);
            } finally {
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_2, thread);
            }
        }
        if (NIL != result) {
            operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_ADD_ARGUMENT, list(QUOTE, formula), list(QUOTE, v_hlmt), list(QUOTE, el_supports), list(QUOTE, direction), list(QUOTE, verify_supportsP))));
            return values(result, NIL);
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static final SubLObject ke_remove_argument_alt(SubLObject formula, SubLObject mt, SubLObject el_supports) {
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            return com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_REMOVE_ARGUMENT, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt)), list(QUOTE, el_supports)));
        }
        return NIL;
    }

    public static SubLObject ke_remove_argument(final SubLObject formula, final SubLObject mt, final SubLObject el_supports) {
        if (NIL != ensure_cyclist_ok()) {
            return do_edit_op(list(FI_REMOVE_ARGUMENT, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt)), list(QUOTE, el_supports)));
        }
        return NIL;
    }

    public static final SubLObject ke_remove_deduction_alt(SubLObject deduction) {
        SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
        {
            SubLObject assertion = deductions_high.deduction_assertion(deduction);
            SubLObject supports = deductions_high.deduction_supports(deduction);
            SubLObject tl_supports = Mapping.mapcar(symbol_function(CONVERT_HL_SUPPORT_TO_TL_SUPPORT), supports);
            return com.cyc.cycjava.cycl.ke.ke_remove_argument(com.cyc.cycjava.cycl.ke.ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion), tl_supports);
        }
    }

    public static SubLObject ke_remove_deduction(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        final SubLObject assertion = deductions_high.deduction_assertion(deduction);
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        final SubLObject tl_supports = Mapping.mapcar(symbol_function(CONVERT_HL_SUPPORT_TO_TL_SUPPORT), supports);
        return ke_remove_argument(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion), tl_supports);
    }

    public static final SubLObject ke_tms_reconsider_term_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(fort, FORT_P);
        return com.cyc.cycjava.cycl.ke.do_edit_op(listS(FI_TMS_RECONSIDER_TERM, list(QUOTE, fort), append(NIL != mt ? ((SubLObject) (list(list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))))) : NIL, NIL)));
    }

    public static SubLObject ke_tms_reconsider_term(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        return do_edit_op(listS(FI_TMS_RECONSIDER_TERM, list(QUOTE, fort), append(NIL != mt ? list(list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))) : NIL, NIL)));
    }

    public static final SubLObject ke_tms_reconsider_formula_alt(SubLObject formula, SubLObject mt) {
        if (NIL != com.cyc.cycjava.cycl.ke.ensure_cyclist_ok()) {
            return com.cyc.cycjava.cycl.ke.do_edit_op(list(FI_TMS_RECONSIDER_FORMULA, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
        }
        return NIL;
    }

    public static SubLObject ke_tms_reconsider_formula(final SubLObject formula, final SubLObject mt) {
        if (NIL != ensure_cyclist_ok()) {
            return do_edit_op(list(FI_TMS_RECONSIDER_FORMULA, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
        }
        return NIL;
    }

    public static SubLObject ke_tms_reconsider_formula_now(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == ensure_cyclist_ok()) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject result = ke_tms_reconsider_formula_now_int(formula, mt);
        final SubLObject error_message = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject v_hlmt = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_TMS_RECONSIDER_FORMULA, list(QUOTE, sentence), list(QUOTE, hlmt_czer.canonicalize_hlmt(v_hlmt)))));
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_tms_reconsider_formula_now_int(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_tms_reconsider_formula_int(formula, mt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return values(result, error_message, formula, mt);
    }

    public static final SubLObject ke_tms_reconsider_assertion_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return com.cyc.cycjava.cycl.ke.ke_tms_reconsider_formula(com.cyc.cycjava.cycl.ke.ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    public static SubLObject ke_tms_reconsider_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return ke_tms_reconsider_formula(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    public static SubLObject ke_tms_reconsider_assertion_now(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return ke_tms_reconsider_formula_now(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    /**
     * Blasts all assertions dependent on ASSERTION.
     */
    @LispMethod(comment = "Blasts all assertions dependent on ASSERTION.")
    public static final SubLObject ke_blast_all_dependents_alt(SubLObject assertion) {
        {
            SubLObject successP = T;
            SubLObject dependents = assertion_utilities.assertion_dependent_assertions(assertion);
            SubLObject cdolist_list_var = dependents;
            SubLObject dependent = NIL;
            for (dependent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent = cdolist_list_var.first()) {
                if (NIL != valid_assertionP(dependent, UNPROVIDED)) {
                    if (NIL == com.cyc.cycjava.cycl.ke.ke_blast_assertion(dependent)) {
                        successP = NIL;
                    }
                }
            }
            return successP;
        }
    }

    /**
     * Blasts all assertions dependent on ASSERTION.
     */
    @LispMethod(comment = "Blasts all assertions dependent on ASSERTION.")
    public static SubLObject ke_blast_all_dependents(final SubLObject assertion) {
        SubLObject successP = T;
        SubLObject cdolist_list_var;
        final SubLObject dependents = cdolist_list_var = assertion_utilities.assertion_dependent_assertions(assertion);
        SubLObject dependent = NIL;
        dependent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_handles.valid_assertionP(dependent, UNPROVIDED)) && (NIL == ke_blast_assertion(dependent))) {
                successP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
        } 
        return successP;
    }

    /**
     * Change the direction of ASSERTION to NEW-DIRECTION
     */
    @LispMethod(comment = "Change the direction of ASSERTION to NEW-DIRECTION")
    public static final SubLObject ke_change_assertion_direction_alt(SubLObject assertion, SubLObject new_direction) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(new_direction, DIRECTION_P);
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            {
                SubLObject old_direction = assertions_high.assertion_direction(assertion);
                if (!old_direction.equal(new_direction)) {
                    {
                        SubLObject strength = assertions_high.assertion_strength(assertion);
                        com.cyc.cycjava.cycl.ke.ke_reassert_assertion(assertion, strength, new_direction);
                        return assertion;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Change the direction of ASSERTION to NEW-DIRECTION
     */
    @LispMethod(comment = "Change the direction of ASSERTION to NEW-DIRECTION")
    public static SubLObject ke_change_assertion_direction(final SubLObject assertion, final SubLObject new_direction) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != enumeration_types.direction_p(new_direction) : "! enumeration_types.direction_p(new_direction) " + ("enumeration_types.direction_p(new_direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(new_direction) ") + new_direction;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_direction = assertions_high.assertion_direction(assertion);
            if (!old_direction.equal(new_direction)) {
                final SubLObject strength = assertions_high.assertion_strength(assertion);
                ke_reassert_assertion(assertion, strength, new_direction);
                return assertion;
            }
        }
        return NIL;
    }

    public static SubLObject ke_shoehorn_rule_forward(final SubLObject rule_assertion) {
        assert NIL != assertions_high.rule_assertionP(rule_assertion) : "! assertions_high.rule_assertionP(rule_assertion) " + ("assertions_high.rule_assertionP(rule_assertion) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule_assertion) ") + rule_assertion;
        ke_assert(list($$pragmaticRequirement, $list99, rule_assertion), assertions_high.assertion_mt(rule_assertion), UNPROVIDED, UNPROVIDED);
        ke_change_assertion_direction(rule_assertion, $FORWARD);
        ke_unassert(list($$pragmaticRequirement, $list99, rule_assertion), assertions_high.assertion_mt(rule_assertion));
        return rule_assertion;
    }

    /**
     * Change the argument strength of ASSERTION to NEW-STRENGTH
     */
    @LispMethod(comment = "Change the argument strength of ASSERTION to NEW-STRENGTH")
    public static final SubLObject ke_change_assertion_strength_alt(SubLObject assertion, SubLObject new_strength) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(new_strength, EL_STRENGTH_P);
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            {
                SubLObject old_strength = assertions_high.assertion_strength(assertion);
                if (!old_strength.equal(new_strength)) {
                    {
                        SubLObject direction = assertions_high.assertion_direction(assertion);
                        com.cyc.cycjava.cycl.ke.ke_reassert_assertion(assertion, new_strength, direction);
                        return assertion;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Change the argument strength of ASSERTION to NEW-STRENGTH
     */
    @LispMethod(comment = "Change the argument strength of ASSERTION to NEW-STRENGTH")
    public static SubLObject ke_change_assertion_strength(final SubLObject assertion, final SubLObject new_strength) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != enumeration_types.el_strength_p(new_strength) : "! enumeration_types.el_strength_p(new_strength) " + ("enumeration_types.el_strength_p(new_strength) " + "CommonSymbols.NIL != enumeration_types.el_strength_p(new_strength) ") + new_strength;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_strength = assertions_high.assertion_strength(assertion);
            if (!old_strength.equal(new_strength)) {
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                ke_reassert_assertion(assertion, new_strength, direction);
                return assertion;
            }
        }
        return NIL;
    }

    /**
     * Change the microtheory of ASSERTION to NEW-MT
     */
    @LispMethod(comment = "Change the microtheory of ASSERTION to NEW-MT")
    public static final SubLObject ke_change_assertion_mt_alt(SubLObject assertion, SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(new_mt, HLMT_P);
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            {
                SubLObject old_mt = assertions_high.assertion_mt(assertion);
                if (!old_mt.equal(new_mt)) {
                    {
                        SubLObject formula = com.cyc.cycjava.cycl.ke.ke_assertion_edit_formula(assertion);
                        return com.cyc.cycjava.cycl.ke.ke_convert_assertion(assertion, formula, new_mt, meta_assertions_to_preserve);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Change the microtheory of ASSERTION to NEW-MT
     */
    @LispMethod(comment = "Change the microtheory of ASSERTION to NEW-MT")
    public static SubLObject ke_change_assertion_mt(final SubLObject assertion, final SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != hlmt.hlmt_p(new_mt) : "! hlmt.hlmt_p(new_mt) " + ("hlmt.hlmt_p(new_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(new_mt) ") + new_mt;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_mt = assertions_high.assertion_mt(assertion);
            if (!old_mt.equal(new_mt)) {
                final SubLObject formula = ke_assertion_edit_formula(assertion);
                return ke_convert_assertion(assertion, formula, new_mt, meta_assertions_to_preserve);
            }
        }
        return NIL;
    }

    /**
     * Convert ASSERTION to one which has NEW-FORMULA in NEW-MT
     */
    @LispMethod(comment = "Convert ASSERTION to one which has NEW-FORMULA in NEW-MT")
    public static final SubLObject ke_convert_assertion_alt(SubLObject assertion, SubLObject new_formula, SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        if (NIL != meta_assertions_to_preserve) {
            return com.cyc.cycjava.cycl.ke.ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, new_formula, new_mt, UNPROVIDED, UNPROVIDED);
        } else {
            return com.cyc.cycjava.cycl.ke.ke_edit_assertion(assertion, new_formula, new_mt, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Convert ASSERTION to one which has NEW-FORMULA in NEW-MT
     */
    @LispMethod(comment = "Convert ASSERTION to one which has NEW-FORMULA in NEW-MT")
    public static SubLObject ke_convert_assertion(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        if (NIL != meta_assertions_to_preserve) {
            return ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, new_formula, new_mt, UNPROVIDED, UNPROVIDED);
        }
        return ke_edit_assertion(assertion, new_formula, new_mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Find any constants for which STRING is an oldConstantName.
     */
    @LispMethod(comment = "Find any constants for which STRING is an oldConstantName.")
    public static final SubLObject old_constant_names_alt(SubLObject string) {
        if (NIL != $old_constant_names_table$.getGlobalValue()) {
            return values(gethash(string, $old_constant_names_table$.getGlobalValue(), UNPROVIDED));
        }
        return NIL;
    }

    /**
     * Find any constants for which STRING is an oldConstantName.
     */
    @LispMethod(comment = "Find any constants for which STRING is an oldConstantName.")
    public static SubLObject old_constant_names(final SubLObject string) {
        if (NIL != $old_constant_names_table$.getGlobalValue()) {
            return values(gethash(string, $old_constant_names_table$.getGlobalValue(), UNPROVIDED));
        }
        return NIL;
    }

    /**
     * Set up the *old-constant-names-table* table.
     */
    @LispMethod(comment = "Set up the *old-constant-names-table* table.")
    public static final SubLObject initialize_old_constant_names_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = kb_indexing.num_predicate_extent_index($$oldConstantName, $$BookkeepingMt);
                if (!$old_constant_names_table$.getGlobalValue().isHashtable()) {
                    $old_constant_names_table$.setGlobalValue(make_hash_table(total, symbol_function(EQUALP), UNPROVIDED));
                }
                clrhash($old_constant_names_table$.getGlobalValue());
                {
                    SubLObject sofar = ZERO_INTEGER;
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
                            noting_percent_progress_preamble($str_alt83$Initializing_old_constant_name_ta);
                            {
                                SubLObject _prev_bind_0_25 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_26 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                    mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                                    {
                                        SubLObject pred_var = $$oldConstantName;
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
                                                                        SubLObject done_var_27 = NIL;
                                                                        SubLObject token_var_28 = NIL;
                                                                        while (NIL == done_var_27) {
                                                                            {
                                                                                SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_28);
                                                                                SubLObject valid_29 = makeBoolean(token_var_28 != gaf);
                                                                                if (NIL != valid_29) {
                                                                                    sofar = add(sofar, ONE_INTEGER);
                                                                                    note_percent_progress(sofar, total);
                                                                                    if (NIL != assertions_high.gaf_assertionP(gaf)) {
                                                                                        {
                                                                                            SubLObject constant = assertions_high.gaf_arg(gaf, ONE_INTEGER);
                                                                                            SubLObject string = assertions_high.gaf_arg(gaf, TWO_INTEGER);
                                                                                            com.cyc.cycjava.cycl.ke.cache_old_constant_name(string, constant);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var_27 = makeBoolean(NIL == valid_29);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_30, thread);
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
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_26, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_25, thread);
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
            return hash_table_count($old_constant_names_table$.getGlobalValue());
        }
    }

    /**
     * Set up the *old-constant-names-table* table.
     */
    @LispMethod(comment = "Set up the *old-constant-names-table* table.")
    public static SubLObject initialize_old_constant_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = kb_indexing.num_predicate_extent_index($$oldConstantName, $$BookkeepingMt);
        if (!$old_constant_names_table$.getGlobalValue().isHashtable()) {
            $old_constant_names_table$.setGlobalValue(make_hash_table(total, symbol_function(EQUALP), UNPROVIDED));
        }
        clrhash($old_constant_names_table$.getGlobalValue());
        SubLObject sofar = ZERO_INTEGER;
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
                noting_percent_progress_preamble($str102$Initializing_old_constant_name_ta);
                final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$35 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                    final SubLObject pred_var = $$oldConstantName;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$35 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$36 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$38 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$39 = $progress_notification_count$.currentBinding(thread);
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
                                        SubLObject done_var_$40 = NIL;
                                        final SubLObject token_var_$41 = NIL;
                                        while (NIL == done_var_$40) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                            final SubLObject valid_$42 = makeBoolean(!token_var_$41.eql(gaf));
                                            if (NIL != valid_$42) {
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                                if (NIL != assertions_high.gaf_assertionP(gaf)) {
                                                    final SubLObject constant = assertions_high.gaf_arg(gaf, ONE_INTEGER);
                                                    final SubLObject string = assertions_high.gaf_arg(gaf, TWO_INTEGER);
                                                    cache_old_constant_name(string, constant);
                                                }
                                            }
                                            done_var_$40 = makeBoolean(NIL == valid_$42);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
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
                            $progress_notification_count$.rebind(_prev_bind_3_$39, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$38, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$36, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$35, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$35, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return hash_table_count($old_constant_names_table$.getGlobalValue());
    }

    public static final SubLObject cache_old_constant_name_alt(SubLObject string, SubLObject constant) {
        if (NIL != $old_constant_names_table$.getGlobalValue()) {
            {
                SubLObject entry = com.cyc.cycjava.cycl.ke.old_constant_names(string);
                sethash(string, $old_constant_names_table$.getGlobalValue(), adjoin(constant, entry, symbol_function(EQUALP), UNPROVIDED));
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject cache_old_constant_name(final SubLObject string, final SubLObject constant) {
        if (NIL != $old_constant_names_table$.getGlobalValue()) {
            final SubLObject entry = old_constant_names(string);
            sethash(string, $old_constant_names_table$.getGlobalValue(), adjoin(constant, entry, symbol_function(EQUALP), UNPROVIDED));
            return T;
        }
        return NIL;
    }

    public static final SubLObject decache_old_constant_name_alt(SubLObject string, SubLObject constant) {
        if (NIL != $old_constant_names_table$.getGlobalValue()) {
            {
                SubLObject entry = com.cyc.cycjava.cycl.ke.old_constant_names(string);
                if (NIL != entry) {
                    entry = delete(constant, entry, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == entry) {
                        remhash(string, $old_constant_names_table$.getGlobalValue());
                    } else {
                        sethash(string, $old_constant_names_table$.getGlobalValue(), entry);
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject decache_old_constant_name(final SubLObject string, final SubLObject constant) {
        if (NIL != $old_constant_names_table$.getGlobalValue()) {
            SubLObject entry = old_constant_names(string);
            if (NIL != entry) {
                entry = delete(constant, entry, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == entry) {
                    remhash(string, $old_constant_names_table$.getGlobalValue());
                } else {
                    sethash(string, $old_constant_names_table$.getGlobalValue(), entry);
                }
            }
            return T;
        }
        return NIL;
    }

    public static final SubLObject do_edit_op_alt(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != api_control_vars.$use_local_queueP$.getDynamicValue(thread)) {
                return operation_queues.add_to_local_queue(form, T);
            } else {
                return eval(form);
            }
        }
    }

    public static SubLObject do_edit_op(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != api_control_vars.$use_local_queueP$.getDynamicValue(thread)) {
            return operation_queues.add_to_local_queue(form, T);
        }
        return eval(form);
    }

    /**
     * Returns the assertions corresponding to TL sentence SENTENCE in microtheory MT
     * (assertion editing must be occurring at TL)
     */
    @LispMethod(comment = "Returns the assertions corresponding to TL sentence SENTENCE in microtheory MT\r\n(assertion editing must be occurring at TL)\nReturns the assertions corresponding to TL sentence SENTENCE in microtheory MT\n(assertion editing must be occurring at TL)")
    public static final SubLObject find_assertions_via_tl_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $ke_assertion_edit_formula_find_func$.getDynamicValue(thread);
                if (pcase_var.eql(QUOTE) || pcase_var.eql(ASSERTION_TL_FORMULA)) {
                    return canon_tl.find_assertions_from_tl_formula(sentence, mt);
                } else {
                    if (pcase_var.eql(QUOTE) || pcase_var.eql(ASSERTION_TL_IST_FORMULA)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject sentence_31 = czer_utilities.unwrap_if_ist(sentence, mt);
                            SubLObject mt_32 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            sentence = sentence_31;
                            mt = mt_32;
                        }
                        return canon_tl.find_assertions_from_tl_formula(sentence, mt);
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     * Returns the assertions corresponding to TL sentence SENTENCE in microtheory MT
     * (assertion editing must be occurring at TL)
     */
    @LispMethod(comment = "Returns the assertions corresponding to TL sentence SENTENCE in microtheory MT\r\n(assertion editing must be occurring at TL)\nReturns the assertions corresponding to TL sentence SENTENCE in microtheory MT\n(assertion editing must be occurring at TL)")
    public static SubLObject find_assertions_via_tl(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $ke_assertion_edit_formula_find_func$.getDynamicValue(thread);
        if (pcase_var.eql(QUOTE) || pcase_var.eql(ASSERTION_TL_FORMULA)) {
            return canon_tl.find_assertions_from_tl_formula(sentence, mt);
        }
        if (pcase_var.eql(QUOTE) || pcase_var.eql(ASSERTION_TL_IST_FORMULA)) {
            thread.resetMultipleValues();
            final SubLObject sentence_$45 = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
            final SubLObject mt_$46 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$45;
            mt = mt_$46;
            return canon_tl.find_assertions_from_tl_formula(sentence, mt);
        }
        return NIL;
    }

    /**
     * Return a formula suitable for KE editing of ASSERTION
     */
    @LispMethod(comment = "Return a formula suitable for KE editing of ASSERTION")
    public static final SubLObject ke_assertion_edit_formula_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            return funcall($ke_assertion_edit_formula_display_func$.getDynamicValue(thread), assertion);
        }
    }

    /**
     * Return a formula suitable for KE editing of ASSERTION
     */
    @LispMethod(comment = "Return a formula suitable for KE editing of ASSERTION")
    public static SubLObject ke_assertion_edit_formula(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return funcall($ke_assertion_edit_formula_display_func$.getDynamicValue(thread), assertion);
    }

    static private final SubLList $list_alt10 = list(makeKeyword("UNKNOWN-ERROR"), makeString("An unknown error has occurred"));

    /**
     * Return a formula suitable for KE editing of ASSERTION
     */
    @LispMethod(comment = "Return a formula suitable for KE editing of ASSERTION")
    public static final SubLObject ke_assertion_find_formula_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            return funcall($ke_assertion_edit_formula_find_func$.getDynamicValue(thread), assertion);
        }
    }

    /**
     * Return a formula suitable for KE editing of ASSERTION
     */
    @LispMethod(comment = "Return a formula suitable for KE editing of ASSERTION")
    public static SubLObject ke_assertion_find_formula(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return funcall($ke_assertion_edit_formula_find_func$.getDynamicValue(thread), assertion);
    }

    static private final SubLList $list_alt12 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));

    static private final SubLString $str_alt13$Create_new_constant_now_and_add_o = makeString("Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null \nit is used, otherwise a unique identifier is generated.\n@return 0 constant ;; new constant if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param NAME string\n@param EXTERNAL-ID guid-p\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    /**
     * Test to determine if the user should have editing privileges, or not.
     */
    @LispMethod(comment = "Test to determine if the user should have editing privileges, or not.")
    public static final SubLObject cyclist_is_guest_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != system_parameters.$allow_guest_to_editP$.getDynamicValue(thread) ? ((SubLObject) (NIL)) : equalp(operation_communication.the_cyclist(), $$Guest);
        }
    }

    /**
     * Test to determine if the user should have editing privileges, or not.
     */
    @LispMethod(comment = "Test to determine if the user should have editing privileges, or not.")
    public static SubLObject cyclist_is_guest() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != system_parameters.$allow_guest_to_editP$.getDynamicValue(thread) ? NIL : operation_communication.the_cyclist_is_guestP();
    }

    public static final SubLObject ensure_cyclist_ok_alt() {
        if (NIL == com.cyc.cycjava.cycl.ke.cyclist_is_guest()) {
            return T;
        }
        Errors.error($str_alt89$KB_editing_is_not_allowed_for_use);
        return NIL;
    }

    public static SubLObject ensure_cyclist_ok() {
        if (NIL == cyclist_is_guest()) {
            return T;
        }
        Errors.error($str107$KB_editing_is_not_allowed_for_use, operation_communication.the_cyclist());
        return NIL;
    }

    static private final SubLList $list_alt14 = list(makeSymbol("CONSTANT-P"), makeSymbol("LISTP"));

    /**
     * Eval FORM and transcript it unless it caused an error.
     *
     * @return 0 anything ;; the result of evaluating FORM.
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) or NIL if no error.
     * @param FORM
     * 		subL form.
     * @unknown FORM must be properly encapsulatable!!! its arguments can't include assertions,
    structures, or anything else that ENCAPSULATE/UNENCAPSULATE can't deal with.
     * @unknown karen
     * @unknown done
     */
    @LispMethod(comment = "Eval FORM and transcript it unless it caused an error.\r\n\r\n@return 0 anything ;; the result of evaluating FORM.\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) or NIL if no error.\r\n@param FORM\r\n\t\tsubL form.\r\n@unknown FORM must be properly encapsulatable!!! its arguments can\'t include assertions,\r\nstructures, or anything else that ENCAPSULATE/UNENCAPSULATE can\'t deal with.\r\n@unknown karen\r\n@unknown done")
    public static final SubLObject ke_eval_now_alt(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject error = NIL;
                SubLObject result = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                result = fi.fi_eval_int(form);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error) {
                    fi.signal_fi_error(list($GENERIC_ERROR, error));
                }
                if (NIL != $use_transcriptP$.getDynamicValue(thread)) {
                    if (NIL != fi.fi_error_signaledP()) {
                        return values(NIL, fi.fi_get_error_int());
                    } else {
                        operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_EVAL, form)));
                        return values(result, NIL);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Eval FORM and transcript it unless it caused an error.
     *
     * @return 0 anything ;; the result of evaluating FORM.
     * @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) or NIL if no error.
     * @param FORM
     * 		subL form.
     * @unknown FORM must be properly encapsulatable!!! its arguments can't include assertions,
    structures, or anything else that ENCAPSULATE/UNENCAPSULATE can't deal with.
     * @unknown karen
     * @unknown done
     */
    @LispMethod(comment = "Eval FORM and transcript it unless it caused an error.\r\n\r\n@return 0 anything ;; the result of evaluating FORM.\r\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) or NIL if no error.\r\n@param FORM\r\n\t\tsubL form.\r\n@unknown FORM must be properly encapsulatable!!! its arguments can\'t include assertions,\r\nstructures, or anything else that ENCAPSULATE/UNENCAPSULATE can\'t deal with.\r\n@unknown karen\r\n@unknown done")
    public static SubLObject ke_eval_now(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_eval_int(form);
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
            fi.signal_fi_error(list($GENERIC_ERROR, error));
        }
        if (NIL == $use_transcriptP$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, fi.fi_get_error_int());
        }
        operation_queues.add_to_transcript_queue(fi.fi_construct_form_to_enqueue(FI_EVAL, form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return values(result, NIL);
    }

    static private final SubLString $str_alt21$Constant__S_cannot_be_merged_beca = makeString("Constant ~S cannot be merged because it is mentioned in code");

    static private final SubLList $list_alt22 = list(makeKeyword("FATAL-ERROR"), list(makeSymbol("FORMAT"), NIL, makeString("~A is mentioned in code and cannot be merged."), makeSymbol("KILL-FORT")));

    static private final SubLString $str_alt27$Constant__S_cannot_be_killed_beca = makeString("Constant ~S cannot be killed because it is mentioned in code");

    static private final SubLList $list_alt29 = list(makeSymbol("FORT"));

    static private final SubLString $str_alt30$Kill_FORT_now_and_add_operation_t = makeString("Kill FORT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORT fort\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    public static final SubLObject declare_ke_file_alt() {
        declareFunction("ke_create", "KE-CREATE", 1, 0, false);
        declareFunction("ke_create_from_serialization", "KE-CREATE-FROM-SERIALIZATION", 2, 0, false);
        declareFunction("ke_create_internal", "KE-CREATE-INTERNAL", 1, 1, false);
        declareFunction("ke_create_now", "KE-CREATE-NOW", 1, 1, false);
        declareFunction("ke_find_or_create_now", "KE-FIND-OR-CREATE-NOW", 1, 1, false);
        declareFunction("ke_recreate_now", "KE-RECREATE-NOW", 1, 0, false);
        declareFunction("ke_merge", "KE-MERGE", 2, 0, false);
        declareFunction("ke_merge_now", "KE-MERGE-NOW", 2, 0, false);
        declareFunction("ke_kill", "KE-KILL", 1, 0, false);
        declareFunction("ke_kill_now", "KE-KILL-NOW", 1, 0, false);
        declareFunction("ke_recreate", "KE-RECREATE", 1, 0, false);
        declareFunction("rename_code_constant", "RENAME-CODE-CONSTANT", 2, 0, false);
        declareFunction("ke_rename", "KE-RENAME", 2, 0, false);
        declareFunction("ke_rename_code_constant", "KE-RENAME-CODE-CONSTANT", 2, 0, false);
        declareFunction("ke_rename_internal", "KE-RENAME-INTERNAL", 2, 0, false);
        declareFunction("note_old_constant_name", "NOTE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction("ke_rename_now", "KE-RENAME-NOW", 2, 0, false);
        declareFunction("ke_assert", "KE-ASSERT", 2, 2, false);
        declareFunction("ke_reassert_assertion_now", "KE-REASSERT-ASSERTION-NOW", 3, 0, false);
        declareFunction("ke_reassert_assertion_now_int", "KE-REASSERT-ASSERTION-NOW-INT", 3, 0, false);
        declareFunction("ke_reassert_assertion", "KE-REASSERT-ASSERTION", 3, 0, false);
        declareFunction("ke_repropagate_assertion_now", "KE-REPROPAGATE-ASSERTION-NOW", 1, 0, false);
        declareFunction("ke_repropagate_assertion", "KE-REPROPAGATE-ASSERTION", 1, 0, false);
        declareFunction("ke_assert_now", "KE-ASSERT-NOW", 2, 2, false);
        declareFunction("ke_assert_wff_now", "KE-ASSERT-WFF-NOW", 2, 2, false);
        declareFunction("ke_assert_now_int", "KE-ASSERT-NOW-INT", 5, 0, false);
        declareFunction("ke_assert_with_implicature", "KE-ASSERT-WITH-IMPLICATURE", 2, 2, false);
        declareFunction("ke_assert_now_with_implicature", "KE-ASSERT-NOW-WITH-IMPLICATURE", 2, 2, false);
        declareFunction("ke_assert_with_implicature_int", "KE-ASSERT-WITH-IMPLICATURE-INT", 5, 0, false);
        declareFunction("ke_assert_with_implicature_int_assert", "KE-ASSERT-WITH-IMPLICATURE-INT-ASSERT", 5, 0, false);
        declareFunction("ke_unassert", "KE-UNASSERT", 2, 0, false);
        declareFunction("ke_unassert_assertion", "KE-UNASSERT-ASSERTION", 1, 0, false);
        declareFunction("ke_unassert_now", "KE-UNASSERT-NOW", 2, 0, false);
        declareFunction("ke_unassert_assertion_now", "KE-UNASSERT-ASSERTION-NOW", 1, 0, false);
        declareFunction("ke_edit", "KE-EDIT", 3, 3, false);
        declareFunction("ke_edit_now", "KE-EDIT-NOW", 3, 3, false);
        declareFunction("ke_edit_assertion", "KE-EDIT-ASSERTION", 2, 3, false);
        declareFunction("ke_edit_assertion_preserving_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS", 3, 3, false);
        declareFunction("ke_edit_assertion_now_preserving_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-META-ASSERTIONS", 3, 3, false);
        declareFunction("ke_edit_assertion_preserving_meta_assertions_int", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS-INT", 7, 0, false);
        declareFunction("ke_edit_assertion_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
        declareFunction("ke_edit_assertion_now_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
        declareFunction("ke_null_edit_assertion", "KE-NULL-EDIT-ASSERTION", 1, 0, false);
        declareFunction("ke_edit_compute_new_meta_assertion_assertibles", "KE-EDIT-COMPUTE-NEW-META-ASSERTION-ASSERTIBLES", 4, 0, false);
        declareFunction("extract_old_meta_assertion_info", "EXTRACT-OLD-META-ASSERTION-INFO", 1, 0, false);
        declareFunction("ke_edit_assertion_strings", "KE-EDIT-ASSERTION-STRINGS", 2, 1, false);
        declareFunction("ke_recanonicalize_assertion", "KE-RECANONICALIZE-ASSERTION", 1, 1, false);
        declareFunction("ke_recanonicalize_assertion_now", "KE-RECANONICALIZE-ASSERTION-NOW", 1, 1, false);
        declareFunction("ke_edit_assertion_but_not_bookkeeping", "KE-EDIT-ASSERTION-BUT-NOT-BOOKKEEPING", 2, 4, false);
        declareFunction("ke_edit_assertion_now_but_not_bookkeeping", "KE-EDIT-ASSERTION-NOW-BUT-NOT-BOOKKEEPING", 2, 4, false);
        declareFunction("formulas_differ_only_in_strings", "FORMULAS-DIFFER-ONLY-IN-STRINGS", 2, 0, false);
        declareFunction("tree_equal_ignoring_type", "TREE-EQUAL-IGNORING-TYPE", 3, 1, false);
        declareFunction("ke_blast", "KE-BLAST", 2, 0, false);
        declareFunction("ke_blast_assertion", "KE-BLAST-ASSERTION", 1, 0, false);
        declareFunction("ke_rename_variables", "KE-RENAME-VARIABLES", 3, 0, false);
        declareFunction("ke_remove_argument", "KE-REMOVE-ARGUMENT", 3, 0, false);
        declareFunction("ke_remove_deduction", "KE-REMOVE-DEDUCTION", 1, 0, false);
        declareFunction("ke_tms_reconsider_term", "KE-TMS-RECONSIDER-TERM", 1, 1, false);
        declareFunction("ke_tms_reconsider_formula", "KE-TMS-RECONSIDER-FORMULA", 2, 0, false);
        declareFunction("ke_tms_reconsider_assertion", "KE-TMS-RECONSIDER-ASSERTION", 1, 0, false);
        declareFunction("ke_blast_all_dependents", "KE-BLAST-ALL-DEPENDENTS", 1, 0, false);
        declareFunction("ke_change_assertion_direction", "KE-CHANGE-ASSERTION-DIRECTION", 2, 0, false);
        declareFunction("ke_change_assertion_strength", "KE-CHANGE-ASSERTION-STRENGTH", 2, 0, false);
        declareFunction("ke_change_assertion_mt", "KE-CHANGE-ASSERTION-MT", 2, 1, false);
        declareFunction("ke_convert_assertion", "KE-CONVERT-ASSERTION", 2, 2, false);
        declareFunction("old_constant_names", "OLD-CONSTANT-NAMES", 1, 0, false);
        declareFunction("initialize_old_constant_names", "INITIALIZE-OLD-CONSTANT-NAMES", 0, 0, false);
        declareFunction("cache_old_constant_name", "CACHE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction("decache_old_constant_name", "DECACHE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction("do_edit_op", "DO-EDIT-OP", 1, 0, false);
        declareFunction("find_assertions_via_tl", "FIND-ASSERTIONS-VIA-TL", 2, 0, false);
        declareFunction("ke_assertion_edit_formula", "KE-ASSERTION-EDIT-FORMULA", 1, 0, false);
        declareFunction("ke_assertion_find_formula", "KE-ASSERTION-FIND-FORMULA", 1, 0, false);
        declareFunction("cyclist_is_guest", "CYCLIST-IS-GUEST", 0, 0, false);
        declareFunction("ensure_cyclist_ok", "ENSURE-CYCLIST-OK", 0, 0, false);
        declareFunction("ke_eval_now", "KE-EVAL-NOW", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_ke_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("ke_create", "KE-CREATE", 1, 0, false);
            declareFunction("ke_create_from_serialization", "KE-CREATE-FROM-SERIALIZATION", 2, 0, false);
            declareFunction("ke_create_internal", "KE-CREATE-INTERNAL", 1, 1, false);
            declareFunction("ke_create_now", "KE-CREATE-NOW", 1, 1, false);
            declareFunction("ke_find_or_create_now", "KE-FIND-OR-CREATE-NOW", 1, 1, false);
            declareFunction("ke_recreate_now", "KE-RECREATE-NOW", 1, 0, false);
            declareFunction("ke_merge", "KE-MERGE", 2, 0, false);
            declareFunction("ke_merge_now", "KE-MERGE-NOW", 2, 0, false);
            declareFunction("ke_kill", "KE-KILL", 1, 0, false);
            declareFunction("ke_kill_now", "KE-KILL-NOW", 1, 0, false);
            declareFunction("ke_recreate", "KE-RECREATE", 1, 0, false);
            declareFunction("rename_code_constant", "RENAME-CODE-CONSTANT", 2, 0, false);
            declareFunction("ke_rename", "KE-RENAME", 2, 0, false);
            declareFunction("ke_rename_code_constant", "KE-RENAME-CODE-CONSTANT", 2, 0, false);
            declareFunction("ke_rename_internal", "KE-RENAME-INTERNAL", 2, 0, false);
            declareFunction("note_old_constant_name", "NOTE-OLD-CONSTANT-NAME", 2, 0, false);
            declareFunction("ke_rename_now", "KE-RENAME-NOW", 2, 0, false);
            declareFunction("ke_assert", "KE-ASSERT", 2, 2, false);
            declareFunction("ke_reassert_assertion_now", "KE-REASSERT-ASSERTION-NOW", 3, 0, false);
            declareFunction("ke_reassert_assertion_now_int", "KE-REASSERT-ASSERTION-NOW-INT", 3, 0, false);
            declareFunction("ke_reassert_assertion", "KE-REASSERT-ASSERTION", 3, 0, false);
            declareFunction("ke_reassert_assertion_int", "KE-REASSERT-ASSERTION-INT", 3, 0, false);
            declareFunction("ke_repropagate_assertion_now", "KE-REPROPAGATE-ASSERTION-NOW", 1, 0, false);
            declareFunction("ke_repropagate_assertion", "KE-REPROPAGATE-ASSERTION", 1, 0, false);
            declareFunction("ke_repropagate_assertion_now_int", "KE-REPROPAGATE-ASSERTION-NOW-INT", 1, 0, false);
            declareFunction("ke_repropagate_assertion_int", "KE-REPROPAGATE-ASSERTION-INT", 1, 0, false);
            declareFunction("ke_assert_now", "KE-ASSERT-NOW", 2, 2, false);
            declareFunction("ke_assert_wff_now", "KE-ASSERT-WFF-NOW", 2, 2, false);
            declareFunction("ke_assert_now_and_propagate_later", "KE-ASSERT-NOW-AND-PROPAGATE-LATER", 2, 2, false);
            declareFunction("ke_assert_now_int", "KE-ASSERT-NOW-INT", 4, 1, false);
            declareFunction("ke_assert_with_implicature", "KE-ASSERT-WITH-IMPLICATURE", 2, 2, false);
            declareFunction("ke_assert_now_with_implicature", "KE-ASSERT-NOW-WITH-IMPLICATURE", 2, 2, false);
            declareFunction("ke_assert_with_implicature_int", "KE-ASSERT-WITH-IMPLICATURE-INT", 5, 0, false);
            declareFunction("ke_assert_with_implicature_int_assert", "KE-ASSERT-WITH-IMPLICATURE-INT-ASSERT", 5, 0, false);
            declareFunction("ke_unassert", "KE-UNASSERT", 2, 0, false);
            declareFunction("ke_unassert_assertion", "KE-UNASSERT-ASSERTION", 1, 0, false);
            declareFunction("ke_unassert_now", "KE-UNASSERT-NOW", 2, 0, false);
            declareFunction("ke_unassert_assertion_now", "KE-UNASSERT-ASSERTION-NOW", 1, 0, false);
            declareFunction("ke_edit", "KE-EDIT", 3, 3, false);
            declareFunction("ke_edit_now", "KE-EDIT-NOW", 3, 3, false);
            declareFunction("ke_edit_assertion", "KE-EDIT-ASSERTION", 2, 3, false);
            declareFunction("ke_edit_assertion_preserving_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS", 3, 3, false);
            declareFunction("ke_edit_assertion_now_preserving_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-META-ASSERTIONS", 3, 3, false);
            declareFunction("ke_edit_assertion_preserving_meta_assertions_int", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS-INT", 7, 0, false);
            declareFunction("ke_edit_assertion_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
            declareFunction("ke_edit_assertion_now_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
            declareFunction("ke_null_edit_assertion", "KE-NULL-EDIT-ASSERTION", 1, 0, false);
            declareFunction("ke_edit_compute_new_meta_assertion_assertibles", "KE-EDIT-COMPUTE-NEW-META-ASSERTION-ASSERTIBLES", 4, 0, false);
            declareFunction("extract_old_meta_assertion_info", "EXTRACT-OLD-META-ASSERTION-INFO", 1, 0, false);
            declareFunction("ke_add_assertion_original_text", "KE-ADD-ASSERTION-ORIGINAL-TEXT", 3, 1, false);
            declareFunction("ke_edit_assertion_strings", "KE-EDIT-ASSERTION-STRINGS", 2, 1, false);
            declareFunction("ke_recanonicalize_assertion", "KE-RECANONICALIZE-ASSERTION", 1, 1, false);
            declareFunction("ke_recanonicalize_assertion_now", "KE-RECANONICALIZE-ASSERTION-NOW", 1, 1, false);
            declareFunction("ke_edit_assertion_but_not_bookkeeping", "KE-EDIT-ASSERTION-BUT-NOT-BOOKKEEPING", 2, 4, false);
            declareFunction("ke_edit_assertion_now_but_not_bookkeeping", "KE-EDIT-ASSERTION-NOW-BUT-NOT-BOOKKEEPING", 2, 4, false);
            declareFunction("formulas_differ_only_in_strings", "FORMULAS-DIFFER-ONLY-IN-STRINGS", 2, 1, false);
            declareFunction("tree_equal_ignoring_type", "TREE-EQUAL-IGNORING-TYPE", 3, 1, false);
            declareFunction("ke_blast", "KE-BLAST", 2, 0, false);
            declareFunction("ke_blast_assertion", "KE-BLAST-ASSERTION", 1, 0, false);
            declareFunction("ke_rename_variables", "KE-RENAME-VARIABLES", 3, 0, false);
            declareFunction("ke_add_argument", "KE-ADD-ARGUMENT", 3, 2, false);
            declareFunction("ke_add_argument_now", "KE-ADD-ARGUMENT-NOW", 3, 3, false);
            declareFunction("ke_remove_argument", "KE-REMOVE-ARGUMENT", 3, 0, false);
            declareFunction("ke_remove_deduction", "KE-REMOVE-DEDUCTION", 1, 0, false);
            declareFunction("ke_tms_reconsider_term", "KE-TMS-RECONSIDER-TERM", 1, 1, false);
            declareFunction("ke_tms_reconsider_formula", "KE-TMS-RECONSIDER-FORMULA", 2, 0, false);
            declareFunction("ke_tms_reconsider_formula_now", "KE-TMS-RECONSIDER-FORMULA-NOW", 2, 0, false);
            declareFunction("ke_tms_reconsider_formula_now_int", "KE-TMS-RECONSIDER-FORMULA-NOW-INT", 2, 0, false);
            declareFunction("ke_tms_reconsider_assertion", "KE-TMS-RECONSIDER-ASSERTION", 1, 0, false);
            declareFunction("ke_tms_reconsider_assertion_now", "KE-TMS-RECONSIDER-ASSERTION-NOW", 1, 0, false);
            declareFunction("ke_blast_all_dependents", "KE-BLAST-ALL-DEPENDENTS", 1, 0, false);
            declareFunction("ke_change_assertion_direction", "KE-CHANGE-ASSERTION-DIRECTION", 2, 0, false);
            declareFunction("ke_shoehorn_rule_forward", "KE-SHOEHORN-RULE-FORWARD", 1, 0, false);
            declareFunction("ke_change_assertion_strength", "KE-CHANGE-ASSERTION-STRENGTH", 2, 0, false);
            declareFunction("ke_change_assertion_mt", "KE-CHANGE-ASSERTION-MT", 2, 1, false);
            declareFunction("ke_convert_assertion", "KE-CONVERT-ASSERTION", 2, 2, false);
            declareFunction("old_constant_names", "OLD-CONSTANT-NAMES", 1, 0, false);
            declareFunction("initialize_old_constant_names", "INITIALIZE-OLD-CONSTANT-NAMES", 0, 0, false);
            declareFunction("cache_old_constant_name", "CACHE-OLD-CONSTANT-NAME", 2, 0, false);
            declareFunction("decache_old_constant_name", "DECACHE-OLD-CONSTANT-NAME", 2, 0, false);
            declareFunction("do_edit_op", "DO-EDIT-OP", 1, 0, false);
            declareFunction("find_assertions_via_tl", "FIND-ASSERTIONS-VIA-TL", 2, 0, false);
            declareFunction("ke_assertion_edit_formula", "KE-ASSERTION-EDIT-FORMULA", 1, 0, false);
            declareFunction("ke_assertion_find_formula", "KE-ASSERTION-FIND-FORMULA", 1, 0, false);
            declareFunction("cyclist_is_guest", "CYCLIST-IS-GUEST", 0, 0, false);
            declareFunction("ensure_cyclist_ok", "ENSURE-CYCLIST-OK", 0, 0, false);
            declareFunction("ke_eval_now", "KE-EVAL-NOW", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("ke_assert_now_int", "KE-ASSERT-NOW-INT", 5, 0, false);
            declareFunction("formulas_differ_only_in_strings", "FORMULAS-DIFFER-ONLY-IN-STRINGS", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_ke_file_Previous() {
        declareFunction("ke_create", "KE-CREATE", 1, 0, false);
        declareFunction("ke_create_from_serialization", "KE-CREATE-FROM-SERIALIZATION", 2, 0, false);
        declareFunction("ke_create_internal", "KE-CREATE-INTERNAL", 1, 1, false);
        declareFunction("ke_create_now", "KE-CREATE-NOW", 1, 1, false);
        declareFunction("ke_find_or_create_now", "KE-FIND-OR-CREATE-NOW", 1, 1, false);
        declareFunction("ke_recreate_now", "KE-RECREATE-NOW", 1, 0, false);
        declareFunction("ke_merge", "KE-MERGE", 2, 0, false);
        declareFunction("ke_merge_now", "KE-MERGE-NOW", 2, 0, false);
        declareFunction("ke_kill", "KE-KILL", 1, 0, false);
        declareFunction("ke_kill_now", "KE-KILL-NOW", 1, 0, false);
        declareFunction("ke_recreate", "KE-RECREATE", 1, 0, false);
        declareFunction("rename_code_constant", "RENAME-CODE-CONSTANT", 2, 0, false);
        declareFunction("ke_rename", "KE-RENAME", 2, 0, false);
        declareFunction("ke_rename_code_constant", "KE-RENAME-CODE-CONSTANT", 2, 0, false);
        declareFunction("ke_rename_internal", "KE-RENAME-INTERNAL", 2, 0, false);
        declareFunction("note_old_constant_name", "NOTE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction("ke_rename_now", "KE-RENAME-NOW", 2, 0, false);
        declareFunction("ke_assert", "KE-ASSERT", 2, 2, false);
        declareFunction("ke_reassert_assertion_now", "KE-REASSERT-ASSERTION-NOW", 3, 0, false);
        declareFunction("ke_reassert_assertion_now_int", "KE-REASSERT-ASSERTION-NOW-INT", 3, 0, false);
        declareFunction("ke_reassert_assertion", "KE-REASSERT-ASSERTION", 3, 0, false);
        declareFunction("ke_reassert_assertion_int", "KE-REASSERT-ASSERTION-INT", 3, 0, false);
        declareFunction("ke_repropagate_assertion_now", "KE-REPROPAGATE-ASSERTION-NOW", 1, 0, false);
        declareFunction("ke_repropagate_assertion", "KE-REPROPAGATE-ASSERTION", 1, 0, false);
        declareFunction("ke_repropagate_assertion_now_int", "KE-REPROPAGATE-ASSERTION-NOW-INT", 1, 0, false);
        declareFunction("ke_repropagate_assertion_int", "KE-REPROPAGATE-ASSERTION-INT", 1, 0, false);
        declareFunction("ke_assert_now", "KE-ASSERT-NOW", 2, 2, false);
        declareFunction("ke_assert_wff_now", "KE-ASSERT-WFF-NOW", 2, 2, false);
        declareFunction("ke_assert_now_and_propagate_later", "KE-ASSERT-NOW-AND-PROPAGATE-LATER", 2, 2, false);
        declareFunction("ke_assert_now_int", "KE-ASSERT-NOW-INT", 4, 1, false);
        declareFunction("ke_assert_with_implicature", "KE-ASSERT-WITH-IMPLICATURE", 2, 2, false);
        declareFunction("ke_assert_now_with_implicature", "KE-ASSERT-NOW-WITH-IMPLICATURE", 2, 2, false);
        declareFunction("ke_assert_with_implicature_int", "KE-ASSERT-WITH-IMPLICATURE-INT", 5, 0, false);
        declareFunction("ke_assert_with_implicature_int_assert", "KE-ASSERT-WITH-IMPLICATURE-INT-ASSERT", 5, 0, false);
        declareFunction("ke_unassert", "KE-UNASSERT", 2, 0, false);
        declareFunction("ke_unassert_assertion", "KE-UNASSERT-ASSERTION", 1, 0, false);
        declareFunction("ke_unassert_now", "KE-UNASSERT-NOW", 2, 0, false);
        declareFunction("ke_unassert_assertion_now", "KE-UNASSERT-ASSERTION-NOW", 1, 0, false);
        declareFunction("ke_edit", "KE-EDIT", 3, 3, false);
        declareFunction("ke_edit_now", "KE-EDIT-NOW", 3, 3, false);
        declareFunction("ke_edit_assertion", "KE-EDIT-ASSERTION", 2, 3, false);
        declareFunction("ke_edit_assertion_preserving_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS", 3, 3, false);
        declareFunction("ke_edit_assertion_now_preserving_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-META-ASSERTIONS", 3, 3, false);
        declareFunction("ke_edit_assertion_preserving_meta_assertions_int", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS-INT", 7, 0, false);
        declareFunction("ke_edit_assertion_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
        declareFunction("ke_edit_assertion_now_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
        declareFunction("ke_null_edit_assertion", "KE-NULL-EDIT-ASSERTION", 1, 0, false);
        declareFunction("ke_edit_compute_new_meta_assertion_assertibles", "KE-EDIT-COMPUTE-NEW-META-ASSERTION-ASSERTIBLES", 4, 0, false);
        declareFunction("extract_old_meta_assertion_info", "EXTRACT-OLD-META-ASSERTION-INFO", 1, 0, false);
        declareFunction("ke_add_assertion_original_text", "KE-ADD-ASSERTION-ORIGINAL-TEXT", 3, 1, false);
        declareFunction("ke_edit_assertion_strings", "KE-EDIT-ASSERTION-STRINGS", 2, 1, false);
        declareFunction("ke_recanonicalize_assertion", "KE-RECANONICALIZE-ASSERTION", 1, 1, false);
        declareFunction("ke_recanonicalize_assertion_now", "KE-RECANONICALIZE-ASSERTION-NOW", 1, 1, false);
        declareFunction("ke_edit_assertion_but_not_bookkeeping", "KE-EDIT-ASSERTION-BUT-NOT-BOOKKEEPING", 2, 4, false);
        declareFunction("ke_edit_assertion_now_but_not_bookkeeping", "KE-EDIT-ASSERTION-NOW-BUT-NOT-BOOKKEEPING", 2, 4, false);
        declareFunction("formulas_differ_only_in_strings", "FORMULAS-DIFFER-ONLY-IN-STRINGS", 2, 1, false);
        declareFunction("tree_equal_ignoring_type", "TREE-EQUAL-IGNORING-TYPE", 3, 1, false);
        declareFunction("ke_blast", "KE-BLAST", 2, 0, false);
        declareFunction("ke_blast_assertion", "KE-BLAST-ASSERTION", 1, 0, false);
        declareFunction("ke_rename_variables", "KE-RENAME-VARIABLES", 3, 0, false);
        declareFunction("ke_add_argument", "KE-ADD-ARGUMENT", 3, 2, false);
        declareFunction("ke_add_argument_now", "KE-ADD-ARGUMENT-NOW", 3, 3, false);
        declareFunction("ke_remove_argument", "KE-REMOVE-ARGUMENT", 3, 0, false);
        declareFunction("ke_remove_deduction", "KE-REMOVE-DEDUCTION", 1, 0, false);
        declareFunction("ke_tms_reconsider_term", "KE-TMS-RECONSIDER-TERM", 1, 1, false);
        declareFunction("ke_tms_reconsider_formula", "KE-TMS-RECONSIDER-FORMULA", 2, 0, false);
        declareFunction("ke_tms_reconsider_formula_now", "KE-TMS-RECONSIDER-FORMULA-NOW", 2, 0, false);
        declareFunction("ke_tms_reconsider_formula_now_int", "KE-TMS-RECONSIDER-FORMULA-NOW-INT", 2, 0, false);
        declareFunction("ke_tms_reconsider_assertion", "KE-TMS-RECONSIDER-ASSERTION", 1, 0, false);
        declareFunction("ke_tms_reconsider_assertion_now", "KE-TMS-RECONSIDER-ASSERTION-NOW", 1, 0, false);
        declareFunction("ke_blast_all_dependents", "KE-BLAST-ALL-DEPENDENTS", 1, 0, false);
        declareFunction("ke_change_assertion_direction", "KE-CHANGE-ASSERTION-DIRECTION", 2, 0, false);
        declareFunction("ke_shoehorn_rule_forward", "KE-SHOEHORN-RULE-FORWARD", 1, 0, false);
        declareFunction("ke_change_assertion_strength", "KE-CHANGE-ASSERTION-STRENGTH", 2, 0, false);
        declareFunction("ke_change_assertion_mt", "KE-CHANGE-ASSERTION-MT", 2, 1, false);
        declareFunction("ke_convert_assertion", "KE-CONVERT-ASSERTION", 2, 2, false);
        declareFunction("old_constant_names", "OLD-CONSTANT-NAMES", 1, 0, false);
        declareFunction("initialize_old_constant_names", "INITIALIZE-OLD-CONSTANT-NAMES", 0, 0, false);
        declareFunction("cache_old_constant_name", "CACHE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction("decache_old_constant_name", "DECACHE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction("do_edit_op", "DO-EDIT-OP", 1, 0, false);
        declareFunction("find_assertions_via_tl", "FIND-ASSERTIONS-VIA-TL", 2, 0, false);
        declareFunction("ke_assertion_edit_formula", "KE-ASSERTION-EDIT-FORMULA", 1, 0, false);
        declareFunction("ke_assertion_find_formula", "KE-ASSERTION-FIND-FORMULA", 1, 0, false);
        declareFunction("cyclist_is_guest", "CYCLIST-IS-GUEST", 0, 0, false);
        declareFunction("ensure_cyclist_ok", "ENSURE-CYCLIST-OK", 0, 0, false);
        declareFunction("ke_eval_now", "KE-EVAL-NOW", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt31 = list(makeSymbol("BOOLEANP"), makeSymbol("LISTP"));

    static private final SubLString $str_alt33$Constant__S_cannot_be_renamed_bec = makeString("Constant ~S cannot be renamed because it is mentioned in code");

    static private final SubLString $str_alt34$Use_KE_RENAME = makeString("Use KE-RENAME");

    static private final SubLString $str_alt35$Constant__S_is_not_mentioned_in_c = makeString("Constant ~S is not mentioned in code");

    static private final SubLList $list_alt50 = list(makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));

    static private final SubLString $str_alt51$Assert_FORMULA_in_MT_now_and_add_ = makeString("Assert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    static private final SubLString $str_alt53$Assert_FORMULA_in_MT_now_and_add_ = makeString("Assert FORMULA in MT now and add operation to transcript.\nFORMULA is assumed to be WFF.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    static private final SubLString $str_alt58$Sentence__S_in_mt__S__is_not_in_t = makeString("Sentence ~S in mt ~S~%is not in the KB and you are trying to unassert it.");

    static private final SubLList $list_alt60 = list(makeSymbol("FORMULA"), makeSymbol("MT"));

    static private final SubLString $str_alt61$Unassert_FORMULA_in_MT_now_and_ad = makeString("Unassert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    static private final SubLString $str_alt64$KE_EDIT_NOW_does_not_yet_use_FI_E = makeString("KE-EDIT-NOW does not yet use FI-EDIT");

    static private final SubLList $list_alt66 = list(makeSymbol("NEW-META-ASSERTION-EL-FORMULA"), makeSymbol("NEW-META-ASSERTION-MT"), makeSymbol("NEW-META-ASSERTION-STRENGTH"), makeSymbol("NEW-META-ASSERTION-DIRECTION"));

    static private final SubLList $list_alt69 = list(makeSymbol("OLD-META-ASSERTION"), makeSymbol("&OPTIONAL"), makeSymbol("NEW-META-ASSERTION-MT"));

    static private final SubLString $str_alt70$Sentences_do_not_differ_only_in_s = makeString("Sentences do not differ only in strings");

    static private final SubLString $str_alt83$Initializing_old_constant_name_ta = makeString("Initializing old constant name table");



    static private final SubLString $str_alt89$KB_editing_is_not_allowed_for_use = makeString("KB editing is not allowed for users logged in as #$Guest.");

    public static final SubLObject init_ke_file_alt() {
        defparameter("*NOTE-MERGED-CONSTANT-NAME*", T);
        defparameter("*NOTE-OLD-CONSTANT-NAME*", T);
        defparameter("*CHECK-IF-ALREADY-KE-UNASSERTED?*", NIL);
        deflexical("*KE-EDIT-USE-FI-EDIT*", NIL != boundp($ke_edit_use_fi_edit$) ? ((SubLObject) ($ke_edit_use_fi_edit$.getGlobalValue())) : NIL);
        deflexical("*OLD-CONSTANT-NAMES-TABLE*", NIL != boundp($old_constant_names_table$) ? ((SubLObject) ($old_constant_names_table$.getGlobalValue())) : NIL);
        defparameter("*KE-ASSERTION-EDIT-FORMULA-FIND-FUNC*", ASSERTION_TL_IST_FORMULA);
        defparameter("*KE-ASSERTION-EDIT-FORMULA-DISPLAY-FUNC*", ASSERTION_EL_FORMULA);
        return NIL;
    }

    public static SubLObject init_ke_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*NOTE-MERGED-CONSTANT-NAME*", T);
            defparameter("*NOTE-OLD-CONSTANT-NAME*", T);
            defparameter("*KE-ASSERT-NOW-ASSUME-WFF-TEST*", FALSE);
            defparameter("*CHECK-IF-ALREADY-KE-UNASSERTED?*", NIL);
            deflexical("*KE-EDIT-USE-FI-EDIT*", SubLTrampolineFile.maybeDefault($ke_edit_use_fi_edit$, $ke_edit_use_fi_edit$, T));
            defparameter("*KE-ADD-ASSERTION-ORIGINAL-TEXT?*", NIL);
            deflexical("*OLD-CONSTANT-NAMES-TABLE*", SubLTrampolineFile.maybeDefault($old_constant_names_table$, $old_constant_names_table$, NIL));
            defparameter("*KE-ASSERTION-EDIT-FORMULA-FIND-FUNC*", ASSERTION_TL_IST_FORMULA);
            defparameter("*KE-ASSERTION-EDIT-FORMULA-DISPLAY-FUNC*", ASSERTION_EL_FORMULA);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*KE-EDIT-USE-FI-EDIT*", NIL != boundp($ke_edit_use_fi_edit$) ? ((SubLObject) ($ke_edit_use_fi_edit$.getGlobalValue())) : NIL);
            deflexical("*OLD-CONSTANT-NAMES-TABLE*", NIL != boundp($old_constant_names_table$) ? ((SubLObject) ($old_constant_names_table$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_ke_file_Previous() {
        defparameter("*NOTE-MERGED-CONSTANT-NAME*", T);
        defparameter("*NOTE-OLD-CONSTANT-NAME*", T);
        defparameter("*KE-ASSERT-NOW-ASSUME-WFF-TEST*", FALSE);
        defparameter("*CHECK-IF-ALREADY-KE-UNASSERTED?*", NIL);
        deflexical("*KE-EDIT-USE-FI-EDIT*", SubLTrampolineFile.maybeDefault($ke_edit_use_fi_edit$, $ke_edit_use_fi_edit$, T));
        defparameter("*KE-ADD-ASSERTION-ORIGINAL-TEXT?*", NIL);
        deflexical("*OLD-CONSTANT-NAMES-TABLE*", SubLTrampolineFile.maybeDefault($old_constant_names_table$, $old_constant_names_table$, NIL));
        defparameter("*KE-ASSERTION-EDIT-FORMULA-FIND-FUNC*", ASSERTION_TL_IST_FORMULA);
        defparameter("*KE-ASSERTION-EDIT-FORMULA-DISPLAY-FUNC*", ASSERTION_EL_FORMULA);
        return NIL;
    }

    public static final SubLObject setup_ke_file_alt() {
        register_external_symbol(KE_CREATE);
        register_cyc_api_function(KE_CREATE_NOW, $list_alt12, $str_alt13$Create_new_constant_now_and_add_o, NIL, $list_alt14);
        register_external_symbol(KE_MERGE);
        register_external_symbol(KE_KILL);
        register_cyc_api_function(KE_KILL_NOW, $list_alt29, $str_alt30$Kill_FORT_now_and_add_operation_t, NIL, $list_alt31);
        register_external_symbol(KE_ASSERT);
        register_cyc_api_function(KE_ASSERT_NOW, $list_alt50, $str_alt51$Assert_FORMULA_in_MT_now_and_add_, NIL, $list_alt31);
        register_cyc_api_function(KE_ASSERT_WFF_NOW, $list_alt50, $str_alt53$Assert_FORMULA_in_MT_now_and_add_, NIL, $list_alt31);
        register_external_symbol(KE_UNASSERT);
        register_cyc_api_function(KE_UNASSERT_NOW, $list_alt60, $str_alt61$Unassert_FORMULA_in_MT_now_and_ad, NIL, $list_alt31);
        declare_defglobal($ke_edit_use_fi_edit$);
        register_external_symbol(KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS);
        declare_defglobal($old_constant_names_table$);
        return NIL;
    }

    public static SubLObject setup_ke_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(KE_CREATE);
            register_cyc_api_function(KE_CREATE_NOW, $list12, $str13$Create_new_constant_now_and_add_o, NIL, $list14);
            register_external_symbol(KE_MERGE);
            register_external_symbol(KE_KILL);
            register_cyc_api_function(KE_KILL_NOW, $list29, $str30$Kill_FORT_now_and_add_operation_t, NIL, $list31);
            register_external_symbol(KE_ASSERT);
            register_cyc_api_function(KE_ASSERT_NOW, $list51, $str52$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
            register_cyc_api_function(KE_ASSERT_WFF_NOW, $list51, $str55$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
            register_cyc_api_function(KE_ASSERT_NOW_AND_PROPAGATE_LATER, $list51, $str57$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
            register_external_symbol(KE_UNASSERT);
            register_cyc_api_function(KE_UNASSERT_NOW, $list66, $str67$Unassert_FORMULA_in_MT_now_and_ad, NIL, $list31);
            declare_defglobal($ke_edit_use_fi_edit$);
            register_cyc_api_function(KE_EDIT, $list71, $str72$Add_to_the_agenda_operations_that, NIL, $list73);
            register_cyc_api_function(KE_EDIT_NOW, $list71, $str75$Immediately_remove_OLD_FORMULA_an, NIL, NIL);
            register_external_symbol(KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS);
            declare_defglobal($old_constant_names_table$);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(KE_ASSERT_NOW, $list_alt50, $str_alt51$Assert_FORMULA_in_MT_now_and_add_, NIL, $list_alt31);
            register_cyc_api_function(KE_ASSERT_WFF_NOW, $list_alt50, $str_alt53$Assert_FORMULA_in_MT_now_and_add_, NIL, $list_alt31);
            register_cyc_api_function(KE_UNASSERT_NOW, $list_alt60, $str_alt61$Unassert_FORMULA_in_MT_now_and_ad, NIL, $list_alt31);
        }
        return NIL;
    }

    public static SubLObject setup_ke_file_Previous() {
        register_external_symbol(KE_CREATE);
        register_cyc_api_function(KE_CREATE_NOW, $list12, $str13$Create_new_constant_now_and_add_o, NIL, $list14);
        register_external_symbol(KE_MERGE);
        register_external_symbol(KE_KILL);
        register_cyc_api_function(KE_KILL_NOW, $list29, $str30$Kill_FORT_now_and_add_operation_t, NIL, $list31);
        register_external_symbol(KE_ASSERT);
        register_cyc_api_function(KE_ASSERT_NOW, $list51, $str52$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
        register_cyc_api_function(KE_ASSERT_WFF_NOW, $list51, $str55$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
        register_cyc_api_function(KE_ASSERT_NOW_AND_PROPAGATE_LATER, $list51, $str57$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
        register_external_symbol(KE_UNASSERT);
        register_cyc_api_function(KE_UNASSERT_NOW, $list66, $str67$Unassert_FORMULA_in_MT_now_and_ad, NIL, $list31);
        declare_defglobal($ke_edit_use_fi_edit$);
        register_cyc_api_function(KE_EDIT, $list71, $str72$Add_to_the_agenda_operations_that, NIL, $list73);
        register_cyc_api_function(KE_EDIT_NOW, $list71, $str75$Immediately_remove_OLD_FORMULA_an, NIL, NIL);
        register_external_symbol(KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS);
        declare_defglobal($old_constant_names_table$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ke_file();
    }

    @Override
    public void initializeVariables() {
        init_ke_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ke_file();
    }

    static {
    }
}

/**
 * Total time: 1037 ms
 */
