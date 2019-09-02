/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TM-CONTROL-VARS
 *  source file: /cyc/top/cycl/thesaurus/tm-control-vars.lisp
 *  created:     2019/07/03 17:38:29
 */
public final class tm_control_vars extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tm_control_vars() {
    }

    public static final SubLFile me = new tm_control_vars();


    // // Definitions
    /**
     * A representative sample of the KB constants that the Thesaurus Manager depends on.
     */
    // deflexical
    private static final SubLSymbol $thesaurus_core_constants$ = makeSymbol("*THESAURUS-CORE-CONSTANTS*");

    /**
     * Determines whether the portion of the KB necessary for the Thesaurus Manager is loaded.
     * This is the KB analogue of the #+Cyc-Thesaurus feature.
     */
    public static final SubLObject initialize_thesaurus_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $thesaurus_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_thesaurus_kb_loaded();
        } else {
            kb_control_vars.unset_thesaurus_kb_loaded();
        }
        return kb_control_vars.thesaurus_kb_loaded_p();
    }





    /**
     * Possible values: T, NIL.  If T, the interface will prompt users for a
     * password at logon time.  If NIL, no password is required.  This will be
     * ignored if *use-http-authentication* is non-NIL.
     */
    // defvar
    public static final SubLSymbol $tm_require_passwordP$ = makeSymbol("*TM-REQUIRE-PASSWORD?*");













































    /**
     * Possible values: T or NIL.  When T, the TMAP (Thesaurus Manager Access Protocol) server will be started when ./init/port-init.lisp is loaded.  When NIL, it will not be started.
     */
    // defvar
    public static final SubLSymbol $tm_start_tmap_on_startupP$ = makeSymbol("*TM-START-TMAP-ON-STARTUP?*");

    public static final SubLObject declare_tm_control_vars_file() {
        declareFunction("initialize_thesaurus_kb_feature", "INITIALIZE-THESAURUS-KB-FEATURE", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_tm_control_vars_file() {
        deflexical("*THESAURUS-CORE-CONSTANTS*", $list_alt0);
        defvar("*TM-TESTING*", $UNSET);
        defvar("*TM-DISABLE-EDITING-GLOBALLY*", $UNSET);
        defvar("*TM-REQUIRE-PASSWORD?*", $UNSET);
        defvar("*USE-HTTP-AUTHENTICATION*", $UNSET);
        defvar("*TM-BOOTSTRAP-ADMINISTRATOR-LOGIN*", $UNSET);
        defvar("*TM-BOOTSTRAP-ADMINISTRATOR-NAME*", $UNSET);
        defvar("*TM-DEFAULT-SAVE-OPERATIONS-VALUE*", $UNSET);
        defvar("*CLIENT-HOME-PAGE*", $UNSET);
        defvar("*CLIENT-LOGO*", $UNSET);
        defvar("*CLIENT-THES-HOME-PAGE*", $UNSET);
        defvar("*CLIENT-MINI-LOGO*", $UNSET);
        defvar("*CLIENT-NAME*", $UNSET);
        defvar("*SUPPORT-STRING*", $UNSET);
        defvar("*TM-CONTACTS*", $UNSET);
        defvar("*APPLICATION-NAME*", $UNSET);
        defvar("*TOOL-NAME*", $UNSET);
        defvar("*CLIENT-SPECIAL-LOGIN-INSTRUCTIONS*", $UNSET);
        defvar("*TM-EVENT-LOG-SAVE-QUANTUM*", $UNSET);
        defvar("*TM-LOAD-TRANSCRIPT-AT-STARTUP*", $UNSET);
        defvar("*TM-LOAD-THESAURUS-INIT-FILE-AT-STARTUP*", $UNSET);
        defvar("*TM-SPECIAL-PREFERENCES-DIRECTORY*", $UNSET);
        defvar("*TM-SPECIAL-LOAD-THESAURUS-DIRECTORY*", $UNSET);
        defvar("*TM-SPECIAL-OUTPUT-DIRECTORY*", $UNSET);
        defvar("*TM-DEFAULT-THESAURUS-NAME*", $UNSET);
        defvar("*TM-NUMBER-OF-INCREMENTAL-SAVES-TO-KEEP*", $UNSET);
        defvar("*TM-START-TMAP-ON-STARTUP?*", $UNSET);
        return NIL;
    }

    public static final SubLObject setup_tm_control_vars_file() {
                system_parameters.register_system_parameter($tm_testing$, NIL, T_OR_NIL, $str_alt4$Possible_values__T__NIL____If_T__);
        system_parameters.register_system_parameter($tm_disable_editing_globally$, NIL, T_OR_NIL, $str_alt7$Possible_values___T__NIL___If_NIL);
        system_parameters.register_system_parameter($sym8$_TM_REQUIRE_PASSWORD__, NIL, T_OR_NIL, $str_alt9$Possible_values__T__NIL___If_T__t);
        system_parameters.register_system_parameter($use_http_authentication$, NIL, T_OR_NIL, $str_alt11$Possile_values__T__NIL___If_T__th);
        system_parameters.register_system_parameter($tm_bootstrap_administrator_login$, NIL, NIL_OR_STRING, $str_alt14$Possible_values__NIL__or_a_string);
        system_parameters.register_system_parameter($tm_bootstrap_administrator_name$, NIL, NIL_OR_STRING, $str_alt16$Possible_values__NIL__or_a_string);
        system_parameters.register_system_parameter($tm_default_save_operations_value$, T, T_OR_NIL, $str_alt18$Possible_values__NIL__T___If_NIL_);
        system_parameters.register_system_parameter($client_home_page$, $str_alt20$http___www_cyc_com_, STRING, $str_alt22$Possible_values__A_string___Shoul);
        system_parameters.register_system_parameter($client_logo$, $str_alt24$_cycdoc_img_cyc_logo_75_gif, STRING, $str_alt25$Possible_values__A_string___It_sh);
        system_parameters.register_system_parameter($client_thes_home_page$, $str_alt20$http___www_cyc_com_, NIL_OR_STRING, $str_alt27$Possible_values__NIL__or_a_string);
        system_parameters.register_system_parameter($client_mini_logo$, $str_alt29$_cycdoc_img_cyc_logo_tiny_gif, NIL_OR_STRING, $str_alt30$Possible_values__NIL__or_a_string);
        system_parameters.register_system_parameter($client_name$, $str_alt32$Cycorp__Inc_, STRING, $str_alt33$Possible_values__A_string__giving);
        system_parameters.register_system_parameter($support_string$, $$$your_thesaurus_administrator, STRING, $str_alt36$Possible_values__A_string__such_a);
        system_parameters.register_system_parameter($tm_contacts$, $$$your_thesaurus_administrator, NONE, $str_alt39$Possible_values__If_customized__a);
        system_parameters.register_system_parameter($application_name$, $$$Cycorp_Thesaurus, STRING, $str_alt42$Possible_values__A_string__giving);
        system_parameters.register_system_parameter($tool_name$, $$$TM, STRING, $str_alt45$Possible_values__A_string__giving);
        system_parameters.register_system_parameter($client_special_login_instructions$, $str_alt47$Please_enter_your_Thesaurus_Cycli, STRING, $str_alt48$Possible_values__A_string__giving);
        system_parameters.register_system_parameter($tm_event_log_save_quantum$, $int$300, INTEGER, $str_alt52$Possible_values__An_integer___Thi);
        system_parameters.register_system_parameter($tm_load_transcript_at_startup$, NIL, T_OR_NIL, $str_alt54$Possible_values__T__NIL___If_T__t);
        system_parameters.register_system_parameter($tm_load_thesaurus_init_file_at_startup$, NIL, T_OR_NIL, $str_alt56$Possible_values__T__NIL___If_T__t);
        system_parameters.register_system_parameter($tm_special_preferences_directory$, NIL, NIL_OR_STRING, $str_alt58$Possible_values__NIL__or_a_string);
        system_parameters.register_system_parameter($tm_special_load_thesaurus_directory$, NIL, NIL_OR_STRING, $str_alt60$Possible_values__NIL__or_a_string);
        system_parameters.register_system_parameter($tm_special_output_directory$, NIL, NIL_OR_STRING, $str_alt62$Possible_values__NIL__or_a_string);
        system_parameters.register_system_parameter($tm_default_thesaurus_name$, NIL, NIL_OR_STRING, $str_alt64$Possible_values__NIL__or_a_string);
        system_parameters.register_system_parameter($tm_number_of_incremental_saves_to_keep$, TWO_INTEGER, INTEGER, $str_alt66$Possible_values__an_integer_great);
        system_parameters.register_system_parameter($sym67$_TM_START_TMAP_ON_STARTUP__, NIL, T_OR_NIL, $str_alt68$Possible_values__T_or_NIL___When_);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(constant_handles.reader_make_constant_shell(makeString("Thesaurus-Represented")), constant_handles.reader_make_constant_shell(makeString("tmBrowsableThesauri")), constant_handles.reader_make_constant_shell(makeString("tmSymbol")), constant_handles.reader_make_constant_shell(makeString("useFor")));

    static private final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    public static final SubLSymbol $tm_testing$ = makeSymbol("*TM-TESTING*");

    private static final SubLSymbol T_OR_NIL = makeSymbol("T-OR-NIL");

    static private final SubLString $str_alt4$Possible_values__T__NIL____If_T__ = makeString("Possible values: T, NIL.   If T, testing features of the thesaurus\ninterface will be enabled.  There is only one such feature at present: the\nability of Administrator users to switch among user levels, via a link on\nthe Preferences page.  If NIL, these testing features are not\navailable.");



    public static final SubLSymbol $tm_disable_editing_globally$ = makeSymbol("*TM-DISABLE-EDITING-GLOBALLY*");

    static private final SubLString $str_alt7$Possible_values___T__NIL___If_NIL = makeString("Possible values:  T, NIL.  If NIL, normal thesaurus editing is allowed.\nIf T, globally disables all editing, as for a production installation.");

    static private final SubLSymbol $sym8$_TM_REQUIRE_PASSWORD__ = makeSymbol("*TM-REQUIRE-PASSWORD?*");

    static private final SubLString $str_alt9$Possible_values__T__NIL___If_T__t = makeString("Possible values: T, NIL.  If T, the interface will prompt users for a \npassword at logon time.  If NIL, no password is required.  This will be\nignored if *use-http-authentication* is non-NIL.");

    public static final SubLSymbol $use_http_authentication$ = makeSymbol("*USE-HTTP-AUTHENTICATION*");

    static private final SubLString $str_alt11$Possile_values__T__NIL___If_T__th = makeString("Possile values: T, NIL.  If T, the TM will assume users are already \nauthenticated by an external mechanism.  In that case, the thesaurus\nadministrator needs to add new users by using the same ID the \nexternal authentication system will provide. \nIMPORTANT:  If *USE-HTTP-AUTHENTICATION* is T, you must customize the\nBootrap Administrator Name, and Bootstrap Administrator login.");

    public static final SubLSymbol $tm_bootstrap_administrator_login$ = makeSymbol("*TM-BOOTSTRAP-ADMINISTRATOR-LOGIN*");

   // private static final SubLSymbol NIL_OR_STRING = makeSymbol("NIL-OR-STRING");

    static private final SubLString $str_alt14$Possible_values__NIL__or_a_string = makeString("Possible values: NIL, or a string.  If *USE-HTTP-AUTHENTICATION* is T,\nthis must be set to a string which is the user ID for the initial \nadministrator.  It must be the same user ID the external authentication\nsystem uses.");

    public static final SubLSymbol $tm_bootstrap_administrator_name$ = makeSymbol("*TM-BOOTSTRAP-ADMINISTRATOR-NAME*");

    static private final SubLString $str_alt16$Possible_values__NIL__or_a_string = makeString("Possible values: NIL, or a string.  If *USE-HTTP-AUTHENTICATION* is T,\nthis should be set to a string which is the full name of the initial\nadministrator.");

    public static final SubLSymbol $tm_default_save_operations_value$ = makeSymbol("*TM-DEFAULT-SAVE-OPERATIONS-VALUE*");

    static private final SubLString $str_alt18$Possible_values__NIL__T___If_NIL_ = makeString("Possible values: NIL, T.  If NIL, thesaurus operations will not be saved.\nIf T, they will be saved to the transcript.");

    public static final SubLSymbol $client_home_page$ = makeSymbol("*CLIENT-HOME-PAGE*");

    static private final SubLString $str_alt20$http___www_cyc_com_ = makeString("http://www.cyc.com/");



    static private final SubLString $str_alt22$Possible_values__A_string___Shoul = makeString("Possible values: A string.  Should be the URL for the homepage link on\nthe welcome page of the interface.");

    public static final SubLSymbol $client_logo$ = makeSymbol("*CLIENT-LOGO*");

    static private final SubLString $str_alt24$_cycdoc_img_cyc_logo_75_gif = makeString("/cycdoc/img/cyc-logo-75.gif");

    static private final SubLString $str_alt25$Possible_values__A_string___It_sh = makeString("Possible values: A string.  It should be the pathname of an image file, \nexpressed as relative to the directory where your web server looks for \ndocuments (often htdocs).");

    public static final SubLSymbol $client_thes_home_page$ = makeSymbol("*CLIENT-THES-HOME-PAGE*");

    static private final SubLString $str_alt27$Possible_values__NIL__or_a_string = makeString("Possible values: NIL, or a string.  Should be the URL for the thesaurus homepage\nlink found on almost every thesaurus page.");

    public static final SubLSymbol $client_mini_logo$ = makeSymbol("*CLIENT-MINI-LOGO*");

    static private final SubLString $str_alt29$_cycdoc_img_cyc_logo_tiny_gif = makeString("/cycdoc/img/cyc-logo-tiny.gif");

    static private final SubLString $str_alt30$Possible_values__NIL__or_a_string = makeString("Possible values: NIL, or a string.  It should be the pathname of an image file, \nexpressed as relative to the directory where your web server looks for \ndocuments (often htdocs).");

    public static final SubLSymbol $client_name$ = makeSymbol("*CLIENT-NAME*");

    static private final SubLString $str_alt32$Cycorp__Inc_ = makeString("Cycorp, Inc.");

    static private final SubLString $str_alt33$Possible_values__A_string__giving = makeString("Possible values: A string, giving the name of the client organization.");

    public static final SubLSymbol $support_string$ = makeSymbol("*SUPPORT-STRING*");

    static private final SubLString $$$your_thesaurus_administrator = makeString("your thesaurus administrator");

    static private final SubLString $str_alt36$Possible_values__A_string__such_a = makeString("Possible values: A string, such as \"Joe Smith at 123-4567\" or \n\"Joe Smith at joe@com.com\", giving contact information for the person or\noffice that will be handling user support at your site.");

    public static final SubLSymbol $tm_contacts$ = makeSymbol("*TM-CONTACTS*");



    static private final SubLString $str_alt39$Possible_values__If_customized__a = makeString("Possible values: If customized, a list.  Each list element corresponds to \none contact person.  List elements should be lists containing two strings\neach -- the contact name, followed by the contact email address.  For example, \n\'((\"John Thomas\" \"john@com.com\") (\"Jane Smith\" \"jane@com.com\"))");

    public static final SubLSymbol $application_name$ = makeSymbol("*APPLICATION-NAME*");

    static private final SubLString $$$Cycorp_Thesaurus = makeString("Cycorp Thesaurus");

    static private final SubLString $str_alt42$Possible_values__A_string__giving = makeString("Possible values: A string, giving the name of the application.");

    public static final SubLSymbol $tool_name$ = makeSymbol("*TOOL-NAME*");

    static private final SubLString $$$TM = makeString("TM");

    static private final SubLString $str_alt45$Possible_values__A_string__giving = makeString("Possible values: A string, giving the name of the thesaurus manager\ntool");

    public static final SubLSymbol $client_special_login_instructions$ = makeSymbol("*CLIENT-SPECIAL-LOGIN-INSTRUCTIONS*");

    static private final SubLString $str_alt47$Please_enter_your_Thesaurus_Cycli = makeString("Please enter your Thesaurus Cyclist ID in the box below, and hit ENTER or click the\nLOGIN button.");

    static private final SubLString $str_alt48$Possible_values__A_string__giving = makeString("Possible values: A string, giving instructions to the user on the login\npage.  If *USE-HTTP-AUTHENTICATION* is turned on, this message will not\nappear.");

    public static final SubLSymbol $tm_event_log_save_quantum$ = makeSymbol("*TM-EVENT-LOG-SAVE-QUANTUM*");

    public static final SubLInteger $int$300 = makeInteger(300);



    static private final SubLString $str_alt52$Possible_values__An_integer___Thi = makeString("Possible values: An integer.  This is the number of seconds to wait\nbefore writing out information for the readable log of operations.  This\nis separate from the transcript.");

    public static final SubLSymbol $tm_load_transcript_at_startup$ = makeSymbol("*TM-LOAD-TRANSCRIPT-AT-STARTUP*");

    static private final SubLString $str_alt54$Possible_values__T__NIL___If_T__t = makeString("Possible values: T, NIL.  If T, the application loads the read transcript\ncompletely when the thesaurus init file is loaded.  (If \n*tm-load-thesaurus-init-file-at-startup* is set to T, this will be\nat startup time.)  In a C image, this means the application won\'t \nbecome available for HTML requests until it is caught up with the \ntranscript.  If NIL, the read transcript isn\'t run at thesaurus \ninit file load time, but may be processed later by the agenda if \nthat is enabled.");

    public static final SubLSymbol $tm_load_thesaurus_init_file_at_startup$ = makeSymbol("*TM-LOAD-THESAURUS-INIT-FILE-AT-STARTUP*");

    static private final SubLString $str_alt56$Possible_values__T__NIL___If_T__t = makeString("Possible values: T, NIL.  If T, the application will load the thesaurus init \nfile at startup time.  If NIL, it will wait until the first user attempts to\nconnect via a web server.  This parameter must be set to T for a \nthesaurus-only installation.  Note that it must be set to T for \n*tm-load-transcript-at-startup* to result in the transcript being \nloaded at startup.");

    public static final SubLSymbol $tm_special_preferences_directory$ = makeSymbol("*TM-SPECIAL-PREFERENCES-DIRECTORY*");

    static private final SubLString $str_alt58$Possible_values__NIL__or_a_string = makeString("Possible values: NIL, or a string which is the pathname to a special directory where \nuser preferences are kept for the thesaurus application.  If allowed to default \nto NIL, preferences will be kept in a directory relative to the directory from \nwhich Cyc is launched: ./data/thesaurus/preferences/ (as a string).  If you have\nseveral instances of Cyc running at one time, and you want them to look in the \nsame place for user preferences, set this variable to that directory.");

    public static final SubLSymbol $tm_special_load_thesaurus_directory$ = makeSymbol("*TM-SPECIAL-LOAD-THESAURUS-DIRECTORY*");

    static private final SubLString $str_alt60$Possible_values__NIL__or_a_string = makeString("Possible values: NIL, or a string which is the pathname to a special directory where\nthesaurus data files are kept.  If allowed to default to NIL, the Thesaurus Manager \nwill look in the relative directory ./data/thesaurus/load-thesaurus/ when it is asked to \nload a thesaurus.  If you have several instances of Cyc running at one time, and you \nwant them to look in a single place for thesaurus data files, set this variable to that\ndirectory.");

    public static final SubLSymbol $tm_special_output_directory$ = makeSymbol("*TM-SPECIAL-OUTPUT-DIRECTORY*");

    static private final SubLString $str_alt62$Possible_values__NIL__or_a_string = makeString("Possible values: NIL, or a string which is the pathname to a special directory\nwhere the results of Output Thesaurus commands will be written.  If allowed to \ndefault to NIL, the Thesaurus Manager will write in a directory relative to the \nplace where the program was launched (./data/thesaurus/output/) when outputting \nthesauri.");

    public static final SubLSymbol $tm_default_thesaurus_name$ = makeSymbol("*TM-DEFAULT-THESAURUS-NAME*");

    static private final SubLString $str_alt64$Possible_values__NIL__or_a_string = makeString("Possible values: NIL, or a string.  If non-NIL, should be a the name of the \ndefault thesaurus users should initially have as their viewing preference.  If NIL, \nusers will not have active thesauri set until they go to the Preferences page and \ndo so themselves.");

    public static final SubLSymbol $tm_number_of_incremental_saves_to_keep$ = makeSymbol("*TM-NUMBER-OF-INCREMENTAL-SAVES-TO-KEEP*");

    static private final SubLString $str_alt66$Possible_values__an_integer_great = makeString("Possible values: an integer greater than or equal to 2.  This tells the system how \nmany incremental binary images to keep on hand when the Thesaurus Manager saves a \nmemory snapshot.  Such saves are done, for example, at the end of a Batch Load Thesaurus \noperation and also, at the discretion of the Thesaurus Administrator, from the Utilities\npage.  When a memory snapshot is saved, if there are already this number of incremental \nsaves in the ./world/ directory, the oldest one is deleted to make room for the new one\nthat will be saved.  So, with this value set to 2, for example, there are never any more \nthan 2 incremental saves in the ./world/ directory.  Incremental saves are recognized \nonly by their filenames, so to make an incremental save immune from deletion, rename it \nto something not starting with \"inc-\".");

    static private final SubLSymbol $sym67$_TM_START_TMAP_ON_STARTUP__ = makeSymbol("*TM-START-TMAP-ON-STARTUP?*");

    static private final SubLString $str_alt68$Possible_values__T_or_NIL___When_ = makeString("Possible values: T or NIL.  When T, the TMAP (Thesaurus Manager Access Protocol) server will be started when ./init/port-init.lisp is loaded.  When NIL, it will not be started.");

    // // Initializers
    public void declareFunctions() {
        declare_tm_control_vars_file();
    }

    public void initializeVariables() {
        init_tm_control_vars_file();
    }

    public void runTopLevelForms() {
        setup_tm_control_vars_file();
    }
}

