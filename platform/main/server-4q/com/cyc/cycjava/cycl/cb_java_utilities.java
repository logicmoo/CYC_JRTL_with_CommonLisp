/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-JAVA-UTILITIES
 * source file: /cyc/top/cycl/cb-java-utilities.lisp
 * created:     2019/07/03 17:38:03
 */
public final class cb_java_utilities extends SubLTranslatedFile implements V12 {
    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $cb_java_mode$ = makeSymbol("*CB-JAVA-MODE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_java_applet_resize_script$ = makeSymbol("*CB-JAVA-APPLET-RESIZE-SCRIPT*");

    public static final SubLFile me = new cb_java_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.cb_java_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_java_applet_tunnel_active$ = makeSymbol("*CB-JAVA-APPLET-TUNNEL-ACTIVE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_java_applet_tunnel_logins$ = makeSymbol("*CB-JAVA-APPLET-TUNNEL-LOGINS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_java_applet_tunnel_exposed_host$ = makeSymbol("*CB-JAVA-APPLET-TUNNEL-EXPOSED-HOST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_java_applet_tunnel_exposed_port$ = makeSymbol("*CB-JAVA-APPLET-TUNNEL-EXPOSED-PORT*");

    private static final SubLString $str0$_ = makeString(",");

    private static final SubLList $list1 = list(makeSymbol("COMMAND"), makeSymbol("VALUE"));

    static private final SubLString $str2$_ = makeString("=");

    private static final SubLString $str5$ = makeString("");

    private static final SubLInteger $int$9096 = makeInteger(9096);



    private static final SubLString $$$hiddenHost = makeString("hiddenHost");

    private static final SubLString $$$hiddenPort = makeString("hiddenPort");

    private static final SubLString $$$exposedHost = makeString("exposedHost");

    private static final SubLString $$$exposedPort = makeString("exposedPort");

    private static final SubLString $$$login = makeString("login");

    private static final SubLString $$$password = makeString("password");

    public static final SubLObject cb_java_applet_construct_window_options_alt(SubLObject options) {
        {
            SubLObject pieces = NIL;
            SubLObject cdolist_list_var = options;
            SubLObject option = NIL;
            for (option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , option = cdolist_list_var.first()) {
                pieces = cons($str_alt2$_, pieces);
                {
                    SubLObject datum = option;
                    SubLObject current = datum;
                    SubLObject command = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    command = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject command_string = com.cyc.cycjava.cycl.cb_java_utilities.cb_java_applet_convert_to_option_string(command);
                            SubLObject value_string = com.cyc.cycjava.cycl.cb_java_utilities.cb_java_applet_convert_to_option_string(value);
                            pieces = cons(command_string, pieces);
                            pieces = cons($str_alt4$_, pieces);
                            pieces = cons(value_string, pieces);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
            pieces = nreverse(pieces);
            pieces = pieces.rest();
            return apply(CCONCATENATE, pieces);
        }
    }

    public static SubLObject cb_java_applet_construct_window_options(final SubLObject options) {
        SubLObject pieces = NIL;
        SubLObject cdolist_list_var = options;
        SubLObject option = NIL;
        option = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pieces = cons($str0$_, pieces);
            SubLObject current;
            final SubLObject datum = current = option;
            SubLObject command = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list1);
            command = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list1);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject command_string = cb_java_applet_convert_to_option_string(command);
                final SubLObject value_string = cb_java_applet_convert_to_option_string(value);
                pieces = cons(command_string, pieces);
                pieces = cons($str2$_, pieces);
                pieces = cons(value_string, pieces);
            } else {
                cdestructuring_bind_error(datum, $list1);
            }
            cdolist_list_var = cdolist_list_var.rest();
            option = cdolist_list_var.first();
        } 
        pieces = nreverse(pieces);
        pieces = pieces.rest();
        return apply(CCONCATENATE, pieces);
    }

    public static final SubLObject cb_java_applet_convert_to_option_string_alt(SubLObject v_object) {
        {
            SubLObject rc = NIL;
            if (v_object.isNumber()) {
                rc = string_utilities.to_string(v_object);
            } else {
                if (v_object.isSymbol()) {
                    rc = Strings.string_downcase(symbol_name(v_object), UNPROVIDED, UNPROVIDED);
                } else {
                    if (v_object.isString()) {
                        rc = v_object;
                    } else {
                        rc = string_utilities.to_string(v_object);
                    }
                }
            }
            return rc;
        }
    }

    public static SubLObject cb_java_applet_convert_to_option_string(final SubLObject v_object) {
        SubLObject rc = NIL;
        if (v_object.isNumber()) {
            rc = string_utilities.to_string(v_object);
        } else
            if (v_object.isSymbol()) {
                rc = Strings.string_downcase(symbol_name(v_object), UNPROVIDED, UNPROVIDED);
            } else
                if (v_object.isString()) {
                    rc = v_object;
                } else {
                    rc = string_utilities.to_string(v_object);
                }


        return rc;
    }

    public static final SubLObject cb_java_applet_tunnel_gen_token_alt() {
        return random.random(expt(TWO_INTEGER, $int$32));
    }

    public static SubLObject cb_java_applet_tunnel_gen_token() {
        return random.random(expt(TWO_INTEGER, $int$30));
    }

    public static final SubLObject cb_java_applet_tunnel_create_login_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user = com.cyc.cycjava.cycl.cb_java_utilities.cb_java_applet_tunnel_gen_token();
                SubLObject pass = com.cyc.cycjava.cycl.cb_java_utilities.cb_java_applet_tunnel_gen_token();
                sethash(user, $cb_java_applet_tunnel_logins$.getDynamicValue(thread), pass);
                return list(user, pass);
            }
        }
    }

    public static SubLObject cb_java_applet_tunnel_create_login() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user = cb_java_applet_tunnel_gen_token();
        final SubLObject pass = cb_java_applet_tunnel_gen_token();
        sethash(user, $cb_java_applet_tunnel_logins$.getDynamicValue(thread), pass);
        return list(user, pass);
    }

    public static final SubLObject tunnel_login_username_alt(SubLObject tunnel_login) {
        return tunnel_login.first();
    }

    public static SubLObject tunnel_login_username(final SubLObject tunnel_login) {
        return tunnel_login.first();
    }

    public static final SubLObject tunnel_login_password_alt(SubLObject tunnel_login) {
        return second(tunnel_login);
    }

    public static SubLObject tunnel_login_password(final SubLObject tunnel_login) {
        return second(tunnel_login);
    }

    public static final SubLObject cb_java_applet_tunnel_test_login_alt(SubLObject user, SubLObject pass) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject val = gethash(user, $cb_java_applet_tunnel_logins$.getDynamicValue(thread), UNPROVIDED);
                return makeBoolean((NIL != pass) && pass.equalp(val));
            }
        }
    }

    public static SubLObject cb_java_applet_tunnel_test_login(final SubLObject user, final SubLObject pass) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject val = gethash(user, $cb_java_applet_tunnel_logins$.getDynamicValue(thread), UNPROVIDED);
        return makeBoolean((NIL != pass) && pass.equalp(val));
    }

    public static final SubLObject cb_java_applet_tunnel_params_alt(SubLObject host, SubLObject port, SubLObject tunnel_host, SubLObject tunnel_port) {
        if (tunnel_host == UNPROVIDED) {
            tunnel_host = $cb_java_applet_tunnel_exposed_host$.getDynamicValue();
        }
        if (tunnel_port == UNPROVIDED) {
            tunnel_port = $cb_java_applet_tunnel_exposed_port$.getDynamicValue();
        }
        {
            SubLObject tunnel_login = com.cyc.cycjava.cycl.cb_java_utilities.cb_java_applet_tunnel_create_login();
            SubLObject tunnel_login_username = com.cyc.cycjava.cycl.cb_java_utilities.tunnel_login_username(tunnel_login);
            SubLObject tunnel_login_password = com.cyc.cycjava.cycl.cb_java_utilities.tunnel_login_password(tunnel_login);
            html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$hiddenHost);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(host);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$hiddenPort);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(port);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$exposedHost);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(tunnel_host);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$exposedPort);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(tunnel_port);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$login);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(tunnel_login_username);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$password);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(tunnel_login_password);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_java_applet_tunnel_params(final SubLObject host, final SubLObject port, SubLObject tunnel_host, SubLObject tunnel_port) {
        if (tunnel_host == UNPROVIDED) {
            tunnel_host = $cb_java_applet_tunnel_exposed_host$.getDynamicValue();
        }
        if (tunnel_port == UNPROVIDED) {
            tunnel_port = $cb_java_applet_tunnel_exposed_port$.getDynamicValue();
        }
        final SubLObject tunnel_login = cb_java_applet_tunnel_create_login();
        final SubLObject tunnel_login_username = tunnel_login_username(tunnel_login);
        final SubLObject tunnel_login_password = tunnel_login_password(tunnel_login);
        html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$hiddenHost);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(host);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$hiddenPort);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(port);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$exposedHost);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(tunnel_host);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$exposedPort);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(tunnel_port);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$login);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(tunnel_login_username);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$password);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(tunnel_login_password);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_cb_java_utilities_file() {
        declareFunction("cb_java_applet_construct_window_options", "CB-JAVA-APPLET-CONSTRUCT-WINDOW-OPTIONS", 1, 0, false);
        declareFunction("cb_java_applet_convert_to_option_string", "CB-JAVA-APPLET-CONVERT-TO-OPTION-STRING", 1, 0, false);
        declareFunction("cb_java_applet_tunnel_gen_token", "CB-JAVA-APPLET-TUNNEL-GEN-TOKEN", 0, 0, false);
        declareFunction("cb_java_applet_tunnel_create_login", "CB-JAVA-APPLET-TUNNEL-CREATE-LOGIN", 0, 0, false);
        declareFunction("tunnel_login_username", "TUNNEL-LOGIN-USERNAME", 1, 0, false);
        declareFunction("tunnel_login_password", "TUNNEL-LOGIN-PASSWORD", 1, 0, false);
        declareFunction("cb_java_applet_tunnel_test_login", "CB-JAVA-APPLET-TUNNEL-TEST-LOGIN", 2, 0, false);
        declareFunction("cb_java_applet_tunnel_params", "CB-JAVA-APPLET-TUNNEL-PARAMS", 2, 2, false);
        return NIL;
    }

    public static final SubLObject init_cb_java_utilities_file_alt() {
        defparameter("*CB-JAVA-MODE*", T);
        deflexical("*CB-JAVA-APPLET-RESIZE-SCRIPT*", $str_alt1$_javascript_applet_resize_js);
        defparameter("*CB-JAVA-APPLET-TUNNEL-ACTIVE*", NIL);
        defparameter("*CB-JAVA-APPLET-TUNNEL-LOGINS*", make_hash_table($int$512, EQUALP, UNPROVIDED));
        defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-HOST*", $str_alt7$proton_cyc_com);
        defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-PORT*", $int$9096);
        return NIL;
    }

    public static SubLObject init_cb_java_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CB-JAVA-APPLET-TUNNEL-ACTIVE*", NIL);
            defparameter("*CB-JAVA-APPLET-TUNNEL-LOGINS*", make_hash_table($int$512, EQUALP, UNPROVIDED));
            defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-HOST*", $str5$);
            defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-PORT*", $int$9096);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*CB-JAVA-MODE*", T);
            deflexical("*CB-JAVA-APPLET-RESIZE-SCRIPT*", $str_alt1$_javascript_applet_resize_js);
            defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-HOST*", $str_alt7$proton_cyc_com);
        }
        return NIL;
    }

    public static SubLObject init_cb_java_utilities_file_Previous() {
        defparameter("*CB-JAVA-APPLET-TUNNEL-ACTIVE*", NIL);
        defparameter("*CB-JAVA-APPLET-TUNNEL-LOGINS*", make_hash_table($int$512, EQUALP, UNPROVIDED));
        defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-HOST*", $str5$);
        defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-PORT*", $int$9096);
        return NIL;
    }

    public static final SubLObject setup_cb_java_utilities_file_alt() {
        register_html_state_variable($cb_java_mode$);
        register_html_interface_variable($cb_java_mode$);
        return NIL;
    }

    public static SubLObject setup_cb_java_utilities_file() {
        if (SubLFiles.USE_V1) {
        }
        if (SubLFiles.USE_V2) {
            register_html_state_variable($cb_java_mode$);
            register_html_interface_variable($cb_java_mode$);
        }
        return NIL;
    }

    public static SubLObject setup_cb_java_utilities_file_Previous() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_java_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_java_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_java_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt1$_javascript_applet_resize_js = makeString("/javascript/applet-resize.js");

    static private final SubLString $str_alt2$_ = makeString(",");

    static private final SubLList $list_alt3 = list(makeSymbol("COMMAND"), makeSymbol("VALUE"));

    static private final SubLString $str_alt4$_ = makeString("=");

    static private final SubLString $str_alt7$proton_cyc_com = makeString("proton.cyc.com");
}

/**
 * Total time: 89 ms
 */
