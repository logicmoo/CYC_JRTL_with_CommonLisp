/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
 *  module:      CB-GKE2-APPLET
 *  source file: /cyc/top/cycl/cb-gke2-applet.lisp
 *  created:     2019/07/03 17:38:08
 */
public final class cb_gke2_applet extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_gke2_applet() {
    }

    public static final SubLFile me = new cb_gke2_applet();


    // // Definitions
    // deflexical
    public static final SubLSymbol $cb_gke2_codebase$ = makeSymbol("*CB-GKE2-CODEBASE*");

    // deflexical
    public static final SubLSymbol $cb_gke2_class_file$ = makeSymbol("*CB-GKE2-CLASS-FILE*");

    // deflexical
    public static final SubLSymbol $cb_gke2_default_height$ = makeSymbol("*CB-GKE2-DEFAULT-HEIGHT*");

    // deflexical
    public static final SubLSymbol $cb_gke2_default_width$ = makeSymbol("*CB-GKE2-DEFAULT-WIDTH*");

    /**
     * Generates html for using a GKE applet in the Cyc Browser.
     * Valid plist indicators: (is-question? nil)
     * (:generation-mt #$EnglishParaphraseMt)
     * (:parsing-mt #$EnglishMt)
     * (:nl-preds '(#$nonPlural-Generic #$tensed)
     * (:appname 'Guided Knowledge Entry')
     * //(:height *cb-gke-default-height*)
     * //(:width *cb-gke-default-width*)
     * display mode is one of :unconstrained-cycl, :english, :cycl
     * which correspond to "Unconstrained CycL", "English", "CycL"
     */
    public static final SubLObject cb_gke2_applet(SubLObject formula, SubLObject mt, SubLObject display_mode, SubLObject form_input_name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject applet_html_name_ending = $str_alt4$;
                SubLObject datum = plist;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt5);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt5);
                    if (NIL == member(current_1, $list_alt6, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt5);
                }
                {
                    SubLObject is_questionP_tail = property_list_member($kw8$IS_QUESTION_, current);
                    SubLObject is_questionP = (NIL != is_questionP_tail) ? ((SubLObject) (cadr(is_questionP_tail))) : NIL;
                    SubLObject generation_mt_tail = property_list_member($GENERATION_MT, current);
                    SubLObject generation_mt = (NIL != generation_mt_tail) ? ((SubLObject) (cadr(generation_mt_tail))) : $$EnglishParaphraseMt;
                    SubLObject parsing_mt_tail = property_list_member($PARSING_MT, current);
                    SubLObject parsing_mt = (NIL != parsing_mt_tail) ? ((SubLObject) (cadr(parsing_mt_tail))) : $$EnglishMt;
                    SubLObject nl_preds_tail = property_list_member($NL_PREDS, current);
                    SubLObject nl_preds = (NIL != nl_preds_tail) ? ((SubLObject) (cadr(nl_preds_tail))) : $list_alt14;
                    SubLObject appname_tail = property_list_member($APPNAME, current);
                    SubLObject appname = (NIL != appname_tail) ? ((SubLObject) (cadr(appname_tail))) : $$$Guided_Knowledge_Entry;
                    SubLObject height_tail = property_list_member($HEIGHT, current);
                    SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : $cb_gke2_default_height$.getGlobalValue();
                    SubLObject width_tail = property_list_member($WIDTH, current);
                    SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : $cb_gke2_default_width$.getGlobalValue();
                    applet_html_name_ending = html_script_utilities.html_simple_applet_input_initialization(form_input_name, html_script_utilities.$gke_applet_name$.getGlobalValue());
                    {
                        SubLObject gke2_archive = cyc_file_dependencies.java_applet_archive_string($$$gke2);
                        html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_gke2_class_file$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_gke2_codebase$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(gke2_archive);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != cconcatenate(form_input_name, applet_html_name_ending)) {
                            html_utilities.html_markup(html_macros.$html_applet_name$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(cconcatenate(form_input_name, applet_html_name_ending));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != cconcatenate(form_input_name, applet_html_name_ending)) {
                            html_utilities.html_markup(html_macros.$html_applet_id$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(cconcatenate(form_input_name, applet_html_name_ending));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(height);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt20$100_);
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
                                    SubLObject mt_string = string_utilities.to_string(mt);
                                    SubLObject generation_mt_string = string_utilities.to_string(generation_mt);
                                    SubLObject parsing_mt_string = string_utilities.to_string(parsing_mt);
                                    SubLObject nl_preds_string = string_utilities.to_string(nl_preds);
                                    SubLObject app_name_string = string_utilities.to_string(appname);
                                    SubLObject display_mode_string = (display_mode == $UNCONSTRAINED_CYCL) ? ((SubLObject) ($$$Unconstrained_CycL)) : display_mode == $ENGLISH ? ((SubLObject) ($$$English)) : $$$CycL;
                                    nl_preds_string = $str_alt4$;
                                    {
                                        SubLObject cdolist_list_var = nl_preds;
                                        SubLObject item = NIL;
                                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                            nl_preds_string = cconcatenate(nl_preds_string, new SubLObject[]{ string_utilities.to_string(item), $str_alt28$_ });
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt29$cycl_expression));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if ((NIL != formula ? ((SubLObject) (string_utilities.string_subst($str_alt30$_n, Strings.make_string(ONE_INTEGER, CHAR_newline), format(NIL, $str_alt31$_S, cycl_utilities.hl_to_el(formula)), UNPROVIDED))) : $str_alt4$).isString()) {
                                        html_utilities.html_princ(NIL != formula ? ((SubLObject) (string_utilities.string_subst($str_alt30$_n, Strings.make_string(ONE_INTEGER, CHAR_newline), format(NIL, $str_alt31$_S, cycl_utilities.hl_to_el(formula)), UNPROVIDED))) : $str_alt4$);
                                    } else {
                                        html_utilities.html_prin1(NIL != formula ? ((SubLObject) (string_utilities.string_subst($str_alt30$_n, Strings.make_string(ONE_INTEGER, CHAR_newline), format(NIL, $str_alt31$_S, cycl_utilities.hl_to_el(formula)), UNPROVIDED))) : $str_alt4$);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt32$domain_mt));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (mt_string.isString()) {
                                        html_utilities.html_princ(mt_string);
                                    } else {
                                        html_utilities.html_prin1(mt_string);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($$$scriptable));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if ($$$true.isString()) {
                                        html_utilities.html_princ($$$true);
                                    } else {
                                        html_utilities.html_prin1($$$true);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt34$generation_mt));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (generation_mt_string.isString()) {
                                        html_utilities.html_princ(generation_mt_string);
                                    } else {
                                        html_utilities.html_prin1(generation_mt_string);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt35$parsing_mt));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (parsing_mt_string.isString()) {
                                        html_utilities.html_princ(parsing_mt_string);
                                    } else {
                                        html_utilities.html_prin1(parsing_mt_string);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt36$nl_preds));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (nl_preds_string.isString()) {
                                        html_utilities.html_princ(nl_preds_string);
                                    } else {
                                        html_utilities.html_prin1(nl_preds_string);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt37$is_question));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (is_question_string.isString()) {
                                        html_utilities.html_princ(is_question_string);
                                    } else {
                                        html_utilities.html_prin1(is_question_string);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt38$host_name));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (host_name_string.isString()) {
                                        html_utilities.html_princ(host_name_string);
                                    } else {
                                        html_utilities.html_prin1(host_name_string);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($$$port));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (port_string.isString()) {
                                        html_utilities.html_princ(port_string);
                                    } else {
                                        html_utilities.html_prin1(port_string);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt40$display_mode));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (display_mode_string.isString()) {
                                        html_utilities.html_princ(display_mode_string);
                                    } else {
                                        html_utilities.html_prin1(display_mode_string);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt41$app_name));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (app_name_string.isString()) {
                                        html_utilities.html_princ(app_name_string);
                                    } else {
                                        html_utilities.html_prin1(app_name_string);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt42$http_state));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (html_kernel.http_state_key_for_request().isString()) {
                                        html_utilities.html_princ(html_kernel.http_state_key_for_request());
                                    } else {
                                        html_utilities.html_prin1(html_kernel.http_state_key_for_request());
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(string_utilities.to_string($str_alt43$nl_support));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if ($$$true.isString()) {
                                        html_utilities.html_princ($$$true);
                                    } else {
                                        html_utilities.html_prin1($$$true);
                                    }
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_applet_tail$.getGlobalValue());
                    }
                }
            }
            return formula;
        }
    }

    public static final SubLObject declare_cb_gke2_applet_file() {
        declareFunction("cb_gke2_applet", "CB-GKE2-APPLET", 4, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_gke2_applet_file() {
        deflexical("*CB-GKE2-CODEBASE*", $str_alt0$_java_gke2);
        deflexical("*CB-GKE2-CLASS-FILE*", $str_alt1$com_cyc_framework_ui_gke2_GKEAppl);
        deflexical("*CB-GKE2-DEFAULT-HEIGHT*", $int$350);
        deflexical("*CB-GKE2-DEFAULT-WIDTH*", $int$650);
        return NIL;
    }

    public static final SubLObject setup_cb_gke2_applet_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_java_gke2 = makeString("/java/gke2");

    static private final SubLString $str_alt1$com_cyc_framework_ui_gke2_GKEAppl = makeString("com.cyc.framework.ui.gke2.GKEApplet");

    public static final SubLInteger $int$350 = makeInteger(350);

    public static final SubLInteger $int$650 = makeInteger(650);

    static private final SubLString $str_alt4$ = makeString("");

    static private final SubLList $list_alt5 = list(makeSymbol("&KEY"), list(makeSymbol("IS-QUESTION?"), NIL), list(makeSymbol("GENERATION-MT"), constant_handles.reader_make_constant_shell(makeString("EnglishParaphraseMt"))), list(makeSymbol("PARSING-MT"), constant_handles.reader_make_constant_shell(makeString("EnglishMt"))), list(makeSymbol("NL-PREDS"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("nonPlural-Generic")), constant_handles.reader_make_constant_shell(makeString("tensed"))))), list(makeSymbol("APPNAME"), makeString("Guided Knowledge Entry")), list(makeSymbol("HEIGHT"), makeSymbol("*CB-GKE2-DEFAULT-HEIGHT*")), list(makeSymbol("WIDTH"), makeSymbol("*CB-GKE2-DEFAULT-WIDTH*")));

    static private final SubLList $list_alt6 = list(makeKeyword("IS-QUESTION?"), makeKeyword("GENERATION-MT"), makeKeyword("PARSING-MT"), makeKeyword("NL-PREDS"), makeKeyword("APPNAME"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol $kw8$IS_QUESTION_ = makeKeyword("IS-QUESTION?");



    public static final SubLObject $$EnglishParaphraseMt = constant_handles.reader_make_constant_shell(makeString("EnglishParaphraseMt"));



    public static final SubLObject $$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));



    static private final SubLList $list_alt14 = list(constant_handles.reader_make_constant_shell(makeString("nonPlural-Generic")), constant_handles.reader_make_constant_shell(makeString("tensed")));



    static private final SubLString $$$Guided_Knowledge_Entry = makeString("Guided Knowledge Entry");





    static private final SubLString $$$gke2 = makeString("gke2");

    static private final SubLString $str_alt20$100_ = makeString("100%");

    static private final SubLString $$$true = makeString("true");

    static private final SubLString $$$false = makeString("false");

    private static final SubLSymbol $UNCONSTRAINED_CYCL = makeKeyword("UNCONSTRAINED-CYCL");

    static private final SubLString $$$Unconstrained_CycL = makeString("Unconstrained CycL");



    static private final SubLString $$$English = makeString("English");

    static private final SubLString $$$CycL = makeString("CycL");

    static private final SubLString $str_alt28$_ = makeString(" ");

    static private final SubLString $str_alt29$cycl_expression = makeString("cycl_expression");

    static private final SubLString $str_alt30$_n = makeString("\\n");

    static private final SubLString $str_alt31$_S = makeString("~S");

    static private final SubLString $str_alt32$domain_mt = makeString("domain_mt");

    static private final SubLString $$$scriptable = makeString("scriptable");

    static private final SubLString $str_alt34$generation_mt = makeString("generation_mt");

    static private final SubLString $str_alt35$parsing_mt = makeString("parsing_mt");

    static private final SubLString $str_alt36$nl_preds = makeString("nl_preds");

    static private final SubLString $str_alt37$is_question = makeString("is_question");

    static private final SubLString $str_alt38$host_name = makeString("host_name");

    static private final SubLString $$$port = makeString("port");

    static private final SubLString $str_alt40$display_mode = makeString("display_mode");

    static private final SubLString $str_alt41$app_name = makeString("app_name");

    static private final SubLString $str_alt42$http_state = makeString("http_state");

    static private final SubLString $str_alt43$nl_support = makeString("nl_support");

    // // Initializers
    public void declareFunctions() {
        declare_cb_gke2_applet_file();
    }

    public void initializeVariables() {
        init_cb_gke2_applet_file();
    }

    public void runTopLevelForms() {
        setup_cb_gke2_applet_file();
    }
}

