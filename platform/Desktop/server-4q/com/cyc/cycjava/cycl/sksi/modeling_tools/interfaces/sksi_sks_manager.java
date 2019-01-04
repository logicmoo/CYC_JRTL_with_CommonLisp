package com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_preference_module_generation;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_manager extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager";
    public static final String myFingerPrint = "69721c14ce0d3b768fcd0cec8d7326ee5aa24770017589ef8f08c3b3f4a99b5d";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 1413L)
    private static SubLSymbol $sksi_sks_manager_storage_module_support_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 1518L)
    private static SubLSymbol $sksi_sks_manager_check_sks_status_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 4586L)
    private static SubLSymbol $sksi_removal_modules_registered_knowledge_sources$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 5433L)
    private static SubLSymbol $sksi_content_mts_with_registered_removal_module$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 7433L)
    private static SubLSymbol $sksi_storage_modules_registered_knowledge_sources$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 8141L)
    private static SubLSymbol $sksi_content_mts_with_registered_storage_module$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 16956L)
    private static SubLSymbol $sksi_expanded_knowledge_sources$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    private static SubLSymbol $url_expand_image$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    private static SubLSymbol $url_contract_image$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    private static SubLSymbol $url_blank_image$;
    private static final SubLString $str0$SKSI_Structured_Knowledge_Source_;
    private static final SubLSymbol $sym1$SKSI_SKS_MANAGER;
    private static final SubLSymbol $kw2$HTML_HANDLER;
    private static final SubLString $str3$_SKSI_SKS_Manager_;
    private static final SubLSymbol $kw4$MAIN;
    private static final SubLString $str5$sksi_sks_manager;
    private static final SubLSymbol $kw6$SKSI_SKS_MANAGER;
    private static final SubLSymbol $sym7$CB_LINK_SKSI_SKS_MANAGER;
    private static final SubLString $str8$SKS_Manager;
    private static final SubLString $str9$SKSMan;
    private static final SubLString $str10$SKSI_SKS_Manager;
    private static final SubLSymbol $sym11$_SKSI_REMOVAL_MODULES_REGISTERED_KNOWLEDGE_SOURCES_;
    private static final SubLSymbol $sym12$SKS_REGISTERED_P;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$_SKSI_CONTENT_MTS_WITH_REGISTERED_REMOVAL_MODULE_;
    private static final SubLSymbol $sym15$SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$CLEAR_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$ADD_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE_FOR_SKS;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$REMOVE_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE_FOR_SKS;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$_SKSI_STORAGE_MODULES_REGISTERED_KNOWLEDGE_SOURCES_;
    private static final SubLSymbol $sym24$_SKSI_CONTENT_MTS_WITH_REGISTERED_STORAGE_MODULE_;
    private static final SubLSymbol $sym25$SKSI_REGISTERED_KNOWLEDGE_SOURCES_ADD;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$SKSI_REGISTERED_KNOWLEDGE_SOURCES_REMOVE_PARTIAL;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$_SKSI_EXPANDED_KNOWLEDGE_SOURCES_;
    private static final SubLSymbol $sym30$TERM___WITH_CONSTANT_BY_NAME;
    private static final SubLSymbol $kw31$SKS_EXPAND;
    private static final SubLString $str32$right_triangle_blue_gif;
    private static final SubLSymbol $kw33$SKS_CONTRACT;
    private static final SubLString $str34$down_triangle_blue_gif;
    private static final SubLSymbol $kw35$SKS_BLANK;
    private static final SubLString $str36$blank_gif;
    private static final SubLString $str37$_cycdoc_img_cb_right_triangle_blu;
    private static final SubLString $str38$_cycdoc_img_cb_down_triangle_blue;
    private static final SubLString $str39$_cycdoc_img_cb_blank_gif;
    private static final SubLString $str40$Structured_Knowledge_Source_Manag;
    private static final SubLString $str41$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str42$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw43$UNINITIALIZED;
    private static final SubLSymbol $kw44$CB_CYC;
    private static final SubLSymbol $kw45$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw46$SHA1;
    private static final SubLString $str47$yui_skin_sam;
    private static final SubLString $str48$reloadFrameButton;
    private static final SubLString $str49$button;
    private static final SubLString $str50$reload;
    private static final SubLString $str51$Refresh_Frames;
    private static final SubLString $str52$post;
    private static final SubLString $str53$sksi_sks_manager_input;
    private static final SubLString $str54$_444444;
    private static final SubLString $str55$_ffffff;
    private static final SubLSymbol $kw56$NBSP;
    private static final SubLSymbol $kw57$CENTER;
    private static final SubLString $str58$REMOVAL;
    private static final SubLString $str59$MODULES;
    private static final SubLString $str60$STORAGE;
    private static final SubLString $str61$Up_;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLString $str64$Enter;
    private static final SubLString $str65$enter;
    private static final SubLString $str66$_dddddd;
    private static final SubLString $str67$_cccccc;
    private static final SubLSymbol $kw68$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym69$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str70$BROKEN_;
    private static final SubLFloat $float71$0_2;
    private static final SubLSymbol $kw72$IGNORE;
    private static final SubLSymbol $sym73$VALID_SKSI_ERROR_HANDLING_MODE_P;
    private static final SubLString $str74$Up;
    private static final SubLString $str75$Down;
    private static final SubLSymbol $kw76$PARTIAL;
    private static final SubLString $str77$Some_registered;
    private static final SubLString $str78$_DDDDFF;
    private static final SubLSymbol $kw79$REG;
    private static final SubLString $str80$All_registered_br__span_style__fo;
    private static final SubLString $str81$_modules___span_;
    private static final SubLString $str82$_AAAAFF;
    private static final SubLSymbol $kw83$NOREG;
    private static final SubLString $str84$;
    private static final SubLString $str85$All_registered;
    private static final SubLString $str86$All_br__span_style__font_size_80_;
    private static final SubLSymbol $sym87$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const88$EverythingPSC;
    private static final SubLString $str89$expansion_;
    private static final SubLObject $const90$Database_Physical;
    private static final SubLString $str91$DB_;
    private static final SubLString $str92$postgresql;
    private static final SubLString $str93$psql;
    private static final SubLString $str94$poisedata;
    private static final SubLString $str95$POISE;
    private static final SubLObject $const96$RDFTripleStore_Physical;
    private static final SubLString $str97$RDF;
    private static final SubLObject $const98$WebPage_AIS;
    private static final SubLString $str99$HTTP;
    private static final SubLString $str100$register_removal_;
    private static final SubLString $str101$deregister_removal_;
    private static final SubLString $str102$gray;
    private static final SubLString $str103$register_storage_;
    private static final SubLString $str104$deregister_storage_;
    private static final SubLString $str105$_eeeeee;
    private static final SubLSymbol $kw106$TOP;
    private static final SubLString $str107$All;
    private static final SubLString $str108$register_removal_all;
    private static final SubLString $str109$deregister_removal_all;
    private static final SubLString $str110$register_storage_all;
    private static final SubLString $str111$deregister_storage_all;
    private static final SubLString $str112$_x;
    private static final SubLString $str113$_y;
    private static final SubLString $str114$on;
    private static final SubLString $str115$all;
    private static final SubLString $str116$_A_new_SKSI_removal_modules_have_;
    private static final SubLString $str117$_A_new_SKSI_preference_modules_ha;
    private static final SubLString $str118$_A_SKSI_removal_modules_have_been;
    private static final SubLString $str119$_A_SKSI_preference_modules_have_b;
    private static final SubLString $str120$_A_new_SKSI_storage_modules_have_;
    private static final SubLString $str121$_A_SKSI_storage_modules_have_been;
    private static final SubLString $str122$Currently__you_have__A_SKSI_remov;
    private static final SubLString $str123$There_are_also__A_SKSI_HL_storage;
    private static final SubLSymbol $sym124$SKSI_SKS_MANAGER_INPUT;
    private static final SubLSymbol $sym125$SK_SOURCE_REGISTERED_;
    private static final SubLSymbol $sym126$SKS_REGISTRATION_STATE;
    private static final SubLList $list127;
    private static final SubLString $str128$registering_knowledge_sources_;
    private static final SubLString $str129$cb_sks_register_applied_to_non_kn;
    private static final SubLSymbol $sym130$CB_SKS_REGISTER;
    private static final SubLString $str131$cb_sks_register__A;
    private static final SubLString $str132$_Register_KS_;
    private static final SubLSymbol $kw133$SKSI_REGISTER;
    private static final SubLSymbol $sym134$CB_LINK_SKSI_REGISTER;
    private static final SubLString $str135$deregistering_knowledge_sources_;
    private static final SubLString $str136$cb_register_applied_to_non_knowle;
    private static final SubLSymbol $sym137$CB_SKS_DEREGISTER;
    private static final SubLString $str138$cb_sks_deregister__A;
    private static final SubLString $str139$_Deregister_KS_;
    private static final SubLSymbol $kw140$SKSI_DEREGISTER;
    private static final SubLSymbol $sym141$CB_LINK_SKSI_DEREGISTER;
    private static final SubLSymbol $sym142$SK_SOURCE_P;
    private static final SubLSymbol $sym143$SK_SOURCE_PROPER_SUB_KS_CLOSURE_IN_MAPPING_MT;
    private static final SubLList $list144;
    private static final SubLSymbol $sym145$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym146$SKS_REGISTRATION_STATE_P;
    private static final SubLList $list147;
    private static final SubLList $list148;
    private static final SubLList $list149;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 1591L)
    public static SubLObject sksi_sks_manager(SubLObject args) {
        if (args == sksi_sks_manager.UNPROVIDED) {
            args = (SubLObject)sksi_sks_manager.NIL;
        }
        if (sksi_sks_manager.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)sksi_sks_manager.$str0$SKSI_Structured_Knowledge_Source_);
        }
        else {
            sksi_sks_manager_internal(args);
        }
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 1591L)
    public static SubLObject cb_link_sksi_sks_manager(SubLObject linktext) {
        if (linktext == sksi_sks_manager.UNPROVIDED) {
            linktext = (SubLObject)sksi_sks_manager.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_manager.NIL == linktext) {
            linktext = (SubLObject)sksi_sks_manager.$str3$_SKSI_SKS_Manager_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)sksi_sks_manager.$kw4$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)sksi_sks_manager.$str5$sksi_sks_manager);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        if (sksi_sks_manager.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 3091L)
    public static SubLObject sks_get_sub_skses(final SubLObject sks) {
        return sksi_kb_accessors.sk_source_immediate_spec_sk_sources(sks, sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_sks_manager.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 3731L)
    public static SubLObject sks_depth(final SubLObject sks, SubLObject depth) {
        if (depth == sksi_sks_manager.UNPROVIDED) {
            depth = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        }
        final SubLObject superks = sksi_sks_accessors.sks_get_super_sks(sks);
        if (sksi_sks_manager.NIL != superks) {
            return sks_depth(superks, Numbers.add((SubLObject)sksi_sks_manager.ONE_INTEGER, depth));
        }
        return depth;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 4120L)
    public static SubLObject clear_sksi_registered_knowledge_sources() {
        clear_sksi_removal_modules_registered_knowledge_sources();
        clear_sksi_storage_modules_registered_knowledge_sources();
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 4379L)
    public static SubLObject sksi_registered_knowledge_sources() {
        return list_utilities.fast_delete_duplicates(ConsesLow.append(sksi_removal_modules_registered_knowledge_sources(), sksi_storage_modules_registered_knowledge_sources()), (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 4820L)
    public static SubLObject sksi_removal_modules_registered_knowledge_sources() {
        return sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 4953L)
    public static SubLObject clear_sksi_removal_modules_registered_knowledge_sources() {
        sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.setGlobalValue((SubLObject)sksi_sks_manager.NIL);
        return sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 5158L)
    public static SubLObject sks_registered_p(final SubLObject sks) {
        return sks_removal_modules_registered_p(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 5298L)
    public static SubLObject sks_removal_modules_registered_p(final SubLObject sks) {
        return subl_promotions.memberP(sks, sksi_removal_modules_registered_knowledge_sources(), Symbols.symbol_function((SubLObject)sksi_sks_manager.EQ), (SubLObject)sksi_sks_manager.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 5668L)
    public static SubLObject sksi_content_mts_with_registered_module() {
        return sksi_content_mts_with_registered_removal_module();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 5854L)
    public static SubLObject sksi_content_mts_with_registered_removal_module() {
        return sksi_sks_manager.$sksi_content_mts_with_registered_removal_module$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 5982L)
    public static SubLObject clear_sksi_content_mts_with_registered_module() {
        return clear_sksi_content_mts_with_registered_removal_module();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 6233L)
    public static SubLObject clear_sksi_content_mts_with_registered_removal_module() {
        sksi_sks_manager.$sksi_content_mts_with_registered_removal_module$.setGlobalValue((SubLObject)sksi_sks_manager.NIL);
        return sksi_sks_manager.$sksi_content_mts_with_registered_removal_module$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 6431L)
    public static SubLObject add_sksi_content_mts_with_registered_module_for_sks(final SubLObject sks) {
        return add_sksi_content_mts_with_registered_removal_module_for_sks(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 6662L)
    public static SubLObject add_sksi_content_mts_with_registered_removal_module_for_sks(final SubLObject sks) {
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
        sksi_sks_manager.$sksi_content_mts_with_registered_removal_module$.setGlobalValue((SubLObject)ConsesLow.cons(content_mt, sksi_sks_manager.$sksi_content_mts_with_registered_removal_module$.getGlobalValue()));
        return content_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 6888L)
    public static SubLObject remove_sksi_content_mts_with_registered_module_for_sks(final SubLObject sks) {
        return remove_sksi_content_mts_with_registered_removal_module_for_sks(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 7126L)
    public static SubLObject remove_sksi_content_mts_with_registered_removal_module_for_sks(final SubLObject sks) {
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
        sksi_sks_manager.$sksi_content_mts_with_registered_removal_module$.setGlobalValue(list_utilities.remove_first(content_mt, sksi_sks_manager.$sksi_content_mts_with_registered_removal_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_manager.EQUAL)));
        return content_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 7667L)
    public static SubLObject sksi_storage_modules_registered_knowledge_sources() {
        return sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 7800L)
    public static SubLObject clear_sksi_storage_modules_registered_knowledge_sources() {
        sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.setGlobalValue((SubLObject)sksi_sks_manager.NIL);
        return sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 8005L)
    public static SubLObject sks_storage_modules_registered_p(final SubLObject sks) {
        return subl_promotions.memberP(sks, sksi_storage_modules_registered_knowledge_sources(), Symbols.symbol_function((SubLObject)sksi_sks_manager.EQ), (SubLObject)sksi_sks_manager.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 8376L)
    public static SubLObject sksi_content_mts_with_registered_storage_module() {
        return sksi_sks_manager.$sksi_content_mts_with_registered_storage_module$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 8505L)
    public static SubLObject clear_sksi_content_mts_with_registered_storage_module() {
        sksi_sks_manager.$sksi_content_mts_with_registered_storage_module$.setGlobalValue((SubLObject)sksi_sks_manager.NIL);
        return sksi_sks_manager.$sksi_content_mts_with_registered_storage_module$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 8751L)
    public static SubLObject add_sksi_content_mts_with_registered_storage_module_for_sks(final SubLObject sks) {
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
        sksi_sks_manager.$sksi_content_mts_with_registered_storage_module$.setGlobalValue((SubLObject)ConsesLow.cons(content_mt, sksi_sks_manager.$sksi_content_mts_with_registered_storage_module$.getGlobalValue()));
        return content_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 8980L)
    public static SubLObject remove_sksi_content_mts_with_registered_storage_module_for_sks(final SubLObject sks) {
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(sks);
        sksi_sks_manager.$sksi_content_mts_with_registered_storage_module$.setGlobalValue(list_utilities.remove_first(content_mt, sksi_sks_manager.$sksi_content_mts_with_registered_storage_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_manager.EQUAL)));
        return content_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 9288L)
    public static SubLObject sksi_registered_knowledge_sources_add(final SubLObject sks) {
        return sksi_removal_modules_registered_knowledge_sources_add(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 9546L)
    public static SubLObject sksi_removal_modules_registered_knowledge_sources_add(final SubLObject sks) {
        if (sksi_sks_manager.NIL == sks_removal_modules_registered_p(sks)) {
            final SubLObject subs = sks_get_sub_skses(sks);
            final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
            final SubLObject siblings = (SubLObject)((sksi_sks_manager.NIL != v_super) ? sks_get_sub_skses(v_super) : sksi_sks_manager.NIL);
            if (sksi_sks_manager.NIL == conses_high.member(sks, sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_manager.EQL), Symbols.symbol_function((SubLObject)sksi_sks_manager.IDENTITY))) {
                sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.setGlobalValue((SubLObject)ConsesLow.cons(sks, sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue()));
            }
            sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.setGlobalValue(sksi_infrastructure_utilities.sort_knowledge_sources(sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue()));
            add_sksi_content_mts_with_registered_removal_module_for_sks(sks);
            if (sksi_sks_manager.NIL != subs) {
                SubLObject cdolist_list_var = subs;
                SubLObject sub = (SubLObject)sksi_sks_manager.NIL;
                sub = cdolist_list_var.first();
                while (sksi_sks_manager.NIL != cdolist_list_var) {
                    sksi_removal_modules_registered_knowledge_sources_add(sub);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub = cdolist_list_var.first();
                }
            }
            if (sksi_sks_manager.NIL != v_super && sksi_sks_manager.NIL != conses_high.subsetp(siblings, sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_manager.EQUAL), (SubLObject)sksi_sks_manager.UNPROVIDED) && sksi_sks_manager.NIL == sks_removal_modules_registered_p(v_super)) {
                sksi_removal_modules_registered_knowledge_sources_add(v_super);
            }
        }
        return sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 10504L)
    public static SubLObject sksi_registered_knowledge_sources_remove_partial(final SubLObject sks) {
        return sksi_removal_modules_registered_knowledge_sources_remove_partial(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 10740L)
    public static SubLObject sksi_removal_modules_registered_knowledge_sources_remove_partial(final SubLObject sks) {
        if (sksi_sks_manager.NIL != sks_removal_modules_registered_p(sks)) {
            final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
            sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.setGlobalValue(Sequences.remove(sks, sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue(), (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED));
            remove_sksi_content_mts_with_registered_removal_module_for_sks(sks);
            if (sksi_sks_manager.NIL != v_super) {
                sksi_removal_modules_registered_knowledge_sources_remove_partial(v_super);
            }
        }
        return sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 11404L)
    public static SubLObject sksi_removal_modules_registered_knowledge_sources_remove(final SubLObject sks) {
        final SubLObject subs = sks_get_sub_skses(sks);
        final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
        sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.setGlobalValue(Sequences.remove(sks, sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue(), (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED));
        remove_sksi_content_mts_with_registered_removal_module_for_sks(sks);
        if (sksi_sks_manager.NIL != subs) {
            SubLObject cdolist_list_var = subs;
            SubLObject sub = (SubLObject)sksi_sks_manager.NIL;
            sub = cdolist_list_var.first();
            while (sksi_sks_manager.NIL != cdolist_list_var) {
                sksi_removal_modules_registered_knowledge_sources_remove(sub);
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            }
        }
        if (sksi_sks_manager.NIL != v_super) {
            sksi_removal_modules_registered_knowledge_sources_remove_partial(v_super);
        }
        return sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 12103L)
    public static SubLObject removal_modules_registered_sub_skses(final SubLObject sks) {
        SubLObject removal_modules_registered_subs = (SubLObject)sksi_sks_manager.NIL;
        SubLObject cdolist_list_var;
        final SubLObject sub_skses = cdolist_list_var = sks_get_sub_skses(sks);
        SubLObject sub = (SubLObject)sksi_sks_manager.NIL;
        sub = cdolist_list_var.first();
        while (sksi_sks_manager.NIL != cdolist_list_var) {
            if (sksi_sks_manager.NIL != sks_removal_modules_registered_p(sub)) {
                final SubLObject item_var = sub;
                if (sksi_sks_manager.NIL == conses_high.member(item_var, removal_modules_registered_subs, Symbols.symbol_function((SubLObject)sksi_sks_manager.EQL), Symbols.symbol_function((SubLObject)sksi_sks_manager.IDENTITY))) {
                    removal_modules_registered_subs = (SubLObject)ConsesLow.cons(item_var, removal_modules_registered_subs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub = cdolist_list_var.first();
        }
        return removal_modules_registered_subs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 12505L)
    public static SubLObject any_sub_ks_removal_modules_registeredP(final SubLObject sks) {
        final SubLObject sub_skses = sks_get_sub_skses(sks);
        SubLObject removal_modules_registeredP = (SubLObject)sksi_sks_manager.NIL;
        if (sksi_sks_manager.NIL == removal_modules_registeredP) {
            SubLObject csome_list_var = sub_skses;
            SubLObject sub = (SubLObject)sksi_sks_manager.NIL;
            sub = csome_list_var.first();
            while (sksi_sks_manager.NIL == removal_modules_registeredP && sksi_sks_manager.NIL != csome_list_var) {
                if (sksi_sks_manager.NIL != sks_removal_modules_registered_p(sub)) {
                    removal_modules_registeredP = (SubLObject)sksi_sks_manager.T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            }
        }
        return removal_modules_registeredP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 12906L)
    public static SubLObject any_closure_sub_ks_removal_modules_registeredP(final SubLObject sks) {
        final SubLObject sub_skses = sksi_kb_accessors.sk_source_proper_sub_ks_closure_in_mapping_mt(sks);
        SubLObject removal_modules_registeredP = (SubLObject)sksi_sks_manager.NIL;
        if (sksi_sks_manager.NIL == removal_modules_registeredP) {
            SubLObject csome_list_var = sub_skses;
            SubLObject sub = (SubLObject)sksi_sks_manager.NIL;
            sub = csome_list_var.first();
            while (sksi_sks_manager.NIL == removal_modules_registeredP && sksi_sks_manager.NIL != csome_list_var) {
                if (sksi_sks_manager.NIL != sks_removal_modules_registered_p(sub)) {
                    removal_modules_registeredP = (SubLObject)sksi_sks_manager.T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            }
        }
        return removal_modules_registeredP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 13341L)
    public static SubLObject sksi_storage_modules_registered_knowledge_sources_add(final SubLObject sks) {
        if (sksi_sks_manager.NIL == sks_storage_modules_registered_p(sks)) {
            final SubLObject subs = sks_get_sub_skses(sks);
            final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
            final SubLObject siblings = (SubLObject)((sksi_sks_manager.NIL != v_super) ? sks_get_sub_skses(v_super) : sksi_sks_manager.NIL);
            if (sksi_sks_manager.NIL == conses_high.member(sks, sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_manager.EQL), Symbols.symbol_function((SubLObject)sksi_sks_manager.IDENTITY))) {
                sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.setGlobalValue((SubLObject)ConsesLow.cons(sks, sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue()));
            }
            sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.setGlobalValue(sksi_infrastructure_utilities.sort_knowledge_sources(sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue()));
            add_sksi_content_mts_with_registered_removal_module_for_sks(sks);
            if (sksi_sks_manager.NIL != subs) {
                SubLObject cdolist_list_var = subs;
                SubLObject sub = (SubLObject)sksi_sks_manager.NIL;
                sub = cdolist_list_var.first();
                while (sksi_sks_manager.NIL != cdolist_list_var) {
                    sksi_storage_modules_registered_knowledge_sources_add(sub);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub = cdolist_list_var.first();
                }
            }
            if (sksi_sks_manager.NIL != v_super && sksi_sks_manager.NIL != conses_high.subsetp(siblings, sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_manager.EQUAL), (SubLObject)sksi_sks_manager.UNPROVIDED) && sksi_sks_manager.NIL == sks_storage_modules_registered_p(v_super)) {
                sksi_storage_modules_registered_knowledge_sources_add(v_super);
            }
        }
        return sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 14354L)
    public static SubLObject sksi_storage_modules_registered_knowledge_sources_remove_partial(final SubLObject sks) {
        if (sksi_sks_manager.NIL != sks_storage_modules_registered_p(sks)) {
            final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
            sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.setGlobalValue(Sequences.remove(sks, sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue(), (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED));
            remove_sksi_content_mts_with_registered_storage_module_for_sks(sks);
            if (sksi_sks_manager.NIL != v_super) {
                sksi_storage_modules_registered_knowledge_sources_remove_partial(v_super);
            }
        }
        return sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 15019L)
    public static SubLObject sksi_storage_modules_registered_knowledge_sources_remove(final SubLObject sks) {
        final SubLObject subs = sks_get_sub_skses(sks);
        final SubLObject v_super = sksi_sks_accessors.sks_get_super_sks(sks);
        sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.setGlobalValue(Sequences.remove(sks, sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue(), (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED));
        remove_sksi_content_mts_with_registered_storage_module_for_sks(sks);
        if (sksi_sks_manager.NIL != subs) {
            SubLObject cdolist_list_var = subs;
            SubLObject sub = (SubLObject)sksi_sks_manager.NIL;
            sub = cdolist_list_var.first();
            while (sksi_sks_manager.NIL != cdolist_list_var) {
                sksi_storage_modules_registered_knowledge_sources_remove(sub);
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            }
        }
        if (sksi_sks_manager.NIL != v_super) {
            sksi_storage_modules_registered_knowledge_sources_remove_partial(v_super);
        }
        return sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 15718L)
    public static SubLObject storage_modules_registered_sub_skses(final SubLObject sks) {
        SubLObject storage_modules_registered_subs = (SubLObject)sksi_sks_manager.NIL;
        SubLObject cdolist_list_var;
        final SubLObject sub_skses = cdolist_list_var = sks_get_sub_skses(sks);
        SubLObject sub = (SubLObject)sksi_sks_manager.NIL;
        sub = cdolist_list_var.first();
        while (sksi_sks_manager.NIL != cdolist_list_var) {
            if (sksi_sks_manager.NIL != sks_storage_modules_registered_p(sub)) {
                final SubLObject item_var = sub;
                if (sksi_sks_manager.NIL == conses_high.member(item_var, storage_modules_registered_subs, Symbols.symbol_function((SubLObject)sksi_sks_manager.EQL), Symbols.symbol_function((SubLObject)sksi_sks_manager.IDENTITY))) {
                    storage_modules_registered_subs = (SubLObject)ConsesLow.cons(item_var, storage_modules_registered_subs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub = cdolist_list_var.first();
        }
        return storage_modules_registered_subs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 16120L)
    public static SubLObject any_sub_ks_storage_modules_registeredP(final SubLObject sks) {
        final SubLObject sub_skses = sks_get_sub_skses(sks);
        SubLObject storage_modules_registeredP = (SubLObject)sksi_sks_manager.NIL;
        if (sksi_sks_manager.NIL == storage_modules_registeredP) {
            SubLObject csome_list_var = sub_skses;
            SubLObject sub = (SubLObject)sksi_sks_manager.NIL;
            sub = csome_list_var.first();
            while (sksi_sks_manager.NIL == storage_modules_registeredP && sksi_sks_manager.NIL != csome_list_var) {
                if (sksi_sks_manager.NIL != sks_storage_modules_registered_p(sub)) {
                    storage_modules_registeredP = (SubLObject)sksi_sks_manager.T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            }
        }
        return storage_modules_registeredP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 16521L)
    public static SubLObject any_closure_sub_ks_storage_modules_registeredP(final SubLObject sks) {
        final SubLObject sub_skses = sksi_kb_accessors.sk_source_proper_sub_ks_closure_in_mapping_mt(sks);
        SubLObject storage_modules_registeredP = (SubLObject)sksi_sks_manager.NIL;
        if (sksi_sks_manager.NIL == storage_modules_registeredP) {
            SubLObject csome_list_var = sub_skses;
            SubLObject sub = (SubLObject)sksi_sks_manager.NIL;
            sub = csome_list_var.first();
            while (sksi_sks_manager.NIL == storage_modules_registeredP && sksi_sks_manager.NIL != csome_list_var) {
                if (sksi_sks_manager.NIL != sks_storage_modules_registered_p(sub)) {
                    storage_modules_registeredP = (SubLObject)sksi_sks_manager.T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            }
        }
        return storage_modules_registeredP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17063L)
    public static SubLObject sksi_expanded_knowledge_sources() {
        return sksi_sks_manager.$sksi_expanded_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17158L)
    public static SubLObject sks_expanded_p(final SubLObject sks) {
        return subl_promotions.memberP(sks, sksi_expanded_knowledge_sources(), Symbols.symbol_function((SubLObject)sksi_sks_manager.EQ), (SubLObject)sksi_sks_manager.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17258L)
    public static SubLObject sksi_expanded_knowledge_sources_add(final SubLObject sks) {
        if (sksi_sks_manager.NIL == sks_expanded_p(sks)) {
            sksi_sks_manager.$sksi_expanded_knowledge_sources$.setGlobalValue(list_utilities.sort_adjoin(sks, sksi_sks_manager.$sksi_expanded_knowledge_sources$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_manager.EQ), (SubLObject)sksi_sks_manager.$sym30$TERM___WITH_CONSTANT_BY_NAME, (SubLObject)sksi_sks_manager.IDENTITY));
        }
        return sksi_sks_manager.$sksi_expanded_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17546L)
    public static SubLObject sksi_expanded_knowledge_sources_remove(final SubLObject sks) {
        sksi_sks_manager.$sksi_expanded_knowledge_sources$.setGlobalValue(Sequences.remove(sks, sksi_sks_manager.$sksi_expanded_knowledge_sources$.getGlobalValue(), (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED));
        return sksi_sks_manager.$sksi_expanded_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17746L)
    public static SubLObject sksi_toggle_expansion(final SubLObject sks) {
        if (sksi_sks_manager.NIL != sks_expanded_p(sks)) {
            sksi_expanded_knowledge_sources_remove(sks);
        }
        else {
            sksi_expanded_knowledge_sources_add(sks);
        }
        return sksi_sks_manager.$sksi_expanded_knowledge_sources$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    public static SubLObject sksi_sks_manager_internal(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)sksi_sks_manager.$str40$Structured_Knowledge_Source_Manag;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((sksi_sks_manager.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)sksi_sks_manager.$str41$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (sksi_sks_manager.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
                html_utilities.html_markup((SubLObject)sksi_sks_manager.$str42$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == sksi_sks_manager.$kw43$UNINITIALIZED) ? ConsesLow.list(sksi_sks_manager.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)sksi_sks_manager.$kw44$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (sksi_sks_manager.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)sksi_sks_manager.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (sksi_sks_manager.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_sks_manager.$str47$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)sksi_sks_manager.$str48$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)sksi_sks_manager.$str49$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)sksi_sks_manager.$str50$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)sksi_sks_manager.$str51$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            if (sksi_sks_manager.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (sksi_sks_manager.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)sksi_sks_manager.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)sksi_sks_manager.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)sksi_sks_manager.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)sksi_sks_manager.$str52$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        if (sksi_sks_manager.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)sksi_sks_manager.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)sksi_sks_manager.$str53$sksi_sks_manager_input, (SubLObject)sksi_sks_manager.T, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            display_input_table_framework(sksi_infrastructure_utilities.gather_all_top_level_complete_knowledge_sources());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    public static SubLObject display_input_table_framework(final SubLObject sks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_sks_manager.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_sks_manager.TWO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_sks_manager.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
            if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                html_utilities.html_markup((SubLObject)sksi_sks_manager.$str54$_444444);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_sks_manager.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                        final SubLObject color_val = (SubLObject)sksi_sks_manager.$str55$_ffffff;
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (sksi_sks_manager.NIL != color_val) {
                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_val));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                            html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_check_sks_status_enabledP$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)sksi_sks_manager.ONE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                            final SubLObject color_val = (SubLObject)sksi_sks_manager.$str55$_ffffff;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (sksi_sks_manager.NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                                html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_sks_manager.THREE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        final SubLObject color_val = (SubLObject)sksi_sks_manager.$str55$_ffffff;
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (sksi_sks_manager.NIL != color_val) {
                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_val));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)sksi_sks_manager.$str58$REMOVAL);
                            html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.ONE_INTEGER);
                            html_utilities.html_princ((SubLObject)sksi_sks_manager.$str59$MODULES);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                            final SubLObject color_val = (SubLObject)sksi_sks_manager.$str55$_ffffff;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (sksi_sks_manager.NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                                html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)sksi_sks_manager.THREE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            final SubLObject color_val = (SubLObject)sksi_sks_manager.$str55$_ffffff;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (sksi_sks_manager.NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)sksi_sks_manager.$str60$STORAGE);
                                html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.ONE_INTEGER);
                                html_utilities.html_princ((SubLObject)sksi_sks_manager.$str59$MODULES);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_sks_manager.$str54$_444444);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                SubLObject cdolist_list_var = (SubLObject)((sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) ? sksi_sks_manager.$list62 : sksi_sks_manager.$list63);
                SubLObject heading = (SubLObject)sksi_sks_manager.NIL;
                heading = cdolist_list_var.first();
                while (sksi_sks_manager.NIL != cdolist_list_var) {
                    if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_check_sks_status_enabledP$.getDynamicValue(thread) || !sksi_sks_manager.$str61$Up_.equal(heading)) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            final SubLObject color_val2 = (SubLObject)sksi_sks_manager.$str55$_ffffff;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (sksi_sks_manager.NIL != color_val2) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val2));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                                html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ(heading);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    heading = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
            display_user_input_table(sks_list);
            display_sks_all_row();
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)sksi_sks_manager.UNPROVIDED);
        html_utilities.html_submit_input((SubLObject)sksi_sks_manager.$str64$Enter, (SubLObject)sksi_sks_manager.$str65$enter, (SubLObject)sksi_sks_manager.UNPROVIDED);
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    public static SubLObject display_user_input_table(final SubLObject sks_list) {
        if (sksi_sks_manager.NIL == sks_list) {
            return (SubLObject)sksi_sks_manager.NIL;
        }
        SubLObject bgcolor = (SubLObject)sksi_sks_manager.NIL;
        SubLObject color_toggle = (SubLObject)sksi_sks_manager.NIL;
        SubLObject list_var = (SubLObject)sksi_sks_manager.NIL;
        SubLObject sks = (SubLObject)sksi_sks_manager.NIL;
        SubLObject ignore_me = (SubLObject)sksi_sks_manager.NIL;
        list_var = sks_list;
        sks = list_var.first();
        for (ignore_me = (SubLObject)sksi_sks_manager.ZERO_INTEGER; sksi_sks_manager.NIL != list_var; list_var = list_var.rest(), sks = list_var.first(), ignore_me = Numbers.add((SubLObject)sksi_sks_manager.ONE_INTEGER, ignore_me)) {
            if (sksi_sks_manager.NIL != color_toggle) {
                color_toggle = (SubLObject)sksi_sks_manager.NIL;
            }
            else {
                color_toggle = (SubLObject)sksi_sks_manager.T;
            }
            bgcolor = (SubLObject)((sksi_sks_manager.NIL != color_toggle) ? sksi_sks_manager.$str66$_dddddd : sksi_sks_manager.$str67$_cccccc);
            final SubLObject expandedP = sks_expanded_p(sks);
            set_sks_table_row_parameters(sks, expandedP, bgcolor);
            if (sksi_sks_manager.NIL != expandedP) {
                final SubLObject sub_skses = sks_get_sub_skses(sks);
                display_user_input_table(sksi_infrastructure_utilities.sort_knowledge_sources(sub_skses));
            }
        }
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    public static SubLObject choose_image_for_row(final SubLObject expP, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_manager.NIL != expP) {
            return sksi_sks_manager.$url_contract_image$.getDynamicValue(thread);
        }
        if (sksi_sks_manager.NIL != sksi_sks_accessors.sks_complex_p(sks)) {
            return sksi_sks_manager.$url_expand_image$.getDynamicValue(thread);
        }
        return sksi_sks_manager.$url_blank_image$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    public static SubLObject set_sks_table_row_parameters(final SubLObject sks, final SubLObject expP, final SubLObject default_bgcolor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject removal_reg_state = sks_removal_modules_registration_state(sks);
        final SubLObject storage_reg_state = sks_storage_modules_registration_state(sks);
        final SubLObject img_url = choose_image_for_row(expP, sks);
        SubLObject removal_reg_string = (SubLObject)sksi_sks_manager.NIL;
        SubLObject storage_reg_string = (SubLObject)sksi_sks_manager.NIL;
        SubLObject removal_regP = (SubLObject)sksi_sks_manager.NIL;
        SubLObject storage_regP = (SubLObject)sksi_sks_manager.NIL;
        SubLObject bgcolor = (SubLObject)sksi_sks_manager.NIL;
        SubLObject accessibleP = (SubLObject)sksi_sks_manager.NIL;
        if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_check_sks_status_enabledP$.getDynamicValue(thread)) {
            SubLObject ignore_errors_tag = (SubLObject)sksi_sks_manager.NIL;
            try {
                thread.throwStack.push(sksi_sks_manager.$kw68$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_sks_manager.$sym69$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        accessibleP = (SubLObject)sksi_sks_manager.$str70$BROKEN_;
                        final SubLObject _prev_bind_0_$20 = sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.currentBinding(thread);
                        try {
                            sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$.bind((SubLObject)sksi_sks_manager.ONE_INTEGER, thread);
                            sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.bind((SubLObject)sksi_sks_manager.$float71$0_2, thread);
                            sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.bind((SubLObject)sksi_sks_manager.$float71$0_2, thread);
                            assert sksi_sks_manager.NIL != sksi_debugging.valid_sksi_error_handling_mode_p((SubLObject)sksi_sks_manager.$kw72$IGNORE) : sksi_sks_manager.$kw72$IGNORE;
                            final SubLObject _prev_bind_0_$21 = sksi_debugging.$sksi_error_handling_mode$.currentBinding(thread);
                            try {
                                sksi_debugging.$sksi_error_handling_mode$.bind((SubLObject)sksi_sks_manager.$kw72$IGNORE, thread);
                                if (sksi_sks_manager.NIL != sksi_infrastructure_utilities.sk_source_accessibleP(sks, (SubLObject)sksi_sks_manager.UNPROVIDED)) {
                                    accessibleP = (SubLObject)sksi_sks_manager.$str74$Up;
                                }
                                else {
                                    accessibleP = (SubLObject)sksi_sks_manager.$str75$Down;
                                }
                            }
                            finally {
                                sksi_debugging.$sksi_error_handling_mode$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        finally {
                            sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.rebind(_prev_bind_3, thread);
                            sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.rebind(_prev_bind_2, thread);
                            sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)sksi_sks_manager.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_sks_manager.$kw68$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        SubLObject pcase_var = removal_reg_state;
        if (pcase_var.eql((SubLObject)sksi_sks_manager.$kw76$PARTIAL)) {
            removal_reg_string = (SubLObject)sksi_sks_manager.$str77$Some_registered;
            removal_regP = (SubLObject)sksi_sks_manager.T;
            bgcolor = (SubLObject)sksi_sks_manager.$str78$_DDDDFF;
        }
        else if (pcase_var.eql((SubLObject)sksi_sks_manager.$kw79$REG)) {
            final SubLObject module_count = Sequences.length(sksi_removal_module_generation.sksi_modules_by_sks_find_modules_with_children(sks));
            final SubLObject reg_string = removal_reg_string = Sequences.cconcatenate((SubLObject)sksi_sks_manager.$str80$All_registered_br__span_style__fo, new SubLObject[] { format_nil.format_nil_a_no_copy(module_count), sksi_sks_manager.$str81$_modules___span_ });
            removal_regP = (SubLObject)sksi_sks_manager.T;
            bgcolor = (SubLObject)sksi_sks_manager.$str82$_AAAAFF;
        }
        else if (pcase_var.eql((SubLObject)sksi_sks_manager.$kw83$NOREG)) {
            removal_reg_string = (SubLObject)sksi_sks_manager.$str84$;
            removal_regP = (SubLObject)sksi_sks_manager.NIL;
            bgcolor = bgcolor;
        }
        pcase_var = storage_reg_state;
        if (pcase_var.eql((SubLObject)sksi_sks_manager.$kw76$PARTIAL)) {
            storage_reg_string = (SubLObject)sksi_sks_manager.$str77$Some_registered;
            storage_regP = (SubLObject)sksi_sks_manager.T;
            if (sksi_sks_manager.NIL == bgcolor) {
                bgcolor = (SubLObject)sksi_sks_manager.$str78$_DDDDFF;
            }
        }
        else if (pcase_var.eql((SubLObject)sksi_sks_manager.$kw79$REG)) {
            final SubLObject module_count = Sequences.length(sksi_hl_storage_module_generation.sksi_hl_storage_modules_by_sks_find_modules(sks));
            final SubLObject reg_string = storage_reg_string = (SubLObject)((module_count.isZero() && sksi_sks_manager.NIL != sks_get_sub_skses(sks)) ? sksi_sks_manager.$str85$All_registered : Sequences.cconcatenate((SubLObject)sksi_sks_manager.$str86$All_br__span_style__font_size_80_, new SubLObject[] { format_nil.format_nil_a_no_copy(module_count), sksi_sks_manager.$str81$_modules___span_ }));
            storage_regP = (SubLObject)sksi_sks_manager.T;
            if (sksi_sks_manager.NIL == bgcolor) {
                bgcolor = (SubLObject)sksi_sks_manager.$str82$_AAAAFF;
            }
        }
        else if (pcase_var.eql((SubLObject)sksi_sks_manager.$kw83$NOREG)) {
            storage_reg_string = (SubLObject)sksi_sks_manager.$str84$;
            storage_regP = (SubLObject)sksi_sks_manager.NIL;
        }
        if (sksi_sks_manager.NIL == bgcolor) {
            bgcolor = default_bgcolor;
        }
        display_sks_table_row(sks, img_url, removal_reg_string, removal_regP, storage_reg_string, storage_regP, bgcolor, accessibleP);
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    public static SubLObject display_sks_table_row(final SubLObject sks, final SubLObject img_url, final SubLObject removal_reg_string, final SubLObject removal_regP, final SubLObject storage_reg_string, final SubLObject storage_regP, SubLObject row_color, SubLObject accessibleP) {
        if (row_color == sksi_sks_manager.UNPROVIDED) {
            row_color = (SubLObject)sksi_sks_manager.$str84$;
        }
        if (accessibleP == sksi_sks_manager.UNPROVIDED) {
            accessibleP = (SubLObject)sksi_sks_manager.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name = (SubLObject)sksi_sks_manager.NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_manager.$sym87$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_sks_manager.$const88$EverythingPSC, thread);
            name = string_utilities.object_to_string(cb_utilities.cb_fort_identifier(sks));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        if (sksi_sks_manager.NIL != row_color) {
            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_markup(row_color);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                html_utilities.html_indent(Numbers.multiply((SubLObject)sksi_sks_manager.FOUR_INTEGER, sks_depth(sks, (SubLObject)sksi_sks_manager.UNPROVIDED)));
                html_utilities.html_image_input(Sequences.cconcatenate((SubLObject)sksi_sks_manager.$str89$expansion_, name), img_url, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
                html_utilities.html_indent((SubLObject)sksi_sks_manager.UNPROVIDED);
                cb_utilities.cb_form(sks, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_manager.$sym87$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(sksi_sks_manager.$const88$EverythingPSC, thread);
                final SubLObject protocol = sksi_access_path.get_sks_type(sks);
                final SubLObject subprotocol = sksi_access_path.get_sks_db_subprotocol(sks);
                if (sksi_sks_manager.NIL != kb_utilities.kbeq(protocol, sksi_sks_manager.$const90$Database_Physical)) {
                    html_utilities.html_princ((SubLObject)sksi_sks_manager.$str91$DB_);
                    if (subprotocol.equal((SubLObject)sksi_sks_manager.$str92$postgresql)) {
                        html_utilities.html_princ((SubLObject)sksi_sks_manager.$str93$psql);
                    }
                    else if (subprotocol.equal((SubLObject)sksi_sks_manager.$str94$poisedata)) {
                        html_utilities.html_princ((SubLObject)sksi_sks_manager.$str95$POISE);
                    }
                    else if (subprotocol.isString()) {
                        html_utilities.html_princ(string_utilities.string_first_n((SubLObject)sksi_sks_manager.NINE_INTEGER, subprotocol));
                    }
                }
                else if (sksi_sks_manager.NIL != kb_utilities.kbeq(protocol, sksi_sks_manager.$const96$RDFTripleStore_Physical)) {
                    html_utilities.html_princ((SubLObject)sksi_sks_manager.$str97$RDF);
                }
                else if (sksi_sks_manager.NIL != kb_utilities.kbeq(protocol, sksi_sks_manager.$const98$WebPage_AIS)) {
                    html_utilities.html_princ((SubLObject)sksi_sks_manager.$str99$HTTP);
                }
                else if (sksi_sks_manager.NIL != forts.fort_p(protocol)) {
                    html_utilities.html_princ(string_utilities.string_first_n((SubLObject)sksi_sks_manager.FIVE_INTEGER, kb_paths.fort_name(protocol)));
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_check_sks_status_enabledP$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                    html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_princ(accessibleP);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), removal_reg_string);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                final SubLObject checkbox_name = Sequences.cconcatenate((SubLObject)sksi_sks_manager.$str100$register_removal_, name);
                html_utilities.html_checkbox_input(checkbox_name, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                if (sksi_sks_manager.NIL != removal_regP) {
                    final SubLObject checkbox_name = Sequences.cconcatenate((SubLObject)sksi_sks_manager.$str101$deregister_removal_, name);
                    html_utilities.html_checkbox_input(checkbox_name, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
                }
                else {
                    final SubLObject color_val = (SubLObject)sksi_sks_manager.$str102$gray;
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (sksi_sks_manager.NIL != color_val) {
                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(color_val));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                    html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.THREE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                if (sksi_sks_manager.NIL == sksi_kb_accessors.modifiable_sk_source_in_any_mt_p(sks)) {
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_sks_manager.THREE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                        html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                else {
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), storage_reg_string);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                        final SubLObject checkbox_name = Sequences.cconcatenate((SubLObject)sksi_sks_manager.$str103$register_storage_, name);
                        html_utilities.html_checkbox_input(checkbox_name, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        if (sksi_sks_manager.NIL != storage_regP) {
                            final SubLObject checkbox_name = Sequences.cconcatenate((SubLObject)sksi_sks_manager.$str104$deregister_storage_, name);
                            html_utilities.html_checkbox_input(checkbox_name, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
                        }
                        else {
                            final SubLObject color_val = (SubLObject)sksi_sks_manager.$str102$gray;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (sksi_sks_manager.NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    public static SubLObject display_sks_all_row() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        html_utilities.html_markup((SubLObject)sksi_sks_manager.$str105$_eeeeee);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)sksi_sks_manager.$kw35$SKS_BLANK);
                final SubLObject align = (SubLObject)sksi_sks_manager.$kw106$TOP;
                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)sksi_sks_manager.$kw35$SKS_BLANK);
                final SubLObject border = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                if (sksi_sks_manager.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                }
                if (sksi_sks_manager.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                }
                if (sksi_sks_manager.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_utilities.html_indent((SubLObject)sksi_sks_manager.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)sksi_sks_manager.$str107$All);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_check_sks_status_enabledP$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_markup((SubLObject)sksi_sks_manager.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                html_utilities.html_princ((SubLObject)sksi_sks_manager.$str84$);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                html_utilities.html_checkbox_input((SubLObject)sksi_sks_manager.$str108$register_removal_all, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                html_utilities.html_checkbox_input((SubLObject)sksi_sks_manager.$str109$deregister_removal_all, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                    html_utilities.html_glyph((SubLObject)sksi_sks_manager.$kw56$NBSP, (SubLObject)sksi_sks_manager.THREE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                    html_utilities.html_princ((SubLObject)sksi_sks_manager.$str84$);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                    html_utilities.html_checkbox_input((SubLObject)sksi_sks_manager.$str110$register_storage_all, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)sksi_sks_manager.$kw57$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
                    html_utilities.html_checkbox_input((SubLObject)sksi_sks_manager.$str111$deregister_storage_all, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)sksi_sks_manager.UNPROVIDED);
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    public static SubLObject sks_source_by_input(final SubLObject input, final SubLObject prefix_string) {
        final SubLObject name = string_utilities.post_remove(string_utilities.post_remove(string_utilities.pre_remove(input.first(), prefix_string, (SubLObject)sksi_sks_manager.UNPROVIDED), (SubLObject)sksi_sks_manager.$str112$_x, (SubLObject)sksi_sks_manager.UNPROVIDED), (SubLObject)sksi_sks_manager.$str113$_y, (SubLObject)sksi_sks_manager.UNPROVIDED);
        return cb_utilities.cb_guess_fort(name, (SubLObject)sksi_sks_manager.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 17964L)
    public static SubLObject sksi_sks_manager_input(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expansion_inputs = (SubLObject)sksi_sks_manager.NIL;
        SubLObject register_removal_inputs = (SubLObject)sksi_sks_manager.NIL;
        SubLObject deregister_removal_inputs = (SubLObject)sksi_sks_manager.NIL;
        SubLObject register_removal_allP = (SubLObject)sksi_sks_manager.NIL;
        SubLObject deregister_removal_allP = (SubLObject)sksi_sks_manager.NIL;
        SubLObject registered_rm_count = (SubLObject)sksi_sks_manager.NIL;
        SubLObject registered_pm_count = (SubLObject)sksi_sks_manager.NIL;
        SubLObject deregistered_rm_count = (SubLObject)sksi_sks_manager.NIL;
        SubLObject deregistered_pm_count = (SubLObject)sksi_sks_manager.NIL;
        SubLObject register_storage_inputs = (SubLObject)sksi_sks_manager.NIL;
        SubLObject deregister_storage_inputs = (SubLObject)sksi_sks_manager.NIL;
        SubLObject register_storage_allP = (SubLObject)sksi_sks_manager.NIL;
        SubLObject deregister_storage_allP = (SubLObject)sksi_sks_manager.NIL;
        SubLObject registered_sm_count = (SubLObject)sksi_sks_manager.NIL;
        SubLObject deregistered_sm_count = (SubLObject)sksi_sks_manager.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject input = (SubLObject)sksi_sks_manager.NIL;
        input = cdolist_list_var.first();
        while (sksi_sks_manager.NIL != cdolist_list_var) {
            if (input.isList() && sksi_sks_manager.NIL != string_utilities.starts_with(input.first(), (SubLObject)sksi_sks_manager.$str89$expansion_)) {
                final SubLObject item_var = sks_source_by_input(input, (SubLObject)sksi_sks_manager.$str89$expansion_);
                if (sksi_sks_manager.NIL == conses_high.member(item_var, expansion_inputs, Symbols.symbol_function((SubLObject)sksi_sks_manager.EQL), Symbols.symbol_function((SubLObject)sksi_sks_manager.IDENTITY))) {
                    expansion_inputs = (SubLObject)ConsesLow.cons(item_var, expansion_inputs);
                }
            }
            if (input.isList() && conses_high.second(input).equal((SubLObject)sksi_sks_manager.$str114$on)) {
                if (sksi_sks_manager.NIL != string_utilities.starts_with(input.first(), (SubLObject)sksi_sks_manager.$str100$register_removal_)) {
                    final SubLObject name = string_utilities.pre_remove(input.first(), (SubLObject)sksi_sks_manager.$str100$register_removal_, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    if (name.equal((SubLObject)sksi_sks_manager.$str115$all)) {
                        register_removal_allP = (SubLObject)sksi_sks_manager.T;
                    }
                    else {
                        register_removal_inputs = (SubLObject)ConsesLow.cons(cb_utilities.cb_guess_fort(name, (SubLObject)sksi_sks_manager.UNPROVIDED), register_removal_inputs);
                    }
                }
                else if (sksi_sks_manager.NIL != string_utilities.starts_with(input.first(), (SubLObject)sksi_sks_manager.$str101$deregister_removal_)) {
                    final SubLObject name = string_utilities.pre_remove(input.first(), (SubLObject)sksi_sks_manager.$str101$deregister_removal_, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    if (name.equal((SubLObject)sksi_sks_manager.$str115$all)) {
                        deregister_removal_allP = (SubLObject)sksi_sks_manager.T;
                    }
                    else {
                        deregister_removal_inputs = (SubLObject)ConsesLow.cons(cb_utilities.cb_guess_fort(name, (SubLObject)sksi_sks_manager.UNPROVIDED), deregister_removal_inputs);
                    }
                }
                else if (sksi_sks_manager.NIL != string_utilities.starts_with(input.first(), (SubLObject)sksi_sks_manager.$str103$register_storage_)) {
                    final SubLObject name = string_utilities.pre_remove(input.first(), (SubLObject)sksi_sks_manager.$str103$register_storage_, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    if (name.equal((SubLObject)sksi_sks_manager.$str115$all)) {
                        register_storage_allP = (SubLObject)sksi_sks_manager.T;
                    }
                    else {
                        register_storage_inputs = (SubLObject)ConsesLow.cons(cb_utilities.cb_guess_fort(name, (SubLObject)sksi_sks_manager.UNPROVIDED), register_storage_inputs);
                    }
                }
                else if (sksi_sks_manager.NIL != string_utilities.starts_with(input.first(), (SubLObject)sksi_sks_manager.$str104$deregister_storage_)) {
                    final SubLObject name = string_utilities.pre_remove(input.first(), (SubLObject)sksi_sks_manager.$str104$deregister_storage_, (SubLObject)sksi_sks_manager.UNPROVIDED);
                    if (name.equal((SubLObject)sksi_sks_manager.$str115$all)) {
                        deregister_storage_allP = (SubLObject)sksi_sks_manager.T;
                    }
                    else {
                        deregister_storage_inputs = (SubLObject)ConsesLow.cons(cb_utilities.cb_guess_fort(name, (SubLObject)sksi_sks_manager.UNPROVIDED), deregister_storage_inputs);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            input = cdolist_list_var.first();
        }
        if (sksi_sks_manager.NIL == expansion_inputs) {
            if (sksi_sks_manager.NIL != deregister_removal_allP) {
                thread.resetMultipleValues();
                final SubLObject deregistered_rm_count_$45 = sksi_query_utilities.deregister_all_combined_sksi_removal_modules((SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject deregistered_pm_count_$46 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                deregistered_rm_count = deregistered_rm_count_$45;
                deregistered_pm_count = deregistered_pm_count_$46;
                clear_sksi_registered_knowledge_sources();
                clear_sksi_content_mts_with_registered_removal_module();
                clear_sksi_content_mts_with_registered_storage_module();
            }
            else {
                thread.resetMultipleValues();
                final SubLObject deregistered_rm_count_$46 = deregister_sksi_removal_modules_for_skses(deregister_removal_inputs);
                final SubLObject deregistered_pm_count_$47 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                deregistered_rm_count = deregistered_rm_count_$46;
                deregistered_pm_count = deregistered_pm_count_$47;
            }
            if (sksi_sks_manager.NIL != register_removal_allP) {
                final SubLObject all_complete_skses = sksi_infrastructure_utilities.gather_all_top_level_complete_knowledge_sources();
                final SubLObject unregistered_complete_skses = list_utilities.fast_set_difference(all_complete_skses, sksi_registered_knowledge_sources(), (SubLObject)sksi_sks_manager.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject registered_rm_count_$49 = register_sksi_removal_modules_for_skses(unregistered_complete_skses);
                final SubLObject registered_pm_count_$50 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                registered_rm_count = registered_rm_count_$49;
                registered_pm_count = registered_pm_count_$50;
            }
            else {
                thread.resetMultipleValues();
                final SubLObject registered_rm_count_$50 = register_sksi_removal_modules_for_skses(register_removal_inputs);
                final SubLObject registered_pm_count_$51 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                registered_rm_count = registered_rm_count_$50;
                registered_pm_count = registered_pm_count_$51;
            }
            if (sksi_sks_manager.NIL != deregister_storage_allP) {
                thread.resetMultipleValues();
                final SubLObject deregistered_sm_count_$53 = sksi_hl_storage_module_generation.deregister_all_sksi_hl_storage_modules();
                thread.resetMultipleValues();
                deregistered_sm_count = deregistered_sm_count_$53;
                clear_sksi_registered_knowledge_sources();
                clear_sksi_content_mts_with_registered_storage_module();
                clear_sksi_content_mts_with_registered_storage_module();
            }
            else {
                thread.resetMultipleValues();
                final SubLObject deregistered_sm_count_$54 = deregister_sksi_storage_modules_for_skses(deregister_storage_inputs);
                thread.resetMultipleValues();
                deregistered_sm_count = deregistered_sm_count_$54;
            }
            if (sksi_sks_manager.NIL != register_storage_allP) {
                final SubLObject all_complete_skses = sksi_infrastructure_utilities.gather_all_top_level_complete_knowledge_sources();
                final SubLObject unregistered_complete_skses = list_utilities.fast_set_difference(all_complete_skses, sksi_registered_knowledge_sources(), (SubLObject)sksi_sks_manager.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject registered_sm_count_$55 = register_sksi_storage_modules_for_skses(unregistered_complete_skses);
                thread.resetMultipleValues();
                registered_sm_count = registered_sm_count_$55;
            }
            else {
                thread.resetMultipleValues();
                final SubLObject registered_sm_count_$56 = register_sksi_storage_modules_for_skses(register_storage_inputs);
                thread.resetMultipleValues();
                registered_sm_count = registered_sm_count_$56;
            }
            if (sksi_sks_manager.NIL != registered_rm_count) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str116$_A_new_SKSI_removal_modules_have_, registered_rm_count);
            }
            html_utilities.html_newline((SubLObject)sksi_sks_manager.UNPROVIDED);
            if (sksi_sks_manager.NIL != registered_pm_count) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str117$_A_new_SKSI_preference_modules_ha, registered_pm_count);
            }
            html_utilities.html_newline((SubLObject)sksi_sks_manager.TWO_INTEGER);
            if (sksi_sks_manager.NIL != deregistered_rm_count) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str118$_A_SKSI_removal_modules_have_been, deregistered_rm_count);
            }
            html_utilities.html_newline((SubLObject)sksi_sks_manager.UNPROVIDED);
            if (sksi_sks_manager.NIL != deregistered_pm_count) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str119$_A_SKSI_preference_modules_have_b, deregistered_pm_count);
            }
            html_utilities.html_newline((SubLObject)sksi_sks_manager.TWO_INTEGER);
            if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                if (sksi_sks_manager.NIL != registered_sm_count) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str120$_A_new_SKSI_storage_modules_have_, registered_sm_count);
                }
                html_utilities.html_newline((SubLObject)sksi_sks_manager.UNPROVIDED);
                if (sksi_sks_manager.NIL != deregistered_sm_count) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str121$_A_SKSI_storage_modules_have_been, deregistered_sm_count);
                }
                html_utilities.html_newline((SubLObject)sksi_sks_manager.TWO_INTEGER);
            }
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str122$Currently__you_have__A_SKSI_remov, sksi_query_utilities.combined_sksi_removal_modules_count(), sksi_preference_module_generation.sksi_preference_modules_count());
            if (sksi_sks_manager.NIL != sksi_sks_manager.$sksi_sks_manager_storage_module_support_enabledP$.getDynamicValue(thread)) {
                html_utilities.html_newline((SubLObject)sksi_sks_manager.ONE_INTEGER);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str123$There_are_also__A_SKSI_HL_storage, sksi_hl_storage_module_generation.sksi_hl_storage_modules_count());
            }
            html_utilities.html_newline((SubLObject)sksi_sks_manager.THREE_INTEGER);
            cb_utilities.cb_link((SubLObject)sksi_sks_manager.$kw6$SKSI_SKS_MANAGER, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_newline((SubLObject)sksi_sks_manager.TWO_INTEGER);
        }
        else {
            sksi_toggle_expansion(expansion_inputs.first());
            sksi_sks_manager((SubLObject)sksi_sks_manager.UNPROVIDED);
        }
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 34537L)
    public static SubLObject register_sksi_removal_modules_for_skses(final SubLObject sks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject pm_count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = (SubLObject)sksi_sks_manager.NIL;
        sks = cdolist_list_var.first();
        while (sksi_sks_manager.NIL != cdolist_list_var) {
            sksi_removal_modules_registered_knowledge_sources_add(sks);
            thread.resetMultipleValues();
            final SubLObject sks_rm_count = sksi_query_utilities.register_combined_sksi_removal_modules_for_sks(sks, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject sks_pm_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            rm_count = Numbers.add(rm_count, sks_rm_count);
            pm_count = Numbers.add(pm_count, sks_pm_count);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        }
        rm_count = Numbers.add(rm_count, register_removal_parent_ks_conjunctive_rms_if_warranted(sks_list));
        return Values.values(rm_count, pm_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 35295L)
    public static SubLObject register_removal_parent_ks_conjunctive_rms_if_warranted(final SubLObject sks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject registered_parents = (SubLObject)sksi_sks_manager.NIL;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = (SubLObject)sksi_sks_manager.NIL;
        sks = cdolist_list_var.first();
        while (sksi_sks_manager.NIL != cdolist_list_var) {
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject parent = sksi_kb_accessors.immediate_genl_ks(sks);
                if (sksi_sks_manager.NIL != parent && sksi_sks_manager.NIL == subl_promotions.memberP(parent, registered_parents, Symbols.symbol_function((SubLObject)sksi_sks_manager.EQ), (SubLObject)sksi_sks_manager.UNPROVIDED)) {
                    final SubLObject siblings = sksi_kb_accessors.sk_source_proper_sub_ks_closure(parent);
                    if (sksi_sks_manager.NIL != list_utilities.every_in_list((SubLObject)sksi_sks_manager.$sym125$SK_SOURCE_REGISTERED_, siblings, (SubLObject)sksi_sks_manager.UNPROVIDED)) {
                        registered_parents = (SubLObject)ConsesLow.cons(parent, registered_parents);
                        count = Numbers.add(count, sksi_conjunctive_removal_module_generation.register_sksi_conjunctive_removal_module_for_just_sks(parent, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED));
                        sksi_infrastructure_utilities.add_to_external_sources_activated_in_image(parent, (SubLObject)sksi_sks_manager.NIL);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 35985L)
    public static SubLObject deregister_sksi_removal_modules_for_skses(final SubLObject sks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject pm_count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = (SubLObject)sksi_sks_manager.NIL;
        sks = cdolist_list_var.first();
        while (sksi_sks_manager.NIL != cdolist_list_var) {
            sksi_removal_modules_registered_knowledge_sources_remove(sks);
            thread.resetMultipleValues();
            final SubLObject sks_rm_count = sksi_query_utilities.deregister_combined_sksi_removal_modules_for_sks(sks, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
            final SubLObject sks_pm_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            rm_count = Numbers.add(rm_count, sks_rm_count);
            pm_count = Numbers.add(pm_count, sks_pm_count);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        }
        rm_count = Numbers.add(rm_count, deregister_removal_parent_ks_conjunctive_rms_if_warranted(sks_list));
        return Values.values(rm_count, pm_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 36500L)
    public static SubLObject deregister_removal_parent_ks_conjunctive_rms_if_warranted(final SubLObject sks_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject deregistered_parents = (SubLObject)sksi_sks_manager.NIL;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = (SubLObject)sksi_sks_manager.NIL;
        sks = cdolist_list_var.first();
        while (sksi_sks_manager.NIL != cdolist_list_var) {
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject parent = sksi_kb_accessors.immediate_genl_ks(sks);
                if (sksi_sks_manager.NIL != parent && sksi_sks_manager.NIL == subl_promotions.memberP(parent, deregistered_parents, Symbols.symbol_function((SubLObject)sksi_sks_manager.EQ), (SubLObject)sksi_sks_manager.UNPROVIDED)) {
                    deregistered_parents = (SubLObject)ConsesLow.cons(parent, deregistered_parents);
                    count = Numbers.add(count, sksi_conjunctive_removal_module_generation.deregister_sksi_conjunctive_removal_module_for_just_sks(parent, (SubLObject)sksi_sks_manager.UNPROVIDED));
                    sksi_infrastructure_utilities.remove_from_external_sources_activated_in_image(parent, (SubLObject)sksi_sks_manager.NIL);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 37091L)
    public static SubLObject sks_registration_state(final SubLObject sks) {
        return sks_removal_modules_registration_state(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 37250L)
    public static SubLObject sks_removal_modules_registration_state(final SubLObject sks) {
        if (sksi_sks_manager.NIL != sks_removal_modules_registered_p(sks)) {
            return (SubLObject)sksi_sks_manager.$kw79$REG;
        }
        if (sksi_sks_manager.NIL != sksi_sks_accessors.sks_atomic_p(sks)) {
            return (SubLObject)sksi_sks_manager.$kw83$NOREG;
        }
        if (sksi_sks_manager.NIL != any_closure_sub_ks_removal_modules_registeredP(sks)) {
            return (SubLObject)sksi_sks_manager.$kw76$PARTIAL;
        }
        return (SubLObject)sksi_sks_manager.$kw83$NOREG;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 37675L)
    public static SubLObject register_sksi_storage_modules_for_skses(final SubLObject sks_list) {
        SubLObject sm_count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = (SubLObject)sksi_sks_manager.NIL;
        sks = cdolist_list_var.first();
        while (sksi_sks_manager.NIL != cdolist_list_var) {
            sksi_storage_modules_registered_knowledge_sources_add(sks);
            final SubLObject sks_sm_count = sksi_hl_storage_module_generation.register_sksi_hl_storage_modules_for_sks(sks, (SubLObject)sksi_sks_manager.UNPROVIDED);
            sm_count = Numbers.add(sm_count, sks_sm_count);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        }
        return sm_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 38123L)
    public static SubLObject deregister_sksi_storage_modules_for_skses(final SubLObject sks_list) {
        SubLObject sm_count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = (SubLObject)sksi_sks_manager.NIL;
        sks = cdolist_list_var.first();
        while (sksi_sks_manager.NIL != cdolist_list_var) {
            sksi_storage_modules_registered_knowledge_sources_remove(sks);
            final SubLObject sks_sm_count = sksi_hl_storage_module_generation.deregister_sksi_hl_storage_modules_for_sks(sks, (SubLObject)sksi_sks_manager.UNPROVIDED, (SubLObject)sksi_sks_manager.UNPROVIDED);
            sm_count = Numbers.add(sm_count, sks_sm_count);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        }
        return sm_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 39271L)
    public static SubLObject sks_storage_modules_registration_state(final SubLObject sks) {
        if (sksi_sks_manager.NIL != sks_storage_modules_registered_p(sks)) {
            return (SubLObject)sksi_sks_manager.$kw79$REG;
        }
        if (sksi_sks_manager.NIL != sksi_sks_accessors.sks_atomic_p(sks)) {
            return (SubLObject)sksi_sks_manager.$kw83$NOREG;
        }
        if (sksi_sks_manager.NIL != any_closure_sub_ks_storage_modules_registeredP(sks)) {
            return (SubLObject)sksi_sks_manager.$kw76$PARTIAL;
        }
        return (SubLObject)sksi_sks_manager.$kw83$NOREG;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 40298L)
    public static SubLObject cb_sks_register(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_manager.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)sksi_sks_manager.$str128$registering_knowledge_sources_);
        }
        else {
            final SubLObject fort = cb_utilities.cb_guess_fort(args.first(), (SubLObject)sksi_sks_manager.UNPROVIDED);
            SubLObject registered_count = (SubLObject)sksi_sks_manager.NIL;
            if (sksi_sks_manager.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_sks_manager.NIL == sksi_kb_accessors.sk_source_p(fort)) {
                Errors.error((SubLObject)sksi_sks_manager.$str129$cb_sks_register_applied_to_non_kn);
            }
            registered_count = register_sksi_removal_modules_for_skses((SubLObject)ConsesLow.list(fort));
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str116$_A_new_SKSI_removal_modules_have_, registered_count);
        }
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 40298L)
    public static SubLObject cb_link_sksi_register(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)sksi_sks_manager.$kw4$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str131$cb_sks_register__A, cb_utilities.cb_fort_identifier(fort));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        if (sksi_sks_manager.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
            html_utilities.html_princ((SubLObject)sksi_sks_manager.$str132$_Register_KS_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 40298L)
    public static SubLObject cb_sks_deregister(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_manager.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)sksi_sks_manager.$str135$deregistering_knowledge_sources_);
        }
        else {
            final SubLObject fort = cb_utilities.cb_guess_fort(args.first(), (SubLObject)sksi_sks_manager.UNPROVIDED);
            SubLObject deregistered_count = (SubLObject)sksi_sks_manager.NIL;
            if (sksi_sks_manager.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_sks_manager.NIL == sksi_kb_accessors.sk_source_p(fort)) {
                Errors.error((SubLObject)sksi_sks_manager.$str136$cb_register_applied_to_non_knowle);
            }
            deregistered_count = deregister_sksi_removal_modules_for_skses((SubLObject)ConsesLow.list(fort));
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str118$_A_SKSI_removal_modules_have_been, deregistered_count);
        }
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 40298L)
    public static SubLObject cb_link_sksi_deregister(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)sksi_sks_manager.$kw4$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_manager.$str138$cb_sks_deregister__A, cb_utilities.cb_fort_identifier(fort));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        if (sksi_sks_manager.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_sks_manager.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_sks_manager.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)sksi_sks_manager.T, thread);
            html_utilities.html_princ((SubLObject)sksi_sks_manager.$str139$_Deregister_KS_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 41703L)
    public static SubLObject sks_registration_state_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_manager.NIL != list_utilities.doubletonP(v_object) && sksi_sks_manager.NIL != list_utilities.list_of_type_p((SubLObject)sksi_sks_manager.$sym142$SK_SOURCE_P, v_object.first()) && sksi_sks_manager.NIL != list_utilities.list_of_type_p((SubLObject)sksi_sks_manager.$sym142$SK_SOURCE_P, conses_high.second(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 42001L)
    public static SubLObject current_sks_registration_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject top_levels = current_top_level_and_straggler_registered_knowledge_sources();
        final SubLObject stragglers = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(top_levels, stragglers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 42209L)
    public static SubLObject current_top_level_and_straggler_registered_knowledge_sources() {
        final SubLObject top_levels = sksi_infrastructure_utilities.gather_all_top_level_complete_registered_knowledge_sources();
        final SubLObject proper_subs_of_top_levels = Mapping.mapcan((SubLObject)sksi_sks_manager.$sym143$SK_SOURCE_PROPER_SUB_KS_CLOSURE_IN_MAPPING_MT, top_levels, sksi_sks_manager.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject subs_of_top_levels = ConsesLow.append(top_levels, proper_subs_of_top_levels);
        final SubLObject stragglers = list_utilities.fast_set_difference(sksi_removal_modules_registered_knowledge_sources(), subs_of_top_levels, (SubLObject)sksi_sks_manager.UNPROVIDED);
        return Values.values(top_levels, stragglers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 42691L)
    public static SubLObject destructure_sks_registration_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_manager.$list144);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject top_levels_var = (SubLObject)sksi_sks_manager.NIL;
        SubLObject stragglers_var = (SubLObject)sksi_sks_manager.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_manager.$list144);
        top_levels_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_manager.$list144);
        stragglers_var = current.first();
        current = current.rest();
        if (sksi_sks_manager.NIL == current) {
            current = temp;
            SubLObject state = (SubLObject)sksi_sks_manager.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_manager.$list144);
            state = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_manager.$sym145$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(top_levels_var, stragglers_var), state, ConsesLow.append(body, (SubLObject)sksi_sks_manager.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_manager.$list144);
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 42879L)
    public static SubLObject execute_sks_registration_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_sks_manager.NIL != sks_registration_state_p(state) : state;
        SubLObject registered_rm_count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject registered_pm_count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject deregistered_rm_count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject deregistered_pm_count = (SubLObject)sksi_sks_manager.ZERO_INTEGER;
        SubLObject current;
        final SubLObject datum = current = current_sks_registration_state();
        SubLObject current_top_levels = (SubLObject)sksi_sks_manager.NIL;
        SubLObject current_stragglers = (SubLObject)sksi_sks_manager.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_manager.$list147);
        current_top_levels = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_manager.$list147);
        current_stragglers = current.first();
        current = current.rest();
        if (sksi_sks_manager.NIL == current) {
            SubLObject state_top_levels = (SubLObject)sksi_sks_manager.NIL;
            SubLObject state_stragglers = (SubLObject)sksi_sks_manager.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_sks_manager.$list148);
            state_top_levels = state.first();
            SubLObject current_$58 = state.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$58, state, (SubLObject)sksi_sks_manager.$list148);
            state_stragglers = current_$58.first();
            current_$58 = current_$58.rest();
            if (sksi_sks_manager.NIL == current_$58) {
                final SubLObject top_levels_to_register = list_utilities.fast_set_difference(state_top_levels, current_top_levels, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject top_levels_to_deregister = list_utilities.fast_set_difference(current_top_levels, state_top_levels, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject stragglers_to_register = list_utilities.fast_set_difference(state_stragglers, current_stragglers, (SubLObject)sksi_sks_manager.UNPROVIDED);
                final SubLObject stragglers_to_deregister = list_utilities.fast_set_difference(current_stragglers, state_stragglers, (SubLObject)sksi_sks_manager.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject deregistered_rm_count_$59 = deregister_sksi_removal_modules_for_skses(ConsesLow.append(stragglers_to_deregister, top_levels_to_deregister));
                final SubLObject deregistered_pm_count_$60 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                deregistered_rm_count = deregistered_rm_count_$59;
                deregistered_pm_count = deregistered_pm_count_$60;
                thread.resetMultipleValues();
                final SubLObject registered_rm_count_$61 = register_sksi_removal_modules_for_skses(ConsesLow.append(top_levels_to_register, stragglers_to_register));
                final SubLObject registered_pm_count_$62 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                registered_rm_count = registered_rm_count_$61;
                registered_pm_count = registered_pm_count_$62;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_sks_manager.$list148);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_manager.$list147);
        }
        return Values.values(registered_rm_count, registered_pm_count, deregistered_rm_count, deregistered_pm_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-sks-manager.lisp", position = 44397L)
    public static SubLObject clear_sks_registration_state() {
        return execute_sks_registration_state((SubLObject)sksi_sks_manager.$list149);
    }
    
    public static SubLObject declare_sksi_sks_manager_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_sks_manager", "SKSI-SKS-MANAGER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "cb_link_sksi_sks_manager", "CB-LINK-SKSI-SKS-MANAGER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_get_sub_skses", "SKS-GET-SUB-SKSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_depth", "SKS-DEPTH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "clear_sksi_registered_knowledge_sources", "CLEAR-SKSI-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_registered_knowledge_sources", "SKSI-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_removal_modules_registered_knowledge_sources", "SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "clear_sksi_removal_modules_registered_knowledge_sources", "CLEAR-SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_registered_p", "SKS-REGISTERED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_removal_modules_registered_p", "SKS-REMOVAL-MODULES-REGISTERED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_content_mts_with_registered_module", "SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_content_mts_with_registered_removal_module", "SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "clear_sksi_content_mts_with_registered_module", "CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "clear_sksi_content_mts_with_registered_removal_module", "CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "add_sksi_content_mts_with_registered_module_for_sks", "ADD-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE-FOR-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "add_sksi_content_mts_with_registered_removal_module_for_sks", "ADD-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE-FOR-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "remove_sksi_content_mts_with_registered_module_for_sks", "REMOVE-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE-FOR-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "remove_sksi_content_mts_with_registered_removal_module_for_sks", "REMOVE-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE-FOR-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_storage_modules_registered_knowledge_sources", "SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "clear_sksi_storage_modules_registered_knowledge_sources", "CLEAR-SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_storage_modules_registered_p", "SKS-STORAGE-MODULES-REGISTERED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_content_mts_with_registered_storage_module", "SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "clear_sksi_content_mts_with_registered_storage_module", "CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "add_sksi_content_mts_with_registered_storage_module_for_sks", "ADD-SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE-FOR-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "remove_sksi_content_mts_with_registered_storage_module_for_sks", "REMOVE-SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE-FOR-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_registered_knowledge_sources_add", "SKSI-REGISTERED-KNOWLEDGE-SOURCES-ADD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_removal_modules_registered_knowledge_sources_add", "SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES-ADD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_registered_knowledge_sources_remove_partial", "SKSI-REGISTERED-KNOWLEDGE-SOURCES-REMOVE-PARTIAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_removal_modules_registered_knowledge_sources_remove_partial", "SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES-REMOVE-PARTIAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_removal_modules_registered_knowledge_sources_remove", "SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "removal_modules_registered_sub_skses", "REMOVAL-MODULES-REGISTERED-SUB-SKSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "any_sub_ks_removal_modules_registeredP", "ANY-SUB-KS-REMOVAL-MODULES-REGISTERED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "any_closure_sub_ks_removal_modules_registeredP", "ANY-CLOSURE-SUB-KS-REMOVAL-MODULES-REGISTERED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_storage_modules_registered_knowledge_sources_add", "SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES-ADD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_storage_modules_registered_knowledge_sources_remove_partial", "SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES-REMOVE-PARTIAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_storage_modules_registered_knowledge_sources_remove", "SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "storage_modules_registered_sub_skses", "STORAGE-MODULES-REGISTERED-SUB-SKSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "any_sub_ks_storage_modules_registeredP", "ANY-SUB-KS-STORAGE-MODULES-REGISTERED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "any_closure_sub_ks_storage_modules_registeredP", "ANY-CLOSURE-SUB-KS-STORAGE-MODULES-REGISTERED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_expanded_knowledge_sources", "SKSI-EXPANDED-KNOWLEDGE-SOURCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_expanded_p", "SKS-EXPANDED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_expanded_knowledge_sources_add", "SKSI-EXPANDED-KNOWLEDGE-SOURCES-ADD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_expanded_knowledge_sources_remove", "SKSI-EXPANDED-KNOWLEDGE-SOURCES-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_toggle_expansion", "SKSI-TOGGLE-EXPANSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_sks_manager_internal", "SKSI-SKS-MANAGER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "display_input_table_framework", "DISPLAY-INPUT-TABLE-FRAMEWORK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "display_user_input_table", "DISPLAY-USER-INPUT-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "choose_image_for_row", "CHOOSE-IMAGE-FOR-ROW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "set_sks_table_row_parameters", "SET-SKS-TABLE-ROW-PARAMETERS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "display_sks_table_row", "DISPLAY-SKS-TABLE-ROW", 6, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "display_sks_all_row", "DISPLAY-SKS-ALL-ROW", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_source_by_input", "SKS-SOURCE-BY-INPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sksi_sks_manager_input", "SKSI-SKS-MANAGER-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "register_sksi_removal_modules_for_skses", "REGISTER-SKSI-REMOVAL-MODULES-FOR-SKSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "register_removal_parent_ks_conjunctive_rms_if_warranted", "REGISTER-REMOVAL-PARENT-KS-CONJUNCTIVE-RMS-IF-WARRANTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "deregister_sksi_removal_modules_for_skses", "DEREGISTER-SKSI-REMOVAL-MODULES-FOR-SKSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "deregister_removal_parent_ks_conjunctive_rms_if_warranted", "DEREGISTER-REMOVAL-PARENT-KS-CONJUNCTIVE-RMS-IF-WARRANTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_registration_state", "SKS-REGISTRATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_removal_modules_registration_state", "SKS-REMOVAL-MODULES-REGISTRATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "register_sksi_storage_modules_for_skses", "REGISTER-SKSI-STORAGE-MODULES-FOR-SKSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "deregister_sksi_storage_modules_for_skses", "DEREGISTER-SKSI-STORAGE-MODULES-FOR-SKSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_storage_modules_registration_state", "SKS-STORAGE-MODULES-REGISTRATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "cb_sks_register", "CB-SKS-REGISTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "cb_link_sksi_register", "CB-LINK-SKSI-REGISTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "cb_sks_deregister", "CB-SKS-DEREGISTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "cb_link_sksi_deregister", "CB-LINK-SKSI-DEREGISTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "sks_registration_state_p", "SKS-REGISTRATION-STATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "current_sks_registration_state", "CURRENT-SKS-REGISTRATION-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "current_top_level_and_straggler_registered_knowledge_sources", "CURRENT-TOP-LEVEL-AND-STRAGGLER-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "destructure_sks_registration_state", "DESTRUCTURE-SKS-REGISTRATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "execute_sks_registration_state", "EXECUTE-SKS-REGISTRATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager", "clear_sks_registration_state", "CLEAR-SKS-REGISTRATION-STATE", 0, 0, false);
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    public static SubLObject init_sksi_sks_manager_file() {
        sksi_sks_manager.$sksi_sks_manager_storage_module_support_enabledP$ = SubLFiles.defparameter("*SKSI-SKS-MANAGER-STORAGE-MODULE-SUPPORT-ENABLED?*", (SubLObject)sksi_sks_manager.NIL);
        sksi_sks_manager.$sksi_sks_manager_check_sks_status_enabledP$ = SubLFiles.defparameter("*SKSI-SKS-MANAGER-CHECK-SKS-STATUS-ENABLED?*", (SubLObject)sksi_sks_manager.NIL);
        sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$ = SubLFiles.deflexical("*SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES*", (SubLObject)((sksi_sks_manager.NIL != Symbols.boundp((SubLObject)sksi_sks_manager.$sym11$_SKSI_REMOVAL_MODULES_REGISTERED_KNOWLEDGE_SOURCES_)) ? sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$.getGlobalValue() : sksi_sks_manager.NIL));
        sksi_sks_manager.$sksi_content_mts_with_registered_removal_module$ = SubLFiles.deflexical("*SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE*", (SubLObject)((sksi_sks_manager.NIL != Symbols.boundp((SubLObject)sksi_sks_manager.$sym14$_SKSI_CONTENT_MTS_WITH_REGISTERED_REMOVAL_MODULE_)) ? sksi_sks_manager.$sksi_content_mts_with_registered_removal_module$.getGlobalValue() : sksi_sks_manager.NIL));
        sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$ = SubLFiles.deflexical("*SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES*", (SubLObject)((sksi_sks_manager.NIL != Symbols.boundp((SubLObject)sksi_sks_manager.$sym23$_SKSI_STORAGE_MODULES_REGISTERED_KNOWLEDGE_SOURCES_)) ? sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$.getGlobalValue() : sksi_sks_manager.NIL));
        sksi_sks_manager.$sksi_content_mts_with_registered_storage_module$ = SubLFiles.deflexical("*SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE*", (SubLObject)((sksi_sks_manager.NIL != Symbols.boundp((SubLObject)sksi_sks_manager.$sym24$_SKSI_CONTENT_MTS_WITH_REGISTERED_STORAGE_MODULE_)) ? sksi_sks_manager.$sksi_content_mts_with_registered_storage_module$.getGlobalValue() : sksi_sks_manager.NIL));
        sksi_sks_manager.$sksi_expanded_knowledge_sources$ = SubLFiles.deflexical("*SKSI-EXPANDED-KNOWLEDGE-SOURCES*", (SubLObject)((sksi_sks_manager.NIL != Symbols.boundp((SubLObject)sksi_sks_manager.$sym29$_SKSI_EXPANDED_KNOWLEDGE_SOURCES_)) ? sksi_sks_manager.$sksi_expanded_knowledge_sources$.getGlobalValue() : sksi_sks_manager.NIL));
        sksi_sks_manager.$url_expand_image$ = SubLFiles.defparameter("*URL-EXPAND-IMAGE*", (SubLObject)sksi_sks_manager.$str37$_cycdoc_img_cb_right_triangle_blu);
        sksi_sks_manager.$url_contract_image$ = SubLFiles.defparameter("*URL-CONTRACT-IMAGE*", (SubLObject)sksi_sks_manager.$str38$_cycdoc_img_cb_down_triangle_blue);
        sksi_sks_manager.$url_blank_image$ = SubLFiles.defparameter("*URL-BLANK-IMAGE*", (SubLObject)sksi_sks_manager.$str39$_cycdoc_img_cb_blank_gif);
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    public static SubLObject setup_sksi_sks_manager_file() {
        html_macros.note_cgi_handler_function((SubLObject)sksi_sks_manager.$sym1$SKSI_SKS_MANAGER, (SubLObject)sksi_sks_manager.$kw2$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)sksi_sks_manager.$kw6$SKSI_SKS_MANAGER, (SubLObject)sksi_sks_manager.$sym7$CB_LINK_SKSI_SKS_MANAGER, (SubLObject)sksi_sks_manager.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)sksi_sks_manager.$kw6$SKSI_SKS_MANAGER, (SubLObject)sksi_sks_manager.$str8$SKS_Manager, (SubLObject)sksi_sks_manager.$str9$SKSMan, (SubLObject)sksi_sks_manager.$str10$SKSI_SKS_Manager);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_manager.$sym11$_SKSI_REMOVAL_MODULES_REGISTERED_KNOWLEDGE_SOURCES_);
        access_macros.define_obsolete_register((SubLObject)sksi_sks_manager.$sym12$SKS_REGISTERED_P, (SubLObject)sksi_sks_manager.$list13);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_manager.$sym14$_SKSI_CONTENT_MTS_WITH_REGISTERED_REMOVAL_MODULE_);
        access_macros.define_obsolete_register((SubLObject)sksi_sks_manager.$sym15$SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE, (SubLObject)sksi_sks_manager.$list16);
        access_macros.define_obsolete_register((SubLObject)sksi_sks_manager.$sym17$CLEAR_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE, (SubLObject)sksi_sks_manager.$list18);
        access_macros.define_obsolete_register((SubLObject)sksi_sks_manager.$sym19$ADD_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE_FOR_SKS, (SubLObject)sksi_sks_manager.$list20);
        access_macros.define_obsolete_register((SubLObject)sksi_sks_manager.$sym21$REMOVE_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE_FOR_SKS, (SubLObject)sksi_sks_manager.$list22);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_manager.$sym23$_SKSI_STORAGE_MODULES_REGISTERED_KNOWLEDGE_SOURCES_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_manager.$sym24$_SKSI_CONTENT_MTS_WITH_REGISTERED_STORAGE_MODULE_);
        access_macros.define_obsolete_register((SubLObject)sksi_sks_manager.$sym25$SKSI_REGISTERED_KNOWLEDGE_SOURCES_ADD, (SubLObject)sksi_sks_manager.$list26);
        access_macros.define_obsolete_register((SubLObject)sksi_sks_manager.$sym27$SKSI_REGISTERED_KNOWLEDGE_SOURCES_REMOVE_PARTIAL, (SubLObject)sksi_sks_manager.$list28);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_manager.$sym29$_SKSI_EXPANDED_KNOWLEDGE_SOURCES_);
        Hashtables.sethash((SubLObject)sksi_sks_manager.$kw31$SKS_EXPAND, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)sksi_sks_manager.$str32$right_triangle_blue_gif, (SubLObject)sksi_sks_manager.NIL));
        Hashtables.sethash((SubLObject)sksi_sks_manager.$kw33$SKS_CONTRACT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)sksi_sks_manager.$str34$down_triangle_blue_gif, (SubLObject)sksi_sks_manager.NIL));
        Hashtables.sethash((SubLObject)sksi_sks_manager.$kw35$SKS_BLANK, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)sksi_sks_manager.$str36$blank_gif, (SubLObject)sksi_sks_manager.NIL));
        html_macros.note_cgi_handler_function((SubLObject)sksi_sks_manager.$sym124$SKSI_SKS_MANAGER_INPUT, (SubLObject)sksi_sks_manager.$kw2$HTML_HANDLER);
        access_macros.define_obsolete_register((SubLObject)sksi_sks_manager.$sym126$SKS_REGISTRATION_STATE, (SubLObject)sksi_sks_manager.$list127);
        html_macros.note_cgi_handler_function((SubLObject)sksi_sks_manager.$sym130$CB_SKS_REGISTER, (SubLObject)sksi_sks_manager.$kw2$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)sksi_sks_manager.$kw133$SKSI_REGISTER, (SubLObject)sksi_sks_manager.$sym134$CB_LINK_SKSI_REGISTER, (SubLObject)sksi_sks_manager.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)sksi_sks_manager.$sym137$CB_SKS_DEREGISTER, (SubLObject)sksi_sks_manager.$kw2$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)sksi_sks_manager.$kw140$SKSI_DEREGISTER, (SubLObject)sksi_sks_manager.$sym141$CB_LINK_SKSI_DEREGISTER, (SubLObject)sksi_sks_manager.ONE_INTEGER);
        return (SubLObject)sksi_sks_manager.NIL;
    }
    
    public void declareFunctions() {
        declare_sksi_sks_manager_file();
    }
    
    public void initializeVariables() {
        init_sksi_sks_manager_file();
    }
    
    public void runTopLevelForms() {
        setup_sksi_sks_manager_file();
    }
    
    static {
        me = (SubLFile)new sksi_sks_manager();
        sksi_sks_manager.$sksi_sks_manager_storage_module_support_enabledP$ = null;
        sksi_sks_manager.$sksi_sks_manager_check_sks_status_enabledP$ = null;
        sksi_sks_manager.$sksi_removal_modules_registered_knowledge_sources$ = null;
        sksi_sks_manager.$sksi_content_mts_with_registered_removal_module$ = null;
        sksi_sks_manager.$sksi_storage_modules_registered_knowledge_sources$ = null;
        sksi_sks_manager.$sksi_content_mts_with_registered_storage_module$ = null;
        sksi_sks_manager.$sksi_expanded_knowledge_sources$ = null;
        sksi_sks_manager.$url_expand_image$ = null;
        sksi_sks_manager.$url_contract_image$ = null;
        sksi_sks_manager.$url_blank_image$ = null;
        $str0$SKSI_Structured_Knowledge_Source_ = SubLObjectFactory.makeString("SKSI Structured Knowledge Source Manager");
        $sym1$SKSI_SKS_MANAGER = SubLObjectFactory.makeSymbol("SKSI-SKS-MANAGER");
        $kw2$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str3$_SKSI_SKS_Manager_ = SubLObjectFactory.makeString("[SKSI SKS Manager]");
        $kw4$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str5$sksi_sks_manager = SubLObjectFactory.makeString("sksi-sks-manager");
        $kw6$SKSI_SKS_MANAGER = SubLObjectFactory.makeKeyword("SKSI-SKS-MANAGER");
        $sym7$CB_LINK_SKSI_SKS_MANAGER = SubLObjectFactory.makeSymbol("CB-LINK-SKSI-SKS-MANAGER");
        $str8$SKS_Manager = SubLObjectFactory.makeString("SKS Manager");
        $str9$SKSMan = SubLObjectFactory.makeString("SKSMan");
        $str10$SKSI_SKS_Manager = SubLObjectFactory.makeString("SKSI SKS Manager");
        $sym11$_SKSI_REMOVAL_MODULES_REGISTERED_KNOWLEDGE_SOURCES_ = SubLObjectFactory.makeSymbol("*SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES*");
        $sym12$SKS_REGISTERED_P = SubLObjectFactory.makeSymbol("SKS-REGISTERED-P");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS-REMOVAL-MODULES-REGISTERED-P"));
        $sym14$_SKSI_CONTENT_MTS_WITH_REGISTERED_REMOVAL_MODULE_ = SubLObjectFactory.makeSymbol("*SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE*");
        $sym15$SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE = SubLObjectFactory.makeSymbol("SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE"));
        $sym17$CLEAR_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE = SubLObjectFactory.makeSymbol("CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE"));
        $sym19$ADD_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE_FOR_SKS = SubLObjectFactory.makeSymbol("ADD-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE-FOR-SKS");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE-FOR-SKS"));
        $sym21$REMOVE_SKSI_CONTENT_MTS_WITH_REGISTERED_MODULE_FOR_SKS = SubLObjectFactory.makeSymbol("REMOVE-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE-FOR-SKS");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE-FOR-SKS"));
        $sym23$_SKSI_STORAGE_MODULES_REGISTERED_KNOWLEDGE_SOURCES_ = SubLObjectFactory.makeSymbol("*SKSI-STORAGE-MODULES-REGISTERED-KNOWLEDGE-SOURCES*");
        $sym24$_SKSI_CONTENT_MTS_WITH_REGISTERED_STORAGE_MODULE_ = SubLObjectFactory.makeSymbol("*SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE*");
        $sym25$SKSI_REGISTERED_KNOWLEDGE_SOURCES_ADD = SubLObjectFactory.makeSymbol("SKSI-REGISTERED-KNOWLEDGE-SOURCES-ADD");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES-ADD"));
        $sym27$SKSI_REGISTERED_KNOWLEDGE_SOURCES_REMOVE_PARTIAL = SubLObjectFactory.makeSymbol("SKSI-REGISTERED-KNOWLEDGE-SOURCES-REMOVE-PARTIAL");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKSI-REMOVAL-MODULES-REGISTERED-KNOWLEDGE-SOURCES-REMOVE-PARTIAL"));
        $sym29$_SKSI_EXPANDED_KNOWLEDGE_SOURCES_ = SubLObjectFactory.makeSymbol("*SKSI-EXPANDED-KNOWLEDGE-SOURCES*");
        $sym30$TERM___WITH_CONSTANT_BY_NAME = SubLObjectFactory.makeSymbol("TERM-<-WITH-CONSTANT-BY-NAME");
        $kw31$SKS_EXPAND = SubLObjectFactory.makeKeyword("SKS-EXPAND");
        $str32$right_triangle_blue_gif = SubLObjectFactory.makeString("right-triangle-blue.gif");
        $kw33$SKS_CONTRACT = SubLObjectFactory.makeKeyword("SKS-CONTRACT");
        $str34$down_triangle_blue_gif = SubLObjectFactory.makeString("down-triangle-blue.gif");
        $kw35$SKS_BLANK = SubLObjectFactory.makeKeyword("SKS-BLANK");
        $str36$blank_gif = SubLObjectFactory.makeString("blank.gif");
        $str37$_cycdoc_img_cb_right_triangle_blu = SubLObjectFactory.makeString("/cycdoc/img/cb/right-triangle-blue.gif");
        $str38$_cycdoc_img_cb_down_triangle_blue = SubLObjectFactory.makeString("/cycdoc/img/cb/down-triangle-blue.gif");
        $str39$_cycdoc_img_cb_blank_gif = SubLObjectFactory.makeString("/cycdoc/img/cb/blank.gif");
        $str40$Structured_Knowledge_Source_Manag = SubLObjectFactory.makeString("Structured Knowledge Source Manager");
        $str41$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str42$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw43$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw44$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw45$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw46$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str47$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str48$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str49$button = SubLObjectFactory.makeString("button");
        $str50$reload = SubLObjectFactory.makeString("reload");
        $str51$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str52$post = SubLObjectFactory.makeString("post");
        $str53$sksi_sks_manager_input = SubLObjectFactory.makeString("sksi-sks-manager-input");
        $str54$_444444 = SubLObjectFactory.makeString("#444444");
        $str55$_ffffff = SubLObjectFactory.makeString("#ffffff");
        $kw56$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $kw57$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str58$REMOVAL = SubLObjectFactory.makeString("REMOVAL");
        $str59$MODULES = SubLObjectFactory.makeString("MODULES");
        $str60$STORAGE = SubLObjectFactory.makeString("STORAGE");
        $str61$Up_ = SubLObjectFactory.makeString("Up?");
        $list62 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Name"), SubLObjectFactory.makeString("Type"), SubLObjectFactory.makeString("Up?"), SubLObjectFactory.makeString("Status"), SubLObjectFactory.makeString("Register"), SubLObjectFactory.makeString("Dereg."), SubLObjectFactory.makeString(""), SubLObjectFactory.makeString("Status"), SubLObjectFactory.makeString("Register"), SubLObjectFactory.makeString("Dereg.") });
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Name"), (SubLObject)SubLObjectFactory.makeString("Type"), (SubLObject)SubLObjectFactory.makeString("Up?"), (SubLObject)SubLObjectFactory.makeString("Status"), (SubLObject)SubLObjectFactory.makeString("Register"), (SubLObject)SubLObjectFactory.makeString("Dereg."));
        $str64$Enter = SubLObjectFactory.makeString("Enter");
        $str65$enter = SubLObjectFactory.makeString("enter");
        $str66$_dddddd = SubLObjectFactory.makeString("#dddddd");
        $str67$_cccccc = SubLObjectFactory.makeString("#cccccc");
        $kw68$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym69$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str70$BROKEN_ = SubLObjectFactory.makeString("BROKEN!");
        $float71$0_2 = (SubLFloat)SubLObjectFactory.makeDouble(0.2);
        $kw72$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym73$VALID_SKSI_ERROR_HANDLING_MODE_P = SubLObjectFactory.makeSymbol("VALID-SKSI-ERROR-HANDLING-MODE-P");
        $str74$Up = SubLObjectFactory.makeString("Up");
        $str75$Down = SubLObjectFactory.makeString("Down");
        $kw76$PARTIAL = SubLObjectFactory.makeKeyword("PARTIAL");
        $str77$Some_registered = SubLObjectFactory.makeString("Some registered");
        $str78$_DDDDFF = SubLObjectFactory.makeString("#DDDDFF");
        $kw79$REG = SubLObjectFactory.makeKeyword("REG");
        $str80$All_registered_br__span_style__fo = SubLObjectFactory.makeString("All registered<br><span style='font-size:80%'>(");
        $str81$_modules___span_ = SubLObjectFactory.makeString(" modules)</span>");
        $str82$_AAAAFF = SubLObjectFactory.makeString("#AAAAFF");
        $kw83$NOREG = SubLObjectFactory.makeKeyword("NOREG");
        $str84$ = SubLObjectFactory.makeString("");
        $str85$All_registered = SubLObjectFactory.makeString("All registered");
        $str86$All_br__span_style__font_size_80_ = SubLObjectFactory.makeString("All<br><span style='font-size:80%'>(");
        $sym87$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const88$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str89$expansion_ = SubLObjectFactory.makeString("expansion-");
        $const90$Database_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Database-Physical"));
        $str91$DB_ = SubLObjectFactory.makeString("DB:");
        $str92$postgresql = SubLObjectFactory.makeString("postgresql");
        $str93$psql = SubLObjectFactory.makeString("psql");
        $str94$poisedata = SubLObjectFactory.makeString("poisedata");
        $str95$POISE = SubLObjectFactory.makeString("POISE");
        $const96$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTripleStore-Physical"));
        $str97$RDF = SubLObjectFactory.makeString("RDF");
        $const98$WebPage_AIS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebPage-AIS"));
        $str99$HTTP = SubLObjectFactory.makeString("HTTP");
        $str100$register_removal_ = SubLObjectFactory.makeString("register-removal-");
        $str101$deregister_removal_ = SubLObjectFactory.makeString("deregister-removal-");
        $str102$gray = SubLObjectFactory.makeString("gray");
        $str103$register_storage_ = SubLObjectFactory.makeString("register-storage-");
        $str104$deregister_storage_ = SubLObjectFactory.makeString("deregister-storage-");
        $str105$_eeeeee = SubLObjectFactory.makeString("#eeeeee");
        $kw106$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str107$All = SubLObjectFactory.makeString("All");
        $str108$register_removal_all = SubLObjectFactory.makeString("register-removal-all");
        $str109$deregister_removal_all = SubLObjectFactory.makeString("deregister-removal-all");
        $str110$register_storage_all = SubLObjectFactory.makeString("register-storage-all");
        $str111$deregister_storage_all = SubLObjectFactory.makeString("deregister-storage-all");
        $str112$_x = SubLObjectFactory.makeString(".x");
        $str113$_y = SubLObjectFactory.makeString(".y");
        $str114$on = SubLObjectFactory.makeString("on");
        $str115$all = SubLObjectFactory.makeString("all");
        $str116$_A_new_SKSI_removal_modules_have_ = SubLObjectFactory.makeString("~A new SKSI removal modules have been (re)registered with your Cyc image.");
        $str117$_A_new_SKSI_preference_modules_ha = SubLObjectFactory.makeString("~A new SKSI preference modules have been (re)registered with your Cyc image.");
        $str118$_A_SKSI_removal_modules_have_been = SubLObjectFactory.makeString("~A SKSI removal modules have been deregistered with your Cyc image.");
        $str119$_A_SKSI_preference_modules_have_b = SubLObjectFactory.makeString("~A SKSI preference modules have been deregistered with your Cyc image.");
        $str120$_A_new_SKSI_storage_modules_have_ = SubLObjectFactory.makeString("~A new SKSI storage modules have been (re)registered with your Cyc image.");
        $str121$_A_SKSI_storage_modules_have_been = SubLObjectFactory.makeString("~A SKSI storage modules have been deregistered with your Cyc image.");
        $str122$Currently__you_have__A_SKSI_remov = SubLObjectFactory.makeString("Currently, you have ~A SKSI removal modules and ~A SKSI preference modules registered with your image.");
        $str123$There_are_also__A_SKSI_HL_storage = SubLObjectFactory.makeString("There are also ~A SKSI HL storage modules registered.");
        $sym124$SKSI_SKS_MANAGER_INPUT = SubLObjectFactory.makeSymbol("SKSI-SKS-MANAGER-INPUT");
        $sym125$SK_SOURCE_REGISTERED_ = SubLObjectFactory.makeSymbol("SK-SOURCE-REGISTERED?");
        $sym126$SKS_REGISTRATION_STATE = SubLObjectFactory.makeSymbol("SKS-REGISTRATION-STATE");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS-REMOVAL-MODULES-REGISTRATION-STATE"));
        $str128$registering_knowledge_sources_ = SubLObjectFactory.makeString("registering knowledge sources.");
        $str129$cb_sks_register_applied_to_non_kn = SubLObjectFactory.makeString("cb-sks-register applied to non-knowledge-source");
        $sym130$CB_SKS_REGISTER = SubLObjectFactory.makeSymbol("CB-SKS-REGISTER");
        $str131$cb_sks_register__A = SubLObjectFactory.makeString("cb-sks-register&~A");
        $str132$_Register_KS_ = SubLObjectFactory.makeString("[Register KS]");
        $kw133$SKSI_REGISTER = SubLObjectFactory.makeKeyword("SKSI-REGISTER");
        $sym134$CB_LINK_SKSI_REGISTER = SubLObjectFactory.makeSymbol("CB-LINK-SKSI-REGISTER");
        $str135$deregistering_knowledge_sources_ = SubLObjectFactory.makeString("deregistering knowledge sources.");
        $str136$cb_register_applied_to_non_knowle = SubLObjectFactory.makeString("cb-register applied to non-knowledge-source");
        $sym137$CB_SKS_DEREGISTER = SubLObjectFactory.makeSymbol("CB-SKS-DEREGISTER");
        $str138$cb_sks_deregister__A = SubLObjectFactory.makeString("cb-sks-deregister&~A");
        $str139$_Deregister_KS_ = SubLObjectFactory.makeString("[Deregister KS]");
        $kw140$SKSI_DEREGISTER = SubLObjectFactory.makeKeyword("SKSI-DEREGISTER");
        $sym141$CB_LINK_SKSI_DEREGISTER = SubLObjectFactory.makeSymbol("CB-LINK-SKSI-DEREGISTER");
        $sym142$SK_SOURCE_P = SubLObjectFactory.makeSymbol("SK-SOURCE-P");
        $sym143$SK_SOURCE_PROPER_SUB_KS_CLOSURE_IN_MAPPING_MT = SubLObjectFactory.makeSymbol("SK-SOURCE-PROPER-SUB-KS-CLOSURE-IN-MAPPING-MT");
        $list144 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOP-LEVELS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("STRAGGLERS-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym145$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym146$SKS_REGISTRATION_STATE_P = SubLObjectFactory.makeSymbol("SKS-REGISTRATION-STATE-P");
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-TOP-LEVELS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-STRAGGLERS"));
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE-TOP-LEVELS"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-STRAGGLERS"));
        $list149 = ConsesLow.list((SubLObject)sksi_sks_manager.NIL, (SubLObject)sksi_sks_manager.NIL);
    }
}

/*

	Total time: 1142 ms
	
*/