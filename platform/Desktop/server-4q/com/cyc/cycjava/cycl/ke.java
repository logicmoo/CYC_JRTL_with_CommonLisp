package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ke extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ke";
    public static final String myFingerPrint = "b0d0cda1335bbfa62addbd27cfaac1ad67d219b67e32d5799bf343f067ac17f9";
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 5478L)
    public static SubLSymbol $note_merged_constant_name$;
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 11128L)
    public static SubLSymbol $note_old_constant_name$;
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 21152L)
    public static SubLSymbol $ke_assert_now_assume_wff_test$;
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 24210L)
    public static SubLSymbol $check_if_already_ke_unassertedP$;
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 26490L)
    private static SubLSymbol $ke_edit_use_fi_edit$;
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 36314L)
    private static SubLSymbol $ke_add_assertion_original_textP$;
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 49504L)
    static SubLSymbol $old_constant_names_table$;
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 51634L)
    private static SubLSymbol $ke_assertion_edit_formula_find_func$;
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 51766L)
    private static SubLSymbol $ke_assertion_edit_formula_display_func$;
    private static final SubLSymbol $sym0$KE_CREATE;
    private static final SubLSymbol $kw1$QUEUED;
    private static final SubLSymbol $sym2$FI_TIMESTAMP_CONSTANT;
    private static final SubLSymbol $sym3$QUOTE;
    private static final SubLSymbol $sym4$FI_CREATE;
    private static final SubLSymbol $sym5$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw6$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym7$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw8$FATAL_ERROR;
    private static final SubLSymbol $sym9$FORMAT;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$KE_CREATE_NOW;
    private static final SubLList $list12;
    private static final SubLString $str13$Create_new_constant_now_and_add_o;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$KE_MERGE;
    private static final SubLString $str16$Skip_this_operation;
    private static final SubLString $str17$Constant__S_cannot_be_merged_beca;
    private static final SubLSymbol $sym18$FI_MERGE;
    private static final SubLObject $const19$mergedConstantName;
    private static final SubLObject $const20$BookkeepingMt;
    private static final SubLObject $const21$mergedConstantGUID;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $kw24$GAF;
    private static final SubLSymbol $sym25$KE_KILL;
    private static final SubLSymbol $sym26$FI_KILL;
    private static final SubLString $str27$Constant__S_cannot_be_killed_beca;
    private static final SubLSymbol $sym28$KE_KILL_NOW;
    private static final SubLList $list29;
    private static final SubLString $str30$Kill_FORT_now_and_add_operation_t;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$STRINGP;
    private static final SubLString $str33$Constant__S_cannot_be_renamed_bec;
    private static final SubLString $str34$Use_KE_RENAME;
    private static final SubLString $str35$Constant__S_is_not_mentioned_in_c;
    private static final SubLSymbol $sym36$FI_RENAME;
    private static final SubLSymbol $sym37$CONSTANT_P;
    private static final SubLObject $const38$oldConstantName;
    private static final SubLSymbol $sym39$KE_ASSERT;
    private static final SubLSymbol $kw40$DEFAULT;
    private static final SubLSymbol $sym41$FI_ASSERT;
    private static final SubLSymbol $sym42$FI_TIMESTAMP_ASSERTION;
    private static final SubLSymbol $sym43$ASSERTION_P;
    private static final SubLSymbol $sym44$EL_STRENGTH_P;
    private static final SubLSymbol $sym45$DIRECTION_P;
    private static final SubLSymbol $sym46$FI_REASSERT;
    private static final SubLSymbol $sym47$FI_REASSERT_INT;
    private static final SubLSymbol $kw48$BACKWARD;
    private static final SubLSymbol $kw49$FORWARD;
    private static final SubLSymbol $sym50$KE_ASSERT_NOW;
    private static final SubLList $list51;
    private static final SubLString $str52$Assert_FORMULA_in_MT_now_and_add_;
    private static final SubLSymbol $sym53$TRUE;
    private static final SubLSymbol $sym54$KE_ASSERT_WFF_NOW;
    private static final SubLString $str55$Assert_FORMULA_in_MT_now_and_add_;
    private static final SubLSymbol $sym56$KE_ASSERT_NOW_AND_PROPAGATE_LATER;
    private static final SubLString $str57$Assert_FORMULA_in_MT_now_and_add_;
    private static final SubLSymbol $sym58$FALSE;
    private static final SubLSymbol $sym59$QUEUE_P;
    private static final SubLSymbol $kw60$STRENGTH;
    private static final SubLSymbol $kw61$DIRECTION;
    private static final SubLSymbol $sym62$KE_UNASSERT;
    private static final SubLSymbol $sym63$FI_UNASSERT;
    private static final SubLString $str64$Sentence__S_in_mt__S__is_not_in_t;
    private static final SubLSymbol $sym65$KE_UNASSERT_NOW;
    private static final SubLList $list66;
    private static final SubLString $str67$Unassert_FORMULA_in_MT_now_and_ad;
    private static final SubLSymbol $sym68$_KE_EDIT_USE_FI_EDIT_;
    private static final SubLSymbol $sym69$FI_EDIT;
    private static final SubLSymbol $sym70$KE_EDIT;
    private static final SubLList $list71;
    private static final SubLString $str72$Add_to_the_agenda_operations_that;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$KE_EDIT_NOW;
    private static final SubLString $str75$Immediately_remove_OLD_FORMULA_an;
    private static final SubLSymbol $kw76$ALL;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS;
    private static final SubLObject $const79$ist;
    private static final SubLList $list80;
    private static final SubLString $str81$_pre_;
    private static final SubLString $str82$__code_;
    private static final SubLObject $const83$assertionOriginalText;
    private static final SubLString $str84$Sentences_do_not_differ_only_in_s;
    private static final SubLSymbol $sym85$FI_BLAST;
    private static final SubLSymbol $sym86$EL_FORMULA_P;
    private static final SubLSymbol $sym87$ALIST_P;
    private static final SubLSymbol $sym88$FI_RENAME_VARIABLES;
    private static final SubLSymbol $sym89$FI_ADD_ARGUMENT;
    private static final SubLSymbol $kw90$CHECK_WFF_;
    private static final SubLSymbol $sym91$FI_REMOVE_ARGUMENT;
    private static final SubLSymbol $sym92$DEDUCTION_P;
    private static final SubLSymbol $sym93$CONVERT_HL_SUPPORT_TO_TL_SUPPORT;
    private static final SubLSymbol $sym94$FORT_P;
    private static final SubLSymbol $sym95$FI_TMS_RECONSIDER_TERM;
    private static final SubLSymbol $sym96$FI_TMS_RECONSIDER_FORMULA;
    private static final SubLSymbol $sym97$RULE_ASSERTION_;
    private static final SubLObject $const98$pragmaticRequirement;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$HLMT_P;
    private static final SubLSymbol $sym101$_OLD_CONSTANT_NAMES_TABLE_;
    private static final SubLString $str102$Initializing_old_constant_name_ta;
    private static final SubLSymbol $kw103$TRUE;
    private static final SubLSymbol $sym104$ASSERTION_TL_IST_FORMULA;
    private static final SubLSymbol $sym105$ASSERTION_EL_FORMULA;
    private static final SubLSymbol $sym106$ASSERTION_TL_FORMULA;
    private static final SubLString $str107$KB_editing_is_not_allowed_for_use;
    private static final SubLSymbol $kw108$GENERIC_ERROR;
    private static final SubLSymbol $sym109$FI_EVAL;
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 1388L)
    public static SubLObject ke_create(final SubLObject name) {
        return ke_create_internal(name, (SubLObject)ke.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 1540L)
    public static SubLObject ke_create_from_serialization(final SubLObject name, final SubLObject external_id) {
        if (ke.NIL != ensure_cyclist_ok()) {
            final SubLObject ans = fi.fi_create(name, external_id);
            SubLObject error = (SubLObject)ke.NIL;
            if (ans != ke.$kw1$QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym2$FI_TIMESTAMP_CONSTANT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, operation_communication.the_cyclist()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, numeric_date_utilities.get_universal_date((SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED)), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.ke_purpose()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, numeric_date_utilities.get_universal_second((SubLObject)ke.UNPROVIDED))));
            if (ans != ke.$kw1$QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 1981L)
    public static SubLObject ke_create_internal(final SubLObject name, SubLObject external_id) {
        if (external_id == ke.UNPROVIDED) {
            external_id = (SubLObject)ke.NIL;
        }
        if (ke.NIL != ensure_cyclist_ok()) {
            final SubLObject ans = do_edit_op((SubLObject)ConsesLow.listS((SubLObject)ke.$sym4$FI_CREATE, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, name), ConsesLow.append((SubLObject)((ke.NIL != external_id) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, external_id)) : ke.NIL), (SubLObject)ke.NIL)));
            SubLObject error = (SubLObject)ke.NIL;
            if (ans != ke.$kw1$QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym2$FI_TIMESTAMP_CONSTANT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, operation_communication.the_cyclist()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, numeric_date_utilities.get_universal_date((SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED)), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.ke_purpose()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, numeric_date_utilities.get_universal_second((SubLObject)ke.UNPROVIDED))));
            if (ans != ke.$kw1$QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 2482L)
    public static SubLObject ke_create_now(final SubLObject name, SubLObject external_id) {
        if (external_id == ke.UNPROVIDED) {
            external_id = (SubLObject)ke.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)ke.NIL;
        SubLObject error_message = (SubLObject)ke.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject _prev_bind_0_$1 = fi.$fi_last_constant$.currentBinding(thread);
                    try {
                        fi.$fi_last_constant$.bind((SubLObject)ke.NIL, thread);
                        result = fi.fi_create_int(name, external_id);
                    }
                    finally {
                        fi.$fi_last_constant$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (ke.NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate((SubLObject)ConsesLow.list((SubLObject)ke.$sym4$FI_CREATE, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, constants_high.constant_name(result)), constants_high.constant_external_id(result))));
            SubLObject ignore_errors_tag = (SubLObject)ke.NIL;
            try {
                thread.throwStack.push(ke.$kw6$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)ke.$sym7$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = fi.$fi_last_constant$.currentBinding(thread);
                        try {
                            fi.$fi_last_constant$.bind(result, thread);
                            if (ke.NIL != fi.fi_timestamp_constant_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate((SubLObject)ConsesLow.list((SubLObject)ke.$sym2$FI_TIMESTAMP_CONSTANT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, operation_communication.the_cyclist()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.the_date()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.ke_purpose()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.the_second()))));
                            }
                        }
                        finally {
                            fi.$fi_last_constant$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    catch (Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, (SubLObject)ke.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)ke.$kw6$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            return result;
        }
        if (ke.NIL != error_message) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list((SubLObject)ke.$kw8$FATAL_ERROR, error_message));
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list(fi.fi_get_error_int().first(), Functions.apply(Symbols.symbol_function((SubLObject)ke.$sym9$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)ke.NIL, fi.fi_get_error_int().rest()))));
        }
        return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 4058L)
    public static SubLObject ke_find_or_create_now(final SubLObject name, SubLObject external_id) {
        if (external_id == ke.UNPROVIDED) {
            external_id = (SubLObject)ke.NIL;
        }
        final SubLObject constant = fi.fi_find_int(name);
        if (ke.NIL != constant) {
            return Values.values(constant, (SubLObject)ke.NIL);
        }
        return ke_create_now(name, external_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 4814L)
    public static SubLObject ke_recreate_now(final SubLObject constant) {
        if (ke.NIL != ensure_cyclist_ok()) {
            final SubLObject external_id = constants_high.constant_external_id(constant);
            final SubLObject name = constants_high.constant_name(constant);
            final SubLObject creator = bookkeeping_store.creator(constant, (SubLObject)ke.UNPROVIDED);
            final SubLObject creation_time = bookkeeping_store.creation_time(constant, (SubLObject)ke.UNPROVIDED);
            final SubLObject purpose = bookkeeping_store.creation_purpose(constant, (SubLObject)ke.UNPROVIDED);
            final SubLObject creation_second = bookkeeping_store.creation_second(constant, (SubLObject)ke.UNPROVIDED);
            ke_kill_now(constant);
            ke_create_now(name, external_id);
            if (ke.NIL != creator && ke.NIL != creation_time) {
                fi.fi_timestamp_constant(creator, creation_time, purpose, creation_second);
            }
            return (SubLObject)ke.T;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 5602L)
    public static SubLObject ke_merge(final SubLObject kill_fort, final SubLObject keep_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke.NIL != constant_completion.constant_mentioned_in_codeP(kill_fort)) {
            Errors.cerror((SubLObject)ke.$str16$Skip_this_operation, (SubLObject)ke.$str17$Constant__S_cannot_be_merged_beca, kill_fort);
            return (SubLObject)ke.NIL;
        }
        final SubLObject merged_name = (SubLObject)((ke.NIL != constant_handles.constant_p(kill_fort)) ? constants_high.constant_name(kill_fort) : ((ke.NIL != nart_handles.nart_p(kill_fort)) ? format_nil.format_nil_s(narts_high.nart_el_formula(kill_fort)) : ke.NIL));
        final SubLObject merged_guid = (SubLObject)((ke.NIL != constant_handles.constant_p(kill_fort)) ? Guids.guid_to_string(constants_high.constant_guid(kill_fort)) : ke.NIL);
        if (ke.NIL != ensure_cyclist_ok()) {
            do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym18$FI_MERGE, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, kill_fort), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, keep_fort)));
            if (ke.NIL != ke.$note_merged_constant_name$.getDynamicValue(thread) && merged_name.isString() && merged_guid.isString()) {
                if (ke.NIL != constant_handles.constant_p(keep_fort) && ke.NIL != merged_name) {
                    ke_assert((SubLObject)ConsesLow.list(ke.$const19$mergedConstantName, keep_fort, merged_name), ke.$const20$BookkeepingMt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
                }
                if (ke.NIL != constant_handles.constant_p(keep_fort) && ke.NIL != merged_guid) {
                    ke_assert((SubLObject)ConsesLow.list(ke.$const21$mergedConstantGUID, keep_fort, merged_guid), ke.$const20$BookkeepingMt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
                }
                return keep_fort;
            }
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 6832L)
    public static SubLObject ke_merge_now(SubLObject kill_fort, SubLObject keep_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke.NIL != constant_completion.constant_mentioned_in_codeP(kill_fort)) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list22);
        }
        final SubLObject merged_name = (SubLObject)((ke.NIL != constant_handles.constant_p(kill_fort)) ? constants_high.constant_name(kill_fort) : ((ke.NIL != nart_handles.nart_p(kill_fort)) ? format_nil.format_nil_s(narts_high.nart_el_formula(kill_fort)) : ke.NIL));
        final SubLObject merged_guid = (SubLObject)((ke.NIL != constant_handles.constant_p(kill_fort)) ? Guids.guid_to_string(constants_high.constant_guid(kill_fort)) : ke.NIL);
        SubLObject result = (SubLObject)ke.NIL;
        SubLObject transcript_op = (SubLObject)ke.NIL;
        SubLObject error_message = (SubLObject)ke.NIL;
        kill_fort = Eval.eval(kill_fort);
        keep_fort = Eval.eval(keep_fort);
        transcript_op = canon_tl.tl_encapsulate((SubLObject)ConsesLow.list((SubLObject)ke.$sym18$FI_MERGE, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, kill_fort), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, keep_fort)));
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_merge_int(kill_fort, keep_fort);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (ke.NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(transcript_op);
            if (ke.NIL != ke.$note_merged_constant_name$.getDynamicValue(thread) && merged_name.isString() && merged_guid.isString()) {
                SubLObject ignore_errors_tag = (SubLObject)ke.NIL;
                try {
                    thread.throwStack.push(ke.$kw6$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)ke.$sym7$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke.$sym23$RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind(ke.$const20$BookkeepingMt, thread);
                                SubLObject pred_var = ke.$const19$mergedConstantName;
                                if (ke.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(keep_fort, (SubLObject)ke.ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(keep_fort, (SubLObject)ke.ONE_INTEGER, pred_var);
                                    SubLObject done_var = (SubLObject)ke.NIL;
                                    final SubLObject token_var = (SubLObject)ke.NIL;
                                    while (ke.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (ke.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)ke.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)ke.$kw24$GAF, (SubLObject)ke.NIL, (SubLObject)ke.NIL);
                                                SubLObject done_var_$4 = (SubLObject)ke.NIL;
                                                final SubLObject token_var_$5 = (SubLObject)ke.NIL;
                                                while (ke.NIL == done_var_$4) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                                                    if (ke.NIL != valid_$6) {
                                                        ke_unassert_assertion_now(assertion);
                                                    }
                                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == valid_$6);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    if (ke.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == valid);
                                    }
                                }
                                pred_var = ke.$const21$mergedConstantGUID;
                                if (ke.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(keep_fort, (SubLObject)ke.ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(keep_fort, (SubLObject)ke.ONE_INTEGER, pred_var);
                                    SubLObject done_var = (SubLObject)ke.NIL;
                                    final SubLObject token_var = (SubLObject)ke.NIL;
                                    while (ke.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (ke.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)ke.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)ke.$kw24$GAF, (SubLObject)ke.NIL, (SubLObject)ke.NIL);
                                                SubLObject done_var_$5 = (SubLObject)ke.NIL;
                                                final SubLObject token_var_$6 = (SubLObject)ke.NIL;
                                                while (ke.NIL == done_var_$5) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion));
                                                    if (ke.NIL != valid_$7) {
                                                        ke_unassert_assertion_now(assertion);
                                                    }
                                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == valid_$7);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    if (ke.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == valid);
                                    }
                                }
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, (SubLObject)ke.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)ke.$kw6$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            if (ke.NIL != constant_handles.constant_p(keep_fort)) {
                if (ke.NIL != merged_name && ke.NIL != ke.$note_merged_constant_name$.getDynamicValue(thread)) {
                    ke_assert_now((SubLObject)ConsesLow.list(ke.$const19$mergedConstantName, keep_fort, merged_name), ke.$const20$BookkeepingMt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
                }
                if (ke.NIL != merged_guid) {
                    ke_assert_now((SubLObject)ConsesLow.list(ke.$const21$mergedConstantGUID, keep_fort, merged_guid), ke.$const20$BookkeepingMt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
                }
            }
            return result;
        }
        if (ke.NIL != error_message) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list((SubLObject)ke.$kw8$FATAL_ERROR, error_message));
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list(fi.fi_get_error_int().first(), Functions.apply(Symbols.symbol_function((SubLObject)ke.$sym9$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)ke.NIL, fi.fi_get_error_int().rest()))));
        }
        return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 9037L)
    public static SubLObject ke_kill(final SubLObject fort) {
        if (ke.NIL == ensure_cyclist_ok()) {
            return (SubLObject)ke.NIL;
        }
        if (ke.NIL == forts.fort_p(fort) || ke.NIL == constant_completion.constant_mentioned_in_codeP(fort)) {
            return do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym26$FI_KILL, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fort)));
        }
        Errors.cerror((SubLObject)ke.$str16$Skip_this_operation, (SubLObject)ke.$str27$Constant__S_cannot_be_killed_beca, fort);
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 9411L)
    public static SubLObject ke_kill_now(SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)ke.NIL;
        SubLObject transcript_op = (SubLObject)ke.NIL;
        SubLObject error_message = (SubLObject)ke.NIL;
        fort = Eval.eval(fort);
        transcript_op = canon_tl.tl_encapsulate((SubLObject)ConsesLow.list((SubLObject)ke.$sym26$FI_KILL, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fort)));
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_kill_int(fort);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (ke.NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(transcript_op);
            return result;
        }
        if (ke.NIL != error_message) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list((SubLObject)ke.$kw8$FATAL_ERROR, error_message));
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list(fi.fi_get_error_int().first(), Functions.apply(Symbols.symbol_function((SubLObject)ke.$sym9$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)ke.NIL, fi.fi_get_error_int().rest()))));
        }
        return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 10435L)
    public static SubLObject ke_recreate(final SubLObject constant) {
        if (ke.NIL != ensure_cyclist_ok()) {
            final SubLObject external_id = constants_high.constant_external_id(constant);
            final SubLObject name = constants_high.constant_name(constant);
            final SubLObject creator = bookkeeping_store.creator(constant, (SubLObject)ke.UNPROVIDED);
            final SubLObject creation_time = bookkeeping_store.creation_time(constant, (SubLObject)ke.UNPROVIDED);
            final SubLObject purpose = bookkeeping_store.creation_purpose(constant, (SubLObject)ke.UNPROVIDED);
            final SubLObject creation_second = bookkeeping_store.creation_second(constant, (SubLObject)ke.UNPROVIDED);
            ke_kill(constant);
            fi.fi_create(name, external_id);
            if (ke.NIL != creator && ke.NIL != creation_time) {
                fi.fi_timestamp_constant(creator, creation_time, purpose, creation_second);
            }
            return (SubLObject)ke.T;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 11248L)
    public static SubLObject rename_code_constant(final SubLObject old_name, final SubLObject new_name) {
        assert ke.NIL != Types.stringp(old_name) : old_name;
        assert ke.NIL != Types.stringp(new_name) : new_name;
        final SubLObject constant = constants_high.find_constant(old_name);
        if (ke.NIL != constant) {
            final SubLObject existing = constants_high.find_constant(new_name);
            if (ke.NIL == existing || ke.NIL == constant_handles.valid_constantP(existing, (SubLObject)ke.UNPROVIDED)) {
                fi.fi_rename_int(constant, new_name);
                return (SubLObject)ke.T;
            }
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 11649L)
    public static SubLObject ke_rename(final SubLObject constant, final SubLObject name) {
        if (ke.NIL != ensure_cyclist_ok()) {
            if (ke.NIL == constant_completion.constant_mentioned_in_codeP(constant)) {
                return ke_rename_internal(constant, name);
            }
            Errors.cerror((SubLObject)ke.$str16$Skip_this_operation, (SubLObject)ke.$str33$Constant__S_cannot_be_renamed_bec, constant);
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 11954L)
    public static SubLObject ke_rename_code_constant(final SubLObject constant, final SubLObject name) {
        if (ke.NIL == ensure_cyclist_ok()) {
            return (SubLObject)ke.NIL;
        }
        if (ke.NIL != constant_completion.constant_mentioned_in_codeP(constant)) {
            return ke_rename_internal(constant, name);
        }
        Errors.cerror((SubLObject)ke.$str34$Use_KE_RENAME, (SubLObject)ke.$str35$Constant__S_is_not_mentioned_in_c, constant);
        return ke_rename(constant, name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 12317L)
    public static SubLObject ke_rename_internal(final SubLObject constant, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_name = constants_high.constant_name(constant);
        final SubLObject ans = do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym36$FI_RENAME, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, constant), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, name)));
        SubLObject error = (SubLObject)ke.NIL;
        if (ans != ke.$kw1$QUEUED) {
            error = fi.fi_get_error_int();
        }
        if (ke.NIL != ke.$note_old_constant_name$.getDynamicValue(thread) && old_name.isString()) {
            note_old_constant_name(constant, old_name);
        }
        nl_generation_fort_cache.nl_generation_cache_clear(constant);
        if (ans != ke.$kw1$QUEUED) {
            fi.signal_fi_error(error);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 12903L)
    public static SubLObject note_old_constant_name(final SubLObject constant, final SubLObject old_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke.NIL != constant_handles.constant_p(constant) : constant;
        assert ke.NIL != Types.stringp(old_name) : old_name;
        if (ke.NIL != kb_mapping_utilities.some_pred_value_in_mt(constant, ke.$const38$oldConstantName, ke.$const20$BookkeepingMt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke.$sym23$RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(ke.$const20$BookkeepingMt, thread);
                final SubLObject pred_var = ke.$const38$oldConstantName;
                if (ke.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, (SubLObject)ke.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, (SubLObject)ke.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)ke.NIL;
                    final SubLObject token_var = (SubLObject)ke.NIL;
                    while (ke.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (ke.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)ke.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)ke.$kw24$GAF, (SubLObject)ke.NIL, (SubLObject)ke.NIL);
                                SubLObject done_var_$12 = (SubLObject)ke.NIL;
                                final SubLObject token_var_$13 = (SubLObject)ke.NIL;
                                while (ke.NIL == done_var_$12) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                    final SubLObject valid_$14 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$13.eql(assertion));
                                    if (ke.NIL != valid_$14) {
                                        ke_unassert_assertion(assertion);
                                    }
                                    done_var_$12 = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == valid_$14);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (ke.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        ke_assert((SubLObject)ConsesLow.list(ke.$const38$oldConstantName, constant, old_name), ke.$const20$BookkeepingMt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 13421L)
    public static SubLObject ke_rename_now(SubLObject constant, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_name = constants_high.constant_name(constant);
        SubLObject result = (SubLObject)ke.NIL;
        SubLObject transcript_op = (SubLObject)ke.NIL;
        SubLObject error_message = (SubLObject)ke.NIL;
        constant = Eval.eval(constant);
        transcript_op = canon_tl.tl_encapsulate((SubLObject)ConsesLow.list((SubLObject)ke.$sym36$FI_RENAME, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, constant), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, name)));
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_rename_int(constant, name);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (ke.NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(transcript_op);
            if (ke.NIL != ke.$note_old_constant_name$.getDynamicValue(thread) && old_name.isString()) {
                SubLObject ignore_errors_tag = (SubLObject)ke.NIL;
                try {
                    thread.throwStack.push(ke.$kw6$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)ke.$sym7$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject _prev_bind_0_$16 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke.$sym23$RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind(ke.$const20$BookkeepingMt, thread);
                                final SubLObject pred_var = ke.$const38$oldConstantName;
                                if (ke.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, (SubLObject)ke.ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, (SubLObject)ke.ONE_INTEGER, pred_var);
                                    SubLObject done_var = (SubLObject)ke.NIL;
                                    final SubLObject token_var = (SubLObject)ke.NIL;
                                    while (ke.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (ke.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)ke.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)ke.$kw24$GAF, (SubLObject)ke.NIL, (SubLObject)ke.NIL);
                                                SubLObject done_var_$17 = (SubLObject)ke.NIL;
                                                final SubLObject token_var_$18 = (SubLObject)ke.NIL;
                                                while (ke.NIL == done_var_$17) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                                    final SubLObject valid_$19 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$18.eql(assertion));
                                                    if (ke.NIL != valid_$19) {
                                                        ke_unassert_assertion_now(assertion);
                                                    }
                                                    done_var_$17 = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == valid_$19);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    if (ke.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == valid);
                                    }
                                }
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                        catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, (SubLObject)ke.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)ke.$kw6$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
                ke_assert_now((SubLObject)ConsesLow.list(ke.$const38$oldConstantName, constant, old_name), ke.$const20$BookkeepingMt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
                return result;
            }
        }
        if (ke.NIL != error_message) {
            return Values.values((SubLObject)ke.$kw8$FATAL_ERROR, error_message);
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list(fi.fi_get_error_int().first(), Functions.apply(Symbols.symbol_function((SubLObject)ke.$sym9$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)ke.NIL, fi.fi_get_error_int().rest()))));
        }
        return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 14836L)
    public static SubLObject ke_assert(final SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.NIL;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        if (ke.NIL == strength) {
            strength = (SubLObject)ke.$kw40$DEFAULT;
        }
        if (ke.NIL != ensure_cyclist_ok()) {
            mt = hlmt_czer.canonicalize_hlmt(mt);
            final SubLObject ans = do_edit_op((SubLObject)ConsesLow.listS((SubLObject)ke.$sym41$FI_ASSERT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, formula), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, mt), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, strength), ConsesLow.append((SubLObject)((ke.NIL != direction) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, direction)) : ke.NIL), (SubLObject)ke.NIL)));
            SubLObject error = (SubLObject)ke.NIL;
            if (ans != ke.$kw1$QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym42$FI_TIMESTAMP_ASSERTION, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, operation_communication.the_cyclist()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.the_date()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.ke_purpose()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.the_second())));
            if (ans != ke.$kw1$QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 15501L)
    public static SubLObject ke_reassert_assertion_now(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert ke.NIL != enumeration_types.el_strength_p(strength) : strength;
        assert ke.NIL != enumeration_types.direction_p(direction) : direction;
        if (ke.NIL == ensure_cyclist_ok()) {
            return (SubLObject)ke.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject result = ke_reassert_assertion_now_int(assertion, strength, direction);
        final SubLObject error_message = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject v_hlmt = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (ke.NIL != result) {
            final SubLObject sentence_$21 = ke_assertion_find_formula(assertion);
            final SubLObject v_hlmt_$22 = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate((SubLObject)ConsesLow.list((SubLObject)ke.$sym46$FI_REASSERT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, sentence_$21), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, v_hlmt_$22), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, strength), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, direction))));
            return result;
        }
        if (ke.NIL != error_message) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list((SubLObject)ke.$kw8$FATAL_ERROR, error_message));
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list(fi.fi_get_error_int().first(), Functions.apply(Symbols.symbol_function((SubLObject)ke.$sym9$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)ke.NIL, fi.fi_get_error_int().rest()))));
        }
        return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 16413L)
    public static SubLObject ke_reassert_assertion_now_int(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = ke_assertion_find_formula(assertion);
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
        SubLObject result = (SubLObject)ke.NIL;
        SubLObject error_message = (SubLObject)ke.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_reassert_int(sentence, v_hlmt, strength, direction);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(result, error_message, sentence, v_hlmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 16801L)
    public static SubLObject ke_reassert_assertion(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (ke.NIL != ensure_cyclist_ok()) {
            final SubLObject formula = ke_assertion_find_formula(assertion);
            final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
            return do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym46$FI_REASSERT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, formula), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, v_hlmt), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, strength), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, direction)));
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 17159L)
    public static SubLObject ke_reassert_assertion_int(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (ke.NIL != ensure_cyclist_ok()) {
            final SubLObject formula = ke_assertion_find_formula(assertion);
            final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
            return do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym47$FI_REASSERT_INT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, formula), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, v_hlmt), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, strength), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, direction)));
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 17597L)
    public static SubLObject ke_repropagate_assertion_now(final SubLObject assertion) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (ke.NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion_now(assertion, strength, (SubLObject)ke.$kw48$BACKWARD);
            ke_reassert_assertion_now(assertion, strength, (SubLObject)ke.$kw49$FORWARD);
            return assertion;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 17933L)
    public static SubLObject ke_repropagate_assertion(final SubLObject assertion) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (ke.NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion(assertion, strength, (SubLObject)ke.$kw48$BACKWARD);
            ke_reassert_assertion(assertion, strength, (SubLObject)ke.$kw49$FORWARD);
            return assertion;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 18257L)
    public static SubLObject ke_repropagate_assertion_now_int(final SubLObject assertion) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (ke.NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion_now_int(assertion, strength, (SubLObject)ke.$kw48$BACKWARD);
            ke_reassert_assertion_now_int(assertion, strength, (SubLObject)ke.$kw49$FORWARD);
            return assertion;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 18608L)
    public static SubLObject ke_repropagate_assertion_int(final SubLObject assertion) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (ke.NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion_int(assertion, strength, (SubLObject)ke.$kw48$BACKWARD);
            ke_reassert_assertion_int(assertion, strength, (SubLObject)ke.$kw49$FORWARD);
            return assertion;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 18947L)
    public static SubLObject ke_assert_now(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.$kw40$DEFAULT;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        return ke_assert_now_int(formula, mt, strength, direction, (SubLObject)ke.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 19548L)
    public static SubLObject ke_assert_wff_now(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.$kw40$DEFAULT;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        return ke_assert_now_int(formula, mt, strength, direction, (SubLObject)ke.$sym53$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 20192L)
    public static SubLObject ke_assert_now_and_propagate_later(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.$kw40$DEFAULT;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke.NIL != ensure_cyclist_ok()) {
            SubLObject result = (SubLObject)ke.NIL;
            SubLObject error = (SubLObject)ke.NIL;
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind((SubLObject)ke.NIL, thread);
                thread.resetMultipleValues();
                final SubLObject result_$23 = ke_assert_now(formula, mt, strength, direction);
                final SubLObject error_$24 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$23;
                error = error_$24;
            }
            finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
            }
            ke_repropagate_assertion_int(czer_meta.find_assertion_cycl(formula, mt));
            return Values.values(result, error);
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 21480L)
    public static SubLObject ke_assert_now_int(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject wff_test) {
        if (wff_test == ke.UNPROVIDED) {
            wff_test = ke.$ke_assert_now_assume_wff_test$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)ke.NIL;
        SubLObject error_message = (SubLObject)ke.NIL;
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
        SubLObject assertions = (SubLObject)ke.NIL;
        if (ke.NIL == control_vars.$inference_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$25 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind((SubLObject)ke.NIL, thread);
                            final SubLObject environment = forward.get_forward_inference_environment();
                            assert ke.NIL != queues.queue_p(environment) : environment;
                            final SubLObject _prev_bind_0_$26 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)ke.$kw60$STRENGTH, strength, (SubLObject)ke.$kw61$DIRECTION, direction);
                                if (ke.NIL != Functions.funcall(wff_test, formula, mt, strength, direction)) {
                                    result = cyc_kernel.cyc_assert_wff(formula, v_hlmt, v_properties);
                                }
                                else {
                                    result = cyc_kernel.cyc_assert(formula, v_hlmt, v_properties);
                                }
                            }
                            finally {
                                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$26, thread);
                            }
                            assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
                        }
                        finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else {
            final SubLObject _prev_bind_0 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
            try {
                czer_vars.$fi_last_assertions_asserted$.bind((SubLObject)ke.NIL, thread);
                final SubLObject environment2 = forward.get_forward_inference_environment();
                assert ke.NIL != queues.queue_p(environment2) : environment2;
                final SubLObject _prev_bind_0_$27 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment2, thread);
                    final SubLObject v_properties2 = (SubLObject)ConsesLow.list((SubLObject)ke.$kw60$STRENGTH, strength, (SubLObject)ke.$kw61$DIRECTION, direction);
                    if (ke.NIL != Functions.funcall(wff_test, formula, mt, strength, direction)) {
                        result = cyc_kernel.cyc_assert_wff(formula, v_hlmt, v_properties2);
                    }
                    else {
                        result = cyc_kernel.cyc_assert(formula, v_hlmt, v_properties2);
                    }
                }
                finally {
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$27, thread);
                }
                assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
            }
            finally {
                czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0, thread);
            }
        }
        if (ke.NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue((SubLObject)ke.$sym41$FI_ASSERT, formula, v_hlmt, strength, direction, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED)));
            SubLObject ignore_errors_tag = (SubLObject)ke.NIL;
            try {
                thread.throwStack.push(ke.$kw6$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)ke.$sym7$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$28 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind(assertions, thread);
                            if (ke.NIL != fi.fi_timestamp_assertion_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue((SubLObject)ke.$sym42$FI_TIMESTAMP_ASSERTION, operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second(), (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED)));
                            }
                        }
                        finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$28, thread);
                        }
                    }
                    catch (Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, (SubLObject)ke.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)ke.$kw6$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            return Values.values(result, (SubLObject)ke.NIL);
        }
        if (ke.NIL != error_message) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list((SubLObject)ke.$kw8$FATAL_ERROR, error_message));
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list(fi.fi_get_error_int().first(), Functions.apply(Symbols.symbol_function((SubLObject)ke.$sym9$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)ke.NIL, fi.fi_get_error_int().rest()))));
        }
        return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 23125L)
    public static SubLObject ke_assert_with_implicature(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.$kw40$DEFAULT;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        return ke_assert_with_implicature_int(formula, mt, strength, direction, (SubLObject)ke.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 23297L)
    public static SubLObject ke_assert_now_with_implicature(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.$kw40$DEFAULT;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        return ke_assert_with_implicature_int(formula, mt, strength, direction, (SubLObject)ke.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 23471L)
    public static SubLObject ke_assert_with_implicature_int(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject nowP) {
        SubLObject result = (SubLObject)ke.NIL;
        if (ke.NIL != wff.el_wffP(formula, mt, (SubLObject)ke.UNPROVIDED)) {
            result = ke_assert_with_implicature_int_assert(formula, mt, strength, direction, nowP);
        }
        else {
            final SubLObject repairs = wff_suggest.non_wffness_repairs(formula, mt);
            if (ke.NIL != repairs) {
                SubLObject cdolist_list_var = repairs;
                SubLObject repair = (SubLObject)ke.NIL;
                repair = cdolist_list_var.first();
                while (ke.NIL != cdolist_list_var) {
                    ke_assert_with_implicature_int_assert(repair, mt, strength, direction, nowP);
                    cdolist_list_var = cdolist_list_var.rest();
                    repair = cdolist_list_var.first();
                }
                result = ke_assert_with_implicature_int_assert(formula, mt, strength, direction, nowP);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 24000L)
    public static SubLObject ke_assert_with_implicature_int_assert(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject nowP) {
        return (ke.NIL != nowP) ? ke_assert_now(formula, mt, strength, direction) : ke_assert(formula, mt, strength, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 24277L)
    public static SubLObject ke_unassert(final SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke.NIL == ensure_cyclist_ok()) {
            return (SubLObject)ke.NIL;
        }
        mt = hlmt_czer.canonicalize_hlmt(mt);
        if (ke.NIL == ke.$check_if_already_ke_unassertedP$.getDynamicValue(thread) || ke.NIL != fi.sentence_assertions(sentence, mt)) {
            return do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym63$FI_UNASSERT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, sentence), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, mt)));
        }
        Errors.error((SubLObject)ke.$str64$Sentence__S_in_mt__S__is_not_in_t, sentence, mt);
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 24665L)
    public static SubLObject ke_unassert_assertion(final SubLObject assertion) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return ke_unassert(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 24844L)
    public static SubLObject ke_unassert_now(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)ke.NIL;
        SubLObject error_message = (SubLObject)ke.NIL;
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
        final SubLObject fi_formula = canon_tl.tl_encapsulate((SubLObject)ConsesLow.list((SubLObject)ke.$sym63$FI_UNASSERT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, formula), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, v_hlmt)));
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_unassert_int(formula, v_hlmt);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (ke.NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(fi_formula);
            return result;
        }
        if (ke.NIL != error_message) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list((SubLObject)ke.$kw8$FATAL_ERROR, error_message));
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list(fi.fi_get_error_int().first(), Functions.apply(Symbols.symbol_function((SubLObject)ke.$sym9$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)ke.NIL, fi.fi_get_error_int().rest()))));
        }
        return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 25923L)
    public static SubLObject ke_unassert_assertion_now(final SubLObject assertion) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (ke.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)ke.UNPROVIDED)) {
            return ke_unassert_now(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 26659L)
    public static SubLObject ke_edit(final SubLObject old_formula, final SubLObject new_formula, final SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == ke.UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.$kw40$DEFAULT;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        final SubLObject old_hlmt = hlmt_czer.canonicalize_hlmt(old_mt);
        final SubLObject new_hlmt = hlmt_czer.canonicalize_hlmt(new_mt);
        if (ke.NIL == ke.$ke_edit_use_fi_edit$.getGlobalValue()) {
            ke_unassert(old_formula, old_hlmt);
            return ke_assert(new_formula, new_hlmt, strength, direction);
        }
        if (ke.NIL != ensure_cyclist_ok()) {
            final SubLObject ans = do_edit_op((SubLObject)ConsesLow.listS((SubLObject)ke.$sym69$FI_EDIT, new SubLObject[] { ConsesLow.list((SubLObject)ke.$sym3$QUOTE, old_formula), ConsesLow.list((SubLObject)ke.$sym3$QUOTE, new_formula), ConsesLow.list((SubLObject)ke.$sym3$QUOTE, old_hlmt), ConsesLow.list((SubLObject)ke.$sym3$QUOTE, new_hlmt), ConsesLow.list((SubLObject)ke.$sym3$QUOTE, strength), ConsesLow.append((SubLObject)((ke.NIL != direction) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, direction)) : ke.NIL), (SubLObject)ke.NIL) }));
            SubLObject error = (SubLObject)ke.NIL;
            if (ans != ke.$kw1$QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym42$FI_TIMESTAMP_ASSERTION, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, operation_communication.the_cyclist()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.the_date()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.ke_purpose()), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fi.the_second())));
            if (ans != ke.$kw1$QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 27984L)
    public static SubLObject ke_edit_now(final SubLObject old_formula, final SubLObject new_formula, final SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == ke.UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.$kw40$DEFAULT;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_hlmt = hlmt_czer.canonicalize_hlmt(old_mt);
        final SubLObject new_hlmt = hlmt_czer.canonicalize_hlmt(new_mt);
        SubLObject assertions = (SubLObject)ke.NIL;
        SubLObject error_message = (SubLObject)ke.NIL;
        SubLObject result = (SubLObject)ke.NIL;
        if (ke.NIL == ke.$ke_edit_use_fi_edit$.getGlobalValue()) {
            ke_unassert_now(old_formula, old_hlmt);
            return ke_assert_now(new_formula, new_hlmt, strength, direction);
        }
        if (ke.NIL == control_vars.$inference_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$29 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind((SubLObject)ke.NIL, thread);
                            final SubLObject environment = forward.get_forward_inference_environment();
                            assert ke.NIL != queues.queue_p(environment) : environment;
                            final SubLObject _prev_bind_0_$30 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                result = fi.fi_edit_int(old_formula, new_formula, old_hlmt, new_hlmt, strength, direction);
                            }
                            finally {
                                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$30, thread);
                            }
                            assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
                        }
                        finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else {
            final SubLObject _prev_bind_0 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
            try {
                czer_vars.$fi_last_assertions_asserted$.bind((SubLObject)ke.NIL, thread);
                final SubLObject environment2 = forward.get_forward_inference_environment();
                assert ke.NIL != queues.queue_p(environment2) : environment2;
                final SubLObject _prev_bind_0_$31 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment2, thread);
                    result = fi.fi_edit_int(old_formula, new_formula, old_hlmt, new_hlmt, strength, direction);
                }
                finally {
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$31, thread);
                }
                assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
            }
            finally {
                czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0, thread);
            }
        }
        if (ke.NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue((SubLObject)ke.$sym69$FI_EDIT, old_formula, new_formula, old_mt, new_mt, strength, direction, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED)));
            SubLObject ignore_errors_tag = (SubLObject)ke.NIL;
            try {
                thread.throwStack.push(ke.$kw6$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)ke.$sym7$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$32 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind(assertions, thread);
                            if (ke.NIL != fi.fi_timestamp_assertion_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue((SubLObject)ke.$sym42$FI_TIMESTAMP_ASSERTION, operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second(), (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED)));
                            }
                        }
                        finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$32, thread);
                        }
                    }
                    catch (Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, (SubLObject)ke.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)ke.$kw6$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            return Values.values(result, (SubLObject)ke.NIL);
        }
        if (ke.NIL != error_message) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list((SubLObject)ke.$kw8$FATAL_ERROR, error_message));
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list(fi.fi_get_error_int().first(), Functions.apply(Symbols.symbol_function((SubLObject)ke.$sym9$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)ke.NIL, fi.fi_get_error_int().rest()))));
        }
        return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 30152L)
    public static SubLObject ke_edit_assertion(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == ke.UNPROVIDED) {
            new_mt = (SubLObject)ke.NIL;
        }
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.NIL;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (ke.NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_formula = ke_assertion_find_formula(assertion);
            final SubLObject old_mt = assertions_high.assertion_mt(assertion);
            final SubLObject old_strength = assertions_high.assertion_strength(assertion);
            final SubLObject old_direction = assertions_high.assertion_direction(assertion);
            if (ke.NIL == new_mt) {
                new_mt = old_mt;
            }
            if (ke.NIL == strength) {
                strength = old_strength;
            }
            if (ke.NIL == direction) {
                direction = old_direction;
            }
            return ke_edit(old_formula, new_formula, old_mt, new_mt, strength, direction);
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 30790L)
    public static SubLObject ke_edit_assertion_preserving_meta_assertions(final SubLObject assertion, final SubLObject meta_assertions_to_preserve, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == ke.UNPROVIDED) {
            new_mt = (SubLObject)ke.NIL;
        }
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.NIL;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        return ke_edit_assertion_preserving_meta_assertions_int(assertion, meta_assertions_to_preserve, new_formula, new_mt, strength, direction, (SubLObject)ke.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 31083L)
    public static SubLObject ke_edit_assertion_now_preserving_meta_assertions(final SubLObject assertion, final SubLObject meta_assertions_to_preserve, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == ke.UNPROVIDED) {
            new_mt = (SubLObject)ke.NIL;
        }
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.NIL;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        return ke_edit_assertion_preserving_meta_assertions_int(assertion, meta_assertions_to_preserve, new_formula, new_mt, strength, direction, (SubLObject)ke.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 31378L)
    public static SubLObject ke_edit_assertion_preserving_meta_assertions_int(final SubLObject assertion, SubLObject meta_assertions_to_preserve, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction, final SubLObject nowP) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (ke.NIL != assertions_high.asserted_assertionP(assertion)) {
            if (meta_assertions_to_preserve == ke.$kw76$ALL) {
                meta_assertions_to_preserve = assertion_utilities.all_meta_assertions(assertion);
            }
            final SubLObject old_formula = ke_assertion_find_formula(assertion);
            final SubLObject old_mt = assertions_high.assertion_mt(assertion);
            final SubLObject old_strength = assertions_high.assertion_strength(assertion);
            final SubLObject old_direction = assertions_high.assertion_direction(assertion);
            if (ke.NIL == new_mt) {
                new_mt = old_mt;
            }
            if (ke.NIL == strength) {
                strength = old_strength;
            }
            if (ke.NIL == direction) {
                direction = old_direction;
            }
            final SubLObject new_meta_assertion_assertibles = ke_edit_compute_new_meta_assertion_assertibles(assertion, meta_assertions_to_preserve, new_formula, new_mt);
            final SubLObject v_answer = (ke.NIL != nowP) ? ke_edit_now(old_formula, new_formula, old_mt, new_mt, strength, direction) : ke_edit(old_formula, new_formula, old_mt, new_mt, strength, direction);
            SubLObject cdolist_list_var = new_meta_assertion_assertibles;
            SubLObject new_meta_assertion_assertible = (SubLObject)ke.NIL;
            new_meta_assertion_assertible = cdolist_list_var.first();
            while (ke.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = new_meta_assertion_assertible;
                SubLObject new_meta_assertion_el_formula = (SubLObject)ke.NIL;
                SubLObject new_meta_assertion_mt = (SubLObject)ke.NIL;
                SubLObject new_meta_assertion_strength = (SubLObject)ke.NIL;
                SubLObject new_meta_assertion_direction = (SubLObject)ke.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ke.$list77);
                new_meta_assertion_el_formula = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ke.$list77);
                new_meta_assertion_mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ke.$list77);
                new_meta_assertion_strength = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ke.$list77);
                new_meta_assertion_direction = current.first();
                current = current.rest();
                if (ke.NIL == current) {
                    if (ke.NIL != nowP) {
                        ke_assert_now(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction);
                    }
                    else {
                        ke_assert(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ke.$list77);
                }
                cdolist_list_var = cdolist_list_var.rest();
                new_meta_assertion_assertible = cdolist_list_var.first();
            }
            return v_answer;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 33172L)
    public static SubLObject ke_edit_assertion_preserving_all_meta_assertions(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == ke.UNPROVIDED) {
            new_mt = (SubLObject)ke.NIL;
        }
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.NIL;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        return ke_edit_assertion_preserving_meta_assertions(assertion, (SubLObject)ke.$kw76$ALL, new_formula, new_mt, strength, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 33412L)
    public static SubLObject ke_edit_assertion_now_preserving_all_meta_assertions(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == ke.UNPROVIDED) {
            new_mt = (SubLObject)ke.NIL;
        }
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.NIL;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        return ke_edit_assertion_now_preserving_meta_assertions(assertion, (SubLObject)ke.$kw76$ALL, new_formula, new_mt, strength, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 33658L)
    public static SubLObject ke_null_edit_assertion(final SubLObject assertion) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (ke.NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject meta_assertions_to_preserve = assertion_utilities.all_meta_assertions(assertion);
            final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
            return ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, assertion_el_formula, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 34213L)
    public static SubLObject ke_edit_compute_new_meta_assertion_assertibles(final SubLObject assertion, final SubLObject meta_assertions_to_preserve, final SubLObject new_formula, final SubLObject new_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_meta_assertion_assertibles = (SubLObject)ke.NIL;
        final SubLObject _prev_bind_0 = uncanonicalizer.$cache_el_formulaP$.currentBinding(thread);
        try {
            uncanonicalizer.$cache_el_formulaP$.bind((SubLObject)ke.T, thread);
            thread.resetMultipleValues();
            final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
            final SubLObject assertion_el_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = meta_assertions_to_preserve;
            SubLObject old_meta_assertion_info = (SubLObject)ke.NIL;
            old_meta_assertion_info = cdolist_list_var.first();
            while (ke.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject old_meta_assertion = extract_old_meta_assertion_info(old_meta_assertion_info);
                final SubLObject new_meta_assertion_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject old_meta_assertion_el_formula = uncanonicalizer.assertion_el_formula(old_meta_assertion);
                final SubLObject old_meta_assertion_el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject new_el_ist_formula = el_utilities.make_binary_formula(ke.$const79$ist, new_mt, new_formula);
                final SubLObject new_meta_assertion_el_formula = cycl_utilities.expression_subst(new_el_ist_formula, assertion_el_formula, old_meta_assertion_el_formula, Symbols.symbol_function((SubLObject)ke.EQUAL), (SubLObject)ke.UNPROVIDED);
                final SubLObject new_meta_assertion_strength = assertions_high.assertion_strength(old_meta_assertion);
                final SubLObject new_meta_assertion_direction = assertions_high.assertion_direction(old_meta_assertion);
                new_meta_assertion_assertibles = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction), new_meta_assertion_assertibles);
                cdolist_list_var = cdolist_list_var.rest();
                old_meta_assertion_info = cdolist_list_var.first();
            }
            new_meta_assertion_assertibles = Sequences.nreverse(new_meta_assertion_assertibles);
        }
        finally {
            uncanonicalizer.$cache_el_formulaP$.rebind(_prev_bind_0, thread);
        }
        return new_meta_assertion_assertibles;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 35851L)
    public static SubLObject extract_old_meta_assertion_info(final SubLObject old_meta_assertion_info) {
        if (ke.NIL != assertion_handles.assertion_p(old_meta_assertion_info)) {
            return Values.values(old_meta_assertion_info, assertions_high.assertion_mt(old_meta_assertion_info));
        }
        SubLObject old_meta_assertion = (SubLObject)ke.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(old_meta_assertion_info, old_meta_assertion_info, (SubLObject)ke.$list80);
        old_meta_assertion = old_meta_assertion_info.first();
        SubLObject current = old_meta_assertion_info.rest();
        final SubLObject new_meta_assertion_mt = (SubLObject)(current.isCons() ? current.first() : ke.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, old_meta_assertion_info, (SubLObject)ke.$list80);
        current = current.rest();
        if (ke.NIL == current) {
            return Values.values(old_meta_assertion, (ke.NIL != new_meta_assertion_mt) ? new_meta_assertion_mt : assertions_high.assertion_mt(old_meta_assertion));
        }
        cdestructuring_bind.cdestructuring_bind_error(old_meta_assertion_info, (SubLObject)ke.$list80);
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 36376L)
    public static SubLObject ke_add_assertion_original_text(final SubLObject sentence, final SubLObject mt, SubLObject sentence_original_text, SubLObject nowP) {
        if (nowP == ke.UNPROVIDED) {
            nowP = (SubLObject)ke.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke.NIL != ke.$ke_add_assertion_original_textP$.getDynamicValue(thread) && ke.NIL != el_utilities.el_conditional_sentence_p(sentence) && sentence_original_text.isString()) {
            sentence_original_text = Sequences.cconcatenate((SubLObject)ke.$str81$_pre_, new SubLObject[] { sentence_original_text, ke.$str82$__code_ });
            final SubLObject assertion_ist_formula = (ke.NIL != mt) ? el_utilities.make_ist_sentence(mt, sentence) : sentence;
            final SubLObject assertion_original_text_sentence = el_utilities.make_binary_formula(ke.$const83$assertionOriginalText, assertion_ist_formula, sentence_original_text);
            return (ke.NIL != nowP) ? ke_assert_now(assertion_original_text_sentence, ke.$const20$BookkeepingMt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED) : ke_assert(assertion_original_text_sentence, ke.$const20$BookkeepingMt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 37094L)
    public static SubLObject ke_edit_assertion_strings(final SubLObject old_assertion, final SubLObject new_sentence, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == ke.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)ke.NIL;
        }
        assert ke.NIL != assertion_handles.assertion_p(old_assertion) : old_assertion;
        final SubLObject old_sentence = ke_assertion_edit_formula(old_assertion);
        if (ke.NIL == formulas_differ_only_in_strings(old_sentence, new_sentence, (SubLObject)ke.UNPROVIDED)) {
            Errors.error((SubLObject)ke.$str84$Sentences_do_not_differ_only_in_s);
        }
        return ke_edit_assertion_but_not_bookkeeping(old_assertion, new_sentence, (SubLObject)ke.NIL, (SubLObject)ke.NIL, (SubLObject)ke.NIL, meta_assertions_to_preserve);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 38122L)
    public static SubLObject ke_recanonicalize_assertion(final SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == ke.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)ke.NIL;
        }
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject sentence = ke_assertion_edit_formula(assertion);
        return ke_edit_assertion_but_not_bookkeeping(assertion, sentence, (SubLObject)ke.NIL, (SubLObject)ke.NIL, (SubLObject)ke.NIL, meta_assertions_to_preserve);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 38483L)
    public static SubLObject ke_recanonicalize_assertion_now(final SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == ke.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)ke.NIL;
        }
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject sentence = ke_assertion_edit_formula(assertion);
        return ke_edit_assertion_now_but_not_bookkeeping(assertion, sentence, (SubLObject)ke.NIL, (SubLObject)ke.NIL, (SubLObject)ke.NIL, meta_assertions_to_preserve);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 38852L)
    public static SubLObject ke_edit_assertion_but_not_bookkeeping(final SubLObject old_assertion, final SubLObject new_sentence, SubLObject new_mt, SubLObject strength, SubLObject direction, SubLObject meta_assertions_to_preserve) {
        if (new_mt == ke.UNPROVIDED) {
            new_mt = (SubLObject)ke.NIL;
        }
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.NIL;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        if (meta_assertions_to_preserve == ke.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)ke.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke.NIL != assertion_handles.assertion_p(old_assertion) : old_assertion;
        ensure_cyclist_ok();
        final SubLObject curr_cyclist = operation_communication.the_cyclist();
        SubLObject v_answer = (SubLObject)ke.NIL;
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
            if (ke.NIL != cyclist_is_guest()) {
                operation_communication.set_the_cyclist(curr_cyclist);
                fi.$the_date$.setDynamicValue(Time.get_universal_time(), thread);
                fi.$the_second$.setDynamicValue(numeric_date_utilities.get_universal_second((SubLObject)ke.UNPROVIDED), thread);
            }
            v_answer = ke_edit_assertion_preserving_meta_assertions(old_assertion, meta_assertions_to_preserve, new_sentence, new_mt, strength, direction);
        }
        finally {
            cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_5, thread);
            fi.$the_second$.rebind(_prev_bind_4, thread);
            api_control_vars.$ke_purpose$.rebind(_prev_bind_3, thread);
            fi.$the_date$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 40422L)
    public static SubLObject ke_edit_assertion_now_but_not_bookkeeping(final SubLObject old_assertion, final SubLObject new_sentence, SubLObject new_mt, SubLObject strength, SubLObject direction, SubLObject meta_assertions_to_preserve) {
        if (new_mt == ke.UNPROVIDED) {
            new_mt = (SubLObject)ke.NIL;
        }
        if (strength == ke.UNPROVIDED) {
            strength = (SubLObject)ke.NIL;
        }
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        if (meta_assertions_to_preserve == ke.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)ke.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke.NIL != assertion_handles.assertion_p(old_assertion) : old_assertion;
        SubLObject v_answer = (SubLObject)ke.NIL;
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
        }
        finally {
            cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_5, thread);
            fi.$the_second$.rebind(_prev_bind_4, thread);
            api_control_vars.$ke_purpose$.rebind(_prev_bind_3, thread);
            fi.$the_date$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 41391L)
    public static SubLObject formulas_differ_only_in_strings(final SubLObject formula_1, final SubLObject formula_2, SubLObject string_pred) {
        if (string_pred == ke.UNPROVIDED) {
            string_pred = Symbols.symbol_function((SubLObject)ke.$sym32$STRINGP);
        }
        return tree_equal_ignoring_type(formula_1, formula_2, string_pred, Symbols.symbol_function((SubLObject)ke.EQUAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 41588L)
    public static SubLObject tree_equal_ignoring_type(final SubLObject tree_1, final SubLObject tree_2, final SubLObject ignore_type, SubLObject test) {
        if (test == ke.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)ke.EQUAL);
        }
        if (ke.NIL != Functions.funcall(ignore_type, tree_1) && ke.NIL != Functions.funcall(ignore_type, tree_2)) {
            return (SubLObject)ke.T;
        }
        if (tree_1.isAtom() && tree_2.isAtom()) {
            return Functions.funcall(test, tree_1, tree_2);
        }
        if (!tree_1.isCons() || !tree_2.isCons()) {
            return (SubLObject)ke.NIL;
        }
        if (ke.NIL == tree_equal_ignoring_type(tree_1.first(), tree_2.first(), ignore_type, test)) {
            return (SubLObject)ke.NIL;
        }
        return tree_equal_ignoring_type(tree_1.rest(), tree_2.rest(), ignore_type, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 42306L)
    public static SubLObject ke_blast(final SubLObject formula, final SubLObject mt) {
        if (ke.NIL != ensure_cyclist_ok()) {
            return do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym85$FI_BLAST, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, formula), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 42459L)
    public static SubLObject ke_blast_assertion(final SubLObject assertion) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return ke_blast(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 42629L)
    public static SubLObject ke_rename_variables(final SubLObject formula, final SubLObject rename_alist, final SubLObject mt) {
        assert ke.NIL != el_utilities.el_formula_p(formula) : formula;
        assert ke.NIL != list_utilities.alist_p(rename_alist) : rename_alist;
        return do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym88$FI_RENAME_VARIABLES, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, formula), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, rename_alist), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 43127L)
    public static SubLObject ke_add_argument(final SubLObject formula, final SubLObject mt, final SubLObject el_supports, SubLObject direction, SubLObject verify_supportsP) {
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        if (verify_supportsP == ke.UNPROVIDED) {
            verify_supportsP = (SubLObject)ke.NIL;
        }
        if (ke.NIL != ensure_cyclist_ok()) {
            return do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym89$FI_ADD_ARGUMENT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, formula), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, hlmt_czer.canonicalize_hlmt(mt)), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, el_supports), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, direction), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, verify_supportsP)));
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 43413L)
    public static SubLObject ke_add_argument_now(final SubLObject formula, final SubLObject mt, final SubLObject el_supports, SubLObject direction, SubLObject verify_supportsP, SubLObject check_wffP) {
        if (direction == ke.UNPROVIDED) {
            direction = (SubLObject)ke.NIL;
        }
        if (verify_supportsP == ke.UNPROVIDED) {
            verify_supportsP = (SubLObject)ke.NIL;
        }
        if (check_wffP == ke.UNPROVIDED) {
            check_wffP = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue());
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)ke.NIL;
        SubLObject error_message = (SubLObject)ke.NIL;
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
        if (ke.NIL == control_vars.$inference_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject environment = forward.get_forward_inference_environment();
                        assert ke.NIL != queues.queue_p(environment) : environment;
                        final SubLObject _prev_bind_0_$33 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                            final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)ke.$kw61$DIRECTION, direction, (SubLObject)ke.$kw90$CHECK_WFF_, check_wffP);
                            result = cyc_kernel.cyc_add_argument(formula, el_supports, v_hlmt, v_properties, verify_supportsP);
                        }
                        finally {
                            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$33, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else {
            final SubLObject environment2 = forward.get_forward_inference_environment();
            assert ke.NIL != queues.queue_p(environment2) : environment2;
            final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment2, thread);
                final SubLObject v_properties2 = (SubLObject)ConsesLow.list((SubLObject)ke.$kw61$DIRECTION, direction, (SubLObject)ke.$kw90$CHECK_WFF_, check_wffP);
                result = cyc_kernel.cyc_add_argument(formula, el_supports, v_hlmt, v_properties2, verify_supportsP);
            }
            finally {
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_2, thread);
            }
        }
        if (ke.NIL != result) {
            operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate((SubLObject)ConsesLow.list((SubLObject)ke.$sym89$FI_ADD_ARGUMENT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, formula), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, v_hlmt), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, el_supports), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, direction), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, verify_supportsP))));
            return Values.values(result, (SubLObject)ke.NIL);
        }
        if (ke.NIL != error_message) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list((SubLObject)ke.$kw8$FATAL_ERROR, error_message));
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list(fi.fi_get_error_int().first(), Functions.apply(Symbols.symbol_function((SubLObject)ke.$sym9$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)ke.NIL, fi.fi_get_error_int().rest()))));
        }
        return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 44433L)
    public static SubLObject ke_remove_argument(final SubLObject formula, final SubLObject mt, final SubLObject el_supports) {
        if (ke.NIL != ensure_cyclist_ok()) {
            return do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym91$FI_REMOVE_ARGUMENT, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, formula), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, hlmt_czer.canonicalize_hlmt(mt)), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, el_supports)));
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 44660L)
    public static SubLObject ke_remove_deduction(final SubLObject deduction) {
        assert ke.NIL != deduction_handles.deduction_p(deduction) : deduction;
        final SubLObject assertion = deductions_high.deduction_assertion(deduction);
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        final SubLObject tl_supports = Mapping.mapcar(Symbols.symbol_function((SubLObject)ke.$sym93$CONVERT_HL_SUPPORT_TO_TL_SUPPORT), supports);
        return ke_remove_argument(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion), tl_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 45029L)
    public static SubLObject ke_tms_reconsider_term(final SubLObject fort, SubLObject mt) {
        if (mt == ke.UNPROVIDED) {
            mt = (SubLObject)ke.NIL;
        }
        assert ke.NIL != forts.fort_p(fort) : fort;
        return do_edit_op((SubLObject)ConsesLow.listS((SubLObject)ke.$sym95$FI_TMS_RECONSIDER_TERM, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, fort), ConsesLow.append((SubLObject)((ke.NIL != mt) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, hlmt_czer.canonicalize_hlmt(mt))) : ke.NIL), (SubLObject)ke.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 45227L)
    public static SubLObject ke_tms_reconsider_formula(final SubLObject formula, final SubLObject mt) {
        if (ke.NIL != ensure_cyclist_ok()) {
            return do_edit_op((SubLObject)ConsesLow.list((SubLObject)ke.$sym96$FI_TMS_RECONSIDER_FORMULA, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, formula), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 45406L)
    public static SubLObject ke_tms_reconsider_formula_now(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke.NIL == ensure_cyclist_ok()) {
            return (SubLObject)ke.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject result = ke_tms_reconsider_formula_now_int(formula, mt);
        final SubLObject error_message = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject v_hlmt = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (ke.NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate((SubLObject)ConsesLow.list((SubLObject)ke.$sym96$FI_TMS_RECONSIDER_FORMULA, (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, sentence), (SubLObject)ConsesLow.list((SubLObject)ke.$sym3$QUOTE, hlmt_czer.canonicalize_hlmt(v_hlmt)))));
            return result;
        }
        if (ke.NIL != error_message) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list((SubLObject)ke.$kw8$FATAL_ERROR, error_message));
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, (SubLObject)ConsesLow.list(fi.fi_get_error_int().first(), Functions.apply(Symbols.symbol_function((SubLObject)ke.$sym9$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)ke.NIL, fi.fi_get_error_int().rest()))));
        }
        return Values.values((SubLObject)ke.NIL, (SubLObject)ke.$list10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 46061L)
    public static SubLObject ke_tms_reconsider_formula_now_int(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)ke.NIL;
        SubLObject error_message = (SubLObject)ke.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_tms_reconsider_formula_int(formula, mt);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(result, error_message, formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 46319L)
    public static SubLObject ke_tms_reconsider_assertion(final SubLObject assertion) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return ke_tms_reconsider_formula(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 46516L)
    public static SubLObject ke_tms_reconsider_assertion_now(final SubLObject assertion) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return ke_tms_reconsider_formula_now(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 46721L)
    public static SubLObject ke_blast_all_dependents(final SubLObject assertion) {
        SubLObject successP = (SubLObject)ke.T;
        SubLObject cdolist_list_var;
        final SubLObject dependents = cdolist_list_var = assertion_utilities.assertion_dependent_assertions(assertion);
        SubLObject dependent = (SubLObject)ke.NIL;
        dependent = cdolist_list_var.first();
        while (ke.NIL != cdolist_list_var) {
            if (ke.NIL != assertion_handles.valid_assertionP(dependent, (SubLObject)ke.UNPROVIDED) && ke.NIL == ke_blast_assertion(dependent)) {
                successP = (SubLObject)ke.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 47083L)
    public static SubLObject ke_change_assertion_direction(final SubLObject assertion, final SubLObject new_direction) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert ke.NIL != enumeration_types.direction_p(new_direction) : new_direction;
        if (ke.NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_direction = assertions_high.assertion_direction(assertion);
            if (!old_direction.equal(new_direction)) {
                final SubLObject strength = assertions_high.assertion_strength(assertion);
                ke_reassert_assertion(assertion, strength, new_direction);
                return assertion;
            }
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 47672L)
    public static SubLObject ke_shoehorn_rule_forward(final SubLObject rule_assertion) {
        assert ke.NIL != assertions_high.rule_assertionP(rule_assertion) : rule_assertion;
        ke_assert((SubLObject)ConsesLow.list(ke.$const98$pragmaticRequirement, (SubLObject)ke.$list99, rule_assertion), assertions_high.assertion_mt(rule_assertion), (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
        ke_change_assertion_direction(rule_assertion, (SubLObject)ke.$kw49$FORWARD);
        ke_unassert((SubLObject)ConsesLow.list(ke.$const98$pragmaticRequirement, (SubLObject)ke.$list99, rule_assertion), assertions_high.assertion_mt(rule_assertion));
        return rule_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 48140L)
    public static SubLObject ke_change_assertion_strength(final SubLObject assertion, final SubLObject new_strength) {
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert ke.NIL != enumeration_types.el_strength_p(new_strength) : new_strength;
        if (ke.NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_strength = assertions_high.assertion_strength(assertion);
            if (!old_strength.equal(new_strength)) {
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                ke_reassert_assertion(assertion, new_strength, direction);
                return assertion;
            }
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 48636L)
    public static SubLObject ke_change_assertion_mt(final SubLObject assertion, final SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == ke.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)ke.NIL;
        }
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert ke.NIL != hlmt.hlmt_p(new_mt) : new_mt;
        if (ke.NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_mt = assertions_high.assertion_mt(assertion);
            if (!old_mt.equal(new_mt)) {
                final SubLObject formula = ke_assertion_edit_formula(assertion);
                return ke_convert_assertion(assertion, formula, new_mt, meta_assertions_to_preserve);
            }
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 49119L)
    public static SubLObject ke_convert_assertion(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (new_mt == ke.UNPROVIDED) {
            new_mt = (SubLObject)ke.NIL;
        }
        if (meta_assertions_to_preserve == ke.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)ke.NIL;
        }
        if (ke.NIL != meta_assertions_to_preserve) {
            return ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, new_formula, new_mt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
        }
        return ke_edit_assertion(assertion, new_formula, new_mt, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 49755L)
    public static SubLObject old_constant_names(final SubLObject string) {
        if (ke.NIL != ke.$old_constant_names_table$.getGlobalValue()) {
            return Values.values(Hashtables.gethash(string, ke.$old_constant_names_table$.getGlobalValue(), (SubLObject)ke.UNPROVIDED));
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 49963L)
    public static SubLObject initialize_old_constant_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = kb_indexing.num_predicate_extent_index(ke.$const38$oldConstantName, ke.$const20$BookkeepingMt);
        if (!ke.$old_constant_names_table$.getGlobalValue().isHashtable()) {
            ke.$old_constant_names_table$.setGlobalValue(Hashtables.make_hash_table(total, Symbols.symbol_function((SubLObject)ke.EQUALP), (SubLObject)ke.UNPROVIDED));
        }
        Hashtables.clrhash(ke.$old_constant_names_table$.getGlobalValue());
        SubLObject sofar = (SubLObject)ke.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)ke.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)ke.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)ke.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)ke.$str102$Initializing_old_constant_name_ta);
                final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$35 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke.$sym23$RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(ke.$const20$BookkeepingMt, thread);
                    final SubLObject pred_var = ke.$const38$oldConstantName;
                    if (ke.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)ke.NIL;
                        final SubLObject _prev_bind_0_$35 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$36 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$38 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$39 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)ke.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)ke.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)ke.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)ke.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((ke.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : ke.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = (SubLObject)ke.NIL;
                            final SubLObject token_var = (SubLObject)ke.NIL;
                            while (ke.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (ke.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)ke.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)ke.$kw24$GAF, (SubLObject)ke.$kw103$TRUE, (SubLObject)ke.NIL);
                                        SubLObject done_var_$40 = (SubLObject)ke.NIL;
                                        final SubLObject token_var_$41 = (SubLObject)ke.NIL;
                                        while (ke.NIL == done_var_$40) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                            final SubLObject valid_$42 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$41.eql(gaf));
                                            if (ke.NIL != valid_$42) {
                                                sofar = Numbers.add(sofar, (SubLObject)ke.ONE_INTEGER);
                                                utilities_macros.note_percent_progress(sofar, total);
                                                if (ke.NIL != assertions_high.gaf_assertionP(gaf)) {
                                                    final SubLObject constant = assertions_high.gaf_arg(gaf, (SubLObject)ke.ONE_INTEGER);
                                                    final SubLObject string = assertions_high.gaf_arg(gaf, (SubLObject)ke.TWO_INTEGER);
                                                    cache_old_constant_name(string, constant);
                                                }
                                            }
                                            done_var_$40 = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == valid_$42);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (ke.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(ke.NIL == valid);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$39, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$38, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$36, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$35, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$35, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Hashtables.hash_table_count(ke.$old_constant_names_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 50794L)
    public static SubLObject cache_old_constant_name(final SubLObject string, final SubLObject constant) {
        if (ke.NIL != ke.$old_constant_names_table$.getGlobalValue()) {
            final SubLObject entry = old_constant_names(string);
            Hashtables.sethash(string, ke.$old_constant_names_table$.getGlobalValue(), conses_high.adjoin(constant, entry, Symbols.symbol_function((SubLObject)ke.EQUALP), (SubLObject)ke.UNPROVIDED));
            return (SubLObject)ke.T;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 51052L)
    public static SubLObject decache_old_constant_name(final SubLObject string, final SubLObject constant) {
        if (ke.NIL != ke.$old_constant_names_table$.getGlobalValue()) {
            SubLObject entry = old_constant_names(string);
            if (ke.NIL != entry) {
                entry = Sequences.delete(constant, entry, Symbols.symbol_function((SubLObject)ke.EQUALP), (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED);
                if (ke.NIL == entry) {
                    Hashtables.remhash(string, ke.$old_constant_names_table$.getGlobalValue());
                }
                else {
                    Hashtables.sethash(string, ke.$old_constant_names_table$.getGlobalValue(), entry);
                }
            }
            return (SubLObject)ke.T;
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 51422L)
    public static SubLObject do_edit_op(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke.NIL != api_control_vars.$use_local_queueP$.getDynamicValue(thread)) {
            return operation_queues.add_to_local_queue(form, (SubLObject)ke.T);
        }
        return Eval.eval(form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 51857L)
    public static SubLObject find_assertions_via_tl(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = ke.$ke_assertion_edit_formula_find_func$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)ke.$sym3$QUOTE) || pcase_var.eql((SubLObject)ke.$sym106$ASSERTION_TL_FORMULA)) {
            return canon_tl.find_assertions_from_tl_formula(sentence, mt);
        }
        if (pcase_var.eql((SubLObject)ke.$sym3$QUOTE) || pcase_var.eql((SubLObject)ke.$sym104$ASSERTION_TL_IST_FORMULA)) {
            thread.resetMultipleValues();
            final SubLObject sentence_$45 = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)ke.UNPROVIDED);
            final SubLObject mt_$46 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$45;
            mt = mt_$46;
            return canon_tl.find_assertions_from_tl_formula(sentence, mt);
        }
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 52367L)
    public static SubLObject ke_assertion_edit_formula(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return Functions.funcall(ke.$ke_assertion_edit_formula_display_func$.getDynamicValue(thread), assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 52588L)
    public static SubLObject ke_assertion_find_formula(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return Functions.funcall(ke.$ke_assertion_edit_formula_find_func$.getDynamicValue(thread), assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 52980L)
    public static SubLObject cyclist_is_guest() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((ke.NIL != system_parameters.$allow_guest_to_editP$.getDynamicValue(thread)) ? ke.NIL : operation_communication.the_cyclist_is_guestP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 53185L)
    public static SubLObject ensure_cyclist_ok() {
        if (ke.NIL == cyclist_is_guest()) {
            return (SubLObject)ke.T;
        }
        Errors.error((SubLObject)ke.$str107$KB_editing_is_not_allowed_for_use, operation_communication.the_cyclist());
        return (SubLObject)ke.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke.lisp", position = 53360L)
    public static SubLObject ke_eval_now(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)ke.NIL;
        SubLObject result = (SubLObject)ke.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ke.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_eval_int(form);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ke.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (ke.NIL != error) {
            fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)ke.$kw108$GENERIC_ERROR, error));
        }
        if (ke.NIL == control_vars.$use_transcriptP$.getDynamicValue(thread)) {
            return (SubLObject)ke.NIL;
        }
        if (ke.NIL != fi.fi_error_signaledP()) {
            return Values.values((SubLObject)ke.NIL, fi.fi_get_error_int());
        }
        operation_queues.add_to_transcript_queue(fi.fi_construct_form_to_enqueue((SubLObject)ke.$sym109$FI_EVAL, form, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED, (SubLObject)ke.UNPROVIDED));
        return Values.values(result, (SubLObject)ke.NIL);
    }
    
    public static SubLObject declare_ke_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_create", "KE-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_create_from_serialization", "KE-CREATE-FROM-SERIALIZATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_create_internal", "KE-CREATE-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_create_now", "KE-CREATE-NOW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_find_or_create_now", "KE-FIND-OR-CREATE-NOW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_recreate_now", "KE-RECREATE-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_merge", "KE-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_merge_now", "KE-MERGE-NOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_kill", "KE-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_kill_now", "KE-KILL-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_recreate", "KE-RECREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "rename_code_constant", "RENAME-CODE-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_rename", "KE-RENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_rename_code_constant", "KE-RENAME-CODE-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_rename_internal", "KE-RENAME-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "note_old_constant_name", "NOTE-OLD-CONSTANT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_rename_now", "KE-RENAME-NOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assert", "KE-ASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_reassert_assertion_now", "KE-REASSERT-ASSERTION-NOW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_reassert_assertion_now_int", "KE-REASSERT-ASSERTION-NOW-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_reassert_assertion", "KE-REASSERT-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_reassert_assertion_int", "KE-REASSERT-ASSERTION-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_repropagate_assertion_now", "KE-REPROPAGATE-ASSERTION-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_repropagate_assertion", "KE-REPROPAGATE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_repropagate_assertion_now_int", "KE-REPROPAGATE-ASSERTION-NOW-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_repropagate_assertion_int", "KE-REPROPAGATE-ASSERTION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assert_now", "KE-ASSERT-NOW", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assert_wff_now", "KE-ASSERT-WFF-NOW", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assert_now_and_propagate_later", "KE-ASSERT-NOW-AND-PROPAGATE-LATER", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assert_now_int", "KE-ASSERT-NOW-INT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assert_with_implicature", "KE-ASSERT-WITH-IMPLICATURE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assert_now_with_implicature", "KE-ASSERT-NOW-WITH-IMPLICATURE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assert_with_implicature_int", "KE-ASSERT-WITH-IMPLICATURE-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assert_with_implicature_int_assert", "KE-ASSERT-WITH-IMPLICATURE-INT-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_unassert", "KE-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_unassert_assertion", "KE-UNASSERT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_unassert_now", "KE-UNASSERT-NOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_unassert_assertion_now", "KE-UNASSERT-ASSERTION-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit", "KE-EDIT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_now", "KE-EDIT-NOW", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_assertion", "KE-EDIT-ASSERTION", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_assertion_preserving_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_assertion_now_preserving_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-META-ASSERTIONS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_assertion_preserving_meta_assertions_int", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_assertion_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_assertion_now_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_null_edit_assertion", "KE-NULL-EDIT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_compute_new_meta_assertion_assertibles", "KE-EDIT-COMPUTE-NEW-META-ASSERTION-ASSERTIBLES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "extract_old_meta_assertion_info", "EXTRACT-OLD-META-ASSERTION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_add_assertion_original_text", "KE-ADD-ASSERTION-ORIGINAL-TEXT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_assertion_strings", "KE-EDIT-ASSERTION-STRINGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_recanonicalize_assertion", "KE-RECANONICALIZE-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_recanonicalize_assertion_now", "KE-RECANONICALIZE-ASSERTION-NOW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_assertion_but_not_bookkeeping", "KE-EDIT-ASSERTION-BUT-NOT-BOOKKEEPING", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_edit_assertion_now_but_not_bookkeeping", "KE-EDIT-ASSERTION-NOW-BUT-NOT-BOOKKEEPING", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "formulas_differ_only_in_strings", "FORMULAS-DIFFER-ONLY-IN-STRINGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "tree_equal_ignoring_type", "TREE-EQUAL-IGNORING-TYPE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_blast", "KE-BLAST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_blast_assertion", "KE-BLAST-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_rename_variables", "KE-RENAME-VARIABLES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_add_argument", "KE-ADD-ARGUMENT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_add_argument_now", "KE-ADD-ARGUMENT-NOW", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_remove_argument", "KE-REMOVE-ARGUMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_remove_deduction", "KE-REMOVE-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_tms_reconsider_term", "KE-TMS-RECONSIDER-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_tms_reconsider_formula", "KE-TMS-RECONSIDER-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_tms_reconsider_formula_now", "KE-TMS-RECONSIDER-FORMULA-NOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_tms_reconsider_formula_now_int", "KE-TMS-RECONSIDER-FORMULA-NOW-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_tms_reconsider_assertion", "KE-TMS-RECONSIDER-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_tms_reconsider_assertion_now", "KE-TMS-RECONSIDER-ASSERTION-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_blast_all_dependents", "KE-BLAST-ALL-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_change_assertion_direction", "KE-CHANGE-ASSERTION-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_shoehorn_rule_forward", "KE-SHOEHORN-RULE-FORWARD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_change_assertion_strength", "KE-CHANGE-ASSERTION-STRENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_change_assertion_mt", "KE-CHANGE-ASSERTION-MT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_convert_assertion", "KE-CONVERT-ASSERTION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "old_constant_names", "OLD-CONSTANT-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "initialize_old_constant_names", "INITIALIZE-OLD-CONSTANT-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "cache_old_constant_name", "CACHE-OLD-CONSTANT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "decache_old_constant_name", "DECACHE-OLD-CONSTANT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "do_edit_op", "DO-EDIT-OP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "find_assertions_via_tl", "FIND-ASSERTIONS-VIA-TL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assertion_edit_formula", "KE-ASSERTION-EDIT-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_assertion_find_formula", "KE-ASSERTION-FIND-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "cyclist_is_guest", "CYCLIST-IS-GUEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ensure_cyclist_ok", "ENSURE-CYCLIST-OK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke", "ke_eval_now", "KE-EVAL-NOW", 1, 0, false);
        return (SubLObject)ke.NIL;
    }
    
    public static SubLObject init_ke_file() {
        ke.$note_merged_constant_name$ = SubLFiles.defparameter("*NOTE-MERGED-CONSTANT-NAME*", (SubLObject)ke.T);
        ke.$note_old_constant_name$ = SubLFiles.defparameter("*NOTE-OLD-CONSTANT-NAME*", (SubLObject)ke.T);
        ke.$ke_assert_now_assume_wff_test$ = SubLFiles.defparameter("*KE-ASSERT-NOW-ASSUME-WFF-TEST*", (SubLObject)ke.$sym58$FALSE);
        ke.$check_if_already_ke_unassertedP$ = SubLFiles.defparameter("*CHECK-IF-ALREADY-KE-UNASSERTED?*", (SubLObject)ke.NIL);
        ke.$ke_edit_use_fi_edit$ = SubLFiles.deflexical("*KE-EDIT-USE-FI-EDIT*", (SubLObject)(maybeDefault((SubLObject)ke.$sym68$_KE_EDIT_USE_FI_EDIT_, ke.$ke_edit_use_fi_edit$, ke.T)));
        ke.$ke_add_assertion_original_textP$ = SubLFiles.defparameter("*KE-ADD-ASSERTION-ORIGINAL-TEXT?*", (SubLObject)ke.NIL);
        ke.$old_constant_names_table$ = SubLFiles.deflexical("*OLD-CONSTANT-NAMES-TABLE*", (SubLObject)(maybeDefault((SubLObject)ke.$sym101$_OLD_CONSTANT_NAMES_TABLE_, ke.$old_constant_names_table$, ke.NIL)));
        ke.$ke_assertion_edit_formula_find_func$ = SubLFiles.defparameter("*KE-ASSERTION-EDIT-FORMULA-FIND-FUNC*", (SubLObject)ke.$sym104$ASSERTION_TL_IST_FORMULA);
        ke.$ke_assertion_edit_formula_display_func$ = SubLFiles.defparameter("*KE-ASSERTION-EDIT-FORMULA-DISPLAY-FUNC*", (SubLObject)ke.$sym105$ASSERTION_EL_FORMULA);
        return (SubLObject)ke.NIL;
    }
    
    public static SubLObject setup_ke_file() {
        access_macros.register_external_symbol((SubLObject)ke.$sym0$KE_CREATE);
        utilities_macros.register_cyc_api_function((SubLObject)ke.$sym11$KE_CREATE_NOW, (SubLObject)ke.$list12, (SubLObject)ke.$str13$Create_new_constant_now_and_add_o, (SubLObject)ke.NIL, (SubLObject)ke.$list14);
        access_macros.register_external_symbol((SubLObject)ke.$sym15$KE_MERGE);
        access_macros.register_external_symbol((SubLObject)ke.$sym25$KE_KILL);
        utilities_macros.register_cyc_api_function((SubLObject)ke.$sym28$KE_KILL_NOW, (SubLObject)ke.$list29, (SubLObject)ke.$str30$Kill_FORT_now_and_add_operation_t, (SubLObject)ke.NIL, (SubLObject)ke.$list31);
        access_macros.register_external_symbol((SubLObject)ke.$sym39$KE_ASSERT);
        utilities_macros.register_cyc_api_function((SubLObject)ke.$sym50$KE_ASSERT_NOW, (SubLObject)ke.$list51, (SubLObject)ke.$str52$Assert_FORMULA_in_MT_now_and_add_, (SubLObject)ke.NIL, (SubLObject)ke.$list31);
        utilities_macros.register_cyc_api_function((SubLObject)ke.$sym54$KE_ASSERT_WFF_NOW, (SubLObject)ke.$list51, (SubLObject)ke.$str55$Assert_FORMULA_in_MT_now_and_add_, (SubLObject)ke.NIL, (SubLObject)ke.$list31);
        utilities_macros.register_cyc_api_function((SubLObject)ke.$sym56$KE_ASSERT_NOW_AND_PROPAGATE_LATER, (SubLObject)ke.$list51, (SubLObject)ke.$str57$Assert_FORMULA_in_MT_now_and_add_, (SubLObject)ke.NIL, (SubLObject)ke.$list31);
        access_macros.register_external_symbol((SubLObject)ke.$sym62$KE_UNASSERT);
        utilities_macros.register_cyc_api_function((SubLObject)ke.$sym65$KE_UNASSERT_NOW, (SubLObject)ke.$list66, (SubLObject)ke.$str67$Unassert_FORMULA_in_MT_now_and_ad, (SubLObject)ke.NIL, (SubLObject)ke.$list31);
        subl_macro_promotions.declare_defglobal((SubLObject)ke.$sym68$_KE_EDIT_USE_FI_EDIT_);
        utilities_macros.register_cyc_api_function((SubLObject)ke.$sym70$KE_EDIT, (SubLObject)ke.$list71, (SubLObject)ke.$str72$Add_to_the_agenda_operations_that, (SubLObject)ke.NIL, (SubLObject)ke.$list73);
        utilities_macros.register_cyc_api_function((SubLObject)ke.$sym74$KE_EDIT_NOW, (SubLObject)ke.$list71, (SubLObject)ke.$str75$Immediately_remove_OLD_FORMULA_an, (SubLObject)ke.NIL, (SubLObject)ke.NIL);
        access_macros.register_external_symbol((SubLObject)ke.$sym78$KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS);
        subl_macro_promotions.declare_defglobal((SubLObject)ke.$sym101$_OLD_CONSTANT_NAMES_TABLE_);
        return (SubLObject)ke.NIL;
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
        me = (SubLFile)new ke();
        ke.$note_merged_constant_name$ = null;
        ke.$note_old_constant_name$ = null;
        ke.$ke_assert_now_assume_wff_test$ = null;
        ke.$check_if_already_ke_unassertedP$ = null;
        ke.$ke_edit_use_fi_edit$ = null;
        ke.$ke_add_assertion_original_textP$ = null;
        ke.$old_constant_names_table$ = null;
        ke.$ke_assertion_edit_formula_find_func$ = null;
        ke.$ke_assertion_edit_formula_display_func$ = null;
        $sym0$KE_CREATE = SubLObjectFactory.makeSymbol("KE-CREATE");
        $kw1$QUEUED = SubLObjectFactory.makeKeyword("QUEUED");
        $sym2$FI_TIMESTAMP_CONSTANT = SubLObjectFactory.makeSymbol("FI-TIMESTAMP-CONSTANT");
        $sym3$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym4$FI_CREATE = SubLObjectFactory.makeSymbol("FI-CREATE");
        $sym5$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw6$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym7$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw8$FATAL_ERROR = SubLObjectFactory.makeKeyword("FATAL-ERROR");
        $sym9$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-ERROR"), (SubLObject)SubLObjectFactory.makeString("An unknown error has occurred"));
        $sym11$KE_CREATE_NOW = SubLObjectFactory.makeSymbol("KE-CREATE-NOW");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"));
        $str13$Create_new_constant_now_and_add_o = SubLObjectFactory.makeString("Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null \nit is used, otherwise a unique identifier is generated.\n@return 0 constant ;; new constant if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param NAME string\n@param EXTERNAL-ID guid-p\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym15$KE_MERGE = SubLObjectFactory.makeSymbol("KE-MERGE");
        $str16$Skip_this_operation = SubLObjectFactory.makeString("Skip this operation");
        $str17$Constant__S_cannot_be_merged_beca = SubLObjectFactory.makeString("Constant ~S cannot be merged because it is mentioned in code");
        $sym18$FI_MERGE = SubLObjectFactory.makeSymbol("FI-MERGE");
        $const19$mergedConstantName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mergedConstantName"));
        $const20$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $const21$mergedConstantGUID = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mergedConstantGUID"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FATAL-ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)ke.NIL, (SubLObject)SubLObjectFactory.makeString("~A is mentioned in code and cannot be merged."), (SubLObject)SubLObjectFactory.makeSymbol("KILL-FORT")));
        $sym23$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $kw24$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym25$KE_KILL = SubLObjectFactory.makeSymbol("KE-KILL");
        $sym26$FI_KILL = SubLObjectFactory.makeSymbol("FI-KILL");
        $str27$Constant__S_cannot_be_killed_beca = SubLObjectFactory.makeString("Constant ~S cannot be killed because it is mentioned in code");
        $sym28$KE_KILL_NOW = SubLObjectFactory.makeSymbol("KE-KILL-NOW");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"));
        $str30$Kill_FORT_now_and_add_operation_t = SubLObjectFactory.makeString("Kill FORT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORT fort\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym32$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str33$Constant__S_cannot_be_renamed_bec = SubLObjectFactory.makeString("Constant ~S cannot be renamed because it is mentioned in code");
        $str34$Use_KE_RENAME = SubLObjectFactory.makeString("Use KE-RENAME");
        $str35$Constant__S_is_not_mentioned_in_c = SubLObjectFactory.makeString("Constant ~S is not mentioned in code");
        $sym36$FI_RENAME = SubLObjectFactory.makeSymbol("FI-RENAME");
        $sym37$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $const38$oldConstantName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("oldConstantName"));
        $sym39$KE_ASSERT = SubLObjectFactory.makeSymbol("KE-ASSERT");
        $kw40$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym41$FI_ASSERT = SubLObjectFactory.makeSymbol("FI-ASSERT");
        $sym42$FI_TIMESTAMP_ASSERTION = SubLObjectFactory.makeSymbol("FI-TIMESTAMP-ASSERTION");
        $sym43$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym44$EL_STRENGTH_P = SubLObjectFactory.makeSymbol("EL-STRENGTH-P");
        $sym45$DIRECTION_P = SubLObjectFactory.makeSymbol("DIRECTION-P");
        $sym46$FI_REASSERT = SubLObjectFactory.makeSymbol("FI-REASSERT");
        $sym47$FI_REASSERT_INT = SubLObjectFactory.makeSymbol("FI-REASSERT-INT");
        $kw48$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $kw49$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $sym50$KE_ASSERT_NOW = SubLObjectFactory.makeSymbol("KE-ASSERT-NOW");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"));
        $str52$Assert_FORMULA_in_MT_now_and_add_ = SubLObjectFactory.makeString("Assert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
        $sym53$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym54$KE_ASSERT_WFF_NOW = SubLObjectFactory.makeSymbol("KE-ASSERT-WFF-NOW");
        $str55$Assert_FORMULA_in_MT_now_and_add_ = SubLObjectFactory.makeString("Assert FORMULA in MT now and add operation to transcript.\nFORMULA is assumed to be WFF.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
        $sym56$KE_ASSERT_NOW_AND_PROPAGATE_LATER = SubLObjectFactory.makeSymbol("KE-ASSERT-NOW-AND-PROPAGATE-LATER");
        $str57$Assert_FORMULA_in_MT_now_and_add_ = SubLObjectFactory.makeString("Assert FORMULA in MT now and add operation to transcript.  May return before forward-propagation is complete, but not\n   before FORMULA has been asserted in MT.\n   @return 0 boolean ;; t if success, o/w nil\n   @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n   @param FORMULA list\n   @param MT microtheory\n   @param STRENGTH keyword\n   @param DIRECTION keyword\n   @note Assumes cyclist is ok.\n   @note The salient property of this function is that it never throws an error.");
        $sym58$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $sym59$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $kw60$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $kw61$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $sym62$KE_UNASSERT = SubLObjectFactory.makeSymbol("KE-UNASSERT");
        $sym63$FI_UNASSERT = SubLObjectFactory.makeSymbol("FI-UNASSERT");
        $str64$Sentence__S_in_mt__S__is_not_in_t = SubLObjectFactory.makeString("Sentence ~S in mt ~S~%is not in the KB and you are trying to unassert it.");
        $sym65$KE_UNASSERT_NOW = SubLObjectFactory.makeSymbol("KE-UNASSERT-NOW");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str67$Unassert_FORMULA_in_MT_now_and_ad = SubLObjectFactory.makeString("Unassert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
        $sym68$_KE_EDIT_USE_FI_EDIT_ = SubLObjectFactory.makeSymbol("*KE-EDIT-USE-FI-EDIT*");
        $sym69$FI_EDIT = SubLObjectFactory.makeSymbol("FI-EDIT");
        $sym70$KE_EDIT = SubLObjectFactory.makeSymbol("KE-EDIT");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MT"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"));
        $str72$Add_to_the_agenda_operations_that = SubLObjectFactory.makeString("Add to the agenda operations that will remove OLD-FORMULA and replace it with NEW-FORMULA\n   @param OLD-FORMULA cycl-sentence-p; the formula to remove\n   @param NEW-FORMULA cycl-sentence-p; the formula to add\n   @param OLD-MT mt?; the mt in which OLD-FORMULA is currently asserted\n   @param NEW-MT mt?; the mt in which NEW-FORMULA should be asserted\n   @param STRENGTH keywordp\n   @param DIRECTION keywordp");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP"));
        $sym74$KE_EDIT_NOW = SubLObjectFactory.makeSymbol("KE-EDIT-NOW");
        $str75$Immediately_remove_OLD_FORMULA_an = SubLObjectFactory.makeString("Immediately remove OLD-FORMULA and replace it with NEW-FORMULA.\n   If NEW-FORMULA can't be added, don't remove OLD-FORMULA.\n   @param OLD-FORMULA cycl-sentence-p; the formula to remove\n   @param NEW-FORMULA cycl-sentence-p; the formula to add\n   @param OLD-MT mt?; the mt in which OLD-FORMULA is currently asserted\n   @param NEW-MT mt?; the mt in which NEW-FORMULA should be asserted\n   @param STRENGTH keywordp\n   @param DIRECTION keywordp");
        $kw76$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-META-ASSERTION-EL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-META-ASSERTION-MT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-META-ASSERTION-STRENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-META-ASSERTION-DIRECTION"));
        $sym78$KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS = SubLObjectFactory.makeSymbol("KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS");
        $const79$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-META-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-META-ASSERTION-MT"));
        $str81$_pre_ = SubLObjectFactory.makeString("<pre>");
        $str82$__code_ = SubLObjectFactory.makeString("</code>");
        $const83$assertionOriginalText = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionOriginalText"));
        $str84$Sentences_do_not_differ_only_in_s = SubLObjectFactory.makeString("Sentences do not differ only in strings");
        $sym85$FI_BLAST = SubLObjectFactory.makeSymbol("FI-BLAST");
        $sym86$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym87$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $sym88$FI_RENAME_VARIABLES = SubLObjectFactory.makeSymbol("FI-RENAME-VARIABLES");
        $sym89$FI_ADD_ARGUMENT = SubLObjectFactory.makeSymbol("FI-ADD-ARGUMENT");
        $kw90$CHECK_WFF_ = SubLObjectFactory.makeKeyword("CHECK-WFF?");
        $sym91$FI_REMOVE_ARGUMENT = SubLObjectFactory.makeSymbol("FI-REMOVE-ARGUMENT");
        $sym92$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $sym93$CONVERT_HL_SUPPORT_TO_TL_SUPPORT = SubLObjectFactory.makeSymbol("CONVERT-HL-SUPPORT-TO-TL-SUPPORT");
        $sym94$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym95$FI_TMS_RECONSIDER_TERM = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-TERM");
        $sym96$FI_TMS_RECONSIDER_FORMULA = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-FORMULA");
        $sym97$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $const98$pragmaticRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pragmaticRequirement"));
        $list99 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)ke.ONE_INTEGER, (SubLObject)ke.ONE_INTEGER);
        $sym100$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym101$_OLD_CONSTANT_NAMES_TABLE_ = SubLObjectFactory.makeSymbol("*OLD-CONSTANT-NAMES-TABLE*");
        $str102$Initializing_old_constant_name_ta = SubLObjectFactory.makeString("Initializing old constant name table");
        $kw103$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym104$ASSERTION_TL_IST_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-TL-IST-FORMULA");
        $sym105$ASSERTION_EL_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-EL-FORMULA");
        $sym106$ASSERTION_TL_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-TL-FORMULA");
        $str107$KB_editing_is_not_allowed_for_use = SubLObjectFactory.makeString("KB editing is not allowed for users logged in as ~S.");
        $kw108$GENERIC_ERROR = SubLObjectFactory.makeKeyword("GENERIC-ERROR");
        $sym109$FI_EVAL = SubLObjectFactory.makeSymbol("FI-EVAL");
    }
}

/*

	Total time: 1037 ms
	
*/