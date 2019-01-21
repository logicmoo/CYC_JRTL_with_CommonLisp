package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_java_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_java_utilities";
    public static final String myFingerPrint = "01487c5d8695cdfaa99211fdd6cf5b77db938df9db085326f3fbdb3be4f89970";
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2152L)
    public static SubLSymbol $cb_java_applet_tunnel_active$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2325L)
    public static SubLSymbol $cb_java_applet_tunnel_logins$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2411L)
    public static SubLSymbol $cb_java_applet_tunnel_exposed_host$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2540L)
    public static SubLSymbol $cb_java_applet_tunnel_exposed_port$;
    private static final SubLString $str0$_;
    private static final SubLList $list1;
    private static final SubLString $str2$_;
    private static final SubLSymbol $sym3$CCONCATENATE;
    private static final SubLInteger $int4$512;
    private static final SubLString $str5$;
    private static final SubLInteger $int6$9096;
    private static final SubLInteger $int7$30;
    private static final SubLString $str8$hiddenHost;
    private static final SubLString $str9$hiddenPort;
    private static final SubLString $str10$exposedHost;
    private static final SubLString $str11$exposedPort;
    private static final SubLString $str12$login;
    private static final SubLString $str13$password;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 849L)
    public static SubLObject cb_java_applet_construct_window_options(final SubLObject options) {
        SubLObject pieces = (SubLObject)cb_java_utilities.NIL;
        SubLObject cdolist_list_var = options;
        SubLObject option = (SubLObject)cb_java_utilities.NIL;
        option = cdolist_list_var.first();
        while (cb_java_utilities.NIL != cdolist_list_var) {
            pieces = (SubLObject)ConsesLow.cons((SubLObject)cb_java_utilities.$str0$_, pieces);
            SubLObject current;
            final SubLObject datum = current = option;
            SubLObject command = (SubLObject)cb_java_utilities.NIL;
            SubLObject value = (SubLObject)cb_java_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_java_utilities.$list1);
            command = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_java_utilities.$list1);
            value = current.first();
            current = current.rest();
            if (cb_java_utilities.NIL == current) {
                final SubLObject command_string = cb_java_applet_convert_to_option_string(command);
                final SubLObject value_string = cb_java_applet_convert_to_option_string(value);
                pieces = (SubLObject)ConsesLow.cons(command_string, pieces);
                pieces = (SubLObject)ConsesLow.cons((SubLObject)cb_java_utilities.$str2$_, pieces);
                pieces = (SubLObject)ConsesLow.cons(value_string, pieces);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_java_utilities.$list1);
            }
            cdolist_list_var = cdolist_list_var.rest();
            option = cdolist_list_var.first();
        }
        pieces = Sequences.nreverse(pieces);
        pieces = pieces.rest();
        return Functions.apply((SubLObject)cb_java_utilities.$sym3$CCONCATENATE, pieces);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 1811L)
    public static SubLObject cb_java_applet_convert_to_option_string(final SubLObject v_object) {
        SubLObject rc = (SubLObject)cb_java_utilities.NIL;
        if (v_object.isNumber()) {
            rc = string_utilities.to_string(v_object);
        }
        else if (v_object.isSymbol()) {
            rc = Strings.string_downcase(Symbols.symbol_name(v_object), (SubLObject)cb_java_utilities.UNPROVIDED, (SubLObject)cb_java_utilities.UNPROVIDED);
        }
        else if (v_object.isString()) {
            rc = v_object;
        }
        else {
            rc = string_utilities.to_string(v_object);
        }
        return rc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2607L)
    public static SubLObject cb_java_applet_tunnel_gen_token() {
        return random.random(Numbers.expt((SubLObject)cb_java_utilities.TWO_INTEGER, (SubLObject)cb_java_utilities.$int7$30));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2711L)
    public static SubLObject cb_java_applet_tunnel_create_login() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user = cb_java_applet_tunnel_gen_token();
        final SubLObject pass = cb_java_applet_tunnel_gen_token();
        Hashtables.sethash(user, cb_java_utilities.$cb_java_applet_tunnel_logins$.getDynamicValue(thread), pass);
        return (SubLObject)ConsesLow.list(user, pass);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2943L)
    public static SubLObject tunnel_login_username(final SubLObject tunnel_login) {
        return tunnel_login.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 3027L)
    public static SubLObject tunnel_login_password(final SubLObject tunnel_login) {
        return conses_high.second(tunnel_login);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 3112L)
    public static SubLObject cb_java_applet_tunnel_test_login(final SubLObject user, final SubLObject pass) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject val = Hashtables.gethash(user, cb_java_utilities.$cb_java_applet_tunnel_logins$.getDynamicValue(thread), (SubLObject)cb_java_utilities.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_java_utilities.NIL != pass && pass.equalp(val));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 3417L)
    public static SubLObject cb_java_applet_tunnel_params(final SubLObject host, final SubLObject port, SubLObject tunnel_host, SubLObject tunnel_port) {
        if (tunnel_host == cb_java_utilities.UNPROVIDED) {
            tunnel_host = cb_java_utilities.$cb_java_applet_tunnel_exposed_host$.getDynamicValue();
        }
        if (tunnel_port == cb_java_utilities.UNPROVIDED) {
            tunnel_port = cb_java_utilities.$cb_java_applet_tunnel_exposed_port$.getDynamicValue();
        }
        final SubLObject tunnel_login = cb_java_applet_tunnel_create_login();
        final SubLObject tunnel_login_username = tunnel_login_username(tunnel_login);
        final SubLObject tunnel_login_password = tunnel_login_password(tunnel_login);
        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_java_utilities.$str8$hiddenHost);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(host);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_java_utilities.$str9$hiddenPort);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(port);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_java_utilities.$str10$exposedHost);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(tunnel_host);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_java_utilities.$str11$exposedPort);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(tunnel_port);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_java_utilities.$str12$login);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(tunnel_login_username);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_java_utilities.$str13$password);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_markup(tunnel_login_password);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_java_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_java_utilities.UNPROVIDED);
        return (SubLObject)cb_java_utilities.NIL;
    }
    
    public static SubLObject declare_cb_java_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_java_utilities", "cb_java_applet_construct_window_options", "CB-JAVA-APPLET-CONSTRUCT-WINDOW-OPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_java_utilities", "cb_java_applet_convert_to_option_string", "CB-JAVA-APPLET-CONVERT-TO-OPTION-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_java_utilities", "cb_java_applet_tunnel_gen_token", "CB-JAVA-APPLET-TUNNEL-GEN-TOKEN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_java_utilities", "cb_java_applet_tunnel_create_login", "CB-JAVA-APPLET-TUNNEL-CREATE-LOGIN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_java_utilities", "tunnel_login_username", "TUNNEL-LOGIN-USERNAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_java_utilities", "tunnel_login_password", "TUNNEL-LOGIN-PASSWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_java_utilities", "cb_java_applet_tunnel_test_login", "CB-JAVA-APPLET-TUNNEL-TEST-LOGIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_java_utilities", "cb_java_applet_tunnel_params", "CB-JAVA-APPLET-TUNNEL-PARAMS", 2, 2, false);
        return (SubLObject)cb_java_utilities.NIL;
    }
    
    public static SubLObject init_cb_java_utilities_file() {
        cb_java_utilities.$cb_java_applet_tunnel_active$ = SubLFiles.defparameter("*CB-JAVA-APPLET-TUNNEL-ACTIVE*", (SubLObject)cb_java_utilities.NIL);
        cb_java_utilities.$cb_java_applet_tunnel_logins$ = SubLFiles.defparameter("*CB-JAVA-APPLET-TUNNEL-LOGINS*", Hashtables.make_hash_table((SubLObject)cb_java_utilities.$int4$512, (SubLObject)cb_java_utilities.EQUALP, (SubLObject)cb_java_utilities.UNPROVIDED));
        cb_java_utilities.$cb_java_applet_tunnel_exposed_host$ = SubLFiles.defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-HOST*", (SubLObject)cb_java_utilities.$str5$);
        cb_java_utilities.$cb_java_applet_tunnel_exposed_port$ = SubLFiles.defparameter("*CB-JAVA-APPLET-TUNNEL-EXPOSED-PORT*", (SubLObject)cb_java_utilities.$int6$9096);
        return (SubLObject)cb_java_utilities.NIL;
    }
    
    public static SubLObject setup_cb_java_utilities_file() {
        return (SubLObject)cb_java_utilities.NIL;
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
        me = (SubLFile)new cb_java_utilities();
        cb_java_utilities.$cb_java_applet_tunnel_active$ = null;
        cb_java_utilities.$cb_java_applet_tunnel_logins$ = null;
        cb_java_utilities.$cb_java_applet_tunnel_exposed_host$ = null;
        cb_java_utilities.$cb_java_applet_tunnel_exposed_port$ = null;
        $str0$_ = SubLObjectFactory.makeString(",");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMMAND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str2$_ = SubLObjectFactory.makeString("=");
        $sym3$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $int4$512 = SubLObjectFactory.makeInteger(512);
        $str5$ = SubLObjectFactory.makeString("");
        $int6$9096 = SubLObjectFactory.makeInteger(9096);
        $int7$30 = SubLObjectFactory.makeInteger(30);
        $str8$hiddenHost = SubLObjectFactory.makeString("hiddenHost");
        $str9$hiddenPort = SubLObjectFactory.makeString("hiddenPort");
        $str10$exposedHost = SubLObjectFactory.makeString("exposedHost");
        $str11$exposedPort = SubLObjectFactory.makeString("exposedPort");
        $str12$login = SubLObjectFactory.makeString("login");
        $str13$password = SubLObjectFactory.makeString("password");
    }
}

/*

	Total time: 89 ms
	
*/