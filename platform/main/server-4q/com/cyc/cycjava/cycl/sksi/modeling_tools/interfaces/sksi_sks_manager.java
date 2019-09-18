package com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_image_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_preference_module_generation;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_sks_manager extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_sks_manager();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager";

    public static final String myFingerPrint = "69721c14ce0d3b768fcd0cec8d7326ee5aa24770017589ef8f08c3b3f4a99b5d";

    // defparameter
    private static final SubLSymbol $sksi_sks_manager_storage_module_support_enabledP$ = makeSymbol("*SKSI-SKS-MANAGER-STORAGE-MODULE-SUPPORT-ENABLED?*");

    // defparameter
    private static final SubLSymbol $sksi_sks_manager_check_sks_status_enabledP$ = makeSymbol("*SKSI-SKS-MANAGER-CHECK-SKS-STATUS-ENABLED?*");











    // defparameter
    private static final SubLSymbol $url_expand_image$ = makeSymbol("*URL-EXPAND-IMAGE*");

    // defparameter
    private static final SubLSymbol $url_contract_image$ = makeSymbol("*URL-CONTRACT-IMAGE*");

    // defparameter
    private static final SubLSymbol $url_blank_image$ = makeSymbol("*URL-BLANK-IMAGE*");

    // Internal Constants
    public static final SubLString $str0$SKSI_Structured_Knowledge_Source_ = makeString("SKSI Structured Knowledge Source Manager");

    public static final SubLSymbol SKSI_SKS_MANAGER = makeSymbol("SKSI-SKS-MANAGER");



    private static final SubLString $str3$_SKSI_SKS_Manager_ = makeString("[SKSI SKS Manager]");



    private static final SubLString $str5$sksi_sks_manager = makeString("sksi-sks-manager");

    private static final SubLSymbol $SKSI_SKS_MANAGER = makeKeyword("SKSI-SKS-MANAGER");

    private static final SubLSymbol CB_LINK_SKSI_SKS_MANAGER = makeSymbol("CB-LINK-SKSI-SKS-MANAGER");

    private static final SubLString $$$SKS_Manager = makeString("SKS Manager");

    private static final SubLString $$$SKSMan = makeString("SKSMan");

    private static final SubLString $$$SKSI_SKS_Manager = makeString("SKSI SKS Manager");

    private static final SubLSymbol $sksi_removal_modules_registered_knowledge_sources$ = makeSymbol("*SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES*");

    private static final SubLSymbol SKS_REGISTERED_P = makeSymbol("SKS-REGISTERED-P");

    private static final SubLList $list13 = list(makeSymbol("SKS-REMOVAL-MODULES-REGISTERED-P"));

    private static final SubLSymbol $sksi_content_mts_with_registered_removal_module$ = makeSymbol("*SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE*");

    private static final SubLSymbol SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE = makeSymbol("SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE");

    private static final SubLList $list16 = list(makeSymbol("SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE"));

    private static final SubLSymbol CLEAR_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE = makeSymbol("CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE");

    private static final SubLList $list18 = list(makeSymbol("CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE"));

    private static final SubLSymbol ADD_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE_FOR_SKS = makeSymbol("ADD-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE-FOR-SKS");

    private static final SubLList $list20 = list(makeSymbol("ADD-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE-FOR-SKS"));

    private static final SubLSymbol REMOVE_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE_FOR_SKS = makeSymbol("REMOVE-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE-FOR-SKS");

    private static final SubLList $list22 = list(makeSymbol("REMOVE-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE-FOR-SKS"));

    private static final SubLSymbol $sksi_storage_modules_registered_knowledge_sources$ = makeSymbol("*SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES*");

    private static final SubLSymbol $sksi_content_mts_with_registered_storage_module$ = makeSymbol("*SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE*");

    private static final SubLSymbol SKSI_REGISTERED_KNOWLEDGE_SOURCES_ADD = makeSymbol("SKSI-REGISTERED-KNOWLEDGE-SOURCES-ADD");

    private static final SubLList $list26 = list(makeSymbol("SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES-ADD"));

    private static final SubLSymbol SKSI_REGISTERED_KNOWLEDGE_SOURCES_REMOVE_PARTIAL = makeSymbol("SKSI-REGISTERED-KNOWLEDGE-SOURCES-REMOVE-PARTIAL");

    private static final SubLList $list28 = list(makeSymbol("SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES-REMOVE-PARTIAL"));

    private static final SubLSymbol $sksi_expanded_knowledge_sources$ = makeSymbol("*SKSI-EXPANDED-KNOWLEDGE-SOURCES*");

    private static final SubLSymbol $sym30$TERM___WITH_CONSTANT_BY_NAME = makeSymbol("TERM-<-WITH-CONSTANT-BY-NAME");



    private static final SubLString $str32$right_triangle_blue_gif = makeString("right-triangle-blue.gif");



    private static final SubLString $str34$down_triangle_blue_gif = makeString("down-triangle-blue.gif");



    private static final SubLString $str36$blank_gif = makeString("blank.gif");

    private static final SubLString $str37$_cycdoc_img_cb_right_triangle_blu = makeString("/cycdoc/img/cb/right-triangle-blue.gif");

    private static final SubLString $str38$_cycdoc_img_cb_down_triangle_blue = makeString("/cycdoc/img/cb/down-triangle-blue.gif");

    private static final SubLString $str39$_cycdoc_img_cb_blank_gif = makeString("/cycdoc/img/cb/blank.gif");

    private static final SubLString $str40$Structured_Knowledge_Source_Manag = makeString("Structured Knowledge Source Manager");

    private static final SubLString $str41$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str42$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str47$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str53$sksi_sks_manager_input = makeString("sksi-sks-manager-input");

    private static final SubLString $str54$_444444 = makeString("#444444");

    private static final SubLString $str55$_ffffff = makeString("#ffffff");





    private static final SubLString $$$REMOVAL = makeString("REMOVAL");

    private static final SubLString $$$MODULES = makeString("MODULES");

    private static final SubLString $$$STORAGE = makeString("STORAGE");

    private static final SubLString $str61$Up_ = makeString("Up?");

    private static final SubLList $list62 = list(new SubLObject[]{ makeString("Name"), makeString("Type"), makeString("Up?"), makeString("Status"), makeString("Register"), makeString("Dereg."), makeString(""), makeString("Status"), makeString("Register"), makeString("Dereg.") });

    private static final SubLList $list63 = list(makeString("Name"), makeString("Type"), makeString("Up?"), makeString("Status"), makeString("Register"), makeString("Dereg."));

    private static final SubLString $$$Enter = makeString("Enter");

    private static final SubLString $$$enter = makeString("enter");

    private static final SubLString $str66$_dddddd = makeString("#dddddd");

    private static final SubLString $str67$_cccccc = makeString("#cccccc");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str70$BROKEN_ = makeString("BROKEN!");

    private static final SubLFloat $float$0_2 = makeDouble(0.2);



    private static final SubLSymbol VALID_SKSI_ERROR_HANDLING_MODE_P = makeSymbol("VALID-SKSI-ERROR-HANDLING-MODE-P");

    private static final SubLString $$$Up = makeString("Up");

    private static final SubLString $$$Down = makeString("Down");



    private static final SubLString $$$Some_registered = makeString("Some registered");

    private static final SubLString $str78$_DDDDFF = makeString("#DDDDFF");



    private static final SubLString $str80$All_registered_br__span_style__fo = makeString("All registered<br><span style='font-size:80%'>(");

    private static final SubLString $str81$_modules___span_ = makeString(" modules)</span>");

    private static final SubLString $str82$_AAAAFF = makeString("#AAAAFF");



    private static final SubLString $str84$ = makeString("");

    private static final SubLString $$$All_registered = makeString("All registered");

    private static final SubLString $str86$All_br__span_style__font_size_80_ = makeString("All<br><span style='font-size:80%'>(");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str89$expansion_ = makeString("expansion-");

    private static final SubLObject $$Database_Physical = reader_make_constant_shell(makeString("Database-Physical"));

    private static final SubLString $str91$DB_ = makeString("DB:");

    private static final SubLString $$$postgresql = makeString("postgresql");

    private static final SubLString $$$psql = makeString("psql");

    private static final SubLString $$$poisedata = makeString("poisedata");

    private static final SubLString $$$POISE = makeString("POISE");

    private static final SubLObject $$RDFTripleStore_Physical = reader_make_constant_shell(makeString("RDFTripleStore-Physical"));

    private static final SubLString $$$RDF = makeString("RDF");

    private static final SubLObject $$WebPage_AIS = reader_make_constant_shell(makeString("WebPage-AIS"));

    private static final SubLString $$$HTTP = makeString("HTTP");

    private static final SubLString $str100$register_removal_ = makeString("register-removal-");

    private static final SubLString $str101$deregister_removal_ = makeString("deregister-removal-");

    private static final SubLString $$$gray = makeString("gray");

    private static final SubLString $str103$register_storage_ = makeString("register-storage-");

    private static final SubLString $str104$deregister_storage_ = makeString("deregister-storage-");

    private static final SubLString $str105$_eeeeee = makeString("#eeeeee");



    private static final SubLString $$$All = makeString("All");

    private static final SubLString $str108$register_removal_all = makeString("register-removal-all");

    private static final SubLString $str109$deregister_removal_all = makeString("deregister-removal-all");

    private static final SubLString $str110$register_storage_all = makeString("register-storage-all");

    private static final SubLString $str111$deregister_storage_all = makeString("deregister-storage-all");

    private static final SubLString $str112$_x = makeString(".x");

    private static final SubLString $str113$_y = makeString(".y");

    private static final SubLString $$$on = makeString("on");

    private static final SubLString $$$all = makeString("all");

    private static final SubLString $str116$_A_new_SKSI_removal_modules_have_ = makeString("~A new SKSI removal modules have been (re)registered with your Cyc image.");

    private static final SubLString $str117$_A_new_SKSI_preference_modules_ha = makeString("~A new SKSI preference modules have been (re)registered with your Cyc image.");

    private static final SubLString $str118$_A_SKSI_removal_modules_have_been = makeString("~A SKSI removal modules have been deregistered with your Cyc image.");

    private static final SubLString $str119$_A_SKSI_preference_modules_have_b = makeString("~A SKSI preference modules have been deregistered with your Cyc image.");

    private static final SubLString $str120$_A_new_SKSI_storage_modules_have_ = makeString("~A new SKSI storage modules have been (re)registered with your Cyc image.");

    private static final SubLString $str121$_A_SKSI_storage_modules_have_been = makeString("~A SKSI storage modules have been deregistered with your Cyc image.");

    private static final SubLString $str122$Currently__you_have__A_SKSI_remov = makeString("Currently, you have ~A SKSI removal modules and ~A SKSI preference modules registered with your image.");

    private static final SubLString $str123$There_are_also__A_SKSI_HL_storage = makeString("There are also ~A SKSI HL storage modules registered.");

    private static final SubLSymbol SKSI_SKS_MANAGER_INPUT = makeSymbol("SKSI-SKS-MANAGER-INPUT");

    private static final SubLSymbol $sym125$SK_SOURCE_REGISTERED_ = makeSymbol("SK-SOURCE-REGISTERED?");

    private static final SubLSymbol SKS_REGISTRATION_STATE = makeSymbol("SKS-REGISTRATION-STATE");

    private static final SubLList $list127 = list(makeSymbol("SKS-REMOVAL-MODULES-REGISTRATION-STATE"));

    private static final SubLString $str128$registering_knowledge_sources_ = makeString("registering knowledge sources.");

    private static final SubLString $str129$cb_sks_register_applied_to_non_kn = makeString("cb-sks-register applied to non-knowledge-source");

    private static final SubLSymbol CB_SKS_REGISTER = makeSymbol("CB-SKS-REGISTER");

    private static final SubLString $str131$cb_sks_register__A = makeString("cb-sks-register&~A");

    private static final SubLString $str132$_Register_KS_ = makeString("[Register KS]");



    private static final SubLSymbol CB_LINK_SKSI_REGISTER = makeSymbol("CB-LINK-SKSI-REGISTER");

    private static final SubLString $str135$deregistering_knowledge_sources_ = makeString("deregistering knowledge sources.");

    private static final SubLString $str136$cb_register_applied_to_non_knowle = makeString("cb-register applied to non-knowledge-source");

    private static final SubLSymbol CB_SKS_DEREGISTER = makeSymbol("CB-SKS-DEREGISTER");

    private static final SubLString $str138$cb_sks_deregister__A = makeString("cb-sks-deregister&~A");

    private static final SubLString $str139$_Deregister_KS_ = makeString("[Deregister KS]");



    private static final SubLSymbol CB_LINK_SKSI_DEREGISTER = makeSymbol("CB-LINK-SKSI-DEREGISTER");

    private static final SubLSymbol SK_SOURCE_P = makeSymbol("SK-SOURCE-P");

    private static final SubLSymbol SK_SOURCE_PROPER_SUB_KS_CLOSURE_IN_MAPPING_MT = makeSymbol("SK-SOURCE-PROPER-SUB-KS-CLOSURE-IN-MAPPING-MT");

    private static final SubLList $list144 = list(list(makeSymbol("TOP-LEVELS-VAR"), makeSymbol("STRAGGLERS-VAR")), makeSymbol("STATE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol SKS_REGISTRATION_STATE_P = makeSymbol("SKS-REGISTRATION-STATE-P");

    private static final SubLList $list147 = list(makeSymbol("CURRENT-TOP-LEVELS"), makeSymbol("CURRENT-STRAGGLERS"));

    private static final SubLList $list148 = list(makeSymbol("STATE-TOP-LEVELS"), makeSymbol("STATE-STRAGGLERS"));

    private static final SubLList $list149 = list(NIL, NIL);

    public static SubLObject sksi_sks_manager(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str0$SKSI_Structured_Knowledge_Source_);
        } else {
            sksi_sks_manager_internal(args);
        }
        return NIL;
    }

    public static SubLObject cb_link_sksi_sks_manager(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str3$_SKSI_SKS_Manager_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str5$sksi_sks_manager);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject sks_get_sub_skses(final SubLObject sks) {
        return sksi_kb_accessors.sk_source_immediate_spec_sk_sources(sks, sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED));
    }

    public static SubLObject sks_depth(final SubLObject sks, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        final SubLObject superks = sksi_sks_accessors.sks_get_super_sks(sks);
        if (NIL != superks) {
            return sks_depth(superks, add(ONE_INTEGER, depth));
        }
        return depth;
    }

    public static SubLObject clear_sksi_registered_knowledge_sources() {
        clear_sksi_removal_modules_registered_knowledge_sources();
        clear_sksi_storage_modules_registered_knowledge_sources();
        return NIL;
    }

    public static SubLObject sksi_registered_knowledge_sources() {
        return list_utilities.fast_delete_duplicates(append(sksi_removal_modules_registered_knowledge_sources(), sksi_storage_modules_registered_knowledge_sources()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_removal_modules_registered_knowledge_sources() {
        return $sksi_removal_modules_registered_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject clear_sksi_removal_modules_registered_knowledge_sources() {
        $sksi_removal_modules_registered_knowledge_sources$.setGlobalValue(NIL);
        return $sksi_removal_modules_registered_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject sks_registered_p(final SubLObject sks) {
        return sks_removal_modules_registered_p(sks);
    }

    public static SubLObject sks_removal_modules_registered_p(final SubLObject sks) {
        return subl_promotions.memberP(sks, sksi_removal_modules_registered_knowledge_sources(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject sksi_content_mts_with_registered_module() {
        return sksi_content_mts_with_registered_removal_module();
    }

    public static SubLObject sksi_content_mts_with_registered_removal_module() {
        return $sksi_content_mts_with_registered_removal_module$.getGlobalValue();
    }

    public static SubLObject clear_sksi_content_mts_with_registered_module() {
        return clear_sksi_content_mts_with_registered_removal_module();
    }

    public static SubLObject clear_sksi_content_mts_with_registered_removal_module() {
        $sksi_content_mts_with_registered_removal_module$.setGlobalValue(NIL);
        return $sksi_content_mts_with_registered_removal_module$.getGlobalValue();
    }

    public static SubLObject add_sksi_content_mts_with_registered_module_for_sks(final SubLObject sks) {
        return add_sksi_content_mts_with_registered_removal_module_for_sks(sks);
    }

    public static SubLObject add_sksi_content_mts_with_registered_removal_module_for_sks(final SubLObject sks) {
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
        $sksi_content_mts_with_registered_removal_module$.setGlobalValue(cons(content_mt, $sksi_content_mts_with_registered_removal_module$.getGlobalValue()));
        return content_mt;
    }

    public static SubLObject remove_sksi_content_mts_with_registered_module_for_sks(final SubLObject sks) {
        return remove_sksi_content_mts_with_registered_removal_module_for_sks(sks);
    }

    public static SubLObject remove_sksi_content_mts_with_registered_removal_module_for_sks(final SubLObject sks) {
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
        $sksi_content_mts_with_registered_removal_module$.setGlobalValue(list_utilities.remove_first(content_mt, $sksi_content_mts_with_registered_removal_module$.getGlobalValue(), symbol_function(EQUAL)));
        return content_mt;
    }

    public static SubLObject sksi_storage_modules_registered_knowledge_sources() {
        return $sksi_storage_modules_registered_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject clear_sksi_storage_modules_registered_knowledge_sources() {
        $sksi_storage_modules_registered_knowledge_sources$.setGlobalValue(NIL);
        return $sksi_storage_modules_registered_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject sks_storage_modules_registered_p(final SubLObject sks) {
        return subl_promotions.memberP(sks, sksi_storage_modules_registered_knowledge_sources(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject sksi_content_mts_with_registered_storage_module() {
        return $sksi_content_mts_with_registered_storage_module$.getGlobalValue();
    }

    public static SubLObject clear_sksi_content_mts_with_registered_storage_module() {
        $sksi_content_mts_with_registered_storage_module$.setGlobalValue(NIL);
        return $sksi_content_mts_with_registered_storage_module$.getGlobalValue();
    }

    public static SubLObject add_sksi_content_mts_with_registered_storage_module_for_sks(final SubLObject sks) {
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
        $sksi_content_mts_with_registered_storage_module$.setGlobalValue(cons(content_mt, $sksi_content_mts_with_registered_storage_module$.getGlobalValue()));
        return content_mt;
    }

    public static SubLObject remove_sksi_content_mts_with_registered_storage_module_for_sks(final SubLObject sks) {
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
        $sksi_content_mts_with_registered_storage_module$.setGlobalValue(list_utilities.remove_first(content_mt, $sksi_content_mts_with_registered_storage_module$.getGlobalValue(), symbol_function(EQUAL)));
        return content_mt;
    }

    public static SubLObject sksi_registered_knowledge_sources_add(final SubLObject sks) {
        return sksi_removal_modules_registered_knowledge_sources_add(sks);
    }

    public static SubLObject sksi_removal_modules_registered_knowledge_sources_add(final SubLObject sks) {
        if (NIL == sks_removal_modules_registered_p(sks)) {
            final SubLObject subs = sks_get_sub_skses(sks);
            final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
            final SubLObject siblings = (NIL != v_super) ? sks_get_sub_skses(v_super) : NIL;
            if (NIL == member(sks, $sksi_removal_modules_registered_knowledge_sources$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $sksi_removal_modules_registered_knowledge_sources$.setGlobalValue(cons(sks, $sksi_removal_modules_registered_knowledge_sources$.getGlobalValue()));
            }
            $sksi_removal_modules_registered_knowledge_sources$.setGlobalValue(sksi_infrastructure_utilities.sort_knowledge_sources($sksi_removal_modules_registered_knowledge_sources$.getGlobalValue()));
            add_sksi_content_mts_with_registered_removal_module_for_sks(sks);
            if (NIL != subs) {
                SubLObject cdolist_list_var = subs;
                SubLObject sub = NIL;
                sub = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sksi_removal_modules_registered_knowledge_sources_add(sub);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub = cdolist_list_var.first();
                } 
            }
            if (((NIL != v_super) && (NIL != subsetp(siblings, $sksi_removal_modules_registered_knowledge_sources$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) && (NIL == sks_removal_modules_registered_p(v_super))) {
                sksi_removal_modules_registered_knowledge_sources_add(v_super);
            }
        }
        return $sksi_removal_modules_registered_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject sksi_registered_knowledge_sources_remove_partial(final SubLObject sks) {
        return sksi_removal_modules_registered_knowledge_sources_remove_partial(sks);
    }

    public static SubLObject sksi_removal_modules_registered_knowledge_sources_remove_partial(final SubLObject sks) {
        if (NIL != sks_removal_modules_registered_p(sks)) {
            final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
            $sksi_removal_modules_registered_knowledge_sources$.setGlobalValue(remove(sks, $sksi_removal_modules_registered_knowledge_sources$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            remove_sksi_content_mts_with_registered_removal_module_for_sks(sks);
            if (NIL != v_super) {
                sksi_removal_modules_registered_knowledge_sources_remove_partial(v_super);
            }
        }
        return $sksi_removal_modules_registered_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject sksi_removal_modules_registered_knowledge_sources_remove(final SubLObject sks) {
        final SubLObject subs = sks_get_sub_skses(sks);
        final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
        $sksi_removal_modules_registered_knowledge_sources$.setGlobalValue(remove(sks, $sksi_removal_modules_registered_knowledge_sources$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        remove_sksi_content_mts_with_registered_removal_module_for_sks(sks);
        if (NIL != subs) {
            SubLObject cdolist_list_var = subs;
            SubLObject sub = NIL;
            sub = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sksi_removal_modules_registered_knowledge_sources_remove(sub);
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            } 
        }
        if (NIL != v_super) {
            sksi_removal_modules_registered_knowledge_sources_remove_partial(v_super);
        }
        return $sksi_removal_modules_registered_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject removal_modules_registered_sub_skses(final SubLObject sks) {
        SubLObject removal_modules_registered_subs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject sub_skses = cdolist_list_var = sks_get_sub_skses(sks);
        SubLObject sub = NIL;
        sub = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sks_removal_modules_registered_p(sub)) {
                final SubLObject item_var = sub;
                if (NIL == member(item_var, removal_modules_registered_subs, symbol_function(EQL), symbol_function(IDENTITY))) {
                    removal_modules_registered_subs = cons(item_var, removal_modules_registered_subs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub = cdolist_list_var.first();
        } 
        return removal_modules_registered_subs;
    }

    public static SubLObject any_sub_ks_removal_modules_registeredP(final SubLObject sks) {
        final SubLObject sub_skses = sks_get_sub_skses(sks);
        SubLObject removal_modules_registeredP = NIL;
        if (NIL == removal_modules_registeredP) {
            SubLObject csome_list_var = sub_skses;
            SubLObject sub = NIL;
            sub = csome_list_var.first();
            while ((NIL == removal_modules_registeredP) && (NIL != csome_list_var)) {
                if (NIL != sks_removal_modules_registered_p(sub)) {
                    removal_modules_registeredP = T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            } 
        }
        return removal_modules_registeredP;
    }

    public static SubLObject any_closure_sub_ks_removal_modules_registeredP(final SubLObject sks) {
        final SubLObject sub_skses = sksi_kb_accessors.sk_source_proper_sub_ks_closure_in_mapping_mt(sks);
        SubLObject removal_modules_registeredP = NIL;
        if (NIL == removal_modules_registeredP) {
            SubLObject csome_list_var = sub_skses;
            SubLObject sub = NIL;
            sub = csome_list_var.first();
            while ((NIL == removal_modules_registeredP) && (NIL != csome_list_var)) {
                if (NIL != sks_removal_modules_registered_p(sub)) {
                    removal_modules_registeredP = T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            } 
        }
        return removal_modules_registeredP;
    }

    public static SubLObject sksi_storage_modules_registered_knowledge_sources_add(final SubLObject sks) {
        if (NIL == sks_storage_modules_registered_p(sks)) {
            final SubLObject subs = sks_get_sub_skses(sks);
            final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
            final SubLObject siblings = (NIL != v_super) ? sks_get_sub_skses(v_super) : NIL;
            if (NIL == member(sks, $sksi_storage_modules_registered_knowledge_sources$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $sksi_storage_modules_registered_knowledge_sources$.setGlobalValue(cons(sks, $sksi_storage_modules_registered_knowledge_sources$.getGlobalValue()));
            }
            $sksi_storage_modules_registered_knowledge_sources$.setGlobalValue(sksi_infrastructure_utilities.sort_knowledge_sources($sksi_storage_modules_registered_knowledge_sources$.getGlobalValue()));
            add_sksi_content_mts_with_registered_removal_module_for_sks(sks);
            if (NIL != subs) {
                SubLObject cdolist_list_var = subs;
                SubLObject sub = NIL;
                sub = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sksi_storage_modules_registered_knowledge_sources_add(sub);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub = cdolist_list_var.first();
                } 
            }
            if (((NIL != v_super) && (NIL != subsetp(siblings, $sksi_storage_modules_registered_knowledge_sources$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) && (NIL == sks_storage_modules_registered_p(v_super))) {
                sksi_storage_modules_registered_knowledge_sources_add(v_super);
            }
        }
        return $sksi_storage_modules_registered_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject sksi_storage_modules_registered_knowledge_sources_remove_partial(final SubLObject sks) {
        if (NIL != sks_storage_modules_registered_p(sks)) {
            final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
            $sksi_storage_modules_registered_knowledge_sources$.setGlobalValue(remove(sks, $sksi_storage_modules_registered_knowledge_sources$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            remove_sksi_content_mts_with_registered_storage_module_for_sks(sks);
            if (NIL != v_super) {
                sksi_storage_modules_registered_knowledge_sources_remove_partial(v_super);
            }
        }
        return $sksi_storage_modules_registered_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject sksi_storage_modules_registered_knowledge_sources_remove(final SubLObject sks) {
        final SubLObject subs = sks_get_sub_skses(sks);
        final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
        $sksi_storage_modules_registered_knowledge_sources$.setGlobalValue(remove(sks, $sksi_storage_modules_registered_knowledge_sources$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        remove_sksi_content_mts_with_registered_storage_module_for_sks(sks);
        if (NIL != subs) {
            SubLObject cdolist_list_var = subs;
            SubLObject sub = NIL;
            sub = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sksi_storage_modules_registered_knowledge_sources_remove(sub);
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            } 
        }
        if (NIL != v_super) {
            sksi_storage_modules_registered_knowledge_sources_remove_partial(v_super);
        }
        return $sksi_storage_modules_registered_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject storage_modules_registered_sub_skses(final SubLObject sks) {
        SubLObject storage_modules_registered_subs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject sub_skses = cdolist_list_var = sks_get_sub_skses(sks);
        SubLObject sub = NIL;
        sub = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sks_storage_modules_registered_p(sub)) {
                final SubLObject item_var = sub;
                if (NIL == member(item_var, storage_modules_registered_subs, symbol_function(EQL), symbol_function(IDENTITY))) {
                    storage_modules_registered_subs = cons(item_var, storage_modules_registered_subs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub = cdolist_list_var.first();
        } 
        return storage_modules_registered_subs;
    }

    public static SubLObject any_sub_ks_storage_modules_registeredP(final SubLObject sks) {
        final SubLObject sub_skses = sks_get_sub_skses(sks);
        SubLObject storage_modules_registeredP = NIL;
        if (NIL == storage_modules_registeredP) {
            SubLObject csome_list_var = sub_skses;
            SubLObject sub = NIL;
            sub = csome_list_var.first();
            while ((NIL == storage_modules_registeredP) && (NIL != csome_list_var)) {
                if (NIL != sks_storage_modules_registered_p(sub)) {
                    storage_modules_registeredP = T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            } 
        }
        return storage_modules_registeredP;
    }

    public static SubLObject any_closure_sub_ks_storage_modules_registeredP(final SubLObject sks) {
        final SubLObject sub_skses = sksi_kb_accessors.sk_source_proper_sub_ks_closure_in_mapping_mt(sks);
        SubLObject storage_modules_registeredP = NIL;
        if (NIL == storage_modules_registeredP) {
            SubLObject csome_list_var = sub_skses;
            SubLObject sub = NIL;
            sub = csome_list_var.first();
            while ((NIL == storage_modules_registeredP) && (NIL != csome_list_var)) {
                if (NIL != sks_storage_modules_registered_p(sub)) {
                    storage_modules_registeredP = T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            } 
        }
        return storage_modules_registeredP;
    }

    public static SubLObject sksi_expanded_knowledge_sources() {
        return $sksi_expanded_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject sks_expanded_p(final SubLObject sks) {
        return subl_promotions.memberP(sks, sksi_expanded_knowledge_sources(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject sksi_expanded_knowledge_sources_add(final SubLObject sks) {
        if (NIL == sks_expanded_p(sks)) {
            $sksi_expanded_knowledge_sources$.setGlobalValue(list_utilities.sort_adjoin(sks, $sksi_expanded_knowledge_sources$.getGlobalValue(), symbol_function(EQ), $sym30$TERM___WITH_CONSTANT_BY_NAME, IDENTITY));
        }
        return $sksi_expanded_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject sksi_expanded_knowledge_sources_remove(final SubLObject sks) {
        $sksi_expanded_knowledge_sources$.setGlobalValue(remove(sks, $sksi_expanded_knowledge_sources$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return $sksi_expanded_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject sksi_toggle_expansion(final SubLObject sks) {
        if (NIL != sks_expanded_p(sks)) {
            sksi_expanded_knowledge_sources_remove(sks);
        } else {
            sksi_expanded_knowledge_sources_add(sks);
        }
        return $sksi_expanded_knowledge_sources$.getGlobalValue();
    }

    public static SubLObject sksi_sks_manager_internal(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str40$Structured_Knowledge_Source_Manag;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str41$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str42$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str47$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str53$sksi_sks_manager_input, T, UNPROVIDED);
                            display_input_table_framework(sksi_infrastructure_utilities.gather_all_top_level_complete_knowledge_sources());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject display_input_table_framework(final SubLObject sks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(TWO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != $sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str54$_444444);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject color_val = $str55$_ffffff;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != color_val) {
                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(color_val));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_glyph($NBSP, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (NIL != $sksi_sks_manager_check_sks_status_enabledP$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject color_val = $str55$_ffffff;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_glyph($NBSP, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        final SubLObject color_val = $str55$_ffffff;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != color_val) {
                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(color_val));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($$$REMOVAL);
                            html_glyph($NBSP, ONE_INTEGER);
                            html_princ($$$MODULES);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (NIL != $sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject color_val = $str55$_ffffff;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_glyph($NBSP, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(THREE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            final SubLObject color_val = $str55$_ffffff;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$STORAGE);
                                html_glyph($NBSP, ONE_INTEGER);
                                html_princ($$$MODULES);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str54$_444444);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject cdolist_list_var = (NIL != $sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) ? $list62 : $list63;
                SubLObject heading = NIL;
                heading = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL != $sksi_sks_manager_check_sks_status_enabledP$.getDynamicValue(thread)) || (!$str61$Up_.equal(heading))) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            final SubLObject color_val2 = $str55$_ffffff;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val2) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val2));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_glyph($NBSP, UNPROVIDED);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ(heading);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_glyph($NBSP, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    heading = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            display_user_input_table(sks_list);
            display_sks_all_row();
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_submit_input($$$Enter, $$$enter, UNPROVIDED);
        return NIL;
    }

    public static SubLObject display_user_input_table(final SubLObject sks_list) {
        if (NIL == sks_list) {
            return NIL;
        }
        SubLObject bgcolor = NIL;
        SubLObject color_toggle = NIL;
        SubLObject list_var = NIL;
        SubLObject sks = NIL;
        SubLObject ignore_me = NIL;
        list_var = sks_list;
        sks = list_var.first();
        for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sks = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
            if (NIL != color_toggle) {
                color_toggle = NIL;
            } else {
                color_toggle = T;
            }
            bgcolor = (NIL != color_toggle) ? $str66$_dddddd : $str67$_cccccc;
            final SubLObject expandedP = sks_expanded_p(sks);
            set_sks_table_row_parameters(sks, expandedP, bgcolor);
            if (NIL != expandedP) {
                final SubLObject sub_skses = sks_get_sub_skses(sks);
                display_user_input_table(sksi_infrastructure_utilities.sort_knowledge_sources(sub_skses));
            }
        }
        return NIL;
    }

    public static SubLObject choose_image_for_row(final SubLObject expP, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != expP) {
            return $url_contract_image$.getDynamicValue(thread);
        }
        if (NIL != sksi_sks_accessors.sks_complex_p(sks)) {
            return $url_expand_image$.getDynamicValue(thread);
        }
        return $url_blank_image$.getDynamicValue(thread);
    }

    public static SubLObject set_sks_table_row_parameters(final SubLObject sks, final SubLObject expP, final SubLObject default_bgcolor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject removal_reg_state = sks_removal_modules_registration_state(sks);
        final SubLObject storage_reg_state = sks_storage_modules_registration_state(sks);
        final SubLObject img_url = choose_image_for_row(expP, sks);
        SubLObject removal_reg_string = NIL;
        SubLObject storage_reg_string = NIL;
        SubLObject removal_regP = NIL;
        SubLObject storage_regP = NIL;
        SubLObject bgcolor = NIL;
        SubLObject accessibleP = NIL;
        if (NIL != $sksi_sks_manager_check_sks_status_enabledP$.getDynamicValue(thread)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        accessibleP = $str70$BROKEN_;
                        final SubLObject _prev_bind_0_$20 = sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.currentBinding(thread);
                        try {
                            sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$.bind(ONE_INTEGER, thread);
                            sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.bind($float$0_2, thread);
                            sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.bind($float$0_2, thread);
                            assert NIL != sksi_debugging.valid_sksi_error_handling_mode_p($IGNORE) : "sksi_debugging.valid_sksi_error_handling_mode_p(sksi_sks_manager.$kw72$IGNORE) " + "CommonSymbols.NIL != sksi_debugging.valid_sksi_error_handling_mode_p(sksi_sks_manager.$kw72$IGNORE) " + $IGNORE;
                            final SubLObject _prev_bind_0_$21 = sksi_debugging.$sksi_error_handling_mode$.currentBinding(thread);
                            try {
                                sksi_debugging.$sksi_error_handling_mode$.bind($IGNORE, thread);
                                if (NIL != sksi_infrastructure_utilities.sk_source_accessibleP(sks, UNPROVIDED)) {
                                    accessibleP = $$$Up;
                                } else {
                                    accessibleP = $$$Down;
                                }
                            } finally {
                                sksi_debugging.$sksi_error_handling_mode$.rebind(_prev_bind_0_$21, thread);
                            }
                        } finally {
                            sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.rebind(_prev_bind_3, thread);
                            sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.rebind(_prev_bind_2, thread);
                            sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$.rebind(_prev_bind_0_$20, thread);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        SubLObject pcase_var = removal_reg_state;
        if (pcase_var.eql($PARTIAL)) {
            removal_reg_string = $$$Some_registered;
            removal_regP = T;
            bgcolor = $str78$_DDDDFF;
        } else
            if (pcase_var.eql($REG)) {
                final SubLObject module_count = length(sksi_removal_module_generation.sksi_modules_by_sks_find_modules_with_children(sks));
                final SubLObject reg_string = removal_reg_string = cconcatenate($str80$All_registered_br__span_style__fo, new SubLObject[]{ format_nil.format_nil_a_no_copy(module_count), $str81$_modules___span_ });
                removal_regP = T;
                bgcolor = $str82$_AAAAFF;
            } else
                if (pcase_var.eql($NOREG)) {
                    removal_reg_string = $str84$;
                    removal_regP = NIL;
                    // bgcolor = bgcolor;
                }


        pcase_var = storage_reg_state;
        if (pcase_var.eql($PARTIAL)) {
            storage_reg_string = $$$Some_registered;
            storage_regP = T;
            if (NIL == bgcolor) {
                bgcolor = $str78$_DDDDFF;
            }
        } else
            if (pcase_var.eql($REG)) {
                final SubLObject module_count = length(sksi_hl_storage_module_generation.sksi_hl_storage_modules_by_sks_find_modules(sks));
                final SubLObject reg_string = storage_reg_string = (module_count.isZero() && (NIL != sks_get_sub_skses(sks))) ? $$$All_registered : cconcatenate($str86$All_br__span_style__font_size_80_, new SubLObject[]{ format_nil.format_nil_a_no_copy(module_count), $str81$_modules___span_ });
                storage_regP = T;
                if (NIL == bgcolor) {
                    bgcolor = $str82$_AAAAFF;
                }
            } else
                if (pcase_var.eql($NOREG)) {
                    storage_reg_string = $str84$;
                    storage_regP = NIL;
                }


        if (NIL == bgcolor) {
            bgcolor = default_bgcolor;
        }
        display_sks_table_row(sks, img_url, removal_reg_string, removal_regP, storage_reg_string, storage_regP, bgcolor, accessibleP);
        return NIL;
    }

    public static SubLObject display_sks_table_row(final SubLObject sks, final SubLObject img_url, final SubLObject removal_reg_string, final SubLObject removal_regP, final SubLObject storage_reg_string, final SubLObject storage_regP, SubLObject row_color, SubLObject accessibleP) {
        if (row_color == UNPROVIDED) {
            row_color = $str84$;
        }
        if (accessibleP == UNPROVIDED) {
            accessibleP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            name = string_utilities.object_to_string(cb_fort_identifier(sks));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        if (NIL != row_color) {
            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(row_color);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_indent(multiply(FOUR_INTEGER, sks_depth(sks, UNPROVIDED)));
                html_image_input(cconcatenate($str89$expansion_, name), img_url, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                cb_form(sks, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject protocol = sksi_access_path.get_sks_type(sks);
                final SubLObject subprotocol = sksi_access_path.get_sks_db_subprotocol(sks);
                if (NIL != kb_utilities.kbeq(protocol, $$Database_Physical)) {
                    html_princ($str91$DB_);
                    if (subprotocol.equal($$$postgresql)) {
                        html_princ($$$psql);
                    } else
                        if (subprotocol.equal($$$poisedata)) {
                            html_princ($$$POISE);
                        } else
                            if (subprotocol.isString()) {
                                html_princ(string_utilities.string_first_n(NINE_INTEGER, subprotocol));
                            }


                } else
                    if (NIL != kb_utilities.kbeq(protocol, $$RDFTripleStore_Physical)) {
                        html_princ($$$RDF);
                    } else
                        if (NIL != kb_utilities.kbeq(protocol, $$WebPage_AIS)) {
                            html_princ($$$HTTP);
                        } else
                            if (NIL != forts.fort_p(protocol)) {
                                html_princ(string_utilities.string_first_n(FIVE_INTEGER, kb_paths.fort_name(protocol)));
                            }



            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            if (NIL != $sksi_sks_manager_check_sks_status_enabledP$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, UNPROVIDED);
                    html_princ(accessibleP);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), removal_reg_string);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($CENTER));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject checkbox_name = cconcatenate($str100$register_removal_, name);
                html_checkbox_input(checkbox_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($CENTER));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                if (NIL != removal_regP) {
                    final SubLObject checkbox_name = cconcatenate($str101$deregister_removal_, name);
                    html_checkbox_input(checkbox_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    final SubLObject color_val = $$$gray;
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != color_val) {
                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(color_val));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            if (NIL != $sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, THREE_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                if (NIL == sksi_kb_accessors.modifiable_sk_source_in_any_mt_p(sks)) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } else {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), storage_reg_string);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject checkbox_name = cconcatenate($str103$register_storage_, name);
                        html_checkbox_input(checkbox_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        if (NIL != storage_regP) {
                            final SubLObject checkbox_name = cconcatenate($str104$deregister_storage_, name);
                            html_checkbox_input(checkbox_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            final SubLObject color_val = $$$gray;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject display_sks_all_row() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str105$_eeeeee);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($SKS_BLANK);
                final SubLObject align = $TOP;
                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($SKS_BLANK);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($$$All);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            if (NIL != $sksi_sks_manager_check_sks_status_enabledP$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(TWO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($str84$);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($CENTER));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_checkbox_input($str108$register_removal_all, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($CENTER));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_checkbox_input($str109$deregister_removal_all, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            if (NIL != $sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, THREE_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str84$);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_checkbox_input($str110$register_storage_all, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_checkbox_input($str111$deregister_storage_all, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject sks_source_by_input(final SubLObject input, final SubLObject prefix_string) {
        final SubLObject name = string_utilities.post_remove(string_utilities.post_remove(string_utilities.pre_remove(input.first(), prefix_string, UNPROVIDED), $str112$_x, UNPROVIDED), $str113$_y, UNPROVIDED);
        return cb_guess_fort(name, UNPROVIDED);
    }

    public static SubLObject sksi_sks_manager_input(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expansion_inputs = NIL;
        SubLObject register_removal_inputs = NIL;
        SubLObject deregister_removal_inputs = NIL;
        SubLObject register_removal_allP = NIL;
        SubLObject deregister_removal_allP = NIL;
        SubLObject registered_rm_count = NIL;
        SubLObject registered_pm_count = NIL;
        SubLObject deregistered_rm_count = NIL;
        SubLObject deregistered_pm_count = NIL;
        SubLObject register_storage_inputs = NIL;
        SubLObject deregister_storage_inputs = NIL;
        SubLObject register_storage_allP = NIL;
        SubLObject deregister_storage_allP = NIL;
        SubLObject registered_sm_count = NIL;
        SubLObject deregistered_sm_count = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject input = NIL;
        input = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (input.isList() && (NIL != string_utilities.starts_with(input.first(), $str89$expansion_))) {
                final SubLObject item_var = sks_source_by_input(input, $str89$expansion_);
                if (NIL == member(item_var, expansion_inputs, symbol_function(EQL), symbol_function(IDENTITY))) {
                    expansion_inputs = cons(item_var, expansion_inputs);
                }
            }
            if (input.isList() && second(input).equal($$$on)) {
                if (NIL != string_utilities.starts_with(input.first(), $str100$register_removal_)) {
                    final SubLObject name = string_utilities.pre_remove(input.first(), $str100$register_removal_, UNPROVIDED);
                    if (name.equal($$$all)) {
                        register_removal_allP = T;
                    } else {
                        register_removal_inputs = cons(cb_guess_fort(name, UNPROVIDED), register_removal_inputs);
                    }
                } else
                    if (NIL != string_utilities.starts_with(input.first(), $str101$deregister_removal_)) {
                        final SubLObject name = string_utilities.pre_remove(input.first(), $str101$deregister_removal_, UNPROVIDED);
                        if (name.equal($$$all)) {
                            deregister_removal_allP = T;
                        } else {
                            deregister_removal_inputs = cons(cb_guess_fort(name, UNPROVIDED), deregister_removal_inputs);
                        }
                    } else
                        if (NIL != string_utilities.starts_with(input.first(), $str103$register_storage_)) {
                            final SubLObject name = string_utilities.pre_remove(input.first(), $str103$register_storage_, UNPROVIDED);
                            if (name.equal($$$all)) {
                                register_storage_allP = T;
                            } else {
                                register_storage_inputs = cons(cb_guess_fort(name, UNPROVIDED), register_storage_inputs);
                            }
                        } else
                            if (NIL != string_utilities.starts_with(input.first(), $str104$deregister_storage_)) {
                                final SubLObject name = string_utilities.pre_remove(input.first(), $str104$deregister_storage_, UNPROVIDED);
                                if (name.equal($$$all)) {
                                    deregister_storage_allP = T;
                                } else {
                                    deregister_storage_inputs = cons(cb_guess_fort(name, UNPROVIDED), deregister_storage_inputs);
                                }
                            }



            }
            cdolist_list_var = cdolist_list_var.rest();
            input = cdolist_list_var.first();
        } 
        if (NIL == expansion_inputs) {
            if (NIL != deregister_removal_allP) {
                thread.resetMultipleValues();
                final SubLObject deregistered_rm_count_$45 = sksi_query_utilities.deregister_all_combined_sksi_removal_modules(UNPROVIDED);
                final SubLObject deregistered_pm_count_$46 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                deregistered_rm_count = deregistered_rm_count_$45;
                deregistered_pm_count = deregistered_pm_count_$46;
                clear_sksi_registered_knowledge_sources();
                clear_sksi_content_mts_with_registered_removal_module();
                clear_sksi_content_mts_with_registered_storage_module();
            } else {
                thread.resetMultipleValues();
                final SubLObject deregistered_rm_count_$46 = deregister_sksi_removal_modules_for_skses(deregister_removal_inputs);
                final SubLObject deregistered_pm_count_$47 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                deregistered_rm_count = deregistered_rm_count_$46;
                deregistered_pm_count = deregistered_pm_count_$47;
            }
            if (NIL != register_removal_allP) {
                final SubLObject all_complete_skses = sksi_infrastructure_utilities.gather_all_top_level_complete_knowledge_sources();
                final SubLObject unregistered_complete_skses = list_utilities.fast_set_difference(all_complete_skses, sksi_registered_knowledge_sources(), UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject registered_rm_count_$49 = register_sksi_removal_modules_for_skses(unregistered_complete_skses);
                final SubLObject registered_pm_count_$50 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                registered_rm_count = registered_rm_count_$49;
                registered_pm_count = registered_pm_count_$50;
            } else {
                thread.resetMultipleValues();
                final SubLObject registered_rm_count_$50 = register_sksi_removal_modules_for_skses(register_removal_inputs);
                final SubLObject registered_pm_count_$51 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                registered_rm_count = registered_rm_count_$50;
                registered_pm_count = registered_pm_count_$51;
            }
            if (NIL != deregister_storage_allP) {
                thread.resetMultipleValues();
                final SubLObject deregistered_sm_count_$53 = sksi_hl_storage_module_generation.deregister_all_sksi_hl_storage_modules();
                thread.resetMultipleValues();
                deregistered_sm_count = deregistered_sm_count_$53;
                clear_sksi_registered_knowledge_sources();
                clear_sksi_content_mts_with_registered_storage_module();
                clear_sksi_content_mts_with_registered_storage_module();
            } else {
                thread.resetMultipleValues();
                final SubLObject deregistered_sm_count_$54 = deregister_sksi_storage_modules_for_skses(deregister_storage_inputs);
                thread.resetMultipleValues();
                deregistered_sm_count = deregistered_sm_count_$54;
            }
            if (NIL != register_storage_allP) {
                final SubLObject all_complete_skses = sksi_infrastructure_utilities.gather_all_top_level_complete_knowledge_sources();
                final SubLObject unregistered_complete_skses = list_utilities.fast_set_difference(all_complete_skses, sksi_registered_knowledge_sources(), UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject registered_sm_count_$55 = register_sksi_storage_modules_for_skses(unregistered_complete_skses);
                thread.resetMultipleValues();
                registered_sm_count = registered_sm_count_$55;
            } else {
                thread.resetMultipleValues();
                final SubLObject registered_sm_count_$56 = register_sksi_storage_modules_for_skses(register_storage_inputs);
                thread.resetMultipleValues();
                registered_sm_count = registered_sm_count_$56;
            }
            if (NIL != registered_rm_count) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str116$_A_new_SKSI_removal_modules_have_, registered_rm_count);
            }
            html_newline(UNPROVIDED);
            if (NIL != registered_pm_count) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str117$_A_new_SKSI_preference_modules_ha, registered_pm_count);
            }
            html_newline(TWO_INTEGER);
            if (NIL != deregistered_rm_count) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str118$_A_SKSI_removal_modules_have_been, deregistered_rm_count);
            }
            html_newline(UNPROVIDED);
            if (NIL != deregistered_pm_count) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str119$_A_SKSI_preference_modules_have_b, deregistered_pm_count);
            }
            html_newline(TWO_INTEGER);
            if (NIL != $sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                if (NIL != registered_sm_count) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str120$_A_new_SKSI_storage_modules_have_, registered_sm_count);
                }
                html_newline(UNPROVIDED);
                if (NIL != deregistered_sm_count) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str121$_A_SKSI_storage_modules_have_been, deregistered_sm_count);
                }
                html_newline(TWO_INTEGER);
            }
            format(html_macros.$html_stream$.getDynamicValue(thread), $str122$Currently__you_have__A_SKSI_remov, sksi_query_utilities.combined_sksi_removal_modules_count(), sksi_preference_module_generation.sksi_preference_modules_count());
            if (NIL != $sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                html_newline(ONE_INTEGER);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str123$There_are_also__A_SKSI_HL_storage, sksi_hl_storage_module_generation.sksi_hl_storage_modules_count());
            }
            html_newline(THREE_INTEGER);
            cb_link($SKSI_SKS_MANAGER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_newline(TWO_INTEGER);
        } else {
            sksi_toggle_expansion(expansion_inputs.first());
            sksi_sks_manager(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject register_sksi_removal_modules_for_skses(final SubLObject sks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = ZERO_INTEGER;
        SubLObject pm_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_removal_modules_registered_knowledge_sources_add(sks);
            thread.resetMultipleValues();
            final SubLObject sks_rm_count = sksi_query_utilities.register_combined_sksi_removal_modules_for_sks(sks, UNPROVIDED, UNPROVIDED);
            final SubLObject sks_pm_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            rm_count = add(rm_count, sks_rm_count);
            pm_count = add(pm_count, sks_pm_count);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        rm_count = add(rm_count, register_removal_parent_ks_conjunctive_rms_if_warranted(sks_list));
        return values(rm_count, pm_count);
    }

    public static SubLObject register_removal_parent_ks_conjunctive_rms_if_warranted(final SubLObject sks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject registered_parents = NIL;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject parent = sksi_kb_accessors.immediate_genl_ks(sks);
                if ((NIL != parent) && (NIL == subl_promotions.memberP(parent, registered_parents, symbol_function(EQ), UNPROVIDED))) {
                    final SubLObject siblings = sksi_kb_accessors.sk_source_proper_sub_ks_closure(parent);
                    if (NIL != list_utilities.every_in_list($sym125$SK_SOURCE_REGISTERED_, siblings, UNPROVIDED)) {
                        registered_parents = cons(parent, registered_parents);
                        count = add(count, sksi_conjunctive_removal_module_generation.register_sksi_conjunctive_removal_module_for_just_sks(parent, UNPROVIDED, UNPROVIDED));
                        sksi_infrastructure_utilities.add_to_external_sources_activated_in_image(parent, NIL);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject deregister_sksi_removal_modules_for_skses(final SubLObject sks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = ZERO_INTEGER;
        SubLObject pm_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_removal_modules_registered_knowledge_sources_remove(sks);
            thread.resetMultipleValues();
            final SubLObject sks_rm_count = sksi_query_utilities.deregister_combined_sksi_removal_modules_for_sks(sks, UNPROVIDED, UNPROVIDED);
            final SubLObject sks_pm_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            rm_count = add(rm_count, sks_rm_count);
            pm_count = add(pm_count, sks_pm_count);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        rm_count = add(rm_count, deregister_removal_parent_ks_conjunctive_rms_if_warranted(sks_list));
        return values(rm_count, pm_count);
    }

    public static SubLObject deregister_removal_parent_ks_conjunctive_rms_if_warranted(final SubLObject sks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject deregistered_parents = NIL;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject parent = sksi_kb_accessors.immediate_genl_ks(sks);
                if ((NIL != parent) && (NIL == subl_promotions.memberP(parent, deregistered_parents, symbol_function(EQ), UNPROVIDED))) {
                    deregistered_parents = cons(parent, deregistered_parents);
                    count = add(count, sksi_conjunctive_removal_module_generation.deregister_sksi_conjunctive_removal_module_for_just_sks(parent, UNPROVIDED));
                    sksi_infrastructure_utilities.remove_from_external_sources_activated_in_image(parent, NIL);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject sks_registration_state(final SubLObject sks) {
        return sks_removal_modules_registration_state(sks);
    }

    public static SubLObject sks_removal_modules_registration_state(final SubLObject sks) {
        if (NIL != sks_removal_modules_registered_p(sks)) {
            return $REG;
        }
        if (NIL != sksi_sks_accessors.sks_atomic_p(sks)) {
            return $NOREG;
        }
        if (NIL != any_closure_sub_ks_removal_modules_registeredP(sks)) {
            return $PARTIAL;
        }
        return $NOREG;
    }

    public static SubLObject register_sksi_storage_modules_for_skses(final SubLObject sks_list) {
        SubLObject sm_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_storage_modules_registered_knowledge_sources_add(sks);
            final SubLObject sks_sm_count = sksi_hl_storage_module_generation.register_sksi_hl_storage_modules_for_sks(sks, UNPROVIDED);
            sm_count = add(sm_count, sks_sm_count);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return sm_count;
    }

    public static SubLObject deregister_sksi_storage_modules_for_skses(final SubLObject sks_list) {
        SubLObject sm_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_storage_modules_registered_knowledge_sources_remove(sks);
            final SubLObject sks_sm_count = sksi_hl_storage_module_generation.deregister_sksi_hl_storage_modules_for_sks(sks, UNPROVIDED, UNPROVIDED);
            sm_count = add(sm_count, sks_sm_count);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return sm_count;
    }

    public static SubLObject sks_storage_modules_registration_state(final SubLObject sks) {
        if (NIL != sks_storage_modules_registered_p(sks)) {
            return $REG;
        }
        if (NIL != sksi_sks_accessors.sks_atomic_p(sks)) {
            return $NOREG;
        }
        if (NIL != any_closure_sub_ks_storage_modules_registeredP(sks)) {
            return $PARTIAL;
        }
        return $NOREG;
    }

    public static SubLObject cb_sks_register(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str128$registering_knowledge_sources_);
        } else {
            final SubLObject fort = cb_guess_fort(args.first(), UNPROVIDED);
            SubLObject registered_count = NIL;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sksi_kb_accessors.sk_source_p(fort))) {
                Errors.error($str129$cb_sks_register_applied_to_non_kn);
            }
            registered_count = register_sksi_removal_modules_for_skses(list(fort));
            format(html_macros.$html_stream$.getDynamicValue(thread), $str116$_A_new_SKSI_removal_modules_have_, registered_count);
        }
        return NIL;
    }

    public static SubLObject cb_link_sksi_register(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str131$cb_sks_register__A, cb_fort_identifier(fort));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ($str132$_Register_KS_);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }

    public static SubLObject cb_sks_deregister(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str135$deregistering_knowledge_sources_);
        } else {
            final SubLObject fort = cb_guess_fort(args.first(), UNPROVIDED);
            SubLObject deregistered_count = NIL;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sksi_kb_accessors.sk_source_p(fort))) {
                Errors.error($str136$cb_register_applied_to_non_knowle);
            }
            deregistered_count = deregister_sksi_removal_modules_for_skses(list(fort));
            format(html_macros.$html_stream$.getDynamicValue(thread), $str118$_A_SKSI_removal_modules_have_been, deregistered_count);
        }
        return NIL;
    }

    public static SubLObject cb_link_sksi_deregister(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str138$cb_sks_deregister__A, cb_fort_identifier(fort));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ($str139$_Deregister_KS_);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }

    public static SubLObject sks_registration_state_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.doubletonP(v_object)) && (NIL != list_utilities.list_of_type_p(SK_SOURCE_P, v_object.first()))) && (NIL != list_utilities.list_of_type_p(SK_SOURCE_P, second(v_object))));
    }

    public static SubLObject current_sks_registration_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject top_levels = current_top_level_and_straggler_registered_knowledge_sources();
        final SubLObject stragglers = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return list(top_levels, stragglers);
    }

    public static SubLObject current_top_level_and_straggler_registered_knowledge_sources() {
        final SubLObject top_levels = sksi_infrastructure_utilities.gather_all_top_level_complete_registered_knowledge_sources();
        final SubLObject proper_subs_of_top_levels = Mapping.mapcan(SK_SOURCE_PROPER_SUB_KS_CLOSURE_IN_MAPPING_MT, top_levels, EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject subs_of_top_levels = append(top_levels, proper_subs_of_top_levels);
        final SubLObject stragglers = list_utilities.fast_set_difference(sksi_removal_modules_registered_knowledge_sources(), subs_of_top_levels, UNPROVIDED);
        return values(top_levels, stragglers);
    }

    public static SubLObject destructure_sks_registration_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject top_levels_var = NIL;
        SubLObject stragglers_var = NIL;
        destructuring_bind_must_consp(current, datum, $list144);
        top_levels_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        stragglers_var = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject state = NIL;
            destructuring_bind_must_consp(current, datum, $list144);
            state = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CDESTRUCTURING_BIND, list(top_levels_var, stragglers_var), state, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list144);
        return NIL;
    }

    public static SubLObject execute_sks_registration_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sks_registration_state_p(state) : "sksi_sks_manager.sks_registration_state_p(state) " + "CommonSymbols.NIL != sksi_sks_manager.sks_registration_state_p(state) " + state;
        SubLObject registered_rm_count = ZERO_INTEGER;
        SubLObject registered_pm_count = ZERO_INTEGER;
        SubLObject deregistered_rm_count = ZERO_INTEGER;
        SubLObject deregistered_pm_count = ZERO_INTEGER;
        SubLObject current;
        final SubLObject datum = current = current_sks_registration_state();
        SubLObject current_top_levels = NIL;
        SubLObject current_stragglers = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        current_top_levels = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        current_stragglers = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject state_top_levels = NIL;
            SubLObject state_stragglers = NIL;
            destructuring_bind_must_consp(state, state, $list148);
            state_top_levels = state.first();
            SubLObject current_$58 = state.rest();
            destructuring_bind_must_consp(current_$58, state, $list148);
            state_stragglers = current_$58.first();
            current_$58 = current_$58.rest();
            if (NIL == current_$58) {
                final SubLObject top_levels_to_register = list_utilities.fast_set_difference(state_top_levels, current_top_levels, UNPROVIDED);
                final SubLObject top_levels_to_deregister = list_utilities.fast_set_difference(current_top_levels, state_top_levels, UNPROVIDED);
                final SubLObject stragglers_to_register = list_utilities.fast_set_difference(state_stragglers, current_stragglers, UNPROVIDED);
                final SubLObject stragglers_to_deregister = list_utilities.fast_set_difference(current_stragglers, state_stragglers, UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject deregistered_rm_count_$59 = deregister_sksi_removal_modules_for_skses(append(stragglers_to_deregister, top_levels_to_deregister));
                final SubLObject deregistered_pm_count_$60 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                deregistered_rm_count = deregistered_rm_count_$59;
                deregistered_pm_count = deregistered_pm_count_$60;
                thread.resetMultipleValues();
                final SubLObject registered_rm_count_$61 = register_sksi_removal_modules_for_skses(append(top_levels_to_register, stragglers_to_register));
                final SubLObject registered_pm_count_$62 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                registered_rm_count = registered_rm_count_$61;
                registered_pm_count = registered_pm_count_$62;
            } else {
                cdestructuring_bind_error(state, $list148);
            }
        } else {
            cdestructuring_bind_error(datum, $list147);
        }
        return values(registered_rm_count, registered_pm_count, deregistered_rm_count, deregistered_pm_count);
    }

    public static SubLObject clear_sks_registration_state() {
        return execute_sks_registration_state($list149);
    }

    public static SubLObject declare_sksi_sks_manager_file() {
        declareFunction(me, "sksi_sks_manager", "SKSI-SKS-MANAGER", 0, 1, false);
        declareFunction(me, "cb_link_sksi_sks_manager", "CB-LINK-SKSI-SKS-MANAGER", 0, 1, false);
        declareFunction(me, "sks_get_sub_skses", "SKS-GET-SUB-SKSES", 1, 0, false);
        declareFunction(me, "sks_depth", "SKS-DEPTH", 1, 1, false);
        declareFunction(me, "clear_sksi_registered_knowledge_sources", "CLEAR-SKSI-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction(me, "sksi_registered_knowledge_sources", "SKSI-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction(me, "sksi_removal_modules_registered_knowledge_sources", "SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction(me, "clear_sksi_removal_modules_registered_knowledge_sources", "CLEAR-SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction(me, "sks_registered_p", "SKS-REGISTERED-P", 1, 0, false);
        declareFunction(me, "sks_removal_modules_registered_p", "SKS-REMOVAL-MODULES-REGISTERED-P", 1, 0, false);
        declareFunction(me, "sksi_content_mts_with_registered_module", "SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE", 0, 0, false);
        declareFunction(me, "sksi_content_mts_with_registered_removal_module", "SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE", 0, 0, false);
        declareFunction(me, "clear_sksi_content_mts_with_registered_module", "CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE", 0, 0, false);
        declareFunction(me, "clear_sksi_content_mts_with_registered_removal_module", "CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE", 0, 0, false);
        declareFunction(me, "add_sksi_content_mts_with_registered_module_for_sks", "ADD-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE-FOR-SKS", 1, 0, false);
        declareFunction(me, "add_sksi_content_mts_with_registered_removal_module_for_sks", "ADD-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE-FOR-SKS", 1, 0, false);
        declareFunction(me, "remove_sksi_content_mts_with_registered_module_for_sks", "REMOVE-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE-FOR-SKS", 1, 0, false);
        declareFunction(me, "remove_sksi_content_mts_with_registered_removal_module_for_sks", "REMOVE-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE-FOR-SKS", 1, 0, false);
        declareFunction(me, "sksi_storage_modules_registered_knowledge_sources", "SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction(me, "clear_sksi_storage_modules_registered_knowledge_sources", "CLEAR-SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction(me, "sks_storage_modules_registered_p", "SKS-STORAGE-MODULES-REGISTERED-P", 1, 0, false);
        declareFunction(me, "sksi_content_mts_with_registered_storage_module", "SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE", 0, 0, false);
        declareFunction(me, "clear_sksi_content_mts_with_registered_storage_module", "CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE", 0, 0, false);
        declareFunction(me, "add_sksi_content_mts_with_registered_storage_module_for_sks", "ADD-SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE-FOR-SKS", 1, 0, false);
        declareFunction(me, "remove_sksi_content_mts_with_registered_storage_module_for_sks", "REMOVE-SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE-FOR-SKS", 1, 0, false);
        declareFunction(me, "sksi_registered_knowledge_sources_add", "SKSI-REGISTERED-KNOWLEDGE-SOURCES-ADD", 1, 0, false);
        declareFunction(me, "sksi_removal_modules_registered_knowledge_sources_add", "SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES-ADD", 1, 0, false);
        declareFunction(me, "sksi_registered_knowledge_sources_remove_partial", "SKSI-REGISTERED-KNOWLEDGE-SOURCES-REMOVE-PARTIAL", 1, 0, false);
        declareFunction(me, "sksi_removal_modules_registered_knowledge_sources_remove_partial", "SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES-REMOVE-PARTIAL", 1, 0, false);
        declareFunction(me, "sksi_removal_modules_registered_knowledge_sources_remove", "SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES-REMOVE", 1, 0, false);
        declareFunction(me, "removal_modules_registered_sub_skses", "REMOVAL-MODULES-REGISTERED-SUB-SKSES", 1, 0, false);
        declareFunction(me, "any_sub_ks_removal_modules_registeredP", "ANY-SUB-KS-REMOVAL-MODULES-REGISTERED?", 1, 0, false);
        declareFunction(me, "any_closure_sub_ks_removal_modules_registeredP", "ANY-CLOSURE-SUB-KS-REMOVAL-MODULES-REGISTERED?", 1, 0, false);
        declareFunction(me, "sksi_storage_modules_registered_knowledge_sources_add", "SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES-ADD", 1, 0, false);
        declareFunction(me, "sksi_storage_modules_registered_knowledge_sources_remove_partial", "SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES-REMOVE-PARTIAL", 1, 0, false);
        declareFunction(me, "sksi_storage_modules_registered_knowledge_sources_remove", "SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES-REMOVE", 1, 0, false);
        declareFunction(me, "storage_modules_registered_sub_skses", "STORAGE-MODULES-REGISTERED-SUB-SKSES", 1, 0, false);
        declareFunction(me, "any_sub_ks_storage_modules_registeredP", "ANY-SUB-KS-STORAGE-MODULES-REGISTERED?", 1, 0, false);
        declareFunction(me, "any_closure_sub_ks_storage_modules_registeredP", "ANY-CLOSURE-SUB-KS-STORAGE-MODULES-REGISTERED?", 1, 0, false);
        declareFunction(me, "sksi_expanded_knowledge_sources", "SKSI-EXPANDED-KNOWLEDGE-SOURCES", 0, 0, false);
        declareFunction(me, "sks_expanded_p", "SKS-EXPANDED-P", 1, 0, false);
        declareFunction(me, "sksi_expanded_knowledge_sources_add", "SKSI-EXPANDED-KNOWLEDGE-SOURCES-ADD", 1, 0, false);
        declareFunction(me, "sksi_expanded_knowledge_sources_remove", "SKSI-EXPANDED-KNOWLEDGE-SOURCES-REMOVE", 1, 0, false);
        declareFunction(me, "sksi_toggle_expansion", "SKSI-TOGGLE-EXPANSION", 1, 0, false);
        declareFunction(me, "sksi_sks_manager_internal", "SKSI-SKS-MANAGER-INTERNAL", 1, 0, false);
        declareFunction(me, "display_input_table_framework", "DISPLAY-INPUT-TABLE-FRAMEWORK", 1, 0, false);
        declareFunction(me, "display_user_input_table", "DISPLAY-USER-INPUT-TABLE", 1, 0, false);
        declareFunction(me, "choose_image_for_row", "CHOOSE-IMAGE-FOR-ROW", 2, 0, false);
        declareFunction(me, "set_sks_table_row_parameters", "SET-SKS-TABLE-ROW-PARAMETERS", 3, 0, false);
        declareFunction(me, "display_sks_table_row", "DISPLAY-SKS-TABLE-ROW", 6, 2, false);
        declareFunction(me, "display_sks_all_row", "DISPLAY-SKS-ALL-ROW", 0, 0, false);
        declareFunction(me, "sks_source_by_input", "SKS-SOURCE-BY-INPUT", 2, 0, false);
        declareFunction(me, "sksi_sks_manager_input", "SKSI-SKS-MANAGER-INPUT", 1, 0, false);
        declareFunction(me, "register_sksi_removal_modules_for_skses", "REGISTER-SKSI-REMOVAL-MODULES-FOR-SKSES", 1, 0, false);
        declareFunction(me, "register_removal_parent_ks_conjunctive_rms_if_warranted", "REGISTER-REMOVAL-PARENT-KS-CONJUNCTIVE-RMS-IF-WARRANTED", 1, 0, false);
        declareFunction(me, "deregister_sksi_removal_modules_for_skses", "DEREGISTER-SKSI-REMOVAL-MODULES-FOR-SKSES", 1, 0, false);
        declareFunction(me, "deregister_removal_parent_ks_conjunctive_rms_if_warranted", "DEREGISTER-REMOVAL-PARENT-KS-CONJUNCTIVE-RMS-IF-WARRANTED", 1, 0, false);
        declareFunction(me, "sks_registration_state", "SKS-REGISTRATION-STATE", 1, 0, false);
        declareFunction(me, "sks_removal_modules_registration_state", "SKS-REMOVAL-MODULES-REGISTRATION-STATE", 1, 0, false);
        declareFunction(me, "register_sksi_storage_modules_for_skses", "REGISTER-SKSI-STORAGE-MODULES-FOR-SKSES", 1, 0, false);
        declareFunction(me, "deregister_sksi_storage_modules_for_skses", "DEREGISTER-SKSI-STORAGE-MODULES-FOR-SKSES", 1, 0, false);
        declareFunction(me, "sks_storage_modules_registration_state", "SKS-STORAGE-MODULES-REGISTRATION-STATE", 1, 0, false);
        declareFunction(me, "cb_sks_register", "CB-SKS-REGISTER", 1, 0, false);
        declareFunction(me, "cb_link_sksi_register", "CB-LINK-SKSI-REGISTER", 1, 0, false);
        declareFunction(me, "cb_sks_deregister", "CB-SKS-DEREGISTER", 1, 0, false);
        declareFunction(me, "cb_link_sksi_deregister", "CB-LINK-SKSI-DEREGISTER", 1, 0, false);
        declareFunction(me, "sks_registration_state_p", "SKS-REGISTRATION-STATE-P", 1, 0, false);
        declareFunction(me, "current_sks_registration_state", "CURRENT-SKS-REGISTRATION-STATE", 0, 0, false);
        declareFunction(me, "current_top_level_and_straggler_registered_knowledge_sources", "CURRENT-TOP-LEVEL-AND-STRAGGLER-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        declareMacro(me, "destructure_sks_registration_state", "DESTRUCTURE-SKS-REGISTRATION-STATE");
        declareFunction(me, "execute_sks_registration_state", "EXECUTE-SKS-REGISTRATION-STATE", 1, 0, false);
        declareFunction(me, "clear_sks_registration_state", "CLEAR-SKS-REGISTRATION-STATE", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_sks_manager_file() {
        defparameter("*SKSI-SKS-MANAGER-STORAGE-MODULE-SUPPORT-ENABLED?*", NIL);
        defparameter("*SKSI-SKS-MANAGER-CHECK-SKS-STATUS-ENABLED?*", NIL);
        deflexical("*SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES*", SubLSystemTrampolineFile.maybeDefault($sksi_removal_modules_registered_knowledge_sources$, $sksi_removal_modules_registered_knowledge_sources$, NIL));
        deflexical("*SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE*", SubLSystemTrampolineFile.maybeDefault($sksi_content_mts_with_registered_removal_module$, $sksi_content_mts_with_registered_removal_module$, NIL));
        deflexical("*SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES*", SubLSystemTrampolineFile.maybeDefault($sksi_storage_modules_registered_knowledge_sources$, $sksi_storage_modules_registered_knowledge_sources$, NIL));
        deflexical("*SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE*", SubLSystemTrampolineFile.maybeDefault($sksi_content_mts_with_registered_storage_module$, $sksi_content_mts_with_registered_storage_module$, NIL));
        deflexical("*SKSI-EXPANDED-KNOWLEDGE-SOURCES*", SubLSystemTrampolineFile.maybeDefault($sksi_expanded_knowledge_sources$, $sksi_expanded_knowledge_sources$, NIL));
        defparameter("*URL-EXPAND-IMAGE*", $str37$_cycdoc_img_cb_right_triangle_blu);
        defparameter("*URL-CONTRACT-IMAGE*", $str38$_cycdoc_img_cb_down_triangle_blue);
        defparameter("*URL-BLANK-IMAGE*", $str39$_cycdoc_img_cb_blank_gif);
        return NIL;
    }

    public static SubLObject setup_sksi_sks_manager_file() {
        html_macros.note_cgi_handler_function(SKSI_SKS_MANAGER, $HTML_HANDLER);
        setup_cb_link_method($SKSI_SKS_MANAGER, CB_LINK_SKSI_SKS_MANAGER, ONE_INTEGER);
        declare_cb_tool($SKSI_SKS_MANAGER, $$$SKS_Manager, $$$SKSMan, $$$SKSI_SKS_Manager);
        declare_defglobal($sksi_removal_modules_registered_knowledge_sources$);
        define_obsolete_register(SKS_REGISTERED_P, $list13);
        declare_defglobal($sksi_content_mts_with_registered_removal_module$);
        define_obsolete_register(SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE, $list16);
        define_obsolete_register(CLEAR_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE, $list18);
        define_obsolete_register(ADD_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE_FOR_SKS, $list20);
        define_obsolete_register(REMOVE_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE_FOR_SKS, $list22);
        declare_defglobal($sksi_storage_modules_registered_knowledge_sources$);
        declare_defglobal($sksi_content_mts_with_registered_storage_module$);
        define_obsolete_register(SKSI_REGISTERED_KNOWLEDGE_SOURCES_ADD, $list26);
        define_obsolete_register(SKSI_REGISTERED_KNOWLEDGE_SOURCES_REMOVE_PARTIAL, $list28);
        declare_defglobal($sksi_expanded_knowledge_sources$);
        sethash($SKS_EXPAND, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str32$right_triangle_blue_gif, NIL));
        sethash($SKS_CONTRACT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str34$down_triangle_blue_gif, NIL));
        sethash($SKS_BLANK, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str36$blank_gif, NIL));
        html_macros.note_cgi_handler_function(SKSI_SKS_MANAGER_INPUT, $HTML_HANDLER);
        define_obsolete_register(SKS_REGISTRATION_STATE, $list127);
        html_macros.note_cgi_handler_function(CB_SKS_REGISTER, $HTML_HANDLER);
        setup_cb_link_method($SKSI_REGISTER, CB_LINK_SKSI_REGISTER, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_SKS_DEREGISTER, $HTML_HANDLER);
        setup_cb_link_method($SKSI_DEREGISTER, CB_LINK_SKSI_DEREGISTER, ONE_INTEGER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_sks_manager_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_sks_manager_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_sks_manager_file();
    }

    
}

/**
 * Total time: 1142 ms
 */
