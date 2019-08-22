package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_3;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_4;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_5;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_6;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_7;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_8;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_9;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_B;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_C;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_D;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_E;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_F;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.set;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

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


public final class system_parameters extends SubLTranslatedFile {
    public static final SubLFile me = new system_parameters();

    public static final String myName = "com.cyc.cycjava.cycl.system_parameters";

    public static final String myFingerPrint = "b30f91331706293790e42192d82e7d72b780b877dcefc67ec9e6f7e7dec9649e";







    // defvar
    /**
     * Possible values: T, NIL. Type checking occurs in SBHL modules iff this is
     * nil.
     */
    public static final SubLSymbol $suspend_sbhl_type_checkingP$ = makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*");





    // defvar
    /**
     * Possible values: T, NIL. If NIL, the Cyc agenda is not started at startup,
     * but can be enabled later by the user. If T, the agenda is enabled at startup.
     */
    public static final SubLSymbol $start_agenda_at_startupP$ = makeSymbol("*START-AGENDA-AT-STARTUP?*");























    // defvar
    /**
     * Possible values: T, NIL. If NIL, tools for modifying the knowledge base are
     * not accessible.
     */
    public static final SubLSymbol $cb_editing_enabledP$ = makeSymbol("*CB-EDITING-ENABLED?*");

    // defvar
    public static final SubLSymbol $cb_allow_halt_imageP$ = makeSymbol("*CB-ALLOW-HALT-IMAGE?*");

    // defvar
    /**
     * Possible values: T, NIL. If NIL, require authentication before allowing
     * modifications to the knowledge base. If T, any user is allowed to modify the
     * knowledge base.
     */
    public static final SubLSymbol $allow_guest_to_editP$ = makeSymbol("*ALLOW-GUEST-TO-EDIT?*");











    // defvar
    /**
     * Possible values: T, NIL. If T, the html tools will correctly display UTF-8
     * text derived from Cyc strings.
     */
    public static final SubLSymbol $permit_utf_8_character_display$ = makeSymbol("*PERMIT-UTF-8-CHARACTER-DISPLAY*");









    // deflexical
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



    public static final SubLList $list47 = list(makeSymbol("SYMBOL"), makeSymbol("VALUE"));

    private static final SubLSymbol CHECK_SYSTEM_PARAMETERS = makeSymbol("CHECK-SYSTEM-PARAMETERS");

    public static final SubLSymbol $auto_continue_transcript_problems$ = makeSymbol("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*");



    private static final SubLString $str51$If___FALSE____transcript_problems = makeString("If ::FALSE::, transcript problems will cause error breaks that \nmake the system stop. If ::TRUE::, such problems will not cause the\nthe system to stop.");

    public static final SubLSymbol $continue_agenda_on_error$ = makeSymbol("*CONTINUE-AGENDA-ON-ERROR*");

    private static final SubLString $str53$If___FALSE____agenda_errors_will_ = makeString("If ::FALSE::, agenda errors will cause the agenda process to halt.  \nIf ::TRUE::, the agenda continue automatically.");

    private static final SubLSymbol $sym54$_SUSPEND_SBHL_TYPE_CHECKING__ = makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*");

    private static final SubLString $str55$Type_checking_occurs_in_SBHL_modu = makeString("Type checking occurs in SBHL modules iff this is ::FALSE::, which\nis slower but correcter.");

    public static final SubLSymbol $really_count_transcript_ops$ = makeSymbol("*REALLY-COUNT-TRANSCRIPT-OPS*");

    private static final SubLString $str57$If___FALSE____the_System_Info_pag = makeString("If ::FALSE::, the System Info page (accessible to administrators \nonly)  will estimate, rather than actually count, the number of \noperations in the transcript.  If ::TRUE::, it will actually \ncount them, which takes longer but is accurate.");

    public static final SubLSymbol $dont_record_operations_locally$ = makeSymbol("*DONT-RECORD-OPERATIONS-LOCALLY*");

    private static final SubLString $str59$If___FALSE____a_local_transcript_ = makeString("If ::FALSE::, a local transcript will always be written when \noperations are done, even if those operations are also being written to \nthe master transcript.  If ::TRUE::, then the image does not write to a \nlocal transcript file, and will write to the master transcript when\nit is set to transmit operations.  This allows an image that is \nstandalone, and transmitting and receiving opertions, to keep only a \nsingle copy of its operations.");

    private static final SubLSymbol $sym60$_START_AGENDA_AT_STARTUP__ = makeSymbol("*START-AGENDA-AT-STARTUP?*");

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

    public static final SubLSymbol $sym79$_TCP_LOCALHOST_ONLY__ = makeSymbol("*TCP-LOCALHOST-ONLY?*");

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

    private static final SubLSymbol $sym92$_CB_EDITING_ENABLED__ = makeSymbol("*CB-EDITING-ENABLED?*");

    private static final SubLString $str93$If___FALSE____tools_for_modifying = makeString("If ::FALSE::, tools for modifying the knowledge base are not accessible.");

    private static final SubLSymbol $sym94$_CB_ALLOW_HALT_IMAGE__ = makeSymbol("*CB-ALLOW-HALT-IMAGE?*");

    private static final SubLString $str95$If___FALSE____the__Halt_this_imag = makeString("If ::FALSE::, the [Halt this image] link on the System Area page will not\nappear.");

    private static final SubLSymbol $sym96$_ALLOW_GUEST_TO_EDIT__ = makeSymbol("*ALLOW-GUEST-TO-EDIT?*");

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

    public static SubLObject all_system_parameters() {
        return Mapping.mapcar(symbol_function(FIRST), $system_parameters$.getGlobalValue());
    }

    public static SubLObject register_system_parameter(final SubLObject name, final SubLObject v_default, final SubLObject type, final SubLObject description) {
        if (NIL == system_parameter_types.valid_system_parameter_typeP(type)) {
            Errors.warn($str2$_S__S_has_an_unknown_type__S_, DEFINE_SYSTEM_PARAMETER, name, type);
        }
        remove_system_parameter(name);
        $system_parameters$.setGlobalValue(cons(list(name, v_default, type, description), $system_parameters$.getGlobalValue()));
        return name;
    }

    public static SubLObject remove_system_parameter(final SubLObject name) {
        assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
        $system_parameters$.setGlobalValue(delete(name, $system_parameters$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject all_system_parameter_definitions() {
        return reverse($system_parameters$.getGlobalValue());
    }

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

    public static SubLObject system_parameter_value_unset_p(final SubLObject value) {
        return eq(value, $UNSET);
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

    public static SubLObject cyc_documentation_url() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cyc_documentation_url$.getDynamicValue(thread);
    }

    public static SubLObject declare_system_parameters_file() {
        declareFunction(me, "all_system_parameters", "ALL-SYSTEM-PARAMETERS", 0, 0, false);
        declareFunction(me, "register_system_parameter", "REGISTER-SYSTEM-PARAMETER", 4, 0, false);
        declareFunction(me, "remove_system_parameter", "REMOVE-SYSTEM-PARAMETER", 1, 0, false);
        declareFunction(me, "all_system_parameter_definitions", "ALL-SYSTEM-PARAMETER-DEFINITIONS", 0, 0, false);
        declareMacro(me, "define_system_parameter", "DEFINE-SYSTEM-PARAMETER");
        declareFunction(me, "system_parameter_value_unset_p", "SYSTEM-PARAMETER-VALUE-UNSET-P", 1, 0, false);
        declareFunction(me, "check_system_parameters", "CHECK-SYSTEM-PARAMETERS", 0, 0, false);
        declareFunction(me, "alphanumericize_string", "ALPHANUMERICIZE-STRING", 1, 0, false);
        declareFunction(me, "get_parameter_description_lines", "GET-PARAMETER-DESCRIPTION-LINES", 2, 1, false);
        declareFunction(me, "localize_boolean_description_lines", "LOCALIZE-BOOLEAN-DESCRIPTION-LINES", 2, 1, false);
        declareFunction(me, "setup_system_parameters", "SETUP-SYSTEM-PARAMETERS", 1, 1, false);
        declareFunction(me, "load_system_parameters", "LOAD-SYSTEM-PARAMETERS", 0, 0, false);
        declareFunction(me, "read_parameter_form", "READ-PARAMETER-FORM", 1, 0, false);
        declareFunction(me, "evaluate_parameter_form", "EVALUATE-PARAMETER-FORM", 1, 0, false);
        declareFunction(me, "evaluate_parameter_value", "EVALUATE-PARAMETER-VALUE", 1, 0, false);
        declareFunction(me, "cyc_documentation_url", "CYC-DOCUMENTATION-URL", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_system_parameters_file() {
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

    public static SubLObject setup_system_parameters_file() {
        declare_defglobal($system_parameters$);
        register_system_parameter($auto_continue_transcript_problems$, T, BOOLEAN, $str51$If___FALSE____transcript_problems);
        register_system_parameter($continue_agenda_on_error$, T, BOOLEAN, $str53$If___FALSE____agenda_errors_will_);
        register_system_parameter($sym54$_SUSPEND_SBHL_TYPE_CHECKING__, NIL, BOOLEAN, $str55$Type_checking_occurs_in_SBHL_modu);
        register_system_parameter($really_count_transcript_ops$, NIL, BOOLEAN, $str57$If___FALSE____the_System_Info_pag);
        register_system_parameter($dont_record_operations_locally$, NIL, BOOLEAN, $str59$If___FALSE____a_local_transcript_);
        register_system_parameter($sym60$_START_AGENDA_AT_STARTUP__, T, BOOLEAN, $str61$If___FALSE____the_Cyc_agenda_is_n);
        register_system_parameter($base_tcp_port$, $int$3600, PORT, $str65$The_base_port_number_for_all_the_);
        register_system_parameter($html_port_offset$, ZERO_INTEGER, PORT_OFFSET, $str68$This_parameter_specifies_the_offs);
        register_system_parameter($fi_port_offset$, ONE_INTEGER, PORT_OFFSET, $str70$This_parameter_specifies_the_offs);
        register_system_parameter($http_port_offset$, TWO_INTEGER, PORT_OFFSET, $str72$This_parameter_specifies_the_offs);
        register_system_parameter($servlet_port_offset$, THREE_INTEGER, PORT_OFFSET, $str74$This_parameter_specifies_the_offs);
        register_system_parameter($cfasl_port_offset$, FOURTEEN_INTEGER, PORT_OFFSET, $str76$This_parameter_specifies_the_offs);
        register_system_parameter($sparql_port_offset$, FIFTEEN_INTEGER, PORT_OFFSET, $str78$This_parameter_specifies_the_offs);
        register_system_parameter($sym79$_TCP_LOCALHOST_ONLY__, NIL, BOOLEAN, $str80$IF___FALSE____then_remote_TCP_cli);
        register_system_parameter($permit_api_host_access$, T, BOOLEAN, $str82$IF___TRUE____then_API_functions_c);
        register_system_parameter($use_transcript_server$, NIL, BOOLEAN, $str84$IF___TRUE____then_writing_to_the_);
        register_system_parameter($master_transcript_lock_host$, NIL, $list86, $str87$This_parameter_is_only_used_if__U);
        register_system_parameter($master_transcript_server_port$, $int$3608, INTEGER, $str91$This_parameter_is_only_used_if__U);
        register_system_parameter($sym92$_CB_EDITING_ENABLED__, T, BOOLEAN, $str93$If___FALSE____tools_for_modifying);
        register_system_parameter($sym94$_CB_ALLOW_HALT_IMAGE__, T, BOOLEAN, $str95$If___FALSE____the__Halt_this_imag);
        register_system_parameter($sym96$_ALLOW_GUEST_TO_EDIT__, NIL, BOOLEAN, $str97$If___FALSE____require_authenticat);
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

    @Override
    public void declareFunctions() {
        declare_system_parameters_file();
    }

    @Override
    public void initializeVariables() {
        init_system_parameters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_system_parameters_file();
    }

    
}

/**
 * Total time: 282 ms
 */
