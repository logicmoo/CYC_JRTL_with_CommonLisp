package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.rtp.rtp_datastructures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class user_interaction_agenda extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.user_interaction_agenda";
    public static final String myFingerPrint = "503867d3bb94238bacd2f94049253363ff7cce866a8685e151bdbd8827acee7b";
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 1024L)
    private static SubLSymbol $uia_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 1417L)
    private static SubLSymbol $user_interaction_modes$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 1794L)
    private static SubLSymbol $user_interaction_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLSymbol $dtp_user_interaction$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLSymbol $dtp_user_interaction_agenda$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 16585L)
    public static SubLSymbol $uia_can_treat_comments_as_mumblingP$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLSymbol $dtp_user_interaction_meta_agenda$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 34417L)
    private static SubLSymbol $uimma$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 36433L)
    private static SubLSymbol $uimma_default_locale$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 37107L)
    private static SubLSymbol $uimma_default_generation_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 37675L)
    private static SubLSymbol $uimma_default_domain_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 52423L)
    public static SubLSymbol $uia_frameless_environmentP$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 71282L)
    private static SubLSymbol $invalid_ui_signature$;
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 71412L)
    private static SubLSymbol $invalid_ui_request$;
    private static final SubLSymbol $sym0$_UIA_LOCK_;
    private static final SubLString $str1$User_Interaction_Agenda_lock;
    private static final SubLSymbol $sym2$WITH_LOCK_HELD;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$USER_INTERACTION;
    private static final SubLSymbol $sym7$USER_INTERACTION_P;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$PRINT_USER_INTERACTION;
    private static final SubLSymbol $sym13$USER_INTERACTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$UI_ID;
    private static final SubLSymbol $sym16$_CSETF_UI_ID;
    private static final SubLSymbol $sym17$UI_AGENDA;
    private static final SubLSymbol $sym18$_CSETF_UI_AGENDA;
    private static final SubLSymbol $sym19$UI_MODE;
    private static final SubLSymbol $sym20$_CSETF_UI_MODE;
    private static final SubLSymbol $sym21$UI_STATUS;
    private static final SubLSymbol $sym22$_CSETF_UI_STATUS;
    private static final SubLSymbol $sym23$UI_START_TIME;
    private static final SubLSymbol $sym24$_CSETF_UI_START_TIME;
    private static final SubLSymbol $sym25$UI_FINISH_TIME;
    private static final SubLSymbol $sym26$_CSETF_UI_FINISH_TIME;
    private static final SubLSymbol $sym27$UI_PARENT_INTERACTION;
    private static final SubLSymbol $sym28$_CSETF_UI_PARENT_INTERACTION;
    private static final SubLSymbol $sym29$UI_CHILD_INTERACTIONS;
    private static final SubLSymbol $sym30$_CSETF_UI_CHILD_INTERACTIONS;
    private static final SubLSymbol $sym31$UI_OPERATOR;
    private static final SubLSymbol $sym32$_CSETF_UI_OPERATOR;
    private static final SubLSymbol $sym33$UI_ARGS;
    private static final SubLSymbol $sym34$_CSETF_UI_ARGS;
    private static final SubLSymbol $sym35$UI_RESULT;
    private static final SubLSymbol $sym36$_CSETF_UI_RESULT;
    private static final SubLSymbol $sym37$UI_STATE;
    private static final SubLSymbol $sym38$_CSETF_UI_STATE;
    private static final SubLSymbol $kw39$ID;
    private static final SubLSymbol $kw40$AGENDA;
    private static final SubLSymbol $kw41$MODE;
    private static final SubLSymbol $kw42$STATUS;
    private static final SubLSymbol $kw43$START_TIME;
    private static final SubLSymbol $kw44$FINISH_TIME;
    private static final SubLSymbol $kw45$PARENT_INTERACTION;
    private static final SubLSymbol $kw46$CHILD_INTERACTIONS;
    private static final SubLSymbol $kw47$OPERATOR;
    private static final SubLSymbol $kw48$ARGS;
    private static final SubLSymbol $kw49$RESULT;
    private static final SubLSymbol $kw50$STATE;
    private static final SubLString $str51$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw52$BEGIN;
    private static final SubLSymbol $sym53$MAKE_USER_INTERACTION;
    private static final SubLSymbol $kw54$SLOT;
    private static final SubLSymbol $kw55$END;
    private static final SubLSymbol $sym56$VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_METHOD;
    private static final SubLSymbol $sym57$SXHASH_USER_INTERACTION_METHOD;
    private static final SubLString $str58$__UI__A__A__S_;
    private static final SubLSymbol $sym59$USER_INTERACTION_AGENDA_P;
    private static final SubLSymbol $sym60$USER_INTERACTION_MODE_P;
    private static final SubLSymbol $sym61$UI_OPERATOR_P;
    private static final SubLSymbol $sym62$LISTP;
    private static final SubLSymbol $sym63$USER_INTERACTION_STATUS_P;
    private static final SubLSymbol $sym64$INTEGERP;
    private static final SubLSymbol $sym65$USER_INTERACTION_AGENDA;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$PRINT_USER_INTERACTION_AGENDA;
    private static final SubLSymbol $sym71$USER_INTERACTION_AGENDA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$UIA_ID;
    private static final SubLSymbol $sym74$_CSETF_UIA_ID;
    private static final SubLSymbol $sym75$UIA_META_AGENDA;
    private static final SubLSymbol $sym76$_CSETF_UIA_META_AGENDA;
    private static final SubLSymbol $sym77$UIA_ISG;
    private static final SubLSymbol $sym78$_CSETF_UIA_ISG;
    private static final SubLSymbol $sym79$UIA_INDEX;
    private static final SubLSymbol $sym80$_CSETF_UIA_INDEX;
    private static final SubLSymbol $sym81$UIA_HISTORY;
    private static final SubLSymbol $sym82$_CSETF_UIA_HISTORY;
    private static final SubLSymbol $sym83$UIA_UNDOS;
    private static final SubLSymbol $sym84$_CSETF_UIA_UNDOS;
    private static final SubLSymbol $sym85$UIA_MESSAGES;
    private static final SubLSymbol $sym86$_CSETF_UIA_MESSAGES;
    private static final SubLSymbol $sym87$UIA_REQUIREMENTS;
    private static final SubLSymbol $sym88$_CSETF_UIA_REQUIREMENTS;
    private static final SubLSymbol $sym89$UIA_RELEVANT_SUGGESTIONS;
    private static final SubLSymbol $sym90$_CSETF_UIA_RELEVANT_SUGGESTIONS;
    private static final SubLSymbol $sym91$UIA_POSSIBLE_SUGGESTIONS;
    private static final SubLSymbol $sym92$_CSETF_UIA_POSSIBLE_SUGGESTIONS;
    private static final SubLSymbol $sym93$UIA_COMMENTS;
    private static final SubLSymbol $sym94$_CSETF_UIA_COMMENTS;
    private static final SubLSymbol $sym95$UIA_STATE;
    private static final SubLSymbol $sym96$_CSETF_UIA_STATE;
    private static final SubLSymbol $kw97$META_AGENDA;
    private static final SubLSymbol $kw98$ISG;
    private static final SubLSymbol $kw99$INDEX;
    private static final SubLSymbol $kw100$HISTORY;
    private static final SubLSymbol $kw101$UNDOS;
    private static final SubLSymbol $kw102$MESSAGES;
    private static final SubLSymbol $kw103$REQUIREMENTS;
    private static final SubLSymbol $kw104$RELEVANT_SUGGESTIONS;
    private static final SubLSymbol $kw105$POSSIBLE_SUGGESTIONS;
    private static final SubLSymbol $kw106$COMMENTS;
    private static final SubLSymbol $sym107$MAKE_USER_INTERACTION_AGENDA;
    private static final SubLSymbol $sym108$VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_AGENDA_METHOD;
    private static final SubLSymbol $sym109$SXHASH_USER_INTERACTION_AGENDA_METHOD;
    private static final SubLString $str110$__UIA__A_;
    private static final SubLSymbol $sym111$USER_INTERACTION_META_AGENDA_P;
    private static final SubLSymbol $sym112$STRINGP;
    private static final SubLSymbol $sym113$_;
    private static final SubLSymbol $kw114$EMPTY_AGENDA;
    private static final SubLSymbol $kw115$TRUE;
    private static final SubLSymbol $kw116$SETUP_COMPLETE;
    private static final SubLSymbol $kw117$THINKING;
    private static final SubLSymbol $sym118$_UIA_CAN_TREAT_COMMENTS_AS_MUMBLING__;
    private static final SubLSymbol $kw119$UNDO;
    private static final SubLSymbol $kw120$MESSAGE;
    private static final SubLSymbol $kw121$REQUIRED;
    private static final SubLSymbol $kw122$RELEVANT;
    private static final SubLSymbol $kw123$POSSIBLE;
    private static final SubLSymbol $kw124$COMMENT;
    private static final SubLString $str125$_S__S;
    private static final SubLSymbol $kw126$SUPERIOR_TOPIC;
    private static final SubLObject $const127$mainFocusOfUIASession;
    private static final SubLList $list128;
    private static final SubLSymbol $kw129$TOPIC;
    private static final SubLList $list130;
    private static final SubLSymbol $sym131$CDOLIST;
    private static final SubLSymbol $sym132$UIMA_OPEN_AGENDAS_SEQUENCE;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$UIA_INTERACTION_SEQUENCE;
    private static final SubLSymbol $kw135$LANGUAGE_PARSING_MT;
    private static final SubLSymbol $kw136$UNDETERMINED;
    private static final SubLSymbol $kw137$LANGUAGE_GENERATION_MT;
    private static final SubLSymbol $kw138$LANGUAGE_LEXICAL_MT;
    private static final SubLSymbol $kw139$DOMAIN_MT;
    private static final SubLSymbol $kw140$PARSING_MT;
    private static final SubLSymbol $kw141$GENERATION_MT;
    private static final SubLSymbol $kw142$ALL_INTERACTION_MTS;
    private static final SubLSymbol $kw143$DOMAIN_INTERACTION_MT;
    private static final SubLSymbol $kw144$PARSING_INTERACTION_MT;
    private static final SubLSymbol $kw145$GENERATION_INTERACTION_MT;
    private static final SubLSymbol $kw146$LEXICAL_INTERACTION_MT;
    private static final SubLObject $const147$EnglishTemplateMt;
    private static final SubLObject $const148$EnglishParaphraseMt;
    private static final SubLObject $const149$EnglishMt;
    private static final SubLSymbol $kw150$SCENARIO_INTERACTION_CONTEXT;
    private static final SubLSymbol $sym151$USER_INTERACTION_META_AGENDA;
    private static final SubLList $list152;
    private static final SubLList $list153;
    private static final SubLList $list154;
    private static final SubLList $list155;
    private static final SubLSymbol $sym156$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym157$USER_INTERACTION_META_AGENDA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list158;
    private static final SubLSymbol $sym159$UIMA_ID;
    private static final SubLSymbol $sym160$_CSETF_UIMA_ID;
    private static final SubLSymbol $sym161$UIMA_ISG;
    private static final SubLSymbol $sym162$_CSETF_UIMA_ISG;
    private static final SubLSymbol $sym163$UIMA_INDEX;
    private static final SubLSymbol $sym164$_CSETF_UIMA_INDEX;
    private static final SubLSymbol $sym165$UIMA_OPEN_AGENDAS;
    private static final SubLSymbol $sym166$_CSETF_UIMA_OPEN_AGENDAS;
    private static final SubLSymbol $sym167$UIMA_CURRENT_AGENDA;
    private static final SubLSymbol $sym168$_CSETF_UIMA_CURRENT_AGENDA;
    private static final SubLSymbol $sym169$UIMA_STATE;
    private static final SubLSymbol $sym170$_CSETF_UIMA_STATE;
    private static final SubLSymbol $kw171$OPEN_AGENDAS;
    private static final SubLSymbol $kw172$CURRENT_AGENDA;
    private static final SubLSymbol $sym173$MAKE_USER_INTERACTION_META_AGENDA;
    private static final SubLSymbol $sym174$VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_META_AGENDA_METHOD;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLSymbol $kw177$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw178$DONE;
    private static final SubLSymbol $sym179$ID;
    private static final SubLSymbol $sym180$DO_ID_INDEX;
    private static final SubLList $list181;
    private static final SubLSymbol $sym182$IGNORE;
    private static final SubLSymbol $sym183$SYSTEM_UIMMA;
    private static final SubLSymbol $sym184$DO_UIMAS;
    private static final SubLSymbol $sym185$_UIMMA_;
    private static final SubLSymbol $sym186$_UIMMA_DEFAULT_LOCALE_;
    private static final SubLObject $const187$EnglishLanguage;
    private static final SubLSymbol $sym188$_UIMMA_DEFAULT_GENERATION_MT_;
    private static final SubLSymbol $sym189$_UIMMA_DEFAULT_DOMAIN_MT_;
    private static final SubLObject $const190$EverythingPSC;
    private static final SubLSymbol $sym191$PROPERTY_LIST_P;
    private static final SubLList $list192;
    private static final SubLSymbol $sym193$STATE;
    private static final SubLSymbol $sym194$CLET;
    private static final SubLSymbol $sym195$UIA_MEMOIZATION_STATE;
    private static final SubLSymbol $sym196$WITH_MEMOIZATION_STATE;
    private static final SubLSymbol $kw197$MEMOIZATION_STATE;
    private static final SubLList $list198;
    private static final SubLSymbol $sym199$STATE;
    private static final SubLSymbol $sym200$UIMA_MEMOIZATION_STATE;
    private static final SubLSymbol $kw201$PENDING;
    private static final SubLSymbol $kw202$SUB_INTERACTIONS;
    private static final SubLSymbol $kw203$SUPER_INTERACTION;
    private static final SubLSymbol $kw204$BLOCKED;
    private static final SubLSymbol $sym205$UIA_PENDING_ACTION_P;
    private static final SubLSymbol $sym206$UIA_SIGNATURE_P;
    private static final SubLList $list207;
    private static final SubLSymbol $sym208$UI_SIGNATURE_P;
    private static final SubLList $list209;
    private static final SubLSymbol $kw210$UIMA;
    private static final SubLSymbol $kw211$UIA;
    private static final SubLSymbol $kw212$UI;
    private static final SubLList $list213;
    private static final SubLSymbol $kw214$FRAMES_FOR_REFRESH;
    private static final SubLSymbol $kw215$CRUMB_TRAIL;
    private static final SubLSymbol $kw216$UNDEFINED;
    private static final SubLSymbol $kw217$TERMS;
    private static final SubLSymbol $kw218$FACTS;
    private static final SubLSymbol $kw219$QUESTIONS;
    private static final SubLSymbol $kw220$ASSERTION;
    private static final SubLSymbol $kw221$MT;
    private static final SubLSymbol $kw222$SENTENCE;
    private static final SubLSymbol $kw223$INITIALIZER;
    private static final SubLList $list224;
    private static final SubLSymbol $sym225$PROGN;
    private static final SubLSymbol $sym226$UIA_SCHEDULE_FRAME_FOR_REFRESH;
    private static final SubLSymbol $kw227$ACKNOWLEDGE_MESSAGE;
    private static final SubLList $list228;
    private static final SubLList $list229;
    private static final SubLSymbol $kw230$UNKNOWN_INTERACTION;
    private static final SubLSymbol $kw231$UNKNOWN_ACTION;
    private static final SubLSymbol $sym232$UI_ACTION_TYPE_P;
    private static final SubLSymbol $kw233$SHOW;
    private static final SubLSymbol $kw234$SIGNATURE;
    private static final SubLSymbol $kw235$AGENDA_SIGNATURE;
    private static final SubLSymbol $kw236$GLOB;
    private static final SubLSymbol $kw237$UNINITIALIZED_GLOB;
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 1321L)
    public static SubLObject with_uia_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)user_interaction_agenda.$sym2$WITH_LOCK_HELD, (SubLObject)user_interaction_agenda.$list3, ConsesLow.append(body, (SubLObject)user_interaction_agenda.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 1684L)
    public static SubLObject user_interaction_mode_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(Sequences.find(v_object, user_interaction_agenda.$user_interaction_modes$.getGlobalValue(), (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 1908L)
    public static SubLObject user_interaction_status_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(Sequences.find(v_object, user_interaction_agenda.$user_interaction_statuses$.getGlobalValue(), (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2023L)
    public static SubLObject ui_operator_p(final SubLObject v_object) {
        return Types.keywordp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject user_interaction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_user_interaction(v_object, stream, (SubLObject)user_interaction_agenda.ZERO_INTEGER);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject user_interaction_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $user_interaction_native.class) ? user_interaction_agenda.T : user_interaction_agenda.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_id(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_agenda(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_mode(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_status(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_start_time(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_finish_time(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_parent_interaction(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_child_interactions(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_operator(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_args(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_result(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject ui_state(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_id(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_agenda(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_mode(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_status(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_start_time(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_finish_time(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_parent_interaction(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_child_interactions(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_operator(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_args(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_result(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject _csetf_ui_state(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject make_user_interaction(SubLObject arglist) {
        if (arglist == user_interaction_agenda.UNPROVIDED) {
            arglist = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject v_new = (SubLObject)new $user_interaction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)user_interaction_agenda.NIL, next = arglist; user_interaction_agenda.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw39$ID)) {
                _csetf_ui_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw40$AGENDA)) {
                _csetf_ui_agenda(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw41$MODE)) {
                _csetf_ui_mode(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw42$STATUS)) {
                _csetf_ui_status(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw43$START_TIME)) {
                _csetf_ui_start_time(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw44$FINISH_TIME)) {
                _csetf_ui_finish_time(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw45$PARENT_INTERACTION)) {
                _csetf_ui_parent_interaction(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw46$CHILD_INTERACTIONS)) {
                _csetf_ui_child_interactions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw47$OPERATOR)) {
                _csetf_ui_operator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw48$ARGS)) {
                _csetf_ui_args(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw49$RESULT)) {
                _csetf_ui_result(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw50$STATE)) {
                _csetf_ui_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)user_interaction_agenda.$str51$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject visit_defstruct_user_interaction(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw52$BEGIN, (SubLObject)user_interaction_agenda.$sym53$MAKE_USER_INTERACTION, (SubLObject)user_interaction_agenda.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw39$ID, ui_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw40$AGENDA, ui_agenda(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw41$MODE, ui_mode(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw42$STATUS, ui_status(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw43$START_TIME, ui_start_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw44$FINISH_TIME, ui_finish_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw45$PARENT_INTERACTION, ui_parent_interaction(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw46$CHILD_INTERACTIONS, ui_child_interactions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw47$OPERATOR, ui_operator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw48$ARGS, ui_args(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw49$RESULT, ui_result(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw50$STATE, ui_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw55$END, (SubLObject)user_interaction_agenda.$sym53$MAKE_USER_INTERACTION, (SubLObject)user_interaction_agenda.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 2089L)
    public static SubLObject visit_defstruct_object_user_interaction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_user_interaction(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 3523L)
    public static SubLObject sxhash_user_interaction_method(final SubLObject v_object) {
        return Sxhash.sxhash(ui_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 3610L)
    public static SubLObject print_user_interaction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)user_interaction_agenda.$str58$__UI__A__A__S_, new SubLObject[] { ui_id(v_object), ui_operator(v_object), ui_args(v_object) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 3793L)
    public static SubLObject new_ui(final SubLObject v_agenda, final SubLObject mode, final SubLObject operator, SubLObject args) {
        if (args == user_interaction_agenda.UNPROVIDED) {
            args = (SubLObject)user_interaction_agenda.NIL;
        }
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_mode_p(mode) : mode;
        assert user_interaction_agenda.NIL != ui_operator_p(operator) : operator;
        assert user_interaction_agenda.NIL != Types.listp(args) : args;
        final SubLObject interaction = make_user_interaction((SubLObject)user_interaction_agenda.UNPROVIDED);
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(uia_isg(v_agenda));
        _csetf_ui_id(interaction, id);
        _csetf_ui_agenda(interaction, v_agenda);
        _csetf_ui_operator(interaction, operator);
        _csetf_ui_args(interaction, args);
        ui_note_mode(interaction, mode);
        uia_add_to_index(v_agenda, id, interaction);
        ui_note_start_time(interaction, Time.get_universal_time());
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 4505L)
    public static SubLObject ui_note_mode(final SubLObject interaction, final SubLObject mode) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        assert user_interaction_agenda.NIL != user_interaction_mode_p(mode) : mode;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_ui_mode(interaction, mode);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 4792L)
    public static SubLObject ui_note_status(final SubLObject interaction, final SubLObject status) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        assert user_interaction_agenda.NIL != user_interaction_status_p(status) : status;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_ui_status(interaction, status);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 5021L)
    public static SubLObject ui_note_start_time(final SubLObject interaction, final SubLObject start_time) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        assert user_interaction_agenda.NIL != Types.integerp(start_time) : start_time;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_ui_start_time(interaction, start_time);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 5253L)
    public static SubLObject ui_note_finish_time(final SubLObject interaction, final SubLObject finish_time) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        assert user_interaction_agenda.NIL != Types.integerp(finish_time) : finish_time;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_ui_finish_time(interaction, finish_time);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 5490L)
    public static SubLObject ui_note_parent(final SubLObject interaction, final SubLObject parent) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        assert user_interaction_agenda.NIL != user_interaction_p(parent) : parent;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_ui_parent_interaction(interaction, parent);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 5725L)
    public static SubLObject ui_add_child(final SubLObject interaction, final SubLObject child) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        assert user_interaction_agenda.NIL != user_interaction_p(child) : child;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            if (user_interaction_agenda.NIL == conses_high.member(child, ui_child_interactions(interaction), Symbols.symbol_function((SubLObject)user_interaction_agenda.EQL), Symbols.symbol_function((SubLObject)user_interaction_agenda.IDENTITY))) {
                _csetf_ui_child_interactions(interaction, (SubLObject)ConsesLow.cons(child, ui_child_interactions(interaction)));
            }
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 5957L)
    public static SubLObject ui_note_result(final SubLObject interaction, final SubLObject result) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_ui_result(interaction, result);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6139L)
    public static SubLObject ui_note_state(final SubLObject interaction, final SubLObject state) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_ui_state(interaction, state);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject user_interaction_agenda_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_user_interaction_agenda(v_object, stream, (SubLObject)user_interaction_agenda.ZERO_INTEGER);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject user_interaction_agenda_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $user_interaction_agenda_native.class) ? user_interaction_agenda.T : user_interaction_agenda.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_id(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_meta_agenda(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_isg(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_index(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_history(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_undos(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_messages(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_requirements(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_relevant_suggestions(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_possible_suggestions(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_comments(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject uia_state(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_id(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_meta_agenda(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_isg(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_index(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_history(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_undos(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_messages(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_requirements(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_relevant_suggestions(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_possible_suggestions(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_comments(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject _csetf_uia_state(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject make_user_interaction_agenda(SubLObject arglist) {
        if (arglist == user_interaction_agenda.UNPROVIDED) {
            arglist = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject v_new = (SubLObject)new $user_interaction_agenda_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)user_interaction_agenda.NIL, next = arglist; user_interaction_agenda.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw39$ID)) {
                _csetf_uia_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw97$META_AGENDA)) {
                _csetf_uia_meta_agenda(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw98$ISG)) {
                _csetf_uia_isg(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw99$INDEX)) {
                _csetf_uia_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw100$HISTORY)) {
                _csetf_uia_history(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw101$UNDOS)) {
                _csetf_uia_undos(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw102$MESSAGES)) {
                _csetf_uia_messages(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw103$REQUIREMENTS)) {
                _csetf_uia_requirements(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw104$RELEVANT_SUGGESTIONS)) {
                _csetf_uia_relevant_suggestions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw105$POSSIBLE_SUGGESTIONS)) {
                _csetf_uia_possible_suggestions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw106$COMMENTS)) {
                _csetf_uia_comments(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw50$STATE)) {
                _csetf_uia_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)user_interaction_agenda.$str51$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject visit_defstruct_user_interaction_agenda(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw52$BEGIN, (SubLObject)user_interaction_agenda.$sym107$MAKE_USER_INTERACTION_AGENDA, (SubLObject)user_interaction_agenda.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw39$ID, uia_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw97$META_AGENDA, uia_meta_agenda(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw98$ISG, uia_isg(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw99$INDEX, uia_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw100$HISTORY, uia_history(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw101$UNDOS, uia_undos(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw102$MESSAGES, uia_messages(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw103$REQUIREMENTS, uia_requirements(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw104$RELEVANT_SUGGESTIONS, uia_relevant_suggestions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw105$POSSIBLE_SUGGESTIONS, uia_possible_suggestions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw106$COMMENTS, uia_comments(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw50$STATE, uia_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw55$END, (SubLObject)user_interaction_agenda.$sym107$MAKE_USER_INTERACTION_AGENDA, (SubLObject)user_interaction_agenda.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 6317L)
    public static SubLObject visit_defstruct_object_user_interaction_agenda_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_user_interaction_agenda(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 7654L)
    public static SubLObject sxhash_user_interaction_agenda_method(final SubLObject v_object) {
        return Sxhash.sxhash(uia_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 7746L)
    public static SubLObject print_user_interaction_agenda(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)user_interaction_agenda.$str110$__UIA__A_, uia_id(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 7894L)
    public static SubLObject new_uia(final SubLObject meta_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        final SubLObject v_agenda = make_user_interaction_agenda((SubLObject)user_interaction_agenda.UNPROVIDED);
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(uima_isg(meta_agenda));
        _csetf_uia_id(v_agenda, id);
        _csetf_uia_meta_agenda(v_agenda, meta_agenda);
        _csetf_uia_isg(v_agenda, integer_sequence_generator.new_integer_sequence_generator((SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED));
        _csetf_uia_index(v_agenda, dictionary.new_dictionary((SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED));
        _csetf_uia_history(v_agenda, queues.create_queue((SubLObject)user_interaction_agenda.UNPROVIDED));
        _csetf_uia_undos(v_agenda, stacks.create_stack());
        _csetf_uia_messages(v_agenda, queues.create_queue((SubLObject)user_interaction_agenda.UNPROVIDED));
        _csetf_uia_requirements(v_agenda, stacks.create_stack());
        _csetf_uia_relevant_suggestions(v_agenda, stacks.create_stack());
        _csetf_uia_possible_suggestions(v_agenda, queues.create_queue((SubLObject)user_interaction_agenda.UNPROVIDED));
        _csetf_uia_comments(v_agenda, queues.create_queue((SubLObject)user_interaction_agenda.UNPROVIDED));
        uia_state_clear_all(v_agenda);
        uima_add_to_index(meta_agenda, id, v_agenda);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 8829L)
    public static SubLObject uia_reset(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
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
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 9390L)
    public static SubLObject uia_find_by_id(final SubLObject v_agenda, final SubLObject id) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return dictionary.dictionary_lookup(uia_index(v_agenda), id, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 9605L)
    public static SubLObject uia_find_by_id_string(final SubLObject v_agenda, final SubLObject id_string) {
        assert user_interaction_agenda.NIL != Types.stringp(id_string) : id_string;
        return uia_find_by_id(v_agenda, reader.parse_integer(id_string, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 9757L)
    public static SubLObject uia_some_interaction_p(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == dictionary.dictionary_empty_p(uia_index(v_agenda)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 9912L)
    public static SubLObject uia_interaction_sequence(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        SubLObject interactions = dictionary.dictionary_values(uia_index(v_agenda));
        interactions = Sort.sort(interactions, Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym113$_), Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym15$UI_ID));
        return interactions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 10159L)
    public static SubLObject uia_some_history_p(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == queues.queue_empty_p(uia_history(v_agenda)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 10308L)
    public static SubLObject uia_history_sequence(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return queues.queue_elements(uia_history(v_agenda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 10452L)
    public static SubLObject uia_some_undo_p(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == stacks.stack_empty_p(uia_undos(v_agenda)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 10596L)
    public static SubLObject uia_undo_sequence(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return stacks.stack_elements(uia_undos(v_agenda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 10735L)
    public static SubLObject uia_some_message_p(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == queues.queue_empty_p(uia_messages(v_agenda)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 10885L)
    public static SubLObject uia_message_sequence(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return queues.queue_elements(uia_messages(v_agenda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 11030L)
    public static SubLObject uia_some_requirement_p(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == stacks.stack_empty_p(uia_requirements(v_agenda)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 11188L)
    public static SubLObject uia_requirement_sequence(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return stacks.stack_elements(uia_requirements(v_agenda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 11341L)
    public static SubLObject uia_some_relevant_suggestion_p(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == stacks.stack_empty_p(uia_relevant_suggestions(v_agenda)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 11515L)
    public static SubLObject uia_relevant_suggestion_sequence(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return stacks.stack_elements(uia_relevant_suggestions(v_agenda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 11684L)
    public static SubLObject uia_some_possible_suggestion_p(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == queues.queue_empty_p(uia_possible_suggestions(v_agenda)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 11858L)
    public static SubLObject uia_possible_suggestion_sequence(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return queues.queue_elements(uia_possible_suggestions(v_agenda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 12027L)
    public static SubLObject uia_some_comment_p(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == queues.queue_empty_p(uia_comments(v_agenda)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 12177L)
    public static SubLObject uia_comment_sequence(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return queues.queue_elements(uia_comments(v_agenda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 12322L)
    public static SubLObject uia_default_operator(final SubLObject v_agenda) {
        return (SubLObject)user_interaction_agenda.$kw114$EMPTY_AGENDA;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 12426L)
    public static SubLObject uia_initialized_p(final SubLObject v_agenda) {
        return Equality.eq((SubLObject)user_interaction_agenda.$kw115$TRUE, uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw116$SETUP_COMPLETE, (SubLObject)user_interaction_agenda.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 12534L)
    public static SubLObject uia_add_to_index(final SubLObject v_agenda, final SubLObject id, final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            dictionary.dictionary_enter(uia_index(v_agenda), id, v_object);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 12801L)
    public static SubLObject uia_add_to_history(final SubLObject v_agenda, final SubLObject interaction) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            queues.enqueue(interaction, uia_history(v_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 13045L)
    public static SubLObject uia_clear_undos(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            stacks.clear_stack(uia_undos(v_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 13216L)
    public static SubLObject uia_add_undo(final SubLObject v_agenda, final SubLObject undo) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(undo) : undo;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            stacks.stack_push(undo, uia_undos(v_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 13422L)
    public static SubLObject uia_rem_undo(final SubLObject v_agenda, final SubLObject undo) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(undo) : undo;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            stacks.stack_delete(undo, uia_undos(v_agenda), (SubLObject)user_interaction_agenda.UNPROVIDED);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 13630L)
    public static SubLObject uia_add_message(final SubLObject v_agenda, final SubLObject message) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(message) : message;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            queues.enqueue(message, uia_messages(v_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 13861L)
    public static SubLObject uia_rem_message(final SubLObject v_agenda, final SubLObject message) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(message) : message;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            queues.remqueue(message, uia_messages(v_agenda), (SubLObject)user_interaction_agenda.UNPROVIDED);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 14080L)
    public static SubLObject uia_add_requirement(final SubLObject v_agenda, final SubLObject requirement) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(requirement) : requirement;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            stacks.stack_push(requirement, uia_requirements(v_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 14340L)
    public static SubLObject uia_rem_requirement(final SubLObject v_agenda, final SubLObject requirement) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(requirement) : requirement;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            stacks.stack_delete(requirement, uia_requirements(v_agenda), (SubLObject)user_interaction_agenda.UNPROVIDED);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 14583L)
    public static SubLObject uia_add_relevant_suggestion(final SubLObject v_agenda, final SubLObject relevant_suggestion) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(relevant_suggestion) : relevant_suggestion;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            stacks.stack_push(relevant_suggestion, uia_relevant_suggestions(v_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 14891L)
    public static SubLObject uia_rem_relevant_suggestion(final SubLObject v_agenda, final SubLObject relevant_suggestion) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(relevant_suggestion) : relevant_suggestion;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            stacks.stack_delete(relevant_suggestion, uia_relevant_suggestions(v_agenda), (SubLObject)user_interaction_agenda.UNPROVIDED);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 15174L)
    public static SubLObject uia_add_possible_suggestion(final SubLObject v_agenda, final SubLObject possible_suggestion) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(possible_suggestion) : possible_suggestion;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            queues.enqueue(possible_suggestion, uia_possible_suggestions(v_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 15477L)
    public static SubLObject uia_rem_possible_suggestion(final SubLObject v_agenda, final SubLObject possible_suggestion) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(possible_suggestion) : possible_suggestion;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            queues.remqueue(possible_suggestion, uia_possible_suggestions(v_agenda), (SubLObject)user_interaction_agenda.UNPROVIDED);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 15756L)
    public static SubLObject uia_add_comment(final SubLObject v_agenda, final SubLObject comment) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(comment) : comment;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            queues.enqueue(comment, uia_comments(v_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 15987L)
    public static SubLObject uia_rem_comment(final SubLObject v_agenda, final SubLObject comment) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(comment) : comment;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            queues.remqueue(comment, uia_comments(v_agenda), (SubLObject)user_interaction_agenda.UNPROVIDED);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 16206L)
    public static SubLObject uia_clear_comments(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            queues.clear_queue(uia_comments(v_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 16373L)
    public static SubLObject uia_background_task_p(final SubLObject interaction) {
        return Equality.eq((SubLObject)user_interaction_agenda.$kw117$THINKING, ui_operator(interaction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 16694L)
    public static SubLObject uia_can_treat_comments_as_mumblingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return user_interaction_agenda.$uia_can_treat_comments_as_mumblingP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 16799L)
    public static SubLObject uia_cannot_treat_comments_as_mumbling() {
        user_interaction_agenda.$uia_can_treat_comments_as_mumblingP$.setDynamicValue((SubLObject)user_interaction_agenda.NIL);
        return uia_can_treat_comments_as_mumblingP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 16958L)
    public static SubLObject uia_can_treat_comments_as_mumbling() {
        user_interaction_agenda.$uia_can_treat_comments_as_mumblingP$.setDynamicValue((SubLObject)user_interaction_agenda.T);
        return uia_can_treat_comments_as_mumblingP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 17112L)
    public static SubLObject uia_process_new_comment(final SubLObject v_agenda, final SubLObject comment) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != user_interaction_p(comment) : comment;
        uia_add_comment(v_agenda, comment);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 17985L)
    public static SubLObject uia_classify(final SubLObject v_agenda, final SubLObject interaction) {
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = ui_mode(interaction);
        if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw119$UNDO)) {
            uia_add_undo(v_agenda, interaction);
        }
        else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw120$MESSAGE)) {
            uia_add_message(v_agenda, interaction);
        }
        else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw121$REQUIRED)) {
            uia_add_requirement(v_agenda, interaction);
        }
        else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw122$RELEVANT)) {
            uia_add_relevant_suggestion(v_agenda, interaction);
        }
        else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw123$POSSIBLE)) {
            uia_add_possible_suggestion(v_agenda, interaction);
        }
        else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw124$COMMENT)) {
            uia_process_new_comment(v_agenda, interaction);
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 18600L)
    public static SubLObject uia_declassify(final SubLObject v_agenda, final SubLObject interaction) {
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = ui_mode(interaction);
        if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw119$UNDO)) {
            uia_rem_undo(v_agenda, interaction);
        }
        else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw120$MESSAGE)) {
            uia_rem_message(v_agenda, interaction);
        }
        else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw121$REQUIRED)) {
            uia_rem_requirement(v_agenda, interaction);
        }
        else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw122$RELEVANT)) {
            uia_rem_relevant_suggestion(v_agenda, interaction);
        }
        else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw123$POSSIBLE)) {
            uia_rem_possible_suggestion(v_agenda, interaction);
        }
        else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw124$COMMENT)) {
            uia_rem_comment(v_agenda, interaction);
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 19192L)
    public static SubLObject uia_note_state(final SubLObject v_agenda, final SubLObject state) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_uia_state(v_agenda, state);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 19368L)
    public static SubLObject uia_global_id_string(final SubLObject v_agenda) {
        final SubLObject uima = uia_meta_agenda(v_agenda);
        final SubLObject uima_id = uima_id(uima);
        final SubLObject uia_id = uia_id(v_agenda);
        return PrintLow.format((SubLObject)user_interaction_agenda.NIL, (SubLObject)user_interaction_agenda.$str125$_S__S, uima_id, uia_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 19562L)
    public static SubLObject uia_from_ids(final SubLObject meta_agenda, final SubLObject v_agenda) {
        final SubLObject uima = uimma_find_by_id(meta_agenda);
        final SubLObject uia = uima_find_by_id(uima, v_agenda);
        return Values.values(uia, uima);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 20405L)
    public static SubLObject uia_determine_superior_topic_identification(final SubLObject v_agenda) {
        final SubLObject better_topic = uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw126$SUPERIOR_TOPIC, (SubLObject)user_interaction_agenda.NIL);
        if (user_interaction_agenda.NIL != better_topic) {
            return better_topic;
        }
        final SubLObject formula = (SubLObject)ConsesLow.listS(user_interaction_agenda.$const127$mainFocusOfUIASession, uia_domain_interaction_mt(v_agenda), (SubLObject)user_interaction_agenda.$list128);
        final SubLObject better_topics = ask_utilities.ask_variable((SubLObject)user_interaction_agenda.$kw129$TOPIC, formula, uia_domain_interaction_mt(v_agenda), (SubLObject)user_interaction_agenda.ZERO_INTEGER, (SubLObject)user_interaction_agenda.ONE_INTEGER, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
        final SubLObject better_topic2 = better_topics.first();
        if (user_interaction_agenda.NIL != forts.fort_p(better_topic2)) {
            uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw126$SUPERIOR_TOPIC, better_topic2);
        }
        return better_topic2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 21137L)
    public static SubLObject do_uias(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list130);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject uia = (SubLObject)user_interaction_agenda.NIL;
        SubLObject uima = (SubLObject)user_interaction_agenda.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list130);
        uia = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list130);
        uima = current.first();
        current = current.rest();
        if (user_interaction_agenda.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)user_interaction_agenda.$sym131$CDOLIST, (SubLObject)ConsesLow.list(uia, (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$sym132$UIMA_OPEN_AGENDAS_SEQUENCE, uima)), ConsesLow.append(body, (SubLObject)user_interaction_agenda.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)user_interaction_agenda.$list130);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 21402L)
    public static SubLObject do_uis(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list133);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ui = (SubLObject)user_interaction_agenda.NIL;
        SubLObject uia = (SubLObject)user_interaction_agenda.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list133);
        ui = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list133);
        uia = current.first();
        current = current.rest();
        if (user_interaction_agenda.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)user_interaction_agenda.$sym131$CDOLIST, (SubLObject)ConsesLow.list(ui, (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$sym134$UIA_INTERACTION_SEQUENCE, uia)), ConsesLow.append(body, (SubLObject)user_interaction_agenda.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)user_interaction_agenda.$list133);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 21608L)
    public static SubLObject uia_language_parsing_mt(final SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), (SubLObject)user_interaction_agenda.$kw135$LANGUAGE_PARSING_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 21902L)
    public static SubLObject uia_language_parsing_mt_update(final SubLObject v_agenda, final SubLObject language_parsing_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), (SubLObject)user_interaction_agenda.$kw135$LANGUAGE_PARSING_MT, language_parsing_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 22076L)
    public static SubLObject uia_language_generation_mt(final SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), (SubLObject)user_interaction_agenda.$kw137$LANGUAGE_GENERATION_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 22274L)
    public static SubLObject uia_language_generation_mt_update(final SubLObject v_agenda, final SubLObject language_generation_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), (SubLObject)user_interaction_agenda.$kw137$LANGUAGE_GENERATION_MT, language_generation_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 22460L)
    public static SubLObject uia_language_lexical_mt(final SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), (SubLObject)user_interaction_agenda.$kw138$LANGUAGE_LEXICAL_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 22649L)
    public static SubLObject uia_language_lexical_mt_update(final SubLObject v_agenda, final SubLObject language_lexical_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), (SubLObject)user_interaction_agenda.$kw138$LANGUAGE_LEXICAL_MT, language_lexical_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 22823L)
    public static SubLObject uia_domain_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw139$DOMAIN_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 23012L)
    public static SubLObject uia_domain_mt_update(final SubLObject v_agenda, final SubLObject domain_mt) {
        return uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw139$DOMAIN_MT, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 23127L)
    public static SubLObject uia_parsing_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw140$PARSING_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 23246L)
    public static SubLObject uia_parsing_mt_update(final SubLObject v_agenda, final SubLObject parsing_mt) {
        return uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw140$PARSING_MT, parsing_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 23365L)
    public static SubLObject uia_generation_mt(final SubLObject v_agenda, SubLObject v_default) {
        if (v_default == user_interaction_agenda.UNPROVIDED) {
            v_default = (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw141$GENERATION_MT, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 23521L)
    public static SubLObject uia_generation_mt_update(final SubLObject v_agenda, final SubLObject generation_mt) {
        return uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw141$GENERATION_MT, generation_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 23652L)
    public static SubLObject uia_all_interaction_mts(final SubLObject v_agenda, SubLObject v_default) {
        if (v_default == user_interaction_agenda.UNPROVIDED) {
            v_default = (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw142$ALL_INTERACTION_MTS, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 23891L)
    public static SubLObject uia_note_interaction_mt(final SubLObject v_agenda, final SubLObject interaction_mt) {
        SubLObject all_interaction_mts = uia_all_interaction_mts(v_agenda, (SubLObject)user_interaction_agenda.NIL);
        all_interaction_mts = conses_high.adjoin(interaction_mt, all_interaction_mts, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
        return uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw142$ALL_INTERACTION_MTS, all_interaction_mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 24368L)
    public static SubLObject uia_domain_interaction_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw143$DOMAIN_INTERACTION_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 24520L)
    public static SubLObject uia_domain_interaction_mt_update(final SubLObject v_agenda, final SubLObject domain_interaction_mt) {
        return uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw143$DOMAIN_INTERACTION_MT, domain_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 24683L)
    public static SubLObject uia_parsing_interaction_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw144$PARSING_INTERACTION_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 24838L)
    public static SubLObject uia_parsing_interaction_mt_update(final SubLObject v_agenda, final SubLObject parsing_interaction_mt) {
        return uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw144$PARSING_INTERACTION_MT, parsing_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 25005L)
    public static SubLObject uia_generation_interaction_mt(final SubLObject v_agenda, SubLObject v_default) {
        if (v_default == user_interaction_agenda.UNPROVIDED) {
            v_default = (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw145$GENERATION_INTERACTION_MT, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 25197L)
    public static SubLObject uia_generation_language_mt(final SubLObject v_agenda) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject agenda_specific_mt = uia_generation_interaction_mt(v_agenda, (SubLObject)user_interaction_agenda.UNPROVIDED);
        return (user_interaction_agenda.$kw136$UNDETERMINED == agenda_specific_mt) ? pph_vars.$pph_language_mt$.getDynamicValue(thread) : agenda_specific_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 25513L)
    public static SubLObject uia_generation_domain_mt(final SubLObject v_agenda) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject agenda_specific_mt = uia_generation_interaction_mt(v_agenda, (SubLObject)user_interaction_agenda.UNPROVIDED);
        return (user_interaction_agenda.$kw136$UNDETERMINED == agenda_specific_mt) ? pph_vars.$pph_domain_mt$.getDynamicValue(thread) : agenda_specific_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 25797L)
    public static SubLObject uia_generation_interaction_mt_update(final SubLObject v_agenda, final SubLObject generation_interaction_mt) {
        return uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw145$GENERATION_INTERACTION_MT, generation_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 25976L)
    public static SubLObject uia_lexical_interaction_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw146$LEXICAL_INTERACTION_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 26131L)
    public static SubLObject uia_lexical_interaction_mt_update(final SubLObject v_agenda, final SubLObject lexical_interaction_mt) {
        return uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw146$LEXICAL_INTERACTION_MT, lexical_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 26298L)
    public static SubLObject ui_domain_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        SubLObject v_answer = ui_state_lookup(interaction, (SubLObject)user_interaction_agenda.$kw143$DOMAIN_INTERACTION_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
        if (user_interaction_agenda.$kw136$UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_domain_interaction_mt(v_agenda);
        if (user_interaction_agenda.$kw136$UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = ui_generation_interaction_mt(interaction);
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 27063L)
    public static SubLObject ui_parsing_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        SubLObject v_answer = ui_state_lookup(interaction, (SubLObject)user_interaction_agenda.$kw144$PARSING_INTERACTION_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
        if (user_interaction_agenda.$kw136$UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_parsing_interaction_mt(v_agenda);
        if (user_interaction_agenda.$kw136$UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_language_parsing_mt(v_agenda);
        if (user_interaction_agenda.$kw136$UNDETERMINED != v_answer) {
            return v_answer;
        }
        return user_interaction_agenda.$const147$EnglishTemplateMt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 27786L)
    public static SubLObject ui_generation_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        SubLObject v_answer = ui_state_lookup(interaction, (SubLObject)user_interaction_agenda.$kw145$GENERATION_INTERACTION_MT, (SubLObject)user_interaction_agenda.$kw136$UNDETERMINED);
        if (user_interaction_agenda.$kw136$UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_generation_interaction_mt(v_agenda, (SubLObject)user_interaction_agenda.UNPROVIDED);
        if (user_interaction_agenda.$kw136$UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_language_generation_mt(v_agenda);
        if (user_interaction_agenda.$kw136$UNDETERMINED != v_answer) {
            return v_answer;
        }
        return user_interaction_agenda.$const148$EnglishParaphraseMt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 28529L)
    public static SubLObject ui_generation_language_mt(final SubLObject interaction) {
        return ui_generation_interaction_mt(interaction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 28728L)
    public static SubLObject ui_generation_domain_mt(final SubLObject interaction) {
        return ui_generation_interaction_mt(interaction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 28897L)
    public static SubLObject ui_lexical_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        final SubLObject v_answer = uia_lexical_interaction_mt(v_agenda);
        if (user_interaction_agenda.$kw136$UNDETERMINED != v_answer) {
            return v_answer;
        }
        return user_interaction_agenda.$const149$EnglishMt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29252L)
    public static SubLObject uia_ensure_scenario_interaction_mt(final SubLObject v_agenda) {
        SubLObject scenario_interaction_mt = uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw150$SCENARIO_INTERACTION_CONTEXT, (SubLObject)user_interaction_agenda.UNPROVIDED);
        if (user_interaction_agenda.NIL == hlmt.hlmt_p(scenario_interaction_mt)) {
            scenario_interaction_mt = rkf_context_tools.rkf_create_scenario_interaction_context(uia_domain_interaction_mt(v_agenda));
            uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw150$SCENARIO_INTERACTION_CONTEXT, scenario_interaction_mt);
            uia_note_interaction_mt(v_agenda, scenario_interaction_mt);
        }
        return scenario_interaction_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject user_interaction_meta_agenda_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)user_interaction_agenda.ZERO_INTEGER);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject user_interaction_meta_agenda_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $user_interaction_meta_agenda_native.class) ? user_interaction_agenda.T : user_interaction_agenda.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject uima_id(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject uima_isg(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject uima_index(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject uima_open_agendas(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject uima_current_agenda(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject uima_state(final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject _csetf_uima_id(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject _csetf_uima_isg(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject _csetf_uima_index(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject _csetf_uima_open_agendas(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject _csetf_uima_current_agenda(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject _csetf_uima_state(final SubLObject v_object, final SubLObject value) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject make_user_interaction_meta_agenda(SubLObject arglist) {
        if (arglist == user_interaction_agenda.UNPROVIDED) {
            arglist = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject v_new = (SubLObject)new $user_interaction_meta_agenda_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)user_interaction_agenda.NIL, next = arglist; user_interaction_agenda.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw39$ID)) {
                _csetf_uima_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw98$ISG)) {
                _csetf_uima_isg(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw99$INDEX)) {
                _csetf_uima_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw171$OPEN_AGENDAS)) {
                _csetf_uima_open_agendas(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw172$CURRENT_AGENDA)) {
                _csetf_uima_current_agenda(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw50$STATE)) {
                _csetf_uima_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)user_interaction_agenda.$str51$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject visit_defstruct_user_interaction_meta_agenda(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw52$BEGIN, (SubLObject)user_interaction_agenda.$sym173$MAKE_USER_INTERACTION_META_AGENDA, (SubLObject)user_interaction_agenda.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw39$ID, uima_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw98$ISG, uima_isg(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw99$INDEX, uima_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw171$OPEN_AGENDAS, uima_open_agendas(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw172$CURRENT_AGENDA, uima_current_agenda(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw54$SLOT, (SubLObject)user_interaction_agenda.$kw50$STATE, uima_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)user_interaction_agenda.$kw55$END, (SubLObject)user_interaction_agenda.$sym173$MAKE_USER_INTERACTION_META_AGENDA, (SubLObject)user_interaction_agenda.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 29964L)
    public static SubLObject visit_defstruct_object_user_interaction_meta_agenda_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_user_interaction_meta_agenda(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 30797L)
    public static SubLObject new_uima() {
        final SubLObject meta_agenda = make_user_interaction_meta_agenda((SubLObject)user_interaction_agenda.UNPROVIDED);
        final SubLObject id = uimma_new_id();
        _csetf_uima_id(meta_agenda, id);
        _csetf_uima_isg(meta_agenda, integer_sequence_generator.new_integer_sequence_generator((SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED));
        _csetf_uima_index(meta_agenda, dictionary.new_dictionary((SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED));
        _csetf_uima_open_agendas(meta_agenda, stacks.create_stack());
        uima_clear_current_agenda(meta_agenda);
        uima_note_state(meta_agenda, (SubLObject)user_interaction_agenda.NIL);
        uimma_add_to_index(id, meta_agenda);
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 31321L)
    public static SubLObject uima_reset(final SubLObject meta_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            integer_sequence_generator.integer_sequence_generator_reset(uima_isg(meta_agenda));
            dictionary.clear_dictionary(uima_index(meta_agenda));
            stacks.clear_stack(uima_open_agendas(meta_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        uima_clear_current_agenda(meta_agenda);
        uima_note_state(meta_agenda, (SubLObject)user_interaction_agenda.NIL);
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 31698L)
    public static SubLObject uima_find_by_id(final SubLObject meta_agenda, final SubLObject id) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        return dictionary.dictionary_lookup(uima_index(meta_agenda), id, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 31935L)
    public static SubLObject uima_find_by_id_string(final SubLObject meta_agenda, final SubLObject id_string) {
        assert user_interaction_agenda.NIL != Types.stringp(id_string) : id_string;
        return uima_find_by_id(meta_agenda, reader.parse_integer(id_string, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 32099L)
    public static SubLObject uima_some_open_agendas_p(final SubLObject meta_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == stacks.stack_empty_p(uima_open_agendas(meta_agenda)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 32280L)
    public static SubLObject uima_open_agendas_sequence(final SubLObject meta_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        return stacks.stack_elements(uima_open_agendas(meta_agenda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 32456L)
    public static SubLObject uima_match_mt_to_agenda(final SubLObject meta_agenda, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        SubLObject result;
        SubLObject iteration_state;
        for (result = (SubLObject)user_interaction_agenda.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(uima_index(meta_agenda))); user_interaction_agenda.NIL == result && user_interaction_agenda.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 32781L)
    public static SubLObject uima_add_to_index(final SubLObject meta_agenda, final SubLObject id, final SubLObject v_object) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            dictionary.dictionary_enter(uima_index(meta_agenda), id, v_object);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 33070L)
    public static SubLObject uima_add_open_agenda(final SubLObject meta_agenda, final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            stacks.stack_push(v_agenda, uima_open_agendas(meta_agenda));
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 33347L)
    public static SubLObject uima_clear_current_agenda(final SubLObject meta_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_uima_current_agenda(meta_agenda, (SubLObject)user_interaction_agenda.NIL);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 33570L)
    public static SubLObject uima_note_current_agenda(final SubLObject meta_agenda, final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_uima_current_agenda(meta_agenda, v_agenda);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 33831L)
    public static SubLObject uima_note_state(final SubLObject meta_agenda, final SubLObject state) {
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            _csetf_uima_state(meta_agenda, state);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 34034L)
    public static SubLObject do_uimas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list175);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject uima = (SubLObject)user_interaction_agenda.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list175);
        uima = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)user_interaction_agenda.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)user_interaction_agenda.NIL;
        SubLObject current_$1 = (SubLObject)user_interaction_agenda.NIL;
        while (user_interaction_agenda.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)user_interaction_agenda.$list175);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)user_interaction_agenda.$list175);
            if (user_interaction_agenda.NIL == conses_high.member(current_$1, (SubLObject)user_interaction_agenda.$list176, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED)) {
                bad = (SubLObject)user_interaction_agenda.T;
            }
            if (current_$1 == user_interaction_agenda.$kw177$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (user_interaction_agenda.NIL != bad && user_interaction_agenda.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)user_interaction_agenda.$list175);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)user_interaction_agenda.$kw178$DONE, current);
        final SubLObject done = (SubLObject)((user_interaction_agenda.NIL != done_tail) ? conses_high.cadr(done_tail) : user_interaction_agenda.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject id = (SubLObject)user_interaction_agenda.$sym179$ID;
        return (SubLObject)ConsesLow.listS((SubLObject)user_interaction_agenda.$sym180$DO_ID_INDEX, (SubLObject)ConsesLow.list(id, uima, (SubLObject)user_interaction_agenda.$list181, (SubLObject)user_interaction_agenda.$kw178$DONE, done), (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$sym182$IGNORE, id), ConsesLow.append(body, (SubLObject)user_interaction_agenda.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 34342L)
    public static SubLObject system_uimma() {
        return uimma();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 34697L)
    public static SubLObject uimma() {
        return user_interaction_agenda.$uimma$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 34740L)
    public static SubLObject new_uimma() {
        return id_index.new_id_index((SubLObject)user_interaction_agenda.ZERO_INTEGER, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 34845L)
    public static SubLObject uimma_reset() {
        user_interaction_agenda.$uimma$.setGlobalValue(new_uimma());
        return uimma();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 34974L)
    public static SubLObject uimma_new_id() {
        return id_index.id_index_reserve(uimma());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 35113L)
    public static SubLObject uimma_add_to_index(final SubLObject id, final SubLObject meta_agenda) {
        return id_index.id_index_enter(uimma(), id, meta_agenda);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 35215L)
    public static SubLObject uimma_find_by_id(final SubLObject meta_agenda_id) {
        return id_index.id_index_lookup(uimma(), meta_agenda_id, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 36906L)
    public static SubLObject uimma_default_locale() {
        return user_interaction_agenda.$uimma_default_locale$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 36981L)
    public static SubLObject set_uimma_default_locale(final SubLObject locale) {
        user_interaction_agenda.$uimma_default_locale$.setGlobalValue(locale);
        return user_interaction_agenda.$uimma_default_locale$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 37446L)
    public static SubLObject uimma_default_generation_mt() {
        return user_interaction_agenda.$uimma_default_generation_mt$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 37535L)
    public static SubLObject set_uimma_default_generation_mt(final SubLObject mt) {
        user_interaction_agenda.$uimma_default_generation_mt$.setGlobalValue(mt);
        return user_interaction_agenda.$uimma_default_generation_mt$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 37745L)
    public static SubLObject uimma_default_domain_mt() {
        return user_interaction_agenda.$uimma_default_domain_mt$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 37826L)
    public static SubLObject set_uimma_default_domain_mt(final SubLObject mt) {
        user_interaction_agenda.$uimma_default_domain_mt$.setGlobalValue(mt);
        return user_interaction_agenda.$uimma_default_domain_mt$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 37954L)
    public static SubLObject ui_meta_agenda(final SubLObject interaction) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        return uia_meta_agenda(ui_agenda(interaction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 38371L)
    public static SubLObject uia_total_interaction_count(final SubLObject v_agenda) {
        return dictionary.dictionary_length(uia_index(v_agenda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 38541L)
    public static SubLObject uia_finished_interaction_count(final SubLObject v_agenda) {
        return queues.queue_size(uia_history(v_agenda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 38707L)
    public static SubLObject ui_state_plist_to_state(final SubLObject plist) {
        assert user_interaction_agenda.NIL != list_utilities.property_list_p(plist) : plist;
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 38830L)
    public static SubLObject ui_state_lookup(final SubLObject interaction, final SubLObject property, SubLObject v_default) {
        if (v_default == user_interaction_agenda.UNPROVIDED) {
            v_default = (SubLObject)user_interaction_agenda.NIL;
        }
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        return conses_high.getf(ui_state(interaction), property, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 39008L)
    public static SubLObject ui_state_update(final SubLObject interaction, final SubLObject property, final SubLObject value) {
        return ui_note_state(interaction, conses_high.putf(ui_state(interaction), property, value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 39154L)
    public static SubLObject ui_state_clear(final SubLObject interaction, final SubLObject property) {
        return ui_note_state(interaction, conses_high.remf(ui_state(interaction), property));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 39287L)
    public static SubLObject ui_state_clear_all(final SubLObject interaction) {
        return ui_note_state(interaction, (SubLObject)user_interaction_agenda.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 39380L)
    public static SubLObject uia_state_plist_to_state(final SubLObject plist) {
        assert user_interaction_agenda.NIL != list_utilities.property_list_p(plist) : plist;
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 39483L)
    public static SubLObject uia_initialize_state(final SubLObject v_agenda, final SubLObject plist) {
        uia_note_state(v_agenda, uia_state_plist_to_state(plist));
        uia_create_memoization_state(v_agenda);
        uia_glob_reset(v_agenda);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 39677L)
    public static SubLObject uia_state_lookup(final SubLObject v_agenda, final SubLObject property, SubLObject v_default) {
        if (v_default == user_interaction_agenda.UNPROVIDED) {
            v_default = (SubLObject)user_interaction_agenda.NIL;
        }
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        return conses_high.getf(uia_state(v_agenda), property, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 39849L)
    public static SubLObject uia_state_update(final SubLObject v_agenda, final SubLObject property, final SubLObject value) {
        return uia_note_state(v_agenda, conses_high.putf(uia_state(v_agenda), property, value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 39983L)
    public static SubLObject uia_state_clear(final SubLObject v_agenda, final SubLObject property) {
        return uia_note_state(v_agenda, conses_high.remf(uia_state(v_agenda), property));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 40104L)
    public static SubLObject uia_state_clear_all(final SubLObject v_agenda) {
        uia_note_state(v_agenda, (SubLObject)user_interaction_agenda.NIL);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 40198L)
    public static SubLObject uima_state_plist_to_state(final SubLObject plist) {
        assert user_interaction_agenda.NIL != list_utilities.property_list_p(plist) : plist;
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 40301L)
    public static SubLObject uima_initialize_state(final SubLObject meta_agenda, final SubLObject plist) {
        uima_note_state(meta_agenda, uima_state_plist_to_state(plist));
        uima_create_memoization_state(meta_agenda);
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 40493L)
    public static SubLObject uima_state_lookup(final SubLObject meta_agenda, final SubLObject property, SubLObject v_default) {
        if (v_default == user_interaction_agenda.UNPROVIDED) {
            v_default = (SubLObject)user_interaction_agenda.NIL;
        }
        assert user_interaction_agenda.NIL != user_interaction_meta_agenda_p(meta_agenda) : meta_agenda;
        return conses_high.getf(uima_state(meta_agenda), property, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 40687L)
    public static SubLObject uima_state_update(final SubLObject meta_agenda, final SubLObject property, final SubLObject value) {
        return uima_note_state(meta_agenda, conses_high.putf(uima_state(meta_agenda), property, value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 40839L)
    public static SubLObject uima_state_clear(final SubLObject meta_agenda, final SubLObject property) {
        return uima_note_state(meta_agenda, conses_high.remf(uima_state(meta_agenda), property));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 40978L)
    public static SubLObject uima_state_clear_all(final SubLObject meta_agenda) {
        return uima_note_state(meta_agenda, (SubLObject)user_interaction_agenda.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 41075L)
    public static SubLObject with_uia_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list192);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_agenda = (SubLObject)user_interaction_agenda.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list192);
        v_agenda = current.first();
        current = current.rest();
        if (user_interaction_agenda.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject state = (SubLObject)user_interaction_agenda.$sym193$STATE;
            return (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$sym194$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(state, (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$sym195$UIA_MEMOIZATION_STATE, v_agenda))), (SubLObject)ConsesLow.listS((SubLObject)user_interaction_agenda.$sym196$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list(state), ConsesLow.append(body, (SubLObject)user_interaction_agenda.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)user_interaction_agenda.$list192);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 41309L)
    public static SubLObject uia_memoization_state(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw197$MEMOIZATION_STATE, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 41413L)
    public static SubLObject uia_create_memoization_state(final SubLObject v_agenda) {
        uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw197$MEMOIZATION_STATE, memoization_state.new_memoization_state((SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED));
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 41555L)
    public static SubLObject uia_clear_memoization_state(final SubLObject v_agenda) {
        memoization_state.clear_all_memoization(uia_memoization_state(v_agenda));
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 41682L)
    public static SubLObject uia_clear_memoization_state_for_function(final SubLObject v_agenda, final SubLObject symbol) {
        return memoization_state.clear_memoization(uia_memoization_state(v_agenda), symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 41825L)
    public static SubLObject with_uima_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list198);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject meta_agenda = (SubLObject)user_interaction_agenda.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list198);
        meta_agenda = current.first();
        current = current.rest();
        if (user_interaction_agenda.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject state = (SubLObject)user_interaction_agenda.$sym199$STATE;
            return (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$sym194$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(state, (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$sym200$UIMA_MEMOIZATION_STATE, meta_agenda))), (SubLObject)ConsesLow.listS((SubLObject)user_interaction_agenda.$sym196$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list(state), ConsesLow.append(body, (SubLObject)user_interaction_agenda.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)user_interaction_agenda.$list198);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 42051L)
    public static SubLObject uima_memoization_state(final SubLObject meta_agenda) {
        return uima_state_lookup(meta_agenda, (SubLObject)user_interaction_agenda.$kw197$MEMOIZATION_STATE, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 42167L)
    public static SubLObject uima_create_memoization_state(final SubLObject meta_agenda) {
        uima_state_update(meta_agenda, (SubLObject)user_interaction_agenda.$kw197$MEMOIZATION_STATE, memoization_state.new_memoization_state((SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED));
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 42326L)
    public static SubLObject uima_clear_memoization_state(final SubLObject meta_agenda) {
        memoization_state.clear_all_memoization(uima_memoization_state(meta_agenda));
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 42470L)
    public static SubLObject ui_ancestor_interactions(final SubLObject interaction) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        SubLObject v_answer = (SubLObject)user_interaction_agenda.NIL;
        SubLObject parent;
        for (parent = (SubLObject)user_interaction_agenda.NIL, parent = ui_parent_interaction(interaction); user_interaction_agenda.NIL != parent; parent = ui_parent_interaction(parent)) {
            v_answer = (SubLObject)ConsesLow.cons(parent, v_answer);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 42854L)
    public static SubLObject ui_pending_descendant_interactions(final SubLObject interaction) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        return Sequences.nreverse(ui_pending_descendants_recursive(interaction, (SubLObject)user_interaction_agenda.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 43109L)
    public static SubLObject ui_pending_descendants_recursive(final SubLObject interaction, SubLObject accumulator) {
        SubLObject cdolist_list_var = ui_child_interactions(interaction);
        SubLObject child = (SubLObject)user_interaction_agenda.NIL;
        child = cdolist_list_var.first();
        while (user_interaction_agenda.NIL != cdolist_list_var) {
            if (user_interaction_agenda.$kw201$PENDING == ui_status(child)) {
                accumulator = (SubLObject)ConsesLow.cons(child, accumulator);
            }
            else {
                accumulator = ui_pending_descendants_recursive(child, accumulator);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 44342L)
    public static SubLObject ui_sub_interactions(final SubLObject interaction) {
        return ui_state_lookup(interaction, (SubLObject)user_interaction_agenda.$kw202$SUB_INTERACTIONS, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 44500L)
    public static SubLObject ui_super_interaction(final SubLObject interaction) {
        return ui_state_lookup(interaction, (SubLObject)user_interaction_agenda.$kw203$SUPER_INTERACTION, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 44612L)
    public static SubLObject ui_add_sub_interaction(final SubLObject super_interaction, final SubLObject sub_interaction) {
        SubLObject sub_interactions = ui_sub_interactions(super_interaction);
        if (user_interaction_agenda.NIL == conses_high.member(sub_interaction, sub_interactions, Symbols.symbol_function((SubLObject)user_interaction_agenda.EQL), Symbols.symbol_function((SubLObject)user_interaction_agenda.IDENTITY))) {
            sub_interactions = (SubLObject)ConsesLow.cons(sub_interaction, sub_interactions);
        }
        ui_state_update(super_interaction, (SubLObject)user_interaction_agenda.$kw202$SUB_INTERACTIONS, sub_interactions);
        return super_interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 44908L)
    public static SubLObject ui_remove_sub_interaction(final SubLObject sub_interaction) {
        final SubLObject super_interaction = ui_super_interaction(sub_interaction);
        final SubLObject subs = ui_sub_interactions(super_interaction);
        final SubLObject new_subs = Sequences.remove(sub_interaction, subs, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
        ui_state_update(super_interaction, (SubLObject)user_interaction_agenda.$kw202$SUB_INTERACTIONS, new_subs);
        return sub_interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 45223L)
    public static SubLObject ui_note_super_interaction(final SubLObject sub_interaction, final SubLObject super_interaction) {
        ui_state_update(sub_interaction, (SubLObject)user_interaction_agenda.$kw203$SUPER_INTERACTION, super_interaction);
        return sub_interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 45400L)
    public static SubLObject uia_act_promote_to_child(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        final SubLObject parent = ui_super_interaction(interaction);
        ui_remove_sub_interaction(interaction);
        uia_classify(v_agenda, interaction);
        uia_act_add_dependent(v_agenda, parent, interaction);
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 46113L)
    public static SubLObject ui_recompute_status(final SubLObject interaction) {
        final SubLObject pcase_var = ui_status(interaction);
        if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw204$BLOCKED)) {
            final SubLObject children = ui_child_interactions(interaction);
            if (user_interaction_agenda.NIL == Sequences.find((SubLObject)user_interaction_agenda.$kw201$PENDING, children, Symbols.symbol_function((SubLObject)user_interaction_agenda.EQ), Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym21$UI_STATUS), (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED)) {
                ui_note_status(interaction, (SubLObject)user_interaction_agenda.$kw201$PENDING);
            }
        }
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 46659L)
    public static SubLObject ui_alive_p(final SubLObject interaction) {
        final SubLObject pcase_var = ui_status(interaction);
        if (pcase_var.eql((SubLObject)user_interaction_agenda.$kw204$BLOCKED) || pcase_var.eql((SubLObject)user_interaction_agenda.$kw201$PENDING)) {
            return (SubLObject)user_interaction_agenda.T;
        }
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 46882L)
    public static SubLObject uia_next_action(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        if (user_interaction_agenda.NIL != uia_some_message_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_messages(v_agenda));
            if (user_interaction_agenda.NIL != pending) {
                return pending;
            }
        }
        if (user_interaction_agenda.NIL != uia_some_requirement_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_requirements(v_agenda));
            if (user_interaction_agenda.NIL != pending) {
                return pending;
            }
        }
        if (user_interaction_agenda.NIL != uia_some_relevant_suggestion_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_relevant_suggestions(v_agenda));
            if (user_interaction_agenda.NIL != pending) {
                return pending;
            }
        }
        if (user_interaction_agenda.NIL != uia_some_possible_suggestion_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_possible_suggestions(v_agenda));
            if (user_interaction_agenda.NIL != pending) {
                return pending;
            }
        }
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 47878L)
    public static SubLObject uia_note_user_selection(final SubLObject v_agenda, final SubLObject interaction) {
        if (user_interaction_agenda.$kw201$PENDING == ui_status(interaction)) {
            uia_promote_interaction(v_agenda, interaction);
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 48056L)
    public static SubLObject uia_promote_interaction(final SubLObject v_agenda, final SubLObject interaction) {
        uia_declassify(v_agenda, interaction);
        _csetf_ui_mode(interaction, (SubLObject)user_interaction_agenda.$kw121$REQUIRED);
        uia_classify(v_agenda, interaction);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 48252L)
    public static SubLObject uia_best_pending_action(final SubLObject container) {
        final SubLObject best = uia_first_pending_nonbackground_action(container);
        if (user_interaction_agenda.NIL != user_interaction_p(best)) {
            return best;
        }
        if (user_interaction_agenda.NIL != queues.queue_p(container)) {
            return queues.queue_find_if((SubLObject)user_interaction_agenda.$sym205$UIA_PENDING_ACTION_P, container, (SubLObject)user_interaction_agenda.UNPROVIDED);
        }
        if (user_interaction_agenda.NIL != stacks.stack_p(container)) {
            return stacks.stack_find_if((SubLObject)user_interaction_agenda.$sym205$UIA_PENDING_ACTION_P, container, (SubLObject)user_interaction_agenda.UNPROVIDED);
        }
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 48700L)
    public static SubLObject uia_pending_action_p(final SubLObject interaction) {
        if (user_interaction_agenda.NIL == user_interaction_p(interaction)) {
            return (SubLObject)user_interaction_agenda.NIL;
        }
        if (!user_interaction_agenda.$kw201$PENDING.eql(ui_status(interaction))) {
            return (SubLObject)user_interaction_agenda.NIL;
        }
        if (user_interaction_agenda.$kw117$THINKING != ui_operator(interaction)) {
            return (SubLObject)user_interaction_agenda.T;
        }
        if (user_interaction_agenda.NIL != user_interaction_p(ui_parent_interaction(interaction))) {
            return (SubLObject)user_interaction_agenda.T;
        }
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 49127L)
    public static SubLObject uia_first_pending_nonbackground_action(final SubLObject container) {
        if (user_interaction_agenda.NIL != queues.queue_p(container)) {
            SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(container);
            SubLObject interaction = (SubLObject)user_interaction_agenda.NIL;
            interaction = cdolist_list_var.first();
            while (user_interaction_agenda.NIL != cdolist_list_var) {
                if (user_interaction_agenda.$kw201$PENDING.eql(ui_status(interaction)) && user_interaction_agenda.NIL == uia_background_task_p(interaction)) {
                    return interaction;
                }
                cdolist_list_var = cdolist_list_var.rest();
                interaction = cdolist_list_var.first();
            }
            return (SubLObject)user_interaction_agenda.NIL;
        }
        if (user_interaction_agenda.NIL != stacks.stack_p(container)) {
            SubLObject cdolist_list_var = stacks.do_stack_elements_stack_elements(container);
            SubLObject interaction = (SubLObject)user_interaction_agenda.NIL;
            interaction = cdolist_list_var.first();
            while (user_interaction_agenda.NIL != cdolist_list_var) {
                if (user_interaction_agenda.$kw201$PENDING.eql(ui_status(interaction)) && user_interaction_agenda.NIL == uia_background_task_p(interaction)) {
                    return interaction;
                }
                cdolist_list_var = cdolist_list_var.rest();
                interaction = cdolist_list_var.first();
            }
            return (SubLObject)user_interaction_agenda.NIL;
        }
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 49634L)
    public static SubLObject uia_signature_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL != list_utilities.proper_list_p(v_object) && user_interaction_agenda.NIL != list_utilities.lengthE(v_object, (SubLObject)user_interaction_agenda.TWO_INTEGER, (SubLObject)user_interaction_agenda.UNPROVIDED) && user_interaction_agenda.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym64$INTEGERP), v_object, (SubLObject)user_interaction_agenda.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 49904L)
    public static SubLObject uia_signature(final SubLObject v_agenda) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        final SubLObject agenda_id = uia_id(v_agenda);
        final SubLObject meta_agenda = uia_meta_agenda(v_agenda);
        final SubLObject meta_agenda_id = uima_id(meta_agenda);
        return (SubLObject)ConsesLow.list(meta_agenda_id, agenda_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 50155L)
    public static SubLObject find_uia_by_signature(final SubLObject signature) {
        assert user_interaction_agenda.NIL != uia_signature_p(signature) : signature;
        SubLObject meta_agenda_id = (SubLObject)user_interaction_agenda.NIL;
        SubLObject agenda_id = (SubLObject)user_interaction_agenda.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(signature, signature, (SubLObject)user_interaction_agenda.$list207);
        meta_agenda_id = signature.first();
        SubLObject current = signature.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, signature, (SubLObject)user_interaction_agenda.$list207);
        agenda_id = current.first();
        current = current.rest();
        if (user_interaction_agenda.NIL == current) {
            final SubLObject meta_agenda = uimma_find_by_id(meta_agenda_id);
            if (user_interaction_agenda.NIL != meta_agenda) {
                final SubLObject v_agenda = uima_find_by_id(meta_agenda, agenda_id);
                if (user_interaction_agenda.NIL != v_agenda) {
                    return v_agenda;
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(signature, (SubLObject)user_interaction_agenda.$list207);
        }
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 50567L)
    public static SubLObject ui_signature_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL != list_utilities.proper_list_p(v_object) && user_interaction_agenda.NIL != list_utilities.lengthE(v_object, (SubLObject)user_interaction_agenda.THREE_INTEGER, (SubLObject)user_interaction_agenda.UNPROVIDED) && user_interaction_agenda.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym64$INTEGERP), v_object, (SubLObject)user_interaction_agenda.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 50837L)
    public static SubLObject ui_signature(final SubLObject interaction) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        final SubLObject interaction_id = ui_id(interaction);
        final SubLObject v_agenda = ui_agenda(interaction);
        final SubLObject agenda_signature = uia_signature(v_agenda);
        return ConsesLow.append(agenda_signature, (SubLObject)ConsesLow.list(interaction_id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 51112L)
    public static SubLObject ui_signature_to_property_list(final SubLObject signature) {
        assert user_interaction_agenda.NIL != ui_signature_p(signature) : signature;
        SubLObject uima = (SubLObject)user_interaction_agenda.NIL;
        SubLObject uia = (SubLObject)user_interaction_agenda.NIL;
        SubLObject ui = (SubLObject)user_interaction_agenda.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(signature, signature, (SubLObject)user_interaction_agenda.$list209);
        uima = signature.first();
        SubLObject current = signature.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, signature, (SubLObject)user_interaction_agenda.$list209);
        uia = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, signature, (SubLObject)user_interaction_agenda.$list209);
        ui = current.first();
        current = current.rest();
        if (user_interaction_agenda.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$kw210$UIMA, uima, (SubLObject)user_interaction_agenda.$kw211$UIA, uia, (SubLObject)user_interaction_agenda.$kw212$UI, ui);
        }
        cdestructuring_bind.cdestructuring_bind_error(signature, (SubLObject)user_interaction_agenda.$list209);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 51302L)
    public static SubLObject find_ui_by_signature(final SubLObject signature) {
        assert user_interaction_agenda.NIL != ui_signature_p(signature) : signature;
        SubLObject meta_agenda_id = (SubLObject)user_interaction_agenda.NIL;
        SubLObject agenda_id = (SubLObject)user_interaction_agenda.NIL;
        SubLObject interaction_id = (SubLObject)user_interaction_agenda.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(signature, signature, (SubLObject)user_interaction_agenda.$list213);
        meta_agenda_id = signature.first();
        SubLObject current = signature.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, signature, (SubLObject)user_interaction_agenda.$list213);
        agenda_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, signature, (SubLObject)user_interaction_agenda.$list213);
        interaction_id = current.first();
        current = current.rest();
        if (user_interaction_agenda.NIL == current) {
            final SubLObject agenda_signature = (SubLObject)ConsesLow.list(meta_agenda_id, agenda_id);
            final SubLObject v_agenda = find_uia_by_signature(agenda_signature);
            if (user_interaction_agenda.NIL != v_agenda) {
                final SubLObject interaction = uia_find_by_id(v_agenda, interaction_id);
                if (user_interaction_agenda.NIL != interaction) {
                    return interaction;
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(signature, (SubLObject)user_interaction_agenda.$list213);
        }
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 51800L)
    public static SubLObject uia_schedule_frame_for_refresh(final SubLObject v_agenda, final SubLObject frame_name) {
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            SubLObject frames = uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw214$FRAMES_FOR_REFRESH, (SubLObject)user_interaction_agenda.NIL);
            if (user_interaction_agenda.NIL == conses_high.member(frame_name, frames, Symbols.symbol_function((SubLObject)user_interaction_agenda.EQL), Symbols.symbol_function((SubLObject)user_interaction_agenda.IDENTITY))) {
                frames = (SubLObject)ConsesLow.cons(frame_name, frames);
            }
            uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw214$FRAMES_FOR_REFRESH, frames);
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 52156L)
    public static SubLObject uia_get_frames_scheduled_for_refresh(final SubLObject v_agenda) {
        SubLObject frames = (SubLObject)user_interaction_agenda.NIL;
        SubLObject release = (SubLObject)user_interaction_agenda.NIL;
        try {
            release = Locks.seize_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            frames = uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw214$FRAMES_FOR_REFRESH, (SubLObject)user_interaction_agenda.NIL);
            if (user_interaction_agenda.NIL != frames) {
                uia_state_clear(v_agenda, (SubLObject)user_interaction_agenda.$kw214$FRAMES_FOR_REFRESH);
            }
        }
        finally {
            if (user_interaction_agenda.NIL != release) {
                Locks.release_lock(user_interaction_agenda.$uia_lock$.getGlobalValue());
            }
        }
        return frames;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 52558L)
    public static SubLObject uia_crumb_trail(final SubLObject v_agenda) {
        SubLObject crumb_trail = uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw215$CRUMB_TRAIL, (SubLObject)user_interaction_agenda.$kw216$UNDEFINED);
        if (crumb_trail == user_interaction_agenda.$kw216$UNDEFINED) {
            crumb_trail = uia_create_new_crumb_trail(v_agenda);
        }
        return crumb_trail;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 52849L)
    public static SubLObject uia_create_new_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = dictionary.new_dictionary((SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
        uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw215$CRUMB_TRAIL, crumb_trail);
        dictionary.dictionary_enter(crumb_trail, (SubLObject)user_interaction_agenda.$kw217$TERMS, (SubLObject)user_interaction_agenda.NIL);
        dictionary.dictionary_enter(crumb_trail, (SubLObject)user_interaction_agenda.$kw218$FACTS, (SubLObject)user_interaction_agenda.NIL);
        return crumb_trail;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 53114L)
    public static SubLObject uia_update_term_crumb_trail(final SubLObject crumb_trail, final SubLObject v_term) {
        dictionary_utilities.dictionary_remove_from_value(crumb_trail, (SubLObject)user_interaction_agenda.$kw217$TERMS, v_term, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
        dictionary_utilities.dictionary_push(crumb_trail, (SubLObject)user_interaction_agenda.$kw217$TERMS, v_term);
        return crumb_trail;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 53300L)
    public static SubLObject uia_update_fact_crumb_trail(final SubLObject crumb_trail, final SubLObject fact) {
        final SubLObject trailed_facts = dictionary.dictionary_lookup(crumb_trail, (SubLObject)user_interaction_agenda.$kw218$FACTS, (SubLObject)user_interaction_agenda.UNPROVIDED);
        SubLObject new_trail = (SubLObject)user_interaction_agenda.NIL;
        SubLObject cdolist_list_var = trailed_facts;
        SubLObject old_fact = (SubLObject)user_interaction_agenda.NIL;
        old_fact = cdolist_list_var.first();
        while (user_interaction_agenda.NIL != cdolist_list_var) {
            if (user_interaction_agenda.NIL == uia_crumb_trail_facts_equalP(fact, old_fact)) {
                final SubLObject item_var = old_fact;
                if (user_interaction_agenda.NIL == conses_high.member(item_var, new_trail, Symbols.symbol_function((SubLObject)user_interaction_agenda.EQUAL), Symbols.symbol_function((SubLObject)user_interaction_agenda.IDENTITY))) {
                    new_trail = (SubLObject)ConsesLow.cons(item_var, new_trail);
                }
            }
            else if (user_interaction_agenda.NIL != uia_crumb_trail_el_sentenceP(fact) && user_interaction_agenda.NIL != uia_crumb_trail_stale_assertionP(old_fact)) {
                return crumb_trail;
            }
            cdolist_list_var = cdolist_list_var.rest();
            old_fact = cdolist_list_var.first();
        }
        new_trail = Sequences.nreverse(new_trail);
        if (user_interaction_agenda.NIL == conses_high.member(fact, new_trail, Symbols.symbol_function((SubLObject)user_interaction_agenda.EQUAL), Symbols.symbol_function((SubLObject)user_interaction_agenda.IDENTITY))) {
            new_trail = (SubLObject)ConsesLow.cons(fact, new_trail);
        }
        dictionary.dictionary_enter(crumb_trail, (SubLObject)user_interaction_agenda.$kw218$FACTS, new_trail);
        return crumb_trail;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 54086L)
    public static SubLObject uia_update_question_crumb_trail(final SubLObject crumb_trail, final SubLObject v_question) {
        dictionary_utilities.dictionary_pushnew(crumb_trail, (SubLObject)user_interaction_agenda.$kw219$QUESTIONS, v_question, Symbols.symbol_function((SubLObject)user_interaction_agenda.EQUAL), (SubLObject)user_interaction_agenda.UNPROVIDED);
        return crumb_trail;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 54283L)
    public static SubLObject uia_crumb_trail_stale_assertionP(final SubLObject fact) {
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == assertions_high.valid_assertion(conses_high.getf(fact, (SubLObject)user_interaction_agenda.$kw220$ASSERTION, (SubLObject)user_interaction_agenda.UNPROVIDED), (SubLObject)user_interaction_agenda.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 54397L)
    public static SubLObject uia_crumb_trail_el_sentenceP(final SubLObject fact) {
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL == hlmt.hlmt_p(conses_high.getf(fact, (SubLObject)user_interaction_agenda.$kw221$MT, (SubLObject)user_interaction_agenda.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 54491L)
    public static SubLObject uia_crumb_trail_facts_equalP(final SubLObject fact1, final SubLObject fact2) {
        final SubLObject sentence1 = conses_high.getf(fact1, (SubLObject)user_interaction_agenda.$kw222$SENTENCE, (SubLObject)user_interaction_agenda.UNPROVIDED);
        final SubLObject sentence2 = conses_high.getf(fact2, (SubLObject)user_interaction_agenda.$kw222$SENTENCE, (SubLObject)user_interaction_agenda.UNPROVIDED);
        return Equality.equal(sentence1, sentence2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 54674L)
    public static SubLObject uia_get_term_crumb_trail(final SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, (SubLObject)user_interaction_agenda.$kw217$TERMS, (SubLObject)user_interaction_agenda.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 54782L)
    public static SubLObject uia_get_fact_crumb_trail(final SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, (SubLObject)user_interaction_agenda.$kw218$FACTS, (SubLObject)user_interaction_agenda.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 54890L)
    public static SubLObject uia_get_question_crumb_trail(final SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, (SubLObject)user_interaction_agenda.$kw219$QUESTIONS, (SubLObject)user_interaction_agenda.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 55006L)
    public static SubLObject uia_remove_crumb_trail_term(final SubLObject crumb_trail, final SubLObject v_term) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, (SubLObject)user_interaction_agenda.$kw217$TERMS, v_term, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 55134L)
    public static SubLObject uia_remove_crumb_trail_fact(final SubLObject crumb_trail, final SubLObject fact) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, (SubLObject)user_interaction_agenda.$kw218$FACTS, fact, (SubLObject)user_interaction_agenda.EQUAL, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 55269L)
    public static SubLObject uia_remove_crumb_trail_question(final SubLObject crumb_trail, final SubLObject v_question) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, (SubLObject)user_interaction_agenda.$kw219$QUESTIONS, v_question, (SubLObject)user_interaction_agenda.EQUAL, (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 55420L)
    public static SubLObject uia_shorten_term_crumb_trail(final SubLObject crumb_trail, final SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, (SubLObject)user_interaction_agenda.$kw217$TERMS, Sequences.subseq(dictionary.dictionary_lookup(crumb_trail, (SubLObject)user_interaction_agenda.$kw217$TERMS, (SubLObject)user_interaction_agenda.NIL), (SubLObject)user_interaction_agenda.ZERO_INTEGER, how_many));
        return crumb_trail;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 55621L)
    public static SubLObject uia_shorten_fact_crumb_trail(final SubLObject crumb_trail, final SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, (SubLObject)user_interaction_agenda.$kw218$FACTS, Sequences.subseq(dictionary.dictionary_lookup(crumb_trail, (SubLObject)user_interaction_agenda.$kw218$FACTS, (SubLObject)user_interaction_agenda.NIL), (SubLObject)user_interaction_agenda.ZERO_INTEGER, how_many));
        return crumb_trail;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 55822L)
    public static SubLObject uia_shorten_question_crumb_trail(final SubLObject crumb_trail, final SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, (SubLObject)user_interaction_agenda.$kw219$QUESTIONS, Sequences.subseq(dictionary.dictionary_lookup(crumb_trail, (SubLObject)user_interaction_agenda.$kw219$QUESTIONS, (SubLObject)user_interaction_agenda.NIL), (SubLObject)user_interaction_agenda.ZERO_INTEGER, how_many));
        return crumb_trail;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 56035L)
    public static SubLObject uia_reset_crumb_trail(final SubLObject v_agenda) {
        uia_create_new_crumb_trail(v_agenda);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 56136L)
    public static SubLObject uia_add_term_to_crumb_trail(final SubLObject v_agenda, final SubLObject v_term) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        uia_update_term_crumb_trail(crumb_trail, v_term);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 56311L)
    public static SubLObject uia_add_question_to_crumb_trail(final SubLObject v_agenda, final SubLObject v_question, SubLObject mt) {
        if (mt == user_interaction_agenda.UNPROVIDED) {
            mt = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        final SubLObject encapsulated_question = uia_crumb_trail_encapsulate_sentence(v_question, mt);
        uia_update_question_crumb_trail(crumb_trail, encapsulated_question);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 56642L)
    public static SubLObject uia_add_fact_to_crumb_trail(final SubLObject v_agenda, final SubLObject fact, SubLObject mt) {
        if (mt == user_interaction_agenda.UNPROVIDED) {
            mt = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        final SubLObject encapsulated_fact = (user_interaction_agenda.NIL != assertion_handles.assertion_p(fact)) ? uia_crumb_trail_encapsulate_assertion(fact) : uia_crumb_trail_encapsulate_sentence(fact, mt);
        uia_update_fact_crumb_trail(crumb_trail, encapsulated_fact);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 57040L)
    public static SubLObject uia_crumb_trail_encapsulate_assertion(final SubLObject assertion) {
        final SubLObject sentence = assertions_high.assertion_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject plist = (SubLObject)user_interaction_agenda.NIL;
        plist = conses_high.putf(plist, (SubLObject)user_interaction_agenda.$kw220$ASSERTION, assertion);
        plist = conses_high.putf(plist, (SubLObject)user_interaction_agenda.$kw222$SENTENCE, sentence);
        plist = conses_high.putf(plist, (SubLObject)user_interaction_agenda.$kw221$MT, mt);
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 57361L)
    public static SubLObject uia_crumb_trail_encapsulate_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLObject assertion = (SubLObject)((user_interaction_agenda.NIL != hlmt.hlmt_p(mt)) ? czer_meta.find_assertion_cycl(sentence, mt) : user_interaction_agenda.NIL);
        SubLObject plist = (SubLObject)user_interaction_agenda.NIL;
        if (user_interaction_agenda.NIL != assertion_handles.assertion_p(assertion)) {
            plist = conses_high.putf(plist, (SubLObject)user_interaction_agenda.$kw220$ASSERTION, assertion);
        }
        plist = conses_high.putf(plist, (SubLObject)user_interaction_agenda.$kw222$SENTENCE, sentence);
        plist = conses_high.putf(plist, (SubLObject)user_interaction_agenda.$kw221$MT, mt);
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 57715L)
    public static SubLObject uia_get_terms_on_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        SubLObject stales = (SubLObject)user_interaction_agenda.NIL;
        SubLObject cdolist_list_var = uia_get_term_crumb_trail(crumb_trail);
        SubLObject v_term = (SubLObject)user_interaction_agenda.NIL;
        v_term = cdolist_list_var.first();
        while (user_interaction_agenda.NIL != cdolist_list_var) {
            if (user_interaction_agenda.NIL == forts.valid_fort_robustP(v_term)) {
                stales = (SubLObject)ConsesLow.cons(v_term, stales);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        cdolist_list_var = stales;
        SubLObject stale = (SubLObject)user_interaction_agenda.NIL;
        stale = cdolist_list_var.first();
        while (user_interaction_agenda.NIL != cdolist_list_var) {
            uia_remove_crumb_trail_term(crumb_trail, stale);
            cdolist_list_var = cdolist_list_var.rest();
            stale = cdolist_list_var.first();
        }
        return uia_get_term_crumb_trail(crumb_trail);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 58098L)
    public static SubLObject uia_get_facts_on_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_get_fact_crumb_trail(crumb_trail);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 58256L)
    public static SubLObject uia_get_questions_on_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_get_question_crumb_trail(crumb_trail);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 58422L)
    public static SubLObject uia_anything_on_crumb_trailP(final SubLObject v_agenda) {
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL != list_utilities.sublisp_boolean(uia_get_terms_on_crumb_trail(v_agenda)) || user_interaction_agenda.NIL != list_utilities.sublisp_boolean(uia_get_facts_on_crumb_trail(v_agenda)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 58605L)
    public static SubLObject uia_remove_term_from_crumb_trail(final SubLObject v_agenda, final SubLObject v_term) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_remove_crumb_trail_term(crumb_trail, v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 58777L)
    public static SubLObject uia_remove_fact_from_crumb_trail(final SubLObject v_agenda, final SubLObject fact) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_remove_crumb_trail_fact(crumb_trail, fact);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 58948L)
    public static SubLObject uia_remove_question_from_crumb_trail(final SubLObject v_agenda, final SubLObject v_question) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_remove_crumb_trail_question(crumb_trail, v_question);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 59135L)
    public static SubLObject uia_shorten_crumb_trail_to(final SubLObject v_agenda, SubLObject how_many) {
        if (how_many == user_interaction_agenda.UNPROVIDED) {
            how_many = (SubLObject)user_interaction_agenda.TEN_INTEGER;
        }
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        uia_shorten_term_crumb_trail(crumb_trail, how_many);
        uia_shorten_fact_crumb_trail(crumb_trail, how_many);
        uia_shorten_question_crumb_trail(crumb_trail, how_many);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 59450L)
    public static SubLObject uima_act_create(SubLObject plist) {
        if (plist == user_interaction_agenda.UNPROVIDED) {
            plist = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject meta_agenda = new_uima();
        uima_initialize_state(meta_agenda, plist);
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 59980L)
    public static SubLObject uima_act_focus(final SubLObject meta_agenda, final SubLObject v_agenda) {
        uima_note_current_agenda(meta_agenda, v_agenda);
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 60214L)
    public static SubLObject uia_act_create(final SubLObject meta_agenda, SubLObject plist) {
        if (plist == user_interaction_agenda.UNPROVIDED) {
            plist = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject v_agenda = new_uia(meta_agenda);
        uia_initialize_state(v_agenda, plist);
        uima_add_open_agenda(meta_agenda, v_agenda);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 60596L)
    public static SubLObject uia_act_standard_initialization(final SubLObject v_agenda) {
        uia_act_new_interaction(v_agenda, (SubLObject)user_interaction_agenda.$kw121$REQUIRED, (SubLObject)user_interaction_agenda.$kw223$INITIALIZER, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 60953L)
    public static SubLObject uima_act_reset(SubLObject meta_agenda, SubLObject plist) {
        if (plist == user_interaction_agenda.UNPROVIDED) {
            plist = (SubLObject)user_interaction_agenda.NIL;
        }
        meta_agenda = uima_reset(meta_agenda);
        uima_initialize_state(meta_agenda, plist);
        return meta_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 61252L)
    public static SubLObject uia_act_reset(SubLObject v_agenda, SubLObject plist) {
        if (plist == user_interaction_agenda.UNPROVIDED) {
            plist = (SubLObject)user_interaction_agenda.NIL;
        }
        v_agenda = uia_reset(v_agenda);
        uia_initialize_state(v_agenda, plist);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 61479L)
    public static SubLObject uia_act_clear_memoization(final SubLObject v_agenda) {
        uia_clear_memoization_state(v_agenda);
        return v_agenda;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 61629L)
    public static SubLObject uia_launch_action_in_frame(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject frame = (SubLObject)user_interaction_agenda.NIL;
        SubLObject v_agenda = (SubLObject)user_interaction_agenda.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list224);
        frame = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)user_interaction_agenda.$list224);
        v_agenda = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$sym225$PROGN, (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$sym226$UIA_SCHEDULE_FRAME_FOR_REFRESH, v_agenda, frame), reader.bq_cons((SubLObject)user_interaction_agenda.$sym225$PROGN, ConsesLow.append(body, (SubLObject)user_interaction_agenda.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 61886L)
    public static SubLObject uia_act_new_interaction(final SubLObject v_agenda, final SubLObject mode, final SubLObject operator, SubLObject args, SubLObject plist) {
        if (args == user_interaction_agenda.UNPROVIDED) {
            args = (SubLObject)user_interaction_agenda.NIL;
        }
        if (plist == user_interaction_agenda.UNPROVIDED) {
            plist = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject interaction = new_ui(v_agenda, mode, operator, args);
        ui_note_state(interaction, ui_state_plist_to_state(plist));
        ui_note_status(interaction, (SubLObject)user_interaction_agenda.$kw201$PENDING);
        uia_classify(v_agenda, interaction);
        return interaction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 62535L)
    public static SubLObject uia_act_new_sub_interaction(final SubLObject super_interaction, final SubLObject operator, SubLObject args, SubLObject plist) {
        if (args == user_interaction_agenda.UNPROVIDED) {
            args = (SubLObject)user_interaction_agenda.NIL;
        }
        if (plist == user_interaction_agenda.UNPROVIDED) {
            plist = (SubLObject)user_interaction_agenda.NIL;
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
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 63332L)
    public static SubLObject uia_act_add_dependent(final SubLObject v_agenda, final SubLObject parent, final SubLObject child) {
        ui_note_parent(child, parent);
        ui_add_child(parent, child);
        ui_note_status(parent, (SubLObject)user_interaction_agenda.$kw204$BLOCKED);
        return parent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 64030L)
    public static SubLObject uia_act_new_acknowledge_message(final SubLObject v_agenda, final SubLObject message) {
        return uia_act_new_interaction(v_agenda, (SubLObject)user_interaction_agenda.$kw120$MESSAGE, (SubLObject)user_interaction_agenda.$kw227$ACKNOWLEDGE_MESSAGE, (SubLObject)ConsesLow.list(message), (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 64182L)
    public static SubLObject uia_act_new_timed_acknowledge_message(final SubLObject v_agenda, final SubLObject message, final SubLObject secs) {
        return uia_act_new_interaction(v_agenda, (SubLObject)user_interaction_agenda.$kw120$MESSAGE, (SubLObject)user_interaction_agenda.$kw227$ACKNOWLEDGE_MESSAGE, (SubLObject)ConsesLow.list(message, secs), (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 64359L)
    public static SubLObject uia_act_new_message(final SubLObject v_agenda, final SubLObject message_string) {
        return uia_act_new_interaction(v_agenda, (SubLObject)user_interaction_agenda.$kw120$MESSAGE, (SubLObject)user_interaction_agenda.$kw120$MESSAGE, (SubLObject)ConsesLow.list(message_string), (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 64587L)
    public static SubLObject uia_act_new_quick_message(final SubLObject v_agenda, final SubLObject message_string) {
        return uia_act_new_timed_message(v_agenda, message_string, (SubLObject)user_interaction_agenda.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 64766L)
    public static SubLObject uia_act_new_timed_message(final SubLObject v_agenda, final SubLObject message_string, final SubLObject secs) {
        return uia_act_new_interaction(v_agenda, (SubLObject)user_interaction_agenda.$kw120$MESSAGE, (SubLObject)user_interaction_agenda.$kw120$MESSAGE, (SubLObject)ConsesLow.list(message_string, secs), (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 65036L)
    public static SubLObject uia_act_new_comment(final SubLObject v_agenda, final SubLObject comment_string) {
        return uia_act_new_interaction(v_agenda, (SubLObject)user_interaction_agenda.$kw124$COMMENT, (SubLObject)user_interaction_agenda.$kw120$MESSAGE, (SubLObject)ConsesLow.list(comment_string), (SubLObject)user_interaction_agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 70244L)
    public static SubLObject ui_request_p(final SubLObject v_object) {
        if (user_interaction_agenda.NIL != list_utilities.proper_list_p(v_object) && user_interaction_agenda.NIL != list_utilities.lengthGE(v_object, (SubLObject)user_interaction_agenda.TWO_INTEGER, (SubLObject)user_interaction_agenda.UNPROVIDED)) {
            SubLObject operator = (SubLObject)user_interaction_agenda.NIL;
            SubLObject action_type = (SubLObject)user_interaction_agenda.NIL;
            SubLObject signature = (SubLObject)user_interaction_agenda.NIL;
            SubLObject plist = (SubLObject)user_interaction_agenda.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)user_interaction_agenda.$list228);
            operator = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)user_interaction_agenda.$list228);
            action_type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)user_interaction_agenda.$list228);
            signature = current.first();
            current = (plist = current.rest());
            return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL != ui_signature_p(signature) && user_interaction_agenda.NIL != ui_operator_p(operator) && user_interaction_agenda.NIL != ui_action_type_p(action_type) && user_interaction_agenda.NIL != list_utilities.property_list_p(plist));
        }
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 71339L)
    public static SubLObject invalid_ui_signature() {
        return user_interaction_agenda.$invalid_ui_signature$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 71559L)
    public static SubLObject valid_ui_request_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(user_interaction_agenda.NIL != ui_request_p(v_object) && !v_object.equal(user_interaction_agenda.$invalid_ui_request$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 71690L)
    public static SubLObject ui_action_type_p(final SubLObject v_object) {
        return Types.keywordp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 71759L)
    public static SubLObject make_ui_request(final SubLObject interaction, final SubLObject action_type, final SubLObject plist) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        assert user_interaction_agenda.NIL != ui_action_type_p(action_type) : action_type;
        assert user_interaction_agenda.NIL != list_utilities.property_list_p(plist) : plist;
        return (SubLObject)ConsesLow.listS(ui_operator(interaction), action_type, ui_signature(interaction), plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 72038L)
    public static SubLObject make_empty_ui_request() {
        return (SubLObject)ConsesLow.listS((SubLObject)user_interaction_agenda.$kw114$EMPTY_AGENDA, (SubLObject)user_interaction_agenda.$kw233$SHOW, invalid_ui_signature(), (SubLObject)user_interaction_agenda.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 72146L)
    public static SubLObject make_invalid_ui_request() {
        return user_interaction_agenda.$invalid_ui_request$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 73760L)
    public static SubLObject make_ui_reply_with_interaction(final SubLObject interaction, final SubLObject action_type, final SubLObject plist) {
        assert user_interaction_agenda.NIL != user_interaction_p(interaction) : interaction;
        assert user_interaction_agenda.NIL != ui_action_type_p(action_type) : action_type;
        assert user_interaction_agenda.NIL != list_utilities.property_list_p(plist) : plist;
        return (SubLObject)ConsesLow.listS(ui_operator(interaction), action_type, (SubLObject)user_interaction_agenda.$kw234$SIGNATURE, ui_signature(interaction), plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 74998L)
    public static SubLObject make_ui_reply_with_agenda(final SubLObject v_agenda, final SubLObject operator, final SubLObject action_type, final SubLObject plist) {
        assert user_interaction_agenda.NIL != user_interaction_agenda_p(v_agenda) : v_agenda;
        assert user_interaction_agenda.NIL != ui_operator_p(operator) : operator;
        assert user_interaction_agenda.NIL != ui_action_type_p(action_type) : action_type;
        assert user_interaction_agenda.NIL != list_utilities.property_list_p(plist) : plist;
        return (SubLObject)ConsesLow.listS(operator, action_type, (SubLObject)user_interaction_agenda.$kw235$AGENDA_SIGNATURE, uia_signature(v_agenda), plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 75328L)
    public static SubLObject make_ui_reply(final SubLObject operator, final SubLObject action_type, final SubLObject plist) {
        assert user_interaction_agenda.NIL != ui_operator_p(operator) : operator;
        assert user_interaction_agenda.NIL != ui_action_type_p(action_type) : action_type;
        assert user_interaction_agenda.NIL != list_utilities.property_list_p(plist) : plist;
        return (SubLObject)ConsesLow.listS(operator, action_type, plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 80127L)
    public static SubLObject uia_glob(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, (SubLObject)user_interaction_agenda.$kw236$GLOB, (SubLObject)user_interaction_agenda.$kw237$UNINITIALIZED_GLOB);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 80380L)
    public static SubLObject uia_glob_reset(final SubLObject v_agenda) {
        final SubLObject v_glob = glob.new_glob(Symbols.symbol_function((SubLObject)user_interaction_agenda.EQUAL), (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
        glob.glob_note_owner(v_glob, v_agenda);
        uia_state_update(v_agenda, (SubLObject)user_interaction_agenda.$kw236$GLOB, v_glob);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 80545L)
    public static SubLObject uia_glob_add(final SubLObject v_agenda, final SubLObject v_object) {
        final SubLObject v_glob = uia_glob(v_agenda);
        return glob.glob_enter(v_glob, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 80662L)
    public static SubLObject uia_glob_remove(final SubLObject v_agenda, final SubLObject id) {
        final SubLObject v_glob = uia_glob(v_agenda);
        glob.glob_remove_id(v_glob, id);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 80784L)
    public static SubLObject uia_glob_lookup(final SubLObject v_agenda, final SubLObject id, SubLObject v_default) {
        if (v_default == user_interaction_agenda.UNPROVIDED) {
            v_default = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject v_glob = uia_glob(v_agenda);
        return glob.glob_lookup(v_glob, id, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 80923L)
    public static SubLObject uia_glob_pop(final SubLObject v_agenda, final SubLObject id, SubLObject v_default) {
        if (v_default == user_interaction_agenda.UNPROVIDED) {
            v_default = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject v_object = uia_glob_lookup(v_agenda, id, v_default);
        uia_glob_remove(v_agenda, id);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 81089L)
    public static SubLObject uia_glob_remove_by_id_string(final SubLObject v_agenda, final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
        return uia_glob_remove(v_agenda, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 81234L)
    public static SubLObject uia_glob_lookup_by_id_string(final SubLObject v_agenda, final SubLObject id_string, SubLObject v_default) {
        if (v_default == user_interaction_agenda.UNPROVIDED) {
            v_default = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
        return uia_glob_lookup(v_agenda, id, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/user-interaction-agenda.lisp", position = 81405L)
    public static SubLObject uia_glob_pop_by_id_string(final SubLObject v_agenda, final SubLObject id_string, SubLObject v_default) {
        if (v_default == user_interaction_agenda.UNPROVIDED) {
            v_default = (SubLObject)user_interaction_agenda.NIL;
        }
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED, (SubLObject)user_interaction_agenda.UNPROVIDED);
        return uia_glob_pop(v_agenda, id, v_default);
    }
    
    public static SubLObject declare_user_interaction_agenda_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.user_interaction_agenda", "with_uia_lock", "WITH-UIA-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "user_interaction_mode_p", "USER-INTERACTION-MODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "user_interaction_status_p", "USER-INTERACTION-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_operator_p", "UI-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "user_interaction_print_function_trampoline", "USER-INTERACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "user_interaction_p", "USER-INTERACTION-P", 1, 0, false);
        new $user_interaction_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_id", "UI-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_agenda", "UI-AGENDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_mode", "UI-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_status", "UI-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_start_time", "UI-START-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_finish_time", "UI-FINISH-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_parent_interaction", "UI-PARENT-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_child_interactions", "UI-CHILD-INTERACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_operator", "UI-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_args", "UI-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_result", "UI-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_state", "UI-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_id", "_CSETF-UI-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_agenda", "_CSETF-UI-AGENDA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_mode", "_CSETF-UI-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_status", "_CSETF-UI-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_start_time", "_CSETF-UI-START-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_finish_time", "_CSETF-UI-FINISH-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_parent_interaction", "_CSETF-UI-PARENT-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_child_interactions", "_CSETF-UI-CHILD-INTERACTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_operator", "_CSETF-UI-OPERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_args", "_CSETF-UI-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_result", "_CSETF-UI-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_ui_state", "_CSETF-UI-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "make_user_interaction", "MAKE-USER-INTERACTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "visit_defstruct_user_interaction", "VISIT-DEFSTRUCT-USER-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "visit_defstruct_object_user_interaction_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "sxhash_user_interaction_method", "SXHASH-USER-INTERACTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "print_user_interaction", "PRINT-USER-INTERACTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "new_ui", "NEW-UI", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_note_mode", "UI-NOTE-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_note_status", "UI-NOTE-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_note_start_time", "UI-NOTE-START-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_note_finish_time", "UI-NOTE-FINISH-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_note_parent", "UI-NOTE-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_add_child", "UI-ADD-CHILD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_note_result", "UI-NOTE-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_note_state", "UI-NOTE-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "user_interaction_agenda_print_function_trampoline", "USER-INTERACTION-AGENDA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "user_interaction_agenda_p", "USER-INTERACTION-AGENDA-P", 1, 0, false);
        new $user_interaction_agenda_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_id", "UIA-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_meta_agenda", "UIA-META-AGENDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_isg", "UIA-ISG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_index", "UIA-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_history", "UIA-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_undos", "UIA-UNDOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_messages", "UIA-MESSAGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_requirements", "UIA-REQUIREMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_relevant_suggestions", "UIA-RELEVANT-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_possible_suggestions", "UIA-POSSIBLE-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_comments", "UIA-COMMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_state", "UIA-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_id", "_CSETF-UIA-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_meta_agenda", "_CSETF-UIA-META-AGENDA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_isg", "_CSETF-UIA-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_index", "_CSETF-UIA-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_history", "_CSETF-UIA-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_undos", "_CSETF-UIA-UNDOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_messages", "_CSETF-UIA-MESSAGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_requirements", "_CSETF-UIA-REQUIREMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_relevant_suggestions", "_CSETF-UIA-RELEVANT-SUGGESTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_possible_suggestions", "_CSETF-UIA-POSSIBLE-SUGGESTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_comments", "_CSETF-UIA-COMMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uia_state", "_CSETF-UIA-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "make_user_interaction_agenda", "MAKE-USER-INTERACTION-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "visit_defstruct_user_interaction_agenda", "VISIT-DEFSTRUCT-USER-INTERACTION-AGENDA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "visit_defstruct_object_user_interaction_agenda_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-AGENDA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "sxhash_user_interaction_agenda_method", "SXHASH-USER-INTERACTION-AGENDA-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "print_user_interaction_agenda", "PRINT-USER-INTERACTION-AGENDA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "new_uia", "NEW-UIA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_reset", "UIA-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_find_by_id", "UIA-FIND-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_find_by_id_string", "UIA-FIND-BY-ID-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_some_interaction_p", "UIA-SOME-INTERACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_interaction_sequence", "UIA-INTERACTION-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_some_history_p", "UIA-SOME-HISTORY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_history_sequence", "UIA-HISTORY-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_some_undo_p", "UIA-SOME-UNDO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_undo_sequence", "UIA-UNDO-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_some_message_p", "UIA-SOME-MESSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_message_sequence", "UIA-MESSAGE-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_some_requirement_p", "UIA-SOME-REQUIREMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_requirement_sequence", "UIA-REQUIREMENT-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_some_relevant_suggestion_p", "UIA-SOME-RELEVANT-SUGGESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_relevant_suggestion_sequence", "UIA-RELEVANT-SUGGESTION-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_some_possible_suggestion_p", "UIA-SOME-POSSIBLE-SUGGESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_possible_suggestion_sequence", "UIA-POSSIBLE-SUGGESTION-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_some_comment_p", "UIA-SOME-COMMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_comment_sequence", "UIA-COMMENT-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_default_operator", "UIA-DEFAULT-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_initialized_p", "UIA-INITIALIZED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_to_index", "UIA-ADD-TO-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_to_history", "UIA-ADD-TO-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_clear_undos", "UIA-CLEAR-UNDOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_undo", "UIA-ADD-UNDO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_rem_undo", "UIA-REM-UNDO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_message", "UIA-ADD-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_rem_message", "UIA-REM-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_requirement", "UIA-ADD-REQUIREMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_rem_requirement", "UIA-REM-REQUIREMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_relevant_suggestion", "UIA-ADD-RELEVANT-SUGGESTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_rem_relevant_suggestion", "UIA-REM-RELEVANT-SUGGESTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_possible_suggestion", "UIA-ADD-POSSIBLE-SUGGESTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_rem_possible_suggestion", "UIA-REM-POSSIBLE-SUGGESTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_comment", "UIA-ADD-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_rem_comment", "UIA-REM-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_clear_comments", "UIA-CLEAR-COMMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_background_task_p", "UIA-BACKGROUND-TASK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_can_treat_comments_as_mumblingP", "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_cannot_treat_comments_as_mumbling", "UIA-CANNOT-TREAT-COMMENTS-AS-MUMBLING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_can_treat_comments_as_mumbling", "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_process_new_comment", "UIA-PROCESS-NEW-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_classify", "UIA-CLASSIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_declassify", "UIA-DECLASSIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_note_state", "UIA-NOTE-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_global_id_string", "UIA-GLOBAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_from_ids", "UIA-FROM-IDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_determine_superior_topic_identification", "UIA-DETERMINE-SUPERIOR-TOPIC-IDENTIFICATION", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.user_interaction_agenda", "do_uias", "DO-UIAS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.user_interaction_agenda", "do_uis", "DO-UIS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_language_parsing_mt", "UIA-LANGUAGE-PARSING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_language_parsing_mt_update", "UIA-LANGUAGE-PARSING-MT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_language_generation_mt", "UIA-LANGUAGE-GENERATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_language_generation_mt_update", "UIA-LANGUAGE-GENERATION-MT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_language_lexical_mt", "UIA-LANGUAGE-LEXICAL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_language_lexical_mt_update", "UIA-LANGUAGE-LEXICAL-MT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_domain_mt", "UIA-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_domain_mt_update", "UIA-DOMAIN-MT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_parsing_mt", "UIA-PARSING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_parsing_mt_update", "UIA-PARSING-MT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_generation_mt", "UIA-GENERATION-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_generation_mt_update", "UIA-GENERATION-MT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_all_interaction_mts", "UIA-ALL-INTERACTION-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_note_interaction_mt", "UIA-NOTE-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_domain_interaction_mt", "UIA-DOMAIN-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_domain_interaction_mt_update", "UIA-DOMAIN-INTERACTION-MT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_parsing_interaction_mt", "UIA-PARSING-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_parsing_interaction_mt_update", "UIA-PARSING-INTERACTION-MT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_generation_interaction_mt", "UIA-GENERATION-INTERACTION-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_generation_language_mt", "UIA-GENERATION-LANGUAGE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_generation_domain_mt", "UIA-GENERATION-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_generation_interaction_mt_update", "UIA-GENERATION-INTERACTION-MT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_lexical_interaction_mt", "UIA-LEXICAL-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_lexical_interaction_mt_update", "UIA-LEXICAL-INTERACTION-MT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_domain_interaction_mt", "UI-DOMAIN-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_parsing_interaction_mt", "UI-PARSING-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_generation_interaction_mt", "UI-GENERATION-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_generation_language_mt", "UI-GENERATION-LANGUAGE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_generation_domain_mt", "UI-GENERATION-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_lexical_interaction_mt", "UI-LEXICAL-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_ensure_scenario_interaction_mt", "UIA-ENSURE-SCENARIO-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "user_interaction_meta_agenda_print_function_trampoline", "USER-INTERACTION-META-AGENDA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "user_interaction_meta_agenda_p", "USER-INTERACTION-META-AGENDA-P", 1, 0, false);
        new $user_interaction_meta_agenda_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_id", "UIMA-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_isg", "UIMA-ISG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_index", "UIMA-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_open_agendas", "UIMA-OPEN-AGENDAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_current_agenda", "UIMA-CURRENT-AGENDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_state", "UIMA-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uima_id", "_CSETF-UIMA-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uima_isg", "_CSETF-UIMA-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uima_index", "_CSETF-UIMA-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uima_open_agendas", "_CSETF-UIMA-OPEN-AGENDAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uima_current_agenda", "_CSETF-UIMA-CURRENT-AGENDA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "_csetf_uima_state", "_CSETF-UIMA-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "make_user_interaction_meta_agenda", "MAKE-USER-INTERACTION-META-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "visit_defstruct_user_interaction_meta_agenda", "VISIT-DEFSTRUCT-USER-INTERACTION-META-AGENDA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "visit_defstruct_object_user_interaction_meta_agenda_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-META-AGENDA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "new_uima", "NEW-UIMA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_reset", "UIMA-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_find_by_id", "UIMA-FIND-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_find_by_id_string", "UIMA-FIND-BY-ID-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_some_open_agendas_p", "UIMA-SOME-OPEN-AGENDAS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_open_agendas_sequence", "UIMA-OPEN-AGENDAS-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_match_mt_to_agenda", "UIMA-MATCH-MT-TO-AGENDA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_add_to_index", "UIMA-ADD-TO-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_add_open_agenda", "UIMA-ADD-OPEN-AGENDA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_clear_current_agenda", "UIMA-CLEAR-CURRENT-AGENDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_note_current_agenda", "UIMA-NOTE-CURRENT-AGENDA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_note_state", "UIMA-NOTE-STATE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.user_interaction_agenda", "do_uimas", "DO-UIMAS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "system_uimma", "SYSTEM-UIMMA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uimma", "UIMMA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "new_uimma", "NEW-UIMMA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uimma_reset", "UIMMA-RESET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uimma_new_id", "UIMMA-NEW-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uimma_add_to_index", "UIMMA-ADD-TO-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uimma_find_by_id", "UIMMA-FIND-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uimma_default_locale", "UIMMA-DEFAULT-LOCALE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "set_uimma_default_locale", "SET-UIMMA-DEFAULT-LOCALE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uimma_default_generation_mt", "UIMMA-DEFAULT-GENERATION-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "set_uimma_default_generation_mt", "SET-UIMMA-DEFAULT-GENERATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uimma_default_domain_mt", "UIMMA-DEFAULT-DOMAIN-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "set_uimma_default_domain_mt", "SET-UIMMA-DEFAULT-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_meta_agenda", "UI-META-AGENDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_total_interaction_count", "UIA-TOTAL-INTERACTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_finished_interaction_count", "UIA-FINISHED-INTERACTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_state_plist_to_state", "UI-STATE-PLIST-TO-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_state_lookup", "UI-STATE-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_state_update", "UI-STATE-UPDATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_state_clear", "UI-STATE-CLEAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_state_clear_all", "UI-STATE-CLEAR-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_state_plist_to_state", "UIA-STATE-PLIST-TO-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_initialize_state", "UIA-INITIALIZE-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_state_lookup", "UIA-STATE-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_state_update", "UIA-STATE-UPDATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_state_clear", "UIA-STATE-CLEAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_state_clear_all", "UIA-STATE-CLEAR-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_state_plist_to_state", "UIMA-STATE-PLIST-TO-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_initialize_state", "UIMA-INITIALIZE-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_state_lookup", "UIMA-STATE-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_state_update", "UIMA-STATE-UPDATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_state_clear", "UIMA-STATE-CLEAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_state_clear_all", "UIMA-STATE-CLEAR-ALL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.user_interaction_agenda", "with_uia_memoization_state", "WITH-UIA-MEMOIZATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_memoization_state", "UIA-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_create_memoization_state", "UIA-CREATE-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_clear_memoization_state", "UIA-CLEAR-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_clear_memoization_state_for_function", "UIA-CLEAR-MEMOIZATION-STATE-FOR-FUNCTION", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.user_interaction_agenda", "with_uima_memoization_state", "WITH-UIMA-MEMOIZATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_memoization_state", "UIMA-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_create_memoization_state", "UIMA-CREATE-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_clear_memoization_state", "UIMA-CLEAR-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_ancestor_interactions", "UI-ANCESTOR-INTERACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_pending_descendant_interactions", "UI-PENDING-DESCENDANT-INTERACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_pending_descendants_recursive", "UI-PENDING-DESCENDANTS-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_sub_interactions", "UI-SUB-INTERACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_super_interaction", "UI-SUPER-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_add_sub_interaction", "UI-ADD-SUB-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_remove_sub_interaction", "UI-REMOVE-SUB-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_note_super_interaction", "UI-NOTE-SUPER-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_promote_to_child", "UIA-ACT-PROMOTE-TO-CHILD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_recompute_status", "UI-RECOMPUTE-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_alive_p", "UI-ALIVE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_next_action", "UIA-NEXT-ACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_note_user_selection", "UIA-NOTE-USER-SELECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_promote_interaction", "UIA-PROMOTE-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_best_pending_action", "UIA-BEST-PENDING-ACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_pending_action_p", "UIA-PENDING-ACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_first_pending_nonbackground_action", "UIA-FIRST-PENDING-NONBACKGROUND-ACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_signature_p", "UIA-SIGNATURE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_signature", "UIA-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "find_uia_by_signature", "FIND-UIA-BY-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_signature_p", "UI-SIGNATURE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_signature", "UI-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_signature_to_property_list", "UI-SIGNATURE-TO-PROPERTY-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "find_ui_by_signature", "FIND-UI-BY-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_schedule_frame_for_refresh", "UIA-SCHEDULE-FRAME-FOR-REFRESH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_get_frames_scheduled_for_refresh", "UIA-GET-FRAMES-SCHEDULED-FOR-REFRESH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_crumb_trail", "UIA-CRUMB-TRAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_create_new_crumb_trail", "UIA-CREATE-NEW-CRUMB-TRAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_update_term_crumb_trail", "UIA-UPDATE-TERM-CRUMB-TRAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_update_fact_crumb_trail", "UIA-UPDATE-FACT-CRUMB-TRAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_update_question_crumb_trail", "UIA-UPDATE-QUESTION-CRUMB-TRAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_crumb_trail_stale_assertionP", "UIA-CRUMB-TRAIL-STALE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_crumb_trail_el_sentenceP", "UIA-CRUMB-TRAIL-EL-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_crumb_trail_facts_equalP", "UIA-CRUMB-TRAIL-FACTS-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_get_term_crumb_trail", "UIA-GET-TERM-CRUMB-TRAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_get_fact_crumb_trail", "UIA-GET-FACT-CRUMB-TRAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_get_question_crumb_trail", "UIA-GET-QUESTION-CRUMB-TRAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_remove_crumb_trail_term", "UIA-REMOVE-CRUMB-TRAIL-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_remove_crumb_trail_fact", "UIA-REMOVE-CRUMB-TRAIL-FACT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_remove_crumb_trail_question", "UIA-REMOVE-CRUMB-TRAIL-QUESTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_shorten_term_crumb_trail", "UIA-SHORTEN-TERM-CRUMB-TRAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_shorten_fact_crumb_trail", "UIA-SHORTEN-FACT-CRUMB-TRAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_shorten_question_crumb_trail", "UIA-SHORTEN-QUESTION-CRUMB-TRAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_reset_crumb_trail", "UIA-RESET-CRUMB-TRAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_term_to_crumb_trail", "UIA-ADD-TERM-TO-CRUMB-TRAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_question_to_crumb_trail", "UIA-ADD-QUESTION-TO-CRUMB-TRAIL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_add_fact_to_crumb_trail", "UIA-ADD-FACT-TO-CRUMB-TRAIL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_crumb_trail_encapsulate_assertion", "UIA-CRUMB-TRAIL-ENCAPSULATE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_crumb_trail_encapsulate_sentence", "UIA-CRUMB-TRAIL-ENCAPSULATE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_get_terms_on_crumb_trail", "UIA-GET-TERMS-ON-CRUMB-TRAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_get_facts_on_crumb_trail", "UIA-GET-FACTS-ON-CRUMB-TRAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_get_questions_on_crumb_trail", "UIA-GET-QUESTIONS-ON-CRUMB-TRAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_anything_on_crumb_trailP", "UIA-ANYTHING-ON-CRUMB-TRAIL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_remove_term_from_crumb_trail", "UIA-REMOVE-TERM-FROM-CRUMB-TRAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_remove_fact_from_crumb_trail", "UIA-REMOVE-FACT-FROM-CRUMB-TRAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_remove_question_from_crumb_trail", "UIA-REMOVE-QUESTION-FROM-CRUMB-TRAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_shorten_crumb_trail_to", "UIA-SHORTEN-CRUMB-TRAIL-TO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_act_create", "UIMA-ACT-CREATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_act_focus", "UIMA-ACT-FOCUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_create", "UIA-ACT-CREATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_standard_initialization", "UIA-ACT-STANDARD-INITIALIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uima_act_reset", "UIMA-ACT-RESET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_reset", "UIA-ACT-RESET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_clear_memoization", "UIA-ACT-CLEAR-MEMOIZATION", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_launch_action_in_frame", "UIA-LAUNCH-ACTION-IN-FRAME");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_new_interaction", "UIA-ACT-NEW-INTERACTION", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_new_sub_interaction", "UIA-ACT-NEW-SUB-INTERACTION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_add_dependent", "UIA-ACT-ADD-DEPENDENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_new_acknowledge_message", "UIA-ACT-NEW-ACKNOWLEDGE-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_new_timed_acknowledge_message", "UIA-ACT-NEW-TIMED-ACKNOWLEDGE-MESSAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_new_message", "UIA-ACT-NEW-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_new_quick_message", "UIA-ACT-NEW-QUICK-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_new_timed_message", "UIA-ACT-NEW-TIMED-MESSAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_act_new_comment", "UIA-ACT-NEW-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_request_p", "UI-REQUEST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "invalid_ui_signature", "INVALID-UI-SIGNATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "valid_ui_request_p", "VALID-UI-REQUEST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "ui_action_type_p", "UI-ACTION-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "make_ui_request", "MAKE-UI-REQUEST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "make_empty_ui_request", "MAKE-EMPTY-UI-REQUEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "make_invalid_ui_request", "MAKE-INVALID-UI-REQUEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "make_ui_reply_with_interaction", "MAKE-UI-REPLY-WITH-INTERACTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "make_ui_reply_with_agenda", "MAKE-UI-REPLY-WITH-AGENDA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "make_ui_reply", "MAKE-UI-REPLY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_glob", "UIA-GLOB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_glob_reset", "UIA-GLOB-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_glob_add", "UIA-GLOB-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_glob_remove", "UIA-GLOB-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_glob_lookup", "UIA-GLOB-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_glob_pop", "UIA-GLOB-POP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_glob_remove_by_id_string", "UIA-GLOB-REMOVE-BY-ID-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_glob_lookup_by_id_string", "UIA-GLOB-LOOKUP-BY-ID-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.user_interaction_agenda", "uia_glob_pop_by_id_string", "UIA-GLOB-POP-BY-ID-STRING", 2, 1, false);
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    public static SubLObject init_user_interaction_agenda_file() {
        user_interaction_agenda.$uia_lock$ = SubLFiles.deflexical("*UIA-LOCK*", (user_interaction_agenda.NIL != Symbols.boundp((SubLObject)user_interaction_agenda.$sym0$_UIA_LOCK_)) ? user_interaction_agenda.$uia_lock$.getGlobalValue() : Locks.make_lock((SubLObject)user_interaction_agenda.$str1$User_Interaction_Agenda_lock));
        user_interaction_agenda.$user_interaction_modes$ = SubLFiles.deflexical("*USER-INTERACTION-MODES*", (SubLObject)user_interaction_agenda.$list4);
        user_interaction_agenda.$user_interaction_statuses$ = SubLFiles.deflexical("*USER-INTERACTION-STATUSES*", (SubLObject)user_interaction_agenda.$list5);
        user_interaction_agenda.$dtp_user_interaction$ = SubLFiles.defconstant("*DTP-USER-INTERACTION*", (SubLObject)user_interaction_agenda.$sym6$USER_INTERACTION);
        user_interaction_agenda.$dtp_user_interaction_agenda$ = SubLFiles.defconstant("*DTP-USER-INTERACTION-AGENDA*", (SubLObject)user_interaction_agenda.$sym65$USER_INTERACTION_AGENDA);
        user_interaction_agenda.$uia_can_treat_comments_as_mumblingP$ = SubLFiles.defparameter("*UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?*", (SubLObject)user_interaction_agenda.T);
        user_interaction_agenda.$dtp_user_interaction_meta_agenda$ = SubLFiles.defconstant("*DTP-USER-INTERACTION-META-AGENDA*", (SubLObject)user_interaction_agenda.$sym151$USER_INTERACTION_META_AGENDA);
        user_interaction_agenda.$uimma$ = SubLFiles.deflexical("*UIMMA*", (SubLObject)((user_interaction_agenda.NIL != Symbols.boundp((SubLObject)user_interaction_agenda.$sym185$_UIMMA_)) ? user_interaction_agenda.$uimma$.getGlobalValue() : user_interaction_agenda.NIL));
        user_interaction_agenda.$uimma_default_locale$ = SubLFiles.deflexical("*UIMMA-DEFAULT-LOCALE*", (user_interaction_agenda.NIL != Symbols.boundp((SubLObject)user_interaction_agenda.$sym186$_UIMMA_DEFAULT_LOCALE_)) ? user_interaction_agenda.$uimma_default_locale$.getGlobalValue() : ((user_interaction_agenda.NIL != system_info.cycorp_execution_context_p()) ? user_interaction_agenda.$const187$EnglishLanguage : user_interaction_agenda.$const187$EnglishLanguage));
        user_interaction_agenda.$uimma_default_generation_mt$ = SubLFiles.deflexical("*UIMMA-DEFAULT-GENERATION-MT*", (user_interaction_agenda.NIL != Symbols.boundp((SubLObject)user_interaction_agenda.$sym188$_UIMMA_DEFAULT_GENERATION_MT_)) ? user_interaction_agenda.$uimma_default_generation_mt$.getGlobalValue() : user_interaction_agenda.$const148$EnglishParaphraseMt);
        user_interaction_agenda.$uimma_default_domain_mt$ = SubLFiles.deflexical("*UIMMA-DEFAULT-DOMAIN-MT*", (user_interaction_agenda.NIL != Symbols.boundp((SubLObject)user_interaction_agenda.$sym189$_UIMMA_DEFAULT_DOMAIN_MT_)) ? user_interaction_agenda.$uimma_default_domain_mt$.getGlobalValue() : user_interaction_agenda.$const190$EverythingPSC);
        user_interaction_agenda.$uia_frameless_environmentP$ = SubLFiles.defparameter("*UIA-FRAMELESS-ENVIRONMENT?*", (SubLObject)user_interaction_agenda.NIL);
        user_interaction_agenda.$invalid_ui_signature$ = SubLFiles.deflexical("*INVALID-UI-SIGNATURE*", (SubLObject)user_interaction_agenda.$list229);
        user_interaction_agenda.$invalid_ui_request$ = SubLFiles.deflexical("*INVALID-UI-REQUEST*", (SubLObject)ConsesLow.list((SubLObject)user_interaction_agenda.$kw230$UNKNOWN_INTERACTION, (SubLObject)user_interaction_agenda.$kw231$UNKNOWN_ACTION, invalid_ui_signature()));
        return (SubLObject)user_interaction_agenda.NIL;
    }
    
    public static SubLObject setup_user_interaction_agenda_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)user_interaction_agenda.$sym0$_UIA_LOCK_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction$.getGlobalValue(), Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym13$USER_INTERACTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)user_interaction_agenda.$list14);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym15$UI_ID, (SubLObject)user_interaction_agenda.$sym16$_CSETF_UI_ID);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym17$UI_AGENDA, (SubLObject)user_interaction_agenda.$sym18$_CSETF_UI_AGENDA);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym19$UI_MODE, (SubLObject)user_interaction_agenda.$sym20$_CSETF_UI_MODE);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym21$UI_STATUS, (SubLObject)user_interaction_agenda.$sym22$_CSETF_UI_STATUS);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym23$UI_START_TIME, (SubLObject)user_interaction_agenda.$sym24$_CSETF_UI_START_TIME);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym25$UI_FINISH_TIME, (SubLObject)user_interaction_agenda.$sym26$_CSETF_UI_FINISH_TIME);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym27$UI_PARENT_INTERACTION, (SubLObject)user_interaction_agenda.$sym28$_CSETF_UI_PARENT_INTERACTION);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym29$UI_CHILD_INTERACTIONS, (SubLObject)user_interaction_agenda.$sym30$_CSETF_UI_CHILD_INTERACTIONS);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym31$UI_OPERATOR, (SubLObject)user_interaction_agenda.$sym32$_CSETF_UI_OPERATOR);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym33$UI_ARGS, (SubLObject)user_interaction_agenda.$sym34$_CSETF_UI_ARGS);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym35$UI_RESULT, (SubLObject)user_interaction_agenda.$sym36$_CSETF_UI_RESULT);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym37$UI_STATE, (SubLObject)user_interaction_agenda.$sym38$_CSETF_UI_STATE);
        Equality.identity((SubLObject)user_interaction_agenda.$sym6$USER_INTERACTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction$.getGlobalValue(), Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym56$VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction$.getGlobalValue(), Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym57$SXHASH_USER_INTERACTION_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction_agenda$.getGlobalValue(), Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym71$USER_INTERACTION_AGENDA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)user_interaction_agenda.$list72);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym73$UIA_ID, (SubLObject)user_interaction_agenda.$sym74$_CSETF_UIA_ID);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym75$UIA_META_AGENDA, (SubLObject)user_interaction_agenda.$sym76$_CSETF_UIA_META_AGENDA);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym77$UIA_ISG, (SubLObject)user_interaction_agenda.$sym78$_CSETF_UIA_ISG);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym79$UIA_INDEX, (SubLObject)user_interaction_agenda.$sym80$_CSETF_UIA_INDEX);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym81$UIA_HISTORY, (SubLObject)user_interaction_agenda.$sym82$_CSETF_UIA_HISTORY);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym83$UIA_UNDOS, (SubLObject)user_interaction_agenda.$sym84$_CSETF_UIA_UNDOS);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym85$UIA_MESSAGES, (SubLObject)user_interaction_agenda.$sym86$_CSETF_UIA_MESSAGES);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym87$UIA_REQUIREMENTS, (SubLObject)user_interaction_agenda.$sym88$_CSETF_UIA_REQUIREMENTS);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym89$UIA_RELEVANT_SUGGESTIONS, (SubLObject)user_interaction_agenda.$sym90$_CSETF_UIA_RELEVANT_SUGGESTIONS);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym91$UIA_POSSIBLE_SUGGESTIONS, (SubLObject)user_interaction_agenda.$sym92$_CSETF_UIA_POSSIBLE_SUGGESTIONS);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym93$UIA_COMMENTS, (SubLObject)user_interaction_agenda.$sym94$_CSETF_UIA_COMMENTS);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym95$UIA_STATE, (SubLObject)user_interaction_agenda.$sym96$_CSETF_UIA_STATE);
        Equality.identity((SubLObject)user_interaction_agenda.$sym65$USER_INTERACTION_AGENDA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction_agenda$.getGlobalValue(), Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym108$VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_AGENDA_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction_agenda$.getGlobalValue(), Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym109$SXHASH_USER_INTERACTION_AGENDA_METHOD));
        utilities_macros.register_html_state_variable((SubLObject)user_interaction_agenda.$sym118$_UIA_CAN_TREAT_COMMENTS_AS_MUMBLING__);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction_meta_agenda$.getGlobalValue(), Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym157$USER_INTERACTION_META_AGENDA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)user_interaction_agenda.$list158);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym159$UIMA_ID, (SubLObject)user_interaction_agenda.$sym160$_CSETF_UIMA_ID);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym161$UIMA_ISG, (SubLObject)user_interaction_agenda.$sym162$_CSETF_UIMA_ISG);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym163$UIMA_INDEX, (SubLObject)user_interaction_agenda.$sym164$_CSETF_UIMA_INDEX);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym165$UIMA_OPEN_AGENDAS, (SubLObject)user_interaction_agenda.$sym166$_CSETF_UIMA_OPEN_AGENDAS);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym167$UIMA_CURRENT_AGENDA, (SubLObject)user_interaction_agenda.$sym168$_CSETF_UIMA_CURRENT_AGENDA);
        Structures.def_csetf((SubLObject)user_interaction_agenda.$sym169$UIMA_STATE, (SubLObject)user_interaction_agenda.$sym170$_CSETF_UIMA_STATE);
        Equality.identity((SubLObject)user_interaction_agenda.$sym151$USER_INTERACTION_META_AGENDA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction_meta_agenda$.getGlobalValue(), Symbols.symbol_function((SubLObject)user_interaction_agenda.$sym174$VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_META_AGENDA_METHOD));
        access_macros.register_macro_helper((SubLObject)user_interaction_agenda.$sym183$SYSTEM_UIMMA, (SubLObject)user_interaction_agenda.$sym184$DO_UIMAS);
        subl_macro_promotions.declare_defglobal((SubLObject)user_interaction_agenda.$sym185$_UIMMA_);
        if (user_interaction_agenda.NIL == user_interaction_agenda.$uimma$.getGlobalValue()) {
            uimma_reset();
        }
        subl_macro_promotions.declare_defglobal((SubLObject)user_interaction_agenda.$sym186$_UIMMA_DEFAULT_LOCALE_);
        subl_macro_promotions.declare_defglobal((SubLObject)user_interaction_agenda.$sym188$_UIMMA_DEFAULT_GENERATION_MT_);
        subl_macro_promotions.declare_defglobal((SubLObject)user_interaction_agenda.$sym189$_UIMMA_DEFAULT_DOMAIN_MT_);
        return (SubLObject)user_interaction_agenda.NIL;
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
        me = (SubLFile)new user_interaction_agenda();
        user_interaction_agenda.$uia_lock$ = null;
        user_interaction_agenda.$user_interaction_modes$ = null;
        user_interaction_agenda.$user_interaction_statuses$ = null;
        user_interaction_agenda.$dtp_user_interaction$ = null;
        user_interaction_agenda.$dtp_user_interaction_agenda$ = null;
        user_interaction_agenda.$uia_can_treat_comments_as_mumblingP$ = null;
        user_interaction_agenda.$dtp_user_interaction_meta_agenda$ = null;
        user_interaction_agenda.$uimma$ = null;
        user_interaction_agenda.$uimma_default_locale$ = null;
        user_interaction_agenda.$uimma_default_generation_mt$ = null;
        user_interaction_agenda.$uimma_default_domain_mt$ = null;
        user_interaction_agenda.$uia_frameless_environmentP$ = null;
        user_interaction_agenda.$invalid_ui_signature$ = null;
        user_interaction_agenda.$invalid_ui_request$ = null;
        $sym0$_UIA_LOCK_ = SubLObjectFactory.makeSymbol("*UIA-LOCK*");
        $str1$User_Interaction_Agenda_lock = SubLObjectFactory.makeString("User Interaction Agenda lock");
        $sym2$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UIA-LOCK*"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNDO"), (SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED"), (SubLObject)SubLObjectFactory.makeKeyword("RELEVANT"), (SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("PENDING"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETED"), (SubLObject)SubLObjectFactory.makeKeyword("REJECTED"), (SubLObject)SubLObjectFactory.makeKeyword("INVALIDATED"));
        $sym6$USER_INTERACTION = SubLObjectFactory.makeSymbol("USER-INTERACTION");
        $sym7$USER_INTERACTION_P = SubLObjectFactory.makeSymbol("USER-INTERACTION-P");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("AGENDA"), SubLObjectFactory.makeSymbol("MODE"), SubLObjectFactory.makeSymbol("STATUS"), SubLObjectFactory.makeSymbol("START-TIME"), SubLObjectFactory.makeSymbol("FINISH-TIME"), SubLObjectFactory.makeSymbol("PARENT-INTERACTION"), SubLObjectFactory.makeSymbol("CHILD-INTERACTIONS"), SubLObjectFactory.makeSymbol("OPERATOR"), SubLObjectFactory.makeSymbol("ARGS"), SubLObjectFactory.makeSymbol("RESULT"), SubLObjectFactory.makeSymbol("STATE") });
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("AGENDA"), SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("STATUS"), SubLObjectFactory.makeKeyword("START-TIME"), SubLObjectFactory.makeKeyword("FINISH-TIME"), SubLObjectFactory.makeKeyword("PARENT-INTERACTION"), SubLObjectFactory.makeKeyword("CHILD-INTERACTIONS"), SubLObjectFactory.makeKeyword("OPERATOR"), SubLObjectFactory.makeKeyword("ARGS"), SubLObjectFactory.makeKeyword("RESULT"), SubLObjectFactory.makeKeyword("STATE") });
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("UI-ID"), SubLObjectFactory.makeSymbol("UI-AGENDA"), SubLObjectFactory.makeSymbol("UI-MODE"), SubLObjectFactory.makeSymbol("UI-STATUS"), SubLObjectFactory.makeSymbol("UI-START-TIME"), SubLObjectFactory.makeSymbol("UI-FINISH-TIME"), SubLObjectFactory.makeSymbol("UI-PARENT-INTERACTION"), SubLObjectFactory.makeSymbol("UI-CHILD-INTERACTIONS"), SubLObjectFactory.makeSymbol("UI-OPERATOR"), SubLObjectFactory.makeSymbol("UI-ARGS"), SubLObjectFactory.makeSymbol("UI-RESULT"), SubLObjectFactory.makeSymbol("UI-STATE") });
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-UI-ID"), SubLObjectFactory.makeSymbol("_CSETF-UI-AGENDA"), SubLObjectFactory.makeSymbol("_CSETF-UI-MODE"), SubLObjectFactory.makeSymbol("_CSETF-UI-STATUS"), SubLObjectFactory.makeSymbol("_CSETF-UI-START-TIME"), SubLObjectFactory.makeSymbol("_CSETF-UI-FINISH-TIME"), SubLObjectFactory.makeSymbol("_CSETF-UI-PARENT-INTERACTION"), SubLObjectFactory.makeSymbol("_CSETF-UI-CHILD-INTERACTIONS"), SubLObjectFactory.makeSymbol("_CSETF-UI-OPERATOR"), SubLObjectFactory.makeSymbol("_CSETF-UI-ARGS"), SubLObjectFactory.makeSymbol("_CSETF-UI-RESULT"), SubLObjectFactory.makeSymbol("_CSETF-UI-STATE") });
        $sym12$PRINT_USER_INTERACTION = SubLObjectFactory.makeSymbol("PRINT-USER-INTERACTION");
        $sym13$USER_INTERACTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("USER-INTERACTION-PRINT-FUNCTION-TRAMPOLINE");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("USER-INTERACTION-P"));
        $sym15$UI_ID = SubLObjectFactory.makeSymbol("UI-ID");
        $sym16$_CSETF_UI_ID = SubLObjectFactory.makeSymbol("_CSETF-UI-ID");
        $sym17$UI_AGENDA = SubLObjectFactory.makeSymbol("UI-AGENDA");
        $sym18$_CSETF_UI_AGENDA = SubLObjectFactory.makeSymbol("_CSETF-UI-AGENDA");
        $sym19$UI_MODE = SubLObjectFactory.makeSymbol("UI-MODE");
        $sym20$_CSETF_UI_MODE = SubLObjectFactory.makeSymbol("_CSETF-UI-MODE");
        $sym21$UI_STATUS = SubLObjectFactory.makeSymbol("UI-STATUS");
        $sym22$_CSETF_UI_STATUS = SubLObjectFactory.makeSymbol("_CSETF-UI-STATUS");
        $sym23$UI_START_TIME = SubLObjectFactory.makeSymbol("UI-START-TIME");
        $sym24$_CSETF_UI_START_TIME = SubLObjectFactory.makeSymbol("_CSETF-UI-START-TIME");
        $sym25$UI_FINISH_TIME = SubLObjectFactory.makeSymbol("UI-FINISH-TIME");
        $sym26$_CSETF_UI_FINISH_TIME = SubLObjectFactory.makeSymbol("_CSETF-UI-FINISH-TIME");
        $sym27$UI_PARENT_INTERACTION = SubLObjectFactory.makeSymbol("UI-PARENT-INTERACTION");
        $sym28$_CSETF_UI_PARENT_INTERACTION = SubLObjectFactory.makeSymbol("_CSETF-UI-PARENT-INTERACTION");
        $sym29$UI_CHILD_INTERACTIONS = SubLObjectFactory.makeSymbol("UI-CHILD-INTERACTIONS");
        $sym30$_CSETF_UI_CHILD_INTERACTIONS = SubLObjectFactory.makeSymbol("_CSETF-UI-CHILD-INTERACTIONS");
        $sym31$UI_OPERATOR = SubLObjectFactory.makeSymbol("UI-OPERATOR");
        $sym32$_CSETF_UI_OPERATOR = SubLObjectFactory.makeSymbol("_CSETF-UI-OPERATOR");
        $sym33$UI_ARGS = SubLObjectFactory.makeSymbol("UI-ARGS");
        $sym34$_CSETF_UI_ARGS = SubLObjectFactory.makeSymbol("_CSETF-UI-ARGS");
        $sym35$UI_RESULT = SubLObjectFactory.makeSymbol("UI-RESULT");
        $sym36$_CSETF_UI_RESULT = SubLObjectFactory.makeSymbol("_CSETF-UI-RESULT");
        $sym37$UI_STATE = SubLObjectFactory.makeSymbol("UI-STATE");
        $sym38$_CSETF_UI_STATE = SubLObjectFactory.makeSymbol("_CSETF-UI-STATE");
        $kw39$ID = SubLObjectFactory.makeKeyword("ID");
        $kw40$AGENDA = SubLObjectFactory.makeKeyword("AGENDA");
        $kw41$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw42$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $kw43$START_TIME = SubLObjectFactory.makeKeyword("START-TIME");
        $kw44$FINISH_TIME = SubLObjectFactory.makeKeyword("FINISH-TIME");
        $kw45$PARENT_INTERACTION = SubLObjectFactory.makeKeyword("PARENT-INTERACTION");
        $kw46$CHILD_INTERACTIONS = SubLObjectFactory.makeKeyword("CHILD-INTERACTIONS");
        $kw47$OPERATOR = SubLObjectFactory.makeKeyword("OPERATOR");
        $kw48$ARGS = SubLObjectFactory.makeKeyword("ARGS");
        $kw49$RESULT = SubLObjectFactory.makeKeyword("RESULT");
        $kw50$STATE = SubLObjectFactory.makeKeyword("STATE");
        $str51$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw52$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym53$MAKE_USER_INTERACTION = SubLObjectFactory.makeSymbol("MAKE-USER-INTERACTION");
        $kw54$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw55$END = SubLObjectFactory.makeKeyword("END");
        $sym56$VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-METHOD");
        $sym57$SXHASH_USER_INTERACTION_METHOD = SubLObjectFactory.makeSymbol("SXHASH-USER-INTERACTION-METHOD");
        $str58$__UI__A__A__S_ = SubLObjectFactory.makeString("#<UI ~A:~A:~S>");
        $sym59$USER_INTERACTION_AGENDA_P = SubLObjectFactory.makeSymbol("USER-INTERACTION-AGENDA-P");
        $sym60$USER_INTERACTION_MODE_P = SubLObjectFactory.makeSymbol("USER-INTERACTION-MODE-P");
        $sym61$UI_OPERATOR_P = SubLObjectFactory.makeSymbol("UI-OPERATOR-P");
        $sym62$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym63$USER_INTERACTION_STATUS_P = SubLObjectFactory.makeSymbol("USER-INTERACTION-STATUS-P");
        $sym64$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym65$USER_INTERACTION_AGENDA = SubLObjectFactory.makeSymbol("USER-INTERACTION-AGENDA");
        $list66 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("META-AGENDA"), SubLObjectFactory.makeSymbol("ISG"), SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("HISTORY"), SubLObjectFactory.makeSymbol("UNDOS"), SubLObjectFactory.makeSymbol("MESSAGES"), SubLObjectFactory.makeSymbol("REQUIREMENTS"), SubLObjectFactory.makeSymbol("RELEVANT-SUGGESTIONS"), SubLObjectFactory.makeSymbol("POSSIBLE-SUGGESTIONS"), SubLObjectFactory.makeSymbol("COMMENTS"), SubLObjectFactory.makeSymbol("STATE") });
        $list67 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("META-AGENDA"), SubLObjectFactory.makeKeyword("ISG"), SubLObjectFactory.makeKeyword("INDEX"), SubLObjectFactory.makeKeyword("HISTORY"), SubLObjectFactory.makeKeyword("UNDOS"), SubLObjectFactory.makeKeyword("MESSAGES"), SubLObjectFactory.makeKeyword("REQUIREMENTS"), SubLObjectFactory.makeKeyword("RELEVANT-SUGGESTIONS"), SubLObjectFactory.makeKeyword("POSSIBLE-SUGGESTIONS"), SubLObjectFactory.makeKeyword("COMMENTS"), SubLObjectFactory.makeKeyword("STATE") });
        $list68 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("UIA-ID"), SubLObjectFactory.makeSymbol("UIA-META-AGENDA"), SubLObjectFactory.makeSymbol("UIA-ISG"), SubLObjectFactory.makeSymbol("UIA-INDEX"), SubLObjectFactory.makeSymbol("UIA-HISTORY"), SubLObjectFactory.makeSymbol("UIA-UNDOS"), SubLObjectFactory.makeSymbol("UIA-MESSAGES"), SubLObjectFactory.makeSymbol("UIA-REQUIREMENTS"), SubLObjectFactory.makeSymbol("UIA-RELEVANT-SUGGESTIONS"), SubLObjectFactory.makeSymbol("UIA-POSSIBLE-SUGGESTIONS"), SubLObjectFactory.makeSymbol("UIA-COMMENTS"), SubLObjectFactory.makeSymbol("UIA-STATE") });
        $list69 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-UIA-ID"), SubLObjectFactory.makeSymbol("_CSETF-UIA-META-AGENDA"), SubLObjectFactory.makeSymbol("_CSETF-UIA-ISG"), SubLObjectFactory.makeSymbol("_CSETF-UIA-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-UIA-HISTORY"), SubLObjectFactory.makeSymbol("_CSETF-UIA-UNDOS"), SubLObjectFactory.makeSymbol("_CSETF-UIA-MESSAGES"), SubLObjectFactory.makeSymbol("_CSETF-UIA-REQUIREMENTS"), SubLObjectFactory.makeSymbol("_CSETF-UIA-RELEVANT-SUGGESTIONS"), SubLObjectFactory.makeSymbol("_CSETF-UIA-POSSIBLE-SUGGESTIONS"), SubLObjectFactory.makeSymbol("_CSETF-UIA-COMMENTS"), SubLObjectFactory.makeSymbol("_CSETF-UIA-STATE") });
        $sym70$PRINT_USER_INTERACTION_AGENDA = SubLObjectFactory.makeSymbol("PRINT-USER-INTERACTION-AGENDA");
        $sym71$USER_INTERACTION_AGENDA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("USER-INTERACTION-AGENDA-PRINT-FUNCTION-TRAMPOLINE");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("USER-INTERACTION-AGENDA-P"));
        $sym73$UIA_ID = SubLObjectFactory.makeSymbol("UIA-ID");
        $sym74$_CSETF_UIA_ID = SubLObjectFactory.makeSymbol("_CSETF-UIA-ID");
        $sym75$UIA_META_AGENDA = SubLObjectFactory.makeSymbol("UIA-META-AGENDA");
        $sym76$_CSETF_UIA_META_AGENDA = SubLObjectFactory.makeSymbol("_CSETF-UIA-META-AGENDA");
        $sym77$UIA_ISG = SubLObjectFactory.makeSymbol("UIA-ISG");
        $sym78$_CSETF_UIA_ISG = SubLObjectFactory.makeSymbol("_CSETF-UIA-ISG");
        $sym79$UIA_INDEX = SubLObjectFactory.makeSymbol("UIA-INDEX");
        $sym80$_CSETF_UIA_INDEX = SubLObjectFactory.makeSymbol("_CSETF-UIA-INDEX");
        $sym81$UIA_HISTORY = SubLObjectFactory.makeSymbol("UIA-HISTORY");
        $sym82$_CSETF_UIA_HISTORY = SubLObjectFactory.makeSymbol("_CSETF-UIA-HISTORY");
        $sym83$UIA_UNDOS = SubLObjectFactory.makeSymbol("UIA-UNDOS");
        $sym84$_CSETF_UIA_UNDOS = SubLObjectFactory.makeSymbol("_CSETF-UIA-UNDOS");
        $sym85$UIA_MESSAGES = SubLObjectFactory.makeSymbol("UIA-MESSAGES");
        $sym86$_CSETF_UIA_MESSAGES = SubLObjectFactory.makeSymbol("_CSETF-UIA-MESSAGES");
        $sym87$UIA_REQUIREMENTS = SubLObjectFactory.makeSymbol("UIA-REQUIREMENTS");
        $sym88$_CSETF_UIA_REQUIREMENTS = SubLObjectFactory.makeSymbol("_CSETF-UIA-REQUIREMENTS");
        $sym89$UIA_RELEVANT_SUGGESTIONS = SubLObjectFactory.makeSymbol("UIA-RELEVANT-SUGGESTIONS");
        $sym90$_CSETF_UIA_RELEVANT_SUGGESTIONS = SubLObjectFactory.makeSymbol("_CSETF-UIA-RELEVANT-SUGGESTIONS");
        $sym91$UIA_POSSIBLE_SUGGESTIONS = SubLObjectFactory.makeSymbol("UIA-POSSIBLE-SUGGESTIONS");
        $sym92$_CSETF_UIA_POSSIBLE_SUGGESTIONS = SubLObjectFactory.makeSymbol("_CSETF-UIA-POSSIBLE-SUGGESTIONS");
        $sym93$UIA_COMMENTS = SubLObjectFactory.makeSymbol("UIA-COMMENTS");
        $sym94$_CSETF_UIA_COMMENTS = SubLObjectFactory.makeSymbol("_CSETF-UIA-COMMENTS");
        $sym95$UIA_STATE = SubLObjectFactory.makeSymbol("UIA-STATE");
        $sym96$_CSETF_UIA_STATE = SubLObjectFactory.makeSymbol("_CSETF-UIA-STATE");
        $kw97$META_AGENDA = SubLObjectFactory.makeKeyword("META-AGENDA");
        $kw98$ISG = SubLObjectFactory.makeKeyword("ISG");
        $kw99$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw100$HISTORY = SubLObjectFactory.makeKeyword("HISTORY");
        $kw101$UNDOS = SubLObjectFactory.makeKeyword("UNDOS");
        $kw102$MESSAGES = SubLObjectFactory.makeKeyword("MESSAGES");
        $kw103$REQUIREMENTS = SubLObjectFactory.makeKeyword("REQUIREMENTS");
        $kw104$RELEVANT_SUGGESTIONS = SubLObjectFactory.makeKeyword("RELEVANT-SUGGESTIONS");
        $kw105$POSSIBLE_SUGGESTIONS = SubLObjectFactory.makeKeyword("POSSIBLE-SUGGESTIONS");
        $kw106$COMMENTS = SubLObjectFactory.makeKeyword("COMMENTS");
        $sym107$MAKE_USER_INTERACTION_AGENDA = SubLObjectFactory.makeSymbol("MAKE-USER-INTERACTION-AGENDA");
        $sym108$VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_AGENDA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-AGENDA-METHOD");
        $sym109$SXHASH_USER_INTERACTION_AGENDA_METHOD = SubLObjectFactory.makeSymbol("SXHASH-USER-INTERACTION-AGENDA-METHOD");
        $str110$__UIA__A_ = SubLObjectFactory.makeString("#<UIA ~A>");
        $sym111$USER_INTERACTION_META_AGENDA_P = SubLObjectFactory.makeSymbol("USER-INTERACTION-META-AGENDA-P");
        $sym112$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym113$_ = SubLObjectFactory.makeSymbol("<");
        $kw114$EMPTY_AGENDA = SubLObjectFactory.makeKeyword("EMPTY-AGENDA");
        $kw115$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw116$SETUP_COMPLETE = SubLObjectFactory.makeKeyword("SETUP-COMPLETE");
        $kw117$THINKING = SubLObjectFactory.makeKeyword("THINKING");
        $sym118$_UIA_CAN_TREAT_COMMENTS_AS_MUMBLING__ = SubLObjectFactory.makeSymbol("*UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?*");
        $kw119$UNDO = SubLObjectFactory.makeKeyword("UNDO");
        $kw120$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $kw121$REQUIRED = SubLObjectFactory.makeKeyword("REQUIRED");
        $kw122$RELEVANT = SubLObjectFactory.makeKeyword("RELEVANT");
        $kw123$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $kw124$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $str125$_S__S = SubLObjectFactory.makeString("~S ~S");
        $kw126$SUPERIOR_TOPIC = SubLObjectFactory.makeKeyword("SUPERIOR-TOPIC");
        $const127$mainFocusOfUIASession = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mainFocusOfUIASession"));
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOPIC"));
        $kw129$TOPIC = SubLObjectFactory.makeKeyword("TOPIC");
        $list130 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UIA"), (SubLObject)SubLObjectFactory.makeSymbol("UIMA")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym131$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym132$UIMA_OPEN_AGENDAS_SEQUENCE = SubLObjectFactory.makeSymbol("UIMA-OPEN-AGENDAS-SEQUENCE");
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UI"), (SubLObject)SubLObjectFactory.makeSymbol("UIA")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym134$UIA_INTERACTION_SEQUENCE = SubLObjectFactory.makeSymbol("UIA-INTERACTION-SEQUENCE");
        $kw135$LANGUAGE_PARSING_MT = SubLObjectFactory.makeKeyword("LANGUAGE-PARSING-MT");
        $kw136$UNDETERMINED = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $kw137$LANGUAGE_GENERATION_MT = SubLObjectFactory.makeKeyword("LANGUAGE-GENERATION-MT");
        $kw138$LANGUAGE_LEXICAL_MT = SubLObjectFactory.makeKeyword("LANGUAGE-LEXICAL-MT");
        $kw139$DOMAIN_MT = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $kw140$PARSING_MT = SubLObjectFactory.makeKeyword("PARSING-MT");
        $kw141$GENERATION_MT = SubLObjectFactory.makeKeyword("GENERATION-MT");
        $kw142$ALL_INTERACTION_MTS = SubLObjectFactory.makeKeyword("ALL-INTERACTION-MTS");
        $kw143$DOMAIN_INTERACTION_MT = SubLObjectFactory.makeKeyword("DOMAIN-INTERACTION-MT");
        $kw144$PARSING_INTERACTION_MT = SubLObjectFactory.makeKeyword("PARSING-INTERACTION-MT");
        $kw145$GENERATION_INTERACTION_MT = SubLObjectFactory.makeKeyword("GENERATION-INTERACTION-MT");
        $kw146$LEXICAL_INTERACTION_MT = SubLObjectFactory.makeKeyword("LEXICAL-INTERACTION-MT");
        $const147$EnglishTemplateMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishTemplateMt"));
        $const148$EnglishParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"));
        $const149$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $kw150$SCENARIO_INTERACTION_CONTEXT = SubLObjectFactory.makeKeyword("SCENARIO-INTERACTION-CONTEXT");
        $sym151$USER_INTERACTION_META_AGENDA = SubLObjectFactory.makeSymbol("USER-INTERACTION-META-AGENDA");
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("ISG"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-AGENDAS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"));
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("ISG"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("OPEN-AGENDAS"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-AGENDA"), (SubLObject)SubLObjectFactory.makeKeyword("STATE"));
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UIMA-ID"), (SubLObject)SubLObjectFactory.makeSymbol("UIMA-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("UIMA-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("UIMA-OPEN-AGENDAS"), (SubLObject)SubLObjectFactory.makeSymbol("UIMA-CURRENT-AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("UIMA-STATE"));
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-UIMA-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-UIMA-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-UIMA-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-UIMA-OPEN-AGENDAS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-UIMA-CURRENT-AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-UIMA-STATE"));
        $sym156$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym157$USER_INTERACTION_META_AGENDA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("USER-INTERACTION-META-AGENDA-PRINT-FUNCTION-TRAMPOLINE");
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("USER-INTERACTION-META-AGENDA-P"));
        $sym159$UIMA_ID = SubLObjectFactory.makeSymbol("UIMA-ID");
        $sym160$_CSETF_UIMA_ID = SubLObjectFactory.makeSymbol("_CSETF-UIMA-ID");
        $sym161$UIMA_ISG = SubLObjectFactory.makeSymbol("UIMA-ISG");
        $sym162$_CSETF_UIMA_ISG = SubLObjectFactory.makeSymbol("_CSETF-UIMA-ISG");
        $sym163$UIMA_INDEX = SubLObjectFactory.makeSymbol("UIMA-INDEX");
        $sym164$_CSETF_UIMA_INDEX = SubLObjectFactory.makeSymbol("_CSETF-UIMA-INDEX");
        $sym165$UIMA_OPEN_AGENDAS = SubLObjectFactory.makeSymbol("UIMA-OPEN-AGENDAS");
        $sym166$_CSETF_UIMA_OPEN_AGENDAS = SubLObjectFactory.makeSymbol("_CSETF-UIMA-OPEN-AGENDAS");
        $sym167$UIMA_CURRENT_AGENDA = SubLObjectFactory.makeSymbol("UIMA-CURRENT-AGENDA");
        $sym168$_CSETF_UIMA_CURRENT_AGENDA = SubLObjectFactory.makeSymbol("_CSETF-UIMA-CURRENT-AGENDA");
        $sym169$UIMA_STATE = SubLObjectFactory.makeSymbol("UIMA-STATE");
        $sym170$_CSETF_UIMA_STATE = SubLObjectFactory.makeSymbol("_CSETF-UIMA-STATE");
        $kw171$OPEN_AGENDAS = SubLObjectFactory.makeKeyword("OPEN-AGENDAS");
        $kw172$CURRENT_AGENDA = SubLObjectFactory.makeKeyword("CURRENT-AGENDA");
        $sym173$MAKE_USER_INTERACTION_META_AGENDA = SubLObjectFactory.makeSymbol("MAKE-USER-INTERACTION-META-AGENDA");
        $sym174$VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_META_AGENDA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-META-AGENDA-METHOD");
        $list175 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UIMA"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw177$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw178$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym179$ID = SubLObjectFactory.makeUninternedSymbol("ID");
        $sym180$DO_ID_INDEX = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-UIMMA"));
        $sym182$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym183$SYSTEM_UIMMA = SubLObjectFactory.makeSymbol("SYSTEM-UIMMA");
        $sym184$DO_UIMAS = SubLObjectFactory.makeSymbol("DO-UIMAS");
        $sym185$_UIMMA_ = SubLObjectFactory.makeSymbol("*UIMMA*");
        $sym186$_UIMMA_DEFAULT_LOCALE_ = SubLObjectFactory.makeSymbol("*UIMMA-DEFAULT-LOCALE*");
        $const187$EnglishLanguage = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishLanguage"));
        $sym188$_UIMMA_DEFAULT_GENERATION_MT_ = SubLObjectFactory.makeSymbol("*UIMMA-DEFAULT-GENERATION-MT*");
        $sym189$_UIMMA_DEFAULT_DOMAIN_MT_ = SubLObjectFactory.makeSymbol("*UIMMA-DEFAULT-DOMAIN-MT*");
        $const190$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym191$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $list192 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AGENDA")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym193$STATE = SubLObjectFactory.makeUninternedSymbol("STATE");
        $sym194$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym195$UIA_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("UIA-MEMOIZATION-STATE");
        $sym196$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $kw197$MEMOIZATION_STATE = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $list198 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("META-AGENDA")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym199$STATE = SubLObjectFactory.makeUninternedSymbol("STATE");
        $sym200$UIMA_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("UIMA-MEMOIZATION-STATE");
        $kw201$PENDING = SubLObjectFactory.makeKeyword("PENDING");
        $kw202$SUB_INTERACTIONS = SubLObjectFactory.makeKeyword("SUB-INTERACTIONS");
        $kw203$SUPER_INTERACTION = SubLObjectFactory.makeKeyword("SUPER-INTERACTION");
        $kw204$BLOCKED = SubLObjectFactory.makeKeyword("BLOCKED");
        $sym205$UIA_PENDING_ACTION_P = SubLObjectFactory.makeSymbol("UIA-PENDING-ACTION-P");
        $sym206$UIA_SIGNATURE_P = SubLObjectFactory.makeSymbol("UIA-SIGNATURE-P");
        $list207 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("META-AGENDA-ID"), (SubLObject)SubLObjectFactory.makeSymbol("AGENDA-ID"));
        $sym208$UI_SIGNATURE_P = SubLObjectFactory.makeSymbol("UI-SIGNATURE-P");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UIMA"), (SubLObject)SubLObjectFactory.makeSymbol("UIA"), (SubLObject)SubLObjectFactory.makeSymbol("UI"));
        $kw210$UIMA = SubLObjectFactory.makeKeyword("UIMA");
        $kw211$UIA = SubLObjectFactory.makeKeyword("UIA");
        $kw212$UI = SubLObjectFactory.makeKeyword("UI");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("META-AGENDA-ID"), (SubLObject)SubLObjectFactory.makeSymbol("AGENDA-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION-ID"));
        $kw214$FRAMES_FOR_REFRESH = SubLObjectFactory.makeKeyword("FRAMES-FOR-REFRESH");
        $kw215$CRUMB_TRAIL = SubLObjectFactory.makeKeyword("CRUMB-TRAIL");
        $kw216$UNDEFINED = SubLObjectFactory.makeKeyword("UNDEFINED");
        $kw217$TERMS = SubLObjectFactory.makeKeyword("TERMS");
        $kw218$FACTS = SubLObjectFactory.makeKeyword("FACTS");
        $kw219$QUESTIONS = SubLObjectFactory.makeKeyword("QUESTIONS");
        $kw220$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw221$MT = SubLObjectFactory.makeKeyword("MT");
        $kw222$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw223$INITIALIZER = SubLObjectFactory.makeKeyword("INITIALIZER");
        $list224 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FRAME"), (SubLObject)SubLObjectFactory.makeSymbol("AGENDA"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym225$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym226$UIA_SCHEDULE_FRAME_FOR_REFRESH = SubLObjectFactory.makeSymbol("UIA-SCHEDULE-FRAME-FOR-REFRESH");
        $kw227$ACKNOWLEDGE_MESSAGE = SubLObjectFactory.makeKeyword("ACKNOWLEDGE-MESSAGE");
        $list228 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SIGNATURE"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list229 = ConsesLow.list((SubLObject)user_interaction_agenda.MINUS_ONE_INTEGER, (SubLObject)user_interaction_agenda.MINUS_ONE_INTEGER, (SubLObject)user_interaction_agenda.MINUS_ONE_INTEGER);
        $kw230$UNKNOWN_INTERACTION = SubLObjectFactory.makeKeyword("UNKNOWN-INTERACTION");
        $kw231$UNKNOWN_ACTION = SubLObjectFactory.makeKeyword("UNKNOWN-ACTION");
        $sym232$UI_ACTION_TYPE_P = SubLObjectFactory.makeSymbol("UI-ACTION-TYPE-P");
        $kw233$SHOW = SubLObjectFactory.makeKeyword("SHOW");
        $kw234$SIGNATURE = SubLObjectFactory.makeKeyword("SIGNATURE");
        $kw235$AGENDA_SIGNATURE = SubLObjectFactory.makeKeyword("AGENDA-SIGNATURE");
        $kw236$GLOB = SubLObjectFactory.makeKeyword("GLOB");
        $kw237$UNINITIALIZED_GLOB = SubLObjectFactory.makeKeyword("UNINITIALIZED-GLOB");
    }
    
    public static final class $user_interaction_native extends SubLStructNative
    {
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
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$agenda = (SubLObject)CommonSymbols.NIL;
            this.$mode = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$start_time = (SubLObject)CommonSymbols.NIL;
            this.$finish_time = (SubLObject)CommonSymbols.NIL;
            this.$parent_interaction = (SubLObject)CommonSymbols.NIL;
            this.$child_interactions = (SubLObject)CommonSymbols.NIL;
            this.$operator = (SubLObject)CommonSymbols.NIL;
            this.$args = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$user_interaction_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$user_interaction_native.class, user_interaction_agenda.$sym6$USER_INTERACTION, user_interaction_agenda.$sym7$USER_INTERACTION_P, user_interaction_agenda.$list8, user_interaction_agenda.$list9, new String[] { "$id", "$agenda", "$mode", "$status", "$start_time", "$finish_time", "$parent_interaction", "$child_interactions", "$operator", "$args", "$result", "$state" }, user_interaction_agenda.$list10, user_interaction_agenda.$list11, user_interaction_agenda.$sym12$PRINT_USER_INTERACTION);
        }
    }
    
    public static final class $user_interaction_p$UnaryFunction extends UnaryFunction
    {
        public $user_interaction_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("USER-INTERACTION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return user_interaction_agenda.user_interaction_p(arg1);
        }
    }
    
    public static final class $user_interaction_agenda_native extends SubLStructNative
    {
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
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$meta_agenda = (SubLObject)CommonSymbols.NIL;
            this.$isg = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$history = (SubLObject)CommonSymbols.NIL;
            this.$undos = (SubLObject)CommonSymbols.NIL;
            this.$messages = (SubLObject)CommonSymbols.NIL;
            this.$requirements = (SubLObject)CommonSymbols.NIL;
            this.$relevant_suggestions = (SubLObject)CommonSymbols.NIL;
            this.$possible_suggestions = (SubLObject)CommonSymbols.NIL;
            this.$comments = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$user_interaction_agenda_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$user_interaction_agenda_native.class, user_interaction_agenda.$sym65$USER_INTERACTION_AGENDA, user_interaction_agenda.$sym59$USER_INTERACTION_AGENDA_P, user_interaction_agenda.$list66, user_interaction_agenda.$list67, new String[] { "$id", "$meta_agenda", "$isg", "$index", "$history", "$undos", "$messages", "$requirements", "$relevant_suggestions", "$possible_suggestions", "$comments", "$state" }, user_interaction_agenda.$list68, user_interaction_agenda.$list69, user_interaction_agenda.$sym70$PRINT_USER_INTERACTION_AGENDA);
        }
    }
    
    public static final class $user_interaction_agenda_p$UnaryFunction extends UnaryFunction
    {
        public $user_interaction_agenda_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("USER-INTERACTION-AGENDA-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return user_interaction_agenda.user_interaction_agenda_p(arg1);
        }
    }
    
    public static final class $user_interaction_meta_agenda_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $isg;
        public SubLObject $index;
        public SubLObject $open_agendas;
        public SubLObject $current_agenda;
        public SubLObject $state;
        private static final SubLStructDeclNative structDecl;
        
        public $user_interaction_meta_agenda_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$isg = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$open_agendas = (SubLObject)CommonSymbols.NIL;
            this.$current_agenda = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$user_interaction_meta_agenda_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$user_interaction_meta_agenda_native.class, user_interaction_agenda.$sym151$USER_INTERACTION_META_AGENDA, user_interaction_agenda.$sym111$USER_INTERACTION_META_AGENDA_P, user_interaction_agenda.$list152, user_interaction_agenda.$list153, new String[] { "$id", "$isg", "$index", "$open_agendas", "$current_agenda", "$state" }, user_interaction_agenda.$list154, user_interaction_agenda.$list155, user_interaction_agenda.$sym156$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $user_interaction_meta_agenda_p$UnaryFunction extends UnaryFunction
    {
        public $user_interaction_meta_agenda_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("USER-INTERACTION-META-AGENDA-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return user_interaction_agenda.user_interaction_meta_agenda_p(arg1);
        }
    }
}

/*

	Total time: 909 ms
	
*/