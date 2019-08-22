package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cyc_kernel extends SubLTranslatedFile {
    public static final SubLFile me = new cyc_kernel();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_kernel";

    public static final String myFingerPrint = "7862ead2c5cc34499478eadba8f9dec994372e0f8452aa91ea05f2ddc484c40c";

    // deflexical
    private static final SubLSymbol $assert_properties$ = makeSymbol("*ASSERT-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $closed_query_bindings$ = makeSymbol("*CLOSED-QUERY-BINDINGS*");

    // deflexical
    private static final SubLSymbol $closed_query_success_token$ = makeSymbol("*CLOSED-QUERY-SUCCESS-TOKEN*");

    // Internal Constants
    public static final SubLSymbol NEW_CONSTANT_NAME_SPEC_P = makeSymbol("NEW-CONSTANT-NAME-SPEC-P");

    private static final SubLSymbol FI_CREATE = makeSymbol("FI-CREATE");

    public static final SubLSymbol CYC_CREATE_NEW_PERMANENT = makeSymbol("CYC-CREATE-NEW-PERMANENT");

    public static final SubLList $list3 = list(makeSymbol("NAME"));

    public static final SubLString $str4$Creates_a_new_constant_with_name_ = makeString("Creates a new constant with name NAME, gives it a\n   permanent unique external ID, and adds the constant\n   creation operation to the transcript queue.");

    public static final SubLList $list5 = list(list(makeSymbol("NAME"), makeSymbol("NEW-CONSTANT-NAME-SPEC-P")));

    public static final SubLList $list6 = list(makeSymbol("CONSTANT-P"));

    public static final SubLSymbol CYC_CREATE_NEW_EPHEMERAL = makeSymbol("CYC-CREATE-NEW-EPHEMERAL");

    public static final SubLString $str8$Creates_a_new_constant_with_name_ = makeString("Creates a new constant with name NAME, but makes\n   no effort to synchronize its external ID with\n   other Cyc images.  This is intended for constants\n   that will not be transmitted to other Cyc images.");



    private static final SubLSymbol CYC_CREATE = makeSymbol("CYC-CREATE");

    private static final SubLList $list11 = list(makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));

    private static final SubLString $str12$Create_a_new_constant_with_id_EXT = makeString("Create a new constant with id EXTERNAL-ID.\n   If NAME is anything other than :unnamed,\n   the new constant will be given the name NAME.");

    private static final SubLList $list13 = list(list(makeSymbol("NAME"), makeSymbol("NEW-CONSTANT-NAME-SPEC-P")), list(makeSymbol("EXTERNAL-ID"), list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P"))));



    private static final SubLSymbol CYC_FIND_OR_CREATE = makeSymbol("CYC-FIND-OR-CREATE");

    private static final SubLString $str16$Return_constant_with_NAME_if_it_i = makeString("Return constant with NAME if it is present.  \n   If not present, then create constant with NAME, using EXTERNAL-ID if given.\n   If EXTERNAL-ID is not given, generate a new one for the new constant.");

    private static final SubLList $list17 = list(list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")), list(makeSymbol("EXTERNAL-ID"), list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P"))));



    private static final SubLSymbol CYC_RENAME = makeSymbol("CYC-RENAME");

    private static final SubLList $list20 = list(makeSymbol("CONSTANT"), makeSymbol("NAME"));

    private static final SubLString $str21$Change_name_of_CONSTANT_to_NAME__ = makeString("Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.");

    public static final SubLList $list22 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")));

    private static final SubLList $list23 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));

    private static final SubLSymbol CYC_RECREATE = makeSymbol("CYC-RECREATE");

    private static final SubLList $list25 = list(makeSymbol("CONSTANT"));

    private static final SubLString $str26$Doesn_t_unassert_the_bookkeeping_ = makeString("Doesn\'t unassert the bookkeeping info,\n   but it might actually move it, or change\n   its format somehow.");

    private static final SubLList $list27 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));





    private static final SubLSymbol CYC_KILL = makeSymbol("CYC-KILL");

    private static final SubLList $list31 = list(makeSymbol("FORT"));

    private static final SubLString $str32$Kill_FORT_and_all_its_uses_from_t = makeString("Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\n   in that microtheory are removed.");

    public static final SubLList $list33 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")));

    private static final SubLList $list34 = list(makeSymbol("BOOLEANP"));

    private static final SubLString $str35$cyc_rewrite_is_not_implemented_ye = makeString("cyc-rewrite is not implemented yet");

    private static final SubLSymbol CYC_REWRITE = makeSymbol("CYC-REWRITE");

    private static final SubLList $list37 = list(makeSymbol("SOURCE-FORT"), makeSymbol("TARGET-FORT"));

    private static final SubLString $str38$_moves__all_asserted_arguments_fr = makeString("\'moves\' all asserted arguments from SOURCE-FORT to TARGET-FORT\n   @return fort-p; TARGET-FORT");

    public static final SubLList $list39 = list(list(makeSymbol("SOURCE-FORT"), makeSymbol("FORT-P")), list(makeSymbol("TARGET-FORT"), makeSymbol("FORT-P")));

    private static final SubLList $list40 = list(makeSymbol("FORT-P"));

    private static final SubLSymbol CYC_MERGE = makeSymbol("CYC-MERGE");

    private static final SubLList $list42 = list(makeSymbol("KILL-FORT"), makeSymbol("KEEP-FORT"));

    private static final SubLString $str43$Move_asserted_assertions_on_KILL_ = makeString("Move asserted assertions on KILL-TERM onto KEEP-TERM before killing KILL-TERM.\n   @return fort-p; KEEP-FORT");

    private static final SubLList $list44 = list(list(makeSymbol("KILL-FORT"), makeSymbol("FORT-P")), list(makeSymbol("KEEP-FORT"), makeSymbol("FORT-P")));

    private static final SubLList $list45 = list(makeKeyword("STRENGTH"), makeKeyword("DIRECTION"), makeKeyword("CHECK-WFF?"), makeKeyword("FORWARD-RULES"));

    private static final SubLSymbol ASSERT_PROPERTY_P = makeSymbol("ASSERT-PROPERTY-P");





    private static final SubLSymbol ASSERT_PROPERTIES_P = makeSymbol("ASSERT-PROPERTIES-P");







    private static final SubLSymbol $kw53$CHECK_WFF_ = makeKeyword("CHECK-WFF?");



    private static final SubLSymbol CYC_ASSERT = makeSymbol("CYC-ASSERT");

    private static final SubLList $list56 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("PROPERTIES"));

    private static final SubLString $str57$Assert_SENTENCE_in_the_specified_ = makeString("Assert SENTENCE in the specified MT.\n   properties; :strength el-strength-p (:default or :monotonic)\n               :direction direction-p  (:forward or :backward)\n               :check-wff? booleanp\n               :forward-rules listp\n   GAF assertion direction defaults to :forward,\n     and rule assertion direction defaults to :backward.\n   :check-wff? indicates whether to enforce WFF checking, and defaults to T\n     (unless *assume-assert-sentence-is-wf?* is bound from outside).\n   :forward-rules defaults to :all (unless *forward-inference-allowed-rules* is bound from outside)\n     and indicates which forward rules to use during post-assert processing.\n     NIL means \'do no forward inference at all.\'\n   @return booleanp; t iff the assert succeeded.  If the assertion\n   already existed, it is considered a success.");

    private static final SubLList $list58 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("PROPERTIES"), makeSymbol("ASSERT-PROPERTIES-P")));

    private static final SubLSymbol CYC_DENY = makeSymbol("CYC-DENY");

    private static final SubLString $str60$Deny_SENTENCE_in_the_specified_MT = makeString("Deny SENTENCE in the specified MT.\n   properties; :direction direction-p  (:forward or :backward)\n               :check-wff? booleanp\n   GAF assertion direction defaults to :forward,\n     and rule assertion direction defaults to :backward.\n   :check-wff? indicates whether to enforce WFF checking, and defaults to T\n     (unless *assume-assert-sentence-is-wf?* is bound from outside).\n   @return booleanp; t iff the operation succeeded.  If the assertion\n   already existed, it is considered a success.");

    private static final SubLSymbol CYC_UNASSERT = makeSymbol("CYC-UNASSERT");

    private static final SubLList $list62 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str63$Remove_the_assertions_canonicaliz = makeString("Remove the assertions canonicalized from FORMULA in the microtheory MT.\n   Return T if the operation succeeded, otherwise return NIL.");

    private static final SubLList $list64 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))));

    private static final SubLSymbol CYC_EDIT = makeSymbol("CYC-EDIT");

    private static final SubLList $list66 = list(makeSymbol("OLD-SENTENCE"), makeSymbol("NEW-SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("OLD-MT"), list(makeSymbol("NEW-MT"), makeSymbol("OLD-MT")), makeSymbol("PROPERTIES"));

    private static final SubLString $str67$Unassert_OLD_SENTENCE_in_OLD_MT__ = makeString("Unassert OLD-SENTENCE in OLD-MT, and assert NEW-SENTENCE in the specified NEW-MT.\n   @see cyc-unassert and @xref cyc-assert");

    private static final SubLList $list68 = list(list(makeSymbol("OLD-SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("NEW-SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("OLD-MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("NEW-MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))));

    private static final SubLSymbol LIST_OF_CYCL_SUPPORT_P = makeSymbol("LIST-OF-CYCL-SUPPORT-P");



    private static final SubLSymbol CYC_ADD_ARGUMENT = makeSymbol("CYC-ADD-ARGUMENT");

    private static final SubLList $list72 = list(makeSymbol("SENTENCE"), makeSymbol("CYCL-SUPPORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("PROPERTIES"), makeSymbol("VERIFY-SUPPORTS"));

    private static final SubLString $str73$Tell_Cyc_to_conclude_SENTENCE__op = makeString("Tell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or \n   otherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports \n   before making the assertion.\n   Properties: :direction :forward or :backward");

    private static final SubLList $list74 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("CYCL-SUPPORTS"), makeSymbol("LIST-OF-CYCL-SUPPORT-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("PROPERTIES"), makeSymbol("ASSERT-PROPERTIES-P")), list(makeSymbol("VERIFY-SUPPORTS"), makeSymbol("BOOLEANP")));

    private static final SubLSymbol CYC_REMOVE_ARGUMENT = makeSymbol("CYC-REMOVE-ARGUMENT");

    private static final SubLList $list76 = list(makeSymbol("SENTENCE"), makeSymbol("CYCL-SUPPORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str77$Remove_the_argument_for_SENTENCE_ = makeString("Remove the argument for SENTENCE specified by CYCL-SUPPORTS.");

    private static final SubLList $list78 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("CYCL-SUPPORTS"), makeSymbol("LIST-OF-CYCL-SUPPORT-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))));

    private static final SubLSymbol CYC_REMOVE_ALL_ARGUMENTS = makeSymbol("CYC-REMOVE-ALL-ARGUMENTS");

    private static final SubLString $str80$Remove_all_arguments_for_SENTENCE = makeString("Remove all arguments for SENTENCE within MT, including both those \n   arguments resulting the direct assertion of SENTENCE, and \n   those arguments supporting SENTENCE which were derived through inference.\n   Return T if successful, otherwise return NIL.");

    private static final SubLSymbol LEGACY_QUERY_PROPERTIES_P = makeSymbol("LEGACY-QUERY-PROPERTIES-P");











    private static final SubLSymbol CYC_QUERY = makeSymbol("CYC-QUERY");

    private static final SubLString $str88$Query_for_bindings_for_free_varia = makeString("Query for bindings for free variables which will satisfy SENTENCE within MT.\n;;;{{{DOC\n   Properties: :backchain NIL or an integer or T\n               :number    NIL or an integer\n               :time      NIL or an integer\n               :depth     NIL or an integer\n               :conditional-sentence boolean\n   If :backchain is NIL, no backchaining is performed.\n   If :backchain is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If :backchain is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If :number is an integer, then at most that number of bindings are returned.\n   If :time is an integer, then at most that many seconds are consumed by the search for\n   bindings.\n   If :depth is an integer, then the inference paths are limited to that number of\n   total steps.\n   Returns NIL if the operation had an error.  Otherwise returns a (possibly empty)\n   binding set.  In the case where the SENTENCE has no free variables,\n   the form (NIL), the empty binding set is returned, indicating that the gaf is either\n   directly asserted in the KB, or that it can be derived via rules in the KB.\n   If it fails to be proven, NIL will be returned.\n   The second return value indicates the reason why the query halted.\n   If SENTENCE is an implication, or an ist wrapped around an implication,\n   and the :conditional-sentence property is non-nil, cyc-query will attempt to\n   prove SENTENCE by reductio ad absurdum.\n;;;}}}EDOC");

    public static final SubLList $list89 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("PROPERTIES"), makeSymbol("LEGACY-QUERY-PROPERTIES-P")));

    public static final SubLList $list90 = list(makeSymbol("QUERY-RESULTS-P"));

    private static final SubLSymbol CLOSED_QUERY_JUSTIFIED_BINDINGS_P = makeSymbol("CLOSED-QUERY-JUSTIFIED-BINDINGS-P");



    private static final SubLSymbol QUERY_ID_P = makeSymbol("QUERY-ID-P");

    private static final SubLString $str94$cyc_continue_query_is_deprecated_ = makeString("cyc-continue-query is deprecated; use CONTINUE-INFERENCE instead.");

    private static final SubLSymbol CYC_CONTINUE_QUERY = makeSymbol("CYC-CONTINUE-QUERY");

    private static final SubLList $list96 = list(makeSymbol("CONTINUE-INFERENCE"));

    public static final SubLList $list97 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("QUERY-ID"), makeKeyword("LAST")), makeSymbol("PROPERTIES"));

    private static final SubLString $str98$Continues_a_query_started_by__xre = makeString("Continues a query started by @xref cyc-query.\n   If QUERY-ID is :last, the most recent query is continued.");

    public static final SubLList $list99 = list(list(makeSymbol("QUERY-ID"), makeSymbol("QUERY-ID-P")), list(makeSymbol("PROPERTIES"), makeSymbol("LEGACY-QUERY-PROPERTIES-P")));

    private static final SubLSymbol CYC_TMS_RECONSIDER_SENTENCE = makeSymbol("CYC-TMS-RECONSIDER-SENTENCE");

    private static final SubLString $str101$Reconsider_all_arguments_for_SENT = makeString("Reconsider all arguments for SENTENCE within MT.  Return T if the\n   operation succeeded, NIL if there was an error.");



    private static final SubLSymbol CYC_RENAME_VARIABLES = makeSymbol("CYC-RENAME-VARIABLES");

    private static final SubLList $list104 = list(makeSymbol("SENTENCE"), makeSymbol("RENAME-VARIABLE-LIST"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str105$Rename_the_variables_in_SENTENCE_ = makeString("Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\n   if it is provably possible to do so without changing the logical intent of SENTENCE.\n   @see simple-variable-rename-impossible?\n   @return booleanp; T if the operation succeeded, NIL if there was an error.");

    private static final SubLList $list106 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("RENAME-VARIABLE-LIST"), makeSymbol("ALIST-P")));

    public static SubLObject cyc_create_new_permanent(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(name, NEW_CONSTANT_NAME_SPEC_P);
        final SubLObject creation_form = list(FI_CREATE, name, constants_high.make_constant_external_id());
        SubLObject constant = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            constant = eval_in_api.cyc_api_eval(creation_form);
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return constant;
    }

    public static SubLObject cyc_create_new_ephemeral(final SubLObject name) {
        SubLTrampolineFile.enforceType(name, NEW_CONSTANT_NAME_SPEC_P);
        return cyc_create(name, constants_high.make_constant_external_id());
    }

    public static SubLObject cyc_create(final SubLObject name, final SubLObject external_id) {
        SubLTrampolineFile.enforceType(name, NEW_CONSTANT_NAME_SPEC_P);
        if (NIL != external_id) {
            SubLTrampolineFile.enforceType(external_id, CONSTANT_EXTERNAL_ID_P);
        }
        SubLObject result = NIL;
        result = fi.fi_create_int(name, external_id);
        cyc_bookkeeping.perform_constant_bookkeeping(result);
        return result;
    }

    public static SubLObject cyc_find_or_create(final SubLObject name, final SubLObject external_id) {
        SubLTrampolineFile.enforceType(name, VALID_CONSTANT_NAME_P);
        if (NIL != external_id) {
            SubLTrampolineFile.enforceType(external_id, CONSTANT_EXTERNAL_ID_P);
        }
        SubLObject result = NIL;
        result = fi.fi_find_int(name);
        if (NIL == result) {
            result = cyc_create(name, external_id);
        }
        return result;
    }

    public static SubLObject cyc_find_or_create_new_permanent(final SubLObject name) {
        assert NIL != constant_completion_high.valid_constant_name_p(name) : "constant_completion_high.valid_constant_name_p(name) " + "CommonSymbols.NIL != constant_completion_high.valid_constant_name_p(name) " + name;
        SubLObject result = NIL;
        result = fi.fi_find_int(name);
        if (NIL == result) {
            result = cyc_create_new_permanent(name);
        }
        return result;
    }

    public static SubLObject cyc_rename(final SubLObject constant, final SubLObject name) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        SubLTrampolineFile.enforceType(name, VALID_CONSTANT_NAME_P);
        return fi.fi_rename_int(constant, name);
    }

    public static SubLObject cyc_recreate(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        constants_high.remove_everything_about_constant(constant);
        return constant;
    }

    public static SubLObject new_constant_name_spec_p(final SubLObject v_object) {
        return makeBoolean((v_object == $UNNAMED) || (NIL != constant_completion_high.valid_constant_name_p(v_object)));
    }

    public static SubLObject cyc_kill(final SubLObject fort) {
        SubLTrampolineFile.enforceType(fort, FORT_P);
        SubLObject result = NIL;
        result = fi.fi_kill_int(fort);
        return result;
    }

    public static SubLObject cyc_rewrite(final SubLObject source_fort, final SubLObject target_fort) {
        SubLTrampolineFile.enforceType(source_fort, FORT_P);
        SubLTrampolineFile.enforceType(target_fort, FORT_P);
        Errors.error($str35$cyc_rewrite_is_not_implemented_ye);
        return target_fort;
    }

    public static SubLObject cyc_merge(final SubLObject kill_fort, final SubLObject keep_fort) {
        SubLTrampolineFile.enforceType(kill_fort, FORT_P);
        SubLTrampolineFile.enforceType(keep_fort, FORT_P);
        return fi.fi_merge_int(kill_fort, keep_fort);
    }

    public static SubLObject assert_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $assert_properties$.getGlobalValue());
    }

    public static SubLObject assert_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, ASSERT_PROPERTY_P);
    }

    public static SubLObject get_assert_property(final SubLObject v_properties, final SubLObject indicator, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(v_properties, indicator, v_default);
    }

    public static SubLObject cyc_assert(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sentence, POSSIBLY_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLTrampolineFile.enforceType(v_properties, ASSERT_PROPERTIES_P);
        SubLObject result = NIL;
        final SubLObject strength = get_assert_property(v_properties, $STRENGTH, $DEFAULT);
        final SubLObject direction = get_assert_property(v_properties, $DIRECTION, UNPROVIDED);
        final SubLObject check_wffP = get_assert_property(v_properties, $kw53$CHECK_WFF_, makeBoolean(NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue(thread)));
        final SubLObject forward_rules = get_assert_property(v_properties, $FORWARD_RULES, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread));
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            fi.$assume_assert_sentence_is_wfP$.bind(makeBoolean(NIL == check_wffP), thread);
            kb_control_vars.$forward_inference_allowed_rules$.bind(forward_rules, thread);
            result = fi.fi_assert_int(right_sentence, right_mt, strength, direction);
        } finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_2, thread);
            fi.$assume_assert_sentence_is_wfP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            cyc_bookkeeping.perform_assertion_bookkeeping(result);
        }
        return result;
    }

    public static SubLObject cyc_assert_wff(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject result = NIL;
        final SubLObject new_properties = putf(copy_list(v_properties), $kw53$CHECK_WFF_, NIL);
        result = cyc_assert(sentence, mt, new_properties);
        return result;
    }

    public static SubLObject cyc_deny(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sentence, POSSIBLY_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLTrampolineFile.enforceType(v_properties, ASSERT_PROPERTIES_P);
        SubLObject result = NIL;
        final SubLObject direction = get_assert_property(v_properties, $DIRECTION, UNPROVIDED);
        final SubLObject check_wffP = get_assert_property(v_properties, $kw53$CHECK_WFF_, makeBoolean(NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue(thread)));
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding(thread);
        try {
            fi.$assume_assert_sentence_is_wfP$.bind(makeBoolean(NIL == check_wffP), thread);
            result = fi.fi_deny_int(right_sentence, right_mt, direction);
        } finally {
            fi.$assume_assert_sentence_is_wfP$.rebind(_prev_bind_0, thread);
        }
        cyc_bookkeeping.perform_assertion_bookkeeping(result);
        return result;
    }

    public static SubLObject cyc_unassert(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sentence, POSSIBLY_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = fi.fi_unassert_int(right_sentence, right_mt);
        return result;
    }

    public static SubLObject cyc_edit(final SubLObject old_sentence, final SubLObject new_sentence, SubLObject old_mt, SubLObject new_mt, SubLObject v_properties) {
        if (old_mt == UNPROVIDED) {
            old_mt = NIL;
        }
        if (new_mt == UNPROVIDED) {
            new_mt = old_mt;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(old_sentence, POSSIBLY_SENTENCE_P);
        SubLTrampolineFile.enforceType(new_sentence, POSSIBLY_SENTENCE_P);
        if (NIL != old_mt) {
            SubLTrampolineFile.enforceType(old_mt, POSSIBLY_MT_P);
        }
        if (NIL != new_mt) {
            SubLTrampolineFile.enforceType(new_mt, POSSIBLY_MT_P);
        }
        SubLObject result = NIL;
        final SubLObject strength = getf(v_properties, $STRENGTH, UNPROVIDED);
        final SubLObject direction = getf(v_properties, $DIRECTION, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject right_old_sentence = czer_utilities.unwrap_if_ist(old_sentence, old_mt, UNPROVIDED);
        final SubLObject right_old_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject right_new_sentence = czer_utilities.unwrap_if_ist(new_sentence, new_mt, UNPROVIDED);
        final SubLObject right_new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = fi.fi_edit_int(right_old_sentence, right_new_sentence, right_old_mt, right_new_mt, strength, direction);
        cyc_bookkeeping.perform_assertion_bookkeeping(result);
        return result;
    }

    public static SubLObject cyc_add_argument(final SubLObject sentence, final SubLObject cycl_supports, SubLObject mt, SubLObject v_properties, SubLObject verify_supports) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (verify_supports == UNPROVIDED) {
            verify_supports = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sentence, POSSIBLY_SENTENCE_P);
        SubLTrampolineFile.enforceType(cycl_supports, LIST_OF_CYCL_SUPPORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLTrampolineFile.enforceType(v_properties, ASSERT_PROPERTIES_P);
        SubLTrampolineFile.enforceType(verify_supports, BOOLEANP);
        SubLObject result = NIL;
        final SubLObject direction = getf(v_properties, $DIRECTION, UNPROVIDED);
        final SubLObject check_wffP = get_assert_property(v_properties, $kw53$CHECK_WFF_, makeBoolean(NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue(thread)));
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding(thread);
        try {
            fi.$assume_assert_sentence_is_wfP$.bind(makeBoolean(NIL == check_wffP), thread);
            result = fi.fi_add_argument_int(right_sentence, right_mt, cycl_supports, direction, verify_supports);
        } finally {
            fi.$assume_assert_sentence_is_wfP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject cyc_remove_argument(final SubLObject sentence, final SubLObject cycl_supports, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sentence, POSSIBLY_SENTENCE_P);
        SubLTrampolineFile.enforceType(cycl_supports, LIST_OF_CYCL_SUPPORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = fi.fi_remove_argument_int(right_sentence, right_mt, cycl_supports, NIL);
        return result;
    }

    public static SubLObject cyc_remove_all_arguments(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sentence, POSSIBLY_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = fi.fi_blast_int(right_sentence, right_mt);
        return result;
    }

    public static SubLObject legacy_query_properties_p(final SubLObject v_object) {
        return listp(v_object);
    }

    public static SubLObject query_results_p(final SubLObject v_object) {
        return listp(v_object);
    }

    public static SubLObject cyc_query(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sentence, POSSIBLY_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLTrampolineFile.enforceType(v_properties, LEGACY_QUERY_PROPERTIES_P);
        final SubLObject backchain = getf(v_properties, $BACKCHAIN, UNPROVIDED);
        final SubLObject number = getf(v_properties, $NUMBER, UNPROVIDED);
        final SubLObject time = getf(v_properties, $TIME, UNPROVIDED);
        final SubLObject depth = getf(v_properties, $DEPTH, UNPROVIDED);
        final SubLObject hypothesizeP = getf(v_properties, $CONDITIONAL_SENTENCE, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject result = (NIL != hypothesizeP) ? prove.fi_prove_int(right_sentence, right_mt, backchain, number, time, depth) : fi.fi_ask_int(right_sentence, right_mt, backchain, number, time, depth);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != closed_query_success_result_p(result)) {
            result = closed_query_success_token();
        }
        return values(result, halt_reason);
    }

    public static SubLObject query_success_result_p(final SubLObject v_object) {
        return makeBoolean((NIL != open_query_success_result_p(v_object)) || (NIL != closed_query_success_result_p(v_object)));
    }

    public static SubLObject open_query_result_p(final SubLObject v_object) {
        return makeBoolean((NIL != bindings.binding_lists_p(v_object)) && (NIL == closed_query_success_result_p(v_object)));
    }

    public static SubLObject open_query_success_result_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != open_query_result_p(v_object)));
    }

    public static SubLObject closed_query_bindings_p(final SubLObject v_object) {
        return makeBoolean(v_object.equal($closed_query_bindings$.getGlobalValue()) || (NIL != bindings.unification_success_token_p(v_object)));
    }

    public static SubLObject closed_query_justified_bindings_p(final SubLObject v_object) {
        return makeBoolean((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != closed_query_bindings_p(v_object.first()))) && (NIL != arguments.supports_p(second(v_object))));
    }

    public static SubLObject closed_query_success_token() {
        return $closed_query_success_token$.getGlobalValue();
    }

    public static SubLObject closed_query_success_token_p(final SubLObject v_object) {
        return equal(v_object, $closed_query_success_token$.getGlobalValue());
    }

    public static SubLObject closed_query_success_result_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != list_utilities.singletonP(v_object))) && (NIL != closed_query_bindings_p(v_object.first())));
    }

    public static SubLObject closed_query_justified_success_result_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.every_in_list(CLOSED_QUERY_JUSTIFIED_BINDINGS_P, v_object, UNPROVIDED)));
    }

    public static SubLObject query_id_p(final SubLObject v_object) {
        return eq($LAST, v_object);
    }

    public static SubLObject cyc_continue_query(SubLObject query_id, SubLObject v_properties) {
        if (query_id == UNPROVIDED) {
            query_id = $LAST;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLTrampolineFile.enforceType(query_id, QUERY_ID_P);
        SubLTrampolineFile.enforceType(v_properties, LEGACY_QUERY_PROPERTIES_P);
        Errors.error($str94$cyc_continue_query_is_deprecated_);
        return NIL;
    }

    public static SubLObject cyc_tms_reconsider_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(sentence, POSSIBLY_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = fi.fi_tms_reconsider_formula_int(right_sentence, right_mt);
        return result;
    }

    public static SubLObject cyc_tms_reconsider_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fi.fi_tms_reconsider_term_int(v_term, mt);
    }

    public static SubLObject cyc_tms_reconsider_mt(final SubLObject mt) {
        return fi.fi_tms_reconsider_mt_int(mt);
    }

    public static SubLObject cyc_rename_variables(final SubLObject sentence, final SubLObject rename_variable_list, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(sentence, POSSIBLY_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLTrampolineFile.enforceType(rename_variable_list, ALIST_P);
        return fi.fi_rename_variables_int(sentence, mt, rename_variable_list);
    }

    public static SubLObject declare_cyc_kernel_file() {
        declareFunction(me, "cyc_create_new_permanent", "CYC-CREATE-NEW-PERMANENT", 1, 0, false);
        declareFunction(me, "cyc_create_new_ephemeral", "CYC-CREATE-NEW-EPHEMERAL", 1, 0, false);
        declareFunction(me, "cyc_create", "CYC-CREATE", 2, 0, false);
        declareFunction(me, "cyc_find_or_create", "CYC-FIND-OR-CREATE", 2, 0, false);
        declareFunction(me, "cyc_find_or_create_new_permanent", "CYC-FIND-OR-CREATE-NEW-PERMANENT", 1, 0, false);
        declareFunction(me, "cyc_rename", "CYC-RENAME", 2, 0, false);
        declareFunction(me, "cyc_recreate", "CYC-RECREATE", 1, 0, false);
        declareFunction(me, "new_constant_name_spec_p", "NEW-CONSTANT-NAME-SPEC-P", 1, 0, false);
        declareFunction(me, "cyc_kill", "CYC-KILL", 1, 0, false);
        declareFunction(me, "cyc_rewrite", "CYC-REWRITE", 2, 0, false);
        declareFunction(me, "cyc_merge", "CYC-MERGE", 2, 0, false);
        declareFunction(me, "assert_property_p", "ASSERT-PROPERTY-P", 1, 0, false);
        declareFunction(me, "assert_properties_p", "ASSERT-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "get_assert_property", "GET-ASSERT-PROPERTY", 2, 1, false);
        declareFunction(me, "cyc_assert", "CYC-ASSERT", 1, 2, false);
        declareFunction(me, "cyc_assert_wff", "CYC-ASSERT-WFF", 1, 2, false);
        declareFunction(me, "cyc_deny", "CYC-DENY", 1, 2, false);
        declareFunction(me, "cyc_unassert", "CYC-UNASSERT", 1, 1, false);
        declareFunction(me, "cyc_edit", "CYC-EDIT", 2, 3, false);
        declareFunction(me, "cyc_add_argument", "CYC-ADD-ARGUMENT", 2, 3, false);
        declareFunction(me, "cyc_remove_argument", "CYC-REMOVE-ARGUMENT", 2, 1, false);
        declareFunction(me, "cyc_remove_all_arguments", "CYC-REMOVE-ALL-ARGUMENTS", 1, 1, false);
        declareFunction(me, "legacy_query_properties_p", "LEGACY-QUERY-PROPERTIES-P", 1, 0, false);
        declareFunction(me, "query_results_p", "QUERY-RESULTS-P", 1, 0, false);
        declareFunction(me, "cyc_query", "CYC-QUERY", 1, 2, false);
        declareFunction(me, "query_success_result_p", "QUERY-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction(me, "open_query_result_p", "OPEN-QUERY-RESULT-P", 1, 0, false);
        declareFunction(me, "open_query_success_result_p", "OPEN-QUERY-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction(me, "closed_query_bindings_p", "CLOSED-QUERY-BINDINGS-P", 1, 0, false);
        declareFunction(me, "closed_query_justified_bindings_p", "CLOSED-QUERY-JUSTIFIED-BINDINGS-P", 1, 0, false);
        declareFunction(me, "closed_query_success_token", "CLOSED-QUERY-SUCCESS-TOKEN", 0, 0, false);
        declareFunction(me, "closed_query_success_token_p", "CLOSED-QUERY-SUCCESS-TOKEN-P", 1, 0, false);
        declareFunction(me, "closed_query_success_result_p", "CLOSED-QUERY-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction(me, "closed_query_justified_success_result_p", "CLOSED-QUERY-JUSTIFIED-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction(me, "query_id_p", "QUERY-ID-P", 1, 0, false);
        declareFunction(me, "cyc_continue_query", "CYC-CONTINUE-QUERY", 0, 2, false);
        declareFunction(me, "cyc_tms_reconsider_sentence", "CYC-TMS-RECONSIDER-SENTENCE", 1, 1, false);
        declareFunction(me, "cyc_tms_reconsider_term", "CYC-TMS-RECONSIDER-TERM", 1, 1, false);
        declareFunction(me, "cyc_tms_reconsider_mt", "CYC-TMS-RECONSIDER-MT", 1, 0, false);
        declareFunction(me, "cyc_rename_variables", "CYC-RENAME-VARIABLES", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_cyc_kernel_file() {
        deflexical("*ASSERT-PROPERTIES*", $list45);
        deflexical("*CLOSED-QUERY-BINDINGS*", NIL);
        deflexical("*CLOSED-QUERY-SUCCESS-TOKEN*", list($closed_query_bindings$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject setup_cyc_kernel_file() {
        register_cyc_api_function(CYC_CREATE_NEW_PERMANENT, $list3, $str4$Creates_a_new_constant_with_name_, $list5, $list6);
        register_cyc_api_function(CYC_CREATE_NEW_EPHEMERAL, $list3, $str8$Creates_a_new_constant_with_name_, $list5, $list6);
        register_cyc_api_function(CYC_CREATE, $list11, $str12$Create_a_new_constant_with_id_EXT, $list13, $list6);
        register_cyc_api_function(CYC_FIND_OR_CREATE, $list11, $str16$Return_constant_with_NAME_if_it_i, $list17, $list6);
        register_cyc_api_function(CYC_RENAME, $list20, $str21$Change_name_of_CONSTANT_to_NAME__, $list22, $list23);
        register_cyc_api_function(CYC_RECREATE, $list25, $str26$Doesn_t_unassert_the_bookkeeping_, $list27, $list6);
        register_cyc_api_function(CYC_KILL, $list31, $str32$Kill_FORT_and_all_its_uses_from_t, $list33, $list34);
        register_cyc_api_function(CYC_REWRITE, $list37, $str38$_moves__all_asserted_arguments_fr, $list39, $list40);
        register_cyc_api_function(CYC_MERGE, $list42, $str43$Move_asserted_assertions_on_KILL_, $list44, $list40);
        register_cyc_api_function(CYC_ASSERT, $list56, $str57$Assert_SENTENCE_in_the_specified_, $list58, $list34);
        register_cyc_api_function(CYC_DENY, $list56, $str60$Deny_SENTENCE_in_the_specified_MT, $list58, $list34);
        register_cyc_api_function(CYC_UNASSERT, $list62, $str63$Remove_the_assertions_canonicaliz, $list64, $list34);
        register_cyc_api_function(CYC_EDIT, $list66, $str67$Unassert_OLD_SENTENCE_in_OLD_MT__, $list68, $list34);
        register_cyc_api_function(CYC_ADD_ARGUMENT, $list72, $str73$Tell_Cyc_to_conclude_SENTENCE__op, $list74, $list34);
        register_cyc_api_function(CYC_REMOVE_ARGUMENT, $list76, $str77$Remove_the_argument_for_SENTENCE_, $list78, $list34);
        register_cyc_api_function(CYC_REMOVE_ALL_ARGUMENTS, $list62, $str80$Remove_all_arguments_for_SENTENCE, $list64, $list34);
        register_cyc_api_function(CYC_QUERY, $list56, $str88$Query_for_bindings_for_free_varia, $list89, $list90);
        register_obsolete_cyc_api_function(CYC_CONTINUE_QUERY, $list96, $list97, $str98$Continues_a_query_started_by__xre, $list99, $list90);
        register_cyc_api_function(CYC_TMS_RECONSIDER_SENTENCE, $list62, $str101$Reconsider_all_arguments_for_SENT, $list64, $list34);
        register_cyc_api_function(CYC_RENAME_VARIABLES, $list104, $str105$Rename_the_variables_in_SENTENCE_, $list106, $list34);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cyc_kernel_file();
    }

    @Override
    public void initializeVariables() {
        init_cyc_kernel_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyc_kernel_file();
    }

    
}

/**
 * Total time: 236 ms
 */
