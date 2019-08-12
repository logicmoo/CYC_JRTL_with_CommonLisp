/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-BLUE-GRAPHER
 * source file: /cyc/top/cycl/cb-blue-grapher.lisp
 * created:     2019/07/03 17:38:09
 */
public final class cb_blue_grapher extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt71$ = makeString("");

    public static final SubLFile me = new cb_blue_grapher();

 public static final String myName = "com.cyc.cycjava.cycl.cb_blue_grapher";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_blue_grapher_debug$ = makeSymbol("*CB-BLUE-GRAPHER-DEBUG*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_blue_key$ = makeSymbol("*CB-BLUE-KEY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_user_action_data_pred_keys$ = makeSymbol("*CB-BLUE-USER-ACTION-DATA-PRED-KEYS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_user_action_data_fort_keys$ = makeSymbol("*CB-BLUE-USER-ACTION-DATA-FORT-KEYS*");

    // defparameter
    /**
     * Keywords that we hash on in the user-action data slot (a hashtable). We use
     * this to filter out keywords that may come from an HTML form that we don't
     * want to save.
     */
    @LispMethod(comment = "Keywords that we hash on in the user-action data slot (a hashtable). We use\r\nthis to filter out keywords that may come from an HTML form that we don\'t\r\nwant to save.\ndefparameter\nKeywords that we hash on in the user-action data slot (a hashtable). We use\nthis to filter out keywords that may come from an HTML form that we don\'t\nwant to save.")
    public static final SubLSymbol $cb_blue_user_action_data_keys$ = makeSymbol("*CB-BLUE-USER-ACTION-DATA-KEYS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_codebase$ = makeSymbol("*CB-BLUE-CODEBASE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_class_file$ = makeSymbol("*CB-BLUE-CLASS-FILE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_applet_default_width$ = makeSymbol("*CB-BLUE-APPLET-DEFAULT-WIDTH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_applet_default_height$ = makeSymbol("*CB-BLUE-APPLET-DEFAULT-HEIGHT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_cyc_graph_command_add_edge_string$ = makeSymbol("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-EDGE-STRING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_cyc_graph_command_add_graph_string$ = makeSymbol("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-GRAPH-STRING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_cyc_graph_command_add_node_string$ = makeSymbol("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-NODE-STRING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_applet_reset_delay$ = makeSymbol("*CB-BLUE-APPLET-RESET-DELAY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_applet_window_width$ = makeSymbol("*CB-BLUE-APPLET-WINDOW-WIDTH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_blue_applet_window_height$ = makeSymbol("*CB-BLUE-APPLET-WINDOW-HEIGHT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $cb_blue_current_blue_user_action$ = makeSymbol("*CB-BLUE-CURRENT-BLUE-USER-ACTION*");

    static private final SubLList $list2 = list(makeKeyword("SUMMARY-FN"), makeSymbol("CB-BLUE-SUMMARY"), makeKeyword("DISPLAY-FN"), makeSymbol("CB-BLUE"), makeKeyword("HANDLER-FN"), makeSymbol("CB-BLUE"));

    static private final SubLList $list3 = list(makeKeyword("PRED1"), makeKeyword("PRED2"), makeKeyword("PRED3"), makeKeyword("PRED4"), makeKeyword("PRED5"), makeKeyword("PRED6"));

    static private final SubLList $list4 = list(makeKeyword("FORT1"), makeKeyword("FORT2"), makeKeyword("FORT3"), makeKeyword("FORT4"), makeKeyword("FORT5"), makeKeyword("FORT6"));

    private static final SubLSymbol $USER_ACTION_ID_STRING = makeKeyword("USER-ACTION-ID-STRING");

    private static final SubLSymbol $BUILDER_FN_KEY = makeKeyword("BUILDER-FN-KEY");

    static private final SubLList $list11 = list(makeKeyword("MT"), makeKeyword("FILTER-FN-KEYS"), makeKeyword("DEPTH"));

    static private final SubLString $str14$cb_blue__Could_not_create_a_user_ = makeString("cb-blue: Could not create a user action.");

    private static final SubLSymbol $FILTER_FN_KEYS = makeKeyword("FILTER-FN-KEYS");

    static private final SubLList $list17 = list(makeKeyword("BFF-CYC-KB-SUBSET-COLLECTIONS"), makeKeyword("BFF-ARBITRARY-UNIONS"));

    static private final SubLList $list18 = list(makeKeyword("BBF-FORWARD-TRUE"));

    static private final SubLString $str19$_Blue_Grapher_ = makeString("[Blue Grapher]");

    static private final SubLString $str21$cb_blue = makeString("cb-blue");

    static private final SubLSymbol $sym22$CB_LINK__CB_BLUE_KEY_ = makeSymbol("CB-LINK-*CB-BLUE-KEY*");

    private static final SubLString $str23$Blue_Grapher_interaction_in_progr = makeString("Blue Grapher interaction in progress");

    private static final SubLString $$$blueindex = makeString("blueindex");

    private static final SubLString $str26$cb_blue_index_frame = makeString("cb-blue-index-frame");

    private static final SubLString $str27$__user_action_id_string__a = makeString("&:user-action-id-string=~a");

    private static final SubLString $$$bluecontent = makeString("bluecontent");

    private static final SubLString $str30$cb_blue_content_frame = makeString("cb-blue-content-frame");

    private static final SubLString $$$Blue_Grapher = makeString("Blue Grapher");

    private static final SubLSymbol CB_BLUE = makeSymbol("CB-BLUE");

    static private final SubLString $$$Fatal_Error = makeString("Fatal Error");

    static private final SubLString $str35$cb_blue_internal_called_without_a = makeString("cb-blue-internal called without a valid user-action-id-string");

    private static final SubLString $str36$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str37$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $str39$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

    private static final SubLString $str40$40__ = makeString("40,*");

    private static final SubLString $$$no = makeString("no");

    private static final SubLSymbol CB_BLUE_INDEX_FRAME = makeSymbol("CB-BLUE-INDEX-FRAME");

    private static final SubLString $$$Blue_Grapher_Button_Bar = makeString("Blue Grapher Button Bar");

    static private final SubLString $str44$cb_blue_content_frame__user_actio = makeString("cb-blue-content-frame&:user-action-id-string=~A&::action=restart");

    private static final SubLString $$$Restart = makeString("Restart");

    private static final SubLString $str46$_ = makeString("|");

    private static final SubLString $str47$cb_blue_content_frame__user_actio = makeString("cb-blue-content-frame&:user-action-id-string=~A&::mode=build");

    private static final SubLString $$$Build = makeString("Build");

    private static final SubLSymbol CB_BLUE_CONTENT_FRAME = makeSymbol("CB-BLUE-CONTENT-FRAME");

    private static final SubLString $str50$cb_blue_content_frame_internal__n = makeString("cb-blue-content-frame-internal: no user action found");

    private static final SubLString $str53$invalid_mode___A__or_mode_not_imp = makeString("invalid mode (~A) or mode not implemented");

    private static final SubLString $str54$cb_blue_build__no_user_action_fou = makeString("cb-blue-build: no user action found");

    private static final SubLSymbol CB_BLUE_BUILD = makeSymbol("CB-BLUE-BUILD");

    private static final SubLString $str56$cb_blue_build_internal__no_user_a = makeString("cb-blue-build-internal: no user action found");

    private static final SubLSymbol FORT_TO_STRING = makeSymbol("FORT-TO-STRING");

    private static final SubLSymbol TERMS_FOR_BROWSING = makeSymbol("TERMS-FOR-BROWSING");



    private static final SubLString $$$initial_arghash = makeString("initial arghash");

    private static final SubLString $str62$___ = makeString(" : ");

    private static final SubLSymbol $sym63$STRING_ = makeSymbol("STRING<");

    private static final SubLString $$$validation = makeString("validation");





    private static final SubLString $$$arghash_after_validation = makeString("arghash after validation");

    private static final SubLString $str69$_user_action_data_user_action__af = makeString("(user-action-data user-action) after update from arghash");

    private static final SubLString $str70$Blue_Grapher___Building_Graph = makeString("Blue Grapher - Building Graph");

    private static final SubLString $str72$cb_blue_build = makeString("cb-blue-build");

    private static final SubLString $str74$ = makeString("");

    private static final SubLString $str76$onChange_javascript_this_form_sub = makeString("onChange=javascript:this.form.submit();");

    private static final SubLString $str78$___br_ = makeString(".)<br>");

    private static final SubLString $str79$___ = makeString(".) ");

    private static final SubLString $str80$__br_ = makeString(".<br>");

    private static final SubLString $str81$___ = makeString(".  ");

    private static final SubLString $str82$PREDS__ = makeString("PREDS: ");

    private static final SubLString $str83$FORTS__ = makeString("FORTS: ");

    private static final SubLString $str84$MT__ = makeString("MT: ");

    private static final SubLString $str85$FILTER_FNS__ = makeString("FILTER-FNS: ");

    private static final SubLString $str86$DEPTH__ = makeString("DEPTH: ");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $str92$Status__ = makeString("Status: ");

    private static final SubLString $$$Ready_to_ = makeString("Ready to ");

    private static final SubLString $str94$_1 = makeString("+1");

    private static final SubLString $str96$_Visualize_ = makeString("[Visualize]");

    private static final SubLString $str97$Waiting_for_more_input_ = makeString("Waiting for more input.");

    private static final SubLString $str98$Algorithm__ = makeString("Algorithm: ");

    private static final SubLString $str99$Forts__ = makeString("Forts: ");

    private static final SubLString $str100$Preds__ = makeString("Preds: ");

    private static final SubLString $str101$Mt__ = makeString("Mt: ");

    private static final SubLString $str102$Depth__ = makeString("Depth: ");

    private static final SubLString $str103$Filters__ = makeString("Filters: ");

    private static final SubLString $str105$_A = makeString("~A");



    private static final SubLString $str107$cb_graph_event = makeString("cb-graph-event");

    private static final SubLSymbol CB_LINK_GRAPH_EVENT = makeSymbol("CB-LINK-GRAPH-EVENT");

    private static final SubLString $str109$_a = makeString("~a");

    private static final SubLSymbol CB_GRAPH_EVENT_PROCESS = makeSymbol("CB-GRAPH-EVENT-PROCESS");

    private static final SubLSymbol CB_GRAPH_EVENT = makeSymbol("CB-GRAPH-EVENT");

    private static final SubLString $$$CYC = makeString("CYC");

    private static final SubLString $str115$_java_script_editor = makeString("/java/script-editor");

    static private final SubLString $str116$com_cyc_framework_ui_blue_cyc_Cyc = makeString("com.cyc.framework.ui.blue.cyc.CycGraphApplet");

    private static final SubLString $str117$100_ = makeString("100%");

    private static final SubLString $str118$90_ = makeString("90%");

    private static final SubLString $str119$com_cyc_framework_ui_blue_cyc_Cyc = makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddEdge");

    private static final SubLString $str120$com_cyc_framework_ui_blue_cyc_Cyc = makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddGraph");

    private static final SubLString $str121$com_cyc_framework_ui_blue_cyc_Cyc = makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddNode");

    private static final SubLString $str127$script_editor = makeString("script-editor");

    private static final SubLString $$$user = makeString("user");

    private static final SubLString $str130$domain_mt = makeString("domain_mt");

    private static final SubLString $str131$parsing_mt = makeString("parsing_mt");

    private static final SubLString $str132$generation_mt = makeString("generation_mt");

    private static final SubLString $$$signature = makeString("signature");

    private static final SubLString $$$baseport = makeString("baseport");

    private static final SubLString $str135$_Java_applet_could_not_be_display = makeString("[Java applet could not be displayed]");

    private static final SubLInteger $int$1010 = makeInteger(1010);

    private static final SubLInteger $int$750 = makeInteger(750);

    private static final SubLSymbol CB_BLUE_APPLET_WINDOW = makeSymbol("CB-BLUE-APPLET-WINDOW");

    private static final SubLString $$$Blue_Graph = makeString("Blue Graph");

    static private final SubLList $list140 = list(makeKeyword("DEPENDENT"), makeKeyword("NO"));

    private static final SubLList $list143 = list(list(makeKeyword("HOTKEYS"), makeKeyword("NO")), list(makeKeyword("DIRECTORIES"), makeKeyword("NO")), list(makeKeyword("MENUBAR"), makeKeyword("NO")), list(makeKeyword("RESIZABLE"), makeKeyword("YES")), list(makeKeyword("SCROLLBARS"), makeKeyword("YES")), list(makeKeyword("TOOLBAR"), makeKeyword("NO")));

    private static final SubLString $str144$cb_blue_applet_window = makeString("cb-blue-applet-window");

    private static final SubLString $str145$window_open__ = makeString("window.open('");

    private static final SubLString $str146$__ = makeString("',");

    private static final SubLString $str147$__A_ = makeString("'~A'");

    private static final SubLString $$$null = makeString("null");

    private static final SubLString $str149$___A____ = makeString(",'~A'); ");

    private static final SubLString $str150$return_false_ = makeString("return false;");

    private static final SubLSymbol $BLUE_APPLET_WINDOW = makeKeyword("BLUE-APPLET-WINDOW");

    private static final SubLSymbol CB_LINK_BLUE_APPLET_WINDOW = makeSymbol("CB-LINK-BLUE-APPLET-WINDOW");

    public static final SubLObject cb_blue_new_user_action_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_action = user_actions.new_user_action(list($CYCLIST, operation_communication.the_cyclist(), $TYPE_KEY, $cb_blue_key$.getDynamicValue(thread)));
                if (NIL == user_actions.user_action_p(user_action)) {
                    Errors.error($str_alt14$cb_blue__Could_not_create_a_user_);
                }
                user_actions._csetf_user_action_creation_time(user_action, get_universal_time());
                user_actions._csetf_user_action_data(user_action, make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED));
                sethash($USER_ACTION_ID_STRING, user_actions.user_action_data(user_action), list(user_actions.user_action_id_string(user_action)));
                com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_restart(user_action);
                com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_remove_transient_user_action_data(user_action);
                return user_action;
            }
        }
    }

    public static SubLObject cb_blue_new_user_action() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user_action = user_actions.new_user_action(list($CYCLIST, operation_communication.the_cyclist(), $TYPE_KEY, $cb_blue_key$.getDynamicValue(thread)));
        if (NIL == user_actions.user_action_p(user_action)) {
            Errors.error($str14$cb_blue__Could_not_create_a_user_);
        }
        user_actions._csetf_user_action_creation_time(user_action, get_universal_time());
        user_actions._csetf_user_action_data(user_action, make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED));
        sethash($USER_ACTION_ID_STRING, user_actions.user_action_data(user_action), list(user_actions.user_action_id_string(user_action)));
        cb_blue_restart(user_action);
        cb_blue_remove_transient_user_action_data(user_action);
        return user_action;
    }

    public static final SubLObject cb_blue_remove_transient_user_action_data_alt(SubLObject user_action) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_data = user_actions.user_action_data(user_action);
                user_actions._csetf_user_action_data(user_action, make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED));
                if (old_data.isHashtable()) {
                    {
                        SubLObject k = NIL;
                        SubLObject v = NIL;
                        {
                            final Iterator cdohash_iterator = getEntrySetIterator(old_data);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    k = getEntryKey(cdohash_entry);
                                    v = getEntryValue(cdohash_entry);
                                    if (NIL != subl_promotions.memberP(k, $cb_blue_user_action_data_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                        sethash(k, user_actions.user_action_data(user_action), v);
                                    }
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_blue_remove_transient_user_action_data(final SubLObject user_action) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_data = user_actions.user_action_data(user_action);
        user_actions._csetf_user_action_data(user_action, make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED));
        if (old_data.isHashtable()) {
            SubLObject k = NIL;
            SubLObject v = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(old_data);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    k = getEntryKey(cdohash_entry);
                    v = getEntryValue(cdohash_entry);
                    if (NIL != subl_promotions.memberP(k, $cb_blue_user_action_data_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        sethash(k, user_actions.user_action_data(user_action), v);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_blue_update_user_action_data_from_arghash_alt(SubLObject user_action, SubLObject arghash) {
        hash_table_utilities.copy_hash_table_values_into(arghash, user_actions.user_action_data(user_action));
        hash_table_utilities.copy_hash_table_values_into(user_actions.user_action_data(user_action), arghash);
        com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_remove_transient_user_action_data(user_action);
        return arghash;
    }

    public static SubLObject cb_blue_update_user_action_data_from_arghash(final SubLObject user_action, final SubLObject arghash) {
        hash_table_utilities.copy_hash_table_values_into(arghash, user_actions.user_action_data(user_action));
        hash_table_utilities.copy_hash_table_values_into(user_actions.user_action_data(user_action), arghash);
        cb_blue_remove_transient_user_action_data(user_action);
        return arghash;
    }

    public static final SubLObject cb_blue_remove_keys_from_user_action_data_alt(SubLObject user_action, SubLObject keys) {
        {
            SubLObject cdolist_list_var = keys;
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                remhash(key, user_actions.user_action_data(user_action));
            }
        }
        return NIL;
    }

    public static SubLObject cb_blue_remove_keys_from_user_action_data(final SubLObject user_action, final SubLObject keys) {
        SubLObject cdolist_list_var = keys;
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            remhash(key, user_actions.user_action_data(user_action));
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cb_blue_restart_alt(SubLObject user_action) {
        {
            SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
            SubLObject user_action_id_string = gethash($USER_ACTION_ID_STRING, user_actions.user_action_data(user_action), UNPROVIDED);
            html_arghash.set_arghash_value($MODE, arghash, $BUILD);
            html_arghash.set_arghash_value_list($FILTER_FN_KEYS, arghash, $list_alt17);
            html_arghash.set_arghash_value_list($BUILDER_FN_KEY, arghash, $list_alt18);
            user_actions._csetf_user_action_data(user_action, make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED));
            sethash($USER_ACTION_ID_STRING, user_actions.user_action_data(user_action), user_action_id_string);
            arghash = com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_update_user_action_data_from_arghash(user_action, arghash);
            return arghash;
        }
    }

    public static SubLObject cb_blue_restart(final SubLObject user_action) {
        SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
        final SubLObject user_action_id_string = gethash($USER_ACTION_ID_STRING, user_actions.user_action_data(user_action), UNPROVIDED);
        html_arghash.set_arghash_value($MODE, arghash, $BUILD);
        html_arghash.set_arghash_value_list($FILTER_FN_KEYS, arghash, $list17);
        html_arghash.set_arghash_value_list($BUILDER_FN_KEY, arghash, $list18);
        user_actions._csetf_user_action_data(user_action, make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED));
        sethash($USER_ACTION_ID_STRING, user_actions.user_action_data(user_action), user_action_id_string);
        arghash = cb_blue_update_user_action_data_from_arghash(user_action, arghash);
        return arghash;
    }

    public static final SubLObject cb_link_Xcb_blue_keyX_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt19$_Blue_Grapher_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt21$cb_blue);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_Xcb_blue_keyX(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str19$_Blue_Grapher_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str21$cb_blue);
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

    public static final SubLObject cb_blue_summary_alt(SubLObject user_action_id_string) {
        {
            SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
            html_princ($str_alt25$Blue_Grapher_interaction_in_progr);
        }
        return NIL;
    }

    public static SubLObject cb_blue_summary(final SubLObject user_action_id_string) {
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        html_princ($str23$Blue_Grapher_interaction_in_progr);
        return NIL;
    }

    public static final SubLObject cb_blue_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$Blue_Grapher);
        }
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            return com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_internal(arghash);
        }
    }

    public static SubLObject cb_blue(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$Blue_Grapher);
        }
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        return cb_blue_internal(arghash);
    }

    public static final SubLObject cb_blue_internal_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_action_id_string = hash_table_utilities.gethash_first($USER_ACTION_ID_STRING, arghash, UNPROVIDED);
                SubLObject user_action = NIL;
                if (NIL != user_action_id_string) {
                    user_action = user_actions.user_action_by_id_string(user_action_id_string);
                } else {
                    {
                        SubLObject all_blue_actions_for_user = user_actions.all_actions_for_cyclist_of_type(operation_communication.the_cyclist(), $cb_blue_key$.getDynamicValue(thread));
                        SubLObject pcase_var = length(all_blue_actions_for_user);
                        if (pcase_var.eql(ZERO_INTEGER)) {
                            {
                                SubLObject user_action_1 = com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_new_user_action();
                                hash_table_utilities.push_hash($USER_ACTION_ID_STRING, user_actions.user_action_id_string(user_action_1), arghash);
                                com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_internal(arghash);
                                return NIL;
                            }
                        } else {
                            if (pcase_var.eql(ONE_INTEGER)) {
                                user_action = all_blue_actions_for_user.first();
                                user_action_id_string = user_actions.user_action_id_string(user_action);
                            } else {
                                cb_user_actions.cb_show_actions_internal($cb_blue_key$.getDynamicValue(thread));
                                return NIL;
                            }
                        }
                    }
                }
                if (NIL == user_actions.user_action_p(user_action)) {
                    cyc_navigator_internals.generic_message_page($$$Fatal_Error, format(NIL, $str_alt35$cb_blue_internal_called_without_a));
                } else {
                    html_markup(html_macros.$html_html_head$.getGlobalValue());
                    if (NIL != html_macros.html_inside_body_p()) {
                        Errors.error($str_alt36$Cannot_have_a_FRAMESET_tag_inside);
                    }
                    html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str_alt37$40__);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_frameset_frameborder$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$no);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_frame($BLUE_INDEX, user_action_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            cb_frame($BLUE_CONTENT, user_action_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_blue_internal(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject user_action_id_string = hash_table_utilities.gethash_first($USER_ACTION_ID_STRING, arghash, UNPROVIDED);
        SubLObject user_action = NIL;
        if (NIL != user_action_id_string) {
            user_action = user_actions.user_action_by_id_string(user_action_id_string);
        } else {
            final SubLObject all_blue_actions_for_user = user_actions.all_actions_for_cyclist_of_type(operation_communication.the_cyclist(), $cb_blue_key$.getDynamicValue(thread));
            final SubLObject pcase_var = length(all_blue_actions_for_user);
            if (pcase_var.eql(ZERO_INTEGER)) {
                final SubLObject user_action_$1 = cb_blue_new_user_action();
                hash_table_utilities.push_hash($USER_ACTION_ID_STRING, user_actions.user_action_id_string(user_action_$1), arghash);
                cb_blue_internal(arghash);
                return NIL;
            }
            if (!pcase_var.eql(ONE_INTEGER)) {
                cb_user_actions.cb_show_actions_internal($cb_blue_key$.getDynamicValue(thread));
                return NIL;
            }
            user_action = all_blue_actions_for_user.first();
            user_action_id_string = user_actions.user_action_id_string(user_action);
        }
        if (NIL == user_actions.user_action_p(user_action)) {
            cyc_navigator_internals.generic_message_page($$$Fatal_Error, format(NIL, $str35$cb_blue_internal_called_without_a));
        } else {
            html_markup($str36$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str37$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                if (NIL != html_macros.html_inside_body_p()) {
                    Errors.error($str39$Cannot_have_a_FRAMESET_tag_inside);
                }
                html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str40$40__);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_frameset_frameborder$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$no);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_frame($BLUE_INDEX, user_action_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cb_frame($BLUE_CONTENT, user_action_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_blue_index_frame_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            return com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_index_frame_internal(arghash);
        }
    }

    public static SubLObject cb_blue_index_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        return cb_blue_index_frame_internal(arghash);
    }

    public static final SubLObject cb_blue_index_frame_internal_alt(SubLObject arghash) {
        {
            SubLObject user_action = cb_user_actions.get_user_action_from_arghash(arghash);
            if (NIL != user_action) {
                com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_button_bar(user_action);
            }
        }
        return NIL;
    }

    public static SubLObject cb_blue_index_frame_internal(final SubLObject arghash) {
        final SubLObject user_action = cb_user_actions.get_user_action_from_arghash(arghash);
        if (NIL != user_action) {
            cb_blue_button_bar(user_action);
        }
        return NIL;
    }

    public static final SubLObject cb_blue_button_bar_alt(SubLObject user_action) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == user_actions.user_action_p(user_action)) {
                return NIL;
            }
            {
                SubLObject user_action_id_string = user_actions.user_action_id_string(user_action);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ($$$Blue_Grapher_Button_Bar);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(html_macros.$html_color_lighter_blue$.getDynamicValue(thread)));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$Blue_Grapher);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_indent(THREE_INTEGER);
                                {
                                    SubLObject frame_name_var = cb_frame_name($BLUE_CONTENT);
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    cyc_cgi_url_int();
                                    html_princ(format(NIL, $str_alt41$cb_blue_content_frame__user_actio, user_action_id_string));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != frame_name_var) {
                                        html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(frame_name_var);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($$$Restart);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_indent(UNPROVIDED);
                                html_princ($str_alt43$_);
                                html_indent(UNPROVIDED);
                                {
                                    SubLObject frame_name_var = cb_frame_name($BLUE_CONTENT);
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    cyc_cgi_url_int();
                                    html_princ(format(NIL, $str_alt44$cb_blue_content_frame__user_actio, user_action_id_string));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != frame_name_var) {
                                        html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(frame_name_var);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($$$Build);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_blue_button_bar(final SubLObject user_action) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == user_actions.user_action_p(user_action)) {
            return NIL;
        }
        final SubLObject user_action_id_string = user_actions.user_action_id_string(user_action);
        html_markup($str36$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str37$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Blue_Grapher_Button_Bar);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_lighter_blue$.getGlobalValue()) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(html_macros.$html_color_lighter_blue$.getGlobalValue()));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($$$Blue_Grapher);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_indent(THREE_INTEGER);
                    SubLObject frame_name_var = cb_frame_name($BLUE_CONTENT);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    html_princ(format(NIL, $str44$cb_blue_content_frame__user_actio, user_action_id_string));
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Restart);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_indent(UNPROVIDED);
                    html_princ($str46$_);
                    html_indent(UNPROVIDED);
                    frame_name_var = cb_frame_name($BLUE_CONTENT);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    html_princ(format(NIL, $str47$cb_blue_content_frame__user_actio, user_action_id_string));
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Build);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_blue_content_frame_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            return com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_content_frame_internal(arghash);
        }
    }

    public static SubLObject cb_blue_content_frame(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        return cb_blue_content_frame_internal(arghash);
    }

    public static final SubLObject cb_blue_content_frame_internal_alt(SubLObject arghash) {
        {
            SubLObject user_action = cb_user_actions.get_user_action_from_arghash(arghash);
            if (NIL == user_action) {
                cb_error($str_alt47$cb_blue_content_frame_internal__n, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_update_user_action_data_from_arghash(user_action, arghash);
            {
                SubLObject action = hash_table_utilities.gethash_first($ACTION, arghash, UNPROVIDED);
                SubLObject pcase_var = action;
                if (pcase_var.eql($RESTART)) {
                    arghash = com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_restart(user_action);
                }
            }
            {
                SubLObject mode = hash_table_utilities.gethash_first($MODE, arghash, UNPROVIDED);
                SubLObject pcase_var = mode;
                if (pcase_var.eql($BUILD)) {
                    com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_build_internal(arghash, UNPROVIDED);
                } else {
                    cb_error($str_alt50$invalid_mode___A__or_mode_not_imp, mode, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_blue_content_frame_internal(SubLObject arghash) {
        final SubLObject user_action = cb_user_actions.get_user_action_from_arghash(arghash);
        if (NIL == user_action) {
            cb_error($str50$cb_blue_content_frame_internal__n, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        cb_blue_update_user_action_data_from_arghash(user_action, arghash);
        SubLObject pcase_var;
        final SubLObject action = pcase_var = hash_table_utilities.gethash_first($ACTION, arghash, UNPROVIDED);
        if (pcase_var.eql($RESTART)) {
            arghash = cb_blue_restart(user_action);
        }
        final SubLObject mode = pcase_var = hash_table_utilities.gethash_first($MODE, arghash, UNPROVIDED);
        if (pcase_var.eql($BUILD)) {
            cb_blue_build_internal(arghash, UNPROVIDED);
        } else {
            cb_error($str53$invalid_mode___A__or_mode_not_imp, mode, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_blue_build_alt(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject user_action = cb_user_actions.get_user_action_from_arghash(arghash);
            if (NIL == user_action) {
                cb_error($str_alt51$cb_blue_build__no_user_action_fou, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_update_user_action_data_from_arghash(user_action, arghash);
            com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_build_internal(arghash, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_blue_build(final SubLObject args) {
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        final SubLObject user_action = cb_user_actions.get_user_action_from_arghash(arghash);
        if (NIL == user_action) {
            cb_error($str54$cb_blue_build__no_user_action_fou, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        cb_blue_update_user_action_data_from_arghash(user_action, arghash);
        cb_blue_build_internal(arghash, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_blue_build_internal_alt(SubLObject raw_arghash, SubLObject user_action) {
        if (user_action == UNPROVIDED) {
            user_action = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == user_action) {
                user_action = cb_user_actions.get_user_action_from_arghash(raw_arghash);
                if (NIL == user_action) {
                    cb_error($str_alt53$cb_blue_build_internal__no_user_a, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
            }
            {
                SubLObject debug = $cb_blue_grapher_debug$.getDynamicValue(thread);
                SubLObject generation_fn = symbol_function(FORT_TO_STRING);
                SubLObject parse_fn = symbol_function(TERMS_FOR_BROWSING);
                SubLObject filter_mt = (NIL != fort_types_interface.mtP(html_arghash.get_arghash_value($MT, raw_arghash))) ? ((SubLObject) (html_arghash.get_arghash_value($MT, raw_arghash))) : $$CyclistsMt;
                if (NIL != debug) {
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($$$initial_arghash);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(raw_arghash), symbol_function($sym60$STRING_), symbol_function(SYMBOL_NAME));
                        SubLObject k = NIL;
                        for (k = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , k = cdolist_list_var.first()) {
                            html_princ(k);
                            html_princ($str_alt59$___);
                            html_princ(gethash(k, raw_arghash, UNPROVIDED));
                            html_newline(UNPROVIDED);
                        }
                    }
                }
                if (NIL != debug) {
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($$$validation);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                }
                html_arghash.html_arghash_nl_fort_list_input_validate(raw_arghash, $PREDS, $cb_blue_user_action_data_pred_keys$.getGlobalValue(), debug, generation_fn, parse_fn, $$Predicate, filter_mt);
                html_arghash.html_arghash_nl_fort_list_input_validate(raw_arghash, $FORTS, $cb_blue_user_action_data_fort_keys$.getGlobalValue(), debug, generation_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_arghash.html_arghash_nl_fort_input_validate(raw_arghash, $MT, debug, generation_fn, parse_fn, $$Microtheory, mt_vars.$mt_mt$.getGlobalValue());
                if (NIL != debug) {
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($$$arghash_after_validation);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(raw_arghash), symbol_function($sym60$STRING_), symbol_function(SYMBOL_NAME));
                        SubLObject k = NIL;
                        for (k = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , k = cdolist_list_var.first()) {
                            html_princ(k);
                            html_princ($str_alt59$___);
                            html_princ(gethash(k, raw_arghash, UNPROVIDED));
                            html_newline(UNPROVIDED);
                        }
                    }
                }
                com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_remove_keys_from_user_action_data(user_action, $cb_blue_user_action_data_fort_keys$.getGlobalValue());
                com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_remove_keys_from_user_action_data(user_action, $cb_blue_user_action_data_pred_keys$.getGlobalValue());
                com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_update_user_action_data_from_arghash(user_action, raw_arghash);
                if (NIL != debug) {
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($str_alt66$_user_action_data_user_action__af);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(user_actions.user_action_data(user_action)), symbol_function($sym60$STRING_), symbol_function(SYMBOL_NAME));
                        SubLObject k = NIL;
                        for (k = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , k = cdolist_list_var.first()) {
                            html_princ(k);
                            html_princ($str_alt59$___);
                            html_princ(gethash(k, user_actions.user_action_data(user_action), UNPROVIDED));
                            html_newline(UNPROVIDED);
                        }
                    }
                }
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ($str_alt67$Blue_Grapher___Building_Graph);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_complete.html_complete_script();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (true) {
                                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($POST);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_hidden_input($str_alt69$cb_blue_build, T, UNPROVIDED);
                                        html_arghash.html_arghash_hidden_input(raw_arghash, $USER_ACTION_ID_STRING, UNPROVIDED, UNPROVIDED);
                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($TOP));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt71$);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject key_string = html_arghash.arghash_make_key_string($BUILDER_FN_KEY, $KEYWORD);
                                                                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(key_string);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_indent(ONE_INTEGER);
                                                                    html_markup($str_alt73$onChange_javascript_this_form_sub);
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            {
                                                                                SubLObject value = NIL;
                                                                                SubLObject value_12 = NIL;
                                                                                SubLObject value_string = NIL;
                                                                                SubLObject value_string_13 = NIL;
                                                                                for (value = blue_grapher_utilities.blue_builder_fn_keys(), value_12 = value.first(), value_string = blue_grapher_utilities.blue_builder_fn_keys(), value_string_13 = value_string.first(); !((NIL == value_string) && (NIL == value)); value = value.rest() , value_12 = value.first() , value_string = value_string.rest() , value_string_13 = value_string.first()) {
                                                                                    {
                                                                                        SubLObject selected = list_utilities.member_equalP(value_12, html_arghash.get_arghash_value_list($BUILDER_FN_KEY, raw_arghash));
                                                                                        SubLObject value_string_14 = html_arghash.arghash_get_string(value_12, $KEYWORD);
                                                                                        html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                        if (NIL != selected) {
                                                                                            html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                        }
                                                                                        if (NIL != value_string_14) {
                                                                                            html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_markup(value_string_14);
                                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_princ(value_string_13);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                                            }
                                                                                        }
                                                                                        html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                    {
                                                                        SubLObject bbf_help_string = blue_grapher_utilities.get_blue_builder_fn_def_value(html_arghash.get_arghash_value($BUILDER_FN_KEY, raw_arghash), $HELP_STRING);
                                                                        if (bbf_help_string.isString()) {
                                                                            bbf_help_string = string_utilities.string_substitute($str_alt75$___br_, $str_alt76$___, bbf_help_string, UNPROVIDED);
                                                                            bbf_help_string = string_utilities.string_substitute($str_alt77$__br_, $str_alt78$___, bbf_help_string, UNPROVIDED);
                                                                            html_newline(UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                    html_princ(bbf_help_string);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($TOP));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt79$PREDS__);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_nl_fort_list_input(raw_arghash, $PREDS, $cb_blue_user_action_data_pred_keys$.getGlobalValue(), debug, generation_fn, ONE_INTEGER, ONE_INTEGER, T, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($TOP));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt80$FORTS__);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_nl_fort_list_input(raw_arghash, $FORTS, $cb_blue_user_action_data_fort_keys$.getGlobalValue(), debug, generation_fn, ONE_INTEGER, TWO_INTEGER, T, $$Predicate);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($TOP));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt81$MT__);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_nl_fort_input(raw_arghash, $MT, debug, generation_fn, T, T, $$Microtheory);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($TOP));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt82$FILTER_FNS__);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = blue_grapher_utilities.blue_filter_fn_keys(UNPROVIDED);
                                                                    SubLObject filter_fn_key = NIL;
                                                                    for (filter_fn_key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter_fn_key = cdolist_list_var.first()) {
                                                                        html_arghash.html_arghash_checkbox_input(raw_arghash, $FILTER_FN_KEYS, filter_fn_key, UNPROVIDED, UNPROVIDED);
                                                                        html_princ(filter_fn_key);
                                                                        html_newline(UNPROVIDED);
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($TOP));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt83$DEPTH__);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_text_input(raw_arghash, $DEPTH, ONE_INTEGER, THREE_INTEGER, $INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($TOP));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_glyph($NBSP, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_arghash.html_arghash_submit_input(raw_arghash, $$$Submit, $SUBMIT, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                {
                                                    SubLObject builder_fn_key = html_arghash.get_arghash_value($BUILDER_FN_KEY, raw_arghash);
                                                    SubLObject v_forts = html_arghash.get_arghash_value_list($FORTS, raw_arghash);
                                                    SubLObject preds = html_arghash.get_arghash_value_list($PREDS, raw_arghash);
                                                    SubLObject mt = html_arghash.get_arghash_value($MT, raw_arghash);
                                                    SubLObject depth = html_arghash.get_arghash_value($DEPTH, raw_arghash);
                                                    SubLObject filter_fn_keys = html_arghash.get_arghash_value_list($FILTER_FN_KEYS, raw_arghash);
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(html_align($TOP));
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                    html_princ($str_alt89$Status__);
                                                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    if ((((intern(string_utilities.string_from_keyword(builder_fn_key), UNPROVIDED).isFunctionSpec() && ZERO_INTEGER.numL(length(v_forts))) && ZERO_INTEGER.numL(length(preds))) && (NIL != fort_types_interface.microtheory_p(mt))) && depth.isNumber()) {
                                                                        html_princ($str_alt90$Ready_to_);
                                                                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup($str_alt91$_1);
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                                cb_link($GRAPH_EVENT, $str_alt93$_Visualize_, user_actions.user_action_data(user_action), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                    } else {
                                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                        html_princ($str_alt94$Waiting_for_more_input_);
                                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                    }
                                                                    html_newline(TWO_INTEGER);
                                                                    html_princ($str_alt95$Algorithm__);
                                                                    html_princ(builder_fn_key);
                                                                    html_newline(UNPROVIDED);
                                                                    html_princ($str_alt96$Forts__);
                                                                    cb_form(v_forts, UNPROVIDED, UNPROVIDED);
                                                                    html_newline(UNPROVIDED);
                                                                    html_princ($str_alt97$Preds__);
                                                                    cb_form(preds, UNPROVIDED, UNPROVIDED);
                                                                    html_newline(UNPROVIDED);
                                                                    html_princ($str_alt98$Mt__);
                                                                    cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                                    html_newline(UNPROVIDED);
                                                                    html_princ($str_alt99$Depth__);
                                                                    html_princ(depth);
                                                                    html_newline(UNPROVIDED);
                                                                    html_princ($str_alt100$Filters__);
                                                                    html_princ(filter_fn_keys);
                                                                    html_newline(UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                            }
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_blue_build_internal(final SubLObject raw_arghash, SubLObject user_action) {
        if (user_action == UNPROVIDED) {
            user_action = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == user_action) {
            user_action = cb_user_actions.get_user_action_from_arghash(raw_arghash);
            if (NIL == user_action) {
                cb_error($str56$cb_blue_build_internal__no_user_a, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
        }
        final SubLObject debug = $cb_blue_grapher_debug$.getDynamicValue(thread);
        final SubLObject generation_fn = symbol_function(FORT_TO_STRING);
        final SubLObject parse_fn = symbol_function(TERMS_FOR_BROWSING);
        final SubLObject filter_mt = (NIL != fort_types_interface.mtP(html_arghash.get_arghash_value($MT, raw_arghash))) ? html_arghash.get_arghash_value($MT, raw_arghash) : $$CyclistsMt;
        if (NIL != debug) {
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(THREE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($$$initial_arghash);
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(THREE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(raw_arghash), symbol_function($sym63$STRING_), symbol_function(SYMBOL_NAME));
            SubLObject k = NIL;
            k = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_princ(k);
                html_princ($str62$___);
                html_princ(gethash(k, raw_arghash, UNPROVIDED));
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                k = cdolist_list_var.first();
            } 
        }
        if (NIL != debug) {
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(THREE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($$$validation);
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(THREE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
        }
        html_arghash.html_arghash_nl_fort_list_input_validate(raw_arghash, $PREDS, $cb_blue_user_action_data_pred_keys$.getGlobalValue(), debug, generation_fn, parse_fn, $$Predicate, filter_mt);
        html_arghash.html_arghash_nl_fort_list_input_validate(raw_arghash, $FORTS, $cb_blue_user_action_data_fort_keys$.getGlobalValue(), debug, generation_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_arghash.html_arghash_nl_fort_input_validate(raw_arghash, $MT, debug, generation_fn, parse_fn, $$Microtheory, mt_vars.$mt_mt$.getGlobalValue());
        if (NIL != debug) {
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(THREE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($$$arghash_after_validation);
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(THREE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(raw_arghash), symbol_function($sym63$STRING_), symbol_function(SYMBOL_NAME));
            SubLObject k = NIL;
            k = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_princ(k);
                html_princ($str62$___);
                html_princ(gethash(k, raw_arghash, UNPROVIDED));
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                k = cdolist_list_var.first();
            } 
        }
        cb_blue_remove_keys_from_user_action_data(user_action, $cb_blue_user_action_data_fort_keys$.getGlobalValue());
        cb_blue_remove_keys_from_user_action_data(user_action, $cb_blue_user_action_data_pred_keys$.getGlobalValue());
        cb_blue_update_user_action_data_from_arghash(user_action, raw_arghash);
        if (NIL != debug) {
            html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_markup(THREE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($str69$_user_action_data_user_action__af);
            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_markup(THREE_INTEGER);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(user_actions.user_action_data(user_action)), symbol_function($sym63$STRING_), symbol_function(SYMBOL_NAME));
            SubLObject k = NIL;
            k = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_princ(k);
                html_princ($str62$___);
                html_princ(gethash(k, user_actions.user_action_data(user_action), UNPROVIDED));
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                k = cdolist_list_var.first();
            } 
        }
        html_markup($str36$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str37$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($str70$Blue_Grapher___Building_Graph);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($POST);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str72$cb_blue_build, T, UNPROVIDED);
                        html_arghash.html_arghash_hidden_input(raw_arghash, $USER_ACTION_ID_STRING, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str74$);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    final SubLObject key_string = html_arghash.arghash_make_key_string($BUILDER_FN_KEY, $KEYWORD);
                                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(key_string);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_space, UNPROVIDED);
                                    html_markup($str76$onChange_javascript_this_form_sub);
                                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        SubLObject value = NIL;
                                        SubLObject value_$15 = NIL;
                                        SubLObject value_string = NIL;
                                        SubLObject value_string_$16 = NIL;
                                        value = blue_grapher_utilities.blue_builder_fn_keys();
                                        value_$15 = value.first();
                                        value_string = blue_grapher_utilities.blue_builder_fn_keys();
                                        value_string_$16 = value_string.first();
                                        while ((NIL != value_string) || (NIL != value)) {
                                            final SubLObject selected = list_utilities.member_equalP(value_$15, html_arghash.get_arghash_value_list($BUILDER_FN_KEY, raw_arghash));
                                            final SubLObject value_string_$17 = html_arghash.arghash_get_string(value_$15, $KEYWORD);
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            if (NIL != selected) {
                                                html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            }
                                            if (NIL != value_string_$17) {
                                                html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(value_string_$17);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ(value_string_$16);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            value = value.rest();
                                            value_$15 = value.first();
                                            value_string = value_string.rest();
                                            value_string_$16 = value_string.first();
                                        } 
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                    }
                                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    SubLObject bbf_help_string = blue_grapher_utilities.get_blue_builder_fn_def_value(html_arghash.get_arghash_value($BUILDER_FN_KEY, raw_arghash), $HELP_STRING);
                                    if (bbf_help_string.isString()) {
                                        bbf_help_string = string_utilities.string_substitute($str78$___br_, $str79$___, bbf_help_string, UNPROVIDED);
                                        bbf_help_string = string_utilities.string_substitute($str80$__br_, $str81$___, bbf_help_string, UNPROVIDED);
                                        html_newline(UNPROVIDED);
                                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                            html_princ(bbf_help_string);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str82$PREDS__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_arghash.html_arghash_nl_fort_list_input(raw_arghash, $PREDS, $cb_blue_user_action_data_pred_keys$.getGlobalValue(), debug, generation_fn, ONE_INTEGER, ONE_INTEGER, T, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str83$FORTS__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_arghash.html_arghash_nl_fort_list_input(raw_arghash, $FORTS, $cb_blue_user_action_data_fort_keys$.getGlobalValue(), debug, generation_fn, ONE_INTEGER, TWO_INTEGER, T, $$Predicate);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str84$MT__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_arghash.html_arghash_nl_fort_input(raw_arghash, $MT, debug, generation_fn, T, T, $$Microtheory);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str85$FILTER_FNS__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject cdolist_list_var2 = blue_grapher_utilities.blue_filter_fn_keys(UNPROVIDED);
                                    SubLObject filter_fn_key = NIL;
                                    filter_fn_key = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        html_arghash.html_arghash_checkbox_input(raw_arghash, $FILTER_FN_KEYS, filter_fn_key, UNPROVIDED, UNPROVIDED);
                                        html_princ(filter_fn_key);
                                        html_newline(UNPROVIDED);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        filter_fn_key = cdolist_list_var2.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str86$DEPTH__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_arghash.html_arghash_text_input(raw_arghash, $DEPTH, ONE_INTEGER, THREE_INTEGER, $INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_arghash.html_arghash_submit_input(raw_arghash, $$$Submit, $SUBMIT, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            final SubLObject builder_fn_key = html_arghash.get_arghash_value($BUILDER_FN_KEY, raw_arghash);
                            final SubLObject v_forts = html_arghash.get_arghash_value_list($FORTS, raw_arghash);
                            final SubLObject preds = html_arghash.get_arghash_value_list($PREDS, raw_arghash);
                            final SubLObject mt = html_arghash.get_arghash_value($MT, raw_arghash);
                            final SubLObject depth = html_arghash.get_arghash_value($DEPTH, raw_arghash);
                            final SubLObject filter_fn_keys = html_arghash.get_arghash_value_list($FILTER_FN_KEYS, raw_arghash);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str92$Status__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if ((((intern(string_utilities.string_from_keyword(builder_fn_key), UNPROVIDED).isFunctionSpec() && ZERO_INTEGER.numL(length(v_forts))) && ZERO_INTEGER.numL(length(preds))) && (NIL != fort_types_interface.microtheory_p(mt))) && depth.isNumber()) {
                                        html_princ($$$Ready_to_);
                                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str94$_1);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            cb_link($GRAPH_EVENT, $str96$_Visualize_, user_actions.user_action_data(user_action), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                                        }
                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    } else {
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str97$Waiting_for_more_input_);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    html_newline(TWO_INTEGER);
                                    html_princ($str98$Algorithm__);
                                    html_princ(builder_fn_key);
                                    html_newline(UNPROVIDED);
                                    html_princ($str99$Forts__);
                                    cb_form(v_forts, UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    html_princ($str100$Preds__);
                                    cb_form(preds, UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    html_princ($str101$Mt__);
                                    cb_form(mt, UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    html_princ($str102$Depth__);
                                    html_princ(depth);
                                    html_newline(UNPROVIDED);
                                    html_princ($str103$Filters__);
                                    html_princ(filter_fn_keys);
                                    html_newline(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_graph_event_alt(SubLObject linktext, SubLObject arghash) {
        html_arghash.set_arghash_value($SIGNATURE, arghash, format(NIL, $str_alt102$_A, random.random(expt(TWO_INTEGER, $int$32))));
        com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_applet_window_link(arghash, linktext, $str_alt104$cb_graph_event);
        return NIL;
    }

    public static SubLObject cb_link_graph_event(final SubLObject linktext, final SubLObject arghash) {
        html_arghash.set_arghash_value($SIGNATURE, arghash, format(NIL, $str105$_A, random.random(expt(TWO_INTEGER, $int$30))));
        cb_blue_applet_window_link(arghash, linktext, $str107$cb_graph_event);
        return NIL;
    }

    public static final SubLObject cb_graph_event_alt(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            html_arghash.set_arghash_value($SIGNATURE, arghash, format(NIL, $str_alt106$_a, random.random(expt(TWO_INTEGER, $int$32))));
            com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_applet_window_internal(arghash);
            subl_promotions.make_process_with_args($str_alt104$cb_graph_event, symbol_function(CB_GRAPH_EVENT_PROCESS), list(arghash));
            return NIL;
        }
    }

    public static SubLObject cb_graph_event(final SubLObject args) {
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        html_arghash.set_arghash_value($SIGNATURE, arghash, format(NIL, $str109$_a, random.random(expt(TWO_INTEGER, $int$30))));
        cb_blue_applet_window_internal(arghash);
        subl_promotions.make_process_with_args($str107$cb_graph_event, symbol_function(CB_GRAPH_EVENT_PROCESS), list(arghash));
        return NIL;
    }

    public static final SubLObject cb_graph_event_process_alt(SubLObject arghash) {
        {
            SubLObject preds = html_arghash.get_arghash_value_list($PREDS, arghash);
            SubLObject v_forts = html_arghash.get_arghash_value_list($FORTS, arghash);
            SubLObject mt = html_arghash.get_arghash_value($MT, arghash);
            SubLObject depth = html_arghash.get_arghash_value($DEPTH, arghash);
            SubLObject filter_fn_keys = html_arghash.get_arghash_value_list($FILTER_FN_KEYS, arghash);
            SubLObject filter_fns = NIL;
            SubLObject builder_fn_key = html_arghash.get_arghash_value($BUILDER_FN_KEY, arghash);
            SubLObject builder_fn = intern(string_utilities.string_from_keyword(builder_fn_key), $$$CYC);
            SubLObject signature = html_arghash.get_arghash_value($SIGNATURE, arghash);
            SubLObject cdolist_list_var = filter_fn_keys;
            SubLObject filter_fn_key = NIL;
            for (filter_fn_key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter_fn_key = cdolist_list_var.first()) {
                filter_fns = cons(intern(string_utilities.string_from_keyword(filter_fn_key), $$$CYC), filter_fns);
            }
            filter_fns = nreverse(filter_fns);
            blue_grapher_utilities.blue_event(signature, list($cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list(new SubLObject[]{ $BUILDER_FN, builder_fn, $PREDS, preds, $FORTS, v_forts, $MT, mt, $DEPTH, depth, $FILTER_FNS, filter_fns })));
        }
        return NIL;
    }

    public static SubLObject cb_graph_event_process(final SubLObject arghash) {
        final SubLObject preds = html_arghash.get_arghash_value_list($PREDS, arghash);
        final SubLObject v_forts = html_arghash.get_arghash_value_list($FORTS, arghash);
        final SubLObject mt = html_arghash.get_arghash_value($MT, arghash);
        final SubLObject depth = html_arghash.get_arghash_value($DEPTH, arghash);
        final SubLObject filter_fn_keys = html_arghash.get_arghash_value_list($FILTER_FN_KEYS, arghash);
        SubLObject filter_fns = NIL;
        final SubLObject builder_fn_key = html_arghash.get_arghash_value($BUILDER_FN_KEY, arghash);
        final SubLObject builder_fn = intern(string_utilities.string_from_keyword(builder_fn_key), $$$CYC);
        final SubLObject signature = html_arghash.get_arghash_value($SIGNATURE, arghash);
        SubLObject cdolist_list_var = filter_fn_keys;
        SubLObject filter_fn_key = NIL;
        filter_fn_key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            filter_fns = cons(intern(string_utilities.string_from_keyword(filter_fn_key), $$$CYC), filter_fns);
            cdolist_list_var = cdolist_list_var.rest();
            filter_fn_key = cdolist_list_var.first();
        } 
        filter_fns = nreverse(filter_fns);
        blue_grapher_utilities.blue_event(signature, list($cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list(new SubLObject[]{ $BUILDER_FN, builder_fn, $PREDS, preds, $FORTS, v_forts, $MT, mt, $DEPTH, depth, $FILTER_FNS, filter_fns })));
        return NIL;
    }

    public static final SubLObject cb_blue_applet_alt(SubLObject keylist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject poss_width = getf(keylist, $WIDTH, UNPROVIDED);
                SubLObject width = (poss_width.isString() || (poss_width.isInteger() && poss_width.numG(ZERO_INTEGER))) ? ((SubLObject) (poss_width)) : $cb_blue_applet_default_width$.getGlobalValue();
                SubLObject poss_height = getf(keylist, $HEIGHT, UNPROVIDED);
                SubLObject height = (poss_height.isInteger() && poss_height.numG(ZERO_INTEGER)) ? ((SubLObject) (poss_height)) : $cb_blue_applet_default_height$.getGlobalValue();
                SubLObject poss_domain_mt = getf(keylist, $DOMAIN_MT, UNPROVIDED);
                SubLObject domain_mt = (NIL != fort_types_interface.microtheory_p(poss_domain_mt)) ? ((SubLObject) (poss_domain_mt)) : NIL;
                SubLObject poss_parsing_mt = getf(keylist, $PARSING_MT, UNPROVIDED);
                SubLObject parsing_mt = (NIL != fort_types_interface.microtheory_p(poss_parsing_mt)) ? ((SubLObject) (poss_parsing_mt)) : NIL;
                SubLObject poss_generation_mt = getf(keylist, $GENERATION_MT, UNPROVIDED);
                SubLObject generation_mt = (NIL != fort_types_interface.microtheory_p(poss_generation_mt)) ? ((SubLObject) (poss_generation_mt)) : NIL;
                SubLObject signature = getf(keylist, $SIGNATURE, UNPROVIDED);
                SubLObject codebase = $cb_blue_codebase$.getGlobalValue();
                SubLObject archive = java_applet_archive_string($str_alt124$script_editor);
                SubLObject poss_class_file = getf(keylist, $CLASS_FILE, UNPROVIDED);
                SubLObject class_file = (poss_class_file.isString()) ? ((SubLObject) (poss_class_file)) : $cb_blue_class_file$.getGlobalValue();
                html_markup(html_macros.$html_applet_head$.getGlobalValue());
                html_markup(html_macros.$html_applet_code$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(class_file);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(codebase);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(archive);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_applet_height$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(height);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_applet_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(width);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$user);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(format(NIL, $str_alt102$_A, operation_communication.the_cyclist()));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        if (NIL != domain_mt) {
                            html_markup(html_macros.$html_param_head$.getGlobalValue());
                            html_markup(html_macros.$html_param_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str_alt127$domain_mt);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_param_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(kb_paths.fort_name(domain_mt));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        if (NIL != parsing_mt) {
                            html_markup(html_macros.$html_param_head$.getGlobalValue());
                            html_markup(html_macros.$html_param_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str_alt128$parsing_mt);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_param_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(kb_paths.fort_name(parsing_mt));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        if (NIL != generation_mt) {
                            html_markup(html_macros.$html_param_head$.getGlobalValue());
                            html_markup(html_macros.$html_param_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str_alt129$generation_mt);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_param_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(kb_paths.fort_name(generation_mt));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$signature);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(signature);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$baseport);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$base_tcp_port$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ($str_alt132$_Java_applet_could_not_be_display);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_applet_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_blue_applet(final SubLObject keylist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject poss_width = getf(keylist, $WIDTH, UNPROVIDED);
        final SubLObject width = (poss_width.isString() || (poss_width.isInteger() && poss_width.numG(ZERO_INTEGER))) ? poss_width : $cb_blue_applet_default_width$.getGlobalValue();
        final SubLObject poss_height = getf(keylist, $HEIGHT, UNPROVIDED);
        final SubLObject height = (poss_height.isInteger() && poss_height.numG(ZERO_INTEGER)) ? poss_height : $cb_blue_applet_default_height$.getGlobalValue();
        final SubLObject poss_domain_mt = getf(keylist, $DOMAIN_MT, UNPROVIDED);
        final SubLObject domain_mt = (NIL != fort_types_interface.microtheory_p(poss_domain_mt)) ? poss_domain_mt : NIL;
        final SubLObject poss_parsing_mt = getf(keylist, $PARSING_MT, UNPROVIDED);
        final SubLObject parsing_mt = (NIL != fort_types_interface.microtheory_p(poss_parsing_mt)) ? poss_parsing_mt : NIL;
        final SubLObject poss_generation_mt = getf(keylist, $GENERATION_MT, UNPROVIDED);
        final SubLObject generation_mt = (NIL != fort_types_interface.microtheory_p(poss_generation_mt)) ? poss_generation_mt : NIL;
        final SubLObject signature = getf(keylist, $SIGNATURE, UNPROVIDED);
        final SubLObject codebase = $cb_blue_codebase$.getGlobalValue();
        final SubLObject archive = cyc_file_dependencies.java_applet_archive_string($str127$script_editor);
        final SubLObject poss_class_file = getf(keylist, $CLASS_FILE, UNPROVIDED);
        final SubLObject class_file = (poss_class_file.isString()) ? poss_class_file : $cb_blue_class_file$.getGlobalValue();
        html_markup(html_macros.$html_applet_head$.getGlobalValue());
        html_markup(html_macros.$html_applet_code$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(class_file);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(codebase);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_applet_archive$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(archive);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_applet_height$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(height);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_applet_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(width);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$user);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(format(NIL, $str105$_A, operation_communication.the_cyclist()));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            if (NIL != domain_mt) {
                html_markup(html_macros.$html_param_head$.getGlobalValue());
                html_markup(html_macros.$html_param_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str130$domain_mt);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_param_value$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(kb_paths.fort_name(domain_mt));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
            }
            if (NIL != parsing_mt) {
                html_markup(html_macros.$html_param_head$.getGlobalValue());
                html_markup(html_macros.$html_param_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str131$parsing_mt);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_param_value$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(kb_paths.fort_name(parsing_mt));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
            }
            if (NIL != generation_mt) {
                html_markup(html_macros.$html_param_head$.getGlobalValue());
                html_markup(html_macros.$html_param_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str132$generation_mt);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_param_value$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(kb_paths.fort_name(generation_mt));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
            }
            html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$signature);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(signature);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$baseport);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(system_parameters.$base_tcp_port$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            html_princ($str135$_Java_applet_could_not_be_display);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_applet_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_blue_applet_window_alt(SubLObject args) {
        return com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_applet_window_internal(html_arghash.arglist_to_arghash(args));
    }

    public static SubLObject cb_blue_applet_window(final SubLObject args) {
        return cb_blue_applet_window_internal(html_arghash.arglist_to_arghash(args));
    }

    public static final SubLObject cb_blue_applet_window_internal_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            blue_grapher_utilities.ensure_blue_event_dispatcher_running();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Blue_Graph);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_script_head$.getGlobalValue());
                            html_markup(html_macros.$html_script_language$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_script_javascript$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_script_src$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(cb_java_utilities.$cb_java_applet_resize_script$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                }
                            }
                            html_markup(html_macros.$html_script_tail$.getGlobalValue());
                            com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_applet(list(new SubLObject[]{ $WIDTH, html_arghash.get_arghash_value($WIDTH, arghash), $HEIGHT, html_arghash.get_arghash_value($HEIGHT, arghash), $DOMAIN_MT, html_arghash.get_arghash_value($DOMAIN_MT, arghash), $PARSING_MT, html_arghash.get_arghash_value($DOMAIN_MT, arghash), $GENERATION_MT, html_arghash.get_arghash_value($GENERATION_MT, arghash), $SIGNATURE, html_arghash.get_arghash_value($SIGNATURE, arghash) }));
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                        }
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject cb_blue_applet_window_internal(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        blue_grapher_utilities.ensure_blue_event_dispatcher_running();
        html_markup($str36$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str37$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Blue_Graph);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$56 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_blue_applet(list(new SubLObject[]{ $WIDTH, html_arghash.get_arghash_value($WIDTH, arghash), $HEIGHT, html_arghash.get_arghash_value($HEIGHT, arghash), $DOMAIN_MT, html_arghash.get_arghash_value($DOMAIN_MT, arghash), $PARSING_MT, html_arghash.get_arghash_value($DOMAIN_MT, arghash), $GENERATION_MT, html_arghash.get_arghash_value($GENERATION_MT, arghash), $SIGNATURE, html_arghash.get_arghash_value($SIGNATURE, arghash) }));
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$56, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_blue_applet_window_set_arghash_alt(SubLObject arghash, SubLObject signature, SubLObject width, SubLObject height) {
        if (width == UNPROVIDED) {
            width = $cb_blue_applet_window_width$.getGlobalValue();
        }
        if (height == UNPROVIDED) {
            height = $cb_blue_applet_window_height$.getGlobalValue();
        }
        html_arghash.set_arghash_value($SIGNATURE, arghash, signature);
        html_arghash.set_arghash_value($WIDTH, arghash, width);
        html_arghash.set_arghash_value($HEIGHT, arghash, height);
        return arghash;
    }

    public static SubLObject cb_blue_applet_window_set_arghash(final SubLObject arghash, final SubLObject signature, SubLObject width, SubLObject height) {
        if (width == UNPROVIDED) {
            width = $cb_blue_applet_window_width$.getGlobalValue();
        }
        if (height == UNPROVIDED) {
            height = $cb_blue_applet_window_height$.getGlobalValue();
        }
        html_arghash.set_arghash_value($SIGNATURE, arghash, signature);
        html_arghash.set_arghash_value($WIDTH, arghash, width);
        html_arghash.set_arghash_value($HEIGHT, arghash, height);
        return arghash;
    }

    public static final SubLObject cb_blue_construct_window_options_alt(SubLObject width, SubLObject height) {
        return cb_java_utilities.cb_java_applet_construct_window_options(listS($list_alt137, list($HEIGHT, height), list($WIDTH, width), list($INNERHEIGHT, height), list($INNERWIDTH, width), $list_alt140));
    }

    public static SubLObject cb_blue_construct_window_options(final SubLObject width, final SubLObject height) {
        return cb_java_utilities.cb_java_applet_construct_window_options(listS($list140, list($HEIGHT, height), list($WIDTH, width), list($INNERHEIGHT, height), list($INNERWIDTH, width), $list143));
    }

    public static final SubLObject cb_blue_applet_window_link_alt(SubLObject arghash, SubLObject linktext, SubLObject initialization) {
        if (initialization == UNPROVIDED) {
            initialization = $str_alt141$cb_blue_applet_window;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = (NIL != html_arghash.get_arghash_value($SIGNATURE, arghash)) ? ((SubLObject) (cb_frame_name(html_arghash.get_arghash_value($SIGNATURE, arghash)))) : NIL;
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ(html_arghash.html_arghash_href(arghash, initialization));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt142$window_open__);
                cyc_cgi_url_int();
                html_princ(html_arghash.html_arghash_href(arghash, initialization));
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt143$__);
                if (NIL != html_arghash.get_arghash_value($SIGNATURE, arghash)) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt144$__A_, html_arghash.get_arghash_value($SIGNATURE, arghash));
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$null);
                }
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt146$___A____, com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_construct_window_options($cb_blue_applet_window_width$.getGlobalValue(), $cb_blue_applet_window_height$.getGlobalValue()));
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt147$return_false_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_blue_applet_window_link(final SubLObject arghash, final SubLObject linktext, SubLObject initialization) {
        if (initialization == UNPROVIDED) {
            initialization = $str144$cb_blue_applet_window;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = (NIL != html_arghash.get_arghash_value($SIGNATURE, arghash)) ? cb_frame_name(html_arghash.get_arghash_value($SIGNATURE, arghash)) : NIL;
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ(html_arghash.html_arghash_href(arghash, initialization));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str145$window_open__);
        cyc_cgi_url_int();
        html_princ(html_arghash.html_arghash_href(arghash, initialization));
        format(html_macros.$html_stream$.getDynamicValue(thread), $str146$__);
        if (NIL != html_arghash.get_arghash_value($SIGNATURE, arghash)) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str147$__A_, html_arghash.get_arghash_value($SIGNATURE, arghash));
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $$$null);
        }
        format(html_macros.$html_stream$.getDynamicValue(thread), $str149$___A____, cb_blue_construct_window_options($cb_blue_applet_window_width$.getGlobalValue(), $cb_blue_applet_window_height$.getGlobalValue()));
        format(html_macros.$html_stream$.getDynamicValue(thread), $str150$return_false_);
        html_char(CHAR_quotation, UNPROVIDED);
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

    public static final SubLObject cb_link_blue_applet_window_alt(SubLObject linktext, SubLObject signature, SubLObject arghash) {
        if (signature == UNPROVIDED) {
            signature = NIL;
        }
        if (arghash == UNPROVIDED) {
            arghash = NIL;
        }
        if (NIL == html_arghash.arghash_p(arghash)) {
            arghash = html_arghash.new_arghash(UNPROVIDED);
        }
        arghash = com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_applet_window_set_arghash(arghash, signature, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.cb_blue_grapher.cb_blue_applet_window_link(arghash, linktext, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_blue_applet_window(final SubLObject linktext, SubLObject signature, SubLObject arghash) {
        if (signature == UNPROVIDED) {
            signature = NIL;
        }
        if (arghash == UNPROVIDED) {
            arghash = NIL;
        }
        if (NIL == html_arghash.arghash_p(arghash)) {
            arghash = html_arghash.new_arghash(UNPROVIDED);
        }
        arghash = cb_blue_applet_window_set_arghash(arghash, signature, UNPROVIDED, UNPROVIDED);
        cb_blue_applet_window_link(arghash, linktext, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_cb_blue_grapher_file() {
        declareFunction("cb_blue_new_user_action", "CB-BLUE-NEW-USER-ACTION", 0, 0, false);
        declareFunction("cb_blue_remove_transient_user_action_data", "CB-BLUE-REMOVE-TRANSIENT-USER-ACTION-DATA", 1, 0, false);
        declareFunction("cb_blue_update_user_action_data_from_arghash", "CB-BLUE-UPDATE-USER-ACTION-DATA-FROM-ARGHASH", 2, 0, false);
        declareFunction("cb_blue_remove_keys_from_user_action_data", "CB-BLUE-REMOVE-KEYS-FROM-USER-ACTION-DATA", 2, 0, false);
        declareFunction("cb_blue_restart", "CB-BLUE-RESTART", 1, 0, false);
        declareFunction("cb_link_Xcb_blue_keyX", "CB-LINK-*CB-BLUE-KEY*", 0, 1, false);
        declareFunction("cb_blue_summary", "CB-BLUE-SUMMARY", 1, 0, false);
        declareFunction("cb_blue", "CB-BLUE", 0, 1, false);
        declareFunction("cb_blue_internal", "CB-BLUE-INTERNAL", 1, 0, false);
        declareFunction("cb_blue_index_frame", "CB-BLUE-INDEX-FRAME", 0, 1, false);
        declareFunction("cb_blue_index_frame_internal", "CB-BLUE-INDEX-FRAME-INTERNAL", 1, 0, false);
        declareFunction("cb_blue_button_bar", "CB-BLUE-BUTTON-BAR", 1, 0, false);
        declareFunction("cb_blue_content_frame", "CB-BLUE-CONTENT-FRAME", 0, 1, false);
        declareFunction("cb_blue_content_frame_internal", "CB-BLUE-CONTENT-FRAME-INTERNAL", 1, 0, false);
        declareFunction("cb_blue_build", "CB-BLUE-BUILD", 1, 0, false);
        declareFunction("cb_blue_build_internal", "CB-BLUE-BUILD-INTERNAL", 1, 1, false);
        declareFunction("cb_link_graph_event", "CB-LINK-GRAPH-EVENT", 2, 0, false);
        declareFunction("cb_graph_event", "CB-GRAPH-EVENT", 1, 0, false);
        declareFunction("cb_graph_event_process", "CB-GRAPH-EVENT-PROCESS", 1, 0, false);
        declareFunction("cb_blue_applet", "CB-BLUE-APPLET", 1, 0, false);
        declareFunction("cb_blue_applet_window", "CB-BLUE-APPLET-WINDOW", 1, 0, false);
        declareFunction("cb_blue_applet_window_internal", "CB-BLUE-APPLET-WINDOW-INTERNAL", 1, 0, false);
        declareFunction("cb_blue_applet_window_set_arghash", "CB-BLUE-APPLET-WINDOW-SET-ARGHASH", 2, 2, false);
        declareFunction("cb_blue_construct_window_options", "CB-BLUE-CONSTRUCT-WINDOW-OPTIONS", 2, 0, false);
        declareFunction("cb_blue_applet_window_link", "CB-BLUE-APPLET-WINDOW-LINK", 2, 1, false);
        declareFunction("cb_link_blue_applet_window", "CB-LINK-BLUE-APPLET-WINDOW", 1, 2, false);
        return NIL;
    }

    public static final SubLObject init_cb_blue_grapher_file_alt() {
        defparameter("*CB-BLUE-GRAPHER-DEBUG*", NIL);
        defparameter("*CB-BLUE-CURRENT-BLUE-USER-ACTION*", NIL);
        defparameter("*CB-BLUE-KEY*", $BLUE);
        deflexical("*CB-BLUE-USER-ACTION-DATA-PRED-KEYS*", $list_alt3);
        deflexical("*CB-BLUE-USER-ACTION-DATA-FORT-KEYS*", $list_alt4);
        defparameter("*CB-BLUE-USER-ACTION-DATA-KEYS*", listS($USER_ACTION_ID_STRING, $PREFERENCES, $MODE, $BUILDER_FN_KEY, $PREDS, append($cb_blue_user_action_data_pred_keys$.getGlobalValue(), bq_cons($FORTS, append($cb_blue_user_action_data_fort_keys$.getGlobalValue(), $list_alt11)))));
        deflexical("*CB-BLUE-CODEBASE*", $str_alt112$_java_script_editor);
        deflexical("*CB-BLUE-CLASS-FILE*", $str_alt113$com_cyc_framework_ui_blue_cyc_Cyc);
        deflexical("*CB-BLUE-APPLET-DEFAULT-WIDTH*", $str_alt114$100_);
        deflexical("*CB-BLUE-APPLET-DEFAULT-HEIGHT*", $int$700);
        deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-EDGE-STRING*", $str_alt116$com_cyc_framework_ui_blue_cyc_Cyc);
        deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-GRAPH-STRING*", $str_alt117$com_cyc_framework_ui_blue_cyc_Cyc);
        deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-NODE-STRING*", $str_alt118$com_cyc_framework_ui_blue_cyc_Cyc);
        deflexical("*CB-BLUE-APPLET-RESET-DELAY*", FIVE_INTEGER);
        deflexical("*CB-BLUE-APPLET-WINDOW-WIDTH*", $int$1010);
        deflexical("*CB-BLUE-APPLET-WINDOW-HEIGHT*", $int$750);
        return NIL;
    }

    public static SubLObject init_cb_blue_grapher_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CB-BLUE-GRAPHER-DEBUG*", NIL);
            defparameter("*CB-BLUE-CURRENT-BLUE-USER-ACTION*", NIL);
            defparameter("*CB-BLUE-KEY*", $BLUE);
            deflexical("*CB-BLUE-USER-ACTION-DATA-PRED-KEYS*", $list3);
            deflexical("*CB-BLUE-USER-ACTION-DATA-FORT-KEYS*", $list4);
            defparameter("*CB-BLUE-USER-ACTION-DATA-KEYS*", listS($USER_ACTION_ID_STRING, $PREFERENCES, $MODE, $BUILDER_FN_KEY, $PREDS, append($cb_blue_user_action_data_pred_keys$.getGlobalValue(), bq_cons($FORTS, append($cb_blue_user_action_data_fort_keys$.getGlobalValue(), $list11)))));
            deflexical("*CB-BLUE-CODEBASE*", $str115$_java_script_editor);
            deflexical("*CB-BLUE-CLASS-FILE*", $str116$com_cyc_framework_ui_blue_cyc_Cyc);
            deflexical("*CB-BLUE-APPLET-DEFAULT-WIDTH*", $str117$100_);
            deflexical("*CB-BLUE-APPLET-DEFAULT-HEIGHT*", $str118$90_);
            deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-EDGE-STRING*", $str119$com_cyc_framework_ui_blue_cyc_Cyc);
            deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-GRAPH-STRING*", $str120$com_cyc_framework_ui_blue_cyc_Cyc);
            deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-NODE-STRING*", $str121$com_cyc_framework_ui_blue_cyc_Cyc);
            deflexical("*CB-BLUE-APPLET-RESET-DELAY*", FIVE_INTEGER);
            deflexical("*CB-BLUE-APPLET-WINDOW-WIDTH*", $int$1010);
            deflexical("*CB-BLUE-APPLET-WINDOW-HEIGHT*", $int$750);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CB-BLUE-CODEBASE*", $str_alt112$_java_script_editor);
            deflexical("*CB-BLUE-CLASS-FILE*", $str_alt113$com_cyc_framework_ui_blue_cyc_Cyc);
            deflexical("*CB-BLUE-APPLET-DEFAULT-WIDTH*", $str_alt114$100_);
            deflexical("*CB-BLUE-APPLET-DEFAULT-HEIGHT*", $int$700);
            deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-EDGE-STRING*", $str_alt116$com_cyc_framework_ui_blue_cyc_Cyc);
            deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-GRAPH-STRING*", $str_alt117$com_cyc_framework_ui_blue_cyc_Cyc);
            deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-NODE-STRING*", $str_alt118$com_cyc_framework_ui_blue_cyc_Cyc);
        }
        return NIL;
    }

    public static SubLObject init_cb_blue_grapher_file_Previous() {
        defparameter("*CB-BLUE-GRAPHER-DEBUG*", NIL);
        defparameter("*CB-BLUE-CURRENT-BLUE-USER-ACTION*", NIL);
        defparameter("*CB-BLUE-KEY*", $BLUE);
        deflexical("*CB-BLUE-USER-ACTION-DATA-PRED-KEYS*", $list3);
        deflexical("*CB-BLUE-USER-ACTION-DATA-FORT-KEYS*", $list4);
        defparameter("*CB-BLUE-USER-ACTION-DATA-KEYS*", listS($USER_ACTION_ID_STRING, $PREFERENCES, $MODE, $BUILDER_FN_KEY, $PREDS, append($cb_blue_user_action_data_pred_keys$.getGlobalValue(), bq_cons($FORTS, append($cb_blue_user_action_data_fort_keys$.getGlobalValue(), $list11)))));
        deflexical("*CB-BLUE-CODEBASE*", $str115$_java_script_editor);
        deflexical("*CB-BLUE-CLASS-FILE*", $str116$com_cyc_framework_ui_blue_cyc_Cyc);
        deflexical("*CB-BLUE-APPLET-DEFAULT-WIDTH*", $str117$100_);
        deflexical("*CB-BLUE-APPLET-DEFAULT-HEIGHT*", $str118$90_);
        deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-EDGE-STRING*", $str119$com_cyc_framework_ui_blue_cyc_Cyc);
        deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-GRAPH-STRING*", $str120$com_cyc_framework_ui_blue_cyc_Cyc);
        deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-NODE-STRING*", $str121$com_cyc_framework_ui_blue_cyc_Cyc);
        deflexical("*CB-BLUE-APPLET-RESET-DELAY*", FIVE_INTEGER);
        deflexical("*CB-BLUE-APPLET-WINDOW-WIDTH*", $int$1010);
        deflexical("*CB-BLUE-APPLET-WINDOW-HEIGHT*", $int$750);
        return NIL;
    }

    public static final SubLObject setup_cb_blue_grapher_file_alt() {
        register_html_state_variable($cb_blue_current_blue_user_action$);
        register_html_interface_variable($cb_blue_current_blue_user_action$);
        {
            SubLObject new_action_type = user_actions.make_action_type($list_alt2);
            user_actions._csetf_action_type_key(new_action_type, $BLUE);
            sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
        }
        setup_cb_link_method($cb_blue_key$.getDynamicValue(), $sym22$CB_LINK__CB_BLUE_KEY_, ONE_INTEGER);
        declare_cb_tool($cb_blue_key$.getDynamicValue(), $$$Blue_Grapher, $$$BGraph, $$$Blue_Grapher);
        register_cb_frame($BLUE_INDEX, $$$blueindex, $str_alt28$cb_blue_index_frame, $str_alt29$__user_action_id_string__a, T, NIL);
        register_cb_frame($BLUE_CONTENT, $$$bluecontent, $str_alt32$cb_blue_content_frame, $str_alt29$__user_action_id_string__a, UNPROVIDED, UNPROVIDED);
        html_macros.note_html_handler_function(CB_BLUE);
        html_macros.note_html_handler_function(CB_BLUE_INDEX_FRAME);
        html_macros.note_html_handler_function(CB_BLUE_CONTENT_FRAME);
        html_macros.note_html_handler_function(CB_BLUE_BUILD);
        setup_cb_link_method($GRAPH_EVENT, CB_LINK_GRAPH_EVENT, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_GRAPH_EVENT);
        html_macros.note_html_handler_function(CB_BLUE_APPLET_WINDOW);
        setup_cb_link_method($BLUE_APPLET_WINDOW, CB_LINK_BLUE_APPLET_WINDOW, THREE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_cb_blue_grapher_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($cb_blue_current_blue_user_action$);
            register_html_interface_variable($cb_blue_current_blue_user_action$);
            final SubLObject new_action_type = user_actions.make_action_type($list2);
            user_actions._csetf_action_type_key(new_action_type, $BLUE);
            sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
            setup_cb_link_method($cb_blue_key$.getDynamicValue(), $sym22$CB_LINK__CB_BLUE_KEY_, ONE_INTEGER);
            register_cb_frame($BLUE_INDEX, $$$blueindex, $str26$cb_blue_index_frame, $str27$__user_action_id_string__a, T, NIL);
            register_cb_frame($BLUE_CONTENT, $$$bluecontent, $str30$cb_blue_content_frame, $str27$__user_action_id_string__a, UNPROVIDED, UNPROVIDED);
            html_macros.note_cgi_handler_function(CB_BLUE, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_BLUE_INDEX_FRAME, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_BLUE_CONTENT_FRAME, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_BLUE_BUILD, $HTML_HANDLER);
            setup_cb_link_method($GRAPH_EVENT, CB_LINK_GRAPH_EVENT, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_GRAPH_EVENT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_BLUE_APPLET_WINDOW, $HTML_HANDLER);
            setup_cb_link_method($BLUE_APPLET_WINDOW, CB_LINK_BLUE_APPLET_WINDOW, THREE_INTEGER);
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject new_action_type = user_actions.make_action_type($list_alt2);
                user_actions._csetf_action_type_key(new_action_type, $BLUE);
                sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
            }
            declare_cb_tool($cb_blue_key$.getDynamicValue(), $$$Blue_Grapher, $$$BGraph, $$$Blue_Grapher);
            register_cb_frame($BLUE_INDEX, $$$blueindex, $str_alt28$cb_blue_index_frame, $str_alt29$__user_action_id_string__a, T, NIL);
            register_cb_frame($BLUE_CONTENT, $$$bluecontent, $str_alt32$cb_blue_content_frame, $str_alt29$__user_action_id_string__a, UNPROVIDED, UNPROVIDED);
            html_macros.note_html_handler_function(CB_BLUE);
            html_macros.note_html_handler_function(CB_BLUE_INDEX_FRAME);
            html_macros.note_html_handler_function(CB_BLUE_CONTENT_FRAME);
            html_macros.note_html_handler_function(CB_BLUE_BUILD);
            html_macros.note_html_handler_function(CB_GRAPH_EVENT);
            html_macros.note_html_handler_function(CB_BLUE_APPLET_WINDOW);
        }
        return NIL;
    }

    public static SubLObject setup_cb_blue_grapher_file_Previous() {
        register_html_state_variable($cb_blue_current_blue_user_action$);
        register_html_interface_variable($cb_blue_current_blue_user_action$);
        final SubLObject new_action_type = user_actions.make_action_type($list2);
        user_actions._csetf_action_type_key(new_action_type, $BLUE);
        sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
        setup_cb_link_method($cb_blue_key$.getDynamicValue(), $sym22$CB_LINK__CB_BLUE_KEY_, ONE_INTEGER);
        register_cb_frame($BLUE_INDEX, $$$blueindex, $str26$cb_blue_index_frame, $str27$__user_action_id_string__a, T, NIL);
        register_cb_frame($BLUE_CONTENT, $$$bluecontent, $str30$cb_blue_content_frame, $str27$__user_action_id_string__a, UNPROVIDED, UNPROVIDED);
        html_macros.note_cgi_handler_function(CB_BLUE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_BLUE_INDEX_FRAME, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_BLUE_CONTENT_FRAME, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_BLUE_BUILD, $HTML_HANDLER);
        setup_cb_link_method($GRAPH_EVENT, CB_LINK_GRAPH_EVENT, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_GRAPH_EVENT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_BLUE_APPLET_WINDOW, $HTML_HANDLER);
        setup_cb_link_method($BLUE_APPLET_WINDOW, CB_LINK_BLUE_APPLET_WINDOW, THREE_INTEGER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_blue_grapher_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_blue_grapher_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_blue_grapher_file();
    }

    static {
    }

    static private final SubLList $list_alt2 = list(makeKeyword("SUMMARY-FN"), makeSymbol("CB-BLUE-SUMMARY"), makeKeyword("DISPLAY-FN"), makeSymbol("CB-BLUE"), makeKeyword("HANDLER-FN"), makeSymbol("CB-BLUE"));

    static private final SubLList $list_alt3 = list(makeKeyword("PRED1"), makeKeyword("PRED2"), makeKeyword("PRED3"), makeKeyword("PRED4"), makeKeyword("PRED5"), makeKeyword("PRED6"));

    static private final SubLList $list_alt4 = list(makeKeyword("FORT1"), makeKeyword("FORT2"), makeKeyword("FORT3"), makeKeyword("FORT4"), makeKeyword("FORT5"), makeKeyword("FORT6"));

    static private final SubLList $list_alt11 = list(makeKeyword("MT"), makeKeyword("FILTER-FN-KEYS"), makeKeyword("DEPTH"));

    static private final SubLString $str_alt14$cb_blue__Could_not_create_a_user_ = makeString("cb-blue: Could not create a user action.");

    static private final SubLList $list_alt17 = list(makeKeyword("BFF-CYC-KB-SUBSET-COLLECTIONS"), makeKeyword("BFF-ARBITRARY-UNIONS"));

    static private final SubLList $list_alt18 = list(makeKeyword("BBF-FORWARD-TRUE"));

    static private final SubLString $str_alt19$_Blue_Grapher_ = makeString("[Blue Grapher]");

    static private final SubLString $str_alt21$cb_blue = makeString("cb-blue");

    static private final SubLString $$$BGraph = makeString("BGraph");

    static private final SubLString $str_alt25$Blue_Grapher_interaction_in_progr = makeString("Blue Grapher interaction in progress");

    static private final SubLString $str_alt28$cb_blue_index_frame = makeString("cb-blue-index-frame");

    static private final SubLString $str_alt29$__user_action_id_string__a = makeString("&:user-action-id-string=~a");

    static private final SubLString $str_alt32$cb_blue_content_frame = makeString("cb-blue-content-frame");

    static private final SubLString $str_alt35$cb_blue_internal_called_without_a = makeString("cb-blue-internal called without a valid user-action-id-string");

    static private final SubLString $str_alt36$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

    static private final SubLString $str_alt37$40__ = makeString("40,*");

    static private final SubLString $str_alt41$cb_blue_content_frame__user_actio = makeString("cb-blue-content-frame&:user-action-id-string=~A&::action=restart");

    static private final SubLString $str_alt43$_ = makeString("|");

    static private final SubLString $str_alt44$cb_blue_content_frame__user_actio = makeString("cb-blue-content-frame&:user-action-id-string=~A&::mode=build");

    static private final SubLString $str_alt47$cb_blue_content_frame_internal__n = makeString("cb-blue-content-frame-internal: no user action found");

    static private final SubLString $str_alt50$invalid_mode___A__or_mode_not_imp = makeString("invalid mode (~A) or mode not implemented");

    static private final SubLString $str_alt51$cb_blue_build__no_user_action_fou = makeString("cb-blue-build: no user action found");

    static private final SubLString $str_alt53$cb_blue_build_internal__no_user_a = makeString("cb-blue-build-internal: no user action found");

    static private final SubLString $str_alt59$___ = makeString(" : ");

    static private final SubLSymbol $sym60$STRING_ = makeSymbol("STRING<");

    static private final SubLString $str_alt66$_user_action_data_user_action__af = makeString("(user-action-data user-action) after update from arghash");

    static private final SubLString $str_alt67$Blue_Grapher___Building_Graph = makeString("Blue Grapher - Building Graph");

    static private final SubLString $str_alt69$cb_blue_build = makeString("cb-blue-build");

    static private final SubLString $str_alt73$onChange_javascript_this_form_sub = makeString("onChange=javascript:this.form.submit();");

    static private final SubLString $str_alt75$___br_ = makeString(".)<br>");

    static private final SubLString $str_alt76$___ = makeString(".) ");

    static private final SubLString $str_alt77$__br_ = makeString(".<br>");

    static private final SubLString $str_alt78$___ = makeString(".  ");

    static private final SubLString $str_alt79$PREDS__ = makeString("PREDS: ");

    static private final SubLString $str_alt80$FORTS__ = makeString("FORTS: ");

    static private final SubLString $str_alt81$MT__ = makeString("MT: ");

    static private final SubLString $str_alt82$FILTER_FNS__ = makeString("FILTER-FNS: ");

    static private final SubLString $str_alt83$DEPTH__ = makeString("DEPTH: ");

    static private final SubLString $str_alt89$Status__ = makeString("Status: ");

    static private final SubLString $str_alt90$Ready_to_ = makeString("Ready to ");

    static private final SubLString $str_alt91$_1 = makeString("+1");

    static private final SubLString $str_alt93$_Visualize_ = makeString("[Visualize]");

    static private final SubLString $str_alt94$Waiting_for_more_input_ = makeString("Waiting for more input.");

    static private final SubLString $str_alt95$Algorithm__ = makeString("Algorithm: ");

    static private final SubLString $str_alt96$Forts__ = makeString("Forts: ");

    static private final SubLString $str_alt97$Preds__ = makeString("Preds: ");

    static private final SubLString $str_alt98$Mt__ = makeString("Mt: ");

    static private final SubLString $str_alt99$Depth__ = makeString("Depth: ");

    static private final SubLString $str_alt100$Filters__ = makeString("Filters: ");

    static private final SubLString $str_alt102$_A = makeString("~A");

    static private final SubLString $str_alt104$cb_graph_event = makeString("cb-graph-event");

    static private final SubLString $str_alt106$_a = makeString("~a");

    static private final SubLString $str_alt112$_java_script_editor = makeString("/java/script-editor");

    static private final SubLString $str_alt113$com_cyc_framework_ui_blue_cyc_Cyc = makeString("com.cyc.framework.ui.blue.cyc.CycGraphApplet");

    static private final SubLString $str_alt114$100_ = makeString("100%");

    public static final SubLInteger $int$700 = makeInteger(700);

    static private final SubLString $str_alt116$com_cyc_framework_ui_blue_cyc_Cyc = makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddEdge");

    static private final SubLString $str_alt117$com_cyc_framework_ui_blue_cyc_Cyc = makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddGraph");

    static private final SubLString $str_alt118$com_cyc_framework_ui_blue_cyc_Cyc = makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddNode");

    static private final SubLString $str_alt124$script_editor = makeString("script-editor");

    static private final SubLString $str_alt127$domain_mt = makeString("domain_mt");

    static private final SubLString $str_alt128$parsing_mt = makeString("parsing_mt");

    static private final SubLString $str_alt129$generation_mt = makeString("generation_mt");

    static private final SubLString $str_alt132$_Java_applet_could_not_be_display = makeString("[Java applet could not be displayed]");

    static private final SubLList $list_alt137 = list(makeKeyword("DEPENDENT"), makeKeyword("NO"));

    static private final SubLList $list_alt140 = list(list(makeKeyword("HOTKEYS"), makeKeyword("NO")), list(makeKeyword("DIRECTORIES"), makeKeyword("NO")), list(makeKeyword("MENUBAR"), makeKeyword("NO")), list(makeKeyword("RESIZABLE"), makeKeyword("YES")), list(makeKeyword("SCROLLBARS"), makeKeyword("YES")), list(makeKeyword("TOOLBAR"), makeKeyword("NO")));

    static private final SubLString $str_alt141$cb_blue_applet_window = makeString("cb-blue-applet-window");

    static private final SubLString $str_alt142$window_open__ = makeString("window.open('");

    static private final SubLString $str_alt143$__ = makeString("',");

    static private final SubLString $str_alt144$__A_ = makeString("'~A'");

    static private final SubLString $str_alt146$___A____ = makeString(",'~A'); ");

    static private final SubLString $str_alt147$return_false_ = makeString("return false;");
}

/**
 * Total time: 1919 ms
 */
