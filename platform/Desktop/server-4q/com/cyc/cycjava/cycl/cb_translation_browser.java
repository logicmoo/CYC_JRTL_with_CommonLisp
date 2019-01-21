package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_translation_browser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_translation_browser";
    public static final String myFingerPrint = "6f3b7d871a4e6396fa9cf7e9604dede16de0fbec2955bc0d22fefac27957047d";
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 2186L)
    private static SubLSymbol $cb_td_access_color_map$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 20936L)
    private static SubLSymbol $package_terse_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 21222L)
    private static SubLSymbol $prin1_symbol_to_string_caching_state$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$TITLE;
    private static final SubLSymbol $sym4$HTML_DOCUMENT;
    private static final SubLSymbol $sym5$CB_HEAD;
    private static final SubLSymbol $sym6$HTML_TITLE;
    private static final SubLSymbol $sym7$HTML_PRINC;
    private static final SubLSymbol $sym8$HTML_FANCY_BODY;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$TD_METHOD;
    private static final SubLSymbol $kw11$TD_GLOBAL;
    private static final SubLSymbol $kw12$TD_MODULE;
    private static final SubLSymbol $kw13$NBSP;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$CB_TD_TOOL;
    private static final SubLSymbol $kw16$HTML_HANDLER;
    private static final SubLSymbol $kw17$MAIN;
    private static final SubLString $str18$cb_td_tool;
    private static final SubLSymbol $kw19$TD_TOOL;
    private static final SubLSymbol $sym20$CB_LINK_TD_TOOL;
    private static final SubLSymbol $sym21$CB_TD_SEARCH;
    private static final SubLString $str22$_Translation_Database_Browser_;
    private static final SubLSymbol $kw23$SELF;
    private static final SubLString $str24$cb_td_search;
    private static final SubLSymbol $kw25$TD_SEARCH;
    private static final SubLSymbol $sym26$CB_LINK_TD_SEARCH;
    private static final SubLString $str27$There_is_no_current_SubL_translat;
    private static final SubLString $str28$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str29$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw30$UNINITIALIZED;
    private static final SubLSymbol $kw31$CB_CYC;
    private static final SubLString $str32$Translation_Database_Browser;
    private static final SubLString $str33$post;
    private static final SubLString $str34$cb_td_handle_search;
    private static final SubLSymbol $kw35$TD_SUMMARY;
    private static final SubLString $str36$_Current_Translation_Summary_;
    private static final SubLSymbol $kw37$LEFT;
    private static final SubLSymbol $kw38$CENTER;
    private static final SubLString $str39$Find_a_;
    private static final SubLString $str40$kind;
    private static final SubLString $str41$method;
    private static final SubLString $str42$function_or_macro;
    private static final SubLString $str43$global;
    private static final SubLString $str44$global_variable;
    private static final SubLString $str45$module;
    private static final SubLString $str46$source_file;
    private static final SubLString $str47$_called;
    private static final SubLString $str48$name;
    private static final SubLInteger $int49$40;
    private static final SubLString $str50$Find_now;
    private static final SubLString $str51$Clear_Input;
    private static final SubLSymbol $sym52$CB_TD_HANDLE_SEARCH;
    private static final SubLSymbol $sym53$CB_TD_SUMMARY;
    private static final SubLString $str54$_Summary_;
    private static final SubLString $str55$cb_td_summary;
    private static final SubLSymbol $sym56$CB_LINK_TD_SUMMARY;
    private static final SubLString $str57$Translation_Summary;
    private static final SubLString $str58$_Search_Page_;
    private static final SubLString $str59$Features___;
    private static final SubLString $str60$Module;
    private static final SubLString $str61$Features;
    private static final SubLSymbol $kw62$TOP;
    private static final SubLList $list63;
    private static final SubLString $str64$_;
    private static final SubLString $str65$_;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$CB_TD_MODULE;
    private static final SubLSymbol $sym68$TD_MODULE_P;
    private static final SubLString $str69$cb_td_module_;
    private static final SubLSymbol $sym70$CB_LINK_TD_MODULE;
    private static final SubLString $str71$Module____A;
    private static final SubLString $str72$Module___;
    private static final SubLString $str73$Properties;
    private static final SubLString $str74$Definitions;
    private static final SubLString $str75$Globals_defined_in_this_module;
    private static final SubLString $str76$Attributes;
    private static final SubLSymbol $sym77$CB_TD_SHOW_GLOBAL_DEFINITION_ATTRIBUTES;
    private static final SubLString $str78$Methods_defined_in_this_module;
    private static final SubLSymbol $sym79$CB_TD_SHOW_METHOD_DEFINITION_ATTRIBUTES;
    private static final SubLString $str80$Top_Level_References;
    private static final SubLString $str81$Methods_called_by_top_level_forms;
    private static final SubLString $str82$Globals_called_by_top_level_forms;
    private static final SubLString $str83$Methods;
    private static final SubLString $str84$File_positions;
    private static final SubLString $str85$Globals;
    private static final SubLString $str86$Callers__;
    private static final SubLString $str87$__;
    private static final SubLString $str88$Calls__;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$CB_TD_GLOBAL;
    private static final SubLSymbol $sym91$SYMBOLP;
    private static final SubLString $str92$cb_td_global_;
    private static final SubLString $str93$_;
    private static final SubLSymbol $sym94$CB_LINK_TD_GLOBAL;
    private static final SubLString $str95$Global____S;
    private static final SubLString $str96$Global_Variable___;
    private static final SubLString $str97$Access___;
    private static final SubLString $str98$Definition;
    private static final SubLString $str99$Internal_variable;
    private static final SubLString $str100$Undefined_variable;
    private static final SubLString $str101$Methods_that_reference_this_globa;
    private static final SubLSymbol $sym102$CB_TD_SHOW_METHOD_DEFINING_MODULE;
    private static final SubLString $str103$Globals_whose_initialization_refe;
    private static final SubLSymbol $sym104$CB_TD_SHOW_GLOBAL_DEFINING_MODULE;
    private static final SubLString $str105$Modules_that_reference_this_globa;
    private static final SubLString $str106$Methods_called_in_the_initializat;
    private static final SubLString $str107$Globals_referenced_in_the_initial;
    private static final SubLSymbol $sym108$CB_TD_METHOD;
    private static final SubLString $str109$cb_td_method_;
    private static final SubLSymbol $sym110$CB_LINK_TD_METHOD;
    private static final SubLString $str111$Method____S;
    private static final SubLString $str112$Method___;
    private static final SubLString $str113$Arglist___;
    private static final SubLString $str114$Internal_method;
    private static final SubLString $str115$Undefined_method;
    private static final SubLString $str116$Methods_that_call_this_method;
    private static final SubLString $str117$Globals_whose_initialization_call;
    private static final SubLString $str118$Modules_that_call_this_method_fro;
    private static final SubLString $str119$Methods_called_by_this_method;
    private static final SubLString $str120$Globals_referenced_by_this_method;
    private static final SubLSymbol $sym121$PACKAGE_TERSE_NAME;
    private static final SubLSymbol $sym122$PACKAGEP;
    private static final SubLSymbol $sym123$_PACKAGE_TERSE_NAME_CACHING_STATE_;
    private static final SubLSymbol $sym124$PRIN1_SYMBOL_TO_STRING;
    private static final SubLString $str125$___A;
    private static final SubLString $str126$_A___A;
    private static final SubLSymbol $sym127$_PRIN1_SYMBOL_TO_STRING_CACHING_STATE_;
    private static final SubLString $str128$Position___;
    private static final SubLString $str129$Pathname___;
    private static final SubLString $str130$macro;
    private static final SubLString $str131$no_callers;
    private static final SubLString $str132$no_external_callers;
    private static final SubLSymbol $kw133$CONSTANT;
    private static final SubLString $str134$constant;
    private static final SubLSymbol $kw135$LEXICAL;
    private static final SubLString $str136$lexical;
    private static final SubLSymbol $kw137$SPECIAL;
    private static final SubLString $str138$special;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 845L)
    public static SubLObject cb_td_document(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_translation_browser.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)cb_translation_browser.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_translation_browser.NIL;
        SubLObject current_$1 = (SubLObject)cb_translation_browser.NIL;
        while (cb_translation_browser.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_translation_browser.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_translation_browser.$list0);
            if (cb_translation_browser.NIL == conses_high.member(current_$1, (SubLObject)cb_translation_browser.$list1, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED)) {
                bad = (SubLObject)cb_translation_browser.T;
            }
            if (current_$1 == cb_translation_browser.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_translation_browser.NIL != bad && cb_translation_browser.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_translation_browser.$list0);
        }
        final SubLObject title_tail = cdestructuring_bind.property_list_member((SubLObject)cb_translation_browser.$kw3$TITLE, current);
        final SubLObject title = (SubLObject)((cb_translation_browser.NIL != title_tail) ? conses_high.cadr(title_tail) : cb_translation_browser.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)cb_translation_browser.$sym4$HTML_DOCUMENT, reader.bq_cons((SubLObject)cb_translation_browser.$sym5$CB_HEAD, ConsesLow.append((SubLObject)((cb_translation_browser.NIL != title) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_translation_browser.$sym6$HTML_TITLE, (SubLObject)ConsesLow.list((SubLObject)cb_translation_browser.$sym7$HTML_PRINC, title))) : cb_translation_browser.NIL), (SubLObject)cb_translation_browser.NIL)), (SubLObject)ConsesLow.listS((SubLObject)cb_translation_browser.$sym8$HTML_FANCY_BODY, (SubLObject)cb_translation_browser.$list9, ConsesLow.append(body, (SubLObject)cb_translation_browser.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 1211L)
    public static SubLObject cb_td_show_method(final SubLObject symbol) {
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        cb_utilities.cb_link((SubLObject)cb_translation_browser.$kw10$TD_METHOD, symbol, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 1312L)
    public static SubLObject cb_td_show_global(final SubLObject symbol) {
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        cb_utilities.cb_link((SubLObject)cb_translation_browser.$kw11$TD_GLOBAL, symbol, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 1412L)
    public static SubLObject cb_td_show_module(final SubLObject module) {
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        cb_utilities.cb_link((SubLObject)cb_translation_browser.$kw12$TD_MODULE, module, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 1512L)
    public static SubLObject cb_td_show_faccess(final SubLObject symbol) {
        final SubLObject access_level = form_translation.faccess_level(symbol);
        html_utilities.html_princ(access_level);
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 1653L)
    public static SubLObject cb_td_show_vaccess(final SubLObject symbol) {
        final SubLObject access_level = form_translation.vaccess_level(symbol);
        html_utilities.html_princ(access_level);
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 1793L)
    public static SubLObject cb_td_show_faccess_hint(final SubLObject symbol) {
        return cb_td_show_access_hint(form_translation.faccess_level(symbol));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 1901L)
    public static SubLObject cb_td_show_vaccess_hint(final SubLObject symbol) {
        return cb_td_show_access_hint(form_translation.vaccess_level(symbol));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 2008L)
    public static SubLObject cb_td_show_access_hint(final SubLObject access) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color = cb_td_access_color(access);
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        html_utilities.html_style_background_color(color);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_glyph((SubLObject)cb_translation_browser.$kw13$NBSP, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return access;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 2362L)
    public static SubLObject cb_td_access_color(final SubLObject access) {
        return conses_high.second(conses_high.assoc(access, cb_translation_browser.$cb_td_access_color_map$.getGlobalValue(), (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 2465L)
    public static SubLObject cb_td_show_module_pathname(final SubLObject pathname) {
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        html_utilities.html_princ(pathname);
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 2779L)
    public static SubLObject cb_td_tool(SubLObject args) {
        if (args == cb_translation_browser.UNPROVIDED) {
            args = (SubLObject)cb_translation_browser.NIL;
        }
        return cb_td_search_guts();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 3089L)
    public static SubLObject cb_link_td_tool(final SubLObject linktext) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_translation_browser.$kw17$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_translation_browser.$str18$cb_td_tool);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        if (cb_translation_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 3351L)
    public static SubLObject cb_td_search(SubLObject args) {
        if (args == cb_translation_browser.UNPROVIDED) {
            args = (SubLObject)cb_translation_browser.NIL;
        }
        return cb_td_search_guts();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 3494L)
    public static SubLObject cb_link_td_search(SubLObject linktext) {
        if (linktext == cb_translation_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_translation_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_translation_browser.NIL == linktext) {
            linktext = (SubLObject)cb_translation_browser.$str22$_Translation_Database_Browser_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_translation_browser.$kw23$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_translation_browser.$str24$cb_td_search);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        if (cb_translation_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 3718L)
    public static SubLObject cb_td_search_guts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_translation_browser.NIL == translator_utilities.td_current_translation()) {
            return cb_utilities.cb_error((SubLObject)cb_translation_browser.$str27$There_is_no_current_SubL_translat, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        html_utilities.html_markup((SubLObject)cb_translation_browser.$str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_translation_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_translation_browser.$str29$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_translation_browser.$kw30$UNINITIALIZED) ? ConsesLow.list(cb_translation_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_translation_browser.$kw31$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_translation_browser.$str32$Translation_Database_Browser);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_translation_browser.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_translation_browser.$str33$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    if (cb_translation_browser.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)cb_translation_browser.$str34$cb_td_handle_search, (SubLObject)cb_translation_browser.T, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str32$Translation_Database_Browser);
                        html_utilities.html_newline((SubLObject)cb_translation_browser.TWO_INTEGER);
                        cb_utilities.cb_link((SubLObject)cb_translation_browser.$kw35$TD_SUMMARY, (SubLObject)cb_translation_browser.$str36$_Current_Translation_Summary_, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_translation_browser.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw38$CENTER));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str39$Find_a_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw38$CENTER));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_translation_browser.$str40$kind);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                    if (cb_translation_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_translation_browser.$str41$method);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str42$function_or_macro);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_translation_browser.$str43$global);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str44$global_variable);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_translation_browser.$str45$module);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str46$source_file);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw38$CENTER));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str47$_called);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_text_input((SubLObject)cb_translation_browser.$str48$name, (SubLObject)cb_translation_browser.NIL, (SubLObject)cb_translation_browser.$int49$40);
                        html_utilities.html_newline((SubLObject)cb_translation_browser.TWO_INTEGER);
                        html_utilities.html_submit_input((SubLObject)cb_translation_browser.$str50$Find_now, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_translation_browser.UNPROVIDED);
                        html_script_utilities.html_clear_input_button((SubLObject)cb_translation_browser.$str48$name, (SubLObject)cb_translation_browser.$str51$Clear_Input, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_translation_browser.UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 5024L)
    public static SubLObject cb_td_handle_search(final SubLObject args) {
        final SubLObject kind = html_utilities.html_extract_input((SubLObject)cb_translation_browser.$str40$kind, args);
        final SubLObject name = html_utilities.html_extract_input((SubLObject)cb_translation_browser.$str48$name, args);
        if (cb_translation_browser.$str41$method.equal(kind)) {
            return cb_td_method_guts(reader.read_from_string_ignoring_errors(name, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED));
        }
        if (cb_translation_browser.$str43$global.equal(kind)) {
            return cb_td_global_guts(reader.read_from_string_ignoring_errors(name, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED));
        }
        if (cb_translation_browser.$str45$module.equal(kind)) {
            return cb_td_module_guts(Strings.string_upcase(name, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED));
        }
        return cb_td_search((SubLObject)cb_translation_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 5499L)
    public static SubLObject cb_td_summary(SubLObject args) {
        if (args == cb_translation_browser.UNPROVIDED) {
            args = (SubLObject)cb_translation_browser.NIL;
        }
        return cb_td_summary_guts();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 5647L)
    public static SubLObject cb_link_td_summary(SubLObject linktext) {
        if (linktext == cb_translation_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_translation_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_translation_browser.NIL == linktext) {
            linktext = (SubLObject)cb_translation_browser.$str54$_Summary_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_translation_browser.$kw23$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_translation_browser.$str55$cb_td_summary);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        if (cb_translation_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 5852L)
    public static SubLObject cb_td_summary_guts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_translation_browser.NIL == translator_utilities.td_current_translation()) {
            return cb_utilities.cb_error((SubLObject)cb_translation_browser.$str27$There_is_no_current_SubL_translat, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        html_utilities.html_markup((SubLObject)cb_translation_browser.$str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_translation_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_translation_browser.$str29$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_translation_browser.$kw30$UNINITIALIZED) ? ConsesLow.list(cb_translation_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_translation_browser.$kw31$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_translation_browser.$str57$Translation_Summary);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_translation_browser.$kw35$TD_SUMMARY, (SubLObject)cb_translation_browser.$str57$Translation_Summary, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_indent((SubLObject)cb_translation_browser.FOUR_INTEGER);
                    cb_utilities.cb_link((SubLObject)cb_translation_browser.$kw25$TD_SEARCH, (SubLObject)cb_translation_browser.$str58$_Search_Page_, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)cb_translation_browser.TWO_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str59$Features___);
                    html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                    cb_td_show_translation_features();
                    html_utilities.html_hr((SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_translation_browser.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_translation_browser.ONE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_translation_browser.ONE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                html_utilities.html_princ((SubLObject)cb_translation_browser.$str60$Module);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                html_utilities.html_princ((SubLObject)cb_translation_browser.$str61$Features);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                        SubLObject cdolist_list_var = translator_utilities.td_translation_modules();
                        SubLObject module = (SubLObject)cb_translation_browser.NIL;
                        module = cdolist_list_var.first();
                        while (cb_translation_browser.NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    cb_td_show_module(module);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    cb_td_show_module_features(module);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            module = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$14, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 6895L)
    public static SubLObject cb_td_show_translation_features() {
        final SubLObject translation_features = translator_utilities.td_translation_features();
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        SubLObject cdolist_list_var = translation_features;
        SubLObject feature = (SubLObject)cb_translation_browser.NIL;
        feature = cdolist_list_var.first();
        while (cb_translation_browser.NIL != cdolist_list_var) {
            cb_td_show_feature_expression(feature);
            html_utilities.html_indent((SubLObject)cb_translation_browser.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            feature = cdolist_list_var.first();
        }
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 7137L)
    public static SubLObject cb_td_show_module_features(final SubLObject module) {
        final SubLObject module_features = translator_utilities.td_module_features(module);
        if (cb_translation_browser.T != module_features) {
            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            cb_td_show_feature_expression(module_features);
            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 7362L)
    public static SubLObject cb_td_show_feature_expression(final SubLObject feature_expression) {
        if (feature_expression.isAtom()) {
            html_utilities.html_princ(Symbols.symbol_name(feature_expression));
        }
        else {
            SubLObject operator = (SubLObject)cb_translation_browser.NIL;
            SubLObject sub_expressions = (SubLObject)cb_translation_browser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(feature_expression, feature_expression, (SubLObject)cb_translation_browser.$list63);
            operator = feature_expression.first();
            final SubLObject current = sub_expressions = feature_expression.rest();
            html_utilities.html_princ((SubLObject)cb_translation_browser.$str64$_);
            html_utilities.html_princ(Symbols.symbol_name(operator));
            SubLObject cdolist_list_var = sub_expressions;
            SubLObject sub_expression = (SubLObject)cb_translation_browser.NIL;
            sub_expression = cdolist_list_var.first();
            while (cb_translation_browser.NIL != cdolist_list_var) {
                html_utilities.html_indent((SubLObject)cb_translation_browser.UNPROVIDED);
                cb_td_show_feature_expression(sub_expression);
                cdolist_list_var = cdolist_list_var.rest();
                sub_expression = cdolist_list_var.first();
            }
            html_utilities.html_princ((SubLObject)cb_translation_browser.$str65$_);
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 7797L)
    public static SubLObject cb_td_module(final SubLObject args) {
        SubLObject module = (SubLObject)cb_translation_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_translation_browser.$list66);
        module = args.first();
        final SubLObject current = args.rest();
        if (cb_translation_browser.NIL == current) {
            return cb_td_module_guts(module);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_translation_browser.$list66);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 7961L)
    public static SubLObject cb_link_td_module(final SubLObject module, SubLObject linktext) {
        if (linktext == cb_translation_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_translation_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_translation_browser.NIL != translator_utilities.td_module_p(module) : module;
        if (cb_translation_browser.NIL == linktext) {
            linktext = module;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_translation_browser.$kw23$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_translation_browser.$str69$cb_td_module_);
        html_utilities.html_url_princ(module);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        if (cb_translation_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 8246L)
    public static SubLObject cb_td_module_guts(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_translation_browser.NIL == translator_utilities.td_current_translation()) {
            return cb_utilities.cb_error((SubLObject)cb_translation_browser.$str27$There_is_no_current_SubL_translat, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        final SubLObject title = PrintLow.format((SubLObject)cb_translation_browser.NIL, (SubLObject)cb_translation_browser.$str71$Module____A, module);
        html_utilities.html_markup((SubLObject)cb_translation_browser.$str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_translation_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_translation_browser.$str29$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_translation_browser.$kw30$UNINITIALIZED) ? ConsesLow.list(cb_translation_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_translation_browser.$kw31$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$23 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str72$Module___);
                    cb_td_show_module(module);
                    html_utilities.html_indent((SubLObject)cb_translation_browser.FOUR_INTEGER);
                    cb_utilities.cb_link((SubLObject)cb_translation_browser.$kw25$TD_SEARCH, (SubLObject)cb_translation_browser.$str58$_Search_Page_, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)cb_translation_browser.TWO_INTEGER);
                    html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str73$Properties);
                    cb_td_show_module_properties(module);
                    final SubLObject references_modules = translator_utilities.td_modules_referenced_by_module(module);
                    html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                    cb_td_show_references_module_section(module, references_modules);
                    final SubLObject referenced_by_modules = translator_utilities.td_modules_referencing_module(module);
                    html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                    cb_td_show_referenced_by_module_section(module, referenced_by_modules);
                    final SubLObject globals = translator_utilities.td_globals_defined_by_module(module);
                    final SubLObject v_methods = translator_utilities.td_methods_defined_by_module(module);
                    if (cb_translation_browser.NIL != globals || cb_translation_browser.NIL != v_methods) {
                        html_utilities.html_hr((SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str74$Definitions);
                        html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                        if (cb_translation_browser.NIL != globals) {
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_globals_table(globals, (SubLObject)cb_translation_browser.$str75$Globals_defined_in_this_module, (SubLObject)cb_translation_browser.$str76$Attributes, (SubLObject)cb_translation_browser.$sym77$CB_TD_SHOW_GLOBAL_DEFINITION_ATTRIBUTES);
                        }
                        if (cb_translation_browser.NIL != v_methods) {
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_methods_table(v_methods, (SubLObject)cb_translation_browser.$str78$Methods_defined_in_this_module, (SubLObject)cb_translation_browser.$str76$Attributes, (SubLObject)cb_translation_browser.$sym79$CB_TD_SHOW_METHOD_DEFINITION_ATTRIBUTES);
                        }
                    }
                    SubLObject v_methods2 = translator_utilities.td_methods_called_by_module(module);
                    SubLObject globals2 = translator_utilities.td_globals_called_by_module(module);
                    if (cb_translation_browser.NIL != v_methods2 || cb_translation_browser.NIL != globals2) {
                        html_utilities.html_hr((SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str80$Top_Level_References);
                        if (cb_translation_browser.NIL != v_methods2) {
                            v_methods2 = xref_database.xref_sort_called_methods(v_methods2);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str81$Methods_called_by_top_level_forms);
                            cb_td_show_top_level_methods_table(module, v_methods2);
                        }
                        if (cb_translation_browser.NIL != globals2) {
                            globals2 = xref_database.xref_sort_called_globals(globals2);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str82$Globals_called_by_top_level_forms);
                            cb_td_show_top_level_globals_table(module, globals2);
                        }
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$23, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 10469L)
    public static SubLObject cb_td_show_top_level_methods_table(final SubLObject module, final SubLObject v_methods) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str83$Methods);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_indent((SubLObject)cb_translation_browser.TWO_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str84$File_positions);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            SubLObject cdolist_list_var = v_methods;
            SubLObject method = (SubLObject)cb_translation_browser.NIL;
            method = cdolist_list_var.first();
            while (cb_translation_browser.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        cb_td_show_method(method);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        final SubLObject positions = translator_utilities.td_module_positions_calling_method(module, method);
                        SubLObject cdolist_list_var_$33 = Sequences.reverse(positions);
                        SubLObject position = (SubLObject)cb_translation_browser.NIL;
                        position = cdolist_list_var_$33.first();
                        while (cb_translation_browser.NIL != cdolist_list_var_$33) {
                            html_utilities.html_princ(position);
                            html_utilities.html_indent((SubLObject)cb_translation_browser.UNPROVIDED);
                            cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                            position = cdolist_list_var_$33.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 11173L)
    public static SubLObject cb_td_show_top_level_globals_table(final SubLObject module, final SubLObject globals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str85$Globals);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_indent((SubLObject)cb_translation_browser.TWO_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str84$File_positions);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            SubLObject cdolist_list_var = globals;
            SubLObject global = (SubLObject)cb_translation_browser.NIL;
            global = cdolist_list_var.first();
            while (cb_translation_browser.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        cb_td_show_global(global);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        final SubLObject positions = translator_utilities.td_module_positions_calling_global(module, global);
                        SubLObject cdolist_list_var_$42 = Sequences.reverse(positions);
                        SubLObject position = (SubLObject)cb_translation_browser.NIL;
                        position = cdolist_list_var_$42.first();
                        while (cb_translation_browser.NIL != cdolist_list_var_$42) {
                            html_utilities.html_princ(position);
                            html_utilities.html_indent((SubLObject)cb_translation_browser.UNPROVIDED);
                            cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                            position = cdolist_list_var_$42.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                global = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 11877L)
    public static SubLObject cb_td_show_referenced_by_module_section(final SubLObject module, SubLObject referenced_by_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        referenced_by_modules = translator_utilities.td_sort_modules_by_load_order(referenced_by_modules);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str86$Callers__);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_indent((SubLObject)cb_translation_browser.TWO_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    SubLObject cdolist_list_var = referenced_by_modules;
                    SubLObject other_module = (SubLObject)cb_translation_browser.NIL;
                    other_module = cdolist_list_var.first();
                    while (cb_translation_browser.NIL != cdolist_list_var) {
                        if (!other_module.eql(referenced_by_modules.first())) {
                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str87$__);
                        }
                        cb_td_show_module_referenced_by_module(module, other_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        other_module = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 12487L)
    public static SubLObject cb_td_show_module_referenced_by_module(final SubLObject server_module, final SubLObject client_module) {
        if (client_module.equal(server_module)) {
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_td_show_module(client_module);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
        }
        else {
            cb_td_show_module(client_module);
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 12793L)
    public static SubLObject cb_td_show_references_module_section(final SubLObject module, SubLObject references_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        references_modules = translator_utilities.td_sort_modules_by_load_order(references_modules);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str88$Calls__);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_indent((SubLObject)cb_translation_browser.TWO_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    SubLObject cdolist_list_var = references_modules;
                    SubLObject other_module = (SubLObject)cb_translation_browser.NIL;
                    other_module = cdolist_list_var.first();
                    while (cb_translation_browser.NIL != cdolist_list_var) {
                        if (!other_module.eql(references_modules.first())) {
                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str87$__);
                        }
                        cb_td_show_module_references_module(module, other_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        other_module = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 13380L)
    public static SubLObject cb_td_show_module_references_module(final SubLObject client_module, final SubLObject server_module) {
        if (client_module.equal(server_module)) {
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_td_show_module(server_module);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
        }
        else {
            cb_td_show_module(server_module);
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 13683L)
    public static SubLObject cb_td_global(final SubLObject args) {
        SubLObject package_string = (SubLObject)cb_translation_browser.NIL;
        SubLObject symbol_string = (SubLObject)cb_translation_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_translation_browser.$list89);
        package_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_translation_browser.$list89);
        symbol_string = current.first();
        current = current.rest();
        if (cb_translation_browser.NIL == current) {
            final SubLObject v_package = Packages.find_package(package_string);
            final SubLObject symbol = Packages.find_symbol(symbol_string, v_package);
            return cb_td_global_guts(symbol);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_translation_browser.$list89);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 13973L)
    public static SubLObject cb_link_td_global(final SubLObject symbol, SubLObject linktext) {
        if (linktext == cb_translation_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_translation_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_translation_browser.NIL != Types.symbolp(symbol) : symbol;
        if (cb_translation_browser.NIL == linktext) {
            linktext = prin1_symbol_to_string(symbol);
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_translation_browser.$kw23$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_translation_browser.$str92$cb_td_global_);
        html_utilities.html_url_princ(package_terse_name(Symbols.symbol_package(symbol)));
        html_utilities.html_princ((SubLObject)cb_translation_browser.$str93$_);
        html_utilities.html_url_princ(Symbols.symbol_name(symbol));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        if (cb_translation_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 14382L)
    public static SubLObject cb_td_global_guts(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_translation_browser.NIL == translator_utilities.td_current_translation()) {
            return cb_utilities.cb_error((SubLObject)cb_translation_browser.$str27$There_is_no_current_SubL_translat, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        final SubLObject title = PrintLow.format((SubLObject)cb_translation_browser.NIL, (SubLObject)cb_translation_browser.$str95$Global____S, symbol);
        html_utilities.html_markup((SubLObject)cb_translation_browser.$str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_translation_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_translation_browser.$str29$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_translation_browser.$kw30$UNINITIALIZED) ? ConsesLow.list(cb_translation_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_translation_browser.$kw31$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$51 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str96$Global_Variable___);
                    cb_td_show_global(symbol);
                    html_utilities.html_indent((SubLObject)cb_translation_browser.FOUR_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str97$Access___);
                    cb_td_show_vaccess(symbol);
                    html_utilities.html_indent((SubLObject)cb_translation_browser.FOUR_INTEGER);
                    cb_utilities.cb_link((SubLObject)cb_translation_browser.$kw25$TD_SEARCH, (SubLObject)cb_translation_browser.$str58$_Search_Page_, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject module = translator_utilities.td_global_defining_module(symbol);
                    final SubLObject position = translator_utilities.td_global_definition_position(symbol);
                    html_utilities.html_newline((SubLObject)cb_translation_browser.TWO_INTEGER);
                    html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str98$Definition);
                    html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                    if (cb_translation_browser.NIL != module) {
                        cb_td_show_module_section(module, position);
                    }
                    else if (cb_translation_browser.NIL != Symbols.boundp(symbol)) {
                        html_utilities.html_princ((SubLObject)cb_translation_browser.$str99$Internal_variable);
                    }
                    else {
                        html_utilities.html_princ((SubLObject)cb_translation_browser.$str100$Undefined_variable);
                    }
                    SubLObject v_methods = translator_utilities.td_methods_calling_global(symbol);
                    SubLObject globals = translator_utilities.td_globals_calling_global(symbol);
                    SubLObject v_modules = translator_utilities.td_modules_calling_global(symbol);
                    if (cb_translation_browser.NIL != v_methods || cb_translation_browser.NIL != globals || cb_translation_browser.NIL != v_modules) {
                        final SubLObject referenced_by_modules = translator_utilities.td_modules_referencing_global(symbol);
                        html_utilities.html_hr((SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                        cb_td_show_referenced_by_module_section(module, referenced_by_modules);
                        if (cb_translation_browser.NIL != v_methods) {
                            v_methods = xref_database.xref_sort_calling_methods(v_methods);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_methods_table(v_methods, (SubLObject)cb_translation_browser.$str101$Methods_that_reference_this_globa, (SubLObject)cb_translation_browser.$str60$Module, (SubLObject)cb_translation_browser.$sym102$CB_TD_SHOW_METHOD_DEFINING_MODULE);
                        }
                        if (cb_translation_browser.NIL != globals) {
                            globals = xref_database.xref_sort_calling_globals(globals);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_globals_table(globals, (SubLObject)cb_translation_browser.$str103$Globals_whose_initialization_refe, (SubLObject)cb_translation_browser.$str60$Module, (SubLObject)cb_translation_browser.$sym104$CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                        }
                        if (cb_translation_browser.NIL != v_modules) {
                            v_modules = xref_database.xref_sort_calling_modules(globals);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_modules_table(v_modules, (SubLObject)cb_translation_browser.$str105$Modules_that_reference_this_globa);
                        }
                    }
                    v_methods = translator_utilities.td_methods_called_by_global(symbol);
                    globals = translator_utilities.td_globals_called_by_global(symbol);
                    if (cb_translation_browser.NIL != v_methods || cb_translation_browser.NIL != globals) {
                        final SubLObject references_modules = translator_utilities.td_modules_referenced_by_global(symbol);
                        html_utilities.html_hr((SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                        cb_td_show_references_module_section(module, references_modules);
                        if (cb_translation_browser.NIL != v_methods) {
                            v_methods = xref_database.xref_sort_called_methods(v_methods);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_methods_table(v_methods, (SubLObject)cb_translation_browser.$str106$Methods_called_in_the_initializat, (SubLObject)cb_translation_browser.$str60$Module, (SubLObject)cb_translation_browser.$sym102$CB_TD_SHOW_METHOD_DEFINING_MODULE);
                        }
                        if (cb_translation_browser.NIL != globals) {
                            globals = xref_database.xref_sort_called_globals(globals);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_globals_table(globals, (SubLObject)cb_translation_browser.$str107$Globals_referenced_in_the_initial, (SubLObject)cb_translation_browser.$str60$Module, (SubLObject)cb_translation_browser.$sym104$CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                        }
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$51, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 17164L)
    public static SubLObject cb_td_method(final SubLObject args) {
        SubLObject package_string = (SubLObject)cb_translation_browser.NIL;
        SubLObject symbol_string = (SubLObject)cb_translation_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_translation_browser.$list89);
        package_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_translation_browser.$list89);
        symbol_string = current.first();
        current = current.rest();
        if (cb_translation_browser.NIL == current) {
            final SubLObject v_package = Packages.find_package(package_string);
            final SubLObject symbol = Packages.find_symbol(symbol_string, v_package);
            return cb_td_method_guts(symbol);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_translation_browser.$list89);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 17454L)
    public static SubLObject cb_link_td_method(final SubLObject symbol, SubLObject linktext) {
        if (linktext == cb_translation_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_translation_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_translation_browser.NIL != Types.symbolp(symbol) : symbol;
        if (cb_translation_browser.NIL == linktext) {
            linktext = prin1_symbol_to_string(symbol);
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_translation_browser.$kw23$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_translation_browser.$str109$cb_td_method_);
        html_utilities.html_url_princ(package_terse_name(Symbols.symbol_package(symbol)));
        html_utilities.html_princ((SubLObject)cb_translation_browser.$str93$_);
        html_utilities.html_url_princ(Symbols.symbol_name(symbol));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        if (cb_translation_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 17863L)
    public static SubLObject cb_td_method_guts(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_translation_browser.NIL == translator_utilities.td_current_translation()) {
            return cb_utilities.cb_error((SubLObject)cb_translation_browser.$str27$There_is_no_current_SubL_translat, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        final SubLObject title = PrintLow.format((SubLObject)cb_translation_browser.NIL, (SubLObject)cb_translation_browser.$str111$Method____S, symbol);
        html_utilities.html_markup((SubLObject)cb_translation_browser.$str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_translation_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_translation_browser.$str29$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_translation_browser.$kw30$UNINITIALIZED) ? ConsesLow.list(cb_translation_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_translation_browser.$kw31$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$53 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str112$Method___);
                    cb_td_show_method(symbol);
                    html_utilities.html_indent((SubLObject)cb_translation_browser.FOUR_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str97$Access___);
                    cb_td_show_faccess(symbol);
                    html_utilities.html_indent((SubLObject)cb_translation_browser.FOUR_INTEGER);
                    cb_utilities.cb_link((SubLObject)cb_translation_browser.$kw25$TD_SEARCH, (SubLObject)cb_translation_browser.$str58$_Search_Page_, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_glyph((SubLObject)cb_translation_browser.$kw13$NBSP, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str113$Arglist___);
                    html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                    cb_utilities.cb_form(translator_utilities.td_method_formal_arglist(symbol), (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                    final SubLObject module = translator_utilities.td_method_defining_module(symbol);
                    final SubLObject position = translator_utilities.td_method_definition_position(symbol);
                    html_utilities.html_newline((SubLObject)cb_translation_browser.TWO_INTEGER);
                    html_utilities.html_princ_strong((SubLObject)cb_translation_browser.$str98$Definition);
                    html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                    if (cb_translation_browser.NIL != module) {
                        cb_td_show_module_section(module, position);
                    }
                    else if (cb_translation_browser.NIL != Symbols.fboundp(symbol)) {
                        html_utilities.html_princ((SubLObject)cb_translation_browser.$str114$Internal_method);
                    }
                    else {
                        html_utilities.html_princ((SubLObject)cb_translation_browser.$str115$Undefined_method);
                    }
                    SubLObject v_methods = translator_utilities.td_methods_calling_method(symbol);
                    SubLObject globals = translator_utilities.td_globals_calling_method(symbol);
                    SubLObject v_modules = translator_utilities.td_modules_calling_method(symbol);
                    if (cb_translation_browser.NIL != v_methods || cb_translation_browser.NIL != globals || cb_translation_browser.NIL != v_modules) {
                        final SubLObject referenced_by_modules = translator_utilities.td_modules_referencing_method(symbol);
                        html_utilities.html_hr((SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                        cb_td_show_referenced_by_module_section(module, referenced_by_modules);
                        if (cb_translation_browser.NIL != v_methods) {
                            v_methods = xref_database.xref_sort_calling_methods(v_methods);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_methods_table(v_methods, (SubLObject)cb_translation_browser.$str116$Methods_that_call_this_method, (SubLObject)cb_translation_browser.$str60$Module, (SubLObject)cb_translation_browser.$sym102$CB_TD_SHOW_METHOD_DEFINING_MODULE);
                        }
                        if (cb_translation_browser.NIL != globals) {
                            globals = xref_database.xref_sort_calling_globals(globals);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_globals_table(globals, (SubLObject)cb_translation_browser.$str117$Globals_whose_initialization_call, (SubLObject)cb_translation_browser.$str60$Module, (SubLObject)cb_translation_browser.$sym104$CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                        }
                        if (cb_translation_browser.NIL != v_modules) {
                            v_modules = xref_database.xref_sort_calling_modules(v_modules);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_modules_table(v_modules, (SubLObject)cb_translation_browser.$str118$Modules_that_call_this_method_fro);
                        }
                    }
                    v_methods = translator_utilities.td_methods_called_by_method(symbol);
                    globals = translator_utilities.td_globals_called_by_method(symbol);
                    if (cb_translation_browser.NIL != v_methods || cb_translation_browser.NIL != globals) {
                        final SubLObject references_modules = translator_utilities.td_modules_referenced_by_method(symbol);
                        html_utilities.html_hr((SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
                        cb_td_show_references_module_section(module, references_modules);
                        if (cb_translation_browser.NIL != v_methods) {
                            v_methods = xref_database.xref_sort_called_methods(v_methods);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_methods_table(v_methods, (SubLObject)cb_translation_browser.$str119$Methods_called_by_this_method, (SubLObject)cb_translation_browser.$str60$Module, (SubLObject)cb_translation_browser.$sym102$CB_TD_SHOW_METHOD_DEFINING_MODULE);
                        }
                        if (cb_translation_browser.NIL != globals) {
                            globals = xref_database.xref_sort_called_globals(globals);
                            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
                            cb_td_show_globals_table(globals, (SubLObject)cb_translation_browser.$str120$Globals_referenced_by_this_method, (SubLObject)cb_translation_browser.$str60$Module, (SubLObject)cb_translation_browser.$sym104$CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                        }
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$53, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 20936L)
    public static SubLObject clear_package_terse_name() {
        final SubLObject cs = cb_translation_browser.$package_terse_name_caching_state$.getGlobalValue();
        if (cb_translation_browser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 20936L)
    public static SubLObject remove_package_terse_name(final SubLObject v_package) {
        return memoization_state.caching_state_remove_function_results_with_args(cb_translation_browser.$package_terse_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_package), (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 20936L)
    public static SubLObject package_terse_name_internal(final SubLObject v_package) {
        assert cb_translation_browser.NIL != Types.packagep(v_package) : v_package;
        final SubLObject nicknames = Packages.package_nicknames(v_package);
        if (cb_translation_browser.NIL != nicknames) {
            return nicknames.first();
        }
        return Packages.package_name(v_package);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 20936L)
    public static SubLObject package_terse_name(final SubLObject v_package) {
        SubLObject caching_state = cb_translation_browser.$package_terse_name_caching_state$.getGlobalValue();
        if (cb_translation_browser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_translation_browser.$sym121$PACKAGE_TERSE_NAME, (SubLObject)cb_translation_browser.$sym123$_PACKAGE_TERSE_NAME_CACHING_STATE_, (SubLObject)cb_translation_browser.NIL, (SubLObject)cb_translation_browser.EQ, (SubLObject)cb_translation_browser.ONE_INTEGER, (SubLObject)cb_translation_browser.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_package, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(package_terse_name_internal(v_package)));
            memoization_state.caching_state_put(caching_state, v_package, results, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 21222L)
    public static SubLObject clear_prin1_symbol_to_string() {
        final SubLObject cs = cb_translation_browser.$prin1_symbol_to_string_caching_state$.getGlobalValue();
        if (cb_translation_browser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 21222L)
    public static SubLObject remove_prin1_symbol_to_string(final SubLObject symbol) {
        return memoization_state.caching_state_remove_function_results_with_args(cb_translation_browser.$prin1_symbol_to_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(symbol), (SubLObject)cb_translation_browser.UNPROVIDED, (SubLObject)cb_translation_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 21222L)
    public static SubLObject prin1_symbol_to_string_internal(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_translation_browser.NIL != Types.symbolp(symbol) : symbol;
        if (symbol.eql(Packages.find_symbol(Symbols.symbol_name(symbol), Packages.$package$.getDynamicValue(thread)))) {
            return print_high.prin1_to_string(symbol);
        }
        final SubLObject v_package = Symbols.symbol_package(symbol);
        if (cb_translation_browser.NIL == v_package) {
            return PrintLow.format((SubLObject)cb_translation_browser.NIL, (SubLObject)cb_translation_browser.$str125$___A, Symbols.symbol_name(symbol));
        }
        return PrintLow.format((SubLObject)cb_translation_browser.NIL, (SubLObject)cb_translation_browser.$str126$_A___A, package_terse_name(v_package), Symbols.symbol_name(symbol));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 21222L)
    public static SubLObject prin1_symbol_to_string(final SubLObject symbol) {
        SubLObject caching_state = cb_translation_browser.$prin1_symbol_to_string_caching_state$.getGlobalValue();
        if (cb_translation_browser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_translation_browser.$sym124$PRIN1_SYMBOL_TO_STRING, (SubLObject)cb_translation_browser.$sym127$_PRIN1_SYMBOL_TO_STRING_CACHING_STATE_, (SubLObject)cb_translation_browser.NIL, (SubLObject)cb_translation_browser.EQ, (SubLObject)cb_translation_browser.ONE_INTEGER, (SubLObject)cb_translation_browser.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, symbol, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(prin1_symbol_to_string_internal(symbol)));
            memoization_state.caching_state_put(caching_state, symbol, results, (SubLObject)cb_translation_browser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 21724L)
    public static SubLObject cb_td_show_module_section(final SubLObject module, SubLObject position) {
        if (position == cb_translation_browser.UNPROVIDED) {
            position = (SubLObject)cb_translation_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_translation_browser.NIL != module) {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_utilities.html_princ((SubLObject)cb_translation_browser.$str72$Module___);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        cb_td_show_module(module);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                if (cb_translation_browser.NIL != position) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str128$Position___);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            html_utilities.html_princ(position);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                }
                final SubLObject pathname = translator_utilities.td_module_pathname(module);
                if (cb_translation_browser.NIL != pathname) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str129$Pathname___);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            cb_td_show_module_pathname(pathname);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str59$Features___);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            cb_td_show_module_features(module);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 22982L)
    public static SubLObject cb_td_show_module_properties(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_translation_browser.NIL != module) {
            final SubLObject pathname = translator_utilities.td_module_pathname(module);
            if (cb_translation_browser.NIL != pathname) {
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str129$Pathname___);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            cb_td_show_module_pathname(pathname);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            html_utilities.html_princ((SubLObject)cb_translation_browser.$str59$Features___);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            cb_td_show_module_features(module);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 23826L)
    public static SubLObject cb_td_show_methods_table(final SubLObject v_methods, final SubLObject method_title, final SubLObject value_title, final SubLObject value_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_princ(method_title);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_glyph((SubLObject)cb_translation_browser.$kw13$NBSP, (SubLObject)cb_translation_browser.TWO_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_princ(value_title);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            SubLObject cdolist_list_var = v_methods;
            SubLObject method = (SubLObject)cb_translation_browser.NIL;
            method = cdolist_list_var.first();
            while (cb_translation_browser.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_translation_browser.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_translation_browser.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    cb_td_show_faccess_hint(method);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    html_utilities.html_glyph((SubLObject)cb_translation_browser.$kw13$NBSP, (SubLObject)cb_translation_browser.TWO_INTEGER);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    cb_td_show_method(method);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        Functions.funcall(value_function, method);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 24640L)
    public static SubLObject cb_td_show_globals_table(final SubLObject globals, final SubLObject global_title, final SubLObject value_title, final SubLObject value_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_princ(global_title);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_glyph((SubLObject)cb_translation_browser.$kw13$NBSP, (SubLObject)cb_translation_browser.TWO_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_princ(value_title);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
            SubLObject cdolist_list_var = globals;
            SubLObject global = (SubLObject)cb_translation_browser.NIL;
            global = cdolist_list_var.first();
            while (cb_translation_browser.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_translation_browser.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_translation_browser.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    cb_td_show_vaccess_hint(global);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    html_utilities.html_glyph((SubLObject)cb_translation_browser.$kw13$NBSP, (SubLObject)cb_translation_browser.TWO_INTEGER);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                                    cb_td_show_global(global);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw37$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_translation_browser.$kw62$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_translation_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_translation_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_translation_browser.T, thread);
                        Functions.funcall(value_function, global);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_translation_browser.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                global = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 25454L)
    public static SubLObject cb_td_show_modules_table(final SubLObject v_modules, final SubLObject title) {
        html_utilities.html_princ(title);
        SubLObject cdolist_list_var = v_modules;
        SubLObject module = (SubLObject)cb_translation_browser.NIL;
        module = cdolist_list_var.first();
        while (cb_translation_browser.NIL != cdolist_list_var) {
            html_utilities.html_newline((SubLObject)cb_translation_browser.UNPROVIDED);
            cb_td_show_module(module);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 25625L)
    public static SubLObject cb_td_show_method_defining_module(final SubLObject method) {
        final SubLObject module = translator_utilities.td_method_defining_module(method);
        if (cb_translation_browser.NIL != module) {
            cb_td_show_module(module);
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 25806L)
    public static SubLObject cb_td_show_global_defining_module(final SubLObject global) {
        final SubLObject module = translator_utilities.td_global_defining_module(global);
        if (cb_translation_browser.NIL != module) {
            cb_td_show_module(module);
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 25986L)
    public static SubLObject cb_td_show_method_definition_attributes(final SubLObject method) {
        SubLObject attributes = (SubLObject)cb_translation_browser.NIL;
        if (cb_translation_browser.NIL != translator_utilities.td_method_macro_p(method)) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)cb_translation_browser.$str130$macro, attributes);
        }
        if (cb_translation_browser.NIL != translator_utilities.td_method_unused_p(method)) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)cb_translation_browser.$str131$no_callers, attributes);
        }
        else if (cb_translation_browser.NIL != translator_utilities.td_method_potentially_private_p(method)) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)cb_translation_browser.$str132$no_external_callers, attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return cb_td_show_attribute_list(attributes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 26428L)
    public static SubLObject cb_td_show_global_definition_attributes(final SubLObject global) {
        SubLObject attributes = (SubLObject)cb_translation_browser.NIL;
        final SubLObject pcase_var = translator_utilities.td_global_binding_type(global);
        if (pcase_var.eql((SubLObject)cb_translation_browser.$kw133$CONSTANT)) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)cb_translation_browser.$str134$constant, attributes);
        }
        else if (pcase_var.eql((SubLObject)cb_translation_browser.$kw135$LEXICAL)) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)cb_translation_browser.$str136$lexical, attributes);
        }
        else if (pcase_var.eql((SubLObject)cb_translation_browser.$kw137$SPECIAL)) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)cb_translation_browser.$str138$special, attributes);
        }
        if (cb_translation_browser.NIL != translator_utilities.td_global_unused_p(global)) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)cb_translation_browser.$str131$no_callers, attributes);
        }
        else if (cb_translation_browser.NIL != translator_utilities.td_global_potentially_private_p(global)) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)cb_translation_browser.$str132$no_external_callers, attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return cb_td_show_attribute_list(attributes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-translation-browser.lisp", position = 27029L)
    public static SubLObject cb_td_show_attribute_list(final SubLObject attributes) {
        if (cb_translation_browser.NIL != attributes) {
            SubLObject cdolist_list_var = attributes;
            SubLObject attribute = (SubLObject)cb_translation_browser.NIL;
            attribute = cdolist_list_var.first();
            while (cb_translation_browser.NIL != cdolist_list_var) {
                if (!attribute.eql(attributes.first())) {
                    html_utilities.html_princ((SubLObject)cb_translation_browser.$str87$__);
                }
                html_utilities.html_princ(attribute);
                cdolist_list_var = cdolist_list_var.rest();
                attribute = cdolist_list_var.first();
            }
        }
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    public static SubLObject declare_cb_translation_browser_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_document", "CB-TD-DOCUMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_method", "CB-TD-SHOW-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_global", "CB-TD-SHOW-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_module", "CB-TD-SHOW-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_faccess", "CB-TD-SHOW-FACCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_vaccess", "CB-TD-SHOW-VACCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_faccess_hint", "CB-TD-SHOW-FACCESS-HINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_vaccess_hint", "CB-TD-SHOW-VACCESS-HINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_access_hint", "CB-TD-SHOW-ACCESS-HINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_access_color", "CB-TD-ACCESS-COLOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_module_pathname", "CB-TD-SHOW-MODULE-PATHNAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_tool", "CB-TD-TOOL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_link_td_tool", "CB-LINK-TD-TOOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_search", "CB-TD-SEARCH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_link_td_search", "CB-LINK-TD-SEARCH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_search_guts", "CB-TD-SEARCH-GUTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_handle_search", "CB-TD-HANDLE-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_summary", "CB-TD-SUMMARY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_link_td_summary", "CB-LINK-TD-SUMMARY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_summary_guts", "CB-TD-SUMMARY-GUTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_translation_features", "CB-TD-SHOW-TRANSLATION-FEATURES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_module_features", "CB-TD-SHOW-MODULE-FEATURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_feature_expression", "CB-TD-SHOW-FEATURE-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_module", "CB-TD-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_link_td_module", "CB-LINK-TD-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_module_guts", "CB-TD-MODULE-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_top_level_methods_table", "CB-TD-SHOW-TOP-LEVEL-METHODS-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_top_level_globals_table", "CB-TD-SHOW-TOP-LEVEL-GLOBALS-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_referenced_by_module_section", "CB-TD-SHOW-REFERENCED-BY-MODULE-SECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_module_referenced_by_module", "CB-TD-SHOW-MODULE-REFERENCED-BY-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_references_module_section", "CB-TD-SHOW-REFERENCES-MODULE-SECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_module_references_module", "CB-TD-SHOW-MODULE-REFERENCES-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_global", "CB-TD-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_link_td_global", "CB-LINK-TD-GLOBAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_global_guts", "CB-TD-GLOBAL-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_method", "CB-TD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_link_td_method", "CB-LINK-TD-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_method_guts", "CB-TD-METHOD-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "clear_package_terse_name", "CLEAR-PACKAGE-TERSE-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "remove_package_terse_name", "REMOVE-PACKAGE-TERSE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "package_terse_name_internal", "PACKAGE-TERSE-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "package_terse_name", "PACKAGE-TERSE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "clear_prin1_symbol_to_string", "CLEAR-PRIN1-SYMBOL-TO-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "remove_prin1_symbol_to_string", "REMOVE-PRIN1-SYMBOL-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "prin1_symbol_to_string_internal", "PRIN1-SYMBOL-TO-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "prin1_symbol_to_string", "PRIN1-SYMBOL-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_module_section", "CB-TD-SHOW-MODULE-SECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_module_properties", "CB-TD-SHOW-MODULE-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_methods_table", "CB-TD-SHOW-METHODS-TABLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_globals_table", "CB-TD-SHOW-GLOBALS-TABLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_modules_table", "CB-TD-SHOW-MODULES-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_method_defining_module", "CB-TD-SHOW-METHOD-DEFINING-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_global_defining_module", "CB-TD-SHOW-GLOBAL-DEFINING-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_method_definition_attributes", "CB-TD-SHOW-METHOD-DEFINITION-ATTRIBUTES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_global_definition_attributes", "CB-TD-SHOW-GLOBAL-DEFINITION-ATTRIBUTES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_translation_browser", "cb_td_show_attribute_list", "CB-TD-SHOW-ATTRIBUTE-LIST", 1, 0, false);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    public static SubLObject init_cb_translation_browser_file() {
        cb_translation_browser.$cb_td_access_color_map$ = SubLFiles.deflexical("*CB-TD-ACCESS-COLOR-MAP*", (SubLObject)cb_translation_browser.$list14);
        cb_translation_browser.$package_terse_name_caching_state$ = SubLFiles.deflexical("*PACKAGE-TERSE-NAME-CACHING-STATE*", (SubLObject)cb_translation_browser.NIL);
        cb_translation_browser.$prin1_symbol_to_string_caching_state$ = SubLFiles.deflexical("*PRIN1-SYMBOL-TO-STRING-CACHING-STATE*", (SubLObject)cb_translation_browser.NIL);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    public static SubLObject setup_cb_translation_browser_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_translation_browser.$sym15$CB_TD_TOOL, (SubLObject)cb_translation_browser.$kw16$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_translation_browser.$kw19$TD_TOOL, (SubLObject)cb_translation_browser.$sym20$CB_LINK_TD_TOOL, (SubLObject)cb_translation_browser.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_translation_browser.$sym21$CB_TD_SEARCH, (SubLObject)cb_translation_browser.$kw16$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_translation_browser.$kw25$TD_SEARCH, (SubLObject)cb_translation_browser.$sym26$CB_LINK_TD_SEARCH, (SubLObject)cb_translation_browser.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_translation_browser.$sym52$CB_TD_HANDLE_SEARCH, (SubLObject)cb_translation_browser.$kw16$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_translation_browser.$sym53$CB_TD_SUMMARY, (SubLObject)cb_translation_browser.$kw16$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_translation_browser.$kw35$TD_SUMMARY, (SubLObject)cb_translation_browser.$sym56$CB_LINK_TD_SUMMARY, (SubLObject)cb_translation_browser.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_translation_browser.$sym67$CB_TD_MODULE, (SubLObject)cb_translation_browser.$kw16$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_translation_browser.$kw12$TD_MODULE, (SubLObject)cb_translation_browser.$sym70$CB_LINK_TD_MODULE, (SubLObject)cb_translation_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_translation_browser.$sym90$CB_TD_GLOBAL, (SubLObject)cb_translation_browser.$kw16$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_translation_browser.$kw11$TD_GLOBAL, (SubLObject)cb_translation_browser.$sym94$CB_LINK_TD_GLOBAL, (SubLObject)cb_translation_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_translation_browser.$sym108$CB_TD_METHOD, (SubLObject)cb_translation_browser.$kw16$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_translation_browser.$kw10$TD_METHOD, (SubLObject)cb_translation_browser.$sym110$CB_LINK_TD_METHOD, (SubLObject)cb_translation_browser.TWO_INTEGER);
        memoization_state.note_globally_cached_function((SubLObject)cb_translation_browser.$sym121$PACKAGE_TERSE_NAME);
        memoization_state.note_globally_cached_function((SubLObject)cb_translation_browser.$sym124$PRIN1_SYMBOL_TO_STRING);
        return (SubLObject)cb_translation_browser.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_translation_browser_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_translation_browser_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_translation_browser_file();
    }
    
    static {
        me = (SubLFile)new cb_translation_browser();
        cb_translation_browser.$cb_td_access_color_map$ = null;
        cb_translation_browser.$package_terse_name_caching_state$ = null;
        cb_translation_browser.$prin1_symbol_to_string_caching_state$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TITLE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$TITLE = SubLObjectFactory.makeKeyword("TITLE");
        $sym4$HTML_DOCUMENT = SubLObjectFactory.makeSymbol("HTML-DOCUMENT");
        $sym5$CB_HEAD = SubLObjectFactory.makeSymbol("CB-HEAD");
        $sym6$HTML_TITLE = SubLObjectFactory.makeSymbol("HTML-TITLE");
        $sym7$HTML_PRINC = SubLObjectFactory.makeSymbol("HTML-PRINC");
        $sym8$HTML_FANCY_BODY = SubLObjectFactory.makeSymbol("HTML-FANCY-BODY");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SHOW-COPYRIGHT"), (SubLObject)cb_translation_browser.T);
        $kw10$TD_METHOD = SubLObjectFactory.makeKeyword("TD-METHOD");
        $kw11$TD_GLOBAL = SubLObjectFactory.makeKeyword("TD-GLOBAL");
        $kw12$TD_MODULE = SubLObjectFactory.makeKeyword("TD-MODULE");
        $kw13$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIVATE"), (SubLObject)SubLObjectFactory.makeString("FF7F7F")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROTECTED"), (SubLObject)SubLObjectFactory.makeString("FFFF7F")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUBLIC"), (SubLObject)SubLObjectFactory.makeString("7FFF7F")));
        $sym15$CB_TD_TOOL = SubLObjectFactory.makeSymbol("CB-TD-TOOL");
        $kw16$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $kw17$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str18$cb_td_tool = SubLObjectFactory.makeString("cb-td-tool");
        $kw19$TD_TOOL = SubLObjectFactory.makeKeyword("TD-TOOL");
        $sym20$CB_LINK_TD_TOOL = SubLObjectFactory.makeSymbol("CB-LINK-TD-TOOL");
        $sym21$CB_TD_SEARCH = SubLObjectFactory.makeSymbol("CB-TD-SEARCH");
        $str22$_Translation_Database_Browser_ = SubLObjectFactory.makeString("[Translation Database Browser]");
        $kw23$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str24$cb_td_search = SubLObjectFactory.makeString("cb-td-search");
        $kw25$TD_SEARCH = SubLObjectFactory.makeKeyword("TD-SEARCH");
        $sym26$CB_LINK_TD_SEARCH = SubLObjectFactory.makeSymbol("CB-LINK-TD-SEARCH");
        $str27$There_is_no_current_SubL_translat = SubLObjectFactory.makeString("There is no current SubL translation state.");
        $str28$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str29$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw30$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw31$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str32$Translation_Database_Browser = SubLObjectFactory.makeString("Translation Database Browser");
        $str33$post = SubLObjectFactory.makeString("post");
        $str34$cb_td_handle_search = SubLObjectFactory.makeString("cb-td-handle-search");
        $kw35$TD_SUMMARY = SubLObjectFactory.makeKeyword("TD-SUMMARY");
        $str36$_Current_Translation_Summary_ = SubLObjectFactory.makeString("[Current Translation Summary]");
        $kw37$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw38$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str39$Find_a_ = SubLObjectFactory.makeString("Find a ");
        $str40$kind = SubLObjectFactory.makeString("kind");
        $str41$method = SubLObjectFactory.makeString("method");
        $str42$function_or_macro = SubLObjectFactory.makeString("function or macro");
        $str43$global = SubLObjectFactory.makeString("global");
        $str44$global_variable = SubLObjectFactory.makeString("global variable");
        $str45$module = SubLObjectFactory.makeString("module");
        $str46$source_file = SubLObjectFactory.makeString("source file");
        $str47$_called = SubLObjectFactory.makeString(" called");
        $str48$name = SubLObjectFactory.makeString("name");
        $int49$40 = SubLObjectFactory.makeInteger(40);
        $str50$Find_now = SubLObjectFactory.makeString("Find now");
        $str51$Clear_Input = SubLObjectFactory.makeString("Clear Input");
        $sym52$CB_TD_HANDLE_SEARCH = SubLObjectFactory.makeSymbol("CB-TD-HANDLE-SEARCH");
        $sym53$CB_TD_SUMMARY = SubLObjectFactory.makeSymbol("CB-TD-SUMMARY");
        $str54$_Summary_ = SubLObjectFactory.makeString("[Summary]");
        $str55$cb_td_summary = SubLObjectFactory.makeString("cb-td-summary");
        $sym56$CB_LINK_TD_SUMMARY = SubLObjectFactory.makeSymbol("CB-LINK-TD-SUMMARY");
        $str57$Translation_Summary = SubLObjectFactory.makeString("Translation Summary");
        $str58$_Search_Page_ = SubLObjectFactory.makeString("[Search Page]");
        $str59$Features___ = SubLObjectFactory.makeString("Features : ");
        $str60$Module = SubLObjectFactory.makeString("Module");
        $str61$Features = SubLObjectFactory.makeString("Features");
        $kw62$TOP = SubLObjectFactory.makeKeyword("TOP");
        $list63 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-EXPRESSIONS"));
        $str64$_ = SubLObjectFactory.makeString("(");
        $str65$_ = SubLObjectFactory.makeString(")");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"));
        $sym67$CB_TD_MODULE = SubLObjectFactory.makeSymbol("CB-TD-MODULE");
        $sym68$TD_MODULE_P = SubLObjectFactory.makeSymbol("TD-MODULE-P");
        $str69$cb_td_module_ = SubLObjectFactory.makeString("cb-td-module|");
        $sym70$CB_LINK_TD_MODULE = SubLObjectFactory.makeSymbol("CB-LINK-TD-MODULE");
        $str71$Module____A = SubLObjectFactory.makeString("Module : ~A");
        $str72$Module___ = SubLObjectFactory.makeString("Module : ");
        $str73$Properties = SubLObjectFactory.makeString("Properties");
        $str74$Definitions = SubLObjectFactory.makeString("Definitions");
        $str75$Globals_defined_in_this_module = SubLObjectFactory.makeString("Globals defined in this module");
        $str76$Attributes = SubLObjectFactory.makeString("Attributes");
        $sym77$CB_TD_SHOW_GLOBAL_DEFINITION_ATTRIBUTES = SubLObjectFactory.makeSymbol("CB-TD-SHOW-GLOBAL-DEFINITION-ATTRIBUTES");
        $str78$Methods_defined_in_this_module = SubLObjectFactory.makeString("Methods defined in this module");
        $sym79$CB_TD_SHOW_METHOD_DEFINITION_ATTRIBUTES = SubLObjectFactory.makeSymbol("CB-TD-SHOW-METHOD-DEFINITION-ATTRIBUTES");
        $str80$Top_Level_References = SubLObjectFactory.makeString("Top-Level References");
        $str81$Methods_called_by_top_level_forms = SubLObjectFactory.makeString("Methods called by top-level forms in this module");
        $str82$Globals_called_by_top_level_forms = SubLObjectFactory.makeString("Globals called by top-level forms in this module");
        $str83$Methods = SubLObjectFactory.makeString("Methods");
        $str84$File_positions = SubLObjectFactory.makeString("File positions");
        $str85$Globals = SubLObjectFactory.makeString("Globals");
        $str86$Callers__ = SubLObjectFactory.makeString("Callers :");
        $str87$__ = SubLObjectFactory.makeString(", ");
        $str88$Calls__ = SubLObjectFactory.makeString("Calls :");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PACKAGE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-STRING"));
        $sym90$CB_TD_GLOBAL = SubLObjectFactory.makeSymbol("CB-TD-GLOBAL");
        $sym91$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $str92$cb_td_global_ = SubLObjectFactory.makeString("cb-td-global|");
        $str93$_ = SubLObjectFactory.makeString("|");
        $sym94$CB_LINK_TD_GLOBAL = SubLObjectFactory.makeSymbol("CB-LINK-TD-GLOBAL");
        $str95$Global____S = SubLObjectFactory.makeString("Global : ~S");
        $str96$Global_Variable___ = SubLObjectFactory.makeString("Global Variable : ");
        $str97$Access___ = SubLObjectFactory.makeString("Access : ");
        $str98$Definition = SubLObjectFactory.makeString("Definition");
        $str99$Internal_variable = SubLObjectFactory.makeString("Internal variable");
        $str100$Undefined_variable = SubLObjectFactory.makeString("Undefined variable");
        $str101$Methods_that_reference_this_globa = SubLObjectFactory.makeString("Methods that reference this global");
        $sym102$CB_TD_SHOW_METHOD_DEFINING_MODULE = SubLObjectFactory.makeSymbol("CB-TD-SHOW-METHOD-DEFINING-MODULE");
        $str103$Globals_whose_initialization_refe = SubLObjectFactory.makeString("Globals whose initialization references this global");
        $sym104$CB_TD_SHOW_GLOBAL_DEFINING_MODULE = SubLObjectFactory.makeSymbol("CB-TD-SHOW-GLOBAL-DEFINING-MODULE");
        $str105$Modules_that_reference_this_globa = SubLObjectFactory.makeString("Modules that reference this global from top-level forms");
        $str106$Methods_called_in_the_initializat = SubLObjectFactory.makeString("Methods called in the initialization of this global");
        $str107$Globals_referenced_in_the_initial = SubLObjectFactory.makeString("Globals referenced in the initialization of this global");
        $sym108$CB_TD_METHOD = SubLObjectFactory.makeSymbol("CB-TD-METHOD");
        $str109$cb_td_method_ = SubLObjectFactory.makeString("cb-td-method|");
        $sym110$CB_LINK_TD_METHOD = SubLObjectFactory.makeSymbol("CB-LINK-TD-METHOD");
        $str111$Method____S = SubLObjectFactory.makeString("Method : ~S");
        $str112$Method___ = SubLObjectFactory.makeString("Method : ");
        $str113$Arglist___ = SubLObjectFactory.makeString("Arglist : ");
        $str114$Internal_method = SubLObjectFactory.makeString("Internal method");
        $str115$Undefined_method = SubLObjectFactory.makeString("Undefined method");
        $str116$Methods_that_call_this_method = SubLObjectFactory.makeString("Methods that call this method");
        $str117$Globals_whose_initialization_call = SubLObjectFactory.makeString("Globals whose initialization calls this method");
        $str118$Modules_that_call_this_method_fro = SubLObjectFactory.makeString("Modules that call this method from top-level forms");
        $str119$Methods_called_by_this_method = SubLObjectFactory.makeString("Methods called by this method");
        $str120$Globals_referenced_by_this_method = SubLObjectFactory.makeString("Globals referenced by this method");
        $sym121$PACKAGE_TERSE_NAME = SubLObjectFactory.makeSymbol("PACKAGE-TERSE-NAME");
        $sym122$PACKAGEP = SubLObjectFactory.makeSymbol("PACKAGEP");
        $sym123$_PACKAGE_TERSE_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PACKAGE-TERSE-NAME-CACHING-STATE*");
        $sym124$PRIN1_SYMBOL_TO_STRING = SubLObjectFactory.makeSymbol("PRIN1-SYMBOL-TO-STRING");
        $str125$___A = SubLObjectFactory.makeString("#:~A");
        $str126$_A___A = SubLObjectFactory.makeString("~A::~A");
        $sym127$_PRIN1_SYMBOL_TO_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PRIN1-SYMBOL-TO-STRING-CACHING-STATE*");
        $str128$Position___ = SubLObjectFactory.makeString("Position : ");
        $str129$Pathname___ = SubLObjectFactory.makeString("Pathname : ");
        $str130$macro = SubLObjectFactory.makeString("macro");
        $str131$no_callers = SubLObjectFactory.makeString("no callers");
        $str132$no_external_callers = SubLObjectFactory.makeString("no external callers");
        $kw133$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $str134$constant = SubLObjectFactory.makeString("constant");
        $kw135$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $str136$lexical = SubLObjectFactory.makeString("lexical");
        $kw137$SPECIAL = SubLObjectFactory.makeKeyword("SPECIAL");
        $str138$special = SubLObjectFactory.makeString("special");
    }
}

/*

	Total time: 1221 ms
	
*/