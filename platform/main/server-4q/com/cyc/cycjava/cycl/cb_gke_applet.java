/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-GKE-APPLET
 *  source file: /cyc/top/cycl/cb-gke-applet.lisp
 *  created:     2019/07/03 17:38:08
 */
public final class cb_gke_applet extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_gke_applet() {
    }

    public static final SubLFile me = new cb_gke_applet();


    // // Definitions
    // deflexical
    public static final SubLSymbol $cb_gke_codebase$ = makeSymbol("*CB-GKE-CODEBASE*");

    // deflexical
    public static final SubLSymbol $cb_gke_class_file$ = makeSymbol("*CB-GKE-CLASS-FILE*");

    // deflexical
    public static final SubLSymbol $cb_gke_default_height$ = makeSymbol("*CB-GKE-DEFAULT-HEIGHT*");

    // deflexical
    public static final SubLSymbol $cb_gke_default_width$ = makeSymbol("*CB-GKE-DEFAULT-WIDTH*");

    /**
     * valid plist indicators: is-question?
     * :generation-mt
     * :parsing-mt
     * :editable_arg_positions
     * (:appname 'Guided Knowledge Entry')
     * (:height *cb-gke-default-height*)
     * (:width *cb-gke-default-width*)
     */
    public static final SubLObject cb_gke_applet(SubLObject formula, SubLObject mt, SubLObject submit_url_params, SubLObject handler, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = plist;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt4);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt4);
                    if (NIL == member(current_1, $list_alt5, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt4);
                }
                {
                    SubLObject is_questionP_tail = property_list_member($kw7$IS_QUESTION_, current);
                    SubLObject is_questionP = (NIL != is_questionP_tail) ? ((SubLObject) (cadr(is_questionP_tail))) : NIL;
                    SubLObject generation_mt_tail = property_list_member($GENERATION_MT, current);
                    SubLObject generation_mt = (NIL != generation_mt_tail) ? ((SubLObject) (cadr(generation_mt_tail))) : NIL;
                    SubLObject parsing_mt_tail = property_list_member($PARSING_MT, current);
                    SubLObject parsing_mt = (NIL != parsing_mt_tail) ? ((SubLObject) (cadr(parsing_mt_tail))) : NIL;
                    SubLObject editable_arg_positions_tail = property_list_member($EDITABLE_ARG_POSITIONS, current);
                    SubLObject editable_arg_positions = (NIL != editable_arg_positions_tail) ? ((SubLObject) (cadr(editable_arg_positions_tail))) : NIL;
                    SubLObject lookup_term_function_tail = property_list_member($LOOKUP_TERM_FUNCTION, current);
                    SubLObject lookup_term_function = (NIL != lookup_term_function_tail) ? ((SubLObject) (cadr(lookup_term_function_tail))) : NIL;
                    SubLObject lookup_term_function_args_tail = property_list_member($LOOKUP_TERM_FUNCTION_ARGS, current);
                    SubLObject lookup_term_function_args = (NIL != lookup_term_function_args_tail) ? ((SubLObject) (cadr(lookup_term_function_args_tail))) : NIL;
                    SubLObject lookup_term_text_tail = property_list_member($LOOKUP_TERM_TEXT, current);
                    SubLObject lookup_term_text = (NIL != lookup_term_text_tail) ? ((SubLObject) (cadr(lookup_term_text_tail))) : NIL;
                    SubLObject appname_tail = property_list_member($APPNAME, current);
                    SubLObject appname = (NIL != appname_tail) ? ((SubLObject) (cadr(appname_tail))) : $$$Guided_Knowledge_Entry;
                    SubLObject height_tail = property_list_member($HEIGHT, current);
                    SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : $cb_gke_default_height$.getGlobalValue();
                    SubLObject width_tail = property_list_member($WIDTH, current);
                    SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : $cb_gke_default_width$.getGlobalValue();
                    SubLObject gke_archive = cyc_file_dependencies.java_applet_archive_string($$$gke);
                    html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($cb_gke_class_file$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($cb_gke_codebase$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(gke_archive);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(height);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(width);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject port_string = string_utilities.to_string(cb_uia_forwarding.get_forwarding_base_port());
                                SubLObject host_name_string = cb_uia_forwarding.get_forwarding_machine_name();
                                SubLObject is_question_string = (NIL != is_questionP) ? ((SubLObject) ($$$true)) : $$$false;
                                SubLObject formula_string = string_utilities.to_string(cycl_utilities.hl_to_el(formula));
                                SubLObject mt_string = string_utilities.to_string(mt);
                                SubLObject generation_mt_string = (NIL != forts.fort_p(generation_mt)) ? ((SubLObject) (string_utilities.to_string(generation_mt))) : NIL;
                                SubLObject parsing_mt_string = (NIL != forts.fort_p(parsing_mt)) ? ((SubLObject) (string_utilities.to_string(parsing_mt))) : NIL;
                                SubLObject app_name_string = string_utilities.to_string(appname);
                                SubLObject submit_params_string = cconcatenate(string_utilities.to_string(handler), new SubLObject[]{ $str_alt21$_, web_utilities.html_property_list_to_url_parameters(submit_url_params) });
                                SubLObject submit_page_string = system_parameters.$cyc_cgi_program$.getDynamicValue(thread);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt22$cycl_expression);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(formula_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt23$working_mt);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(mt_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if (generation_mt_string.isString()) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt24$generation_mt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(generation_mt_string);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                                if (parsing_mt_string.isString()) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt25$parsing_mt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(parsing_mt_string);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt26$is_question);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(is_question_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt27$host_name);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(host_name_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$port);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(port_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt29$app_name);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(app_name_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt30$submit_page);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(submit_page_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt31$submit_params);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(submit_params_string);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if (!lookup_term_function.equal(NIL)) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt32$lookup_term_function);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string(lookup_term_function));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt33$lookup_term_function_args);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string(lookup_term_function_args));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt34$lookup_term_text);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string(lookup_term_text));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                                if (NIL != editable_arg_positions) {
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt35$editable_arg_positions);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string(editable_arg_positions));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_applet_tail$.getGlobalValue());
                }
            }
            return formula;
        }
    }

    public static final SubLObject declare_cb_gke_applet_file() {
        declareFunction("cb_gke_applet", "CB-GKE-APPLET", 4, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_gke_applet_file() {
        deflexical("*CB-GKE-CODEBASE*", $str_alt0$_java_gke);
        deflexical("*CB-GKE-CLASS-FILE*", $str_alt1$com_cyc_framework_ui_gke_GKEApple);
        deflexical("*CB-GKE-DEFAULT-HEIGHT*", $int$120);
        deflexical("*CB-GKE-DEFAULT-WIDTH*", $int$500);
        return NIL;
    }

    public static final SubLObject setup_cb_gke_applet_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_java_gke = makeString("/java/gke");

    static private final SubLString $str_alt1$com_cyc_framework_ui_gke_GKEApple = makeString("com.cyc.framework.ui.gke.GKEApplet");

    public static final SubLInteger $int$120 = makeInteger(120);

    public static final SubLInteger $int$500 = makeInteger(500);

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("IS-QUESTION?"), makeSymbol("GENERATION-MT"), makeSymbol("PARSING-MT"), makeSymbol("EDITABLE-ARG-POSITIONS"), makeSymbol("LOOKUP-TERM-FUNCTION"), makeSymbol("LOOKUP-TERM-FUNCTION-ARGS"), makeSymbol("LOOKUP-TERM-TEXT"), list(makeSymbol("APPNAME"), makeString("Guided Knowledge Entry")), list(makeSymbol("HEIGHT"), makeSymbol("*CB-GKE-DEFAULT-HEIGHT*")), list(makeSymbol("WIDTH"), makeSymbol("*CB-GKE-DEFAULT-WIDTH*")) });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("IS-QUESTION?"), makeKeyword("GENERATION-MT"), makeKeyword("PARSING-MT"), makeKeyword("EDITABLE-ARG-POSITIONS"), makeKeyword("LOOKUP-TERM-FUNCTION"), makeKeyword("LOOKUP-TERM-FUNCTION-ARGS"), makeKeyword("LOOKUP-TERM-TEXT"), makeKeyword("APPNAME"), makeKeyword("HEIGHT"), makeKeyword("WIDTH") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol $kw7$IS_QUESTION_ = makeKeyword("IS-QUESTION?");





    private static final SubLSymbol $EDITABLE_ARG_POSITIONS = makeKeyword("EDITABLE-ARG-POSITIONS");

    private static final SubLSymbol $LOOKUP_TERM_FUNCTION = makeKeyword("LOOKUP-TERM-FUNCTION");

    private static final SubLSymbol $LOOKUP_TERM_FUNCTION_ARGS = makeKeyword("LOOKUP-TERM-FUNCTION-ARGS");

    private static final SubLSymbol $LOOKUP_TERM_TEXT = makeKeyword("LOOKUP-TERM-TEXT");



    static private final SubLString $$$Guided_Knowledge_Entry = makeString("Guided Knowledge Entry");





    static private final SubLString $$$gke = makeString("gke");

    static private final SubLString $$$true = makeString("true");

    static private final SubLString $$$false = makeString("false");

    static private final SubLString $str_alt21$_ = makeString("&");

    static private final SubLString $str_alt22$cycl_expression = makeString("cycl_expression");

    static private final SubLString $str_alt23$working_mt = makeString("working_mt");

    static private final SubLString $str_alt24$generation_mt = makeString("generation_mt");

    static private final SubLString $str_alt25$parsing_mt = makeString("parsing_mt");

    static private final SubLString $str_alt26$is_question = makeString("is_question");

    static private final SubLString $str_alt27$host_name = makeString("host_name");

    static private final SubLString $$$port = makeString("port");

    static private final SubLString $str_alt29$app_name = makeString("app_name");

    static private final SubLString $str_alt30$submit_page = makeString("submit_page");

    static private final SubLString $str_alt31$submit_params = makeString("submit_params");

    static private final SubLString $str_alt32$lookup_term_function = makeString("lookup_term_function");

    static private final SubLString $str_alt33$lookup_term_function_args = makeString("lookup_term_function_args");

    static private final SubLString $str_alt34$lookup_term_text = makeString("lookup_term_text");

    static private final SubLString $str_alt35$editable_arg_positions = makeString("editable_arg_positions");

    // // Initializers
    public void declareFunctions() {
        declare_cb_gke_applet_file();
    }

    public void initializeVariables() {
        init_cb_gke_applet_file();
    }

    public void runTopLevelForms() {
        setup_cb_gke_applet_file();
    }
}

