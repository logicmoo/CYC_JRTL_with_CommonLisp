/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_completion_high.valid_constant_name_p;
import static com.cyc.cycjava.cycl.list_utilities.every_in_list;
import static com.cyc.cycjava.cycl.list_utilities.lengthE;
import static com.cyc.cycjava.cycl.list_utilities.proper_list_p;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_obsolete_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 * module:      CYC-KERNEL
 * source file: /cyc/top/cycl/cyc-kernel.lisp
 * created:     2019/07/03 17:37:48
 */
public final class cyc_kernel extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cyc_kernel();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $assert_properties$ = makeSymbol("*ASSERT-PROPERTIES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $closed_query_bindings$ = makeSymbol("*CLOSED-QUERY-BINDINGS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $closed_query_success_token$ = makeSymbol("*CLOSED-QUERY-SUCCESS-TOKEN*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol NEW_CONSTANT_NAME_SPEC_P = makeSymbol("NEW-CONSTANT-NAME-SPEC-P");

    private static final SubLSymbol FI_CREATE = makeSymbol("FI-CREATE");

    private static final SubLSymbol CYC_CREATE_NEW_PERMANENT = makeSymbol("CYC-CREATE-NEW-PERMANENT");

    static private final SubLList $list3 = list(makeSymbol("NAME"));

    static private final SubLString $str4$Creates_a_new_constant_with_name_ = makeString("Creates a new constant with name NAME, gives it a\n   permanent unique external ID, and adds the constant\n   creation operation to the transcript queue.");

    static private final SubLList $list5 = list(list(makeSymbol("NAME"), makeSymbol("NEW-CONSTANT-NAME-SPEC-P")));

    static private final SubLList $list6 = list(makeSymbol("CONSTANT-P"));

    private static final SubLSymbol CYC_CREATE_NEW_EPHEMERAL = makeSymbol("CYC-CREATE-NEW-EPHEMERAL");

    static private final SubLString $str8$Creates_a_new_constant_with_name_ = makeString("Creates a new constant with name NAME, but makes\n   no effort to synchronize its external ID with\n   other Cyc images.  This is intended for constants\n   that will not be transmitted to other Cyc images.");

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

    static private final SubLList $list22 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")));

    private static final SubLList $list23 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));

    private static final SubLSymbol CYC_RECREATE = makeSymbol("CYC-RECREATE");

    private static final SubLList $list25 = list(makeSymbol("CONSTANT"));

    private static final SubLString $str26$Doesn_t_unassert_the_bookkeeping_ = makeString("Doesn\'t unassert the bookkeeping info,\n   but it might actually move it, or change\n   its format somehow.");

    private static final SubLList $list27 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));

    private static final SubLSymbol CYC_KILL = makeSymbol("CYC-KILL");

    private static final SubLList $list31 = list(makeSymbol("FORT"));

    private static final SubLString $str32$Kill_FORT_and_all_its_uses_from_t = makeString("Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\n   in that microtheory are removed.");

    static private final SubLList $list33 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")));

    private static final SubLList $list34 = list(makeSymbol("BOOLEANP"));

    private static final SubLString $str35$cyc_rewrite_is_not_implemented_ye = makeString("cyc-rewrite is not implemented yet");

    private static final SubLSymbol CYC_REWRITE = makeSymbol("CYC-REWRITE");

    private static final SubLList $list37 = list(makeSymbol("SOURCE-FORT"), makeSymbol("TARGET-FORT"));

    private static final SubLString $str38$_moves__all_asserted_arguments_fr = makeString("\'moves\' all asserted arguments from SOURCE-FORT to TARGET-FORT\n   @return fort-p; TARGET-FORT");

    static private final SubLList $list39 = list(list(makeSymbol("SOURCE-FORT"), makeSymbol("FORT-P")), list(makeSymbol("TARGET-FORT"), makeSymbol("FORT-P")));

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

    static private final SubLList $list89 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("PROPERTIES"), makeSymbol("LEGACY-QUERY-PROPERTIES-P")));

    static private final SubLList $list90 = list(makeSymbol("QUERY-RESULTS-P"));

    private static final SubLSymbol CLOSED_QUERY_JUSTIFIED_BINDINGS_P = makeSymbol("CLOSED-QUERY-JUSTIFIED-BINDINGS-P");

    private static final SubLSymbol QUERY_ID_P = makeSymbol("QUERY-ID-P");

    private static final SubLString $str94$cyc_continue_query_is_deprecated_ = makeString("cyc-continue-query is deprecated; use CONTINUE-INFERENCE instead.");

    private static final SubLSymbol CYC_CONTINUE_QUERY = makeSymbol("CYC-CONTINUE-QUERY");

    private static final SubLList $list96 = list(makeSymbol("CONTINUE-INFERENCE"));

    static private final SubLList $list97 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("QUERY-ID"), $LAST), makeSymbol("PROPERTIES"));

    private static final SubLString $str98$Continues_a_query_started_by__xre = makeString("Continues a query started by @xref cyc-query.\n   If QUERY-ID is :last, the most recent query is continued.");

    static private final SubLList $list99 = list(list(makeSymbol("QUERY-ID"), makeSymbol("QUERY-ID-P")), list(makeSymbol("PROPERTIES"), makeSymbol("LEGACY-QUERY-PROPERTIES-P")));

    private static final SubLSymbol CYC_TMS_RECONSIDER_SENTENCE = makeSymbol("CYC-TMS-RECONSIDER-SENTENCE");

    private static final SubLString $str101$Reconsider_all_arguments_for_SENT = makeString("Reconsider all arguments for SENTENCE within MT.  Return T if the\n   operation succeeded, NIL if there was an error.");

    private static final SubLSymbol CYC_RENAME_VARIABLES = makeSymbol("CYC-RENAME-VARIABLES");

    private static final SubLList $list104 = list(makeSymbol("SENTENCE"), makeSymbol("RENAME-VARIABLE-LIST"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str105$Rename_the_variables_in_SENTENCE_ = makeString("Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\n   if it is provably possible to do so without changing the logical intent of SENTENCE.\n   @see simple-variable-rename-impossible?\n   @return booleanp; T if the operation succeeded, NIL if there was an error.");

    private static final SubLList $list106 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("RENAME-VARIABLE-LIST"), makeSymbol("ALIST-P")));

    // Definitions
    /**
     * Creates a new constant with name NAME, gives it a
     * permanent unique external ID, and adds the constant
     * creation operation to the transcript queue.
     */
    @LispMethod(comment = "Creates a new constant with name NAME, gives it a\r\npermanent unique external ID, and adds the constant\r\ncreation operation to the transcript queue.\nCreates a new constant with name NAME, gives it a\npermanent unique external ID, and adds the constant\ncreation operation to the transcript queue.")
    public static final SubLObject cyc_create_new_permanent_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, NEW_CONSTANT_NAME_SPEC_P);
        return transcript_utilities.transcript_eval(list(CYC_CREATE, name, constants_high.make_constant_external_id()), UNPROVIDED);
    }

    // Definitions
    /**
     * Creates a new constant with name NAME, gives it a
     * permanent unique external ID, and adds the constant
     * creation operation to the transcript queue.
     */
    @LispMethod(comment = "Creates a new constant with name NAME, gives it a\r\npermanent unique external ID, and adds the constant\r\ncreation operation to the transcript queue.\nCreates a new constant with name NAME, gives it a\npermanent unique external ID, and adds the constant\ncreation operation to the transcript queue.")
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

    /**
     * Creates a new constant with name NAME, but makes
     * no effort to synchronize its external ID with
     * other Cyc images.  This is intended for constants
     * that will not be transmitted to other Cyc images.
     */
    @LispMethod(comment = "Creates a new constant with name NAME, but makes\r\nno effort to synchronize its external ID with\r\nother Cyc images.  This is intended for constants\r\nthat will not be transmitted to other Cyc images.\nCreates a new constant with name NAME, but makes\nno effort to synchronize its external ID with\nother Cyc images.  This is intended for constants\nthat will not be transmitted to other Cyc images.")
    public static final SubLObject cyc_create_new_ephemeral_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, NEW_CONSTANT_NAME_SPEC_P);
        return com.cyc.cycjava.cycl.cyc_kernel.cyc_create(name, constants_high.make_constant_external_id());
    }

    /**
     * Creates a new constant with name NAME, but makes
     * no effort to synchronize its external ID with
     * other Cyc images.  This is intended for constants
     * that will not be transmitted to other Cyc images.
     */
    @LispMethod(comment = "Creates a new constant with name NAME, but makes\r\nno effort to synchronize its external ID with\r\nother Cyc images.  This is intended for constants\r\nthat will not be transmitted to other Cyc images.\nCreates a new constant with name NAME, but makes\nno effort to synchronize its external ID with\nother Cyc images.  This is intended for constants\nthat will not be transmitted to other Cyc images.")
    public static SubLObject cyc_create_new_ephemeral(final SubLObject name) {
        SubLTrampolineFile.enforceType(name, NEW_CONSTANT_NAME_SPEC_P);
        return cyc_create(name, constants_high.make_constant_external_id());
    }

    /**
     * Create a new constant with id EXTERNAL-ID.
     * If NAME is anything other than :unnamed,
     * the new constant will be given the name NAME.
     */
    @LispMethod(comment = "Create a new constant with id EXTERNAL-ID.\r\nIf NAME is anything other than :unnamed,\r\nthe new constant will be given the name NAME.\nCreate a new constant with id EXTERNAL-ID.\nIf NAME is anything other than :unnamed,\nthe new constant will be given the name NAME.")
    public static final SubLObject cyc_create_alt(SubLObject name, SubLObject external_id) {
        SubLTrampolineFile.checkType(name, NEW_CONSTANT_NAME_SPEC_P);
        if (NIL != external_id) {
            SubLTrampolineFile.checkType(external_id, CONSTANT_EXTERNAL_ID_P);
        }
        {
            SubLObject result = NIL;
            result = fi.fi_create_int(name, external_id);
            cyc_bookkeeping.perform_constant_bookkeeping(result);
            return result;
        }
    }

    /**
     * Create a new constant with id EXTERNAL-ID.
     * If NAME is anything other than :unnamed,
     * the new constant will be given the name NAME.
     */
    @LispMethod(comment = "Create a new constant with id EXTERNAL-ID.\r\nIf NAME is anything other than :unnamed,\r\nthe new constant will be given the name NAME.\nCreate a new constant with id EXTERNAL-ID.\nIf NAME is anything other than :unnamed,\nthe new constant will be given the name NAME.")
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

    /**
     * Return constant with NAME if it is present.
     * If not present, then create constant with NAME, using EXTERNAL-ID if given.
     * If EXTERNAL-ID is not given, generate a new one for the new constant.
     */
    @LispMethod(comment = "Return constant with NAME if it is present.\r\nIf not present, then create constant with NAME, using EXTERNAL-ID if given.\r\nIf EXTERNAL-ID is not given, generate a new one for the new constant.\nReturn constant with NAME if it is present.\nIf not present, then create constant with NAME, using EXTERNAL-ID if given.\nIf EXTERNAL-ID is not given, generate a new one for the new constant.")
    public static final SubLObject cyc_find_or_create_alt(SubLObject name, SubLObject external_id) {
        SubLTrampolineFile.checkType(name, VALID_CONSTANT_NAME_P);
        if (NIL != external_id) {
            SubLTrampolineFile.checkType(external_id, CONSTANT_EXTERNAL_ID_P);
        }
        {
            SubLObject result = NIL;
            result = fi.fi_find_int(name);
            if (NIL == result) {
                result = com.cyc.cycjava.cycl.cyc_kernel.cyc_create(name, external_id);
            }
            return result;
        }
    }

    /**
     * Return constant with NAME if it is present.
     * If not present, then create constant with NAME, using EXTERNAL-ID if given.
     * If EXTERNAL-ID is not given, generate a new one for the new constant.
     */
    @LispMethod(comment = "Return constant with NAME if it is present.\r\nIf not present, then create constant with NAME, using EXTERNAL-ID if given.\r\nIf EXTERNAL-ID is not given, generate a new one for the new constant.\nReturn constant with NAME if it is present.\nIf not present, then create constant with NAME, using EXTERNAL-ID if given.\nIf EXTERNAL-ID is not given, generate a new one for the new constant.")
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

    /**
     * Return constant with NAME if it is present.
     * Otherwise, creates a new constant with name NAME, gives it a
     * permanent unique external ID, and adds the constant
     * creation operation to the transcript queue.
     */
    @LispMethod(comment = "Return constant with NAME if it is present.\r\nOtherwise, creates a new constant with name NAME, gives it a\r\npermanent unique external ID, and adds the constant\r\ncreation operation to the transcript queue.\nReturn constant with NAME if it is present.\nOtherwise, creates a new constant with name NAME, gives it a\npermanent unique external ID, and adds the constant\ncreation operation to the transcript queue.")
    public static final SubLObject cyc_find_or_create_new_permanent_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, VALID_CONSTANT_NAME_P);
        {
            SubLObject result = NIL;
            result = fi.fi_find_int(name);
            if (NIL == result) {
                result = com.cyc.cycjava.cycl.cyc_kernel.cyc_create_new_permanent(name);
            }
            return result;
        }
    }

    /**
     * Return constant with NAME if it is present.
     * Otherwise, creates a new constant with name NAME, gives it a
     * permanent unique external ID, and adds the constant
     * creation operation to the transcript queue.
     */
    @LispMethod(comment = "Return constant with NAME if it is present.\r\nOtherwise, creates a new constant with name NAME, gives it a\r\npermanent unique external ID, and adds the constant\r\ncreation operation to the transcript queue.\nReturn constant with NAME if it is present.\nOtherwise, creates a new constant with name NAME, gives it a\npermanent unique external ID, and adds the constant\ncreation operation to the transcript queue.")
    public static SubLObject cyc_find_or_create_new_permanent(final SubLObject name) {
        assert NIL != constant_completion_high.valid_constant_name_p(name) : "! constant_completion_high.valid_constant_name_p(name) " + ("constant_completion_high.valid_constant_name_p(name) " + "CommonSymbols.NIL != constant_completion_high.valid_constant_name_p(name) ") + name;
        SubLObject result = NIL;
        result = fi.fi_find_int(name);
        if (NIL == result) {
            result = cyc_create_new_permanent(name);
        }
        return result;
    }

    /**
     * Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.
     */
    @LispMethod(comment = "Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.")
    public static final SubLObject cyc_rename_alt(SubLObject constant, SubLObject name) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        SubLTrampolineFile.checkType(name, VALID_CONSTANT_NAME_P);
        return fi.fi_rename_int(constant, name);
    }

    /**
     * Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.
     */
    @LispMethod(comment = "Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.")
    public static SubLObject cyc_rename(final SubLObject constant, final SubLObject name) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        SubLTrampolineFile.enforceType(name, VALID_CONSTANT_NAME_P);
        return fi.fi_rename_int(constant, name);
    }

    /**
     * Doesn't unassert the bookkeeping info,
     * but it might actually move it, or change
     * its format somehow.
     */
    @LispMethod(comment = "Doesn\'t unassert the bookkeeping info,\r\nbut it might actually move it, or change\r\nits format somehow.\nDoesn\'t unassert the bookkeeping info,\nbut it might actually move it, or change\nits format somehow.")
    public static final SubLObject cyc_recreate_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        constants_high.remove_everything_about_constant(constant);
        return constant;
    }

    /**
     * Doesn't unassert the bookkeeping info,
     * but it might actually move it, or change
     * its format somehow.
     */
    @LispMethod(comment = "Doesn\'t unassert the bookkeeping info,\r\nbut it might actually move it, or change\r\nits format somehow.\nDoesn\'t unassert the bookkeeping info,\nbut it might actually move it, or change\nits format somehow.")
    public static SubLObject cyc_recreate(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        constants_high.remove_everything_about_constant(constant);
        return constant;
    }

    public static final SubLObject new_constant_name_spec_p_alt(SubLObject v_object) {
        return makeBoolean((v_object == $UNNAMED) || (NIL != valid_constant_name_p(v_object)));
    }

    public static SubLObject new_constant_name_spec_p(final SubLObject v_object) {
        return makeBoolean((v_object == $UNNAMED) || (NIL != constant_completion_high.valid_constant_name_p(v_object)));
    }

    /**
     * Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions
     * in that microtheory are removed.
     */
    @LispMethod(comment = "Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\r\nin that microtheory are removed.\nKill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\nin that microtheory are removed.")
    public static final SubLObject cyc_kill_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        return fi.fi_kill_int(fort);
    }

    /**
     * Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions
     * in that microtheory are removed.
     */
    @LispMethod(comment = "Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\r\nin that microtheory are removed.\nKill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\nin that microtheory are removed.")
    public static SubLObject cyc_kill(final SubLObject fort) {
        SubLTrampolineFile.enforceType(fort, FORT_P);
        SubLObject result = NIL;
        result = fi.fi_kill_int(fort);
        return result;
    }

    /**
     * 'moves' all asserted arguments from SOURCE-FORT to TARGET-FORT
     *
     * @return fort-p; TARGET-FORT
     */
    @LispMethod(comment = "\'moves\' all asserted arguments from SOURCE-FORT to TARGET-FORT\r\n\r\n@return fort-p; TARGET-FORT")
    public static final SubLObject cyc_rewrite_alt(SubLObject source_fort, SubLObject target_fort) {
        SubLTrampolineFile.checkType(source_fort, FORT_P);
        SubLTrampolineFile.checkType(target_fort, FORT_P);
        Errors.error($str_alt34$cyc_rewrite_is_not_implemented_ye);
        return target_fort;
    }

    /**
     * 'moves' all asserted arguments from SOURCE-FORT to TARGET-FORT
     *
     * @return fort-p; TARGET-FORT
     */
    @LispMethod(comment = "\'moves\' all asserted arguments from SOURCE-FORT to TARGET-FORT\r\n\r\n@return fort-p; TARGET-FORT")
    public static SubLObject cyc_rewrite(final SubLObject source_fort, final SubLObject target_fort) {
        SubLTrampolineFile.enforceType(source_fort, FORT_P);
        SubLTrampolineFile.enforceType(target_fort, FORT_P);
        Errors.error($str35$cyc_rewrite_is_not_implemented_ye);
        return target_fort;
    }

    /**
     * Move asserted assertions on KILL-TERM onto KEEP-TERM before killing KILL-TERM.
     *
     * @return fort-p; KEEP-FORT
     */
    @LispMethod(comment = "Move asserted assertions on KILL-TERM onto KEEP-TERM before killing KILL-TERM.\r\n\r\n@return fort-p; KEEP-FORT")
    public static final SubLObject cyc_merge_alt(SubLObject kill_fort, SubLObject keep_fort) {
        SubLTrampolineFile.checkType(kill_fort, FORT_P);
        SubLTrampolineFile.checkType(keep_fort, FORT_P);
        return fi.fi_merge_int(kill_fort, keep_fort);
    }

    /**
     * Move asserted assertions on KILL-TERM onto KEEP-TERM before killing KILL-TERM.
     *
     * @return fort-p; KEEP-FORT
     */
    @LispMethod(comment = "Move asserted assertions on KILL-TERM onto KEEP-TERM before killing KILL-TERM.\r\n\r\n@return fort-p; KEEP-FORT")
    public static SubLObject cyc_merge(final SubLObject kill_fort, final SubLObject keep_fort) {
        SubLTrampolineFile.enforceType(kill_fort, FORT_P);
        SubLTrampolineFile.enforceType(keep_fort, FORT_P);
        return fi.fi_merge_int(kill_fort, keep_fort);
    }

    public static SubLObject assert_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $assert_properties$.getGlobalValue());
    }

    public static final SubLObject assert_properties_p_alt(SubLObject v_object) {
        return listp(v_object);
    }

    public static SubLObject assert_properties_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, ASSERT_PROPERTY_P);
    }

    public static final SubLObject get_assert_property_alt(SubLObject v_properties, SubLObject indicator, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(v_properties, indicator, v_default);
    }

    public static SubLObject get_assert_property(final SubLObject v_properties, final SubLObject indicator, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(v_properties, indicator, v_default);
    }

    /**
     * Assert SENTENCE in the specified MT.
     * properties; :strength el-strength-p (:default or :monotonic)
     * :direction direction-p  (:forward or :backward)
     * GAF assertion direction defaults to :forward, and rule
     * assertion direction defaults to :backward.
     *
     * @return booleanp; t iff the assert succeeded.  If the assertion
    already existed, it is considered a success.
     */
    @LispMethod(comment = "Assert SENTENCE in the specified MT.\r\nproperties; :strength el-strength-p (:default or :monotonic)\r\n:direction direction-p  (:forward or :backward)\r\nGAF assertion direction defaults to :forward, and rule\r\nassertion direction defaults to :backward.\r\n\r\n@return booleanp; t iff the assert succeeded.  If the assertion\r\nalready existed, it is considered a success.\nAssert SENTENCE in the specified MT.\nproperties; :strength el-strength-p (:default or :monotonic)\n:direction direction-p  (:forward or :backward)\nGAF assertion direction defaults to :forward, and rule\nassertion direction defaults to :backward.")
    public static final SubLObject cyc_assert_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, POSSIBLY_SENTENCE_P);
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
            }
            SubLTrampolineFile.checkType(v_properties, ASSERT_PROPERTIES_P);
            {
                SubLObject result = NIL;
                SubLObject strength = com.cyc.cycjava.cycl.cyc_kernel.get_assert_property(v_properties, $STRENGTH, $DEFAULT);
                SubLObject direction = com.cyc.cycjava.cycl.cyc_kernel.get_assert_property(v_properties, $DIRECTION, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt);
                    SubLObject right_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = fi.fi_assert_int(right_sentence, right_mt, strength, direction);
                    cyc_bookkeeping.perform_assertion_bookkeeping(result);
                }
                return result;
            }
        }
    }

    /**
     * Assert SENTENCE in the specified MT.
     * properties; :strength el-strength-p (:default or :monotonic)
     * :direction direction-p  (:forward or :backward)
     * GAF assertion direction defaults to :forward, and rule
     * assertion direction defaults to :backward.
     *
     * @return booleanp; t iff the assert succeeded.  If the assertion
    already existed, it is considered a success.
     */
    @LispMethod(comment = "Assert SENTENCE in the specified MT.\r\nproperties; :strength el-strength-p (:default or :monotonic)\r\n:direction direction-p  (:forward or :backward)\r\nGAF assertion direction defaults to :forward, and rule\r\nassertion direction defaults to :backward.\r\n\r\n@return booleanp; t iff the assert succeeded.  If the assertion\r\nalready existed, it is considered a success.\nAssert SENTENCE in the specified MT.\nproperties; :strength el-strength-p (:default or :monotonic)\n:direction direction-p  (:forward or :backward)\nGAF assertion direction defaults to :forward, and rule\nassertion direction defaults to :backward.")
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

    /**
     * Like @xref CYC-ASSERT, but SENTENCE is assumed well-formed.
     */
    @LispMethod(comment = "Like @xref CYC-ASSERT, but SENTENCE is assumed well-formed.")
    public static final SubLObject cyc_assert_wff_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding(thread);
                    try {
                        fi.$assume_assert_sentence_is_wfP$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.cyc_kernel.cyc_assert(sentence, mt, v_properties);
                    } finally {
                        fi.$assume_assert_sentence_is_wfP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Like @xref CYC-ASSERT, but SENTENCE is assumed well-formed.
     */
    @LispMethod(comment = "Like @xref CYC-ASSERT, but SENTENCE is assumed well-formed.")
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

    /**
     * Remove the assertions canonicalized from FORMULA in the microtheory MT.
     * Return T if the operation succeeded, otherwise return NIL.
     */
    @LispMethod(comment = "Remove the assertions canonicalized from FORMULA in the microtheory MT.\r\nReturn T if the operation succeeded, otherwise return NIL.\nRemove the assertions canonicalized from FORMULA in the microtheory MT.\nReturn T if the operation succeeded, otherwise return NIL.")
    public static final SubLObject cyc_unassert_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, POSSIBLY_SENTENCE_P);
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
            }
            {
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt);
                    SubLObject right_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = fi.fi_unassert_int(right_sentence, right_mt);
                }
                return result;
            }
        }
    }

    /**
     * Remove the assertions canonicalized from FORMULA in the microtheory MT.
     * Return T if the operation succeeded, otherwise return NIL.
     */
    @LispMethod(comment = "Remove the assertions canonicalized from FORMULA in the microtheory MT.\r\nReturn T if the operation succeeded, otherwise return NIL.\nRemove the assertions canonicalized from FORMULA in the microtheory MT.\nReturn T if the operation succeeded, otherwise return NIL.")
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

    /**
     * Unassert OLD-SENTENCE in OLD-MT, and assert NEW-SENTENCE in the specified NEW-MT.
     *
     * @see cyc-unassert and @xref cyc-assert
     */
    @LispMethod(comment = "Unassert OLD-SENTENCE in OLD-MT, and assert NEW-SENTENCE in the specified NEW-MT.\r\n\r\n@see cyc-unassert and @xref cyc-assert")
    public static final SubLObject cyc_edit_alt(SubLObject old_sentence, SubLObject new_sentence, SubLObject old_mt, SubLObject new_mt, SubLObject v_properties) {
        if (old_mt == UNPROVIDED) {
            old_mt = NIL;
        }
        if (new_mt == UNPROVIDED) {
            new_mt = old_mt;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(old_sentence, POSSIBLY_SENTENCE_P);
            SubLTrampolineFile.checkType(new_sentence, POSSIBLY_SENTENCE_P);
            if (NIL != old_mt) {
                SubLTrampolineFile.checkType(old_mt, POSSIBLY_MT_P);
            }
            if (NIL != new_mt) {
                SubLTrampolineFile.checkType(new_mt, POSSIBLY_MT_P);
            }
            {
                SubLObject result = NIL;
                SubLObject strength = getf(v_properties, $STRENGTH, UNPROVIDED);
                SubLObject direction = getf(v_properties, $DIRECTION, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject right_old_sentence = czer_utilities.unwrap_if_ist(old_sentence, old_mt);
                    SubLObject right_old_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject right_new_sentence = czer_utilities.unwrap_if_ist(new_sentence, new_mt);
                        SubLObject right_new_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result = fi.fi_edit_int(right_old_sentence, right_new_sentence, right_old_mt, right_new_mt, strength, direction);
                    }
                }
                cyc_bookkeeping.perform_assertion_bookkeeping(result);
                return result;
            }
        }
    }

    /**
     * Unassert OLD-SENTENCE in OLD-MT, and assert NEW-SENTENCE in the specified NEW-MT.
     *
     * @see cyc-unassert and @xref cyc-assert
     */
    @LispMethod(comment = "Unassert OLD-SENTENCE in OLD-MT, and assert NEW-SENTENCE in the specified NEW-MT.\r\n\r\n@see cyc-unassert and @xref cyc-assert")
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

    /**
     * Tell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or
     * otherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports
     * before making the assertion.
     * Properties: :direction :forward or :backward
     */
    @LispMethod(comment = "Tell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or\r\notherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports\r\nbefore making the assertion.\r\nProperties: :direction :forward or :backward\nTell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or\notherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports\nbefore making the assertion.\nProperties: :direction :forward or :backward")
    public static final SubLObject cyc_add_argument_alt(SubLObject sentence, SubLObject cycl_supports, SubLObject mt, SubLObject v_properties, SubLObject verify_supports) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (verify_supports == UNPROVIDED) {
            verify_supports = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, POSSIBLY_SENTENCE_P);
            SubLTrampolineFile.checkType(cycl_supports, LIST_OF_CYCL_SUPPORT_P);
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
            }
            SubLTrampolineFile.checkType(v_properties, ASSERT_PROPERTIES_P);
            SubLTrampolineFile.checkType(verify_supports, BOOLEANP);
            {
                SubLObject result = NIL;
                SubLObject direction = getf(v_properties, $DIRECTION, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt);
                    SubLObject right_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = fi.fi_add_argument_int(right_sentence, right_mt, cycl_supports, direction, verify_supports);
                }
                return result;
            }
        }
    }

    /**
     * Tell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or
     * otherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports
     * before making the assertion.
     * Properties: :direction :forward or :backward
     */
    @LispMethod(comment = "Tell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or\r\notherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports\r\nbefore making the assertion.\r\nProperties: :direction :forward or :backward\nTell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or\notherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports\nbefore making the assertion.\nProperties: :direction :forward or :backward")
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

    /**
     * Remove the argument for SENTENCE specified by CYCL-SUPPORTS.
     */
    @LispMethod(comment = "Remove the argument for SENTENCE specified by CYCL-SUPPORTS.")
    public static final SubLObject cyc_remove_argument_alt(SubLObject sentence, SubLObject cycl_supports, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, POSSIBLY_SENTENCE_P);
            SubLTrampolineFile.checkType(cycl_supports, LIST_OF_CYCL_SUPPORT_P);
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
            }
            {
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt);
                    SubLObject right_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = fi.fi_remove_argument_int(right_sentence, right_mt, cycl_supports, NIL);
                }
                return result;
            }
        }
    }

    /**
     * Remove the argument for SENTENCE specified by CYCL-SUPPORTS.
     */
    @LispMethod(comment = "Remove the argument for SENTENCE specified by CYCL-SUPPORTS.")
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

    /**
     * Remove all arguments for SENTENCE within MT, including both those
     * arguments resulting the direct assertion of SENTENCE, and
     * those arguments supporting SENTENCE which were derived through inference.
     * Return T if successful, otherwise return NIL.
     */
    @LispMethod(comment = "Remove all arguments for SENTENCE within MT, including both those\r\narguments resulting the direct assertion of SENTENCE, and\r\nthose arguments supporting SENTENCE which were derived through inference.\r\nReturn T if successful, otherwise return NIL.\nRemove all arguments for SENTENCE within MT, including both those\narguments resulting the direct assertion of SENTENCE, and\nthose arguments supporting SENTENCE which were derived through inference.\nReturn T if successful, otherwise return NIL.")
    public static final SubLObject cyc_remove_all_arguments_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, POSSIBLY_SENTENCE_P);
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
            }
            {
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt);
                    SubLObject right_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = fi.fi_blast_int(right_sentence, right_mt);
                }
                return result;
            }
        }
    }

    /**
     * Remove all arguments for SENTENCE within MT, including both those
     * arguments resulting the direct assertion of SENTENCE, and
     * those arguments supporting SENTENCE which were derived through inference.
     * Return T if successful, otherwise return NIL.
     */
    @LispMethod(comment = "Remove all arguments for SENTENCE within MT, including both those\r\narguments resulting the direct assertion of SENTENCE, and\r\nthose arguments supporting SENTENCE which were derived through inference.\r\nReturn T if successful, otherwise return NIL.\nRemove all arguments for SENTENCE within MT, including both those\narguments resulting the direct assertion of SENTENCE, and\nthose arguments supporting SENTENCE which were derived through inference.\nReturn T if successful, otherwise return NIL.")
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

    public static final SubLObject legacy_query_properties_p_alt(SubLObject v_object) {
        return listp(v_object);
    }

    public static SubLObject legacy_query_properties_p(final SubLObject v_object) {
        return listp(v_object);
    }

    public static final SubLObject query_results_p_alt(SubLObject v_object) {
        return listp(v_object);
    }

    public static SubLObject query_results_p(final SubLObject v_object) {
        return listp(v_object);
    }

    /**
     * Query for bindings for free variables which will satisfy SENTENCE within MT.
     * ;;;{{{DOC
     * Properties: :backchain NIL or an integer or T
     * :number    NIL or an integer
     * :time      NIL or an integer
     * :depth     NIL or an integer
     * :conditional-sentence boolean
     * If :backchain is NIL, no backchaining is performed.
     * If :backchain is an integer, then at most that many backchaining steps using rules
     * are performed.
     * If :backchain is T, then inference is performed without limit on the number of
     * backchaining steps when searching for bindings.
     * If :number is an integer, then at most that number of bindings are returned.
     * If :time is an integer, then at most that many seconds are consumed by the search for
     * bindings.
     * If :depth is an integer, then the inference paths are limited to that number of
     * total steps.
     * Returns NIL if the operation had an error.  Otherwise returns a (possibly empty)
     * binding set.  In the case where the SENTENCE has no free variables,
     * the form (NIL), the empty binding set is returned, indicating that the gaf is either
     * directly asserted in the KB, or that it can be derived via rules in the KB.
     * If it fails to be proven, NIL will be returned.
     * The second return value indicates the reason why the query halted.
     * If SENTENCE is an implication, or an ist wrapped around an implication,
     * and the :conditional-sentence property is non-nil, cyc-query will attempt to
     * prove SENTENCE by reductio ad absurdum.
     * ;;;}}}EDOC
     */
    @LispMethod(comment = "Query for bindings for free variables which will satisfy SENTENCE within MT.\r\n;;;{{{DOC\r\nProperties: :backchain NIL or an integer or T\r\n:number    NIL or an integer\r\n:time      NIL or an integer\r\n:depth     NIL or an integer\r\n:conditional-sentence boolean\r\nIf :backchain is NIL, no backchaining is performed.\r\nIf :backchain is an integer, then at most that many backchaining steps using rules\r\nare performed.\r\nIf :backchain is T, then inference is performed without limit on the number of\r\nbackchaining steps when searching for bindings.\r\nIf :number is an integer, then at most that number of bindings are returned.\r\nIf :time is an integer, then at most that many seconds are consumed by the search for\r\nbindings.\r\nIf :depth is an integer, then the inference paths are limited to that number of\r\ntotal steps.\r\nReturns NIL if the operation had an error.  Otherwise returns a (possibly empty)\r\nbinding set.  In the case where the SENTENCE has no free variables,\r\nthe form (NIL), the empty binding set is returned, indicating that the gaf is either\r\ndirectly asserted in the KB, or that it can be derived via rules in the KB.\r\nIf it fails to be proven, NIL will be returned.\r\nThe second return value indicates the reason why the query halted.\r\nIf SENTENCE is an implication, or an ist wrapped around an implication,\r\nand the :conditional-sentence property is non-nil, cyc-query will attempt to\r\nprove SENTENCE by reductio ad absurdum.\r\n;;;}}}EDOC\nQuery for bindings for free variables which will satisfy SENTENCE within MT.\n;;;{{{DOC\nProperties: :backchain NIL or an integer or T\n:number    NIL or an integer\n:time      NIL or an integer\n:depth     NIL or an integer\n:conditional-sentence boolean\nIf :backchain is NIL, no backchaining is performed.\nIf :backchain is an integer, then at most that many backchaining steps using rules\nare performed.\nIf :backchain is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf :number is an integer, then at most that number of bindings are returned.\nIf :time is an integer, then at most that many seconds are consumed by the search for\nbindings.\nIf :depth is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a (possibly empty)\nbinding set.  In the case where the SENTENCE has no free variables,\nthe form (NIL), the empty binding set is returned, indicating that the gaf is either\ndirectly asserted in the KB, or that it can be derived via rules in the KB.\nIf it fails to be proven, NIL will be returned.\nThe second return value indicates the reason why the query halted.\nIf SENTENCE is an implication, or an ist wrapped around an implication,\nand the :conditional-sentence property is non-nil, cyc-query will attempt to\nprove SENTENCE by reductio ad absurdum.\n;;;}}}EDOC")
    public static final SubLObject cyc_query_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, POSSIBLY_SENTENCE_P);
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
            }
            SubLTrampolineFile.checkType(v_properties, LEGACY_QUERY_PROPERTIES_P);
            {
                SubLObject backchain = getf(v_properties, $BACKCHAIN, UNPROVIDED);
                SubLObject number = getf(v_properties, $NUMBER, UNPROVIDED);
                SubLObject time = getf(v_properties, $TIME, UNPROVIDED);
                SubLObject depth = getf(v_properties, $DEPTH, UNPROVIDED);
                SubLObject hypothesizeP = getf(v_properties, $CONDITIONAL_SENTENCE, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt);
                    SubLObject right_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject result = (NIL != hypothesizeP) ? ((SubLObject) (prove.fi_prove_int(right_sentence, right_mt, backchain, number, time, depth))) : fi.fi_ask_int(right_sentence, right_mt, backchain, number, time, depth);
                        SubLObject halt_reason = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != com.cyc.cycjava.cycl.cyc_kernel.closed_query_success_result_p(result)) {
                            result = com.cyc.cycjava.cycl.cyc_kernel.closed_query_success_token();
                        }
                        return values(result, halt_reason);
                    }
                }
            }
        }
    }

    /**
     * Query for bindings for free variables which will satisfy SENTENCE within MT.
     * ;;;{{{DOC
     * Properties: :backchain NIL or an integer or T
     * :number    NIL or an integer
     * :time      NIL or an integer
     * :depth     NIL or an integer
     * :conditional-sentence boolean
     * If :backchain is NIL, no backchaining is performed.
     * If :backchain is an integer, then at most that many backchaining steps using rules
     * are performed.
     * If :backchain is T, then inference is performed without limit on the number of
     * backchaining steps when searching for bindings.
     * If :number is an integer, then at most that number of bindings are returned.
     * If :time is an integer, then at most that many seconds are consumed by the search for
     * bindings.
     * If :depth is an integer, then the inference paths are limited to that number of
     * total steps.
     * Returns NIL if the operation had an error.  Otherwise returns a (possibly empty)
     * binding set.  In the case where the SENTENCE has no free variables,
     * the form (NIL), the empty binding set is returned, indicating that the gaf is either
     * directly asserted in the KB, or that it can be derived via rules in the KB.
     * If it fails to be proven, NIL will be returned.
     * The second return value indicates the reason why the query halted.
     * If SENTENCE is an implication, or an ist wrapped around an implication,
     * and the :conditional-sentence property is non-nil, cyc-query will attempt to
     * prove SENTENCE by reductio ad absurdum.
     * ;;;}}}EDOC
     */
    @LispMethod(comment = "Query for bindings for free variables which will satisfy SENTENCE within MT.\r\n;;;{{{DOC\r\nProperties: :backchain NIL or an integer or T\r\n:number    NIL or an integer\r\n:time      NIL or an integer\r\n:depth     NIL or an integer\r\n:conditional-sentence boolean\r\nIf :backchain is NIL, no backchaining is performed.\r\nIf :backchain is an integer, then at most that many backchaining steps using rules\r\nare performed.\r\nIf :backchain is T, then inference is performed without limit on the number of\r\nbackchaining steps when searching for bindings.\r\nIf :number is an integer, then at most that number of bindings are returned.\r\nIf :time is an integer, then at most that many seconds are consumed by the search for\r\nbindings.\r\nIf :depth is an integer, then the inference paths are limited to that number of\r\ntotal steps.\r\nReturns NIL if the operation had an error.  Otherwise returns a (possibly empty)\r\nbinding set.  In the case where the SENTENCE has no free variables,\r\nthe form (NIL), the empty binding set is returned, indicating that the gaf is either\r\ndirectly asserted in the KB, or that it can be derived via rules in the KB.\r\nIf it fails to be proven, NIL will be returned.\r\nThe second return value indicates the reason why the query halted.\r\nIf SENTENCE is an implication, or an ist wrapped around an implication,\r\nand the :conditional-sentence property is non-nil, cyc-query will attempt to\r\nprove SENTENCE by reductio ad absurdum.\r\n;;;}}}EDOC\nQuery for bindings for free variables which will satisfy SENTENCE within MT.\n;;;{{{DOC\nProperties: :backchain NIL or an integer or T\n:number    NIL or an integer\n:time      NIL or an integer\n:depth     NIL or an integer\n:conditional-sentence boolean\nIf :backchain is NIL, no backchaining is performed.\nIf :backchain is an integer, then at most that many backchaining steps using rules\nare performed.\nIf :backchain is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf :number is an integer, then at most that number of bindings are returned.\nIf :time is an integer, then at most that many seconds are consumed by the search for\nbindings.\nIf :depth is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a (possibly empty)\nbinding set.  In the case where the SENTENCE has no free variables,\nthe form (NIL), the empty binding set is returned, indicating that the gaf is either\ndirectly asserted in the KB, or that it can be derived via rules in the KB.\nIf it fails to be proven, NIL will be returned.\nThe second return value indicates the reason why the query halted.\nIf SENTENCE is an implication, or an ist wrapped around an implication,\nand the :conditional-sentence property is non-nil, cyc-query will attempt to\nprove SENTENCE by reductio ad absurdum.\n;;;}}}EDOC")
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

    /**
     * Return T iff OBJECT is an object that, if returned as a query result,
     * indicates that bindings (including @xref *CLOSED-QUERY-BINDINGS* for closed queries)
     * were found.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object that, if returned as a query result,\r\nindicates that bindings (including @xref *CLOSED-QUERY-BINDINGS* for closed queries)\r\nwere found.\nReturn T iff OBJECT is an object that, if returned as a query result,\nindicates that bindings (including @xref *CLOSED-QUERY-BINDINGS* for closed queries)\nwere found.")
    public static final SubLObject query_success_result_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cyc_kernel.open_query_success_result_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cyc_kernel.closed_query_success_result_p(v_object)));
    }

    /**
     * Return T iff OBJECT is an object that, if returned as a query result,
     * indicates that bindings (including @xref *CLOSED-QUERY-BINDINGS* for closed queries)
     * were found.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object that, if returned as a query result,\r\nindicates that bindings (including @xref *CLOSED-QUERY-BINDINGS* for closed queries)\r\nwere found.\nReturn T iff OBJECT is an object that, if returned as a query result,\nindicates that bindings (including @xref *CLOSED-QUERY-BINDINGS* for closed queries)\nwere found.")
    public static SubLObject query_success_result_p(final SubLObject v_object) {
        return makeBoolean((NIL != open_query_success_result_p(v_object)) || (NIL != closed_query_success_result_p(v_object)));
    }

    public static final SubLObject open_query_result_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != bindings.binding_lists_p(v_object)) && (NIL == com.cyc.cycjava.cycl.cyc_kernel.closed_query_success_result_p(v_object)));
    }

    public static SubLObject open_query_result_p(final SubLObject v_object) {
        return makeBoolean((NIL != bindings.binding_lists_p(v_object)) && (NIL == closed_query_success_result_p(v_object)));
    }

    static private final SubLList $list_alt3 = list(makeSymbol("NAME"));

    /**
     * Return T iff OBJECT is an object that, if returned as the result of an open query,
     * indicates that bindings were found.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object that, if returned as the result of an open query,\r\nindicates that bindings were found.\nReturn T iff OBJECT is an object that, if returned as the result of an open query,\nindicates that bindings were found.")
    public static final SubLObject open_query_success_result_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != proper_list_p(v_object)) && (NIL != com.cyc.cycjava.cycl.cyc_kernel.open_query_result_p(v_object)));
    }

    /**
     * Return T iff OBJECT is an object that, if returned as the result of an open query,
     * indicates that bindings were found.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object that, if returned as the result of an open query,\r\nindicates that bindings were found.\nReturn T iff OBJECT is an object that, if returned as the result of an open query,\nindicates that bindings were found.")
    public static SubLObject open_query_success_result_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != open_query_result_p(v_object)));
    }

    static private final SubLString $str_alt4$Creates_a_new_constant_with_name_ = makeString("Creates a new constant with name NAME, gives it a\n   permanent unique external ID, and adds the constant\n   creation operation to the transcript queue.");

    /**
     * Return T iff OBJECT is an object indicating the successfully proven bindings for a closed query.
     * Under the current implementation, OBJECT should be equal to NIL.
     * The old implementation, where OBJECT should be equal to ((T . T))
     * is also supported (temporarily).
     */
    @LispMethod(comment = "Return T iff OBJECT is an object indicating the successfully proven bindings for a closed query.\r\nUnder the current implementation, OBJECT should be equal to NIL.\r\nThe old implementation, where OBJECT should be equal to ((T . T))\r\nis also supported (temporarily).\nReturn T iff OBJECT is an object indicating the successfully proven bindings for a closed query.\nUnder the current implementation, OBJECT should be equal to NIL.\nThe old implementation, where OBJECT should be equal to ((T . T))\nis also supported (temporarily).")
    public static final SubLObject closed_query_bindings_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.equal($closed_query_bindings$.getGlobalValue()) || (NIL != bindings.unification_success_token_p(v_object)));
    }

    /**
     * Return T iff OBJECT is an object indicating the successfully proven bindings for a closed query.
     * Under the current implementation, OBJECT should be equal to NIL.
     * The old implementation, where OBJECT should be equal to ((T . T))
     * is also supported (temporarily).
     */
    @LispMethod(comment = "Return T iff OBJECT is an object indicating the successfully proven bindings for a closed query.\r\nUnder the current implementation, OBJECT should be equal to NIL.\r\nThe old implementation, where OBJECT should be equal to ((T . T))\r\nis also supported (temporarily).\nReturn T iff OBJECT is an object indicating the successfully proven bindings for a closed query.\nUnder the current implementation, OBJECT should be equal to NIL.\nThe old implementation, where OBJECT should be equal to ((T . T))\nis also supported (temporarily).")
    public static SubLObject closed_query_bindings_p(final SubLObject v_object) {
        return makeBoolean(v_object.equal($closed_query_bindings$.getGlobalValue()) || (NIL != bindings.unification_success_token_p(v_object)));
    }

    static private final SubLList $list_alt5 = list(list(makeSymbol("NAME"), makeSymbol("NEW-CONSTANT-NAME-SPEC-P")));

    static private final SubLList $list_alt6 = list(makeSymbol("CONSTANT-P"));

    /**
     * Return T iff OBJECT is an object indicating the successfully proven justified bindings for a closed query.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object indicating the successfully proven justified bindings for a closed query.")
    public static final SubLObject closed_query_justified_bindings_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != proper_list_p(v_object)) && (NIL != lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.cyc_kernel.closed_query_bindings_p(v_object.first()))) && (NIL != arguments.supports_p(second(v_object))));
    }

    /**
     * Return T iff OBJECT is an object indicating the successfully proven justified bindings for a closed query.
     */
    @LispMethod(comment = "Return T iff OBJECT is an object indicating the successfully proven justified bindings for a closed query.")
    public static SubLObject closed_query_justified_bindings_p(final SubLObject v_object) {
        return makeBoolean((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != closed_query_bindings_p(v_object.first()))) && (NIL != arguments.supports_p(second(v_object))));
    }

    static private final SubLString $str_alt8$Creates_a_new_constant_with_name_ = makeString("Creates a new constant with name NAME, but makes\n   no effort to synchronize its external ID with\n   other Cyc images.  This is intended for constants\n   that will not be transmitted to other Cyc images.");

    public static final SubLObject closed_query_success_token_alt() {
        return $closed_query_success_token$.getGlobalValue();
    }

    public static SubLObject closed_query_success_token() {
        return $closed_query_success_token$.getGlobalValue();
    }

    static private final SubLList $list_alt10 = list(makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));

    public static final SubLObject closed_query_success_token_p_alt(SubLObject v_object) {
        return equal(v_object, $closed_query_success_token$.getGlobalValue());
    }

    public static SubLObject closed_query_success_token_p(final SubLObject v_object) {
        return equal(v_object, $closed_query_success_token$.getGlobalValue());
    }

    static private final SubLString $str_alt11$Create_a_new_constant_with_id_EXT = makeString("Create a new constant with id EXTERNAL-ID.\n   If NAME is anything other than :unnamed,\n   the new constant will be given the name NAME.");

    /**
     * Return T iff OBJECT is an object indicating the success of a closed query.
     * Under the current implementation, OBJECT should be equal to (NIL).
     * The old implementation, where OBJECT should be equal to (((T . T)))
     * is also supported (temporarily).
     */
    @LispMethod(comment = "Return T iff OBJECT is an object indicating the success of a closed query.\r\nUnder the current implementation, OBJECT should be equal to (NIL).\r\nThe old implementation, where OBJECT should be equal to (((T . T)))\r\nis also supported (temporarily).\nReturn T iff OBJECT is an object indicating the success of a closed query.\nUnder the current implementation, OBJECT should be equal to (NIL).\nThe old implementation, where OBJECT should be equal to (((T . T)))\nis also supported (temporarily).")
    public static final SubLObject closed_query_success_result_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != singletonP(v_object))) && (NIL != com.cyc.cycjava.cycl.cyc_kernel.closed_query_bindings_p(v_object.first())));
    }

    /**
     * Return T iff OBJECT is an object indicating the success of a closed query.
     * Under the current implementation, OBJECT should be equal to (NIL).
     * The old implementation, where OBJECT should be equal to (((T . T)))
     * is also supported (temporarily).
     */
    @LispMethod(comment = "Return T iff OBJECT is an object indicating the success of a closed query.\r\nUnder the current implementation, OBJECT should be equal to (NIL).\r\nThe old implementation, where OBJECT should be equal to (((T . T)))\r\nis also supported (temporarily).\nReturn T iff OBJECT is an object indicating the success of a closed query.\nUnder the current implementation, OBJECT should be equal to (NIL).\nThe old implementation, where OBJECT should be equal to (((T . T)))\nis also supported (temporarily).")
    public static SubLObject closed_query_success_result_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != list_utilities.singletonP(v_object))) && (NIL != closed_query_bindings_p(v_object.first())));
    }

    static private final SubLList $list_alt12 = list(list(makeSymbol("NAME"), makeSymbol("NEW-CONSTANT-NAME-SPEC-P")), list(makeSymbol("EXTERNAL-ID"), list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P"))));

    /**
     * Return T iff OBJECT is an object indicating the success of a closed query.
     * Under the current implementation, OBJECT should be equal to (NIL).
     * The old implementation, where OBJECT should be equal to (((T . T)))
     * is also supported (temporarily).
     */
    @LispMethod(comment = "Return T iff OBJECT is an object indicating the success of a closed query.\r\nUnder the current implementation, OBJECT should be equal to (NIL).\r\nThe old implementation, where OBJECT should be equal to (((T . T)))\r\nis also supported (temporarily).\nReturn T iff OBJECT is an object indicating the success of a closed query.\nUnder the current implementation, OBJECT should be equal to (NIL).\nThe old implementation, where OBJECT should be equal to (((T . T)))\nis also supported (temporarily).")
    public static final SubLObject closed_query_justified_success_result_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != proper_list_p(v_object)) && (NIL != every_in_list(CLOSED_QUERY_JUSTIFIED_BINDINGS_P, v_object, UNPROVIDED)));
    }

    /**
     * Return T iff OBJECT is an object indicating the success of a closed query.
     * Under the current implementation, OBJECT should be equal to (NIL).
     * The old implementation, where OBJECT should be equal to (((T . T)))
     * is also supported (temporarily).
     */
    @LispMethod(comment = "Return T iff OBJECT is an object indicating the success of a closed query.\r\nUnder the current implementation, OBJECT should be equal to (NIL).\r\nThe old implementation, where OBJECT should be equal to (((T . T)))\r\nis also supported (temporarily).\nReturn T iff OBJECT is an object indicating the success of a closed query.\nUnder the current implementation, OBJECT should be equal to (NIL).\nThe old implementation, where OBJECT should be equal to (((T . T)))\nis also supported (temporarily).")
    public static SubLObject closed_query_justified_success_result_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.every_in_list(CLOSED_QUERY_JUSTIFIED_BINDINGS_P, v_object, UNPROVIDED)));
    }

    static private final SubLString $str_alt15$Return_constant_with_NAME_if_it_i = makeString("Return constant with NAME if it is present.  \n   If not present, then create constant with NAME, using EXTERNAL-ID if given.\n   If EXTERNAL-ID is not given, generate a new one for the new constant.");

    public static final SubLObject query_id_p_alt(SubLObject v_object) {
        return eq($LAST, v_object);
    }

    public static SubLObject query_id_p(final SubLObject v_object) {
        return eq($LAST, v_object);
    }

    /**
     * Continues a query started by @xref cyc-query.
     * If QUERY-ID is :last, the most recent query is continued.
     */
    @LispMethod(comment = "Continues a query started by @xref cyc-query.\r\nIf QUERY-ID is :last, the most recent query is continued.\nContinues a query started by @xref cyc-query.\nIf QUERY-ID is :last, the most recent query is continued.")
    public static final SubLObject cyc_continue_query_alt(SubLObject query_id, SubLObject v_properties) {
        if (query_id == UNPROVIDED) {
            query_id = $LAST;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLTrampolineFile.checkType(query_id, QUERY_ID_P);
        SubLTrampolineFile.checkType(v_properties, LEGACY_QUERY_PROPERTIES_P);
        Errors.error($str_alt87$cyc_continue_query_is_deprecated_);
        return NIL;
    }

    /**
     * Continues a query started by @xref cyc-query.
     * If QUERY-ID is :last, the most recent query is continued.
     */
    @LispMethod(comment = "Continues a query started by @xref cyc-query.\r\nIf QUERY-ID is :last, the most recent query is continued.\nContinues a query started by @xref cyc-query.\nIf QUERY-ID is :last, the most recent query is continued.")
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

    static private final SubLList $list_alt16 = list(list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")), list(makeSymbol("EXTERNAL-ID"), list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P"))));

    static private final SubLList $list_alt19 = list(makeSymbol("CONSTANT"), makeSymbol("NAME"));

    static private final SubLString $str_alt20$Change_name_of_CONSTANT_to_NAME__ = makeString("Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.");

    /**
     * Reconsider all arguments for SENTENCE within MT.  Return T if the
     * operation succeeded, NIL if there was an error.
     */
    @LispMethod(comment = "Reconsider all arguments for SENTENCE within MT.  Return T if the\r\noperation succeeded, NIL if there was an error.\nReconsider all arguments for SENTENCE within MT.  Return T if the\noperation succeeded, NIL if there was an error.")
    public static final SubLObject cyc_tms_reconsider_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, POSSIBLY_SENTENCE_P);
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
            }
            {
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt);
                    SubLObject right_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = fi.fi_tms_reconsider_formula_int(right_sentence, right_mt);
                }
                return result;
            }
        }
    }

    /**
     * Reconsider all arguments for SENTENCE within MT.  Return T if the
     * operation succeeded, NIL if there was an error.
     */
    @LispMethod(comment = "Reconsider all arguments for SENTENCE within MT.  Return T if the\r\noperation succeeded, NIL if there was an error.\nReconsider all arguments for SENTENCE within MT.  Return T if the\noperation succeeded, NIL if there was an error.")
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

    static private final SubLList $list_alt21 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")));

    static private final SubLList $list_alt22 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));

    static private final SubLList $list_alt24 = list(makeSymbol("CONSTANT"));

    static private final SubLString $str_alt25$Doesn_t_unassert_the_bookkeeping_ = makeString("Doesn\'t unassert the bookkeeping info,\n   but it might actually move it, or change\n   its format somehow.");

    static private final SubLList $list_alt26 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));

    /**
     * Reconsider all arguments involving TERM.
     * If MT is provided, then only arguments in that microtheory are reconsidered.
     * Return T if the operation succeeded, NIL if there was an error.
     */
    @LispMethod(comment = "Reconsider all arguments involving TERM.\r\nIf MT is provided, then only arguments in that microtheory are reconsidered.\r\nReturn T if the operation succeeded, NIL if there was an error.\nReconsider all arguments involving TERM.\nIf MT is provided, then only arguments in that microtheory are reconsidered.\nReturn T if the operation succeeded, NIL if there was an error.")
    public static final SubLObject cyc_tms_reconsider_term_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fi.fi_tms_reconsider_term_int(v_term, mt);
    }

    /**
     * Reconsider all arguments involving TERM.
     * If MT is provided, then only arguments in that microtheory are reconsidered.
     * Return T if the operation succeeded, NIL if there was an error.
     */
    @LispMethod(comment = "Reconsider all arguments involving TERM.\r\nIf MT is provided, then only arguments in that microtheory are reconsidered.\r\nReturn T if the operation succeeded, NIL if there was an error.\nReconsider all arguments involving TERM.\nIf MT is provided, then only arguments in that microtheory are reconsidered.\nReturn T if the operation succeeded, NIL if there was an error.")
    public static SubLObject cyc_tms_reconsider_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return fi.fi_tms_reconsider_term_int(v_term, mt);
    }

    static private final SubLList $list_alt30 = list(makeSymbol("FORT"));

    public static final SubLObject cyc_tms_reconsider_mt_alt(SubLObject mt) {
        return fi.fi_tms_reconsider_mt_int(mt);
    }

    public static SubLObject cyc_tms_reconsider_mt(final SubLObject mt) {
        return fi.fi_tms_reconsider_mt_int(mt);
    }

    static private final SubLString $str_alt31$Kill_FORT_and_all_its_uses_from_t = makeString("Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\n   in that microtheory are removed.");

    /**
     * Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,
     * if it is provably possible to do so without changing the logical intent of SENTENCE.
     *
     * @see simple-variable-rename-impossible?
     * @return booleanp; T if the operation succeeded, NIL if there was an error.
     */
    @LispMethod(comment = "Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\r\nif it is provably possible to do so without changing the logical intent of SENTENCE.\r\n\r\n@see simple-variable-rename-impossible?\r\n@return booleanp; T if the operation succeeded, NIL if there was an error.\nRename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\nif it is provably possible to do so without changing the logical intent of SENTENCE.")
    public static final SubLObject cyc_rename_variables_alt(SubLObject sentence, SubLObject rename_variable_list, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(sentence, POSSIBLY_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
        }
        SubLTrampolineFile.checkType(rename_variable_list, ALIST_P);
        return fi.fi_rename_variables_int(sentence, mt, rename_variable_list);
    }

    /**
     * Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,
     * if it is provably possible to do so without changing the logical intent of SENTENCE.
     *
     * @see simple-variable-rename-impossible?
     * @return booleanp; T if the operation succeeded, NIL if there was an error.
     */
    @LispMethod(comment = "Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\r\nif it is provably possible to do so without changing the logical intent of SENTENCE.\r\n\r\n@see simple-variable-rename-impossible?\r\n@return booleanp; T if the operation succeeded, NIL if there was an error.\nRename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\nif it is provably possible to do so without changing the logical intent of SENTENCE.")
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

    static private final SubLList $list_alt32 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")));

    static private final SubLList $list_alt33 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str_alt34$cyc_rewrite_is_not_implemented_ye = makeString("cyc-rewrite is not implemented yet");

    static private final SubLList $list_alt36 = list(makeSymbol("SOURCE-FORT"), makeSymbol("TARGET-FORT"));

    public static SubLObject declare_cyc_kernel_file() {
        declareFunction("cyc_create_new_permanent", "CYC-CREATE-NEW-PERMANENT", 1, 0, false);
        declareFunction("cyc_create_new_ephemeral", "CYC-CREATE-NEW-EPHEMERAL", 1, 0, false);
        declareFunction("cyc_create", "CYC-CREATE", 2, 0, false);
        declareFunction("cyc_find_or_create", "CYC-FIND-OR-CREATE", 2, 0, false);
        declareFunction("cyc_find_or_create_new_permanent", "CYC-FIND-OR-CREATE-NEW-PERMANENT", 1, 0, false);
        declareFunction("cyc_rename", "CYC-RENAME", 2, 0, false);
        declareFunction("cyc_recreate", "CYC-RECREATE", 1, 0, false);
        declareFunction("new_constant_name_spec_p", "NEW-CONSTANT-NAME-SPEC-P", 1, 0, false);
        declareFunction("cyc_kill", "CYC-KILL", 1, 0, false);
        declareFunction("cyc_rewrite", "CYC-REWRITE", 2, 0, false);
        declareFunction("cyc_merge", "CYC-MERGE", 2, 0, false);
        declareFunction("assert_property_p", "ASSERT-PROPERTY-P", 1, 0, false);
        declareFunction("assert_properties_p", "ASSERT-PROPERTIES-P", 1, 0, false);
        declareFunction("get_assert_property", "GET-ASSERT-PROPERTY", 2, 1, false);
        declareFunction("cyc_assert", "CYC-ASSERT", 1, 2, false);
        declareFunction("cyc_assert_wff", "CYC-ASSERT-WFF", 1, 2, false);
        declareFunction("cyc_deny", "CYC-DENY", 1, 2, false);
        declareFunction("cyc_unassert", "CYC-UNASSERT", 1, 1, false);
        declareFunction("cyc_edit", "CYC-EDIT", 2, 3, false);
        declareFunction("cyc_add_argument", "CYC-ADD-ARGUMENT", 2, 3, false);
        declareFunction("cyc_remove_argument", "CYC-REMOVE-ARGUMENT", 2, 1, false);
        declareFunction("cyc_remove_all_arguments", "CYC-REMOVE-ALL-ARGUMENTS", 1, 1, false);
        declareFunction("legacy_query_properties_p", "LEGACY-QUERY-PROPERTIES-P", 1, 0, false);
        declareFunction("query_results_p", "QUERY-RESULTS-P", 1, 0, false);
        declareFunction("cyc_query", "CYC-QUERY", 1, 2, false);
        declareFunction("query_success_result_p", "QUERY-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction("open_query_result_p", "OPEN-QUERY-RESULT-P", 1, 0, false);
        declareFunction("open_query_success_result_p", "OPEN-QUERY-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction("closed_query_bindings_p", "CLOSED-QUERY-BINDINGS-P", 1, 0, false);
        declareFunction("closed_query_justified_bindings_p", "CLOSED-QUERY-JUSTIFIED-BINDINGS-P", 1, 0, false);
        declareFunction("closed_query_success_token", "CLOSED-QUERY-SUCCESS-TOKEN", 0, 0, false);
        declareFunction("closed_query_success_token_p", "CLOSED-QUERY-SUCCESS-TOKEN-P", 1, 0, false);
        declareFunction("closed_query_success_result_p", "CLOSED-QUERY-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction("closed_query_justified_success_result_p", "CLOSED-QUERY-JUSTIFIED-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction("query_id_p", "QUERY-ID-P", 1, 0, false);
        declareFunction("cyc_continue_query", "CYC-CONTINUE-QUERY", 0, 2, false);
        declareFunction("cyc_tms_reconsider_sentence", "CYC-TMS-RECONSIDER-SENTENCE", 1, 1, false);
        declareFunction("cyc_tms_reconsider_term", "CYC-TMS-RECONSIDER-TERM", 1, 1, false);
        declareFunction("cyc_tms_reconsider_mt", "CYC-TMS-RECONSIDER-MT", 1, 0, false);
        declareFunction("cyc_rename_variables", "CYC-RENAME-VARIABLES", 2, 1, false);
        return NIL;
    }

    static private final SubLString $str_alt37$_moves__all_asserted_arguments_fr = makeString("\'moves\' all asserted arguments from SOURCE-FORT to TARGET-FORT\n   @return fort-p; TARGET-FORT");

    static private final SubLList $list_alt38 = list(list(makeSymbol("SOURCE-FORT"), makeSymbol("FORT-P")), list(makeSymbol("TARGET-FORT"), makeSymbol("FORT-P")));

    static private final SubLList $list_alt39 = list(makeSymbol("FORT-P"));

    static private final SubLList $list_alt41 = list(makeSymbol("KILL-FORT"), makeSymbol("KEEP-FORT"));

    static private final SubLString $str_alt42$Move_asserted_assertions_on_KILL_ = makeString("Move asserted assertions on KILL-TERM onto KEEP-TERM before killing KILL-TERM.\n   @return fort-p; KEEP-FORT");

    static private final SubLList $list_alt43 = list(list(makeSymbol("KILL-FORT"), makeSymbol("FORT-P")), list(makeSymbol("KEEP-FORT"), makeSymbol("FORT-P")));

    static private final SubLList $list_alt51 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("PROPERTIES"));

    static private final SubLString $str_alt52$Assert_SENTENCE_in_the_specified_ = makeString("Assert SENTENCE in the specified MT.\n   properties; :strength el-strength-p (:default or :monotonic)\n               :direction direction-p  (:forward or :backward)\n   GAF assertion direction defaults to :forward, and rule\n   assertion direction defaults to :backward.\n   @return booleanp; t iff the assert succeeded.  If the assertion\n   already existed, it is considered a success.");

    static private final SubLList $list_alt53 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("PROPERTIES"), makeSymbol("ASSERT-PROPERTIES-P")));

    static private final SubLList $list_alt55 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt56$Remove_the_assertions_canonicaliz = makeString("Remove the assertions canonicalized from FORMULA in the microtheory MT.\n   Return T if the operation succeeded, otherwise return NIL.");

    static private final SubLList $list_alt57 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))));

    static private final SubLList $list_alt59 = list(makeSymbol("OLD-SENTENCE"), makeSymbol("NEW-SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("OLD-MT"), list(makeSymbol("NEW-MT"), makeSymbol("OLD-MT")), makeSymbol("PROPERTIES"));

    static private final SubLString $str_alt60$Unassert_OLD_SENTENCE_in_OLD_MT__ = makeString("Unassert OLD-SENTENCE in OLD-MT, and assert NEW-SENTENCE in the specified NEW-MT.\n   @see cyc-unassert and @xref cyc-assert");

    static private final SubLList $list_alt61 = list(list(makeSymbol("OLD-SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("NEW-SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("OLD-MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("NEW-MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))));

    public static SubLObject init_cyc_kernel_file() {
        deflexical("*ASSERT-PROPERTIES*", $list45);
        deflexical("*CLOSED-QUERY-BINDINGS*", NIL);
        deflexical("*CLOSED-QUERY-SUCCESS-TOKEN*", list($closed_query_bindings$.getGlobalValue()));
        return NIL;
    }

    public static final SubLObject setup_cyc_kernel_file_alt() {
        register_cyc_api_function(CYC_CREATE_NEW_PERMANENT, $list_alt3, $str_alt4$Creates_a_new_constant_with_name_, $list_alt5, $list_alt6);
        register_cyc_api_function(CYC_CREATE_NEW_EPHEMERAL, $list_alt3, $str_alt8$Creates_a_new_constant_with_name_, $list_alt5, $list_alt6);
        register_cyc_api_function(CYC_CREATE, $list_alt10, $str_alt11$Create_a_new_constant_with_id_EXT, $list_alt12, $list_alt6);
        register_cyc_api_function(CYC_FIND_OR_CREATE, $list_alt10, $str_alt15$Return_constant_with_NAME_if_it_i, $list_alt16, $list_alt6);
        register_cyc_api_function(CYC_RENAME, $list_alt19, $str_alt20$Change_name_of_CONSTANT_to_NAME__, $list_alt21, $list_alt22);
        register_cyc_api_function(CYC_RECREATE, $list_alt24, $str_alt25$Doesn_t_unassert_the_bookkeeping_, $list_alt26, $list_alt6);
        register_cyc_api_function(CYC_KILL, $list_alt30, $str_alt31$Kill_FORT_and_all_its_uses_from_t, $list_alt32, $list_alt33);
        register_cyc_api_function(CYC_REWRITE, $list_alt36, $str_alt37$_moves__all_asserted_arguments_fr, $list_alt38, $list_alt39);
        register_cyc_api_function(CYC_MERGE, $list_alt41, $str_alt42$Move_asserted_assertions_on_KILL_, $list_alt43, $list_alt39);
        register_cyc_api_function(CYC_ASSERT, $list_alt51, $str_alt52$Assert_SENTENCE_in_the_specified_, $list_alt53, $list_alt33);
        register_cyc_api_function(CYC_UNASSERT, $list_alt55, $str_alt56$Remove_the_assertions_canonicaliz, $list_alt57, $list_alt33);
        register_cyc_api_function(CYC_EDIT, $list_alt59, $str_alt60$Unassert_OLD_SENTENCE_in_OLD_MT__, $list_alt61, $list_alt33);
        register_cyc_api_function(CYC_ADD_ARGUMENT, $list_alt65, $str_alt66$Tell_Cyc_to_conclude_SENTENCE__op, $list_alt67, $list_alt33);
        register_cyc_api_function(CYC_REMOVE_ARGUMENT, $list_alt69, $str_alt70$Remove_the_argument_for_SENTENCE_, $list_alt71, $list_alt33);
        register_cyc_api_function(CYC_REMOVE_ALL_ARGUMENTS, $list_alt55, $str_alt73$Remove_all_arguments_for_SENTENCE, $list_alt57, $list_alt33);
        register_cyc_api_function(CYC_QUERY, $list_alt51, $str_alt81$Query_for_bindings_for_free_varia, $list_alt82, $list_alt83);
        register_obsolete_cyc_api_function(CYC_CONTINUE_QUERY, $list_alt89, $list_alt90, $str_alt91$Continues_a_query_started_by__xre, $list_alt92, $list_alt83);
        register_cyc_api_function(CYC_TMS_RECONSIDER_SENTENCE, $list_alt55, $str_alt94$Reconsider_all_arguments_for_SENT, $list_alt57, $list_alt33);
        register_cyc_api_function(CYC_RENAME_VARIABLES, $list_alt97, $str_alt98$Rename_the_variables_in_SENTENCE_, $list_alt99, $list_alt33);
        return NIL;
    }

    public static SubLObject setup_cyc_kernel_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(CYC_CREATE, $list_alt10, $str_alt11$Create_a_new_constant_with_id_EXT, $list_alt12, $list_alt6);
            register_cyc_api_function(CYC_FIND_OR_CREATE, $list_alt10, $str_alt15$Return_constant_with_NAME_if_it_i, $list_alt16, $list_alt6);
            register_cyc_api_function(CYC_RENAME, $list_alt19, $str_alt20$Change_name_of_CONSTANT_to_NAME__, $list_alt21, $list_alt22);
            register_cyc_api_function(CYC_RECREATE, $list_alt24, $str_alt25$Doesn_t_unassert_the_bookkeeping_, $list_alt26, $list_alt6);
            register_cyc_api_function(CYC_KILL, $list_alt30, $str_alt31$Kill_FORT_and_all_its_uses_from_t, $list_alt32, $list_alt33);
            register_cyc_api_function(CYC_REWRITE, $list_alt36, $str_alt37$_moves__all_asserted_arguments_fr, $list_alt38, $list_alt39);
            register_cyc_api_function(CYC_MERGE, $list_alt41, $str_alt42$Move_asserted_assertions_on_KILL_, $list_alt43, $list_alt39);
            register_cyc_api_function(CYC_ASSERT, $list_alt51, $str_alt52$Assert_SENTENCE_in_the_specified_, $list_alt53, $list_alt33);
            register_cyc_api_function(CYC_UNASSERT, $list_alt55, $str_alt56$Remove_the_assertions_canonicaliz, $list_alt57, $list_alt33);
            register_cyc_api_function(CYC_EDIT, $list_alt59, $str_alt60$Unassert_OLD_SENTENCE_in_OLD_MT__, $list_alt61, $list_alt33);
            register_cyc_api_function(CYC_ADD_ARGUMENT, $list_alt65, $str_alt66$Tell_Cyc_to_conclude_SENTENCE__op, $list_alt67, $list_alt33);
            register_cyc_api_function(CYC_REMOVE_ARGUMENT, $list_alt69, $str_alt70$Remove_the_argument_for_SENTENCE_, $list_alt71, $list_alt33);
            register_cyc_api_function(CYC_REMOVE_ALL_ARGUMENTS, $list_alt55, $str_alt73$Remove_all_arguments_for_SENTENCE, $list_alt57, $list_alt33);
            register_cyc_api_function(CYC_QUERY, $list_alt51, $str_alt81$Query_for_bindings_for_free_varia, $list_alt82, $list_alt83);
            register_obsolete_cyc_api_function(CYC_CONTINUE_QUERY, $list_alt89, $list_alt90, $str_alt91$Continues_a_query_started_by__xre, $list_alt92, $list_alt83);
            register_cyc_api_function(CYC_TMS_RECONSIDER_SENTENCE, $list_alt55, $str_alt94$Reconsider_all_arguments_for_SENT, $list_alt57, $list_alt33);
            register_cyc_api_function(CYC_RENAME_VARIABLES, $list_alt97, $str_alt98$Rename_the_variables_in_SENTENCE_, $list_alt99, $list_alt33);
        }
        return NIL;
    }

    public static SubLObject setup_cyc_kernel_file_Previous() {
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

    static private final SubLList $list_alt65 = list(makeSymbol("SENTENCE"), makeSymbol("CYCL-SUPPORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("PROPERTIES"), makeSymbol("VERIFY-SUPPORTS"));

    static private final SubLString $str_alt66$Tell_Cyc_to_conclude_SENTENCE__op = makeString("Tell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or \n   otherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports \n   before making the assertion.\n   Properties: :direction :forward or :backward");

    static private final SubLList $list_alt67 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("CYCL-SUPPORTS"), makeSymbol("LIST-OF-CYCL-SUPPORT-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("PROPERTIES"), makeSymbol("ASSERT-PROPERTIES-P")), list(makeSymbol("VERIFY-SUPPORTS"), makeSymbol("BOOLEANP")));

    static private final SubLList $list_alt69 = list(makeSymbol("SENTENCE"), makeSymbol("CYCL-SUPPORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt70$Remove_the_argument_for_SENTENCE_ = makeString("Remove the argument for SENTENCE specified by CYCL-SUPPORTS.");

    static private final SubLList $list_alt71 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("CYCL-SUPPORTS"), makeSymbol("LIST-OF-CYCL-SUPPORT-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))));

    static private final SubLString $str_alt73$Remove_all_arguments_for_SENTENCE = makeString("Remove all arguments for SENTENCE within MT, including both those \n   arguments resulting the direct assertion of SENTENCE, and \n   those arguments supporting SENTENCE which were derived through inference.\n   Return T if successful, otherwise return NIL.");

    static private final SubLString $str_alt81$Query_for_bindings_for_free_varia = makeString("Query for bindings for free variables which will satisfy SENTENCE within MT.\n;;;{{{DOC\n   Properties: :backchain NIL or an integer or T\n               :number    NIL or an integer\n               :time      NIL or an integer\n               :depth     NIL or an integer\n               :conditional-sentence boolean\n   If :backchain is NIL, no backchaining is performed.\n   If :backchain is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If :backchain is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If :number is an integer, then at most that number of bindings are returned.\n   If :time is an integer, then at most that many seconds are consumed by the search for\n   bindings.\n   If :depth is an integer, then the inference paths are limited to that number of\n   total steps.\n   Returns NIL if the operation had an error.  Otherwise returns a (possibly empty)\n   binding set.  In the case where the SENTENCE has no free variables,\n   the form (NIL), the empty binding set is returned, indicating that the gaf is either\n   directly asserted in the KB, or that it can be derived via rules in the KB.\n   If it fails to be proven, NIL will be returned.\n   The second return value indicates the reason why the query halted.\n   If SENTENCE is an implication, or an ist wrapped around an implication,\n   and the :conditional-sentence property is non-nil, cyc-query will attempt to\n   prove SENTENCE by reductio ad absurdum.\n;;;}}}EDOC");

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

    static {
    }

    static private final SubLList $list_alt82 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("PROPERTIES"), makeSymbol("LEGACY-QUERY-PROPERTIES-P")));

    static private final SubLList $list_alt83 = list(makeSymbol("QUERY-RESULTS-P"));

    static private final SubLString $str_alt87$cyc_continue_query_is_deprecated_ = makeString("cyc-continue-query is deprecated; use CONTINUE-INFERENCE instead.");

    static private final SubLList $list_alt89 = list(makeSymbol("CONTINUE-INFERENCE"));

    static private final SubLList $list_alt90 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("QUERY-ID"), $LAST), makeSymbol("PROPERTIES"));

    static private final SubLString $str_alt91$Continues_a_query_started_by__xre = makeString("Continues a query started by @xref cyc-query.\n   If QUERY-ID is :last, the most recent query is continued.");

    static private final SubLList $list_alt92 = list(list(makeSymbol("QUERY-ID"), makeSymbol("QUERY-ID-P")), list(makeSymbol("PROPERTIES"), makeSymbol("LEGACY-QUERY-PROPERTIES-P")));

    static private final SubLString $str_alt94$Reconsider_all_arguments_for_SENT = makeString("Reconsider all arguments for SENTENCE within MT.  Return T if the\n   operation succeeded, NIL if there was an error.");

    static private final SubLList $list_alt97 = list(makeSymbol("SENTENCE"), makeSymbol("RENAME-VARIABLE-LIST"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt98$Rename_the_variables_in_SENTENCE_ = makeString("Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\n   if it is provably possible to do so without changing the logical intent of SENTENCE.\n   @see simple-variable-rename-impossible?\n   @return booleanp; T if the operation succeeded, NIL if there was an error.");

    static private final SubLList $list_alt99 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("RENAME-VARIABLE-LIST"), makeSymbol("ALIST-P")));
}

/**
 * Total time: 236 ms
 */
