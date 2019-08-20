package com.cyc.cycjava.cycl.inference.browser;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.forward_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class cb_hl_module_summary extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "398afa84a386081b5c628092f397fc0f109d07178715b38427656b4102f062ef";
    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 23000L)
    private static SubLSymbol $cb_gather_evaluatable_predicates$;
    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 25500L)
    private static SubLSymbol $cb_gather_evaluatable_functions$;
    private static SubLSymbol $CB_HL_MODULE_SUMMARY;
    private static SubLString $str1$cb_hl_module_summary_html;
    private static SubLString $str2$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static SubLString $str3$_meta_http_equiv__X_UA_Compatible;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLSymbol $CB_CYC;
    private static SubLString $str6$HL_Module_Summary;
    private static SubLSymbol $HL_MODULE_INDEX;
    private static SubLString $str8$Index_to_all_HL_modules;
    private static SubLSymbol $TRANSFORMATION_MODULES;
    private static SubLString $str10$Transformation_Modules;
    private static SubLString $str11$___S_total_;
    private static SubLSymbol $GENERIC_REMOVAL_MODULES;
    private static SubLString $str13$Generic_Removal_Modules;
    private static SubLString $str14$_SpecificRemovalModules;
    private static SubLString $str15$Specific_Removal_Modules;
    private static SubLSymbol $GENERIC_PREFERENCE_MODULES;
    private static SubLString $str17$Generic_Preference_Modules;
    private static SubLString $str18$_SpecificPreferenceModules;
    private static SubLString $str19$Specific_Preference_Modules;
    private static SubLSymbol $CONJUNCTIVE_REMOVAL_MODULES;
    private static SubLString $str21$Conjunctive_Removal_Modules;
    private static SubLSymbol $REWRITE_MODULES;
    private static SubLString $str23$Rewrite_Modules;
    private static SubLSymbol $FORWARD_MODULES;
    private static SubLString $str25$Forward_Modules;
    private static SubLSymbol $HL_STORAGE_MODULES;
    private static SubLString $str27$Storage_Modules;
    private static SubLSymbol $EVALUATABLE_PREDICATES;
    private static SubLString $str29$Evaluatable_Predicates;
    private static SubLSymbol $EVALUATABLE_FUNCTIONS;
    private static SubLString $str31$Evaluatable_Functions;
    private static SubLString $str32$SpecificRemovalModules;
    private static SubLString $str33$Specific_Removal_Modules__;
    private static SubLSymbol $PREDICATE_SPECIFIC_REMOVAL_MODULES;
    private static SubLString $str35$_literals;
    private static SubLString $str36$SpecificPreferenceModules;
    private static SubLString $str37$Specific_Preference_Modules__;
    private static SubLSymbol $PREDICATE_SPECIFIC_PREFERENCE_MODULES;
    private static SubLSymbol $sym39$CB_HL_MODULE_SUMMARY;
    private static SubLSymbol $HTML_HANDLER;
    private static SubLSymbol $SELF;
    private static SubLString $str42$cb_hl_module_summary;
    private static SubLSymbol $sym43$CB_LINK_HL_MODULE_INDEX;
    private static SubLSymbol $HL_MODULE_SUMMARY;
    private static SubLSymbol $TEXT;
    private static SubLList $list46;
    private static SubLSymbol $MAIN;
    private static SubLSymbol $sym48$CB_TRANSFORMATION_MODULES;
    private static SubLString $str49$cb_transformation_modules;
    private static SubLSymbol $sym50$CB_LINK_TRANSFORMATION_MODULES;
    private static SubLSymbol $sym51$TERM__;
    private static SubLSymbol $sym52$HL_MODULE_NAME;
    private static SubLSymbol $sym53$CB_GENERIC_REMOVAL_MODULES;
    private static SubLString $str54$cb_generic_removal_modules;
    private static SubLSymbol $sym55$CB_LINK_GENERIC_REMOVAL_MODULES;
    private static SubLSymbol $sym56$CB_GENERIC_PREFERENCE_MODULES;
    private static SubLString $str57$cb_generic_preference_modules;
    private static SubLSymbol $sym58$CB_LINK_GENERIC_PREFERENCE_MODULES;
    private static SubLSymbol $sym59$PREFERENCE_MODULE_NAME;
    private static SubLSymbol $sym60$CB_CONJUNCTIVE_REMOVAL_MODULES;
    private static SubLString $str61$cb_conjunctive_removal_modules;
    private static SubLSymbol $sym62$CB_LINK_CONJUNCTIVE_REMOVAL_MODULES;
    private static SubLList $list63;
    private static SubLString $str64$_S_did_not_specify_a_predicate_;
    private static SubLSymbol $sym65$CB_PREDICATE_SPECIFIC_REMOVAL_MODULES;
    private static SubLSymbol $sym66$FORT_P;
    private static SubLString $str67$Predicate_Specific_Removal_Module;
    private static SubLString $str68$cb_predicate_specific_removal_mod;
    private static SubLSymbol $sym69$CB_LINK_PREDICATE_SPECIFIC_REMOVAL_MODULES;
    private static SubLString $str70$_removal_modules;
    private static SubLString $str71$The_following_generic_modules_are;
    private static SubLString $str72$_literals__;
    private static SubLString $str73$__;
    private static SubLSymbol $sym74$CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES;
    private static SubLString $str75$Predicate_Specific_Preference_Mod;
    private static SubLString $str76$cb_predicate_specific_preference_;
    private static SubLSymbol $sym77$CB_LINK_PREDICATE_SPECIFIC_PREFERENCE_MODULES;
    private static SubLString $str78$Predicate_Specific_Storage_Module;
    private static SubLString $str79$_preference_modules;
    private static SubLSymbol $sym80$CB_REWRITE_MODULES;
    private static SubLString $str81$cb_rewrite_modules;
    private static SubLSymbol $sym82$CB_LINK_REWRITE_MODULES;
    private static SubLSymbol $sym83$CB_FORWARD_MODULES;
    private static SubLString $str84$cb_forward_modules;
    private static SubLSymbol $sym85$CB_LINK_FORWARD_MODULES;
    private static SubLSymbol $GENERIC_HL_STORAGE_MODULES;
    private static SubLString $str87$Generic_Storage_Modules;
    private static SubLString $str88$Predicate_Specific_Storage_Module;
    private static SubLSymbol $PREDICATE_SPECIFIC_HL_STORAGE_MODULES;
    private static SubLString $str90$_modules;
    private static SubLSymbol $sym91$CB_HL_STORAGE_MODULES;
    private static SubLString $str92$cb_hl_storage_modules;
    private static SubLSymbol $sym93$CB_LINK_HL_STORAGE_MODULES;
    private static SubLSymbol $sym94$CB_GENERIC_HL_STORAGE_MODULES;
    private static SubLString $str95$cb_generic_hl_storage_modules;
    private static SubLSymbol $sym96$CB_LINK_GENERIC_HL_STORAGE_MODULES;
    private static SubLSymbol $sym97$CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES;
    private static SubLString $str98$Predicate_Specific_Hl_Storage_Mod;
    private static SubLString $str99$cb_predicate_specific_hl_storage_;
    private static SubLSymbol $sym100$CB_LINK_PREDICATE_SPECIFIC_HL_STORAGE_MODULES;
    private static SubLString $str101$_storage_modules;
    private static SubLString $str102$module_;
    private static SubLSymbol $HL_MODULE;
    private static SubLString $str104$;
    private static SubLString $str105$documentation__;
    private static SubLString $str106$no_documentation;
    private static SubLString $str107$example__;
    private static SubLString $str108$no_example;
    private static SubLSymbol $ALL;
    private static SubLString $str110$Module_supplants__;
    private static SubLString $str111$_all_other_modules;
    private static SubLString $str112$unknown_supplants_type____S;
    private static SubLList $list113;
    private static SubLString $str114$The_inference_module__A_is_no_lon;
    private static SubLSymbol $sym115$CB_HL_MODULE;
    private static SubLSymbol $sym116$HL_MODULE_P;
    private static SubLString $str117$cb_hl_module__A;
    private static SubLSymbol $sym118$CB_LINK_HL_MODULE;
    private static SubLSymbol $sym119$CB_FORM_HL_MODULE_METHOD;
    private static SubLString $str120$HL_Module__A;
    private static SubLString $str121$HL_Module;
    private static SubLSymbol $LEFT;
    private static SubLSymbol $TOP;
    private static SubLString $str124$Property;
    private static SubLString $str125$Value;
    private static SubLSymbol $sym126$CB_EVALUATABLE_PREDICATES;
    private static SubLString $str127$cb_evaluatable_predicates;
    private static SubLSymbol $sym128$CB_LINK_EVALUATABLE_PREDICATES;
    private static SubLString $str129$predicate_;
    private static SubLList $list130;
    private static SubLObject $$EverythingPSC;
    private static SubLList $list132;
    private static SubLSymbol $sym133$CB_EVALUATABLE_FUNCTIONS;
    private static SubLString $str134$cb_evaluatable_functions;
    private static SubLSymbol $sym135$CB_LINK_EVALUATABLE_FUNCTIONS;
    private static SubLString $str136$function_;
    private static SubLString $str137$____;
    private static SubLSymbol $sym138$RELEVANT_MT_IS_EVERYTHING;
    private static SubLObject $$Thing;
    private static SubLList $list140;
    private static SubLList $list141;
    private static SubLString $str142$___;
    private static SubLString $str143$_;
    private static SubLString $str144$______;
    private static SubLString $str145$_;
    private static SubLString $str146$___;
    private static SubLString $str147$example___;
    private static SubLSymbol $EXAMPLE;

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 900L)
    public static SubLObject cb_hl_module_summary(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str6$HL_Module_Summary);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup(TWO_INTEGER);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        cb_utilities.cb_link($HL_MODULE_INDEX, $str6$HL_Module_Summary, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup(TWO_INTEGER);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        cb_utilities.cb_help_preamble($CB_HL_MODULE_SUMMARY, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str8$Index_to_all_HL_modules);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($TRANSFORMATION_MODULES, $str10$Transformation_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, inference_modules.transformation_module_count());
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($GENERIC_REMOVAL_MODULES, $str13$Generic_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, inference_modules.generic_removal_module_count());
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str14$_SpecificRemovalModules);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($str15$Specific_Removal_Modules);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, cb_total_specific_removal_module_count());
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($GENERIC_PREFERENCE_MODULES, $str17$Generic_Preference_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, preference_modules.generic_preference_module_count());
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str18$_SpecificPreferenceModules);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($str19$Specific_Preference_Modules);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, preference_modules.specific_preference_module_count());
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($CONJUNCTIVE_REMOVAL_MODULES, $str21$Conjunctive_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, inference_modules.conjunctive_removal_module_count());
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($REWRITE_MODULES, $str23$Rewrite_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, inference_modules.rewrite_module_count());
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($FORWARD_MODULES, $str25$Forward_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, forward_modules.forward_module_count());
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($HL_STORAGE_MODULES, $str27$Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, hl_storage_modules.hl_storage_module_count());
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($EVALUATABLE_PREDICATES, $str29$Evaluatable_Predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, cb_evaluatable_predicate_count());
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($EVALUATABLE_FUNCTIONS, $str31$Evaluatable_Functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, cb_evaluatable_function_count());
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str32$SpecificRemovalModules);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str33$Specific_Removal_Modules__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, cb_total_specific_removal_module_count());
                        SubLObject predicates = cb_specific_removal_module_predicates();
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var = predicates;
                            SubLObject predicate = NIL;
                            predicate = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject predicate_reference = cb_utilities.cb_string_for_fort(predicate);
                                    cb_utilities.cb_link($PREDICATE_SPECIFIC_REMOVAL_MODULES, predicate, predicate_reference, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_princ($str35$_literals);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                predicate = cdolist_list_var.first();
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str36$SpecificPreferenceModules);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str37$Specific_Preference_Modules__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, preference_modules.specific_preference_module_count());
                        predicates = cb_all_specific_preference_module_predicates();
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var = predicates;
                            SubLObject predicate = NIL;
                            predicate = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject predicate_reference = cb_utilities.cb_string_for_fort(predicate);
                                    cb_utilities.cb_link($PREDICATE_SPECIFIC_PREFERENCE_MODULES, predicate, predicate_reference, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_princ($str35$_literals);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                predicate = cdolist_list_var.first();
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 4300L)
    public static SubLObject cb_link_hl_module_index(SubLObject linktext, SubLObject target) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = $SELF;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str6$HL_Module_Summary;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str42$cb_hl_module_summary);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 4600L)
    public static SubLObject cb_transformation_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str10$Transformation_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($TRANSFORMATION_MODULES, $str10$Transformation_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_transformation_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$12, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 5100L)
    public static SubLObject cb_link_transformation_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str10$Transformation_Modules;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str49$cb_transformation_modules);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 5300L)
    public static SubLObject cb_all_transformation_modules() {
        SubLObject hl_modules = NIL;
        SubLObject cdolist_list_var = inference_modules.transformation_modules();
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hl_modules = cons(hl_module, hl_modules);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        return Sort.sort(hl_modules, $sym51$TERM__, $sym52$HL_MODULE_NAME);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 5600L)
    public static SubLObject cb_generic_removal_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str13$Generic_Removal_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$14 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($GENERIC_REMOVAL_MODULES, $str13$Generic_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_generic_removal_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$14, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 6000L)
    public static SubLObject cb_link_generic_removal_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str13$Generic_Removal_Modules;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str54$cb_generic_removal_modules);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 6300L)
    public static SubLObject cb_all_generic_removal_modules() {
        return Sort.sort(inference_modules.generic_removal_modules(), $sym51$TERM__, $sym52$HL_MODULE_NAME);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 6400L)
    public static SubLObject cb_generic_preference_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str17$Generic_Preference_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($GENERIC_PREFERENCE_MODULES, $str17$Generic_Preference_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_generic_preference_modules();
                    SubLObject prefmod = NIL;
                    prefmod = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        preference_modules.cb_display_preference_module_info(prefmod);
                        cdolist_list_var = cdolist_list_var.rest();
                        prefmod = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$16, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 6900L)
    public static SubLObject cb_link_generic_preference_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str17$Generic_Preference_Modules;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str57$cb_generic_preference_modules);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 7200L)
    public static SubLObject cb_all_generic_preference_modules() {
        return Sort.sort(preference_modules.generic_preference_modules(), $sym51$TERM__, $sym59$PREFERENCE_MODULE_NAME);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 7300L)
    public static SubLObject cb_conjunctive_removal_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str21$Conjunctive_Removal_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$18 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($CONJUNCTIVE_REMOVAL_MODULES, $str21$Conjunctive_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_conjunctive_removal_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$18, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 7800L)
    public static SubLObject cb_link_conjunctive_removal_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str21$Conjunctive_Removal_Modules;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str61$cb_conjunctive_removal_modules);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 8100L)
    public static SubLObject cb_all_conjunctive_removal_modules() {
        return Sort.sort(inference_modules.conjunctive_removal_modules(), $sym51$TERM__, $sym52$HL_MODULE_NAME);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 8200L)
    public static SubLObject cb_predicate_specific_removal_modules(SubLObject args) {
        SubLObject fort_id = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, $list63);
        fort_id = args.first();
        SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, $list63);
            return NIL;
        }
        SubLObject predicate = cb_utilities.cb_guess_fort(fort_id, UNPROVIDED);
        if (NIL == forts.fort_p(predicate)) {
            return cb_utilities.cb_error($str64$_S_did_not_specify_a_predicate_, fort_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_predicate_specific_removal_modules_guts(predicate);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 8600L)
    public static SubLObject cb_link_predicate_specific_removal_modules(SubLObject predicate, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : predicate;
        if (NIL == linktext) {
            linktext = $str67$Predicate_Specific_Removal_Module;
        }
        SubLObject id = cb_utilities.cb_fort_identifier(predicate);
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str68$cb_predicate_specific_removal_mod, id);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return predicate;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 9000L)
    public static SubLObject cb_predicate_specific_removal_modules_guts(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : predicate;
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str67$Predicate_Specific_Removal_Module);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$20 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($PREDICATE_SPECIFIC_REMOVAL_MODULES, predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_princ($str70$_removal_modules);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject use_generic = cb_specific_use_generic(predicate);
                    if (NIL != use_generic) {
                        cb_display_specific_use_generic(predicate, use_generic);
                    }
                    SubLObject cdolist_list_var = cb_specific_removal_modules(predicate);
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL == subl_promotions.memberP(hl_module, use_generic, UNPROVIDED, UNPROVIDED)) {
                            cb_display_hl_module_info(hl_module);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$20, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 9700L)
    public static SubLObject cb_display_specific_use_generic(SubLObject predicate, SubLObject generic_modules) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_princ($str71$The_following_generic_modules_are);
        cb_utilities.cb_form(predicate, UNPROVIDED, UNPROVIDED);
        html_utilities.html_princ($str72$_literals__);
        html_utilities.html_newline(UNPROVIDED);
        SubLObject cdolist_list_var = generic_modules;
        SubLObject generic_module = NIL;
        generic_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!generic_module.eql(generic_modules.first())) {
                html_utilities.html_princ($str73$__);
            }
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(Characters.CHAR_hash, UNPROVIDED);
            html_utilities.html_markup(generic_module);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_utilities.html_princ(generic_module);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            generic_module = cdolist_list_var.first();
        }
        html_utilities.html_newline(TWO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 10200L)
    public static SubLObject cb_specific_removal_module_predicates() {
        return kb_utilities.sort_terms(inference_modules.predicates_with_specific_removal_modules(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 10300L)
    public static SubLObject cb_specific_removal_modules(SubLObject predicate) {
        return Sort.sort(inference_modules.removal_modules_specific(predicate), $sym51$TERM__, $sym52$HL_MODULE_NAME);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 10500L)
    public static SubLObject cb_specific_use_generic(SubLObject predicate) {
        SubLObject hl_modules = cb_specific_removal_modules(predicate);
        SubLObject generic = NIL;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!predicate.eql(inference_modules.hl_module_predicate(hl_module))) {
                generic = cons(hl_module, generic);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        return Sequences.nreverse(generic);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 10700L)
    public static SubLObject cb_total_specific_removal_module_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = cb_specific_removal_module_predicates();
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            total = Numbers.add(total, cb_specific_removal_module_count(predicate));
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return total;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 11000L)
    public static SubLObject cb_specific_removal_module_count(SubLObject predicate) {
        SubLObject hl_modules = cb_specific_removal_modules(predicate);
        SubLObject generic = cb_specific_use_generic(predicate);
        return Numbers.subtract(Sequences.length(hl_modules), Sequences.length(generic));
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 11200L)
    public static SubLObject cb_predicate_specific_preference_modules(SubLObject args) {
        SubLObject fort_id = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, $list63);
        fort_id = args.first();
        SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, $list63);
            return NIL;
        }
        SubLObject predicate = cb_utilities.cb_guess_fort(fort_id, UNPROVIDED);
        if (NIL == forts.fort_p(predicate)) {
            return cb_utilities.cb_error($str64$_S_did_not_specify_a_predicate_, fort_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_predicate_specific_preference_modules_guts(predicate);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 11600L)
    public static SubLObject cb_link_predicate_specific_preference_modules(SubLObject predicate, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : predicate;
        if (NIL == linktext) {
            linktext = $str75$Predicate_Specific_Preference_Mod;
        }
        SubLObject id = cb_utilities.cb_fort_identifier(predicate);
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str76$cb_predicate_specific_preference_, id);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return predicate;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 12000L)
    public static SubLObject cb_predicate_specific_preference_modules_guts(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : predicate;
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str78$Predicate_Specific_Storage_Module);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$22 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($PREDICATE_SPECIFIC_PREFERENCE_MODULES, predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_princ($str79$_preference_modules);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = preference_modules.specific_preference_modules_for_pred(predicate);
                    SubLObject prefmod = NIL;
                    prefmod = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        preference_modules.cb_display_preference_module_info(prefmod);
                        cdolist_list_var = cdolist_list_var.rest();
                        prefmod = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$22, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 12500L)
    public static SubLObject cb_all_specific_preference_module_predicates() {
        return kb_utilities.sort_terms(preference_modules.specific_preference_module_predicates(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 12700L)
    public static SubLObject cb_rewrite_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str23$Rewrite_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$24 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($REWRITE_MODULES, $str23$Rewrite_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_rewrite_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$24, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 13100L)
    public static SubLObject cb_link_rewrite_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str23$Rewrite_Modules;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str81$cb_rewrite_modules);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 13300L)
    public static SubLObject cb_all_rewrite_modules() {
        return Sort.sort(inference_modules.rewrite_modules(), $sym51$TERM__, $sym52$HL_MODULE_NAME);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 13400L)
    public static SubLObject cb_forward_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str25$Forward_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$26 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($FORWARD_MODULES, $str25$Forward_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_forward_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$26, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 13800L)
    public static SubLObject cb_link_forward_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str25$Forward_Modules;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str84$cb_forward_modules);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 14000L)
    public static SubLObject cb_all_forward_modules() {
        return Sequences.nreverse(conses_high.copy_list(forward_modules.forward_modules()));
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 14200L)
    public static SubLObject cb_hl_storage_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str27$Storage_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$28 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($HL_STORAGE_MODULES, $str27$Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    html_utilities.html_newline(UNPROVIDED);
                    cb_utilities.cb_link($GENERIC_HL_STORAGE_MODULES, $str87$Generic_Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, hl_storage_modules.generic_hl_storage_module_count());
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ($str88$Predicate_Specific_Storage_Module);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, cb_total_specific_hl_storage_module_count());
                    SubLObject predicates = cb_specific_hl_storage_module_predicates();
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject cdolist_list_var = predicates;
                        SubLObject predicate = NIL;
                        predicate = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject predicate_reference = cb_utilities.cb_string_for_fort(predicate);
                                cb_utilities.cb_link($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, predicate, predicate_reference, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_princ($str90$_modules);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            cdolist_list_var = cdolist_list_var.rest();
                            predicate = cdolist_list_var.first();
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$28, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 15200L)
    public static SubLObject cb_link_hl_storage_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str27$Storage_Modules;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str92$cb_hl_storage_modules);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 15400L)
    public static SubLObject cb_generic_hl_storage_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str87$Generic_Storage_Modules);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$32 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($GENERIC_HL_STORAGE_MODULES, $str87$Generic_Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_generic_hl_storage_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$32, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 15900L)
    public static SubLObject cb_link_generic_hl_storage_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str87$Generic_Storage_Modules;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str95$cb_generic_hl_storage_modules);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 16200L)
    public static SubLObject cb_all_generic_hl_storage_modules() {
        return Sort.sort(hl_storage_modules.generic_hl_storage_modules(), $sym51$TERM__, $sym52$HL_MODULE_NAME);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 16300L)
    public static SubLObject cb_predicate_specific_hl_storage_modules(SubLObject args) {
        SubLObject fort_id = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, $list63);
        fort_id = args.first();
        SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, $list63);
            return NIL;
        }
        SubLObject predicate = cb_utilities.cb_guess_fort(fort_id, UNPROVIDED);
        if (NIL == forts.fort_p(predicate)) {
            return cb_utilities.cb_error($str64$_S_did_not_specify_a_predicate_, fort_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_predicate_specific_hl_storage_modules_guts(predicate);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 16700L)
    public static SubLObject cb_link_predicate_specific_hl_storage_modules(SubLObject predicate, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : predicate;
        if (NIL == linktext) {
            linktext = $str98$Predicate_Specific_Hl_Storage_Mod;
        }
        SubLObject id = cb_utilities.cb_fort_identifier(predicate);
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str99$cb_predicate_specific_hl_storage_, id);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return predicate;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 17100L)
    public static SubLObject cb_predicate_specific_hl_storage_modules_guts(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : predicate;
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str78$Predicate_Specific_Storage_Module);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$34 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_princ($str101$_storage_modules);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_specific_hl_storage_modules(predicate);
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$34, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 17600L)
    public static SubLObject cb_specific_hl_storage_module_predicates() {
        return kb_utilities.sort_terms(hl_storage_modules.predicates_with_specific_hl_storage_modules(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 17800L)
    public static SubLObject cb_specific_hl_storage_modules(SubLObject predicate) {
        return Sort.sort(hl_storage_modules.hl_storage_modules_for_predicate(predicate), $sym51$TERM__, $sym52$HL_MODULE_NAME);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 17900L)
    public static SubLObject cb_total_specific_hl_storage_module_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = cb_specific_hl_storage_module_predicates();
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            total = Numbers.add(total, cb_specific_hl_storage_module_count(predicate));
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return total;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 18100L)
    public static SubLObject cb_specific_hl_storage_module_count(SubLObject predicate) {
        return Sequences.length(cb_specific_hl_storage_modules(predicate));
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 18300L)
    public static SubLObject cb_display_hl_module_info(SubLObject hl_module) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_target_definition(hl_module);
        SubLObject documentation = inference_modules.hl_module_documentation_string(hl_module);
        SubLObject example = inference_modules.hl_module_example_string(hl_module);
        SubLObject exclusive = inference_modules.hl_module_exclusive_func(hl_module);
        SubLObject supplants = inference_modules.hl_module_supplants_info(hl_module);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(ZERO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(ZERO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(ZERO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        SubLObject _prev_bind_2 = html_macros.$html_indent_table_max$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$html_indent_table_max$.bind(TWO_INTEGER, thread);
            SubLObject indent = ZERO_INTEGER;
            SubLObject span = Numbers.max(ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_utilities.html_indent_row_internal(indent);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (NIL != span) {
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(span);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str102$module_);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_utilities.cb_link($HL_MODULE, hl_module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            if (!documentation.equal($str104$) || !example.equal($str104$)) {
                indent = ZERO_INTEGER;
                span = Numbers.max(ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str105$documentation__);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                indent = ONE_INTEGER;
                span = Numbers.max(ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (documentation.equal($str104$)) {
                            html_utilities.html_princ($str106$no_documentation);
                        } else {
                            html_macros.verify_not_within_html_pre();
                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            SubLObject _prev_bind_0_$42 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind(T, thread);
                                html_utilities.html_princ_doc_string(documentation, UNPROVIDED);
                            } finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                indent = ZERO_INTEGER;
                span = Numbers.max(ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str107$example__);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                indent = ONE_INTEGER;
                span = Numbers.max(ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (example.equal($str104$)) {
                            html_utilities.html_princ($str108$no_example);
                        } else {
                            html_macros.verify_not_within_html_pre();
                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            SubLObject _prev_bind_0_$47 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind(T, thread);
                                html_utilities.html_princ_doc_string(example, UNPROVIDED);
                            } finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$47, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } else {
                indent = ZERO_INTEGER;
                span = Numbers.max(ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str106$no_documentation);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            if (NIL != exclusive && supplants == $ALL) {
                indent = ZERO_INTEGER;
                span = Numbers.max(ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_indent_row_internal(indent);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(span);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str110$Module_supplants__);
                        html_utilities.html_princ($str111$_all_other_modules);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } else if (supplants != $ALL) {
                if (supplants.isList()) {
                    indent = ZERO_INTEGER;
                    span = Numbers.max(ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_indent_row_internal(indent);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (NIL != span) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(span);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($str110$Module_supplants__);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    indent = ONE_INTEGER;
                    span = Numbers.max(ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_indent_row_internal(indent);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (NIL != span) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(span);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var = supplants;
                            SubLObject supplanted = NIL;
                            supplanted = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if (!supplanted.eql(supplants.first())) {
                                    html_utilities.html_princ($str73$__);
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(Characters.CHAR_hash, UNPROVIDED);
                                html_utilities.html_markup(supplanted);
                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ(supplanted);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                supplanted = cdolist_list_var.first();
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    Errors.error($str112$unknown_supplants_type____S, supplants);
                }
            }
            html_utilities.html_indent_table_internal(TWO_INTEGER);
        } finally {
            html_macros.$html_indent_table_max$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 20000L)
    public static SubLObject cb_hl_module(SubLObject args) {
        SubLObject hl_module_id = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, $list113);
        hl_module_id = args.first();
        SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, $list113);
            return NIL;
        }
        SubLObject hl_module = cb_parameters.cb_glob_lookup_by_string(hl_module_id);
        if (NIL == inference_modules.hl_module_p(hl_module)) {
            return cb_utilities.cb_error($str114$The_inference_module__A_is_no_lon, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_hl_module_guts(hl_module);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 20400L)
    public static SubLObject cb_link_hl_module(SubLObject hl_module, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        if (NIL == linktext) {
            linktext = print_high.princ_to_string(inference_modules.hl_module_name(hl_module));
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str117$cb_hl_module__A, cb_parameters.cb_glob_id(hl_module));
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return hl_module;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 20700L)
    public static SubLObject cb_form_hl_module_method(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        cb_utilities.cb_link($HL_MODULE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 20800L)
    public static SubLObject cb_hl_module_id(SubLObject hl_module) {
        return print_high.prin1_to_string(inference_modules.hl_module_name(hl_module));
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 20900L)
    public static SubLObject cb_guess_hl_module(SubLObject string) {
        return inference_modules.find_hl_module_by_name(reader.read_from_string_ignoring_errors(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 21100L)
    public static SubLObject cb_hl_module_guts(SubLObject hl_module) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        SubLObject title = PrintLow.format(NIL, $str120$HL_Module__A, hl_module);
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            SubLObject _prev_bind_0_$57 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ_strong($str121$HL_Module);
                    html_utilities.html_indent(UNPROVIDED);
                    cb_utilities.cb_link($HL_MODULE, hl_module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ_strong($str124$Property);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ_strong($str125$Value);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        SubLObject cdolist_list_var = inference_modules.hl_module_properties();
                        SubLObject property = NIL;
                        property = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != inference_modules.hl_module_property_not_defaultP(hl_module, property)) {
                                SubLObject value = inference_modules.hl_module_property_without_values(hl_module, property);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                    SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                        cb_utilities.cb_form(property, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                    SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_form(value, ZERO_INTEGER, T);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            property = cdolist_list_var.first();
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$57, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 21900L)
    public static SubLObject cb_evaluatable_predicates(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str29$Evaluatable_Predicates);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$66 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($EVALUATABLE_PREDICATES, $str29$Evaluatable_Predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject list_var = NIL;
                    SubLObject predicate = NIL;
                    SubLObject index = NIL;
                    list_var = cb_gather_evaluatable_predicates();
                    predicate = list_var.first();
                    for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), predicate = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
                        if (!index.isZero()) {
                            html_utilities.html_newline(TWO_INTEGER);
                        }
                        cb_display_evaluatable_predicate(predicate);
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$66, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 22500L)
    public static SubLObject cb_link_evaluatable_predicates(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str29$Evaluatable_Predicates;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str127$cb_evaluatable_predicates);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 22700L)
    public static SubLObject cb_display_evaluatable_predicate(SubLObject predicate) {
        html_utilities.html_princ($str129$predicate_);
        cb_utilities.cb_form(predicate, UNPROVIDED, UNPROVIDED);
        cb_relation_arg_signature(predicate);
        cb_display_evaluation_defn_example(predicate);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 23000L)
    public static SubLObject cb_gather_evaluatable_predicates() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $cb_gather_evaluatable_predicates$.getDynamicValue(thread)) {
            SubLObject predicates = inference_kernel.new_cyc_query($list130, $$EverythingPSC, $list132);
            $cb_gather_evaluatable_predicates$.setDynamicValue(kb_utilities.sort_terms(predicates, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        return $cb_gather_evaluatable_predicates$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 24000L)
    public static SubLObject cb_evaluatable_predicate_count() {
        return Sequences.length(cb_gather_evaluatable_predicates());
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 24100L)
    public static SubLObject cb_evaluatable_functions(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str31$Evaluatable_Functions);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0_$68 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    cb_utilities.cb_link($EVALUATABLE_FUNCTIONS, $str31$Evaluatable_Functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject list_var = NIL;
                    SubLObject function = NIL;
                    SubLObject index = NIL;
                    list_var = cb_gather_evaluatable_functions();
                    function = list_var.first();
                    for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), function = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
                        if (!index.isZero()) {
                            html_utilities.html_newline(TWO_INTEGER);
                        }
                        cb_display_evaluatable_function(function);
                    }
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$68, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 24700L)
    public static SubLObject cb_link_evaluatable_functions(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str31$Evaluatable_Functions;
        }
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ($str134$cb_evaluatable_functions);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 24900L)
    public static SubLObject cb_display_evaluatable_function(SubLObject function) {
        html_utilities.html_princ($str136$function_);
        cb_utilities.cb_form(function, UNPROVIDED, UNPROVIDED);
        cb_relation_arg_signature(function);
        cb_function_result_type(function);
        cb_display_evaluation_defn_example(function);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 25200L)
    public static SubLObject cb_function_result_type(SubLObject function) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        html_utilities.html_princ($str137$____);
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym138$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject result_isa = kb_accessors.result_isa(function, NIL);
            if (result_isa.isList()) {
                result_isa = result_isa.first();
            }
            if (NIL == result_isa) {
                result_isa = $$Thing;
            }
            cb_utilities.cb_form(result_isa, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 25500L)
    public static SubLObject cb_gather_evaluatable_functions() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $cb_gather_evaluatable_functions$.getDynamicValue(thread)) {
            SubLObject functions = inference_kernel.new_cyc_query($list140, $$EverythingPSC, $list141);
            $cb_gather_evaluatable_functions$.setDynamicValue(kb_utilities.sort_terms(functions, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        return $cb_gather_evaluatable_functions$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 26600L)
    public static SubLObject cb_evaluatable_function_count() {
        return Sequences.length(cb_gather_evaluatable_functions());
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 26700L)
    public static SubLObject cb_relation_arg_signature(SubLObject relation) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        html_utilities.html_princ($str142$___);
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym138$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject argsisa = kb_accessors.args_isa(relation, NIL);
            if (NIL != argsisa) {
                html_utilities.html_princ($str143$_);
                cb_utilities.cb_form(argsisa.first(), UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                html_utilities.html_princ($str144$______);
                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            } else {
                SubLObject v_arity = arity.arity(relation);
                if (v_arity.isInteger()) {
                    html_utilities.html_princ($str143$_);
                    SubLObject index;
                    SubLObject arg;
                    SubLObject argn_isa;
                    for (index = NIL, index = ZERO_INTEGER; index.numL(v_arity); index = Numbers.add(index, ONE_INTEGER)) {
                        arg = Numbers.add(index, ONE_INTEGER);
                        if (!arg.numE(ONE_INTEGER)) {
                            html_utilities.html_indent(UNPROVIDED);
                        }
                        argn_isa = kb_accessors.argn_isa(relation, arg, NIL);
                        if (argn_isa.isList()) {
                            argn_isa = argn_isa.first();
                        }
                        if (NIL == argn_isa) {
                            argn_isa = $$Thing;
                        }
                        cb_utilities.cb_form(argn_isa, UNPROVIDED, UNPROVIDED);
                    }
                    html_utilities.html_princ($str145$_);
                } else {
                    html_utilities.html_princ($str146$___);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 27500L)
    public static SubLObject cb_display_evaluation_defn_example(SubLObject relation) {
        SubLObject defn = relation_evaluation.evaluation_defn(relation, NIL);
        if (defn.isSymbol() && NIL != Symbols.fboundp(defn)) {
            SubLObject example = evaluation_defn_example(defn);
            if (example.isString()) {
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_princ($str147$example___);
                html_utilities.html_princ_doc_string(example, UNPROVIDED);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-hl-module-summary.lisp", position = 27800L)
    public static SubLObject evaluation_defn_example(SubLObject defn) {
        return Symbols.get(defn, $EXAMPLE, NIL);
    }

    public static SubLObject declare_cb_hl_module_summary_file() {
        declareFunction("cb_hl_module_summary", "CB-HL-MODULE-SUMMARY", 0, 1, false);
        declareFunction("cb_link_hl_module_index", "CB-LINK-HL-MODULE-INDEX", 0, 2, false);
        declareFunction("cb_transformation_modules", "CB-TRANSFORMATION-MODULES", 0, 1, false);
        declareFunction("cb_link_transformation_modules", "CB-LINK-TRANSFORMATION-MODULES", 0, 1, false);
        declareFunction("cb_all_transformation_modules", "CB-ALL-TRANSFORMATION-MODULES", 0, 0, false);
        declareFunction("cb_generic_removal_modules", "CB-GENERIC-REMOVAL-MODULES", 0, 1, false);
        declareFunction("cb_link_generic_removal_modules", "CB-LINK-GENERIC-REMOVAL-MODULES", 0, 1, false);
        declareFunction("cb_all_generic_removal_modules", "CB-ALL-GENERIC-REMOVAL-MODULES", 0, 0, false);
        declareFunction("cb_generic_preference_modules", "CB-GENERIC-PREFERENCE-MODULES", 0, 1, false);
        declareFunction("cb_link_generic_preference_modules", "CB-LINK-GENERIC-PREFERENCE-MODULES", 0, 1, false);
        declareFunction("cb_all_generic_preference_modules", "CB-ALL-GENERIC-PREFERENCE-MODULES", 0, 0, false);
        declareFunction("cb_conjunctive_removal_modules", "CB-CONJUNCTIVE-REMOVAL-MODULES", 0, 1, false);
        declareFunction("cb_link_conjunctive_removal_modules", "CB-LINK-CONJUNCTIVE-REMOVAL-MODULES", 0, 1, false);
        declareFunction("cb_all_conjunctive_removal_modules", "CB-ALL-CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false);
        declareFunction("cb_predicate_specific_removal_modules", "CB-PREDICATE-SPECIFIC-REMOVAL-MODULES", 1, 0, false);
        declareFunction("cb_link_predicate_specific_removal_modules", "CB-LINK-PREDICATE-SPECIFIC-REMOVAL-MODULES", 1, 1, false);
        declareFunction("cb_predicate_specific_removal_modules_guts", "CB-PREDICATE-SPECIFIC-REMOVAL-MODULES-GUTS", 1, 0, false);
        declareFunction("cb_display_specific_use_generic", "CB-DISPLAY-SPECIFIC-USE-GENERIC", 2, 0, false);
        declareFunction("cb_specific_removal_module_predicates", "CB-SPECIFIC-REMOVAL-MODULE-PREDICATES", 0, 0, false);
        declareFunction("cb_specific_removal_modules", "CB-SPECIFIC-REMOVAL-MODULES", 1, 0, false);
        declareFunction("cb_specific_use_generic", "CB-SPECIFIC-USE-GENERIC", 1, 0, false);
        declareFunction("cb_total_specific_removal_module_count", "CB-TOTAL-SPECIFIC-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction("cb_specific_removal_module_count", "CB-SPECIFIC-REMOVAL-MODULE-COUNT", 1, 0, false);
        declareFunction("cb_predicate_specific_preference_modules", "CB-PREDICATE-SPECIFIC-PREFERENCE-MODULES", 1, 0, false);
        declareFunction("cb_link_predicate_specific_preference_modules", "CB-LINK-PREDICATE-SPECIFIC-PREFERENCE-MODULES", 1, 1, false);
        declareFunction("cb_predicate_specific_preference_modules_guts", "CB-PREDICATE-SPECIFIC-PREFERENCE-MODULES-GUTS", 1, 0, false);
        declareFunction("cb_all_specific_preference_module_predicates", "CB-ALL-SPECIFIC-PREFERENCE-MODULE-PREDICATES", 0, 0, false);
        declareFunction("cb_rewrite_modules", "CB-REWRITE-MODULES", 0, 1, false);
        declareFunction("cb_link_rewrite_modules", "CB-LINK-REWRITE-MODULES", 0, 1, false);
        declareFunction("cb_all_rewrite_modules", "CB-ALL-REWRITE-MODULES", 0, 0, false);
        declareFunction("cb_forward_modules", "CB-FORWARD-MODULES", 0, 1, false);
        declareFunction("cb_link_forward_modules", "CB-LINK-FORWARD-MODULES", 0, 1, false);
        declareFunction("cb_all_forward_modules", "CB-ALL-FORWARD-MODULES", 0, 0, false);
        declareFunction("cb_hl_storage_modules", "CB-HL-STORAGE-MODULES", 0, 1, false);
        declareFunction("cb_link_hl_storage_modules", "CB-LINK-HL-STORAGE-MODULES", 0, 1, false);
        declareFunction("cb_generic_hl_storage_modules", "CB-GENERIC-HL-STORAGE-MODULES", 0, 1, false);
        declareFunction("cb_link_generic_hl_storage_modules", "CB-LINK-GENERIC-HL-STORAGE-MODULES", 0, 1, false);
        declareFunction("cb_all_generic_hl_storage_modules", "CB-ALL-GENERIC-HL-STORAGE-MODULES", 0, 0, false);
        declareFunction("cb_predicate_specific_hl_storage_modules", "CB-PREDICATE-SPECIFIC-HL-STORAGE-MODULES", 1, 0, false);
        declareFunction("cb_link_predicate_specific_hl_storage_modules", "CB-LINK-PREDICATE-SPECIFIC-HL-STORAGE-MODULES", 1, 1, false);
        declareFunction("cb_predicate_specific_hl_storage_modules_guts", "CB-PREDICATE-SPECIFIC-HL-STORAGE-MODULES-GUTS", 1, 0, false);
        declareFunction("cb_specific_hl_storage_module_predicates", "CB-SPECIFIC-HL-STORAGE-MODULE-PREDICATES", 0, 0, false);
        declareFunction("cb_specific_hl_storage_modules", "CB-SPECIFIC-HL-STORAGE-MODULES", 1, 0, false);
        declareFunction("cb_total_specific_hl_storage_module_count", "CB-TOTAL-SPECIFIC-HL-STORAGE-MODULE-COUNT", 0, 0, false);
        declareFunction("cb_specific_hl_storage_module_count", "CB-SPECIFIC-HL-STORAGE-MODULE-COUNT", 1, 0, false);
        declareFunction("cb_display_hl_module_info", "CB-DISPLAY-HL-MODULE-INFO", 1, 0, false);
        declareFunction("cb_hl_module", "CB-HL-MODULE", 1, 0, false);
        declareFunction("cb_link_hl_module", "CB-LINK-HL-MODULE", 1, 1, false);
        declareFunction("cb_form_hl_module_method", "CB-FORM-HL-MODULE-METHOD", 1, 2, false);
        declareFunction("cb_hl_module_id", "CB-HL-MODULE-ID", 1, 0, false);
        declareFunction("cb_guess_hl_module", "CB-GUESS-HL-MODULE", 1, 0, false);
        declareFunction("cb_hl_module_guts", "CB-HL-MODULE-GUTS", 1, 0, false);
        declareFunction("cb_evaluatable_predicates", "CB-EVALUATABLE-PREDICATES", 0, 1, false);
        declareFunction("cb_link_evaluatable_predicates", "CB-LINK-EVALUATABLE-PREDICATES", 0, 1, false);
        declareFunction("cb_display_evaluatable_predicate", "CB-DISPLAY-EVALUATABLE-PREDICATE", 1, 0, false);
        declareFunction("cb_gather_evaluatable_predicates", "CB-GATHER-EVALUATABLE-PREDICATES", 0, 0, false);
        declareFunction("cb_evaluatable_predicate_count", "CB-EVALUATABLE-PREDICATE-COUNT", 0, 0, false);
        declareFunction("cb_evaluatable_functions", "CB-EVALUATABLE-FUNCTIONS", 0, 1, false);
        declareFunction("cb_link_evaluatable_functions", "CB-LINK-EVALUATABLE-FUNCTIONS", 0, 1, false);
        declareFunction("cb_display_evaluatable_function", "CB-DISPLAY-EVALUATABLE-FUNCTION", 1, 0, false);
        declareFunction("cb_function_result_type", "CB-FUNCTION-RESULT-TYPE", 1, 0, false);
        declareFunction("cb_gather_evaluatable_functions", "CB-GATHER-EVALUATABLE-FUNCTIONS", 0, 0, false);
        declareFunction("cb_evaluatable_function_count", "CB-EVALUATABLE-FUNCTION-COUNT", 0, 0, false);
        declareFunction("cb_relation_arg_signature", "CB-RELATION-ARG-SIGNATURE", 1, 0, false);
        declareFunction("cb_display_evaluation_defn_example", "CB-DISPLAY-EVALUATION-DEFN-EXAMPLE", 1, 0, false);
        declareFunction("evaluation_defn_example", "EVALUATION-DEFN-EXAMPLE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_hl_module_summary_file() {
        $cb_gather_evaluatable_predicates$ = defparameter("*CB-GATHER-EVALUATABLE-PREDICATES*", NIL);
        $cb_gather_evaluatable_functions$ = defparameter("*CB-GATHER-EVALUATABLE-FUNCTIONS*", NIL);
        return NIL;
    }

    public static SubLObject setup_cb_hl_module_summary_file() {
        Hashtables.sethash($CB_HL_MODULE_SUMMARY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str1$cb_hl_module_summary_html, NIL));
        html_macros.note_cgi_handler_function($sym39$CB_HL_MODULE_SUMMARY, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($HL_MODULE_INDEX, $sym43$CB_LINK_HL_MODULE_INDEX, TWO_INTEGER);
        cyc_navigator_internals.def_navigator_link($HL_MODULE_SUMMARY, $TEXT, $list46, $str42$cb_hl_module_summary, ZERO_INTEGER, $MAIN, $str6$HL_Module_Summary, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_macros.note_cgi_handler_function($sym48$CB_TRANSFORMATION_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($TRANSFORMATION_MODULES, $sym50$CB_LINK_TRANSFORMATION_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function($sym53$CB_GENERIC_REMOVAL_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($GENERIC_REMOVAL_MODULES, $sym55$CB_LINK_GENERIC_REMOVAL_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function($sym56$CB_GENERIC_PREFERENCE_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($GENERIC_PREFERENCE_MODULES, $sym58$CB_LINK_GENERIC_PREFERENCE_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function($sym60$CB_CONJUNCTIVE_REMOVAL_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($CONJUNCTIVE_REMOVAL_MODULES, $sym62$CB_LINK_CONJUNCTIVE_REMOVAL_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function($sym65$CB_PREDICATE_SPECIFIC_REMOVAL_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($PREDICATE_SPECIFIC_REMOVAL_MODULES, $sym69$CB_LINK_PREDICATE_SPECIFIC_REMOVAL_MODULES, TWO_INTEGER);
        html_macros.note_cgi_handler_function($sym74$CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($PREDICATE_SPECIFIC_PREFERENCE_MODULES, $sym77$CB_LINK_PREDICATE_SPECIFIC_PREFERENCE_MODULES, TWO_INTEGER);
        html_macros.note_cgi_handler_function($sym80$CB_REWRITE_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($REWRITE_MODULES, $sym82$CB_LINK_REWRITE_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function($sym83$CB_FORWARD_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($FORWARD_MODULES, $sym85$CB_LINK_FORWARD_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function($sym91$CB_HL_STORAGE_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($HL_STORAGE_MODULES, $sym93$CB_LINK_HL_STORAGE_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function($sym94$CB_GENERIC_HL_STORAGE_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($GENERIC_HL_STORAGE_MODULES, $sym96$CB_LINK_GENERIC_HL_STORAGE_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function($sym97$CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, $sym100$CB_LINK_PREDICATE_SPECIFIC_HL_STORAGE_MODULES, TWO_INTEGER);
        html_macros.note_cgi_handler_function($sym115$CB_HL_MODULE, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($HL_MODULE, $sym118$CB_LINK_HL_MODULE, TWO_INTEGER);
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), Symbols.symbol_function($sym119$CB_FORM_HL_MODULE_METHOD));
        html_macros.note_cgi_handler_function($sym126$CB_EVALUATABLE_PREDICATES, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($EVALUATABLE_PREDICATES, $sym128$CB_LINK_EVALUATABLE_PREDICATES, ONE_INTEGER);
        html_macros.note_cgi_handler_function($sym133$CB_EVALUATABLE_FUNCTIONS, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($EVALUATABLE_FUNCTIONS, $sym135$CB_LINK_EVALUATABLE_FUNCTIONS, ONE_INTEGER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_hl_module_summary_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_hl_module_summary_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_hl_module_summary_file();
    }

    static {
        me = new cb_hl_module_summary();
        $cb_gather_evaluatable_predicates$ = null;
        $cb_gather_evaluatable_functions$ = null;
        $CB_HL_MODULE_SUMMARY = makeKeyword("CB-HL-MODULE-SUMMARY");
        $str1$cb_hl_module_summary_html = makeString("cb-hl-module-summary.html");
        $str2$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str3$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $CB_CYC = makeKeyword("CB-CYC");
        $str6$HL_Module_Summary = makeString("HL Module Summary");
        $HL_MODULE_INDEX = makeKeyword("HL-MODULE-INDEX");
        $str8$Index_to_all_HL_modules = makeString("Index to all HL modules");
        $TRANSFORMATION_MODULES = makeKeyword("TRANSFORMATION-MODULES");
        $str10$Transformation_Modules = makeString("Transformation Modules");
        $str11$___S_total_ = makeString(" (~S total)");
        $GENERIC_REMOVAL_MODULES = makeKeyword("GENERIC-REMOVAL-MODULES");
        $str13$Generic_Removal_Modules = makeString("Generic Removal Modules");
        $str14$_SpecificRemovalModules = makeString("#SpecificRemovalModules");
        $str15$Specific_Removal_Modules = makeString("Specific Removal Modules");
        $GENERIC_PREFERENCE_MODULES = makeKeyword("GENERIC-PREFERENCE-MODULES");
        $str17$Generic_Preference_Modules = makeString("Generic Preference Modules");
        $str18$_SpecificPreferenceModules = makeString("#SpecificPreferenceModules");
        $str19$Specific_Preference_Modules = makeString("Specific Preference Modules");
        $CONJUNCTIVE_REMOVAL_MODULES = makeKeyword("CONJUNCTIVE-REMOVAL-MODULES");
        $str21$Conjunctive_Removal_Modules = makeString("Conjunctive Removal Modules");
        $REWRITE_MODULES = makeKeyword("REWRITE-MODULES");
        $str23$Rewrite_Modules = makeString("Rewrite Modules");
        $FORWARD_MODULES = makeKeyword("FORWARD-MODULES");
        $str25$Forward_Modules = makeString("Forward Modules");
        $HL_STORAGE_MODULES = makeKeyword("HL-STORAGE-MODULES");
        $str27$Storage_Modules = makeString("Storage Modules");
        $EVALUATABLE_PREDICATES = makeKeyword("EVALUATABLE-PREDICATES");
        $str29$Evaluatable_Predicates = makeString("Evaluatable Predicates");
        $EVALUATABLE_FUNCTIONS = makeKeyword("EVALUATABLE-FUNCTIONS");
        $str31$Evaluatable_Functions = makeString("Evaluatable Functions");
        $str32$SpecificRemovalModules = makeString("SpecificRemovalModules");
        $str33$Specific_Removal_Modules__ = makeString("Specific Removal Modules :");
        $PREDICATE_SPECIFIC_REMOVAL_MODULES = makeKeyword("PREDICATE-SPECIFIC-REMOVAL-MODULES");
        $str35$_literals = makeString(" literals");
        $str36$SpecificPreferenceModules = makeString("SpecificPreferenceModules");
        $str37$Specific_Preference_Modules__ = makeString("Specific Preference Modules :");
        $PREDICATE_SPECIFIC_PREFERENCE_MODULES = makeKeyword("PREDICATE-SPECIFIC-PREFERENCE-MODULES");
        $sym39$CB_HL_MODULE_SUMMARY = makeSymbol("CB-HL-MODULE-SUMMARY");
        $HTML_HANDLER = makeKeyword("HTML-HANDLER");
        $SELF = makeKeyword("SELF");
        $str42$cb_hl_module_summary = makeString("cb-hl-module-summary");
        $sym43$CB_LINK_HL_MODULE_INDEX = makeSymbol("CB-LINK-HL-MODULE-INDEX");
        $HL_MODULE_SUMMARY = makeKeyword("HL-MODULE-SUMMARY");
        $TEXT = makeKeyword("TEXT");
        $list46 = list(makeKeyword("INFERENCE"));
        $MAIN = makeKeyword("MAIN");
        $sym48$CB_TRANSFORMATION_MODULES = makeSymbol("CB-TRANSFORMATION-MODULES");
        $str49$cb_transformation_modules = makeString("cb-transformation-modules");
        $sym50$CB_LINK_TRANSFORMATION_MODULES = makeSymbol("CB-LINK-TRANSFORMATION-MODULES");
        $sym51$TERM__ = makeSymbol("TERM-<");
        $sym52$HL_MODULE_NAME = makeSymbol("HL-MODULE-NAME");
        $sym53$CB_GENERIC_REMOVAL_MODULES = makeSymbol("CB-GENERIC-REMOVAL-MODULES");
        $str54$cb_generic_removal_modules = makeString("cb-generic-removal-modules");
        $sym55$CB_LINK_GENERIC_REMOVAL_MODULES = makeSymbol("CB-LINK-GENERIC-REMOVAL-MODULES");
        $sym56$CB_GENERIC_PREFERENCE_MODULES = makeSymbol("CB-GENERIC-PREFERENCE-MODULES");
        $str57$cb_generic_preference_modules = makeString("cb-generic-preference-modules");
        $sym58$CB_LINK_GENERIC_PREFERENCE_MODULES = makeSymbol("CB-LINK-GENERIC-PREFERENCE-MODULES");
        $sym59$PREFERENCE_MODULE_NAME = makeSymbol("PREFERENCE-MODULE-NAME");
        $sym60$CB_CONJUNCTIVE_REMOVAL_MODULES = makeSymbol("CB-CONJUNCTIVE-REMOVAL-MODULES");
        $str61$cb_conjunctive_removal_modules = makeString("cb-conjunctive-removal-modules");
        $sym62$CB_LINK_CONJUNCTIVE_REMOVAL_MODULES = makeSymbol("CB-LINK-CONJUNCTIVE-REMOVAL-MODULES");
        $list63 = list(makeSymbol("FORT-ID"));
        $str64$_S_did_not_specify_a_predicate_ = makeString("~S did not specify a predicate.");
        $sym65$CB_PREDICATE_SPECIFIC_REMOVAL_MODULES = makeSymbol("CB-PREDICATE-SPECIFIC-REMOVAL-MODULES");
        $sym66$FORT_P = makeSymbol("FORT-P");
        $str67$Predicate_Specific_Removal_Module = makeString("Predicate Specific Removal Modules");
        $str68$cb_predicate_specific_removal_mod = makeString("cb-predicate-specific-removal-modules&~A");
        $sym69$CB_LINK_PREDICATE_SPECIFIC_REMOVAL_MODULES = makeSymbol("CB-LINK-PREDICATE-SPECIFIC-REMOVAL-MODULES");
        $str70$_removal_modules = makeString(" removal modules");
        $str71$The_following_generic_modules_are = makeString("The following generic modules are also used for ");
        $str72$_literals__ = makeString(" literals :");
        $str73$__ = makeString(", ");
        $sym74$CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES = makeSymbol("CB-PREDICATE-SPECIFIC-PREFERENCE-MODULES");
        $str75$Predicate_Specific_Preference_Mod = makeString("Predicate Specific Preference Modules");
        $str76$cb_predicate_specific_preference_ = makeString("cb-predicate-specific-preference-modules&~A");
        $sym77$CB_LINK_PREDICATE_SPECIFIC_PREFERENCE_MODULES = makeSymbol("CB-LINK-PREDICATE-SPECIFIC-PREFERENCE-MODULES");
        $str78$Predicate_Specific_Storage_Module = makeString("Predicate Specific Storage Modules");
        $str79$_preference_modules = makeString(" preference modules");
        $sym80$CB_REWRITE_MODULES = makeSymbol("CB-REWRITE-MODULES");
        $str81$cb_rewrite_modules = makeString("cb-rewrite-modules");
        $sym82$CB_LINK_REWRITE_MODULES = makeSymbol("CB-LINK-REWRITE-MODULES");
        $sym83$CB_FORWARD_MODULES = makeSymbol("CB-FORWARD-MODULES");
        $str84$cb_forward_modules = makeString("cb-forward-modules");
        $sym85$CB_LINK_FORWARD_MODULES = makeSymbol("CB-LINK-FORWARD-MODULES");
        $GENERIC_HL_STORAGE_MODULES = makeKeyword("GENERIC-HL-STORAGE-MODULES");
        $str87$Generic_Storage_Modules = makeString("Generic Storage Modules");
        $str88$Predicate_Specific_Storage_Module = makeString("Predicate Specific Storage Modules :");
        $PREDICATE_SPECIFIC_HL_STORAGE_MODULES = makeKeyword("PREDICATE-SPECIFIC-HL-STORAGE-MODULES");
        $str90$_modules = makeString(" modules");
        $sym91$CB_HL_STORAGE_MODULES = makeSymbol("CB-HL-STORAGE-MODULES");
        $str92$cb_hl_storage_modules = makeString("cb-hl-storage-modules");
        $sym93$CB_LINK_HL_STORAGE_MODULES = makeSymbol("CB-LINK-HL-STORAGE-MODULES");
        $sym94$CB_GENERIC_HL_STORAGE_MODULES = makeSymbol("CB-GENERIC-HL-STORAGE-MODULES");
        $str95$cb_generic_hl_storage_modules = makeString("cb-generic-hl-storage-modules");
        $sym96$CB_LINK_GENERIC_HL_STORAGE_MODULES = makeSymbol("CB-LINK-GENERIC-HL-STORAGE-MODULES");
        $sym97$CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES = makeSymbol("CB-PREDICATE-SPECIFIC-HL-STORAGE-MODULES");
        $str98$Predicate_Specific_Hl_Storage_Mod = makeString("Predicate Specific Hl-Storage Modules");
        $str99$cb_predicate_specific_hl_storage_ = makeString("cb-predicate-specific-hl-storage-modules&~A");
        $sym100$CB_LINK_PREDICATE_SPECIFIC_HL_STORAGE_MODULES = makeSymbol("CB-LINK-PREDICATE-SPECIFIC-HL-STORAGE-MODULES");
        $str101$_storage_modules = makeString(" storage modules");
        $str102$module_ = makeString("module ");
        $HL_MODULE = makeKeyword("HL-MODULE");
        $str104$ = makeString("");
        $str105$documentation__ = makeString("documentation :");
        $str106$no_documentation = makeString("no documentation");
        $str107$example__ = makeString("example :");
        $str108$no_example = makeString("no example");
        $ALL = makeKeyword("ALL");
        $str110$Module_supplants__ = makeString("Module supplants :");
        $str111$_all_other_modules = makeString(" all other modules");
        $str112$unknown_supplants_type____S = makeString("unknown supplants type : ~S");
        $list113 = list(makeSymbol("HL-MODULE-ID"));
        $str114$The_inference_module__A_is_no_lon = makeString("The inference module ~A is no longer available.");
        $sym115$CB_HL_MODULE = makeSymbol("CB-HL-MODULE");
        $sym116$HL_MODULE_P = makeSymbol("HL-MODULE-P");
        $str117$cb_hl_module__A = makeString("cb-hl-module&~A");
        $sym118$CB_LINK_HL_MODULE = makeSymbol("CB-LINK-HL-MODULE");
        $sym119$CB_FORM_HL_MODULE_METHOD = makeSymbol("CB-FORM-HL-MODULE-METHOD");
        $str120$HL_Module__A = makeString("HL Module ~A");
        $str121$HL_Module = makeString("HL Module");
        $LEFT = makeKeyword("LEFT");
        $TOP = makeKeyword("TOP");
        $str124$Property = makeString("Property");
        $str125$Value = makeString("Value");
        $sym126$CB_EVALUATABLE_PREDICATES = makeSymbol("CB-EVALUATABLE-PREDICATES");
        $str127$cb_evaluatable_predicates = makeString("cb-evaluatable-predicates");
        $sym128$CB_LINK_EVALUATABLE_PREDICATES = makeSymbol("CB-LINK-EVALUATABLE-PREDICATES");
        $str129$predicate_ = makeString("predicate ");
        $list130 = list(makeConstSym(("and")), list(makeConstSym(("knownSentence")), list(makeConstSym(("isa")), makeSymbol("?PRED"), makeConstSym(("EvaluatablePredicate")))),
                list(makeConstSym(("or")),
                        list(makeConstSym(("and")), list(makeConstSym(("assertedSentence")), list(makeConstSym(("evaluationDefn")), makeSymbol("?PRED"), makeSymbol("?DEFN"))),
                                list(makeConstSym(("trueSubL")), list(makeConstSym(("ExpandSubLFn")), list(makeSymbol("?DEFN")), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(makeSymbol("QUOTE"), makeSymbol("?DEFN"))))))),
                        list(makeConstSym(("and")), list(makeConstSym(("assertedSentence")), list(makeConstSym(("evaluationDefn")), makeSymbol("?PRED"), makeSymbol("?DEFN"))),
                                list(makeConstSym(("trueSubL")), list(makeConstSym(("SubLQuoteFn")), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(makeSymbol("QUOTE"), makeSymbol("?DEFN"))))))),
                        list(makeConstSym(("assertedPredicateArg")), makeSymbol("?PRED"), ONE_INTEGER, makeConstSym(("expansion")))));
        $$EverythingPSC = makeConstSym(("EverythingPSC"));
        $list132 = list(new SubLObject[] { makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-UNION"), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE"),
                makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?PRED")) });
        $sym133$CB_EVALUATABLE_FUNCTIONS = makeSymbol("CB-EVALUATABLE-FUNCTIONS");
        $str134$cb_evaluatable_functions = makeString("cb-evaluatable-functions");
        $sym135$CB_LINK_EVALUATABLE_FUNCTIONS = makeSymbol("CB-LINK-EVALUATABLE-FUNCTIONS");
        $str136$function_ = makeString("function ");
        $str137$____ = makeString(" -> ");
        $sym138$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $$Thing = makeConstSym(("Thing"));
        $list140 = list(makeConstSym(("and")), list(makeConstSym(("knownSentence")), list(makeConstSym(("isa")), makeSymbol("?FUNC"), makeConstSym(("EvaluatableFunction")))),
                list(makeConstSym(("or")),
                        list(makeConstSym(("and")), list(makeConstSym(("assertedSentence")), list(makeConstSym(("evaluationDefn")), makeSymbol("?FUNC"), makeSymbol("?DEFN"))),
                                list(makeConstSym(("trueSubL")), list(makeConstSym(("ExpandSubLFn")), list(makeSymbol("?DEFN")), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(makeSymbol("QUOTE"), makeSymbol("?DEFN"))))))),
                        list(makeConstSym(("and")), list(makeConstSym(("assertedSentence")), list(makeConstSym(("evaluationDefn")), makeSymbol("?FUNC"), makeSymbol("?DEFN"))),
                                list(makeConstSym(("trueSubL")), list(makeConstSym(("SubLQuoteFn")), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(makeSymbol("QUOTE"), makeSymbol("?DEFN"))))))),
                        list(makeConstSym(("assertedPredicateArg")), makeSymbol("?FUNC"), ONE_INTEGER, makeConstSym(("expansion")))));
        $list141 = list(new SubLObject[] { makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-UNION"), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE"),
                makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?FUNC")) });
        $str142$___ = makeString(" : ");
        $str143$_ = makeString("(");
        $str144$______ = makeString(" ... )");
        $str145$_ = makeString(")");
        $str146$___ = makeString(" ? ");
        $str147$example___ = makeString("example : ");
        $EXAMPLE = makeKeyword("EXAMPLE");
    }
}
/*
 *
 * Total time: 1130 ms
 *
 */