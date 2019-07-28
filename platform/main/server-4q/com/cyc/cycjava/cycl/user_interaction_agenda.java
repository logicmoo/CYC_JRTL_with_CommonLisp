package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.rtp.rtp_datastructures;
import com.cyc.cycjava.cycl.user_interaction_agenda;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.user_interaction_agenda.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class user_interaction_agenda extends SubLTranslatedFile {
    public static final SubLFile me = new user_interaction_agenda();

    public static final String myName = "com.cyc.cycjava.cycl.user_interaction_agenda";

    public static final String myFingerPrint = "503867d3bb94238bacd2f94049253363ff7cce866a8685e151bdbd8827acee7b";



    // deflexical
    private static final SubLSymbol $user_interaction_modes$ = makeSymbol("*USER-INTERACTION-MODES*");

    // deflexical
    private static final SubLSymbol $user_interaction_statuses$ = makeSymbol("*USER-INTERACTION-STATUSES*");

    // defconstant
    public static final SubLSymbol $dtp_user_interaction$ = makeSymbol("*DTP-USER-INTERACTION*");

    // defconstant
    public static final SubLSymbol $dtp_user_interaction_agenda$ = makeSymbol("*DTP-USER-INTERACTION-AGENDA*");

    // defparameter
    public static final SubLSymbol $uia_can_treat_comments_as_mumblingP$ = makeSymbol("*UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?*");

    // defconstant
    public static final SubLSymbol $dtp_user_interaction_meta_agenda$ = makeSymbol("*DTP-USER-INTERACTION-META-AGENDA*");









    // defparameter
    public static final SubLSymbol $uia_frameless_environmentP$ = makeSymbol("*UIA-FRAMELESS-ENVIRONMENT?*");

    // deflexical
    private static final SubLSymbol $invalid_ui_signature$ = makeSymbol("*INVALID-UI-SIGNATURE*");

    // deflexical
    // The canonical invalid ui request
    private static final SubLSymbol $invalid_ui_request$ = makeSymbol("*INVALID-UI-REQUEST*");

    // Internal Constants
    public static final SubLSymbol $uia_lock$ = makeSymbol("*UIA-LOCK*");

    public static final SubLString $$$User_Interaction_Agenda_lock = makeString("User Interaction Agenda lock");



    public static final SubLList $list3 = list(makeSymbol("*UIA-LOCK*"));

    public static final SubLList $list4 = list(makeKeyword("UNDO"), makeKeyword("MESSAGE"), makeKeyword("REQUIRED"), makeKeyword("RELEVANT"), makeKeyword("POSSIBLE"), makeKeyword("COMMENT"));

    public static final SubLList $list5 = list(makeKeyword("BLOCKED"), makeKeyword("PENDING"), makeKeyword("COMPLETED"), makeKeyword("REJECTED"), makeKeyword("INVALIDATED"));

    public static final SubLSymbol USER_INTERACTION = makeSymbol("USER-INTERACTION");



    public static final SubLList $list8 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("AGENDA"), makeSymbol("MODE"), makeSymbol("STATUS"), makeSymbol("START-TIME"), makeSymbol("FINISH-TIME"), makeSymbol("PARENT-INTERACTION"), makeSymbol("CHILD-INTERACTIONS"), makeSymbol("OPERATOR"), makeSymbol("ARGS"), makeSymbol("RESULT"), makeSymbol("STATE") });

    public static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("AGENDA"), makeKeyword("MODE"), makeKeyword("STATUS"), makeKeyword("START-TIME"), makeKeyword("FINISH-TIME"), makeKeyword("PARENT-INTERACTION"), makeKeyword("CHILD-INTERACTIONS"), makeKeyword("OPERATOR"), makeKeyword("ARGS"), makeKeyword("RESULT"), makeKeyword("STATE") });

    public static final SubLList $list10 = list(new SubLObject[]{ makeSymbol("UI-ID"), makeSymbol("UI-AGENDA"), makeSymbol("UI-MODE"), makeSymbol("UI-STATUS"), makeSymbol("UI-START-TIME"), makeSymbol("UI-FINISH-TIME"), makeSymbol("UI-PARENT-INTERACTION"), makeSymbol("UI-CHILD-INTERACTIONS"), makeSymbol("UI-OPERATOR"), makeSymbol("UI-ARGS"), makeSymbol("UI-RESULT"), makeSymbol("UI-STATE") });

    public static final SubLList $list11 = list(new SubLObject[]{ makeSymbol("_CSETF-UI-ID"), makeSymbol("_CSETF-UI-AGENDA"), makeSymbol("_CSETF-UI-MODE"), makeSymbol("_CSETF-UI-STATUS"), makeSymbol("_CSETF-UI-START-TIME"), makeSymbol("_CSETF-UI-FINISH-TIME"), makeSymbol("_CSETF-UI-PARENT-INTERACTION"), makeSymbol("_CSETF-UI-CHILD-INTERACTIONS"), makeSymbol("_CSETF-UI-OPERATOR"), makeSymbol("_CSETF-UI-ARGS"), makeSymbol("_CSETF-UI-RESULT"), makeSymbol("_CSETF-UI-STATE") });

    public static final SubLSymbol PRINT_USER_INTERACTION = makeSymbol("PRINT-USER-INTERACTION");

    public static final SubLSymbol USER_INTERACTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("USER-INTERACTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list14 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("USER-INTERACTION-P"));



    private static final SubLSymbol _CSETF_UI_ID = makeSymbol("_CSETF-UI-ID");



    private static final SubLSymbol _CSETF_UI_AGENDA = makeSymbol("_CSETF-UI-AGENDA");

    private static final SubLSymbol UI_MODE = makeSymbol("UI-MODE");

    private static final SubLSymbol _CSETF_UI_MODE = makeSymbol("_CSETF-UI-MODE");

    private static final SubLSymbol UI_STATUS = makeSymbol("UI-STATUS");

    private static final SubLSymbol _CSETF_UI_STATUS = makeSymbol("_CSETF-UI-STATUS");

    private static final SubLSymbol UI_START_TIME = makeSymbol("UI-START-TIME");

    private static final SubLSymbol _CSETF_UI_START_TIME = makeSymbol("_CSETF-UI-START-TIME");

    private static final SubLSymbol UI_FINISH_TIME = makeSymbol("UI-FINISH-TIME");

    private static final SubLSymbol _CSETF_UI_FINISH_TIME = makeSymbol("_CSETF-UI-FINISH-TIME");

    private static final SubLSymbol UI_PARENT_INTERACTION = makeSymbol("UI-PARENT-INTERACTION");

    private static final SubLSymbol _CSETF_UI_PARENT_INTERACTION = makeSymbol("_CSETF-UI-PARENT-INTERACTION");

    private static final SubLSymbol UI_CHILD_INTERACTIONS = makeSymbol("UI-CHILD-INTERACTIONS");

    private static final SubLSymbol _CSETF_UI_CHILD_INTERACTIONS = makeSymbol("_CSETF-UI-CHILD-INTERACTIONS");

    private static final SubLSymbol UI_OPERATOR = makeSymbol("UI-OPERATOR");

    private static final SubLSymbol _CSETF_UI_OPERATOR = makeSymbol("_CSETF-UI-OPERATOR");

    private static final SubLSymbol UI_ARGS = makeSymbol("UI-ARGS");

    private static final SubLSymbol _CSETF_UI_ARGS = makeSymbol("_CSETF-UI-ARGS");

    private static final SubLSymbol UI_RESULT = makeSymbol("UI-RESULT");

    private static final SubLSymbol _CSETF_UI_RESULT = makeSymbol("_CSETF-UI-RESULT");

    private static final SubLSymbol UI_STATE = makeSymbol("UI-STATE");

    private static final SubLSymbol _CSETF_UI_STATE = makeSymbol("_CSETF-UI-STATE");

























    private static final SubLString $str51$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_USER_INTERACTION = makeSymbol("MAKE-USER-INTERACTION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-METHOD");

    private static final SubLSymbol SXHASH_USER_INTERACTION_METHOD = makeSymbol("SXHASH-USER-INTERACTION-METHOD");

    private static final SubLString $str58$__UI__A__A__S_ = makeString("#<UI ~A:~A:~S>");

    private static final SubLSymbol USER_INTERACTION_AGENDA_P = makeSymbol("USER-INTERACTION-AGENDA-P");

    private static final SubLSymbol USER_INTERACTION_MODE_P = makeSymbol("USER-INTERACTION-MODE-P");

    private static final SubLSymbol UI_OPERATOR_P = makeSymbol("UI-OPERATOR-P");



    private static final SubLSymbol USER_INTERACTION_STATUS_P = makeSymbol("USER-INTERACTION-STATUS-P");



    private static final SubLSymbol USER_INTERACTION_AGENDA = makeSymbol("USER-INTERACTION-AGENDA");

    private static final SubLList $list66 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("META-AGENDA"), makeSymbol("ISG"), makeSymbol("INDEX"), makeSymbol("HISTORY"), makeSymbol("UNDOS"), makeSymbol("MESSAGES"), makeSymbol("REQUIREMENTS"), makeSymbol("RELEVANT-SUGGESTIONS"), makeSymbol("POSSIBLE-SUGGESTIONS"), makeSymbol("COMMENTS"), makeSymbol("STATE") });

    private static final SubLList $list67 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("META-AGENDA"), makeKeyword("ISG"), makeKeyword("INDEX"), makeKeyword("HISTORY"), makeKeyword("UNDOS"), makeKeyword("MESSAGES"), makeKeyword("REQUIREMENTS"), makeKeyword("RELEVANT-SUGGESTIONS"), makeKeyword("POSSIBLE-SUGGESTIONS"), makeKeyword("COMMENTS"), makeKeyword("STATE") });

    private static final SubLList $list68 = list(new SubLObject[]{ makeSymbol("UIA-ID"), makeSymbol("UIA-META-AGENDA"), makeSymbol("UIA-ISG"), makeSymbol("UIA-INDEX"), makeSymbol("UIA-HISTORY"), makeSymbol("UIA-UNDOS"), makeSymbol("UIA-MESSAGES"), makeSymbol("UIA-REQUIREMENTS"), makeSymbol("UIA-RELEVANT-SUGGESTIONS"), makeSymbol("UIA-POSSIBLE-SUGGESTIONS"), makeSymbol("UIA-COMMENTS"), makeSymbol("UIA-STATE") });

    private static final SubLList $list69 = list(new SubLObject[]{ makeSymbol("_CSETF-UIA-ID"), makeSymbol("_CSETF-UIA-META-AGENDA"), makeSymbol("_CSETF-UIA-ISG"), makeSymbol("_CSETF-UIA-INDEX"), makeSymbol("_CSETF-UIA-HISTORY"), makeSymbol("_CSETF-UIA-UNDOS"), makeSymbol("_CSETF-UIA-MESSAGES"), makeSymbol("_CSETF-UIA-REQUIREMENTS"), makeSymbol("_CSETF-UIA-RELEVANT-SUGGESTIONS"), makeSymbol("_CSETF-UIA-POSSIBLE-SUGGESTIONS"), makeSymbol("_CSETF-UIA-COMMENTS"), makeSymbol("_CSETF-UIA-STATE") });

    private static final SubLSymbol PRINT_USER_INTERACTION_AGENDA = makeSymbol("PRINT-USER-INTERACTION-AGENDA");

    private static final SubLSymbol USER_INTERACTION_AGENDA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("USER-INTERACTION-AGENDA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list72 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("USER-INTERACTION-AGENDA-P"));

    private static final SubLSymbol UIA_ID = makeSymbol("UIA-ID");

    private static final SubLSymbol _CSETF_UIA_ID = makeSymbol("_CSETF-UIA-ID");

    private static final SubLSymbol UIA_META_AGENDA = makeSymbol("UIA-META-AGENDA");

    private static final SubLSymbol _CSETF_UIA_META_AGENDA = makeSymbol("_CSETF-UIA-META-AGENDA");

    private static final SubLSymbol UIA_ISG = makeSymbol("UIA-ISG");

    private static final SubLSymbol _CSETF_UIA_ISG = makeSymbol("_CSETF-UIA-ISG");

    private static final SubLSymbol UIA_INDEX = makeSymbol("UIA-INDEX");

    private static final SubLSymbol _CSETF_UIA_INDEX = makeSymbol("_CSETF-UIA-INDEX");

    private static final SubLSymbol UIA_HISTORY = makeSymbol("UIA-HISTORY");

    private static final SubLSymbol _CSETF_UIA_HISTORY = makeSymbol("_CSETF-UIA-HISTORY");

    private static final SubLSymbol UIA_UNDOS = makeSymbol("UIA-UNDOS");

    private static final SubLSymbol _CSETF_UIA_UNDOS = makeSymbol("_CSETF-UIA-UNDOS");

    private static final SubLSymbol UIA_MESSAGES = makeSymbol("UIA-MESSAGES");

    private static final SubLSymbol _CSETF_UIA_MESSAGES = makeSymbol("_CSETF-UIA-MESSAGES");

    private static final SubLSymbol UIA_REQUIREMENTS = makeSymbol("UIA-REQUIREMENTS");

    private static final SubLSymbol _CSETF_UIA_REQUIREMENTS = makeSymbol("_CSETF-UIA-REQUIREMENTS");

    private static final SubLSymbol UIA_RELEVANT_SUGGESTIONS = makeSymbol("UIA-RELEVANT-SUGGESTIONS");

    private static final SubLSymbol _CSETF_UIA_RELEVANT_SUGGESTIONS = makeSymbol("_CSETF-UIA-RELEVANT-SUGGESTIONS");

    private static final SubLSymbol UIA_POSSIBLE_SUGGESTIONS = makeSymbol("UIA-POSSIBLE-SUGGESTIONS");

    private static final SubLSymbol _CSETF_UIA_POSSIBLE_SUGGESTIONS = makeSymbol("_CSETF-UIA-POSSIBLE-SUGGESTIONS");

    private static final SubLSymbol UIA_COMMENTS = makeSymbol("UIA-COMMENTS");

    private static final SubLSymbol _CSETF_UIA_COMMENTS = makeSymbol("_CSETF-UIA-COMMENTS");

    private static final SubLSymbol UIA_STATE = makeSymbol("UIA-STATE");

    private static final SubLSymbol _CSETF_UIA_STATE = makeSymbol("_CSETF-UIA-STATE");





















    private static final SubLSymbol MAKE_USER_INTERACTION_AGENDA = makeSymbol("MAKE-USER-INTERACTION-AGENDA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_AGENDA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-AGENDA-METHOD");

    private static final SubLSymbol SXHASH_USER_INTERACTION_AGENDA_METHOD = makeSymbol("SXHASH-USER-INTERACTION-AGENDA-METHOD");

    private static final SubLString $str110$__UIA__A_ = makeString("#<UIA ~A>");

    private static final SubLSymbol USER_INTERACTION_META_AGENDA_P = makeSymbol("USER-INTERACTION-META-AGENDA-P");



    private static final SubLSymbol $sym113$_ = makeSymbol("<");









    private static final SubLSymbol $sym118$_UIA_CAN_TREAT_COMMENTS_AS_MUMBLING__ = makeSymbol("*UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?*");













    private static final SubLString $str125$_S__S = makeString("~S ~S");



    private static final SubLObject $$mainFocusOfUIASession = reader_make_constant_shell(makeString("mainFocusOfUIASession"));

    private static final SubLList $list128 = list(makeKeyword("TOPIC"));



    private static final SubLList $list130 = list(list(makeSymbol("UIA"), makeSymbol("UIMA")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol UIMA_OPEN_AGENDAS_SEQUENCE = makeSymbol("UIMA-OPEN-AGENDAS-SEQUENCE");

    private static final SubLList $list133 = list(list(makeSymbol("UI"), makeSymbol("UIA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol UIA_INTERACTION_SEQUENCE = makeSymbol("UIA-INTERACTION-SEQUENCE");

    private static final SubLSymbol $LANGUAGE_PARSING_MT = makeKeyword("LANGUAGE-PARSING-MT");



    private static final SubLSymbol $LANGUAGE_GENERATION_MT = makeKeyword("LANGUAGE-GENERATION-MT");

    private static final SubLSymbol $LANGUAGE_LEXICAL_MT = makeKeyword("LANGUAGE-LEXICAL-MT");







    private static final SubLSymbol $ALL_INTERACTION_MTS = makeKeyword("ALL-INTERACTION-MTS");

    private static final SubLSymbol $DOMAIN_INTERACTION_MT = makeKeyword("DOMAIN-INTERACTION-MT");

    private static final SubLSymbol $PARSING_INTERACTION_MT = makeKeyword("PARSING-INTERACTION-MT");

    private static final SubLSymbol $GENERATION_INTERACTION_MT = makeKeyword("GENERATION-INTERACTION-MT");

    private static final SubLSymbol $LEXICAL_INTERACTION_MT = makeKeyword("LEXICAL-INTERACTION-MT");

    private static final SubLObject $$EnglishTemplateMt = reader_make_constant_shell(makeString("EnglishTemplateMt"));

    private static final SubLObject $$EnglishParaphraseMt = reader_make_constant_shell(makeString("EnglishParaphraseMt"));

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    private static final SubLSymbol $SCENARIO_INTERACTION_CONTEXT = makeKeyword("SCENARIO-INTERACTION-CONTEXT");

    private static final SubLSymbol USER_INTERACTION_META_AGENDA = makeSymbol("USER-INTERACTION-META-AGENDA");

    private static final SubLList $list152 = list(makeSymbol("ID"), makeSymbol("ISG"), makeSymbol("INDEX"), makeSymbol("OPEN-AGENDAS"), makeSymbol("CURRENT-AGENDA"), makeSymbol("STATE"));

    private static final SubLList $list153 = list(makeKeyword("ID"), makeKeyword("ISG"), makeKeyword("INDEX"), makeKeyword("OPEN-AGENDAS"), makeKeyword("CURRENT-AGENDA"), makeKeyword("STATE"));

    private static final SubLList $list154 = list(makeSymbol("UIMA-ID"), makeSymbol("UIMA-ISG"), makeSymbol("UIMA-INDEX"), makeSymbol("UIMA-OPEN-AGENDAS"), makeSymbol("UIMA-CURRENT-AGENDA"), makeSymbol("UIMA-STATE"));

    private static final SubLList $list155 = list(makeSymbol("_CSETF-UIMA-ID"), makeSymbol("_CSETF-UIMA-ISG"), makeSymbol("_CSETF-UIMA-INDEX"), makeSymbol("_CSETF-UIMA-OPEN-AGENDAS"), makeSymbol("_CSETF-UIMA-CURRENT-AGENDA"), makeSymbol("_CSETF-UIMA-STATE"));



    private static final SubLSymbol USER_INTERACTION_META_AGENDA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("USER-INTERACTION-META-AGENDA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list158 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("USER-INTERACTION-META-AGENDA-P"));

    private static final SubLSymbol UIMA_ID = makeSymbol("UIMA-ID");

    private static final SubLSymbol _CSETF_UIMA_ID = makeSymbol("_CSETF-UIMA-ID");

    private static final SubLSymbol UIMA_ISG = makeSymbol("UIMA-ISG");

    private static final SubLSymbol _CSETF_UIMA_ISG = makeSymbol("_CSETF-UIMA-ISG");

    private static final SubLSymbol UIMA_INDEX = makeSymbol("UIMA-INDEX");

    private static final SubLSymbol _CSETF_UIMA_INDEX = makeSymbol("_CSETF-UIMA-INDEX");

    private static final SubLSymbol UIMA_OPEN_AGENDAS = makeSymbol("UIMA-OPEN-AGENDAS");

    private static final SubLSymbol _CSETF_UIMA_OPEN_AGENDAS = makeSymbol("_CSETF-UIMA-OPEN-AGENDAS");

    private static final SubLSymbol UIMA_CURRENT_AGENDA = makeSymbol("UIMA-CURRENT-AGENDA");

    private static final SubLSymbol _CSETF_UIMA_CURRENT_AGENDA = makeSymbol("_CSETF-UIMA-CURRENT-AGENDA");

    private static final SubLSymbol UIMA_STATE = makeSymbol("UIMA-STATE");

    private static final SubLSymbol _CSETF_UIMA_STATE = makeSymbol("_CSETF-UIMA-STATE");





    private static final SubLSymbol MAKE_USER_INTERACTION_META_AGENDA = makeSymbol("MAKE-USER-INTERACTION-META-AGENDA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_META_AGENDA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-META-AGENDA-METHOD");

    private static final SubLList $list175 = list(list(makeSymbol("UIMA"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list176 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym179$ID = makeUninternedSymbol("ID");



    private static final SubLList $list181 = list(makeSymbol("SYSTEM-UIMMA"));



    private static final SubLSymbol SYSTEM_UIMMA = makeSymbol("SYSTEM-UIMMA");

    private static final SubLSymbol DO_UIMAS = makeSymbol("DO-UIMAS");

    private static final SubLSymbol $uimma$ = makeSymbol("*UIMMA*");

    private static final SubLSymbol $uimma_default_locale$ = makeSymbol("*UIMMA-DEFAULT-LOCALE*");

    private static final SubLObject $$EnglishLanguage = reader_make_constant_shell(makeString("EnglishLanguage"));

    private static final SubLSymbol $uimma_default_generation_mt$ = makeSymbol("*UIMMA-DEFAULT-GENERATION-MT*");

    private static final SubLSymbol $uimma_default_domain_mt$ = makeSymbol("*UIMMA-DEFAULT-DOMAIN-MT*");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLList $list192 = list(list(makeSymbol("AGENDA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym193$STATE = makeUninternedSymbol("STATE");



    private static final SubLSymbol UIA_MEMOIZATION_STATE = makeSymbol("UIA-MEMOIZATION-STATE");





    private static final SubLList $list198 = list(list(makeSymbol("META-AGENDA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym199$STATE = makeUninternedSymbol("STATE");

    private static final SubLSymbol UIMA_MEMOIZATION_STATE = makeSymbol("UIMA-MEMOIZATION-STATE");









    private static final SubLSymbol UIA_PENDING_ACTION_P = makeSymbol("UIA-PENDING-ACTION-P");

    private static final SubLSymbol UIA_SIGNATURE_P = makeSymbol("UIA-SIGNATURE-P");

    public static final SubLList $list207 = list(makeSymbol("META-AGENDA-ID"), makeSymbol("AGENDA-ID"));

    private static final SubLSymbol UI_SIGNATURE_P = makeSymbol("UI-SIGNATURE-P");

    private static final SubLList $list209 = list(makeSymbol("UIMA"), makeSymbol("UIA"), makeSymbol("UI"));







    private static final SubLList $list213 = list(makeSymbol("META-AGENDA-ID"), makeSymbol("AGENDA-ID"), makeSymbol("INTERACTION-ID"));

    private static final SubLSymbol $FRAMES_FOR_REFRESH = makeKeyword("FRAMES-FOR-REFRESH");



















    private static final SubLList $list224 = list(makeSymbol("FRAME"), makeSymbol("AGENDA"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol UIA_SCHEDULE_FRAME_FOR_REFRESH = makeSymbol("UIA-SCHEDULE-FRAME-FOR-REFRESH");



    private static final SubLList $list228 = listS(makeSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeSymbol("SIGNATURE"), makeSymbol("PLIST"));

    private static final SubLList $list229 = list(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);





    private static final SubLSymbol UI_ACTION_TYPE_P = makeSymbol("UI-ACTION-TYPE-P");











    public static SubLObject with_uia_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list3, append(body, NIL));
    }

    public static SubLObject user_interaction_mode_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(find(v_object, $user_interaction_modes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject user_interaction_status_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(find(v_object, $user_interaction_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject ui_operator_p(final SubLObject v_object) {
        return keywordp(v_object);
    }

    public static SubLObject user_interaction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_user_interaction(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject user_interaction_p(final SubLObject v_object) {
        return v_object.getClass() == user_interaction_agenda.$user_interaction_native.class ? T : NIL;
    }

    public static SubLObject ui_id(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject ui_agenda(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject ui_mode(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject ui_status(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject ui_start_time(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject ui_finish_time(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject ui_parent_interaction(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject ui_child_interactions(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject ui_operator(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject ui_args(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject ui_result(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject ui_state(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_ui_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ui_agenda(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ui_mode(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ui_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ui_start_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ui_finish_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ui_parent_interaction(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_ui_child_interactions(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_ui_operator(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_ui_args(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_ui_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_ui_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "user_interaction_agenda.user_interaction_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_user_interaction(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new user_interaction_agenda.$user_interaction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_ui_id(v_new, current_value);
            } else
                if (pcase_var.eql($AGENDA)) {
                    _csetf_ui_agenda(v_new, current_value);
                } else
                    if (pcase_var.eql($MODE)) {
                        _csetf_ui_mode(v_new, current_value);
                    } else
                        if (pcase_var.eql($STATUS)) {
                            _csetf_ui_status(v_new, current_value);
                        } else
                            if (pcase_var.eql($START_TIME)) {
                                _csetf_ui_start_time(v_new, current_value);
                            } else
                                if (pcase_var.eql($FINISH_TIME)) {
                                    _csetf_ui_finish_time(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PARENT_INTERACTION)) {
                                        _csetf_ui_parent_interaction(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($CHILD_INTERACTIONS)) {
                                            _csetf_ui_child_interactions(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($OPERATOR)) {
                                                _csetf_ui_operator(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($ARGS)) {
                                                    _csetf_ui_args(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($RESULT)) {
                                                        _csetf_ui_result(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($STATE)) {
                                                            _csetf_ui_state(v_new, current_value);
                                                        } else {
                                                            Errors.error($str51$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_user_interaction(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_USER_INTERACTION, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, ui_id(obj));
        funcall(visitor_fn, obj, $SLOT, $AGENDA, ui_agenda(obj));
        funcall(visitor_fn, obj, $SLOT, $MODE, ui_mode(obj));
        funcall(visitor_fn, obj, $SLOT, $STATUS, ui_status(obj));
        funcall(visitor_fn, obj, $SLOT, $START_TIME, ui_start_time(obj));
        funcall(visitor_fn, obj, $SLOT, $FINISH_TIME, ui_finish_time(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT_INTERACTION, ui_parent_interaction(obj));
        funcall(visitor_fn, obj, $SLOT, $CHILD_INTERACTIONS, ui_child_interactions(obj));
        funcall(visitor_fn, obj, $SLOT, $OPERATOR, ui_operator(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGS, ui_args(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT, ui_result(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, ui_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_USER_INTERACTION, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_user_interaction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_user_interaction(obj, visitor_fn);
    }

    public static SubLObject sxhash_user_interaction_method(final SubLObject v_object) {
        return Sxhash.sxhash(ui_id(v_object));
    }

    public static SubLObject print_user_interaction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str58$__UI__A__A__S_, new SubLObject[]{ ui_id(v_object), ui_operator(v_object), ui_args(v_object) });
        return v_object;
    }

    public static SubLObject new_ui(final SubLObject v_agenda, final SubLObject mode, final SubLObject operator, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_mode_p(mode) : "user_interaction_agenda.user_interaction_mode_p(mode) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_mode_p(mode) " + mode;
        assert NIL != ui_operator_p(operator) : "user_interaction_agenda.ui_operator_p(operator) " + "CommonSymbols.NIL != user_interaction_agenda.ui_operator_p(operator) " + operator;
        assert NIL != listp(args) : "Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) " + args;
        final SubLObject interaction = make_user_interaction(UNPROVIDED);
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(uia_isg(v_agenda));
        _csetf_ui_id(interaction, id);
        _csetf_ui_agenda(interaction, v_agenda);
        _csetf_ui_operator(interaction, operator);
        _csetf_ui_args(interaction, args);
        ui_note_mode(interaction, mode);
        uia_add_to_index(v_agenda, id, interaction);
        ui_note_start_time(interaction, get_universal_time());
        return interaction;
    }

    public static SubLObject ui_note_mode(final SubLObject interaction, final SubLObject mode) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        assert NIL != user_interaction_mode_p(mode) : "user_interaction_agenda.user_interaction_mode_p(mode) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_mode_p(mode) " + mode;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_mode(interaction, mode);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_status(final SubLObject interaction, final SubLObject status) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        assert NIL != user_interaction_status_p(status) : "user_interaction_agenda.user_interaction_status_p(status) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_status_p(status) " + status;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_status(interaction, status);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_start_time(final SubLObject interaction, final SubLObject start_time) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        assert NIL != integerp(start_time) : "Types.integerp(start_time) " + "CommonSymbols.NIL != Types.integerp(start_time) " + start_time;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_start_time(interaction, start_time);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_finish_time(final SubLObject interaction, final SubLObject finish_time) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        assert NIL != integerp(finish_time) : "Types.integerp(finish_time) " + "CommonSymbols.NIL != Types.integerp(finish_time) " + finish_time;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_finish_time(interaction, finish_time);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_parent(final SubLObject interaction, final SubLObject parent) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        assert NIL != user_interaction_p(parent) : "user_interaction_agenda.user_interaction_p(parent) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(parent) " + parent;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_parent_interaction(interaction, parent);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static SubLObject ui_add_child(final SubLObject interaction, final SubLObject child) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        assert NIL != user_interaction_p(child) : "user_interaction_agenda.user_interaction_p(child) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(child) " + child;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            if (NIL == member(child, ui_child_interactions(interaction), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ui_child_interactions(interaction, cons(child, ui_child_interactions(interaction)));
            }
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_result(final SubLObject interaction, final SubLObject result) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_result(interaction, result);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_state(final SubLObject interaction, final SubLObject state) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_state(interaction, state);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static SubLObject user_interaction_agenda_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_user_interaction_agenda(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject user_interaction_agenda_p(final SubLObject v_object) {
        return v_object.getClass() == user_interaction_agenda.$user_interaction_agenda_native.class ? T : NIL;
    }

    public static SubLObject uia_id(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject uia_meta_agenda(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject uia_isg(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject uia_index(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject uia_history(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject uia_undos(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject uia_messages(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject uia_requirements(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject uia_relevant_suggestions(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject uia_possible_suggestions(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject uia_comments(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject uia_state(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_uia_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_uia_meta_agenda(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_uia_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_uia_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_uia_history(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_uia_undos(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_uia_messages(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_uia_requirements(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_uia_relevant_suggestions(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_uia_possible_suggestions(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_uia_comments(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_uia_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "user_interaction_agenda.user_interaction_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_user_interaction_agenda(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new user_interaction_agenda.$user_interaction_agenda_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_uia_id(v_new, current_value);
            } else
                if (pcase_var.eql($META_AGENDA)) {
                    _csetf_uia_meta_agenda(v_new, current_value);
                } else
                    if (pcase_var.eql($ISG)) {
                        _csetf_uia_isg(v_new, current_value);
                    } else
                        if (pcase_var.eql($INDEX)) {
                            _csetf_uia_index(v_new, current_value);
                        } else
                            if (pcase_var.eql($HISTORY)) {
                                _csetf_uia_history(v_new, current_value);
                            } else
                                if (pcase_var.eql($UNDOS)) {
                                    _csetf_uia_undos(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MESSAGES)) {
                                        _csetf_uia_messages(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($REQUIREMENTS)) {
                                            _csetf_uia_requirements(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($RELEVANT_SUGGESTIONS)) {
                                                _csetf_uia_relevant_suggestions(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($POSSIBLE_SUGGESTIONS)) {
                                                    _csetf_uia_possible_suggestions(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($COMMENTS)) {
                                                        _csetf_uia_comments(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($STATE)) {
                                                            _csetf_uia_state(v_new, current_value);
                                                        } else {
                                                            Errors.error($str51$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_user_interaction_agenda(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_USER_INTERACTION_AGENDA, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, uia_id(obj));
        funcall(visitor_fn, obj, $SLOT, $META_AGENDA, uia_meta_agenda(obj));
        funcall(visitor_fn, obj, $SLOT, $ISG, uia_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX, uia_index(obj));
        funcall(visitor_fn, obj, $SLOT, $HISTORY, uia_history(obj));
        funcall(visitor_fn, obj, $SLOT, $UNDOS, uia_undos(obj));
        funcall(visitor_fn, obj, $SLOT, $MESSAGES, uia_messages(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIREMENTS, uia_requirements(obj));
        funcall(visitor_fn, obj, $SLOT, $RELEVANT_SUGGESTIONS, uia_relevant_suggestions(obj));
        funcall(visitor_fn, obj, $SLOT, $POSSIBLE_SUGGESTIONS, uia_possible_suggestions(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENTS, uia_comments(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, uia_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_USER_INTERACTION_AGENDA, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_user_interaction_agenda_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_user_interaction_agenda(obj, visitor_fn);
    }

    public static SubLObject sxhash_user_interaction_agenda_method(final SubLObject v_object) {
        return Sxhash.sxhash(uia_id(v_object));
    }

    public static SubLObject print_user_interaction_agenda(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str110$__UIA__A_, uia_id(v_object));
        return v_object;
    }

    public static SubLObject new_uia(final SubLObject meta_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        final SubLObject v_agenda = make_user_interaction_agenda(UNPROVIDED);
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(uima_isg(meta_agenda));
        _csetf_uia_id(v_agenda, id);
        _csetf_uia_meta_agenda(v_agenda, meta_agenda);
        _csetf_uia_isg(v_agenda, integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        _csetf_uia_index(v_agenda, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        _csetf_uia_history(v_agenda, queues.create_queue(UNPROVIDED));
        _csetf_uia_undos(v_agenda, stacks.create_stack());
        _csetf_uia_messages(v_agenda, queues.create_queue(UNPROVIDED));
        _csetf_uia_requirements(v_agenda, stacks.create_stack());
        _csetf_uia_relevant_suggestions(v_agenda, stacks.create_stack());
        _csetf_uia_possible_suggestions(v_agenda, queues.create_queue(UNPROVIDED));
        _csetf_uia_comments(v_agenda, queues.create_queue(UNPROVIDED));
        uia_state_clear_all(v_agenda);
        uima_add_to_index(meta_agenda, id, v_agenda);
        return v_agenda;
    }

    public static SubLObject uia_reset(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            integer_sequence_generator.integer_sequence_generator_reset(uia_isg(v_agenda));
            dictionary.clear_dictionary(uia_index(v_agenda));
            queues.clear_queue(uia_history(v_agenda));
            stacks.clear_stack(uia_undos(v_agenda));
            queues.clear_queue(uia_messages(v_agenda));
            stacks.clear_stack(uia_requirements(v_agenda));
            stacks.clear_stack(uia_relevant_suggestions(v_agenda));
            queues.clear_queue(uia_possible_suggestions(v_agenda));
            queues.clear_queue(uia_comments(v_agenda));
            uia_state_clear_all(v_agenda);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_find_by_id(final SubLObject v_agenda, final SubLObject id) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return dictionary.dictionary_lookup(uia_index(v_agenda), id, UNPROVIDED);
    }

    public static SubLObject uia_find_by_id_string(final SubLObject v_agenda, final SubLObject id_string) {
        assert NIL != stringp(id_string) : "Types.stringp(id_string) " + "CommonSymbols.NIL != Types.stringp(id_string) " + id_string;
        return uia_find_by_id(v_agenda, parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject uia_some_interaction_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return makeBoolean(NIL == dictionary.dictionary_empty_p(uia_index(v_agenda)));
    }

    public static SubLObject uia_interaction_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        SubLObject interactions = dictionary.dictionary_values(uia_index(v_agenda));
        interactions = Sort.sort(interactions, symbol_function($sym113$_), symbol_function(UI_ID));
        return interactions;
    }

    public static SubLObject uia_some_history_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return makeBoolean(NIL == queues.queue_empty_p(uia_history(v_agenda)));
    }

    public static SubLObject uia_history_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return queues.queue_elements(uia_history(v_agenda));
    }

    public static SubLObject uia_some_undo_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return makeBoolean(NIL == stacks.stack_empty_p(uia_undos(v_agenda)));
    }

    public static SubLObject uia_undo_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return stacks.stack_elements(uia_undos(v_agenda));
    }

    public static SubLObject uia_some_message_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return makeBoolean(NIL == queues.queue_empty_p(uia_messages(v_agenda)));
    }

    public static SubLObject uia_message_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return queues.queue_elements(uia_messages(v_agenda));
    }

    public static SubLObject uia_some_requirement_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return makeBoolean(NIL == stacks.stack_empty_p(uia_requirements(v_agenda)));
    }

    public static SubLObject uia_requirement_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return stacks.stack_elements(uia_requirements(v_agenda));
    }

    public static SubLObject uia_some_relevant_suggestion_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return makeBoolean(NIL == stacks.stack_empty_p(uia_relevant_suggestions(v_agenda)));
    }

    public static SubLObject uia_relevant_suggestion_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return stacks.stack_elements(uia_relevant_suggestions(v_agenda));
    }

    public static SubLObject uia_some_possible_suggestion_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return makeBoolean(NIL == queues.queue_empty_p(uia_possible_suggestions(v_agenda)));
    }

    public static SubLObject uia_possible_suggestion_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return queues.queue_elements(uia_possible_suggestions(v_agenda));
    }

    public static SubLObject uia_some_comment_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return makeBoolean(NIL == queues.queue_empty_p(uia_comments(v_agenda)));
    }

    public static SubLObject uia_comment_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return queues.queue_elements(uia_comments(v_agenda));
    }

    public static SubLObject uia_default_operator(final SubLObject v_agenda) {
        return $EMPTY_AGENDA;
    }

    public static SubLObject uia_initialized_p(final SubLObject v_agenda) {
        return eq($TRUE, uia_state_lookup(v_agenda, $SETUP_COMPLETE, UNPROVIDED));
    }

    public static SubLObject uia_add_to_index(final SubLObject v_agenda, final SubLObject id, final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            dictionary.dictionary_enter(uia_index(v_agenda), id, v_object);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_object;
    }

    public static SubLObject uia_add_to_history(final SubLObject v_agenda, final SubLObject interaction) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.enqueue(interaction, uia_history(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_clear_undos(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.clear_stack(uia_undos(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_undo(final SubLObject v_agenda, final SubLObject undo) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(undo) : "user_interaction_agenda.user_interaction_p(undo) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(undo) " + undo;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_push(undo, uia_undos(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_undo(final SubLObject v_agenda, final SubLObject undo) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(undo) : "user_interaction_agenda.user_interaction_p(undo) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(undo) " + undo;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_delete(undo, uia_undos(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_message(final SubLObject v_agenda, final SubLObject message) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(message) : "user_interaction_agenda.user_interaction_p(message) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(message) " + message;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.enqueue(message, uia_messages(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_message(final SubLObject v_agenda, final SubLObject message) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(message) : "user_interaction_agenda.user_interaction_p(message) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(message) " + message;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.remqueue(message, uia_messages(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_requirement(final SubLObject v_agenda, final SubLObject requirement) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(requirement) : "user_interaction_agenda.user_interaction_p(requirement) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(requirement) " + requirement;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_push(requirement, uia_requirements(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_requirement(final SubLObject v_agenda, final SubLObject requirement) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(requirement) : "user_interaction_agenda.user_interaction_p(requirement) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(requirement) " + requirement;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_delete(requirement, uia_requirements(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_relevant_suggestion(final SubLObject v_agenda, final SubLObject relevant_suggestion) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(relevant_suggestion) : "user_interaction_agenda.user_interaction_p(relevant_suggestion) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(relevant_suggestion) " + relevant_suggestion;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_push(relevant_suggestion, uia_relevant_suggestions(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_relevant_suggestion(final SubLObject v_agenda, final SubLObject relevant_suggestion) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(relevant_suggestion) : "user_interaction_agenda.user_interaction_p(relevant_suggestion) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(relevant_suggestion) " + relevant_suggestion;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_delete(relevant_suggestion, uia_relevant_suggestions(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_possible_suggestion(final SubLObject v_agenda, final SubLObject possible_suggestion) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(possible_suggestion) : "user_interaction_agenda.user_interaction_p(possible_suggestion) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(possible_suggestion) " + possible_suggestion;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.enqueue(possible_suggestion, uia_possible_suggestions(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_possible_suggestion(final SubLObject v_agenda, final SubLObject possible_suggestion) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(possible_suggestion) : "user_interaction_agenda.user_interaction_p(possible_suggestion) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(possible_suggestion) " + possible_suggestion;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.remqueue(possible_suggestion, uia_possible_suggestions(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_comment(final SubLObject v_agenda, final SubLObject comment) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(comment) : "user_interaction_agenda.user_interaction_p(comment) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(comment) " + comment;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.enqueue(comment, uia_comments(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_comment(final SubLObject v_agenda, final SubLObject comment) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(comment) : "user_interaction_agenda.user_interaction_p(comment) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(comment) " + comment;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.remqueue(comment, uia_comments(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_clear_comments(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.clear_queue(uia_comments(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_background_task_p(final SubLObject interaction) {
        return eq($THINKING, ui_operator(interaction));
    }

    public static SubLObject uia_can_treat_comments_as_mumblingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $uia_can_treat_comments_as_mumblingP$.getDynamicValue(thread);
    }

    public static SubLObject uia_cannot_treat_comments_as_mumbling() {
        $uia_can_treat_comments_as_mumblingP$.setDynamicValue(NIL);
        return uia_can_treat_comments_as_mumblingP();
    }

    public static SubLObject uia_can_treat_comments_as_mumbling() {
        $uia_can_treat_comments_as_mumblingP$.setDynamicValue(T);
        return uia_can_treat_comments_as_mumblingP();
    }

    public static SubLObject uia_process_new_comment(final SubLObject v_agenda, final SubLObject comment) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != user_interaction_p(comment) : "user_interaction_agenda.user_interaction_p(comment) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(comment) " + comment;
        uia_add_comment(v_agenda, comment);
        return v_agenda;
    }

    public static SubLObject uia_classify(final SubLObject v_agenda, final SubLObject interaction) {
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = ui_mode(interaction);
        if (pcase_var.eql($UNDO)) {
            uia_add_undo(v_agenda, interaction);
        } else
            if (pcase_var.eql($MESSAGE)) {
                uia_add_message(v_agenda, interaction);
            } else
                if (pcase_var.eql($REQUIRED)) {
                    uia_add_requirement(v_agenda, interaction);
                } else
                    if (pcase_var.eql($RELEVANT)) {
                        uia_add_relevant_suggestion(v_agenda, interaction);
                    } else
                        if (pcase_var.eql($POSSIBLE)) {
                            uia_add_possible_suggestion(v_agenda, interaction);
                        } else
                            if (pcase_var.eql($COMMENT)) {
                                uia_process_new_comment(v_agenda, interaction);
                            }





        return v_agenda;
    }

    public static SubLObject uia_declassify(final SubLObject v_agenda, final SubLObject interaction) {
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = ui_mode(interaction);
        if (pcase_var.eql($UNDO)) {
            uia_rem_undo(v_agenda, interaction);
        } else
            if (pcase_var.eql($MESSAGE)) {
                uia_rem_message(v_agenda, interaction);
            } else
                if (pcase_var.eql($REQUIRED)) {
                    uia_rem_requirement(v_agenda, interaction);
                } else
                    if (pcase_var.eql($RELEVANT)) {
                        uia_rem_relevant_suggestion(v_agenda, interaction);
                    } else
                        if (pcase_var.eql($POSSIBLE)) {
                            uia_rem_possible_suggestion(v_agenda, interaction);
                        } else
                            if (pcase_var.eql($COMMENT)) {
                                uia_rem_comment(v_agenda, interaction);
                            }





        return v_agenda;
    }

    public static SubLObject uia_note_state(final SubLObject v_agenda, final SubLObject state) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_uia_state(v_agenda, state);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_global_id_string(final SubLObject v_agenda) {
        final SubLObject uima = uia_meta_agenda(v_agenda);
        final SubLObject uima_id = uima_id(uima);
        final SubLObject uia_id = uia_id(v_agenda);
        return format(NIL, $str125$_S__S, uima_id, uia_id);
    }

    public static SubLObject uia_from_ids(final SubLObject meta_agenda, final SubLObject v_agenda) {
        final SubLObject uima = uimma_find_by_id(meta_agenda);
        final SubLObject uia = uima_find_by_id(uima, v_agenda);
        return values(uia, uima);
    }

    public static SubLObject uia_determine_superior_topic_identification(final SubLObject v_agenda) {
        final SubLObject better_topic = uia_state_lookup(v_agenda, $SUPERIOR_TOPIC, NIL);
        if (NIL != better_topic) {
            return better_topic;
        }
        final SubLObject formula = listS($$mainFocusOfUIASession, uia_domain_interaction_mt(v_agenda), $list128);
        final SubLObject better_topics = ask_utilities.ask_variable($TOPIC, formula, uia_domain_interaction_mt(v_agenda), ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        final SubLObject better_topic2 = better_topics.first();
        if (NIL != forts.fort_p(better_topic2)) {
            uia_state_update(v_agenda, $SUPERIOR_TOPIC, better_topic2);
        }
        return better_topic2;
    }

    public static SubLObject do_uias(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list130);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject uia = NIL;
        SubLObject uima = NIL;
        destructuring_bind_must_consp(current, datum, $list130);
        uia = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list130);
        uima = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(uia, list(UIMA_OPEN_AGENDAS_SEQUENCE, uima)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list130);
        return NIL;
    }

    public static SubLObject do_uis(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list133);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ui = NIL;
        SubLObject uia = NIL;
        destructuring_bind_must_consp(current, datum, $list133);
        ui = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list133);
        uia = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(ui, list(UIA_INTERACTION_SEQUENCE, uia)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list133);
        return NIL;
    }

    public static SubLObject uia_language_parsing_mt(final SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), $LANGUAGE_PARSING_MT, $UNDETERMINED);
    }

    public static SubLObject uia_language_parsing_mt_update(final SubLObject v_agenda, final SubLObject language_parsing_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), $LANGUAGE_PARSING_MT, language_parsing_mt);
    }

    public static SubLObject uia_language_generation_mt(final SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), $LANGUAGE_GENERATION_MT, $UNDETERMINED);
    }

    public static SubLObject uia_language_generation_mt_update(final SubLObject v_agenda, final SubLObject language_generation_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), $LANGUAGE_GENERATION_MT, language_generation_mt);
    }

    public static SubLObject uia_language_lexical_mt(final SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), $LANGUAGE_LEXICAL_MT, $UNDETERMINED);
    }

    public static SubLObject uia_language_lexical_mt_update(final SubLObject v_agenda, final SubLObject language_lexical_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), $LANGUAGE_LEXICAL_MT, language_lexical_mt);
    }

    public static SubLObject uia_domain_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $DOMAIN_MT, $UNDETERMINED);
    }

    public static SubLObject uia_domain_mt_update(final SubLObject v_agenda, final SubLObject domain_mt) {
        return uia_state_update(v_agenda, $DOMAIN_MT, domain_mt);
    }

    public static SubLObject uia_parsing_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $PARSING_MT, $UNDETERMINED);
    }

    public static SubLObject uia_parsing_mt_update(final SubLObject v_agenda, final SubLObject parsing_mt) {
        return uia_state_update(v_agenda, $PARSING_MT, parsing_mt);
    }

    public static SubLObject uia_generation_mt(final SubLObject v_agenda, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, $GENERATION_MT, v_default);
    }

    public static SubLObject uia_generation_mt_update(final SubLObject v_agenda, final SubLObject generation_mt) {
        return uia_state_update(v_agenda, $GENERATION_MT, generation_mt);
    }

    public static SubLObject uia_all_interaction_mts(final SubLObject v_agenda, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, $ALL_INTERACTION_MTS, v_default);
    }

    public static SubLObject uia_note_interaction_mt(final SubLObject v_agenda, final SubLObject interaction_mt) {
        SubLObject all_interaction_mts = uia_all_interaction_mts(v_agenda, NIL);
        all_interaction_mts = adjoin(interaction_mt, all_interaction_mts, UNPROVIDED, UNPROVIDED);
        return uia_state_update(v_agenda, $ALL_INTERACTION_MTS, all_interaction_mts);
    }

    public static SubLObject uia_domain_interaction_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $DOMAIN_INTERACTION_MT, $UNDETERMINED);
    }

    public static SubLObject uia_domain_interaction_mt_update(final SubLObject v_agenda, final SubLObject domain_interaction_mt) {
        return uia_state_update(v_agenda, $DOMAIN_INTERACTION_MT, domain_interaction_mt);
    }

    public static SubLObject uia_parsing_interaction_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $PARSING_INTERACTION_MT, $UNDETERMINED);
    }

    public static SubLObject uia_parsing_interaction_mt_update(final SubLObject v_agenda, final SubLObject parsing_interaction_mt) {
        return uia_state_update(v_agenda, $PARSING_INTERACTION_MT, parsing_interaction_mt);
    }

    public static SubLObject uia_generation_interaction_mt(final SubLObject v_agenda, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, $GENERATION_INTERACTION_MT, v_default);
    }

    public static SubLObject uia_generation_language_mt(final SubLObject v_agenda) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject agenda_specific_mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
        return $UNDETERMINED == agenda_specific_mt ? pph_vars.$pph_language_mt$.getDynamicValue(thread) : agenda_specific_mt;
    }

    public static SubLObject uia_generation_domain_mt(final SubLObject v_agenda) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject agenda_specific_mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
        return $UNDETERMINED == agenda_specific_mt ? pph_vars.$pph_domain_mt$.getDynamicValue(thread) : agenda_specific_mt;
    }

    public static SubLObject uia_generation_interaction_mt_update(final SubLObject v_agenda, final SubLObject generation_interaction_mt) {
        return uia_state_update(v_agenda, $GENERATION_INTERACTION_MT, generation_interaction_mt);
    }

    public static SubLObject uia_lexical_interaction_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $LEXICAL_INTERACTION_MT, $UNDETERMINED);
    }

    public static SubLObject uia_lexical_interaction_mt_update(final SubLObject v_agenda, final SubLObject lexical_interaction_mt) {
        return uia_state_update(v_agenda, $LEXICAL_INTERACTION_MT, lexical_interaction_mt);
    }

    public static SubLObject ui_domain_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        SubLObject v_answer = ui_state_lookup(interaction, $DOMAIN_INTERACTION_MT, $UNDETERMINED);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_domain_interaction_mt(v_agenda);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = ui_generation_interaction_mt(interaction);
        return v_answer;
    }

    public static SubLObject ui_parsing_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        SubLObject v_answer = ui_state_lookup(interaction, $PARSING_INTERACTION_MT, $UNDETERMINED);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_parsing_interaction_mt(v_agenda);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_language_parsing_mt(v_agenda);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        return $$EnglishTemplateMt;
    }

    public static SubLObject ui_generation_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        SubLObject v_answer = ui_state_lookup(interaction, $GENERATION_INTERACTION_MT, $UNDETERMINED);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_language_generation_mt(v_agenda);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        return $$EnglishParaphraseMt;
    }

    public static SubLObject ui_generation_language_mt(final SubLObject interaction) {
        return ui_generation_interaction_mt(interaction);
    }

    public static SubLObject ui_generation_domain_mt(final SubLObject interaction) {
        return ui_generation_interaction_mt(interaction);
    }

    public static SubLObject ui_lexical_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        final SubLObject v_answer = uia_lexical_interaction_mt(v_agenda);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        return $$EnglishMt;
    }

    public static SubLObject uia_ensure_scenario_interaction_mt(final SubLObject v_agenda) {
        SubLObject scenario_interaction_mt = uia_state_lookup(v_agenda, $SCENARIO_INTERACTION_CONTEXT, UNPROVIDED);
        if (NIL == hlmt.hlmt_p(scenario_interaction_mt)) {
            scenario_interaction_mt = rkf_context_tools.rkf_create_scenario_interaction_context(uia_domain_interaction_mt(v_agenda));
            uia_state_update(v_agenda, $SCENARIO_INTERACTION_CONTEXT, scenario_interaction_mt);
            uia_note_interaction_mt(v_agenda, scenario_interaction_mt);
        }
        return scenario_interaction_mt;
    }

    public static SubLObject user_interaction_meta_agenda_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject user_interaction_meta_agenda_p(final SubLObject v_object) {
        return v_object.getClass() == user_interaction_agenda.$user_interaction_meta_agenda_native.class ? T : NIL;
    }

    public static SubLObject uima_id(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject uima_isg(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject uima_index(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject uima_open_agendas(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject uima_current_agenda(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject uima_state(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_uima_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_uima_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_uima_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_uima_open_agendas(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_uima_current_agenda(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_uima_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_user_interaction_meta_agenda(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new user_interaction_agenda.$user_interaction_meta_agenda_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_uima_id(v_new, current_value);
            } else
                if (pcase_var.eql($ISG)) {
                    _csetf_uima_isg(v_new, current_value);
                } else
                    if (pcase_var.eql($INDEX)) {
                        _csetf_uima_index(v_new, current_value);
                    } else
                        if (pcase_var.eql($OPEN_AGENDAS)) {
                            _csetf_uima_open_agendas(v_new, current_value);
                        } else
                            if (pcase_var.eql($CURRENT_AGENDA)) {
                                _csetf_uima_current_agenda(v_new, current_value);
                            } else
                                if (pcase_var.eql($STATE)) {
                                    _csetf_uima_state(v_new, current_value);
                                } else {
                                    Errors.error($str51$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_user_interaction_meta_agenda(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_USER_INTERACTION_META_AGENDA, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, uima_id(obj));
        funcall(visitor_fn, obj, $SLOT, $ISG, uima_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX, uima_index(obj));
        funcall(visitor_fn, obj, $SLOT, $OPEN_AGENDAS, uima_open_agendas(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_AGENDA, uima_current_agenda(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, uima_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_USER_INTERACTION_META_AGENDA, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_user_interaction_meta_agenda_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_user_interaction_meta_agenda(obj, visitor_fn);
    }

    public static SubLObject new_uima() {
        final SubLObject meta_agenda = make_user_interaction_meta_agenda(UNPROVIDED);
        final SubLObject id = uimma_new_id();
        _csetf_uima_id(meta_agenda, id);
        _csetf_uima_isg(meta_agenda, integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        _csetf_uima_index(meta_agenda, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        _csetf_uima_open_agendas(meta_agenda, stacks.create_stack());
        uima_clear_current_agenda(meta_agenda);
        uima_note_state(meta_agenda, NIL);
        uimma_add_to_index(id, meta_agenda);
        return meta_agenda;
    }

    public static SubLObject uima_reset(final SubLObject meta_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            integer_sequence_generator.integer_sequence_generator_reset(uima_isg(meta_agenda));
            dictionary.clear_dictionary(uima_index(meta_agenda));
            stacks.clear_stack(uima_open_agendas(meta_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        uima_clear_current_agenda(meta_agenda);
        uima_note_state(meta_agenda, NIL);
        return meta_agenda;
    }

    public static SubLObject uima_find_by_id(final SubLObject meta_agenda, final SubLObject id) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        return dictionary.dictionary_lookup(uima_index(meta_agenda), id, UNPROVIDED);
    }

    public static SubLObject uima_find_by_id_string(final SubLObject meta_agenda, final SubLObject id_string) {
        assert NIL != stringp(id_string) : "Types.stringp(id_string) " + "CommonSymbols.NIL != Types.stringp(id_string) " + id_string;
        return uima_find_by_id(meta_agenda, parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject uima_some_open_agendas_p(final SubLObject meta_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        return makeBoolean(NIL == stacks.stack_empty_p(uima_open_agendas(meta_agenda)));
    }

    public static SubLObject uima_open_agendas_sequence(final SubLObject meta_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        return stacks.stack_elements(uima_open_agendas(meta_agenda));
    }

    public static SubLObject uima_match_mt_to_agenda(final SubLObject meta_agenda, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        SubLObject result;
        SubLObject iteration_state;
        for (result = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(uima_index(meta_agenda))); (NIL == result) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject v_agenda = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (uia_domain_interaction_mt(v_agenda).eql(mt)) {
                result = v_agenda;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static SubLObject uima_add_to_index(final SubLObject meta_agenda, final SubLObject id, final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            dictionary.dictionary_enter(uima_index(meta_agenda), id, v_object);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_object;
    }

    public static SubLObject uima_add_open_agenda(final SubLObject meta_agenda, final SubLObject v_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_push(v_agenda, uima_open_agendas(meta_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }

    public static SubLObject uima_clear_current_agenda(final SubLObject meta_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_uima_current_agenda(meta_agenda, NIL);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }

    public static SubLObject uima_note_current_agenda(final SubLObject meta_agenda, final SubLObject v_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_uima_current_agenda(meta_agenda, v_agenda);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }

    public static SubLObject uima_note_state(final SubLObject meta_agenda, final SubLObject state) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_uima_state(meta_agenda, state);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }

    public static SubLObject do_uimas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list175);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject uima = NIL;
        destructuring_bind_must_consp(current, datum, $list175);
        uima = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list175);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list175);
            if (NIL == member(current_$1, $list176, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list175);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject id = $sym179$ID;
        return listS(DO_ID_INDEX, list(id, uima, $list181, $DONE, done), list(IGNORE, id), append(body, NIL));
    }

    public static SubLObject system_uimma() {
        return uimma();
    }

    public static SubLObject uimma() {
        return $uimma$.getGlobalValue();
    }

    public static SubLObject new_uimma() {
        return new_id_index(ZERO_INTEGER, UNPROVIDED);
    }

    public static SubLObject uimma_reset() {
        $uimma$.setGlobalValue(new_uimma());
        return uimma();
    }

    public static SubLObject uimma_new_id() {
        return id_index_reserve(uimma());
    }

    public static SubLObject uimma_add_to_index(final SubLObject id, final SubLObject meta_agenda) {
        return id_index_enter(uimma(), id, meta_agenda);
    }

    public static SubLObject uimma_find_by_id(final SubLObject meta_agenda_id) {
        return id_index_lookup(uimma(), meta_agenda_id, UNPROVIDED);
    }

    public static SubLObject uimma_default_locale() {
        return $uimma_default_locale$.getGlobalValue();
    }

    public static SubLObject set_uimma_default_locale(final SubLObject locale) {
        $uimma_default_locale$.setGlobalValue(locale);
        return $uimma_default_locale$.getGlobalValue();
    }

    public static SubLObject uimma_default_generation_mt() {
        return $uimma_default_generation_mt$.getGlobalValue();
    }

    public static SubLObject set_uimma_default_generation_mt(final SubLObject mt) {
        $uimma_default_generation_mt$.setGlobalValue(mt);
        return $uimma_default_generation_mt$.getGlobalValue();
    }

    public static SubLObject uimma_default_domain_mt() {
        return $uimma_default_domain_mt$.getGlobalValue();
    }

    public static SubLObject set_uimma_default_domain_mt(final SubLObject mt) {
        $uimma_default_domain_mt$.setGlobalValue(mt);
        return $uimma_default_domain_mt$.getGlobalValue();
    }

    public static SubLObject ui_meta_agenda(final SubLObject interaction) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        return uia_meta_agenda(ui_agenda(interaction));
    }

    public static SubLObject uia_total_interaction_count(final SubLObject v_agenda) {
        return dictionary.dictionary_length(uia_index(v_agenda));
    }

    public static SubLObject uia_finished_interaction_count(final SubLObject v_agenda) {
        return queues.queue_size(uia_history(v_agenda));
    }

    public static SubLObject ui_state_plist_to_state(final SubLObject plist) {
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        return plist;
    }

    public static SubLObject ui_state_lookup(final SubLObject interaction, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        return getf(ui_state(interaction), property, v_default);
    }

    public static SubLObject ui_state_update(final SubLObject interaction, final SubLObject property, final SubLObject value) {
        return ui_note_state(interaction, putf(ui_state(interaction), property, value));
    }

    public static SubLObject ui_state_clear(final SubLObject interaction, final SubLObject property) {
        return ui_note_state(interaction, remf(ui_state(interaction), property));
    }

    public static SubLObject ui_state_clear_all(final SubLObject interaction) {
        return ui_note_state(interaction, NIL);
    }

    public static SubLObject uia_state_plist_to_state(final SubLObject plist) {
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        return plist;
    }

    public static SubLObject uia_initialize_state(final SubLObject v_agenda, final SubLObject plist) {
        uia_note_state(v_agenda, uia_state_plist_to_state(plist));
        uia_create_memoization_state(v_agenda);
        uia_glob_reset(v_agenda);
        return v_agenda;
    }

    public static SubLObject uia_state_lookup(final SubLObject v_agenda, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        return getf(uia_state(v_agenda), property, v_default);
    }

    public static SubLObject uia_state_update(final SubLObject v_agenda, final SubLObject property, final SubLObject value) {
        return uia_note_state(v_agenda, putf(uia_state(v_agenda), property, value));
    }

    public static SubLObject uia_state_clear(final SubLObject v_agenda, final SubLObject property) {
        return uia_note_state(v_agenda, remf(uia_state(v_agenda), property));
    }

    public static SubLObject uia_state_clear_all(final SubLObject v_agenda) {
        uia_note_state(v_agenda, NIL);
        return v_agenda;
    }

    public static SubLObject uima_state_plist_to_state(final SubLObject plist) {
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        return plist;
    }

    public static SubLObject uima_initialize_state(final SubLObject meta_agenda, final SubLObject plist) {
        uima_note_state(meta_agenda, uima_state_plist_to_state(plist));
        uima_create_memoization_state(meta_agenda);
        return meta_agenda;
    }

    public static SubLObject uima_state_lookup(final SubLObject meta_agenda, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + meta_agenda;
        return getf(uima_state(meta_agenda), property, v_default);
    }

    public static SubLObject uima_state_update(final SubLObject meta_agenda, final SubLObject property, final SubLObject value) {
        return uima_note_state(meta_agenda, putf(uima_state(meta_agenda), property, value));
    }

    public static SubLObject uima_state_clear(final SubLObject meta_agenda, final SubLObject property) {
        return uima_note_state(meta_agenda, remf(uima_state(meta_agenda), property));
    }

    public static SubLObject uima_state_clear_all(final SubLObject meta_agenda) {
        return uima_note_state(meta_agenda, NIL);
    }

    public static SubLObject with_uia_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list192);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_agenda = NIL;
        destructuring_bind_must_consp(current, datum, $list192);
        v_agenda = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject state = $sym193$STATE;
            return list(CLET, list(list(state, list(UIA_MEMOIZATION_STATE, v_agenda))), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list192);
        return NIL;
    }

    public static SubLObject uia_memoization_state(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $MEMOIZATION_STATE, UNPROVIDED);
    }

    public static SubLObject uia_create_memoization_state(final SubLObject v_agenda) {
        uia_state_update(v_agenda, $MEMOIZATION_STATE, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return v_agenda;
    }

    public static SubLObject uia_clear_memoization_state(final SubLObject v_agenda) {
        memoization_state.clear_all_memoization(uia_memoization_state(v_agenda));
        return v_agenda;
    }

    public static SubLObject uia_clear_memoization_state_for_function(final SubLObject v_agenda, final SubLObject symbol) {
        return memoization_state.clear_memoization(uia_memoization_state(v_agenda), symbol);
    }

    public static SubLObject with_uima_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list198);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject meta_agenda = NIL;
        destructuring_bind_must_consp(current, datum, $list198);
        meta_agenda = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject state = $sym199$STATE;
            return list(CLET, list(list(state, list(UIMA_MEMOIZATION_STATE, meta_agenda))), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list198);
        return NIL;
    }

    public static SubLObject uima_memoization_state(final SubLObject meta_agenda) {
        return uima_state_lookup(meta_agenda, $MEMOIZATION_STATE, UNPROVIDED);
    }

    public static SubLObject uima_create_memoization_state(final SubLObject meta_agenda) {
        uima_state_update(meta_agenda, $MEMOIZATION_STATE, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return meta_agenda;
    }

    public static SubLObject uima_clear_memoization_state(final SubLObject meta_agenda) {
        memoization_state.clear_all_memoization(uima_memoization_state(meta_agenda));
        return meta_agenda;
    }

    public static SubLObject ui_ancestor_interactions(final SubLObject interaction) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        SubLObject v_answer = NIL;
        SubLObject parent;
        for (parent = NIL, parent = ui_parent_interaction(interaction); NIL != parent; parent = ui_parent_interaction(parent)) {
            v_answer = cons(parent, v_answer);
        }
        return v_answer;
    }

    public static SubLObject ui_pending_descendant_interactions(final SubLObject interaction) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        return nreverse(ui_pending_descendants_recursive(interaction, NIL));
    }

    public static SubLObject ui_pending_descendants_recursive(final SubLObject interaction, SubLObject accumulator) {
        SubLObject cdolist_list_var = ui_child_interactions(interaction);
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($PENDING == ui_status(child)) {
                accumulator = cons(child, accumulator);
            } else {
                accumulator = ui_pending_descendants_recursive(child, accumulator);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return accumulator;
    }

    public static SubLObject ui_sub_interactions(final SubLObject interaction) {
        return ui_state_lookup(interaction, $SUB_INTERACTIONS, UNPROVIDED);
    }

    public static SubLObject ui_super_interaction(final SubLObject interaction) {
        return ui_state_lookup(interaction, $SUPER_INTERACTION, UNPROVIDED);
    }

    public static SubLObject ui_add_sub_interaction(final SubLObject super_interaction, final SubLObject sub_interaction) {
        SubLObject sub_interactions = ui_sub_interactions(super_interaction);
        if (NIL == member(sub_interaction, sub_interactions, symbol_function(EQL), symbol_function(IDENTITY))) {
            sub_interactions = cons(sub_interaction, sub_interactions);
        }
        ui_state_update(super_interaction, $SUB_INTERACTIONS, sub_interactions);
        return super_interaction;
    }

    public static SubLObject ui_remove_sub_interaction(final SubLObject sub_interaction) {
        final SubLObject super_interaction = ui_super_interaction(sub_interaction);
        final SubLObject subs = ui_sub_interactions(super_interaction);
        final SubLObject new_subs = remove(sub_interaction, subs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        ui_state_update(super_interaction, $SUB_INTERACTIONS, new_subs);
        return sub_interaction;
    }

    public static SubLObject ui_note_super_interaction(final SubLObject sub_interaction, final SubLObject super_interaction) {
        ui_state_update(sub_interaction, $SUPER_INTERACTION, super_interaction);
        return sub_interaction;
    }

    public static SubLObject uia_act_promote_to_child(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        final SubLObject parent = ui_super_interaction(interaction);
        ui_remove_sub_interaction(interaction);
        uia_classify(v_agenda, interaction);
        uia_act_add_dependent(v_agenda, parent, interaction);
        return interaction;
    }

    public static SubLObject ui_recompute_status(final SubLObject interaction) {
        final SubLObject pcase_var = ui_status(interaction);
        if (pcase_var.eql($BLOCKED)) {
            final SubLObject children = ui_child_interactions(interaction);
            if (NIL == find($PENDING, children, symbol_function(EQ), symbol_function(UI_STATUS), UNPROVIDED, UNPROVIDED)) {
                ui_note_status(interaction, $PENDING);
            }
        }
        return interaction;
    }

    public static SubLObject ui_alive_p(final SubLObject interaction) {
        final SubLObject pcase_var = ui_status(interaction);
        if (pcase_var.eql($BLOCKED) || pcase_var.eql($PENDING)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject uia_next_action(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        if (NIL != uia_some_message_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_messages(v_agenda));
            if (NIL != pending) {
                return pending;
            }
        }
        if (NIL != uia_some_requirement_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_requirements(v_agenda));
            if (NIL != pending) {
                return pending;
            }
        }
        if (NIL != uia_some_relevant_suggestion_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_relevant_suggestions(v_agenda));
            if (NIL != pending) {
                return pending;
            }
        }
        if (NIL != uia_some_possible_suggestion_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_possible_suggestions(v_agenda));
            if (NIL != pending) {
                return pending;
            }
        }
        return NIL;
    }

    public static SubLObject uia_note_user_selection(final SubLObject v_agenda, final SubLObject interaction) {
        if ($PENDING == ui_status(interaction)) {
            uia_promote_interaction(v_agenda, interaction);
        }
        return v_agenda;
    }

    public static SubLObject uia_promote_interaction(final SubLObject v_agenda, final SubLObject interaction) {
        uia_declassify(v_agenda, interaction);
        _csetf_ui_mode(interaction, $REQUIRED);
        uia_classify(v_agenda, interaction);
        return v_agenda;
    }

    public static SubLObject uia_best_pending_action(final SubLObject container) {
        final SubLObject best = uia_first_pending_nonbackground_action(container);
        if (NIL != user_interaction_p(best)) {
            return best;
        }
        if (NIL != queues.queue_p(container)) {
            return queues.queue_find_if(UIA_PENDING_ACTION_P, container, UNPROVIDED);
        }
        if (NIL != stacks.stack_p(container)) {
            return stacks.stack_find_if(UIA_PENDING_ACTION_P, container, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject uia_pending_action_p(final SubLObject interaction) {
        if (NIL == user_interaction_p(interaction)) {
            return NIL;
        }
        if (!$PENDING.eql(ui_status(interaction))) {
            return NIL;
        }
        if ($THINKING != ui_operator(interaction)) {
            return T;
        }
        if (NIL != user_interaction_p(ui_parent_interaction(interaction))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject uia_first_pending_nonbackground_action(final SubLObject container) {
        if (NIL != queues.queue_p(container)) {
            SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(container);
            SubLObject interaction = NIL;
            interaction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($PENDING.eql(ui_status(interaction)) && (NIL == uia_background_task_p(interaction))) {
                    return interaction;
                }
                cdolist_list_var = cdolist_list_var.rest();
                interaction = cdolist_list_var.first();
            } 
            return NIL;
        }
        if (NIL != stacks.stack_p(container)) {
            SubLObject cdolist_list_var = stacks.do_stack_elements_stack_elements(container);
            SubLObject interaction = NIL;
            interaction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($PENDING.eql(ui_status(interaction)) && (NIL == uia_background_task_p(interaction))) {
                    return interaction;
                }
                cdolist_list_var = cdolist_list_var.rest();
                interaction = cdolist_list_var.first();
            } 
            return NIL;
        }
        return NIL;
    }

    public static SubLObject uia_signature_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(symbol_function(INTEGERP), v_object, UNPROVIDED)));
    }

    public static SubLObject uia_signature(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        final SubLObject agenda_id = uia_id(v_agenda);
        final SubLObject meta_agenda = uia_meta_agenda(v_agenda);
        final SubLObject meta_agenda_id = uima_id(meta_agenda);
        return list(meta_agenda_id, agenda_id);
    }

    public static SubLObject find_uia_by_signature(final SubLObject signature) {
        assert NIL != uia_signature_p(signature) : "user_interaction_agenda.uia_signature_p(signature) " + "CommonSymbols.NIL != user_interaction_agenda.uia_signature_p(signature) " + signature;
        SubLObject meta_agenda_id = NIL;
        SubLObject agenda_id = NIL;
        destructuring_bind_must_consp(signature, signature, $list207);
        meta_agenda_id = signature.first();
        SubLObject current = signature.rest();
        destructuring_bind_must_consp(current, signature, $list207);
        agenda_id = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject meta_agenda = uimma_find_by_id(meta_agenda_id);
            if (NIL != meta_agenda) {
                final SubLObject v_agenda = uima_find_by_id(meta_agenda, agenda_id);
                if (NIL != v_agenda) {
                    return v_agenda;
                }
            }
        } else {
            cdestructuring_bind_error(signature, $list207);
        }
        return NIL;
    }

    public static SubLObject ui_signature_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(symbol_function(INTEGERP), v_object, UNPROVIDED)));
    }

    public static SubLObject ui_signature(final SubLObject interaction) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        final SubLObject interaction_id = ui_id(interaction);
        final SubLObject v_agenda = ui_agenda(interaction);
        final SubLObject agenda_signature = uia_signature(v_agenda);
        return append(agenda_signature, list(interaction_id));
    }

    public static SubLObject ui_signature_to_property_list(final SubLObject signature) {
        assert NIL != ui_signature_p(signature) : "user_interaction_agenda.ui_signature_p(signature) " + "CommonSymbols.NIL != user_interaction_agenda.ui_signature_p(signature) " + signature;
        SubLObject uima = NIL;
        SubLObject uia = NIL;
        SubLObject ui = NIL;
        destructuring_bind_must_consp(signature, signature, $list209);
        uima = signature.first();
        SubLObject current = signature.rest();
        destructuring_bind_must_consp(current, signature, $list209);
        uia = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, signature, $list209);
        ui = current.first();
        current = current.rest();
        if (NIL == current) {
            return list($UIMA, uima, $UIA, uia, $UI, ui);
        }
        cdestructuring_bind_error(signature, $list209);
        return NIL;
    }

    public static SubLObject find_ui_by_signature(final SubLObject signature) {
        assert NIL != ui_signature_p(signature) : "user_interaction_agenda.ui_signature_p(signature) " + "CommonSymbols.NIL != user_interaction_agenda.ui_signature_p(signature) " + signature;
        SubLObject meta_agenda_id = NIL;
        SubLObject agenda_id = NIL;
        SubLObject interaction_id = NIL;
        destructuring_bind_must_consp(signature, signature, $list213);
        meta_agenda_id = signature.first();
        SubLObject current = signature.rest();
        destructuring_bind_must_consp(current, signature, $list213);
        agenda_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, signature, $list213);
        interaction_id = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject agenda_signature = list(meta_agenda_id, agenda_id);
            final SubLObject v_agenda = find_uia_by_signature(agenda_signature);
            if (NIL != v_agenda) {
                final SubLObject interaction = uia_find_by_id(v_agenda, interaction_id);
                if (NIL != interaction) {
                    return interaction;
                }
            }
        } else {
            cdestructuring_bind_error(signature, $list213);
        }
        return NIL;
    }

    public static SubLObject uia_schedule_frame_for_refresh(final SubLObject v_agenda, final SubLObject frame_name) {
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            SubLObject frames = uia_state_lookup(v_agenda, $FRAMES_FOR_REFRESH, NIL);
            if (NIL == member(frame_name, frames, symbol_function(EQL), symbol_function(IDENTITY))) {
                frames = cons(frame_name, frames);
            }
            uia_state_update(v_agenda, $FRAMES_FOR_REFRESH, frames);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_get_frames_scheduled_for_refresh(final SubLObject v_agenda) {
        SubLObject frames = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            frames = uia_state_lookup(v_agenda, $FRAMES_FOR_REFRESH, NIL);
            if (NIL != frames) {
                uia_state_clear(v_agenda, $FRAMES_FOR_REFRESH);
            }
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return frames;
    }

    public static SubLObject uia_crumb_trail(final SubLObject v_agenda) {
        SubLObject crumb_trail = uia_state_lookup(v_agenda, $CRUMB_TRAIL, $UNDEFINED);
        if (crumb_trail == $UNDEFINED) {
            crumb_trail = uia_create_new_crumb_trail(v_agenda);
        }
        return crumb_trail;
    }

    public static SubLObject uia_create_new_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        uia_state_update(v_agenda, $CRUMB_TRAIL, crumb_trail);
        dictionary.dictionary_enter(crumb_trail, $TERMS, NIL);
        dictionary.dictionary_enter(crumb_trail, $FACTS, NIL);
        return crumb_trail;
    }

    public static SubLObject uia_update_term_crumb_trail(final SubLObject crumb_trail, final SubLObject v_term) {
        dictionary_utilities.dictionary_remove_from_value(crumb_trail, $TERMS, v_term, UNPROVIDED, UNPROVIDED);
        dictionary_utilities.dictionary_push(crumb_trail, $TERMS, v_term);
        return crumb_trail;
    }

    public static SubLObject uia_update_fact_crumb_trail(final SubLObject crumb_trail, final SubLObject fact) {
        final SubLObject trailed_facts = dictionary.dictionary_lookup(crumb_trail, $FACTS, UNPROVIDED);
        SubLObject new_trail = NIL;
        SubLObject cdolist_list_var = trailed_facts;
        SubLObject old_fact = NIL;
        old_fact = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == uia_crumb_trail_facts_equalP(fact, old_fact)) {
                final SubLObject item_var = old_fact;
                if (NIL == member(item_var, new_trail, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    new_trail = cons(item_var, new_trail);
                }
            } else
                if ((NIL != uia_crumb_trail_el_sentenceP(fact)) && (NIL != uia_crumb_trail_stale_assertionP(old_fact))) {
                    return crumb_trail;
                }

            cdolist_list_var = cdolist_list_var.rest();
            old_fact = cdolist_list_var.first();
        } 
        new_trail = nreverse(new_trail);
        if (NIL == member(fact, new_trail, symbol_function(EQUAL), symbol_function(IDENTITY))) {
            new_trail = cons(fact, new_trail);
        }
        dictionary.dictionary_enter(crumb_trail, $FACTS, new_trail);
        return crumb_trail;
    }

    public static SubLObject uia_update_question_crumb_trail(final SubLObject crumb_trail, final SubLObject v_question) {
        dictionary_utilities.dictionary_pushnew(crumb_trail, $QUESTIONS, v_question, symbol_function(EQUAL), UNPROVIDED);
        return crumb_trail;
    }

    public static SubLObject uia_crumb_trail_stale_assertionP(final SubLObject fact) {
        return makeBoolean(NIL == assertions_high.valid_assertion(getf(fact, $ASSERTION, UNPROVIDED), UNPROVIDED));
    }

    public static SubLObject uia_crumb_trail_el_sentenceP(final SubLObject fact) {
        return makeBoolean(NIL == hlmt.hlmt_p(getf(fact, $MT, UNPROVIDED)));
    }

    public static SubLObject uia_crumb_trail_facts_equalP(final SubLObject fact1, final SubLObject fact2) {
        final SubLObject sentence1 = getf(fact1, $SENTENCE, UNPROVIDED);
        final SubLObject sentence2 = getf(fact2, $SENTENCE, UNPROVIDED);
        return equal(sentence1, sentence2);
    }

    public static SubLObject uia_get_term_crumb_trail(final SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, $TERMS, NIL);
    }

    public static SubLObject uia_get_fact_crumb_trail(final SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, $FACTS, NIL);
    }

    public static SubLObject uia_get_question_crumb_trail(final SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, $QUESTIONS, NIL);
    }

    public static SubLObject uia_remove_crumb_trail_term(final SubLObject crumb_trail, final SubLObject v_term) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, $TERMS, v_term, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject uia_remove_crumb_trail_fact(final SubLObject crumb_trail, final SubLObject fact) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, $FACTS, fact, EQUAL, UNPROVIDED);
    }

    public static SubLObject uia_remove_crumb_trail_question(final SubLObject crumb_trail, final SubLObject v_question) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, $QUESTIONS, v_question, EQUAL, UNPROVIDED);
    }

    public static SubLObject uia_shorten_term_crumb_trail(final SubLObject crumb_trail, final SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, $TERMS, subseq(dictionary.dictionary_lookup(crumb_trail, $TERMS, NIL), ZERO_INTEGER, how_many));
        return crumb_trail;
    }

    public static SubLObject uia_shorten_fact_crumb_trail(final SubLObject crumb_trail, final SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, $FACTS, subseq(dictionary.dictionary_lookup(crumb_trail, $FACTS, NIL), ZERO_INTEGER, how_many));
        return crumb_trail;
    }

    public static SubLObject uia_shorten_question_crumb_trail(final SubLObject crumb_trail, final SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, $QUESTIONS, subseq(dictionary.dictionary_lookup(crumb_trail, $QUESTIONS, NIL), ZERO_INTEGER, how_many));
        return crumb_trail;
    }

    public static SubLObject uia_reset_crumb_trail(final SubLObject v_agenda) {
        uia_create_new_crumb_trail(v_agenda);
        return v_agenda;
    }

    public static SubLObject uia_add_term_to_crumb_trail(final SubLObject v_agenda, final SubLObject v_term) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        uia_update_term_crumb_trail(crumb_trail, v_term);
        return v_agenda;
    }

    public static SubLObject uia_add_question_to_crumb_trail(final SubLObject v_agenda, final SubLObject v_question, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        final SubLObject encapsulated_question = uia_crumb_trail_encapsulate_sentence(v_question, mt);
        uia_update_question_crumb_trail(crumb_trail, encapsulated_question);
        return v_agenda;
    }

    public static SubLObject uia_add_fact_to_crumb_trail(final SubLObject v_agenda, final SubLObject fact, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        final SubLObject encapsulated_fact = (NIL != assertion_handles.assertion_p(fact)) ? uia_crumb_trail_encapsulate_assertion(fact) : uia_crumb_trail_encapsulate_sentence(fact, mt);
        uia_update_fact_crumb_trail(crumb_trail, encapsulated_fact);
        return v_agenda;
    }

    public static SubLObject uia_crumb_trail_encapsulate_assertion(final SubLObject assertion) {
        final SubLObject sentence = assertions_high.assertion_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject plist = NIL;
        plist = putf(plist, $ASSERTION, assertion);
        plist = putf(plist, $SENTENCE, sentence);
        plist = putf(plist, $MT, mt);
        return plist;
    }

    public static SubLObject uia_crumb_trail_encapsulate_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLObject assertion = (NIL != hlmt.hlmt_p(mt)) ? czer_meta.find_assertion_cycl(sentence, mt) : NIL;
        SubLObject plist = NIL;
        if (NIL != assertion_handles.assertion_p(assertion)) {
            plist = putf(plist, $ASSERTION, assertion);
        }
        plist = putf(plist, $SENTENCE, sentence);
        plist = putf(plist, $MT, mt);
        return plist;
    }

    public static SubLObject uia_get_terms_on_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        SubLObject stales = NIL;
        SubLObject cdolist_list_var = uia_get_term_crumb_trail(crumb_trail);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == forts.valid_fort_robustP(v_term)) {
                stales = cons(v_term, stales);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        cdolist_list_var = stales;
        SubLObject stale = NIL;
        stale = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            uia_remove_crumb_trail_term(crumb_trail, stale);
            cdolist_list_var = cdolist_list_var.rest();
            stale = cdolist_list_var.first();
        } 
        return uia_get_term_crumb_trail(crumb_trail);
    }

    public static SubLObject uia_get_facts_on_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_get_fact_crumb_trail(crumb_trail);
    }

    public static SubLObject uia_get_questions_on_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_get_question_crumb_trail(crumb_trail);
    }

    public static SubLObject uia_anything_on_crumb_trailP(final SubLObject v_agenda) {
        return makeBoolean((NIL != list_utilities.sublisp_boolean(uia_get_terms_on_crumb_trail(v_agenda))) || (NIL != list_utilities.sublisp_boolean(uia_get_facts_on_crumb_trail(v_agenda))));
    }

    public static SubLObject uia_remove_term_from_crumb_trail(final SubLObject v_agenda, final SubLObject v_term) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_remove_crumb_trail_term(crumb_trail, v_term);
    }

    public static SubLObject uia_remove_fact_from_crumb_trail(final SubLObject v_agenda, final SubLObject fact) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_remove_crumb_trail_fact(crumb_trail, fact);
    }

    public static SubLObject uia_remove_question_from_crumb_trail(final SubLObject v_agenda, final SubLObject v_question) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_remove_crumb_trail_question(crumb_trail, v_question);
    }

    public static SubLObject uia_shorten_crumb_trail_to(final SubLObject v_agenda, SubLObject how_many) {
        if (how_many == UNPROVIDED) {
            how_many = TEN_INTEGER;
        }
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        uia_shorten_term_crumb_trail(crumb_trail, how_many);
        uia_shorten_fact_crumb_trail(crumb_trail, how_many);
        uia_shorten_question_crumb_trail(crumb_trail, how_many);
        return v_agenda;
    }

    public static SubLObject uima_act_create(SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject meta_agenda = new_uima();
        uima_initialize_state(meta_agenda, plist);
        return meta_agenda;
    }

    public static SubLObject uima_act_focus(final SubLObject meta_agenda, final SubLObject v_agenda) {
        uima_note_current_agenda(meta_agenda, v_agenda);
        return meta_agenda;
    }

    public static SubLObject uia_act_create(final SubLObject meta_agenda, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject v_agenda = new_uia(meta_agenda);
        uia_initialize_state(v_agenda, plist);
        uima_add_open_agenda(meta_agenda, v_agenda);
        return v_agenda;
    }

    public static SubLObject uia_act_standard_initialization(final SubLObject v_agenda) {
        uia_act_new_interaction(v_agenda, $REQUIRED, $INITIALIZER, UNPROVIDED, UNPROVIDED);
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return v_agenda;
    }

    public static SubLObject uima_act_reset(SubLObject meta_agenda, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        meta_agenda = uima_reset(meta_agenda);
        uima_initialize_state(meta_agenda, plist);
        return meta_agenda;
    }

    public static SubLObject uia_act_reset(SubLObject v_agenda, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        v_agenda = uia_reset(v_agenda);
        uia_initialize_state(v_agenda, plist);
        return v_agenda;
    }

    public static SubLObject uia_act_clear_memoization(final SubLObject v_agenda) {
        uia_clear_memoization_state(v_agenda);
        return v_agenda;
    }

    public static SubLObject uia_launch_action_in_frame(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject frame = NIL;
        SubLObject v_agenda = NIL;
        destructuring_bind_must_consp(current, datum, $list224);
        frame = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list224);
        v_agenda = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(UIA_SCHEDULE_FRAME_FOR_REFRESH, v_agenda, frame), bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject uia_act_new_interaction(final SubLObject v_agenda, final SubLObject mode, final SubLObject operator, SubLObject args, SubLObject plist) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject interaction = new_ui(v_agenda, mode, operator, args);
        ui_note_state(interaction, ui_state_plist_to_state(plist));
        ui_note_status(interaction, $PENDING);
        uia_classify(v_agenda, interaction);
        return interaction;
    }

    public static SubLObject uia_act_new_sub_interaction(final SubLObject super_interaction, final SubLObject operator, SubLObject args, SubLObject plist) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject super_agenda = ui_agenda(super_interaction);
        final SubLObject super_mode = ui_mode(super_interaction);
        final SubLObject super_status = ui_status(super_interaction);
        final SubLObject sub_interaction = new_ui(super_agenda, super_mode, operator, args);
        ui_note_state(sub_interaction, ui_state_plist_to_state(plist));
        ui_note_status(sub_interaction, super_status);
        ui_note_super_interaction(sub_interaction, super_interaction);
        ui_add_sub_interaction(super_interaction, sub_interaction);
        return sub_interaction;
    }

    public static SubLObject uia_act_add_dependent(final SubLObject v_agenda, final SubLObject parent, final SubLObject child) {
        ui_note_parent(child, parent);
        ui_add_child(parent, child);
        ui_note_status(parent, $BLOCKED);
        return parent;
    }

    public static SubLObject uia_act_new_acknowledge_message(final SubLObject v_agenda, final SubLObject message) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $ACKNOWLEDGE_MESSAGE, list(message), UNPROVIDED);
    }

    public static SubLObject uia_act_new_timed_acknowledge_message(final SubLObject v_agenda, final SubLObject message, final SubLObject secs) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $ACKNOWLEDGE_MESSAGE, list(message, secs), UNPROVIDED);
    }

    public static SubLObject uia_act_new_message(final SubLObject v_agenda, final SubLObject message_string) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $MESSAGE, list(message_string), UNPROVIDED);
    }

    public static SubLObject uia_act_new_quick_message(final SubLObject v_agenda, final SubLObject message_string) {
        return uia_act_new_timed_message(v_agenda, message_string, ONE_INTEGER);
    }

    public static SubLObject uia_act_new_timed_message(final SubLObject v_agenda, final SubLObject message_string, final SubLObject secs) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $MESSAGE, list(message_string, secs), UNPROVIDED);
    }

    public static SubLObject uia_act_new_comment(final SubLObject v_agenda, final SubLObject comment_string) {
        return uia_act_new_interaction(v_agenda, $COMMENT, $MESSAGE, list(comment_string), UNPROVIDED);
    }

    public static SubLObject ui_request_p(final SubLObject v_object) {
        if ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED))) {
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(v_object, v_object, $list228);
            operator = v_object.first();
            SubLObject current = v_object.rest();
            destructuring_bind_must_consp(current, v_object, $list228);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_object, $list228);
            signature = current.first();
            current = plist = current.rest();
            return makeBoolean((((NIL != ui_signature_p(signature)) && (NIL != ui_operator_p(operator))) && (NIL != ui_action_type_p(action_type))) && (NIL != list_utilities.property_list_p(plist)));
        }
        return NIL;
    }

    public static SubLObject invalid_ui_signature() {
        return $invalid_ui_signature$.getGlobalValue();
    }

    public static SubLObject valid_ui_request_p(final SubLObject v_object) {
        return makeBoolean((NIL != ui_request_p(v_object)) && (!v_object.equal($invalid_ui_request$.getGlobalValue())));
    }

    public static SubLObject ui_action_type_p(final SubLObject v_object) {
        return keywordp(v_object);
    }

    public static SubLObject make_ui_request(final SubLObject interaction, final SubLObject action_type, final SubLObject plist) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        assert NIL != ui_action_type_p(action_type) : "user_interaction_agenda.ui_action_type_p(action_type) " + "CommonSymbols.NIL != user_interaction_agenda.ui_action_type_p(action_type) " + action_type;
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        return listS(ui_operator(interaction), action_type, ui_signature(interaction), plist);
    }

    public static SubLObject make_empty_ui_request() {
        return listS($EMPTY_AGENDA, $SHOW, invalid_ui_signature(), NIL);
    }

    public static SubLObject make_invalid_ui_request() {
        return $invalid_ui_request$.getGlobalValue();
    }

    public static SubLObject make_ui_reply_with_interaction(final SubLObject interaction, final SubLObject action_type, final SubLObject plist) {
        assert NIL != user_interaction_p(interaction) : "user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) " + interaction;
        assert NIL != ui_action_type_p(action_type) : "user_interaction_agenda.ui_action_type_p(action_type) " + "CommonSymbols.NIL != user_interaction_agenda.ui_action_type_p(action_type) " + action_type;
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        return listS(ui_operator(interaction), action_type, $SIGNATURE, ui_signature(interaction), plist);
    }

    public static SubLObject make_ui_reply_with_agenda(final SubLObject v_agenda, final SubLObject operator, final SubLObject action_type, final SubLObject plist) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + v_agenda;
        assert NIL != ui_operator_p(operator) : "user_interaction_agenda.ui_operator_p(operator) " + "CommonSymbols.NIL != user_interaction_agenda.ui_operator_p(operator) " + operator;
        assert NIL != ui_action_type_p(action_type) : "user_interaction_agenda.ui_action_type_p(action_type) " + "CommonSymbols.NIL != user_interaction_agenda.ui_action_type_p(action_type) " + action_type;
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        return listS(operator, action_type, $AGENDA_SIGNATURE, uia_signature(v_agenda), plist);
    }

    public static SubLObject make_ui_reply(final SubLObject operator, final SubLObject action_type, final SubLObject plist) {
        assert NIL != ui_operator_p(operator) : "user_interaction_agenda.ui_operator_p(operator) " + "CommonSymbols.NIL != user_interaction_agenda.ui_operator_p(operator) " + operator;
        assert NIL != ui_action_type_p(action_type) : "user_interaction_agenda.ui_action_type_p(action_type) " + "CommonSymbols.NIL != user_interaction_agenda.ui_action_type_p(action_type) " + action_type;
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        return listS(operator, action_type, plist);
    }

    public static SubLObject uia_glob(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $GLOB, $UNINITIALIZED_GLOB);
    }

    public static SubLObject uia_glob_reset(final SubLObject v_agenda) {
        final SubLObject v_glob = glob.new_glob(symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        glob.glob_note_owner(v_glob, v_agenda);
        uia_state_update(v_agenda, $GLOB, v_glob);
        return NIL;
    }

    public static SubLObject uia_glob_add(final SubLObject v_agenda, final SubLObject v_object) {
        final SubLObject v_glob = uia_glob(v_agenda);
        return glob.glob_enter(v_glob, v_object);
    }

    public static SubLObject uia_glob_remove(final SubLObject v_agenda, final SubLObject id) {
        final SubLObject v_glob = uia_glob(v_agenda);
        glob.glob_remove_id(v_glob, id);
        return NIL;
    }

    public static SubLObject uia_glob_lookup(final SubLObject v_agenda, final SubLObject id, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject v_glob = uia_glob(v_agenda);
        return glob.glob_lookup(v_glob, id, v_default);
    }

    public static SubLObject uia_glob_pop(final SubLObject v_agenda, final SubLObject id, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject v_object = uia_glob_lookup(v_agenda, id, v_default);
        uia_glob_remove(v_agenda, id);
        return v_object;
    }

    public static SubLObject uia_glob_remove_by_id_string(final SubLObject v_agenda, final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return uia_glob_remove(v_agenda, id);
    }

    public static SubLObject uia_glob_lookup_by_id_string(final SubLObject v_agenda, final SubLObject id_string, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return uia_glob_lookup(v_agenda, id, v_default);
    }

    public static SubLObject uia_glob_pop_by_id_string(final SubLObject v_agenda, final SubLObject id_string, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return uia_glob_pop(v_agenda, id, v_default);
    }

    public static SubLObject declare_user_interaction_agenda_file() {
        declareMacro(me, "with_uia_lock", "WITH-UIA-LOCK");
        declareFunction(me, "user_interaction_mode_p", "USER-INTERACTION-MODE-P", 1, 0, false);
        declareFunction(me, "user_interaction_status_p", "USER-INTERACTION-STATUS-P", 1, 0, false);
        declareFunction(me, "ui_operator_p", "UI-OPERATOR-P", 1, 0, false);
        declareFunction(me, "user_interaction_print_function_trampoline", "USER-INTERACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "user_interaction_p", "USER-INTERACTION-P", 1, 0, false);
        new user_interaction_agenda.$user_interaction_p$UnaryFunction();
        declareFunction(me, "ui_id", "UI-ID", 1, 0, false);
        declareFunction(me, "ui_agenda", "UI-AGENDA", 1, 0, false);
        declareFunction(me, "ui_mode", "UI-MODE", 1, 0, false);
        declareFunction(me, "ui_status", "UI-STATUS", 1, 0, false);
        declareFunction(me, "ui_start_time", "UI-START-TIME", 1, 0, false);
        declareFunction(me, "ui_finish_time", "UI-FINISH-TIME", 1, 0, false);
        declareFunction(me, "ui_parent_interaction", "UI-PARENT-INTERACTION", 1, 0, false);
        declareFunction(me, "ui_child_interactions", "UI-CHILD-INTERACTIONS", 1, 0, false);
        declareFunction(me, "ui_operator", "UI-OPERATOR", 1, 0, false);
        declareFunction(me, "ui_args", "UI-ARGS", 1, 0, false);
        declareFunction(me, "ui_result", "UI-RESULT", 1, 0, false);
        declareFunction(me, "ui_state", "UI-STATE", 1, 0, false);
        declareFunction(me, "_csetf_ui_id", "_CSETF-UI-ID", 2, 0, false);
        declareFunction(me, "_csetf_ui_agenda", "_CSETF-UI-AGENDA", 2, 0, false);
        declareFunction(me, "_csetf_ui_mode", "_CSETF-UI-MODE", 2, 0, false);
        declareFunction(me, "_csetf_ui_status", "_CSETF-UI-STATUS", 2, 0, false);
        declareFunction(me, "_csetf_ui_start_time", "_CSETF-UI-START-TIME", 2, 0, false);
        declareFunction(me, "_csetf_ui_finish_time", "_CSETF-UI-FINISH-TIME", 2, 0, false);
        declareFunction(me, "_csetf_ui_parent_interaction", "_CSETF-UI-PARENT-INTERACTION", 2, 0, false);
        declareFunction(me, "_csetf_ui_child_interactions", "_CSETF-UI-CHILD-INTERACTIONS", 2, 0, false);
        declareFunction(me, "_csetf_ui_operator", "_CSETF-UI-OPERATOR", 2, 0, false);
        declareFunction(me, "_csetf_ui_args", "_CSETF-UI-ARGS", 2, 0, false);
        declareFunction(me, "_csetf_ui_result", "_CSETF-UI-RESULT", 2, 0, false);
        declareFunction(me, "_csetf_ui_state", "_CSETF-UI-STATE", 2, 0, false);
        declareFunction(me, "make_user_interaction", "MAKE-USER-INTERACTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_user_interaction", "VISIT-DEFSTRUCT-USER-INTERACTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_user_interaction_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_user_interaction_method", "SXHASH-USER-INTERACTION-METHOD", 1, 0, false);
        declareFunction(me, "print_user_interaction", "PRINT-USER-INTERACTION", 3, 0, false);
        declareFunction(me, "new_ui", "NEW-UI", 3, 1, false);
        declareFunction(me, "ui_note_mode", "UI-NOTE-MODE", 2, 0, false);
        declareFunction(me, "ui_note_status", "UI-NOTE-STATUS", 2, 0, false);
        declareFunction(me, "ui_note_start_time", "UI-NOTE-START-TIME", 2, 0, false);
        declareFunction(me, "ui_note_finish_time", "UI-NOTE-FINISH-TIME", 2, 0, false);
        declareFunction(me, "ui_note_parent", "UI-NOTE-PARENT", 2, 0, false);
        declareFunction(me, "ui_add_child", "UI-ADD-CHILD", 2, 0, false);
        declareFunction(me, "ui_note_result", "UI-NOTE-RESULT", 2, 0, false);
        declareFunction(me, "ui_note_state", "UI-NOTE-STATE", 2, 0, false);
        declareFunction(me, "user_interaction_agenda_print_function_trampoline", "USER-INTERACTION-AGENDA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "user_interaction_agenda_p", "USER-INTERACTION-AGENDA-P", 1, 0, false);
        new user_interaction_agenda.$user_interaction_agenda_p$UnaryFunction();
        declareFunction(me, "uia_id", "UIA-ID", 1, 0, false);
        declareFunction(me, "uia_meta_agenda", "UIA-META-AGENDA", 1, 0, false);
        declareFunction(me, "uia_isg", "UIA-ISG", 1, 0, false);
        declareFunction(me, "uia_index", "UIA-INDEX", 1, 0, false);
        declareFunction(me, "uia_history", "UIA-HISTORY", 1, 0, false);
        declareFunction(me, "uia_undos", "UIA-UNDOS", 1, 0, false);
        declareFunction(me, "uia_messages", "UIA-MESSAGES", 1, 0, false);
        declareFunction(me, "uia_requirements", "UIA-REQUIREMENTS", 1, 0, false);
        declareFunction(me, "uia_relevant_suggestions", "UIA-RELEVANT-SUGGESTIONS", 1, 0, false);
        declareFunction(me, "uia_possible_suggestions", "UIA-POSSIBLE-SUGGESTIONS", 1, 0, false);
        declareFunction(me, "uia_comments", "UIA-COMMENTS", 1, 0, false);
        declareFunction(me, "uia_state", "UIA-STATE", 1, 0, false);
        declareFunction(me, "_csetf_uia_id", "_CSETF-UIA-ID", 2, 0, false);
        declareFunction(me, "_csetf_uia_meta_agenda", "_CSETF-UIA-META-AGENDA", 2, 0, false);
        declareFunction(me, "_csetf_uia_isg", "_CSETF-UIA-ISG", 2, 0, false);
        declareFunction(me, "_csetf_uia_index", "_CSETF-UIA-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_uia_history", "_CSETF-UIA-HISTORY", 2, 0, false);
        declareFunction(me, "_csetf_uia_undos", "_CSETF-UIA-UNDOS", 2, 0, false);
        declareFunction(me, "_csetf_uia_messages", "_CSETF-UIA-MESSAGES", 2, 0, false);
        declareFunction(me, "_csetf_uia_requirements", "_CSETF-UIA-REQUIREMENTS", 2, 0, false);
        declareFunction(me, "_csetf_uia_relevant_suggestions", "_CSETF-UIA-RELEVANT-SUGGESTIONS", 2, 0, false);
        declareFunction(me, "_csetf_uia_possible_suggestions", "_CSETF-UIA-POSSIBLE-SUGGESTIONS", 2, 0, false);
        declareFunction(me, "_csetf_uia_comments", "_CSETF-UIA-COMMENTS", 2, 0, false);
        declareFunction(me, "_csetf_uia_state", "_CSETF-UIA-STATE", 2, 0, false);
        declareFunction(me, "make_user_interaction_agenda", "MAKE-USER-INTERACTION-AGENDA", 0, 1, false);
        declareFunction(me, "visit_defstruct_user_interaction_agenda", "VISIT-DEFSTRUCT-USER-INTERACTION-AGENDA", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_user_interaction_agenda_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-AGENDA-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_user_interaction_agenda_method", "SXHASH-USER-INTERACTION-AGENDA-METHOD", 1, 0, false);
        declareFunction(me, "print_user_interaction_agenda", "PRINT-USER-INTERACTION-AGENDA", 3, 0, false);
        declareFunction(me, "new_uia", "NEW-UIA", 1, 0, false);
        declareFunction(me, "uia_reset", "UIA-RESET", 1, 0, false);
        declareFunction(me, "uia_find_by_id", "UIA-FIND-BY-ID", 2, 0, false);
        declareFunction(me, "uia_find_by_id_string", "UIA-FIND-BY-ID-STRING", 2, 0, false);
        declareFunction(me, "uia_some_interaction_p", "UIA-SOME-INTERACTION-P", 1, 0, false);
        declareFunction(me, "uia_interaction_sequence", "UIA-INTERACTION-SEQUENCE", 1, 0, false);
        declareFunction(me, "uia_some_history_p", "UIA-SOME-HISTORY-P", 1, 0, false);
        declareFunction(me, "uia_history_sequence", "UIA-HISTORY-SEQUENCE", 1, 0, false);
        declareFunction(me, "uia_some_undo_p", "UIA-SOME-UNDO-P", 1, 0, false);
        declareFunction(me, "uia_undo_sequence", "UIA-UNDO-SEQUENCE", 1, 0, false);
        declareFunction(me, "uia_some_message_p", "UIA-SOME-MESSAGE-P", 1, 0, false);
        declareFunction(me, "uia_message_sequence", "UIA-MESSAGE-SEQUENCE", 1, 0, false);
        declareFunction(me, "uia_some_requirement_p", "UIA-SOME-REQUIREMENT-P", 1, 0, false);
        declareFunction(me, "uia_requirement_sequence", "UIA-REQUIREMENT-SEQUENCE", 1, 0, false);
        declareFunction(me, "uia_some_relevant_suggestion_p", "UIA-SOME-RELEVANT-SUGGESTION-P", 1, 0, false);
        declareFunction(me, "uia_relevant_suggestion_sequence", "UIA-RELEVANT-SUGGESTION-SEQUENCE", 1, 0, false);
        declareFunction(me, "uia_some_possible_suggestion_p", "UIA-SOME-POSSIBLE-SUGGESTION-P", 1, 0, false);
        declareFunction(me, "uia_possible_suggestion_sequence", "UIA-POSSIBLE-SUGGESTION-SEQUENCE", 1, 0, false);
        declareFunction(me, "uia_some_comment_p", "UIA-SOME-COMMENT-P", 1, 0, false);
        declareFunction(me, "uia_comment_sequence", "UIA-COMMENT-SEQUENCE", 1, 0, false);
        declareFunction(me, "uia_default_operator", "UIA-DEFAULT-OPERATOR", 1, 0, false);
        declareFunction(me, "uia_initialized_p", "UIA-INITIALIZED-P", 1, 0, false);
        declareFunction(me, "uia_add_to_index", "UIA-ADD-TO-INDEX", 3, 0, false);
        declareFunction(me, "uia_add_to_history", "UIA-ADD-TO-HISTORY", 2, 0, false);
        declareFunction(me, "uia_clear_undos", "UIA-CLEAR-UNDOS", 1, 0, false);
        declareFunction(me, "uia_add_undo", "UIA-ADD-UNDO", 2, 0, false);
        declareFunction(me, "uia_rem_undo", "UIA-REM-UNDO", 2, 0, false);
        declareFunction(me, "uia_add_message", "UIA-ADD-MESSAGE", 2, 0, false);
        declareFunction(me, "uia_rem_message", "UIA-REM-MESSAGE", 2, 0, false);
        declareFunction(me, "uia_add_requirement", "UIA-ADD-REQUIREMENT", 2, 0, false);
        declareFunction(me, "uia_rem_requirement", "UIA-REM-REQUIREMENT", 2, 0, false);
        declareFunction(me, "uia_add_relevant_suggestion", "UIA-ADD-RELEVANT-SUGGESTION", 2, 0, false);
        declareFunction(me, "uia_rem_relevant_suggestion", "UIA-REM-RELEVANT-SUGGESTION", 2, 0, false);
        declareFunction(me, "uia_add_possible_suggestion", "UIA-ADD-POSSIBLE-SUGGESTION", 2, 0, false);
        declareFunction(me, "uia_rem_possible_suggestion", "UIA-REM-POSSIBLE-SUGGESTION", 2, 0, false);
        declareFunction(me, "uia_add_comment", "UIA-ADD-COMMENT", 2, 0, false);
        declareFunction(me, "uia_rem_comment", "UIA-REM-COMMENT", 2, 0, false);
        declareFunction(me, "uia_clear_comments", "UIA-CLEAR-COMMENTS", 1, 0, false);
        declareFunction(me, "uia_background_task_p", "UIA-BACKGROUND-TASK-P", 1, 0, false);
        declareFunction(me, "uia_can_treat_comments_as_mumblingP", "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?", 0, 0, false);
        declareFunction(me, "uia_cannot_treat_comments_as_mumbling", "UIA-CANNOT-TREAT-COMMENTS-AS-MUMBLING", 0, 0, false);
        declareFunction(me, "uia_can_treat_comments_as_mumbling", "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING", 0, 0, false);
        declareFunction(me, "uia_process_new_comment", "UIA-PROCESS-NEW-COMMENT", 2, 0, false);
        declareFunction(me, "uia_classify", "UIA-CLASSIFY", 2, 0, false);
        declareFunction(me, "uia_declassify", "UIA-DECLASSIFY", 2, 0, false);
        declareFunction(me, "uia_note_state", "UIA-NOTE-STATE", 2, 0, false);
        declareFunction(me, "uia_global_id_string", "UIA-GLOBAL-ID-STRING", 1, 0, false);
        declareFunction(me, "uia_from_ids", "UIA-FROM-IDS", 2, 0, false);
        declareFunction(me, "uia_determine_superior_topic_identification", "UIA-DETERMINE-SUPERIOR-TOPIC-IDENTIFICATION", 1, 0, false);
        declareMacro(me, "do_uias", "DO-UIAS");
        declareMacro(me, "do_uis", "DO-UIS");
        declareFunction(me, "uia_language_parsing_mt", "UIA-LANGUAGE-PARSING-MT", 1, 0, false);
        declareFunction(me, "uia_language_parsing_mt_update", "UIA-LANGUAGE-PARSING-MT-UPDATE", 2, 0, false);
        declareFunction(me, "uia_language_generation_mt", "UIA-LANGUAGE-GENERATION-MT", 1, 0, false);
        declareFunction(me, "uia_language_generation_mt_update", "UIA-LANGUAGE-GENERATION-MT-UPDATE", 2, 0, false);
        declareFunction(me, "uia_language_lexical_mt", "UIA-LANGUAGE-LEXICAL-MT", 1, 0, false);
        declareFunction(me, "uia_language_lexical_mt_update", "UIA-LANGUAGE-LEXICAL-MT-UPDATE", 2, 0, false);
        declareFunction(me, "uia_domain_mt", "UIA-DOMAIN-MT", 1, 0, false);
        declareFunction(me, "uia_domain_mt_update", "UIA-DOMAIN-MT-UPDATE", 2, 0, false);
        declareFunction(me, "uia_parsing_mt", "UIA-PARSING-MT", 1, 0, false);
        declareFunction(me, "uia_parsing_mt_update", "UIA-PARSING-MT-UPDATE", 2, 0, false);
        declareFunction(me, "uia_generation_mt", "UIA-GENERATION-MT", 1, 1, false);
        declareFunction(me, "uia_generation_mt_update", "UIA-GENERATION-MT-UPDATE", 2, 0, false);
        declareFunction(me, "uia_all_interaction_mts", "UIA-ALL-INTERACTION-MTS", 1, 1, false);
        declareFunction(me, "uia_note_interaction_mt", "UIA-NOTE-INTERACTION-MT", 2, 0, false);
        declareFunction(me, "uia_domain_interaction_mt", "UIA-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "uia_domain_interaction_mt_update", "UIA-DOMAIN-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction(me, "uia_parsing_interaction_mt", "UIA-PARSING-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "uia_parsing_interaction_mt_update", "UIA-PARSING-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction(me, "uia_generation_interaction_mt", "UIA-GENERATION-INTERACTION-MT", 1, 1, false);
        declareFunction(me, "uia_generation_language_mt", "UIA-GENERATION-LANGUAGE-MT", 1, 0, false);
        declareFunction(me, "uia_generation_domain_mt", "UIA-GENERATION-DOMAIN-MT", 1, 0, false);
        declareFunction(me, "uia_generation_interaction_mt_update", "UIA-GENERATION-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction(me, "uia_lexical_interaction_mt", "UIA-LEXICAL-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "uia_lexical_interaction_mt_update", "UIA-LEXICAL-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction(me, "ui_domain_interaction_mt", "UI-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "ui_parsing_interaction_mt", "UI-PARSING-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "ui_generation_interaction_mt", "UI-GENERATION-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "ui_generation_language_mt", "UI-GENERATION-LANGUAGE-MT", 1, 0, false);
        declareFunction(me, "ui_generation_domain_mt", "UI-GENERATION-DOMAIN-MT", 1, 0, false);
        declareFunction(me, "ui_lexical_interaction_mt", "UI-LEXICAL-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "uia_ensure_scenario_interaction_mt", "UIA-ENSURE-SCENARIO-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "user_interaction_meta_agenda_print_function_trampoline", "USER-INTERACTION-META-AGENDA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "user_interaction_meta_agenda_p", "USER-INTERACTION-META-AGENDA-P", 1, 0, false);
        new user_interaction_agenda.$user_interaction_meta_agenda_p$UnaryFunction();
        declareFunction(me, "uima_id", "UIMA-ID", 1, 0, false);
        declareFunction(me, "uima_isg", "UIMA-ISG", 1, 0, false);
        declareFunction(me, "uima_index", "UIMA-INDEX", 1, 0, false);
        declareFunction(me, "uima_open_agendas", "UIMA-OPEN-AGENDAS", 1, 0, false);
        declareFunction(me, "uima_current_agenda", "UIMA-CURRENT-AGENDA", 1, 0, false);
        declareFunction(me, "uima_state", "UIMA-STATE", 1, 0, false);
        declareFunction(me, "_csetf_uima_id", "_CSETF-UIMA-ID", 2, 0, false);
        declareFunction(me, "_csetf_uima_isg", "_CSETF-UIMA-ISG", 2, 0, false);
        declareFunction(me, "_csetf_uima_index", "_CSETF-UIMA-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_uima_open_agendas", "_CSETF-UIMA-OPEN-AGENDAS", 2, 0, false);
        declareFunction(me, "_csetf_uima_current_agenda", "_CSETF-UIMA-CURRENT-AGENDA", 2, 0, false);
        declareFunction(me, "_csetf_uima_state", "_CSETF-UIMA-STATE", 2, 0, false);
        declareFunction(me, "make_user_interaction_meta_agenda", "MAKE-USER-INTERACTION-META-AGENDA", 0, 1, false);
        declareFunction(me, "visit_defstruct_user_interaction_meta_agenda", "VISIT-DEFSTRUCT-USER-INTERACTION-META-AGENDA", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_user_interaction_meta_agenda_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-META-AGENDA-METHOD", 2, 0, false);
        declareFunction(me, "new_uima", "NEW-UIMA", 0, 0, false);
        declareFunction(me, "uima_reset", "UIMA-RESET", 1, 0, false);
        declareFunction(me, "uima_find_by_id", "UIMA-FIND-BY-ID", 2, 0, false);
        declareFunction(me, "uima_find_by_id_string", "UIMA-FIND-BY-ID-STRING", 2, 0, false);
        declareFunction(me, "uima_some_open_agendas_p", "UIMA-SOME-OPEN-AGENDAS-P", 1, 0, false);
        declareFunction(me, "uima_open_agendas_sequence", "UIMA-OPEN-AGENDAS-SEQUENCE", 1, 0, false);
        declareFunction(me, "uima_match_mt_to_agenda", "UIMA-MATCH-MT-TO-AGENDA", 2, 0, false);
        declareFunction(me, "uima_add_to_index", "UIMA-ADD-TO-INDEX", 3, 0, false);
        declareFunction(me, "uima_add_open_agenda", "UIMA-ADD-OPEN-AGENDA", 2, 0, false);
        declareFunction(me, "uima_clear_current_agenda", "UIMA-CLEAR-CURRENT-AGENDA", 1, 0, false);
        declareFunction(me, "uima_note_current_agenda", "UIMA-NOTE-CURRENT-AGENDA", 2, 0, false);
        declareFunction(me, "uima_note_state", "UIMA-NOTE-STATE", 2, 0, false);
        declareMacro(me, "do_uimas", "DO-UIMAS");
        declareFunction(me, "system_uimma", "SYSTEM-UIMMA", 0, 0, false);
        declareFunction(me, "uimma", "UIMMA", 0, 0, false);
        declareFunction(me, "new_uimma", "NEW-UIMMA", 0, 0, false);
        declareFunction(me, "uimma_reset", "UIMMA-RESET", 0, 0, false);
        declareFunction(me, "uimma_new_id", "UIMMA-NEW-ID", 0, 0, false);
        declareFunction(me, "uimma_add_to_index", "UIMMA-ADD-TO-INDEX", 2, 0, false);
        declareFunction(me, "uimma_find_by_id", "UIMMA-FIND-BY-ID", 1, 0, false);
        declareFunction(me, "uimma_default_locale", "UIMMA-DEFAULT-LOCALE", 0, 0, false);
        declareFunction(me, "set_uimma_default_locale", "SET-UIMMA-DEFAULT-LOCALE", 1, 0, false);
        declareFunction(me, "uimma_default_generation_mt", "UIMMA-DEFAULT-GENERATION-MT", 0, 0, false);
        declareFunction(me, "set_uimma_default_generation_mt", "SET-UIMMA-DEFAULT-GENERATION-MT", 1, 0, false);
        declareFunction(me, "uimma_default_domain_mt", "UIMMA-DEFAULT-DOMAIN-MT", 0, 0, false);
        declareFunction(me, "set_uimma_default_domain_mt", "SET-UIMMA-DEFAULT-DOMAIN-MT", 1, 0, false);
        declareFunction(me, "ui_meta_agenda", "UI-META-AGENDA", 1, 0, false);
        declareFunction(me, "uia_total_interaction_count", "UIA-TOTAL-INTERACTION-COUNT", 1, 0, false);
        declareFunction(me, "uia_finished_interaction_count", "UIA-FINISHED-INTERACTION-COUNT", 1, 0, false);
        declareFunction(me, "ui_state_plist_to_state", "UI-STATE-PLIST-TO-STATE", 1, 0, false);
        declareFunction(me, "ui_state_lookup", "UI-STATE-LOOKUP", 2, 1, false);
        declareFunction(me, "ui_state_update", "UI-STATE-UPDATE", 3, 0, false);
        declareFunction(me, "ui_state_clear", "UI-STATE-CLEAR", 2, 0, false);
        declareFunction(me, "ui_state_clear_all", "UI-STATE-CLEAR-ALL", 1, 0, false);
        declareFunction(me, "uia_state_plist_to_state", "UIA-STATE-PLIST-TO-STATE", 1, 0, false);
        declareFunction(me, "uia_initialize_state", "UIA-INITIALIZE-STATE", 2, 0, false);
        declareFunction(me, "uia_state_lookup", "UIA-STATE-LOOKUP", 2, 1, false);
        declareFunction(me, "uia_state_update", "UIA-STATE-UPDATE", 3, 0, false);
        declareFunction(me, "uia_state_clear", "UIA-STATE-CLEAR", 2, 0, false);
        declareFunction(me, "uia_state_clear_all", "UIA-STATE-CLEAR-ALL", 1, 0, false);
        declareFunction(me, "uima_state_plist_to_state", "UIMA-STATE-PLIST-TO-STATE", 1, 0, false);
        declareFunction(me, "uima_initialize_state", "UIMA-INITIALIZE-STATE", 2, 0, false);
        declareFunction(me, "uima_state_lookup", "UIMA-STATE-LOOKUP", 2, 1, false);
        declareFunction(me, "uima_state_update", "UIMA-STATE-UPDATE", 3, 0, false);
        declareFunction(me, "uima_state_clear", "UIMA-STATE-CLEAR", 2, 0, false);
        declareFunction(me, "uima_state_clear_all", "UIMA-STATE-CLEAR-ALL", 1, 0, false);
        declareMacro(me, "with_uia_memoization_state", "WITH-UIA-MEMOIZATION-STATE");
        declareFunction(me, "uia_memoization_state", "UIA-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "uia_create_memoization_state", "UIA-CREATE-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "uia_clear_memoization_state", "UIA-CLEAR-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "uia_clear_memoization_state_for_function", "UIA-CLEAR-MEMOIZATION-STATE-FOR-FUNCTION", 2, 0, false);
        declareMacro(me, "with_uima_memoization_state", "WITH-UIMA-MEMOIZATION-STATE");
        declareFunction(me, "uima_memoization_state", "UIMA-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "uima_create_memoization_state", "UIMA-CREATE-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "uima_clear_memoization_state", "UIMA-CLEAR-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "ui_ancestor_interactions", "UI-ANCESTOR-INTERACTIONS", 1, 0, false);
        declareFunction(me, "ui_pending_descendant_interactions", "UI-PENDING-DESCENDANT-INTERACTIONS", 1, 0, false);
        declareFunction(me, "ui_pending_descendants_recursive", "UI-PENDING-DESCENDANTS-RECURSIVE", 2, 0, false);
        declareFunction(me, "ui_sub_interactions", "UI-SUB-INTERACTIONS", 1, 0, false);
        declareFunction(me, "ui_super_interaction", "UI-SUPER-INTERACTION", 1, 0, false);
        declareFunction(me, "ui_add_sub_interaction", "UI-ADD-SUB-INTERACTION", 2, 0, false);
        declareFunction(me, "ui_remove_sub_interaction", "UI-REMOVE-SUB-INTERACTION", 1, 0, false);
        declareFunction(me, "ui_note_super_interaction", "UI-NOTE-SUPER-INTERACTION", 2, 0, false);
        declareFunction(me, "uia_act_promote_to_child", "UIA-ACT-PROMOTE-TO-CHILD", 1, 0, false);
        declareFunction(me, "ui_recompute_status", "UI-RECOMPUTE-STATUS", 1, 0, false);
        declareFunction(me, "ui_alive_p", "UI-ALIVE-P", 1, 0, false);
        declareFunction(me, "uia_next_action", "UIA-NEXT-ACTION", 1, 0, false);
        declareFunction(me, "uia_note_user_selection", "UIA-NOTE-USER-SELECTION", 2, 0, false);
        declareFunction(me, "uia_promote_interaction", "UIA-PROMOTE-INTERACTION", 2, 0, false);
        declareFunction(me, "uia_best_pending_action", "UIA-BEST-PENDING-ACTION", 1, 0, false);
        declareFunction(me, "uia_pending_action_p", "UIA-PENDING-ACTION-P", 1, 0, false);
        declareFunction(me, "uia_first_pending_nonbackground_action", "UIA-FIRST-PENDING-NONBACKGROUND-ACTION", 1, 0, false);
        declareFunction(me, "uia_signature_p", "UIA-SIGNATURE-P", 1, 0, false);
        declareFunction(me, "uia_signature", "UIA-SIGNATURE", 1, 0, false);
        declareFunction(me, "find_uia_by_signature", "FIND-UIA-BY-SIGNATURE", 1, 0, false);
        declareFunction(me, "ui_signature_p", "UI-SIGNATURE-P", 1, 0, false);
        declareFunction(me, "ui_signature", "UI-SIGNATURE", 1, 0, false);
        declareFunction(me, "ui_signature_to_property_list", "UI-SIGNATURE-TO-PROPERTY-LIST", 1, 0, false);
        declareFunction(me, "find_ui_by_signature", "FIND-UI-BY-SIGNATURE", 1, 0, false);
        declareFunction(me, "uia_schedule_frame_for_refresh", "UIA-SCHEDULE-FRAME-FOR-REFRESH", 2, 0, false);
        declareFunction(me, "uia_get_frames_scheduled_for_refresh", "UIA-GET-FRAMES-SCHEDULED-FOR-REFRESH", 1, 0, false);
        declareFunction(me, "uia_crumb_trail", "UIA-CRUMB-TRAIL", 1, 0, false);
        declareFunction(me, "uia_create_new_crumb_trail", "UIA-CREATE-NEW-CRUMB-TRAIL", 1, 0, false);
        declareFunction(me, "uia_update_term_crumb_trail", "UIA-UPDATE-TERM-CRUMB-TRAIL", 2, 0, false);
        declareFunction(me, "uia_update_fact_crumb_trail", "UIA-UPDATE-FACT-CRUMB-TRAIL", 2, 0, false);
        declareFunction(me, "uia_update_question_crumb_trail", "UIA-UPDATE-QUESTION-CRUMB-TRAIL", 2, 0, false);
        declareFunction(me, "uia_crumb_trail_stale_assertionP", "UIA-CRUMB-TRAIL-STALE-ASSERTION?", 1, 0, false);
        declareFunction(me, "uia_crumb_trail_el_sentenceP", "UIA-CRUMB-TRAIL-EL-SENTENCE?", 1, 0, false);
        declareFunction(me, "uia_crumb_trail_facts_equalP", "UIA-CRUMB-TRAIL-FACTS-EQUAL?", 2, 0, false);
        declareFunction(me, "uia_get_term_crumb_trail", "UIA-GET-TERM-CRUMB-TRAIL", 1, 0, false);
        declareFunction(me, "uia_get_fact_crumb_trail", "UIA-GET-FACT-CRUMB-TRAIL", 1, 0, false);
        declareFunction(me, "uia_get_question_crumb_trail", "UIA-GET-QUESTION-CRUMB-TRAIL", 1, 0, false);
        declareFunction(me, "uia_remove_crumb_trail_term", "UIA-REMOVE-CRUMB-TRAIL-TERM", 2, 0, false);
        declareFunction(me, "uia_remove_crumb_trail_fact", "UIA-REMOVE-CRUMB-TRAIL-FACT", 2, 0, false);
        declareFunction(me, "uia_remove_crumb_trail_question", "UIA-REMOVE-CRUMB-TRAIL-QUESTION", 2, 0, false);
        declareFunction(me, "uia_shorten_term_crumb_trail", "UIA-SHORTEN-TERM-CRUMB-TRAIL", 2, 0, false);
        declareFunction(me, "uia_shorten_fact_crumb_trail", "UIA-SHORTEN-FACT-CRUMB-TRAIL", 2, 0, false);
        declareFunction(me, "uia_shorten_question_crumb_trail", "UIA-SHORTEN-QUESTION-CRUMB-TRAIL", 2, 0, false);
        declareFunction(me, "uia_reset_crumb_trail", "UIA-RESET-CRUMB-TRAIL", 1, 0, false);
        declareFunction(me, "uia_add_term_to_crumb_trail", "UIA-ADD-TERM-TO-CRUMB-TRAIL", 2, 0, false);
        declareFunction(me, "uia_add_question_to_crumb_trail", "UIA-ADD-QUESTION-TO-CRUMB-TRAIL", 2, 1, false);
        declareFunction(me, "uia_add_fact_to_crumb_trail", "UIA-ADD-FACT-TO-CRUMB-TRAIL", 2, 1, false);
        declareFunction(me, "uia_crumb_trail_encapsulate_assertion", "UIA-CRUMB-TRAIL-ENCAPSULATE-ASSERTION", 1, 0, false);
        declareFunction(me, "uia_crumb_trail_encapsulate_sentence", "UIA-CRUMB-TRAIL-ENCAPSULATE-SENTENCE", 2, 0, false);
        declareFunction(me, "uia_get_terms_on_crumb_trail", "UIA-GET-TERMS-ON-CRUMB-TRAIL", 1, 0, false);
        declareFunction(me, "uia_get_facts_on_crumb_trail", "UIA-GET-FACTS-ON-CRUMB-TRAIL", 1, 0, false);
        declareFunction(me, "uia_get_questions_on_crumb_trail", "UIA-GET-QUESTIONS-ON-CRUMB-TRAIL", 1, 0, false);
        declareFunction(me, "uia_anything_on_crumb_trailP", "UIA-ANYTHING-ON-CRUMB-TRAIL?", 1, 0, false);
        declareFunction(me, "uia_remove_term_from_crumb_trail", "UIA-REMOVE-TERM-FROM-CRUMB-TRAIL", 2, 0, false);
        declareFunction(me, "uia_remove_fact_from_crumb_trail", "UIA-REMOVE-FACT-FROM-CRUMB-TRAIL", 2, 0, false);
        declareFunction(me, "uia_remove_question_from_crumb_trail", "UIA-REMOVE-QUESTION-FROM-CRUMB-TRAIL", 2, 0, false);
        declareFunction(me, "uia_shorten_crumb_trail_to", "UIA-SHORTEN-CRUMB-TRAIL-TO", 1, 1, false);
        declareFunction(me, "uima_act_create", "UIMA-ACT-CREATE", 0, 1, false);
        declareFunction(me, "uima_act_focus", "UIMA-ACT-FOCUS", 2, 0, false);
        declareFunction(me, "uia_act_create", "UIA-ACT-CREATE", 1, 1, false);
        declareFunction(me, "uia_act_standard_initialization", "UIA-ACT-STANDARD-INITIALIZATION", 1, 0, false);
        declareFunction(me, "uima_act_reset", "UIMA-ACT-RESET", 1, 1, false);
        declareFunction(me, "uia_act_reset", "UIA-ACT-RESET", 1, 1, false);
        declareFunction(me, "uia_act_clear_memoization", "UIA-ACT-CLEAR-MEMOIZATION", 1, 0, false);
        declareMacro(me, "uia_launch_action_in_frame", "UIA-LAUNCH-ACTION-IN-FRAME");
        declareFunction(me, "uia_act_new_interaction", "UIA-ACT-NEW-INTERACTION", 3, 2, false);
        declareFunction(me, "uia_act_new_sub_interaction", "UIA-ACT-NEW-SUB-INTERACTION", 2, 2, false);
        declareFunction(me, "uia_act_add_dependent", "UIA-ACT-ADD-DEPENDENT", 3, 0, false);
        declareFunction(me, "uia_act_new_acknowledge_message", "UIA-ACT-NEW-ACKNOWLEDGE-MESSAGE", 2, 0, false);
        declareFunction(me, "uia_act_new_timed_acknowledge_message", "UIA-ACT-NEW-TIMED-ACKNOWLEDGE-MESSAGE", 3, 0, false);
        declareFunction(me, "uia_act_new_message", "UIA-ACT-NEW-MESSAGE", 2, 0, false);
        declareFunction(me, "uia_act_new_quick_message", "UIA-ACT-NEW-QUICK-MESSAGE", 2, 0, false);
        declareFunction(me, "uia_act_new_timed_message", "UIA-ACT-NEW-TIMED-MESSAGE", 3, 0, false);
        declareFunction(me, "uia_act_new_comment", "UIA-ACT-NEW-COMMENT", 2, 0, false);
        declareFunction(me, "ui_request_p", "UI-REQUEST-P", 1, 0, false);
        declareFunction(me, "invalid_ui_signature", "INVALID-UI-SIGNATURE", 0, 0, false);
        declareFunction(me, "valid_ui_request_p", "VALID-UI-REQUEST-P", 1, 0, false);
        declareFunction(me, "ui_action_type_p", "UI-ACTION-TYPE-P", 1, 0, false);
        declareFunction(me, "make_ui_request", "MAKE-UI-REQUEST", 3, 0, false);
        declareFunction(me, "make_empty_ui_request", "MAKE-EMPTY-UI-REQUEST", 0, 0, false);
        declareFunction(me, "make_invalid_ui_request", "MAKE-INVALID-UI-REQUEST", 0, 0, false);
        declareFunction(me, "make_ui_reply_with_interaction", "MAKE-UI-REPLY-WITH-INTERACTION", 3, 0, false);
        declareFunction(me, "make_ui_reply_with_agenda", "MAKE-UI-REPLY-WITH-AGENDA", 4, 0, false);
        declareFunction(me, "make_ui_reply", "MAKE-UI-REPLY", 3, 0, false);
        declareFunction(me, "uia_glob", "UIA-GLOB", 1, 0, false);
        declareFunction(me, "uia_glob_reset", "UIA-GLOB-RESET", 1, 0, false);
        declareFunction(me, "uia_glob_add", "UIA-GLOB-ADD", 2, 0, false);
        declareFunction(me, "uia_glob_remove", "UIA-GLOB-REMOVE", 2, 0, false);
        declareFunction(me, "uia_glob_lookup", "UIA-GLOB-LOOKUP", 2, 1, false);
        declareFunction(me, "uia_glob_pop", "UIA-GLOB-POP", 2, 1, false);
        declareFunction(me, "uia_glob_remove_by_id_string", "UIA-GLOB-REMOVE-BY-ID-STRING", 2, 0, false);
        declareFunction(me, "uia_glob_lookup_by_id_string", "UIA-GLOB-LOOKUP-BY-ID-STRING", 2, 1, false);
        declareFunction(me, "uia_glob_pop_by_id_string", "UIA-GLOB-POP-BY-ID-STRING", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_user_interaction_agenda_file() {
        deflexical("*UIA-LOCK*", SubLTrampolineFile.maybeDefault($uia_lock$, $uia_lock$, () -> make_lock($$$User_Interaction_Agenda_lock)));
        deflexical("*USER-INTERACTION-MODES*", $list4);
        deflexical("*USER-INTERACTION-STATUSES*", $list5);
        defconstant("*DTP-USER-INTERACTION*", USER_INTERACTION);
        defconstant("*DTP-USER-INTERACTION-AGENDA*", USER_INTERACTION_AGENDA);
        defparameter("*UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?*", T);
        defconstant("*DTP-USER-INTERACTION-META-AGENDA*", USER_INTERACTION_META_AGENDA);
        deflexical("*UIMMA*", SubLTrampolineFile.maybeDefault($uimma$, $uimma$, NIL));
        deflexical("*UIMMA-DEFAULT-LOCALE*", SubLTrampolineFile.maybeDefault($uimma_default_locale$, $uimma_default_locale$, () -> NIL != system_info.cycorp_execution_context_p() ? $$EnglishLanguage : $$EnglishLanguage));
        deflexical("*UIMMA-DEFAULT-GENERATION-MT*", SubLTrampolineFile.maybeDefault($uimma_default_generation_mt$, $uimma_default_generation_mt$, $$EnglishParaphraseMt));
        deflexical("*UIMMA-DEFAULT-DOMAIN-MT*", SubLTrampolineFile.maybeDefault($uimma_default_domain_mt$, $uimma_default_domain_mt$, $$EverythingPSC));
        defparameter("*UIA-FRAMELESS-ENVIRONMENT?*", NIL);
        deflexical("*INVALID-UI-SIGNATURE*", $list229);
        deflexical("*INVALID-UI-REQUEST*", list($UNKNOWN_INTERACTION, $UNKNOWN_ACTION, invalid_ui_signature()));
        return NIL;
    }

    public static SubLObject setup_user_interaction_agenda_file() {
        declare_defglobal($uia_lock$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(USER_INTERACTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list14);
        def_csetf(UI_ID, _CSETF_UI_ID);
        def_csetf(UI_AGENDA, _CSETF_UI_AGENDA);
        def_csetf(UI_MODE, _CSETF_UI_MODE);
        def_csetf(UI_STATUS, _CSETF_UI_STATUS);
        def_csetf(UI_START_TIME, _CSETF_UI_START_TIME);
        def_csetf(UI_FINISH_TIME, _CSETF_UI_FINISH_TIME);
        def_csetf(UI_PARENT_INTERACTION, _CSETF_UI_PARENT_INTERACTION);
        def_csetf(UI_CHILD_INTERACTIONS, _CSETF_UI_CHILD_INTERACTIONS);
        def_csetf(UI_OPERATOR, _CSETF_UI_OPERATOR);
        def_csetf(UI_ARGS, _CSETF_UI_ARGS);
        def_csetf(UI_RESULT, _CSETF_UI_RESULT);
        def_csetf(UI_STATE, _CSETF_UI_STATE);
        identity(USER_INTERACTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(SXHASH_USER_INTERACTION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(USER_INTERACTION_AGENDA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list72);
        def_csetf(UIA_ID, _CSETF_UIA_ID);
        def_csetf(UIA_META_AGENDA, _CSETF_UIA_META_AGENDA);
        def_csetf(UIA_ISG, _CSETF_UIA_ISG);
        def_csetf(UIA_INDEX, _CSETF_UIA_INDEX);
        def_csetf(UIA_HISTORY, _CSETF_UIA_HISTORY);
        def_csetf(UIA_UNDOS, _CSETF_UIA_UNDOS);
        def_csetf(UIA_MESSAGES, _CSETF_UIA_MESSAGES);
        def_csetf(UIA_REQUIREMENTS, _CSETF_UIA_REQUIREMENTS);
        def_csetf(UIA_RELEVANT_SUGGESTIONS, _CSETF_UIA_RELEVANT_SUGGESTIONS);
        def_csetf(UIA_POSSIBLE_SUGGESTIONS, _CSETF_UIA_POSSIBLE_SUGGESTIONS);
        def_csetf(UIA_COMMENTS, _CSETF_UIA_COMMENTS);
        def_csetf(UIA_STATE, _CSETF_UIA_STATE);
        identity(USER_INTERACTION_AGENDA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_AGENDA_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(SXHASH_USER_INTERACTION_AGENDA_METHOD));
        register_html_state_variable($sym118$_UIA_CAN_TREAT_COMMENTS_AS_MUMBLING__);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction_meta_agenda$.getGlobalValue(), symbol_function(USER_INTERACTION_META_AGENDA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list158);
        def_csetf(UIMA_ID, _CSETF_UIMA_ID);
        def_csetf(UIMA_ISG, _CSETF_UIMA_ISG);
        def_csetf(UIMA_INDEX, _CSETF_UIMA_INDEX);
        def_csetf(UIMA_OPEN_AGENDAS, _CSETF_UIMA_OPEN_AGENDAS);
        def_csetf(UIMA_CURRENT_AGENDA, _CSETF_UIMA_CURRENT_AGENDA);
        def_csetf(UIMA_STATE, _CSETF_UIMA_STATE);
        identity(USER_INTERACTION_META_AGENDA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_interaction_meta_agenda$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_META_AGENDA_METHOD));
        register_macro_helper(SYSTEM_UIMMA, DO_UIMAS);
        declare_defglobal($uimma$);
        if (NIL == $uimma$.getGlobalValue()) {
            uimma_reset();
        }
        declare_defglobal($uimma_default_locale$);
        declare_defglobal($uimma_default_generation_mt$);
        declare_defglobal($uimma_default_domain_mt$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_user_interaction_agenda_file();
    }

    @Override
    public void initializeVariables() {
        init_user_interaction_agenda_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_user_interaction_agenda_file();
    }

    static {





























































































































































































































































    }

    public static final class $user_interaction_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $agenda;

        public SubLObject $mode;

        public SubLObject $status;

        public SubLObject $start_time;

        public SubLObject $finish_time;

        public SubLObject $parent_interaction;

        public SubLObject $child_interactions;

        public SubLObject $operator;

        public SubLObject $args;

        public SubLObject $result;

        public SubLObject $state;

        private static final SubLStructDeclNative structDecl;

        public $user_interaction_native() {
            this.$id = Lisp.NIL;
            this.$agenda = Lisp.NIL;
            this.$mode = Lisp.NIL;
            this.$status = Lisp.NIL;
            this.$start_time = Lisp.NIL;
            this.$finish_time = Lisp.NIL;
            this.$parent_interaction = Lisp.NIL;
            this.$child_interactions = Lisp.NIL;
            this.$operator = Lisp.NIL;
            this.$args = Lisp.NIL;
            this.$result = Lisp.NIL;
            this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$agenda;
        }

        @Override
        public SubLObject getField4() {
            return this.$mode;
        }

        @Override
        public SubLObject getField5() {
            return this.$status;
        }

        @Override
        public SubLObject getField6() {
            return this.$start_time;
        }

        @Override
        public SubLObject getField7() {
            return this.$finish_time;
        }

        @Override
        public SubLObject getField8() {
            return this.$parent_interaction;
        }

        @Override
        public SubLObject getField9() {
            return this.$child_interactions;
        }

        @Override
        public SubLObject getField10() {
            return this.$operator;
        }

        @Override
        public SubLObject getField11() {
            return this.$args;
        }

        @Override
        public SubLObject getField12() {
            return this.$result;
        }

        @Override
        public SubLObject getField13() {
            return this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$agenda = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$mode = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$status = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$start_time = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$finish_time = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$parent_interaction = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$child_interactions = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$operator = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$args = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$result = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative(user_interaction_agenda.$user_interaction_native.class, USER_INTERACTION, USER_INTERACTION_P, $list8, $list9, new String[]{ "$id", "$agenda", "$mode", "$status", "$start_time", "$finish_time", "$parent_interaction", "$child_interactions", "$operator", "$args", "$result", "$state" }, $list10, $list11, PRINT_USER_INTERACTION);
        }
    }

    public static final class $user_interaction_p$UnaryFunction extends UnaryFunction {
        public $user_interaction_p$UnaryFunction() {
            super(extractFunctionNamed("USER-INTERACTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return user_interaction_p(arg1);
        }
    }

    public static final class $user_interaction_agenda_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $meta_agenda;

        public SubLObject $isg;

        public SubLObject $index;

        public SubLObject $history;

        public SubLObject $undos;

        public SubLObject $messages;

        public SubLObject $requirements;

        public SubLObject $relevant_suggestions;

        public SubLObject $possible_suggestions;

        public SubLObject $comments;

        public SubLObject $state;

        private static final SubLStructDeclNative structDecl;

        public $user_interaction_agenda_native() {
            this.$id = Lisp.NIL;
            this.$meta_agenda = Lisp.NIL;
            this.$isg = Lisp.NIL;
            this.$index = Lisp.NIL;
            this.$history = Lisp.NIL;
            this.$undos = Lisp.NIL;
            this.$messages = Lisp.NIL;
            this.$requirements = Lisp.NIL;
            this.$relevant_suggestions = Lisp.NIL;
            this.$possible_suggestions = Lisp.NIL;
            this.$comments = Lisp.NIL;
            this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$meta_agenda;
        }

        @Override
        public SubLObject getField4() {
            return this.$isg;
        }

        @Override
        public SubLObject getField5() {
            return this.$index;
        }

        @Override
        public SubLObject getField6() {
            return this.$history;
        }

        @Override
        public SubLObject getField7() {
            return this.$undos;
        }

        @Override
        public SubLObject getField8() {
            return this.$messages;
        }

        @Override
        public SubLObject getField9() {
            return this.$requirements;
        }

        @Override
        public SubLObject getField10() {
            return this.$relevant_suggestions;
        }

        @Override
        public SubLObject getField11() {
            return this.$possible_suggestions;
        }

        @Override
        public SubLObject getField12() {
            return this.$comments;
        }

        @Override
        public SubLObject getField13() {
            return this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$meta_agenda = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$isg = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$index = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$history = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$undos = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$messages = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$requirements = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$relevant_suggestions = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$possible_suggestions = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$comments = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative(user_interaction_agenda.$user_interaction_agenda_native.class, USER_INTERACTION_AGENDA, USER_INTERACTION_AGENDA_P, $list66, $list67, new String[]{ "$id", "$meta_agenda", "$isg", "$index", "$history", "$undos", "$messages", "$requirements", "$relevant_suggestions", "$possible_suggestions", "$comments", "$state" }, $list68, $list69, PRINT_USER_INTERACTION_AGENDA);
        }
    }

    public static final class $user_interaction_agenda_p$UnaryFunction extends UnaryFunction {
        public $user_interaction_agenda_p$UnaryFunction() {
            super(extractFunctionNamed("USER-INTERACTION-AGENDA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return user_interaction_agenda_p(arg1);
        }
    }

    public static final class $user_interaction_meta_agenda_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $isg;

        public SubLObject $index;

        public SubLObject $open_agendas;

        public SubLObject $current_agenda;

        public SubLObject $state;

        private static final SubLStructDeclNative structDecl;

        public $user_interaction_meta_agenda_native() {
            this.$id = Lisp.NIL;
            this.$isg = Lisp.NIL;
            this.$index = Lisp.NIL;
            this.$open_agendas = Lisp.NIL;
            this.$current_agenda = Lisp.NIL;
            this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$isg;
        }

        @Override
        public SubLObject getField4() {
            return this.$index;
        }

        @Override
        public SubLObject getField5() {
            return this.$open_agendas;
        }

        @Override
        public SubLObject getField6() {
            return this.$current_agenda;
        }

        @Override
        public SubLObject getField7() {
            return this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$isg = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$index = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$open_agendas = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$current_agenda = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative(user_interaction_agenda.$user_interaction_meta_agenda_native.class, USER_INTERACTION_META_AGENDA, USER_INTERACTION_META_AGENDA_P, $list152, $list153, new String[]{ "$id", "$isg", "$index", "$open_agendas", "$current_agenda", "$state" }, $list154, $list155, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $user_interaction_meta_agenda_p$UnaryFunction extends UnaryFunction {
        public $user_interaction_meta_agenda_p$UnaryFunction() {
            super(extractFunctionNamed("USER-INTERACTION-META-AGENDA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return user_interaction_meta_agenda_p(arg1);
        }
    }
}

/**
 * Total time: 909 ms
 */
