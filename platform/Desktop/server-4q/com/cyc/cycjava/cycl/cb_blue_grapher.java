package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_blue_grapher extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_blue_grapher";
    public static final String myFingerPrint = "2a159d440b6fe62de5ad6bbae7157de4d8b7628a376b5d001a851001eca9008d";
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 766L)
    private static SubLSymbol $cb_blue_grapher_debug$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 818L)
    public static SubLSymbol $cb_blue_current_blue_user_action$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 1025L)
    private static SubLSymbol $cb_blue_key$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 1178L)
    public static SubLSymbol $cb_blue_user_action_data_pred_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 1288L)
    public static SubLSymbol $cb_blue_user_action_data_fort_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 1398L)
    public static SubLSymbol $cb_blue_user_action_data_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19226L)
    public static SubLSymbol $cb_blue_codebase$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19415L)
    public static SubLSymbol $cb_blue_class_file$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19506L)
    public static SubLSymbol $cb_blue_applet_default_width$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19568L)
    public static SubLSymbol $cb_blue_applet_default_height$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19629L)
    public static SubLSymbol $cb_blue_cyc_graph_command_add_edge_string$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19754L)
    public static SubLSymbol $cb_blue_cyc_graph_command_add_graph_string$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19879L)
    public static SubLSymbol $cb_blue_cyc_graph_command_add_node_string$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 21843L)
    public static SubLSymbol $cb_blue_applet_reset_delay$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 21992L)
    public static SubLSymbol $cb_blue_applet_window_width$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 22065L)
    public static SubLSymbol $cb_blue_applet_window_height$;
    private static final SubLSymbol $sym0$_CB_BLUE_CURRENT_BLUE_USER_ACTION_;
    private static final SubLSymbol $kw1$BLUE;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$USER_ACTION_ID_STRING;
    private static final SubLSymbol $kw6$PREFERENCES;
    private static final SubLSymbol $kw7$MODE;
    private static final SubLSymbol $kw8$BUILDER_FN_KEY;
    private static final SubLSymbol $kw9$PREDS;
    private static final SubLSymbol $kw10$FORTS;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$CYCLIST;
    private static final SubLSymbol $kw13$TYPE_KEY;
    private static final SubLString $str14$cb_blue__Could_not_create_a_user_;
    private static final SubLSymbol $kw15$BUILD;
    private static final SubLSymbol $kw16$FILTER_FN_KEYS;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLString $str19$_Blue_Grapher_;
    private static final SubLSymbol $kw20$MAIN;
    private static final SubLString $str21$cb_blue;
    private static final SubLSymbol $sym22$CB_LINK__CB_BLUE_KEY_;
    private static final SubLString $str23$Blue_Grapher_interaction_in_progr;
    private static final SubLSymbol $kw24$BLUE_INDEX;
    private static final SubLString $str25$blueindex;
    private static final SubLString $str26$cb_blue_index_frame;
    private static final SubLString $str27$__user_action_id_string__a;
    private static final SubLSymbol $kw28$BLUE_CONTENT;
    private static final SubLString $str29$bluecontent;
    private static final SubLString $str30$cb_blue_content_frame;
    private static final SubLString $str31$Blue_Grapher;
    private static final SubLSymbol $sym32$CB_BLUE;
    private static final SubLSymbol $kw33$HTML_HANDLER;
    private static final SubLString $str34$Fatal_Error;
    private static final SubLString $str35$cb_blue_internal_called_without_a;
    private static final SubLString $str36$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str37$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw38$UNINITIALIZED;
    private static final SubLString $str39$Cannot_have_a_FRAMESET_tag_inside;
    private static final SubLString $str40$40__;
    private static final SubLString $str41$no;
    private static final SubLSymbol $sym42$CB_BLUE_INDEX_FRAME;
    private static final SubLString $str43$Blue_Grapher_Button_Bar;
    private static final SubLString $str44$cb_blue_content_frame__user_actio;
    private static final SubLString $str45$Restart;
    private static final SubLString $str46$_;
    private static final SubLString $str47$cb_blue_content_frame__user_actio;
    private static final SubLString $str48$Build;
    private static final SubLSymbol $sym49$CB_BLUE_CONTENT_FRAME;
    private static final SubLString $str50$cb_blue_content_frame_internal__n;
    private static final SubLSymbol $kw51$ACTION;
    private static final SubLSymbol $kw52$RESTART;
    private static final SubLString $str53$invalid_mode___A__or_mode_not_imp;
    private static final SubLString $str54$cb_blue_build__no_user_action_fou;
    private static final SubLSymbol $sym55$CB_BLUE_BUILD;
    private static final SubLString $str56$cb_blue_build_internal__no_user_a;
    private static final SubLSymbol $sym57$FORT_TO_STRING;
    private static final SubLSymbol $sym58$TERMS_FOR_BROWSING;
    private static final SubLSymbol $kw59$MT;
    private static final SubLObject $const60$CyclistsMt;
    private static final SubLString $str61$initial_arghash;
    private static final SubLString $str62$___;
    private static final SubLSymbol $sym63$STRING_;
    private static final SubLSymbol $sym64$SYMBOL_NAME;
    private static final SubLString $str65$validation;
    private static final SubLObject $const66$Predicate;
    private static final SubLObject $const67$Microtheory;
    private static final SubLString $str68$arghash_after_validation;
    private static final SubLString $str69$_user_action_data_user_action__af;
    private static final SubLString $str70$Blue_Grapher___Building_Graph;
    private static final SubLSymbol $kw71$POST;
    private static final SubLString $str72$cb_blue_build;
    private static final SubLSymbol $kw73$TOP;
    private static final SubLString $str74$;
    private static final SubLSymbol $kw75$KEYWORD;
    private static final SubLString $str76$onChange_javascript_this_form_sub;
    private static final SubLSymbol $kw77$HELP_STRING;
    private static final SubLString $str78$___br_;
    private static final SubLString $str79$___;
    private static final SubLString $str80$__br_;
    private static final SubLString $str81$___;
    private static final SubLString $str82$PREDS__;
    private static final SubLString $str83$FORTS__;
    private static final SubLString $str84$MT__;
    private static final SubLString $str85$FILTER_FNS__;
    private static final SubLString $str86$DEPTH__;
    private static final SubLSymbol $kw87$DEPTH;
    private static final SubLSymbol $kw88$INTEGER;
    private static final SubLSymbol $kw89$NBSP;
    private static final SubLString $str90$Submit;
    private static final SubLSymbol $kw91$SUBMIT;
    private static final SubLString $str92$Status__;
    private static final SubLString $str93$Ready_to_;
    private static final SubLString $str94$_1;
    private static final SubLSymbol $kw95$GRAPH_EVENT;
    private static final SubLString $str96$_Visualize_;
    private static final SubLString $str97$Waiting_for_more_input_;
    private static final SubLString $str98$Algorithm__;
    private static final SubLString $str99$Forts__;
    private static final SubLString $str100$Preds__;
    private static final SubLString $str101$Mt__;
    private static final SubLString $str102$Depth__;
    private static final SubLString $str103$Filters__;
    private static final SubLSymbol $kw104$SIGNATURE;
    private static final SubLString $str105$_A;
    private static final SubLInteger $int106$30;
    private static final SubLString $str107$cb_graph_event;
    private static final SubLSymbol $sym108$CB_LINK_GRAPH_EVENT;
    private static final SubLString $str109$_a;
    private static final SubLSymbol $sym110$CB_GRAPH_EVENT_PROCESS;
    private static final SubLSymbol $sym111$CB_GRAPH_EVENT;
    private static final SubLString $str112$CYC;
    private static final SubLSymbol $kw113$BUILDER_FN;
    private static final SubLSymbol $kw114$FILTER_FNS;
    private static final SubLString $str115$_java_script_editor;
    private static final SubLString $str116$com_cyc_framework_ui_blue_cyc_Cyc;
    private static final SubLString $str117$100_;
    private static final SubLString $str118$90_;
    private static final SubLString $str119$com_cyc_framework_ui_blue_cyc_Cyc;
    private static final SubLString $str120$com_cyc_framework_ui_blue_cyc_Cyc;
    private static final SubLString $str121$com_cyc_framework_ui_blue_cyc_Cyc;
    private static final SubLSymbol $kw122$WIDTH;
    private static final SubLSymbol $kw123$HEIGHT;
    private static final SubLSymbol $kw124$DOMAIN_MT;
    private static final SubLSymbol $kw125$PARSING_MT;
    private static final SubLSymbol $kw126$GENERATION_MT;
    private static final SubLString $str127$script_editor;
    private static final SubLSymbol $kw128$CLASS_FILE;
    private static final SubLString $str129$user;
    private static final SubLString $str130$domain_mt;
    private static final SubLString $str131$parsing_mt;
    private static final SubLString $str132$generation_mt;
    private static final SubLString $str133$signature;
    private static final SubLString $str134$baseport;
    private static final SubLString $str135$_Java_applet_could_not_be_display;
    private static final SubLInteger $int136$1010;
    private static final SubLInteger $int137$750;
    private static final SubLSymbol $sym138$CB_BLUE_APPLET_WINDOW;
    private static final SubLString $str139$Blue_Graph;
    private static final SubLList $list140;
    private static final SubLSymbol $kw141$INNERHEIGHT;
    private static final SubLSymbol $kw142$INNERWIDTH;
    private static final SubLList $list143;
    private static final SubLString $str144$cb_blue_applet_window;
    private static final SubLString $str145$window_open__;
    private static final SubLString $str146$__;
    private static final SubLString $str147$__A_;
    private static final SubLString $str148$null;
    private static final SubLString $str149$___A____;
    private static final SubLString $str150$return_false_;
    private static final SubLSymbol $kw151$BLUE_APPLET_WINDOW;
    private static final SubLSymbol $sym152$CB_LINK_BLUE_APPLET_WINDOW;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 1919L)
    public static SubLObject cb_blue_new_user_action() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user_action = user_actions.new_user_action((SubLObject)ConsesLow.list((SubLObject)cb_blue_grapher.$kw12$CYCLIST, operation_communication.the_cyclist(), (SubLObject)cb_blue_grapher.$kw13$TYPE_KEY, cb_blue_grapher.$cb_blue_key$.getDynamicValue(thread)));
        if (cb_blue_grapher.NIL == user_actions.user_action_p(user_action)) {
            Errors.error((SubLObject)cb_blue_grapher.$str14$cb_blue__Could_not_create_a_user_);
        }
        user_actions._csetf_user_action_creation_time(user_action, Time.get_universal_time());
        user_actions._csetf_user_action_data(user_action, Hashtables.make_hash_table((SubLObject)cb_blue_grapher.TWENTY_INTEGER, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED));
        Hashtables.sethash((SubLObject)cb_blue_grapher.$kw5$USER_ACTION_ID_STRING, user_actions.user_action_data(user_action), (SubLObject)ConsesLow.list(user_actions.user_action_id_string(user_action)));
        cb_blue_restart(user_action);
        cb_blue_remove_transient_user_action_data(user_action);
        return user_action;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 2708L)
    public static SubLObject cb_blue_remove_transient_user_action_data(final SubLObject user_action) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_data = user_actions.user_action_data(user_action);
        user_actions._csetf_user_action_data(user_action, Hashtables.make_hash_table((SubLObject)cb_blue_grapher.TWENTY_INTEGER, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED));
        if (old_data.isHashtable()) {
            SubLObject k = (SubLObject)cb_blue_grapher.NIL;
            SubLObject v = (SubLObject)cb_blue_grapher.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(old_data);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    k = Hashtables.getEntryKey(cdohash_entry);
                    v = Hashtables.getEntryValue(cdohash_entry);
                    if (cb_blue_grapher.NIL != subl_promotions.memberP(k, cb_blue_grapher.$cb_blue_user_action_data_keys$.getDynamicValue(thread), (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED)) {
                        Hashtables.sethash(k, user_actions.user_action_data(user_action), v);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 3079L)
    public static SubLObject cb_blue_update_user_action_data_from_arghash(final SubLObject user_action, final SubLObject arghash) {
        hash_table_utilities.copy_hash_table_values_into(arghash, user_actions.user_action_data(user_action));
        hash_table_utilities.copy_hash_table_values_into(user_actions.user_action_data(user_action), arghash);
        cb_blue_remove_transient_user_action_data(user_action);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 3380L)
    public static SubLObject cb_blue_remove_keys_from_user_action_data(final SubLObject user_action, final SubLObject keys) {
        SubLObject cdolist_list_var = keys;
        SubLObject key = (SubLObject)cb_blue_grapher.NIL;
        key = cdolist_list_var.first();
        while (cb_blue_grapher.NIL != cdolist_list_var) {
            Hashtables.remhash(key, user_actions.user_action_data(user_action));
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 3543L)
    public static SubLObject cb_blue_restart(final SubLObject user_action) {
        SubLObject arghash = html_arghash.new_arghash((SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject user_action_id_string = Hashtables.gethash((SubLObject)cb_blue_grapher.$kw5$USER_ACTION_ID_STRING, user_actions.user_action_data(user_action), (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_arghash.set_arghash_value((SubLObject)cb_blue_grapher.$kw7$MODE, arghash, (SubLObject)cb_blue_grapher.$kw15$BUILD);
        html_arghash.set_arghash_value_list((SubLObject)cb_blue_grapher.$kw16$FILTER_FN_KEYS, arghash, (SubLObject)cb_blue_grapher.$list17);
        html_arghash.set_arghash_value_list((SubLObject)cb_blue_grapher.$kw8$BUILDER_FN_KEY, arghash, (SubLObject)cb_blue_grapher.$list18);
        user_actions._csetf_user_action_data(user_action, Hashtables.make_hash_table((SubLObject)cb_blue_grapher.TWENTY_INTEGER, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED));
        Hashtables.sethash((SubLObject)cb_blue_grapher.$kw5$USER_ACTION_ID_STRING, user_actions.user_action_data(user_action), user_action_id_string);
        arghash = cb_blue_update_user_action_data_from_arghash(user_action, arghash);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 4208L)
    public static SubLObject cb_link_Xcb_blue_keyX(SubLObject linktext) {
        if (linktext == cb_blue_grapher.UNPROVIDED) {
            linktext = (SubLObject)cb_blue_grapher.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_blue_grapher.NIL == linktext) {
            linktext = (SubLObject)cb_blue_grapher.$str19$_Blue_Grapher_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_blue_grapher.$kw20$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_blue_grapher.$str21$cb_blue);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        if (cb_blue_grapher.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 4623L)
    public static SubLObject cb_blue_summary(final SubLObject user_action_id_string) {
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        html_utilities.html_princ((SubLObject)cb_blue_grapher.$str23$Blue_Grapher_interaction_in_progr);
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 5148L)
    public static SubLObject cb_blue(SubLObject args) {
        if (args == cb_blue_grapher.UNPROVIDED) {
            args = (SubLObject)cb_blue_grapher.NIL;
        }
        if (cb_blue_grapher.NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn((SubLObject)cb_blue_grapher.$str31$Blue_Grapher);
        }
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        return cb_blue_internal(arghash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 5446L)
    public static SubLObject cb_blue_internal(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject user_action_id_string = hash_table_utilities.gethash_first((SubLObject)cb_blue_grapher.$kw5$USER_ACTION_ID_STRING, arghash, (SubLObject)cb_blue_grapher.UNPROVIDED);
        SubLObject user_action = (SubLObject)cb_blue_grapher.NIL;
        if (cb_blue_grapher.NIL != user_action_id_string) {
            user_action = user_actions.user_action_by_id_string(user_action_id_string);
        }
        else {
            final SubLObject all_blue_actions_for_user = user_actions.all_actions_for_cyclist_of_type(operation_communication.the_cyclist(), cb_blue_grapher.$cb_blue_key$.getDynamicValue(thread));
            final SubLObject pcase_var = Sequences.length(all_blue_actions_for_user);
            if (pcase_var.eql((SubLObject)cb_blue_grapher.ZERO_INTEGER)) {
                final SubLObject user_action_$1 = cb_blue_new_user_action();
                hash_table_utilities.push_hash((SubLObject)cb_blue_grapher.$kw5$USER_ACTION_ID_STRING, user_actions.user_action_id_string(user_action_$1), arghash);
                cb_blue_internal(arghash);
                return (SubLObject)cb_blue_grapher.NIL;
            }
            if (!pcase_var.eql((SubLObject)cb_blue_grapher.ONE_INTEGER)) {
                cb_user_actions.cb_show_actions_internal(cb_blue_grapher.$cb_blue_key$.getDynamicValue(thread));
                return (SubLObject)cb_blue_grapher.NIL;
            }
            user_action = all_blue_actions_for_user.first();
            user_action_id_string = user_actions.user_action_id_string(user_action);
        }
        if (cb_blue_grapher.NIL == user_actions.user_action_p(user_action)) {
            cyc_navigator_internals.generic_message_page((SubLObject)cb_blue_grapher.$str34$Fatal_Error, PrintLow.format((SubLObject)cb_blue_grapher.NIL, (SubLObject)cb_blue_grapher.$str35$cb_blue_internal_called_without_a));
        }
        else {
            html_utilities.html_markup((SubLObject)cb_blue_grapher.$str36$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_blue_grapher.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_blue_grapher.$str37$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_blue_grapher.$kw38$UNINITIALIZED) ? ConsesLow.list(cb_blue_grapher.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                if (cb_blue_grapher.NIL != html_macros.html_inside_body_p()) {
                    Errors.error((SubLObject)cb_blue_grapher.$str39$Cannot_have_a_FRAMESET_tag_inside);
                }
                html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_blue_grapher.$str40$40__);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_frameset_frameborder$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_blue_grapher.$str41$no);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                    cb_utilities.cb_frame((SubLObject)cb_blue_grapher.$kw24$BLUE_INDEX, user_action_id_string, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    cb_utilities.cb_frame((SubLObject)cb_blue_grapher.$kw28$BLUE_CONTENT, user_action_id_string, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
        }
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 7078L)
    public static SubLObject cb_blue_index_frame(SubLObject args) {
        if (args == cb_blue_grapher.UNPROVIDED) {
            args = (SubLObject)cb_blue_grapher.NIL;
        }
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        return cb_blue_index_frame_internal(arghash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 7341L)
    public static SubLObject cb_blue_index_frame_internal(final SubLObject arghash) {
        final SubLObject user_action = cb_user_actions.get_user_action_from_arghash(arghash);
        if (cb_blue_grapher.NIL != user_action) {
            cb_blue_button_bar(user_action);
        }
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 7540L)
    public static SubLObject cb_blue_button_bar(final SubLObject user_action) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_blue_grapher.NIL == user_actions.user_action_p(user_action)) {
            return (SubLObject)cb_blue_grapher.NIL;
        }
        final SubLObject user_action_id_string = user_actions.user_action_id_string(user_action);
        html_utilities.html_markup((SubLObject)cb_blue_grapher.$str36$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_blue_grapher.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_blue_grapher.$str37$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_blue_grapher.$kw38$UNINITIALIZED) ? ConsesLow.list(cb_blue_grapher.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_blue_grapher.$str43$Blue_Grapher_Button_Bar);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_blue_grapher.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_blue_grapher.NIL != html_macros.$html_color_lighter_blue$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_lighter_blue$.getGlobalValue()));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str31$Blue_Grapher);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_utilities.html_indent((SubLObject)cb_blue_grapher.THREE_INTEGER);
                    SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_blue_grapher.$kw28$BLUE_CONTENT);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    cb_parameters.cyc_cgi_url_int();
                    html_utilities.html_princ(PrintLow.format((SubLObject)cb_blue_grapher.NIL, (SubLObject)cb_blue_grapher.$str44$cb_blue_content_frame__user_actio, user_action_id_string));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    if (cb_blue_grapher.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                        html_utilities.html_princ((SubLObject)cb_blue_grapher.$str45$Restart);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_indent((SubLObject)cb_blue_grapher.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str46$_);
                    html_utilities.html_indent((SubLObject)cb_blue_grapher.UNPROVIDED);
                    frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_blue_grapher.$kw28$BLUE_CONTENT);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    cb_parameters.cyc_cgi_url_int();
                    html_utilities.html_princ(PrintLow.format((SubLObject)cb_blue_grapher.NIL, (SubLObject)cb_blue_grapher.$str47$cb_blue_content_frame__user_actio, user_action_id_string));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    if (cb_blue_grapher.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                        html_utilities.html_princ((SubLObject)cb_blue_grapher.$str48$Build);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 9116L)
    public static SubLObject cb_blue_content_frame(SubLObject args) {
        if (args == cb_blue_grapher.UNPROVIDED) {
            args = (SubLObject)cb_blue_grapher.NIL;
        }
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        return cb_blue_content_frame_internal(arghash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 9385L)
    public static SubLObject cb_blue_content_frame_internal(SubLObject arghash) {
        final SubLObject user_action = cb_user_actions.get_user_action_from_arghash(arghash);
        if (cb_blue_grapher.NIL == user_action) {
            cb_utilities.cb_error((SubLObject)cb_blue_grapher.$str50$cb_blue_content_frame_internal__n, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
            return (SubLObject)cb_blue_grapher.NIL;
        }
        cb_blue_update_user_action_data_from_arghash(user_action, arghash);
        SubLObject pcase_var;
        final SubLObject action = pcase_var = hash_table_utilities.gethash_first((SubLObject)cb_blue_grapher.$kw51$ACTION, arghash, (SubLObject)cb_blue_grapher.UNPROVIDED);
        if (pcase_var.eql((SubLObject)cb_blue_grapher.$kw52$RESTART)) {
            arghash = cb_blue_restart(user_action);
        }
        final SubLObject mode = pcase_var = hash_table_utilities.gethash_first((SubLObject)cb_blue_grapher.$kw7$MODE, arghash, (SubLObject)cb_blue_grapher.UNPROVIDED);
        if (pcase_var.eql((SubLObject)cb_blue_grapher.$kw15$BUILD)) {
            cb_blue_build_internal(arghash, (SubLObject)cb_blue_grapher.UNPROVIDED);
        }
        else {
            cb_utilities.cb_error((SubLObject)cb_blue_grapher.$str53$invalid_mode___A__or_mode_not_imp, mode, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
        }
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 10164L)
    public static SubLObject cb_blue_build(final SubLObject args) {
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        final SubLObject user_action = cb_user_actions.get_user_action_from_arghash(arghash);
        if (cb_blue_grapher.NIL == user_action) {
            cb_utilities.cb_error((SubLObject)cb_blue_grapher.$str54$cb_blue_build__no_user_action_fou, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
            return (SubLObject)cb_blue_grapher.NIL;
        }
        cb_blue_update_user_action_data_from_arghash(user_action, arghash);
        cb_blue_build_internal(arghash, (SubLObject)cb_blue_grapher.UNPROVIDED);
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 10528L)
    public static SubLObject cb_blue_build_internal(final SubLObject raw_arghash, SubLObject user_action) {
        if (user_action == cb_blue_grapher.UNPROVIDED) {
            user_action = (SubLObject)cb_blue_grapher.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_blue_grapher.NIL == user_action) {
            user_action = cb_user_actions.get_user_action_from_arghash(raw_arghash);
            if (cb_blue_grapher.NIL == user_action) {
                cb_utilities.cb_error((SubLObject)cb_blue_grapher.$str56$cb_blue_build_internal__no_user_a, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                return (SubLObject)cb_blue_grapher.NIL;
            }
        }
        final SubLObject debug = cb_blue_grapher.$cb_blue_grapher_debug$.getDynamicValue(thread);
        final SubLObject generation_fn = Symbols.symbol_function((SubLObject)cb_blue_grapher.$sym57$FORT_TO_STRING);
        final SubLObject parse_fn = Symbols.symbol_function((SubLObject)cb_blue_grapher.$sym58$TERMS_FOR_BROWSING);
        final SubLObject filter_mt = (cb_blue_grapher.NIL != fort_types_interface.mtP(html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw59$MT, raw_arghash))) ? html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw59$MT, raw_arghash) : cb_blue_grapher.$const60$CyclistsMt;
        if (cb_blue_grapher.NIL != debug) {
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_blue_grapher.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_blue_grapher.$str61$initial_arghash);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_blue_grapher.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(raw_arghash), Symbols.symbol_function((SubLObject)cb_blue_grapher.$sym63$STRING_), Symbols.symbol_function((SubLObject)cb_blue_grapher.$sym64$SYMBOL_NAME));
            SubLObject k = (SubLObject)cb_blue_grapher.NIL;
            k = cdolist_list_var.first();
            while (cb_blue_grapher.NIL != cdolist_list_var) {
                html_utilities.html_princ(k);
                html_utilities.html_princ((SubLObject)cb_blue_grapher.$str62$___);
                html_utilities.html_princ(Hashtables.gethash(k, raw_arghash, (SubLObject)cb_blue_grapher.UNPROVIDED));
                html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                k = cdolist_list_var.first();
            }
        }
        if (cb_blue_grapher.NIL != debug) {
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_blue_grapher.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_blue_grapher.$str65$validation);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_blue_grapher.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
        }
        html_arghash.html_arghash_nl_fort_list_input_validate(raw_arghash, (SubLObject)cb_blue_grapher.$kw9$PREDS, cb_blue_grapher.$cb_blue_user_action_data_pred_keys$.getGlobalValue(), debug, generation_fn, parse_fn, cb_blue_grapher.$const66$Predicate, filter_mt);
        html_arghash.html_arghash_nl_fort_list_input_validate(raw_arghash, (SubLObject)cb_blue_grapher.$kw10$FORTS, cb_blue_grapher.$cb_blue_user_action_data_fort_keys$.getGlobalValue(), debug, generation_fn, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_arghash.html_arghash_nl_fort_input_validate(raw_arghash, (SubLObject)cb_blue_grapher.$kw59$MT, debug, generation_fn, parse_fn, cb_blue_grapher.$const67$Microtheory, mt_vars.$mt_mt$.getGlobalValue());
        if (cb_blue_grapher.NIL != debug) {
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_blue_grapher.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_blue_grapher.$str68$arghash_after_validation);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_blue_grapher.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(raw_arghash), Symbols.symbol_function((SubLObject)cb_blue_grapher.$sym63$STRING_), Symbols.symbol_function((SubLObject)cb_blue_grapher.$sym64$SYMBOL_NAME));
            SubLObject k = (SubLObject)cb_blue_grapher.NIL;
            k = cdolist_list_var.first();
            while (cb_blue_grapher.NIL != cdolist_list_var) {
                html_utilities.html_princ(k);
                html_utilities.html_princ((SubLObject)cb_blue_grapher.$str62$___);
                html_utilities.html_princ(Hashtables.gethash(k, raw_arghash, (SubLObject)cb_blue_grapher.UNPROVIDED));
                html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                k = cdolist_list_var.first();
            }
        }
        cb_blue_remove_keys_from_user_action_data(user_action, cb_blue_grapher.$cb_blue_user_action_data_fort_keys$.getGlobalValue());
        cb_blue_remove_keys_from_user_action_data(user_action, cb_blue_grapher.$cb_blue_user_action_data_pred_keys$.getGlobalValue());
        cb_blue_update_user_action_data_from_arghash(user_action, raw_arghash);
        if (cb_blue_grapher.NIL != debug) {
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_blue_grapher.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_blue_grapher.$str69$_user_action_data_user_action__af);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_blue_grapher.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(user_actions.user_action_data(user_action)), Symbols.symbol_function((SubLObject)cb_blue_grapher.$sym63$STRING_), Symbols.symbol_function((SubLObject)cb_blue_grapher.$sym64$SYMBOL_NAME));
            SubLObject k = (SubLObject)cb_blue_grapher.NIL;
            k = cdolist_list_var.first();
            while (cb_blue_grapher.NIL != cdolist_list_var) {
                html_utilities.html_princ(k);
                html_utilities.html_princ((SubLObject)cb_blue_grapher.$str62$___);
                html_utilities.html_princ(Hashtables.gethash(k, user_actions.user_action_data(user_action), (SubLObject)cb_blue_grapher.UNPROVIDED));
                html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                k = cdolist_list_var.first();
            }
        }
        html_utilities.html_markup((SubLObject)cb_blue_grapher.$str36$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_blue_grapher.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_blue_grapher.$str37$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_blue_grapher.$kw38$UNINITIALIZED) ? ConsesLow.list(cb_blue_grapher.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_blue_grapher.$str70$Blue_Grapher___Building_Graph);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_blue_grapher.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_blue_grapher.$kw71$POST);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_blue_grapher.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)cb_blue_grapher.$str72$cb_blue_build, (SubLObject)cb_blue_grapher.T, (SubLObject)cb_blue_grapher.UNPROVIDED);
                        html_arghash.html_arghash_hidden_input(raw_arghash, (SubLObject)cb_blue_grapher.$kw5$USER_ACTION_ID_STRING, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_blue_grapher.$kw73$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str74$);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    final SubLObject key_string = html_arghash.arghash_make_key_string((SubLObject)cb_blue_grapher.$kw8$BUILDER_FN_KEY, (SubLObject)cb_blue_grapher.$kw75$KEYWORD);
                                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_markup(key_string);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_blue_grapher.$str76$onChange_javascript_this_form_sub);
                                    if (cb_blue_grapher.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                        SubLObject value = (SubLObject)cb_blue_grapher.NIL;
                                        SubLObject value_$15 = (SubLObject)cb_blue_grapher.NIL;
                                        SubLObject value_string = (SubLObject)cb_blue_grapher.NIL;
                                        SubLObject value_string_$16 = (SubLObject)cb_blue_grapher.NIL;
                                        value = blue_grapher_utilities.blue_builder_fn_keys();
                                        value_$15 = value.first();
                                        value_string = blue_grapher_utilities.blue_builder_fn_keys();
                                        value_string_$16 = value_string.first();
                                        while (cb_blue_grapher.NIL != value_string || cb_blue_grapher.NIL != value) {
                                            final SubLObject selected = list_utilities.member_equalP(value_$15, html_arghash.get_arghash_value_list((SubLObject)cb_blue_grapher.$kw8$BUILDER_FN_KEY, raw_arghash));
                                            final SubLObject value_string_$17 = html_arghash.arghash_get_string(value_$15, (SubLObject)cb_blue_grapher.$kw75$KEYWORD);
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            if (cb_blue_grapher.NIL != selected) {
                                                html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            }
                                            if (cb_blue_grapher.NIL != value_string_$17) {
                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                                html_utilities.html_markup(value_string_$17);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                            }
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                                html_utilities.html_princ(value_string_$16);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            value = value.rest();
                                            value_$15 = value.first();
                                            value_string = value_string.rest();
                                            value_string_$16 = value_string.first();
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    SubLObject bbf_help_string = blue_grapher_utilities.get_blue_builder_fn_def_value(html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw8$BUILDER_FN_KEY, raw_arghash), (SubLObject)cb_blue_grapher.$kw77$HELP_STRING);
                                    if (bbf_help_string.isString()) {
                                        bbf_help_string = string_utilities.string_substitute((SubLObject)cb_blue_grapher.$str78$___br_, (SubLObject)cb_blue_grapher.$str79$___, bbf_help_string, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                        bbf_help_string = string_utilities.string_substitute((SubLObject)cb_blue_grapher.$str80$__br_, (SubLObject)cb_blue_grapher.$str81$___, bbf_help_string, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                        html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.NIL, thread);
                                            html_utilities.html_princ(bbf_help_string);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                        }
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_blue_grapher.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_hr((SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_blue_grapher.$kw73$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str82$PREDS__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_arghash.html_arghash_nl_fort_list_input(raw_arghash, (SubLObject)cb_blue_grapher.$kw9$PREDS, cb_blue_grapher.$cb_blue_user_action_data_pred_keys$.getGlobalValue(), debug, generation_fn, (SubLObject)cb_blue_grapher.ONE_INTEGER, (SubLObject)cb_blue_grapher.ONE_INTEGER, (SubLObject)cb_blue_grapher.T, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_blue_grapher.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_hr((SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_blue_grapher.$kw73$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str83$FORTS__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_arghash.html_arghash_nl_fort_list_input(raw_arghash, (SubLObject)cb_blue_grapher.$kw10$FORTS, cb_blue_grapher.$cb_blue_user_action_data_fort_keys$.getGlobalValue(), debug, generation_fn, (SubLObject)cb_blue_grapher.ONE_INTEGER, (SubLObject)cb_blue_grapher.TWO_INTEGER, (SubLObject)cb_blue_grapher.T, cb_blue_grapher.$const66$Predicate);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_blue_grapher.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_hr((SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_blue_grapher.$kw73$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str84$MT__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_arghash.html_arghash_nl_fort_input(raw_arghash, (SubLObject)cb_blue_grapher.$kw59$MT, debug, generation_fn, (SubLObject)cb_blue_grapher.T, (SubLObject)cb_blue_grapher.T, cb_blue_grapher.$const67$Microtheory);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_blue_grapher.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_hr((SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_blue_grapher.$kw73$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str85$FILTER_FNS__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    SubLObject cdolist_list_var2 = blue_grapher_utilities.blue_filter_fn_keys((SubLObject)cb_blue_grapher.UNPROVIDED);
                                    SubLObject filter_fn_key = (SubLObject)cb_blue_grapher.NIL;
                                    filter_fn_key = cdolist_list_var2.first();
                                    while (cb_blue_grapher.NIL != cdolist_list_var2) {
                                        html_arghash.html_arghash_checkbox_input(raw_arghash, (SubLObject)cb_blue_grapher.$kw16$FILTER_FN_KEYS, filter_fn_key, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                        html_utilities.html_princ(filter_fn_key);
                                        html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        filter_fn_key = cdolist_list_var2.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_blue_grapher.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_hr((SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_blue_grapher.$kw73$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str86$DEPTH__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_arghash.html_arghash_text_input(raw_arghash, (SubLObject)cb_blue_grapher.$kw87$DEPTH, (SubLObject)cb_blue_grapher.ONE_INTEGER, (SubLObject)cb_blue_grapher.THREE_INTEGER, (SubLObject)cb_blue_grapher.$kw88$INTEGER);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_blue_grapher.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_hr((SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_blue_grapher.$kw73$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_glyph((SubLObject)cb_blue_grapher.$kw89$NBSP, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_arghash.html_arghash_submit_input(raw_arghash, (SubLObject)cb_blue_grapher.$str90$Submit, (SubLObject)cb_blue_grapher.$kw91$SUBMIT, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_blue_grapher.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_hr((SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject builder_fn_key = html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw8$BUILDER_FN_KEY, raw_arghash);
                            final SubLObject v_forts = html_arghash.get_arghash_value_list((SubLObject)cb_blue_grapher.$kw10$FORTS, raw_arghash);
                            final SubLObject preds = html_arghash.get_arghash_value_list((SubLObject)cb_blue_grapher.$kw9$PREDS, raw_arghash);
                            final SubLObject mt = html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw59$MT, raw_arghash);
                            final SubLObject depth = html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw87$DEPTH, raw_arghash);
                            final SubLObject filter_fn_keys = html_arghash.get_arghash_value_list((SubLObject)cb_blue_grapher.$kw16$FILTER_FN_KEYS, raw_arghash);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                            final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_blue_grapher.$kw73$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str92$Status__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                    if (Packages.intern(string_utilities.string_from_keyword(builder_fn_key), (SubLObject)cb_blue_grapher.UNPROVIDED).isFunctionSpec() && cb_blue_grapher.ZERO_INTEGER.numL(Sequences.length(v_forts)) && cb_blue_grapher.ZERO_INTEGER.numL(Sequences.length(preds)) && cb_blue_grapher.NIL != fort_types_interface.microtheory_p(mt) && depth.isNumber()) {
                                        html_utilities.html_princ((SubLObject)cb_blue_grapher.$str93$Ready_to_);
                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_blue_grapher.$str94$_1);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            cb_utilities.cb_link((SubLObject)cb_blue_grapher.$kw95$GRAPH_EVENT, (SubLObject)cb_blue_grapher.$str96$_Visualize_, user_actions.user_action_data(user_action), (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    }
                                    else {
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_blue_grapher.$str97$Waiting_for_more_input_);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_newline((SubLObject)cb_blue_grapher.TWO_INTEGER);
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str98$Algorithm__);
                                    html_utilities.html_princ(builder_fn_key);
                                    html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str99$Forts__);
                                    cb_utilities.cb_form(v_forts, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str100$Preds__);
                                    cb_utilities.cb_form(preds, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str101$Mt__);
                                    cb_utilities.cb_form(mt, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str102$Depth__);
                                    html_utilities.html_princ(depth);
                                    html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_blue_grapher.$str103$Filters__);
                                    html_utilities.html_princ(filter_fn_keys);
                                    html_utilities.html_newline((SubLObject)cb_blue_grapher.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 17549L)
    public static SubLObject cb_link_graph_event(final SubLObject linktext, final SubLObject arghash) {
        html_arghash.set_arghash_value((SubLObject)cb_blue_grapher.$kw104$SIGNATURE, arghash, PrintLow.format((SubLObject)cb_blue_grapher.NIL, (SubLObject)cb_blue_grapher.$str105$_A, random.random(Numbers.expt((SubLObject)cb_blue_grapher.TWO_INTEGER, (SubLObject)cb_blue_grapher.$int106$30))));
        cb_blue_applet_window_link(arghash, linktext, (SubLObject)cb_blue_grapher.$str107$cb_graph_event);
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 17913L)
    public static SubLObject cb_graph_event(final SubLObject args) {
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        html_arghash.set_arghash_value((SubLObject)cb_blue_grapher.$kw104$SIGNATURE, arghash, PrintLow.format((SubLObject)cb_blue_grapher.NIL, (SubLObject)cb_blue_grapher.$str109$_a, random.random(Numbers.expt((SubLObject)cb_blue_grapher.TWO_INTEGER, (SubLObject)cb_blue_grapher.$int106$30))));
        cb_blue_applet_window_internal(arghash);
        subl_promotions.make_process_with_args((SubLObject)cb_blue_grapher.$str107$cb_graph_event, Symbols.symbol_function((SubLObject)cb_blue_grapher.$sym110$CB_GRAPH_EVENT_PROCESS), (SubLObject)ConsesLow.list(arghash));
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 18294L)
    public static SubLObject cb_graph_event_process(final SubLObject arghash) {
        final SubLObject preds = html_arghash.get_arghash_value_list((SubLObject)cb_blue_grapher.$kw9$PREDS, arghash);
        final SubLObject v_forts = html_arghash.get_arghash_value_list((SubLObject)cb_blue_grapher.$kw10$FORTS, arghash);
        final SubLObject mt = html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw59$MT, arghash);
        final SubLObject depth = html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw87$DEPTH, arghash);
        final SubLObject filter_fn_keys = html_arghash.get_arghash_value_list((SubLObject)cb_blue_grapher.$kw16$FILTER_FN_KEYS, arghash);
        SubLObject filter_fns = (SubLObject)cb_blue_grapher.NIL;
        final SubLObject builder_fn_key = html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw8$BUILDER_FN_KEY, arghash);
        final SubLObject builder_fn = Packages.intern(string_utilities.string_from_keyword(builder_fn_key), (SubLObject)cb_blue_grapher.$str112$CYC);
        final SubLObject signature = html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw104$SIGNATURE, arghash);
        SubLObject cdolist_list_var = filter_fn_keys;
        SubLObject filter_fn_key = (SubLObject)cb_blue_grapher.NIL;
        filter_fn_key = cdolist_list_var.first();
        while (cb_blue_grapher.NIL != cdolist_list_var) {
            filter_fns = (SubLObject)ConsesLow.cons(Packages.intern(string_utilities.string_from_keyword(filter_fn_key), (SubLObject)cb_blue_grapher.$str112$CYC), filter_fns);
            cdolist_list_var = cdolist_list_var.rest();
            filter_fn_key = cdolist_list_var.first();
        }
        filter_fns = Sequences.nreverse(filter_fns);
        blue_grapher_utilities.blue_event(signature, (SubLObject)ConsesLow.list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), (SubLObject)ConsesLow.list(new SubLObject[] { cb_blue_grapher.$kw113$BUILDER_FN, builder_fn, cb_blue_grapher.$kw9$PREDS, preds, cb_blue_grapher.$kw10$FORTS, v_forts, cb_blue_grapher.$kw59$MT, mt, cb_blue_grapher.$kw87$DEPTH, depth, cb_blue_grapher.$kw114$FILTER_FNS, filter_fns })));
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 20003L)
    public static SubLObject cb_blue_applet(final SubLObject keylist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject poss_width = conses_high.getf(keylist, (SubLObject)cb_blue_grapher.$kw122$WIDTH, (SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject width = (poss_width.isString() || (poss_width.isInteger() && poss_width.numG((SubLObject)cb_blue_grapher.ZERO_INTEGER))) ? poss_width : cb_blue_grapher.$cb_blue_applet_default_width$.getGlobalValue();
        final SubLObject poss_height = conses_high.getf(keylist, (SubLObject)cb_blue_grapher.$kw123$HEIGHT, (SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject height = (poss_height.isInteger() && poss_height.numG((SubLObject)cb_blue_grapher.ZERO_INTEGER)) ? poss_height : cb_blue_grapher.$cb_blue_applet_default_height$.getGlobalValue();
        final SubLObject poss_domain_mt = conses_high.getf(keylist, (SubLObject)cb_blue_grapher.$kw124$DOMAIN_MT, (SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject domain_mt = (SubLObject)((cb_blue_grapher.NIL != fort_types_interface.microtheory_p(poss_domain_mt)) ? poss_domain_mt : cb_blue_grapher.NIL);
        final SubLObject poss_parsing_mt = conses_high.getf(keylist, (SubLObject)cb_blue_grapher.$kw125$PARSING_MT, (SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject parsing_mt = (SubLObject)((cb_blue_grapher.NIL != fort_types_interface.microtheory_p(poss_parsing_mt)) ? poss_parsing_mt : cb_blue_grapher.NIL);
        final SubLObject poss_generation_mt = conses_high.getf(keylist, (SubLObject)cb_blue_grapher.$kw126$GENERATION_MT, (SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject generation_mt = (SubLObject)((cb_blue_grapher.NIL != fort_types_interface.microtheory_p(poss_generation_mt)) ? poss_generation_mt : cb_blue_grapher.NIL);
        final SubLObject signature = conses_high.getf(keylist, (SubLObject)cb_blue_grapher.$kw104$SIGNATURE, (SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject codebase = cb_blue_grapher.$cb_blue_codebase$.getGlobalValue();
        final SubLObject archive = cyc_file_dependencies.java_applet_archive_string((SubLObject)cb_blue_grapher.$str127$script_editor);
        final SubLObject poss_class_file = conses_high.getf(keylist, (SubLObject)cb_blue_grapher.$kw128$CLASS_FILE, (SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject class_file = poss_class_file.isString() ? poss_class_file : cb_blue_grapher.$cb_blue_class_file$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_markup(class_file);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_markup(codebase);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_markup(archive);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_markup(height);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_markup(width);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
            html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_blue_grapher.$str129$user);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(PrintLow.format((SubLObject)cb_blue_grapher.NIL, (SubLObject)cb_blue_grapher.$str105$_A, operation_communication.the_cyclist()));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            if (cb_blue_grapher.NIL != domain_mt) {
                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_blue_grapher.$str130$domain_mt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup(kb_paths.fort_name(domain_mt));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            }
            if (cb_blue_grapher.NIL != parsing_mt) {
                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_blue_grapher.$str131$parsing_mt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup(kb_paths.fort_name(parsing_mt));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            }
            if (cb_blue_grapher.NIL != generation_mt) {
                html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_blue_grapher.$str132$generation_mt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_markup(kb_paths.fort_name(generation_mt));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_blue_grapher.$str133$signature);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(signature);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_blue_grapher.$str134$baseport);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(system_parameters.$base_tcp_port$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_blue_grapher.$str135$_Java_applet_could_not_be_display);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_applet_tail$.getGlobalValue());
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 22123L)
    public static SubLObject cb_blue_applet_window(final SubLObject args) {
        return cb_blue_applet_window_internal(html_arghash.arglist_to_arghash(args));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 22242L)
    public static SubLObject cb_blue_applet_window_internal(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        blue_grapher_utilities.ensure_blue_event_dispatcher_running();
        html_utilities.html_markup((SubLObject)cb_blue_grapher.$str36$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_blue_grapher.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_blue_grapher.$str37$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_blue_grapher.$kw38$UNINITIALIZED) ? ConsesLow.list(cb_blue_grapher.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_blue_grapher.$str139$Blue_Graph);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            final SubLObject _prev_bind_0_$56 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_blue_grapher.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
                final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
                    cb_blue_applet((SubLObject)ConsesLow.list(new SubLObject[] { cb_blue_grapher.$kw122$WIDTH, html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw122$WIDTH, arghash), cb_blue_grapher.$kw123$HEIGHT, html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw123$HEIGHT, arghash), cb_blue_grapher.$kw124$DOMAIN_MT, html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw124$DOMAIN_MT, arghash), cb_blue_grapher.$kw125$PARSING_MT, html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw124$DOMAIN_MT, arghash), cb_blue_grapher.$kw126$GENERATION_MT, html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw126$GENERATION_MT, arghash), cb_blue_grapher.$kw104$SIGNATURE, html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw104$SIGNATURE, arghash) }));
                    html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$56, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_blue_grapher.UNPROVIDED);
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 23094L)
    public static SubLObject cb_blue_applet_window_set_arghash(final SubLObject arghash, final SubLObject signature, SubLObject width, SubLObject height) {
        if (width == cb_blue_grapher.UNPROVIDED) {
            width = cb_blue_grapher.$cb_blue_applet_window_width$.getGlobalValue();
        }
        if (height == cb_blue_grapher.UNPROVIDED) {
            height = cb_blue_grapher.$cb_blue_applet_window_height$.getGlobalValue();
        }
        html_arghash.set_arghash_value((SubLObject)cb_blue_grapher.$kw104$SIGNATURE, arghash, signature);
        html_arghash.set_arghash_value((SubLObject)cb_blue_grapher.$kw122$WIDTH, arghash, width);
        html_arghash.set_arghash_value((SubLObject)cb_blue_grapher.$kw123$HEIGHT, arghash, height);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 23411L)
    public static SubLObject cb_blue_construct_window_options(final SubLObject width, final SubLObject height) {
        return cb_java_utilities.cb_java_applet_construct_window_options((SubLObject)ConsesLow.listS((SubLObject)cb_blue_grapher.$list140, (SubLObject)ConsesLow.list((SubLObject)cb_blue_grapher.$kw123$HEIGHT, height), (SubLObject)ConsesLow.list((SubLObject)cb_blue_grapher.$kw122$WIDTH, width), (SubLObject)ConsesLow.list((SubLObject)cb_blue_grapher.$kw141$INNERHEIGHT, height), (SubLObject)ConsesLow.list((SubLObject)cb_blue_grapher.$kw142$INNERWIDTH, width), (SubLObject)cb_blue_grapher.$list143));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 23864L)
    public static SubLObject cb_blue_applet_window_link(final SubLObject arghash, final SubLObject linktext, SubLObject initialization) {
        if (initialization == cb_blue_grapher.UNPROVIDED) {
            initialization = (SubLObject)cb_blue_grapher.$str144$cb_blue_applet_window;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = (SubLObject)((cb_blue_grapher.NIL != html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw104$SIGNATURE, arghash)) ? cb_utilities.cb_frame_name(html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw104$SIGNATURE, arghash)) : cb_blue_grapher.NIL);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ(html_arghash.html_arghash_href(arghash, initialization));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        if (cb_blue_grapher.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_blue_grapher.$str145$window_open__);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ(html_arghash.html_arghash_href(arghash, initialization));
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_blue_grapher.$str146$__);
        if (cb_blue_grapher.NIL != html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw104$SIGNATURE, arghash)) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_blue_grapher.$str147$__A_, html_arghash.get_arghash_value((SubLObject)cb_blue_grapher.$kw104$SIGNATURE, arghash));
        }
        else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_blue_grapher.$str148$null);
        }
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_blue_grapher.$str149$___A____, cb_blue_construct_window_options(cb_blue_grapher.$cb_blue_applet_window_width$.getGlobalValue(), cb_blue_grapher.$cb_blue_applet_window_height$.getGlobalValue()));
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_blue_grapher.$str150$return_false_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_blue_grapher.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_blue_grapher.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 24260L)
    public static SubLObject cb_link_blue_applet_window(final SubLObject linktext, SubLObject signature, SubLObject arghash) {
        if (signature == cb_blue_grapher.UNPROVIDED) {
            signature = (SubLObject)cb_blue_grapher.NIL;
        }
        if (arghash == cb_blue_grapher.UNPROVIDED) {
            arghash = (SubLObject)cb_blue_grapher.NIL;
        }
        if (cb_blue_grapher.NIL == html_arghash.arghash_p(arghash)) {
            arghash = html_arghash.new_arghash((SubLObject)cb_blue_grapher.UNPROVIDED);
        }
        arghash = cb_blue_applet_window_set_arghash(arghash, signature, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
        cb_blue_applet_window_link(arghash, linktext, (SubLObject)cb_blue_grapher.UNPROVIDED);
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    public static SubLObject declare_cb_blue_grapher_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_new_user_action", "CB-BLUE-NEW-USER-ACTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_remove_transient_user_action_data", "CB-BLUE-REMOVE-TRANSIENT-USER-ACTION-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_update_user_action_data_from_arghash", "CB-BLUE-UPDATE-USER-ACTION-DATA-FROM-ARGHASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_remove_keys_from_user_action_data", "CB-BLUE-REMOVE-KEYS-FROM-USER-ACTION-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_restart", "CB-BLUE-RESTART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_link_Xcb_blue_keyX", "CB-LINK-*CB-BLUE-KEY*", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_summary", "CB-BLUE-SUMMARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue", "CB-BLUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_internal", "CB-BLUE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_index_frame", "CB-BLUE-INDEX-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_index_frame_internal", "CB-BLUE-INDEX-FRAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_button_bar", "CB-BLUE-BUTTON-BAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_content_frame", "CB-BLUE-CONTENT-FRAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_content_frame_internal", "CB-BLUE-CONTENT-FRAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_build", "CB-BLUE-BUILD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_build_internal", "CB-BLUE-BUILD-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_link_graph_event", "CB-LINK-GRAPH-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_graph_event", "CB-GRAPH-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_graph_event_process", "CB-GRAPH-EVENT-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_applet", "CB-BLUE-APPLET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_applet_window", "CB-BLUE-APPLET-WINDOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_applet_window_internal", "CB-BLUE-APPLET-WINDOW-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_applet_window_set_arghash", "CB-BLUE-APPLET-WINDOW-SET-ARGHASH", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_construct_window_options", "CB-BLUE-CONSTRUCT-WINDOW-OPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_blue_applet_window_link", "CB-BLUE-APPLET-WINDOW-LINK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_blue_grapher", "cb_link_blue_applet_window", "CB-LINK-BLUE-APPLET-WINDOW", 1, 2, false);
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    public static SubLObject init_cb_blue_grapher_file() {
        cb_blue_grapher.$cb_blue_grapher_debug$ = SubLFiles.defparameter("*CB-BLUE-GRAPHER-DEBUG*", (SubLObject)cb_blue_grapher.NIL);
        cb_blue_grapher.$cb_blue_current_blue_user_action$ = SubLFiles.defparameter("*CB-BLUE-CURRENT-BLUE-USER-ACTION*", (SubLObject)cb_blue_grapher.NIL);
        cb_blue_grapher.$cb_blue_key$ = SubLFiles.defparameter("*CB-BLUE-KEY*", (SubLObject)cb_blue_grapher.$kw1$BLUE);
        cb_blue_grapher.$cb_blue_user_action_data_pred_keys$ = SubLFiles.deflexical("*CB-BLUE-USER-ACTION-DATA-PRED-KEYS*", (SubLObject)cb_blue_grapher.$list3);
        cb_blue_grapher.$cb_blue_user_action_data_fort_keys$ = SubLFiles.deflexical("*CB-BLUE-USER-ACTION-DATA-FORT-KEYS*", (SubLObject)cb_blue_grapher.$list4);
        cb_blue_grapher.$cb_blue_user_action_data_keys$ = SubLFiles.defparameter("*CB-BLUE-USER-ACTION-DATA-KEYS*", (SubLObject)ConsesLow.listS((SubLObject)cb_blue_grapher.$kw5$USER_ACTION_ID_STRING, (SubLObject)cb_blue_grapher.$kw6$PREFERENCES, (SubLObject)cb_blue_grapher.$kw7$MODE, (SubLObject)cb_blue_grapher.$kw8$BUILDER_FN_KEY, (SubLObject)cb_blue_grapher.$kw9$PREDS, ConsesLow.append(cb_blue_grapher.$cb_blue_user_action_data_pred_keys$.getGlobalValue(), reader.bq_cons((SubLObject)cb_blue_grapher.$kw10$FORTS, ConsesLow.append(cb_blue_grapher.$cb_blue_user_action_data_fort_keys$.getGlobalValue(), (SubLObject)cb_blue_grapher.$list11)))));
        cb_blue_grapher.$cb_blue_codebase$ = SubLFiles.deflexical("*CB-BLUE-CODEBASE*", (SubLObject)cb_blue_grapher.$str115$_java_script_editor);
        cb_blue_grapher.$cb_blue_class_file$ = SubLFiles.deflexical("*CB-BLUE-CLASS-FILE*", (SubLObject)cb_blue_grapher.$str116$com_cyc_framework_ui_blue_cyc_Cyc);
        cb_blue_grapher.$cb_blue_applet_default_width$ = SubLFiles.deflexical("*CB-BLUE-APPLET-DEFAULT-WIDTH*", (SubLObject)cb_blue_grapher.$str117$100_);
        cb_blue_grapher.$cb_blue_applet_default_height$ = SubLFiles.deflexical("*CB-BLUE-APPLET-DEFAULT-HEIGHT*", (SubLObject)cb_blue_grapher.$str118$90_);
        cb_blue_grapher.$cb_blue_cyc_graph_command_add_edge_string$ = SubLFiles.deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-EDGE-STRING*", (SubLObject)cb_blue_grapher.$str119$com_cyc_framework_ui_blue_cyc_Cyc);
        cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$ = SubLFiles.deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-GRAPH-STRING*", (SubLObject)cb_blue_grapher.$str120$com_cyc_framework_ui_blue_cyc_Cyc);
        cb_blue_grapher.$cb_blue_cyc_graph_command_add_node_string$ = SubLFiles.deflexical("*CB-BLUE-CYC-GRAPH-COMMAND-ADD-NODE-STRING*", (SubLObject)cb_blue_grapher.$str121$com_cyc_framework_ui_blue_cyc_Cyc);
        cb_blue_grapher.$cb_blue_applet_reset_delay$ = SubLFiles.deflexical("*CB-BLUE-APPLET-RESET-DELAY*", (SubLObject)cb_blue_grapher.FIVE_INTEGER);
        cb_blue_grapher.$cb_blue_applet_window_width$ = SubLFiles.deflexical("*CB-BLUE-APPLET-WINDOW-WIDTH*", (SubLObject)cb_blue_grapher.$int136$1010);
        cb_blue_grapher.$cb_blue_applet_window_height$ = SubLFiles.deflexical("*CB-BLUE-APPLET-WINDOW-HEIGHT*", (SubLObject)cb_blue_grapher.$int137$750);
        return (SubLObject)cb_blue_grapher.NIL;
    }
    
    public static SubLObject setup_cb_blue_grapher_file() {
        utilities_macros.register_html_state_variable((SubLObject)cb_blue_grapher.$sym0$_CB_BLUE_CURRENT_BLUE_USER_ACTION_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_blue_grapher.$sym0$_CB_BLUE_CURRENT_BLUE_USER_ACTION_);
        final SubLObject new_action_type = user_actions.make_action_type((SubLObject)cb_blue_grapher.$list2);
        user_actions._csetf_action_type_key(new_action_type, (SubLObject)cb_blue_grapher.$kw1$BLUE);
        Hashtables.sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
        cb_utilities.setup_cb_link_method(cb_blue_grapher.$cb_blue_key$.getDynamicValue(), (SubLObject)cb_blue_grapher.$sym22$CB_LINK__CB_BLUE_KEY_, (SubLObject)cb_blue_grapher.ONE_INTEGER);
        cb_utilities.register_cb_frame((SubLObject)cb_blue_grapher.$kw24$BLUE_INDEX, (SubLObject)cb_blue_grapher.$str25$blueindex, (SubLObject)cb_blue_grapher.$str26$cb_blue_index_frame, (SubLObject)cb_blue_grapher.$str27$__user_action_id_string__a, (SubLObject)cb_blue_grapher.T, (SubLObject)cb_blue_grapher.NIL);
        cb_utilities.register_cb_frame((SubLObject)cb_blue_grapher.$kw28$BLUE_CONTENT, (SubLObject)cb_blue_grapher.$str29$bluecontent, (SubLObject)cb_blue_grapher.$str30$cb_blue_content_frame, (SubLObject)cb_blue_grapher.$str27$__user_action_id_string__a, (SubLObject)cb_blue_grapher.UNPROVIDED, (SubLObject)cb_blue_grapher.UNPROVIDED);
        html_macros.note_cgi_handler_function((SubLObject)cb_blue_grapher.$sym32$CB_BLUE, (SubLObject)cb_blue_grapher.$kw33$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_blue_grapher.$sym42$CB_BLUE_INDEX_FRAME, (SubLObject)cb_blue_grapher.$kw33$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_blue_grapher.$sym49$CB_BLUE_CONTENT_FRAME, (SubLObject)cb_blue_grapher.$kw33$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_blue_grapher.$sym55$CB_BLUE_BUILD, (SubLObject)cb_blue_grapher.$kw33$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_blue_grapher.$kw95$GRAPH_EVENT, (SubLObject)cb_blue_grapher.$sym108$CB_LINK_GRAPH_EVENT, (SubLObject)cb_blue_grapher.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_blue_grapher.$sym111$CB_GRAPH_EVENT, (SubLObject)cb_blue_grapher.$kw33$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_blue_grapher.$sym138$CB_BLUE_APPLET_WINDOW, (SubLObject)cb_blue_grapher.$kw33$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_blue_grapher.$kw151$BLUE_APPLET_WINDOW, (SubLObject)cb_blue_grapher.$sym152$CB_LINK_BLUE_APPLET_WINDOW, (SubLObject)cb_blue_grapher.THREE_INTEGER);
        return (SubLObject)cb_blue_grapher.NIL;
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
        me = (SubLFile)new cb_blue_grapher();
        cb_blue_grapher.$cb_blue_grapher_debug$ = null;
        cb_blue_grapher.$cb_blue_current_blue_user_action$ = null;
        cb_blue_grapher.$cb_blue_key$ = null;
        cb_blue_grapher.$cb_blue_user_action_data_pred_keys$ = null;
        cb_blue_grapher.$cb_blue_user_action_data_fort_keys$ = null;
        cb_blue_grapher.$cb_blue_user_action_data_keys$ = null;
        cb_blue_grapher.$cb_blue_codebase$ = null;
        cb_blue_grapher.$cb_blue_class_file$ = null;
        cb_blue_grapher.$cb_blue_applet_default_width$ = null;
        cb_blue_grapher.$cb_blue_applet_default_height$ = null;
        cb_blue_grapher.$cb_blue_cyc_graph_command_add_edge_string$ = null;
        cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$ = null;
        cb_blue_grapher.$cb_blue_cyc_graph_command_add_node_string$ = null;
        cb_blue_grapher.$cb_blue_applet_reset_delay$ = null;
        cb_blue_grapher.$cb_blue_applet_window_width$ = null;
        cb_blue_grapher.$cb_blue_applet_window_height$ = null;
        $sym0$_CB_BLUE_CURRENT_BLUE_USER_ACTION_ = SubLObjectFactory.makeSymbol("*CB-BLUE-CURRENT-BLUE-USER-ACTION*");
        $kw1$BLUE = SubLObjectFactory.makeKeyword("BLUE");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUMMARY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-BLUE-SUMMARY"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-BLUE"), (SubLObject)SubLObjectFactory.makeKeyword("HANDLER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-BLUE"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED1"), (SubLObject)SubLObjectFactory.makeKeyword("PRED2"), (SubLObject)SubLObjectFactory.makeKeyword("PRED3"), (SubLObject)SubLObjectFactory.makeKeyword("PRED4"), (SubLObject)SubLObjectFactory.makeKeyword("PRED5"), (SubLObject)SubLObjectFactory.makeKeyword("PRED6"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT1"), (SubLObject)SubLObjectFactory.makeKeyword("FORT2"), (SubLObject)SubLObjectFactory.makeKeyword("FORT3"), (SubLObject)SubLObjectFactory.makeKeyword("FORT4"), (SubLObject)SubLObjectFactory.makeKeyword("FORT5"), (SubLObject)SubLObjectFactory.makeKeyword("FORT6"));
        $kw5$USER_ACTION_ID_STRING = SubLObjectFactory.makeKeyword("USER-ACTION-ID-STRING");
        $kw6$PREFERENCES = SubLObjectFactory.makeKeyword("PREFERENCES");
        $kw7$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw8$BUILDER_FN_KEY = SubLObjectFactory.makeKeyword("BUILDER-FN-KEY");
        $kw9$PREDS = SubLObjectFactory.makeKeyword("PREDS");
        $kw10$FORTS = SubLObjectFactory.makeKeyword("FORTS");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("FILTER-FN-KEYS"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH"));
        $kw12$CYCLIST = SubLObjectFactory.makeKeyword("CYCLIST");
        $kw13$TYPE_KEY = SubLObjectFactory.makeKeyword("TYPE-KEY");
        $str14$cb_blue__Could_not_create_a_user_ = SubLObjectFactory.makeString("cb-blue: Could not create a user action.");
        $kw15$BUILD = SubLObjectFactory.makeKeyword("BUILD");
        $kw16$FILTER_FN_KEYS = SubLObjectFactory.makeKeyword("FILTER-FN-KEYS");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BFF-CYC-KB-SUBSET-COLLECTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("BFF-ARBITRARY-UNIONS"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BBF-FORWARD-TRUE"));
        $str19$_Blue_Grapher_ = SubLObjectFactory.makeString("[Blue Grapher]");
        $kw20$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str21$cb_blue = SubLObjectFactory.makeString("cb-blue");
        $sym22$CB_LINK__CB_BLUE_KEY_ = SubLObjectFactory.makeSymbol("CB-LINK-*CB-BLUE-KEY*");
        $str23$Blue_Grapher_interaction_in_progr = SubLObjectFactory.makeString("Blue Grapher interaction in progress");
        $kw24$BLUE_INDEX = SubLObjectFactory.makeKeyword("BLUE-INDEX");
        $str25$blueindex = SubLObjectFactory.makeString("blueindex");
        $str26$cb_blue_index_frame = SubLObjectFactory.makeString("cb-blue-index-frame");
        $str27$__user_action_id_string__a = SubLObjectFactory.makeString("&:user-action-id-string=~a");
        $kw28$BLUE_CONTENT = SubLObjectFactory.makeKeyword("BLUE-CONTENT");
        $str29$bluecontent = SubLObjectFactory.makeString("bluecontent");
        $str30$cb_blue_content_frame = SubLObjectFactory.makeString("cb-blue-content-frame");
        $str31$Blue_Grapher = SubLObjectFactory.makeString("Blue Grapher");
        $sym32$CB_BLUE = SubLObjectFactory.makeSymbol("CB-BLUE");
        $kw33$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str34$Fatal_Error = SubLObjectFactory.makeString("Fatal Error");
        $str35$cb_blue_internal_called_without_a = SubLObjectFactory.makeString("cb-blue-internal called without a valid user-action-id-string");
        $str36$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str37$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw38$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str39$Cannot_have_a_FRAMESET_tag_inside = SubLObjectFactory.makeString("Cannot have a FRAMESET tag inside a BODY tag.");
        $str40$40__ = SubLObjectFactory.makeString("40,*");
        $str41$no = SubLObjectFactory.makeString("no");
        $sym42$CB_BLUE_INDEX_FRAME = SubLObjectFactory.makeSymbol("CB-BLUE-INDEX-FRAME");
        $str43$Blue_Grapher_Button_Bar = SubLObjectFactory.makeString("Blue Grapher Button Bar");
        $str44$cb_blue_content_frame__user_actio = SubLObjectFactory.makeString("cb-blue-content-frame&:user-action-id-string=~A&::action=restart");
        $str45$Restart = SubLObjectFactory.makeString("Restart");
        $str46$_ = SubLObjectFactory.makeString("|");
        $str47$cb_blue_content_frame__user_actio = SubLObjectFactory.makeString("cb-blue-content-frame&:user-action-id-string=~A&::mode=build");
        $str48$Build = SubLObjectFactory.makeString("Build");
        $sym49$CB_BLUE_CONTENT_FRAME = SubLObjectFactory.makeSymbol("CB-BLUE-CONTENT-FRAME");
        $str50$cb_blue_content_frame_internal__n = SubLObjectFactory.makeString("cb-blue-content-frame-internal: no user action found");
        $kw51$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $kw52$RESTART = SubLObjectFactory.makeKeyword("RESTART");
        $str53$invalid_mode___A__or_mode_not_imp = SubLObjectFactory.makeString("invalid mode (~A) or mode not implemented");
        $str54$cb_blue_build__no_user_action_fou = SubLObjectFactory.makeString("cb-blue-build: no user action found");
        $sym55$CB_BLUE_BUILD = SubLObjectFactory.makeSymbol("CB-BLUE-BUILD");
        $str56$cb_blue_build_internal__no_user_a = SubLObjectFactory.makeString("cb-blue-build-internal: no user action found");
        $sym57$FORT_TO_STRING = SubLObjectFactory.makeSymbol("FORT-TO-STRING");
        $sym58$TERMS_FOR_BROWSING = SubLObjectFactory.makeSymbol("TERMS-FOR-BROWSING");
        $kw59$MT = SubLObjectFactory.makeKeyword("MT");
        $const60$CyclistsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt"));
        $str61$initial_arghash = SubLObjectFactory.makeString("initial arghash");
        $str62$___ = SubLObjectFactory.makeString(" : ");
        $sym63$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym64$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $str65$validation = SubLObjectFactory.makeString("validation");
        $const66$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $const67$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $str68$arghash_after_validation = SubLObjectFactory.makeString("arghash after validation");
        $str69$_user_action_data_user_action__af = SubLObjectFactory.makeString("(user-action-data user-action) after update from arghash");
        $str70$Blue_Grapher___Building_Graph = SubLObjectFactory.makeString("Blue Grapher - Building Graph");
        $kw71$POST = SubLObjectFactory.makeKeyword("POST");
        $str72$cb_blue_build = SubLObjectFactory.makeString("cb-blue-build");
        $kw73$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str74$ = SubLObjectFactory.makeString("");
        $kw75$KEYWORD = SubLObjectFactory.makeKeyword("KEYWORD");
        $str76$onChange_javascript_this_form_sub = SubLObjectFactory.makeString("onChange=javascript:this.form.submit();");
        $kw77$HELP_STRING = SubLObjectFactory.makeKeyword("HELP-STRING");
        $str78$___br_ = SubLObjectFactory.makeString(".)<br>");
        $str79$___ = SubLObjectFactory.makeString(".) ");
        $str80$__br_ = SubLObjectFactory.makeString(".<br>");
        $str81$___ = SubLObjectFactory.makeString(".  ");
        $str82$PREDS__ = SubLObjectFactory.makeString("PREDS: ");
        $str83$FORTS__ = SubLObjectFactory.makeString("FORTS: ");
        $str84$MT__ = SubLObjectFactory.makeString("MT: ");
        $str85$FILTER_FNS__ = SubLObjectFactory.makeString("FILTER-FNS: ");
        $str86$DEPTH__ = SubLObjectFactory.makeString("DEPTH: ");
        $kw87$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw88$INTEGER = SubLObjectFactory.makeKeyword("INTEGER");
        $kw89$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $str90$Submit = SubLObjectFactory.makeString("Submit");
        $kw91$SUBMIT = SubLObjectFactory.makeKeyword("SUBMIT");
        $str92$Status__ = SubLObjectFactory.makeString("Status: ");
        $str93$Ready_to_ = SubLObjectFactory.makeString("Ready to ");
        $str94$_1 = SubLObjectFactory.makeString("+1");
        $kw95$GRAPH_EVENT = SubLObjectFactory.makeKeyword("GRAPH-EVENT");
        $str96$_Visualize_ = SubLObjectFactory.makeString("[Visualize]");
        $str97$Waiting_for_more_input_ = SubLObjectFactory.makeString("Waiting for more input.");
        $str98$Algorithm__ = SubLObjectFactory.makeString("Algorithm: ");
        $str99$Forts__ = SubLObjectFactory.makeString("Forts: ");
        $str100$Preds__ = SubLObjectFactory.makeString("Preds: ");
        $str101$Mt__ = SubLObjectFactory.makeString("Mt: ");
        $str102$Depth__ = SubLObjectFactory.makeString("Depth: ");
        $str103$Filters__ = SubLObjectFactory.makeString("Filters: ");
        $kw104$SIGNATURE = SubLObjectFactory.makeKeyword("SIGNATURE");
        $str105$_A = SubLObjectFactory.makeString("~A");
        $int106$30 = SubLObjectFactory.makeInteger(30);
        $str107$cb_graph_event = SubLObjectFactory.makeString("cb-graph-event");
        $sym108$CB_LINK_GRAPH_EVENT = SubLObjectFactory.makeSymbol("CB-LINK-GRAPH-EVENT");
        $str109$_a = SubLObjectFactory.makeString("~a");
        $sym110$CB_GRAPH_EVENT_PROCESS = SubLObjectFactory.makeSymbol("CB-GRAPH-EVENT-PROCESS");
        $sym111$CB_GRAPH_EVENT = SubLObjectFactory.makeSymbol("CB-GRAPH-EVENT");
        $str112$CYC = SubLObjectFactory.makeString("CYC");
        $kw113$BUILDER_FN = SubLObjectFactory.makeKeyword("BUILDER-FN");
        $kw114$FILTER_FNS = SubLObjectFactory.makeKeyword("FILTER-FNS");
        $str115$_java_script_editor = SubLObjectFactory.makeString("/java/script-editor");
        $str116$com_cyc_framework_ui_blue_cyc_Cyc = SubLObjectFactory.makeString("com.cyc.framework.ui.blue.cyc.CycGraphApplet");
        $str117$100_ = SubLObjectFactory.makeString("100%");
        $str118$90_ = SubLObjectFactory.makeString("90%");
        $str119$com_cyc_framework_ui_blue_cyc_Cyc = SubLObjectFactory.makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddEdge");
        $str120$com_cyc_framework_ui_blue_cyc_Cyc = SubLObjectFactory.makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddGraph");
        $str121$com_cyc_framework_ui_blue_cyc_Cyc = SubLObjectFactory.makeString("com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddNode");
        $kw122$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $kw123$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $kw124$DOMAIN_MT = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $kw125$PARSING_MT = SubLObjectFactory.makeKeyword("PARSING-MT");
        $kw126$GENERATION_MT = SubLObjectFactory.makeKeyword("GENERATION-MT");
        $str127$script_editor = SubLObjectFactory.makeString("script-editor");
        $kw128$CLASS_FILE = SubLObjectFactory.makeKeyword("CLASS-FILE");
        $str129$user = SubLObjectFactory.makeString("user");
        $str130$domain_mt = SubLObjectFactory.makeString("domain_mt");
        $str131$parsing_mt = SubLObjectFactory.makeString("parsing_mt");
        $str132$generation_mt = SubLObjectFactory.makeString("generation_mt");
        $str133$signature = SubLObjectFactory.makeString("signature");
        $str134$baseport = SubLObjectFactory.makeString("baseport");
        $str135$_Java_applet_could_not_be_display = SubLObjectFactory.makeString("[Java applet could not be displayed]");
        $int136$1010 = SubLObjectFactory.makeInteger(1010);
        $int137$750 = SubLObjectFactory.makeInteger(750);
        $sym138$CB_BLUE_APPLET_WINDOW = SubLObjectFactory.makeSymbol("CB-BLUE-APPLET-WINDOW");
        $str139$Blue_Graph = SubLObjectFactory.makeString("Blue Graph");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEPENDENT"), (SubLObject)SubLObjectFactory.makeKeyword("NO"));
        $kw141$INNERHEIGHT = SubLObjectFactory.makeKeyword("INNERHEIGHT");
        $kw142$INNERWIDTH = SubLObjectFactory.makeKeyword("INNERWIDTH");
        $list143 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOTKEYS"), (SubLObject)SubLObjectFactory.makeKeyword("NO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTORIES"), (SubLObject)SubLObjectFactory.makeKeyword("NO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MENUBAR"), (SubLObject)SubLObjectFactory.makeKeyword("NO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESIZABLE"), (SubLObject)SubLObjectFactory.makeKeyword("YES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SCROLLBARS"), (SubLObject)SubLObjectFactory.makeKeyword("YES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOOLBAR"), (SubLObject)SubLObjectFactory.makeKeyword("NO")));
        $str144$cb_blue_applet_window = SubLObjectFactory.makeString("cb-blue-applet-window");
        $str145$window_open__ = SubLObjectFactory.makeString("window.open('");
        $str146$__ = SubLObjectFactory.makeString("',");
        $str147$__A_ = SubLObjectFactory.makeString("'~A'");
        $str148$null = SubLObjectFactory.makeString("null");
        $str149$___A____ = SubLObjectFactory.makeString(",'~A'); ");
        $str150$return_false_ = SubLObjectFactory.makeString("return false;");
        $kw151$BLUE_APPLET_WINDOW = SubLObjectFactory.makeKeyword("BLUE-APPLET-WINDOW");
        $sym152$CB_LINK_BLUE_APPLET_WINDOW = SubLObjectFactory.makeSymbol("CB-LINK-BLUE-APPLET-WINDOW");
    }
}

/*

	Total time: 1919 ms
	
*/