package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_sme_lexification_wizard extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_sme_lexification_wizard";
    public static final String myFingerPrint = "bf95b234d7cad9d446cddc8f3411a52c7c70ffc32cebf4ada40b7aa0acc49549";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 1170L)
    public static SubLSymbol $simulated_blackboardP$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 1432L)
    private static SubLSymbol $blackboard_input_file$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 1554L)
    private static SubLSymbol $blackboard_output_file$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 1679L)
    private static SubLSymbol $blackboard_log_file$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 1801L)
    private static SubLSymbol $blackboard_input_delim$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 1993L)
    private static SubLSymbol $blackboard_output_delim$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2186L)
    private static SubLSymbol $blackboard_delay$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2291L)
    private static SubLSymbol $blackboard_timeout$;
    private static final SubLString $str0$_tmp_blackboard_input_text;
    private static final SubLString $str1$_tmp_blackboard_output_text;
    private static final SubLString $str2$_tmp_blackboard_log_text;
    private static final SubLString $str3$_________________________________;
    private static final SubLString $str4$_________________________________;
    private static final SubLInteger $int5$600;
    private static final SubLSymbol $sym6$RKF_BB_PROXY;
    private static final SubLSymbol $sym7$INTERFACE_PROXY;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$RESPONSES;
    private static final SubLSymbol $sym10$PENDING_ACTIONS;
    private static final SubLSymbol $sym11$OBJECT;
    private static final SubLSymbol $sym12$INSTANCE_COUNT;
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_INSTANCE;
    private static final SubLSymbol $sym17$RKF_UIA_PROXY;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$INTERACTION;
    private static final SubLSymbol $sym20$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_CLASS;
    private static final SubLSymbol $sym21$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_INSTANCE;
    private static final SubLSymbol $sym22$RKF_BB_QUESTION_ANSWERING_AGENT;
    private static final SubLSymbol $sym23$QUESTION_ANSWERING_AGENT;
    private static final SubLSymbol $sym24$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_CLASS;
    private static final SubLSymbol $sym25$ID;
    private static final SubLSymbol $sym26$TITLE;
    private static final SubLSymbol $sym27$QUESTION;
    private static final SubLSymbol $sym28$TIP;
    private static final SubLSymbol $sym29$QUESTION_TYPE;
    private static final SubLSymbol $sym30$ERROR_MESSAGE;
    private static final SubLSymbol $sym31$CHOICES;
    private static final SubLSymbol $sym32$DESCRIPTIONS;
    private static final SubLSymbol $sym33$VALUES;
    private static final SubLSymbol $sym34$DEFAULT;
    private static final SubLSymbol $sym35$ANSWER;
    private static final SubLSymbol $sym36$FIELD_WIDTH;
    private static final SubLSymbol $sym37$FIELD_LABELS;
    private static final SubLSymbol $sym38$PROXY;
    private static final SubLSymbol $sym39$CALLBACK_FUNCTION;
    private static final SubLSymbol $sym40$CLIENT_DATA;
    private static final SubLSymbol $sym41$USER_DATA;
    private static final SubLSymbol $sym42$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_INSTA;
    private static final SubLSymbol $sym43$SIM_BB_QUESTION_ANSWERING_AGENT;
    private static final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_CLASS;
    private static final SubLSymbol $sym45$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_INSTA;
    private static final SubLSymbol $sym46$RKF_BB_SME_LEXIFICATION_WIZARD;
    private static final SubLSymbol $sym47$SME_LEXIFICATION_WIZARD;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_CLASS;
    private static final SubLSymbol $sym50$STATE;
    private static final SubLSymbol $sym51$NEXT_STATES;
    private static final SubLSymbol $sym52$LEXWIZ_PARAMETERS;
    private static final SubLSymbol $sym53$CURRENT_INTERACTION;
    private static final SubLSymbol $sym54$NEW_CURRENT_INTERACTION;
    private static final SubLSymbol $sym55$QUESTION_ANSWERING_AGENT_CLASS;
    private static final SubLSymbol $sym56$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_INSTAN;
    private static final SubLSymbol $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_CLASS;
    private static final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_INSTA;
    private static final SubLSymbol $sym61$DISPLAY_QUESTION;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLSymbol $kw64$SHOW_TEXT;
    private static final SubLString $str65$Error___a;
    private static final SubLString $str66$Tip___a;
    private static final SubLSymbol $kw67$BOOLEAN;
    private static final SubLSymbol $kw68$CHOOSE_ONE;
    private static final SubLSymbol $kw69$ANSWER;
    private static final SubLSymbol $sym70$QUOTE;
    private static final SubLSymbol $kw71$ENUMERATED;
    private static final SubLSymbol $kw72$MULTIPLE_SELECTION;
    private static final SubLSymbol $kw73$CHOOSE_MUTIPLE;
    private static final SubLSymbol $kw74$FREE_FORM;
    private static final SubLList $list75;
    private static final SubLSymbol $kw76$MULTIPLE_FREE_FORM;
    private static final SubLString $str77$Adding_new_actions_____S__;
    private static final SubLSymbol $sym78$ADD_ACTIONS;
    private static final SubLSymbol $sym79$RKF_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD;
    private static final SubLSymbol $sym80$GET_RESPONSE;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$GET_NEXT_RESPONSE;
    private static final SubLString $str83$Warning__;
    private static final SubLString $str84$Unexpected_response_from_blackboa;
    private static final SubLSymbol $sym85$NOTIFY_CLIENT;
    private static final SubLSymbol $kw86$INPUT_READY;
    private static final SubLSymbol $sym87$RKF_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD;
    private static final SubLString $str91$;
    private static final SubLString $str92$Error_;
    private static final SubLString $str93$Answer___a__s___;
    private static final SubLString $str94$Answer___a____a___;
    private static final SubLString $str95$Answer___a____a__including_ranges;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLString $str99$Tip_;
    private static final SubLSymbol $kw100$OUTPUT_DONE;
    private static final SubLSymbol $sym101$SIM_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$SIM_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD;
    private static final SubLSymbol $sym104$INITIALIZE;
    private static final SubLList $list105;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD;
    private static final SubLSymbol $sym108$RKF_BB_PROXY_INITIALIZE_METHOD;
    private static final SubLSymbol $sym109$GET_PENDING_ACTIONS;
    private static final SubLList $list110;
    private static final SubLSymbol $sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD;
    private static final SubLSymbol $sym112$RKF_BB_PROXY_GET_PENDING_ACTIONS_METHOD;
    private static final SubLList $list113;
    private static final SubLList $list114;
    private static final SubLSymbol $sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD;
    private static final SubLSymbol $sym116$RKF_BB_PROXY_ADD_ACTIONS_METHOD;
    private static final SubLSymbol $sym117$CLEAR_ACTIONS;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD;
    private static final SubLSymbol $sym120$RKF_BB_PROXY_CLEAR_ACTIONS_METHOD;
    private static final SubLSymbol $sym121$ADD_USER_RESPONSE;
    private static final SubLList $list122;
    private static final SubLList $list123;
    private static final SubLSymbol $sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD;
    private static final SubLSymbol $sym125$RKF_BB_PROXY_ADD_USER_RESPONSE_METHOD;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$RKF_BB_PROXY_GET_NEXT_RESPONSE_METHOD;
    private static final SubLSymbol $sym128$CLEAR_RESPONSES;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD;
    private static final SubLSymbol $sym131$RKF_BB_PROXY_CLEAR_RESPONSES_METHOD;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD;
    private static final SubLSymbol $sym134$RKF_UIA_PROXY_INITIALIZE_METHOD;
    private static final SubLSymbol $sym135$CREATE_CONSTANT;
    private static final SubLList $list136;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD;
    private static final SubLSymbol $sym139$RKF_UIA_PROXY_CREATE_CONSTANT_METHOD;
    private static final SubLSymbol $sym140$DESCRIBE_TERM;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLSymbol $sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD;
    private static final SubLSymbol $sym144$RKF_UIA_PROXY_DESCRIBE_TERM_METHOD;
    private static final SubLSymbol $sym145$RESOLVE_TERM;
    private static final SubLList $list146;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD;
    private static final SubLSymbol $sym149$RKF_UIA_PROXY_RESOLVE_TERM_METHOD;
    private static final SubLSymbol $sym150$MUMBLE;
    private static final SubLList $list151;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD;
    private static final SubLSymbol $sym154$RKF_UIA_PROXY_MUMBLE_METHOD;
    private static final SubLSymbol $sym155$FORGE_AHEAD_;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD;
    private static final SubLSymbol $sym158$RKF_UIA_PROXY_FORGE_AHEAD__METHOD;
    private static final SubLSymbol $sym159$END_SESSION;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$RKF_UIA_PROXY_END_SESSION_METHOD;
    private static final SubLSymbol $sym162$GET_INTERACTION;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD;
    private static final SubLSymbol $sym165$RKF_UIA_PROXY_GET_INTERACTION_METHOD;
    private static final SubLSymbol $sym166$SET_INTERACTION;
    private static final SubLList $list167;
    private static final SubLList $list168;
    private static final SubLSymbol $sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD;
    private static final SubLSymbol $sym170$RKF_UIA_PROXY_SET_INTERACTION_METHOD;
    private static final SubLSymbol $sym171$END_INTERACTION;
    private static final SubLList $list172;
    private static final SubLSymbol $sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD;
    private static final SubLSymbol $sym174$RKF_UIA_PROXY_END_INTERACTION_METHOD;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLSymbol $sym177$NEW;
    private static final SubLSymbol $sym178$RKF_BB_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD;
    private static final SubLList $list179;
    private static final SubLSymbol $sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD;
    private static final SubLSymbol $sym181$RKF_BB_SME_LEXIFICATION_WIZARD_GET_PENDING_ACTIONS_METHOD;
    private static final SubLSymbol $sym182$CLEAR_PENDING_ACTIONS;
    private static final SubLList $list183;
    private static final SubLSymbol $sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD;
    private static final SubLSymbol $sym185$RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_PENDING_ACTIONS_METHOD;
    private static final SubLSymbol $sym186$SET_USER_RESPONSE;
    private static final SubLList $list187;
    private static final SubLList $list188;
    private static final SubLString $str189$Issuing_shameless_hack_updating_c;
    private static final SubLSymbol $sym190$PROCESS_STATUS_UPDATE;
    private static final SubLSymbol $sym191$RKF_BB_SME_LEXIFICATION_WIZARD_SET_USER_RESPONSE_METHOD;
    private static final SubLSymbol $sym192$CLEAR_USER_RESPONSES;
    private static final SubLList $list193;
    private static final SubLSymbol $sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD;
    private static final SubLSymbol $sym195$RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_USER_RESPONSES_METHOD;
    private static final SubLList $list196;
    private static final SubLSymbol $sym197$UIA_HTML_QUESTION_ANSWERING_AGENT;
    private static final SubLSymbol $sym198$RKF_UIA_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD;
    private static final SubLList $list199;
    private static final SubLList $list200;
    private static final SubLSymbol $sym201$OUTER_CATCH_FOR_RKF_UIA_SME_LEXIFICATION_WIZARD_METHOD;
    private static final SubLSymbol $sym202$RKF_UIA_SME_LEXIFICATION_WIZARD_SET_INTERACTION_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
    public static SubLObject get_rkf_bb_proxy_responses(final SubLObject rkf_bb_proxy) {
        return classes.subloop_get_access_protected_instance_slot(rkf_bb_proxy, (SubLObject)rkf_sme_lexification_wizard.TWO_INTEGER, (SubLObject)rkf_sme_lexification_wizard.$sym9$RESPONSES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
    public static SubLObject set_rkf_bb_proxy_responses(final SubLObject rkf_bb_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rkf_bb_proxy, value, (SubLObject)rkf_sme_lexification_wizard.TWO_INTEGER, (SubLObject)rkf_sme_lexification_wizard.$sym9$RESPONSES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
    public static SubLObject get_rkf_bb_proxy_pending_actions(final SubLObject rkf_bb_proxy) {
        return classes.subloop_get_access_protected_instance_slot(rkf_bb_proxy, (SubLObject)rkf_sme_lexification_wizard.ONE_INTEGER, (SubLObject)rkf_sme_lexification_wizard.$sym10$PENDING_ACTIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
    public static SubLObject set_rkf_bb_proxy_pending_actions(final SubLObject rkf_bb_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rkf_bb_proxy, value, (SubLObject)rkf_sme_lexification_wizard.ONE_INTEGER, (SubLObject)rkf_sme_lexification_wizard.$sym10$PENDING_ACTIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
    public static SubLObject subloop_reserved_initialize_rkf_bb_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym12$INSTANCE_COUNT, (SubLObject)rkf_sme_lexification_wizard.ZERO_INTEGER);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
    public static SubLObject subloop_reserved_initialize_rkf_bb_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym14$ISOLATED_P, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym15$INSTANCE_NUMBER, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym10$PENDING_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym9$RESPONSES, (SubLObject)rkf_sme_lexification_wizard.NIL);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
    public static SubLObject rkf_bb_proxy_p(final SubLObject rkf_bb_proxy) {
        return classes.subloop_instanceof_class(rkf_bb_proxy, (SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3560L)
    public static SubLObject get_rkf_uia_proxy_interaction(final SubLObject rkf_uia_proxy) {
        return classes.subloop_get_access_protected_instance_slot(rkf_uia_proxy, (SubLObject)rkf_sme_lexification_wizard.ONE_INTEGER, (SubLObject)rkf_sme_lexification_wizard.$sym19$INTERACTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3560L)
    public static SubLObject set_rkf_uia_proxy_interaction(final SubLObject rkf_uia_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rkf_uia_proxy, value, (SubLObject)rkf_sme_lexification_wizard.ONE_INTEGER, (SubLObject)rkf_sme_lexification_wizard.$sym19$INTERACTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3560L)
    public static SubLObject subloop_reserved_initialize_rkf_uia_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym12$INSTANCE_COUNT, (SubLObject)rkf_sme_lexification_wizard.ZERO_INTEGER);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3560L)
    public static SubLObject subloop_reserved_initialize_rkf_uia_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym14$ISOLATED_P, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym15$INSTANCE_NUMBER, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym19$INTERACTION, (SubLObject)rkf_sme_lexification_wizard.NIL);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3560L)
    public static SubLObject rkf_uia_proxy_p(final SubLObject rkf_uia_proxy) {
        return classes.subloop_instanceof_class(rkf_uia_proxy, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3956L)
    public static SubLObject subloop_reserved_initialize_rkf_bb_question_answering_agent_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym12$INSTANCE_COUNT, (SubLObject)rkf_sme_lexification_wizard.ZERO_INTEGER);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3956L)
    public static SubLObject subloop_reserved_initialize_rkf_bb_question_answering_agent_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym14$ISOLATED_P, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym15$INSTANCE_NUMBER, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym25$ID, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym26$TITLE, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym27$QUESTION, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym28$TIP, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym29$QUESTION_TYPE, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym30$ERROR_MESSAGE, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym31$CHOICES, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym32$DESCRIPTIONS, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym33$VALUES, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym34$DEFAULT, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym35$ANSWER, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym36$FIELD_WIDTH, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym37$FIELD_LABELS, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym38$PROXY, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym39$CALLBACK_FUNCTION, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym40$CLIENT_DATA, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym41$USER_DATA, (SubLObject)rkf_sme_lexification_wizard.NIL);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3956L)
    public static SubLObject rkf_bb_question_answering_agent_p(final SubLObject rkf_bb_question_answering_agent) {
        return classes.subloop_instanceof_class(rkf_bb_question_answering_agent, (SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4133L)
    public static SubLObject subloop_reserved_initialize_sim_bb_question_answering_agent_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym12$INSTANCE_COUNT, (SubLObject)rkf_sme_lexification_wizard.ZERO_INTEGER);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4133L)
    public static SubLObject subloop_reserved_initialize_sim_bb_question_answering_agent_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym14$ISOLATED_P, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym15$INSTANCE_NUMBER, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym25$ID, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym26$TITLE, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym27$QUESTION, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym28$TIP, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym29$QUESTION_TYPE, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym30$ERROR_MESSAGE, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym31$CHOICES, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym32$DESCRIPTIONS, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym33$VALUES, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym34$DEFAULT, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym35$ANSWER, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym36$FIELD_WIDTH, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym37$FIELD_LABELS, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym38$PROXY, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym39$CALLBACK_FUNCTION, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym40$CLIENT_DATA, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym41$USER_DATA, (SubLObject)rkf_sme_lexification_wizard.NIL);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4133L)
    public static SubLObject sim_bb_question_answering_agent_p(final SubLObject sim_bb_question_answering_agent) {
        return classes.subloop_instanceof_class(sim_bb_question_answering_agent, (SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4313L)
    public static SubLObject subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym12$INSTANCE_COUNT, (SubLObject)rkf_sme_lexification_wizard.ZERO_INTEGER);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4313L)
    public static SubLObject subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym14$ISOLATED_P, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym15$INSTANCE_NUMBER, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym50$STATE, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym51$NEXT_STATES, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym52$LEXWIZ_PARAMETERS, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym53$CURRENT_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym54$NEW_CURRENT_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym38$PROXY, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym55$QUESTION_ANSWERING_AGENT_CLASS, (SubLObject)rkf_sme_lexification_wizard.NIL);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4313L)
    public static SubLObject rkf_bb_sme_lexification_wizard_p(final SubLObject rkf_bb_sme_lexification_wizard) {
        return classes.subloop_instanceof_class(rkf_bb_sme_lexification_wizard, (SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4733L)
    public static SubLObject subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym12$INSTANCE_COUNT, (SubLObject)rkf_sme_lexification_wizard.ZERO_INTEGER);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4733L)
    public static SubLObject subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym14$ISOLATED_P, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym11$OBJECT, (SubLObject)rkf_sme_lexification_wizard.$sym15$INSTANCE_NUMBER, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym50$STATE, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym51$NEXT_STATES, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym52$LEXWIZ_PARAMETERS, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym53$CURRENT_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym54$NEW_CURRENT_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym38$PROXY, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym55$QUESTION_ANSWERING_AGENT_CLASS, (SubLObject)rkf_sme_lexification_wizard.NIL);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4733L)
    public static SubLObject rkf_uia_sme_lexification_wizard_p(final SubLObject rkf_uia_sme_lexification_wizard) {
        return classes.subloop_instanceof_class(rkf_uia_sme_lexification_wizard, (SubLObject)rkf_sme_lexification_wizard.$sym57$RKF_UIA_SME_LEXIFICATION_WIZARD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4987L)
    public static SubLObject rkf_bb_question_answering_agent_display_question_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proxy = sme_lexification_wizard.get_question_answering_agent_proxy(self);
        final SubLObject field_labels = sme_lexification_wizard.get_question_answering_agent_field_labels(self);
        final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices(self);
        final SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message(self);
        final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type(self);
        final SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip(self);
        final SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question(self);
        final SubLObject title = sme_lexification_wizard.get_question_answering_agent_title(self);
        SubLObject new_actions = (SubLObject)rkf_sme_lexification_wizard.NIL;
        new_actions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.$kw64$SHOW_TEXT, title), new_actions);
        if (rkf_sme_lexification_wizard.NIL != error_message) {
            new_actions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.$kw64$SHOW_TEXT, PrintLow.format((SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$str65$Error___a, error_message)), new_actions);
        }
        new_actions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.$kw64$SHOW_TEXT, v_question), new_actions);
        if (rkf_sme_lexification_wizard.NIL != tip && rkf_sme_lexification_wizard.NIL != cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.getDynamicValue(thread)) {
            new_actions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.$kw64$SHOW_TEXT, PrintLow.format((SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$str66$Tip___a, tip)), new_actions);
        }
        final SubLObject pcase_var = question_type;
        if (pcase_var.eql((SubLObject)rkf_sme_lexification_wizard.$kw67$BOOLEAN)) {
            final SubLObject negative = sme_lexification_wizard.question_answering_agent_negative_choice_method(self);
            final SubLObject positive = sme_lexification_wizard.question_answering_agent_positive_choice_method(self);
            new_actions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.$kw68$CHOOSE_ONE, (SubLObject)rkf_sme_lexification_wizard.$kw69$ANSWER, (SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.$sym70$QUOTE, (SubLObject)ConsesLow.list(negative, positive))), new_actions);
        }
        else if (pcase_var.eql((SubLObject)rkf_sme_lexification_wizard.$kw71$ENUMERATED)) {
            new_actions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.$kw68$CHOOSE_ONE, (SubLObject)rkf_sme_lexification_wizard.$kw69$ANSWER, choices), new_actions);
        }
        else if (pcase_var.eql((SubLObject)rkf_sme_lexification_wizard.$kw72$MULTIPLE_SELECTION)) {
            new_actions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.$kw73$CHOOSE_MUTIPLE, (SubLObject)rkf_sme_lexification_wizard.$kw69$ANSWER, choices), new_actions);
        }
        else if (pcase_var.eql((SubLObject)rkf_sme_lexification_wizard.$kw74$FREE_FORM)) {
            new_actions = (SubLObject)ConsesLow.cons((SubLObject)rkf_sme_lexification_wizard.$list75, new_actions);
        }
        else if (pcase_var.eql((SubLObject)rkf_sme_lexification_wizard.$kw76$MULTIPLE_FREE_FORM)) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Sequences.length(field_labels), i = (SubLObject)rkf_sme_lexification_wizard.NIL, i = (SubLObject)rkf_sme_lexification_wizard.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)rkf_sme_lexification_wizard.ONE_INTEGER)) {
                new_actions = (SubLObject)ConsesLow.cons((SubLObject)rkf_sme_lexification_wizard.$list75, new_actions);
            }
        }
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)rkf_sme_lexification_wizard.$str77$Adding_new_actions_____S__, Sequences.reverse(new_actions));
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        methods.funcall_instance_method_with_1_args(proxy, (SubLObject)rkf_sme_lexification_wizard.$sym78$ADD_ACTIONS, Sequences.reverse(new_actions));
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 7101L)
    public static SubLObject rkf_bb_question_answering_agent_get_response_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proxy = sme_lexification_wizard.get_question_answering_agent_proxy(self);
        SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer(self);
        final SubLObject response = methods.funcall_instance_method_with_0_args(proxy, (SubLObject)rkf_sme_lexification_wizard.$sym82$GET_NEXT_RESPONSE);
        if (response.first() != rkf_sme_lexification_wizard.$kw69$ANSWER) {
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)rkf_sme_lexification_wizard.$str83$Warning__, (SubLObject)rkf_sme_lexification_wizard.$str84$Unexpected_response_from_blackboa), response);
                streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            return (SubLObject)rkf_sme_lexification_wizard.NIL;
        }
        v_answer = conses_high.second(response);
        sme_lexification_wizard.set_question_answering_agent_answer(self, v_answer);
        methods.funcall_instance_method_with_1_args(self, (SubLObject)rkf_sme_lexification_wizard.$sym85$NOTIFY_CLIENT, (SubLObject)rkf_sme_lexification_wizard.$kw86$INPUT_READY);
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 7671L)
    public static SubLObject sim_bb_question_answering_agent_display_question_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sim_bb_question_answering_agent_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices(self);
        final SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message(self);
        final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type(self);
        final SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip(self);
        final SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question(self);
        final SubLObject title = sme_lexification_wizard.get_question_answering_agent_title(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                final SubLObject text_lines = (SubLObject)ConsesLow.list(title, (SubLObject)rkf_sme_lexification_wizard.$str91$);
                if (rkf_sme_lexification_wizard.NIL != error_message) {
                    ConsesLow.nconc(text_lines, (SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.$str92$Error_, error_message, (SubLObject)rkf_sme_lexification_wizard.$str91$));
                }
                ConsesLow.nconc(text_lines, (SubLObject)ConsesLow.list(v_question, (SubLObject)rkf_sme_lexification_wizard.$str91$));
                final SubLObject pcase_var = question_type;
                if (pcase_var.eql((SubLObject)rkf_sme_lexification_wizard.$kw67$BOOLEAN)) {
                    ConsesLow.nconc(text_lines, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$str93$Answer___a__s___, sme_lexification_wizard.question_answering_agent_positive_choice_method(self), sme_lexification_wizard.question_answering_agent_negative_choice_method(self))));
                }
                else if (pcase_var.eql((SubLObject)rkf_sme_lexification_wizard.$kw71$ENUMERATED)) {
                    ConsesLow.nconc(text_lines, conses_high.copy_list(choices));
                    ConsesLow.nconc(text_lines, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$str94$Answer___a____a___, (SubLObject)rkf_sme_lexification_wizard.ONE_INTEGER, Sequences.length(choices))));
                }
                else if (pcase_var.eql((SubLObject)rkf_sme_lexification_wizard.$kw72$MULTIPLE_SELECTION)) {
                    ConsesLow.nconc(text_lines, conses_high.copy_list(choices));
                    ConsesLow.nconc(text_lines, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$str95$Answer___a____a__including_ranges, (SubLObject)rkf_sme_lexification_wizard.ONE_INTEGER, Sequences.length(choices))));
                }
                else if (pcase_var.eql((SubLObject)rkf_sme_lexification_wizard.$kw74$FREE_FORM)) {
                    ConsesLow.nconc(text_lines, conses_high.copy_list((SubLObject)rkf_sme_lexification_wizard.$list96));
                }
                else if (pcase_var.eql((SubLObject)rkf_sme_lexification_wizard.$kw76$MULTIPLE_FREE_FORM)) {
                    ConsesLow.nconc(text_lines, conses_high.copy_list((SubLObject)rkf_sme_lexification_wizard.$list97));
                }
                ConsesLow.nconc(text_lines, conses_high.copy_list((SubLObject)rkf_sme_lexification_wizard.$list98));
                if (rkf_sme_lexification_wizard.NIL != tip && rkf_sme_lexification_wizard.NIL != cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.getDynamicValue(thread)) {
                    ConsesLow.nconc(text_lines, (SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.$str99$Tip_, (SubLObject)rkf_sme_lexification_wizard.$str91$, tip, (SubLObject)rkf_sme_lexification_wizard.$str91$));
                }
                file_utilities.write_text_file(rkf_sme_lexification_wizard.$blackboard_output_file$.getGlobalValue(), text_lines);
                file_utilities.append_text_file(rkf_sme_lexification_wizard.$blackboard_log_file$.getGlobalValue(), text_lines);
                file_utilities.append_text_file(rkf_sme_lexification_wizard.$blackboard_log_file$.getGlobalValue(), (SubLObject)ConsesLow.list(rkf_sme_lexification_wizard.$blackboard_input_delim$.getGlobalValue()));
                methods.funcall_instance_method_with_1_args(self, (SubLObject)rkf_sme_lexification_wizard.$sym85$NOTIFY_CLIENT, (SubLObject)rkf_sme_lexification_wizard.$kw100$OUTPUT_DONE);
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD, (SubLObject)rkf_sme_lexification_wizard.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sme_lexification_wizard.set_question_answering_agent_choices(self, choices);
                    sme_lexification_wizard.set_question_answering_agent_error_message(self, error_message);
                    sme_lexification_wizard.set_question_answering_agent_question_type(self, question_type);
                    sme_lexification_wizard.set_question_answering_agent_tip(self, tip);
                    sme_lexification_wizard.set_question_answering_agent_question(self, v_question);
                    sme_lexification_wizard.set_question_answering_agent_title(self, title);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sim_bb_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sim_bb_question_answering_agent_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 9483L)
    public static SubLObject sim_bb_question_answering_agent_get_response_method(final SubLObject self) {
        SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer(self);
        for (SubLObject timeout = rkf_sme_lexification_wizard.$blackboard_timeout$.getGlobalValue(), delay = rkf_sme_lexification_wizard.$blackboard_delay$.getGlobalValue(); rkf_sme_lexification_wizard.NIL == Filesys.probe_file(rkf_sme_lexification_wizard.$blackboard_input_file$.getGlobalValue()) && timeout.numG((SubLObject)rkf_sme_lexification_wizard.ZERO_INTEGER); timeout = Numbers.subtract(timeout, delay)) {
            Threads.sleep(delay);
        }
        if (rkf_sme_lexification_wizard.NIL != Filesys.probe_file(rkf_sme_lexification_wizard.$blackboard_input_file$.getGlobalValue())) {
            final SubLObject user_response = file_utilities.read_text_file(rkf_sme_lexification_wizard.$blackboard_input_file$.getGlobalValue());
            v_answer = file_utilities.read_text_file(rkf_sme_lexification_wizard.$blackboard_input_file$.getGlobalValue()).first();
            sme_lexification_wizard.set_question_answering_agent_answer(self, v_answer);
            Filesys.delete_file(rkf_sme_lexification_wizard.$blackboard_input_file$.getGlobalValue());
            file_utilities.append_text_file(rkf_sme_lexification_wizard.$blackboard_log_file$.getGlobalValue(), user_response);
            file_utilities.append_text_file(rkf_sme_lexification_wizard.$blackboard_log_file$.getGlobalValue(), (SubLObject)ConsesLow.list(rkf_sme_lexification_wizard.$blackboard_output_delim$.getGlobalValue()));
        }
        if (rkf_sme_lexification_wizard.NIL != Filesys.probe_file(rkf_sme_lexification_wizard.$blackboard_output_file$.getGlobalValue())) {
            Filesys.delete_file(rkf_sme_lexification_wizard.$blackboard_output_file$.getGlobalValue());
        }
        methods.funcall_instance_method_with_1_args(self, (SubLObject)rkf_sme_lexification_wizard.$sym85$NOTIFY_CLIENT, (SubLObject)rkf_sme_lexification_wizard.$kw86$INPUT_READY);
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 10728L)
    public static SubLObject rkf_bb_proxy_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        SubLObject responses = get_rkf_bb_proxy_responses(self);
        SubLObject pending_actions = get_rkf_bb_proxy_pending_actions(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                sme_lexification_wizard.interface_proxy_initialize_method(self);
                pending_actions = (SubLObject)rkf_sme_lexification_wizard.NIL;
                responses = (SubLObject)rkf_sme_lexification_wizard.NIL;
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_bb_proxy_responses(self, responses);
                    set_rkf_bb_proxy_pending_actions(self, pending_actions);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 11021L)
    public static SubLObject rkf_bb_proxy_get_pending_actions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject pending_actions = get_rkf_bb_proxy_pending_actions(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, pending_actions);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_bb_proxy_pending_actions(self, pending_actions);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 11182L)
    public static SubLObject rkf_bb_proxy_add_actions_method(final SubLObject self, final SubLObject new_actions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        SubLObject pending_actions = get_rkf_bb_proxy_pending_actions(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                pending_actions = ConsesLow.append(pending_actions, new_actions);
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, pending_actions);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_bb_proxy_pending_actions(self, pending_actions);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 11507L)
    public static SubLObject rkf_bb_proxy_clear_actions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        SubLObject pending_actions = get_rkf_bb_proxy_pending_actions(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                pending_actions = (SubLObject)rkf_sme_lexification_wizard.NIL;
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, pending_actions);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_bb_proxy_pending_actions(self, pending_actions);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 11786L)
    public static SubLObject rkf_bb_proxy_add_user_response_method(final SubLObject self, final SubLObject new_response) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        SubLObject responses = get_rkf_bb_proxy_responses(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                responses = ConsesLow.append(responses, (SubLObject)ConsesLow.list(new_response));
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, responses);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_bb_proxy_responses(self, responses);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 12018L)
    public static SubLObject rkf_bb_proxy_get_next_response_method(final SubLObject self) {
        SubLObject responses = get_rkf_bb_proxy_responses(self);
        final SubLObject response = responses.first();
        responses = responses.rest();
        set_rkf_bb_proxy_responses(self, responses);
        return response;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 12314L)
    public static SubLObject rkf_bb_proxy_clear_responses_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        SubLObject responses = get_rkf_bb_proxy_responses(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                responses = (SubLObject)rkf_sme_lexification_wizard.NIL;
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, responses);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_bb_proxy_responses(self, responses);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 12583L)
    public static SubLObject rkf_uia_proxy_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                sme_lexification_wizard.interface_proxy_initialize_method(self);
                interaction = (SubLObject)rkf_sme_lexification_wizard.NIL;
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 12863L)
    public static SubLObject rkf_uia_proxy_create_constant_method(final SubLObject self, final SubLObject constant_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                SubLObject constant = (SubLObject)rkf_sme_lexification_wizard.NIL;
                constant = ke.ke_create_now(constant_name, (SubLObject)rkf_sme_lexification_wizard.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, constant);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 13344L)
    public static SubLObject rkf_uia_proxy_describe_term_method(final SubLObject self, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_describe_term_method(self, v_term));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 13620L)
    public static SubLObject rkf_uia_proxy_resolve_term_method(final SubLObject self, final SubLObject term_label) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_resolve_term_method(self, term_label));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 14065L)
    public static SubLObject rkf_uia_proxy_mumble_method(final SubLObject self, final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_mumble_method(self, message));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 14399L)
    public static SubLObject rkf_uia_proxy_forge_aheadP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_forge_aheadP_method(self));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 14766L)
    public static SubLObject rkf_uia_proxy_end_session_method(final SubLObject self) {
        rkf_uia_proxy_end_interaction_method(self);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 15004L)
    public static SubLObject rkf_uia_proxy_get_interaction_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, interaction);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 15132L)
    public static SubLObject rkf_uia_proxy_set_interaction_method(final SubLObject self, final SubLObject new_interaction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                interaction = new_interaction;
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, (SubLObject)rkf_sme_lexification_wizard.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 15302L)
    public static SubLObject rkf_uia_proxy_end_interaction_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                if (rkf_sme_lexification_wizard.NIL != interaction) {}
                pph_main.clear_paraphrase_caches((SubLObject)rkf_sme_lexification_wizard.UNPROVIDED, (SubLObject)rkf_sme_lexification_wizard.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, (SubLObject)rkf_sme_lexification_wizard.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 15746L)
    public static SubLObject rkf_bb_sme_lexification_wizard_initialize_method(final SubLObject self) {
        SubLObject question_answering_agent_class = sme_lexification_wizard.get_sme_lexification_wizard_question_answering_agent_class(self);
        SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        sme_lexification_wizard.sme_lexification_wizard_initialize_method(self);
        proxy = methods.funcall_class_method_with_0_args((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym177$NEW);
        sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
        if (rkf_sme_lexification_wizard.NIL != rkf_sme_lexification_wizard.$simulated_blackboardP$.getGlobalValue()) {
            question_answering_agent_class = (SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT;
            sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class(self, question_answering_agent_class);
        }
        else {
            question_answering_agent_class = (SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT;
            sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class(self, question_answering_agent_class);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 16368L)
    public static SubLObject rkf_bb_sme_lexification_wizard_get_pending_actions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_sme_lexification_wizard_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD, methods.funcall_instance_method_with_0_args(proxy, (SubLObject)rkf_sme_lexification_wizard.$sym109$GET_PENDING_ACTIONS));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_sme_lexification_wizard_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 16585L)
    public static SubLObject rkf_bb_sme_lexification_wizard_clear_pending_actions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_sme_lexification_wizard_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(proxy, (SubLObject)rkf_sme_lexification_wizard.$sym117$CLEAR_ACTIONS);
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD, (SubLObject)rkf_sme_lexification_wizard.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_sme_lexification_wizard_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 16803L)
    public static SubLObject rkf_bb_sme_lexification_wizard_set_user_response_method(final SubLObject self, final SubLObject response) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        final SubLObject new_current_interaction = sme_lexification_wizard.get_sme_lexification_wizard_new_current_interaction(self);
        SubLObject current_interaction = sme_lexification_wizard.get_sme_lexification_wizard_current_interaction(self);
        methods.funcall_instance_method_with_1_args(proxy, (SubLObject)rkf_sme_lexification_wizard.$sym121$ADD_USER_RESPONSE, response);
        if (!current_interaction.eql(new_current_interaction)) {
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)rkf_sme_lexification_wizard.$str83$Warning__, (SubLObject)rkf_sme_lexification_wizard.$str189$Issuing_shameless_hack_updating_c));
                streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            current_interaction = new_current_interaction;
            sme_lexification_wizard.set_sme_lexification_wizard_current_interaction(self, current_interaction);
        }
        if (rkf_sme_lexification_wizard.NIL != current_interaction) {
            methods.funcall_instance_method_with_1_args(current_interaction, (SubLObject)rkf_sme_lexification_wizard.$sym190$PROCESS_STATUS_UPDATE, (SubLObject)rkf_sme_lexification_wizard.$kw100$OUTPUT_DONE);
        }
        return (SubLObject)rkf_sme_lexification_wizard.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 17704L)
    public static SubLObject rkf_bb_sme_lexification_wizard_clear_user_responses_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_sme_lexification_wizard_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(proxy, (SubLObject)rkf_sme_lexification_wizard.$sym128$CLEAR_RESPONSES);
                Dynamic.sublisp_throw((SubLObject)rkf_sme_lexification_wizard.$sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD, (SubLObject)rkf_sme_lexification_wizard.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_sme_lexification_wizard_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 17923L)
    public static SubLObject rkf_uia_sme_lexification_wizard_initialize_method(final SubLObject self) {
        SubLObject question_answering_agent_class = sme_lexification_wizard.get_sme_lexification_wizard_question_answering_agent_class(self);
        SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        sme_lexification_wizard.sme_lexification_wizard_initialize_method(self);
        proxy = methods.funcall_class_method_with_0_args((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym177$NEW);
        sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
        question_answering_agent_class = (SubLObject)rkf_sme_lexification_wizard.$sym197$UIA_HTML_QUESTION_ANSWERING_AGENT;
        sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class(self, question_answering_agent_class);
        sme_lexification_wizard.$use_inferred_phrasesP$.setGlobalValue((SubLObject)rkf_sme_lexification_wizard.T);
        cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.setDynamicValue((SubLObject)rkf_sme_lexification_wizard.NIL);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 18634L)
    public static SubLObject rkf_uia_sme_lexification_wizard_set_interaction_method(final SubLObject self, final SubLObject new_interaction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_sme_lexification_wizard_method = (SubLObject)rkf_sme_lexification_wizard.NIL;
        final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        try {
            thread.throwStack.push(rkf_sme_lexification_wizard.$sym201$OUTER_CATCH_FOR_RKF_UIA_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (rkf_sme_lexification_wizard.NIL != proxy) {
                    methods.funcall_instance_method_with_1_args(proxy, (SubLObject)rkf_sme_lexification_wizard.$sym166$SET_INTERACTION, new_interaction);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_sme_lexification_wizard.$sym201$OUTER_CATCH_FOR_RKF_UIA_SME_LEXIFICATION_WIZARD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_sme_lexification_wizard_method;
    }
    
    public static SubLObject declare_rkf_sme_lexification_wizard_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "get_rkf_bb_proxy_responses", "GET-RKF-BB-PROXY-RESPONSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "set_rkf_bb_proxy_responses", "SET-RKF-BB-PROXY-RESPONSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "get_rkf_bb_proxy_pending_actions", "GET-RKF-BB-PROXY-PENDING-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "set_rkf_bb_proxy_pending_actions", "SET-RKF-BB-PROXY-PENDING-ACTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_rkf_bb_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_rkf_bb_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_proxy_p", "RKF-BB-PROXY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "get_rkf_uia_proxy_interaction", "GET-RKF-UIA-PROXY-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "set_rkf_uia_proxy_interaction", "SET-RKF-UIA-PROXY-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_rkf_uia_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_rkf_uia_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_p", "RKF-UIA-PROXY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_rkf_bb_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_rkf_bb_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_question_answering_agent_p", "RKF-BB-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_sim_bb_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_sim_bb_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "sim_bb_question_answering_agent_p", "SIM-BB-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_sme_lexification_wizard_p", "RKF-BB-SME-LEXIFICATION-WIZARD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_sme_lexification_wizard_p", "RKF-UIA-SME-LEXIFICATION-WIZARD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_question_answering_agent_display_question_method", "RKF-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_question_answering_agent_get_response_method", "RKF-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "sim_bb_question_answering_agent_display_question_method", "SIM-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "sim_bb_question_answering_agent_get_response_method", "SIM-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_proxy_initialize_method", "RKF-BB-PROXY-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_proxy_get_pending_actions_method", "RKF-BB-PROXY-GET-PENDING-ACTIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_proxy_add_actions_method", "RKF-BB-PROXY-ADD-ACTIONS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_proxy_clear_actions_method", "RKF-BB-PROXY-CLEAR-ACTIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_proxy_add_user_response_method", "RKF-BB-PROXY-ADD-USER-RESPONSE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_proxy_get_next_response_method", "RKF-BB-PROXY-GET-NEXT-RESPONSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_proxy_clear_responses_method", "RKF-BB-PROXY-CLEAR-RESPONSES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_initialize_method", "RKF-UIA-PROXY-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_create_constant_method", "RKF-UIA-PROXY-CREATE-CONSTANT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_describe_term_method", "RKF-UIA-PROXY-DESCRIBE-TERM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_resolve_term_method", "RKF-UIA-PROXY-RESOLVE-TERM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_mumble_method", "RKF-UIA-PROXY-MUMBLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_forge_aheadP_method", "RKF-UIA-PROXY-FORGE-AHEAD?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_end_session_method", "RKF-UIA-PROXY-END-SESSION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_get_interaction_method", "RKF-UIA-PROXY-GET-INTERACTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_set_interaction_method", "RKF-UIA-PROXY-SET-INTERACTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_proxy_end_interaction_method", "RKF-UIA-PROXY-END-INTERACTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_sme_lexification_wizard_initialize_method", "RKF-BB-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_sme_lexification_wizard_get_pending_actions_method", "RKF-BB-SME-LEXIFICATION-WIZARD-GET-PENDING-ACTIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_sme_lexification_wizard_clear_pending_actions_method", "RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-PENDING-ACTIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_sme_lexification_wizard_set_user_response_method", "RKF-BB-SME-LEXIFICATION-WIZARD-SET-USER-RESPONSE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_bb_sme_lexification_wizard_clear_user_responses_method", "RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-USER-RESPONSES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_sme_lexification_wizard_initialize_method", "RKF-UIA-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sme_lexification_wizard", "rkf_uia_sme_lexification_wizard_set_interaction_method", "RKF-UIA-SME-LEXIFICATION-WIZARD-SET-INTERACTION-METHOD", 2, 0, false);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    public static SubLObject init_rkf_sme_lexification_wizard_file() {
        rkf_sme_lexification_wizard.$simulated_blackboardP$ = SubLFiles.deflexical("*SIMULATED-BLACKBOARD?*", (SubLObject)rkf_sme_lexification_wizard.NIL);
        rkf_sme_lexification_wizard.$blackboard_input_file$ = SubLFiles.deflexical("*BLACKBOARD-INPUT-FILE*", (SubLObject)rkf_sme_lexification_wizard.$str0$_tmp_blackboard_input_text);
        rkf_sme_lexification_wizard.$blackboard_output_file$ = SubLFiles.deflexical("*BLACKBOARD-OUTPUT-FILE*", (SubLObject)rkf_sme_lexification_wizard.$str1$_tmp_blackboard_output_text);
        rkf_sme_lexification_wizard.$blackboard_log_file$ = SubLFiles.deflexical("*BLACKBOARD-LOG-FILE*", (SubLObject)rkf_sme_lexification_wizard.$str2$_tmp_blackboard_log_text);
        rkf_sme_lexification_wizard.$blackboard_input_delim$ = SubLFiles.deflexical("*BLACKBOARD-INPUT-DELIM*", (SubLObject)rkf_sme_lexification_wizard.$str3$_________________________________);
        rkf_sme_lexification_wizard.$blackboard_output_delim$ = SubLFiles.deflexical("*BLACKBOARD-OUTPUT-DELIM*", (SubLObject)rkf_sme_lexification_wizard.$str4$_________________________________);
        rkf_sme_lexification_wizard.$blackboard_delay$ = SubLFiles.deflexical("*BLACKBOARD-DELAY*", (SubLObject)rkf_sme_lexification_wizard.TEN_INTEGER);
        rkf_sme_lexification_wizard.$blackboard_timeout$ = SubLFiles.deflexical("*BLACKBOARD-TIMEOUT*", (SubLObject)rkf_sme_lexification_wizard.$int5$600);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    public static SubLObject setup_rkf_sme_lexification_wizard_file() {
        classes.subloop_new_class((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym7$INTERFACE_PROXY, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list8);
        classes.class_set_implements_slot_listeners((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym13$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym16$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_INSTANCE);
        subloop_reserved_initialize_rkf_bb_proxy_class((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY);
        classes.subloop_new_class((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym7$INTERFACE_PROXY, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list18);
        classes.class_set_implements_slot_listeners((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym20$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym21$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_INSTANCE);
        subloop_reserved_initialize_rkf_uia_proxy_class((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY);
        classes.subloop_new_class((SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym24$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym42$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_INSTA);
        subloop_reserved_initialize_rkf_bb_question_answering_agent_class((SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT);
        classes.subloop_new_class((SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym23$QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym44$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym45$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_INSTA);
        subloop_reserved_initialize_sim_bb_question_answering_agent_class((SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT);
        classes.subloop_new_class((SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list48);
        classes.class_set_implements_slot_listeners((SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym49$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym56$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_INSTAN);
        subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_class((SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD);
        classes.subloop_new_class((SubLObject)rkf_sme_lexification_wizard.$sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym47$SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list58);
        classes.class_set_implements_slot_listeners((SubLObject)rkf_sme_lexification_wizard.$sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym59$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)rkf_sme_lexification_wizard.$sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym60$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_INSTA);
        subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_class((SubLObject)rkf_sme_lexification_wizard.$sym57$RKF_UIA_SME_LEXIFICATION_WIZARD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym61$DISPLAY_QUESTION, (SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$list62, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list63);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym61$DISPLAY_QUESTION, (SubLObject)rkf_sme_lexification_wizard.$sym79$RKF_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym80$GET_RESPONSE, (SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$list62, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list81);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym22$RKF_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym80$GET_RESPONSE, (SubLObject)rkf_sme_lexification_wizard.$sym87$RKF_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym61$DISPLAY_QUESTION, (SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list89);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym61$DISPLAY_QUESTION, (SubLObject)rkf_sme_lexification_wizard.$sym101$SIM_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym80$GET_RESPONSE, (SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$list62, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list102);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym43$SIM_BB_QUESTION_ANSWERING_AGENT, (SubLObject)rkf_sme_lexification_wizard.$sym80$GET_RESPONSE, (SubLObject)rkf_sme_lexification_wizard.$sym103$SIM_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym104$INITIALIZE, (SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list105, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list106);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym104$INITIALIZE, (SubLObject)rkf_sme_lexification_wizard.$sym108$RKF_BB_PROXY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym109$GET_PENDING_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list110);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym109$GET_PENDING_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.$sym112$RKF_BB_PROXY_GET_PENDING_ACTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym78$ADD_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.$list113, (SubLObject)rkf_sme_lexification_wizard.$list114);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym78$ADD_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.$sym116$RKF_BB_PROXY_ADD_ACTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym117$CLEAR_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list118);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym117$CLEAR_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.$sym120$RKF_BB_PROXY_CLEAR_ACTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym121$ADD_USER_RESPONSE, (SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.$list122, (SubLObject)rkf_sme_lexification_wizard.$list123);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym121$ADD_USER_RESPONSE, (SubLObject)rkf_sme_lexification_wizard.$sym125$RKF_BB_PROXY_ADD_USER_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym82$GET_NEXT_RESPONSE, (SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list62, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list126);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym82$GET_NEXT_RESPONSE, (SubLObject)rkf_sme_lexification_wizard.$sym127$RKF_BB_PROXY_GET_NEXT_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym128$CLEAR_RESPONSES, (SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list129);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym6$RKF_BB_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym128$CLEAR_RESPONSES, (SubLObject)rkf_sme_lexification_wizard.$sym131$RKF_BB_PROXY_CLEAR_RESPONSES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym104$INITIALIZE, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list105, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list132);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym104$INITIALIZE, (SubLObject)rkf_sme_lexification_wizard.$sym134$RKF_UIA_PROXY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym135$CREATE_CONSTANT, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list105, (SubLObject)rkf_sme_lexification_wizard.$list136, (SubLObject)rkf_sme_lexification_wizard.$list137);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym135$CREATE_CONSTANT, (SubLObject)rkf_sme_lexification_wizard.$sym139$RKF_UIA_PROXY_CREATE_CONSTANT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym140$DESCRIBE_TERM, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list105, (SubLObject)rkf_sme_lexification_wizard.$list141, (SubLObject)rkf_sme_lexification_wizard.$list142);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym140$DESCRIBE_TERM, (SubLObject)rkf_sme_lexification_wizard.$sym144$RKF_UIA_PROXY_DESCRIBE_TERM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym145$RESOLVE_TERM, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list105, (SubLObject)rkf_sme_lexification_wizard.$list146, (SubLObject)rkf_sme_lexification_wizard.$list147);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym145$RESOLVE_TERM, (SubLObject)rkf_sme_lexification_wizard.$sym149$RKF_UIA_PROXY_RESOLVE_TERM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym150$MUMBLE, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.$list151, (SubLObject)rkf_sme_lexification_wizard.$list152);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym150$MUMBLE, (SubLObject)rkf_sme_lexification_wizard.$sym154$RKF_UIA_PROXY_MUMBLE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym155$FORGE_AHEAD_, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list156);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym155$FORGE_AHEAD_, (SubLObject)rkf_sme_lexification_wizard.$sym158$RKF_UIA_PROXY_FORGE_AHEAD__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym159$END_SESSION, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list105, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list160);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym159$END_SESSION, (SubLObject)rkf_sme_lexification_wizard.$sym161$RKF_UIA_PROXY_END_SESSION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym162$GET_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list163);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym162$GET_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.$sym165$RKF_UIA_PROXY_GET_INTERACTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym166$SET_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.$list167, (SubLObject)rkf_sme_lexification_wizard.$list168);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym166$SET_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.$sym170$RKF_UIA_PROXY_SET_INTERACTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym171$END_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list172);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym17$RKF_UIA_PROXY, (SubLObject)rkf_sme_lexification_wizard.$sym171$END_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.$sym174$RKF_UIA_PROXY_END_INTERACTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym104$INITIALIZE, (SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$list175, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list176);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym104$INITIALIZE, (SubLObject)rkf_sme_lexification_wizard.$sym178$RKF_BB_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym109$GET_PENDING_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$list105, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list179);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym109$GET_PENDING_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.$sym181$RKF_BB_SME_LEXIFICATION_WIZARD_GET_PENDING_ACTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym182$CLEAR_PENDING_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list183);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym182$CLEAR_PENDING_ACTIONS, (SubLObject)rkf_sme_lexification_wizard.$sym185$RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_PENDING_ACTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym186$SET_USER_RESPONSE, (SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$list175, (SubLObject)rkf_sme_lexification_wizard.$list187, (SubLObject)rkf_sme_lexification_wizard.$list188);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym186$SET_USER_RESPONSE, (SubLObject)rkf_sme_lexification_wizard.$sym191$RKF_BB_SME_LEXIFICATION_WIZARD_SET_USER_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym192$CLEAR_USER_RESPONSES, (SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$list88, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list193);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym46$RKF_BB_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym192$CLEAR_USER_RESPONSES, (SubLObject)rkf_sme_lexification_wizard.$sym195$RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_USER_RESPONSES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym104$INITIALIZE, (SubLObject)rkf_sme_lexification_wizard.$sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$list175, (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)rkf_sme_lexification_wizard.$list196);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym104$INITIALIZE, (SubLObject)rkf_sme_lexification_wizard.$sym198$RKF_UIA_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym166$SET_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.$sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$list199, (SubLObject)rkf_sme_lexification_wizard.$list167, (SubLObject)rkf_sme_lexification_wizard.$list200);
        methods.subloop_register_instance_method((SubLObject)rkf_sme_lexification_wizard.$sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, (SubLObject)rkf_sme_lexification_wizard.$sym166$SET_INTERACTION, (SubLObject)rkf_sme_lexification_wizard.$sym202$RKF_UIA_SME_LEXIFICATION_WIZARD_SET_INTERACTION_METHOD);
        return (SubLObject)rkf_sme_lexification_wizard.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_sme_lexification_wizard_file();
    }
    
    public void initializeVariables() {
        init_rkf_sme_lexification_wizard_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_sme_lexification_wizard_file();
    }
    
    static {
        me = (SubLFile)new rkf_sme_lexification_wizard();
        rkf_sme_lexification_wizard.$simulated_blackboardP$ = null;
        rkf_sme_lexification_wizard.$blackboard_input_file$ = null;
        rkf_sme_lexification_wizard.$blackboard_output_file$ = null;
        rkf_sme_lexification_wizard.$blackboard_log_file$ = null;
        rkf_sme_lexification_wizard.$blackboard_input_delim$ = null;
        rkf_sme_lexification_wizard.$blackboard_output_delim$ = null;
        rkf_sme_lexification_wizard.$blackboard_delay$ = null;
        rkf_sme_lexification_wizard.$blackboard_timeout$ = null;
        $str0$_tmp_blackboard_input_text = SubLObjectFactory.makeString("/tmp/blackboard-input.text");
        $str1$_tmp_blackboard_output_text = SubLObjectFactory.makeString("/tmp/blackboard-output.text");
        $str2$_tmp_blackboard_log_text = SubLObjectFactory.makeString("/tmp/blackboard-log.text");
        $str3$_________________________________ = SubLObjectFactory.makeString("........................................................................");
        $str4$_________________________________ = SubLObjectFactory.makeString("------------------------------------------------------------------------");
        $int5$600 = SubLObjectFactory.makeInteger(600);
        $sym6$RKF_BB_PROXY = SubLObjectFactory.makeSymbol("RKF-BB-PROXY");
        $sym7$INTERFACE_PROXY = SubLObjectFactory.makeSymbol("INTERFACE-PROXY");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PENDING-ACTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PENDING-ACTIONS"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-ACTIONS"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR-ACTIONS"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-USER-RESPONSE"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NEXT-RESPONSE"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR-RESPONSES"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym9$RESPONSES = SubLObjectFactory.makeSymbol("RESPONSES");
        $sym10$PENDING_ACTIONS = SubLObjectFactory.makeSymbol("PENDING-ACTIONS");
        $sym11$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym12$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym13$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-INSTANCE");
        $sym17$RKF_UIA_PROXY = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERACTION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INTERACTION"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERACTION")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("END-INTERACTION"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym19$INTERACTION = SubLObjectFactory.makeSymbol("INTERACTION");
        $sym20$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-CLASS");
        $sym21$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-INSTANCE");
        $sym22$RKF_BB_QUESTION_ANSWERING_AGENT = SubLObjectFactory.makeSymbol("RKF-BB-QUESTION-ANSWERING-AGENT");
        $sym23$QUESTION_ANSWERING_AGENT = SubLObjectFactory.makeSymbol("QUESTION-ANSWERING-AGENT");
        $sym24$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-CLASS");
        $sym25$ID = SubLObjectFactory.makeSymbol("ID");
        $sym26$TITLE = SubLObjectFactory.makeSymbol("TITLE");
        $sym27$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $sym28$TIP = SubLObjectFactory.makeSymbol("TIP");
        $sym29$QUESTION_TYPE = SubLObjectFactory.makeSymbol("QUESTION-TYPE");
        $sym30$ERROR_MESSAGE = SubLObjectFactory.makeSymbol("ERROR-MESSAGE");
        $sym31$CHOICES = SubLObjectFactory.makeSymbol("CHOICES");
        $sym32$DESCRIPTIONS = SubLObjectFactory.makeSymbol("DESCRIPTIONS");
        $sym33$VALUES = SubLObjectFactory.makeSymbol("VALUES");
        $sym34$DEFAULT = SubLObjectFactory.makeSymbol("DEFAULT");
        $sym35$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $sym36$FIELD_WIDTH = SubLObjectFactory.makeSymbol("FIELD-WIDTH");
        $sym37$FIELD_LABELS = SubLObjectFactory.makeSymbol("FIELD-LABELS");
        $sym38$PROXY = SubLObjectFactory.makeSymbol("PROXY");
        $sym39$CALLBACK_FUNCTION = SubLObjectFactory.makeSymbol("CALLBACK-FUNCTION");
        $sym40$CLIENT_DATA = SubLObjectFactory.makeSymbol("CLIENT-DATA");
        $sym41$USER_DATA = SubLObjectFactory.makeSymbol("USER-DATA");
        $sym42$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_INSTA = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-INSTANCE");
        $sym43$SIM_BB_QUESTION_ANSWERING_AGENT = SubLObjectFactory.makeSymbol("SIM-BB-QUESTION-ANSWERING-AGENT");
        $sym44$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-CLASS");
        $sym45$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_INSTA = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-INSTANCE");
        $sym46$RKF_BB_SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD");
        $sym47$SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("SME-LEXIFICATION-WIZARD");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PENDING-ACTIONS"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR-PENDING-ACTIONS"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-USER-RESPONSE"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR-USER-RESPONSES"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym49$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-CLASS");
        $sym50$STATE = SubLObjectFactory.makeSymbol("STATE");
        $sym51$NEXT_STATES = SubLObjectFactory.makeSymbol("NEXT-STATES");
        $sym52$LEXWIZ_PARAMETERS = SubLObjectFactory.makeSymbol("LEXWIZ-PARAMETERS");
        $sym53$CURRENT_INTERACTION = SubLObjectFactory.makeSymbol("CURRENT-INTERACTION");
        $sym54$NEW_CURRENT_INTERACTION = SubLObjectFactory.makeSymbol("NEW-CURRENT-INTERACTION");
        $sym55$QUESTION_ANSWERING_AGENT_CLASS = SubLObjectFactory.makeSymbol("QUESTION-ANSWERING-AGENT-CLASS");
        $sym56$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_INSTAN = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-INSTANCE");
        $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("RKF-UIA-SME-LEXIFICATION-WIZARD");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERACTION"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym59$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-CLASS");
        $sym60$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_INSTA = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-INSTANCE");
        $sym61$DISPLAY_QUESTION = SubLObjectFactory.makeSymbol("DISPLAY-QUESTION");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("SHOW-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("SHOW-TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeString("Error: ~a"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-MESSAGE"))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("SHOW-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TIP"), (SubLObject)SubLObjectFactory.makeSymbol("*SME-LEXWIZ-VERBOSE?*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("SHOW-TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeString("Tip: ~a"), (SubLObject)SubLObjectFactory.makeSymbol("TIP"))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("CHOOSE-ONE"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE")))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENUMERATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("CHOOSE-ONE"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-SELECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("CHOOSE-MUTIPLE"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FREE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTER-TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER"))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-FREE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-LABELS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTER-TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER"))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-DEBUG-OUT"), (SubLObject)SubLObjectFactory.makeString("Adding new actions: ~%~S~%"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-ACTIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS"))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)rkf_sme_lexification_wizard.NIL));
        $kw64$SHOW_TEXT = SubLObjectFactory.makeKeyword("SHOW-TEXT");
        $str65$Error___a = SubLObjectFactory.makeString("Error: ~a");
        $str66$Tip___a = SubLObjectFactory.makeString("Tip: ~a");
        $kw67$BOOLEAN = SubLObjectFactory.makeKeyword("BOOLEAN");
        $kw68$CHOOSE_ONE = SubLObjectFactory.makeKeyword("CHOOSE-ONE");
        $kw69$ANSWER = SubLObjectFactory.makeKeyword("ANSWER");
        $sym70$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $kw71$ENUMERATED = SubLObjectFactory.makeKeyword("ENUMERATED");
        $kw72$MULTIPLE_SELECTION = SubLObjectFactory.makeKeyword("MULTIPLE-SELECTION");
        $kw73$CHOOSE_MUTIPLE = SubLObjectFactory.makeKeyword("CHOOSE-MUTIPLE");
        $kw74$FREE_FORM = SubLObjectFactory.makeKeyword("FREE-FORM");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTER-TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER"));
        $kw76$MULTIPLE_FREE_FORM = SubLObjectFactory.makeKeyword("MULTIPLE-FREE-FORM");
        $str77$Adding_new_actions_____S__ = SubLObjectFactory.makeString("Adding new actions: ~%~S~%");
        $sym78$ADD_ACTIONS = SubLObjectFactory.makeSymbol("ADD-ACTIONS");
        $sym79$RKF_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD");
        $sym80$GET_RESPONSE = SubLObjectFactory.makeSymbol("GET-RESPONSE");
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NEXT-RESPONSE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-WARN"), (SubLObject)SubLObjectFactory.makeString("Unexpected response from blackboard: ~a~%"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)rkf_sme_lexification_wizard.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOTIFY-CLIENT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-READY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")));
        $sym82$GET_NEXT_RESPONSE = SubLObjectFactory.makeSymbol("GET-NEXT-RESPONSE");
        $str83$Warning__ = SubLObjectFactory.makeString("Warning: ");
        $str84$Unexpected_response_from_blackboa = SubLObjectFactory.makeString("Unexpected response from blackboard: ~a~%");
        $sym85$NOTIFY_CLIENT = SubLObjectFactory.makeSymbol("NOTIFY-CLIENT");
        $kw86$INPUT_READY = SubLObjectFactory.makeKeyword("INPUT-READY");
        $sym87$RKF_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeString("")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeString("Error:"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)SubLObjectFactory.makeString(""))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeString("Answer (~a/~s): "), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENUMERATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeString("Answer (~a - ~a): "), (SubLObject)rkf_sme_lexification_wizard.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-SELECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)rkf_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeString("Answer (~a - ~a, including ranges): "), (SubLObject)rkf_sme_lexification_wizard.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FREE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Answer: ")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-FREE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("List of answers: "))))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TIP"), (SubLObject)SubLObjectFactory.makeSymbol("*SME-LEXWIZ-VERBOSE?*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeString("Tip:"), (SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeSymbol("TIP"), (SubLObject)SubLObjectFactory.makeString("")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TEXT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-OUTPUT-FILE*"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND-TEXT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-LOG-FILE*"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-LINES")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND-TEXT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-LOG-FILE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-INPUT-DELIM*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOTIFY-CLIENT")), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-DONE")) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)rkf_sme_lexification_wizard.NIL));
        $sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SIM-BB-QUESTION-ANSWERING-AGENT-METHOD");
        $str91$ = SubLObjectFactory.makeString("");
        $str92$Error_ = SubLObjectFactory.makeString("Error:");
        $str93$Answer___a__s___ = SubLObjectFactory.makeString("Answer (~a/~s): ");
        $str94$Answer___a____a___ = SubLObjectFactory.makeString("Answer (~a - ~a): ");
        $str95$Answer___a____a__including_ranges = SubLObjectFactory.makeString("Answer (~a - ~a, including ranges): ");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Answer: "));
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("List of answers: "));
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""));
        $str99$Tip_ = SubLObjectFactory.makeString("Tip:");
        $kw100$OUTPUT_DONE = SubLObjectFactory.makeKeyword("OUTPUT-DONE");
        $sym101$SIM_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = SubLObjectFactory.makeSymbol("SIM-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-TIMEOUT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELAY"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-DELAY*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBE-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-INPUT-FILE*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)rkf_sme_lexification_wizard.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLEEP"), (SubLObject)SubLObjectFactory.makeSymbol("DELAY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("DELAY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBE-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-INPUT-FILE*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("USER-RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-TEXT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-INPUT-FILE*")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-TEXT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-INPUT-FILE*")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-INPUT-FILE*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND-TEXT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-LOG-FILE*"), (SubLObject)SubLObjectFactory.makeSymbol("USER-RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND-TEXT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-LOG-FILE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-OUTPUT-DELIM*"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBE-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-OUTPUT-FILE*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("*BLACKBOARD-OUTPUT-FILE*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOTIFY-CLIENT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-READY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")));
        $sym103$SIM_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD = SubLObjectFactory.makeSymbol("SIM-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD");
        $sym104$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list106 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PENDING-ACTIONS"), (SubLObject)rkf_sme_lexification_wizard.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSES"), (SubLObject)rkf_sme_lexification_wizard.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");
        $sym108$RKF_BB_PROXY_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-PROXY-INITIALIZE-METHOD");
        $sym109$GET_PENDING_ACTIONS = SubLObjectFactory.makeSymbol("GET-PENDING-ACTIONS");
        $list110 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PENDING-ACTIONS")));
        $sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");
        $sym112$RKF_BB_PROXY_GET_PENDING_ACTIONS_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-PROXY-GET-PENDING-ACTIONS-METHOD");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS"));
        $list114 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PENDING-ACTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("PENDING-ACTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ACTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PENDING-ACTIONS")));
        $sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");
        $sym116$RKF_BB_PROXY_ADD_ACTIONS_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-PROXY-ADD-ACTIONS-METHOD");
        $sym117$CLEAR_ACTIONS = SubLObjectFactory.makeSymbol("CLEAR-ACTIONS");
        $list118 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PENDING-ACTIONS"), (SubLObject)rkf_sme_lexification_wizard.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PENDING-ACTIONS")));
        $sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");
        $sym120$RKF_BB_PROXY_CLEAR_ACTIONS_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-PROXY-CLEAR-ACTIONS-METHOD");
        $sym121$ADD_USER_RESPONSE = SubLObjectFactory.makeSymbol("ADD-USER-RESPONSE");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-RESPONSE"));
        $list123 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RESPONSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSES")));
        $sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");
        $sym125$RKF_BB_PROXY_ADD_USER_RESPONSE_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-PROXY-ADD-USER-RESPONSE-METHOD");
        $list126 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"))));
        $sym127$RKF_BB_PROXY_GET_NEXT_RESPONSE_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-PROXY-GET-NEXT-RESPONSE-METHOD");
        $sym128$CLEAR_RESPONSES = SubLObjectFactory.makeSymbol("CLEAR-RESPONSES");
        $list129 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSES"), (SubLObject)rkf_sme_lexification_wizard.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSES")));
        $sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");
        $sym131$RKF_BB_PROXY_CLEAR_RESPONSES_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-PROXY-CLEAR-RESPONSES-METHOD");
        $list132 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION"), (SubLObject)rkf_sme_lexification_wizard.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");
        $sym134$RKF_UIA_PROXY_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY-INITIALIZE-METHOD");
        $sym135$CREATE_CONSTANT = SubLObjectFactory.makeSymbol("CREATE-CONSTANT");
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME"));
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-UIA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-UIAT-GET-LEXICAL-INTERACTION-MT"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-MT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KE-CREATE-NOW"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"))));
        $sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");
        $sym139$RKF_UIA_PROXY_CREATE_CONSTANT_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY-CREATE-CONSTANT-METHOD");
        $sym140$DESCRIBE_TERM = SubLObjectFactory.makeSymbol("DESCRIBE-TERM");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $list142 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-UIA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AGENDA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UI-AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UIA-TERM-PHRASE-PRECISE"), (SubLObject)SubLObjectFactory.makeSymbol("AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")))));
        $sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");
        $sym144$RKF_UIA_PROXY_DESCRIBE_TERM_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY-DESCRIBE-TERM-METHOD");
        $sym145$RESOLVE_TERM = SubLObjectFactory.makeSymbol("RESOLVE-TERM");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-LABEL"));
        $list147 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-UIA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AGENDA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UI-AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UIA-PHRASE-CANDIDATE-TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-LABEL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLARIFICATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UIA-TERMS-DISTINGUISHING-PHRASES"), (SubLObject)SubLObjectFactory.makeSymbol("AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CLARIFICATIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESOLVE-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-LABEL")))));
        $sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");
        $sym149$RKF_UIA_PROXY_RESOLVE_TERM_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY-RESOLVE-TERM-METHOD");
        $sym150$MUMBLE = SubLObjectFactory.makeSymbol("MUMBLE");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"));
        $list152 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-UIA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AGENDA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UI-AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-TRACE"), (SubLObject)SubLObjectFactory.makeSymbol("*LEX-BASIC*"), (SubLObject)SubLObjectFactory.makeString("~&mumbling: ~a~%"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UIA-MUMBLE"), (SubLObject)SubLObjectFactory.makeSymbol("AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUMBLE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE")))));
        $sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");
        $sym154$RKF_UIA_PROXY_MUMBLE_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY-MUMBLE-METHOD");
        $sym155$FORGE_AHEAD_ = SubLObjectFactory.makeSymbol("FORGE-AHEAD?");
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-UIA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AGENDA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UI-AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UIA-FORGE-AHEAD?"), (SubLObject)SubLObjectFactory.makeSymbol("AGENDA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORGE-AHEAD?"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")))));
        $sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");
        $sym158$RKF_UIA_PROXY_FORGE_AHEAD__METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY-FORGE-AHEAD?-METHOD");
        $sym159$END_SESSION = SubLObjectFactory.makeSymbol("END-SESSION");
        $list160 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-INTERACTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)rkf_sme_lexification_wizard.NIL));
        $sym161$RKF_UIA_PROXY_END_SESSION_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY-END-SESSION-METHOD");
        $sym162$GET_INTERACTION = SubLObjectFactory.makeSymbol("GET-INTERACTION");
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION")));
        $sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");
        $sym165$RKF_UIA_PROXY_GET_INTERACTION_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY-GET-INTERACTION-METHOD");
        $sym166$SET_INTERACTION = SubLObjectFactory.makeSymbol("SET-INTERACTION");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERACTION"));
        $list168 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERACTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)rkf_sme_lexification_wizard.NIL));
        $sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");
        $sym170$RKF_UIA_PROXY_SET_INTERACTION_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY-SET-INTERACTION-METHOD");
        $sym171$END_INTERACTION = SubLObjectFactory.makeSymbol("END-INTERACTION");
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-UIA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-UIAT-END-LEXIFICATION-WIZARD"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-PARAPHRASE-CACHES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-UIA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-UIA-PARAPHRASE-CACHES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UI-AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)rkf_sme_lexification_wizard.NIL));
        $sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");
        $sym174$RKF_UIA_PROXY_END_INTERACTION_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-PROXY-END-INTERACTION-METHOD");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list176 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-BB-PROXY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("*SIMULATED-BLACKBOARD?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SIM-BB-QUESTION-ANSWERING-AGENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-BB-QUESTION-ANSWERING-AGENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym177$NEW = SubLObjectFactory.makeSymbol("NEW");
        $sym178$RKF_BB_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD");
        $list179 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PENDING-ACTIONS")))));
        $sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-SME-LEXIFICATION-WIZARD-METHOD");
        $sym181$RKF_BB_SME_LEXIFICATION_WIZARD_GET_PENDING_ACTIONS_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD-GET-PENDING-ACTIONS-METHOD");
        $sym182$CLEAR_PENDING_ACTIONS = SubLObjectFactory.makeSymbol("CLEAR-PENDING-ACTIONS");
        $list183 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR-ACTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)rkf_sme_lexification_wizard.NIL));
        $sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-SME-LEXIFICATION-WIZARD-METHOD");
        $sym185$RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_PENDING_ACTIONS_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-PENDING-ACTIONS-METHOD");
        $sym186$SET_USER_RESPONSE = SubLObjectFactory.makeSymbol("SET-USER-RESPONSE");
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"));
        $list188 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-USER-RESPONSE")), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)rkf_sme_lexification_wizard.EQ, (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INTERACTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CURRENT-INTERACTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-WARN"), (SubLObject)SubLObjectFactory.makeString("Issuing shameless hack updating current interaction~%")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INTERACTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CURRENT-INTERACTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-STATUS-UPDATE")), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-DONE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)rkf_sme_lexification_wizard.T));
        $str189$Issuing_shameless_hack_updating_c = SubLObjectFactory.makeString("Issuing shameless hack updating current interaction~%");
        $sym190$PROCESS_STATUS_UPDATE = SubLObjectFactory.makeSymbol("PROCESS-STATUS-UPDATE");
        $sym191$RKF_BB_SME_LEXIFICATION_WIZARD_SET_USER_RESPONSE_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD-SET-USER-RESPONSE-METHOD");
        $sym192$CLEAR_USER_RESPONSES = SubLObjectFactory.makeSymbol("CLEAR-USER-RESPONSES");
        $list193 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR-RESPONSES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)rkf_sme_lexification_wizard.NIL));
        $sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-SME-LEXIFICATION-WIZARD-METHOD");
        $sym195$RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_USER_RESPONSES_METHOD = SubLObjectFactory.makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-USER-RESPONSES-METHOD");
        $list196 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UIA-PROXY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("UIA-HTML-QUESTION-ANSWERING-AGENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*USE-INFERRED-PHRASES?*"), (SubLObject)rkf_sme_lexification_wizard.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*SME-LEXWIZ-VERBOSE?*"), (SubLObject)rkf_sme_lexification_wizard.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym197$UIA_HTML_QUESTION_ANSWERING_AGENT = SubLObjectFactory.makeSymbol("UIA-HTML-QUESTION-ANSWERING-AGENT");
        $sym198$RKF_UIA_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD");
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list200 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERACTION")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERACTION"))));
        $sym201$OUTER_CATCH_FOR_RKF_UIA_SME_LEXIFICATION_WIZARD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-SME-LEXIFICATION-WIZARD-METHOD");
        $sym202$RKF_UIA_SME_LEXIFICATION_WIZARD_SET_INTERACTION_METHOD = SubLObjectFactory.makeSymbol("RKF-UIA-SME-LEXIFICATION-WIZARD-SET-INTERACTION-METHOD");
    }
}

/*

	Total time: 525 ms
	
*/