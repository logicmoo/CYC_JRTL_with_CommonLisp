package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
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
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
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


public final class cb_uia_forwarding extends SubLTranslatedFile {
    public static final SubLFile me = new cb_uia_forwarding();

    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_forwarding";

    public static final String myFingerPrint = "8b9d81308d84621cc60b22e15899ce1a37a3b5ddea59b2e84c0b53776718691b";





    // Internal Constants
    public static final SubLString $str0$_Forwarding_ = makeString("[Forwarding]");

    public static final SubLString $str1$cb_uia_forwarding_handler = makeString("cb-uia-forwarding-handler");

    private static final SubLSymbol $CB_UIA_FORWARDING = makeKeyword("CB-UIA-FORWARDING");

    public static final SubLSymbol CB_LINK_CB_UIA_FORWARDING = makeSymbol("CB-LINK-CB-UIA-FORWARDING");



    public static final SubLString $$$Forwarding = makeString("Forwarding");

    public static final SubLString $str6$Specify_forwarding_port_that_conn = makeString("Specify forwarding port that connnects to Cyc server.");



    public static final SubLSymbol CB_LINK_UIA_FORWARDING = makeSymbol("CB-LINK-UIA-FORWARDING");

    public static final SubLSymbol $forwarding_machine_name$ = makeSymbol("*FORWARDING-MACHINE-NAME*");

    public static final SubLString $$$unknown = makeString("unknown");

    public static final SubLSymbol $forwarding_base_port$ = makeSymbol("*FORWARDING-BASE-PORT*");

    public static final SubLString $$$Set_forwarding_descriptor = makeString("Set forwarding descriptor");

    public static final SubLSymbol SET_FORWARDING_MACHINE_NAME_AND_BASE_PORT_INTERNAL = makeSymbol("SET-FORWARDING-MACHINE-NAME-AND-BASE-PORT-INTERNAL");

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLString $str15$forwarding_machine = makeString("forwarding-machine");

    public static final SubLString $str16$forwarding_port = makeString("forwarding-port");

    public static final SubLString $$$global = makeString("global");

    private static final SubLString $str18$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str19$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");



    private static final SubLString $$$Set_Forwarding_Parameters = makeString("Set Forwarding Parameters");

    private static final SubLString $str22$Machine__ = makeString("Machine: ");

    private static final SubLString $str23$Port__ = makeString("Port: ");

    private static final SubLSymbol CB_UIA_HANDLE_FORWARDING_INFO = makeSymbol("CB-UIA-HANDLE-FORWARDING-INFO");



    private static final SubLSymbol CB_UIA_HANDLE_FORWARDING_DEFAULT_INFO = makeSymbol("CB-UIA-HANDLE-FORWARDING-DEFAULT-INFO");

    private static final SubLString $$$Forwarding_Parameters = makeString("Forwarding Parameters");

    private static final SubLString $str28$cb_uia_handle_forwarding_info = makeString("cb-uia-handle-forwarding-info");

    private static final SubLString $str29$_Specify_the_machine_name_and_bas = makeString(" Specify the machine name and base port number that will be doing the forwarding to the Cyc server (or the Cyc server machine itself and the server's base port number if not port forwarding).");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $str31$Base_Port__ = makeString("Base Port: ");

    private static final SubLString $str32$Set_for_all_users__including_Java = makeString("Set for all users, including Java applications?  ");

    private static final SubLString $str33$Beware_of_using_this_option_on_sh = makeString("Beware of using this option on shared images.");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $str35$cb_uia_handle_forwarding_default_ = makeString("cb-uia-handle-forwarding-default-info");

    private static final SubLString $$$Default = makeString("Default");

    private static final SubLSymbol CB_UIA_FORWARDING_HANDLER = makeSymbol("CB-UIA-FORWARDING-HANDLER");

    private static final SubLSymbol WITH_MACHINE_AND_BASE_PORT_FORWARDING = makeSymbol("WITH-MACHINE-AND-BASE-PORT-FORWARDING");

    private static final SubLList $list39 = list(list(makeSymbol("&KEY"), list(makeSymbol("MACHINE"), makeString("localhost")), list(makeSymbol("BASE-PORT"), makeInteger(3600))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list40 = list(makeKeyword("MACHINE"), makeKeyword("BASE-PORT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLString $$$localhost = makeString("localhost");



    private static final SubLInteger $int$3600 = makeInteger(3600);



    public static SubLObject cb_link_cb_uia_forwarding(SubLObject target, SubLObject linktext) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str0$_Forwarding_;
        }
        final SubLObject frame_name_var = cb_frame_name(target);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str1$cb_uia_forwarding_handler);
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

    public static SubLObject cb_link_uia_forwarding(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        return cb_link($CB_UIA_FORWARDING, $MAIN, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_forwarding_machine_name() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $forwarding_machine_name$.getDynamicValue(thread)) {
            $forwarding_machine_name$.setDynamicValue(Environment.get_network_name(Environment.get_machine_name($$$unknown)), thread);
        }
        return $forwarding_machine_name$.getDynamicValue(thread);
    }

    public static SubLObject get_forwarding_base_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $forwarding_base_port$.getDynamicValue(thread)) {
            $forwarding_base_port$.setDynamicValue(system_parameters.$base_tcp_port$.getDynamicValue(thread), thread);
        }
        return $forwarding_base_port$.getDynamicValue(thread);
    }

    public static SubLObject set_forwarding_machine_name_and_base_port(final SubLObject machine, final SubLObject port, final SubLObject globalP) {
        if (NIL != globalP) {
            subl_promotions.make_process_with_args($$$Set_forwarding_descriptor, SET_FORWARDING_MACHINE_NAME_AND_BASE_PORT_INTERNAL, list(machine, port));
        }
        set_forwarding_machine_name_and_base_port_internal(machine, port);
        return NIL;
    }

    public static SubLObject set_forwarding_machine_name_and_base_port_internal(final SubLObject machine, final SubLObject port) {
        $forwarding_machine_name$.setDynamicValue(machine);
        $forwarding_base_port$.setDynamicValue(port);
        return NIL;
    }

    public static SubLObject cb_uia_handle_forwarding_info(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject machine = Strings.string_trim($$$_, html_extract_input($str15$forwarding_machine, args));
        final SubLObject port = string_utilities.string_to_integer(html_extract_input($str16$forwarding_port, args));
        final SubLObject global = list_utilities.sublisp_boolean(html_extract_input($$$global, args));
        set_forwarding_machine_name_and_base_port(machine, port, global);
        html_markup($str18$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str19$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(ONE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($$$Set_Forwarding_Parameters);
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(ONE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(FOUR_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($str22$Machine__);
            html_princ(string_utilities.to_string(machine));
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(FOUR_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(FOUR_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($str23$Port__);
            html_princ(string_utilities.to_string(port));
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(FOUR_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_uia_handle_forwarding_default_info(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $forwarding_machine_name$.setDynamicValue(Environment.get_network_name(Environment.get_machine_name($$$unknown)), thread);
        $forwarding_base_port$.setDynamicValue(system_parameters.$base_tcp_port$.getDynamicValue(thread), thread);
        return cb_uia_forwarding_handler(args);
    }

    public static SubLObject cb_uia_forwarding_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str18$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str19$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(ONE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($$$Forwarding_Parameters);
            html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_macros.$within_html_form$.bind(T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_hidden_input($str28$cb_uia_handle_forwarding_info, T, UNPROVIDED);
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(FOUR_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_princ($str29$_Specify_the_machine_name_and_bas);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(FOUR_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_markup(FIVE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ($str22$Machine__);
                html_newline(UNPROVIDED);
                html_text_input($str15$forwarding_machine, get_forwarding_machine_name(), $int$40);
                html_newline(UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ($str31$Base_Port__);
                html_newline(UNPROVIDED);
                html_text_input($str16$forwarding_port, get_forwarding_base_port(), $int$40);
                html_newline(UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ($str32$Set_for_all_users__including_Java);
                html_newline(UNPROVIDED);
                html_checkbox_input($$$global, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_princ($str33$Beware_of_using_this_option_on_sh);
                html_newline(UNPROVIDED);
                html_newline(UNPROVIDED);
                html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_markup(FIVE_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            } finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_form_tail$.getGlobalValue());
            html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
            _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_macros.$within_html_form$.bind(T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_hidden_input($str35$cb_uia_handle_forwarding_default_, T, UNPROVIDED);
                html_submit_input($$$Default, UNPROVIDED, UNPROVIDED);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            } finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
            }
            html_markup(html_macros.$html_form_tail$.getGlobalValue());
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(ONE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject with_machine_and_base_port_forwarding(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list39);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list39);
            if (NIL == member(current_$3, $list40, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list39);
        }
        final SubLObject machine_tail = property_list_member($MACHINE, current);
        final SubLObject machine = (NIL != machine_tail) ? cadr(machine_tail) : $$$localhost;
        final SubLObject base_port_tail = property_list_member($BASE_PORT, current);
        final SubLObject base_port = (NIL != base_port_tail) ? cadr(base_port_tail) : $int$3600;
        final SubLObject body;
        current = body = temp;
        return listS(CLET, list(list($forwarding_machine_name$, machine), list($forwarding_base_port$, base_port)), append(body, NIL));
    }

    public static SubLObject declare_cb_uia_forwarding_file() {
        declareFunction(me, "cb_link_cb_uia_forwarding", "CB-LINK-CB-UIA-FORWARDING", 0, 2, false);
        declareFunction(me, "cb_link_uia_forwarding", "CB-LINK-UIA-FORWARDING", 0, 1, false);
        declareFunction(me, "get_forwarding_machine_name", "GET-FORWARDING-MACHINE-NAME", 0, 0, false);
        declareFunction(me, "get_forwarding_base_port", "GET-FORWARDING-BASE-PORT", 0, 0, false);
        declareFunction(me, "set_forwarding_machine_name_and_base_port", "SET-FORWARDING-MACHINE-NAME-AND-BASE-PORT", 3, 0, false);
        declareFunction(me, "set_forwarding_machine_name_and_base_port_internal", "SET-FORWARDING-MACHINE-NAME-AND-BASE-PORT-INTERNAL", 2, 0, false);
        declareFunction(me, "cb_uia_handle_forwarding_info", "CB-UIA-HANDLE-FORWARDING-INFO", 1, 0, false);
        declareFunction(me, "cb_uia_handle_forwarding_default_info", "CB-UIA-HANDLE-FORWARDING-DEFAULT-INFO", 1, 0, false);
        declareFunction(me, "cb_uia_forwarding_handler", "CB-UIA-FORWARDING-HANDLER", 1, 0, false);
        declareMacro(me, "with_machine_and_base_port_forwarding", "WITH-MACHINE-AND-BASE-PORT-FORWARDING");
        return NIL;
    }

    public static SubLObject init_cb_uia_forwarding_file() {
        defparameter("*FORWARDING-MACHINE-NAME*", NIL);
        defparameter("*FORWARDING-BASE-PORT*", NIL);
        return NIL;
    }

    public static SubLObject setup_cb_uia_forwarding_file() {
        setup_cb_link_method($CB_UIA_FORWARDING, CB_LINK_CB_UIA_FORWARDING, TWO_INTEGER);
        declare_cb_tool($UIA_FORWARDING, $$$Forwarding, $$$Forwarding, $str6$Specify_forwarding_port_that_conn);
        setup_cb_link_method($UIA_FORWARDING, CB_LINK_UIA_FORWARDING, ONE_INTEGER);
        register_html_state_variable($forwarding_machine_name$);
        register_html_state_variable($forwarding_base_port$);
        html_macros.note_cgi_handler_function(CB_UIA_HANDLE_FORWARDING_INFO, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_UIA_HANDLE_FORWARDING_DEFAULT_INFO, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_UIA_FORWARDING_HANDLER, $HTML_HANDLER);
        register_external_symbol(WITH_MACHINE_AND_BASE_PORT_FORWARDING);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_uia_forwarding_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_uia_forwarding_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_uia_forwarding_file();
    }

    
}

/**
 * Total time: 127 ms
 */
