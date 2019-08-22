package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.copy_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_normal_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.set_process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class rkf_collaborator_scoop extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_collaborator_scoop();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_collaborator_scoop";

    public static final String myFingerPrint = "7925d84ac1b98630089973cb45bef43fa17c935936cdf43545c9a649e3d062fe";

    // defparameter
    private static final SubLSymbol $within_scoop_server$ = makeSymbol("*WITHIN-SCOOP-SERVER*");

    // defparameter
    public static final SubLSymbol $scoop_server_port$ = makeSymbol("*SCOOP-SERVER-PORT*");

    // defparameter
    public static final SubLSymbol $scoop_server_machine$ = makeSymbol("*SCOOP-SERVER-MACHINE*");

    // defparameter
    private static final SubLSymbol $use_virb3_for_scoop$ = makeSymbol("*USE-VIRB3-FOR-SCOOP*");

    // deflexical
    private static final SubLSymbol $scoop_appname$ = makeSymbol("*SCOOP-APPNAME*");





    // deflexical
    private static final SubLSymbol $scoop_incoming_queue$ = makeSymbol("*SCOOP-INCOMING-QUEUE*");

    // deflexical
    private static final SubLSymbol $scoop_outgoing_queue$ = makeSymbol("*SCOOP-OUTGOING-QUEUE*");

    // defparameter
    private static final SubLSymbol $scoop_sid$ = makeSymbol("*SCOOP-SID*");

    // defparameter
    private static final SubLSymbol $scoop_tid$ = makeSymbol("*SCOOP-TID*");

    // defparameter
    private static final SubLSymbol $scoop_transaction_stack$ = makeSymbol("*SCOOP-TRANSACTION-STACK*");

    // deflexical
    private static final SubLSymbol $rkf_scoop_associate_machine$ = makeSymbol("*RKF-SCOOP-ASSOCIATE-MACHINE*");

    // deflexical
    private static final SubLSymbol $rkf_scoop_associate_port$ = makeSymbol("*RKF-SCOOP-ASSOCIATE-PORT*");

    // deflexical
    private static final SubLSymbol $scoop_xml_newline$ = makeSymbol("*SCOOP-XML-NEWLINE*");

    // deflexical
    private static final SubLSymbol $scoop_xml_template_login$ = makeSymbol("*SCOOP-XML-TEMPLATE-LOGIN*");

    // deflexical
    private static final SubLSymbol $scoop_xml_template_logout$ = makeSymbol("*SCOOP-XML-TEMPLATE-LOGOUT*");

    // deflexical
    private static final SubLSymbol $scoop_xml_template_create$ = makeSymbol("*SCOOP-XML-TEMPLATE-CREATE*");

    // deflexical
    private static final SubLSymbol $scoop_xml_template_delete$ = makeSymbol("*SCOOP-XML-TEMPLATE-DELETE*");

    // deflexical
    private static final SubLSymbol $scoop_xml_template_assert$ = makeSymbol("*SCOOP-XML-TEMPLATE-ASSERT*");

    // deflexical
    private static final SubLSymbol $scoop_xml_template_unassert$ = makeSymbol("*SCOOP-XML-TEMPLATE-UNASSERT*");

    // defconstant
    public static final SubLSymbol $dtp_scoop_session$ = makeSymbol("*DTP-SCOOP-SESSION*");

    private static final SubLInteger $int$3599 = makeInteger(3599);

    public static final SubLString $str1$BOOTLEG_CYC_COM = makeString("BOOTLEG.CYC.COM");



    public static final SubLSymbol SCOOP_SERVER_HANDLER = makeSymbol("SCOOP-SERVER-HANDLER");



    public static final SubLString $$$CYC = makeString("CYC");





    public static final SubLString $$$KRAKEN = makeString("KRAKEN");

    public static final SubLSymbol $scoop_definitions$ = makeSymbol("*SCOOP-DEFINITIONS*");

    public static final SubLSymbol $scoop_members$ = makeSymbol("*SCOOP-MEMBERS*");





    public static final SubLString $$$SCOOP_Login_Monitor = makeString("SCOOP Login Monitor");







    public static final SubLString $$$SCOOP_Logout_Monitor = makeString("SCOOP Logout Monitor");



    public static final SubLString $$$SCOOP_Create_Monitor = makeString("SCOOP Create Monitor");



    public static final SubLString $$$SCOOP_Delete_Monitor = makeString("SCOOP Delete Monitor");



    public static final SubLString $$$SCOOP_Assert_Monitor = makeString("SCOOP Assert Monitor");



    public static final SubLString $$$SCOOP_Unassert_Monitor = makeString("SCOOP Unassert Monitor");



    public static final SubLString $$$SCOOP_Conflict_Voter = makeString("SCOOP Conflict Voter");



    public static final SubLString $$$SCOOP_Incoming_VirB3_Queue = makeString("SCOOP Incoming VirB3 Queue");

    public static final SubLString $$$SCOOP_Outgoing_VirB3_Queue = makeString("SCOOP Outgoing VirB3 Queue");

    public static final SubLString $str31$SCOOP___A__ = makeString("SCOOP: ~A~%");

    public static final SubLList $list32 = list(makeSymbol("&KEY"), makeSymbol("EMNAME"), makeSymbol("APPNAME"), makeSymbol("EMID"));

    public static final SubLList $list33 = list(makeKeyword("EMNAME"), makeKeyword("APPNAME"), makeKeyword("EMID"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





































    public static final SubLList $list53 = list(makeSymbol("&KEY"), makeSymbol("SME"), makeSymbol("DOMAIN-MT"), makeSymbol("LEXICAL-MT"), makeSymbol("PARSING-MT"));

    public static final SubLList $list54 = list(makeKeyword("SME"), makeKeyword("DOMAIN-MT"), makeKeyword("LEXICAL-MT"), makeKeyword("PARSING-MT"));

    public static final SubLList $list55 = list(makeSymbol("&KEY"), makeSymbol("TERM"));

    public static final SubLList $list56 = list(makeKeyword("TERM"));

    public static final SubLList $list57 = list(makeSymbol("&KEY"), makeSymbol("TERM-NAME"), makeSymbol("TERM-GUID"), makeSymbol("WHO-DUNNIT"));

    public static final SubLList $list58 = list(makeKeyword("TERM-NAME"), makeKeyword("TERM-GUID"), makeKeyword("WHO-DUNNIT"));

    public static final SubLList $list59 = list(makeSymbol("&KEY"), makeSymbol("ASSERTION"));

    public static final SubLList $list60 = list(makeKeyword("ASSERTION"));

    public static final SubLList $list61 = list(makeSymbol("&KEY"), makeSymbol("EL-FORMULA"), makeSymbol("MT"), makeSymbol("WHO-DUNNIT"));

    public static final SubLList $list62 = list(makeKeyword("EL-FORMULA"), makeKeyword("MT"), makeKeyword("WHO-DUNNIT"));

    public static final SubLString $str63$Protocol_violation____cannot_hand = makeString("Protocol violation -- cannot handle message packet ~A.");



    public static final SubLString $$$Scoop_Listener = makeString("Scoop Listener");

    public static final SubLSymbol SCOOP_REPLY_POSTING_LISTENER = makeSymbol("SCOOP-REPLY-POSTING-LISTENER");



    public static final SubLString $str68$The_connection_with_SCOOP_dropped = makeString("The connection with SCOOP dropped.");





    public static final SubLString $str71$Scoop_errored_out_and_generated_a = makeString("Scoop errored out and generated a disconnect message.");

    public static final SubLString $str72$Protocol_violation____received__A = makeString("Protocol violation -- received ~A instead of a valid message.");



    public static final SubLString $str74$SCOOP_accepted_with__A__ = makeString("SCOOP accepted with ~A~%");











    public static final SubLSymbol $sym80$_ACTION = makeSymbol("?ACTION");

    public static final SubLString $str81$UIA_START_SESSION = makeString("UIA-START-SESSION");

    public static final SubLSymbol $sym82$_THE_POSTING = makeSymbol("?THE-POSTING");

    public static final SubLString $$$POSTING = makeString("POSTING");

    public static final SubLString $str84$UIA_STOP_SESSION = makeString("UIA-STOP-SESSION");

    public static final SubLString $str85$UIA_CREATE = makeString("UIA-CREATE");

    public static final SubLString $str86$UIA_KILL = makeString("UIA-KILL");

    public static final SubLString $str87$UIA_ASSERT = makeString("UIA-ASSERT");

    public static final SubLString $str88$UIA_UNASSERT = makeString("UIA-UNASSERT");







    public static final SubLString $str92$nautilus_cyc_com = makeString("nautilus.cyc.com");

    private static final SubLInteger $int$3621 = makeInteger(3621);









    private static final SubLSymbol $INTERACTION_DOMAIN_MT = makeKeyword("INTERACTION-DOMAIN-MT");

    private static final SubLSymbol $INTERACTION_LEXICAL_MT = makeKeyword("INTERACTION-LEXICAL-MT");

    private static final SubLSymbol $INTERACTION_PARSING_MT = makeKeyword("INTERACTION-PARSING-MT");















    private static final SubLObject $$Forward_AssertionDirection = reader_make_constant_shell(makeString("Forward-AssertionDirection"));



    private static final SubLObject $$Backward_AssertionDirection = reader_make_constant_shell(makeString("Backward-AssertionDirection"));



    private static final SubLObject $$Code_AssertionDirection = reader_make_constant_shell(makeString("Code-AssertionDirection"));





    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));



    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));



    private static final SubLObject $$Unknown_HLTruthValue = reader_make_constant_shell(makeString("Unknown-HLTruthValue"));





    private static final SubLObject $$Default_JustificationStrength = reader_make_constant_shell(makeString("Default-JustificationStrength"));



    private static final SubLObject $$Monotonic_JustificationStrength = reader_make_constant_shell(makeString("Monotonic-JustificationStrength"));









    public static final SubLString $str129$__xml_version__1_0__encoding__UTF = makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

    public static final SubLString $str130$_SCOOP_ = makeString("<SCOOP>");

    public static final SubLString $str131$_action_login__action_ = makeString("<action>login</action>");

    public static final SubLString $str132$_user__A__user_ = makeString("<user>~A</user>");

    public static final SubLString $str133$_microTheory__A__microTheory_ = makeString("<microTheory>~A</microTheory>");

    public static final SubLString $str134$_clientAddress__A__clientAddress_ = makeString("<clientAddress>~A</clientAddress>");

    public static final SubLString $str135$_clientPort__A__clientPort_ = makeString("<clientPort>~A</clientPort>");

    public static final SubLString $str136$__SCOOP_ = makeString("</SCOOP>");

    public static final SubLString $str137$_action_logout__action_ = makeString("<action>logout</action>");

    public static final SubLString $str138$_action_create__action_ = makeString("<action>create</action>");

    public static final SubLString $str139$_constant__A__constant_ = makeString("<constant>~A</constant>");

    public static final SubLString $str140$_action_delete__action_ = makeString("<action>delete</action>");

    public static final SubLString $str141$_action_assert__action_ = makeString("<action>assert</action>");

    public static final SubLString $str142$_statement_ = makeString("<statement>");

    public static final SubLString $str143$_A = makeString("~A");

    public static final SubLString $str144$__statement_ = makeString("</statement>");

    public static final SubLString $str145$_action_unassert__action_ = makeString("<action>unassert</action>");

    public static final SubLString $str146$_statement__A__statement_ = makeString("<statement>~A</statement>");

    public static final SubLString $str147$_clientPort__D__clientPort_ = makeString("<clientPort>~D</clientPort>");

    public static final SubLSymbol SCOOP_SESSION = makeSymbol("SCOOP-SESSION");

    public static final SubLSymbol SCOOP_SESSION_P = makeSymbol("SCOOP-SESSION-P");

    public static final SubLList $list150 = list(makeSymbol("MACHINE"), makeSymbol("PORT"), makeSymbol("TCP-SERVER"), makeSymbol("INITIALIZED-P"));

    public static final SubLList $list151 = list(makeKeyword("MACHINE"), makeKeyword("PORT"), makeKeyword("TCP-SERVER"), makeKeyword("INITIALIZED-P"));

    public static final SubLList $list152 = list(makeSymbol("SCOOP-SESSION-MACHINE"), makeSymbol("SCOOP-SESSION-PORT"), makeSymbol("SCOOP-SESSION-TCP-SERVER"), makeSymbol("SCOOP-SESSION-INITIALIZED-P"));

    public static final SubLList $list153 = list(makeSymbol("_CSETF-SCOOP-SESSION-MACHINE"), makeSymbol("_CSETF-SCOOP-SESSION-PORT"), makeSymbol("_CSETF-SCOOP-SESSION-TCP-SERVER"), makeSymbol("_CSETF-SCOOP-SESSION-INITIALIZED-P"));



    public static final SubLSymbol SCOOP_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SCOOP-SESSION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list156 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SCOOP-SESSION-P"));

    private static final SubLSymbol SCOOP_SESSION_MACHINE = makeSymbol("SCOOP-SESSION-MACHINE");

    private static final SubLSymbol _CSETF_SCOOP_SESSION_MACHINE = makeSymbol("_CSETF-SCOOP-SESSION-MACHINE");

    private static final SubLSymbol SCOOP_SESSION_PORT = makeSymbol("SCOOP-SESSION-PORT");

    private static final SubLSymbol _CSETF_SCOOP_SESSION_PORT = makeSymbol("_CSETF-SCOOP-SESSION-PORT");

    private static final SubLSymbol SCOOP_SESSION_TCP_SERVER = makeSymbol("SCOOP-SESSION-TCP-SERVER");

    private static final SubLSymbol _CSETF_SCOOP_SESSION_TCP_SERVER = makeSymbol("_CSETF-SCOOP-SESSION-TCP-SERVER");

    private static final SubLSymbol SCOOP_SESSION_INITIALIZED_P = makeSymbol("SCOOP-SESSION-INITIALIZED-P");

    private static final SubLSymbol _CSETF_SCOOP_SESSION_INITIALIZED_P = makeSymbol("_CSETF-SCOOP-SESSION-INITIALIZED-P");







    private static final SubLString $str168$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SCOOP_SESSION = makeSymbol("MAKE-SCOOP-SESSION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SCOOP_SESSION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SCOOP-SESSION-METHOD");

    public static SubLObject scoop_server_handler(final SubLObject in_stream, final SubLObject out_stream) {
        return scoop_server_top_level(in_stream, out_stream);
    }

    public static SubLObject scoop_server_top_level(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $read_eval$.currentBinding(thread);
        try {
            $package$.bind(find_package($$$CYC), thread);
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            $print_readably$.bind(NIL, thread);
            $read_eval$.bind(NIL, thread);
            final SubLObject old_priority = process_priority(current_process());
            try {
                set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($SCOOP_QUIT);
                    final SubLObject _prev_bind_0_$1 = $within_scoop_server$.currentBinding(thread);
                    try {
                        $within_scoop_server$.bind(T, thread);
                        scoop_server_handler_internal(in_stream, out_stream);
                    } finally {
                        $within_scoop_server$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $SCOOP_QUIT);
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_process_priority(current_process(), old_priority);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            $read_eval$.rebind(_prev_bind_4, thread);
            $print_readably$.rebind(_prev_bind_3, thread);
            $read_default_float_format$.rebind(_prev_bind_2, thread);
            $package$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject initialize_scoop_definitions() {
        $scoop_definitions$.setGlobalValue(list(new SubLObject[]{ $LOGIN, list($EMNAME, $$$SCOOP_Login_Monitor, $APPNAME, $scoop_appname$.getGlobalValue(), $EMID, Guids.guid_to_string(Guids.new_guid())), $LOGOUT, list($EMNAME, $$$SCOOP_Logout_Monitor, $APPNAME, $scoop_appname$.getGlobalValue(), $EMID, Guids.guid_to_string(Guids.new_guid())), $CREATE, list($EMNAME, $$$SCOOP_Create_Monitor, $APPNAME, $scoop_appname$.getGlobalValue(), $EMID, Guids.guid_to_string(Guids.new_guid())), $DELETE, list($EMNAME, $$$SCOOP_Delete_Monitor, $APPNAME, $scoop_appname$.getGlobalValue(), $EMID, Guids.guid_to_string(Guids.new_guid())), $ASSERT, list($EMNAME, $$$SCOOP_Assert_Monitor, $APPNAME, $scoop_appname$.getGlobalValue(), $EMID, Guids.guid_to_string(Guids.new_guid())), $UNASSERT, list($EMNAME, $$$SCOOP_Unassert_Monitor, $APPNAME, $scoop_appname$.getGlobalValue(), $EMID, Guids.guid_to_string(Guids.new_guid())), $CONFLICT, list($EMNAME, $$$SCOOP_Conflict_Voter, $APPNAME, $scoop_appname$.getGlobalValue(), $EMID, Guids.guid_to_string(Guids.new_guid())) }));
        $scoop_members$.setGlobalValue(delete_if(LISTP, copy_list($scoop_definitions$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject scoop_definition_emid_by_type(final SubLObject type) {
        return getf(getf($scoop_definitions$.getGlobalValue(), type, UNPROVIDED), $EMID, UNPROVIDED);
    }

    public static SubLObject scoop_trace(final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $scoop_transaction_stack$.setDynamicValue(cons(message, $scoop_transaction_stack$.getDynamicValue(thread)), thread);
        return message;
    }

    public static SubLObject scoop_trace_display_trace_stack() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $scoop_transaction_stack$.getDynamicValue(thread);
        SubLObject message = NIL;
        message = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            Errors.warn($str31$SCOOP___A__, message);
            cdolist_list_var = cdolist_list_var.rest();
            message = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject scoop_server_handler_internal(final SubLObject in, final SubLObject out) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $scoop_transaction_stack$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $scoop_sid$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $scoop_tid$.currentBinding(thread);
        try {
            $scoop_transaction_stack$.bind(NIL, thread);
            $scoop_sid$.bind(Guids.guid_to_string(Guids.new_guid()), thread);
            $scoop_tid$.bind(Guids.guid_to_string(Guids.new_guid()), thread);
            SubLObject replies = NIL;
            replies = scoop_process_invite_all(in, out);
            if (NIL != replies) {
                scoop_message_forwarder(out, in);
            }
        } finally {
            $scoop_tid$.rebind(_prev_bind_3, thread);
            $scoop_sid$.rebind(_prev_bind_2, thread);
            $scoop_transaction_stack$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject scoop_process_invite_all(final SubLObject in, final SubLObject out) {
        SubLObject success = NIL;
        SubLObject cdolist_list_var = $scoop_members$.getGlobalValue();
        SubLObject member = NIL;
        member = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject definition = getf($scoop_definitions$.getGlobalValue(), member, UNPROVIDED);
            final SubLObject current;
            final SubLObject datum = current = definition;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_$3 = NIL;
            while (NIL != rest) {
                destructuring_bind_must_consp(rest, datum, $list32);
                current_$3 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list32);
                if (NIL == member(current_$3, $list33, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$3 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            } 
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list32);
            }
            final SubLObject emname_tail = property_list_member($EMNAME, current);
            final SubLObject emname = (NIL != emname_tail) ? cadr(emname_tail) : NIL;
            final SubLObject appname_tail = property_list_member($APPNAME, current);
            final SubLObject appname = (NIL != appname_tail) ? cadr(appname_tail) : NIL;
            final SubLObject emid_tail = property_list_member($EMID, current);
            final SubLObject emid = (NIL != emid_tail) ? cadr(emid_tail) : NIL;
            scoop_process_invitation(in, out, emid, appname, emname);
            success = cons(member, success);
            cdolist_list_var = cdolist_list_var.rest();
            member = cdolist_list_var.first();
        } 
        return success;
    }

    public static SubLObject scoop_process_invitation(final SubLObject in, final SubLObject out, final SubLObject emid, final SubLObject appname, final SubLObject emname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(new SubLObject[]{ $INVITE, $SID, $scoop_sid$.getDynamicValue(thread), $EMID, emid, $TID, $scoop_tid$.getDynamicValue(thread), $APPNAME, appname, $EMNAME, emname });
        SubLObject reply = NIL;
        write_scoop_server_reaction(out, message);
        scoop_trace(message);
        reply = read_scoop_server_request(in);
        scoop_trace(reply);
        return in;
    }

    public static SubLObject new_scoop_message_packet(final SubLObject type, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        return list($MESSAGE_TYPE, type, $MESSAGE_ARGS, plist);
    }

    public static SubLObject get_scoop_message_packet_type(final SubLObject packet) {
        return getf(packet, $MESSAGE_TYPE, UNPROVIDED);
    }

    public static SubLObject get_scoop_message_packet_arguments(final SubLObject packet) {
        return getf(packet, $MESSAGE_ARGS, UNPROVIDED);
    }

    public static SubLObject get_scoop_message_packet_arg(final SubLObject packet, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(get_scoop_message_packet_arguments(packet), key, v_default);
    }

    public static SubLObject scoop_schedule_outgoing_message_packet(final SubLObject packet) {
        return process_utilities.ipc_enqueue(packet, $scoop_outgoing_queue$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject scoop_fetch_next_outgoing_message_packet() {
        return process_utilities.ipc_dequeue($scoop_outgoing_queue$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject scoop_schedule_login_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        final SubLObject packet = new_scoop_message_packet($LOGIN, list($SME, sme, $DOMAIN_MT, domain_mt, $LEXICAL_MT, lexical_mt, $PARSING_MT, parsing_mt));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }

    public static SubLObject scoop_schedule_logout_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        final SubLObject packet = new_scoop_message_packet($LOGOUT, list($SME, sme, $DOMAIN_MT, domain_mt, $LEXICAL_MT, lexical_mt, $PARSING_MT, parsing_mt));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }

    public static SubLObject scoop_schedule_create_message(final SubLObject v_term) {
        final SubLObject packet = new_scoop_message_packet($CREATE, list($TERM, v_term));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }

    public static SubLObject scoop_schedule_kill_message(final SubLObject term_name, final SubLObject term_guid, final SubLObject who_dunnit) {
        final SubLObject packet = new_scoop_message_packet($DELETE, list($TERM_NAME, term_name, $TERM_GUID, term_guid, $WHO_DUNNIT, who_dunnit));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }

    public static SubLObject scoop_schedule_assert_message(final SubLObject assertion) {
        final SubLObject packet = new_scoop_message_packet($ASSERT, list($ASSERTION, assertion));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }

    public static SubLObject scoop_schedule_unassert_message(final SubLObject el_formula, final SubLObject mt, final SubLObject who_dunnit) {
        final SubLObject packet = new_scoop_message_packet($UNASSERT, list($EL_FORMULA, el_formula, $MT, mt, $WHO_DUNNIT, who_dunnit));
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }

    public static SubLObject scoop_schedule_trace_message() {
        final SubLObject packet = new_scoop_message_packet($TRACE, UNPROVIDED);
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }

    public static SubLObject scoop_schedule_quit_message() {
        final SubLObject packet = new_scoop_message_packet($QUIT, UNPROVIDED);
        scoop_schedule_outgoing_message_packet(packet);
        return packet;
    }

    public static SubLObject scoop_message_forwarder(final SubLObject out, SubLObject in) {
        if (in == UNPROVIDED) {
            in = NIL;
        }
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            final SubLObject packet = scoop_fetch_next_outgoing_message_packet();
            final SubLObject message = get_scoop_message_packet_arguments(packet);
            final SubLObject type = get_scoop_message_packet_type(packet);
            SubLObject scoop_message = NIL;
            final SubLObject pcase_var = type;
            if (pcase_var.eql($LOGIN)) {
                final SubLObject current;
                final SubLObject datum = current = message;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_$4 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list53);
                    current_$4 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list53);
                    if (NIL == member(current_$4, $list54, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$4 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list53);
                }
                final SubLObject sme_tail = property_list_member($SME, current);
                final SubLObject sme = (NIL != sme_tail) ? cadr(sme_tail) : NIL;
                final SubLObject domain_mt_tail = property_list_member($DOMAIN_MT, current);
                final SubLObject domain_mt = (NIL != domain_mt_tail) ? cadr(domain_mt_tail) : NIL;
                final SubLObject lexical_mt_tail = property_list_member($LEXICAL_MT, current);
                final SubLObject lexical_mt = (NIL != lexical_mt_tail) ? cadr(lexical_mt_tail) : NIL;
                final SubLObject parsing_mt_tail = property_list_member($PARSING_MT, current);
                final SubLObject parsing_mt = (NIL != parsing_mt_tail) ? cadr(parsing_mt_tail) : NIL;
                scoop_message = rkf_scoop_message_login(sme, domain_mt, lexical_mt, parsing_mt);
            } else
                if (pcase_var.eql($LOGOUT)) {
                    final SubLObject current;
                    final SubLObject datum = current = message;
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_$5 = NIL;
                    while (NIL != rest) {
                        destructuring_bind_must_consp(rest, datum, $list53);
                        current_$5 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list53);
                        if (NIL == member(current_$5, $list54, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_$5 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    } 
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list53);
                    }
                    final SubLObject sme_tail = property_list_member($SME, current);
                    final SubLObject sme = (NIL != sme_tail) ? cadr(sme_tail) : NIL;
                    final SubLObject domain_mt_tail = property_list_member($DOMAIN_MT, current);
                    final SubLObject domain_mt = (NIL != domain_mt_tail) ? cadr(domain_mt_tail) : NIL;
                    final SubLObject lexical_mt_tail = property_list_member($LEXICAL_MT, current);
                    final SubLObject lexical_mt = (NIL != lexical_mt_tail) ? cadr(lexical_mt_tail) : NIL;
                    final SubLObject parsing_mt_tail = property_list_member($PARSING_MT, current);
                    final SubLObject parsing_mt = (NIL != parsing_mt_tail) ? cadr(parsing_mt_tail) : NIL;
                    scoop_message = rkf_scoop_message_logout(sme, domain_mt, lexical_mt, parsing_mt);
                } else
                    if (pcase_var.eql($CREATE)) {
                        final SubLObject current;
                        final SubLObject datum = current = message;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_$6 = NIL;
                        while (NIL != rest) {
                            destructuring_bind_must_consp(rest, datum, $list55);
                            current_$6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list55);
                            if (NIL == member(current_$6, $list56, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_$6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        } 
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list55);
                        }
                        final SubLObject term_tail = property_list_member($TERM, current);
                        final SubLObject v_term = (NIL != term_tail) ? cadr(term_tail) : NIL;
                        scoop_message = rkf_scoop_message_create(v_term);
                    } else
                        if (pcase_var.eql($DELETE)) {
                            final SubLObject current;
                            final SubLObject datum = current = message;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_$7 = NIL;
                            while (NIL != rest) {
                                destructuring_bind_must_consp(rest, datum, $list57);
                                current_$7 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list57);
                                if (NIL == member(current_$7, $list58, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_$7 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            } 
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list57);
                            }
                            final SubLObject term_name_tail = property_list_member($TERM_NAME, current);
                            final SubLObject term_name = (NIL != term_name_tail) ? cadr(term_name_tail) : NIL;
                            final SubLObject term_guid_tail = property_list_member($TERM_GUID, current);
                            final SubLObject term_guid = (NIL != term_guid_tail) ? cadr(term_guid_tail) : NIL;
                            final SubLObject who_dunnit_tail = property_list_member($WHO_DUNNIT, current);
                            final SubLObject who_dunnit = (NIL != who_dunnit_tail) ? cadr(who_dunnit_tail) : NIL;
                            scoop_message = rkf_scoop_message_kill(term_name, term_guid, who_dunnit);
                        } else
                            if (pcase_var.eql($ASSERT)) {
                                final SubLObject current;
                                final SubLObject datum = current = message;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current;
                                SubLObject bad = NIL;
                                SubLObject current_$8 = NIL;
                                while (NIL != rest) {
                                    destructuring_bind_must_consp(rest, datum, $list59);
                                    current_$8 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list59);
                                    if (NIL == member(current_$8, $list60, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_$8 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                } 
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list59);
                                }
                                final SubLObject assertion_tail = property_list_member($ASSERTION, current);
                                final SubLObject assertion = (NIL != assertion_tail) ? cadr(assertion_tail) : NIL;
                                scoop_message = rkf_scoop_message_assert(assertion);
                            } else
                                if (pcase_var.eql($UNASSERT)) {
                                    final SubLObject current;
                                    final SubLObject datum = current = message;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current;
                                    SubLObject bad = NIL;
                                    SubLObject current_$9 = NIL;
                                    while (NIL != rest) {
                                        destructuring_bind_must_consp(rest, datum, $list61);
                                        current_$9 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum, $list61);
                                        if (NIL == member(current_$9, $list62, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_$9 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    } 
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum, $list61);
                                    }
                                    final SubLObject el_formula_tail = property_list_member($EL_FORMULA, current);
                                    final SubLObject el_formula = (NIL != el_formula_tail) ? cadr(el_formula_tail) : NIL;
                                    final SubLObject mt_tail = property_list_member($MT, current);
                                    final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
                                    final SubLObject who_dunnit_tail = property_list_member($WHO_DUNNIT, current);
                                    final SubLObject who_dunnit = (NIL != who_dunnit_tail) ? cadr(who_dunnit_tail) : NIL;
                                    scoop_message = rkf_scoop_message_unassert(el_formula, mt, who_dunnit);
                                } else
                                    if (pcase_var.eql($TRACE)) {
                                        scoop_trace_display_trace_stack();
                                    } else
                                        if (pcase_var.eql($QUIT)) {
                                            doneP = T;
                                        } else {
                                            Errors.warn($str63$Protocol_violation____cannot_hand, message);
                                        }







            if (NIL != scoop_message) {
                write_scoop_server_reaction(out, scoop_message);
                scoop_trace(scoop_message);
                if (!in.isStream()) {
                    continue;
                }
                scoop_trace(read_scoop_server_request(in));
            }
        } 
        return $DONE;
    }

    public static SubLObject scoop_spawn_listener(final SubLObject in, final SubLObject out, final SubLObject sid, final SubLObject tid) {
        return subl_promotions.make_process_with_args($$$Scoop_Listener, SCOOP_REPLY_POSTING_LISTENER, list(in, sid, tid));
    }

    public static SubLObject scoop_reply_posting_listener(final SubLObject in, final SubLObject sid, final SubLObject tid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $scoop_sid$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $scoop_tid$.currentBinding(thread);
        try {
            $scoop_sid$.bind(sid, thread);
            $scoop_tid$.bind(tid, thread);
            SubLObject reply = NIL;
            SubLObject doneP = NIL;
            final SubLObject _prev_bind_0_$10 = $package$.currentBinding(thread);
            final SubLObject _prev_bind_1_$11 = $read_default_float_format$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $print_readably$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $read_eval$.currentBinding(thread);
            try {
                $package$.bind(find_package($$$CYC), thread);
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                $print_readably$.bind(NIL, thread);
                $read_eval$.bind(NIL, thread);
                final SubLObject old_priority = process_priority(current_process());
                try {
                    set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                    SubLObject catch_var = NIL;
                    try {
                        thread.throwStack.push($SCOOP_QUIT);
                        while (NIL == doneP) {
                            reply = $ERROR;
                            try {
                                reply = read_scoop_server_request(in);
                                scoop_trace(reply);
                            } finally {
                                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (reply == $ERROR) {
                                        Errors.warn($str68$The_connection_with_SCOOP_dropped);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            if (reply == $EOF) {
                                doneP = T;
                            } else
                                if (reply == $DISCONNECT) {
                                    Errors.warn($str71$Scoop_errored_out_and_generated_a);
                                    doneP = T;
                                } else
                                    if (!reply.isList()) {
                                        Errors.warn($str72$Protocol_violation____received__A, reply);
                                        doneP = T;
                                    } else {
                                        final SubLObject pcase_var = reply.first();
                                        if (pcase_var.eql($ACCEPT)) {
                                            Errors.warn($str74$SCOOP_accepted_with__A__, reply);
                                        } else {
                                            if (pcase_var.eql($PROPOSE)) {
                                                continue;
                                            }
                                            if (pcase_var.eql($CONTRIBUTE)) {
                                            }
                                        }
                                    }


                        } 
                    } catch (final Throwable ccatch_env_var) {
                        catch_var = Errors.handleThrowable(ccatch_env_var, $SCOOP_QUIT);
                    } finally {
                        thread.throwStack.pop();
                    }
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        set_process_priority(current_process(), old_priority);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                $read_eval$.rebind(_prev_bind_4, thread);
                $print_readably$.rebind(_prev_bind_3, thread);
                $read_default_float_format$.rebind(_prev_bind_1_$11, thread);
                $package$.rebind(_prev_bind_0_$10, thread);
            }
        } finally {
            $scoop_tid$.rebind(_prev_bind_2, thread);
            $scoop_sid$.rebind(_prev_bind_0, thread);
        }
        return $DONE;
    }

    public static SubLObject read_scoop_server_request(final SubLObject in) {
        SubLObject input = NIL;
        input = read(in, NIL, $EOF, UNPROVIDED);
        return input;
    }

    public static SubLObject write_scoop_server_reaction(final SubLObject out, final SubLObject reply) {
        prin1(reply, out);
        string_utilities.network_terpri(out);
        force_output(out);
        return out;
    }

    public static SubLObject rkf_scoop_message_login(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type($LOGIN);
        final SubLObject posting = rkf_virb3ify_login_message(sme, domain_mt, lexical_mt, parsing_mt);
        return list(new SubLObject[]{ $STIMULATE, $SID, $scoop_sid$.getDynamicValue(thread), $EMID, emid, $TID, $scoop_tid$.getDynamicValue(thread), $PROPID, Guids.guid_to_string(Guids.new_guid()), $AAL, list(list($sym80$_ACTION, $str81$UIA_START_SESSION, posting), list($sym82$_THE_POSTING, $$$POSTING, posting)) });
    }

    public static SubLObject rkf_scoop_message_logout(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type($LOGOUT);
        final SubLObject posting = rkf_virb3ify_logout_message(sme, domain_mt, lexical_mt, parsing_mt);
        return list(new SubLObject[]{ $STIMULATE, $SID, $scoop_sid$.getDynamicValue(thread), $EMID, emid, $TID, $scoop_tid$.getDynamicValue(thread), $PROPID, Guids.guid_to_string(Guids.new_guid()), $AAL, list(list($sym80$_ACTION, $str84$UIA_STOP_SESSION, posting), list($sym82$_THE_POSTING, $$$POSTING, posting)) });
    }

    public static SubLObject rkf_scoop_message_create(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type($LOGOUT);
        final SubLObject posting = rkf_virb3ify_create_message(v_term);
        return list(new SubLObject[]{ $STIMULATE, $SID, $scoop_sid$.getDynamicValue(thread), $EMID, emid, $TID, $scoop_tid$.getDynamicValue(thread), $PROPID, Guids.guid_to_string(Guids.new_guid()), $AAL, list(list($sym80$_ACTION, $str85$UIA_CREATE, posting), list($sym82$_THE_POSTING, $$$POSTING, posting)) });
    }

    public static SubLObject rkf_scoop_message_kill(final SubLObject term_name, final SubLObject term_guid, final SubLObject who_dunnit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type($DELETE);
        final SubLObject posting = rkf_virb3ify_delete_message(term_name, term_guid, who_dunnit);
        return list(new SubLObject[]{ $STIMULATE, $SID, $scoop_sid$.getDynamicValue(thread), $EMID, emid, $TID, $scoop_tid$.getDynamicValue(thread), $PROPID, Guids.guid_to_string(Guids.new_guid()), $AAL, list(list($sym80$_ACTION, $str86$UIA_KILL, posting), list($sym82$_THE_POSTING, $$$POSTING, posting)) });
    }

    public static SubLObject rkf_scoop_message_assert(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type($ASSERT);
        final SubLObject posting = rkf_virb3ify_assert_message(assertion);
        return list(new SubLObject[]{ $STIMULATE, $SID, $scoop_sid$.getDynamicValue(thread), $EMID, emid, $TID, $scoop_tid$.getDynamicValue(thread), $PROPID, Guids.guid_to_string(Guids.new_guid()), $AAL, list(list($sym80$_ACTION, $str87$UIA_ASSERT, posting), list($sym82$_THE_POSTING, $$$POSTING, posting)) });
    }

    public static SubLObject rkf_scoop_message_unassert(final SubLObject el_formula, final SubLObject mt, final SubLObject who_dunnit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject emid = scoop_definition_emid_by_type($UNASSERT);
        final SubLObject posting = rkf_virb3ify_unassert_message(el_formula, mt, who_dunnit);
        return list(new SubLObject[]{ $STIMULATE, $SID, $scoop_sid$.getDynamicValue(thread), $EMID, emid, $TID, $scoop_tid$.getDynamicValue(thread), $PROPID, Guids.guid_to_string(Guids.new_guid()), $AAL, list(list($sym80$_ACTION, $str88$UIA_UNASSERT, posting), list($sym82$_THE_POSTING, $$$POSTING, posting)) });
    }

    public static SubLObject rkf_virb3ify_login_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        return rkf_virb3ify_session_message(sme, domain_mt, lexical_mt, parsing_mt, $LOGIN);
    }

    public static SubLObject rkf_virb3ify_logout_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        return rkf_virb3ify_session_message(sme, domain_mt, lexical_mt, parsing_mt, NIL);
    }

    public static SubLObject rkf_virb3ify_create_message(final SubLObject v_term) {
        final SubLObject creator = bookkeeping_store.creator(v_term, UNPROVIDED);
        final SubLObject date = bookkeeping_store.creation_time(v_term, UNPROVIDED);
        final SubLObject second = bookkeeping_store.creation_second(v_term, UNPROVIDED);
        return list($CREATE, list(rkf_virb3ify_labeled_expression($TERM, v_term), rkf_virb3ify_labeled_expression($CREATOR, creator), rkf_virb3ify_timestamp(date, second), list($XML_SUMMARY, scoop_xml_create_writer(NIL, creator, v_term))));
    }

    public static SubLObject rkf_virb3ify_delete_message(final SubLObject term_name, final SubLObject term_guid, final SubLObject who_dunnit) {
        return list($KILL, list(list($TERM, rkf_virb3ify_constant_assemble_pieces(term_name, term_guid)), list($XML_SUMMARY, scoop_xml_delete_writer(NIL, who_dunnit, term_name))));
    }

    public static SubLObject rkf_virb3ify_assert_message(final SubLObject assertion) {
        return list($ASSERTION, append(rkf_virb3ify_assertion_content(assertion), list(list($XML_SUMMARY, scoop_xml_assert_writer(NIL, assertions_high.asserted_by(assertion), assertion)))));
    }

    public static SubLObject rkf_virb3ify_unassert_message(final SubLObject el_formula, final SubLObject mt, final SubLObject sme) {
        return list($ASSERTION, append(rkf_virb3ify_unassert_content(el_formula, mt), list(list($XML_SUMMARY, scoop_xml_unassert_writer(NIL, sme, el_formula)))));
    }

    public static SubLObject rkf_virb3ify_connection() {
        return list($CONNECTION, list($ADDRESS, $rkf_scoop_associate_machine$.getGlobalValue()), list($PORT, $rkf_scoop_associate_port$.getGlobalValue()));
    }

    public static SubLObject rkf_virb3ify_mts(final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt) {
        return list($MTS, list(rkf_virb3ify_labeled_expression($INTERACTION_DOMAIN_MT, domain_mt), rkf_virb3ify_labeled_expression($INTERACTION_LEXICAL_MT, lexical_mt), rkf_virb3ify_labeled_expression($INTERACTION_PARSING_MT, parsing_mt)));
    }

    public static SubLObject rkf_virb3ify_session_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt, final SubLObject loginP) {
        return list($SESSION, list(rkf_virb3ify_labeled_expression($SME, sme), rkf_virb3ify_mts(domain_mt, lexical_mt, parsing_mt), rkf_virb3ify_connection(), list($XML_SUMMARY, NIL != loginP ? scoop_xml_login_writer(NIL, sme, domain_mt) : scoop_xml_logout_writer(NIL, sme, domain_mt))));
    }

    public static SubLObject rkf_virb3ify_constant_assemble_pieces(final SubLObject name, final SubLObject guid) {
        return list($CONSTANT, list($NAME, name), list($GUID, Guids.guid_to_string(guid)));
    }

    public static SubLObject rkf_virb3ify_constant(final SubLObject constant) {
        return rkf_virb3ify_constant_assemble_pieces(constants_high.constant_name(constant), constants_high.constant_guid(constant));
    }

    public static SubLObject rkf_virb3ify_expression(final SubLObject expr) {
        if (expr.isSymbol()) {
            return expr;
        }
        if (NIL != constant_p(expr)) {
            return rkf_virb3ify_constant(expr);
        }
        if (NIL != nart_handles.nart_p(expr)) {
            return list($NART, rkf_virb3ify_expression(narts_high.nart_el_formula(expr)));
        }
        if (expr.isAtom()) {
            return expr;
        }
        return cons(rkf_virb3ify_expression(expr.first()), rkf_virb3ify_expression(expr.rest()));
    }

    public static SubLObject rkf_virb3ify_labeled_expression(final SubLObject label, final SubLObject expression) {
        return list(label, rkf_virb3ify_expression(expression));
    }

    public static SubLObject rkf_virb3ify_formula(final SubLObject expression) {
        return rkf_virb3ify_labeled_expression($FORMULA, expression);
    }

    public static SubLObject rkf_virb3ify_mt(final SubLObject mt, SubLObject mt_label) {
        if (mt_label == UNPROVIDED) {
            mt_label = $MT;
        }
        return rkf_virb3ify_labeled_expression(mt_label, mt);
    }

    public static SubLObject rkf_virb3ify_assertion_direction(final SubLObject direction) {
        SubLObject direction_fort = NIL;
        if (direction.eql($FORWARD)) {
            direction_fort = $$Forward_AssertionDirection;
        } else
            if (direction.eql($BACKWARD)) {
                direction_fort = $$Backward_AssertionDirection;
            } else
                if (direction.eql($CODE)) {
                    direction_fort = $$Code_AssertionDirection;
                }


        return rkf_virb3ify_labeled_expression($DIRECTION, direction_fort);
    }

    public static SubLObject rkf_virb3ify_assertion_truth(final SubLObject truth) {
        SubLObject truth_fort = NIL;
        if (truth.eql($TRUE)) {
            truth_fort = $$True;
        } else
            if (truth.eql($FALSE)) {
                truth_fort = $$False;
            } else
                if (truth.eql($UNKNOWN)) {
                    truth_fort = $$Unknown_HLTruthValue;
                }


        return rkf_virb3ify_labeled_expression($TRUTH, truth_fort);
    }

    public static SubLObject rkf_virb3ify_assertion_strength(final SubLObject strength) {
        SubLObject strength_fort = NIL;
        if (strength.eql($DEFAULT)) {
            strength_fort = $$Default_JustificationStrength;
        } else
            if (strength.eql($MONOTONIC)) {
                strength_fort = $$Monotonic_JustificationStrength;
            }

        return rkf_virb3ify_labeled_expression($STRENGTH, strength_fort);
    }

    public static SubLObject rkf_virb3ify_timestamp(final SubLObject date, final SubLObject seconds) {
        return list($TIMESTAMP, list($DATE, date), list($SECS, seconds));
    }

    public static SubLObject rkf_virb3ify_assertion_content(final SubLObject assertion) {
        return list(rkf_virb3ify_formula(uncanonicalizer.assertion_el_formula(assertion)), rkf_virb3ify_mt(assertions_high.assertion_mt(assertion), UNPROVIDED), rkf_virb3ify_labeled_expression($CREATOR, assertions_high.asserted_by(assertion)), rkf_virb3ify_assertion_direction(assertions_high.assertion_direction(assertion)), rkf_virb3ify_assertion_truth(assertions_high.assertion_truth(assertion)), rkf_virb3ify_assertion_strength(assertions_high.assertion_strength(assertion)), rkf_virb3ify_timestamp(assertions_high.asserted_when(assertion), assertions_high.asserted_second(assertion)));
    }

    public static SubLObject rkf_virb3ify_assertion(final SubLObject assertion) {
        return list($ASSERTION, rkf_virb3ify_assertion_content(assertion));
    }

    public static SubLObject rkf_virb3ify_unassertion(final SubLObject el_formula, final SubLObject mt) {
        return list($ASSERTION, rkf_virb3ify_unassert_content(el_formula, mt));
    }

    public static SubLObject rkf_virb3ify_unassert_content(final SubLObject el_formula, final SubLObject mt) {
        return list(rkf_virb3ify_formula(el_formula), rkf_virb3ify_mt(mt, UNPROVIDED));
    }

    public static SubLObject scoop_xml_login_writer(final SubLObject stream, final SubLObject sme, final SubLObject mt) {
        return format(stream, $scoop_xml_template_login$.getGlobalValue(), new SubLObject[]{ kb_paths.fort_name(sme), kb_paths.fort_name(mt), $rkf_scoop_associate_machine$.getGlobalValue(), $rkf_scoop_associate_port$.getGlobalValue() });
    }

    public static SubLObject scoop_xml_logout_writer(final SubLObject stream, final SubLObject sme, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return format(stream, $scoop_xml_template_logout$.getGlobalValue(), new SubLObject[]{ kb_paths.fort_name(sme), kb_paths.fort_name(mt), Environment.get_network_name(UNPROVIDED), $scoop_server_port$.getDynamicValue(thread) });
    }

    public static SubLObject scoop_xml_create_writer(final SubLObject stream, final SubLObject sme, final SubLObject fort) {
        return format(stream, $scoop_xml_template_create$.getGlobalValue(), kb_paths.fort_name(sme), kb_paths.fort_name(fort));
    }

    public static SubLObject scoop_xml_delete_writer(final SubLObject stream, final SubLObject sme, final SubLObject fort_name) {
        return format(stream, $scoop_xml_template_delete$.getGlobalValue(), kb_paths.fort_name(sme), fort_name);
    }

    public static SubLObject scoop_xml_cycl_expression(final SubLObject expr) {
        if (expr.isSymbol()) {
            return expr;
        }
        if (NIL != constant_p(expr)) {
            return expr;
        }
        if (NIL != nart_handles.nart_p(expr)) {
            return copy_formula(narts_high.nart_el_formula(expr));
        }
        if (expr.isAtom()) {
            return expr;
        }
        return cons(scoop_xml_cycl_expression(expr.first()), scoop_xml_cycl_expression(expr.rest()));
    }

    public static SubLObject scoop_xml_assert_writer(final SubLObject stream, final SubLObject sme, final SubLObject assertion) {
        return format(stream, $scoop_xml_template_assert$.getGlobalValue(), kb_paths.fort_name(sme), scoop_xml_cycl_expression(uncanonicalizer.assertion_el_formula(assertion)));
    }

    public static SubLObject scoop_xml_unassert_writer(final SubLObject stream, final SubLObject sme, final SubLObject el_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return format(stream, $scoop_xml_template_unassert$.getGlobalValue(), new SubLObject[]{ kb_paths.fort_name(sme), el_formula, Environment.get_network_name(UNPROVIDED), $scoop_server_port$.getDynamicValue(thread) });
    }

    public static SubLObject scoop_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject scoop_session_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$scoop_session_native.class ? T : NIL;
    }

    public static SubLObject scoop_session_machine(final SubLObject v_object) {
        assert NIL != scoop_session_p(v_object) : "rkf_collaborator_scoop.scoop_session_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject scoop_session_port(final SubLObject v_object) {
        assert NIL != scoop_session_p(v_object) : "rkf_collaborator_scoop.scoop_session_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject scoop_session_tcp_server(final SubLObject v_object) {
        assert NIL != scoop_session_p(v_object) : "rkf_collaborator_scoop.scoop_session_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject scoop_session_initialized_p(final SubLObject v_object) {
        assert NIL != scoop_session_p(v_object) : "rkf_collaborator_scoop.scoop_session_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_scoop_session_machine(final SubLObject v_object, final SubLObject value) {
        assert NIL != scoop_session_p(v_object) : "rkf_collaborator_scoop.scoop_session_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_scoop_session_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != scoop_session_p(v_object) : "rkf_collaborator_scoop.scoop_session_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_scoop_session_tcp_server(final SubLObject v_object, final SubLObject value) {
        assert NIL != scoop_session_p(v_object) : "rkf_collaborator_scoop.scoop_session_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_scoop_session_initialized_p(final SubLObject v_object, final SubLObject value) {
        assert NIL != scoop_session_p(v_object) : "rkf_collaborator_scoop.scoop_session_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_scoop_session(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $scoop_session_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MACHINE)) {
                _csetf_scoop_session_machine(v_new, current_value);
            } else
                if (pcase_var.eql($PORT)) {
                    _csetf_scoop_session_port(v_new, current_value);
                } else
                    if (pcase_var.eql($TCP_SERVER)) {
                        _csetf_scoop_session_tcp_server(v_new, current_value);
                    } else
                        if (pcase_var.eql($INITIALIZED_P)) {
                            _csetf_scoop_session_initialized_p(v_new, current_value);
                        } else {
                            Errors.error($str168$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_scoop_session(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SCOOP_SESSION, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MACHINE, scoop_session_machine(obj));
        funcall(visitor_fn, obj, $SLOT, $PORT, scoop_session_port(obj));
        funcall(visitor_fn, obj, $SLOT, $TCP_SERVER, scoop_session_tcp_server(obj));
        funcall(visitor_fn, obj, $SLOT, $INITIALIZED_P, scoop_session_initialized_p(obj));
        funcall(visitor_fn, obj, $END, MAKE_SCOOP_SESSION, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_scoop_session_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_scoop_session(obj, visitor_fn);
    }

    public static SubLObject scoop_session_initializedP(final SubLObject scoop_session) {
        return makeBoolean(((NIL != scoop_session_p(scoop_session)) && (NIL != tcp_server_utilities.tcp_server_p(scoop_session_tcp_server(scoop_session)))) && (NIL != scoop_session_initialized_p(scoop_session)));
    }

    public static SubLObject new_scoop_session(final SubLObject machine, final SubLObject port) {
        final SubLObject scoops = make_scoop_session(UNPROVIDED);
        _csetf_scoop_session_machine(scoops, machine);
        _csetf_scoop_session_port(scoops, port);
        return scoops;
    }

    public static SubLObject restart_scoop_session(final SubLObject scoops) {
        shutdown_scoop_session(scoops);
        initialize_scoop_definitions();
        _csetf_scoop_session_tcp_server(scoops, tcp_server_utilities.enable_tcp_server($SCOOP, scoop_session_port(scoops)));
        _csetf_scoop_session_initialized_p(scoops, tcp_server_utilities.tcp_server_p(scoop_session_tcp_server(scoops)));
        return scoop_session_initializedP(scoops);
    }

    public static SubLObject initialize_scoop_session(final SubLObject machine, final SubLObject port) {
        final SubLObject scoops = new_scoop_session(machine, port);
        restart_scoop_session(scoops);
        return scoops;
    }

    public static SubLObject shutdown_scoop_session(final SubLObject scoops) {
        tcp_server_utilities.disable_tcp_server(scoop_session_port(scoops));
        _csetf_scoop_session_tcp_server(scoops, NIL);
        _csetf_scoop_session_initialized_p(scoops, NIL);
        return scoops;
    }

    public static SubLObject declare_rkf_collaborator_scoop_file() {
        declareFunction(me, "scoop_server_handler", "SCOOP-SERVER-HANDLER", 2, 0, false);
        declareFunction(me, "scoop_server_top_level", "SCOOP-SERVER-TOP-LEVEL", 2, 0, false);
        declareFunction(me, "initialize_scoop_definitions", "INITIALIZE-SCOOP-DEFINITIONS", 0, 0, false);
        declareFunction(me, "scoop_definition_emid_by_type", "SCOOP-DEFINITION-EMID-BY-TYPE", 1, 0, false);
        declareFunction(me, "scoop_trace", "SCOOP-TRACE", 1, 0, false);
        declareFunction(me, "scoop_trace_display_trace_stack", "SCOOP-TRACE-DISPLAY-TRACE-STACK", 0, 0, false);
        declareFunction(me, "scoop_server_handler_internal", "SCOOP-SERVER-HANDLER-INTERNAL", 2, 0, false);
        declareFunction(me, "scoop_process_invite_all", "SCOOP-PROCESS-INVITE-ALL", 2, 0, false);
        declareFunction(me, "scoop_process_invitation", "SCOOP-PROCESS-INVITATION", 5, 0, false);
        declareFunction(me, "new_scoop_message_packet", "NEW-SCOOP-MESSAGE-PACKET", 1, 1, false);
        declareFunction(me, "get_scoop_message_packet_type", "GET-SCOOP-MESSAGE-PACKET-TYPE", 1, 0, false);
        declareFunction(me, "get_scoop_message_packet_arguments", "GET-SCOOP-MESSAGE-PACKET-ARGUMENTS", 1, 0, false);
        declareFunction(me, "get_scoop_message_packet_arg", "GET-SCOOP-MESSAGE-PACKET-ARG", 2, 1, false);
        declareFunction(me, "scoop_schedule_outgoing_message_packet", "SCOOP-SCHEDULE-OUTGOING-MESSAGE-PACKET", 1, 0, false);
        declareFunction(me, "scoop_fetch_next_outgoing_message_packet", "SCOOP-FETCH-NEXT-OUTGOING-MESSAGE-PACKET", 0, 0, false);
        declareFunction(me, "scoop_schedule_login_message", "SCOOP-SCHEDULE-LOGIN-MESSAGE", 4, 0, false);
        declareFunction(me, "scoop_schedule_logout_message", "SCOOP-SCHEDULE-LOGOUT-MESSAGE", 4, 0, false);
        declareFunction(me, "scoop_schedule_create_message", "SCOOP-SCHEDULE-CREATE-MESSAGE", 1, 0, false);
        declareFunction(me, "scoop_schedule_kill_message", "SCOOP-SCHEDULE-KILL-MESSAGE", 3, 0, false);
        declareFunction(me, "scoop_schedule_assert_message", "SCOOP-SCHEDULE-ASSERT-MESSAGE", 1, 0, false);
        declareFunction(me, "scoop_schedule_unassert_message", "SCOOP-SCHEDULE-UNASSERT-MESSAGE", 3, 0, false);
        declareFunction(me, "scoop_schedule_trace_message", "SCOOP-SCHEDULE-TRACE-MESSAGE", 0, 0, false);
        declareFunction(me, "scoop_schedule_quit_message", "SCOOP-SCHEDULE-QUIT-MESSAGE", 0, 0, false);
        declareFunction(me, "scoop_message_forwarder", "SCOOP-MESSAGE-FORWARDER", 1, 1, false);
        declareFunction(me, "scoop_spawn_listener", "SCOOP-SPAWN-LISTENER", 4, 0, false);
        declareFunction(me, "scoop_reply_posting_listener", "SCOOP-REPLY-POSTING-LISTENER", 3, 0, false);
        declareFunction(me, "read_scoop_server_request", "READ-SCOOP-SERVER-REQUEST", 1, 0, false);
        declareFunction(me, "write_scoop_server_reaction", "WRITE-SCOOP-SERVER-REACTION", 2, 0, false);
        declareFunction(me, "rkf_scoop_message_login", "RKF-SCOOP-MESSAGE-LOGIN", 4, 0, false);
        declareFunction(me, "rkf_scoop_message_logout", "RKF-SCOOP-MESSAGE-LOGOUT", 4, 0, false);
        declareFunction(me, "rkf_scoop_message_create", "RKF-SCOOP-MESSAGE-CREATE", 1, 0, false);
        declareFunction(me, "rkf_scoop_message_kill", "RKF-SCOOP-MESSAGE-KILL", 3, 0, false);
        declareFunction(me, "rkf_scoop_message_assert", "RKF-SCOOP-MESSAGE-ASSERT", 1, 0, false);
        declareFunction(me, "rkf_scoop_message_unassert", "RKF-SCOOP-MESSAGE-UNASSERT", 3, 0, false);
        declareFunction(me, "rkf_virb3ify_login_message", "RKF-VIRB3IFY-LOGIN-MESSAGE", 4, 0, false);
        declareFunction(me, "rkf_virb3ify_logout_message", "RKF-VIRB3IFY-LOGOUT-MESSAGE", 4, 0, false);
        declareFunction(me, "rkf_virb3ify_create_message", "RKF-VIRB3IFY-CREATE-MESSAGE", 1, 0, false);
        declareFunction(me, "rkf_virb3ify_delete_message", "RKF-VIRB3IFY-DELETE-MESSAGE", 3, 0, false);
        declareFunction(me, "rkf_virb3ify_assert_message", "RKF-VIRB3IFY-ASSERT-MESSAGE", 1, 0, false);
        declareFunction(me, "rkf_virb3ify_unassert_message", "RKF-VIRB3IFY-UNASSERT-MESSAGE", 3, 0, false);
        declareFunction(me, "rkf_virb3ify_connection", "RKF-VIRB3IFY-CONNECTION", 0, 0, false);
        declareFunction(me, "rkf_virb3ify_mts", "RKF-VIRB3IFY-MTS", 3, 0, false);
        declareFunction(me, "rkf_virb3ify_session_message", "RKF-VIRB3IFY-SESSION-MESSAGE", 5, 0, false);
        declareFunction(me, "rkf_virb3ify_constant_assemble_pieces", "RKF-VIRB3IFY-CONSTANT-ASSEMBLE-PIECES", 2, 0, false);
        declareFunction(me, "rkf_virb3ify_constant", "RKF-VIRB3IFY-CONSTANT", 1, 0, false);
        declareFunction(me, "rkf_virb3ify_expression", "RKF-VIRB3IFY-EXPRESSION", 1, 0, false);
        declareFunction(me, "rkf_virb3ify_labeled_expression", "RKF-VIRB3IFY-LABELED-EXPRESSION", 2, 0, false);
        declareFunction(me, "rkf_virb3ify_formula", "RKF-VIRB3IFY-FORMULA", 1, 0, false);
        declareFunction(me, "rkf_virb3ify_mt", "RKF-VIRB3IFY-MT", 1, 1, false);
        declareFunction(me, "rkf_virb3ify_assertion_direction", "RKF-VIRB3IFY-ASSERTION-DIRECTION", 1, 0, false);
        declareFunction(me, "rkf_virb3ify_assertion_truth", "RKF-VIRB3IFY-ASSERTION-TRUTH", 1, 0, false);
        declareFunction(me, "rkf_virb3ify_assertion_strength", "RKF-VIRB3IFY-ASSERTION-STRENGTH", 1, 0, false);
        declareFunction(me, "rkf_virb3ify_timestamp", "RKF-VIRB3IFY-TIMESTAMP", 2, 0, false);
        declareFunction(me, "rkf_virb3ify_assertion_content", "RKF-VIRB3IFY-ASSERTION-CONTENT", 1, 0, false);
        declareFunction(me, "rkf_virb3ify_assertion", "RKF-VIRB3IFY-ASSERTION", 1, 0, false);
        declareFunction(me, "rkf_virb3ify_unassertion", "RKF-VIRB3IFY-UNASSERTION", 2, 0, false);
        declareFunction(me, "rkf_virb3ify_unassert_content", "RKF-VIRB3IFY-UNASSERT-CONTENT", 2, 0, false);
        declareFunction(me, "scoop_xml_login_writer", "SCOOP-XML-LOGIN-WRITER", 3, 0, false);
        declareFunction(me, "scoop_xml_logout_writer", "SCOOP-XML-LOGOUT-WRITER", 3, 0, false);
        declareFunction(me, "scoop_xml_create_writer", "SCOOP-XML-CREATE-WRITER", 3, 0, false);
        declareFunction(me, "scoop_xml_delete_writer", "SCOOP-XML-DELETE-WRITER", 3, 0, false);
        declareFunction(me, "scoop_xml_cycl_expression", "SCOOP-XML-CYCL-EXPRESSION", 1, 0, false);
        declareFunction(me, "scoop_xml_assert_writer", "SCOOP-XML-ASSERT-WRITER", 3, 0, false);
        declareFunction(me, "scoop_xml_unassert_writer", "SCOOP-XML-UNASSERT-WRITER", 3, 0, false);
        declareFunction(me, "scoop_session_print_function_trampoline", "SCOOP-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "scoop_session_p", "SCOOP-SESSION-P", 1, 0, false);
        new rkf_collaborator_scoop.$scoop_session_p$UnaryFunction();
        declareFunction(me, "scoop_session_machine", "SCOOP-SESSION-MACHINE", 1, 0, false);
        declareFunction(me, "scoop_session_port", "SCOOP-SESSION-PORT", 1, 0, false);
        declareFunction(me, "scoop_session_tcp_server", "SCOOP-SESSION-TCP-SERVER", 1, 0, false);
        declareFunction(me, "scoop_session_initialized_p", "SCOOP-SESSION-INITIALIZED-P", 1, 0, false);
        declareFunction(me, "_csetf_scoop_session_machine", "_CSETF-SCOOP-SESSION-MACHINE", 2, 0, false);
        declareFunction(me, "_csetf_scoop_session_port", "_CSETF-SCOOP-SESSION-PORT", 2, 0, false);
        declareFunction(me, "_csetf_scoop_session_tcp_server", "_CSETF-SCOOP-SESSION-TCP-SERVER", 2, 0, false);
        declareFunction(me, "_csetf_scoop_session_initialized_p", "_CSETF-SCOOP-SESSION-INITIALIZED-P", 2, 0, false);
        declareFunction(me, "make_scoop_session", "MAKE-SCOOP-SESSION", 0, 1, false);
        declareFunction(me, "visit_defstruct_scoop_session", "VISIT-DEFSTRUCT-SCOOP-SESSION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_scoop_session_method", "VISIT-DEFSTRUCT-OBJECT-SCOOP-SESSION-METHOD", 2, 0, false);
        declareFunction(me, "scoop_session_initializedP", "SCOOP-SESSION-INITIALIZED?", 1, 0, false);
        declareFunction(me, "new_scoop_session", "NEW-SCOOP-SESSION", 2, 0, false);
        declareFunction(me, "restart_scoop_session", "RESTART-SCOOP-SESSION", 1, 0, false);
        declareFunction(me, "initialize_scoop_session", "INITIALIZE-SCOOP-SESSION", 2, 0, false);
        declareFunction(me, "shutdown_scoop_session", "SHUTDOWN-SCOOP-SESSION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_collaborator_scoop_file() {
        defparameter("*WITHIN-SCOOP-SERVER*", NIL);
        defparameter("*SCOOP-SERVER-PORT*", $int$3599);
        defparameter("*SCOOP-SERVER-MACHINE*", $str1$BOOTLEG_CYC_COM);
        defparameter("*USE-VIRB3-FOR-SCOOP*", NIL);
        deflexical("*SCOOP-APPNAME*", $$$KRAKEN);
        deflexical("*SCOOP-DEFINITIONS*", SubLTrampolineFile.maybeDefault($scoop_definitions$, $scoop_definitions$, NIL));
        deflexical("*SCOOP-MEMBERS*", SubLTrampolineFile.maybeDefault($scoop_members$, $scoop_members$, NIL));
        deflexical("*SCOOP-INCOMING-QUEUE*", process_utilities.new_ipc_queue($$$SCOOP_Incoming_VirB3_Queue));
        deflexical("*SCOOP-OUTGOING-QUEUE*", process_utilities.new_ipc_queue($$$SCOOP_Outgoing_VirB3_Queue));
        defparameter("*SCOOP-SID*", NIL);
        defparameter("*SCOOP-TID*", NIL);
        defparameter("*SCOOP-TRANSACTION-STACK*", NIL);
        deflexical("*RKF-SCOOP-ASSOCIATE-MACHINE*", $str92$nautilus_cyc_com);
        deflexical("*RKF-SCOOP-ASSOCIATE-PORT*", $int$3621);
        deflexical("*SCOOP-XML-NEWLINE*", Strings.make_string(ONE_INTEGER, CHAR_newline));
        deflexical("*SCOOP-XML-TEMPLATE-LOGIN*", cconcatenate($str129$__xml_version__1_0__encoding__UTF, new SubLObject[]{ $str130$_SCOOP_, $str131$_action_login__action_, $str132$_user__A__user_, $str133$_microTheory__A__microTheory_, $str134$_clientAddress__A__clientAddress_, $str135$_clientPort__A__clientPort_, $str136$__SCOOP_ }));
        deflexical("*SCOOP-XML-TEMPLATE-LOGOUT*", cconcatenate($str129$__xml_version__1_0__encoding__UTF, new SubLObject[]{ $str130$_SCOOP_, $str137$_action_logout__action_, $str132$_user__A__user_, $str133$_microTheory__A__microTheory_, $str134$_clientAddress__A__clientAddress_, $str135$_clientPort__A__clientPort_, $str136$__SCOOP_ }));
        deflexical("*SCOOP-XML-TEMPLATE-CREATE*", cconcatenate($str129$__xml_version__1_0__encoding__UTF, new SubLObject[]{ $str130$_SCOOP_, $str138$_action_create__action_, $str132$_user__A__user_, $str139$_constant__A__constant_, $str136$__SCOOP_ }));
        deflexical("*SCOOP-XML-TEMPLATE-DELETE*", cconcatenate($str129$__xml_version__1_0__encoding__UTF, new SubLObject[]{ $str130$_SCOOP_, $str140$_action_delete__action_, $str132$_user__A__user_, $str139$_constant__A__constant_, $str136$__SCOOP_ }));
        deflexical("*SCOOP-XML-TEMPLATE-ASSERT*", cconcatenate($str129$__xml_version__1_0__encoding__UTF, new SubLObject[]{ $str130$_SCOOP_, $str141$_action_assert__action_, $str132$_user__A__user_, $str142$_statement_, $str143$_A, $str144$__statement_, $str136$__SCOOP_ }));
        deflexical("*SCOOP-XML-TEMPLATE-UNASSERT*", cconcatenate($str129$__xml_version__1_0__encoding__UTF, new SubLObject[]{ $str130$_SCOOP_, $str145$_action_unassert__action_, $str132$_user__A__user_, $str146$_statement__A__statement_, $str134$_clientAddress__A__clientAddress_, $str147$_clientPort__D__clientPort_, $str136$__SCOOP_ }));
        defconstant("*DTP-SCOOP-SESSION*", SCOOP_SESSION);
        return NIL;
    }

    public static SubLObject setup_rkf_collaborator_scoop_file() {
        tcp_server_utilities.register_tcp_server_type($SCOOP, SCOOP_SERVER_HANDLER, $TEXT);
        declare_defglobal($scoop_definitions$);
        declare_defglobal($scoop_members$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_scoop_session$.getGlobalValue(), symbol_function(SCOOP_SESSION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list156);
        def_csetf(SCOOP_SESSION_MACHINE, _CSETF_SCOOP_SESSION_MACHINE);
        def_csetf(SCOOP_SESSION_PORT, _CSETF_SCOOP_SESSION_PORT);
        def_csetf(SCOOP_SESSION_TCP_SERVER, _CSETF_SCOOP_SESSION_TCP_SERVER);
        def_csetf(SCOOP_SESSION_INITIALIZED_P, _CSETF_SCOOP_SESSION_INITIALIZED_P);
        identity(SCOOP_SESSION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_scoop_session$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SCOOP_SESSION_METHOD));
        return NIL;
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

    

    public static final class $scoop_session_native extends SubLStructNative {
        public SubLObject $machine;

        public SubLObject $port;

        public SubLObject $tcp_server;

        public SubLObject $initialized_p;

        private static final SubLStructDeclNative structDecl;

        private $scoop_session_native() {
            this.$machine = Lisp.NIL;
            this.$port = Lisp.NIL;
            this.$tcp_server = Lisp.NIL;
            this.$initialized_p = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($scoop_session_native.class, SCOOP_SESSION, SCOOP_SESSION_P, $list150, $list151, new String[]{ "$machine", "$port", "$tcp_server", "$initialized_p" }, $list152, $list153, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $scoop_session_p$UnaryFunction extends UnaryFunction {
        public $scoop_session_p$UnaryFunction() {
            super(extractFunctionNamed("SCOOP-SESSION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return scoop_session_p(arg1);
        }
    }
}

/**
 * Total time: 444 ms
 */
