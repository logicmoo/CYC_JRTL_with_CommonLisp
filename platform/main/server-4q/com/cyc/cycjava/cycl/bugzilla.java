/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      BUGZILLA
 *  source file: /cyc/top/cycl/bugzilla.lisp
 *  created:     2019/07/03 17:38:01
 */
public final class bugzilla extends SubLTranslatedFile implements V02 {
    // // Constructor
    private bugzilla() {
    }

    public static final SubLFile me = new bugzilla();


    // // Definitions
    /**
     * Maximum URL length to use for parameterized link into Bugzilla
     */
    // deflexical
    private static final SubLSymbol $max_bugzilla_url_length$ = makeSymbol("*MAX-BUGZILLA-URL-LENGTH*");

    public static final SubLObject get_max_bugzilla_url_length() {
        return $max_bugzilla_url_length$.getGlobalValue();
    }

    /**
     * For now, a hard-coded list.  Eventually, initialize this by querying the Bugzilla
     * MySQL database.
     */
    // defconstant
    private static final SubLSymbol $bugzilla_known_products$ = makeSymbol("*BUGZILLA-KNOWN-PRODUCTS*");

    public static final SubLObject get_bugzilla_bug_groupset(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, $int$25, GROUPSET);
    }

    public static final SubLObject set_bugzilla_bug_groupset(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, $int$25, GROUPSET);
    }

    public static final SubLObject get_bugzilla_bug_target_milestone(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, $int$24, TARGET_MILESTONE);
    }

    public static final SubLObject set_bugzilla_bug_target_milestone(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, $int$24, TARGET_MILESTONE);
    }

    public static final SubLObject get_bugzilla_bug_status_whiteboard(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, $int$23, STATUS_WHITEBOARD);
    }

    public static final SubLObject set_bugzilla_bug_status_whiteboard(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, $int$23, STATUS_WHITEBOARD);
    }

    public static final SubLObject get_bugzilla_bug_bug_file_loc(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, $int$22, BUG_FILE_LOC);
    }

    public static final SubLObject set_bugzilla_bug_bug_file_loc(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, $int$22, BUG_FILE_LOC);
    }

    public static final SubLObject get_bugzilla_bug_assigned_to(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, $int$21, ASSIGNED_TO);
    }

    public static final SubLObject set_bugzilla_bug_assigned_to(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, $int$21, ASSIGNED_TO);
    }

    public static final SubLObject get_bugzilla_bug_op_sys(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, TWENTY_INTEGER, OP_SYS);
    }

    public static final SubLObject set_bugzilla_bug_op_sys(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, TWENTY_INTEGER, OP_SYS);
    }

    public static final SubLObject get_bugzilla_bug_priority(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, NINETEEN_INTEGER, PRIORITY);
    }

    public static final SubLObject set_bugzilla_bug_priority(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, NINETEEN_INTEGER, PRIORITY);
    }

    public static final SubLObject get_bugzilla_bug_bug_severity(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, EIGHTEEN_INTEGER, BUG_SEVERITY);
    }

    public static final SubLObject set_bugzilla_bug_bug_severity(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, EIGHTEEN_INTEGER, BUG_SEVERITY);
    }

    public static final SubLObject get_bugzilla_bug_rep_platform(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, SEVENTEEN_INTEGER, REP_PLATFORM);
    }

    public static final SubLObject set_bugzilla_bug_rep_platform(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, SEVENTEEN_INTEGER, REP_PLATFORM);
    }

    public static final SubLObject get_bugzilla_bug_short_desc(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, SIXTEEN_INTEGER, SHORT_DESC);
    }

    public static final SubLObject set_bugzilla_bug_short_desc(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, SIXTEEN_INTEGER, SHORT_DESC);
    }

    public static final SubLObject get_bugzilla_bug_machine_name(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, FIFTEEN_INTEGER, MACHINE_NAME);
    }

    public static final SubLObject set_bugzilla_bug_machine_name(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, FIFTEEN_INTEGER, MACHINE_NAME);
    }

    public static final SubLObject get_bugzilla_bug_image_type(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, FOURTEEN_INTEGER, IMAGE_TYPE);
    }

    public static final SubLObject set_bugzilla_bug_image_type(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, FOURTEEN_INTEGER, IMAGE_TYPE);
    }

    public static final SubLObject get_bugzilla_bug_kb_number(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, THIRTEEN_INTEGER, KB_NUMBER);
    }

    public static final SubLObject set_bugzilla_bug_kb_number(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, THIRTEEN_INTEGER, KB_NUMBER);
    }

    public static final SubLObject get_bugzilla_bug_system_version(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, TWELVE_INTEGER, SYSTEM_VERSION);
    }

    public static final SubLObject set_bugzilla_bug_system_version(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, TWELVE_INTEGER, SYSTEM_VERSION);
    }

    public static final SubLObject get_bugzilla_bug_version(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, ELEVEN_INTEGER, VERSION);
    }

    public static final SubLObject set_bugzilla_bug_version(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, ELEVEN_INTEGER, VERSION);
    }

    public static final SubLObject get_bugzilla_bug_cyc_guid(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, TEN_INTEGER, CYC_GUID);
    }

    public static final SubLObject set_bugzilla_bug_cyc_guid(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, TEN_INTEGER, CYC_GUID);
    }

    public static final SubLObject get_bugzilla_bug_component(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, NINE_INTEGER, COMPONENT);
    }

    public static final SubLObject set_bugzilla_bug_component(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, NINE_INTEGER, COMPONENT);
    }

    public static final SubLObject get_bugzilla_bug_product(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, EIGHT_INTEGER, PRODUCT);
    }

    public static final SubLObject set_bugzilla_bug_product(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, EIGHT_INTEGER, PRODUCT);
    }

    public static final SubLObject get_bugzilla_bug_auto_bug_report(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, SEVEN_INTEGER, AUTO_BUG_REPORT);
    }

    public static final SubLObject set_bugzilla_bug_auto_bug_report(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, SEVEN_INTEGER, AUTO_BUG_REPORT);
    }

    public static final SubLObject get_bugzilla_bug_comment(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, SIX_INTEGER, COMMENT);
    }

    public static final SubLObject set_bugzilla_bug_comment(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, SIX_INTEGER, COMMENT);
    }

    public static final SubLObject get_bugzilla_bug_message_from(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, FIVE_INTEGER, MESSAGE_FROM);
    }

    public static final SubLObject set_bugzilla_bug_message_from(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, FIVE_INTEGER, MESSAGE_FROM);
    }

    public static final SubLObject get_bugzilla_bug_message_to(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, FOUR_INTEGER, MESSAGE_TO);
    }

    public static final SubLObject set_bugzilla_bug_message_to(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, FOUR_INTEGER, MESSAGE_TO);
    }

    public static final SubLObject get_bugzilla_bug_reporter(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, THREE_INTEGER, REPORTER);
    }

    public static final SubLObject set_bugzilla_bug_reporter(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, THREE_INTEGER, REPORTER);
    }

    public static final SubLObject get_bugzilla_bug_cgi_script(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, TWO_INTEGER, CGI_SCRIPT);
    }

    public static final SubLObject set_bugzilla_bug_cgi_script(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, TWO_INTEGER, CGI_SCRIPT);
    }

    public static final SubLObject get_bugzilla_bug_server(SubLObject bugzilla_bug) {
        return classes.subloop_get_access_protected_instance_slot(bugzilla_bug, ONE_INTEGER, SERVER);
    }

    public static final SubLObject set_bugzilla_bug_server(SubLObject bugzilla_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(bugzilla_bug, value, ONE_INTEGER, SERVER);
    }

    public static final SubLObject subloop_reserved_initialize_bugzilla_bug_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_bugzilla_bug_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SERVER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, CGI_SCRIPT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, REPORTER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MESSAGE_TO, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MESSAGE_FROM, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, COMMENT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, AUTO_BUG_REPORT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, PRODUCT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, COMPONENT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, CYC_GUID, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, VERSION, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SYSTEM_VERSION, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, KB_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, IMAGE_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MACHINE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SHORT_DESC, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, REP_PLATFORM, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, BUG_SEVERITY, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, OP_SYS, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, ASSIGNED_TO, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, BUG_FILE_LOC, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, STATUS_WHITEBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, TARGET_MILESTONE, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, GROUPSET, NIL);
        return NIL;
    }

    public static final SubLObject bugzilla_bug_p(SubLObject bugzilla_bug) {
        return classes.subloop_instanceof_class(bugzilla_bug, BUGZILLA_BUG);
    }

    public static final SubLObject bugzilla_bug_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_bugzilla_bug_method = NIL;
            SubLObject machine_name = get_bugzilla_bug_machine_name(self);
            SubLObject image_type = get_bugzilla_bug_image_type(self);
            SubLObject kb_number = get_bugzilla_bug_kb_number(self);
            SubLObject v_system_version = get_bugzilla_bug_system_version(self);
            SubLObject message_to = get_bugzilla_bug_message_to(self);
            SubLObject cgi_script = get_bugzilla_bug_cgi_script(self);
            SubLObject server = get_bugzilla_bug_server(self);
            try {
                try {
                    object.object_initialize_method(self);
                    server = $str_alt47$bugzilla_cyc_com;
                    cgi_script = $str_alt48$enter_bug_cgi_;
                    message_to = kb_accessors.email_address_text($$CycorpBugzilla_KS);
                    v_system_version = system_info.cyc_revision_string();
                    kb_number = operation_communication.kb_version_string();
                    image_type = determine_bugzilla_image_type();
                    machine_name = Environment.get_machine_name($$$unknown);
                    sublisp_throw($sym46$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bugzilla_bug_machine_name(self, machine_name);
                            set_bugzilla_bug_image_type(self, image_type);
                            set_bugzilla_bug_kb_number(self, kb_number);
                            set_bugzilla_bug_system_version(self, v_system_version);
                            set_bugzilla_bug_message_to(self, message_to);
                            set_bugzilla_bug_cgi_script(self, cgi_script);
                            set_bugzilla_bug_server(self, server);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bugzilla_bug_method = Errors.handleThrowable(ccatch_env_var, $sym46$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD);
            }
            return catch_var_for_bugzilla_bug_method;
        }
    }

    /**
     *
     *
     * @param FORT
     * 		fort-p. Sets the reporter slot of this object to the
     * 		preferred e-mail address for this FORT, if any.
     * @return self
     */
    public static final SubLObject bugzilla_bug_set_reporter_method(SubLObject self, SubLObject fort) {
        {
            SubLObject catch_var_for_bugzilla_bug_method = NIL;
            SubLObject message_from = get_bugzilla_bug_message_from(self);
            SubLObject reporter = get_bugzilla_bug_reporter(self);
            try {
                try {
                    SubLSystemTrampolineFile.checkType(fort, FORT_P);
                    reporter = fort;
                    {
                        SubLObject address = kb_accessors.email_address_text(fort);
                        if (NIL != bugzilla_known_user(address)) {
                            message_from = address;
                        } else {
                            Errors.warn($str_alt58$_A_is_not_a_known_user_in_the_Cyc, address);
                        }
                    }
                    sublisp_throw($sym56$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bugzilla_bug_message_from(self, message_from);
                            set_bugzilla_bug_reporter(self, reporter);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bugzilla_bug_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD);
            }
            return catch_var_for_bugzilla_bug_method;
        }
    }

    /**
     *
     *
     * @param COMPONENT-NAME,
     * 		stringp
     * @param PRODUCT-NAME,
     * 		stringp
     * 		Sets the component slot of this object to COMPONENT-NAME and its product slot to PRODUCT-NAME
     * 		after verifying that they are valid product/component names for our Bugzilla DB.
     * @return self
     */
    public static final SubLObject bugzilla_bug_set_product_component_method(SubLObject self, SubLObject component_name, SubLObject product_name) {
        {
            SubLObject catch_var_for_bugzilla_bug_method = NIL;
            SubLObject component = get_bugzilla_bug_component(self);
            SubLObject product = get_bugzilla_bug_product(self);
            try {
                try {
                    if (NIL != bugzilla_known_component(component_name, product_name)) {
                        product = product_name;
                        component = component_name;
                    } else {
                        Errors.warn($str_alt64$_A_is_not_known_to_be_a_component, component_name, product_name);
                    }
                    sublisp_throw($sym63$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bugzilla_bug_component(self, component);
                            set_bugzilla_bug_product(self, product);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bugzilla_bug_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD);
            }
            return catch_var_for_bugzilla_bug_method;
        }
    }

    /**
     *
     *
     * @param PRODUCT-NAME,
     * 		stringp
     * 		Sets the product slot of this object to PRODUCT-NAME
     * 		after verifying that it is a valid product name for our Bugzilla DB.
     * @return self
     */
    public static final SubLObject bugzilla_bug_set_product_method(SubLObject self, SubLObject product_name) {
        {
            SubLObject catch_var_for_bugzilla_bug_method = NIL;
            SubLObject product = get_bugzilla_bug_product(self);
            try {
                try {
                    if (NIL != bugzilla_known_product(product_name)) {
                        product = product_name;
                    } else {
                        Errors.warn($str_alt70$_A_is_not_a_known_product_, product_name);
                    }
                    sublisp_throw($sym69$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bugzilla_bug_product(self, product);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bugzilla_bug_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD);
            }
            return catch_var_for_bugzilla_bug_method;
        }
    }

    /**
     *
     *
     * @param DESCRIPTION
     * 		stringp.
     * 		Sets the short-desc slot of this object to DESCRIPTION, possibly truncating it so
     * 		as not to exceed the length specified in *max-bugzilla-url-length*
     * @return self
     */
    public static final SubLObject bugzilla_bug_set_short_description_method(SubLObject self, SubLObject description) {
        {
            SubLObject catch_var_for_bugzilla_bug_method = NIL;
            SubLObject short_desc = get_bugzilla_bug_short_desc(self);
            try {
                try {
                    SubLSystemTrampolineFile.checkType(description, STRINGP);
                    short_desc = list_utilities.first_n(round(multiply($float$0_9, $max_bugzilla_url_length$.getGlobalValue()), UNPROVIDED), description);
                    sublisp_throw($sym75$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bugzilla_bug_short_desc(self, short_desc);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bugzilla_bug_method = Errors.handleThrowable(ccatch_env_var, $sym75$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD);
            }
            return catch_var_for_bugzilla_bug_method;
        }
    }

    /**
     * Computes the appropriate URL for reporting its content and returns it as a stringp
     *
     * @return stringp
     */
    public static final SubLObject bugzilla_bug_url_method(SubLObject self) {
        {
            SubLObject catch_var_for_bugzilla_bug_method = NIL;
            SubLObject message_from = get_bugzilla_bug_message_from(self);
            SubLObject message_to = get_bugzilla_bug_message_to(self);
            SubLObject cgi_script = get_bugzilla_bug_cgi_script(self);
            SubLObject server = get_bugzilla_bug_server(self);
            try {
                try {
                    {
                        SubLObject url = cconcatenate($str_alt82$http___, new SubLObject[]{ server, $str_alt83$_, cgi_script });
                        SubLObject p_list = methods.funcall_instance_method_with_1_args(self, STRING_P_LIST, $list_alt85);
                        SubLObject cdolist_list_var = p_list;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            url = cconcatenate(url, new SubLObject[]{ $str_alt86$_, item.first(), $str_alt87$_, web_utilities.html_url_encode(second(item), UNPROVIDED) });
                        }
                        sublisp_throw($sym81$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, url);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bugzilla_bug_message_from(self, message_from);
                            set_bugzilla_bug_message_to(self, message_to);
                            set_bugzilla_bug_cgi_script(self, cgi_script);
                            set_bugzilla_bug_server(self, server);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bugzilla_bug_method = Errors.handleThrowable(ccatch_env_var, $sym81$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD);
            }
            return catch_var_for_bugzilla_bug_method;
        }
    }

    /**
     * Sends its content to our Bugzilla DB using the Gateway interface only if the
     * message is well formed.
     *
     * @return BOOLEAN, T is the message was well formed and sent, NIL is it was not
    well formed and so wasn't sent.
     */
    public static final SubLObject bugzilla_bug_mail_method(SubLObject self) {
        {
            SubLObject catch_var_for_bugzilla_bug_method = NIL;
            SubLObject short_desc = get_bugzilla_bug_short_desc(self);
            SubLObject version = get_bugzilla_bug_version(self);
            SubLObject component = get_bugzilla_bug_component(self);
            SubLObject product = get_bugzilla_bug_product(self);
            SubLObject message_from = get_bugzilla_bug_message_from(self);
            SubLObject message_to = get_bugzilla_bug_message_to(self);
            try {
                try {
                    if (!product.isString()) {
                        Errors.warn($$$No_product_specified);
                        sublisp_throw($sym91$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, NIL);
                    }
                    if (!component.isString()) {
                        Errors.warn($$$No_component_specified);
                        sublisp_throw($sym91$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, NIL);
                    }
                    if (!version.isString()) {
                        Errors.warn($$$No_version_specified);
                        sublisp_throw($sym91$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, NIL);
                    }
                    if (!message_from.isString()) {
                        Errors.warn($$$No_sender_specified);
                        sublisp_throw($sym91$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, NIL);
                    }
                    if (!message_to.isString()) {
                        Errors.warn($$$Bugzilla_address_missing);
                        sublisp_throw($sym91$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, NIL);
                    }
                    if (!short_desc.isString()) {
                        Errors.warn($$$Short_description_missing);
                        sublisp_throw($sym91$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, NIL);
                    }
                    {
                        SubLObject message = methods.funcall_instance_method_with_0_args(self, GATEWAY_MESSAGE);
                        if (!message.isString()) {
                            Errors.warn($$$Invalid_message);
                            sublisp_throw($sym91$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, NIL);
                        }
                        mail_utilities.mail_message(message_from, message_to, message, short_desc, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        sublisp_throw($sym91$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, T);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bugzilla_bug_short_desc(self, short_desc);
                            set_bugzilla_bug_version(self, version);
                            set_bugzilla_bug_component(self, component);
                            set_bugzilla_bug_product(self, product);
                            set_bugzilla_bug_message_from(self, message_from);
                            set_bugzilla_bug_message_to(self, message_to);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bugzilla_bug_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD);
            }
            return catch_var_for_bugzilla_bug_method;
        }
    }

    /**
     * Computes a Bugzilla-Gateway compliant representation of its content and returns it
     * as a stringp.
     *
     * @return stringp
     */
    public static final SubLObject bugzilla_bug_gateway_message_method(SubLObject self) {
        {
            SubLObject catch_var_for_bugzilla_bug_method = NIL;
            SubLObject comment = get_bugzilla_bug_comment(self);
            SubLObject message_from = get_bugzilla_bug_message_from(self);
            SubLObject message_to = get_bugzilla_bug_message_to(self);
            SubLObject cgi_script = get_bugzilla_bug_cgi_script(self);
            SubLObject server = get_bugzilla_bug_server(self);
            try {
                try {
                    {
                        SubLObject message = string_utilities.$empty_string$.getGlobalValue();
                        SubLObject p_list = methods.funcall_instance_method_with_1_args(self, STRING_P_LIST, $list_alt103);
                        SubLObject cdolist_list_var = p_list;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            {
                                SubLObject datum = item;
                                SubLObject current = datum;
                                SubLObject parameter = NIL;
                                SubLObject value = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt104);
                                parameter = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt104);
                                value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (parameter.isString() && value.isString()) {
                                        message = cconcatenate(message, new SubLObject[]{ $str_alt105$_, parameter, $str_alt87$_, value, string_utilities.$new_line_string$.getGlobalValue() });
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt104);
                                }
                            }
                        }
                        message = cconcatenate(message, new SubLObject[]{ string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                        if (comment.isString()) {
                            message = cconcatenate(message, comment);
                        }
                        sublisp_throw($sym102$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD, message);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bugzilla_bug_comment(self, comment);
                            set_bugzilla_bug_message_from(self, message_from);
                            set_bugzilla_bug_message_to(self, message_to);
                            set_bugzilla_bug_cgi_script(self, cgi_script);
                            set_bugzilla_bug_server(self, server);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_bugzilla_bug_method = Errors.handleThrowable(ccatch_env_var, $sym102$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD);
            }
            return catch_var_for_bugzilla_bug_method;
        }
    }

    public static final SubLObject bugzilla_bug_string_p_list_method(SubLObject self, SubLObject excluded_list) {
        {
            SubLObject v_slots = subloop_structures.class_compiled_instance_slot_access_alist(methods.funcall_instance_method_with_0_args(self, CLASS_OF));
            SubLObject p_list = NIL;
            SubLObject cdolist_list_var = v_slots;
            SubLObject slot = NIL;
            for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                {
                    SubLObject slot_symbol = slots.slot_name(slot);
                    if (NIL == subl_promotions.memberP(slot_symbol, excluded_list, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject value = instances.get_slot(self, slot_symbol);
                            if (value.isString()) {
                                {
                                    SubLObject slot_string = string_utilities.string_substitute($str_alt110$_, $str_alt111$_, Strings.string_downcase(prin1_to_string(slot_symbol), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                    p_list = cons(list(slot_string, value), p_list);
                                }
                            }
                        }
                    }
                }
            }
            return p_list;
        }
    }

    /**
     * Generate a link using a bug icon which will bring up a Bugzilla reporting
     * page in a new browser window, having platform, OS, system version, KB version,
     * image type, and machine name already filled in.  The programmer must specify
     * PRODUCT (a string, one of *BUGZILLA-KNOWN-PRODUCTS*), and may specify a
     * COMPONENT (a string, must match a known Bugzilla component name), a SUMMARY
     * (a string, the name of the bug), or a COMMENT (a string, serves as the long
     * description of the bug).
     */
    public static final SubLObject cb_bugzilla_link(SubLObject product, SubLObject component, SubLObject summary, SubLObject comment, SubLObject reporter) {
        if (component == UNPROVIDED) {
            component = NIL;
        }
        if (summary == UNPROVIDED) {
            summary = NIL;
        }
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        if (reporter == UNPROVIDED) {
            reporter = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bug = object.new_class_instance(BUGZILLA_BUG);
                SubLObject bugzilla_url = NIL;
                if ((NIL != reporter) && (NIL != operation_communication.the_cyclist())) {
                    instances.set_slot(bug, REPORTER, reporter);
                } else {
                    methods.funcall_instance_method_with_1_args(bug, SET_REPORTER, operation_communication.the_cyclist());
                }
                if (NIL != component) {
                    methods.funcall_instance_method_with_2_args(bug, SET_PRODUCT_COMPONENT, component, product);
                } else {
                    methods.funcall_instance_method_with_1_args(bug, SET_PRODUCT, product);
                }
                instances.set_slot(bug, SHORT_DESC, summary);
                instances.set_slot(bug, COMMENT, comment);
                bugzilla_url = methods.funcall_instance_method_with_0_args(bug, URL);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(bugzilla_url);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (true) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($PROBLEM);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($HTML_BUG_IMAGE));
                            SubLObject align = (true) ? ((SubLObject) ($TOP)) : $CENTER;
                            SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($HTML_BUG_IMAGE);
                            SubLObject border = ZERO_INTEGER;
                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(image_src);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != alt) {
                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(alt);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != align) {
                                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(align));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != border) {
                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(border);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                return NIL;
            }
        }
    }

    /**
     * Generate a generic bugzilla link with the product set to "Cycorp Internal".
     */
    public static final SubLObject cb_cycorp_internal_bugzilla_link() {
        return cb_bugzilla_link($$$Cycorp_Internal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_cycorp_internal_bug_report(SubLObject args) {
        return cb_cycorp_internal_bugzilla_link();
    }

    public static final SubLObject get_odd_question_bug_question(SubLObject odd_question_bug) {
        return classes.subloop_get_access_protected_instance_slot(odd_question_bug, $int$26, QUESTION);
    }

    public static final SubLObject set_odd_question_bug_question(SubLObject odd_question_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(odd_question_bug, value, $int$26, QUESTION);
    }

    public static final SubLObject subloop_reserved_initialize_odd_question_bug_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_odd_question_bug_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SERVER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, CGI_SCRIPT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, REPORTER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MESSAGE_TO, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MESSAGE_FROM, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, COMMENT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, AUTO_BUG_REPORT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, PRODUCT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, COMPONENT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, CYC_GUID, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, VERSION, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SYSTEM_VERSION, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, KB_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, IMAGE_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MACHINE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SHORT_DESC, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, REP_PLATFORM, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, BUG_SEVERITY, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, OP_SYS, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, ASSIGNED_TO, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, BUG_FILE_LOC, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, STATUS_WHITEBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, TARGET_MILESTONE, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, GROUPSET, NIL);
        classes.subloop_initialize_slot(new_instance, ODD_QUESTION_BUG, QUESTION, NIL);
        return NIL;
    }

    public static final SubLObject odd_question_bug_p(SubLObject odd_question_bug) {
        return classes.subloop_instanceof_class(odd_question_bug, ODD_QUESTION_BUG);
    }

    public static final SubLObject odd_question_bug_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_odd_question_bug_method = NIL;
            SubLObject short_desc = get_bugzilla_bug_short_desc(self);
            SubLObject version = get_bugzilla_bug_version(self);
            SubLObject component = get_bugzilla_bug_component(self);
            SubLObject product = get_bugzilla_bug_product(self);
            try {
                try {
                    bugzilla_bug_initialize_method(self);
                    product = $$$Cycorp_Internal;
                    component = $str_alt126$OE___General;
                    version = $$$unspecified;
                    short_desc = $$$Cyc_asked_an_odd_question;
                    sublisp_throw($sym125$OUTER_CATCH_FOR_ODD_QUESTION_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bugzilla_bug_short_desc(self, short_desc);
                            set_bugzilla_bug_version(self, version);
                            set_bugzilla_bug_component(self, component);
                            set_bugzilla_bug_product(self, product);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_odd_question_bug_method = Errors.handleThrowable(ccatch_env_var, $sym125$OUTER_CATCH_FOR_ODD_QUESTION_BUG_METHOD);
            }
            return catch_var_for_odd_question_bug_method;
        }
    }

    public static final SubLObject odd_question_bug_compute_comment_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_odd_question_bug_method = NIL;
                SubLObject v_question = get_odd_question_bug_question(self);
                SubLObject comment = get_bugzilla_bug_comment(self);
                try {
                    try {
                        if (NIL == v_question) {
                            Errors.warn($$$Question_slot_not_initialized_yet);
                            sublisp_throw($sym132$OUTER_CATCH_FOR_ODD_QUESTION_BUG_METHOD, self);
                        }
                        {
                            SubLObject out_stream = make_string_output_stream();
                            SubLObject question_string = pph_question.generate_question(v_question, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            write_line(cconcatenate($str_alt134$_, new SubLObject[]{ question_string, $str_alt134$_ }), out_stream, UNPROVIDED, UNPROVIDED);
                            write_line(string_utilities.$new_line_string$.getGlobalValue(), out_stream, UNPROVIDED, UNPROVIDED);
                            write_line($str_alt135$sounds_like_an_odd_question_to_as, out_stream, UNPROVIDED, UNPROVIDED);
                            write_line(string_utilities.$new_line_string$.getGlobalValue(), out_stream, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_stream$.bind(out_stream, thread);
                                    cycml_generator.cycml_serialize_object(v_question);
                                } finally {
                                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                }
                            }
                            comment = get_output_stream_string(out_stream);
                        }
                        sublisp_throw($sym132$OUTER_CATCH_FOR_ODD_QUESTION_BUG_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_odd_question_bug_question(self, v_question);
                                set_bugzilla_bug_comment(self, comment);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_odd_question_bug_method = Errors.handleThrowable(ccatch_env_var, $sym132$OUTER_CATCH_FOR_ODD_QUESTION_BUG_METHOD);
                }
                return catch_var_for_odd_question_bug_method;
            }
        }
    }

    /**
     *
     *
     * @param QUESTION,
     * 		el-formula-p, such as (#$relationAllInstance #$age #$Dog ?X)
     * @param USER,
     * 		fort-p, a Cyc user such as #$Bertolo
     * @return BOOLEAN, T if the bug was filed successfully, NIL otherwise.
    QUESTION is intended to be a question that Cyc has decided to ask USER,
    typically in the context of a dialog. USER can use this utility to report
    to #$CycorpBugzilla-KS that the question was in some way or other odd, inappropriate,
    ill-conceived, etc... This is the vanilla utility for reporting odd questions. If
    you want your reports to be more detailed, subclass odd-question-bug accordingly.
     * @unknown bertolo
     */
    public static final SubLObject mail_odd_question_bug(SubLObject v_question, SubLObject user) {
        {
            SubLObject bug = object.new_class_instance(ODD_QUESTION_BUG);
            methods.funcall_instance_method_with_1_args(bug, SET_REPORTER, user);
            instances.set_slot(bug, QUESTION, v_question);
            methods.funcall_instance_method_with_0_args(bug, COMPUTE_COMMENT);
            return methods.funcall_instance_method_with_0_args(bug, MAIL);
        }
    }

    public static final SubLObject get_parser_failure_bug_parser_input(SubLObject parser_failure_bug) {
        return classes.subloop_get_access_protected_instance_slot(parser_failure_bug, $int$27, PARSER_INPUT);
    }

    public static final SubLObject set_parser_failure_bug_parser_input(SubLObject parser_failure_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(parser_failure_bug, value, $int$27, PARSER_INPUT);
    }

    public static final SubLObject get_parser_failure_bug_parser(SubLObject parser_failure_bug) {
        return classes.subloop_get_access_protected_instance_slot(parser_failure_bug, $int$26, PARSER);
    }

    public static final SubLObject set_parser_failure_bug_parser(SubLObject parser_failure_bug, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(parser_failure_bug, value, $int$26, PARSER);
    }

    public static final SubLObject subloop_reserved_initialize_parser_failure_bug_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_parser_failure_bug_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SERVER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, CGI_SCRIPT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, REPORTER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MESSAGE_TO, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MESSAGE_FROM, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, COMMENT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, AUTO_BUG_REPORT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, PRODUCT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, COMPONENT, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, CYC_GUID, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, VERSION, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SYSTEM_VERSION, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, KB_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, IMAGE_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, MACHINE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, SHORT_DESC, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, REP_PLATFORM, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, BUG_SEVERITY, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, OP_SYS, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, ASSIGNED_TO, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, BUG_FILE_LOC, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, STATUS_WHITEBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, TARGET_MILESTONE, NIL);
        classes.subloop_initialize_slot(new_instance, BUGZILLA_BUG, GROUPSET, NIL);
        classes.subloop_initialize_slot(new_instance, PARSER_FAILURE_BUG, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, PARSER_FAILURE_BUG, PARSER_INPUT, NIL);
        return NIL;
    }

    public static final SubLObject parser_failure_bug_p(SubLObject parser_failure_bug) {
        return classes.subloop_instanceof_class(parser_failure_bug, PARSER_FAILURE_BUG);
    }

    public static final SubLObject parser_failure_bug_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_parser_failure_bug_method = NIL;
            SubLObject short_desc = get_bugzilla_bug_short_desc(self);
            SubLObject version = get_bugzilla_bug_version(self);
            SubLObject component = get_bugzilla_bug_component(self);
            SubLObject product = get_bugzilla_bug_product(self);
            try {
                try {
                    bugzilla_bug_initialize_method(self);
                    product = $$$RKF;
                    component = $$$NL_Parsing;
                    version = $$$unspecified;
                    short_desc = $$$Irrecoverable_parsing_error;
                    sublisp_throw($sym145$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_bugzilla_bug_short_desc(self, short_desc);
                            set_bugzilla_bug_version(self, version);
                            set_bugzilla_bug_component(self, component);
                            set_bugzilla_bug_product(self, product);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_parser_failure_bug_method = Errors.handleThrowable(ccatch_env_var, $sym145$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD);
            }
            return catch_var_for_parser_failure_bug_method;
        }
    }

    public static final SubLObject parser_failure_bug_add_parser_method(SubLObject self, SubLObject new_parser) {
        {
            SubLObject catch_var_for_parser_failure_bug_method = NIL;
            SubLObject v_parser = get_parser_failure_bug_parser(self);
            SubLObject component = get_bugzilla_bug_component(self);
            try {
                try {
                    if (NIL != isa.isa_in_any_mtP(new_parser, $$CycNLParser)) {
                        v_parser = new_parser;
                        component = pph_main.generate_phrase(new_parser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        Errors.warn($str_alt155$___S_is_not_a___CycNLParser_, new_parser);
                    }
                    sublisp_throw($sym153$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_parser_failure_bug_parser(self, v_parser);
                            set_bugzilla_bug_component(self, component);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_parser_failure_bug_method = Errors.handleThrowable(ccatch_env_var, $sym153$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD);
            }
            return catch_var_for_parser_failure_bug_method;
        }
    }

    public static final SubLObject parser_failure_bug_add_parser_input_method(SubLObject self, SubLObject input) {
        {
            SubLObject catch_var_for_parser_failure_bug_method = NIL;
            SubLObject parser_input = get_parser_failure_bug_parser_input(self);
            try {
                try {
                    if (input.isString()) {
                        parser_input = input;
                    } else {
                        Errors.warn($str_alt161$___S_is_not_a_stringp_, input);
                    }
                    sublisp_throw($sym160$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_parser_failure_bug_parser_input(self, parser_input);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_parser_failure_bug_method = Errors.handleThrowable(ccatch_env_var, $sym160$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD);
            }
            return catch_var_for_parser_failure_bug_method;
        }
    }

    public static final SubLObject parser_failure_bug_compute_comment_method(SubLObject self) {
        {
            SubLObject catch_var_for_parser_failure_bug_method = NIL;
            SubLObject parser_input = get_parser_failure_bug_parser_input(self);
            SubLObject v_parser = get_parser_failure_bug_parser(self);
            SubLObject component = get_bugzilla_bug_component(self);
            SubLObject comment = get_bugzilla_bug_comment(self);
            try {
                try {
                    if (NIL == v_parser) {
                        Errors.warn($$$Parser_slot_not_initialized_yet);
                        sublisp_throw($sym164$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD, self);
                    }
                    if (NIL == parser_input) {
                        Errors.warn($str_alt166$Parser_Input_slot_not_initialized);
                        sublisp_throw($sym164$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD, self);
                    }
                    {
                        SubLObject out_stream = make_string_output_stream();
                        write_line(component, out_stream, UNPROVIDED, UNPROVIDED);
                        write_line(string_utilities.$new_line_string$.getGlobalValue(), out_stream, UNPROVIDED, UNPROVIDED);
                        write_line($str_alt167$errors_out_on_input__, out_stream, UNPROVIDED, UNPROVIDED);
                        write_line(cconcatenate($str_alt134$_, new SubLObject[]{ parser_input, $str_alt134$_ }), out_stream, UNPROVIDED, UNPROVIDED);
                        comment = get_output_stream_string(out_stream);
                    }
                    sublisp_throw($sym164$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_parser_failure_bug_parser_input(self, parser_input);
                            set_parser_failure_bug_parser(self, v_parser);
                            set_bugzilla_bug_component(self, component);
                            set_bugzilla_bug_comment(self, comment);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_parser_failure_bug_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD);
            }
            return catch_var_for_parser_failure_bug_method;
        }
    }

    /**
     *
     *
     * @param PARSER,
     * 		an instance of #$CycNLParser
     * @param PARSER-INPUT,
     * 		a stringp
     * @param USER,
     * 		fort-p, a Cyc user such as #$Bertolo
     * @return BOOLEAN, T if the bug was filed successfully, NIL otherwise.
    The intended use of this utility is as follows: if you are giving
    a parser a good work-out with thousands of inputs coming from who_knows_where
    you can write a routine that traps irrecoverable errors and causes a bug
    to be sent to Bugzilla for each such error.
     * @unknown bertolo
     */
    public static final SubLObject mail_parser_failure_bug(SubLObject v_parser, SubLObject parser_input, SubLObject user) {
        {
            SubLObject bug = object.new_class_instance(PARSER_FAILURE_BUG);
            methods.funcall_instance_method_with_1_args(bug, SET_REPORTER, user);
            methods.funcall_instance_method_with_1_args(bug, ADD_PARSER, v_parser);
            methods.funcall_instance_method_with_1_args(bug, ADD_PARSER_INPUT, parser_input);
            methods.funcall_instance_method_with_0_args(bug, COMPUTE_COMMENT);
            return methods.funcall_instance_method_with_0_args(bug, MAIL);
        }
    }

    public static final SubLObject bugzilla_known_product(SubLObject product_name) {
        return subl_promotions.memberP(product_name, $bugzilla_known_products$.getGlobalValue(), symbol_function($sym169$STRING_), UNPROVIDED);
    }

    /**
     * STUB for now.  Eventually, check that this is true by querying the Bugzilla MySQL
     * database.
     */
    public static final SubLObject bugzilla_known_component(SubLObject component_name, SubLObject product_name) {
        return bugzilla_known_product(product_name);
    }

    /**
     * STUB for now.  Eventually, check that this is true by querying the Bugzilla MySQL
     * database.
     */
    public static final SubLObject bugzilla_known_user(SubLObject email_address_text) {
        return T;
    }

    public static final SubLObject determine_bugzilla_image_type() {
        return NIL != string_utilities.substringP($$$Allegro, Environment.lisp_implementation_type(), UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) ($$$Allegro)) : NIL != string_utilities.substringP($$$Cycorp_C, Environment.lisp_implementation_type(), UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) ($$$Cyc_C)) : $$$NA;
    }

    public static final SubLObject declare_bugzilla_file() {
        declareFunction("get_max_bugzilla_url_length", "GET-MAX-BUGZILLA-URL-LENGTH", 0, 0, false);
        declareFunction("get_bugzilla_bug_groupset", "GET-BUGZILLA-BUG-GROUPSET", 1, 0, false);
        declareFunction("set_bugzilla_bug_groupset", "SET-BUGZILLA-BUG-GROUPSET", 2, 0, false);
        declareFunction("get_bugzilla_bug_target_milestone", "GET-BUGZILLA-BUG-TARGET-MILESTONE", 1, 0, false);
        declareFunction("set_bugzilla_bug_target_milestone", "SET-BUGZILLA-BUG-TARGET-MILESTONE", 2, 0, false);
        declareFunction("get_bugzilla_bug_status_whiteboard", "GET-BUGZILLA-BUG-STATUS-WHITEBOARD", 1, 0, false);
        declareFunction("set_bugzilla_bug_status_whiteboard", "SET-BUGZILLA-BUG-STATUS-WHITEBOARD", 2, 0, false);
        declareFunction("get_bugzilla_bug_bug_file_loc", "GET-BUGZILLA-BUG-BUG-FILE-LOC", 1, 0, false);
        declareFunction("set_bugzilla_bug_bug_file_loc", "SET-BUGZILLA-BUG-BUG-FILE-LOC", 2, 0, false);
        declareFunction("get_bugzilla_bug_assigned_to", "GET-BUGZILLA-BUG-ASSIGNED-TO", 1, 0, false);
        declareFunction("set_bugzilla_bug_assigned_to", "SET-BUGZILLA-BUG-ASSIGNED-TO", 2, 0, false);
        declareFunction("get_bugzilla_bug_op_sys", "GET-BUGZILLA-BUG-OP-SYS", 1, 0, false);
        declareFunction("set_bugzilla_bug_op_sys", "SET-BUGZILLA-BUG-OP-SYS", 2, 0, false);
        declareFunction("get_bugzilla_bug_priority", "GET-BUGZILLA-BUG-PRIORITY", 1, 0, false);
        declareFunction("set_bugzilla_bug_priority", "SET-BUGZILLA-BUG-PRIORITY", 2, 0, false);
        declareFunction("get_bugzilla_bug_bug_severity", "GET-BUGZILLA-BUG-BUG-SEVERITY", 1, 0, false);
        declareFunction("set_bugzilla_bug_bug_severity", "SET-BUGZILLA-BUG-BUG-SEVERITY", 2, 0, false);
        declareFunction("get_bugzilla_bug_rep_platform", "GET-BUGZILLA-BUG-REP-PLATFORM", 1, 0, false);
        declareFunction("set_bugzilla_bug_rep_platform", "SET-BUGZILLA-BUG-REP-PLATFORM", 2, 0, false);
        declareFunction("get_bugzilla_bug_short_desc", "GET-BUGZILLA-BUG-SHORT-DESC", 1, 0, false);
        declareFunction("set_bugzilla_bug_short_desc", "SET-BUGZILLA-BUG-SHORT-DESC", 2, 0, false);
        declareFunction("get_bugzilla_bug_machine_name", "GET-BUGZILLA-BUG-MACHINE-NAME", 1, 0, false);
        declareFunction("set_bugzilla_bug_machine_name", "SET-BUGZILLA-BUG-MACHINE-NAME", 2, 0, false);
        declareFunction("get_bugzilla_bug_image_type", "GET-BUGZILLA-BUG-IMAGE-TYPE", 1, 0, false);
        declareFunction("set_bugzilla_bug_image_type", "SET-BUGZILLA-BUG-IMAGE-TYPE", 2, 0, false);
        declareFunction("get_bugzilla_bug_kb_number", "GET-BUGZILLA-BUG-KB-NUMBER", 1, 0, false);
        declareFunction("set_bugzilla_bug_kb_number", "SET-BUGZILLA-BUG-KB-NUMBER", 2, 0, false);
        declareFunction("get_bugzilla_bug_system_version", "GET-BUGZILLA-BUG-SYSTEM-VERSION", 1, 0, false);
        declareFunction("set_bugzilla_bug_system_version", "SET-BUGZILLA-BUG-SYSTEM-VERSION", 2, 0, false);
        declareFunction("get_bugzilla_bug_version", "GET-BUGZILLA-BUG-VERSION", 1, 0, false);
        declareFunction("set_bugzilla_bug_version", "SET-BUGZILLA-BUG-VERSION", 2, 0, false);
        declareFunction("get_bugzilla_bug_cyc_guid", "GET-BUGZILLA-BUG-CYC-GUID", 1, 0, false);
        declareFunction("set_bugzilla_bug_cyc_guid", "SET-BUGZILLA-BUG-CYC-GUID", 2, 0, false);
        declareFunction("get_bugzilla_bug_component", "GET-BUGZILLA-BUG-COMPONENT", 1, 0, false);
        declareFunction("set_bugzilla_bug_component", "SET-BUGZILLA-BUG-COMPONENT", 2, 0, false);
        declareFunction("get_bugzilla_bug_product", "GET-BUGZILLA-BUG-PRODUCT", 1, 0, false);
        declareFunction("set_bugzilla_bug_product", "SET-BUGZILLA-BUG-PRODUCT", 2, 0, false);
        declareFunction("get_bugzilla_bug_auto_bug_report", "GET-BUGZILLA-BUG-AUTO-BUG-REPORT", 1, 0, false);
        declareFunction("set_bugzilla_bug_auto_bug_report", "SET-BUGZILLA-BUG-AUTO-BUG-REPORT", 2, 0, false);
        declareFunction("get_bugzilla_bug_comment", "GET-BUGZILLA-BUG-COMMENT", 1, 0, false);
        declareFunction("set_bugzilla_bug_comment", "SET-BUGZILLA-BUG-COMMENT", 2, 0, false);
        declareFunction("get_bugzilla_bug_message_from", "GET-BUGZILLA-BUG-MESSAGE-FROM", 1, 0, false);
        declareFunction("set_bugzilla_bug_message_from", "SET-BUGZILLA-BUG-MESSAGE-FROM", 2, 0, false);
        declareFunction("get_bugzilla_bug_message_to", "GET-BUGZILLA-BUG-MESSAGE-TO", 1, 0, false);
        declareFunction("set_bugzilla_bug_message_to", "SET-BUGZILLA-BUG-MESSAGE-TO", 2, 0, false);
        declareFunction("get_bugzilla_bug_reporter", "GET-BUGZILLA-BUG-REPORTER", 1, 0, false);
        declareFunction("set_bugzilla_bug_reporter", "SET-BUGZILLA-BUG-REPORTER", 2, 0, false);
        declareFunction("get_bugzilla_bug_cgi_script", "GET-BUGZILLA-BUG-CGI-SCRIPT", 1, 0, false);
        declareFunction("set_bugzilla_bug_cgi_script", "SET-BUGZILLA-BUG-CGI-SCRIPT", 2, 0, false);
        declareFunction("get_bugzilla_bug_server", "GET-BUGZILLA-BUG-SERVER", 1, 0, false);
        declareFunction("set_bugzilla_bug_server", "SET-BUGZILLA-BUG-SERVER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_bugzilla_bug_class", "SUBLOOP-RESERVED-INITIALIZE-BUGZILLA-BUG-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_bugzilla_bug_instance", "SUBLOOP-RESERVED-INITIALIZE-BUGZILLA-BUG-INSTANCE", 1, 0, false);
        declareFunction("bugzilla_bug_p", "BUGZILLA-BUG-P", 1, 0, false);
        declareFunction("bugzilla_bug_initialize_method", "BUGZILLA-BUG-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("bugzilla_bug_set_reporter_method", "BUGZILLA-BUG-SET-REPORTER-METHOD", 2, 0, false);
        declareFunction("bugzilla_bug_set_product_component_method", "BUGZILLA-BUG-SET-PRODUCT-COMPONENT-METHOD", 3, 0, false);
        declareFunction("bugzilla_bug_set_product_method", "BUGZILLA-BUG-SET-PRODUCT-METHOD", 2, 0, false);
        declareFunction("bugzilla_bug_set_short_description_method", "BUGZILLA-BUG-SET-SHORT-DESCRIPTION-METHOD", 2, 0, false);
        declareFunction("bugzilla_bug_url_method", "BUGZILLA-BUG-URL-METHOD", 1, 0, false);
        declareFunction("bugzilla_bug_mail_method", "BUGZILLA-BUG-MAIL-METHOD", 1, 0, false);
        declareFunction("bugzilla_bug_gateway_message_method", "BUGZILLA-BUG-GATEWAY-MESSAGE-METHOD", 1, 0, false);
        declareFunction("bugzilla_bug_string_p_list_method", "BUGZILLA-BUG-STRING-P-LIST-METHOD", 2, 0, false);
        declareFunction("cb_bugzilla_link", "CB-BUGZILLA-LINK", 1, 4, false);
        declareFunction("cb_cycorp_internal_bugzilla_link", "CB-CYCORP-INTERNAL-BUGZILLA-LINK", 0, 0, false);
        declareFunction("cb_cycorp_internal_bug_report", "CB-CYCORP-INTERNAL-BUG-REPORT", 1, 0, false);
        declareFunction("get_odd_question_bug_question", "GET-ODD-QUESTION-BUG-QUESTION", 1, 0, false);
        declareFunction("set_odd_question_bug_question", "SET-ODD-QUESTION-BUG-QUESTION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_odd_question_bug_class", "SUBLOOP-RESERVED-INITIALIZE-ODD-QUESTION-BUG-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_odd_question_bug_instance", "SUBLOOP-RESERVED-INITIALIZE-ODD-QUESTION-BUG-INSTANCE", 1, 0, false);
        declareFunction("odd_question_bug_p", "ODD-QUESTION-BUG-P", 1, 0, false);
        declareFunction("odd_question_bug_initialize_method", "ODD-QUESTION-BUG-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("odd_question_bug_compute_comment_method", "ODD-QUESTION-BUG-COMPUTE-COMMENT-METHOD", 1, 0, false);
        declareFunction("mail_odd_question_bug", "MAIL-ODD-QUESTION-BUG", 2, 0, false);
        declareFunction("get_parser_failure_bug_parser_input", "GET-PARSER-FAILURE-BUG-PARSER-INPUT", 1, 0, false);
        declareFunction("set_parser_failure_bug_parser_input", "SET-PARSER-FAILURE-BUG-PARSER-INPUT", 2, 0, false);
        declareFunction("get_parser_failure_bug_parser", "GET-PARSER-FAILURE-BUG-PARSER", 1, 0, false);
        declareFunction("set_parser_failure_bug_parser", "SET-PARSER-FAILURE-BUG-PARSER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_parser_failure_bug_class", "SUBLOOP-RESERVED-INITIALIZE-PARSER-FAILURE-BUG-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_parser_failure_bug_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSER-FAILURE-BUG-INSTANCE", 1, 0, false);
        declareFunction("parser_failure_bug_p", "PARSER-FAILURE-BUG-P", 1, 0, false);
        declareFunction("parser_failure_bug_initialize_method", "PARSER-FAILURE-BUG-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("parser_failure_bug_add_parser_method", "PARSER-FAILURE-BUG-ADD-PARSER-METHOD", 2, 0, false);
        declareFunction("parser_failure_bug_add_parser_input_method", "PARSER-FAILURE-BUG-ADD-PARSER-INPUT-METHOD", 2, 0, false);
        declareFunction("parser_failure_bug_compute_comment_method", "PARSER-FAILURE-BUG-COMPUTE-COMMENT-METHOD", 1, 0, false);
        declareFunction("mail_parser_failure_bug", "MAIL-PARSER-FAILURE-BUG", 3, 0, false);
        declareFunction("bugzilla_known_product", "BUGZILLA-KNOWN-PRODUCT", 1, 0, false);
        declareFunction("bugzilla_known_component", "BUGZILLA-KNOWN-COMPONENT", 2, 0, false);
        declareFunction("bugzilla_known_user", "BUGZILLA-KNOWN-USER", 1, 0, false);
        declareFunction("determine_bugzilla_image_type", "DETERMINE-BUGZILLA-IMAGE-TYPE", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_bugzilla_file() {
        deflexical("*MAX-BUGZILLA-URL-LENGTH*", $int$2048);
        defconstant("*BUGZILLA-KNOWN-PRODUCTS*", $list_alt1);
        return NIL;
    }

    public static final SubLObject setup_bugzilla_file() {
                sethash($HTML_BUG_IMAGE, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str_alt3$bug_btn_s_gif, $str_alt4$_Report_Bug_));
        classes.subloop_new_class(BUGZILLA_BUG, OBJECT, NIL, NIL, $list_alt7);
        classes.class_set_implements_slot_listeners(BUGZILLA_BUG, NIL);
        classes.subloop_note_class_initialization_function(BUGZILLA_BUG, SUBLOOP_RESERVED_INITIALIZE_BUGZILLA_BUG_CLASS);
        classes.subloop_note_instance_initialization_function(BUGZILLA_BUG, SUBLOOP_RESERVED_INITIALIZE_BUGZILLA_BUG_INSTANCE);
        subloop_reserved_initialize_bugzilla_bug_class(BUGZILLA_BUG);
        methods.methods_incorporate_instance_method(INITIALIZE, BUGZILLA_BUG, $list_alt44, NIL, $list_alt45);
        methods.subloop_register_instance_method(BUGZILLA_BUG, INITIALIZE, BUGZILLA_BUG_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_REPORTER, BUGZILLA_BUG, $list_alt53, $list_alt54, $list_alt55);
        methods.subloop_register_instance_method(BUGZILLA_BUG, SET_REPORTER, BUGZILLA_BUG_SET_REPORTER_METHOD);
        methods.methods_incorporate_instance_method(SET_PRODUCT_COMPONENT, BUGZILLA_BUG, $list_alt53, $list_alt61, $list_alt62);
        methods.subloop_register_instance_method(BUGZILLA_BUG, SET_PRODUCT_COMPONENT, BUGZILLA_BUG_SET_PRODUCT_COMPONENT_METHOD);
        methods.methods_incorporate_instance_method(SET_PRODUCT, BUGZILLA_BUG, $list_alt53, $list_alt67, $list_alt68);
        methods.subloop_register_instance_method(BUGZILLA_BUG, SET_PRODUCT, BUGZILLA_BUG_SET_PRODUCT_METHOD);
        methods.methods_incorporate_instance_method(SET_SHORT_DESCRIPTION, BUGZILLA_BUG, $list_alt53, $list_alt73, $list_alt74);
        methods.subloop_register_instance_method(BUGZILLA_BUG, SET_SHORT_DESCRIPTION, BUGZILLA_BUG_SET_SHORT_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method(URL, BUGZILLA_BUG, $list_alt53, NIL, $list_alt80);
        methods.subloop_register_instance_method(BUGZILLA_BUG, URL, BUGZILLA_BUG_URL_METHOD);
        methods.methods_incorporate_instance_method(MAIL, BUGZILLA_BUG, $list_alt53, NIL, $list_alt90);
        methods.subloop_register_instance_method(BUGZILLA_BUG, MAIL, BUGZILLA_BUG_MAIL_METHOD);
        methods.methods_incorporate_instance_method(GATEWAY_MESSAGE, BUGZILLA_BUG, $list_alt53, NIL, $list_alt101);
        methods.subloop_register_instance_method(BUGZILLA_BUG, GATEWAY_MESSAGE, BUGZILLA_BUG_GATEWAY_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(STRING_P_LIST, BUGZILLA_BUG, $list_alt44, $list_alt107, $list_alt108);
        methods.subloop_register_instance_method(BUGZILLA_BUG, STRING_P_LIST, BUGZILLA_BUG_STRING_P_LIST_METHOD);
        html_macros.note_html_handler_function(CB_CYCORP_INTERNAL_BUG_REPORT);
        classes.subloop_new_class(ODD_QUESTION_BUG, BUGZILLA_BUG, NIL, NIL, $list_alt119);
        classes.class_set_implements_slot_listeners(ODD_QUESTION_BUG, NIL);
        classes.subloop_note_class_initialization_function(ODD_QUESTION_BUG, SUBLOOP_RESERVED_INITIALIZE_ODD_QUESTION_BUG_CLASS);
        classes.subloop_note_instance_initialization_function(ODD_QUESTION_BUG, SUBLOOP_RESERVED_INITIALIZE_ODD_QUESTION_BUG_INSTANCE);
        subloop_reserved_initialize_odd_question_bug_class(ODD_QUESTION_BUG);
        methods.methods_incorporate_instance_method(INITIALIZE, ODD_QUESTION_BUG, $list_alt44, NIL, $list_alt124);
        methods.subloop_register_instance_method(ODD_QUESTION_BUG, INITIALIZE, ODD_QUESTION_BUG_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(COMPUTE_COMMENT, ODD_QUESTION_BUG, $list_alt44, NIL, $list_alt131);
        methods.subloop_register_instance_method(ODD_QUESTION_BUG, COMPUTE_COMMENT, ODD_QUESTION_BUG_COMPUTE_COMMENT_METHOD);
        classes.subloop_new_class(PARSER_FAILURE_BUG, BUGZILLA_BUG, NIL, NIL, $list_alt138);
        classes.class_set_implements_slot_listeners(PARSER_FAILURE_BUG, NIL);
        classes.subloop_note_class_initialization_function(PARSER_FAILURE_BUG, SUBLOOP_RESERVED_INITIALIZE_PARSER_FAILURE_BUG_CLASS);
        classes.subloop_note_instance_initialization_function(PARSER_FAILURE_BUG, SUBLOOP_RESERVED_INITIALIZE_PARSER_FAILURE_BUG_INSTANCE);
        subloop_reserved_initialize_parser_failure_bug_class(PARSER_FAILURE_BUG);
        methods.methods_incorporate_instance_method(INITIALIZE, PARSER_FAILURE_BUG, $list_alt44, NIL, $list_alt144);
        methods.subloop_register_instance_method(PARSER_FAILURE_BUG, INITIALIZE, PARSER_FAILURE_BUG_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ADD_PARSER, PARSER_FAILURE_BUG, $list_alt44, $list_alt151, $list_alt152);
        methods.subloop_register_instance_method(PARSER_FAILURE_BUG, ADD_PARSER, PARSER_FAILURE_BUG_ADD_PARSER_METHOD);
        methods.methods_incorporate_instance_method(ADD_PARSER_INPUT, PARSER_FAILURE_BUG, $list_alt44, $list_alt158, $list_alt159);
        methods.subloop_register_instance_method(PARSER_FAILURE_BUG, ADD_PARSER_INPUT, PARSER_FAILURE_BUG_ADD_PARSER_INPUT_METHOD);
        methods.methods_incorporate_instance_method(COMPUTE_COMMENT, PARSER_FAILURE_BUG, $list_alt44, NIL, $list_alt163);
        methods.subloop_register_instance_method(PARSER_FAILURE_BUG, COMPUTE_COMMENT, PARSER_FAILURE_BUG_COMPUTE_COMMENT_METHOD);
        return NIL;
    }

    // // Internal Constants
    public static final SubLInteger $int$2048 = makeInteger(2048);

    static private final SubLList $list_alt1 = list(makeString("Blue Scooter"), makeString("Bugzilla"), makeString("Cycorp Internal"), makeString("IKB"), makeString("OpenCyc"), makeString("QUIRK"), makeString("RKF"), makeString("NL"));

    private static final SubLSymbol $HTML_BUG_IMAGE = makeKeyword("HTML-BUG-IMAGE");

    static private final SubLString $str_alt3$bug_btn_s_gif = makeString("bug_btn_s.gif");

    static private final SubLString $str_alt4$_Report_Bug_ = makeString("[Report Bug]");

    private static final SubLSymbol BUGZILLA_BUG = makeSymbol("BUGZILLA-BUG");



    static private final SubLList $list_alt7 = list(new SubLObject[]{ list(makeSymbol("SERVER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CGI-SCRIPT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REPORTER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MESSAGE-TO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MESSAGE-FROM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("COMMENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AUTO-BUG-REPORT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRODUCT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("COMPONENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CYC-GUID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VERSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SYSTEM-VERSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KB-NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IMAGE-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MACHINE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SHORT-DESC"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REP-PLATFORM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("BUG-SEVERITY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRIORITY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OP-SYS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ASSIGNED-TO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("BUG-FILE-LOC"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STATUS-WHITEBOARD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TARGET-MILESTONE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("GROUPSET"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REPORTER"), list(makeSymbol("FORT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRODUCT-COMPONENT"), list(makeSymbol("COMPONENT-NAME"), makeSymbol("PRODUCT-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SHORT-DESCRIPTION"), list(makeSymbol("DESCRIPTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATEWAY-MESSAGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MAIL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("URL"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol GROUPSET = makeSymbol("GROUPSET");

    public static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLSymbol TARGET_MILESTONE = makeSymbol("TARGET-MILESTONE");

    public static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLSymbol STATUS_WHITEBOARD = makeSymbol("STATUS-WHITEBOARD");

    public static final SubLInteger $int$22 = makeInteger(22);

    private static final SubLSymbol BUG_FILE_LOC = makeSymbol("BUG-FILE-LOC");

    public static final SubLInteger $int$21 = makeInteger(21);

    private static final SubLSymbol ASSIGNED_TO = makeSymbol("ASSIGNED-TO");

    private static final SubLSymbol OP_SYS = makeSymbol("OP-SYS");



    private static final SubLSymbol BUG_SEVERITY = makeSymbol("BUG-SEVERITY");

    private static final SubLSymbol REP_PLATFORM = makeSymbol("REP-PLATFORM");



    private static final SubLSymbol MACHINE_NAME = makeSymbol("MACHINE-NAME");

    private static final SubLSymbol IMAGE_TYPE = makeSymbol("IMAGE-TYPE");

    private static final SubLSymbol KB_NUMBER = makeSymbol("KB-NUMBER");

    private static final SubLSymbol SYSTEM_VERSION = makeSymbol("SYSTEM-VERSION");



    private static final SubLSymbol CYC_GUID = makeSymbol("CYC-GUID");





    private static final SubLSymbol AUTO_BUG_REPORT = makeSymbol("AUTO-BUG-REPORT");







    private static final SubLSymbol REPORTER = makeSymbol("REPORTER");

    private static final SubLSymbol CGI_SCRIPT = makeSymbol("CGI-SCRIPT");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BUGZILLA_BUG_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BUGZILLA-BUG-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BUGZILLA_BUG_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BUGZILLA-BUG-INSTANCE");



    static private final SubLList $list_alt44 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt45 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SERVER"), makeString("bugzilla.cyc.com")), list(makeSymbol("CSETQ"), makeSymbol("CGI-SCRIPT"), makeString("enter_bug.cgi?")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE-TO"), list(makeSymbol("EMAIL-ADDRESS-TEXT"), constant_handles.reader_make_constant_shell(makeString("CycorpBugzilla-KS")))), list(makeSymbol("CSETQ"), makeSymbol("SYSTEM-VERSION"), list(makeSymbol("CYC-REVISION-STRING"))), list(makeSymbol("CSETQ"), makeSymbol("KB-NUMBER"), list(makeSymbol("KB-VERSION-STRING"))), list(makeSymbol("CSETQ"), makeSymbol("IMAGE-TYPE"), list(makeSymbol("DETERMINE-BUGZILLA-IMAGE-TYPE"))), list(makeSymbol("CSETQ"), makeSymbol("MACHINE-NAME"), list(makeSymbol("GET-MACHINE-NAME"), makeString("unknown"))), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym46$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BUGZILLA-BUG-METHOD");

    static private final SubLString $str_alt47$bugzilla_cyc_com = makeString("bugzilla.cyc.com");

    static private final SubLString $str_alt48$enter_bug_cgi_ = makeString("enter_bug.cgi?");

    public static final SubLObject $$CycorpBugzilla_KS = constant_handles.reader_make_constant_shell(makeString("CycorpBugzilla-KS"));

    static private final SubLString $$$unknown = makeString("unknown");

    private static final SubLSymbol BUGZILLA_BUG_INITIALIZE_METHOD = makeSymbol("BUGZILLA-BUG-INITIALIZE-METHOD");

    private static final SubLSymbol SET_REPORTER = makeSymbol("SET-REPORTER");

    static private final SubLList $list_alt53 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt54 = list(makeSymbol("FORT"));

    static private final SubLList $list_alt55 = list(makeString("@param FORT fort-p. Sets the reporter slot of this object to the\n  preferred e-mail address for this FORT, if any.\n  @return self"), list(makeSymbol("CHECK-TYPE"), makeSymbol("FORT"), makeSymbol("FORT-P")), list(makeSymbol("CSETQ"), makeSymbol("REPORTER"), makeSymbol("FORT")), list(makeSymbol("CLET"), list(list(makeSymbol("ADDRESS"), list(makeSymbol("EMAIL-ADDRESS-TEXT"), makeSymbol("FORT")))), list(makeSymbol("PIF"), list(makeSymbol("BUGZILLA-KNOWN-USER"), makeSymbol("ADDRESS")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE-FROM"), makeSymbol("ADDRESS")), list(makeSymbol("WARN"), makeString("~A is not a known user in the Cycorp Bugzilla installation."), makeSymbol("ADDRESS")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym56$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BUGZILLA-BUG-METHOD");



    static private final SubLString $str_alt58$_A_is_not_a_known_user_in_the_Cyc = makeString("~A is not a known user in the Cycorp Bugzilla installation.");

    private static final SubLSymbol BUGZILLA_BUG_SET_REPORTER_METHOD = makeSymbol("BUGZILLA-BUG-SET-REPORTER-METHOD");

    private static final SubLSymbol SET_PRODUCT_COMPONENT = makeSymbol("SET-PRODUCT-COMPONENT");

    static private final SubLList $list_alt61 = list(makeSymbol("COMPONENT-NAME"), makeSymbol("PRODUCT-NAME"));

    static private final SubLList $list_alt62 = list(makeString("@param COMPONENT-NAME, stringp\n   @param PRODUCT-NAME, stringp\n   Sets the component slot of this object to COMPONENT-NAME and its product slot to PRODUCT-NAME\n   after verifying that they are valid product/component names for our Bugzilla DB.\n   @return self"), list(makeSymbol("PCOND"), list(list(makeSymbol("BUGZILLA-KNOWN-COMPONENT"), makeSymbol("COMPONENT-NAME"), makeSymbol("PRODUCT-NAME")), list(makeSymbol("CSETQ"), makeSymbol("PRODUCT"), makeSymbol("PRODUCT-NAME")), list(makeSymbol("CSETQ"), makeSymbol("COMPONENT"), makeSymbol("COMPONENT-NAME"))), list(T, list(makeSymbol("WARN"), makeString("~A is not known to be a component of the product, ~A."), makeSymbol("COMPONENT-NAME"), makeSymbol("PRODUCT-NAME")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym63$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BUGZILLA-BUG-METHOD");

    static private final SubLString $str_alt64$_A_is_not_known_to_be_a_component = makeString("~A is not known to be a component of the product, ~A.");

    private static final SubLSymbol BUGZILLA_BUG_SET_PRODUCT_COMPONENT_METHOD = makeSymbol("BUGZILLA-BUG-SET-PRODUCT-COMPONENT-METHOD");

    private static final SubLSymbol SET_PRODUCT = makeSymbol("SET-PRODUCT");

    static private final SubLList $list_alt67 = list(makeSymbol("PRODUCT-NAME"));

    static private final SubLList $list_alt68 = list(makeString("@param PRODUCT-NAME, stringp\n   Sets the product slot of this object to PRODUCT-NAME\n   after verifying that it is a valid product name for our Bugzilla DB.\n   @return self"), list(makeSymbol("PCOND"), list(list(makeSymbol("BUGZILLA-KNOWN-PRODUCT"), makeSymbol("PRODUCT-NAME")), list(makeSymbol("CSETQ"), makeSymbol("PRODUCT"), makeSymbol("PRODUCT-NAME"))), list(T, list(makeSymbol("WARN"), makeString("~A is not a known product."), makeSymbol("PRODUCT-NAME")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym69$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BUGZILLA-BUG-METHOD");

    static private final SubLString $str_alt70$_A_is_not_a_known_product_ = makeString("~A is not a known product.");

    private static final SubLSymbol BUGZILLA_BUG_SET_PRODUCT_METHOD = makeSymbol("BUGZILLA-BUG-SET-PRODUCT-METHOD");

    private static final SubLSymbol SET_SHORT_DESCRIPTION = makeSymbol("SET-SHORT-DESCRIPTION");

    static private final SubLList $list_alt73 = list(makeSymbol("DESCRIPTION"));

    static private final SubLList $list_alt74 = list(makeString("@param DESCRIPTION stringp. \n  Sets the short-desc slot of this object to DESCRIPTION, possibly truncating it so\n  as not to exceed the length specified in *max-bugzilla-url-length*\n  @return self"), list(makeSymbol("CHECK-TYPE"), makeSymbol("DESCRIPTION"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("SHORT-DESC"), list(makeSymbol("FIRST-N"), list(makeSymbol("ROUND"), list(makeSymbol("*"), makeDouble(0.9), makeSymbol("*MAX-BUGZILLA-URL-LENGTH*"))), makeSymbol("DESCRIPTION"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym75$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BUGZILLA-BUG-METHOD");



    public static final SubLFloat $float$0_9 = makeDouble(0.9);

    private static final SubLSymbol BUGZILLA_BUG_SET_SHORT_DESCRIPTION_METHOD = makeSymbol("BUGZILLA-BUG-SET-SHORT-DESCRIPTION-METHOD");



    static private final SubLList $list_alt80 = list(makeString("Computes the appropriate URL for reporting its content and returns it as a stringp\n   @return stringp"), list(makeSymbol("CLET"), list(list(makeSymbol("URL"), list(makeSymbol("CCONCATENATE"), makeString("http://"), makeSymbol("SERVER"), makeString("/"), makeSymbol("CGI-SCRIPT"))), list(makeSymbol("P-LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STRING-P-LIST")), list(QUOTE, list(makeSymbol("MESSAGE-FROM"), makeSymbol("MESSAGE-TO")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), makeSymbol("P-LIST")), list(makeSymbol("CSETQ"), makeSymbol("URL"), list(makeSymbol("CCONCATENATE"), makeSymbol("URL"), makeString("&"), list(makeSymbol("FIRST"), makeSymbol("ITEM")), makeString("="), list(makeSymbol("HTML-URL-ENCODE"), list(makeSymbol("SECOND"), makeSymbol("ITEM")))))), list(RET, makeSymbol("URL"))));

    static private final SubLSymbol $sym81$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BUGZILLA-BUG-METHOD");

    static private final SubLString $str_alt82$http___ = makeString("http://");

    static private final SubLString $str_alt83$_ = makeString("/");

    private static final SubLSymbol STRING_P_LIST = makeSymbol("STRING-P-LIST");

    static private final SubLList $list_alt85 = list(makeSymbol("MESSAGE-FROM"), makeSymbol("MESSAGE-TO"));

    static private final SubLString $str_alt86$_ = makeString("&");

    static private final SubLString $str_alt87$_ = makeString("=");

    private static final SubLSymbol BUGZILLA_BUG_URL_METHOD = makeSymbol("BUGZILLA-BUG-URL-METHOD");

    private static final SubLSymbol MAIL = makeSymbol("MAIL");

    static private final SubLList $list_alt90 = list(makeString("Sends its content to our Bugzilla DB using the Gateway interface only if the \n  message is well formed.\n  @return BOOLEAN, T is the message was well formed and sent, NIL is it was not\n  well formed and so wasn\'t sent."), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("PRODUCT")), list(makeSymbol("WARN"), makeString("No product specified")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("COMPONENT")), list(makeSymbol("WARN"), makeString("No component specified")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("VERSION")), list(makeSymbol("WARN"), makeString("No version specified")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("MESSAGE-FROM")), list(makeSymbol("WARN"), makeString("No sender specified")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("MESSAGE-TO")), list(makeSymbol("WARN"), makeString("Bugzilla address missing")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("SHORT-DESC")), list(makeSymbol("WARN"), makeString("Short description missing")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GATEWAY-MESSAGE"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("MESSAGE")), list(makeSymbol("WARN"), makeString("Invalid message")), list(RET, NIL)), list(makeSymbol("MAIL-MESSAGE"), makeSymbol("MESSAGE-FROM"), makeSymbol("MESSAGE-TO"), makeSymbol("MESSAGE"), makeSymbol("SHORT-DESC")), list(RET, T)));

    static private final SubLSymbol $sym91$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BUGZILLA-BUG-METHOD");

    static private final SubLString $$$No_product_specified = makeString("No product specified");

    static private final SubLString $$$No_component_specified = makeString("No component specified");

    static private final SubLString $$$No_version_specified = makeString("No version specified");

    static private final SubLString $$$No_sender_specified = makeString("No sender specified");

    static private final SubLString $$$Bugzilla_address_missing = makeString("Bugzilla address missing");

    static private final SubLString $$$Short_description_missing = makeString("Short description missing");

    private static final SubLSymbol GATEWAY_MESSAGE = makeSymbol("GATEWAY-MESSAGE");

    static private final SubLString $$$Invalid_message = makeString("Invalid message");

    private static final SubLSymbol BUGZILLA_BUG_MAIL_METHOD = makeSymbol("BUGZILLA-BUG-MAIL-METHOD");

    static private final SubLList $list_alt101 = list(makeString("Computes a Bugzilla-Gateway compliant representation of its content and returns it\n  as a stringp.\n  @return stringp"), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE"), makeSymbol("*EMPTY-STRING*")), list(makeSymbol("P-LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STRING-P-LIST")), list(QUOTE, list(makeSymbol("MESSAGE-FROM"), makeSymbol("COMMENT"), makeSymbol("MESSAGE-TO"), makeSymbol("SERVER"), makeSymbol("CGI-SCRIPT")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), makeSymbol("P-LIST")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("PARAMETER"), makeSymbol("VALUE")), makeSymbol("ITEM"), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("STRINGP"), makeSymbol("PARAMETER")), list(makeSymbol("STRINGP"), makeSymbol("VALUE"))), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE"), list(makeSymbol("CCONCATENATE"), makeSymbol("MESSAGE"), makeString("@"), makeSymbol("PARAMETER"), makeString("="), makeSymbol("VALUE"), makeSymbol("*NEW-LINE-STRING*")))))), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE"), list(makeSymbol("CCONCATENATE"), makeSymbol("MESSAGE"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*"))), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("COMMENT")), list(makeSymbol("CSETQ"), makeSymbol("MESSAGE"), list(makeSymbol("CCONCATENATE"), makeSymbol("MESSAGE"), makeSymbol("COMMENT")))), list(RET, makeSymbol("MESSAGE"))));

    static private final SubLSymbol $sym102$OUTER_CATCH_FOR_BUGZILLA_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BUGZILLA-BUG-METHOD");

    static private final SubLList $list_alt103 = list(makeSymbol("MESSAGE-FROM"), makeSymbol("COMMENT"), makeSymbol("MESSAGE-TO"), makeSymbol("SERVER"), makeSymbol("CGI-SCRIPT"));

    static private final SubLList $list_alt104 = list(makeSymbol("PARAMETER"), makeSymbol("VALUE"));

    static private final SubLString $str_alt105$_ = makeString("@");

    private static final SubLSymbol BUGZILLA_BUG_GATEWAY_MESSAGE_METHOD = makeSymbol("BUGZILLA-BUG-GATEWAY-MESSAGE-METHOD");

    static private final SubLList $list_alt107 = list(makeSymbol("EXCLUDED-LIST"));

    static private final SubLList $list_alt108 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SLOTS"), list(makeSymbol("CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CLASS-OF"))))), makeSymbol("P-LIST")), list(makeSymbol("CDOLIST"), list(makeSymbol("SLOT"), makeSymbol("SLOTS")), list(makeSymbol("CLET"), list(list(makeSymbol("SLOT-SYMBOL"), list(makeSymbol("SLOT-NAME"), makeSymbol("SLOT")))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("SLOT-SYMBOL"), makeSymbol("EXCLUDED-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("VALUE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT-SYMBOL")))), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("VALUE")), list(makeSymbol("CLET"), list(list(makeSymbol("SLOT-STRING"), list(makeSymbol("STRING-SUBSTITUTE"), makeString("_"), makeString("-"), list(makeSymbol("STRING-DOWNCASE"), list(makeSymbol("PRIN1-TO-STRING"), makeSymbol("SLOT-SYMBOL")))))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("SLOT-STRING"), makeSymbol("VALUE")), makeSymbol("P-LIST")))))))), list(RET, makeSymbol("P-LIST"))));



    static private final SubLString $str_alt110$_ = makeString("_");

    static private final SubLString $str_alt111$_ = makeString("-");

    private static final SubLSymbol BUGZILLA_BUG_STRING_P_LIST_METHOD = makeSymbol("BUGZILLA-BUG-STRING-P-LIST-METHOD");







    static private final SubLString $$$Cycorp_Internal = makeString("Cycorp Internal");

    private static final SubLSymbol CB_CYCORP_INTERNAL_BUG_REPORT = makeSymbol("CB-CYCORP-INTERNAL-BUG-REPORT");

    private static final SubLSymbol ODD_QUESTION_BUG = makeSymbol("ODD-QUESTION-BUG");

    static private final SubLList $list_alt119 = list(list(makeSymbol("QUESTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-COMMENT"), NIL, makeKeyword("PROTECTED")));

    public static final SubLInteger $int$26 = makeInteger(26);



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ODD_QUESTION_BUG_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ODD-QUESTION-BUG-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ODD_QUESTION_BUG_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ODD-QUESTION-BUG-INSTANCE");

    static private final SubLList $list_alt124 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRODUCT"), makeString("Cycorp Internal")), list(makeSymbol("CSETQ"), makeSymbol("COMPONENT"), makeString("OE - General")), list(makeSymbol("CSETQ"), makeSymbol("VERSION"), makeString("unspecified")), list(makeSymbol("CSETQ"), makeSymbol("SHORT-DESC"), makeString("Cyc asked an odd question")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym125$OUTER_CATCH_FOR_ODD_QUESTION_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ODD-QUESTION-BUG-METHOD");

    static private final SubLString $str_alt126$OE___General = makeString("OE - General");

    static private final SubLString $$$unspecified = makeString("unspecified");

    static private final SubLString $$$Cyc_asked_an_odd_question = makeString("Cyc asked an odd question");

    private static final SubLSymbol ODD_QUESTION_BUG_INITIALIZE_METHOD = makeSymbol("ODD-QUESTION-BUG-INITIALIZE-METHOD");

    private static final SubLSymbol COMPUTE_COMMENT = makeSymbol("COMPUTE-COMMENT");

    static private final SubLList $list_alt131 = list(list(makeSymbol("PUNLESS"), makeSymbol("QUESTION"), list(makeSymbol("WARN"), makeString("Question slot not initialized yet")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("OUT-STREAM"), list(makeSymbol("MAKE-STRING-OUTPUT-STREAM"))), list(makeSymbol("QUESTION-STRING"), list(makeSymbol("GENERATE-QUESTION"), makeSymbol("QUESTION")))), list(makeSymbol("WRITE-LINE"), list(makeSymbol("CCONCATENATE"), makeString("\""), makeSymbol("QUESTION-STRING"), makeString("\"")), makeSymbol("OUT-STREAM")), list(makeSymbol("WRITE-LINE"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("OUT-STREAM")), list(makeSymbol("WRITE-LINE"), makeString("sounds like an odd question to ask"), makeSymbol("OUT-STREAM")), list(makeSymbol("WRITE-LINE"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("OUT-STREAM")), list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), makeSymbol("OUT-STREAM"))), list(makeSymbol("CYCML-SERIALIZE-OBJECT"), makeSymbol("QUESTION"))), list(makeSymbol("CSETQ"), makeSymbol("COMMENT"), list(makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("OUT-STREAM")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym132$OUTER_CATCH_FOR_ODD_QUESTION_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ODD-QUESTION-BUG-METHOD");

    static private final SubLString $$$Question_slot_not_initialized_yet = makeString("Question slot not initialized yet");

    static private final SubLString $str_alt134$_ = makeString("\"");

    static private final SubLString $str_alt135$sounds_like_an_odd_question_to_as = makeString("sounds like an odd question to ask");

    private static final SubLSymbol ODD_QUESTION_BUG_COMPUTE_COMMENT_METHOD = makeSymbol("ODD-QUESTION-BUG-COMPUTE-COMMENT-METHOD");

    private static final SubLSymbol PARSER_FAILURE_BUG = makeSymbol("PARSER-FAILURE-BUG");

    static private final SubLList $list_alt138 = list(list(makeSymbol("PARSER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSER-INPUT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARSER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARSER-INPUT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-COMMENT"), NIL, makeKeyword("PROTECTED")));

    public static final SubLInteger $int$27 = makeInteger(27);

    private static final SubLSymbol PARSER_INPUT = makeSymbol("PARSER-INPUT");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARSER_FAILURE_BUG_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSER-FAILURE-BUG-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARSER_FAILURE_BUG_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSER-FAILURE-BUG-INSTANCE");

    static private final SubLList $list_alt144 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRODUCT"), makeString("RKF")), list(makeSymbol("CSETQ"), makeSymbol("COMPONENT"), makeString("NL Parsing")), list(makeSymbol("CSETQ"), makeSymbol("VERSION"), makeString("unspecified")), list(makeSymbol("CSETQ"), makeSymbol("SHORT-DESC"), makeString("Irrecoverable parsing error")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym145$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSER-FAILURE-BUG-METHOD");

    static private final SubLString $$$RKF = makeString("RKF");

    static private final SubLString $$$NL_Parsing = makeString("NL Parsing");

    static private final SubLString $$$Irrecoverable_parsing_error = makeString("Irrecoverable parsing error");

    private static final SubLSymbol PARSER_FAILURE_BUG_INITIALIZE_METHOD = makeSymbol("PARSER-FAILURE-BUG-INITIALIZE-METHOD");

    private static final SubLSymbol ADD_PARSER = makeSymbol("ADD-PARSER");

    static private final SubLList $list_alt151 = list(makeSymbol("NEW-PARSER"));

    static private final SubLList $list_alt152 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("NEW-PARSER"), constant_handles.reader_make_constant_shell(makeString("CycNLParser"))), list(makeSymbol("CSETQ"), makeSymbol("PARSER"), makeSymbol("NEW-PARSER")), list(makeSymbol("CSETQ"), makeSymbol("COMPONENT"), list(makeSymbol("GENERATE-PHRASE"), makeSymbol("NEW-PARSER")))), list(T, list(makeSymbol("WARN"), makeString("~%~S is not a #$CycNLParser!"), makeSymbol("NEW-PARSER")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym153$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSER-FAILURE-BUG-METHOD");

    public static final SubLObject $$CycNLParser = constant_handles.reader_make_constant_shell(makeString("CycNLParser"));

    static private final SubLString $str_alt155$___S_is_not_a___CycNLParser_ = makeString("~%~S is not a #$CycNLParser!");

    private static final SubLSymbol PARSER_FAILURE_BUG_ADD_PARSER_METHOD = makeSymbol("PARSER-FAILURE-BUG-ADD-PARSER-METHOD");

    private static final SubLSymbol ADD_PARSER_INPUT = makeSymbol("ADD-PARSER-INPUT");

    static private final SubLList $list_alt158 = list(makeSymbol("INPUT"));

    static private final SubLList $list_alt159 = list(list(makeSymbol("PIF"), list(makeSymbol("STRINGP"), makeSymbol("INPUT")), list(makeSymbol("CSETQ"), makeSymbol("PARSER-INPUT"), makeSymbol("INPUT")), list(makeSymbol("WARN"), makeString("~%~S is not a stringp!"), makeSymbol("INPUT"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym160$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSER-FAILURE-BUG-METHOD");

    static private final SubLString $str_alt161$___S_is_not_a_stringp_ = makeString("~%~S is not a stringp!");

    private static final SubLSymbol PARSER_FAILURE_BUG_ADD_PARSER_INPUT_METHOD = makeSymbol("PARSER-FAILURE-BUG-ADD-PARSER-INPUT-METHOD");

    static private final SubLList $list_alt163 = list(list(makeSymbol("PUNLESS"), makeSymbol("PARSER"), list(makeSymbol("WARN"), makeString("Parser slot not initialized yet")), list(RET, makeSymbol("SELF"))), list(makeSymbol("PUNLESS"), makeSymbol("PARSER-INPUT"), list(makeSymbol("WARN"), makeString("Parser Input slot not initialized yet")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("OUT-STREAM"), list(makeSymbol("MAKE-STRING-OUTPUT-STREAM")))), list(makeSymbol("WRITE-LINE"), makeSymbol("COMPONENT"), makeSymbol("OUT-STREAM")), list(makeSymbol("WRITE-LINE"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("OUT-STREAM")), list(makeSymbol("WRITE-LINE"), makeString("errors out on input: "), makeSymbol("OUT-STREAM")), list(makeSymbol("WRITE-LINE"), list(makeSymbol("CCONCATENATE"), makeString("\""), makeSymbol("PARSER-INPUT"), makeString("\"")), makeSymbol("OUT-STREAM")), list(makeSymbol("CSETQ"), makeSymbol("COMMENT"), list(makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("OUT-STREAM")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym164$OUTER_CATCH_FOR_PARSER_FAILURE_BUG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSER-FAILURE-BUG-METHOD");

    static private final SubLString $$$Parser_slot_not_initialized_yet = makeString("Parser slot not initialized yet");

    static private final SubLString $str_alt166$Parser_Input_slot_not_initialized = makeString("Parser Input slot not initialized yet");

    static private final SubLString $str_alt167$errors_out_on_input__ = makeString("errors out on input: ");

    private static final SubLSymbol PARSER_FAILURE_BUG_COMPUTE_COMMENT_METHOD = makeSymbol("PARSER-FAILURE-BUG-COMPUTE-COMMENT-METHOD");

    static private final SubLSymbol $sym169$STRING_ = makeSymbol("STRING=");

    static private final SubLString $$$Allegro = makeString("Allegro");

    static private final SubLString $$$Cycorp_C = makeString("Cycorp C");

    static private final SubLString $$$Cyc_C = makeString("Cyc C");

    static private final SubLString $$$NA = makeString("NA");

    // // Initializers
    public void declareFunctions() {
        declare_bugzilla_file();
    }

    public void initializeVariables() {
        init_bugzilla_file();
    }

    public void runTopLevelForms() {
        setup_bugzilla_file();
    }
}

