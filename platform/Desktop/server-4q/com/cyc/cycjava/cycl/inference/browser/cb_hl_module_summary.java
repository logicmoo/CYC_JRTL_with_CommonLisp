package com.cyc.cycjava.cycl.inference.browser;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.inference.modules.forward_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_hl_module_summary extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary";
    public static final String myFingerPrint = "398afa84a386081b5c628092f397fc0f109d07178715b38427656b4102f062ef";
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 23001L)
    private static SubLSymbol $cb_gather_evaluatable_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 25536L)
    private static SubLSymbol $cb_gather_evaluatable_functions$;
    private static final SubLSymbol $kw0$CB_HL_MODULE_SUMMARY;
    private static final SubLString $str1$cb_hl_module_summary_html;
    private static final SubLString $str2$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str3$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw4$UNINITIALIZED;
    private static final SubLSymbol $kw5$CB_CYC;
    private static final SubLString $str6$HL_Module_Summary;
    private static final SubLSymbol $kw7$HL_MODULE_INDEX;
    private static final SubLString $str8$Index_to_all_HL_modules;
    private static final SubLSymbol $kw9$TRANSFORMATION_MODULES;
    private static final SubLString $str10$Transformation_Modules;
    private static final SubLString $str11$___S_total_;
    private static final SubLSymbol $kw12$GENERIC_REMOVAL_MODULES;
    private static final SubLString $str13$Generic_Removal_Modules;
    private static final SubLString $str14$_SpecificRemovalModules;
    private static final SubLString $str15$Specific_Removal_Modules;
    private static final SubLSymbol $kw16$GENERIC_PREFERENCE_MODULES;
    private static final SubLString $str17$Generic_Preference_Modules;
    private static final SubLString $str18$_SpecificPreferenceModules;
    private static final SubLString $str19$Specific_Preference_Modules;
    private static final SubLSymbol $kw20$CONJUNCTIVE_REMOVAL_MODULES;
    private static final SubLString $str21$Conjunctive_Removal_Modules;
    private static final SubLSymbol $kw22$REWRITE_MODULES;
    private static final SubLString $str23$Rewrite_Modules;
    private static final SubLSymbol $kw24$FORWARD_MODULES;
    private static final SubLString $str25$Forward_Modules;
    private static final SubLSymbol $kw26$HL_STORAGE_MODULES;
    private static final SubLString $str27$Storage_Modules;
    private static final SubLSymbol $kw28$EVALUATABLE_PREDICATES;
    private static final SubLString $str29$Evaluatable_Predicates;
    private static final SubLSymbol $kw30$EVALUATABLE_FUNCTIONS;
    private static final SubLString $str31$Evaluatable_Functions;
    private static final SubLString $str32$SpecificRemovalModules;
    private static final SubLString $str33$Specific_Removal_Modules__;
    private static final SubLSymbol $kw34$PREDICATE_SPECIFIC_REMOVAL_MODULES;
    private static final SubLString $str35$_literals;
    private static final SubLString $str36$SpecificPreferenceModules;
    private static final SubLString $str37$Specific_Preference_Modules__;
    private static final SubLSymbol $kw38$PREDICATE_SPECIFIC_PREFERENCE_MODULES;
    private static final SubLSymbol $sym39$CB_HL_MODULE_SUMMARY;
    private static final SubLSymbol $kw40$HTML_HANDLER;
    private static final SubLSymbol $kw41$SELF;
    private static final SubLString $str42$cb_hl_module_summary;
    private static final SubLSymbol $sym43$CB_LINK_HL_MODULE_INDEX;
    private static final SubLSymbol $kw44$HL_MODULE_SUMMARY;
    private static final SubLSymbol $kw45$TEXT;
    private static final SubLList $list46;
    private static final SubLSymbol $kw47$MAIN;
    private static final SubLSymbol $sym48$CB_TRANSFORMATION_MODULES;
    private static final SubLString $str49$cb_transformation_modules;
    private static final SubLSymbol $sym50$CB_LINK_TRANSFORMATION_MODULES;
    private static final SubLSymbol $sym51$TERM__;
    private static final SubLSymbol $sym52$HL_MODULE_NAME;
    private static final SubLSymbol $sym53$CB_GENERIC_REMOVAL_MODULES;
    private static final SubLString $str54$cb_generic_removal_modules;
    private static final SubLSymbol $sym55$CB_LINK_GENERIC_REMOVAL_MODULES;
    private static final SubLSymbol $sym56$CB_GENERIC_PREFERENCE_MODULES;
    private static final SubLString $str57$cb_generic_preference_modules;
    private static final SubLSymbol $sym58$CB_LINK_GENERIC_PREFERENCE_MODULES;
    private static final SubLSymbol $sym59$PREFERENCE_MODULE_NAME;
    private static final SubLSymbol $sym60$CB_CONJUNCTIVE_REMOVAL_MODULES;
    private static final SubLString $str61$cb_conjunctive_removal_modules;
    private static final SubLSymbol $sym62$CB_LINK_CONJUNCTIVE_REMOVAL_MODULES;
    private static final SubLList $list63;
    private static final SubLString $str64$_S_did_not_specify_a_predicate_;
    private static final SubLSymbol $sym65$CB_PREDICATE_SPECIFIC_REMOVAL_MODULES;
    private static final SubLSymbol $sym66$FORT_P;
    private static final SubLString $str67$Predicate_Specific_Removal_Module;
    private static final SubLString $str68$cb_predicate_specific_removal_mod;
    private static final SubLSymbol $sym69$CB_LINK_PREDICATE_SPECIFIC_REMOVAL_MODULES;
    private static final SubLString $str70$_removal_modules;
    private static final SubLString $str71$The_following_generic_modules_are;
    private static final SubLString $str72$_literals__;
    private static final SubLString $str73$__;
    private static final SubLSymbol $sym74$CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES;
    private static final SubLString $str75$Predicate_Specific_Preference_Mod;
    private static final SubLString $str76$cb_predicate_specific_preference_;
    private static final SubLSymbol $sym77$CB_LINK_PREDICATE_SPECIFIC_PREFERENCE_MODULES;
    private static final SubLString $str78$Predicate_Specific_Storage_Module;
    private static final SubLString $str79$_preference_modules;
    private static final SubLSymbol $sym80$CB_REWRITE_MODULES;
    private static final SubLString $str81$cb_rewrite_modules;
    private static final SubLSymbol $sym82$CB_LINK_REWRITE_MODULES;
    private static final SubLSymbol $sym83$CB_FORWARD_MODULES;
    private static final SubLString $str84$cb_forward_modules;
    private static final SubLSymbol $sym85$CB_LINK_FORWARD_MODULES;
    private static final SubLSymbol $kw86$GENERIC_HL_STORAGE_MODULES;
    private static final SubLString $str87$Generic_Storage_Modules;
    private static final SubLString $str88$Predicate_Specific_Storage_Module;
    private static final SubLSymbol $kw89$PREDICATE_SPECIFIC_HL_STORAGE_MODULES;
    private static final SubLString $str90$_modules;
    private static final SubLSymbol $sym91$CB_HL_STORAGE_MODULES;
    private static final SubLString $str92$cb_hl_storage_modules;
    private static final SubLSymbol $sym93$CB_LINK_HL_STORAGE_MODULES;
    private static final SubLSymbol $sym94$CB_GENERIC_HL_STORAGE_MODULES;
    private static final SubLString $str95$cb_generic_hl_storage_modules;
    private static final SubLSymbol $sym96$CB_LINK_GENERIC_HL_STORAGE_MODULES;
    private static final SubLSymbol $sym97$CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES;
    private static final SubLString $str98$Predicate_Specific_Hl_Storage_Mod;
    private static final SubLString $str99$cb_predicate_specific_hl_storage_;
    private static final SubLSymbol $sym100$CB_LINK_PREDICATE_SPECIFIC_HL_STORAGE_MODULES;
    private static final SubLString $str101$_storage_modules;
    private static final SubLString $str102$module_;
    private static final SubLSymbol $kw103$HL_MODULE;
    private static final SubLString $str104$;
    private static final SubLString $str105$documentation__;
    private static final SubLString $str106$no_documentation;
    private static final SubLString $str107$example__;
    private static final SubLString $str108$no_example;
    private static final SubLSymbol $kw109$ALL;
    private static final SubLString $str110$Module_supplants__;
    private static final SubLString $str111$_all_other_modules;
    private static final SubLString $str112$unknown_supplants_type____S;
    private static final SubLList $list113;
    private static final SubLString $str114$The_inference_module__A_is_no_lon;
    private static final SubLSymbol $sym115$CB_HL_MODULE;
    private static final SubLSymbol $sym116$HL_MODULE_P;
    private static final SubLString $str117$cb_hl_module__A;
    private static final SubLSymbol $sym118$CB_LINK_HL_MODULE;
    private static final SubLSymbol $sym119$CB_FORM_HL_MODULE_METHOD;
    private static final SubLString $str120$HL_Module__A;
    private static final SubLString $str121$HL_Module;
    private static final SubLSymbol $kw122$LEFT;
    private static final SubLSymbol $kw123$TOP;
    private static final SubLString $str124$Property;
    private static final SubLString $str125$Value;
    private static final SubLSymbol $sym126$CB_EVALUATABLE_PREDICATES;
    private static final SubLString $str127$cb_evaluatable_predicates;
    private static final SubLSymbol $sym128$CB_LINK_EVALUATABLE_PREDICATES;
    private static final SubLString $str129$predicate_;
    private static final SubLList $list130;
    private static final SubLObject $const131$EverythingPSC;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$CB_EVALUATABLE_FUNCTIONS;
    private static final SubLString $str134$cb_evaluatable_functions;
    private static final SubLSymbol $sym135$CB_LINK_EVALUATABLE_FUNCTIONS;
    private static final SubLString $str136$function_;
    private static final SubLString $str137$____;
    private static final SubLSymbol $sym138$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const139$Thing;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLString $str142$___;
    private static final SubLString $str143$_;
    private static final SubLString $str144$______;
    private static final SubLString $str145$_;
    private static final SubLString $str146$___;
    private static final SubLString $str147$example___;
    private static final SubLSymbol $kw148$EXAMPLE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 906L)
    public static SubLObject cb_hl_module_summary(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str6$HL_Module_Summary);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw7$HL_MODULE_INDEX, (SubLObject)cb_hl_module_summary.$str6$HL_Module_Summary, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_help_preamble((SubLObject)cb_hl_module_summary.$kw0$CB_HL_MODULE_SUMMARY, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str8$Index_to_all_HL_modules);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw9$TRANSFORMATION_MODULES, (SubLObject)cb_hl_module_summary.$str10$Transformation_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, inference_modules.transformation_module_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw12$GENERIC_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.$str13$Generic_Removal_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, inference_modules.generic_removal_module_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str14$_SpecificRemovalModules);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str15$Specific_Removal_Modules);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, cb_total_specific_removal_module_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw16$GENERIC_PREFERENCE_MODULES, (SubLObject)cb_hl_module_summary.$str17$Generic_Preference_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, preference_modules.generic_preference_module_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str18$_SpecificPreferenceModules);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str19$Specific_Preference_Modules);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, preference_modules.specific_preference_module_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw20$CONJUNCTIVE_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.$str21$Conjunctive_Removal_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, inference_modules.conjunctive_removal_module_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw22$REWRITE_MODULES, (SubLObject)cb_hl_module_summary.$str23$Rewrite_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, inference_modules.rewrite_module_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw24$FORWARD_MODULES, (SubLObject)cb_hl_module_summary.$str25$Forward_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, forward_modules.forward_module_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw26$HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.$str27$Storage_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, hl_storage_modules.hl_storage_module_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw28$EVALUATABLE_PREDICATES, (SubLObject)cb_hl_module_summary.$str29$Evaluatable_Predicates, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, cb_evaluatable_predicate_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw30$EVALUATABLE_FUNCTIONS, (SubLObject)cb_hl_module_summary.$str31$Evaluatable_Functions, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, cb_evaluatable_function_count());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str32$SpecificRemovalModules);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str33$Specific_Removal_Modules__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, cb_total_specific_removal_module_count());
                        SubLObject predicates = cb_specific_removal_module_predicates();
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                            SubLObject cdolist_list_var = predicates;
                            SubLObject predicate = (SubLObject)cb_hl_module_summary.NIL;
                            predicate = cdolist_list_var.first();
                            while (cb_hl_module_summary.NIL != cdolist_list_var) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                    final SubLObject predicate_reference = cb_utilities.cb_string_for_fort(predicate);
                                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw34$PREDICATE_SPECIFIC_REMOVAL_MODULES, predicate, predicate_reference, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str35$_literals);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                predicate = cdolist_list_var.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str36$SpecificPreferenceModules);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str37$Specific_Preference_Modules__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, preference_modules.specific_preference_module_count());
                        predicates = cb_all_specific_preference_module_predicates();
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                            SubLObject cdolist_list_var = predicates;
                            SubLObject predicate = (SubLObject)cb_hl_module_summary.NIL;
                            predicate = cdolist_list_var.first();
                            while (cb_hl_module_summary.NIL != cdolist_list_var) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                    final SubLObject predicate_reference = cb_utilities.cb_string_for_fort(predicate);
                                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw38$PREDICATE_SPECIFIC_PREFERENCE_MODULES, predicate, predicate_reference, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str35$_literals);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                predicate = cdolist_list_var.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 4302L)
    public static SubLObject cb_link_hl_module_index(SubLObject linktext, SubLObject target) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        if (target == cb_hl_module_summary.UNPROVIDED) {
            target = (SubLObject)cb_hl_module_summary.$kw41$SELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str6$HL_Module_Summary;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str42$cb_hl_module_summary);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 4676L)
    public static SubLObject cb_transformation_modules(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str10$Transformation_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw9$TRANSFORMATION_MODULES, (SubLObject)cb_hl_module_summary.$str10$Transformation_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_transformation_modules();
                    SubLObject hl_module = (SubLObject)cb_hl_module_summary.NIL;
                    hl_module = cdolist_list_var.first();
                    while (cb_hl_module_summary.NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$12, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 5149L)
    public static SubLObject cb_link_transformation_modules(SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str10$Transformation_Modules;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str49$cb_transformation_modules);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 5391L)
    public static SubLObject cb_all_transformation_modules() {
        SubLObject hl_modules = (SubLObject)cb_hl_module_summary.NIL;
        SubLObject cdolist_list_var = inference_modules.transformation_modules();
        SubLObject hl_module = (SubLObject)cb_hl_module_summary.NIL;
        hl_module = cdolist_list_var.first();
        while (cb_hl_module_summary.NIL != cdolist_list_var) {
            hl_modules = (SubLObject)ConsesLow.cons(hl_module, hl_modules);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        return Sort.sort(hl_modules, (SubLObject)cb_hl_module_summary.$sym51$TERM__, (SubLObject)cb_hl_module_summary.$sym52$HL_MODULE_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 5614L)
    public static SubLObject cb_generic_removal_modules(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str13$Generic_Removal_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw12$GENERIC_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.$str13$Generic_Removal_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_generic_removal_modules();
                    SubLObject hl_module = (SubLObject)cb_hl_module_summary.NIL;
                    hl_module = cdolist_list_var.first();
                    while (cb_hl_module_summary.NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$14, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 6094L)
    public static SubLObject cb_link_generic_removal_modules(SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str13$Generic_Removal_Modules;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str54$cb_generic_removal_modules);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 6339L)
    public static SubLObject cb_all_generic_removal_modules() {
        return Sort.sort(inference_modules.generic_removal_modules(), (SubLObject)cb_hl_module_summary.$sym51$TERM__, (SubLObject)cb_hl_module_summary.$sym52$HL_MODULE_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 6470L)
    public static SubLObject cb_generic_preference_modules(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str17$Generic_Preference_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw16$GENERIC_PREFERENCE_MODULES, (SubLObject)cb_hl_module_summary.$str17$Generic_Preference_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_generic_preference_modules();
                    SubLObject prefmod = (SubLObject)cb_hl_module_summary.NIL;
                    prefmod = cdolist_list_var.first();
                    while (cb_hl_module_summary.NIL != cdolist_list_var) {
                        preference_modules.cb_display_preference_module_info(prefmod);
                        cdolist_list_var = cdolist_list_var.rest();
                        prefmod = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$16, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 6978L)
    public static SubLObject cb_link_generic_preference_modules(SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str17$Generic_Preference_Modules;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str57$cb_generic_preference_modules);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 7232L)
    public static SubLObject cb_all_generic_preference_modules() {
        return Sort.sort(preference_modules.generic_preference_modules(), (SubLObject)cb_hl_module_summary.$sym51$TERM__, (SubLObject)cb_hl_module_summary.$sym59$PREFERENCE_MODULE_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 7377L)
    public static SubLObject cb_conjunctive_removal_modules(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str21$Conjunctive_Removal_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$18 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw20$CONJUNCTIVE_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.$str21$Conjunctive_Removal_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_conjunctive_removal_modules();
                    SubLObject hl_module = (SubLObject)cb_hl_module_summary.NIL;
                    hl_module = cdolist_list_var.first();
                    while (cb_hl_module_summary.NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$18, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 7889L)
    public static SubLObject cb_link_conjunctive_removal_modules(SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str21$Conjunctive_Removal_Modules;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str61$cb_conjunctive_removal_modules);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 8146L)
    public static SubLObject cb_all_conjunctive_removal_modules() {
        return Sort.sort(inference_modules.conjunctive_removal_modules(), (SubLObject)cb_hl_module_summary.$sym51$TERM__, (SubLObject)cb_hl_module_summary.$sym52$HL_MODULE_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 8285L)
    public static SubLObject cb_predicate_specific_removal_modules(final SubLObject args) {
        SubLObject fort_id = (SubLObject)cb_hl_module_summary.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_hl_module_summary.$list63);
        fort_id = args.first();
        final SubLObject current = args.rest();
        if (cb_hl_module_summary.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_hl_module_summary.$list63);
            return (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLObject predicate = cb_utilities.cb_guess_fort(fort_id, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL == forts.fort_p(predicate)) {
            return cb_utilities.cb_error((SubLObject)cb_hl_module_summary.$str64$_S_did_not_specify_a_predicate_, fort_id, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        return cb_predicate_specific_removal_modules_guts(predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 8688L)
    public static SubLObject cb_link_predicate_specific_removal_modules(final SubLObject predicate, SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_hl_module_summary.NIL != forts.fort_p(predicate) : predicate;
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str67$Predicate_Specific_Removal_Module;
        }
        final SubLObject id = cb_utilities.cb_fort_identifier(predicate);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str68$cb_predicate_specific_removal_mod, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 9076L)
    public static SubLObject cb_predicate_specific_removal_modules_guts(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_hl_module_summary.NIL != forts.fort_p(predicate) : predicate;
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str67$Predicate_Specific_Removal_Module);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw34$PREDICATE_SPECIFIC_REMOVAL_MODULES, predicate, predicate, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str70$_removal_modules);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject use_generic = cb_specific_use_generic(predicate);
                    if (cb_hl_module_summary.NIL != use_generic) {
                        cb_display_specific_use_generic(predicate, use_generic);
                    }
                    SubLObject cdolist_list_var = cb_specific_removal_modules(predicate);
                    SubLObject hl_module = (SubLObject)cb_hl_module_summary.NIL;
                    hl_module = cdolist_list_var.first();
                    while (cb_hl_module_summary.NIL != cdolist_list_var) {
                        if (cb_hl_module_summary.NIL == subl_promotions.memberP(hl_module, use_generic, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED)) {
                            cb_display_hl_module_info(hl_module);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$20, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 9755L)
    public static SubLObject cb_display_specific_use_generic(final SubLObject predicate, final SubLObject generic_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str71$The_following_generic_modules_are);
        cb_utilities.cb_form(predicate, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str72$_literals__);
        html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
        SubLObject cdolist_list_var = generic_modules;
        SubLObject generic_module = (SubLObject)cb_hl_module_summary.NIL;
        generic_module = cdolist_list_var.first();
        while (cb_hl_module_summary.NIL != cdolist_list_var) {
            if (!generic_module.eql(generic_modules.first())) {
                html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str73$__);
            }
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_hash, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(generic_module);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_princ(generic_module);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            generic_module = cdolist_list_var.first();
        }
        html_utilities.html_newline((SubLObject)cb_hl_module_summary.TWO_INTEGER);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 10225L)
    public static SubLObject cb_specific_removal_module_predicates() {
        return kb_utilities.sort_terms(inference_modules.predicates_with_specific_removal_modules(), (SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.T, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 10372L)
    public static SubLObject cb_specific_removal_modules(final SubLObject predicate) {
        return Sort.sort(inference_modules.removal_modules_specific(predicate), (SubLObject)cb_hl_module_summary.$sym51$TERM__, (SubLObject)cb_hl_module_summary.$sym52$HL_MODULE_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 10506L)
    public static SubLObject cb_specific_use_generic(final SubLObject predicate) {
        final SubLObject hl_modules = cb_specific_removal_modules(predicate);
        SubLObject generic = (SubLObject)cb_hl_module_summary.NIL;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject hl_module = (SubLObject)cb_hl_module_summary.NIL;
        hl_module = cdolist_list_var.first();
        while (cb_hl_module_summary.NIL != cdolist_list_var) {
            if (!predicate.eql(inference_modules.hl_module_predicate(hl_module))) {
                generic = (SubLObject)ConsesLow.cons(hl_module, generic);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        return Sequences.nreverse(generic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 10790L)
    public static SubLObject cb_total_specific_removal_module_count() {
        SubLObject total = (SubLObject)cb_hl_module_summary.ZERO_INTEGER;
        SubLObject cdolist_list_var = cb_specific_removal_module_predicates();
        SubLObject predicate = (SubLObject)cb_hl_module_summary.NIL;
        predicate = cdolist_list_var.first();
        while (cb_hl_module_summary.NIL != cdolist_list_var) {
            total = Numbers.add(total, cb_specific_removal_module_count(predicate));
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 11017L)
    public static SubLObject cb_specific_removal_module_count(final SubLObject predicate) {
        final SubLObject hl_modules = cb_specific_removal_modules(predicate);
        final SubLObject generic = cb_specific_use_generic(predicate);
        return Numbers.subtract(Sequences.length(hl_modules), Sequences.length(generic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 11246L)
    public static SubLObject cb_predicate_specific_preference_modules(final SubLObject args) {
        SubLObject fort_id = (SubLObject)cb_hl_module_summary.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_hl_module_summary.$list63);
        fort_id = args.first();
        final SubLObject current = args.rest();
        if (cb_hl_module_summary.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_hl_module_summary.$list63);
            return (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLObject predicate = cb_utilities.cb_guess_fort(fort_id, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL == forts.fort_p(predicate)) {
            return cb_utilities.cb_error((SubLObject)cb_hl_module_summary.$str64$_S_did_not_specify_a_predicate_, fort_id, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        return cb_predicate_specific_preference_modules_guts(predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 11664L)
    public static SubLObject cb_link_predicate_specific_preference_modules(final SubLObject predicate, SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_hl_module_summary.NIL != forts.fort_p(predicate) : predicate;
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str75$Predicate_Specific_Preference_Mod;
        }
        final SubLObject id = cb_utilities.cb_fort_identifier(predicate);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str76$cb_predicate_specific_preference_, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 12061L)
    public static SubLObject cb_predicate_specific_preference_modules_guts(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_hl_module_summary.NIL != forts.fort_p(predicate) : predicate;
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str78$Predicate_Specific_Storage_Module);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$22 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw38$PREDICATE_SPECIFIC_PREFERENCE_MODULES, predicate, predicate, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str79$_preference_modules);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject cdolist_list_var = preference_modules.specific_preference_modules_for_pred(predicate);
                    SubLObject prefmod = (SubLObject)cb_hl_module_summary.NIL;
                    prefmod = cdolist_list_var.first();
                    while (cb_hl_module_summary.NIL != cdolist_list_var) {
                        preference_modules.cb_display_preference_module_info(prefmod);
                        cdolist_list_var = cdolist_list_var.rest();
                        prefmod = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$22, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 12573L)
    public static SubLObject cb_all_specific_preference_module_predicates() {
        return kb_utilities.sort_terms(preference_modules.specific_preference_module_predicates(), (SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.T, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 12710L)
    public static SubLObject cb_rewrite_modules(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str23$Rewrite_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$24 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw22$REWRITE_MODULES, (SubLObject)cb_hl_module_summary.$str23$Rewrite_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_rewrite_modules();
                    SubLObject hl_module = (SubLObject)cb_hl_module_summary.NIL;
                    hl_module = cdolist_list_var.first();
                    while (cb_hl_module_summary.NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$24, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 13126L)
    public static SubLObject cb_link_rewrite_modules(SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str23$Rewrite_Modules;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str81$cb_rewrite_modules);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 13347L)
    public static SubLObject cb_all_rewrite_modules() {
        return Sort.sort(inference_modules.rewrite_modules(), (SubLObject)cb_hl_module_summary.$sym51$TERM__, (SubLObject)cb_hl_module_summary.$sym52$HL_MODULE_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 13462L)
    public static SubLObject cb_forward_modules(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str25$Forward_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw24$FORWARD_MODULES, (SubLObject)cb_hl_module_summary.$str25$Forward_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_forward_modules();
                    SubLObject hl_module = (SubLObject)cb_hl_module_summary.NIL;
                    hl_module = cdolist_list_var.first();
                    while (cb_hl_module_summary.NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$26, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 13878L)
    public static SubLObject cb_link_forward_modules(SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str25$Forward_Modules;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str84$cb_forward_modules);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 14099L)
    public static SubLObject cb_all_forward_modules() {
        return Sequences.nreverse(conses_high.copy_list(forward_modules.forward_modules()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 14206L)
    public static SubLObject cb_hl_storage_modules(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str27$Storage_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$28 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw26$HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.$str27$Storage_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw86$GENERIC_HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.$str87$Generic_Storage_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, hl_storage_modules.generic_hl_storage_module_count());
                    html_utilities.html_newline((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str88$Predicate_Specific_Storage_Module);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str11$___S_total_, cb_total_specific_hl_storage_module_count());
                    final SubLObject predicates = cb_specific_hl_storage_module_predicates();
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        SubLObject cdolist_list_var = predicates;
                        SubLObject predicate = (SubLObject)cb_hl_module_summary.NIL;
                        predicate = cdolist_list_var.first();
                        while (cb_hl_module_summary.NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                final SubLObject predicate_reference = cb_utilities.cb_string_for_fort(predicate);
                                cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw89$PREDICATE_SPECIFIC_HL_STORAGE_MODULES, predicate, predicate_reference, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str90$_modules);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            cdolist_list_var = cdolist_list_var.rest();
                            predicate = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$28, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 15237L)
    public static SubLObject cb_link_hl_storage_modules(SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str27$Storage_Modules;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str92$cb_hl_storage_modules);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 15464L)
    public static SubLObject cb_generic_hl_storage_modules(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str87$Generic_Storage_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$32 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw86$GENERIC_HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.$str87$Generic_Storage_Modules, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_generic_hl_storage_modules();
                    SubLObject hl_module = (SubLObject)cb_hl_module_summary.NIL;
                    hl_module = cdolist_list_var.first();
                    while (cb_hl_module_summary.NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$32, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 15962L)
    public static SubLObject cb_link_generic_hl_storage_modules(SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str87$Generic_Storage_Modules;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str95$cb_generic_hl_storage_modules);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 16213L)
    public static SubLObject cb_all_generic_hl_storage_modules() {
        return Sort.sort(hl_storage_modules.generic_hl_storage_modules(), (SubLObject)cb_hl_module_summary.$sym51$TERM__, (SubLObject)cb_hl_module_summary.$sym52$HL_MODULE_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 16350L)
    public static SubLObject cb_predicate_specific_hl_storage_modules(final SubLObject args) {
        SubLObject fort_id = (SubLObject)cb_hl_module_summary.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_hl_module_summary.$list63);
        fort_id = args.first();
        final SubLObject current = args.rest();
        if (cb_hl_module_summary.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_hl_module_summary.$list63);
            return (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLObject predicate = cb_utilities.cb_guess_fort(fort_id, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL == forts.fort_p(predicate)) {
            return cb_utilities.cb_error((SubLObject)cb_hl_module_summary.$str64$_S_did_not_specify_a_predicate_, fort_id, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        return cb_predicate_specific_hl_storage_modules_guts(predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 16768L)
    public static SubLObject cb_link_predicate_specific_hl_storage_modules(final SubLObject predicate, SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_hl_module_summary.NIL != forts.fort_p(predicate) : predicate;
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str98$Predicate_Specific_Hl_Storage_Mod;
        }
        final SubLObject id = cb_utilities.cb_fort_identifier(predicate);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str99$cb_predicate_specific_hl_storage_, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 17165L)
    public static SubLObject cb_predicate_specific_hl_storage_modules_guts(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_hl_module_summary.NIL != forts.fort_p(predicate) : predicate;
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str78$Predicate_Specific_Storage_Module);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$34 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw89$PREDICATE_SPECIFIC_HL_STORAGE_MODULES, predicate, predicate, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str101$_storage_modules);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject cdolist_list_var = cb_specific_hl_storage_modules(predicate);
                    SubLObject hl_module = (SubLObject)cb_hl_module_summary.NIL;
                    hl_module = cdolist_list_var.first();
                    while (cb_hl_module_summary.NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$34, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 17664L)
    public static SubLObject cb_specific_hl_storage_module_predicates() {
        return kb_utilities.sort_terms(hl_storage_modules.predicates_with_specific_hl_storage_modules(), (SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.T, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 17803L)
    public static SubLObject cb_specific_hl_storage_modules(final SubLObject predicate) {
        return Sort.sort(hl_storage_modules.hl_storage_modules_for_predicate(predicate), (SubLObject)cb_hl_module_summary.$sym51$TERM__, (SubLObject)cb_hl_module_summary.$sym52$HL_MODULE_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 17948L)
    public static SubLObject cb_total_specific_hl_storage_module_count() {
        SubLObject total = (SubLObject)cb_hl_module_summary.ZERO_INTEGER;
        SubLObject cdolist_list_var = cb_specific_hl_storage_module_predicates();
        SubLObject predicate = (SubLObject)cb_hl_module_summary.NIL;
        predicate = cdolist_list_var.first();
        while (cb_hl_module_summary.NIL != cdolist_list_var) {
            total = Numbers.add(total, cb_specific_hl_storage_module_count(predicate));
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 18184L)
    public static SubLObject cb_specific_hl_storage_module_count(final SubLObject predicate) {
        return Sequences.length(cb_specific_hl_storage_modules(predicate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 18310L)
    public static SubLObject cb_display_hl_module_info(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_target_definition(hl_module);
        final SubLObject documentation = inference_modules.hl_module_documentation_string(hl_module);
        final SubLObject example = inference_modules.hl_module_example_string(hl_module);
        final SubLObject exclusive = inference_modules.hl_module_exclusive_func(hl_module);
        final SubLObject supplants = inference_modules.hl_module_supplants_info(hl_module);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$html_indent_table_max$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_macros.$html_indent_table_max$.bind((SubLObject)cb_hl_module_summary.TWO_INTEGER, thread);
            SubLObject indent = (SubLObject)cb_hl_module_summary.ZERO_INTEGER;
            SubLObject span = Numbers.max((SubLObject)cb_hl_module_summary.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_indent_row_internal(indent);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (cb_hl_module_summary.NIL != span) {
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(span);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str102$module_);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw103$HL_MODULE, hl_module, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            if (!documentation.equal((SubLObject)cb_hl_module_summary.$str104$) || !example.equal((SubLObject)cb_hl_module_summary.$str104$)) {
                indent = (SubLObject)cb_hl_module_summary.ZERO_INTEGER;
                span = Numbers.max((SubLObject)cb_hl_module_summary.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (cb_hl_module_summary.NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str105$documentation__);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                indent = (SubLObject)cb_hl_module_summary.ONE_INTEGER;
                span = Numbers.max((SubLObject)cb_hl_module_summary.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (cb_hl_module_summary.NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        if (documentation.equal((SubLObject)cb_hl_module_summary.$str104$)) {
                            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str106$no_documentation);
                        }
                        else {
                            html_macros.verify_not_within_html_pre();
                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$42 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                html_utilities.html_princ_doc_string(documentation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            }
                            finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                indent = (SubLObject)cb_hl_module_summary.ZERO_INTEGER;
                span = Numbers.max((SubLObject)cb_hl_module_summary.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (cb_hl_module_summary.NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str107$example__);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                indent = (SubLObject)cb_hl_module_summary.ONE_INTEGER;
                span = Numbers.max((SubLObject)cb_hl_module_summary.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (cb_hl_module_summary.NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        if (example.equal((SubLObject)cb_hl_module_summary.$str104$)) {
                            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str108$no_example);
                        }
                        else {
                            html_macros.verify_not_within_html_pre();
                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$47 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                html_utilities.html_princ_doc_string(example, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            }
                            finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$47, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            else {
                indent = (SubLObject)cb_hl_module_summary.ZERO_INTEGER;
                span = Numbers.max((SubLObject)cb_hl_module_summary.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (cb_hl_module_summary.NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str106$no_documentation);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            if (cb_hl_module_summary.NIL != exclusive && supplants == cb_hl_module_summary.$kw109$ALL) {
                indent = (SubLObject)cb_hl_module_summary.ZERO_INTEGER;
                span = Numbers.max((SubLObject)cb_hl_module_summary.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (cb_hl_module_summary.NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str110$Module_supplants__);
                        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str111$_all_other_modules);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            else if (supplants != cb_hl_module_summary.$kw109$ALL) {
                if (supplants.isList()) {
                    indent = (SubLObject)cb_hl_module_summary.ZERO_INTEGER;
                    span = Numbers.max((SubLObject)cb_hl_module_summary.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        html_utilities.html_indent_row_internal(indent);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (cb_hl_module_summary.NIL != span) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            html_utilities.html_markup(span);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str110$Module_supplants__);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    indent = (SubLObject)cb_hl_module_summary.ONE_INTEGER;
                    span = Numbers.max((SubLObject)cb_hl_module_summary.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        html_utilities.html_indent_row_internal(indent);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (cb_hl_module_summary.NIL != span) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            html_utilities.html_markup(span);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                            SubLObject cdolist_list_var = supplants;
                            SubLObject supplanted = (SubLObject)cb_hl_module_summary.NIL;
                            supplanted = cdolist_list_var.first();
                            while (cb_hl_module_summary.NIL != cdolist_list_var) {
                                if (!supplanted.eql(supplants.first())) {
                                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str73$__);
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_hash, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                html_utilities.html_markup(supplanted);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                    html_utilities.html_princ(supplanted);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                supplanted = cdolist_list_var.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                }
                else {
                    Errors.error((SubLObject)cb_hl_module_summary.$str112$unknown_supplants_type____S, supplants);
                }
            }
            html_utilities.html_indent_table_internal((SubLObject)cb_hl_module_summary.TWO_INTEGER);
        }
        finally {
            html_macros.$html_indent_table_max$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 20050L)
    public static SubLObject cb_hl_module(final SubLObject args) {
        SubLObject hl_module_id = (SubLObject)cb_hl_module_summary.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_hl_module_summary.$list113);
        hl_module_id = args.first();
        final SubLObject current = args.rest();
        if (cb_hl_module_summary.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_hl_module_summary.$list113);
            return (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLObject hl_module = cb_parameters.cb_glob_lookup_by_string(hl_module_id);
        if (cb_hl_module_summary.NIL == inference_modules.hl_module_p(hl_module)) {
            return cb_utilities.cb_error((SubLObject)cb_hl_module_summary.$str114$The_inference_module__A_is_no_lon, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        return cb_hl_module_guts(hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 20413L)
    public static SubLObject cb_link_hl_module(final SubLObject hl_module, SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_hl_module_summary.NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = print_high.princ_to_string(inference_modules.hl_module_name(hl_module));
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_hl_module_summary.$str117$cb_hl_module__A, cb_parameters.cb_glob_id(hl_module));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 20729L)
    public static SubLObject cb_form_hl_module_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_hl_module_summary.UNPROVIDED) {
            depth = (SubLObject)cb_hl_module_summary.NIL;
        }
        if (wrap_axiomsP == cb_hl_module_summary.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_hl_module_summary.NIL;
        }
        cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw103$HL_MODULE, v_object, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 20876L)
    public static SubLObject cb_hl_module_id(final SubLObject hl_module) {
        return print_high.prin1_to_string(inference_modules.hl_module_name(hl_module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 20989L)
    public static SubLObject cb_guess_hl_module(final SubLObject string) {
        return inference_modules.find_hl_module_by_name(reader.read_from_string_ignoring_errors(string, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 21110L)
    public static SubLObject cb_hl_module_guts(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_hl_module_summary.NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        final SubLObject title = PrintLow.format((SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.$str120$HL_Module__A, hl_module);
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$57 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_hl_module_summary.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_princ_strong((SubLObject)cb_hl_module_summary.$str121$HL_Module);
                    html_utilities.html_indent((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw103$HL_MODULE, hl_module, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.ONE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_hl_module_summary.$kw122$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_hl_module_summary.$kw123$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                html_utilities.html_princ_strong((SubLObject)cb_hl_module_summary.$str124$Property);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_hl_module_summary.$kw122$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_hl_module_summary.$kw123$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                html_utilities.html_princ_strong((SubLObject)cb_hl_module_summary.$str125$Value);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        SubLObject cdolist_list_var = inference_modules.hl_module_properties();
                        SubLObject property = (SubLObject)cb_hl_module_summary.NIL;
                        property = cdolist_list_var.first();
                        while (cb_hl_module_summary.NIL != cdolist_list_var) {
                            if (cb_hl_module_summary.NIL != inference_modules.hl_module_property_not_defaultP(hl_module, property)) {
                                final SubLObject value = inference_modules.hl_module_property_without_values(hl_module, property);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_hl_module_summary.$kw122$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_hl_module_summary.$kw123$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                        cb_utilities.cb_form(property, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_hl_module_summary.$kw122$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_hl_module_summary.$kw123$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                                        cb_utilities.cb_form(value, (SubLObject)cb_hl_module_summary.ZERO_INTEGER, (SubLObject)cb_hl_module_summary.T);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            property = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$57, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 21985L)
    public static SubLObject cb_evaluatable_predicates(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str29$Evaluatable_Predicates);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$66 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw28$EVALUATABLE_PREDICATES, (SubLObject)cb_hl_module_summary.$str29$Evaluatable_Predicates, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject list_var = (SubLObject)cb_hl_module_summary.NIL;
                    SubLObject predicate = (SubLObject)cb_hl_module_summary.NIL;
                    SubLObject index = (SubLObject)cb_hl_module_summary.NIL;
                    list_var = cb_gather_evaluatable_predicates();
                    predicate = list_var.first();
                    for (index = (SubLObject)cb_hl_module_summary.ZERO_INTEGER; cb_hl_module_summary.NIL != list_var; list_var = list_var.rest(), predicate = list_var.first(), index = Numbers.add((SubLObject)cb_hl_module_summary.ONE_INTEGER, index)) {
                        if (!index.isZero()) {
                            html_utilities.html_newline((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                        }
                        cb_display_evaluatable_predicate(predicate);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$66, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 22531L)
    public static SubLObject cb_link_evaluatable_predicates(SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str29$Evaluatable_Predicates;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str127$cb_evaluatable_predicates);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 22773L)
    public static SubLObject cb_display_evaluatable_predicate(final SubLObject predicate) {
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str129$predicate_);
        cb_utilities.cb_form(predicate, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_relation_arg_signature(predicate);
        cb_display_evaluation_defn_example(predicate);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 23064L)
    public static SubLObject cb_gather_evaluatable_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == cb_hl_module_summary.$cb_gather_evaluatable_predicates$.getDynamicValue(thread)) {
            final SubLObject predicates = inference_kernel.new_cyc_query((SubLObject)cb_hl_module_summary.$list130, cb_hl_module_summary.$const131$EverythingPSC, (SubLObject)cb_hl_module_summary.$list132);
            cb_hl_module_summary.$cb_gather_evaluatable_predicates$.setDynamicValue(kb_utilities.sort_terms(predicates, (SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.T, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED), thread);
        }
        return cb_hl_module_summary.$cb_gather_evaluatable_predicates$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 24079L)
    public static SubLObject cb_evaluatable_predicate_count() {
        return Sequences.length(cb_gather_evaluatable_predicates());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 24183L)
    public static SubLObject cb_evaluatable_functions(SubLObject args) {
        if (args == cb_hl_module_summary.UNPROVIDED) {
            args = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_hl_module_summary.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_hl_module_summary.$str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_hl_module_summary.$kw4$UNINITIALIZED) ? ConsesLow.list(cb_hl_module_summary.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_hl_module_summary.$kw5$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str31$Evaluatable_Functions);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            final SubLObject _prev_bind_0_$68 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_hl_module_summary.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_hl_module_summary.$kw30$EVALUATABLE_FUNCTIONS, (SubLObject)cb_hl_module_summary.$str31$Evaluatable_Functions, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    SubLObject list_var = (SubLObject)cb_hl_module_summary.NIL;
                    SubLObject function = (SubLObject)cb_hl_module_summary.NIL;
                    SubLObject index = (SubLObject)cb_hl_module_summary.NIL;
                    list_var = cb_gather_evaluatable_functions();
                    function = list_var.first();
                    for (index = (SubLObject)cb_hl_module_summary.ZERO_INTEGER; cb_hl_module_summary.NIL != list_var; list_var = list_var.rest(), function = list_var.first(), index = Numbers.add((SubLObject)cb_hl_module_summary.ONE_INTEGER, index)) {
                        if (!index.isZero()) {
                            html_utilities.html_newline((SubLObject)cb_hl_module_summary.TWO_INTEGER);
                        }
                        cb_display_evaluatable_function(function);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$68, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_hl_module_summary.UNPROVIDED);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 24714L)
    public static SubLObject cb_link_evaluatable_functions(SubLObject linktext) {
        if (linktext == cb_hl_module_summary.UNPROVIDED) {
            linktext = (SubLObject)cb_hl_module_summary.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == linktext) {
            linktext = (SubLObject)cb_hl_module_summary.$str31$Evaluatable_Functions;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_hl_module_summary.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str134$cb_evaluatable_functions);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        if (cb_hl_module_summary.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_hl_module_summary.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 24953L)
    public static SubLObject cb_display_evaluatable_function(final SubLObject function) {
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str136$function_);
        cb_utilities.cb_form(function, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        cb_relation_arg_signature(function);
        cb_function_result_type(function);
        cb_display_evaluation_defn_example(function);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 25212L)
    public static SubLObject cb_function_result_type(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str137$____);
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_hl_module_summary.$sym138$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_hl_module_summary.$const131$EverythingPSC, thread);
            SubLObject result_isa = kb_accessors.result_isa(function, (SubLObject)cb_hl_module_summary.NIL);
            if (result_isa.isList()) {
                result_isa = result_isa.first();
            }
            if (cb_hl_module_summary.NIL == result_isa) {
                result_isa = cb_hl_module_summary.$const139$Thing;
            }
            cb_utilities.cb_form(result_isa, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 25598L)
    public static SubLObject cb_gather_evaluatable_functions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_hl_module_summary.NIL == cb_hl_module_summary.$cb_gather_evaluatable_functions$.getDynamicValue(thread)) {
            final SubLObject functions = inference_kernel.new_cyc_query((SubLObject)cb_hl_module_summary.$list140, cb_hl_module_summary.$const131$EverythingPSC, (SubLObject)cb_hl_module_summary.$list141);
            cb_hl_module_summary.$cb_gather_evaluatable_functions$.setDynamicValue(kb_utilities.sort_terms(functions, (SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.NIL, (SubLObject)cb_hl_module_summary.T, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED), thread);
        }
        return cb_hl_module_summary.$cb_gather_evaluatable_functions$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 26608L)
    public static SubLObject cb_evaluatable_function_count() {
        return Sequences.length(cb_gather_evaluatable_functions());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 26710L)
    public static SubLObject cb_relation_arg_signature(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str142$___);
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_hl_module_summary.$sym138$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_hl_module_summary.$const131$EverythingPSC, thread);
            final SubLObject argsisa = kb_accessors.args_isa(relation, (SubLObject)cb_hl_module_summary.NIL);
            if (cb_hl_module_summary.NIL != argsisa) {
                html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str143$_);
                cb_utilities.cb_form(argsisa.first(), (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str144$______);
                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            }
            else {
                final SubLObject v_arity = arity.arity(relation);
                if (v_arity.isInteger()) {
                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str143$_);
                    SubLObject index;
                    SubLObject arg;
                    SubLObject argn_isa;
                    for (index = (SubLObject)cb_hl_module_summary.NIL, index = (SubLObject)cb_hl_module_summary.ZERO_INTEGER; index.numL(v_arity); index = Numbers.add(index, (SubLObject)cb_hl_module_summary.ONE_INTEGER)) {
                        arg = Numbers.add(index, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
                        if (!arg.numE((SubLObject)cb_hl_module_summary.ONE_INTEGER)) {
                            html_utilities.html_indent((SubLObject)cb_hl_module_summary.UNPROVIDED);
                        }
                        argn_isa = kb_accessors.argn_isa(relation, arg, (SubLObject)cb_hl_module_summary.NIL);
                        if (argn_isa.isList()) {
                            argn_isa = argn_isa.first();
                        }
                        if (cb_hl_module_summary.NIL == argn_isa) {
                            argn_isa = cb_hl_module_summary.$const139$Thing;
                        }
                        cb_utilities.cb_form(argn_isa, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
                    }
                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str145$_);
                }
                else {
                    html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str146$___);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 27528L)
    public static SubLObject cb_display_evaluation_defn_example(final SubLObject relation) {
        final SubLObject defn = relation_evaluation.evaluation_defn(relation, (SubLObject)cb_hl_module_summary.NIL);
        if (defn.isSymbol() && cb_hl_module_summary.NIL != Symbols.fboundp(defn)) {
            final SubLObject example = evaluation_defn_example(defn);
            if (example.isString()) {
                html_utilities.html_newline((SubLObject)cb_hl_module_summary.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_hl_module_summary.$str147$example___);
                html_utilities.html_princ_doc_string(example, (SubLObject)cb_hl_module_summary.UNPROVIDED);
            }
        }
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 27871L)
    public static SubLObject evaluation_defn_example(final SubLObject defn) {
        return Symbols.get(defn, (SubLObject)cb_hl_module_summary.$kw148$EXAMPLE, (SubLObject)cb_hl_module_summary.NIL);
    }
    
    public static SubLObject declare_cb_hl_module_summary_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_hl_module_summary", "CB-HL-MODULE-SUMMARY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_hl_module_index", "CB-LINK-HL-MODULE-INDEX", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_transformation_modules", "CB-TRANSFORMATION-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_transformation_modules", "CB-LINK-TRANSFORMATION-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_all_transformation_modules", "CB-ALL-TRANSFORMATION-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_generic_removal_modules", "CB-GENERIC-REMOVAL-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_generic_removal_modules", "CB-LINK-GENERIC-REMOVAL-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_all_generic_removal_modules", "CB-ALL-GENERIC-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_generic_preference_modules", "CB-GENERIC-PREFERENCE-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_generic_preference_modules", "CB-LINK-GENERIC-PREFERENCE-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_all_generic_preference_modules", "CB-ALL-GENERIC-PREFERENCE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_conjunctive_removal_modules", "CB-CONJUNCTIVE-REMOVAL-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_conjunctive_removal_modules", "CB-LINK-CONJUNCTIVE-REMOVAL-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_all_conjunctive_removal_modules", "CB-ALL-CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_predicate_specific_removal_modules", "CB-PREDICATE-SPECIFIC-REMOVAL-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_predicate_specific_removal_modules", "CB-LINK-PREDICATE-SPECIFIC-REMOVAL-MODULES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_predicate_specific_removal_modules_guts", "CB-PREDICATE-SPECIFIC-REMOVAL-MODULES-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_display_specific_use_generic", "CB-DISPLAY-SPECIFIC-USE-GENERIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_specific_removal_module_predicates", "CB-SPECIFIC-REMOVAL-MODULE-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_specific_removal_modules", "CB-SPECIFIC-REMOVAL-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_specific_use_generic", "CB-SPECIFIC-USE-GENERIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_total_specific_removal_module_count", "CB-TOTAL-SPECIFIC-REMOVAL-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_specific_removal_module_count", "CB-SPECIFIC-REMOVAL-MODULE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_predicate_specific_preference_modules", "CB-PREDICATE-SPECIFIC-PREFERENCE-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_predicate_specific_preference_modules", "CB-LINK-PREDICATE-SPECIFIC-PREFERENCE-MODULES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_predicate_specific_preference_modules_guts", "CB-PREDICATE-SPECIFIC-PREFERENCE-MODULES-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_all_specific_preference_module_predicates", "CB-ALL-SPECIFIC-PREFERENCE-MODULE-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_rewrite_modules", "CB-REWRITE-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_rewrite_modules", "CB-LINK-REWRITE-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_all_rewrite_modules", "CB-ALL-REWRITE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_forward_modules", "CB-FORWARD-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_forward_modules", "CB-LINK-FORWARD-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_all_forward_modules", "CB-ALL-FORWARD-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_hl_storage_modules", "CB-HL-STORAGE-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_hl_storage_modules", "CB-LINK-HL-STORAGE-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_generic_hl_storage_modules", "CB-GENERIC-HL-STORAGE-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_generic_hl_storage_modules", "CB-LINK-GENERIC-HL-STORAGE-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_all_generic_hl_storage_modules", "CB-ALL-GENERIC-HL-STORAGE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_predicate_specific_hl_storage_modules", "CB-PREDICATE-SPECIFIC-HL-STORAGE-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_predicate_specific_hl_storage_modules", "CB-LINK-PREDICATE-SPECIFIC-HL-STORAGE-MODULES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_predicate_specific_hl_storage_modules_guts", "CB-PREDICATE-SPECIFIC-HL-STORAGE-MODULES-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_specific_hl_storage_module_predicates", "CB-SPECIFIC-HL-STORAGE-MODULE-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_specific_hl_storage_modules", "CB-SPECIFIC-HL-STORAGE-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_total_specific_hl_storage_module_count", "CB-TOTAL-SPECIFIC-HL-STORAGE-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_specific_hl_storage_module_count", "CB-SPECIFIC-HL-STORAGE-MODULE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_display_hl_module_info", "CB-DISPLAY-HL-MODULE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_hl_module", "CB-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_hl_module", "CB-LINK-HL-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_form_hl_module_method", "CB-FORM-HL-MODULE-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_hl_module_id", "CB-HL-MODULE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_guess_hl_module", "CB-GUESS-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_hl_module_guts", "CB-HL-MODULE-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_evaluatable_predicates", "CB-EVALUATABLE-PREDICATES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_evaluatable_predicates", "CB-LINK-EVALUATABLE-PREDICATES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_display_evaluatable_predicate", "CB-DISPLAY-EVALUATABLE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_gather_evaluatable_predicates", "CB-GATHER-EVALUATABLE-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_evaluatable_predicate_count", "CB-EVALUATABLE-PREDICATE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_evaluatable_functions", "CB-EVALUATABLE-FUNCTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_link_evaluatable_functions", "CB-LINK-EVALUATABLE-FUNCTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_display_evaluatable_function", "CB-DISPLAY-EVALUATABLE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_function_result_type", "CB-FUNCTION-RESULT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_gather_evaluatable_functions", "CB-GATHER-EVALUATABLE-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_evaluatable_function_count", "CB-EVALUATABLE-FUNCTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_relation_arg_signature", "CB-RELATION-ARG-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "cb_display_evaluation_defn_example", "CB-DISPLAY-EVALUATION-DEFN-EXAMPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary", "evaluation_defn_example", "EVALUATION-DEFN-EXAMPLE", 1, 0, false);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    public static SubLObject init_cb_hl_module_summary_file() {
        cb_hl_module_summary.$cb_gather_evaluatable_predicates$ = SubLFiles.defparameter("*CB-GATHER-EVALUATABLE-PREDICATES*", (SubLObject)cb_hl_module_summary.NIL);
        cb_hl_module_summary.$cb_gather_evaluatable_functions$ = SubLFiles.defparameter("*CB-GATHER-EVALUATABLE-FUNCTIONS*", (SubLObject)cb_hl_module_summary.NIL);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    public static SubLObject setup_cb_hl_module_summary_file() {
        Hashtables.sethash((SubLObject)cb_hl_module_summary.$kw0$CB_HL_MODULE_SUMMARY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_hl_module_summary.$str1$cb_hl_module_summary_html, (SubLObject)cb_hl_module_summary.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym39$CB_HL_MODULE_SUMMARY, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw7$HL_MODULE_INDEX, (SubLObject)cb_hl_module_summary.$sym43$CB_LINK_HL_MODULE_INDEX, (SubLObject)cb_hl_module_summary.TWO_INTEGER);
        cyc_navigator_internals.def_navigator_link((SubLObject)cb_hl_module_summary.$kw44$HL_MODULE_SUMMARY, (SubLObject)cb_hl_module_summary.$kw45$TEXT, (SubLObject)cb_hl_module_summary.$list46, (SubLObject)cb_hl_module_summary.$str42$cb_hl_module_summary, (SubLObject)cb_hl_module_summary.ZERO_INTEGER, (SubLObject)cb_hl_module_summary.$kw47$MAIN, (SubLObject)cb_hl_module_summary.$str6$HL_Module_Summary, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED, (SubLObject)cb_hl_module_summary.UNPROVIDED);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym48$CB_TRANSFORMATION_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw9$TRANSFORMATION_MODULES, (SubLObject)cb_hl_module_summary.$sym50$CB_LINK_TRANSFORMATION_MODULES, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym53$CB_GENERIC_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw12$GENERIC_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.$sym55$CB_LINK_GENERIC_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym56$CB_GENERIC_PREFERENCE_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw16$GENERIC_PREFERENCE_MODULES, (SubLObject)cb_hl_module_summary.$sym58$CB_LINK_GENERIC_PREFERENCE_MODULES, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym60$CB_CONJUNCTIVE_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw20$CONJUNCTIVE_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.$sym62$CB_LINK_CONJUNCTIVE_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym65$CB_PREDICATE_SPECIFIC_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw34$PREDICATE_SPECIFIC_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.$sym69$CB_LINK_PREDICATE_SPECIFIC_REMOVAL_MODULES, (SubLObject)cb_hl_module_summary.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym74$CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw38$PREDICATE_SPECIFIC_PREFERENCE_MODULES, (SubLObject)cb_hl_module_summary.$sym77$CB_LINK_PREDICATE_SPECIFIC_PREFERENCE_MODULES, (SubLObject)cb_hl_module_summary.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym80$CB_REWRITE_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw22$REWRITE_MODULES, (SubLObject)cb_hl_module_summary.$sym82$CB_LINK_REWRITE_MODULES, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym83$CB_FORWARD_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw24$FORWARD_MODULES, (SubLObject)cb_hl_module_summary.$sym85$CB_LINK_FORWARD_MODULES, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym91$CB_HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw26$HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.$sym93$CB_LINK_HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym94$CB_GENERIC_HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw86$GENERIC_HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.$sym96$CB_LINK_GENERIC_HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym97$CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw89$PREDICATE_SPECIFIC_HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.$sym100$CB_LINK_PREDICATE_SPECIFIC_HL_STORAGE_MODULES, (SubLObject)cb_hl_module_summary.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym115$CB_HL_MODULE, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw103$HL_MODULE, (SubLObject)cb_hl_module_summary.$sym118$CB_LINK_HL_MODULE, (SubLObject)cb_hl_module_summary.TWO_INTEGER);
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_hl_module_summary.$sym119$CB_FORM_HL_MODULE_METHOD));
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym126$CB_EVALUATABLE_PREDICATES, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw28$EVALUATABLE_PREDICATES, (SubLObject)cb_hl_module_summary.$sym128$CB_LINK_EVALUATABLE_PREDICATES, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_hl_module_summary.$sym133$CB_EVALUATABLE_FUNCTIONS, (SubLObject)cb_hl_module_summary.$kw40$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_hl_module_summary.$kw30$EVALUATABLE_FUNCTIONS, (SubLObject)cb_hl_module_summary.$sym135$CB_LINK_EVALUATABLE_FUNCTIONS, (SubLObject)cb_hl_module_summary.ONE_INTEGER);
        return (SubLObject)cb_hl_module_summary.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_hl_module_summary_file();
    }
    
    public void initializeVariables() {
        init_cb_hl_module_summary_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_hl_module_summary_file();
    }
    
    static {
        me = (SubLFile)new cb_hl_module_summary();
        cb_hl_module_summary.$cb_gather_evaluatable_predicates$ = null;
        cb_hl_module_summary.$cb_gather_evaluatable_functions$ = null;
        $kw0$CB_HL_MODULE_SUMMARY = SubLObjectFactory.makeKeyword("CB-HL-MODULE-SUMMARY");
        $str1$cb_hl_module_summary_html = SubLObjectFactory.makeString("cb-hl-module-summary.html");
        $str2$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str3$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw4$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw5$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str6$HL_Module_Summary = SubLObjectFactory.makeString("HL Module Summary");
        $kw7$HL_MODULE_INDEX = SubLObjectFactory.makeKeyword("HL-MODULE-INDEX");
        $str8$Index_to_all_HL_modules = SubLObjectFactory.makeString("Index to all HL modules");
        $kw9$TRANSFORMATION_MODULES = SubLObjectFactory.makeKeyword("TRANSFORMATION-MODULES");
        $str10$Transformation_Modules = SubLObjectFactory.makeString("Transformation Modules");
        $str11$___S_total_ = SubLObjectFactory.makeString(" (~S total)");
        $kw12$GENERIC_REMOVAL_MODULES = SubLObjectFactory.makeKeyword("GENERIC-REMOVAL-MODULES");
        $str13$Generic_Removal_Modules = SubLObjectFactory.makeString("Generic Removal Modules");
        $str14$_SpecificRemovalModules = SubLObjectFactory.makeString("#SpecificRemovalModules");
        $str15$Specific_Removal_Modules = SubLObjectFactory.makeString("Specific Removal Modules");
        $kw16$GENERIC_PREFERENCE_MODULES = SubLObjectFactory.makeKeyword("GENERIC-PREFERENCE-MODULES");
        $str17$Generic_Preference_Modules = SubLObjectFactory.makeString("Generic Preference Modules");
        $str18$_SpecificPreferenceModules = SubLObjectFactory.makeString("#SpecificPreferenceModules");
        $str19$Specific_Preference_Modules = SubLObjectFactory.makeString("Specific Preference Modules");
        $kw20$CONJUNCTIVE_REMOVAL_MODULES = SubLObjectFactory.makeKeyword("CONJUNCTIVE-REMOVAL-MODULES");
        $str21$Conjunctive_Removal_Modules = SubLObjectFactory.makeString("Conjunctive Removal Modules");
        $kw22$REWRITE_MODULES = SubLObjectFactory.makeKeyword("REWRITE-MODULES");
        $str23$Rewrite_Modules = SubLObjectFactory.makeString("Rewrite Modules");
        $kw24$FORWARD_MODULES = SubLObjectFactory.makeKeyword("FORWARD-MODULES");
        $str25$Forward_Modules = SubLObjectFactory.makeString("Forward Modules");
        $kw26$HL_STORAGE_MODULES = SubLObjectFactory.makeKeyword("HL-STORAGE-MODULES");
        $str27$Storage_Modules = SubLObjectFactory.makeString("Storage Modules");
        $kw28$EVALUATABLE_PREDICATES = SubLObjectFactory.makeKeyword("EVALUATABLE-PREDICATES");
        $str29$Evaluatable_Predicates = SubLObjectFactory.makeString("Evaluatable Predicates");
        $kw30$EVALUATABLE_FUNCTIONS = SubLObjectFactory.makeKeyword("EVALUATABLE-FUNCTIONS");
        $str31$Evaluatable_Functions = SubLObjectFactory.makeString("Evaluatable Functions");
        $str32$SpecificRemovalModules = SubLObjectFactory.makeString("SpecificRemovalModules");
        $str33$Specific_Removal_Modules__ = SubLObjectFactory.makeString("Specific Removal Modules :");
        $kw34$PREDICATE_SPECIFIC_REMOVAL_MODULES = SubLObjectFactory.makeKeyword("PREDICATE-SPECIFIC-REMOVAL-MODULES");
        $str35$_literals = SubLObjectFactory.makeString(" literals");
        $str36$SpecificPreferenceModules = SubLObjectFactory.makeString("SpecificPreferenceModules");
        $str37$Specific_Preference_Modules__ = SubLObjectFactory.makeString("Specific Preference Modules :");
        $kw38$PREDICATE_SPECIFIC_PREFERENCE_MODULES = SubLObjectFactory.makeKeyword("PREDICATE-SPECIFIC-PREFERENCE-MODULES");
        $sym39$CB_HL_MODULE_SUMMARY = SubLObjectFactory.makeSymbol("CB-HL-MODULE-SUMMARY");
        $kw40$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $kw41$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str42$cb_hl_module_summary = SubLObjectFactory.makeString("cb-hl-module-summary");
        $sym43$CB_LINK_HL_MODULE_INDEX = SubLObjectFactory.makeSymbol("CB-LINK-HL-MODULE-INDEX");
        $kw44$HL_MODULE_SUMMARY = SubLObjectFactory.makeKeyword("HL-MODULE-SUMMARY");
        $kw45$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"));
        $kw47$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $sym48$CB_TRANSFORMATION_MODULES = SubLObjectFactory.makeSymbol("CB-TRANSFORMATION-MODULES");
        $str49$cb_transformation_modules = SubLObjectFactory.makeString("cb-transformation-modules");
        $sym50$CB_LINK_TRANSFORMATION_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-TRANSFORMATION-MODULES");
        $sym51$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym52$HL_MODULE_NAME = SubLObjectFactory.makeSymbol("HL-MODULE-NAME");
        $sym53$CB_GENERIC_REMOVAL_MODULES = SubLObjectFactory.makeSymbol("CB-GENERIC-REMOVAL-MODULES");
        $str54$cb_generic_removal_modules = SubLObjectFactory.makeString("cb-generic-removal-modules");
        $sym55$CB_LINK_GENERIC_REMOVAL_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-GENERIC-REMOVAL-MODULES");
        $sym56$CB_GENERIC_PREFERENCE_MODULES = SubLObjectFactory.makeSymbol("CB-GENERIC-PREFERENCE-MODULES");
        $str57$cb_generic_preference_modules = SubLObjectFactory.makeString("cb-generic-preference-modules");
        $sym58$CB_LINK_GENERIC_PREFERENCE_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-GENERIC-PREFERENCE-MODULES");
        $sym59$PREFERENCE_MODULE_NAME = SubLObjectFactory.makeSymbol("PREFERENCE-MODULE-NAME");
        $sym60$CB_CONJUNCTIVE_REMOVAL_MODULES = SubLObjectFactory.makeSymbol("CB-CONJUNCTIVE-REMOVAL-MODULES");
        $str61$cb_conjunctive_removal_modules = SubLObjectFactory.makeString("cb-conjunctive-removal-modules");
        $sym62$CB_LINK_CONJUNCTIVE_REMOVAL_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-CONJUNCTIVE-REMOVAL-MODULES");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-ID"));
        $str64$_S_did_not_specify_a_predicate_ = SubLObjectFactory.makeString("~S did not specify a predicate.");
        $sym65$CB_PREDICATE_SPECIFIC_REMOVAL_MODULES = SubLObjectFactory.makeSymbol("CB-PREDICATE-SPECIFIC-REMOVAL-MODULES");
        $sym66$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str67$Predicate_Specific_Removal_Module = SubLObjectFactory.makeString("Predicate Specific Removal Modules");
        $str68$cb_predicate_specific_removal_mod = SubLObjectFactory.makeString("cb-predicate-specific-removal-modules&~A");
        $sym69$CB_LINK_PREDICATE_SPECIFIC_REMOVAL_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-PREDICATE-SPECIFIC-REMOVAL-MODULES");
        $str70$_removal_modules = SubLObjectFactory.makeString(" removal modules");
        $str71$The_following_generic_modules_are = SubLObjectFactory.makeString("The following generic modules are also used for ");
        $str72$_literals__ = SubLObjectFactory.makeString(" literals :");
        $str73$__ = SubLObjectFactory.makeString(", ");
        $sym74$CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES = SubLObjectFactory.makeSymbol("CB-PREDICATE-SPECIFIC-PREFERENCE-MODULES");
        $str75$Predicate_Specific_Preference_Mod = SubLObjectFactory.makeString("Predicate Specific Preference Modules");
        $str76$cb_predicate_specific_preference_ = SubLObjectFactory.makeString("cb-predicate-specific-preference-modules&~A");
        $sym77$CB_LINK_PREDICATE_SPECIFIC_PREFERENCE_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-PREDICATE-SPECIFIC-PREFERENCE-MODULES");
        $str78$Predicate_Specific_Storage_Module = SubLObjectFactory.makeString("Predicate Specific Storage Modules");
        $str79$_preference_modules = SubLObjectFactory.makeString(" preference modules");
        $sym80$CB_REWRITE_MODULES = SubLObjectFactory.makeSymbol("CB-REWRITE-MODULES");
        $str81$cb_rewrite_modules = SubLObjectFactory.makeString("cb-rewrite-modules");
        $sym82$CB_LINK_REWRITE_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-REWRITE-MODULES");
        $sym83$CB_FORWARD_MODULES = SubLObjectFactory.makeSymbol("CB-FORWARD-MODULES");
        $str84$cb_forward_modules = SubLObjectFactory.makeString("cb-forward-modules");
        $sym85$CB_LINK_FORWARD_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-FORWARD-MODULES");
        $kw86$GENERIC_HL_STORAGE_MODULES = SubLObjectFactory.makeKeyword("GENERIC-HL-STORAGE-MODULES");
        $str87$Generic_Storage_Modules = SubLObjectFactory.makeString("Generic Storage Modules");
        $str88$Predicate_Specific_Storage_Module = SubLObjectFactory.makeString("Predicate Specific Storage Modules :");
        $kw89$PREDICATE_SPECIFIC_HL_STORAGE_MODULES = SubLObjectFactory.makeKeyword("PREDICATE-SPECIFIC-HL-STORAGE-MODULES");
        $str90$_modules = SubLObjectFactory.makeString(" modules");
        $sym91$CB_HL_STORAGE_MODULES = SubLObjectFactory.makeSymbol("CB-HL-STORAGE-MODULES");
        $str92$cb_hl_storage_modules = SubLObjectFactory.makeString("cb-hl-storage-modules");
        $sym93$CB_LINK_HL_STORAGE_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-HL-STORAGE-MODULES");
        $sym94$CB_GENERIC_HL_STORAGE_MODULES = SubLObjectFactory.makeSymbol("CB-GENERIC-HL-STORAGE-MODULES");
        $str95$cb_generic_hl_storage_modules = SubLObjectFactory.makeString("cb-generic-hl-storage-modules");
        $sym96$CB_LINK_GENERIC_HL_STORAGE_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-GENERIC-HL-STORAGE-MODULES");
        $sym97$CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES = SubLObjectFactory.makeSymbol("CB-PREDICATE-SPECIFIC-HL-STORAGE-MODULES");
        $str98$Predicate_Specific_Hl_Storage_Mod = SubLObjectFactory.makeString("Predicate Specific Hl-Storage Modules");
        $str99$cb_predicate_specific_hl_storage_ = SubLObjectFactory.makeString("cb-predicate-specific-hl-storage-modules&~A");
        $sym100$CB_LINK_PREDICATE_SPECIFIC_HL_STORAGE_MODULES = SubLObjectFactory.makeSymbol("CB-LINK-PREDICATE-SPECIFIC-HL-STORAGE-MODULES");
        $str101$_storage_modules = SubLObjectFactory.makeString(" storage modules");
        $str102$module_ = SubLObjectFactory.makeString("module ");
        $kw103$HL_MODULE = SubLObjectFactory.makeKeyword("HL-MODULE");
        $str104$ = SubLObjectFactory.makeString("");
        $str105$documentation__ = SubLObjectFactory.makeString("documentation :");
        $str106$no_documentation = SubLObjectFactory.makeString("no documentation");
        $str107$example__ = SubLObjectFactory.makeString("example :");
        $str108$no_example = SubLObjectFactory.makeString("no example");
        $kw109$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str110$Module_supplants__ = SubLObjectFactory.makeString("Module supplants :");
        $str111$_all_other_modules = SubLObjectFactory.makeString(" all other modules");
        $str112$unknown_supplants_type____S = SubLObjectFactory.makeString("unknown supplants type : ~S");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE-ID"));
        $str114$The_inference_module__A_is_no_lon = SubLObjectFactory.makeString("The inference module ~A is no longer available.");
        $sym115$CB_HL_MODULE = SubLObjectFactory.makeSymbol("CB-HL-MODULE");
        $sym116$HL_MODULE_P = SubLObjectFactory.makeSymbol("HL-MODULE-P");
        $str117$cb_hl_module__A = SubLObjectFactory.makeString("cb-hl-module&~A");
        $sym118$CB_LINK_HL_MODULE = SubLObjectFactory.makeSymbol("CB-LINK-HL-MODULE");
        $sym119$CB_FORM_HL_MODULE_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-HL-MODULE-METHOD");
        $str120$HL_Module__A = SubLObjectFactory.makeString("HL Module ~A");
        $str121$HL_Module = SubLObjectFactory.makeString("HL Module");
        $kw122$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw123$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str124$Property = SubLObjectFactory.makeString("Property");
        $str125$Value = SubLObjectFactory.makeString("Value");
        $sym126$CB_EVALUATABLE_PREDICATES = SubLObjectFactory.makeSymbol("CB-EVALUATABLE-PREDICATES");
        $str127$cb_evaluatable_predicates = SubLObjectFactory.makeString("cb-evaluatable-predicates");
        $sym128$CB_LINK_EVALUATABLE_PREDICATES = SubLObjectFactory.makeSymbol("CB-LINK-EVALUATABLE-PREDICATES");
        $str129$predicate_ = SubLObjectFactory.makeString("predicate ");
        $list130 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluatablePredicate")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationDefn")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFN"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DEFN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FBOUNDP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFN"))))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationDefn")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFN"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FBOUNDP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFN"))))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)cb_hl_module_summary.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion")))));
        $const131$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $list132 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), SubLObjectFactory.makeKeyword("COMPUTE-UNION"), SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), cb_hl_module_summary.NIL, SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), cb_hl_module_summary.T, SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), SubLObjectFactory.makeKeyword("NONE"), SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("RETURN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?PRED")) });
        $sym133$CB_EVALUATABLE_FUNCTIONS = SubLObjectFactory.makeSymbol("CB-EVALUATABLE-FUNCTIONS");
        $str134$cb_evaluatable_functions = SubLObjectFactory.makeString("cb-evaluatable-functions");
        $sym135$CB_LINK_EVALUATABLE_FUNCTIONS = SubLObjectFactory.makeSymbol("CB-LINK-EVALUATABLE-FUNCTIONS");
        $str136$function_ = SubLObjectFactory.makeString("function ");
        $str137$____ = SubLObjectFactory.makeString(" -> ");
        $sym138$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const139$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $list140 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?FUNC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluatableFunction")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationDefn")), (SubLObject)SubLObjectFactory.makeSymbol("?FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFN"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DEFN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FBOUNDP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFN"))))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationDefn")), (SubLObject)SubLObjectFactory.makeSymbol("?FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFN"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FBOUNDP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFN"))))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeSymbol("?FUNC"), (SubLObject)cb_hl_module_summary.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion")))));
        $list141 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), SubLObjectFactory.makeKeyword("COMPUTE-UNION"), SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), cb_hl_module_summary.NIL, SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), cb_hl_module_summary.T, SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), SubLObjectFactory.makeKeyword("NONE"), SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("RETURN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?FUNC")) });
        $str142$___ = SubLObjectFactory.makeString(" : ");
        $str143$_ = SubLObjectFactory.makeString("(");
        $str144$______ = SubLObjectFactory.makeString(" ... )");
        $str145$_ = SubLObjectFactory.makeString(")");
        $str146$___ = SubLObjectFactory.makeString(" ? ");
        $str147$example___ = SubLObjectFactory.makeString("example : ");
        $kw148$EXAMPLE = SubLObjectFactory.makeKeyword("EXAMPLE");
    }
}

/*

	Total time: 1130 ms
	
*/