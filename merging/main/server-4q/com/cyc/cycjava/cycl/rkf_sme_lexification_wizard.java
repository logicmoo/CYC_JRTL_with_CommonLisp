package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_sme_lexification_wizard extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new rkf_sme_lexification_wizard();

    public static final String myName = "com.cyc.cycjava_2.cycl.rkf_sme_lexification_wizard";


    // deflexical
    public static final SubLSymbol $simulated_blackboardP$ = makeSymbol("*SIMULATED-BLACKBOARD?*");

    // deflexical
    private static final SubLSymbol $blackboard_input_file$ = makeSymbol("*BLACKBOARD-INPUT-FILE*");

    // deflexical
    private static final SubLSymbol $blackboard_output_file$ = makeSymbol("*BLACKBOARD-OUTPUT-FILE*");

    // deflexical
    private static final SubLSymbol $blackboard_log_file$ = makeSymbol("*BLACKBOARD-LOG-FILE*");

    // deflexical
    private static final SubLSymbol $blackboard_input_delim$ = makeSymbol("*BLACKBOARD-INPUT-DELIM*");

    // deflexical
    private static final SubLSymbol $blackboard_output_delim$ = makeSymbol("*BLACKBOARD-OUTPUT-DELIM*");

    // deflexical
    private static final SubLSymbol $blackboard_delay$ = makeSymbol("*BLACKBOARD-DELAY*");

    // deflexical
    private static final SubLSymbol $blackboard_timeout$ = makeSymbol("*BLACKBOARD-TIMEOUT*");

    private static final SubLString $str0$_tmp_blackboard_input_text = makeString("/tmp/blackboard-input.text");

    private static final SubLString $str1$_tmp_blackboard_output_text = makeString("/tmp/blackboard-output.text");

    private static final SubLString $str2$_tmp_blackboard_log_text = makeString("/tmp/blackboard-log.text");

    private static final SubLString $str3$_________________________________ = makeString("........................................................................");

    private static final SubLString $str4$_________________________________ = makeString("------------------------------------------------------------------------");

    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLSymbol RKF_BB_PROXY = makeSymbol("RKF-BB-PROXY");

    private static final SubLSymbol INTERFACE_PROXY = makeSymbol("INTERFACE-PROXY");

    private static final SubLList $list8 = list(list(makeSymbol("PENDING-ACTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RESPONSES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PENDING-ACTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-ACTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-ACTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-USER-RESPONSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NEXT-RESPONSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-RESPONSES"), NIL, makeKeyword("PUBLIC")));









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-INSTANCE");

    private static final SubLSymbol RKF_UIA_PROXY = makeSymbol("RKF-UIA-PROXY");

    private static final SubLList $list18 = list(list(makeSymbol("INTERACTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERACTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERACTION"), list(makeSymbol("INTERACTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("END-INTERACTION"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-INSTANCE");

    private static final SubLSymbol RKF_BB_QUESTION_ANSWERING_AGENT = makeSymbol("RKF-BB-QUESTION-ANSWERING-AGENT");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT = makeSymbol("QUESTION-ANSWERING-AGENT");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-CLASS");

































    private static final SubLSymbol USER_DATA = makeSymbol("USER-DATA");

    private static final SubLSymbol $sym42$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-INSTANCE");

    private static final SubLSymbol SIM_BB_QUESTION_ANSWERING_AGENT = makeSymbol("SIM-BB-QUESTION-ANSWERING-AGENT");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-CLASS");

    private static final SubLSymbol $sym45$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-INSTANCE");

    private static final SubLSymbol RKF_BB_SME_LEXIFICATION_WIZARD = makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD");



    private static final SubLList $list48 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PENDING-ACTIONS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-PENDING-ACTIONS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-USER-RESPONSE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-USER-RESPONSES"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-CLASS");













    private static final SubLSymbol $sym56$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-INSTANCE");

    private static final SubLSymbol RKF_UIA_SME_LEXIFICATION_WIZARD = makeSymbol("RKF-UIA-SME-LEXIFICATION-WIZARD");

    private static final SubLList $list58 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERACTION"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-CLASS");

    private static final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-INSTANCE");



    private static final SubLList $list62 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

    private static final SubLList $list63 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(makeSymbol("NEW-ACTIONS")), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeKeyword("SHOW-TEXT"), makeSymbol("TITLE")), makeSymbol("NEW-ACTIONS")), list(makeSymbol("PWHEN"), makeSymbol("ERROR-MESSAGE"), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeKeyword("SHOW-TEXT"), list(makeSymbol("FORMAT"), NIL, makeString("Error: ~a"), makeSymbol("ERROR-MESSAGE"))), makeSymbol("NEW-ACTIONS"))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeKeyword("SHOW-TEXT"), makeSymbol("QUESTION")), makeSymbol("NEW-ACTIONS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TIP"), makeSymbol("*SME-LEXWIZ-VERBOSE?*")), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeKeyword("SHOW-TEXT"), list(makeSymbol("FORMAT"), NIL, makeString("Tip: ~a"), makeSymbol("TIP"))), makeSymbol("NEW-ACTIONS"))), list(makeSymbol("PCASE"), makeSymbol("QUESTION-TYPE"), list(makeKeyword("BOOLEAN"), list(makeSymbol("CLET"), list(list(makeSymbol("NEGATIVE"), list(makeSymbol("NEGATIVE-CHOICE"), makeSymbol("SELF"))), list(makeSymbol("POSITIVE"), list(makeSymbol("POSITIVE-CHOICE"), makeSymbol("SELF")))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeKeyword("CHOOSE-ONE"), makeKeyword("ANSWER"), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), list(makeSymbol("BQ-LIST"), makeSymbol("NEGATIVE"), makeSymbol("POSITIVE")))), makeSymbol("NEW-ACTIONS")))), list(makeKeyword("ENUMERATED"), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeKeyword("CHOOSE-ONE"), makeKeyword("ANSWER"), makeSymbol("CHOICES")), makeSymbol("NEW-ACTIONS"))), list(makeKeyword("MULTIPLE-SELECTION"), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeKeyword("CHOOSE-MUTIPLE"), makeKeyword("ANSWER"), makeSymbol("CHOICES")), makeSymbol("NEW-ACTIONS"))), list(makeKeyword("FREE-FORM"), list(makeSymbol("CPUSH"), list(QUOTE, list(makeKeyword("ENTER-TEXT"), makeKeyword("ANSWER"))), makeSymbol("NEW-ACTIONS"))), list(makeKeyword("MULTIPLE-FREE-FORM"), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), list(makeSymbol("LENGTH"), makeSymbol("FIELD-LABELS"))), list(makeSymbol("CPUSH"), list(QUOTE, list(makeKeyword("ENTER-TEXT"), makeKeyword("ANSWER"))), makeSymbol("NEW-ACTIONS"))))), list(makeSymbol("LEX-DEBUG-OUT"), makeString("Adding new actions: ~%~S~%"), list(makeSymbol("REVERSE"), makeSymbol("NEW-ACTIONS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(QUOTE, makeSymbol("ADD-ACTIONS")), list(makeSymbol("REVERSE"), makeSymbol("NEW-ACTIONS"))) }), list(RET, NIL));

    private static final SubLSymbol $SHOW_TEXT = makeKeyword("SHOW-TEXT");

    private static final SubLString $str65$Error___a = makeString("Error: ~a");

    private static final SubLString $str66$Tip___a = makeString("Tip: ~a");



    private static final SubLSymbol $CHOOSE_ONE = makeKeyword("CHOOSE-ONE");









    private static final SubLSymbol $CHOOSE_MUTIPLE = makeKeyword("CHOOSE-MUTIPLE");



    private static final SubLList $list75 = list(makeKeyword("ENTER-TEXT"), makeKeyword("ANSWER"));

    private static final SubLSymbol $MULTIPLE_FREE_FORM = makeKeyword("MULTIPLE-FREE-FORM");

    private static final SubLString $str77$Adding_new_actions_____S__ = makeString("Adding new actions: ~%~S~%");

    private static final SubLSymbol ADD_ACTIONS = makeSymbol("ADD-ACTIONS");

    private static final SubLSymbol RKF_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = makeSymbol("RKF-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD");

    private static final SubLSymbol GET_RESPONSE = makeSymbol("GET-RESPONSE");

    private static final SubLList $list81 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESPONSE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(QUOTE, makeSymbol("GET-NEXT-RESPONSE"))))), list(makeSymbol("PUNLESS"), list(EQ, list(makeSymbol("FIRST"), makeSymbol("RESPONSE")), makeKeyword("ANSWER")), list(makeSymbol("LEX-WARN"), makeString("Unexpected response from blackboard: ~a~%"), makeSymbol("RESPONSE")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), list(makeSymbol("SECOND"), makeSymbol("RESPONSE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NOTIFY-CLIENT")), makeKeyword("INPUT-READY"))), list(RET, makeSymbol("ANSWER")));

    private static final SubLSymbol GET_NEXT_RESPONSE = makeSymbol("GET-NEXT-RESPONSE");

    private static final SubLString $str83$Warning__ = makeString("Warning: ");

    private static final SubLString $str84$Unexpected_response_from_blackboa = makeString("Unexpected response from blackboard: ~a~%");





    private static final SubLSymbol RKF_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD = makeSymbol("RKF-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD");

    private static final SubLList $list88 = list(makeKeyword("PUBLIC"));

    private static final SubLList $list89 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("TEXT-LINES"), list(makeSymbol("LIST"), makeSymbol("TITLE"), makeString("")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR-MESSAGE"), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("LIST"), makeString("Error:"), makeSymbol("ERROR-MESSAGE"), makeString("")))), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("LIST"), makeSymbol("QUESTION"), makeString(""))), list(makeSymbol("PCASE"), makeSymbol("QUESTION-TYPE"), list(makeKeyword("BOOLEAN"), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("LIST"), list(makeSymbol("FORMAT"), NIL, makeString("Answer (~a/~s): "), list(makeSymbol("POSITIVE-CHOICE"), makeSymbol("SELF")), list(makeSymbol("NEGATIVE-CHOICE"), makeSymbol("SELF")))))), list(makeKeyword("ENUMERATED"), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("COPY-LIST"), makeSymbol("CHOICES"))), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("LIST"), list(makeSymbol("FORMAT"), NIL, makeString("Answer (~a - ~a): "), ONE_INTEGER, list(makeSymbol("LENGTH"), makeSymbol("CHOICES")))))), list(makeKeyword("MULTIPLE-SELECTION"), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("COPY-LIST"), makeSymbol("CHOICES"))), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("LIST"), list(makeSymbol("FORMAT"), NIL, makeString("Answer (~a - ~a, including ranges): "), ONE_INTEGER, list(makeSymbol("LENGTH"), makeSymbol("CHOICES")))))), list(makeKeyword("FREE-FORM"), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("COPY-LIST"), list(QUOTE, list(makeString("Answer: ")))))), list(makeKeyword("MULTIPLE-FREE-FORM"), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("COPY-LIST"), list(QUOTE, list(makeString("List of answers: "))))))), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("COPY-LIST"), list(QUOTE, list(makeString(""))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TIP"), makeSymbol("*SME-LEXWIZ-VERBOSE?*")), list(makeSymbol("NCONC"), makeSymbol("TEXT-LINES"), list(makeSymbol("LIST"), makeString("Tip:"), makeString(""), makeSymbol("TIP"), makeString("")))), list(makeSymbol("WRITE-TEXT-FILE"), makeSymbol("*BLACKBOARD-OUTPUT-FILE*"), makeSymbol("TEXT-LINES")), list(makeSymbol("APPEND-TEXT-FILE"), makeSymbol("*BLACKBOARD-LOG-FILE*"), makeSymbol("TEXT-LINES")), list(makeSymbol("APPEND-TEXT-FILE"), makeSymbol("*BLACKBOARD-LOG-FILE*"), list(makeSymbol("LIST"), makeSymbol("*BLACKBOARD-INPUT-DELIM*"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NOTIFY-CLIENT")), makeKeyword("OUTPUT-DONE")) }), list(RET, NIL));

    private static final SubLSymbol $sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIM-BB-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLString $str91$ = makeString("");

    private static final SubLString $str92$Error_ = makeString("Error:");

    private static final SubLString $str93$Answer___a__s___ = makeString("Answer (~a/~s): ");

    private static final SubLString $str94$Answer___a____a___ = makeString("Answer (~a - ~a): ");

    private static final SubLString $str95$Answer___a____a__including_ranges = makeString("Answer (~a - ~a, including ranges): ");

    private static final SubLList $list96 = list(makeString("Answer: "));

    private static final SubLList $list97 = list(makeString("List of answers: "));

    private static final SubLList $list98 = list(makeString(""));

    private static final SubLString $str99$Tip_ = makeString("Tip:");



    private static final SubLSymbol SIM_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = makeSymbol("SIM-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD");

    private static final SubLList $list102 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TIMEOUT"), makeSymbol("*BLACKBOARD-TIMEOUT*")), list(makeSymbol("DELAY"), makeSymbol("*BLACKBOARD-DELAY*"))), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PROBE-FILE"), makeSymbol("*BLACKBOARD-INPUT-FILE*"))), list(makeSymbol(">"), makeSymbol("TIMEOUT"), ZERO_INTEGER)), list(makeSymbol("SLEEP"), makeSymbol("DELAY")), list(makeSymbol("CDEC"), makeSymbol("TIMEOUT"), makeSymbol("DELAY"))), list(makeSymbol("PWHEN"), list(makeSymbol("PROBE-FILE"), makeSymbol("*BLACKBOARD-INPUT-FILE*")), list(makeSymbol("CLET"), list(list(makeSymbol("USER-RESPONSE"), list(makeSymbol("READ-TEXT-FILE"), makeSymbol("*BLACKBOARD-INPUT-FILE*")))), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), list(makeSymbol("FIRST"), list(makeSymbol("READ-TEXT-FILE"), makeSymbol("*BLACKBOARD-INPUT-FILE*")))), list(makeSymbol("DELETE-FILE"), makeSymbol("*BLACKBOARD-INPUT-FILE*")), list(makeSymbol("APPEND-TEXT-FILE"), makeSymbol("*BLACKBOARD-LOG-FILE*"), makeSymbol("USER-RESPONSE")), list(makeSymbol("APPEND-TEXT-FILE"), makeSymbol("*BLACKBOARD-LOG-FILE*"), list(makeSymbol("LIST"), makeSymbol("*BLACKBOARD-OUTPUT-DELIM*"))))), list(makeSymbol("PWHEN"), list(makeSymbol("PROBE-FILE"), makeSymbol("*BLACKBOARD-OUTPUT-FILE*")), list(makeSymbol("DELETE-FILE"), makeSymbol("*BLACKBOARD-OUTPUT-FILE*"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NOTIFY-CLIENT")), makeKeyword("INPUT-READY"))), list(RET, makeSymbol("ANSWER")));

    private static final SubLSymbol SIM_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD = makeSymbol("SIM-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD");



    private static final SubLList $list105 = list(makeKeyword("PROTECTED"));

    private static final SubLList $list106 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PENDING-ACTIONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("RESPONSES"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");

    private static final SubLSymbol RKF_BB_PROXY_INITIALIZE_METHOD = makeSymbol("RKF-BB-PROXY-INITIALIZE-METHOD");



    private static final SubLList $list110 = list(list(RET, makeSymbol("PENDING-ACTIONS")));

    private static final SubLSymbol $sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");

    private static final SubLSymbol RKF_BB_PROXY_GET_PENDING_ACTIONS_METHOD = makeSymbol("RKF-BB-PROXY-GET-PENDING-ACTIONS-METHOD");

    private static final SubLList $list113 = list(makeSymbol("NEW-ACTIONS"));

    private static final SubLList $list114 = list(list(makeSymbol("CSETQ"), makeSymbol("PENDING-ACTIONS"), list(makeSymbol("APPEND"), makeSymbol("PENDING-ACTIONS"), makeSymbol("NEW-ACTIONS"))), list(RET, makeSymbol("PENDING-ACTIONS")));

    private static final SubLSymbol $sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");

    private static final SubLSymbol RKF_BB_PROXY_ADD_ACTIONS_METHOD = makeSymbol("RKF-BB-PROXY-ADD-ACTIONS-METHOD");

    private static final SubLSymbol CLEAR_ACTIONS = makeSymbol("CLEAR-ACTIONS");

    private static final SubLList $list118 = list(list(makeSymbol("CSETQ"), makeSymbol("PENDING-ACTIONS"), NIL), list(RET, makeSymbol("PENDING-ACTIONS")));

    private static final SubLSymbol $sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");

    private static final SubLSymbol RKF_BB_PROXY_CLEAR_ACTIONS_METHOD = makeSymbol("RKF-BB-PROXY-CLEAR-ACTIONS-METHOD");

    private static final SubLSymbol ADD_USER_RESPONSE = makeSymbol("ADD-USER-RESPONSE");

    private static final SubLList $list122 = list(makeSymbol("NEW-RESPONSE"));

    private static final SubLList $list123 = list(list(makeSymbol("CSETQ"), makeSymbol("RESPONSES"), list(makeSymbol("APPEND"), makeSymbol("RESPONSES"), list(makeSymbol("LIST"), makeSymbol("NEW-RESPONSE")))), list(RET, makeSymbol("RESPONSES")));

    private static final SubLSymbol $sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");

    private static final SubLSymbol RKF_BB_PROXY_ADD_USER_RESPONSE_METHOD = makeSymbol("RKF-BB-PROXY-ADD-USER-RESPONSE-METHOD");

    private static final SubLList $list126 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESPONSE"), list(makeSymbol("FIRST"), makeSymbol("RESPONSES")))), list(makeSymbol("CSETQ"), makeSymbol("RESPONSES"), list(makeSymbol("REST"), makeSymbol("RESPONSES"))), list(RET, makeSymbol("RESPONSE"))));

    private static final SubLSymbol RKF_BB_PROXY_GET_NEXT_RESPONSE_METHOD = makeSymbol("RKF-BB-PROXY-GET-NEXT-RESPONSE-METHOD");

    private static final SubLSymbol CLEAR_RESPONSES = makeSymbol("CLEAR-RESPONSES");

    private static final SubLList $list129 = list(list(makeSymbol("CSETQ"), makeSymbol("RESPONSES"), NIL), list(RET, makeSymbol("RESPONSES")));

    private static final SubLSymbol $sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-PROXY-METHOD");

    private static final SubLSymbol RKF_BB_PROXY_CLEAR_RESPONSES_METHOD = makeSymbol("RKF-BB-PROXY-CLEAR-RESPONSES-METHOD");

    private static final SubLList $list132 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERACTION"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");

    private static final SubLSymbol RKF_UIA_PROXY_INITIALIZE_METHOD = makeSymbol("RKF-UIA-PROXY-INITIALIZE-METHOD");

    private static final SubLSymbol CREATE_CONSTANT = makeSymbol("CREATE-CONSTANT");

    private static final SubLList $list136 = list(makeSymbol("CONSTANT-NAME"));

    private static final SubLList $list137 = list(list(makeSymbol("CLET"), list(makeSymbol("CONSTANT")), list(makeSymbol("PIF-FEATURE"), makeKeyword("CYC-UIA"), list(makeSymbol("CLET"), list(list(makeSymbol("DEPENDENT-MT"), list(makeSymbol("CB-UIAT-GET-LEXICAL-INTERACTION-MT"), makeSymbol("INTERACTION")))), list(makeSymbol("CSETQ"), makeSymbol("CONSTANT"), list(makeSymbol("RKF-CREATE"), makeSymbol("CONSTANT-NAME"), makeSymbol("DEPENDENT-MT")))), list(makeSymbol("CSETQ"), makeSymbol("CONSTANT"), list(makeSymbol("KE-CREATE-NOW"), makeSymbol("CONSTANT-NAME")))), list(RET, makeSymbol("CONSTANT"))));

    private static final SubLSymbol $sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");

    private static final SubLSymbol RKF_UIA_PROXY_CREATE_CONSTANT_METHOD = makeSymbol("RKF-UIA-PROXY-CREATE-CONSTANT-METHOD");



    private static final SubLList $list141 = list(makeSymbol("TERM"));

    private static final SubLList $list142 = list(list(makeSymbol("PIF-FEATURE"), makeKeyword("CYC-UIA"), list(makeSymbol("CLET"), list(list(makeSymbol("AGENDA"), list(makeSymbol("UI-AGENDA"), makeSymbol("INTERACTION")))), list(RET, list(makeSymbol("UIA-TERM-PHRASE-PRECISE"), makeSymbol("AGENDA"), makeSymbol("TERM")))), list(RET, list(makeSymbol("DESCRIBE-TERM"), makeSymbol("SUPER"), makeSymbol("TERM")))));

    private static final SubLSymbol $sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");

    private static final SubLSymbol RKF_UIA_PROXY_DESCRIBE_TERM_METHOD = makeSymbol("RKF-UIA-PROXY-DESCRIBE-TERM-METHOD");



    private static final SubLList $list146 = list(makeSymbol("TERM-LABEL"));

    private static final SubLList $list147 = list(list(makeSymbol("PIF-FEATURE"), makeKeyword("CYC-UIA"), list(makeSymbol("CLET"), list(list(makeSymbol("AGENDA"), list(makeSymbol("UI-AGENDA"), makeSymbol("INTERACTION"))), list(makeSymbol("TERMS"), list(makeSymbol("UIA-PHRASE-CANDIDATE-TERMS"), makeSymbol("AGENDA"), makeSymbol("TERM-LABEL"))), list(makeSymbol("CLARIFICATIONS"), list(makeSymbol("UIA-TERMS-DISTINGUISHING-PHRASES"), makeSymbol("AGENDA"), makeSymbol("TERMS")))), list(RET, makeSymbol("CLARIFICATIONS"))), list(RET, list(makeSymbol("RESOLVE-TERM"), makeSymbol("SUPER"), makeSymbol("TERM-LABEL")))));

    private static final SubLSymbol $sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");

    private static final SubLSymbol RKF_UIA_PROXY_RESOLVE_TERM_METHOD = makeSymbol("RKF-UIA-PROXY-RESOLVE-TERM-METHOD");



    private static final SubLList $list151 = list(makeSymbol("MESSAGE"));

    private static final SubLList $list152 = list(list(makeSymbol("PIF-FEATURE"), makeKeyword("CYC-UIA"), list(makeSymbol("CLET"), list(list(makeSymbol("AGENDA"), list(makeSymbol("UI-AGENDA"), makeSymbol("INTERACTION")))), list(makeSymbol("LEX-TRACE"), makeSymbol("*LEX-BASIC*"), makeString("~&mumbling: ~a~%"), makeSymbol("MESSAGE")), list(RET, list(makeSymbol("UIA-MUMBLE"), makeSymbol("AGENDA"), makeSymbol("MESSAGE")))), list(RET, list(makeSymbol("MUMBLE"), makeSymbol("SUPER"), makeSymbol("MESSAGE")))));

    private static final SubLSymbol $sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");

    private static final SubLSymbol RKF_UIA_PROXY_MUMBLE_METHOD = makeSymbol("RKF-UIA-PROXY-MUMBLE-METHOD");

    private static final SubLSymbol $sym155$FORGE_AHEAD_ = makeSymbol("FORGE-AHEAD?");

    private static final SubLList $list156 = list(list(makeSymbol("PIF-FEATURE"), makeKeyword("CYC-UIA"), list(makeSymbol("CLET"), list(list(makeSymbol("AGENDA"), list(makeSymbol("UI-AGENDA"), makeSymbol("INTERACTION")))), list(RET, list(makeSymbol("UIA-FORGE-AHEAD?"), makeSymbol("AGENDA")))), list(RET, list(makeSymbol("FORGE-AHEAD?"), makeSymbol("SUPER")))));

    private static final SubLSymbol $sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");

    private static final SubLSymbol $sym158$RKF_UIA_PROXY_FORGE_AHEAD__METHOD = makeSymbol("RKF-UIA-PROXY-FORGE-AHEAD?-METHOD");

    private static final SubLSymbol END_SESSION = makeSymbol("END-SESSION");

    private static final SubLList $list160 = list(list(makeSymbol("END-INTERACTION"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol RKF_UIA_PROXY_END_SESSION_METHOD = makeSymbol("RKF-UIA-PROXY-END-SESSION-METHOD");

    private static final SubLSymbol GET_INTERACTION = makeSymbol("GET-INTERACTION");

    private static final SubLList $list163 = list(list(RET, makeSymbol("INTERACTION")));

    private static final SubLSymbol $sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");

    private static final SubLSymbol RKF_UIA_PROXY_GET_INTERACTION_METHOD = makeSymbol("RKF-UIA-PROXY-GET-INTERACTION-METHOD");



    private static final SubLList $list167 = list(makeSymbol("NEW-INTERACTION"));

    private static final SubLList $list168 = list(list(makeSymbol("CSETQ"), makeSymbol("INTERACTION"), makeSymbol("NEW-INTERACTION")), list(RET, NIL));

    private static final SubLSymbol $sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");

    private static final SubLSymbol RKF_UIA_PROXY_SET_INTERACTION_METHOD = makeSymbol("RKF-UIA-PROXY-SET-INTERACTION-METHOD");



    private static final SubLList $list172 = list(list(makeSymbol("PWHEN"), makeSymbol("INTERACTION"), list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-UIA"), list(makeSymbol("CB-UIAT-END-LEXIFICATION-WIZARD"), makeSymbol("INTERACTION")))), list(makeSymbol("CLEAR-PARAPHRASE-CACHES")), list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-UIA"), list(makeSymbol("CLEAR-UIA-PARAPHRASE-CACHES"), list(makeSymbol("UI-AGENDA"), makeSymbol("INTERACTION")))), list(RET, NIL));

    private static final SubLSymbol $sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-PROXY-METHOD");

    private static final SubLSymbol RKF_UIA_PROXY_END_INTERACTION_METHOD = makeSymbol("RKF-UIA-PROXY-END-INTERACTION-METHOD");

    private static final SubLList $list175 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PROTECTED"));

    private static final SubLList $list176 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PROXY"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(QUOTE, makeSymbol("RKF-BB-PROXY")), list(QUOTE, makeSymbol("NEW")))), list(makeSymbol("PIF"), makeSymbol("*SIMULATED-BLACKBOARD?*"), list(makeSymbol("CSETQ"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), list(QUOTE, makeSymbol("SIM-BB-QUESTION-ANSWERING-AGENT"))), list(makeSymbol("CSETQ"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), list(QUOTE, makeSymbol("RKF-BB-QUESTION-ANSWERING-AGENT")))), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol RKF_BB_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD");

    private static final SubLList $list179 = list(list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(QUOTE, makeSymbol("GET-PENDING-ACTIONS")))));

    private static final SubLSymbol $sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol RKF_BB_SME_LEXIFICATION_WIZARD_GET_PENDING_ACTIONS_METHOD = makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD-GET-PENDING-ACTIONS-METHOD");

    private static final SubLSymbol CLEAR_PENDING_ACTIONS = makeSymbol("CLEAR-PENDING-ACTIONS");

    private static final SubLList $list183 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(QUOTE, makeSymbol("CLEAR-ACTIONS"))), list(RET, NIL));

    private static final SubLSymbol $sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_PENDING_ACTIONS_METHOD = makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-PENDING-ACTIONS-METHOD");

    private static final SubLSymbol SET_USER_RESPONSE = makeSymbol("SET-USER-RESPONSE");

    private static final SubLList $list187 = list(makeSymbol("RESPONSE"));

    private static final SubLList $list188 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(QUOTE, makeSymbol("ADD-USER-RESPONSE")), makeSymbol("RESPONSE")), list(makeSymbol("PUNLESS"), list(EQ, makeSymbol("CURRENT-INTERACTION"), makeSymbol("NEW-CURRENT-INTERACTION")), list(makeSymbol("LEX-WARN"), makeString("Issuing shameless hack updating current interaction~%")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INTERACTION"), makeSymbol("NEW-CURRENT-INTERACTION"))), list(makeSymbol("PWHEN"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-INTERACTION"), list(QUOTE, makeSymbol("PROCESS-STATUS-UPDATE")), makeKeyword("OUTPUT-DONE"))), list(RET, T));

    private static final SubLString $str189$Issuing_shameless_hack_updating_c = makeString("Issuing shameless hack updating current interaction~%");



    private static final SubLSymbol RKF_BB_SME_LEXIFICATION_WIZARD_SET_USER_RESPONSE_METHOD = makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD-SET-USER-RESPONSE-METHOD");

    private static final SubLSymbol CLEAR_USER_RESPONSES = makeSymbol("CLEAR-USER-RESPONSES");

    private static final SubLList $list193 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(QUOTE, makeSymbol("CLEAR-RESPONSES"))), list(RET, NIL));

    private static final SubLSymbol $sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-BB-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_USER_RESPONSES_METHOD = makeSymbol("RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-USER-RESPONSES-METHOD");

    private static final SubLList $list196 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PROXY"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(QUOTE, makeSymbol("RKF-UIA-PROXY")), list(QUOTE, makeSymbol("NEW")))), list(makeSymbol("CSETQ"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), list(QUOTE, makeSymbol("UIA-HTML-QUESTION-ANSWERING-AGENT"))), list(makeSymbol("CSETQ"), makeSymbol("*USE-INFERRED-PHRASES?*"), T), list(makeSymbol("CSETQ"), makeSymbol("*SME-LEXWIZ-VERBOSE?*"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol UIA_HTML_QUESTION_ANSWERING_AGENT = makeSymbol("UIA-HTML-QUESTION-ANSWERING-AGENT");

    private static final SubLSymbol RKF_UIA_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = makeSymbol("RKF-UIA-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD");

    private static final SubLList $list199 = list(makeKeyword("PROTECTED"), makeKeyword("PUBLIC"));

    private static final SubLList $list200 = list(list(makeSymbol("PWHEN"), makeSymbol("PROXY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(QUOTE, makeSymbol("SET-INTERACTION")), makeSymbol("NEW-INTERACTION"))));

    private static final SubLSymbol $sym201$OUTER_CATCH_FOR_RKF_UIA_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RKF-UIA-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol RKF_UIA_SME_LEXIFICATION_WIZARD_SET_INTERACTION_METHOD = makeSymbol("RKF-UIA-SME-LEXIFICATION-WIZARD-SET-INTERACTION-METHOD");

    public static SubLObject get_rkf_bb_proxy_responses(final SubLObject rkf_bb_proxy) {
        return classes.subloop_get_access_protected_instance_slot(rkf_bb_proxy, TWO_INTEGER, RESPONSES);
    }

    public static SubLObject set_rkf_bb_proxy_responses(final SubLObject rkf_bb_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rkf_bb_proxy, value, TWO_INTEGER, RESPONSES);
    }

    public static SubLObject get_rkf_bb_proxy_pending_actions(final SubLObject rkf_bb_proxy) {
        return classes.subloop_get_access_protected_instance_slot(rkf_bb_proxy, ONE_INTEGER, PENDING_ACTIONS);
    }

    public static SubLObject set_rkf_bb_proxy_pending_actions(final SubLObject rkf_bb_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rkf_bb_proxy, value, ONE_INTEGER, PENDING_ACTIONS);
    }

    public static SubLObject subloop_reserved_initialize_rkf_bb_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_rkf_bb_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, RKF_BB_PROXY, PENDING_ACTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, RKF_BB_PROXY, RESPONSES, NIL);
        return NIL;
    }

    public static SubLObject rkf_bb_proxy_p(final SubLObject rkf_bb_proxy) {
        return classes.subloop_instanceof_class(rkf_bb_proxy, RKF_BB_PROXY);
    }

    public static SubLObject get_rkf_uia_proxy_interaction(final SubLObject rkf_uia_proxy) {
        return classes.subloop_get_access_protected_instance_slot(rkf_uia_proxy, ONE_INTEGER, INTERACTION);
    }

    public static SubLObject set_rkf_uia_proxy_interaction(final SubLObject rkf_uia_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rkf_uia_proxy, value, ONE_INTEGER, INTERACTION);
    }

    public static SubLObject subloop_reserved_initialize_rkf_uia_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_rkf_uia_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, RKF_UIA_PROXY, INTERACTION, NIL);
        return NIL;
    }

    public static SubLObject rkf_uia_proxy_p(final SubLObject rkf_uia_proxy) {
        return classes.subloop_instanceof_class(rkf_uia_proxy, RKF_UIA_PROXY);
    }

    public static SubLObject subloop_reserved_initialize_rkf_bb_question_answering_agent_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_rkf_bb_question_answering_agent_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ID, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TITLE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TIP, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CHOICES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DESCRIPTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, VALUES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DEFAULT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ANSWER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_WIDTH, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_LABELS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, USER_DATA, NIL);
        return NIL;
    }

    public static SubLObject rkf_bb_question_answering_agent_p(final SubLObject rkf_bb_question_answering_agent) {
        return classes.subloop_instanceof_class(rkf_bb_question_answering_agent, RKF_BB_QUESTION_ANSWERING_AGENT);
    }

    public static SubLObject subloop_reserved_initialize_sim_bb_question_answering_agent_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sim_bb_question_answering_agent_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ID, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TITLE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TIP, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CHOICES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DESCRIPTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, VALUES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DEFAULT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ANSWER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_WIDTH, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_LABELS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, USER_DATA, NIL);
        return NIL;
    }

    public static SubLObject sim_bb_question_answering_agent_p(final SubLObject sim_bb_question_answering_agent) {
        return classes.subloop_instanceof_class(sim_bb_question_answering_agent, SIM_BB_QUESTION_ANSWERING_AGENT);
    }

    public static SubLObject subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, NEXT_STATES, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, CURRENT_INTERACTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, NEW_CURRENT_INTERACTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, QUESTION_ANSWERING_AGENT_CLASS, NIL);
        return NIL;
    }

    public static SubLObject rkf_bb_sme_lexification_wizard_p(final SubLObject rkf_bb_sme_lexification_wizard) {
        return classes.subloop_instanceof_class(rkf_bb_sme_lexification_wizard, RKF_BB_SME_LEXIFICATION_WIZARD);
    }

    public static SubLObject subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, NEXT_STATES, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, CURRENT_INTERACTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, NEW_CURRENT_INTERACTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, QUESTION_ANSWERING_AGENT_CLASS, NIL);
        return NIL;
    }

    public static SubLObject rkf_uia_sme_lexification_wizard_p(final SubLObject rkf_uia_sme_lexification_wizard) {
        return classes.subloop_instanceof_class(rkf_uia_sme_lexification_wizard, RKF_UIA_SME_LEXIFICATION_WIZARD);
    }

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
        SubLObject new_actions = NIL;
        new_actions = cons(list($SHOW_TEXT, title), new_actions);
        if (NIL != error_message) {
            new_actions = cons(list($SHOW_TEXT, format(NIL, $str65$Error___a, error_message)), new_actions);
        }
        new_actions = cons(list($SHOW_TEXT, v_question), new_actions);
        if ((NIL != tip) && (NIL != cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.getDynamicValue(thread))) {
            new_actions = cons(list($SHOW_TEXT, format(NIL, $str66$Tip___a, tip)), new_actions);
        }
        final SubLObject pcase_var = question_type;
        if (pcase_var.eql($BOOLEAN)) {
            final SubLObject negative = sme_lexification_wizard.question_answering_agent_negative_choice_method(self);
            final SubLObject positive = sme_lexification_wizard.question_answering_agent_positive_choice_method(self);
            new_actions = cons(list($CHOOSE_ONE, $ANSWER, list(QUOTE, list(negative, positive))), new_actions);
        } else
            if (pcase_var.eql($ENUMERATED)) {
                new_actions = cons(list($CHOOSE_ONE, $ANSWER, choices), new_actions);
            } else
                if (pcase_var.eql($MULTIPLE_SELECTION)) {
                    new_actions = cons(list($CHOOSE_MUTIPLE, $ANSWER, choices), new_actions);
                } else
                    if (pcase_var.eql($FREE_FORM)) {
                        new_actions = cons($list75, new_actions);
                    } else
                        if (pcase_var.eql($MULTIPLE_FREE_FORM)) {
                            SubLObject cdotimes_end_var;
                            SubLObject i;
                            for (cdotimes_end_var = length(field_labels), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                new_actions = cons($list75, new_actions);
                            }
                        }




        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str77$Adding_new_actions_____S__, reverse(new_actions));
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        methods.funcall_instance_method_with_1_args(proxy, ADD_ACTIONS, reverse(new_actions));
        return NIL;
    }

    public static SubLObject rkf_bb_question_answering_agent_get_response_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proxy = sme_lexification_wizard.get_question_answering_agent_proxy(self);
        SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer(self);
        final SubLObject response = methods.funcall_instance_method_with_0_args(proxy, GET_NEXT_RESPONSE);
        if (response.first() != $ANSWER) {
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str83$Warning__, $str84$Unexpected_response_from_blackboa), response);
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            return NIL;
        }
        v_answer = second(response);
        sme_lexification_wizard.set_question_answering_agent_answer(self, v_answer);
        methods.funcall_instance_method_with_1_args(self, NOTIFY_CLIENT, $INPUT_READY);
        return v_answer;
    }

    public static SubLObject sim_bb_question_answering_agent_display_question_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sim_bb_question_answering_agent_method = NIL;
        final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices(self);
        final SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message(self);
        final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type(self);
        final SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip(self);
        final SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question(self);
        final SubLObject title = sme_lexification_wizard.get_question_answering_agent_title(self);
        try {
            thread.throwStack.push($sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                final SubLObject text_lines = list(title, $str91$);
                if (NIL != error_message) {
                    nconc(text_lines, list($str92$Error_, error_message, $str91$));
                }
                nconc(text_lines, list(v_question, $str91$));
                final SubLObject pcase_var = question_type;
                if (pcase_var.eql($BOOLEAN)) {
                    nconc(text_lines, list(format(NIL, $str93$Answer___a__s___, sme_lexification_wizard.question_answering_agent_positive_choice_method(self), sme_lexification_wizard.question_answering_agent_negative_choice_method(self))));
                } else
                    if (pcase_var.eql($ENUMERATED)) {
                        nconc(text_lines, copy_list(choices));
                        nconc(text_lines, list(format(NIL, $str94$Answer___a____a___, ONE_INTEGER, length(choices))));
                    } else
                        if (pcase_var.eql($MULTIPLE_SELECTION)) {
                            nconc(text_lines, copy_list(choices));
                            nconc(text_lines, list(format(NIL, $str95$Answer___a____a__including_ranges, ONE_INTEGER, length(choices))));
                        } else
                            if (pcase_var.eql($FREE_FORM)) {
                                nconc(text_lines, copy_list($list96));
                            } else
                                if (pcase_var.eql($MULTIPLE_FREE_FORM)) {
                                    nconc(text_lines, copy_list($list97));
                                }




                nconc(text_lines, copy_list($list98));
                if ((NIL != tip) && (NIL != cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.getDynamicValue(thread))) {
                    nconc(text_lines, list($str99$Tip_, $str91$, tip, $str91$));
                }
                file_utilities.write_text_file($blackboard_output_file$.getGlobalValue(), text_lines);
                file_utilities.append_text_file($blackboard_log_file$.getGlobalValue(), text_lines);
                file_utilities.append_text_file($blackboard_log_file$.getGlobalValue(), list($blackboard_input_delim$.getGlobalValue()));
                methods.funcall_instance_method_with_1_args(self, NOTIFY_CLIENT, $OUTPUT_DONE);
                sublisp_throw($sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sme_lexification_wizard.set_question_answering_agent_choices(self, choices);
                    sme_lexification_wizard.set_question_answering_agent_error_message(self, error_message);
                    sme_lexification_wizard.set_question_answering_agent_question_type(self, question_type);
                    sme_lexification_wizard.set_question_answering_agent_tip(self, tip);
                    sme_lexification_wizard.set_question_answering_agent_question(self, v_question);
                    sme_lexification_wizard.set_question_answering_agent_title(self, title);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sim_bb_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym90$OUTER_CATCH_FOR_SIM_BB_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sim_bb_question_answering_agent_method;
    }

    public static SubLObject sim_bb_question_answering_agent_get_response_method(final SubLObject self) {
        SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer(self);
        for (SubLObject timeout = $blackboard_timeout$.getGlobalValue(), delay = $blackboard_delay$.getGlobalValue(); (NIL == Filesys.probe_file($blackboard_input_file$.getGlobalValue())) && timeout.numG(ZERO_INTEGER); timeout = subtract(timeout, delay)) {
            sleep(delay);
        }
        if (NIL != Filesys.probe_file($blackboard_input_file$.getGlobalValue())) {
            final SubLObject user_response = file_utilities.read_text_file($blackboard_input_file$.getGlobalValue());
            v_answer = file_utilities.read_text_file($blackboard_input_file$.getGlobalValue()).first();
            sme_lexification_wizard.set_question_answering_agent_answer(self, v_answer);
            Filesys.delete_file($blackboard_input_file$.getGlobalValue());
            file_utilities.append_text_file($blackboard_log_file$.getGlobalValue(), user_response);
            file_utilities.append_text_file($blackboard_log_file$.getGlobalValue(), list($blackboard_output_delim$.getGlobalValue()));
        }
        if (NIL != Filesys.probe_file($blackboard_output_file$.getGlobalValue())) {
            Filesys.delete_file($blackboard_output_file$.getGlobalValue());
        }
        methods.funcall_instance_method_with_1_args(self, NOTIFY_CLIENT, $INPUT_READY);
        return v_answer;
    }

    public static SubLObject rkf_bb_proxy_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
        SubLObject responses = get_rkf_bb_proxy_responses(self);
        SubLObject pending_actions = get_rkf_bb_proxy_pending_actions(self);
        try {
            thread.throwStack.push($sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                sme_lexification_wizard.interface_proxy_initialize_method(self);
                pending_actions = NIL;
                responses = NIL;
                sublisp_throw($sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_bb_proxy_responses(self, responses);
                    set_rkf_bb_proxy_pending_actions(self, pending_actions);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym107$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }

    public static SubLObject rkf_bb_proxy_get_pending_actions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
        final SubLObject pending_actions = get_rkf_bb_proxy_pending_actions(self);
        try {
            thread.throwStack.push($sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                sublisp_throw($sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, pending_actions);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_bb_proxy_pending_actions(self, pending_actions);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym111$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }

    public static SubLObject rkf_bb_proxy_add_actions_method(final SubLObject self, final SubLObject new_actions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
        SubLObject pending_actions = get_rkf_bb_proxy_pending_actions(self);
        try {
            thread.throwStack.push($sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                pending_actions = append(pending_actions, new_actions);
                sublisp_throw($sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, pending_actions);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_bb_proxy_pending_actions(self, pending_actions);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }

    public static SubLObject rkf_bb_proxy_clear_actions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
        SubLObject pending_actions = get_rkf_bb_proxy_pending_actions(self);
        try {
            thread.throwStack.push($sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                pending_actions = NIL;
                sublisp_throw($sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, pending_actions);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_bb_proxy_pending_actions(self, pending_actions);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }

    public static SubLObject rkf_bb_proxy_add_user_response_method(final SubLObject self, final SubLObject new_response) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
        SubLObject responses = get_rkf_bb_proxy_responses(self);
        try {
            thread.throwStack.push($sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                responses = append(responses, list(new_response));
                sublisp_throw($sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, responses);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_bb_proxy_responses(self, responses);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym124$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }

    public static SubLObject rkf_bb_proxy_get_next_response_method(final SubLObject self) {
        SubLObject responses = get_rkf_bb_proxy_responses(self);
        final SubLObject response = responses.first();
        responses = responses.rest();
        set_rkf_bb_proxy_responses(self, responses);
        return response;
    }

    public static SubLObject rkf_bb_proxy_clear_responses_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_proxy_method = NIL;
        SubLObject responses = get_rkf_bb_proxy_responses(self);
        try {
            thread.throwStack.push($sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
            try {
                responses = NIL;
                sublisp_throw($sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD, responses);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_bb_proxy_responses(self, responses);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym130$OUTER_CATCH_FOR_RKF_BB_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_proxy_method;
    }

    public static SubLObject rkf_uia_proxy_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
        SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push($sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                sme_lexification_wizard.interface_proxy_initialize_method(self);
                interaction = NIL;
                sublisp_throw($sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym133$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }

    public static SubLObject rkf_uia_proxy_create_constant_method(final SubLObject self, final SubLObject constant_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push($sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                SubLObject constant = NIL;
                constant = ke.ke_create_now(constant_name, UNPROVIDED);
                sublisp_throw($sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, constant);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym138$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }

    public static SubLObject rkf_uia_proxy_describe_term_method(final SubLObject self, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push($sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                sublisp_throw($sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_describe_term_method(self, v_term));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym143$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }

    public static SubLObject rkf_uia_proxy_resolve_term_method(final SubLObject self, final SubLObject term_label) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push($sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                sublisp_throw($sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_resolve_term_method(self, term_label));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym148$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }

    public static SubLObject rkf_uia_proxy_mumble_method(final SubLObject self, final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push($sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                sublisp_throw($sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_mumble_method(self, message));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym153$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }

    public static SubLObject rkf_uia_proxy_forge_aheadP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push($sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                sublisp_throw($sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, sme_lexification_wizard.interface_proxy_forge_aheadP_method(self));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym157$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }

    public static SubLObject rkf_uia_proxy_end_session_method(final SubLObject self) {
        rkf_uia_proxy_end_interaction_method(self);
        return NIL;
    }

    public static SubLObject rkf_uia_proxy_get_interaction_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push($sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                sublisp_throw($sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, interaction);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }

    public static SubLObject rkf_uia_proxy_set_interaction_method(final SubLObject self, final SubLObject new_interaction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
        SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push($sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                interaction = new_interaction;
                sublisp_throw($sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym169$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }

    public static SubLObject rkf_uia_proxy_end_interaction_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_proxy_method = NIL;
        final SubLObject interaction = get_rkf_uia_proxy_interaction(self);
        try {
            thread.throwStack.push($sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
            try {
                if (NIL != interaction) {
                }
                pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rkf_uia_proxy_interaction(self, interaction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_proxy_method = Errors.handleThrowable(ccatch_env_var, $sym173$OUTER_CATCH_FOR_RKF_UIA_PROXY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_proxy_method;
    }

    public static SubLObject rkf_bb_sme_lexification_wizard_initialize_method(final SubLObject self) {
        SubLObject question_answering_agent_class = sme_lexification_wizard.get_sme_lexification_wizard_question_answering_agent_class(self);
        SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        sme_lexification_wizard.sme_lexification_wizard_initialize_method(self);
        proxy = methods.funcall_class_method_with_0_args(RKF_BB_PROXY, NEW);
        sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
        if (NIL != $simulated_blackboardP$.getGlobalValue()) {
            question_answering_agent_class = SIM_BB_QUESTION_ANSWERING_AGENT;
            sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class(self, question_answering_agent_class);
        } else {
            question_answering_agent_class = RKF_BB_QUESTION_ANSWERING_AGENT;
            sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class(self, question_answering_agent_class);
        }
        return self;
    }

    public static SubLObject rkf_bb_sme_lexification_wizard_get_pending_actions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_sme_lexification_wizard_method = NIL;
        final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        try {
            thread.throwStack.push($sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                sublisp_throw($sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD, methods.funcall_instance_method_with_0_args(proxy, GET_PENDING_ACTIONS));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym180$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_sme_lexification_wizard_method;
    }

    public static SubLObject rkf_bb_sme_lexification_wizard_clear_pending_actions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_sme_lexification_wizard_method = NIL;
        final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        try {
            thread.throwStack.push($sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(proxy, CLEAR_ACTIONS);
                sublisp_throw($sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym184$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_sme_lexification_wizard_method;
    }

    public static SubLObject rkf_bb_sme_lexification_wizard_set_user_response_method(final SubLObject self, final SubLObject response) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        final SubLObject new_current_interaction = sme_lexification_wizard.get_sme_lexification_wizard_new_current_interaction(self);
        SubLObject current_interaction = sme_lexification_wizard.get_sme_lexification_wizard_current_interaction(self);
        methods.funcall_instance_method_with_1_args(proxy, ADD_USER_RESPONSE, response);
        if (!current_interaction.eql(new_current_interaction)) {
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str83$Warning__, $str189$Issuing_shameless_hack_updating_c));
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            current_interaction = new_current_interaction;
            sme_lexification_wizard.set_sme_lexification_wizard_current_interaction(self, current_interaction);
        }
        if (NIL != current_interaction) {
            methods.funcall_instance_method_with_1_args(current_interaction, PROCESS_STATUS_UPDATE, $OUTPUT_DONE);
        }
        return T;
    }

    public static SubLObject rkf_bb_sme_lexification_wizard_clear_user_responses_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_bb_sme_lexification_wizard_method = NIL;
        final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        try {
            thread.throwStack.push($sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(proxy, CLEAR_RESPONSES);
                sublisp_throw($sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_bb_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym194$OUTER_CATCH_FOR_RKF_BB_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_bb_sme_lexification_wizard_method;
    }

    public static SubLObject rkf_uia_sme_lexification_wizard_initialize_method(final SubLObject self) {
        SubLObject question_answering_agent_class = sme_lexification_wizard.get_sme_lexification_wizard_question_answering_agent_class(self);
        SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        sme_lexification_wizard.sme_lexification_wizard_initialize_method(self);
        proxy = methods.funcall_class_method_with_0_args(RKF_UIA_PROXY, NEW);
        sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
        question_answering_agent_class = UIA_HTML_QUESTION_ANSWERING_AGENT;
        sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class(self, question_answering_agent_class);
        sme_lexification_wizard.$use_inferred_phrasesP$.setGlobalValue(T);
        cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.setDynamicValue(NIL);
        return self;
    }

    public static SubLObject rkf_uia_sme_lexification_wizard_set_interaction_method(final SubLObject self, final SubLObject new_interaction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rkf_uia_sme_lexification_wizard_method = NIL;
        final SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        try {
            thread.throwStack.push($sym201$OUTER_CATCH_FOR_RKF_UIA_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (NIL != proxy) {
                    methods.funcall_instance_method_with_1_args(proxy, SET_INTERACTION, new_interaction);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rkf_uia_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym201$OUTER_CATCH_FOR_RKF_UIA_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rkf_uia_sme_lexification_wizard_method;
    }

    public static SubLObject declare_rkf_sme_lexification_wizard_file() {
        declareFunction("get_rkf_bb_proxy_responses", "GET-RKF-BB-PROXY-RESPONSES", 1, 0, false);
        declareFunction("set_rkf_bb_proxy_responses", "SET-RKF-BB-PROXY-RESPONSES", 2, 0, false);
        declareFunction("get_rkf_bb_proxy_pending_actions", "GET-RKF-BB-PROXY-PENDING-ACTIONS", 1, 0, false);
        declareFunction("set_rkf_bb_proxy_pending_actions", "SET-RKF-BB-PROXY-PENDING-ACTIONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_rkf_bb_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_rkf_bb_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-PROXY-INSTANCE", 1, 0, false);
        declareFunction("rkf_bb_proxy_p", "RKF-BB-PROXY-P", 1, 0, false);
        declareFunction("get_rkf_uia_proxy_interaction", "GET-RKF-UIA-PROXY-INTERACTION", 1, 0, false);
        declareFunction("set_rkf_uia_proxy_interaction", "SET-RKF-UIA-PROXY-INTERACTION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_rkf_uia_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_rkf_uia_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-PROXY-INSTANCE", 1, 0, false);
        declareFunction("rkf_uia_proxy_p", "RKF-UIA-PROXY-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_rkf_bb_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_rkf_bb_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        declareFunction("rkf_bb_question_answering_agent_p", "RKF-BB-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sim_bb_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sim_bb_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-SIM-BB-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        declareFunction("sim_bb_question_answering_agent_p", "SIM-BB-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-BB-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false);
        declareFunction("rkf_bb_sme_lexification_wizard_p", "RKF-BB-SME-LEXIFICATION-WIZARD-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-RKF-UIA-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false);
        declareFunction("rkf_uia_sme_lexification_wizard_p", "RKF-UIA-SME-LEXIFICATION-WIZARD-P", 1, 0, false);
        declareFunction("rkf_bb_question_answering_agent_display_question_method", "RKF-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
        declareFunction("rkf_bb_question_answering_agent_get_response_method", "RKF-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD", 1, 0, false);
        declareFunction("sim_bb_question_answering_agent_display_question_method", "SIM-BB-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
        declareFunction("sim_bb_question_answering_agent_get_response_method", "SIM-BB-QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD", 1, 0, false);
        declareFunction("rkf_bb_proxy_initialize_method", "RKF-BB-PROXY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("rkf_bb_proxy_get_pending_actions_method", "RKF-BB-PROXY-GET-PENDING-ACTIONS-METHOD", 1, 0, false);
        declareFunction("rkf_bb_proxy_add_actions_method", "RKF-BB-PROXY-ADD-ACTIONS-METHOD", 2, 0, false);
        declareFunction("rkf_bb_proxy_clear_actions_method", "RKF-BB-PROXY-CLEAR-ACTIONS-METHOD", 1, 0, false);
        declareFunction("rkf_bb_proxy_add_user_response_method", "RKF-BB-PROXY-ADD-USER-RESPONSE-METHOD", 2, 0, false);
        declareFunction("rkf_bb_proxy_get_next_response_method", "RKF-BB-PROXY-GET-NEXT-RESPONSE-METHOD", 1, 0, false);
        declareFunction("rkf_bb_proxy_clear_responses_method", "RKF-BB-PROXY-CLEAR-RESPONSES-METHOD", 1, 0, false);
        declareFunction("rkf_uia_proxy_initialize_method", "RKF-UIA-PROXY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("rkf_uia_proxy_create_constant_method", "RKF-UIA-PROXY-CREATE-CONSTANT-METHOD", 2, 0, false);
        declareFunction("rkf_uia_proxy_describe_term_method", "RKF-UIA-PROXY-DESCRIBE-TERM-METHOD", 2, 0, false);
        declareFunction("rkf_uia_proxy_resolve_term_method", "RKF-UIA-PROXY-RESOLVE-TERM-METHOD", 2, 0, false);
        declareFunction("rkf_uia_proxy_mumble_method", "RKF-UIA-PROXY-MUMBLE-METHOD", 2, 0, false);
        declareFunction("rkf_uia_proxy_forge_aheadP_method", "RKF-UIA-PROXY-FORGE-AHEAD?-METHOD", 1, 0, false);
        declareFunction("rkf_uia_proxy_end_session_method", "RKF-UIA-PROXY-END-SESSION-METHOD", 1, 0, false);
        declareFunction("rkf_uia_proxy_get_interaction_method", "RKF-UIA-PROXY-GET-INTERACTION-METHOD", 1, 0, false);
        declareFunction("rkf_uia_proxy_set_interaction_method", "RKF-UIA-PROXY-SET-INTERACTION-METHOD", 2, 0, false);
        declareFunction("rkf_uia_proxy_end_interaction_method", "RKF-UIA-PROXY-END-INTERACTION-METHOD", 1, 0, false);
        declareFunction("rkf_bb_sme_lexification_wizard_initialize_method", "RKF-BB-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("rkf_bb_sme_lexification_wizard_get_pending_actions_method", "RKF-BB-SME-LEXIFICATION-WIZARD-GET-PENDING-ACTIONS-METHOD", 1, 0, false);
        declareFunction("rkf_bb_sme_lexification_wizard_clear_pending_actions_method", "RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-PENDING-ACTIONS-METHOD", 1, 0, false);
        declareFunction("rkf_bb_sme_lexification_wizard_set_user_response_method", "RKF-BB-SME-LEXIFICATION-WIZARD-SET-USER-RESPONSE-METHOD", 2, 0, false);
        declareFunction("rkf_bb_sme_lexification_wizard_clear_user_responses_method", "RKF-BB-SME-LEXIFICATION-WIZARD-CLEAR-USER-RESPONSES-METHOD", 1, 0, false);
        declareFunction("rkf_uia_sme_lexification_wizard_initialize_method", "RKF-UIA-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("rkf_uia_sme_lexification_wizard_set_interaction_method", "RKF-UIA-SME-LEXIFICATION-WIZARD-SET-INTERACTION-METHOD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_sme_lexification_wizard_file() {
        deflexical("*SIMULATED-BLACKBOARD?*", NIL);
        deflexical("*BLACKBOARD-INPUT-FILE*", $str0$_tmp_blackboard_input_text);
        deflexical("*BLACKBOARD-OUTPUT-FILE*", $str1$_tmp_blackboard_output_text);
        deflexical("*BLACKBOARD-LOG-FILE*", $str2$_tmp_blackboard_log_text);
        deflexical("*BLACKBOARD-INPUT-DELIM*", $str3$_________________________________);
        deflexical("*BLACKBOARD-OUTPUT-DELIM*", $str4$_________________________________);
        deflexical("*BLACKBOARD-DELAY*", TEN_INTEGER);
        deflexical("*BLACKBOARD-TIMEOUT*", $int$600);
        return NIL;
    }

    public static SubLObject setup_rkf_sme_lexification_wizard_file() {
        classes.subloop_new_class(RKF_BB_PROXY, INTERFACE_PROXY, NIL, NIL, $list8);
        classes.class_set_implements_slot_listeners(RKF_BB_PROXY, NIL);
        classes.subloop_note_class_initialization_function(RKF_BB_PROXY, SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function(RKF_BB_PROXY, SUBLOOP_RESERVED_INITIALIZE_RKF_BB_PROXY_INSTANCE);
        subloop_reserved_initialize_rkf_bb_proxy_class(RKF_BB_PROXY);
        classes.subloop_new_class(RKF_UIA_PROXY, INTERFACE_PROXY, NIL, NIL, $list18);
        classes.class_set_implements_slot_listeners(RKF_UIA_PROXY, NIL);
        classes.subloop_note_class_initialization_function(RKF_UIA_PROXY, SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function(RKF_UIA_PROXY, SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_PROXY_INSTANCE);
        subloop_reserved_initialize_rkf_uia_proxy_class(RKF_UIA_PROXY);
        classes.subloop_new_class(RKF_BB_QUESTION_ANSWERING_AGENT, QUESTION_ANSWERING_AGENT, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(RKF_BB_QUESTION_ANSWERING_AGENT, NIL);
        classes.subloop_note_class_initialization_function(RKF_BB_QUESTION_ANSWERING_AGENT, SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_CLASS);
        classes.subloop_note_instance_initialization_function(RKF_BB_QUESTION_ANSWERING_AGENT, $sym42$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_QUESTION_ANSWERING_AGENT_INSTA);
        subloop_reserved_initialize_rkf_bb_question_answering_agent_class(RKF_BB_QUESTION_ANSWERING_AGENT);
        classes.subloop_new_class(SIM_BB_QUESTION_ANSWERING_AGENT, QUESTION_ANSWERING_AGENT, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(SIM_BB_QUESTION_ANSWERING_AGENT, NIL);
        classes.subloop_note_class_initialization_function(SIM_BB_QUESTION_ANSWERING_AGENT, SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_CLASS);
        classes.subloop_note_instance_initialization_function(SIM_BB_QUESTION_ANSWERING_AGENT, $sym45$SUBLOOP_RESERVED_INITIALIZE_SIM_BB_QUESTION_ANSWERING_AGENT_INSTA);
        subloop_reserved_initialize_sim_bb_question_answering_agent_class(SIM_BB_QUESTION_ANSWERING_AGENT);
        classes.subloop_new_class(RKF_BB_SME_LEXIFICATION_WIZARD, SME_LEXIFICATION_WIZARD, NIL, NIL, $list48);
        classes.class_set_implements_slot_listeners(RKF_BB_SME_LEXIFICATION_WIZARD, NIL);
        classes.subloop_note_class_initialization_function(RKF_BB_SME_LEXIFICATION_WIZARD, SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_CLASS);
        classes.subloop_note_instance_initialization_function(RKF_BB_SME_LEXIFICATION_WIZARD, $sym56$SUBLOOP_RESERVED_INITIALIZE_RKF_BB_SME_LEXIFICATION_WIZARD_INSTAN);
        subloop_reserved_initialize_rkf_bb_sme_lexification_wizard_class(RKF_BB_SME_LEXIFICATION_WIZARD);
        classes.subloop_new_class(RKF_UIA_SME_LEXIFICATION_WIZARD, SME_LEXIFICATION_WIZARD, NIL, NIL, $list58);
        classes.class_set_implements_slot_listeners(RKF_UIA_SME_LEXIFICATION_WIZARD, NIL);
        classes.subloop_note_class_initialization_function(RKF_UIA_SME_LEXIFICATION_WIZARD, SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_CLASS);
        classes.subloop_note_instance_initialization_function(RKF_UIA_SME_LEXIFICATION_WIZARD, $sym60$SUBLOOP_RESERVED_INITIALIZE_RKF_UIA_SME_LEXIFICATION_WIZARD_INSTA);
        subloop_reserved_initialize_rkf_uia_sme_lexification_wizard_class(RKF_UIA_SME_LEXIFICATION_WIZARD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION, RKF_BB_QUESTION_ANSWERING_AGENT, $list62, NIL, $list63);
        methods.subloop_register_instance_method(RKF_BB_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION, RKF_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method(GET_RESPONSE, RKF_BB_QUESTION_ANSWERING_AGENT, $list62, NIL, $list81);
        methods.subloop_register_instance_method(RKF_BB_QUESTION_ANSWERING_AGENT, GET_RESPONSE, RKF_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION, SIM_BB_QUESTION_ANSWERING_AGENT, $list88, NIL, $list89);
        methods.subloop_register_instance_method(SIM_BB_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION, SIM_BB_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method(GET_RESPONSE, SIM_BB_QUESTION_ANSWERING_AGENT, $list62, NIL, $list102);
        methods.subloop_register_instance_method(SIM_BB_QUESTION_ANSWERING_AGENT, GET_RESPONSE, SIM_BB_QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, RKF_BB_PROXY, $list105, NIL, $list106);
        methods.subloop_register_instance_method(RKF_BB_PROXY, INITIALIZE, RKF_BB_PROXY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_PENDING_ACTIONS, RKF_BB_PROXY, $list88, NIL, $list110);
        methods.subloop_register_instance_method(RKF_BB_PROXY, GET_PENDING_ACTIONS, RKF_BB_PROXY_GET_PENDING_ACTIONS_METHOD);
        methods.methods_incorporate_instance_method(ADD_ACTIONS, RKF_BB_PROXY, $list88, $list113, $list114);
        methods.subloop_register_instance_method(RKF_BB_PROXY, ADD_ACTIONS, RKF_BB_PROXY_ADD_ACTIONS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_ACTIONS, RKF_BB_PROXY, $list88, NIL, $list118);
        methods.subloop_register_instance_method(RKF_BB_PROXY, CLEAR_ACTIONS, RKF_BB_PROXY_CLEAR_ACTIONS_METHOD);
        methods.methods_incorporate_instance_method(ADD_USER_RESPONSE, RKF_BB_PROXY, $list88, $list122, $list123);
        methods.subloop_register_instance_method(RKF_BB_PROXY, ADD_USER_RESPONSE, RKF_BB_PROXY_ADD_USER_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method(GET_NEXT_RESPONSE, RKF_BB_PROXY, $list62, NIL, $list126);
        methods.subloop_register_instance_method(RKF_BB_PROXY, GET_NEXT_RESPONSE, RKF_BB_PROXY_GET_NEXT_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_RESPONSES, RKF_BB_PROXY, $list88, NIL, $list129);
        methods.subloop_register_instance_method(RKF_BB_PROXY, CLEAR_RESPONSES, RKF_BB_PROXY_CLEAR_RESPONSES_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, RKF_UIA_PROXY, $list105, NIL, $list132);
        methods.subloop_register_instance_method(RKF_UIA_PROXY, INITIALIZE, RKF_UIA_PROXY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_CONSTANT, RKF_UIA_PROXY, $list105, $list136, $list137);
        methods.subloop_register_instance_method(RKF_UIA_PROXY, CREATE_CONSTANT, RKF_UIA_PROXY_CREATE_CONSTANT_METHOD);
        methods.methods_incorporate_instance_method(DESCRIBE_TERM, RKF_UIA_PROXY, $list105, $list141, $list142);
        methods.subloop_register_instance_method(RKF_UIA_PROXY, DESCRIBE_TERM, RKF_UIA_PROXY_DESCRIBE_TERM_METHOD);
        methods.methods_incorporate_instance_method(RESOLVE_TERM, RKF_UIA_PROXY, $list105, $list146, $list147);
        methods.subloop_register_instance_method(RKF_UIA_PROXY, RESOLVE_TERM, RKF_UIA_PROXY_RESOLVE_TERM_METHOD);
        methods.methods_incorporate_instance_method(MUMBLE, RKF_UIA_PROXY, $list88, $list151, $list152);
        methods.subloop_register_instance_method(RKF_UIA_PROXY, MUMBLE, RKF_UIA_PROXY_MUMBLE_METHOD);
        methods.methods_incorporate_instance_method($sym155$FORGE_AHEAD_, RKF_UIA_PROXY, $list88, NIL, $list156);
        methods.subloop_register_instance_method(RKF_UIA_PROXY, $sym155$FORGE_AHEAD_, $sym158$RKF_UIA_PROXY_FORGE_AHEAD__METHOD);
        methods.methods_incorporate_instance_method(END_SESSION, RKF_UIA_PROXY, $list105, NIL, $list160);
        methods.subloop_register_instance_method(RKF_UIA_PROXY, END_SESSION, RKF_UIA_PROXY_END_SESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERACTION, RKF_UIA_PROXY, $list88, NIL, $list163);
        methods.subloop_register_instance_method(RKF_UIA_PROXY, GET_INTERACTION, RKF_UIA_PROXY_GET_INTERACTION_METHOD);
        methods.methods_incorporate_instance_method(SET_INTERACTION, RKF_UIA_PROXY, $list88, $list167, $list168);
        methods.subloop_register_instance_method(RKF_UIA_PROXY, SET_INTERACTION, RKF_UIA_PROXY_SET_INTERACTION_METHOD);
        methods.methods_incorporate_instance_method(END_INTERACTION, RKF_UIA_PROXY, $list88, NIL, $list172);
        methods.subloop_register_instance_method(RKF_UIA_PROXY, END_INTERACTION, RKF_UIA_PROXY_END_INTERACTION_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, RKF_BB_SME_LEXIFICATION_WIZARD, $list175, NIL, $list176);
        methods.subloop_register_instance_method(RKF_BB_SME_LEXIFICATION_WIZARD, INITIALIZE, RKF_BB_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_PENDING_ACTIONS, RKF_BB_SME_LEXIFICATION_WIZARD, $list105, NIL, $list179);
        methods.subloop_register_instance_method(RKF_BB_SME_LEXIFICATION_WIZARD, GET_PENDING_ACTIONS, RKF_BB_SME_LEXIFICATION_WIZARD_GET_PENDING_ACTIONS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_PENDING_ACTIONS, RKF_BB_SME_LEXIFICATION_WIZARD, $list88, NIL, $list183);
        methods.subloop_register_instance_method(RKF_BB_SME_LEXIFICATION_WIZARD, CLEAR_PENDING_ACTIONS, RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_PENDING_ACTIONS_METHOD);
        methods.methods_incorporate_instance_method(SET_USER_RESPONSE, RKF_BB_SME_LEXIFICATION_WIZARD, $list175, $list187, $list188);
        methods.subloop_register_instance_method(RKF_BB_SME_LEXIFICATION_WIZARD, SET_USER_RESPONSE, RKF_BB_SME_LEXIFICATION_WIZARD_SET_USER_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_USER_RESPONSES, RKF_BB_SME_LEXIFICATION_WIZARD, $list88, NIL, $list193);
        methods.subloop_register_instance_method(RKF_BB_SME_LEXIFICATION_WIZARD, CLEAR_USER_RESPONSES, RKF_BB_SME_LEXIFICATION_WIZARD_CLEAR_USER_RESPONSES_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, RKF_UIA_SME_LEXIFICATION_WIZARD, $list175, NIL, $list196);
        methods.subloop_register_instance_method(RKF_UIA_SME_LEXIFICATION_WIZARD, INITIALIZE, RKF_UIA_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_INTERACTION, RKF_UIA_SME_LEXIFICATION_WIZARD, $list199, $list167, $list200);
        methods.subloop_register_instance_method(RKF_UIA_SME_LEXIFICATION_WIZARD, SET_INTERACTION, RKF_UIA_SME_LEXIFICATION_WIZARD_SET_INTERACTION_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_sme_lexification_wizard_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_sme_lexification_wizard_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_sme_lexification_wizard_file();
    }

    
}

/**
 * Total time: 525 ms
 */
