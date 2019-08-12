/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SYSTEM-PARAMETERS
 * source file: /cyc/top/cycl/system-parameters.lisp
 * created:     2019/07/03 17:37:05
 */
public final class system_parameters extends SubLTranslatedFile implements V12 {
    public static final SubLSymbol $startup_communication_mode$ = makeSymbol("*STARTUP-COMMUNICATION-MODE*");

    // Definitions
    /**
     * The list of all known valid system parameter types.
     */
    // deflexical
    @LispMethod(comment = "The list of all known valid system parameter types.\ndeflexical")
    private static final SubLSymbol $valid_system_parameter_types$ = makeSymbol("*VALID-SYSTEM-PARAMETER-TYPES*");

    public static final SubLFile me = new system_parameters();

 public static final String myName = "com.cyc.cycjava.cycl.system_parameters";












    // defvar
    /**
     * Possible values: T, NIL. If T, the html tools will correctly display UTF-8
     * text derived from Cyc strings.
     */
    @LispMethod(comment = "Possible values: T, NIL. If T, the html tools will correctly display UTF-8\r\ntext derived from Cyc strings.\ndefvar\nPossible values: T, NIL. If T, the html tools will correctly display UTF-8\ntext derived from Cyc strings.")
    public static final SubLSymbol $permit_utf_8_character_display$ = makeSymbol("*PERMIT-UTF-8-CHARACTER-DISPLAY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $all_cyc_execution_contexts$ = makeSymbol("*ALL-CYC-EXECUTION-CONTEXTS*");

    private static final SubLSymbol $system_parameters$ = makeSymbol("*SYSTEM-PARAMETERS*");

    private static final SubLString $str2$_S__S_has_an_unknown_type__S_ = makeString("~S ~S has an unknown type ~S.");

    private static final SubLSymbol DEFINE_SYSTEM_PARAMETER = makeSymbol("DEFINE-SYSTEM-PARAMETER");

    private static final SubLList $list6 = list(makeSymbol("NAME"), makeSymbol("DEFAULT"), makeSymbol("TYPE"), makeSymbol("DESCRIPTION"));

    private static final SubLSymbol REGISTER_SYSTEM_PARAMETER = makeSymbol("REGISTER-SYSTEM-PARAMETER");

    private static final SubLList $list12 = list(makeSymbol("SYMBOL"), makeSymbol("DEFAULT"), makeSymbol("TYPE"), makeSymbol("DESCRIPTION"));

    private static final SubLString $str13$The_system_parameter__S_is_not_bo = makeString("The system parameter ~S is not bound.");

    private static final SubLString $str14$The_system_parameter__S_was_not_i = makeString("The system parameter ~S was not initialized.");

    private static final SubLString $str15$The_system_parameter__A_has_a_bog = makeString("The system parameter ~A has a bogus type definition of ~A.");

    private static final SubLString $str16$The_system_paramater__S_has_the_v = makeString("The system paramater ~S has the value ~S, but it is supposed to be ~S.");

    private static final SubLObject $ic17 = vector(new SubLObject[]{ CHAR_0, CHAR_1, CHAR_2, CHAR_3, CHAR_4, CHAR_5, CHAR_6, CHAR_7, CHAR_8, CHAR_9, CHAR_A, CHAR_B, CHAR_C, CHAR_D, CHAR_E, CHAR_F });

    private static final SubLList $list18 = cons(makeSymbol("NEW"), makeSymbol("OLD"));

    private static final SubLList $list20 = list(makeString("init"));

    private static final SubLString $$$parameters = makeString("parameters");

    private static final SubLString $$$lisp = makeString("lisp");

    private static final SubLString $str24$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str25$________Mode__LISP__Syntax__ANSI_ = makeString(";;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10; Package: CYC;  -*-~%~%");

    private static final SubLString $str26$____Cyc_system_parameters__ = makeString(";;; Cyc system parameters~%");

    private static final SubLString $str27$_____ = makeString(";;;~%");

    private static final SubLString $str28$____Generated__A_from_CycL__A____ = makeString(";;; Generated ~A from CycL ~A~%~%");

    private static final SubLString $str29$_in_package__CYC_____ = makeString("(in-package :CYC)~%~%");

    private static final SubLList $list30 = list(cons(makeString("T"), makeString("::TRUE::")), cons(makeString("NIL"), makeString("::FALSE::")));

    private static final SubLString $str31$____Possible_Values___A__ = makeString(";;; Possible Values: ~A~%");

    private static final SubLString $str32$_____A__ = makeString(";;; ~A~%");

    private static final SubLString $str33$_csetq__A__S_____ = makeString("(csetq ~A ~S)~%~%");

    private static final SubLString $str34$_check_system_parameters___ = makeString("(check-system-parameters)~%");

    private static final SubLList $list36 = list(makeString("data"));

    private static final SubLString $str37$_A___A__ = makeString("~A~%~A~%");

    private static final SubLString $str38$_A___ = makeString("~A\\~%");

    private static final SubLString $str39$_A__ = makeString("~A~%");

    private static final SubLString $str42$System_parameters_file___A__not_l = makeString("System parameters file (~A) not loaded.");

    private static final SubLList $list43 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLList $list45 = list(makeSymbol("IN-PACKAGE"), makeString("CYC"));

    static private final SubLList $list47 = list(makeSymbol("SYMBOL"), makeSymbol("VALUE"));

    private static final SubLSymbol CHECK_SYSTEM_PARAMETERS = makeSymbol("CHECK-SYSTEM-PARAMETERS");

    public static final SubLSymbol $auto_continue_transcript_problems$ = makeSymbol("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*");

    private static final SubLString $str51$If___FALSE____transcript_problems = makeString("If ::FALSE::, transcript problems will cause error breaks that \nmake the system stop. If ::TRUE::, such problems will not cause the\nthe system to stop.");

    public static final SubLSymbol $continue_agenda_on_error$ = makeSymbol("*CONTINUE-AGENDA-ON-ERROR*");

    private static final SubLString $str53$If___FALSE____agenda_errors_will_ = makeString("If ::FALSE::, agenda errors will cause the agenda process to halt.  \nIf ::TRUE::, the agenda continue automatically.");

    public static final SubLSymbol $suspend_sbhl_type_checkingP$ = makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*");

    private static final SubLString $str55$Type_checking_occurs_in_SBHL_modu = makeString("Type checking occurs in SBHL modules iff this is ::FALSE::, which\nis slower but correcter.");

    public static final SubLSymbol $really_count_transcript_ops$ = makeSymbol("*REALLY-COUNT-TRANSCRIPT-OPS*");

    private static final SubLString $str57$If___FALSE____the_System_Info_pag = makeString("If ::FALSE::, the System Info page (accessible to administrators \nonly)  will estimate, rather than actually count, the number of \noperations in the transcript.  If ::TRUE::, it will actually \ncount them, which takes longer but is accurate.");

    public static final SubLSymbol $dont_record_operations_locally$ = makeSymbol("*DONT-RECORD-OPERATIONS-LOCALLY*");

    private static final SubLString $str59$If___FALSE____a_local_transcript_ = makeString("If ::FALSE::, a local transcript will always be written when \noperations are done, even if those operations are also being written to \nthe master transcript.  If ::TRUE::, then the image does not write to a \nlocal transcript file, and will write to the master transcript when\nit is set to transmit operations.  This allows an image that is \nstandalone, and transmitting and receiving opertions, to keep only a \nsingle copy of its operations.");

    public static final SubLSymbol $start_agenda_at_startupP$ = makeSymbol("*START-AGENDA-AT-STARTUP?*");

    private static final SubLString $str61$If___FALSE____the_Cyc_agenda_is_n = makeString("If ::FALSE::, the Cyc agenda is not started at startup, but can \nbe enabled later by the user.  If ::TRUE::, the agenda is enabled at \nstartup.");

    public static final SubLSymbol $base_tcp_port$ = makeSymbol("*BASE-TCP-PORT*");

    private static final SubLInteger $int$3600 = makeInteger(3600);

    private static final SubLString $str65$The_base_port_number_for_all_the_ = makeString("The base port number for all the TCP services for the Cyc image.");

    public static final SubLSymbol $html_port_offset$ = makeSymbol("*HTML-PORT-OFFSET*");

    private static final SubLSymbol PORT_OFFSET = makeSymbol("PORT-OFFSET");

    private static final SubLString $str68$This_parameter_specifies_the_offs = makeString("This parameter specifies the offset of the HTML port offset\nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");

    public static final SubLSymbol $fi_port_offset$ = makeSymbol("*FI-PORT-OFFSET*");

    private static final SubLString $str70$This_parameter_specifies_the_offs = makeString("This parameter specifies the offset of the ASCII based Cyc API\n (application program interface) service from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");

    public static final SubLSymbol $http_port_offset$ = makeSymbol("*HTTP-PORT-OFFSET*");

    private static final SubLString $str72$This_parameter_specifies_the_offs = makeString("This parameter specifies the offset of the Cyc-internal HTTP port \nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");

    public static final SubLSymbol $servlet_port_offset$ = makeSymbol("*SERVLET-PORT-OFFSET*");

    private static final SubLString $str74$This_parameter_specifies_the_offs = makeString("This parameter specifies the offset of the Cyc-internal servlet-container port \nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");

    public static final SubLSymbol $cfasl_port_offset$ = makeSymbol("*CFASL-PORT-OFFSET*");

    private static final SubLString $str76$This_parameter_specifies_the_offs = makeString("This parameter specifies the offset of the Cyc CFASL-server,\n a binary form of the FI (API) service, from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");

    public static final SubLSymbol $sparql_port_offset$ = makeSymbol("*SPARQL-PORT-OFFSET*");

    private static final SubLString $str78$This_parameter_specifies_the_offs = makeString("This parameter specifies the offset of the Cyc SPARQL-server \nservice from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");

    public static final SubLSymbol $tcp_localhost_onlyP$ = makeSymbol("*TCP-LOCALHOST-ONLY?*");

    private static final SubLString $str80$IF___FALSE____then_remote_TCP_cli = makeString("IF ::FALSE::, then remote TCP clients can connect to Cyc, otherwise \nno remote connections are allowed. The most secure configuration \nleaves this parameter ::TRUE::, and uses a separate Web server to \nredirect HTTP requests to Cyc--which requires the HTML port to be\nconfigured and the HTTP port to be disabled.");

    public static final SubLSymbol $permit_api_host_access$ = makeSymbol("*PERMIT-API-HOST-ACCESS*");

    private static final SubLString $str82$IF___TRUE____then_API_functions_c = makeString("IF ::TRUE::, then API functions can access host services \nincluding the file system and outbound tcp connections. The most \nsecure configuration leaves this parameter ::FALSE::.");

    public static final SubLSymbol $use_transcript_server$ = makeSymbol("*USE-TRANSCRIPT-SERVER*");

    private static final SubLString $str84$IF___TRUE____then_writing_to_the_ = makeString("IF ::TRUE::, then writing to the master transcript will be \ncontrolled by the Cyc Transcript Server, which will \nneed to be installed at your site. Set this to ::TRUE:: if \nyou are running multiple instances of Cyc.  If ::FALSE::, \nthen Cyc will read and write to the master transcript \nwithout regard to other processes doing the same.");

    public static final SubLSymbol $master_transcript_lock_host$ = makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*");

    private static final SubLList $list86 = list(makeSymbol("OR"), makeSymbol("STRING"), makeSymbol("UNDEFINED"));

    private static final SubLString $str87$This_parameter_is_only_used_if__U = makeString("This parameter is only used if *USE-TRANSCRIPT-SERVER* is ::TRUE::.  \nIf so, then this parameter should be set to the name of the host \nthat runs the transcript server; the port is specified with\n*MASTER-TRANSCRIPT-SERVER-PORT*.");

    public static final SubLSymbol $master_transcript_server_port$ = makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*");

    private static final SubLInteger $int$3608 = makeInteger(3608);

    private static final SubLString $str91$This_parameter_is_only_used_if__U = makeString("This parameter is only used if *USE-TRANSCRIPT-SERVER* is ::TRUE::.  \nIf so, then this parameter should be set to the port number \nof the host (specified with *MASTER-TRANSCRIPT-LOCK-HOST*)\nread service.");

    public static final SubLSymbol $cb_editing_enabledP$ = makeSymbol("*CB-EDITING-ENABLED?*");

    private static final SubLString $str93$If___FALSE____tools_for_modifying = makeString("If ::FALSE::, tools for modifying the knowledge base are not accessible.");

    public static final SubLSymbol $cb_allow_halt_imageP$ = makeSymbol("*CB-ALLOW-HALT-IMAGE?*");

    private static final SubLString $str95$If___FALSE____the__Halt_this_imag = makeString("If ::FALSE::, the [Halt this image] link on the System Area page will not\nappear.");

    public static final SubLSymbol $allow_guest_to_editP$ = makeSymbol("*ALLOW-GUEST-TO-EDIT?*");

    private static final SubLString $str97$If___FALSE____require_authenticat = makeString("If ::FALSE::, require authentication before allowing modifications\nto the knowledge base.  If ::TRUE::, any user is allowed to modify \nthe knowledge base.");

    public static final SubLSymbol $default_cyclist_name$ = makeSymbol("*DEFAULT-CYCLIST-NAME*");

    private static final SubLString $$$Guest = makeString("Guest");

    private static final SubLString $str101$Specifies_the_name_of_the_default = makeString("Specifies the name of the default Cyclist constant under which\nusers browse the system before they log in.");

    public static final SubLSymbol $http_htdocs_directory$ = makeSymbol("*HTTP-HTDOCS-DIRECTORY*");

    private static final SubLString $str103$httpd_htdocs = makeString("httpd/htdocs");

    private static final SubLSymbol FULL_PATH = makeSymbol("FULL-PATH");

    private static final SubLString $str105$The_directory_under_which_documen = makeString("The directory under which documents served by the HTTP server are stored.");

    public static final SubLSymbol $html_image_directory$ = makeSymbol("*HTML-IMAGE-DIRECTORY*");

    private static final SubLString $str107$_cycdoc_img_ = makeString("/cycdoc/img/");

    private static final SubLString $str108$The_directory__relative_to__HTTP_ = makeString("The directory, relative to *HTTP-HTDOCS-DIRECTORY*, under which \nCyc images (.gif or otherwise) are stored");

    public static final SubLSymbol $html_javascript_directory$ = makeSymbol("*HTML-JAVASCRIPT-DIRECTORY*");

    private static final SubLString $str110$_cycdoc_js_ = makeString("/cycdoc/js/");

    private static final SubLString $str111$The_directory__relative_to__HTTP_ = makeString("The directory, relative to *HTTP-HTDOCS-DIRECTORY*, under which \nJavascript files used by the browser are stored");

    public static final SubLSymbol $html_css_directory$ = makeSymbol("*HTML-CSS-DIRECTORY*");

    private static final SubLString $str113$_cycdoc_css_ = makeString("/cycdoc/css/");

    private static final SubLSymbol $sym114$_PERMIT_UTF_8_CHARACTER_DISPLAY_ = makeSymbol("*PERMIT-UTF-8-CHARACTER-DISPLAY*");

    private static final SubLString $str115$If___TRUE____the_html_tools_will_ = makeString("If ::TRUE::, the html tools will correctly display UTF-8 text\nderived from Cyc strings.");

    public static final SubLSymbol $cyc_documentation_url$ = makeSymbol("*CYC-DOCUMENTATION-URL*");

    private static final SubLString $str117$_cycdoc_ = makeString("/cycdoc/");

    private static final SubLString $str118$The_directory__relative_to__HTTP_ = makeString("The directory, relative to *HTTP-HTDOCS-DIRECTORY*, for the \nCyc system documentation directory.");

    public static final SubLSymbol $cyc_cgi_program$ = makeSymbol("*CYC-CGI-PROGRAM*");

    private static final SubLString $$$cg = makeString("cg");

    private static final SubLString $str121$The_name_of_the_CGI_program_that_ = makeString("The name of the CGI program that acts as the intermediary \nbetween your WWW server and a Cyc server  Normally, the\nprogram will be called ``cg\'\'.  However, if your WWW server requires that\nCGI program names have a certain form, such as ``cg.exe\'\', then change\nthis parameter to conform. This is relevant only if the HTML service\nis enabled.");

    public static final SubLSymbol $constant_name_grep_enabled$ = makeSymbol("*CONSTANT-NAME-GREP-ENABLED*");

    private static final SubLString $str123$If___TRUE____the_HTML_browser_all = makeString("If ::TRUE::, the HTML browser allows users to  search for\nconstants via regular expressions via an external program, rather\nthan the internal search facility. Use of this facility requires the\nconstant-name-grep CGI program and the data file constant-shell.text to\nbe installed on your WWW server, and that the HTML service be enabled.");

    public static final SubLSymbol $cyc_grep_cgi_program$ = makeSymbol("*CYC-GREP-CGI-PROGRAM*");

    private static final SubLString $str125$constant_name_grep = makeString("constant-name-grep");

    private static final SubLString $str126$The_name_of_the_CGI_program_that_ = makeString("The name of the CGI program that is used for performing \nregular expression searches over constant names.  Normally, the\nprogram will be called ``constant-name-grep\'\'.  However, if your WWW server\nrequires that CGI program names have a certain form, such as \n``constant-name-grep.exe\'\', then change this parameter to conform.\nThis is relevant only if the HTML service is enabled.");

    private static final SubLList $list127 = list(cons(makeKeyword("CYCORP"), makeString("Assume a Cycorp execution context.")), cons(makeKeyword("UNKNOWN"), makeString("Assume an unknown execution context.")));

    public static final SubLSymbol $cyc_execution_context$ = makeSymbol("*CYC-EXECUTION-CONTEXT*");

    private static final SubLList $list130 = list(makeSymbol("MEMBER"), makeSymbol("*ALL-CYC-EXECUTION-CONTEXTS*"));

    private static final SubLString $str131$If_the_execution_context_is_set_t = makeString("If the execution context is set to :CYCORP, then the CYC image \ncan assume that it is running in Cycorp\'s development environment \nand make strong assumptions about setup and infrastructure.");

    public static final SubLObject all_system_parameters_alt() {
        return Mapping.mapcar(symbol_function(FIRST), $system_parameters$.getGlobalValue());
    }

    public static SubLObject all_system_parameters() {
        return Mapping.mapcar(symbol_function(FIRST), $system_parameters$.getGlobalValue());
    }

    /**
     * Helper function for the macro DEFINE-SYSTEM-PARAMETER
     */
    @LispMethod(comment = "Helper function for the macro DEFINE-SYSTEM-PARAMETER")
    public static final SubLObject register_system_parameter_alt(SubLObject name, SubLObject v_default, SubLObject type, SubLObject description) {
        if (NIL == member(type, $valid_system_parameter_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            Errors.warn($str_alt3$_S__S_has_an_unknown_type__S_, DEFINE_SYSTEM_PARAMETER, name, type);
        }
        com.cyc.cycjava.cycl.system_parameters.remove_system_parameter(name);
        $system_parameters$.setGlobalValue(cons(list(name, v_default, type, description), $system_parameters$.getGlobalValue()));
        return name;
    }

    /**
     * Helper function for the macro DEFINE-SYSTEM-PARAMETER
     */
    @LispMethod(comment = "Helper function for the macro DEFINE-SYSTEM-PARAMETER")
    public static SubLObject register_system_parameter(final SubLObject name, final SubLObject v_default, final SubLObject type, final SubLObject description) {
        if (NIL == system_parameter_types.valid_system_parameter_typeP(type)) {
            Errors.warn($str2$_S__S_has_an_unknown_type__S_, DEFINE_SYSTEM_PARAMETER, name, type);
        }
        remove_system_parameter(name);
        $system_parameters$.setGlobalValue(cons(list(name, v_default, type, description), $system_parameters$.getGlobalValue()));
        return name;
    }

    /**
     *
     *
     * @param NAME:
     * 		symbolp
     * 		Remove NAME from the system parameters.
     */
    @LispMethod(comment = "@param NAME:\r\n\t\tsymbolp\r\n\t\tRemove NAME from the system parameters.")
    public static final SubLObject remove_system_parameter_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        $system_parameters$.setGlobalValue(delete(name, $system_parameters$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     *
     *
     * @param NAME:
     * 		symbolp
     * 		Remove NAME from the system parameters.
     */
    @LispMethod(comment = "@param NAME:\r\n\t\tsymbolp\r\n\t\tRemove NAME from the system parameters.")
    public static SubLObject remove_system_parameter(final SubLObject name) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        $system_parameters$.setGlobalValue(delete(name, $system_parameters$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject all_system_parameter_definitions() {
        return reverse($system_parameters$.getGlobalValue());
    }

    /**
     * Define system parameter NAME with default value DEFAULT.  Note that the
     * default value is only for documentation purpose; the parameter must actually
     * be set in an initialization file.  Note also that the DESCRIPTION parameter
     * is used to construct installation scripts.  TYPE can be one of T-OR-NIL,
     * NIL-OR-STRING, STRING, FULL-PATH, INTEGER, SYMBOL, or NONE.
     */
    @LispMethod(comment = "Define system parameter NAME with default value DEFAULT.  Note that the\r\ndefault value is only for documentation purpose; the parameter must actually\r\nbe set in an initialization file.  Note also that the DESCRIPTION parameter\r\nis used to construct installation scripts.  TYPE can be one of T-OR-NIL,\r\nNIL-OR-STRING, STRING, FULL-PATH, INTEGER, SYMBOL, or NONE.\nDefine system parameter NAME with default value DEFAULT.  Note that the\ndefault value is only for documentation purpose; the parameter must actually\nbe set in an initialization file.  Note also that the DESCRIPTION parameter\nis used to construct installation scripts.  TYPE can be one of T-OR-NIL,\nNIL-OR-STRING, STRING, FULL-PATH, INTEGER, SYMBOL, or NONE.")
    public static final SubLObject define_system_parameter_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject v_default = NIL;
            SubLObject type = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            v_default = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PROGN, list(REGISTER_SYSTEM_PARAMETER, list(QUOTE, name), list(QUOTE, v_default), list(QUOTE, type), list(QUOTE, description)), list(DEFVAR, name, $UNSET, description));
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    /**
     * Define system parameter NAME with default value DEFAULT.  Note that the
     * default value is only for documentation purpose; the parameter must actually
     * be set in an initialization file.  Note also that the DESCRIPTION parameter
     * is used to construct installation scripts.  TYPE can be one of T-OR-NIL,
     * NIL-OR-STRING, STRING, FULL-PATH, INTEGER, SYMBOL, or NONE.
     */
    @LispMethod(comment = "Define system parameter NAME with default value DEFAULT.  Note that the\r\ndefault value is only for documentation purpose; the parameter must actually\r\nbe set in an initialization file.  Note also that the DESCRIPTION parameter\r\nis used to construct installation scripts.  TYPE can be one of T-OR-NIL,\r\nNIL-OR-STRING, STRING, FULL-PATH, INTEGER, SYMBOL, or NONE.\nDefine system parameter NAME with default value DEFAULT.  Note that the\ndefault value is only for documentation purpose; the parameter must actually\nbe set in an initialization file.  Note also that the DESCRIPTION parameter\nis used to construct installation scripts.  TYPE can be one of T-OR-NIL,\nNIL-OR-STRING, STRING, FULL-PATH, INTEGER, SYMBOL, or NONE.")
    public static SubLObject define_system_parameter(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject v_default = NIL;
        SubLObject type = NIL;
        SubLObject description = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        v_default = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        description = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(REGISTER_SYSTEM_PARAMETER, list(QUOTE, name), list(QUOTE, v_default), list(QUOTE, type), list(QUOTE, description)), list(DEFVAR, name, $UNSET, description));
        }
        cdestructuring_bind_error(datum, $list6);
        return NIL;
    }

    public static final SubLObject system_parameter_value_unset_p_alt(SubLObject value) {
        return eq(value, $UNSET);
    }

    public static SubLObject system_parameter_value_unset_p(final SubLObject value) {
        return eq(value, $UNSET);
    }

    public static final SubLObject check_system_parameters_alt() {
        {
            SubLObject cdolist_list_var = $system_parameters$.getGlobalValue();
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                {
                    SubLObject datum = entry;
                    SubLObject current = datum;
                    SubLObject symbol = NIL;
                    SubLObject v_default = NIL;
                    SubLObject type = NIL;
                    SubLObject description = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    symbol = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    v_default = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    description = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == boundp(symbol)) {
                            Errors.warn($str_alt14$The_system_parameter__S_is_not_bo, symbol);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.system_parameters.system_parameter_value_unset_p(symbol_value(symbol))) {
                                Errors.warn($str_alt15$The_system_parameter__S_was_not_i, symbol);
                            } else {
                                {
                                    SubLObject okP = NIL;
                                    SubLObject value = symbol_value(symbol);
                                    SubLObject pcase_var = type;
                                    if (pcase_var.eql(T_OR_NIL)) {
                                        okP = makeBoolean((value == T) || (value == NIL));
                                    } else {
                                        if (pcase_var.eql(NIL_OR_STRING)) {
                                            okP = makeBoolean((NIL == value) || value.isString());
                                        } else {
                                            if (pcase_var.eql(STRING)) {
                                                okP = stringp(value);
                                            } else {
                                                if (pcase_var.eql(FULL_PATH)) {
                                                    okP = stringp(value);
                                                } else {
                                                    if (pcase_var.eql(INTEGER)) {
                                                        okP = integerp(value);
                                                    } else {
                                                        if (pcase_var.eql(SYMBOL)) {
                                                            okP = symbolp(value);
                                                        } else {
                                                            if (pcase_var.eql(NONE)) {
                                                                okP = T;
                                                            } else {
                                                                okP = NIL;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == okP) {
                                        Errors.warn($str_alt23$The_system_paramater__S_has_the_v, symbol, value, type);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt13);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject check_system_parameters() {
        SubLObject cdolist_list_var = $system_parameters$.getGlobalValue();
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = entry;
            SubLObject symbol = NIL;
            SubLObject v_default = NIL;
            SubLObject type = NIL;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list12);
            symbol = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list12);
            v_default = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list12);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list12);
            description = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == boundp(symbol)) {
                    Errors.warn($str13$The_system_parameter__S_is_not_bo, symbol);
                } else
                    if (NIL != system_parameter_value_unset_p(symbol_value(symbol))) {
                        Errors.warn($str14$The_system_parameter__S_was_not_i, symbol);
                    } else
                        if (NIL == system_parameter_types.valid_system_parameter_typeP(type)) {
                            Errors.warn($str15$The_system_parameter__A_has_a_bog, symbol, type);
                        } else {
                            final SubLObject value = symbol_value(symbol);
                            if (NIL == system_parameter_types.check_system_parameter_value(value, type)) {
                                Errors.warn($str16$The_system_paramater__S_has_the_v, symbol, value, type);
                            }
                        }


            } else {
                cdestructuring_bind_error(datum, $list12);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Replace non-alphanumeric characters in STRING with hex codes.
     */
    @LispMethod(comment = "Replace non-alphanumeric characters in STRING with hex codes.")
    public static final SubLObject alphanumericize_string_alt(SubLObject string) {
        {
            SubLObject size = add(length(string), ONE_INTEGER);
            {
                SubLObject cdotimes_end_var = length(string);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    if (NIL == alphanumericp(Strings.sublisp_char(string, i))) {
                        size = add(size, ONE_INTEGER);
                    }
                }
            }
            {
                SubLObject frobbed = Strings.make_string(size, UNPROVIDED);
                SubLObject idx = ONE_INTEGER;
                Strings.set_char(frobbed, ZERO_INTEGER, CHAR_E);
                {
                    SubLObject cdotimes_end_var = length(string);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject v_char = Strings.sublisp_char(string, i);
                            if (NIL != alphanumericp(v_char)) {
                                Strings.set_char(frobbed, idx, v_char);
                                idx = add(idx, ONE_INTEGER);
                            } else {
                                {
                                    SubLObject code = char_code(v_char);
                                    SubLObject map = $ic24;
                                    Strings.set_char(frobbed, idx, aref(map, integerDivide(code, SIXTEEN_INTEGER)));
                                    idx = add(idx, ONE_INTEGER);
                                    Strings.set_char(frobbed, idx, aref(map, mod(code, SIXTEEN_INTEGER)));
                                    idx = add(idx, ONE_INTEGER);
                                }
                            }
                        }
                    }
                }
                return frobbed;
            }
        }
    }

    /**
     * Replace non-alphanumeric characters in STRING with hex codes.
     */
    @LispMethod(comment = "Replace non-alphanumeric characters in STRING with hex codes.")
    public static SubLObject alphanumericize_string(final SubLObject string) {
        SubLObject size = add(length(string), ONE_INTEGER);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(string), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            if (NIL == alphanumericp(Strings.sublisp_char(string, i))) {
                size = add(size, ONE_INTEGER);
            }
        }
        final SubLObject frobbed = Strings.make_string(size, UNPROVIDED);
        SubLObject idx = ONE_INTEGER;
        Strings.set_char(frobbed, ZERO_INTEGER, CHAR_E);
        SubLObject cdotimes_end_var2;
        SubLObject j;
        SubLObject v_char;
        SubLObject code;
        SubLObject map;
        for (cdotimes_end_var2 = length(string), j = NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var2); j = add(j, ONE_INTEGER)) {
            v_char = Strings.sublisp_char(string, j);
            if (NIL != alphanumericp(v_char)) {
                Strings.set_char(frobbed, idx, v_char);
                idx = add(idx, ONE_INTEGER);
            } else {
                code = char_code(v_char);
                map = $ic17;
                Strings.set_char(frobbed, idx, aref(map, integerDivide(code, SIXTEEN_INTEGER)));
                idx = add(idx, ONE_INTEGER);
                Strings.set_char(frobbed, idx, aref(map, mod(code, SIXTEEN_INTEGER)));
                idx = add(idx, ONE_INTEGER);
            }
        }
        return frobbed;
    }

    public static SubLObject get_parameter_description_lines(final SubLObject description, final SubLObject substitutions, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        final SubLObject base_lines = string_utilities.extract_lines(description);
        return localize_boolean_description_lines(base_lines, substitutions, test);
    }

    public static SubLObject localize_boolean_description_lines(final SubLObject base_lines, final SubLObject substitutions, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        SubLObject lines = NIL;
        SubLObject cdolist_list_var = base_lines;
        SubLObject curr_line = NIL;
        curr_line = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = substitutions;
            SubLObject substitution = NIL;
            substitution = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                SubLObject current;
                final SubLObject datum = current = substitution;
                SubLObject v_new = NIL;
                SubLObject old = NIL;
                destructuring_bind_must_consp(current, datum, $list18);
                v_new = current.first();
                current = old = current.rest();
                if (NIL != search(old, curr_line, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    curr_line = string_utilities.string_substitute(v_new, old, curr_line, test);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                substitution = cdolist_list_var_$1.first();
            } 
            lines = cons(curr_line, lines);
            cdolist_list_var = cdolist_list_var.rest();
            curr_line = cdolist_list_var.first();
        } 
        return nreverse(lines);
    }

    public static final SubLObject setup_system_parameters_alt(SubLObject format, SubLObject pathname) {
        if (pathname == UNPROVIDED) {
            pathname = NIL;
        }
        {
            SubLObject pcase_var = format;
            if (pcase_var.eql($LISP)) {
                if (NIL == pathname) {
                    pathname = file_utilities.cyc_home_filename($list_alt26, $$$parameters, $$$lisp);
                }
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(pathname, $OUTPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt30$Unable_to_open__S, pathname);
                        }
                        {
                            SubLObject s = stream;
                            format(s, $str_alt31$________Mode__LISP__Syntax__ANSI_);
                            format(s, $str_alt32$____Cyc_system_parameters__);
                            format(s, $str_alt33$_____);
                            format(s, $str_alt34$____Generated__A_from_CycL__A____, numeric_date_utilities.timestring(UNPROVIDED), system_info.cyc_revision_string());
                            format(s, $str_alt35$_in_package__CYC_____);
                            {
                                SubLObject cdolist_list_var = reverse($system_parameters$.getGlobalValue());
                                SubLObject entry = NIL;
                                for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = entry;
                                        SubLObject current = datum;
                                        SubLObject symbol = NIL;
                                        SubLObject v_default = NIL;
                                        SubLObject type = NIL;
                                        SubLObject description = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt13);
                                        symbol = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt13);
                                        v_default = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt13);
                                        type = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt13);
                                        description = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject cdolist_list_var_1 = extract_lines(description);
                                                SubLObject line = NIL;
                                                for (line = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , line = cdolist_list_var_1.first()) {
                                                    format(s, $str_alt36$_____A__, line);
                                                }
                                            }
                                            format(s, $str_alt37$_csetq__A__S_____, symbol, v_default);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt13);
                                        }
                                    }
                                }
                            }
                            format(s, $str_alt38$_check_system_parameters___);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            } else {
                if (pcase_var.eql($CONFIG)) {
                    if (NIL == pathname) {
                        pathname = file_utilities.cyc_home_filename($list_alt40, $$$parameters, UNPROVIDED);
                    }
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(pathname, $OUTPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt30$Unable_to_open__S, pathname);
                            }
                            {
                                SubLObject s = stream;
                                SubLObject cdolist_list_var = reverse($system_parameters$.getGlobalValue());
                                SubLObject entry = NIL;
                                for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = entry;
                                        SubLObject current = datum;
                                        SubLObject symbol = NIL;
                                        SubLObject v_default = NIL;
                                        SubLObject type = NIL;
                                        SubLObject description = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt13);
                                        symbol = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt13);
                                        v_default = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt13);
                                        type = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt13);
                                        description = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject string = Strings.string(symbol);
                                                format(s, $str_alt41$_A___A__, com.cyc.cycjava.cycl.system_parameters.alphanumericize_string(string), string);
                                                if (v_default.isString()) {
                                                    {
                                                        SubLObject lines = extract_lines(v_default);
                                                        SubLObject cdolist_list_var_2 = butlast(lines, UNPROVIDED);
                                                        SubLObject line = NIL;
                                                        for (line = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , line = cdolist_list_var_2.first()) {
                                                            format(s, $str_alt42$_A___, line);
                                                        }
                                                        format(s, $str_alt43$_A__, last(lines, UNPROVIDED).first());
                                                    }
                                                } else {
                                                    if (v_default.isSymbol()) {
                                                        format(s, $str_alt43$_A__, symbol_name(v_default));
                                                    } else {
                                                        format(s, $str_alt43$_A__, v_default);
                                                    }
                                                }
                                                {
                                                    SubLObject lines = extract_lines(description);
                                                    SubLObject cdolist_list_var_3 = butlast(lines, UNPROVIDED);
                                                    SubLObject line = NIL;
                                                    for (line = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , line = cdolist_list_var_3.first()) {
                                                        format(s, $str_alt42$_A___, line);
                                                    }
                                                    format(s, $str_alt43$_A__, last(lines, UNPROVIDED).first());
                                                }
                                                format(s, $str_alt43$_A__, substitute(CHAR_underbar, CHAR_hyphen, Strings.string_downcase(Strings.string(type), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                terpri(s);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt13);
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject setup_system_parameters(final SubLObject format, SubLObject pathname) {
        if (pathname == UNPROVIDED) {
            pathname = NIL;
        }
        if (format.eql($LISP)) {
            if (NIL == pathname) {
                pathname = file_utilities.cyc_home_filename($list20, $$$parameters, $$$lisp);
            }
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(pathname, $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str24$Unable_to_open__S, pathname);
                }
                final SubLObject s = stream;
                format(s, $str25$________Mode__LISP__Syntax__ANSI_);
                format(s, $str26$____Cyc_system_parameters__);
                format(s, $str27$_____);
                format(s, $str28$____Generated__A_from_CycL__A____, numeric_date_utilities.timestring(UNPROVIDED), system_info.cyc_revision_string());
                format(s, $str29$_in_package__CYC_____);
                final SubLObject substitutions = $list30;
                SubLObject cdolist_list_var = all_system_parameter_definitions();
                SubLObject entry = NIL;
                entry = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = entry;
                    SubLObject symbol = NIL;
                    SubLObject v_default = NIL;
                    SubLObject type = NIL;
                    SubLObject description = NIL;
                    destructuring_bind_must_consp(current, datum, $list12);
                    symbol = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list12);
                    v_default = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list12);
                    type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list12);
                    description = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject possible_values = system_parameter_types.determine_system_parameter_type_possible_values_string(type, UNPROVIDED);
                        final SubLObject localized = localize_boolean_description_lines(list(possible_values), substitutions, UNPROVIDED).first();
                        format(s, $str31$____Possible_Values___A__, localized);
                        SubLObject cdolist_list_var_$2 = get_parameter_description_lines(description, substitutions, UNPROVIDED);
                        SubLObject line = NIL;
                        line = cdolist_list_var_$2.first();
                        while (NIL != cdolist_list_var_$2) {
                            format(s, $str32$_____A__, line);
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            line = cdolist_list_var_$2.first();
                        } 
                        format(s, $str33$_csetq__A__S_____, symbol, v_default);
                    } else {
                        cdestructuring_bind_error(datum, $list12);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    entry = cdolist_list_var.first();
                } 
                format(s, $str34$_check_system_parameters___);
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        } else
            if (format.eql($CONFIG)) {
                if (NIL == pathname) {
                    pathname = file_utilities.cyc_home_filename($list36, $$$parameters, UNPROVIDED);
                }
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(pathname, $OUTPUT);
                    if (!stream.isStream()) {
                        Errors.error($str24$Unable_to_open__S, pathname);
                    }
                    final SubLObject s = stream;
                    SubLObject cdolist_list_var2 = reverse($system_parameters$.getGlobalValue());
                    SubLObject entry2 = NIL;
                    entry2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        SubLObject current2;
                        final SubLObject datum2 = current2 = entry2;
                        SubLObject symbol2 = NIL;
                        SubLObject v_default2 = NIL;
                        SubLObject type2 = NIL;
                        SubLObject description2 = NIL;
                        destructuring_bind_must_consp(current2, datum2, $list12);
                        symbol2 = current2.first();
                        current2 = current2.rest();
                        destructuring_bind_must_consp(current2, datum2, $list12);
                        v_default2 = current2.first();
                        current2 = current2.rest();
                        destructuring_bind_must_consp(current2, datum2, $list12);
                        type2 = current2.first();
                        current2 = current2.rest();
                        destructuring_bind_must_consp(current2, datum2, $list12);
                        description2 = current2.first();
                        current2 = current2.rest();
                        if (NIL == current2) {
                            final SubLObject string = Strings.string(symbol2);
                            format(s, $str37$_A___A__, alphanumericize_string(string), string);
                            if (v_default2.isString()) {
                                final SubLObject lines = string_utilities.extract_lines(v_default2);
                                SubLObject cdolist_list_var_$3 = butlast(lines, UNPROVIDED);
                                SubLObject line2 = NIL;
                                line2 = cdolist_list_var_$3.first();
                                while (NIL != cdolist_list_var_$3) {
                                    format(s, $str38$_A___, line2);
                                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                    line2 = cdolist_list_var_$3.first();
                                } 
                                format(s, $str39$_A__, last(lines, UNPROVIDED).first());
                            } else
                                if (v_default2.isSymbol()) {
                                    format(s, $str39$_A__, symbol_name(v_default2));
                                } else {
                                    format(s, $str39$_A__, v_default2);
                                }

                            final SubLObject lines = string_utilities.extract_lines(description2);
                            SubLObject cdolist_list_var_$4 = butlast(lines, UNPROVIDED);
                            SubLObject line2 = NIL;
                            line2 = cdolist_list_var_$4.first();
                            while (NIL != cdolist_list_var_$4) {
                                format(s, $str38$_A___, line2);
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                line2 = cdolist_list_var_$4.first();
                            } 
                            format(s, $str39$_A__, last(lines, UNPROVIDED).first());
                            format(s, $str39$_A__, substitute(CHAR_underbar, CHAR_hyphen, Strings.string_downcase(Strings.string(type2), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            terpri(s);
                        } else {
                            cdestructuring_bind_error(datum2, $list12);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        entry2 = cdolist_list_var2.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values2 = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                    }
                }
            }

        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("T-OR-NIL"), makeSymbol("NIL-OR-STRING"), makeSymbol("STRING"), makeSymbol("FULL-PATH"), makeSymbol("INTEGER"), makeSymbol("SYMBOL"), makeSymbol("NONE"));

    static private final SubLString $str_alt3$_S__S_has_an_unknown_type__S_ = makeString("~S ~S has an unknown type ~S.");

    static private final SubLList $list_alt7 = list(makeSymbol("NAME"), makeSymbol("DEFAULT"), makeSymbol("TYPE"), makeSymbol("DESCRIPTION"));

    static private final SubLList $list_alt13 = list(makeSymbol("SYMBOL"), makeSymbol("DEFAULT"), makeSymbol("TYPE"), makeSymbol("DESCRIPTION"));

    static private final SubLString $str_alt14$The_system_parameter__S_is_not_bo = makeString("The system parameter ~S is not bound.");

    static private final SubLString $str_alt15$The_system_parameter__S_was_not_i = makeString("The system parameter ~S was not initialized.");

    private static final SubLSymbol T_OR_NIL = makeSymbol("T-OR-NIL");

    private static final SubLSymbol NIL_OR_STRING = makeSymbol("NIL-OR-STRING");

    static private final SubLString $str_alt23$The_system_paramater__S_has_the_v = makeString("The system paramater ~S has the value ~S, but it is supposed to be ~S.");

    public static final SubLObject $ic24 = vector(new SubLObject[]{ CHAR_0, CHAR_1, CHAR_2, CHAR_3, CHAR_4, CHAR_5, CHAR_6, CHAR_7, CHAR_8, CHAR_9, CHAR_A, CHAR_B, CHAR_C, CHAR_D, CHAR_E, CHAR_F });

    static private final SubLList $list_alt26 = list(makeString("init"));

    static private final SubLString $str_alt30$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt31$________Mode__LISP__Syntax__ANSI_ = makeString(";;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10; Package: CYC;  -*-~%~%");

    static private final SubLString $str_alt32$____Cyc_system_parameters__ = makeString(";;; Cyc system parameters~%");

    /**
     * Load the system-parameters file.
     */
    @LispMethod(comment = "Load the system-parameters file.")
    public static final SubLObject load_system_parameters_alt() {
        {
            SubLObject filename = file_utilities.cyc_home_filename($list_alt26, $$$parameters, $$$lisp);
            if (NIL != Filesys.probe_file(filename)) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(filename, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt30$Unable_to_open__S, filename);
                        }
                        {
                            SubLObject stream_4 = stream;
                            SubLObject done = NIL;
                            while (NIL == done) {
                                {
                                    SubLObject form = com.cyc.cycjava.cycl.system_parameters.read_parameter_form(stream_4);
                                    if ($EOF == form) {
                                        done = T;
                                    } else {
                                        com.cyc.cycjava.cycl.system_parameters.evaluate_parameter_form(form);
                                    }
                                }
                            } 
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            } else {
                Errors.warn($str_alt46$System_parameters_file___A__not_l, filename);
            }
        }
        return NIL;
    }

    /**
     * Load the system-parameters file.
     */
    @LispMethod(comment = "Load the system-parameters file.")
    public static SubLObject load_system_parameters() {
        final SubLObject filename = file_utilities.cyc_home_filename($list20, $$$parameters, $$$lisp);
        if (NIL != Filesys.probe_file(filename)) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $INPUT);
                if (!stream.isStream()) {
                    Errors.error($str24$Unable_to_open__S, filename);
                }
                final SubLObject stream_$5 = stream;
                SubLObject done = NIL;
                while (NIL == done) {
                    final SubLObject form = read_parameter_form(stream_$5);
                    if ($EOF == form) {
                        done = T;
                    } else {
                        evaluate_parameter_form(form);
                    }
                } 
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        } else {
            Errors.warn($str42$System_parameters_file___A__not_l, filename);
        }
        return NIL;
    }

    static private final SubLString $str_alt33$_____ = makeString(";;;~%");

    static private final SubLString $str_alt34$____Generated__A_from_CycL__A____ = makeString(";;; Generated ~A from CycL ~A~%~%");

    static private final SubLString $str_alt35$_in_package__CYC_____ = makeString("(in-package :CYC)~%~%");

    static private final SubLString $str_alt36$_____A__ = makeString(";;; ~A~%");

    static private final SubLString $str_alt37$_csetq__A__S_____ = makeString("(csetq ~A ~S)~%~%");

    static private final SubLString $str_alt38$_check_system_parameters___ = makeString("(check-system-parameters)~%");

    static private final SubLList $list_alt40 = list(makeString("data"));

    static private final SubLString $str_alt41$_A___A__ = makeString("~A~%~A~%");

    static private final SubLString $str_alt42$_A___ = makeString("~A\\~%");

    static private final SubLString $str_alt43$_A__ = makeString("~A~%");

    static private final SubLString $str_alt46$System_parameters_file___A__not_l = makeString("System parameters file (~A) not loaded.");

    static private final SubLList $list_alt47 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt49 = list(makeSymbol("IN-PACKAGE"), makeString("CYC"));

    static private final SubLList $list_alt51 = list(makeSymbol("SYMBOL"), makeSymbol("VALUE"));

    public static final SubLObject read_parameter_form_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parameter_form = NIL;
                {
                    SubLObject _prev_bind_0 = $read_eval$.currentBinding(thread);
                    try {
                        $read_eval$.bind(NIL, thread);
                        parameter_form = read(stream, NIL, $EOF, UNPROVIDED);
                    } finally {
                        $read_eval$.rebind(_prev_bind_0, thread);
                    }
                }
                return parameter_form;
            }
        }
    }

    public static SubLObject read_parameter_form(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parameter_form = NIL;
        final SubLObject _prev_bind_0 = $read_eval$.currentBinding(thread);
        try {
            $read_eval$.bind(NIL, thread);
            parameter_form = read(stream, NIL, $EOF, UNPROVIDED);
        } finally {
            $read_eval$.rebind(_prev_bind_0, thread);
        }
        return parameter_form;
    }

    static private final SubLString $str_alt54$Possible_values__NIL__T___If_NIL_ = makeString("Possible values: NIL, T.  If NIL, transcript problems will cause error\nbreaks that make the system stop.  If T, such problems will not cause\nbreakage.");

    static private final SubLString $str_alt56$Possible_values__NIL__T___If_NIL_ = makeString("Possible values: NIL, T.  If NIL, agenda errors will cause the system to\nhalt.  If T, they will be automatically continued.");

    public static final SubLObject evaluate_parameter_form_alt(SubLObject form) {
        {
            SubLObject datum = form;
            SubLObject current = datum;
            SubLObject operator = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            operator = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject pcase_var = operator;
                if (pcase_var.eql(IN_PACKAGE)) {
                    eval($list_alt49);
                } else {
                    if (pcase_var.eql(CSETQ)) {
                        {
                            SubLObject datum_5 = args;
                            SubLObject current_6 = datum_5;
                            SubLObject symbol = NIL;
                            SubLObject value = NIL;
                            destructuring_bind_must_consp(current_6, datum_5, $list_alt51);
                            symbol = current_6.first();
                            current_6 = current_6.rest();
                            destructuring_bind_must_consp(current_6, datum_5, $list_alt51);
                            value = current_6.first();
                            current_6 = current_6.rest();
                            if (NIL == current_6) {
                                if (NIL != member(symbol, $system_parameters$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST))) {
                                    set(symbol, com.cyc.cycjava.cycl.system_parameters.evaluate_parameter_value(value));
                                }
                            } else {
                                cdestructuring_bind_error(datum_5, $list_alt51);
                            }
                        }
                    } else {
                        if (pcase_var.eql(CHECK_SYSTEM_PARAMETERS)) {
                            com.cyc.cycjava.cycl.system_parameters.check_system_parameters();
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject evaluate_parameter_form(final SubLObject form) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(form, form, $list43);
        operator = form.first();
        final SubLObject args;
        final SubLObject current = args = form.rest();
        final SubLObject pcase_var = operator;
        if (pcase_var.eql(IN_PACKAGE)) {
            eval($list45);
        } else
            if (pcase_var.eql(CSETQ)) {
                SubLObject current_$7;
                final SubLObject datum_$6 = current_$7 = args;
                SubLObject symbol = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current_$7, datum_$6, $list47);
                symbol = current_$7.first();
                current_$7 = current_$7.rest();
                destructuring_bind_must_consp(current_$7, datum_$6, $list47);
                value = current_$7.first();
                current_$7 = current_$7.rest();
                if (NIL == current_$7) {
                    if (NIL != member(symbol, $system_parameters$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST))) {
                        set(symbol, evaluate_parameter_value(value));
                    }
                } else {
                    cdestructuring_bind_error(datum_$6, $list47);
                }
            } else
                if (pcase_var.eql(CHECK_SYSTEM_PARAMETERS)) {
                    check_system_parameters();
                }


        return NIL;
    }

    static private final SubLString $str_alt58$Possible_values__T__NIL___Type_ch = makeString("Possible values: T, NIL.  Type checking occurs in SBHL modules iff this\nis nil.");

    static private final SubLString $str_alt60$Possible_values__T__NIL___If_NIL_ = makeString("Possible values: T, NIL.  If NIL, the System Info page (accessible to\nadministrators only) will estimate, rather than actually count, the\nnumber of operations in the transcript.  If T, it will actually count\nthem, which takes longer but is accurate.");

    static private final SubLString $str_alt62$Possible_values__NIL__T___If_NIL_ = makeString("Possible values: NIL, T.  If NIL, a local transcript will always be \nwritten when operations are done, even if those operations are also being \nwritten to the master transcript.  If T, then the image does not write \nto a local transcript file, and will write to the master transcript when\nit is set to transmit operations.  This allows an image that is standalone,\nand always in :TRANSMIT-AND-RECEIVE, to keep only a single copy of its \noperations.");

    public static final SubLObject evaluate_parameter_value_alt(SubLObject value) {
        if (value.isAtom()) {
            return value;
        }
        {
            SubLObject datum = value;
            SubLObject current = datum;
            SubLObject operator = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            operator = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                if (QUOTE == operator) {
                    return args.first();
                }
            }
        }
        return NIL;
    }

    public static SubLObject evaluate_parameter_value(final SubLObject value) {
        if (value.isAtom()) {
            return value;
        }
        SubLObject operator = NIL;
        destructuring_bind_must_consp(value, value, $list43);
        operator = value.first();
        final SubLObject args;
        final SubLObject current = args = value.rest();
        if (QUOTE == operator) {
            return args.first();
        }
        return NIL;
    }

    static private final SubLString $str_alt65$Possible_values_____TRANSMIT_AND_ = makeString("Possible values -- :TRANSMIT-AND-RECEIVE, :RECEIVE-ONLY, \n:ISOLATED, :DEAF, :DEAD.  This is the communication mode the cyc image \nshould get initialized to at startup.");

    public static SubLObject cyc_documentation_url() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cyc_documentation_url$.getDynamicValue(thread);
    }

    static private final SubLString $str_alt67$Possible_values__T__NIL___If_NIL_ = makeString("Possible values: T, NIL.  If NIL, the Cyc agenda is not started at \nstartup, but can be enabled later by the user.  If T, the agenda is enabled\nat startup.");

    public static SubLObject declare_system_parameters_file() {
        declareFunction("all_system_parameters", "ALL-SYSTEM-PARAMETERS", 0, 0, false);
        declareFunction("register_system_parameter", "REGISTER-SYSTEM-PARAMETER", 4, 0, false);
        declareFunction("remove_system_parameter", "REMOVE-SYSTEM-PARAMETER", 1, 0, false);
        declareFunction("all_system_parameter_definitions", "ALL-SYSTEM-PARAMETER-DEFINITIONS", 0, 0, false);
        declareMacro("define_system_parameter", "DEFINE-SYSTEM-PARAMETER");
        declareFunction("system_parameter_value_unset_p", "SYSTEM-PARAMETER-VALUE-UNSET-P", 1, 0, false);
        declareFunction("check_system_parameters", "CHECK-SYSTEM-PARAMETERS", 0, 0, false);
        declareFunction("alphanumericize_string", "ALPHANUMERICIZE-STRING", 1, 0, false);
        declareFunction("get_parameter_description_lines", "GET-PARAMETER-DESCRIPTION-LINES", 2, 1, false);
        declareFunction("localize_boolean_description_lines", "LOCALIZE-BOOLEAN-DESCRIPTION-LINES", 2, 1, false);
        declareFunction("setup_system_parameters", "SETUP-SYSTEM-PARAMETERS", 1, 1, false);
        declareFunction("load_system_parameters", "LOAD-SYSTEM-PARAMETERS", 0, 0, false);
        declareFunction("read_parameter_form", "READ-PARAMETER-FORM", 1, 0, false);
        declareFunction("evaluate_parameter_form", "EVALUATE-PARAMETER-FORM", 1, 0, false);
        declareFunction("evaluate_parameter_value", "EVALUATE-PARAMETER-VALUE", 1, 0, false);
        declareFunction("cyc_documentation_url", "CYC-DOCUMENTATION-URL", 0, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt70$The_base_port_offset_for_all_the_ = makeString("The base port offset for all the TCP services for the Cyc image.");

    static private final SubLString $str_alt72$Possible_values__A_number___This_ = makeString("Possible values: A number.  This parameter specifies the offset of the html port\nfrom *base-tcp-port*.");

    static private final SubLString $str_alt74$Possible_values__A_number___This_ = makeString("Possible values: A number.  This parameter specifies the offset of the Cyc API\n (application program interface) service from *base-tcp-port*.");

    static private final SubLString $str_alt76$Possible_values__A_number___This_ = makeString("Possible values: A number.  This parameter specifies the offset of the http port\nfrom *base-tcp-port*.");

    static private final SubLString $str_alt78$Possible_values__A_number___This_ = makeString("Possible values: A number.  This parameter specifies the offset of the Cyc \nCFASL-server service from *base-tcp-port*.");

    public static final SubLObject init_system_parameters_file_alt() {
        deflexical("*VALID-SYSTEM-PARAMETER-TYPES*", $list_alt0);
        deflexical("*SYSTEM-PARAMETERS*", NIL != boundp($system_parameters$) ? ((SubLObject) ($system_parameters$.getGlobalValue())) : NIL);
        defvar("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*", $UNSET);
        defvar("*CONTINUE-AGENDA-ON-ERROR*", $UNSET);
        defvar("*SUSPEND-SBHL-TYPE-CHECKING?*", $UNSET);
        defvar("*REALLY-COUNT-TRANSCRIPT-OPS*", $UNSET);
        defvar("*DONT-RECORD-OPERATIONS-LOCALLY*", $UNSET);
        defvar("*STARTUP-COMMUNICATION-MODE*", $UNSET);
        defvar("*START-AGENDA-AT-STARTUP?*", $UNSET);
        defvar("*BASE-TCP-PORT*", $UNSET);
        defvar("*HTML-PORT-OFFSET*", $UNSET);
        defvar("*FI-PORT-OFFSET*", $UNSET);
        defvar("*HTTP-PORT-OFFSET*", $UNSET);
        defvar("*CFASL-PORT-OFFSET*", $UNSET);
        defvar("*PERMIT-API-HOST-ACCESS*", $UNSET);
        defvar("*USE-TRANSCRIPT-SERVER*", $UNSET);
        defvar("*MASTER-TRANSCRIPT-LOCK-HOST*", $UNSET);
        defvar("*MASTER-TRANSCRIPT-SERVER-PORT*", $UNSET);
        defvar("*CB-EDITING-ENABLED?*", $UNSET);
        defvar("*ALLOW-GUEST-TO-EDIT?*", $UNSET);
        defvar("*DEFAULT-CYCLIST-NAME*", $UNSET);
        defvar("*HTTP-HTDOCS-DIRECTORY*", $UNSET);
        defvar("*HTML-IMAGE-DIRECTORY*", $UNSET);
        defvar("*HTML-JAVASCRIPT-DIRECTORY*", $UNSET);
        defvar("*HTML-CSS-DIRECTORY*", $UNSET);
        defvar("*PERMIT-UTF-8-CHARACTER-DISPLAY*", $UNSET);
        defvar("*CYC-DOCUMENTATION-URL*", $UNSET);
        defvar("*CYC-CGI-PROGRAM*", $UNSET);
        defvar("*CONSTANT-NAME-GREP-ENABLED*", $UNSET);
        defvar("*CYC-GREP-CGI-PROGRAM*", $UNSET);
        defvar("*CYC-EXECUTION-CONTEXT*", $UNSET);
        return NIL;
    }

    public static SubLObject init_system_parameters_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SYSTEM-PARAMETERS*", SubLTrampolineFile.maybeDefault($system_parameters$, $system_parameters$, NIL));
            defvar("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*", $UNSET);
            defvar("*CONTINUE-AGENDA-ON-ERROR*", $UNSET);
            defvar("*SUSPEND-SBHL-TYPE-CHECKING?*", $UNSET);
            defvar("*REALLY-COUNT-TRANSCRIPT-OPS*", $UNSET);
            defvar("*DONT-RECORD-OPERATIONS-LOCALLY*", $UNSET);
            defvar("*START-AGENDA-AT-STARTUP?*", $UNSET);
            defvar("*BASE-TCP-PORT*", $UNSET);
            defvar("*HTML-PORT-OFFSET*", $UNSET);
            defvar("*FI-PORT-OFFSET*", $UNSET);
            defvar("*HTTP-PORT-OFFSET*", $UNSET);
            defvar("*SERVLET-PORT-OFFSET*", $UNSET);
            defvar("*CFASL-PORT-OFFSET*", $UNSET);
            defvar("*SPARQL-PORT-OFFSET*", $UNSET);
            defvar("*PERMIT-API-HOST-ACCESS*", $UNSET);
            defvar("*USE-TRANSCRIPT-SERVER*", $UNSET);
            defvar("*MASTER-TRANSCRIPT-LOCK-HOST*", $UNSET);
            defvar("*MASTER-TRANSCRIPT-SERVER-PORT*", $UNSET);
            defvar("*CB-EDITING-ENABLED?*", $UNSET);
            defvar("*CB-ALLOW-HALT-IMAGE?*", $UNSET);
            defvar("*ALLOW-GUEST-TO-EDIT?*", $UNSET);
            defvar("*DEFAULT-CYCLIST-NAME*", $UNSET);
            defvar("*HTTP-HTDOCS-DIRECTORY*", $UNSET);
            defvar("*HTML-IMAGE-DIRECTORY*", $UNSET);
            defvar("*HTML-JAVASCRIPT-DIRECTORY*", $UNSET);
            defvar("*HTML-CSS-DIRECTORY*", $UNSET);
            defvar("*PERMIT-UTF-8-CHARACTER-DISPLAY*", $UNSET);
            defvar("*CYC-DOCUMENTATION-URL*", $UNSET);
            defvar("*CYC-CGI-PROGRAM*", $UNSET);
            defvar("*CONSTANT-NAME-GREP-ENABLED*", $UNSET);
            defvar("*CYC-GREP-CGI-PROGRAM*", $UNSET);
            deflexical("*ALL-CYC-EXECUTION-CONTEXTS*", $list127);
            defvar("*CYC-EXECUTION-CONTEXT*", $UNSET);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*VALID-SYSTEM-PARAMETER-TYPES*", $list_alt0);
            deflexical("*SYSTEM-PARAMETERS*", NIL != boundp($system_parameters$) ? ((SubLObject) ($system_parameters$.getGlobalValue())) : NIL);
            defvar("*STARTUP-COMMUNICATION-MODE*", $UNSET);
        }
        return NIL;
    }

    public static SubLObject init_system_parameters_file_Previous() {
        deflexical("*SYSTEM-PARAMETERS*", SubLTrampolineFile.maybeDefault($system_parameters$, $system_parameters$, NIL));
        defvar("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*", $UNSET);
        defvar("*CONTINUE-AGENDA-ON-ERROR*", $UNSET);
        defvar("*SUSPEND-SBHL-TYPE-CHECKING?*", $UNSET);
        defvar("*REALLY-COUNT-TRANSCRIPT-OPS*", $UNSET);
        defvar("*DONT-RECORD-OPERATIONS-LOCALLY*", $UNSET);
        defvar("*START-AGENDA-AT-STARTUP?*", $UNSET);
        defvar("*BASE-TCP-PORT*", $UNSET);
        defvar("*HTML-PORT-OFFSET*", $UNSET);
        defvar("*FI-PORT-OFFSET*", $UNSET);
        defvar("*HTTP-PORT-OFFSET*", $UNSET);
        defvar("*SERVLET-PORT-OFFSET*", $UNSET);
        defvar("*CFASL-PORT-OFFSET*", $UNSET);
        defvar("*SPARQL-PORT-OFFSET*", $UNSET);
        defvar("*PERMIT-API-HOST-ACCESS*", $UNSET);
        defvar("*USE-TRANSCRIPT-SERVER*", $UNSET);
        defvar("*MASTER-TRANSCRIPT-LOCK-HOST*", $UNSET);
        defvar("*MASTER-TRANSCRIPT-SERVER-PORT*", $UNSET);
        defvar("*CB-EDITING-ENABLED?*", $UNSET);
        defvar("*CB-ALLOW-HALT-IMAGE?*", $UNSET);
        defvar("*ALLOW-GUEST-TO-EDIT?*", $UNSET);
        defvar("*DEFAULT-CYCLIST-NAME*", $UNSET);
        defvar("*HTTP-HTDOCS-DIRECTORY*", $UNSET);
        defvar("*HTML-IMAGE-DIRECTORY*", $UNSET);
        defvar("*HTML-JAVASCRIPT-DIRECTORY*", $UNSET);
        defvar("*HTML-CSS-DIRECTORY*", $UNSET);
        defvar("*PERMIT-UTF-8-CHARACTER-DISPLAY*", $UNSET);
        defvar("*CYC-DOCUMENTATION-URL*", $UNSET);
        defvar("*CYC-CGI-PROGRAM*", $UNSET);
        defvar("*CONSTANT-NAME-GREP-ENABLED*", $UNSET);
        defvar("*CYC-GREP-CGI-PROGRAM*", $UNSET);
        deflexical("*ALL-CYC-EXECUTION-CONTEXTS*", $list127);
        defvar("*CYC-EXECUTION-CONTEXT*", $UNSET);
        return NIL;
    }

    static private final SubLString $str_alt80$Possible_values__T__NIL___IF_NIL_ = makeString("Possible values: T, NIL.  IF NIL, then remote TCP clients can connect to Cyc, otherwise no remote connections are allowed. The most secure configuration leaves this parameter T, and uses a separate Web server to redirect HTTP requests to Cyc.");

    static private final SubLString $str_alt82$Possible_values__T__NIL___IF_T__t = makeString("Possible values: T, NIL.  IF T, then API functions can access host services including the file system and outbound tcp connections.  The most secure configuration leaves this parameter NIL.");

    static private final SubLString $str_alt84$Possible_values__T__NIL___IF_T__t = makeString("Possible values: T, NIL.  IF T, then writing to the master transcript will be controlled by the Cyc Transcript Server, which will need to be installed at your site.  You only need to set this to T if you are running multiple instances of Cyc.  If NIL, then Cyc will read and write to the master transcript without regard to other processes doing the same.");

    static private final SubLString $str_alt86$Possible_values__NIL_or_a_string_ = makeString("Possible values: NIL or a string.  This parameter is only used if *USE-TRANSCRIPT-SERVER* is T.  If so, then this parameter should be set to the name of the host offering the \ncyc-serializer service.");

    public static final SubLObject setup_system_parameters_file_alt() {
        declare_defglobal($system_parameters$);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($auto_continue_transcript_problems$, T, T_OR_NIL, $str_alt54$Possible_values__NIL__T___If_NIL_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($continue_agenda_on_error$, T, T_OR_NIL, $str_alt56$Possible_values__NIL__T___If_NIL_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($suspend_sbhl_type_checkingP$, NIL, T_OR_NIL, $str_alt58$Possible_values__T__NIL___Type_ch);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($really_count_transcript_ops$, NIL, T_OR_NIL, $str_alt60$Possible_values__T__NIL___If_NIL_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($dont_record_operations_locally$, NIL, T_OR_NIL, $str_alt62$Possible_values__NIL__T___If_NIL_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($startup_communication_mode$, $DEAF, SYMBOL, $str_alt65$Possible_values_____TRANSMIT_AND_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($start_agenda_at_startupP$, T, T_OR_NIL, $str_alt67$Possible_values__T__NIL___If_NIL_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($base_tcp_port$, $int$3600, INTEGER, $str_alt70$The_base_port_offset_for_all_the_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($html_port_offset$, ZERO_INTEGER, INTEGER, $str_alt72$Possible_values__A_number___This_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($fi_port_offset$, ONE_INTEGER, INTEGER, $str_alt74$Possible_values__A_number___This_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($http_port_offset$, TWO_INTEGER, INTEGER, $str_alt76$Possible_values__A_number___This_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cfasl_port_offset$, FOURTEEN_INTEGER, INTEGER, $str_alt78$Possible_values__A_number___This_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($tcp_localhost_onlyP$, NIL, T_OR_NIL, $str_alt80$Possible_values__T__NIL___IF_NIL_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($permit_api_host_access$, T, T_OR_NIL, $str_alt82$Possible_values__T__NIL___IF_T__t);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($use_transcript_server$, NIL, T_OR_NIL, $str_alt84$Possible_values__T__NIL___IF_T__t);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($master_transcript_lock_host$, NIL, NIL_OR_STRING, $str_alt86$Possible_values__NIL_or_a_string_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($master_transcript_server_port$, $int$3608, INTEGER, $str_alt89$Possible_values__A_number___This_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cb_editing_enabledP$, T, T_OR_NIL, $str_alt91$Possible_values__T__NIL___If_NIL_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($allow_guest_to_editP$, NIL, T_OR_NIL, $str_alt93$Possible_values__T__NIL___If_NIL_);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($default_cyclist_name$, $$$Guest, STRING, $str_alt96$Possible_values__The_name_of_a_co);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($http_htdocs_directory$, $str_alt98$httpd_htdocs, STRING, $str_alt99$The_directory_under_which_documen);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($html_image_directory$, $str_alt101$_cycdoc_img_, STRING, $str_alt102$The_directory_under_which_Cyc_ima);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($html_javascript_directory$, $str_alt104$_cycdoc_js_, STRING, $str_alt105$The_directory_under_which_Javascr);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($html_css_directory$, $str_alt107$_cycdoc_css_, STRING, $str_alt105$The_directory_under_which_Javascr);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($sym108$_PERMIT_UTF_8_CHARACTER_DISPLAY_, NIL, T_OR_NIL, $str_alt109$Possible_values__T__NIL___If_T__t);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cyc_documentation_url$, $str_alt111$_cycdoc_, STRING, $str_alt112$The_URL_for_the_Cyc_system_docume);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cyc_cgi_program$, $$$cg, STRING, $str_alt115$Possible_values__A_string___The_n);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($constant_name_grep_enabled$, T, T_OR_NIL, $str_alt117$Possible_values__NIL__T___If_T__t);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cyc_grep_cgi_program$, $str_alt119$constant_name_grep, STRING, $str_alt120$Possible_values__A_string___The_n);
        com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cyc_execution_context$, $UNKNOWN, SYMBOL, $str_alt123$Possible_values__One_of_the_symbo);
        return NIL;
    }

    public static SubLObject setup_system_parameters_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($system_parameters$);
            register_system_parameter($auto_continue_transcript_problems$, T, BOOLEAN, $str51$If___FALSE____transcript_problems);
            register_system_parameter($continue_agenda_on_error$, T, BOOLEAN, $str53$If___FALSE____agenda_errors_will_);
            register_system_parameter($suspend_sbhl_type_checkingP$, NIL, BOOLEAN, $str55$Type_checking_occurs_in_SBHL_modu);
            register_system_parameter($really_count_transcript_ops$, NIL, BOOLEAN, $str57$If___FALSE____the_System_Info_pag);
            register_system_parameter($dont_record_operations_locally$, NIL, BOOLEAN, $str59$If___FALSE____a_local_transcript_);
            register_system_parameter($start_agenda_at_startupP$, T, BOOLEAN, $str61$If___FALSE____the_Cyc_agenda_is_n);
            register_system_parameter($base_tcp_port$, $int$3600, PORT, $str65$The_base_port_number_for_all_the_);
            register_system_parameter($html_port_offset$, ZERO_INTEGER, PORT_OFFSET, $str68$This_parameter_specifies_the_offs);
            register_system_parameter($fi_port_offset$, ONE_INTEGER, PORT_OFFSET, $str70$This_parameter_specifies_the_offs);
            register_system_parameter($http_port_offset$, TWO_INTEGER, PORT_OFFSET, $str72$This_parameter_specifies_the_offs);
            register_system_parameter($servlet_port_offset$, THREE_INTEGER, PORT_OFFSET, $str74$This_parameter_specifies_the_offs);
            register_system_parameter($cfasl_port_offset$, FOURTEEN_INTEGER, PORT_OFFSET, $str76$This_parameter_specifies_the_offs);
            register_system_parameter($sparql_port_offset$, FIFTEEN_INTEGER, PORT_OFFSET, $str78$This_parameter_specifies_the_offs);
            register_system_parameter($tcp_localhost_onlyP$, NIL, BOOLEAN, $str80$IF___FALSE____then_remote_TCP_cli);
            register_system_parameter($permit_api_host_access$, T, BOOLEAN, $str82$IF___TRUE____then_API_functions_c);
            register_system_parameter($use_transcript_server$, NIL, BOOLEAN, $str84$IF___TRUE____then_writing_to_the_);
            register_system_parameter($master_transcript_lock_host$, NIL, $list86, $str87$This_parameter_is_only_used_if__U);
            register_system_parameter($master_transcript_server_port$, $int$3608, INTEGER, $str91$This_parameter_is_only_used_if__U);
            register_system_parameter($cb_editing_enabledP$, T, BOOLEAN, $str93$If___FALSE____tools_for_modifying);
            register_system_parameter($cb_allow_halt_imageP$, T, BOOLEAN, $str95$If___FALSE____the__Halt_this_imag);
            register_system_parameter($allow_guest_to_editP$, NIL, BOOLEAN, $str97$If___FALSE____require_authenticat);
            register_system_parameter($default_cyclist_name$, $$$Guest, STRING, $str101$Specifies_the_name_of_the_default);
            register_system_parameter($http_htdocs_directory$, $str103$httpd_htdocs, FULL_PATH, $str105$The_directory_under_which_documen);
            register_system_parameter($html_image_directory$, $str107$_cycdoc_img_, STRING, $str108$The_directory__relative_to__HTTP_);
            register_system_parameter($html_javascript_directory$, $str110$_cycdoc_js_, STRING, $str111$The_directory__relative_to__HTTP_);
            register_system_parameter($html_css_directory$, $str113$_cycdoc_css_, STRING, $str111$The_directory__relative_to__HTTP_);
            register_system_parameter($sym114$_PERMIT_UTF_8_CHARACTER_DISPLAY_, T, BOOLEAN, $str115$If___TRUE____the_html_tools_will_);
            register_system_parameter($cyc_documentation_url$, $str117$_cycdoc_, STRING, $str118$The_directory__relative_to__HTTP_);
            register_system_parameter($cyc_cgi_program$, $$$cg, STRING, $str121$The_name_of_the_CGI_program_that_);
            register_system_parameter($constant_name_grep_enabled$, T, BOOLEAN, $str123$If___TRUE____the_HTML_browser_all);
            register_system_parameter($cyc_grep_cgi_program$, $str125$constant_name_grep, STRING, $str126$The_name_of_the_CGI_program_that_);
            register_system_parameter($cyc_execution_context$, $UNKNOWN, $list130, $str131$If_the_execution_context_is_set_t);
        }
        if (SubLFiles.USE_V2) {
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($auto_continue_transcript_problems$, T, T_OR_NIL, $str_alt54$Possible_values__NIL__T___If_NIL_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($continue_agenda_on_error$, T, T_OR_NIL, $str_alt56$Possible_values__NIL__T___If_NIL_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($suspend_sbhl_type_checkingP$, NIL, T_OR_NIL, $str_alt58$Possible_values__T__NIL___Type_ch);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($really_count_transcript_ops$, NIL, T_OR_NIL, $str_alt60$Possible_values__T__NIL___If_NIL_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($dont_record_operations_locally$, NIL, T_OR_NIL, $str_alt62$Possible_values__NIL__T___If_NIL_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($startup_communication_mode$, $DEAF, SYMBOL, $str_alt65$Possible_values_____TRANSMIT_AND_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($start_agenda_at_startupP$, T, T_OR_NIL, $str_alt67$Possible_values__T__NIL___If_NIL_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($base_tcp_port$, $int$3600, INTEGER, $str_alt70$The_base_port_offset_for_all_the_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($html_port_offset$, ZERO_INTEGER, INTEGER, $str_alt72$Possible_values__A_number___This_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($fi_port_offset$, ONE_INTEGER, INTEGER, $str_alt74$Possible_values__A_number___This_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($http_port_offset$, TWO_INTEGER, INTEGER, $str_alt76$Possible_values__A_number___This_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cfasl_port_offset$, FOURTEEN_INTEGER, INTEGER, $str_alt78$Possible_values__A_number___This_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($tcp_localhost_onlyP$, NIL, T_OR_NIL, $str_alt80$Possible_values__T__NIL___IF_NIL_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($permit_api_host_access$, T, T_OR_NIL, $str_alt82$Possible_values__T__NIL___IF_T__t);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($use_transcript_server$, NIL, T_OR_NIL, $str_alt84$Possible_values__T__NIL___IF_T__t);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($master_transcript_lock_host$, NIL, NIL_OR_STRING, $str_alt86$Possible_values__NIL_or_a_string_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($master_transcript_server_port$, $int$3608, INTEGER, $str_alt89$Possible_values__A_number___This_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cb_editing_enabledP$, T, T_OR_NIL, $str_alt91$Possible_values__T__NIL___If_NIL_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($allow_guest_to_editP$, NIL, T_OR_NIL, $str_alt93$Possible_values__T__NIL___If_NIL_);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($default_cyclist_name$, $$$Guest, STRING, $str_alt96$Possible_values__The_name_of_a_co);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($http_htdocs_directory$, $str_alt98$httpd_htdocs, STRING, $str_alt99$The_directory_under_which_documen);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($html_image_directory$, $str_alt101$_cycdoc_img_, STRING, $str_alt102$The_directory_under_which_Cyc_ima);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($html_javascript_directory$, $str_alt104$_cycdoc_js_, STRING, $str_alt105$The_directory_under_which_Javascr);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($html_css_directory$, $str_alt107$_cycdoc_css_, STRING, $str_alt105$The_directory_under_which_Javascr);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($sym108$_PERMIT_UTF_8_CHARACTER_DISPLAY_, NIL, T_OR_NIL, $str_alt109$Possible_values__T__NIL___If_T__t);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cyc_documentation_url$, $str_alt111$_cycdoc_, STRING, $str_alt112$The_URL_for_the_Cyc_system_docume);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cyc_cgi_program$, $$$cg, STRING, $str_alt115$Possible_values__A_string___The_n);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($constant_name_grep_enabled$, T, T_OR_NIL, $str_alt117$Possible_values__NIL__T___If_T__t);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cyc_grep_cgi_program$, $str_alt119$constant_name_grep, STRING, $str_alt120$Possible_values__A_string___The_n);
            com.cyc.cycjava.cycl.system_parameters.register_system_parameter($cyc_execution_context$, $UNKNOWN, SYMBOL, $str_alt123$Possible_values__One_of_the_symbo);
        }
        return NIL;
    }

    public static SubLObject setup_system_parameters_file_Previous() {
        declare_defglobal($system_parameters$);
        register_system_parameter($auto_continue_transcript_problems$, T, BOOLEAN, $str51$If___FALSE____transcript_problems);
        register_system_parameter($continue_agenda_on_error$, T, BOOLEAN, $str53$If___FALSE____agenda_errors_will_);
        register_system_parameter($suspend_sbhl_type_checkingP$, NIL, BOOLEAN, $str55$Type_checking_occurs_in_SBHL_modu);
        register_system_parameter($really_count_transcript_ops$, NIL, BOOLEAN, $str57$If___FALSE____the_System_Info_pag);
        register_system_parameter($dont_record_operations_locally$, NIL, BOOLEAN, $str59$If___FALSE____a_local_transcript_);
        register_system_parameter($start_agenda_at_startupP$, T, BOOLEAN, $str61$If___FALSE____the_Cyc_agenda_is_n);
        register_system_parameter($base_tcp_port$, $int$3600, PORT, $str65$The_base_port_number_for_all_the_);
        register_system_parameter($html_port_offset$, ZERO_INTEGER, PORT_OFFSET, $str68$This_parameter_specifies_the_offs);
        register_system_parameter($fi_port_offset$, ONE_INTEGER, PORT_OFFSET, $str70$This_parameter_specifies_the_offs);
        register_system_parameter($http_port_offset$, TWO_INTEGER, PORT_OFFSET, $str72$This_parameter_specifies_the_offs);
        register_system_parameter($servlet_port_offset$, THREE_INTEGER, PORT_OFFSET, $str74$This_parameter_specifies_the_offs);
        register_system_parameter($cfasl_port_offset$, FOURTEEN_INTEGER, PORT_OFFSET, $str76$This_parameter_specifies_the_offs);
        register_system_parameter($sparql_port_offset$, FIFTEEN_INTEGER, PORT_OFFSET, $str78$This_parameter_specifies_the_offs);
        register_system_parameter($tcp_localhost_onlyP$, NIL, BOOLEAN, $str80$IF___FALSE____then_remote_TCP_cli);
        register_system_parameter($permit_api_host_access$, T, BOOLEAN, $str82$IF___TRUE____then_API_functions_c);
        register_system_parameter($use_transcript_server$, NIL, BOOLEAN, $str84$IF___TRUE____then_writing_to_the_);
        register_system_parameter($master_transcript_lock_host$, NIL, $list86, $str87$This_parameter_is_only_used_if__U);
        register_system_parameter($master_transcript_server_port$, $int$3608, INTEGER, $str91$This_parameter_is_only_used_if__U);
        register_system_parameter($cb_editing_enabledP$, T, BOOLEAN, $str93$If___FALSE____tools_for_modifying);
        register_system_parameter($cb_allow_halt_imageP$, T, BOOLEAN, $str95$If___FALSE____the__Halt_this_imag);
        register_system_parameter($allow_guest_to_editP$, NIL, BOOLEAN, $str97$If___FALSE____require_authenticat);
        register_system_parameter($default_cyclist_name$, $$$Guest, STRING, $str101$Specifies_the_name_of_the_default);
        register_system_parameter($http_htdocs_directory$, $str103$httpd_htdocs, FULL_PATH, $str105$The_directory_under_which_documen);
        register_system_parameter($html_image_directory$, $str107$_cycdoc_img_, STRING, $str108$The_directory__relative_to__HTTP_);
        register_system_parameter($html_javascript_directory$, $str110$_cycdoc_js_, STRING, $str111$The_directory__relative_to__HTTP_);
        register_system_parameter($html_css_directory$, $str113$_cycdoc_css_, STRING, $str111$The_directory__relative_to__HTTP_);
        register_system_parameter($sym114$_PERMIT_UTF_8_CHARACTER_DISPLAY_, T, BOOLEAN, $str115$If___TRUE____the_html_tools_will_);
        register_system_parameter($cyc_documentation_url$, $str117$_cycdoc_, STRING, $str118$The_directory__relative_to__HTTP_);
        register_system_parameter($cyc_cgi_program$, $$$cg, STRING, $str121$The_name_of_the_CGI_program_that_);
        register_system_parameter($constant_name_grep_enabled$, T, BOOLEAN, $str123$If___TRUE____the_HTML_browser_all);
        register_system_parameter($cyc_grep_cgi_program$, $str125$constant_name_grep, STRING, $str126$The_name_of_the_CGI_program_that_);
        register_system_parameter($cyc_execution_context$, $UNKNOWN, $list130, $str131$If_the_execution_context_is_set_t);
        return NIL;
    }

    static private final SubLString $str_alt89$Possible_values__A_number___This_ = makeString("Possible values: A number.  This parameter is only used if\n*USE-TRANSCRIPT-SERVER* is T.  If so, then this\nparameter should be set to the port number of the cyc-serializer\nread service.");

    static private final SubLString $str_alt91$Possible_values__T__NIL___If_NIL_ = makeString("Possible values: T, NIL.  If NIL, tools for modifying the knowledge base are not accessible.");

    static private final SubLString $str_alt93$Possible_values__T__NIL___If_NIL_ = makeString("Possible values: T, NIL.  If NIL, require authentication before allowing\nmodifications to the knowledge base.  If T, any user is allowed to\nmodify the knowledge base.");

    static private final SubLString $str_alt96$Possible_values__The_name_of_a_co = makeString("Possible values: The name of a constant representing a Cyclist.  This is the\ndefault Cyclist initially logged into the system.");

    static private final SubLString $str_alt98$httpd_htdocs = makeString("httpd/htdocs");

    static private final SubLString $str_alt99$The_directory_under_which_documen = makeString("The directory under which documents served by the HTTP server are stored.");

    static private final SubLString $str_alt101$_cycdoc_img_ = makeString("/cycdoc/img/");

    static private final SubLString $str_alt102$The_directory_under_which_Cyc_ima = makeString("The directory under which Cyc images (.gif or otherwise) are stored");

    static private final SubLString $str_alt104$_cycdoc_js_ = makeString("/cycdoc/js/");

    static private final SubLString $str_alt105$The_directory_under_which_Javascr = makeString("The directory under which Javascript files used by the browser are stored");

    static private final SubLString $str_alt107$_cycdoc_css_ = makeString("/cycdoc/css/");

    static private final SubLSymbol $sym108$_PERMIT_UTF_8_CHARACTER_DISPLAY_ = makeSymbol("*PERMIT-UTF-8-CHARACTER-DISPLAY*");

    static private final SubLString $str_alt109$Possible_values__T__NIL___If_T__t = makeString("Possible values: T, NIL.  If T, the html tools will correctly display UTF-8 text\nderived from Cyc strings.");

    static private final SubLString $str_alt111$_cycdoc_ = makeString("/cycdoc/");

    static private final SubLString $str_alt112$The_URL_for_the_Cyc_system_docume = makeString("The URL for the Cyc system documentation directory.");

    static private final SubLString $str_alt115$Possible_values__A_string___The_n = makeString("Possible values: A string.  The name of the CGI program that acts as the\nintermediary between your WWW server and a Cyc processs.  Normally, the\nprogram will be called ``cg\'\'.  However, if your WWW server requires that\nCGI program names have a certain form, such as ``cg.exe\'\', then change\nthis parameter to conform.");

    @Override
    public void declareFunctions() {
        declare_system_parameters_file();
    }

    static private final SubLString $str_alt117$Possible_values__NIL__T___If_T__t = makeString("Possible values: NIL, T.  If T, the HTML browser allows users to  search for\nconstants via regular expressions.  Use of this facility requires the\nconstant-name-grep CGI program and the data file constant-shell.text to\nbe installed on your WWW server.");

    @Override
    public void initializeVariables() {
        init_system_parameters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_system_parameters_file();
    }

    static {
    }

    static private final SubLString $str_alt119$constant_name_grep = makeString("constant-name-grep");

    static private final SubLString $str_alt120$Possible_values__A_string___The_n = makeString("Possible values: A string.  The name of the CGI program that is used for\nperforming regular expression searches over constant names.  Normally, the\nprogram will be called ``constant-name-grep\'\'.  However, if your WWW server\nrequires that CGI program names have a certain form, such as \n``constant-name-grep.exe\'\', then change this parameter to conform.");

    static private final SubLString $str_alt123$Possible_values__One_of_the_symbo = makeString("Possible values: One of the symbols :CYCORP or :UNKNOWN. If the execution context\n     is set to :CYCORP, then the CYC image can assume that it is running in\n     Cycorp\'s development environment and make strong assumptions about setup\n     and infrastructure.");
}

/**
 * Total time: 282 ms
 */
