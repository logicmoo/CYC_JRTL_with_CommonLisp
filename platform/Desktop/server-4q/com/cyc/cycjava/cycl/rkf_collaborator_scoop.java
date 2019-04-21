package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_collaborator_scoop extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_collaborator_scoop";
    public static final String myFingerPrint = "7925d84ac1b98630089973cb45bef43fa17c935936cdf43545c9a649e3d062fe";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 806L)
    private static SubLSymbol $within_scoop_server$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 856L)
    public static SubLSymbol $scoop_server_port$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 906L)
    public static SubLSymbol $scoop_server_machine$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 972L)
    private static SubLSymbol $use_virb3_for_scoop$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1401L)
    private static SubLSymbol $scoop_appname$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1448L)
    private static SubLSymbol $scoop_definitions$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1493L)
    private static SubLSymbol $scoop_members$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2642L)
    private static SubLSymbol $scoop_incoming_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2738L)
    private static SubLSymbol $scoop_outgoing_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2831L)
    private static SubLSymbol $scoop_sid$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2871L)
    private static SubLSymbol $scoop_tid$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2910L)
    private static SubLSymbol $scoop_transaction_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 17157L)
    private static SubLSymbol $rkf_scoop_associate_machine$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 17258L)
    private static SubLSymbol $rkf_scoop_associate_port$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 22137L)
    private static SubLSymbol $scoop_xml_newline$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 22247L)
    private static SubLSymbol $scoop_xml_template_login$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 22867L)
    private static SubLSymbol $scoop_xml_template_logout$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 23472L)
    private static SubLSymbol $scoop_xml_template_create$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 23921L)
    private static SubLSymbol $scoop_xml_template_delete$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 24368L)
    private static SubLSymbol $scoop_xml_template_assert$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25305L)
    private static SubLSymbol $scoop_xml_template_unassert$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLSymbol $dtp_scoop_session$;
    private static final SubLInteger $int0$3599;
    private static final SubLString $str1$BOOTLEG_CYC_COM;
    private static final SubLSymbol $kw2$SCOOP;
    private static final SubLSymbol $sym3$SCOOP_SERVER_HANDLER;
    private static final SubLSymbol $kw4$TEXT;
    private static final SubLString $str5$CYC;
    private static final SubLSymbol $sym6$DOUBLE_FLOAT;
    private static final SubLSymbol $kw7$SCOOP_QUIT;
    private static final SubLString $str8$KRAKEN;
    private static final SubLSymbol $sym9$_SCOOP_DEFINITIONS_;
    private static final SubLSymbol $sym10$_SCOOP_MEMBERS_;
    private static final SubLSymbol $kw11$LOGIN;
    private static final SubLSymbol $kw12$EMNAME;
    private static final SubLString $str13$SCOOP_Login_Monitor;
    private static final SubLSymbol $kw14$APPNAME;
    private static final SubLSymbol $kw15$EMID;
    private static final SubLSymbol $kw16$LOGOUT;
    private static final SubLString $str17$SCOOP_Logout_Monitor;
    private static final SubLSymbol $kw18$CREATE;
    private static final SubLString $str19$SCOOP_Create_Monitor;
    private static final SubLSymbol $kw20$DELETE;
    private static final SubLString $str21$SCOOP_Delete_Monitor;
    private static final SubLSymbol $kw22$ASSERT;
    private static final SubLString $str23$SCOOP_Assert_Monitor;
    private static final SubLSymbol $kw24$UNASSERT;
    private static final SubLString $str25$SCOOP_Unassert_Monitor;
    private static final SubLSymbol $kw26$CONFLICT;
    private static final SubLString $str27$SCOOP_Conflict_Voter;
    private static final SubLSymbol $sym28$LISTP;
    private static final SubLString $str29$SCOOP_Incoming_VirB3_Queue;
    private static final SubLString $str30$SCOOP_Outgoing_VirB3_Queue;
    private static final SubLString $str31$SCOOP___A__;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $kw34$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw35$INVITE;
    private static final SubLSymbol $kw36$SID;
    private static final SubLSymbol $kw37$TID;
    private static final SubLSymbol $kw38$MESSAGE_TYPE;
    private static final SubLSymbol $kw39$MESSAGE_ARGS;
    private static final SubLSymbol $kw40$SME;
    private static final SubLSymbol $kw41$DOMAIN_MT;
    private static final SubLSymbol $kw42$LEXICAL_MT;
    private static final SubLSymbol $kw43$PARSING_MT;
    private static final SubLSymbol $kw44$TERM;
    private static final SubLSymbol $kw45$TERM_NAME;
    private static final SubLSymbol $kw46$TERM_GUID;
    private static final SubLSymbol $kw47$WHO_DUNNIT;
    private static final SubLSymbol $kw48$ASSERTION;
    private static final SubLSymbol $kw49$EL_FORMULA;
    private static final SubLSymbol $kw50$MT;
    private static final SubLSymbol $kw51$TRACE;
    private static final SubLSymbol $kw52$QUIT;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLString $str63$Protocol_violation____cannot_hand;
    private static final SubLSymbol $kw64$DONE;
    private static final SubLString $str65$Scoop_Listener;
    private static final SubLSymbol $sym66$SCOOP_REPLY_POSTING_LISTENER;
    private static final SubLSymbol $kw67$ERROR;
    private static final SubLString $str68$The_connection_with_SCOOP_dropped;
    private static final SubLSymbol $kw69$EOF;
    private static final SubLSymbol $kw70$DISCONNECT;
    private static final SubLString $str71$Scoop_errored_out_and_generated_a;
    private static final SubLString $str72$Protocol_violation____received__A;
    private static final SubLSymbol $kw73$ACCEPT;
    private static final SubLString $str74$SCOOP_accepted_with__A__;
    private static final SubLSymbol $kw75$PROPOSE;
    private static final SubLSymbol $kw76$CONTRIBUTE;
    private static final SubLSymbol $kw77$STIMULATE;
    private static final SubLSymbol $kw78$PROPID;
    private static final SubLSymbol $kw79$AAL;
    private static final SubLSymbol $sym80$_ACTION;
    private static final SubLString $str81$UIA_START_SESSION;
    private static final SubLSymbol $sym82$_THE_POSTING;
    private static final SubLString $str83$POSTING;
    private static final SubLString $str84$UIA_STOP_SESSION;
    private static final SubLString $str85$UIA_CREATE;
    private static final SubLString $str86$UIA_KILL;
    private static final SubLString $str87$UIA_ASSERT;
    private static final SubLString $str88$UIA_UNASSERT;
    private static final SubLSymbol $kw89$CREATOR;
    private static final SubLSymbol $kw90$XML_SUMMARY;
    private static final SubLSymbol $kw91$KILL;
    private static final SubLString $str92$nautilus_cyc_com;
    private static final SubLInteger $int93$3621;
    private static final SubLSymbol $kw94$CONNECTION;
    private static final SubLSymbol $kw95$ADDRESS;
    private static final SubLSymbol $kw96$PORT;
    private static final SubLSymbol $kw97$MTS;
    private static final SubLSymbol $kw98$INTERACTION_DOMAIN_MT;
    private static final SubLSymbol $kw99$INTERACTION_LEXICAL_MT;
    private static final SubLSymbol $kw100$INTERACTION_PARSING_MT;
    private static final SubLSymbol $kw101$SESSION;
    private static final SubLSymbol $kw102$CONSTANT;
    private static final SubLSymbol $kw103$NAME;
    private static final SubLSymbol $kw104$GUID;
    private static final SubLSymbol $kw105$NART;
    private static final SubLSymbol $kw106$FORMULA;
    private static final SubLSymbol $kw107$FORWARD;
    private static final SubLObject $const108$Forward_AssertionDirection;
    private static final SubLSymbol $kw109$BACKWARD;
    private static final SubLObject $const110$Backward_AssertionDirection;
    private static final SubLSymbol $kw111$CODE;
    private static final SubLObject $const112$Code_AssertionDirection;
    private static final SubLSymbol $kw113$DIRECTION;
    private static final SubLSymbol $kw114$TRUE;
    private static final SubLObject $const115$True;
    private static final SubLSymbol $kw116$FALSE;
    private static final SubLObject $const117$False;
    private static final SubLSymbol $kw118$UNKNOWN;
    private static final SubLObject $const119$Unknown_HLTruthValue;
    private static final SubLSymbol $kw120$TRUTH;
    private static final SubLSymbol $kw121$DEFAULT;
    private static final SubLObject $const122$Default_JustificationStrength;
    private static final SubLSymbol $kw123$MONOTONIC;
    private static final SubLObject $const124$Monotonic_JustificationStrength;
    private static final SubLSymbol $kw125$STRENGTH;
    private static final SubLSymbol $kw126$TIMESTAMP;
    private static final SubLSymbol $kw127$DATE;
    private static final SubLSymbol $kw128$SECS;
    private static final SubLString $str129$__xml_version__1_0__encoding__UTF;
    private static final SubLString $str130$_SCOOP_;
    private static final SubLString $str131$_action_login__action_;
    private static final SubLString $str132$_user__A__user_;
    private static final SubLString $str133$_microTheory__A__microTheory_;
    private static final SubLString $str134$_clientAddress__A__clientAddress_;
    private static final SubLString $str135$_clientPort__A__clientPort_;
    private static final SubLString $str136$__SCOOP_;
    private static final SubLString $str137$_action_logout__action_;
    private static final SubLString $str138$_action_create__action_;
    private static final SubLString $str139$_constant__A__constant_;
    private static final SubLString $str140$_action_delete__action_;
    private static final SubLString $str141$_action_assert__action_;
    private static final SubLString $str142$_statement_;
    private static final SubLString $str143$_A;
    private static final SubLString $str144$__statement_;
    private static final SubLString $str145$_action_unassert__action_;
    private static final SubLString $str146$_statement__A__statement_;
    private static final SubLString $str147$_clientPort__D__clientPort_;
    private static final SubLSymbol $sym148$SCOOP_SESSION;
    private static final SubLSymbol $sym149$SCOOP_SESSION_P;
    private static final SubLList $list150;
    private static final SubLList $list151;
    private static final SubLList $list152;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym155$SCOOP_SESSION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$SCOOP_SESSION_MACHINE;
    private static final SubLSymbol $sym158$_CSETF_SCOOP_SESSION_MACHINE;
    private static final SubLSymbol $sym159$SCOOP_SESSION_PORT;
    private static final SubLSymbol $sym160$_CSETF_SCOOP_SESSION_PORT;
    private static final SubLSymbol $sym161$SCOOP_SESSION_TCP_SERVER;
    private static final SubLSymbol $sym162$_CSETF_SCOOP_SESSION_TCP_SERVER;
    private static final SubLSymbol $sym163$SCOOP_SESSION_INITIALIZED_P;
    private static final SubLSymbol $sym164$_CSETF_SCOOP_SESSION_INITIALIZED_P;
    private static final SubLSymbol $kw165$MACHINE;
    private static final SubLSymbol $kw166$TCP_SERVER;
    private static final SubLSymbol $kw167$INITIALIZED_P;
    private static final SubLString $str168$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw169$BEGIN;
    private static final SubLSymbol $sym170$MAKE_SCOOP_SESSION;
    private static final SubLSymbol $kw171$SLOT;
    private static final SubLSymbol $kw172$END;
    private static final SubLSymbol $sym173$VISIT_DEFSTRUCT_OBJECT_SCOOP_SESSION_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1021L)
    public static SubLObject scoop_server_handler(final SubLObject in_stream, final SubLObject out_stream) {
        return scoop_server_top_level(in_stream, out_stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1169L)
    public static SubLObject scoop_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding(thread);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)rkf_collaborator_scoop.$str5$CYC), thread);
            reader.$read_default_float_format$.bind((SubLObject)rkf_collaborator_scoop.$sym6$DOUBLE_FLOAT, thread);
            print_high.$print_readably$.bind((SubLObject)rkf_collaborator_scoop.NIL, thread);
            reader.$read_eval$.bind((SubLObject)rkf_collaborator_scoop.NIL, thread);
            final SubLObject old_priority = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                SubLObject catch_var = (SubLObject)rkf_collaborator_scoop.NIL;
                try {
                    thread.throwStack.push(rkf_collaborator_scoop.$kw7$SCOOP_QUIT);
                    final SubLObject _prev_bind_0_$1 = rkf_collaborator_scoop.$within_scoop_server$.currentBinding(thread);
                    try {
                        rkf_collaborator_scoop.$within_scoop_server$.bind((SubLObject)rkf_collaborator_scoop.T, thread);
                        scoop_server_handler_internal(in_stream, out_stream);
                    }
                    finally {
                        rkf_collaborator_scoop.$within_scoop_server$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_scoop.$kw7$SCOOP_QUIT);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_scoop.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Threads.set_process_priority(Threads.current_process(), old_priority);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            reader.$read_eval$.rebind(_prev_bind_4, thread);
            print_high.$print_readably$.rebind(_prev_bind_3, thread);
            reader.$read_default_float_format$.rebind(_prev_bind_2, thread);
            Packages.$package$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)rkf_collaborator_scoop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1538L)
    public static SubLObject initialize_scoop_definitions() {
        rkf_collaborator_scoop.$scoop_definitions$.setGlobalValue((SubLObject)ConsesLow.list(new SubLObject[] { rkf_collaborator_scoop.$kw11$LOGIN, ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw12$EMNAME, (SubLObject)rkf_collaborator_scoop.$str13$SCOOP_Login_Monitor, (SubLObject)rkf_collaborator_scoop.$kw14$APPNAME, rkf_collaborator_scoop.$scoop_appname$.getGlobalValue(), (SubLObject)rkf_collaborator_scoop.$kw15$EMID, Guids.guid_to_string(Guids.new_guid())), rkf_collaborator_scoop.$kw16$LOGOUT, ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw12$EMNAME, (SubLObject)rkf_collaborator_scoop.$str17$SCOOP_Logout_Monitor, (SubLObject)rkf_collaborator_scoop.$kw14$APPNAME, rkf_collaborator_scoop.$scoop_appname$.getGlobalValue(), (SubLObject)rkf_collaborator_scoop.$kw15$EMID, Guids.guid_to_string(Guids.new_guid())), rkf_collaborator_scoop.$kw18$CREATE, ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw12$EMNAME, (SubLObject)rkf_collaborator_scoop.$str19$SCOOP_Create_Monitor, (SubLObject)rkf_collaborator_scoop.$kw14$APPNAME, rkf_collaborator_scoop.$scoop_appname$.getGlobalValue(), (SubLObject)rkf_collaborator_scoop.$kw15$EMID, Guids.guid_to_string(Guids.new_guid())), rkf_collaborator_scoop.$kw20$DELETE, ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw12$EMNAME, (SubLObject)rkf_collaborator_scoop.$str21$SCOOP_Delete_Monitor, (SubLObject)rkf_collaborator_scoop.$kw14$APPNAME, rkf_collaborator_scoop.$scoop_appname$.getGlobalValue(), (SubLObject)rkf_collaborator_scoop.$kw15$EMID, Guids.guid_to_string(Guids.new_guid())), rkf_collaborator_scoop.$kw22$ASSERT, ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw12$EMNAME, (SubLObject)rkf_collaborator_scoop.$str23$SCOOP_Assert_Monitor, (SubLObject)rkf_collaborator_scoop.$kw14$APPNAME, rkf_collaborator_scoop.$scoop_appname$.getGlobalValue(), (SubLObject)rkf_collaborator_scoop.$kw15$EMID, Guids.guid_to_string(Guids.new_guid())), rkf_collaborator_scoop.$kw24$UNASSERT, ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw12$EMNAME, (SubLObject)rkf_collaborator_scoop.$str25$SCOOP_Unassert_Monitor, (SubLObject)rkf_collaborator_scoop.$kw14$APPNAME, rkf_collaborator_scoop.$scoop_appname$.getGlobalValue(), (SubLObject)rkf_collaborator_scoop.$kw15$EMID, Guids.guid_to_string(Guids.new_guid())), rkf_collaborator_scoop.$kw26$CONFLICT, ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw12$EMNAME, (SubLObject)rkf_collaborator_scoop.$str27$SCOOP_Conflict_Voter, (SubLObject)rkf_collaborator_scoop.$kw14$APPNAME, rkf_collaborator_scoop.$scoop_appname$.getGlobalValue(), (SubLObject)rkf_collaborator_scoop.$kw15$EMID, Guids.guid_to_string(Guids.new_guid())) }));
        rkf_collaborator_scoop.$scoop_members$.setGlobalValue(Sequences.delete_if((SubLObject)rkf_collaborator_scoop.$sym28$LISTP, conses_high.copy_list(rkf_collaborator_scoop.$scoop_definitions$.getGlobalValue()), (SubLObject)rkf_collaborator_scoop.UNPROVIDED, (SubLObject)rkf_collaborator_scoop.UNPROVIDED, (SubLObject)rkf_collaborator_scoop.UNPROVIDED, (SubLObject)rkf_collaborator_scoop.UNPROVIDED));
        return (SubLObject)rkf_collaborator_scoop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2533L)
    public static SubLObject scoop_definition_emid_by_type(final SubLObject type) {
        return conses_high.getf(conses_high.getf(rkf_collaborator_scoop.$scoop_definitions$.getGlobalValue(), type, (SubLObject)rkf_collaborator_scoop.UNPROVIDED), (SubLObject)rkf_collaborator_scoop.$kw15$EMID, (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2964L)
    public static SubLObject scoop_trace(final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        rkf_collaborator_scoop.$scoop_transaction_stack$.setDynamicValue((SubLObject)ConsesLow.cons(message, rkf_collaborator_scoop.$scoop_transaction_stack$.getDynamicValue(thread)), thread);
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 3066L)
    public static SubLObject scoop_trace_display_trace_stack() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = rkf_collaborator_scoop.$scoop_transaction_stack$.getDynamicValue(thread);
        SubLObject message = (SubLObject)rkf_collaborator_scoop.NIL;
        message = cdolist_list_var.first();
        while (rkf_collaborator_scoop.NIL != cdolist_list_var) {
            Errors.warn((SubLObject)rkf_collaborator_scoop.$str31$SCOOP___A__, message);
            cdolist_list_var = cdolist_list_var.rest();
            message = cdolist_list_var.first();
        }
        return (SubLObject)rkf_collaborator_scoop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 3212L)
    public static SubLObject scoop_server_handler_internal(final SubLObject in, final SubLObject out) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = rkf_collaborator_scoop.$scoop_transaction_stack$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rkf_collaborator_scoop.$scoop_sid$.currentBinding(thread);
        final SubLObject _prev_bind_3 = rkf_collaborator_scoop.$scoop_tid$.currentBinding(thread);
        try {
            rkf_collaborator_scoop.$scoop_transaction_stack$.bind((SubLObject)rkf_collaborator_scoop.NIL, thread);
            rkf_collaborator_scoop.$scoop_sid$.bind(Guids.guid_to_string(Guids.new_guid()), thread);
            rkf_collaborator_scoop.$scoop_tid$.bind(Guids.guid_to_string(Guids.new_guid()), thread);
            SubLObject replies = (SubLObject)rkf_collaborator_scoop.NIL;
            replies = scoop_process_invite_all(in, out);
            if (rkf_collaborator_scoop.NIL != replies) {
                scoop_message_forwarder(out, in);
            }
        }
        finally {
            rkf_collaborator_scoop.$scoop_tid$.rebind(_prev_bind_3, thread);
            rkf_collaborator_scoop.$scoop_sid$.rebind(_prev_bind_2, thread);
            rkf_collaborator_scoop.$scoop_transaction_stack$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)rkf_collaborator_scoop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 3723L)
    public static SubLObject scoop_process_invite_all(final SubLObject in, final SubLObject out) {
        SubLObject success = (SubLObject)rkf_collaborator_scoop.NIL;
        SubLObject cdolist_list_var = rkf_collaborator_scoop.$scoop_members$.getGlobalValue();
        SubLObject member = (SubLObject)rkf_collaborator_scoop.NIL;
        member = cdolist_list_var.first();
        while (rkf_collaborator_scoop.NIL != cdolist_list_var) {
            final SubLObject definition = conses_high.getf(rkf_collaborator_scoop.$scoop_definitions$.getGlobalValue(), member, (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
            final SubLObject current;
            final SubLObject datum = current = definition;
            SubLObject allow_other_keys_p = (SubLObject)rkf_collaborator_scoop.NIL;
            SubLObject rest = current;
            SubLObject bad = (SubLObject)rkf_collaborator_scoop.NIL;
            SubLObject current_$3 = (SubLObject)rkf_collaborator_scoop.NIL;
            while (rkf_collaborator_scoop.NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list32);
                current_$3 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list32);
                if (rkf_collaborator_scoop.NIL == conses_high.member(current_$3, (SubLObject)rkf_collaborator_scoop.$list33, (SubLObject)rkf_collaborator_scoop.UNPROVIDED, (SubLObject)rkf_collaborator_scoop.UNPROVIDED)) {
                    bad = (SubLObject)rkf_collaborator_scoop.T;
                }
                if (current_$3 == rkf_collaborator_scoop.$kw34$ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (rkf_collaborator_scoop.NIL != bad && rkf_collaborator_scoop.NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_scoop.$list32);
            }
            final SubLObject emname_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw12$EMNAME, current);
            final SubLObject emname = (SubLObject)((rkf_collaborator_scoop.NIL != emname_tail) ? conses_high.cadr(emname_tail) : rkf_collaborator_scoop.NIL);
            final SubLObject appname_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw14$APPNAME, current);
            final SubLObject appname = (SubLObject)((rkf_collaborator_scoop.NIL != appname_tail) ? conses_high.cadr(appname_tail) : rkf_collaborator_scoop.NIL);
            final SubLObject emid_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw15$EMID, current);
            final SubLObject emid = (SubLObject)((rkf_collaborator_scoop.NIL != emid_tail) ? conses_high.cadr(emid_tail) : rkf_collaborator_scoop.NIL);
            scoop_process_invitation(in, out, emid, appname, emname);
            success = (SubLObject)ConsesLow.cons(member, success);
            cdolist_list_var = cdolist_list_var.rest();
            member = cdolist_list_var.first();
        }
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 4157L)
    public static SubLObject scoop_process_invitation(final SubLObject in, final SubLObject out, final SubLObject emid, final SubLObject appname, final SubLObject emname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)ConsesLow.list(new SubLObject[] { rkf_collaborator_scoop.$kw35$INVITE, rkf_collaborator_scoop.$kw36$SID, rkf_collaborator_scoop.$scoop_sid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw15$EMID, emid, rkf_collaborator_scoop.$kw37$TID, rkf_collaborator_scoop.$scoop_tid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw14$APPNAME, appname, rkf_collaborator_scoop.$kw12$EMNAME, emname });
        SubLObject reply = (SubLObject)rkf_collaborator_scoop.NIL;
        write_scoop_server_reaction(out, message);
        scoop_trace(message);
        reply = read_scoop_server_request(in);
        scoop_trace(reply);
        return in;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 4591L)
    public static SubLObject new_scoop_message_packet(final SubLObject type, SubLObject plist) {
        if (plist == rkf_collaborator_scoop.UNPROVIDED) {
            plist = (SubLObject)rkf_collaborator_scoop.NIL;
        }
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw38$MESSAGE_TYPE, type, (SubLObject)rkf_collaborator_scoop.$kw39$MESSAGE_ARGS, plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 4754L)
    public static SubLObject get_scoop_message_packet_type(final SubLObject packet) {
        return conses_high.getf(packet, (SubLObject)rkf_collaborator_scoop.$kw38$MESSAGE_TYPE, (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 4850L)
    public static SubLObject get_scoop_message_packet_arguments(final SubLObject packet) {
        return conses_high.getf(packet, (SubLObject)rkf_collaborator_scoop.$kw39$MESSAGE_ARGS, (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 4950L)
    public static SubLObject get_scoop_message_packet_arg(final SubLObject packet, final SubLObject key, SubLObject v_default) {
        if (v_default == rkf_collaborator_scoop.UNPROVIDED) {
            v_default = (SubLObject)rkf_collaborator_scoop.NIL;
        }
        return conses_high.getf(get_scoop_message_packet_arguments(packet), key, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 5101L)
    public static SubLObject scoop_schedule_outgoing_message_packet(final SubLObject packet) {
        return process_utilities.ipc_enqueue(packet, rkf_collaborator_scoop.$scoop_outgoing_queue$.getGlobalValue(), (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 5222L)
    public static SubLObject scoop_fetch_next_outgoing_message_packet() {
        return process_utilities.ipc_dequeue(rkf_collaborator_scoop.$scoop_outgoing_queue$.getGlobalValue(), (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 5329L)
    public static SubLObject scoop_schedule_login_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        final SubLObject packet = new_scoop_message_packet((SubLObject)rkf_collaborator_scoop.$kw11$LOGIN, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw40$SME, sme, (SubLObject)rkf_collaborator_scoop.$kw41$DOMAIN_MT, domain_mt, (SubLObject)rkf_collaborator_scoop.$kw42$LEXICAL_MT, lexical_mt, (SubLObject)rkf_collaborator_scoop.$kw43$PARSING_MT, parsing_mt));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 5818L)
    public static SubLObject scoop_schedule_logout_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        final SubLObject packet = new_scoop_message_packet((SubLObject)rkf_collaborator_scoop.$kw16$LOGOUT, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw40$SME, sme, (SubLObject)rkf_collaborator_scoop.$kw41$DOMAIN_MT, domain_mt, (SubLObject)rkf_collaborator_scoop.$kw42$LEXICAL_MT, lexical_mt, (SubLObject)rkf_collaborator_scoop.$kw43$PARSING_MT, parsing_mt));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 6228L)
    public static SubLObject scoop_schedule_create_message(final SubLObject v_term) {
        final SubLObject packet = new_scoop_message_packet((SubLObject)rkf_collaborator_scoop.$kw18$CREATE, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw44$TERM, v_term));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 6432L)
    public static SubLObject scoop_schedule_kill_message(final SubLObject term_name, final SubLObject term_guid, final SubLObject who_dunnit) {
        final SubLObject packet = new_scoop_message_packet((SubLObject)rkf_collaborator_scoop.$kw20$DELETE, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw45$TERM_NAME, term_name, (SubLObject)rkf_collaborator_scoop.$kw46$TERM_GUID, term_guid, (SubLObject)rkf_collaborator_scoop.$kw47$WHO_DUNNIT, who_dunnit));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 6804L)
    public static SubLObject scoop_schedule_assert_message(final SubLObject assertion) {
        final SubLObject packet = new_scoop_message_packet((SubLObject)rkf_collaborator_scoop.$kw22$ASSERT, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw48$ASSERTION, assertion));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 7023L)
    public static SubLObject scoop_schedule_unassert_message(final SubLObject el_formula, final SubLObject mt, final SubLObject who_dunnit) {
        final SubLObject packet = new_scoop_message_packet((SubLObject)rkf_collaborator_scoop.$kw24$UNASSERT, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw49$EL_FORMULA, el_formula, (SubLObject)rkf_collaborator_scoop.$kw50$MT, mt, (SubLObject)rkf_collaborator_scoop.$kw47$WHO_DUNNIT, who_dunnit));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 7379L)
    public static SubLObject scoop_schedule_trace_message() {
        final SubLObject packet = new_scoop_message_packet((SubLObject)rkf_collaborator_scoop.$kw51$TRACE, (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 7559L)
    public static SubLObject scoop_schedule_quit_message() {
        final SubLObject packet = new_scoop_message_packet((SubLObject)rkf_collaborator_scoop.$kw52$QUIT, (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 7737L)
    public static SubLObject scoop_message_forwarder(final SubLObject out, SubLObject in) {
        if (in == rkf_collaborator_scoop.UNPROVIDED) {
            in = (SubLObject)rkf_collaborator_scoop.NIL;
        }
        SubLObject doneP = (SubLObject)rkf_collaborator_scoop.NIL;
        while (rkf_collaborator_scoop.NIL == doneP) {
            final SubLObject packet = scoop_fetch_next_outgoing_message_packet();
            final SubLObject message = get_scoop_message_packet_arguments(packet);
            final SubLObject type = get_scoop_message_packet_type(packet);
            SubLObject scoop_message = (SubLObject)rkf_collaborator_scoop.NIL;
            final SubLObject pcase_var = type;
            if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw11$LOGIN)) {
                final SubLObject current;
                final SubLObject datum = current = message;
                SubLObject allow_other_keys_p = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject rest = current;
                SubLObject bad = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject current_$4 = (SubLObject)rkf_collaborator_scoop.NIL;
                while (rkf_collaborator_scoop.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list53);
                    current_$4 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list53);
                    if (rkf_collaborator_scoop.NIL == conses_high.member(current_$4, (SubLObject)rkf_collaborator_scoop.$list54, (SubLObject)rkf_collaborator_scoop.UNPROVIDED, (SubLObject)rkf_collaborator_scoop.UNPROVIDED)) {
                        bad = (SubLObject)rkf_collaborator_scoop.T;
                    }
                    if (current_$4 == rkf_collaborator_scoop.$kw34$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (rkf_collaborator_scoop.NIL != bad && rkf_collaborator_scoop.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_scoop.$list53);
                }
                final SubLObject sme_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw40$SME, current);
                final SubLObject sme = (SubLObject)((rkf_collaborator_scoop.NIL != sme_tail) ? conses_high.cadr(sme_tail) : rkf_collaborator_scoop.NIL);
                final SubLObject domain_mt_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw41$DOMAIN_MT, current);
                final SubLObject domain_mt = (SubLObject)((rkf_collaborator_scoop.NIL != domain_mt_tail) ? conses_high.cadr(domain_mt_tail) : rkf_collaborator_scoop.NIL);
                final SubLObject lexical_mt_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw42$LEXICAL_MT, current);
                final SubLObject lexical_mt = (SubLObject)((rkf_collaborator_scoop.NIL != lexical_mt_tail) ? conses_high.cadr(lexical_mt_tail) : rkf_collaborator_scoop.NIL);
                final SubLObject parsing_mt_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw43$PARSING_MT, current);
                final SubLObject parsing_mt = (SubLObject)((rkf_collaborator_scoop.NIL != parsing_mt_tail) ? conses_high.cadr(parsing_mt_tail) : rkf_collaborator_scoop.NIL);
                scoop_message = rkf_scoop_message_login(sme, domain_mt, lexical_mt, parsing_mt);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw16$LOGOUT)) {
                final SubLObject current;
                final SubLObject datum = current = message;
                SubLObject allow_other_keys_p = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject rest = current;
                SubLObject bad = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject current_$5 = (SubLObject)rkf_collaborator_scoop.NIL;
                while (rkf_collaborator_scoop.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list53);
                    current_$5 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list53);
                    if (rkf_collaborator_scoop.NIL == conses_high.member(current_$5, (SubLObject)rkf_collaborator_scoop.$list54, (SubLObject)rkf_collaborator_scoop.UNPROVIDED, (SubLObject)rkf_collaborator_scoop.UNPROVIDED)) {
                        bad = (SubLObject)rkf_collaborator_scoop.T;
                    }
                    if (current_$5 == rkf_collaborator_scoop.$kw34$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (rkf_collaborator_scoop.NIL != bad && rkf_collaborator_scoop.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_scoop.$list53);
                }
                final SubLObject sme_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw40$SME, current);
                final SubLObject sme = (SubLObject)((rkf_collaborator_scoop.NIL != sme_tail) ? conses_high.cadr(sme_tail) : rkf_collaborator_scoop.NIL);
                final SubLObject domain_mt_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw41$DOMAIN_MT, current);
                final SubLObject domain_mt = (SubLObject)((rkf_collaborator_scoop.NIL != domain_mt_tail) ? conses_high.cadr(domain_mt_tail) : rkf_collaborator_scoop.NIL);
                final SubLObject lexical_mt_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw42$LEXICAL_MT, current);
                final SubLObject lexical_mt = (SubLObject)((rkf_collaborator_scoop.NIL != lexical_mt_tail) ? conses_high.cadr(lexical_mt_tail) : rkf_collaborator_scoop.NIL);
                final SubLObject parsing_mt_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw43$PARSING_MT, current);
                final SubLObject parsing_mt = (SubLObject)((rkf_collaborator_scoop.NIL != parsing_mt_tail) ? conses_high.cadr(parsing_mt_tail) : rkf_collaborator_scoop.NIL);
                scoop_message = rkf_scoop_message_logout(sme, domain_mt, lexical_mt, parsing_mt);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw18$CREATE)) {
                final SubLObject current;
                final SubLObject datum = current = message;
                SubLObject allow_other_keys_p = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject rest = current;
                SubLObject bad = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject current_$6 = (SubLObject)rkf_collaborator_scoop.NIL;
                while (rkf_collaborator_scoop.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list55);
                    current_$6 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list55);
                    if (rkf_collaborator_scoop.NIL == conses_high.member(current_$6, (SubLObject)rkf_collaborator_scoop.$list56, (SubLObject)rkf_collaborator_scoop.UNPROVIDED, (SubLObject)rkf_collaborator_scoop.UNPROVIDED)) {
                        bad = (SubLObject)rkf_collaborator_scoop.T;
                    }
                    if (current_$6 == rkf_collaborator_scoop.$kw34$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (rkf_collaborator_scoop.NIL != bad && rkf_collaborator_scoop.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_scoop.$list55);
                }
                final SubLObject term_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw44$TERM, current);
                final SubLObject v_term = (SubLObject)((rkf_collaborator_scoop.NIL != term_tail) ? conses_high.cadr(term_tail) : rkf_collaborator_scoop.NIL);
                scoop_message = rkf_scoop_message_create(v_term);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw20$DELETE)) {
                final SubLObject current;
                final SubLObject datum = current = message;
                SubLObject allow_other_keys_p = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject rest = current;
                SubLObject bad = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject current_$7 = (SubLObject)rkf_collaborator_scoop.NIL;
                while (rkf_collaborator_scoop.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list57);
                    current_$7 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list57);
                    if (rkf_collaborator_scoop.NIL == conses_high.member(current_$7, (SubLObject)rkf_collaborator_scoop.$list58, (SubLObject)rkf_collaborator_scoop.UNPROVIDED, (SubLObject)rkf_collaborator_scoop.UNPROVIDED)) {
                        bad = (SubLObject)rkf_collaborator_scoop.T;
                    }
                    if (current_$7 == rkf_collaborator_scoop.$kw34$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (rkf_collaborator_scoop.NIL != bad && rkf_collaborator_scoop.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_scoop.$list57);
                }
                final SubLObject term_name_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw45$TERM_NAME, current);
                final SubLObject term_name = (SubLObject)((rkf_collaborator_scoop.NIL != term_name_tail) ? conses_high.cadr(term_name_tail) : rkf_collaborator_scoop.NIL);
                final SubLObject term_guid_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw46$TERM_GUID, current);
                final SubLObject term_guid = (SubLObject)((rkf_collaborator_scoop.NIL != term_guid_tail) ? conses_high.cadr(term_guid_tail) : rkf_collaborator_scoop.NIL);
                final SubLObject who_dunnit_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw47$WHO_DUNNIT, current);
                final SubLObject who_dunnit = (SubLObject)((rkf_collaborator_scoop.NIL != who_dunnit_tail) ? conses_high.cadr(who_dunnit_tail) : rkf_collaborator_scoop.NIL);
                scoop_message = rkf_scoop_message_kill(term_name, term_guid, who_dunnit);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw22$ASSERT)) {
                final SubLObject current;
                final SubLObject datum = current = message;
                SubLObject allow_other_keys_p = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject rest = current;
                SubLObject bad = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject current_$8 = (SubLObject)rkf_collaborator_scoop.NIL;
                while (rkf_collaborator_scoop.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list59);
                    current_$8 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list59);
                    if (rkf_collaborator_scoop.NIL == conses_high.member(current_$8, (SubLObject)rkf_collaborator_scoop.$list60, (SubLObject)rkf_collaborator_scoop.UNPROVIDED, (SubLObject)rkf_collaborator_scoop.UNPROVIDED)) {
                        bad = (SubLObject)rkf_collaborator_scoop.T;
                    }
                    if (current_$8 == rkf_collaborator_scoop.$kw34$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (rkf_collaborator_scoop.NIL != bad && rkf_collaborator_scoop.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_scoop.$list59);
                }
                final SubLObject assertion_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw48$ASSERTION, current);
                final SubLObject assertion = (SubLObject)((rkf_collaborator_scoop.NIL != assertion_tail) ? conses_high.cadr(assertion_tail) : rkf_collaborator_scoop.NIL);
                scoop_message = rkf_scoop_message_assert(assertion);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw24$UNASSERT)) {
                final SubLObject current;
                final SubLObject datum = current = message;
                SubLObject allow_other_keys_p = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject rest = current;
                SubLObject bad = (SubLObject)rkf_collaborator_scoop.NIL;
                SubLObject current_$9 = (SubLObject)rkf_collaborator_scoop.NIL;
                while (rkf_collaborator_scoop.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list61);
                    current_$9 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_collaborator_scoop.$list61);
                    if (rkf_collaborator_scoop.NIL == conses_high.member(current_$9, (SubLObject)rkf_collaborator_scoop.$list62, (SubLObject)rkf_collaborator_scoop.UNPROVIDED, (SubLObject)rkf_collaborator_scoop.UNPROVIDED)) {
                        bad = (SubLObject)rkf_collaborator_scoop.T;
                    }
                    if (current_$9 == rkf_collaborator_scoop.$kw34$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (rkf_collaborator_scoop.NIL != bad && rkf_collaborator_scoop.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_collaborator_scoop.$list61);
                }
                final SubLObject el_formula_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw49$EL_FORMULA, current);
                final SubLObject el_formula = (SubLObject)((rkf_collaborator_scoop.NIL != el_formula_tail) ? conses_high.cadr(el_formula_tail) : rkf_collaborator_scoop.NIL);
                final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw50$MT, current);
                final SubLObject mt = (SubLObject)((rkf_collaborator_scoop.NIL != mt_tail) ? conses_high.cadr(mt_tail) : rkf_collaborator_scoop.NIL);
                final SubLObject who_dunnit_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_collaborator_scoop.$kw47$WHO_DUNNIT, current);
                final SubLObject who_dunnit = (SubLObject)((rkf_collaborator_scoop.NIL != who_dunnit_tail) ? conses_high.cadr(who_dunnit_tail) : rkf_collaborator_scoop.NIL);
                scoop_message = rkf_scoop_message_unassert(el_formula, mt, who_dunnit);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw51$TRACE)) {
                scoop_trace_display_trace_stack();
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw52$QUIT)) {
                doneP = (SubLObject)rkf_collaborator_scoop.T;
            }
            else {
                Errors.warn((SubLObject)rkf_collaborator_scoop.$str63$Protocol_violation____cannot_hand, message);
            }
            if (rkf_collaborator_scoop.NIL != scoop_message) {
                write_scoop_server_reaction(out, scoop_message);
                scoop_trace(scoop_message);
                if (!in.isStream()) {
                    continue;
                }
                scoop_trace(read_scoop_server_request(in));
            }
        }
        return (SubLObject)rkf_collaborator_scoop.$kw64$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 9999L)
    public static SubLObject scoop_spawn_listener(final SubLObject in, final SubLObject out, final SubLObject sid, final SubLObject tid) {
        return subl_promotions.make_process_with_args((SubLObject)rkf_collaborator_scoop.$str65$Scoop_Listener, (SubLObject)rkf_collaborator_scoop.$sym66$SCOOP_REPLY_POSTING_LISTENER, (SubLObject)ConsesLow.list(in, sid, tid));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 10306L)
    public static SubLObject scoop_reply_posting_listener(final SubLObject in, final SubLObject sid, final SubLObject tid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = rkf_collaborator_scoop.$scoop_sid$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rkf_collaborator_scoop.$scoop_tid$.currentBinding(thread);
        try {
            rkf_collaborator_scoop.$scoop_sid$.bind(sid, thread);
            rkf_collaborator_scoop.$scoop_tid$.bind(tid, thread);
            SubLObject reply = (SubLObject)rkf_collaborator_scoop.NIL;
            SubLObject doneP = (SubLObject)rkf_collaborator_scoop.NIL;
            final SubLObject _prev_bind_0_$10 = Packages.$package$.currentBinding(thread);
            final SubLObject _prev_bind_1_$11 = reader.$read_default_float_format$.currentBinding(thread);
            final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding(thread);
            final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding(thread);
            try {
                Packages.$package$.bind(Packages.find_package((SubLObject)rkf_collaborator_scoop.$str5$CYC), thread);
                reader.$read_default_float_format$.bind((SubLObject)rkf_collaborator_scoop.$sym6$DOUBLE_FLOAT, thread);
                print_high.$print_readably$.bind((SubLObject)rkf_collaborator_scoop.NIL, thread);
                reader.$read_eval$.bind((SubLObject)rkf_collaborator_scoop.NIL, thread);
                final SubLObject old_priority = Threads.process_priority(Threads.current_process());
                try {
                    Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                    SubLObject catch_var = (SubLObject)rkf_collaborator_scoop.NIL;
                    try {
                        thread.throwStack.push(rkf_collaborator_scoop.$kw7$SCOOP_QUIT);
                        while (rkf_collaborator_scoop.NIL == doneP) {
                            reply = (SubLObject)rkf_collaborator_scoop.$kw67$ERROR;
                            try {
                                reply = read_scoop_server_request(in);
                                scoop_trace(reply);
                            }
                            finally {
                                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_scoop.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (reply == rkf_collaborator_scoop.$kw67$ERROR) {
                                        Errors.warn((SubLObject)rkf_collaborator_scoop.$str68$The_connection_with_SCOOP_dropped);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            if (reply == rkf_collaborator_scoop.$kw69$EOF) {
                                doneP = (SubLObject)rkf_collaborator_scoop.T;
                            }
                            else if (reply == rkf_collaborator_scoop.$kw70$DISCONNECT) {
                                Errors.warn((SubLObject)rkf_collaborator_scoop.$str71$Scoop_errored_out_and_generated_a);
                                doneP = (SubLObject)rkf_collaborator_scoop.T;
                            }
                            else if (!reply.isList()) {
                                Errors.warn((SubLObject)rkf_collaborator_scoop.$str72$Protocol_violation____received__A, reply);
                                doneP = (SubLObject)rkf_collaborator_scoop.T;
                            }
                            else {
                                final SubLObject pcase_var = reply.first();
                                if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw73$ACCEPT)) {
                                    Errors.warn((SubLObject)rkf_collaborator_scoop.$str74$SCOOP_accepted_with__A__, reply);
                                }
                                else {
                                    if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw75$PROPOSE)) {
                                        continue;
                                    }
                                    if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw76$CONTRIBUTE)) {}
                                }
                            }
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_collaborator_scoop.$kw7$SCOOP_QUIT);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_collaborator_scoop.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        Threads.set_process_priority(Threads.current_process(), old_priority);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                reader.$read_eval$.rebind(_prev_bind_4, thread);
                print_high.$print_readably$.rebind(_prev_bind_3, thread);
                reader.$read_default_float_format$.rebind(_prev_bind_1_$11, thread);
                Packages.$package$.rebind(_prev_bind_0_$10, thread);
            }
        }
        finally {
            rkf_collaborator_scoop.$scoop_tid$.rebind(_prev_bind_2, thread);
            rkf_collaborator_scoop.$scoop_sid$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)rkf_collaborator_scoop.$kw64$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 11652L)
    public static SubLObject read_scoop_server_request(final SubLObject in) {
        SubLObject input = (SubLObject)rkf_collaborator_scoop.NIL;
        input = reader.read(in, (SubLObject)rkf_collaborator_scoop.NIL, (SubLObject)rkf_collaborator_scoop.$kw69$EOF, (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
        return input;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 11838L)
    public static SubLObject write_scoop_server_reaction(final SubLObject out, final SubLObject reply) {
        print_high.prin1(reply, out);
        string_utilities.network_terpri(out);
        streams_high.force_output(out);
        return out;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 11973L)
    public static SubLObject rkf_scoop_message_login(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type((SubLObject)rkf_collaborator_scoop.$kw11$LOGIN);
        final SubLObject posting = rkf_virb3ify_login_message(sme, domain_mt, lexical_mt, parsing_mt);
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_collaborator_scoop.$kw77$STIMULATE, rkf_collaborator_scoop.$kw36$SID, rkf_collaborator_scoop.$scoop_sid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw15$EMID, emid, rkf_collaborator_scoop.$kw37$TID, rkf_collaborator_scoop.$scoop_tid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw78$PROPID, Guids.guid_to_string(Guids.new_guid()), rkf_collaborator_scoop.$kw79$AAL, ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym80$_ACTION, (SubLObject)rkf_collaborator_scoop.$str81$UIA_START_SESSION, posting), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym82$_THE_POSTING, (SubLObject)rkf_collaborator_scoop.$str83$POSTING, posting)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 12634L)
    public static SubLObject rkf_scoop_message_logout(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type((SubLObject)rkf_collaborator_scoop.$kw16$LOGOUT);
        final SubLObject posting = rkf_virb3ify_logout_message(sme, domain_mt, lexical_mt, parsing_mt);
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_collaborator_scoop.$kw77$STIMULATE, rkf_collaborator_scoop.$kw36$SID, rkf_collaborator_scoop.$scoop_sid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw15$EMID, emid, rkf_collaborator_scoop.$kw37$TID, rkf_collaborator_scoop.$scoop_tid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw78$PROPID, Guids.guid_to_string(Guids.new_guid()), rkf_collaborator_scoop.$kw79$AAL, ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym80$_ACTION, (SubLObject)rkf_collaborator_scoop.$str84$UIA_STOP_SESSION, posting), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym82$_THE_POSTING, (SubLObject)rkf_collaborator_scoop.$str83$POSTING, posting)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 13182L)
    public static SubLObject rkf_scoop_message_create(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type((SubLObject)rkf_collaborator_scoop.$kw16$LOGOUT);
        final SubLObject posting = rkf_virb3ify_create_message(v_term);
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_collaborator_scoop.$kw77$STIMULATE, rkf_collaborator_scoop.$kw36$SID, rkf_collaborator_scoop.$scoop_sid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw15$EMID, emid, rkf_collaborator_scoop.$kw37$TID, rkf_collaborator_scoop.$scoop_tid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw78$PROPID, Guids.guid_to_string(Guids.new_guid()), rkf_collaborator_scoop.$kw79$AAL, ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym80$_ACTION, (SubLObject)rkf_collaborator_scoop.$str85$UIA_CREATE, posting), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym82$_THE_POSTING, (SubLObject)rkf_collaborator_scoop.$str83$POSTING, posting)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 13645L)
    public static SubLObject rkf_scoop_message_kill(final SubLObject term_name, final SubLObject term_guid, final SubLObject who_dunnit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type((SubLObject)rkf_collaborator_scoop.$kw20$DELETE);
        final SubLObject posting = rkf_virb3ify_delete_message(term_name, term_guid, who_dunnit);
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_collaborator_scoop.$kw77$STIMULATE, rkf_collaborator_scoop.$kw36$SID, rkf_collaborator_scoop.$scoop_sid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw15$EMID, emid, rkf_collaborator_scoop.$kw37$TID, rkf_collaborator_scoop.$scoop_tid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw78$PROPID, Guids.guid_to_string(Guids.new_guid()), rkf_collaborator_scoop.$kw79$AAL, ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym80$_ACTION, (SubLObject)rkf_collaborator_scoop.$str86$UIA_KILL, posting), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym82$_THE_POSTING, (SubLObject)rkf_collaborator_scoop.$str83$POSTING, posting)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 14173L)
    public static SubLObject rkf_scoop_message_assert(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type((SubLObject)rkf_collaborator_scoop.$kw22$ASSERT);
        final SubLObject posting = rkf_virb3ify_assert_message(assertion);
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_collaborator_scoop.$kw77$STIMULATE, rkf_collaborator_scoop.$kw36$SID, rkf_collaborator_scoop.$scoop_sid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw15$EMID, emid, rkf_collaborator_scoop.$kw37$TID, rkf_collaborator_scoop.$scoop_tid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw78$PROPID, Guids.guid_to_string(Guids.new_guid()), rkf_collaborator_scoop.$kw79$AAL, ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym80$_ACTION, (SubLObject)rkf_collaborator_scoop.$str87$UIA_ASSERT, posting), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym82$_THE_POSTING, (SubLObject)rkf_collaborator_scoop.$str83$POSTING, posting)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 14643L)
    public static SubLObject rkf_scoop_message_unassert(final SubLObject el_formula, final SubLObject mt, final SubLObject who_dunnit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type((SubLObject)rkf_collaborator_scoop.$kw24$UNASSERT);
        final SubLObject posting = rkf_virb3ify_unassert_message(el_formula, mt, who_dunnit);
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_collaborator_scoop.$kw77$STIMULATE, rkf_collaborator_scoop.$kw36$SID, rkf_collaborator_scoop.$scoop_sid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw15$EMID, emid, rkf_collaborator_scoop.$kw37$TID, rkf_collaborator_scoop.$scoop_tid$.getDynamicValue(thread), rkf_collaborator_scoop.$kw78$PROPID, Guids.guid_to_string(Guids.new_guid()), rkf_collaborator_scoop.$kw79$AAL, ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym80$_ACTION, (SubLObject)rkf_collaborator_scoop.$str88$UIA_UNASSERT, posting), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$sym82$_THE_POSTING, (SubLObject)rkf_collaborator_scoop.$str83$POSTING, posting)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 15151L)
    public static SubLObject rkf_virb3ify_login_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        return rkf_virb3ify_session_message(sme, domain_mt, lexical_mt, parsing_mt, (SubLObject)rkf_collaborator_scoop.$kw11$LOGIN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 15376L)
    public static SubLObject rkf_virb3ify_logout_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        return rkf_virb3ify_session_message(sme, domain_mt, lexical_mt, parsing_mt, (SubLObject)rkf_collaborator_scoop.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 15547L)
    public static SubLObject rkf_virb3ify_create_message(final SubLObject v_term) {
        final SubLObject creator = bookkeeping_store.creator(v_term, (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
        final SubLObject date = bookkeeping_store.creation_time(v_term, (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
        final SubLObject second = bookkeeping_store.creation_second(v_term, (SubLObject)rkf_collaborator_scoop.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw18$CREATE, (SubLObject)ConsesLow.list(rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw44$TERM, v_term), rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw89$CREATOR, creator), rkf_virb3ify_timestamp(date, second), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw90$XML_SUMMARY, scoop_xml_create_writer((SubLObject)rkf_collaborator_scoop.NIL, creator, v_term))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 16091L)
    public static SubLObject rkf_virb3ify_delete_message(final SubLObject term_name, final SubLObject term_guid, final SubLObject who_dunnit) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw91$KILL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw44$TERM, rkf_virb3ify_constant_assemble_pieces(term_name, term_guid)), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw90$XML_SUMMARY, scoop_xml_delete_writer((SubLObject)rkf_collaborator_scoop.NIL, who_dunnit, term_name))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 16437L)
    public static SubLObject rkf_virb3ify_assert_message(final SubLObject assertion) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw48$ASSERTION, ConsesLow.append(rkf_virb3ify_assertion_content(assertion), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw90$XML_SUMMARY, scoop_xml_assert_writer((SubLObject)rkf_collaborator_scoop.NIL, assertions_high.asserted_by(assertion), assertion)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 16837L)
    public static SubLObject rkf_virb3ify_unassert_message(final SubLObject el_formula, final SubLObject mt, final SubLObject sme) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw48$ASSERTION, ConsesLow.append(rkf_virb3ify_unassert_content(el_formula, mt), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw90$XML_SUMMARY, scoop_xml_unassert_writer((SubLObject)rkf_collaborator_scoop.NIL, sme, el_formula)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 17314L)
    public static SubLObject rkf_virb3ify_connection() {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw94$CONNECTION, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw95$ADDRESS, rkf_collaborator_scoop.$rkf_scoop_associate_machine$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw96$PORT, rkf_collaborator_scoop.$rkf_scoop_associate_port$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 17682L)
    public static SubLObject rkf_virb3ify_mts(final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw97$MTS, (SubLObject)ConsesLow.list(rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw98$INTERACTION_DOMAIN_MT, domain_mt), rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw99$INTERACTION_LEXICAL_MT, lexical_mt), rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw100$INTERACTION_PARSING_MT, parsing_mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 18086L)
    public static SubLObject rkf_virb3ify_session_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt, final SubLObject loginP) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw101$SESSION, (SubLObject)ConsesLow.list(rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw40$SME, sme), rkf_virb3ify_mts(domain_mt, lexical_mt, parsing_mt), rkf_virb3ify_connection(), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw90$XML_SUMMARY, (rkf_collaborator_scoop.NIL != loginP) ? scoop_xml_login_writer((SubLObject)rkf_collaborator_scoop.NIL, sme, domain_mt) : scoop_xml_logout_writer((SubLObject)rkf_collaborator_scoop.NIL, sme, domain_mt))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 18613L)
    public static SubLObject rkf_virb3ify_constant_assemble_pieces(final SubLObject name, final SubLObject guid) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw102$CONSTANT, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw103$NAME, name), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw104$GUID, Guids.guid_to_string(guid)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 18830L)
    public static SubLObject rkf_virb3ify_constant(final SubLObject constant) {
        return rkf_virb3ify_constant_assemble_pieces(constants_high.constant_name(constant), constants_high.constant_guid(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 19000L)
    public static SubLObject rkf_virb3ify_expression(final SubLObject expr) {
        if (expr.isSymbol()) {
            return expr;
        }
        if (rkf_collaborator_scoop.NIL != constant_handles.constant_p(expr)) {
            return rkf_virb3ify_constant(expr);
        }
        if (rkf_collaborator_scoop.NIL != nart_handles.nart_p(expr)) {
            return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw105$NART, rkf_virb3ify_expression(narts_high.nart_el_formula(expr)));
        }
        if (expr.isAtom()) {
            return expr;
        }
        return (SubLObject)ConsesLow.cons(rkf_virb3ify_expression(expr.first()), rkf_virb3ify_expression(expr.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 19397L)
    public static SubLObject rkf_virb3ify_labeled_expression(final SubLObject label, final SubLObject expression) {
        return (SubLObject)ConsesLow.list(label, rkf_virb3ify_expression(expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 19527L)
    public static SubLObject rkf_virb3ify_formula(final SubLObject expression) {
        return rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw106$FORMULA, expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 19646L)
    public static SubLObject rkf_virb3ify_mt(final SubLObject mt, SubLObject mt_label) {
        if (mt_label == rkf_collaborator_scoop.UNPROVIDED) {
            mt_label = (SubLObject)rkf_collaborator_scoop.$kw50$MT;
        }
        return rkf_virb3ify_labeled_expression(mt_label, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 19767L)
    public static SubLObject rkf_virb3ify_assertion_direction(final SubLObject direction) {
        SubLObject direction_fort = (SubLObject)rkf_collaborator_scoop.NIL;
        if (direction.eql((SubLObject)rkf_collaborator_scoop.$kw107$FORWARD)) {
            direction_fort = rkf_collaborator_scoop.$const108$Forward_AssertionDirection;
        }
        else if (direction.eql((SubLObject)rkf_collaborator_scoop.$kw109$BACKWARD)) {
            direction_fort = rkf_collaborator_scoop.$const110$Backward_AssertionDirection;
        }
        else if (direction.eql((SubLObject)rkf_collaborator_scoop.$kw111$CODE)) {
            direction_fort = rkf_collaborator_scoop.$const112$Code_AssertionDirection;
        }
        return rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw113$DIRECTION, direction_fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 20197L)
    public static SubLObject rkf_virb3ify_assertion_truth(final SubLObject truth) {
        SubLObject truth_fort = (SubLObject)rkf_collaborator_scoop.NIL;
        if (truth.eql((SubLObject)rkf_collaborator_scoop.$kw114$TRUE)) {
            truth_fort = rkf_collaborator_scoop.$const115$True;
        }
        else if (truth.eql((SubLObject)rkf_collaborator_scoop.$kw116$FALSE)) {
            truth_fort = rkf_collaborator_scoop.$const117$False;
        }
        else if (truth.eql((SubLObject)rkf_collaborator_scoop.$kw118$UNKNOWN)) {
            truth_fort = rkf_collaborator_scoop.$const119$Unknown_HLTruthValue;
        }
        return rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw120$TRUTH, truth_fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 20530L)
    public static SubLObject rkf_virb3ify_assertion_strength(final SubLObject strength) {
        SubLObject strength_fort = (SubLObject)rkf_collaborator_scoop.NIL;
        if (strength.eql((SubLObject)rkf_collaborator_scoop.$kw121$DEFAULT)) {
            strength_fort = rkf_collaborator_scoop.$const122$Default_JustificationStrength;
        }
        else if (strength.eql((SubLObject)rkf_collaborator_scoop.$kw123$MONOTONIC)) {
            strength_fort = rkf_collaborator_scoop.$const124$Monotonic_JustificationStrength;
        }
        return rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw125$STRENGTH, strength_fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 20880L)
    public static SubLObject rkf_virb3ify_timestamp(final SubLObject date, final SubLObject seconds) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw126$TIMESTAMP, (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw127$DATE, date), (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw128$SECS, seconds));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 21030L)
    public static SubLObject rkf_virb3ify_assertion_content(final SubLObject assertion) {
        return (SubLObject)ConsesLow.list(rkf_virb3ify_formula(uncanonicalizer.assertion_el_formula(assertion)), rkf_virb3ify_mt(assertions_high.assertion_mt(assertion), (SubLObject)rkf_collaborator_scoop.UNPROVIDED), rkf_virb3ify_labeled_expression((SubLObject)rkf_collaborator_scoop.$kw89$CREATOR, assertions_high.asserted_by(assertion)), rkf_virb3ify_assertion_direction(assertions_high.assertion_direction(assertion)), rkf_virb3ify_assertion_truth(assertions_high.assertion_truth(assertion)), rkf_virb3ify_assertion_strength(assertions_high.assertion_strength(assertion)), rkf_virb3ify_timestamp(assertions_high.asserted_when(assertion), assertions_high.asserted_second(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 21696L)
    public static SubLObject rkf_virb3ify_assertion(final SubLObject assertion) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw48$ASSERTION, rkf_virb3ify_assertion_content(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 21837L)
    public static SubLObject rkf_virb3ify_unassertion(final SubLObject el_formula, final SubLObject mt) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_collaborator_scoop.$kw48$ASSERTION, rkf_virb3ify_unassert_content(el_formula, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 21986L)
    public static SubLObject rkf_virb3ify_unassert_content(final SubLObject el_formula, final SubLObject mt) {
        return (SubLObject)ConsesLow.list(rkf_virb3ify_formula(el_formula), rkf_virb3ify_mt(mt, (SubLObject)rkf_collaborator_scoop.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 22594L)
    public static SubLObject scoop_xml_login_writer(final SubLObject stream, final SubLObject sme, final SubLObject mt) {
        return PrintLow.format(stream, rkf_collaborator_scoop.$scoop_xml_template_login$.getGlobalValue(), new SubLObject[] { kb_paths.fort_name(sme), kb_paths.fort_name(mt), rkf_collaborator_scoop.$rkf_scoop_associate_machine$.getGlobalValue(), rkf_collaborator_scoop.$rkf_scoop_associate_port$.getGlobalValue() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 23217L)
    public static SubLObject scoop_xml_logout_writer(final SubLObject stream, final SubLObject sme, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return PrintLow.format(stream, rkf_collaborator_scoop.$scoop_xml_template_logout$.getGlobalValue(), new SubLObject[] { kb_paths.fort_name(sme), kb_paths.fort_name(mt), Environment.get_network_name((SubLObject)rkf_collaborator_scoop.UNPROVIDED), rkf_collaborator_scoop.$scoop_server_port$.getDynamicValue(thread) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 23731L)
    public static SubLObject scoop_xml_create_writer(final SubLObject stream, final SubLObject sme, final SubLObject fort) {
        return PrintLow.format(stream, rkf_collaborator_scoop.$scoop_xml_template_create$.getGlobalValue(), kb_paths.fort_name(sme), kb_paths.fort_name(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 24180L)
    public static SubLObject scoop_xml_delete_writer(final SubLObject stream, final SubLObject sme, final SubLObject fort_name) {
        return PrintLow.format(stream, rkf_collaborator_scoop.$scoop_xml_template_delete$.getGlobalValue(), kb_paths.fort_name(sme), fort_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 24653L)
    public static SubLObject scoop_xml_cycl_expression(final SubLObject expr) {
        if (expr.isSymbol()) {
            return expr;
        }
        if (rkf_collaborator_scoop.NIL != constant_handles.constant_p(expr)) {
            return expr;
        }
        if (rkf_collaborator_scoop.NIL != nart_handles.nart_p(expr)) {
            return el_utilities.copy_formula(narts_high.nart_el_formula(expr));
        }
        if (expr.isAtom()) {
            return expr;
        }
        return (SubLObject)ConsesLow.cons(scoop_xml_cycl_expression(expr.first()), scoop_xml_cycl_expression(expr.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25065L)
    public static SubLObject scoop_xml_assert_writer(final SubLObject stream, final SubLObject sme, final SubLObject assertion) {
        return PrintLow.format(stream, rkf_collaborator_scoop.$scoop_xml_template_assert$.getGlobalValue(), kb_paths.fort_name(sme), scoop_xml_cycl_expression(uncanonicalizer.assertion_el_formula(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25654L)
    public static SubLObject scoop_xml_unassert_writer(final SubLObject stream, final SubLObject sme, final SubLObject el_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return PrintLow.format(stream, rkf_collaborator_scoop.$scoop_xml_template_unassert$.getGlobalValue(), new SubLObject[] { kb_paths.fort_name(sme), el_formula, Environment.get_network_name((SubLObject)rkf_collaborator_scoop.UNPROVIDED), rkf_collaborator_scoop.$scoop_server_port$.getDynamicValue(thread) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject scoop_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_collaborator_scoop.ZERO_INTEGER);
        return (SubLObject)rkf_collaborator_scoop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject scoop_session_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $scoop_session_native.class) ? rkf_collaborator_scoop.T : rkf_collaborator_scoop.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject scoop_session_machine(final SubLObject v_object) {
        assert rkf_collaborator_scoop.NIL != scoop_session_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject scoop_session_port(final SubLObject v_object) {
        assert rkf_collaborator_scoop.NIL != scoop_session_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject scoop_session_tcp_server(final SubLObject v_object) {
        assert rkf_collaborator_scoop.NIL != scoop_session_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject scoop_session_initialized_p(final SubLObject v_object) {
        assert rkf_collaborator_scoop.NIL != scoop_session_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject _csetf_scoop_session_machine(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_scoop.NIL != scoop_session_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject _csetf_scoop_session_port(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_scoop.NIL != scoop_session_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject _csetf_scoop_session_tcp_server(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_scoop.NIL != scoop_session_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject _csetf_scoop_session_initialized_p(final SubLObject v_object, final SubLObject value) {
        assert rkf_collaborator_scoop.NIL != scoop_session_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject make_scoop_session(SubLObject arglist) {
        if (arglist == rkf_collaborator_scoop.UNPROVIDED) {
            arglist = (SubLObject)rkf_collaborator_scoop.NIL;
        }
        final SubLObject v_new = (SubLObject)new $scoop_session_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_collaborator_scoop.NIL, next = arglist; rkf_collaborator_scoop.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw165$MACHINE)) {
                _csetf_scoop_session_machine(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw96$PORT)) {
                _csetf_scoop_session_port(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw166$TCP_SERVER)) {
                _csetf_scoop_session_tcp_server(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_collaborator_scoop.$kw167$INITIALIZED_P)) {
                _csetf_scoop_session_initialized_p(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_collaborator_scoop.$str168$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject visit_defstruct_scoop_session(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_scoop.$kw169$BEGIN, (SubLObject)rkf_collaborator_scoop.$sym170$MAKE_SCOOP_SESSION, (SubLObject)rkf_collaborator_scoop.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_scoop.$kw171$SLOT, (SubLObject)rkf_collaborator_scoop.$kw165$MACHINE, scoop_session_machine(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_scoop.$kw171$SLOT, (SubLObject)rkf_collaborator_scoop.$kw96$PORT, scoop_session_port(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_scoop.$kw171$SLOT, (SubLObject)rkf_collaborator_scoop.$kw166$TCP_SERVER, scoop_session_tcp_server(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_scoop.$kw171$SLOT, (SubLObject)rkf_collaborator_scoop.$kw167$INITIALIZED_P, scoop_session_initialized_p(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_collaborator_scoop.$kw172$END, (SubLObject)rkf_collaborator_scoop.$sym170$MAKE_SCOOP_SESSION, (SubLObject)rkf_collaborator_scoop.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
    public static SubLObject visit_defstruct_object_scoop_session_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_scoop_session(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 26100L)
    public static SubLObject scoop_session_initializedP(final SubLObject scoop_session) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_collaborator_scoop.NIL != scoop_session_p(scoop_session) && rkf_collaborator_scoop.NIL != tcp_server_utilities.tcp_server_p(scoop_session_tcp_server(scoop_session)) && rkf_collaborator_scoop.NIL != scoop_session_initialized_p(scoop_session));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 26334L)
    public static SubLObject new_scoop_session(final SubLObject machine, final SubLObject port) {
        final SubLObject scoops = make_scoop_session((SubLObject)rkf_collaborator_scoop.UNPROVIDED);
        _csetf_scoop_session_machine(scoops, machine);
        _csetf_scoop_session_port(scoops, port);
        return scoops;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 26542L)
    public static SubLObject restart_scoop_session(final SubLObject scoops) {
        shutdown_scoop_session(scoops);
        initialize_scoop_definitions();
        _csetf_scoop_session_tcp_server(scoops, tcp_server_utilities.enable_tcp_server((SubLObject)rkf_collaborator_scoop.$kw2$SCOOP, scoop_session_port(scoops)));
        _csetf_scoop_session_initialized_p(scoops, tcp_server_utilities.tcp_server_p(scoop_session_tcp_server(scoops)));
        return scoop_session_initializedP(scoops);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 26915L)
    public static SubLObject initialize_scoop_session(final SubLObject machine, final SubLObject port) {
        final SubLObject scoops = new_scoop_session(machine, port);
        restart_scoop_session(scoops);
        return scoops;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 27077L)
    public static SubLObject shutdown_scoop_session(final SubLObject scoops) {
        tcp_server_utilities.disable_tcp_server(scoop_session_port(scoops));
        _csetf_scoop_session_tcp_server(scoops, (SubLObject)rkf_collaborator_scoop.NIL);
        _csetf_scoop_session_initialized_p(scoops, (SubLObject)rkf_collaborator_scoop.NIL);
        return scoops;
    }
    
    public static SubLObject declare_rkf_collaborator_scoop_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_server_handler", "SCOOP-SERVER-HANDLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_server_top_level", "SCOOP-SERVER-TOP-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "initialize_scoop_definitions", "INITIALIZE-SCOOP-DEFINITIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_definition_emid_by_type", "SCOOP-DEFINITION-EMID-BY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_trace", "SCOOP-TRACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_trace_display_trace_stack", "SCOOP-TRACE-DISPLAY-TRACE-STACK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_server_handler_internal", "SCOOP-SERVER-HANDLER-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_process_invite_all", "SCOOP-PROCESS-INVITE-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_process_invitation", "SCOOP-PROCESS-INVITATION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "new_scoop_message_packet", "NEW-SCOOP-MESSAGE-PACKET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "get_scoop_message_packet_type", "GET-SCOOP-MESSAGE-PACKET-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "get_scoop_message_packet_arguments", "GET-SCOOP-MESSAGE-PACKET-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "get_scoop_message_packet_arg", "GET-SCOOP-MESSAGE-PACKET-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_schedule_outgoing_message_packet", "SCOOP-SCHEDULE-OUTGOING-MESSAGE-PACKET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_fetch_next_outgoing_message_packet", "SCOOP-FETCH-NEXT-OUTGOING-MESSAGE-PACKET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_schedule_login_message", "SCOOP-SCHEDULE-LOGIN-MESSAGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_schedule_logout_message", "SCOOP-SCHEDULE-LOGOUT-MESSAGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_schedule_create_message", "SCOOP-SCHEDULE-CREATE-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_schedule_kill_message", "SCOOP-SCHEDULE-KILL-MESSAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_schedule_assert_message", "SCOOP-SCHEDULE-ASSERT-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_schedule_unassert_message", "SCOOP-SCHEDULE-UNASSERT-MESSAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_schedule_trace_message", "SCOOP-SCHEDULE-TRACE-MESSAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_schedule_quit_message", "SCOOP-SCHEDULE-QUIT-MESSAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_message_forwarder", "SCOOP-MESSAGE-FORWARDER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_spawn_listener", "SCOOP-SPAWN-LISTENER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_reply_posting_listener", "SCOOP-REPLY-POSTING-LISTENER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "read_scoop_server_request", "READ-SCOOP-SERVER-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "write_scoop_server_reaction", "WRITE-SCOOP-SERVER-REACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_scoop_message_login", "RKF-SCOOP-MESSAGE-LOGIN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_scoop_message_logout", "RKF-SCOOP-MESSAGE-LOGOUT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_scoop_message_create", "RKF-SCOOP-MESSAGE-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_scoop_message_kill", "RKF-SCOOP-MESSAGE-KILL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_scoop_message_assert", "RKF-SCOOP-MESSAGE-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_scoop_message_unassert", "RKF-SCOOP-MESSAGE-UNASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_login_message", "RKF-VIRB3IFY-LOGIN-MESSAGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_logout_message", "RKF-VIRB3IFY-LOGOUT-MESSAGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_create_message", "RKF-VIRB3IFY-CREATE-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_delete_message", "RKF-VIRB3IFY-DELETE-MESSAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_assert_message", "RKF-VIRB3IFY-ASSERT-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_unassert_message", "RKF-VIRB3IFY-UNASSERT-MESSAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_connection", "RKF-VIRB3IFY-CONNECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_mts", "RKF-VIRB3IFY-MTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_session_message", "RKF-VIRB3IFY-SESSION-MESSAGE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_constant_assemble_pieces", "RKF-VIRB3IFY-CONSTANT-ASSEMBLE-PIECES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_constant", "RKF-VIRB3IFY-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_expression", "RKF-VIRB3IFY-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_labeled_expression", "RKF-VIRB3IFY-LABELED-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_formula", "RKF-VIRB3IFY-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_mt", "RKF-VIRB3IFY-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_assertion_direction", "RKF-VIRB3IFY-ASSERTION-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_assertion_truth", "RKF-VIRB3IFY-ASSERTION-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_assertion_strength", "RKF-VIRB3IFY-ASSERTION-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_timestamp", "RKF-VIRB3IFY-TIMESTAMP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_assertion_content", "RKF-VIRB3IFY-ASSERTION-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_assertion", "RKF-VIRB3IFY-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_unassertion", "RKF-VIRB3IFY-UNASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "rkf_virb3ify_unassert_content", "RKF-VIRB3IFY-UNASSERT-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_xml_login_writer", "SCOOP-XML-LOGIN-WRITER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_xml_logout_writer", "SCOOP-XML-LOGOUT-WRITER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_xml_create_writer", "SCOOP-XML-CREATE-WRITER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_xml_delete_writer", "SCOOP-XML-DELETE-WRITER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_xml_cycl_expression", "SCOOP-XML-CYCL-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_xml_assert_writer", "SCOOP-XML-ASSERT-WRITER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_xml_unassert_writer", "SCOOP-XML-UNASSERT-WRITER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_session_print_function_trampoline", "SCOOP-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_session_p", "SCOOP-SESSION-P", 1, 0, false);
        new $scoop_session_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_session_machine", "SCOOP-SESSION-MACHINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_session_port", "SCOOP-SESSION-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_session_tcp_server", "SCOOP-SESSION-TCP-SERVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_session_initialized_p", "SCOOP-SESSION-INITIALIZED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "_csetf_scoop_session_machine", "_CSETF-SCOOP-SESSION-MACHINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "_csetf_scoop_session_port", "_CSETF-SCOOP-SESSION-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "_csetf_scoop_session_tcp_server", "_CSETF-SCOOP-SESSION-TCP-SERVER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "_csetf_scoop_session_initialized_p", "_CSETF-SCOOP-SESSION-INITIALIZED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "make_scoop_session", "MAKE-SCOOP-SESSION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "visit_defstruct_scoop_session", "VISIT-DEFSTRUCT-SCOOP-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "visit_defstruct_object_scoop_session_method", "VISIT-DEFSTRUCT-OBJECT-SCOOP-SESSION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "scoop_session_initializedP", "SCOOP-SESSION-INITIALIZED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "new_scoop_session", "NEW-SCOOP-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "restart_scoop_session", "RESTART-SCOOP-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "initialize_scoop_session", "INITIALIZE-SCOOP-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_collaborator_scoop", "shutdown_scoop_session", "SHUTDOWN-SCOOP-SESSION", 1, 0, false);
        return (SubLObject)rkf_collaborator_scoop.NIL;
    }
    
    public static SubLObject init_rkf_collaborator_scoop_file() {
        rkf_collaborator_scoop.$within_scoop_server$ = SubLFiles.defparameter("*WITHIN-SCOOP-SERVER*", (SubLObject)rkf_collaborator_scoop.NIL);
        rkf_collaborator_scoop.$scoop_server_port$ = SubLFiles.defparameter("*SCOOP-SERVER-PORT*", (SubLObject)rkf_collaborator_scoop.$int0$3599);
        rkf_collaborator_scoop.$scoop_server_machine$ = SubLFiles.defparameter("*SCOOP-SERVER-MACHINE*", (SubLObject)rkf_collaborator_scoop.$str1$BOOTLEG_CYC_COM);
        rkf_collaborator_scoop.$use_virb3_for_scoop$ = SubLFiles.defparameter("*USE-VIRB3-FOR-SCOOP*", (SubLObject)rkf_collaborator_scoop.NIL);
        rkf_collaborator_scoop.$scoop_appname$ = SubLFiles.deflexical("*SCOOP-APPNAME*", (SubLObject)rkf_collaborator_scoop.$str8$KRAKEN);
        rkf_collaborator_scoop.$scoop_definitions$ = SubLFiles.deflexical("*SCOOP-DEFINITIONS*", (SubLObject)(maybeDefault((SubLObject)rkf_collaborator_scoop.$sym9$_SCOOP_DEFINITIONS_, rkf_collaborator_scoop.$scoop_definitions$, rkf_collaborator_scoop.NIL)));
        rkf_collaborator_scoop.$scoop_members$ = SubLFiles.deflexical("*SCOOP-MEMBERS*", (SubLObject)(maybeDefault((SubLObject)rkf_collaborator_scoop.$sym10$_SCOOP_MEMBERS_, rkf_collaborator_scoop.$scoop_members$, rkf_collaborator_scoop.NIL)));
        rkf_collaborator_scoop.$scoop_incoming_queue$ = SubLFiles.deflexical("*SCOOP-INCOMING-QUEUE*", process_utilities.new_ipc_queue((SubLObject)rkf_collaborator_scoop.$str29$SCOOP_Incoming_VirB3_Queue));
        rkf_collaborator_scoop.$scoop_outgoing_queue$ = SubLFiles.deflexical("*SCOOP-OUTGOING-QUEUE*", process_utilities.new_ipc_queue((SubLObject)rkf_collaborator_scoop.$str30$SCOOP_Outgoing_VirB3_Queue));
        rkf_collaborator_scoop.$scoop_sid$ = SubLFiles.defparameter("*SCOOP-SID*", (SubLObject)rkf_collaborator_scoop.NIL);
        rkf_collaborator_scoop.$scoop_tid$ = SubLFiles.defparameter("*SCOOP-TID*", (SubLObject)rkf_collaborator_scoop.NIL);
        rkf_collaborator_scoop.$scoop_transaction_stack$ = SubLFiles.defparameter("*SCOOP-TRANSACTION-STACK*", (SubLObject)rkf_collaborator_scoop.NIL);
        rkf_collaborator_scoop.$rkf_scoop_associate_machine$ = SubLFiles.deflexical("*RKF-SCOOP-ASSOCIATE-MACHINE*", (SubLObject)rkf_collaborator_scoop.$str92$nautilus_cyc_com);
        rkf_collaborator_scoop.$rkf_scoop_associate_port$ = SubLFiles.deflexical("*RKF-SCOOP-ASSOCIATE-PORT*", (SubLObject)rkf_collaborator_scoop.$int93$3621);
        rkf_collaborator_scoop.$scoop_xml_newline$ = SubLFiles.deflexical("*SCOOP-XML-NEWLINE*", Strings.make_string((SubLObject)rkf_collaborator_scoop.ONE_INTEGER, (SubLObject)Characters.CHAR_newline));
        rkf_collaborator_scoop.$scoop_xml_template_login$ = SubLFiles.deflexical("*SCOOP-XML-TEMPLATE-LOGIN*", Sequences.cconcatenate((SubLObject)rkf_collaborator_scoop.$str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { rkf_collaborator_scoop.$str130$_SCOOP_, rkf_collaborator_scoop.$str131$_action_login__action_, rkf_collaborator_scoop.$str132$_user__A__user_, rkf_collaborator_scoop.$str133$_microTheory__A__microTheory_, rkf_collaborator_scoop.$str134$_clientAddress__A__clientAddress_, rkf_collaborator_scoop.$str135$_clientPort__A__clientPort_, rkf_collaborator_scoop.$str136$__SCOOP_ }));
        rkf_collaborator_scoop.$scoop_xml_template_logout$ = SubLFiles.deflexical("*SCOOP-XML-TEMPLATE-LOGOUT*", Sequences.cconcatenate((SubLObject)rkf_collaborator_scoop.$str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { rkf_collaborator_scoop.$str130$_SCOOP_, rkf_collaborator_scoop.$str137$_action_logout__action_, rkf_collaborator_scoop.$str132$_user__A__user_, rkf_collaborator_scoop.$str133$_microTheory__A__microTheory_, rkf_collaborator_scoop.$str134$_clientAddress__A__clientAddress_, rkf_collaborator_scoop.$str135$_clientPort__A__clientPort_, rkf_collaborator_scoop.$str136$__SCOOP_ }));
        rkf_collaborator_scoop.$scoop_xml_template_create$ = SubLFiles.deflexical("*SCOOP-XML-TEMPLATE-CREATE*", Sequences.cconcatenate((SubLObject)rkf_collaborator_scoop.$str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { rkf_collaborator_scoop.$str130$_SCOOP_, rkf_collaborator_scoop.$str138$_action_create__action_, rkf_collaborator_scoop.$str132$_user__A__user_, rkf_collaborator_scoop.$str139$_constant__A__constant_, rkf_collaborator_scoop.$str136$__SCOOP_ }));
        rkf_collaborator_scoop.$scoop_xml_template_delete$ = SubLFiles.deflexical("*SCOOP-XML-TEMPLATE-DELETE*", Sequences.cconcatenate((SubLObject)rkf_collaborator_scoop.$str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { rkf_collaborator_scoop.$str130$_SCOOP_, rkf_collaborator_scoop.$str140$_action_delete__action_, rkf_collaborator_scoop.$str132$_user__A__user_, rkf_collaborator_scoop.$str139$_constant__A__constant_, rkf_collaborator_scoop.$str136$__SCOOP_ }));
        rkf_collaborator_scoop.$scoop_xml_template_assert$ = SubLFiles.deflexical("*SCOOP-XML-TEMPLATE-ASSERT*", Sequences.cconcatenate((SubLObject)rkf_collaborator_scoop.$str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { rkf_collaborator_scoop.$str130$_SCOOP_, rkf_collaborator_scoop.$str141$_action_assert__action_, rkf_collaborator_scoop.$str132$_user__A__user_, rkf_collaborator_scoop.$str142$_statement_, rkf_collaborator_scoop.$str143$_A, rkf_collaborator_scoop.$str144$__statement_, rkf_collaborator_scoop.$str136$__SCOOP_ }));
        rkf_collaborator_scoop.$scoop_xml_template_unassert$ = SubLFiles.deflexical("*SCOOP-XML-TEMPLATE-UNASSERT*", Sequences.cconcatenate((SubLObject)rkf_collaborator_scoop.$str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { rkf_collaborator_scoop.$str130$_SCOOP_, rkf_collaborator_scoop.$str145$_action_unassert__action_, rkf_collaborator_scoop.$str132$_user__A__user_, rkf_collaborator_scoop.$str146$_statement__A__statement_, rkf_collaborator_scoop.$str134$_clientAddress__A__clientAddress_, rkf_collaborator_scoop.$str147$_clientPort__D__clientPort_, rkf_collaborator_scoop.$str136$__SCOOP_ }));
        rkf_collaborator_scoop.$dtp_scoop_session$ = SubLFiles.defconstant("*DTP-SCOOP-SESSION*", (SubLObject)rkf_collaborator_scoop.$sym148$SCOOP_SESSION);
        return (SubLObject)rkf_collaborator_scoop.NIL;
    }
    
    public static SubLObject setup_rkf_collaborator_scoop_file() {
        tcp_server_utilities.register_tcp_server_type((SubLObject)rkf_collaborator_scoop.$kw2$SCOOP, (SubLObject)rkf_collaborator_scoop.$sym3$SCOOP_SERVER_HANDLER, (SubLObject)rkf_collaborator_scoop.$kw4$TEXT);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_collaborator_scoop.$sym9$_SCOOP_DEFINITIONS_);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_collaborator_scoop.$sym10$_SCOOP_MEMBERS_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_collaborator_scoop.$dtp_scoop_session$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_collaborator_scoop.$sym155$SCOOP_SESSION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_collaborator_scoop.$list156);
        Structures.def_csetf((SubLObject)rkf_collaborator_scoop.$sym157$SCOOP_SESSION_MACHINE, (SubLObject)rkf_collaborator_scoop.$sym158$_CSETF_SCOOP_SESSION_MACHINE);
        Structures.def_csetf((SubLObject)rkf_collaborator_scoop.$sym159$SCOOP_SESSION_PORT, (SubLObject)rkf_collaborator_scoop.$sym160$_CSETF_SCOOP_SESSION_PORT);
        Structures.def_csetf((SubLObject)rkf_collaborator_scoop.$sym161$SCOOP_SESSION_TCP_SERVER, (SubLObject)rkf_collaborator_scoop.$sym162$_CSETF_SCOOP_SESSION_TCP_SERVER);
        Structures.def_csetf((SubLObject)rkf_collaborator_scoop.$sym163$SCOOP_SESSION_INITIALIZED_P, (SubLObject)rkf_collaborator_scoop.$sym164$_CSETF_SCOOP_SESSION_INITIALIZED_P);
        Equality.identity((SubLObject)rkf_collaborator_scoop.$sym148$SCOOP_SESSION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_collaborator_scoop.$dtp_scoop_session$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_collaborator_scoop.$sym173$VISIT_DEFSTRUCT_OBJECT_SCOOP_SESSION_METHOD));
        return (SubLObject)rkf_collaborator_scoop.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_collaborator_scoop_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_collaborator_scoop_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_collaborator_scoop_file();
    }
    
    static {
        me = (SubLFile)new rkf_collaborator_scoop();
        rkf_collaborator_scoop.$within_scoop_server$ = null;
        rkf_collaborator_scoop.$scoop_server_port$ = null;
        rkf_collaborator_scoop.$scoop_server_machine$ = null;
        rkf_collaborator_scoop.$use_virb3_for_scoop$ = null;
        rkf_collaborator_scoop.$scoop_appname$ = null;
        rkf_collaborator_scoop.$scoop_definitions$ = null;
        rkf_collaborator_scoop.$scoop_members$ = null;
        rkf_collaborator_scoop.$scoop_incoming_queue$ = null;
        rkf_collaborator_scoop.$scoop_outgoing_queue$ = null;
        rkf_collaborator_scoop.$scoop_sid$ = null;
        rkf_collaborator_scoop.$scoop_tid$ = null;
        rkf_collaborator_scoop.$scoop_transaction_stack$ = null;
        rkf_collaborator_scoop.$rkf_scoop_associate_machine$ = null;
        rkf_collaborator_scoop.$rkf_scoop_associate_port$ = null;
        rkf_collaborator_scoop.$scoop_xml_newline$ = null;
        rkf_collaborator_scoop.$scoop_xml_template_login$ = null;
        rkf_collaborator_scoop.$scoop_xml_template_logout$ = null;
        rkf_collaborator_scoop.$scoop_xml_template_create$ = null;
        rkf_collaborator_scoop.$scoop_xml_template_delete$ = null;
        rkf_collaborator_scoop.$scoop_xml_template_assert$ = null;
        rkf_collaborator_scoop.$scoop_xml_template_unassert$ = null;
        rkf_collaborator_scoop.$dtp_scoop_session$ = null;
        $int0$3599 = SubLObjectFactory.makeInteger(3599);
        $str1$BOOTLEG_CYC_COM = SubLObjectFactory.makeString("BOOTLEG.CYC.COM");
        $kw2$SCOOP = SubLObjectFactory.makeKeyword("SCOOP");
        $sym3$SCOOP_SERVER_HANDLER = SubLObjectFactory.makeSymbol("SCOOP-SERVER-HANDLER");
        $kw4$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str5$CYC = SubLObjectFactory.makeString("CYC");
        $sym6$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $kw7$SCOOP_QUIT = SubLObjectFactory.makeKeyword("SCOOP-QUIT");
        $str8$KRAKEN = SubLObjectFactory.makeString("KRAKEN");
        $sym9$_SCOOP_DEFINITIONS_ = SubLObjectFactory.makeSymbol("*SCOOP-DEFINITIONS*");
        $sym10$_SCOOP_MEMBERS_ = SubLObjectFactory.makeSymbol("*SCOOP-MEMBERS*");
        $kw11$LOGIN = SubLObjectFactory.makeKeyword("LOGIN");
        $kw12$EMNAME = SubLObjectFactory.makeKeyword("EMNAME");
        $str13$SCOOP_Login_Monitor = SubLObjectFactory.makeString("SCOOP Login Monitor");
        $kw14$APPNAME = SubLObjectFactory.makeKeyword("APPNAME");
        $kw15$EMID = SubLObjectFactory.makeKeyword("EMID");
        $kw16$LOGOUT = SubLObjectFactory.makeKeyword("LOGOUT");
        $str17$SCOOP_Logout_Monitor = SubLObjectFactory.makeString("SCOOP Logout Monitor");
        $kw18$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $str19$SCOOP_Create_Monitor = SubLObjectFactory.makeString("SCOOP Create Monitor");
        $kw20$DELETE = SubLObjectFactory.makeKeyword("DELETE");
        $str21$SCOOP_Delete_Monitor = SubLObjectFactory.makeString("SCOOP Delete Monitor");
        $kw22$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $str23$SCOOP_Assert_Monitor = SubLObjectFactory.makeString("SCOOP Assert Monitor");
        $kw24$UNASSERT = SubLObjectFactory.makeKeyword("UNASSERT");
        $str25$SCOOP_Unassert_Monitor = SubLObjectFactory.makeString("SCOOP Unassert Monitor");
        $kw26$CONFLICT = SubLObjectFactory.makeKeyword("CONFLICT");
        $str27$SCOOP_Conflict_Voter = SubLObjectFactory.makeString("SCOOP Conflict Voter");
        $sym28$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str29$SCOOP_Incoming_VirB3_Queue = SubLObjectFactory.makeString("SCOOP Incoming VirB3 Queue");
        $str30$SCOOP_Outgoing_VirB3_Queue = SubLObjectFactory.makeString("SCOOP Outgoing VirB3 Queue");
        $str31$SCOOP___A__ = SubLObjectFactory.makeString("SCOOP: ~A~%");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("EMNAME"), (SubLObject)SubLObjectFactory.makeSymbol("APPNAME"), (SubLObject)SubLObjectFactory.makeSymbol("EMID"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMNAME"), (SubLObject)SubLObjectFactory.makeKeyword("APPNAME"), (SubLObject)SubLObjectFactory.makeKeyword("EMID"));
        $kw34$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw35$INVITE = SubLObjectFactory.makeKeyword("INVITE");
        $kw36$SID = SubLObjectFactory.makeKeyword("SID");
        $kw37$TID = SubLObjectFactory.makeKeyword("TID");
        $kw38$MESSAGE_TYPE = SubLObjectFactory.makeKeyword("MESSAGE-TYPE");
        $kw39$MESSAGE_ARGS = SubLObjectFactory.makeKeyword("MESSAGE-ARGS");
        $kw40$SME = SubLObjectFactory.makeKeyword("SME");
        $kw41$DOMAIN_MT = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $kw42$LEXICAL_MT = SubLObjectFactory.makeKeyword("LEXICAL-MT");
        $kw43$PARSING_MT = SubLObjectFactory.makeKeyword("PARSING-MT");
        $kw44$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw45$TERM_NAME = SubLObjectFactory.makeKeyword("TERM-NAME");
        $kw46$TERM_GUID = SubLObjectFactory.makeKeyword("TERM-GUID");
        $kw47$WHO_DUNNIT = SubLObjectFactory.makeKeyword("WHO-DUNNIT");
        $kw48$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw49$EL_FORMULA = SubLObjectFactory.makeKeyword("EL-FORMULA");
        $kw50$MT = SubLObjectFactory.makeKeyword("MT");
        $kw51$TRACE = SubLObjectFactory.makeKeyword("TRACE");
        $kw52$QUIT = SubLObjectFactory.makeKeyword("QUIT");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SME"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICAL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("PARSING-MT"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SME"), (SubLObject)SubLObjectFactory.makeKeyword("DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICAL-MT"), (SubLObject)SubLObjectFactory.makeKeyword("PARSING-MT"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-GUID"), (SubLObject)SubLObjectFactory.makeSymbol("WHO-DUNNIT"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TERM-GUID"), (SubLObject)SubLObjectFactory.makeKeyword("WHO-DUNNIT"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("WHO-DUNNIT"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EL-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("WHO-DUNNIT"));
        $str63$Protocol_violation____cannot_hand = SubLObjectFactory.makeString("Protocol violation -- cannot handle message packet ~A.");
        $kw64$DONE = SubLObjectFactory.makeKeyword("DONE");
        $str65$Scoop_Listener = SubLObjectFactory.makeString("Scoop Listener");
        $sym66$SCOOP_REPLY_POSTING_LISTENER = SubLObjectFactory.makeSymbol("SCOOP-REPLY-POSTING-LISTENER");
        $kw67$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str68$The_connection_with_SCOOP_dropped = SubLObjectFactory.makeString("The connection with SCOOP dropped.");
        $kw69$EOF = SubLObjectFactory.makeKeyword("EOF");
        $kw70$DISCONNECT = SubLObjectFactory.makeKeyword("DISCONNECT");
        $str71$Scoop_errored_out_and_generated_a = SubLObjectFactory.makeString("Scoop errored out and generated a disconnect message.");
        $str72$Protocol_violation____received__A = SubLObjectFactory.makeString("Protocol violation -- received ~A instead of a valid message.");
        $kw73$ACCEPT = SubLObjectFactory.makeKeyword("ACCEPT");
        $str74$SCOOP_accepted_with__A__ = SubLObjectFactory.makeString("SCOOP accepted with ~A~%");
        $kw75$PROPOSE = SubLObjectFactory.makeKeyword("PROPOSE");
        $kw76$CONTRIBUTE = SubLObjectFactory.makeKeyword("CONTRIBUTE");
        $kw77$STIMULATE = SubLObjectFactory.makeKeyword("STIMULATE");
        $kw78$PROPID = SubLObjectFactory.makeKeyword("PROPID");
        $kw79$AAL = SubLObjectFactory.makeKeyword("AAL");
        $sym80$_ACTION = SubLObjectFactory.makeSymbol("?ACTION");
        $str81$UIA_START_SESSION = SubLObjectFactory.makeString("UIA-START-SESSION");
        $sym82$_THE_POSTING = SubLObjectFactory.makeSymbol("?THE-POSTING");
        $str83$POSTING = SubLObjectFactory.makeString("POSTING");
        $str84$UIA_STOP_SESSION = SubLObjectFactory.makeString("UIA-STOP-SESSION");
        $str85$UIA_CREATE = SubLObjectFactory.makeString("UIA-CREATE");
        $str86$UIA_KILL = SubLObjectFactory.makeString("UIA-KILL");
        $str87$UIA_ASSERT = SubLObjectFactory.makeString("UIA-ASSERT");
        $str88$UIA_UNASSERT = SubLObjectFactory.makeString("UIA-UNASSERT");
        $kw89$CREATOR = SubLObjectFactory.makeKeyword("CREATOR");
        $kw90$XML_SUMMARY = SubLObjectFactory.makeKeyword("XML-SUMMARY");
        $kw91$KILL = SubLObjectFactory.makeKeyword("KILL");
        $str92$nautilus_cyc_com = SubLObjectFactory.makeString("nautilus.cyc.com");
        $int93$3621 = SubLObjectFactory.makeInteger(3621);
        $kw94$CONNECTION = SubLObjectFactory.makeKeyword("CONNECTION");
        $kw95$ADDRESS = SubLObjectFactory.makeKeyword("ADDRESS");
        $kw96$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw97$MTS = SubLObjectFactory.makeKeyword("MTS");
        $kw98$INTERACTION_DOMAIN_MT = SubLObjectFactory.makeKeyword("INTERACTION-DOMAIN-MT");
        $kw99$INTERACTION_LEXICAL_MT = SubLObjectFactory.makeKeyword("INTERACTION-LEXICAL-MT");
        $kw100$INTERACTION_PARSING_MT = SubLObjectFactory.makeKeyword("INTERACTION-PARSING-MT");
        $kw101$SESSION = SubLObjectFactory.makeKeyword("SESSION");
        $kw102$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $kw103$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw104$GUID = SubLObjectFactory.makeKeyword("GUID");
        $kw105$NART = SubLObjectFactory.makeKeyword("NART");
        $kw106$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $kw107$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $const108$Forward_AssertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Forward-AssertionDirection"));
        $kw109$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $const110$Backward_AssertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Backward-AssertionDirection"));
        $kw111$CODE = SubLObjectFactory.makeKeyword("CODE");
        $const112$Code_AssertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Code-AssertionDirection"));
        $kw113$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw114$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const115$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $kw116$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $const117$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $kw118$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $const119$Unknown_HLTruthValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unknown-HLTruthValue"));
        $kw120$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $kw121$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $const122$Default_JustificationStrength = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Default-JustificationStrength"));
        $kw123$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $const124$Monotonic_JustificationStrength = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Monotonic-JustificationStrength"));
        $kw125$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $kw126$TIMESTAMP = SubLObjectFactory.makeKeyword("TIMESTAMP");
        $kw127$DATE = SubLObjectFactory.makeKeyword("DATE");
        $kw128$SECS = SubLObjectFactory.makeKeyword("SECS");
        $str129$__xml_version__1_0__encoding__UTF = SubLObjectFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        $str130$_SCOOP_ = SubLObjectFactory.makeString("<SCOOP>");
        $str131$_action_login__action_ = SubLObjectFactory.makeString("<action>login</action>");
        $str132$_user__A__user_ = SubLObjectFactory.makeString("<user>~A</user>");
        $str133$_microTheory__A__microTheory_ = SubLObjectFactory.makeString("<microTheory>~A</microTheory>");
        $str134$_clientAddress__A__clientAddress_ = SubLObjectFactory.makeString("<clientAddress>~A</clientAddress>");
        $str135$_clientPort__A__clientPort_ = SubLObjectFactory.makeString("<clientPort>~A</clientPort>");
        $str136$__SCOOP_ = SubLObjectFactory.makeString("</SCOOP>");
        $str137$_action_logout__action_ = SubLObjectFactory.makeString("<action>logout</action>");
        $str138$_action_create__action_ = SubLObjectFactory.makeString("<action>create</action>");
        $str139$_constant__A__constant_ = SubLObjectFactory.makeString("<constant>~A</constant>");
        $str140$_action_delete__action_ = SubLObjectFactory.makeString("<action>delete</action>");
        $str141$_action_assert__action_ = SubLObjectFactory.makeString("<action>assert</action>");
        $str142$_statement_ = SubLObjectFactory.makeString("<statement>");
        $str143$_A = SubLObjectFactory.makeString("~A");
        $str144$__statement_ = SubLObjectFactory.makeString("</statement>");
        $str145$_action_unassert__action_ = SubLObjectFactory.makeString("<action>unassert</action>");
        $str146$_statement__A__statement_ = SubLObjectFactory.makeString("<statement>~A</statement>");
        $str147$_clientPort__D__clientPort_ = SubLObjectFactory.makeString("<clientPort>~D</clientPort>");
        $sym148$SCOOP_SESSION = SubLObjectFactory.makeSymbol("SCOOP-SESSION");
        $sym149$SCOOP_SESSION_P = SubLObjectFactory.makeSymbol("SCOOP-SESSION-P");
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("TCP-SERVER"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZED-P"));
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MACHINE"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("TCP-SERVER"), (SubLObject)SubLObjectFactory.makeKeyword("INITIALIZED-P"));
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCOOP-SESSION-MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("SCOOP-SESSION-PORT"), (SubLObject)SubLObjectFactory.makeSymbol("SCOOP-SESSION-TCP-SERVER"), (SubLObject)SubLObjectFactory.makeSymbol("SCOOP-SESSION-INITIALIZED-P"));
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SCOOP-SESSION-MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SCOOP-SESSION-PORT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SCOOP-SESSION-TCP-SERVER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SCOOP-SESSION-INITIALIZED-P"));
        $sym154$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym155$SCOOP_SESSION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SCOOP-SESSION-PRINT-FUNCTION-TRAMPOLINE");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SCOOP-SESSION-P"));
        $sym157$SCOOP_SESSION_MACHINE = SubLObjectFactory.makeSymbol("SCOOP-SESSION-MACHINE");
        $sym158$_CSETF_SCOOP_SESSION_MACHINE = SubLObjectFactory.makeSymbol("_CSETF-SCOOP-SESSION-MACHINE");
        $sym159$SCOOP_SESSION_PORT = SubLObjectFactory.makeSymbol("SCOOP-SESSION-PORT");
        $sym160$_CSETF_SCOOP_SESSION_PORT = SubLObjectFactory.makeSymbol("_CSETF-SCOOP-SESSION-PORT");
        $sym161$SCOOP_SESSION_TCP_SERVER = SubLObjectFactory.makeSymbol("SCOOP-SESSION-TCP-SERVER");
        $sym162$_CSETF_SCOOP_SESSION_TCP_SERVER = SubLObjectFactory.makeSymbol("_CSETF-SCOOP-SESSION-TCP-SERVER");
        $sym163$SCOOP_SESSION_INITIALIZED_P = SubLObjectFactory.makeSymbol("SCOOP-SESSION-INITIALIZED-P");
        $sym164$_CSETF_SCOOP_SESSION_INITIALIZED_P = SubLObjectFactory.makeSymbol("_CSETF-SCOOP-SESSION-INITIALIZED-P");
        $kw165$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw166$TCP_SERVER = SubLObjectFactory.makeKeyword("TCP-SERVER");
        $kw167$INITIALIZED_P = SubLObjectFactory.makeKeyword("INITIALIZED-P");
        $str168$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw169$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym170$MAKE_SCOOP_SESSION = SubLObjectFactory.makeSymbol("MAKE-SCOOP-SESSION");
        $kw171$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw172$END = SubLObjectFactory.makeKeyword("END");
        $sym173$VISIT_DEFSTRUCT_OBJECT_SCOOP_SESSION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SCOOP-SESSION-METHOD");
    }
    
    public static final class $scoop_session_native extends SubLStructNative
    {
        public SubLObject $machine;
        public SubLObject $port;
        public SubLObject $tcp_server;
        public SubLObject $initialized_p;
        private static final SubLStructDeclNative structDecl;
        
        public $scoop_session_native() {
            this.$machine = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$tcp_server = (SubLObject)CommonSymbols.NIL;
            this.$initialized_p = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$scoop_session_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$machine;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$port;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$tcp_server;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$initialized_p;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$machine = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$tcp_server = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$initialized_p = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$scoop_session_native.class, rkf_collaborator_scoop.$sym148$SCOOP_SESSION, rkf_collaborator_scoop.$sym149$SCOOP_SESSION_P, rkf_collaborator_scoop.$list150, rkf_collaborator_scoop.$list151, new String[] { "$machine", "$port", "$tcp_server", "$initialized_p" }, rkf_collaborator_scoop.$list152, rkf_collaborator_scoop.$list153, rkf_collaborator_scoop.$sym154$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $scoop_session_p$UnaryFunction extends UnaryFunction
    {
        public $scoop_session_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SCOOP-SESSION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_collaborator_scoop.scoop_session_p(arg1);
        }
    }
}

/*

	Total time: 444 ms
	
*/