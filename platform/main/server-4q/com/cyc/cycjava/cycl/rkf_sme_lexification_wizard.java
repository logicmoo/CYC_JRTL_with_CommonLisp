package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class rkf_sme_lexification_wizard
    extends
      SubLTranslatedFile
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
  public static SubLObject get_rkf_bb_proxy_responses(final SubLObject rkf_bb_proxy)
  {
    return classes.subloop_get_access_protected_instance_slot( rkf_bb_proxy, TWO_INTEGER, $sym9$RESPONSES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
  public static SubLObject set_rkf_bb_proxy_responses(final SubLObject rkf_bb_proxy, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rkf_bb_proxy, value, TWO_INTEGER, $sym9$RESPONSES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
  public static SubLObject get_rkf_bb_proxy_pending_actions(final SubLObject rkf_bb_proxy)
  {
    return classes.subloop_get_access_protected_instance_slot( rkf_bb_proxy, ONE_INTEGER, $sym10$PENDING_ACTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
  public static SubLObject set_rkf_bb_proxy_pending_actions(final SubLObject rkf_bb_proxy, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rkf_bb_proxy, value, ONE_INTEGER, $sym10$PENDING_ACTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
  public static SubLObject subloop_reserved_initialize_rkf_bb_proxy_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym12$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
  public static SubLObject subloop_reserved_initialize_rkf_bb_proxy_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym6$RKF_BB_PROXY, $sym10$PENDING_ACTIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym6$RKF_BB_PROXY, $sym9$RESPONSES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 2414L)
  public static SubLObject rkf_bb_proxy_p(final SubLObject rkf_bb_proxy)
  {
    return classes.subloop_instanceof_class( rkf_bb_proxy, $sym6$RKF_BB_PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3560L)
  public static SubLObject get_rkf_uia_proxy_interaction(final SubLObject rkf_uia_proxy)
  {
    return classes.subloop_get_access_protected_instance_slot( rkf_uia_proxy, ONE_INTEGER, $sym19$INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3560L)
  public static SubLObject set_rkf_uia_proxy_interaction(final SubLObject rkf_uia_proxy, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( rkf_uia_proxy, value, ONE_INTEGER, $sym19$INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3560L)
  public static SubLObject subloop_reserved_initialize_rkf_uia_proxy_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym12$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3560L)
  public static SubLObject subloop_reserved_initialize_rkf_uia_proxy_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym17$RKF_UIA_PROXY, $sym19$INTERACTION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3560L)
  public static SubLObject rkf_uia_proxy_p(final SubLObject rkf_uia_proxy)
  {
    return classes.subloop_instanceof_class( rkf_uia_proxy, $sym17$RKF_UIA_PROXY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3956L)
  public static SubLObject subloop_reserved_initialize_rkf_bb_question_answering_agent_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym12$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3956L)
  public static SubLObject subloop_reserved_initialize_rkf_bb_question_answering_agent_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym25$ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym26$TITLE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym27$QUESTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym28$TIP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym29$QUESTION_TYPE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym30$ERROR_MESSAGE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym31$CHOICES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym32$DESCRIPTIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym33$VALUES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym34$DEFAULT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym35$ANSWER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym36$FIELD_WIDTH, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym37$FIELD_LABELS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym38$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym39$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym40$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym41$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 3956L)
  public static SubLObject rkf_bb_question_answering_agent_p(final SubLObject rkf_bb_question_answering_agent)
  {
    return classes.subloop_instanceof_class( rkf_bb_question_answering_agent, $sym22$RKF_BB_QUESTION_ANSWERING_AGENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4133L)
  public static SubLObject subloop_reserved_initialize_sim_bb_question_answering_agent_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym12$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4133L)
  public static SubLObject subloop_reserved_initialize_sim_bb_question_answering_agent_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym25$ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym26$TITLE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym27$QUESTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym28$TIP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym29$QUESTION_TYPE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym30$ERROR_MESSAGE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym31$CHOICES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym32$DESCRIPTIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym33$VALUES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym34$DEFAULT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym35$ANSWER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym36$FIELD_WIDTH, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym37$FIELD_LABELS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym38$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym39$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym40$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym23$QUESTION_ANSWERING_AGENT, $sym41$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4133L)
  public static SubLObject sim_bb_question_answering_agent_p(final SubLObject sim_bb_question_answering_agent)
  {
    return classes.subloop_instanceof_class( sim_bb_question_answering_agent, $sym43$SIM_BB_QUESTION_ANSWERING_AGENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4313L)
  public static SubLObject subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym12$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4313L)
  public static SubLObject subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym50$STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym51$NEXT_STATES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym52$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym53$CURRENT_INTERACTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym54$NEW_CURRENT_INTERACTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym38$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym55$QUESTION_ANSWERING_AGENT_CLASS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4313L)
  public static SubLObject rkf_bb_sme_lexification_wizard_p(final SubLObject rkf_bb_sme_lexification_wizard)
  {
    return classes.subloop_instanceof_class( rkf_bb_sme_lexification_wizard, $sym46$RKF_BB_SME_LEXIFICATION_WIZARD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4733L)
  public static SubLObject subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym12$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4733L)
  public static SubLObject subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym50$STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym51$NEXT_STATES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym52$LEXWIZ_PARAMETERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym53$CURRENT_INTERACTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym54$NEW_CURRENT_INTERACTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym38$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym47$SME_LEXIFICATION_WIZARD, $sym55$QUESTION_ANSWERING_AGENT_CLASS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4733L)
  public static SubLObject rkf_uia_sme_lexification_wizard_p(final SubLObject rkf_uia_sme_lexification_wizard)
  {
    return classes.subloop_instanceof_class( rkf_uia_sme_lexification_wizard, $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 4987L)
  public static SubLObject rkf_bb_question_answering_agent_display_question_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject proxy = sme_lexification_wizard.get_question_answering_agent_proxy( self );
    final SubLObject field_labels = sme_lexification_wizard.get_question_answering_agent_field_labels( self );
    final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices( self );
    final SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message( self );
    final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type( self );
    final SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip( self );
    final SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question( self );
    final SubLObject title = sme_lexification_wizard.get_question_answering_agent_title( self );
    SubLObject new_actions = NIL;
    new_actions = ConsesLow.cons( ConsesLow.list( $kw64$SHOW_TEXT, title ), new_actions );
    if( NIL != error_message )
    {
      new_actions = ConsesLow.cons( ConsesLow.list( $kw64$SHOW_TEXT, PrintLow.format( NIL, $str65$Error___a, error_message ) ), new_actions );
    }
    new_actions = ConsesLow.cons( ConsesLow.list( $kw64$SHOW_TEXT, v_question ), new_actions );
    if( NIL != tip && NIL != cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.getDynamicValue( thread ) )
    {
      new_actions = ConsesLow.cons( ConsesLow.list( $kw64$SHOW_TEXT, PrintLow.format( NIL, $str66$Tip___a, tip ) ), new_actions );
    }
    final SubLObject pcase_var = question_type;
    if( pcase_var.eql( $kw67$BOOLEAN ) )
    {
      final SubLObject negative = sme_lexification_wizard.question_answering_agent_negative_choice_method( self );
      final SubLObject positive = sme_lexification_wizard.question_answering_agent_positive_choice_method( self );
      new_actions = ConsesLow.cons( ConsesLow.list( $kw68$CHOOSE_ONE, $kw69$ANSWER, ConsesLow.list( $sym70$QUOTE, ConsesLow.list( negative, positive ) ) ), new_actions );
    }
    else if( pcase_var.eql( $kw71$ENUMERATED ) )
    {
      new_actions = ConsesLow.cons( ConsesLow.list( $kw68$CHOOSE_ONE, $kw69$ANSWER, choices ), new_actions );
    }
    else if( pcase_var.eql( $kw72$MULTIPLE_SELECTION ) )
    {
      new_actions = ConsesLow.cons( ConsesLow.list( $kw73$CHOOSE_MUTIPLE, $kw69$ANSWER, choices ), new_actions );
    }
    else if( pcase_var.eql( $kw74$FREE_FORM ) )
    {
      new_actions = ConsesLow.cons( $list75, new_actions );
    }
    else if( pcase_var.eql( $kw76$MULTIPLE_FREE_FORM ) )
    {
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Sequences.length( field_labels ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        new_actions = ConsesLow.cons( $list75, new_actions );
      }
    }
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str77$Adding_new_actions_____S__, Sequences.reverse( new_actions ) );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    methods.funcall_instance_method_with_1_args( proxy, $sym78$ADD_ACTIONS, Sequences.reverse( new_actions ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 7101L)
  public static SubLObject rkf_bb_question_answering_agent_get_response_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject proxy = sme_lexification_wizard.get_question_answering_agent_proxy( self );
    SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer( self );
    final SubLObject response = methods.funcall_instance_method_with_0_args( proxy, $sym82$GET_NEXT_RESPONSE );
    if( response.first() != $kw69$ANSWER )
    {
      if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
          .getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str83$Warning__, $str84$Unexpected_response_from_blackboa ), response );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      return NIL;
    }
    v_answer = conses_high.second( response );
    sme_lexification_wizard.set_question_answering_agent_answer( self, v_answer );
    methods.funcall_instance_method_with_1_args( self, $sym85$NOTIFY_CLIENT, $kw86$INPUT_READY );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 7671L)
  public static SubLObject sim_bb_question_answering_agent_display_question_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sim_bb_question_answering_agent_method = NIL;
    final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices( self );
    final SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message( self );
    final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type( self );
    final SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip( self );
    final SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question( self );
    final SubLObject title = sme_lexification_wizard.get_question_answering_agent_title( self );
    try
    {
      thread.throwStack.push( $sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        final SubLObject text_lines = ConsesLow.list( title, $str91$ );
        if( NIL != error_message )
        {
          ConsesLow.nconc( text_lines, ConsesLow.list( $str92$Error_, error_message, $str91$ ) );
        }
        ConsesLow.nconc( text_lines, ConsesLow.list( v_question, $str91$ ) );
        final SubLObject pcase_var = question_type;
        if( pcase_var.eql( $kw67$BOOLEAN ) )
        {
          ConsesLow.nconc( text_lines, ConsesLow.list( PrintLow.format( NIL, $str93$Answer___a__s___, sme_lexification_wizard.question_answering_agent_positive_choice_method( self ), sme_lexification_wizard
              .question_answering_agent_negative_choice_method( self ) ) ) );
        }
        else if( pcase_var.eql( $kw71$ENUMERATED ) )
        {
          ConsesLow.nconc( text_lines, conses_high.copy_list( choices ) );
          ConsesLow.nconc( text_lines, ConsesLow.list( PrintLow.format( NIL, $str94$Answer___a____a___, ONE_INTEGER, Sequences.length( choices ) ) ) );
        }
        else if( pcase_var.eql( $kw72$MULTIPLE_SELECTION ) )
        {
          ConsesLow.nconc( text_lines, conses_high.copy_list( choices ) );
          ConsesLow.nconc( text_lines, ConsesLow.list( PrintLow.format( NIL, $str95$Answer___a____a__including_ranges, ONE_INTEGER, Sequences.length( choices ) ) ) );
        }
        else if( pcase_var.eql( $kw74$FREE_FORM ) )
        {
          ConsesLow.nconc( text_lines, conses_high.copy_list( $list96 ) );
        }
        else if( pcase_var.eql( $kw76$MULTIPLE_FREE_FORM ) )
        {
          ConsesLow.nconc( text_lines, conses_high.copy_list( $list97 ) );
        }
        ConsesLow.nconc( text_lines, conses_high.copy_list( $list98 ) );
        if( NIL != tip && NIL != cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.getDynamicValue( thread ) )
        {
          ConsesLow.nconc( text_lines, ConsesLow.list( $str99$Tip_, $str91$, tip, $str91$ ) );
        }
        file_utilities.write_text_file( $blackboard_output_file$.getGlobalValue(), text_lines );
        file_utilities.append_text_file( $blackboard_log_file$.getGlobalValue(), text_lines );
        file_utilities.append_text_file( $blackboard_log_file$.getGlobalValue(), ConsesLow.list( $blackboard_input_delim$.getGlobalValue() ) );
        methods.funcall_instance_method_with_1_args( self, $sym85$NOTIFY_CLIENT, $kw100$OUTPUT_DONE );
        Dynamic.sublisp_throw( $sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sme_lexification_wizard.set_question_answering_agent_choices( self, choices );
          sme_lexification_wizard.set_question_answering_agent_error_message( self, error_message );
          sme_lexification_wizard.set_question_answering_agent_question_type( self, question_type );
          sme_lexification_wizard.set_question_answering_agent_tip( self, tip );
          sme_lexification_wizard.set_question_answering_agent_question( self, v_question );
          sme_lexification_wizard.set_question_answering_agent_title( self, title );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_sim_bb_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sim_bb_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 9483L)
  public static SubLObject sim_bb_question_answering_agent_get_response_method(final SubLObject self)
  {
    SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer( self );
    for( SubLObject timeout = $blackboard_timeout$.getGlobalValue(), delay = $blackboard_delay$.getGlobalValue(); NIL == Filesys.probe_file( $blackboard_input_file$.getGlobalValue() ) && timeout.numG(
        ZERO_INTEGER ); timeout = Numbers.subtract( timeout, delay ) )
    {
      Threads.sleep( delay );
    }
    if( NIL != Filesys.probe_file( $blackboard_input_file$.getGlobalValue() ) )
    {
      final SubLObject user_response = file_utilities.read_text_file( $blackboard_input_file$.getGlobalValue() );
      v_answer = file_utilities.read_text_file( $blackboard_input_file$.getGlobalValue() ).first();
      sme_lexification_wizard.set_question_answering_agent_answer( self, v_answer );
      Filesys.delete_file( $blackboard_input_file$.getGlobalValue() );
      file_utilities.append_text_file( $blackboard_log_file$.getGlobalValue(), user_response );
      file_utilities.append_text_file( $blackboard_log_file$.getGlobalValue(), ConsesLow.list( $blackboard_output_delim$.getGlobalValue() ) );
    }
    if( NIL != Filesys.probe_file( $blackboard_output_file$.getGlobalValue() ) )
    {
      Filesys.delete_file( $blackboard_output_file$.getGlobalValue() );
    }
    methods.funcall_instance_method_with_1_args( self, $sym85$NOTIFY_CLIENT, $kw86$INPUT_READY );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 10728L)
  public static SubLObject rkf_bb_proxy_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
    SubLObject responses = get_rkf_bb_proxy_responses( self );
    SubLObject pending_actions = get_rkf_bb_proxy_pending_actions( self );
    try
    {
      thread.throwStack.push( $sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
      try
      {
        sme_lexification_wizard.interface_proxy_initialize_method( self );
        pending_actions = NIL;
        responses = NIL;
        Dynamic.sublisp_throw( $sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_bb_proxy_responses( self, responses );
          set_rkf_bb_proxy_pending_actions( self, pending_actions );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_bb_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 11021L)
  public static SubLObject rkf_bb_proxy_get_pending_actions_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
    final SubLObject pending_actions = get_rkf_bb_proxy_pending_actions( self );
    try
    {
      thread.throwStack.push( $sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, pending_actions );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_bb_proxy_pending_actions( self, pending_actions );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_bb_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 11182L)
  public static SubLObject rkf_bb_proxy_add_actions_method(final SubLObject self, final SubLObject new_actions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
    SubLObject pending_actions = get_rkf_bb_proxy_pending_actions( self );
    try
    {
      thread.throwStack.push( $sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
      try
      {
        pending_actions = ConsesLow.append( pending_actions, new_actions );
        Dynamic.sublisp_throw( $sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, pending_actions );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_bb_proxy_pending_actions( self, pending_actions );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_bb_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 11507L)
  public static SubLObject rkf_bb_proxy_clear_actions_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
    SubLObject pending_actions = get_rkf_bb_proxy_pending_actions( self );
    try
    {
      thread.throwStack.push( $sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
      try
      {
        pending_actions = NIL;
        Dynamic.sublisp_throw( $sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, pending_actions );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_bb_proxy_pending_actions( self, pending_actions );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_bb_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 11786L)
  public static SubLObject rkf_bb_proxy_add_user_response_method(final SubLObject self, final SubLObject new_response)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
    SubLObject responses = get_rkf_bb_proxy_responses( self );
    try
    {
      thread.throwStack.push( $sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
      try
      {
        responses = ConsesLow.append( responses, ConsesLow.list( new_response ) );
        Dynamic.sublisp_throw( $sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, responses );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_bb_proxy_responses( self, responses );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_bb_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 12018L)
  public static SubLObject rkf_bb_proxy_get_next_response_method(final SubLObject self)
  {
    SubLObject responses = get_rkf_bb_proxy_responses( self );
    final SubLObject response = responses.first();
    responses = responses.rest();
    set_rkf_bb_proxy_responses( self, responses );
    return response;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 12314L)
  public static SubLObject rkf_bb_proxy_clear_responses_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
    SubLObject responses = get_rkf_bb_proxy_responses( self );
    try
    {
      thread.throwStack.push( $sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
      try
      {
        responses = NIL;
        Dynamic.sublisp_throw( $sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, responses );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_bb_proxy_responses( self, responses );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_bb_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 12583L)
  public static SubLObject rkf_uia_proxy_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
    SubLObject interaction = get_rkf_uia_proxy_interaction( self );
    try
    {
      thread.throwStack.push( $sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
      try
      {
        sme_lexification_wizard.interface_proxy_initialize_method( self );
        interaction = NIL;
        Dynamic.sublisp_throw( $sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_uia_proxy_interaction( self, interaction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_uia_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 12863L)
  public static SubLObject rkf_uia_proxy_create_constant_method(final SubLObject self, final SubLObject constant_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
    final SubLObject interaction = get_rkf_uia_proxy_interaction( self );
    try
    {
      thread.throwStack.push( $sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
      try
      {
        SubLObject constant = NIL;
        constant = ke.ke_create_now( constant_name, UNPROVIDED );
        Dynamic.sublisp_throw( $sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, constant );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_uia_proxy_interaction( self, interaction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_uia_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 13344L)
  public static SubLObject rkf_uia_proxy_describe_term_method(final SubLObject self, final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
    final SubLObject interaction = get_rkf_uia_proxy_interaction( self );
    try
    {
      thread.throwStack.push( $sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_describe_term_method( self, v_term ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_uia_proxy_interaction( self, interaction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_uia_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 13620L)
  public static SubLObject rkf_uia_proxy_resolve_term_method(final SubLObject self, final SubLObject term_label)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
    final SubLObject interaction = get_rkf_uia_proxy_interaction( self );
    try
    {
      thread.throwStack.push( $sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_resolve_term_method( self, term_label ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_uia_proxy_interaction( self, interaction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_uia_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 14065L)
  public static SubLObject rkf_uia_proxy_mumble_method(final SubLObject self, final SubLObject message)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
    final SubLObject interaction = get_rkf_uia_proxy_interaction( self );
    try
    {
      thread.throwStack.push( $sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_mumble_method( self, message ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_uia_proxy_interaction( self, interaction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_uia_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 14399L)
  public static SubLObject rkf_uia_proxy_forge_aheadP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
    final SubLObject interaction = get_rkf_uia_proxy_interaction( self );
    try
    {
      thread.throwStack.push( $sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_forge_aheadP_method( self ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_uia_proxy_interaction( self, interaction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_uia_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 14766L)
  public static SubLObject rkf_uia_proxy_end_session_method(final SubLObject self)
  {
    rkf_uia_proxy_end_interaction_method( self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 15004L)
  public static SubLObject rkf_uia_proxy_get_interaction_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
    final SubLObject interaction = get_rkf_uia_proxy_interaction( self );
    try
    {
      thread.throwStack.push( $sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, interaction );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_uia_proxy_interaction( self, interaction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_uia_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 15132L)
  public static SubLObject rkf_uia_proxy_set_interaction_method(final SubLObject self, final SubLObject new_interaction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
    SubLObject interaction = get_rkf_uia_proxy_interaction( self );
    try
    {
      thread.throwStack.push( $sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
      try
      {
        interaction = new_interaction;
        Dynamic.sublisp_throw( $sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_uia_proxy_interaction( self, interaction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_uia_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 15302L)
  public static SubLObject rkf_uia_proxy_end_interaction_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
    final SubLObject interaction = get_rkf_uia_proxy_interaction( self );
    try
    {
      thread.throwStack.push( $sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
      try
      {
        if( NIL != interaction )
        {
        }
        pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_rkf_uia_proxy_interaction( self, interaction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable( ccatch_env_var, $sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_uia_proxy_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 15746L)
  public static SubLObject rkf_bb_sme_lexification_wizard_initialize_method(final SubLObject self)
  {
    SubLObject question_answering_agent_class = sme_lexification_wizard.get_sme_lexification_wizard_question_answering_agent_class( self );
    SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy( self );
    sme_lexification_wizard.sme_lexification_wizard_initialize_method( self );
    proxy = methods.funcall_class_method_with_0_args( $sym6$RKF_BB_PROXY, $sym177$NEW );
    sme_lexification_wizard.set_sme_lexification_wizard_proxy( self, proxy );
    if( NIL != $simulated_blackboardP$.getGlobalValue() )
    {
      question_answering_agent_class = $sym43$SIM_BB_QUESTION_ANSWERING_AGENT;
      sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class( self, question_answering_agent_class );
    }
    else
    {
      question_answering_agent_class = $sym22$RKF_BB_QUESTION_ANSWERING_AGENT;
      sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class( self, question_answering_agent_class );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 16368L)
  public static SubLObject rkf_bb_sme_lexification_wizard_get_pending_actions_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_bb_sme_lexification_wizard_method = NIL;
    final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy( self );
    try
    {
      thread.throwStack.push( $sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD, methods.funcall_instance_method_with_0_args( proxy, $sym109$GET_PENDING_ACTIONS ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sme_lexification_wizard.set_sme_lexification_wizard_proxy( self, proxy );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_bb_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_bb_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 16585L)
  public static SubLObject rkf_bb_sme_lexification_wizard_clear_pending_actions_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_bb_sme_lexification_wizard_method = NIL;
    final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy( self );
    try
    {
      thread.throwStack.push( $sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        methods.funcall_instance_method_with_0_args( proxy, $sym117$CLEAR_ACTIONS );
        Dynamic.sublisp_throw( $sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sme_lexification_wizard.set_sme_lexification_wizard_proxy( self, proxy );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_bb_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_bb_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 16803L)
  public static SubLObject rkf_bb_sme_lexification_wizard_set_user_response_method(final SubLObject self, final SubLObject response)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy( self );
    final SubLObject new_current_interaction = sme_lexification_wizard.get_sme_lexification_wizard_new_current_interaction( self );
    SubLObject current_interaction = sme_lexification_wizard.get_sme_lexification_wizard_current_interaction( self );
    methods.funcall_instance_method_with_1_args( proxy, $sym121$ADD_USER_RESPONSE, response );
    if( !current_interaction.eql( new_current_interaction ) )
    {
      if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
          .getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str83$Warning__, $str189$Issuing_shameless_hack_updating_c ) );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      current_interaction = new_current_interaction;
      sme_lexification_wizard.set_sme_lexification_wizard_current_interaction( self, current_interaction );
    }
    if( NIL != current_interaction )
    {
      methods.funcall_instance_method_with_1_args( current_interaction, $sym190$PROCESS_STATUS_UPDATE, $kw100$OUTPUT_DONE );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 17704L)
  public static SubLObject rkf_bb_sme_lexification_wizard_clear_user_responses_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_bb_sme_lexification_wizard_method = NIL;
    final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy( self );
    try
    {
      thread.throwStack.push( $sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        methods.funcall_instance_method_with_0_args( proxy, $sym128$CLEAR_RESPONSES );
        Dynamic.sublisp_throw( $sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sme_lexification_wizard.set_sme_lexification_wizard_proxy( self, proxy );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_bb_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_bb_sme_lexification_wizard_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 17923L)
  public static SubLObject rkf_uia_sme_lexification_wizard_initialize_method(final SubLObject self)
  {
    SubLObject question_answering_agent_class = sme_lexification_wizard.get_sme_lexification_wizard_question_answering_agent_class( self );
    SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy( self );
    sme_lexification_wizard.sme_lexification_wizard_initialize_method( self );
    proxy = methods.funcall_class_method_with_0_args( $sym17$RKF_UIA_PROXY, $sym177$NEW );
    sme_lexification_wizard.set_sme_lexification_wizard_proxy( self, proxy );
    question_answering_agent_class = $sym197$UIA_HTML_QUESTION_ANSWERING_AGENT;
    sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class( self, question_answering_agent_class );
    sme_lexification_wizard.$use_inferred_phrasesP$.setGlobalValue( T );
    cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.setDynamicValue( NIL );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-sme-lexification-wizard.lisp", position = 18634L)
  public static SubLObject rkf_uia_sme_lexification_wizard_set_interaction_method(final SubLObject self, final SubLObject new_interaction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_rkf_uia_sme_lexification_wizard_method = NIL;
    final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy( self );
    try
    {
      thread.throwStack.push( $sym201$OUTER_CATCH_FOR_RKF_UIA_SME_LEXIFICATION_WIZARD_METHOD );
      try
      {
        if( NIL != proxy )
        {
          methods.funcall_instance_method_with_1_args( proxy, $sym166$SET_INTERACTION, new_interaction );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sme_lexification_wizard.set_sme_lexification_wizard_proxy( self, proxy );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_rkf_uia_sme_lexification_wizard_method = Errors.handleThrowable( ccatch_env_var, $sym201$OUTER_CATCH_FOR_RKF_UIA_SME_LEXIFICATION_WIZARD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_rkf_uia_sme_lexification_wizard_method;
  }

  public static SubLObject declare_rkf_sme_lexification_wizard_file()
  {
    SubLFiles.declareFunction( me, "get_rkf_bb_proxy_responses", "GET-RKF-BB-PROXY-RESPONSES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rkf_bb_proxy_responses", "SET-RKF-BB-PROXY-RESPONSES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_rkf_bb_proxy_pending_actions", "GET-RKF-BB-PROXY-PENDING-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rkf_bb_proxy_pending_actions", "SET-RKF-BB-PROXY-PENDING-ACTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rkf_bb_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rkf_bb_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_proxy_p", "RKF-BB-PROXY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_rkf_uia_proxy_interaction", "GET-RKF-UIA-PROXY-INTERACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_rkf_uia_proxy_interaction", "SET-RKF-UIA-PROXY-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rkf_uia_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rkf_uia_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_p", "RKF-UIA-PROXY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rkf_bb_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rkf_bb_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_question_answering_agent_p", "RKF-BB-QUESTION-ANSWERING-AGENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sim_bb_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sim_bb_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sim_bb_question_answering_agent_p", "SIM-BB-QUESTION-ANSWERING-AGENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_sme_lexification_wizard_p", "RKF-BB-SME-LEXIFICATION-WIZARD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_sme_lexification_wizard_p", "RKF-UIA-SME-LEXIFICATION-WIZARD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_question_answering_agent_display_question_method", "RKF-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_question_answering_agent_get_response_method", "RKF-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sim_bb_question_answering_agent_display_question_method", "SIM-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sim_bb_question_answering_agent_get_response_method", "SIM-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_proxy_initialize_method", "RKF-BB-PROXY-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_proxy_get_pending_actions_method", "RKF-BB-PROXY-GET-PENDING-ACTIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_proxy_add_actions_method", "RKF-BB-PROXY-ADD-ACTIONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_proxy_clear_actions_method", "RKF-BB-PROXY-CLEAR-ACTIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_proxy_add_user_response_method", "RKF-BB-PROXY-ADD-USER-RESPONSE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_proxy_get_next_response_method", "RKF-BB-PROXY-GET-NEXT-RESPONSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_proxy_clear_responses_method", "RKF-BB-PROXY-CLEAR-RESPONSES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_initialize_method", "RKF-UIA-PROXY-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_create_constant_method", "RKF-UIA-PROXY-CREATE-CONSTANT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_describe_term_method", "RKF-UIA-PROXY-DESCRIBE-TERM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_resolve_term_method", "RKF-UIA-PROXY-RESOLVE-TERM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_mumble_method", "RKF-UIA-PROXY-MUMBLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_forge_aheadP_method", "RKF-UIA-PROXY-FORGE-AHEAD?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_end_session_method", "RKF-UIA-PROXY-END-SESSION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_get_interaction_method", "RKF-UIA-PROXY-GET-INTERACTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_set_interaction_method", "RKF-UIA-PROXY-SET-INTERACTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_proxy_end_interaction_method", "RKF-UIA-PROXY-END-INTERACTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_sme_lexification_wizard_initialize_method", "RKF-BB-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_sme_lexification_wizard_get_pending_actions_method", "RKF-BB-SME-LEXIFICATION-WIZARD-GET-PENDING-ACTIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_sme_lexification_wizard_clear_pending_actions_method", "RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-PENDING-ACTIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_sme_lexification_wizard_set_user_response_method", "RKF-BB-SME-LEXIFICATION-WIZARD-SET-USER-RESPONSE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_bb_sme_lexification_wizard_clear_user_responses_method", "RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-USER-RESPONSES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_sme_lexification_wizard_initialize_method", "RKF-UIA-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_uia_sme_lexification_wizard_set_interaction_method", "RKF-UIA-SME-LEXIFICATION-WIZARD-SET-INTERACTION-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_sme_lexification_wizard_file()
  {
    $simulated_blackboardP$ = SubLFiles.deflexical( "*SIMULATED-BLACKBOARD?*", NIL );
    $blackboard_input_file$ = SubLFiles.deflexical( "*BLACKBOARD-INPUT-FILE*", $str0$_tmp_blackboard_input_text );
    $blackboard_output_file$ = SubLFiles.deflexical( "*BLACKBOARD-OUTPUT-FILE*", $str1$_tmp_blackboard_output_text );
    $blackboard_log_file$ = SubLFiles.deflexical( "*BLACKBOARD-LOG-FILE*", $str2$_tmp_blackboard_log_text );
    $blackboard_input_delim$ = SubLFiles.deflexical( "*BLACKBOARD-INPUT-DELIM*", $str3$_________________________________ );
    $blackboard_output_delim$ = SubLFiles.deflexical( "*BLACKBOARD-OUTPUT-DELIM*", $str4$_________________________________ );
    $blackboard_delay$ = SubLFiles.deflexical( "*BLACKBOARD-DELAY*", TEN_INTEGER );
    $blackboard_timeout$ = SubLFiles.deflexical( "*BLACKBOARD-TIMEOUT*", $int5$600 );
    return NIL;
  }

  public static SubLObject setup_rkf_sme_lexification_wizard_file()
  {
    classes.subloop_new_class( $sym6$RKF_BB_PROXY, $sym7$INTERFACE_PROXY, NIL, NIL, $list8 );
    classes.class_set_implements_slot_listeners( $sym6$RKF_BB_PROXY, NIL );
    classes.subloop_note_class_initialization_function( $sym6$RKF_BB_PROXY, $sym13$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym6$RKF_BB_PROXY, $sym16$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_INSTANCE );
    subloop_reserved_initialize_rkf_bb_proxy_class( $sym6$RKF_BB_PROXY );
    classes.subloop_new_class( $sym17$RKF_UIA_PROXY, $sym7$INTERFACE_PROXY, NIL, NIL, $list18 );
    classes.class_set_implements_slot_listeners( $sym17$RKF_UIA_PROXY, NIL );
    classes.subloop_note_class_initialization_function( $sym17$RKF_UIA_PROXY, $sym20$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym17$RKF_UIA_PROXY, $sym21$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_INSTANCE );
    subloop_reserved_initialize_rkf_uia_proxy_class( $sym17$RKF_UIA_PROXY );
    classes.subloop_new_class( $sym22$RKF_BB_QUESTION_ANSWERING_AGENT, $sym23$QUESTION_ANSWERING_AGENT, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym22$RKF_BB_QUESTION_ANSWERING_AGENT, NIL );
    classes.subloop_note_class_initialization_function( $sym22$RKF_BB_QUESTION_ANSWERING_AGENT, $sym24$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym22$RKF_BB_QUESTION_ANSWERING_AGENT, $sym42$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_INSTA );
    subloop_reserved_initialize_rkf_bb_question_answering_agent_class( $sym22$RKF_BB_QUESTION_ANSWERING_AGENT );
    classes.subloop_new_class( $sym43$SIM_BB_QUESTION_ANSWERING_AGENT, $sym23$QUESTION_ANSWERING_AGENT, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym43$SIM_BB_QUESTION_ANSWERING_AGENT, NIL );
    classes.subloop_note_class_initialization_function( $sym43$SIM_BB_QUESTION_ANSWERING_AGENT, $sym44$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym43$SIM_BB_QUESTION_ANSWERING_AGENT, $sym45$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_INSTA );
    subloop_reserved_initialize_sim_bb_question_answering_agent_class( $sym43$SIM_BB_QUESTION_ANSWERING_AGENT );
    classes.subloop_new_class( $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $sym47$SME_LEXIFICATION_WIZARD, NIL, NIL, $list48 );
    classes.class_set_implements_slot_listeners( $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, NIL );
    classes.subloop_note_class_initialization_function( $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $sym49$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_CLASS );
    classes.subloop_note_instance_initialization_function( $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $sym56$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_INSTAN );
    subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_class( $sym46$RKF_BB_SME_LEXIFICATION_WIZARD );
    classes.subloop_new_class( $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, $sym47$SME_LEXIFICATION_WIZARD, NIL, NIL, $list58 );
    classes.class_set_implements_slot_listeners( $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, NIL );
    classes.subloop_note_class_initialization_function( $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, $sym59$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_CLASS );
    classes.subloop_note_instance_initialization_function( $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, $sym60$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_INSTA );
    subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_class( $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD );
    methods.methods_incorporate_instance_method( $sym61$DISPLAY_QUESTION, $sym22$RKF_BB_QUESTION_ANSWERING_AGENT, $list62, NIL, $list63 );
    methods.subloop_register_instance_method( $sym22$RKF_BB_QUESTION_ANSWERING_AGENT, $sym61$DISPLAY_QUESTION, $sym79$RKF_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD );
    methods.methods_incorporate_instance_method( $sym80$GET_RESPONSE, $sym22$RKF_BB_QUESTION_ANSWERING_AGENT, $list62, NIL, $list81 );
    methods.subloop_register_instance_method( $sym22$RKF_BB_QUESTION_ANSWERING_AGENT, $sym80$GET_RESPONSE, $sym87$RKF_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD );
    methods.methods_incorporate_instance_method( $sym61$DISPLAY_QUESTION, $sym43$SIM_BB_QUESTION_ANSWERING_AGENT, $list88, NIL, $list89 );
    methods.subloop_register_instance_method( $sym43$SIM_BB_QUESTION_ANSWERING_AGENT, $sym61$DISPLAY_QUESTION, $sym101$SIM_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD );
    methods.methods_incorporate_instance_method( $sym80$GET_RESPONSE, $sym43$SIM_BB_QUESTION_ANSWERING_AGENT, $list62, NIL, $list102 );
    methods.subloop_register_instance_method( $sym43$SIM_BB_QUESTION_ANSWERING_AGENT, $sym80$GET_RESPONSE, $sym103$SIM_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD );
    methods.methods_incorporate_instance_method( $sym104$INITIALIZE, $sym6$RKF_BB_PROXY, $list105, NIL, $list106 );
    methods.subloop_register_instance_method( $sym6$RKF_BB_PROXY, $sym104$INITIALIZE, $sym108$RKF_BB_PROXY_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym109$GET_PENDING_ACTIONS, $sym6$RKF_BB_PROXY, $list88, NIL, $list110 );
    methods.subloop_register_instance_method( $sym6$RKF_BB_PROXY, $sym109$GET_PENDING_ACTIONS, $sym112$RKF_BB_PROXY_GET_PENDING_ACTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym78$ADD_ACTIONS, $sym6$RKF_BB_PROXY, $list88, $list113, $list114 );
    methods.subloop_register_instance_method( $sym6$RKF_BB_PROXY, $sym78$ADD_ACTIONS, $sym116$RKF_BB_PROXY_ADD_ACTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym117$CLEAR_ACTIONS, $sym6$RKF_BB_PROXY, $list88, NIL, $list118 );
    methods.subloop_register_instance_method( $sym6$RKF_BB_PROXY, $sym117$CLEAR_ACTIONS, $sym120$RKF_BB_PROXY_CLEAR_ACTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym121$ADD_USER_RESPONSE, $sym6$RKF_BB_PROXY, $list88, $list122, $list123 );
    methods.subloop_register_instance_method( $sym6$RKF_BB_PROXY, $sym121$ADD_USER_RESPONSE, $sym125$RKF_BB_PROXY_ADD_USER_RESPONSE_METHOD );
    methods.methods_incorporate_instance_method( $sym82$GET_NEXT_RESPONSE, $sym6$RKF_BB_PROXY, $list62, NIL, $list126 );
    methods.subloop_register_instance_method( $sym6$RKF_BB_PROXY, $sym82$GET_NEXT_RESPONSE, $sym127$RKF_BB_PROXY_GET_NEXT_RESPONSE_METHOD );
    methods.methods_incorporate_instance_method( $sym128$CLEAR_RESPONSES, $sym6$RKF_BB_PROXY, $list88, NIL, $list129 );
    methods.subloop_register_instance_method( $sym6$RKF_BB_PROXY, $sym128$CLEAR_RESPONSES, $sym131$RKF_BB_PROXY_CLEAR_RESPONSES_METHOD );
    methods.methods_incorporate_instance_method( $sym104$INITIALIZE, $sym17$RKF_UIA_PROXY, $list105, NIL, $list132 );
    methods.subloop_register_instance_method( $sym17$RKF_UIA_PROXY, $sym104$INITIALIZE, $sym134$RKF_UIA_PROXY_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym135$CREATE_CONSTANT, $sym17$RKF_UIA_PROXY, $list105, $list136, $list137 );
    methods.subloop_register_instance_method( $sym17$RKF_UIA_PROXY, $sym135$CREATE_CONSTANT, $sym139$RKF_UIA_PROXY_CREATE_CONSTANT_METHOD );
    methods.methods_incorporate_instance_method( $sym140$DESCRIBE_TERM, $sym17$RKF_UIA_PROXY, $list105, $list141, $list142 );
    methods.subloop_register_instance_method( $sym17$RKF_UIA_PROXY, $sym140$DESCRIBE_TERM, $sym144$RKF_UIA_PROXY_DESCRIBE_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym145$RESOLVE_TERM, $sym17$RKF_UIA_PROXY, $list105, $list146, $list147 );
    methods.subloop_register_instance_method( $sym17$RKF_UIA_PROXY, $sym145$RESOLVE_TERM, $sym149$RKF_UIA_PROXY_RESOLVE_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym150$MUMBLE, $sym17$RKF_UIA_PROXY, $list88, $list151, $list152 );
    methods.subloop_register_instance_method( $sym17$RKF_UIA_PROXY, $sym150$MUMBLE, $sym154$RKF_UIA_PROXY_MUMBLE_METHOD );
    methods.methods_incorporate_instance_method( $sym155$FORGE_AHEAD_, $sym17$RKF_UIA_PROXY, $list88, NIL, $list156 );
    methods.subloop_register_instance_method( $sym17$RKF_UIA_PROXY, $sym155$FORGE_AHEAD_, $sym158$RKF_UIA_PROXY_FORGE_AHEAD__METHOD );
    methods.methods_incorporate_instance_method( $sym159$END_SESSION, $sym17$RKF_UIA_PROXY, $list105, NIL, $list160 );
    methods.subloop_register_instance_method( $sym17$RKF_UIA_PROXY, $sym159$END_SESSION, $sym161$RKF_UIA_PROXY_END_SESSION_METHOD );
    methods.methods_incorporate_instance_method( $sym162$GET_INTERACTION, $sym17$RKF_UIA_PROXY, $list88, NIL, $list163 );
    methods.subloop_register_instance_method( $sym17$RKF_UIA_PROXY, $sym162$GET_INTERACTION, $sym165$RKF_UIA_PROXY_GET_INTERACTION_METHOD );
    methods.methods_incorporate_instance_method( $sym166$SET_INTERACTION, $sym17$RKF_UIA_PROXY, $list88, $list167, $list168 );
    methods.subloop_register_instance_method( $sym17$RKF_UIA_PROXY, $sym166$SET_INTERACTION, $sym170$RKF_UIA_PROXY_SET_INTERACTION_METHOD );
    methods.methods_incorporate_instance_method( $sym171$END_INTERACTION, $sym17$RKF_UIA_PROXY, $list88, NIL, $list172 );
    methods.subloop_register_instance_method( $sym17$RKF_UIA_PROXY, $sym171$END_INTERACTION, $sym174$RKF_UIA_PROXY_END_INTERACTION_METHOD );
    methods.methods_incorporate_instance_method( $sym104$INITIALIZE, $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $list175, NIL, $list176 );
    methods.subloop_register_instance_method( $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $sym104$INITIALIZE, $sym178$RKF_BB_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym109$GET_PENDING_ACTIONS, $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $list105, NIL, $list179 );
    methods.subloop_register_instance_method( $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $sym109$GET_PENDING_ACTIONS, $sym181$RKF_BB_SME_LEXIFICATION_WIZARD_GET_PENDING_ACTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym182$CLEAR_PENDING_ACTIONS, $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $list88, NIL, $list183 );
    methods.subloop_register_instance_method( $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $sym182$CLEAR_PENDING_ACTIONS, $sym185$RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_PENDING_ACTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym186$SET_USER_RESPONSE, $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $list175, $list187, $list188 );
    methods.subloop_register_instance_method( $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $sym186$SET_USER_RESPONSE, $sym191$RKF_BB_SME_LEXIFICATION_WIZARD_SET_USER_RESPONSE_METHOD );
    methods.methods_incorporate_instance_method( $sym192$CLEAR_USER_RESPONSES, $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $list88, NIL, $list193 );
    methods.subloop_register_instance_method( $sym46$RKF_BB_SME_LEXIFICATION_WIZARD, $sym192$CLEAR_USER_RESPONSES, $sym195$RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_USER_RESPONSES_METHOD );
    methods.methods_incorporate_instance_method( $sym104$INITIALIZE, $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, $list175, NIL, $list196 );
    methods.subloop_register_instance_method( $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, $sym104$INITIALIZE, $sym198$RKF_UIA_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym166$SET_INTERACTION, $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, $list199, $list167, $list200 );
    methods.subloop_register_instance_method( $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD, $sym166$SET_INTERACTION, $sym202$RKF_UIA_SME_LEXIFICATION_WIZARD_SET_INTERACTION_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_sme_lexification_wizard_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_sme_lexification_wizard_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_sme_lexification_wizard_file();
  }
  static
  {
    me = new rkf_sme_lexification_wizard();
    $simulated_blackboardP$ = null;
    $blackboard_input_file$ = null;
    $blackboard_output_file$ = null;
    $blackboard_log_file$ = null;
    $blackboard_input_delim$ = null;
    $blackboard_output_delim$ = null;
    $blackboard_delay$ = null;
    $blackboard_timeout$ = null;
    $str0$_tmp_blackboard_input_text = makeString( "/tmp/blackboard-input.text" );
    $str1$_tmp_blackboard_output_text = makeString( "/tmp/blackboard-output.text" );
    $str2$_tmp_blackboard_log_text = makeString( "/tmp/blackboard-log.text" );
    $str3$_________________________________ = makeString( "........................................................................" );
    $str4$_________________________________ = makeString( "------------------------------------------------------------------------" );
    $int5$600 = makeInteger( 600 );
    $sym6$RKF_BB_PROXY = makeSymbol( "RKF-BB-PROXY" );
    $sym7$INTERFACE_PROXY = makeSymbol( "INTERFACE-PROXY" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "PENDING-ACTIONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "RESPONSES" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PENDING-ACTIONS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "ADD-ACTIONS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR-ACTIONS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-USER-RESPONSE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NEXT-RESPONSE" ), NIL, makeKeyword(
                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR-RESPONSES" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym9$RESPONSES = makeSymbol( "RESPONSES" );
    $sym10$PENDING_ACTIONS = makeSymbol( "PENDING-ACTIONS" );
    $sym11$OBJECT = makeSymbol( "OBJECT" );
    $sym12$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym13$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-CLASS" );
    $sym14$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym15$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym16$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-INSTANCE" );
    $sym17$RKF_UIA_PROXY = makeSymbol( "RKF-UIA-PROXY" );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "INTERACTION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INTERACTION" ),
        NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INTERACTION" ), ConsesLow.list( makeSymbol( "INTERACTION" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "END-INTERACTION" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym19$INTERACTION = makeSymbol( "INTERACTION" );
    $sym20$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-CLASS" );
    $sym21$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-INSTANCE" );
    $sym22$RKF_BB_QUESTION_ANSWERING_AGENT = makeSymbol( "RKF-BB-QUESTION-ANSWERING-AGENT" );
    $sym23$QUESTION_ANSWERING_AGENT = makeSymbol( "QUESTION-ANSWERING-AGENT" );
    $sym24$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-CLASS" );
    $sym25$ID = makeSymbol( "ID" );
    $sym26$TITLE = makeSymbol( "TITLE" );
    $sym27$QUESTION = makeSymbol( "QUESTION" );
    $sym28$TIP = makeSymbol( "TIP" );
    $sym29$QUESTION_TYPE = makeSymbol( "QUESTION-TYPE" );
    $sym30$ERROR_MESSAGE = makeSymbol( "ERROR-MESSAGE" );
    $sym31$CHOICES = makeSymbol( "CHOICES" );
    $sym32$DESCRIPTIONS = makeSymbol( "DESCRIPTIONS" );
    $sym33$VALUES = makeSymbol( "VALUES" );
    $sym34$DEFAULT = makeSymbol( "DEFAULT" );
    $sym35$ANSWER = makeSymbol( "ANSWER" );
    $sym36$FIELD_WIDTH = makeSymbol( "FIELD-WIDTH" );
    $sym37$FIELD_LABELS = makeSymbol( "FIELD-LABELS" );
    $sym38$PROXY = makeSymbol( "PROXY" );
    $sym39$CALLBACK_FUNCTION = makeSymbol( "CALLBACK-FUNCTION" );
    $sym40$CLIENT_DATA = makeSymbol( "CLIENT-DATA" );
    $sym41$USER_DATA = makeSymbol( "USER-DATA" );
    $sym42$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_INSTA = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-INSTANCE" );
    $sym43$SIM_BB_QUESTION_ANSWERING_AGENT = makeSymbol( "SIM-BB-QUESTION-ANSWERING-AGENT" );
    $sym44$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-CLASS" );
    $sym45$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_INSTA = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-INSTANCE" );
    $sym46$RKF_BB_SME_LEXIFICATION_WIZARD = makeSymbol( "RKF-BB-SME-LEXIFICATION-WIZARD" );
    $sym47$SME_LEXIFICATION_WIZARD = makeSymbol( "SME-LEXIFICATION-WIZARD" );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PENDING-ACTIONS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "CLEAR-PENDING-ACTIONS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-USER-RESPONSE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR-USER-RESPONSES" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym49$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-CLASS" );
    $sym50$STATE = makeSymbol( "STATE" );
    $sym51$NEXT_STATES = makeSymbol( "NEXT-STATES" );
    $sym52$LEXWIZ_PARAMETERS = makeSymbol( "LEXWIZ-PARAMETERS" );
    $sym53$CURRENT_INTERACTION = makeSymbol( "CURRENT-INTERACTION" );
    $sym54$NEW_CURRENT_INTERACTION = makeSymbol( "NEW-CURRENT-INTERACTION" );
    $sym55$QUESTION_ANSWERING_AGENT_CLASS = makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" );
    $sym56$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_INSTAN = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-INSTANCE" );
    $sym57$RKF_UIA_SME_LEXIFICATION_WIZARD = makeSymbol( "RKF-UIA-SME-LEXIFICATION-WIZARD" );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INTERACTION" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym59$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-CLASS" );
    $sym60$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_INSTA = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-INSTANCE" );
    $sym61$DISPLAY_QUESTION = makeSymbol( "DISPLAY-QUESTION" );
    $list62 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ), makeKeyword( "PUBLIC" ) );
    $list63 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "NEW-ACTIONS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ),
        makeKeyword( "SHOW-TEXT" ), makeSymbol( "TITLE" ) ), makeSymbol( "NEW-ACTIONS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
            makeSymbol( "BQ-LIST" ), makeKeyword( "SHOW-TEXT" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Error: ~a" ), makeSymbol( "ERROR-MESSAGE" ) ) ), makeSymbol( "NEW-ACTIONS" ) ) ), ConsesLow.list(
                makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeKeyword( "SHOW-TEXT" ), makeSymbol( "QUESTION" ) ), makeSymbol( "NEW-ACTIONS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                    .list( makeSymbol( "CAND" ), makeSymbol( "TIP" ), makeSymbol( "*SME-LEXWIZ-VERBOSE?*" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeKeyword( "SHOW-TEXT" ),
                        ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Tip: ~a" ), makeSymbol( "TIP" ) ) ), makeSymbol( "NEW-ACTIONS" ) ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol(
                            "QUESTION-TYPE" ), ConsesLow.list( makeKeyword( "BOOLEAN" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEGATIVE" ), ConsesLow.list( makeSymbol(
                                "NEGATIVE-CHOICE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "POSITIVE" ), ConsesLow.list( makeSymbol( "POSITIVE-CHOICE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
                                    makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeKeyword( "CHOOSE-ONE" ), makeKeyword( "ANSWER" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list(
                                        makeSymbol( "QUOTE" ), makeSymbol( "QUOTE" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "NEGATIVE" ), makeSymbol( "POSITIVE" ) ) ) ), makeSymbol(
                                            "NEW-ACTIONS" ) ) ) ), ConsesLow.list( makeKeyword( "ENUMERATED" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeKeyword( "CHOOSE-ONE" ),
                                                makeKeyword( "ANSWER" ), makeSymbol( "CHOICES" ) ), makeSymbol( "NEW-ACTIONS" ) ) ), ConsesLow.list( makeKeyword( "MULTIPLE-SELECTION" ), ConsesLow.list( makeSymbol(
                                                    "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeKeyword( "CHOOSE-MUTIPLE" ), makeKeyword( "ANSWER" ), makeSymbol( "CHOICES" ) ), makeSymbol(
                                                        "NEW-ACTIONS" ) ) ), ConsesLow.list( makeKeyword( "FREE-FORM" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
                                                            makeKeyword( "ENTER-TEXT" ), makeKeyword( "ANSWER" ) ) ), makeSymbol( "NEW-ACTIONS" ) ) ), ConsesLow.list( makeKeyword( "MULTIPLE-FREE-FORM" ), ConsesLow.list(
                                                                makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "I" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "FIELD-LABELS" ) ) ), ConsesLow.list(
                                                                    makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "ENTER-TEXT" ), makeKeyword( "ANSWER" ) ) ), makeSymbol(
                                                                        "NEW-ACTIONS" ) ) ) ) ), ConsesLow.list( makeSymbol( "LEX-DEBUG-OUT" ), makeString( "Adding new actions: ~%~S~%" ), ConsesLow.list( makeSymbol(
                                                                            "REVERSE" ), makeSymbol( "NEW-ACTIONS" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow.list(
                                                                                makeSymbol( "QUOTE" ), makeSymbol( "ADD-ACTIONS" ) ), ConsesLow.list( makeSymbol( "REVERSE" ), makeSymbol( "NEW-ACTIONS" ) ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $kw64$SHOW_TEXT = makeKeyword( "SHOW-TEXT" );
    $str65$Error___a = makeString( "Error: ~a" );
    $str66$Tip___a = makeString( "Tip: ~a" );
    $kw67$BOOLEAN = makeKeyword( "BOOLEAN" );
    $kw68$CHOOSE_ONE = makeKeyword( "CHOOSE-ONE" );
    $kw69$ANSWER = makeKeyword( "ANSWER" );
    $sym70$QUOTE = makeSymbol( "QUOTE" );
    $kw71$ENUMERATED = makeKeyword( "ENUMERATED" );
    $kw72$MULTIPLE_SELECTION = makeKeyword( "MULTIPLE-SELECTION" );
    $kw73$CHOOSE_MUTIPLE = makeKeyword( "CHOOSE-MUTIPLE" );
    $kw74$FREE_FORM = makeKeyword( "FREE-FORM" );
    $list75 = ConsesLow.list( makeKeyword( "ENTER-TEXT" ), makeKeyword( "ANSWER" ) );
    $kw76$MULTIPLE_FREE_FORM = makeKeyword( "MULTIPLE-FREE-FORM" );
    $str77$Adding_new_actions_____S__ = makeString( "Adding new actions: ~%~S~%" );
    $sym78$ADD_ACTIONS = makeSymbol( "ADD-ACTIONS" );
    $sym79$RKF_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = makeSymbol( "RKF-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD" );
    $sym80$GET_RESPONSE = makeSymbol( "GET-RESPONSE" );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESPONSE" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NEXT-RESPONSE" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "RESPONSE" ) ),
            makeKeyword( "ANSWER" ) ), ConsesLow.list( makeSymbol( "LEX-WARN" ), makeString( "Unexpected response from blackboard: ~a~%" ), makeSymbol( "RESPONSE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "RESPONSE" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOTIFY-CLIENT" ) ), makeKeyword( "INPUT-READY" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANSWER" ) ) );
    $sym82$GET_NEXT_RESPONSE = makeSymbol( "GET-NEXT-RESPONSE" );
    $str83$Warning__ = makeString( "Warning: " );
    $str84$Unexpected_response_from_blackboa = makeString( "Unexpected response from blackboard: ~a~%" );
    $sym85$NOTIFY_CLIENT = makeSymbol( "NOTIFY-CLIENT" );
    $kw86$INPUT_READY = makeKeyword( "INPUT-READY" );
    $sym87$RKF_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD = makeSymbol( "RKF-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD" );
    $list88 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list89 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "TITLE" ), makeString(
        "" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol( "LIST" ), makeString( "Error:" ),
            makeSymbol( "ERROR-MESSAGE" ), makeString( "" ) ) ) ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "QUESTION" ), makeString( "" ) ) ),
      ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "QUESTION-TYPE" ), ConsesLow.list( makeKeyword( "BOOLEAN" ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol(
          "LIST" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Answer (~a/~s): " ), ConsesLow.list( makeSymbol( "POSITIVE-CHOICE" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "NEGATIVE-CHOICE" ),
              makeSymbol( "SELF" ) ) ) ) ) ), ConsesLow.list( makeKeyword( "ENUMERATED" ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), makeSymbol(
                  "CHOICES" ) ) ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Answer (~a - ~a): " ),
                      ONE_INTEGER, ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "CHOICES" ) ) ) ) ) ), ConsesLow.list( makeKeyword( "MULTIPLE-SELECTION" ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol(
                          "TEXT-LINES" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), makeSymbol( "CHOICES" ) ) ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol( "LIST" ),
                              ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Answer (~a - ~a, including ranges): " ), ONE_INTEGER, ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "CHOICES" ) ) ) ) ) ),
          ConsesLow.list( makeKeyword( "FREE-FORM" ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
              makeString( "Answer: " ) ) ) ) ) ), ConsesLow.list( makeKeyword( "MULTIPLE-FREE-FORM" ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol( "COPY-LIST" ),
                  ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "List of answers: " ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol(
                      "COPY-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "TIP" ),
                          makeSymbol( "*SME-LEXWIZ-VERBOSE?*" ) ), ConsesLow.list( makeSymbol( "NCONC" ), makeSymbol( "TEXT-LINES" ), ConsesLow.list( makeSymbol( "LIST" ), makeString( "Tip:" ), makeString( "" ),
                              makeSymbol( "TIP" ), makeString( "" ) ) ) ), ConsesLow.list( makeSymbol( "WRITE-TEXT-FILE" ), makeSymbol( "*BLACKBOARD-OUTPUT-FILE*" ), makeSymbol( "TEXT-LINES" ) ), ConsesLow.list(
                                  makeSymbol( "APPEND-TEXT-FILE" ), makeSymbol( "*BLACKBOARD-LOG-FILE*" ), makeSymbol( "TEXT-LINES" ) ), ConsesLow.list( makeSymbol( "APPEND-TEXT-FILE" ), makeSymbol(
                                      "*BLACKBOARD-LOG-FILE*" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "*BLACKBOARD-INPUT-DELIM*" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                                          "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOTIFY-CLIENT" ) ), makeKeyword( "OUTPUT-DONE" ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SIM-BB-QUESTION-ANSWERING-AGENT-METHOD" );
    $str91$ = makeString( "" );
    $str92$Error_ = makeString( "Error:" );
    $str93$Answer___a__s___ = makeString( "Answer (~a/~s): " );
    $str94$Answer___a____a___ = makeString( "Answer (~a - ~a): " );
    $str95$Answer___a____a__including_ranges = makeString( "Answer (~a - ~a, including ranges): " );
    $list96 = ConsesLow.list( makeString( "Answer: " ) );
    $list97 = ConsesLow.list( makeString( "List of answers: " ) );
    $list98 = ConsesLow.list( makeString( "" ) );
    $str99$Tip_ = makeString( "Tip:" );
    $kw100$OUTPUT_DONE = makeKeyword( "OUTPUT-DONE" );
    $sym101$SIM_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = makeSymbol( "SIM-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD" );
    $list102 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TIMEOUT" ), makeSymbol( "*BLACKBOARD-TIMEOUT*" ) ), ConsesLow.list( makeSymbol( "DELAY" ), makeSymbol(
        "*BLACKBOARD-DELAY*" ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PROBE-FILE" ), makeSymbol(
            "*BLACKBOARD-INPUT-FILE*" ) ) ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "TIMEOUT" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "SLEEP" ), makeSymbol( "DELAY" ) ), ConsesLow.list( makeSymbol(
                "CDEC" ), makeSymbol( "TIMEOUT" ), makeSymbol( "DELAY" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "PROBE-FILE" ), makeSymbol( "*BLACKBOARD-INPUT-FILE*" ) ), ConsesLow.list(
                    makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "USER-RESPONSE" ), ConsesLow.list( makeSymbol( "READ-TEXT-FILE" ), makeSymbol( "*BLACKBOARD-INPUT-FILE*" ) ) ) ), ConsesLow.list(
                        makeSymbol( "CSETQ" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "READ-TEXT-FILE" ), makeSymbol( "*BLACKBOARD-INPUT-FILE*" ) ) ) ), ConsesLow.list(
                            makeSymbol( "DELETE-FILE" ), makeSymbol( "*BLACKBOARD-INPUT-FILE*" ) ), ConsesLow.list( makeSymbol( "APPEND-TEXT-FILE" ), makeSymbol( "*BLACKBOARD-LOG-FILE*" ), makeSymbol(
                                "USER-RESPONSE" ) ), ConsesLow.list( makeSymbol( "APPEND-TEXT-FILE" ), makeSymbol( "*BLACKBOARD-LOG-FILE*" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
                                    "*BLACKBOARD-OUTPUT-DELIM*" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "PROBE-FILE" ), makeSymbol( "*BLACKBOARD-OUTPUT-FILE*" ) ), ConsesLow.list(
                                        makeSymbol( "DELETE-FILE" ), makeSymbol( "*BLACKBOARD-OUTPUT-FILE*" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "NOTIFY-CLIENT" ) ), makeKeyword( "INPUT-READY" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANSWER" ) ) );
    $sym103$SIM_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD = makeSymbol( "SIM-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD" );
    $sym104$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list105 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list106 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PENDING-ACTIONS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "RESPONSES" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD" );
    $sym108$RKF_BB_PROXY_INITIALIZE_METHOD = makeSymbol( "RKF-BB-PROXY-INITIALIZE-METHOD" );
    $sym109$GET_PENDING_ACTIONS = makeSymbol( "GET-PENDING-ACTIONS" );
    $list110 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PENDING-ACTIONS" ) ) );
    $sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD" );
    $sym112$RKF_BB_PROXY_GET_PENDING_ACTIONS_METHOD = makeSymbol( "RKF-BB-PROXY-GET-PENDING-ACTIONS-METHOD" );
    $list113 = ConsesLow.list( makeSymbol( "NEW-ACTIONS" ) );
    $list114 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PENDING-ACTIONS" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "PENDING-ACTIONS" ), makeSymbol( "NEW-ACTIONS" ) ) ), ConsesLow
        .list( makeSymbol( "RET" ), makeSymbol( "PENDING-ACTIONS" ) ) );
    $sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD" );
    $sym116$RKF_BB_PROXY_ADD_ACTIONS_METHOD = makeSymbol( "RKF-BB-PROXY-ADD-ACTIONS-METHOD" );
    $sym117$CLEAR_ACTIONS = makeSymbol( "CLEAR-ACTIONS" );
    $list118 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PENDING-ACTIONS" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PENDING-ACTIONS" ) ) );
    $sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD" );
    $sym120$RKF_BB_PROXY_CLEAR_ACTIONS_METHOD = makeSymbol( "RKF-BB-PROXY-CLEAR-ACTIONS-METHOD" );
    $sym121$ADD_USER_RESPONSE = makeSymbol( "ADD-USER-RESPONSE" );
    $list122 = ConsesLow.list( makeSymbol( "NEW-RESPONSE" ) );
    $list123 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESPONSES" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "RESPONSES" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
        "NEW-RESPONSE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESPONSES" ) ) );
    $sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD" );
    $sym125$RKF_BB_PROXY_ADD_USER_RESPONSE_METHOD = makeSymbol( "RKF-BB-PROXY-ADD-USER-RESPONSE-METHOD" );
    $list126 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESPONSE" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "RESPONSES" ) ) ) ), ConsesLow.list(
        makeSymbol( "CSETQ" ), makeSymbol( "RESPONSES" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "RESPONSES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESPONSE" ) ) ) );
    $sym127$RKF_BB_PROXY_GET_NEXT_RESPONSE_METHOD = makeSymbol( "RKF-BB-PROXY-GET-NEXT-RESPONSE-METHOD" );
    $sym128$CLEAR_RESPONSES = makeSymbol( "CLEAR-RESPONSES" );
    $list129 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESPONSES" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESPONSES" ) ) );
    $sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD" );
    $sym131$RKF_BB_PROXY_CLEAR_RESPONSES_METHOD = makeSymbol( "RKF-BB-PROXY-CLEAR-RESPONSES-METHOD" );
    $list132 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INTERACTION" ), NIL ), ConsesLow.list( makeSymbol( "RET" ),
        makeSymbol( "SELF" ) ) );
    $sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD" );
    $sym134$RKF_UIA_PROXY_INITIALIZE_METHOD = makeSymbol( "RKF-UIA-PROXY-INITIALIZE-METHOD" );
    $sym135$CREATE_CONSTANT = makeSymbol( "CREATE-CONSTANT" );
    $list136 = ConsesLow.list( makeSymbol( "CONSTANT-NAME" ) );
    $list137 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "PIF-FEATURE" ), makeKeyword( "CYC-UIA" ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DEPENDENT-MT" ), ConsesLow.list( makeSymbol( "CB-UIAT-GET-LEXICAL-INTERACTION-MT" ), makeSymbol( "INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol(
            "CSETQ" ), makeSymbol( "CONSTANT" ), ConsesLow.list( makeSymbol( "RKF-CREATE" ), makeSymbol( "CONSTANT-NAME" ), makeSymbol( "DEPENDENT-MT" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "CONSTANT" ), ConsesLow.list( makeSymbol( "KE-CREATE-NOW" ), makeSymbol( "CONSTANT-NAME" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONSTANT" ) ) ) );
    $sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD" );
    $sym139$RKF_UIA_PROXY_CREATE_CONSTANT_METHOD = makeSymbol( "RKF-UIA-PROXY-CREATE-CONSTANT-METHOD" );
    $sym140$DESCRIBE_TERM = makeSymbol( "DESCRIBE-TERM" );
    $list141 = ConsesLow.list( makeSymbol( "TERM" ) );
    $list142 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF-FEATURE" ), makeKeyword( "CYC-UIA" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "AGENDA" ), ConsesLow.list(
        makeSymbol( "UI-AGENDA" ), makeSymbol( "INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "UIA-TERM-PHRASE-PRECISE" ), makeSymbol( "AGENDA" ), makeSymbol( "TERM" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DESCRIBE-TERM" ), makeSymbol( "SUPER" ), makeSymbol( "TERM" ) ) ) ) );
    $sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD" );
    $sym144$RKF_UIA_PROXY_DESCRIBE_TERM_METHOD = makeSymbol( "RKF-UIA-PROXY-DESCRIBE-TERM-METHOD" );
    $sym145$RESOLVE_TERM = makeSymbol( "RESOLVE-TERM" );
    $list146 = ConsesLow.list( makeSymbol( "TERM-LABEL" ) );
    $list147 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF-FEATURE" ), makeKeyword( "CYC-UIA" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "AGENDA" ), ConsesLow.list(
        makeSymbol( "UI-AGENDA" ), makeSymbol( "INTERACTION" ) ) ), ConsesLow.list( makeSymbol( "TERMS" ), ConsesLow.list( makeSymbol( "UIA-PHRASE-CANDIDATE-TERMS" ), makeSymbol( "AGENDA" ), makeSymbol(
            "TERM-LABEL" ) ) ), ConsesLow.list( makeSymbol( "CLARIFICATIONS" ), ConsesLow.list( makeSymbol( "UIA-TERMS-DISTINGUISHING-PHRASES" ), makeSymbol( "AGENDA" ), makeSymbol( "TERMS" ) ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), makeSymbol( "CLARIFICATIONS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "RESOLVE-TERM" ), makeSymbol( "SUPER" ), makeSymbol( "TERM-LABEL" ) ) ) ) );
    $sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD" );
    $sym149$RKF_UIA_PROXY_RESOLVE_TERM_METHOD = makeSymbol( "RKF-UIA-PROXY-RESOLVE-TERM-METHOD" );
    $sym150$MUMBLE = makeSymbol( "MUMBLE" );
    $list151 = ConsesLow.list( makeSymbol( "MESSAGE" ) );
    $list152 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF-FEATURE" ), makeKeyword( "CYC-UIA" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "AGENDA" ), ConsesLow.list(
        makeSymbol( "UI-AGENDA" ), makeSymbol( "INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol( "LEX-TRACE" ), makeSymbol( "*LEX-BASIC*" ), makeString( "~&mumbling: ~a~%" ), makeSymbol( "MESSAGE" ) ), ConsesLow.list(
            makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "UIA-MUMBLE" ), makeSymbol( "AGENDA" ), makeSymbol( "MESSAGE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "MUMBLE" ), makeSymbol(
                "SUPER" ), makeSymbol( "MESSAGE" ) ) ) ) );
    $sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD" );
    $sym154$RKF_UIA_PROXY_MUMBLE_METHOD = makeSymbol( "RKF-UIA-PROXY-MUMBLE-METHOD" );
    $sym155$FORGE_AHEAD_ = makeSymbol( "FORGE-AHEAD?" );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF-FEATURE" ), makeKeyword( "CYC-UIA" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "AGENDA" ), ConsesLow.list(
        makeSymbol( "UI-AGENDA" ), makeSymbol( "INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "UIA-FORGE-AHEAD?" ), makeSymbol( "AGENDA" ) ) ) ), ConsesLow.list( makeSymbol(
            "RET" ), ConsesLow.list( makeSymbol( "FORGE-AHEAD?" ), makeSymbol( "SUPER" ) ) ) ) );
    $sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD" );
    $sym158$RKF_UIA_PROXY_FORGE_AHEAD__METHOD = makeSymbol( "RKF-UIA-PROXY-FORGE-AHEAD?-METHOD" );
    $sym159$END_SESSION = makeSymbol( "END-SESSION" );
    $list160 = ConsesLow.list( ConsesLow.list( makeSymbol( "END-INTERACTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym161$RKF_UIA_PROXY_END_SESSION_METHOD = makeSymbol( "RKF-UIA-PROXY-END-SESSION-METHOD" );
    $sym162$GET_INTERACTION = makeSymbol( "GET-INTERACTION" );
    $list163 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "INTERACTION" ) ) );
    $sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD" );
    $sym165$RKF_UIA_PROXY_GET_INTERACTION_METHOD = makeSymbol( "RKF-UIA-PROXY-GET-INTERACTION-METHOD" );
    $sym166$SET_INTERACTION = makeSymbol( "SET-INTERACTION" );
    $list167 = ConsesLow.list( makeSymbol( "NEW-INTERACTION" ) );
    $list168 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INTERACTION" ), makeSymbol( "NEW-INTERACTION" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD" );
    $sym170$RKF_UIA_PROXY_SET_INTERACTION_METHOD = makeSymbol( "RKF-UIA-PROXY-SET-INTERACTION-METHOD" );
    $sym171$END_INTERACTION = makeSymbol( "END-INTERACTION" );
    $list172 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "INTERACTION" ), ConsesLow.list( makeSymbol( "PWHEN-FEATURE" ), makeKeyword( "CYC-UIA" ), ConsesLow.list( makeSymbol(
        "CB-UIAT-END-LEXIFICATION-WIZARD" ), makeSymbol( "INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol( "CLEAR-PARAPHRASE-CACHES" ) ), ConsesLow.list( makeSymbol( "PWHEN-FEATURE" ), makeKeyword( "CYC-UIA" ),
            ConsesLow.list( makeSymbol( "CLEAR-UIA-PARAPHRASE-CACHES" ), ConsesLow.list( makeSymbol( "UI-AGENDA" ), makeSymbol( "INTERACTION" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD" );
    $sym174$RKF_UIA_PROXY_END_INTERACTION_METHOD = makeSymbol( "RKF-UIA-PROXY-END-INTERACTION-METHOD" );
    $list175 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ), makeKeyword( "PROTECTED" ) );
    $list176 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RKF-BB-PROXY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
            "*SIMULATED-BLACKBOARD?*" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SIM-BB-QUESTION-ANSWERING-AGENT" ) ) ),
            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUESTION-ANSWERING-AGENT-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RKF-BB-QUESTION-ANSWERING-AGENT" ) ) ) ), ConsesLow.list( makeSymbol(
                "RET" ), makeSymbol( "SELF" ) ) );
    $sym177$NEW = makeSymbol( "NEW" );
    $sym178$RKF_BB_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = makeSymbol( "RKF-BB-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD" );
    $list179 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-PENDING-ACTIONS" ) ) ) ) );
    $sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-BB-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym181$RKF_BB_SME_LEXIFICATION_WIZARD_GET_PENDING_ACTIONS_METHOD = makeSymbol( "RKF-BB-SME-LEXIFICATION-WIZARD-GET-PENDING-ACTIONS-METHOD" );
    $sym182$CLEAR_PENDING_ACTIONS = makeSymbol( "CLEAR-PENDING-ACTIONS" );
    $list183 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CLEAR-ACTIONS" ) ) ), ConsesLow.list( makeSymbol(
        "RET" ), NIL ) );
    $sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-BB-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym185$RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_PENDING_ACTIONS_METHOD = makeSymbol( "RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-PENDING-ACTIONS-METHOD" );
    $sym186$SET_USER_RESPONSE = makeSymbol( "SET-USER-RESPONSE" );
    $list187 = ConsesLow.list( makeSymbol( "RESPONSE" ) );
    $list188 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD-USER-RESPONSE" ) ), makeSymbol( "RESPONSE" ) ),
        ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQ, makeSymbol( "CURRENT-INTERACTION" ), makeSymbol( "NEW-CURRENT-INTERACTION" ) ), ConsesLow.list( makeSymbol( "LEX-WARN" ), makeString(
            "Issuing shameless hack updating current interaction~%" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INTERACTION" ), makeSymbol( "NEW-CURRENT-INTERACTION" ) ) ), ConsesLow.list(
                makeSymbol( "PWHEN" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CURRENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "PROCESS-STATUS-UPDATE" ) ), makeKeyword( "OUTPUT-DONE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $str189$Issuing_shameless_hack_updating_c = makeString( "Issuing shameless hack updating current interaction~%" );
    $sym190$PROCESS_STATUS_UPDATE = makeSymbol( "PROCESS-STATUS-UPDATE" );
    $sym191$RKF_BB_SME_LEXIFICATION_WIZARD_SET_USER_RESPONSE_METHOD = makeSymbol( "RKF-BB-SME-LEXIFICATION-WIZARD-SET-USER-RESPONSE-METHOD" );
    $sym192$CLEAR_USER_RESPONSES = makeSymbol( "CLEAR-USER-RESPONSES" );
    $list193 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CLEAR-RESPONSES" ) ) ), ConsesLow.list( makeSymbol(
        "RET" ), NIL ) );
    $sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-BB-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym195$RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_USER_RESPONSES_METHOD = makeSymbol( "RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-USER-RESPONSES-METHOD" );
    $list196 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "FUNCALL-CLASS-METHOD" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RKF-UIA-PROXY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEW" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "QUESTION-ANSWERING-AGENT-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "UIA-HTML-QUESTION-ANSWERING-AGENT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "*USE-INFERRED-PHRASES?*" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*SME-LEXWIZ-VERBOSE?*" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym197$UIA_HTML_QUESTION_ANSWERING_AGENT = makeSymbol( "UIA-HTML-QUESTION-ANSWERING-AGENT" );
    $sym198$RKF_UIA_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = makeSymbol( "RKF-UIA-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD" );
    $list199 = ConsesLow.list( makeKeyword( "PROTECTED" ), makeKeyword( "PUBLIC" ) );
    $list200 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROXY" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "SET-INTERACTION" ) ), makeSymbol( "NEW-INTERACTION" ) ) ) );
    $sym201$OUTER_CATCH_FOR_RKF_UIA_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-RKF-UIA-SME-LEXIFICATION-WIZARD-METHOD" );
    $sym202$RKF_UIA_SME_LEXIFICATION_WIZARD_SET_INTERACTION_METHOD = makeSymbol( "RKF-UIA-SME-LEXIFICATION-WIZARD-SET-INTERACTION-METHOD" );
  }
}
/*
 * 
 * Total time: 525 ms
 * 
 */