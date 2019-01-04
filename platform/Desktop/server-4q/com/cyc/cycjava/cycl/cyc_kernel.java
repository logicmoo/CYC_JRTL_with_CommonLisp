package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_kernel extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_kernel";
    public static final String myFingerPrint = "7862ead2c5cc34499478eadba8f9dec994372e0f8452aa91ea05f2ddc484c40c";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 9221L)
    private static SubLSymbol $assert_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 21677L)
    private static SubLSymbol $closed_query_bindings$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 23171L)
    private static SubLSymbol $closed_query_success_token$;
    private static final SubLSymbol $sym0$NEW_CONSTANT_NAME_SPEC_P;
    private static final SubLSymbol $sym1$FI_CREATE;
    private static final SubLSymbol $sym2$CYC_CREATE_NEW_PERMANENT;
    private static final SubLList $list3;
    private static final SubLString $str4$Creates_a_new_constant_with_name_;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$CYC_CREATE_NEW_EPHEMERAL;
    private static final SubLString $str8$Creates_a_new_constant_with_name_;
    private static final SubLSymbol $sym9$CONSTANT_EXTERNAL_ID_P;
    private static final SubLSymbol $sym10$CYC_CREATE;
    private static final SubLList $list11;
    private static final SubLString $str12$Create_a_new_constant_with_id_EXT;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$VALID_CONSTANT_NAME_P;
    private static final SubLSymbol $sym15$CYC_FIND_OR_CREATE;
    private static final SubLString $str16$Return_constant_with_NAME_if_it_i;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$CONSTANT_P;
    private static final SubLSymbol $sym19$CYC_RENAME;
    private static final SubLList $list20;
    private static final SubLString $str21$Change_name_of_CONSTANT_to_NAME__;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$CYC_RECREATE;
    private static final SubLList $list25;
    private static final SubLString $str26$Doesn_t_unassert_the_bookkeeping_;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$UNNAMED;
    private static final SubLSymbol $sym29$FORT_P;
    private static final SubLSymbol $sym30$CYC_KILL;
    private static final SubLList $list31;
    private static final SubLString $str32$Kill_FORT_and_all_its_uses_from_t;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLString $str35$cyc_rewrite_is_not_implemented_ye;
    private static final SubLSymbol $sym36$CYC_REWRITE;
    private static final SubLList $list37;
    private static final SubLString $str38$_moves__all_asserted_arguments_fr;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$CYC_MERGE;
    private static final SubLList $list42;
    private static final SubLString $str43$Move_asserted_assertions_on_KILL_;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$ASSERT_PROPERTY_P;
    private static final SubLSymbol $sym47$POSSIBLY_SENTENCE_P;
    private static final SubLSymbol $sym48$POSSIBLY_MT_P;
    private static final SubLSymbol $sym49$ASSERT_PROPERTIES_P;
    private static final SubLSymbol $kw50$STRENGTH;
    private static final SubLSymbol $kw51$DEFAULT;
    private static final SubLSymbol $kw52$DIRECTION;
    private static final SubLSymbol $kw53$CHECK_WFF_;
    private static final SubLSymbol $kw54$FORWARD_RULES;
    private static final SubLSymbol $sym55$CYC_ASSERT;
    private static final SubLList $list56;
    private static final SubLString $str57$Assert_SENTENCE_in_the_specified_;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$CYC_DENY;
    private static final SubLString $str60$Deny_SENTENCE_in_the_specified_MT;
    private static final SubLSymbol $sym61$CYC_UNASSERT;
    private static final SubLList $list62;
    private static final SubLString $str63$Remove_the_assertions_canonicaliz;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$CYC_EDIT;
    private static final SubLList $list66;
    private static final SubLString $str67$Unassert_OLD_SENTENCE_in_OLD_MT__;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$LIST_OF_CYCL_SUPPORT_P;
    private static final SubLSymbol $sym70$BOOLEANP;
    private static final SubLSymbol $sym71$CYC_ADD_ARGUMENT;
    private static final SubLList $list72;
    private static final SubLString $str73$Tell_Cyc_to_conclude_SENTENCE__op;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$CYC_REMOVE_ARGUMENT;
    private static final SubLList $list76;
    private static final SubLString $str77$Remove_the_argument_for_SENTENCE_;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$CYC_REMOVE_ALL_ARGUMENTS;
    private static final SubLString $str80$Remove_all_arguments_for_SENTENCE;
    private static final SubLSymbol $sym81$LEGACY_QUERY_PROPERTIES_P;
    private static final SubLSymbol $kw82$BACKCHAIN;
    private static final SubLSymbol $kw83$NUMBER;
    private static final SubLSymbol $kw84$TIME;
    private static final SubLSymbol $kw85$DEPTH;
    private static final SubLSymbol $kw86$CONDITIONAL_SENTENCE;
    private static final SubLSymbol $sym87$CYC_QUERY;
    private static final SubLString $str88$Query_for_bindings_for_free_varia;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$CLOSED_QUERY_JUSTIFIED_BINDINGS_P;
    private static final SubLSymbol $kw92$LAST;
    private static final SubLSymbol $sym93$QUERY_ID_P;
    private static final SubLString $str94$cyc_continue_query_is_deprecated_;
    private static final SubLSymbol $sym95$CYC_CONTINUE_QUERY;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLString $str98$Continues_a_query_started_by__xre;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$CYC_TMS_RECONSIDER_SENTENCE;
    private static final SubLString $str101$Reconsider_all_arguments_for_SENT;
    private static final SubLSymbol $sym102$ALIST_P;
    private static final SubLSymbol $sym103$CYC_RENAME_VARIABLES;
    private static final SubLList $list104;
    private static final SubLString $str105$Rename_the_variables_in_SENTENCE_;
    private static final SubLList $list106;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 1964L)
    public static SubLObject cyc_create_new_permanent(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(name, cyc_kernel.$sym0$NEW_CONSTANT_NAME_SPEC_P);
        final SubLObject creation_form = (SubLObject)ConsesLow.list((SubLObject)cyc_kernel.$sym1$FI_CREATE, name, constants_high.make_constant_external_id());
        SubLObject constant = (SubLObject)cyc_kernel.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)cyc_kernel.NIL, thread);
            constant = eval_in_api.cyc_api_eval(creation_form);
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 3142L)
    public static SubLObject cyc_create_new_ephemeral(final SubLObject name) {
        enforceType(name, cyc_kernel.$sym0$NEW_CONSTANT_NAME_SPEC_P);
        return cyc_create(name, constants_high.make_constant_external_id());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 3541L)
    public static SubLObject cyc_create(final SubLObject name, final SubLObject external_id) {
        enforceType(name, cyc_kernel.$sym0$NEW_CONSTANT_NAME_SPEC_P);
        if (cyc_kernel.NIL != external_id) {
            enforceType(external_id, cyc_kernel.$sym9$CONSTANT_EXTERNAL_ID_P);
        }
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        result = fi.fi_create_int(name, external_id);
        cyc_bookkeeping.perform_constant_bookkeeping(result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 3993L)
    public static SubLObject cyc_find_or_create(final SubLObject name, final SubLObject external_id) {
        enforceType(name, cyc_kernel.$sym14$VALID_CONSTANT_NAME_P);
        if (cyc_kernel.NIL != external_id) {
            enforceType(external_id, cyc_kernel.$sym9$CONSTANT_EXTERNAL_ID_P);
        }
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        result = fi.fi_find_int(name);
        if (cyc_kernel.NIL == result) {
            result = cyc_create(name, external_id);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 4530L)
    public static SubLObject cyc_find_or_create_new_permanent(final SubLObject name) {
        assert cyc_kernel.NIL != constant_completion_high.valid_constant_name_p(name) : name;
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        result = fi.fi_find_int(name);
        if (cyc_kernel.NIL == result) {
            result = cyc_create_new_permanent(name);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 4990L)
    public static SubLObject cyc_rename(final SubLObject constant, final SubLObject name) {
        enforceType(constant, cyc_kernel.$sym18$CONSTANT_P);
        enforceType(name, cyc_kernel.$sym14$VALID_CONSTANT_NAME_P);
        return fi.fi_rename_int(constant, name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 6477L)
    public static SubLObject cyc_recreate(final SubLObject constant) {
        enforceType(constant, cyc_kernel.$sym18$CONSTANT_P);
        constants_high.remove_everything_about_constant(constant);
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 7955L)
    public static SubLObject new_constant_name_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object == cyc_kernel.$kw28$UNNAMED || cyc_kernel.NIL != constant_completion_high.valid_constant_name_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 8078L)
    public static SubLObject cyc_kill(final SubLObject fort) {
        enforceType(fort, cyc_kernel.$sym29$FORT_P);
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        result = fi.fi_kill_int(fort);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 8521L)
    public static SubLObject cyc_rewrite(final SubLObject source_fort, final SubLObject target_fort) {
        enforceType(source_fort, cyc_kernel.$sym29$FORT_P);
        enforceType(target_fort, cyc_kernel.$sym29$FORT_P);
        Errors.error((SubLObject)cyc_kernel.$str35$cyc_rewrite_is_not_implemented_ye);
        return target_fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 8849L)
    public static SubLObject cyc_merge(final SubLObject kill_fort, final SubLObject keep_fort) {
        enforceType(kill_fort, cyc_kernel.$sym29$FORT_P);
        enforceType(keep_fort, cyc_kernel.$sym29$FORT_P);
        return fi.fi_merge_int(kill_fort, keep_fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 9670L)
    public static SubLObject assert_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, cyc_kernel.$assert_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 9763L)
    public static SubLObject assert_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)cyc_kernel.$sym46$ASSERT_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 9862L)
    public static SubLObject get_assert_property(final SubLObject v_properties, final SubLObject indicator, SubLObject v_default) {
        if (v_default == cyc_kernel.UNPROVIDED) {
            v_default = (SubLObject)cyc_kernel.NIL;
        }
        return conses_high.getf(v_properties, indicator, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 9986L)
    public static SubLObject cyc_assert(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        if (v_properties == cyc_kernel.UNPROVIDED) {
            v_properties = (SubLObject)cyc_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        if (cyc_kernel.NIL != mt) {
            enforceType(mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        enforceType(v_properties, cyc_kernel.$sym49$ASSERT_PROPERTIES_P);
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        final SubLObject strength = get_assert_property(v_properties, (SubLObject)cyc_kernel.$kw50$STRENGTH, (SubLObject)cyc_kernel.$kw51$DEFAULT);
        final SubLObject direction = get_assert_property(v_properties, (SubLObject)cyc_kernel.$kw52$DIRECTION, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject check_wffP = get_assert_property(v_properties, (SubLObject)cyc_kernel.$kw53$CHECK_WFF_, (SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue(thread)));
        final SubLObject forward_rules = get_assert_property(v_properties, (SubLObject)cyc_kernel.$kw54$FORWARD_RULES, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread));
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            fi.$assume_assert_sentence_is_wfP$.bind((SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL == check_wffP), thread);
            kb_control_vars.$forward_inference_allowed_rules$.bind(forward_rules, thread);
            result = fi.fi_assert_int(right_sentence, right_mt, strength, direction);
        }
        finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_2, thread);
            fi.$assume_assert_sentence_is_wfP$.rebind(_prev_bind_0, thread);
        }
        if (cyc_kernel.NIL != result) {
            cyc_bookkeeping.perform_assertion_bookkeeping(result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 11933L)
    public static SubLObject cyc_assert_wff(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        if (v_properties == cyc_kernel.UNPROVIDED) {
            v_properties = (SubLObject)cyc_kernel.NIL;
        }
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        final SubLObject new_properties = conses_high.putf(conses_high.copy_list(v_properties), (SubLObject)cyc_kernel.$kw53$CHECK_WFF_, (SubLObject)cyc_kernel.NIL);
        result = cyc_assert(sentence, mt, new_properties);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 12236L)
    public static SubLObject cyc_deny(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        if (v_properties == cyc_kernel.UNPROVIDED) {
            v_properties = (SubLObject)cyc_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        if (cyc_kernel.NIL != mt) {
            enforceType(mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        enforceType(v_properties, cyc_kernel.$sym49$ASSERT_PROPERTIES_P);
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        final SubLObject direction = get_assert_property(v_properties, (SubLObject)cyc_kernel.$kw52$DIRECTION, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject check_wffP = get_assert_property(v_properties, (SubLObject)cyc_kernel.$kw53$CHECK_WFF_, (SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue(thread)));
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding(thread);
        try {
            fi.$assume_assert_sentence_is_wfP$.bind((SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL == check_wffP), thread);
            result = fi.fi_deny_int(right_sentence, right_mt, direction);
        }
        finally {
            fi.$assume_assert_sentence_is_wfP$.rebind(_prev_bind_0, thread);
        }
        cyc_bookkeeping.perform_assertion_bookkeeping(result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 13579L)
    public static SubLObject cyc_unassert(final SubLObject sentence, SubLObject mt) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        if (cyc_kernel.NIL != mt) {
            enforceType(mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = fi.fi_unassert_int(right_sentence, right_mt);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 14613L)
    public static SubLObject cyc_edit(final SubLObject old_sentence, final SubLObject new_sentence, SubLObject old_mt, SubLObject new_mt, SubLObject v_properties) {
        if (old_mt == cyc_kernel.UNPROVIDED) {
            old_mt = (SubLObject)cyc_kernel.NIL;
        }
        if (new_mt == cyc_kernel.UNPROVIDED) {
            new_mt = old_mt;
        }
        if (v_properties == cyc_kernel.UNPROVIDED) {
            v_properties = (SubLObject)cyc_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(old_sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        enforceType(new_sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        if (cyc_kernel.NIL != old_mt) {
            enforceType(old_mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        if (cyc_kernel.NIL != new_mt) {
            enforceType(new_mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        final SubLObject strength = conses_high.getf(v_properties, (SubLObject)cyc_kernel.$kw50$STRENGTH, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject direction = conses_high.getf(v_properties, (SubLObject)cyc_kernel.$kw52$DIRECTION, (SubLObject)cyc_kernel.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject right_old_sentence = czer_utilities.unwrap_if_ist(old_sentence, old_mt, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject right_old_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject right_new_sentence = czer_utilities.unwrap_if_ist(new_sentence, new_mt, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject right_new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = fi.fi_edit_int(right_old_sentence, right_new_sentence, right_old_mt, right_new_mt, strength, direction);
        cyc_bookkeeping.perform_assertion_bookkeeping(result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 15598L)
    public static SubLObject cyc_add_argument(final SubLObject sentence, final SubLObject cycl_supports, SubLObject mt, SubLObject v_properties, SubLObject verify_supports) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        if (v_properties == cyc_kernel.UNPROVIDED) {
            v_properties = (SubLObject)cyc_kernel.NIL;
        }
        if (verify_supports == cyc_kernel.UNPROVIDED) {
            verify_supports = (SubLObject)cyc_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        enforceType(cycl_supports, cyc_kernel.$sym69$LIST_OF_CYCL_SUPPORT_P);
        if (cyc_kernel.NIL != mt) {
            enforceType(mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        enforceType(v_properties, cyc_kernel.$sym49$ASSERT_PROPERTIES_P);
        enforceType(verify_supports, cyc_kernel.$sym70$BOOLEANP);
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        final SubLObject direction = conses_high.getf(v_properties, (SubLObject)cyc_kernel.$kw52$DIRECTION, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject check_wffP = get_assert_property(v_properties, (SubLObject)cyc_kernel.$kw53$CHECK_WFF_, (SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue(thread)));
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding(thread);
        try {
            fi.$assume_assert_sentence_is_wfP$.bind((SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL == check_wffP), thread);
            result = fi.fi_add_argument_int(right_sentence, right_mt, cycl_supports, direction, verify_supports);
        }
        finally {
            fi.$assume_assert_sentence_is_wfP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 16964L)
    public static SubLObject cyc_remove_argument(final SubLObject sentence, final SubLObject cycl_supports, SubLObject mt) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        enforceType(cycl_supports, cyc_kernel.$sym69$LIST_OF_CYCL_SUPPORT_P);
        if (cyc_kernel.NIL != mt) {
            enforceType(mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = fi.fi_remove_argument_int(right_sentence, right_mt, cycl_supports, (SubLObject)cyc_kernel.NIL);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 17467L)
    public static SubLObject cyc_remove_all_arguments(final SubLObject sentence, SubLObject mt) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        if (cyc_kernel.NIL != mt) {
            enforceType(mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = fi.fi_blast_int(right_sentence, right_mt);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 18084L)
    public static SubLObject legacy_query_properties_p(final SubLObject v_object) {
        return Types.listp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 18233L)
    public static SubLObject query_results_p(final SubLObject v_object) {
        return Types.listp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 18438L)
    public static SubLObject cyc_query(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        if (v_properties == cyc_kernel.UNPROVIDED) {
            v_properties = (SubLObject)cyc_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        if (cyc_kernel.NIL != mt) {
            enforceType(mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        enforceType(v_properties, cyc_kernel.$sym81$LEGACY_QUERY_PROPERTIES_P);
        final SubLObject backchain = conses_high.getf(v_properties, (SubLObject)cyc_kernel.$kw82$BACKCHAIN, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject number = conses_high.getf(v_properties, (SubLObject)cyc_kernel.$kw83$NUMBER, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject time = conses_high.getf(v_properties, (SubLObject)cyc_kernel.$kw84$TIME, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject depth = conses_high.getf(v_properties, (SubLObject)cyc_kernel.$kw85$DEPTH, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject hypothesizeP = conses_high.getf(v_properties, (SubLObject)cyc_kernel.$kw86$CONDITIONAL_SENTENCE, (SubLObject)cyc_kernel.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject result = (cyc_kernel.NIL != hypothesizeP) ? prove.fi_prove_int(right_sentence, right_mt, backchain, number, time, depth) : fi.fi_ask_int(right_sentence, right_mt, backchain, number, time, depth);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cyc_kernel.NIL != closed_query_success_result_p(result)) {
            result = closed_query_success_token();
        }
        return Values.values(result, halt_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 20932L)
    public static SubLObject query_success_result_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL != open_query_success_result_p(v_object) || cyc_kernel.NIL != closed_query_success_result_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 21275L)
    public static SubLObject open_query_result_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL != bindings.binding_lists_p(v_object) && cyc_kernel.NIL == closed_query_success_result_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 21420L)
    public static SubLObject open_query_success_result_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL != list_utilities.proper_list_p(v_object) && cyc_kernel.NIL != open_query_result_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 22401L)
    public static SubLObject closed_query_bindings_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.equal(cyc_kernel.$closed_query_bindings$.getGlobalValue()) || cyc_kernel.NIL != bindings.unification_success_token_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 22855L)
    public static SubLObject closed_query_justified_bindings_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL != list_utilities.proper_list_p(v_object) && cyc_kernel.NIL != list_utilities.lengthE(v_object, (SubLObject)cyc_kernel.TWO_INTEGER, (SubLObject)cyc_kernel.UNPROVIDED) && cyc_kernel.NIL != closed_query_bindings_p(v_object.first()) && cyc_kernel.NIL != arguments.supports_p(conses_high.second(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 23253L)
    public static SubLObject closed_query_success_token() {
        return cyc_kernel.$closed_query_success_token$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 23337L)
    public static SubLObject closed_query_success_token_p(final SubLObject v_object) {
        return Equality.equal(v_object, cyc_kernel.$closed_query_success_token$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 23444L)
    public static SubLObject closed_query_success_result_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && cyc_kernel.NIL != list_utilities.singletonP(v_object) && cyc_kernel.NIL != closed_query_bindings_p(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 23861L)
    public static SubLObject closed_query_justified_success_result_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cyc_kernel.NIL != list_utilities.proper_list_p(v_object) && cyc_kernel.NIL != list_utilities.every_in_list((SubLObject)cyc_kernel.$sym91$CLOSED_QUERY_JUSTIFIED_BINDINGS_P, v_object, (SubLObject)cyc_kernel.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 24287L)
    public static SubLObject query_id_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)cyc_kernel.$kw92$LAST, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 24361L)
    public static SubLObject cyc_continue_query(SubLObject query_id, SubLObject v_properties) {
        if (query_id == cyc_kernel.UNPROVIDED) {
            query_id = (SubLObject)cyc_kernel.$kw92$LAST;
        }
        if (v_properties == cyc_kernel.UNPROVIDED) {
            v_properties = (SubLObject)cyc_kernel.NIL;
        }
        enforceType(query_id, cyc_kernel.$sym93$QUERY_ID_P);
        enforceType(v_properties, cyc_kernel.$sym81$LEGACY_QUERY_PROPERTIES_P);
        Errors.error((SubLObject)cyc_kernel.$str94$cyc_continue_query_is_deprecated_);
        return (SubLObject)cyc_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 24856L)
    public static SubLObject cyc_tms_reconsider_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        if (cyc_kernel.NIL != mt) {
            enforceType(mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        SubLObject result = (SubLObject)cyc_kernel.NIL;
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)cyc_kernel.UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = fi.fi_tms_reconsider_formula_int(right_sentence, right_mt);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 26143L)
    public static SubLObject cyc_tms_reconsider_term(final SubLObject v_term, SubLObject mt) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        return fi.fi_tms_reconsider_term_int(v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 26578L)
    public static SubLObject cyc_tms_reconsider_mt(final SubLObject mt) {
        return fi.fi_tms_reconsider_mt_int(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-kernel.lisp", position = 26660L)
    public static SubLObject cyc_rename_variables(final SubLObject sentence, final SubLObject rename_variable_list, SubLObject mt) {
        if (mt == cyc_kernel.UNPROVIDED) {
            mt = (SubLObject)cyc_kernel.NIL;
        }
        enforceType(sentence, cyc_kernel.$sym47$POSSIBLY_SENTENCE_P);
        if (cyc_kernel.NIL != mt) {
            enforceType(mt, cyc_kernel.$sym48$POSSIBLY_MT_P);
        }
        enforceType(rename_variable_list, cyc_kernel.$sym102$ALIST_P);
        return fi.fi_rename_variables_int(sentence, mt, rename_variable_list);
    }
    
    public static SubLObject declare_cyc_kernel_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_create_new_permanent", "CYC-CREATE-NEW-PERMANENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_create_new_ephemeral", "CYC-CREATE-NEW-EPHEMERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_create", "CYC-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_find_or_create", "CYC-FIND-OR-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_find_or_create_new_permanent", "CYC-FIND-OR-CREATE-NEW-PERMANENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_rename", "CYC-RENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_recreate", "CYC-RECREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "new_constant_name_spec_p", "NEW-CONSTANT-NAME-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_kill", "CYC-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_rewrite", "CYC-REWRITE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_merge", "CYC-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "assert_property_p", "ASSERT-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "assert_properties_p", "ASSERT-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "get_assert_property", "GET-ASSERT-PROPERTY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_assert", "CYC-ASSERT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_assert_wff", "CYC-ASSERT-WFF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_deny", "CYC-DENY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_unassert", "CYC-UNASSERT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_edit", "CYC-EDIT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_add_argument", "CYC-ADD-ARGUMENT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_remove_argument", "CYC-REMOVE-ARGUMENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_remove_all_arguments", "CYC-REMOVE-ALL-ARGUMENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "legacy_query_properties_p", "LEGACY-QUERY-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "query_results_p", "QUERY-RESULTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_query", "CYC-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "query_success_result_p", "QUERY-SUCCESS-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "open_query_result_p", "OPEN-QUERY-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "open_query_success_result_p", "OPEN-QUERY-SUCCESS-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "closed_query_bindings_p", "CLOSED-QUERY-BINDINGS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "closed_query_justified_bindings_p", "CLOSED-QUERY-JUSTIFIED-BINDINGS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "closed_query_success_token", "CLOSED-QUERY-SUCCESS-TOKEN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "closed_query_success_token_p", "CLOSED-QUERY-SUCCESS-TOKEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "closed_query_success_result_p", "CLOSED-QUERY-SUCCESS-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "closed_query_justified_success_result_p", "CLOSED-QUERY-JUSTIFIED-SUCCESS-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "query_id_p", "QUERY-ID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_continue_query", "CYC-CONTINUE-QUERY", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_tms_reconsider_sentence", "CYC-TMS-RECONSIDER-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_tms_reconsider_term", "CYC-TMS-RECONSIDER-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_tms_reconsider_mt", "CYC-TMS-RECONSIDER-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_kernel", "cyc_rename_variables", "CYC-RENAME-VARIABLES", 2, 1, false);
        return (SubLObject)cyc_kernel.NIL;
    }
    
    public static SubLObject init_cyc_kernel_file() {
        cyc_kernel.$assert_properties$ = SubLFiles.deflexical("*ASSERT-PROPERTIES*", (SubLObject)cyc_kernel.$list45);
        cyc_kernel.$closed_query_bindings$ = SubLFiles.deflexical("*CLOSED-QUERY-BINDINGS*", (SubLObject)cyc_kernel.NIL);
        cyc_kernel.$closed_query_success_token$ = SubLFiles.deflexical("*CLOSED-QUERY-SUCCESS-TOKEN*", (SubLObject)ConsesLow.list(cyc_kernel.$closed_query_bindings$.getGlobalValue()));
        return (SubLObject)cyc_kernel.NIL;
    }
    
    public static SubLObject setup_cyc_kernel_file() {
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym2$CYC_CREATE_NEW_PERMANENT, (SubLObject)cyc_kernel.$list3, (SubLObject)cyc_kernel.$str4$Creates_a_new_constant_with_name_, (SubLObject)cyc_kernel.$list5, (SubLObject)cyc_kernel.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym7$CYC_CREATE_NEW_EPHEMERAL, (SubLObject)cyc_kernel.$list3, (SubLObject)cyc_kernel.$str8$Creates_a_new_constant_with_name_, (SubLObject)cyc_kernel.$list5, (SubLObject)cyc_kernel.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym10$CYC_CREATE, (SubLObject)cyc_kernel.$list11, (SubLObject)cyc_kernel.$str12$Create_a_new_constant_with_id_EXT, (SubLObject)cyc_kernel.$list13, (SubLObject)cyc_kernel.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym15$CYC_FIND_OR_CREATE, (SubLObject)cyc_kernel.$list11, (SubLObject)cyc_kernel.$str16$Return_constant_with_NAME_if_it_i, (SubLObject)cyc_kernel.$list17, (SubLObject)cyc_kernel.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym19$CYC_RENAME, (SubLObject)cyc_kernel.$list20, (SubLObject)cyc_kernel.$str21$Change_name_of_CONSTANT_to_NAME__, (SubLObject)cyc_kernel.$list22, (SubLObject)cyc_kernel.$list23);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym24$CYC_RECREATE, (SubLObject)cyc_kernel.$list25, (SubLObject)cyc_kernel.$str26$Doesn_t_unassert_the_bookkeeping_, (SubLObject)cyc_kernel.$list27, (SubLObject)cyc_kernel.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym30$CYC_KILL, (SubLObject)cyc_kernel.$list31, (SubLObject)cyc_kernel.$str32$Kill_FORT_and_all_its_uses_from_t, (SubLObject)cyc_kernel.$list33, (SubLObject)cyc_kernel.$list34);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym36$CYC_REWRITE, (SubLObject)cyc_kernel.$list37, (SubLObject)cyc_kernel.$str38$_moves__all_asserted_arguments_fr, (SubLObject)cyc_kernel.$list39, (SubLObject)cyc_kernel.$list40);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym41$CYC_MERGE, (SubLObject)cyc_kernel.$list42, (SubLObject)cyc_kernel.$str43$Move_asserted_assertions_on_KILL_, (SubLObject)cyc_kernel.$list44, (SubLObject)cyc_kernel.$list40);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym55$CYC_ASSERT, (SubLObject)cyc_kernel.$list56, (SubLObject)cyc_kernel.$str57$Assert_SENTENCE_in_the_specified_, (SubLObject)cyc_kernel.$list58, (SubLObject)cyc_kernel.$list34);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym59$CYC_DENY, (SubLObject)cyc_kernel.$list56, (SubLObject)cyc_kernel.$str60$Deny_SENTENCE_in_the_specified_MT, (SubLObject)cyc_kernel.$list58, (SubLObject)cyc_kernel.$list34);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym61$CYC_UNASSERT, (SubLObject)cyc_kernel.$list62, (SubLObject)cyc_kernel.$str63$Remove_the_assertions_canonicaliz, (SubLObject)cyc_kernel.$list64, (SubLObject)cyc_kernel.$list34);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym65$CYC_EDIT, (SubLObject)cyc_kernel.$list66, (SubLObject)cyc_kernel.$str67$Unassert_OLD_SENTENCE_in_OLD_MT__, (SubLObject)cyc_kernel.$list68, (SubLObject)cyc_kernel.$list34);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym71$CYC_ADD_ARGUMENT, (SubLObject)cyc_kernel.$list72, (SubLObject)cyc_kernel.$str73$Tell_Cyc_to_conclude_SENTENCE__op, (SubLObject)cyc_kernel.$list74, (SubLObject)cyc_kernel.$list34);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym75$CYC_REMOVE_ARGUMENT, (SubLObject)cyc_kernel.$list76, (SubLObject)cyc_kernel.$str77$Remove_the_argument_for_SENTENCE_, (SubLObject)cyc_kernel.$list78, (SubLObject)cyc_kernel.$list34);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym79$CYC_REMOVE_ALL_ARGUMENTS, (SubLObject)cyc_kernel.$list62, (SubLObject)cyc_kernel.$str80$Remove_all_arguments_for_SENTENCE, (SubLObject)cyc_kernel.$list64, (SubLObject)cyc_kernel.$list34);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym87$CYC_QUERY, (SubLObject)cyc_kernel.$list56, (SubLObject)cyc_kernel.$str88$Query_for_bindings_for_free_varia, (SubLObject)cyc_kernel.$list89, (SubLObject)cyc_kernel.$list90);
        utilities_macros.register_obsolete_cyc_api_function((SubLObject)cyc_kernel.$sym95$CYC_CONTINUE_QUERY, (SubLObject)cyc_kernel.$list96, (SubLObject)cyc_kernel.$list97, (SubLObject)cyc_kernel.$str98$Continues_a_query_started_by__xre, (SubLObject)cyc_kernel.$list99, (SubLObject)cyc_kernel.$list90);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym100$CYC_TMS_RECONSIDER_SENTENCE, (SubLObject)cyc_kernel.$list62, (SubLObject)cyc_kernel.$str101$Reconsider_all_arguments_for_SENT, (SubLObject)cyc_kernel.$list64, (SubLObject)cyc_kernel.$list34);
        utilities_macros.register_cyc_api_function((SubLObject)cyc_kernel.$sym103$CYC_RENAME_VARIABLES, (SubLObject)cyc_kernel.$list104, (SubLObject)cyc_kernel.$str105$Rename_the_variables_in_SENTENCE_, (SubLObject)cyc_kernel.$list106, (SubLObject)cyc_kernel.$list34);
        return (SubLObject)cyc_kernel.NIL;
    }
    
    public void declareFunctions() {
        declare_cyc_kernel_file();
    }
    
    public void initializeVariables() {
        init_cyc_kernel_file();
    }
    
    public void runTopLevelForms() {
        setup_cyc_kernel_file();
    }
    
    static {
        me = (SubLFile)new cyc_kernel();
        cyc_kernel.$assert_properties$ = null;
        cyc_kernel.$closed_query_bindings$ = null;
        cyc_kernel.$closed_query_success_token$ = null;
        $sym0$NEW_CONSTANT_NAME_SPEC_P = SubLObjectFactory.makeSymbol("NEW-CONSTANT-NAME-SPEC-P");
        $sym1$FI_CREATE = SubLObjectFactory.makeSymbol("FI-CREATE");
        $sym2$CYC_CREATE_NEW_PERMANENT = SubLObjectFactory.makeSymbol("CYC-CREATE-NEW-PERMANENT");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $str4$Creates_a_new_constant_with_name_ = SubLObjectFactory.makeString("Creates a new constant with name NAME, gives it a\n   permanent unique external ID, and adds the constant\n   creation operation to the transcript queue.");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONSTANT-NAME-SPEC-P")));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"));
        $sym7$CYC_CREATE_NEW_EPHEMERAL = SubLObjectFactory.makeSymbol("CYC-CREATE-NEW-EPHEMERAL");
        $str8$Creates_a_new_constant_with_name_ = SubLObjectFactory.makeString("Creates a new constant with name NAME, but makes\n   no effort to synchronize its external ID with\n   other Cyc images.  This is intended for constants\n   that will not be transmitted to other Cyc images.");
        $sym9$CONSTANT_EXTERNAL_ID_P = SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P");
        $sym10$CYC_CREATE = SubLObjectFactory.makeSymbol("CYC-CREATE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"));
        $str12$Create_a_new_constant_with_id_EXT = SubLObjectFactory.makeString("Create a new constant with id EXTERNAL-ID.\n   If NAME is anything other than :unnamed,\n   the new constant will be given the name NAME.");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONSTANT-NAME-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P"))));
        $sym14$VALID_CONSTANT_NAME_P = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P");
        $sym15$CYC_FIND_OR_CREATE = SubLObjectFactory.makeSymbol("CYC-FIND-OR-CREATE");
        $str16$Return_constant_with_NAME_if_it_i = SubLObjectFactory.makeString("Return constant with NAME if it is present.  \n   If not present, then create constant with NAME, using EXTERNAL-ID if given.\n   If EXTERNAL-ID is not given, generate a new one for the new constant.");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P"))));
        $sym18$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym19$CYC_RENAME = SubLObjectFactory.makeSymbol("CYC-RENAME");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $str21$Change_name_of_CONSTANT_to_NAME__ = SubLObjectFactory.makeString("Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P")));
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $sym24$CYC_RECREATE = SubLObjectFactory.makeSymbol("CYC-RECREATE");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"));
        $str26$Doesn_t_unassert_the_bookkeeping_ = SubLObjectFactory.makeString("Doesn't unassert the bookkeeping info,\n   but it might actually move it, or change\n   its format somehow.");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $kw28$UNNAMED = SubLObjectFactory.makeKeyword("UNNAMED");
        $sym29$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym30$CYC_KILL = SubLObjectFactory.makeSymbol("CYC-KILL");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"));
        $str32$Kill_FORT_and_all_its_uses_from_t = SubLObjectFactory.makeString("Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\n   in that microtheory are removed.");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $str35$cyc_rewrite_is_not_implemented_ye = SubLObjectFactory.makeString("cyc-rewrite is not implemented yet");
        $sym36$CYC_REWRITE = SubLObjectFactory.makeSymbol("CYC-REWRITE");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-FORT"));
        $str38$_moves__all_asserted_arguments_fr = SubLObjectFactory.makeString("'moves' all asserted arguments from SOURCE-FORT to TARGET-FORT\n   @return fort-p; TARGET-FORT");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"));
        $sym41$CYC_MERGE = SubLObjectFactory.makeSymbol("CYC-MERGE");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KILL-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("KEEP-FORT"));
        $str43$Move_asserted_assertions_on_KILL_ = SubLObjectFactory.makeString("Move asserted assertions on KILL-TERM onto KEEP-TERM before killing KILL-TERM.\n   @return fort-p; KEEP-FORT");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KILL-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEEP-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-WFF?"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-RULES"));
        $sym46$ASSERT_PROPERTY_P = SubLObjectFactory.makeSymbol("ASSERT-PROPERTY-P");
        $sym47$POSSIBLY_SENTENCE_P = SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P");
        $sym48$POSSIBLY_MT_P = SubLObjectFactory.makeSymbol("POSSIBLY-MT-P");
        $sym49$ASSERT_PROPERTIES_P = SubLObjectFactory.makeSymbol("ASSERT-PROPERTIES-P");
        $kw50$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $kw51$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw52$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw53$CHECK_WFF_ = SubLObjectFactory.makeKeyword("CHECK-WFF?");
        $kw54$FORWARD_RULES = SubLObjectFactory.makeKeyword("FORWARD-RULES");
        $sym55$CYC_ASSERT = SubLObjectFactory.makeSymbol("CYC-ASSERT");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"));
        $str57$Assert_SENTENCE_in_the_specified_ = SubLObjectFactory.makeString("Assert SENTENCE in the specified MT.\n   properties; :strength el-strength-p (:default or :monotonic)\n               :direction direction-p  (:forward or :backward)\n               :check-wff? booleanp\n               :forward-rules listp\n   GAF assertion direction defaults to :forward,\n     and rule assertion direction defaults to :backward.\n   :check-wff? indicates whether to enforce WFF checking, and defaults to T\n     (unless *assume-assert-sentence-is-wf?* is bound from outside).\n   :forward-rules defaults to :all (unless *forward-inference-allowed-rules* is bound from outside)\n     and indicates which forward rules to use during post-assert processing.\n     NIL means 'do no forward inference at all.'\n   @return booleanp; t iff the assert succeeded.  If the assertion\n   already existed, it is considered a success.");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERT-PROPERTIES-P")));
        $sym59$CYC_DENY = SubLObjectFactory.makeSymbol("CYC-DENY");
        $str60$Deny_SENTENCE_in_the_specified_MT = SubLObjectFactory.makeString("Deny SENTENCE in the specified MT.\n   properties; :direction direction-p  (:forward or :backward)\n               :check-wff? booleanp\n   GAF assertion direction defaults to :forward,\n     and rule assertion direction defaults to :backward.\n   :check-wff? indicates whether to enforce WFF checking, and defaults to T\n     (unless *assume-assert-sentence-is-wf?* is bound from outside).\n   @return booleanp; t iff the operation succeeded.  If the assertion\n   already existed, it is considered a success.");
        $sym61$CYC_UNASSERT = SubLObjectFactory.makeSymbol("CYC-UNASSERT");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str63$Remove_the_assertions_canonicaliz = SubLObjectFactory.makeString("Remove the assertions canonicalized from FORMULA in the microtheory MT.\n   Return T if the operation succeeded, otherwise return NIL.");
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P"))));
        $sym65$CYC_EDIT = SubLObjectFactory.makeSymbol("CYC-EDIT");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MT"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-MT")), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"));
        $str67$Unassert_OLD_SENTENCE_in_OLD_MT__ = SubLObjectFactory.makeString("Unassert OLD-SENTENCE in OLD-MT, and assert NEW-SENTENCE in the specified NEW-MT.\n   @see cyc-unassert and @xref cyc-assert");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P"))));
        $sym69$LIST_OF_CYCL_SUPPORT_P = SubLObjectFactory.makeSymbol("LIST-OF-CYCL-SUPPORT-P");
        $sym70$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym71$CYC_ADD_ARGUMENT = SubLObjectFactory.makeSymbol("CYC-ADD-ARGUMENT");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("VERIFY-SUPPORTS"));
        $str73$Tell_Cyc_to_conclude_SENTENCE__op = SubLObjectFactory.makeString("Tell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or \n   otherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports \n   before making the assertion.\n   Properties: :direction :forward or :backward");
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-CYCL-SUPPORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERT-PROPERTIES-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERIFY-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")));
        $sym75$CYC_REMOVE_ARGUMENT = SubLObjectFactory.makeSymbol("CYC-REMOVE-ARGUMENT");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str77$Remove_the_argument_for_SENTENCE_ = SubLObjectFactory.makeString("Remove the argument for SENTENCE specified by CYCL-SUPPORTS.");
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-CYCL-SUPPORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P"))));
        $sym79$CYC_REMOVE_ALL_ARGUMENTS = SubLObjectFactory.makeSymbol("CYC-REMOVE-ALL-ARGUMENTS");
        $str80$Remove_all_arguments_for_SENTENCE = SubLObjectFactory.makeString("Remove all arguments for SENTENCE within MT, including both those \n   arguments resulting the direct assertion of SENTENCE, and \n   those arguments supporting SENTENCE which were derived through inference.\n   Return T if successful, otherwise return NIL.");
        $sym81$LEGACY_QUERY_PROPERTIES_P = SubLObjectFactory.makeSymbol("LEGACY-QUERY-PROPERTIES-P");
        $kw82$BACKCHAIN = SubLObjectFactory.makeKeyword("BACKCHAIN");
        $kw83$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $kw84$TIME = SubLObjectFactory.makeKeyword("TIME");
        $kw85$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw86$CONDITIONAL_SENTENCE = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE");
        $sym87$CYC_QUERY = SubLObjectFactory.makeSymbol("CYC-QUERY");
        $str88$Query_for_bindings_for_free_varia = SubLObjectFactory.makeString("Query for bindings for free variables which will satisfy SENTENCE within MT.\n;;;{{{DOC\n   Properties: :backchain NIL or an integer or T\n               :number    NIL or an integer\n               :time      NIL or an integer\n               :depth     NIL or an integer\n               :conditional-sentence boolean\n   If :backchain is NIL, no backchaining is performed.\n   If :backchain is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If :backchain is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If :number is an integer, then at most that number of bindings are returned.\n   If :time is an integer, then at most that many seconds are consumed by the search for\n   bindings.\n   If :depth is an integer, then the inference paths are limited to that number of\n   total steps.\n   Returns NIL if the operation had an error.  Otherwise returns a (possibly empty)\n   binding set.  In the case where the SENTENCE has no free variables,\n   the form (NIL), the empty binding set is returned, indicating that the gaf is either\n   directly asserted in the KB, or that it can be derived via rules in the KB.\n   If it fails to be proven, NIL will be returned.\n   The second return value indicates the reason why the query halted.\n   If SENTENCE is an implication, or an ist wrapped around an implication,\n   and the :conditional-sentence property is non-nil, cyc-query will attempt to\n   prove SENTENCE by reductio ad absurdum.\n;;;}}}EDOC");
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("LEGACY-QUERY-PROPERTIES-P")));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-RESULTS-P"));
        $sym91$CLOSED_QUERY_JUSTIFIED_BINDINGS_P = SubLObjectFactory.makeSymbol("CLOSED-QUERY-JUSTIFIED-BINDINGS-P");
        $kw92$LAST = SubLObjectFactory.makeKeyword("LAST");
        $sym93$QUERY_ID_P = SubLObjectFactory.makeSymbol("QUERY-ID-P");
        $str94$cyc_continue_query_is_deprecated_ = SubLObjectFactory.makeString("cyc-continue-query is deprecated; use CONTINUE-INFERENCE instead.");
        $sym95$CYC_CONTINUE_QUERY = SubLObjectFactory.makeSymbol("CYC-CONTINUE-QUERY");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTINUE-INFERENCE"));
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-ID"), (SubLObject)SubLObjectFactory.makeKeyword("LAST")), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"));
        $str98$Continues_a_query_started_by__xre = SubLObjectFactory.makeString("Continues a query started by @xref cyc-query.\n   If QUERY-ID is :last, the most recent query is continued.");
        $list99 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-ID"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-ID-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("LEGACY-QUERY-PROPERTIES-P")));
        $sym100$CYC_TMS_RECONSIDER_SENTENCE = SubLObjectFactory.makeSymbol("CYC-TMS-RECONSIDER-SENTENCE");
        $str101$Reconsider_all_arguments_for_SENT = SubLObjectFactory.makeString("Reconsider all arguments for SENTENCE within MT.  Return T if the\n   operation succeeded, NIL if there was an error.");
        $sym102$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $sym103$CYC_RENAME_VARIABLES = SubLObjectFactory.makeSymbol("CYC-RENAME-VARIABLES");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RENAME-VARIABLE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str105$Rename_the_variables_in_SENTENCE_ = SubLObjectFactory.makeString("Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\n   if it is provably possible to do so without changing the logical intent of SENTENCE.\n   @see simple-variable-rename-impossible?\n   @return booleanp; T if the operation succeeded, NIL if there was an error.");
        $list106 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RENAME-VARIABLE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST-P")));
    }
}

/*

	Total time: 236 ms
	
*/