package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_java_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new cb_java_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.cb_java_utilities";

    public static final String myFingerPrint = "01487c5d8695cdfaa99211fdd6cf5b77db938df9db085326f3fbdb3be4f89970";

    // defparameter
    public static final SubLSymbol $cb_java_applet_tunnel_active$ = makeSymbol("*CB-JAVA-APPLET-TUNNEL-ACTIVE*");

    // defparameter
    public static final SubLSymbol $cb_java_applet_tunnel_logins$ = makeSymbol("*CB-JAVA-APPLET-TUNNEL-LOGINS*");

    // defparameter
    public static final SubLSymbol $cb_java_applet_tunnel_exposed_host$ = makeSymbol("*CB-JAVA-APPLET-TUNNEL-EXPOSED-HOST*");

    // defparameter
    public static final SubLSymbol $cb_java_applet_tunnel_exposed_port$ = makeSymbol("*CB-JAVA-APPLET-TUNNEL-EXPOSED-PORT*");

    private static final SubLString $str0$_ = makeString(",");

    private static final SubLList $list1 = list(makeSymbol("COMMAND"), makeSymbol("VALUE"));

    public static final SubLString $str2$_ = makeString("=");





    private static final SubLString $str5$ = makeString("");

    private static final SubLInteger $int$9096 = makeInteger(9096);

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLString $$$hiddenHost = makeString("hiddenHost");

    private static final SubLString $$$hiddenPort = makeString("hiddenPort");

    private static final SubLString $$$exposedHost = makeString("exposedHost");

    private static final SubLString $$$exposedPort = makeString("exposedPort");

    private static final SubLString $$$login = makeString("login");

    private static final SubLString $$$password = makeString("password");

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

    public static SubLObject cb_java_applet_tunnel_gen_token() {
        return random.random(expt(TWO_INTEGER, $int$30));
    }

    public static SubLObject cb_java_applet_tunnel_create_login() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user = cb_java_applet_tunnel_gen_token();
        final SubLObject pass = cb_java_applet_tunnel_gen_token();
        sethash(user, $cb_java_applet_tunnel_logins$.getDynamicValue(thread), pass);
        return list(user, pass);
    }

    public static SubLObject tunnel_login_username(final SubLObject tunnel_login) {
        return tunnel_login.first();
    }

    public static SubLObject tunnel_login_password(final SubLObject tunnel_login) {
        return second(tunnel_login);
    }

    public static SubLObject cb_java_applet_tunnel_test_login(final SubLObject user, final SubLObject pass) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject val = gethash(user, $cb_java_applet_tunnel_logins$.getDynamicValue(thread), UNPROVIDED);
        return makeBoolean((NIL != pass) && pass.equalp(val));
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
        declareFunction(me, "cb_java_applet_construct_window_options", "CB-JAVA-APPLET-CONSTRUCT-WINDOW-OPTIONS", 1, 0, false);
        declareFunction(me, "cb_java_applet_convert_to_option_string", "CB-JAVA-APPLET-CONVERT-TO-OPTION-STRING", 1, 0, false);
        declareFunction(me, "cb_java_applet_tunnel_gen_token", "CB-JAVA-APPLET-TUNNEL-GEN-TOKEN", 0, 0, false);
        declareFunction(me, "cb_java_applet_tunnel_create_login", "CB-JAVA-APPLET-TUNNEL-CREATE-LOGIN", 0, 0, false);
        declareFunction(me, "tunnel_login_username", "TUNNEL-LOGIN-USERNAME", 1, 0, false);
        declareFunction(me, "tunnel_login_password", "TUNNEL-LOGIN-PASSWORD", 1, 0, false);
        declareFunction(me, "cb_java_applet_tunnel_test_login", "CB-JAVA-APPLET-TUNNEL-TEST-LOGIN", 2, 0, false);
        declareFunction(me, "cb_java_applet_tunnel_params", "CB-JAVA-APPLET-TUNNEL-PARAMS", 2, 2, false);
        return NIL;
    }

    public static SubLObject init_cb_java_utilities_file() {
        defparameter("*CB-JAVA-APPLET-TUNNEL-ACTIVE*", NIL);
        defparameter("*CB-JAVA-APPLET-TUNNEL-LOGINS*", make_hash_table($int$512, EQUALP, UNPROVIDED));
        defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-HOST*", $str5$);
        defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-PORT*", $int$9096);
        return NIL;
    }

    public static SubLObject setup_cb_java_utilities_file() {
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

    
}

/**
 * Total time: 89 ms
 */
